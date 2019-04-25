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
        f3801(var1, var2, (SubLObject)module0053.ZERO_INTEGER);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3802(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5253_native.class) ? module0053.T : module0053.NIL);
    }
    
    public static SubLObject f3803(final SubLObject var1) {
        assert module0053.NIL != f3802(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3804(final SubLObject var1) {
        assert module0053.NIL != f3802(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3805(final SubLObject var1) {
        assert module0053.NIL != f3802(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3806(final SubLObject var1) {
        assert module0053.NIL != f3802(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f3807(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3802(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3808(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3802(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3809(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3802(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3810(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3802(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f3811(SubLObject var5) {
        if (var5 == module0053.UNPROVIDED) {
            var5 = (SubLObject)module0053.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5253_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0053.NIL, var7 = var5; module0053.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0053.$ic17$)) {
                f3807(var6, var9);
            }
            else if (var10.eql((SubLObject)module0053.$ic18$)) {
                f3808(var6, var9);
            }
            else if (var10.eql((SubLObject)module0053.$ic19$)) {
                f3809(var6, var9);
            }
            else if (var10.eql((SubLObject)module0053.$ic20$)) {
                f3810(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0053.$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3812(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic22$, (SubLObject)module0053.$ic23$, (SubLObject)module0053.FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic17$, f3803(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic18$, f3804(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic19$, f3805(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic20$, f3806(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic25$, (SubLObject)module0053.$ic23$, (SubLObject)module0053.FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f3813(final SubLObject var11, final SubLObject var12) {
        return f3812(var11, var12);
    }
    
    public static SubLObject f3801(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLObject var15 = f3806(var13);
        final SubLObject var16 = f3805(var13);
        if (var14.numE((SubLObject)module0053.ZERO_INTEGER)) {
            print_high.princ((SubLObject)module0053.$ic27$, var2);
            if (module0053.NIL != var16) {
                f3801(var16, var2, (SubLObject)module0053.ONE_INTEGER);
            }
            else {
                print_high.princ((SubLObject)module0053.$ic28$, var2);
            }
            print_high.princ((SubLObject)module0053.$ic29$, var2);
            print_high.prin1(f3803(var13), var2);
            print_high.princ((SubLObject)module0053.$ic29$, var2);
            if (module0053.NIL != var15) {
                f3801(var15, var2, (SubLObject)module0053.ONE_INTEGER);
            }
            else {
                print_high.princ((SubLObject)module0053.$ic28$, var2);
            }
            print_high.princ((SubLObject)module0053.$ic30$, var2);
        }
        else {
            PrintLow.format(var2, (SubLObject)module0053.$ic31$, f3803(var13));
        }
        return var13;
    }
    
    public static SubLObject f3814() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        SubLObject var18 = (SubLObject)module0053.NIL;
        final SubLObject var19 = Storage.$current_area$.currentBinding(var17);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var17);
            var18 = f3811((SubLObject)module0053.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f3815(final SubLObject var19) {
        f3807(var19, (SubLObject)module0053.NIL);
        f3808(var19, (SubLObject)module0053.NIL);
        f3809(var19, (SubLObject)module0053.NIL);
        f3810(var19, (SubLObject)module0053.NIL);
        return var19;
    }
    
    public static SubLObject f3816(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0053.NIL != f3802(var13) && f3804(var13) == module0053.$ic33$);
    }
    
    public static SubLObject f3817(SubLObject var13) {
        assert module0053.NIL != f3802(var13) : var13;
        if (module0053.NIL == f3816(var13)) {
            var13 = f3815(var13);
            f3808(var13, (SubLObject)module0053.$ic33$);
            if (module0053.NIL != module0012.$g63$.getGlobalValue()) {
                final SubLObject var14 = module0053.$g1016$.getGlobalValue();
                SubLObject var15 = (SubLObject)module0053.NIL;
                try {
                    var15 = Locks.seize_lock(var14);
                    f3807(var13, module0053.$g1015$.getGlobalValue());
                    module0053.$g1015$.setGlobalValue(var13);
                }
                finally {
                    if (module0053.NIL != var15) {
                        Locks.release_lock(var14);
                    }
                }
            }
            return (SubLObject)module0053.T;
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3818() {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0053.NIL != module0012.$g63$.getGlobalValue()) {
            SubLObject var18 = (SubLObject)module0053.NIL;
            SubLObject var19 = (SubLObject)module0053.NIL;
            final SubLObject var20 = module0053.$g1016$.getGlobalValue();
            SubLObject var21 = (SubLObject)module0053.NIL;
            try {
                var21 = Locks.seize_lock(var20);
                var18 = module0053.$g1015$.getGlobalValue();
                while (module0053.NIL == var19 && module0053.NIL != var18) {
                    if (module0053.NIL != f3816(var18)) {
                        module0053.$g1015$.setGlobalValue(f3803(var18));
                        var19 = (SubLObject)module0053.T;
                    }
                    else {
                        var18 = f3803(var18);
                    }
                }
                if (module0053.NIL == var19) {
                    if (module0053.NIL != module0012.$g64$.getDynamicValue(var17)) {
                        var18 = f3814();
                    }
                    else {
                        var18 = f3811((SubLObject)module0053.UNPROVIDED);
                    }
                    module0053.$g1015$.setGlobalValue((SubLObject)module0053.NIL);
                }
            }
            finally {
                if (module0053.NIL != var21) {
                    Locks.release_lock(var20);
                }
            }
            return f3815(var18);
        }
        if (module0053.NIL != module0012.$g64$.getDynamicValue(var17)) {
            return f3815(f3814());
        }
        return f3815(f3811((SubLObject)module0053.UNPROVIDED));
    }
    
    public static SubLObject f3819(final SubLObject var19) {
        if (module0053.NIL != f3802(var19)) {
            f3819(f3805(var19));
            f3819(f3806(var19));
            final SubLObject var20 = f3804(var19);
            if (module0053.NIL != f3802(var20)) {
                f3819(var20);
            }
            f3817(var19);
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3820(final SubLObject var26, final SubLObject var27) {
        SubLObject var29;
        final SubLObject var28 = var29 = var26.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0053.$ic34$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)module0053.NIL;
        SubLObject var32 = (SubLObject)module0053.NIL;
        SubLObject var33 = (SubLObject)module0053.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0053.$ic34$);
        var31 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0053.$ic34$);
        var32 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0053.$ic34$);
        var33 = var29.first();
        var29 = var29.rest();
        SubLObject var34 = (SubLObject)module0053.NIL;
        SubLObject var35 = var29;
        SubLObject var36 = (SubLObject)module0053.NIL;
        SubLObject var36_37 = (SubLObject)module0053.NIL;
        while (module0053.NIL != var35) {
            cdestructuring_bind.destructuring_bind_must_consp(var35, var28, (SubLObject)module0053.$ic34$);
            var36_37 = var35.first();
            var35 = var35.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var35, var28, (SubLObject)module0053.$ic34$);
            if (module0053.NIL == conses_high.member(var36_37, (SubLObject)module0053.$ic35$, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED)) {
                var36 = (SubLObject)module0053.T;
            }
            if (var36_37 == module0053.$ic36$) {
                var34 = var35.first();
            }
            var35 = var35.rest();
        }
        if (module0053.NIL != var36 && module0053.NIL == var34) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0053.$ic34$);
        }
        final SubLObject var37 = cdestructuring_bind.property_list_member((SubLObject)module0053.$ic37$, var29);
        final SubLObject var38 = (SubLObject)((module0053.NIL != var37) ? conses_high.cadr(var37) : module0053.NIL);
        final SubLObject var39;
        var29 = (var39 = var30);
        final SubLObject var40 = (SubLObject)module0053.$ic38$;
        return (SubLObject)ConsesLow.list((SubLObject)module0053.$ic39$, (SubLObject)ConsesLow.list(var40, var33, (SubLObject)module0053.$ic37$, var38), (SubLObject)ConsesLow.listS((SubLObject)module0053.$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic41$, var40)), (SubLObject)ConsesLow.list(var32, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic42$, var40))), ConsesLow.append(var39, (SubLObject)module0053.NIL)));
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
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0053.$ic44$);
        final SubLObject var30 = var29.rest();
        var29 = var29.first();
        SubLObject var31 = (SubLObject)module0053.NIL;
        SubLObject var32 = (SubLObject)module0053.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0053.$ic44$);
        var31 = var29.first();
        var29 = var29.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0053.$ic44$);
        var32 = var29.first();
        var29 = var29.rest();
        SubLObject var33 = (SubLObject)module0053.NIL;
        SubLObject var34 = var29;
        SubLObject var35 = (SubLObject)module0053.NIL;
        SubLObject var49_50 = (SubLObject)module0053.NIL;
        while (module0053.NIL != var34) {
            cdestructuring_bind.destructuring_bind_must_consp(var34, var28, (SubLObject)module0053.$ic44$);
            var49_50 = var34.first();
            var34 = var34.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var34, var28, (SubLObject)module0053.$ic44$);
            if (module0053.NIL == conses_high.member(var49_50, (SubLObject)module0053.$ic35$, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED)) {
                var35 = (SubLObject)module0053.T;
            }
            if (var49_50 == module0053.$ic36$) {
                var33 = var34.first();
            }
            var34 = var34.rest();
        }
        if (module0053.NIL != var35 && module0053.NIL == var33) {
            cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0053.$ic44$);
        }
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0053.$ic37$, var29);
        final SubLObject var37 = (SubLObject)((module0053.NIL != var36) ? conses_high.cadr(var36) : module0053.NIL);
        final SubLObject var38;
        var29 = (var38 = var30);
        final SubLObject var39 = (SubLObject)module0053.$ic45$;
        return (SubLObject)ConsesLow.list((SubLObject)module0053.$ic40$, (SubLObject)ConsesLow.list(reader.bq_cons(var39, (SubLObject)module0053.$ic46$), (SubLObject)ConsesLow.list(var31, var32)), (SubLObject)ConsesLow.listS((SubLObject)module0053.$ic47$, (SubLObject)module0053.NIL, (SubLObject)ConsesLow.list((SubLObject)((module0053.NIL != var37) ? ConsesLow.list((SubLObject)module0053.$ic48$, var37, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic49$, var31)) : ConsesLow.list((SubLObject)module0053.$ic49$, var31)), (SubLObject)ConsesLow.listS((SubLObject)module0053.$ic50$, var39, (SubLObject)module0053.$ic51$)), ConsesLow.append(var38, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0053.$ic40$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0053.$ic52$, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic53$, var31)), (SubLObject)ConsesLow.list((SubLObject)module0053.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic55$, var31))), (SubLObject)ConsesLow.list((SubLObject)module0053.$ic56$, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic52$, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic57$, (SubLObject)module0053.$ic54$, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic58$, (SubLObject)module0053.$ic54$, var39)), (SubLObject)ConsesLow.listS((SubLObject)module0053.$ic50$, var31, (SubLObject)module0053.$ic59$)), (SubLObject)ConsesLow.list((SubLObject)module0053.$ic54$, (SubLObject)ConsesLow.listS((SubLObject)module0053.$ic50$, var31, (SubLObject)module0053.$ic60$)), (SubLObject)ConsesLow.list((SubLObject)module0053.T, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic50$, var31, (SubLObject)ConsesLow.list((SubLObject)module0053.$ic61$, var39)), (SubLObject)ConsesLow.list((SubLObject)module0053.$ic62$, var39))))))));
    }
    
    public static SubLObject f3824(final SubLObject var19) {
        return f3805(var19);
    }
    
    public static SubLObject f3825(final SubLObject var19) {
        return f3806(var19);
    }
    
    public static SubLObject f3826(final SubLObject var53, final SubLObject var54, final SubLObject var19, final SubLObject var55, final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        if (module0053.NIL != module0053.$g1017$.getDynamicValue(var57) && module0053.NIL == Errors.$ignore_mustsP$.getDynamicValue(var57) && module0053.NIL == f3827(var19, var55, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED)) {
            Errors.error((SubLObject)module0053.$ic63$, var19);
        }
        var57.resetMultipleValues();
        final SubLObject var58 = f3828(var54, var19, var55, (SubLObject)module0053.T);
        final SubLObject var59 = var57.secondMultipleValue();
        var57.resetMultipleValues();
        f3808(var58, (SubLObject)((module0053.NIL != var56) ? Functions.funcall(var56, var53, f3804(var58)) : module0053.NIL));
        final SubLObject var60 = (module0053.NIL != var19) ? var19 : var58;
        if (module0053.NIL != module0053.$g1017$.getDynamicValue(var57) && module0053.NIL == Errors.$ignore_mustsP$.getDynamicValue(var57) && module0053.NIL == f3827(var60, var55, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED)) {
            Errors.error((SubLObject)module0053.$ic64$, var60);
        }
        return var60;
    }
    
    public static SubLObject f3829(final SubLObject var53, final SubLObject var54, final SubLObject var19, final SubLObject var55, final SubLObject var60, SubLObject var61) {
        if (var61 == module0053.UNPROVIDED) {
            var61 = Symbols.symbol_function((SubLObject)module0053.$ic49$);
        }
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (module0053.NIL != module0053.$g1017$.getDynamicValue(var62) && module0053.NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && module0053.NIL == f3827(var19, var55, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED)) {
            Errors.error((SubLObject)module0053.$ic65$, var19);
        }
        var62.resetMultipleValues();
        final SubLObject var63 = f3828(var54, var19, var55, (SubLObject)module0053.UNPROVIDED);
        final SubLObject var64 = var62.secondMultipleValue();
        var62.resetMultipleValues();
        SubLObject var65 = var19;
        if (module0053.NIL != f3802(var63)) {
            f3808(var63, Functions.funcall(var60, var53, f3804(var63)));
            if (module0053.NIL != Functions.funcall(var61, f3804(var63))) {
                var65 = f3830(var63, var64, var19, var55);
            }
        }
        if (module0053.NIL != module0053.$g1017$.getDynamicValue(var62) && module0053.NIL == Errors.$ignore_mustsP$.getDynamicValue(var62) && module0053.NIL == f3827(var65, var55, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED)) {
            Errors.error((SubLObject)module0053.$ic66$, var65);
        }
        return var65;
    }
    
    public static SubLObject f3831(final SubLObject var54, final SubLObject var19, final SubLObject var55) {
        return Values.values(f3828(var54, var19, var55, (SubLObject)module0053.UNPROVIDED));
    }
    
    public static SubLObject f3832(final SubLObject var19) {
        SubLObject var20 = (SubLObject)module0053.NIL;
        SubLObject var21 = (SubLObject)module0053.NIL;
        var20 = (SubLObject)module0053.NIL;
        for (var21 = var19; module0053.NIL != var21; var21 = f3805(var21)) {
            var20 = var21;
        }
        return var20;
    }
    
    public static SubLObject f3833(final SubLObject var19) {
        SubLObject var20 = (SubLObject)module0053.NIL;
        SubLObject var21 = (SubLObject)module0053.NIL;
        var20 = (SubLObject)module0053.NIL;
        for (var21 = var19; module0053.NIL != var21; var21 = f3806(var21)) {
            var20 = var21;
        }
        return var20;
    }
    
    public static SubLObject f3834(final SubLObject var63, final SubLObject var19, SubLObject var64, SubLObject var31) {
        if (var64 == module0053.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0053.$ic67$);
        }
        if (var31 == module0053.UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)module0053.IDENTITY);
        }
        if (module0053.NIL != f3802(var19)) {
            if (module0053.NIL != Functions.funcall(var64, Functions.funcall(var31, var19))) {
                Functions.funcall(var63, Functions.funcall(var31, var19));
            }
            f3834(var63, f3805(var19), var64, var31);
            f3834(var63, f3806(var19), var64, var31);
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3835(final SubLObject var63, final SubLObject var19, SubLObject var64, SubLObject var31) {
        if (var64 == module0053.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0053.$ic67$);
        }
        if (var31 == module0053.UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)module0053.IDENTITY);
        }
        if (module0053.NIL != f3802(var19)) {
            f3835(var63, f3805(var19), var64, var31);
            if (module0053.NIL != Functions.funcall(var64, Functions.funcall(var31, var19))) {
                Functions.funcall(var63, Functions.funcall(var31, var19));
            }
            f3835(var63, f3806(var19), var64, var31);
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3836(final SubLObject var63, final SubLObject var19, SubLObject var64, SubLObject var31) {
        if (var64 == module0053.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0053.$ic67$);
        }
        if (var31 == module0053.UNPROVIDED) {
            var31 = Symbols.symbol_function((SubLObject)module0053.IDENTITY);
        }
        if (module0053.NIL != f3802(var19)) {
            f3836(var63, f3806(var19), var64, var31);
            if (module0053.NIL != Functions.funcall(var64, Functions.funcall(var31, var19))) {
                Functions.funcall(var63, Functions.funcall(var31, var19));
            }
            f3836(var63, f3805(var19), var64, var31);
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3837(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        module0053.$g1018$.setDynamicValue((SubLObject)ConsesLow.cons(f3803(var19), module0053.$g1018$.getDynamicValue(var20)), var20);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3838(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        SubLObject var21 = (SubLObject)module0053.NIL;
        final SubLObject var22 = module0053.$g1018$.currentBinding(var20);
        try {
            module0053.$g1018$.bind((SubLObject)module0053.NIL, var20);
            f3834(Symbols.symbol_function((SubLObject)module0053.$ic68$), var19, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
            var21 = Sequences.nreverse(module0053.$g1018$.getDynamicValue(var20));
        }
        finally {
            module0053.$g1018$.rebind(var22, var20);
        }
        return var21;
    }
    
    public static SubLObject f3839(final SubLObject var19) {
        if (module0053.NIL == var19) {
            return (SubLObject)module0053.ZERO_INTEGER;
        }
        return Numbers.add((SubLObject)module0053.ONE_INTEGER, f3839(f3805(var19)), f3839(f3806(var19)));
    }
    
    public static SubLObject f3840(final SubLObject var19) {
        if (module0053.NIL == var19) {
            return (SubLObject)module0053.ZERO_INTEGER;
        }
        return Numbers.add((SubLObject)module0053.ONE_INTEGER, Numbers.max(f3840(f3805(var19)), f3840(f3806(var19))));
    }
    
    public static SubLObject f3841(final SubLObject var19) {
        if (module0053.NIL == var19) {
            return (SubLObject)module0053.ZERO_INTEGER;
        }
        return Numbers.add((SubLObject)module0053.ONE_INTEGER, Numbers.min(f3841(f3805(var19)), f3841(f3806(var19))));
    }
    
    public static SubLObject f3827(final SubLObject var19, final SubLObject var55, SubLObject var65, SubLObject var66) {
        if (var65 == module0053.UNPROVIDED) {
            var65 = (SubLObject)module0053.NIL;
        }
        if (var66 == module0053.UNPROVIDED) {
            var66 = (SubLObject)module0053.NIL;
        }
        if (module0053.NIL == var19) {
            return (SubLObject)module0053.T;
        }
        final SubLObject var67 = f3803(var19);
        return (SubLObject)SubLObjectFactory.makeBoolean((module0053.NIL == var65 || module0053.NIL != Functions.funcall(var55, var67, var65)) && (module0053.NIL == var66 || module0053.NIL != Functions.funcall(var55, var66, var67)) && module0053.NIL != f3827(f3805(var19), var55, var67, var66) && module0053.NIL != f3827(f3806(var19), var55, var65, var67));
    }
    
    public static SubLObject f3842(final SubLObject var67, final SubLObject var68, final SubLObject var69) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0053.NIL == Functions.funcall(var67, var68, var69) && module0053.NIL == Functions.funcall(var67, var69, var68));
    }
    
    public static SubLObject f3828(final SubLObject var54, final SubLObject var19, final SubLObject var55, SubLObject var70) {
        if (var70 == module0053.UNPROVIDED) {
            var70 = (SubLObject)module0053.NIL;
        }
        SubLObject var71 = (SubLObject)module0053.NIL;
        SubLObject var72 = (SubLObject)module0053.NIL;
        var71 = (SubLObject)module0053.NIL;
        for (var72 = var19; module0053.NIL != var72 && module0053.NIL == f3842(var55, var54, f3803(var72)); var72 = ((module0053.NIL != Functions.funcall(var55, var54, f3803(var72))) ? f3805(var72) : f3806(var72))) {
            var71 = var72;
        }
        if (module0053.NIL == var72 && module0053.NIL != var70) {
            final SubLObject var73 = f3818();
            f3807(var73, var54);
            if (module0053.NIL != var71) {
                f3843(var73, var71, var55);
            }
            var72 = var73;
        }
        return Values.values(var72, var71);
    }
    
    public static SubLObject f3843(final SubLObject var71, final SubLObject var72, final SubLObject var55) {
        final SubLThread var73 = SubLProcess.currentSubLThread();
        if (module0053.NIL != Functions.funcall(var55, f3803(var72), f3803(var71))) {
            if (module0053.NIL == Errors.$ignore_mustsP$.getDynamicValue(var73) && module0053.NIL != f3806(var72)) {
                Errors.error((SubLObject)module0053.$ic69$, f3806(var72), var71, var72);
            }
            f3810(var72, var71);
        }
        else {
            if (module0053.NIL == Errors.$ignore_mustsP$.getDynamicValue(var73) && module0053.NIL != f3805(var72)) {
                Errors.error((SubLObject)module0053.$ic69$, f3805(var72), var71, var72);
            }
            f3809(var72, var71);
        }
        return var72;
    }
    
    public static SubLObject f3830(final SubLObject var57, final SubLObject var58, final SubLObject var73, final SubLObject var55) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        final SubLObject var75 = f3805(var57);
        final SubLObject var76 = f3806(var57);
        SubLObject var77 = (SubLObject)module0053.NIL;
        SubLObject var78 = (SubLObject)module0053.NIL;
        SubLObject var79 = var73;
        SubLObject var80 = (SubLObject)module0053.NIL;
        SubLObject var81 = (SubLObject)module0053.NIL;
        if (module0053.NIL != var75 && module0053.NIL != var76) {
            final SubLObject var82 = random.random((SubLObject)module0053.TWO_INTEGER);
            var77 = (var82.numE((SubLObject)module0053.ZERO_INTEGER) ? var75 : var76);
            var78 = (var82.numE((SubLObject)module0053.ZERO_INTEGER) ? var76 : var75);
        }
        else {
            var77 = (SubLObject)((module0053.NIL != var75) ? var75 : ((module0053.NIL != var76) ? var76 : module0053.NIL));
        }
        if (module0053.NIL != module0053.$g1019$.getDynamicValue(var74)) {
            var80 = f3838(var79);
        }
        if (module0053.NIL != var78) {
            f3844(var78, var77, var55);
        }
        if (module0053.NIL != var58) {
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
        if (module0053.NIL != module0053.$g1019$.getDynamicValue(var74)) {
            var81 = (SubLObject)ConsesLow.cons(f3803(var57), f3838(var79));
            if (module0053.NIL == Errors.$ignore_mustsP$.getDynamicValue(var74) && module0053.NIL == conses_high.subsetp(var80, var81, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED)) {
                Errors.error((SubLObject)module0053.$ic70$, conses_high.set_difference(var80, var81, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
            }
        }
        f3817(var57);
        return var79;
    }
    
    public static SubLObject f3844(final SubLObject var71, final SubLObject var19, final SubLObject var55) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        var72.resetMultipleValues();
        final SubLObject var73 = f3828(f3803(var71), var19, var55, (SubLObject)module0053.UNPROVIDED);
        final SubLObject var74 = var72.secondMultipleValue();
        var72.resetMultipleValues();
        f3843(var71, var74, var55);
        return var19;
    }
    
    public static SubLObject f3845(final SubLObject var19, final SubLObject var2) {
        module0021.f1086(module0053.$g1020$.getGlobalValue(), var2);
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
        SubLObject var3 = (SubLObject)module0053.NIL;
        var3 = f3818();
        f3807(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3808(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3809(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3810(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        return var3;
    }
    
    public static SubLObject f3848(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0053.NIL;
        var3 = f3818();
        f3807(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3808(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3809(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3810(var3, (SubLObject)module0053.NIL);
        return var3;
    }
    
    public static SubLObject f3849(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0053.NIL;
        var3 = f3818();
        f3807(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3808(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3809(var3, (SubLObject)module0053.NIL);
        f3810(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        return var3;
    }
    
    public static SubLObject f3850(final SubLObject var2) {
        SubLObject var3 = (SubLObject)module0053.NIL;
        var3 = f3818();
        f3807(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3808(var3, module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED));
        f3809(var3, (SubLObject)module0053.NIL);
        f3810(var3, (SubLObject)module0053.NIL);
        return var3;
    }
    
    public static SubLObject f3851(final SubLObject var19) {
        if (Numbers.add((SubLObject)module0053.ONE_INTEGER, f3841(var19)).numL(f3840(var19))) {
            return (SubLObject)module0053.NIL;
        }
        return (SubLObject)module0053.T;
    }
    
    public static SubLObject f3852(final SubLObject var19, SubLObject var55) {
        if (var55 == module0053.UNPROVIDED) {
            var55 = (SubLObject)module0053.NIL;
        }
        final SubLThread var56 = SubLProcess.currentSubLThread();
        if (module0053.NIL == var19) {
            return (SubLObject)module0053.NIL;
        }
        SubLObject var57 = (SubLObject)module0053.NIL;
        final SubLObject var58 = f3839(var19);
        final SubLObject var59 = module0053.$g1025$.currentBinding(var56);
        final SubLObject var60 = module0053.$g1024$.currentBinding(var56);
        try {
            module0053.$g1025$.bind(Vectors.make_vector(var58, (SubLObject)module0053.NIL), var56);
            module0053.$g1024$.bind((SubLObject)module0053.ZERO_INTEGER, var56);
            f3835(Symbols.symbol_function((SubLObject)module0053.$ic78$), var19, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
            if (module0053.NIL != var55) {
                module0053.$g1025$.setDynamicValue(Sort.sort(module0053.$g1025$.getDynamicValue(var56), var55, Symbols.symbol_function((SubLObject)module0053.$ic9$)), var56);
            }
            SubLObject var61;
            SubLObject var19_84;
            for (var61 = (SubLObject)module0053.NIL, var61 = (SubLObject)module0053.ZERO_INTEGER; var61.numL(var58); var61 = Numbers.add(var61, (SubLObject)module0053.ONE_INTEGER)) {
                var19_84 = Vectors.aref(module0053.$g1025$.getDynamicValue(var56), var61);
                f3809(var19_84, (SubLObject)module0053.NIL);
                f3810(var19_84, (SubLObject)module0053.NIL);
            }
            var57 = f3853(module0053.$g1025$.getDynamicValue(var56), (SubLObject)module0053.ZERO_INTEGER, var58);
        }
        finally {
            module0053.$g1024$.rebind(var60, var56);
            module0053.$g1025$.rebind(var59, var56);
        }
        return var57;
    }
    
    public static SubLObject f3854(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0053.NIL != f3802(var19)) {
            Vectors.set_aref(module0053.$g1025$.getDynamicValue(var20), module0053.$g1024$.getDynamicValue(var20), var19);
            module0053.$g1024$.setDynamicValue(Numbers.add(module0053.$g1024$.getDynamicValue(var20), (SubLObject)module0053.ONE_INTEGER), var20);
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3853(final SubLObject var85, final SubLObject var86, final SubLObject var87) {
        if (var87.numE(var86)) {
            return (SubLObject)module0053.NIL;
        }
        if (var87.numE(Numbers.add(var86, (SubLObject)module0053.ONE_INTEGER))) {
            final SubLObject var88 = Vectors.aref(var85, var86);
            f3809(var88, (SubLObject)module0053.NIL);
            f3810(var88, (SubLObject)module0053.NIL);
            return var88;
        }
        final SubLObject var89 = f3855(var86, var87);
        final SubLObject var90 = Vectors.aref(var85, var89);
        final SubLObject var91 = f3853(var85, var86, var89);
        final SubLObject var92 = f3853(var85, Numbers.add(var89, (SubLObject)module0053.ONE_INTEGER), var87);
        f3809(var90, var91);
        f3810(var90, var92);
        return var90;
    }
    
    public static SubLObject f3855(final SubLObject var74, final SubLObject var75) {
        if (module0053.NIL != Numbers.evenp(Numbers.subtract(var75, var74))) {
            return Numbers.subtract(Numbers.integerDivide(Numbers.add(var75, var74), (SubLObject)module0053.TWO_INTEGER), random.random((SubLObject)module0053.TWO_INTEGER));
        }
        return Numbers.integerDivide(Numbers.add(var74, var75), (SubLObject)module0053.TWO_INTEGER);
    }
    
    public static SubLObject f3856(final SubLObject var1, final SubLObject var2) {
        f3857(var1, var2, (SubLObject)module0053.ZERO_INTEGER);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3858(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5255_native.class) ? module0053.T : module0053.NIL);
    }
    
    public static SubLObject f3859(final SubLObject var1) {
        assert module0053.NIL != f3858(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3860(final SubLObject var1) {
        assert module0053.NIL != f3858(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3861(final SubLObject var1) {
        assert module0053.NIL != f3858(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3862(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3858(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3863(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3858(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3864(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3858(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3865(SubLObject var5) {
        if (var5 == module0053.UNPROVIDED) {
            var5 = (SubLObject)module0053.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5255_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0053.NIL, var7 = var5; module0053.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0053.$ic94$)) {
                f3862(var6, var9);
            }
            else if (var10.eql((SubLObject)module0053.$ic95$)) {
                f3863(var6, var9);
            }
            else if (var10.eql((SubLObject)module0053.$ic96$)) {
                f3864(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0053.$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3866(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic22$, (SubLObject)module0053.$ic97$, (SubLObject)module0053.THREE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic94$, f3859(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic95$, f3860(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic96$, f3861(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic25$, (SubLObject)module0053.$ic97$, (SubLObject)module0053.THREE_INTEGER);
        return var11;
    }
    
    public static SubLObject f3867(final SubLObject var11, final SubLObject var12) {
        return f3866(var11, var12);
    }
    
    public static SubLObject f3857(final SubLObject var96, final SubLObject var2, final SubLObject var14) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        if (module0053.NIL != print_high.$print_readably$.getDynamicValue(var97)) {
            print_high.print_not_readable(var96, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0053.$ic99$, var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var96), new SubLObject[] { module0053.$ic100$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.format(var2, (SubLObject)module0053.$ic101$, f3860(var96), f3861(var96));
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var96), new SubLObject[] { module0053.$ic100$, var2, module0053.$ic102$, module0053.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var96;
    }
    
    public static SubLObject f3868(final SubLObject var100) {
        assert module0053.NIL != Types.function_spec_p(var100) : var100;
        final SubLObject var101 = f3865((SubLObject)module0053.UNPROVIDED);
        f3863(var101, var100);
        f3864(var101, (SubLObject)module0053.ZERO_INTEGER);
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
        if (var102 == module0053.UNPROVIDED) {
            var102 = (SubLObject)module0053.NIL;
        }
        if (var103 == module0053.UNPROVIDED) {
            var103 = (SubLObject)module0053.NIL;
        }
        return (module0053.NIL != var102) ? f3875(var96, f3859(var96), var102, var103) : f3876(f3859(var96));
    }
    
    public static SubLObject f3877(final SubLObject var96, SubLObject var102, SubLObject var103) {
        if (var102 == module0053.UNPROVIDED) {
            var102 = (SubLObject)module0053.NIL;
        }
        if (var103 == module0053.UNPROVIDED) {
            var103 = (SubLObject)module0053.NIL;
        }
        return (module0053.NIL != var102) ? f3878(var96, f3859(var96), var102, var103) : f3879(f3859(var96));
    }
    
    public static SubLObject f3880(final SubLObject var96, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        var103.resetMultipleValues();
        final SubLObject var104 = f3881(var96, var102);
        final SubLObject var105 = var103.secondMultipleValue();
        var103.resetMultipleValues();
        if (module0053.NIL != var105) {
            f3864(var96, Numbers.add(f3861(var96), (SubLObject)module0053.ONE_INTEGER));
            if (module0053.NIL != var104) {
                f3862(var96, var104);
            }
        }
        return var96;
    }
    
    public static SubLObject f3882(final SubLObject var96, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (module0053.NIL == f3871(var96)) {
            var103.resetMultipleValues();
            final SubLObject var104 = f3883(var96, var102);
            final SubLObject var105 = var103.secondMultipleValue();
            var103.resetMultipleValues();
            if (module0053.NIL != var105) {
                f3864(var96, Numbers.subtract(f3861(var96), (SubLObject)module0053.ONE_INTEGER));
                f3862(var96, var104);
            }
        }
        return var96;
    }
    
    public static SubLObject f3884(final SubLObject var96) {
        f3862(var96, (SubLObject)module0053.NIL);
        f3864(var96, (SubLObject)module0053.ZERO_INTEGER);
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
        if (var64 == module0053.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0053.EQL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(f3861(var109).eql(f3861(var110)) && module0107.f7623(f3860(var109)).eql(module0107.f7623(f3860(var110))) && module0053.NIL != f3888(f3859(var109), f3859(var110), var64));
    }
    
    public static SubLObject f3889(final SubLObject var111, final SubLObject var100) {
        final SubLObject var112 = f3868(var100);
        SubLObject var113 = var111;
        SubLObject var114 = (SubLObject)module0053.NIL;
        var114 = var113.first();
        while (module0053.NIL != var113) {
            f3880(var112, var114);
            var113 = var113.rest();
            var114 = var113.first();
        }
        return var112;
    }
    
    public static SubLObject f3890(final SubLObject var96, SubLObject var113, SubLObject var114, SubLObject var115) {
        if (var113 == module0053.UNPROVIDED) {
            var113 = (SubLObject)module0053.NIL;
        }
        if (var114 == module0053.UNPROVIDED) {
            var114 = (SubLObject)module0053.NIL;
        }
        if (var115 == module0053.UNPROVIDED) {
            var115 = (SubLObject)module0053.$ic104$;
        }
        return module0052.f3689(f3891(var96, var113, var114, var115), (SubLObject)module0053.$ic105$, (SubLObject)module0053.$ic106$, (SubLObject)module0053.$ic67$);
    }
    
    public static SubLObject f3892(final SubLObject var96, SubLObject var113, SubLObject var114, SubLObject var115) {
        if (var113 == module0053.UNPROVIDED) {
            var113 = (SubLObject)module0053.NIL;
        }
        if (var114 == module0053.UNPROVIDED) {
            var114 = (SubLObject)module0053.NIL;
        }
        if (var115 == module0053.UNPROVIDED) {
            var115 = (SubLObject)module0053.$ic104$;
        }
        return module0135.f8839(f3891(var96, var113, var114, var115), (SubLObject)module0053.$ic107$, (SubLObject)module0053.$ic108$, (SubLObject)module0053.$ic67$);
    }
    
    public static SubLObject f3893(final SubLObject var13, final SubLObject var2) {
        return f3894(var13, var2);
    }
    
    public static SubLObject f3894(final SubLObject var96, final SubLObject var2) {
        module0021.f1086(module0053.$g1027$.getGlobalValue(), var2);
        final SubLObject var97 = f3859(var96);
        final SubLObject var98 = f3860(var96);
        final SubLObject var99 = f3861(var96);
        module0021.f1038(var97, var2);
        module0021.f1038(var98, var2);
        module0021.f1038(var99, var2);
        return var96;
    }
    
    public static SubLObject f3895(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
        final SubLObject var5 = module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
        SubLObject var6 = (SubLObject)module0053.NIL;
        var6 = f3865((SubLObject)module0053.UNPROVIDED);
        f3862(var6, var3);
        f3863(var6, var4);
        f3864(var6, var5);
        return var6;
    }
    
    public static SubLObject f3896(final SubLObject var96) {
        return f3897(f3859(var96));
    }
    
    public static SubLObject f3897(final SubLObject var57) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0053.NIL == var57 || (module0053.NIL != module0004.f104(f3898(var57), (SubLObject)module0053.$ic112$, Symbols.symbol_function((SubLObject)module0053.EQL), (SubLObject)module0053.UNPROVIDED) && module0053.NIL != f3897(f3899(var57)) && module0053.NIL != f3897(f3900(var57))));
    }
    
    public static SubLObject f3901(final SubLObject var96) {
        return f3902(f3859(var96));
    }
    
    public static SubLObject f3902(final SubLObject var57) {
        return (SubLObject)((module0053.NIL != var57) ? module0048.f_1X(Numbers.max(f3902(f3899(var57)), f3902(f3900(var57)))) : module0053.ZERO_INTEGER);
    }
    
    public static SubLObject f3903(final SubLObject var96) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0053.NIL != f3871(var96) || module0053.NIL != f3904(f3859(var96)));
    }
    
    public static SubLObject f3904(final SubLObject var57) {
        if (module0053.NIL == var57) {
            return (SubLObject)module0053.ZERO_INTEGER;
        }
        final SubLObject var58 = f3904(f3899(var57));
        if (module0053.NIL == var58) {
            return (SubLObject)module0053.NIL;
        }
        final SubLObject var59 = f3904(f3900(var57));
        if (module0053.NIL != var59 && Numbers.subtract(var59, var58).eql(f3898(var57))) {
            return module0048.f_1X(Numbers.max(var59, var58));
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3905(final SubLObject var96, final SubLObject var118, final SubLObject var119) {
        final SubLObject var120 = f3869(var96);
        if (var120.eql((SubLObject)module0053.$ic113$)) {
            return Numbers.numL(var118, var119);
        }
        if (var120.eql((SubLObject)module0053.$ic114$)) {
            return module0213.f13927(var118, var119, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
        }
        if (var120.eql((SubLObject)module0053.$ic115$)) {
            return module0323.f21852(var118, var119);
        }
        return Functions.funcall(f3869(var96), var118, var119);
    }
    
    public static SubLObject f3906(final SubLObject var96, final SubLObject var118, final SubLObject var119) {
        return f3905(var96, var119, var118);
    }
    
    public static SubLObject f3873(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        if (module0053.NIL == var57) {
            return (SubLObject)module0053.NIL;
        }
        if (module0053.NIL != f3905(var101, var102, f3907(var57))) {
            return f3873(var101, f3899(var57), var102);
        }
        if (module0053.NIL != f3906(var101, var102, f3907(var57))) {
            return f3873(var101, f3900(var57), var102);
        }
        return f3907(var57);
    }
    
    public static SubLObject f3875(final SubLObject var101, final SubLObject var57, final SubLObject var102, final SubLObject var103) {
        if (module0053.NIL == var57) {
            return (SubLObject)module0053.NIL;
        }
        if (module0053.NIL != f3905(var101, var102, f3907(var57))) {
            final SubLObject var104 = f3875(var101, f3899(var57), var102, var103);
            return (module0053.NIL != var104) ? var104 : f3907(var57);
        }
        if (module0053.NIL != f3906(var101, var102, f3907(var57))) {
            return f3875(var101, f3900(var57), var102, var103);
        }
        return (module0053.NIL != var103) ? f3875(var101, f3900(var57), var102, var103) : f3907(var57);
    }
    
    public static SubLObject f3878(final SubLObject var101, final SubLObject var57, final SubLObject var102, final SubLObject var103) {
        if (module0053.NIL == var57) {
            return (SubLObject)module0053.NIL;
        }
        if (module0053.NIL != f3906(var101, var102, f3907(var57))) {
            final SubLObject var104 = f3878(var101, f3900(var57), var102, var103);
            return (module0053.NIL != var104) ? var104 : f3907(var57);
        }
        if (module0053.NIL != f3905(var101, var102, f3907(var57))) {
            return f3878(var101, f3899(var57), var102, var103);
        }
        return (module0053.NIL != var103) ? f3878(var101, f3899(var57), var102, var103) : f3907(var57);
    }
    
    public static SubLObject f3876(final SubLObject var57) {
        return (SubLObject)((module0053.NIL != var57) ? f3907(f3908(var57)) : module0053.NIL);
    }
    
    public static SubLObject f3908(final SubLObject var57) {
        return (module0053.NIL != f3909(var57)) ? f3908(f3899(var57)) : var57;
    }
    
    public static SubLObject f3879(final SubLObject var57) {
        return (SubLObject)((module0053.NIL != var57) ? f3907(f3910(var57)) : module0053.NIL);
    }
    
    public static SubLObject f3910(final SubLObject var57) {
        return (module0053.NIL != f3911(var57)) ? f3910(f3900(var57)) : var57;
    }
    
    public static SubLObject f3881(final SubLObject var101, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        final SubLObject var104 = f3859(var101);
        if (module0053.NIL != var104) {
            var103.resetMultipleValues();
            final SubLObject var105 = f3912(var101, var104, var102);
            final SubLObject var106 = var103.secondMultipleValue();
            final SubLObject var107 = var103.thirdMultipleValue();
            var103.resetMultipleValues();
            return Values.values(var106, module0035.sublisp_boolean(var105));
        }
        return Values.values(f3913(var102, (SubLObject)module0053.ZERO_INTEGER, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL), (SubLObject)module0053.T);
    }
    
    public static SubLObject f3912(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLObject var103 = f3907(var57);
        if (module0053.NIL != f3905(var101, var102, var103)) {
            return f3914(var101, var57, var102);
        }
        if (module0053.NIL != f3906(var101, var102, var103)) {
            return f3915(var101, var57, var102);
        }
        return Values.values((SubLObject)module0053.NIL, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
    }
    
    public static SubLObject f3914(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (module0053.NIL != f3909(var57)) {
            var103.resetMultipleValues();
            final SubLObject var104 = f3912(var101, f3899(var57), var102);
            final SubLObject var105 = var103.secondMultipleValue();
            final SubLObject var106 = var103.thirdMultipleValue();
            var103.resetMultipleValues();
            if (module0053.NIL == var104) {
                return Values.values((SubLObject)module0053.NIL, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            }
            if (module0053.NIL != var105) {
                f3916(var57, var105);
            }
            if (module0053.NIL == var106) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            }
            f3917(var57, (SubLObject)module0053.UNPROVIDED);
            final SubLObject var107 = f3898(var57);
            if (var107.eql((SubLObject)module0053.$ic116$)) {
                final SubLObject var108 = f3918(var57);
                return Values.values(var104, var108, (SubLObject)module0053.NIL);
            }
            if (var107.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.T);
            }
            if (var107.eql((SubLObject)module0053.ZERO_INTEGER)) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            }
            return Errors.error((SubLObject)module0053.$ic117$, var101);
        }
        else {
            final SubLObject var104 = f3913(var102, (SubLObject)module0053.ZERO_INTEGER, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            f3916(var57, var104);
            f3917(var57, (SubLObject)module0053.UNPROVIDED);
            final SubLObject var109 = f3898(var57);
            if (var109.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.T);
            }
            if (var109.eql((SubLObject)module0053.ZERO_INTEGER)) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            }
            return Errors.error((SubLObject)module0053.$ic117$, var101);
        }
    }
    
    public static SubLObject f3915(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (module0053.NIL != f3911(var57)) {
            var103.resetMultipleValues();
            final SubLObject var104 = f3912(var101, f3900(var57), var102);
            final SubLObject var105 = var103.secondMultipleValue();
            final SubLObject var106 = var103.thirdMultipleValue();
            var103.resetMultipleValues();
            if (module0053.NIL == var104) {
                return Values.values((SubLObject)module0053.NIL, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            }
            if (module0053.NIL != var105) {
                f3919(var57, var105);
            }
            if (module0053.NIL == var106) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            }
            f3920(var57, (SubLObject)module0053.UNPROVIDED);
            final SubLObject var107 = f3898(var57);
            if (var107.eql((SubLObject)module0053.ZERO_INTEGER)) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            }
            if (var107.eql((SubLObject)module0053.ONE_INTEGER)) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.T);
            }
            if (var107.eql((SubLObject)module0053.TWO_INTEGER)) {
                final SubLObject var108 = f3921(var57);
                return Values.values(var104, var108, (SubLObject)module0053.NIL);
            }
            return Errors.error((SubLObject)module0053.$ic118$, var101);
        }
        else {
            final SubLObject var104 = f3913(var102, (SubLObject)module0053.ZERO_INTEGER, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            f3919(var57, var104);
            f3920(var57, (SubLObject)module0053.UNPROVIDED);
            final SubLObject var109 = f3898(var57);
            if (var109.eql((SubLObject)module0053.ZERO_INTEGER)) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
            }
            if (var109.eql((SubLObject)module0053.ONE_INTEGER)) {
                return Values.values(var104, (SubLObject)module0053.NIL, (SubLObject)module0053.T);
            }
            return Errors.error((SubLObject)module0053.$ic117$, var101);
        }
    }
    
    public static SubLObject f3883(final SubLObject var101, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        final SubLObject var104 = f3859(var101);
        if (module0053.NIL != var104) {
            var103.resetMultipleValues();
            final SubLObject var105 = f3922(var101, var104, var102);
            final SubLObject var106 = var103.secondMultipleValue();
            final SubLObject var107 = var103.thirdMultipleValue();
            var103.resetMultipleValues();
            return Values.values(var105, var106);
        }
        return Values.values((SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
    }
    
    public static SubLObject f3922(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        if (module0053.NIL != f3905(var101, var102, f3907(var57))) {
            return f3923(var101, var57, var102);
        }
        if (module0053.NIL != f3906(var101, var102, f3907(var57))) {
            return f3924(var101, var57, var102);
        }
        return f3925(var57);
    }
    
    public static SubLObject f3925(final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = f3899(var57);
        SubLObject var60 = f3900(var57);
        if (module0053.NIL == var60) {
            return Values.values(var59, (SubLObject)module0053.T, (SubLObject)module0053.T);
        }
        if (module0053.NIL != f3909(var60)) {
            var58.resetMultipleValues();
            SubLObject var61 = f3926(var57, var60);
            SubLObject var62 = var58.secondMultipleValue();
            var58.resetMultipleValues();
            if (module0053.NIL != var62) {
                SubLObject var63 = f3898(var60);
                if (var63.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                    f3927(var60, (SubLObject)module0053.ZERO_INTEGER);
                }
                else if (var63.eql((SubLObject)module0053.ZERO_INTEGER)) {
                    f3927(var60, (SubLObject)module0053.ONE_INTEGER);
                    var62 = (SubLObject)module0053.NIL;
                }
                else if (var63.eql((SubLObject)module0053.ONE_INTEGER)) {
                    f3927(var60, (SubLObject)module0053.TWO_INTEGER);
                    final SubLObject var64 = f3921(var60);
                    f3919(var61, var64);
                    var62 = (SubLObject)SubLObjectFactory.makeBoolean(!module0053.MINUS_ONE_INTEGER.eql(f3898(var64)));
                }
                if (module0053.NIL != var62) {
                    var63 = f3898(var61);
                    if (var63.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                        f3927(var61, (SubLObject)module0053.$ic116$);
                        var61 = f3918(var61);
                        var62 = (SubLObject)SubLObjectFactory.makeBoolean(!module0053.ONE_INTEGER.eql(f3898(var61)));
                    }
                    else if (var63.eql((SubLObject)module0053.ZERO_INTEGER)) {
                        f3927(var61, (SubLObject)module0053.MINUS_ONE_INTEGER);
                        var62 = (SubLObject)module0053.NIL;
                    }
                    else if (var63.eql((SubLObject)module0053.ONE_INTEGER)) {
                        f3927(var61, (SubLObject)module0053.ZERO_INTEGER);
                    }
                }
            }
            return Values.values(var61, (SubLObject)module0053.T, var62);
        }
        f3916(var60, var59);
        final SubLObject var65 = f3898(var57);
        if (var65.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
            f3927(var60, (SubLObject)module0053.$ic116$);
            var60 = f3918(var60);
            return Values.values(var60, (SubLObject)module0053.T, (SubLObject)SubLObjectFactory.makeBoolean(!module0053.ONE_INTEGER.eql(f3898(var60))));
        }
        if (var65.eql((SubLObject)module0053.ZERO_INTEGER)) {
            f3927(var60, (SubLObject)module0053.MINUS_ONE_INTEGER);
            return Values.values(var60, (SubLObject)module0053.T, (SubLObject)module0053.NIL);
        }
        if (var65.eql((SubLObject)module0053.ONE_INTEGER)) {
            f3927(var60, (SubLObject)module0053.ZERO_INTEGER);
            return Values.values(var60, (SubLObject)module0053.T, (SubLObject)module0053.T);
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3926(final SubLObject var127, final SubLObject var57) {
        final SubLThread var128 = SubLProcess.currentSubLThread();
        final SubLObject var129 = f3899(var57);
        if (module0053.NIL != f3909(var129)) {
            var128.resetMultipleValues();
            final SubLObject var130 = f3926(var127, var129);
            SubLObject var131 = var128.secondMultipleValue();
            var128.resetMultipleValues();
            if (module0053.NIL != var131) {
                final SubLObject var132 = f3898(var129);
                if (var132.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                    f3927(var129, (SubLObject)module0053.ZERO_INTEGER);
                }
                else if (var132.eql((SubLObject)module0053.ZERO_INTEGER)) {
                    f3927(var129, (SubLObject)module0053.ONE_INTEGER);
                    var131 = (SubLObject)module0053.NIL;
                }
                else if (var132.eql((SubLObject)module0053.ONE_INTEGER)) {
                    f3927(var129, (SubLObject)module0053.TWO_INTEGER);
                    final SubLObject var133 = f3921(var129);
                    f3916(var57, var133);
                    if (module0053.MINUS_ONE_INTEGER.eql(f3898(var133))) {
                        var131 = (SubLObject)module0053.NIL;
                    }
                }
            }
            return Values.values(var130, var131);
        }
        f3916(var129, f3899(var127));
        f3916(var57, f3900(var129));
        f3919(var129, f3900(var127));
        f3927(var129, f3898(var127));
        return Values.values(var129, (SubLObject)module0053.T);
    }
    
    public static SubLObject f3923(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (module0053.NIL == f3909(var57)) {
            return Values.values((SubLObject)module0053.NIL, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
        }
        var103.resetMultipleValues();
        final SubLObject var104 = f3922(var101, f3899(var57), var102);
        final SubLObject var105 = var103.secondMultipleValue();
        SubLObject var106 = var103.thirdMultipleValue();
        var103.resetMultipleValues();
        if (module0053.NIL != var105) {
            SubLObject var107 = var57;
            f3916(var57, var104);
            if (module0053.NIL != var106) {
                final SubLObject var108 = f3898(var57);
                if (var108.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                    f3927(var57, (SubLObject)module0053.ZERO_INTEGER);
                }
                else if (var108.eql((SubLObject)module0053.ZERO_INTEGER)) {
                    f3927(var57, (SubLObject)module0053.ONE_INTEGER);
                    var106 = (SubLObject)module0053.NIL;
                }
                else if (var108.eql((SubLObject)module0053.ONE_INTEGER)) {
                    f3927(var57, (SubLObject)module0053.TWO_INTEGER);
                    var107 = f3921(var57);
                    var106 = (SubLObject)SubLObjectFactory.makeBoolean(!module0053.MINUS_ONE_INTEGER.eql(f3898(var107)));
                }
            }
            return Values.values(var107, (SubLObject)module0053.T, var106);
        }
        return Values.values((SubLObject)module0053.NIL, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
    }
    
    public static SubLObject f3924(final SubLObject var101, final SubLObject var57, final SubLObject var102) {
        final SubLThread var103 = SubLProcess.currentSubLThread();
        if (module0053.NIL == f3911(var57)) {
            return Values.values((SubLObject)module0053.NIL, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
        }
        var103.resetMultipleValues();
        final SubLObject var104 = f3922(var101, f3900(var57), var102);
        final SubLObject var105 = var103.secondMultipleValue();
        SubLObject var106 = var103.thirdMultipleValue();
        var103.resetMultipleValues();
        if (module0053.NIL != var105) {
            SubLObject var107 = var57;
            f3919(var57, var104);
            if (module0053.NIL != var106) {
                final SubLObject var108 = f3898(var57);
                if (var108.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                    f3927(var57, (SubLObject)module0053.$ic116$);
                    var107 = f3918(var57);
                    var106 = (SubLObject)SubLObjectFactory.makeBoolean(!module0053.ONE_INTEGER.eql(f3898(var107)));
                }
                else if (var108.eql((SubLObject)module0053.ZERO_INTEGER)) {
                    f3927(var57, (SubLObject)module0053.MINUS_ONE_INTEGER);
                    var106 = (SubLObject)module0053.NIL;
                }
                else if (var108.eql((SubLObject)module0053.ONE_INTEGER)) {
                    f3927(var57, (SubLObject)module0053.ZERO_INTEGER);
                }
            }
            return Values.values(var107, (SubLObject)module0053.T, var106);
        }
        return Values.values((SubLObject)module0053.NIL, (SubLObject)module0053.NIL, (SubLObject)module0053.NIL);
    }
    
    public static SubLObject f3918(final SubLObject var57) {
        final SubLObject var58 = f3899(var57);
        final SubLObject var59 = f3900(var58);
        final SubLObject var60 = f3898(var58);
        if (var60.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
            f3919(var58, var57);
            f3916(var57, var59);
            f3927(var58, (SubLObject)module0053.ZERO_INTEGER);
            f3927(var57, (SubLObject)module0053.ZERO_INTEGER);
            return var58;
        }
        if (var60.eql((SubLObject)module0053.ZERO_INTEGER)) {
            f3919(var58, var57);
            f3916(var57, var59);
            f3927(var58, (SubLObject)module0053.ONE_INTEGER);
            f3927(var57, (SubLObject)module0053.MINUS_ONE_INTEGER);
            return var58;
        }
        if (var60.eql((SubLObject)module0053.ONE_INTEGER)) {
            f3919(var58, f3899(var59));
            f3916(var57, f3900(var59));
            f3919(var59, var57);
            f3916(var59, var58);
            final SubLObject var10_132 = f3898(var59);
            if (var10_132.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                f3927(var57, (SubLObject)module0053.ONE_INTEGER);
                f3927(var58, (SubLObject)module0053.ZERO_INTEGER);
            }
            else if (var10_132.eql((SubLObject)module0053.ZERO_INTEGER)) {
                f3927(var57, (SubLObject)module0053.ZERO_INTEGER);
                f3927(var58, (SubLObject)module0053.ZERO_INTEGER);
            }
            else if (var10_132.eql((SubLObject)module0053.ONE_INTEGER)) {
                f3927(var57, (SubLObject)module0053.ZERO_INTEGER);
                f3927(var58, (SubLObject)module0053.MINUS_ONE_INTEGER);
            }
            f3927(var59, (SubLObject)module0053.ZERO_INTEGER);
            return var59;
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3921(final SubLObject var57) {
        final SubLObject var58 = f3900(var57);
        final SubLObject var59 = f3899(var58);
        final SubLObject var60 = f3898(var58);
        if (var60.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
            f3916(var58, f3900(var59));
            f3919(var57, f3899(var59));
            f3916(var59, var57);
            f3919(var59, var58);
            final SubLObject var10_134 = f3898(var59);
            if (var10_134.eql((SubLObject)module0053.MINUS_ONE_INTEGER)) {
                f3927(var57, (SubLObject)module0053.ZERO_INTEGER);
                f3927(var58, (SubLObject)module0053.ONE_INTEGER);
            }
            else if (var10_134.eql((SubLObject)module0053.ZERO_INTEGER)) {
                f3927(var57, (SubLObject)module0053.ZERO_INTEGER);
                f3927(var58, (SubLObject)module0053.ZERO_INTEGER);
            }
            else if (var10_134.eql((SubLObject)module0053.ONE_INTEGER)) {
                f3927(var57, (SubLObject)module0053.MINUS_ONE_INTEGER);
                f3927(var58, (SubLObject)module0053.ZERO_INTEGER);
            }
            f3927(var59, (SubLObject)module0053.ZERO_INTEGER);
            return var59;
        }
        if (var60.eql((SubLObject)module0053.ZERO_INTEGER)) {
            f3916(var58, var57);
            f3919(var57, var59);
            f3927(var58, (SubLObject)module0053.MINUS_ONE_INTEGER);
            f3927(var57, (SubLObject)module0053.ONE_INTEGER);
            return var58;
        }
        if (var60.eql((SubLObject)module0053.ONE_INTEGER)) {
            f3916(var58, var57);
            f3919(var57, var59);
            f3927(var58, (SubLObject)module0053.ZERO_INTEGER);
            f3927(var57, (SubLObject)module0053.ZERO_INTEGER);
            return var58;
        }
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3891(final SubLObject var96, final SubLObject var113, final SubLObject var114, final SubLObject var115) {
        final SubLObject var116 = module0054.f3968();
        final SubLObject var117 = (var115 == module0053.$ic104$) ? var114 : var113;
        if (module0053.NIL == var113 || module0053.NIL == var114 || module0053.NIL == f3906(var96, var113, var114)) {
            if (var115 == module0053.$ic104$) {
                f3928(var96, f3859(var96), var116, var113, var114);
            }
            else {
                f3929(var96, f3859(var96), var116, var113, var114);
            }
        }
        return (SubLObject)ConsesLow.list(var96, var116, var117, var115);
    }
    
    public static SubLObject f3928(final SubLObject var101, final SubLObject var57, final SubLObject var52, final SubLObject var113, final SubLObject var114) {
        if (module0053.NIL == var57) {
            return var52;
        }
        if (module0053.NIL == var113) {
            if (module0053.NIL == var114 || module0053.NIL == f3906(var101, f3907(var57), var114)) {
                module0054.f3973(var57, var52);
            }
            return f3928(var101, f3899(var57), var52, var113, var114);
        }
        if (module0053.NIL != f3905(var101, var113, f3907(var57))) {
            if (module0053.NIL == var114 || module0053.NIL == f3906(var101, f3907(var57), var114)) {
                module0054.f3973(var57, var52);
            }
            return f3928(var101, f3899(var57), var52, var113, var114);
        }
        if (module0053.NIL != f3906(var101, var113, f3907(var57))) {
            return f3928(var101, f3900(var57), var52, var113, var114);
        }
        module0054.f3973(var57, var52);
        return var52;
    }
    
    public static SubLObject f3929(final SubLObject var101, final SubLObject var57, final SubLObject var52, final SubLObject var113, final SubLObject var114) {
        if (module0053.NIL == var57) {
            return var52;
        }
        if (module0053.NIL == var114) {
            if (module0053.NIL == var113 || module0053.NIL == f3905(var101, f3907(var57), var113)) {
                module0054.f3973(var57, var52);
            }
            return f3929(var101, f3900(var57), var52, var113, var114);
        }
        if (module0053.NIL != f3906(var101, var114, f3907(var57))) {
            if (module0053.NIL == var113 || module0053.NIL == f3905(var101, f3907(var57), var113)) {
                module0054.f3973(var57, var52);
            }
            return f3929(var101, f3900(var57), var52, var113, var114);
        }
        if (module0053.NIL != f3905(var101, var114, f3907(var57))) {
            return f3929(var101, f3899(var57), var52, var113, var114);
        }
        module0054.f3973(var57, var52);
        return var52;
    }
    
    public static SubLObject f3930(final SubLObject var25) {
        SubLObject var26 = (SubLObject)module0053.NIL;
        SubLObject var27 = (SubLObject)module0053.NIL;
        SubLObject var28 = (SubLObject)module0053.NIL;
        SubLObject var29 = (SubLObject)module0053.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)module0053.$ic119$);
        var26 = var25.first();
        SubLObject var30 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var27 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var28 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var29 = var30.first();
        var30 = var30.rest();
        if (module0053.NIL == var30) {
            return module0054.f3970(var27);
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)module0053.$ic119$);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3931(final SubLObject var25) {
        SubLObject var26 = (SubLObject)module0053.NIL;
        SubLObject var27 = (SubLObject)module0053.NIL;
        SubLObject var28 = (SubLObject)module0053.NIL;
        SubLObject var29 = (SubLObject)module0053.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)module0053.$ic119$);
        var26 = var25.first();
        SubLObject var30 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var27 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var28 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var29 = var30.first();
        var30 = var30.rest();
        if (module0053.NIL == var30) {
            final SubLObject var31 = module0054.f3974(var27);
            final SubLObject var32 = f3907(var31);
            if (var29 == module0053.$ic104$) {
                if (module0053.NIL == var28 || module0053.NIL != f3905(var26, var32, var28)) {
                    f3932(var26, f3900(var31), var27, var28);
                }
            }
            else if (module0053.NIL == var28 || module0053.NIL != f3906(var26, var32, var28)) {
                f3933(var26, f3899(var31), var27, var28);
            }
            return Values.values(var32, var25, Types.sublisp_null(var32));
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)module0053.$ic119$);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3932(final SubLObject var101, final SubLObject var57, final SubLObject var52, final SubLObject var135) {
        if (module0053.NIL != var57) {
            if (module0053.NIL == var135 || module0053.NIL == f3906(var101, f3907(var57), var135)) {
                module0054.f3973(var57, var52);
            }
            f3932(var101, f3899(var57), var52, var135);
        }
        return var52;
    }
    
    public static SubLObject f3933(final SubLObject var101, final SubLObject var57, final SubLObject var52, final SubLObject var135) {
        if (module0053.NIL != var57) {
            if (module0053.NIL == var135 || module0053.NIL == f3905(var101, f3907(var57), var135)) {
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
        SubLObject var26 = (SubLObject)module0053.NIL;
        SubLObject var27 = (SubLObject)module0053.NIL;
        SubLObject var28 = (SubLObject)module0053.NIL;
        SubLObject var29 = (SubLObject)module0053.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var25, var25, (SubLObject)module0053.$ic119$);
        var26 = var25.first();
        SubLObject var30 = var25.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var27 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var28 = var30.first();
        var30 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var30, var25, (SubLObject)module0053.$ic119$);
        var29 = var30.first();
        var30 = var30.rest();
        if (module0053.NIL == var30) {
            final SubLObject var31 = module0054.f3974(var27);
            SubLObject var32 = (SubLObject)module0053.NIL;
            if (module0053.NIL != var31) {
                var32 = f3907(var31);
                if (var29 == module0053.$ic104$) {
                    if (module0053.NIL == var28 || module0053.NIL != f3905(var26, var32, var28)) {
                        f3932(var26, f3900(var31), var27, var28);
                    }
                }
                else if (module0053.NIL == var28 || module0053.NIL != f3906(var26, var32, var28)) {
                    f3933(var26, f3899(var31), var27, var28);
                }
            }
            return var32;
        }
        cdestructuring_bind.cdestructuring_bind_error(var25, (SubLObject)module0053.$ic119$);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3936(final SubLObject var1, final SubLObject var2) {
        f3937(var1, var2, (SubLObject)module0053.ZERO_INTEGER);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3938(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX5260_native.class) ? module0053.T : module0053.NIL);
    }
    
    public static SubLObject f3939(final SubLObject var1) {
        assert module0053.NIL != f3938(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f3940(final SubLObject var1) {
        assert module0053.NIL != f3938(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f3941(final SubLObject var1) {
        assert module0053.NIL != f3938(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f3942(final SubLObject var1) {
        assert module0053.NIL != f3938(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f3943(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3938(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f3944(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3938(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f3945(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3938(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f3946(final SubLObject var1, final SubLObject var4) {
        assert module0053.NIL != f3938(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f3947(SubLObject var5) {
        if (var5 == module0053.UNPROVIDED) {
            var5 = (SubLObject)module0053.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX5260_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0053.NIL, var7 = var5; module0053.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0053.$ic137$)) {
                f3943(var6, var9);
            }
            else if (var10.eql((SubLObject)module0053.$ic138$)) {
                f3944(var6, var9);
            }
            else if (var10.eql((SubLObject)module0053.$ic19$)) {
                f3945(var6, var9);
            }
            else if (var10.eql((SubLObject)module0053.$ic20$)) {
                f3946(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0053.$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f3948(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic22$, (SubLObject)module0053.$ic139$, (SubLObject)module0053.FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic137$, f3939(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic138$, f3940(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic19$, f3941(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic24$, (SubLObject)module0053.$ic20$, f3942(var11));
        Functions.funcall(var12, var11, (SubLObject)module0053.$ic25$, (SubLObject)module0053.$ic139$, (SubLObject)module0053.FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f3949(final SubLObject var11, final SubLObject var12) {
        return f3948(var11, var12);
    }
    
    public static SubLObject f3937(final SubLObject var145, final SubLObject var2, final SubLObject var14) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (module0053.NIL != print_high.$print_readably$.getDynamicValue(var146)) {
            print_high.print_not_readable(var145, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0053.$ic99$, var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var145), new SubLObject[] { module0053.$ic100$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            if (module0053.NIL != module0053.$g1028$.getDynamicValue(var146)) {
                PrintLow.format(var2, (SubLObject)module0053.$ic141$, f3939(var145));
            }
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var145), new SubLObject[] { module0053.$ic100$, var2, module0053.$ic102$, module0053.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return var145;
    }
    
    public static SubLObject f3913(final SubLObject var123, SubLObject var149, SubLObject var16, SubLObject var15) {
        if (var149 == module0053.UNPROVIDED) {
            var149 = (SubLObject)module0053.ZERO_INTEGER;
        }
        if (var16 == module0053.UNPROVIDED) {
            var16 = (SubLObject)module0053.NIL;
        }
        if (var15 == module0053.UNPROVIDED) {
            var15 = (SubLObject)module0053.NIL;
        }
        final SubLObject var150 = f3947((SubLObject)module0053.UNPROVIDED);
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
        if (var150 == module0053.UNPROVIDED) {
            var150 = (SubLObject)module0053.ONE_INTEGER;
        }
        f3944(var145, Numbers.add(f3940(var145), var150));
        return var145;
    }
    
    public static SubLObject f3917(final SubLObject var145, SubLObject var150) {
        if (var150 == module0053.UNPROVIDED) {
            var150 = (SubLObject)module0053.ONE_INTEGER;
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
        if (var2 == module0053.UNPROVIDED) {
            var2 = (SubLObject)module0053.T;
        }
        PrintLow.format(var2, (SubLObject)module0053.$ic142$, f3939(var145));
        PrintLow.format(var2, (SubLObject)module0053.$ic143$, f3940(var145));
        PrintLow.format(var2, (SubLObject)module0053.$ic144$, f3941(var145));
        PrintLow.format(var2, (SubLObject)module0053.$ic145$, f3942(var145));
        PrintLow.format(var2, (SubLObject)module0053.$ic146$);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3886(final SubLObject var145) {
        final SubLObject var146 = f3939(var145);
        final SubLObject var147 = f3940(var145);
        SubLObject var148 = f3941(var145);
        SubLObject var149 = f3942(var145);
        if (module0053.NIL != f3938(var148)) {
            var148 = f3886(var148);
        }
        if (module0053.NIL != f3938(var149)) {
            var149 = f3886(var149);
        }
        return f3913(var146, var147, var148, var149);
    }
    
    public static SubLObject f3888(final SubLObject var151, final SubLObject var152, SubLObject var64) {
        if (var64 == module0053.UNPROVIDED) {
            var64 = Symbols.symbol_function((SubLObject)module0053.EQL);
        }
        if (module0053.NIL == var151) {
            return Types.sublisp_null(var152);
        }
        if (module0053.NIL == var152) {
            return (SubLObject)module0053.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0053.NIL != Functions.funcall(var64, f3939(var151), f3939(var152)) && module0053.NIL != f3888(f3941(var151), f3941(var152), var64) && module0053.NIL != f3888(f3942(var151), f3942(var152), var64));
    }
    
    public static SubLObject f3951(final SubLObject var13, final SubLObject var2) {
        return f3952(var13, var2);
    }
    
    public static SubLObject f3952(final SubLObject var57, final SubLObject var2) {
        module0021.f1086(module0053.$g1030$.getGlobalValue(), var2);
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
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
        final SubLObject var5 = module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
        final SubLObject var6 = module0021.f1060(var2, (SubLObject)module0053.UNPROVIDED, (SubLObject)module0053.UNPROVIDED);
        SubLObject var7 = (SubLObject)module0053.NIL;
        var7 = f3947((SubLObject)module0053.UNPROVIDED);
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
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3955() {
        module0053.$g1014$ = SubLFiles.defconstant("S#5411", (SubLObject)module0053.$ic0$);
        module0053.$g1015$ = SubLFiles.deflexical("S#5412", (SubLObject)module0053.NIL);
        module0053.$g1016$ = SubLFiles.deflexical("S#5413", Locks.make_lock((SubLObject)module0053.$ic32$));
        module0053.$g1017$ = SubLFiles.defparameter("S#5414", (SubLObject)module0053.NIL);
        module0053.$g1018$ = SubLFiles.defparameter("S#5415", (SubLObject)module0053.NIL);
        module0053.$g1019$ = SubLFiles.defparameter("S#5416", (SubLObject)module0053.NIL);
        module0053.$g1020$ = SubLFiles.defconstant("S#5417", (SubLObject)module0053.NINETEEN_INTEGER);
        module0053.$g1021$ = SubLFiles.defconstant("S#5418", (SubLObject)module0053.TWENTY_INTEGER);
        module0053.$g1022$ = SubLFiles.defconstant("S#5419", (SubLObject)module0053.$ic74$);
        module0053.$g1023$ = SubLFiles.defconstant("S#5420", (SubLObject)module0053.$ic76$);
        module0053.$g1024$ = SubLFiles.defparameter("S#5421", (SubLObject)module0053.ZERO_INTEGER);
        module0053.$g1025$ = SubLFiles.defparameter("S#5422", (SubLObject)module0053.NIL);
        module0053.$g1026$ = SubLFiles.defconstant("S#5423", (SubLObject)module0053.$ic79$);
        module0053.$g1027$ = SubLFiles.defconstant("S#5424", (SubLObject)module0053.$ic109$);
        module0053.$g1028$ = SubLFiles.defparameter("S#5425", (SubLObject)module0053.T);
        module0053.$g1029$ = SubLFiles.defconstant("S#5426", (SubLObject)module0053.$ic120$);
        module0053.$g1030$ = SubLFiles.defconstant("S#5427", (SubLObject)module0053.$ic147$);
        return (SubLObject)module0053.NIL;
    }
    
    public static SubLObject f3956() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0053.$g1014$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0053.$ic8$);
        Structures.def_csetf((SubLObject)module0053.$ic9$, (SubLObject)module0053.$ic10$);
        Structures.def_csetf((SubLObject)module0053.$ic11$, (SubLObject)module0053.$ic12$);
        Structures.def_csetf((SubLObject)module0053.$ic13$, (SubLObject)module0053.$ic14$);
        Structures.def_csetf((SubLObject)module0053.$ic15$, (SubLObject)module0053.$ic16$);
        Equality.identity((SubLObject)module0053.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0053.$g1014$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic26$));
        module0002.f50((SubLObject)module0053.$ic41$, (SubLObject)module0053.$ic43$);
        module0002.f50((SubLObject)module0053.$ic42$, (SubLObject)module0053.$ic43$);
        module0002.f50((SubLObject)module0053.$ic39$, (SubLObject)module0053.$ic43$);
        module0002.f50((SubLObject)module0053.$ic53$, (SubLObject)module0053.$ic39$);
        module0002.f50((SubLObject)module0053.$ic55$, (SubLObject)module0053.$ic39$);
        module0021.f1098(module0053.$g1020$.getGlobalValue(), (SubLObject)module0053.$ic71$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0053.$g1014$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic72$));
        module0021.f1098(module0053.$g1021$.getGlobalValue(), (SubLObject)module0053.$ic73$);
        module0021.f1098(module0053.$g1022$.getGlobalValue(), (SubLObject)module0053.$ic75$);
        module0021.f1098(module0053.$g1023$.getGlobalValue(), (SubLObject)module0053.$ic77$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0053.$g1026$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic86$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0053.$ic87$);
        Structures.def_csetf((SubLObject)module0053.$ic88$, (SubLObject)module0053.$ic89$);
        Structures.def_csetf((SubLObject)module0053.$ic90$, (SubLObject)module0053.$ic91$);
        Structures.def_csetf((SubLObject)module0053.$ic92$, (SubLObject)module0053.$ic93$);
        Equality.identity((SubLObject)module0053.$ic79$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0053.$g1026$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic98$));
        module0021.f1098(module0053.$g1027$.getGlobalValue(), (SubLObject)module0053.$ic110$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0053.$g1026$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic111$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0053.$g1029$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic127$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0053.$ic128$);
        Structures.def_csetf((SubLObject)module0053.$ic129$, (SubLObject)module0053.$ic130$);
        Structures.def_csetf((SubLObject)module0053.$ic131$, (SubLObject)module0053.$ic132$);
        Structures.def_csetf((SubLObject)module0053.$ic133$, (SubLObject)module0053.$ic134$);
        Structures.def_csetf((SubLObject)module0053.$ic135$, (SubLObject)module0053.$ic136$);
        Equality.identity((SubLObject)module0053.$ic120$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0053.$g1029$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic140$));
        module0021.f1098(module0053.$g1030$.getGlobalValue(), (SubLObject)module0053.$ic148$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0053.$g1029$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0053.$ic149$));
        return (SubLObject)module0053.NIL;
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
        module0053.$g1014$ = null;
        module0053.$g1015$ = null;
        module0053.$g1016$ = null;
        module0053.$g1017$ = null;
        module0053.$g1018$ = null;
        module0053.$g1019$ = null;
        module0053.$g1020$ = null;
        module0053.$g1021$ = null;
        module0053.$g1022$ = null;
        module0053.$g1023$ = null;
        module0053.$g1024$ = null;
        module0053.$g1025$ = null;
        module0053.$g1026$ = null;
        module0053.$g1027$ = null;
        module0053.$g1028$ = null;
        module0053.$g1029$ = null;
        module0053.$g1030$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#5253", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#5254", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#150", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3266", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5428", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5429", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TAG"), (SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("LOWER"), (SubLObject)SubLObjectFactory.makeKeyword("HIGHER"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5264", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5265", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("BT-LOWER"), (SubLObject)SubLObjectFactory.makeSymbol("BT-HIGHER"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5266", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5268", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5269", "CYC"));
        $ic6$ = SubLObjectFactory.makeSymbol("S#5273", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#5263", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5254", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#5264", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#5266", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#5265", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#5267", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("BT-LOWER");
        $ic14$ = SubLObjectFactory.makeSymbol("S#5268", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("BT-HIGHER");
        $ic16$ = SubLObjectFactory.makeSymbol("S#5269", "CYC");
        $ic17$ = SubLObjectFactory.makeKeyword("TAG");
        $ic18$ = SubLObjectFactory.makeKeyword("STATE");
        $ic19$ = SubLObjectFactory.makeKeyword("LOWER");
        $ic20$ = SubLObjectFactory.makeKeyword("HIGHER");
        $ic21$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic22$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic23$ = SubLObjectFactory.makeSymbol("S#5270", "CYC");
        $ic24$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic25$ = SubLObjectFactory.makeKeyword("END");
        $ic26$ = SubLObjectFactory.makeSymbol("S#5272", "CYC");
        $ic27$ = SubLObjectFactory.makeString("#<BT:");
        $ic28$ = SubLObjectFactory.makeString("@");
        $ic29$ = SubLObjectFactory.makeString(":");
        $ic30$ = SubLObjectFactory.makeString(">");
        $ic31$ = SubLObjectFactory.makeString("[~S]");
        $ic32$ = SubLObjectFactory.makeString("BTREE resource lock");
        $ic33$ = SubLObjectFactory.makeKeyword("FREE");
        $ic34$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#131", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5253", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic36$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic37$ = SubLObjectFactory.makeKeyword("DONE");
        $ic38$ = SubLObjectFactory.makeUninternedSymbol("US#5E7F1C6");
        $ic39$ = SubLObjectFactory.makeSymbol("S#5283", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("CLET");
        $ic41$ = SubLObjectFactory.makeSymbol("S#5281", "CYC");
        $ic42$ = SubLObjectFactory.makeSymbol("S#5282", "CYC");
        $ic43$ = SubLObjectFactory.makeSymbol("S#5280", "CYC");
        $ic44$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5253", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic45$ = SubLObjectFactory.makeUninternedSymbol("US#352BD50");
        $ic46$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)module0053.NIL));
        $ic47$ = SubLObjectFactory.makeSymbol("CDO");
        $ic48$ = SubLObjectFactory.makeSymbol("COR");
        $ic49$ = SubLObjectFactory.makeSymbol("NULL");
        $ic50$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic51$ = ConsesLow.list((SubLObject)module0053.NIL);
        $ic52$ = SubLObjectFactory.makeSymbol("S#5428", "CYC");
        $ic53$ = SubLObjectFactory.makeSymbol("S#5284", "CYC");
        $ic54$ = SubLObjectFactory.makeSymbol("S#5429", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("S#5285", "CYC");
        $ic56$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic57$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic58$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic59$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5428", "CYC"));
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5429", "CYC"));
        $ic61$ = SubLObjectFactory.makeSymbol("CAR");
        $ic62$ = SubLObjectFactory.makeSymbol("CPOP");
        $ic63$ = SubLObjectFactory.makeString("Binary Tree ~S is broken before insert!");
        $ic64$ = SubLObjectFactory.makeString("Binary Tree ~S is broken after insert!");
        $ic65$ = SubLObjectFactory.makeString("Binary Tree ~S is broken before removal!");
        $ic66$ = SubLObjectFactory.makeString("Binary Tree ~S is broken after removal!");
        $ic67$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic68$ = SubLObjectFactory.makeSymbol("S#5294", "CYC");
        $ic69$ = SubLObjectFactory.makeString("~S info will be lost inserting ~S into ~S");
        $ic70$ = SubLObjectFactory.makeString("The tags ~S were lost from tree ~S");
        $ic71$ = SubLObjectFactory.makeSymbol("S#5307", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#5306", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#5308", "CYC");
        $ic74$ = SubLObjectFactory.makeInteger(21);
        $ic75$ = SubLObjectFactory.makeSymbol("S#5309", "CYC");
        $ic76$ = SubLObjectFactory.makeInteger(22);
        $ic77$ = SubLObjectFactory.makeSymbol("S#5310", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#5313", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#5255", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#5256", "CYC");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5430", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1534", "CYC"));
        $ic82$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"));
        $ic83$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5317", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5318", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5319", "CYC"));
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5320", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5321", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5322", "CYC"));
        $ic85$ = SubLObjectFactory.makeSymbol("S#5326", "CYC");
        $ic86$ = SubLObjectFactory.makeSymbol("S#5316", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5256", "CYC"));
        $ic88$ = SubLObjectFactory.makeSymbol("S#5317", "CYC");
        $ic89$ = SubLObjectFactory.makeSymbol("S#5320", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#5318", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#5321", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#5319", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#5322", "CYC");
        $ic94$ = SubLObjectFactory.makeKeyword("ROOT");
        $ic95$ = SubLObjectFactory.makeKeyword("TEST");
        $ic96$ = SubLObjectFactory.makeKeyword("SIZE");
        $ic97$ = SubLObjectFactory.makeSymbol("S#5323", "CYC");
        $ic98$ = SubLObjectFactory.makeSymbol("S#5325", "CYC");
        $ic99$ = SubLObjectFactory.makeString("#<");
        $ic100$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic101$ = SubLObjectFactory.makeString("test=~a size=~a");
        $ic102$ = SubLObjectFactory.makeKeyword("BASE");
        $ic103$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic104$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic105$ = SubLObjectFactory.makeSymbol("S#5375", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#5376", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#5379", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#5380", "CYC");
        $ic109$ = SubLObjectFactory.makeInteger(80);
        $ic110$ = SubLObjectFactory.makeSymbol("S#5344", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#5342", "CYC");
        $ic112$ = ConsesLow.list((SubLObject)module0053.MINUS_ONE_INTEGER, (SubLObject)module0053.ZERO_INTEGER, (SubLObject)module0053.ONE_INTEGER);
        $ic113$ = SubLObjectFactory.makeSymbol("<");
        $ic114$ = SubLObjectFactory.makeSymbol("S#3846", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#5259", "CYC");
        $ic116$ = SubLObjectFactory.makeInteger(-2);
        $ic117$ = SubLObjectFactory.makeString("AVL tree ~a is corrupt.");
        $ic118$ = SubLObjectFactory.makeString("AVL tree ~a is corrupt");
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#720", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5431", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5432", "CYC"));
        $ic120$ = SubLObjectFactory.makeSymbol("S#5260", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#5261", "CYC");
        $ic122$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1625", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5433", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5428", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5429", "CYC"));
        $ic123$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATA"), (SubLObject)SubLObjectFactory.makeKeyword("BALANCE"), (SubLObject)SubLObjectFactory.makeKeyword("LOWER"), (SubLObject)SubLObjectFactory.makeKeyword("HIGHER"));
        $ic124$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5382", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5383", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5384", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5385", "CYC"));
        $ic125$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5386", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5387", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5388", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5389", "CYC"));
        $ic126$ = SubLObjectFactory.makeSymbol("S#5393", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("S#5381", "CYC");
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#5261", "CYC"));
        $ic129$ = SubLObjectFactory.makeSymbol("S#5382", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("S#5386", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#5383", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#5387", "CYC");
        $ic133$ = SubLObjectFactory.makeSymbol("S#5384", "CYC");
        $ic134$ = SubLObjectFactory.makeSymbol("S#5388", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("S#5385", "CYC");
        $ic136$ = SubLObjectFactory.makeSymbol("S#5389", "CYC");
        $ic137$ = SubLObjectFactory.makeKeyword("DATA");
        $ic138$ = SubLObjectFactory.makeKeyword("BALANCE");
        $ic139$ = SubLObjectFactory.makeSymbol("S#5390", "CYC");
        $ic140$ = SubLObjectFactory.makeSymbol("S#5392", "CYC");
        $ic141$ = SubLObjectFactory.makeString("(~a)");
        $ic142$ = SubLObjectFactory.makeString("~%Data:    ~a");
        $ic143$ = SubLObjectFactory.makeString("~%Balance: ~a");
        $ic144$ = SubLObjectFactory.makeString("~%Lower:   ~a");
        $ic145$ = SubLObjectFactory.makeString("~%Higher:  ~a");
        $ic146$ = SubLObjectFactory.makeString("~%");
        $ic147$ = SubLObjectFactory.makeInteger(81);
        $ic148$ = SubLObjectFactory.makeSymbol("S#5262", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#5409", "CYC");
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
            structDecl = Structures.makeStructDeclNative((Class)$sX5253_native.class, module0053.$ic0$, module0053.$ic1$, module0053.$ic2$, module0053.$ic3$, new String[] { "$tag", "$state", "$lower", "$higher" }, module0053.$ic4$, module0053.$ic5$, module0053.$ic6$);
        }
    }
    
    public static final class $f3802$UnaryFunction extends UnaryFunction
    {
        public $f3802$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5254"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0053.f3802(var3);
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
            structDecl = Structures.makeStructDeclNative((Class)$sX5255_native.class, module0053.$ic79$, module0053.$ic80$, module0053.$ic81$, module0053.$ic82$, new String[] { "$root", "$test", "$size" }, module0053.$ic83$, module0053.$ic84$, module0053.$ic85$);
        }
    }
    
    public static final class $f3858$UnaryFunction extends UnaryFunction
    {
        public $f3858$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5256"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0053.f3858(var3);
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
            structDecl = Structures.makeStructDeclNative((Class)$sX5260_native.class, module0053.$ic120$, module0053.$ic121$, module0053.$ic122$, module0053.$ic123$, new String[] { "$data", "$balance", "$lower", "$higher" }, module0053.$ic124$, module0053.$ic125$, module0053.$ic126$);
        }
    }
    
    public static final class $f3938$UnaryFunction extends UnaryFunction
    {
        public $f3938$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5261"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0053.f3938(var3);
        }
    }
    
    public static final class $f3953$UnaryFunction extends UnaryFunction
    {
        public $f3953$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#5262"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0053.f3953(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0053.class
	Total time: 582 ms
	
	Decompiled with Procyon 0.5.32.
*/