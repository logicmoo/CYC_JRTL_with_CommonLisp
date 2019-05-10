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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
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

public final class module0053 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0053";
    public static final String myFingerPrint = "6ab59b4a2a434ac6c1ce669e5f790d4a081173115204406d25b857423c0b0845";
    public static SubLSymbol $g1014$;
    private static SubLSymbol $g1015$;
    private static SubLSymbol $g1016$;
    private static SubLSymbol $g1017$;
    private static SubLSymbol $g1018$;
    private static SubLSymbol $g1019$;
    private static SubLSymbol $g1020$;
    private static SubLSymbol $g1021$;
    private static SubLSymbol $g1022$;
    private static SubLSymbol $g1023$;
    private static SubLSymbol $g1024$;
    private static SubLSymbol $g1025$;
    public static SubLSymbol $g1026$;
    private static SubLSymbol $g1027$;
    public static SubLSymbol $g1028$;
    public static SubLSymbol $g1029$;
    private static SubLSymbol $g1030$;
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
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLList $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLList $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLList $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLList $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLInteger $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLInteger $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLList $ic82$;
    private static final SubLList $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLInteger $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLInteger $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLList $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLList $ic122$;
    private static final SubLList $ic123$;
    private static final SubLList $ic124$;
    private static final SubLList $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLInteger $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    
    public static SubLObject f3800(final SubLObject var1, final SubLObject var2) {
        f3801(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3802(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5253_native.class) ? T : NIL);
    }
    
    public static SubLObject f3803(final SubLObject var1) {
        assert NIL != f3802(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3804(final SubLObject var1) {
        assert NIL != f3802(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3805(final SubLObject var1) {
        assert NIL != f3802(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3806(final SubLObject var1) {
        assert NIL != f3802(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f3807(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3802(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3808(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3802(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3809(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3802(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3810(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3802(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f3811(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5253_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic17$)) {
                f3807(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f3808(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f3809(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f3810(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3812(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic17$, f3803(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic18$, f3804(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic19$, f3805(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic20$, f3806(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f3813(final SubLObject var11, final SubLObject var12) {
        return f3812(var11, var12);
    }
    
    public static SubLObject f3801(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLObject var15 = f3806(var13);
        final SubLObject var16 = f3805(var13);
        if (var14.numE((SubLObject)ZERO_INTEGER)) {
            print_high.princ((SubLObject)$ic27$, var2);
            if (NIL != var16) {
                f3801(var16, var2, (SubLObject)ONE_INTEGER);
            }
            else {
                print_high.princ((SubLObject)$ic28$, var2);
            }
            print_high.princ((SubLObject)$ic29$, var2);
            print_high.prin1(f3803(var13), var2);
            print_high.princ((SubLObject)$ic29$, var2);
            if (NIL != var15) {
                f3801(var15, var2, (SubLObject)ONE_INTEGER);
            }
            else {
                print_high.princ((SubLObject)$ic28$, var2);
            }
            print_high.princ((SubLObject)$ic30$, var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic31$, f3803(var13));
        }
        return var13;
    }
    
    public static SubLObject f3814() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)NIL;
        final SubLObject var19 = Storage.$current_area$.currentBinding(var17);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var17);
            var18 = f3811((SubLObject)UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f3815(final SubLObject var19) {
        f3807(var19, (SubLObject)NIL);
        f3808(var19, (SubLObject)NIL);
        f3809(var19, (SubLObject)NIL);
        f3810(var19, (SubLObject)NIL);
        return var19;
    }
    
    public static SubLObject f3816(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f3802(var13) && f3804(var13) == $ic33$);
    }
    
    public static SubLObject f3817(SubLObject var13) {
        assert NIL != f3802(var13) : var13;
        if (NIL == f3816(var13)) {
            var13 = f3815(var13);
            f3808(var13, (SubLObject)$ic33$);
            if (NIL != module0012.$g63$.getGlobalValue()) {
                final SubLObject var14 = $g1016$.getGlobalValue();
                SubLObject var15 = (SubLObject)NIL;
                try {
                    var15 = Locks.seize_lock(var14);
                    f3807(var13, $g1015$.getGlobalValue());
                    $g1015$.setGlobalValue(var13);
                }
                finally {
                    if (NIL != var15) {
                        Locks.release_lock(var14);
                    }
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3818() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (NIL != module0012.$g63$.getGlobalValue()) {
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            final SubLObject var20 = $g1016$.getGlobalValue();
            SubLObject var21 = (SubLObject)NIL;
            try {
                var21 = Locks.seize_lock(var20);
                var18 = $g1015$.getGlobalValue();
                while (NIL == var19 && NIL != var18) {
                    if (NIL != f3816(var18)) {
                        $g1015$.setGlobalValue(f3803(var18));
                        var19 = (SubLObject)T;
                    }
                    else {
                        var18 = f3803(var18);
                    }
                }
                if (NIL == var19) {
                    if (NIL != module0012.$g64$.getDynamicValue(var17)) {
                        var18 = f3814();
                    }
                    else {
                        var18 = f3811((SubLObject)UNPROVIDED);
                    }
                    $g1015$.setGlobalValue((SubLObject)NIL);
                }
            }
            finally {
                if (NIL != var21) {
                    Locks.release_lock(var20);
                }
            }
            return f3815(var18);
        }
        if (NIL != module0012.$g64$.getDynamicValue(var17)) {
            return f3815(f3814());
        }
        return f3815(f3811((SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f3819(final SubLObject var19) {
        if (NIL != f3802(var19)) {
            f3819(f3805(var19));
            f3819(f3806(var19));
            final SubLObject var20 = f3804(var19);
            if (NIL != f3802(var20)) {
                f3819(var20);
            }
            f3817(var19);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3820(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic34$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        SubLObject var33 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic34$);
        var31 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic34$);
        var32 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic34$);
        var33 = var29.first();
        var29 = var29.rest();
        SubLObject var34 = (SubLObject)NIL;
        SubLObject var35 = var29;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var36_37 = (SubLObject)NIL;
        while (NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var28, (SubLObject)$ic34$);
            var36_37 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var28, (SubLObject)$ic34$);
            if (NIL == conses_high.member(var36_37, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var36 = (SubLObject)T;
            }
            if (var36_37 == $ic36$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (NIL != var36 && NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic34$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var29);
        final SubLObject var38 = (SubLObject)((NIL != var37) ? conses_high.cadr(var37) : NIL);
        final SubLObject var39;
        var29 = (var39 = var30);
        final SubLObject var40 = (SubLObject)$ic38$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic39$, (SubLObject)ConsesLow.list(var40, var33, (SubLObject)$ic37$, var38), (SubLObject)ConsesLow.listS((SubLObject)$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)$ic41$, var40)), (SubLObject)ConsesLow.list(var32, (SubLObject)ConsesLow.list((SubLObject)$ic42$, var40))), ConsesLow.append(var39, (SubLObject)NIL)));
    }
    
    public static SubLObject f3821(final SubLObject var19) {
        return f3803(var19);
    }
    
    public static SubLObject f3822(final SubLObject var19) {
        return f3804(var19);
    }
    
    public static SubLObject f3823(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic44$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic44$);
        var31 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic44$);
        var32 = var29.first();
        var29 = var29.rest();
        SubLObject var33 = (SubLObject)NIL;
        SubLObject var34 = var29;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var49_50 = (SubLObject)NIL;
        while (NIL != var34) {
            cdestructuring_bind.destructuring_bind_must_consp(var34, var28, (SubLObject)$ic44$);
            var49_50 = var34.first();
            var34 = var34.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var34, var28, (SubLObject)$ic44$);
            if (NIL == conses_high.member(var49_50, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var35 = (SubLObject)T;
            }
            if (var49_50 == $ic36$) {
                var33 = var34.first();
            }
            var34 = var34.rest();
        }
        if (NIL != var35 && NIL == var33) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic44$);
        }
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic37$, var29);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
        final SubLObject var38;
        var29 = (var38 = var30);
        final SubLObject var39 = (SubLObject)$ic45$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.list(reader.bq_cons(var39, (SubLObject)$ic46$), (SubLObject)ConsesLow.list(var31, var32)), (SubLObject)ConsesLow.listS((SubLObject)$ic47$, (SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)((NIL != var37) ? ConsesLow.list((SubLObject)$ic48$, var37, (SubLObject)ConsesLow.list((SubLObject)$ic49$, var31)) : ConsesLow.list((SubLObject)$ic49$, var31)), (SubLObject)ConsesLow.listS((SubLObject)$ic50$, var39, (SubLObject)$ic51$)), ConsesLow.append(var38, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, var31)), (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.list((SubLObject)$ic55$, var31))), (SubLObject)ConsesLow.list((SubLObject)$ic56$, (SubLObject)ConsesLow.list((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)$ic57$, (SubLObject)$ic54$, (SubLObject)ConsesLow.list((SubLObject)$ic58$, (SubLObject)$ic54$, var39)), (SubLObject)ConsesLow.listS((SubLObject)$ic50$, var31, (SubLObject)$ic59$)), (SubLObject)ConsesLow.list((SubLObject)$ic54$, (SubLObject)ConsesLow.listS((SubLObject)$ic50$, var31, (SubLObject)$ic60$)), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var31, (SubLObject)ConsesLow.list((SubLObject)$ic61$, var39)), (SubLObject)ConsesLow.list((SubLObject)$ic62$, var39))))))));
    }
    
    public static SubLObject f3824(final SubLObject var19) {
        return f3805(var19);
    }
    
    public static SubLObject f3825(final SubLObject var19) {
        return f3806(var19);
    }
    
    public static SubLObject f3826(final SubLObject var53, final SubLObject var54, final SubLObject var19, final SubLObject var55, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (NIL != $g1017$.getDynamicValue(var57) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var57) && NIL == f3827(var19, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic63$, var19);
        }
        var57.resetMultipleValues();
        final SubLObject var58 = f3828(var54, var19, var55, (SubLObject)T);
        final SubLObject var59 = var57.secondMultipleValue();
        var57.resetMultipleValues();
        f3808(var58, (SubLObject)((NIL != var56) ? Functions.funcall(var56, var53, f3804(var58)) : NIL));
        final SubLObject var60 = (NIL != var19) ? var19 : var58;
        if (NIL != $g1017$.getDynamicValue(var57) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var57) && NIL == f3827(var60, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic64$, var60);
        }
        return var60;
    }
    
    public static SubLObject f3829(final SubLObject var53, final SubLObject var54, final SubLObject var19, final SubLObject var55, final SubLObject var60, SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = Symbols.symbol_function((SubLObject)$ic49$);
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL != $g1017$.getDynamicValue(var62) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && NIL == f3827(var19, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic65$, var19);
        }
        var62.resetMultipleValues();
        final SubLObject var63 = f3828(var54, var19, var55, (SubLObject)UNPROVIDED);
        final SubLObject var64 = var62.secondMultipleValue();
        var62.resetMultipleValues();
        SubLObject var65 = var19;
        if (NIL != f3802(var63)) {
            f3808(var63, Functions.funcall(var60, var53, f3804(var63)));
            if (NIL != Functions.funcall(var61, f3804(var63))) {
                var65 = f3830(var63, var64, var19, var55);
            }
        }
        if (NIL != $g1017$.getDynamicValue(var62) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && NIL == f3827(var65, var55, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            Errors.error((SubLObject)$ic66$, var65);
        }
        return var65;
    }
    
    public static SubLObject f3831(final SubLObject var54, final SubLObject var19, final SubLObject var55) {
        return Values.values(f3828(var54, var19, var55, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f3832(final SubLObject var19) {
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        var20 = (SubLObject)NIL;
        for (var21 = var19; NIL != var21; var21 = f3805(var21)) {
            var20 = var21;
        }
        return var20;
    }
    
    public static SubLObject f3833(final SubLObject var19) {
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = (SubLObject)NIL;
        var20 = (SubLObject)NIL;
        for (var21 = var19; NIL != var21; var21 = f3806(var21)) {
            var20 = var21;
        }
        return var20;
    }
    
    public static SubLObject f3834(final SubLObject var63, final SubLObject var19, SubLObject var64, SubLObject var31) {
        if (var64 == UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)$ic67$);
        }
        if (var31 == UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (NIL != f3802(var19)) {
            if (NIL != Functions.funcall(var64, Functions.funcall(var31, var19))) {
                Functions.funcall(var63, Functions.funcall(var31, var19));
            }
            f3834(var63, f3805(var19), var64, var31);
            f3834(var63, f3806(var19), var64, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3835(final SubLObject var63, final SubLObject var19, SubLObject var64, SubLObject var31) {
        if (var64 == UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)$ic67$);
        }
        if (var31 == UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (NIL != f3802(var19)) {
            f3835(var63, f3805(var19), var64, var31);
            if (NIL != Functions.funcall(var64, Functions.funcall(var31, var19))) {
                Functions.funcall(var63, Functions.funcall(var31, var19));
            }
            f3835(var63, f3806(var19), var64, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3836(final SubLObject var63, final SubLObject var19, SubLObject var64, SubLObject var31) {
        if (var64 == UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)$ic67$);
        }
        if (var31 == UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (NIL != f3802(var19)) {
            f3836(var63, f3806(var19), var64, var31);
            if (NIL != Functions.funcall(var64, Functions.funcall(var31, var19))) {
                Functions.funcall(var63, Functions.funcall(var31, var19));
            }
            f3836(var63, f3805(var19), var64, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3837(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        $g1018$.setDynamicValue((SubLObject)ConsesLow.cons(f3803(var19), $g1018$.getDynamicValue(var20)), var20);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3838(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = $g1018$.currentBinding(var20);
        try {
            $g1018$.bind((SubLObject)NIL, var20);
            f3834(Symbols.symbol_function((SubLObject)$ic68$), var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var21 = Sequences.nreverse($g1018$.getDynamicValue(var20));
        }
        finally {
            $g1018$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f3839(final SubLObject var19) {
        if (NIL == var19) {
            return (SubLObject)ZERO_INTEGER;
        }
        return Numbers.add((SubLObject)ONE_INTEGER, f3839(f3805(var19)), f3839(f3806(var19)));
    }
    
    public static SubLObject f3840(final SubLObject var19) {
        if (NIL == var19) {
            return (SubLObject)ZERO_INTEGER;
        }
        return Numbers.add((SubLObject)ONE_INTEGER, Numbers.max(f3840(f3805(var19)), f3840(f3806(var19))));
    }
    
    public static SubLObject f3841(final SubLObject var19) {
        if (NIL == var19) {
            return (SubLObject)ZERO_INTEGER;
        }
        return Numbers.add((SubLObject)ONE_INTEGER, Numbers.min(f3841(f3805(var19)), f3841(f3806(var19))));
    }
    
    public static SubLObject f3827(final SubLObject var19, final SubLObject var55, SubLObject var65, SubLObject var66) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var66 == UNPROVIDED) {
            var66 = (SubLObject)NIL;
        }
        if (NIL == var19) {
            return (SubLObject)T;
        }
        final SubLObject var67 = f3803(var19);
        return (SubLObject)makeBoolean((NIL == var65 || NIL != Functions.funcall(var55, var67, var65)) && (NIL == var66 || NIL != Functions.funcall(var55, var66, var67)) && NIL != f3827(f3805(var19), var55, var67, var66) && NIL != f3827(f3806(var19), var55, var65, var67));
    }
    
    public static SubLObject f3842(final SubLObject var67, final SubLObject var68, final SubLObject var69) {
        return (SubLObject)makeBoolean(NIL == Functions.funcall(var67, var68, var69) && NIL == Functions.funcall(var67, var69, var68));
    }
    
    public static SubLObject f3828(final SubLObject var54, final SubLObject var19, final SubLObject var55, SubLObject var70) {
        if (var70 == UNPROVIDED) {
            var70 = (SubLObject)NIL;
        }
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        var71 = (SubLObject)NIL;
        for (var72 = var19; NIL != var72 && NIL == f3842(var55, var54, f3803(var72)); var72 = ((NIL != Functions.funcall(var55, var54, f3803(var72))) ? f3805(var72) : f3806(var72))) {
            var71 = var72;
        }
        if (NIL == var72 && NIL != var70) {
            final SubLObject var73 = f3818();
            f3807(var73, var54);
            if (NIL != var71) {
                f3843(var73, var71, var55);
            }
            var72 = var73;
        }
        return Values.values(var72, var71);
    }
    
    public static SubLObject f3843(final SubLObject var71, final SubLObject var72, final SubLObject var55) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        if (NIL != Functions.funcall(var55, f3803(var72), f3803(var71))) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var73) && NIL != f3806(var72)) {
                Errors.error((SubLObject)$ic69$, f3806(var72), var71, var72);
            }
            f3810(var72, var71);
        }
        else {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var73) && NIL != f3805(var72)) {
                Errors.error((SubLObject)$ic69$, f3805(var72), var71, var72);
            }
            f3809(var72, var71);
        }
        return var72;
    }
    
    public static SubLObject f3830(final SubLObject var57, final SubLObject var58, final SubLObject var73, final SubLObject var55) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        final SubLObject var75 = f3805(var57);
        final SubLObject var76 = f3806(var57);
        SubLObject var77 = (SubLObject)NIL;
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = var73;
        SubLObject var80 = (SubLObject)NIL;
        SubLObject var81 = (SubLObject)NIL;
        if (NIL != var75 && NIL != var76) {
            final SubLObject var82 = random.random((SubLObject)TWO_INTEGER);
            var77 = (var82.numE((SubLObject)ZERO_INTEGER) ? var75 : var76);
            var78 = (var82.numE((SubLObject)ZERO_INTEGER) ? var76 : var75);
        }
        else {
            var77 = (SubLObject)((NIL != var75) ? var75 : ((NIL != var76) ? var76 : NIL));
        }
        if (NIL != $g1019$.getDynamicValue(var74)) {
            var80 = f3838(var79);
        }
        if (NIL != var78) {
            f3844(var78, var77, var55);
        }
        if (NIL != var58) {
            if (f3805(var58).eql(var57)) {
                f3809(var58, var77);
            }
            else {
                f3810(var58, var77);
            }
        }
        else {
            var79 = var77;
        }
        if (NIL != $g1019$.getDynamicValue(var74)) {
            var81 = (SubLObject)ConsesLow.cons(f3803(var57), f3838(var79));
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && NIL == conses_high.subsetp(var80, var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic70$, conses_high.set_difference(var80, var81, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
        }
        f3817(var57);
        return var79;
    }
    
    public static SubLObject f3844(final SubLObject var71, final SubLObject var19, final SubLObject var55) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        var72.resetMultipleValues();
        final SubLObject var73 = f3828(f3803(var71), var19, var55, (SubLObject)UNPROVIDED);
        final SubLObject var74 = var72.secondMultipleValue();
        var72.resetMultipleValues();
        f3843(var71, var74, var55);
        return var19;
    }
    
    public static SubLObject f3845(final SubLObject var19, final SubLObject var2) {
        module0021.f1086($g1020$.getGlobalValue(), var2);
        module0021.f1038(f3803(var19), var2);
        module0021.f1038(f3804(var19), var2);
        module0021.f1038(f3805(var19), var2);
        module0021.f1038(f3806(var19), var2);
        return var19;
    }
    
    public static SubLObject f3846(final SubLObject var13, final SubLObject var2) {
        return f3845(var13, var2);
    }
    
    public static SubLObject f3847(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        var3 = f3818();
        f3807(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3808(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3809(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3810(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var3;
    }
    
    public static SubLObject f3848(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        var3 = f3818();
        f3807(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3808(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3809(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3810(var3, (SubLObject)NIL);
        return var3;
    }
    
    public static SubLObject f3849(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        var3 = f3818();
        f3807(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3808(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3809(var3, (SubLObject)NIL);
        f3810(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var3;
    }
    
    public static SubLObject f3850(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        var3 = f3818();
        f3807(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3808(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f3809(var3, (SubLObject)NIL);
        f3810(var3, (SubLObject)NIL);
        return var3;
    }
    
    public static SubLObject f3851(final SubLObject var19) {
        if (Numbers.add((SubLObject)ONE_INTEGER, f3841(var19)).numL(f3840(var19))) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f3852(final SubLObject var19, SubLObject var55) {
        if (var55 == UNPROVIDED) {
            var55 = (SubLObject)NIL;
        }
        final SubLThread var56 = SubLProcess.currentSubLThread();
        if (NIL == var19) {
            return (SubLObject)NIL;
        }
        SubLObject var57 = (SubLObject)NIL;
        final SubLObject var58 = f3839(var19);
        final SubLObject var59 = $g1025$.currentBinding(var56);
        final SubLObject var60 = $g1024$.currentBinding(var56);
        try {
            $g1025$.bind(Vectors.make_vector(var58, (SubLObject)NIL), var56);
            $g1024$.bind((SubLObject)ZERO_INTEGER, var56);
            f3835(Symbols.symbol_function((SubLObject)$ic78$), var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var55) {
                $g1025$.setDynamicValue(Sort.sort($g1025$.getDynamicValue(var56), var55, Symbols.symbol_function((SubLObject)$ic9$)), var56);
            }
            SubLObject var61;
            SubLObject var19_84;
            for (var61 = (SubLObject)NIL, var61 = (SubLObject)ZERO_INTEGER; var61.numL(var58); var61 = Numbers.add(var61, (SubLObject)ONE_INTEGER)) {
                var19_84 = Vectors.aref($g1025$.getDynamicValue(var56), var61);
                f3809(var19_84, (SubLObject)NIL);
                f3810(var19_84, (SubLObject)NIL);
            }
            var57 = f3853($g1025$.getDynamicValue(var56), (SubLObject)ZERO_INTEGER, var58);
        }
        finally {
            $g1024$.rebind(var60, var56);
            $g1025$.rebind(var59, var56);
        }
        return var57;
    }
    
    public static SubLObject f3854(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (NIL != f3802(var19)) {
            Vectors.set_aref($g1025$.getDynamicValue(var20), $g1024$.getDynamicValue(var20), var19);
            $g1024$.setDynamicValue(Numbers.add($g1024$.getDynamicValue(var20), (SubLObject)ONE_INTEGER), var20);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3853(final SubLObject var85, final SubLObject var86, final SubLObject var87) {
        if (var87.numE(var86)) {
            return (SubLObject)NIL;
        }
        if (var87.numE(Numbers.add(var86, (SubLObject)ONE_INTEGER))) {
            final SubLObject var88 = Vectors.aref(var85, var86);
            f3809(var88, (SubLObject)NIL);
            f3810(var88, (SubLObject)NIL);
            return var88;
        }
        final SubLObject var89 = f3855(var86, var87);
        final SubLObject var90 = Vectors.aref(var85, var89);
        final SubLObject var91 = f3853(var85, var86, var89);
        final SubLObject var92 = f3853(var85, Numbers.add(var89, (SubLObject)ONE_INTEGER), var87);
        f3809(var90, var91);
        f3810(var90, var92);
        return var90;
    }
    
    public static SubLObject f3855(final SubLObject var74, final SubLObject var75) {
        if (NIL != Numbers.evenp(Numbers.subtract(var75, var74))) {
            return Numbers.subtract(Numbers.integerDivide(Numbers.add(var75, var74), (SubLObject)TWO_INTEGER), random.random((SubLObject)TWO_INTEGER));
        }
        return Numbers.integerDivide(Numbers.add(var74, var75), (SubLObject)TWO_INTEGER);
    }
    
    public static SubLObject f3856(final SubLObject var1, final SubLObject var2) {
        f3857(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3858(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5255_native.class) ? T : NIL);
    }
    
    public static SubLObject f3859(final SubLObject var1) {
        assert NIL != f3858(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3860(final SubLObject var1) {
        assert NIL != f3858(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3861(final SubLObject var1) {
        assert NIL != f3858(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3862(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3858(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3863(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3858(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3864(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3858(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3865(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5255_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic94$)) {
                f3862(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic95$)) {
                f3863(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic96$)) {
                f3864(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3866(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic97$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic94$, f3859(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic95$, f3860(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic96$, f3861(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic97$, (SubLObject)THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f3867(final SubLObject var11, final SubLObject var12) {
        return f3866(var11, var12);
    }
    
    public static SubLObject f3857(final SubLObject var96, final SubLObject var2, final SubLObject var14) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var97)) {
            print_high.print_not_readable(var96, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic99$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var96), new SubLObject[] { $ic100$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.format(var2, (SubLObject)$ic101$, f3860(var96), f3861(var96));
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var96), new SubLObject[] { $ic100$, var2, $ic102$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var96;
    }
    
    public static SubLObject f3868(final SubLObject var100) {
        assert NIL != Types.function_spec_p(var100) : var100;
        final SubLObject var101 = f3865((SubLObject)UNPROVIDED);
        f3863(var101, var100);
        f3864(var101, (SubLObject)ZERO_INTEGER);
        return var101;
    }
    
    public static SubLObject f3869(final SubLObject var96) {
        return f3860(var96);
    }
    
    public static SubLObject f3870(final SubLObject var96) {
        return f3861(var96);
    }
    
    public static SubLObject f3871(final SubLObject var96) {
        return Types.sublisp_null(f3859(var96));
    }
    
    public static SubLObject f3872(final SubLObject var96, final SubLObject var102) {
        return f3873(var96, f3859(var96), var102);
    }
    
    public static SubLObject f3874(final SubLObject var96, SubLObject var102, SubLObject var103) {
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)NIL;
        }
        return (NIL != var102) ? f3875(var96, f3859(var96), var102, var103) : f3876(f3859(var96));
    }
    
    public static SubLObject f3877(final SubLObject var96, SubLObject var102, SubLObject var103) {
        if (var102 == UNPROVIDED) {
            var102 = (SubLObject)NIL;
        }
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)NIL;
        }
        return (NIL != var102) ? f3878(var96, f3859(var96), var102, var103) : f3879(f3859(var96));
    }
    
    public static SubLObject f3880(final SubLObject var96, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        var103.resetMultipleValues();
        final SubLObject var104 = f3881(var96, var102);
        final SubLObject var105 = var103.secondMultipleValue();
        var103.resetMultipleValues();
        if (NIL != var105) {
            f3864(var96, Numbers.add(f3861(var96), (SubLObject)ONE_INTEGER));
            if (NIL != var104) {
                f3862(var96, var104);
            }
        }
        return var96;
    }
    
    public static SubLObject f3882(final SubLObject var96, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (NIL == f3871(var96)) {
            var103.resetMultipleValues();
            final SubLObject var104 = f3883(var96, var102);
            final SubLObject var105 = var103.secondMultipleValue();
            var103.resetMultipleValues();
            if (NIL != var105) {
                f3864(var96, Numbers.subtract(f3861(var96), (SubLObject)ONE_INTEGER));
                f3862(var96, var104);
            }
        }
        return var96;
    }
    
    public static SubLObject f3884(final SubLObject var96) {
        f3862(var96, (SubLObject)NIL);
        f3864(var96, (SubLObject)ZERO_INTEGER);
        return var96;
    }
    
    public static SubLObject f3885(final SubLObject var96) {
        final SubLObject var97 = f3859(var96);
        final SubLObject var98 = f3860(var96);
        final SubLObject var99 = f3861(var96);
        final SubLObject var100 = f3868(var98);
        final SubLObject var101 = f3886(var97);
        f3862(var100, var101);
        f3864(var100, var99);
        return var96;
    }
    
    public static SubLObject f3887(final SubLObject var109, final SubLObject var110, SubLObject var64) {
        if (var64 == UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)EQL);
        }
        return (SubLObject)makeBoolean(f3861(var109).eql(f3861(var110)) && module0107.f7623(f3860(var109)).eql(module0107.f7623(f3860(var110))) && NIL != f3888(f3859(var109), f3859(var110), var64));
    }
    
    public static SubLObject f3889(final SubLObject var111, final SubLObject var100) {
        final SubLObject var112 = f3868(var100);
        SubLObject var113 = var111;
        SubLObject var114 = (SubLObject)NIL;
        var114 = var113.first();
        while (NIL != var113) {
            f3880(var112, var114);
            var113 = var113.rest();
            var114 = var113.first();
        }
        return var112;
    }
    
    public static SubLObject f3890(final SubLObject var96, SubLObject var113, SubLObject var114, SubLObject var115) {
        if (var113 == UNPROVIDED) {
            var113 = (SubLObject)NIL;
        }
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)NIL;
        }
        if (var115 == UNPROVIDED) {
            var115 = (SubLObject)$ic104$;
        }
        return module0052.f3689(f3891(var96, var113, var114, var115), (SubLObject)$ic105$, (SubLObject)$ic106$, (SubLObject)$ic67$);
    }
    
    public static SubLObject f3892(final SubLObject var96, SubLObject var113, SubLObject var114, SubLObject var115) {
        if (var113 == UNPROVIDED) {
            var113 = (SubLObject)NIL;
        }
        if (var114 == UNPROVIDED) {
            var114 = (SubLObject)NIL;
        }
        if (var115 == UNPROVIDED) {
            var115 = (SubLObject)$ic104$;
        }
        return module0135.f8839(f3891(var96, var113, var114, var115), (SubLObject)$ic107$, (SubLObject)$ic108$, (SubLObject)$ic67$);
    }
    
    public static SubLObject f3893(final SubLObject var13, final SubLObject var2) {
        return f3894(var13, var2);
    }
    
    public static SubLObject f3894(final SubLObject var96, final SubLObject var2) {
        module0021.f1086($g1027$.getGlobalValue(), var2);
        final SubLObject var97 = f3859(var96);
        final SubLObject var98 = f3860(var96);
        final SubLObject var99 = f3861(var96);
        module0021.f1038(var97, var2);
        module0021.f1038(var98, var2);
        module0021.f1038(var99, var2);
        return var96;
    }
    
    public static SubLObject f3895(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var6 = (SubLObject)NIL;
        var6 = f3865((SubLObject)UNPROVIDED);
        f3862(var6, var3);
        f3863(var6, var4);
        f3864(var6, var5);
        return var6;
    }
    
    public static SubLObject f3896(final SubLObject var96) {
        return f3897(f3859(var96));
    }
    
    public static SubLObject f3897(final SubLObject var57) {
        return (SubLObject)makeBoolean(NIL == var57 || (NIL != module0004.f104(f3898(var57), (SubLObject)$ic112$, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED) && NIL != f3897(f3899(var57)) && NIL != f3897(f3900(var57))));
    }
    
    public static SubLObject f3901(final SubLObject var96) {
        return f3902(f3859(var96));
    }
    
    public static SubLObject f3902(final SubLObject var57) {
        return (SubLObject)((NIL != var57) ? module0048.f_1X(Numbers.max(f3902(f3899(var57)), f3902(f3900(var57)))) : ZERO_INTEGER);
    }
    
    public static SubLObject f3903(final SubLObject var96) {
        return (SubLObject)makeBoolean(NIL != f3871(var96) || NIL != f3904(f3859(var96)));
    }
    
    public static SubLObject f3904(final SubLObject var57) {
        if (NIL == var57) {
            return (SubLObject)ZERO_INTEGER;
        }
        final SubLObject var58 = f3904(f3899(var57));
        if (NIL == var58) {
            return (SubLObject)NIL;
        }
        final SubLObject var59 = f3904(f3900(var57));
        if (NIL != var59 && Numbers.subtract(var59, var58).eql(f3898(var57))) {
            return module0048.f_1X(Numbers.max(var59, var58));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3905(final SubLObject var96, final SubLObject var118, final SubLObject var119) {
        final SubLObject var120 = f3869(var96);
        if (var120.eql((SubLObject)$ic113$)) {
            return Numbers.numL(var118, var119);
        }
        if (var120.eql((SubLObject)$ic114$)) {
            return module0213.f13927(var118, var119, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (var120.eql((SubLObject)$ic115$)) {
            return module0323.f21852(var118, var119);
        }
        return Functions.funcall(f3869(var96), var118, var119);
    }
    
    public static SubLObject f3906(final SubLObject var96, final SubLObject var118, final SubLObject var119) {
        return f3905(var96, var119, var118);
    }
    
    public static SubLObject f3873(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        if (NIL == var57) {
            return (SubLObject)NIL;
        }
        if (NIL != f3905(var101, var102, f3907(var57))) {
            return f3873(var101, f3899(var57), var102);
        }
        if (NIL != f3906(var101, var102, f3907(var57))) {
            return f3873(var101, f3900(var57), var102);
        }
        return f3907(var57);
    }
    
    public static SubLObject f3875(final SubLObject var101, final SubLObject var57, final SubLObject var102, final SubLObject var103) {
        if (NIL == var57) {
            return (SubLObject)NIL;
        }
        if (NIL != f3905(var101, var102, f3907(var57))) {
            final SubLObject var104 = f3875(var101, f3899(var57), var102, var103);
            return (NIL != var104) ? var104 : f3907(var57);
        }
        if (NIL != f3906(var101, var102, f3907(var57))) {
            return f3875(var101, f3900(var57), var102, var103);
        }
        return (NIL != var103) ? f3875(var101, f3900(var57), var102, var103) : f3907(var57);
    }
    
    public static SubLObject f3878(final SubLObject var101, final SubLObject var57, final SubLObject var102, final SubLObject var103) {
        if (NIL == var57) {
            return (SubLObject)NIL;
        }
        if (NIL != f3906(var101, var102, f3907(var57))) {
            final SubLObject var104 = f3878(var101, f3900(var57), var102, var103);
            return (NIL != var104) ? var104 : f3907(var57);
        }
        if (NIL != f3905(var101, var102, f3907(var57))) {
            return f3878(var101, f3899(var57), var102, var103);
        }
        return (NIL != var103) ? f3878(var101, f3899(var57), var102, var103) : f3907(var57);
    }
    
    public static SubLObject f3876(final SubLObject var57) {
        return (SubLObject)((NIL != var57) ? f3907(f3908(var57)) : NIL);
    }
    
    public static SubLObject f3908(final SubLObject var57) {
        return (NIL != f3909(var57)) ? f3908(f3899(var57)) : var57;
    }
    
    public static SubLObject f3879(final SubLObject var57) {
        return (SubLObject)((NIL != var57) ? f3907(f3910(var57)) : NIL);
    }
    
    public static SubLObject f3910(final SubLObject var57) {
        return (NIL != f3911(var57)) ? f3910(f3900(var57)) : var57;
    }
    
    public static SubLObject f3881(final SubLObject var101, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        final SubLObject var104 = f3859(var101);
        if (NIL != var104) {
            var103.resetMultipleValues();
            final SubLObject var105 = f3912(var101, var104, var102);
            final SubLObject var106 = var103.secondMultipleValue();
            final SubLObject var107 = var103.thirdMultipleValue();
            var103.resetMultipleValues();
            return Values.values(var106, module0035.sublisp_boolean(var105));
        }
        return Values.values(f3913(var102, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL), (SubLObject)T);
    }
    
    public static SubLObject f3912(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLObject var103 = f3907(var57);
        if (NIL != f3905(var101, var102, var103)) {
            return f3914(var101, var57, var102);
        }
        if (NIL != f3906(var101, var102, var103)) {
            return f3915(var101, var57, var102);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f3914(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (NIL != f3909(var57)) {
            var103.resetMultipleValues();
            final SubLObject var104 = f3912(var101, f3899(var57), var102);
            final SubLObject var105 = var103.secondMultipleValue();
            final SubLObject var106 = var103.thirdMultipleValue();
            var103.resetMultipleValues();
            if (NIL == var104) {
                return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            if (NIL != var105) {
                f3916(var57, var105);
            }
            if (NIL == var106) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)NIL);
            }
            f3917(var57, (SubLObject)UNPROVIDED);
            final SubLObject var107 = f3898(var57);
            if (var107.eql((SubLObject)$ic116$)) {
                final SubLObject var108 = f3918(var57);
                return Values.values(var104, var108, (SubLObject)NIL);
            }
            if (var107.eql((SubLObject)MINUS_ONE_INTEGER)) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)T);
            }
            if (var107.eql((SubLObject)ZERO_INTEGER)) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)NIL);
            }
            return Errors.error((SubLObject)$ic117$, var101);
        }
        else {
            final SubLObject var104 = f3913(var102, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL);
            f3916(var57, var104);
            f3917(var57, (SubLObject)UNPROVIDED);
            final SubLObject var109 = f3898(var57);
            if (var109.eql((SubLObject)MINUS_ONE_INTEGER)) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)T);
            }
            if (var109.eql((SubLObject)ZERO_INTEGER)) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)NIL);
            }
            return Errors.error((SubLObject)$ic117$, var101);
        }
    }
    
    public static SubLObject f3915(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (NIL != f3911(var57)) {
            var103.resetMultipleValues();
            final SubLObject var104 = f3912(var101, f3900(var57), var102);
            final SubLObject var105 = var103.secondMultipleValue();
            final SubLObject var106 = var103.thirdMultipleValue();
            var103.resetMultipleValues();
            if (NIL == var104) {
                return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
            }
            if (NIL != var105) {
                f3919(var57, var105);
            }
            if (NIL == var106) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)NIL);
            }
            f3920(var57, (SubLObject)UNPROVIDED);
            final SubLObject var107 = f3898(var57);
            if (var107.eql((SubLObject)ZERO_INTEGER)) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)NIL);
            }
            if (var107.eql((SubLObject)ONE_INTEGER)) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)T);
            }
            if (var107.eql((SubLObject)TWO_INTEGER)) {
                final SubLObject var108 = f3921(var57);
                return Values.values(var104, var108, (SubLObject)NIL);
            }
            return Errors.error((SubLObject)$ic118$, var101);
        }
        else {
            final SubLObject var104 = f3913(var102, (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)NIL);
            f3919(var57, var104);
            f3920(var57, (SubLObject)UNPROVIDED);
            final SubLObject var109 = f3898(var57);
            if (var109.eql((SubLObject)ZERO_INTEGER)) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)NIL);
            }
            if (var109.eql((SubLObject)ONE_INTEGER)) {
                return Values.values(var104, (SubLObject)NIL, (SubLObject)T);
            }
            return Errors.error((SubLObject)$ic117$, var101);
        }
    }
    
    public static SubLObject f3883(final SubLObject var101, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        final SubLObject var104 = f3859(var101);
        if (NIL != var104) {
            var103.resetMultipleValues();
            final SubLObject var105 = f3922(var101, var104, var102);
            final SubLObject var106 = var103.secondMultipleValue();
            final SubLObject var107 = var103.thirdMultipleValue();
            var103.resetMultipleValues();
            return Values.values(var105, var106);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f3922(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        if (NIL != f3905(var101, var102, f3907(var57))) {
            return f3923(var101, var57, var102);
        }
        if (NIL != f3906(var101, var102, f3907(var57))) {
            return f3924(var101, var57, var102);
        }
        return f3925(var57);
    }
    
    public static SubLObject f3925(final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = f3899(var57);
        SubLObject var60 = f3900(var57);
        if (NIL == var60) {
            return Values.values(var59, (SubLObject)T, (SubLObject)T);
        }
        if (NIL != f3909(var60)) {
            var58.resetMultipleValues();
            SubLObject var61 = f3926(var57, var60);
            SubLObject var62 = var58.secondMultipleValue();
            var58.resetMultipleValues();
            if (NIL != var62) {
                SubLObject var63 = f3898(var60);
                if (var63.eql((SubLObject)MINUS_ONE_INTEGER)) {
                    f3927(var60, (SubLObject)ZERO_INTEGER);
                }
                else if (var63.eql((SubLObject)ZERO_INTEGER)) {
                    f3927(var60, (SubLObject)ONE_INTEGER);
                    var62 = (SubLObject)NIL;
                }
                else if (var63.eql((SubLObject)ONE_INTEGER)) {
                    f3927(var60, (SubLObject)TWO_INTEGER);
                    final SubLObject var64 = f3921(var60);
                    f3919(var61, var64);
                    var62 = (SubLObject)makeBoolean(!MINUS_ONE_INTEGER.eql(f3898(var64)));
                }
                if (NIL != var62) {
                    var63 = f3898(var61);
                    if (var63.eql((SubLObject)MINUS_ONE_INTEGER)) {
                        f3927(var61, (SubLObject)$ic116$);
                        var61 = f3918(var61);
                        var62 = (SubLObject)makeBoolean(!ONE_INTEGER.eql(f3898(var61)));
                    }
                    else if (var63.eql((SubLObject)ZERO_INTEGER)) {
                        f3927(var61, (SubLObject)MINUS_ONE_INTEGER);
                        var62 = (SubLObject)NIL;
                    }
                    else if (var63.eql((SubLObject)ONE_INTEGER)) {
                        f3927(var61, (SubLObject)ZERO_INTEGER);
                    }
                }
            }
            return Values.values(var61, (SubLObject)T, var62);
        }
        f3916(var60, var59);
        final SubLObject var65 = f3898(var57);
        if (var65.eql((SubLObject)MINUS_ONE_INTEGER)) {
            f3927(var60, (SubLObject)$ic116$);
            var60 = f3918(var60);
            return Values.values(var60, (SubLObject)T, (SubLObject)makeBoolean(!ONE_INTEGER.eql(f3898(var60))));
        }
        if (var65.eql((SubLObject)ZERO_INTEGER)) {
            f3927(var60, (SubLObject)MINUS_ONE_INTEGER);
            return Values.values(var60, (SubLObject)T, (SubLObject)NIL);
        }
        if (var65.eql((SubLObject)ONE_INTEGER)) {
            f3927(var60, (SubLObject)ZERO_INTEGER);
            return Values.values(var60, (SubLObject)T, (SubLObject)T);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3926(final SubLObject var127, final SubLObject var57) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        final SubLObject var129 = f3899(var57);
        if (NIL != f3909(var129)) {
            var128.resetMultipleValues();
            final SubLObject var130 = f3926(var127, var129);
            SubLObject var131 = var128.secondMultipleValue();
            var128.resetMultipleValues();
            if (NIL != var131) {
                final SubLObject var132 = f3898(var129);
                if (var132.eql((SubLObject)MINUS_ONE_INTEGER)) {
                    f3927(var129, (SubLObject)ZERO_INTEGER);
                }
                else if (var132.eql((SubLObject)ZERO_INTEGER)) {
                    f3927(var129, (SubLObject)ONE_INTEGER);
                    var131 = (SubLObject)NIL;
                }
                else if (var132.eql((SubLObject)ONE_INTEGER)) {
                    f3927(var129, (SubLObject)TWO_INTEGER);
                    final SubLObject var133 = f3921(var129);
                    f3916(var57, var133);
                    if (MINUS_ONE_INTEGER.eql(f3898(var133))) {
                        var131 = (SubLObject)NIL;
                    }
                }
            }
            return Values.values(var130, var131);
        }
        f3916(var129, f3899(var127));
        f3916(var57, f3900(var129));
        f3919(var129, f3900(var127));
        f3927(var129, f3898(var127));
        return Values.values(var129, (SubLObject)T);
    }
    
    public static SubLObject f3923(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (NIL == f3909(var57)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        var103.resetMultipleValues();
        final SubLObject var104 = f3922(var101, f3899(var57), var102);
        final SubLObject var105 = var103.secondMultipleValue();
        SubLObject var106 = var103.thirdMultipleValue();
        var103.resetMultipleValues();
        if (NIL != var105) {
            SubLObject var107 = var57;
            f3916(var57, var104);
            if (NIL != var106) {
                final SubLObject var108 = f3898(var57);
                if (var108.eql((SubLObject)MINUS_ONE_INTEGER)) {
                    f3927(var57, (SubLObject)ZERO_INTEGER);
                }
                else if (var108.eql((SubLObject)ZERO_INTEGER)) {
                    f3927(var57, (SubLObject)ONE_INTEGER);
                    var106 = (SubLObject)NIL;
                }
                else if (var108.eql((SubLObject)ONE_INTEGER)) {
                    f3927(var57, (SubLObject)TWO_INTEGER);
                    var107 = f3921(var57);
                    var106 = (SubLObject)makeBoolean(!MINUS_ONE_INTEGER.eql(f3898(var107)));
                }
            }
            return Values.values(var107, (SubLObject)T, var106);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f3924(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (NIL == f3911(var57)) {
            return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        var103.resetMultipleValues();
        final SubLObject var104 = f3922(var101, f3900(var57), var102);
        final SubLObject var105 = var103.secondMultipleValue();
        SubLObject var106 = var103.thirdMultipleValue();
        var103.resetMultipleValues();
        if (NIL != var105) {
            SubLObject var107 = var57;
            f3919(var57, var104);
            if (NIL != var106) {
                final SubLObject var108 = f3898(var57);
                if (var108.eql((SubLObject)MINUS_ONE_INTEGER)) {
                    f3927(var57, (SubLObject)$ic116$);
                    var107 = f3918(var57);
                    var106 = (SubLObject)makeBoolean(!ONE_INTEGER.eql(f3898(var107)));
                }
                else if (var108.eql((SubLObject)ZERO_INTEGER)) {
                    f3927(var57, (SubLObject)MINUS_ONE_INTEGER);
                    var106 = (SubLObject)NIL;
                }
                else if (var108.eql((SubLObject)ONE_INTEGER)) {
                    f3927(var57, (SubLObject)ZERO_INTEGER);
                }
            }
            return Values.values(var107, (SubLObject)T, var106);
        }
        return Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
    }
    
    public static SubLObject f3918(final SubLObject var57) {
        final SubLObject var58 = f3899(var57);
        final SubLObject var59 = f3900(var58);
        final SubLObject var60 = f3898(var58);
        if (var60.eql((SubLObject)MINUS_ONE_INTEGER)) {
            f3919(var58, var57);
            f3916(var57, var59);
            f3927(var58, (SubLObject)ZERO_INTEGER);
            f3927(var57, (SubLObject)ZERO_INTEGER);
            return var58;
        }
        if (var60.eql((SubLObject)ZERO_INTEGER)) {
            f3919(var58, var57);
            f3916(var57, var59);
            f3927(var58, (SubLObject)ONE_INTEGER);
            f3927(var57, (SubLObject)MINUS_ONE_INTEGER);
            return var58;
        }
        if (var60.eql((SubLObject)ONE_INTEGER)) {
            f3919(var58, f3899(var59));
            f3916(var57, f3900(var59));
            f3919(var59, var57);
            f3916(var59, var58);
            final SubLObject var10_132 = f3898(var59);
            if (var10_132.eql((SubLObject)MINUS_ONE_INTEGER)) {
                f3927(var57, (SubLObject)ONE_INTEGER);
                f3927(var58, (SubLObject)ZERO_INTEGER);
            }
            else if (var10_132.eql((SubLObject)ZERO_INTEGER)) {
                f3927(var57, (SubLObject)ZERO_INTEGER);
                f3927(var58, (SubLObject)ZERO_INTEGER);
            }
            else if (var10_132.eql((SubLObject)ONE_INTEGER)) {
                f3927(var57, (SubLObject)ZERO_INTEGER);
                f3927(var58, (SubLObject)MINUS_ONE_INTEGER);
            }
            f3927(var59, (SubLObject)ZERO_INTEGER);
            return var59;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3921(final SubLObject var57) {
        final SubLObject var58 = f3900(var57);
        final SubLObject var59 = f3899(var58);
        final SubLObject var60 = f3898(var58);
        if (var60.eql((SubLObject)MINUS_ONE_INTEGER)) {
            f3916(var58, f3900(var59));
            f3919(var57, f3899(var59));
            f3916(var59, var57);
            f3919(var59, var58);
            final SubLObject var10_134 = f3898(var59);
            if (var10_134.eql((SubLObject)MINUS_ONE_INTEGER)) {
                f3927(var57, (SubLObject)ZERO_INTEGER);
                f3927(var58, (SubLObject)ONE_INTEGER);
            }
            else if (var10_134.eql((SubLObject)ZERO_INTEGER)) {
                f3927(var57, (SubLObject)ZERO_INTEGER);
                f3927(var58, (SubLObject)ZERO_INTEGER);
            }
            else if (var10_134.eql((SubLObject)ONE_INTEGER)) {
                f3927(var57, (SubLObject)MINUS_ONE_INTEGER);
                f3927(var58, (SubLObject)ZERO_INTEGER);
            }
            f3927(var59, (SubLObject)ZERO_INTEGER);
            return var59;
        }
        if (var60.eql((SubLObject)ZERO_INTEGER)) {
            f3916(var58, var57);
            f3919(var57, var59);
            f3927(var58, (SubLObject)MINUS_ONE_INTEGER);
            f3927(var57, (SubLObject)ONE_INTEGER);
            return var58;
        }
        if (var60.eql((SubLObject)ONE_INTEGER)) {
            f3916(var58, var57);
            f3919(var57, var59);
            f3927(var58, (SubLObject)ZERO_INTEGER);
            f3927(var57, (SubLObject)ZERO_INTEGER);
            return var58;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3891(final SubLObject var96, final SubLObject var113, final SubLObject var114, final SubLObject var115) {
        final SubLObject var116 = module0054.f3968();
        final SubLObject var117 = (var115 == $ic104$) ? var114 : var113;
        if (NIL == var113 || NIL == var114 || NIL == f3906(var96, var113, var114)) {
            if (var115 == $ic104$) {
                f3928(var96, f3859(var96), var116, var113, var114);
            }
            else {
                f3929(var96, f3859(var96), var116, var113, var114);
            }
        }
        return (SubLObject)ConsesLow.list(var96, var116, var117, var115);
    }
    
    public static SubLObject f3928(final SubLObject var101, final SubLObject var57, final SubLObject var52, final SubLObject var113, final SubLObject var114) {
        if (NIL == var57) {
            return var52;
        }
        if (NIL == var113) {
            if (NIL == var114 || NIL == f3906(var101, f3907(var57), var114)) {
                module0054.f3973(var57, var52);
            }
            return f3928(var101, f3899(var57), var52, var113, var114);
        }
        if (NIL != f3905(var101, var113, f3907(var57))) {
            if (NIL == var114 || NIL == f3906(var101, f3907(var57), var114)) {
                module0054.f3973(var57, var52);
            }
            return f3928(var101, f3899(var57), var52, var113, var114);
        }
        if (NIL != f3906(var101, var113, f3907(var57))) {
            return f3928(var101, f3900(var57), var52, var113, var114);
        }
        module0054.f3973(var57, var52);
        return var52;
    }
    
    public static SubLObject f3929(final SubLObject var101, final SubLObject var57, final SubLObject var52, final SubLObject var113, final SubLObject var114) {
        if (NIL == var57) {
            return var52;
        }
        if (NIL == var114) {
            if (NIL == var113 || NIL == f3905(var101, f3907(var57), var113)) {
                module0054.f3973(var57, var52);
            }
            return f3929(var101, f3900(var57), var52, var113, var114);
        }
        if (NIL != f3906(var101, var114, f3907(var57))) {
            if (NIL == var113 || NIL == f3905(var101, f3907(var57), var113)) {
                module0054.f3973(var57, var52);
            }
            return f3929(var101, f3900(var57), var52, var113, var114);
        }
        if (NIL != f3905(var101, var114, f3907(var57))) {
            return f3929(var101, f3899(var57), var52, var113, var114);
        }
        module0054.f3973(var57, var52);
        return var52;
    }
    
    public static SubLObject f3930(final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)$ic119$);
        var26 = var25.first();
        SubLObject var30 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var27 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var28 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var29 = var30.first();
        var30 = var30.rest();
        if (NIL == var30) {
            return module0054.f3970(var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic119$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3931(final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)$ic119$);
        var26 = var25.first();
        SubLObject var30 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var27 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var28 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var29 = var30.first();
        var30 = var30.rest();
        if (NIL == var30) {
            final SubLObject var31 = module0054.f3974(var27);
            final SubLObject var32 = f3907(var31);
            if (var29 == $ic104$) {
                if (NIL == var28 || NIL != f3905(var26, var32, var28)) {
                    f3932(var26, f3900(var31), var27, var28);
                }
            }
            else if (NIL == var28 || NIL != f3906(var26, var32, var28)) {
                f3933(var26, f3899(var31), var27, var28);
            }
            return Values.values(var32, var25, Types.sublisp_null(var32));
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic119$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3932(final SubLObject var101, final SubLObject var57, final SubLObject var52, final SubLObject var135) {
        if (NIL != var57) {
            if (NIL == var135 || NIL == f3906(var101, f3907(var57), var135)) {
                module0054.f3973(var57, var52);
            }
            f3932(var101, f3899(var57), var52, var135);
        }
        return var52;
    }
    
    public static SubLObject f3933(final SubLObject var101, final SubLObject var57, final SubLObject var52, final SubLObject var135) {
        if (NIL != var57) {
            if (NIL == var135 || NIL == f3905(var101, f3907(var57), var135)) {
                module0054.f3973(var57, var52);
            }
            f3933(var101, f3900(var57), var52, var135);
        }
        return var52;
    }
    
    public static SubLObject f3934(final SubLObject var25) {
        return f3930(var25);
    }
    
    public static SubLObject f3935(final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        SubLObject var29 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)$ic119$);
        var26 = var25.first();
        SubLObject var30 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var27 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var28 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)$ic119$);
        var29 = var30.first();
        var30 = var30.rest();
        if (NIL == var30) {
            final SubLObject var31 = module0054.f3974(var27);
            SubLObject var32 = (SubLObject)NIL;
            if (NIL != var31) {
                var32 = f3907(var31);
                if (var29 == $ic104$) {
                    if (NIL == var28 || NIL != f3905(var26, var32, var28)) {
                        f3932(var26, f3900(var31), var27, var28);
                    }
                }
                else if (NIL == var28 || NIL != f3906(var26, var32, var28)) {
                    f3933(var26, f3899(var31), var27, var28);
                }
            }
            return var32;
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)$ic119$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3936(final SubLObject var1, final SubLObject var2) {
        f3937(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3938(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5260_native.class) ? T : NIL);
    }
    
    public static SubLObject f3939(final SubLObject var1) {
        assert NIL != f3938(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3940(final SubLObject var1) {
        assert NIL != f3938(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3941(final SubLObject var1) {
        assert NIL != f3938(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3942(final SubLObject var1) {
        assert NIL != f3938(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f3943(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3938(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3944(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3938(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3945(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3938(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3946(final SubLObject var1, final SubLObject var4) {
        assert NIL != f3938(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f3947(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5260_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic137$)) {
                f3943(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic138$)) {
                f3944(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f3945(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f3946(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3948(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic139$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic137$, f3939(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic138$, f3940(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic19$, f3941(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic20$, f3942(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic139$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f3949(final SubLObject var11, final SubLObject var12) {
        return f3948(var11, var12);
    }
    
    public static SubLObject f3937(final SubLObject var145, final SubLObject var2, final SubLObject var14) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var146)) {
            print_high.print_not_readable(var145, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic99$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var145), new SubLObject[] { $ic100$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            if (NIL != $g1028$.getDynamicValue(var146)) {
                PrintLow.format(var2, (SubLObject)$ic141$, f3939(var145));
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var145), new SubLObject[] { $ic100$, var2, $ic102$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var145;
    }
    
    public static SubLObject f3913(final SubLObject var123, SubLObject var149, SubLObject var16, SubLObject var15) {
        if (var149 == UNPROVIDED) {
            var149 = (SubLObject)ZERO_INTEGER;
        }
        if (var16 == UNPROVIDED) {
            var16 = (SubLObject)NIL;
        }
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        final SubLObject var150 = f3947((SubLObject)UNPROVIDED);
        f3943(var150, var123);
        f3944(var150, var149);
        f3945(var150, var16);
        f3946(var150, var15);
        return var150;
    }
    
    public static SubLObject f3907(final SubLObject var145) {
        return f3939(var145);
    }
    
    public static SubLObject f3898(final SubLObject var145) {
        return f3940(var145);
    }
    
    public static SubLObject f3899(final SubLObject var145) {
        return f3941(var145);
    }
    
    public static SubLObject f3900(final SubLObject var145) {
        return f3942(var145);
    }
    
    public static SubLObject f3920(final SubLObject var145, SubLObject var150) {
        if (var150 == UNPROVIDED) {
            var150 = (SubLObject)ONE_INTEGER;
        }
        f3944(var145, Numbers.add(f3940(var145), var150));
        return var145;
    }
    
    public static SubLObject f3917(final SubLObject var145, SubLObject var150) {
        if (var150 == UNPROVIDED) {
            var150 = (SubLObject)ONE_INTEGER;
        }
        f3944(var145, Numbers.subtract(f3940(var145), var150));
        return var145;
    }
    
    public static SubLObject f3927(final SubLObject var145, final SubLObject var149) {
        f3944(var145, var149);
        return var145;
    }
    
    public static SubLObject f3916(final SubLObject var145, final SubLObject var16) {
        f3945(var145, var16);
        return var145;
    }
    
    public static SubLObject f3919(final SubLObject var145, final SubLObject var15) {
        f3946(var145, var15);
        return var145;
    }
    
    public static SubLObject f3909(final SubLObject var145) {
        return module0035.sublisp_boolean(f3941(var145));
    }
    
    public static SubLObject f3911(final SubLObject var145) {
        return module0035.sublisp_boolean(f3942(var145));
    }
    
    public static SubLObject f3950(final SubLObject var145, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        PrintLow.format(var2, (SubLObject)$ic142$, f3939(var145));
        PrintLow.format(var2, (SubLObject)$ic143$, f3940(var145));
        PrintLow.format(var2, (SubLObject)$ic144$, f3941(var145));
        PrintLow.format(var2, (SubLObject)$ic145$, f3942(var145));
        PrintLow.format(var2, (SubLObject)$ic146$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3886(final SubLObject var145) {
        final SubLObject var146 = f3939(var145);
        final SubLObject var147 = f3940(var145);
        SubLObject var148 = f3941(var145);
        SubLObject var149 = f3942(var145);
        if (NIL != f3938(var148)) {
            var148 = f3886(var148);
        }
        if (NIL != f3938(var149)) {
            var149 = f3886(var149);
        }
        return f3913(var146, var147, var148, var149);
    }
    
    public static SubLObject f3888(final SubLObject var151, final SubLObject var152, SubLObject var64) {
        if (var64 == UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (NIL == var151) {
            return Types.sublisp_null(var152);
        }
        if (NIL == var152) {
            return (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL != Functions.funcall(var64, f3939(var151), f3939(var152)) && NIL != f3888(f3941(var151), f3941(var152), var64) && NIL != f3888(f3942(var151), f3942(var152), var64));
    }
    
    public static SubLObject f3951(final SubLObject var13, final SubLObject var2) {
        return f3952(var13, var2);
    }
    
    public static SubLObject f3952(final SubLObject var57, final SubLObject var2) {
        module0021.f1086($g1030$.getGlobalValue(), var2);
        final SubLObject var58 = f3939(var57);
        final SubLObject var59 = f3940(var57);
        final SubLObject var60 = f3941(var57);
        final SubLObject var61 = f3942(var57);
        module0021.f1038(var58, var2);
        module0021.f1038(var59, var2);
        module0021.f1038(var60, var2);
        module0021.f1038(var61, var2);
        return var57;
    }
    
    public static SubLObject f3953(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var5 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var6 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var7 = (SubLObject)NIL;
        var7 = f3947((SubLObject)UNPROVIDED);
        f3943(var7, var3);
        f3944(var7, var4);
        f3945(var7, var5);
        f3946(var7, var6);
        return var7;
    }
    
    public static SubLObject f3954() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3800", "S#5263", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3802", "S#5254", 1, 0, false);
        new $f3802$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3803", "S#5264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3804", "S#5265", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3805", "BT-LOWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3806", "BT-HIGHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3807", "S#5266", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3808", "S#5267", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3809", "S#5268", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3810", "S#5269", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3811", "S#5270", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3812", "S#5271", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3813", "S#5272", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3801", "S#5273", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3814", "S#5274", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3815", "S#5275", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3816", "S#5276", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3817", "S#5277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3818", "S#5278", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3819", "S#5279", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0053", "f3820", "S#5280");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3821", "S#5281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3822", "S#5282", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0053", "f3823", "S#5283");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3824", "S#5284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3825", "S#5285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3826", "S#5286", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3829", "S#5287", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3831", "S#5288", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3832", "S#5289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3833", "S#5290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3834", "S#5291", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3835", "S#5292", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3836", "S#5293", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3837", "S#5294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3838", "S#5295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3839", "S#5296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3840", "S#5297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3841", "S#5298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3827", "S#5299", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3842", "S#5300", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3828", "S#5301", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3843", "S#5302", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3830", "S#5303", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3844", "S#5304", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3845", "S#5305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3846", "S#5306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3847", "S#5307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3848", "S#5308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3849", "S#5309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3850", "S#5310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3851", "S#5311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3852", "S#5312", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3854", "S#5313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3853", "S#5314", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3855", "S#5315", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3856", "S#5316", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3858", "S#5256", 1, 0, false);
        new $f3858$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3859", "S#5317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3860", "S#5318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3861", "S#5319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3862", "S#5320", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3863", "S#5321", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3864", "S#5322", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3865", "S#5323", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3866", "S#5324", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3867", "S#5325", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3857", "S#5326", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3868", "S#5327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3869", "S#5328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3870", "S#5329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3871", "S#5330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3872", "S#5331", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3874", "S#5332", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3877", "S#5333", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3880", "S#5334", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3882", "S#5335", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3884", "S#5336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3885", "S#5337", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3887", "S#5338", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3889", "S#5339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3890", "S#5340", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3892", "S#5341", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3893", "S#5342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3894", "S#5343", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3895", "S#5344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3896", "S#5345", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3897", "S#5346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3901", "S#5347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3902", "S#5348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3903", "S#5349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3904", "S#5350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3905", "S#5351", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3906", "S#5352", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3873", "S#5353", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3875", "S#5354", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3878", "S#5355", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3876", "S#5356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3908", "S#5357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3879", "S#5358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3910", "S#5359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3881", "S#5360", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3912", "S#5361", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3914", "S#5362", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3915", "S#5363", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3883", "S#5364", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3922", "S#5365", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3925", "S#5366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3926", "S#5367", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3923", "S#5368", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3924", "S#5369", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3918", "S#5370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3921", "S#5371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3891", "S#5372", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3928", "S#5373", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3929", "S#5374", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3930", "S#5375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3931", "S#5376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3932", "S#5377", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3933", "S#5378", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3934", "S#5379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3935", "S#5380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3936", "S#5381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3938", "S#5261", 1, 0, false);
        new $f3938$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3939", "S#5382", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3940", "S#5383", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3941", "S#5384", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3942", "S#5385", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3943", "S#5386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3944", "S#5387", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3945", "S#5388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3946", "S#5389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3947", "S#5390", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3948", "S#5391", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3949", "S#5392", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3937", "S#5393", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3913", "S#5394", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3907", "S#5395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3898", "S#5396", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3899", "S#5397", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3900", "S#5398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3920", "S#5399", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3917", "S#5400", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3927", "S#5401", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3916", "S#5402", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3919", "S#5403", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3909", "S#5404", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3911", "S#5405", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3950", "S#5406", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3886", "S#5407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3888", "S#5408", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3951", "S#5409", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3952", "S#5410", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0053", "f3953", "S#5262", 1, 0, false);
        new $f3953$UnaryFunction();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3955() {
        $g1014$ = SubLFiles.defconstant("S#5411", (SubLObject)$ic0$);
        $g1015$ = SubLFiles.deflexical("S#5412", (SubLObject)NIL);
        $g1016$ = SubLFiles.deflexical("S#5413", Locks.make_lock((SubLObject)$ic32$));
        $g1017$ = SubLFiles.defparameter("S#5414", (SubLObject)NIL);
        $g1018$ = SubLFiles.defparameter("S#5415", (SubLObject)NIL);
        $g1019$ = SubLFiles.defparameter("S#5416", (SubLObject)NIL);
        $g1020$ = SubLFiles.defconstant("S#5417", (SubLObject)NINETEEN_INTEGER);
        $g1021$ = SubLFiles.defconstant("S#5418", (SubLObject)TWENTY_INTEGER);
        $g1022$ = SubLFiles.defconstant("S#5419", (SubLObject)$ic74$);
        $g1023$ = SubLFiles.defconstant("S#5420", (SubLObject)$ic76$);
        $g1024$ = SubLFiles.defparameter("S#5421", (SubLObject)ZERO_INTEGER);
        $g1025$ = SubLFiles.defparameter("S#5422", (SubLObject)NIL);
        $g1026$ = SubLFiles.defconstant("S#5423", (SubLObject)$ic79$);
        $g1027$ = SubLFiles.defconstant("S#5424", (SubLObject)$ic109$);
        $g1028$ = SubLFiles.defparameter("S#5425", (SubLObject)T);
        $g1029$ = SubLFiles.defconstant("S#5426", (SubLObject)$ic120$);
        $g1030$ = SubLFiles.defconstant("S#5427", (SubLObject)$ic147$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f3956() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1014$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1014$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        module0002.f50((SubLObject)$ic41$, (SubLObject)$ic43$);
        module0002.f50((SubLObject)$ic42$, (SubLObject)$ic43$);
        module0002.f50((SubLObject)$ic39$, (SubLObject)$ic43$);
        module0002.f50((SubLObject)$ic53$, (SubLObject)$ic39$);
        module0002.f50((SubLObject)$ic55$, (SubLObject)$ic39$);
        module0021.f1098($g1020$.getGlobalValue(), (SubLObject)$ic71$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1014$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic72$));
        module0021.f1098($g1021$.getGlobalValue(), (SubLObject)$ic73$);
        module0021.f1098($g1022$.getGlobalValue(), (SubLObject)$ic75$);
        module0021.f1098($g1023$.getGlobalValue(), (SubLObject)$ic77$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1026$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic86$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic87$);
        Structures.def_csetf((SubLObject)$ic88$, (SubLObject)$ic89$);
        Structures.def_csetf((SubLObject)$ic90$, (SubLObject)$ic91$);
        Structures.def_csetf((SubLObject)$ic92$, (SubLObject)$ic93$);
        Equality.identity((SubLObject)$ic79$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1026$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic98$));
        module0021.f1098($g1027$.getGlobalValue(), (SubLObject)$ic110$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1026$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic111$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g1029$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic127$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic128$);
        Structures.def_csetf((SubLObject)$ic129$, (SubLObject)$ic130$);
        Structures.def_csetf((SubLObject)$ic131$, (SubLObject)$ic132$);
        Structures.def_csetf((SubLObject)$ic133$, (SubLObject)$ic134$);
        Structures.def_csetf((SubLObject)$ic135$, (SubLObject)$ic136$);
        Equality.identity((SubLObject)$ic120$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g1029$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic140$));
        module0021.f1098($g1030$.getGlobalValue(), (SubLObject)$ic148$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g1029$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic149$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f3954();
    }
    
    public void initializeVariables() {
        f3955();
    }
    
    public void runTopLevelForms() {
        f3956();
    }
    
    static {
        me = (SubLFile)new module0053();
        $g1014$ = null;
        $g1015$ = null;
        $g1016$ = null;
        $g1017$ = null;
        $g1018$ = null;
        $g1019$ = null;
        $g1020$ = null;
        $g1021$ = null;
        $g1022$ = null;
        $g1023$ = null;
        $g1024$ = null;
        $g1025$ = null;
        $g1026$ = null;
        $g1027$ = null;
        $g1028$ = null;
        $g1029$ = null;
        $g1030$ = null;
        $ic0$ = makeSymbol("S#5253", "CYC");
        $ic1$ = makeSymbol("S#5254", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("S#3266", "CYC"), (SubLObject)makeSymbol("S#5428", "CYC"), (SubLObject)makeSymbol("S#5429", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("TAG"), (SubLObject)makeKeyword("STATE"), (SubLObject)makeKeyword("LOWER"), (SubLObject)makeKeyword("HIGHER"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#5264", "CYC"), (SubLObject)makeSymbol("S#5265", "CYC"), (SubLObject)makeSymbol("BT-LOWER"), (SubLObject)makeSymbol("BT-HIGHER"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#5266", "CYC"), (SubLObject)makeSymbol("S#5267", "CYC"), (SubLObject)makeSymbol("S#5268", "CYC"), (SubLObject)makeSymbol("S#5269", "CYC"));
        $ic6$ = makeSymbol("S#5273", "CYC");
        $ic7$ = makeSymbol("S#5263", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5254", "CYC"));
        $ic9$ = makeSymbol("S#5264", "CYC");
        $ic10$ = makeSymbol("S#5266", "CYC");
        $ic11$ = makeSymbol("S#5265", "CYC");
        $ic12$ = makeSymbol("S#5267", "CYC");
        $ic13$ = makeSymbol("BT-LOWER");
        $ic14$ = makeSymbol("S#5268", "CYC");
        $ic15$ = makeSymbol("BT-HIGHER");
        $ic16$ = makeSymbol("S#5269", "CYC");
        $ic17$ = makeKeyword("TAG");
        $ic18$ = makeKeyword("STATE");
        $ic19$ = makeKeyword("LOWER");
        $ic20$ = makeKeyword("HIGHER");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#5270", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#5272", "CYC");
        $ic27$ = makeString("#<BT:");
        $ic28$ = makeString("@");
        $ic29$ = makeString(":");
        $ic30$ = makeString(">");
        $ic31$ = makeString("[~S]");
        $ic32$ = makeString("BTREE resource lock");
        $ic33$ = makeKeyword("FREE");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#131", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"), (SubLObject)makeSymbol("S#5253", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic36$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic37$ = makeKeyword("DONE");
        $ic38$ = makeUninternedSymbol("US#5E7F1C6");
        $ic39$ = makeSymbol("S#5283", "CYC");
        $ic40$ = makeSymbol("CLET");
        $ic41$ = makeSymbol("S#5281", "CYC");
        $ic42$ = makeSymbol("S#5282", "CYC");
        $ic43$ = makeSymbol("S#5280", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("VAR", "CYC"), (SubLObject)makeSymbol("S#5253", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic45$ = makeUninternedSymbol("US#352BD50");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)NIL));
        $ic47$ = makeSymbol("CDO");
        $ic48$ = makeSymbol("COR");
        $ic49$ = makeSymbol("NULL");
        $ic50$ = makeSymbol("CSETQ");
        $ic51$ = ConsesLow.list((SubLObject)NIL);
        $ic52$ = makeSymbol("S#5428", "CYC");
        $ic53$ = makeSymbol("S#5284", "CYC");
        $ic54$ = makeSymbol("S#5429", "CYC");
        $ic55$ = makeSymbol("S#5285", "CYC");
        $ic56$ = makeSymbol("PCOND");
        $ic57$ = makeSymbol("PWHEN");
        $ic58$ = makeSymbol("CPUSH");
        $ic59$ = ConsesLow.list((SubLObject)makeSymbol("S#5428", "CYC"));
        $ic60$ = ConsesLow.list((SubLObject)makeSymbol("S#5429", "CYC"));
        $ic61$ = makeSymbol("CAR");
        $ic62$ = makeSymbol("CPOP");
        $ic63$ = makeString("Binary Tree ~S is broken before insert!");
        $ic64$ = makeString("Binary Tree ~S is broken after insert!");
        $ic65$ = makeString("Binary Tree ~S is broken before removal!");
        $ic66$ = makeString("Binary Tree ~S is broken after removal!");
        $ic67$ = makeSymbol("TRUE");
        $ic68$ = makeSymbol("S#5294", "CYC");
        $ic69$ = makeString("~S info will be lost inserting ~S into ~S");
        $ic70$ = makeString("The tags ~S were lost from tree ~S");
        $ic71$ = makeSymbol("S#5307", "CYC");
        $ic72$ = makeSymbol("S#5306", "CYC");
        $ic73$ = makeSymbol("S#5308", "CYC");
        $ic74$ = makeInteger(21);
        $ic75$ = makeSymbol("S#5309", "CYC");
        $ic76$ = makeInteger(22);
        $ic77$ = makeSymbol("S#5310", "CYC");
        $ic78$ = makeSymbol("S#5313", "CYC");
        $ic79$ = makeSymbol("S#5255", "CYC");
        $ic80$ = makeSymbol("S#5256", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)makeSymbol("S#5430", "CYC"), (SubLObject)makeSymbol("S#122", "CYC"), (SubLObject)makeSymbol("S#1534", "CYC"));
        $ic82$ = ConsesLow.list((SubLObject)makeKeyword("ROOT"), (SubLObject)makeKeyword("TEST"), (SubLObject)makeKeyword("SIZE"));
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("S#5317", "CYC"), (SubLObject)makeSymbol("S#5318", "CYC"), (SubLObject)makeSymbol("S#5319", "CYC"));
        $ic84$ = ConsesLow.list((SubLObject)makeSymbol("S#5320", "CYC"), (SubLObject)makeSymbol("S#5321", "CYC"), (SubLObject)makeSymbol("S#5322", "CYC"));
        $ic85$ = makeSymbol("S#5326", "CYC");
        $ic86$ = makeSymbol("S#5316", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5256", "CYC"));
        $ic88$ = makeSymbol("S#5317", "CYC");
        $ic89$ = makeSymbol("S#5320", "CYC");
        $ic90$ = makeSymbol("S#5318", "CYC");
        $ic91$ = makeSymbol("S#5321", "CYC");
        $ic92$ = makeSymbol("S#5319", "CYC");
        $ic93$ = makeSymbol("S#5322", "CYC");
        $ic94$ = makeKeyword("ROOT");
        $ic95$ = makeKeyword("TEST");
        $ic96$ = makeKeyword("SIZE");
        $ic97$ = makeSymbol("S#5323", "CYC");
        $ic98$ = makeSymbol("S#5325", "CYC");
        $ic99$ = makeString("#<");
        $ic100$ = makeKeyword("STREAM");
        $ic101$ = makeString("test=~a size=~a");
        $ic102$ = makeKeyword("BASE");
        $ic103$ = makeSymbol("FUNCTION-SPEC-P");
        $ic104$ = makeKeyword("FORWARD");
        $ic105$ = makeSymbol("S#5375", "CYC");
        $ic106$ = makeSymbol("S#5376", "CYC");
        $ic107$ = makeSymbol("S#5379", "CYC");
        $ic108$ = makeSymbol("S#5380", "CYC");
        $ic109$ = makeInteger(80);
        $ic110$ = makeSymbol("S#5344", "CYC");
        $ic111$ = makeSymbol("S#5342", "CYC");
        $ic112$ = ConsesLow.list((SubLObject)MINUS_ONE_INTEGER, (SubLObject)ZERO_INTEGER, (SubLObject)ONE_INTEGER);
        $ic113$ = makeSymbol("<");
        $ic114$ = makeSymbol("S#3846", "CYC");
        $ic115$ = makeSymbol("S#5259", "CYC");
        $ic116$ = makeInteger(-2);
        $ic117$ = makeString("AVL tree ~a is corrupt.");
        $ic118$ = makeString("AVL tree ~a is corrupt");
        $ic119$ = ConsesLow.list((SubLObject)makeSymbol("S#720", "CYC"), (SubLObject)makeSymbol("S#5431", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#5432", "CYC"));
        $ic120$ = makeSymbol("S#5260", "CYC");
        $ic121$ = makeSymbol("S#5261", "CYC");
        $ic122$ = ConsesLow.list((SubLObject)makeSymbol("S#1625", "CYC"), (SubLObject)makeSymbol("S#5433", "CYC"), (SubLObject)makeSymbol("S#5428", "CYC"), (SubLObject)makeSymbol("S#5429", "CYC"));
        $ic123$ = ConsesLow.list((SubLObject)makeKeyword("DATA"), (SubLObject)makeKeyword("BALANCE"), (SubLObject)makeKeyword("LOWER"), (SubLObject)makeKeyword("HIGHER"));
        $ic124$ = ConsesLow.list((SubLObject)makeSymbol("S#5382", "CYC"), (SubLObject)makeSymbol("S#5383", "CYC"), (SubLObject)makeSymbol("S#5384", "CYC"), (SubLObject)makeSymbol("S#5385", "CYC"));
        $ic125$ = ConsesLow.list((SubLObject)makeSymbol("S#5386", "CYC"), (SubLObject)makeSymbol("S#5387", "CYC"), (SubLObject)makeSymbol("S#5388", "CYC"), (SubLObject)makeSymbol("S#5389", "CYC"));
        $ic126$ = makeSymbol("S#5393", "CYC");
        $ic127$ = makeSymbol("S#5381", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#5261", "CYC"));
        $ic129$ = makeSymbol("S#5382", "CYC");
        $ic130$ = makeSymbol("S#5386", "CYC");
        $ic131$ = makeSymbol("S#5383", "CYC");
        $ic132$ = makeSymbol("S#5387", "CYC");
        $ic133$ = makeSymbol("S#5384", "CYC");
        $ic134$ = makeSymbol("S#5388", "CYC");
        $ic135$ = makeSymbol("S#5385", "CYC");
        $ic136$ = makeSymbol("S#5389", "CYC");
        $ic137$ = makeKeyword("DATA");
        $ic138$ = makeKeyword("BALANCE");
        $ic139$ = makeSymbol("S#5390", "CYC");
        $ic140$ = makeSymbol("S#5392", "CYC");
        $ic141$ = makeString("(~a)");
        $ic142$ = makeString("~%Data:    ~a");
        $ic143$ = makeString("~%Balance: ~a");
        $ic144$ = makeString("~%Lower:   ~a");
        $ic145$ = makeString("~%Higher:  ~a");
        $ic146$ = makeString("~%");
        $ic147$ = makeInteger(81);
        $ic148$ = makeSymbol("S#5262", "CYC");
        $ic149$ = makeSymbol("S#5409", "CYC");
    }
    
    public static final class $sX5253_native extends SubLStructNative
    {
        public SubLObject $tag;
        public SubLObject $state;
        public SubLObject $lower;
        public SubLObject $higher;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5253_native() {
            this.$tag = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$lower = (SubLObject)CommonSymbols.NIL;
            this.$higher = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5253_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$tag;
        }
        
        public SubLObject getField3() {
            return this.$state;
        }
        
        public SubLObject getField4() {
            return this.$lower;
        }
        
        public SubLObject getField5() {
            return this.$higher;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$tag = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lower = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$higher = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5253_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$tag", "$state", "$lower", "$higher" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f3802$UnaryFunction extends UnaryFunction
    {
        public $f3802$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5254"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3802(var3);
        }
    }
    
    public static final class $sX5255_native extends SubLStructNative
    {
        public SubLObject $root;
        public SubLObject $test;
        public SubLObject $size;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5255_native() {
            this.$root = (SubLObject)CommonSymbols.NIL;
            this.$test = (SubLObject)CommonSymbols.NIL;
            this.$size = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5255_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$root;
        }
        
        public SubLObject getField3() {
            return this.$test;
        }
        
        public SubLObject getField4() {
            return this.$size;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$root = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$test = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$size = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5255_native.class, $ic79$, $ic80$, $ic81$, $ic82$, new String[] { "$root", "$test", "$size" }, $ic83$, $ic84$, $ic85$);
        }
    }
    
    public static final class $f3858$UnaryFunction extends UnaryFunction
    {
        public $f3858$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5256"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3858(var3);
        }
    }
    
    public static final class $sX5260_native extends SubLStructNative
    {
        public SubLObject $data;
        public SubLObject $balance;
        public SubLObject $lower;
        public SubLObject $higher;
        private static final SubLStructDeclNative structDecl;
        
        public $sX5260_native() {
            this.$data = (SubLObject)CommonSymbols.NIL;
            this.$balance = (SubLObject)CommonSymbols.NIL;
            this.$lower = (SubLObject)CommonSymbols.NIL;
            this.$higher = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX5260_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$data;
        }
        
        public SubLObject getField3() {
            return this.$balance;
        }
        
        public SubLObject getField4() {
            return this.$lower;
        }
        
        public SubLObject getField5() {
            return this.$higher;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$data = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$balance = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$lower = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$higher = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX5260_native.class, $ic120$, $ic121$, $ic122$, $ic123$, new String[] { "$data", "$balance", "$lower", "$higher" }, $ic124$, $ic125$, $ic126$);
        }
    }
    
    public static final class $f3938$UnaryFunction extends UnaryFunction
    {
        public $f3938$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5261"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3938(var3);
        }
    }
    
    public static final class $f3953$UnaryFunction extends UnaryFunction
    {
        public $f3953$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5262"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f3953(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 582 ms
	
	Decompiled with Procyon 0.5.32.
*/