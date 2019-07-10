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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
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

public final class module0052 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0052";
    public static final String myFingerPrint = "da8bc4a99db58aaa73dc6a21f6caed77fc9615f1bc2afbba69220e10ffc06fed";
    public static SubLSymbol $g1011$;
    private static SubLSymbol $g1012$;
    public static SubLSymbol $g1013$;
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
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLList $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLList $ic61$;
    private static final SubLList $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLList $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLList $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLList $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLList $ic101$;
    private static final SubLList $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLList $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLList $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLList $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLList $ic139$;
    private static final SubLList $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLList $ic148$;
    private static final SubLList $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    
    
    public static SubLObject f3672(final SubLObject var1, final SubLObject var2) {
        f3673(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3674(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5090_native.class) ? T : NIL);
    }
    
    public static SubLObject f3675(final SubLObject var1) {
        assert NIL != f3674(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3676(final SubLObject var1) {
        assert NIL != f3674(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3677(final SubLObject var1) {
        assert NIL != f3674(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3678(final SubLObject var1) {
        assert NIL != f3674(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f3679(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3674(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3680(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3674(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3681(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3674(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3682(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3674(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f3683(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5090_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic17$)) {
                f3679(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f3680(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f3681(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f3682(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3684(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic17$, f3675(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic18$, f3676(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic19$, f3677(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic20$, f3678(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f3685(final SubLObject var11, final SubLObject var12) {
        return f3684(var11, var12);
    }
    
    public static SubLObject f3673(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic27$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic28$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            final SubLObject var16 = $g1012$.currentBinding(var15);
            try {
                $g1012$.bind((SubLObject)T, var15);
                if (NIL != f3676(var13) && NIL == f3686(var13) && NIL != f3687(var13)) {
                    streams_high.write_string((SubLObject)$ic29$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                $g1012$.rebind(var16, var15);
            }
            if (NIL != f3677(var13)) {
                streams_high.write_string(f3688(var13), var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                streams_high.write_string((SubLObject)$ic30$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic28$, var2, $ic31$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var13;
    }
    
    public static SubLObject f3689(final SubLObject var20, final SubLObject var21, final SubLObject var22, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = Symbols.symbol_function((SubLObject)$ic32$);
        }
        final SubLObject var24 = f3683((SubLObject)UNPROVIDED);
        f3679(var24, var20);
        f3680(var24, var21);
        f3681(var24, var22);
        f3682(var24, var23);
        return var24;
    }
    
    public static SubLObject f3687(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        return Functions.funcall(f3676(var13), f3675(var13));
    }
    
    public static SubLObject f3690(final SubLObject var24, final SubLObject var25) {
        if (var24.eql((SubLObject)$ic33$)) {
            return hl_interface_infrastructure_oc.f8333(var25);
        }
        if (var24.eql((SubLObject)$ic34$)) {
            return f3691(var25);
        }
        if (var24.eql((SubLObject)$ic35$)) {
            return f3692(var25);
        }
        return Functions.funcall(var24, var25);
    }
    
    public static SubLObject f3693(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        assert NIL != f3674(var13) : var13;
        final SubLObject var15 = Functions.funcall(f3676(var13), f3675(var13));
        SubLObject var16 = f3675(var13);
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        if (NIL == var15) {
            var14.resetMultipleValues();
            final SubLObject var19 = f3690(f3677(var13), var16);
            final SubLObject var20 = var14.secondMultipleValue();
            final SubLObject var21 = var14.thirdMultipleValue();
            var14.resetMultipleValues();
            var16 = var20;
            if (NIL == var21) {
                var17 = var19;
                var18 = (SubLObject)T;
            }
        }
        if (!var16.eql(f3675(var13))) {
            f3679(var13, var16);
        }
        return Values.values(var17, var18);
    }
    
    public static SubLObject f3694(final SubLObject var13, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        final SubLThread var33 = SubLProcess.currentSubLThread();
        assert NIL != f3674(var13) : var13;
        final SubLObject var34 = Functions.funcall(f3676(var13), f3675(var13));
        SubLObject var35 = f3675(var13);
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        if (NIL == var34) {
            var33.resetMultipleValues();
            final SubLObject var38 = f3690(f3677(var13), var35);
            final SubLObject var39 = var33.secondMultipleValue();
            final SubLObject var40 = var33.thirdMultipleValue();
            var33.resetMultipleValues();
            var35 = var39;
            if (NIL == var40) {
                var36 = var38;
                var37 = (SubLObject)T;
            }
        }
        if (!var35.eql(f3675(var13))) {
            f3679(var13, var35);
        }
        return (NIL != var37) ? var36 : var32;
    }
    
    public static SubLObject f3695(final SubLObject var13, SubLObject var32) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        return f3694(var13, var32);
    }
    
    public static SubLObject f3696(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        return Functions.funcall(f3678(var13), f3675(var13));
    }
    
    public static SubLObject f3688(final SubLObject var13) {
        return module0038.f2621(module0038.f2620(f3677(var13)), (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3697(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        return f3675(var13);
    }
    
    public static SubLObject f3698(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        return f3677(var13);
    }
    
    public static SubLObject f3699(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic39$);
        final SubLObject var37 = var36.rest();
        var36 = var36.first();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic39$);
        var38 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic39$);
        var39 = var36.first();
        var36 = var36.rest();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var36;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var42_43 = (SubLObject)NIL;
        while (NIL != var41) {
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic39$);
            var42_43 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic39$);
            if (NIL == conses_high.member(var42_43, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var42 = (SubLObject)T;
            }
            if (var42_43 == $ic41$) {
                var40 = var41.first();
            }
            var41 = var41.rest();
        }
        if (NIL != var42 && NIL == var40) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic39$);
        }
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var36);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45;
        var36 = (var45 = var37);
        if (!var39.isSymbol()) {
            final SubLObject var46 = (SubLObject)$ic42$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var46, var39)), (SubLObject)ConsesLow.listS((SubLObject)$ic44$, (SubLObject)ConsesLow.list(var38, var46, (SubLObject)$ic18$, var44), ConsesLow.append(var45, (SubLObject)NIL)));
        }
        final SubLObject var47 = (SubLObject)$ic45$;
        final SubLObject var48 = (SubLObject)$ic46$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var47, var44)), (SubLObject)ConsesLow.list((SubLObject)$ic47$, var47, (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list(var38, var48), (SubLObject)ConsesLow.list((SubLObject)$ic49$, var39), (SubLObject)ConsesLow.listS((SubLObject)$ic50$, var48, ConsesLow.append(var45, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic51$, var47, (SubLObject)((NIL != var44) ? ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, var48), var44) : ConsesLow.list((SubLObject)$ic53$, var48))))));
    }
    
    public static SubLObject f3700(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic54$);
        final SubLObject var37 = var36.rest();
        var36 = var36.first();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic54$);
        var38 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic54$);
        var39 = var36.first();
        var36 = var36.rest();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var36;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var55_56 = (SubLObject)NIL;
        while (NIL != var41) {
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic54$);
            var55_56 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic54$);
            if (NIL == conses_high.member(var55_56, (SubLObject)$ic55$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var42 = (SubLObject)T;
            }
            if (var55_56 == $ic41$) {
                var40 = var41.first();
            }
            var41 = var41.rest();
        }
        if (NIL != var42 && NIL == var40) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic54$);
        }
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var36);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var36);
        final SubLObject var46 = (SubLObject)((NIL != var45) ? conses_high.cadr(var45) : NIL);
        final SubLObject var47 = cdestructuring_bind.property_list_member((SubLObject)$ic57$, var36);
        final SubLObject var48 = (SubLObject)((NIL != var47) ? conses_high.cadr(var47) : NIL);
        final SubLObject var49;
        var36 = (var49 = var37);
        return (SubLObject)ConsesLow.list((SubLObject)$ic58$, var48, (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list(var38, var39, (SubLObject)$ic56$, var44, (SubLObject)$ic18$, var46), (SubLObject)$ic59$, ConsesLow.append(var49, (SubLObject)NIL)));
    }
    
    public static SubLObject f3701(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic60$);
        final SubLObject var37 = var36.rest();
        var36 = var36.first();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic60$);
        var38 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic60$);
        var39 = var36.first();
        var36 = var36.rest();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var36;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var67_68 = (SubLObject)NIL;
        while (NIL != var41) {
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic60$);
            var67_68 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic60$);
            if (NIL == conses_high.member(var67_68, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var42 = (SubLObject)T;
            }
            if (var67_68 == $ic41$) {
                var40 = var41.first();
            }
            var41 = var41.rest();
        }
        if (NIL != var42 && NIL == var40) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic60$);
        }
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var36);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var36);
        final SubLObject var46 = (SubLObject)((NIL != var45) ? conses_high.cadr(var45) : NIL);
        final SubLObject var47;
        var36 = (var47 = var37);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list(var38, var39, (SubLObject)$ic56$, var44, (SubLObject)$ic18$, var46), ConsesLow.append(var47, (SubLObject)NIL));
    }
    
    public static SubLObject f3702(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic60$);
        final SubLObject var37 = var36.rest();
        var36 = var36.first();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic60$);
        var38 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic60$);
        var39 = var36.first();
        var36 = var36.rest();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var36;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var77_78 = (SubLObject)NIL;
        while (NIL != var41) {
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic60$);
            var77_78 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic60$);
            if (NIL == conses_high.member(var77_78, (SubLObject)$ic61$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var42 = (SubLObject)T;
            }
            if (var77_78 == $ic41$) {
                var40 = var41.first();
            }
            var41 = var41.rest();
        }
        if (NIL != var42 && NIL == var40) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic60$);
        }
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var36);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var36);
        final SubLObject var46 = (SubLObject)((NIL != var45) ? conses_high.cadr(var45) : NIL);
        final SubLObject var47;
        var36 = (var47 = var37);
        if (!var39.isSymbol()) {
            final SubLObject var48 = (SubLObject)$ic63$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var48, var39)), (SubLObject)ConsesLow.listS((SubLObject)$ic37$, (SubLObject)ConsesLow.list(var38, var48, (SubLObject)$ic56$, var44, (SubLObject)$ic18$, var46), ConsesLow.append(var47, (SubLObject)NIL)));
        }
        final SubLObject var49 = (SubLObject)$ic64$;
        final SubLObject var50 = (SubLObject)$ic65$;
        final SubLObject var51 = (SubLObject)$ic66$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var49, var46), (SubLObject)ConsesLow.list(var50, var44)), (SubLObject)ConsesLow.list((SubLObject)$ic47$, var49, (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var38, (SubLObject)ConsesLow.list((SubLObject)$ic36$, var39, var50)), (SubLObject)ConsesLow.list(var51, (SubLObject)ConsesLow.list((SubLObject)$ic53$, (SubLObject)ConsesLow.list((SubLObject)EQ, var50, var38)))), (SubLObject)ConsesLow.listS((SubLObject)$ic50$, var51, ConsesLow.append(var47, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic51$, var49, (SubLObject)((NIL != var46) ? ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, var51), var46) : ConsesLow.list((SubLObject)$ic53$, var51))))));
    }
    
    public static SubLObject f3703(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic67$);
        final SubLObject var37 = var36.rest();
        var36 = var36.first();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        SubLObject var40 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic67$);
        var38 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic67$);
        var39 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic67$);
        var40 = var36.first();
        var36 = var36.rest();
        SubLObject var41 = (SubLObject)NIL;
        SubLObject var42 = var36;
        SubLObject var43 = (SubLObject)NIL;
        SubLObject var89_90 = (SubLObject)NIL;
        while (NIL != var42) {
            cdestructuring_bind.destructuring_bind_must_consp(var42, var35, (SubLObject)$ic67$);
            var89_90 = var42.first();
            var42 = var42.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var42, var35, (SubLObject)$ic67$);
            if (NIL == conses_high.member(var89_90, (SubLObject)$ic40$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var43 = (SubLObject)T;
            }
            if (var89_90 == $ic41$) {
                var41 = var42.first();
            }
            var42 = var42.rest();
        }
        if (NIL != var43 && NIL == var41) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic67$);
        }
        final SubLObject var44 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var36);
        final SubLObject var45 = (SubLObject)((NIL != var44) ? conses_high.cadr(var44) : NIL);
        final SubLObject var46;
        var36 = (var46 = var37);
        final SubLObject var47 = (SubLObject)$ic68$;
        final SubLObject var48 = (SubLObject)$ic69$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic43$, (SubLObject)ConsesLow.list(reader.bq_cons(var47, (SubLObject)$ic70$), (SubLObject)ConsesLow.list(var48, (SubLObject)ConsesLow.list((SubLObject)$ic52$, var45, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var47, var39)))), (SubLObject)ConsesLow.list((SubLObject)$ic44$, (SubLObject)ConsesLow.list(var38, var40, (SubLObject)$ic18$, var48), reader.bq_cons((SubLObject)$ic72$, ConsesLow.append(var46, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic73$, var47), (SubLObject)ConsesLow.list((SubLObject)$ic50$, (SubLObject)ConsesLow.list((SubLObject)$ic52$, var45, (SubLObject)ConsesLow.list((SubLObject)$ic71$, var47, var39)), (SubLObject)ConsesLow.listS((SubLObject)$ic51$, var48, (SubLObject)$ic74$)))))));
    }
    
    public static SubLObject f3704(final SubLObject var94, final SubLObject var13) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var98;
        for (SubLObject var96 = (SubLObject)NIL; NIL == var96; var96 = (SubLObject)makeBoolean(NIL == var98)) {
            var95.resetMultipleValues();
            final SubLObject var97 = f3693(var13);
            var98 = var95.secondMultipleValue();
            var95.resetMultipleValues();
            if (NIL != var98) {
                Functions.funcall(var94, var97);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3705(final SubLObject var13, SubLObject var98) {
        if (var98 == UNPROVIDED) {
            var98 = (SubLObject)$ic75$;
        }
        assert NIL != f3674(var13) : var13;
        assert NIL != Types.function_spec_p(var98) : var98;
        final SubLObject var99 = f3675(var13);
        final SubLObject var100 = f3676(var13);
        final SubLObject var101 = f3677(var13);
        final SubLObject var102 = f3678(var13);
        final SubLObject var103 = Functions.funcall(var98, var99);
        return f3689(var103, var100, var101, var102);
    }
    
    public static SubLObject f3706(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var18;
        for (SubLObject var16 = (SubLObject)NIL; NIL == var16; var16 = (SubLObject)makeBoolean(NIL == var18)) {
            var14.resetMultipleValues();
            final SubLObject var17 = f3693(var13);
            var18 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var18) {
                var15 = (SubLObject)ConsesLow.cons(var17, var15);
            }
        }
        return Sequences.nreverse(var15);
    }
    
    public static SubLObject f3707(final SubLObject var13, final SubLObject var102, SubLObject var103) {
        if (var103 == UNPROVIDED) {
            var103 = Symbols.symbol_function((SubLObject)$ic77$);
        }
        final SubLThread var104 = SubLProcess.currentSubLThread();
        assert NIL != f3674(var13) : var13;
        if (NIL != var103 && !var103.eql(Symbols.symbol_function((SubLObject)$ic77$))) {
            while (NIL != Functions.funcall(var103)) {}
        }
        SubLObject var107;
        for (SubLObject var105 = (SubLObject)NIL; NIL == var105; var105 = (SubLObject)makeBoolean(NIL == var107)) {
            var104.resetMultipleValues();
            final SubLObject var106 = f3693(var13);
            var107 = var104.secondMultipleValue();
            var104.resetMultipleValues();
            if (NIL != var107) {
                Functions.funcall(var102, var106);
                if (NIL != var103 && !var103.eql(Symbols.symbol_function((SubLObject)$ic77$))) {
                    while (NIL != Functions.funcall(var103)) {}
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3708() {
        return f3709((SubLObject)NIL);
    }
    
    public static SubLObject f3710(final SubLObject var96) {
        if (NIL == var96) {
            return f3709((SubLObject)ConsesLow.list(var96));
        }
        return f3689(var96, (SubLObject)$ic78$, (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3711(final SubLObject var20) {
        return Values.values(var20, (SubLObject)NIL);
    }
    
    public static SubLObject f3712(SubLObject var104, SubLObject var105, SubLObject var106) {
        if (var104 == UNPROVIDED) {
            var104 = (SubLObject)ZERO_INTEGER;
        }
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)NIL;
        }
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)ONE_INTEGER;
        }
        assert NIL != Types.integerp(var104) : var104;
        assert NIL != Types.integerp(var106) : var106;
        return f3713(var104, var105, var106);
    }
    
    public static SubLObject f3713(SubLObject var104, SubLObject var105, SubLObject var106) {
        if (var104 == UNPROVIDED) {
            var104 = (SubLObject)ZERO_INTEGER;
        }
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)NIL;
        }
        if (var106 == UNPROVIDED) {
            var106 = (SubLObject)ONE_INTEGER;
        }
        assert NIL != Types.numberp(var104) : var104;
        assert NIL != Types.numberp(var106) : var106;
        if (NIL != var105 && !areAssertionsDisabledFor(me) && NIL == Types.numberp(var105)) {
            throw new AssertionError(var105);
        }
        return f3689(f3714(var104, var105, var106), (SubLObject)$ic82$, (SubLObject)$ic83$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3714(final SubLObject var104, final SubLObject var105, final SubLObject var106) {
        return (SubLObject)ConsesLow.list(var104, var106, var105);
    }
    
    public static SubLObject f3715(final SubLObject var20) {
        SubLObject var107_110 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic84$);
        var107_110 = var20.first();
        SubLObject var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var20, (SubLObject)$ic84$);
        var21 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var20, (SubLObject)$ic84$);
        var22 = var23.first();
        var23 = var23.rest();
        if (NIL != var23) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic84$);
            return (SubLObject)NIL;
        }
        if (NIL == var22) {
            return (SubLObject)NIL;
        }
        if (var21.isPositive()) {
            return Numbers.numGE(var107_110, var22);
        }
        if (var21.isNegative()) {
            return Numbers.numLE(var107_110, var22);
        }
        return Numbers.numE(var107_110, var22);
    }
    
    public static SubLObject f3716(final SubLObject var20) {
        SubLObject var107_113 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic84$);
        var107_113 = var20.first();
        SubLObject var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var20, (SubLObject)$ic84$);
        var21 = var23.first();
        var23 = var23.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var20, (SubLObject)$ic84$);
        var22 = var23.first();
        var23 = var23.rest();
        if (NIL == var23) {
            final SubLObject var24 = var107_113;
            final SubLObject var25 = Numbers.add(var107_113, var21);
            ConsesLow.rplaca(var20, var25);
            return Values.values(var24, var20);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic84$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3717(final SubLObject var115) {
        return (SubLObject)makeBoolean(NIL != f3674(var115) && f3677(var115) == $ic85$);
    }
    
    public static SubLObject f3709(final SubLObject var116) {
        assert NIL != Types.listp(var116) : var116;
        return f3689(f3718(var116), (SubLObject)$ic87$, (SubLObject)$ic85$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3719(final SubLObject var13) {
        assert NIL != f3717(var13) : var13;
        return f3675(var13);
    }
    
    public static SubLObject f3720(final SubLObject var117) {
        return Sequences.length(f3719(var117));
    }
    
    public static SubLObject f3718(final SubLObject var116) {
        return var116;
    }
    
    public static SubLObject f3721(final SubLObject var20) {
        return Types.sublisp_null(var20);
    }
    
    public static SubLObject f3722(final SubLObject var20) {
        final SubLObject var21 = var20.first();
        final SubLObject var22 = var20.rest();
        return Values.values(var21, var22);
    }
    
    public static SubLObject f3723(final SubLObject var118) {
        assert NIL != module0035.f2292(var118) : var118;
        return f3724(f3709(var118), (SubLObject)$ic90$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3725(final SubLObject var119) {
        SubLObject var120 = (SubLObject)NIL;
        SubLObject var121 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var119, var119, (SubLObject)$ic91$);
        var120 = var119.first();
        final SubLObject var122 = var121 = var119.rest();
        return (SubLObject)ConsesLow.list(var120, var121);
    }
    
    public static SubLObject f3726(final SubLObject var124) {
        assert NIL != Types.vectorp(var124) : var124;
        return f3689(f3727(var124), (SubLObject)$ic93$, (SubLObject)$ic94$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3727(final SubLObject var124) {
        final SubLObject var125 = (SubLObject)ZERO_INTEGER;
        return (SubLObject)ConsesLow.list(var125, var124);
    }
    
    public static SubLObject f3728(final SubLObject var20) {
        SubLObject var107_127 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic95$);
        var107_127 = var20.first();
        SubLObject var22 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var20, (SubLObject)$ic95$);
        var21 = var22.first();
        var22 = var22.rest();
        if (NIL == var22) {
            final SubLObject var23 = Vectors.aref(var21, var107_127);
            SubLObject var24 = Numbers.add((SubLObject)ONE_INTEGER, var107_127);
            if (var24.numE(Sequences.length(var21))) {
                var24 = (SubLObject)$ic18$;
                ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, (SubLObject)$ic96$);
            }
            ConsesLow.rplaca(var20, var24);
            return Values.values(var23, var20);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic95$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3729(final SubLObject var124) {
        assert NIL != Types.vectorp(var124) : var124;
        return f3689(f3730(var124), (SubLObject)$ic93$, (SubLObject)$ic97$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3730(final SubLObject var124) {
        final SubLObject var125 = (SubLObject)ZERO_INTEGER;
        return (SubLObject)ConsesLow.list(var125, var124);
    }
    
    public static SubLObject f3731(final SubLObject var20) {
        SubLObject var107_130 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic95$);
        var107_130 = var20.first();
        SubLObject var22 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var20, (SubLObject)$ic95$);
        var21 = var22.first();
        var22 = var22.rest();
        if (NIL == var22) {
            final SubLObject var23 = var107_130;
            final SubLObject var24 = Vectors.aref(var21, var107_130);
            final SubLObject var25 = (SubLObject)ConsesLow.list(var23, var24);
            SubLObject var26 = Numbers.add((SubLObject)ONE_INTEGER, var107_130);
            if (var26.numE(Sequences.length(var21))) {
                var26 = (SubLObject)$ic18$;
                ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, (SubLObject)$ic96$);
            }
            ConsesLow.rplaca(var20, var26);
            return Values.values(var25, var20);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic95$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3732(final SubLObject var133) {
        assert NIL != Types.hash_table_p(var133) : var133;
        return f3689(f3733(var133), (SubLObject)$ic99$, (SubLObject)$ic100$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3734(final SubLObject var133) {
        assert NIL != Types.hash_table_p(var133) : var133;
        return f3709(module0030.f1627(var133));
    }
    
    public static SubLObject f3733(final SubLObject var133) {
        final SubLObject var134 = module0030.f1625(var133);
        return (SubLObject)ConsesLow.list(var134, var133);
    }
    
    public static SubLObject f3735(final SubLObject var20) {
        SubLObject var107_136 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic101$);
        var107_136 = var20.first();
        SubLObject var22 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var20, (SubLObject)$ic101$);
        var21 = var22.first();
        var22 = var22.rest();
        if (NIL == var22) {
            return Types.sublisp_null(var107_136);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic101$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3736(final SubLObject var20) {
        SubLObject var107_139 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic101$);
        var107_139 = var20.first();
        SubLObject var22 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var22, var20, (SubLObject)$ic101$);
        var21 = var22.first();
        var22 = var22.rest();
        if (NIL == var22) {
            SubLObject var142_143;
            final SubLObject var140_141 = var142_143 = var107_139;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var142_143, var140_141, (SubLObject)$ic102$);
            var23 = var142_143.first();
            var142_143 = (var24 = var142_143.rest());
            final SubLObject var25 = Hashtables.gethash(var23, var21, (SubLObject)UNPROVIDED);
            final SubLObject var26 = (SubLObject)ConsesLow.list(var23, var25);
            final SubLObject var27 = var24;
            if (NIL == var27) {
                ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, (SubLObject)$ic96$);
            }
            ConsesLow.rplaca(var20, var27);
            return Values.values(var26, var20);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic101$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3737(final SubLObject var146, final SubLObject var147) {
        assert NIL != Types.function_spec_p(var146) : var146;
        assert NIL != Types.listp(var147) : var147;
        final SubLObject var148 = f3689((SubLObject)NIL, Symbols.symbol_function((SubLObject)$ic103$), Symbols.symbol_function((SubLObject)$ic104$), (SubLObject)UNPROVIDED);
        f3679(var148, (SubLObject)ConsesLow.list(var148, var146, var147));
        return var148;
    }
    
    public static SubLObject f3686(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        return Equality.eq(f3676(var13), Symbols.symbol_function((SubLObject)$ic103$));
    }
    
    public static SubLObject f3738(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        if (!f3675(var13).isCons() || !f3676(var13).eql(Symbols.symbol_function((SubLObject)$ic103$)) || !f3677(var13).eql(Symbols.symbol_function((SubLObject)$ic104$))) {
            return (SubLObject)NIL;
        }
        if (var13.eql(f3675(var13).first())) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3739(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic105$);
        var22 = var20.first();
        SubLObject var25 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic105$);
        var23 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic105$);
        var24 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            if (NIL == $g1012$.getDynamicValue(var21) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var21) && NIL == f3738(var22)) {
                Errors.error((SubLObject)$ic106$, var22);
            }
            final SubLObject var26 = Mapping.mapcar((SubLObject)$ic107$, var24);
            SubLObject var27 = Functions.apply(var23, var26);
            SubLObject var28 = (SubLObject)NIL;
            while (NIL == var28) {
                if (NIL != f3738(var27)) {
                    var27 = f3739(f3675(var27));
                }
                else {
                    var28 = (SubLObject)T;
                }
            }
            f3679(var22, f3675(var27));
            f3680(var22, f3676(var27));
            f3681(var22, f3677(var27));
            f3682(var22, f3678(var27));
            return var22;
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic105$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3740(final SubLObject var20) {
        assert NIL != Types.consp(var20) : var20;
        return f3687(f3739(var20));
    }
    
    public static SubLObject f3741(final SubLObject var20) {
        assert NIL != Types.consp(var20) : var20;
        return f3693(f3739(var20));
    }
    
    public static SubLObject f3724(final SubLObject var13, SubLObject var153, SubLObject var23) {
        if (var153 == UNPROVIDED) {
            var153 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)$ic109$;
        }
        assert NIL != f3674(var13) : var13;
        assert NIL != Types.function_spec_p(var153) : var153;
        return f3689(f3742(var13, var153), (SubLObject)$ic93$, (SubLObject)$ic110$, var23);
    }
    
    public static SubLObject f3742(final SubLObject var13, final SubLObject var153) {
        return (SubLObject)ConsesLow.list(var13, var153);
    }
    
    public static SubLObject f3743(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var107_156 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic111$);
        var107_156 = var20.first();
        SubLObject var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var20, (SubLObject)$ic111$);
        var22 = var23.first();
        var23 = var23.rest();
        if (NIL != var23) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic111$);
            return (SubLObject)NIL;
        }
        var21.resetMultipleValues();
        SubLObject var24 = f3693(var107_156);
        final SubLObject var25 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        if (NIL == var25) {
            final SubLObject var26 = (SubLObject)$ic18$;
            ConsesLow.rplaca(var20, var26);
            ConsesLow.rplacd(var20, (SubLObject)NIL);
            return Values.values((SubLObject)NIL, var20, (SubLObject)T);
        }
        if (!Symbols.symbol_function((SubLObject)IDENTITY).eql(var22)) {
            var24 = Functions.funcall(var22, var24);
        }
        return Values.values(var24, var20, (SubLObject)NIL);
    }
    
    public static SubLObject f3744(final SubLObject var20) {
        final SubLObject var21 = var20.first();
        return (SubLObject)((NIL != f3674(var21)) ? f3696(var21) : T);
    }
    
    public static SubLObject f3745(final SubLObject var157, SubLObject var158, SubLObject var23) {
        if (var158 == UNPROVIDED) {
            var158 = (SubLObject)NIL;
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)$ic112$;
        }
        assert NIL != Types.listp(var157) : var157;
        return f3689(f3746(var157, var158), (SubLObject)$ic93$, (SubLObject)$ic113$, var23);
    }
    
    public static SubLObject f3746(final SubLObject var157, final SubLObject var158) {
        final SubLObject var159 = (SubLObject)$ic96$;
        final SubLObject var160 = (SubLObject)$ic114$;
        return (SubLObject)ConsesLow.list(var159, var160, var157, var158);
    }
    
    public static SubLObject f3747(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        while (true) {
            SubLObject var107_162 = (SubLObject)NIL;
            SubLObject var22 = (SubLObject)NIL;
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic115$);
            var107_162 = var20.first();
            SubLObject var25 = var20.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic115$);
            var22 = var25.first();
            var25 = var25.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic115$);
            var23 = var25.first();
            var25 = var25.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic115$);
            var24 = var25.first();
            var25 = var25.rest();
            if (NIL == var25) {
                final SubLObject var26 = var22;
                if (var26.eql((SubLObject)$ic114$)) {
                    final SubLObject var27 = (SubLObject)$ic96$;
                    final SubLObject var28 = (SubLObject)$ic116$;
                    ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var20, var27);
                    ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, var28);
                }
                else if (var26.eql((SubLObject)$ic116$)) {
                    if (NIL == var23) {
                        final SubLObject var27 = (SubLObject)$ic96$;
                        final SubLObject var28 = (SubLObject)$ic18$;
                        ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var20, var27);
                        ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, var28);
                        ConsesLow.set_nth((SubLObject)THREE_INTEGER, var20, (SubLObject)$ic96$);
                    }
                    else {
                        SubLObject var166_167;
                        final SubLObject var164_165 = var166_167 = var23;
                        SubLObject var29 = (SubLObject)NIL;
                        SubLObject var30 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var166_167, var164_165, (SubLObject)$ic117$);
                        var29 = var166_167.first();
                        var166_167 = (var30 = var166_167.rest());
                        final SubLObject var31 = Functions.apply(var29, var24);
                        final SubLObject var32 = (SubLObject)$ic118$;
                        ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var20, var31);
                        ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, var32);
                        ConsesLow.set_nth((SubLObject)TWO_INTEGER, var20, var30);
                    }
                }
                else {
                    if (var26.eql((SubLObject)$ic18$)) {
                        return Values.values((SubLObject)NIL, var20, (SubLObject)T);
                    }
                    assert NIL != f3674(var107_162) : var107_162;
                    var21.resetMultipleValues();
                    final SubLObject var33 = f3693(var107_162);
                    final SubLObject var34 = var21.secondMultipleValue();
                    var21.resetMultipleValues();
                    if (NIL != var34) {
                        return Values.values(var33, var20, (SubLObject)NIL);
                    }
                    final SubLObject var35 = (SubLObject)$ic96$;
                    final SubLObject var36 = (SubLObject)$ic116$;
                    ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var20, var35);
                    ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, var36);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic115$);
            }
        }
    }
    
    public static SubLObject f3748(final SubLObject var20) {
        SubLObject var107_172 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic115$);
        var107_172 = var20.first();
        SubLObject var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic115$);
        var21 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic115$);
        var22 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic115$);
        var23 = var24.first();
        var24 = var24.rest();
        if (NIL == var24) {
            return (SubLObject)((NIL != f3674(var107_172)) ? f3696(var107_172) : T);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic115$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3749(final SubLObject var173) {
        assert NIL != Types.listp(var173) : var173;
        if (NIL == var173) {
            return f3708();
        }
        if (NIL != module0035.f1997(var173)) {
            return var173.first();
        }
        final SubLObject var174 = f3750(var173);
        return f3689(var174, (SubLObject)$ic119$, (SubLObject)$ic120$, (SubLObject)$ic121$);
    }
    
    public static SubLObject f3751(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        final SubLObject var14 = f3675(var13);
        if (NIL != module0035.f1997(var14)) {
            return (SubLObject)ConsesLow.list(var14);
        }
        return var14;
    }
    
    public static SubLObject f3750(final SubLObject var173) {
        SubLObject var174 = var173;
        SubLObject var175 = (SubLObject)NIL;
        var175 = var174.first();
        while (NIL != var174) {
            assert NIL != f3674(var175) : var175;
            var174 = var174.rest();
            var175 = var174.first();
        }
        return var173;
    }
    
    public static SubLObject f3752(final SubLObject var20) {
        if (NIL == var20) {
            return (SubLObject)T;
        }
        if (var20.isCons()) {
            SubLObject var21 = var20;
            SubLObject var22 = (SubLObject)NIL;
            var22 = var21.first();
            while (NIL != var21) {
                if (NIL == f3687(var22)) {
                    return (SubLObject)NIL;
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
            return (SubLObject)T;
        }
        return f3687(var20);
    }
    
    public static SubLObject f3753(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = var20;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        while (NIL == var24 && NIL == var25) {
            final SubLObject var26 = var22.first();
            if (NIL != f3687(var26)) {
                var22 = var22.rest();
                var25 = Types.sublisp_null(var22);
            }
            else {
                var21.resetMultipleValues();
                final SubLObject var27 = f3693(var26);
                final SubLObject var28 = var21.secondMultipleValue();
                var21.resetMultipleValues();
                if (NIL == var28) {
                    continue;
                }
                var23 = var27;
                var24 = (SubLObject)T;
            }
        }
        return Values.values(var23, var22, var25);
    }
    
    public static SubLObject f3754(final SubLObject var20) {
        SubLObject var21 = var20;
        SubLObject var22 = (SubLObject)NIL;
        var22 = var21.first();
        while (NIL != var21) {
            f3696(var22);
            var21 = var21.rest();
            var22 = var21.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f3755(final SubLObject var173) {
        assert NIL != Types.listp(var173) : var173;
        if (NIL == var173) {
            return f3708();
        }
        if (NIL != module0035.f1997(var173)) {
            return var173.first();
        }
        return f3689(f3756(var173), (SubLObject)$ic122$, (SubLObject)$ic123$, (SubLObject)$ic124$);
    }
    
    public static SubLObject f3757(final SubLObject var173, SubLObject var178) {
        if (var178 == UNPROVIDED) {
            var178 = (SubLObject)$ic125$;
        }
        final SubLThread var179 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var173) : var173;
        SubLObject var180 = var173;
        SubLObject var181 = (SubLObject)NIL;
        var181 = var180.first();
        while (NIL != var180) {
            assert NIL != f3674(var181) : var181;
            if (NIL == $g1012$.getDynamicValue(var179) && NIL != f3686(var181) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var179) && NIL == f3738(var181)) {
                Errors.error((SubLObject)$ic126$, var178, var181);
            }
            var180 = var180.rest();
            var181 = var180.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3758(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        return conses_high.second(f3675(var13));
    }
    
    public static SubLObject f3756(final SubLObject var173) {
        f3757(var173, (SubLObject)$ic127$);
        return (SubLObject)ConsesLow.list((SubLObject)ZERO_INTEGER, var173);
    }
    
    public static SubLObject f3759(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic128$);
        var22 = var20.first();
        SubLObject var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic128$);
        var23 = var24.first();
        var24 = var24.rest();
        if (NIL != var24) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic128$);
            return (SubLObject)NIL;
        }
        if (NIL == var23) {
            return (SubLObject)T;
        }
        if (NIL != $g1012$.getDynamicValue(var21)) {
            return (SubLObject)NIL;
        }
        SubLObject var25 = var23;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            if (NIL == f3687(var26)) {
                return (SubLObject)NIL;
            }
            var25 = var25.rest();
            var26 = var25.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f3760(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic128$);
        var22 = var20.first();
        SubLObject var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic128$);
        var23 = var24.first();
        var24 = var24.rest();
        if (NIL == var24) {
            SubLObject var25 = Types.sublisp_null(var23);
            SubLObject var26 = (SubLObject)NIL;
            if (NIL != module0035.f1994(var23, var22, (SubLObject)UNPROVIDED)) {
                var22 = (SubLObject)ZERO_INTEGER;
            }
            while (NIL == var26 && NIL == var25) {
                final SubLObject var107_184 = ConsesLow.nth(var22, var23);
                if (NIL != f3687(var107_184)) {
                    f3696(var107_184);
                    var23 = Sequences.delete(var107_184, var23, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL == var23) {
                        var25 = (SubLObject)T;
                    }
                    else {
                        if (NIL == module0035.f1994(var23, var22, (SubLObject)UNPROVIDED)) {
                            continue;
                        }
                        var22 = (SubLObject)ZERO_INTEGER;
                    }
                }
                else {
                    var21.resetMultipleValues();
                    final SubLObject var27 = f3693(var107_184);
                    final SubLObject var28 = var21.secondMultipleValue();
                    var21.resetMultipleValues();
                    if (NIL == var28) {
                        continue;
                    }
                    var26 = var27;
                    var22 = Numbers.add(var22, (SubLObject)ONE_INTEGER);
                }
            }
            ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var20, var22);
            ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, var23);
            return Values.values(var26, var20, var25);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic128$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3761(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic128$);
        var21 = var20.first();
        SubLObject var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var20, (SubLObject)$ic128$);
        var22 = var23.first();
        var23 = var23.rest();
        if (NIL == var23) {
            SubLObject var24 = var22;
            SubLObject var25 = (SubLObject)NIL;
            var25 = var24.first();
            while (NIL != var24) {
                f3696(var25);
                var24 = var24.rest();
                var25 = var24.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic128$);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f3762(final SubLObject var20, final SubLObject var21, final SubLObject var22, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = Symbols.symbol_function((SubLObject)$ic32$);
        }
        final SubLObject var24 = (SubLObject)ConsesLow.list(var20, (SubLObject)NIL, (SubLObject)$ic129$, var21, var22, var23);
        return f3689(var24, (SubLObject)$ic130$, (SubLObject)$ic131$, (SubLObject)$ic132$);
    }
    
    public static SubLObject f3763(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic133$);
        var21 = var20.first();
        SubLObject var27 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var22 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var23 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var24 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var25 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var26 = var27.first();
        var27 = var27.rest();
        if (NIL != var27) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic133$);
            return (SubLObject)NIL;
        }
        final SubLObject var28 = var23;
        if (var28.eql((SubLObject)$ic129$)) {
            return Functions.funcall(var24, var21);
        }
        if (var28.eql((SubLObject)$ic134$)) {
            return Types.sublisp_null(var21);
        }
        Errors.warn((SubLObject)$ic135$, var23);
        return (SubLObject)T;
    }
    
    public static SubLObject f3764(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic133$);
        var22 = var20.first();
        SubLObject var28 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var20, (SubLObject)$ic133$);
        var23 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var20, (SubLObject)$ic133$);
        var24 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var20, (SubLObject)$ic133$);
        var25 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var20, (SubLObject)$ic133$);
        var26 = var28.first();
        var28 = var28.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var28, var20, (SubLObject)$ic133$);
        var27 = var28.first();
        var28 = var28.rest();
        if (NIL != var28) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic133$);
            return (SubLObject)NIL;
        }
        final SubLObject var29 = var24;
        if (var29.eql((SubLObject)$ic129$)) {
            SubLObject var30 = var22;
            SubLObject var31 = (SubLObject)NIL;
            SubLObject var32 = (SubLObject)NIL;
            SubLObject var33 = (SubLObject)NIL;
            while (NIL == var32 && NIL == var33) {
                if (NIL != Functions.funcall(var25, var30)) {
                    var33 = (SubLObject)T;
                }
                else {
                    var21.resetMultipleValues();
                    final SubLObject var34 = Functions.funcall(var26, var30);
                    final SubLObject var35 = var21.secondMultipleValue();
                    final SubLObject var36 = var21.thirdMultipleValue();
                    var21.resetMultipleValues();
                    var30 = var35;
                    if (NIL != var36) {
                        var33 = (SubLObject)T;
                    }
                    else {
                        var32 = (SubLObject)T;
                        var31 = var34;
                    }
                }
            }
            ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var20, var30);
            if (NIL != var32) {
                ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, ConsesLow.nconc(var23, (SubLObject)ConsesLow.list(var31)));
            }
            return Values.values(var31, var20, var33);
        }
        if (var29.eql((SubLObject)$ic134$)) {
            ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var20, var22.rest());
            return Values.values(var22.first(), var20);
        }
        Errors.warn((SubLObject)$ic135$, var24);
        return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)T);
    }
    
    public static SubLObject f3765(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        SubLObject var25 = (SubLObject)NIL;
        SubLObject var26 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic133$);
        var21 = var20.first();
        SubLObject var27 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var22 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var23 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var24 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var25 = var27.first();
        var27 = var27.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var27, var20, (SubLObject)$ic133$);
        var26 = var27.first();
        var27 = var27.rest();
        if (NIL != var27) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic133$);
            return (SubLObject)NIL;
        }
        final SubLObject var28 = var23;
        if (var28.eql((SubLObject)$ic129$)) {
            return Functions.funcall(var26, var21);
        }
        if (var28.eql((SubLObject)$ic134$)) {
            return (SubLObject)T;
        }
        Errors.warn((SubLObject)$ic135$, var23);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3766(final SubLObject var13) {
        return f3762(var13, (SubLObject)$ic136$, (SubLObject)$ic137$, (SubLObject)$ic138$);
    }
    
    public static SubLObject f3767(final SubLObject var20) {
        return f3687(var20);
    }
    
    public static SubLObject f3768(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        var21.resetMultipleValues();
        final SubLObject var22 = f3693(var20);
        final SubLObject var23 = var21.secondMultipleValue();
        var21.resetMultipleValues();
        return Values.values(var22, var20, (SubLObject)makeBoolean(NIL == var23));
    }
    
    public static SubLObject f3769(final SubLObject var20) {
        return f3696(var20);
    }
    
    public static SubLObject f3770(final SubLObject var116) {
        return f3762(var116, (SubLObject)$ic87$, (SubLObject)$ic85$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3771(final SubLObject var13) {
        assert NIL != f3674(var13) : var13;
        final SubLObject var14 = f3675(var13);
        final SubLObject var16;
        final SubLObject var15 = var16 = ConsesLow.nth((SubLObject)TWO_INTEGER, var14);
        if (var16.eql((SubLObject)$ic129$)) {
            f3772(var13);
            final SubLObject var17 = ConsesLow.nth((SubLObject)ONE_INTEGER, var14);
            ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var14, var17);
            ConsesLow.set_nth((SubLObject)TWO_INTEGER, var14, (SubLObject)$ic134$);
        }
        else if (var16.eql((SubLObject)$ic134$)) {
            final SubLObject var17 = ConsesLow.nth((SubLObject)ONE_INTEGER, var14);
            ConsesLow.set_nth((SubLObject)ZERO_INTEGER, var14, var17);
        }
        else {
            Errors.warn((SubLObject)$ic135$, var15);
        }
        return var13;
    }
    
    public static SubLObject f3772(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var17;
        for (SubLObject var15 = (SubLObject)NIL; NIL == var15; var15 = (SubLObject)makeBoolean(NIL == var17)) {
            var14.resetMultipleValues();
            final SubLObject var16 = f3693(var13);
            var17 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var17) {}
        }
        f3696(var13);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3773(final SubLObject var33, final SubLObject var34) {
        SubLObject var36;
        final SubLObject var35 = var36 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic139$);
        final SubLObject var37 = var36.rest();
        var36 = var36.first();
        SubLObject var38 = (SubLObject)NIL;
        SubLObject var39 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic139$);
        var38 = var36.first();
        var36 = var36.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var36, var35, (SubLObject)$ic139$);
        var39 = var36.first();
        var36 = var36.rest();
        SubLObject var40 = (SubLObject)NIL;
        SubLObject var41 = var36;
        SubLObject var42 = (SubLObject)NIL;
        SubLObject var203_204 = (SubLObject)NIL;
        while (NIL != var41) {
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic139$);
            var203_204 = var41.first();
            var41 = var41.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var41, var35, (SubLObject)$ic139$);
            if (NIL == conses_high.member(var203_204, (SubLObject)$ic140$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var42 = (SubLObject)T;
            }
            if (var203_204 == $ic41$) {
                var40 = var41.first();
            }
            var41 = var41.rest();
        }
        if (NIL != var42 && NIL == var40) {
            cdestructuring_bind.cdestructuring_bind_error(var35, (SubLObject)$ic139$);
        }
        final SubLObject var43 = cdestructuring_bind.property_list_member((SubLObject)$ic18$, var36);
        final SubLObject var44 = (SubLObject)((NIL != var43) ? conses_high.cadr(var43) : NIL);
        final SubLObject var45 = cdestructuring_bind.property_list_member((SubLObject)$ic141$, var36);
        final SubLObject var46 = (SubLObject)((NIL != var45) ? conses_high.cadr(var45) : T);
        final SubLObject var47;
        var36 = (var47 = var37);
        return (SubLObject)ConsesLow.list((SubLObject)$ic72$, (SubLObject)ConsesLow.listS((SubLObject)$ic44$, (SubLObject)ConsesLow.list(var38, var39, (SubLObject)$ic18$, var44), ConsesLow.append(var47, (SubLObject)NIL)), (SubLObject)ConsesLow.list((SubLObject)$ic50$, var46, (SubLObject)ConsesLow.list((SubLObject)$ic142$, var39)));
    }
    
    public static SubLObject f3774(final SubLObject var94, final SubLObject var13) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var98;
        for (SubLObject var96 = (SubLObject)NIL; NIL == var96; var96 = (SubLObject)makeBoolean(NIL == var98)) {
            var95.resetMultipleValues();
            final SubLObject var97 = f3693(var13);
            var98 = var95.secondMultipleValue();
            var95.resetMultipleValues();
            if (NIL != var98) {
                Functions.funcall(var94, var97);
            }
        }
        f3771(var13);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3775(final SubLObject var208) {
        final SubLObject var209 = f3776(var208);
        return (NIL != var209) ? f3689(var209, (SubLObject)$ic143$, (SubLObject)$ic144$, (SubLObject)$ic145$) : f3708();
    }
    
    public static SubLObject f3776(final SubLObject var173) {
        SubLObject var174 = (SubLObject)NIL;
        if (NIL == var174) {
            SubLObject var175 = var173;
            SubLObject var176 = (SubLObject)NIL;
            var176 = var175.first();
            while (NIL == var174 && NIL != var175) {
                if (NIL != f3687(var176)) {
                    f3771(var176);
                    var174 = f3687(var176);
                }
                var175 = var175.rest();
                var176 = var175.first();
            }
        }
        return (SubLObject)((NIL != var174) ? NIL : ConsesLow.list(Sequences.reverse(var173), (SubLObject)NIL));
    }
    
    public static SubLObject f3777(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic146$);
        var21 = var20.first();
        SubLObject var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var20, (SubLObject)$ic146$);
        var22 = var23.first();
        var23 = var23.rest();
        if (NIL == var23) {
            return f3778(var21);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3778(final SubLObject var173) {
        SubLObject var174 = (SubLObject)NIL;
        if (NIL == var174) {
            SubLObject var175 = var173;
            SubLObject var176 = (SubLObject)NIL;
            var176 = var175.first();
            while (NIL == var174 && NIL != var175) {
                if (NIL == f3687(var176)) {
                    var174 = (SubLObject)T;
                }
                var175 = var175.rest();
                var176 = var175.first();
            }
        }
        return (SubLObject)makeBoolean(NIL == var174);
    }
    
    public static SubLObject f3779(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic146$);
        var22 = var20.first();
        SubLObject var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic146$);
        var23 = var24.first();
        var24 = var24.rest();
        if (NIL != var24) {
            cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic146$);
            return (SubLObject)NIL;
        }
        if (NIL == var23) {
            var23 = (SubLObject)ConsesLow.make_list(Sequences.length(var22), (SubLObject)UNPROVIDED);
            SubLObject var25 = (SubLObject)NIL;
            SubLObject var26 = (SubLObject)NIL;
            SubLObject var27 = (SubLObject)NIL;
            var25 = var22;
            var26 = var25.first();
            for (var27 = (SubLObject)ZERO_INTEGER; NIL != var25; var25 = var25.rest(), var26 = var25.first(), var27 = Numbers.add((SubLObject)ONE_INTEGER, var27)) {
                ConsesLow.set_nth(var27, var23, f3694(var26, (SubLObject)UNPROVIDED));
            }
            ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, var23);
            return Values.values(Sequences.reverse(var23), var20, (SubLObject)NIL);
        }
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        SubLObject var30 = (SubLObject)NIL;
        SubLObject var31 = (SubLObject)NIL;
        var29 = var22;
        var30 = var29.first();
        for (var31 = (SubLObject)ZERO_INTEGER; NIL == var28 && NIL != var29; var29 = var29.rest(), var30 = var29.first(), var31 = Numbers.add((SubLObject)ONE_INTEGER, var31)) {
            if (NIL != f3687(var30)) {
                f3771(var30);
            }
            else {
                var28 = (SubLObject)T;
            }
            var21.resetMultipleValues();
            SubLObject var32 = f3693(var30);
            final SubLObject var33 = var21.secondMultipleValue();
            var21.resetMultipleValues();
            if (NIL == var33) {
                f3771(var30);
                var32 = f3694(var30, (SubLObject)UNPROVIDED);
                var28 = (SubLObject)NIL;
            }
            ConsesLow.set_nth(var31, var23, var32);
        }
        ConsesLow.set_nth((SubLObject)ONE_INTEGER, var20, var23);
        return Values.values(Sequences.reverse(var23), var20, (SubLObject)NIL);
    }
    
    public static SubLObject f3780(final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic146$);
        var21 = var20.first();
        SubLObject var23 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var23, var20, (SubLObject)$ic146$);
        var22 = var23.first();
        var23 = var23.rest();
        if (NIL == var23) {
            SubLObject var24 = var21;
            SubLObject var25 = (SubLObject)NIL;
            var25 = var24.first();
            while (NIL != var24) {
                f3696(var25);
                var24 = var24.rest();
                var25 = var24.first();
            }
            return (SubLObject)T;
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3781(final SubLObject var224, final SubLObject var225, SubLObject var226) {
        if (var226 == UNPROVIDED) {
            var226 = (SubLObject)NIL;
        }
        assert NIL != f3674(var224) : var224;
        assert NIL != Types.function_spec_p(var225) : var225;
        assert NIL != Types.listp(var226) : var226;
        return f3689(f3782(var224, var225, var226), (SubLObject)$ic93$, (SubLObject)$ic34$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3783(final SubLObject var224, final SubLObject var225, SubLObject var226, SubLObject var32) {
        if (var226 == UNPROVIDED) {
            var226 = (SubLObject)NIL;
        }
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        assert NIL != f3674(var224) : var224;
        assert NIL != Types.function_spec_p(var225) : var225;
        assert NIL != Types.listp(var226) : var226;
        return f3689(f3784(var224, var225, var226, var32), (SubLObject)$ic93$, (SubLObject)$ic35$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3785(final SubLObject var224, final SubLObject var227, SubLObject var228) {
        if (var228 == UNPROVIDED) {
            var228 = (SubLObject)NIL;
        }
        assert NIL != f3674(var224) : var224;
        assert NIL != Types.function_spec_p(var227) : var227;
        assert NIL != Types.listp(var228) : var228;
        return f3689(f3786(var224, var227, var228), (SubLObject)$ic93$, (SubLObject)$ic147$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f3782(final SubLObject var224, final SubLObject var225, final SubLObject var226) {
        return (SubLObject)ConsesLow.list(var224, var225, var226);
    }
    
    public static SubLObject f3784(final SubLObject var224, final SubLObject var225, final SubLObject var226, final SubLObject var32) {
        return (SubLObject)ConsesLow.list(var224, var225, var226, var32);
    }
    
    public static SubLObject f3786(final SubLObject var224, final SubLObject var225, final SubLObject var226) {
        return (SubLObject)ConsesLow.list(var224, var225, var226);
    }
    
    public static SubLObject f3691(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var107_231 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic148$);
        var107_231 = var20.first();
        SubLObject var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic148$);
        var22 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic148$);
        var23 = var24.first();
        var24 = var24.rest();
        if (NIL == var24) {
            SubLObject var25 = (SubLObject)NIL;
            SubLObject var26 = (SubLObject)NIL;
            SubLObject var27 = (SubLObject)NIL;
            while (NIL == var26) {
                var21.resetMultipleValues();
                final SubLObject var28 = f3693(var107_231);
                final SubLObject var29 = var21.secondMultipleValue();
                var21.resetMultipleValues();
                if (NIL != var29) {
                    if (NIL == Functions.apply(var22, var28, var23)) {
                        continue;
                    }
                    var25 = var28;
                    var26 = (SubLObject)T;
                }
                else {
                    final SubLObject var30 = (SubLObject)$ic18$;
                    ConsesLow.rplaca(var20, var30);
                    ConsesLow.rplacd(var20, (SubLObject)NIL);
                    var26 = (SubLObject)T;
                    var27 = (SubLObject)T;
                }
            }
            return Values.values(var25, var20, var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic148$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3692(final SubLObject var20) {
        SubLObject var107_236 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic149$);
        var107_236 = var20.first();
        SubLObject var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic149$);
        var21 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic149$);
        var22 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic149$);
        var23 = var24.first();
        var24 = var24.rest();
        if (NIL == var24) {
            SubLObject var25 = (SubLObject)NIL;
            SubLObject var26 = (SubLObject)NIL;
            SubLObject var27 = (SubLObject)NIL;
            while (NIL == var26) {
                final SubLObject var28 = f3694(var107_236, var23);
                final SubLObject var29 = (SubLObject)makeBoolean(!var28.eql(var23));
                if (NIL != var29) {
                    if (NIL == Functions.apply(var21, var28, var22)) {
                        continue;
                    }
                    var25 = var28;
                    var26 = (SubLObject)T;
                }
                else {
                    final SubLObject var30 = (SubLObject)$ic18$;
                    ConsesLow.rplaca(var20, var30);
                    ConsesLow.rplacd(var20, (SubLObject)NIL);
                    var26 = (SubLObject)T;
                    var27 = (SubLObject)T;
                }
            }
            return Values.values(var25, var20, var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic149$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3787(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var107_239 = (SubLObject)NIL;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic148$);
        var107_239 = var20.first();
        SubLObject var24 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic148$);
        var22 = var24.first();
        var24 = var24.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var24, var20, (SubLObject)$ic148$);
        var23 = var24.first();
        var24 = var24.rest();
        if (NIL == var24) {
            SubLObject var25 = (SubLObject)NIL;
            SubLObject var26 = (SubLObject)NIL;
            SubLObject var27 = (SubLObject)NIL;
            while (NIL == var26) {
                var21.resetMultipleValues();
                final SubLObject var28 = f3693(var107_239);
                final SubLObject var29 = var21.secondMultipleValue();
                var21.resetMultipleValues();
                if (NIL != var29) {
                    var21.resetMultipleValues();
                    final SubLObject var30 = Functions.apply(var22, var28, var23);
                    final SubLObject var31 = var21.secondMultipleValue();
                    var21.resetMultipleValues();
                    if (NIL == var31) {
                        continue;
                    }
                    var25 = var30;
                    var26 = (SubLObject)T;
                }
                else {
                    final SubLObject var32 = (SubLObject)$ic18$;
                    ConsesLow.rplaca(var20, var32);
                    ConsesLow.rplacd(var20, (SubLObject)NIL);
                    var26 = (SubLObject)T;
                    var27 = (SubLObject)T;
                }
            }
            return Values.values(var25, var20, var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic148$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3788(final SubLObject var20) {
        return Equality.eq((SubLObject)$ic18$, Sequences.elt(var20, (SubLObject)ZERO_INTEGER));
    }
    
    public static SubLObject f3789(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)NIL;
        SubLObject var19;
        for (SubLObject var17 = var15; NIL == var17; var17 = (SubLObject)makeBoolean(NIL == var19 || NIL != var15)) {
            var14.resetMultipleValues();
            final SubLObject var18 = f3693(var13);
            var19 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var19) {
                var16 = var18;
                var15 = (SubLObject)T;
            }
        }
        return var16;
    }
    
    public static SubLObject f3790(final SubLObject var13) {
        final SubLThread var14 = SubLProcess.currentSubLThread();
        final SubLObject var15 = (SubLObject)NIL;
        SubLObject var16 = (SubLObject)ZERO_INTEGER;
        SubLObject var19;
        for (SubLObject var17 = var15; NIL == var17; var17 = (SubLObject)makeBoolean(NIL == var19 || NIL != var15)) {
            var14.resetMultipleValues();
            final SubLObject var18 = f3693(var13);
            var19 = var14.secondMultipleValue();
            var14.resetMultipleValues();
            if (NIL != var19) {
                var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER);
            }
        }
        return var16;
    }
    
    public static SubLObject f3791(final SubLObject var13, final SubLObject var244, SubLObject var245) {
        if (var245 == UNPROVIDED) {
            var245 = $g1013$.getGlobalValue();
        }
        return f3689(f3792(var13, var244, var245), (SubLObject)$ic151$, (SubLObject)$ic152$, (SubLObject)$ic153$);
    }
    
    public static SubLObject f3792(final SubLObject var13, final SubLObject var244, final SubLObject var245) {
        return (SubLObject)ConsesLow.list(var13, var244, var245);
    }
    
    public static SubLObject f3793(final SubLObject var20) {
        final SubLObject var21 = var20.first();
        return f3687(var21);
    }
    
    public static SubLObject f3794(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var24 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var20, var20, (SubLObject)$ic154$);
        var22 = var20.first();
        SubLObject var25 = var20.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic154$);
        var23 = var25.first();
        var25 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var25, var20, (SubLObject)$ic154$);
        var24 = var25.first();
        var25 = var25.rest();
        if (NIL == var25) {
            var21.resetMultipleValues();
            SubLObject var26 = f3693(var22);
            final SubLObject var27 = var21.secondMultipleValue();
            var21.resetMultipleValues();
            if (NIL != var27) {
                if ($g1013$.getGlobalValue().eql(var24)) {
                    var26 = Functions.funcall(var23, var26);
                }
                else {
                    var26 = Functions.funcall(var23, var26, var24);
                }
            }
            return Values.values(var26, var20, (SubLObject)makeBoolean(NIL == var27));
        }
        cdestructuring_bind.cdestructuring_bind_error(var20, (SubLObject)$ic154$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3795(final SubLObject var115) {
        return (SubLObject)makeBoolean(NIL != f3674(var115) && f3677(var115) == $ic155$);
    }
    
    public static SubLObject f3796(final SubLObject var248) {
        assert NIL != f3795(var248) : var248;
        final SubLObject var249 = f3675(var248);
        return module0590.f36021(var249);
    }
    
    public static SubLObject f3797() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3672", "S#5106", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3674", "S#5091", 1, 0, false);
        new $f3674$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3675", "S#5107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3676", "S#5108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3677", "S#5109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3678", "S#5110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3679", "S#5111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3680", "S#5112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3681", "S#5113", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3682", "S#5114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3683", "S#5115", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3684", "S#5116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3685", "S#5117", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3673", "S#5118", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3689", "S#5119", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3687", "S#5120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3690", "S#5121", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3693", "S#5122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3694", "S#5123", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3695", "S#5124", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3696", "S#5125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3688", "S#5126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3697", "S#5127", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3698", "S#5128", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0052", "f3699", "S#5129");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0052", "f3700", "DO-ITERATOR-WITHOUT-VALUES-PROGRESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0052", "f3701", "S#5130");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0052", "f3702", "S#5131");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0052", "f3703", "S#5132");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3704", "S#5133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3705", "S#5134", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3706", "S#5135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3707", "S#5136", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3708", "S#5137", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3710", "S#5138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3711", "S#5093", 1, 0, false);
        new $f3711$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3712", "S#5139", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3713", "S#5140", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3714", "S#5141", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3715", "S#5094", 1, 0, false);
        new $f3715$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3716", "S#5142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3717", "S#5143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3709", "S#2969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3719", "S#5144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3720", "S#5145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3718", "S#5146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3721", "S#5095", 1, 0, false);
        new $f3721$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3722", "S#5096", 1, 0, false);
        new $f3722$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3723", "S#5147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3725", "S#5148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3726", "S#2883", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3727", "S#5149", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3728", "S#5097", 1, 0, false);
        new $f3728$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3729", "S#5150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3730", "S#5151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3731", "S#5152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3732", "S#5153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3734", "S#5154", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3733", "S#5155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3735", "S#5156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3736", "S#5157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3737", "S#5158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3686", "S#5159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3738", "S#5160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3739", "S#5161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3740", "S#5162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3741", "S#5163", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3724", "S#5164", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3742", "S#5165", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3743", "S#5166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3744", "S#5167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3745", "S#5168", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3746", "S#5169", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3747", "S#5170", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3748", "S#5171", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3749", "S#5172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3751", "S#5173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3750", "S#5174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3752", "S#5098", 1, 0, false);
        new $f3752$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3753", "S#5099", 1, 0, false);
        new $f3753$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3754", "S#5175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3755", "S#5176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3757", "S#5177", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3758", "S#5178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3756", "S#5179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3759", "S#5180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3760", "S#5181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3761", "S#5182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3762", "S#5183", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3763", "S#5100", 1, 0, false);
        new $f3763$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3764", "S#5101", 1, 0, false);
        new $f3764$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3765", "S#5184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3766", "S#5185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3767", "S#5186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3768", "S#5187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3769", "S#5188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3770", "S#5189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3771", "S#5190", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3772", "S#5191", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0052", "f3773", "S#5192");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3774", "S#5193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3775", "S#5194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3776", "S#5195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3777", "S#5102", 1, 0, false);
        new $f3777$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3778", "S#5196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3779", "S#5103", 1, 0, false);
        new $f3779$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3780", "S#5197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3781", "S#2882", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3783", "S#5198", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3785", "S#5199", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3782", "S#5200", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3784", "S#5201", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3786", "S#5202", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3691", "S#5203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3692", "S#5204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3787", "S#5205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3788", "S#5104", 1, 0, false);
        new $f3788$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3789", "S#5206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3790", "S#5207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3791", "S#5208", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3792", "S#5209", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3793", "S#5210", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3794", "S#5211", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3795", "S#5212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0052", "f3796", "S#5213", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3798() {
        $g1011$ = SubLFiles.defconstant("S#5214", (SubLObject)$ic0$);
        $g1012$ = SubLFiles.defparameter("S#5215", (SubLObject)NIL);
        $g1013$ = SubLFiles.defconstant("S#5216", Symbols.make_symbol((SubLObject)$ic150$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3799() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1011$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1011$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        module0002.f50((SubLObject)$ic36$, (SubLObject)$ic37$);
        module0002.f50((SubLObject)$ic37$, (SubLObject)$ic62$);
        module0012.f419((SubLObject)$ic151$);
        module0012.f419((SubLObject)$ic152$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f3797();
    }
    
    public void initializeVariables() {
        f3798();
    }
    
    public void runTopLevelForms() {
        f3799();
    }
    
    static {
        me = (SubLFile)new module0052();
        $g1011$ = null;
        $g1012$ = null;
        $g1013$ = null;
        $ic0$ = makeSymbol("S#5090", "CYC");
        $ic1$ = makeSymbol("S#5091", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#3266", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#5217", "CYC"), (SubLObject)makeSymbol("S#5218", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("STATE"), (SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("NEXT"), (SubLObject)makeKeyword("FINALIZE"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#5107", "CYC"), (SubLObject)makeSymbol("S#5108", "CYC"), (SubLObject)makeSymbol("S#5109", "CYC"), (SubLObject)makeSymbol("S#5110", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#5111", "CYC"), (SubLObject)makeSymbol("S#5112", "CYC"), (SubLObject)makeSymbol("S#5113", "CYC"), (SubLObject)makeSymbol("S#5114", "CYC"));
        $ic6$ = makeSymbol("S#5118", "CYC");
        $ic7$ = makeSymbol("S#5106", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5091", "CYC"));
        $ic9$ = makeSymbol("S#5107", "CYC");
        $ic10$ = makeSymbol("S#5111", "CYC");
        $ic11$ = makeSymbol("S#5108", "CYC");
        $ic12$ = makeSymbol("S#5112", "CYC");
        $ic13$ = makeSymbol("S#5109", "CYC");
        $ic14$ = makeSymbol("S#5113", "CYC");
        $ic15$ = makeSymbol("S#5110", "CYC");
        $ic16$ = makeSymbol("S#5114", "CYC");
        $ic17$ = makeKeyword("STATE");
        $ic18$ = makeKeyword("DONE");
        $ic19$ = makeKeyword("NEXT");
        $ic20$ = makeKeyword("FINALIZE");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#5115", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#5117", "CYC");
        $ic27$ = makeString("#<");
        $ic28$ = makeKeyword("STREAM");
        $ic29$ = makeString(" DONE ");
        $ic30$ = makeString(" ");
        $ic31$ = makeKeyword("BASE");
        $ic32$ = makeSymbol("TRUE");
        $ic33$ = makeSymbol("S#5092", "CYC");
        $ic34$ = makeSymbol("S#5203", "CYC");
        $ic35$ = makeSymbol("S#5204", "CYC");
        $ic36$ = makeSymbol("S#5124", "CYC");
        $ic37$ = makeSymbol("S#5131", "CYC");
        $ic38$ = makeString("-NEXT");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic40$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic41$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic42$ = makeUninternedSymbol("US#243071");
        $ic43$ = makeSymbol("CLET");
        $ic44$ = makeSymbol("S#5129", "CYC");
        $ic45$ = makeUninternedSymbol("US#50BA606");
        $ic46$ = makeUninternedSymbol("US#10692D9");
        $ic47$ = makeSymbol("UNTIL");
        $ic48$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic49$ = makeSymbol("S#5122", "CYC");
        $ic50$ = makeSymbol("PWHEN");
        $ic51$ = makeSymbol("CSETQ");
        $ic52$ = makeSymbol("COR");
        $ic53$ = makeSymbol("CNOT");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#5219", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#130", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic55$ = ConsesLow.list((SubLObject)makeKeyword("INVALID-TOKEN"), (SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("PROGRESS-MESSAGE"));
        $ic56$ = makeKeyword("INVALID-TOKEN");
        $ic57$ = makeKeyword("PROGRESS-MESSAGE");
        $ic58$ = makeSymbol("NOTING-PROGRESS");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("NOTE-PROGRESS"));
        $ic60$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#5219", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic61$ = ConsesLow.list((SubLObject)makeKeyword("INVALID-TOKEN"), (SubLObject)makeKeyword("DONE"));
        $ic62$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#5130", "CYC"), makeSymbol("S#5220", "CYC"), makeSymbol("DO-ITERATOR-WITHOUT-VALUES-PROGRESS"), makeSymbol("DO-GAF-ARG-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("S#5221", "CYC"), makeSymbol("S#5222", "CYC"), makeSymbol("DO-PREDICATE-RULE-INDEX"), makeSymbol("S#5223", "CYC"), makeSymbol("S#5224", "CYC"), makeSymbol("S#5225", "CYC"), makeSymbol("S#5226", "CYC"), makeSymbol("S#5227", "CYC"), makeSymbol("S#5228", "CYC"), makeSymbol("S#5229", "CYC"), makeSymbol("S#5230", "CYC"), makeSymbol("S#5231", "CYC"), makeSymbol("DO-TERM-INDEX") });
        $ic63$ = makeUninternedSymbol("US#243071");
        $ic64$ = makeUninternedSymbol("US#50BA606");
        $ic65$ = makeUninternedSymbol("US#5FDC504");
        $ic66$ = makeUninternedSymbol("US#10692D9");
        $ic67$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#770", "CYC"), (SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic68$ = makeUninternedSymbol("US#33E32D8");
        $ic69$ = makeUninternedSymbol("US#6C592DF");
        $ic70$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic71$ = makeSymbol(">=");
        $ic72$ = makeSymbol("PROGN");
        $ic73$ = makeSymbol("CINC");
        $ic74$ = ConsesLow.list((SubLObject)T);
        $ic75$ = makeSymbol("COPY-TREE");
        $ic76$ = makeSymbol("FUNCTION-SPEC-P");
        $ic77$ = makeSymbol("FALSE");
        $ic78$ = makeSymbol("NULL");
        $ic79$ = makeSymbol("S#5093", "CYC");
        $ic80$ = makeSymbol("INTEGERP");
        $ic81$ = makeSymbol("NUMBERP");
        $ic82$ = makeSymbol("S#5094", "CYC");
        $ic83$ = makeSymbol("S#5142", "CYC");
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("S#126", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic85$ = makeSymbol("S#5096", "CYC");
        $ic86$ = makeSymbol("LISTP");
        $ic87$ = makeSymbol("S#5095", "CYC");
        $ic88$ = makeSymbol("S#5143", "CYC");
        $ic89$ = makeSymbol("S#3593", "CYC");
        $ic90$ = makeSymbol("S#5148", "CYC");
        $ic91$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("CAR"), (SubLObject)makeSymbol("CDR"));
        $ic92$ = makeSymbol("VECTORP");
        $ic93$ = makeSymbol("S#5104", "CYC");
        $ic94$ = makeSymbol("S#5097", "CYC");
        $ic95$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("VECTOR"));
        $ic96$ = makeKeyword("UNINITIALIZED");
        $ic97$ = makeSymbol("S#5152", "CYC");
        $ic98$ = makeSymbol("HASH-TABLE-P");
        $ic99$ = makeSymbol("S#5156", "CYC");
        $ic100$ = makeSymbol("S#5157", "CYC");
        $ic101$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("HASH-TABLE"));
        $ic102$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#5233", "CYC"), (SubLObject)makeSymbol("S#5234", "CYC"));
        $ic103$ = makeSymbol("S#5162", "CYC");
        $ic104$ = makeSymbol("S#5163", "CYC");
        $ic105$ = ConsesLow.list((SubLObject)makeSymbol("S#5235", "CYC"), (SubLObject)makeSymbol("S#4499", "CYC"), (SubLObject)makeSymbol("S#5236", "CYC"));
        $ic106$ = makeString("~A is not a well formed uninitialized lazy iterator");
        $ic107$ = makeSymbol("S#5237", "CYC");
        $ic108$ = makeSymbol("CONSP");
        $ic109$ = makeSymbol("S#5167", "CYC");
        $ic110$ = makeSymbol("S#5166", "CYC");
        $ic111$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("TRANSFORM"));
        $ic112$ = makeSymbol("S#5171", "CYC");
        $ic113$ = makeSymbol("S#5170", "CYC");
        $ic114$ = makeKeyword("START");
        $ic115$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("S#4785", "CYC"), (SubLObject)makeSymbol("S#5238", "CYC"), (SubLObject)makeSymbol("S#1625", "CYC"));
        $ic116$ = makeKeyword("CONSTRUCT");
        $ic117$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#5239", "CYC"), (SubLObject)makeSymbol("S#5240", "CYC"));
        $ic118$ = makeKeyword("SUBITERATE");
        $ic119$ = makeSymbol("S#5098", "CYC");
        $ic120$ = makeSymbol("S#5099", "CYC");
        $ic121$ = makeSymbol("S#5175", "CYC");
        $ic122$ = makeSymbol("S#5180", "CYC");
        $ic123$ = makeSymbol("S#5181", "CYC");
        $ic124$ = makeSymbol("S#5182", "CYC");
        $ic125$ = makeString("");
        $ic126$ = makeString("invalid lazy iterator found in meta-iterator ~A ~A");
        $ic127$ = makeString("in make-rotating-iterator-iterator-state");
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("S#134", "CYC"), (SubLObject)makeSymbol("S#5241", "CYC"));
        $ic129$ = makeKeyword("INITIAL");
        $ic130$ = makeSymbol("S#5100", "CYC");
        $ic131$ = makeSymbol("S#5101", "CYC");
        $ic132$ = makeSymbol("S#5184", "CYC");
        $ic133$ = ConsesLow.list((SubLObject)makeSymbol("S#5242", "CYC"), (SubLObject)makeSymbol("S#5243", "CYC"), (SubLObject)makeSymbol("S#4785", "CYC"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)makeSymbol("S#5217", "CYC"), (SubLObject)makeSymbol("S#5218", "CYC"));
        $ic134$ = makeKeyword("REUSE");
        $ic135$ = makeString("Unknown mode: ~a.");
        $ic136$ = makeSymbol("S#5186", "CYC");
        $ic137$ = makeSymbol("S#5187", "CYC");
        $ic138$ = makeSymbol("S#5188", "CYC");
        $ic139$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5244", "CYC"), (SubLObject)T)), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic140$ = ConsesLow.list((SubLObject)makeKeyword("DONE"), (SubLObject)makeKeyword("RESET"));
        $ic141$ = makeKeyword("RESET");
        $ic142$ = makeSymbol("S#5190", "CYC");
        $ic143$ = makeSymbol("S#5102", "CYC");
        $ic144$ = makeSymbol("S#5103", "CYC");
        $ic145$ = makeSymbol("S#5197", "CYC");
        $ic146$ = ConsesLow.list((SubLObject)makeSymbol("S#5245", "CYC"), (SubLObject)makeSymbol("S#5246", "CYC"));
        $ic147$ = makeSymbol("S#5205", "CYC");
        $ic148$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("S#5247", "CYC"), (SubLObject)makeSymbol("S#5248", "CYC"));
        $ic149$ = ConsesLow.list((SubLObject)makeSymbol("S#5232", "CYC"), (SubLObject)makeSymbol("S#5247", "CYC"), (SubLObject)makeSymbol("S#5248", "CYC"), (SubLObject)makeSymbol("S#5219", "CYC"));
        $ic150$ = makeString("DO NOT PASS");
        $ic151$ = makeSymbol("S#5210", "CYC");
        $ic152$ = makeSymbol("S#5211", "CYC");
        $ic153$ = makeSymbol("S#5249", "CYC");
        $ic154$ = ConsesLow.list((SubLObject)makeSymbol("S#5090", "CYC"), (SubLObject)makeSymbol("S#5250", "CYC"), (SubLObject)makeSymbol("S#5251", "CYC"));
        $ic155$ = makeSymbol("S#5252", "CYC");
        $ic156$ = makeSymbol("S#5212", "CYC");
    }
    
    public static final class $sX5090_native extends SubLStructNative
    {
        public SubLObject $state;
        public SubLObject $done;
        public SubLObject $next;
        public SubLObject $finalize;
        public static final SubLStructDeclNative structDecl;
        
        public $sX5090_native() {
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$done = (SubLObject)CommonSymbols.NIL;
            this.$next = (SubLObject)CommonSymbols.NIL;
            this.$finalize = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5090_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$state;
        }
        
        public SubLObject getField3() {
            return this.$done;
        }
        
        public SubLObject getField4() {
            return this.$next;
        }
        
        public SubLObject getField5() {
            return this.$finalize;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$done = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$next = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$finalize = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5090_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$state", "$done", "$next", "$finalize" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f3674$UnaryFunction extends UnaryFunction
    {
        public $f3674$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5091"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3674(var3);
        }
    }
    
    public static final class $f3711$UnaryFunction extends UnaryFunction
    {
        public $f3711$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5093"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3711(var3);
        }
    }
    
    public static final class $f3715$UnaryFunction extends UnaryFunction
    {
        public $f3715$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5094"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3715(var3);
        }
    }
    
    public static final class $f3721$UnaryFunction extends UnaryFunction
    {
        public $f3721$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5095"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3721(var3);
        }
    }
    
    public static final class $f3722$UnaryFunction extends UnaryFunction
    {
        public $f3722$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5096"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3722(var3);
        }
    }
    
    public static final class $f3728$UnaryFunction extends UnaryFunction
    {
        public $f3728$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5097"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3728(var3);
        }
    }
    
    public static final class $f3752$UnaryFunction extends UnaryFunction
    {
        public $f3752$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5098"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3752(var3);
        }
    }
    
    public static final class $f3753$UnaryFunction extends UnaryFunction
    {
        public $f3753$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5099"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3753(var3);
        }
    }
    
    public static final class $f3763$UnaryFunction extends UnaryFunction
    {
        public $f3763$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5100"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3763(var3);
        }
    }
    
    public static final class $f3764$UnaryFunction extends UnaryFunction
    {
        public $f3764$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5101"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3764(var3);
        }
    }
    
    public static final class $f3777$UnaryFunction extends UnaryFunction
    {
        public $f3777$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5102"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3777(var3);
        }
    }
    
    public static final class $f3779$UnaryFunction extends UnaryFunction
    {
        public $f3779$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5103"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3779(var3);
        }
    }
    
    public static final class $f3788$UnaryFunction extends UnaryFunction
    {
        public $f3788$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5104"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3788(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 547 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/