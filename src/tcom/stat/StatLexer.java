// Generated from StatLexer.g by ANTLR 4.6

package tcom.stat;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }
	public void recover(LexerNoViableAltException e){
		throw e;
	}
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, LT=3, GT=4, NOT=5, IF=6, THEN=7, ELSE=8, WHILE=9, DO=10, 
		STOP=11, VARA=12, VARB=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LPAR", "RPAR", "LT", "GT", "NOT", "IF", "THEN", "ELSE", "WHILE", "DO", 
		"STOP", "VARA", "VARB", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'<'", "'>'", "'not'", "'if'", "'then'", "'else'", 
		"'while'", "'do'", "'stop'", "'a'", "'b'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LPAR", "RPAR", "LT", "GT", "NOT", "IF", "THEN", "ELSE", "WHILE", 
		"DO", "STOP", "VARA", "VARB", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public StatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StatLexer.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20Q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\6\17L\n\17\r\17\16\17M\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\3\5\2\13\f\17"+
		"\17\"\"Q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2"+
		"\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r+\3\2\2\2\17.\3\2\2\2\21\63\3\2"+
		"\2\2\238\3\2\2\2\25>\3\2\2\2\27A\3\2\2\2\31F\3\2\2\2\33H\3\2\2\2\35K\3"+
		"\2\2\2\37 \7*\2\2 \4\3\2\2\2!\"\7+\2\2\"\6\3\2\2\2#$\7>\2\2$\b\3\2\2\2"+
		"%&\7@\2\2&\n\3\2\2\2\'(\7p\2\2()\7q\2\2)*\7v\2\2*\f\3\2\2\2+,\7k\2\2,"+
		"-\7h\2\2-\16\3\2\2\2./\7v\2\2/\60\7j\2\2\60\61\7g\2\2\61\62\7p\2\2\62"+
		"\20\3\2\2\2\63\64\7g\2\2\64\65\7n\2\2\65\66\7u\2\2\66\67\7g\2\2\67\22"+
		"\3\2\2\289\7y\2\29:\7j\2\2:;\7k\2\2;<\7n\2\2<=\7g\2\2=\24\3\2\2\2>?\7"+
		"f\2\2?@\7q\2\2@\26\3\2\2\2AB\7u\2\2BC\7v\2\2CD\7q\2\2DE\7r\2\2E\30\3\2"+
		"\2\2FG\7c\2\2G\32\3\2\2\2HI\7d\2\2I\34\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\b\17\2\2P\36\3\2\2\2\4\2M\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}