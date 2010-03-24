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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLBigIntBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLLongBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLIntegerBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// External Imports
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import java.io.File;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Calendar;
import java.io.IOException;
import java.util.Iterator;

/**
 * <P>This JUnit test file will test the functionality of the
 * read-eval functionality used by SubLMain.
 * Search for occurrences of @diff to see all C/Allegro/CMUCL/Java differences.
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author pace
 * @date December 15, 2005, 3:22 PM
 * @version $Id: UnitTest.java 128954 2009-10-15 17:55:43Z tbrussea $
 */

public class UnitTest extends TestCase implements CommonSymbols {
  
  //// Constructors
  
  /** Creates a new instance of UnitTest. */
  public UnitTest(String name) {
    super(name);
  }
  
  //// Public Area
  
  public static void testSelfEvaluation() {
    // stub
    System.out.println();
    try {
      testOneSelfEvaluation("NIL");
      testOneSelfEvaluation("T");
      testOneSelfEvaluation("KEYWORD:FOO");
      testOneSelfEvaluation(":FOO");
      testOneSelfEvaluation("212");
      testOneSelfEvaluation("#\\a");
      testOneSelfEvaluation("\"foo\"");
      testOneSelfEvaluation("99999999999999999999999999999999999999999999999");
      testOneSelfEvaluation("3.14159265357989");
      
      testOneNonSelfEvaluation("(identity 212)");
      testOneNonSelfEvaluation("(progn)");
      
    } catch (AssertionFailedError afe) {
      //afe.printStackTrace(System.out);
      throw afe;
    }
  }
  
  public static void testNilEvaluation() {
    testEvalEqualsObj(NIL, "NIL");
  }
  
  public static void testSimpleFunctionEvaluation() {
    testEvalEquals("NIL", "(identity nil)");
    testEvalEquals("NIL", "(IDENTITY nil)");
    testEvalEquals("NIL", "(iDeNtIty nil)");
    testEvalEquals("212", "212");
    testEvalEquals("212", "(identity 212)");
    testEvalEquals("212", "(identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity 212)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
    testEvalEquals(":foo", "(identity :foo)");
  }
  
  public static void testErrorEvaluation() {
    testEvalError("(identity)");
    testEvalError("(identity 1 2)");
    testEvalError("(identity 1 . 2)");
  }

  public static void testCMerge() {
    testEvalEquals("'(1)", "(cmerge '(1) nil #'<)");
    testEvalEquals("'(1)", "(cmerge nil '(1) #'<)");
    testEvalEquals("'(1 2)", "(cmerge '(1 2) nil #'<)");
    testEvalEquals("'(1 2)", "(cmerge  nil '(1 2) #'<)");
    testEvalEquals("'(1 2)", "(cmerge  '(1) '(2) #'<)");
    testEvalEquals("'(1 2)", "(cmerge  '(2) '(1) #'<)");
    testEvalEquals("'(1 2 3)", "(cmerge  nil '(1 2 3) #'<)");
    testEvalEquals("'(1 2 3)", "(cmerge  '(1 2 3) nil  #'<)");
    testEvalEquals("'(1 2 3)", "(cmerge  '(1 2) '(3) #'<)");
    testEvalEquals("'(1 2 3)", "(cmerge  '(1 3) '(2) #'<)");
    testEvalEquals("'(1 2 3)", "(cmerge  '(2 3) '(1) #'<)");
    testEvalEquals("'(1 2 3)", "(cmerge  '(1) '(2 3) #'<)");
    testEvalEquals("'(1 2 3)", "(cmerge  '(2) '(1 3) #'<)");
    testEvalEquals("'(1 2 3)", "(cmerge  '(3) '(1 2) #'<)");
    testEvalEquals("'(1 2 3 4 5)", "(cmerge  '(2 4) '(1 3 5) #'<)");
    testEvalEquals("'(1 2 3 4 5)", "(cmerge  '(1 3 5) '(2 4)  #'<)");
    testEvalEquals("'(1 2 3 4 5 6)", "(cmerge  '(1 2 5 6) '(3 4)  #'<)");
    testEvalEquals("'(1 2 3 4 5 6)", "(cmerge  '(3 4) '(1 2 5 6)   #'<)");
    // @note following result is not strictly defined by Lisp in this instance
    testEvalEquals("'(3 4 5 6 1 2)", "(cmerge  '(3 4) '(5 6 1 2)   #'<)");
  }
  
  public static void testOptionalArgEvaluation() {
    //@hack thing of a better function to use -- process 
    //id's are very nebulous thing in JRTL and likely to change -APB
    testEvalEquals("0", "(get-process-id 212)");
    testEvalEquals("0", "(get-process-id)");
    testEvalError("(get-process-id 1 2)");
    testEvalError("(get-process-id . 1)");
    testEvalError("(get-process-id 1 . 2)");
  }
  
  public static void testRestArgEvaluation() {
    testEvalEquals("212", "(+ 1 211)");
    testEvalEquals("212", "(identity (+ (identity 1) (identity 211)))");
    testEvalEquals("212", "(+ 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1)");
    testEvalError("(+ 1 . 2)");
  }
  
  public static void testQuote() {
    testEvalEquals("NIL", "(quote NIL)");
    testEvalEquals("212", "(quote 212)");
    testEvalEquals("\"Foo\"", "(quote \"Foo\")");
    testEvalEquals("(quote (1 2 3))", "(identity (quote (1 2 3)))");
    testEvalEquals("NIL", "'NIL");
    testEvalEquals("212", "'212");
    testEvalEquals("\"Foo\"", "'\"Foo\"");
    testEvalEquals("(quote (1 2 3))", "(identity '(1 2 3))");
    testEvalEquals("NIL", "(quote)"); // @diff C/Allegro/Java yield NIL but CMUCL errors
    testEvalEquals("1", "(quote 1 2)"); // @diff C/Allegro/Java yield 1 but CMUCL errors
    testEvalEquals("1", "(quote 1 . 2)"); // @diff C/Allegro/Java yield 1 but CMUCL errors
  }
  
  public static void testProgn() {
    testEvalEquals("NIL", "(progn)");
    testEvalEquals("212", "(progn 212)");
    testEvalEquals("212", "(progn 1 2 3 212)");
    testEvalEquals("212", "(progn 1 2 3 (identity (progn 4 (identity 212))))");
    testEvalError("(progn . 212)");
  }

  public static void testReadloopErrorHandling() {
    // @todo test restarts with errors, cerrors and break
    /*
    (clet ((result 0))
      (with-simple-restart (:outer "outer target")
        (with-simple-restart (:inner "inner target")
          (aref (vector 1 2 3) 10) ;; java internal error
          (csetq result  (+ result 1)))
        (csetq result (+ result 10)))
      (csetq result (+ result 100))
      result)
    (clet ((result 0))
      (with-simple-restart (:outer "outer target")
        (with-simple-restart (:inner "inner target")
          (/ 0) ;; subl exception
          (aref (vector 1 2 3) 10)
          (csetq result  (+ result 1)))
        (csetq result (+ result 10)))
      (csetq result (+ result 100))
      result)
    (clet ((result 0))
      (with-simple-restart (:outer "outer target")
        (with-simple-restart (:inner "inner target")
          (break "blah")
          (csetq result  (+ result 1)))
        (csetq result (+ result 10)))
      (csetq result (+ result 100))
      result)
    (clet ((result 0))
      (with-simple-restart (:outer "outer target")
        (with-simple-restart (:inner "inner target")
          (cerror "blah")
          (csetq result  (+ result 1)))
        (csetq result (+ result 10)))
      (csetq result (+ result 100))
      result)
     */
    // @todo test ignore breaks
    // @todo test break on error
  }

  public static void testPif() {
    testEvalEquals("1", "(pif t 1 2)");
    testEvalEquals("2", "(pif nil 1 2)");
    testEvalEquals("1", "(pif (identity t) 1 2)");
    testEvalEquals("2", "(pif (identity nil) 1 2)");
    testEvalEquals("2", "(pif t (progn 1 2) nil)");
    testEvalEquals("2", "(pif nil nil (progn 1 2))");
    testEvalEquals("NIL", "(pif)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalEquals("NIL", "(pif t)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalEquals("1", "(pif t 1)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalEquals("1", "(pif t 1 2 3)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalError("(pif . t)");
    testEvalError("(pif t . 1)");
    testEvalEquals("1", "(pif t 1 . 2)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalError("(pif nil 1 . 2)");
    testEvalEquals("1", "(pif t 1 2 . 3)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalEquals("2", "(pif nil 1 2 . 3)"); // @diff Allegro and CMUCL error, C and Java don't
  }
  
  public static void testPwhen() {
    testEvalEquals("NIL", "(pwhen t)");
    testEvalEquals("NIL", "(pwhen nil)");
    testEvalEquals("NIL", "(pwhen nil 212)");
    testEvalEquals("NIL", "(pwhen (identity nil) 212)");
    testEvalEquals("212", "(pwhen t 212)");
    testEvalEquals("212", "(pwhen 42 212)");
    testEvalEquals("212", "(pwhen 42 1 2 3 212)");
    testEvalEquals("212", "(pwhen 42 1 2 3 (progn 212))");
    testEvalEquals("NIL", "(pwhen)"); // @diff C and Java yield NIL, Allegro and CMUCL error
    testEvalError("(pwhen . 1)");
    testEvalError("(pwhen 1 . 2)"); // @diff C/Allegro/Java yield NIL, CMUCL errors
    testEvalEquals("NIL", "(pwhen NIL 2 . 3)"); // @diff C/Allegro/Java yield NIL, CMUCL errors
    //testEvalError("(pwhen 1 2 . 3)");
  }
  
  public static void testPunless() {
    testEvalEquals("NIL", "(punless t)");
    testEvalEquals("NIL", "(punless nil)");
    testEvalEquals("NIL", "(punless t 212)");
    testEvalEquals("NIL", "(punless (identity 212) 212)");
    testEvalEquals("212", "(punless nil 212)");
    testEvalEquals("212", "(punless (identity nil) 212)");
    testEvalEquals("212", "(punless nil 1 2 3 212)");
    testEvalEquals("212", "(punless nil 1 2 3 (progn 212))");
    testEvalEquals("NIL", "(punless)"); // @diff C and Java yield NIL, Allegro and CMUCL error
    testEvalError("(punless . 1)");
    testEvalEquals("nil", "(punless 1 . 2)"); // @diff C/Allegro/Java yield NIL, CMUCL errors
    testEvalEquals("NIL", "(punless 1 2 . 3)"); // @diff C/Allegro/Java yield NIL, CMUCL errors
    //testEvalError("(punless nil 2 . 3)");
  }
  
  public static void testPcond() {
    testEvalEquals("NIL", "(pcond)");
    testEvalEquals("NIL", "(pcond ())");
    testEvalEquals("NIL", "(pcond nil)");
    testEvalEquals("212", "(pcond (t 212))");
    testEvalEquals("212", "(pcond ((identity t) 212))");
    testEvalEquals("212", "(pcond (nil nil) (t 212))");
    testEvalEquals("212", "(pcond (nil nil) ((identity t) 212))");
    testEvalEquals("212", "(pcond (nil nil) (212))");
    testEvalEquals("NIL", "(pcond (nil 212) (212 nil))");
    testEvalEquals("212", "(pcond (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (t 212))");
    testEvalEquals("NIL", "(pcond (nil 212) (212 4 3 2 1 nil))");
    testEvalEquals("NIL", "(pcond (nil 212) (212 4 3 2 1 nil) (t t))");
    testEvalEquals("NIL", "(pcond nil (nil 212))");
    testEvalEquals("212", "(pcond nil (t 212))");
    testEvalError("(pcond 1)");
    testEvalError("(pcond . 1)");
    testEvalEquals("NIL", "(pcond nil)"); // @diff Allegro and Java yield NIL, C and CMUCL error
    testEvalError("(pcond nil . 1)");
    testEvalError("(pcond (nil nil) 1)");
    testEvalError("(pcond (nil nil) . 1)");
  }
  
  public static void testLexicalVariables() {
    // @todo add more once we have csetq
    testEvalEquals("NIL", "*");
  }
  
  public static void testDynamicVariables() {
    // @todo add more once we have clet
    // commented this test out it started failing. not sure what it's supposed to do --APB
    //testEvalEquals("212", "***");
  }
  public static void testCsetq() {
    testEvalEquals("212", "(csetq x 212)");
    testEvalEquals("212", "x");
    testEvalEquals("212", "(csetq x 0 y 212)");
    testEvalEquals("0", "x");
    testEvalEquals("212", "y");
    testEvalEquals("212", "(csetq x 0 x 212)");
    testEvalEquals("212", "x");
    testEvalEquals("3", "(csetq x (+ 1 2))");
    testEvalEquals("42", "(csetq *** 42)");
    testEvalError("(csetq)");
    testEvalError("(csetq . 1)");
    testEvalError("(csetq 1)");
    testEvalError("(csetq x)");
    testEvalError("(csetq 1 . 2)");
    testEvalError("(csetq x . 2)");
    testEvalError("(csetq 1 2)");
    testEvalError("(csetq 1 2 . 3)");
    testEvalError("(csetq x 2 y)");
    testEvalError("(csetq x 2 y . 4)");
    testEvalError("(csetq x 2 y 4 z)");
    testEvalError("(csetq x 2 y 4 z . 6)");
  }
  
  public static void testClet() {
    testEvalEquals("NIL", "(clet)"); // @diff C and Java yield NIL, Allegro and CMUCL error
    testEvalEquals("NIL", "(clet ())");
    testEvalEquals("212", "(clet () 212)");
    // clet local variables
    testEvalEquals("212", "(clet ((x 212)) x)");
    testEvalEquals("212", "(clet ((x 210)(y 2)) (+ x y))");
    testEvalEquals("212", "(clet ((x 210))(clet ((y 2)) (+ x y)))");
    testEvalEquals("212", "(clet ((x 0))(clet ((x 212)) x))");
    testEvalEquals("212", "(clet ((x 212))(clet ((x 0))) x)");
    // clet dynamic variables
    testEvalEquals("T",   "(clet ((*** t)) ***)");
    testEvalEquals("212", "(clet ((*** 212)) ***)");
    testEvalEquals("212", "(clet ((*** 210)(y 2)) (+ *** y))");
    testEvalEquals("212", "(clet ((*** 210))(clet ((y 2)) (+ *** y)))");
    testEvalEquals("212", "(clet ((*** 0))(clet ((*** 212)) ***))");
    testEvalEquals("212", "(clet ((*** 212))(clet ((*** 0))) ***)");
    // clet + csetq
    testEvalEquals("212", "(csetq x 212)");
    testEvalEquals("212", "x");
    testEvalEquals("1", "(clet ((x 0)) (csetq x (+ x 1)) x)");
    testEvalEquals("212", "x");
    // ill-formed
    testEvalError("(clet 1)");
    testEvalError("(clet x)");
    testEvalError("(clet 1 . 2)");
    testEvalError("(clet x . 2)");
    testEvalError("(clet (x) . x)");
    testEvalError("(clet ((x . 2)) x)");
    testEvalError("(clet ((x 2) (y . 4)) x)");
  }
  
  public static void testCunwindProtect() {
    testEvalEquals("2", "(cunwind-protect (+ 1 1))");
    testEvalEquals("1", "(cunwind-protect 1 2 3)");
    testEvalEquals("0", "(csetq x 0)");
    testEvalEquals("0", "x");
    testEvalEquals("1", "(cunwind-protect (csetq x 1))");
    testEvalEquals("1", "x");
    testEvalEquals("NIL", "(cunwind-protect (progn)(csetq x 2))");
    testEvalEquals("2", "x");
    testEvalEquals("3", "(cunwind-protect (csetq x 3)(csetq x 4))");
    testEvalEquals("4", "x");
    testEvalError("(cunwind-protect (error \"error\")(csetq x 5))");
    testEvalEquals("5", "x");
    testEvalError("(cunwind-protect (progn (error \"foo\")(csetq x 6)))");
    testEvalEquals("5", "x");
    testEvalEquals("NIL", "(cunwind-protect)"); // @diff C and Java yield NIL, Allegro and CMUCL error
    testEvalError("(cunwind-protect . 1)");
    testEvalError("(cunwind-protect 1 . 2)");
    //testEvalError("(cunwind-protect 1 2 . 3)");
  }
  
  public static void testCcatch() {
    testEvalEquals("0", "(csetq x 0)");
    testEvalEquals("0", "x");
    testEvalEquals("NIL", "(ccatch :foo x)");
    testEvalEquals("0", "x");
    testEvalEquals("2", "(ccatch :foo x (+ 1 1))");
    testEvalEquals("0", "x");
    testEvalEquals("3", "(ccatch :foo x (throw :foo 3))");
    testEvalEquals("3", "x");
    testEvalEquals("4", "(ccatch :foo x (ccatch :bar x (throw :foo 4)))");
    testEvalEquals("4", "x");
    testEvalEquals("5", "(clet ((y 0) x)(ccatch :foo x (cunwind-protect (throw :foo 4)(csetq y 5))) y)");
    testEvalError("(ccatch)");
    testEvalError("(ccatch 1)");
    testEvalError("(ccatch . 1)");
    testEvalError("(ccatch 1 . 2)");
    testEvalError("(ccatch 1 2 3)");
    testEvalError("(ccatch 1 2 . 3)");
  }
  
  public static void testMultipleValues() {
    Values.resetMultipleValues();
    Values.values(ONE_INTEGER);
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    testEvalEqualsObj(Values.getMultipleValues(), "'(1)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1)");
    Values.values(ONE_INTEGER, TWO_INTEGER);
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2)");
    Values.values(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER);
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3)");
    Values.values(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER);
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    assertEquals(FOUR_INTEGER, Values.fourthMultipleValue());
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4)");
    Values.values(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER);
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    assertEquals(FOUR_INTEGER, Values.fourthMultipleValue());
    assertEquals(FIVE_INTEGER, Values.fifthMultipleValue());
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5)");
    Values.values(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
      SIX_INTEGER);
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    assertEquals(FOUR_INTEGER, Values.fourthMultipleValue());
    assertEquals(FIVE_INTEGER, Values.fifthMultipleValue());
    assertEquals(SIX_INTEGER, Values.sixthMultipleValue());
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6)");
    Values.values(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
      SIX_INTEGER, SEVEN_INTEGER);
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    assertEquals(FOUR_INTEGER, Values.fourthMultipleValue());
    assertEquals(FIVE_INTEGER, Values.fifthMultipleValue());
    assertEquals(SIX_INTEGER, Values.sixthMultipleValue());
    assertEquals(SEVEN_INTEGER, Values.seventhMultipleValue());
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7)");
    Values.values(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
      SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER);
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    assertEquals(FOUR_INTEGER, Values.fourthMultipleValue());
    assertEquals(FIVE_INTEGER, Values.fifthMultipleValue());
    assertEquals(SIX_INTEGER, Values.sixthMultipleValue());
    assertEquals(SEVEN_INTEGER, Values.seventhMultipleValue());
    assertEquals(EIGHT_INTEGER, Values.eighthMultipleValue());
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8)");
    Values.values(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
    SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER});
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    assertEquals(FOUR_INTEGER, Values.fourthMultipleValue());
    assertEquals(FIVE_INTEGER, Values.fifthMultipleValue());
    assertEquals(SIX_INTEGER, Values.sixthMultipleValue());
    assertEquals(SEVEN_INTEGER, Values.seventhMultipleValue());
    assertEquals(EIGHT_INTEGER, Values.eighthMultipleValue());
    assertEquals(NINE_INTEGER, Values.nthMultipleValue(8));
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9)");
    Values.values(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
    SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER});
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    assertEquals(FOUR_INTEGER, Values.fourthMultipleValue());
    assertEquals(FIVE_INTEGER, Values.fifthMultipleValue());
    assertEquals(SIX_INTEGER, Values.sixthMultipleValue());
    assertEquals(SEVEN_INTEGER, Values.seventhMultipleValue());
    assertEquals(EIGHT_INTEGER, Values.eighthMultipleValue());
    assertEquals(NINE_INTEGER, Values.nthMultipleValue(8));
    assertEquals(ZERO_INTEGER, Values.nthMultipleValue(9));
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9 0)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9 0)");
    testEvalEquals("1", "(values 1 2 3 4 5 6 7 8 9 0)");
    assertEquals(ONE_INTEGER, Values.firstMultipleValue());
    assertEquals(TWO_INTEGER, Values.secondMultipleValue());
    assertEquals(THREE_INTEGER, Values.thirdMultipleValue());
    assertEquals(FOUR_INTEGER, Values.fourthMultipleValue());
    assertEquals(FIVE_INTEGER, Values.fifthMultipleValue());
    assertEquals(SIX_INTEGER, Values.sixthMultipleValue());
    assertEquals(SEVEN_INTEGER, Values.seventhMultipleValue());
    assertEquals(EIGHT_INTEGER, Values.eighthMultipleValue());
    assertEquals(NINE_INTEGER, Values.nthMultipleValue(8));
    assertEquals(ZERO_INTEGER, Values.nthMultipleValue(9));
    testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9 0)");
    testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9 0)");
    Values.resetMultipleValues();
  }
  
  private static final SubLObject testCmultipleValueBindHelper(){
    return Values.values(new SubLObject[] {NIL, TWO_INTEGER, NIL});
  }
  
  public static void testCmultipleValueBind() {
    // multiple value return in general
    shouldPrintTests("Checking whether multiple value returns work properly ....");
    readAndEval("(define fetcher (x y z) (ret (values x y z)))");
    {
      Values.resetMultipleValues();
      testEvalEquals("1","(fetcher 1 2 3)");
      SubLObject val1 = SubLProcess.nthMultipleValue(ONE_INTEGER);
      SubLObject val2 = SubLProcess.nthMultipleValue(TWO_INTEGER);
      Values.resetMultipleValues();
      testEvalEquals("2", val1.toString());
      testEvalEquals("3", val2.toString());
    }
    {
      Values.resetMultipleValues();
      SubLObject firstVal = testCmultipleValueBindHelper();
      SubLObject secondVal = SubLProcess.nthMultipleValue(ONE_INTEGER);
      SubLObject thirdVal = SubLProcess.nthMultipleValue(TWO_INTEGER);
      assertEquals(firstVal, NIL);
      assertEquals(secondVal, TWO_INTEGER);
      assertEquals(thirdVal, NIL);
    }
    // now test SubL forms
    testEvalEquals("NIL", "(cmultiple-value-bind () 1)");
    testEvalEquals("NIL", "(cmultiple-value-bind (x) 1)");
    testEvalEquals("1", "(cmultiple-value-bind (x) 1 x)");
    testEvalEquals("1", "(cmultiple-value-bind (x)(values 1) x)");
    testEvalEquals("NIL", "(cmultiple-value-bind (x y)(values 1) y)");
    testEvalEquals("1", "(cmultiple-value-bind (x y) (values 1 2) x)");
    testEvalEquals("2", "(cmultiple-value-bind (x y) (values 1 2) y)");
    testEvalEquals("2", "(cmultiple-value-bind (x y) (values 1 2 3) y)");
    testEvalEquals("2", "(clet ((x 2)) (cmultiple-value-bind (x) 1 x) x)");
    testEvalError("(cmultiple-value-bind)");
    testEvalError("(cmultiple-value-bind . 1)");
    testEvalError("(cmultiple-value-bind 1 2)");
    testEvalError("(cmultiple-value-bind nil . 2)");
    testEvalEquals("3", "(cmultiple-value-bind nil 2 3)"); // @diff CMUCL/Allegro/Java yield 3, but C errors
    testEvalError("(cmultiple-value-bind nil 2 . 3)");
    
  }
  
  /** copied-n-edited from testPif */
  public static void testFif() {
    testEvalEquals("1", "(fif t 1 2)");
    testEvalEquals("2", "(fif nil 1 2)");
    testEvalEquals("1", "(fif (identity t) 1 2)");
    testEvalEquals("2", "(fif (identity nil) 1 2)");
    testEvalEquals("2", "(fif t (progn 1 2) nil)");
    testEvalEquals("2", "(fif nil nil (progn 1 2))");
    testEvalEquals("NIL", "(fif)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalEquals("NIL", "(fif t)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalEquals("1", "(fif t 1)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalEquals("1", "(fif t 1 2 3)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalError("(fif . t)");
    testEvalError("(fif t . 1)");
    testEvalEquals("1", "(fif t 1 . 2)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalError("(fif nil 1 . 2)");
    testEvalEquals("1", "(fif t 1 2 . 3)"); // @diff Allegro and CMUCL error, C and Java don't
    testEvalEquals("2", "(fif nil 1 2 . 3)"); // @diff Allegro and CMUCL error, C and Java don't
  }
  
  public static void testBasicEquality() {
    // T and NIL
    testEvalEquals("T", "(eq t t)");
    testEvalEquals("T", "(eql t t)");
    testEvalEquals("T", "(equal t t)");
    testEvalEquals("T", "(equalp t t)");
    testEvalEquals("NIL", "(eq t nil)");
    testEvalEquals("NIL", "(eql t nil)");
    testEvalEquals("NIL", "(equal t nil)");
    testEvalEquals("NIL", "(equalp t nil)");
    testEvalError("(eq)");
    testEvalError("(eql)");
    testEvalError("(equal)");
    testEvalError("(equalp)");
    testEvalError("(eq 1)");
    testEvalError("(eql 1)");
    testEvalError("(equal 1)");
    testEvalError("(equalp 1)");
    testEvalError("(eq . 1)");
    testEvalError("(eql . 1)");
    testEvalError("(equal . 1)");
    testEvalError("(equalp . 1)");
    testEvalError("(eq 1 . 2)");
    testEvalError("(eql 1 . 2)");
    testEvalError("(equal 1 . 2)");
    testEvalError("(equalp 1 . 2)");
    testEvalError("(eq 1 2 3)");
    testEvalError("(eql 1 2 3)");
    testEvalError("(equal 1 2 3)");
    testEvalError("(equalp 1 2 3)");
    testEvalError("(eq 1 2 . 3)");
    testEvalError("(eql 1 2 . 3)");
    testEvalError("(equal 1 2 . 3)");
    testEvalError("(equalp 1 2 . 3)");
  }
  
  public static void testSymbolEquality() {
    testEvalEquals("T", "(eq (quote foo) (quote foo))");
    testEvalEquals("T", "(eql (quote foo) (quote foo))");
    testEvalEquals("T", "(equal (quote foo) (quote foo))");
    testEvalEquals("T", "(equalp (quote foo) (quote foo))");
    testEvalEquals("NIL", "(eq (quote foo) (quote bar))");
    testEvalEquals("NIL", "(eql (quote foo) (quote bar))");
    testEvalEquals("NIL", "(equal (quote foo) (quote bar))");
    testEvalEquals("NIL", "(equalp (quote foo) (quote bar))");
    /*testEvalEquals("NIL", "(eq (quote cyc:bar) (quote sl:bar))");
    testEvalEquals("NIL", "(eql (quote sl:bar) (quote cyc:bar))");
    testEvalEquals("NIL", "(equal (quote sublisp:bar) (quote CYC:bar))");
    testEvalEquals("NIL", "(equalp (quote SubLisp:bar) (quote cyc:bar))");
    testEvalEquals("t", "(eq (quote cyc::bar) (quote cyc:bar))");
    testEvalEquals("t", "(eql (quote sl:bar) (quote sl:bar))");
    testEvalEquals("t", "(equal (quote cyc:bar) (quote CYC:bar))");
    testEvalEquals("t", "(equalp (quote SubLisp:bar) (quote SL:bar))");
    testEvalEquals("T", "(eq (quote foo) (quote Cyc:foo))");
    testEvalEquals("T", "(eq (quote sl::foo) (quote SUBLISP:foo))");
    testEvalEquals("T", "(eql (quote foo) (quote Cyc:foo))");
    testEvalEquals("T", "(equal (quote foo) (quote cyc:foo))");
    testEvalEquals("T", "(equalp (quote foo) (quote cyc:foo))");
    testEvalEquals("T", "(eq (quote foo) (quote cyc:foo))");
    testEvalEquals("T", "(eql (quote foo) (quote cyc:foo))");
    testEvalEquals("T", "(equal (quote foo) (quote cyc:foo))");
    testEvalEquals("T", "(equalp (quote foo) (quote CYC:foo))");
    testEvalError("(eq (quote foo1:bar) (quote foo2:bar))");
    testEvalError("(eql (quote foo1:bar) (quote foo2:bar))");
    testEvalError("(equal (quote foo1:bar) (quote foo2:bar))");
    testEvalError("(equalp (quote foo1:bar) (quote foo2:bar))");*/
  }
  
  public static void testInterpretedSymbolProperties() {
    // defParameter
    testEvalEquals("(list :DYNAMIC :INITIALIZER)", 
            "(progn (defparameter *my-defparam*)" 
            + " (list (get '*my-defparam* :binding-type)" 
            + "       (get '*my-defparam* :initialization-type)))");
    // defVar
    testEvalEquals("(list :DYNAMIC :WORLD)", 
            "(progn (defvar *my-defvar*)" 
            + " (list (get '*my-defvar* :binding-type)" 
            + "       (get '*my-defvar* :initialization-type)))");
    // defLexical
    testEvalEquals("(list :LEXICAL :INITIALIZER)", 
            "(progn (deflexical *my-deflexical*)" 
            + " (list (get '*my-deflexical* :binding-type)" 
            + "       (get '*my-deflexical* :initialization-type)))");
    // defConstant
    testEvalEquals("(list :CONSTANT :INITIALIZER)", 
            "(progn (defconstant *my-defconstant*)" 
            + " (list (get '*my-defconstant* :binding-type)" 
            + "       (get '*my-defconstant* :initialization-type)))");
    // @todo when defglobal gets promoted to SubL, test it here as well
    /*
    testEvalEquals("(list :LEXICAL :WORLD)", 
            "(progn (defglobal *my-defglobal*)" 
            + " (list (get '*my-defglobal* :binding-type)" 
            + "       (get '*my-defglobal* :initialization-type)))");
     */
  }
  
  public static void testCompiledSymbolProperties() {
    // defparameter *polymorphic-type-hierarchy*
    testEvalEquals(":DYNAMIC","(get '*polymorphic-type-hierarchy* :binding-type)");
    testEvalEquals(":INITIALIZER","(get '*polymorphic-type-hierarchy* :initialization-type)");
    // defvar *package*
    testEvalEquals(":DYNAMIC","(get '*package* :binding-type)");
    testEvalEquals(":WORLD","(get '*package* :initialization-type)");
    // deflexical *sublis-watermark*
    testEvalEquals(":LEXICAL", "(get '*sublis-watermark* :binding-type)");
    testEvalEquals(":INITIALIZER", "(get '*sublis-watermark* :initialization-type)");
    // defconstant *pi*
    testEvalEquals(":CONSTANT", "(get '*pi* :binding-type)");
    testEvalEquals(":INITIALIZER", "(get '*pi* :initialization-type)");
    // @todo when defglobal gets promoted to SubL, test it here as well
    // defglobal *???*
    // testEvalEquals(":LEXICAL", "(get '*???* :binding-type)");
    // testEvalEquals(":WORLD", "(get '*???* :initialization-type)");
    
  }
  
  public static void testKeywordEquality() {
    testEvalEquals("T", "(eq keyword:foo :foo)");
    testEvalEquals("T", "(eql keyword:foo :foo)");
    testEvalEquals("T", "(equal keyword:foo :foo)");
    testEvalEquals("T", "(equalp keyword:foo :foo)");
    testEvalEquals("T", "(eq :foo keyword:foo)");
    testEvalEquals("T", "(eql :foo keyword:foo)");
    testEvalEquals("T", "(equal :foo keyword:foo)");
    testEvalEquals("T", "(equalp :foo keyword:foo)");
  }
  
  public static void testCharacterEquality() {
    testEvalEquals("T", "(eq #\\a #\\a)");
    testEvalEquals("T", "(eql #\\a #\\a)");
    testEvalEquals("T", "(equal #\\a #\\a)");
    testEvalEquals("T", "(equalp #\\a #\\a)");
    testEvalEquals("NIL", "(eq #\\a #\\b)");
    testEvalEquals("NIL", "(eql #\\a #\\b)");
    testEvalEquals("NIL", "(equal #\\a #\\b)");
    testEvalEquals("NIL", "(equalp #\\a #\\b)");
    testEvalEquals("NIL", "(eq #\\a #\\A)");
    testEvalEquals("NIL", "(eql #\\a #\\A)");
    testEvalEquals("NIL", "(equal #\\a #\\A)");
    testEvalEquals("T", "(equalp #\\a #\\A)");
  }
  
  public static void testStringEquality() {
    testEvalEquals("NIL", "(eq \"foo\" \"foo\")");
    testEvalEquals("NIL", "(eql \"foo\" \"foo\")");
    testEvalEquals("T", "(equal \"foo\" \"foo\")");
    testEvalEquals("T", "(equalp \"foo\" \"foo\")");
    testEvalEquals("NIL", "(eq \"foo\" \"FOO\")");
    testEvalEquals("NIL", "(eql \"foo\" \"FOO\")");
    testEvalEquals("NIL", "(equal \"foo\" \"FOO\")");
    testEvalEquals("T", "(equalp \"foo\" \"FOO\")");
  }
  
  public static void testFixnumEquality() {
    testEvalEquals("T", "(eq 212 212)");
    testEvalEquals("T", "(eql 212 212)");
    testEvalEquals("T", "(equal 212 212)");
    testEvalEquals("T", "(equalp 212 212)");
    testEvalEquals("NIL", "(eq 0 1)");
    testEvalEquals("NIL", "(eql 0 1)");
    testEvalEquals("NIL", "(equal 0 1)");
    testEvalEquals("NIL", "(equalp 0 1)");
    int maxFixnum = SubLNumberFactory.MAX_FIXNUM;
    testEvalEquals("T", "(eq " + maxFixnum + " " + maxFixnum + ")");
    testEvalEquals("T", "(eql " + maxFixnum + " " + maxFixnum + ")");
    testEvalEquals("T", "(equal " + maxFixnum + " " + maxFixnum + ")");
    testEvalEquals("T", "(equalp " + maxFixnum + " " + maxFixnum + ")");
    long minBignum = maxFixnum + 1;
    testEvalEquals("NIL", "(eq " + minBignum + " " + minBignum + ")");
    testEvalEquals("T", "(eql " + minBignum + " " + minBignum + ")");
    testEvalEquals("T", "(equal " + minBignum + " " + minBignum + ")");
    testEvalEquals("T", "(equalp " + minBignum + " " + minBignum + ")");
  }
  
  public static void testListEquality() {
    assertEquals(ConsesLow.list(ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER), ConsesLow.list(ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER).makeCopy());
    testEvalEquals("NIL", "(eq '(1 2 3) '(1 2 3))");
    testEvalEquals("NIL", "(eql '(1 2 3) '(1 2 3))");
    testEvalEquals("T", "(equal '(1 2 3) '(1 2 3))");
    testEvalEquals("T", "(equalp '(1 2 3) '(1 2 3))");
    testEvalEquals("NIL", "(eq '(1 2 3) '(3 2 1))");
    testEvalEquals("NIL", "(eql '(1 2 3) '(3 2 1))");
    testEvalEquals("NIL", "(equal '(1 2 3) '(3 2 1))");
    testEvalEquals("NIL", "(equalp '(1 2 3) '(3 2 1))");
    testEvalEquals("NIL", "(eq '(1 . 2) '(1 . 2))");
    testEvalEquals("NIL", "(eql '(1 . 2) '(1 . 2))");
    testEvalEquals("T", "(equal '(1 . 2) '(1 . 2))");
    testEvalEquals("T", "(equalp '(1 . 2) '(1 . 2))");
    testEvalEquals("NIL", "(eq '(1 . 2) '(1 . 3))");
    testEvalEquals("NIL", "(eql '(1 . 2) '(1 . 3))");
    testEvalEquals("NIL", "(equal '(1 . 2) '(1 . 3))");
    testEvalEquals("NIL", "(equalp '(1 . 2) '(1 . 3))");
    testEvalEquals("NIL", "(eq '(1 . 2) '(3 . 2))");
    testEvalEquals("NIL", "(eql '(1 . 2) '(3 . 2))");
    testEvalEquals("NIL", "(equal '(1 . 2) '(3 . 2))");
    testEvalEquals("NIL", "(equalp '(1 . 2) '(3 . 2))");
    testEvalEquals("NIL", "(eq '(1 . 2) '(1 2))");
    testEvalEquals("NIL", "(eql '(1 . 2) '(1 2))");
    testEvalEquals("NIL", "(equal '(1 . 2) '(1 2))");
    testEvalEquals("NIL", "(equalp '(1 . 2) '(1 2))");
    testEvalEquals("NIL", "(eq '(1) '(1 . NIL))");
    testEvalEquals("NIL", "(eql '(1) '(1 . NIL))");
    testEvalEquals("T", "(equal '(1) '(1 . NIL))");
    testEvalEquals("T", "(equalp '(1) '(1 . NIL))");
    testEvalEquals("NIL", "(eq '(1 2 (\"foo\")) '(1 2 (\"FOO\")))");
    testEvalEquals("NIL", "(eql '(1 2 (\"foo\")) '(1 2 (\"FOO\")))");
    testEvalEquals("NIL", "(equal '(1 2 (\"foo\")) '(1 2 (\"FOO\")))");
    testEvalEquals("T", "(equalp '(1 2 (\"foo\")) '(1 2 (\"FOO\")))");
    testEvalEquals("NIL", "(equal (cdr '(1 2 3)) (cdr '(1 2 3 4)))");
    shouldPrintTests("Testing Java equals() method on lists ....");
    SubLList listOne = readAndEval("(cdr '(1 2 3))").toList();
    SubLList listTwo = readAndEval("(cdr '(1 2 3 4))").toList();
    Assert.assertEquals( "equals() does the wrong thing on list prefixes!",
      false, listOne.equals(listTwo));
  }
  
  public static void testLambdaFunctions() {
    //testEvalError("");
    //testEvalEquals("", "");
    testEvalEquals("nil", "((lambda ()))");
    testEvalEquals("nil", "((lambda () (ret nil)))");
    testEvalEquals("nil", "((lambda () T))"); // this mirrors the expectation of a fallthrough (ret NIL)
    testEvalEquals("nil", "((lambda (x)) nil)");
    testEvalEquals("nil", "((lambda (x)) 212)");
    testEvalEquals("nil", "((lambda (x) (ret nil)) 212)");
    testEvalEquals("nil", "((lambda (x) (ret x)) nil)");
    testEvalEquals("212", "((lambda (x) (ret x)) 212)");
    testEvalEquals("#\\a", "((lambda (x) (ret x)) #\\a)");
    testEvalEquals("#\\B", "((lambda (x) (ret #\\B)) #\\a)");
    testEvalEquals("#\\C", "((lambda (x &optional (y #\\C)) (ret y)) #\\a)");
    testEvalEquals("(list #\\c #\\d #\\e)", "((lambda (x &optional (y #\\C) &rest z) (ret z)) #\\a #\\b #\\c #\\d #\\e)");
    testEvalEquals("6", "((LAMBDA (X) (ret (+ X X))) 3)");
    testEvalEquals("4", "((LAMBDA (X Y) (ret (+ X Y))) 1 3)");
    testEvalEquals("212", "((lambda () (ret 212)))");
    testEvalEquals("'(6 3)", "((lambda (&optional (a 2 b) (c (+ 1 2))) (ret (list a c))) 6)");
    testEvalEquals("t", "((lambda (&optional (a 2 b) (c 3 d) &rest x) (ret b)) 6)");
    testEvalEquals("nil", "((lambda (&optional (a 2 b) (c 3 d) &rest x) (ret d)) 6)");
    testEvalEquals("12", "((lambda (y z &optional (a 2 b) (c 3 d) &rest x) (ret (+ y z a c))) (+ 1 2) (identity 4) 2)");
    testEvalEquals("'(10 11 12)", "((lambda (y z &optional (a 2 b) (c 3 d) &rest x) (ret x)) (+ 1 2) (identity 4) 2 1 10 11 12)");
    testEvalEquals("'(6 t 3 nil nil)", "((lambda (&optional (a 2 b) (c 3 d) &rest x) (ret (list a b c d x))) 6)");
    testEvalEquals("'(6 t 3 t nil nil 4)", "((lambda (&optional (a 2 b) (c 3 d) e (f 4) &rest x) (ret (list a b c d x e f))) 6 3)");
    testEvalError("(())");
    testEvalError("((lambda))");
    testEvalError("((lambda ()) nil)");
    testEvalError("((lambda () 212) 3)");
    testEvalError("((lambda (x y) 212) 3)");
    testEvalError("((lambda (x y) 212) 3 4 5)");
  }
  
  public static void testNumberEquality() {
    testEvalEquals("NIL", "(equal 0 0.0)");
    testEvalEquals("T", "(= 0 0.0)");
  }
  
  public static void testNumberComparison() {
    testEvalEquals("T",   "(> 2 1)");
    testEvalEquals("NIL", "(> 1 2)");
    testEvalEquals("T",   "(>= 2 1)");
    testEvalEquals("NIL", "(>= 1 2)");
    testEvalEquals("NIL", "(< 2 1)");
    testEvalEquals("T",   "(< 1 2)");
    testEvalEquals("NIL", "(<= 2 1)");
    testEvalEquals("T",   "(<= 1 2)");
    testEvalEquals("T",   "(< 50000000000000 50000000000001)");
    testEvalEquals("NIL", "(> 50000000000000 50000000000001)");
    testEvalEquals("NIL", "(> 413696 17976931348623157)");
    testEvalEquals("NIL", "(> 413696 179769313486231570000)");
    testEvalEquals("NIL", "(> 413696 1797693134862315700000)");
    testEvalEquals("NIL", "(> 413696 17976931348623157000000)");
    testEvalEquals("NIL", "(> 413696 179769313486231570000000)"); // this is the first one that used to fail
    testEvalEquals("NIL", "(> 413696 1797693134862315700000000)");
    testEvalEquals("NIL", "(> 413696 17976931348623157000000000000)");
    testEvalEquals("NIL", "(> 413696 179769313486231570000000000000000)");
    testEvalEquals("NIL", "(> 413696 179769313486231570000000000000000000000)");
    testEvalEquals("NIL", "(> 413696 17976931348623157000000000000000000000000000000000000000000000000)");
    testEvalEquals("NIL", "(> 413696 1797693134862315700000000000000000000000000000000000000000000000000000000000000000000000000000000000)");
    testEvalEquals("NIL", "(> 413696 17976931348623157000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000)");
    testEvalEquals("NIL", "(> 413696 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000)");
    // @todo do more <, >, <=, >= etc for various sizes of numbers
  }
  
  public static void testNumberFormats() {
    //testEvalError("");
    //testEvalEquals("", "");
    testEvalOfType("0", SubLFixnum.class);
    testEvalOfType("-0", SubLFixnum.class);
    testEvalOfType("+6", SubLFixnum.class);
    testEvalOfType("28", SubLFixnum.class);
    testEvalOfType("1024.", SubLFixnum.class);
    testEvalOfType("15511210043330985984000000", SubLBigIntBignum.class);
    testEvalOfType("212", SubLFixnum.class);
    testEvalOfType("-212", SubLFixnum.class);
    testEvalOfType("212.", SubLFixnum.class);
    testEvalOfType("-212.", SubLFixnum.class);
    testEvalOfType("" + (int)(Integer.MAX_VALUE / 20), SubLIntegerBignum.class);
    testEvalOfType("" + (long)(Long.MAX_VALUE / 20), SubLLongBignum.class);
    testEvalOfType("9999999999999999999999999999999999999999999999999999", SubLBigIntBignum.class);
    testEvalOfType("#22R01H", SubLFixnum.class);
    testEvalOfType("#3r012", SubLFixnum.class);
    testEvalOfType("#3r012", SubLFixnum.class);
    testEvalEquals("212", "212.");
    testEvalEquals("+212", "212.");
    testEvalEquals("+212.", "212");
    testEvalEquals("+212", "212");
    testEvalEquals("212", "#2r11010100");
    testEvalEquals("212", "#b11010100");
    testEvalEquals("212", "#b+11010100");
    testEvalEquals("-212", "#b-11010100");
    testEvalEquals("212", "#o324");
    testEvalEquals("212", "#xD4");
    testEvalEquals("212", "#16r+D4");
    testEvalEquals("-192", "#O-300");
    testEvalEquals("-192", "#3r-21010");
    testEvalEquals("-192", "#25R-7H");
    testEvalEquals("181202413", "#xACCEDED");
    testEvalOfType("0E0", SubLDoubleFloat.class);
    testEvalOfType("+0E+0", SubLDoubleFloat.class);
    testEvalOfType("-0E-0", SubLDoubleFloat.class);
    testEvalOfType("+0E-0", SubLDoubleFloat.class);
    testEvalOfType("-0E+0", SubLDoubleFloat.class);
    testEvalOfType("+0E0", SubLDoubleFloat.class);
    testEvalOfType("0E+0", SubLDoubleFloat.class);
    testEvalOfType("-0E0", SubLDoubleFloat.class);
    testEvalOfType("-0E-0", SubLDoubleFloat.class);
    testEvalOfType("0.0", SubLDoubleFloat.class);
    testEvalOfType("-.0", SubLDoubleFloat.class);
    testEvalOfType("+.0", SubLDoubleFloat.class);
    testEvalOfType(".0", SubLDoubleFloat.class);
    testEvalOfType("0.0s0", SubLDoubleFloat.class);
    testEvalOfType("0.0S0", SubLDoubleFloat.class);
    testEvalOfType("0.0f0", SubLDoubleFloat.class);
    testEvalOfType("0.0F0", SubLDoubleFloat.class);
    testEvalOfType("0.0d0", SubLDoubleFloat.class);
    testEvalOfType("0.0D0", SubLDoubleFloat.class);
    testEvalOfType("0.0l0", SubLDoubleFloat.class);
    testEvalOfType("0.0L0", SubLDoubleFloat.class);
    testEvalOfType("0.0e0", SubLDoubleFloat.class);
    testEvalOfType("0.0E0", SubLDoubleFloat.class);
    testEvalEquals("1.0","1.0s0");
    testEvalEquals("1.0","1.0S0");
    testEvalEquals("1.0","1.0f0");
    testEvalEquals("1.0","1.0F0");
    testEvalEquals("1.0","1.0d0");
    testEvalEquals("1.0","1.0D0");
    testEvalEquals("1.0","1.0l0");
    testEvalEquals("1.0","1.0L0");
    testEvalEquals("1.0","1.0e0");
    testEvalEquals("1.0","1.0E0");
    testEvalOfType("3.141592653589793284d0", SubLDoubleFloat.class);
    testEvalOfType("6.02e+21", SubLDoubleFloat.class);
    testEvalOfType("602E+21", SubLDoubleFloat.class);
    testEvalOfType("3.101029995f-1", SubLDoubleFloat.class);
    testEvalOfType("-0.000000001s9", SubLDoubleFloat.class);
    testEvalEquals("4136.96", "(read-from-string \" 4136.96\")");
    testEvalEquals("'(100 3)", "(multiple-value-list (parse-integer \"100\"))");
    testEvalError("(multiple-value-list (parse-integer \"100t\"))");
    testEvalEquals("'(10 2)", "(multiple-value-list (parse-integer \"100t\" 0 2))");
    testEvalEquals("'(255 3)", "(multiple-value-list (parse-integer \"0ff\" 0 3 16))");
    testEvalEquals("'(32 3)", "(multiple-value-list (parse-integer \"32\n\"))");
    testEvalEquals("'(100 3)", "(multiple-value-list (parse-integer \"100t\" 0 4 10 t))");
  }
  
  public static void testCharacterFormats() {
    //testEvalError("");
    //testEvalEquals("", "");
    testEvalOfType("#\\Space", SubLCharacter.class);
    testEvalOfType("#\\SPACE", SubLCharacter.class);
    testEvalOfType("#\\sPaCe", SubLCharacter.class);
    testEvalOfType("#\\Newline", SubLCharacter.class);
    testEvalOfType("#\\NEWLINE", SubLCharacter.class);
    testEvalOfType("#\\NewLine", SubLCharacter.class);
    testEvalOfType("#\\Tab", SubLCharacter.class);
    testEvalOfType("#\\Backspace", SubLCharacter.class);
    testEvalOfType("#\\Linefeed", SubLCharacter.class);
    testEvalOfType("#\\Page", SubLCharacter.class);
    testEvalOfType("#\\Return", SubLCharacter.class);
    testEvalOfType("#\\Rubout", SubLCharacter.class);
    testEvalOfType("#\\Escape", SubLCharacter.class);
    testEvalOfType("#\\Esc", SubLCharacter.class);
    testEvalOfType("#\\a", SubLCharacter.class);
    testEvalOfType("#\\9", SubLCharacter.class);
    testEvalOfType("#\\A", SubLCharacter.class);
    testEvalOfType("#\\g", SubLCharacter.class);
    testEvalOfType("#\\Meta-Space", SubLCharacter.class);
    testEvalOfType("#\\ControL-A", SubLCharacter.class);
    testEvalOfType("#\\Control-Meta-Q", SubLCharacter.class);
    testEvalOfType("#\\MEta-\\a", SubLCharacter.class);
    testEvalOfType("#\\C-M-O", SubLCharacter.class);
    testEvalOfType("#\\meta-space", SubLCharacter.class);
    testEvalOfType("#\\meta-\\space", SubLCharacter.class);
    testEvalOfType("#\\m-\\space", SubLCharacter.class);
    testEvalOfType("#\\m-space", SubLCharacter.class);
    testEvalOfType("#\\control-d", SubLCharacter.class);
    testEvalOfType("#\\control-\\D", SubLCharacter.class);
    testEvalOfType("#\\c-\\e", SubLCharacter.class);
    testEvalOfType("#\\c-E", SubLCharacter.class);
    testEvalEquals("#\\SPACE", "#\\space");
    /* These don't work in Allegro:
     testEvalEquals("#\\META-(", "#\\meta-(");
     testEvalEquals("#\\META-(", "#\\meta-\\(");
     testEvalEquals("#\\META-(", "#\\m-(");
     testEvalEquals("#\\META-(", "#\\m-\\("); */
    testEvalNotEquals("#\\a", "#\\b");
    testEvalEquals("#\\a", "#\\a");
    testEvalNotEquals("#\\a", "#\\A");
    testEvalEquals("#\\meta-a", "#\\meta-a");
    testEvalNotEquals("#\\a", "#\\control-a");
    testEvalNotEquals("#\\a", "#\\meta-a");
    testEvalNotEquals("#\\meta-a", "#\\control-a");
    testEvalNotEquals("#\\meta-a", "#\\control-meta-a");
  }
  
  public static void testSymbolNames() {
    testEvalOfType("'|3|", SubLSymbol.class);
    testEvalOfType("'\\3", SubLSymbol.class);
    testEvalOfType("'|Ab|", SubLSymbol.class);
    testEvalOfType("'\\(", SubLSymbol.class);
    testEvalOfType("'\\+1", SubLSymbol.class);
    testEvalOfType("'+\\1", SubLSymbol.class);
    testEvalOfType("'\\frobboz", SubLSymbol.class);
    testEvalOfType("'2.14159\\s0", SubLSymbol.class);
    testEvalOfType("'2.14159\\S0", SubLSymbol.class);
    testEvalOfType("'APL\\360", SubLSymbol.class);
    testEvalOfType("'apl\\360", SubLSymbol.class);
    testEvalOfType("'\\(b^2\\)\\ -\\ 4*a*c", SubLSymbol.class);
    testEvalOfType("'\\(\\b^2\\)\\ -\\ 4*\\a*\\c", SubLSymbol.class);
    testEvalOfType("'|\"|", SubLSymbol.class);
    testEvalOfType("'|(b^2) - 4*a*c|", SubLSymbol.class);
    testEvalOfType("'|frobboz|", SubLSymbol.class);
    testEvalOfType("'|APL\\360|", SubLSymbol.class);
    testEvalOfType("'|APL\\\\360|", SubLSymbol.class);
    testEvalOfType("'|\\|\\||", SubLSymbol.class);
    testEvalOfType("'|(B*2) - 4*A*C|", SubLSymbol.class);
    testEvalOfType("'|(b*2) - 4*a*c|", SubLSymbol.class);
    testEvalEquals("'|Ab|", "'a\\b");
    testEvalEquals("'|AB|", "'ab");
    testEvalEquals("'AB", "'ab");
    testEvalEquals("'|B C|", "'b\\ c");
    testEvalEquals("'|3|", "'\\3");
    testEvalEquals("'|\\3|", "'\\3");
    testEvalEquals("':INTERNAL", 
        "(second (multiple-value-list (intern \"ALKJDFSDF2345245234545\" (find-package \"SUBLISP\")) (find-package \"SUBLISP\"))))");
    testEvalEquals("':INTERNAL", 
        "(second (multiple-value-list (find-symbol (symbol-name " 
        + "(intern \"ALKJDFSDF2345245234587\" (find-package \"SUBLISP\"))) (find-package \"SUBLISP\"))))");
  }
  
  public static void testStrings() {
    testEvalOfType("\"Foo\"", SubLString.class);
    testEvalOfType("\"\"", SubLString.class);
    testEvalOfType("\"\\\"APL\\\\360?\\\" he cried.\"", SubLString.class);
    testEvalOfType("\"|x| = |-x|\"", SubLString.class);
    testEvalOfType("\"ab\"", SubLString.class);
    testEvalOfType("\"\\a\\b\"", SubLString.class);
    testEvalEquals("\"ab\"", "\"\\a\\b\"");
    testEvalEquals("\"\\\\\"", "\"\\\\\"");
  }
  
  public static void testTypePredicates() {
    //testEvalEquals("", "");
    //testEvalNotEquals("", "");
    testEvalEquals("T", "(BOOLEANP ())");
    testEvalEquals("T", "(BOOLEANP ())");
    testEvalEquals("T", "(BOOLEANP ())");
    testEvalEquals("NIL", "(BOOLEANP 'foo)");
    testEvalEquals("NIL", "(BOOLEANP 4)");
    testEvalError("(BOOLEANP)");
    testEvalError("(BOOLEANP 4 4)");
    testEvalEquals("T", "(NULL ())");
    testEvalEquals("T", "(nuLL NIL)");
    testEvalEquals("NIL", "(null T)");
    testEvalEquals("NIL", "(NULL '(A B C))");
    testEvalEquals("NIL", "(NULL #\\a)");
    testEvalEquals("NIL", "(NULL #33ROOMBA)");
    testEvalEquals("NIL", "(NULL \"\")");
    testEvalEquals("T", "(SYMBOLP NIL)");
    testEvalEquals("T", "(SYMBOLP ())");
    testEvalEquals("T", "(SYMBOLP T)");
    testEvalEquals("T", "(SYMBOLP 'RUFFFF!!!!!!)");
    testEvalEquals("T", "(SYMBOLP 'a\\ b)");
    testEvalEquals("T", "(SYMBOLP ())");
    testEvalEquals("NIL", "(SYMBOLP '(A B C))");
    testEvalEquals("NIL", "(SYMBOLP #\\a)");
    testEvalEquals("NIL", "(SYMBOLP #33ROOMBA)");
    testEvalEquals("NIL", "(SYMBOLP \"bah humbug\")");
    testEvalEquals("NIL", "(SYMBOLP 212)");
    testEvalEquals("T", "(ATOM \"howdy partner\")");
    testEvalEquals("T", "(ATOM NIL)");
    testEvalEquals("NIL", "(ATOM '(A B C))");
    testEvalEquals("T", "(CONSP '(A B C))");
    testEvalEquals("NIL", "(CONSP ())");
    testEvalEquals("NIL", "(CONSP NIL)");
    testEvalEquals("NIL", "(CONSP 212)");
    testEvalEquals("NIL", "(CONSP \"DARTH VADER\")");
    testEvalEquals("T", "(listp '(A B C))");
    testEvalEquals("T", "(listp ())");
    testEvalEquals("T", "(liStp NIL)");
    testEvalEquals("NIL", "(listp 212)");
    testEvalEquals("NIL", "(LISTP \"DARTH VADER\")");
    testEvalEquals("T", "(sequencep '(A B C))");
    testEvalEquals("T", "(sequencep ())");
    testEvalEquals("T", "(sequencep NIL)");
    testEvalEquals("NIL", "(sequencep 212)");
    // @todo add tests for sequencep on strings and vectors -APB
    //testEvalEquals("T", "(SEQUENCEP \"DARTH VADER\")");
    //testEvalEquals("T", "(SEQUENCEP \"DARTH VADER\")");
    testEvalEquals("T", "(numberp 10)");
    testEvalEquals("T", "(numberp 9999999999999999999999999999999999999999999)");
    testEvalEquals("T", "(numberp 1.0)");
    testEvalEquals("T", "(numbeRp 4.0e99)");
    testEvalEquals("T", "(numberp #33ROOMBA)");
    testEvalEquals("NIL", "(numberp 'a)");
    testEvalEquals("NIL", "(numberp #\\a)");
    testEvalEquals("NIL", "(numberp \"a\")");
    testEvalEquals("T", "(fixnump 1)");
    testEvalEquals("T", "(fixnump 0)");
    testEvalEquals("T", "(fixnump -1)");
    testEvalEquals("T", "(fixnumP 1024)");
    testEvalEquals("T", "(fixnump -1024)");
    testEvalEquals("NIL", "(fixnump #\\a)");
    testEvalEquals("NIL", "(fixnump \"a\")");
    testEvalEquals("NIL", "(fixnump '(A B C))");
    testEvalEquals( "T", "(fixnump " + SubLNumberFactory.MIN_FIXNUM + ")");
    testEvalEquals( "T", "(fixnump " + SubLNumberFactory.MAX_FIXNUM + ")");
    testEvalEquals("T", "(bignump " + (SubLNumberFactory.MAX_FIXNUM + 1) + ")");
    testEvalEquals("T", "(bignump " + (SubLNumberFactory.MIN_FIXNUM - 1) + ")");
    testEvalEquals("T", "(bIgnump 3000000000000000)");
    testEvalEquals("T", "(bignump 3000000000000000000000000000000000000000000000000000)");
    testEvalEquals("NIL", "(bignump #\\a)");
    testEvalEquals("NIL", "(bignump \"a\")");
    testEvalEquals("NIL", "(bignump '(A B C))");
    testEvalEquals("NIL", "(short-bignum-p 'a)");
    testEvalEquals("NIL", "(short-bignum-p #\\a)");
    testEvalEquals("NIL", "(short-bignum-p \"a\")");
    testEvalEquals("NIL", "(short-bigNum-p '(A B C))");
    testEvalEquals("NIL", "(short-bignum-p 0)");
    testEvalEquals("t", "(short-bignum-p " +  (int)(Integer.MAX_VALUE/10) + ")");
    testEvalEquals("NIL", "(medium-bignum-p 'a)");
    testEvalEquals("NIL", "(medium-bignum-p #\\a)");
    testEvalEquals("NIL", "(mediUm-bignum-p \"a\")");
    testEvalEquals("NIL", "(medium-bignum-p '(A B C))");
    testEvalEquals("NIL", "(medium-bignum-p 1.2)");
    testEvalEquals("t", "(medium-bignum-p " + (long)(Long.MAX_VALUE /10)+ ")");
    testEvalEquals("NIL", "(long-bignum-p 'a)");
    testEvalEquals("NIL", "(long-bignum-p #\\a)");
    testEvalEquals("NIL", "(long-bignum-p \"a\")");
    testEvalEquals("NIL", "(long-bignuM-p '(A B C))");
    testEvalEquals("NIL", "(long-bignum-p 2e3)");
    testEvalEquals("T", "(long-bignum-p 999999999999999999999999999999999999999999999999)");
    testEvalEquals("T", "(integerp -1000)");
    testEvalEquals("T", "(integerp 999999999999999999999999999999999999999)");
    testEvalEquals("NIL", "(integeRp 'a)");
    testEvalEquals("NIL", "(integerp #\\a)");
    testEvalEquals("NIL", "(integerp 'a)");
    testEvalEquals("NIL", "(integerp '(10000))");
    testEvalEquals("NIL", "(integerp '10\\000)");
    testEvalEquals("T", "(Floatp 10000.00)");
    testEvalEquals("T", "(floatp 1e3)");
    testEvalEquals("T", "(floatp -100.234)");
    testEvalEquals("NIL", "(floatp 'a)");
    testEvalEquals("NIL", "(floatp '(10000.8432))");
    testEvalEquals("T", "(characterp #\\a)");
    testEvalEquals("T", "(charaCterp #\\C-M-\\a)");
    testEvalEquals("NIL", "(characterp \"\")");
    testEvalEquals("NIL", "(characterp 'a)");
    testEvalEquals("NIL", "(characterp 234.234)");
    testEvalEquals("T", "(striNgp \"\")");
    testEvalEquals("T", "(stringp \"\\\\\")");
    testEvalEquals("NIL", "(stringp 'a)");
    testEvalEquals("NIL", "(stringp #\\a)");
    testEvalEquals("NIL", "(stringp nil)");
    // @todo get the following to work.... -APB
//    testEvalEquals("NIL", "(vectorp 'a)");
//    testEvalEquals("NIL", "(vectorp 'a)");
//    testEvalEquals("NIL", "(vectorp 'a)");
//    testEvalEquals("NIL", "(vectorp 'a)");
//    testEvalEquals("NIL", "(vectorp 'a)");
//    testEvalEquals("NIL", "(functionp 'a)");
//    testEvalEquals("NIL", "(functionp 'a)");
//    testEvalEquals("NIL", "(functionp 'a)");
//    testEvalEquals("NIL", "(functionp 'a)");
//    testEvalEquals("NIL", "(functionp 'a)");
//    testEvalEquals("NIL", "(function-spec-p 'b)");
//    testEvalEquals("NIL", "(function-spec-p 'b)");
//    testEvalEquals("NIL", "(function-spec-p 'b)");
//    testEvalEquals("NIL", "(function-spec-p 'b)");
//    testEvalEquals("NIL", "(function-spec-p 'b)");
//    testEvalEquals("NIL", "(function-spec-p 'b)");
    testEvalError("(NULL 'a 'b)");
    testEvalError("(nuLL NIL . 3)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(SYMBOLP 'a 'b)");
    testEvalError("(SYMBOLP 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(ATOM 'a 'b)");
    testEvalError("(ATOM 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(CONSP 'a 'b)");
    testEvalError("(CONSP 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(listp 'a 'b)");
    testEvalError("(listp 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(numberp 'a 'b)");
    testEvalError("(numberp 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(fixnump 'a 'b)");
    testEvalError("(fixnump 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(bignump 'a 'b)");
    testEvalError("(bignump 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(short-bignum-p 'a 'b)");
    testEvalError("(short-bignum-p 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(medium-bignum-p 'a 'b)");
    testEvalError("(medium-bignum-p 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(long-bignum-p 'a 'b)");
    testEvalError("(long-bignum-p 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(integerp 'a . 'b)");
    testEvalError("(integerp 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(floatp 'a 'b)");
    testEvalError("(floatp 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(characterp 'a 'b)");
    testEvalError("(characterp 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(stringp 'a 'b)");
    testEvalError("(stringp 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(vectorp 'a 'b)");
    testEvalError("(vectorp 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(functionp 'a 'b)");
    testEvalError("(functionp 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
    testEvalError("(function-spec-p 'a 'b)");
    testEvalError("(function-spec-p 'a . 'b)");  //@diff allegro returns T; JRTL, CMUCL and CRTL error
  }
  
  public static void testMember() {
    testEvalEquals("NIL", "(member 1 '(a b c))");
    testEvalEquals("'(b c)", "(member 'b '(a b c))");
    testEvalEquals("NIL", "(member \"b\" '(\"A\" \"B\" \"C\"))");
    testEvalEquals("'(\"B\" \"C\")", "(member \"b\" '(\"A\" \"B\" \"C\") #'equalp)");
    testEvalEquals("'(\"B\" \"C\")", "(member \"b\" '(\"A\" \"B\" \"C\") #'equalp #'identity)");
    testEvalEquals("NIL","(cnot (null (member :subl-quote-fn '((1 . :after-adding) (0 . after-adding)) 'eql 'cdr)))");
    // @todo add more tests
  }
  
  public static void testCDoTimes() {
    testEvalEquals("200", "(clet ((x 0)) (cdotimes (y 100) (csetq x (+ x 2))) x)");
    testEvalEquals("4950", "(clet ((x 0)) (cdotimes (y 100) (csetq x (+ x y))) x)");
    // @todo add more tests
  }
  
  public static void testCTime() {
    //testEvalNotEquals("0", "(clet (x) (ctime x (fibonacci 34)) x)");
    testEvalEquals("0", "(csetq *test-time-1* 0)");
    testEvalEquals("'TEST-FUNC1", "(define test-func1 (num) (clet ((x 0)) (cdotimes (y num) (csetq x (+ x 2))) (ret x)))");
    testEvalEquals("0", "*test-time-1*");
    testEvalEquals("4000", "(ctime *test-time-1* (TEST-FUNC1 2000))");
    testEvalNotEquals("0", "*test-time-1*");
    testEvalEquals("NIL", "(clet (x) (ctime x) (null x))");
    // @todo add more tests
  }
  
  public static void testCDoList() {
    testEvalEquals("5", "(clet ((result 0)) (cdolist (x '(a b c d e)) (csetq result (+ result 1))) result)");
    // @todo add more tests
  }
  
  public static void testCDoHash() {
    testEvalEquals("T", "(progn (csetq *test-hashtable* (make-hash-table 5)) (hash-table-p *test-hashtable*))");
    testEvalEquals("'(0 0 0)", "(clet ((count 0)(keys 0)(vals 0)) (cdohash (key val *test-hashtable*) (cinc count) (cinc keys key) (cinc vals val)) (list count keys vals))");
    testEvalEquals("10", "(sethash 1 *test-hashtable* 10)");
    testEvalEquals("'(1 1 10)", "(clet ((count 0)(keys 0)(vals 0)) (cdohash (key val *test-hashtable*) (cinc count) (cinc keys key) (cinc vals val)) (list count keys vals))");
    testEvalEquals("20", "(sethash 2 *test-hashtable* 20)");
    testEvalEquals("'(2 3 30)", "(clet ((count 0)(keys 0)(vals 0)) (cdohash (key val *test-hashtable*) (cinc count) (cinc keys key) (cinc vals val)) (list count keys vals))");
    testEvalEquals("30", "(sethash 3 *test-hashtable* 30)");
    testEvalEquals("'(3 6 60)", "(clet ((count 0)(keys 0)(vals 0)) (cdohash (key val *test-hashtable*) (cinc count) (cinc keys key) (cinc vals val)) (list count keys vals))");
    // @todo add more tests
  }
  
  public static void testCPushAndCPop() {
    testEvalEquals("'(e d c b a)", "(clet ((result NIL)) (cdolist (x '(a b c d e)) (cpush x result)) result)");
    testEvalEquals("'(e d c b a)", "(clet ((result NIL)) (cdolist (x '(a b a c d e)) (cpushNew x result)) result)");
    testEvalEquals("'(e d c b a)", "(clet ((result NIL)) (cdolist (x '(a b c d e)) (cpushNew x result)) result)");
    testEvalEquals("'a", "(clet ((x '(a b c d e))) (cpop x))");
    testEvalEquals("'(b c d e)", "(clet ((x '(a b c d e))) (cpop x) x)");
    testEvalError("(cpop nil)");
    testEvalEquals("'(nil nil)", "(clet ((x nil)) (list (cpop x) x))");
    // @todo add more tests
  }
  
  public static void testMapping() {
    testEvalEquals("'((1 100) (2 200) (3 300) (4 400))", "(mapcar 'identity '((1 100) (2 200) (3 300) (4 400)))");
    testEvalEquals("'((a . 1) (b . 2) (c . 3))", "(mapcar 'cons '(a b c) '(1 2 3))");
    testEvalEquals("'((a 1 X) (b 2 Y) (c 3 Z))", "(mapcar 'list '(a b c) '(1 2 3) '(X Y Z))");
    testEvalEquals("nil", "(mapcar 'list 'NIL '(1 2 3) '(X Y Z))");
    testEvalEquals("nil", "(mapcar 'list '(a b c) '(1 2 3) 'nil)");
    testEvalEquals("'((a 1 X) (b 2 Y))", "(mapcar 'list '(a b c) '(1 2) '(X Y Z))");
    testEvalEquals("'((a 1 X) )", "(mapcar 'list '(a) '(1 2 3) '(X Y Z))");
    testEvalEquals("'((a 1 X) (b 2 Y) (c 3 Z))", "(mapcar 'list '(a b c) '(1 2 3) '(X Y Z Q))");
    testEvalEquals("'((a 1 X) (b 2 Y) (c 3 Z))", "(mapcar 'list '(a b c d) '(1 2 3) '(X Y Z Q))");
    testEvalEquals("'((a 1 X) (b 2 Y) (c 3 Z) (d 4 Q))", "(mapcar 'list '(a b c d) '(1 2 3 4) '(X Y Z Q))");
    testEvalError("(mapcar 'list '(a . b))");
    testEvalEquals("'(1 100 2 200 3 300 4 400)","(mapcan 'identity '((1 100) (2 200) (3 300) (4 400)))");
  }
  
  public static void testDefine() {
    // @todo add more tests
    testEvalError("(define foo ())");
    testEvalEquals("'FOO", "(define foo () (ret 212))");
    testEvalEquals("212", "(foo)");
    testEvalError("(foo 1)");
    testEvalEquals("'FOO", "(define foo (x) (ret x))");
    testEvalEquals("1", "(foo 1)");
    testEvalEquals("'FOO", "(define foo (x y) (ret (list x y)))");
    testEvalEquals("'(1 2)", "(foo 1 2)");
    testEvalEquals("'FOO", "(define foo (x &optional y) (ret (list x y)))");
    testEvalEquals("'(1 NIL)", "(foo 1)");
    testEvalEquals("'FOO", "(define foo (x &optional (y x)) (ret (list x y)))");
    testEvalEquals("'(1 1)", "(foo 1)");
    testEvalEquals("'FOO", "(define foo (x &optional (y x p)) (ret (list x y p)))");
    testEvalEquals("'(1 1 nil)", "(foo 1)");
    testEvalEquals("'(1 2 t)",   "(foo 1 2)");
    testEvalEquals("'(1 1 t)",   "(foo 1 1)");
    testEvalEquals("'FOO", "(define foo (x &optional y &rest args) (ret (list x y args)))");
    testEvalEquals("'(1 nil nil)", "(foo 1)");
    testEvalEquals("'(1 2 nil)",   "(foo 1 2)");
    testEvalEquals("'(1 2 (3))",   "(foo 1 2 3)");
    testEvalEquals("'FOO", "(define foo (x y) (ret (+ x y)))");
    testEvalEquals("2", "(foo 1 1)");
    testEvalEquals("10", "(foo (foo 1 2)(foo 3 4))");
    testEvalEquals("'FIB", "(define fib (n)"
      + "(pif (eql n 0)"
      +      "(ret 1)"
      +      "(pif (eql n 1)"
      +      "     (ret 1)"
      +      "     (ret (+ (fib (- n 2))(fib (- n 1)))))))");
    testEvalEquals("1", "(fib 0)");
    testEvalEquals("1", "(fib 1)");
    testEvalEquals("2", "(fib 2)");
    testEvalEquals("3", "(fib 3)");
    testEvalEquals("5", "(fib 4)");
  }
  
  
  
  public static void testProcesses() {
    /*(deflexical *test-val-203944* 1)
     (define inc-val () (csetq *test-val-203944* (+ *test-val-203944* 1)) (ret *test-val-203944*))
     *test-val-203944* == 1
     (make-process "test-process" 'inc-val)
     wait 2 seconds
     *test-val-203944* == 2*/
    try {
      readAndEval("(deflexical *test-val-203944* 1)");
      readAndEval("(define inc-val () (csetq *test-val-203944* (+ *test-val-203944* 1)) (ret *test-val-203944*))");
      testEvalEquals("1", "*test-val-203944*");
      readAndEval("(make-process \"test-process\" 'inc-val)");
      Thread.currentThread().sleep(2000); //@hack this is arbitrary!!!
      testEvalEquals("2", "*test-val-203944*");
      readAndEval("(make-process \"test-process\" 'inc-val)");
      Thread.currentThread().sleep(2000); //@hack this is arbitrary!!!
      testEvalEquals("3", "*test-val-203944*");
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt();
    }
    // @todo add more tests
  }
  
  public static void testHashtables() {
    // eql hash tables
    readAndEval("(deflexical *test-hash-table* (make-hash-table 12))");
    readAndEval("(sethash 1 *test-hash-table* 2)");
    readAndEval("(sethash 2 *test-hash-table* 4)");
    testEvalEquals("4", "(gethash 2 *test-hash-table*)");
    testEvalEquals("2", "(gethash 1 *test-hash-table*)");
    testEvalEquals("2", "(gethash 3 *test-hash-table* 2)");
    testEvalEquals("NIL", "(gethash 3 *test-hash-table*)");
    readAndEval("(remhash 2 *test-hash-table*)");
    testEvalEquals("NIL", "(gethash 2 *test-hash-table*)");
    readAndEval("(sethash 2 *test-hash-table* 4)");
    testEvalEquals("2", "(hash-table-count *test-hash-table*)");
    readAndEval("(clrhash *test-hash-table*)");
    testEvalEquals("0", "(hash-table-count *test-hash-table*)");
    testEvalEquals("#'EQL", "(hash-table-test *test-hash-table*)");

    // equalp hash tables
    readAndEval("(deflexical *test-hash-table* (make-hash-table 12 'equalp))");
    readAndEval("(sethash \"root\" *test-hash-table* :all-lowercase)");
    readAndEval("(sethash \"ROOT\" *test-hash-table* :all-uppercase)");
    readAndEval("(sethash \"rOoT\" *test-hash-table* :mixedcase)");
    readAndEval("(sethash \"Root\" *test-hash-table* :capitalized-start)");
    testEvalEquals("1", "(hash-table-count *test-hash-table*))");
    
    /* Commented out because new-cache is not part of the SubL kernel
     shouldPrintTests("Testing hashtables on CycL objects ... will error if CycL not loaded.");
    readAndEval("(csetq *test-hash-table* (make-hash-table 12 'eq))");
    readAndEval("(csetq *test-cache-1* (new-cache 1))");
    readAndEval("(sethash *test-cache-1* *test-hash-table* *test-cache-1*)");
    readAndEval("(csetq *test-cache-2* (new-cache 2))");
    readAndEval("(sethash *test-cache-2* *test-hash-table* *test-cache-2*)");
    testEvalEquals("T","(eq *test-cache-1* (gethash *test-cache-1* *test-hash-table* :not-found))");
    */
  }
  
  public static void testKeyhashes() {
    /* commented out because keyhashes are not currently part of the SubL kernel
     readAndEval("(deflexical *test-keyhash* (new-keyhash 12))");
    readAndEval("(setkeyhash 2 *test-keyhash*)");
    readAndEval("(setkeyhash 4 *test-keyhash*)");
    testEvalEquals("T", "(getkeyhash 2 *test-keyhash*)");
    testEvalEquals("T", "(getkeyhash 4 *test-keyhash*)");
    testEvalEquals("NIL", "(getkeyhash 3 *test-keyhash*)");
    readAndEval("(remkeyhash 2 *test-keyhash*)");
    testEvalEquals("NIL", "(getkeyhash 2 *test-keyhash*)");
    readAndEval("(setkeyhash 2 *test-keyhash*)");
    testEvalEquals("2", "(keyhash-count *test-keyhash*)");
    readAndEval("(clrkeyhash *test-keyhash*)");
    testEvalEquals("0", "(keyhash-count *test-keyhash*)");
    testEvalEquals("'EQL", "(keyhash-test *test-keyhash*)");
     */
  }
  
  public static void testHashtableExerciser() {
    //readAndEval("(benchmark-hash-table-exerciser 1 0 1 10000)");
    readAndEval("(test-benchmark-hash-table-exerciser-process 10000 10)");
  }
  
  public static void testSort() {
    testEvalEquals("'(1 2 3 4 5)", "(sort '(5 2 4 3 1) '<)");
    testEvalEquals("'(5 4 3 2 1)", "(sort '(5 2 4 3 1) '>)");
    testEvalEquals("'(0 -1 1 -1 1 2 -2 3 -5 -8)", "(stable-sort '(-1 3 1 -5 2 0 -8 -1 -2 1) '< 'abs)");
    testEvalEquals("#(1 2 3 4 5)", "(sort #(5 2 4 3 1) '<)");
    testEvalEquals("#(5 4 3 2 1)", "(sort #(5 2 4 3 1) '>)");
    testEvalEquals("#(0 -1 1 -1 1 2 -2 3 -5 -8)", "(stable-sort #(-1 3 1 -5 2 0 -8 -1 -2 1) '< 'abs)");
    testEvalEquals("\"aaaabbcdf\"", "(sort \"acabaadfb\" 'CHAR<)");
  }
  
  public static void testCharacterFunctions() {
    testEvalEquals("#\\1", "(digit-char 1)");
    testEvalEquals("#\\8", "(digit-char 8)");
    testEvalEquals("#\\A", "(digit-char 10)");
    testEvalEquals("#\\K", "(digit-char 20)");
    testEvalEquals("#\\Z", "(digit-char 35)");
    
    testEvalEquals("nil", "(digit-char-p #\\a)");
    testEvalEquals("nil", "(digit-char-p #\\9 8)");
    testEvalEquals(" 9", "(digit-char-p #\\9)");
    testEvalEquals("10", "(digit-char-p #\\a 11)");
    testEvalEquals("10", "(digit-char-p #\\a 16)");
    testEvalEquals("15", "(digit-char-p #\\F 16)");
    testEvalEquals("15", "(digit-char-p #\\f 16)");
    
    testEvalEquals("t", "(alphanumericp #\\a)");
    testEvalEquals("t", "(alphanumericp #\\A)");
    testEvalEquals("t", "(alphanumericp #\\1)");
    testEvalEquals("nil", "(alphanumericp #\\,)");
    testEvalEquals("nil", "(alphanumericp #\\Escape)");
    testEvalError("(alphanumericp 37)");
    
    testEvalEquals("t", "(alpha-char-p #\\a)");
    testEvalEquals("nil", "(alpha-char-p #\\9)");
    testEvalEquals("t", "(alpha-char-p #\\A)");
    testEvalEquals("NIL", "(alpha-char-p #\\,)");
    testEvalEquals("NIL", "(alpha-char-p #\\Space)");
    testEvalEquals("NIL", "(alpha-char-p #\\))");
    testEvalError("(alpha-char-p 'b)");
    testEvalError("(alpha-char-p 10)");
    
    testEvalEquals("t", "(upper-case-p #\\A)");
    testEvalEquals("nil", "(upper-case-p #\\a)");
    testEvalEquals("t", "(upper-case-p #\\S)");
    testEvalEquals("NIL", "(upper-case-p #\\,)");
    testEvalEquals("NIL", "(upper-case-p #\\Space)");
    testEvalEquals("NIL", "(upper-case-p #\\))");
    testEvalError("(upper-case-p 'b)");
    testEvalError("(upper-case-p 10)");
    
    testEvalEquals("nil", "(lower-case-p #\\A)");
    testEvalEquals("t", "(lower-case-p #\\a)");
    testEvalEquals("nil", "(lower-case-p #\\S)");
    testEvalEquals("NIL", "(lower-case-p #\\,)");
    testEvalEquals("NIL", "(lower-case-p #\\Space)");
    testEvalEquals("NIL", "(lower-case-p #\\))");
    testEvalError("(lower-case-p 'b)");
    testEvalError("(lower-case-p 10)");
    
    testEvalEquals("t", "(both-case-p #\\a)");
    testEvalEquals("nil", "(both-case-p #\\9)");
    testEvalEquals("t", "(both-case-p #\\A)");
    testEvalEquals("NIL", "(both-case-p #\\,)");
    testEvalEquals("NIL", "(both-case-p #\\Space)");
    testEvalEquals("NIL", "(both-case-p #\\))");
    testEvalError("(both-case-p 'b)");
    testEvalError("(both-case-p 10)");
    
    testEvalEquals("97", "(char-code #\\a)");
    testEvalEquals("57", "(char-code #\\9)");
    testEvalEquals("65", "(char-code #\\A)");
    testEvalEquals("44", "(char-code #\\,)");
    testEvalEquals("32", "(char-code #\\Space)");
    testEvalError("(char-code 'b)");
    testEvalError("(char-code 10)");
    
    testEvalEquals("#\\a", "(code-char 97)");
    testEvalEquals("#\\9", "(code-char 57)");
    testEvalEquals("#\\A", "(code-char 65)");
    testEvalEquals("#\\,", "(code-char 44)");
    testEvalEquals("#\\Space", "(code-char 32)");
    testEvalEquals("nil", "(code-char 256)");
    testEvalEquals("nil", "(code-char -1)");
    testEvalError("(code-char 'b)");
    testEvalError("(code-char #\\A)");
    
    assertEquals(Characters.name_character(SubLObjectFactory.makeString("Esc")), readAndEval("#\\esc"));
    assertNotNull(Characters.name_character(SubLObjectFactory.makeString("Esc")));
    
    testEvalEquals("#\\A", "(char-upcase #\\a)");
    testEvalEquals("#\\9", "(char-upcase #\\9)");
    testEvalEquals("#\\A", "(char-upcase #\\A)");
    testEvalEquals("#\\,", "(char-upcase #\\,)");
    testEvalEquals("#\\space", "(char-upcase #\\Space)");
    testEvalEquals("#\\)", "(char-upcase #\\))");
    testEvalEquals("#\\control-meta-a", "(char-upcase #\\c-m-a)");
    testEvalError("(char-upcase 'b)");
    testEvalError("(char-upcase 10)");
    
    testEvalEquals("#\\a", "(char-downcase #\\a)");
    testEvalEquals("#\\9", "(char-downcase #\\9)");
    testEvalEquals("#\\a", "(char-downcase #\\A)");
    testEvalEquals("#\\,", "(char-downcase #\\,)");
    testEvalEquals("#\\SPACE", "(char-downcase #\\Space)");
    testEvalEquals("#\\)", "(char-downcase #\\))");
    testEvalEquals("#\\control-meta-a", "(char-downcase #\\c-m-a)");
    testEvalError("(char-downcase 'b)");
    testEvalError("(char-downcase 10)");
    
    testEvalEquals("t", "(char-equal #\\a #\\a)");
    testEvalEquals("T", "(char-equal #\\a #\\A)");
    testEvalEquals("nil", "(char-equal #\\a #\\1)");
    testEvalEquals("nil", "(char-equal #\\a #\\control-a)");
    testEvalEquals("nil", "(char-equal #\\meta-a #\\control-a)");
    testEvalError("(char-equal 10 #\\a)");
    testEvalError("(char-equal #\\a 10)");
    testEvalError("(char-equal)");
    testEvalError("(char-equal #\\a)");
    
    testEvalEquals("nil", "(char-not-equal #\\a #\\a)");
    testEvalEquals("nil", "(char-not-equal #\\a #\\A)");
    testEvalEquals("t", "(char-not-equal #\\a #\\1)");
    testEvalEquals("t", "(char-not-equal #\\a #\\control-a)");
    testEvalEquals("t", "(char-not-equal #\\meta-a #\\control-a)");
    testEvalError("(char-not-equal 10 #\\a)");
    testEvalError("(char-not-equal #\\a 10)");
    testEvalError("(char-not-equal)");
    testEvalError("(char-not-equal #\\a)");
    
    testEvalEquals("nil", "(equal (read-from-string \"#\\\\b\") (read-from-string \"#\\\\B\"))");
    /* SubLObject bigB = SubLObjectFactory.makeString("B");
    SubLObject littleB = SubLObjectFactory.makeString("b");
    SubLObject bigChar = name_character(bigB);
    SubLObject littleChar = name_character(littleB);
    System.out.println(bigChar + " " + littleChar); */
    
    testEvalEquals("nil", "(char-greaterp #\\a #\\a)");
    testEvalEquals("nil", "(char-greaterp #\\A #\\a)");
    testEvalEquals("nil", "(char-greaterp #\\a #\\b)");
    testEvalEquals("nil", "(char-greaterp #\\A #\\b)");
    testEvalEquals("nil", "(char-greaterp #\\a #\\B)");
    testEvalEquals("t", "(char-greaterp #\\a #\\1)");
    testEvalEquals("t", "(char-greaterp #\\a #\\control-a)");
    testEvalEquals("t", "(char-greaterp #\\meta-a #\\control-a)");
    testEvalError("(char-greaterp 10 #\\a)");
    testEvalError("(char-greaterp #\\a 10)");
    testEvalError("(char-greaterp)");
    testEvalError("(char-greaterp 10)");
    
    testEvalEquals("nil", "(char-lessp #\\a #\\a)");
    testEvalEquals("t", "(char-lessp #\\a #\\b)");
    testEvalEquals("t", "(char-lessp #\\A #\\b)");
    testEvalEquals("t", "(char-lessp #\\a #\\B)");
    testEvalEquals("nil", "(char-lessp #\\A #\\a)");
    testEvalEquals("nil", "(char-lessp #\\a #\\1)");
    testEvalEquals("nil", "(char-lessp #\\a #\\control-a)");
    testEvalEquals("nil", "(char-lessp #\\meta-a #\\control-a)");
    testEvalError("(char-lessp 10 #\\a)");
    testEvalError("(char-lessp #\\a 10)");
    testEvalError("(char-lessp)");
    testEvalError("(char-lessp 10)");
    
    testEvalEquals("t", "(char-not-greaterp #\\a #\\a)");
    testEvalEquals("t", "(char-not-greaterp #\\a #\\b)");
    testEvalEquals("t", "(char-not-greaterp #\\A #\\b)");
    testEvalEquals("t", "(char-not-greaterp #\\a #\\B)");
    testEvalEquals("t", "(char-not-greaterp #\\A #\\a)");
    testEvalEquals("nil", "(char-not-greaterp #\\a #\\1)");
    testEvalEquals("nil", "(char-not-greaterp #\\a #\\control-a)");
    testEvalEquals("nil", "(char-not-greaterp #\\meta-a #\\control-a)");
    testEvalError("(char-not-greaterp 10 #\\a)");
    testEvalError("(char-not-greaterp #\\a 10)");
    testEvalError("(char-not-greaterp)");
    testEvalError("(char-not-greaterp 10)");
    
    testEvalEquals("t", "(char-not-lessp #\\a #\\a)");
    testEvalEquals("nil", "(char-not-lessp #\\a #\\b)");
    testEvalEquals("nil", "(char-not-lessp #\\A #\\b)");
    testEvalEquals("nil", "(char-not-lessp #\\a #\\B)");
    testEvalEquals("t", "(char-not-lessp #\\A #\\a)");
    testEvalEquals("t", "(char-not-lessp #\\a #\\1)");
    testEvalEquals("t", "(char-not-lessp #\\a #\\control-a)");
    testEvalEquals("t", "(char-not-lessp #\\meta-a #\\control-a)");
    testEvalError("(char-not-lessp 10 #\\a)");
    testEvalError("(char-not-lessp #\\a 10)");
    testEvalError("(char-not-lessp)");
    testEvalError("(char-not-lessp 10)");
    
    testEvalEquals("t", "(char= #\\a #\\a)");
    testEvalEquals("nil", "(char= #\\a #\\A)");
    testEvalEquals("nil", "(char= #\\a #\\1)");
    testEvalEquals("nil", "(char= #\\a #\\control-a)");
    testEvalEquals("nil", "(char= #\\meta-a #\\control-a)");
    testEvalEquals("nil", "(char= 10 #\\a)");
    testEvalEquals("nil", "(char= #\\a 10)");
    testEvalError("(char=)");
    testEvalError("(char= #\\a)");
    
    testEvalEquals("nil", "(char/= #\\a #\\a)");
    testEvalEquals("t", "(char/= #\\a #\\A)");
    testEvalEquals("t", "(char/= #\\a #\\1)");
    testEvalEquals("t", "(char/= #\\a #\\control-a)");
    testEvalEquals("t", "(char/= #\\meta-a #\\control-a)");
    testEvalEquals("t", "(char/= 10 #\\a)");
    testEvalEquals("t", "(char/= #\\a 10)");
    testEvalError("(char/=)");
    testEvalError("(char/= #\\a)");
    
    testEvalEquals("nil", "(char> #\\a #\\a)");
    testEvalEquals("nil", "(char> #\\A #\\a)");
    testEvalEquals("nil", "(char> #\\a #\\b)");
    testEvalEquals("nil", "(char> #\\A #\\b)");
    testEvalEquals("t", "(char> #\\a #\\B)");
    testEvalEquals("t", "(char> #\\a #\\1)");
    testEvalEquals("t", "(char> #\\a #\\control-a)");
    testEvalEquals("t", "(char> #\\meta-a #\\control-a)");
    testEvalError("(char> 10 #\\a)");
    testEvalError("(char> #\\a 10)");
    testEvalError("(char>)");
    testEvalError("(char-greaterp 10)");
    
    testEvalEquals("nil", "(char< #\\a #\\a)");
    testEvalEquals("t", "(char< #\\a #\\b)");
    testEvalEquals("t", "(char< #\\A #\\b)");
    testEvalEquals("nil", "(char< #\\a #\\B)");
    testEvalEquals("t", "(char< #\\A #\\a)");
    testEvalEquals("nil", "(char< #\\a #\\1)");
    testEvalEquals("nil", "(char< #\\a #\\control-a)");
    testEvalEquals("nil", "(char< #\\meta-a #\\control-a)");
    testEvalError("(char< 10 #\\a)");
    testEvalError("(char< #\\a 10)");
    testEvalError("(char<)");
    testEvalError("(char< 10)");
    
    testEvalEquals("t", "(char<= #\\a #\\a)");
    testEvalEquals("t", "(char<= #\\a #\\b)");
    testEvalEquals("t", "(char<= #\\A #\\b)");
    testEvalEquals("nil", "(char<= #\\a #\\B)");
    testEvalEquals("t", "(char<= #\\A #\\a)");
    testEvalEquals("nil", "(char<= #\\a #\\1)");
    testEvalEquals("nil", "(char<= #\\a #\\control-a)");
    testEvalEquals("nil", "(char<= #\\meta-a #\\control-a)");
    testEvalError("(char<= 10 #\\a)");
    testEvalError("(char<= #\\a 10)");
    testEvalError("(char<=)");
    testEvalError("(char<= 10)");
    
    testEvalEquals("t", "(char>= #\\a #\\a)");
    testEvalEquals("nil", "(char>= #\\a #\\b)");
    testEvalEquals("nil", "(char>= #\\A #\\b)");
    testEvalEquals("t", "(char>= #\\a #\\B)");
    testEvalEquals("nil", "(char>= #\\A #\\a)");
    testEvalEquals("t", "(char>= #\\a #\\1)");
    testEvalEquals("t", "(char>= #\\a #\\control-a)");
    testEvalEquals("t", "(char>= #\\meta-a #\\control-a)");
    testEvalError("(char>= 10 #\\a)");
    testEvalError("(char>= #\\a 10)");
    testEvalError("(char>=)");
    testEvalError("(char>= 10)");
  }
  
  public static void testStringFunctions() {
    // @todo add tests involving dotted lists
    
    testEvalEquals("\"aaa\"", "(make-string 3 #\\a)");
    testEvalError("(make-string 3 NIL)");
    testEvalError("(make-string NIL #\\a)");
    
    testEvalEquals("\"a\"", "(string #\\a)");
    
    testEvalEquals("#\\e", "(char \"hello\" 1)");
    testEvalError("(char \"hello\" -1)");
    testEvalError("(char \"hello\" 100)");
    testEvalError("(char NIL 1)");
    
    testEvalEquals("\"hellp\"", "(set-char \"hello\" 4 #\\p)");
    testEvalError("(set-char \"hello\" 4 NIL)");
    testEvalError("(set-char \"hello\" -1 #\\p)");
    testEvalError("(set-char \"hello\" 100 #\\p)");
    testEvalError("(set-char NIL 4 #\\p)");
    
    //// Case sensitive comparisons
    testEvalEquals("T", "(string= \"abc\" \"abc\")");
    testEvalEquals("nil", "(string= \"aadd\" \"aacc\")");
    testEvalEquals("nil", "(string= \"aacc\" \"aadd\")");
    testEvalEquals("nil", "(string= \"aAdD\" \"aacc\")");
    testEvalEquals("nil", "(string= \"aAcC\" \"aacc\")");
    testEvalEquals("nil", "(string= \"aAcC\" \"aAcCa\")");
    testEvalEquals("T", "(string= \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("NIL", "(string= \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("nil", "(string/= \"abc\" \"abc\")");
    testEvalEquals("t", "(string/= \"aadd\" \"aacc\")");
    testEvalEquals("t", "(string/= \"aacc\" \"aadd\")");
    testEvalEquals("t", "(string/= \"aAdD\" \"aacc\")");
    testEvalEquals("t", "(string/= \"aAcC\" \"aacc\")");
    testEvalEquals("t", "(string/= \"aAcC\" \"aAcCa\")");
    testEvalEquals("nil", "(string/= \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("t", "(string/= \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("nil", "(string< \"abc\" \"abc\")");
    testEvalEquals("nil", "(string< \"aadd\" \"aacc\")");
    testEvalEquals("2", "(string< \"aacc\" \"aadd\")");
    testEvalEquals("1", "(string< \"aAdD\" \"aacc\")");
    testEvalEquals("1", "(string< \"aAcC\" \"aacc\")");
    testEvalEquals("4", "(string< \"aAcC\" \"aAcCa\")");
    testEvalEquals("nil", "(string< \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("NIL", "(string< \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("nil", "(string> \"abc\" \"abc\")");
    testEvalEquals("2", "(string> \"aadd\" \"aacc\")");
    testEvalEquals("nil", "(string> \"aacc\" \"aadd\")");
    testEvalEquals("nil", "(string> \"aAdD\" \"aacc\")");
    testEvalEquals("nil", "(string> \"aAcC\" \"aacc\")");
    testEvalEquals("nil", "(string> \"aAcC\" \"aAcCa\")");
    testEvalEquals("nil", "(string> \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("2", "(string> \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("3", "(string>= \"abc\" \"abc\")");
    testEvalEquals("2", "(string>= \"aadd\" \"aacc\")");
    testEvalEquals("nil", "(string>= \"aacc\" \"aadd\")");
    testEvalEquals("nil", "(string>= \"aAdD\" \"aacc\")");
    testEvalEquals("nil", "(string>= \"aAcC\" \"aacc\")");
    testEvalEquals("nil", "(string>= \"aAcC\" \"aAcCa\")");
    testEvalEquals("4", "(string>= \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("2", "(string>= \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("3", "(string<= \"abc\" \"abc\")");
    testEvalEquals("nil", "(string<= \"aadd\" \"aacc\")");
    testEvalEquals("2", "(string<= \"aacc\" \"aadd\")");
    testEvalEquals("1", "(string<= \"aAdD\" \"aacc\")");
    testEvalEquals("1", "(string<= \"aAcC\" \"aacc\")");
    testEvalEquals("4", "(string<= \"aAcC\" \"aAcCa\")");
    testEvalEquals("4", "(string<= \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("NIL", "(string<= \"hello\" \"shell\" 2 4 2 4)");
    
    //// Case insensitive comparisons
    testEvalEquals("T", "(string-equal \"abc\" \"abc\")");
    testEvalEquals("nil", "(string-equal \"aadd\" \"aacc\")");
    testEvalEquals("nil", "(string-equal \"aacc\" \"aadd\")");
    testEvalEquals("nil", "(string-equal \"aAdD\" \"aacc\")");
    testEvalEquals("t", "(string-equal \"aAcC\" \"aacc\")");
    testEvalEquals("nil", "(string-equal \"aAcC\" \"aAcCa\")");
    testEvalEquals("T", "(string-equal \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("NIL", "(string-equal \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("nil", "(string-not-equal \"abc\" \"abc\")");
    testEvalEquals("t", "(string-not-equal \"aadd\" \"aacc\")");
    testEvalEquals("t", "(string-not-equal \"aacc\" \"aadd\")");
    testEvalEquals("t", "(string-not-equal \"aAdD\" \"aacc\")");
    testEvalEquals("nil", "(string-not-equal \"aAcC\" \"aacc\")");
    testEvalEquals("t", "(string-not-equal \"aAcC\" \"aAcCa\")");
    testEvalEquals("nil", "(string-not-equal \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("t", "(string-not-equal \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("nil", "(string-lessp \"abc\" \"abc\")");
    testEvalEquals("nil", "(string-lessp \"aadd\" \"aacc\")");
    testEvalEquals("2", "(string-lessp \"aacc\" \"aadd\")");
    testEvalEquals("nil", "(string-lessp \"aAdD\" \"aacc\")");
    testEvalEquals("nil", "(string-lessp \"aAcC\" \"aacc\")");
    testEvalEquals("4", "(string-lessp \"aAcC\" \"aAcCa\")");
    testEvalEquals("NIL", "(string-lessp \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("NIL", "(string-lessp \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("nil", "(string-greaterp \"abc\" \"abc\")");
    testEvalEquals("2", "(string-greaterp \"aadd\" \"aacc\")");
    testEvalEquals("nil", "(string-greaterp \"aacc\" \"aadd\")");
    testEvalEquals("2", "(string-greaterp \"aAdD\" \"aacc\")");
    testEvalEquals("nil", "(string-greaterp \"aAcC\" \"aacc\")");
    testEvalEquals("nil", "(string-greaterp \"aAcC\" \"aAcCa\")");
    testEvalEquals("nil", "(string-greaterp \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("2", "(string-greaterp \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("3", "(string-not-greaterp \"abc\" \"abc\")");
    testEvalEquals("nil", "(string-not-greaterp \"aadd\" \"aacc\")");
    testEvalEquals("2", "(string-not-greaterp \"aacc\" \"aadd\")");
    testEvalEquals("nil", "(string-not-greaterp \"aAdD\" \"aacc\")");
    testEvalEquals("4", "(string-not-greaterp \"aAcC\" \"aacc\")");
    testEvalEquals("4", "(string-not-greaterp \"aAcC\" \"aAcCa\")");
    testEvalEquals("4", "(string-not-greaterp \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("NIL", "(string-not-greaterp \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("3", "(string-not-lessp \"abc\" \"abc\")");
    testEvalEquals("2", "(string-not-lessp \"aadd\" \"aacc\")");
    testEvalEquals("nil", "(string-not-lessp \"aacc\" \"aadd\")");
    testEvalEquals("2", "(string-not-lessp \"aAdD\" \"aacc\")");
    testEvalEquals("4", "(string-not-lessp \"aAcC\" \"aacc\")");
    testEvalEquals("nil", "(string-not-lessp \"aAcC\" \"aAcCa\")");
    testEvalEquals("4", "(string-not-lessp \"hello\" \"shell\" 0 4 1 5)");
    testEvalEquals("2", "(string-not-lessp \"hello\" \"shell\" 2 4 2 4)");
    
    testEvalEquals("\"ABC\"", "(string-upcase \"abc\")");
    testEvalEquals("t", "(clet ((str \"ABc\")) (cnot (eq str (string-upcase str))))");
    
    testEvalEquals("\"abc\"", "(STRING-DOWNCASE \"ABc\")");
    testEvalEquals("t", "(clet ((str \"ABc\")) (cnot (eq str (STRING-DOWNCASE str))))");
    
    testEvalEquals("\"Abc\"", "(STRING-CAPITALIZE \"abc\")");
    testEvalEquals("t", "(clet ((str \"ABc\")) (cnot (eq str (STRING-CAPITALIZE str))))");
    
    testEvalEquals("\"ABC\"", "(NSTRING-UPCASE \"abc\")");
    testEvalEquals("t", "(clet ((str \"ABc\")) (eq str (NSTRING-UPCASE str)))");
    
    testEvalEquals("\"abc\"", "(NSTRING-DOWNCASE \"ABc\")");
    testEvalEquals("t", "(clet ((str \"ABc\")) (eq str (NSTRING-DOWNCASE str)))");
    
    testEvalEquals("\"Abc\"", "(NSTRING-CAPITALIZE \"abc\")");
    testEvalEquals("t", "(clet ((str \"ABc\")) (eq str (NSTRING-CAPITALIZE str)))");
    
    testEvalEquals("\"abc\"", "(STRING-TRIM #(#\\Space) \"  abc  \")");
    
    testEvalEquals("\"abc  \"", "(STRING-LEFT-TRIM #(#\\Space) \"  abc  \")");
    
    testEvalEquals("\"  abc\"", "(STRING-RIGHT-TRIM #(#\\Space) \"  abc  \")");
  }
  
  public static void testPackageFunctions() {
    testEvalOfType("(csetq *new-package* (make-package \"blah\" nil nil))", SubLPackage.class);
    testEvalError("(make-package \"cyc\" nil nil)"); //duplicate
    testEvalError("(make-package \"cYc\" nil nil)"); //duplicate
    
    testEvalEquals("\"BLAH\"", "(package-name *new-package*)");
    testEvalError("(package-name NIL)");
    testEvalError("(package-name 11)");
    
    testEvalEquals("NIL", "(package-use-list *new-package*)");
    testEvalEquals("(list (find-package \"SUBLISP\"))", "(package-use-list (find-package \"CYC\"))");
    testEvalEquals("NIL", "(package-use-list (find-package \"SUBLISP\"))");
    testEvalEquals("NIL", "(package-use-list (find-package \"KEYWORD\"))");
    testEvalError("(package-use-list NIL)");
    testEvalError("(package-use-list)");
    testEvalError("(package-use-list 123)");
    
    testEvalEquals("NIL", "(package-used-by-list *new-package*)");
    testEvalEquals("(list (find-package \"CYC\"))", "(package-used-by-list (find-package \"SUBLISP\"))");
    testEvalEquals("NIL", "(package-used-by-list (find-package \"CYC\"))");
    testEvalEquals("NIL", "(package-used-by-list (find-package \"KEYWORD\"))");
    testEvalError("(package-used-by-list NIL)");
    testEvalError("(package-used-by-list)");
    testEvalError("(package-used-by-list (find-package \"KEYWORD\") nil)");
    
    testEvalEquals("NIL", "(package-nicknames *new-package*)");
    testEvalEquals("(list \"SL\")", "(package-nicknames (find-package \"SUBLISP\"))");
    testEvalEquals("NIL", "(package-nicknames (find-package \"CYC\"))");
    testEvalEquals("NIL", "(package-nicknames (find-package \"KEYWORD\"))");
    testEvalError("(package-nicknames NIL)");
    testEvalError("(package-nicknames)");
    testEvalError("(package-nicknames (find-package \"KEYWORD\") nil)");
    
    testEvalEquals("NIL", "(package-locked-p *new-package*)");
    testEvalEquals("T", "(package-locked-p (find-package \"SUBLISP\"))");
    testEvalEquals("NIL", "(package-locked-p (find-package \"CYC\"))");
    testEvalEquals("NIL", "(package-locked-p (find-package \"KEYWORD\"))");
    testEvalError("(package-locked-p NIL)");
    testEvalError("(package-locked-p)");
    testEvalError("(package-nicknames (find-package \"KEYWORD\") nil)");
    
    // @todo test package-lock -- this probably shouldn't be exposed publicly
    // @todo test package_shadowing_symbols when it is implemented
    
    testEvalEquals("*new-package*", "(find-package \"BLAH\")");
    testEvalEquals("nil", "(find-package \"blah\")");
    testEvalEquals("nil", "(find-package \"bLAh\")");
    testEvalEquals("*new-package*", "(find-package 'bLAh)");
    
    testEvalOfType("(csetq *tmp-package-list* (list-all-packages))", SubLList.class);
    testEvalEquals("t", "(>= (position (find-package \"SUBLISP\") *tmp-package-list*) 0)");
    testEvalEquals("t", "(>= (position (find-package \"CYC\") *tmp-package-list*) 0)");
    testEvalEquals("t", "(>= (position (find-package \"KEYWORD\") *tmp-package-list*) 0)");
    testEvalEquals("t", "(>= (position (find-package \"BLAH\") *tmp-package-list*) 0)");
    testEvalEquals("nil", "(position (find-package \"ASFDSF\") *tmp-package-list*)");
    
    testEvalEquals("'SL::ASDFSDFVDSW", "(intern 'ASDFSDFVDSW \"SUBLISP\")");
    testEvalEquals(":INTERNAL", "(second (multiple-value-list (intern 'ASDFSDFVDSW \"SUBLISP\")))");
    testEvalEquals(":EXTERNAL", "(second (multiple-value-list (intern 'CONS \"SUBLISP\")))");
    testEvalError("'SL:POPOPOPOP");
    
    testEvalEquals("(find-package \"SUBLISP\")", "(symbol-package 'ASDFSDFVDSW)");
    
    testEvalEquals("(find-package \"CYC\")", "*PACKAGE*");
    testEvalOfType("(in-package \"BLAH\")", SubLPackage.class);
    testEvalEquals("(sl:find-package \"BLAH\")", "sl:*PACKAGE*");
    testEvalOfType("(sl:in-package \"CYC\")", SubLPackage.class);
    testEvalEquals("(find-package \"CYC\")", "*PACKAGE*");
    testEvalError("(in-package \"SDF\")");
    
    // @todo add tests for unintern, make-keyword
    
    testEvalEquals("'*PACKAGE*", "(find-symbol \"*PACKAGE*\" (find-package \"SL\"))");
    testEvalEquals("'*PACKAGE*", "(find-symbol \"*PACKAGE*\" (find-package \"CYC\"))");
    testEvalEquals("NIL", "(find-symbol \"*PACKAGe*\" (find-package \"SL\"))");
    // @todo test the second return value of find-symbol
    
    // @todo add test for import, export, unexport, apropos, print-package
  }
  
  public static void testSymbolFunctions() {
    // make-symbol
    testEvalEquals("\"HALEAKALA\"", "(string (make-symbol \"HALEAKALA\"))");
    testEvalNotEquals("'#:HALEAKALA", "(make-symbol \"HALEAKALA\")");
    testEvalEquals("\"#:HALEAKALA\"", "(string (make-symbol \"#:HALEAKALA\"))");
    testEvalEquals("NIL", "(symbol-package (make-symbol \"asdflaskf\"))");
    // make-keyword
    testEvalEquals("\"HALEAKALA\"", "(string (make-keyword \"HALEAKALA\"))");
    testEvalEquals(":HALEAKALA", "(make-keyword \"HALEAKALA\")");
    // symbol-name
    testEvalEquals("\"NIL\"", "(symbol-name nil)");
    testEvalEquals("\"BLAH\"", "(symbol-name :BLAH)");
    testEvalEquals("\"QqQ\"", "(symbol-name '|QqQ|)");
    // symbol-package
    testEvalEquals("(find-package \"SUBLISP\")", "(symbol-package nil)");
    testEvalEquals("(find-package \"CYC\")", "(symbol-package 'cyc::blah)");
    testEvalEquals("(find-package \"KEYWORD\")", "(symbol-package :blah)");
    testEvalEquals("nil", "(symbol-package (make-symbol \"HALEAKALA\"))");
    // symbol-value
    testEvalEquals("3", "(csetq *asd12312* 3)");
    testEvalEquals("3", "(symbol-value '*asd12312*)");
    testEvalError("(symbol-value (make-symbol \"HALEAKALA\"))");
    // symbol-function
    testEvalEquals("#'clet", "(symbol-function 'clet)");
    testEvalEquals("#'symbol-function", "(symbol-function 'symbol-function)");
    testEvalError("(symbol-function (make-symbol \"HALEAKALA\"))");
    // boundp
    testEvalEquals("t", "(boundp '*asd12312*)");
    testEvalEquals("t", "(boundp '*PACKAGE*)");
    testEvalEquals("t", "(boundp 'nil)");
    testEvalEquals("nil", "(boundp 'asdfalkajsdflkasfl)");
    testEvalEquals("nil", "(boundp (make-symbol \"HALEAKALA\"))");
    shouldPrintTests("Testing that newly created symbols are unbound ....");
    SubLSymbol sym = SubLObjectFactory.makeSublispSymbol("*MY-PERSONAL-SYMBOL*");
    Assert.assertEquals("We are not getting unbound back for a newly-created SYMBOL",
      sym.boundp(), false);
    testEvalEquals("nil", "(boundp '*my-personal-symbol*)");
    // testEvalEquals("T","(symbol-value (deflexical *my-personal-symbol* (fif (boundp '*my-personal-symbol*) NIL T)))");
    
    // fboundp
    testEvalEquals("t", "(fboundp 'clet)");
    testEvalEquals("t", "(fboundp 'fboundp)");
    testEvalError("(fboundp #'fboundp)");
    testEvalEquals("nil", "(fboundp 'nil)");
    testEvalEquals("nil", "(fboundp 'asdfalkajsdflkasfl)");
    testEvalEquals("nil", "(fboundp (make-symbol \"HALEAKALA\"))");
    // set
    testEvalError("(set 'nil 3)");
    testEvalError("(set 't 3)");
    testEvalError("(set :BLAH 3)");
    testEvalEquals("3", "(set '*asd12312* 3)");
    testEvalEquals("3", "(symbol-value '*asd12312*)");
    // fmakunbound @todo add test
    // makunbound @todo add test
    // gensym
    testEvalOfType("(gensym)", SubLSymbol.class);
    testEvalEquals("nil", "(symbol-package (gensym))");
    testEvalNotEquals("(gensym)", "(gensym)");
    testEvalOfType("(gensym \"Foo-\")", SubLSymbol.class);
    testEvalOfType("(gensym 34)", SubLSymbol.class);
    // gentemp
    testEvalOfType("(gentemp)", SubLSymbol.class);
    testEvalEquals("(find-package 'cyc)", "(symbol-package (gentemp))");
    testEvalNotEquals("(gentemp)", "(gentemp)");
    testEvalOfType("(gentemp \"Foo-\")", SubLSymbol.class);
    // put
    testEvalEquals("t", "(put 'a 'bar t)");
    testEvalEquals("3", "(put 'a 'baz 3)");
    testEvalEquals("\"huh?\"", "(put 'a 'hunoz \"huh?\")");
    // get
    testEvalEquals("t", "(get 'a 'bar)");
    testEvalEquals("3", "(get 'a 'baz)");
    testEvalEquals("\"huh?\"", "(get 'a 'hunoz)");
    testEvalEquals("\"doh?\"", "(get 'a 'hunozz \"doh?\")");
    testEvalEquals("nil", "(get 'a 'hunozz)");
    // remprop
    testEvalEquals("t", "(remprop 'a 'bar)");
    testEvalEquals("nil", "(remprop 'a 'barr)");
    testEvalEquals("nil", "(get 'a 'bar)");
    // symbol_plist
    testEvalEquals("'(BAZ 3 HUNOZ \"huh?\")", "(symbol-plist 'a)");
    testEvalEquals("'()", "(symbol-plist 'b)");
  }

  public static void testExternalProcessStreamClosing() {
    if (SHOULD_RUN_EXPENSIVE_TESTS) {
      String form =
        "(cdotimes (i 70000)\n"
        + "  (pwhen (zerop (mod i 20))\n"
        + "    (terpri))\n"
        + "  (princ i) (princ \" \") (force-output t) (os-process-evaluation-output-strings \"echo\" (list \"\")))";
      testEvalDoesNotError(form);
    }
  }
  
  public static void testDuplicateRemovalFunctions(boolean shouldTestFast) {
    int origVal = AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF;
    int origVal2 = AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF;
    try {
      if (shouldTestFast) {
        AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = 0;
        AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF = 0;
      }
      // remove-duplicates
      testEvalEquals("\"aoAb\"", "(remove-duplicates \"baobAb\")");
      testEvalEquals("\"oAb\"", "(remove-duplicates \"bAobAb\")");
      testEvalEquals("\"oAb\"", "(remove-duplicates \"baobAb\" #'EQUALP)");
      testEvalEquals("\"baoab\"", "(remove-duplicates \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
      testEvalEquals("\"baoab\"", "(remove-duplicates \"baoBab\" #'EQUALp #'IDENTITY 2 6)");
      testEvalEquals("\"baoab\"", "(remove-duplicates \"baobab\" #'EQL #'IDENTITY 2 6)");
      testEvalEquals("\"baobab\"", "(remove-duplicates \"baobab\" #'EQL #'IdENTITY 2 4)");
      testEvalEquals("\"oab\"", "(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
      testEvalEquals("\"oab\"", "(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
      testEvalEquals("\"baobab\"", "(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
      if (SubLList.ALLOW_REMOVE_DUPLICATES_FROM_END) {
        testEvalEquals("'(#\\b #\\a #\\o #\\A)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\A #\\b))");
        testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
        testEvalEquals("'(#\\b #\\a #\\o #\\B #\\a)", "(remove-duplicates '(#\\b #\\a #\\o #\\B #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
        testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
        testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
        testEvalEquals("'(#\\b #\\a #\\o)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
        testEvalEquals("'(#\\b #\\a #\\o)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
        testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
      } else {
        testEvalEquals("'(#\\a #\\o #\\A #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\A #\\b))");
        testEvalEquals("'(#\\b #\\a #\\o #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
        testEvalEquals("'(#\\b #\\a #\\o #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\B #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
        testEvalEquals("'(#\\b #\\a #\\o #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
        testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
        testEvalEquals("'(#\\o #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
        testEvalEquals("'(#\\o #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
        testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
      }
      testEvalEquals("#(#\\a #\\o #\\A #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\A #\\b))");
      testEvalEquals("#(#\\b #\\a #\\o #\\a #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
      testEvalEquals("#(#\\b #\\a #\\o #\\a #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
      testEvalEquals("#(#\\b #\\a #\\o #\\a #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
      testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
      testEvalEquals("#(#\\o #\\a #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
      testEvalEquals("#(#\\o #\\a #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
      testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
      testEvalError("(remove-duplicates)"); // too few args
      testEvalError("(remove-duplicates 1)"); // too few args
      testEvalError("(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too many args
      testEvalError("(remove-duplicates #\\A #'EQUALP #'IDENTITY -1 NIL)"); //bad arg types
      testEvalError("(remove-duplicates \"baobab\" 3 #'IDENTITY -1 NIL)"); //bad arg types
      testEvalError("(remove-duplicates \"baobab\" #'EQUALP 'a -1 NIL)"); //bad arg types
      testEvalError("(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); //bad arg types
      testEvalError("(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); //bad arg types
      if (SubLList.ALLOW_REMOVE_DUPLICATES_FROM_END) {
        testEvalEquals("'(1 2 3 4 5 9 7)", "(remove-duplicates '(1 2 1 3 4 2 4 4 5 5 5 " + "5 5 5 5 9 7 4 3 3 2 3 2 3 4 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4))");
        testEvalEquals("'(c d b a)",
            "(remove-duplicates " + "'(c d b a a b c d))");
        testEvalEquals("'(a b c d e f g h i j k l m n o p q r s t u v w x y z)",
            "(remove-duplicates " + "'(a b c d e f g h i j k l m n o p q r s t u v w x y z " + "a b c d e f g h i j k l m n o p q r s t u v w x y z " + "a b c d e f g h i j k l m n o p q r s t u v w x y z))");
      } else {
        testEvalEquals("'(1 5 9 7 2 3 4)", "(remove-duplicates '(1 2 1 3 4 2 4 4 5 5 5 " + "5 5 5 5 9 7 4 3 3 2 3 2 3 4 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4))");
        testEvalEquals("'(a b c d)",
            "(remove-duplicates " + "'(c d b a a b c d))");
        testEvalEquals("'(a b c d e f g h i j k l m n o p q r s t u v w x y z)",
            "(remove-duplicates " + "'(a b c d e f g h i j k l m n o p q r s t u v w x y z " + "a b c d e f g h i j k l m n o p q r s t u v w x y z " + "a b c d e f g h i j k l m n o p q r s t u v w x y z))");
      }
      testEvalEquals("\"abcd\"", "(remove-duplicates \"aaaaaaaaaaa" 
          + "aaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" 
          + "bbbbbbbbbbbbcccccccccccccccccccccccccccccccccddddddddddddd" 
          + "ddddddddddddddddddabbdbcdd\")");
    } finally {
      AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = origVal;
      AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF = origVal2;
    }
  }
  
  public static void testSequenceFunctions() {
    // testEvalEquals("\"\"", "\"\"");
    // testEvalEquals("", "");
    
    // @todo make sure that lists that get modified to have 0 items return NIL
    
    // length
    testEvalEquals("3", "(length \"abc\")");
    testEvalEquals("4", "(length '(a b c d))");
    testEvalEquals("5", "(length #(a b '(c d) e f))");
    testEvalEquals("0", "(length nil)");
    testEvalError("(length 4.32)");
    testEvalError("(length -32)");
    testEvalError("(length 'a)");
    testEvalError("(length)");
    testEvalError("(length '(a b c) '(a b c))");
    // elt
    testEvalEquals("#\\a", "(elt \"abc\" 0)");
    testEvalEquals("#\\b", "(elt \"abc\" 1)");
    testEvalEquals("#\\c", "(elt \"abc\" 2)");
    testEvalEquals("'d", "(elt '(a b c d) 3)");
    testEvalEquals("'(c d)", "(elt #(a b (c d) e f) 2)"); // @todo verify this one
    //testEvalError("(elt nil 0)");
    testEvalError("(elt 4.32 0)");
    testEvalError("(elt -32 2)");
    testEvalError("(elt 'a 3)");
    testEvalError("(elt)");
    testEvalError("(elt \"abc\" -1)");
    testEvalError("(elt \"abc\" 3)");
    testEvalError("(elt '(a b c) 2 2)");
    // position
    testEvalEquals("1", "(position #\\a \"baobab\")");
    testEvalEquals("4", "(position #\\A \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("4", "(position #\\A \"baobab\" #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(position #\\A \"baobab\" #'EQL #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(posItion #\\A \"baobab\" #'EQL #'IdENTITY 2 4)");
    testEvalEquals("1", "(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("1", "(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("1", "(position #\\a '(#\\b #\\a 0 #\\b #\\a #\\b))");
    testEvalEquals("4", "(position #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("4", "(position #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(position #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(posItion #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("1", "(posItion #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("1", "(posItion #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(posItion #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("1", "(position #\\a #(#\\b #\\a 0 #\\b #\\a #\\b))");
    testEvalEquals("4", "(position #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("4", "(position #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(position #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(posItion #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("1", "(posItion #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("1", "(posItion #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(posItion #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(posItion)"); // too few args
    testEvalError("(posItion 1)"); // too few args
    testEvalError("(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(posItion #\\A #\\A #'EQUALP #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(posItion #\\A \"baobab\" 3 #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(posItion #\\A \"baobab\" #'EQUALP 'a -1 NIL)"); //bad arg types
    testEvalError("(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); //bad arg types
    // position if
    testEvalEquals("4", "(position-if #'upper-case-p \"baobAb\")");
    testEvalEquals("2", "(position-if #'upper-case-p \"baobab\" #'CHAR-UPCASE 2 6)");
    testEvalEquals("4", "(position-if #'upper-case-p \"bAobAb\" #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(position-if #'upper-case-p \"baobab\" #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(posItion-if #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
    testEvalEquals("1", "(posItion-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("1", "(posItion-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(posItion-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("1", "(position-if #'upper-case-p '(#\\b #\\A 0 #\\b #\\A #\\b))");
    testEvalEquals("2", "(position-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("4", "(position-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(position-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(posItion-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IdENTITY 2 4)");
    testEvalEquals("1", "(posItion-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("1", "(posItion-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(posItion-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("1", "(position-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
    testEvalEquals("2", "(position-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("4", "(position-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(position-if #'upper-case-p #(#\\b #\\a #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(posItion-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
    testEvalEquals("1", "(posItion-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("1", "(posItion-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(posItion-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(posItion-if)"); // too few args
    testEvalError("(posItion-if #'upper-case-p)"); // too few args
    testEvalError("(posItion-if #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(posItion-if #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(posItion-if #'upper-case-p \"baobab\" 'a -1 NIL)"); //bad arg types
    testEvalError("(posItion-if #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(posItion-if #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); //bad arg types
    // remove
    testEvalEquals("\"bAobAb\"", "(remove #\\a \"bAobAb\")");
    testEvalEquals("\"bobb\"", "(remove #\\A \"bAobAb\")");
    testEvalEquals("\"bobb\"", "(remove #\\A \"baobab\" #'EQUALP)");
    testEvalEquals("\"baobb\"", "(remove #\\A \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("\"baobb\"", "(remove #\\A \"baobab\" #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("\"baobab\"", "(remove #\\A \"baobab\" #'EQL #'IDENTITY 2 6)");
    testEvalEquals("\"baobab\"", "(remove #\\A \"baobab\" #'EQL #'IdENTITY 2 4)");
    testEvalEquals("\"bobb\"", "(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("\"bobb\"", "(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("\"baobab\"", "(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("'(#\\b #\\o #\\b #\\b)", "(remove #\\a '(#\\b #\\a #\\o #\\b #\\a #\\b))");
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\b)", "(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\b)", "(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\b)", "(remove #\\a '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove #\\a '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("'(#\\b #\\o #\\b #\\b)", "(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("'(#\\b #\\o #\\b #\\b)", "(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("#(#\\b #\\o #\\b #\\b)", "(remove #\\a #(#\\b #\\a #\\o #\\b #\\a #\\b))");
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\b)", "(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\b)", "(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("#(#\\b #\\o #\\b #\\b)", "(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#(#\\b #\\o #\\b #\\b)", "(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(remove)"); // too few args
    testEvalError("(remove 1)"); // too few args
    testEvalError("(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(remove #\\A #\\A #'EQUALP #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(remove #\\A \"baobab\" 3 #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(remove #\\A \"baobab\" #'EQUALP 'a -1 NIL)"); //bad arg types
    testEvalError("(remove #\\A \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); //bad arg types
    // remove-if
    testEvalEquals("\"baobb\"", "(remove-if #'upper-case-p \"baobAb\")");
    testEvalEquals("\"bA\"", "(remove-if #'upper-case-p \"bAobAb\" #'CHAR-UPCASE 2 6)");
    testEvalEquals("\"bAobb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IDENTITY 2 6)");
    testEvalEquals("\"baobab\"", "(remove-if #'upper-case-p \"baobab\" #'IDENTITY 2 6)");
    testEvalEquals("\"bAobAb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
    testEvalEquals("\"bobb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("\"bobb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("\"bAobAb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("'(#\\b #\\o #\\b #\\b)", "(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b))");
    testEvalEquals("'(#\\b #\\A)", "(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("'(#\\b #\\A #\\o #\\b  #\\b)", "(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("'(#\\b #\\A #\\o #\\b #\\a #\\b)", "(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("'(#\\b #\\A #\\o #\\b #\\A #\\b)", "(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
    testEvalEquals("'(#\\b #\\o #\\b #\\b)", "(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("'(#\\b #\\o #\\b #\\b)", "(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("'(#\\b #\\A #\\o #\\b #\\A #\\b)", "(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("#(#\\b #\\o #\\b #\\b)", "(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
    testEvalEquals("#(#\\b #\\A)", "(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("#(#\\b #\\A #\\o #\\b #\\b)", "(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(remove-if #'upper-case-p #(#\\b #\\a #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)", "(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
    testEvalEquals("#(#\\b #\\o #\\b #\\b)", "(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#(#\\b #\\o #\\b #\\b)", "(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)", "(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(remove-if)"); // too few args
    testEvalError("(remove-if #'upper-case-p)"); // too few args
    testEvalError("(remove-if #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(remove-if #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(remove-if #'upper-case-p \"baobab\" 'a -1 NIL)"); //bad arg types
    testEvalError("(remove-if #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(remove-if #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); //bad arg types
    // remove-duplicates
    testDuplicateRemovalFunctions(false);
    testDuplicateRemovalFunctions(true);
    // find
    testEvalEquals("#\\a", "(find #\\a \"baobab\")");
    testEvalEquals("#\\a", "(find #\\A \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("#\\a", "(find #\\A \"baobab\" #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(find #\\A \"baobab\" #'EQL #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(find #\\A \"baobab\" #'EQL #'IdENTITY 2 4)");
    testEvalEquals("#\\a", "(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#\\a", "(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("#\\a", "(find #\\a '(#\\b #\\a 0 #\\b #\\a #\\b))");
    testEvalEquals("#\\a", "(find #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("#\\a", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("#\\a", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#\\a", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("#\\a", "(find #\\a #(#\\b #\\a 0 #\\b #\\a #\\b))");
    testEvalEquals("#\\a", "(find #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("#\\a", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("#\\a", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#\\a", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(find)"); // too few args
    testEvalError("(find 1)"); // too few args
    testEvalError("(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(find #\\A #\\A #'EQUALP #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(find #\\A \"baobab\" 3 #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(find #\\A \"baobab\" #'EQUALP 'a -1 NIL)"); //bad arg types
    testEvalError("(find #\\A \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); //bad arg types
    // find-if
    testEvalEquals("#\\A", "(find-if #'upper-case-p \"baobAb\")");
    testEvalEquals("#\\o", "(find-if #'upper-case-p \"baobab\" #'CHAR-UPCASE 2 6)");
    testEvalEquals("#\\B", "(find-if #'upper-case-p \"bAobaB\" #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(find-if #'upper-case-p \"baobab\" #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(find-if #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
    testEvalEquals("#\\A", "(find-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#\\A", "(find-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(find-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("#\\A", "(find-if #'upper-case-p '(#\\b #\\A 0 #\\b #\\A #\\b))");
    testEvalEquals("#\\o", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("#\\A", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IdENTITY 2 4)");
    testEvalEquals("#\\A", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#\\A", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("#\\A", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
    testEvalEquals("#\\o", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("#\\A", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("Nil", "(find-if #'upper-case-p #(#\\b #\\a #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("NiL", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
    testEvalEquals("#\\A", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#\\A", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("NIL", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(find-if)"); // too few args
    testEvalError("(find-if #'upper-case-p)"); // too few args
    testEvalError("(find-if #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(find-if #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(find-if #'upper-case-p \"baobab\" 'a -1 NIL)"); //bad arg types
    testEvalError("(find-if #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(find-if #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); //bad arg types
    // fill
    testEvalEquals("\"zzzzzz\"", "(fill \"BAoBAB\" #\\z)");
    testEvalEquals("'(#\\z #\\z #\\z #\\z #\\z #\\z)", "(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z)");
    testEvalEquals("#(#\\z #\\z #\\z #\\z #\\z #\\z)", "(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z)");
    testEvalEquals("\"BAozzz\"", "(fill \"BAoBAB\" #\\z 3 6)");
    testEvalEquals("'(#\\b #\\A #\\o #\\z #\\z #\\z)", "(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z 3 6)");
    testEvalEquals("#(#\\b #\\A #\\o #\\z #\\z #\\z)", "(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z 3 6)");
    testEvalEquals("\"zzzzzz\"", "(fill \"BAoBAB\" #\\z -1 16)");
    testEvalEquals("'(#\\z #\\z #\\z #\\z #\\z #\\z)", "(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z -1 16)");
    testEvalEquals("#(#\\z #\\z #\\z #\\z #\\z #\\z)", "(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z -1 16)");
    testEvalEquals("\"zzzzzz\"", "(fill \"BAoBAB\" #\\z -1 NIL)");
    testEvalEquals("'(#\\z #\\z #\\z #\\z #\\z #\\z)", "(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z -1 NIL)");
    testEvalEquals("#(#\\z #\\z #\\z #\\z #\\z #\\z)", "(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z -1 NIL)");
    testEvalEquals("\"BAoBAB\"", "(fill \"BAoBAB\" #\\z -1 -1)");
    testEvalEquals("'(#\\b #\\A #\\o #\\b #\\a #\\b)", "(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z -1 -1)");
    testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)", "(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z -1 -1)");
    testEvalError("(fill)"); // too few args
    testEvalError("(fill \"baobab\")"); // too few args
    testEvalError("(fill \"baobab\" NIL -1 NIL #\\A)"); // too many args
    testEvalError("(fill #\\A -1)"); //bad arg types
    testEvalError("(fill \"baobab\" -1 NIL)"); //bad arg types
    testEvalError("(fill #\"baoBab\" -1 'b)"); //bad arg types
    testEvalError("(fill #\"baoBab\" 'a)"); //bad arg types
    // test destructivity of sustitute and substitute-if
    testEvalEquals("'(0 9 1 3 2 4 0 0 1 6 5 7 8 0)", 
      "(csetq *test-substitute-list-2190384* '(0 9 1 3 2 4 0 0 1 6 5 7 8 0))");
    testEvalEquals("'(1 9 1 3 2 4 1 1 1 6 5 7 8 1)", 
      "(substitute 1 0 *test-substitute-list-2190384*)");
    testEvalEquals("'(0 9 1 3 2 4 0 0 1 6 5 7 8 0)", "*test-substitute-list-2190384*"); 
    testEvalEquals("'(#\\a 9 1 3 #\\a #\\a #\\a #\\a 1 #\\a 5 7 #\\a #\\a)", 
      "(substitute-if #\\a #'evenp *test-substitute-list-2190384*)");
    testEvalEquals("'(0 9 1 3 2 4 0 0 1 6 5 7 8 0)", "*test-substitute-list-2190384*"); 
    testEvalEquals("'(1 9 1 3 2 4 1 1 1 6 5 7 8 1)", 
      "(nsubstitute 1 0 *test-substitute-list-2190384*)");
    testEvalEquals("'(1 9 1 3 2 4 1 1 1 6 5 7 8 1)", "*test-substitute-list-2190384*"); 
    testEvalEquals("'(0 9 1 3 2 4 0 0 1 6 5 7 8 0)", 
      "(csetq *test-substitute-list-2190384* '(0 9 1 3 2 4 0 0 1 6 5 7 8 0))");
    testEvalEquals("'(#\\a 9 1 3 #\\a #\\a #\\a #\\a 1 #\\a 5 7 #\\a #\\a)", 
      "(nsubstitute-if #\\a #'evenp *test-substitute-list-2190384*)");
    testEvalEquals("'(#\\a 9 1 3 #\\a #\\a #\\a #\\a 1 #\\a 5 7 #\\a #\\a)", "*test-substitute-list-2190384*");
    // substitute
    testEvalEquals("\"bAobAb\"", "(substitute #\\A #\\a \"baobAb\")");
    testEvalEquals("\"bAobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQ #'IDENTITY 0 NIL 2)");
    testEvalEquals("\"bAobab\"", "(substitute #\\A #\\a \"baobab\" #'EQ #'IDENTITY 0 NIL 1)");
    testEvalEquals("\"baobab\"", "(substitute #\\A #\\a \"baobab\" #'EQ #'IDENTITY 0 NIL 0)");
    testEvalEquals("\"baobab\"", "(substitute #\\a #\\A \"baobAb\" #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("\"baobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("\"baobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQL #'IDENTITY 2 6)");
    testEvalEquals("\"baobab\"", "(substitute #\\A #\\a \"baobab\" #'EQL #'IdENTITY 2 4)");
    testEvalEquals("\"bAobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("\"bAobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("\"baobab\"", "(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("'(#\\b #\\a 0 #\\b #\\a #\\b)", "(substitute #\\a #\\a '(#\\b #\\a 0 #\\b #\\a #\\b))");
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\U #\\b)", "(substitute #\\U #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("'(#\\b #\\a 0 #\\b #\\A #\\b)", "(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("'(#\\b #\\a 0 #\\b #\\A #\\b)", "(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("'(#\\b #\\a 0 #\\b #\\a #\\b)", "(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("'(#\\b #\\A 0 #\\b #\\A #\\b)", "(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("'(#\\b #\\A 0 #\\b #\\A #\\b)", "(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("'(#\\b #\\a 0 #\\b #\\a #\\b)", "(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("#(#\\b #\\A 0 #\\b #\\A #\\b)", "(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b))");
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\A #\\b)", "(substitute #\\A #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("#(#\\b #\\a 0 #\\b #\\A #\\b)", "(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("#(#\\b #\\a 0 #\\b #\\a #\\b)", "(substitute #\\A #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("#(#\\b #\\a 0 #\\b #\\a #\\b)", "(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("#(#\\b #\\A 0 #\\b #\\A #\\b)", "(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#(#\\b #\\A 0 #\\b #\\A #\\b)", "(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("#(#\\b #\\a 0 #\\b #\\a #\\b)", "(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(substitute)"); // too few args
    testEvalError("(substitute #\\A)"); // too few args
    testEvalError("(substitute #\\A #\\a)"); // too few args
    testEvalError("(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(substitute #\\A #\\a #\\A #'EQUALP #'IDENTITY -1 NIL NIL)"); //bad arg types
    testEvalError("(substitute #\\A #\\a \"baobab\" 3 #'IDENTITY -1 NIL NIL)"); //bad arg types
    testEvalError("(substitute #\\A #\\a \"baobab\" #'EQUALP 'a -1 NIL NIL)"); //bad arg types
    testEvalError("(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY 'a NIL NIL)"); //bad arg types
    testEvalError("(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 'b NIL)"); //bad arg types
    // substitute-if
    testEvalEquals("\"baobab\"", "(substitute-if #\\a #'upper-case-p \"baobAb\")");
    testEvalEquals("\"bAaaaa\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'CHAR-UPCASE 2 6)");
    testEvalEquals("\"bAobaa\"", "(substitute-if #\\a #'upper-case-p \"bAobaB\" #'IDENTITY 2 6)");
    testEvalEquals("\"bAobab\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY 2 6)");
    testEvalEquals("\"bAobAb\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
    testEvalEquals("\"baobab\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("\"baobab\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("\"baobab\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 500 2)"); // @todo verify this
    testEvalEquals("\"baobAb\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 500 1)"); // @todo verify this
    testEvalEquals("\"bAobAb\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 500 0)"); // @todo verify this
    testEvalEquals("\"bAobAb\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b))");
    testEvalEquals("'(#\\b #\\A #\\a #\\a #\\a #\\a)", "(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("'(#\\b #\\A #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("'(#\\b #\\A #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("'(#\\b #\\A #\\o #\\b #\\A #\\b)", "(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("'(#\\b #\\A #\\o #\\b #\\A #\\b)", "(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
    testEvalEquals("#(#\\b #\\A #\\a #\\a #\\a #\\a)", "(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("#(#\\b #\\A #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("#(#\\b #\\A #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)", "(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)", "(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)", "(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(substitute-if)"); // too few args
    testEvalError("(substitute-if #\\a)"); // too few args
    testEvalError("(substitute-if #\\a #'upper-case-p)"); // too few args
    testEvalError("(substitute-if #\\a #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(substitute-if #\\a #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(substitute-if #\\a #'upper-case-p \"baobab\" 'a -1 NIL)"); //bad arg types
    testEvalError("(substitute-if #\\a #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(substitute-if #\\a #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); //bad arg types
    // count
    testEvalEquals("2", "(count #\\a \"baobab\")");
    testEvalEquals("1", "(count #\\A \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("1", "(count #\\A \"baobab\" #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("0", "(count #\\A \"baobab\" #'EQL #'IDENTITY 2 6)");
    testEvalEquals("0", "(count #\\A \"baobab\" #'EQL #'IdENTITY 2 4)");
    testEvalEquals("2", "(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("2", "(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("0", "(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("2", "(count #\\a '(#\\b #\\a 0 #\\b #\\a #\\b))");
    testEvalEquals("1", "(count #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("1", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("0", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("0", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("2", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("2", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("0", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("2", "(count #\\a #(#\\b #\\a 0 #\\b #\\a #\\b))");
    testEvalEquals("1", "(count #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
    testEvalEquals("1", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
    testEvalEquals("0", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
    testEvalEquals("0", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
    testEvalEquals("2", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("2", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("0", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(count)"); // too few args
    testEvalError("(count 1)"); // too few args
    testEvalError("(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(count #\\A #\\A #'EQUALP #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(count #\\A \"baobab\" 3 #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(count #\\A \"baobab\" #'EQUALP 'a -1 NIL)"); //bad arg types
    testEvalError("(count #\\A \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); //bad arg types
    // count-if
    testEvalEquals("2", "(count-if #'upper-case-p \"baoBAb\")");
    testEvalEquals("4", "(count-if #'upper-case-p \"bAobAb\" #'CHAR-UPCASE 2 6)");
    testEvalEquals("1", "(count-if #'upper-case-p \"bAobAb\" #'IDENTITY 2 6)");
    testEvalEquals("0", "(count-if #'upper-case-p \"baobab\" #'IDENTITY 2 6)");
    testEvalEquals("0", "(count-if #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
    testEvalEquals("2", "(count-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("2", "(count-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("0", "(count-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("2", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b))");
    testEvalEquals("4", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("1", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("0", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("0", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IdENTITY 2 4)");
    testEvalEquals("2", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("2", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("0", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalEquals("2", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
    testEvalEquals("4", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
    testEvalEquals("1", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
    testEvalEquals("0", "(count-if #'upper-case-p #(#\\b #\\a #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
    testEvalEquals("0", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
    testEvalEquals("2", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo verify this
    testEvalEquals("2", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo verify this
    testEvalEquals("0", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo verify this
    testEvalError("(count-if)"); // too few args
    testEvalError("(count-if #'upper-case-p)"); // too few args
    testEvalError("(count-if #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too many args
    testEvalError("(count-if #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); //bad arg types
    testEvalError("(count-if #'upper-case-p \"baobab\" 'a -1 NIL)"); //bad arg types
    testEvalError("(count-if #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); //bad arg types
    testEvalError("(count-if #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); //bad arg types
    // search @todo add more unit tests
    testEvalEquals("0", "(search #() #(a b c))");
    testEvalEquals("0", "(search \"\" \"foobar\")");
    testEvalEquals("7", "(search \"dog\" \"it's a dog's life\")");
    testEvalEquals("NIL", "(search \"doggy\" \"it's a dog's life\")");
    testEvalEquals("1",  "(search '(\"1980s\") '(\"mid\" \"1980s\") #'equal)");
    // mismatch @todo add more unit tests
    testEvalEquals("4", "(mismatch \"abcd\" \"ABCDE\" #'char-equal)");
    testEvalEquals("4", "(mismatch \"abcdaa\" \"ABCDEa\" #'char-equal)");
    testEvalEquals("NIL", "(mismatch \"abcdaa\" \"abcdaa\" #'char-equal)");
    testEvalEquals("2", "(MISMATCH '(\"big\" \"bilbonic\" \"in\" \"the\" \"garden\") '(\"Big\" \"bilbonic\") #'EQUALP)");
    // reduce @todo add more unit tests
    testEvalEquals("31", " (creduce '+ '(10 21))");
    testEvalEquals("nil", " (creduce #'+ '())");
    testEvalEquals("3", " (creduce #'+ '(3))");
    testEvalEquals("'(((1 2) 3) 4)", " (creduce #'list '(1 2 3 4))");
    testEvalEquals("'(I N I T 1 2)", " (creduce #'append '((1) (2)) 0 NIL '(i n i t))");
    // concatenate @todo add more unit tests
    testEvalEquals("\"all together now\"", "(cconcatenate \"all\" \" \" \"together\" \" \" \"now\")");
    testEvalEquals("'(D E F #\\A #\\B #\\C 1 2 3)", "(cconcatenate '(d e f) \"ABC\" #(1 2 3))");
    testEvalEquals("NIL", "(cconcatenate NIL)");
    testEvalEquals("'(a b c)", "(cconcatenate NIL #(a b c))");
    testEvalEquals("'(a b c d e)", "(cconcatenate NIL #(a b c) NIL '(d e))");
    testEvalError("(cconcatenate \"ABC\" #(1 2 3))");
    // reverse @todo add more unit tests
    testEvalEquals("\"cba\"", "(reverse \"abc\")");
    testEvalEquals("'(c b a)", "(reverse '(a b c))");
    testEvalEquals("#(c b a)", "(reverse #(a b c))");
    testEvalEquals("nil", "(reverse nil)");
    // subsequence @todo add more unit tests
    testEvalEquals("\"bc\"", "(subseq \"abcde\" 1 3)");
    testEvalEquals("'(b c)", "(subseq '(a b c d e) 1 3)");
    testEvalEquals("#(b c)", "(subseq #(a b c d e) 1 3)");
    testEvalEquals("nil", "(subseq nil 1 2)");
  }
  
  // @todo test function and symbol-function
  // @todo test equality of functions
  // @todo test equality of macros
  // @todo test equality of exceptions (?)
  // @todo test equality of non-integer numbers (BigInt, bignum, long, float, double)
  
  // @todo test equality of structs
  
  static private abstract class DivisionTest {
    
    public DivisionTest( String number, String divisor, String quotient, String remainder) {
      this.number = number;
      this.divisor = divisor;
      this.quotient = quotient;
      this.remainder = remainder;
    }
    
    public DivisionTest( String number, String quotient, String remainder) {
      this(number, "1", quotient, remainder);
    }
    
    public String getNumber()  { return number; }
    public String getDivisor() { return divisor; }
    public String getQuotient() { return quotient; }
    public String getRemainder() { return remainder; }
    
    abstract public String getFunction();
    
    public void runTest() {
      testEvalEquals("(list " + getQuotient() + " " + getRemainder() + ")",
        "(multiple-value-list " + "(" + getFunction() + " " + getNumber() + " " + getDivisor() + "))");
    }
    
    final private String number;
    final private String divisor;
    final private String quotient;
    final private String remainder;
  };
  
  static private class RoundTest extends DivisionTest {
    public RoundTest(String number, String divisor, String quotient, String remainder) {
      super(number, divisor, quotient, remainder);
    }
    public RoundTest(String number, String quotient, String remainder) {
      super(number, quotient, remainder);
    }
    public String getFunction() { return "round"; }
  }
  
  static private class FloorTest extends DivisionTest {
    public FloorTest(String number, String divisor, String quotient, String remainder) {
      super(number, divisor, quotient, remainder);
    }
    public FloorTest(String number, String quotient, String remainder) {
      super(number, quotient, remainder);
    }
    public String getFunction() { return "floor"; }
  }
  
  static private class CeilingTest extends DivisionTest {
    public CeilingTest(String number, String divisor, String quotient, String remainder) {
      super(number, divisor, quotient, remainder);
    }
    public CeilingTest(String number, String quotient, String remainder) {
      super(number, quotient, remainder);
    }
    public String getFunction() { return "ceiling"; }
  }
  
  static private class TruncateTest extends DivisionTest {
    public TruncateTest(String number, String divisor, String quotient, String remainder) {
      super(number, divisor, quotient, remainder);
    }
    public TruncateTest(String number, String quotient, String remainder) {
      super(number, quotient, remainder);
    }
    public String getFunction() { return "truncate"; }
  }
  
  
  final static public DivisionTest[] DIVISION_TEST_CASE_TABLE = {
    new RoundTest("0", "10", "0", "0"),
    new CeilingTest("0", "10", "0", "0"),
    new FloorTest("0", "10", "0", "0"),
    new TruncateTest("0", "10", "0", "0"),
    new FloorTest("1969", "4", "492", "1"),
    new FloorTest("-1969", "4", "-493", "3"),
    // from the hyperspec
    // http://localhost/HyperSpec/Body/fun_floorcm_f_undcm_fround.html#floor
    new FloorTest("2.6","1","2","0.6000000000000001"),
    new CeilingTest("2.6","1","3","-0.3999999999999999"),
    new RoundTest("2.6","1","3","-0.3999999999999999"),
    new TruncateTest("2.6","1","2","0.6000000000000001"),
    new FloorTest("2.5","1","2","0.5"),
    new CeilingTest("2.5","1","3","-0.5"),
    new RoundTest("2.5","1","2","0.5"),
    new TruncateTest("2.5","1","2","0.5"),
    new FloorTest("2.4","1","2","0.3999999999999999"),
    new CeilingTest("2.4","1","3","-0.6000000000000001"),
    new RoundTest("2.4","1","2","0.3999999999999999"),
    new TruncateTest("2.4","1","2","0.3999999999999999"),
    new FloorTest("0.7","1","0","0.7"),
    new CeilingTest("0.7","1","1","-0.30000000000000004"),
    new RoundTest("0.7","1","1","-0.30000000000000004"),
    new TruncateTest("0.7","1","0","0.7"),
    new FloorTest("0.3","1","0","0.3"),
    new CeilingTest("0.3","1","1","-0.7"),
    new RoundTest("0.3","1","0","0.3"),
    new TruncateTest("0.3","1","0","0.3"),
    new FloorTest("-0.3","1","-1","0.7"),
    new CeilingTest("-0.3","1","0","-0.3"),
    new RoundTest("-0.3","1","0","-0.3"),
    new TruncateTest("-0.3","1","0","-0.3"),
    new FloorTest("-0.7","1","-1","0.30000000000000004"),
    new CeilingTest("-0.7","1","0","-0.7"),
    new RoundTest("-0.7","1","-1","0.30000000000000004"),
    new TruncateTest("-0.7","1","0","-0.7"),
    new FloorTest("-2.4","1","-3","0.6000000000000001"),
    new CeilingTest("-2.4","1","-2","-0.3999999999999999"),
    new RoundTest("-2.4","1","-2","-0.3999999999999999"),
    new TruncateTest("-2.4","1","-2","-0.3999999999999999"),
    new FloorTest("-2.5","1","-3","0.5"),
    new CeilingTest("-2.5","1","-2","-0.5"),
    new RoundTest("-2.5","1","-2","-0.5"),
    new TruncateTest("-2.5","1","-2","-0.5"),
    new FloorTest("-2.6","1","-3","0.3999999999999999"),
    new CeilingTest("-2.6","1","-2","-0.6000000000000001"),
    new RoundTest("-2.6","1","-3","0.3999999999999999"),
    new TruncateTest("-2.6","1","-2","-0.6000000000000001"),
  };
  
  public static void testMathFunctions() {

    testEvalEquals("" + (Integer.MAX_VALUE + 1L), "(abs " + Integer.MIN_VALUE + ")");
    testEvalEquals("" + SubLObjectFactory.makeInteger(Long.MAX_VALUE).inc(), "(abs " + Long.MIN_VALUE + ")");
    
    testEvalEquals("t", "(< 1 2)");
    testEvalEquals("nil", "(< 2 1)");
    testEvalEquals("nil", "(< 2 2)");
    testEvalEquals("t", "(< 1.0 2)");
    testEvalEquals("nil", "(< 2.0 1)");
    testEvalEquals("nil", "(< 2.0 2)");
    testEvalEquals("t", "(< 1 2.0)");
    testEvalEquals("nil", "(< 2 1.0)");
    testEvalEquals("nil", "(< 2 2.0)");
    
    testEvalEquals("nil", "(> 1 2)");
    testEvalEquals("t", "(> 2 1)");
    testEvalEquals("nil", "(> 2 2)");
    testEvalEquals("nil", "(> 1.0 2)");
    testEvalEquals("t", "(> 2.0 1)");
    testEvalEquals("nil", "(> 2.0 2)");
    testEvalEquals("nil", "(> 1 2.0)");
    testEvalEquals("t", "(> 2 1.0)");
    testEvalEquals("nil", "(> 2 2.0)");
    
    testEvalEquals("t", "(<= 1 2)");
    testEvalEquals("nil", "(<= 2 1)");
    testEvalEquals("t", "(<= 2 2)");
    testEvalEquals("t", "(<= 1.0 2)");
    testEvalEquals("nil", "(<= 2.0 1)");
    testEvalEquals("t", "(<= 2.0 2)");
    testEvalEquals("t", "(<= 1 2.0)");
    testEvalEquals("nil", "(<= 2 1.0)");
    testEvalEquals("t", "(<= 2 2.0)");
    
    testEvalEquals("nil", "(>= 1 2)");
    testEvalEquals("t", "(>= 2 1)");
    testEvalEquals("t", "(>= 2 2)");    
    testEvalEquals("nil", "(>= 1.0 2)");
    testEvalEquals("t", "(>= 2.0 1)");
    testEvalEquals("t", "(>= 2.0 2)");    
    testEvalEquals("nil", "(>= 1 2.0)");
    testEvalEquals("t", "(>= 2 1.0)");
    testEvalEquals("t", "(>= 2 2.0)");
    
    testEvalEquals("nil", "(= 1 2)");
    testEvalEquals("nil", "(= 2 1)");
    testEvalEquals("t", "(= 2 2)");    
    testEvalEquals("nil", "(= 1.0 2)");
    testEvalEquals("nil", "(= 2.0 1)");
    testEvalEquals("t", "(= 2.0 2)");    
    testEvalEquals("nil", "(= 1 2.0)");
    testEvalEquals("nil", "(= 2 1.0)");
    testEvalEquals("t", "(= 2 2.0)");
    
    
    testEvalEquals("-2", "(- 1 1 1 1)");
    testEvalEquals("*E*", "(exp 1)");
    testEvalEquals("1", "(expt 10 0)");
    testEvalEquals("2", "(sqrt 4)");
    testEvalEquals("2.0", "(sqrt 4.0)");
    testEvalEquals("3", "(truncate 628318530717958612881244160 200000000000000000000000000)");
    
    /* standard-deviation is not part of the SubL kernel
    testEvalEquals("0.0", "(standard-deviation '(1.0 1.0 1.0))");
    assertEquals(SubLObjectFactory.makeDouble(1.0), Values.nthMultipleValue(1));*/
    
    for (int i = 0; i < DIVISION_TEST_CASE_TABLE.length; i++) {
      DivisionTest test = DIVISION_TEST_CASE_TABLE[i];
      test.runTest();
    }

    testEvalError("(/)");
    testEvalEquals(".25",   "(/ 4)");
    testEvalError("(/ 0)");
    testEvalError("(/ 10 0)");
    testEvalEquals("2",   "(/ 6 3)"); // stay in integers where possible
    testEvalEquals("1.5", "(/ 6 4)");
    
    testEvalEquals("1","(mod 1969 4)");
    testEvalEquals("3","(mod (- 1969) 4)");
    
    // when we have TO-STRING implemented
    // testEvalEquals( "\"" + Integer.toString(SubLNumberFactory.MIN_FIXNUM) + "\"", "(to-string " + Integer.toString(SubLNumberFactory.MIN_FIXNUM) + ")");
    // testEvalEquals( "\"" + Integer.toString(SubLNumberFactory.MAX_FIXNUM) + "\"", "(to-string " + Integer.toString(SubLNumberFactory.MAX_FIXNUM) + ")");
    
    testEvalEquals( Integer.toString(SubLNumberFactory.MIN_FIXNUM), "*most-negative-fixnum*");
    testEvalEquals( Integer.toString(SubLNumberFactory.MAX_FIXNUM), "*most-positive-fixnum*");
    testEvalEquals( "T", "(fixnump *most-positive-fixnum*)");
    testEvalEquals( "T", "(fixnump *most-negative-fixnum*)");
    testEvalEquals( "NIL", "(fixnump (+ 1 *most-positive-fixnum*))");
    testEvalEquals( "NIL", "(fixnump (- *most-negative-fixnum* 1))");
    
    testEvalEquals( "32", "(ash 16 1)");
    testEvalEquals( "-1", "(ash -123 -23)");
    testEvalEquals( "16", "(ash 16 0)");
    testEvalEquals("8", "(ash 16 -1)");
    testEvalEquals("-79", "(ash -100000000000000000000000000000000 -100)");
    
    SubLNumber number = Sxhash.sxhash_rot(SubLNumberFactory.makeInteger(212), TWO_INTEGER).toNumber();
    testEvalEquals("848",number.toString());
    
    testEvalEquals("T","(evenp 2)");
    testEvalEquals("T","(evenp -2)");
    testEvalEquals("NIL","(evenp 3)");
    testEvalEquals("NIL","(evenp -3)");
    testEvalEquals("T","(evenp 0)");
    testEvalEquals("T","(evenp 123456789012345678902)");
    testEvalEquals("T","(evenp -123456789012345678902)");
    testEvalEquals("NIL","(evenp 123456789012345678903)");
    testEvalEquals("NIL","(evenp -123456789012345678903)");
    testEvalEquals("T","(evenp 123456789012345678900)");
    
    // from the numeric decomposition of *PI*
    testEvalEquals("'(3)", "(sl::fdl_generate 14033207267164160 45035996273704960 1000000000000000 1000000000000000 t)");
    testEvalEquals("'(9 3)", "(sl::fdl_generate 41935717373050880 45035996273704960 100000000000000 100000000000000 t)");
    testEvalEquals("'(7 9 3)", "(sl::fdl_generate 35718769128898560 45035996273704960 10000000000000 10000000000000 t)");
    testEvalEquals("'(9 7 9 3)", "(sl::fdl_generate 44104273559224320 45035996273704960 1000000000000 1000000000000 t)");
    testEvalEquals("'(8 9 7 9 3)", "(sl::fdl_generate 40439224374886400 45035996273704960 100000000000 100000000000 t)");
    testEvalEquals("'(5 8 9 7 9 3)", "(sl::fdl_generate 26561920574341120 45035996273704960 10000000000 10000000000 t)");
    testEvalEquals("'(3 5 8 9 7 9 3)", "(sl::fdl_generate 16166990939545600 45035996273704960 1000000000 1000000000 t)");
    testEvalEquals("'(5 3 5 8 9 7 9 3)", "(sl::fdl_generate 24134697230807040 45035996273704960 100000000 100000000 t)");
    testEvalEquals("'(6 5 3 5 8 9 7 9 3)", "(sl::fdl_generate 29435067487303680 45035996273704960 10000000 10000000 t)");
    testEvalEquals("'(2 6 5 3 5 8 9 7 9 3)", "(sl::fdl_generate 11950706003471360 45035996273704960 1000000 1000000 t)");
    testEvalEquals("'(9 2 6 5 3 5 8 9 7 9 3)", "(sl::fdl_generate 41727467246681600 45035996273704960 100000 100000 t)");
    testEvalEquals("'(5 9 2 6 5 3 5 8 9 7 9 3)", "(sl::fdl_generate 26690744861520640 45035996273704960 10000 10000 t)");
    testEvalEquals("'(1 5 9 2 6 5 3 5 8 9 7 9 3)", "(sl::fdl_generate 7172674113522560 45035996273704960 1000 1000 t)");
    testEvalEquals("'(4 1 5 9 2 6 5 3 5 8 9 7 9 3)", "(sl::fdl_generate 18731665920834240 45035996273704960 100 100 t)");
    testEvalEquals("'(1 4 1 5 9 2 6 5 3 5 8 9 7 9 3)", "(sl::fdl_generate 6376766219453920 45035996273704960 10 10 t)");
    testEvalEquals("'(3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 3)", "(sl::fdl_generate 14148475504056880 45035996273704960 1 1 t)");
    
    // another sub-expression from deconstructing PI
    testEvalEquals("18014398509481984","(* (expt (float-radix *pi*) 53) 2)");
    
    // getting the actual floating list for PI
    testEvalEquals("'(3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 3)","(sl::flonum-digit-list *pi*)");
    
    // testing integer length
    // @section int and longs
    /**
     * @note These tests were not done as a test case table, because
     * it is easier to set a break-point using this approach on the
     * specific test that is failing.
     *
     * (in-package :cyc)
     * (define generate-integers-for-integer-length-test ()
     * (clet (integers)
     * (cdotimes (i 65)
     * (pif (zerop i)
     * (cpush 0 integers)
     * (clet ((index (- i 1))
     * (pow2 (expt 2 index))
     * (base (expt 2 (- index 1))))
     * (pif (< index 5)
     * ;; add all of them
     * (pwhen (fixnump base)
     * (cdotimes (offset base)
     * (cpush (+ base offset) integers)))
     * ;; add some of them
     * (cdotimes (counter index)
     * (clet ((random-offset (random base)))
     * (cpush (+ base random-offset) integers))
     * (cpush pow2 integers))))))
     * (ret (delete-duplicates-sorted (sort integers #'<)))))
     *
     * (define generate-integer-length-tests-from-integers (integers &optional (stream T))
     * (cdolist (integer integers)
     * (clet ((length (integer-length integer)))
     * (format stream "~&  testEvalEquals(\"~A\",\"(integer-length ~A)\");~%"
     * length integer)))
     * (ret (boolean integers)))
     */
    testEvalEquals("0","(integer-length 0)");
    testEvalEquals("1","(integer-length 1)");
    testEvalEquals("2","(integer-length 2)");
    testEvalEquals("2","(integer-length 3)");
    testEvalEquals("3","(integer-length 4)");
    testEvalEquals("3","(integer-length 5)");
    testEvalEquals("3","(integer-length 6)");
    testEvalEquals("3","(integer-length 7)");
    testEvalEquals("4","(integer-length 8)");
    testEvalEquals("4","(integer-length 9)");
    testEvalEquals("4","(integer-length 10)");
    testEvalEquals("4","(integer-length 11)");
    testEvalEquals("4","(integer-length 12)");
    testEvalEquals("4","(integer-length 13)");
    testEvalEquals("4","(integer-length 14)");
    testEvalEquals("4","(integer-length 15)");
    testEvalEquals("5","(integer-length 16)");
    testEvalEquals("5","(integer-length 17)");
    testEvalEquals("5","(integer-length 26)");
    testEvalEquals("5","(integer-length 28)");
    testEvalEquals("5","(integer-length 31)");
    testEvalEquals("6","(integer-length 32)");
    testEvalEquals("6","(integer-length 34)");
    testEvalEquals("6","(integer-length 35)");
    testEvalEquals("6","(integer-length 37)");
    testEvalEquals("6","(integer-length 56)");
    testEvalEquals("6","(integer-length 57)");
    testEvalEquals("7","(integer-length 64)");
    testEvalEquals("7","(integer-length 66)");
    testEvalEquals("7","(integer-length 73)");
    testEvalEquals("7","(integer-length 77)");
    testEvalEquals("7","(integer-length 103)");
    testEvalEquals("7","(integer-length 116)");
    testEvalEquals("7","(integer-length 118)");
    testEvalEquals("7","(integer-length 125)");
    testEvalEquals("8","(integer-length 128)");
    testEvalEquals("8","(integer-length 141)");
    testEvalEquals("8","(integer-length 190)");
    testEvalEquals("8","(integer-length 193)");
    testEvalEquals("8","(integer-length 197)");
    testEvalEquals("8","(integer-length 211)");
    testEvalEquals("8","(integer-length 221)");
    testEvalEquals("8","(integer-length 234)");
    testEvalEquals("8","(integer-length 249)");
    testEvalEquals("9","(integer-length 256)");
    testEvalEquals("9","(integer-length 280)");
    testEvalEquals("9","(integer-length 291)");
    testEvalEquals("9","(integer-length 339)");
    testEvalEquals("9","(integer-length 353)");
    testEvalEquals("9","(integer-length 392)");
    testEvalEquals("9","(integer-length 394)");
    testEvalEquals("9","(integer-length 395)");
    testEvalEquals("9","(integer-length 480)");
    testEvalEquals("9","(integer-length 493)");
    testEvalEquals("10","(integer-length 512)");
    testEvalEquals("10","(integer-length 520)");
    testEvalEquals("10","(integer-length 542)");
    testEvalEquals("10","(integer-length 585)");
    testEvalEquals("10","(integer-length 597)");
    testEvalEquals("10","(integer-length 639)");
    testEvalEquals("10","(integer-length 722)");
    testEvalEquals("10","(integer-length 767)");
    testEvalEquals("10","(integer-length 807)");
    testEvalEquals("10","(integer-length 828)");
    testEvalEquals("10","(integer-length 857)");
    testEvalEquals("11","(integer-length 1024)");
    testEvalEquals("11","(integer-length 1178)");
    testEvalEquals("11","(integer-length 1272)");
    testEvalEquals("11","(integer-length 1310)");
    testEvalEquals("11","(integer-length 1327)");
    testEvalEquals("11","(integer-length 1502)");
    testEvalEquals("11","(integer-length 1539)");
    testEvalEquals("11","(integer-length 1619)");
    testEvalEquals("11","(integer-length 1669)");
    testEvalEquals("11","(integer-length 1680)");
    testEvalEquals("11","(integer-length 1681)");
    testEvalEquals("11","(integer-length 1822)");
    testEvalEquals("12","(integer-length 2048)");
    testEvalEquals("12","(integer-length 2079)");
    testEvalEquals("12","(integer-length 2104)");
    testEvalEquals("12","(integer-length 2342)");
    testEvalEquals("12","(integer-length 2478)");
    testEvalEquals("12","(integer-length 2800)");
    testEvalEquals("12","(integer-length 2982)");
    testEvalEquals("12","(integer-length 3168)");
    testEvalEquals("12","(integer-length 3382)");
    testEvalEquals("12","(integer-length 3475)");
    testEvalEquals("12","(integer-length 3692)");
    testEvalEquals("12","(integer-length 3766)");
    testEvalEquals("12","(integer-length 4052)");
    testEvalEquals("13","(integer-length 4096)");
    testEvalEquals("13","(integer-length 4751)");
    testEvalEquals("13","(integer-length 5085)");
    testEvalEquals("13","(integer-length 5103)");
    testEvalEquals("13","(integer-length 5396)");
    testEvalEquals("13","(integer-length 5479)");
    testEvalEquals("13","(integer-length 6215)");
    testEvalEquals("13","(integer-length 6536)");
    testEvalEquals("13","(integer-length 6737)");
    testEvalEquals("13","(integer-length 6870)");
    testEvalEquals("13","(integer-length 7201)");
    testEvalEquals("13","(integer-length 7235)");
    testEvalEquals("13","(integer-length 7876)");
    testEvalEquals("13","(integer-length 7966)");
    testEvalEquals("14","(integer-length 8192)");
    testEvalEquals("14","(integer-length 8419)");
    testEvalEquals("14","(integer-length 8471)");
    testEvalEquals("14","(integer-length 8977)");
    testEvalEquals("14","(integer-length 9599)");
    testEvalEquals("14","(integer-length 10059)");
    testEvalEquals("14","(integer-length 10403)");
    testEvalEquals("14","(integer-length 10474)");
    testEvalEquals("14","(integer-length 10606)");
    testEvalEquals("14","(integer-length 12461)");
    testEvalEquals("14","(integer-length 13016)");
    testEvalEquals("14","(integer-length 13389)");
    testEvalEquals("14","(integer-length 13545)");
    testEvalEquals("14","(integer-length 15693)");
    testEvalEquals("14","(integer-length 16189)");
    testEvalEquals("15","(integer-length 16384)");
    testEvalEquals("15","(integer-length 17897)");
    testEvalEquals("15","(integer-length 18202)");
    testEvalEquals("15","(integer-length 19388)");
    testEvalEquals("15","(integer-length 20833)");
    testEvalEquals("15","(integer-length 21169)");
    testEvalEquals("15","(integer-length 22567)");
    testEvalEquals("15","(integer-length 26405)");
    testEvalEquals("15","(integer-length 28372)");
    testEvalEquals("15","(integer-length 29594)");
    testEvalEquals("15","(integer-length 29890)");
    testEvalEquals("15","(integer-length 30152)");
    testEvalEquals("15","(integer-length 30398)");
    testEvalEquals("15","(integer-length 30787)");
    testEvalEquals("15","(integer-length 31212)");
    testEvalEquals("15","(integer-length 31580)");
    testEvalEquals("16","(integer-length 32768)");
    testEvalEquals("16","(integer-length 33240)");
    testEvalEquals("16","(integer-length 35900)");
    testEvalEquals("16","(integer-length 36070)");
    testEvalEquals("16","(integer-length 40285)");
    testEvalEquals("16","(integer-length 40914)");
    testEvalEquals("16","(integer-length 41534)");
    testEvalEquals("16","(integer-length 53087)");
    testEvalEquals("16","(integer-length 54507)");
    testEvalEquals("16","(integer-length 55160)");
    testEvalEquals("16","(integer-length 56283)");
    testEvalEquals("16","(integer-length 61058)");
    testEvalEquals("16","(integer-length 61415)");
    testEvalEquals("16","(integer-length 61988)");
    testEvalEquals("16","(integer-length 62469)");
    testEvalEquals("16","(integer-length 64803)");
    testEvalEquals("16","(integer-length 65527)");
    testEvalEquals("17","(integer-length 65536)");
    testEvalEquals("17","(integer-length 65565)");
    testEvalEquals("17","(integer-length 70725)");
    testEvalEquals("17","(integer-length 76768)");
    testEvalEquals("17","(integer-length 80425)");
    testEvalEquals("17","(integer-length 83439)");
    testEvalEquals("17","(integer-length 84806)");
    testEvalEquals("17","(integer-length 88797)");
    testEvalEquals("17","(integer-length 90216)");
    testEvalEquals("17","(integer-length 99986)");
    testEvalEquals("17","(integer-length 100861)");
    testEvalEquals("17","(integer-length 105873)");
    testEvalEquals("17","(integer-length 106925)");
    testEvalEquals("17","(integer-length 107486)");
    testEvalEquals("17","(integer-length 115679)");
    testEvalEquals("17","(integer-length 116449)");
    testEvalEquals("17","(integer-length 125539)");
    testEvalEquals("17","(integer-length 127596)");
    testEvalEquals("18","(integer-length 131072)");
    testEvalEquals("18","(integer-length 143822)");
    testEvalEquals("18","(integer-length 145423)");
    testEvalEquals("18","(integer-length 155814)");
    testEvalEquals("18","(integer-length 156684)");
    testEvalEquals("18","(integer-length 160193)");
    testEvalEquals("18","(integer-length 182098)");
    testEvalEquals("18","(integer-length 186407)");
    testEvalEquals("18","(integer-length 193511)");
    testEvalEquals("18","(integer-length 200959)");
    testEvalEquals("18","(integer-length 205441)");
    testEvalEquals("18","(integer-length 216260)");
    testEvalEquals("18","(integer-length 225333)");
    testEvalEquals("18","(integer-length 229987)");
    testEvalEquals("18","(integer-length 233296)");
    testEvalEquals("18","(integer-length 234444)");
    testEvalEquals("18","(integer-length 242790)");
    testEvalEquals("18","(integer-length 252267)");
    testEvalEquals("18","(integer-length 260973)");
    testEvalEquals("19","(integer-length 262144)");
    testEvalEquals("19","(integer-length 266923)");
    testEvalEquals("19","(integer-length 272408)");
    testEvalEquals("19","(integer-length 276956)");
    testEvalEquals("19","(integer-length 301682)");
    testEvalEquals("19","(integer-length 301765)");
    testEvalEquals("19","(integer-length 302332)");
    testEvalEquals("19","(integer-length 314820)");
    testEvalEquals("19","(integer-length 348284)");
    testEvalEquals("19","(integer-length 398157)");
    testEvalEquals("19","(integer-length 405488)");
    testEvalEquals("19","(integer-length 418161)");
    testEvalEquals("19","(integer-length 427500)");
    testEvalEquals("19","(integer-length 460859)");
    testEvalEquals("19","(integer-length 473032)");
    testEvalEquals("19","(integer-length 495310)");
    testEvalEquals("19","(integer-length 510109)");
    testEvalEquals("19","(integer-length 512529)");
    testEvalEquals("19","(integer-length 519965)");
    testEvalEquals("19","(integer-length 521458)");
    testEvalEquals("20","(integer-length 524288)");
    testEvalEquals("20","(integer-length 567908)");
    testEvalEquals("20","(integer-length 572881)");
    testEvalEquals("20","(integer-length 582363)");
    testEvalEquals("20","(integer-length 585938)");
    testEvalEquals("20","(integer-length 628871)");
    testEvalEquals("20","(integer-length 656859)");
    testEvalEquals("20","(integer-length 684775)");
    testEvalEquals("20","(integer-length 692508)");
    testEvalEquals("20","(integer-length 717681)");
    testEvalEquals("20","(integer-length 757147)");
    testEvalEquals("20","(integer-length 799931)");
    testEvalEquals("20","(integer-length 812075)");
    testEvalEquals("20","(integer-length 819850)");
    testEvalEquals("20","(integer-length 843370)");
    testEvalEquals("20","(integer-length 856566)");
    testEvalEquals("20","(integer-length 930082)");
    testEvalEquals("20","(integer-length 930526)");
    testEvalEquals("20","(integer-length 1000882)");
    testEvalEquals("20","(integer-length 1010442)");
    testEvalEquals("20","(integer-length 1038131)");
    testEvalEquals("21","(integer-length 1048576)");
    testEvalEquals("21","(integer-length 1081980)");
    testEvalEquals("21","(integer-length 1098746)");
    testEvalEquals("21","(integer-length 1102456)");
    testEvalEquals("21","(integer-length 1120478)");
    testEvalEquals("21","(integer-length 1216435)");
    testEvalEquals("21","(integer-length 1306741)");
    testEvalEquals("21","(integer-length 1352575)");
    testEvalEquals("21","(integer-length 1358120)");
    testEvalEquals("21","(integer-length 1486774)");
    testEvalEquals("21","(integer-length 1545448)");
    testEvalEquals("21","(integer-length 1619764)");
    testEvalEquals("21","(integer-length 1683067)");
    testEvalEquals("21","(integer-length 1710682)");
    testEvalEquals("21","(integer-length 1734290)");
    testEvalEquals("21","(integer-length 1750429)");
    testEvalEquals("21","(integer-length 1770037)");
    testEvalEquals("21","(integer-length 1794950)");
    testEvalEquals("21","(integer-length 1817181)");
    testEvalEquals("21","(integer-length 1868568)");
    testEvalEquals("21","(integer-length 1879600)");
    testEvalEquals("21","(integer-length 1918243)");
    testEvalEquals("22","(integer-length 2097152)");
    testEvalEquals("22","(integer-length 2162010)");
    testEvalEquals("22","(integer-length 2234232)");
    testEvalEquals("22","(integer-length 2319777)");
    testEvalEquals("22","(integer-length 2509529)");
    testEvalEquals("22","(integer-length 2591916)");
    testEvalEquals("22","(integer-length 2670422)");
    testEvalEquals("22","(integer-length 2973056)");
    testEvalEquals("22","(integer-length 3132778)");
    testEvalEquals("22","(integer-length 3163947)");
    testEvalEquals("22","(integer-length 3176879)");
    testEvalEquals("22","(integer-length 3231887)");
    testEvalEquals("22","(integer-length 3385232)");
    testEvalEquals("22","(integer-length 3525182)");
    testEvalEquals("22","(integer-length 3578488)");
    testEvalEquals("22","(integer-length 3780021)");
    testEvalEquals("22","(integer-length 3795104)");
    testEvalEquals("22","(integer-length 3927826)");
    testEvalEquals("22","(integer-length 4003934)");
    testEvalEquals("22","(integer-length 4008894)");
    testEvalEquals("22","(integer-length 4022574)");
    testEvalEquals("22","(integer-length 4177893)");
    testEvalEquals("22","(integer-length 4189465)");
    testEvalEquals("23","(integer-length 4194304)");
    testEvalEquals("23","(integer-length 4200515)");
    testEvalEquals("23","(integer-length 4389360)");
    testEvalEquals("23","(integer-length 4434763)");
    testEvalEquals("23","(integer-length 4501360)");
    testEvalEquals("23","(integer-length 4569256)");
    testEvalEquals("23","(integer-length 4899405)");
    testEvalEquals("23","(integer-length 4959698)");
    testEvalEquals("23","(integer-length 5174254)");
    testEvalEquals("23","(integer-length 5197738)");
    testEvalEquals("23","(integer-length 5288987)");
    testEvalEquals("23","(integer-length 5817637)");
    testEvalEquals("23","(integer-length 6215149)");
    testEvalEquals("23","(integer-length 6309629)");
    testEvalEquals("23","(integer-length 6344057)");
    testEvalEquals("23","(integer-length 6766152)");
    testEvalEquals("23","(integer-length 6847162)");
    testEvalEquals("23","(integer-length 6961582)");
    testEvalEquals("23","(integer-length 7356153)");
    testEvalEquals("23","(integer-length 7427263)");
    testEvalEquals("23","(integer-length 7736539)");
    testEvalEquals("23","(integer-length 7759647)");
    testEvalEquals("23","(integer-length 7937744)");
    testEvalEquals("23","(integer-length 8139461)");
    testEvalEquals("24","(integer-length 8388608)");
    testEvalEquals("24","(integer-length 8694684)");
    testEvalEquals("24","(integer-length 9031784)");
    testEvalEquals("24","(integer-length 9255256)");
    testEvalEquals("24","(integer-length 9807789)");
    testEvalEquals("24","(integer-length 9928789)");
    testEvalEquals("24","(integer-length 10398437)");
    testEvalEquals("24","(integer-length 10519597)");
    testEvalEquals("24","(integer-length 10900936)");
    testEvalEquals("24","(integer-length 12360904)");
    testEvalEquals("24","(integer-length 12550710)");
    testEvalEquals("24","(integer-length 12803689)");
    testEvalEquals("24","(integer-length 13014224)");
    testEvalEquals("24","(integer-length 13582701)");
    testEvalEquals("24","(integer-length 13802279)");
    testEvalEquals("24","(integer-length 14034018)");
    testEvalEquals("24","(integer-length 14119437)");
    testEvalEquals("24","(integer-length 14638357)");
    testEvalEquals("24","(integer-length 14752840)");
    testEvalEquals("24","(integer-length 14968482)");
    testEvalEquals("24","(integer-length 15408036)");
    testEvalEquals("24","(integer-length 15692164)");
    testEvalEquals("24","(integer-length 15701094)");
    testEvalEquals("24","(integer-length 15752586)");
    testEvalEquals("24","(integer-length 15849254)");
    testEvalEquals("25","(integer-length 16777216)");
    testEvalEquals("25","(integer-length 18915908)");
    testEvalEquals("25","(integer-length 20363453)");
    testEvalEquals("25","(integer-length 20412437)");
    testEvalEquals("25","(integer-length 22001905)");
    testEvalEquals("25","(integer-length 22060597)");
    testEvalEquals("25","(integer-length 23526364)");
    testEvalEquals("25","(integer-length 23805184)");
    testEvalEquals("25","(integer-length 24038485)");
    testEvalEquals("25","(integer-length 24266224)");
    testEvalEquals("25","(integer-length 24267706)");
    testEvalEquals("25","(integer-length 25599337)");
    testEvalEquals("25","(integer-length 26125767)");
    testEvalEquals("25","(integer-length 26486460)");
    testEvalEquals("25","(integer-length 26811063)");
    testEvalEquals("25","(integer-length 28112604)");
    testEvalEquals("25","(integer-length 28678599)");
    testEvalEquals("25","(integer-length 28780438)");
    testEvalEquals("25","(integer-length 29019999)");
    testEvalEquals("25","(integer-length 30026745)");
    testEvalEquals("25","(integer-length 30095375)");
    testEvalEquals("25","(integer-length 30201780)");
    testEvalEquals("25","(integer-length 30974947)");
    testEvalEquals("25","(integer-length 31367096)");
    testEvalEquals("25","(integer-length 33055506)");
    testEvalEquals("25","(integer-length 33435743)");
    testEvalEquals("26","(integer-length 33554432)");
    testEvalEquals("26","(integer-length 33661557)");
    testEvalEquals("26","(integer-length 34727657)");
    testEvalEquals("26","(integer-length 34834399)");
    testEvalEquals("26","(integer-length 36368302)");
    testEvalEquals("26","(integer-length 37834587)");
    testEvalEquals("26","(integer-length 37856545)");
    testEvalEquals("26","(integer-length 37919351)");
    testEvalEquals("26","(integer-length 38107597)");
    testEvalEquals("26","(integer-length 42853153)");
    testEvalEquals("26","(integer-length 45487000)");
    testEvalEquals("26","(integer-length 48058075)");
    testEvalEquals("26","(integer-length 48196130)");
    testEvalEquals("26","(integer-length 48467085)");
    testEvalEquals("26","(integer-length 48916539)");
    testEvalEquals("26","(integer-length 49903305)");
    testEvalEquals("26","(integer-length 50734029)");
    testEvalEquals("26","(integer-length 52983146)");
    testEvalEquals("26","(integer-length 53603602)");
    testEvalEquals("26","(integer-length 56827426)");
    testEvalEquals("26","(integer-length 57753474)");
    testEvalEquals("26","(integer-length 59968006)");
    testEvalEquals("26","(integer-length 60054921)");
    testEvalEquals("26","(integer-length 60729212)");
    testEvalEquals("26","(integer-length 61623500)");
    testEvalEquals("26","(integer-length 64625051)");
    testEvalEquals("26","(integer-length 65430226)");
    testEvalEquals("27","(integer-length 67108864)");
    testEvalEquals("27","(integer-length 72035650)");
    testEvalEquals("27","(integer-length 72667435)");
    testEvalEquals("27","(integer-length 73421065)");
    testEvalEquals("27","(integer-length 73987090)");
    testEvalEquals("27","(integer-length 76337257)");
    testEvalEquals("27","(integer-length 76744992)");
    testEvalEquals("27","(integer-length 87476825)");
    testEvalEquals("27","(integer-length 90071108)");
    testEvalEquals("27","(integer-length 93340679)");
    testEvalEquals("27","(integer-length 93653291)");
    testEvalEquals("27","(integer-length 99012053)");
    testEvalEquals("27","(integer-length 99685627)");
    testEvalEquals("27","(integer-length 101931784)");
    testEvalEquals("27","(integer-length 102218872)");
    testEvalEquals("27","(integer-length 104792701)");
    testEvalEquals("27","(integer-length 109382088)");
    testEvalEquals("27","(integer-length 113182458)");
    testEvalEquals("27","(integer-length 117941538)");
    testEvalEquals("27","(integer-length 118743251)");
    testEvalEquals("27","(integer-length 120542580)");
    testEvalEquals("27","(integer-length 122695727)");
    testEvalEquals("27","(integer-length 126255076)");
    testEvalEquals("27","(integer-length 126965608)");
    testEvalEquals("27","(integer-length 130852546)");
    testEvalEquals("27","(integer-length 132306843)");
    testEvalEquals("27","(integer-length 132596839)");
    testEvalEquals("27","(integer-length 134193241)");
    testEvalEquals("28","(integer-length 134217728)");
    testEvalEquals("28","(integer-length 141278311)");
    testEvalEquals("28","(integer-length 146460732)");
    testEvalEquals("28","(integer-length 146824877)");
    testEvalEquals("28","(integer-length 147084631)");
    testEvalEquals("28","(integer-length 166450365)");
    testEvalEquals("28","(integer-length 178753369)");
    testEvalEquals("28","(integer-length 179476319)");
    testEvalEquals("28","(integer-length 183598435)");
    testEvalEquals("28","(integer-length 188924143)");
    testEvalEquals("28","(integer-length 191565653)");
    testEvalEquals("28","(integer-length 195214527)");
    testEvalEquals("28","(integer-length 195934331)");
    testEvalEquals("28","(integer-length 199440096)");
    testEvalEquals("28","(integer-length 206099280)");
    testEvalEquals("28","(integer-length 206562657)");
    testEvalEquals("28","(integer-length 207208308)");
    testEvalEquals("28","(integer-length 215475601)");
    testEvalEquals("28","(integer-length 222632717)");
    testEvalEquals("28","(integer-length 222700861)");
    testEvalEquals("28","(integer-length 226685705)");
    testEvalEquals("28","(integer-length 231284983)");
    testEvalEquals("28","(integer-length 234381691)");
    testEvalEquals("28","(integer-length 235047441)");
    testEvalEquals("28","(integer-length 238476344)");
    testEvalEquals("28","(integer-length 238909012)");
    testEvalEquals("28","(integer-length 240350796)");
    testEvalEquals("28","(integer-length 246095532)");
    testEvalEquals("28","(integer-length 250759842)");
    testEvalEquals("29","(integer-length 268435456)");
    testEvalEquals("29","(integer-length 268753025)");
    testEvalEquals("29","(integer-length 277561245)");
    testEvalEquals("29","(integer-length 279802444)");
    testEvalEquals("29","(integer-length 287639493)");
    testEvalEquals("29","(integer-length 287714912)");
    testEvalEquals("29","(integer-length 290086732)");
    testEvalEquals("29","(integer-length 292798888)");
    testEvalEquals("29","(integer-length 293247591)");
    testEvalEquals("29","(integer-length 301089565)");
    testEvalEquals("29","(integer-length 301508094)");
    testEvalEquals("29","(integer-length 301567700)");
    testEvalEquals("29","(integer-length 328937171)");
    testEvalEquals("29","(integer-length 329871122)");
    testEvalEquals("29","(integer-length 338833967)");
    testEvalEquals("29","(integer-length 341530412)");
    testEvalEquals("29","(integer-length 346962792)");
    testEvalEquals("29","(integer-length 347396109)");
    testEvalEquals("29","(integer-length 348044052)");
    testEvalEquals("29","(integer-length 348533524)");
    testEvalEquals("29","(integer-length 366726457)");
    testEvalEquals("29","(integer-length 368161891)");
    testEvalEquals("29","(integer-length 378635898)");
    testEvalEquals("29","(integer-length 382889056)");
    testEvalEquals("29","(integer-length 385422514)");
    testEvalEquals("29","(integer-length 385455403)");
    testEvalEquals("29","(integer-length 385520807)");
    testEvalEquals("29","(integer-length 386935667)");
    testEvalEquals("29","(integer-length 394795222)");
    testEvalEquals("29","(integer-length 395073592)");
    testEvalEquals("30","(integer-length 536870912)");
    testEvalEquals("30","(integer-length 538686056)");
    testEvalEquals("30","(integer-length 544102226)");
    testEvalEquals("30","(integer-length 549101363)");
    testEvalEquals("30","(integer-length 552618002)");
    testEvalEquals("30","(integer-length 553233741)");
    testEvalEquals("30","(integer-length 557946281)");
    testEvalEquals("30","(integer-length 562514981)");
    testEvalEquals("30","(integer-length 569976736)");
    testEvalEquals("30","(integer-length 572483621)");
    testEvalEquals("30","(integer-length 583771104)");
    testEvalEquals("30","(integer-length 586090860)");
    testEvalEquals("30","(integer-length 586259959)");
    testEvalEquals("30","(integer-length 587083169)");
    testEvalEquals("30","(integer-length 590552653)");
    testEvalEquals("30","(integer-length 594760233)");
    testEvalEquals("30","(integer-length 605471559)");
    testEvalEquals("30","(integer-length 609242791)");
    testEvalEquals("30","(integer-length 612405129)");
    testEvalEquals("30","(integer-length 612455785)");
    testEvalEquals("30","(integer-length 629089020)");
    testEvalEquals("30","(integer-length 636480741)");
    testEvalEquals("30","(integer-length 640428931)");
    testEvalEquals("30","(integer-length 643862240)");
    testEvalEquals("30","(integer-length 648230172)");
    testEvalEquals("30","(integer-length 653104080)");
    testEvalEquals("30","(integer-length 655616265)");
    testEvalEquals("30","(integer-length 656613821)");
    testEvalEquals("30","(integer-length 661347163)");
    testEvalEquals("30","(integer-length 666481211)");
    testEvalEquals("30","(integer-length 667919622)");
    testEvalEquals("31","(integer-length 1073741824)");
    testEvalEquals("31","(integer-length 1076025196)");
    testEvalEquals("31","(integer-length 1076259139)");
    testEvalEquals("31","(integer-length 1083515811)");
    testEvalEquals("31","(integer-length 1084889346)");
    testEvalEquals("31","(integer-length 1086586109)");
    testEvalEquals("31","(integer-length 1088522448)");
    testEvalEquals("31","(integer-length 1088809304)");
    testEvalEquals("31","(integer-length 1088837997)");
    testEvalEquals("31","(integer-length 1109579767)");
    testEvalEquals("31","(integer-length 1134574848)");
    testEvalEquals("31","(integer-length 1135256728)");
    testEvalEquals("31","(integer-length 1136521954)");
    testEvalEquals("31","(integer-length 1137328771)");
    testEvalEquals("31","(integer-length 1140406962)");
    testEvalEquals("31","(integer-length 1140888785)");
    testEvalEquals("31","(integer-length 1146999949)");
    testEvalEquals("31","(integer-length 1148655444)");
    testEvalEquals("31","(integer-length 1150211689)");
    testEvalEquals("31","(integer-length 1155335279)");
    testEvalEquals("31","(integer-length 1157821882)");
    testEvalEquals("31","(integer-length 1159864667)");
    testEvalEquals("31","(integer-length 1160644336)");
    testEvalEquals("31","(integer-length 1165372825)");
    testEvalEquals("31","(integer-length 1168634875)");
    testEvalEquals("31","(integer-length 1169259335)");
    testEvalEquals("31","(integer-length 1180354105)");
    testEvalEquals("31","(integer-length 1180919698)");
    testEvalEquals("31","(integer-length 1186182135)");
    testEvalEquals("31","(integer-length 1189373486)");
    testEvalEquals("31","(integer-length 1192860880)");
    testEvalEquals("31","(integer-length 1206426595)");
    testEvalEquals("32","(integer-length 2147483648)");
    testEvalEquals("32","(integer-length 2150070447)");
    testEvalEquals("32","(integer-length 2157308824)");
    testEvalEquals("32","(integer-length 2159462793)");
    testEvalEquals("32","(integer-length 2161549502)");
    testEvalEquals("32","(integer-length 2165921606)");
    testEvalEquals("32","(integer-length 2170600316)");
    testEvalEquals("32","(integer-length 2170781866)");
    testEvalEquals("32","(integer-length 2175365822)");
    testEvalEquals("32","(integer-length 2176348082)");
    testEvalEquals("32","(integer-length 2193672864)");
    testEvalEquals("32","(integer-length 2194394091)");
    testEvalEquals("32","(integer-length 2194988780)");
    testEvalEquals("32","(integer-length 2198379723)");
    testEvalEquals("32","(integer-length 2205600293)");
    testEvalEquals("32","(integer-length 2206505724)");
    testEvalEquals("32","(integer-length 2221210733)");
    testEvalEquals("32","(integer-length 2223044031)");
    testEvalEquals("32","(integer-length 2231132471)");
    testEvalEquals("32","(integer-length 2231737417)");
    testEvalEquals("32","(integer-length 2235744799)");
    testEvalEquals("32","(integer-length 2237283055)");
    testEvalEquals("32","(integer-length 2239548245)");
    testEvalEquals("32","(integer-length 2242973086)");
    testEvalEquals("32","(integer-length 2247684147)");
    testEvalEquals("32","(integer-length 2252980602)");
    testEvalEquals("32","(integer-length 2253400333)");
    testEvalEquals("32","(integer-length 2255161820)");
    testEvalEquals("32","(integer-length 2257198971)");
    testEvalEquals("32","(integer-length 2264078832)");
    testEvalEquals("32","(integer-length 2267393832)");
    testEvalEquals("32","(integer-length 2273958829)");
    testEvalEquals("32","(integer-length 2278666602)");
    testEvalEquals("33","(integer-length 4294967296)");
    testEvalEquals("33","(integer-length 4301469742)");
    testEvalEquals("33","(integer-length 4307150854)");
    testEvalEquals("33","(integer-length 4310602671)");
    testEvalEquals("33","(integer-length 4310784935)");
    testEvalEquals("33","(integer-length 4317226204)");
    testEvalEquals("33","(integer-length 4317638686)");
    testEvalEquals("33","(integer-length 4325973655)");
    testEvalEquals("33","(integer-length 4332359569)");
    testEvalEquals("33","(integer-length 4336197598)");
    testEvalEquals("33","(integer-length 4354491078)");
    testEvalEquals("33","(integer-length 4356130933)");
    testEvalEquals("33","(integer-length 4358070209)");
    testEvalEquals("33","(integer-length 4365324508)");
    testEvalEquals("33","(integer-length 4374147973)");
    testEvalEquals("33","(integer-length 4383413185)");
    testEvalEquals("33","(integer-length 4391693017)");
    testEvalEquals("33","(integer-length 4391725688)");
    testEvalEquals("33","(integer-length 4392169161)");
    testEvalEquals("33","(integer-length 4394361027)");
    testEvalEquals("33","(integer-length 4395378561)");
    testEvalEquals("33","(integer-length 4397439503)");
    testEvalEquals("33","(integer-length 4397817673)");
    testEvalEquals("33","(integer-length 4401434404)");
    testEvalEquals("33","(integer-length 4404200845)");
    testEvalEquals("33","(integer-length 4404406591)");
    testEvalEquals("33","(integer-length 4405856450)");
    testEvalEquals("33","(integer-length 4406923082)");
    testEvalEquals("33","(integer-length 4407052642)");
    testEvalEquals("33","(integer-length 4408312212)");
    testEvalEquals("33","(integer-length 4414018973)");
    testEvalEquals("33","(integer-length 4414297428)");
    testEvalEquals("33","(integer-length 4424711094)");
    testEvalEquals("33","(integer-length 4425108330)");
    testEvalEquals("34","(integer-length 8589934592)");
    testEvalEquals("34","(integer-length 8593384482)");
    testEvalEquals("34","(integer-length 8595502259)");
    testEvalEquals("34","(integer-length 8599044473)");
    testEvalEquals("34","(integer-length 8602561891)");
    testEvalEquals("34","(integer-length 8603328422)");
    testEvalEquals("34","(integer-length 8610528091)");
    testEvalEquals("34","(integer-length 8614776756)");
    testEvalEquals("34","(integer-length 8618106247)");
    testEvalEquals("34","(integer-length 8620047294)");
    testEvalEquals("34","(integer-length 8622284607)");
    testEvalEquals("34","(integer-length 8631950691)");
    testEvalEquals("34","(integer-length 8636236149)");
    testEvalEquals("34","(integer-length 8637014602)");
    testEvalEquals("34","(integer-length 8647092781)");
    testEvalEquals("34","(integer-length 8648821115)");
    testEvalEquals("34","(integer-length 8648953451)");
    testEvalEquals("34","(integer-length 8654936497)");
    testEvalEquals("34","(integer-length 8657040893)");
    testEvalEquals("34","(integer-length 8657439365)");
    testEvalEquals("34","(integer-length 8659649107)");
    testEvalEquals("34","(integer-length 8662150559)");
    testEvalEquals("34","(integer-length 8666491914)");
    testEvalEquals("34","(integer-length 8668470577)");
    testEvalEquals("34","(integer-length 8680925030)");
    testEvalEquals("34","(integer-length 8683290721)");
    testEvalEquals("34","(integer-length 8694502363)");
    testEvalEquals("34","(integer-length 8696923612)");
    testEvalEquals("34","(integer-length 8701179359)");
    testEvalEquals("34","(integer-length 8703548634)");
    testEvalEquals("34","(integer-length 8709103211)");
    testEvalEquals("34","(integer-length 8709232299)");
    testEvalEquals("34","(integer-length 8714315313)");
    testEvalEquals("34","(integer-length 8718825275)");
    testEvalEquals("34","(integer-length 8721355176)");
    testEvalEquals("35","(integer-length 17179869184)");
    testEvalEquals("35","(integer-length 17180065829)");
    testEvalEquals("35","(integer-length 17180336204)");
    testEvalEquals("35","(integer-length 17186195924)");
    testEvalEquals("35","(integer-length 17193203589)");
    testEvalEquals("35","(integer-length 17196829560)");
    testEvalEquals("35","(integer-length 17200138324)");
    testEvalEquals("35","(integer-length 17200163014)");
    testEvalEquals("35","(integer-length 17202085606)");
    testEvalEquals("35","(integer-length 17203929455)");
    testEvalEquals("35","(integer-length 17205568379)");
    testEvalEquals("35","(integer-length 17207216892)");
    testEvalEquals("35","(integer-length 17207366810)");
    testEvalEquals("35","(integer-length 17208403008)");
    testEvalEquals("35","(integer-length 17215734937)");
    testEvalEquals("35","(integer-length 17216370153)");
    testEvalEquals("35","(integer-length 17223494904)");
    testEvalEquals("35","(integer-length 17231533452)");
    testEvalEquals("35","(integer-length 17234398192)");
    testEvalEquals("35","(integer-length 17237297962)");
    testEvalEquals("35","(integer-length 17238221854)");
    testEvalEquals("35","(integer-length 17244562739)");
    testEvalEquals("35","(integer-length 17245718804)");
    testEvalEquals("35","(integer-length 17246294004)");
    testEvalEquals("35","(integer-length 17250258231)");
    testEvalEquals("35","(integer-length 17256986695)");
    testEvalEquals("35","(integer-length 17268446285)");
    testEvalEquals("35","(integer-length 17279614268)");
    testEvalEquals("35","(integer-length 17282321488)");
    testEvalEquals("35","(integer-length 17292724255)");
    testEvalEquals("35","(integer-length 17295641441)");
    testEvalEquals("35","(integer-length 17297684816)");
    testEvalEquals("35","(integer-length 17299441678)");
    testEvalEquals("35","(integer-length 17299826158)");
    testEvalEquals("35","(integer-length 17300804442)");
    testEvalEquals("35","(integer-length 17307172944)");
    testEvalEquals("36","(integer-length 34359738368)");
    testEvalEquals("36","(integer-length 34361543378)");
    testEvalEquals("36","(integer-length 34364820608)");
    testEvalEquals("36","(integer-length 34367389767)");
    testEvalEquals("36","(integer-length 34367528373)");
    testEvalEquals("36","(integer-length 34377072970)");
    testEvalEquals("36","(integer-length 34377533401)");
    testEvalEquals("36","(integer-length 34386620880)");
    testEvalEquals("36","(integer-length 34391805403)");
    testEvalEquals("36","(integer-length 34391816099)");
    testEvalEquals("36","(integer-length 34395495836)");
    testEvalEquals("36","(integer-length 34396992624)");
    testEvalEquals("36","(integer-length 34399296895)");
    testEvalEquals("36","(integer-length 34405094339)");
    testEvalEquals("36","(integer-length 34413437981)");
    testEvalEquals("36","(integer-length 34414011013)");
    testEvalEquals("36","(integer-length 34415157797)");
    testEvalEquals("36","(integer-length 34419070683)");
    testEvalEquals("36","(integer-length 34420886780)");
    testEvalEquals("36","(integer-length 34426996342)");
    testEvalEquals("36","(integer-length 34441313028)");
    testEvalEquals("36","(integer-length 34441478623)");
    testEvalEquals("36","(integer-length 34441607269)");
    testEvalEquals("36","(integer-length 34444712858)");
    testEvalEquals("36","(integer-length 34445489892)");
    testEvalEquals("36","(integer-length 34449404171)");
    testEvalEquals("36","(integer-length 34451715795)");
    testEvalEquals("36","(integer-length 34456712032)");
    testEvalEquals("36","(integer-length 34462128533)");
    testEvalEquals("36","(integer-length 34465118570)");
    testEvalEquals("36","(integer-length 34465862993)");
    testEvalEquals("36","(integer-length 34467878184)");
    testEvalEquals("36","(integer-length 34478518344)");
    testEvalEquals("36","(integer-length 34481587563)");
    testEvalEquals("36","(integer-length 34485011025)");
    testEvalEquals("36","(integer-length 34485373365)");
    testEvalEquals("36","(integer-length 34489581786)");
    testEvalEquals("37","(integer-length 68719476736)");
    testEvalEquals("37","(integer-length 68724762479)");
    testEvalEquals("37","(integer-length 68727645632)");
    testEvalEquals("37","(integer-length 68727854937)");
    testEvalEquals("37","(integer-length 68729520251)");
    testEvalEquals("37","(integer-length 68730074103)");
    testEvalEquals("37","(integer-length 68740473718)");
    testEvalEquals("37","(integer-length 68742477796)");
    testEvalEquals("37","(integer-length 68743222711)");
    testEvalEquals("37","(integer-length 68743545281)");
    testEvalEquals("37","(integer-length 68744353211)");
    testEvalEquals("37","(integer-length 68749793235)");
    testEvalEquals("37","(integer-length 68751951843)");
    testEvalEquals("37","(integer-length 68756646316)");
    testEvalEquals("37","(integer-length 68757578672)");
    testEvalEquals("37","(integer-length 68758902388)");
    testEvalEquals("37","(integer-length 68762402845)");
    testEvalEquals("37","(integer-length 68765884684)");
    testEvalEquals("37","(integer-length 68766154477)");
    testEvalEquals("37","(integer-length 68772476359)");
    testEvalEquals("37","(integer-length 68773835064)");
    testEvalEquals("37","(integer-length 68775325456)");
    testEvalEquals("37","(integer-length 68782774008)");
    testEvalEquals("37","(integer-length 68788379372)");
    testEvalEquals("37","(integer-length 68794876799)");
    testEvalEquals("37","(integer-length 68796245058)");
    testEvalEquals("37","(integer-length 68802379666)");
    testEvalEquals("37","(integer-length 68803588722)");
    testEvalEquals("37","(integer-length 68810726720)");
    testEvalEquals("37","(integer-length 68822832774)");
    testEvalEquals("37","(integer-length 68830630525)");
    testEvalEquals("37","(integer-length 68832043772)");
    testEvalEquals("37","(integer-length 68832405372)");
    testEvalEquals("37","(integer-length 68832935639)");
    testEvalEquals("37","(integer-length 68836307894)");
    testEvalEquals("37","(integer-length 68837755208)");
    testEvalEquals("37","(integer-length 68840417254)");
    testEvalEquals("37","(integer-length 68850760265)");
    testEvalEquals("38","(integer-length 137438953472)");
    testEvalEquals("38","(integer-length 137440185623)");
    testEvalEquals("38","(integer-length 137445891111)");
    testEvalEquals("38","(integer-length 137447126897)");
    testEvalEquals("38","(integer-length 137447484143)");
    testEvalEquals("38","(integer-length 137460049847)");
    testEvalEquals("38","(integer-length 137460766652)");
    testEvalEquals("38","(integer-length 137461829664)");
    testEvalEquals("38","(integer-length 137463512312)");
    testEvalEquals("38","(integer-length 137464147314)");
    testEvalEquals("38","(integer-length 137464694072)");
    testEvalEquals("38","(integer-length 137472293065)");
    testEvalEquals("38","(integer-length 137472515569)");
    testEvalEquals("38","(integer-length 137476008342)");
    testEvalEquals("38","(integer-length 137478031435)");
    testEvalEquals("38","(integer-length 137480149548)");
    testEvalEquals("38","(integer-length 137492004395)");
    testEvalEquals("38","(integer-length 137494223348)");
    testEvalEquals("38","(integer-length 137504116632)");
    testEvalEquals("38","(integer-length 137515097964)");
    testEvalEquals("38","(integer-length 137515100127)");
    testEvalEquals("38","(integer-length 137515767566)");
    testEvalEquals("38","(integer-length 137520846713)");
    testEvalEquals("38","(integer-length 137521416632)");
    testEvalEquals("38","(integer-length 137523663866)");
    testEvalEquals("38","(integer-length 137525673941)");
    testEvalEquals("38","(integer-length 137526196948)");
    testEvalEquals("38","(integer-length 137527054234)");
    testEvalEquals("38","(integer-length 137529014309)");
    testEvalEquals("38","(integer-length 137531449141)");
    testEvalEquals("38","(integer-length 137532432809)");
    testEvalEquals("38","(integer-length 137534079867)");
    testEvalEquals("38","(integer-length 137540874994)");
    testEvalEquals("38","(integer-length 137546470360)");
    testEvalEquals("38","(integer-length 137547659691)");
    testEvalEquals("38","(integer-length 137547690650)");
    testEvalEquals("38","(integer-length 137556562369)");
    testEvalEquals("38","(integer-length 137564881774)");
    testEvalEquals("38","(integer-length 137567931235)");
    testEvalEquals("39","(integer-length 274877906944)");
    testEvalEquals("39","(integer-length 274882299443)");
    testEvalEquals("39","(integer-length 274884324464)");
    testEvalEquals("39","(integer-length 274884388081)");
    testEvalEquals("39","(integer-length 274891449484)");
    testEvalEquals("39","(integer-length 274892057988)");
    testEvalEquals("39","(integer-length 274894458664)");
    testEvalEquals("39","(integer-length 274895293805)");
    testEvalEquals("39","(integer-length 274895877251)");
    testEvalEquals("39","(integer-length 274896664812)");
    testEvalEquals("39","(integer-length 274898220756)");
    testEvalEquals("39","(integer-length 274905739833)");
    testEvalEquals("39","(integer-length 274905870290)");
    testEvalEquals("39","(integer-length 274908307177)");
    testEvalEquals("39","(integer-length 274910835487)");
    testEvalEquals("39","(integer-length 274912062853)");
    testEvalEquals("39","(integer-length 274917967785)");
    testEvalEquals("39","(integer-length 274921802517)");
    testEvalEquals("39","(integer-length 274925343455)");
    testEvalEquals("39","(integer-length 274926085830)");
    testEvalEquals("39","(integer-length 274928186589)");
    testEvalEquals("39","(integer-length 274929163623)");
    testEvalEquals("39","(integer-length 274933752787)");
    testEvalEquals("39","(integer-length 274940088780)");
    testEvalEquals("39","(integer-length 274941247158)");
    testEvalEquals("39","(integer-length 274944508473)");
    testEvalEquals("39","(integer-length 274945108207)");
    testEvalEquals("39","(integer-length 274949258490)");
    testEvalEquals("39","(integer-length 274952189549)");
    testEvalEquals("39","(integer-length 274952255991)");
    testEvalEquals("39","(integer-length 274965379384)");
    testEvalEquals("39","(integer-length 274967656521)");
    testEvalEquals("39","(integer-length 274967769171)");
    testEvalEquals("39","(integer-length 274974525497)");
    testEvalEquals("39","(integer-length 274978214005)");
    testEvalEquals("39","(integer-length 274985558920)");
    testEvalEquals("39","(integer-length 274991644616)");
    testEvalEquals("39","(integer-length 274992885629)");
    testEvalEquals("39","(integer-length 275009406895)");
    testEvalEquals("39","(integer-length 275010505515)");
    testEvalEquals("40","(integer-length 549755813888)");
    testEvalEquals("40","(integer-length 549764362889)");
    testEvalEquals("40","(integer-length 549764879805)");
    testEvalEquals("40","(integer-length 549768767961)");
    testEvalEquals("40","(integer-length 549772076398)");
    testEvalEquals("40","(integer-length 549772965179)");
    testEvalEquals("40","(integer-length 549773314195)");
    testEvalEquals("40","(integer-length 549773800342)");
    testEvalEquals("40","(integer-length 549774229431)");
    testEvalEquals("40","(integer-length 549776780429)");
    testEvalEquals("40","(integer-length 549778027980)");
    testEvalEquals("40","(integer-length 549780204405)");
    testEvalEquals("40","(integer-length 549783195736)");
    testEvalEquals("40","(integer-length 549784520125)");
    testEvalEquals("40","(integer-length 549786468629)");
    testEvalEquals("40","(integer-length 549787243794)");
    testEvalEquals("40","(integer-length 549787547212)");
    testEvalEquals("40","(integer-length 549794269960)");
    testEvalEquals("40","(integer-length 549794821523)");
    testEvalEquals("40","(integer-length 549798574468)");
    testEvalEquals("40","(integer-length 549803090511)");
    testEvalEquals("40","(integer-length 549810083171)");
    testEvalEquals("40","(integer-length 549818122345)");
    testEvalEquals("40","(integer-length 549818128759)");
    testEvalEquals("40","(integer-length 549820006939)");
    testEvalEquals("40","(integer-length 549821345446)");
    testEvalEquals("40","(integer-length 549821377028)");
    testEvalEquals("40","(integer-length 549825891534)");
    testEvalEquals("40","(integer-length 549829632781)");
    testEvalEquals("40","(integer-length 549838344849)");
    testEvalEquals("40","(integer-length 549842055907)");
    testEvalEquals("40","(integer-length 549843069065)");
    testEvalEquals("40","(integer-length 549843378031)");
    testEvalEquals("40","(integer-length 549844925304)");
    testEvalEquals("40","(integer-length 549849304067)");
    testEvalEquals("40","(integer-length 549855453414)");
    testEvalEquals("40","(integer-length 549858208022)");
    testEvalEquals("40","(integer-length 549872116284)");
    testEvalEquals("40","(integer-length 549875944978)");
    testEvalEquals("40","(integer-length 549884280482)");
    testEvalEquals("40","(integer-length 549885137478)");
    testEvalEquals("41","(integer-length 1099511627776)");
    testEvalEquals("41","(integer-length 1099514040260)");
    testEvalEquals("41","(integer-length 1099514866900)");
    testEvalEquals("41","(integer-length 1099516238983)");
    testEvalEquals("41","(integer-length 1099519270902)");
    testEvalEquals("41","(integer-length 1099521296967)");
    testEvalEquals("41","(integer-length 1099521818516)");
    testEvalEquals("41","(integer-length 1099522908332)");
    testEvalEquals("41","(integer-length 1099529264205)");
    testEvalEquals("41","(integer-length 1099530178983)");
    testEvalEquals("41","(integer-length 1099531791924)");
    testEvalEquals("41","(integer-length 1099533699245)");
    testEvalEquals("41","(integer-length 1099539057703)");
    testEvalEquals("41","(integer-length 1099541710935)");
    testEvalEquals("41","(integer-length 1099544508653)");
    testEvalEquals("41","(integer-length 1099546036907)");
    testEvalEquals("41","(integer-length 1099555169281)");
    testEvalEquals("41","(integer-length 1099555827368)");
    testEvalEquals("41","(integer-length 1099557943238)");
    testEvalEquals("41","(integer-length 1099565633748)");
    testEvalEquals("41","(integer-length 1099567229478)");
    testEvalEquals("41","(integer-length 1099569818173)");
    testEvalEquals("41","(integer-length 1099570647411)");
    testEvalEquals("41","(integer-length 1099572044018)");
    testEvalEquals("41","(integer-length 1099572823705)");
    testEvalEquals("41","(integer-length 1099573652989)");
    testEvalEquals("41","(integer-length 1099579698475)");
    testEvalEquals("41","(integer-length 1099580339596)");
    testEvalEquals("41","(integer-length 1099581362535)");
    testEvalEquals("41","(integer-length 1099586323628)");
    testEvalEquals("41","(integer-length 1099590633832)");
    testEvalEquals("41","(integer-length 1099591575931)");
    testEvalEquals("41","(integer-length 1099592348508)");
    testEvalEquals("41","(integer-length 1099600002899)");
    testEvalEquals("41","(integer-length 1099601915971)");
    testEvalEquals("41","(integer-length 1099603781567)");
    testEvalEquals("41","(integer-length 1099607453722)");
    testEvalEquals("41","(integer-length 1099611581850)");
    testEvalEquals("41","(integer-length 1099617537304)");
    testEvalEquals("41","(integer-length 1099630034367)");
    testEvalEquals("41","(integer-length 1099642188287)");
    testEvalEquals("41","(integer-length 1099644480826)");
    testEvalEquals("42","(integer-length 2199023255552)");
    testEvalEquals("42","(integer-length 2199043305480)");
    testEvalEquals("42","(integer-length 2199046257835)");
    testEvalEquals("42","(integer-length 2199046442814)");
    testEvalEquals("42","(integer-length 2199048853702)");
    testEvalEquals("42","(integer-length 2199050404133)");
    testEvalEquals("42","(integer-length 2199050423282)");
    testEvalEquals("42","(integer-length 2199051728657)");
    testEvalEquals("42","(integer-length 2199057582904)");
    testEvalEquals("42","(integer-length 2199057752416)");
    testEvalEquals("42","(integer-length 2199057872521)");
    testEvalEquals("42","(integer-length 2199059839518)");
    testEvalEquals("42","(integer-length 2199060435227)");
    testEvalEquals("42","(integer-length 2199061976253)");
    testEvalEquals("42","(integer-length 2199065609122)");
    testEvalEquals("42","(integer-length 2199070732072)");
    testEvalEquals("42","(integer-length 2199078607479)");
    testEvalEquals("42","(integer-length 2199080076185)");
    testEvalEquals("42","(integer-length 2199080548290)");
    testEvalEquals("42","(integer-length 2199082743314)");
    testEvalEquals("42","(integer-length 2199087346643)");
    testEvalEquals("42","(integer-length 2199095497149)");
    testEvalEquals("42","(integer-length 2199096051661)");
    testEvalEquals("42","(integer-length 2199097839093)");
    testEvalEquals("42","(integer-length 2199101190152)");
    testEvalEquals("42","(integer-length 2199103221624)");
    testEvalEquals("42","(integer-length 2199109936885)");
    testEvalEquals("42","(integer-length 2199112061366)");
    testEvalEquals("42","(integer-length 2199113571403)");
    testEvalEquals("42","(integer-length 2199115612455)");
    testEvalEquals("42","(integer-length 2199115642915)");
    testEvalEquals("42","(integer-length 2199117733101)");
    testEvalEquals("42","(integer-length 2199128172828)");
    testEvalEquals("42","(integer-length 2199129956832)");
    testEvalEquals("42","(integer-length 2199134112657)");
    testEvalEquals("42","(integer-length 2199138327043)");
    testEvalEquals("42","(integer-length 2199141201063)");
    testEvalEquals("42","(integer-length 2199146161219)");
    testEvalEquals("42","(integer-length 2199146912623)");
    testEvalEquals("42","(integer-length 2199148996373)");
    testEvalEquals("42","(integer-length 2199149865515)");
    testEvalEquals("42","(integer-length 2199151008648)");
    testEvalEquals("42","(integer-length 2199155483804)");
    testEvalEquals("43","(integer-length 4398046511104)");
    testEvalEquals("43","(integer-length 4398046610921)");
    testEvalEquals("43","(integer-length 4398047857319)");
    testEvalEquals("43","(integer-length 4398050887164)");
    testEvalEquals("43","(integer-length 4398053206913)");
    testEvalEquals("43","(integer-length 4398056956211)");
    testEvalEquals("43","(integer-length 4398060353163)");
    testEvalEquals("43","(integer-length 4398061994615)");
    testEvalEquals("43","(integer-length 4398066982260)");
    testEvalEquals("43","(integer-length 4398082034742)");
    testEvalEquals("43","(integer-length 4398084279379)");
    testEvalEquals("43","(integer-length 4398092386613)");
    testEvalEquals("43","(integer-length 4398095861002)");
    testEvalEquals("43","(integer-length 4398097512268)");
    testEvalEquals("43","(integer-length 4398099078536)");
    testEvalEquals("43","(integer-length 4398105499808)");
    testEvalEquals("43","(integer-length 4398108581949)");
    testEvalEquals("43","(integer-length 4398112493801)");
    testEvalEquals("43","(integer-length 4398116037329)");
    testEvalEquals("43","(integer-length 4398117510232)");
    testEvalEquals("43","(integer-length 4398123562763)");
    testEvalEquals("43","(integer-length 4398127378944)");
    testEvalEquals("43","(integer-length 4398128708894)");
    testEvalEquals("43","(integer-length 4398131015874)");
    testEvalEquals("43","(integer-length 4398132915060)");
    testEvalEquals("43","(integer-length 4398133257802)");
    testEvalEquals("43","(integer-length 4398133444558)");
    testEvalEquals("43","(integer-length 4398134625990)");
    testEvalEquals("43","(integer-length 4398138623470)");
    testEvalEquals("43","(integer-length 4398140778053)");
    testEvalEquals("43","(integer-length 4398144580287)");
    testEvalEquals("43","(integer-length 4398145338242)");
    testEvalEquals("43","(integer-length 4398145833819)");
    testEvalEquals("43","(integer-length 4398147678044)");
    testEvalEquals("43","(integer-length 4398151751996)");
    testEvalEquals("43","(integer-length 4398154115200)");
    testEvalEquals("43","(integer-length 4398157854520)");
    testEvalEquals("43","(integer-length 4398159648650)");
    testEvalEquals("43","(integer-length 4398162317315)");
    testEvalEquals("43","(integer-length 4398163644166)");
    testEvalEquals("43","(integer-length 4398169554065)");
    testEvalEquals("43","(integer-length 4398170140139)");
    testEvalEquals("43","(integer-length 4398177985553)");
    testEvalEquals("43","(integer-length 4398180001325)");
    testEvalEquals("44","(integer-length 8796093022208)");
    testEvalEquals("44","(integer-length 8796094530154)");
    testEvalEquals("44","(integer-length 8796097902206)");
    testEvalEquals("44","(integer-length 8796098091553)");
    testEvalEquals("44","(integer-length 8796099332018)");
    testEvalEquals("44","(integer-length 8796100108060)");
    testEvalEquals("44","(integer-length 8796102146299)");
    testEvalEquals("44","(integer-length 8796103885305)");
    testEvalEquals("44","(integer-length 8796105560285)");
    testEvalEquals("44","(integer-length 8796106386038)");
    testEvalEquals("44","(integer-length 8796106706533)");
    testEvalEquals("44","(integer-length 8796108557294)");
    testEvalEquals("44","(integer-length 8796113720931)");
    testEvalEquals("44","(integer-length 8796118267782)");
    testEvalEquals("44","(integer-length 8796123271222)");
    testEvalEquals("44","(integer-length 8796124876790)");
    testEvalEquals("44","(integer-length 8796125572200)");
    testEvalEquals("44","(integer-length 8796133332837)");
    testEvalEquals("44","(integer-length 8796135424297)");
    testEvalEquals("44","(integer-length 8796139804395)");
    testEvalEquals("44","(integer-length 8796141382010)");
    testEvalEquals("44","(integer-length 8796148348290)");
    testEvalEquals("44","(integer-length 8796152707834)");
    testEvalEquals("44","(integer-length 8796158674879)");
    testEvalEquals("44","(integer-length 8796159729529)");
    testEvalEquals("44","(integer-length 8796169159250)");
    testEvalEquals("44","(integer-length 8796169794882)");
    testEvalEquals("44","(integer-length 8796170239557)");
    testEvalEquals("44","(integer-length 8796180851868)");
    testEvalEquals("44","(integer-length 8796186710041)");
    testEvalEquals("44","(integer-length 8796190889062)");
    testEvalEquals("44","(integer-length 8796195080413)");
    testEvalEquals("44","(integer-length 8796197099376)");
    testEvalEquals("44","(integer-length 8796198401578)");
    testEvalEquals("44","(integer-length 8796200841299)");
    testEvalEquals("44","(integer-length 8796204284839)");
    testEvalEquals("44","(integer-length 8796205430462)");
    testEvalEquals("44","(integer-length 8796205808019)");
    testEvalEquals("44","(integer-length 8796206021482)");
    testEvalEquals("44","(integer-length 8796209172108)");
    testEvalEquals("44","(integer-length 8796211256206)");
    testEvalEquals("44","(integer-length 8796216796185)");
    testEvalEquals("44","(integer-length 8796217967595)");
    testEvalEquals("44","(integer-length 8796219979368)");
    testEvalEquals("44","(integer-length 8796227118707)");
    testEvalEquals("45","(integer-length 17592186044416)");
    testEvalEquals("45","(integer-length 17592193446653)");
    testEvalEquals("45","(integer-length 17592196491339)");
    testEvalEquals("45","(integer-length 17592198224304)");
    testEvalEquals("45","(integer-length 17592198410636)");
    testEvalEquals("45","(integer-length 17592198866706)");
    testEvalEquals("45","(integer-length 17592199981380)");
    testEvalEquals("45","(integer-length 17592200623734)");
    testEvalEquals("45","(integer-length 17592202747317)");
    testEvalEquals("45","(integer-length 17592206124789)");
    testEvalEquals("45","(integer-length 17592211968512)");
    testEvalEquals("45","(integer-length 17592214691786)");
    testEvalEquals("45","(integer-length 17592217113670)");
    testEvalEquals("45","(integer-length 17592219253511)");
    testEvalEquals("45","(integer-length 17592223395453)");
    testEvalEquals("45","(integer-length 17592226449331)");
    testEvalEquals("45","(integer-length 17592227594198)");
    testEvalEquals("45","(integer-length 17592233697186)");
    testEvalEquals("45","(integer-length 17592242603260)");
    testEvalEquals("45","(integer-length 17592246621919)");
    testEvalEquals("45","(integer-length 17592250027438)");
    testEvalEquals("45","(integer-length 17592250184260)");
    testEvalEquals("45","(integer-length 17592251955959)");
    testEvalEquals("45","(integer-length 17592254489136)");
    testEvalEquals("45","(integer-length 17592256724562)");
    testEvalEquals("45","(integer-length 17592261021687)");
    testEvalEquals("45","(integer-length 17592261166926)");
    testEvalEquals("45","(integer-length 17592262451403)");
    testEvalEquals("45","(integer-length 17592272509522)");
    testEvalEquals("45","(integer-length 17592279736882)");
    testEvalEquals("45","(integer-length 17592280335667)");
    testEvalEquals("45","(integer-length 17592282449587)");
    testEvalEquals("45","(integer-length 17592285714065)");
    testEvalEquals("45","(integer-length 17592290660056)");
    testEvalEquals("45","(integer-length 17592290687850)");
    testEvalEquals("45","(integer-length 17592291475337)");
    testEvalEquals("45","(integer-length 17592291509124)");
    testEvalEquals("45","(integer-length 17592292692286)");
    testEvalEquals("45","(integer-length 17592293562821)");
    testEvalEquals("45","(integer-length 17592302740196)");
    testEvalEquals("45","(integer-length 17592303106575)");
    testEvalEquals("45","(integer-length 17592303413846)");
    testEvalEquals("45","(integer-length 17592303992695)");
    testEvalEquals("45","(integer-length 17592308860571)");
    testEvalEquals("45","(integer-length 17592316372062)");
    testEvalEquals("45","(integer-length 17592318916873)");
    testEvalEquals("46","(integer-length 35184372088832)");
    testEvalEquals("46","(integer-length 35184376720390)");
    testEvalEquals("46","(integer-length 35184378806326)");
    testEvalEquals("46","(integer-length 35184382321452)");
    testEvalEquals("46","(integer-length 35184393453256)");
    testEvalEquals("46","(integer-length 35184393832054)");
    testEvalEquals("46","(integer-length 35184397847501)");
    testEvalEquals("46","(integer-length 35184401343422)");
    testEvalEquals("46","(integer-length 35184402866385)");
    testEvalEquals("46","(integer-length 35184409235265)");
    testEvalEquals("46","(integer-length 35184413780117)");
    testEvalEquals("46","(integer-length 35184414518840)");
    testEvalEquals("46","(integer-length 35184414799951)");
    testEvalEquals("46","(integer-length 35184417716851)");
    testEvalEquals("46","(integer-length 35184421376802)");
    testEvalEquals("46","(integer-length 35184428776616)");
    testEvalEquals("46","(integer-length 35184431874766)");
    testEvalEquals("46","(integer-length 35184431923738)");
    testEvalEquals("46","(integer-length 35184432651613)");
    testEvalEquals("46","(integer-length 35184437600806)");
    testEvalEquals("46","(integer-length 35184440039994)");
    testEvalEquals("46","(integer-length 35184440744874)");
    testEvalEquals("46","(integer-length 35184447601852)");
    testEvalEquals("46","(integer-length 35184448028457)");
    testEvalEquals("46","(integer-length 35184449769581)");
    testEvalEquals("46","(integer-length 35184452132493)");
    testEvalEquals("46","(integer-length 35184453702783)");
    testEvalEquals("46","(integer-length 35184455886680)");
    testEvalEquals("46","(integer-length 35184456337529)");
    testEvalEquals("46","(integer-length 35184457046203)");
    testEvalEquals("46","(integer-length 35184461530749)");
    testEvalEquals("46","(integer-length 35184464087795)");
    testEvalEquals("46","(integer-length 35184468096378)");
    testEvalEquals("46","(integer-length 35184474812254)");
    testEvalEquals("46","(integer-length 35184481516747)");
    testEvalEquals("46","(integer-length 35184483124583)");
    testEvalEquals("46","(integer-length 35184491072263)");
    testEvalEquals("46","(integer-length 35184492409057)");
    testEvalEquals("46","(integer-length 35184493412885)");
    testEvalEquals("46","(integer-length 35184494828367)");
    testEvalEquals("46","(integer-length 35184496036331)");
    testEvalEquals("46","(integer-length 35184496398505)");
    testEvalEquals("46","(integer-length 35184498763632)");
    testEvalEquals("46","(integer-length 35184501896904)");
    testEvalEquals("46","(integer-length 35184504395135)");
    testEvalEquals("46","(integer-length 35184504662045)");
    testEvalEquals("46","(integer-length 35184506173845)");
    testEvalEquals("47","(integer-length 70368744177664)");
    testEvalEquals("47","(integer-length 70368749345740)");
    testEvalEquals("47","(integer-length 70368750918381)");
    testEvalEquals("47","(integer-length 70368752409704)");
    testEvalEquals("47","(integer-length 70368753747156)");
    testEvalEquals("47","(integer-length 70368759954695)");
    testEvalEquals("47","(integer-length 70368760399926)");
    testEvalEquals("47","(integer-length 70368760767784)");
    testEvalEquals("47","(integer-length 70368768378532)");
    testEvalEquals("47","(integer-length 70368768839902)");
    testEvalEquals("47","(integer-length 70368768875365)");
    testEvalEquals("47","(integer-length 70368768879901)");
    testEvalEquals("47","(integer-length 70368770604992)");
    testEvalEquals("47","(integer-length 70368776151990)");
    testEvalEquals("47","(integer-length 70368776177386)");
    testEvalEquals("47","(integer-length 70368778400846)");
    testEvalEquals("47","(integer-length 70368778520302)");
    testEvalEquals("47","(integer-length 70368779493137)");
    testEvalEquals("47","(integer-length 70368780228112)");
    testEvalEquals("47","(integer-length 70368784157996)");
    testEvalEquals("47","(integer-length 70368787693483)");
    testEvalEquals("47","(integer-length 70368788565552)");
    testEvalEquals("47","(integer-length 70368791835564)");
    testEvalEquals("47","(integer-length 70368791867609)");
    testEvalEquals("47","(integer-length 70368799549348)");
    testEvalEquals("47","(integer-length 70368801692814)");
    testEvalEquals("47","(integer-length 70368808857884)");
    testEvalEquals("47","(integer-length 70368809094371)");
    testEvalEquals("47","(integer-length 70368809472842)");
    testEvalEquals("47","(integer-length 70368809731146)");
    testEvalEquals("47","(integer-length 70368810012520)");
    testEvalEquals("47","(integer-length 70368810742304)");
    testEvalEquals("47","(integer-length 70368814040228)");
    testEvalEquals("47","(integer-length 70368814800921)");
    testEvalEquals("47","(integer-length 70368816334140)");
    testEvalEquals("47","(integer-length 70368818246437)");
    testEvalEquals("47","(integer-length 70368821365609)");
    testEvalEquals("47","(integer-length 70368822973131)");
    testEvalEquals("47","(integer-length 70368824913268)");
    testEvalEquals("47","(integer-length 70368833633224)");
    testEvalEquals("47","(integer-length 70368834385459)");
    testEvalEquals("47","(integer-length 70368840706035)");
    testEvalEquals("47","(integer-length 70368847148027)");
    testEvalEquals("47","(integer-length 70368851756073)");
    testEvalEquals("47","(integer-length 70368852742183)");
    testEvalEquals("47","(integer-length 70368858295556)");
    testEvalEquals("47","(integer-length 70368865654405)");
    testEvalEquals("47","(integer-length 70368878251189)");
    testEvalEquals("48","(integer-length 140737488355328)");
    testEvalEquals("48","(integer-length 140737489536094)");
    testEvalEquals("48","(integer-length 140737496482469)");
    testEvalEquals("48","(integer-length 140737499060107)");
    testEvalEquals("48","(integer-length 140737508788329)");
    testEvalEquals("48","(integer-length 140737508847001)");
    testEvalEquals("48","(integer-length 140737515086964)");
    testEvalEquals("48","(integer-length 140737517093156)");
    testEvalEquals("48","(integer-length 140737518216662)");
    testEvalEquals("48","(integer-length 140737524311489)");
    testEvalEquals("48","(integer-length 140737526220154)");
    testEvalEquals("48","(integer-length 140737528827832)");
    testEvalEquals("48","(integer-length 140737529205967)");
    testEvalEquals("48","(integer-length 140737532554642)");
    testEvalEquals("48","(integer-length 140737533556794)");
    testEvalEquals("48","(integer-length 140737538419155)");
    testEvalEquals("48","(integer-length 140737539486588)");
    testEvalEquals("48","(integer-length 140737541934790)");
    testEvalEquals("48","(integer-length 140737543304171)");
    testEvalEquals("48","(integer-length 140737544812615)");
    testEvalEquals("48","(integer-length 140737546290400)");
    testEvalEquals("48","(integer-length 140737546364783)");
    testEvalEquals("48","(integer-length 140737548766256)");
    testEvalEquals("48","(integer-length 140737554051727)");
    testEvalEquals("48","(integer-length 140737557211581)");
    testEvalEquals("48","(integer-length 140737558944815)");
    testEvalEquals("48","(integer-length 140737560973873)");
    testEvalEquals("48","(integer-length 140737562461443)");
    testEvalEquals("48","(integer-length 140737564406002)");
    testEvalEquals("48","(integer-length 140737564701725)");
    testEvalEquals("48","(integer-length 140737568968957)");
    testEvalEquals("48","(integer-length 140737571739846)");
    testEvalEquals("48","(integer-length 140737574999654)");
    testEvalEquals("48","(integer-length 140737577345662)");
    testEvalEquals("48","(integer-length 140737577486927)");
    testEvalEquals("48","(integer-length 140737579017312)");
    testEvalEquals("48","(integer-length 140737579916353)");
    testEvalEquals("48","(integer-length 140737584792861)");
    testEvalEquals("48","(integer-length 140737586854636)");
    testEvalEquals("48","(integer-length 140737586996078)");
    testEvalEquals("48","(integer-length 140737588948399)");
    testEvalEquals("48","(integer-length 140737589540299)");
    testEvalEquals("48","(integer-length 140737593235351)");
    testEvalEquals("48","(integer-length 140737593330141)");
    testEvalEquals("48","(integer-length 140737593990284)");
    testEvalEquals("48","(integer-length 140737608159770)");
    testEvalEquals("48","(integer-length 140737609021592)");
    testEvalEquals("48","(integer-length 140737613658235)");
    testEvalEquals("48","(integer-length 140737618116360)");
    testEvalEquals("49","(integer-length 281474976710656)");
    testEvalEquals("49","(integer-length 281474987348281)");
    testEvalEquals("49","(integer-length 281474989736764)");
    testEvalEquals("49","(integer-length 281474990859260)");
    testEvalEquals("49","(integer-length 281475002816233)");
    testEvalEquals("49","(integer-length 281475003358095)");
    testEvalEquals("49","(integer-length 281475003513742)");
    testEvalEquals("49","(integer-length 281475004289779)");
    testEvalEquals("49","(integer-length 281475013015286)");
    testEvalEquals("49","(integer-length 281475015848265)");
    testEvalEquals("49","(integer-length 281475016794427)");
    testEvalEquals("49","(integer-length 281475020121282)");
    testEvalEquals("49","(integer-length 281475021039408)");
    testEvalEquals("49","(integer-length 281475022716594)");
    testEvalEquals("49","(integer-length 281475023250607)");
    testEvalEquals("49","(integer-length 281475025150078)");
    testEvalEquals("49","(integer-length 281475027523188)");
    testEvalEquals("49","(integer-length 281475027909569)");
    testEvalEquals("49","(integer-length 281475031120948)");
    testEvalEquals("49","(integer-length 281475031314877)");
    testEvalEquals("49","(integer-length 281475031517886)");
    testEvalEquals("49","(integer-length 281475034665141)");
    testEvalEquals("49","(integer-length 281475035322249)");
    testEvalEquals("49","(integer-length 281475036691017)");
    testEvalEquals("49","(integer-length 281475040089166)");
    testEvalEquals("49","(integer-length 281475045787819)");
    testEvalEquals("49","(integer-length 281475051419914)");
    testEvalEquals("49","(integer-length 281475052079807)");
    testEvalEquals("49","(integer-length 281475059070664)");
    testEvalEquals("49","(integer-length 281475060870892)");
    testEvalEquals("49","(integer-length 281475061773573)");
    testEvalEquals("49","(integer-length 281475073392977)");
    testEvalEquals("49","(integer-length 281475075949415)");
    testEvalEquals("49","(integer-length 281475077508297)");
    testEvalEquals("49","(integer-length 281475077786063)");
    testEvalEquals("49","(integer-length 281475079030337)");
    testEvalEquals("49","(integer-length 281475080810412)");
    testEvalEquals("49","(integer-length 281475081095169)");
    testEvalEquals("49","(integer-length 281475081430208)");
    testEvalEquals("49","(integer-length 281475085413332)");
    testEvalEquals("49","(integer-length 281475090929045)");
    testEvalEquals("49","(integer-length 281475097290956)");
    testEvalEquals("49","(integer-length 281475098681061)");
    testEvalEquals("49","(integer-length 281475100926516)");
    testEvalEquals("49","(integer-length 281475102152160)");
    testEvalEquals("49","(integer-length 281475102731567)");
    testEvalEquals("49","(integer-length 281475102872253)");
    testEvalEquals("49","(integer-length 281475105129791)");
    testEvalEquals("49","(integer-length 281475107243359)");
    testEvalEquals("49","(integer-length 281475109989044)");
    testEvalEquals("50","(integer-length 562949953421312)");
    testEvalEquals("50","(integer-length 562949959776721)");
    testEvalEquals("50","(integer-length 562949960793096)");
    testEvalEquals("50","(integer-length 562949962596691)");
    testEvalEquals("50","(integer-length 562949964226611)");
    testEvalEquals("50","(integer-length 562949966351939)");
    testEvalEquals("50","(integer-length 562949966385169)");
    testEvalEquals("50","(integer-length 562949981149397)");
    testEvalEquals("50","(integer-length 562949983562842)");
    testEvalEquals("50","(integer-length 562949983709399)");
    testEvalEquals("50","(integer-length 562949984795377)");
    testEvalEquals("50","(integer-length 562949986185276)");
    testEvalEquals("50","(integer-length 562949986796865)");
    testEvalEquals("50","(integer-length 562949987508674)");
    testEvalEquals("50","(integer-length 562949990214701)");
    testEvalEquals("50","(integer-length 562949990847765)");
    testEvalEquals("50","(integer-length 562949990989815)");
    testEvalEquals("50","(integer-length 562949992794506)");
    testEvalEquals("50","(integer-length 562950000680771)");
    testEvalEquals("50","(integer-length 562950002176944)");
    testEvalEquals("50","(integer-length 562950007100241)");
    testEvalEquals("50","(integer-length 562950010930633)");
    testEvalEquals("50","(integer-length 562950012477049)");
    testEvalEquals("50","(integer-length 562950020577460)");
    testEvalEquals("50","(integer-length 562950022940229)");
    testEvalEquals("50","(integer-length 562950023829945)");
    testEvalEquals("50","(integer-length 562950025370452)");
    testEvalEquals("50","(integer-length 562950028722768)");
    testEvalEquals("50","(integer-length 562950030190066)");
    testEvalEquals("50","(integer-length 562950030383870)");
    testEvalEquals("50","(integer-length 562950033463910)");
    testEvalEquals("50","(integer-length 562950039264974)");
    testEvalEquals("50","(integer-length 562950040642360)");
    testEvalEquals("50","(integer-length 562950042472591)");
    testEvalEquals("50","(integer-length 562950042669535)");
    testEvalEquals("50","(integer-length 562950044908930)");
    testEvalEquals("50","(integer-length 562950051182692)");
    testEvalEquals("50","(integer-length 562950052776444)");
    testEvalEquals("50","(integer-length 562950054419367)");
    testEvalEquals("50","(integer-length 562950055690852)");
    testEvalEquals("50","(integer-length 562950058780681)");
    testEvalEquals("50","(integer-length 562950062754730)");
    testEvalEquals("50","(integer-length 562950063689494)");
    testEvalEquals("50","(integer-length 562950064298651)");
    testEvalEquals("50","(integer-length 562950066689208)");
    testEvalEquals("50","(integer-length 562950069287328)");
    testEvalEquals("50","(integer-length 562950076319924)");
    testEvalEquals("50","(integer-length 562950076767505)");
    testEvalEquals("50","(integer-length 562950085487292)");
    testEvalEquals("50","(integer-length 562950085917772)");
    testEvalEquals("50","(integer-length 562950087631334)");
    testEvalEquals("51","(integer-length 1125899906842624)");
    testEvalEquals("51","(integer-length 1125899909780287)");
    testEvalEquals("51","(integer-length 1125899912140657)");
    testEvalEquals("51","(integer-length 1125899916180486)");
    testEvalEquals("51","(integer-length 1125899916856464)");
    testEvalEquals("51","(integer-length 1125899918118968)");
    testEvalEquals("51","(integer-length 1125899920587057)");
    testEvalEquals("51","(integer-length 1125899922273067)");
    testEvalEquals("51","(integer-length 1125899922515815)");
    testEvalEquals("51","(integer-length 1125899934594064)");
    testEvalEquals("51","(integer-length 1125899935596137)");
    testEvalEquals("51","(integer-length 1125899940044362)");
    testEvalEquals("51","(integer-length 1125899941251492)");
    testEvalEquals("51","(integer-length 1125899941901346)");
    testEvalEquals("51","(integer-length 1125899942505008)");
    testEvalEquals("51","(integer-length 1125899943576166)");
    testEvalEquals("51","(integer-length 1125899943594098)");
    testEvalEquals("51","(integer-length 1125899952155297)");
    testEvalEquals("51","(integer-length 1125899952312227)");
    testEvalEquals("51","(integer-length 1125899952835022)");
    testEvalEquals("51","(integer-length 1125899967140596)");
    testEvalEquals("51","(integer-length 1125899968442046)");
    testEvalEquals("51","(integer-length 1125899974403670)");
    testEvalEquals("51","(integer-length 1125899977838018)");
    testEvalEquals("51","(integer-length 1125899979513753)");
    testEvalEquals("51","(integer-length 1125899982168851)");
    testEvalEquals("51","(integer-length 1125899985082977)");
    testEvalEquals("51","(integer-length 1125899985316925)");
    testEvalEquals("51","(integer-length 1125899988367099)");
    testEvalEquals("51","(integer-length 1125899989922311)");
    testEvalEquals("51","(integer-length 1125899990868925)");
    testEvalEquals("51","(integer-length 1125899991121917)");
    testEvalEquals("51","(integer-length 1125899994478352)");
    testEvalEquals("51","(integer-length 1125899996668655)");
    testEvalEquals("51","(integer-length 1125900006960529)");
    testEvalEquals("51","(integer-length 1125900010000619)");
    testEvalEquals("51","(integer-length 1125900011176594)");
    testEvalEquals("51","(integer-length 1125900011654508)");
    testEvalEquals("51","(integer-length 1125900012385392)");
    testEvalEquals("51","(integer-length 1125900013275578)");
    testEvalEquals("51","(integer-length 1125900016357486)");
    testEvalEquals("51","(integer-length 1125900019239573)");
    testEvalEquals("51","(integer-length 1125900020376588)");
    testEvalEquals("51","(integer-length 1125900020450464)");
    testEvalEquals("51","(integer-length 1125900022077381)");
    testEvalEquals("51","(integer-length 1125900022912288)");
    testEvalEquals("51","(integer-length 1125900024468618)");
    testEvalEquals("51","(integer-length 1125900026007388)");
    testEvalEquals("51","(integer-length 1125900026480006)");
    testEvalEquals("51","(integer-length 1125900027517862)");
    testEvalEquals("51","(integer-length 1125900030427513)");
    testEvalEquals("51","(integer-length 1125900038059223)");
    testEvalEquals("52","(integer-length 2251799813685248)");
    testEvalEquals("52","(integer-length 2251799814578024)");
    testEvalEquals("52","(integer-length 2251799817291596)");
    testEvalEquals("52","(integer-length 2251799818320528)");
    testEvalEquals("52","(integer-length 2251799823604251)");
    testEvalEquals("52","(integer-length 2251799824619291)");
    testEvalEquals("52","(integer-length 2251799828632650)");
    testEvalEquals("52","(integer-length 2251799829058729)");
    testEvalEquals("52","(integer-length 2251799830434430)");
    testEvalEquals("52","(integer-length 2251799830585205)");
    testEvalEquals("52","(integer-length 2251799835791990)");
    testEvalEquals("52","(integer-length 2251799838089948)");
    testEvalEquals("52","(integer-length 2251799840085183)");
    testEvalEquals("52","(integer-length 2251799841372075)");
    testEvalEquals("52","(integer-length 2251799844109134)");
    testEvalEquals("52","(integer-length 2251799851126573)");
    testEvalEquals("52","(integer-length 2251799859488679)");
    testEvalEquals("52","(integer-length 2251799867096136)");
    testEvalEquals("52","(integer-length 2251799867324039)");
    testEvalEquals("52","(integer-length 2251799868553231)");
    testEvalEquals("52","(integer-length 2251799873588137)");
    testEvalEquals("52","(integer-length 2251799877232885)");
    testEvalEquals("52","(integer-length 2251799880236756)");
    testEvalEquals("52","(integer-length 2251799882631669)");
    testEvalEquals("52","(integer-length 2251799884334374)");
    testEvalEquals("52","(integer-length 2251799884396997)");
    testEvalEquals("52","(integer-length 2251799889205834)");
    testEvalEquals("52","(integer-length 2251799890753721)");
    testEvalEquals("52","(integer-length 2251799892786180)");
    testEvalEquals("52","(integer-length 2251799894973894)");
    testEvalEquals("52","(integer-length 2251799896687684)");
    testEvalEquals("52","(integer-length 2251799898108512)");
    testEvalEquals("52","(integer-length 2251799903157551)");
    testEvalEquals("52","(integer-length 2251799904747386)");
    testEvalEquals("52","(integer-length 2251799904841873)");
    testEvalEquals("52","(integer-length 2251799906385310)");
    testEvalEquals("52","(integer-length 2251799908955501)");
    testEvalEquals("52","(integer-length 2251799912942667)");
    testEvalEquals("52","(integer-length 2251799912983183)");
    testEvalEquals("52","(integer-length 2251799917479298)");
    testEvalEquals("52","(integer-length 2251799917805038)");
    testEvalEquals("52","(integer-length 2251799921174533)");
    testEvalEquals("52","(integer-length 2251799922361615)");
    testEvalEquals("52","(integer-length 2251799924578943)");
    testEvalEquals("52","(integer-length 2251799929810345)");
    testEvalEquals("52","(integer-length 2251799930251391)");
    testEvalEquals("52","(integer-length 2251799930468613)");
    testEvalEquals("52","(integer-length 2251799930753882)");
    testEvalEquals("52","(integer-length 2251799932323074)");
    testEvalEquals("52","(integer-length 2251799938427816)");
    testEvalEquals("52","(integer-length 2251799939223377)");
    testEvalEquals("52","(integer-length 2251799941422834)");
    testEvalEquals("52","(integer-length 2251799946752988)");
    testEvalEquals("53","(integer-length 4503599627370496)");
    testEvalEquals("53","(integer-length 4503599627379917)");
    testEvalEquals("53","(integer-length 4503599628908880)");
    testEvalEquals("53","(integer-length 4503599631675948)");
    testEvalEquals("53","(integer-length 4503599636455644)");
    testEvalEquals("53","(integer-length 4503599639084431)");
    testEvalEquals("53","(integer-length 4503599639156406)");
    testEvalEquals("53","(integer-length 4503599642454469)");
    testEvalEquals("53","(integer-length 4503599642506602)");
    testEvalEquals("53","(integer-length 4503599643756873)");
    testEvalEquals("53","(integer-length 4503599644825162)");
    testEvalEquals("53","(integer-length 4503599646420873)");
    testEvalEquals("53","(integer-length 4503599652593645)");
    testEvalEquals("53","(integer-length 4503599654859423)");
    testEvalEquals("53","(integer-length 4503599656637653)");
    testEvalEquals("53","(integer-length 4503599659933069)");
    testEvalEquals("53","(integer-length 4503599664764634)");
    testEvalEquals("53","(integer-length 4503599667762402)");
    testEvalEquals("53","(integer-length 4503599669816513)");
    testEvalEquals("53","(integer-length 4503599670190230)");
    testEvalEquals("53","(integer-length 4503599671469806)");
    testEvalEquals("53","(integer-length 4503599672965429)");
    testEvalEquals("53","(integer-length 4503599673419175)");
    testEvalEquals("53","(integer-length 4503599673969502)");
    testEvalEquals("53","(integer-length 4503599675432030)");
    testEvalEquals("53","(integer-length 4503599682403906)");
    testEvalEquals("53","(integer-length 4503599682895225)");
    testEvalEquals("53","(integer-length 4503599684576607)");
    testEvalEquals("53","(integer-length 4503599686905617)");
    testEvalEquals("53","(integer-length 4503599688211553)");
    testEvalEquals("53","(integer-length 4503599691574856)");
    testEvalEquals("53","(integer-length 4503599694587207)");
    testEvalEquals("53","(integer-length 4503599697304118)");
    testEvalEquals("53","(integer-length 4503599699384039)");
    testEvalEquals("53","(integer-length 4503599700602632)");
    testEvalEquals("53","(integer-length 4503599702019322)");
    testEvalEquals("53","(integer-length 4503599704770396)");
    testEvalEquals("53","(integer-length 4503599709055902)");
    testEvalEquals("53","(integer-length 4503599714320329)");
    testEvalEquals("53","(integer-length 4503599715357131)");
    testEvalEquals("53","(integer-length 4503599717411474)");
    testEvalEquals("53","(integer-length 4503599717753275)");
    testEvalEquals("53","(integer-length 4503599718923924)");
    testEvalEquals("53","(integer-length 4503599721969437)");
    testEvalEquals("53","(integer-length 4503599725991014)");
    testEvalEquals("53","(integer-length 4503599726333005)");
    testEvalEquals("53","(integer-length 4503599726599597)");
    testEvalEquals("53","(integer-length 4503599738328738)");
    testEvalEquals("53","(integer-length 4503599738377220)");
    testEvalEquals("53","(integer-length 4503599739070919)");
    testEvalEquals("53","(integer-length 4503599741411006)");
    testEvalEquals("53","(integer-length 4503599752985499)");
    testEvalEquals("53","(integer-length 4503599753957574)");
    testEvalEquals("53","(integer-length 4503599761231827)");
    testEvalEquals("54","(integer-length 9007199254740992)");
    testEvalEquals("54","(integer-length 9007199257116625)");
    testEvalEquals("54","(integer-length 9007199257439075)");
    testEvalEquals("54","(integer-length 9007199258940410)");
    testEvalEquals("54","(integer-length 9007199259204837)");
    testEvalEquals("54","(integer-length 9007199262115575)");
    testEvalEquals("54","(integer-length 9007199262339990)");
    testEvalEquals("54","(integer-length 9007199265278208)");
    testEvalEquals("54","(integer-length 9007199266428358)");
    testEvalEquals("54","(integer-length 9007199268884425)");
    testEvalEquals("54","(integer-length 9007199269844937)");
    testEvalEquals("54","(integer-length 9007199270247515)");
    testEvalEquals("54","(integer-length 9007199283263630)");
    testEvalEquals("54","(integer-length 9007199296241918)");
    testEvalEquals("54","(integer-length 9007199296578378)");
    testEvalEquals("54","(integer-length 9007199298172648)");
    testEvalEquals("54","(integer-length 9007199300783770)");
    testEvalEquals("54","(integer-length 9007199305241079)");
    testEvalEquals("54","(integer-length 9007199305857646)");
    testEvalEquals("54","(integer-length 9007199306915188)");
    testEvalEquals("54","(integer-length 9007199307480599)");
    testEvalEquals("54","(integer-length 9007199307902521)");
    testEvalEquals("54","(integer-length 9007199308182427)");
    testEvalEquals("54","(integer-length 9007199313064832)");
    testEvalEquals("54","(integer-length 9007199316072415)");
    testEvalEquals("54","(integer-length 9007199318130236)");
    testEvalEquals("54","(integer-length 9007199318422989)");
    testEvalEquals("54","(integer-length 9007199320024387)");
    testEvalEquals("54","(integer-length 9007199325803373)");
    testEvalEquals("54","(integer-length 9007199327940166)");
    testEvalEquals("54","(integer-length 9007199328851431)");
    testEvalEquals("54","(integer-length 9007199330101558)");
    testEvalEquals("54","(integer-length 9007199330527628)");
    testEvalEquals("54","(integer-length 9007199332007168)");
    testEvalEquals("54","(integer-length 9007199332020374)");
    testEvalEquals("54","(integer-length 9007199335843053)");
    testEvalEquals("54","(integer-length 9007199338381245)");
    testEvalEquals("54","(integer-length 9007199338491049)");
    testEvalEquals("54","(integer-length 9007199341935446)");
    testEvalEquals("54","(integer-length 9007199342591361)");
    testEvalEquals("54","(integer-length 9007199343671845)");
    testEvalEquals("54","(integer-length 9007199351204143)");
    testEvalEquals("54","(integer-length 9007199354612680)");
    testEvalEquals("54","(integer-length 9007199355675633)");
    testEvalEquals("54","(integer-length 9007199359899637)");
    testEvalEquals("54","(integer-length 9007199361155608)");
    testEvalEquals("54","(integer-length 9007199367861380)");
    testEvalEquals("54","(integer-length 9007199369988240)");
    testEvalEquals("54","(integer-length 9007199372240382)");
    testEvalEquals("54","(integer-length 9007199373750763)");
    testEvalEquals("54","(integer-length 9007199374394873)");
    testEvalEquals("54","(integer-length 9007199378372576)");
    testEvalEquals("54","(integer-length 9007199380394731)");
    testEvalEquals("54","(integer-length 9007199380540362)");
    testEvalEquals("54","(integer-length 9007199383880089)");
    testEvalEquals("55","(integer-length 18014398509481984)");
    testEvalEquals("55","(integer-length 18014398511549422)");
    testEvalEquals("55","(integer-length 18014398515778667)");
    testEvalEquals("55","(integer-length 18014398517568528)");
    testEvalEquals("55","(integer-length 18014398519733563)");
    testEvalEquals("55","(integer-length 18014398520219865)");
    testEvalEquals("55","(integer-length 18014398522959979)");
    testEvalEquals("55","(integer-length 18014398526150565)");
    testEvalEquals("55","(integer-length 18014398527583822)");
    testEvalEquals("55","(integer-length 18014398531410736)");
    testEvalEquals("55","(integer-length 18014398534516278)");
    testEvalEquals("55","(integer-length 18014398535280960)");
    testEvalEquals("55","(integer-length 18014398536456237)");
    testEvalEquals("55","(integer-length 18014398536596323)");
    testEvalEquals("55","(integer-length 18014398539068741)");
    testEvalEquals("55","(integer-length 18014398539624627)");
    testEvalEquals("55","(integer-length 18014398540903534)");
    testEvalEquals("55","(integer-length 18014398545388322)");
    testEvalEquals("55","(integer-length 18014398560062109)");
    testEvalEquals("55","(integer-length 18014398562442503)");
    testEvalEquals("55","(integer-length 18014398565734931)");
    testEvalEquals("55","(integer-length 18014398568137103)");
    testEvalEquals("55","(integer-length 18014398568802500)");
    testEvalEquals("55","(integer-length 18014398570442047)");
    testEvalEquals("55","(integer-length 18014398570994949)");
    testEvalEquals("55","(integer-length 18014398571388622)");
    testEvalEquals("55","(integer-length 18014398573542333)");
    testEvalEquals("55","(integer-length 18014398576556239)");
    testEvalEquals("55","(integer-length 18014398578413382)");
    testEvalEquals("55","(integer-length 18014398579847339)");
    testEvalEquals("55","(integer-length 18014398580140343)");
    testEvalEquals("55","(integer-length 18014398585675889)");
    testEvalEquals("55","(integer-length 18014398586362978)");
    testEvalEquals("55","(integer-length 18014398586608484)");
    testEvalEquals("55","(integer-length 18014398588575833)");
    testEvalEquals("55","(integer-length 18014398588920317)");
    testEvalEquals("55","(integer-length 18014398589541341)");
    testEvalEquals("55","(integer-length 18014398594136914)");
    testEvalEquals("55","(integer-length 18014398597097267)");
    testEvalEquals("55","(integer-length 18014398599461412)");
    testEvalEquals("55","(integer-length 18014398600436344)");
    testEvalEquals("55","(integer-length 18014398603702641)");
    testEvalEquals("55","(integer-length 18014398606225378)");
    testEvalEquals("55","(integer-length 18014398607511432)");
    testEvalEquals("55","(integer-length 18014398607747064)");
    testEvalEquals("55","(integer-length 18014398609501439)");
    testEvalEquals("55","(integer-length 18014398610861798)");
    testEvalEquals("55","(integer-length 18014398611454439)");
    testEvalEquals("55","(integer-length 18014398619910919)");
    testEvalEquals("55","(integer-length 18014398621957543)");
    testEvalEquals("55","(integer-length 18014398622143224)");
    testEvalEquals("55","(integer-length 18014398626040766)");
    testEvalEquals("55","(integer-length 18014398628733333)");
    testEvalEquals("55","(integer-length 18014398629413061)");
    testEvalEquals("55","(integer-length 18014398632818521)");
    testEvalEquals("55","(integer-length 18014398636662460)");
    testEvalEquals("56","(integer-length 36028797018963968)");
    testEvalEquals("56","(integer-length 36028797021802147)");
    testEvalEquals("56","(integer-length 36028797029148054)");
    testEvalEquals("56","(integer-length 36028797029223380)");
    testEvalEquals("56","(integer-length 36028797030057669)");
    testEvalEquals("56","(integer-length 36028797030804963)");
    testEvalEquals("56","(integer-length 36028797032967936)");
    testEvalEquals("56","(integer-length 36028797037183691)");
    testEvalEquals("56","(integer-length 36028797037277042)");
    testEvalEquals("56","(integer-length 36028797040192590)");
    testEvalEquals("56","(integer-length 36028797041255815)");
    testEvalEquals("56","(integer-length 36028797042084834)");
    testEvalEquals("56","(integer-length 36028797043150378)");
    testEvalEquals("56","(integer-length 36028797044611666)");
    testEvalEquals("56","(integer-length 36028797046232958)");
    testEvalEquals("56","(integer-length 36028797046512551)");
    testEvalEquals("56","(integer-length 36028797047221701)");
    testEvalEquals("56","(integer-length 36028797047570704)");
    testEvalEquals("56","(integer-length 36028797048136373)");
    testEvalEquals("56","(integer-length 36028797048606588)");
    testEvalEquals("56","(integer-length 36028797053742869)");
    testEvalEquals("56","(integer-length 36028797054028587)");
    testEvalEquals("56","(integer-length 36028797054031775)");
    testEvalEquals("56","(integer-length 36028797055116596)");
    testEvalEquals("56","(integer-length 36028797058352247)");
    testEvalEquals("56","(integer-length 36028797059178877)");
    testEvalEquals("56","(integer-length 36028797061531265)");
    testEvalEquals("56","(integer-length 36028797061868193)");
    testEvalEquals("56","(integer-length 36028797062924842)");
    testEvalEquals("56","(integer-length 36028797064858374)");
    testEvalEquals("56","(integer-length 36028797070748239)");
    testEvalEquals("56","(integer-length 36028797071016901)");
    testEvalEquals("56","(integer-length 36028797071965446)");
    testEvalEquals("56","(integer-length 36028797077519412)");
    testEvalEquals("56","(integer-length 36028797079554621)");
    testEvalEquals("56","(integer-length 36028797084023364)");
    testEvalEquals("56","(integer-length 36028797087395656)");
    testEvalEquals("56","(integer-length 36028797087726281)");
    testEvalEquals("56","(integer-length 36028797089867628)");
    testEvalEquals("56","(integer-length 36028797098275068)");
    testEvalEquals("56","(integer-length 36028797102386782)");
    testEvalEquals("56","(integer-length 36028797104171273)");
    testEvalEquals("56","(integer-length 36028797106730465)");
    testEvalEquals("56","(integer-length 36028797115844591)");
    testEvalEquals("56","(integer-length 36028797118201159)");
    testEvalEquals("56","(integer-length 36028797118876063)");
    testEvalEquals("56","(integer-length 36028797124740967)");
    testEvalEquals("56","(integer-length 36028797128781512)");
    testEvalEquals("56","(integer-length 36028797130170266)");
    testEvalEquals("56","(integer-length 36028797132922083)");
    testEvalEquals("56","(integer-length 36028797135647166)");
    testEvalEquals("56","(integer-length 36028797137230780)");
    testEvalEquals("56","(integer-length 36028797143470742)");
    testEvalEquals("56","(integer-length 36028797145870279)");
    testEvalEquals("56","(integer-length 36028797149952396)");
    testEvalEquals("56","(integer-length 36028797150588189)");
    testEvalEquals("56","(integer-length 36028797152573102)");
    testEvalEquals("57","(integer-length 72057594037927936)");
    testEvalEquals("57","(integer-length 72057594038374916)");
    testEvalEquals("57","(integer-length 72057594041407458)");
    testEvalEquals("57","(integer-length 72057594047337406)");
    testEvalEquals("57","(integer-length 72057594048489163)");
    testEvalEquals("57","(integer-length 72057594053213657)");
    testEvalEquals("57","(integer-length 72057594054129050)");
    testEvalEquals("57","(integer-length 72057594054550789)");
    testEvalEquals("57","(integer-length 72057594055622368)");
    testEvalEquals("57","(integer-length 72057594055710118)");
    testEvalEquals("57","(integer-length 72057594055951765)");
    testEvalEquals("57","(integer-length 72057594058289484)");
    testEvalEquals("57","(integer-length 72057594060627895)");
    testEvalEquals("57","(integer-length 72057594060895499)");
    testEvalEquals("57","(integer-length 72057594066163398)");
    testEvalEquals("57","(integer-length 72057594071090811)");
    testEvalEquals("57","(integer-length 72057594072038995)");
    testEvalEquals("57","(integer-length 72057594072537604)");
    testEvalEquals("57","(integer-length 72057594074146420)");
    testEvalEquals("57","(integer-length 72057594074586241)");
    testEvalEquals("57","(integer-length 72057594075075535)");
    testEvalEquals("57","(integer-length 72057594075149650)");
    testEvalEquals("57","(integer-length 72057594076235861)");
    testEvalEquals("57","(integer-length 72057594078563282)");
    testEvalEquals("57","(integer-length 72057594078774759)");
    testEvalEquals("57","(integer-length 72057594084315547)");
    testEvalEquals("57","(integer-length 72057594084817835)");
    testEvalEquals("57","(integer-length 72057594090169884)");
    testEvalEquals("57","(integer-length 72057594093232784)");
    testEvalEquals("57","(integer-length 72057594095756064)");
    testEvalEquals("57","(integer-length 72057594097220285)");
    testEvalEquals("57","(integer-length 72057594097612735)");
    testEvalEquals("57","(integer-length 72057594107227174)");
    testEvalEquals("57","(integer-length 72057594107316888)");
    testEvalEquals("57","(integer-length 72057594110322117)");
    testEvalEquals("57","(integer-length 72057594110940575)");
    testEvalEquals("57","(integer-length 72057594113189950)");
    testEvalEquals("57","(integer-length 72057594117510774)");
    testEvalEquals("57","(integer-length 72057594127130801)");
    testEvalEquals("57","(integer-length 72057594131490192)");
    testEvalEquals("57","(integer-length 72057594132814746)");
    testEvalEquals("57","(integer-length 72057594133787180)");
    testEvalEquals("57","(integer-length 72057594134428708)");
    testEvalEquals("57","(integer-length 72057594135402264)");
    testEvalEquals("57","(integer-length 72057594136501700)");
    testEvalEquals("57","(integer-length 72057594142580173)");
    testEvalEquals("57","(integer-length 72057594144183627)");
    testEvalEquals("57","(integer-length 72057594146367606)");
    testEvalEquals("57","(integer-length 72057594155871175)");
    testEvalEquals("57","(integer-length 72057594156043328)");
    testEvalEquals("57","(integer-length 72057594156160978)");
    testEvalEquals("57","(integer-length 72057594156616949)");
    testEvalEquals("57","(integer-length 72057594157143684)");
    testEvalEquals("57","(integer-length 72057594157736667)");
    testEvalEquals("57","(integer-length 72057594158641110)");
    testEvalEquals("57","(integer-length 72057594158689397)");
    testEvalEquals("57","(integer-length 72057594168114138)");
    testEvalEquals("57","(integer-length 72057594168580824)");
    testEvalEquals("58","(integer-length 144115188075855872)");
    testEvalEquals("58","(integer-length 144115188076079114)");
    testEvalEquals("58","(integer-length 144115188076215922)");
    testEvalEquals("58","(integer-length 144115188076599720)");
    testEvalEquals("58","(integer-length 144115188078086115)");
    testEvalEquals("58","(integer-length 144115188078138107)");
    testEvalEquals("58","(integer-length 144115188080231051)");
    testEvalEquals("58","(integer-length 144115188080301453)");
    testEvalEquals("58","(integer-length 144115188080957783)");
    testEvalEquals("58","(integer-length 144115188081633013)");
    testEvalEquals("58","(integer-length 144115188085083177)");
    testEvalEquals("58","(integer-length 144115188085693178)");
    testEvalEquals("58","(integer-length 144115188088599902)");
    testEvalEquals("58","(integer-length 144115188089589673)");
    testEvalEquals("58","(integer-length 144115188092779251)");
    testEvalEquals("58","(integer-length 144115188095462772)");
    testEvalEquals("58","(integer-length 144115188096977130)");
    testEvalEquals("58","(integer-length 144115188098626896)");
    testEvalEquals("58","(integer-length 144115188099400284)");
    testEvalEquals("58","(integer-length 144115188105117688)");
    testEvalEquals("58","(integer-length 144115188105204672)");
    testEvalEquals("58","(integer-length 144115188105458085)");
    testEvalEquals("58","(integer-length 144115188105550390)");
    testEvalEquals("58","(integer-length 144115188108647219)");
    testEvalEquals("58","(integer-length 144115188112982838)");
    testEvalEquals("58","(integer-length 144115188118714142)");
    testEvalEquals("58","(integer-length 144115188118771119)");
    testEvalEquals("58","(integer-length 144115188122398012)");
    testEvalEquals("58","(integer-length 144115188122837432)");
    testEvalEquals("58","(integer-length 144115188124460414)");
    testEvalEquals("58","(integer-length 144115188124980688)");
    testEvalEquals("58","(integer-length 144115188126786840)");
    testEvalEquals("58","(integer-length 144115188130242825)");
    testEvalEquals("58","(integer-length 144115188130949603)");
    testEvalEquals("58","(integer-length 144115188134058744)");
    testEvalEquals("58","(integer-length 144115188146330649)");
    testEvalEquals("58","(integer-length 144115188146489686)");
    testEvalEquals("58","(integer-length 144115188150716517)");
    testEvalEquals("58","(integer-length 144115188153208505)");
    testEvalEquals("58","(integer-length 144115188153291210)");
    testEvalEquals("58","(integer-length 144115188156078339)");
    testEvalEquals("58","(integer-length 144115188160675199)");
    testEvalEquals("58","(integer-length 144115188163429113)");
    testEvalEquals("58","(integer-length 144115188163552272)");
    testEvalEquals("58","(integer-length 144115188167221558)");
    testEvalEquals("58","(integer-length 144115188168177794)");
    testEvalEquals("58","(integer-length 144115188168933992)");
    testEvalEquals("58","(integer-length 144115188169067245)");
    testEvalEquals("58","(integer-length 144115188180353111)");
    testEvalEquals("58","(integer-length 144115188181756137)");
    testEvalEquals("58","(integer-length 144115188183557606)");
    testEvalEquals("58","(integer-length 144115188184036363)");
    testEvalEquals("58","(integer-length 144115188184419947)");
    testEvalEquals("58","(integer-length 144115188186638629)");
    testEvalEquals("58","(integer-length 144115188190077333)");
    testEvalEquals("58","(integer-length 144115188195727744)");
    testEvalEquals("58","(integer-length 144115188200633095)");
    testEvalEquals("58","(integer-length 144115188203553509)");
    testEvalEquals("58","(integer-length 144115188205834329)");
    testEvalEquals("59","(integer-length 288230376151711744)");
    testEvalEquals("59","(integer-length 288230376152740142)");
    testEvalEquals("59","(integer-length 288230376154323661)");
    testEvalEquals("59","(integer-length 288230376158030566)");
    testEvalEquals("59","(integer-length 288230376159071667)");
    testEvalEquals("59","(integer-length 288230376159676706)");
    testEvalEquals("59","(integer-length 288230376160712243)");
    testEvalEquals("59","(integer-length 288230376162998051)");
    testEvalEquals("59","(integer-length 288230376167883404)");
    testEvalEquals("59","(integer-length 288230376169957196)");
    testEvalEquals("59","(integer-length 288230376172553054)");
    testEvalEquals("59","(integer-length 288230376173172482)");
    testEvalEquals("59","(integer-length 288230376176392694)");
    testEvalEquals("59","(integer-length 288230376177226150)");
    testEvalEquals("59","(integer-length 288230376177784222)");
    testEvalEquals("59","(integer-length 288230376178006741)");
    testEvalEquals("59","(integer-length 288230376178493279)");
    testEvalEquals("59","(integer-length 288230376179842476)");
    testEvalEquals("59","(integer-length 288230376180498803)");
    testEvalEquals("59","(integer-length 288230376182632968)");
    testEvalEquals("59","(integer-length 288230376183467343)");
    testEvalEquals("59","(integer-length 288230376184156369)");
    testEvalEquals("59","(integer-length 288230376187363562)");
    testEvalEquals("59","(integer-length 288230376190464101)");
    testEvalEquals("59","(integer-length 288230376194478330)");
    testEvalEquals("59","(integer-length 288230376195100025)");
    testEvalEquals("59","(integer-length 288230376198171824)");
    testEvalEquals("59","(integer-length 288230376198396014)");
    testEvalEquals("59","(integer-length 288230376200538770)");
    testEvalEquals("59","(integer-length 288230376200546217)");
    testEvalEquals("59","(integer-length 288230376206765337)");
    testEvalEquals("59","(integer-length 288230376209175062)");
    testEvalEquals("59","(integer-length 288230376210674057)");
    testEvalEquals("59","(integer-length 288230376212671340)");
    testEvalEquals("59","(integer-length 288230376215143310)");
    testEvalEquals("59","(integer-length 288230376215741276)");
    testEvalEquals("59","(integer-length 288230376216922983)");
    testEvalEquals("59","(integer-length 288230376222397400)");
    testEvalEquals("59","(integer-length 288230376225188331)");
    testEvalEquals("59","(integer-length 288230376227641029)");
    testEvalEquals("59","(integer-length 288230376228302467)");
    testEvalEquals("59","(integer-length 288230376228470029)");
    testEvalEquals("59","(integer-length 288230376230955254)");
    testEvalEquals("59","(integer-length 288230376232257073)");
    testEvalEquals("59","(integer-length 288230376235868991)");
    testEvalEquals("59","(integer-length 288230376243472223)");
    testEvalEquals("59","(integer-length 288230376245078335)");
    testEvalEquals("59","(integer-length 288230376245622607)");
    testEvalEquals("59","(integer-length 288230376249748585)");
    testEvalEquals("59","(integer-length 288230376260921741)");
    testEvalEquals("59","(integer-length 288230376261849528)");
    testEvalEquals("59","(integer-length 288230376267329788)");
    testEvalEquals("59","(integer-length 288230376267958636)");
    testEvalEquals("59","(integer-length 288230376271544216)");
    testEvalEquals("59","(integer-length 288230376275688655)");
    testEvalEquals("59","(integer-length 288230376276974540)");
    testEvalEquals("59","(integer-length 288230376277106715)");
    testEvalEquals("59","(integer-length 288230376277646938)");
    testEvalEquals("59","(integer-length 288230376279035537)");
    testEvalEquals("59","(integer-length 288230376282254147)");
    testEvalEquals("60","(integer-length 576460752303423488)");
    testEvalEquals("60","(integer-length 576460752304064529)");
    testEvalEquals("60","(integer-length 576460752305165158)");
    testEvalEquals("60","(integer-length 576460752306712212)");
    testEvalEquals("60","(integer-length 576460752308428612)");
    testEvalEquals("60","(integer-length 576460752309054268)");
    testEvalEquals("60","(integer-length 576460752309854536)");
    testEvalEquals("60","(integer-length 576460752314231660)");
    testEvalEquals("60","(integer-length 576460752317736694)");
    testEvalEquals("60","(integer-length 576460752317786201)");
    testEvalEquals("60","(integer-length 576460752319191576)");
    testEvalEquals("60","(integer-length 576460752323641404)");
    testEvalEquals("60","(integer-length 576460752327165131)");
    testEvalEquals("60","(integer-length 576460752330033535)");
    testEvalEquals("60","(integer-length 576460752330345865)");
    testEvalEquals("60","(integer-length 576460752332572952)");
    testEvalEquals("60","(integer-length 576460752333633397)");
    testEvalEquals("60","(integer-length 576460752338805548)");
    testEvalEquals("60","(integer-length 576460752342764051)");
    testEvalEquals("60","(integer-length 576460752342970693)");
    testEvalEquals("60","(integer-length 576460752345780168)");
    testEvalEquals("60","(integer-length 576460752347048707)");
    testEvalEquals("60","(integer-length 576460752348076696)");
    testEvalEquals("60","(integer-length 576460752351683960)");
    testEvalEquals("60","(integer-length 576460752352323719)");
    testEvalEquals("60","(integer-length 576460752356413722)");
    testEvalEquals("60","(integer-length 576460752358743054)");
    testEvalEquals("60","(integer-length 576460752360332137)");
    testEvalEquals("60","(integer-length 576460752363634934)");
    testEvalEquals("60","(integer-length 576460752365526442)");
    testEvalEquals("60","(integer-length 576460752365575492)");
    testEvalEquals("60","(integer-length 576460752366573508)");
    testEvalEquals("60","(integer-length 576460752368873790)");
    testEvalEquals("60","(integer-length 576460752373982914)");
    testEvalEquals("60","(integer-length 576460752376600432)");
    testEvalEquals("60","(integer-length 576460752377728055)");
    testEvalEquals("60","(integer-length 576460752378311631)");
    testEvalEquals("60","(integer-length 576460752378742222)");
    testEvalEquals("60","(integer-length 576460752379606967)");
    testEvalEquals("60","(integer-length 576460752381893287)");
    testEvalEquals("60","(integer-length 576460752392863429)");
    testEvalEquals("60","(integer-length 576460752398375995)");
    testEvalEquals("60","(integer-length 576460752398881084)");
    testEvalEquals("60","(integer-length 576460752399393972)");
    testEvalEquals("60","(integer-length 576460752404213275)");
    testEvalEquals("60","(integer-length 576460752410937120)");
    testEvalEquals("60","(integer-length 576460752414483627)");
    testEvalEquals("60","(integer-length 576460752414575905)");
    testEvalEquals("60","(integer-length 576460752415314167)");
    testEvalEquals("60","(integer-length 576460752416299892)");
    testEvalEquals("60","(integer-length 576460752418027378)");
    testEvalEquals("60","(integer-length 576460752425930382)");
    testEvalEquals("60","(integer-length 576460752427983685)");
    testEvalEquals("60","(integer-length 576460752429710273)");
    testEvalEquals("60","(integer-length 576460752430319386)");
    testEvalEquals("60","(integer-length 576460752431474372)");
    testEvalEquals("60","(integer-length 576460752432266628)");
    testEvalEquals("60","(integer-length 576460752433079112)");
    testEvalEquals("60","(integer-length 576460752435367245)");
    testEvalEquals("60","(integer-length 576460752435796343)");
    testEvalEquals("60","(integer-length 576460752436001280)");
    testEvalEquals("61","(integer-length 1152921504606846976)");
    testEvalEquals("61","(integer-length 1152921504607231569)");
    testEvalEquals("61","(integer-length 1152921504608709253)");
    testEvalEquals("61","(integer-length 1152921504608806939)");
    testEvalEquals("61","(integer-length 1152921504612314884)");
    testEvalEquals("61","(integer-length 1152921504612976437)");
    testEvalEquals("61","(integer-length 1152921504614365329)");
    testEvalEquals("61","(integer-length 1152921504614931016)");
    testEvalEquals("61","(integer-length 1152921504619947332)");
    testEvalEquals("61","(integer-length 1152921504623962720)");
    testEvalEquals("61","(integer-length 1152921504624221982)");
    testEvalEquals("61","(integer-length 1152921504625146739)");
    testEvalEquals("61","(integer-length 1152921504630127297)");
    testEvalEquals("61","(integer-length 1152921504631049087)");
    testEvalEquals("61","(integer-length 1152921504633119273)");
    testEvalEquals("61","(integer-length 1152921504639516796)");
    testEvalEquals("61","(integer-length 1152921504641609469)");
    testEvalEquals("61","(integer-length 1152921504642252237)");
    testEvalEquals("61","(integer-length 1152921504645824239)");
    testEvalEquals("61","(integer-length 1152921504652087278)");
    testEvalEquals("61","(integer-length 1152921504652152979)");
    testEvalEquals("61","(integer-length 1152921504653114497)");
    testEvalEquals("61","(integer-length 1152921504654606232)");
    testEvalEquals("61","(integer-length 1152921504655968703)");
    testEvalEquals("61","(integer-length 1152921504656719130)");
    testEvalEquals("61","(integer-length 1152921504656900689)");
    testEvalEquals("61","(integer-length 1152921504658109495)");
    testEvalEquals("61","(integer-length 1152921504659323824)");
    testEvalEquals("61","(integer-length 1152921504669078603)");
    testEvalEquals("61","(integer-length 1152921504670919724)");
    testEvalEquals("61","(integer-length 1152921504671657451)");
    testEvalEquals("61","(integer-length 1152921504674258470)");
    testEvalEquals("61","(integer-length 1152921504675073906)");
    testEvalEquals("61","(integer-length 1152921504675902441)");
    testEvalEquals("61","(integer-length 1152921504676783413)");
    testEvalEquals("61","(integer-length 1152921504679780447)");
    testEvalEquals("61","(integer-length 1152921504683892080)");
    testEvalEquals("61","(integer-length 1152921504686394317)");
    testEvalEquals("61","(integer-length 1152921504689583452)");
    testEvalEquals("61","(integer-length 1152921504692367086)");
    testEvalEquals("61","(integer-length 1152921504692450121)");
    testEvalEquals("61","(integer-length 1152921504693190721)");
    testEvalEquals("61","(integer-length 1152921504694987387)");
    testEvalEquals("61","(integer-length 1152921504695210621)");
    testEvalEquals("61","(integer-length 1152921504695825935)");
    testEvalEquals("61","(integer-length 1152921504699587849)");
    testEvalEquals("61","(integer-length 1152921504700900018)");
    testEvalEquals("61","(integer-length 1152921504702411915)");
    testEvalEquals("61","(integer-length 1152921504702516708)");
    testEvalEquals("61","(integer-length 1152921504702825638)");
    testEvalEquals("61","(integer-length 1152921504704914066)");
    testEvalEquals("61","(integer-length 1152921504708998543)");
    testEvalEquals("61","(integer-length 1152921504709696354)");
    testEvalEquals("61","(integer-length 1152921504720483881)");
    testEvalEquals("61","(integer-length 1152921504722442766)");
    testEvalEquals("61","(integer-length 1152921504726608695)");
    testEvalEquals("61","(integer-length 1152921504733881588)");
    testEvalEquals("61","(integer-length 1152921504735790613)");
    testEvalEquals("61","(integer-length 1152921504735812844)");
    testEvalEquals("61","(integer-length 1152921504735840999)");
    testEvalEquals("61","(integer-length 1152921504737743730)");
    testEvalEquals("61","(integer-length 1152921504738004431)");
    testEvalEquals("62","(integer-length 2305843009213693952)");
    testEvalEquals("62","(integer-length 2305843009214719632)");
    testEvalEquals("62","(integer-length 2305843009216188736)");
    testEvalEquals("62","(integer-length 2305843009220228163)");
    testEvalEquals("62","(integer-length 2305843009220871770)");
    testEvalEquals("62","(integer-length 2305843009222027137)");
    testEvalEquals("62","(integer-length 2305843009222248441)");
    testEvalEquals("62","(integer-length 2305843009228281381)");
    testEvalEquals("62","(integer-length 2305843009230282691)");
    testEvalEquals("62","(integer-length 2305843009231075096)");
    testEvalEquals("62","(integer-length 2305843009233983527)");
    testEvalEquals("62","(integer-length 2305843009234511790)");
    testEvalEquals("62","(integer-length 2305843009234847622)");
    testEvalEquals("62","(integer-length 2305843009235035227)");
    testEvalEquals("62","(integer-length 2305843009238588036)");
    testEvalEquals("62","(integer-length 2305843009239700877)");
    testEvalEquals("62","(integer-length 2305843009242092216)");
    testEvalEquals("62","(integer-length 2305843009246810703)");
    testEvalEquals("62","(integer-length 2305843009247408910)");
    testEvalEquals("62","(integer-length 2305843009248929423)");
    testEvalEquals("62","(integer-length 2305843009252445848)");
    testEvalEquals("62","(integer-length 2305843009257159088)");
    testEvalEquals("62","(integer-length 2305843009259719710)");
    testEvalEquals("62","(integer-length 2305843009260800905)");
    testEvalEquals("62","(integer-length 2305843009267614903)");
    testEvalEquals("62","(integer-length 2305843009267667725)");
    testEvalEquals("62","(integer-length 2305843009269619237)");
    testEvalEquals("62","(integer-length 2305843009272168773)");
    testEvalEquals("62","(integer-length 2305843009273769229)");
    testEvalEquals("62","(integer-length 2305843009276091594)");
    testEvalEquals("62","(integer-length 2305843009276878982)");
    testEvalEquals("62","(integer-length 2305843009279295457)");
    testEvalEquals("62","(integer-length 2305843009280667407)");
    testEvalEquals("62","(integer-length 2305843009281383640)");
    testEvalEquals("62","(integer-length 2305843009286178712)");
    testEvalEquals("62","(integer-length 2305843009289326546)");
    testEvalEquals("62","(integer-length 2305843009295312053)");
    testEvalEquals("62","(integer-length 2305843009297820162)");
    testEvalEquals("62","(integer-length 2305843009299657190)");
    testEvalEquals("62","(integer-length 2305843009300781082)");
    testEvalEquals("62","(integer-length 2305843009302040227)");
    testEvalEquals("62","(integer-length 2305843009302915748)");
    testEvalEquals("62","(integer-length 2305843009305388788)");
    testEvalEquals("62","(integer-length 2305843009316301394)");
    testEvalEquals("62","(integer-length 2305843009316895203)");
    testEvalEquals("62","(integer-length 2305843009320001363)");
    testEvalEquals("62","(integer-length 2305843009321198339)");
    testEvalEquals("62","(integer-length 2305843009323753140)");
    testEvalEquals("62","(integer-length 2305843009325284475)");
    testEvalEquals("62","(integer-length 2305843009326875302)");
    testEvalEquals("62","(integer-length 2305843009328042847)");
    testEvalEquals("62","(integer-length 2305843009329251677)");
    testEvalEquals("62","(integer-length 2305843009331083863)");
    testEvalEquals("62","(integer-length 2305843009333216851)");
    testEvalEquals("62","(integer-length 2305843009335656900)");
    testEvalEquals("62","(integer-length 2305843009338350889)");
    testEvalEquals("62","(integer-length 2305843009338885875)");
    testEvalEquals("62","(integer-length 2305843009339341089)");
    testEvalEquals("62","(integer-length 2305843009339605863)");
    testEvalEquals("62","(integer-length 2305843009339842059)");
    testEvalEquals("62","(integer-length 2305843009340712063)");
    testEvalEquals("62","(integer-length 2305843009343267908)");
    testEvalEquals("62","(integer-length 2305843009343493442)");
    testEvalEquals("63","(integer-length 4611686018427387904)");
    testEvalEquals("63","(integer-length 4611686018433316091)");
    testEvalEquals("63","(integer-length 4611686018436624377)");
    testEvalEquals("63","(integer-length 4611686018437058651)");
    testEvalEquals("63","(integer-length 4611686018438018500)");
    testEvalEquals("63","(integer-length 4611686018440809429)");
    testEvalEquals("63","(integer-length 4611686018441286508)");
    testEvalEquals("63","(integer-length 4611686018444702272)");
    testEvalEquals("63","(integer-length 4611686018449914050)");
    testEvalEquals("63","(integer-length 4611686018456504221)");
    testEvalEquals("63","(integer-length 4611686018459299180)");
    testEvalEquals("63","(integer-length 4611686018461994244)");
    testEvalEquals("63","(integer-length 4611686018462162923)");
    testEvalEquals("63","(integer-length 4611686018465781592)");
    testEvalEquals("63","(integer-length 4611686018466903055)");
    testEvalEquals("63","(integer-length 4611686018468001725)");
    testEvalEquals("63","(integer-length 4611686018469093882)");
    testEvalEquals("63","(integer-length 4611686018469719556)");
    testEvalEquals("63","(integer-length 4611686018470014286)");
    testEvalEquals("63","(integer-length 4611686018470583221)");
    testEvalEquals("63","(integer-length 4611686018470738924)");
    testEvalEquals("63","(integer-length 4611686018471984765)");
    testEvalEquals("63","(integer-length 4611686018475419438)");
    testEvalEquals("63","(integer-length 4611686018477416087)");
    testEvalEquals("63","(integer-length 4611686018479136111)");
    testEvalEquals("63","(integer-length 4611686018479523608)");
    testEvalEquals("63","(integer-length 4611686018480411513)");
    testEvalEquals("63","(integer-length 4611686018481948917)");
    testEvalEquals("63","(integer-length 4611686018482563831)");
    testEvalEquals("63","(integer-length 4611686018484431363)");
    testEvalEquals("63","(integer-length 4611686018484439614)");
    testEvalEquals("63","(integer-length 4611686018486850123)");
    testEvalEquals("63","(integer-length 4611686018488439817)");
    testEvalEquals("63","(integer-length 4611686018490447689)");
    testEvalEquals("63","(integer-length 4611686018490704436)");
    testEvalEquals("63","(integer-length 4611686018498777079)");
    testEvalEquals("63","(integer-length 4611686018499000697)");
    testEvalEquals("63","(integer-length 4611686018500291374)");
    testEvalEquals("63","(integer-length 4611686018501197822)");
    testEvalEquals("63","(integer-length 4611686018505300983)");
    testEvalEquals("63","(integer-length 4611686018506390790)");
    testEvalEquals("63","(integer-length 4611686018509420933)");
    testEvalEquals("63","(integer-length 4611686018511895868)");
    testEvalEquals("63","(integer-length 4611686018513038329)");
    testEvalEquals("63","(integer-length 4611686018515185148)");
    testEvalEquals("63","(integer-length 4611686018516942537)");
    testEvalEquals("63","(integer-length 4611686018519392838)");
    testEvalEquals("63","(integer-length 4611686018522939944)");
    testEvalEquals("63","(integer-length 4611686018528528657)");
    testEvalEquals("63","(integer-length 4611686018530498015)");
    testEvalEquals("63","(integer-length 4611686018532192718)");
    testEvalEquals("63","(integer-length 4611686018533018896)");
    testEvalEquals("63","(integer-length 4611686018534682107)");
    testEvalEquals("63","(integer-length 4611686018536155093)");
    testEvalEquals("63","(integer-length 4611686018537164652)");
    testEvalEquals("63","(integer-length 4611686018543180448)");
    testEvalEquals("63","(integer-length 4611686018543695857)");
    testEvalEquals("63","(integer-length 4611686018543724959)");
    testEvalEquals("63","(integer-length 4611686018544604441)");
    testEvalEquals("63","(integer-length 4611686018546973640)");
    testEvalEquals("63","(integer-length 4611686018549552109)");
    testEvalEquals("63","(integer-length 4611686018551660182)");
    testEvalEquals("63","(integer-length 4611686018555234368)");
    testEvalEquals("63","(integer-length 4611686018556550597)");
    testEvalEquals("64","(integer-length 9223372036854775808)");
    // @section bignum tests
    testEvalEquals("101", "(integer-length 1267650600228229401496703205376)");
    testEvalEquals("201", "(integer-length 1606938044258990275541962092341162602522202993782792835301376)");
    testEvalEquals("301", "(integer-length 2037035976334486086268445688409378161051468393665936250636140449354381299763336706183397376)");
    testEvalEquals("294", "(integer-length (ash 123094239040239402394023234234234029384092385409238098920394234223098427410849039842304 8))");
    
    // assembling (and soon: disassembling fixnums)
    testEvalEquals("0","(assemble-fixnums-to-integer 1)");
    testEvalEquals("745","(assemble-fixnums-to-integer 1 233 2)");
    testEvalEquals("1041691","(assemble-fixnums-to-integer 1 27 229 15)");
    testEvalEquals("667711287","(assemble-fixnums-to-integer 1 55 119 204 39)");
    testEvalEquals("549871383108","(assemble-fixnums-to-integer 1 68 114 227 6 128)");
    testEvalEquals("562950002151949","(assemble-fixnums-to-integer 1 13 146 231 2 0 0 2)");
    testEvalEquals("576460752338529960","(assemble-fixnums-to-integer 1 168 174 23 2 0 0 0 8)");
    testEvalEquals("590295810358761588164","(assemble-fixnums-to-integer 1 196 133 85 3 0 0 0 0 32)");
    testEvalEquals("-745","(assemble-fixnums-to-integer -1 233 2)");
    testEvalEquals("-1041691","(assemble-fixnums-to-integer -1 27 229 15)");
    testEvalEquals("-667711287","(assemble-fixnums-to-integer -1 55 119 204 39)");
    testEvalEquals("-549871383108","(assemble-fixnums-to-integer -1 68 114 227 6 128)");
    testEvalEquals("-562950002151949","(assemble-fixnums-to-integer -1 13 146 231 2 0 0 2)");
    testEvalEquals("-576460752338529960","(assemble-fixnums-to-integer -1 168 174 23 2 0 0 0 8)");
    testEvalEquals("-590295810358761588164","(assemble-fixnums-to-integer -1 196 133 85 3 0 0 0 0 32)");
    
  }
  
  public static void testFileSysFunctions() {
    final long currentTimeTyped = System.currentTimeMillis();
    final SubLObject currentTime = Time.unixTimeToUniversalTime(currentTimeTyped);
    
    // edge case tests
    testEvalEquals("\"\"", "(construct-filename NIL NIL NIL T)");
    /*
     * @todo this returns inconsistent results under ALlegro and CRTL, so handle later
     *testEvalEquals("\".text\"", "(construct-filename NIL NIL "text" T)");
     */
    
    // non-destructive tests
    testEvalEquals("\"units/acip/\"",
      "(construct-filename '(\"units\" \"acip\") nil nil t)");
    testEvalEquals("\"/cyc/top/units/tiny/core-kb.lisp\"",
      "(construct-filename '(\"cyc\" \"top\" \"units\" \"tiny\") \"core-kb\" \"lisp\" nil)");
    testEvalEquals("\"cyc/top/units/tiny/core-kb.lisp\"",
      "(construct-filename '(\"cyc\" \"top\" \"units\" \"tiny\") \"core-kb\" \"lisp\" T)");
    testEvalEquals("'(\"/cyc/top/units/tiny/core-kb.lisp\")",
      "(directory \"/cyc/top/units/tiny/\" t)");
    testEvalEquals("'(\"core-kb.lisp\")",
      "(directory \"/cyc/top/units/tiny/\" NIL)");
    testEvalEquals("T","(directory-p \"/cyc/top/units/\")");
    testEvalEquals("NIL","(directory-p \"/cyc/top/units/tiny/core-kb.lisp\")");
    testEvalEquals("NIL","(directory-p 212)");
    //testEvalEquals("T","(stringp (probe-file \"/cyc/top/units/tiny/core-kb.lisp\"))"); //@todo Make a file then test and delete for reliablity
    testEvalEquals("T","(null (probe-file \"/cyc/top/units/tiny/donaudampfschifffahrtsgesellschaft.lisp\"))");
    
    //@hack file-write-author does not work under Java, so we test its non-functioning
    //testEvalEquals("NIL","(file-author \"/cyc/top/units/tiny/core-kb.lisp\")"); //@todo Make a file then test and delete for reliablity
    
    // modification-based file system functions
    final File tempDir = new File(System.getProperty("java.io.tmpdir"));
    Assert.assertTrue("No valid temporary directory for file read/write testing.", tempDir.exists());
    
    // build a scratch directory
    final String subDirName = "fileSysTest" + "_" + currentTimeTyped + "_" + tempDir.hashCode();
    final File newSubDir = new File(tempDir, subDirName);
    try {
      testEvalEquals("T", "(stringp (make-directory \"" + subDirName + "\" \"" + tempDir + "\"))");
      Assert.assertTrue("SubL MAKE-DIRECTORY failed to make directory " + newSubDir.getAbsolutePath(),
        newSubDir.isDirectory());
      testEvalEquals("T", "(directory-p \"" + newSubDir.getAbsolutePath() + "\")");
      testEvalEquals("NIL", "(directory \"" + newSubDir.getAbsolutePath() + "\")");
      
      // test modification time on directories
      testEvalEquals("T", "(numberp (file-write-date \"" + newSubDir.getAbsolutePath() + "\"))");
      testEvalEquals("T","(<= " + currentTime.toString()
      + " (file-write-date \"" + newSubDir.getAbsolutePath() + "\"))");
      
      // the work-around
      final SubLObject dirModTime = Filesys.file_write_date( SubLObjectFactory.makeString(newSubDir.getAbsolutePath()));
      final BigInteger currentTimeTemp = new BigInteger( currentTime.toString());
      final BigInteger dirModTimeTemp = new BigInteger(dirModTime.toString());
      Assert.assertTrue("Directory modification time " + dirModTimeTemp + " is less than the test start time "
        + currentTimeTemp + " ???",
        currentTimeTemp.min(dirModTimeTemp) == currentTimeTemp || currentTimeTemp.equals(dirModTimeTemp));
      
      // build a temporary file in the scratch directory
      final File myFile = new File(newSubDir,"winnie-the-pooh.text");
      final File yourFile = new File(newSubDir, "winnieDerPuh.text");
      try {
        {
          java.io.FileWriter writer = null;
          try {
            writer = new java.io.FileWriter(myFile);
            writer.write("Knudelnudel-rund ist der Teddybaer.");
          } catch (IOException ex) {
            Assert.fail( "Cannot create testing file " + myFile.getAbsolutePath()
            + "; cause: " + ex.getLocalizedMessage());
          } finally {
            if (writer != null) {
              try {
                writer.close();
              } catch (Exception xcpt) {
              }
            }
          }
        }
        Assert.assertTrue("Failed to create testing file " + myFile.getAbsolutePath(),
          myFile.exists());
        testEvalEquals("T", "(stringp (probe-file \"" + myFile.getAbsolutePath() + "\"))");
        testEvalEquals("NIL", "(directory-p \"" + myFile.getAbsolutePath() + "\")");
        
        // test modification time on temporary file
        testEvalEquals("T", "(numberp (file-write-date \"" + myFile.getAbsolutePath() + "\"))");
        testEvalEquals("T","(<= " + currentTime.toString()
        + " (file-write-date \"" + myFile.getAbsolutePath() + "\"))");
        testEvalEquals("T","(<= "
          + " (file-write-date \"" + newSubDir.getAbsolutePath() + "\")"
          + " (file-write-date \"" + myFile.getAbsolutePath() + "\"))");
        
        // the work-around
        final SubLObject fileModTime = Filesys.file_write_date( SubLObjectFactory.makeString(myFile.getAbsolutePath()));
        final BigInteger fileModTimeTemp = new BigInteger(fileModTime.toString());
        Assert.assertTrue("File modification time " + fileModTimeTemp + " is less than the test start time "
          + currentTimeTemp + " ???",
          currentTimeTemp.min(fileModTimeTemp) == currentTimeTemp || currentTimeTemp.equals(fileModTimeTemp));
        Assert.assertTrue("File modification time " + fileModTimeTemp + " is less than the directory modification time "
          + dirModTimeTemp + "???",
          dirModTimeTemp.min(fileModTimeTemp) == dirModTimeTemp || dirModTimeTemp.equals((fileModTimeTemp)));
        
        // see if we can find the file in the directory
        testEvalEquals("T","(cnot (null (member \"" + myFile.getAbsolutePath() + "\""
          + " (directory \"" + newSubDir.getAbsolutePath() + "\" T) 'equalp)))");
        
        // rename the file twice
        // @note do something about testing the other return values
        testEvalEquals("T","(stringp (rename-file \"" + myFile.getAbsolutePath()
        + "\" \"" + yourFile.getAbsolutePath() + "\"))");
        testEvalEquals("NIL", "(stringp (probe-file \"" + myFile.getAbsolutePath() + "\"))");
        testEvalEquals("T", "(stringp (probe-file \"" + yourFile.getAbsolutePath() + "\"))");
        testEvalEquals("T","(stringp (rename-file \"" + yourFile.getAbsolutePath()
        + "\" \"" + myFile.getAbsolutePath() + "\"))");
        testEvalEquals("T", "(stringp (probe-file \"" + myFile.getAbsolutePath() + "\"))");
        testEvalEquals("NIL", "(stringp (probe-file \"" + yourFile.getAbsolutePath() + "\"))");
        
        // tear down the temporary file from the scratch directory
        testEvalEquals("T", "(delete-file \""+ myFile.getAbsolutePath() +"\")");
        Assert.assertTrue( "Failed to remove testing file " + myFile.getAbsolutePath(),
          !myFile.exists());
        
      } finally {
        myFile.delete();
        yourFile.delete();
      }
      
      // tear down the scratch directory
      testEvalEquals("T", "(delete-directory \"" + newSubDir.getAbsolutePath() + "\")");
      testEvalEquals("NIL", "(directory-p \"" + newSubDir.getAbsolutePath() + "\")");
      Assert.assertTrue("SubL DELETE-DIRECTORY failed to remove directory " + newSubDir.getAbsolutePath(),
        !newSubDir.exists());
    } finally {
      // ensure that the cleanup happens, no matter what
      if (newSubDir.exists()) {
        newSubDir.delete();
      }
    }
    
  }
  
  public static void testGUIDs() {
    // make sure that we can construct all GUIDs
    if (SHOULD_PRINT_TESTS) {
      System.out.println("Testing that GUID versions #1 (CRTL) and #4 (UUID.java) are readable ....");
    }
    List<String> allGuidStrings = new ArrayList<String>( EXAMPLE_NON_CORE_GUIDS.length + EXAMPLE_CORE_GUIDS.length);
    List<SubLGuid> allGuids = new ArrayList<SubLGuid>(allGuidStrings.size());
    allGuidStrings.addAll(Arrays.asList(EXAMPLE_CORE_GUIDS));
    allGuidStrings.addAll(Arrays.asList(EXAMPLE_NON_CORE_GUIDS));
    Iterator iter = allGuidStrings.iterator();
    while (iter.hasNext()) {
      final String current = (String)iter.next();
      SubLObject guid_string = SubLObjectFactory.makeString(current);
      SubLObject guid = Guids.string_to_guid(guid_string);
      SubLObject converted_string = Guids.guid_to_string(guid);
      Assert.assertEquals(converted_string, guid_string);
      allGuids.add(guid.toGuid());
    }
    Assert.assertTrue("Hey, somewhere we lost testing GUIDs ... " + allGuids.size() + " GUIDs but we should have " + SORTED_EXAMPLE_GUIDS.length,
      allGuids.size() == SORTED_EXAMPLE_GUIDS.length);
    
    // see that we can get the comparison methods right
    if (SHOULD_PRINT_TESTS) {
      System.out.println("Testing that GUID ordering predicates work as expected for GUIDs of core constants.");
    }
    testGuidOrderingWorks(SORTED_EXAMPLE_CORE_GUIDS);
    if (SHOULD_PRINT_TESTS) {
      System.out.println("Testing that GUID ordering predicates work as expected for GUIDs generated via random UUID.");
    }
    testGuidOrderingWorks(SORTED_EXAMPLE_NON_CORE_GUIDS);
    
    // now do the sorting and the comparison
    Collections.sort(allGuids);
    SubLGuid[] sortedGuids = (SubLGuid[]) allGuids.toArray(new SubLGuid[allGuids.size()]);
    testGuidOrderingWorks(sortedGuids);
    Assert.assertTrue("Odd, somewhere we lost testing GUIDs ... " + sortedGuids.length + " GUIDs but we should have " + SORTED_EXAMPLE_GUIDS.length,
      sortedGuids.length == SORTED_EXAMPLE_GUIDS.length);
    
    if (SHOULD_PRINT_TESTS) {
      System.out.println("Testing that SubLGuid.compareTo() orders the same as CRTL's canonicalizer.");
    }
    for (int i = 0; i < sortedGuids.length; i++) {
      final String guidString = SORTED_EXAMPLE_GUIDS[i];
      final SubLGuid masterGuid = SubLObjectFactory.makeGuid(guidString);
      final SubLGuid testGuid = sortedGuids[i];
      final String msg = "Guids " + masterGuid + " and " + testGuid + " at position " + i + " are not the same.";
      Assert.assertEquals( msg, T, Guids.guidE(masterGuid, testGuid));
      Assert.assertEquals( msg, NIL, Guids.guidNE(masterGuid, testGuid));
    }
  }
  
  private static void testGuidOrderingWorks( String[] guidStringsInOrder) {
    SubLObject previousGuid = null;
    for (int index = 0; index < guidStringsInOrder.length; index++) {
      final String current = guidStringsInOrder[index];
      SubLObject guid = Guids.string_to_guid(SubLObjectFactory.makeString(current));
      if (previousGuid != null) {
        testTwoGuidsAreOrdered(previousGuid, guid);
      }
      previousGuid = guid;
    }
  }
  
  private static void testGuidOrderingWorks( SubLGuid[] guidsInOrder) {
    SubLObject previousGuid = null;
    for (int index = 0; index < guidsInOrder.length; index++) {
      SubLObject guid = guidsInOrder[index];
      if (previousGuid != null) {
        testTwoGuidsAreOrdered(previousGuid, guid);
      }
      previousGuid = guid;
    }
  }
  
  private static void testTwoGuidsAreOrdered( SubLObject guid1, SubLObject guid2) {
    final String msg = "Guids " + guid1 + " and " + guid2 + " do not compare properly.";
    Assert.assertEquals( msg, T, Guids.guidL(guid1, guid2));
    Assert.assertEquals( msg, T, Guids.guidLE(guid1, guid2));
    Assert.assertEquals( msg, NIL, Guids.guidE(guid1, guid2));
    Assert.assertEquals( msg, T, Guids.guidNE(guid1, guid2));
    Assert.assertEquals( msg, NIL, Guids.guidG(guid1, guid2));
    Assert.assertEquals( msg, NIL, Guids.guidGE(guid1, guid2));
  }
  
  private final static String[] EXAMPLE_NON_CORE_GUIDS = {
    // random GUIDs generated by UUID.java
    "ac2cdc17-7191-4757-9652-ba35913394cc", "092fe1d7-7c89-40cb-8918-f925d3d560f5",
    "2253cbb9-d217-4c52-b93a-494bfc346e0e", "9e252497-a613-4c12-ac51-045093fa7be8",
    "85d21f36-d943-42eb-b909-fb80bca8f6cc", "53194308-b6cc-4e93-b8ce-12b3b4b4b1aa",
    "7e614133-73c5-485e-bea2-4e08d26ab394", "fa4ab24c-2901-41ee-bdc7-c6610cc0f4d6",
    "dde7403f-0cb4-4db9-ab72-3499df86ced2", "c749d6e2-3e5b-4846-b428-a7e1f65f8a3f",
    "8929e75c-df35-495a-aad9-aea01638eace", "ec7cce42-9fd2-4598-b9f4-c3b21a7f9cb8",
    "58f429c0-1c9b-449a-8ab7-cc62cb634587", "2754d1da-3aec-4987-9927-454b06962be2",
    "371090f1-fc5e-45f0-aaa8-01e1fe5e3d80", "c69d8b08-faa6-4eac-8fdd-2b1ab0012255",
    "6d24b47c-b9b6-445d-9da8-911214b6132a", "e5b5ce22-69d9-434c-aec5-a5cb6477d96a",
    "37e9678b-00cb-4f3b-aa77-f8fd09cd6222", "07c91c9a-d894-44bb-8fca-e70960eaccfe",
    "21248340-0de5-4a17-88cc-f19e0f666996", "a1f20f2b-2d0f-4e7c-b65c-23083b6be83a",
    "6fe6162f-196a-4acc-a6a3-920425720e1f", "36eab934-a932-4cca-9c16-f13a63f99a00",
    "4320db29-0823-4159-b329-a5f58e6810a8", "7777de9c-92fe-48d3-adb5-f436da53f064",
    "8ec374d2-01f9-49ba-ab44-90f6ce010ec2", "2812e1b3-54db-4df6-b251-d06526deb8eb",
    "1af62fc9-894e-4971-aff4-4bca9fc56632", "0d464614-620c-4b79-b0c3-cbca8d45d60e",
    "7eef2de2-8135-472f-b669-15df6d4cb7c0", "367094f6-2487-423f-a888-a027ae1d8a4d",
    "f3e77863-3fcd-4670-9c3a-96ca01a07327", "9530d00c-318d-4234-95e9-8481379ad6be",
    "477f1308-4e90-4e74-adc0-c056c5e25782", "e5381873-d36c-4087-b6fe-d6d6addf9c93",
    "e92fe9a5-ccc7-4696-b9d2-ae4a7676d2e1", "35a98ed7-3745-4497-81ee-d0bf638a842e",
    "0277e434-330a-4de7-aa84-4e9f78e781ea", "b8d9b2e7-d812-447a-8c48-3086ac80967b",
    "ac4dcf46-3080-407a-9547-6617b7640847", "5ecb026e-ad01-4496-af4c-2f585b1cfa07",
    "0941d72f-826d-488f-acac-da7c38fc0dc7", "adc80310-3c89-422c-aa18-1d451da1d5b2",
    "333a887f-20d4-403c-bdde-a03b5a68577e", "93c75820-1c21-43c9-9087-07a8511c10be",
    "ef046bd7-662d-4374-baaf-450aa42206ed", "8c3af009-ceca-4d84-84bd-18218acb90da",
    "2348325c-a60f-4ed0-bd07-04439cb373a7", "62910136-a858-425b-b37a-1bb8764b133f",
    "f4f1d907-d7dc-4b2e-8efb-857c4bb121cb", "bc256674-5c36-45bb-a7da-898f2ee87db4",
    "0f393dee-d2ff-458c-b2b6-ede8d9ae52ce", "8413f308-0859-45d2-af74-b2089fc71e1c",
    "422dd7fa-1c5e-480f-a3b7-d60c981d5ea6", "b1522157-5b58-4a2b-8458-026a7969a1dd",
    "f7921203-431d-4ab3-9d78-b3e9026e9e66", "631979aa-7373-49b6-b126-d176bef0967d",
    "7f3f85b6-f4d8-490c-a497-5fcf6562a285", "788b6e89-3a72-4944-aac1-844605169fe8",
    "d30a1824-6a25-4a64-85b0-6e2dfca89e99", "9ec6bab5-8977-4e67-9933-ec276fa3b912",
    "99e0ba72-e90d-4825-a03a-b8bd2311895d", "5cbdf225-ebfa-412b-8611-c749af0b4c2e",
    "c2e3016c-1c7c-46b7-bffd-c7f8ed7624ec", "ae83ebf4-88dd-4d63-9b2f-1f2c31f9e635",
    "96d556b5-5470-4d98-9111-6614afd490b1", "b47afb99-4fe8-4d4c-b711-f35b49741339",
    "382d2200-d283-4370-b31e-d4df2d4d65ce", "d575a733-4b4d-4088-bad7-7bbffa1f2767",
    "bad5f87f-8b5e-40ae-8bc9-0958c87c8c7d", "ca7ed331-f6b2-43c4-afa9-d51e518ebec1",
    "7553befc-8e84-4446-9676-d8be4b0300b6", "5d0d4ab8-c533-4584-9dca-9264393d54e0",
    "4498803c-ea55-4444-bf36-02cb1adc6250", "8cc255cb-a8b8-4356-b019-64f892739578",
    "9097b724-2a51-41fd-974a-6c5223201980", "f0bb13c3-3ff7-444f-865e-18a2f5fda3e8",
    "bee2066d-25f0-4d3a-b707-307b1341e0ba", "26b7deaf-8e58-4f7e-9995-f1e32ab8c55f",
    "1ca87a3c-1967-40b3-927e-c557673243f3", "53972db3-006e-41ca-9572-6bdf76b4c7d6",
    "878ec520-ea9d-4797-bf9b-9a9fffa077f7", "baa29823-fd4f-43f1-9f8c-b5647fbc95a4",
    "876d5c30-7bac-4d7f-ae6f-77d0539790b0", "d5e6a812-dd37-4742-bfba-abdc2b75d19a",
    "172883ad-c2ed-4b62-8a89-a0995bb8048f", "04978a8d-e0a9-4eed-b50d-2e66ef9376fc",
    "5bb24907-9d64-4a8c-bed6-87b9618ea47e", "23eb58eb-7a0d-4d75-9045-0c9be4447d24",
    "9aa24f40-bd05-468f-a8a2-2e9828d91553", "908f1244-4bbf-4813-ab26-2dbe374c8d05",
    "84b3eae9-a269-4376-93de-4179d133db23", "4fc507b8-42f0-40e0-8919-0a3b8429eae6",
    "9f5e81a9-d16c-45b1-a595-4aa76a7ddc92", "2c4a5a2e-e936-45c8-8d04-78065a5128e3",
    "062b76cc-f4ad-4b27-8c77-d675dcb26aa2", "059e8eb2-d335-4d78-a877-d77e931f7eeb",
    "4d44b5bc-3448-4a38-9675-e2a3f452b4af", "0d839cc3-3461-4bb8-85d7-96e817400d58"
  };
  
  private final static String[] SORTED_EXAMPLE_NON_CORE_GUIDS = {
    // same as EXAMPLE_NON_CORE_GUIDS, but in canonicalizer order
    "0277e434-330a-4de7-aa84-4e9f78e781ea", "04978a8d-e0a9-4eed-b50d-2e66ef9376fc",
    "059e8eb2-d335-4d78-a877-d77e931f7eeb", "062b76cc-f4ad-4b27-8c77-d675dcb26aa2",
    "07c91c9a-d894-44bb-8fca-e70960eaccfe", "092fe1d7-7c89-40cb-8918-f925d3d560f5",
    "0941d72f-826d-488f-acac-da7c38fc0dc7", "0d464614-620c-4b79-b0c3-cbca8d45d60e",
    "0d839cc3-3461-4bb8-85d7-96e817400d58", "0f393dee-d2ff-458c-b2b6-ede8d9ae52ce",
    "172883ad-c2ed-4b62-8a89-a0995bb8048f", "1af62fc9-894e-4971-aff4-4bca9fc56632",
    "1ca87a3c-1967-40b3-927e-c557673243f3", "21248340-0de5-4a17-88cc-f19e0f666996",
    "2253cbb9-d217-4c52-b93a-494bfc346e0e", "2348325c-a60f-4ed0-bd07-04439cb373a7",
    "23eb58eb-7a0d-4d75-9045-0c9be4447d24", "26b7deaf-8e58-4f7e-9995-f1e32ab8c55f",
    "2754d1da-3aec-4987-9927-454b06962be2", "2812e1b3-54db-4df6-b251-d06526deb8eb",
    "2c4a5a2e-e936-45c8-8d04-78065a5128e3", "333a887f-20d4-403c-bdde-a03b5a68577e",
    "35a98ed7-3745-4497-81ee-d0bf638a842e", "367094f6-2487-423f-a888-a027ae1d8a4d",
    "36eab934-a932-4cca-9c16-f13a63f99a00", "371090f1-fc5e-45f0-aaa8-01e1fe5e3d80",
    "37e9678b-00cb-4f3b-aa77-f8fd09cd6222", "382d2200-d283-4370-b31e-d4df2d4d65ce",
    "422dd7fa-1c5e-480f-a3b7-d60c981d5ea6", "4320db29-0823-4159-b329-a5f58e6810a8",
    "4498803c-ea55-4444-bf36-02cb1adc6250", "477f1308-4e90-4e74-adc0-c056c5e25782",
    "4d44b5bc-3448-4a38-9675-e2a3f452b4af", "4fc507b8-42f0-40e0-8919-0a3b8429eae6",
    "53194308-b6cc-4e93-b8ce-12b3b4b4b1aa", "53972db3-006e-41ca-9572-6bdf76b4c7d6",
    "58f429c0-1c9b-449a-8ab7-cc62cb634587", "5bb24907-9d64-4a8c-bed6-87b9618ea47e",
    "5cbdf225-ebfa-412b-8611-c749af0b4c2e", "5d0d4ab8-c533-4584-9dca-9264393d54e0",
    "5ecb026e-ad01-4496-af4c-2f585b1cfa07", "62910136-a858-425b-b37a-1bb8764b133f",
    "631979aa-7373-49b6-b126-d176bef0967d", "6d24b47c-b9b6-445d-9da8-911214b6132a",
    "6fe6162f-196a-4acc-a6a3-920425720e1f", "7553befc-8e84-4446-9676-d8be4b0300b6",
    "7777de9c-92fe-48d3-adb5-f436da53f064", "788b6e89-3a72-4944-aac1-844605169fe8",
    "7e614133-73c5-485e-bea2-4e08d26ab394", "7eef2de2-8135-472f-b669-15df6d4cb7c0",
    "7f3f85b6-f4d8-490c-a497-5fcf6562a285", "8413f308-0859-45d2-af74-b2089fc71e1c",
    "84b3eae9-a269-4376-93de-4179d133db23", "85d21f36-d943-42eb-b909-fb80bca8f6cc",
    "876d5c30-7bac-4d7f-ae6f-77d0539790b0", "878ec520-ea9d-4797-bf9b-9a9fffa077f7",
    "8929e75c-df35-495a-aad9-aea01638eace", "8c3af009-ceca-4d84-84bd-18218acb90da",
    "8cc255cb-a8b8-4356-b019-64f892739578", "8ec374d2-01f9-49ba-ab44-90f6ce010ec2",
    "908f1244-4bbf-4813-ab26-2dbe374c8d05", "9097b724-2a51-41fd-974a-6c5223201980",
    "93c75820-1c21-43c9-9087-07a8511c10be", "9530d00c-318d-4234-95e9-8481379ad6be",
    "96d556b5-5470-4d98-9111-6614afd490b1", "99e0ba72-e90d-4825-a03a-b8bd2311895d",
    "9aa24f40-bd05-468f-a8a2-2e9828d91553", "9e252497-a613-4c12-ac51-045093fa7be8",
    "9ec6bab5-8977-4e67-9933-ec276fa3b912", "9f5e81a9-d16c-45b1-a595-4aa76a7ddc92",
    "a1f20f2b-2d0f-4e7c-b65c-23083b6be83a", "ac2cdc17-7191-4757-9652-ba35913394cc",
    "ac4dcf46-3080-407a-9547-6617b7640847", "adc80310-3c89-422c-aa18-1d451da1d5b2",
    "ae83ebf4-88dd-4d63-9b2f-1f2c31f9e635", "b1522157-5b58-4a2b-8458-026a7969a1dd",
    "b47afb99-4fe8-4d4c-b711-f35b49741339", "b8d9b2e7-d812-447a-8c48-3086ac80967b",
    "baa29823-fd4f-43f1-9f8c-b5647fbc95a4", "bad5f87f-8b5e-40ae-8bc9-0958c87c8c7d",
    "bc256674-5c36-45bb-a7da-898f2ee87db4", "bee2066d-25f0-4d3a-b707-307b1341e0ba",
    "c2e3016c-1c7c-46b7-bffd-c7f8ed7624ec", "c69d8b08-faa6-4eac-8fdd-2b1ab0012255",
    "c749d6e2-3e5b-4846-b428-a7e1f65f8a3f", "ca7ed331-f6b2-43c4-afa9-d51e518ebec1",
    "d30a1824-6a25-4a64-85b0-6e2dfca89e99", "d575a733-4b4d-4088-bad7-7bbffa1f2767",
    "d5e6a812-dd37-4742-bfba-abdc2b75d19a", "dde7403f-0cb4-4db9-ab72-3499df86ced2",
    "e5381873-d36c-4087-b6fe-d6d6addf9c93", "e5b5ce22-69d9-434c-aec5-a5cb6477d96a",
    "e92fe9a5-ccc7-4696-b9d2-ae4a7676d2e1", "ec7cce42-9fd2-4598-b9f4-c3b21a7f9cb8",
    "ef046bd7-662d-4374-baaf-450aa42206ed", "f0bb13c3-3ff7-444f-865e-18a2f5fda3e8",
    "f3e77863-3fcd-4670-9c3a-96ca01a07327", "f4f1d907-d7dc-4b2e-8efb-857c4bb121cb",
    "f7921203-431d-4ab3-9d78-b3e9026e9e66", "fa4ab24c-2901-41ee-bdc7-c6610cc0f4d6"
  };
  
  private final static String[] EXAMPLE_CORE_GUIDS = {
    // the GUIDs of all core constants from KB 085
    "c0fdc8ce-9c29-11b1-9dad-c379636f7270", "ce1e37f0-ec3f-11d6-8d83-0002b34c7c9f",
    "ce1e10e6-ec3f-11d6-8d83-0002b34c7c9f", "bdc9fb94-9c29-11b1-9dad-c379636f7270",
    "bf8bdc58-9c29-11b1-9dad-c379636f7270", "bd58c279-9c29-11b1-9dad-c379636f7270",
    "c04cad85-9c29-11b1-9dad-c379636f7270", "bf1eedc8-9c29-11b1-9dad-c379636f7270",
    "c0aa7393-9c29-11b1-9dad-c379636f7270", "bf4fcfa6-9c29-11b1-9dad-c379636f7270",
    "bd97e378-9c29-11b1-9dad-c379636f7270", "bfa4fe8c-9c29-11b1-9dad-c379636f7270",
    "be9af14f-9c29-11b1-9dad-c379636f7270", "bfedab5d-9c29-11b1-9dad-c379636f7270",
    "a8a40d91-0d87-11d9-9e57-0002b35bb117", "a8a40d90-0d87-11d9-9e57-0002b35bb117",
    "11c73ba2-3d83-11d9-9f59-0002b35bb117", "43806c82-6e4c-11d9-93ac-0007e916336c",
    "beb5aba2-9c29-11b1-9dad-c379636f7270", "bd5de44c-9c29-11b1-9dad-c379636f7270",
    "c00a42b9-9c29-11b1-9dad-c379636f7270", "24976690-8a1d-11d6-8000-00902794f506",
    "26ad75a0-8a1d-11d6-8000-00902794f506", "21894e1e-8a1d-11d6-8000-00902794f506",
    "2318a806-8a1d-11d6-8000-00902794f506", "c14862c2-9c29-11b1-9dad-c379636f7270",
    "bd6561fc-9c29-11b1-9dad-c379636f7270", "a8462735-532a-11d6-9228-0002b34c7c9f",
    "bd58c170-9c29-11b1-9dad-c379636f7270", "bd58c507-9c29-11b1-9dad-c379636f7270",
    "bd674278-9c29-11b1-9dad-c379636f7270", "bd588111-9c29-11b1-9dad-c379636f7270",
    "c0e7247c-9c29-11b1-9dad-c379636f7270", "bd588102-9c29-11b1-9dad-c379636f7270",
    "be75c8f9-9c29-11b1-9dad-c379636f7270", "beaed5bd-9c29-11b1-9dad-c379636f7270",
    "bd5880ef-9c29-11b1-9dad-c379636f7270", "bd5c0498-9c29-11b1-9dad-c379636f7270",
    "df8d60c3-eb94-11d6-82ee-0002b34c7c9f", "4777d758-108c-41d7-866a-9ddb21242ea5",
    "bfe9f22d-9c29-11b1-9dad-c379636f7270", "bd5880cc-9c29-11b1-9dad-c379636f7270",
    "bd58806a-9c29-11b1-9dad-c379636f7270", "c0a7cede-9c29-11b1-9dad-c379636f7270",
    "bd6449a2-9c29-11b1-9dad-c379636f7270", "dff47938-4da2-11d6-82c0-0002b34c7c9f",
    "dff47937-4da2-11d6-82c0-0002b34c7c9f", "bf192b1e-9c29-11b1-9dad-c379636f7270",
    "c0bf7a98-9c29-11b1-9dad-c379636f7270", "ee9f744c-8a1c-11d6-8000-00902794f506",
    "f3b2506c-8a1c-11d6-8000-00902794f506", "f0cee806-8a1c-11d6-8000-00902794f506",
    "bd58f7f9-9c29-11b1-9dad-c379636f7270", "aee9db98-0ea7-41d7-9387-bf0f0bd01e8b",
    "4cba0caa-e982-11d9-8000-0002b3a85b8f", "a774ee10-e984-11d9-8000-0002b3a85b8f",
    "0a0172da-e983-11d9-8000-0002b3a85b8f", "5c261c00-0ea7-41d7-826e-cba509274611",
    "66a0d466-0ea9-41d7-8f21-ca6c303de0d0", "79fe2070-108b-41d7-8a84-e7fe8ea1df91",
    "8f7d6628-8a1b-11d6-8000-00902794f506", "bed06ab6-9c29-11b1-9dad-c379636f7270",
    "bd5dbcd4-9c29-11b1-9dad-c379636f7270", "bd58e1fc-9c29-11b1-9dad-c379636f7270",
    "bfd86bf1-9c29-11b1-9dad-c379636f7270", "c130750e-9c29-11b1-9dad-c379636f7270",
    "be1d78c8-9c29-11b1-9dad-c379636f7270", "bdcc8689-9c29-11b1-9dad-c379636f7270",
    "bda21728-9c29-11b1-9dad-c379636f7270", "c04da45a-9c29-11b1-9dad-c379636f7270",
    "c03209e1-9c29-11b1-9dad-c379636f7270", "c017ff79-9c29-11b1-9dad-c379636f7270",
    "c0cc2458-9c29-11b1-9dad-c379636f7270", "be27a8ec-9c29-11b1-9dad-c379636f7270",
    "bf3491c4-9c29-11b1-9dad-c379636f7270", "beff1a9a-9c29-11b1-9dad-c379636f7270",
    "bd9733c2-9c29-11b1-9dad-c379636f7270", "8c1989b2-0571-41d8-9fda-a54456cecbe8",
    "be90c21d-9c29-11b1-9dad-c379636f7270", "bd601781-9c29-11b1-9dad-c379636f7270",
    "c091e184-9c29-11b1-9dad-c379636f7270", "bf364d35-9c29-11b1-9dad-c379636f7270",
    "c03ec3ba-9c29-11b1-9dad-c379636f7270", "6dd2e093-b027-11d9-93b3-0002b35bb117",
    "c0f63e9a-9c29-11b1-9dad-c379636f7270", "be2eb4e1-9c29-11b1-9dad-c379636f7270",
    "bd84623c-9c29-11b1-9dad-c379636f7270", "c0c6b0d2-9c29-11b1-9dad-c379636f7270",
    "bf1f951d-9c29-11b1-9dad-c379636f7270", "bdda1e3f-9c29-11b1-9dad-c379636f7270",
    "be2e0d29-9c29-11b1-9dad-c379636f7270", "bf26025d-9c29-11b1-9dad-c379636f7270",
    "c0d211d2-9c29-11b1-9dad-c379636f7270", "bfab7ef3-9c29-11b1-9dad-c379636f7270",
    "be0a552b-9c29-11b1-9dad-c379636f7270", "c010ce47-9c29-11b1-9dad-c379636f7270",
    "be00bf6e-9c29-11b1-9dad-c379636f7270", "c05a7c46-9c29-11b1-9dad-c379636f7270",
    "c129e5bc-9c29-11b1-9dad-c379636f7270", "bd63a0ce-9c29-11b1-9dad-c379636f7270",
    "be760011-9c29-11b1-9dad-c379636f7270", "beee8a4d-9c29-11b1-9dad-c379636f7270",
    "bddd55a1-9c29-11b1-9dad-c379636f7270", "be920bae-9c29-11b1-9dad-c379636f7270",
    "bddb0a48-9c29-11b1-9dad-c379636f7270", "bd5880a0-9c29-11b1-9dad-c379636f7270",
    "be7266e4-9c29-11b1-9dad-c379636f7270", "c1164108-9c29-11b1-9dad-c379636f7270",
    "bdb7f18f-9c29-11b1-9dad-c379636f7270", "c107fffb-9c29-11b1-9dad-c379636f7270",
    "6dd2e092-b027-11d9-93b3-0002b35bb117", "bf7800bf-9c29-11b1-9dad-c379636f7270",
    "7e37800e-0ea7-41d7-9bd5-8065cb1a6b10", "2f961964-0ea8-41d7-9ea1-c9afdcc1aa56",
    "8e72d91e-0ea7-41d7-8f52-84ac7fcfa385", "d9f441a0-1219-41d7-9457-ebe7ee11dc3f",
    "b2c8b1b4-108f-41d7-9034-dceb94f7996a", "d469217a-108d-41d7-8ce2-dad58b43f1c2",
    "122c8d92-1090-41d7-9e88-dccd46c00dee", "f0471674-1090-41d7-9d0f-ef2e9cd9fd4c",
    "25ac90f0-1091-41d7-8ad2-e217e51d47b0", "d30396de-108e-41d7-96f2-fb32dc881bce",
    "3869b626-108e-41d7-9774-efcd2852455a", "711dd8ca-108f-41d7-8ed2-b6714c417827",
    "a9b8812a-1090-41d7-896d-e7aa9f9b941f", "5afd82ae-108d-41d7-877a-efcc1a027076",
    "8a6b89b8-108e-41d7-8199-f8db46c58932", "523d56a0-1090-41d7-943c-b98ceb989643",
    "de649fb0-0ea8-41d7-8ccb-f7a3fcedcd63", "6cbc0e94-0ea7-41d7-8e09-eafe051a334c",
    "06085436-0ea8-41d7-8d78-c5027328b3c1", "9ea97dc4-0ea7-41d7-90cc-b17f20db96b6",
    "225afc46-0ea9-41d7-86ba-d6e6e606bcf4", "bf279d9c-0ea7-41d7-9fa4-d2954dda78a8",
    "d73532c0-8a1b-11d6-8000-00902794f506", "0dfc9bcc-108b-41d7-8ed7-edfd33b086ba",
    "6198deea-121a-41d7-93eb-f77e2835bef0", "e416edc1-758f-11d7-846c-0002b3a85c8d",
    "bd588068-9c29-11b1-9dad-c379636f7270", "0c5a7576-0f94-11d6-8000-0050dab92c2f",
    "c2444102-5943-11d6-8000-0002b364be7b", "c2a37e88-5943-11d6-8000-0002b364be7b",
    "bd58d679-9c29-11b1-9dad-c379636f7270", "bd58b8ba-9c29-11b1-9dad-c379636f7270",
    "bd8a163e-9c29-11b1-9dad-c379636f7270", "c10c3008-9c29-11b1-9dad-c379636f7270",
    "bf576a31-9c29-11b1-9dad-c379636f7270", "bd5880a6-9c29-11b1-9dad-c379636f7270",
    "c0ba0c32-9c29-11b1-9dad-c379636f7270", "c0ab9eda-9c29-11b1-9dad-c379636f7270",
    "bd5c5e99-9c29-11b1-9dad-c379636f7270", "be1f1654-9c29-11b1-9dad-c379636f7270",
    "0ccf9a20-d1a5-11d7-91aa-0002b3a8515d", "ff947d33-963a-11d7-866f-0002b34c7c9f",
    "c09a6e2f-9c29-11b1-9dad-c379636f7270", "ff947d34-963a-11d7-866f-0002b34c7c9f",
    "bda16220-9c29-11b1-9dad-c379636f7270", "fe9fcdd0-4370-11d6-8000-00a0c9da2002",
    "bd58829b-9c29-11b1-9dad-c379636f7270", "bf4ff31b-9c29-11b1-9dad-c379636f7270",
    "bfb0e3f0-9c29-11b1-9dad-c379636f7270", "bed22fb8-9c29-11b1-9dad-c379636f7270",
    "be7f041b-9c29-11b1-9dad-c379636f7270", "bec28bcc-9c29-11b1-9dad-c379636f7270",
    "c0e85daa-9c29-11b1-9dad-c379636f7270", "badbedd1-1ebc-11d8-8dde-0002b3988fc4",
    "bd58f080-9c29-11b1-9dad-c379636f7270", "c0b2bc13-9c29-11b1-9dad-c379636f7270",
    "059c0a82-39b0-11d9-8528-0007e9162f51", "059c0a80-39b0-11d9-8528-0007e9162f51",
    "059c0a85-39b0-11d9-8528-0007e9162f51", "bd5880d8-9c29-11b1-9dad-c379636f7270",
    "bd58c2f7-9c29-11b1-9dad-c379636f7270", "bff3237a-9c29-11b1-9dad-c379636f7270",
    "c10c450d-9c29-11b1-9dad-c379636f7270", "bd5880fe-9c29-11b1-9dad-c379636f7270",
    "bd589a1d-9c29-11b1-9dad-c379636f7270", "befd1881-9c29-11b1-9dad-c379636f7270",
    "c1237745-9c29-11b1-9dad-c379636f7270", "bd84dac3-9c29-11b1-9dad-c379636f7270",
    "c135fae1-9c29-11b1-9dad-c379636f7270", "bd681463-9c29-11b1-9dad-c379636f7270",
    "bd58e1a5-9c29-11b1-9dad-c379636f7270", "bd5c40b0-9c29-11b1-9dad-c379636f7270",
    "c0edda9d-9c29-11b1-9dad-c379636f7270", "cf645c7c-0ea7-41d7-8a80-ca222ce6bf52",
    "bd5ad700-9c29-11b1-9dad-c379636f7270", "1efb39f0-8a1d-11d6-8000-00902794f506",
    "4dde3f94-4621-41d8-9272-aca7bf883a76", "a77033a4-fc81-11da-99f8-0002b3988fc4",
    "bd5897dd-9c29-11b1-9dad-c379636f7270", "bd58a4f1-9c29-11b1-9dad-c379636f7270",
    "bfeb0c83-9c29-11b1-9dad-c379636f7270", "c052cf24-9c29-11b1-9dad-c379636f7270",
    "bd58da02-9c29-11b1-9dad-c379636f7270", "bd58915a-9c29-11b1-9dad-c379636f7270",
    "bd58d107-9c29-11b1-9dad-c379636f7270", "995b3198-033c-41d8-866d-f7bdd1826285",
    "913234d0-033c-41d8-8146-f33e6672d790", "85413266-033c-41d8-8a3c-853470ebf355",
    "7ee2de9c-033c-41d8-82f2-f5662a7ecac3", "bd589e12-9c29-11b1-9dad-c379636f7270",
    "c0a253f0-9c29-11b1-9dad-c379636f7270", "c0224da2-9c29-11b1-9dad-c379636f7270",
    "bd5880e0-9c29-11b1-9dad-c379636f7270", "c10ae4c2-9c29-11b1-9dad-c379636f7270",
    "bd590c98-9c29-11b1-9dad-c379636f7270", "bd654be7-9c29-11b1-9dad-c379636f7270",
    "bd58b833-9c29-11b1-9dad-c379636f7270", "bd58c1ad-9c29-11b1-9dad-c379636f7270",
    "bd58c1f0-9c29-11b1-9dad-c379636f7270", "c0937fa3-9c29-11b1-9dad-c379636f7270",
    "bd58d211-9c29-11b1-9dad-c379636f7270", "df8d87d0-eb94-11d6-82ee-0002b34c7c9f",
    "ce1e10e5-ec3f-11d6-8d83-0002b34c7c9f", "b90f05c2-7be6-41d9-95dd-badfd8a6ba18",
    "bed50053-9c29-11b1-9dad-c379636f7270", "bd58f042-9c29-11b1-9dad-c379636f7270",
    "bd58b9f9-9c29-11b1-9dad-c379636f7270", "bebd5604-9c29-11b1-9dad-c379636f7270",
    "c0604f82-9c29-11b1-9dad-c379636f7270", "bd58c2bd-9c29-11b1-9dad-c379636f7270",
    "bf1d7fe4-9c29-11b1-9dad-c379636f7270", "bd58c485-9c29-11b1-9dad-c379636f7270",
    "bd58c232-9c29-11b1-9dad-c379636f7270", "bf3a978c-9c29-11b1-9dad-c379636f7270",
    "bd5880d5-9c29-11b1-9dad-c379636f7270", "beab9388-9c29-11b1-9dad-c379636f7270",
    "bfbf40e9-9c29-11b1-9dad-c379636f7270", "bd58c4c6-9c29-11b1-9dad-c379636f7270",
    "f0bd8878-c427-11d6-8000-00a0c9c6d1c3", "bd58d6f3-9c29-11b1-9dad-c379636f7270",
    "bd58f8bc-9c29-11b1-9dad-c379636f7270", "bd58f87a-9c29-11b1-9dad-c379636f7270",
    "bd58ce5e-9c29-11b1-9dad-c379636f7270", "abb96eb5-e798-11d6-8ac9-0002b3a333c3",
    "47537942-331d-11d7-922f-0002b3a333c3", "47537943-331d-11d7-922f-0002b3a333c3",
    "46c5b240-c2a6-11d7-92d4-0002b3a333c3", "bde212ef-9c29-11b1-9dad-c379636f7270",
    "eff743dc-0ea7-41d7-8246-cecc2e49beb0", "df9f4728-0ea7-41d7-9612-a829907d2bf6",
    "bd58bf69-9c29-11b1-9dad-c379636f7270", "bf7a1c90-9c29-11b1-9dad-c379636f7270",
    "bd58c0a5-9c29-11b1-9dad-c379636f7270", "bd58c0ef-9c29-11b1-9dad-c379636f7270",
    "d32993c8-108b-41d7-943b-ee67ca30fba9", "beaad779-9c29-11b1-9dad-c379636f7270",
    "bf761f19-9c29-11b1-9dad-c379636f7270", "bd5892ab-9c29-11b1-9dad-c379636f7270",
    "bd58c3fb-9c29-11b1-9dad-c379636f7270", "bd5880ae-9c29-11b1-9dad-c379636f7270",
    "bd589ed9-9c29-11b1-9dad-c379636f7270", "bd5880d6-9c29-11b1-9dad-c379636f7270",
    "bd5880da-9c29-11b1-9dad-c379636f7270", "bd58c271-9c29-11b1-9dad-c379636f7270",
    "c0133726-9c29-11b1-9dad-c379636f7270", "afd79f32-7125-41d7-81b3-e79de9003a36",
    "bfc913a6-9c29-11b1-9dad-c379636f7270", "bd588100-9c29-11b1-9dad-c379636f7270",
    "be9be955-9c29-11b1-9dad-c379636f7270", "beb7f074-9c29-11b1-9dad-c379636f7270",
    "bfd0a274-9c29-11b1-9dad-c379636f7270", "bd5880ff-9c29-11b1-9dad-c379636f7270",
    "bde495da-9c29-11b1-9dad-c379636f7270", "80605b12-436e-11d6-8000-00a0c9da2002",
    "bd5880ab-9c29-11b1-9dad-c379636f7270", "bd588098-9c29-11b1-9dad-c379636f7270",
    "bd63d3ad-9c29-11b1-9dad-c379636f7270", "bf0f7037-9c29-11b1-9dad-c379636f7270",
    "c100289e-9c29-11b1-9dad-c379636f7270", "bf12c7c3-9c29-11b1-9dad-c379636f7270",
    "c0ad3020-9c29-11b1-9dad-c379636f7270", "be144cd1-9c29-11b1-9dad-c379636f7270",
    "bfe0bb3f-9c29-11b1-9dad-c379636f7270", "bd588002-9c29-11b1-9dad-c379636f7270",
    "bd5880cd-9c29-11b1-9dad-c379636f7270", "bd84df32-9c29-11b1-9dad-c379636f7270",
    "bfe7d31b-9c29-11b1-9dad-c379636f7270", "0e49646c-0f31-41d7-9fbe-ee5fdcf84034",
    "7087d921-0e2c-11d7-8f1a-0002b35bb117", "b8f9e0a4-27d5-11d7-9168-0002b34c7c9f",
    "290b90a8-033d-41d8-90bb-e6187b708fcc", "1a83bf1a-033d-41d8-93a5-af525946d6ea",
    "30a5f4a2-033d-41d8-8a13-caa49537da43", "bfaf1b18-9c29-11b1-9dad-c379636f7270",
    "bdc98c81-9c29-11b1-9dad-c379636f7270", "bf2a766d-9c29-11b1-9dad-c379636f7270",
    "bf77bef5-9c29-11b1-9dad-c379636f7270", "bd58d6b3-9c29-11b1-9dad-c379636f7270",
    "986a6742-4a78-11d7-9f84-00a0c9c6d17e", "bd5880a7-9c29-11b1-9dad-c379636f7270",
    "bd58825b-9c29-11b1-9dad-c379636f7270", "c0960de2-9c29-11b1-9dad-c379636f7270",
    "bf68c010-594e-11d6-8000-0002b364be7b", "bd58c131-9c29-11b1-9dad-c379636f7270",
    "be5d9e9f-9c29-11b1-9dad-c379636f7270", "bd58e5fd-9c29-11b1-9dad-c379636f7270",
    "bd589408-9c29-11b1-9dad-c379636f7270", "bd590951-9c29-11b1-9dad-c379636f7270",
    "bd5880e2-9c29-11b1-9dad-c379636f7270", "bd5880eb-9c29-11b1-9dad-c379636f7270",
    "be59c5cb-9c29-11b1-9dad-c379636f7270", "c1052107-9c29-11b1-9dad-c379636f7270",
    "c05813b7-9c29-11b1-9dad-c379636f7270", "c01d6e8d-9c29-11b1-9dad-c379636f7270",
    "bd58a571-9c29-11b1-9dad-c379636f7270", "bff27115-9c29-11b1-9dad-c379636f7270",
    "bee52c1c-9c29-11b1-9dad-c379636f7270", "68ea1372-2f6a-11d9-9ae0-0002b35bb117",
    "bd66e0a4-9c29-11b1-9dad-c379636f7270", "bf8b47b8-9c29-11b1-9dad-c379636f7270",
    "bd589695-9c29-11b1-9dad-c379636f7270", "dff47935-4da2-11d6-82c0-0002b34c7c9f",
    "189f0aec-a012-11d6-993c-0002b34c7c9f", "bddef55a-9c29-11b1-9dad-c379636f7270",
    "dff47936-4da2-11d6-82c0-0002b34c7c9f", "94f07021-8b0d-11d7-8701-0002b3a8515d",
    "bd59086c-9c29-11b1-9dad-c379636f7270", "bfa699e0-9c29-11b1-9dad-c379636f7270",
    "bd58803c-9c29-11b1-9dad-c379636f7270", "bd58a644-9c29-11b1-9dad-c379636f7270",
    "bd58d637-9c29-11b1-9dad-c379636f7270", "be01286a-9c29-11b1-9dad-c379636f7270",
    "bfac572e-9c29-11b1-9dad-c379636f7270", "bfeb3d17-9c29-11b1-9dad-c379636f7270",
    "bf8d1cd4-9c29-11b1-9dad-c379636f7270", "bdaa4b0e-9c29-11b1-9dad-c379636f7270",
    "c12bfd14-9c29-11b1-9dad-c379636f7270", "bd588101-9c29-11b1-9dad-c379636f7270",
    "c02b14f0-9c29-11b1-9dad-c379636f7270", "ac71e362-8918-11da-8000-0002b3620a69",
    "bd79c885-9c29-11b1-9dad-c379636f7270", "bdf8edae-9c29-11b1-9dad-c379636f7270",
    "bdcc9f7c-9c29-11b1-9dad-c379636f7270", "bd58e476-9c29-11b1-9dad-c379636f7270",
    "bd58d7f6-9c29-11b1-9dad-c379636f7270", "bd5880cf-9c29-11b1-9dad-c379636f7270",
    "bfcfa24f-9c29-11b1-9dad-c379636f7270", "bd5880f4-9c29-11b1-9dad-c379636f7270",
    "bd58e124-9c29-11b1-9dad-c379636f7270", "bd5880ac-9c29-11b1-9dad-c379636f7270",
    "67ac42e4-033d-41d8-88b4-c5af6346a3c4", "5faaf1f8-033d-41d8-9cc3-881c93115d39",
    "bd58c916-9c29-11b1-9dad-c379636f7270", "bd5880d9-9c29-11b1-9dad-c379636f7270",
    "bea64551-9c29-11b1-9dad-c379636f7270", "bd58e3ba-9c29-11b1-9dad-c379636f7270",
    "bd58e163-9c29-11b1-9dad-c379636f7270", "bd58af89-9c29-11b1-9dad-c379636f7270",
    "bd5e7a9e-9c29-11b1-9dad-c379636f7270", "bee5923d-9c29-11b1-9dad-c379636f7270",
    "e25a50a1-64dd-11d9-8e37-0002b35bb117", "bd5880aa-9c29-11b1-9dad-c379636f7270",
    "bdadcbf0-9c29-11b1-9dad-c379636f7270", "bd588471-9c29-11b1-9dad-c379636f7270",
    "dff4a042-4da2-11d6-82c0-0002b34c7c9f", "dff4a041-4da2-11d6-82c0-0002b34c7c9f",
    "bd58f8fe-9c29-11b1-9dad-c379636f7270", "bd992179-9c29-11b1-9dad-c379636f7270",
    "bd5d0b56-9c29-11b1-9dad-c379636f7270", "becf783a-9c29-11b1-9dad-c379636f7270",
    "bdb0bfbf-9c29-11b1-9dad-c379636f7270", "71304bd0-033d-41d8-815a-9f1758b267de",
    "83996144-033d-41d8-9e46-c8e929e84a03", "8b1299ae-033d-41d8-9eb8-c7fc9b1aa271",
    "6e398450-033d-41d8-8a81-b80d939dc7a9", "bae22f21-243d-11d8-9840-0002b3988fc4",
    "bd58e0e2-9c29-11b1-9dad-c379636f7270", "bd5880bd-9c29-11b1-9dad-c379636f7270",
    "0d6aa652-5866-11d6-8be9-00902794f506", "c10569cb-9c29-11b1-9dad-c379636f7270",
    "bf9a6157-9c29-11b1-9dad-c379636f7270", "bd757df1-9c29-11b1-9dad-c379636f7270",
    "bd58ba7a-9c29-11b1-9dad-c379636f7270", "bd58ba7e-9c29-11b1-9dad-c379636f7270",
    "bd5880f9-9c29-11b1-9dad-c379636f7270", "bd61886b-9c29-11b1-9dad-c379636f7270",
    "bd588b1d-9c29-11b1-9dad-c379636f7270", "bd588118-9c29-11b1-9dad-c379636f7270",
    "a8a40d93-0d87-11d9-9e57-0002b35bb117", "43806c83-6e4c-11d9-93ac-0007e916336c",
    "bd5a142d-9c29-11b1-9dad-c379636f7270", "bd58dcda-9c29-11b1-9dad-c379636f7270",
    "bd588117-9c29-11b1-9dad-c379636f7270", "a8a434a0-0d87-11d9-9e57-0002b35bb117",
    "43806c84-6e4c-11d9-93ac-0007e916336c", "bd5b6d60-9c29-11b1-9dad-c379636f7270",
    "bd58b8c3-9c29-11b1-9dad-c379636f7270", "bd588116-9c29-11b1-9dad-c379636f7270",
    "a8a434a1-0d87-11d9-9e57-0002b35bb117", "43806c85-6e4c-11d9-93ac-0007e916336c",
    "bd678812-9c29-11b1-9dad-c379636f7270", "bd67e911-9c29-11b1-9dad-c379636f7270",
    "bd588115-9c29-11b1-9dad-c379636f7270", "a8a434a2-0d87-11d9-9e57-0002b35bb117",
    "43806c86-6e4c-11d9-93ac-0007e916336c", "bd60a887-9c29-11b1-9dad-c379636f7270",
    "bd5d7783-9c29-11b1-9dad-c379636f7270", "bd588114-9c29-11b1-9dad-c379636f7270",
    "a8a434a3-0d87-11d9-9e57-0002b35bb117", "43806c87-6e4c-11d9-93ac-0007e916336c",
    "bff82c25-9c29-11b1-9dad-c379636f7270", "bf476137-9c29-11b1-9dad-c379636f7270",
    "bf6d1d3a-9c29-11b1-9dad-c379636f7270", "a8a45bb0-0d87-11d9-9e57-0002b35bb117",
    "43809390-6e4c-11d9-93ac-0007e916336c", "bdc438fd-9c29-11b1-9dad-c379636f7270",
    "c0054316-9c29-11b1-9dad-c379636f7270", "5dcd30b1-4493-11d9-93ca-0002b35bb117",
    "bee22d3d-9c29-11b1-9dad-c379636f7270", "a8a40d92-0d87-11d9-9e57-0002b35bb117",
    "b463b9fc-1717-41d9-81f5-946e75d138e6", "bd651c1b-9c29-11b1-9dad-c379636f7270",
    "bd58803d-9c29-11b1-9dad-c379636f7270", "5dcd30b0-4493-11d9-93ca-0002b35bb117",
    "bd5880ce-9c29-11b1-9dad-c379636f7270", "bd6a2d94-9c29-11b1-9dad-c379636f7270",
    "c128c4f1-9c29-11b1-9dad-c379636f7270", "bd95395a-9c29-11b1-9dad-c379636f7270",
    "beaa9284-9c29-11b1-9dad-c379636f7270", "be8f47a3-9c29-11b1-9dad-c379636f7270",
    "bd588106-9c29-11b1-9dad-c379636f7270", "aab60111-ab44-11d8-897d-0002b35bb117",
    "bcb003f3-aac9-11d8-85bd-0002b35bb117", "bfa4e9d2-9c29-11b1-9dad-c379636f7270",
    "1c0aeb26-d0ff-41d7-8df3-e0206d107204", "beaa3d29-9c29-11b1-9dad-c379636f7270",
    "df8d87d4-eb94-11d6-82ee-0002b34c7c9f", "df8d60c4-eb94-11d6-82ee-0002b34c7c9f",
    "ce1e10e1-ec3f-11d6-8d83-0002b34c7c9f", "bd59083a-9c29-11b1-9dad-c379636f7270",
    "be6735cd-9c29-11b1-9dad-c379636f7270", "6d2e2240-56ce-11d6-8227-0002b34c7c9f",
    "059c0a87-39b0-11d9-8528-0007e9162f51", "892d2402-429b-11d7-9f12-0002b3a8515d",
    "892d2401-429b-11d7-9f12-0002b3a8515d", "bd588109-9c29-11b1-9dad-c379636f7270",
    "bdf7cb82-9c29-11b1-9dad-c379636f7270", "bfe6fe22-9c29-11b1-9dad-c379636f7270",
    "661b7834-ab3d-11d7-956f-0007e90d9be3", "ced01936-acd6-41d7-80bd-aecc7431901b",
    "661b7831-ab3d-11d7-956f-0007e90d9be3", "661b7832-ab3d-11d7-956f-0007e90d9be3",
    "bda06d71-9c29-11b1-9dad-c379636f7270", "661b7833-ab3d-11d7-956f-0007e90d9be3",
    "bd8dbbc3-9c29-11b1-9dad-c379636f7270", "661b7835-ab3d-11d7-956f-0007e90d9be3",
    "bdb09014-9c29-11b1-9dad-c379636f7270", "bd58803e-9c29-11b1-9dad-c379636f7270",
    "be34dcb7-9c29-11b1-9dad-c379636f7270", "bce8a0b1-8ac9-11d6-864b-0002b364be7b",
    "bf8d3988-9c29-11b1-9dad-c379636f7270", "bd7183b0-9c29-11b1-9dad-c379636f7270",
    "bfa067af-9c29-11b1-9dad-c379636f7270", "be35d1f9-9c29-11b1-9dad-c379636f7270",
    "6bbde2e0-12aa-41d7-97e2-d2cd8dde2280", "aaaf2180-0ea9-41d7-8c78-f3d77408dd13",
    "c5b8bff0-0ea8-41d7-9330-a8d75dc13d41", "b043ad1a-0ea8-41d7-8807-e4d7aad88a01",
    "b01f3e4c-107b-41d7-89ac-d853a1ceea45", "9b44270a-1088-41d7-89d8-86187f50eac7",
    "6fe23318-0ea8-41d7-9648-9237f96c6632", "857cb040-0ea8-41d7-8639-c286b90192ba",
    "9af4b0d0-0ea8-41d7-88ee-e7da88c593cc", "012ec430-107a-41d7-8201-fd0c6a33c4ae",
    "93e9b082-0ea9-41d7-9217-e88c867d6e71", "7e0d7e6a-0ea9-41d7-9e9e-a5a533761768",
    "0cdaac86-0ea9-41d7-9528-b5928f6b2cd6", "f6f092d2-0ea8-41d7-8074-f74b3a1f4f8e",
    "5a1c2052-0ea8-41d7-8354-8a1ca8c753f7", "48564780-0ea8-41d7-8f74-e07cb4469992",
    "4fe874b8-0ea9-41d7-9a51-cb2aa8ac722d", "39f93138-0ea9-41d7-9207-fe9aa15a65d3",
    "1a2afc8e-0ea8-41d7-86ad-9f138e1b142c", "449c68f2-108a-41d7-85a4-d5be787da5b9",
    "cee981ca-121a-41d7-9820-d2140528f40e", "e416edc3-758f-11d7-846c-0002b3a85c8d",
    "e416edc2-758f-11d7-846c-0002b3a85c8d", "f7cf5a39-5224-11d6-9eb9-0002b34c7c9f",
    "c082ab98-9c29-11b1-9dad-c379636f7270", "c037affb-9c29-11b1-9dad-c379636f7270",
    "c07a7946-9c29-11b1-9dad-c379636f7270", "bde5ec9c-9c29-11b1-9dad-c379636f7270",
    "bd5880ed-9c29-11b1-9dad-c379636f7270", "bd60e145-9c29-11b1-9dad-c379636f7270",
    "bd5880ee-9c29-11b1-9dad-c379636f7270", "01031bea-4371-11d6-8000-00a0c9da2002",
    "bd63f343-9c29-11b1-9dad-c379636f7270", "bdfdf4b1-9c29-11b1-9dad-c379636f7270",
    "bd5880e3-9c29-11b1-9dad-c379636f7270", "c1299098-9c29-11b1-9dad-c379636f7270",
    "c073820f-9c29-11b1-9dad-c379636f7270", "c0659a2b-9c29-11b1-9dad-c379636f7270",
    "c10e5735-9c29-11b1-9dad-c379636f7270", "beab79ec-9c29-11b1-9dad-c379636f7270",
    "c05e110e-9c29-11b1-9dad-c379636f7270", "bd5880c9-9c29-11b1-9dad-c379636f7270",
    "bda887b6-9c29-11b1-9dad-c379636f7270", "c03afa6d-9c29-11b1-9dad-c379636f7270",
    "bf0a336e-9c29-11b1-9dad-c379636f7270", "2eb3d286-1976-41d9-98a2-cd8854d31725",
    "bd5880c1-9c29-11b1-9dad-c379636f7270", "834eac32-86a4-11d9-88d7-0002b35bb117",
    "fe7e4d83-d86f-11d9-8ba5-0002b3891c1f", "c000f476-9c29-11b1-9dad-c379636f7270",
    "175dad78-557d-41d7-9305-ede135042ebb", "bd65cd99-9c29-11b1-9dad-c379636f7270",
    "bd595e7e-9c29-11b1-9dad-c379636f7270", "bd58e0ec-9c29-11b1-9dad-c379636f7270",
    "be31edd4-9c29-11b1-9dad-c379636f7270", "6837f9f0-8c0e-11d9-9cdd-0002b35bb117",
    "c0d6eb7b-9c29-11b1-9dad-c379636f7270", "be2e94bb-9c29-11b1-9dad-c379636f7270",
    "be92128d-9c29-11b1-9dad-c379636f7270", "bd5892af-9c29-11b1-9dad-c379636f7270",
    "bd5880f7-9c29-11b1-9dad-c379636f7270", "a71e1700-063f-41d7-9841-873d1ddc865a",
    "74182065-dce5-11d9-9d50-0007e9162f51", "beed06de-9c29-11b1-9dad-c379636f7270",
    "c0f45a9c-9c29-11b1-9dad-c379636f7270", "bf84f09d-9c29-11b1-9dad-c379636f7270",
    "df8d87d2-eb94-11d6-82ee-0002b34c7c9f", "bd61ec34-9c29-11b1-9dad-c379636f7270",
    "bd5880e5-9c29-11b1-9dad-c379636f7270", "bd5b4951-9c29-11b1-9dad-c379636f7270",
    "bd58810e-9c29-11b1-9dad-c379636f7270", "33f8cc41-9281-11d9-9ad4-0002b35bb117",
    "a988bc62-6e2b-11d9-93ac-0002b35bb117", "bd5880b2-9c29-11b1-9dad-c379636f7270",
    "bd5880af-9c29-11b1-9dad-c379636f7270", "bd5bae9a-9c29-11b1-9dad-c379636f7270",
    "bf74bd9c-9c29-11b1-9dad-c379636f7270", "be81b28d-9c29-11b1-9dad-c379636f7270",
    "0548d243-4342-11d7-9851-0002b34c7c9f", "55b05522-f7e2-11da-99f7-0002b3988fc4",
    "bd588113-9c29-11b1-9dad-c379636f7270", "5f448121-4362-11d7-9b8e-0002b34c7c9f",
    "bd5880f8-9c29-11b1-9dad-c379636f7270", "bfce95e7-9c29-11b1-9dad-c379636f7270",
    "bff476e8-9c29-11b1-9dad-c379636f7270", "bda0e43c-9c29-11b1-9dad-c379636f7270",
    "bdfb7dd0-9c29-11b1-9dad-c379636f7270", "bdde7fe1-9c29-11b1-9dad-c379636f7270",
    "bd671c2d-9c29-11b1-9dad-c379636f7270", "bee6e76c-9c29-11b1-9dad-c379636f7270",
    "c135299e-9c29-11b1-9dad-c379636f7270", "bd5c548a-9c29-11b1-9dad-c379636f7270",
    "c0a383bd-9c29-11b1-9dad-c379636f7270", "c11c43c3-9c29-11b1-9dad-c379636f7270",
    "be4ef62a-9c29-11b1-9dad-c379636f7270", "bd682bdd-9c29-11b1-9dad-c379636f7270",
    "bea12384-9c29-11b1-9dad-c379636f7270", "bf8c47ad-9c29-11b1-9dad-c379636f7270",
    "bde38eeb-9c29-11b1-9dad-c379636f7270", "bf77aa73-9c29-11b1-9dad-c379636f7270",
    "bde87324-9c29-11b1-9dad-c379636f7270", "be1ac327-9c29-11b1-9dad-c379636f7270",
    "bd913dca-9c29-11b1-9dad-c379636f7270", "c0c3a8a2-9c29-11b1-9dad-c379636f7270",
    "bf54071c-9c29-11b1-9dad-c379636f7270", "c133531a-9c29-11b1-9dad-c379636f7270",
    "bd7d5373-9c29-11b1-9dad-c379636f7270", "bf1b7efc-9c29-11b1-9dad-c379636f7270",
    "bdca5506-9c29-11b1-9dad-c379636f7270", "c0d674bf-9c29-11b1-9dad-c379636f7270",
    "c13181fd-9c29-11b1-9dad-c379636f7270", "bdc36538-9c29-11b1-9dad-c379636f7270",
    "8681b273-6c71-11d7-8bb8-0002b3a331d6", "bdd9d485-9c29-11b1-9dad-c379636f7270",
    "8681b272-6c71-11d7-8bb8-0002b3a331d6", "bf5cb2c0-9c29-11b1-9dad-c379636f7270",
    "c0b4578f-9c29-11b1-9dad-c379636f7270", "c0739142-9c29-11b1-9dad-c379636f7270",
    "0548f950-4342-11d7-9851-0002b34c7c9f", "bd588104-9c29-11b1-9dad-c379636f7270",
    "bd5880d3-9c29-11b1-9dad-c379636f7270", "c0cd0537-9c29-11b1-9dad-c379636f7270",
    "90ea97a6-a536-11d8-938a-0002b3988fc4", "c0ff89be-9c29-11b1-9dad-c379636f7270",
    "bd5880b9-9c29-11b1-9dad-c379636f7270", "6837d2e2-8c0e-11d9-9cdd-0002b35bb117",
    "9e98b4f1-773c-11d7-9996-0002b34c7c9f", "bebece64-9c29-11b1-9dad-c379636f7270",
    "bd5880ba-9c29-11b1-9dad-c379636f7270", "bda09fc2-9c29-11b1-9dad-c379636f7270",
    "c12ea2ff-9c29-11b1-9dad-c379636f7270", "059be375-39b0-11d9-8528-0007e9162f51",
    "c10c4394-9c29-11b1-9dad-c379636f7270", "c0f93b23-9c29-11b1-9dad-c379636f7270",
    "c0714577-9c29-11b1-9dad-c379636f7270", "bd588107-9c29-11b1-9dad-c379636f7270",
    "bd58810b-9c29-11b1-9dad-c379636f7270", "bfda366c-9c29-11b1-9dad-c379636f7270",
    "be4425ef-9c29-11b1-9dad-c379636f7270", "c00d7a96-9c29-11b1-9dad-c379636f7270",
    "bd5b97f9-9c29-11b1-9dad-c379636f7270", "be1c3220-9c29-11b1-9dad-c379636f7270",
    "bee356be-9c29-11b1-9dad-c379636f7270", "c1416e20-9c29-11b1-9dad-c379636f7270",
    "be717e09-9c29-11b1-9dad-c379636f7270", "c0390e21-9c29-11b1-9dad-c379636f7270",
    "be9e0a7c-9c29-11b1-9dad-c379636f7270", "bd91b03d-9c29-11b1-9dad-c379636f7270",
    "bf05e63f-9c29-11b1-9dad-c379636f7270", "bf411eed-9c29-11b1-9dad-c379636f7270",
    "bd5c44e1-9c29-11b1-9dad-c379636f7270", "bf2b937c-9c29-11b1-9dad-c379636f7270",
    "bd610a5c-9c29-11b1-9dad-c379636f7270", "b92626d0-94a5-41d9-8fdf-cc8d0e1bd018",
    "bd5880fb-9c29-11b1-9dad-c379636f7270", "bf660e73-9c29-11b1-9dad-c379636f7270",
    "bf4dc2b8-9c29-11b1-9dad-c379636f7270", "68330840-5ed1-11d6-8000-0002b364be7b",
    "c1227621-9c29-11b1-9dad-c379636f7270", "bfe6fd41-9c29-11b1-9dad-c379636f7270",
    "bd589d90-9c29-11b1-9dad-c379636f7270", "bd6422c8-9c29-11b1-9dad-c379636f7270",
    "bfd54197-9c29-11b1-9dad-c379636f7270", "86c1dc8a-50aa-11d6-8000-00a0c9da2002",
    "bf68e241-9c29-11b1-9dad-c379636f7270", "bd5880fa-9c29-11b1-9dad-c379636f7270",
    "bf83203b-9c29-11b1-9dad-c379636f7270", "c0b541b6-9c29-11b1-9dad-c379636f7270",
    "bdb8721b-9c29-11b1-9dad-c379636f7270", "bf136680-9c29-11b1-9dad-c379636f7270",
    "34349377-cb63-11d6-878a-0002b34c7c9f", "6d2dfb33-56ce-11d6-8227-0002b34c7c9f",
    "becd79d2-9c29-11b1-9dad-c379636f7270", "c0b4950a-9c29-11b1-9dad-c379636f7270",
    "f0f39521-8447-11d9-9df2-0002b3a85b0b", "c033ac24-9c29-11b1-9dad-c379636f7270",
    "be18e693-9c29-11b1-9dad-c379636f7270", "c49488d4-a0de-41d7-8ede-9d605e6c951d",
    "c076ff6d-9c29-11b1-9dad-c379636f7270", "49802a10-2475-11d9-88f9-0002b35bb117",
    "49800303-2475-11d9-88f9-0002b35bb117", "49800302-2475-11d9-88f9-0002b35bb117",
    "055544a2-4371-11d6-8000-00a0c9da2002", "ab7bb61a-2d61-41d7-9bd7-c39bf23d2dba",
    "bfdb8eef-9c29-11b1-9dad-c379636f7270", "be0bbbb5-9c29-11b1-9dad-c379636f7270",
    "c0f012ac-9c29-11b1-9dad-c379636f7270", "c0279a99-9c29-11b1-9dad-c379636f7270",
    "c0a79513-9c29-11b1-9dad-c379636f7270", "c09f6ac3-9c29-11b1-9dad-c379636f7270",
    "bedc09ec-9c29-11b1-9dad-c379636f7270", "bf3429c5-9c29-11b1-9dad-c379636f7270",
    "be4dd7f1-9c29-11b1-9dad-c379636f7270", "c001e2b4-9c29-11b1-9dad-c379636f7270",
    "c086cb66-9c29-11b1-9dad-c379636f7270", "be659d62-9c29-11b1-9dad-c379636f7270",
    "c0bb3413-9c29-11b1-9dad-c379636f7270", "bdd3d5ea-9c29-11b1-9dad-c379636f7270",
    "bfefebaf-9c29-11b1-9dad-c379636f7270", "be4b53f2-9c29-11b1-9dad-c379636f7270",
    "bdb6e7e8-9c29-11b1-9dad-c379636f7270", "c0328561-9c29-11b1-9dad-c379636f7270",
    "be0d3c4c-9c29-11b1-9dad-c379636f7270", "bfad6be8-9c29-11b1-9dad-c379636f7270",
    "be667f85-9c29-11b1-9dad-c379636f7270", "bdcd7ea7-9c29-11b1-9dad-c379636f7270",
    "bdd50606-9c29-11b1-9dad-c379636f7270", "bef7ed88-9c29-11b1-9dad-c379636f7270",
    "b52c8232-8e5b-41d8-8abd-b16baad462a7", "bd58d6ab-9c29-11b1-9dad-c379636f7270",
    "bf64a755-9c29-11b1-9dad-c379636f7270", "bd5880f1-9c29-11b1-9dad-c379636f7270",
    "bebe2068-9c29-11b1-9dad-c379636f7270", "f5c35092-90c7-11d9-9489-0002b35bb117",
    "c13bc0c4-9c29-11b1-9dad-c379636f7270", "b9000472-c301-11d9-8d69-0002b3891c29",
    "b9000473-c301-11d9-8d69-0002b3891c29", "c11bb004-9c29-11b1-9dad-c379636f7270",
    "bd5db814-9c29-11b1-9dad-c379636f7270", "c03d1910-9c29-11b1-9dad-c379636f7270",
    "c0a63548-9c29-11b1-9dad-c379636f7270", "be83f745-9c29-11b1-9dad-c379636f7270",
    "bead825d-9c29-11b1-9dad-c379636f7270", "c8ac46a3-e7a2-11d6-8e5b-0002b34c7c9f",
    "c0fb9be2-9c29-11b1-9dad-c379636f7270", "c10b559a-9c29-11b1-9dad-c379636f7270",
    "d52a7d04-50ab-11d6-8000-00a0c9da2002", "c2eb72a1-13dd-11d8-9e44-0002b3988fc4",
    "c0f527fc-9c29-11b1-9dad-c379636f7270", "bd903ed3-9c29-11b1-9dad-c379636f7270",
    "c06337a2-9c29-11b1-9dad-c379636f7270", "c1164bb8-9c29-11b1-9dad-c379636f7270",
    "c0e2af4e-9c29-11b1-9dad-c379636f7270", "bece6da2-9c29-11b1-9dad-c379636f7270",
    "bdf02d74-9c29-11b1-9dad-c379636f7270", "51bacf6a-4621-41d8-903f-8618675219cb",
    "bd5880e4-9c29-11b1-9dad-c379636f7270", "c10af5e7-9c29-11b1-9dad-c379636f7270",
    "c10af932-9c29-11b1-9dad-c379636f7270", "c10ae7b8-9c29-11b1-9dad-c379636f7270",
    "bd5880f6-9c29-11b1-9dad-c379636f7270", "c12157ff-9c29-11b1-9dad-c379636f7270",
    "bfe2070f-9c29-11b1-9dad-c379636f7270", "c03b87b7-9c29-11b1-9dad-c379636f7270",
    "be3a8699-9c29-11b1-9dad-c379636f7270", "c09c8637-9c29-11b1-9dad-c379636f7270",
    "bd5900c1-9c29-11b1-9dad-c379636f7270", "be1e5136-9c29-11b1-9dad-c379636f7270",
    "bde7f9f2-9c29-11b1-9dad-c379636f7270"
  };
  
  private final static String[] SORTED_EXAMPLE_CORE_GUIDS = {
    "0c5a7576-0f94-11d6-8000-0050dab92c2f", "80605b12-436e-11d6-8000-00a0c9da2002",
    "fe9fcdd0-4370-11d6-8000-00a0c9da2002", "01031bea-4371-11d6-8000-00a0c9da2002",
    "055544a2-4371-11d6-8000-00a0c9da2002", "86c1dc8a-50aa-11d6-8000-00a0c9da2002",
    "d52a7d04-50ab-11d6-8000-00a0c9da2002", "c2444102-5943-11d6-8000-0002b364be7b",
    "c2a37e88-5943-11d6-8000-0002b364be7b", "bf68c010-594e-11d6-8000-0002b364be7b",
    "68330840-5ed1-11d6-8000-0002b364be7b", "8f7d6628-8a1b-11d6-8000-00902794f506",
    "d73532c0-8a1b-11d6-8000-00902794f506", "ee9f744c-8a1c-11d6-8000-00902794f506",
    "f0cee806-8a1c-11d6-8000-00902794f506", "f3b2506c-8a1c-11d6-8000-00902794f506",
    "1efb39f0-8a1d-11d6-8000-00902794f506", "21894e1e-8a1d-11d6-8000-00902794f506",
    "2318a806-8a1d-11d6-8000-00902794f506", "24976690-8a1d-11d6-8000-00902794f506",
    "26ad75a0-8a1d-11d6-8000-00902794f506", "f0bd8878-c427-11d6-8000-00a0c9c6d1c3",
    "4cba0caa-e982-11d9-8000-0002b3a85b8f", "0a0172da-e983-11d9-8000-0002b3a85b8f",
    "a774ee10-e984-11d9-8000-0002b3a85b8f", "ac71e362-8918-11da-8000-0002b3620a69",
    "6d2dfb33-56ce-11d6-8227-0002b34c7c9f", "6d2e2240-56ce-11d6-8227-0002b34c7c9f",
    "dff47935-4da2-11d6-82c0-0002b34c7c9f", "dff47936-4da2-11d6-82c0-0002b34c7c9f",
    "dff47937-4da2-11d6-82c0-0002b34c7c9f", "dff47938-4da2-11d6-82c0-0002b34c7c9f",
    "dff4a041-4da2-11d6-82c0-0002b34c7c9f", "dff4a042-4da2-11d6-82c0-0002b34c7c9f",
    "df8d60c3-eb94-11d6-82ee-0002b34c7c9f", "df8d60c4-eb94-11d6-82ee-0002b34c7c9f",
    "df8d87d0-eb94-11d6-82ee-0002b34c7c9f", "df8d87d2-eb94-11d6-82ee-0002b34c7c9f",
    "df8d87d4-eb94-11d6-82ee-0002b34c7c9f", "e416edc1-758f-11d7-846c-0002b3a85c8d",
    "e416edc2-758f-11d7-846c-0002b3a85c8d", "e416edc3-758f-11d7-846c-0002b3a85c8d",
    "059be375-39b0-11d9-8528-0007e9162f51", "059c0a80-39b0-11d9-8528-0007e9162f51",
    "059c0a82-39b0-11d9-8528-0007e9162f51", "059c0a85-39b0-11d9-8528-0007e9162f51",
    "059c0a87-39b0-11d9-8528-0007e9162f51", "bcb003f3-aac9-11d8-85bd-0002b35bb117",
    "bce8a0b1-8ac9-11d6-864b-0002b364be7b", "ff947d33-963a-11d7-866f-0002b34c7c9f",
    "ff947d34-963a-11d7-866f-0002b34c7c9f", "94f07021-8b0d-11d7-8701-0002b3a8515d",
    "34349377-cb63-11d6-878a-0002b34c7c9f", "834eac32-86a4-11d9-88d7-0002b35bb117",
    "49800302-2475-11d9-88f9-0002b35bb117", "49800303-2475-11d9-88f9-0002b35bb117",
    "49802a10-2475-11d9-88f9-0002b35bb117", "aab60111-ab44-11d8-897d-0002b35bb117",
    "abb96eb5-e798-11d6-8ac9-0002b3a333c3", "fe7e4d83-d86f-11d9-8ba5-0002b3891c1f",
    "8681b272-6c71-11d7-8bb8-0002b3a331d6", "8681b273-6c71-11d7-8bb8-0002b3a331d6",
    "0d6aa652-5866-11d6-8be9-00902794f506", "b9000472-c301-11d9-8d69-0002b3891c29",
    "b9000473-c301-11d9-8d69-0002b3891c29", "ce1e10e1-ec3f-11d6-8d83-0002b34c7c9f",
    "ce1e10e5-ec3f-11d6-8d83-0002b34c7c9f", "ce1e10e6-ec3f-11d6-8d83-0002b34c7c9f",
    "ce1e37f0-ec3f-11d6-8d83-0002b34c7c9f", "badbedd1-1ebc-11d8-8dde-0002b3988fc4",
    "e25a50a1-64dd-11d9-8e37-0002b35bb117", "c8ac46a3-e7a2-11d6-8e5b-0002b34c7c9f",
    "7087d921-0e2c-11d7-8f1a-0002b35bb117", "b8f9e0a4-27d5-11d7-9168-0002b34c7c9f",
    "0ccf9a20-d1a5-11d7-91aa-0002b3a8515d", "a8462735-532a-11d6-9228-0002b34c7c9f",
    "47537942-331d-11d7-922f-0002b3a333c3", "47537943-331d-11d7-922f-0002b3a333c3",
    "46c5b240-c2a6-11d7-92d4-0002b3a333c3", "90ea97a6-a536-11d8-938a-0002b3988fc4",
    "a988bc62-6e2b-11d9-93ac-0002b35bb117", "43806c82-6e4c-11d9-93ac-0007e916336c",
    "43806c83-6e4c-11d9-93ac-0007e916336c", "43806c84-6e4c-11d9-93ac-0007e916336c",
    "43806c85-6e4c-11d9-93ac-0007e916336c", "43806c86-6e4c-11d9-93ac-0007e916336c",
    "43806c87-6e4c-11d9-93ac-0007e916336c", "43809390-6e4c-11d9-93ac-0007e916336c",
    "6dd2e092-b027-11d9-93b3-0002b35bb117", "6dd2e093-b027-11d9-93b3-0002b35bb117",
    "5dcd30b0-4493-11d9-93ca-0002b35bb117", "5dcd30b1-4493-11d9-93ca-0002b35bb117",
    "f5c35092-90c7-11d9-9489-0002b35bb117", "661b7831-ab3d-11d7-956f-0007e90d9be3",
    "661b7832-ab3d-11d7-956f-0007e90d9be3", "661b7833-ab3d-11d7-956f-0007e90d9be3",
    "661b7834-ab3d-11d7-956f-0007e90d9be3", "661b7835-ab3d-11d7-956f-0007e90d9be3",
    "bae22f21-243d-11d8-9840-0002b3988fc4", "0548d243-4342-11d7-9851-0002b34c7c9f",
    "0548f950-4342-11d7-9851-0002b34c7c9f", "189f0aec-a012-11d6-993c-0002b34c7c9f",
    "9e98b4f1-773c-11d7-9996-0002b34c7c9f", "55b05522-f7e2-11da-99f7-0002b3988fc4",
    "a77033a4-fc81-11da-99f8-0002b3988fc4", "33f8cc41-9281-11d9-9ad4-0002b35bb117",
    "68ea1372-2f6a-11d9-9ae0-0002b35bb117", "5f448121-4362-11d7-9b8e-0002b34c7c9f",
    "6837d2e2-8c0e-11d9-9cdd-0002b35bb117", "6837f9f0-8c0e-11d9-9cdd-0002b35bb117",
    "74182065-dce5-11d9-9d50-0007e9162f51", "bd588002-9c29-11b1-9dad-c379636f7270",
    "bd58803c-9c29-11b1-9dad-c379636f7270", "bd58803d-9c29-11b1-9dad-c379636f7270",
    "bd58803e-9c29-11b1-9dad-c379636f7270", "bd588068-9c29-11b1-9dad-c379636f7270",
    "bd58806a-9c29-11b1-9dad-c379636f7270", "bd588098-9c29-11b1-9dad-c379636f7270",
    "bd5880a0-9c29-11b1-9dad-c379636f7270", "bd5880a6-9c29-11b1-9dad-c379636f7270",
    "bd5880a7-9c29-11b1-9dad-c379636f7270", "bd5880aa-9c29-11b1-9dad-c379636f7270",
    "bd5880ab-9c29-11b1-9dad-c379636f7270", "bd5880ac-9c29-11b1-9dad-c379636f7270",
    "bd5880ae-9c29-11b1-9dad-c379636f7270", "bd5880af-9c29-11b1-9dad-c379636f7270",
    "bd5880b2-9c29-11b1-9dad-c379636f7270", "bd5880b9-9c29-11b1-9dad-c379636f7270",
    "bd5880ba-9c29-11b1-9dad-c379636f7270", "bd5880bd-9c29-11b1-9dad-c379636f7270",
    "bd5880c1-9c29-11b1-9dad-c379636f7270", "bd5880c9-9c29-11b1-9dad-c379636f7270",
    "bd5880cc-9c29-11b1-9dad-c379636f7270", "bd5880cd-9c29-11b1-9dad-c379636f7270",
    "bd5880ce-9c29-11b1-9dad-c379636f7270", "bd5880cf-9c29-11b1-9dad-c379636f7270",
    "bd5880d3-9c29-11b1-9dad-c379636f7270", "bd5880d5-9c29-11b1-9dad-c379636f7270",
    "bd5880d6-9c29-11b1-9dad-c379636f7270", "bd5880d8-9c29-11b1-9dad-c379636f7270",
    "bd5880d9-9c29-11b1-9dad-c379636f7270", "bd5880da-9c29-11b1-9dad-c379636f7270",
    "bd5880e0-9c29-11b1-9dad-c379636f7270", "bd5880e2-9c29-11b1-9dad-c379636f7270",
    "bd5880e3-9c29-11b1-9dad-c379636f7270", "bd5880e4-9c29-11b1-9dad-c379636f7270",
    "bd5880e5-9c29-11b1-9dad-c379636f7270", "bd5880eb-9c29-11b1-9dad-c379636f7270",
    "bd5880ed-9c29-11b1-9dad-c379636f7270", "bd5880ee-9c29-11b1-9dad-c379636f7270",
    "bd5880ef-9c29-11b1-9dad-c379636f7270", "bd5880f1-9c29-11b1-9dad-c379636f7270",
    "bd5880f4-9c29-11b1-9dad-c379636f7270", "bd5880f6-9c29-11b1-9dad-c379636f7270",
    "bd5880f7-9c29-11b1-9dad-c379636f7270", "bd5880f8-9c29-11b1-9dad-c379636f7270",
    "bd5880f9-9c29-11b1-9dad-c379636f7270", "bd5880fa-9c29-11b1-9dad-c379636f7270",
    "bd5880fb-9c29-11b1-9dad-c379636f7270", "bd5880fe-9c29-11b1-9dad-c379636f7270",
    "bd5880ff-9c29-11b1-9dad-c379636f7270", "bd588100-9c29-11b1-9dad-c379636f7270",
    "bd588101-9c29-11b1-9dad-c379636f7270", "bd588102-9c29-11b1-9dad-c379636f7270",
    "bd588104-9c29-11b1-9dad-c379636f7270", "bd588106-9c29-11b1-9dad-c379636f7270",
    "bd588107-9c29-11b1-9dad-c379636f7270", "bd588109-9c29-11b1-9dad-c379636f7270",
    "bd58810b-9c29-11b1-9dad-c379636f7270", "bd58810e-9c29-11b1-9dad-c379636f7270",
    "bd588111-9c29-11b1-9dad-c379636f7270", "bd588113-9c29-11b1-9dad-c379636f7270",
    "bd588114-9c29-11b1-9dad-c379636f7270", "bd588115-9c29-11b1-9dad-c379636f7270",
    "bd588116-9c29-11b1-9dad-c379636f7270", "bd588117-9c29-11b1-9dad-c379636f7270",
    "bd588118-9c29-11b1-9dad-c379636f7270", "bd58825b-9c29-11b1-9dad-c379636f7270",
    "bd58829b-9c29-11b1-9dad-c379636f7270", "bd588471-9c29-11b1-9dad-c379636f7270",
    "bd588b1d-9c29-11b1-9dad-c379636f7270", "bd58915a-9c29-11b1-9dad-c379636f7270",
    "bd5892ab-9c29-11b1-9dad-c379636f7270", "bd5892af-9c29-11b1-9dad-c379636f7270",
    "bd589408-9c29-11b1-9dad-c379636f7270", "bd589695-9c29-11b1-9dad-c379636f7270",
    "bd5897dd-9c29-11b1-9dad-c379636f7270", "bd589a1d-9c29-11b1-9dad-c379636f7270",
    "bd589d90-9c29-11b1-9dad-c379636f7270", "bd589e12-9c29-11b1-9dad-c379636f7270",
    "bd589ed9-9c29-11b1-9dad-c379636f7270", "bd58a4f1-9c29-11b1-9dad-c379636f7270",
    "bd58a571-9c29-11b1-9dad-c379636f7270", "bd58a644-9c29-11b1-9dad-c379636f7270",
    "bd58af89-9c29-11b1-9dad-c379636f7270", "bd58b833-9c29-11b1-9dad-c379636f7270",
    "bd58b8ba-9c29-11b1-9dad-c379636f7270", "bd58b8c3-9c29-11b1-9dad-c379636f7270",
    "bd58b9f9-9c29-11b1-9dad-c379636f7270", "bd58ba7a-9c29-11b1-9dad-c379636f7270",
    "bd58ba7e-9c29-11b1-9dad-c379636f7270", "bd58bf69-9c29-11b1-9dad-c379636f7270",
    "bd58c0a5-9c29-11b1-9dad-c379636f7270", "bd58c0ef-9c29-11b1-9dad-c379636f7270",
    "bd58c131-9c29-11b1-9dad-c379636f7270", "bd58c170-9c29-11b1-9dad-c379636f7270",
    "bd58c1ad-9c29-11b1-9dad-c379636f7270", "bd58c1f0-9c29-11b1-9dad-c379636f7270",
    "bd58c232-9c29-11b1-9dad-c379636f7270", "bd58c271-9c29-11b1-9dad-c379636f7270",
    "bd58c279-9c29-11b1-9dad-c379636f7270", "bd58c2bd-9c29-11b1-9dad-c379636f7270",
    "bd58c2f7-9c29-11b1-9dad-c379636f7270", "bd58c3fb-9c29-11b1-9dad-c379636f7270",
    "bd58c485-9c29-11b1-9dad-c379636f7270", "bd58c4c6-9c29-11b1-9dad-c379636f7270",
    "bd58c507-9c29-11b1-9dad-c379636f7270", "bd58c916-9c29-11b1-9dad-c379636f7270",
    "bd58ce5e-9c29-11b1-9dad-c379636f7270", "bd58d107-9c29-11b1-9dad-c379636f7270",
    "bd58d211-9c29-11b1-9dad-c379636f7270", "bd58d637-9c29-11b1-9dad-c379636f7270",
    "bd58d679-9c29-11b1-9dad-c379636f7270", "bd58d6ab-9c29-11b1-9dad-c379636f7270",
    "bd58d6b3-9c29-11b1-9dad-c379636f7270", "bd58d6f3-9c29-11b1-9dad-c379636f7270",
    "bd58d7f6-9c29-11b1-9dad-c379636f7270", "bd58da02-9c29-11b1-9dad-c379636f7270",
    "bd58dcda-9c29-11b1-9dad-c379636f7270", "bd58e0e2-9c29-11b1-9dad-c379636f7270",
    "bd58e0ec-9c29-11b1-9dad-c379636f7270", "bd58e124-9c29-11b1-9dad-c379636f7270",
    "bd58e163-9c29-11b1-9dad-c379636f7270", "bd58e1a5-9c29-11b1-9dad-c379636f7270",
    "bd58e1fc-9c29-11b1-9dad-c379636f7270", "bd58e3ba-9c29-11b1-9dad-c379636f7270",
    "bd58e476-9c29-11b1-9dad-c379636f7270", "bd58e5fd-9c29-11b1-9dad-c379636f7270",
    "bd58f042-9c29-11b1-9dad-c379636f7270", "bd58f080-9c29-11b1-9dad-c379636f7270",
    "bd58f7f9-9c29-11b1-9dad-c379636f7270", "bd58f87a-9c29-11b1-9dad-c379636f7270",
    "bd58f8bc-9c29-11b1-9dad-c379636f7270", "bd58f8fe-9c29-11b1-9dad-c379636f7270",
    "bd5900c1-9c29-11b1-9dad-c379636f7270", "bd59083a-9c29-11b1-9dad-c379636f7270",
    "bd59086c-9c29-11b1-9dad-c379636f7270", "bd590951-9c29-11b1-9dad-c379636f7270",
    "bd590c98-9c29-11b1-9dad-c379636f7270", "bd595e7e-9c29-11b1-9dad-c379636f7270",
    "bd5a142d-9c29-11b1-9dad-c379636f7270", "bd5ad700-9c29-11b1-9dad-c379636f7270",
    "bd5b4951-9c29-11b1-9dad-c379636f7270", "bd5b6d60-9c29-11b1-9dad-c379636f7270",
    "bd5b97f9-9c29-11b1-9dad-c379636f7270", "bd5bae9a-9c29-11b1-9dad-c379636f7270",
    "bd5c0498-9c29-11b1-9dad-c379636f7270", "bd5c40b0-9c29-11b1-9dad-c379636f7270",
    "bd5c44e1-9c29-11b1-9dad-c379636f7270", "bd5c548a-9c29-11b1-9dad-c379636f7270",
    "bd5c5e99-9c29-11b1-9dad-c379636f7270", "bd5d0b56-9c29-11b1-9dad-c379636f7270",
    "bd5d7783-9c29-11b1-9dad-c379636f7270", "bd5db814-9c29-11b1-9dad-c379636f7270",
    "bd5dbcd4-9c29-11b1-9dad-c379636f7270", "bd5de44c-9c29-11b1-9dad-c379636f7270",
    "bd5e7a9e-9c29-11b1-9dad-c379636f7270", "bd601781-9c29-11b1-9dad-c379636f7270",
    "bd60a887-9c29-11b1-9dad-c379636f7270", "bd60e145-9c29-11b1-9dad-c379636f7270",
    "bd610a5c-9c29-11b1-9dad-c379636f7270", "bd61886b-9c29-11b1-9dad-c379636f7270",
    "bd61ec34-9c29-11b1-9dad-c379636f7270", "bd63a0ce-9c29-11b1-9dad-c379636f7270",
    "bd63d3ad-9c29-11b1-9dad-c379636f7270", "bd63f343-9c29-11b1-9dad-c379636f7270",
    "bd6422c8-9c29-11b1-9dad-c379636f7270", "bd6449a2-9c29-11b1-9dad-c379636f7270",
    "bd651c1b-9c29-11b1-9dad-c379636f7270", "bd654be7-9c29-11b1-9dad-c379636f7270",
    "bd6561fc-9c29-11b1-9dad-c379636f7270", "bd65cd99-9c29-11b1-9dad-c379636f7270",
    "bd66e0a4-9c29-11b1-9dad-c379636f7270", "bd671c2d-9c29-11b1-9dad-c379636f7270",
    "bd674278-9c29-11b1-9dad-c379636f7270", "bd678812-9c29-11b1-9dad-c379636f7270",
    "bd67e911-9c29-11b1-9dad-c379636f7270", "bd681463-9c29-11b1-9dad-c379636f7270",
    "bd682bdd-9c29-11b1-9dad-c379636f7270", "bd6a2d94-9c29-11b1-9dad-c379636f7270",
    "bd7183b0-9c29-11b1-9dad-c379636f7270", "bd757df1-9c29-11b1-9dad-c379636f7270",
    "bd79c885-9c29-11b1-9dad-c379636f7270", "bd7d5373-9c29-11b1-9dad-c379636f7270",
    "bd84623c-9c29-11b1-9dad-c379636f7270", "bd84dac3-9c29-11b1-9dad-c379636f7270",
    "bd84df32-9c29-11b1-9dad-c379636f7270", "bd8a163e-9c29-11b1-9dad-c379636f7270",
    "bd8dbbc3-9c29-11b1-9dad-c379636f7270", "bd903ed3-9c29-11b1-9dad-c379636f7270",
    "bd913dca-9c29-11b1-9dad-c379636f7270", "bd91b03d-9c29-11b1-9dad-c379636f7270",
    "bd95395a-9c29-11b1-9dad-c379636f7270", "bd9733c2-9c29-11b1-9dad-c379636f7270",
    "bd97e378-9c29-11b1-9dad-c379636f7270", "bd992179-9c29-11b1-9dad-c379636f7270",
    "bda06d71-9c29-11b1-9dad-c379636f7270", "bda09fc2-9c29-11b1-9dad-c379636f7270",
    "bda0e43c-9c29-11b1-9dad-c379636f7270", "bda16220-9c29-11b1-9dad-c379636f7270",
    "bda21728-9c29-11b1-9dad-c379636f7270", "bda887b6-9c29-11b1-9dad-c379636f7270",
    "bdaa4b0e-9c29-11b1-9dad-c379636f7270", "bdadcbf0-9c29-11b1-9dad-c379636f7270",
    "bdb09014-9c29-11b1-9dad-c379636f7270", "bdb0bfbf-9c29-11b1-9dad-c379636f7270",
    "bdb6e7e8-9c29-11b1-9dad-c379636f7270", "bdb7f18f-9c29-11b1-9dad-c379636f7270",
    "bdb8721b-9c29-11b1-9dad-c379636f7270", "bdc36538-9c29-11b1-9dad-c379636f7270",
    "bdc438fd-9c29-11b1-9dad-c379636f7270", "bdc98c81-9c29-11b1-9dad-c379636f7270",
    "bdc9fb94-9c29-11b1-9dad-c379636f7270", "bdca5506-9c29-11b1-9dad-c379636f7270",
    "bdcc8689-9c29-11b1-9dad-c379636f7270", "bdcc9f7c-9c29-11b1-9dad-c379636f7270",
    "bdcd7ea7-9c29-11b1-9dad-c379636f7270", "bdd3d5ea-9c29-11b1-9dad-c379636f7270",
    "bdd50606-9c29-11b1-9dad-c379636f7270", "bdd9d485-9c29-11b1-9dad-c379636f7270",
    "bdda1e3f-9c29-11b1-9dad-c379636f7270", "bddb0a48-9c29-11b1-9dad-c379636f7270",
    "bddd55a1-9c29-11b1-9dad-c379636f7270", "bdde7fe1-9c29-11b1-9dad-c379636f7270",
    "bddef55a-9c29-11b1-9dad-c379636f7270", "bde212ef-9c29-11b1-9dad-c379636f7270",
    "bde38eeb-9c29-11b1-9dad-c379636f7270", "bde495da-9c29-11b1-9dad-c379636f7270",
    "bde5ec9c-9c29-11b1-9dad-c379636f7270", "bde7f9f2-9c29-11b1-9dad-c379636f7270",
    "bde87324-9c29-11b1-9dad-c379636f7270", "bdf02d74-9c29-11b1-9dad-c379636f7270",
    "bdf7cb82-9c29-11b1-9dad-c379636f7270", "bdf8edae-9c29-11b1-9dad-c379636f7270",
    "bdfb7dd0-9c29-11b1-9dad-c379636f7270", "bdfdf4b1-9c29-11b1-9dad-c379636f7270",
    "be00bf6e-9c29-11b1-9dad-c379636f7270", "be01286a-9c29-11b1-9dad-c379636f7270",
    "be0a552b-9c29-11b1-9dad-c379636f7270", "be0bbbb5-9c29-11b1-9dad-c379636f7270",
    "be0d3c4c-9c29-11b1-9dad-c379636f7270", "be144cd1-9c29-11b1-9dad-c379636f7270",
    "be18e693-9c29-11b1-9dad-c379636f7270", "be1ac327-9c29-11b1-9dad-c379636f7270",
    "be1c3220-9c29-11b1-9dad-c379636f7270", "be1d78c8-9c29-11b1-9dad-c379636f7270",
    "be1e5136-9c29-11b1-9dad-c379636f7270", "be1f1654-9c29-11b1-9dad-c379636f7270",
    "be27a8ec-9c29-11b1-9dad-c379636f7270", "be2e0d29-9c29-11b1-9dad-c379636f7270",
    "be2e94bb-9c29-11b1-9dad-c379636f7270", "be2eb4e1-9c29-11b1-9dad-c379636f7270",
    "be31edd4-9c29-11b1-9dad-c379636f7270", "be34dcb7-9c29-11b1-9dad-c379636f7270",
    "be35d1f9-9c29-11b1-9dad-c379636f7270", "be3a8699-9c29-11b1-9dad-c379636f7270",
    "be4425ef-9c29-11b1-9dad-c379636f7270", "be4b53f2-9c29-11b1-9dad-c379636f7270",
    "be4dd7f1-9c29-11b1-9dad-c379636f7270", "be4ef62a-9c29-11b1-9dad-c379636f7270",
    "be59c5cb-9c29-11b1-9dad-c379636f7270", "be5d9e9f-9c29-11b1-9dad-c379636f7270",
    "be659d62-9c29-11b1-9dad-c379636f7270", "be667f85-9c29-11b1-9dad-c379636f7270",
    "be6735cd-9c29-11b1-9dad-c379636f7270", "be717e09-9c29-11b1-9dad-c379636f7270",
    "be7266e4-9c29-11b1-9dad-c379636f7270", "be75c8f9-9c29-11b1-9dad-c379636f7270",
    "be760011-9c29-11b1-9dad-c379636f7270", "be7f041b-9c29-11b1-9dad-c379636f7270",
    "be81b28d-9c29-11b1-9dad-c379636f7270", "be83f745-9c29-11b1-9dad-c379636f7270",
    "be8f47a3-9c29-11b1-9dad-c379636f7270", "be90c21d-9c29-11b1-9dad-c379636f7270",
    "be920bae-9c29-11b1-9dad-c379636f7270", "be92128d-9c29-11b1-9dad-c379636f7270",
    "be9af14f-9c29-11b1-9dad-c379636f7270", "be9be955-9c29-11b1-9dad-c379636f7270",
    "be9e0a7c-9c29-11b1-9dad-c379636f7270", "bea12384-9c29-11b1-9dad-c379636f7270",
    "bea64551-9c29-11b1-9dad-c379636f7270", "beaa3d29-9c29-11b1-9dad-c379636f7270",
    "beaa9284-9c29-11b1-9dad-c379636f7270", "beaad779-9c29-11b1-9dad-c379636f7270",
    "beab79ec-9c29-11b1-9dad-c379636f7270", "beab9388-9c29-11b1-9dad-c379636f7270",
    "bead825d-9c29-11b1-9dad-c379636f7270", "beaed5bd-9c29-11b1-9dad-c379636f7270",
    "beb5aba2-9c29-11b1-9dad-c379636f7270", "beb7f074-9c29-11b1-9dad-c379636f7270",
    "bebd5604-9c29-11b1-9dad-c379636f7270", "bebe2068-9c29-11b1-9dad-c379636f7270",
    "bebece64-9c29-11b1-9dad-c379636f7270", "bec28bcc-9c29-11b1-9dad-c379636f7270",
    "becd79d2-9c29-11b1-9dad-c379636f7270", "bece6da2-9c29-11b1-9dad-c379636f7270",
    "becf783a-9c29-11b1-9dad-c379636f7270", "bed06ab6-9c29-11b1-9dad-c379636f7270",
    "bed22fb8-9c29-11b1-9dad-c379636f7270", "bed50053-9c29-11b1-9dad-c379636f7270",
    "bedc09ec-9c29-11b1-9dad-c379636f7270", "bee22d3d-9c29-11b1-9dad-c379636f7270",
    "bee356be-9c29-11b1-9dad-c379636f7270", "bee52c1c-9c29-11b1-9dad-c379636f7270",
    "bee5923d-9c29-11b1-9dad-c379636f7270", "bee6e76c-9c29-11b1-9dad-c379636f7270",
    "beed06de-9c29-11b1-9dad-c379636f7270", "beee8a4d-9c29-11b1-9dad-c379636f7270",
    "bef7ed88-9c29-11b1-9dad-c379636f7270", "befd1881-9c29-11b1-9dad-c379636f7270",
    "beff1a9a-9c29-11b1-9dad-c379636f7270", "bf05e63f-9c29-11b1-9dad-c379636f7270",
    "bf0a336e-9c29-11b1-9dad-c379636f7270", "bf0f7037-9c29-11b1-9dad-c379636f7270",
    "bf12c7c3-9c29-11b1-9dad-c379636f7270", "bf136680-9c29-11b1-9dad-c379636f7270",
    "bf192b1e-9c29-11b1-9dad-c379636f7270", "bf1b7efc-9c29-11b1-9dad-c379636f7270",
    "bf1d7fe4-9c29-11b1-9dad-c379636f7270", "bf1eedc8-9c29-11b1-9dad-c379636f7270",
    "bf1f951d-9c29-11b1-9dad-c379636f7270", "bf26025d-9c29-11b1-9dad-c379636f7270",
    "bf2a766d-9c29-11b1-9dad-c379636f7270", "bf2b937c-9c29-11b1-9dad-c379636f7270",
    "bf3429c5-9c29-11b1-9dad-c379636f7270", "bf3491c4-9c29-11b1-9dad-c379636f7270",
    "bf364d35-9c29-11b1-9dad-c379636f7270", "bf3a978c-9c29-11b1-9dad-c379636f7270",
    "bf411eed-9c29-11b1-9dad-c379636f7270", "bf476137-9c29-11b1-9dad-c379636f7270",
    "bf4dc2b8-9c29-11b1-9dad-c379636f7270", "bf4fcfa6-9c29-11b1-9dad-c379636f7270",
    "bf4ff31b-9c29-11b1-9dad-c379636f7270", "bf54071c-9c29-11b1-9dad-c379636f7270",
    "bf576a31-9c29-11b1-9dad-c379636f7270", "bf5cb2c0-9c29-11b1-9dad-c379636f7270",
    "bf64a755-9c29-11b1-9dad-c379636f7270", "bf660e73-9c29-11b1-9dad-c379636f7270",
    "bf68e241-9c29-11b1-9dad-c379636f7270", "bf6d1d3a-9c29-11b1-9dad-c379636f7270",
    "bf74bd9c-9c29-11b1-9dad-c379636f7270", "bf761f19-9c29-11b1-9dad-c379636f7270",
    "bf77aa73-9c29-11b1-9dad-c379636f7270", "bf77bef5-9c29-11b1-9dad-c379636f7270",
    "bf7800bf-9c29-11b1-9dad-c379636f7270", "bf7a1c90-9c29-11b1-9dad-c379636f7270",
    "bf83203b-9c29-11b1-9dad-c379636f7270", "bf84f09d-9c29-11b1-9dad-c379636f7270",
    "bf8b47b8-9c29-11b1-9dad-c379636f7270", "bf8bdc58-9c29-11b1-9dad-c379636f7270",
    "bf8c47ad-9c29-11b1-9dad-c379636f7270", "bf8d1cd4-9c29-11b1-9dad-c379636f7270",
    "bf8d3988-9c29-11b1-9dad-c379636f7270", "bf9a6157-9c29-11b1-9dad-c379636f7270",
    "bfa067af-9c29-11b1-9dad-c379636f7270", "bfa4e9d2-9c29-11b1-9dad-c379636f7270",
    "bfa4fe8c-9c29-11b1-9dad-c379636f7270", "bfa699e0-9c29-11b1-9dad-c379636f7270",
    "bfab7ef3-9c29-11b1-9dad-c379636f7270", "bfac572e-9c29-11b1-9dad-c379636f7270",
    "bfad6be8-9c29-11b1-9dad-c379636f7270", "bfaf1b18-9c29-11b1-9dad-c379636f7270",
    "bfb0e3f0-9c29-11b1-9dad-c379636f7270", "bfbf40e9-9c29-11b1-9dad-c379636f7270",
    "bfc913a6-9c29-11b1-9dad-c379636f7270", "bfce95e7-9c29-11b1-9dad-c379636f7270",
    "bfcfa24f-9c29-11b1-9dad-c379636f7270", "bfd0a274-9c29-11b1-9dad-c379636f7270",
    "bfd54197-9c29-11b1-9dad-c379636f7270", "bfd86bf1-9c29-11b1-9dad-c379636f7270",
    "bfda366c-9c29-11b1-9dad-c379636f7270", "bfdb8eef-9c29-11b1-9dad-c379636f7270",
    "bfe0bb3f-9c29-11b1-9dad-c379636f7270", "bfe2070f-9c29-11b1-9dad-c379636f7270",
    "bfe6fd41-9c29-11b1-9dad-c379636f7270", "bfe6fe22-9c29-11b1-9dad-c379636f7270",
    "bfe7d31b-9c29-11b1-9dad-c379636f7270", "bfe9f22d-9c29-11b1-9dad-c379636f7270",
    "bfeb0c83-9c29-11b1-9dad-c379636f7270", "bfeb3d17-9c29-11b1-9dad-c379636f7270",
    "bfedab5d-9c29-11b1-9dad-c379636f7270", "bfefebaf-9c29-11b1-9dad-c379636f7270",
    "bff27115-9c29-11b1-9dad-c379636f7270", "bff3237a-9c29-11b1-9dad-c379636f7270",
    "bff476e8-9c29-11b1-9dad-c379636f7270", "bff82c25-9c29-11b1-9dad-c379636f7270",
    "c000f476-9c29-11b1-9dad-c379636f7270", "c001e2b4-9c29-11b1-9dad-c379636f7270",
    "c0054316-9c29-11b1-9dad-c379636f7270", "c00a42b9-9c29-11b1-9dad-c379636f7270",
    "c00d7a96-9c29-11b1-9dad-c379636f7270", "c010ce47-9c29-11b1-9dad-c379636f7270",
    "c0133726-9c29-11b1-9dad-c379636f7270", "c017ff79-9c29-11b1-9dad-c379636f7270",
    "c01d6e8d-9c29-11b1-9dad-c379636f7270", "c0224da2-9c29-11b1-9dad-c379636f7270",
    "c0279a99-9c29-11b1-9dad-c379636f7270", "c02b14f0-9c29-11b1-9dad-c379636f7270",
    "c03209e1-9c29-11b1-9dad-c379636f7270", "c0328561-9c29-11b1-9dad-c379636f7270",
    "c033ac24-9c29-11b1-9dad-c379636f7270", "c037affb-9c29-11b1-9dad-c379636f7270",
    "c0390e21-9c29-11b1-9dad-c379636f7270", "c03afa6d-9c29-11b1-9dad-c379636f7270",
    "c03b87b7-9c29-11b1-9dad-c379636f7270", "c03d1910-9c29-11b1-9dad-c379636f7270",
    "c03ec3ba-9c29-11b1-9dad-c379636f7270", "c04cad85-9c29-11b1-9dad-c379636f7270",
    "c04da45a-9c29-11b1-9dad-c379636f7270", "c052cf24-9c29-11b1-9dad-c379636f7270",
    "c05813b7-9c29-11b1-9dad-c379636f7270", "c05a7c46-9c29-11b1-9dad-c379636f7270",
    "c05e110e-9c29-11b1-9dad-c379636f7270", "c0604f82-9c29-11b1-9dad-c379636f7270",
    "c06337a2-9c29-11b1-9dad-c379636f7270", "c0659a2b-9c29-11b1-9dad-c379636f7270",
    "c0714577-9c29-11b1-9dad-c379636f7270", "c073820f-9c29-11b1-9dad-c379636f7270",
    "c0739142-9c29-11b1-9dad-c379636f7270", "c076ff6d-9c29-11b1-9dad-c379636f7270",
    "c07a7946-9c29-11b1-9dad-c379636f7270", "c082ab98-9c29-11b1-9dad-c379636f7270",
    "c086cb66-9c29-11b1-9dad-c379636f7270", "c091e184-9c29-11b1-9dad-c379636f7270",
    "c0937fa3-9c29-11b1-9dad-c379636f7270", "c0960de2-9c29-11b1-9dad-c379636f7270",
    "c09a6e2f-9c29-11b1-9dad-c379636f7270", "c09c8637-9c29-11b1-9dad-c379636f7270",
    "c09f6ac3-9c29-11b1-9dad-c379636f7270", "c0a253f0-9c29-11b1-9dad-c379636f7270",
    "c0a383bd-9c29-11b1-9dad-c379636f7270", "c0a63548-9c29-11b1-9dad-c379636f7270",
    "c0a79513-9c29-11b1-9dad-c379636f7270", "c0a7cede-9c29-11b1-9dad-c379636f7270",
    "c0aa7393-9c29-11b1-9dad-c379636f7270", "c0ab9eda-9c29-11b1-9dad-c379636f7270",
    "c0ad3020-9c29-11b1-9dad-c379636f7270", "c0b2bc13-9c29-11b1-9dad-c379636f7270",
    "c0b4578f-9c29-11b1-9dad-c379636f7270", "c0b4950a-9c29-11b1-9dad-c379636f7270",
    "c0b541b6-9c29-11b1-9dad-c379636f7270", "c0ba0c32-9c29-11b1-9dad-c379636f7270",
    "c0bb3413-9c29-11b1-9dad-c379636f7270", "c0bf7a98-9c29-11b1-9dad-c379636f7270",
    "c0c3a8a2-9c29-11b1-9dad-c379636f7270", "c0c6b0d2-9c29-11b1-9dad-c379636f7270",
    "c0cc2458-9c29-11b1-9dad-c379636f7270", "c0cd0537-9c29-11b1-9dad-c379636f7270",
    "c0d211d2-9c29-11b1-9dad-c379636f7270", "c0d674bf-9c29-11b1-9dad-c379636f7270",
    "c0d6eb7b-9c29-11b1-9dad-c379636f7270", "c0e2af4e-9c29-11b1-9dad-c379636f7270",
    "c0e7247c-9c29-11b1-9dad-c379636f7270", "c0e85daa-9c29-11b1-9dad-c379636f7270",
    "c0edda9d-9c29-11b1-9dad-c379636f7270", "c0f012ac-9c29-11b1-9dad-c379636f7270",
    "c0f45a9c-9c29-11b1-9dad-c379636f7270", "c0f527fc-9c29-11b1-9dad-c379636f7270",
    "c0f63e9a-9c29-11b1-9dad-c379636f7270", "c0f93b23-9c29-11b1-9dad-c379636f7270",
    "c0fb9be2-9c29-11b1-9dad-c379636f7270", "c0fdc8ce-9c29-11b1-9dad-c379636f7270",
    "c0ff89be-9c29-11b1-9dad-c379636f7270", "c100289e-9c29-11b1-9dad-c379636f7270",
    "c1052107-9c29-11b1-9dad-c379636f7270", "c10569cb-9c29-11b1-9dad-c379636f7270",
    "c107fffb-9c29-11b1-9dad-c379636f7270", "c10ae4c2-9c29-11b1-9dad-c379636f7270",
    "c10ae7b8-9c29-11b1-9dad-c379636f7270", "c10af5e7-9c29-11b1-9dad-c379636f7270",
    "c10af932-9c29-11b1-9dad-c379636f7270", "c10b559a-9c29-11b1-9dad-c379636f7270",
    "c10c3008-9c29-11b1-9dad-c379636f7270", "c10c4394-9c29-11b1-9dad-c379636f7270",
    "c10c450d-9c29-11b1-9dad-c379636f7270", "c10e5735-9c29-11b1-9dad-c379636f7270",
    "c1164108-9c29-11b1-9dad-c379636f7270", "c1164bb8-9c29-11b1-9dad-c379636f7270",
    "c11bb004-9c29-11b1-9dad-c379636f7270", "c11c43c3-9c29-11b1-9dad-c379636f7270",
    "c12157ff-9c29-11b1-9dad-c379636f7270", "c1227621-9c29-11b1-9dad-c379636f7270",
    "c1237745-9c29-11b1-9dad-c379636f7270", "c128c4f1-9c29-11b1-9dad-c379636f7270",
    "c1299098-9c29-11b1-9dad-c379636f7270", "c129e5bc-9c29-11b1-9dad-c379636f7270",
    "c12bfd14-9c29-11b1-9dad-c379636f7270", "c12ea2ff-9c29-11b1-9dad-c379636f7270",
    "c130750e-9c29-11b1-9dad-c379636f7270", "c13181fd-9c29-11b1-9dad-c379636f7270",
    "c133531a-9c29-11b1-9dad-c379636f7270", "c135299e-9c29-11b1-9dad-c379636f7270",
    "c135fae1-9c29-11b1-9dad-c379636f7270", "c13bc0c4-9c29-11b1-9dad-c379636f7270",
    "c1416e20-9c29-11b1-9dad-c379636f7270", "c14862c2-9c29-11b1-9dad-c379636f7270",
    "f0f39521-8447-11d9-9df2-0002b3a85b0b", "c2eb72a1-13dd-11d8-9e44-0002b3988fc4",
    "a8a40d90-0d87-11d9-9e57-0002b35bb117", "a8a40d91-0d87-11d9-9e57-0002b35bb117",
    "a8a40d92-0d87-11d9-9e57-0002b35bb117", "a8a40d93-0d87-11d9-9e57-0002b35bb117",
    "a8a434a0-0d87-11d9-9e57-0002b35bb117", "a8a434a1-0d87-11d9-9e57-0002b35bb117",
    "a8a434a2-0d87-11d9-9e57-0002b35bb117", "a8a434a3-0d87-11d9-9e57-0002b35bb117",
    "a8a45bb0-0d87-11d9-9e57-0002b35bb117", "f7cf5a39-5224-11d6-9eb9-0002b34c7c9f",
    "892d2401-429b-11d7-9f12-0002b3a8515d", "892d2402-429b-11d7-9f12-0002b3a8515d",
    "11c73ba2-3d83-11d9-9f59-0002b35bb117", "986a6742-4a78-11d7-9f84-00a0c9c6d17e",
    "012ec430-107a-41d7-8201-fd0c6a33c4ae", "06085436-0ea8-41d7-8d78-c5027328b3c1",
    "0cdaac86-0ea9-41d7-9528-b5928f6b2cd6", "0dfc9bcc-108b-41d7-8ed7-edfd33b086ba",
    "0e49646c-0f31-41d7-9fbe-ee5fdcf84034", "122c8d92-1090-41d7-9e88-dccd46c00dee",
    "175dad78-557d-41d7-9305-ede135042ebb", "1a2afc8e-0ea8-41d7-86ad-9f138e1b142c",
    "1a83bf1a-033d-41d8-93a5-af525946d6ea", "1c0aeb26-d0ff-41d7-8df3-e0206d107204",
    "225afc46-0ea9-41d7-86ba-d6e6e606bcf4", "25ac90f0-1091-41d7-8ad2-e217e51d47b0",
    "290b90a8-033d-41d8-90bb-e6187b708fcc", "2eb3d286-1976-41d9-98a2-cd8854d31725",
    "2f961964-0ea8-41d7-9ea1-c9afdcc1aa56", "30a5f4a2-033d-41d8-8a13-caa49537da43",
    "3869b626-108e-41d7-9774-efcd2852455a", "39f93138-0ea9-41d7-9207-fe9aa15a65d3",
    "449c68f2-108a-41d7-85a4-d5be787da5b9", "4777d758-108c-41d7-866a-9ddb21242ea5",
    "48564780-0ea8-41d7-8f74-e07cb4469992", "4dde3f94-4621-41d8-9272-aca7bf883a76",
    "4fe874b8-0ea9-41d7-9a51-cb2aa8ac722d", "51bacf6a-4621-41d8-903f-8618675219cb",
    "523d56a0-1090-41d7-943c-b98ceb989643", "5a1c2052-0ea8-41d7-8354-8a1ca8c753f7",
    "5afd82ae-108d-41d7-877a-efcc1a027076", "5c261c00-0ea7-41d7-826e-cba509274611",
    "5faaf1f8-033d-41d8-9cc3-881c93115d39", "6198deea-121a-41d7-93eb-f77e2835bef0",
    "66a0d466-0ea9-41d7-8f21-ca6c303de0d0", "67ac42e4-033d-41d8-88b4-c5af6346a3c4",
    "6bbde2e0-12aa-41d7-97e2-d2cd8dde2280", "6cbc0e94-0ea7-41d7-8e09-eafe051a334c",
    "6e398450-033d-41d8-8a81-b80d939dc7a9", "6fe23318-0ea8-41d7-9648-9237f96c6632",
    "711dd8ca-108f-41d7-8ed2-b6714c417827", "71304bd0-033d-41d8-815a-9f1758b267de",
    "79fe2070-108b-41d7-8a84-e7fe8ea1df91", "7e0d7e6a-0ea9-41d7-9e9e-a5a533761768",
    "7e37800e-0ea7-41d7-9bd5-8065cb1a6b10", "7ee2de9c-033c-41d8-82f2-f5662a7ecac3",
    "83996144-033d-41d8-9e46-c8e929e84a03", "85413266-033c-41d8-8a3c-853470ebf355",
    "857cb040-0ea8-41d7-8639-c286b90192ba", "8a6b89b8-108e-41d7-8199-f8db46c58932",
    "8b1299ae-033d-41d8-9eb8-c7fc9b1aa271", "8c1989b2-0571-41d8-9fda-a54456cecbe8",
    "8e72d91e-0ea7-41d7-8f52-84ac7fcfa385", "913234d0-033c-41d8-8146-f33e6672d790",
    "93e9b082-0ea9-41d7-9217-e88c867d6e71", "995b3198-033c-41d8-866d-f7bdd1826285",
    "9af4b0d0-0ea8-41d7-88ee-e7da88c593cc", "9b44270a-1088-41d7-89d8-86187f50eac7",
    "9ea97dc4-0ea7-41d7-90cc-b17f20db96b6", "a71e1700-063f-41d7-9841-873d1ddc865a",
    "a9b8812a-1090-41d7-896d-e7aa9f9b941f", "aaaf2180-0ea9-41d7-8c78-f3d77408dd13",
    "ab7bb61a-2d61-41d7-9bd7-c39bf23d2dba", "aee9db98-0ea7-41d7-9387-bf0f0bd01e8b",
    "afd79f32-7125-41d7-81b3-e79de9003a36", "b01f3e4c-107b-41d7-89ac-d853a1ceea45",
    "b043ad1a-0ea8-41d7-8807-e4d7aad88a01", "b2c8b1b4-108f-41d7-9034-dceb94f7996a",
    "b463b9fc-1717-41d9-81f5-946e75d138e6", "b52c8232-8e5b-41d8-8abd-b16baad462a7",
    "b90f05c2-7be6-41d9-95dd-badfd8a6ba18", "b92626d0-94a5-41d9-8fdf-cc8d0e1bd018",
    "bf279d9c-0ea7-41d7-9fa4-d2954dda78a8", "c49488d4-a0de-41d7-8ede-9d605e6c951d",
    "c5b8bff0-0ea8-41d7-9330-a8d75dc13d41", "ced01936-acd6-41d7-80bd-aecc7431901b",
    "cee981ca-121a-41d7-9820-d2140528f40e", "cf645c7c-0ea7-41d7-8a80-ca222ce6bf52",
    "d30396de-108e-41d7-96f2-fb32dc881bce", "d32993c8-108b-41d7-943b-ee67ca30fba9",
    "d469217a-108d-41d7-8ce2-dad58b43f1c2", "d9f441a0-1219-41d7-9457-ebe7ee11dc3f",
    "de649fb0-0ea8-41d7-8ccb-f7a3fcedcd63", "df9f4728-0ea7-41d7-9612-a829907d2bf6",
    "eff743dc-0ea7-41d7-8246-cecc2e49beb0", "f0471674-1090-41d7-9d0f-ef2e9cd9fd4c",
    "f6f092d2-0ea8-41d7-8074-f74b3a1f4f8e"
  };
  
  private final static String[] SORTED_EXAMPLE_GUIDS = {
    "0c5a7576-0f94-11d6-8000-0050dab92c2f", "80605b12-436e-11d6-8000-00a0c9da2002",
    "fe9fcdd0-4370-11d6-8000-00a0c9da2002", "01031bea-4371-11d6-8000-00a0c9da2002",
    "055544a2-4371-11d6-8000-00a0c9da2002", "86c1dc8a-50aa-11d6-8000-00a0c9da2002",
    "d52a7d04-50ab-11d6-8000-00a0c9da2002", "c2444102-5943-11d6-8000-0002b364be7b",
    "c2a37e88-5943-11d6-8000-0002b364be7b", "bf68c010-594e-11d6-8000-0002b364be7b",
    "68330840-5ed1-11d6-8000-0002b364be7b", "8f7d6628-8a1b-11d6-8000-00902794f506",
    "d73532c0-8a1b-11d6-8000-00902794f506", "ee9f744c-8a1c-11d6-8000-00902794f506",
    "f0cee806-8a1c-11d6-8000-00902794f506", "f3b2506c-8a1c-11d6-8000-00902794f506",
    "1efb39f0-8a1d-11d6-8000-00902794f506", "21894e1e-8a1d-11d6-8000-00902794f506",
    "2318a806-8a1d-11d6-8000-00902794f506", "24976690-8a1d-11d6-8000-00902794f506",
    "26ad75a0-8a1d-11d6-8000-00902794f506", "f0bd8878-c427-11d6-8000-00a0c9c6d1c3",
    "4cba0caa-e982-11d9-8000-0002b3a85b8f", "0a0172da-e983-11d9-8000-0002b3a85b8f",
    "a774ee10-e984-11d9-8000-0002b3a85b8f", "ac71e362-8918-11da-8000-0002b3620a69",
    "6d2dfb33-56ce-11d6-8227-0002b34c7c9f", "6d2e2240-56ce-11d6-8227-0002b34c7c9f",
    "dff47935-4da2-11d6-82c0-0002b34c7c9f", "dff47936-4da2-11d6-82c0-0002b34c7c9f",
    "dff47937-4da2-11d6-82c0-0002b34c7c9f", "dff47938-4da2-11d6-82c0-0002b34c7c9f",
    "dff4a041-4da2-11d6-82c0-0002b34c7c9f", "dff4a042-4da2-11d6-82c0-0002b34c7c9f",
    "df8d60c3-eb94-11d6-82ee-0002b34c7c9f", "df8d60c4-eb94-11d6-82ee-0002b34c7c9f",
    "df8d87d0-eb94-11d6-82ee-0002b34c7c9f", "df8d87d2-eb94-11d6-82ee-0002b34c7c9f",
    "df8d87d4-eb94-11d6-82ee-0002b34c7c9f", "e416edc1-758f-11d7-846c-0002b3a85c8d",
    "e416edc2-758f-11d7-846c-0002b3a85c8d", "e416edc3-758f-11d7-846c-0002b3a85c8d",
    "059be375-39b0-11d9-8528-0007e9162f51", "059c0a80-39b0-11d9-8528-0007e9162f51",
    "059c0a82-39b0-11d9-8528-0007e9162f51", "059c0a85-39b0-11d9-8528-0007e9162f51",
    "059c0a87-39b0-11d9-8528-0007e9162f51", "bcb003f3-aac9-11d8-85bd-0002b35bb117",
    "bce8a0b1-8ac9-11d6-864b-0002b364be7b", "ff947d33-963a-11d7-866f-0002b34c7c9f",
    "ff947d34-963a-11d7-866f-0002b34c7c9f", "94f07021-8b0d-11d7-8701-0002b3a8515d",
    "34349377-cb63-11d6-878a-0002b34c7c9f", "834eac32-86a4-11d9-88d7-0002b35bb117",
    "49800302-2475-11d9-88f9-0002b35bb117", "49800303-2475-11d9-88f9-0002b35bb117",
    "49802a10-2475-11d9-88f9-0002b35bb117", "aab60111-ab44-11d8-897d-0002b35bb117",
    "abb96eb5-e798-11d6-8ac9-0002b3a333c3", "fe7e4d83-d86f-11d9-8ba5-0002b3891c1f",
    "8681b272-6c71-11d7-8bb8-0002b3a331d6", "8681b273-6c71-11d7-8bb8-0002b3a331d6",
    "0d6aa652-5866-11d6-8be9-00902794f506", "b9000472-c301-11d9-8d69-0002b3891c29",
    "b9000473-c301-11d9-8d69-0002b3891c29", "ce1e10e1-ec3f-11d6-8d83-0002b34c7c9f",
    "ce1e10e5-ec3f-11d6-8d83-0002b34c7c9f", "ce1e10e6-ec3f-11d6-8d83-0002b34c7c9f",
    "ce1e37f0-ec3f-11d6-8d83-0002b34c7c9f", "badbedd1-1ebc-11d8-8dde-0002b3988fc4",
    "e25a50a1-64dd-11d9-8e37-0002b35bb117", "c8ac46a3-e7a2-11d6-8e5b-0002b34c7c9f",
    "7087d921-0e2c-11d7-8f1a-0002b35bb117", "b8f9e0a4-27d5-11d7-9168-0002b34c7c9f",
    "0ccf9a20-d1a5-11d7-91aa-0002b3a8515d", "a8462735-532a-11d6-9228-0002b34c7c9f",
    "47537942-331d-11d7-922f-0002b3a333c3", "47537943-331d-11d7-922f-0002b3a333c3",
    "46c5b240-c2a6-11d7-92d4-0002b3a333c3", "90ea97a6-a536-11d8-938a-0002b3988fc4",
    "a988bc62-6e2b-11d9-93ac-0002b35bb117", "43806c82-6e4c-11d9-93ac-0007e916336c",
    "43806c83-6e4c-11d9-93ac-0007e916336c", "43806c84-6e4c-11d9-93ac-0007e916336c",
    "43806c85-6e4c-11d9-93ac-0007e916336c", "43806c86-6e4c-11d9-93ac-0007e916336c",
    "43806c87-6e4c-11d9-93ac-0007e916336c", "43809390-6e4c-11d9-93ac-0007e916336c",
    "6dd2e092-b027-11d9-93b3-0002b35bb117", "6dd2e093-b027-11d9-93b3-0002b35bb117",
    "5dcd30b0-4493-11d9-93ca-0002b35bb117", "5dcd30b1-4493-11d9-93ca-0002b35bb117",
    "f5c35092-90c7-11d9-9489-0002b35bb117", "661b7831-ab3d-11d7-956f-0007e90d9be3",
    "661b7832-ab3d-11d7-956f-0007e90d9be3", "661b7833-ab3d-11d7-956f-0007e90d9be3",
    "661b7834-ab3d-11d7-956f-0007e90d9be3", "661b7835-ab3d-11d7-956f-0007e90d9be3",
    "bae22f21-243d-11d8-9840-0002b3988fc4", "0548d243-4342-11d7-9851-0002b34c7c9f",
    "0548f950-4342-11d7-9851-0002b34c7c9f", "189f0aec-a012-11d6-993c-0002b34c7c9f",
    "9e98b4f1-773c-11d7-9996-0002b34c7c9f", "55b05522-f7e2-11da-99f7-0002b3988fc4",
    "a77033a4-fc81-11da-99f8-0002b3988fc4", "33f8cc41-9281-11d9-9ad4-0002b35bb117",
    "68ea1372-2f6a-11d9-9ae0-0002b35bb117", "5f448121-4362-11d7-9b8e-0002b34c7c9f",
    "6837d2e2-8c0e-11d9-9cdd-0002b35bb117", "6837f9f0-8c0e-11d9-9cdd-0002b35bb117",
    "74182065-dce5-11d9-9d50-0007e9162f51", "bd588002-9c29-11b1-9dad-c379636f7270",
    "bd58803c-9c29-11b1-9dad-c379636f7270", "bd58803d-9c29-11b1-9dad-c379636f7270",
    "bd58803e-9c29-11b1-9dad-c379636f7270", "bd588068-9c29-11b1-9dad-c379636f7270",
    "bd58806a-9c29-11b1-9dad-c379636f7270", "bd588098-9c29-11b1-9dad-c379636f7270",
    "bd5880a0-9c29-11b1-9dad-c379636f7270", "bd5880a6-9c29-11b1-9dad-c379636f7270",
    "bd5880a7-9c29-11b1-9dad-c379636f7270", "bd5880aa-9c29-11b1-9dad-c379636f7270",
    "bd5880ab-9c29-11b1-9dad-c379636f7270", "bd5880ac-9c29-11b1-9dad-c379636f7270",
    "bd5880ae-9c29-11b1-9dad-c379636f7270", "bd5880af-9c29-11b1-9dad-c379636f7270",
    "bd5880b2-9c29-11b1-9dad-c379636f7270", "bd5880b9-9c29-11b1-9dad-c379636f7270",
    "bd5880ba-9c29-11b1-9dad-c379636f7270", "bd5880bd-9c29-11b1-9dad-c379636f7270",
    "bd5880c1-9c29-11b1-9dad-c379636f7270", "bd5880c9-9c29-11b1-9dad-c379636f7270",
    "bd5880cc-9c29-11b1-9dad-c379636f7270", "bd5880cd-9c29-11b1-9dad-c379636f7270",
    "bd5880ce-9c29-11b1-9dad-c379636f7270", "bd5880cf-9c29-11b1-9dad-c379636f7270",
    "bd5880d3-9c29-11b1-9dad-c379636f7270", "bd5880d5-9c29-11b1-9dad-c379636f7270",
    "bd5880d6-9c29-11b1-9dad-c379636f7270", "bd5880d8-9c29-11b1-9dad-c379636f7270",
    "bd5880d9-9c29-11b1-9dad-c379636f7270", "bd5880da-9c29-11b1-9dad-c379636f7270",
    "bd5880e0-9c29-11b1-9dad-c379636f7270", "bd5880e2-9c29-11b1-9dad-c379636f7270",
    "bd5880e3-9c29-11b1-9dad-c379636f7270", "bd5880e4-9c29-11b1-9dad-c379636f7270",
    "bd5880e5-9c29-11b1-9dad-c379636f7270", "bd5880eb-9c29-11b1-9dad-c379636f7270",
    "bd5880ed-9c29-11b1-9dad-c379636f7270", "bd5880ee-9c29-11b1-9dad-c379636f7270",
    "bd5880ef-9c29-11b1-9dad-c379636f7270", "bd5880f1-9c29-11b1-9dad-c379636f7270",
    "bd5880f4-9c29-11b1-9dad-c379636f7270", "bd5880f6-9c29-11b1-9dad-c379636f7270",
    "bd5880f7-9c29-11b1-9dad-c379636f7270", "bd5880f8-9c29-11b1-9dad-c379636f7270",
    "bd5880f9-9c29-11b1-9dad-c379636f7270", "bd5880fa-9c29-11b1-9dad-c379636f7270",
    "bd5880fb-9c29-11b1-9dad-c379636f7270", "bd5880fe-9c29-11b1-9dad-c379636f7270",
    "bd5880ff-9c29-11b1-9dad-c379636f7270", "bd588100-9c29-11b1-9dad-c379636f7270",
    "bd588101-9c29-11b1-9dad-c379636f7270", "bd588102-9c29-11b1-9dad-c379636f7270",
    "bd588104-9c29-11b1-9dad-c379636f7270", "bd588106-9c29-11b1-9dad-c379636f7270",
    "bd588107-9c29-11b1-9dad-c379636f7270", "bd588109-9c29-11b1-9dad-c379636f7270",
    "bd58810b-9c29-11b1-9dad-c379636f7270", "bd58810e-9c29-11b1-9dad-c379636f7270",
    "bd588111-9c29-11b1-9dad-c379636f7270", "bd588113-9c29-11b1-9dad-c379636f7270",
    "bd588114-9c29-11b1-9dad-c379636f7270", "bd588115-9c29-11b1-9dad-c379636f7270",
    "bd588116-9c29-11b1-9dad-c379636f7270", "bd588117-9c29-11b1-9dad-c379636f7270",
    "bd588118-9c29-11b1-9dad-c379636f7270", "bd58825b-9c29-11b1-9dad-c379636f7270",
    "bd58829b-9c29-11b1-9dad-c379636f7270", "bd588471-9c29-11b1-9dad-c379636f7270",
    "bd588b1d-9c29-11b1-9dad-c379636f7270", "bd58915a-9c29-11b1-9dad-c379636f7270",
    "bd5892ab-9c29-11b1-9dad-c379636f7270", "bd5892af-9c29-11b1-9dad-c379636f7270",
    "bd589408-9c29-11b1-9dad-c379636f7270", "bd589695-9c29-11b1-9dad-c379636f7270",
    "bd5897dd-9c29-11b1-9dad-c379636f7270", "bd589a1d-9c29-11b1-9dad-c379636f7270",
    "bd589d90-9c29-11b1-9dad-c379636f7270", "bd589e12-9c29-11b1-9dad-c379636f7270",
    "bd589ed9-9c29-11b1-9dad-c379636f7270", "bd58a4f1-9c29-11b1-9dad-c379636f7270",
    "bd58a571-9c29-11b1-9dad-c379636f7270", "bd58a644-9c29-11b1-9dad-c379636f7270",
    "bd58af89-9c29-11b1-9dad-c379636f7270", "bd58b833-9c29-11b1-9dad-c379636f7270",
    "bd58b8ba-9c29-11b1-9dad-c379636f7270", "bd58b8c3-9c29-11b1-9dad-c379636f7270",
    "bd58b9f9-9c29-11b1-9dad-c379636f7270", "bd58ba7a-9c29-11b1-9dad-c379636f7270",
    "bd58ba7e-9c29-11b1-9dad-c379636f7270", "bd58bf69-9c29-11b1-9dad-c379636f7270",
    "bd58c0a5-9c29-11b1-9dad-c379636f7270", "bd58c0ef-9c29-11b1-9dad-c379636f7270",
    "bd58c131-9c29-11b1-9dad-c379636f7270", "bd58c170-9c29-11b1-9dad-c379636f7270",
    "bd58c1ad-9c29-11b1-9dad-c379636f7270", "bd58c1f0-9c29-11b1-9dad-c379636f7270",
    "bd58c232-9c29-11b1-9dad-c379636f7270", "bd58c271-9c29-11b1-9dad-c379636f7270",
    "bd58c279-9c29-11b1-9dad-c379636f7270", "bd58c2bd-9c29-11b1-9dad-c379636f7270",
    "bd58c2f7-9c29-11b1-9dad-c379636f7270", "bd58c3fb-9c29-11b1-9dad-c379636f7270",
    "bd58c485-9c29-11b1-9dad-c379636f7270", "bd58c4c6-9c29-11b1-9dad-c379636f7270",
    "bd58c507-9c29-11b1-9dad-c379636f7270", "bd58c916-9c29-11b1-9dad-c379636f7270",
    "bd58ce5e-9c29-11b1-9dad-c379636f7270", "bd58d107-9c29-11b1-9dad-c379636f7270",
    "bd58d211-9c29-11b1-9dad-c379636f7270", "bd58d637-9c29-11b1-9dad-c379636f7270",
    "bd58d679-9c29-11b1-9dad-c379636f7270", "bd58d6ab-9c29-11b1-9dad-c379636f7270",
    "bd58d6b3-9c29-11b1-9dad-c379636f7270", "bd58d6f3-9c29-11b1-9dad-c379636f7270",
    "bd58d7f6-9c29-11b1-9dad-c379636f7270", "bd58da02-9c29-11b1-9dad-c379636f7270",
    "bd58dcda-9c29-11b1-9dad-c379636f7270", "bd58e0e2-9c29-11b1-9dad-c379636f7270",
    "bd58e0ec-9c29-11b1-9dad-c379636f7270", "bd58e124-9c29-11b1-9dad-c379636f7270",
    "bd58e163-9c29-11b1-9dad-c379636f7270", "bd58e1a5-9c29-11b1-9dad-c379636f7270",
    "bd58e1fc-9c29-11b1-9dad-c379636f7270", "bd58e3ba-9c29-11b1-9dad-c379636f7270",
    "bd58e476-9c29-11b1-9dad-c379636f7270", "bd58e5fd-9c29-11b1-9dad-c379636f7270",
    "bd58f042-9c29-11b1-9dad-c379636f7270", "bd58f080-9c29-11b1-9dad-c379636f7270",
    "bd58f7f9-9c29-11b1-9dad-c379636f7270", "bd58f87a-9c29-11b1-9dad-c379636f7270",
    "bd58f8bc-9c29-11b1-9dad-c379636f7270", "bd58f8fe-9c29-11b1-9dad-c379636f7270",
    "bd5900c1-9c29-11b1-9dad-c379636f7270", "bd59083a-9c29-11b1-9dad-c379636f7270",
    "bd59086c-9c29-11b1-9dad-c379636f7270", "bd590951-9c29-11b1-9dad-c379636f7270",
    "bd590c98-9c29-11b1-9dad-c379636f7270", "bd595e7e-9c29-11b1-9dad-c379636f7270",
    "bd5a142d-9c29-11b1-9dad-c379636f7270", "bd5ad700-9c29-11b1-9dad-c379636f7270",
    "bd5b4951-9c29-11b1-9dad-c379636f7270", "bd5b6d60-9c29-11b1-9dad-c379636f7270",
    "bd5b97f9-9c29-11b1-9dad-c379636f7270", "bd5bae9a-9c29-11b1-9dad-c379636f7270",
    "bd5c0498-9c29-11b1-9dad-c379636f7270", "bd5c40b0-9c29-11b1-9dad-c379636f7270",
    "bd5c44e1-9c29-11b1-9dad-c379636f7270", "bd5c548a-9c29-11b1-9dad-c379636f7270",
    "bd5c5e99-9c29-11b1-9dad-c379636f7270", "bd5d0b56-9c29-11b1-9dad-c379636f7270",
    "bd5d7783-9c29-11b1-9dad-c379636f7270", "bd5db814-9c29-11b1-9dad-c379636f7270",
    "bd5dbcd4-9c29-11b1-9dad-c379636f7270", "bd5de44c-9c29-11b1-9dad-c379636f7270",
    "bd5e7a9e-9c29-11b1-9dad-c379636f7270", "bd601781-9c29-11b1-9dad-c379636f7270",
    "bd60a887-9c29-11b1-9dad-c379636f7270", "bd60e145-9c29-11b1-9dad-c379636f7270",
    "bd610a5c-9c29-11b1-9dad-c379636f7270", "bd61886b-9c29-11b1-9dad-c379636f7270",
    "bd61ec34-9c29-11b1-9dad-c379636f7270", "bd63a0ce-9c29-11b1-9dad-c379636f7270",
    "bd63d3ad-9c29-11b1-9dad-c379636f7270", "bd63f343-9c29-11b1-9dad-c379636f7270",
    "bd6422c8-9c29-11b1-9dad-c379636f7270", "bd6449a2-9c29-11b1-9dad-c379636f7270",
    "bd651c1b-9c29-11b1-9dad-c379636f7270", "bd654be7-9c29-11b1-9dad-c379636f7270",
    "bd6561fc-9c29-11b1-9dad-c379636f7270", "bd65cd99-9c29-11b1-9dad-c379636f7270",
    "bd66e0a4-9c29-11b1-9dad-c379636f7270", "bd671c2d-9c29-11b1-9dad-c379636f7270",
    "bd674278-9c29-11b1-9dad-c379636f7270", "bd678812-9c29-11b1-9dad-c379636f7270",
    "bd67e911-9c29-11b1-9dad-c379636f7270", "bd681463-9c29-11b1-9dad-c379636f7270",
    "bd682bdd-9c29-11b1-9dad-c379636f7270", "bd6a2d94-9c29-11b1-9dad-c379636f7270",
    "bd7183b0-9c29-11b1-9dad-c379636f7270", "bd757df1-9c29-11b1-9dad-c379636f7270",
    "bd79c885-9c29-11b1-9dad-c379636f7270", "bd7d5373-9c29-11b1-9dad-c379636f7270",
    "bd84623c-9c29-11b1-9dad-c379636f7270", "bd84dac3-9c29-11b1-9dad-c379636f7270",
    "bd84df32-9c29-11b1-9dad-c379636f7270", "bd8a163e-9c29-11b1-9dad-c379636f7270",
    "bd8dbbc3-9c29-11b1-9dad-c379636f7270", "bd903ed3-9c29-11b1-9dad-c379636f7270",
    "bd913dca-9c29-11b1-9dad-c379636f7270", "bd91b03d-9c29-11b1-9dad-c379636f7270",
    "bd95395a-9c29-11b1-9dad-c379636f7270", "bd9733c2-9c29-11b1-9dad-c379636f7270",
    "bd97e378-9c29-11b1-9dad-c379636f7270", "bd992179-9c29-11b1-9dad-c379636f7270",
    "bda06d71-9c29-11b1-9dad-c379636f7270", "bda09fc2-9c29-11b1-9dad-c379636f7270",
    "bda0e43c-9c29-11b1-9dad-c379636f7270", "bda16220-9c29-11b1-9dad-c379636f7270",
    "bda21728-9c29-11b1-9dad-c379636f7270", "bda887b6-9c29-11b1-9dad-c379636f7270",
    "bdaa4b0e-9c29-11b1-9dad-c379636f7270", "bdadcbf0-9c29-11b1-9dad-c379636f7270",
    "bdb09014-9c29-11b1-9dad-c379636f7270", "bdb0bfbf-9c29-11b1-9dad-c379636f7270",
    "bdb6e7e8-9c29-11b1-9dad-c379636f7270", "bdb7f18f-9c29-11b1-9dad-c379636f7270",
    "bdb8721b-9c29-11b1-9dad-c379636f7270", "bdc36538-9c29-11b1-9dad-c379636f7270",
    "bdc438fd-9c29-11b1-9dad-c379636f7270", "bdc98c81-9c29-11b1-9dad-c379636f7270",
    "bdc9fb94-9c29-11b1-9dad-c379636f7270", "bdca5506-9c29-11b1-9dad-c379636f7270",
    "bdcc8689-9c29-11b1-9dad-c379636f7270", "bdcc9f7c-9c29-11b1-9dad-c379636f7270",
    "bdcd7ea7-9c29-11b1-9dad-c379636f7270", "bdd3d5ea-9c29-11b1-9dad-c379636f7270",
    "bdd50606-9c29-11b1-9dad-c379636f7270", "bdd9d485-9c29-11b1-9dad-c379636f7270",
    "bdda1e3f-9c29-11b1-9dad-c379636f7270", "bddb0a48-9c29-11b1-9dad-c379636f7270",
    "bddd55a1-9c29-11b1-9dad-c379636f7270", "bdde7fe1-9c29-11b1-9dad-c379636f7270",
    "bddef55a-9c29-11b1-9dad-c379636f7270", "bde212ef-9c29-11b1-9dad-c379636f7270",
    "bde38eeb-9c29-11b1-9dad-c379636f7270", "bde495da-9c29-11b1-9dad-c379636f7270",
    "bde5ec9c-9c29-11b1-9dad-c379636f7270", "bde7f9f2-9c29-11b1-9dad-c379636f7270",
    "bde87324-9c29-11b1-9dad-c379636f7270", "bdf02d74-9c29-11b1-9dad-c379636f7270",
    "bdf7cb82-9c29-11b1-9dad-c379636f7270", "bdf8edae-9c29-11b1-9dad-c379636f7270",
    "bdfb7dd0-9c29-11b1-9dad-c379636f7270", "bdfdf4b1-9c29-11b1-9dad-c379636f7270",
    "be00bf6e-9c29-11b1-9dad-c379636f7270", "be01286a-9c29-11b1-9dad-c379636f7270",
    "be0a552b-9c29-11b1-9dad-c379636f7270", "be0bbbb5-9c29-11b1-9dad-c379636f7270",
    "be0d3c4c-9c29-11b1-9dad-c379636f7270", "be144cd1-9c29-11b1-9dad-c379636f7270",
    "be18e693-9c29-11b1-9dad-c379636f7270", "be1ac327-9c29-11b1-9dad-c379636f7270",
    "be1c3220-9c29-11b1-9dad-c379636f7270", "be1d78c8-9c29-11b1-9dad-c379636f7270",
    "be1e5136-9c29-11b1-9dad-c379636f7270", "be1f1654-9c29-11b1-9dad-c379636f7270",
    "be27a8ec-9c29-11b1-9dad-c379636f7270", "be2e0d29-9c29-11b1-9dad-c379636f7270",
    "be2e94bb-9c29-11b1-9dad-c379636f7270", "be2eb4e1-9c29-11b1-9dad-c379636f7270",
    "be31edd4-9c29-11b1-9dad-c379636f7270", "be34dcb7-9c29-11b1-9dad-c379636f7270",
    "be35d1f9-9c29-11b1-9dad-c379636f7270", "be3a8699-9c29-11b1-9dad-c379636f7270",
    "be4425ef-9c29-11b1-9dad-c379636f7270", "be4b53f2-9c29-11b1-9dad-c379636f7270",
    "be4dd7f1-9c29-11b1-9dad-c379636f7270", "be4ef62a-9c29-11b1-9dad-c379636f7270",
    "be59c5cb-9c29-11b1-9dad-c379636f7270", "be5d9e9f-9c29-11b1-9dad-c379636f7270",
    "be659d62-9c29-11b1-9dad-c379636f7270", "be667f85-9c29-11b1-9dad-c379636f7270",
    "be6735cd-9c29-11b1-9dad-c379636f7270", "be717e09-9c29-11b1-9dad-c379636f7270",
    "be7266e4-9c29-11b1-9dad-c379636f7270", "be75c8f9-9c29-11b1-9dad-c379636f7270",
    "be760011-9c29-11b1-9dad-c379636f7270", "be7f041b-9c29-11b1-9dad-c379636f7270",
    "be81b28d-9c29-11b1-9dad-c379636f7270", "be83f745-9c29-11b1-9dad-c379636f7270",
    "be8f47a3-9c29-11b1-9dad-c379636f7270", "be90c21d-9c29-11b1-9dad-c379636f7270",
    "be920bae-9c29-11b1-9dad-c379636f7270", "be92128d-9c29-11b1-9dad-c379636f7270",
    "be9af14f-9c29-11b1-9dad-c379636f7270", "be9be955-9c29-11b1-9dad-c379636f7270",
    "be9e0a7c-9c29-11b1-9dad-c379636f7270", "bea12384-9c29-11b1-9dad-c379636f7270",
    "bea64551-9c29-11b1-9dad-c379636f7270", "beaa3d29-9c29-11b1-9dad-c379636f7270",
    "beaa9284-9c29-11b1-9dad-c379636f7270", "beaad779-9c29-11b1-9dad-c379636f7270",
    "beab79ec-9c29-11b1-9dad-c379636f7270", "beab9388-9c29-11b1-9dad-c379636f7270",
    "bead825d-9c29-11b1-9dad-c379636f7270", "beaed5bd-9c29-11b1-9dad-c379636f7270",
    "beb5aba2-9c29-11b1-9dad-c379636f7270", "beb7f074-9c29-11b1-9dad-c379636f7270",
    "bebd5604-9c29-11b1-9dad-c379636f7270", "bebe2068-9c29-11b1-9dad-c379636f7270",
    "bebece64-9c29-11b1-9dad-c379636f7270", "bec28bcc-9c29-11b1-9dad-c379636f7270",
    "becd79d2-9c29-11b1-9dad-c379636f7270", "bece6da2-9c29-11b1-9dad-c379636f7270",
    "becf783a-9c29-11b1-9dad-c379636f7270", "bed06ab6-9c29-11b1-9dad-c379636f7270",
    "bed22fb8-9c29-11b1-9dad-c379636f7270", "bed50053-9c29-11b1-9dad-c379636f7270",
    "bedc09ec-9c29-11b1-9dad-c379636f7270", "bee22d3d-9c29-11b1-9dad-c379636f7270",
    "bee356be-9c29-11b1-9dad-c379636f7270", "bee52c1c-9c29-11b1-9dad-c379636f7270",
    "bee5923d-9c29-11b1-9dad-c379636f7270", "bee6e76c-9c29-11b1-9dad-c379636f7270",
    "beed06de-9c29-11b1-9dad-c379636f7270", "beee8a4d-9c29-11b1-9dad-c379636f7270",
    "bef7ed88-9c29-11b1-9dad-c379636f7270", "befd1881-9c29-11b1-9dad-c379636f7270",
    "beff1a9a-9c29-11b1-9dad-c379636f7270", "bf05e63f-9c29-11b1-9dad-c379636f7270",
    "bf0a336e-9c29-11b1-9dad-c379636f7270", "bf0f7037-9c29-11b1-9dad-c379636f7270",
    "bf12c7c3-9c29-11b1-9dad-c379636f7270", "bf136680-9c29-11b1-9dad-c379636f7270",
    "bf192b1e-9c29-11b1-9dad-c379636f7270", "bf1b7efc-9c29-11b1-9dad-c379636f7270",
    "bf1d7fe4-9c29-11b1-9dad-c379636f7270", "bf1eedc8-9c29-11b1-9dad-c379636f7270",
    "bf1f951d-9c29-11b1-9dad-c379636f7270", "bf26025d-9c29-11b1-9dad-c379636f7270",
    "bf2a766d-9c29-11b1-9dad-c379636f7270", "bf2b937c-9c29-11b1-9dad-c379636f7270",
    "bf3429c5-9c29-11b1-9dad-c379636f7270", "bf3491c4-9c29-11b1-9dad-c379636f7270",
    "bf364d35-9c29-11b1-9dad-c379636f7270", "bf3a978c-9c29-11b1-9dad-c379636f7270",
    "bf411eed-9c29-11b1-9dad-c379636f7270", "bf476137-9c29-11b1-9dad-c379636f7270",
    "bf4dc2b8-9c29-11b1-9dad-c379636f7270", "bf4fcfa6-9c29-11b1-9dad-c379636f7270",
    "bf4ff31b-9c29-11b1-9dad-c379636f7270", "bf54071c-9c29-11b1-9dad-c379636f7270",
    "bf576a31-9c29-11b1-9dad-c379636f7270", "bf5cb2c0-9c29-11b1-9dad-c379636f7270",
    "bf64a755-9c29-11b1-9dad-c379636f7270", "bf660e73-9c29-11b1-9dad-c379636f7270",
    "bf68e241-9c29-11b1-9dad-c379636f7270", "bf6d1d3a-9c29-11b1-9dad-c379636f7270",
    "bf74bd9c-9c29-11b1-9dad-c379636f7270", "bf761f19-9c29-11b1-9dad-c379636f7270",
    "bf77aa73-9c29-11b1-9dad-c379636f7270", "bf77bef5-9c29-11b1-9dad-c379636f7270",
    "bf7800bf-9c29-11b1-9dad-c379636f7270", "bf7a1c90-9c29-11b1-9dad-c379636f7270",
    "bf83203b-9c29-11b1-9dad-c379636f7270", "bf84f09d-9c29-11b1-9dad-c379636f7270",
    "bf8b47b8-9c29-11b1-9dad-c379636f7270", "bf8bdc58-9c29-11b1-9dad-c379636f7270",
    "bf8c47ad-9c29-11b1-9dad-c379636f7270", "bf8d1cd4-9c29-11b1-9dad-c379636f7270",
    "bf8d3988-9c29-11b1-9dad-c379636f7270", "bf9a6157-9c29-11b1-9dad-c379636f7270",
    "bfa067af-9c29-11b1-9dad-c379636f7270", "bfa4e9d2-9c29-11b1-9dad-c379636f7270",
    "bfa4fe8c-9c29-11b1-9dad-c379636f7270", "bfa699e0-9c29-11b1-9dad-c379636f7270",
    "bfab7ef3-9c29-11b1-9dad-c379636f7270", "bfac572e-9c29-11b1-9dad-c379636f7270",
    "bfad6be8-9c29-11b1-9dad-c379636f7270", "bfaf1b18-9c29-11b1-9dad-c379636f7270",
    "bfb0e3f0-9c29-11b1-9dad-c379636f7270", "bfbf40e9-9c29-11b1-9dad-c379636f7270",
    "bfc913a6-9c29-11b1-9dad-c379636f7270", "bfce95e7-9c29-11b1-9dad-c379636f7270",
    "bfcfa24f-9c29-11b1-9dad-c379636f7270", "bfd0a274-9c29-11b1-9dad-c379636f7270",
    "bfd54197-9c29-11b1-9dad-c379636f7270", "bfd86bf1-9c29-11b1-9dad-c379636f7270",
    "bfda366c-9c29-11b1-9dad-c379636f7270", "bfdb8eef-9c29-11b1-9dad-c379636f7270",
    "bfe0bb3f-9c29-11b1-9dad-c379636f7270", "bfe2070f-9c29-11b1-9dad-c379636f7270",
    "bfe6fd41-9c29-11b1-9dad-c379636f7270", "bfe6fe22-9c29-11b1-9dad-c379636f7270",
    "bfe7d31b-9c29-11b1-9dad-c379636f7270", "bfe9f22d-9c29-11b1-9dad-c379636f7270",
    "bfeb0c83-9c29-11b1-9dad-c379636f7270", "bfeb3d17-9c29-11b1-9dad-c379636f7270",
    "bfedab5d-9c29-11b1-9dad-c379636f7270", "bfefebaf-9c29-11b1-9dad-c379636f7270",
    "bff27115-9c29-11b1-9dad-c379636f7270", "bff3237a-9c29-11b1-9dad-c379636f7270",
    "bff476e8-9c29-11b1-9dad-c379636f7270", "bff82c25-9c29-11b1-9dad-c379636f7270",
    "c000f476-9c29-11b1-9dad-c379636f7270", "c001e2b4-9c29-11b1-9dad-c379636f7270",
    "c0054316-9c29-11b1-9dad-c379636f7270", "c00a42b9-9c29-11b1-9dad-c379636f7270",
    "c00d7a96-9c29-11b1-9dad-c379636f7270", "c010ce47-9c29-11b1-9dad-c379636f7270",
    "c0133726-9c29-11b1-9dad-c379636f7270", "c017ff79-9c29-11b1-9dad-c379636f7270",
    "c01d6e8d-9c29-11b1-9dad-c379636f7270", "c0224da2-9c29-11b1-9dad-c379636f7270",
    "c0279a99-9c29-11b1-9dad-c379636f7270", "c02b14f0-9c29-11b1-9dad-c379636f7270",
    "c03209e1-9c29-11b1-9dad-c379636f7270", "c0328561-9c29-11b1-9dad-c379636f7270",
    "c033ac24-9c29-11b1-9dad-c379636f7270", "c037affb-9c29-11b1-9dad-c379636f7270",
    "c0390e21-9c29-11b1-9dad-c379636f7270", "c03afa6d-9c29-11b1-9dad-c379636f7270",
    "c03b87b7-9c29-11b1-9dad-c379636f7270", "c03d1910-9c29-11b1-9dad-c379636f7270",
    "c03ec3ba-9c29-11b1-9dad-c379636f7270", "c04cad85-9c29-11b1-9dad-c379636f7270",
    "c04da45a-9c29-11b1-9dad-c379636f7270", "c052cf24-9c29-11b1-9dad-c379636f7270",
    "c05813b7-9c29-11b1-9dad-c379636f7270", "c05a7c46-9c29-11b1-9dad-c379636f7270",
    "c05e110e-9c29-11b1-9dad-c379636f7270", "c0604f82-9c29-11b1-9dad-c379636f7270",
    "c06337a2-9c29-11b1-9dad-c379636f7270", "c0659a2b-9c29-11b1-9dad-c379636f7270",
    "c0714577-9c29-11b1-9dad-c379636f7270", "c073820f-9c29-11b1-9dad-c379636f7270",
    "c0739142-9c29-11b1-9dad-c379636f7270", "c076ff6d-9c29-11b1-9dad-c379636f7270",
    "c07a7946-9c29-11b1-9dad-c379636f7270", "c082ab98-9c29-11b1-9dad-c379636f7270",
    "c086cb66-9c29-11b1-9dad-c379636f7270", "c091e184-9c29-11b1-9dad-c379636f7270",
    "c0937fa3-9c29-11b1-9dad-c379636f7270", "c0960de2-9c29-11b1-9dad-c379636f7270",
    "c09a6e2f-9c29-11b1-9dad-c379636f7270", "c09c8637-9c29-11b1-9dad-c379636f7270",
    "c09f6ac3-9c29-11b1-9dad-c379636f7270", "c0a253f0-9c29-11b1-9dad-c379636f7270",
    "c0a383bd-9c29-11b1-9dad-c379636f7270", "c0a63548-9c29-11b1-9dad-c379636f7270",
    "c0a79513-9c29-11b1-9dad-c379636f7270", "c0a7cede-9c29-11b1-9dad-c379636f7270",
    "c0aa7393-9c29-11b1-9dad-c379636f7270", "c0ab9eda-9c29-11b1-9dad-c379636f7270",
    "c0ad3020-9c29-11b1-9dad-c379636f7270", "c0b2bc13-9c29-11b1-9dad-c379636f7270",
    "c0b4578f-9c29-11b1-9dad-c379636f7270", "c0b4950a-9c29-11b1-9dad-c379636f7270",
    "c0b541b6-9c29-11b1-9dad-c379636f7270", "c0ba0c32-9c29-11b1-9dad-c379636f7270",
    "c0bb3413-9c29-11b1-9dad-c379636f7270", "c0bf7a98-9c29-11b1-9dad-c379636f7270",
    "c0c3a8a2-9c29-11b1-9dad-c379636f7270", "c0c6b0d2-9c29-11b1-9dad-c379636f7270",
    "c0cc2458-9c29-11b1-9dad-c379636f7270", "c0cd0537-9c29-11b1-9dad-c379636f7270",
    "c0d211d2-9c29-11b1-9dad-c379636f7270", "c0d674bf-9c29-11b1-9dad-c379636f7270",
    "c0d6eb7b-9c29-11b1-9dad-c379636f7270", "c0e2af4e-9c29-11b1-9dad-c379636f7270",
    "c0e7247c-9c29-11b1-9dad-c379636f7270", "c0e85daa-9c29-11b1-9dad-c379636f7270",
    "c0edda9d-9c29-11b1-9dad-c379636f7270", "c0f012ac-9c29-11b1-9dad-c379636f7270",
    "c0f45a9c-9c29-11b1-9dad-c379636f7270", "c0f527fc-9c29-11b1-9dad-c379636f7270",
    "c0f63e9a-9c29-11b1-9dad-c379636f7270", "c0f93b23-9c29-11b1-9dad-c379636f7270",
    "c0fb9be2-9c29-11b1-9dad-c379636f7270", "c0fdc8ce-9c29-11b1-9dad-c379636f7270",
    "c0ff89be-9c29-11b1-9dad-c379636f7270", "c100289e-9c29-11b1-9dad-c379636f7270",
    "c1052107-9c29-11b1-9dad-c379636f7270", "c10569cb-9c29-11b1-9dad-c379636f7270",
    "c107fffb-9c29-11b1-9dad-c379636f7270", "c10ae4c2-9c29-11b1-9dad-c379636f7270",
    "c10ae7b8-9c29-11b1-9dad-c379636f7270", "c10af5e7-9c29-11b1-9dad-c379636f7270",
    "c10af932-9c29-11b1-9dad-c379636f7270", "c10b559a-9c29-11b1-9dad-c379636f7270",
    "c10c3008-9c29-11b1-9dad-c379636f7270", "c10c4394-9c29-11b1-9dad-c379636f7270",
    "c10c450d-9c29-11b1-9dad-c379636f7270", "c10e5735-9c29-11b1-9dad-c379636f7270",
    "c1164108-9c29-11b1-9dad-c379636f7270", "c1164bb8-9c29-11b1-9dad-c379636f7270",
    "c11bb004-9c29-11b1-9dad-c379636f7270", "c11c43c3-9c29-11b1-9dad-c379636f7270",
    "c12157ff-9c29-11b1-9dad-c379636f7270", "c1227621-9c29-11b1-9dad-c379636f7270",
    "c1237745-9c29-11b1-9dad-c379636f7270", "c128c4f1-9c29-11b1-9dad-c379636f7270",
    "c1299098-9c29-11b1-9dad-c379636f7270", "c129e5bc-9c29-11b1-9dad-c379636f7270",
    "c12bfd14-9c29-11b1-9dad-c379636f7270", "c12ea2ff-9c29-11b1-9dad-c379636f7270",
    "c130750e-9c29-11b1-9dad-c379636f7270", "c13181fd-9c29-11b1-9dad-c379636f7270",
    "c133531a-9c29-11b1-9dad-c379636f7270", "c135299e-9c29-11b1-9dad-c379636f7270",
    "c135fae1-9c29-11b1-9dad-c379636f7270", "c13bc0c4-9c29-11b1-9dad-c379636f7270",
    "c1416e20-9c29-11b1-9dad-c379636f7270", "c14862c2-9c29-11b1-9dad-c379636f7270",
    "f0f39521-8447-11d9-9df2-0002b3a85b0b", "c2eb72a1-13dd-11d8-9e44-0002b3988fc4",
    "a8a40d90-0d87-11d9-9e57-0002b35bb117", "a8a40d91-0d87-11d9-9e57-0002b35bb117",
    "a8a40d92-0d87-11d9-9e57-0002b35bb117", "a8a40d93-0d87-11d9-9e57-0002b35bb117",
    "a8a434a0-0d87-11d9-9e57-0002b35bb117", "a8a434a1-0d87-11d9-9e57-0002b35bb117",
    "a8a434a2-0d87-11d9-9e57-0002b35bb117", "a8a434a3-0d87-11d9-9e57-0002b35bb117",
    "a8a45bb0-0d87-11d9-9e57-0002b35bb117", "f7cf5a39-5224-11d6-9eb9-0002b34c7c9f",
    "892d2401-429b-11d7-9f12-0002b3a8515d", "892d2402-429b-11d7-9f12-0002b3a8515d",
    "11c73ba2-3d83-11d9-9f59-0002b35bb117", "986a6742-4a78-11d7-9f84-00a0c9c6d17e",
    "012ec430-107a-41d7-8201-fd0c6a33c4ae", "0277e434-330a-4de7-aa84-4e9f78e781ea",
    "04978a8d-e0a9-4eed-b50d-2e66ef9376fc", "059e8eb2-d335-4d78-a877-d77e931f7eeb",
    "06085436-0ea8-41d7-8d78-c5027328b3c1", "062b76cc-f4ad-4b27-8c77-d675dcb26aa2",
    "07c91c9a-d894-44bb-8fca-e70960eaccfe", "092fe1d7-7c89-40cb-8918-f925d3d560f5",
    "0941d72f-826d-488f-acac-da7c38fc0dc7", "0cdaac86-0ea9-41d7-9528-b5928f6b2cd6",
    "0d464614-620c-4b79-b0c3-cbca8d45d60e", "0d839cc3-3461-4bb8-85d7-96e817400d58",
    "0dfc9bcc-108b-41d7-8ed7-edfd33b086ba", "0e49646c-0f31-41d7-9fbe-ee5fdcf84034",
    "0f393dee-d2ff-458c-b2b6-ede8d9ae52ce", "122c8d92-1090-41d7-9e88-dccd46c00dee",
    "172883ad-c2ed-4b62-8a89-a0995bb8048f", "175dad78-557d-41d7-9305-ede135042ebb",
    "1a2afc8e-0ea8-41d7-86ad-9f138e1b142c", "1a83bf1a-033d-41d8-93a5-af525946d6ea",
    "1af62fc9-894e-4971-aff4-4bca9fc56632", "1c0aeb26-d0ff-41d7-8df3-e0206d107204",
    "1ca87a3c-1967-40b3-927e-c557673243f3", "21248340-0de5-4a17-88cc-f19e0f666996",
    "2253cbb9-d217-4c52-b93a-494bfc346e0e", "225afc46-0ea9-41d7-86ba-d6e6e606bcf4",
    "2348325c-a60f-4ed0-bd07-04439cb373a7", "23eb58eb-7a0d-4d75-9045-0c9be4447d24",
    "25ac90f0-1091-41d7-8ad2-e217e51d47b0", "26b7deaf-8e58-4f7e-9995-f1e32ab8c55f",
    "2754d1da-3aec-4987-9927-454b06962be2", "2812e1b3-54db-4df6-b251-d06526deb8eb",
    "290b90a8-033d-41d8-90bb-e6187b708fcc", "2c4a5a2e-e936-45c8-8d04-78065a5128e3",
    "2eb3d286-1976-41d9-98a2-cd8854d31725", "2f961964-0ea8-41d7-9ea1-c9afdcc1aa56",
    "30a5f4a2-033d-41d8-8a13-caa49537da43", "333a887f-20d4-403c-bdde-a03b5a68577e",
    "35a98ed7-3745-4497-81ee-d0bf638a842e", "367094f6-2487-423f-a888-a027ae1d8a4d",
    "36eab934-a932-4cca-9c16-f13a63f99a00", "371090f1-fc5e-45f0-aaa8-01e1fe5e3d80",
    "37e9678b-00cb-4f3b-aa77-f8fd09cd6222", "382d2200-d283-4370-b31e-d4df2d4d65ce",
    "3869b626-108e-41d7-9774-efcd2852455a", "39f93138-0ea9-41d7-9207-fe9aa15a65d3",
    "422dd7fa-1c5e-480f-a3b7-d60c981d5ea6", "4320db29-0823-4159-b329-a5f58e6810a8",
    "4498803c-ea55-4444-bf36-02cb1adc6250", "449c68f2-108a-41d7-85a4-d5be787da5b9",
    "4777d758-108c-41d7-866a-9ddb21242ea5", "477f1308-4e90-4e74-adc0-c056c5e25782",
    "48564780-0ea8-41d7-8f74-e07cb4469992", "4d44b5bc-3448-4a38-9675-e2a3f452b4af",
    "4dde3f94-4621-41d8-9272-aca7bf883a76", "4fc507b8-42f0-40e0-8919-0a3b8429eae6",
    "4fe874b8-0ea9-41d7-9a51-cb2aa8ac722d", "51bacf6a-4621-41d8-903f-8618675219cb",
    "523d56a0-1090-41d7-943c-b98ceb989643", "53194308-b6cc-4e93-b8ce-12b3b4b4b1aa",
    "53972db3-006e-41ca-9572-6bdf76b4c7d6", "58f429c0-1c9b-449a-8ab7-cc62cb634587",
    "5a1c2052-0ea8-41d7-8354-8a1ca8c753f7", "5afd82ae-108d-41d7-877a-efcc1a027076",
    "5bb24907-9d64-4a8c-bed6-87b9618ea47e", "5c261c00-0ea7-41d7-826e-cba509274611",
    "5cbdf225-ebfa-412b-8611-c749af0b4c2e", "5d0d4ab8-c533-4584-9dca-9264393d54e0",
    "5ecb026e-ad01-4496-af4c-2f585b1cfa07", "5faaf1f8-033d-41d8-9cc3-881c93115d39",
    "6198deea-121a-41d7-93eb-f77e2835bef0", "62910136-a858-425b-b37a-1bb8764b133f",
    "631979aa-7373-49b6-b126-d176bef0967d", "66a0d466-0ea9-41d7-8f21-ca6c303de0d0",
    "67ac42e4-033d-41d8-88b4-c5af6346a3c4", "6bbde2e0-12aa-41d7-97e2-d2cd8dde2280",
    "6cbc0e94-0ea7-41d7-8e09-eafe051a334c", "6d24b47c-b9b6-445d-9da8-911214b6132a",
    "6e398450-033d-41d8-8a81-b80d939dc7a9", "6fe23318-0ea8-41d7-9648-9237f96c6632",
    "6fe6162f-196a-4acc-a6a3-920425720e1f", "711dd8ca-108f-41d7-8ed2-b6714c417827",
    "71304bd0-033d-41d8-815a-9f1758b267de", "7553befc-8e84-4446-9676-d8be4b0300b6",
    "7777de9c-92fe-48d3-adb5-f436da53f064", "788b6e89-3a72-4944-aac1-844605169fe8",
    "79fe2070-108b-41d7-8a84-e7fe8ea1df91", "7e0d7e6a-0ea9-41d7-9e9e-a5a533761768",
    "7e37800e-0ea7-41d7-9bd5-8065cb1a6b10", "7e614133-73c5-485e-bea2-4e08d26ab394",
    "7ee2de9c-033c-41d8-82f2-f5662a7ecac3", "7eef2de2-8135-472f-b669-15df6d4cb7c0",
    "7f3f85b6-f4d8-490c-a497-5fcf6562a285", "83996144-033d-41d8-9e46-c8e929e84a03",
    "8413f308-0859-45d2-af74-b2089fc71e1c", "84b3eae9-a269-4376-93de-4179d133db23",
    "85413266-033c-41d8-8a3c-853470ebf355", "857cb040-0ea8-41d7-8639-c286b90192ba",
    "85d21f36-d943-42eb-b909-fb80bca8f6cc", "876d5c30-7bac-4d7f-ae6f-77d0539790b0",
    "878ec520-ea9d-4797-bf9b-9a9fffa077f7", "8929e75c-df35-495a-aad9-aea01638eace",
    "8a6b89b8-108e-41d7-8199-f8db46c58932", "8b1299ae-033d-41d8-9eb8-c7fc9b1aa271",
    "8c1989b2-0571-41d8-9fda-a54456cecbe8", "8c3af009-ceca-4d84-84bd-18218acb90da",
    "8cc255cb-a8b8-4356-b019-64f892739578", "8e72d91e-0ea7-41d7-8f52-84ac7fcfa385",
    "8ec374d2-01f9-49ba-ab44-90f6ce010ec2", "908f1244-4bbf-4813-ab26-2dbe374c8d05",
    "9097b724-2a51-41fd-974a-6c5223201980", "913234d0-033c-41d8-8146-f33e6672d790",
    "93c75820-1c21-43c9-9087-07a8511c10be", "93e9b082-0ea9-41d7-9217-e88c867d6e71",
    "9530d00c-318d-4234-95e9-8481379ad6be", "96d556b5-5470-4d98-9111-6614afd490b1",
    "995b3198-033c-41d8-866d-f7bdd1826285", "99e0ba72-e90d-4825-a03a-b8bd2311895d",
    "9aa24f40-bd05-468f-a8a2-2e9828d91553", "9af4b0d0-0ea8-41d7-88ee-e7da88c593cc",
    "9b44270a-1088-41d7-89d8-86187f50eac7", "9e252497-a613-4c12-ac51-045093fa7be8",
    "9ea97dc4-0ea7-41d7-90cc-b17f20db96b6", "9ec6bab5-8977-4e67-9933-ec276fa3b912",
    "9f5e81a9-d16c-45b1-a595-4aa76a7ddc92", "a1f20f2b-2d0f-4e7c-b65c-23083b6be83a",
    "a71e1700-063f-41d7-9841-873d1ddc865a", "a9b8812a-1090-41d7-896d-e7aa9f9b941f",
    "aaaf2180-0ea9-41d7-8c78-f3d77408dd13", "ab7bb61a-2d61-41d7-9bd7-c39bf23d2dba",
    "ac2cdc17-7191-4757-9652-ba35913394cc", "ac4dcf46-3080-407a-9547-6617b7640847",
    "adc80310-3c89-422c-aa18-1d451da1d5b2", "ae83ebf4-88dd-4d63-9b2f-1f2c31f9e635",
    "aee9db98-0ea7-41d7-9387-bf0f0bd01e8b", "afd79f32-7125-41d7-81b3-e79de9003a36",
    "b01f3e4c-107b-41d7-89ac-d853a1ceea45", "b043ad1a-0ea8-41d7-8807-e4d7aad88a01",
    "b1522157-5b58-4a2b-8458-026a7969a1dd", "b2c8b1b4-108f-41d7-9034-dceb94f7996a",
    "b463b9fc-1717-41d9-81f5-946e75d138e6", "b47afb99-4fe8-4d4c-b711-f35b49741339",
    "b52c8232-8e5b-41d8-8abd-b16baad462a7", "b8d9b2e7-d812-447a-8c48-3086ac80967b",
    "b90f05c2-7be6-41d9-95dd-badfd8a6ba18", "b92626d0-94a5-41d9-8fdf-cc8d0e1bd018",
    "baa29823-fd4f-43f1-9f8c-b5647fbc95a4", "bad5f87f-8b5e-40ae-8bc9-0958c87c8c7d",
    "bc256674-5c36-45bb-a7da-898f2ee87db4", "bee2066d-25f0-4d3a-b707-307b1341e0ba",
    "bf279d9c-0ea7-41d7-9fa4-d2954dda78a8", "c2e3016c-1c7c-46b7-bffd-c7f8ed7624ec",
    "c49488d4-a0de-41d7-8ede-9d605e6c951d", "c5b8bff0-0ea8-41d7-9330-a8d75dc13d41",
    "c69d8b08-faa6-4eac-8fdd-2b1ab0012255", "c749d6e2-3e5b-4846-b428-a7e1f65f8a3f",
    "ca7ed331-f6b2-43c4-afa9-d51e518ebec1", "ced01936-acd6-41d7-80bd-aecc7431901b",
    "cee981ca-121a-41d7-9820-d2140528f40e", "cf645c7c-0ea7-41d7-8a80-ca222ce6bf52",
    "d30396de-108e-41d7-96f2-fb32dc881bce", "d30a1824-6a25-4a64-85b0-6e2dfca89e99",
    "d32993c8-108b-41d7-943b-ee67ca30fba9", "d469217a-108d-41d7-8ce2-dad58b43f1c2",
    "d575a733-4b4d-4088-bad7-7bbffa1f2767", "d5e6a812-dd37-4742-bfba-abdc2b75d19a",
    "d9f441a0-1219-41d7-9457-ebe7ee11dc3f", "dde7403f-0cb4-4db9-ab72-3499df86ced2",
    "de649fb0-0ea8-41d7-8ccb-f7a3fcedcd63", "df9f4728-0ea7-41d7-9612-a829907d2bf6",
    "e5381873-d36c-4087-b6fe-d6d6addf9c93", "e5b5ce22-69d9-434c-aec5-a5cb6477d96a",
    "e92fe9a5-ccc7-4696-b9d2-ae4a7676d2e1", "ec7cce42-9fd2-4598-b9f4-c3b21a7f9cb8",
    "ef046bd7-662d-4374-baaf-450aa42206ed", "eff743dc-0ea7-41d7-8246-cecc2e49beb0",
    "f0471674-1090-41d7-9d0f-ef2e9cd9fd4c", "f0bb13c3-3ff7-444f-865e-18a2f5fda3e8",
    "f3e77863-3fcd-4670-9c3a-96ca01a07327", "f4f1d907-d7dc-4b2e-8efb-857c4bb121cb",
    "f6f092d2-0ea8-41d7-8074-f74b3a1f4f8e", "f7921203-431d-4ab3-9d78-b3e9026e9e66",
    "fa4ab24c-2901-41ee-bdc7-c6610cc0f4d6"
  };
  
  public static void testStringStreams() {
    testEvalOfType("(csetq *test-string-output-stream1* (make-string-output-stream))", SubLStream.class);
    readAndEval("(write-string \"Testing...\" *test-string-output-stream1*)");
    readAndEval("(write-char #\\1 *test-string-output-stream1*)");
    testEvalEquals("\"Testing...1\"", "(get-output-stream-string *test-string-output-stream1*)");
    readAndEval("(write-string \"    Testing...\" *test-string-output-stream1* 4 11)");
    testEvalEquals("\"Testing\"", "(get-output-stream-string *test-string-output-stream1*)");
    
  }
  
  
  public static void testTimeMethods() {
    {
      // basic time testing
      testEvalEquals("T","(numberp (get-universal-time))");
    }
    // time of the landing of the moon: July 20, 1969 4:17:42 p.m EDT
    // (decode-universal-time (encode-universal-time 42 17 16 20 7 1969 5) 5)
    {
      shouldPrintTests("Checking whether we can encode the time of the moon landing ....");
      // universal time en- and decoding
      final SubLObject second = SubLObjectFactory.makeInteger(42);
      final SubLObject minute = SubLObjectFactory.makeInteger(17);
      final SubLObject hour = SubLObjectFactory.makeInteger(16);
      final SubLObject day = SubLObjectFactory.makeInteger(20);
      final SubLObject month = SubLObjectFactory.makeInteger(7);
      final SubLObject year = SubLObjectFactory.makeInteger(1969);
      final SubLObject timezone = SubLObjectFactory.makeInteger(5);
      final SubLNumber universalTime = SubLObjectFactory.makeInteger(2194809462L);
      testEvalEquals(universalTime.toString(),"(encode-universal-time " + second + " " + minute + " "
        + hour + " " + day + " " + month + " " + year + " " + timezone + ")");
      
      SubLObject[] values = { second, minute, hour, day, month, year};
      checkDecodeUniversalTime( universalTime, values, timezone);
    }
    // testing the accuracy of the universal time
    {
      final SubLNumber currentUniversalTime = readAndEval("(get-universal-time)").toNumber();
      final Calendar calendar = Calendar.getInstance();
      SubLObject[] values = { null, // we dont want to be second accurate
      SubLObjectFactory.makeInteger(calendar.get(Calendar.MINUTE)),
      SubLObjectFactory.makeInteger(calendar.get(Calendar.HOUR_OF_DAY)),
      SubLObjectFactory.makeInteger(calendar.get(Calendar.DAY_OF_MONTH)),
      SubLObjectFactory.makeInteger(calendar.get(Calendar.MONTH) + 1), // months are zero-based ???
      SubLObjectFactory.makeInteger(calendar.get(Calendar.YEAR))
      };
      final SubLObject timezone = UNPROVIDED;
      checkDecodeUniversalTime(currentUniversalTime, values, timezone);
    }
  }
  
  static private void checkDecodeUniversalTime(SubLNumber universalTime, SubLObject[] values,
    SubLObject timezone) {
    shouldPrintTests("Checking whether we can decode universal time " + universalTime + " ....");
    String[] vars = { "second","minute","hour","day","month", "year" };
    for (int i = 0; i < vars.length; i++) {
      if (values[i] == null) {
        shouldPrintTests("Skipping " + vars[i] + " in test ....");
      } else {
        testEvalEquals("T", "(cmultiple-value-bind (second minute hour day month year) "
          + "(decode-universal-time " + universalTime + " "
          + (timezone == UNPROVIDED ? "" : timezone.toString()) + ") "
          + "(= " + vars[i] + " " + values[i] + "))");
      }
    }
  }
  
  public static void testPolymorphic() {
    /* commented out since the cfasl and dictionaries are not part of SubL kernel
    shouldPrintTests("Testing polymorphic function infrastructure ....");
    // this requires CycL to be present to suceeed
    readAndEval("(cfasl-encode-externalized 212)");
    
    // printer tests
    // requires CycL to be defined
    shouldPrintTests("Whether structures toString() method uses print ....");
    final SubLObject dictionary = readAndEval("(new-dictionary)");
    final String dictAsString = dictionary.toString();
    Assert.assertEquals("The toString() method returned " + dictAsString + " but not something reasonable",
      true, dictAsString.indexOf("DICTIONARY") != -1);
     */
  }
  
  public static void testFunctions() {
    // FUNCALL
    testEvalEquals("6", "(funcall #'+ 1 2 3)");
    testEvalEquals("1", "(funcall 'car '(1 2 3))");
    testEvalEquals("4", "(funcall 'position 1 '(1 2 3 2 1) #'EQL #'IDENTITY 1)");
    testEvalError("(funcall 'null 'x 'y)");
    // APPLY
    testEvalEquals("'+", "(csetq f '+)");
    testEvalEquals("3", "(apply f '(1 2))");
    testEvalEquals("#'-", "(csetq f #'-)");
    testEvalEquals("-1", "(apply f '(1 2))");
    testEvalEquals("630", "(apply #'* 3 5 '(2 7 3))");
    testEvalEquals("'((+ 2 3) . 4)", "(apply 'cons '((+ 2 3) 4))");
    testEvalEquals("0", "(apply #'+ '())");
    readAndEval("(define my-copy-tree (tree) " +
      "             (ret (fif (atom tree) " +
      "                        tree " +
      "                        (cons (my-copy-tree (first tree)) " +
      "                           (my-copy-tree (rest tree))))))");
    testEvalEquals("'(1 (2 (3)))", "(apply #'my-copy-tree '((1 (2 (3)))))");
  }
  
  public static void testSxhash() {
    // sxhash of lists
    testEvalOfType("(sxhash '(a b c))", SubLFixnum.class);
    testEvalEquals("T", "(equalp '(a b c) '(a b c))");
    testEvalEquals("NIL", "(equalp '(a b c) '(a b d))");
    testEvalEquals("(sxhash '(a b c))", "(sxhash '(a b c))");
    testEvalNotEquals("(sxhash '(a b c))", "(sxhash '(a b d))"); //should have a high prob of not being equal
    // sxhash of vectors
    testEvalOfType("(sxhash #(a b c))", SubLFixnum.class);
    testEvalEquals("T", "(equalp #(a b c) #(a b c))");
    testEvalEquals("NIL", "(equalp #(a b c) #(a b d))");
    testEvalEquals("(sxhash #(a b c))", "(sxhash #(a b c))");
    testEvalNotEquals("(sxhash #(a b c))", "(sxhash #(a b d))"); //should have a high prob of not being equal
    // sxhash of strings
    testEvalOfType("(sxhash \"blah\")", SubLFixnum.class);
    testEvalEquals("T", "(equalp \"blah\" \"blah\")");
    testEvalEquals("NIL", "(equalp \"blah\" \"blat\")");
    testEvalEquals("(sxhash \"blah\")", "(sxhash \"blah\")");
    testEvalEquals("(sxhash \"blah\")", "(sxhash \"BLAH\")");
    testEvalNotEquals("(sxhash \"blah\")", "(sxhash \"blaa\")"); //should have a high prob of not being equal
    // sxhash of symbols
    testEvalOfType("(sxhash 'a)", SubLFixnum.class);
    testEvalEquals("T", "(equalp 'a 'a)");
    testEvalEquals("NIL", "(equalp 'a 'b)");
    testEvalEquals("(sxhash 'a)", "(sxhash 'a)");
    testEvalNotEquals("(sxhash 'a)", "(sxhash 'b)"); //should have a high prob of not being equal
    // sxhash of fixnum
    testEvalOfType("(sxhash 1)", SubLFixnum.class);
    testEvalEquals("T", "(equalp 1 1)");
    testEvalEquals("NIL", "(equalp 1 2)");
    testEvalEquals("(sxhash 1)", "(sxhash 1)");
    testEvalNotEquals("(sxhash 1)", "(sxhash 2)"); //should have a high prob of not being equal
    // sxhash of floating point
    testEvalOfType("(sxhash 1.0)", SubLFixnum.class);
    testEvalEquals("T", "(equalp 1.0 1.0)");
    testEvalEquals("NIL", "(equalp 1.0 2.0)");
    testEvalEquals("(sxhash 1.0)", "(sxhash 1.0)");
    testEvalNotEquals("(sxhash 1.0)", "(sxhash 2.0)"); //should have a high prob of not being equal
    // sxhash of character
    testEvalOfType("(sxhash #\\a)", SubLFixnum.class);
    testEvalEquals("T", "(equalp #\\a #\\a)");
    testEvalEquals("NIL", "(equalp #\\a #\\b)");
    testEvalEquals("(sxhash #\\a)", "(sxhash #\\a)");
    testEvalNotEquals("(sxhash #\\a)", "(sxhash #\\b)"); //should have a high prob of not being equal
    // sxhash of bignum-integer
    testEvalOfType("(sxhash 1000000000)", SubLFixnum.class);
    testEvalEquals("T", "(equalp 1000000000 1000000000)");
    testEvalEquals("NIL", "(equalp 1000000000 1000000001)");
    testEvalEquals("(sxhash 1000000000)", "(sxhash 1000000000)");
    testEvalNotEquals("(sxhash 1000000000)", "(sxhash 1000000001)"); //should have a high prob of not being equal
    // sxhash of bignum-long
    long val =  (long)(Long.MAX_VALUE / 20);
    long val2 =  (long)(Long.MAX_VALUE / 20) + 1;
    testEvalOfType("" + val, SubLLongBignum.class);
    testEvalOfType("(sxhash " + val + ")", SubLFixnum.class);
    testEvalEquals("T", "(equalp " + val + " " + val + ")");
    testEvalEquals("NIL", "(equalp " + val + " " + val2 + ")");
    testEvalEquals("(sxhash " + val + ")", "(sxhash " + val + ")");
    testEvalNotEquals("(sxhash " + val + ")", "(sxhash " + val2 + ")"); //should have a high prob of not being equal
    // sxhash of bignum-BigInteger
    testEvalOfType("(sxhash 9999999999999999999999999999999999999999999999999999)", SubLFixnum.class);
    testEvalEquals("T", "(equalp 9999999999999999999999999999999999999999999999999999 9999999999999999999999999999999999999999999999999999)");
    testEvalEquals("NIL", "(equalp 9999999999999999999999999999999999999999999999999999 9999999999999999999999999999999999999999999999999998)");
    testEvalEquals("(sxhash 9999999999999999999999999999999999999999999999999999)", "(sxhash 9999999999999999999999999999999999999999999999999999)");
    testEvalNotEquals("(sxhash 9999999999999999999999999999999999999999999999999999)", "(sxhash 9999999999999999999999999999999999999999999999999998)"); //should have a high prob of not being equal
    // sxhash of guid
    testEvalOfType("(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))", SubLFixnum.class);
    testEvalEquals("T", "(equalp (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\") (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))");
    testEvalEquals("NIL", "(equalp (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\") (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7271\"))");
    testEvalEquals("(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))", "(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))");
    testEvalNotEquals("(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))", "(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7271\"))"); //should have a high prob of not being equal
    // sxhash of structure -- missing implemenation for CDO
    //readAndEval("(defstruct (hundred-acre-woods) poohbear piglet eeyore)");
    //testEvalEquals("0", "(sxhash (make-hundred-acre-woods))");
    shouldPrintTests("Testing SXHASH on CycL objects ... will error if CycL not loaded.");
    /** @todo these tests inappropriately test code outside of the SubL kernel
    testEvalEquals("T","(fboundp 'cache-p)");
    testEvalEquals("0", "(sxhash (new-cache 1))");
    */
    // sxhash of locks
    testEvalOfType("(sxhash 'a)", SubLFixnum.class);
    testEvalEquals("T", "(clet ((a (make-lock \"a\"))) (equalp a a))");
    testEvalEquals("NIL", "(clet ((a (make-lock \"a1\")) (b (make-lock \"b1\"))) (equalp a b))");
    testEvalEquals("T", "(clet ((a (make-lock \"a2\"))) (equalp (sxhash a) (sxhash a)))");
    testEvalEquals("NIL", "(clet ((a (make-lock \"a3\")) (b (make-lock \"b3\"))) (equalp (sxhash a) (sxhash b)))");
  }
  
  
  public static void testPrinterControlVars() {
    SubLObject origPrintLenth = SubLObjectFactory.makeSublispSymbol("*PRINT-LENGTH*").getValue();
    SubLObject origPrintDepth = SubLObjectFactory.makeSublispSymbol("*PRINT-LEVEL*").getValue();
    try {
      SubLObjectFactory.makeSublispSymbol("*PRINT-LENGTH*").setValue(EIGHT_INTEGER);
      SubLObjectFactory.makeSublispSymbol("*PRINT-LEVEL*").setValue(EIGHT_INTEGER);
      shouldPrintTests("Testing the printer control vars on lists ....");
      SubLObject list = readAndEval("'(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)");
      String representation = list.toString();
      Assert.assertEquals( "There are no elipses in the terribly long list.",
        true, (representation.indexOf("...") != -1));
      shouldPrintTests("Truncating via *PRINT-LENGTH* results in " + representation);
      list = readAndEval("'(1 (2 (3 (4 (5 (6 (7 (8 (9 (10 (11 (12 0 1 2 3))))))))))))");
      representation = list.toString();
      Assert.assertEquals( "There are no omission-marks in the terribly deep list.",
        true, (representation.indexOf("#") != -1));
      shouldPrintTests("Truncating via *PRINT-LEVEL* results in " + representation);
      // vectors
      shouldPrintTests("Testing the printer control vars on vectors ....");
      SubLObject vector = readAndEval("'#(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)");
      representation = vector.toString();
      Assert.assertEquals( "There are no elipses in the terribly long vector.",
        true, (representation.indexOf("...") != -1));
      shouldPrintTests("Truncating via *PRINT-LENGTH* results in " + representation);
      vector = readAndEval("'#(1 #(2 #(3 #(4 #(5 #(6 #(7 #(8 #(9 #(10 #(11 #(12 0 1 2 3))))))))))))");
      representation = vector.toString();
      Assert.assertEquals( "There are no omission-marks in the terribly deep vector.",
        true, (representation.indexOf(" # ") != -1));
      shouldPrintTests("Truncating via *PRINT-LEVEL* results in " + representation);
    } finally {
      SubLObjectFactory.makeSublispSymbol("*PRINT-LENGTH*").setValue(origPrintLenth);
      SubLObjectFactory.makeSublispSymbol("*PRINT-LEVEL*").setValue(origPrintDepth);
    }
  }
  
  public static void testAppend() {
    testEvalEquals("'(A B C D E F G)", "(append '(a b c) '(d e f) '() '(g))");
    testEvalEquals("'(A B C D E F G)", "(append '(a b c) nil nil '(d e f) '() '(g))");
    testEvalEquals("'(A B C D E F G)", "(append nil nil nil '(a b c) nil nil '(d e f) '() '(g))");
    testEvalEquals("'(A B C D E F G)", "(append nil nil nil '(a b c) nil nil '(d e f) '() '(g) nil nil nil)");
    testEvalEquals("'(A B C . D)", "(append '(a b c) 'd)");
    testEvalEquals("'(1 A . B)", "(append '(1 . 2) '(a . b))");
    testEvalEquals("'a", "(append nil 'a)");
    testEvalEquals("'(a)", "(append '(a . b) nil)");
    testEvalEquals("'(a)", "(append nil '(a) nil)");
    testEvalEquals("NIL", "(append)");
    testEvalEquals("'a", "(append 'a)");
    testEvalEquals("'(A B C D E F G)", "(append (cdr '(1 a b c)) (cdr '(1 d e f)) '() '(g))");
    testEvalEquals("'(A B C . D)", "(append (cdr '(1 a b c)) 'd)");
    testEvalEquals("nil", "(append nil nil nil)");
  }
  
  public static void testWithErrorHandler() {
    /* commented out, not part of the SubL kernel
    testEvalError("(error \"foo : ~S\" 212)");
    testEvalEquals("NIL", "(ignore-errors (error \"foo : ~S\" 212))");
    testEvalEquals("\"foo : 212\"", "(clet (m) (catch-error-message (m) (error \"foo : ~S\" 212)) m)");
    */
  }
  
  public static void testCyclops() {
    //testEvalOfType("(core-kb-initialization 707)", SubLObject.class);
    //testEvalOfType("(find-or-create-constant \"AbsoluteValueFn\" (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))", SubLObject.class);
    //function_caching_macros.caching_mode_disable(UNPROVIDED);
    //misc_utilities.system_code_initializations();
    //testEvalOfType("(load \"/cyc/top/init/cyc-init.lisp\")", SubLObject.class);
    //testEvalOfType("(load-core-kb \"/cyc/top/units/latest/core-kb.lisp\")", SubLObject.class);
    testEvalOfType("(load-core-kb \"/scratch/core-kb.lisp\")", SubLObject.class);
    //misc_utilities.system_code_initializations();
    testEvalOfType("(benchmark-cyclops-compensating-for-paging)", SubLObject.class);
  }
  
  public static void testCycLSets() {
    /* these tests do not belong here...sets are not part of the SubL kernel
    shouldPrintTests("Testing whether CycL sets work ... if CycL is not defined, the test will error!");
    final String[] dataItems = EXAMPLE_NON_CORE_GUIDS;
    testEvalEquals("T","(FBOUNDP 'SET-MEMBER?)");
    readAndEval("(csetq *rck-set* (new-set #'eq))");
    testEvalEquals("T","(set-p *rck-set*)");
    shouldPrintTests("Testing whether we can prepare the population vector ....");
    readAndEval("(csetq *rck-items* (make-vector " + dataItems.length + "))");
    testEvalEquals("T","(vectorp *rck-items*)");
    for (int i = 0; i < dataItems.length; i++) {
      readAndEval("(set-aref *rck-items* " + i + " \"" + dataItems[i] +"\")");
      testEvalEquals("T","(stringp (aref *rck-items* " + i + "))");
    }
    shouldPrintTests("Testing whether the CycL can find elements again as we expand the set ....");
    final boolean testExhaustively = false;
    for (int limit = 0; limit < dataItems.length; limit++) {
      readAndEval("(set-add (aref *rck-items* " + limit + ") *rck-set*)");
      if (testExhaustively) {
        for (int i = 0; i <= limit; i++) {
          testEvalEquals( "T", "(set-member? (aref *rck-items* " + i + ") *rck-set*)");
        }
      } else {
        testEvalEquals( "T", "(set-member? (aref *rck-items* " + limit + ") *rck-set*)");
      }
    }
    */
  }
  
  public static void testCycLListComparison() {
    shouldPrintTests("Testing whether CycL list comparisons work ... if CycL is not defined, these tests will error");
    /* not part of SubL kernel
     testEvalEquals("T","(FBOUNDP 'lists-of-binding-lists-equal?)");
     */
    
    testEvalEquals("'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt)))",
      "(intersection "
      + "'(((?MT . :universal-vocabulary-mt)) ((?MT . :base-kb))) "
      + "'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt))) #'equal #'identity)");
    
    /* not part of SubL kernel
    testEvalEquals("'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt)))",
      "(fast-intersection "
      + "'(((?MT . :universal-vocabulary-mt)) ((?MT . :base-kb))) "
      + "'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt))) #'equal)");
    
    testEvalEquals("T", "(lists-of-binding-lists-equal? "
      + "'(((?MT . :universal-vocabulary-mt)) ((?MT . :base-kb))) "
      + "'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt))))");
     */
  }
  
  public static void testDefineCachedFunctions() {
    /* commented out since not part of the SubL kernel
    shouldPrintTests("Testing whether DEFINE-CACHED-NEW works ... if CycL is not defined, the test will error!");
    testEvalEquals("T","(cnot (null (fboundp 'define-cached-new)))");
    readAndEval("(define-cached-new my-cached-function ( pos-int) "
      +" (:test 'eql :capacity 200) "
      + " (ret (make-list pos-int pos-int)))");
    for (int i = 1; i < 10; i++) {
      SubLObject result = readAndEval("(make-list " + i + " " + i + ")");
      // cause it to be cached
      testEvalEqualsObj(result, "(my-cached-function " + i + ")");
      // cause it to be looked up from the cache
      testEvalEqualsObj(result, "(my-cached-function " + i + ")");
    }
     */
  }
  
  public static void testFormat() {
    testEvalEquals("\"3.14159265\"","(subseq (format nil \"~A\" *pi*) 0 10)");
    testEvalEquals("\"Standard Deviation : 1.345\"","(format nil \"Standard Deviation : ~S\" 1.345)");
  }
  
  public static void testQueues() {
    /* Removing these test -- queues are not part of the SubL kernel
    testEvalOfType("(csetq q (create-queue))", SubLStruct.class);
    testEvalEquals("0", "(queue-size q)");
    testEvalEquals("0", "(length (queue-elements q))");
    testEvalOfType("(enqueue 1 q)", SubLStruct.class);
    testEvalEquals("1", "(queue-size q)");
    testEvalEquals("1", "(length (queue-elements q))");
    testEvalOfType("(enqueue 2 q)", SubLStruct.class);
    testEvalEquals("2", "(queue-size q)");
    testEvalEquals("2", "(length (queue-elements q))");
    testEvalOfType("(enqueue 3 q)", SubLStruct.class);
    testEvalEquals("3", "(queue-size q)");
    testEvalEquals("3", "(length (queue-elements q))");
    testEvalOfType("(enqueue 3 q)", SubLStruct.class);
    testEvalEquals("4", "(queue-size q)");
    testEvalEquals("4", "(length (queue-elements q))");
    testEvalOfType("(enqueue 4 q)", SubLStruct.class);
    testEvalEquals("5", "(queue-size q)");
    testEvalEquals("5", "(length (queue-elements q))");
    testEvalOfType("(enqueue 3 q)", SubLStruct.class);
    testEvalEquals("6", "(queue-size q)");
    testEvalEquals("6", "(length (queue-elements q))");
    testEvalEquals("1", "(dequeue q)");
    testEvalEquals("5", "(queue-size q)");
    testEvalEquals("5", "(length (queue-elements q))");
    testEvalOfType("(remqueue 3 q)", SubLStruct.class);
    testEvalEquals("2", "(queue-size q)");
    testEvalEquals("2", "(length (queue-elements q))");
    testEvalEquals("2", "(dequeue q)");
    testEvalEquals("1", "(queue-size q)");
    testEvalEquals("1", "(length (queue-elements q))");
    testEvalEquals("4", "(dequeue q)");
    testEvalEquals("0", "(queue-size q)");
    testEvalEquals("0", "(length (queue-elements q))");
    */
  }
  
  public static final void testWithTimeout() {
    /** @todo fix this unit test -- "time" is not part of the SubL kernel
    testEvalEquals("1", "(round (time (clet (x) (with-timeout (1 x) (sleep 2)))))");
    */
  }
  
  public static final void testDynamicBinding() {
    testEvalEquals("NIL", "(boundp '*dummy-symbol-1234123938458394*)");
    testEvalError("*dummy-symbol-1234123938458394*");
    testEvalEquals("NIL", "(clet ((*dummy-symbol-1234123938458394* \"TEST\")) (boundp '*dummy-symbol-1234123938458394*))");
    testEvalEquals("T", "(clet ((*dummy-symbol-1234123938458394* \"TEST\")) (equalp  \"TEST\" *dummy-symbol-1234123938458394*))");
    testEvalError("*dummy-symbol-1234123938458394*");
    SubLFiles.defparameter("*DUMMY-SYMBOL-12341239384583945*", SubLNumberFactory.makeInteger(123));
    testEvalEquals("123", "*DUMMY-SYMBOL-12341239384583945*");
    SubLSymbol sym = SubLSymbolFactory.makeSymbol("*DUMMY-SYMBOL-12341239384583945*");
    assertEquals(null, sym.currentBinding(SubLProcess.currentSubLThread().bindingsList));
    sym.bind(SubLNil.NIL, SubLProcess.currentSubLThread().bindingsList);
    assertEquals(SubLNil.NIL, sym.currentBinding(SubLProcess.currentSubLThread().bindingsList));
    testEvalEquals("nil", "*DUMMY-SYMBOL-12341239384583945*");
    sym.rebind(null, SubLProcess.currentSubLThread().bindingsList);
    assertEquals(null, sym.currentBinding(SubLProcess.currentSubLThread().bindingsList));
    testEvalEquals("123", "*DUMMY-SYMBOL-12341239384583945*");
    //test that interpreted clet cleans up state after binding a dynamic symbol
    SubLFiles.defparameter("*DUMMY-SYMBOL-783404097858*", SubLNumberFactory.makeInteger(212));
    testEvalEquals("T", "(clet ((*DUMMY-SYMBOL-783404097858* 424)) (equalp  424 *DUMMY-SYMBOL-783404097858*))");
    testEvalEquals("212", "*DUMMY-SYMBOL-783404097858*");
  }
  
  public static final void testCsetf() {
    testEvalEquals("3", "(csetf xyz 3)");
    testEvalEquals("3", "xyz");
    /* @todo -- these unit test depend on code outside of the SubL kernel but shouldn't
     testEvalEquals("\"isa\"", "(c-name #$isa)");
    testEvalEquals("\"BLAH\"", "(csetf (c-name #$isa) \"BLAH\")"); // @dangerous 8-)
    testEvalEquals("\"BLAH\"", "(c-name #$isa)");
    testEvalEquals("\"isa\"", "(csetf (c-name #$isa) \"isa\")");
    testEvalEquals("\"isa\"", "(c-name #$isa)");
    */
    testEvalEquals("'(a b c)", "(csetq *test-symbol-982383* '(a b c))");
    testEvalEquals("3", "(csetf (car *test-symbol-982383*) 3)");
    testEvalEquals("'(3 b c)", "*test-symbol-982383*");
    testEvalEquals("'(c b e)", "(csetf (cdr *test-symbol-982383*) '(c b e))");
    testEvalEquals("'(3 c b e)", "*test-symbol-982383*");
    testEvalEquals("4", "(csetf (symbol-value 'xyz) 4)");
    testEvalEquals("4", "xyz");
    testEvalEquals("'d", "(csetf (nth 2 *test-symbol-982383*) 'd)");
    testEvalEquals("'(3 c d e)", "*test-symbol-982383*");
    readAndEval("(deflexical *test-hash-table-090234* (make-hash-table 12))");
    readAndEval("(sethash 4 *test-hash-table-090234* 16)");
    testEvalEquals("16", "(gethash 4 *test-hash-table-090234*)");
    testEvalEquals("17", "(csetf (gethash 4 *test-hash-table-090234*) 17)");
    testEvalEquals("17", "(gethash 4 *test-hash-table-090234*)");
    testEvalEquals("16", "(csetf (gethash-without-values 4 *test-hash-table-090234*) 16)");
    testEvalEquals("16", "(gethash 4 *test-hash-table-090234*)");
    testEvalEquals("\"654321qwerty\"", "(csetq *test-string-093272* \"654321qwerty\")");
    testEvalEquals("#\\T", "(csetf (char *test-string-093272* 1) #\\T)");
    testEvalEquals("\"6T4321qwerty\"", "*test-string-093272*");
    testEvalEquals("#(1 2 3 4)", "(csetq *test-vector-093272* #(1 2 3 4))");
    testEvalEquals("#\\T", "(csetf (aref *test-vector-093272* 1) #\\T)");
    testEvalEquals("#(1 #\\T 3 4)", "*test-vector-093272*");
    testEvalEquals("nil", "(put '*test-symbol-093272* 'a nil)");
    testEvalEquals("'bar", "(csetf (get '*test-symbol-093272* 'a) 'bar)");
    testEvalEquals("'bar", "(get '*test-symbol-093272* 'a)");
    testEvalError("(csetf 1234 1234)");
    testEvalError("(csetf \"adf\" 1234)");
    testEvalError("(csetf NiL 1234)");
    testEvalError("(csetf t 1234)");
    testEvalError("(csetf x 1234 y)");
  }
  
  public static final void testCDo() {
    testEvalEquals("4", "(cdo ((temp-one 1 (cinc temp-one)) (temp-two 0 (cdec temp-two))) ((> (- temp-one temp-two) 5) temp-one))");
  }
  
  public static final void testCProgv() {
    testEvalEquals("5", "(csetq *x-234909320239341* 5)");
    testEvalEquals("9", "(csetq *x-234909320239342* 9)");
    testEvalEquals("2", "(cprogv '(*x-234909320239341* *x-234909320239342*) '(2 7) *x-234909320239341*)");
    testEvalEquals("5", "*x-234909320239341*");
    testEvalEquals("9", "*x-234909320239342*");
    testEvalEquals("7", "(cprogv '(*x-234909320239341* *x-234909320239342*) '(2 7) *x-234909320239342*)");
    testEvalEquals("5", "*x-234909320239341*");
    testEvalEquals("9", "*x-234909320239342*");
  }
  
  public static final void testCSome() {
    testEvalEquals("5", "(clet ((done? nil) (result 0)) (csome (x '(a b c d e) done?) (csetq result (+ result 1))) result)");
    testEvalEquals("3", "(clet ((done? nil) (result 0)) (csome (x '(a b c d e) done?) (csetq result (+ result 1)) (pwhen (> result 2) (csetq done? t))) result)");
    testEvalEquals("T", "(clet ((fail nil)) (csome (item '(1 2 3) fail) (csetq fail (eq item 2))) fail)");
    testEvalEquals("NIL", "(clet ((fail nil)) (csome (item '(1 2 3) fail) (csetq fail (eq item 4))) fail)");
  }
  
  public static final void testNconc() {
    testEvalEquals("nil", "(nconc)");
    testEvalEquals("1", "(nconc 1)");
    testEvalEquals("'(a b)", "(nconc '(a) '(b))");
    testEvalEquals("'(a b c)", "(nconc '(a) '(b) '(c))");
    testEvalEquals("'(a b d)", "(nconc '(a) '(b . c) '(d))");
    testEvalEquals("'(a)", "(nconc '(a . b) nil)");
    testEvalEquals("'(a . b)", "(nconc '(a) 'b)");
    testEvalEquals("t", "(nconc nil t)");
    testEvalEquals("'(a . b)", "(nconc '(a) nil 'b)");
    testEvalEquals("t", "(nconc nil nil t)");
    testEvalEquals("nil", "(nconc nil nil nil)");
    testEvalEquals("1", "(nconc nil nil 1)");
    testEvalError("(nconc 1 nil)");
  }
  
  public static final void testCand() {
    testEvalEquals("T", "(cand)");
    testEvalEquals("T", "(cand 'xx 'yy)");
    testEvalEquals("T", "(cand T)");
    testEvalEquals("NIL", "(cand NIL T)");
    testEvalEquals("NIL", "(cand T NIL)");
    testEvalEquals("T", "(cand T T T)");
    testEvalEquals("NIL", "(cand NIL NIL NIL)");
    testEvalEquals("T", "(cand 1 2)");
    testEvalError("(cand 1 . 2)");
    testEvalError("(cand xasdrwsefrax yasdfsdfasdfry)");
  } 
  
  public static final void testCnot() {
    testEvalEquals("T",   "(cnot NIL)");
    testEvalEquals("NIL", "(cnot T)");
    testEvalEquals("NIL", "(cnot 212)");
    testEvalEquals("NIL", "(cnot '(1 2))");
    testEvalEquals("NIL", "(cnot (= 1 1))");
    testEvalEquals("T",   "(cnot (= 1 2))");
    testEvalError("(cnot 1 . 2)");
  }
  
  public static final void testInterpretedStructures() {
    testEvalEquals("T",   "(progn (defstruct (foo) bar) (foo-p (make-foo)))");
  }
  
  public final void testKeywords() {
    testEvalEquals("':ASFSDFLKD", ":ASFSDFLKD");
    // @todo fix reader.parse-symbol-or-consing-dot bug to get following test to work
    // testEvalEquals("':ASFSDFLKD1", "'::ASFSDFLKD1"); 
    testEvalEquals("':ASFSDFLKD2", "KEYWORD::ASFSDFLKD2");
    testEvalEquals("':ASFSDFLKD3", "KEYWORD::ASFSDFLKD3");
    testEvalEquals("NIL", "(find-symbol \":BLAH23423423\")");
    testEvalEquals("NIL", "(second (multiple-value-list (find-symbol \":BLAH23423423\")))");
    testEvalEquals("':ASFSDFLKD2", "(find-symbol \"ASFSDFLKD2\" *keyword-package*)");
    testEvalEquals("':EXTERNAL", "(second (multiple-value-list (find-symbol \"ASFSDFLKD2\" *keyword-package*)))");
    testEvalError("(csetq :KW1 :KW1)");
    testEvalError("(clet ((:KW1 :KW1)) NIL)");
    testEvalEquals(":KW1", ":KW1");
    testEvalEquals(":KW1", "':KW1");
    testEvalEquals(":KW1", "(symbol-value :KW1)");
    testEvalEquals("T", "(keywordp :KW1)");
    testEvalEquals("T", "(constantp :KW1)");
    testEvalEquals("NIL", "(fboundp :KW1)");
    testEvalEquals("T", "(boundp :KW1)");
    testEvalError("(symbol-function :KW1)");
    testEvalEquals("(find-package \"KEYWORD\")", "(symbol-package :KW1)");
    testEvalEquals("\"KEYWORD3\"", "(symbol-name :KEYWORD3)");
    testEvalEquals("\"KEYWORD3\"", "(symbol-name ':KEYWORD3)");
    testEvalEquals("\"foo\"", "(symbol-name  (make-keyword \"foo\"))");
    testEvalEquals(":|foo|", "(make-keyword \"foo\")");
    testEvalEquals(":|:foo|", "(make-keyword \":foo\")");
    testEvalEquals(":|:|", "(make-keyword \":\")");
    testEvalEquals("':|:|" , "(read-from-string (write-to-string ':|:|))");
  }
  
  public final void testTerminalStreams() {
   testEvalEquals("T", "(output-stream-p *TERMINAL-IO*)");
   testEvalEquals("T", "(input-stream-p *TERMINAL-IO*)");
   testEvalEquals("T","(output-stream-p *STANDARD-OUTPUT*)");
   testEvalEquals("T","(input-stream-p *STANDARD-OUTPUT*)");
  }

  public final void testStreamFlushing() {
    // @todo see if SocketStreams need the same sort of testing
    try {
      File file = File.createTempFile("unit", "test");
      try {
        SubLInOutTextStream ioStream = SubLObjectFactory.
            makeInOutTextStream(file.getCanonicalPath(), OVERWRITE_KEYWORD,
            CREATE_KEYWORD);
        long startTime = System.nanoTime();
        int iterations = 1000;
        int outterIterations = 10;
        for (int j = 0; j < outterIterations; j++) {
          for (int i = 0; i < iterations; i++) {
            ioStream.seek(0);
            ioStream.write('a');
            ioStream.seek(1);
            ioStream.write('b');
            ioStream.seek(2);
            ioStream.write('c');
            ioStream.seek(3);
            ioStream.write('d');
            ioStream.seek(0);
            ioStream.write('d');
            ioStream.seek(1);
            ioStream.write('c');
            ioStream.seek(2);
            ioStream.write('b');
            ioStream.seek(3);
            ioStream.write('a');
          }
          ioStream.flush();
          ioStream.flush();
          ioStream.flush();
          ioStream.flush();
          for (int i = 0; i < iterations; i++) {
            ioStream.seek(1000000);
            ioStream.seek(0);
            ioStream.read();
            ioStream.seek(3);
            int theChar = ioStream.read();
            assertEquals('a', (char)theChar);
            ioStream.seek(2);
            theChar = ioStream.read();
            assertEquals('b', (char)theChar);
            ioStream.seek(1);
            theChar = ioStream.read();
            assertEquals('c', (char)theChar);
            ioStream.seek(0);
            theChar = ioStream.read();
            assertEquals('d', (char)theChar);
          }
          ioStream.flush();
        }
        long endTime = System.nanoTime();
        System.out.println("Got flush time: " + (endTime - startTime)/1000000000.0 + "secs.");
        assertEquals(outterIterations * 1, (int)ioStream.getFlushCount());
      } finally {
        file.delete();
      }
    } catch (Exception e) {
      e.printStackTrace();
      fail();
    }
  }
  
  public final void testLoadExternalCode() {
    if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE) {
      return;
    }
    testEvalError("*MY-TEST-VAR*");
    readAndEval("(initialize-subl-interface-file \"" + SubLFile_Test.class.getName() + "\" )");
    testEvalEquals("123", "(LATE-TEST-METHOD 123)");
    testEvalError("(initialize-subl-interface-file \"java.lang.String\")");
    testEvalEquals("T", "*MY-TEST-VAR*");
    File jfile = new File("ext/");
    if (jfile.isDirectory() && jfile.exists()) {
    	if (IsolatedClassLoader.ALLOW_LOADING_OF_DIRS_FROM_INTERPRETER)
        testEvalEquals("T","(load-external-code \""+jfile.getAbsolutePath().replace("\\", "\\\\")+"\")");
    	else      
    		testEvalError("(load-external-code \""+jfile.getAbsolutePath().replace("\\", "\\\\")+"\")");
    }
    // classpath test
    jfile = new File("httpd/htdocs/java/ql/lib/cyc-framework.jar");
    if (jfile.isFile() && jfile.exists()) {
      testEvalEquals("T","(load-external-code  \""+jfile.toString()+"\")");
    }
    // @todo URL test: testEvalError("T","(load-external-code  \"http://somewhere-non404.com/some.jar\")");
    // classfile test
    jfile = new File("build/overlay/com/cyc/tool/subl/jrtl/nativeCode/subLisp/JLinker.class");
    if (false && jfile.isFile() && jfile.exists()) { // delayed for now it works basically but need to make a more portable unit test
      testEvalEquals("T","(load-external-code  \""+jfile.toString()+"\")");
      testEvalEquals("T","(INITIALIZE-SUBL-INTERFACE-FILE \"com.cyc.tool.subl.jrtl.nativeCode.subLisp.JLinker\")");
    }
  }

  static public final class SubLFile_Test implements SubLFile {
    final static SubLFile me = new SubLFile_Test();
    static SubLSymbol $my_test_var$;

    public void declareFunctions() {
      SubLFiles.declareFunction(me, "test_method", "LATE-TEST-METHOD", 1, 0, false);
    }

    public void initializeVariables() {
      $my_test_var$ = SubLFiles.defconstant(me, "*MY-TEST-VAR*", T);
    }

    public void runTopLevelForms() {
    }

    static public SubLObject test_method(SubLObject param) {
      return param;
    }
  }
  
  public void testErrorsAndWarnsGoToRightStream() {
    String command1 =
         "(clet ((test-stream (make-string-output-stream))\n"
       + "       (*error-output* test-stream))\n"
       + "  (warn \"12345654321\")\n"
       + "  (cnot (null (search \"12345654321\" (get-output-stream-string test-stream)))))";
    testEvalEquals("T", command1);
    // note: the following isnt guaranteed to work in the JRTL becuase the error output might
    // not be sent to stream until outside the current binding
    /*String command2 =
         "(clet ((test-stream (make-string-output-stream))\n"
       + "       (*error-output* test-stream))\n"
       + "  (error \"12345654321\")\n"
       + "  (cnot (null (search \"12345654321\" (get-output-stream-string test-stream)))))";
    testEvalEquals("T", command2);*/
    String command3 =
         "(clet ((test-stream (make-string-output-stream))\n"
       + "       (*error-output* test-stream))\n"
       + "  (break \"12345654321\")\n"
       + "  (cnot (null (search \"12345654321\" (get-output-stream-string test-stream)))))";
    testEvalEquals("T", command3);
  }

  public final void testResourcer() {
    Resourcer resourcer = Resourcer.getInstance();
    for (int i = 0, size = Resourcer.ObjectArrayObjectPool.MAX_ARRAY_SIZE + 2; i < size; i++) {
      Object[] arr = null;
      try {
        arr = resourcer.acquireObjectArray(i);
        assertEquals(arr.length, i);
      } finally {
        resourcer.releaseObjectArray(arr);
      }
    }
    for (int i = 0, size =  Resourcer.SubLObjectArrayObjectPool.MAX_ARRAY_SIZE + 2; i < size; i++) {
      SubLObject[] arr = null;
      try {
        arr = resourcer.acquireSubLObjectArray(i);
        assertEquals(arr.length, i);
      } finally {
        resourcer.releaseSubLObjectArray(arr);
      }
    }
  }

  public static final void testReadSequence() {
    // String Buffer - Text Stream
    testEvalEquals("'(6 \"++exam++++\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
    testEvalEquals("'(9 \"++example+\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(5 \"++exa\")",
        "(clet ((string (make-string 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(6 \"++exam++++\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
    // Vector Buffer - Text Stream
    testEvalEquals("'(6 #(#\\+ #\\+ #\\e #\\x #\\a #\\m #\\+ #\\+ #\\+ #\\+))",
        "(clet ((string (make-vector 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
    testEvalEquals("'(9 #( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\p #\\l #\\e #\\+))",
        "(clet ((string (make-vector 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(5 #( #\\+ #\\+ #\\e #\\x #\\a))",
        "(clet ((string (make-vector 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(6 #( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\+ #\\+ #\\+ #\\+))",
        "(clet ((string (make-vector 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
    // List Buffer - Text Stream
    testEvalEquals("'(6 ( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\+ #\\+ #\\+ #\\+))",
        "(clet ((string (make-list 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
    testEvalEquals("'(9 ( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\p #\\l #\\e #\\+))",
        "(clet ((string (make-list 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(5 ( #\\+ #\\+ #\\e #\\x #\\a))",
        "(clet ((string (make-list 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(6 ( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\+ #\\+ #\\+ #\\+))",
        "(clet ((string (make-list 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
/*
    // String Buffer - Binary Stream
    testEvalEquals("'(6 \"++exam++++\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
    testEvalEquals("'(9 \"++example+\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(5 \"++exa\")",
        "(clet ((string (make-string 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(6 \"++exam++++\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
    // Vector Buffer - Binary Stream
    testEvalEquals("'(6 \"++exam++++\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
    testEvalEquals("'(9 \"++example+\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(5 \"++exa\")",
        "(clet ((string (make-string 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(6 \"++exam++++\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
    // List Buffer - Binary Stream
    testEvalEquals("'(6 \"++exam++++\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
    testEvalEquals("'(9 \"++example+\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(5 \"++exa\")",
        "(clet ((string (make-string 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
    testEvalEquals("'(6 \"++exam++++\")",
        "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
*/
 }
  
  /**
   * Runs the unit tests
   */
  /*public static Test suite() {
    TestSuite testSuite = new TestSuite();
    testSuite.addTest(new UnitTest("testHashtableExerciser"));
    return testSuite;
  }*/
  
  /**
   * Runs the unit tests
   */
  public static Test suite() {
    TestSuite testSuite = new TestSuite();
    testSuite.addTest(new UnitTest("testSelfEvaluation"));
    testSuite.addTest(new UnitTest("testNilEvaluation"));
    testSuite.addTest(new UnitTest("testSimpleFunctionEvaluation"));
    testSuite.addTest(new UnitTest("testErrorEvaluation"));
    testSuite.addTest(new UnitTest("testOptionalArgEvaluation"));
    testSuite.addTest(new UnitTest("testRestArgEvaluation"));
    testSuite.addTest(new UnitTest("testQuote"));
    testSuite.addTest(new UnitTest("testProgn"));
    testSuite.addTest(new UnitTest("testPif"));
    testSuite.addTest(new UnitTest("testPwhen"));
    testSuite.addTest(new UnitTest("testPunless"));
    testSuite.addTest(new UnitTest("testPcond"));
    testSuite.addTest(new UnitTest("testLexicalVariables"));
    testSuite.addTest(new UnitTest("testDynamicVariables"));
    testSuite.addTest(new UnitTest("testCsetq"));
    testSuite.addTest(new UnitTest("testClet"));
    testSuite.addTest(new UnitTest("testCunwindProtect"));
    testSuite.addTest(new UnitTest("testCcatch"));
    testSuite.addTest(new UnitTest("testCmultipleValueBind"));
    testSuite.addTest(new UnitTest("testFif"));
    testSuite.addTest(new UnitTest("testBasicEquality"));
    testSuite.addTest(new UnitTest("testSymbolEquality"));
    testSuite.addTest(new UnitTest("testKeywordEquality"));
    testSuite.addTest(new UnitTest("testCharacterEquality"));
    testSuite.addTest(new UnitTest("testStringEquality"));
    testSuite.addTest(new UnitTest("testFixnumEquality"));
    testSuite.addTest(new UnitTest("testNumberEquality"));
    testSuite.addTest(new UnitTest("testNumberComparison"));
    testSuite.addTest(new UnitTest("testListEquality"));
    testSuite.addTest(new UnitTest("testLambdaFunctions"));
    testSuite.addTest(new UnitTest("testNumberFormats"));
    testSuite.addTest(new UnitTest("testCharacterFormats"));
    testSuite.addTest(new UnitTest("testSymbolNames"));
    testSuite.addTest(new UnitTest("testStrings"));
    testSuite.addTest(new UnitTest("testTypePredicates"));
    testSuite.addTest(new UnitTest("testMember"));
    testSuite.addTest(new UnitTest("testCDoTimes"));
    testSuite.addTest(new UnitTest("testCDoList"));
    testSuite.addTest(new UnitTest("testCDoHash"));
    testSuite.addTest(new UnitTest("testCPushAndCPop"));
    testSuite.addTest(new UnitTest("testMapping"));
    testSuite.addTest(new UnitTest("testDefine"));
    testSuite.addTest(new UnitTest("testProcesses"));
    testSuite.addTest(new UnitTest("testCTime"));
    testSuite.addTest(new UnitTest("testSort"));
    testSuite.addTest(new UnitTest("testHashtables"));
    testSuite.addTest(new UnitTest("testKeyhashes"));
    testSuite.addTest(new UnitTest("testCharacterFunctions"));
    testSuite.addTest(new UnitTest("testStringFunctions"));
    testSuite.addTest(new UnitTest("testPackageFunctions"));
    testSuite.addTest(new UnitTest("testSymbolFunctions"));
    testSuite.addTest(new UnitTest("testSequenceFunctions"));
    testSuite.addTest(new UnitTest("testFileSysFunctions"));
    testSuite.addTest(new UnitTest("testGUIDs"));
    testSuite.addTest(new UnitTest("testStringStreams"));
    testSuite.addTest(new UnitTest("testMathFunctions"));
    testSuite.addTest(new UnitTest("testTimeMethods"));
    testSuite.addTest(new UnitTest("testFunctions"));
    testSuite.addTest(new UnitTest("testPolymorphic"));
    testSuite.addTest(new UnitTest("testSxhash"));
    testSuite.addTest(new UnitTest("testPrinterControlVars"));
    testSuite.addTest(new UnitTest("testAppend"));
    testSuite.addTest(new UnitTest("testWithErrorHandler"));
    testSuite.addTest(new UnitTest("testCycLSets"));
    testSuite.addTest(new UnitTest("testDefineCachedFunctions"));
    testSuite.addTest(new UnitTest("testFormat"));
    testSuite.addTest(new UnitTest("testCycLListComparison"));
    testSuite.addTest(new UnitTest("testQueues"));
    testSuite.addTest(new UnitTest("testMultipleValues"));
    testSuite.addTest(new UnitTest("testWithTimeout"));
    testSuite.addTest(new UnitTest("testDynamicBinding"));
    testSuite.addTest(new UnitTest("testCsetf"));
    testSuite.addTest(new UnitTest("testCDo"));
    testSuite.addTest(new UnitTest("testCProgv"));
    testSuite.addTest(new UnitTest("testCSome"));
    testSuite.addTest(new UnitTest("testNconc"));
    testSuite.addTest(new UnitTest("testCand"));
    testSuite.addTest(new UnitTest("testCnot"));
    testSuite.addTest(new UnitTest("testInterpretedStructures"));
    testSuite.addTest(new UnitTest("testKeywords"));
    testSuite.addTest(new UnitTest("testTerminalStreams"));
    testSuite.addTest(new UnitTest("testLoadExternalCode"));
    testSuite.addTest(new UnitTest("testReadloopErrorHandling"));
    testSuite.addTest(new UnitTest("testStreamFlushing"));
    testSuite.addTest(new UnitTest("testCompiledSymbolProperties"));
    testSuite.addTest(new UnitTest("testInterpretedSymbolProperties"));
    testSuite.addTest(new UnitTest("testResourcer"));
    testSuite.addTest(new UnitTest("testExternalProcessStreamClosing"));
    testSuite.addTest(new UnitTest("testCMerge"));
    testSuite.addTest(new UnitTest("testErrorsAndWarnsGoToRightStream"));
    testSuite.addTest(new UnitTest("testReadSequence"));
    // SERIOUS TESTING
    //testSuite.addTest(new UnitTest("testCyclops"));
    return testSuite;
  }
  
  //// Protected Area
  
  //// Private Area
  
  public static SubLObject readAndEval(String str) {
    SubLEnvironment env = SubLEnvironment.currentEnvironment();
    SubLString strTyped = SubLObjectFactory.makeString(str);
    SubLObject form = reader.read_from_string(strTyped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    return form.eval(env);
  }
  
  /** Throws an error if STR, after parsing, does not evaluate to itself. */
  public static void testOneSelfEvaluation(String str) {
    shouldPrintTests("Testing that " + str + " is self-evaluating...");
    SubLString strTyped = SubLObjectFactory.makeString(str);
    SubLObject form = reader.read_from_string(strTyped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    SubLEnvironment env = SubLEnvironment.currentEnvironment();
    Object result = form.eval(env);
    Assert.assertEquals(form,result);
    // System.out.println("Success.");
  }
  
  public static void testOneNonSelfEvaluation(String str) {
    shouldPrintTests("Testing that " + str + " is not self-evaluating...");
    SubLString strTyped = SubLObjectFactory.makeString(str);
    SubLObject form = reader.read_from_string(strTyped, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    SubLEnvironment env = SubLEnvironment.currentEnvironment();
    Object result = form.eval(env);
    Assert.assertFalse(form.equals(result));
    System.out.println("Success.");
  }
  
  /** Throws an error unless STR evaluates to OBJ. */
  public static void testEvalEqualsObj(Object obj, String str) {
    shouldPrintTests("Testing that " + str + " evaluates to " + obj + "...");
    SubLObject result = readAndEval(str);
    Assert.assertEquals(obj, result);
    // System.out.println("Success.");
  }
  
  /** Throws an error unless STR does not evaluates to OBJ. */
  public static void testEvalNotEqualsObj(Object obj, String str) {
    shouldPrintTests("Testing that " + str + " does not evaluate to " + obj + "...");
    SubLObject result = readAndEval(str);
    Assert.assertNotSame(obj, result);
    // System.out.println("Success.");
  }
  
  public static void testEvalOfType(String str, Class evalType) {
    shouldPrintTests("Testing that " + str + " is of type " + evalType + "...");
    SubLObject obj = readAndEval(str);
    Assert.assertTrue(evalType.isInstance(obj));
  }
  
  public static void testEvalEquals(String str1, String str2) {
    SubLObject obj1 = readAndEval(str1);
    testEvalEqualsObj(obj1, str2);
  }
  
  public static void testEvalNotEquals(String str1, String str2) {
    SubLObject obj1 = readAndEval(str1);
    testEvalNotEqualsObj(obj1, str2);
  }
  
  // @todo add lots of tests for testEvalError
  // @todo it would be nice to add a parameter indicating the type of class
  // that should be thrown -APB
  public static void testEvalError(String str) {
    shouldPrintTests("Testing that evaluating " + str + " generates an error...");
    
    boolean error = false;
    try {
      readAndEval(str);
    } catch (Exception e) {
      error = true;
    }
    Assert.assertEquals(error, true);
    // System.out.println("Success.");
  }
  
  public static void testEvalDoesNotError(String str) {
    shouldPrintTests("Testing that evaluating " + str + " does not generate an error...");

    boolean error = false;
    try {
      readAndEval(str);
      error = true;
    } catch (Exception e) {
    }
    Assert.assertEquals(error, true);
    // System.out.println("Success.");
  }
  
  public static void shouldPrintTests(String msg) {
    if (SHOULD_PRINT_TESTS) {
      System.out.println(msg);
    }
  }
  
  //// Internal Rep
  
  private static final boolean SHOULD_PRINT_TESTS = true;
  private static final boolean SHOULD_RUN_EXPENSIVE_TESTS = false;
  
  private static SubLInteger twoTwelve = SubLObjectFactory.makeInteger(212);
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  // @todo refactor to share more code with readloop
  public static void main(final String[] args) {
    System.out.println("Starting.");
    try {
      SubLProcess subLProcess = new SubLProcess("Initial Lisp Listener") {
        public void safeRun() {
          SubLMain.me.initializeSubL(args);
          SubLMain.me.initializeTranslatedSystems();
          SubLMain.setMainReader(null);
          //SubLFiles.initialize(Keyhashes.me);
          SSS.setDynamicValue(SubLObjectFactory.makeInteger(212));
          SubLMain.setIsInitialized();
          TestRunner.run(suite());
          System.exit(0);
        }
      };
      SubLThreadPool.getDefaultPool().execute(subLProcess);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
