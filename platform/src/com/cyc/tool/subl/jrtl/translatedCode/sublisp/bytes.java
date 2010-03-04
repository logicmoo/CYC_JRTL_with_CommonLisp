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

package  com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

public  final class bytes extends SubLTranslatedFile {

  //// Constructor

  private bytes() {}
  public static final SubLFile me = new bytes();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes";

  //// Definitions

  /** Return a byte specification object (an integer) which can be used as
an argument to LDB and DPB functions.  SIZE specifies the width in bits.
Position specifies the least significant bit of the byte, numbering 0 as
the least significant bit. */
  @SubL(source = "sublisp/bytes.lisp", position = 1139) 
  public static final SubLObject sublisp_byte(SubLObject size, SubLObject position) {
    checkType(size, $sym0$INTEGERP);
    checkType(position, $sym0$INTEGERP);
    if ((size.isNegative()
        || size.numG($int1$4095))) {
      Errors.error($str2$Invalid_Size);
      return NIL;
    }
    if ((position.isNegative()
        || size.numG($int1$4095))) {
      Errors.error($str3$Invalid_Position);
      return NIL;
    }
    return Numbers.add(Numbers.multiply(size, $int4$4096), position);
  }

  /** Return the byte specified by BYTESPEC from the integer BITS. */
  @SubL(source = "sublisp/bytes.lisp", position = 1703) 
  public static final SubLObject ldb(SubLObject bytespec, SubLObject bits) {
    checkType(bytespec, $sym0$INTEGERP);
    checkType(bits, $sym0$INTEGERP);
    {
      SubLObject pcase_var = bytespec;
      if (pcase_var.eql($int4$4096)) {
        return Numbers.logand(ONE_INTEGER, bits);
      } else if (pcase_var.eql($int5$8193)) {
        return Numbers.logand(THREE_INTEGER, Numbers.ash(bits, MINUS_ONE_INTEGER));
      } else if (pcase_var.eql($int6$12291)) {
        return Numbers.logand(SEVEN_INTEGER, Numbers.ash(bits, $int7$_3));
      } else {
        {
          SubLObject size = Numbers.ash(bytespec, $int8$_12);
          SubLObject position = Numbers.logand(bytespec, $int1$4095);
          SubLObject mask = Numbers.lognot(Numbers.ash(MINUS_ONE_INTEGER, size));
          return Numbers.logand(mask, Numbers.ash(bits, Numbers.minus(position)));
        }
      }
    }
  }

  /** Return the integer BITS where the bits of NEWBYTE have been substituted
into BITS according the the BYTESPEC. */
  @SubL(source = "sublisp/bytes.lisp", position = 2510) 
  public static final SubLObject dpb(SubLObject newbyte, SubLObject bytespec, SubLObject bits) {
    checkType(bytespec, $sym0$INTEGERP);
    checkType(newbyte, $sym0$INTEGERP);
    checkType(bits, $sym0$INTEGERP);
    {
      SubLObject position = Numbers.logand(bytespec, $int1$4095);
      SubLObject size = Numbers.ash(bytespec, $int8$_12);
      SubLObject mask = Numbers.lognot(Numbers.ash(MINUS_ONE_INTEGER, position));
      SubLObject trimmed_newbits = NIL;
      trimmed_newbits = Numbers.logand(Numbers.lognot(Numbers.ash(MINUS_ONE_INTEGER, size)), newbyte);
      return Numbers.logior(Numbers.logand(mask, bits), Numbers.ash(trimmed_newbits, position), Numbers.ash(Numbers.ash(bits, Numbers.minus(Numbers.add(position, size))), Numbers.add(position, size)));
    }
  }

  public static final SubLObject declare_bytes_file() {
    declareFunction(myName, "sublisp_byte", "BYTE", 2, 0, false);
    declareFunction(myName, "ldb", "LDB", 2, 0, false);
    declareFunction(myName, "dpb", "DPB", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_bytes_file() {
    return NIL;
  }

  public static final SubLObject setup_bytes_file() {
    // CVS_ID("Id: bytes.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLInteger $int1$4095 = makeInteger(4095);
  public static final SubLString $str2$Invalid_Size = makeString("Invalid Size");
  public static final SubLString $str3$Invalid_Position = makeString("Invalid Position");
  public static final SubLInteger $int4$4096 = makeInteger(4096);
  public static final SubLInteger $int5$8193 = makeInteger(8193);
  public static final SubLInteger $int6$12291 = makeInteger(12291);
  public static final SubLInteger $int7$_3 = makeInteger(-3);
  public static final SubLInteger $int8$_12 = makeInteger(-12);

  //// Initializers

  public void declareFunctions() {
    declare_bytes_file();
  }

  public void initializeVariables() {
    init_bytes_file();
  }

  public void runTopLevelForms() {
    setup_bytes_file();
  }

}
