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

package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//// Internal Imports
import java.util.Set;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispPackages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;

//// External Imports

public class SubLPackage extends LispPackage implements SubLObject {

	private static class RetrievalStr {
		private String str;

		private RetrievalStr() {
		}

		public boolean equals(Object obj) {
			return obj.equals(this.str);
		}

		public int hashCode() {
			return this.str.hashCode();
		}
	}

	//// Constructors

	public static String PACKAGE_TYPE_NAME = "PACKAGE";

	private static RetrievalStr retrievalStr = new RetrievalStr();

	private static SubLList allPackages;

	private static HashMap<SubLString, SubLPackage> packageNameToPackageMap = new HashMap<SubLString, SubLPackage>(32);

	//// Public Area

	private static HashMap<String, SubLPackage> packageNameToPackageMapNative = new HashMap<String, SubLPackage>(32);

	private static Object PACKAGE_LOCK = new Object();

	public static SubLPackage KEYWORD_PACKAGE = null;

	public static SubLPackage SUBLISP_PACKAGE = null;

	public static SubLPackage CYC_PACKAGE = null;

	private static void exportSublispSymbols() {
		for (String name : new String[] {
				/*
				 * eventually, all these should be moved near their DEFINE,
				 * DEFMACRO, DEFVAR, etc.
				 */

				// ************************************
				// All BOUNDP exported SUBLISP symbols
				// ************************************

				"*", "**", "***", "*BREAK-ON-ERROR?*", "*CONTINUE-CERROR?*", "*DEBUG-IO*",
				"*DEFAULT-PATHNAME-DEFAULTS*", "*DOUBLE-FLOAT-MINIMUM-EXPONENT*", "*ERROR-ABORT-HANDLER*",
				"*ERROR-HANDLER*", "*ERROR-MESSAGE*", "*ERROR-OUTPUT*", "*EXP1*", "*FEATURES*", "*GENSYM-COUNTER*",
				"*IGNORE-BREAKS?*", "*IGNORE-MUSTS?*", "*IGNORE-WARNS?*", "*INTERNAL-TIME-UNITS-PER-SECOND*",
				"*MOST-NEGATIVE-FIXNUM*", "*MOST-POSITIVE-FIXNUM*", "*MULTIPLE-VALUES-LIMIT*", "*NULL-INPUT*",
				"*NULL-OUTPUT*", "*PACKAGE*", "*PI*", "*PRINT-ARRAY*", "*PRINT-BASE*", "*PRINT-CASE*", "*PRINT-CIRCLE*",
				"*PRINT-ESCAPE*", "*PRINT-GENSYM*", "*PRINT-LENGTH*", "*PRINT-LEVEL*", "*PRINT-LINES*",
				"*PRINT-MISER-WIDTH*", "*PRINT-PPRINT-DISPATCH*", "*PRINT-PRETTY*", "*PRINT-RADIX*", "*PRINT-READABLY*",
				"*PRINT-RIGHT-MARGIN*", "*PROCESS-MAX-PRIORITY*", "*PROCESS-CRITICAL-PRIORITY*",
				"*PROCESS-NORMAL-PRIORITY*", "*PROCESS-BACKGROUND-PRIORITY*", "*PROCESS-MIN-PRIORITY*", "*QUERY-IO*",
				"*RAND-MAX*", "*READ-BASE*", "*READ-DEFAULT-FLOAT-FORMAT*", "*READ-EVAL*", "*READ-SUPPRESS*",
				"*READTABLE*", "*RETAIN-CLIENT-SOCKET?*", "*SILENT-PROGRESS?*", "*STANDARD-INPUT*", "*STANDARD-OUTPUT*",
				"*SUSPEND-TYPE-CHECKING?*", "*TCP-LOCALHOST-ONLY?*", "*TERMINAL-IO*", "*TRACE-OUTPUT*", "BOOLE-1",
				"BOOLE-2", "BOOLE-AND", "BOOLE-ANDC1", "BOOLE-ANDC2", "BOOLE-C1", "BOOLE-C2", "BOOLE-CLR", "BOOLE-EQV",
				"BOOLE-IOR", "BOOLE-NAND", "BOOLE-NOR", "BOOLE-ORC1", "BOOLE-ORC2", "BOOLE-SET", "BOOLE-XOR",
				"CALL-ARGUMENTS-LIMIT", "NIL", "T",

				// *************************************
				// All FBOUNDP exported SUBLISP symbols
				// *************************************
				"*", "+", "-", "/", "/=", "1+", "1-", "<", "<=", "=", ">", ">=", "ABS", "ACONS", "ACOS", "ADJOIN",
				"ALERT-USER", "ALL-PROCESSES", "ALPHA-CHAR-P", "ALPHANUMERICP", "APPEND", "APPLY", "APROPOS", "AREF",
				"ASH", "ASIN", "ASSEMBLE-FIXNUMS-TO-GUID", "ASSEMBLE-FIXNUMS-TO-INTEGER", "ASSOC", "ASSOC-IF",
				"ASSOC-IF-NOT", "ATAN", "ATOM", "BIGNUMP", "BOOLE", "BOOLEAN", "BOTH-CASE-P", "BOUNDP", "BQ-APPEND",
				"BQ-CONS", "BQ-LIST", "BQ-LIST*", "BQ-NCONC", "BQ-VECTOR", "BQ-VECTOR-APPEND", "BREAK",
				"BROADCAST-STREAM-STREAMS", "BUTLAST", "BYTE", "CAADR", "CAAR", "CADADR", "CADAR", "CADDDR", "CADDR",
				"CADR", "CAND", "CAR", "CCATCH", "CCONCATENATE", "CDADR", "CDAR", "CDDDR", "CDDR", "CDEC",
				"CDESTRUCTURING-BIND", "CDO", "CDO-ALL-SYMBOLS", "CDO-EXTERNAL-SYMBOLS", "CDO-SYMBOLS", "CDOHASH",
				"CDOLIST", "CDOTIMES", "CDR", "CEILING", "CERROR", "CHAR", "CHAR-CODE", "CHAR-DOWNCASE", "CHAR-EQUAL",
				"CHAR-GREATERP", "CHAR-LESSP", "CHAR-NOT-EQUAL", "CHAR-NOT-GREATERP", "CHAR-NOT-LESSP", "CHAR-UPCASE",
				"CHAR/=", "CHAR<", "CHAR<=", "CHAR=", "CHAR>", "CHAR>=", "CHARACTERP", "CHECK-TYPE", "CINC",
				"CLASS-NAME", "CLEAR-INPUT", "CLEAR-OUTPUT", "CLET", "CLOSE", "CLRHASH", "CMERGE",
				"CMULTIPLE-VALUE-BIND", "CNOT", "CODE-CHAR", "COMPILE", "CONCATENATED-STREAM-STREAMS", "CONS", "CONSP",
				"CONSTANTP", "CONSTRUCT-FILENAME", "COPY-ALIST", "COPY-LIST", "COPY-READTABLE", "COPY-SEQ", "COPY-TREE",
				"COR", "COS", "COUNT", "COUNT-IF", "COUNT-IF-NOT", "CPOP", "CPROGV", "CPUSH", "CPUSHNEW",
				"CRACK-DATE-RELATIVE-GUID", "CREDUCE", "CSETF", "CSETQ", "CSOME", "CTIME", "CUNWIND-PROTECT",
				"CURRENT-PROCESS", "CVS-ID", "CWITH-OUTPUT-TO-STRING", "DATE-RELATIVE-GUID-P", "DEBUG", "DEBUG-PROCESS",
				"DECLAIM", "DECLARE", "DECODE-FLOAT", "DECODE-UNIVERSAL-TIME", "DEFAULT-STRUCT-PRINT-FUNCTION",
				"DEFCONSTANT", "DEFINE", "DEFINE-METHOD", "DEFLEXICAL", "DEFMACRO", "DEFPARAMETER", "DEFPOLYMORPHIC",
				"DEFSTRUCT", "DEFVAR", "DELETE", "DELETE-DIRECTORY", "DELETE-DUPLICATES", "DELETE-FILE", "DELETE-IF",
				"DELETE-IF-NOT", "DESTROY-HASH-TABLE-ITERATOR", "DIGIT-CHAR", "DIGIT-CHAR-P", "DIRECTORY",
				"DIRECTORY-P", "DISASSEMBLE-GUID-TO-FIXNUMS", "DISASSEMBLE-INTEGER-TO-FIXNUMS", "DOCUMENTATION", "DPB",
				"ECHO-STREAM-INPUT-STREAM", "ECHO-STREAM-OUTPUT-STREAM", "EIGHTH", "ELT", "ENCODE-UNIVERSAL-TIME",
				"ENFORCE-MUST", "ENFORCE-TYPE", "ENDP", "ENSURE-PRIVATE-STREAM", "EQ", "EQL", "EQUAL", "EQUALP",
				"ERROR", "EVAL", "EVAL-WHEN", "EVENP", "EXIT", "EXP", "EXPORT", "EXPT", "FALSE", "FBOUNDP", "FIF",
				"FIFTH", "FILE-AUTHOR", "FILE-LENGTH", "FILE-POSITION", "FILE-STRING-LENGTH", "FILE-WRITE-DATE", "FILL",
				"FIND", "FIND-IF", "FIND-IF-NOT", "FIND-PACKAGE", "FIND-SYMBOL", "FINISH-OUTPUT", "FIRST", "FIXNUM*",
				"FIXNUMP", "FLOAT", "FLOAT-DIGITS", "FLOAT-RADIX", "FLOAT-SIGN", "FLOATP", "FLOOR", "FMAKUNBOUND",
				"FORCE-OUTPUT", "FORK-PROCESS", "FORMAT", "FOURTH", "FRESH-LINE", "FUNCALL", "FUNCTION",
				"FUNCTION-INFORMATION", "FUNCTION-SPEC-P", "FUNCTIONP", "FUNLESS", "FWHEN", "GC", "GC-DYNAMIC",
				"GC-EPHEMERAL", "GC-FULL", "GENSYM", "GENTEMP", "GET", "GET-CONSING-STATE", "GET-DECODED-TIME",
				"GET-DISPATCH-MACRO-CHARACTER", "GET-FILE-POSITION", "GET-INTERNAL-REAL-TIME", "GET-INTERNAL-RUN-TIME",
				"GET-MACHINE-NAME", "GET-MACRO-CHARACTER", "GET-NETWORK-NAME", "GET-OUTPUT-STREAM-STRING",
				"GET-PROCESS-ID", "GET-STRING-FROM-USER", "GET-UNIVERSAL-TIME", "GET-USER-NAME", "GETF", "GETHASH",
				"GETHASH-WITHOUT-VALUES", "GUID-P", "GUID-STRING-P", "GUID-TO-STRING", "GUID/=", "GUID<", "GUID<=",
				"GUID=", "GUID>", "GUID>=", "HASH-TABLE-COUNT", "HASH-TABLE-ITERATOR-DONE-P",
				"HASH-TABLE-ITERATOR-HASH-TABLE", "HASH-TABLE-ITERATOR-KEY", "HASH-TABLE-ITERATOR-NEXT",
				"HASH-TABLE-ITERATOR-P", "HASH-TABLE-ITERATOR-VALUE", "HASH-TABLE-P", "HASH-TABLE-SIZE",
				"HASH-TABLE-TEST", "IDENTITY", "IGNORE", "IGNORE-ERRORS", "IMPORT", "IN-PACKAGE", "INFINITY-P",
				"INPUT-STREAM-P", "INT/", "INTEGER-DECODE-FLOAT", "INTEGER-LENGTH", "INTEGERP", "INTERACTIVE-STREAM-P",
				"INTERN", "INTERNAL-REAL-TIME-HAS-ARRIVED?", "INTERRUPT-PROCESS", "INTERSECTION", "ISQRT", "KEYWORDP",
				"KILL-PROCESS", "LAST", "LDB", "LDB-TEST", "LDIFF", "LENGTH", "LISP-IMPLEMENTATION-TYPE",
				"LISP-IMPLEMENTATION-VERSION", "LIST", "LIST*", "LIST-ALL-PACKAGES", "LIST-LENGTH", "LISTEN", "LISTP",
				"LOAD", "LOCK-IDLE-P", "LOCK-P", "LOCK-PACKAGE", "LOG", "LOG-MESSAGE", "LOGAND", "LOGANDC1", "LOGANDC2",
				"LOGBITP", "LOGCOUNT", "LOGEQV", "LOGIOR", "LOGNAND", "LOGNOR", "LOGNOT", "LOGORC1", "LOGORC2",
				"LOGTEST", "LOGXOR", "LONG-SITE-NAME", "LOOP", "LOWER-CASE-P", "MACHINE-INSTANCE", "MACHINE-TYPE",
				"MACHINE-VERSION", "MACRO-OPERATOR-P", "MACROEXPAND", "MACROEXPAND-1", "MAKE-BROADCAST-STREAM",
				"MAKE-CONCATENATED-STREAM", "MAKE-DATE-RELATIVE-GUID", "MAKE-DIRECTORY",
				"MAKE-DISPATCH-MACRO-CHARACTER", "MAKE-ECHO-STREAM", "MAKE-HASH-TABLE", "MAKE-HASH-TABLE-ITERATOR",
				"MAKE-INSTANCE", "MAKE-KEYWORD", "MAKE-LIST", "MAKE-LOCK", "MAKE-METHOD", "MAKE-PACKAGE",
				"MAKE-PRIVATE-BROADCAST-STREAM", "MAKE-PRIVATE-CONCATENATED-STREAM", "MAKE-PRIVATE-ECHO-STREAM",
				"MAKE-PRIVATE-STRING-INPUT-STREAM", "MAKE-PRIVATE-STRING-OUTPUT-STREAM", "MAKE-PRIVATE-SYNONYM-STREAM",
				"MAKE-PRIVATE-TWO-WAY-STREAM", "MAKE-PROCESS", "MAKE-STRING", "MAKE-STRING-INPUT-STREAM",
				"MAKE-STRING-OUTPUT-STREAM", "MAKE-SYMBOL", "MAKE-SYNONYM-STREAM", "MAKE-TWO-WAY-STREAM", "MAKE-VECTOR",
				"MAKUNBOUND", "MAPC", "MAPCAN", "MAPCAR", "MAPCON", "MAPHASH", "MAPL", "MAPLIST", "MAX", "MEMBER",
				"MEMBER-IF", "MEMBER-IF-NOT", "MIN", "MINUSP", "MISMATCH", "MOD", "MULTIPLE-VALUE-LIST", "MUST",
				"NBUTLAST", "NCONC", "NEW-GUID", "NINTERSECTION", "NINTH", "NOT-A-NUMBER-P", "NOTIFY", "NOTIFY-USER",
				"NRECONC", "NREVERSE", "NSET-DIFFERENCE", "NSET-EXCLUSIVE-OR", "NSTRING-CAPITALIZE", "NSTRING-DOWNCASE",
				"NSTRING-UPCASE", "NSUBLIS", "NSUBST", "NSUBST-IF", "NSUBST-IF-NOT", "NSUBSTITUTE", "NSUBSTITUTE-IF",
				"NSUBSTITUTE-IF-NOT", "NTH", "NTH-VALUE", "NTHCDR", "NULL", "NUMBER", "NUMBERP", "NUNION", "ODDP",
				"OPEN", "OPEN-BINARY", "OPEN-STREAM-P", "OPEN-TCP-STREAM", "OPEN-TEXT", "OUTPUT-STREAM-P",
				"PACKAGE-LOCKED-P", "PACKAGE-NAME", "PACKAGE-NICKNAMES", "PACKAGE-SHADOWING-SYMBOLS",
				"PACKAGE-USE-LIST", "PACKAGE-USED-BY-LIST", "PACKAGEP", "PAIRLIS", "PARSE-INTEGER", "PCASE", "PCOND",
				"PEEK-CHAR", "PIF", "PLUSP", "POSITION", "POSITION-IF", "POSITION-IF-NOT", "PRIN1", "PRIN1-TO-STRING",
				"PRINC", "PRINC-TO-STRING", "PRINT", "PRINT-OBJECT", "PRINT-UNREADABLE-OBJECT", "PROBE-FILE",
				"PROCESS-ACTIVE-P", "PROCESS-BLOCK", "PROCESS-NAME", "PROCESS-PRIORITY", "PROCESS-STATE",
				"PROCESS-UNBLOCK", "PROCESS-WAIT", "PROCESS-WAIT-WITH-TIMEOUT", "PROCESS-WHOSTATE", "PROCESSP",
				"PROCLAIM", "PROGN", "PUNLESS", "PUT", "PUTF", "PWHEN", "QUOTE", "RANDOM", "RASSOC", "RASSOC-IF",
				"RASSOC-IF-NOT", "READ", "READ-BYTE", "READ-CHAR", "READ-CHAR-NO-HANG", "READ-DELIMITED-LIST",
				"READ-FROM-STRING", "READ-FROM-STRING-IGNORING-ERRORS", "READ-IGNORING-ERRORS", "READ-LINE",
				"READ-PRESERVING-WHITESPACE", "READ-SEQUENCE", "READTABLE-CASE", "READTABLEP",
				"REGISTER-LOW-MEMORY-CALLBACK", "REM", "REMF", "REMHASH", "REMOVE", "REMOVE-DUPLICATES", "REMOVE-IF",
				"REMOVE-IF-NOT", "REMPROP", "RENAME-FILE", "REPLACE", "REPORT-ERROR", "REST", "RESTART-PROCESS", "RET",
				"REVAPPEND", "REVERSE", "ROOM", "ROUND", "RPLACA", "RPLACD", "SCALE-FLOAT", "SEARCH", "SECOND",
				"SEED-RANDOM", "SEQUENCEP", "SET", "SET-AREF", "SET-CHAR", "SET-CONSING-STATE", "SET-DIFFERENCE",
				"SET-DISPATCH-MACRO-CHARACTER", "SET-EXCLUSIVE-OR", "SET-FILE-POSITION", "SET-MACRO-CHARACTER",
				"SET-NTH", "SET-PROCESS-PRIORITY", "SET-SYNTAX-FROM-CHAR", "SETHASH", "SETQ", "SEVENTH",
				"SHORT-SITE-NAME", "SHOW-PROCESSES", "SIMPLE-READER-ERROR", "SIN", "SIXTH", "SLEEP", "SOFTWARE-TYPE",
				"SOFTWARE-VERSION", "SORT", "SQRT", "STABLE-SORT", "STREAM-ELEMENT-TYPE", "STREAMP", "STRING",
				"STRING-CAPITALIZE", "STRING-DOWNCASE", "STRING-EQUAL", "STRING-GREATERP", "STRING-LEFT-TRIM",
				"STRING-LESSP", "STRING-NOT-EQUAL", "STRING-NOT-GREATERP", "STRING-NOT-LESSP", "STRING-RIGHT-TRIM",
				"STRING-TO-GUID", "STRING-TRIM", "STRING-UPCASE", "STRING/=", "STRING<", "STRING<=", "STRING=",
				"STRING>", "STRING>=", "STRINGP", "SUBLIS", "SUBSEQ", "SUBSETP", "SUBST", "SUBST-IF", "SUBST-IF-NOT",
				"SUBSTITUTE", "SUBSTITUTE-IF", "SUBSTITUTE-IF-NOT", "SXHASH", "SYMBOL-FUNCTION", "SYMBOL-NAME",
				"SYMBOL-PACKAGE", "SYMBOL-PLIST", "SYMBOL-VALUE", "SYMBOLP", "SYNONYM-STREAM-SYMBOL", "TAILP", "TAN",
				"TENTH", "TERPRI", "THIRD", "THROW", "TIME-FROM-NOW", "TIME-HAS-ARRIVED?", "TREE-EQUAL", "TRUE",
				"TRUNCATE", "TWO-WAY-STREAM-INPUT-STREAM", "TWO-WAY-STREAM-OUTPUT-STREAM", "TYPE-OF", "UNEXPORT",
				"UNINTERN", "UNION", "UNREAD-CHAR", "UPPER-CASE-P", "USER-CONFIRM", "VALID-PROCESS-P", "VALUES",
				"VARIABLE-INFORMATION", "VECTOR", "VECTORP", "VISIT-DEFSTRUCT", "VISIT-DEFSTRUCT-OBJECT", "VOLATILE",
				"WARN", "WITH-BINARY-FILE", "WITH-ERROR-HANDLER", "WITH-INPUT-FROM-STRING", "WITH-LOCK-HELD",
				"WITH-OPEN-FILE", "WITH-OPEN-STREAM", "WITH-PRIVATE-BINARY-FILE", "WITH-PRIVATE-TEXT-FILE",
				"WITH-PROCESS-RESOURCE-TRACKING", "WITH-SIMPLE-RESTART", "WITH-STANDARD-IO-SYNTAX", "WITH-STATIC-AREA",
				"WITH-SUBLISP-ERROR-HANDLING", "WITH-TEXT-FILE", "WRITE", "WRITE-BYTE", "WRITE-CHAR", "WRITE-IMAGE",
				"WRITE-LINE", "WRITE-SEQUENCE", "WRITE-STRING", "WRITE-TO-STRING", "ZEROP",

				// **********************
				// Random Unbound tokens
				// **********************

				/* Special form reserved tokens */
				"OTHERWISE",
				/* Lambda stuff */
				"LAMBDA", "&ALLOW-OTHER-KEYS", "&AUX", "&BODY", "&ENVIRONMENT", "&KEY", "&OPTIONAL", "&REST", "&WHOLE",
				/* Declaration tokens */
				"FACCESS", "VACCESS", "PRIVATE", "PROTECTED", "PUBLIC", "INLINE", "NOTINLINE", "OPTIMIZE-FUNCALL",
				/* Used in #+ #- expressions */
				"AND", "OR", "NOT",
				/* Types */
				"FIXNUM", "BIGNUM", "FLOAT", "CHARACTER", "STRING", "PACKAGE", "SYMBOL", "CONS", "VECTOR", "HASH-TABLE",
				"FUNCTION", "STREAM", "PROCESS", "READTABLE", "GUID", "DOUBLE-FLOAT", "SINGLE-FLOAT", "INTEGER",
				"NUMBER", "NULL", "LIST", "SEQUENCE",

				/* Additional symbols exported only under C/Java RTL */
				"QUIT",
				/* KMG Required for DEFINE-METHOD. @todo eliminate these */
				"*DTP-BIGNUM*", "*DTP-CHARACTER*", "*DTP-CONS*", "*DTP-FIXNUM*", "*DTP-FLOAT*", "*DTP-FUNCTION*",
				"*DTP-GUID*", "*DTP-HASH-TABLE*", "*DTP-JASM-PSDOP*", "*DTP-JASMLX*", "*DTP-JAVA-DESCRIPTOR*",
				"*DTP-JAVA-OPCODE*", "*DTP-JVMCD-ASSIST*", "*DTP-JVMCODE*", "*DTP-JVMDBG-CONTEXT*",
				"*DTP-JVMDBG-FRAMEDESC*", "*DTP-JVMI*", "*DTP-LOCK*", "*DTP-PACKAGE*", "*DTP-PROCESS*",
				"*DTP-READ-TOKEN*", "*DTP-READTABLE*", "*DTP-STREAM*", "*DTP-STRING*", "*DTP-STRUCTURES-BAG*",
				"*DTP-SYMBOL*", "*DTP-VECTOR*",

				// additions, pass 1
				"*CURRENT-AREA*", "*SXHASH-METHOD-TABLE*", "GET-STATIC-AREA", "GET-THREAD-PRIVATE-AREA",
				"GET-WORKING-AREA", "LOCK-LOCKER", "NOTE-ACTIVITY", "NOTE-NUMERIC-PROGRESS", "NOTE-PERCENT-PROGRESS",
				"NOTING-ACTIVITY", "NOTING-NUMERIC-PROGRESS", "NOTING-PERCENT-PROGRESS", "PRINT-NOT-READABLE",
				"WITH-THREAD-PRIVATE-AREA", "WITH-TIMEOUT", "WITH-WORKING-AREA",

				// JRTL-specific additions
				"SHORT-BIGNUM-P", "MEDIUM-BIGNUM-P", "LONG-BIGNUM-P", "FUNCALL-STATS", "CLEAR-FUNCALL-STATS",
				"PRINT-STACK-TRACE", "LIST-OF-ALL-ERRORS", "PRINT-ERROR-DETAILS", "*SHOW-STACK-TRACES?*",
				"INITIALIZE-SUBL-INTERFACE-FILE", "LOAD-EXTERNAL-CODE"

		}) {
			SubLSymbol sym = SubLSymbolFactory.makeSymbol(name, SubLPackage.SUBLISP_PACKAGE);
			SubLPackage.SUBLISP_PACKAGE.exportSymbol(sym);
		}
	}

	public static SubLPackage findPackageNamed(String packageName) {
		synchronized (SubLPackage.PACKAGE_LOCK) {
			return SubLPackage.packageNameToPackageMapNative.get(packageName);
		}
	}

	public static SubLPackage findPackageNamed(SubLString packageName) {
		return SubLPackage.findPackageNamed(packageName.getString());
	}

	public static SubLList getAllPackages() {
		return SubLPackage.allPackages;
	}

	public static SubLPackage getCurrentPackage() {
		return Packages.$package$.getDynamicValue().toPackage();
	}

	public static void initPackages() {
		SubLPackage.KEYWORD_PACKAGE = new SubLPackage(SubLObjectFactory.makeString("KEYWORD"), SubLNil.NIL,
				SubLNil.NIL);
		SubLPackage.SUBLISP_PACKAGE = new SubLPackage(SubLObjectFactory.makeString("SUBLISP"), SubLNil.NIL,
				SubLObjectFactory.makeList(1, SubLObjectFactory.makeString("SL")));
		SubLPackage.CYC_PACKAGE = new SubLPackage(SubLObjectFactory.makeString("CYC"),
				SubLObjectFactory.makeList(1, SubLPackage.SUBLISP_PACKAGE), SubLNil.NIL);
		SubLPackage.SUBLISP_PACKAGE.symbolNameToSymbolMap.put(SubLNil.NIL.getSubLName(), SubLNil.NIL);
		SubLPackage.SUBLISP_PACKAGE.symbolNameToSymbolMap.put(SubLT.T.getSubLName(), SubLT.T);
		SubLPackage.exportSublispSymbols();
		SubLPackage.SUBLISP_PACKAGE.setLocked();
	}

	public static SubLPackage setCurrentPackage(String packageName) {
		return SubLPackage.setCurrentPackage(SubLObjectFactory.makeString(packageName));
	}

	public static void setCurrentPackage(SubLPackage thePackage) {
		if (thePackage == null)
			return;
		if (thePackage == SubLPackage.getCurrentPackage())
			return;
		Packages.$package$.setValue(thePackage);
	}

	public static SubLPackage setCurrentPackage(SubLString packageName) {
		SubLPackage thePackage = SubLPackage.findPackageNamed(packageName);
		if (thePackage == null)
			Errors.error("Unabled to switch to package: " + packageName + ".");
		SubLPackage.setCurrentPackage(thePackage);
		return thePackage;
	}

	// public String toString() {
	// return "#<The " + getName() + " package" + (isLocked() ? "!>" : ">");
	// }

	// private SubLString name;
	// @todo change these to List<> where possible
	// private ArrayList<SubLPackage> usesPackagesList = new
	// ArrayList<SubLPackage>();
	private ArrayList<SubLString> nickNames = new ArrayList<SubLString>();

	private ArrayList<SubLSymbol> shadowingSymbols = new ArrayList<SubLSymbol>();

	private Set<SubLSymbol> exportedSymbols = new HashSet<SubLSymbol>();

	// public SubLList getShadowingSymbols() {
	// Errors.unimplementedMethod("SubLPackage.getShadowingSymbols");
	// //The follwoing code is correct but the list isn't currently being
	// maintained properly
	// return SubLObjectFactory.makeList(shadowingSymbols);
	// }

	private boolean isLocked = false;

	private Map<SubLString, SubLSymbol> symbolNameToSymbolMap = new HashMap<SubLString, SubLSymbol>();

	// Anonymous package.
	public SubLPackage() {
		this.setJavaName("null");
	}

	public SubLPackage(String name) {
		this.setJavaName(name);
	}

	public SubLPackage(String name, int size) {
		this(name);
	}

	SubLPackage(SubLString name, SubLList useList, SubLList nickNames) {
		this.init(name, useList, nickNames);
	}

	private void addUsedBy(SubLPackage thePackage) {
		synchronized (SubLPackage.PACKAGE_LOCK) {
			this.usedByPackagesList.add(thePackage);
		}
	}

	public SubLList aproposList(SubLString pattern) {
		ArrayList<SubLSymbol> symbols = new ArrayList<SubLSymbol>();
		synchronized (SubLThread.getInterruptLock()) {
			boolean needsInterruption = Threads.forciblyHandleInterrupts();
			try {
				this.aproposListInternal(pattern, symbols);
			} finally {
				if (needsInterruption)
					SubLProcess.currentProcess().interrupt();
			}
		}
		return SubLObjectFactory.makeList(symbols);
	}

	private void aproposListInternal(SubLString pattern, ArrayList<SubLSymbol> symbols) {
		synchronized (SubLPackage.PACKAGE_LOCK) {
			Iterator<Map.Entry<SubLString, SubLSymbol>> packageIterator = this.symbolNameToSymbolMap.entrySet()
					.iterator();
			while (packageIterator.hasNext()) {
				Map.Entry<SubLString, SubLSymbol> entry = packageIterator.next();
				SubLObject result = Sequences.search(pattern, entry.getKey(), CommonSymbols.EQUALP,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
				if (result != CommonSymbols.NIL)
					symbols.add(entry.getValue());
			}
		}
	}

	public boolean canFastHash() {
		return true;
	}

	public void exportSymbol(SubLObject symbol) {
		// @todo check for conflicts etc
		this.exportedSymbols.add(symbol.toSymbol());
	}

	public void exportSymbols(SubLObject symbols) {
		Errors.unimplementedMethod("SubLPackage.exportSymbols");
	}

	public Set<SubLSymbol> getAllSymbols() {
		Set<SubLSymbol> allSymbols = new HashSet<SubLSymbol>();
		synchronized (SubLPackage.PACKAGE_LOCK) {
			for (int i = 0, size = this.usesPackagesList.size(); i < size; ++i) {
				SubLPackage used = this.usesPackagesList.get(i).toPackage();
				allSymbols.addAll(used.exportedSymbols);
			}
		}
		allSymbols.addAll(this.symbolNameToSymbolMap.values());
		return allSymbols;
	}

	public String getName() {
		return this.name.getString();
	}

	public SubLString getNameAsSubLString() {
		return this.name;
	}

	public SubLList getNickNames() {
		return SubLObjectFactory.makeList(this.nickNames);
	}

	public SubLSymbol getType() {
		return Types.$dtp_package$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.ONE_INTEGER;
	}

	public SubLList getUsedByPackagesList() {
		return SubLObjectFactory.makeList(this.usedByPackagesList);
	}

	public SubLList getUsesPackagesList() {
		return this.usesPackagesList.toList();// SubLObjectFactory.makeList(usesPackagesList);
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.superHash();
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
	}

	public void importSymbol(SubLObject symbol) {
		Errors.unimplementedMethod("SubLPackage.importSymbol");
	}

	public void importSymbols(SubLObject symbols) {
		Errors.unimplementedMethod("SubLPackage.importSymbols");
	}

	private void init(SubLString name, SubLList useList, SubLList nickNamesParam) {
		if (name == null || "".equals(name))
			Errors.error("Got invalid package name.");
		name = SubLObjectFactory.makeString(AbstractSubLSymbol.canonicalizeName(name.getString()));
		useList = useList.asConsList();
		nickNamesParam = nickNamesParam.asConsList();
		synchronized (SubLPackage.PACKAGE_LOCK) {
			// verify package name is unique and store
			if (SubLPackage.packageNameToPackageMap.get(name) != null)
				Errors.error("A package named " + name + " already exists.");
			this.name = name;
			this.javaName = name.getString();
			LispPackages.map.put(this.javaName, this);
			LispPackages.packages.add(this);
			// verify nicknames are unique and store
			for (SubLObject cur = nickNamesParam; cur != SubLNil.NIL; cur = cur.rest()) {
				SubLObject nickName = cur.first();
				if (SubLPackage.packageNameToPackageMap.get(nickName) != null)
					Errors.error("A package named " + nickName + " already exists.");
				if (!nickName.isString())
					Errors.error("Package nick names must be strings, got: " + nickName);
				if (!this.nickNames.contains(nickName))
					this.nickNames.add(nickName.toStr());
			}
			// verify used-package list and store
			for (SubLObject cur = useList; cur != SubLNil.NIL; cur = cur.rest()) {
				SubLObject curPackageName = cur.first();
				SubLPackage curPackage = null;
				try {
					if (curPackageName.isString())
						curPackage = SubLPackage.findPackageNamed(curPackageName.toStr());
					else if (curPackageName.isPackage())
						curPackage = curPackageName.toPackage();
					else
						Errors.error("Got invalid package spec: " + curPackageName);
				} catch (Exception e) {
					Errors.error("Error while creating a package.", e);
				}
				if (curPackage == null)
					continue;
				this.usesPackagesList = useList;// .copyList();
				// if (usesPackagesList==null) usesPackagesList =
				// makeCons(curPackage);
				// else if (!memq(curPackage, usesPackagesList)) {
				// usesPackagesList = usesPackagesList.push(curPackage);
				// }
			}
			// update globals
			if (SubLPackage.allPackages == null)
				SubLPackage.allPackages = SubLObjectFactory.makeList(1, this);
			else
				SubLPackage.allPackages = SubLPackage.allPackages.push(this);
			SubLPackage.packageNameToPackageMap.put(name, this);
			SubLPackage.packageNameToPackageMapNative.put(name.getString(), this);
			SubLString curNickName = null;
			for (SubLObject cur = nickNamesParam; cur != SubLNil.NIL; cur = cur.rest())
				try {
					curNickName = cur.first().toStr();
					SubLPackage.packageNameToPackageMap.put(curNickName, this);
					SubLPackage.packageNameToPackageMapNative.put(curNickName.getString(), this);
				} catch (Exception e) {
					Errors.cerror("Continue.", "Error while attempting to add package nickname: " + curNickName, e);
				}
		}
		for (SubLObject cur = useList; cur != SubLNil.NIL; cur = cur.rest()) {
			SubLPackage thePackage = cur.first().toPackage();
			thePackage.addUsedBy(this);
		}
	}

	public SubLSymbol intern(String symbolName, boolean forcePackageUpdate) {
		synchronized (SubLThread.getInterruptLock()) {
			boolean needsInterruption = Threads.forciblyHandleInterrupts();
			try {
				synchronized (SubLPackage.PACKAGE_LOCK) {
					SubLSymbol result = this.retrieveSymbolInternal(symbolName, new HashSet());
					if (result == null) {
						result = this == SubLPackage.KEYWORD_PACKAGE ? (SubLSymbol) new SubLSymbolKeyword(symbolName)
								: new SubLSymbolImpl(symbolName, this);
						this.symbolNameToSymbolMap.put(result.getSubLName(), result);
					} else if (forcePackageUpdate)
						result.setPackage(this);
					return result;
				}
			} finally {
				if (needsInterruption)
					SubLProcess.currentProcess().interrupt();
			}
		}
	}

	public SubLSymbol intern(SubLString symbolName, boolean forcePackageUpdate) {
		synchronized (SubLThread.getInterruptLock()) {
			boolean needsInterruption = Threads.forciblyHandleInterrupts();
			try {
				synchronized (SubLPackage.PACKAGE_LOCK) {
					SubLSymbol result = this.retrieveSymbolInternal(symbolName);
					if (result == null) {
						result = this == SubLPackage.KEYWORD_PACKAGE ? (SubLSymbol) new SubLSymbolKeyword(symbolName)
								: new SubLSymbolImpl(symbolName, this);
						this.symbolNameToSymbolMap.put(symbolName, result);
					} else if (forcePackageUpdate)
						result.setPackage(this);
					return result;
				}
			} finally {
				if (needsInterruption)
					SubLProcess.currentProcess().interrupt();
			}
		}
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isExported(SubLSymbol symbol) {
		return symbol.isKeyword() ? true : this.exportedSymbols.contains(symbol);
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	// public boolean unintern(SubLSymbol symbol) {
	// Errors.unimplementedMethod("SubLPackage.unintern");
	// return false;
	// }
	//
	public boolean isLocked() {
		return this.isLocked;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return true;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	//// Protected Area

	//// Private Area

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	//// Internal Rep

	public boolean isVector() {
		return false;
	}

	public SubLSymbol retrieveSymbol(String symbolName) {
		return retrieveSymbol(symbolName,new HashSet());
	}

	
	SubLSymbol retrieveSymbol(String symbolName, Set<SubLPackage> alreadySearched) {
		synchronized (SubLThread.getInterruptLock()) {
			boolean needsInterruption = Threads.forciblyHandleInterrupts();
			try {
				return this.retrieveSymbolInternal(symbolName, alreadySearched);
			} finally {
				if (needsInterruption)
					SubLProcess.currentProcess().interrupt();
			}
		}
	}

	public SubLSymbol retrieveSymbol(SubLString symbolName) {
		synchronized (SubLThread.getInterruptLock()) {
			boolean needsInterruption = Threads.forciblyHandleInterrupts();
			try {
				return this.retrieveSymbolInternal(symbolName);
			} finally {
				if (needsInterruption)
					SubLProcess.currentProcess().interrupt();
			}
		}
	}

	private SubLSymbol retrieveSymbolInternal(String symbolName , Set alreadySearched) {
		synchronized (SubLPackage.PACKAGE_LOCK) {
			SubLPackage.retrievalStr.str = symbolName;
			SubLSymbol result = this.symbolNameToSymbolMap.get(SubLPackage.retrievalStr);
			if (result != null)
				return result;
			SubLObject use = this.usesPackagesList;
			
			if(!alreadySearched.add(this)) return null;
			
			while (use instanceof SubLCons) {
				SubLPackage parentPackage = use.first().toPackage();
				SubLSymbol sym = parentPackage.retrieveSymbol(symbolName, alreadySearched);
				if (sym != null && parentPackage.isExported(sym))
					return sym;
				use = use.rest();
			}
			return null;
		}
	}

	private SubLSymbol retrieveSymbolInternal(SubLString symbolName) {
		synchronized (SubLPackage.PACKAGE_LOCK) {
			SubLSymbol result = this.symbolNameToSymbolMap.get(symbolName);
			if (result != null)
				return result;
			if (this.usesPackagesList == null)
				return null;
			for (int i = 0, size = this.usesPackagesList.size(); i < size; i++) {
				result = ((SubLPackage) this.usesPackagesList.get(i)).retrieveSymbol(symbolName);
				if (result != null)
					return result;
			}
			return null;
		}
	}

	protected void setJavaName(String javaName) {
		this.javaName = javaName;
		this.name = javaName == null ? null : LispObjectFactory.makeString(javaName);
		SubLPackage.packageNameToPackageMapNative.put(javaName, this);
		SubLPackage.packageNameToPackageMap.put(this.name, this);
	}

	public void setLocked() {
		this.isLocked = true;
	}

	public SubLPackage toPackage() { // SubLPackage
		return this;
	}

	public String toTypeName() {
		return SubLPackage.PACKAGE_TYPE_NAME;
	}

	public void unexportSymbol(SubLObject symbol) {
		this.exportedSymbols.remove(symbol.toSymbol());
	}

	public void unexportSymbols(SubLObject symbols) {
		Errors.unimplementedMethod("SubLPackage.unexportSymbols");
	}

	/**
	 * Helper method for the snapshot implementation, this method extracts the
	 * symbols that have the property that their initialization comes from the
	 * world file.
	 *
	 * @todo reimplement once package iterators are available
	 * @return the list of symbols that are initialized with :world
	 */
	public List<SubLSymbol> worldInitializedSymbols() {
		ArrayList<SubLSymbol> symbols = new ArrayList<SubLSymbol>();
		synchronized (SubLPackage.PACKAGE_LOCK) {
			Iterator<Map.Entry<SubLString, SubLSymbol>> packageIterator = this.symbolNameToSymbolMap.entrySet()
					.iterator();
			while (packageIterator.hasNext()) {
				Map.Entry<SubLString, SubLSymbol> entry = packageIterator.next();
				SubLSymbol symbol = entry.getValue();
				if (CommonSymbols.WORLD == symbol.getProperty(CommonSymbols.INITIALIZATION_TYPE))
					symbols.add(symbol);
			}
		}
		return symbols;
	}

}
