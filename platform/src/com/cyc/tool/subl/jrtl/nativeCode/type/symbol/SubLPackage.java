//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.armedbear.lisp.AbstractString;
import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Debug;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.util.SubLFiles;

abstract public class SubLPackage extends LispObject implements SubLObject {

    public static final String[] reserveSubLisp = { "*BREAK-ON-ERROR?*", "*BREAK-ON-WARN?*", "*CONTINUE-CERROR?*", "*DEBUG-IO*", "*DEFAULT-PATHNAME-DEFAULTS*", "*DOUBLE-FLOAT-MINIMUM-EXPONENT*",
            "*ERROR-ABORT-HANDLER*", "*ERROR-HANDLER*", "*ERROR-MESSAGE*", "*ERROR-OUTPUT*", "*EXP1*", "*FEATURES*", "*GENSYM-COUNTER*", "*IGNORE-BREAKS?*", "*IGNORE-MUSTS?*", "*IGNORE-WARNS?*",
            "*INTERNAL-TIME-UNITS-PER-SECOND*", "*MOST-NEGATIVE-FIXNUM*", "*MOST-POSITIVE-FIXNUM*", "*MULTIPLE-VALUES-LIMIT*", "*PI*",

            "IS-REGEX-IMPLEMENTATION-AVAILABLE?", "SEMAPHORE", "TEST", "TIMESTRING", "PROTECTION", "REGEX-VERSION",

            "*PRINT-BASE*", "*PRINT-CASE*", "*PRINT-CIRCLE*", "*PRINT-ESCAPE*", "*PRINT-GENSYM*", "*PRINT-LENGTH*", "*PRINT-LEVEL*", "*PRINT-LINES*", "*PRINT-MISER-WIDTH*", "*PRINT-PPRINT-DISPATCH*",
            "*PRINT-PRETTY*", "*PRINT-RADIX*", "*PRINT-READABLY*", "*PRINT-RIGHT-MARGIN*", "*PROCESS-MAX-PRIORITY*", "*PROCESS-CRITICAL-PRIORITY*", "*PROCESS-NORMAL-PRIORITY*",
            "*PROCESS-BACKGROUND-PRIORITY*", "*PROCESS-MIN-PRIORITY*", "*QUERY-IO*", "*RAND-MAX*", "*READ-BASE*", "*READ-DEFAULT-FLOAT-FORMAT*", "*READ-EVAL*", "*READ-SUPPRESS*", "*READTABLE*",
            "*RETAIN-CLIENT-SOCKET?*", "*SILENT-PROGRESS?*",

            "*SUSPEND-TYPE-CHECKING?*", "*TCP-LOCALHOST-ONLY?*", //

            "BODY", //

            "BOOLE-1", "BOOLE-2", "BOOLE-AND", "BOOLE-ANDC1", "BOOLE-ANDC2", "BOOLE-C1", "BOOLE-C2", "BOOLE-CLR", "BOOLE-EQV", "BOOLE-IOR", "BOOLE-NAND", "BOOLE-NOR", "BOOLE-ORC1", "BOOLE-ORC2",
            "BOOLE-SET", "BOOLE-XOR", "CALL-ARGUMENTS-LIMIT", "*", "+", "-", "/", "/=", "1+", "1-", "<", "<=", "=", ">", ">=", "ABS", "ACONS", "ACOS", "ADJOIN", "ALERT-USER", "ALL-PROCESSES",
            "ALPHA-CHAR-P", "ALPHANUMERICP", "APPEND", "APPLY", "APROPOS", "AREF", "ASH", "ASIN", "ASSEMBLE-FIXNUMS-TO-GUID", "ASSEMBLE-FIXNUMS-TO-INTEGER", "ASSOC", "ASSOC-IF", "ASSOC-IF-NOT",
            "ATAN", "ATOM", "BIGNUMP", "BOOLE", "BOOLEAN", "BOTH-CASE-P", "BOUNDP", "BQ-APPEND", "BQ-CONS", "BQ-LIST", "BQ-LIST*", "BQ-NCONC", "BQ-VECTOR", "BQ-VECTOR-APPEND", "BREAK",
            "BROADCAST-STREAM-STREAMS", "BUTLAST", "BYTE", "CAADR", "CAAR", "CADADR", "CADAR", "CADDDR", "CADDR", "CADR", "CAND", "CAR", "CCATCH", "CCONCATENATE", "CDADR", "CDAR", "CDDDR", "CDDR",
            "CDEC", "CDESTRUCTURING-BIND", "CDO", "CDO-ALL-SYMBOLS", "CDO-EXTERNAL-SYMBOLS", "CDO-SYMBOLS", "CDOHASH", "CDOLIST", "CDOTIMES", "CDR", "CEILING", "CERROR", "CHAR", "CHAR-CODE",
            "CHAR-DOWNCASE", "CHAR-EQUAL", "CHAR-GREATERP", "CHAR-LESSP", "CHAR-NOT-EQUAL", "CHAR-NOT-GREATERP", "CHAR-NOT-LESSP", "CHAR-UPCASE", "CHAR/=", "CHAR<", "CHAR<=", "CHAR=", "CHAR>",
            "CHAR>=", "CHARACTERP", "CIRCULAR-LIST-P", "CHECK-TYPE", "CINC", "CLASS-NAME", "CLEAR-INPUT", "CLEAR-OUTPUT", "CLET", "CLOSE", "CLRHASH", "CMERGE", "CMULTIPLE-VALUE-BIND", "CNOT",
            "CODE-CHAR", "COMPILE", "CONCATENATED-STREAM-STREAMS", "CONS", "CONSP", "CONSTANTP", "CONSTRUCT-FILENAME", "COPY-ALIST", "COPY-LIST", "COPY-READTABLE", "COPY-SEQ", "COPY-TREE", "COR",
            "COS", "COUNT", "COUNT-IF", "COUNT-IF-NOT", "CPOP", "CPROGV", "CPUSH", "CPUSHNEW", "CRACK-DATE-RELATIVE-GUID", "CREDUCE", "CSETF", "CSETQ", "CSOME", "CTIME", "CUNWIND-PROTECT",
            "CURRENT-PROCESS", "CVS-ID", "CWITH-OUTPUT-TO-STRING", "DATE-RELATIVE-GUID-P", "DEBUG", "DEBUG-PROCESS", "DECLAIM", "DECLARE", "DECODE-FLOAT", "DECODE-UNIVERSAL-TIME",
            "DEFAULT-STRUCT-PRINT-FUNCTION", "DEFCONSTANT", "DEFINE", "DEFINE-METHOD", "DEFLEXICAL", "DEFMACRO", "DEFPARAMETER", "DEFPOLYMORPHIC", "DEFSTRUCT", "DEFVAR", "DELETE", "DELETE-DIRECTORY",
            "DELETE-DUPLICATES", "DELETE-FILE", "DELETE-IF", "DELETE-IF-NOT", "DEREGISTER-LOW-MEMORY-CALLBACK", "DESTROY-HASH-TABLE-ITERATOR", "DIGIT-CHAR", "DIGIT-CHAR-P", "DIRECTORY", "DIRECTORY-P",
            "DISASSEMBLE-GUID-TO-FIXNUMS", "DISASSEMBLE-INTEGER-TO-FIXNUMS", "DOCUMENTATION", "DPB", "ECHO-STREAM-INPUT-STREAM", "ECHO-STREAM-OUTPUT-STREAM", "EIGHTH", "ELT", "ENCODE-UNIVERSAL-TIME",
            "ENDP", "ENFORCE-MUST", "ENFORCE-TYPE", "ENSURE-PRIVATE-STREAM", "EQ", "EQL", "EQUAL", "EQUALP", "ERROR", "EVAL", // "EVAL-WHEN",
            "EVENP", "EXIT", "EXP", "EXPORT", "EXPT", "FALSE", "FBOUNDP", "FIF", "FIFTH", "FILE-AUTHOR", "FILE-LENGTH", "FILE-POSITION", "FILE-STRING-LENGTH", "FILE-WRITE-DATE", "FILL", "FIND",
            "FIND-IF",
            //"FIND-IF-NOT",
            "FIND-PACKAGE", "FIND-SYMBOL", "FINISH-OUTPUT", "FIRST", "FIXNUM*", "FIXNUMP", "FLOAT", "FLOAT-DIGITS", "FLOAT-RADIX", "FLOAT-SIGN", "FLOATP", "FLOOR", "FMAKUNBOUND", "FORCE-OUTPUT",
            "FORK-PROCESS", "FORMAT", "FOURTH", "FRESH-LINE", "FUNCALL", "FUNCTION", "FUNCTION-INFORMATION", "FUNCTION-SPEC-P", "FUNCTIONP", "FUNLESS", "FWHEN", "GC", "GC-DYNAMIC", "GC-EPHEMERAL",
            "GC-FULL", "GENSYM", "GENTEMP", "GET", "GET-CONSING-STATE", "GET-DECODED-TIME", "GET-DISPATCH-MACRO-CHARACTER", "GET-FILE-POSITION", "GET-INTERNAL-REAL-TIME", "GET-INTERNAL-RUN-TIME",
            "GET-MACHINE-NAME", "GET-MACRO-CHARACTER", "GET-NETWORK-NAME", "GET-OUTPUT-STREAM-STRING", "GET-PROCESS-ID", "GET-STRING-FROM-USER", "GET-UNIVERSAL-TIME", "GET-USER-NAME", "GETF",
            "GETHASH", "GETHASH-WITHOUT-VALUES", "GUID-P", "GUID-STRING-P", "GUID-TO-STRING", "GUID/=", "GUID<", "GUID<=", "GUID=", "GUID>", "GUID>=", "HASH-TABLE-COUNT", "HASH-TABLE-ITERATOR-DONE-P",
            "HASH-TABLE-ITERATOR-HASH-TABLE", "HASH-TABLE-ITERATOR-KEY", "HASH-TABLE-ITERATOR-NEXT", "HASH-TABLE-ITERATOR-P", "HASH-TABLE-ITERATOR-VALUE", "HASH-TABLE-P", "HASH-TABLE-SIZE",
            "HASH-TABLE-TEST", "IDENTITY", "IGNORE", "IGNORE-ERRORS", "IMPORT", "IN-PACKAGE", "INFINITY-P", "INPUT-STREAM-P", "INT/", "INTEGER-DECODE-FLOAT", "INTEGER-LENGTH", "INTEGERP",
            "INTERACTIVE-STREAM-P", "INTERN", "INTERNAL-REAL-TIME-HAS-ARRIVED?", "INTERRUPT-PROCESS", "INTERSECTION", "ISQRT", "JAVA-CALL", "JAVA-CLASS", "JAVA-CONSTRUCTOR", "JAVA-METHOD", "JAVA-NEW",
            "JAVA-OBJECT-P", "JAVA-STATIC", "KEYWORDP", "KILL-PROCESS", "LAST", "LDB", "LDB-TEST", "LDIFF", "LENGTH", "LENGTH-WITH-CUTOFF", "LISP-IMPLEMENTATION-TYPE", "LISP-IMPLEMENTATION-VERSION",
            "LIST", "LIST*", "LIST-ALL-PACKAGES", "LIST-LENGTH", "LISTEN", "LISTP", "LOAD", "LOCK-IDLE-P", "LOCK-NAME", "LOCK-P", "LOCK-PACKAGE", "LOG", "LOG-MESSAGE", "LOGAND", "LOGANDC1",
            "LOGANDC2", "LOGBITP", "LOGCOUNT", "LOGEQV", "LOGIOR", "LOGNAND", "LOGNOR", "LOGNOT", "LOGORC1", "LOGORC2", "LOGTEST", "LOGXOR", "LONG-SITE-NAME", "LOOP", "LOW-MEMORY-CALLBACKS",
            "LOWER-CASE-P", "MACHINE-INSTANCE", "MACHINE-TYPE", "MACHINE-VERSION", "MACRO-OPERATOR-P", "MACROEXPAND", "MACROEXPAND-1", "MAKE-BROADCAST-STREAM", "MAKE-CONCATENATED-STREAM",
            "MAKE-DATE-RELATIVE-GUID", "MAKE-DIRECTORY", "MAKE-DISPATCH-MACRO-CHARACTER", "MAKE-ECHO-STREAM", "MAKE-HASH-TABLE", "MAKE-HASH-TABLE-ITERATOR", "MAKE-INSTANCE", "MAKE-KEYWORD",
            "MAKE-LIST", "MAKE-LOCK", "MAKE-METHOD", "MAKE-PACKAGE", "MAKE-PRIVATE-BROADCAST-STREAM", "MAKE-PRIVATE-CONCATENATED-STREAM", "MAKE-PRIVATE-ECHO-STREAM",
            "MAKE-PRIVATE-STRING-INPUT-STREAM", "MAKE-PRIVATE-STRING-OUTPUT-STREAM", "MAKE-PRIVATE-SYNONYM-STREAM", "MAKE-PRIVATE-TWO-WAY-STREAM", "MAKE-PROCESS", "MAKE-STRING",
            "MAKE-STRING-INPUT-STREAM", "MAKE-STRING-OUTPUT-STREAM", "MAKE-SYMBOL", "MAKE-SYNONYM-STREAM", "MAKE-TWO-WAY-STREAM", "MAKE-VECTOR", "MAKUNBOUND", "MAPC", "MAPCAN", "MAPCAR", "MAPCON",
            "MAPHASH", "MAPL", "MAPLIST", "MAX", "MEMBER", "MEMBER-IF", "MEMBER-IF-NOT", "MIN", "MINUSP", "MISMATCH", "MOD", "MULTIPLE-VALUE-LIST", "MUST", "NBUTLAST", "NCONC", "NEW-GUID",
            "NINTERSECTION", "NINTH", "NON-CIRCULAR-LIST-P", "NOT-A-NUMBER-P", "NOTIFY", "NOTIFY-USER", "NRECONC", "NREVERSE", "NSET-DIFFERENCE", "NSET-EXCLUSIVE-OR", "NSTRING-CAPITALIZE",
            "NSTRING-DOWNCASE", "NSTRING-UPCASE", "NSUBLIS", "NSUBST", "NSUBST-IF", "NSUBST-IF-NOT", "NSUBSTITUTE", "NSUBSTITUTE-IF", "NSUBSTITUTE-IF-NOT", "NTH", "NTH-VALUE", "NTHCDR", "NULL",
            "NUMBER", "NUMBERP", "NUNION", "ODDP", "OPEN", "OPEN-BINARY", "OPEN-STREAM-P", "OPEN-TCP-STREAM", "OPEN-TEXT", "OUTPUT-STREAM-P", "PACKAGE-LOCKED-P", "PACKAGE-NAME", "PACKAGE-NICKNAMES",
            "PACKAGE-SHADOWING-SYMBOLS", "PACKAGE-USE-LIST", "PACKAGE-USED-BY-LIST", "PACKAGEP", "PAIRLIS", "PARSE-INTEGER", "PCASE", "PCOND", "PEEK-CHAR", "PIF", "PLUSP", "POSITION", "POSITION-IF",
            "POSITION-IF-NOT", "PRIN1", "PRIN1-TO-STRING", "PRINC", "PRINC-TO-STRING", "PRINT", "PRINT-OBJECT", "PRINT-UNREADABLE-OBJECT", "PROBE-FILE", "PROCESS-ACTIVE-P", "PROCESS-BLOCK",
            "PROCESS-NAME", "PROCESS-PRIORITY", "PROCESS-STATE", "PROCESS-UNBLOCK", "PROCESS-WAIT", "PROCESS-WAIT-WITH-TIMEOUT", "PROCESS-WHOSTATE", "PROCESSP", "PROCLAIM", "PROGN", "PUNLESS", "PUT",
            "PUTF", "PWHEN", "QUOTE", "RANDOM", "RASSOC", "RASSOC-IF", "RASSOC-IF-NOT", "READ", "READ-BYTE", "READ-CHAR", "READ-CHAR-NO-HANG", "READ-DELIMITED-LIST", "READ-FROM-STRING",
            "READ-FROM-STRING-IGNORING-ERRORS", "READ-IGNORING-ERRORS", "READ-LINE", "READ-PRESERVING-WHITESPACE", "READ-SEQUENCE", "READTABLE-CASE", "READTABLEP", "REGISTER-LOW-MEMORY-CALLBACK",
            "REM", "REMF", "REMHASH", "REMOVE", "REMOVE-DUPLICATES", "REMOVE-IF", "REMOVE-IF-NOT", "REMPROP", "RENAME-FILE", "REPLACE", "REPORT-ERROR", "REST", "RESTART-PROCESS", "RET", "REVAPPEND",
            "REVERSE", "ROOM", "ROUND", "RPLACA", "RPLACD", "SCALE-FLOAT", "SEARCH", "SECOND", "SEED-RANDOM", "SEQUENCEP", "SET", "SET-AREF", "SET-CHAR", "SET-CONSING-STATE", "SET-DIFFERENCE",
            "SET-DISPATCH-MACRO-CHARACTER", "SET-EXCLUSIVE-OR", "SET-FILE-POSITION", "SET-MACRO-CHARACTER", "SET-NTH", "SET-PROCESS-PRIORITY", "SET-SYNTAX-FROM-CHAR", "SETHASH", "SETQ", "SEVENTH",
            "SHORT-SITE-NAME", "SHOW-PROCESSES", "SIMPLE-READER-ERROR", "SIN", "SIXTH", "SLEEP", "SOFTWARE-TYPE", "SOFTWARE-VERSION", "SORT", "SQRT", "STABLE-SORT", "STREAM-ELEMENT-TYPE", "STREAMP",
            "STRING", "STRING-CAPITALIZE", "STRING-DOWNCASE", "STRING-EQUAL", "STRING-GREATERP", "STRING-LEFT-TRIM", "STRING-LESSP", "STRING-NOT-EQUAL", "STRING-NOT-GREATERP", "STRING-NOT-LESSP",
            "STRING-RIGHT-TRIM", "STRING-TO-GUID", "STRING-TRIM", "STRING-UPCASE", "STRING/=", "STRING<", "STRING<=", "STRING=", "STRING>", "STRING>=", "STRINGP", "SUBLIS", "SUBSEQ", "SUBSETP",
            "SUBST", "SUBST-IF", "SUBST-IF-NOT", "SUBSTITUTE", "SUBSTITUTE-IF", "SUBSTITUTE-IF-NOT", "SXHASH", "SXHASH-ROT", "SYMBOL-FUNCTION", "SYMBOL-NAME", "SYMBOL-PACKAGE", "SYMBOL-PLIST",
            "SYMBOL-VALUE", "SYMBOLP", "SYNONYM-STREAM-SYMBOL", "TAILP", "TAN", "TENTH", "TERPRI", "THIRD", "THROW", "TIME-FROM-NOW", "TIME-HAS-ARRIVED?", "TREE-EQUAL", "TRUE", "TRUNCATE",
            "TWO-WAY-STREAM-INPUT-STREAM", "TWO-WAY-STREAM-OUTPUT-STREAM", "TYPE-OF", "UNEXPORT", "UNINTERN", "UNION", "UNREAD-CHAR", "UPPER-CASE-P", "USER-CONFIRM", "VALID-PROCESS-P", "VALUES",
            "VARIABLE-INFORMATION", "VECTOR", "VECTORP", "VISIT-DEFSTRUCT", "VISIT-DEFSTRUCT-OBJECT", "VOLATILE", "WARN", "WITH-BINARY-FILE", "WITH-ERROR-HANDLER", "WITH-INPUT-FROM-STRING",
            "WITH-LOCK-HELD", "WITH-OPEN-FILE", "WITH-OPEN-STREAM", "WITH-PRIVATE-BINARY-FILE", "WITH-PRIVATE-TEXT-FILE", "WITH-PROCESS-RESOURCE-TRACKING", "WITH-SIMPLE-RESTART",
            "WITH-STANDARD-IO-SYNTAX", "WITH-STATIC-AREA", "WITH-SUBLISP-ERROR-HANDLING", "WITH-TEXT-FILE", "WRITE", "WRITE-BYTE", "WRITE-CHAR", "WRITE-IMAGE", "WRITE-LINE", "WRITE-SEQUENCE",
            "WRITE-STRING", "WRITE-TO-STRING", "ZEROP", "OTHERWISE", "LAMBDA", "&ALLOW-OTHER-KEYS", "&AUX", "&BODY", "&ENVIRONMENT", "&KEY", "&OPTIONAL", "&REST", "&WHOLE", "FACCESS", "VACCESS",
            "PRIVATE", "PROTECTED", "PUBLIC", "INLINE", "NOTINLINE", "OPTIMIZE-FUNCALL", "AND", "OR", "NOT", "FIXNUM", "BIGNUM", "FLOAT", "CHARACTER", "STRING", "PACKAGE", "SYMBOL", "CONS", "VECTOR",
            "HASH-TABLE", "FUNCTION", "STREAM", "PROCESS", "LOCK", "READTABLE", "GUID", "DOUBLE-FLOAT", "SINGLE-FLOAT", "INTEGER", "NUMBER", "NULL", "LIST", "SEQUENCE", "QUIT", "*DTP-BIGNUM*",
            "*DTP-CHARACTER*", "*DTP-CONS*", "*DTP-FIXNUM*", "*DTP-FLOAT*", "*DTP-FUNCTION*", "*DTP-GUID*", "*DTP-HASH-TABLE*", "*DTP-JASM-PSDOP*", "*DTP-JASMLX*", "*DTP-JAVA-DESCRIPTOR*",
            "*DTP-JAVA-OPCODE*", "*DTP-JVMCD-ASSIST*", "*DTP-JVMCODE*", "*DTP-JVMDBG-CONTEXT*", "*DTP-JVMDBG-FRAMEDESC*", "*DTP-JVMI*", "*DTP-LOCK*", "*DTP-PACKAGE*", "*DTP-PROCESS*",
            "*DTP-READ-TOKEN*", "*DTP-READTABLE*", "*DTP-STREAM*", "*DTP-STRING*", "*DTP-STRUCTURES-BAG*", "*DTP-SYMBOL*", "*DTP-VECTOR*", "*CURRENT-AREA*", "*SXHASH-METHOD-TABLE*", "GET-STATIC-AREA",
            "GET-THREAD-PRIVATE-AREA", "GET-WORKING-AREA", "LOCK-LOCKER", "NOTE-ACTIVITY", "NOTE-NUMERIC-PROGRESS", "NOTE-PERCENT-PROGRESS", "NOTING-ACTIVITY", "NOTING-NUMERIC-PROGRESS",
            "NOTING-PERCENT-PROGRESS", "PRINT-NOT-READABLE", "WITH-THREAD-PRIVATE-AREA", "WITH-TIMEOUT", "WITH-WORKING-AREA", "*STREAM-INITIAL-INPUT-BUFFER-SIZE*",
            "*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*", "SHORT-BIGNUM-P", "MEDIUM-BIGNUM-P", "LONG-BIGNUM-P", "FUNCALL-STATS", "CLEAR-FUNCALL-STATS", "PRINT-STACK-TRACE", "LIST-OF-ALL-ERRORS",
            "PRINT-ERROR-DETAILS", "*SHOULD-MEMORY-MAP-FILES?*", "INITIALIZE-SUBL-INTERFACE-FILE", "LOAD-EXTERNAL-CODE", "COPY-FILE", "*FORCE-ERROR-MESSAGE-OUTPUT?*",
            "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*", "INTERRUPT-MAIN-READ-LOOP", "SCHEDULE-CURRENT-PROCESS-FOR-TIMEOUT", "ENSURE-CURRENT-PROCESS-TIMEOUT-IS-CANCELLED", "DUMP-HEAP", "*NULL-INPUT*",
            "*NULL-OUTPUT*", "SYMBOL-IN-TREE-P", "UNQUOTED-SYMBOL-IN-TREE-P", "CONTENTS", // will trump SL:CONTENTS in pkg COMMON-LISP-USER.
            "ESSENTIAL", // will trump SL:ESSENTIAL in pkg COMMON-LISP-USER.
            "INIT-VALUE", // CYC will trump SL:INIT-VALUE in pkg COMMON-LISP-USER.
    };

    static public String[] subLispShareWithCL = { "*", "**", "***", "&ALLOW-OTHER-KEYS", "&AUX", "&BODY", "NIL", "T", "*PACKAGE*", "*PRINT-ARRAY*", "&ENVIRONMENT", "&KEY", "&OPTIONAL", "&REST",
            "&WHOLE", "*TERMINAL-IO*", "*TRACE-OUTPUT*", "*STANDARD-INPUT*", "*STANDARD-OUTPUT*",

            "BOOLE-1", // 2} will trump {constant special const SL:BOOLE-1", // 2} in pkg COMMON-LISP-USER.
            "BOOLE-2", // 3} will trump {constant special const SL:BOOLE-2", // 3} in pkg COMMON-LISP-USER.
            "BOOLE-AND", // 6} will trump {constant special const SL:BOOLE-AND", // 6} in pkg COMMON-LISP-USER.
            "BOOLE-ANDC1", // 12} will trump {constant special const SL:BOOLE-ANDC1", // 12} in pkg COMMON-LISP-USER.
            "BOOLE-ANDC2", // 13} will trump {constant special const SL:BOOLE-ANDC2", // 13} in pkg COMMON-LISP-USER.
            "BOOLE-C1", // 4} will trump {constant special const SL:BOOLE-C1", // 4} in pkg COMMON-LISP-USER.
            "BOOLE-C2", // 5} will trump {constant special const SL:BOOLE-C2", // 5} in pkg COMMON-LISP-USER.
            "BOOLE-CLR", // 0} will trump {constant special const SL:BOOLE-CLR", // 0} in pkg COMMON-LISP-USER.
            "BOOLE-EQV", // 9} will trump {constant special const SL:BOOLE-EQV", // 9} in pkg COMMON-LISP-USER.
            "BOOLE-IOR", // 7} will trump {constant special const SL:BOOLE-IOR", // 7} in pkg COMMON-LISP-USER.
            "BOOLE-NAND", // 10} will trump {constant special const SL:BOOLE-NAND", // 10} in pkg COMMON-LISP-USER.
            "BOOLE-NOR", // 11} will trump {constant special const SL:BOOLE-NOR", // 11} in pkg COMMON-LISP-USER.
            "BOOLE-ORC1", // 14} will trump {constant special const SL:BOOLE-ORC1", // 14} in pkg COMMON-LISP-USER.
            "BOOLE-ORC2", // 15} will trump {constant special const SL:BOOLE-ORC2", // 15} in pkg COMMON-LISP-USER.
            "BOOLE-SET", // 1} will trump {constant special const SL:BOOLE-SET", // 1} in pkg COMMON-LISP-USER.
            "BOOLE-XOR", // 8} will trump {constant special const SL:BOOLE-XOR", // 8} in pkg COMMON-LISP-USER.

            "OR", //
            "BIGNUM", //  SL:BIGNUM in pkg COMMON-LISP-USER.
            "BOOLEAN", //  {SL:BOOLEAN -SubLCompiledFunction-} in pkg COMMON-LISP-USER.
            "CHARACTER", //
            // SUBLOOPED "CLASS"  , //  CYC:CLASS in pkg COMMON-LISP-USER.
            "CONDITION", //  CYC:CONDITION in pkg COMMON-LISP-USER.
            "DEBUG", //  {SL:DEBUG -SubLCompiledFunction-} in pkg COMMON-LISP-USER.
            "DOUBLE-FLOAT", //  SL:DOUBLE-FLOAT in pkg COMMON-LISP-USER.
            "END-OF-FILE", //  SL:END-OF-FILE in pkg COMMON-LISP-USER.
            "FIXNUM", //  SL:FIXNUM in pkg COMMON-LISP-USER.
            "HASH-TABLE", //  SL:HASH-TABLE in pkg COMMON-LISP-USER.
            "IGNORE", //  {SL:IGNORE -SubLCompiledFunction-} in pkg COMMON-LISP-USER.
            "INLINE", //  SL:INLINE in pkg COMMON-LISP-USER.
            "INTEGER", //  SL:INTEGER in pkg COMMON-LISP-USER.
            "KEYWORD", //  CYC:KEYWORD in pkg COMMON-LISP-USER.
            "LAMBDA", //
            "MAKE-METHOD", //  {SL:MAKE-METHOD -SubLCompiledFunction-} in pkg COMMON-LISP-USER.
            // SUBLOOPED "METHOD"  , //  CYC:METHOD in pkg COMMON-LISP-USER.
            "NOTINLINE", //  SL:NOTINLINE in pkg COMMON-LISP-USER.
            "NUMBER", //  {SL:NUMBER -SubLCompiledFunction-} in pkg COMMON-LISP-USER.
            "OTHERWISE", //  SL:OTHERWISE in pkg COMMON-LISP-USER.
            "PACKAGE", //  SL:PACKAGE in pkg COMMON-LISP-USER.
            "PRINT-NOT-READABLE", //  {SL:PRINT-NOT-READABLE -SubLCompiledFunction-} in pkg COMMON-LISP-USER.
            "READER-ERROR", //  SL:READER-ERROR in pkg COMMON-LISP-USER.
            "READTABLE", //  SL:READTABLE in pkg COMMON-LISP-USER.
            "SEQUENCE", //  SL:SEQUENCE in pkg COMMON-LISP-USER.
            "SIMPLE-CONDITION", //  CYC:SIMPLE-CONDITION in pkg COMMON-LISP-USER.
            "SINGLE-FLOAT", //  SL:SINGLE-FLOAT in pkg COMMON-LISP-USER.
            "SPACE", //  CYC:SPACE in pkg COMMON-LISP-USER.
            "SPECIAL", //  CYC:SPECIAL in pkg COMMON-LISP-USER.
            "STREAM", //  SL:STREAM in pkg COMMON-LISP-USER.
            "STRUCTURE", //  CYC:STRUCTURE in pkg COMMON-LISP-USER.
            "SYMBOL", //  SL:SYMBOL in pkg COMMON-LISP-USER.
            "TYPE", //  SL:TYPE in pkg COMMON-LISP-USER.
            "VARIABLE", //  CYC:VARIABLE in pkg COMMON-LISP-USER.
            "WARNING", //  CYC:WARNING in pkg COMMON-LISP-USER.
            "INTERNAL-TIME-UNITS-PER-SECOND", "ACCESS-LOCK", // CYC:ACCESS-LOCK in pkg COMMON-LISP-USER.
            "AFTER-LISTENERS", // CYC:AFTER-LISTENERS in pkg COMMON-LISP-USER.
            "ANY-SLOTS", // CYC:ANY-SLOTS in pkg COMMON-LISP-USER.
            "BEFORE-LISTENERS", // CYC:BEFORE-LISTENERS in pkg COMMON-LISP-USER.
            // SYS:"BODY", // SL:BODY in pkg COMMON-LISP-USER.
            "BOOLEAN-SLOTS", // CYC:BOOLEAN-SLOTS in pkg COMMON-LISP-USER.
            "CHARACTER-SYNTAX", // {SL:CHARACTER-SYNTAX -SubLMacro-} in pkg COMMON-LISP-USER.
            "CLASS-INITIALIZATION-FUNCTION", // CYC:CLASS-INITIALIZATION-FUNCTION in pkg COMMON-LISP-USER.
            "CLASS-INITIALIZED-P", // CYC:CLASS-INITIALIZED-P in pkg COMMON-LISP-USER.
            "CLASS-METHOD-DECLS", // CYC:CLASS-METHOD-DECLS in pkg COMMON-LISP-USER.
            "CLASS-PROPERTIES", // CYC:CLASS-PROPERTIES in pkg COMMON-LISP-USER.
            "CLASS-VAR-DECLS", // CYC:CLASS-VAR-DECLS in pkg COMMON-LISP-USER.
            "COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST", // CYC:COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST in pkg COMMON-LISP-USER.
            "COMPILED-CLASS-METHOD-ACCESS-ALIST", // CYC:COMPILED-CLASS-METHOD-ACCESS-ALIST in pkg COMMON-LISP-USER.
            "COMPILED-CLASS-SLOT-ACCESS-ALIST", // CYC:COMPILED-CLASS-SLOT-ACCESS-ALIST in pkg COMMON-LISP-USER.
            "COMPILED-INHERITANCE-PATH", // CYC:COMPILED-INHERITANCE-PATH in pkg COMMON-LISP-USER.
            "COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST", // CYC:COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST in pkg COMMON-LISP-USER.
            "COMPILED-INSTANCE-METHOD-ACCESS-ALIST", // CYC:COMPILED-INSTANCE-METHOD-ACCESS-ALIST in pkg COMMON-LISP-USER.
            "COMPILED-INSTANCE-SLOT-ACCESS-ALIST", // CYC:COMPILED-INSTANCE-SLOT-ACCESS-ALIST in pkg COMMON-LISP-USER.
            "CONSTITUENT-TRAITS", // SL:CONSTITUENT-TRAITS in pkg COMMON-LISP-USER.
            "DEFINITION-LOCK", // CYC:DEFINITION-LOCK in pkg COMMON-LISP-USER.
            "DISPATCH-TABLES", // SL:DISPATCH-TABLES in pkg COMMON-LISP-USER.
            "FUNCTION-DEF", // CYC:FUNCTION-DEF in pkg COMMON-LISP-USER.
            "FUNCTION-NAME", // CYC:FUNCTION-NAME in pkg COMMON-LISP-USER.
            "ID", // CYC:ID in pkg COMMON-LISP-USER.
            "INSTANCE-INITIALIZATION-FUNCTION", // CYC:INSTANCE-INITIALIZATION-FUNCTION in pkg COMMON-LISP-USER.
            "INSTANCE-METHOD-DECLS", // CYC:INSTANCE-METHOD-DECLS in pkg COMMON-LISP-USER.
            "INSTANCE-VAR-DECLS", // CYC:INSTANCE-VAR-DECLS in pkg COMMON-LISP-USER.
            "INSTANTIATE-TEMPLATE", // CYC:INSTANTIATE-TEMPLATE in pkg COMMON-LISP-USER.
            "INTERFACE-NAMES", // CYC:INTERFACE-NAMES in pkg COMMON-LISP-USER.
            "INTERFACES", // CYC:INTERFACES in pkg COMMON-LISP-USER.
            "LAMBDA-LIST", // SL:LAMBDA-LIST in pkg COMMON-LISP-USER.
            "MACRO-FUNCTIONS", // SL:MACRO-FUNCTIONS in pkg COMMON-LISP-USER.
            "NAME", // SL:NAME in pkg COMMON-LISP-USER.
            "PARENT", // CYC:PARENT in pkg COMMON-LISP-USER.
            "PLIST", // CYC:PLIST in pkg COMMON-LISP-USER.
            "PROTECTION", // SL:PROTECTION in pkg COMMON-LISP-USER.
            "SCOPE", // CYC:SCOPE in pkg COMMON-LISP-USER.
            "SINGLE-BYTE-CHAR-SYNTAX", // SL:SINGLE-BYTE-CHAR-SYNTAX in pkg COMMON-LISP-USER.
            "SINGLE-BYTE-CONSTIT-TRAITS", // SL:SINGLE-BYTE-CONSTIT-TRAITS in pkg COMMON-LISP-USER.
            "SINGLE-BYTE-MACRO-FUNCTIONS", // SL:SINGLE-BYTE-MACRO-FUNCTIONS in pkg COMMON-LISP-USER.
            "SLOT-ACCESSOR-ALIST", // CYC:SLOT-ACCESSOR-ALIST in pkg COMMON-LISP-USER.
            "SUBCLASSES", // CYC:SUBCLASSES in pkg COMMON-LISP-USER.
            "SYNCHRONIZED-SLOTS-P", // CYC:SYNCHRONIZED-SLOTS-P in pkg COMMON-LISP-USER.
            "TABLIFIED-INSTANCE-METHODS", // CYC:TABLIFIED-INSTANCE-METHODS in pkg COMMON-LISP-USER.
            "UPDATE-TYPE", // CYC:UPDATE-TYPE in pkg COMMON-LISP-USER.
            "*FEATURES*", "SETQ", };

    // public SubLString name;
    //
    @Override
    public Package toLispObject() {
        return (Package) (Object) this;
    }
    //
    // private static class RetrievalStr {
    // private String str;
    //
    // @Override
    // public boolean equals(Object obj) {
    // return obj.equals(str);
    // }
    //
    // @Override
    // public int hashCode() {
    // return str.hashCode();
    // }
    // }
    //
    // SubLPackage(SubLString name, SubLList useList, SubLList nickNames) {
    // usesPackagesList = new ArrayList<SubLPackage>();
    // usedByPackagesList = new ArrayList<SubLPackage>();
    // this.nickNames = new ArrayList<SubLString>();
    // shadowingSymbols = new ArrayList<SubLSymbol>();
    // exportedSymbols = new HashSet<SubLSymbol>();
    // isLocked = false;
    // symbolNameToSymbolMap = new HashMap<SubLString, SubLSymbol>();
    // init(name, useList, nickNames);
    // }

    private static void exportSublispSymbols() {

        for (String name : subLispShareWithCL) {
            Symbol symbol = Lisp.PACKAGE_SYS.findAccessibleSymbol(name);
            if (symbol == null)
                symbol = Lisp.PACKAGE_EXT.findAccessibleSymbol(name);
            if (symbol == null)
                symbol = Lisp.PACKAGE_CL.internAndExport(name);
            SUBLISP_PACKAGE.importSymbol(symbol);
            SUBLISP_PACKAGE.export(symbol);
        }

        reserveSubLispSymbols();
    }

    static boolean internedSubLispSymbols = false;

    /**
     *
     */
    synchronized public static void reserveSubLispSymbols() {
        if (internedSubLispSymbols)
            return;
        internedSubLispSymbols = true;
        for (String name : reserveSubLisp) {
            SubLPackage.SUBLISP_PACKAGE.internAndExport(name);
        }
    }

    public static SubLPackage findPackageNamed(String packageName) {
        synchronized (SubLPackage.PACKAGE_LOCK) {
            return (SubLPackage) (Object) org.armedbear.lisp.Packages.findPackage(packageName);
        }
    }

    public static SubLPackage findPackageNamed(SubLString packageName) {
        return findPackageNamed(packageName.getStringValue());
    }

    // public static SubLList getAllPackages() {
    // return SubLPackage.allPackages;
    // }

    //	public static SubLPackage getCurrentPackage() {
    //		SubLSymbol sym = Packages.$package$;
    //		if (sym == SubLNil.NIL) {
    //			return null;
    //		}
    //		SubLObject v = sym.getDynamicValue();
    //		if (v == SubLT.T) {
    //			return Lisp.getCurrentPackage();
    //		}
    //		return v.toPackage();
    //	}

    public static void initPackages() {
        // SubLPackage.KEYWORD_PACKAGE = new
        // Package(SubLObjectFactory.makeString("KEYWORD"), SubLNil.NIL,
        // SubLNil.NIL);
        // SubLPackage.SUBLISP_PACKAGE = new
        // Package(SubLObjectFactory.makeString("SUBLISP"), SubLNil.NIL,
        // SubLObjectFactory.makeList(1, SubLObjectFactory.makeString("SL")));
        // SubLPackage.CYC_PACKAGE = new
        // Package(SubLObjectFactory.makeString("CYC"),
        // SubLObjectFactory.makeList(1, SubLPackage.SUBLISP_PACKAGE),
        // SubLNil.NIL);
        // SubLPackage.SUBLISP_PACKAGE.symbolNameToSymbolMap.put(SubLNil.NIL.getSubLName(),
        // SubLNil.NIL);
        // SubLPackage.SUBLISP_PACKAGE.symbolNameToSymbolMap.put(SubLT.T.getSubLName(),
        // SubLT.T);
        SubLMain.preInitLisp();
        SUBLISP_PACKAGE = (SubLPackage) (Object) Lisp.PACKAGE_SUBLISP;
        CYC_PACKAGE = (SubLPackage) (Object) Lisp.PACKAGE_CYC;
        KEYWORD_PACKAGE = (SubLPackage) (Object) Lisp.PACKAGE_KEYWORD;
        SUBLISP_PACKAGE.toPackage().importSymbol(SubLT.T);
        SUBLISP_PACKAGE.toPackage().importSymbol(Lisp.NIL);
        assert CYC_PACKAGE.findSymbol("T") == SubLT.T;
        exportSublispSymbols();
        Debug.assertTrue(CYC_PACKAGE.findSymbol("T") == SubLT.T);
        SubLPackage.SUBLISP_PACKAGE.toPackage().setLocked();
    }

    public static SubLPackage setCurrentPackage(String packageName) {
        return setCurrentPackage(SubLObjectFactory.makeString(packageName));
    }

    public static void setCurrentPackage(SubLPackage thePackage) {
        if (thePackage == null)
            return;
        SubLPackage was = getCurrentPackage();
        if (thePackage == was)
            return;
        if (Symbol._PACKAGE_ != null) {
            Symbol._PACKAGE_.setValue( thePackage);
        }
        if (Packages.$package$ != null && Packages.$package$!=Symbol._PACKAGE_)
            Packages.$package$.setValue(thePackage.toPackage());
    }

    public static SubLPackage setCurrentPackage(SubLString packageName) {
        SubLPackage thePackage = findPackageNamed(packageName);
        if (thePackage == null)
            Errors.error("Unabled to switch to package: " + packageName + ".");
        setCurrentPackage(thePackage);
        return thePackage;
    }

    // private SubLString name;
    // private ArrayList<SubLPackage> usesPackagesList;
    // private ArrayList<SubLPackage> usedByPackagesList;
    // private ArrayList<SubLString> nickNames;
    // private ArrayList<SubLSymbol> shadowingSymbols;
    // private Set<SubLSymbol> exportedSymbols;
    private boolean isLocked;
    // private Map<SubLString, SubLSymbol> symbolNameToSymbolMap;
    public static String PACKAGE_TYPE_NAME = "PACKAGE";
    // private static RetrievalStr retrievalStr;
    // private static SubLList allPackages;
    // private static HashMap<SubLString, SubLPackage> packageNameToPackageMap;
    // private static HashMap<String, SubLPackage>
    // packageNameToPackageMapNative;
    private static Object PACKAGE_LOCK;
    public static SubLPackage KEYWORD_PACKAGE;
    public static SubLPackage SUBLISP_PACKAGE;
    public static SubLPackage CYC_PACKAGE;
    static {
        // retrievalStr = new RetrievalStr();
        // packageNameToPackageMap = new HashMap<SubLString, SubLPackage>(32);
        // packageNameToPackageMapNative = new HashMap<String, SubLPackage>(32);
        PACKAGE_LOCK = new Object();
        SubLPackage.KEYWORD_PACKAGE = null;
        SubLPackage.SUBLISP_PACKAGE = null;
        SubLPackage.CYC_PACKAGE = null;
    }
    //
    // private void addUsedBy(SubLPackage thePackage) {
    // synchronized (SubLPackage.PACKAGE_LOCK) {
    // usedByPackagesList.add(thePackage);
    // }
    // }

    private void aproposListInternal(SubLString pattern, ArrayList<SubLSymbol> symbols) {
        synchronized (SubLPackage.PACKAGE_LOCK) {
            for (Object ontry : getLocalSymbols()) {
                Symbol entry = (Symbol) ontry;
                SubLObject result = Sequences.search(pattern, entry
                        .getSubLName(), CommonSymbols.EQUALP, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
                if (result != SubLNil.NIL)
                    symbols.add(entry);
            }
        }
    }
    //
    // private void init(SubLString name, SubLList useList, SubLList nickNames)
    // {
    // if (name == null || "".equals(name.getStringValue()))
    // Errors.error("Got invalid package name.");
    // name =
    // SubLObjectFactory.makeString(AbstractSubLSymbol.canonicalizeName(name.getStringValue()));
    // useList = useList.asConsList();
    // nickNames = nickNames.asConsList();
    // synchronized (SubLPackage.PACKAGE_LOCK) {
    // if (SubLPackage.packageNameToPackageMap.get(name) != null)
    // Errors.error("A package named " + name + " already exists.");
    // this.name = name;
    // for (SubLObject cur = nickNames; cur != SubLNil.NIL; cur = cur.rest()) {
    // SubLString nickName = cur.first().toStr();
    // if (SubLPackage.packageNameToPackageMap.get(nickName) != null)
    // Errors.error("A package named " + nickName + " already exists.");
    // if (!this.nickNames.contains(nickName))
    // this.nickNames.add(nickName.toStr());
    // }
    // for (SubLObject cur = useList; cur != SubLNil.NIL; cur = cur.rest()) {
    // SubLObject curPackageName = cur.first();
    // SubLPackage curPackage = null;
    // try {
    // if (curPackageName.isString())
    // curPackage = findPackageNamed(curPackageName.toStr());
    // else if (curPackageName.isPackage())
    // curPackage = curPackageName.toPackage();
    // else
    // Errors.error("Got invalid package spec: " + curPackageName);
    // } catch (Exception e) {
    // Errors.error("Error while creating a package.", e);
    // }
    // if (curPackage != null)
    // if (!usesPackagesList.contains(curPackage))
    // usesPackagesList.add(curPackage);
    // }
    // if (SubLPackage.allPackages == null)
    // SubLPackage.allPackages = SubLObjectFactory.makeList(1, this);
    // else
    // SubLPackage.allPackages = SubLPackage.allPackages.push(this);
    // SubLPackage.packageNameToPackageMap.put(name, this);
    // SubLPackage.packageNameToPackageMapNative.put(name.getStringValue(),
    // this);
    // SubLString curNickName = null;
    // for (SubLObject cur2 = nickNames; cur2 != SubLNil.NIL; cur2 =
    // cur2.rest())
    // try {
    // curNickName = cur2.first().toStr();
    // SubLPackage.packageNameToPackageMap.put(curNickName, this);
    // SubLPackage.packageNameToPackageMapNative.put(curNickName.getStringValue(),
    // this);
    // } catch (Exception e2) {
    // Errors.cerror("Continue.", "Error while attempting to add package
    // nickname: " + curNickName, e2);
    // }
    // }
    // for (SubLObject cur3 = useList; cur3 != SubLNil.NIL; cur3 = cur3.rest())
    // {
    // SubLPackage thePackage = cur3.first().toPackage();
    // thePackage.addUsedBy(this);
    // }
    // }

    // private SubLSymbol retrieveSymbolInternal(SubLString symbolName) {
    // synchronized (SubLPackage.PACKAGE_LOCK) {
    // SubLSymbol result = symbolNameToSymbolMap.get(symbolName);
    // if (result != null)
    // return result;
    // for (int i = 0, size = usesPackagesList.size(); i < size; ++i) {
    // SubLPackage used = usesPackagesList.get(i);
    // result = used.retrieveSymbol(symbolName);
    // if (result != null && used.isExported(result))
    // return result;
    // }
    // return null;
    // }
    // }

    public SubLList aproposList(SubLString pattern) {
        ArrayList<SubLSymbol> symbols = new ArrayList<SubLSymbol>();
        synchronized (SubLThread.getInterruptLock()) {
            boolean needsInterruption = Threads.forciblyHandleInterrupts();
            try {
                aproposListInternal(pattern, symbols);
            } finally {
                if (needsInterruption)
                    SubLProcess.currentProcess().interrupt();
            }
        }
        return SubLObjectFactory.makeList(symbols);
    }

    @Override
    public boolean canFastHash() {
        return true;
    }
    //
    // public void exportSymbol(SubLObject symbol) {
    // exportedSymbols.add(symbol.toSymbol());
    // }

    public void exportSymbols(SubLObject arg) {
      if (arg instanceof Cons) {
        if(arg.first().isString()) {
          export(arg.first().getString(),checkSymbol((LispObject) arg.rest()));
          return;
        }
        for (SubLObject list = arg; list != NIL; list = list.rest())
          exportSymbols(list.first());
    } else
      export(checkSymbol((LispObject) arg));
    }

    /**
     * TODO Describe the purpose of this method.
     * @param string
     * @param checkSymbol
     */
    protected abstract void export(String string, Symbol checkSymbol);
    // abstract public Set<SubLSymbol> getAllSymbols() ;
    abstract public String getName();

    abstract public SubLString getNameAsSubLString();
    //
    // public SubLList getNickNames() {
    // return SubLObjectFactory.makeList(nickNames);
    // }

    // public SubLList getShadowingSymbols() {
    // Errors.unimplementedMethod("SubLPackage.getShadowingSymbols");
    // return SubLObjectFactory.makeList(shadowingSymbols);
    // }

    @Override
    public SubLSymbol getType() {
        return Types.$dtp_package$;
    }

    @Override
    public SubLFixnum getTypeCode() {
        return CommonSymbols.ONE_INTEGER;
    }
    //
    // public SubLList getUsedByPackagesList() {
    // return SubLObjectFactory.makeList(usedByPackagesList);
    // }
    //
    // public SubLList getUsesPackagesList() {
    // return SubLObjectFactory.makeList(usesPackagesList);
    // }

    @Override
    public int hashCode(int currentDepth) {
        if (currentDepth < 8)
            return superHash();
        return 0;
    }

    public abstract void importSymbol(SubLObject symbol);

    public void importSymbols(SubLObject symbols) {
        Errors.unimplementedMethod("SubLPackage.importSymbols");
    }

    public SubLSymbol intern(SubLString symbolName, boolean forcePackageUpdate) {
        return internAndExport(symbolName, forcePackageUpdate);
    }

    @Override
    public boolean isAlien() {
        return false;
    }

    @Override
    public boolean isAtom() {
        return true;
    }

    @Override
    public boolean isBigIntegerBignum() {
        return false;
    }

    @Override
    public boolean isBignum() {
        return false;
    }

    @Override
    public boolean isBoolean() {
        return false;
    }

    @Override
    public boolean isChar() {
        return false;
    }

    @Override
    public boolean isCons() {
        return false;
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public boolean isEnvironment() {
        return false;
    }

    @Override
    public boolean isError() {
        return false;
    }

    abstract public boolean isExported(SubLSymbol symbol);

    @Override
    public boolean isFixnum() {
        return false;
    }

    @Override
    public boolean isFunction() {
        return false;
    }

    @Override
    public boolean isFunctionSpec() {
        return false;
    }

    @Override
    public boolean isGuid() {
        return false;
    }

    @Override
    public boolean isHashtable() {
        return false;
    }

    @Override
    public boolean isHashtableIterator() {
        return false;
    }

    @Override
    public boolean isIntBignum() {
        return false;
    }

    @Override
    public boolean isInteger() {
        return false;
    }

    @Override
    public boolean isKeyhash() {
        return false;
    }

    @Override
    public boolean isKeyhashIterator() {
        return false;
    }

    @Override
    public boolean isKeyword() {
        return false;
    }

    @Override
    public boolean isList() {
        return false;
    }

    @Override
    public boolean isLock() {
        return false;
    }

    public boolean isLocked() {
        return isLocked;
    }

    @Override
    public boolean isLongBignum() {
        return false;
    }

    @Override
    public boolean isMacroOperator() {
        return false;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public boolean isPackage() {
        return true;
    }

    @Override
    public boolean isPackageIterator() {
        return false;
    }

    @Override
    public boolean isProcess() {
        return false;
    }

    @Override
    public boolean isReadWriteLock() {
        return false;
    }

    @Override
    public boolean isRegexPattern() {
        return false;
    }

    @Override
    public boolean isSemaphore() {
        return false;
    }

    @Override
    public boolean isSequence() {
        return false;
    }

    @Override
    public boolean isStream() {
        return false;
    }

    @Override
    public boolean isString() {
        return false;
    }

    @Override
    public boolean isStructure() {
        return false;
    }

    @Override
    public boolean isSymbol() {
        return false;
    }

    @Override
    public boolean isVector() {
        return false;
    }
    //
    // public SubLSymbol retrieveSymbol(SubLString symbolName) {
    // synchronized (SubLThread.getInterruptLock()) {
    // boolean needsInterruption = Threads.forciblyHandleInterrupts();
    // try {
    // return retrieveSymbolInternal(symbolName);
    // } finally {
    // if (needsInterruption)
    // SubLProcess.currentProcess().interrupt();
    // }
    // }
    // }

    public void setLocked() {
        isLocked = true;
    }

    @Override
    public SubLPackage toPackage() {
        return this;
    }

    @Override
    public String printObjectImpl() {
    	checkReadable();
        return "#<The " + getName() + " package" + (isLocked() ? "!>" : ">");
    }

    @Override
    public String toTypeName() {
        return "PACKAGE";
    }
    //
    // public void unexportSymbol(SubLObject symbol) {
    // exportedSymbols.remove(symbol.toSymbol());
    // }

    public void unexportSymbols(SubLObject symbols) {
        Errors.unimplementedMethod("SubLPackage.unexportSymbols");
    }
    //
    // public boolean unintern(SubLSymbol symbol) {
    // Errors.unimplementedMethod("SubLPackage.unintern");
    // return false;
    // }

    public List<SubLSymbol> worldInitializedSymbols() {
        ArrayList<SubLSymbol> symbols = new ArrayList<SubLSymbol>();
        symbols.addAll(SubLFiles.symbolInitializationOrder());
        Iterator<SubLSymbol> itSymbol = symbols.iterator();
        while (itSymbol.hasNext()) {
            SubLSymbol symbol = itSymbol.next();
            if (symbol.getPackage() != this)
                itSymbol.remove();
            else {
                if (CommonSymbols.WORLD == symbol.getProperty(CommonSymbols.INITIALIZATION_TYPE))
                    continue;
                itSymbol.remove();
            }
        }
        return symbols;
    }

    @Override
    abstract public LispObject typeOf();

    @Override
    abstract public LispObject classOf();

    @Override
    abstract public LispObject getDescription();

    abstract public String toDebugString();

    abstract public Symbol findInternalSymbol(AbstractString name);

    abstract public Symbol findInternalSymbol(String name);

    abstract public Symbol findExternalSymbol(AbstractString name);

    abstract public Symbol findExternalSymbol(String name);

    abstract public Symbol findExternalSymbol(AbstractString name, int hash);

    // Returns null if symbol is not accessible in this package.
    abstract public Symbol findAccessibleSymbol(String name);

    // Returns null if symbol is not accessible in this package.
    abstract public Symbol findAccessibleSymbol(AbstractString name);

    abstract public LispObject findSymbol(String name);

    // Helper function to add NIL to PACKAGE_CL.
    abstract public void addSymbol_ImplUseOnly(Symbol symbol);

    abstract public Symbol addInternalSymbol(String symbolName);

    abstract public Symbol addExternalSymbol(String symbolName);

    abstract public Symbol intern(AbstractString symbolName);

    abstract public Symbol intern(String symbolName);

    abstract public Symbol intern(AbstractString s, LispThread thread);

    abstract public Symbol internAndExport(String symbolName);

    abstract public Symbol internAndExport(SubLString symbolName, boolean updatePackage);

    abstract public LispObject unintern(SubLSymbol symbol);

    abstract public void importSymbol(Symbol symbol);

    abstract public void export(Symbol symbol);

    abstract public void unexport(Symbol symbol);

    abstract public void shadow(String symbolName);

    abstract public void shadowingImport(Symbol symbol);

    // "USE-PACKAGE causes PACKAGE to inherit all the external symbols of
    // PACKAGES-TO-USE. The inherited symbols become accessible as internal
    // symbols of PACKAGE."
    abstract public void usePackage(Package pkg);

    abstract public void unusePackage(Package pkg);

    /*
     * abstract public void addNickname(String s); abstract public LispObject
     * NAME(); abstract public LispObject getPropertyList(); abstract public
     * void setPropertyList(LispObject obj); abstract public SubLList
     * getNicknames(); abstract public boolean delete(); abstract public void
     * rename(String newName, LispObject newNicks);
     */

    abstract public String getNickname();

    abstract public LispObject packageNicknames();

    abstract public LispObject getUseList();

    abstract public boolean uses(LispObject pkg);

    abstract public LispObject getUsedByList();

    abstract public LispObject getLocalPackageNicknames();

    abstract public LispObject addLocalPackageNickname(String name, Package pack);

    abstract public LispObject removeLocalPackageNickname(String name);

    abstract public void removeLocalPackageNicknamesForPackage(Package p);

    abstract public Collection<Package> getLocallyNicknamedPackages();

    // Find package named `name', taking local nicknames into account
    abstract public Package findPackage(String name);

    abstract public LispObject getShadowingSymbols();

    abstract public Collection getExternalSymbols();

    abstract public List<Symbol> getAccessibleSymbols();

    abstract public LispObject PACKAGE_INTERNAL_SYMBOLS();

    abstract public LispObject PACKAGE_EXTERNAL_SYMBOLS();

    abstract public LispObject PACKAGE_INHERITED_SYMBOLS();

    abstract public LispObject getSymbols();

    abstract public Symbol[] symbols();

    abstract public Object readResolve() throws ObjectStreamException;

    public SubLSymbol retrieveSymbol(SubLString name) {
        return toLispObject().findAccessibleSymbol(name);
    }

    abstract public Set getLocalSymbols();

    abstract public SubLObject getNickNames();

    abstract public String showShortName();

}
