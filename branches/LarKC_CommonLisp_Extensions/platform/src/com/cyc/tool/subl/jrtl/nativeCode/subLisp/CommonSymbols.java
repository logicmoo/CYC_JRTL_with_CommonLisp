/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;

/**
 *
 * @author Tony Brusseau
 */
public interface CommonSymbols {
  
  //Booleans
  public static final SubLT T = SubLT.T;
  public static final SubLObject RET_T = T;
  public static final SubLNil NIL = SubLNil.NIL;
  public static final SubLObject RET_NIL = NIL;
  
  // Equality
  public static final SubLSymbol EQ = SubLObjectFactory.makeSublispSymbol("EQ");
  public static final SubLSymbol EQL = SubLObjectFactory.makeSublispSymbol("EQL");
  public static final SubLSymbol EQUAL = SubLObjectFactory.makeSublispSymbol("EQUAL");
  public static final SubLSymbol EQUALP = SubLObjectFactory.makeSublispSymbol("EQUALP");
  
  // Numbers
  public static final SubLFixnum MINUS_ONE_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(-1);
  public static final SubLDoubleFloat ZERO_DOUBLE = (SubLDoubleFloat)SubLObjectFactory.makeDouble(0.0);
  public static final SubLFixnum ZERO_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(0);
  public static final SubLFixnum ONE_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(1);
  public static final SubLFixnum TWO_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(2);
  public static final SubLFixnum THREE_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(3);
  public static final SubLFixnum FOUR_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(4);
  public static final SubLFixnum FIVE_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(5);
  public static final SubLFixnum SIX_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(6);
  public static final SubLFixnum SEVEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(7);
  public static final SubLFixnum EIGHT_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(8);
  public static final SubLFixnum NINE_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(9);
  public static final SubLFixnum TEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(10);
  public static final SubLFixnum ELEVEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(11);
  public static final SubLFixnum TWELVE_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(12);
  public static final SubLFixnum THIRTEEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(13);
  public static final SubLFixnum FOURTEEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(14);
  public static final SubLFixnum FIFTEEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(15);
  public static final SubLFixnum SIXTEEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(16);
  public static final SubLFixnum SEVENTEEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(17);
  public static final SubLFixnum EIGHTEEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(18);
  public static final SubLFixnum NINETEEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(19);
  public static final SubLFixnum TWENTY_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(20);
  
  public static final SubLFixnum THIRTY_TWO_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(32);
  public static final SubLFixnum THIRTY_THREE_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(33);
  public static final SubLFixnum THIRTY_FOUR_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(34);
  public static final SubLFixnum SIXTY_FOUR_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(64);
  public static final SubLFixnum ONE_HUNDRED_TWENTY_SEVEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(127);
  public static final SubLFixnum ONE_HUNDRED_THIRTY_SEVEN_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(137);
  public static final SubLFixnum TWO_HUNDRED_FORTY_FOUR_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(244);
  public static final SubLFixnum TWO_HUNDRED_FIFTY_FOUR_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(254);
  
  public static final SubLFixnum ONE_THOUSAND_INTEGER = (SubLFixnum)SubLObjectFactory.makeInteger(1000);
  
  //// Misc
  public static final SubLSymbol BINDING_TYPE = SubLObjectFactory.makeKeyword("BINDING-TYPE");
  public static final SubLSymbol LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
  public static final SubLSymbol CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
  public static final SubLSymbol DYNAMIC = SubLObjectFactory.makeKeyword("DYNAMIC");
  public static final SubLSymbol UNDECLARED = SubLObjectFactory.makeKeyword("UNDECLARED");
  public static final SubLSymbol INITIALIZATION_TYPE = SubLObjectFactory.makeKeyword("INITIALIZATION-TYPE");
  public static final SubLSymbol INITIALIZER = SubLObjectFactory.makeKeyword("INITIALIZER");
  public static final SubLSymbol WORLD = SubLObjectFactory.makeKeyword("WORLD");
  public static final SubLSymbol UNPROVIDED = SubLObjectFactory.makeSublispSymbol("&UNPROVIDED-SUBLISP-ARGUMENT&");
  public static final SubLSymbol OPTIONAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("&OPTIONAL");
  public static final SubLSymbol REST_SYMBOL = SubLObjectFactory.makeSublispSymbol("&REST");
  public static final SubLSymbol RETURN_TAG = SubLObjectFactory.makeSublispSymbol("%RET");
  public static final SubLSymbol ANSWER_TAG = SubLObjectFactory.makeSublispSymbol("%ANSWER");
  public static final SubLSymbol SUSPEND_TYPE_CHECKING = SubLObjectFactory.makeSublispSymbol("*SUSPEND-TYPE-CHECKING?*");
  public static final SubLSymbol OTHERWISE = SubLObjectFactory.makeSublispSymbol("OTHERWISE");
  public static final SubLSymbol CDESTRUCTURING_BIND = SubLObjectFactory.makeSublispSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol MACRO_FORM = SubLObjectFactory.makeSublispSymbol("%MACRO-FORM");
  public static final SubLSymbol MACRO_ENV = SubLObjectFactory.makeSublispSymbol("%ENV");
  public static final SubLSymbol SHOW_STACK_TRACES = SubLObjectFactory.makeSublispSymbol("*SHOW-STACK-TRACES?*");
  public static final SubLSymbol APPEND_STACK_TRACES_TO_ERROR_MESSAGES = SubLObjectFactory.makeSublispSymbol("*APPEND_STACK_TRACES_TO_ERROR_MESSAGES?*");
  public static final SubLSymbol EXTERNAL_KEYWORD = SubLObjectFactory.makeKeyword("EXTERNAL");
  public static final SubLSymbol INTERNAL_KEYWORD = SubLObjectFactory.makeKeyword("INTERNAL");
  public static final SubLSymbol ERROR = SubLObjectFactory.makeSublispSymbol("ERROR");
  public static final SubLSymbol NCONC = SubLObjectFactory.makeSublispSymbol("NCONC");
  public static final SubLSymbol CAAR = SubLObjectFactory.makeSublispSymbol("CAAR");
  public static final SubLSymbol CADR = SubLObjectFactory.makeSublispSymbol("CADR");
  public static final SubLSymbol VALUES = SubLObjectFactory.makeSublispSymbol("VALUES");
  public static final SubLSymbol TRUE = SubLObjectFactory.makeSublispSymbol("TRUE");
  public static final SubLSymbol KILL_KEYWORD = SubLObjectFactory.makeKeyword("KILL");
  public static final SubLSymbol LIST = SubLObjectFactory.makeSublispSymbol("LIST");
  public static final SubLSymbol LISTS = SubLObjectFactory.makeSublispSymbol("LIST*");
  
  //// Reader Symbol
  public static final SubLSymbol SSS = SubLObjectFactory.makeSublispSymbol("***");
  
  //// Operator Symbols
  public static final SubLSymbol IDENTITY = SubLObjectFactory.makeSublispSymbol("IDENTITY");
  public static final SubLSymbol MEMBER = SubLObjectFactory.makeSublispSymbol("MEMBER");
  public static final SubLSymbol SYMBOL_FUNCTION = SubLObjectFactory.makeSublispSymbol("SYMBOL-FUNCTION");
  public static final SubLSymbol LAMBDA_SYMBOL = SubLObjectFactory.makeSublispSymbol("LAMBDA");
  public static final SubLSymbol NUM_E_SYMBOL = SubLObjectFactory.makeSublispSymbol("=");
  public static final SubLSymbol NUM_NE_SYMBOL = SubLObjectFactory.makeSublispSymbol("/=");
  public static final SubLSymbol NUM_GT_SYMBOL = SubLObjectFactory.makeSublispSymbol(">");
  public static final SubLSymbol NUM_LT_SYMBOL = SubLObjectFactory.makeSublispSymbol("<");
  public static final SubLSymbol NUM_GTE_SYMBOL = SubLObjectFactory.makeSublispSymbol(">=");
  public static final SubLSymbol NUM_LTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("<=");
  public static final SubLSymbol STRING_E_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING=");
  public static final SubLSymbol STRING_NE_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING/=");
  public static final SubLSymbol STRING_GT_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING>");
  public static final SubLSymbol STRING_LT_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING<");
  public static final SubLSymbol STRING_GTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING>=");
  public static final SubLSymbol STRING_LTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING<=");
  public static final SubLSymbol STRING_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-EQUAL");
  public static final SubLSymbol STRING_NOT_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-NOT-EQUAL");
  public static final SubLSymbol STRING_GREATER_THAN_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-GREATERP");
  public static final SubLSymbol STRING_LESS_THAN_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-LESSP");
  public static final SubLSymbol STRING_GREATER_THAN_OR_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-NOT-LESSP");
  public static final SubLSymbol STRING_LESS_THAN_OR_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("STRING-NOT-GREATERP");
  public static final SubLSymbol CHAR_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-EQUAL");
  public static final SubLSymbol CHAR_NOT_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-NOT-EQUAL");
  public static final SubLSymbol CHAR_GREATER_THAN_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-GREATERP");
  public static final SubLSymbol CHAR_LESS_THAN_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-LESSP");
  public static final SubLSymbol CHAR_GREATER_THAN_OR_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-NOT-LESSP");
  public static final SubLSymbol CHAR_LESS_THAN_OR_EQUAL_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR-NOT-GREATERP");
  public static final SubLSymbol CHAR_E_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR=");
  public static final SubLSymbol CHAR_NE_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR/=");
  public static final SubLSymbol CHAR_GT_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR>");
  public static final SubLSymbol CHAR_LT_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR<");
  public static final SubLSymbol CHAR_GTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR>=");
  public static final SubLSymbol CHAR_LTE_SYMBOL = SubLObjectFactory.makeSublispSymbol("CHAR<=");
  public static final SubLSymbol CAR = SubLObjectFactory.makeSublispSymbol("CAR");
  public static final SubLSymbol CDR = SubLObjectFactory.makeSublispSymbol("CDR");
  public static final SubLSymbol NTH = SubLObjectFactory.makeSublispSymbol("NTH");
  public static final SubLSymbol GETHASH = SubLObjectFactory.makeSublispSymbol("GETHASH");
  public static final SubLSymbol GETHASH_WITHOUT_VALUES = SubLObjectFactory.makeSublispSymbol("GETHASH-WITHOUT-VALUES");
  public static final SubLSymbol FIRST = SubLObjectFactory.makeSublispSymbol("FIRST");
  public static final SubLSymbol SECOND = SubLObjectFactory.makeSublispSymbol("SECOND");
  public static final SubLSymbol REVERSE = SubLObjectFactory.makeSublispSymbol("REVERSE");
  public static final SubLSymbol NREVERSE = SubLObjectFactory.makeSublispSymbol("NREVERSE");
  public static final SubLSymbol EVAL = SubLObjectFactory.makeSublispSymbol("EVAL");
  public static final SubLSymbol CONS = SubLObjectFactory.makeSublispSymbol("CONS");
  public static final SubLSymbol CHAR = SubLObjectFactory.makeSublispSymbol("CHAR");
  public static final SubLSymbol AREF = SubLObjectFactory.makeSublispSymbol("AREF");
  public static final SubLSymbol GET = SubLObjectFactory.makeSublispSymbol("GET");
  public static final SubLSymbol VECTOR = SubLObjectFactory.makeSublispSymbol("VECTOR");
  public static final SubLSymbol SYMBOL_VALUE = SubLObjectFactory.makeSublispSymbol("SYMBOL-VALUE");
  public static final SubLSymbol ASSEMBLE_FIXNUMS_TO_INTEGER = SubLObjectFactory.makeSublispSymbol("ASSEMBLE-FIXNUMS-TO-INTEGER");
  public static final SubLSymbol SORT = SubLObjectFactory.makeSublispSymbol("SORT");
  
  
 // Special operators
  
  public static final SubLSymbol DEFINE = SubLObjectFactory.makeSublispSymbol("DEFINE");
  public static final SubLSymbol DEFMACRO = SubLObjectFactory.makeSublispSymbol("DEFMACRO");
  public static final SubLSymbol DEFCONSTANT = SubLObjectFactory.makeSublispSymbol("DEFCONSTANT");
  public static final SubLSymbol DEFPARAMETER = SubLObjectFactory.makeSublispSymbol("DEFPARAMETER");
  public static final SubLSymbol DEFVAR = SubLObjectFactory.makeSublispSymbol("DEFVAR");
  public static final SubLSymbol DEFLEXICAL = SubLObjectFactory.makeSublispSymbol("DEFLEXICAL");
  public static final SubLSymbol PROGN = SubLObjectFactory.makeSublispSymbol("PROGN");
  public static final SubLSymbol PIF = SubLObjectFactory.makeSublispSymbol("PIF");
  public static final SubLSymbol PWHEN = SubLObjectFactory.makeSublispSymbol("PWHEN");
  public static final SubLSymbol PUNLESS = SubLObjectFactory.makeSublispSymbol("PUNLESS");
  public static final SubLSymbol PCOND = SubLObjectFactory.makeSublispSymbol("PCOND");
  public static final SubLSymbol PCASE = SubLObjectFactory.makeSublispSymbol("PCASE");
  public static final SubLSymbol CSETQ = SubLObjectFactory.makeSublispSymbol("CSETQ");
  public static final SubLSymbol CSETF = SubLObjectFactory.makeSublispSymbol("CSETF");
  public static final SubLSymbol CINC = SubLObjectFactory.makeSublispSymbol("CINC");
  public static final SubLSymbol CDEC = SubLObjectFactory.makeSublispSymbol("CDEC");
  public static final SubLSymbol CPUSH = SubLObjectFactory.makeSublispSymbol("CPUSH");
  public static final SubLSymbol CPUSHNEW = SubLObjectFactory.makeSublispSymbol("CPUSHNEW");
  public static final SubLSymbol CPOP = SubLObjectFactory.makeSublispSymbol("CPOP");
  public static final SubLSymbol CLET = SubLObjectFactory.makeSublispSymbol("CLET");
  public static final SubLSymbol CPROGV = SubLObjectFactory.makeSublispSymbol("CPROGV");
  public static final SubLSymbol CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSublispSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSublispSymbol("MULTIPLE-VALUE-LIST");
  public static final SubLSymbol NTH_VALUE = SubLObjectFactory.makeSublispSymbol("NTH-VALUE");
  public static final SubLSymbol CDO = SubLObjectFactory.makeSublispSymbol("CDO");
  public static final SubLSymbol CDOTIMES = SubLObjectFactory.makeSublispSymbol("CDOTIMES");
  public static final SubLSymbol CDOLIST = SubLObjectFactory.makeSublispSymbol("CDOLIST");
  public static final SubLSymbol CSOME = SubLObjectFactory.makeSublispSymbol("CSOME");
  public static final SubLSymbol CDOHASH = SubLObjectFactory.makeSublispSymbol("CDOHASH");
  public static final SubLSymbol CDO_SYMBOLS = SubLObjectFactory.makeSublispSymbol("CDO-SYMBOLS");
  public static final SubLSymbol CDO_ALL_SYMBOLS = SubLObjectFactory.makeSublispSymbol("CDO-ALL-SYMBOLS");
  public static final SubLSymbol CDO_EXTERNAL_SYMBOLS = SubLObjectFactory.makeSublispSymbol("CDO-EXTERNAL-SYMBOLS");
  public static final SubLSymbol CCATCH = SubLObjectFactory.makeSublispSymbol("CCATCH");
  public static final SubLSymbol CUNWIND_PROTECT = SubLObjectFactory.makeSublispSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol CTIME = SubLObjectFactory.makeSublispSymbol("CTIME");
  public static final SubLSymbol RET = SubLObjectFactory.makeSublispSymbol("RET");
  public static final SubLSymbol ENFORCE_TYPE = SubLObjectFactory.makeSublispSymbol("ENFORCE-TYPE");
  public static final SubLSymbol CHECK_TYPE = SubLObjectFactory.makeSublispSymbol("CHECK-TYPE");
  public static final SubLSymbol ENFORCE_MUST = SubLObjectFactory.makeSublispSymbol("ENFORCE-MUST");
  public static final SubLSymbol MUST = SubLObjectFactory.makeSublispSymbol("MUST");
  public static final SubLSymbol CNOT = SubLObjectFactory.makeSublispSymbol("CNOT");
  public static final SubLSymbol CAND = SubLObjectFactory.makeSublispSymbol("CAND");
  public static final SubLSymbol COR = SubLObjectFactory.makeSublispSymbol("COR");
  public static final SubLSymbol FIF = SubLObjectFactory.makeSublispSymbol("FIF");
  public static final SubLSymbol FWHEN = SubLObjectFactory.makeSublispSymbol("FWHEN");
  public static final SubLSymbol FUNLESS = SubLObjectFactory.makeSublispSymbol("FUNLESS");
  public static final SubLSymbol IGNORE = SubLObjectFactory.makeSublispSymbol("IGNORE");
  public static final SubLSymbol CVS_ID = SubLObjectFactory.makeSublispSymbol("CVS-ID");
  public static final SubLSymbol DECLARE = SubLObjectFactory.makeSublispSymbol("DECLARE");
  public static final SubLSymbol DECLAIM = SubLObjectFactory.makeSublispSymbol("DECLAIM");
  public static final SubLSymbol PROCLAIM = SubLObjectFactory.makeSublispSymbol("PROCLAIM");
  public static final SubLSymbol QUOTE = SubLObjectFactory.makeSublispSymbol("QUOTE");
  public static final SubLSymbol FUNCTION = SubLObjectFactory.makeSublispSymbol("FUNCTION");
  public static final SubLSymbol WITH_ERROR_HANDLER = SubLObjectFactory.makeSublispSymbol("WITH-ERROR-HANDLER");
  public static final SubLSymbol WITH_STATIC_AREA = SubLObjectFactory.makeSublispSymbol("WITH-STATIC-AREA");
  public static final SubLSymbol WITH_THREAD_PRIVATE_AREA = SubLObjectFactory.makeSublispSymbol("WITH-THREAD-PRIVATE-AREA");
  public static final SubLSymbol WITH_WORKING_AREA = SubLObjectFactory.makeSublispSymbol("WITH-WORKING-AREA");
  public static final SubLSymbol QUIT = SubLObjectFactory.makeSublispSymbol("QUIT");
    
  
  // @todo go through and explicitly put all SubL functions/macros/special forms as symbols here -APB
  
  //// Predicates
  public static final SubLSymbol NULL = SubLObjectFactory.makeSublispSymbol("NULL");
  public static final SubLSymbol BOOLEANP = SubLObjectFactory.makeCycSymbol("BOOLEANP"); // @hack Cyc package hack to be consistent with Allegro/C
  public static final SubLSymbol SYMBOLP = SubLObjectFactory.makeSublispSymbol("SYMBOLP");
  public static final SubLSymbol ATOM = SubLObjectFactory.makeSublispSymbol("ATOM");
  public static final SubLSymbol CONSP = SubLObjectFactory.makeSublispSymbol("CONSP");
  public static final SubLSymbol LISTP = SubLObjectFactory.makeSublispSymbol("LISTP");
  public static final SubLSymbol SEQUENCEP = SubLObjectFactory.makeSublispSymbol("SEQUENCEP");
  public static final SubLSymbol NUMBERP = SubLObjectFactory.makeSublispSymbol("NUMBERP");
  public static final SubLSymbol FIXNUMP = SubLObjectFactory.makeSublispSymbol("FIXNUMP");
  public static final SubLSymbol BIGNUMP = SubLObjectFactory.makeSublispSymbol("BIGNUMP");
  public static final SubLSymbol SHORT_BIGNUM_P = SubLObjectFactory.makeSublispSymbol("SHORT-BIGNUM-P");
  public static final SubLSymbol MEDIUM_BIGNUM_P = SubLObjectFactory.makeSublispSymbol("MEDIUM-BIGNUM-P");
  public static final SubLSymbol LONG_BIGNUM_P = SubLObjectFactory.makeSublispSymbol("LONG-BIGNUM-P");
  public static final SubLSymbol INTEGERP = SubLObjectFactory.makeSublispSymbol("INTEGERP");
  public static final SubLSymbol FLOATP = SubLObjectFactory.makeSublispSymbol("FLOATP");
  public static final SubLSymbol CHARACTERP = SubLObjectFactory.makeSublispSymbol("CHARACTERP");
  public static final SubLSymbol STRINGP = SubLObjectFactory.makeSublispSymbol("STRINGP");
  public static final SubLSymbol VECTORP = SubLObjectFactory.makeSublispSymbol("VECTORP");
  public static final SubLSymbol FUNCTIONP = SubLObjectFactory.makeSublispSymbol("FUNCTIONP");
  public static final SubLSymbol FUNCTION_SPEC_P = SubLObjectFactory.makeSublispSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol PROCESSP = SubLObjectFactory.makeSublispSymbol("PROCESSP");
  public static final SubLSymbol LOCK_P = SubLObjectFactory.makeSublispSymbol("LOCK-P");
  public static final SubLSymbol RW_LOCK_P = SubLObjectFactory.makeSublispSymbol("RW-LOCK-P");
  public static final SubLSymbol HASH_TABLE_P = SubLObjectFactory.makeSublispSymbol("HASH-TABLE-P");
  public static final SubLSymbol STRUCTURE_P = SubLObjectFactory.makeSublispSymbol("STRUCTURE-P");
  public static final SubLSymbol PACKAGEP = SubLObjectFactory.makeSublispSymbol("PACKAGEP");  
  public static final SubLSymbol GUID_P = SubLObjectFactory.makeSublispSymbol("GUID-P");
  public static final SubLSymbol HASH_TABLE_ITERATOR_P = SubLObjectFactory.makeSublispSymbol("HASH-TABLE-ITERATOR-P");
  public static final SubLSymbol STREAMP = SubLObjectFactory.makeSublispSymbol("STREAMP");
  public static final SubLSymbol INPUT_STREAM_P = SubLObjectFactory.makeSublispSymbol("INPUT-STREAM-P");
  public static final SubLSymbol OUTPUT_STREAM_P = SubLObjectFactory.makeSublispSymbol("OUTPUT-STREAM-P");
  public static final SubLSymbol KEYWORDP = SubLObjectFactory.makeSublispSymbol("KEYWORDP");

  // Stream IO Types
  public static final SubLSymbol ELEMENT_TYPE_KEYWORD = SubLObjectFactory.makeKeyword("ELEMENT-TYPE");
  public static final SubLSymbol TEXT_KEYWORD = SubLObjectFactory.makeKeyword("TEXT");
  public static final SubLSymbol BINARY_KEYWORD = SubLObjectFactory.makeKeyword("BINARY");

  // Stream Direction
  public static final SubLSymbol DIRECTION_KEYWORD = SubLObjectFactory.makeKeyword("DIRECTION");
  public static final SubLSymbol INPUT_KEYWORD = SubLObjectFactory.makeKeyword("INPUT");
  public static final SubLSymbol OUTPUT_KEYWORD = SubLObjectFactory.makeKeyword("OUTPUT");
  public static final SubLSymbol IO_KEYWORD = SubLObjectFactory.makeKeyword("IO");
  public static final SubLSymbol PROBE_KEYWORD = SubLObjectFactory.makeKeyword("PROBE");
  
  // Stream existentials
  public static final SubLSymbol IF_EXISTS_KEYWORD = SubLObjectFactory.makeKeyword("IF-EXISTS");
  public static final SubLSymbol IF_DOES_NOT_EXIST_KEYWORD = SubLObjectFactory.makeKeyword("IF-DOES-NOT-EXIST");
  public static final SubLSymbol ERROR_KEYWORD = SubLObjectFactory.makeKeyword("ERROR");
  public static final SubLSymbol NEW_VERSION_KEYWORD = SubLObjectFactory.makeKeyword("NEW-VERSION");
  public static final SubLSymbol RENAME_AND_DELETE_KEYWORD = SubLObjectFactory.makeKeyword("RENAME-AND-DELETE");
  public static final SubLSymbol OVERWRITE_KEYWORD = SubLObjectFactory.makeKeyword("OVERWRITE");
  public static final SubLSymbol APPEND_KEYWORD = SubLObjectFactory.makeKeyword("APPEND");
  public static final SubLSymbol SUPERSEDE_KEYWORD = SubLObjectFactory.makeKeyword("SUPERSEDE");
  public static final SubLSymbol CREATE_KEYWORD = SubLObjectFactory.makeKeyword("CREATE");
  
  public static final SubLSymbol EXTERNAL_FORMAT_KEYWORD = SubLObjectFactory.makeKeyword("EXTERNAL-FORMAT");
  
  // File Positions
  public static final SubLSymbol START_KEYWORD = SubLObjectFactory.makeKeyword("START");
  public static final SubLSymbol END_KEYWORD = SubLObjectFactory.makeKeyword("END");
  
  // IO
  public static final SubLSymbol TERMINAL_IO = SubLObjectFactory.makeSublispSymbol("*TERMINAL-IO*");
  public static final SubLSymbol STANDARD_INPUT = SubLObjectFactory.makeSublispSymbol("*STANDARD-INPUT*");
  public static final SubLSymbol STANDARD_OUTPUT = SubLObjectFactory.makeSublispSymbol("*STANDARD-OUTPUT*");
  public static final SubLSymbol ERROR_OUTPUT = SubLObjectFactory.makeSublispSymbol("*ERROR-OUTPUT*");
  public static final SubLSymbol DEBUG_IO = SubLObjectFactory.makeSublispSymbol("*DEBUG-IO*");
  public static final SubLSymbol NULL_INPUT = SubLObjectFactory.makeSublispSymbol("*NULL-INPUT*");
  public static final SubLSymbol NULL_OUTPUT = SubLObjectFactory.makeSublispSymbol("*NULL-OUTPUT*");
  public static final SubLSymbol QUERY_IO = SubLObjectFactory.makeSublispSymbol("*QUERY-IO*");
  public static final SubLSymbol TRACE_OUTPUT = SubLObjectFactory.makeSublispSymbol("*TRACE-OUTPUT*");
  
  //// NON SYMBOLS
 
  public static final int PROCESS_TO_END = Integer.MAX_VALUE;
}
