package tcom.stat;
import static tcom.stat.StatLexer.*;
import org.antlr.v4.runtime.Token;
public class BasicParser {
	protected Token token; //Token vigente en el proceso
	protected StatLexer lexer; //Analizador lexico
	
	protected void sigToken() {
		token = lexer.nextToken();
	}
	
	/**
	 * Verifica que su unico argumento coincide con el tipo del token vigente.
	 * 
	 * @param tokType
	 *            Tipo esperado del token vigente
	 * @throws ParseException
	 */
	protected void expect(int tokType) throws ParseException{
		if(token.getType()!=tokType){
			throw new ParseException(getReadableLocation(token)+
					": Se esperaba "+tokenReadableName(tokType)+" y aparece "+token.getText());
		}
		token=lexer.nextToken();
	}
	
	/**
	 * Produce una version legible de la ubicacion del token
	 * @param tok el token
	 * @return Ubicacion en formato [linea,columna]
	 */
	public String getReadableLocation(Token tok){
		StringBuffer sbf=new StringBuffer();
		
		sbf.append('[');
		sbf.append(tok.getLine());
		sbf.append(',');
		sbf.append(tok.getCharPositionInLine());
		sbf.append(']');
		return sbf.toString();
	}

	/**
	 * Produce un nombre legible para un token
	 * @param tokType tipo del token
	 * @return Una version legible del token
	 */
	protected String tokenReadableName(int tokType) {
		String resp = null;
		switch (tokType) {
            
        case LPAR:
        	resp ="parentesis izquierdo";
        	break;
        	
        case RPAR:
        	resp = "parentesis derecho";
        	break;
        	
        case LT:
        	resp = "menor que";
        	break;
        	
        case GT:
        	resp = "mayor que";
        	break;
        	
        case IF:
        	resp = "if";
        	break;
        	
        case THEN:
        	resp = "then";
        	break;
        	
        case EOF:
        	resp = "EOF";
        	break;
        	
        case ELSE:
        	resp = "else";
        	break;
        	
        case WHILE:
        	resp = "while";
        	break;
        	
        case DO:
        	resp = "do";
        	break;

        case NOT:
        	resp = "not";
        	break;
        	
        case STOP:
        	resp = "stop";
        	break;
        	
        case VARA:
        	resp = "a";
        	break;
        	
        case VARB:
        	resp = "b";
        	break;

		default:
			break;
		}
		return resp;
	}

}
