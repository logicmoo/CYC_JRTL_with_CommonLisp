package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0041 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0041";
    public static final String myFingerPrint = "eceeceeb474a930c6a4664a7a5760d8ca4072ac62dd1c68e11dc6d3547b39c28";
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLString $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    
    public static SubLObject f3088(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0041.NIL;
        SubLObject var3 = (SubLObject)module0041.$ic0$;
        SubLObject var4 = (SubLObject)module0041.ZERO_INTEGER;
        while (var3 == module0041.$ic0$) {
            final SubLObject var5 = streams_high.read_char(var1, (SubLObject)module0041.UNPROVIDED, (SubLObject)module0041.UNPROVIDED, (SubLObject)module0041.UNPROVIDED);
            if (module0041.NIL == var5) {
                f3089(var1);
            }
            final SubLObject var6 = var5;
            if (var6.eql((SubLObject)Characters.CHAR_quotation)) {
                var3 = (SubLObject)module0041.$ic1$;
            }
            else if (var6.eql((SubLObject)Characters.CHAR_backslash)) {
                var2 = (SubLObject)ConsesLow.cons(var5, var2);
                var4 = Numbers.add(var4, (SubLObject)module0041.ONE_INTEGER);
                final SubLObject var5_7 = streams_high.read_char(var1, (SubLObject)module0041.UNPROVIDED, (SubLObject)module0041.UNPROVIDED, (SubLObject)module0041.UNPROVIDED);
                if (module0041.NIL == var5_7) {
                    f3089(var1);
                }
                var2 = (SubLObject)ConsesLow.cons(var5_7, var2);
                var4 = Numbers.add(var4, (SubLObject)module0041.ONE_INTEGER);
            }
            else {
                var2 = (SubLObject)ConsesLow.cons(var5, var2);
                var4 = Numbers.add(var4, (SubLObject)module0041.ONE_INTEGER);
            }
        }
        var2 = Sequences.nreverse(var2);
        final SubLObject var7 = module0039.f3035(var2, var4);
        final SubLObject var8 = module0039.f2998(var7);
        if (module0041.NIL == var8) {
            return reader.simple_reader_error((SubLObject)module0041.$ic2$, (SubLObject)ConsesLow.list(var7));
        }
        return Values.values(var8, (SubLObject)module0041.T);
    }
    
    public static SubLObject f3090(final SubLObject var5, final SubLObject var1) {
        SubLObject var6 = var5;
        SubLObject var7 = (SubLObject)module0041.$ic3$;
        SubLObject var8 = (SubLObject)module0041.ONE_INTEGER;
        SubLObject var9 = (SubLObject)module0041.ZERO_INTEGER;
        while (var7 == module0041.$ic3$) {
            if (module0041.NIL == var6) {
                f3089(var1);
            }
            final SubLObject var10 = var6;
            if (var10.eql((SubLObject)Characters.CHAR_0) || var10.eql((SubLObject)Characters.CHAR_1) || var10.eql((SubLObject)Characters.CHAR_2) || var10.eql((SubLObject)Characters.CHAR_3) || var10.eql((SubLObject)Characters.CHAR_4) || var10.eql((SubLObject)Characters.CHAR_5) || var10.eql((SubLObject)Characters.CHAR_6) || var10.eql((SubLObject)Characters.CHAR_7) || var10.eql((SubLObject)Characters.CHAR_8) || var10.eql((SubLObject)Characters.CHAR_9) || var10.eql((SubLObject)Characters.CHAR_a) || var10.eql((SubLObject)Characters.CHAR_b) || var10.eql((SubLObject)Characters.CHAR_c) || var10.eql((SubLObject)Characters.CHAR_d) || var10.eql((SubLObject)Characters.CHAR_e) || var10.eql((SubLObject)Characters.CHAR_f) || var10.eql((SubLObject)Characters.CHAR_A) || var10.eql((SubLObject)Characters.CHAR_B) || var10.eql((SubLObject)Characters.CHAR_C) || var10.eql((SubLObject)Characters.CHAR_D) || var10.eql((SubLObject)Characters.CHAR_E) || var10.eql((SubLObject)Characters.CHAR_F)) {
                var9 = Numbers.add(Numbers.ash(var9, (SubLObject)module0041.FOUR_INTEGER), module0038.f2793(var6));
                var6 = streams_high.read_char(var1, (SubLObject)module0041.NIL, (SubLObject)module0041.NIL, (SubLObject)module0041.UNPROVIDED);
                var8 = Numbers.add(var8, (SubLObject)module0041.ONE_INTEGER);
                if (module0041.NIL == var6) {
                    return reader.simple_reader_error((SubLObject)module0041.$ic4$, (SubLObject)ConsesLow.list(var9));
                }
                continue;
            }
            else {
                var7 = (SubLObject)module0041.$ic5$;
                streams_high.unread_char(var6, var1);
            }
        }
        if (var8.numG((SubLObject)module0041.SEVEN_INTEGER)) {
            return reader.simple_reader_error((SubLObject)module0041.$ic6$, (SubLObject)ConsesLow.list(var9));
        }
        if (var8.numL((SubLObject)module0041.THREE_INTEGER)) {
            return reader.simple_reader_error((SubLObject)module0041.$ic7$, (SubLObject)ConsesLow.list(var9));
        }
        final SubLObject var11 = module0039.f2986(var9);
        if (module0041.NIL == var11) {
            return reader.simple_reader_error((SubLObject)module0041.$ic8$, (SubLObject)ConsesLow.list(var9));
        }
        return Values.values(var11, (SubLObject)module0041.T);
    }
    
    public static SubLObject f3091(final SubLObject var1, final SubLObject var13, final SubLObject var14) {
        if (module0041.NIL != var14) {
            return reader.simple_reader_error((SubLObject)module0041.$ic9$, (SubLObject)ConsesLow.list(var13));
        }
        final SubLObject var15 = streams_high.read_char(var1, (SubLObject)module0041.NIL, (SubLObject)module0041.NIL, (SubLObject)module0041.UNPROVIDED);
        if (module0041.NIL == var15) {
            f3089(var1);
        }
        final SubLObject var16 = var15;
        if (var16.eql((SubLObject)Characters.CHAR_quotation)) {
            return f3088(var1);
        }
        if (var16.eql((SubLObject)Characters.CHAR_0) || var16.eql((SubLObject)Characters.CHAR_1) || var16.eql((SubLObject)Characters.CHAR_2) || var16.eql((SubLObject)Characters.CHAR_3) || var16.eql((SubLObject)Characters.CHAR_4) || var16.eql((SubLObject)Characters.CHAR_5) || var16.eql((SubLObject)Characters.CHAR_6) || var16.eql((SubLObject)Characters.CHAR_7) || var16.eql((SubLObject)Characters.CHAR_8) || var16.eql((SubLObject)Characters.CHAR_9) || var16.eql((SubLObject)Characters.CHAR_a) || var16.eql((SubLObject)Characters.CHAR_b) || var16.eql((SubLObject)Characters.CHAR_c) || var16.eql((SubLObject)Characters.CHAR_d) || var16.eql((SubLObject)Characters.CHAR_e) || var16.eql((SubLObject)Characters.CHAR_f) || var16.eql((SubLObject)Characters.CHAR_A) || var16.eql((SubLObject)Characters.CHAR_B) || var16.eql((SubLObject)Characters.CHAR_C) || var16.eql((SubLObject)Characters.CHAR_D) || var16.eql((SubLObject)Characters.CHAR_E) || var16.eql((SubLObject)Characters.CHAR_F)) {
            return f3090(var15, var1);
        }
        return reader.simple_reader_error((SubLObject)module0041.$ic10$, (SubLObject)ConsesLow.list(var15));
    }
    
    public static SubLObject f3089(final SubLObject var1) {
        return reader.simple_reader_error((SubLObject)module0041.$ic11$, (SubLObject)ConsesLow.list(var1));
    }
    
    public static SubLObject f3092() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0041", "f3088", "S#4468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0041", "f3090", "S#4469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0041", "f3091", "S#4470", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0041", "f3089", "S#4471", 1, 0, false);
        return (SubLObject)module0041.NIL;
    }
    
    public static SubLObject f3093() {
        return (SubLObject)module0041.NIL;
    }
    
    public static SubLObject f3094() {
        reader.set_dispatch_macro_character((SubLObject)Characters.CHAR_hash, (SubLObject)Characters.CHAR_U, (SubLObject)module0041.$ic12$, (SubLObject)module0041.UNPROVIDED);
        return (SubLObject)module0041.NIL;
    }
    
    public void declareFunctions() {
        f3092();
    }
    
    public void initializeVariables() {
        f3093();
    }
    
    public void runTopLevelForms() {
        f3094();
    }
    
    static {
        me = (SubLFile)new module0041();
        $ic0$ = SubLObjectFactory.makeKeyword("IN-STRING");
        $ic1$ = SubLObjectFactory.makeKeyword("OPEN");
        $ic2$ = SubLObjectFactory.makeString("#u\"~a\" does not specify a  UNICODE string.");
        $ic3$ = SubLObjectFactory.makeKeyword("IN-CHARS");
        $ic4$ = SubLObjectFactory.makeString("Error at end of unicode code point: #u~s~%");
        $ic5$ = SubLObjectFactory.makeKeyword("COMPLETE");
        $ic6$ = SubLObjectFactory.makeString("Error at end in unicode code point, too many digits: #u~s~%");
        $ic7$ = SubLObjectFactory.makeString("Error at end in unicode code point, too few digits, at least 2 required: #u~s~%");
        $ic8$ = SubLObjectFactory.makeString("#u~x does not specify a  UNICODE codpoint.");
        $ic9$ = SubLObjectFactory.makeString("The ~S reader macro does not take an argument.");
        $ic10$ = SubLObjectFactory.makeString("Invalid unicode character/string, the char after #u, in this case (~s), must be either a hex-digit or a double quote(\").");
        $ic11$ = SubLObjectFactory.makeString("End of file on stream ~S.");
        $ic12$ = SubLObjectFactory.makeSymbol("S#4470", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0041.class
	Total time: 51 ms
	
	Decompiled with Procyon 0.5.32.
*/