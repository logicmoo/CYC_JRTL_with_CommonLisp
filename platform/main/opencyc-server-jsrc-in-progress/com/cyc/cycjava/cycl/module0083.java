package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
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

public final class module0083 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0083";
    public static final String myFingerPrint = "24193a3ce01f2505c1aed685a57879fef666331f8ea92cdfa65043fb4cbe792b";
    public static SubLSymbol $g1168$;
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
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLList $ic74$;
    private static final SubLString $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLList $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLList $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    
    public static SubLObject f5674(final SubLObject var1, final SubLObject var2) {
        f5675(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5676(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX7309_native.class) ? T : NIL);
    }
    
    public static SubLObject f5677(final SubLObject var1) {
        assert NIL != f5676(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f5678(final SubLObject var1) {
        assert NIL != f5676(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f5679(final SubLObject var1) {
        assert NIL != f5676(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f5680(final SubLObject var1) {
        assert NIL != f5676(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f5681(final SubLObject var1) {
        assert NIL != f5676(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f5682(final SubLObject var1) {
        assert NIL != f5676(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f5683(final SubLObject var1) {
        assert NIL != f5676(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f5684(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5676(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f5685(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5676(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f5686(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5676(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f5687(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5676(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f5688(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5676(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f5689(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5676(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f5690(final SubLObject var1, final SubLObject var4) {
        assert NIL != f5676(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f5691(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX7309_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic23$)) {
                f5684(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic24$)) {
                f5685(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic25$)) {
                f5686(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic26$)) {
                f5687(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic27$)) {
                f5688(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic28$)) {
                f5689(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic29$)) {
                f5690(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic30$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f5692(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic31$, (SubLObject)$ic32$, (SubLObject)SEVEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic23$, f5677(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic24$, f5678(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic25$, f5679(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic26$, f5680(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic27$, f5681(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic28$, f5682(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic33$, (SubLObject)$ic29$, f5683(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic34$, (SubLObject)$ic32$, (SubLObject)SEVEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f5693(final SubLObject var11, final SubLObject var12) {
        return f5692(var11, var12);
    }
    
    public static SubLObject f5675(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic36$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic37$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            if (NIL != f5694(var13)) {
                streams_high.write_string((SubLObject)$ic38$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                PrintLow.format(var2, (SubLObject)$ic39$, f5695(var13));
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic37$, var2, $ic40$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f5696(final SubLObject var19, final SubLObject var20, final SubLObject var21, final SubLObject var22, final SubLObject var23, final SubLObject var24, SubLObject var25) {
        if (var25 == UNPROVIDED) {
            var25 = (SubLObject)$ic41$;
        }
        final SubLObject var26 = f5691((SubLObject)UNPROVIDED);
        f5684(var26, var19);
        f5685(var26, var20);
        f5686(var26, var21);
        f5687(var26, var25);
        f5688(var26, var22);
        f5689(var26, var23);
        f5690(var26, var24);
        return var26;
    }
    
    public static SubLObject f5697(final SubLObject var13) {
        assert NIL != f5676(var13) : var13;
        final SubLObject var14 = f5677(var13);
        final SubLObject var15 = f5678(var13);
        final SubLObject var16 = Functions.funcall(var15, var14);
        f5684(var13, var16);
        return var13;
    }
    
    public static SubLObject f5698(final SubLObject var13, final SubLObject var27) {
        assert NIL != f5676(var13) : var13;
        final SubLObject var28 = f5677(var13);
        final SubLObject var29 = f5679(var13);
        final SubLObject var30 = Functions.funcall(var29, var28, var27);
        f5684(var13, var30);
        return var13;
    }
    
    public static SubLObject f5699(final SubLObject var13, final SubLObject var28) {
        assert NIL != f5676(var13) : var13;
        assert NIL != Types.listp(var28) : var28;
        final SubLObject var29 = f5680(var13);
        Functions.funcall(var29, var13, var28);
        return var13;
    }
    
    public static SubLObject f5695(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert NIL != f5676(var13) : var13;
        final SubLObject var15 = f5677(var13);
        final SubLObject var16 = f5681(var13);
        final SubLObject var17 = Functions.funcall(var16, var15);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var14) && NIL == module0048.f3294(var17)) {
            Errors.error((SubLObject)$ic43$, var13);
        }
        return var17;
    }
    
    public static SubLObject f5694(final SubLObject var13) {
        return Numbers.zerop(f5695(var13));
    }
    
    public static SubLObject f5700(final SubLObject var13, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        assert NIL != f5676(var13) : var13;
        final SubLObject var32 = f5677(var13);
        final SubLObject var33 = f5682(var13);
        var31.resetMultipleValues();
        final SubLObject var34 = Functions.funcall(var33, var32, var30);
        final SubLObject var35 = var31.secondMultipleValue();
        var31.resetMultipleValues();
        if (NIL != var30) {
            f5684(var13, var35);
        }
        return var34;
    }
    
    public static SubLObject f5701(final SubLObject var13) {
        return f5700(var13, (SubLObject)T);
    }
    
    public static SubLObject f5702(final SubLObject var13) {
        assert NIL != f5676(var13) : var13;
        final SubLObject var14 = f5677(var13);
        final SubLObject var15 = f5683(var13);
        final SubLObject var16 = Functions.funcall(var15, var14);
        return var16;
    }
    
    public static SubLObject f5703(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic44$);
        final SubLObject var37 = var36.rest();
        var36 = var36.first();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic44$);
        var38 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic44$);
        var39 = var36.first();
        var36 = var36.rest();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var36;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var43_44 = (SubLObject)NIL;
        while (NIL != var41) {
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic44$);
            var43_44 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic44$);
            if (NIL == conses_high.member(var43_44, (SubLObject)$ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var42 = (SubLObject)T;
            }
            if (var43_44 == $ic46$) {
                var40 = var41.first();
            }
            var41 = var41.rest();
        }
        if (NIL != var42 && NIL == var40) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic44$);
        }
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic47$, var36);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45;
        var36 = (var45 = var37);
        final SubLObject var46 = (SubLObject)$ic48$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var46, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var39))), (SubLObject)ConsesLow.listS((SubLObject)$ic51$, (SubLObject)ConsesLow.list(var38, var46, (SubLObject)$ic47$, var44), ConsesLow.append(var45, (SubLObject)NIL)));
    }
    
    public static SubLObject f5704(final SubLObject var49, final SubLObject var39) {
        final SubLThread var50 = SubLProcess.currentSubLThread();
        final SubLObject var51 = f5702(var39);
        SubLObject var54;
        for (SubLObject var52 = (SubLObject)NIL; NIL == var52; var52 = (SubLObject)makeBoolean(NIL == var54)) {
            var50.resetMultipleValues();
            final SubLObject var53 = module0052.f3693(var51);
            var54 = var50.secondMultipleValue();
            var50.resetMultipleValues();
            if (NIL != var54) {
                Functions.funcall(var49, var53);
            }
        }
        return var39;
    }
    
    public static SubLObject f5705(final SubLObject var13, final SubLObject var54) {
        SubLObject var55 = var54;
        SubLObject var56 = (SubLObject)NIL;
        var56 = var55.first();
        while (NIL != var55) {
            f5698(var13, var56);
            var55 = var55.rest();
            var56 = var55.first();
        }
        return var13;
    }
    
    public static SubLObject f5706(final SubLObject var13) {
        return f5677(var13);
    }
    
    public static SubLObject f5707(final SubLObject var13, final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var36;
        for (SubLObject var34 = (SubLObject)NIL; NIL == var34; var34 = (SubLObject)makeBoolean(NIL == var36)) {
            var33.resetMultipleValues();
            final SubLObject var35 = module0052.f3693(var32);
            var36 = var33.secondMultipleValue();
            var33.resetMultipleValues();
            if (NIL != var36) {
                f5698(var13, var35);
            }
        }
        return var13;
    }
    
    public static SubLObject f5708(SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        return f5696(var56, (SubLObject)$ic52$, (SubLObject)$ic53$, (SubLObject)$ic54$, (SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5709(final SubLObject var57) {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5710(final SubLObject var19, final SubLObject var27) {
        return (SubLObject)ConsesLow.cons(var27, var19);
    }
    
    public static SubLObject f5711(final SubLObject var19) {
        return Sequences.length(var19);
    }
    
    public static SubLObject f5712(final SubLObject var19, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (NIL != var30) {
            return Values.values(Sequences.nreverse(var19), (SubLObject)NIL);
        }
        return Values.values(Sequences.reverse(var19), var19);
    }
    
    public static SubLObject f5713(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        var20.resetMultipleValues();
        final SubLObject var21 = f5712(var19, (SubLObject)NIL);
        final SubLObject var22 = var20.secondMultipleValue();
        var20.resetMultipleValues();
        return module0052.f3709(var21);
    }
    
    public static SubLObject f5714(final SubLObject var58) {
        final SubLThread var59 = SubLProcess.currentSubLThread();
        final SubLObject var60 = f5708((SubLObject)UNPROVIDED);
        if (NIL == f5694(var60)) {
            Errors.error((SubLObject)$ic57$);
        }
        SubLObject var61 = var58;
        SubLObject var62 = (SubLObject)NIL;
        var62 = var61.first();
        while (NIL != var61) {
            f5698(var60, var62);
            var61 = var61.rest();
            var62 = var61.first();
        }
        if (!Sequences.length(var58).numE(f5695(var60))) {
            Errors.error((SubLObject)$ic58$, Sequences.length(var58), f5695(var60));
        }
        final SubLObject var63 = f5702(var60);
        SubLObject var64 = var58;
        SubLObject var67;
        for (SubLObject var65 = (SubLObject)NIL; NIL == var65; var65 = (SubLObject)makeBoolean(NIL == var67)) {
            var59.resetMultipleValues();
            final SubLObject var66 = module0052.f3693(var63);
            var67 = var59.secondMultipleValue();
            var59.resetMultipleValues();
            if (NIL != var67) {
                final SubLObject var68 = var64.first();
                if (!var68.equal(var66)) {
                    Errors.error((SubLObject)$ic59$, var60);
                }
                var64 = var64.rest();
            }
        }
        if (NIL != var64) {
            Errors.error((SubLObject)$ic60$, var60);
        }
        final SubLObject var69 = f5701(var60);
        if (NIL == f5694(var60)) {
            Errors.error((SubLObject)$ic61$, var60);
        }
        return Equality.equal(var58, var69);
    }
    
    public static SubLObject f5715(SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = Symbols.symbol_function((SubLObject)EQL);
        }
        return f5696(module0077.f5313(var61, (SubLObject)UNPROVIDED), (SubLObject)$ic62$, (SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)$ic66$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5716(final SubLObject var57) {
        module0077.f5328(var57);
        return var57;
    }
    
    public static SubLObject f5717(final SubLObject var19, final SubLObject var27) {
        module0077.f5326(var27, var19);
        return var19;
    }
    
    public static SubLObject f5718(final SubLObject var19) {
        return module0077.f5311(var19);
    }
    
    public static SubLObject f5719(final SubLObject var19, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (NIL != var30) {
            return Values.values(var19, module0077.f5313(module0077.f5315(var19), (SubLObject)UNPROVIDED));
        }
        return Values.values(module0077.f5314(var19), var19);
    }
    
    public static SubLObject f5720(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        var20.resetMultipleValues();
        final SubLObject var21 = f5719(var19, (SubLObject)NIL);
        final SubLObject var22 = var20.secondMultipleValue();
        var20.resetMultipleValues();
        return module0077.f5329(var21);
    }
    
    public static SubLObject f5721(final SubLObject var64, final SubLObject var65) {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        final SubLObject var67 = module0078.f5367(var64, var65, (SubLObject)UNPROVIDED);
        final SubLObject var68 = f5715(module0077.f5315(var67));
        if (NIL == f5694(var68)) {
            Errors.error((SubLObject)$ic67$);
        }
        final SubLObject var69 = module0077.f5333(var67);
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        for (var70 = module0032.f1741(var69), var71 = (SubLObject)NIL, var71 = module0032.f1742(var70, var69); NIL == module0032.f1744(var70, var71); var71 = module0032.f1743(var71)) {
            var72 = module0032.f1745(var70, var71);
            if (NIL != module0032.f1746(var71, var72)) {
                f5698(var68, var72);
            }
        }
        if (!module0077.f5311(var67).numE(f5695(var68))) {
            Errors.error((SubLObject)$ic58$, module0077.f5311(var67), f5695(var68));
        }
        final SubLObject var73 = f5702(var68);
        SubLObject var76;
        for (SubLObject var74 = (SubLObject)NIL; NIL == var74; var74 = (SubLObject)makeBoolean(NIL == var76)) {
            var66.resetMultipleValues();
            final SubLObject var75 = module0052.f3693(var73);
            var76 = var66.secondMultipleValue();
            var66.resetMultipleValues();
            if (NIL != var76 && NIL == module0077.f5320(var75, var67)) {
                Errors.error((SubLObject)$ic59$, var68);
            }
        }
        final SubLObject var77 = f5701(var68);
        if (NIL == f5694(var68)) {
            Errors.error((SubLObject)$ic61$, var68);
        }
        return module0078.f5359(var67, var77);
    }
    
    public static SubLObject f5722(SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = Symbols.symbol_function((SubLObject)EQL);
        }
        return f5696(module0067.f4880(var61, (SubLObject)UNPROVIDED), (SubLObject)$ic68$, (SubLObject)$ic69$, (SubLObject)$ic70$, (SubLObject)$ic71$, (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5723(final SubLObject var69, final SubLObject var38) {
        return (SubLObject)ConsesLow.cons(var69, var38);
    }
    
    public static SubLObject f5724(final SubLObject var70) {
        return var70.first();
    }
    
    public static SubLObject f5725(final SubLObject var70) {
        return var70.rest();
    }
    
    public static SubLObject f5726(final SubLObject var57) {
        module0067.f4881(var57);
        return var57;
    }
    
    public static SubLObject f5727(final SubLObject var19, final SubLObject var70) {
        if (!var70.isCons()) {
            Errors.error((SubLObject)$ic73$, var70);
        }
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var70, var70, (SubLObject)$ic74$);
        var71 = var70.first();
        final SubLObject var73 = var72 = var70.rest();
        module0067.f4886(var19, var71, var72);
        return var19;
    }
    
    public static SubLObject f5728(final SubLObject var19) {
        return module0067.f4861(var19);
    }
    
    public static SubLObject f5729(final SubLObject var19, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (NIL != var30) {
            return Values.values(var19, module0067.f4880(module0067.f4854(var19), (SubLObject)UNPROVIDED));
        }
        return Values.values(module0084.f5760(var19), var19);
    }
    
    public static SubLObject f5730(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        final SubLObject var21 = f5708((SubLObject)UNPROVIDED);
        SubLObject var22;
        for (var22 = module0066.f4838(module0067.f4891(var19)); NIL == module0066.f4841(var22); var22 = module0066.f4840(var22)) {
            var20.resetMultipleValues();
            final SubLObject var23 = module0066.f4839(var22);
            final SubLObject var24 = var20.secondMultipleValue();
            var20.resetMultipleValues();
            f5698(var21, (SubLObject)ConsesLow.cons(var23, var24));
        }
        module0066.f4842(var22);
        return f5702(var21);
    }
    
    public static SubLObject f5731(final SubLObject var76, final SubLObject var65) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        final SubLObject var78 = module0084.f5804(var76, module0067.f4880(var65, (SubLObject)UNPROVIDED));
        final SubLObject var79 = f5722(var65);
        if (NIL == f5694(var79)) {
            Errors.error((SubLObject)$ic75$);
        }
        SubLObject var80;
        for (var80 = module0066.f4838(module0067.f4891(var78)); NIL == module0066.f4841(var80); var80 = module0066.f4840(var80)) {
            var77.resetMultipleValues();
            final SubLObject var81 = module0066.f4839(var80);
            final SubLObject var82 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            f5698(var79, f5723(var81, var82));
        }
        module0066.f4842(var80);
        if (!module0067.f4861(var78).numE(f5695(var79))) {
            Errors.error((SubLObject)$ic58$, module0067.f4861(var78), f5695(var79));
        }
        final SubLObject var83 = f5702(var79);
        final SubLObject var84 = Symbols.gensym((SubLObject)UNPROVIDED);
        SubLObject var87;
        for (SubLObject var85 = (SubLObject)NIL; NIL == var85; var85 = (SubLObject)makeBoolean(NIL == var87)) {
            var77.resetMultipleValues();
            final SubLObject var86 = module0052.f3693(var83);
            var87 = var77.secondMultipleValue();
            var77.resetMultipleValues();
            if (NIL != var87) {
                final SubLObject var88 = f5724(var86);
                final SubLObject var89 = f5725(var86);
                if (NIL == Functions.funcall(var65, var89, module0067.f4884(var78, var88, var84))) {
                    Errors.error((SubLObject)$ic59$, var79);
                }
            }
        }
        final SubLObject var90 = f5701(var79);
        if (NIL == f5694(var79)) {
            Errors.error((SubLObject)$ic61$, var79);
        }
        return module0084.f5816(var78, var90, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5732() {
        return f5696((SubLObject)NIL, (SubLObject)$ic76$, (SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)$ic77$, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5733(final SubLObject var78) {
        return module0052.f3708();
    }
    
    public static SubLObject f5734(final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        final SubLObject var56 = f5732();
        if (NIL == f5694(var56)) {
            Errors.error((SubLObject)$ic80$);
        }
        SubLObject var57 = var54;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            f5698(var56, var58);
            var57 = var57.rest();
            var58 = var57.first();
        }
        if (NIL == f5694(var56)) {
            Errors.error((SubLObject)$ic81$);
        }
        final SubLObject var59 = f5702(var56);
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var63;
        for (SubLObject var61 = (SubLObject)NIL; NIL == var61; var61 = (SubLObject)makeBoolean(NIL == var63)) {
            var55.resetMultipleValues();
            final SubLObject var62 = module0052.f3693(var59);
            var63 = var55.secondMultipleValue();
            var55.resetMultipleValues();
            if (NIL != var63) {
                var60 = (SubLObject)ConsesLow.cons(var62, var60);
            }
        }
        if (NIL != var60) {
            Errors.error((SubLObject)$ic82$, var59);
        }
        final SubLObject var64 = f5701(var56);
        if (NIL == f5694(var56)) {
            Errors.error((SubLObject)$ic83$, var56);
        }
        if (NIL != var64) {
            Errors.error((SubLObject)$ic84$, var64);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f5735(final SubLObject var21, final SubLObject var23) {
        return f5696((SubLObject)NIL, (SubLObject)$ic76$, var21, (SubLObject)$ic85$, var23, (SubLObject)$ic86$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5736(final SubLObject var19) {
        if (NIL != var19) {
            return module0052.f3710(var19);
        }
        return module0052.f3708();
    }
    
    public static SubLObject f5737(final SubLObject var19) {
        if (NIL != var19) {
            return (SubLObject)ONE_INTEGER;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f5738(SubLObject var19, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        SubLObject var31 = var19;
        if (NIL == var31) {
            var31 = (SubLObject)ZERO_INTEGER;
        }
        if (NIL != var30) {
            var19 = (SubLObject)NIL;
        }
        return Values.values(var31, var19);
    }
    
    public static SubLObject f5739(SubLObject var19, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        SubLObject var31 = var19;
        if (NIL == var31) {
            var31 = (SubLObject)ONE_INTEGER;
        }
        if (NIL != var30) {
            var19 = (SubLObject)NIL;
        }
        return Values.values(var31, var19);
    }
    
    public static SubLObject f5740() {
        return f5735((SubLObject)$ic89$, (SubLObject)$ic87$);
    }
    
    public static SubLObject f5741(SubLObject var81, SubLObject var82) {
        if (!var81.isNumber()) {
            var81 = (SubLObject)ZERO_INTEGER;
        }
        if (!var82.isNumber()) {
            var82 = (SubLObject)ZERO_INTEGER;
        }
        return Numbers.add(var81, var82);
    }
    
    public static SubLObject f5742(final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        final SubLObject var85 = f5740();
        if (NIL == f5694(var85)) {
            Errors.error((SubLObject)$ic90$);
        }
        SubLObject var86 = var83;
        SubLObject var87 = (SubLObject)NIL;
        var87 = var86.first();
        while (NIL != var86) {
            f5698(var85, var87);
            var86 = var86.rest();
            var87 = var86.first();
        }
        if (NIL == module0048.f3275(f5695(var85))) {
            Errors.error((SubLObject)$ic91$, f5695(var85));
        }
        final SubLObject var88 = f5702(var85);
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var92;
        for (SubLObject var90 = (SubLObject)NIL; NIL == var90; var90 = (SubLObject)makeBoolean(NIL == var92)) {
            var84.resetMultipleValues();
            final SubLObject var91 = module0052.f3693(var88);
            var92 = var84.secondMultipleValue();
            var84.resetMultipleValues();
            if (NIL != var92) {
                var89 = (SubLObject)ConsesLow.cons(var91, var89);
            }
        }
        if (NIL == module0035.f1997(var89)) {
            Errors.error((SubLObject)$ic92$, var88);
        }
        final SubLObject var93 = f5701(var85);
        if (NIL == f5694(var85)) {
            Errors.error((SubLObject)$ic83$, var85);
        }
        if (!var93.numE(module0048.f3385(var83))) {
            Errors.error((SubLObject)$ic93$, module0048.f3385(var83));
        }
        if (!module0035.f2113(var89).numE(var93)) {
            Errors.error((SubLObject)$ic94$, module0035.f2113(var89), var93);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f5743() {
        return f5735((SubLObject)$ic95$, (SubLObject)$ic87$);
    }
    
    public static SubLObject f5744(SubLObject var85, final SubLObject var78) {
        if (!var85.isNumber()) {
            var85 = (SubLObject)ZERO_INTEGER;
        }
        return module0048.f_1X(var85);
    }
    
    public static SubLObject f5745(final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        final SubLObject var56 = f5743();
        if (NIL == f5694(var56)) {
            Errors.error((SubLObject)$ic96$);
        }
        SubLObject var57 = var54;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            f5698(var56, var58);
            var57 = var57.rest();
            var58 = var57.first();
        }
        if (NIL == module0048.f3275(f5695(var56))) {
            Errors.error((SubLObject)$ic91$, f5695(var56));
        }
        final SubLObject var59 = f5702(var56);
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var63;
        for (SubLObject var61 = (SubLObject)NIL; NIL == var61; var61 = (SubLObject)makeBoolean(NIL == var63)) {
            var55.resetMultipleValues();
            final SubLObject var62 = module0052.f3693(var59);
            var63 = var55.secondMultipleValue();
            var55.resetMultipleValues();
            if (NIL != var63) {
                var60 = (SubLObject)ConsesLow.cons(var62, var60);
            }
        }
        if (NIL == module0035.f1997(var60)) {
            Errors.error((SubLObject)$ic92$, var59);
        }
        final SubLObject var64 = f5701(var56);
        if (NIL == f5694(var56)) {
            Errors.error((SubLObject)$ic83$, var56);
        }
        if (!var64.numE(Sequences.length(var54))) {
            Errors.error((SubLObject)$ic97$, Sequences.length(var54));
        }
        if (!module0035.f2113(var60).numE(var64)) {
            Errors.error((SubLObject)$ic94$, module0035.f2113(var60), var64);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f5746() {
        return f5735((SubLObject)$ic98$, (SubLObject)$ic88$);
    }
    
    public static SubLObject f5747(SubLObject var81, SubLObject var82) {
        if (!var81.isNumber()) {
            var81 = (SubLObject)ONE_INTEGER;
        }
        if (!var82.isNumber()) {
            var82 = (SubLObject)ONE_INTEGER;
        }
        return Numbers.multiply(var81, var82);
    }
    
    public static SubLObject f5748(final SubLObject var83) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        final SubLObject var85 = f5746();
        if (NIL == f5694(var85)) {
            Errors.error((SubLObject)$ic99$);
        }
        SubLObject var86 = var83;
        SubLObject var87 = (SubLObject)NIL;
        var87 = var86.first();
        while (NIL != var86) {
            f5698(var85, var87);
            var86 = var86.rest();
            var87 = var86.first();
        }
        if (NIL == module0048.f3275(f5695(var85))) {
            Errors.error((SubLObject)$ic91$, f5695(var85));
        }
        final SubLObject var88 = f5702(var85);
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var92;
        for (SubLObject var90 = (SubLObject)NIL; NIL == var90; var90 = (SubLObject)makeBoolean(NIL == var92)) {
            var84.resetMultipleValues();
            final SubLObject var91 = module0052.f3693(var88);
            var92 = var84.secondMultipleValue();
            var84.resetMultipleValues();
            if (NIL != var92) {
                var89 = (SubLObject)ConsesLow.cons(var91, var89);
            }
        }
        if (NIL == module0035.f1997(var89)) {
            Errors.error((SubLObject)$ic92$, var88);
        }
        final SubLObject var93 = f5701(var85);
        if (NIL == f5694(var85)) {
            Errors.error((SubLObject)$ic83$, var85);
        }
        if (!var93.numE(Functions.apply((SubLObject)$ic100$, var83))) {
            Errors.error((SubLObject)$ic101$, Functions.apply((SubLObject)$ic100$, var83));
        }
        if (!module0035.f2113(var89).numE(var93)) {
            Errors.error((SubLObject)$ic94$, module0035.f2113(var89), var93);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f5749(final SubLObject var39, final SubLObject var86, SubLObject var87) {
        if (var87 == UNPROVIDED) {
            var87 = module0052.$g1013$.getGlobalValue();
        }
        return f5696(f5750(var39, var86, var87), (SubLObject)$ic102$, (SubLObject)$ic103$, (SubLObject)$ic104$, (SubLObject)$ic105$, (SubLObject)$ic106$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f5750(final SubLObject var13, final SubLObject var86, final SubLObject var87) {
        return (SubLObject)ConsesLow.list(var13, var86, var87);
    }
    
    public static SubLObject f5751(final SubLObject var19) {
        final SubLObject var20 = var19.first();
        f5697(var20);
        return var19;
    }
    
    public static SubLObject f5752(final SubLObject var19, final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        SubLObject var54 = (SubLObject)NIL;
        SubLObject var55 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var19, var19, (SubLObject)$ic107$);
        var53 = var19.first();
        SubLObject var56 = var19.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var19, (SubLObject)$ic107$);
        var54 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var19, (SubLObject)$ic107$);
        var55 = var56.first();
        var56 = var56.rest();
        if (NIL == var56) {
            if (module0052.$g1013$.getGlobalValue().eql(var55)) {
                f5698(var53, Functions.funcall(var54, var52));
            }
            else {
                f5698(var53, Functions.funcall(var54, var52, var55));
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)$ic107$);
        }
        return var19;
    }
    
    public static SubLObject f5753(final SubLObject var19) {
        return f5695(var19.first());
    }
    
    public static SubLObject f5754(final SubLObject var19, SubLObject var30) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        return f5700(var19.first(), var30);
    }
    
    public static SubLObject f5755(final SubLObject var19) {
        return f5702(var19.first());
    }
    
    public static SubLObject f5756() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5674", "S#7313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5676", "S#7310", 1, 0, false);
        new $f5676$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5677", "S#7314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5678", "S#7315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5679", "S#7316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5680", "S#7317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5681", "S#7318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5682", "S#7319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5683", "S#7320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5684", "S#7321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5685", "S#7322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5686", "S#7323", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5687", "S#7324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5688", "S#7325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5689", "S#7326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5690", "S#7327", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5691", "S#7328", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5692", "S#7329", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5693", "S#7330", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5675", "S#7331", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5696", "S#6774", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5697", "S#7332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5698", "S#7333", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5699", "S#7334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5695", "S#7335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5694", "S#7336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5700", "S#7337", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5701", "S#7338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5702", "S#7339", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0083", "f5703", "S#7340");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5704", "S#7341", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5705", "S#7342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5706", "S#6775", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5707", "S#7343", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5708", "S#7344", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5709", "S#7345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5710", "S#7346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5711", "S#7347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5712", "S#7348", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5713", "S#7349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5714", "S#7350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5715", "S#7351", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5716", "S#7352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5717", "S#7353", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5718", "S#7354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5719", "S#7355", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5720", "S#7356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5721", "S#7357", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5722", "S#7358", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5723", "S#7359", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5724", "S#7360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5725", "S#7361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5726", "S#7362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5727", "S#7363", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5728", "S#7364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5729", "S#7365", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5730", "S#7366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5731", "S#7367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5732", "S#7368", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5733", "S#7369", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5734", "S#7370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5735", "S#7371", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5736", "S#7372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5737", "S#7373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5738", "S#7374", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5739", "S#7375", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5740", "S#7376", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5741", "S#7377", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5742", "S#7378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5743", "S#7379", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5744", "S#7380", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5745", "S#7381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5746", "S#7382", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5747", "S#7383", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5748", "S#7384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5749", "S#7385", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5750", "S#7386", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5751", "S#7387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5752", "S#7388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5753", "S#7389", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5754", "S#7390", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0083", "f5755", "S#7391", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5757() {
        $g1168$ = SubLFiles.defconstant("S#7392", (SubLObject)$ic0$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f5758() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1168$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1168$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic35$));
        module0012.f419((SubLObject)$ic86$);
        module0012.f419((SubLObject)$ic85$);
        module0012.f419((SubLObject)$ic87$);
        module0012.f419((SubLObject)$ic88$);
        module0012.f419((SubLObject)$ic102$);
        module0012.f419((SubLObject)$ic103$);
        module0012.f419((SubLObject)$ic104$);
        module0012.f419((SubLObject)$ic105$);
        module0012.f419((SubLObject)$ic108$);
        module0027.f1449((SubLObject)$ic109$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic110$, NIL, $ic111$, NIL, $ic112$, NIL, $ic113$, $ic114$, $ic115$, T }), (SubLObject)$ic116$);
        module0027.f1449((SubLObject)$ic117$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic110$, NIL, $ic111$, NIL, $ic112$, NIL, $ic113$, $ic114$, $ic115$, T }), (SubLObject)$ic118$);
        module0027.f1449((SubLObject)$ic119$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic110$, NIL, $ic111$, NIL, $ic112$, NIL, $ic113$, $ic114$, $ic115$, T }), (SubLObject)$ic120$);
        module0027.f1449((SubLObject)$ic121$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic110$, NIL, $ic111$, NIL, $ic112$, NIL, $ic113$, $ic114$, $ic115$, T }), (SubLObject)$ic122$);
        module0027.f1449((SubLObject)$ic123$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic110$, NIL, $ic111$, NIL, $ic112$, NIL, $ic113$, $ic114$, $ic115$, T }), (SubLObject)$ic124$);
        module0027.f1449((SubLObject)$ic125$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic110$, NIL, $ic111$, NIL, $ic112$, NIL, $ic113$, $ic114$, $ic115$, T }), (SubLObject)$ic122$);
        module0027.f1449((SubLObject)$ic126$, (SubLObject)ConsesLow.list(new SubLObject[] { $ic110$, NIL, $ic111$, NIL, $ic112$, NIL, $ic113$, $ic114$, $ic115$, T }), (SubLObject)$ic127$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f5756();
    }
    
    public void initializeVariables() {
        f5757();
    }
    
    public void runTopLevelForms() {
        f5758();
    }
    
    static {
        me = (SubLFile)new module0083();
        $g1168$ = null;
        $ic0$ = makeSymbol("S#7309", "CYC");
        $ic1$ = makeSymbol("S#7310", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#3266", "CYC"), (SubLObject)makeSymbol("S#7393", "CYC"), (SubLObject)makeSymbol("S#7394", "CYC"), (SubLObject)makeSymbol("S#7395", "CYC"), (SubLObject)makeSymbol("S#7396", "CYC"), (SubLObject)makeSymbol("S#7397", "CYC"), (SubLObject)makeSymbol("S#7398", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("STATE"), (SubLObject)makeKeyword("RESET-FN"), (SubLObject)makeKeyword("ADD-FN"), (SubLObject)makeKeyword("ADD-ALL-FN"), (SubLObject)makeKeyword("SIZE-FN"), (SubLObject)makeKeyword("CONTENTS-FN"), (SubLObject)makeKeyword("ITERATOR-FN"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#7314", "CYC"), (SubLObject)makeSymbol("S#7315", "CYC"), (SubLObject)makeSymbol("S#7316", "CYC"), (SubLObject)makeSymbol("S#7317", "CYC"), (SubLObject)makeSymbol("S#7318", "CYC"), (SubLObject)makeSymbol("S#7319", "CYC"), (SubLObject)makeSymbol("S#7320", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#7321", "CYC"), (SubLObject)makeSymbol("S#7322", "CYC"), (SubLObject)makeSymbol("S#7323", "CYC"), (SubLObject)makeSymbol("S#7324", "CYC"), (SubLObject)makeSymbol("S#7325", "CYC"), (SubLObject)makeSymbol("S#7326", "CYC"), (SubLObject)makeSymbol("S#7327", "CYC"));
        $ic6$ = makeSymbol("S#7331", "CYC");
        $ic7$ = makeSymbol("S#7313", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#7310", "CYC"));
        $ic9$ = makeSymbol("S#7314", "CYC");
        $ic10$ = makeSymbol("S#7321", "CYC");
        $ic11$ = makeSymbol("S#7315", "CYC");
        $ic12$ = makeSymbol("S#7322", "CYC");
        $ic13$ = makeSymbol("S#7316", "CYC");
        $ic14$ = makeSymbol("S#7323", "CYC");
        $ic15$ = makeSymbol("S#7317", "CYC");
        $ic16$ = makeSymbol("S#7324", "CYC");
        $ic17$ = makeSymbol("S#7318", "CYC");
        $ic18$ = makeSymbol("S#7325", "CYC");
        $ic19$ = makeSymbol("S#7319", "CYC");
        $ic20$ = makeSymbol("S#7326", "CYC");
        $ic21$ = makeSymbol("S#7320", "CYC");
        $ic22$ = makeSymbol("S#7327", "CYC");
        $ic23$ = makeKeyword("STATE");
        $ic24$ = makeKeyword("RESET-FN");
        $ic25$ = makeKeyword("ADD-FN");
        $ic26$ = makeKeyword("ADD-ALL-FN");
        $ic27$ = makeKeyword("SIZE-FN");
        $ic28$ = makeKeyword("CONTENTS-FN");
        $ic29$ = makeKeyword("ITERATOR-FN");
        $ic30$ = makeString("Invalid slot ~S for construction function");
        $ic31$ = makeKeyword("BEGIN");
        $ic32$ = makeSymbol("S#7328", "CYC");
        $ic33$ = makeKeyword("SLOT");
        $ic34$ = makeKeyword("END");
        $ic35$ = makeSymbol("S#7330", "CYC");
        $ic36$ = makeString("#<");
        $ic37$ = makeKeyword("STREAM");
        $ic38$ = makeString("empty");
        $ic39$ = makeString("~A elems");
        $ic40$ = makeKeyword("BASE");
        $ic41$ = makeSymbol("S#7342", "CYC");
        $ic42$ = makeSymbol("LISTP");
        $ic43$ = makeString("Implementation Error: Accumulator ~A has an invalid size function.");
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#7309", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic45$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic46$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic47$ = makeKeyword("DONE");
        $ic48$ = makeUninternedSymbol("US#243071");
        $ic49$ = makeSymbol("CLET");
        $ic50$ = makeSymbol("S#7339", "CYC");
        $ic51$ = makeSymbol("S#5129", "CYC");
        $ic52$ = makeSymbol("S#7345", "CYC");
        $ic53$ = makeSymbol("S#7346", "CYC");
        $ic54$ = makeSymbol("S#7347", "CYC");
        $ic55$ = makeSymbol("S#7348", "CYC");
        $ic56$ = makeSymbol("S#7349", "CYC");
        $ic57$ = makeString("New list accumulator ~A is not empty?");
        $ic58$ = makeString("Accumulator should have ~A elements but has ~A.~%");
        $ic59$ = makeString("Mismatch between iterator contents of ~A and input list!");
        $ic60$ = makeString("Accumulator ~A contains less items than the input iterator has!");
        $ic61$ = makeString("Destructively emptied accumulator ~A is not empty?");
        $ic62$ = makeSymbol("S#7352", "CYC");
        $ic63$ = makeSymbol("S#7353", "CYC");
        $ic64$ = makeSymbol("S#7354", "CYC");
        $ic65$ = makeSymbol("S#7355", "CYC");
        $ic66$ = makeSymbol("S#7356", "CYC");
        $ic67$ = makeString("New set accumulator ~A is not empty?");
        $ic68$ = makeSymbol("S#7362", "CYC");
        $ic69$ = makeSymbol("S#7363", "CYC");
        $ic70$ = makeSymbol("S#7364", "CYC");
        $ic71$ = makeSymbol("S#7365", "CYC");
        $ic72$ = makeSymbol("S#7366", "CYC");
        $ic73$ = makeString("Dictionary accumulator expects tuples of (KEY . VALUE), not ~A.~%");
        $ic74$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic75$ = makeString("New dictionary accumulator ~A is not empty?");
        $ic76$ = makeSymbol("NULL");
        $ic77$ = makeSymbol("FALSE");
        $ic78$ = makeSymbol("S#4848", "CYC");
        $ic79$ = makeSymbol("S#7369", "CYC");
        $ic80$ = makeString("New null accumulator ~A is not empty");
        $ic81$ = makeString("New null accumulator ~A is no longer empty");
        $ic82$ = makeString("Expected iterator ~a to be empty");
        $ic83$ = makeString("Destructively emptied accumulator ~A is not empty");
        $ic84$ = makeString("Contents were ~a instead of null");
        $ic85$ = makeSymbol("S#7373", "CYC");
        $ic86$ = makeSymbol("S#7372", "CYC");
        $ic87$ = makeSymbol("S#7374", "CYC");
        $ic88$ = makeSymbol("S#7375", "CYC");
        $ic89$ = makeSymbol("S#7377", "CYC");
        $ic90$ = makeString("New sum accumulator ~A is not empty");
        $ic91$ = makeString("Accumulator should have 1 element but has ~A.~%");
        $ic92$ = makeString("Expected iterator ~a to have only 1 value");
        $ic93$ = makeString("Contents did not sum to ~a");
        $ic94$ = makeString("Iterator contained ~a instead of ~a");
        $ic95$ = makeSymbol("S#7380", "CYC");
        $ic96$ = makeString("New count accumulator ~A is not empty");
        $ic97$ = makeString("Contents did not count to ~a");
        $ic98$ = makeSymbol("S#7383", "CYC");
        $ic99$ = makeString("New product accumulator ~A is not empty");
        $ic100$ = makeSymbol("*");
        $ic101$ = makeString("Contents did not multiply to ~a");
        $ic102$ = makeSymbol("S#7387", "CYC");
        $ic103$ = makeSymbol("S#7388", "CYC");
        $ic104$ = makeSymbol("S#7389", "CYC");
        $ic105$ = makeSymbol("S#7390", "CYC");
        $ic106$ = makeSymbol("S#7399", "CYC");
        $ic107$ = ConsesLow.list((SubLObject)makeSymbol("S#7400", "CYC"), (SubLObject)makeSymbol("S#5250", "CYC"), (SubLObject)makeSymbol("S#5251", "CYC"));
        $ic108$ = makeSymbol("S#7391", "CYC");
        $ic109$ = makeSymbol("S#7350", "CYC");
        $ic110$ = makeKeyword("TEST");
        $ic111$ = makeKeyword("OWNER");
        $ic112$ = makeKeyword("CLASSES");
        $ic113$ = makeKeyword("KB");
        $ic114$ = makeKeyword("TINY");
        $ic115$ = makeKeyword("WORKING?");
        $ic116$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER })), (SubLObject)T));
        $ic117$ = makeSymbol("S#7357", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, ZERO_INTEGER }), (SubLObject)EQUAL), (SubLObject)T));
        $ic119$ = makeSymbol("S#7367", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)makeString("Eins")), ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)makeString("Zwei")), ConsesLow.list((SubLObject)THREE_INTEGER, (SubLObject)makeString("Drei")), ConsesLow.list((SubLObject)FOUR_INTEGER, (SubLObject)makeString("Vier")), ConsesLow.list((SubLObject)FIVE_INTEGER, (SubLObject)makeString("F&uuml;nf")), ConsesLow.list((SubLObject)SIX_INTEGER, (SubLObject)makeString("Sechs")), ConsesLow.list((SubLObject)SEVEN_INTEGER, (SubLObject)makeString("Sieben")), ConsesLow.list((SubLObject)EIGHT_INTEGER, (SubLObject)makeString("Acht")), ConsesLow.list((SubLObject)NINE_INTEGER, (SubLObject)makeString("Neun")), ConsesLow.list((SubLObject)TEN_INTEGER, (SubLObject)makeString("Zehn")) }), (SubLObject)EQUAL), (SubLObject)T));
        $ic121$ = makeSymbol("S#7370", "CYC");
        $ic122$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeString("a"), (SubLObject)Characters.CHAR_b, (SubLObject)THREE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("FOURTH")))), (SubLObject)T));
        $ic123$ = makeSymbol("S#7378", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)makeInteger(-3))), (SubLObject)T));
        $ic125$ = makeSymbol("S#7381", "CYC");
        $ic126$ = makeSymbol("S#7384", "CYC");
        $ic127$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)TWO_INTEGER, (SubLObject)makeDouble(0.5))), (SubLObject)T));
    }
    
    public static final class $sX7309_native extends SubLStructNative
    {
        public SubLObject $state;
        public SubLObject $reset_fn;
        public SubLObject $add_fn;
        public SubLObject $add_all_fn;
        public SubLObject $size_fn;
        public SubLObject $contents_fn;
        public SubLObject $iterator_fn;
        public static final SubLStructDeclNative structDecl;
        
        public $sX7309_native() {
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$reset_fn = (SubLObject)CommonSymbols.NIL;
            this.$add_fn = (SubLObject)CommonSymbols.NIL;
            this.$add_all_fn = (SubLObject)CommonSymbols.NIL;
            this.$size_fn = (SubLObject)CommonSymbols.NIL;
            this.$contents_fn = (SubLObject)CommonSymbols.NIL;
            this.$iterator_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX7309_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$state;
        }
        
        public SubLObject getField3() {
            return this.$reset_fn;
        }
        
        public SubLObject getField4() {
            return this.$add_fn;
        }
        
        public SubLObject getField5() {
            return this.$add_all_fn;
        }
        
        public SubLObject getField6() {
            return this.$size_fn;
        }
        
        public SubLObject getField7() {
            return this.$contents_fn;
        }
        
        public SubLObject getField8() {
            return this.$iterator_fn;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$reset_fn = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$add_fn = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$add_all_fn = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$size_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$contents_fn = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$iterator_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX7309_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$state", "$reset_fn", "$add_fn", "$add_all_fn", "$size_fn", "$contents_fn", "$iterator_fn" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f5676$UnaryFunction extends UnaryFunction
    {
        public $f5676$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#7310"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f5676(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 310 ms
	
	Decompiled with Procyon 0.5.32.
*/