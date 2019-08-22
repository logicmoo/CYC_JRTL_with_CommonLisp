package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0090 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0090";
    public static final String myFingerPrint = "71368893c14ebf91e8533b075b52502796e747590c06662ba6c45e36d155ff5e";
    public static SubLSymbol $g1184$;
    public static SubLSymbol $g1185$;
    public static SubLSymbol $g1186$;
    public static SubLSymbol $g1187$;
    public static SubLSymbol $g1188$;
    public static SubLSymbol $g1189$;
    public static SubLSymbol $g1190$;
    public static SubLSymbol $g1191$;
    public static SubLSymbol $g1192$;
    public static SubLSymbol $g1193$;
    public static SubLSymbol $g1194$;
    public static SubLSymbol $g1195$;
    public static SubLSymbol $g1196$;
    public static SubLSymbol $g1197$;
    public static SubLSymbol $g1198$;
    public static SubLSymbol $g1199$;
    public static SubLSymbol $g1200$;
    public static SubLSymbol $g1201$;
    public static SubLSymbol $g1202$;
    public static SubLSymbol $g1203$;
    public static SubLSymbol $g1204$;
    private static SubLSymbol $g1205$;
    public static SubLSymbol $g1206$;
    public static SubLSymbol $g1207$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLList $ic8$;
    private static final SubLList $ic9$;
    private static final SubLList $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
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
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLInteger $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    
    public static SubLObject f6127(final SubLObject var1) {
        return f6128(var1);
    }
    
    public static SubLObject f6129(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isSymbol() || NIL != f6127(var1));
    }
    
    public static SubLObject f6130(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        f6131(var2);
        return var2;
    }
    
    public static SubLObject f6132(final SubLObject var2) {
        return f6133(var2);
    }
    
    public static SubLObject f6134(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        return f6135(var2);
    }
    
    public static SubLObject f6136(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        return Numbers.divide(f6134(var2), f6132(var2));
    }
    
    public static SubLObject f6137(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        return Numbers.numE(f6134(var2), f6132(var2));
    }
    
    public static SubLObject f6138(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        return Numbers.zerop(f6134(var2));
    }
    
    public static SubLObject f6139(final SubLObject var2, final SubLObject var1) {
        assert NIL != f6127(var2) : var2;
        return f6140(var2, var1);
    }
    
    public static SubLObject f6141(final SubLObject var2, final SubLObject var1) {
        assert NIL != f6127(var2) : var2;
        return f6142(var2, var1);
    }
    
    public static SubLObject f6143(final SubLObject var2, final SubLObject var1) {
        assert NIL != f6127(var2) : var2;
        f6144(var2, var1);
        return var1;
    }
    
    public static SubLObject f6145(final SubLObject var2) {
        if (NIL != f6146(var2)) {
            f6147(f6148(var2));
        }
        return var2;
    }
    
    public static SubLObject f6149(final SubLObject var2, final SubLObject var3) {
        if (NIL != f6146(var2)) {
            final SubLObject var4 = f6148(var2);
            SubLObject var5;
            for (var5 = (SubLObject)NIL, var5 = (SubLObject)ZERO_INTEGER; var5.numL(var3); var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER)) {
                f6147(var4);
            }
        }
        return var2;
    }
    
    public static SubLObject f6150(final SubLObject var2) {
        if (NIL != f6146(var2)) {
            f6151(f6148(var2));
        }
        return var2;
    }
    
    public static SubLObject f6152(final SubLObject var2, final SubLObject var6) {
        assert NIL != f6127(var2) : var2;
        assert NIL != Types.keywordp(var6) : var6;
        return f6153(var2, var6);
    }
    
    public static SubLObject f6154(final SubLObject var2, final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        assert NIL != f6127(var2) : var2;
        assert NIL != Types.keywordp(var6) : var6;
        if (NIL != f6152(var2, var6)) {
            return f6155(var2, var6, var7);
        }
        return (SubLObject)$ic2$;
    }
    
    public static SubLObject f6156(final SubLObject var2, final SubLObject var6, final SubLObject var8) {
        final SubLObject var9 = f6154(var2, var6, (SubLObject)UNPROVIDED);
        if (var9 != $ic2$) {
            f6157(var2, var6, var8);
        }
        return var9;
    }
    
    public static SubLObject f6158(final SubLObject var2, final SubLObject var1) {
        if (NIL != f6141(var2, var1)) {
            f6159(var2, var1);
        }
        return var2;
    }
    
    public static SubLObject f6160(final SubLObject var2, final SubLObject var10) {
        assert NIL != f6127(var2) : var2;
        f6161(var2, var10);
        return var2;
    }
    
    public static SubLObject f6148(final SubLObject var2) {
        if (NIL != f6146(var2)) {
            return f6162(var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6163(final SubLObject var2) {
        if (NIL != f6146(var2)) {
            f6164(var2);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6165(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        final SubLObject var3 = f6166();
        return f6167(var2, var3);
    }
    
    public static SubLObject f6168(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        return f6169(var2);
    }
    
    public static SubLObject f6146(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        return f6170(var2);
    }
    
    public static SubLObject f6171(final SubLObject var2) {
        assert NIL != f6127(var2) : var2;
        return f6172(var2);
    }
    
    public static SubLObject f6173(final SubLObject var2, final SubLObject var11) {
        assert NIL != f6127(var2) : var2;
        assert NIL != Types.function_spec_p(var11) : var11;
        f6174(var2, var11);
        return var2;
    }
    
    public static SubLObject f6175(final SubLObject var2, final SubLObject var11) {
        assert NIL != f6127(var2) : var2;
        assert NIL != Types.function_spec_p(var11) : var11;
        f6176(var2, var11);
        return var2;
    }
    
    public static SubLObject f6177(final SubLObject var1) {
        return Errors.error((SubLObject)$ic4$, var1);
    }
    
    public static SubLObject f6128(final SubLObject var1) {
        final SubLObject var2 = Structures.method_func(var1, $g1184$.getGlobalValue());
        if (NIL != var2) {
            return Functions.funcall(var2, var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6131(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, $g1185$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6133(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, $g1186$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6135(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, $g1187$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6140(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = Structures.method_func(var2, $g1188$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2, var1);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6142(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = Structures.method_func(var2, $g1189$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2, var1);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6144(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = Structures.method_func(var2, $g1190$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2, var1);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6153(final SubLObject var2, final SubLObject var6) {
        final SubLObject var7 = Structures.method_func(var2, $g1191$.getGlobalValue());
        if (NIL != var7) {
            return Functions.funcall(var7, var2, var6);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6155(final SubLObject var2, final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = Structures.method_func(var2, $g1192$.getGlobalValue());
        if (NIL != var8) {
            return Functions.funcall(var8, var2, var6, var7);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6157(final SubLObject var2, final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = Structures.method_func(var2, $g1193$.getGlobalValue());
        if (NIL != var8) {
            return Functions.funcall(var8, var2, var6, var7);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6159(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = Structures.method_func(var2, $g1194$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2, var1);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6161(final SubLObject var2, final SubLObject var10) {
        final SubLObject var11 = Structures.method_func(var2, $g1195$.getGlobalValue());
        if (NIL != var11) {
            return Functions.funcall(var11, var2, var10);
        }
        return f6178(var2, var10);
    }
    
    public static SubLObject f6178(final SubLObject var2, final SubLObject var10) {
        SubLObject var11 = var10;
        SubLObject var12 = (SubLObject)NIL;
        var12 = var11.first();
        while (NIL != var11) {
            if (NIL != f6141(var2, var12)) {
                f6158(var2, var12);
            }
            var11 = var11.rest();
            var12 = var11.first();
        }
        return var2;
    }
    
    public static SubLObject f6162(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, $g1196$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6164(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, $g1197$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6167(final SubLObject var2, final SubLObject var4) {
        final SubLObject var5 = Structures.method_func(var2, $g1198$.getGlobalValue());
        if (NIL != var5) {
            return Functions.funcall(var5, var2, var4);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6169(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, $g1199$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6170(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, $g1200$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6172(final SubLObject var2) {
        final SubLObject var3 = Structures.method_func(var2, $g1201$.getGlobalValue());
        if (NIL != var3) {
            return Functions.funcall(var3, var2);
        }
        return f6177(var2);
    }
    
    public static SubLObject f6174(final SubLObject var2, final SubLObject var11) {
        final SubLObject var12 = Structures.method_func(var2, $g1202$.getGlobalValue());
        if (NIL != var12) {
            return Functions.funcall(var12, var2, var11);
        }
        f6179(var2, var11);
        return var2;
    }
    
    public static SubLObject f6179(final SubLObject var2, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = f6171(var2);
        SubLObject var16;
        for (SubLObject var14 = (SubLObject)NIL; NIL == var14; var14 = (SubLObject)makeBoolean(NIL == var16)) {
            var12.resetMultipleValues();
            final SubLObject var15 = module0052.f3693(var13);
            var16 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var16) {
                Functions.funcall(var11, var15);
            }
        }
        return var2;
    }
    
    public static SubLObject f6176(final SubLObject var2, final SubLObject var11) {
        final SubLObject var12 = Structures.method_func(var2, $g1203$.getGlobalValue());
        if (NIL != var12) {
            return Functions.funcall(var12, var2, var11);
        }
        f6180(var2, var11);
        return var2;
    }
    
    public static SubLObject f6180(final SubLObject var2, final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        final SubLObject var13 = f6171(var2);
        SubLObject var16;
        for (SubLObject var14 = (SubLObject)NIL; NIL == var14; var14 = (SubLObject)makeBoolean(NIL == var16)) {
            var12.resetMultipleValues();
            final SubLObject var15 = module0052.f3693(var13);
            var16 = var12.secondMultipleValue();
            var12.resetMultipleValues();
            if (NIL != var16) {
                f6143(var2, var15);
                Functions.funcall(var11, var15);
            }
        }
        return var2;
    }
    
    public static SubLObject f6181(final SubLObject var37, final SubLObject var38) {
        f6182(var37, var38, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6183(final SubLObject var37) {
        return (SubLObject)((var37.getClass() == $sX7780_native.class) ? T : NIL);
    }
    
    public static SubLObject f6184(final SubLObject var37) {
        assert NIL != f6183(var37) : var37;
        return var37.getField2();
    }
    
    public static SubLObject f6185(final SubLObject var37) {
        assert NIL != f6183(var37) : var37;
        return var37.getField3();
    }
    
    public static SubLObject f6186(final SubLObject var37, final SubLObject var40) {
        assert NIL != f6183(var37) : var37;
        return var37.setField2(var40);
    }
    
    public static SubLObject f6187(final SubLObject var37, final SubLObject var40) {
        assert NIL != f6183(var37) : var37;
        return var37.setField3(var40);
    }
    
    public static SubLObject f6188(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLObject var42 = (SubLObject)new $sX7780_native();
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        for (var43 = (SubLObject)NIL, var43 = var41; NIL != var43; var43 = conses_high.cddr(var43)) {
            var44 = var43.first();
            var45 = conses_high.cadr(var43);
            var46 = var44;
            if (var46.eql((SubLObject)$ic19$)) {
                f6186(var42, var45);
            }
            else if (var46.eql((SubLObject)$ic20$)) {
                f6187(var42, var45);
            }
            else {
                Errors.error((SubLObject)$ic21$, var44);
            }
        }
        return var42;
    }
    
    public static SubLObject f6189(final SubLObject var47, final SubLObject var48) {
        Functions.funcall(var48, var47, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var48, var47, (SubLObject)$ic24$, (SubLObject)$ic19$, f6184(var47));
        Functions.funcall(var48, var47, (SubLObject)$ic24$, (SubLObject)$ic20$, f6185(var47));
        Functions.funcall(var48, var47, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)TWO_INTEGER);
        return var47;
    }
    
    public static SubLObject f6190(final SubLObject var47, final SubLObject var48) {
        return f6189(var47, var48);
    }
    
    public static SubLObject f6182(final SubLObject var1, final SubLObject var38, final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var50)) {
            print_high.print_not_readable(var1, var38);
        }
        else {
            streams_high.write_string((SubLObject)$ic27$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var1), new SubLObject[] { $ic28$, var38 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var38);
            streams_high.write_string((SubLObject)$ic29$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f6184(var1), var38);
            streams_high.write_string((SubLObject)$ic30$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f6185(var1), var38);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var38);
            PrintLow.write(Equality.pointer(var1), new SubLObject[] { $ic28$, var38, $ic31$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var38);
        }
        return var1;
    }
    
    public static SubLObject f6166() {
        final SubLObject var4 = f6188((SubLObject)UNPROVIDED);
        f6191(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f6191(final SubLObject var4, SubLObject var54, SubLObject var55) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)ZERO_INTEGER;
        }
        if (var55 == UNPROVIDED) {
            var55 = (SubLObject)ZERO_INTEGER;
        }
        f6186(var4, var54);
        f6187(var4, var55);
        return var4;
    }
    
    public static SubLObject f6192(final SubLObject var54, final SubLObject var55) {
        enforceType(var54, $ic32$);
        enforceType(var55, $ic32$);
        return f6191(f6166(), var54, var55);
    }
    
    public static SubLObject f6193(final SubLObject var4) {
        f6191(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var4;
    }
    
    public static SubLObject f6147(final SubLObject var4) {
        assert NIL != f6183(var4) : var4;
        f6186(var4, Numbers.add(f6184(var4), (SubLObject)ONE_INTEGER));
        return var4;
    }
    
    public static SubLObject f6151(final SubLObject var4) {
        assert NIL != f6183(var4) : var4;
        f6187(var4, Numbers.add(f6185(var4), (SubLObject)ONE_INTEGER));
        return var4;
    }
    
    public static SubLObject f6194(final SubLObject var4) {
        return f6184(var4);
    }
    
    public static SubLObject f6195(final SubLObject var4) {
        return f6185(var4);
    }
    
    public static SubLObject f6196(final SubLObject var4) {
        final SubLObject var5 = f6194(var4);
        final SubLObject var6 = f6197(var4);
        return Numbers.divide(var5, var6);
    }
    
    public static SubLObject f6198(final SubLObject var4) {
        final SubLObject var5 = f6195(var4);
        final SubLObject var6 = f6197(var4);
        return Numbers.divide(var5, var6);
    }
    
    public static SubLObject f6197(final SubLObject var4) {
        return Numbers.add(f6184(var4), f6185(var4));
    }
    
    public static SubLObject f6199(final SubLObject var57) {
        assert NIL != f6127(var57) : var57;
        final SubLObject var58 = f6132(var57);
        final SubLObject var59 = f6148(var57);
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = (SubLObject)NIL;
        SubLObject var62 = (SubLObject)NIL;
        if (NIL != f6183(var59)) {
            var60 = f6194(var59);
            var61 = f6195(var59);
            var62 = Numbers.numG(var61, var60);
        }
        return Values.values(var58, var60, var61, var62);
    }
    
    public static SubLObject f6200(final SubLObject var1, final SubLObject var38) {
        f6201(var1, var38);
        return var1;
    }
    
    public static SubLObject f6201(final SubLObject var60, final SubLObject var38) {
        module0021.f1110($g1205$.getGlobalValue(), var38);
        f6202(var60, var38);
        return var60;
    }
    
    public static SubLObject f6202(final SubLObject var60, final SubLObject var38) {
        module0021.f1038(f6194(var60), var38);
        module0021.f1038(f6195(var60), var38);
        return var60;
    }
    
    public static SubLObject f6203(final SubLObject var38) {
        final SubLObject var39 = module0021.f1060(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var40 = module0021.f1060(var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f6192(var39, var40);
    }
    
    public static SubLObject f6204(final SubLObject var37, final SubLObject var38) {
        f6205(var37, var38, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6206(final SubLObject var37) {
        return (SubLObject)((var37.getClass() == $sX7782_native.class) ? T : NIL);
    }
    
    public static SubLObject f6207(final SubLObject var37) {
        assert NIL != f6206(var37) : var37;
        return var37.getField2();
    }
    
    public static SubLObject f6208(final SubLObject var37) {
        assert NIL != f6206(var37) : var37;
        return var37.getField3();
    }
    
    public static SubLObject f6209(final SubLObject var37, final SubLObject var40) {
        assert NIL != f6206(var37) : var37;
        return var37.setField2(var40);
    }
    
    public static SubLObject f6210(final SubLObject var37, final SubLObject var40) {
        assert NIL != f6206(var37) : var37;
        return var37.setField3(var40);
    }
    
    public static SubLObject f6211(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLObject var42 = (SubLObject)new $sX7782_native();
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        for (var43 = (SubLObject)NIL, var43 = var41; NIL != var43; var43 = conses_high.cddr(var43)) {
            var44 = var43.first();
            var45 = conses_high.cadr(var43);
            var46 = var44;
            if (var46.eql((SubLObject)$ic49$)) {
                f6209(var42, var45);
            }
            else if (var46.eql((SubLObject)$ic50$)) {
                f6210(var42, var45);
            }
            else {
                Errors.error((SubLObject)$ic21$, var44);
            }
        }
        return var42;
    }
    
    public static SubLObject f6212(final SubLObject var47, final SubLObject var48) {
        Functions.funcall(var48, var47, (SubLObject)$ic22$, (SubLObject)$ic51$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var48, var47, (SubLObject)$ic24$, (SubLObject)$ic49$, f6207(var47));
        Functions.funcall(var48, var47, (SubLObject)$ic24$, (SubLObject)$ic50$, f6208(var47));
        Functions.funcall(var48, var47, (SubLObject)$ic25$, (SubLObject)$ic51$, (SubLObject)TWO_INTEGER);
        return var47;
    }
    
    public static SubLObject f6213(final SubLObject var47, final SubLObject var48) {
        return f6212(var47, var48);
    }
    
    public static SubLObject f6214(final SubLObject var64) {
        final SubLObject var65 = f6211((SubLObject)UNPROVIDED);
        f6209(var65, var64);
        return var65;
    }
    
    public static SubLObject f6215(final SubLObject var66, SubLObject var67) {
        if (var67 == UNPROVIDED) {
            var67 = Symbols.symbol_function((SubLObject)EQL);
        }
        return f6214(module0089.f6073(var66, var67));
    }
    
    public static SubLObject f6205(final SubLObject var1, final SubLObject var38, final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var50)) {
            print_high.print_not_readable(var1, var38);
        }
        else {
            streams_high.write_string((SubLObject)$ic27$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var1), new SubLObject[] { $ic28$, var38 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var38);
            streams_high.write_string((SubLObject)$ic53$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f6207(var1), var38);
            streams_high.write_string((SubLObject)$ic54$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var51 = f6208(var1);
            if (NIL != f6183(var51)) {
                print_high.princ(var51, var38);
            }
            else {
                streams_high.write_string((SubLObject)$ic55$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var38);
            PrintLow.write(Equality.pointer(var1), new SubLObject[] { $ic28$, var38, $ic31$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var38);
        }
        return var1;
    }
    
    public static SubLObject f6216(final SubLObject var1) {
        return (SubLObject)T;
    }
    
    public static SubLObject f6217(final SubLObject var1) {
        return f6218(var1);
    }
    
    public static SubLObject f6219(final SubLObject var2) {
        return f6220(var2);
    }
    
    public static SubLObject f6221(final SubLObject var2) {
        return f6222(var2);
    }
    
    public static SubLObject f6223(final SubLObject var2, final SubLObject var1) {
        return f6224(var2, var1);
    }
    
    public static SubLObject f6225(final SubLObject var2, final SubLObject var1) {
        return f6226(var2, var1);
    }
    
    public static SubLObject f6227(final SubLObject var2, final SubLObject var1) {
        return f6228(var2, var1);
    }
    
    public static SubLObject f6229(final SubLObject var2, final SubLObject var6) {
        return f6230(var2, var6);
    }
    
    public static SubLObject f6231(final SubLObject var2, final SubLObject var6, final SubLObject var7) {
        return f6232(var2, var6, var7);
    }
    
    public static SubLObject f6233(final SubLObject var2, final SubLObject var6, final SubLObject var7) {
        return f6234(var2, var6, var7);
    }
    
    public static SubLObject f6235(final SubLObject var2, final SubLObject var1) {
        return f6236(var2, var1);
    }
    
    public static SubLObject f6237(final SubLObject var2, final SubLObject var10) {
        return f6238(var2, var10);
    }
    
    public static SubLObject f6239(final SubLObject var2) {
        return f6240(var2);
    }
    
    public static SubLObject f6241(final SubLObject var2) {
        return f6242(var2);
    }
    
    public static SubLObject f6243(final SubLObject var2, final SubLObject var4) {
        return f6244(var2, var4);
    }
    
    public static SubLObject f6245(final SubLObject var2) {
        return f6246(var2);
    }
    
    public static SubLObject f6247(final SubLObject var2) {
        return f6248(var2);
    }
    
    public static SubLObject f6249(final SubLObject var2) {
        return f6250(var2);
    }
    
    public static SubLObject f6251(final SubLObject var2, final SubLObject var11) {
        return f6252(var2, var11);
    }
    
    public static SubLObject f6253(final SubLObject var2, final SubLObject var11) {
        return f6254(var2, var11);
    }
    
    public static SubLObject f6218(final SubLObject var65) {
        module0089.f6092(f6207(var65));
        return var65;
    }
    
    public static SubLObject f6220(final SubLObject var65) {
        return module0089.f6046(f6207(var65));
    }
    
    public static SubLObject f6224(final SubLObject var65, final SubLObject var1) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        var66.resetMultipleValues();
        final SubLObject var67 = module0089.f6085(f6207(var65), var1, var1);
        final SubLObject var68 = var66.secondMultipleValue();
        final SubLObject var69 = var66.thirdMultipleValue();
        var66.resetMultipleValues();
        return (NIL != var69) ? var67 : var1;
    }
    
    public static SubLObject f6222(final SubLObject var65) {
        return module0089.f6069(f6207(var65));
    }
    
    public static SubLObject f6226(final SubLObject var65, final SubLObject var1) {
        return module0089.f6081(f6207(var65), var1);
    }
    
    public static SubLObject f6228(final SubLObject var65, final SubLObject var1) {
        return module0089.f6087(f6207(var65), var1);
    }
    
    public static SubLObject f6230(final SubLObject var65, final SubLObject var6) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6232(final SubLObject var65, final SubLObject var6, final SubLObject var7) {
        return var7;
    }
    
    public static SubLObject f6234(final SubLObject var65, final SubLObject var6, final SubLObject var7) {
        return var7;
    }
    
    public static SubLObject f6236(final SubLObject var65, final SubLObject var1) {
        return module0089.f6084(f6207(var65), var1, var1);
    }
    
    public static SubLObject f6238(final SubLObject var65, final SubLObject var10) {
        return f6178(var65, var10);
    }
    
    public static SubLObject f6240(final SubLObject var65) {
        return f6208(var65);
    }
    
    public static SubLObject f6242(final SubLObject var65) {
        return f6193(f6208(var65));
    }
    
    public static SubLObject f6244(final SubLObject var65, final SubLObject var4) {
        f6210(var65, var4);
        return var65;
    }
    
    public static SubLObject f6246(final SubLObject var65) {
        final SubLObject var66 = f6208(var65);
        f6210(var65, (SubLObject)NIL);
        return var66;
    }
    
    public static SubLObject f6248(final SubLObject var65) {
        return f6183(f6208(var65));
    }
    
    public static SubLObject f6250(final SubLObject var65) {
        return module0089.f6109(f6207(var65));
    }
    
    public static SubLObject f6252(final SubLObject var65, final SubLObject var11) {
        return f6179(var65, var11);
    }
    
    public static SubLObject f6254(final SubLObject var65, final SubLObject var11) {
        return f6180(var65, var11);
    }
    
    public static SubLObject f6255(final SubLObject var37, final SubLObject var38) {
        f6256(var37, var38, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6257(final SubLObject var37) {
        return (SubLObject)((var37.getClass() == $sX7784_native.class) ? T : NIL);
    }
    
    public static SubLObject f6258(final SubLObject var37) {
        assert NIL != f6257(var37) : var37;
        return var37.getField2();
    }
    
    public static SubLObject f6259(final SubLObject var37) {
        assert NIL != f6257(var37) : var37;
        return var37.getField3();
    }
    
    public static SubLObject f6260(final SubLObject var37) {
        assert NIL != f6257(var37) : var37;
        return var37.getField4();
    }
    
    public static SubLObject f6261(final SubLObject var37, final SubLObject var40) {
        assert NIL != f6257(var37) : var37;
        return var37.setField2(var40);
    }
    
    public static SubLObject f6262(final SubLObject var37, final SubLObject var40) {
        assert NIL != f6257(var37) : var37;
        return var37.setField3(var40);
    }
    
    public static SubLObject f6263(final SubLObject var37, final SubLObject var40) {
        assert NIL != f6257(var37) : var37;
        return var37.setField4(var40);
    }
    
    public static SubLObject f6264(SubLObject var41) {
        if (var41 == UNPROVIDED) {
            var41 = (SubLObject)NIL;
        }
        final SubLObject var42 = (SubLObject)new $sX7784_native();
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        SubLObject var46;
        for (var43 = (SubLObject)NIL, var43 = var41; NIL != var43; var43 = conses_high.cddr(var43)) {
            var44 = var43.first();
            var45 = conses_high.cadr(var43);
            var46 = var44;
            if (var46.eql((SubLObject)$ic91$)) {
                f6261(var42, var45);
            }
            else if (var46.eql((SubLObject)$ic92$)) {
                f6262(var42, var45);
            }
            else if (var46.eql((SubLObject)$ic93$)) {
                f6263(var42, var45);
            }
            else {
                Errors.error((SubLObject)$ic21$, var44);
            }
        }
        return var42;
    }
    
    public static SubLObject f6265(final SubLObject var47, final SubLObject var48) {
        Functions.funcall(var48, var47, (SubLObject)$ic22$, (SubLObject)$ic94$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var48, var47, (SubLObject)$ic24$, (SubLObject)$ic91$, f6258(var47));
        Functions.funcall(var48, var47, (SubLObject)$ic24$, (SubLObject)$ic92$, f6259(var47));
        Functions.funcall(var48, var47, (SubLObject)$ic24$, (SubLObject)$ic93$, f6260(var47));
        Functions.funcall(var48, var47, (SubLObject)$ic25$, (SubLObject)$ic94$, (SubLObject)THREE_INTEGER);
        return var47;
    }
    
    public static SubLObject f6266(final SubLObject var47, final SubLObject var48) {
        return f6265(var47, var48);
    }
    
    public static SubLObject f6267(final SubLObject var57, final SubLObject var77) {
        assert NIL != f6127(var57) : var57;
        assert NIL != module0057.f4158(var77) : var77;
        final SubLObject var78 = f6264((SubLObject)UNPROVIDED);
        f6261(var78, var57);
        f6262(var78, (SubLObject)NIL);
        f6263(var78, var77);
        return var78;
    }
    
    public static SubLObject f6268(final SubLObject var78) {
        assert NIL != f6127(var78) : var78;
        final SubLObject var79 = f6259(var78);
        f6262(var78, (SubLObject)NIL);
        return Sequences.nreverse(var79);
    }
    
    public static SubLObject f6269(final SubLObject var78) {
        assert NIL != f6127(var78) : var78;
        return f6258(var78);
    }
    
    public static SubLObject f6270(final SubLObject var78, final SubLObject var80, final SubLObject var81) {
        final SubLObject var82 = f6260(var78);
        final SubLObject var83 = module0057.f4175(var82);
        f6262(var78, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var83, var80, var81), f6259(var78)));
        return var78;
    }
    
    public static SubLObject f6256(final SubLObject var1, final SubLObject var38, final SubLObject var49) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var50)) {
            print_high.print_not_readable(var1, var38);
        }
        else {
            streams_high.write_string((SubLObject)$ic27$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var1), new SubLObject[] { $ic28$, var38 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var38);
            streams_high.write_string((SubLObject)$ic97$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            print_high.princ(f6258(var1), var38);
            streams_high.write_string((SubLObject)$ic54$, var38, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            streams_high.write_char((SubLObject)Characters.CHAR_space, var38);
            PrintLow.write(Equality.pointer(var1), new SubLObject[] { $ic28$, var38, $ic31$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var38);
        }
        return var1;
    }
    
    public static SubLObject f6271(final SubLObject var2) {
        return (SubLObject)T;
    }
    
    public static SubLObject f6272(final SubLObject var2) {
        return f6273(var2);
    }
    
    public static SubLObject f6274(final SubLObject var2) {
        return f6275(var2);
    }
    
    public static SubLObject f6276(final SubLObject var2) {
        return f6277(var2);
    }
    
    public static SubLObject f6278(final SubLObject var2, final SubLObject var1) {
        return f6279(var2, var1);
    }
    
    public static SubLObject f6280(final SubLObject var2, final SubLObject var1) {
        return f6281(var2, var1);
    }
    
    public static SubLObject f6282(final SubLObject var2, final SubLObject var1) {
        return f6283(var2, var1);
    }
    
    public static SubLObject f6284(final SubLObject var2, final SubLObject var6) {
        return f6285(var2, var6);
    }
    
    public static SubLObject f6286(final SubLObject var2, final SubLObject var6, final SubLObject var7) {
        return f6287(var2, var6, var7);
    }
    
    public static SubLObject f6288(final SubLObject var2, final SubLObject var6, final SubLObject var7) {
        return f6289(var2, var6, var7);
    }
    
    public static SubLObject f6290(final SubLObject var2, final SubLObject var1) {
        return f6291(var2, var1);
    }
    
    public static SubLObject f6292(final SubLObject var2, final SubLObject var10) {
        return f6293(var2, var10);
    }
    
    public static SubLObject f6294(final SubLObject var2) {
        return f6295(var2);
    }
    
    public static SubLObject f6296(final SubLObject var2) {
        return f6297(var2);
    }
    
    public static SubLObject f6298(final SubLObject var2, final SubLObject var4) {
        return f6299(var2, var4);
    }
    
    public static SubLObject f6300(final SubLObject var2) {
        return f6301(var2);
    }
    
    public static SubLObject f6302(final SubLObject var2) {
        return f6303(var2);
    }
    
    public static SubLObject f6304(final SubLObject var2) {
        return f6305(var2);
    }
    
    public static SubLObject f6306(final SubLObject var2, final SubLObject var11) {
        return f6307(var2, var11);
    }
    
    public static SubLObject f6308(final SubLObject var2, final SubLObject var11) {
        return f6309(var2, var11);
    }
    
    public static SubLObject f6275(final SubLObject var2) {
        final SubLObject var3 = f6258(var2);
        return f6132(var3);
    }
    
    public static SubLObject f6277(final SubLObject var2) {
        final SubLObject var3 = f6258(var2);
        return f6134(var3);
    }
    
    public static SubLObject f6301(final SubLObject var2) {
        final SubLObject var3 = f6258(var2);
        return f6168(var3);
    }
    
    public static SubLObject f6299(final SubLObject var2, final SubLObject var4) {
        final SubLObject var5 = f6258(var2);
        return f6167(var5, var4);
    }
    
    public static SubLObject f6295(final SubLObject var2) {
        final SubLObject var3 = f6258(var2);
        return f6148(var3);
    }
    
    public static SubLObject f6287(final SubLObject var2, final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = f6258(var2);
        return f6154(var8, var6, var7);
    }
    
    public static SubLObject f6303(final SubLObject var2) {
        final SubLObject var3 = f6258(var2);
        return f6146(var3);
    }
    
    public static SubLObject f6291(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = f6258(var2);
        f6270(var2, (SubLObject)$ic118$, var1);
        return f6158(var3, var1);
    }
    
    public static SubLObject f6293(final SubLObject var2, final SubLObject var10) {
        return f6178(var2, var10);
    }
    
    public static SubLObject f6273(final SubLObject var2) {
        final SubLObject var3 = f6258(var2);
        return f6130(var3);
    }
    
    public static SubLObject f6297(final SubLObject var2) {
        final SubLObject var3 = f6258(var2);
        return f6163(var3);
    }
    
    public static SubLObject f6289(final SubLObject var2, final SubLObject var6, final SubLObject var7) {
        final SubLObject var8 = f6258(var2);
        return f6156(var8, var6, var7);
    }
    
    public static SubLObject f6285(final SubLObject var2, final SubLObject var6) {
        final SubLObject var7 = f6258(var2);
        return f6152(var7, var6);
    }
    
    public static SubLObject f6279(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = f6258(var2);
        f6270(var2, (SubLObject)$ic119$, var1);
        return f6139(var3, var1);
    }
    
    public static SubLObject f6281(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = f6258(var2);
        return f6141(var3, var1);
    }
    
    public static SubLObject f6283(final SubLObject var2, final SubLObject var1) {
        final SubLObject var3 = f6258(var2);
        f6270(var2, (SubLObject)$ic120$, var1);
        return f6143(var3, var1);
    }
    
    public static SubLObject f6309(final SubLObject var2, final SubLObject var11) {
        return f6180(var2, var11);
    }
    
    public static SubLObject f6307(final SubLObject var2, final SubLObject var11) {
        return f6179(var2, var11);
    }
    
    public static SubLObject f6305(final SubLObject var2) {
        final SubLObject var3 = f6258(var2);
        return f6171(var3);
    }
    
    public static SubLObject f6310(final SubLObject var66) {
        return f6311(f6215(var66, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f6311(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !f6134(var2).isZero()) {
            Errors.error((SubLObject)$ic129$, var2);
        }
        SubLObject var4;
        SubLObject var5;
        for (var4 = f6132(var2), var5 = (SubLObject)NIL, var5 = (SubLObject)ZERO_INTEGER; var5.numL(var4); var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL != f6141(var2, var5)) {
                Errors.error((SubLObject)$ic130$, var2, var5);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var5.numE(f6139(var2, var5))) {
                Errors.error((SubLObject)$ic131$, var2, var5);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f6141(var2, var5)) {
                Errors.error((SubLObject)$ic132$, var2, var5);
            }
        }
        SubLObject var6 = f6134(var2);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var4.numE(var6)) {
            Errors.error((SubLObject)$ic133$, var4, var6);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f6137(var2)) {
            Errors.error((SubLObject)$ic134$, var2);
        }
        for (var5 = (SubLObject)NIL, var5 = (SubLObject)ZERO_INTEGER; var5.numL(var4); var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f6141(var2, var5)) {
                Errors.error((SubLObject)$ic132$, var2, var5);
            }
            f6143(var2, var5);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL != f6141(var2, var5)) {
                Errors.error((SubLObject)$ic135$, var2, var5);
            }
        }
        var6 = f6134(var2);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && !var6.isZero()) {
            Errors.error((SubLObject)$ic136$, var4, var6);
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var3) && NIL == f6138(var2)) {
            Errors.error((SubLObject)$ic137$, var2);
        }
        return (SubLObject)$ic138$;
    }
    
    public static SubLObject f6312(final SubLObject var90, final SubLObject var91, final SubLObject var92) {
        final SubLThread var93 = SubLProcess.currentSubLThread();
        SubLObject var94 = (SubLObject)NIL;
        SubLObject var95 = (SubLObject)NIL;
        SubLObject var96 = (SubLObject)NIL;
        var94 = var92;
        var95 = var94.first();
        for (var96 = (SubLObject)ZERO_INTEGER; NIL != var94; var94 = var94.rest(), var95 = var94.first(), var96 = Numbers.add((SubLObject)ONE_INTEGER, var96)) {
            final SubLObject var97 = f6139(var90, var95);
            final SubLObject var98 = f6139(var91, var95);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var93) && !var97.eql(var98)) {
                Errors.error((SubLObject)$ic139$, new SubLObject[] { var96, var95, var90, var97, var91, var98 });
            }
        }
        return (SubLObject)$ic138$;
    }
    
    public static SubLObject f6313(final SubLObject var90, final SubLObject var91, final SubLObject var92, SubLObject var97) {
        if (var97 == UNPROVIDED) {
            var97 = (SubLObject)ONE_INTEGER;
        }
        f6312(var90, var91, var92);
        SubLObject var98 = (SubLObject)ZERO_INTEGER;
        SubLObject var99 = (SubLObject)ZERO_INTEGER;
        SubLObject var100;
        SubLObject var101;
        SubLObject var102;
        SubLObject var103;
        SubLObject var104;
        SubLObject var105;
        for (var100 = (SubLObject)NIL, var100 = (SubLObject)ZERO_INTEGER; var100.numL(var97); var100 = Numbers.add(var100, (SubLObject)ONE_INTEGER)) {
            var101 = (SubLObject)NIL;
            var102 = (SubLObject)NIL;
            f6130(var90);
            f6130(var91);
            Storage.gc((SubLObject)UNPROVIDED);
            var103 = Time.get_internal_real_time();
            var104 = var92;
            var105 = (SubLObject)NIL;
            var105 = var104.first();
            while (NIL != var104) {
                f6139(var91, var105);
                var104 = var104.rest();
                var105 = var104.first();
            }
            var102 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var103), time_high.$internal_time_units_per_second$.getGlobalValue());
            var99 = Numbers.add(var99, var102);
            Storage.gc((SubLObject)UNPROVIDED);
            var103 = Time.get_internal_real_time();
            var104 = var92;
            var105 = (SubLObject)NIL;
            var105 = var104.first();
            while (NIL != var104) {
                f6139(var90, var105);
                var104 = var104.rest();
                var105 = var104.first();
            }
            var101 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var103), time_high.$internal_time_units_per_second$.getGlobalValue());
            var98 = Numbers.add(var98, var101);
        }
        return Values.values(var99.numL(var98) ? var91 : var90, var98, var99);
    }
    
    public static SubLObject f6314(final SubLObject var90, final SubLObject var91, final SubLObject var66, final SubLObject var104, SubLObject var97) {
        if (var97 == UNPROVIDED) {
            var97 = (SubLObject)ONE_INTEGER;
        }
        final SubLObject var105 = f6315(var66, var104);
        return f6313(var90, var91, var105, var97);
    }
    
    public static SubLObject f6315(final SubLObject var66, final SubLObject var104) {
        SubLObject var105 = var66;
        SubLObject var107;
        final SubLObject var106 = var107 = (SubLObject)ConsesLow.make_list(Numbers.multiply(var66, var104), (SubLObject)UNPROVIDED);
        SubLObject var108;
        SubLObject var109;
        for (var108 = (SubLObject)NIL, var108 = (SubLObject)ZERO_INTEGER; var108.numL(var104); var108 = Numbers.add(var108, (SubLObject)ONE_INTEGER)) {
            for (var109 = (SubLObject)NIL, var109 = (SubLObject)ZERO_INTEGER; var109.numL(var66); var109 = Numbers.add(var109, (SubLObject)ONE_INTEGER)) {
                ConsesLow.rplaca(var107, random.random(var105));
                var107 = var107.rest();
            }
            var105 = Numbers.add(var105, var66);
        }
        return var106;
    }
    
    public static SubLObject f6316(final SubLObject var64) {
        assert NIL != module0089.f6045(var64) : var64;
        final SubLObject var65 = module0067.f4880(module0089.f6094(var64), module0089.f6069(var64));
        final SubLObject var66 = (SubLObject)$ic141$;
        SubLObject var67 = module0089.f6097(var64, var66);
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var69 = (SubLObject)NIL;
        while (NIL == module0089.f6098(var64, var67)) {
            var68 = module0089.f6099(var67);
            var69 = module0089.f6100(var67);
            var67 = module0089.f6101(var67, var66);
            module0067.f4886(var65, var68, var69);
        }
        return var65;
    }
    
    public static SubLObject f6317() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6127", "S#7786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6129", "S#7787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6130", "S#7788", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6132", "S#7789", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6134", "S#7790", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6136", "S#7791", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6137", "S#7792", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6138", "S#7793", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6139", "S#7794", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6141", "S#7795", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6143", "S#7796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6145", "S#7797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6149", "S#7798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6150", "S#7799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6152", "S#7800", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6154", "S#7801", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6156", "S#7802", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6158", "S#7803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6160", "S#7804", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6148", "S#7805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6163", "S#7806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6165", "S#7807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6168", "S#7808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6146", "S#7809", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6171", "S#7810", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6173", "S#7811", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6175", "S#7812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6177", "S#7813", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6128", "S#7814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6131", "S#7815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6133", "S#7816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6135", "S#7817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6140", "S#7818", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6142", "S#7819", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6144", "S#7820", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6153", "S#7821", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6155", "S#7822", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6157", "S#7823", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6159", "S#7824", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6161", "S#7825", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6178", "S#7826", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6162", "S#7827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6164", "S#7828", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6167", "S#7829", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6169", "S#7830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6170", "S#7831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6172", "S#7832", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6174", "S#7833", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6179", "S#7834", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6176", "S#7835", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6180", "S#7836", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6181", "S#7837", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6183", "S#7781", 1, 0, false);
        new $f6183$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6184", "S#7838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6185", "S#7839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6186", "S#7840", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6187", "S#7841", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6188", "S#7842", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6189", "S#7843", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6190", "S#7844", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6182", "S#7845", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6166", "S#7846", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6191", "S#7847", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6192", "S#7848", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6193", "S#7849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6147", "S#7850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6151", "S#7851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6194", "S#7852", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6195", "S#7853", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6196", "S#7854", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6198", "S#7855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6197", "S#7856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6199", "S#7857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6200", "S#7858", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6201", "S#7859", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6202", "S#7860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6203", "S#7861", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6204", "S#7862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6206", "S#7783", 1, 0, false);
        new $f6206$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6207", "S#7863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6208", "S#7864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6209", "S#7865", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6210", "S#7866", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6211", "S#7867", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6212", "S#7868", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6213", "S#7869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6214", "S#7870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6215", "S#7871", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6205", "S#7872", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6216", "S#7873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6217", "S#7874", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6219", "S#7875", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6221", "S#7876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6223", "S#7877", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6225", "S#7878", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6227", "S#7879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6229", "S#7880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6231", "S#7881", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6233", "S#7882", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6235", "S#7883", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6237", "S#7884", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6239", "S#7885", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6241", "S#7886", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6243", "S#7887", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6245", "S#7888", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6247", "S#7889", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6249", "S#7890", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6251", "S#7891", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6253", "S#7892", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6218", "S#7893", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6220", "S#7894", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6224", "S#7895", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6222", "S#7896", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6226", "S#7897", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6228", "S#7898", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6230", "S#7899", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6232", "S#7900", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6234", "S#7901", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6236", "S#7902", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6238", "S#7903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6240", "S#7904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6242", "S#7905", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6244", "S#7906", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6246", "S#7907", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6248", "S#7908", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6250", "S#7909", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6252", "S#7910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6254", "S#7911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6255", "S#7912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6257", "S#7785", 1, 0, false);
        new $f6257$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6258", "S#7913", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6259", "S#7914", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6260", "S#7915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6261", "S#7916", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6262", "S#7917", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6263", "S#7918", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6264", "S#7919", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6265", "S#7920", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6266", "S#7921", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6267", "S#7922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6268", "S#7923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6269", "S#7924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6270", "S#7925", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6256", "S#7926", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6271", "S#7927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6272", "S#7928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6274", "S#7929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6276", "S#7930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6278", "S#7931", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6280", "S#7932", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6282", "S#7933", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6284", "S#7934", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6286", "S#7935", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6288", "S#7936", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6290", "S#7937", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6292", "S#7938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6294", "S#7939", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6296", "S#7940", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6298", "S#7941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6300", "S#7942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6302", "S#7943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6304", "S#7944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6306", "S#7945", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6308", "S#7946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6275", "S#7947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6277", "S#7948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6301", "S#7949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6299", "S#7950", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6295", "S#7951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6287", "S#7952", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6303", "S#7953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6291", "S#7954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6293", "S#7955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6273", "S#7956", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6297", "S#7957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6289", "S#7958", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6285", "S#7959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6279", "S#7960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6281", "S#7961", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6283", "S#7962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6309", "S#7963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6307", "S#7964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6305", "S#7965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6310", "S#7966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6311", "S#7967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6312", "S#7968", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6313", "S#7969", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6314", "S#7970", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6315", "S#7971", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0090", "f6316", "S#3042", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6318() {
        $g1184$ = SubLFiles.deflexical("S#7972", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1185$ = SubLFiles.deflexical("S#7973", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1186$ = SubLFiles.deflexical("S#7974", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1187$ = SubLFiles.deflexical("S#7975", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1188$ = SubLFiles.deflexical("S#7976", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1189$ = SubLFiles.deflexical("S#7977", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1190$ = SubLFiles.deflexical("S#7978", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1191$ = SubLFiles.deflexical("S#7979", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1192$ = SubLFiles.deflexical("S#7980", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1193$ = SubLFiles.deflexical("S#7981", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1194$ = SubLFiles.deflexical("S#7982", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1195$ = SubLFiles.deflexical("S#7983", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1196$ = SubLFiles.deflexical("S#7984", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1197$ = SubLFiles.deflexical("S#7985", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1198$ = SubLFiles.deflexical("S#7986", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1199$ = SubLFiles.deflexical("S#7987", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1200$ = SubLFiles.deflexical("S#7988", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1201$ = SubLFiles.deflexical("S#7989", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1202$ = SubLFiles.deflexical("S#7990", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1203$ = SubLFiles.deflexical("S#7991", Vectors.make_vector((SubLObject)$ic5$, (SubLObject)NIL));
        $g1204$ = SubLFiles.defconstant("S#7992", (SubLObject)$ic6$);
        $g1205$ = SubLFiles.defconstant("S#7993", (SubLObject)$ic33$);
        $g1206$ = SubLFiles.defconstant("S#7994", (SubLObject)$ic36$);
        $g1207$ = SubLFiles.defconstant("S#7995", (SubLObject)$ic76$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f6319() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1204$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic13$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Equality.identity((SubLObject)$ic6$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1204$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        module0021.f1193($g1205$.getGlobalValue(), (SubLObject)$ic34$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1204$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic43$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic44$);
        Structures.def_csetf((SubLObject)$ic45$, (SubLObject)$ic46$);
        Structures.def_csetf((SubLObject)$ic47$, (SubLObject)$ic48$);
        Equality.identity((SubLObject)$ic36$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic52$));
        Structures.register_method($g1184$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic56$));
        Structures.register_method($g1185$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic57$));
        Structures.register_method($g1186$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic58$));
        Structures.register_method($g1187$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic59$));
        Structures.register_method($g1188$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic60$));
        Structures.register_method($g1189$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic61$));
        Structures.register_method($g1190$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic62$));
        Structures.register_method($g1191$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic63$));
        Structures.register_method($g1192$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic64$));
        Structures.register_method($g1193$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic65$));
        Structures.register_method($g1194$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic66$));
        Structures.register_method($g1195$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic67$));
        Structures.register_method($g1196$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic68$));
        Structures.register_method($g1197$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic69$));
        Structures.register_method($g1198$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic70$));
        Structures.register_method($g1199$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic71$));
        Structures.register_method($g1200$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic72$));
        Structures.register_method($g1201$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic73$));
        Structures.register_method($g1202$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic74$));
        Structures.register_method($g1203$.getGlobalValue(), $g1206$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic75$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic83$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic84$);
        Structures.def_csetf((SubLObject)$ic85$, (SubLObject)$ic86$);
        Structures.def_csetf((SubLObject)$ic87$, (SubLObject)$ic88$);
        Structures.def_csetf((SubLObject)$ic89$, (SubLObject)$ic90$);
        Equality.identity((SubLObject)$ic76$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic95$));
        Structures.register_method($g1184$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic98$));
        Structures.register_method($g1185$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic99$));
        Structures.register_method($g1186$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic100$));
        Structures.register_method($g1187$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic101$));
        Structures.register_method($g1188$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic102$));
        Structures.register_method($g1189$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic103$));
        Structures.register_method($g1190$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic104$));
        Structures.register_method($g1191$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic105$));
        Structures.register_method($g1192$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic106$));
        Structures.register_method($g1193$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic107$));
        Structures.register_method($g1194$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic108$));
        Structures.register_method($g1195$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic109$));
        Structures.register_method($g1196$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic110$));
        Structures.register_method($g1197$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic111$));
        Structures.register_method($g1198$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic112$));
        Structures.register_method($g1199$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic113$));
        Structures.register_method($g1200$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic114$));
        Structures.register_method($g1201$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic115$));
        Structures.register_method($g1202$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic116$));
        Structures.register_method($g1203$.getGlobalValue(), $g1207$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic117$));
        module0027.f1449((SubLObject)$ic121$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic122$, NIL, $ic123$, NIL, $ic124$, NIL, $ic125$, $ic126$, $ic127$, T }), (SubLObject)$ic128$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f6317();
    }
    
    public void initializeVariables() {
        f6318();
    }
    
    public void runTopLevelForms() {
        f6319();
    }
    
    static {
        me = (SubLFile)new module0090();
        $g1184$ = null;
        $g1185$ = null;
        $g1186$ = null;
        $g1187$ = null;
        $g1188$ = null;
        $g1189$ = null;
        $g1190$ = null;
        $g1191$ = null;
        $g1192$ = null;
        $g1193$ = null;
        $g1194$ = null;
        $g1195$ = null;
        $g1196$ = null;
        $g1197$ = null;
        $g1198$ = null;
        $g1199$ = null;
        $g1200$ = null;
        $g1201$ = null;
        $g1202$ = null;
        $g1203$ = null;
        $g1204$ = null;
        $g1205$ = null;
        $g1206$ = null;
        $g1207$ = null;
        $ic0$ = makeSymbol("S#7786", "CYC");
        $ic1$ = makeSymbol("KEYWORDP");
        $ic2$ = makeKeyword("UNSUPPORTED");
        $ic3$ = makeSymbol("FUNCTION-SPEC-P");
        $ic4$ = makeString("Not implemented for ~A.");
        $ic5$ = makeInteger(256);
        $ic6$ = makeSymbol("S#7780", "CYC");
        $ic7$ = makeSymbol("S#7781", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("S#7996", "CYC"), (SubLObject)makeSymbol("S#7997", "CYC"));
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("HIT-COUNT"), (SubLObject)makeKeyword("MISS-COUNT"));
        $ic10$ = ConsesLow.list((SubLObject)makeSymbol("S#7838", "CYC"), (SubLObject)makeSymbol("S#7839", "CYC"));
        $ic11$ = ConsesLow.list((SubLObject)makeSymbol("S#7840", "CYC"), (SubLObject)makeSymbol("S#7841", "CYC"));
        $ic12$ = makeSymbol("S#7845", "CYC");
        $ic13$ = makeSymbol("S#7837", "CYC");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7781", "CYC"));
        $ic15$ = makeSymbol("S#7838", "CYC");
        $ic16$ = makeSymbol("S#7840", "CYC");
        $ic17$ = makeSymbol("S#7839", "CYC");
        $ic18$ = makeSymbol("S#7841", "CYC");
        $ic19$ = makeKeyword("HIT-COUNT");
        $ic20$ = makeKeyword("MISS-COUNT");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#7842", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#7844", "CYC");
        $ic27$ = makeString("#<");
        $ic28$ = makeKeyword("STREAM");
        $ic29$ = makeString("Hits: ");
        $ic30$ = makeString(" Misses: ");
        $ic31$ = makeKeyword("BASE");
        $ic32$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic33$ = makeInteger(129);
        $ic34$ = makeSymbol("S#7861", "CYC");
        $ic35$ = makeSymbol("S#7858", "CYC");
        $ic36$ = makeSymbol("S#7782", "CYC");
        $ic37$ = makeSymbol("S#7783", "CYC");
        $ic38$ = ConsesLow.list((SubLObject)makeSymbol("S#4495", "CYC"), (SubLObject)makeSymbol("S#7998", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)makeKeyword("CACHE"), (SubLObject)makeKeyword("METRICS"));
        $ic40$ = ConsesLow.list((SubLObject)makeSymbol("S#7863", "CYC"), (SubLObject)makeSymbol("S#7864", "CYC"));
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#7865", "CYC"), (SubLObject)makeSymbol("S#7866", "CYC"));
        $ic42$ = makeSymbol("S#7872", "CYC");
        $ic43$ = makeSymbol("S#7862", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7783", "CYC"));
        $ic45$ = makeSymbol("S#7863", "CYC");
        $ic46$ = makeSymbol("S#7865", "CYC");
        $ic47$ = makeSymbol("S#7864", "CYC");
        $ic48$ = makeSymbol("S#7866", "CYC");
        $ic49$ = makeKeyword("CACHE");
        $ic50$ = makeKeyword("METRICS");
        $ic51$ = makeSymbol("S#7867", "CYC");
        $ic52$ = makeSymbol("S#7869", "CYC");
        $ic53$ = makeString("Cache: ");
        $ic54$ = makeString(" ");
        $ic55$ = makeString("(no metrics)");
        $ic56$ = makeSymbol("S#7873", "CYC");
        $ic57$ = makeSymbol("S#7874", "CYC");
        $ic58$ = makeSymbol("S#7875", "CYC");
        $ic59$ = makeSymbol("S#7876", "CYC");
        $ic60$ = makeSymbol("S#7877", "CYC");
        $ic61$ = makeSymbol("S#7878", "CYC");
        $ic62$ = makeSymbol("S#7879", "CYC");
        $ic63$ = makeSymbol("S#7880", "CYC");
        $ic64$ = makeSymbol("S#7881", "CYC");
        $ic65$ = makeSymbol("S#7882", "CYC");
        $ic66$ = makeSymbol("S#7883", "CYC");
        $ic67$ = makeSymbol("S#7884", "CYC");
        $ic68$ = makeSymbol("S#7885", "CYC");
        $ic69$ = makeSymbol("S#7886", "CYC");
        $ic70$ = makeSymbol("S#7887", "CYC");
        $ic71$ = makeSymbol("S#7888", "CYC");
        $ic72$ = makeSymbol("S#7889", "CYC");
        $ic73$ = makeSymbol("S#7890", "CYC");
        $ic74$ = makeSymbol("S#7891", "CYC");
        $ic75$ = makeSymbol("S#7892", "CYC");
        $ic76$ = makeSymbol("S#7784", "CYC");
        $ic77$ = makeSymbol("S#7785", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("S#7999", "CYC"), (SubLObject)makeSymbol("S#8000", "CYC"), (SubLObject)makeSymbol("S#8001", "CYC"));
        $ic79$ = ConsesLow.list((SubLObject)makeKeyword("CACHE-STRATEGY"), (SubLObject)makeKeyword("RECORDS"), (SubLObject)makeKeyword("TIMESTAMPER"));
        $ic80$ = ConsesLow.list((SubLObject)makeSymbol("S#7913", "CYC"), (SubLObject)makeSymbol("S#7914", "CYC"), (SubLObject)makeSymbol("S#7915", "CYC"));
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("S#7916", "CYC"), (SubLObject)makeSymbol("S#7917", "CYC"), (SubLObject)makeSymbol("S#7918", "CYC"));
        $ic82$ = makeSymbol("S#7926", "CYC");
        $ic83$ = makeSymbol("S#7912", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7785", "CYC"));
        $ic85$ = makeSymbol("S#7913", "CYC");
        $ic86$ = makeSymbol("S#7916", "CYC");
        $ic87$ = makeSymbol("S#7914", "CYC");
        $ic88$ = makeSymbol("S#7917", "CYC");
        $ic89$ = makeSymbol("S#7915", "CYC");
        $ic90$ = makeSymbol("S#7918", "CYC");
        $ic91$ = makeKeyword("CACHE-STRATEGY");
        $ic92$ = makeKeyword("RECORDS");
        $ic93$ = makeKeyword("TIMESTAMPER");
        $ic94$ = makeSymbol("S#7919", "CYC");
        $ic95$ = makeSymbol("S#7921", "CYC");
        $ic96$ = makeSymbol("S#910", "CYC");
        $ic97$ = makeString(" wrapped: ");
        $ic98$ = makeSymbol("S#7927", "CYC");
        $ic99$ = makeSymbol("S#7928", "CYC");
        $ic100$ = makeSymbol("S#7929", "CYC");
        $ic101$ = makeSymbol("S#7930", "CYC");
        $ic102$ = makeSymbol("S#7931", "CYC");
        $ic103$ = makeSymbol("S#7932", "CYC");
        $ic104$ = makeSymbol("S#7933", "CYC");
        $ic105$ = makeSymbol("S#7934", "CYC");
        $ic106$ = makeSymbol("S#7935", "CYC");
        $ic107$ = makeSymbol("S#7936", "CYC");
        $ic108$ = makeSymbol("S#7937", "CYC");
        $ic109$ = makeSymbol("S#7938", "CYC");
        $ic110$ = makeSymbol("S#7939", "CYC");
        $ic111$ = makeSymbol("S#7940", "CYC");
        $ic112$ = makeSymbol("S#7941", "CYC");
        $ic113$ = makeSymbol("S#7942", "CYC");
        $ic114$ = makeSymbol("S#7943", "CYC");
        $ic115$ = makeSymbol("S#7944", "CYC");
        $ic116$ = makeSymbol("S#7945", "CYC");
        $ic117$ = makeSymbol("S#7946", "CYC");
        $ic118$ = makeKeyword("NOTE-REF");
        $ic119$ = makeKeyword("TRACK");
        $ic120$ = makeKeyword("UNTRACK");
        $ic121$ = makeSymbol("S#7966", "CYC");
        $ic122$ = makeKeyword("TEST");
        $ic123$ = makeKeyword("OWNER");
        $ic124$ = makeKeyword("CLASSES");
        $ic125$ = makeKeyword("KB");
        $ic126$ = makeKeyword("TINY");
        $ic127$ = makeKeyword("WORKING?");
        $ic128$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TEN_INTEGER), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TWENTY_INTEGER), (SubLObject)makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeInteger(50)), (SubLObject)makeKeyword("SUCCESS")));
        $ic129$ = makeString("Cannot properly validate dirty cache strategy ~A.");
        $ic130$ = makeString("Strategy ~A is tracking item ~A before it is added.");
        $ic131$ = makeString("Strategy ~A is suggesting to remove item ~A before the cache is full.");
        $ic132$ = makeString("Strategy ~A is not tracking item ~A that was just added.");
        $ic133$ = makeString("After adding ~A items to an empty cache, the cache contains ~A items.");
        $ic134$ = makeString("The strategy ~A does not implement FULL-P correctly.");
        $ic135$ = makeString("Strategy ~A is tracking item ~A though it is no longer present.");
        $ic136$ = makeString("After removing ~A items from a full cache, the cache still contains ~A items.");
        $ic137$ = makeString("The strategy ~A is not implementing EMPTY-P correctly.");
        $ic138$ = makeKeyword("SUCCESS");
        $ic139$ = makeString("The two strategies disagree on the result of adding item #~A (~A).~%~A gives ~A, ~A gives ~A.");
        $ic140$ = makeSymbol("S#3048", "CYC");
        $ic141$ = makeKeyword("NEWEST");
    }
    
    public static final class $sX7780_native extends SubLStructNative
    {
        public SubLObject $hit_count;
        public SubLObject $miss_count;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7780_native() {
            this.$hit_count = (SubLObject)CommonSymbols.NIL;
            this.$miss_count = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$hit_count;
        }
        
        public SubLObject getField3() {
            return this.$miss_count;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$hit_count = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$miss_count = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7780_native.class, $ic6$, $ic7$, $ic8$, $ic9$, new String[] { "$hit_count", "$miss_count" }, $ic10$, $ic11$, $ic12$);
        }
    }
    
    public static final class $f6183$UnaryFunction extends UnaryFunction
    {
        public $f6183$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7781"));
        }
        
        public SubLObject processItem(final SubLObject var39) {
            return f6183(var39);
        }
    }
    
    public static final class $sX7782_native extends SubLStructNative
    {
        public SubLObject $cache;
        public SubLObject $metrics;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7782_native() {
            this.$cache = (SubLObject)CommonSymbols.NIL;
            this.$metrics = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$cache;
        }
        
        public SubLObject getField3() {
            return this.$metrics;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cache = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$metrics = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7782_native.class, $ic36$, $ic37$, $ic38$, $ic39$, new String[] { "$cache", "$metrics" }, $ic40$, $ic41$, $ic42$);
        }
    }
    
    public static final class $f6206$UnaryFunction extends UnaryFunction
    {
        public $f6206$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7783"));
        }
        
        public SubLObject processItem(final SubLObject var39) {
            return f6206(var39);
        }
    }
    
    public static final class $sX7784_native extends SubLStructNative
    {
        public SubLObject $cache_strategy;
        public SubLObject $records;
        public SubLObject $timestamper;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7784_native() {
            this.$cache_strategy = (SubLObject)CommonSymbols.NIL;
            this.$records = (SubLObject)CommonSymbols.NIL;
            this.$timestamper = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$cache_strategy;
        }
        
        public SubLObject getField3() {
            return this.$records;
        }
        
        public SubLObject getField4() {
            return this.$timestamper;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cache_strategy = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$records = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$timestamper = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7784_native.class, $ic76$, $ic77$, $ic78$, $ic79$, new String[] { "$cache_strategy", "$records", "$timestamper" }, $ic80$, $ic81$, $ic82$);
        }
    }
    
    public static final class $f6257$UnaryFunction extends UnaryFunction
    {
        public $f6257$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7785"));
        }
        
        public SubLObject processItem(final SubLObject var39) {
            return f6257(var39);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 399 ms
	
	Decompiled with Procyon 0.5.32.
*/