
package com.cyc.tool.subl.parser;

//// External Imports
import java.io.*;
import java.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;

public  class SubLParserUtil {
  
  //// Constructors
  
  /** Creates a new instance of CycLParserUtil. */
  private SubLParserUtil() {}
  
  //// Public Area
  
  public static SubLList parseTermList(String toParse, boolean testForEOF) 
  throws ParseException, TokenMgrError {
    return parseTermList(createReader(toParse), testForEOF);
  }
  
  public static SubLList parseTermList(Reader reader, boolean testForEOF)  
  throws ParseException, TokenMgrError {
    SubLParser parser = createParser(reader);
    return parser.termList(testForEOF, true);
  }
  
  public static SubLObject parseTerm(String toParse, boolean testForEOF) 
  throws ParseException, TokenMgrError {
    return parseTerm(createReader(toParse), testForEOF);
  }
  
  public static SubLObject parseTerm(Reader reader, boolean testForEOF)  
  throws ParseException, TokenMgrError {
    SubLParser parser = createParser(reader);
    return parser.term(testForEOF, true);
  }
  
  static Object parseForm(String toParse, boolean testForEOF) 
  throws ParseException, TokenMgrError {
    return parseForm(createReader(toParse), testForEOF);
  }
  
  static Object parseForm(Reader reader, boolean testForEOF)  
  throws ParseException, TokenMgrError {
    SubLParser parser = createParser(reader);
    return parser.form(testForEOF, true);
  }
  
  static Object parseAtom(String toParse, boolean testForEOF) 
  throws ParseException, TokenMgrError {
    return parseAtom(createReader(toParse), testForEOF);
  }
  
  static Object parseAtom(Reader reader, boolean testForEOF)  
  throws ParseException, TokenMgrError {
    SubLParser parser = createParser(reader);
    return parser.atom(testForEOF, true);
  }
  
  static SubLSymbol parseSymbol(String toParse, boolean testForEOF) 
  throws ParseException, TokenMgrError {
    return parseSymbol(createReader(toParse), testForEOF);
  }
  
  static SubLSymbol parseSymbol(Reader reader, boolean testForEOF)  
  throws ParseException, TokenMgrError {
    SubLParser parser = createParser(reader);
    return parser.symbol(testForEOF, true);
  }
  
  static SubLString parseString(String toParse, boolean testForEOF) 
  throws ParseException, TokenMgrError {
    return parseString(createReader(toParse), testForEOF);
  }
  
  static SubLString parseString(Reader reader, boolean testForEOF)  
  throws ParseException, TokenMgrError {
    SubLParser parser = createParser(reader);
    return parser.string(testForEOF, true);
  }
  
  static SubLNumber parseNumber(String toParse, boolean testForEOF) 
  throws ParseException, TokenMgrError {
    return parseNumber(createReader(toParse), testForEOF);
  }
  
  static SubLNumber parseNumber(Reader reader, boolean testForEOF)  
  throws ParseException, TokenMgrError {
    SubLParser parser = createParser(reader);
    return parser.number(testForEOF, true);
  }
  
  static SubLCharacter parseChar(String toParse, boolean testForEOF) 
  throws ParseException, TokenMgrError {
    return parseChar(createReader(toParse), testForEOF);
  }
  
  static SubLCharacter parseChar(Reader reader, boolean testForEOF)  
  throws ParseException, TokenMgrError {
    SubLParser parser = createParser(reader);
    return parser.character(testForEOF, true);
  }
  
  //// Protected Area
  
  protected static void sanityCheck() {
    try {
      SubLCharacter character = parseChar("#\\A", true);
      System.out.println("Got result for 'A': '" + character + "'.");
      Number num = (Number)parseNumber("234.2345e-234", true);
      System.out.println("Got result for 234.2345d-234: " + num);
      SubLString str = parseString("\"ack\"", true);
      System.out.println("Got result for \"ack\": \"" + str + "\"");
      Object obj1 = parseSymbol("get-constrained-cycl-for-string", true);
      System.out.println("Got result for get-constrained-cycl-for-string: " + obj1);
      Object obj2 = parseAtom("nil", true);
      System.out.println("Got result for nil: " + obj2);
      Object result = parseForm("(A B C)", true);
      System.out.println("Got result for (A B C): " + result);
      Object obj3 = parseTerm("t", true);
      System.out.println("Got result for t: " + obj3);
      Object obj4 = parseTermList("(A B C) D E (F G)", true);
      System.out.println("Got result for (A B C) D E (F G): " + obj4);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Finished abnormally");
      System.exit(-1);
    }
  }
  
  //// Private Area
  
  private static void eatWhiteSpace(SubLParser parser) {
    //try { parser.whiteSpace(false); } catch (Exception e) { e.printStackTrace(); }
  }
  
  private static SubLParser createParser(Reader reader) {
    SubLParser parser = new SubLParser(reader);
    //eatWhiteSpace(parser);
    return parser;
  }
  
  private static Reader createReader(String str) {
    return new BufferedReader(new StringReader(str));
  }
  
  //// Main
  
  public static void main(String[] args) {
    System.out.println("Starting");
    try {
      sanityCheck();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Finished abnormally");
      System.exit(-1);
    }
    System.out.println("Finished");
    System.exit(0);
  }
  
}
