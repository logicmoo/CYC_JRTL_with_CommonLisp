//
// For LarKC
//
package com.cyc.tool.subl.parser;

import java.io.InputStream;
import java.io.Reader;
import java.util.Vector;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLQuote;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLParser implements SubLParserConstants {
	public SubLParser(InputStream stream) {
		currentPackage = "SUBLISP";
		jj_la1 = new int[26];
		jj_la1_0 = new int[] { 1845520362, 33554432, 18368, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432,
				18368, 1845501994, 33554432, 2048, 33554432, 33554432, 1845501960, 0, 201326592, 1811939328, 8, 8, 8,
				8200, 0, 33554432, 33554432 };
		jj_la1_1 = new int[] { 19462, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19462, 0, 0, 0, 0, 19462, 18432, 0, 0, 0, 0, 0, 18432,
				6, 0, 0 };
		jj_expentries = new Vector<int[]>();
		jj_kind = -1;
		jj_input_stream = new ASCII_CharStream(stream, 1, 1);
		token_source = new SubLParserTokenManager(jj_input_stream);
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 26; ++i)
			jj_la1[i] = -1;
	}

	public SubLParser(Reader stream) {
		currentPackage = "SUBLISP";
		jj_la1 = new int[26];
		jj_la1_0 = new int[] { 1845520362, 33554432, 18368, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432,
				18368, 1845501994, 33554432, 2048, 33554432, 33554432, 1845501960, 0, 201326592, 1811939328, 8, 8, 8,
				8200, 0, 33554432, 33554432 };
		jj_la1_1 = new int[] { 19462, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19462, 0, 0, 0, 0, 19462, 18432, 0, 0, 0, 0, 0, 18432,
				6, 0, 0 };
		jj_expentries = new Vector<int[]>();
		jj_kind = -1;
		jj_input_stream = new ASCII_CharStream(stream, 1, 1);
		token_source = new SubLParserTokenManager(jj_input_stream);
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 26; ++i)
			jj_la1[i] = -1;
	}

	public SubLParser(SubLParserTokenManager tm) {
		currentPackage = "SUBLISP";
		jj_la1 = new int[26];
		jj_la1_0 = new int[] { 1845520362, 33554432, 18368, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432,
				18368, 1845501994, 33554432, 2048, 33554432, 33554432, 1845501960, 0, 201326592, 1811939328, 8, 8, 8,
				8200, 0, 33554432, 33554432 };
		jj_la1_1 = new int[] { 19462, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19462, 0, 0, 0, 0, 19462, 18432, 0, 0, 0, 0, 0, 18432,
				6, 0, 0 };
		jj_expentries = new Vector<int[]>();
		jj_kind = -1;
		token_source = tm;
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 26; ++i)
			jj_la1[i] = -1;
	}

	public static void main(String[] args) {
		SubLParser parser = new SubLParser(System.in);
		try {
			parser.termList(true, true);
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private String currentPackage;
	public SubLParserTokenManager token_source;
	ASCII_CharStream jj_input_stream;
	public Token token;
	public Token jj_nt;
	private int jj_ntk;
	private int jj_gen;
	private int[] jj_la1;
	private int[] jj_la1_0;
	private int[] jj_la1_1;
	private Vector<int[]> jj_expentries;
	private int[] jj_expentry;
	private int jj_kind;

	private Token jj_consume_token(int kind) throws ParseException {
		Token oldToken;
		if ((oldToken = token).next != null)
			token = token.next;
		else {
			Token token = this.token;
			Token nextToken = token_source.getNextToken();
			token.next = nextToken;
			this.token = nextToken;
		}
		jj_ntk = -1;
		if (token.kind == kind) {
			++jj_gen;
			return token;
		}
		token = oldToken;
		jj_kind = kind;
		throw generateParseException();
	}

	private int jj_ntk() {
		Token next = token.next;
		jj_nt = next;
		if (next == null) {
			Token token = this.token;
			Token nextToken = token_source.getNextToken();
			token.next = nextToken;
			return jj_ntk = nextToken.kind;
		}
		return jj_ntk = jj_nt.kind;
	}

	public SubLObject atom(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		eatWhiteSpace(eatInitialWS);
		SubLObject atom = null;
		switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
		case 25:
		case 33:
		case 34:
			atom = character(false, false);
			break;
		case 42:
			atom = string(false, false);
			break;
		case 26:
		case 27:
		case 29:
		case 30:
			atom = number(false, false);
			break;
		case 3:
		case 13:
		case 43:
		case 46:
			atom = symbol(false, false);
			break;
		default:
			jj_la1[15] = jj_gen;
			jj_consume_token(-1);
			throw new ParseException();
		}
		eof(requireEOF);
		return atom;
	}

	public SubLCharacter character(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLCharacter val = null;
		Token t = null;
		eatWhiteSpace(eatInitialWS);
		switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
		case 33:
			t = jj_consume_token(33);
			val = SubLObjectFactory.makeChar(t.image);
			break;
		case 34:
			t = jj_consume_token(34);
			val = SubLObjectFactory.makeChar(t.image);
			break;
		default:
			jj_la1[23] = jj_gen;
			jj_consume_token(-1);
			throw new ParseException();
		}
		eof(requireEOF);
		return val;
	}

	public void disable_tracing() {
	}

	public void eatWhiteSpace(boolean shouldEatWS) throws ParseException {
		if (!shouldEatWS)
			return;
		while (true)
			switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
			case 25:
				jj_consume_token(25);
				continue;
			default:
				jj_la1[24] = jj_gen;
			}
	}

	public void enable_tracing() {
	}

	public void eof(boolean requireEOF) throws ParseException {
		if (!requireEOF)
			return;
		while (true)
			switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
			case 25:
				jj_consume_token(25);
				continue;
			default:
				jj_la1[25] = jj_gen;
				jj_consume_token(0);
			}
	}

	public SubLList form(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLList result = null;
		SubLList contents = null;
		SubLObject dottedItem = null;
		eatWhiteSpace(eatInitialWS);
		jj_consume_token(1);
		contents = termList(false, true);
		Label_0155: {
			switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
			case 11:
				jj_consume_token(11);
				while (true) {
					jj_consume_token(25);
					switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
					case 25:
						continue;
					default:
						jj_la1[11] = jj_gen;
						dottedItem = term(false, false);
						break Label_0155;
					}
				}
				// break;
			default:
				jj_la1[12] = jj_gen;
				break;
			}
		}
		while (true)
			switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
			case 25:
				jj_consume_token(25);
				continue;
			default:
				jj_la1[13] = jj_gen;
				jj_consume_token(2);
				result = contents;
				eof(requireEOF);
				if (contents != null && dottedItem != null)
					contents.setDottedElement(dottedItem);
				if (result.size() == 0)
					return SubLNil.NIL;
				return result;
			}
	}

	public ParseException generateParseException() {
		jj_expentries.removeAllElements();
		boolean[] la1tokens = new boolean[47];
		for (int i = 0; i < 47; ++i)
			la1tokens[i] = false;
		if (jj_kind >= 0) {
			la1tokens[jj_kind] = true;
			jj_kind = -1;
		}
		for (int i = 0; i < 26; ++i)
			if (jj_la1[i] == jj_gen)
				for (int j = 0; j < 32; ++j) {
					if ((jj_la1_0[i] & 1 << j) != 0x0)
						la1tokens[j] = true;
					if ((jj_la1_1[i] & 1 << j) != 0x0)
						la1tokens[32 + j] = true;
				}
		for (int i = 0; i < 47; ++i)
			if (la1tokens[i]) {
				(jj_expentry = new int[1])[0] = i;
				jj_expentries.addElement(jj_expentry);
			}
		int[][] exptokseq = new int[jj_expentries.size()][];
		for (int k = 0; k < jj_expentries.size(); ++k)
			exptokseq[k] = jj_expentries.elementAt(k);
		return new ParseException(token, exptokseq, SubLParserConstants.tokenImage);
	}

	public Token getNextToken() {
		if (token.next != null)
			token = token.next;
		else {
			Token token = this.token;
			Token nextToken = token_source.getNextToken();
			token.next = nextToken;
			this.token = nextToken;
		}
		jj_ntk = -1;
		++jj_gen;
		return token;
	}

	public Token getToken(int index) {
		Token t = token;
		for (int i = 0; i < index; ++i)
			if (t.next != null)
				t = t.next;
			else {
				Token token = t;
				Token nextToken = token_source.getNextToken();
				token.next = nextToken;
				t = nextToken;
			}
		return t;
	}

	public SubLList manageQuote(SubLQuote quoteType, SubLList currentQuotes) throws ParseException {
		currentQuotes = currentQuotes.push(quoteType);
		return currentQuotes;
	}

	public SubLNumber number(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLNumber val = null;
		Token t = null;
		String baseOrFPStr = "";
		eatWhiteSpace(eatInitialWS);
		switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
		case 29:
			t = jj_consume_token(29);
			val = SubLObjectFactory.makeIntegralNumber(t.image.startsWith("+") ? t.image.substring(1) : t.image, 10);
			break;
		case 30:
			t = jj_consume_token(30);
			val = SubLObjectFactory.makeBasedIntegralNumber(t.image);
			break;
		case 26:
		case 27:
			switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
			case 26:
				t = jj_consume_token(26);
				break;
			case 27:
				t = jj_consume_token(27);
				break;
			default:
				jj_la1[17] = jj_gen;
				jj_consume_token(-1);
				throw new ParseException();
			}
			baseOrFPStr = t.image.toLowerCase();
			val = SubLObjectFactory.makeDouble(t.image.toLowerCase().replaceAll("\\p{Alpha}", "e"));
			break;
		default:
			jj_la1[18] = jj_gen;
			jj_consume_token(-1);
			throw new ParseException();
		}
		eof(requireEOF);
		return val;
	}

	public SubLObject processQuotes(SubLObject quotedObject, SubLList quoteList) throws ParseException {
		SubLList result = null;
		SubLList currentQuote = SubLNil.NIL;
		SubLQuote theQuote = null;
		if (quoteList == SubLNil.NIL)
			return quotedObject;
		if (quoteList.size() != 1) {
			result = SubLObjectFactory.makeCons(quotedObject, SubLNil.NIL);
			for (int i = 0, size = quoteList.size(); i < size; ++i) {
				theQuote = (SubLQuote) quoteList.get(i);
				result = SubLObjectFactory.makeCons(result, result);
			}
			return result;
		}
		theQuote = (SubLQuote) quoteList.first();
		if (theQuote == SubLQuote.FUNCTION_QUOTE_SYMBOL && !quotedObject.isSymbol())
			throw new ParseException("Got invalid quote: " + theQuote + " for term: " + quotedObject);
		quoteList = quoteList.push(quotedObject);
		quoteList = quoteList.reverse(true).toList();
		return quoteList;
	}

	public void ReInit(InputStream stream) {
		jj_input_stream.ReInit(stream, 1, 1);
		token_source.ReInit(jj_input_stream);
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 26; ++i)
			jj_la1[i] = -1;
	}

	public void ReInit(Reader stream) {
		jj_input_stream.ReInit(stream, 1, 1);
		token_source.ReInit(jj_input_stream);
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 26; ++i)
			jj_la1[i] = -1;
	}

	public void ReInit(SubLParserTokenManager tm) {
		token_source = tm;
		token = new Token();
		jj_ntk = -1;
		jj_gen = 0;
		for (int i = 0; i < 26; ++i)
			jj_la1[i] = -1;
	}

	public SubLString string(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		Token t = null;
		eatWhiteSpace(eatInitialWS);
		t = jj_consume_token(42);
		eof(requireEOF);
		return SubLObjectFactory.makeString(t.image.substring(1, t.image.length() - 1));
	}

	public SubLSymbol symbol(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		Token t = null;
		String symbolOrPackageName = SubLPackage.KEYWORD_PACKAGE.getName();
		String symName = "";
		boolean isInterned = true;
		SubLSymbol symbol = null;
		eatWhiteSpace(eatInitialWS);
		Label_0336: {
			switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
			case 13:
				jj_consume_token(13);
				symbolOrPackageName = symbolName();
				isInterned = false;
				break;
			case 3:
				jj_consume_token(3);
				switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
				case 3:
					jj_consume_token(3);
					break;
				default:
					jj_la1[19] = jj_gen;
					break;
				}
				symName = symbolName();
				break;
			case 43:
			case 46:
				symbolOrPackageName = symbolName();
				switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
				case 3:
					jj_consume_token(3);
					switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
					case 3:
						jj_consume_token(3);
						break;
					default:
						jj_la1[20] = jj_gen;
						break;
					}
					symName = symbolName();
					break Label_0336;
				default:
					jj_la1[21] = jj_gen;
					break Label_0336;
				}
				// break;
			default:
				jj_la1[22] = jj_gen;
				jj_consume_token(-1);
				throw new ParseException();
			}
		}
		if (symName == null || "".equals(symName))
			symbol = SubLObjectFactory.makeSymbol(symbolOrPackageName,
					isInterned ? SubLPackage.getCurrentPackage() : null);
		else
			symbol = SubLObjectFactory.makeSymbol(symName, symbolOrPackageName);
		eof(requireEOF);
		return symbol;
	}

	public String symbolName() throws ParseException {
		String val = null;
		Token t = null;
		switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
		case 46:
			t = jj_consume_token(46);
			val = t.image;
			break;
		case 43:
			t = jj_consume_token(43);
			val = t.image;
			break;
		default:
			jj_la1[16] = jj_gen;
			jj_consume_token(-1);
			throw new ParseException();
		}
		if (val == null || val.equals(""))
			return currentPackage;
		return val;
	}

	public SubLObject term(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLObject curTerm = null;
		SubLList currentQuotes = SubLNil.NIL;
		boolean doReadTimeEvaluation = false;
		eatWhiteSpace(eatInitialWS);
		Label_0015: while (true)
			while (true)
				switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 14:
					switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
					case 7:
						jj_consume_token(7);
						while (true)
							switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
							case 25:
								jj_consume_token(25);
								continue;
							default:
								jj_la1[3] = jj_gen;
								currentQuotes = manageQuote(SubLQuote.QUOTE_SYMBOL, currentQuotes);
								continue Label_0015;
							}
						// break;
					case 8:
						jj_consume_token(8);
						while (true)
							switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
							case 25:
								jj_consume_token(25);
								continue;
							default:
								jj_la1[4] = jj_gen;
								currentQuotes = manageQuote(SubLQuote.BACK_QUOTE_SYMBOL, currentQuotes);
								continue Label_0015;
							}
						// break;
					case 6:
						jj_consume_token(6);
						while (true)
							switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
							case 25:
								jj_consume_token(25);
								continue;
							default:
								jj_la1[5] = jj_gen;
								currentQuotes = manageQuote(SubLQuote.FUNCTION_QUOTE_SYMBOL, currentQuotes);
								continue Label_0015;
							}
						// break;
					case 9:
						jj_consume_token(9);
						while (true)
							switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
							case 25:
								jj_consume_token(25);
								continue;
							default:
								jj_la1[6] = jj_gen;
								currentQuotes = manageQuote(SubLQuote.SPLICING_UNQUOTE_SYMBOL, currentQuotes);
								continue Label_0015;
							}
						// break;
					case 10:
						jj_consume_token(10);
						while (true)
							switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
							case 25:
								jj_consume_token(25);
								continue;
							default:
								jj_la1[7] = jj_gen;
								currentQuotes = manageQuote(SubLQuote.UNQUOTE_SYMBOL, currentQuotes);
								continue Label_0015;
							}
						// break;
					case 14:
						jj_consume_token(14);
						while (true)
							switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
							case 25:
								jj_consume_token(25);
								continue;
							default:
								jj_la1[8] = jj_gen;
								doReadTimeEvaluation = true;
								continue Label_0015;
							}
						// break;
					default:
						jj_la1[9] = jj_gen;
						jj_consume_token(-1);
						throw new ParseException();
					}
					// break;
				default: {
					jj_la1[2] = jj_gen;
					switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
					case 1:
					case 25:
						curTerm = form(false, false);
						break;
					case 5:
						curTerm = vector(false, false);
						break;
					case 3:
					case 13:
					case 26:
					case 27:
					case 29:
					case 30:
					case 33:
					case 34:
					case 42:
					case 43:
					case 46:
						curTerm = atom(false, false);
						break;
					default:
						jj_la1[10] = jj_gen;
						jj_consume_token(-1);
						throw new ParseException();
					}
					eof(requireEOF);
					SubLObject result = processQuotes(curTerm, currentQuotes);
					return doReadTimeEvaluation ? result.eval(SubLEnvironment.currentEnvironment()) : result;
				}
				}
	}

	public SubLList termList(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLList val = SubLNil.NIL;
		SubLObject curTerm = null;
		boolean shouldFeaturizeOut = false;
		eatWhiteSpace(eatInitialWS);
		Label_0015: while (true)
			while (true)
				switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
				case 1:
				case 3:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
				case 13:
				case 14:
				case 25:
				case 26:
				case 27:
				case 29:
				case 30:
				case 33:
				case 34:
				case 42:
				case 43:
				case 46:
					curTerm = term(false, false);
					val = SubLObjectFactory.makeCons(curTerm, val);
					while (true)
						switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
						case 25:
							jj_consume_token(25);
							continue;
						default:
							jj_la1[1] = jj_gen;
							continue Label_0015;
						}
					// break;
				default:
					jj_la1[0] = jj_gen;
					eof(requireEOF);
					return val.toList().reverse(true).toList();
				}
	}

	public SubLVector vector(boolean requireEOF, boolean eatInitialWS) throws ParseException {
		SubLList result = null;
		eatWhiteSpace(eatInitialWS);
		jj_consume_token(5);
		result = termList(false, true);
		while (true)
			switch (jj_ntk == -1 ? jj_ntk() : jj_ntk) {
			case 25:
				jj_consume_token(25);
				continue;
			default:
				jj_la1[14] = jj_gen;
				jj_consume_token(2);
				eof(requireEOF);
				return SubLObjectFactory.makeVector(result);
			}
	}
}
