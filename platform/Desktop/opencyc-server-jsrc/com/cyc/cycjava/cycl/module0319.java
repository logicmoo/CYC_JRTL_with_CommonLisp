package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0319 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0319";
    public static final String myFingerPrint = "21936bd087a10b0888ff0b95624a2321522f089d070760cb98d1f394d15e33ed";
    public static SubLSymbol $g2812$;
    private static SubLSymbol $g2813$;
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
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLList $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLObject $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLList $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
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
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
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
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLObject $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
    private static final SubLObject $ic131$;
    private static final SubLList $ic132$;
    private static final SubLList $ic133$;
    private static final SubLString $ic134$;
    
    public static SubLObject f21474(final SubLObject var1, final SubLObject var2) {
        f21475(var1, var2, (SubLObject)module0319.ZERO_INTEGER);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21476(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX24003_native.class) ? module0319.T : module0319.NIL);
    }
    
    public static SubLObject f21477(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f21478(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f21479(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f21480(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f21481(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f21482(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f21483(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f21484(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f21485(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f21486(final SubLObject var1) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f21487(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f21488(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f21489(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f21490(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f21491(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f21492(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f21493(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f21494(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f21495(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f21496(final SubLObject var1, final SubLObject var4) {
        assert module0319.NIL != f21476(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f21497(SubLObject var5) {
        if (var5 == module0319.UNPROVIDED) {
            var5 = (SubLObject)module0319.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX24003_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0319.NIL, var7 = var5; module0319.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0319.$ic29$)) {
                f21487(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic30$)) {
                f21488(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic31$)) {
                f21489(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic32$)) {
                f21490(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic33$)) {
                f21491(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic34$)) {
                f21492(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic35$)) {
                f21493(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic36$)) {
                f21494(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic37$)) {
                f21495(var6, var9);
            }
            else if (var10.eql((SubLObject)module0319.$ic38$)) {
                f21496(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0319.$ic39$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f21498(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic40$, (SubLObject)module0319.$ic41$, (SubLObject)module0319.TEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic29$, f21477(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic30$, f21478(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic31$, f21479(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic32$, f21480(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic33$, f21481(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic34$, f21482(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic35$, f21483(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic36$, f21484(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic37$, f21485(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic42$, (SubLObject)module0319.$ic38$, f21486(var11));
        Functions.funcall(var12, var11, (SubLObject)module0319.$ic43$, (SubLObject)module0319.$ic41$, (SubLObject)module0319.TEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f21499(final SubLObject var11, final SubLObject var12) {
        return f21498(var11, var12);
    }
    
    public static SubLObject f21475(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0319.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            f21500(var13, var2);
        }
        else if (module0319.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0319.$ic45$, var2, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0319.$ic46$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0319.$ic46$, var2, module0319.$ic47$, module0319.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21500(final SubLObject var19, SubLObject var2) {
        if (var2 == module0319.UNPROVIDED) {
            var2 = (SubLObject)module0319.T;
        }
        PrintLow.format(var2, (SubLObject)module0319.$ic48$, f21478(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic49$, f21479(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic50$, f21480(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic51$, f21481(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic52$, f21482(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic53$, f21483(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic54$, f21477(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic55$, f21484(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic56$, f21485(var19));
        PrintLow.format(var2, (SubLObject)module0319.$ic57$, f21486(var19));
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21501(final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var25, final SubLObject var26) {
        final SubLObject var27 = f21497((SubLObject)module0319.UNPROVIDED);
        f21488(var27, var20);
        f21489(var27, var21);
        f21490(var27, var22);
        f21491(var27, var23);
        f21492(var27, var24);
        f21493(var27, var25);
        f21487(var27, var26);
        f21494(var27, (SubLObject)module0319.$ic58$);
        f21495(var27, var21);
        f21496(var27, module0141.f9195());
        return var27;
    }
    
    public static SubLObject f21502(final SubLObject var19, final SubLObject var27) {
        final SubLObject var28 = f21497((SubLObject)module0319.UNPROVIDED);
        final SubLObject var29 = (module0319.NIL != var27) ? module0107.f7613(f21481(var19)) : f21481(var19);
        f21488(var28, f21478(var19));
        f21489(var28, f21479(var19));
        f21490(var28, f21480(var19));
        f21491(var28, var29);
        f21492(var28, f21482(var19));
        f21487(var28, f21477(var19));
        f21494(var28, f21484(var19));
        f21495(var28, f21485(var19));
        f21496(var28, f21486(var19));
        return var28;
    }
    
    public static SubLObject f21503(final SubLObject var19) {
        return f21478(var19);
    }
    
    public static SubLObject f21504(final SubLObject var19) {
        return f21479(var19);
    }
    
    public static SubLObject f21505(final SubLObject var19) {
        return f21480(var19);
    }
    
    public static SubLObject f21506(final SubLObject var19) {
        return f21485(var19);
    }
    
    public static SubLObject f21507(final SubLObject var19) {
        return f21486(var19);
    }
    
    public static SubLObject f21508(final SubLObject var19) {
        return f21481(var19);
    }
    
    public static SubLObject f21509(final SubLObject var19) {
        return f21482(var19);
    }
    
    public static SubLObject f21510(final SubLObject var19) {
        return f21483(var19);
    }
    
    public static SubLObject f21511(final SubLObject var19) {
        return f21477(var19);
    }
    
    public static SubLObject f21512(final SubLObject var19) {
        return f21484(var19);
    }
    
    public static SubLObject f21513(final SubLObject var13, final SubLObject var29) {
        return module0318.f21429(f21508(var13), var29);
    }
    
    public static SubLObject f21514(final SubLObject var19) {
        return module0318.f21460(f21503(var19));
    }
    
    public static SubLObject f21515(final SubLObject var19) {
        return Equality.eq((SubLObject)module0319.$ic59$, f21514(var19));
    }
    
    public static SubLObject f21516(final SubLObject var30, final SubLObject var19) {
        return module0205.f13384(var30, f21508(var19), (SubLObject)module0319.UNPROVIDED);
    }
    
    public static SubLObject f21517(final SubLObject var19, final SubLObject var29) {
        final SubLObject var30 = f21508(var19);
        return module0318.f21429(var30, var29);
    }
    
    public static SubLObject f21518(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic60$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0319.NIL;
        SubLObject var37 = (SubLObject)module0319.NIL;
        SubLObject var38 = (SubLObject)module0319.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic60$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic60$);
        var37 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic60$);
        var38 = var34.first();
        var34 = var34.rest();
        if (module0319.NIL == var34) {
            final SubLObject var39;
            var34 = (var39 = var35);
            final SubLObject var40 = (SubLObject)module0319.$ic61$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic62$, (SubLObject)ConsesLow.list(var36, var40, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic63$, var37), var38), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic64$, var40), ConsesLow.append(var39, (SubLObject)module0319.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0319.$ic60$);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21519(final SubLObject var19, final SubLObject var40) {
        f21489(var19, var40);
        return var19;
    }
    
    public static SubLObject f21520(final SubLObject var19, final SubLObject var25) {
        f21493(var19, var25);
        return var19;
    }
    
    public static SubLObject f21521(final SubLObject var19, final SubLObject var41) {
        assert module0319.NIL != module0318.f21465(var41) : var41;
        f21494(var19, var41);
        return var19;
    }
    
    public static SubLObject f21522(final SubLObject var19, final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        var43.resetMultipleValues();
        final SubLObject var44 = f21523(var19, module0321.f21688(var42));
        final SubLObject var45 = var43.secondMultipleValue();
        var43.resetMultipleValues();
        f21520(var19, var44);
        if (module0319.NIL != var45) {
            f21521(var19, var45);
            module0321.f21695(var19, var45);
        }
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21524(final SubLObject var19) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0319.NIL != f21477(var19));
    }
    
    public static SubLObject f21525(final SubLObject var43) {
        return module0004.f104(var43, module0319.$g2813$.getGlobalValue(), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED);
    }
    
    public static SubLObject f21526(final SubLObject var44, final SubLObject var45) {
        return Numbers.numL(Sequences.position(var44, module0319.$g2813$.getGlobalValue(), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED), Sequences.position(var45, module0319.$g2813$.getGlobalValue(), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED));
    }
    
    public static SubLObject f21527(final SubLObject var19) {
        return Equality.eq(f21511(var19), (SubLObject)module0319.$ic67$);
    }
    
    public static SubLObject f21528(final SubLObject var19) {
        return Equality.eq(f21511(var19), (SubLObject)module0319.$ic68$);
    }
    
    public static SubLObject f21529(final SubLObject var19) {
        return Equality.eq(f21511(var19), (SubLObject)module0319.$ic69$);
    }
    
    public static SubLObject f21530(final SubLObject var19) {
        return Equality.eq(f21511(var19), (SubLObject)module0319.$ic70$);
    }
    
    public static SubLObject f21531(final SubLObject var46, final SubLObject var47) {
        final SubLObject var48 = f21511(var46);
        final SubLObject var49 = f21511(var47);
        final SubLObject var50 = f21510(var46);
        final SubLObject var51 = f21510(var47);
        if (var48.eql(var49) && var50.isInteger() && var51.isInteger()) {
            return Numbers.numL(var50, var51);
        }
        return f21526(var48, var49);
    }
    
    public static SubLObject f21532(final SubLObject var46, final SubLObject var47, SubLObject var50) {
        if (var50 == module0319.UNPROVIDED) {
            var50 = (SubLObject)module0319.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0319.NIL != ((module0319.NIL == var50) ? f21533(var46, var47) : f21534(var46, var47)) && (f21477(var46).eql(f21477(var47)) || module0319.NIL != f21526(f21477(var46), f21477(var47))));
    }
    
    public static SubLObject f21533(final SubLObject var46, final SubLObject var47) {
        return (SubLObject)SubLObjectFactory.makeBoolean(f21508(var46).numE(f21508(var47)) && (module0319.NIL == f21503(var47) || f21503(var46).eql(f21503(var47))) && (module0319.NIL == f21505(var47) || f21505(var46).eql(f21505(var47))));
    }
    
    public static SubLObject f21534(final SubLObject var46, final SubLObject var47) {
        return (SubLObject)SubLObjectFactory.makeBoolean(f21508(var46).numE(module0107.f7613(f21508(var47))) && f21503(var46).eql(f21503(var47)) && f21505(var46).eql(f21505(var47)));
    }
    
    public static SubLObject f21535(final SubLObject var20, final SubLObject var51, final SubLObject var52, final SubLObject var23) {
        if (var20.eql(module0319.$ic71$) || var20.eql(module0319.$ic72$)) {
            final SubLObject var53 = module0241.f15634(var51, var52);
            return f21536(var51, var52, var23, var53);
        }
        if (var20.eql(module0319.$ic73$) || var20.eql(module0319.$ic74$)) {
            final SubLObject var54 = module0241.f15635(var51, var52);
            return f21536(var51, var52, var23, var54);
        }
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21536(final SubLObject var51, final SubLObject var52, final SubLObject var23, final SubLObject var55) {
        if (module0319.NIL == module0202.f12689(var52, (SubLObject)module0319.UNPROVIDED)) {
            return (SubLObject)module0319.NIL;
        }
        if (module0319.NIL != module0318.f21433(var55) && module0319.NIL != module0313.f21137(var52)) {
            return (SubLObject)module0319.$ic68$;
        }
        if (module0319.NIL == module0318.f21433(var55) && module0319.NIL != module0313.f21137(var52)) {
            return (SubLObject)module0319.$ic69$;
        }
        if (module0319.NIL == module0537.f33304(var52)) {
            return (SubLObject)module0319.$ic70$;
        }
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21523(final SubLObject var19, final SubLObject var52) {
        final SubLObject var53 = f21514(var19);
        final SubLObject var54 = f21505(var19);
        final SubLObject var55 = f21511(var19);
        SubLObject var56 = (SubLObject)module0319.NIL;
        SubLObject var57 = (SubLObject)module0319.NIL;
        final SubLObject var58 = var55;
        if (var58.eql((SubLObject)module0319.$ic68$)) {
            var56 = f21537(var54, var52, var53);
            var57 = f21538(var56);
        }
        else if (var58.eql((SubLObject)module0319.$ic69$)) {
            var57 = f21539(var54, var52, var53);
        }
        else if (var58.eql((SubLObject)module0319.$ic70$)) {}
        return Values.values(var57, var56);
    }
    
    public static SubLObject f21540(final SubLObject var51, final SubLObject var57) {
        if (var51.eql(module0319.$ic75$) || var51.eql(module0319.$ic76$)) {
            SubLObject var58 = (SubLObject)module0319.NIL;
            SubLObject var59 = (SubLObject)module0319.NIL;
            final Iterator var60 = Hashtables.getEntrySetIterator(var57);
            try {
                while (Hashtables.iteratorHasNext(var60)) {
                    final Map.Entry var61 = Hashtables.iteratorNextEntry(var60);
                    var58 = Hashtables.getEntryKey(var61);
                    var59 = Hashtables.getEntryValue(var61);
                    if (var59.isCons() && module0319.NIL == module0004.f104(var51, var59, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED)) {
                        module0249.f16039(var58, var51.eql(module0319.$ic75$) ? module0319.$ic76$ : module0319.$ic75$, var57);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(var60);
            }
        }
        return var57;
    }
    
    public static SubLObject f21537(final SubLObject var51, final SubLObject var52, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        SubLObject var58 = (SubLObject)module0319.NIL;
        if (module0319.NIL != module0244.f15730(var51)) {
            final SubLObject var59 = module0139.f9008();
            final SubLObject var60 = module0139.$g1630$.currentBinding(var57);
            final SubLObject var61 = module0139.$g1659$.currentBinding(var57);
            try {
                module0139.$g1630$.bind((SubLObject)module0319.NIL, var57);
                module0139.$g1659$.bind(module0139.f9007(), var57);
                final SubLObject var62 = module0139.$g1659$.getDynamicValue(var57);
                final SubLObject var64_66 = module0139.$g1630$.currentBinding(var57);
                try {
                    module0139.$g1630$.bind(var59, var57);
                    module0251.f16231(module0137.f8955(var51), var52, module0318.f21461(var56), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED);
                    var58 = f21540(var51, var62);
                }
                finally {
                    module0139.$g1630$.rebind(var64_66, var57);
                }
                module0139.f9011(module0139.$g1659$.getDynamicValue(var57));
            }
            finally {
                module0139.$g1659$.rebind(var61, var57);
                module0139.$g1630$.rebind(var60, var57);
            }
        }
        else if (module0319.NIL != module0269.f17806(var51)) {
            final SubLObject var63 = module0240.$g2447$.currentBinding(var57);
            try {
                module0240.$g2447$.bind(module0240.f15611(), var57);
                final SubLObject var64 = module0240.$g2447$.getDynamicValue(var57);
                module0266.f17533(var51, var52, module0318.f21462(var56), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED);
                var58 = var64;
            }
            finally {
                module0240.$g2447$.rebind(var63, var57);
            }
        }
        else if (module0319.NIL != module0226.f14807(var51)) {
            final SubLObject var63 = module0240.$g2447$.currentBinding(var57);
            try {
                module0240.$g2447$.bind(module0240.f15611(), var57);
                final SubLObject var64 = module0240.$g2447$.getDynamicValue(var57);
                final SubLObject var64_67 = module0145.$g1916$.currentBinding(var57);
                try {
                    module0145.$g1916$.bind((SubLObject)module0319.T, var57);
                    module0266.f17533(var51, var52, module0318.f21462(var56), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED);
                }
                finally {
                    module0145.$g1916$.rebind(var64_67, var57);
                }
                var58 = var64;
            }
            finally {
                module0240.$g2447$.rebind(var63, var57);
            }
        }
        else {
            Errors.cerror((SubLObject)module0319.$ic77$, (SubLObject)module0319.$ic78$, var51);
        }
        return var58;
    }
    
    public static SubLObject f21538(final SubLObject var41) {
        return Hashtables.hash_table_count(var41);
    }
    
    public static SubLObject f21539(final SubLObject var51, final SubLObject var52, final SubLObject var56) {
        if (var56 == module0319.$ic79$) {
            return module0241.f15634(var51, var52);
        }
        if (var56 == module0319.$ic59$) {
            return module0241.f15635(var51, var52);
        }
        Errors.cerror((SubLObject)module0319.$ic77$, (SubLObject)module0319.$ic80$, var56);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21541(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic81$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0319.NIL;
        SubLObject var37 = (SubLObject)module0319.NIL;
        SubLObject var38 = (SubLObject)module0319.NIL;
        SubLObject var39 = (SubLObject)module0319.NIL;
        SubLObject var40 = (SubLObject)module0319.NIL;
        SubLObject var41 = (SubLObject)module0319.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic81$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic81$);
        var37 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic81$);
        var38 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic81$);
        var39 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic81$);
        var40 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic81$);
        var41 = var34.first();
        var34 = var34.rest();
        if (module0319.NIL == var34) {
            final SubLObject var42;
            var34 = (var42 = var35);
            return (SubLObject)ConsesLow.list((SubLObject)module0319.$ic82$, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic83$, (SubLObject)ConsesLow.list(var37), (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic84$, (SubLObject)ConsesLow.list(new SubLObject[] { var36, var39, module0319.$ic85$, var38, module0319.$ic86$, var40, module0319.$ic87$, module0319.$ic88$, module0319.$ic89$, var41 }), ConsesLow.append(var42, (SubLObject)module0319.NIL))), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic90$, (SubLObject)module0319.$ic91$, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic92$, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic93$, var38, var39, var40), (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic94$, (SubLObject)ConsesLow.list(new SubLObject[] { var36, var37, var39, var38, module0319.$ic95$, var40, module0319.$ic87$, module0319.$ic88$, module0319.$ic89$, var41 }), ConsesLow.append(var42, (SubLObject)module0319.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0319.$ic81$);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21542(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0319.NIL;
        SubLObject var37 = (SubLObject)module0319.NIL;
        SubLObject var38 = (SubLObject)module0319.NIL;
        SubLObject var39 = (SubLObject)module0319.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var37 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var38 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var39 = var34.first();
        var34 = var34.rest();
        if (module0319.NIL == var34) {
            final SubLObject var40;
            var34 = (var40 = var35);
            final SubLObject var41 = (SubLObject)module0319.$ic97$;
            final SubLObject var42 = (SubLObject)module0319.$ic98$;
            final SubLObject var43 = (SubLObject)module0319.$ic99$;
            return (SubLObject)ConsesLow.list((SubLObject)module0319.$ic83$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var43, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic100$, var38)), (SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic101$, var38)), (SubLObject)ConsesLow.list(var41, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic13$, var38))), (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic102$, (SubLObject)ConsesLow.list(var36, var37, var41, var42, var43, var39), ConsesLow.append(var40, (SubLObject)module0319.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0319.$ic96$);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21543(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0319.NIL;
        SubLObject var37 = (SubLObject)module0319.NIL;
        SubLObject var38 = (SubLObject)module0319.NIL;
        SubLObject var39 = (SubLObject)module0319.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var37 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var38 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var39 = var34.first();
        var34 = var34.rest();
        if (module0319.NIL == var34) {
            final SubLObject var40;
            var34 = (var40 = var35);
            final SubLObject var41 = (SubLObject)module0319.$ic103$;
            final SubLObject var42 = (SubLObject)module0319.$ic104$;
            final SubLObject var43 = (SubLObject)module0319.$ic105$;
            return (SubLObject)ConsesLow.list((SubLObject)module0319.$ic83$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var43, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic100$, var38)), (SubLObject)ConsesLow.list(var41, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic13$, var38))), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic106$, (SubLObject)ConsesLow.list(var42, var38, var39), (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic102$, (SubLObject)ConsesLow.list(var36, var37, var41, var42, var43, var39), ConsesLow.append(var40, (SubLObject)module0319.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0319.$ic96$);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21544(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0319.NIL;
        SubLObject var37 = (SubLObject)module0319.NIL;
        SubLObject var38 = (SubLObject)module0319.NIL;
        SubLObject var39 = (SubLObject)module0319.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var37 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var38 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var39 = var34.first();
        var34 = var34.rest();
        if (module0319.NIL == var34) {
            final SubLObject var40;
            var34 = (var40 = var35);
            final SubLObject var41 = (SubLObject)module0319.$ic107$;
            final SubLObject var42 = (SubLObject)module0319.$ic108$;
            final SubLObject var43 = (SubLObject)module0319.$ic109$;
            final SubLObject var44 = (SubLObject)module0319.$ic110$;
            final SubLObject var45 = (SubLObject)module0319.$ic111$;
            final SubLObject var46 = (SubLObject)module0319.$ic112$;
            final SubLObject var47 = (SubLObject)module0319.$ic113$;
            return (SubLObject)ConsesLow.list((SubLObject)module0319.$ic83$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic101$, var38)), (SubLObject)ConsesLow.list(var42, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic114$, var38)), (SubLObject)ConsesLow.list(var44, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic115$, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic116$, var38))), (SubLObject)ConsesLow.list(var45, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic100$, var38)), (SubLObject)ConsesLow.list(var46, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic13$, var38))), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic117$, (SubLObject)ConsesLow.listS((SubLObject)module0319.EQL, var42, (SubLObject)module0319.$ic118$), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic83$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var43, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic119$, var42))), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic120$, (SubLObject)ConsesLow.list(var47, var43, var44, var41, (SubLObject)module0319.NIL, (SubLObject)module0319.NIL, var39), (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic102$, (SubLObject)ConsesLow.list(var36, var37, var46, var47, var45, var39), ConsesLow.append(var40, (SubLObject)module0319.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic82$, (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic102$, (SubLObject)ConsesLow.list(var36, var37, var46, var41, var45, var39), ConsesLow.append(var40, (SubLObject)module0319.NIL)), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic121$, (SubLObject)ConsesLow.list(var47, var42, var41, var44, (SubLObject)module0319.$ic89$, var39), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic122$, (SubLObject)ConsesLow.list((SubLObject)module0319.EQUAL, var47, var41), (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic102$, (SubLObject)ConsesLow.list(var36, var37, var46, var47, var45, var39), ConsesLow.append(var40, (SubLObject)module0319.NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0319.$ic96$);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21545(final SubLObject var31, final SubLObject var32) {
        SubLObject var34;
        final SubLObject var33 = var34 = var31.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        final SubLObject var35 = var34.rest();
        var34 = var34.first();
        SubLObject var36 = (SubLObject)module0319.NIL;
        SubLObject var37 = (SubLObject)module0319.NIL;
        SubLObject var38 = (SubLObject)module0319.NIL;
        SubLObject var39 = (SubLObject)module0319.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var36 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var37 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var38 = var34.first();
        var34 = var34.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var34, var33, (SubLObject)module0319.$ic96$);
        var39 = var34.first();
        var34 = var34.rest();
        if (module0319.NIL == var34) {
            final SubLObject var40;
            var34 = (var40 = var35);
            final SubLObject var41 = (SubLObject)module0319.$ic123$;
            return (SubLObject)ConsesLow.list((SubLObject)module0319.$ic83$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var41, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic13$, var38))), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic83$, (SubLObject)ConsesLow.list(var37), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic92$, (SubLObject)module0319.$ic124$, (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic125$, (SubLObject)ConsesLow.list(var36, var41, (SubLObject)module0319.$ic87$, (SubLObject)module0319.$ic88$, (SubLObject)module0319.$ic89$, var39), ConsesLow.append(var40, (SubLObject)module0319.NIL)))), (SubLObject)ConsesLow.list((SubLObject)module0319.$ic90$, (SubLObject)module0319.$ic91$, (SubLObject)ConsesLow.list((SubLObject)module0319.$ic92$, (SubLObject)module0319.$ic126$, (SubLObject)ConsesLow.listS((SubLObject)module0319.$ic127$, (SubLObject)ConsesLow.list(var36, var37, var41, (SubLObject)module0319.$ic87$, (SubLObject)module0319.$ic88$, (SubLObject)module0319.$ic89$, var39), ConsesLow.append(var40, (SubLObject)module0319.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var33, (SubLObject)module0319.$ic96$);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21546(final SubLObject var19, final SubLObject var24, final SubLObject var23) {
        final SubLObject var25 = f21505(var19);
        SubLObject var26 = (SubLObject)module0319.NIL;
        SubLObject var27 = (SubLObject)module0319.NIL;
        if (var25.eql(module0319.$ic128$)) {
            final SubLObject var28 = f21515(var19);
            final SubLObject var29 = module0321.f21688(var23);
            final SubLObject var30 = (module0319.NIL != var28) ? var29 : var24;
            final SubLObject var31 = (module0319.NIL != var28) ? var24 : var29;
            var26 = module0267.f17564(var31, var30);
            if (module0319.NIL != var26) {
                var27 = (SubLObject)ConsesLow.cons(module0191.f11990((SubLObject)module0319.$ic129$, (SubLObject)ConsesLow.list(module0319.$ic128$, var30, var31), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED), var27);
            }
        }
        if (module0319.NIL == var26 && module0319.NIL != module0269.f17772(var25, (SubLObject)module0319.UNPROVIDED)) {
            final SubLObject var28 = f21515(var19);
            final SubLObject var29 = module0321.f21688(var23);
            final SubLObject var30 = (module0319.NIL != var28) ? var29 : var24;
            final SubLObject var31 = (module0319.NIL != var28) ? var24 : var29;
            final SubLObject var32 = module0202.f12768(var25, var30, var31);
            var26 = module0229.f15243(var32);
            if (module0319.NIL != var26) {
                var27 = module0229.f15242(var32);
            }
        }
        return Values.values(var26, var27);
    }
    
    public static SubLObject f21547(final SubLObject var19, final SubLObject var24, final SubLObject var23, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        var31.resetMultipleValues();
        SubLObject var32 = f21546(var19, var24, var23);
        SubLObject var33 = var31.secondMultipleValue();
        var31.resetMultipleValues();
        if (module0319.NIL == var32 && module0319.NIL != module0240.f15616(var24, f21512(var19)) && module0319.NIL == f21548(var19, var23, var30)) {
            var32 = (SubLObject)module0319.T;
            if (module0319.NIL != module0321.f21693()) {
                var33 = f21549(var19, var24, var33);
            }
        }
        return Values.values(var32, var33);
    }
    
    public static SubLObject f21550(final SubLObject var19, final SubLObject var24, final SubLObject var23, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = f21505(var19);
        final SubLObject var33 = f21515(var19);
        final SubLObject var34 = module0321.f21688(var23);
        final SubLObject var35 = (module0319.NIL != var33) ? var34 : var24;
        final SubLObject var36 = (module0319.NIL != var33) ? var24 : var34;
        var31.resetMultipleValues();
        SubLObject var37 = f21546(var19, var24, var23);
        SubLObject var38 = var31.secondMultipleValue();
        var31.resetMultipleValues();
        if (module0319.NIL == var37) {
            SubLObject var40;
            final SubLObject var39 = var40 = module0321.f21699(var32, var36);
            SubLObject var41 = (SubLObject)module0319.NIL;
            SubLObject var42 = (SubLObject)module0319.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0319.$ic130$);
            var41 = var40.first();
            var40 = var40.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var40, var39, (SubLObject)module0319.$ic130$);
            var42 = var40.first();
            var40 = var40.rest();
            if (module0319.NIL == var40) {
                if (module0319.NIL != module0266.f17539(var32, var35, var36, var41, var42, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED) && module0319.NIL == f21548(var19, var23, var30)) {
                    var37 = (SubLObject)module0319.T;
                    if (module0319.NIL != module0321.f21693()) {
                        var38 = f21549(var19, var24, var38);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var39, (SubLObject)module0319.$ic130$);
            }
        }
        return Values.values(var37, var38);
    }
    
    public static SubLObject f21551(final SubLObject var19, final SubLObject var24, final SubLObject var23, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0321.f21688(var23);
        SubLObject var33 = (SubLObject)module0319.NIL;
        SubLObject var34 = (SubLObject)module0319.NIL;
        if (var32.equal(var24)) {
            var33 = (SubLObject)module0319.T;
        }
        if (module0319.NIL == var33) {
            var31.resetMultipleValues();
            final SubLObject var100_101 = f21546(var19, var24, var23);
            final SubLObject var102_103 = var31.secondMultipleValue();
            var31.resetMultipleValues();
            var33 = var100_101;
            var34 = var102_103;
            if (module0319.NIL == var33) {
                final SubLObject var35 = f21505(var19);
                if (module0319.NIL != var35) {
                    final SubLObject var36 = f21515(var19);
                    final SubLObject var37 = (module0319.NIL != var36) ? var32 : var24;
                    final SubLObject var38 = (module0319.NIL != var36) ? var24 : var32;
                    final SubLObject var39 = module0202.f12768(var35, var37, var38);
                    final SubLObject var40 = module0217.f14426(var39);
                    if (module0319.NIL != var40 && module0319.NIL == f21548(var19, var23, var30)) {
                        var33 = (SubLObject)module0319.T;
                        var34 = (SubLObject)ConsesLow.cons(var40, var34);
                    }
                }
            }
        }
        return Values.values(var33, var34);
    }
    
    public static SubLObject f21548(final SubLObject var19, final SubLObject var23, final SubLObject var30) {
        if (module0319.NIL != module0174.f11035(var30) && module0319.NIL != module0211.f13700(var30)) {
            SubLObject var32;
            final SubLObject var31 = var32 = module0220.f14598(var30, module0319.$ic131$, (SubLObject)module0319.THREE_INTEGER, (SubLObject)module0319.$ic132$, (SubLObject)module0319.UNPROVIDED);
            SubLObject var33 = (SubLObject)module0319.NIL;
            var33 = var32.first();
            while (module0319.NIL != var32) {
                SubLObject var35;
                final SubLObject var34 = var35 = var33;
                SubLObject var36 = (SubLObject)module0319.NIL;
                SubLObject var37 = (SubLObject)module0319.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0319.$ic133$);
                var36 = var35.first();
                var35 = var35.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0319.$ic133$);
                var37 = var35.first();
                var35 = var35.rest();
                if (module0319.NIL == var35) {
                    if (var23.eql(var37) && module0319.NIL != module0266.f17536(f21505(var19), f21509(var19), var36, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED)) {
                        return (SubLObject)module0319.T;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)module0319.$ic133$);
                }
                var32 = var32.rest();
                var33 = var32.first();
            }
        }
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21549(final SubLObject var19, final SubLObject var113, final SubLObject var90) {
        SubLObject var114 = var90;
        final SubLObject var115 = f21503(var19);
        final SubLObject var116 = f21506(var19);
        final SubLObject var117 = f21505(var19);
        final SubLObject var118 = f21513(var19, (SubLObject)SubLObjectFactory.makeBoolean(!SubLObjectFactory.makeBoolean(module0319.NIL == module0141.f9195()).eql((SubLObject)SubLObjectFactory.makeBoolean(module0319.NIL == f21507(var19)))));
        final SubLObject var119 = f21517(var19, module0141.f9195());
        final SubLObject var120 = module0321.f21688(var119);
        if (module0319.NIL != module0141.f9195() || !var113.eql(var120)) {
            final SubLObject var121 = var115;
            if (var121.eql(module0319.$ic71$) || var121.eql(module0319.$ic72$)) {
                var114 = (SubLObject)ConsesLow.cons(module0191.f11990(module0318.f21467(var117), (SubLObject)ConsesLow.list(var117, var113, var120), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED), var114);
                var114 = f21552(var19, var114);
                var114 = (SubLObject)ConsesLow.cons(module0318.f21470(var115, var116, var117, var118), var114);
                var114 = f21553(var19, var114);
            }
            else if (var121.eql(module0319.$ic73$) || var121.eql(module0319.$ic74$)) {
                var114 = (SubLObject)ConsesLow.cons(module0191.f11990(module0318.f21467(var117), (SubLObject)ConsesLow.list(var117, var120, var113), (SubLObject)module0319.UNPROVIDED, (SubLObject)module0319.UNPROVIDED), var114);
                var114 = f21552(var19, var114);
                var114 = (SubLObject)ConsesLow.cons(module0318.f21470(var115, var116, var117, var118), var114);
                var114 = f21553(var19, var114);
            }
            else {
                Errors.cerror((SubLObject)module0319.$ic134$, (SubLObject)module0319.$ic78$, var115);
            }
        }
        return var114;
    }
    
    public static SubLObject f21553(final SubLObject var19, final SubLObject var90) {
        final SubLObject var91 = f21504(var19);
        final SubLObject var92 = f21506(var19);
        final SubLObject var93 = (SubLObject)SubLObjectFactory.makeBoolean(!SubLObjectFactory.makeBoolean(module0319.NIL == f21507(var19)).eql((SubLObject)SubLObjectFactory.makeBoolean(module0319.NIL == module0141.f9195())));
        if (var92.eql(var91) && module0319.NIL == var93) {
            return var90;
        }
        if (module0319.NIL != var93 && module0319.NIL != f21554(var91, var92, var90)) {
            return var90;
        }
        if (module0319.NIL != var93) {
            return (SubLObject)ConsesLow.cons(module0318.f21468(var91, var92, (SubLObject)module0319.T), var90);
        }
        if (module0319.NIL != f21555(var91, var92, var90)) {
            return var90;
        }
        return (SubLObject)ConsesLow.cons(module0318.f21468(var91, var92, (SubLObject)module0319.NIL), var90);
    }
    
    public static SubLObject f21552(final SubLObject var19, final SubLObject var90) {
        final SubLObject var91 = module0321.f21684();
        final SubLObject var92 = f21506(var19);
        final SubLObject var93 = f21507(var19);
        if (var92.eql(var91) && module0319.NIL == var93) {
            return var90;
        }
        if (module0319.NIL != var93 && module0319.NIL != f21554(var92, var91, var90)) {
            return var90;
        }
        if (module0319.NIL != var93) {
            return (SubLObject)ConsesLow.cons(module0318.f21468(var92, var91, (SubLObject)module0319.T), var90);
        }
        if (module0319.NIL != f21555(var92, var91, var90)) {
            return var90;
        }
        return (SubLObject)ConsesLow.cons(module0318.f21468(var92, var91, (SubLObject)module0319.NIL), var90);
    }
    
    public static SubLObject f21554(final SubLObject var120, final SubLObject var121, final SubLObject var90) {
        SubLObject var122 = (SubLObject)module0319.NIL;
        if (module0319.NIL == var122) {
            SubLObject var123 = var90;
            SubLObject var124 = (SubLObject)module0319.NIL;
            var124 = var123.first();
            while (module0319.NIL == var122 && module0319.NIL != var123) {
                if (module0319.NIL != module0191.f11952(var124) && module0319.NIL != module0191.f11992(var124)) {
                    final SubLObject var125 = module0191.f11961(var124);
                    final SubLObject var126 = module0205.f13136(var125);
                    if (var126.eql(module0319.$ic76$)) {
                        var122 = (SubLObject)SubLObjectFactory.makeBoolean(var120.eql(module0205.f13203(var125, (SubLObject)module0319.UNPROVIDED)) && var121.eql(module0205.f13204(var125, (SubLObject)module0319.UNPROVIDED)));
                    }
                }
                var123 = var123.rest();
                var124 = var123.first();
            }
        }
        return var122;
    }
    
    public static SubLObject f21555(final SubLObject var120, final SubLObject var121, final SubLObject var90) {
        SubLObject var122 = (SubLObject)module0319.NIL;
        if (module0319.NIL == var122) {
            SubLObject var123 = var90;
            SubLObject var124 = (SubLObject)module0319.NIL;
            var124 = var123.first();
            while (module0319.NIL == var122 && module0319.NIL != var123) {
                if (module0319.NIL != module0191.f11952(var124) && module0319.NIL != module0191.f11992(var124)) {
                    final SubLObject var125 = module0191.f11961(var124);
                    final SubLObject var126 = module0205.f13136(var125);
                    if (var126.eql(module0319.$ic75$)) {
                        var122 = (SubLObject)SubLObjectFactory.makeBoolean(var120.eql(module0205.f13203(var125, (SubLObject)module0319.UNPROVIDED)) && var121.eql(module0205.f13204(var125, (SubLObject)module0319.UNPROVIDED)));
                    }
                }
                var123 = var123.rest();
                var124 = var123.first();
            }
        }
        return var122;
    }
    
    public static SubLObject f21556() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21474", "S#24009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21476", "S#24004", 1, 0, false);
        new $f21476$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21477", "S#24010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21478", "S#24011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21479", "S#24012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21480", "S#24013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21481", "S#24014", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21482", "S#24015", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21483", "S#24016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21484", "S#24017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21485", "S#24018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21486", "S#24019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21487", "S#24020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21488", "S#24021", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21489", "S#24022", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21490", "S#24023", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21491", "S#24024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21492", "S#24025", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21493", "S#24026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21494", "S#24027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21495", "S#24028", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21496", "S#24029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21497", "S#24030", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21498", "S#24031", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21499", "S#24032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21475", "S#24033", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21500", "S#24034", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21501", "S#24035", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21502", "S#24036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21503", "S#24037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21504", "S#24038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21505", "S#24039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21506", "S#24040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21507", "S#24041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21508", "S#24042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21509", "S#24043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21510", "S#24044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21511", "S#24045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21512", "S#24046", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21513", "S#24047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21514", "S#24048", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21515", "S#24049", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21516", "S#24050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21517", "S#24051", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0319", "f21518", "S#24052");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21519", "S#24053", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21520", "S#24054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21521", "S#24055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21522", "S#24056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21524", "S#24057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21525", "S#24058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21526", "S#24059", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21527", "S#24060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21528", "S#24061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21529", "S#24062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21530", "S#24063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21531", "S#24064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21532", "S#24065", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21533", "S#24066", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21534", "S#24067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21535", "S#24068", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21536", "S#24069", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21523", "S#24070", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21540", "S#24071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21537", "S#24072", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21538", "S#24073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21539", "S#24074", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0319", "f21541", "S#24075");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0319", "f21542", "S#24076");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0319", "f21543", "S#24077");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0319", "f21544", "S#24078");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0319", "f21545", "S#24079");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21546", "S#24080", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21547", "S#24081", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21550", "S#24082", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21551", "S#24083", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21548", "S#24084", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21549", "S#24085", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21553", "S#24086", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21552", "S#24087", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21554", "S#24088", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0319", "f21555", "S#24089", 3, 0, false);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21557() {
        module0319.$g2812$ = SubLFiles.defconstant("S#24090", (SubLObject)module0319.$ic0$);
        module0319.$g2813$ = SubLFiles.deflexical("S#24091", (SubLObject)module0319.$ic66$);
        return (SubLObject)module0319.NIL;
    }
    
    public static SubLObject f21558() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0319.$g2812$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0319.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0319.$ic8$);
        Structures.def_csetf((SubLObject)module0319.$ic9$, (SubLObject)module0319.$ic10$);
        Structures.def_csetf((SubLObject)module0319.$ic11$, (SubLObject)module0319.$ic12$);
        Structures.def_csetf((SubLObject)module0319.$ic13$, (SubLObject)module0319.$ic14$);
        Structures.def_csetf((SubLObject)module0319.$ic15$, (SubLObject)module0319.$ic16$);
        Structures.def_csetf((SubLObject)module0319.$ic17$, (SubLObject)module0319.$ic18$);
        Structures.def_csetf((SubLObject)module0319.$ic19$, (SubLObject)module0319.$ic20$);
        Structures.def_csetf((SubLObject)module0319.$ic21$, (SubLObject)module0319.$ic22$);
        Structures.def_csetf((SubLObject)module0319.$ic23$, (SubLObject)module0319.$ic24$);
        Structures.def_csetf((SubLObject)module0319.$ic25$, (SubLObject)module0319.$ic26$);
        Structures.def_csetf((SubLObject)module0319.$ic27$, (SubLObject)module0319.$ic28$);
        Equality.identity((SubLObject)module0319.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0319.$g2812$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0319.$ic44$));
        return (SubLObject)module0319.NIL;
    }
    
    public void declareFunctions() {
        f21556();
    }
    
    public void initializeVariables() {
        f21557();
    }
    
    public void runTopLevelForms() {
        f21558();
    }
    
    static {
        me = (SubLFile)new module0319();
        module0319.$g2812$ = null;
        module0319.$g2813$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#24003", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#24004", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("S#24000", "CYC"), SubLObjectFactory.makeSymbol("S#24092", "CYC"), SubLObjectFactory.makeSymbol("S#24093", "CYC"), SubLObjectFactory.makeSymbol("S#15200", "CYC"), SubLObjectFactory.makeSymbol("S#12141", "CYC"), SubLObjectFactory.makeSymbol("S#22350", "CYC"), SubLObjectFactory.makeSymbol("S#24094", "CYC"), SubLObjectFactory.makeSymbol("S#24095", "CYC"), SubLObjectFactory.makeSymbol("S#24096", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("TVA-PRED"), SubLObjectFactory.makeKeyword("INDEX-PRED"), SubLObjectFactory.makeKeyword("TRANSITIVE-PRED"), SubLObjectFactory.makeKeyword("ARGNUM"), SubLObjectFactory.makeKeyword("TERM"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeKeyword("PRECOMPUTATION"), SubLObjectFactory.makeKeyword("PARENT-PRED"), SubLObjectFactory.makeKeyword("PARENT-PRED-INVERSE?") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#24010", "CYC"), SubLObjectFactory.makeSymbol("S#24011", "CYC"), SubLObjectFactory.makeSymbol("S#24012", "CYC"), SubLObjectFactory.makeSymbol("S#24013", "CYC"), SubLObjectFactory.makeSymbol("S#24014", "CYC"), SubLObjectFactory.makeSymbol("S#24015", "CYC"), SubLObjectFactory.makeSymbol("S#24016", "CYC"), SubLObjectFactory.makeSymbol("S#24017", "CYC"), SubLObjectFactory.makeSymbol("S#24018", "CYC"), SubLObjectFactory.makeSymbol("S#24019", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#24020", "CYC"), SubLObjectFactory.makeSymbol("S#24021", "CYC"), SubLObjectFactory.makeSymbol("S#24022", "CYC"), SubLObjectFactory.makeSymbol("S#24023", "CYC"), SubLObjectFactory.makeSymbol("S#24024", "CYC"), SubLObjectFactory.makeSymbol("S#24025", "CYC"), SubLObjectFactory.makeSymbol("S#24026", "CYC"), SubLObjectFactory.makeSymbol("S#24027", "CYC"), SubLObjectFactory.makeSymbol("S#24028", "CYC"), SubLObjectFactory.makeSymbol("S#24029", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#24033", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#24009", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#24004", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#24010", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#24020", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#24011", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#24021", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#24012", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#24022", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#24013", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#24023", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#24014", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#24024", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#24015", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#24025", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#24016", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#24026", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#24017", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#24027", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#24018", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#24028", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#24019", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#24029", "CYC");
        $ic29$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic30$ = SubLObjectFactory.makeKeyword("TVA-PRED");
        $ic31$ = SubLObjectFactory.makeKeyword("INDEX-PRED");
        $ic32$ = SubLObjectFactory.makeKeyword("TRANSITIVE-PRED");
        $ic33$ = SubLObjectFactory.makeKeyword("ARGNUM");
        $ic34$ = SubLObjectFactory.makeKeyword("TERM");
        $ic35$ = SubLObjectFactory.makeKeyword("COST");
        $ic36$ = SubLObjectFactory.makeKeyword("PRECOMPUTATION");
        $ic37$ = SubLObjectFactory.makeKeyword("PARENT-PRED");
        $ic38$ = SubLObjectFactory.makeKeyword("PARENT-PRED-INVERSE?");
        $ic39$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic40$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic41$ = SubLObjectFactory.makeSymbol("S#24030", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic43$ = SubLObjectFactory.makeKeyword("END");
        $ic44$ = SubLObjectFactory.makeSymbol("S#24032", "CYC");
        $ic45$ = SubLObjectFactory.makeString("#<");
        $ic46$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic47$ = SubLObjectFactory.makeKeyword("BASE");
        $ic48$ = SubLObjectFactory.makeString("tva-pred : ~a~%");
        $ic49$ = SubLObjectFactory.makeString("tva-index-pred : ~a~%");
        $ic50$ = SubLObjectFactory.makeString("tva-transitive-pred : ~a~%");
        $ic51$ = SubLObjectFactory.makeString("tva-argnum : ~a~%");
        $ic52$ = SubLObjectFactory.makeString("tva-term : ~S~%");
        $ic53$ = SubLObjectFactory.makeString("tva-cost : ~a~%");
        $ic54$ = SubLObjectFactory.makeString("tva-tactic-type : ~a~%");
        $ic55$ = SubLObjectFactory.makeString("tva-precomputation : ~a~%");
        $ic56$ = SubLObjectFactory.makeString("tva-parent-pred : ~a~%");
        $ic57$ = SubLObjectFactory.makeString("tva-parent-pred-inverse? : ~a");
        $ic58$ = SubLObjectFactory.makeKeyword("FREE");
        $ic59$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15199", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24003", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8587", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic61$ = SubLObjectFactory.makeUninternedSymbol("US#550CAE0");
        $ic62$ = SubLObjectFactory.makeSymbol("S#11353", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#24046", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("IGNORE");
        $ic65$ = SubLObjectFactory.makeSymbol("S#23985", "CYC");
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOOKUP"), (SubLObject)SubLObjectFactory.makeKeyword("PRECOMPUTED-CLOSURE"), (SubLObject)SubLObjectFactory.makeKeyword("CALCULATE-CLOSURE"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-EXTENT"));
        $ic67$ = SubLObjectFactory.makeKeyword("LOOKUP");
        $ic68$ = SubLObjectFactory.makeKeyword("PRECOMPUTED-CLOSURE");
        $ic69$ = SubLObjectFactory.makeKeyword("CALCULATE-CLOSURE");
        $ic70$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $ic72$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conservativeViaArg"));
        $ic73$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $ic74$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse"));
        $ic75$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic76$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $ic77$ = SubLObjectFactory.makeString("Continue?");
        $ic78$ = SubLObjectFactory.makeString("Error in predicate ~a");
        $ic79$ = SubLObjectFactory.makeKeyword("BACKWARD");
        $ic80$ = SubLObjectFactory.makeString("Error in direction ~a");
        $ic81$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15358", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12141", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24098", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic82$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic83$ = SubLObjectFactory.makeSymbol("CLET");
        $ic84$ = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $ic85$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic86$ = SubLObjectFactory.makeKeyword("INDEX");
        $ic87$ = SubLObjectFactory.makeKeyword("TRUTH");
        $ic88$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic89$ = SubLObjectFactory.makeKeyword("DONE");
        $ic90$ = SubLObjectFactory.makeSymbol("PWHEN-FEATURE");
        $ic91$ = SubLObjectFactory.makeKeyword("CYC-SKSI");
        $ic92$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic93$ = SubLObjectFactory.makeSymbol("S#24099", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#24100", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("INDEX-ARGNUM");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24097", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15358", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24101", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24098", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic97$ = SubLObjectFactory.makeUninternedSymbol("US#34A80D6");
        $ic98$ = SubLObjectFactory.makeUninternedSymbol("US#74A0892");
        $ic99$ = SubLObjectFactory.makeUninternedSymbol("US#759625C");
        $ic100$ = SubLObjectFactory.makeSymbol("S#24042", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("S#24043", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#24075", "CYC");
        $ic103$ = SubLObjectFactory.makeUninternedSymbol("US#34A80D6");
        $ic104$ = SubLObjectFactory.makeUninternedSymbol("US#74A0892");
        $ic105$ = SubLObjectFactory.makeUninternedSymbol("US#759625C");
        $ic106$ = SubLObjectFactory.makeSymbol("S#24052", "CYC");
        $ic107$ = SubLObjectFactory.makeUninternedSymbol("US#74A0892");
        $ic108$ = SubLObjectFactory.makeUninternedSymbol("US#148DB26");
        $ic109$ = SubLObjectFactory.makeUninternedSymbol("US#986A25");
        $ic110$ = SubLObjectFactory.makeUninternedSymbol("US#413036C");
        $ic111$ = SubLObjectFactory.makeUninternedSymbol("US#759625C");
        $ic112$ = SubLObjectFactory.makeUninternedSymbol("US#34A80D6");
        $ic113$ = SubLObjectFactory.makeUninternedSymbol("US#4D5E436");
        $ic114$ = SubLObjectFactory.makeSymbol("S#24039", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#23979", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#24037", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("PIF");
        $ic118$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $ic119$ = SubLObjectFactory.makeSymbol("S#11102", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#15273", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#20058", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic123$ = SubLObjectFactory.makeUninternedSymbol("US#34A80D6");
        $ic124$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#23953", "CYC"));
        $ic125$ = SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $ic126$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#23954", "CYC"));
        $ic127$ = SubLObjectFactory.makeSymbol("S#24102", "CYC");
        $ic128$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $ic129$ = SubLObjectFactory.makeKeyword("TIME");
        $ic130$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24103", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10878", "CYC"));
        $ic131$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("exceptForInArg"));
        $ic132$ = ConsesLow.list((SubLObject)module0319.ONE_INTEGER, (SubLObject)module0319.TWO_INTEGER);
        $ic133$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#24104", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24105", "CYC"));
        $ic134$ = SubLObjectFactory.makeString("Continue Anyway?");
    }
    
    public static final class $sX24003_native extends SubLStructNative
    {
        public SubLObject $type;
        public SubLObject $tva_pred;
        public SubLObject $index_pred;
        public SubLObject $transitive_pred;
        public SubLObject $argnum;
        public SubLObject $term;
        public SubLObject $cost;
        public SubLObject $precomputation;
        public SubLObject $parent_pred;
        public SubLObject $parent_pred_inverseP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX24003_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$tva_pred = (SubLObject)CommonSymbols.NIL;
            this.$index_pred = (SubLObject)CommonSymbols.NIL;
            this.$transitive_pred = (SubLObject)CommonSymbols.NIL;
            this.$argnum = (SubLObject)CommonSymbols.NIL;
            this.$term = (SubLObject)CommonSymbols.NIL;
            this.$cost = (SubLObject)CommonSymbols.NIL;
            this.$precomputation = (SubLObject)CommonSymbols.NIL;
            this.$parent_pred = (SubLObject)CommonSymbols.NIL;
            this.$parent_pred_inverseP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX24003_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$type;
        }
        
        public SubLObject getField3() {
            return this.$tva_pred;
        }
        
        public SubLObject getField4() {
            return this.$index_pred;
        }
        
        public SubLObject getField5() {
            return this.$transitive_pred;
        }
        
        public SubLObject getField6() {
            return this.$argnum;
        }
        
        public SubLObject getField7() {
            return this.$term;
        }
        
        public SubLObject getField8() {
            return this.$cost;
        }
        
        public SubLObject getField9() {
            return this.$precomputation;
        }
        
        public SubLObject getField10() {
            return this.$parent_pred;
        }
        
        public SubLObject getField11() {
            return this.$parent_pred_inverseP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$tva_pred = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$index_pred = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$transitive_pred = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$argnum = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$term = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$cost = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$precomputation = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$parent_pred = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$parent_pred_inverseP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX24003_native.class, module0319.$ic0$, module0319.$ic1$, module0319.$ic2$, module0319.$ic3$, new String[] { "$type", "$tva_pred", "$index_pred", "$transitive_pred", "$argnum", "$term", "$cost", "$precomputation", "$parent_pred", "$parent_pred_inverseP" }, module0319.$ic4$, module0319.$ic5$, module0319.$ic6$);
        }
    }
    
    public static final class $f21476$UnaryFunction extends UnaryFunction
    {
        public $f21476$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#24004"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0319.f21476(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0319.class
	Total time: 382 ms
	
	Decompiled with Procyon 0.5.32.
*/