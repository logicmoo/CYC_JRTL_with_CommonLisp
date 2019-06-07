package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0009 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0009";
    public static final String myFingerPrint = "59cab115f767837572ec61661372c6689c429d437517747474fc1542d09c4670";
    
    public static SubLObject f317(final SubLObject var1) {
        final SubLObject var2 = Sequences.position((SubLObject)Characters.CHAR_space, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var2) {
            final SubLObject var3 = Sequences.position((SubLObject)Characters.CHAR_space, var1, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), Numbers.add(var2, (SubLObject)ONE_INTEGER), (SubLObject)UNPROVIDED);
            if (NIL != var3) {
                return Sequences.subseq(var1, Numbers.add(var2, (SubLObject)ONE_INTEGER), var3);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f318(final SubLObject var4, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)TEN_INTEGER;
        }
        if (var4.isString()) {
            SubLObject var6 = (SubLObject)ZERO_INTEGER;
            SubLObject var7 = Sequences.position((SubLObject)Characters.CHAR_period, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var6, (SubLObject)UNPROVIDED);
            SubLObject var8 = (SubLObject)NIL;
            while (var6.isInteger()) {
                final SubLObject var9 = reader.read_from_string_ignoring_errors(var4, (SubLObject)NIL, (SubLObject)NIL, var6, var7);
                if (NIL != var9) {
                    var8 = (SubLObject)ConsesLow.cons(var9, var8);
                }
                if (var7.isInteger()) {
                    var6 = Numbers.add(var7, (SubLObject)ONE_INTEGER);
                    var7 = Sequences.position((SubLObject)Characters.CHAR_period, var4, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY), var6, (SubLObject)UNPROVIDED);
                }
                else {
                    var6 = (SubLObject)NIL;
                }
            }
            var8 = Sequences.nreverse(var8);
            if (ONE_INTEGER.numE(Sequences.length(var8))) {
                var8 = (SubLObject)ConsesLow.cons(var5, var8);
            }
            return var8;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f319(final SubLObject var10) {
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        try {
            var12 = streams_high.make_private_string_output_stream();
            SubLObject var13 = (SubLObject)T;
            SubLObject var14 = var10;
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL == var13) {
                    print_high.princ((SubLObject)Characters.CHAR_period, var12);
                }
                print_high.princ(var15, var12);
                var13 = (SubLObject)NIL;
                var14 = var14.rest();
                var15 = var14.first();
            }
            var11 = streams_high.get_output_stream_string(var12);
        }
        finally {
            final SubLObject var16 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                streams_high.close(var12, (SubLObject)UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var16);
            }
        }
        return var11;
    }
    
    public static SubLObject f320() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0009", "f317", "S#311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0009", "f318", "S#312", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0009", "f319", "S#313", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f321() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f322() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f320();
    }
    
    public void initializeVariables() {
        f321();
    }
    
    public void runTopLevelForms() {
        f322();
    }
    
    static {
        me = (SubLFile)new module0009();
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 30 ms
	
	Decompiled with Procyon 0.5.32.
*/