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

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class bytes extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new bytes();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes";
	public static SubLSymbol $sym0$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");

	//// Definitions

	public static SubLInteger $int1$4095 = SubLObjectFactory.makeInteger(4095);

	public static SubLString $str2$Invalid_Size = SubLObjectFactory.makeString("Invalid Size");

	public static SubLString $str3$Invalid_Position = SubLObjectFactory.makeString("Invalid Position");

	public static SubLInteger $int4$4096 = SubLObjectFactory.makeInteger(4096);

	public static SubLInteger $int5$8193 = SubLObjectFactory.makeInteger(8193);

	public static SubLInteger $int6$12291 = SubLObjectFactory.makeInteger(12291);

	//// Internal Constants

	public static SubLInteger $int7$_3 = SubLObjectFactory.makeInteger(-3);
	public static SubLInteger $int8$_12 = SubLObjectFactory.makeInteger(-12);

	public static SubLObject declare_bytes_file() {
		SubLFiles.declareFunction(bytes.myName, "sublisp_byte", "BYTE", 2, 0, false);
		SubLFiles.declareFunction(bytes.myName, "ldb", "LDB", 2, 0, false);
		SubLFiles.declareFunction(bytes.myName, "dpb", "DPB", 3, 0, false);
		return CommonSymbols.NIL;
	}

	/**
	 * Return the integer BITS where the bits of NEWBYTE have been substituted
	 * into BITS according the the BYTESPEC.
	 */
	@SubL(source = "sublisp/bytes.lisp", position = 2510)
	public static SubLObject dpb(SubLObject newbyte, SubLObject bytespec, SubLObject bits) {
		SubLTrampolineFile.checkType(bytespec, bytes.$sym0$INTEGERP);
		SubLTrampolineFile.checkType(newbyte, bytes.$sym0$INTEGERP);
		SubLTrampolineFile.checkType(bits, bytes.$sym0$INTEGERP);
		{
			SubLObject position = Numbers.logand(bytespec, bytes.$int1$4095);
			SubLObject size = Numbers.ash(bytespec, bytes.$int8$_12);
			SubLObject mask = Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, position));
			SubLObject trimmed_newbits = CommonSymbols.NIL;
			trimmed_newbits = Numbers.logand(Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, size)),
					newbyte);
			return Numbers.logior(Numbers.logand(mask, bits), Numbers.ash(trimmed_newbits, position), Numbers
					.ash(Numbers.ash(bits, Numbers.minus(Numbers.add(position, size))), Numbers.add(position, size)));
		}
	}

	public static SubLObject init_bytes_file() {
		return CommonSymbols.NIL;
	}

	/** Return the byte specified by BYTESPEC from the integer BITS. */
	@SubL(source = "sublisp/bytes.lisp", position = 1703)
	public static SubLObject ldb(SubLObject bytespec, SubLObject bits) {
		SubLTrampolineFile.checkType(bytespec, bytes.$sym0$INTEGERP);
		SubLTrampolineFile.checkType(bits, bytes.$sym0$INTEGERP);
		{
			SubLObject pcase_var = bytespec;
			if (pcase_var.eql(bytes.$int4$4096))
				return Numbers.logand(CommonSymbols.ONE_INTEGER, bits);
			else if (pcase_var.eql(bytes.$int5$8193))
				return Numbers.logand(CommonSymbols.THREE_INTEGER, Numbers.ash(bits, CommonSymbols.MINUS_ONE_INTEGER));
			else if (pcase_var.eql(bytes.$int6$12291))
				return Numbers.logand(CommonSymbols.SEVEN_INTEGER, Numbers.ash(bits, bytes.$int7$_3));
			else {
				SubLObject size = Numbers.ash(bytespec, bytes.$int8$_12);
				SubLObject position = Numbers.logand(bytespec, bytes.$int1$4095);
				SubLObject mask = Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, size));
				return Numbers.logand(mask, Numbers.ash(bits, Numbers.minus(position)));
			}
		}
	}

	public static SubLObject setup_bytes_file() {
		// CVS_ID("Id: bytes.lisp 126640 2008-12-04 13:39:36Z builder ");
		return CommonSymbols.NIL;
	}

	/**
	 * Return a byte specification object (an integer) which can be used as an
	 * argument to LDB and DPB functions. SIZE specifies the width in bits.
	 * Position specifies the least significant bit of the byte, numbering 0 as
	 * the least significant bit.
	 */
	@SubL(source = "sublisp/bytes.lisp", position = 1139)
	public static SubLObject sublisp_byte(SubLObject size, SubLObject position) {
		SubLTrampolineFile.checkType(size, bytes.$sym0$INTEGERP);
		SubLTrampolineFile.checkType(position, bytes.$sym0$INTEGERP);
		if (size.isNegative() || size.numG(bytes.$int1$4095)) {
			Errors.error(bytes.$str2$Invalid_Size);
			return CommonSymbols.NIL;
		}
		if (position.isNegative() || size.numG(bytes.$int1$4095)) {
			Errors.error(bytes.$str3$Invalid_Position);
			return CommonSymbols.NIL;
		}
		return Numbers.add(Numbers.multiply(size, bytes.$int4$4096), position);
	}

	private bytes() {
	}

	//// Initializers

	public void declareFunctions() {
		bytes.declare_bytes_file();
	}

	public void initializeVariables() {
		bytes.init_bytes_file();
	}

	public void runTopLevelForms() {
		bytes.setup_bytes_file();
	}

}
