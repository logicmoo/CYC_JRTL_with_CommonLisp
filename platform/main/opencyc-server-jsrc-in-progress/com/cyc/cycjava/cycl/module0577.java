package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0577 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0577";
    public static final String myFingerPrint = "eb0d944495b0498450901ca2a5395fb7adf2efd4e2302dd6eed8bdfa0a8ebf5c";
    public static SubLSymbol $g4224$;
    public static SubLSymbol $g4225$;
    public static SubLSymbol $g4226$;
    public static SubLSymbol $g4227$;
    public static SubLSymbol $g4228$;
    public static SubLSymbol $g4229$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLInteger $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    
    public static SubLObject f35420(final SubLObject var1, final SubLObject var2) {
        f35421(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35422(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX18498_native.class) ? T : NIL);
    }
    
    public static SubLObject f35423(final SubLObject var1) {
        assert NIL != f35422(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f35424(final SubLObject var1) {
        assert NIL != f35422(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f35425(final SubLObject var1) {
        assert NIL != f35422(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f35426(final SubLObject var1) {
        assert NIL != f35422(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f35427(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35422(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f35428(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35422(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f35429(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35422(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f35430(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35422(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f35431(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX18498_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic17$)) {
                f35427(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f35428(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f35429(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f35430(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f35432(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic17$, f35423(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic18$, f35424(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic19$, f35425(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic20$, f35426(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f35433(final SubLObject var11, final SubLObject var12) {
        return f35432(var11, var12);
    }
    
    public static SubLObject f35421(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_level$.getDynamicValue(var15) && var14.numG(print_high.$print_level$.getDynamicValue(var15))) {
            print_high.princ((SubLObject)$ic27$, var2);
        }
        else if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic28$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic29$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            print_high.princ(f35423(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f35434(final SubLObject var20, final SubLObject var21) {
        SubLObject var23;
        final SubLObject var22 = var23 = var20.rest();
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic32$);
        var24 = var23.first();
        final SubLObject var25;
        var23 = (var25 = var23.rest());
        final SubLObject var26 = (SubLObject)$ic33$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var26, (SubLObject)ConsesLow.list((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var25)))), (SubLObject)ConsesLow.list((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic9$, var26), (SubLObject)ConsesLow.list((SubLObject)$ic35$, var24)), (SubLObject)ConsesLow.list((SubLObject)$ic37$, (SubLObject)ConsesLow.list((SubLObject)$ic9$, var26), (SubLObject)$ic38$, var26));
    }
    
    public static SubLObject f35435(final SubLObject var27) {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var27, $g4225$.getDynamicValue(var28), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35436(final SubLObject var1, final SubLObject var2) {
        f35437(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35438(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX38848_native.class) ? T : NIL);
    }
    
    public static SubLObject f35439(final SubLObject var1) {
        assert NIL != f35438(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f35440(final SubLObject var1) {
        assert NIL != f35438(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f35441(final SubLObject var1) {
        assert NIL != f35438(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f35442(final SubLObject var1) {
        assert NIL != f35438(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f35443(final SubLObject var1) {
        assert NIL != f35438(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f35444(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35438(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f35445(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35438(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f35446(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35438(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f35447(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35438(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f35448(final SubLObject var1, final SubLObject var4) {
        assert NIL != f35438(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f35449(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX38848_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic58$)) {
                f35444(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic59$)) {
                f35445(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic60$)) {
                f35446(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic61$)) {
                f35447(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic62$)) {
                f35448(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f35450(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic63$, (SubLObject)FIVE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic58$, f35439(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic59$, f35440(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic60$, f35441(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic61$, f35442(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic62$, f35443(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic63$, (SubLObject)FIVE_INTEGER);
        return var11;
    }
    
    public static SubLObject f35451(final SubLObject var11, final SubLObject var12) {
        return f35450(var11, var12);
    }
    
    public static SubLObject f35437(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_level$.getDynamicValue(var15) && var14.numG(print_high.$print_level$.getDynamicValue(var15))) {
            print_high.princ((SubLObject)$ic27$, var2);
        }
        else if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic28$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic29$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            print_high.princ(f35439(var13), var2);
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f35452() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return Types.sublisp_null($g4228$.getDynamicValue(var15));
    }
    
    public static SubLObject f35453() {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        return Sequences.length($g4228$.getDynamicValue(var15));
    }
    
    public static SubLObject f35454(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = Guids.new_guid();
        final SubLObject var28 = module0038.f2658(Guids.guid_to_string(var27));
        final SubLObject var29 = conses_high.copy_list(var25);
        SubLObject var30 = (SubLObject)NIL;
        var30 = f35449(var29);
        f35444(var30, var28);
        f35447(var30, Time.get_universal_time());
        final SubLObject var31 = $g4227$.getGlobalValue();
        SubLObject var32 = (SubLObject)NIL;
        try {
            var32 = Locks.seize_lock(var31);
            Hashtables.sethash(var28, $g4229$.getDynamicValue(var26), var30);
            final SubLObject var33 = var30;
            if (NIL == conses_high.member(var33, $g4228$.getDynamicValue(var26), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                $g4228$.setDynamicValue((SubLObject)ConsesLow.cons(var33, $g4228$.getDynamicValue(var26)), var26);
            }
        }
        finally {
            if (NIL != var32) {
                Locks.release_lock(var31);
            }
        }
        return var30;
    }
    
    public static SubLObject f35455(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = $g4227$.getGlobalValue();
        SubLObject var45 = (SubLObject)NIL;
        try {
            var45 = Locks.seize_lock(var44);
            $g4228$.setDynamicValue(Sequences.remove(var42, $g4228$.getDynamicValue(var43), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var43);
            Hashtables.remhash(f35439(var42), $g4229$.getDynamicValue(var43));
        }
        finally {
            if (NIL != var45) {
                Locks.release_lock(var44);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35456(final SubLObject var45) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        return Hashtables.gethash(var45, $g4229$.getDynamicValue(var46), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35457(final SubLObject var42) {
        final SubLObject var43 = f35440(var42);
        if (NIL == var43) {
            return (SubLObject)NIL;
        }
        final SubLObject var44 = f35435(var43);
        return var44;
    }
    
    public static SubLObject f35458(final SubLObject var42) {
        final SubLObject var43 = f35457(var42);
        if (NIL == var43) {
            return (SubLObject)NIL;
        }
        final SubLObject var44 = f35424(var43);
        return var44;
    }
    
    public static SubLObject f35459(final SubLObject var42) {
        final SubLObject var43 = f35457(var42);
        if (NIL == var43) {
            return (SubLObject)NIL;
        }
        final SubLObject var44 = f35425(var43);
        return var44;
    }
    
    public static SubLObject f35460(final SubLObject var42) {
        final SubLObject var43 = f35457(var42);
        if (NIL == var43) {
            return (SubLObject)NIL;
        }
        final SubLObject var44 = f35426(var43);
        return var44;
    }
    
    public static SubLObject f35461(final SubLObject var51) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        return Sequences.remove(var51, $g4228$.getDynamicValue(var52), Symbols.symbol_function((SubLObject)$ic66$), Symbols.symbol_function((SubLObject)$ic52$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f35462(final SubLObject var51, final SubLObject var27) {
        final SubLThread var52 = SubLProcess.currentSubLThread();
        final SubLObject var53 = Sequences.remove(var51, $g4228$.getDynamicValue(var52), Symbols.symbol_function((SubLObject)$ic66$), Symbols.symbol_function((SubLObject)$ic52$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var54 = Sequences.remove(var27, var53, Symbols.symbol_function((SubLObject)$ic66$), Symbols.symbol_function((SubLObject)$ic50$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var54;
    }
    
    public static SubLObject f35463() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35420", "S#38850", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35422", "S#38847", 1, 0, false);
        new $f35422$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35423", "S#38851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35424", "S#38852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35425", "S#38853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35426", "S#38854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35427", "S#38855", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35428", "S#38856", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35429", "S#38857", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35430", "S#38858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35431", "S#38859", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35432", "S#38860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35433", "S#38861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35421", "S#38862", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0577", "f35434", "S#38863");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35435", "S#38864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35436", "S#38865", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35438", "S#38849", 1, 0, false);
        new $f35438$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35439", "S#38866", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35440", "S#38867", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35441", "S#38868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35442", "S#38869", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35443", "S#38870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35444", "S#38871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35445", "S#38872", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35446", "S#38873", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35447", "S#38874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35448", "S#38875", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35449", "S#38876", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35450", "S#38877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35451", "S#38878", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35437", "S#38879", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35452", "S#38880", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35453", "S#38881", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35454", "S#38882", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35455", "S#38883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35456", "S#38884", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35457", "S#38885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35458", "S#38886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35459", "S#38887", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35460", "S#38888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35461", "S#38889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0577", "f35462", "S#38890", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35464() {
        $g4224$ = SubLFiles.defconstant("S#38891", (SubLObject)$ic0$);
        $g4225$ = SubLFiles.defparameter("S#38892", Hashtables.make_hash_table((SubLObject)$ic31$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g4226$ = SubLFiles.defconstant("S#38893", (SubLObject)$ic39$);
        $g4227$ = SubLFiles.deflexical("S#38894", Locks.make_lock((SubLObject)$ic65$));
        $g4228$ = SubLFiles.defparameter("S#38895", (SubLObject)NIL);
        $g4229$ = SubLFiles.defparameter("S#38896", Hashtables.make_hash_table((SubLObject)$ic31$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f35465() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4224$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4224$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g4226$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic46$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic47$);
        Structures.def_csetf((SubLObject)$ic48$, (SubLObject)$ic49$);
        Structures.def_csetf((SubLObject)$ic50$, (SubLObject)$ic51$);
        Structures.def_csetf((SubLObject)$ic52$, (SubLObject)$ic53$);
        Structures.def_csetf((SubLObject)$ic54$, (SubLObject)$ic55$);
        Structures.def_csetf((SubLObject)$ic56$, (SubLObject)$ic57$);
        Equality.identity((SubLObject)$ic39$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4226$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic64$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f35463();
    }
    
    public void initializeVariables() {
        f35464();
    }
    
    public void runTopLevelForms() {
        f35465();
    }
    
    static {
        me = (SubLFile)new module0577();
        $g4224$ = null;
        $g4225$ = null;
        $g4226$ = null;
        $g4227$ = null;
        $g4228$ = null;
        $g4229$ = null;
        $ic0$ = makeSymbol("S#18498", "CYC");
        $ic1$ = makeSymbol("S#38847", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#38897", "CYC"), (SubLObject)makeSymbol("S#38898", "CYC"), (SubLObject)makeSymbol("S#38899", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("KEY"), (SubLObject)makeKeyword("SUMMARY-FN"), (SubLObject)makeKeyword("DISPLAY-FN"), (SubLObject)makeKeyword("HANDLER-FN"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#38851", "CYC"), (SubLObject)makeSymbol("S#38852", "CYC"), (SubLObject)makeSymbol("S#38853", "CYC"), (SubLObject)makeSymbol("S#38854", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#38855", "CYC"), (SubLObject)makeSymbol("S#38856", "CYC"), (SubLObject)makeSymbol("S#38857", "CYC"), (SubLObject)makeSymbol("S#38858", "CYC"));
        $ic6$ = makeSymbol("S#38862", "CYC");
        $ic7$ = makeSymbol("S#38850", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#38847", "CYC"));
        $ic9$ = makeSymbol("S#38851", "CYC");
        $ic10$ = makeSymbol("S#38855", "CYC");
        $ic11$ = makeSymbol("S#38852", "CYC");
        $ic12$ = makeSymbol("S#38856", "CYC");
        $ic13$ = makeSymbol("S#38853", "CYC");
        $ic14$ = makeSymbol("S#38857", "CYC");
        $ic15$ = makeSymbol("S#38854", "CYC");
        $ic16$ = makeSymbol("S#38858", "CYC");
        $ic17$ = makeKeyword("KEY");
        $ic18$ = makeKeyword("SUMMARY-FN");
        $ic19$ = makeKeyword("DISPLAY-FN");
        $ic20$ = makeKeyword("HANDLER-FN");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#38859", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#38861", "CYC");
        $ic27$ = makeString("#");
        $ic28$ = makeString("#<");
        $ic29$ = makeKeyword("STREAM");
        $ic30$ = makeKeyword("BASE");
        $ic31$ = makeInteger(64);
        $ic32$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#30", "CYC"));
        $ic33$ = makeUninternedSymbol("US#1951E78");
        $ic34$ = makeSymbol("CLET");
        $ic35$ = makeSymbol("QUOTE");
        $ic36$ = makeSymbol("CSETF");
        $ic37$ = makeSymbol("SETHASH");
        $ic38$ = makeSymbol("S#38892", "CYC");
        $ic39$ = makeSymbol("S#38848", "CYC");
        $ic40$ = makeSymbol("S#38849", "CYC");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#38900", "CYC"), (SubLObject)makeSymbol("S#38901", "CYC"), (SubLObject)makeSymbol("S#710", "CYC"), (SubLObject)makeSymbol("CREATION-TIME"), (SubLObject)makeSymbol("S#1625", "CYC"));
        $ic42$ = ConsesLow.list((SubLObject)makeKeyword("ID-STRING"), (SubLObject)makeKeyword("TYPE-KEY"), (SubLObject)makeKeyword("CYCLIST"), (SubLObject)makeKeyword("CREATION-TIME"), (SubLObject)makeKeyword("DATA"));
        $ic43$ = ConsesLow.list((SubLObject)makeSymbol("S#38866", "CYC"), (SubLObject)makeSymbol("S#38867", "CYC"), (SubLObject)makeSymbol("S#38868", "CYC"), (SubLObject)makeSymbol("S#38869", "CYC"), (SubLObject)makeSymbol("S#38870", "CYC"));
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("S#38871", "CYC"), (SubLObject)makeSymbol("S#38872", "CYC"), (SubLObject)makeSymbol("S#38873", "CYC"), (SubLObject)makeSymbol("S#38874", "CYC"), (SubLObject)makeSymbol("S#38875", "CYC"));
        $ic45$ = makeSymbol("S#38879", "CYC");
        $ic46$ = makeSymbol("S#38865", "CYC");
        $ic47$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#38849", "CYC"));
        $ic48$ = makeSymbol("S#38866", "CYC");
        $ic49$ = makeSymbol("S#38871", "CYC");
        $ic50$ = makeSymbol("S#38867", "CYC");
        $ic51$ = makeSymbol("S#38872", "CYC");
        $ic52$ = makeSymbol("S#38868", "CYC");
        $ic53$ = makeSymbol("S#38873", "CYC");
        $ic54$ = makeSymbol("S#38869", "CYC");
        $ic55$ = makeSymbol("S#38874", "CYC");
        $ic56$ = makeSymbol("S#38870", "CYC");
        $ic57$ = makeSymbol("S#38875", "CYC");
        $ic58$ = makeKeyword("ID-STRING");
        $ic59$ = makeKeyword("TYPE-KEY");
        $ic60$ = makeKeyword("CYCLIST");
        $ic61$ = makeKeyword("CREATION-TIME");
        $ic62$ = makeKeyword("DATA");
        $ic63$ = makeSymbol("S#38876", "CYC");
        $ic64$ = makeSymbol("S#38878", "CYC");
        $ic65$ = makeString("User Actions Lock");
        $ic66$ = makeSymbol("NOT-EQ");
    }
    
    public static final class $sX18498_native extends SubLStructNative
    {
        public SubLObject $key;
        public SubLObject $summary_fn;
        public SubLObject $display_fn;
        public SubLObject $handler_fn;
        public static final SubLStructDeclNative structDecl;
        
        public $sX18498_native() {
            this.$key = (SubLObject)CommonSymbols.NIL;
            this.$summary_fn = (SubLObject)CommonSymbols.NIL;
            this.$display_fn = (SubLObject)CommonSymbols.NIL;
            this.$handler_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$key;
        }
        
        public SubLObject getField3() {
            return this.$summary_fn;
        }
        
        public SubLObject getField4() {
            return this.$display_fn;
        }
        
        public SubLObject getField5() {
            return this.$handler_fn;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$key = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$summary_fn = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$display_fn = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$handler_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX18498_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$key", "$summary_fn", "$display_fn", "$handler_fn" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f35422$UnaryFunction extends UnaryFunction
    {
        public $f35422$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#38847"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f35422(var3);
        }
    }
    
    public static final class $sX38848_native extends SubLStructNative
    {
        public SubLObject $id_string;
        public SubLObject $type_key;
        public SubLObject $cyclist;
        public SubLObject $creation_time;
        public SubLObject $data;
        public static final SubLStructDeclNative structDecl;
        
        public $sX38848_native() {
            this.$id_string = (SubLObject)CommonSymbols.NIL;
            this.$type_key = (SubLObject)CommonSymbols.NIL;
            this.$cyclist = (SubLObject)CommonSymbols.NIL;
            this.$creation_time = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$id_string;
        }
        
        public SubLObject getField3() {
            return this.$type_key;
        }
        
        public SubLObject getField4() {
            return this.$cyclist;
        }
        
        public SubLObject getField5() {
            return this.$creation_time;
        }
        
        public SubLObject getField6() {
            return this.$data;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id_string = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$type_key = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$cyclist = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$creation_time = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX38848_native.class, $ic39$, $ic40$, $ic41$, $ic42$, new String[] { "$id_string", "$type_key", "$cyclist", "$creation_time", "$data" }, $ic43$, $ic44$, $ic45$);
        }
    }
    
    public static final class $f35438$UnaryFunction extends UnaryFunction
    {
        public $f35438$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#38849"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f35438(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 154 ms
	
	Decompiled with Procyon 0.5.32.
*/