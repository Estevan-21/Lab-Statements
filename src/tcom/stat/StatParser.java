package tcom.stat;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.antlr.v4.runtime.*;

import static tcom.stat.StatLexer.*;

public class StatParser extends BasicParser{

	public  void analizar(String archName) throws ParseException {
		String eol = System.getProperty("line.separator");
		InputStream is = StatParser.class.getResourceAsStream("/"+archName);
		try {
			
			ANTLRInputStream input = new ANTLRInputStream(is);
			lexer = new StatLexer(input);
			parse();	
			
		} catch (UnsupportedEncodingException e) {
			throw new ParseException("UnsupportedEncodingException");
		} catch (IOException e) {
			throw new ParseException("Complicacion de IO:"+e.getMessage());
		} catch (LexerNoViableAltException e) {
			throw new ParseException("Error Lexico"+eol);
		} catch (RecognitionException e) {
			throw new ParseException("RecognitionException");
			//Caracter invalido en la entrada
		} catch (ParseException e) {
			StringBuilder sb = new StringBuilder();
			sb.append(e.getMessage());
			sb.append(eol);
			sb.append(eol);
			
			throw new ParseException(sb.toString());
		} 

	}

	public void parse() throws ParseException{
		// Modificar segun su gramatica
		sigToken();
		stat();
		expect(EOF);
	}
	
	public void stat() throws ParseException{
		while (token.getType()!=EOF){			
			switch (token.getType()) {
				case VARA:
				case VARB:
				case STOP:
					sigToken();
					break;
				case IF:
					sigToken();
					bool();					
					expect(THEN);	
					stat();
					if (token.getType()==ELSE) {
						stat();
					}	
					break;
				case WHILE:
					sigToken();
					bool();
					expect(DO);
					stat();					
					break;	
				default: 
					throw new ParseException("\n"+"Error Sintactico, se esperaba 'if' o 'while' o 'stop' o 'a' o 'b' y se recibió "+ token.getText());
			}							
			sigToken();
			}
		}	
	
	public void bool() throws ParseException{
		switch (token.getType()) {
		case VARA:
		case VARB:
			sigToken();
			comp();			
			var();
			break;
		case NOT:
			sigToken();
			var();
			break;
		case LPAR:
			sigToken();
			bool();
			expect(RPAR);
			break;
		default: throw new ParseException("\n"+"Error Sintactico, se esperaba 'a' o 'b' o 'not' o '(' y se recibió "+ token.getText());
		}			
	}
	
	public void comp() throws ParseException{
		switch (token.getType()) {
		case LT:
		case GT:
			sigToken();
			break;
		default: throw new ParseException("\n"+"Error Sintactico, se esperaba '<' o '>' y se recibió "+ token.getText());
		}
			
			
	}
	
	public void var() throws ParseException{
		switch (token.getType()) {
		case VARA:
		case VARB:
			sigToken();
			break;
		default: throw new ParseException("\n"+"Error Sintactico, se esperaba 'a' o 'b' y se recibió "+ token.getText());
		}
	}
}
