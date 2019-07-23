/* For LarKC */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.format.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.annotation.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;

public class bytes extends SubLTranslatedFile {
    public static SubLObject declare_bytes_file() {
	declareFunction(myName, "sublisp_byte", "BYTE", 2, 0, false);
	declareFunction(myName, "ldb", "LDB", 2, 0, false);
	declareFunction(myName, "dpb", "DPB", 3, 0, false);
	return NIL;
    }

    @SubL(source = "sublisp/bytes.lisp", position = 2510L)
    public static SubLObject dpb(SubLObject newbyte, SubLObject bytespec, SubLObject bits) {
	assert NIL != Types.integerp(bytespec) : bytespec;
	assert NIL != Types.integerp(newbyte) : newbyte;
	assert NIL != Types.integerp(bits) : bits;
	SubLObject position = Numbers.logand(bytespec, bytes.$int$4095);
	SubLObject size = Numbers.ash(bytespec, bytes.$int$_12);
	SubLObject mask = Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, position));
	SubLObject trimmed_newbits = NIL;
	trimmed_newbits = Numbers.logand(Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, size)), newbyte);
	return Numbers.logior(Numbers.logand(mask, bits), Numbers.ash(trimmed_newbits, position), Numbers.ash(Numbers.ash(bits, Numbers.minus(Numbers.add(position, size))), Numbers.add(position, size)));
    }

    public static SubLObject init_bytes_file() {
	return NIL;
    }

    @SubL(source = "sublisp/bytes.lisp", position = 1703L)
    public static SubLObject ldb(SubLObject bytespec, SubLObject bits) {
	assert NIL != Types.integerp(bytespec) : bytespec;
	assert NIL != Types.integerp(bits) : bits;
	if (bytespec.eql(bytes.$int$4096))
	    return Numbers.logand(CommonSymbols.ONE_INTEGER, bits);
	if (bytespec.eql(bytes.$int$8193))
	    return Numbers.logand(CommonSymbols.THREE_INTEGER, Numbers.ash(bits, CommonSymbols.MINUS_ONE_INTEGER));
	if (bytespec.eql(bytes.$int$12291))
	    return Numbers.logand(CommonSymbols.SEVEN_INTEGER, Numbers.ash(bits, bytes.$int$_3));
	SubLObject size = Numbers.ash(bytespec, bytes.$int$_12);
	SubLObject position = Numbers.logand(bytespec, bytes.$int$4095);
	SubLObject mask = Numbers.lognot(Numbers.ash(CommonSymbols.MINUS_ONE_INTEGER, size));
	return Numbers.logand(mask, Numbers.ash(bits, Numbers.minus(position)));
    }

    public static SubLObject setup_bytes_file() {
	return NIL;
    }

    @SubL(source = "sublisp/bytes.lisp", position = 1139L)
    public static SubLObject sublisp_byte(SubLObject size, SubLObject position) {
	assert NIL != Types.integerp(size) : size;
	assert NIL != Types.integerp(position) : position;
	if (size.isNegative() || size.numG(bytes.$int$4095)) {
	    Errors.error(bytes.$str2$Invalid_Size);
	    return NIL;
	}
	if (position.isNegative() || size.numG(bytes.$int$4095)) {
	    Errors.error(bytes.$str3$Invalid_Position);
	    return NIL;
	}
	return Numbers.add(Numbers.multiply(size, bytes.$int$4096), position);
    }

    public static SubLFile me;
    @GetSet
    public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes";
    private static SubLSymbol $sym0$INTEGERP;
    private static SubLInteger $int$4095;
    private static SubLString $str2$Invalid_Size;
    private static SubLString $str3$Invalid_Position;
    private static SubLInteger $int$4096;
    private static SubLInteger $int$8193;
    private static SubLInteger $int$12291;
    private static SubLInteger $int$_3;
    private static SubLInteger $int$_12;
    static {
	me = new bytes();
	$sym0$INTEGERP = makeSymbol("INTEGERP");
	$int$4095 = makeInteger(4095);
	$str2$Invalid_Size = makeString("Invalid Size");
	$str3$Invalid_Position = makeString("Invalid Position");
	$int$4096 = makeInteger(4096);
	$int$8193 = makeInteger(8193);
	$int$12291 = makeInteger(12291);
	$int$_3 = makeInteger(-3);
	$int$_12 = makeInteger(-12);
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
