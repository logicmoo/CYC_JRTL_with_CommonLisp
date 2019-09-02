/**
 * For LarKC
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;



import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logior;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.lognot;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class bytes extends SubLTranslatedFile {
    public static SubLObject declare_bytes_file() {
        declareFunction("sublisp_byte", "BYTE", 2, 0, false);
        declareFunction("ldb", "LDB", 2, 0, false);
        declareFunction("dpb", "DPB", 3, 0, false);
        return NIL;
    }

    public static SubLObject dpb(SubLObject newbyte, SubLObject bytespec, SubLObject bits) {
        assert NIL != integerp(bytespec) : "Types.integerp " + bytespec;
        assert NIL != integerp(newbyte) : "Types.integerp " + newbyte;
        assert NIL != integerp(bits) : "Types.integerp " + bits;
        SubLObject position = logand(bytespec, $int$4095);
        SubLObject size = ash(bytespec, $int$_12);
        SubLObject mask = lognot(ash(MINUS_ONE_INTEGER, position));
        SubLObject trimmed_newbits = NIL;
        trimmed_newbits = logand(lognot(ash(MINUS_ONE_INTEGER, size)), newbyte);
        return logior(logand(mask, bits), ash(trimmed_newbits, position), ash(ash(bits, minus(add(position, size))), add(position, size)));
    }

    public static SubLObject init_bytes_file() {
        return NIL;
    }

    public static SubLObject ldb(SubLObject bytespec, SubLObject bits) {
        assert NIL != integerp(bytespec) : "Types.integerp " + bytespec;
        assert NIL != integerp(bits) : "Types.integerp " + bits;
        if (bytespec.eql($int$4096))
            return logand(ONE_INTEGER, bits);

        if (bytespec.eql($int$8193))
            return logand(THREE_INTEGER, ash(bits, MINUS_ONE_INTEGER));

        if (bytespec.eql($int$12291))
            return logand(SEVEN_INTEGER, ash(bits, $int$_3));

        SubLObject size = ash(bytespec, $int$_12);
        SubLObject position = logand(bytespec, $int$4095);
        SubLObject mask = lognot(ash(MINUS_ONE_INTEGER, size));
        return logand(mask, ash(bits, minus(position)));
    }

    public static SubLObject setup_bytes_file() {
        return NIL;
    }

    public static SubLObject sublisp_byte(SubLObject size, SubLObject position) {
        assert NIL != integerp(size) : "Types.integerp " + size;
        assert NIL != integerp(position) : "Types.integerp " + position;
        if (size.isNegative() || size.numG($int$4095)) {
            Errors.error($$$Invalid_Size);
            return NIL;
        }
        if (position.isNegative() || size.numG($int$4095)) {
            Errors.error($$$Invalid_Position);
            return NIL;
        }
        return add(multiply(size, $int$4096), position);
    }

    public static final SubLFile me = new bytes();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes";





    public static final SubLString $$$Invalid_Size = makeString("Invalid Size");

    public static final SubLString $$$Invalid_Position = makeString("Invalid Position");



    private static final SubLInteger $int$8193 = makeInteger(8193);

    private static final SubLInteger $int$12291 = makeInteger(12291);

    private static final SubLInteger $int$_3 = makeInteger(-3);

    private static final SubLInteger $int$_12 = makeInteger(-12);

    static {










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

