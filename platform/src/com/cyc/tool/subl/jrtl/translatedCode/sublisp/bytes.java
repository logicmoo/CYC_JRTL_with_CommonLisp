//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class bytes extends SubLTranslatedFile {
	public static SubLObject declare_bytes_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes", "sublisp_byte", "BYTE", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes", "ldb", "LDB", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes", "dpb", "DPB", 3, 0, false);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/bytes.lisp", position = 2510L)
	public static SubLObject dpb(SubLObject newbyte, SubLObject bytespec, SubLObject bits) {
		assert SubLNil.NIL != Types.integerp(bytespec) : bytespec;
		assert SubLNil.NIL != Types.integerp(newbyte) : newbyte;
		assert SubLNil.NIL != Types.integerp(bits) : bits;
		SubLObject position = Numbers.logand(bytespec, bytes.$int1$4095);
		SubLObject size = Numbers.ash(bytespec, bytes.$int8$_12);
		SubLObject mask = Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, position));
		SubLObject trimmed_newbits = SubLNil.NIL;
		trimmed_newbits = Numbers.logand(Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, size)), newbyte);
		return Numbers.logior(Numbers.logand(mask, bits), Numbers.ash(trimmed_newbits, position), Numbers
				.ash(Numbers.ash(bits, Numbers.minus(Numbers.add(position, size))), Numbers.add(position, size)));
	}

	public static SubLObject init_bytes_file() {
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/bytes.lisp", position = 1703L)
	public static SubLObject ldb(SubLObject bytespec, SubLObject bits) {
		assert SubLNil.NIL != Types.integerp(bytespec) : bytespec;
		assert SubLNil.NIL != Types.integerp(bits) : bits;
		if (bytespec.eql(bytes.$int4$4096))
			return Numbers.logand(CommonSymbols.ONE_INTEGER, bits);
		if (bytespec.eql(bytes.$int5$8193))
			return Numbers.logand(CommonSymbols.THREE_INTEGER, Numbers.ash(bits, CommonSymbols.MINUS_ONE_INTEGER));
		if (bytespec.eql(bytes.$int6$12291))
			return Numbers.logand(CommonSymbols.SEVEN_INTEGER, Numbers.ash(bits, bytes.$int7$_3));
		SubLObject size = Numbers.ash(bytespec, bytes.$int8$_12);
		SubLObject position = Numbers.logand(bytespec, bytes.$int1$4095);
		SubLObject mask = Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, size));
		return Numbers.logand(mask, Numbers.ash(bits, Numbers.minus(position)));
	}

	public static SubLObject setup_bytes_file() {
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/bytes.lisp", position = 1139L)
	public static SubLObject sublisp_byte(SubLObject size, SubLObject position) {
		assert SubLNil.NIL != Types.integerp(size) : size;
		assert SubLNil.NIL != Types.integerp(position) : position;
		if (size.isNegative() || size.numG(bytes.$int1$4095)) {
			Errors.error(bytes.$str2$Invalid_Size);
			return SubLNil.NIL;
		}
		if (position.isNegative() || size.numG(bytes.$int1$4095)) {
			Errors.error(bytes.$str3$Invalid_Position);
			return SubLNil.NIL;
		}
		return Numbers.add(Numbers.multiply(size, bytes.$int4$4096), position);
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes";
	private static SubLSymbol $sym0$INTEGERP;
	private static SubLInteger $int1$4095;
	private static SubLString $str2$Invalid_Size;
	private static SubLString $str3$Invalid_Position;
	private static SubLInteger $int4$4096;
	private static SubLInteger $int5$8193;
	private static SubLInteger $int6$12291;
	private static SubLInteger $int7$_3;
	private static SubLInteger $int8$_12;
	static {
		me = new bytes();
		$sym0$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
		$int1$4095 = SubLObjectFactory.makeInteger(4095);
		$str2$Invalid_Size = SubLObjectFactory.makeString("Invalid Size");
		$str3$Invalid_Position = SubLObjectFactory.makeString("Invalid Position");
		$int4$4096 = SubLObjectFactory.makeInteger(4096);
		$int5$8193 = SubLObjectFactory.makeInteger(8193);
		$int6$12291 = SubLObjectFactory.makeInteger(12291);
		$int7$_3 = SubLObjectFactory.makeInteger(-3);
		$int8$_12 = SubLObjectFactory.makeInteger(-12);
	}

	@Override
	public void declareFunctions() {
		declare_bytes_file();
	}

	@Override
	public void initializeVariables() {
		init_bytes_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_bytes_file();
	}
}
