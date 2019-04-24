package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0590 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0590";
    public static final String myFingerPrint = "6dc417698019f1b9e356be3cea0232deb20856728de1a159effeedd6905dd10c";
    public static SubLSymbol $g4502$;
    public static SubLSymbol $g4503$;
    private static SubLSymbol $g4504$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLString $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLString $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLInteger $ic58$;
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
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLList $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLList $ic92$;
    private static final SubLList $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLList $ic103$;
    private static final SubLList $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    
    public static SubLObject f35984(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var2 == module0590.UNPROVIDED) {
            var2 = module0590.$g4502$.getDynamicValue();
        }
        if (var3 == module0590.UNPROVIDED) {
            var3 = (SubLObject)module0590.NIL;
        }
        if (var4 == module0590.UNPROVIDED) {
            var4 = (SubLObject)module0590.NIL;
        }
        final SubLObject var5 = f35985(var1, var2, var3, var4);
        SubLObject var6 = (SubLObject)module0590.NIL;
        while (module0590.NIL == module0052.f3687(var5)) {
            var6 = (SubLObject)ConsesLow.cons(module0052.f3693(var5), var6);
        }
        return Sequences.nreverse(var6);
    }
    
    public static SubLObject f35985(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var2 == module0590.UNPROVIDED) {
            var2 = module0590.$g4502$.getDynamicValue();
        }
        if (var3 == module0590.UNPROVIDED) {
            var3 = (SubLObject)module0590.NIL;
        }
        if (var4 == module0590.UNPROVIDED) {
            var4 = (SubLObject)module0590.NIL;
        }
        assert module0590.NIL != Types.streamp(var1) : var1;
        final SubLObject var5 = f35986(var1, var2, var3, var4);
        final SubLObject var6 = module0052.f3689(var5, (SubLObject)module0590.$ic1$, (SubLObject)module0590.$ic2$, (SubLObject)module0590.UNPROVIDED);
        return var6;
    }
    
    public static SubLObject f35987(final SubLObject var8, final SubLObject var9) {
        f35988(var8, var9, (SubLObject)module0590.ZERO_INTEGER);
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f35989(final SubLObject var8) {
        return (SubLObject)((var8.getClass() == $sX39763_native.class) ? module0590.T : module0590.NIL);
    }
    
    public static SubLObject f35990(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField2();
    }
    
    public static SubLObject f35991(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField3();
    }
    
    public static SubLObject f35992(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField4();
    }
    
    public static SubLObject f35993(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField5();
    }
    
    public static SubLObject f35994(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField6();
    }
    
    public static SubLObject f35995(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField7();
    }
    
    public static SubLObject f35996(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField8();
    }
    
    public static SubLObject f35997(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField9();
    }
    
    public static SubLObject f35998(final SubLObject var8) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.getField10();
    }
    
    public static SubLObject f35999(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField2(var11);
    }
    
    public static SubLObject f36000(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField3(var11);
    }
    
    public static SubLObject f36001(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField4(var11);
    }
    
    public static SubLObject f36002(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField5(var11);
    }
    
    public static SubLObject f36003(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField6(var11);
    }
    
    public static SubLObject f36004(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField7(var11);
    }
    
    public static SubLObject f36005(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField8(var11);
    }
    
    public static SubLObject f36006(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField9(var11);
    }
    
    public static SubLObject f36007(final SubLObject var8, final SubLObject var11) {
        assert module0590.NIL != f35989(var8) : var8;
        return var8.setField10(var11);
    }
    
    public static SubLObject f36008(SubLObject var12) {
        if (var12 == module0590.UNPROVIDED) {
            var12 = (SubLObject)module0590.NIL;
        }
        final SubLObject var13 = (SubLObject)new $sX39763_native();
        SubLObject var14;
        SubLObject var15;
        SubLObject var16;
        SubLObject var17;
        for (var14 = (SubLObject)module0590.NIL, var14 = var12; module0590.NIL != var14; var14 = conses_high.cddr(var14)) {
            var15 = var14.first();
            var16 = conses_high.cadr(var14);
            var17 = var15;
            if (var17.eql((SubLObject)module0590.$ic30$)) {
                f35999(var13, var16);
            }
            else if (var17.eql((SubLObject)module0590.$ic31$)) {
                f36000(var13, var16);
            }
            else if (var17.eql((SubLObject)module0590.$ic32$)) {
                f36001(var13, var16);
            }
            else if (var17.eql((SubLObject)module0590.$ic33$)) {
                f36002(var13, var16);
            }
            else if (var17.eql((SubLObject)module0590.$ic34$)) {
                f36003(var13, var16);
            }
            else if (var17.eql((SubLObject)module0590.$ic35$)) {
                f36004(var13, var16);
            }
            else if (var17.eql((SubLObject)module0590.$ic36$)) {
                f36005(var13, var16);
            }
            else if (var17.eql((SubLObject)module0590.$ic37$)) {
                f36006(var13, var16);
            }
            else if (var17.eql((SubLObject)module0590.$ic38$)) {
                f36007(var13, var16);
            }
            else {
                Errors.error((SubLObject)module0590.$ic39$, var15);
            }
        }
        return var13;
    }
    
    public static SubLObject f36009(final SubLObject var18, final SubLObject var19) {
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic40$, (SubLObject)module0590.$ic41$, (SubLObject)module0590.NINE_INTEGER);
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic30$, f35990(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic31$, f35991(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic32$, f35992(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic33$, f35993(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic34$, f35994(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic35$, f35995(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic36$, f35996(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic37$, f35997(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic42$, (SubLObject)module0590.$ic38$, f35998(var18));
        Functions.funcall(var19, var18, (SubLObject)module0590.$ic43$, (SubLObject)module0590.$ic41$, (SubLObject)module0590.NINE_INTEGER);
        return var18;
    }
    
    public static SubLObject f36010(final SubLObject var18, final SubLObject var19) {
        return f36009(var18, var19);
    }
    
    public static SubLObject f35988(final SubLObject var20, final SubLObject var9, final SubLObject var21) {
        PrintLow.format(var9, (SubLObject)module0590.$ic45$);
        return var20;
    }
    
    public static SubLObject f36011(final SubLObject var1, final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var25, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var26) {
        final SubLObject var27 = f36008((SubLObject)module0590.UNPROVIDED);
        f35999(var27, var1);
        f36000(var27, var22);
        f36001(var27, var23);
        f36002(var27, var24);
        f36003(var27, var25);
        f36004(var27, var2);
        f36005(var27, var3);
        f36006(var27, var4);
        f36007(var27, var26);
        return var27;
    }
    
    public static SubLObject f36012(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35990(var7);
    }
    
    public static SubLObject f36013(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35991(var7);
    }
    
    public static SubLObject f36014(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35992(var7);
    }
    
    public static SubLObject f36015(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35993(var7);
    }
    
    public static SubLObject f36016(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35994(var7);
    }
    
    public static SubLObject f36017(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35995(var7);
    }
    
    public static SubLObject f36018(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35996(var7);
    }
    
    public static SubLObject f36019(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35997(var7);
    }
    
    public static SubLObject f36020(final SubLObject var7) {
        assert module0590.NIL != f35989(var7) : var7;
        return f35998(var7);
    }
    
    public static SubLObject f36021(final SubLObject var7) {
        f36022(var7);
        return (SubLObject)((module0590.NIL != f36023(var7)) ? module0590.NIL : module0055.f4030(f36020(var7)));
    }
    
    public static SubLObject f36024(final SubLObject var27) {
        while (module0590.NIL != f36025(module0052.f3796(var27)) || module0590.NIL != module0038.f2828(module0052.f3796(var27))) {
            module0052.f3693(var27);
        }
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36026(final SubLObject var5) {
        final SubLObject var6 = module0052.f3697(var5);
        final SubLObject var7 = f36012(var6);
        return Values.values(streams_high.file_position(var7, (SubLObject)module0590.UNPROVIDED), streams_high.file_length(var7));
    }
    
    public static SubLObject f35986(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLObject var5 = streams_high.make_private_string_output_stream();
        final SubLObject var6 = streams_high.make_private_string_output_stream();
        final SubLObject var7 = (SubLObject)module0590.NIL;
        final SubLObject var8 = (SubLObject)module0590.NIL;
        final SubLObject var9 = module0107.f7627();
        return f36011(var1, var5, var6, var7, var8, var2, var3, var4, var9);
    }
    
    public static SubLObject f36023(final SubLObject var7) {
        f36022(var7);
        return Equality.eq((SubLObject)module0590.$ic46$, module0055.f4030(f36020(var7)));
    }
    
    public static SubLObject f36027(final SubLObject var7) {
        final SubLObject var8 = f36020(var7);
        f36022(var7);
        return Values.values(module0055.f4023(var8), var7);
    }
    
    public static SubLObject f36022(final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        SubLObject var9 = f36020(var7);
        final SubLObject var10 = (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL == module0055.f4006(var9));
        if (module0590.NIL != var10) {
            var9 = module0055.f4017();
            f36007(var7, var9);
        }
        final SubLObject var11 = f36013(var7);
        final SubLObject var12 = f36014(var7);
        final SubLObject var13 = f36012(var7);
        if (module0590.NIL != module0055.f4019(var9)) {
            var8.resetMultipleValues();
            final SubLObject var14 = f36028(var13, var11, var12);
            final SubLObject var15 = var8.secondMultipleValue();
            var8.resetMultipleValues();
            if (module0590.NIL != module0038.f2611(var14)) {
                final SubLObject var16 = f36029(var14, var7);
                module0055.f4021(var16, var9);
            }
            if (module0590.NIL == var15) {
                module0055.f4021((SubLObject)module0590.$ic46$, var9);
                streams_high.close(var11, (SubLObject)module0590.UNPROVIDED);
            }
            else {
                final SubLObject var17 = f36029(var15, var7);
                module0055.f4021(var17, var9);
            }
        }
        return var7;
    }
    
    public static SubLObject f36029(final SubLObject var31, final SubLObject var7) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = f36016(var7);
        final SubLObject var34 = f36019(var7);
        final SubLObject var35 = f36017(var7);
        final SubLObject var36 = f36018(var7);
        final SubLObject var37 = f36015(var7);
        SubLObject var38 = var31;
        if (module0590.NIL != var36 && module0590.NIL != var37 && module0590.NIL != Sequences.find((SubLObject)Characters.CHAR_ampersand, var31, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED)) {
            var38 = f36030(var31, var37);
        }
        if (module0590.NIL != f36031(var31) && module0590.NIL == f36032(var31) && module0590.NIL == f36033(var31) && module0590.NIL == f36034(var31) && module0590.NIL == f36035(var31) && (module0590.NIL != var35 || module0590.NIL != var34)) {
            var32.resetMultipleValues();
            final SubLObject var39 = f36036(var38, var33, var34);
            final SubLObject var40 = var32.secondMultipleValue();
            var32.resetMultipleValues();
            var38 = var39;
            f36003(var7, var40);
        }
        if (module0590.NIL != var36 && module0590.NIL == var37 && module0590.NIL != f36033(var31)) {
            f36002(var7, f36037(var31));
        }
        return var38;
    }
    
    public static SubLObject f36036(SubLObject var31, SubLObject var36, final SubLObject var4) {
        final SubLThread var37 = SubLProcess.currentSubLThread();
        SubLObject var38 = (SubLObject)module0590.NIL;
        if (module0590.NIL != var4) {
            var37.resetMultipleValues();
            final SubLObject var38_39 = module0601.f36798(var31, var36);
            final SubLObject var40_41 = var37.secondMultipleValue();
            var37.resetMultipleValues();
            var31 = var38_39;
            var38 = var40_41;
        }
        else {
            SubLObject var39 = (SubLObject)module0590.NIL;
            var37.resetMultipleValues();
            final SubLObject var43_44 = f36038(var31, var36);
            final SubLObject var45_46 = var37.secondMultipleValue();
            var37.resetMultipleValues();
            var39 = var43_44;
            var38 = var45_46;
            if (module0590.NIL != var39) {
                Errors.error((SubLObject)module0590.$ic47$, var39, var31);
            }
        }
        if (module0590.NIL == f36039(var31)) {
            if (module0590.NIL != f36040(var31)) {
                var36 = (SubLObject)ConsesLow.cons(f36041(var31), var36);
                var36 = ConsesLow.append(var38, var36);
            }
            else if (module0590.NIL != f36042(var31)) {
                final SubLObject var40 = f36041(var31);
                while (module0590.NIL != f36043(var36.first())) {
                    var36 = var36.rest();
                }
                if (module0590.NIL == Errors.$ignore_mustsP$.getDynamicValue(var37) && !var40.equal(var36.first())) {
                    Errors.error((SubLObject)module0590.$ic48$, var36.first(), var40);
                }
                var36 = var36.rest();
            }
        }
        return Values.values(var31, var36);
    }
    
    public static SubLObject f36043(final SubLObject var20) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var20.isCons() && var20.first().isString() && var20.rest().isString());
    }
    
    public static SubLObject f36038(final SubLObject var31, final SubLObject var36) {
        SubLObject var37 = (SubLObject)module0590.NIL;
        SubLObject var38 = (SubLObject)module0590.NIL;
        if (module0590.NIL != f36031(var31) && module0590.NIL == f36032(var31) && module0590.NIL == f36033(var31) && module0590.NIL == f36034(var31) && module0590.NIL == f36039(var31) && module0590.NIL == f36035(var31)) {
            SubLObject var40;
            final SubLObject var39 = var40 = f36044(var31);
            SubLObject var41 = (SubLObject)module0590.NIL;
            SubLObject var42 = (SubLObject)module0590.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0590.$ic49$);
            var41 = var40.first();
            var40 = (var42 = var40.rest());
            if (module0590.NIL != module0038.f2668((SubLObject)module0590.$ic50$, var31, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED)) {
                SubLObject var43 = var42;
                SubLObject var44 = (SubLObject)module0590.NIL;
                var44 = var43.first();
                while (module0590.NIL != var43) {
                    SubLObject var56_57;
                    final SubLObject var54_55 = var56_57 = var44;
                    SubLObject var45 = (SubLObject)module0590.NIL;
                    SubLObject var46 = (SubLObject)module0590.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var56_57, var54_55, (SubLObject)module0590.$ic51$);
                    var45 = var56_57.first();
                    var56_57 = (var46 = var56_57.rest());
                    if (module0590.NIL != module0038.f2684(var45, (SubLObject)module0590.$ic50$)) {
                        var38 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(module0038.f2623(var45, (SubLObject)module0590.SIX_INTEGER, Sequences.position((SubLObject)Characters.CHAR_equal, var45, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED)), var46), var38);
                    }
                    var43 = var43.rest();
                    var44 = var43.first();
                }
            }
            SubLObject var44;
            SubLObject var47;
            SubLObject var63_64;
            SubLObject var61_62;
            SubLObject var48;
            SubLObject var49;
            for (var37 = f36045(var41, var38, var36), var47 = (SubLObject)module0590.NIL, var47 = var42; module0590.NIL == var37 && module0590.NIL != var47; var37 = f36045(var48, var38, var36), var47 = var47.rest()) {
                var44 = var47.first();
                var61_62 = (var63_64 = var44);
                var48 = (SubLObject)module0590.NIL;
                var49 = (SubLObject)module0590.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var63_64, var61_62, (SubLObject)module0590.$ic52$);
                var48 = var63_64.first();
                var63_64 = (var49 = var63_64.rest());
            }
        }
        return Values.values(var37, var38);
    }
    
    public static SubLObject f36045(final SubLObject var67, final SubLObject var48, final SubLObject var36) {
        return (SubLObject)((module0590.NIL != Sequences.find((SubLObject)Characters.CHAR_colon, var67, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED) && module0590.NIL == module0038.f2684(var67, (SubLObject)module0590.$ic50$)) ? f36046(var67, var48, var36) : module0590.NIL);
    }
    
    public static SubLObject f36046(final SubLObject var67, final SubLObject var48, final SubLObject var36) {
        final SubLObject var68 = f36047(var67);
        SubLObject var69 = module0035.f2294(var48, var68, Symbols.symbol_function((SubLObject)module0590.EQUAL), (SubLObject)module0590.NIL);
        if (module0590.NIL == var69 && var68.equal((SubLObject)module0590.$ic53$)) {
            var69 = (SubLObject)module0590.$ic54$;
        }
        if (module0590.NIL == var69) {
            SubLObject var70 = var36;
            SubLObject var71 = (SubLObject)module0590.NIL;
            var71 = var70.first();
            while (module0590.NIL == var69 && module0590.NIL != var70) {
                if (var71.isCons() && var68.equal(var71.first())) {
                    var69 = var71.rest();
                }
                var70 = var70.rest();
                var71 = var70.first();
            }
        }
        return (SubLObject)((module0590.NIL != var69) ? module0590.NIL : var67);
    }
    
    public static SubLObject f36048(final SubLObject var67) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var67.isString() && module0590.NIL != module0035.sublisp_boolean(Sequences.position((SubLObject)Characters.CHAR_colon, var67, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED)));
    }
    
    public static SubLObject f36047(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = Sequences.position((SubLObject)Characters.CHAR_colon, var67, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
        if (module0590.NIL == Errors.$ignore_mustsP$.getDynamicValue(var68) && module0590.NIL == var69) {
            Errors.error((SubLObject)module0590.$ic55$, var67);
        }
        return module0038.f2623(var67, (SubLObject)module0590.ZERO_INTEGER, var69);
    }
    
    public static SubLObject f36049(final SubLObject var67) {
        final SubLThread var68 = SubLProcess.currentSubLThread();
        final SubLObject var69 = Sequences.position((SubLObject)Characters.CHAR_colon, var67, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
        if (module0590.NIL == Errors.$ignore_mustsP$.getDynamicValue(var68) && module0590.NIL == var69) {
            Errors.error((SubLObject)module0590.$ic55$, var67);
        }
        return module0038.f2623(var67, module0048.f_1X(var69), (SubLObject)module0590.UNPROVIDED);
    }
    
    public static SubLObject f36050(final SubLObject var73, SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var2 == module0590.UNPROVIDED) {
            var2 = module0590.$g4502$.getDynamicValue();
        }
        if (var3 == module0590.UNPROVIDED) {
            var3 = (SubLObject)module0590.NIL;
        }
        if (var4 == module0590.UNPROVIDED) {
            var4 = (SubLObject)module0590.NIL;
        }
        SubLObject var74 = (SubLObject)module0590.NIL;
        SubLObject var75 = (SubLObject)module0590.NIL;
        try {
            var75 = streams_high.make_private_string_input_stream(var73, (SubLObject)module0590.ZERO_INTEGER, (SubLObject)module0590.NIL);
            var74 = f35984(var75, var2, var3, var4);
        }
        finally {
            final SubLObject var76 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0590.T);
                streams_high.close(var75, (SubLObject)module0590.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var76);
            }
        }
        return var74;
    }
    
    public static SubLObject f36051(SubLObject var76, SubLObject var77, SubLObject var78, SubLObject var79, SubLObject var80, SubLObject var81, SubLObject var82, SubLObject var83, SubLObject var84, SubLObject var85, SubLObject var86) {
        if (var78 == module0590.UNPROVIDED) {
            var78 = (SubLObject)module0590.NIL;
        }
        if (var79 == module0590.UNPROVIDED) {
            var79 = (SubLObject)module0590.$ic57$;
        }
        if (var80 == module0590.UNPROVIDED) {
            var80 = (SubLObject)module0590.$ic58$;
        }
        if (var81 == module0590.UNPROVIDED) {
            var81 = (SubLObject)module0590.T;
        }
        if (var82 == module0590.UNPROVIDED) {
            var82 = (SubLObject)module0590.T;
        }
        if (var83 == module0590.UNPROVIDED) {
            var83 = (SubLObject)module0590.NIL;
        }
        if (var84 == module0590.UNPROVIDED) {
            var84 = (SubLObject)module0590.NIL;
        }
        if (var85 == module0590.UNPROVIDED) {
            var85 = (SubLObject)module0590.T;
        }
        if (var86 == module0590.UNPROVIDED) {
            var86 = (SubLObject)module0590.$ic59$;
        }
        final SubLThread var87 = SubLProcess.currentSubLThread();
        SubLObject var88 = (SubLObject)module0590.NIL;
        SubLObject var89 = (SubLObject)module0590.NIL;
        SubLObject var90 = (SubLObject)module0590.NIL;
        SubLObject var91 = (SubLObject)module0590.T;
        SubLObject var92 = (SubLObject)module0590.NIL;
        try {
            var87.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var93 = Errors.$error_handler$.currentBinding(var87);
            try {
                Errors.$error_handler$.bind((SubLObject)module0590.$ic60$, var87);
                try {
                    if (module0590.NIL != var84) {
                        SubLObject var94 = (SubLObject)module0590.NIL;
                        final SubLObject var95 = module0003.f61();
                        try {
                            var87.throwStack.push(var95);
                            final SubLObject var75_93 = module0003.$g4$.currentBinding(var87);
                            try {
                                module0003.$g4$.bind((SubLObject)module0590.T, var87);
                                SubLObject var96 = (SubLObject)module0590.NIL;
                                try {
                                    final SubLObject var75_94 = module0003.$g5$.currentBinding(var87);
                                    try {
                                        module0003.$g5$.bind(Numbers.add((SubLObject)module0590.ONE_INTEGER, module0003.$g5$.getDynamicValue(var87)), var87);
                                        var96 = module0003.f62(var84, var95);
                                        var87.resetMultipleValues();
                                        final SubLObject var96_97 = f36051(var76, var77, var78, var79, var80, var81, var82, var83, (SubLObject)module0590.NIL, var85, var86);
                                        final SubLObject var98_99 = var87.secondMultipleValue();
                                        final SubLObject var100_101 = var87.thirdMultipleValue();
                                        var87.resetMultipleValues();
                                        var92 = var96_97;
                                        var94 = var98_99;
                                        var88 = var100_101;
                                    }
                                    finally {
                                        module0003.$g5$.rebind(var75_94, var87);
                                    }
                                }
                                finally {
                                    final SubLObject var75_95 = Threads.$is_thread_performing_cleanupP$.currentBinding(var87);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0590.T, var87);
                                        module0003.f64(var96);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var75_95, var87);
                                    }
                                }
                            }
                            finally {
                                module0003.$g4$.rebind(var75_93, var87);
                            }
                        }
                        catch (Throwable var97) {
                            var90 = Errors.handleThrowable(var97, var95);
                        }
                        finally {
                            var87.throwStack.pop();
                        }
                        final SubLObject var98 = var94;
                        if (var98.eql((SubLObject)module0590.$ic61$)) {
                            var89 = (SubLObject)module0590.T;
                        }
                    }
                    else {
                        while (module0590.NIL != var91) {
                            var87.resetMultipleValues();
                            final SubLObject var104_105 = f36052(var76, var77, var78, var79, var80, var81, var82, var83, var86);
                            final SubLObject var106_107 = var87.secondMultipleValue();
                            var87.resetMultipleValues();
                            var92 = var104_105;
                            var89 = var106_107;
                            if (module0590.NIL != var85) {
                                final SubLObject var99 = var92.first();
                                if (module0590.NIL != module0589.f35938(var99)) {
                                    final SubLObject var100 = module0589.f35939(var99);
                                    var87.resetMultipleValues();
                                    final SubLObject var110_111 = module0589.f35940(var100);
                                    final SubLObject var112_113 = var87.secondMultipleValue();
                                    final SubLObject var114_115 = var87.thirdMultipleValue();
                                    final SubLObject var116_117 = var87.fourthMultipleValue();
                                    var87.resetMultipleValues();
                                    var76 = var110_111;
                                    var80 = var112_113;
                                    var77 = var114_115;
                                    var78 = var116_117;
                                }
                                else {
                                    var91 = (SubLObject)module0590.NIL;
                                }
                            }
                            else {
                                var91 = (SubLObject)module0590.NIL;
                            }
                        }
                    }
                }
                catch (Throwable var101) {
                    Errors.handleThrowable(var101, (SubLObject)module0590.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var93, var87);
            }
        }
        catch (Throwable var102) {
            var88 = Errors.handleThrowable(var102, module0003.$g3$.getGlobalValue());
        }
        finally {
            var87.throwStack.pop();
        }
        if (module0590.NIL != var88) {
            return Values.values(var92, (SubLObject)module0590.$ic62$, var88);
        }
        if (module0590.NIL != var89) {
            return Values.values(var92, (SubLObject)module0590.$ic61$, (SubLObject)module0590.NIL);
        }
        if (module0590.NIL != var90) {
            return Values.values(var92, (SubLObject)module0590.$ic63$, (SubLObject)module0590.NIL);
        }
        return Values.values(var92, (SubLObject)module0590.NIL, (SubLObject)module0590.NIL);
    }
    
    public static SubLObject f36052(final SubLObject var76, final SubLObject var77, final SubLObject var78, final SubLObject var79, final SubLObject var80, final SubLObject var81, final SubLObject var82, final SubLObject var119, final SubLObject var86) {
        SubLObject var120 = (SubLObject)module0590.T;
        SubLObject var121 = (SubLObject)module0590.NIL;
        final SubLObject var122 = (SubLObject)(var80.eql((SubLObject)module0590.$ic59$) ? module0590.$ic58$ : var80);
        SubLObject var123 = (SubLObject)module0590.NIL;
        try {
            var123 = module0004.f82(var76, var122, var119, (SubLObject)module0590.$ic64$);
            if (module0590.NIL != module0003.f70(var123, var76, var122)) {
                module0589.f35885(var123, (SubLObject)ConsesLow.list(new SubLObject[] { module0590.$ic65$, var76, module0590.$ic66$, var80, module0590.$ic67$, var79, module0590.$ic68$, var77, module0590.$ic69$, var78, module0590.$ic70$, var81, module0590.$ic71$, var82, module0590.$ic72$, var86, module0590.$ic73$, module0590.$ic59$, module0590.$ic74$, module0590.NIL }));
                var120 = (SubLObject)module0590.NIL;
                var121 = f35984(var123, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
            }
        }
        finally {
            final SubLObject var124 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0590.T);
                if (module0590.NIL != var123) {
                    streams_high.close(var123, (SubLObject)module0590.UNPROVIDED);
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var124);
            }
        }
        return Values.values(var121, var120);
    }
    
    public static SubLObject f36053(final SubLObject var123, final SubLObject var124) {
        SubLObject var126;
        final SubLObject var125 = var126 = var123.rest();
        SubLObject var127 = (SubLObject)module0590.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var126, var125, (SubLObject)module0590.$ic75$);
        var127 = var126.first();
        var126 = var126.rest();
        if (module0590.NIL == var126) {
            module0002.f37((SubLObject)module0590.$ic76$, (SubLObject)module0590.$ic77$);
            return (SubLObject)ConsesLow.listS((SubLObject)module0590.$ic78$, var127, (SubLObject)module0590.$ic79$);
        }
        cdestructuring_bind.cdestructuring_bind_error(var125, (SubLObject)module0590.$ic75$);
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36054(final SubLObject var31, final SubLObject var127) {
        return Strings.stringE(var31, var127, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
    }
    
    public static SubLObject f36055(final SubLObject var31, final SubLObject var127) {
        return Strings.string_equal(var31, var127, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
    }
    
    public static SubLObject f36056(final SubLObject var31, final SubLObject var128) {
        return Equality.eql((SubLObject)module0590.ZERO_INTEGER, Sequences.search(var128, var31, Symbols.symbol_function((SubLObject)module0590.$ic80$), (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED));
    }
    
    public static SubLObject f36057(final SubLObject var31, final SubLObject var129) {
        return module0035.sublisp_boolean(Sequences.search(var129, var31, Symbols.symbol_function((SubLObject)module0590.$ic80$), (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED));
    }
    
    public static SubLObject f36058(final SubLObject var6, final SubLObject var131, SubLObject var132) {
        if (var132 == module0590.UNPROVIDED) {
            var132 = (SubLObject)module0590.$ic81$;
        }
        SubLObject var133 = (SubLObject)module0590.NIL;
        SubLObject var134 = (SubLObject)module0590.NIL;
        SubLObject var135 = (SubLObject)module0590.NIL;
        var133 = var6;
        var134 = var133.first();
        for (var135 = (SubLObject)module0590.ZERO_INTEGER; module0590.NIL != var133; var133 = var133.rest(), var134 = var133.first(), var135 = Numbers.add((SubLObject)module0590.ONE_INTEGER, var135)) {
            if (module0590.NIL != Functions.funcall(var132, var134, var131)) {
                return var135;
            }
        }
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36059(final SubLObject var6, final SubLObject var132) {
        SubLObject var133 = (SubLObject)module0590.NIL;
        SubLObject var134 = (SubLObject)module0590.NIL;
        SubLObject var135 = (SubLObject)module0590.NIL;
        var133 = var6;
        var134 = var133.first();
        for (var135 = (SubLObject)module0590.ZERO_INTEGER; module0590.NIL != var133; var133 = var133.rest(), var134 = var133.first(), var135 = Numbers.add((SubLObject)module0590.ONE_INTEGER, var135)) {
            if (module0590.NIL != Functions.funcall(var132, var134)) {
                return var135;
            }
        }
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36060(final SubLObject var6, final SubLObject var132) {
        SubLObject var133 = (SubLObject)module0590.NIL;
        SubLObject var134 = (SubLObject)module0590.NIL;
        SubLObject var135 = (SubLObject)module0590.NIL;
        var133 = var6;
        var134 = var133.first();
        for (var135 = (SubLObject)module0590.ZERO_INTEGER; module0590.NIL != var133; var133 = var133.rest(), var134 = var133.first(), var135 = Numbers.add((SubLObject)module0590.ONE_INTEGER, var135)) {
            if (module0590.NIL == Functions.funcall(var132, var134)) {
                return var135;
            }
        }
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36061(final SubLObject var6, SubLObject var135) {
        if (var135 == module0590.UNPROVIDED) {
            var135 = (SubLObject)module0590.ONE_INTEGER;
        }
        return conses_high.nthcdr(var135, var6);
    }
    
    public static SubLObject f36062(SubLObject var6, final SubLObject var131, SubLObject var132) {
        if (var132 == module0590.UNPROVIDED) {
            var132 = (SubLObject)module0590.$ic81$;
        }
        while (module0590.NIL != var6 && module0590.NIL == Functions.funcall(var132, var6.first(), var131)) {
            var6 = var6.rest();
        }
        return var6;
    }
    
    public static SubLObject f36063(final SubLObject var136, final SubLObject var137) {
        final SubLObject var138 = Sequences.cconcatenate((SubLObject)module0590.$ic82$, module0006.f203(var137));
        final SubLObject var139 = (SubLObject)module0590.$ic83$;
        final SubLObject var140 = Sequences.cconcatenate((SubLObject)module0590.$ic84$, module0006.f203(var137));
        final SubLObject var141 = f36062(var136, var138, (SubLObject)module0590.UNPROVIDED);
        if (module0590.NIL == var141) {
            return (SubLObject)module0590.NIL;
        }
        final SubLObject var142 = var141.first();
        if (module0590.NIL != module0038.f2673(var142, var139, (SubLObject)module0590.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var142);
        }
        final SubLObject var143 = f36062(var141, var140, (SubLObject)module0590.UNPROVIDED);
        if (module0590.NIL != var143) {
            final SubLObject var144 = var143.rest();
            return conses_high.ldiff(var141, var144);
        }
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36064(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (module0590.NIL != module0107.f7629(module0590.$g4504$.getDynamicValue(var32))) {
            module0590.$g4504$.setDynamicValue((SubLObject)ConsesLow.cons(var31, module0590.$g4504$.getDynamicValue(var32)), var32);
        }
        return var31;
    }
    
    public static SubLObject f36065(final SubLObject var6, final SubLObject var135) {
        final SubLThread var136 = SubLProcess.currentSubLThread();
        if (module0590.NIL != module0107.f7629(module0590.$g4504$.getDynamicValue(var136))) {
            SubLObject var137 = (SubLObject)module0590.ZERO_INTEGER;
            SubLObject var138 = Numbers.numGE(var137, var135);
            if (module0590.NIL == var138) {
                SubLObject var139 = var6;
                SubLObject var140 = (SubLObject)module0590.NIL;
                var140 = var139.first();
                while (module0590.NIL == var138 && module0590.NIL != var139) {
                    f36064(var140);
                    var137 = Numbers.add(var137, (SubLObject)module0590.ONE_INTEGER);
                    var138 = Numbers.numGE(var137, var135);
                    var139 = var139.rest();
                    var140 = var139.first();
                }
            }
        }
        return var6;
    }
    
    public static SubLObject f36066() {
        final SubLThread var28 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0590.NIL != module0107.f7629(module0590.$g4504$.getDynamicValue(var28))) ? Sequences.nreverse(module0590.$g4504$.getDynamicValue(var28)) : module0590.NIL);
    }
    
    public static SubLObject f36067(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        SubLObject var8 = (SubLObject)module0590.NIL;
        final SubLObject var9 = module0590.$g4504$.currentBinding(var7);
        try {
            module0590.$g4504$.bind((SubLObject)module0590.NIL, var7);
            f36068(var6);
            var8 = f36066();
        }
        finally {
            module0590.$g4504$.rebind(var9, var7);
        }
        return var8;
    }
    
    public static SubLObject f36068(final SubLObject var6) {
        assert module0590.NIL != f36031(var6.first()) : var6.first();
        final SubLObject var7 = f36041(var6.first());
        return f36069(var6, var7);
    }
    
    public static SubLObject f36069(final SubLObject var6, final SubLObject var47) {
        SubLObject var48 = (SubLObject)module0590.NIL;
        SubLObject var49 = (SubLObject)module0590.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var6, (SubLObject)module0590.$ic86$);
        var48 = var6.first();
        final SubLObject var50 = var49 = var6.rest();
        if (module0590.NIL != f36070(var47, var48) || (module0590.NIL != f36071(var48, var47) && module0590.NIL != f36072(var48))) {
            f36064(var48);
            return var49;
        }
        SubLObject var51 = f36058(var49, var47, (SubLObject)module0590.$ic87$);
        SubLObject var52 = (SubLObject)((module0590.NIL != var51) ? ConsesLow.nth(var51, var49) : module0590.NIL);
        if (module0590.NIL == var51) {
            Errors.sublisp_break((SubLObject)module0590.$ic88$, new SubLObject[] { var47, var49 });
        }
        SubLObject var53;
        for (var53 = var49; module0590.NIL != f36072(var52); var52 = (SubLObject)((module0590.NIL != var51) ? ConsesLow.nth(var51, var53) : module0590.NIL)) {
            var53 = f36061(var53, module0048.f_1X(var51));
            var51 = f36058(var53, var47, (SubLObject)module0590.$ic87$);
        }
        if (module0590.NIL != f36042(var52)) {
            f36065(var6, module0048.f_1X(module0048.f_1X(var51)));
            return f36061(var53, module0048.f_1X(var51));
        }
        while (module0590.NIL == f36042(var52)) {
            final SubLObject var54 = f36061(var53, var51);
            final SubLObject var55 = var53 = f36069(var54, var47);
            var51 = f36058(var53, var47, (SubLObject)module0590.$ic87$);
            var52 = (SubLObject)((module0590.NIL != var51) ? ConsesLow.nth(var51, var53) : module0590.NIL);
        }
        return (SubLObject)((module0590.NIL != var53) ? f36069(var53, var47) : module0590.NIL);
    }
    
    public static SubLObject f36032(final SubLObject var20) {
        return f36071(var20, (SubLObject)module0590.$ic89$);
    }
    
    public static SubLObject f36035(final SubLObject var20) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var20.isString() && module0590.NIL != module0038.f2684(var20, (SubLObject)module0590.$ic90$) && module0590.NIL != module0038.f2673(var20, (SubLObject)module0590.$ic91$, (SubLObject)module0590.UNPROVIDED));
    }
    
    public static SubLObject f36042(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var31.isString() && module0590.NIL != f36031(var31) && module0590.NIL != module0035.f2002(var31, (SubLObject)module0590.TWO_INTEGER, (SubLObject)module0590.UNPROVIDED) && Characters.CHAR_slash.eql(Strings.sublisp_char(var31, (SubLObject)module0590.ONE_INTEGER)));
    }
    
    public static SubLObject f36040(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != f36031(var31) && module0590.NIL == f36032(var31) && module0590.NIL == f36033(var31) && module0590.NIL == f36035(var31) && module0590.NIL == f36072(var31) && module0590.NIL == f36042(var31) && module0590.NIL == f36034(var31));
    }
    
    public static SubLObject f36073(SubLObject var6, final SubLObject var131, final SubLObject var156, SubLObject var132) {
        if (var132 == module0590.UNPROVIDED) {
            var132 = (SubLObject)module0590.$ic81$;
        }
        while (module0590.NIL != var6 && module0590.NIL == Functions.funcall(var132, var6.first(), var131) && module0590.NIL == Functions.funcall(var132, var6.first(), var156)) {
            var6 = var6.rest();
        }
        return var6;
    }
    
    public static SubLObject f36074(SubLObject var6, final SubLObject var131, final SubLObject var156, SubLObject var132) {
        if (var132 == module0590.UNPROVIDED) {
            var132 = (SubLObject)module0590.$ic81$;
        }
        var6 = f36073(var6, var131, var156, var132);
        if (module0590.NIL != var6 && module0590.NIL == Functions.funcall(var132, var6.first(), var156)) {
            return var6;
        }
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36028(final SubLObject var1, SubLObject var22, SubLObject var23) {
        if (var22 == module0590.UNPROVIDED) {
            var22 = streams_high.make_private_string_output_stream();
        }
        if (var23 == module0590.UNPROVIDED) {
            var23 = streams_high.make_private_string_output_stream();
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        streams_high.clear_output(var22);
        streams_high.clear_output(var23);
        var24.resetMultipleValues();
        final SubLObject var25 = module0589.f35942(var1, (SubLObject)Characters.CHAR_less, var22);
        final SubLObject var26 = var24.secondMultipleValue();
        var24.resetMultipleValues();
        if (module0590.NIL != var26) {
            return Values.values(var25, (SubLObject)module0590.NIL);
        }
        final SubLObject var27 = (SubLObject)module0590.$ic92$;
        final SubLObject var28 = (SubLObject)module0590.$ic93$;
        SubLObject var29 = (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_less);
        SubLObject var30 = (SubLObject)module0590.NIL;
        print_high.princ((SubLObject)Characters.CHAR_less, var23);
        SubLObject var31 = (SubLObject)module0590.NIL;
        SubLObject var32 = (SubLObject)module0590.NIL;
        while (module0590.NIL != var29 && module0590.NIL == var30) {
            var24.resetMultipleValues();
            final SubLObject var33 = module0589.f35943(var1, var28, var22);
            final SubLObject var34 = var24.secondMultipleValue();
            var24.resetMultipleValues();
            if (var33.isString()) {
                print_high.princ(var33, var23);
                if (module0590.NIL == var31 && module0590.NIL != module0038.f2684(var33, (SubLObject)module0590.$ic94$)) {
                    var31 = (SubLObject)module0590.T;
                }
                if (module0590.NIL == var32 && module0590.NIL != module0038.f2684(var33, (SubLObject)module0590.$ic95$)) {
                    var32 = (SubLObject)module0590.T;
                }
            }
            if (module0590.NIL == var34) {
                var30 = (SubLObject)module0590.T;
            }
            else if (module0590.NIL != var31) {
                print_high.princ(var34, var23);
                if (module0590.NIL == module0038.f2673(var33, (SubLObject)module0590.$ic96$, (SubLObject)module0590.UNPROVIDED) || !var34.eql((SubLObject)Characters.CHAR_greater)) {
                    continue;
                }
                var29 = var29.rest();
            }
            else if (module0590.NIL != var32) {
                print_high.princ(var34, var23);
                if (module0590.NIL == module0038.f2673(var33, (SubLObject)module0590.$ic97$, (SubLObject)module0590.UNPROVIDED) || !var34.eql((SubLObject)Characters.CHAR_greater)) {
                    continue;
                }
                var29 = var29.rest();
            }
            else if (var34.eql(module0035.f2294(var27, var29.first(), (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED))) {
                print_high.princ(var34, var23);
                var29 = var29.rest();
            }
            else if (module0590.NIL != module0035.f2294(var27, var34, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED)) {
                print_high.princ(var34, var23);
                var29 = (SubLObject)ConsesLow.cons(var34, var29);
            }
            else {
                Errors.error((SubLObject)module0590.$ic98$, var34, var33, module0035.f2294(var27, var29.first(), (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED));
            }
        }
        return (module0590.NIL != var30) ? Values.values(var25, (SubLObject)module0590.NIL) : Values.values(var25, streams_high.get_output_stream_string(var23));
    }
    
    public static SubLObject f36033(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var31.isString() && module0590.NIL != f36071(var31, (SubLObject)module0590.$ic99$));
    }
    
    public static SubLObject f36075(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != f36033(var31) && module0590.NIL != module0038.f2675(var31, (SubLObject)module0590.$ic100$, Symbols.symbol_function((SubLObject)module0590.EQUALP)));
    }
    
    public static SubLObject f36034(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != module0038.f2684(var31, (SubLObject)module0590.$ic101$) && module0590.NIL != module0038.f2673(var31, (SubLObject)module0590.$ic102$, (SubLObject)module0590.UNPROVIDED));
    }
    
    public static SubLObject f36037(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        final SubLObject var33 = module0038.f2738(var31, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_lbracket, (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_rbracket, module0038.f2818())), (SubLObject)module0590.NIL, (SubLObject)module0590.NIL, (SubLObject)module0590.T, (SubLObject)module0590.NIL, (SubLObject)module0590.$ic103$);
        SubLObject var34 = (SubLObject)module0590.NIL;
        SubLObject var36;
        final SubLObject var35 = var36 = var33;
        SubLObject var37 = (SubLObject)module0590.NIL;
        SubLObject var38 = (SubLObject)module0590.NIL;
        SubLObject var39 = (SubLObject)module0590.NIL;
        SubLObject var40 = (SubLObject)module0590.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0590.$ic104$);
        var37 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0590.$ic104$);
        var38 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)module0590.$ic104$);
        var39 = var36.first();
        var36 = (var40 = var36.rest());
        if (module0590.NIL == Errors.$ignore_mustsP$.getDynamicValue(var32) && !var37.equal((SubLObject)module0590.$ic105$)) {
            Errors.error((SubLObject)module0590.$ic106$, var37);
        }
        if (var39.equal((SubLObject)module0590.$ic107$)) {
            SubLObject var41 = (SubLObject)module0590.NIL;
            while (module0590.NIL == var41 && module0590.NIL == module0035.f2012(var40)) {
                final SubLObject var42 = Sequences.position((SubLObject)module0590.$ic108$, var40, Symbols.symbol_function((SubLObject)module0590.EQUAL), (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
                if (module0590.NIL == var42) {
                    var41 = (SubLObject)module0590.T;
                }
                else if (module0590.NIL != module0035.f2002(var40, Numbers.add(var42, (SubLObject)module0590.THREE_INTEGER), (SubLObject)module0590.UNPROVIDED)) {
                    final SubLObject var43 = Sequences.cconcatenate((SubLObject)module0590.$ic109$, new SubLObject[] { ConsesLow.nth(Numbers.add(var42, (SubLObject)module0590.ONE_INTEGER), var40), module0590.$ic110$ });
                    final SubLObject var44 = ConsesLow.nth(Numbers.add(var42, (SubLObject)module0590.TWO_INTEGER), var40);
                    final SubLObject var45 = module0038.f2841((SubLObject)Characters.CHAR_quotation, (SubLObject)Characters.CHAR_quote, var44);
                    final SubLObject var46 = reader.read_from_string(var45, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
                    var34 = module0035.f2063(var34, var43, var46, (SubLObject)module0590.UNPROVIDED);
                    var40 = conses_high.nthcdr(Numbers.add(var42, (SubLObject)module0590.THREE_INTEGER), var40);
                }
                else {
                    var41 = (SubLObject)module0590.T;
                }
            }
        }
        return var34;
    }
    
    public static SubLObject f36030(final SubLObject var31, final SubLObject var24) {
        final SubLObject var32 = f36076(module0038.f2664(var31, var24, Symbols.symbol_function((SubLObject)module0590.EQUAL)));
        return var32;
    }
    
    public static SubLObject f36076(SubLObject var73) {
        SubLObject var74 = module0587.$g4460$.getGlobalValue();
        SubLObject var75 = (SubLObject)module0590.NIL;
        var75 = var74.first();
        while (module0590.NIL != var74) {
            SubLObject var77;
            final SubLObject var76 = var77 = var75;
            SubLObject var78 = (SubLObject)module0590.NIL;
            SubLObject var79 = (SubLObject)module0590.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)module0590.$ic111$);
            var78 = var77.first();
            var77 = (var79 = var77.rest());
            if (module0590.NIL != Sequences.search(var78, var73, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED)) {
                var73 = module0038.f2659(Strings.make_string((SubLObject)module0590.ONE_INTEGER, Characters.code_char(var79)), Sequences.cconcatenate((SubLObject)module0590.$ic109$, new SubLObject[] { module0006.f203(var78), module0590.$ic110$ }), var73, (SubLObject)module0590.UNPROVIDED);
            }
            var74 = var74.rest();
            var75 = var74.first();
        }
        return var73;
    }
    
    public static SubLObject f36077(final SubLObject var182) {
        final SubLObject var183 = f36050(var182, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
        SubLObject var184 = (SubLObject)module0590.NIL;
        SubLObject var185 = (SubLObject)module0590.NIL;
        try {
            var185 = streams_high.make_private_string_output_stream();
            SubLObject var186 = var183;
            SubLObject var187 = (SubLObject)module0590.NIL;
            var187 = var186.first();
            while (module0590.NIL != var186) {
                if (module0590.NIL == f36035(var187)) {
                    print_high.princ(var187, var185);
                }
                var186 = var186.rest();
                var187 = var186.first();
            }
            var184 = streams_high.get_output_stream_string(var185);
        }
        finally {
            final SubLObject var188 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0590.T);
                streams_high.close(var185, (SubLObject)module0590.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var188);
            }
        }
        return var184;
    }
    
    public static SubLObject f36044(final SubLObject var31) {
        return f36078(var31, (SubLObject)module0590.UNPROVIDED);
    }
    
    public static SubLObject f36079(final SubLObject var31) {
        return f36078(var31, (SubLObject)module0590.NIL);
    }
    
    public static SubLObject f36080(final SubLObject var31, SubLObject var185) {
        if (var185 == module0590.UNPROVIDED) {
            var185 = (SubLObject)module0590.T;
        }
        final SubLObject var186 = Sequences.position_if((SubLObject)module0590.$ic113$, var31, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
        final SubLObject var187 = Sequences.length(var31);
        final SubLObject var188 = (module0590.NIL != f36072(var31) || module0590.NIL != f36032(var31)) ? Numbers.subtract(var187, (SubLObject)module0590.TWO_INTEGER) : Numbers.subtract(var187, (SubLObject)module0590.ONE_INTEGER);
        SubLObject var189 = (SubLObject)ConsesLow.list(f36041(var31));
        SubLObject var190 = (SubLObject)module0590.NIL;
        SubLObject var191 = (SubLObject)module0590.NIL;
        SubLObject var192 = (SubLObject)module0590.NIL;
        SubLObject var193 = (SubLObject)module0590.NIL;
        SubLObject var194 = (SubLObject)module0590.NIL;
        SubLObject var195 = (SubLObject)module0590.NIL;
        SubLObject var196 = (SubLObject)module0590.NIL;
        if (module0590.NIL != var186) {
            SubLObject var199_200;
            SubLObject var197;
            SubLObject var198;
            SubLObject var199;
            SubLObject var200;
            SubLObject var201;
            SubLObject var202;
            for (var197 = (var199_200 = ((module0590.NIL != var188) ? var188 : Sequences.length(var31))), var198 = (SubLObject)module0590.NIL, var198 = module0048.f_1X(var186); !var198.numGE(var199_200); var198 = module0048.f_1X(var198)) {
                var199 = Strings.sublisp_char(var31, var198);
                var200 = (SubLObject)module0590.NIL;
                if (module0590.NIL != var190) {
                    if (module0590.NIL != var192) {
                        if (var199.eql(var192)) {
                            var192 = (SubLObject)module0590.NIL;
                            if (module0590.NIL == var195) {
                                var195 = var198;
                            }
                            var196 = module0048.f_1_(var198);
                            var200 = (SubLObject)module0590.T;
                            var190 = (SubLObject)module0590.NIL;
                        }
                        else if (var192.eql((SubLObject)Characters.CHAR_null) && (var199.eql((SubLObject)Characters.CHAR_greater) || module0590.NIL != module0038.f2760(var199) || module0048.f_1X(var198).eql(var188))) {
                            var192 = (SubLObject)module0590.NIL;
                            var196 = ((module0590.NIL != module0038.f2760(var199)) ? Numbers.subtract(var198, (SubLObject)module0590.ONE_INTEGER) : var198);
                            var200 = (SubLObject)module0590.T;
                            var190 = (SubLObject)module0590.NIL;
                        }
                        else if (module0590.NIL == var195) {
                            var195 = (var192.eql((SubLObject)Characters.CHAR_null) ? Numbers.subtract(var198, (SubLObject)module0590.ONE_INTEGER) : var198);
                        }
                    }
                    else {
                        var201 = var199;
                        if (var201.eql((SubLObject)Characters.CHAR_quotation) || var201.eql((SubLObject)Characters.CHAR_quote)) {
                            if (module0590.NIL == var191) {
                                Errors.error((SubLObject)module0590.$ic114$, module0038.f2623(var31, var198, (SubLObject)module0590.UNPROVIDED));
                            }
                            var192 = var199;
                        }
                        else if (var201.eql((SubLObject)Characters.CHAR_equal)) {
                            var191 = (SubLObject)module0590.T;
                        }
                        else if (module0590.NIL == module0038.f2760(var199)) {
                            if (module0590.NIL != var185) {
                                Errors.error((SubLObject)module0590.$ic115$, module0038.f2623(var31, var198, (SubLObject)module0590.UNPROVIDED));
                            }
                            else {
                                var192 = (SubLObject)Characters.CHAR_null;
                            }
                        }
                    }
                }
                else {
                    var201 = var199;
                    if (var201.eql((SubLObject)Characters.CHAR_space) || var201.eql((SubLObject)Characters.CHAR_tab) || var201.eql((SubLObject)Characters.CHAR_return) || var201.eql((SubLObject)Characters.CHAR_newline) || var201.eql((SubLObject)Characters.CHAR_equal)) {
                        if (Characters.CHAR_equal.eql(var199)) {
                            var191 = (SubLObject)module0590.T;
                        }
                        if (module0590.NIL != var193) {
                            var190 = (SubLObject)module0590.T;
                            var194 = module0048.f_1_(var198);
                        }
                    }
                    else if (module0590.NIL != var193) {
                        var194 = var198;
                    }
                    else {
                        var193 = var198;
                    }
                }
                if (module0590.NIL != var193 && module0590.NIL != var200) {
                    var202 = f36081(var31, var193, var194, var195, var196);
                    var189 = (SubLObject)ConsesLow.cons(var202, var189);
                    var193 = (SubLObject)module0590.NIL;
                    var194 = (SubLObject)module0590.NIL;
                    var195 = (SubLObject)module0590.NIL;
                    var196 = (SubLObject)module0590.NIL;
                    var191 = (SubLObject)module0590.NIL;
                }
            }
        }
        if (module0590.NIL != var193) {
            final SubLObject var203 = f36081(var31, var193, var194, var195, var196);
            var189 = (SubLObject)ConsesLow.cons(var203, var189);
        }
        return Sequences.nreverse(var189);
    }
    
    public static SubLObject f36078(final SubLObject var31, SubLObject var185) {
        if (var185 == module0590.UNPROVIDED) {
            var185 = (SubLObject)module0590.T;
        }
        final SubLThread var186 = SubLProcess.currentSubLThread();
        final SubLObject var187 = module0034.$g879$.getDynamicValue(var186);
        SubLObject var188 = (SubLObject)module0590.NIL;
        if (module0590.NIL == var187) {
            return f36080(var31, var185);
        }
        var188 = module0034.f1857(var187, (SubLObject)module0590.$ic112$, (SubLObject)module0590.UNPROVIDED);
        if (module0590.NIL == var188) {
            var188 = module0034.f1807(module0034.f1842(var187), (SubLObject)module0590.$ic112$, (SubLObject)module0590.TWO_INTEGER, (SubLObject)module0590.NIL, (SubLObject)module0590.EQUAL, (SubLObject)module0590.UNPROVIDED);
            module0034.f1860(var187, (SubLObject)module0590.$ic112$, var188);
        }
        final SubLObject var189 = module0034.f1782(var31, var185);
        final SubLObject var190 = module0034.f1814(var188, var189, (SubLObject)module0590.UNPROVIDED);
        if (var190 != module0590.$ic116$) {
            SubLObject var191 = var190;
            SubLObject var192 = (SubLObject)module0590.NIL;
            var192 = var191.first();
            while (module0590.NIL != var191) {
                SubLObject var193 = var192.first();
                final SubLObject var194 = conses_high.second(var192);
                if (var31.equal(var193.first())) {
                    var193 = var193.rest();
                    if (module0590.NIL != var193 && module0590.NIL == var193.rest() && var185.equal(var193.first())) {
                        return module0034.f1959(var194);
                    }
                }
                var191 = var191.rest();
                var192 = var191.first();
            }
        }
        final SubLObject var195 = Values.arg2(var186.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f36080(var31, var185)));
        module0034.f1836(var188, var189, var190, var195, (SubLObject)ConsesLow.list(var31, var185));
        return module0034.f1959(var195);
    }
    
    public static SubLObject f36081(final SubLObject var31, final SubLObject var213, final SubLObject var214, final SubLObject var195, final SubLObject var196) {
        final SubLObject var215 = module0039.f3040(module0038.f2623(var31, var213, module0048.f_1X(var214)));
        final SubLObject var216 = (SubLObject)((module0590.NIL != var195) ? module0039.f3040(module0038.f2623(var31, var195, module0048.f_1X(var196))) : module0590.NIL);
        assert module0590.NIL != module0601.f36767(var215) : var215;
        return (SubLObject)ConsesLow.cons(var215, var216);
    }
    
    public static SubLObject f36031(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var31.isString() && module0590.NIL != module0035.f2000(var31, (SubLObject)module0590.THREE_INTEGER, (SubLObject)module0590.UNPROVIDED) && Characters.CHAR_less.eql(module0038.f2636(var31)) && Characters.CHAR_greater.eql(module0038.f2637(var31)));
    }
    
    public static SubLObject f36082(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != f36031(var31) && module0590.NIL == f36032(var31) && module0590.NIL == f36033(var31) && module0590.NIL == f36035(var31));
    }
    
    public static SubLObject f36072(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != f36031(var31) && Characters.CHAR_slash.eql(module0038.f2650(var31, (SubLObject)module0590.ONE_INTEGER)));
    }
    
    public static SubLObject f36039(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != f36031(var31) && module0590.NIL != module0038.f2675(var31, module0601.f36752(), Symbols.symbol_function((SubLObject)module0590.EQUAL)) && module0590.NIL != module0038.f2673(var31, module0601.f36753(), Symbols.symbol_function((SubLObject)module0590.EQUAL)));
    }
    
    public static SubLObject f36083(final SubLObject var215) {
        assert module0590.NIL != f36039(var215) : var215;
        return module0038.f2623(var215, Sequences.length(module0601.f36752()), Numbers.subtract(Sequences.length(var215), Sequences.length(module0601.f36753())));
    }
    
    public static SubLObject f36070(final SubLObject var47, final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != f36031(var31) && module0590.NIL != f36042(var31) && module0590.NIL != f36071(var31, var47));
    }
    
    public static SubLObject f36084(final SubLObject var47, final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != f36031(var31) && module0590.NIL != f36040(var31) && module0590.NIL != f36071(var31, var47));
    }
    
    public static SubLObject f36071(final SubLObject var31, final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        assert module0590.NIL != Types.stringp(var31) : var31;
        if (module0590.NIL == f36031(var31)) {
            return (SubLObject)module0590.NIL;
        }
        var48.resetMultipleValues();
        final SubLObject var49 = f36085(var31);
        final SubLObject var50 = var48.secondMultipleValue();
        var48.resetMultipleValues();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != module0035.f1995(var47, Numbers.subtract(var50, var49), (SubLObject)module0590.UNPROVIDED) && module0590.NIL != module0038.f2678(var31, var47, var49, (SubLObject)module0590.UNPROVIDED));
    }
    
    public static SubLObject f36041(final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (module0590.NIL == Errors.$ignore_mustsP$.getDynamicValue(var32) && !var31.isString()) {
            Errors.error((SubLObject)module0590.$ic120$, var31);
        }
        if (module0590.NIL == f36031(var31)) {
            return (SubLObject)module0590.NIL;
        }
        var32.resetMultipleValues();
        final SubLObject var33 = f36085(var31);
        final SubLObject var34 = var32.secondMultipleValue();
        var32.resetMultipleValues();
        return module0038.f2623(var31, var33, var34);
    }
    
    public static SubLObject f36085(final SubLObject var31) {
        final SubLObject var32 = (SubLObject)(Characters.CHAR_slash.eql(Strings.sublisp_char(var31, (SubLObject)module0590.ONE_INTEGER)) ? module0590.TWO_INTEGER : module0590.ONE_INTEGER);
        final SubLObject var33 = Sequences.position_if((SubLObject)module0590.$ic113$, var31, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED);
        final SubLObject var34 = Sequences.length(var31);
        final SubLObject var35 = (module0590.NIL != f36072(var31)) ? Numbers.subtract(var34, (SubLObject)module0590.TWO_INTEGER) : Numbers.subtract(var34, (SubLObject)module0590.ONE_INTEGER);
        final SubLObject var36 = (module0590.NIL != var33) ? var33 : var35;
        return Values.values(var32, var36);
    }
    
    public static SubLObject f36086(final SubLObject var6) {
        final SubLObject var7 = module0052.f3709(var6);
        final SubLObject var8 = f36087(var7, (SubLObject)module0590.UNPROVIDED);
        SubLObject var9 = (SubLObject)module0590.NIL;
        while (module0590.NIL == module0052.f3687(var7)) {
            var9 = (SubLObject)ConsesLow.cons(module0052.f3693(var7), var9);
        }
        module0052.f3696(var7);
        return Values.values(var8, Sequences.nreverse(var9));
    }
    
    public static SubLObject f36087(final SubLObject var27, SubLObject var150) {
        if (var150 == module0590.UNPROVIDED) {
            var150 = (SubLObject)module0590.NIL;
        }
        final SubLObject var151 = module0052.f3687(var27);
        if (module0590.NIL == var150 && module0590.NIL == var151) {
            var150 = module0052.f3693(var27);
        }
        if (module0590.NIL != var151) {
            return (SubLObject)module0590.NIL;
        }
        if (module0590.NIL != f36072(var150)) {
            return (SubLObject)ConsesLow.list(f36044(var150));
        }
        if (module0590.NIL != f36039(var150)) {
            return f36083(var150);
        }
        if (module0590.NIL == f36031(var150)) {
            return var150;
        }
        return f36088(var27, var150);
    }
    
    public static SubLObject f36088(final SubLObject var27, final SubLObject var150) {
        if (module0590.NIL != f36025(var150)) {
            return f36087(var27, (SubLObject)module0590.UNPROVIDED);
        }
        final SubLObject var151 = f36044(var150);
        SubLObject var152 = (SubLObject)ConsesLow.list(var151);
        SubLObject var153;
        for (var153 = (SubLObject)((module0590.NIL != module0052.f3687(var27)) ? module0590.NIL : module0052.f3693(var27)); module0590.NIL != f36025(var153); var153 = (SubLObject)((module0590.NIL != module0052.f3687(var27)) ? module0590.NIL : module0052.f3693(var27))) {}
        while (module0590.NIL == module0052.f3687(var27)) {
            if (module0590.NIL != f36070(var151.first(), var153)) {
                return Sequences.reverse(var152);
            }
            final SubLObject var154 = f36087(var27, var153);
            if (var154.isString()) {
                if (var152.first().isString()) {
                    final SubLObject var155 = var152.first();
                    final SubLObject var156 = Sequences.cconcatenate(var155, var154);
                    var152 = var152.rest();
                    var152 = (SubLObject)ConsesLow.cons(var156, var152);
                }
                else if (!module0590.$ic121$.equal(module0038.f2735(var154))) {
                    var152 = (SubLObject)ConsesLow.cons(var154, var152);
                }
            }
            else {
                var152 = (SubLObject)ConsesLow.cons(var154, var152);
            }
            var153 = (SubLObject)((module0590.NIL != module0052.f3687(var27)) ? module0590.NIL : module0052.f3693(var27));
        }
        return Sequences.reverse(var152);
    }
    
    public static SubLObject f36089(final SubLObject var215, final SubLObject var58, SubLObject var227) {
        if (var227 == module0590.UNPROVIDED) {
            var227 = (SubLObject)module0590.NIL;
        }
        assert module0590.NIL != f36031(var215) : var215;
        assert module0590.NIL != Types.stringp(var58) : var58;
        final SubLObject var228 = f36044(var215).rest();
        return module0035.f2294(var228, var58, Symbols.symbol_function((SubLObject)module0590.$ic122$), var227);
    }
    
    public static SubLObject f36025(final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != f36032(var31) || module0590.NIL != f36033(var31) || module0590.NIL != f36035(var31) || module0590.NIL != f36034(var31));
    }
    
    public static SubLObject f36090(final SubLObject var228, final SubLObject var219) {
        SubLObject var229 = var219.rest();
        SubLObject var230 = (SubLObject)module0590.NIL;
        var230 = var229.first();
        while (module0590.NIL != var229) {
            if (var230.first().first().equal(var228)) {
                return conses_high.second(var230);
            }
            var229 = var229.rest();
            var230 = var229.first();
        }
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36091(final SubLObject var219) {
        return var219.first();
    }
    
    public static SubLObject f36092(final SubLObject var219) {
        return f36091(var219).first();
    }
    
    public static SubLObject f36093(final SubLObject var219, final SubLObject var215) {
        SubLObject var220 = f36094(var219, (SubLObject)module0590.UNPROVIDED);
        SubLObject var221 = (SubLObject)module0590.NIL;
        var221 = var220.first();
        while (module0590.NIL != var220) {
            if (module0590.NIL != Strings.stringE(f36092(var221), var215, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED)) {
                return var221;
            }
            var220 = var220.rest();
            var221 = var220.first();
        }
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36094(final SubLObject var219, SubLObject var215) {
        if (var215 == module0590.UNPROVIDED) {
            var215 = (SubLObject)module0590.NIL;
        }
        if (module0590.NIL != var215) {
            SubLObject var220 = (SubLObject)module0590.NIL;
            SubLObject var221 = var219.rest();
            SubLObject var222 = (SubLObject)module0590.NIL;
            var222 = var221.first();
            while (module0590.NIL != var221) {
                if (var222.isList() && module0590.NIL != Strings.stringE(f36092(var222), var215, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED, (SubLObject)module0590.UNPROVIDED)) {
                    var220 = (SubLObject)ConsesLow.cons(var222, var220);
                }
                var221 = var221.rest();
                var222 = var221.first();
            }
            return Sequences.nreverse(var220);
        }
        return var219.rest();
    }
    
    public static SubLObject f36095(final SubLObject var219) {
        return f36091(var219).rest();
    }
    
    public static SubLObject f36096(final SubLObject var219, final SubLObject var58) {
        return conses_high.assoc(var58, f36095(var219), (SubLObject)module0590.$ic122$, (SubLObject)module0590.UNPROVIDED).rest();
    }
    
    public static SubLObject f36097(final SubLObject var219, final SubLObject var232, final SubLObject var59) {
        final SubLObject var233 = module0035.f2063(f36095(var219), var232, var59, Symbols.symbol_function((SubLObject)module0590.$ic122$));
        ConsesLow.rplacd(f36091(var219), var233);
        return var219;
    }
    
    public static SubLObject f36098(final SubLObject var219) {
        return module0035.f2012(f36094(var219, (SubLObject)module0590.UNPROVIDED));
    }
    
    public static SubLObject f36099(final SubLObject var219) {
        final SubLObject var220 = f36094(var219, (SubLObject)module0590.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0590.NIL != module0035.f1997(var220) && var220.first().isString());
    }
    
    public static SubLObject f36100(final SubLObject var219) {
        return f36094(var219, (SubLObject)module0590.UNPROVIDED).first();
    }
    
    public static SubLObject f36101() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35984", "S#39602", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35985", "S#39770", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35987", "S#39771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35989", "S#39764", 1, 0, false);
        new $f35989$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35990", "S#39772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35991", "S#39773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35992", "S#39774", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35993", "S#39775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35994", "S#39776", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35995", "S#39777", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35996", "S#39778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35997", "S#39779", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35998", "S#39780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35999", "S#39781", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36000", "S#39782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36001", "S#39783", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36002", "S#39784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36003", "S#39785", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36004", "S#39786", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36005", "S#39787", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36006", "S#39788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36007", "S#39789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36008", "S#39790", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36009", "S#39791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36010", "S#39792", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35988", "S#39793", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36011", "S#39794", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36012", "S#39795", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36013", "S#39796", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36014", "S#39797", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36015", "S#39798", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36016", "S#39799", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36017", "S#39800", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36018", "S#39801", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36019", "S#39802", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36020", "S#39803", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36021", "S#5105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36024", "S#39804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36026", "S#39805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f35986", "S#39806", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36023", "S#39807", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36027", "S#5252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36022", "S#39808", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36029", "S#39809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36036", "S#39810", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36043", "S#39811", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36038", "S#39812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36045", "S#39813", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36046", "S#39814", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36048", "S#39815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36047", "S#39816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36049", "S#39817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36050", "S#39818", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36051", "XML-TOKENIZED-HTTP-REQUEST", 2, 9, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36052", "S#39819", 9, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0590", "f36053", "S#39820");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36054", "S#39821", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36055", "S#39822", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36056", "S#39823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36057", "S#39766", 2, 0, false);
        new $f36057$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36058", "S#39824", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36059", "S#39825", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36060", "S#39826", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36061", "S#39827", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36062", "S#39828", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36063", "S#39829", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36064", "S#39830", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36065", "S#39831", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36066", "S#39832", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36067", "S#39833", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36068", "S#39834", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36069", "S#39835", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36032", "S#39836", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36035", "S#39837", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36042", "S#39838", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36040", "S#39839", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36073", "S#39840", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36074", "S#39841", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36028", "S#39842", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36033", "S#39843", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36075", "S#39844", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36034", "S#39845", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36037", "S#39846", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36030", "S#39847", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36076", "S#39848", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36077", "S#39849", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36044", "S#39850", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36079", "S#39851", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36080", "S#39852", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36078", "S#39853", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36081", "S#39854", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36031", "S#39855", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36082", "S#39856", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36072", "S#39857", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36039", "S#39858", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36083", "S#39859", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36070", "S#39860", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36084", "S#39861", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36071", "S#39862", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36041", "S#39863", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36085", "S#39864", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36086", "S#39601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36087", "S#39865", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36088", "S#39866", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36089", "S#39867", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36025", "S#39868", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36090", "S#39869", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36091", "S#39870", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36092", "S#39600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36093", "S#39871", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36094", "S#39872", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36095", "S#39873", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36096", "S#39874", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36097", "S#39875", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36098", "S#39876", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36099", "S#39877", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0590", "f36100", "S#39878", 1, 0, false);
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36102() {
        module0590.$g4502$ = SubLFiles.defparameter("S#39879", (SubLObject)module0590.NIL);
        module0590.$g4503$ = SubLFiles.defconstant("S#39880", (SubLObject)module0590.$ic3$);
        module0590.$g4504$ = SubLFiles.defparameter("S#39881", module0107.f7627());
        return (SubLObject)module0590.NIL;
    }
    
    public static SubLObject f36103() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0590.$g4503$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0590.$ic10$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0590.$ic11$);
        Structures.def_csetf((SubLObject)module0590.$ic12$, (SubLObject)module0590.$ic13$);
        Structures.def_csetf((SubLObject)module0590.$ic14$, (SubLObject)module0590.$ic15$);
        Structures.def_csetf((SubLObject)module0590.$ic16$, (SubLObject)module0590.$ic17$);
        Structures.def_csetf((SubLObject)module0590.$ic18$, (SubLObject)module0590.$ic19$);
        Structures.def_csetf((SubLObject)module0590.$ic20$, (SubLObject)module0590.$ic21$);
        Structures.def_csetf((SubLObject)module0590.$ic22$, (SubLObject)module0590.$ic23$);
        Structures.def_csetf((SubLObject)module0590.$ic24$, (SubLObject)module0590.$ic25$);
        Structures.def_csetf((SubLObject)module0590.$ic26$, (SubLObject)module0590.$ic27$);
        Structures.def_csetf((SubLObject)module0590.$ic28$, (SubLObject)module0590.$ic29$);
        Equality.identity((SubLObject)module0590.$ic3$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0590.$g4503$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0590.$ic44$));
        module0012.f419((SubLObject)module0590.$ic9$);
        module0012.f419((SubLObject)module0590.$ic1$);
        module0012.f419((SubLObject)module0590.$ic2$);
        module0002.f38((SubLObject)module0590.$ic56$);
        module0034.f1895((SubLObject)module0590.$ic112$);
        return (SubLObject)module0590.NIL;
    }
    
    public void declareFunctions() {
        f36101();
    }
    
    public void initializeVariables() {
        f36102();
    }
    
    public void runTopLevelForms() {
        f36103();
    }
    
    static {
        me = (SubLFile)new module0590();
        module0590.$g4502$ = null;
        module0590.$g4503$ = null;
        module0590.$g4504$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("STREAMP");
        $ic1$ = SubLObjectFactory.makeSymbol("S#39807", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#5252", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("S#39763", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#39764", "CYC");
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#6009", "CYC"), SubLObjectFactory.makeSymbol("S#39882", "CYC"), SubLObjectFactory.makeSymbol("S#39883", "CYC"), SubLObjectFactory.makeSymbol("S#39884", "CYC"), SubLObjectFactory.makeSymbol("S#39885", "CYC"), SubLObjectFactory.makeSymbol("S#39886", "CYC"), SubLObjectFactory.makeSymbol("S#39887", "CYC"), SubLObjectFactory.makeSymbol("S#39888", "CYC"), SubLObjectFactory.makeSymbol("S#39889", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("IN-STREAM"), SubLObjectFactory.makeKeyword("SCRATCH-STREAM"), SubLObjectFactory.makeKeyword("TOKEN-OUTPUT-STREAM"), SubLObjectFactory.makeKeyword("ENTITY-MAP"), SubLObjectFactory.makeKeyword("NAMESPACE-STACK"), SubLObjectFactory.makeKeyword("VALIDATE?"), SubLObjectFactory.makeKeyword("RESOLVE-ENTITY-REFERENCES?"), SubLObjectFactory.makeKeyword("RESOLVE-NAMESPACES?"), SubLObjectFactory.makeKeyword("ON-DECK-QUEUE") });
        $ic7$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#39772", "CYC"), SubLObjectFactory.makeSymbol("S#39773", "CYC"), SubLObjectFactory.makeSymbol("S#39774", "CYC"), SubLObjectFactory.makeSymbol("S#39775", "CYC"), SubLObjectFactory.makeSymbol("S#39776", "CYC"), SubLObjectFactory.makeSymbol("S#39777", "CYC"), SubLObjectFactory.makeSymbol("S#39778", "CYC"), SubLObjectFactory.makeSymbol("S#39779", "CYC"), SubLObjectFactory.makeSymbol("S#39780", "CYC") });
        $ic8$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#39781", "CYC"), SubLObjectFactory.makeSymbol("S#39782", "CYC"), SubLObjectFactory.makeSymbol("S#39783", "CYC"), SubLObjectFactory.makeSymbol("S#39784", "CYC"), SubLObjectFactory.makeSymbol("S#39785", "CYC"), SubLObjectFactory.makeSymbol("S#39786", "CYC"), SubLObjectFactory.makeSymbol("S#39787", "CYC"), SubLObjectFactory.makeSymbol("S#39788", "CYC"), SubLObjectFactory.makeSymbol("S#39789", "CYC") });
        $ic9$ = SubLObjectFactory.makeSymbol("S#39793", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#39771", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#39764", "CYC"));
        $ic12$ = SubLObjectFactory.makeSymbol("S#39772", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#39781", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#39773", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#39782", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#39774", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#39783", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#39775", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#39784", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#39776", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#39785", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#39777", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#39786", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#39778", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#39787", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#39779", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#39788", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#39780", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#39789", "CYC");
        $ic30$ = SubLObjectFactory.makeKeyword("IN-STREAM");
        $ic31$ = SubLObjectFactory.makeKeyword("SCRATCH-STREAM");
        $ic32$ = SubLObjectFactory.makeKeyword("TOKEN-OUTPUT-STREAM");
        $ic33$ = SubLObjectFactory.makeKeyword("ENTITY-MAP");
        $ic34$ = SubLObjectFactory.makeKeyword("NAMESPACE-STACK");
        $ic35$ = SubLObjectFactory.makeKeyword("VALIDATE?");
        $ic36$ = SubLObjectFactory.makeKeyword("RESOLVE-ENTITY-REFERENCES?");
        $ic37$ = SubLObjectFactory.makeKeyword("RESOLVE-NAMESPACES?");
        $ic38$ = SubLObjectFactory.makeKeyword("ON-DECK-QUEUE");
        $ic39$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic40$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic41$ = SubLObjectFactory.makeSymbol("S#39790", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic43$ = SubLObjectFactory.makeKeyword("END");
        $ic44$ = SubLObjectFactory.makeSymbol("S#39792", "CYC");
        $ic45$ = SubLObjectFactory.makeString("<XML-TOKEN-ITERATOR-STATE>");
        $ic46$ = SubLObjectFactory.makeKeyword("DONE");
        $ic47$ = SubLObjectFactory.makeString("Couldn't resolve namespace ~S in ~S");
        $ic48$ = SubLObjectFactory.makeString("Mismatched tags: Expected ~S, got ~S");
        $ic49$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#39890", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1762", "CYC"));
        $ic50$ = SubLObjectFactory.makeString("xmlns:");
        $ic51$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#1737", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic52$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#39891", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1069245"));
        $ic53$ = SubLObjectFactory.makeString("xml");
        $ic54$ = SubLObjectFactory.makeString("http://www.w3.org/XML/1998/namespace");
        $ic55$ = SubLObjectFactory.makeString("~S is not a prefixed XML name.");
        $ic56$ = SubLObjectFactory.makeSymbol("XML-TOKENIZED-HTTP-REQUEST");
        $ic57$ = SubLObjectFactory.makeKeyword("GET");
        $ic58$ = SubLObjectFactory.makeInteger(80);
        $ic59$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic60$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic61$ = SubLObjectFactory.makeKeyword("OPEN-CONNECTION");
        $ic62$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic63$ = SubLObjectFactory.makeKeyword("OVERALL");
        $ic64$ = SubLObjectFactory.makeKeyword("PRIVATE");
        $ic65$ = SubLObjectFactory.makeKeyword("MACHINE");
        $ic66$ = SubLObjectFactory.makeKeyword("PORT");
        $ic67$ = SubLObjectFactory.makeKeyword("METHOD");
        $ic68$ = SubLObjectFactory.makeKeyword("URL");
        $ic69$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic70$ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $ic71$ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $ic72$ = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $ic73$ = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $ic74$ = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6009", "CYC"));
        $ic76$ = SubLObjectFactory.makeSymbol("S#39820", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39602", "CYC"));
        $ic78$ = SubLObjectFactory.makeSymbol("S#39602", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)module0590.NIL);
        $ic80$ = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $ic81$ = SubLObjectFactory.makeSymbol("S#39766", "CYC");
        $ic82$ = SubLObjectFactory.makeString("<");
        $ic83$ = SubLObjectFactory.makeString("/>");
        $ic84$ = SubLObjectFactory.makeString("</");
        $ic85$ = SubLObjectFactory.makeSymbol("S#39855", "CYC");
        $ic86$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#39892", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39893", "CYC"));
        $ic87$ = SubLObjectFactory.makeSymbol("S#39862", "CYC");
        $ic88$ = SubLObjectFactory.makeString("Couldn't find position of ~S in ~S");
        $ic89$ = SubLObjectFactory.makeString("?xml");
        $ic90$ = SubLObjectFactory.makeString("<!--");
        $ic91$ = SubLObjectFactory.makeString("-->");
        $ic92$ = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_less, (SubLObject)Characters.CHAR_greater));
        $ic93$ = ConsesLow.list((SubLObject)Characters.CHAR_less, (SubLObject)Characters.CHAR_greater);
        $ic94$ = SubLObjectFactory.makeString("!--");
        $ic95$ = SubLObjectFactory.makeString("![CDATA[");
        $ic96$ = SubLObjectFactory.makeString("--");
        $ic97$ = SubLObjectFactory.makeString("]]");
        $ic98$ = SubLObjectFactory.makeString("Mismatched closing bracket ~S following ~S. Expected ~S");
        $ic99$ = SubLObjectFactory.makeString("!DOCTYPE");
        $ic100$ = SubLObjectFactory.makeString("<!DOCTYPE HTML ");
        $ic101$ = SubLObjectFactory.makeString("<?");
        $ic102$ = SubLObjectFactory.makeString("?>");
        $ic103$ = ConsesLow.list((SubLObject)Characters.CHAR_lbracket);
        $ic104$ = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("S#39894", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39895", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $ic105$ = SubLObjectFactory.makeString("<!DOCTYPE");
        $ic106$ = SubLObjectFactory.makeString("Got ~S instead of <!DOCTYPE.");
        $ic107$ = SubLObjectFactory.makeString("[");
        $ic108$ = SubLObjectFactory.makeString("<!ENTITY");
        $ic109$ = SubLObjectFactory.makeString("&");
        $ic110$ = SubLObjectFactory.makeString(";");
        $ic111$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1546", "CYC"));
        $ic112$ = SubLObjectFactory.makeSymbol("S#39853", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#3951", "CYC");
        $ic114$ = SubLObjectFactory.makeString("XML syntax error: No = before ~S");
        $ic115$ = SubLObjectFactory.makeString("XML syntax error: Value starting at ~S is not in quotes.");
        $ic116$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic117$ = SubLObjectFactory.makeSymbol("S#39767", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#39858", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic120$ = SubLObjectFactory.makeString("~S is not an XML token");
        $ic121$ = SubLObjectFactory.makeString("");
        $ic122$ = SubLObjectFactory.makeSymbol("STRING=");
    }
    
    public static final class $sX39763_native extends SubLStructNative
    {
        public SubLObject $in_stream;
        public SubLObject $scratch_stream;
        public SubLObject $token_output_stream;
        public SubLObject $entity_map;
        public SubLObject $namespace_stack;
        public SubLObject $validateP;
        public SubLObject $resolve_entity_referencesP;
        public SubLObject $resolve_namespacesP;
        public SubLObject $on_deck_queue;
        private static final SubLStructDeclNative structDecl;
        
        public $sX39763_native() {
            this.$in_stream = (SubLObject)CommonSymbols.NIL;
            this.$scratch_stream = (SubLObject)CommonSymbols.NIL;
            this.$token_output_stream = (SubLObject)CommonSymbols.NIL;
            this.$entity_map = (SubLObject)CommonSymbols.NIL;
            this.$namespace_stack = (SubLObject)CommonSymbols.NIL;
            this.$validateP = (SubLObject)CommonSymbols.NIL;
            this.$resolve_entity_referencesP = (SubLObject)CommonSymbols.NIL;
            this.$resolve_namespacesP = (SubLObject)CommonSymbols.NIL;
            this.$on_deck_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX39763_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$in_stream;
        }
        
        public SubLObject getField3() {
            return this.$scratch_stream;
        }
        
        public SubLObject getField4() {
            return this.$token_output_stream;
        }
        
        public SubLObject getField5() {
            return this.$entity_map;
        }
        
        public SubLObject getField6() {
            return this.$namespace_stack;
        }
        
        public SubLObject getField7() {
            return this.$validateP;
        }
        
        public SubLObject getField8() {
            return this.$resolve_entity_referencesP;
        }
        
        public SubLObject getField9() {
            return this.$resolve_namespacesP;
        }
        
        public SubLObject getField10() {
            return this.$on_deck_queue;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$in_stream = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$scratch_stream = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$token_output_stream = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$entity_map = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$namespace_stack = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$validateP = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$resolve_entity_referencesP = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$resolve_namespacesP = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$on_deck_queue = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX39763_native.class, module0590.$ic3$, module0590.$ic4$, module0590.$ic5$, module0590.$ic6$, new String[] { "$in_stream", "$scratch_stream", "$token_output_stream", "$entity_map", "$namespace_stack", "$validateP", "$resolve_entity_referencesP", "$resolve_namespacesP", "$on_deck_queue" }, module0590.$ic7$, module0590.$ic8$, module0590.$ic9$);
        }
    }
    
    public static final class $f35989$UnaryFunction extends UnaryFunction
    {
        public $f35989$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39764"));
        }
        
        public SubLObject processItem(final SubLObject var10) {
            return module0590.f35989(var10);
        }
    }
    
    public static final class $f36057$BinaryFunction extends BinaryFunction
    {
        public $f36057$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#39766"));
        }
        
        public SubLObject processItem(final SubLObject var10, final SubLObject var130) {
            return module0590.f36057(var10, var130);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0590.class
	Total time: 595 ms
	
	Decompiled with Procyon 0.5.32.
*/