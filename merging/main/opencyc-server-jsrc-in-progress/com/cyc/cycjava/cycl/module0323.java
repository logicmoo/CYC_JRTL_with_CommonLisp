package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0323 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0323";
    public static final String myFingerPrint = "ffaadcfaf842ea9e9be460e34674ce126560956e45960ed4bad079068ae6b107";
    public static SubLSymbol $g2828$;
    public static SubLSymbol $g2829$;
    public static SubLSymbol $g2830$;
    public static SubLSymbol $g2831$;
    public static SubLSymbol $g2832$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLList $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLList $ic43$;
    private static final SubLSymbol $ic44$;
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
    private static final SubLList $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    
    public static SubLObject f21850(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0051.f3645(var1) || NIL != module0612.f37389(var1) || NIL != module0612.f37388(var1));
    }
    
    public static SubLObject f21851(final SubLObject var2, final SubLObject var3) {
        return Equality.eql(var2, var3);
    }
    
    public static SubLObject f21852(final SubLObject var2, final SubLObject var3) {
        if (NIL != module0612.f37389(var3)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0612.f37389(var2)) {
            return (SubLObject)T;
        }
        if (NIL != module0612.f37388(var2)) {
            return (SubLObject)NIL;
        }
        if (NIL != module0612.f37388(var3)) {
            return (SubLObject)T;
        }
        return module0051.f3653(var2, var3);
    }
    
    public static SubLObject f21853(final SubLObject var2, final SubLObject var3) {
        return (SubLObject)makeBoolean(NIL != f21851(var2, var3) || NIL != f21852(var2, var3));
    }
    
    public static SubLObject f21854(final SubLObject var2, final SubLObject var3) {
        return f21852(var3, var2);
    }
    
    public static SubLObject f21855(final SubLObject var2, final SubLObject var3) {
        return f21853(var3, var2);
    }
    
    public static SubLObject f21856(final SubLObject var4, final SubLObject var5, final SubLObject var6, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return (SubLObject)((NIL != var7) ? makeBoolean(NIL != f21852(var5, var4) && NIL != f21852(var4, var6)) : makeBoolean(NIL != f21853(var5, var4) && NIL != f21853(var4, var6)));
    }
    
    public static SubLObject f21857(SubLObject var8, SubLObject var7) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return module0053.f3874($g2828$.getGlobalValue(), var8, var7);
    }
    
    public static SubLObject f21858(SubLObject var8, SubLObject var7) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        return module0053.f3877($g2828$.getGlobalValue(), var8, var7);
    }
    
    public static SubLObject f21859(final SubLObject var8) {
        assert NIL != f21850(var8) : var8;
        module0053.f3880($g2828$.getGlobalValue(), var8);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21860(final SubLObject var8) {
        assert NIL != f21850(var8) : var8;
        module0053.f3882($g2828$.getGlobalValue(), var8);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21861() {
        module0053.f3884($g2828$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21862(SubLObject var9, SubLObject var10, SubLObject var11) {
        if (var9 == UNPROVIDED) {
            var9 = (SubLObject)NIL;
        }
        if (var10 == UNPROVIDED) {
            var10 = (SubLObject)NIL;
        }
        if (var11 == UNPROVIDED) {
            var11 = (SubLObject)$ic3$;
        }
        return module0053.f3892($g2828$.getGlobalValue(), var9, var10, var11);
    }
    
    public static SubLObject f21863(final SubLObject var12, final SubLObject var13) {
        SubLObject var15;
        final SubLObject var14 = var15 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic4$);
        final SubLObject var16 = var15.rest();
        var15 = var15.first();
        SubLObject var17 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic4$);
        var17 = var15.first();
        var15 = var15.rest();
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = var15;
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21_22 = (SubLObject)NIL;
        while (NIL != var19) {
            cdestructuring_bind.destructuring_bind_must_consp(var19, var14, (SubLObject)$ic4$);
            var21_22 = var19.first();
            var19 = var19.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var19, var14, (SubLObject)$ic4$);
            if (NIL == conses_high.member(var21_22, (SubLObject)$ic5$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var20 = (SubLObject)T;
            }
            if (var21_22 == $ic6$) {
                var18 = var19.first();
            }
            var19 = var19.rest();
        }
        if (NIL != var20 && NIL == var18) {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic4$);
        }
        final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic7$, var15);
        final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic8$, var15);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic9$, var15);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : $ic3$);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var15);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : NIL);
        final SubLObject var29;
        var15 = (var29 = var16);
        final SubLObject var30 = (SubLObject)$ic11$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var30, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var22, var24, var26))), (SubLObject)ConsesLow.listS((SubLObject)$ic14$, (SubLObject)ConsesLow.list(var17, var30, (SubLObject)$ic10$, var28), ConsesLow.append(var29, (SubLObject)NIL)));
    }
    
    public static SubLObject f21864(final SubLObject var30, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (NIL != f21850(var30)) {
            return Values.values(var30, (SubLObject)$ic20$, (SubLObject)NIL);
        }
        if (NIL != module0324.f21976(var30)) {
            return Values.values(module0324.f21931(var30), (SubLObject)$ic20$, (SubLObject)NIL);
        }
        if (NIL != module0138.f8972(module0138.f8979())) {
            return f21865($g2831$.getGlobalValue(), var30, var31);
        }
        return f21865($g2832$.getGlobalValue(), var30, var31);
    }
    
    public static SubLObject f21865(final SubLObject var32, final SubLObject var30, final SubLObject var31) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0067.f4885(var32, var30, (SubLObject)UNPROVIDED);
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        if (NIL != var34) {
            final SubLObject var38 = module0147.$g2095$.currentBinding(var33);
            final SubLObject var39 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var40 = module0147.$g2096$.currentBinding(var33);
            try {
                module0147.$g2095$.bind(module0147.f9545(var31), var33);
                module0147.$g2094$.bind(module0147.f9546(var31), var33);
                module0147.$g2096$.bind(module0147.f9549(var31), var33);
                SubLObject var41;
                for (var41 = module0066.f4838(module0067.f4891(var34)); NIL == module0066.f4841(var41); var41 = module0066.f4840(var41)) {
                    var33.resetMultipleValues();
                    final SubLObject var42 = module0066.f4839(var41);
                    final SubLObject var43 = var33.secondMultipleValue();
                    var33.resetMultipleValues();
                    SubLObject var42_45;
                    for (var42_45 = module0066.f4838(module0067.f4891(var43)); NIL == module0066.f4841(var42_45); var42_45 = module0066.f4840(var42_45)) {
                        var33.resetMultipleValues();
                        final SubLObject var31_46 = module0066.f4839(var42_45);
                        final SubLObject var44 = var33.secondMultipleValue();
                        var33.resetMultipleValues();
                        if (NIL != module0147.f9507(var31_46)) {
                            SubLObject var42_46;
                            for (var42_46 = module0066.f4838(module0067.f4891(var44)); NIL == module0066.f4841(var42_46); var42_46 = module0066.f4840(var42_46)) {
                                var33.resetMultipleValues();
                                final SubLObject var45 = module0066.f4839(var42_46);
                                final SubLObject var46 = var33.secondMultipleValue();
                                var33.resetMultipleValues();
                                if (NIL == var35 || NIL != f21852(var45, var35)) {
                                    var35 = var45;
                                    var36 = var42;
                                    var37 = var46;
                                }
                            }
                            module0066.f4842(var42_46);
                        }
                    }
                    module0066.f4842(var42_45);
                }
                module0066.f4842(var41);
            }
            finally {
                module0147.$g2096$.rebind(var40, var33);
                module0147.$g2094$.rebind(var39, var33);
                module0147.$g2095$.rebind(var38, var33);
            }
        }
        return Values.values(var35, var36, var37);
    }
    
    public static SubLObject f21866(final SubLObject var30, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (NIL != f21850(var30)) {
            return Values.values(var30, (SubLObject)$ic20$, (SubLObject)NIL);
        }
        if (NIL != module0324.f21976(var30)) {
            return Values.values(module0324.f21931(var30), (SubLObject)$ic20$, (SubLObject)NIL);
        }
        if (NIL != module0138.f8972(module0138.f8979())) {
            return f21867($g2831$.getGlobalValue(), var30, var31);
        }
        return f21867($g2832$.getGlobalValue(), var30, var31);
    }
    
    public static SubLObject f21867(final SubLObject var32, final SubLObject var30, final SubLObject var31) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        final SubLObject var34 = module0067.f4885(var32, var30, (SubLObject)UNPROVIDED);
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36 = (SubLObject)NIL;
        SubLObject var37 = (SubLObject)NIL;
        if (NIL != var34) {
            final SubLObject var38 = module0147.$g2095$.currentBinding(var33);
            final SubLObject var39 = module0147.$g2094$.currentBinding(var33);
            final SubLObject var40 = module0147.$g2096$.currentBinding(var33);
            try {
                module0147.$g2095$.bind(module0147.f9545(var31), var33);
                module0147.$g2094$.bind(module0147.f9546(var31), var33);
                module0147.$g2096$.bind(module0147.f9549(var31), var33);
                SubLObject var41;
                for (var41 = module0066.f4838(module0067.f4891(var34)); NIL == module0066.f4841(var41); var41 = module0066.f4840(var41)) {
                    var33.resetMultipleValues();
                    final SubLObject var42 = module0066.f4839(var41);
                    final SubLObject var43 = var33.secondMultipleValue();
                    var33.resetMultipleValues();
                    SubLObject var42_53;
                    for (var42_53 = module0066.f4838(module0067.f4891(var43)); NIL == module0066.f4841(var42_53); var42_53 = module0066.f4840(var42_53)) {
                        var33.resetMultipleValues();
                        final SubLObject var31_54 = module0066.f4839(var42_53);
                        final SubLObject var44 = var33.secondMultipleValue();
                        var33.resetMultipleValues();
                        if (NIL != module0147.f9507(var31_54)) {
                            SubLObject var42_54;
                            for (var42_54 = module0066.f4838(module0067.f4891(var44)); NIL == module0066.f4841(var42_54); var42_54 = module0066.f4840(var42_54)) {
                                var33.resetMultipleValues();
                                final SubLObject var45 = module0066.f4839(var42_54);
                                final SubLObject var46 = var33.secondMultipleValue();
                                var33.resetMultipleValues();
                                if (NIL == var35 || NIL != f21854(var45, var35)) {
                                    var35 = var45;
                                    var36 = var42;
                                    var37 = var46;
                                }
                            }
                            module0066.f4842(var42_54);
                        }
                    }
                    module0066.f4842(var42_53);
                }
                module0066.f4842(var41);
            }
            finally {
                module0147.$g2096$.rebind(var40, var33);
                module0147.$g2094$.rebind(var39, var33);
                module0147.$g2095$.rebind(var38, var33);
            }
        }
        return Values.values(var35, var36, var37);
    }
    
    public static SubLObject f21868(final SubLObject var30, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        return (NIL != module0138.f8972(module0138.f8979())) ? f21864(var30, var31) : f21866(var30, var31);
    }
    
    public static SubLObject f21869(final SubLObject var30, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = var31;
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        final SubLObject var36 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var37 = module0147.$g2096$.currentBinding(var32);
        try {
            module0147.$g2095$.bind(module0147.f9545(var34), var32);
            module0147.$g2094$.bind(module0147.f9546(var34), var32);
            module0147.$g2096$.bind(module0147.f9549(var34), var32);
            var33 = ((NIL != module0138.f8972(module0138.f8979())) ? f21870($g2831$.getGlobalValue(), var30) : f21870($g2832$.getGlobalValue(), var30));
        }
        finally {
            module0147.$g2096$.rebind(var37, var32);
            module0147.$g2094$.rebind(var36, var32);
            module0147.$g2095$.rebind(var35, var32);
        }
        return var33;
    }
    
    public static SubLObject f21871(final SubLObject var17, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)NIL;
        final SubLObject var34 = var31;
        final SubLObject var35 = module0147.$g2095$.currentBinding(var32);
        final SubLObject var36 = module0147.$g2094$.currentBinding(var32);
        final SubLObject var37 = module0147.$g2096$.currentBinding(var32);
        try {
            module0147.$g2095$.bind(module0147.f9545(var34), var32);
            module0147.$g2094$.bind(module0147.f9546(var34), var32);
            module0147.$g2096$.bind(module0147.f9549(var34), var32);
            var33 = ((NIL != module0138.f8972(module0138.f8979())) ? f21870($g2829$.getGlobalValue(), var17) : f21870($g2830$.getGlobalValue(), var17));
        }
        finally {
            module0147.$g2096$.rebind(var37, var32);
            module0147.$g2094$.rebind(var36, var32);
            module0147.$g2095$.rebind(var35, var32);
        }
        return var33;
    }
    
    public static SubLObject f21870(final SubLObject var32, final SubLObject var57) {
        final SubLThread var58 = SubLProcess.currentSubLThread();
        final SubLObject var59 = module0067.f4885(var32, var57, (SubLObject)UNPROVIDED);
        SubLObject var60 = (SubLObject)NIL;
        if (NIL != var59) {
            SubLObject var61;
            for (var61 = module0066.f4838(module0067.f4891(var59)); NIL == var60 && NIL == module0066.f4841(var61); var61 = module0066.f4840(var61)) {
                var58.resetMultipleValues();
                final SubLObject var62 = module0066.f4839(var61);
                final SubLObject var63 = var58.secondMultipleValue();
                var58.resetMultipleValues();
                SubLObject var42_61;
                for (var42_61 = module0066.f4838(module0067.f4891(var63)); NIL == var60 && NIL == module0066.f4841(var42_61); var42_61 = module0066.f4840(var42_61)) {
                    var58.resetMultipleValues();
                    final SubLObject var64 = module0066.f4839(var42_61);
                    final SubLObject var65 = var58.secondMultipleValue();
                    var58.resetMultipleValues();
                    if (NIL != module0147.f9507(var64)) {
                        var60 = (SubLObject)makeBoolean(NIL == module0067.f4882(var65));
                    }
                }
                module0066.f4842(var42_61);
            }
            module0066.f4842(var61);
        }
        return var60;
    }
    
    public static SubLObject f21872(final SubLObject var30, final SubLObject var43, final SubLObject var17, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        return (NIL != module0138.f8972(module0138.f8979())) ? f21873($g2831$.getGlobalValue(), var30, var43, var17, var31) : f21873($g2832$.getGlobalValue(), var30, var43, var17, var31);
    }
    
    public static SubLObject f21874(final SubLObject var17, final SubLObject var43, final SubLObject var30, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        return (NIL != module0138.f8972(module0138.f8979())) ? f21873($g2829$.getGlobalValue(), var17, var43, var30, var31) : f21873($g2830$.getGlobalValue(), var17, var43, var30, var31);
    }
    
    public static SubLObject f21873(final SubLObject var32, final SubLObject var62, final SubLObject var43, final SubLObject var63, final SubLObject var31) {
        final SubLThread var64 = SubLProcess.currentSubLThread();
        final SubLObject var65 = module0067.f4885(var32, var62, (SubLObject)UNPROVIDED);
        SubLObject var66 = (SubLObject)NIL;
        if (NIL != var65) {
            final SubLObject var67 = module0067.f4885(var65, var43, (SubLObject)UNPROVIDED);
            if (NIL != var67) {
                final SubLObject var68 = module0147.$g2095$.currentBinding(var64);
                final SubLObject var69 = module0147.$g2094$.currentBinding(var64);
                final SubLObject var70 = module0147.$g2096$.currentBinding(var64);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var31), var64);
                    module0147.$g2094$.bind(module0147.f9546(var31), var64);
                    module0147.$g2096$.bind(module0147.f9549(var31), var64);
                    SubLObject var71;
                    for (var71 = module0066.f4838(module0067.f4891(var67)); NIL == module0066.f4841(var71); var71 = module0066.f4840(var71)) {
                        var64.resetMultipleValues();
                        final SubLObject var31_65 = module0066.f4839(var71);
                        final SubLObject var72 = var64.secondMultipleValue();
                        var64.resetMultipleValues();
                        if (NIL != module0147.f9507(var31_65)) {
                            var66 = ConsesLow.append(var66, module0067.f4885(var72, var63, (SubLObject)UNPROVIDED));
                        }
                    }
                    module0066.f4842(var71);
                }
                finally {
                    module0147.$g2096$.rebind(var70, var64);
                    module0147.$g2094$.rebind(var69, var64);
                    module0147.$g2095$.rebind(var68, var64);
                }
            }
        }
        return var66;
    }
    
    public static SubLObject f21875() {
        module0067.f4881($g2829$.getGlobalValue());
        module0067.f4881($g2830$.getGlobalValue());
        module0067.f4881($g2831$.getGlobalValue());
        module0067.f4881($g2832$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21876(final SubLObject var66, final SubLObject var67, final SubLObject var62, final SubLObject var63, final SubLObject var31) {
        final SubLObject var68 = module0324.f21931(var62);
        final SubLObject var69 = module0324.f21931(var63);
        SubLObject var70 = (SubLObject)NIL;
        if (NIL != f21850(var68) && NIL == f21850(var69)) {
            var70 = f21877($g2829$.getGlobalValue(), var66, var67, var68, var63, var31);
            f21877($g2832$.getGlobalValue(), var66, var67, var63, var68, var31);
            f21859(var68);
        }
        else if (NIL == f21850(var68) && NIL != f21850(var69)) {
            var70 = f21877($g2831$.getGlobalValue(), var66, var67, var62, var69, var31);
            f21877($g2830$.getGlobalValue(), var66, var67, var69, var62, var31);
            f21859(var69);
        }
        return var70;
    }
    
    public static SubLObject f21877(final SubLObject var32, final SubLObject var66, final SubLObject var67, final SubLObject var71, final SubLObject var72, final SubLObject var31) {
        SubLObject var73 = module0067.f4885(var32, var71, (SubLObject)UNPROVIDED);
        SubLObject var74 = (SubLObject)NIL;
        if (NIL == var73) {
            var73 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            module0067.f4886(var32, var71, var73);
        }
        SubLObject var75 = module0067.f4885(var73, var67, (SubLObject)UNPROVIDED);
        if (NIL == var75) {
            var75 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
            module0067.f4886(var73, var67, var75);
        }
        SubLObject var76 = module0067.f4885(var75, var31, (SubLObject)UNPROVIDED);
        if (NIL == var76) {
            var76 = module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
            module0067.f4886(var75, var31, var76);
        }
        final SubLObject var77 = module0067.f4885(var76, var72, (SubLObject)UNPROVIDED);
        if (NIL == var77) {
            var74 = (SubLObject)T;
        }
        if (NIL == module0004.f104(var66, var77, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED)) {
            module0084.f5762(var76, var72, var66);
        }
        return var74;
    }
    
    public static SubLObject f21878(final SubLObject var66, final SubLObject var67, final SubLObject var62, final SubLObject var63, final SubLObject var31) {
        final SubLObject var68 = module0324.f21931(var62);
        final SubLObject var69 = module0324.f21931(var63);
        if (NIL != f21850(var68) && NIL == f21850(var69)) {
            f21879($g2829$.getGlobalValue(), var66, var67, var68, var63, var31);
            f21879($g2832$.getGlobalValue(), var66, var67, var63, var68, var31);
            if (NIL == module0067.f4885($g2829$.getGlobalValue(), var68, (SubLObject)UNPROVIDED) && NIL == module0067.f4885($g2830$.getGlobalValue(), var68, (SubLObject)UNPROVIDED)) {
                f21860(var68);
            }
        }
        else if (NIL == f21850(var68) && NIL != f21850(var69)) {
            f21879($g2831$.getGlobalValue(), var66, var67, var62, var69, var31);
            f21879($g2830$.getGlobalValue(), var66, var67, var69, var62, var31);
            if (NIL == module0067.f4885($g2829$.getGlobalValue(), var69, (SubLObject)UNPROVIDED) && NIL == module0067.f4885($g2830$.getGlobalValue(), var69, (SubLObject)UNPROVIDED)) {
                f21860(var69);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21879(final SubLObject var32, final SubLObject var66, final SubLObject var67, final SubLObject var71, final SubLObject var72, final SubLObject var31) {
        final SubLObject var73 = module0067.f4885(var32, var71, (SubLObject)UNPROVIDED);
        if (NIL != var73) {
            final SubLObject var74 = module0067.f4885(var73, var67, (SubLObject)UNPROVIDED);
            if (NIL != var74) {
                final SubLObject var75 = module0067.f4885(var74, var31, (SubLObject)UNPROVIDED);
                if (NIL != var75) {
                    module0084.f5772(var75, var72, var66, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    if (NIL != module0067.f4882(var75)) {
                        module0067.f4887(var74, var31);
                        if (NIL != module0067.f4882(var74)) {
                            module0067.f4887(var73, var67);
                            if (NIL != module0067.f4882(var73)) {
                                module0067.f4887(var73, var31);
                            }
                        }
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21880(final SubLObject var75, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f1997(var75)) {
            final SubLObject var77 = var75.first();
            var76.resetMultipleValues();
            final SubLObject var78 = f21864(var77, var31);
            final SubLObject var79 = var76.secondMultipleValue();
            final SubLObject var80 = var76.thirdMultipleValue();
            var76.resetMultipleValues();
            return (NIL != var78) ? Values.values(var77, var78, var79) : Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = var75;
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            var76.resetMultipleValues();
            final SubLObject var86 = f21864(var85, var31);
            final SubLObject var87 = var76.secondMultipleValue();
            final SubLObject var88 = var76.thirdMultipleValue();
            var76.resetMultipleValues();
            if (NIL != var86 && (NIL == var82 || NIL != f21852(var86, var82))) {
                var81 = var85;
                var82 = var86;
                var83 = var87;
            }
            var84 = var84.rest();
            var85 = var84.first();
        }
        return Values.values(var81, var82, var83);
    }
    
    public static SubLObject f21881(final SubLObject var75, SubLObject var31) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        final SubLThread var76 = SubLProcess.currentSubLThread();
        if (NIL != module0035.f1997(var75)) {
            final SubLObject var77 = var75.first();
            var76.resetMultipleValues();
            final SubLObject var78 = f21866(var77, var31);
            final SubLObject var79 = var76.secondMultipleValue();
            final SubLObject var80 = var76.thirdMultipleValue();
            var76.resetMultipleValues();
            return (NIL != var78) ? Values.values(var77, var78, var79) : Values.values((SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
        }
        SubLObject var81 = (SubLObject)NIL;
        SubLObject var82 = (SubLObject)NIL;
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = var75;
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            var76.resetMultipleValues();
            final SubLObject var86 = f21866(var85, var31);
            final SubLObject var87 = var76.secondMultipleValue();
            final SubLObject var88 = var76.thirdMultipleValue();
            var76.resetMultipleValues();
            if (NIL != var86 && (NIL == var82 || NIL != f21854(var86, var82))) {
                var81 = var85;
                var82 = var86;
                var83 = var87;
            }
            var84 = var84.rest();
            var85 = var84.first();
        }
        return Values.values(var81, var82, var83);
    }
    
    public static SubLObject f21882(final SubLObject var30, SubLObject var31, SubLObject var87) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var87 == UNPROVIDED) {
            var87 = (SubLObject)ZERO_INTEGER;
        }
        final SubLThread var88 = SubLProcess.currentSubLThread();
        SubLObject var89 = (SubLObject)NIL;
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        assert NIL != Types.integerp(var87) : var87;
        final SubLObject var92 = module0142.$g1731$.currentBinding(var88);
        final SubLObject var93 = module0142.$g1729$.currentBinding(var88);
        try {
            module0142.$g1731$.bind(var87, var88);
            module0142.$g1729$.bind((SubLObject)NIL, var88);
            if (NIL != module0138.f8972(module0138.f8979())) {
                var88.resetMultipleValues();
                final SubLObject var91_92 = f21880(module0252.f16245(module0137.f8955($ic22$), var30, var31, (SubLObject)UNPROVIDED), var31);
                final SubLObject var93_94 = var88.secondMultipleValue();
                final SubLObject var95_96 = var88.thirdMultipleValue();
                var88.resetMultipleValues();
                var89 = var91_92;
                var90 = var93_94;
                var91 = var95_96;
            }
            else {
                var88.resetMultipleValues();
                final SubLObject var97_98 = f21881(module0252.f16248(module0137.f8955($ic22$), var30, var31, (SubLObject)UNPROVIDED), var31);
                final SubLObject var99_100 = var88.secondMultipleValue();
                final SubLObject var101_102 = var88.thirdMultipleValue();
                var88.resetMultipleValues();
                var89 = var97_98;
                var90 = var99_100;
                var91 = var101_102;
            }
        }
        finally {
            module0142.$g1729$.rebind(var93, var88);
            module0142.$g1731$.rebind(var92, var88);
        }
        return Values.values(var89, var90, var91);
    }
    
    public static SubLObject f21883(final SubLObject var12, final SubLObject var13) {
        SubLObject var15;
        final SubLObject var14 = var15 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic23$);
        final SubLObject var16 = var15.rest();
        var15 = var15.first();
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic23$);
        var17 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic23$);
        var18 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic23$);
        var19 = var15.first();
        var15 = var15.rest();
        final SubLObject var20 = (SubLObject)(var15.isCons() ? var15.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var15, var14, (SubLObject)$ic23$);
        var15 = var15.rest();
        if (NIL != var15) {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic23$);
            return (SubLObject)NIL;
        }
        var15 = var16;
        SubLObject var21 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic23$);
        var21 = var15.first();
        final SubLObject var22;
        var15 = (var22 = var15.rest());
        if (NIL == var20) {
            final SubLObject var108_110 = (SubLObject)$ic24$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic25$, (SubLObject)ConsesLow.list(var17, var18, var19, var108_110), var21, (SubLObject)ConsesLow.list((SubLObject)$ic26$, var108_110), ConsesLow.append(var22, (SubLObject)NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var17, var18, var19, (SubLObject)$ic28$, var20), var21, ConsesLow.append(var22, (SubLObject)NIL));
    }
    
    public static SubLObject f21884(final SubLObject var12, final SubLObject var13) {
        SubLObject var15;
        final SubLObject var14 = var15 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic29$);
        final SubLObject var16 = var15.rest();
        var15 = var15.first();
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic29$);
        var17 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic29$);
        var18 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic29$);
        var19 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic29$);
        var20 = var15.first();
        var15 = var15.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var15;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var120_121 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var14, (SubLObject)$ic29$);
            var120_121 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var14, (SubLObject)$ic29$);
            if (NIL == conses_high.member(var120_121, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var120_121 == $ic6$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic29$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic31$, var15);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic32$, var15);
        final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var15);
        final SubLObject var29 = (SubLObject)((NIL != var28) ? conses_high.cadr(var28) : NIL);
        final SubLObject var30;
        var15 = (var30 = var16);
        final SubLObject var31 = (SubLObject)$ic33$;
        final SubLObject var32 = (SubLObject)$ic34$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var31, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var20, (SubLObject)$ic36$, var25, var27))), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list(var32, var31, (SubLObject)$ic10$, var29), (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var17, var18, var19), var32, ConsesLow.append(var30, (SubLObject)NIL))));
    }
    
    public static SubLObject f21885(final SubLObject var12, final SubLObject var13) {
        SubLObject var15;
        final SubLObject var14 = var15 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic37$);
        final SubLObject var16 = var15.rest();
        var15 = var15.first();
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        SubLObject var20 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic37$);
        var17 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic37$);
        var18 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic37$);
        var19 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic37$);
        var20 = var15.first();
        var15 = var15.rest();
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = var15;
        SubLObject var23 = (SubLObject)NIL;
        SubLObject var136_137 = (SubLObject)NIL;
        while (NIL != var22) {
            cdestructuring_bind.destructuring_bind_must_consp(var22, var14, (SubLObject)$ic37$);
            var136_137 = var22.first();
            var22 = var22.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var22, var14, (SubLObject)$ic37$);
            if (NIL == conses_high.member(var136_137, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var23 = (SubLObject)T;
            }
            if (var136_137 == $ic6$) {
                var21 = var22.first();
            }
            var22 = var22.rest();
        }
        if (NIL != var23 && NIL == var21) {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic37$);
        }
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var15);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26;
        var15 = (var26 = var16);
        final SubLObject var27 = (SubLObject)$ic39$;
        final SubLObject var28 = (SubLObject)$ic40$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var27, (SubLObject)ConsesLow.listS((SubLObject)$ic41$, var19, var20, (SubLObject)$ic42$))), (SubLObject)ConsesLow.list((SubLObject)$ic14$, (SubLObject)ConsesLow.list(var28, var27, (SubLObject)$ic10$, var25), (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var17, var18), var28, ConsesLow.append(var26, (SubLObject)NIL))));
    }
    
    public static SubLObject f21886(final SubLObject var12, final SubLObject var13) {
        SubLObject var15;
        final SubLObject var14 = var15 = var12.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic43$);
        final SubLObject var16 = var15.rest();
        var15 = var15.first();
        SubLObject var17 = (SubLObject)NIL;
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic43$);
        var17 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic43$);
        var18 = var15.first();
        var15 = var15.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic43$);
        var19 = var15.first();
        var15 = var15.rest();
        SubLObject var20 = (SubLObject)NIL;
        SubLObject var21 = var15;
        SubLObject var22 = (SubLObject)NIL;
        SubLObject var145_146 = (SubLObject)NIL;
        while (NIL != var21) {
            cdestructuring_bind.destructuring_bind_must_consp(var21, var14, (SubLObject)$ic43$);
            var145_146 = var21.first();
            var21 = var21.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var21, var14, (SubLObject)$ic43$);
            if (NIL == conses_high.member(var145_146, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var22 = (SubLObject)T;
            }
            if (var145_146 == $ic6$) {
                var20 = var21.first();
            }
            var21 = var21.rest();
        }
        if (NIL != var22 && NIL == var20) {
            cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic43$);
        }
        final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic31$, var15);
        final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
        final SubLObject var25 = cdestructuring_bind.property_list_member((SubLObject)$ic32$, var15);
        final SubLObject var26 = (SubLObject)((NIL != var25) ? conses_high.cadr(var25) : NIL);
        final SubLObject var27 = cdestructuring_bind.property_list_member((SubLObject)$ic10$, var15);
        final SubLObject var28 = (SubLObject)((NIL != var27) ? conses_high.cadr(var27) : NIL);
        final SubLObject var29;
        var15 = (var29 = var16);
        final SubLObject var30 = (SubLObject)$ic44$;
        final SubLObject var31 = (SubLObject)$ic45$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic12$, (SubLObject)ConsesLow.list(var30, var31), (SubLObject)ConsesLow.list((SubLObject)$ic46$, (SubLObject)$ic47$, (SubLObject)ConsesLow.list((SubLObject)$ic48$, var30, (SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var24, (SubLObject)ConsesLow.list((SubLObject)$ic1$, var19, var24)), var24, var19), var31, var26), (SubLObject)ConsesLow.list((SubLObject)$ic48$, var30, var24, var31, (SubLObject)ConsesLow.list((SubLObject)$ic49$, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var26, (SubLObject)ConsesLow.list((SubLObject)$ic51$, var19, var26)), var26, var19))), (SubLObject)ConsesLow.listS((SubLObject)$ic52$, (SubLObject)ConsesLow.list(var17, var18, var30, var31, (SubLObject)$ic10$, var28), ConsesLow.append(var29, (SubLObject)NIL)));
    }
    
    public static SubLObject f21887(final SubLObject var30, SubLObject var11, SubLObject var123, SubLObject var125) {
        if (var11 == UNPROVIDED) {
            var11 = module0138.f8979();
        }
        if (var123 == UNPROVIDED) {
            var123 = (SubLObject)NIL;
        }
        if (var125 == UNPROVIDED) {
            var125 = (SubLObject)NIL;
        }
        final SubLObject var126 = (NIL != module0138.f8972(var11)) ? module0067.f4885($g2831$.getGlobalValue(), var30, (SubLObject)UNPROVIDED) : module0067.f4885($g2832$.getGlobalValue(), var30, (SubLObject)UNPROVIDED);
        SubLObject var127 = (SubLObject)NIL;
        if (NIL != var126 && (NIL == var123 || NIL == var125 || NIL == f21854(var123, var125))) {
            var127 = f21888(var126, var11, var123, var125);
        }
        return (NIL != var127) ? module0135.f8839(var127, (SubLObject)$ic53$, (SubLObject)$ic54$, (SubLObject)$ic55$) : module0135.f8853();
    }
    
    public static SubLObject f21888(final SubLObject var150, final SubLObject var11, final SubLObject var123, final SubLObject var125) {
        final SubLObject var151 = f21889(var150);
        final SubLObject var152 = module0135.f8844(var151);
        return (SubLObject)((NIL != var152) ? f21890(var152, var151, var11, var123, var125) : NIL);
    }
    
    public static SubLObject f21890(SubLObject var153, final SubLObject var152, final SubLObject var11, final SubLObject var123, final SubLObject var125) {
        final SubLObject var154 = Vectors.make_vector((SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
        SubLObject var155 = conses_high.third(var153);
        if (NIL != module0138.f8972(var11)) {
            SubLObject var157;
            for (SubLObject var156 = (SubLObject)NIL; NIL == var156; var156 = Types.sublisp_null(var157)) {
                var157 = module0135.f8844(var152);
                if (NIL != var157) {
                    final SubLObject var158 = conses_high.third(var157);
                    if (NIL != f21852(var158, var155)) {
                        var153 = var157;
                        var155 = var158;
                    }
                }
            }
            final SubLObject var159 = (NIL != var123 && NIL != f21852(var155, var123)) ? var123 : var155;
            Vectors.set_aref(var154, (SubLObject)ZERO_INTEGER, var153);
            Vectors.set_aref(var154, (SubLObject)ONE_INTEGER, f21891(var159, var125, var11));
        }
        else {
            SubLObject var157;
            for (SubLObject var156 = (SubLObject)NIL; NIL == var156; var156 = Types.sublisp_null(var157)) {
                var157 = module0135.f8844(var152);
                if (NIL != var157) {
                    final SubLObject var158 = conses_high.third(var157);
                    if (NIL != f21854(var158, var155)) {
                        var153 = var157;
                        var155 = var158;
                    }
                }
            }
            final SubLObject var160 = (NIL != var125 && NIL != f21854(var155, var125)) ? var125 : var155;
            Vectors.set_aref(var154, (SubLObject)ZERO_INTEGER, var153);
            Vectors.set_aref(var154, (SubLObject)ONE_INTEGER, f21891(var123, var160, var11));
        }
        return var154;
    }
    
    public static SubLObject f21892(final SubLObject var151) {
        return (SubLObject)makeBoolean(NIL == Vectors.aref(var151, (SubLObject)ONE_INTEGER) || NIL != module0135.f8838(Vectors.aref(var151, (SubLObject)ONE_INTEGER)));
    }
    
    public static SubLObject f21893(final SubLObject var151) {
        final SubLObject var152 = module0135.f8844(Vectors.aref(var151, (SubLObject)ONE_INTEGER));
        return (SubLObject)((NIL != var152) ? ConsesLow.cons(Vectors.aref(var151, (SubLObject)ZERO_INTEGER), var152) : NIL);
    }
    
    public static SubLObject f21894(final SubLObject var151) {
        return (SubLObject)((NIL != Vectors.aref(var151, (SubLObject)ONE_INTEGER)) ? module0135.f8849(Vectors.aref(var151, (SubLObject)ONE_INTEGER)) : T);
    }
    
    public static SubLObject f21895(final SubLObject var30, SubLObject var11) {
        if (var11 == UNPROVIDED) {
            var11 = module0138.f8979();
        }
        final SubLObject var31 = (NIL != module0138.f8972(var11)) ? module0067.f4885($g2831$.getGlobalValue(), var30, (SubLObject)UNPROVIDED) : module0067.f4885($g2832$.getGlobalValue(), var30, (SubLObject)UNPROVIDED);
        return (NIL != var31) ? f21889(var31) : module0135.f8853();
    }
    
    public static SubLObject f21891(final SubLObject var9, final SubLObject var10, final SubLObject var11) {
        return module0135.f8839(f21896(var9, var10, var11), (SubLObject)$ic56$, (SubLObject)$ic57$, (SubLObject)$ic58$);
    }
    
    public static SubLObject f21896(final SubLObject var9, final SubLObject var10, final SubLObject var11) {
        final SubLObject var12 = Vectors.make_vector((SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED);
        Vectors.set_aref(var12, (SubLObject)ONE_INTEGER, var11);
        Vectors.set_aref(var12, (SubLObject)THREE_INTEGER, (NIL != module0138.f8972(var11)) ? f21862(var9, var10, (SubLObject)$ic3$) : f21862(var9, var10, (SubLObject)$ic59$));
        return var12;
    }
    
    public static SubLObject f21897(final SubLObject var151) {
        return (SubLObject)makeBoolean((NIL == Vectors.aref(var151, (SubLObject)TWO_INTEGER) || NIL != module0135.f8838(Vectors.aref(var151, (SubLObject)TWO_INTEGER))) && (NIL == Vectors.aref(var151, (SubLObject)THREE_INTEGER) || NIL != module0135.f8838(Vectors.aref(var151, (SubLObject)THREE_INTEGER))));
    }
    
    public static SubLObject f21898(final SubLObject var151) {
        SubLObject var152 = Vectors.aref(var151, (SubLObject)TWO_INTEGER);
        SubLObject var153 = (SubLObject)NIL;
        SubLObject var154 = (SubLObject)NIL;
        while (NIL == var153 && NIL == var154) {
            if (NIL == var152) {
                final SubLObject var155 = Vectors.aref(var151, (SubLObject)THREE_INTEGER);
                if (NIL == var155) {
                    var154 = (SubLObject)T;
                }
                else if (NIL != module0135.f8838(var155)) {
                    module0135.f8849(var155);
                    Vectors.set_aref(var151, (SubLObject)THREE_INTEGER, (SubLObject)NIL);
                    var154 = (SubLObject)T;
                }
                else {
                    final SubLObject var156 = module0135.f8844(var155);
                    if (NIL != var156) {
                        final SubLObject var157 = (NIL != module0138.f8972(Vectors.aref(var151, (SubLObject)ONE_INTEGER))) ? module0067.f4885($g2829$.getGlobalValue(), var156, (SubLObject)UNPROVIDED) : module0067.f4885($g2830$.getGlobalValue(), var156, (SubLObject)UNPROVIDED);
                        if (NIL == var157) {
                            continue;
                        }
                        var152 = f21889(var157);
                        Vectors.set_aref(var151, (SubLObject)ZERO_INTEGER, var156);
                        Vectors.set_aref(var151, (SubLObject)TWO_INTEGER, var152);
                    }
                    else {
                        module0135.f8849(var155);
                        Vectors.set_aref(var151, (SubLObject)THREE_INTEGER, (SubLObject)NIL);
                        var154 = (SubLObject)T;
                    }
                }
            }
            else if (NIL != module0135.f8838(var152)) {
                module0135.f8849(var152);
                var152 = (SubLObject)NIL;
                Vectors.set_aref(var151, (SubLObject)TWO_INTEGER, (SubLObject)NIL);
            }
            else {
                var153 = module0135.f8844(var152);
            }
        }
        return (SubLObject)((NIL != var153) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic20$, module0267.$g2526$.getGlobalValue(), Vectors.aref(var151, (SubLObject)ZERO_INTEGER)), var153) : NIL);
    }
    
    public static SubLObject f21899(final SubLObject var151) {
        if (NIL != Vectors.aref(var151, (SubLObject)ONE_INTEGER)) {
            module0135.f8849(Vectors.aref(var151, (SubLObject)ONE_INTEGER));
        }
        if (NIL != Vectors.aref(var151, (SubLObject)TWO_INTEGER)) {
            module0135.f8849(Vectors.aref(var151, (SubLObject)TWO_INTEGER));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f21889(final SubLObject var164) {
        return module0135.f8839(f21900(var164), (SubLObject)$ic60$, (SubLObject)$ic61$, (SubLObject)$ic62$);
    }
    
    public static SubLObject f21900(final SubLObject var164) {
        final SubLObject var165 = Vectors.make_vector((SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        Vectors.set_aref(var165, (SubLObject)TWO_INTEGER, module0135.f8859(var164));
        return var165;
    }
    
    public static SubLObject f21901(final SubLObject var151) {
        return (SubLObject)makeBoolean((NIL == Vectors.aref(var151, (SubLObject)ONE_INTEGER) || NIL != module0135.f8838(Vectors.aref(var151, (SubLObject)ONE_INTEGER))) && (NIL == Vectors.aref(var151, (SubLObject)TWO_INTEGER) || NIL != module0135.f8838(Vectors.aref(var151, (SubLObject)TWO_INTEGER))));
    }
    
    public static SubLObject f21902(final SubLObject var151) {
        SubLObject var152 = Vectors.aref(var151, (SubLObject)ONE_INTEGER);
        SubLObject var153 = (SubLObject)NIL;
        SubLObject var154 = (SubLObject)NIL;
        while (NIL == var153 && NIL == var154) {
            if (NIL == var152) {
                final SubLObject var155 = Vectors.aref(var151, (SubLObject)TWO_INTEGER);
                if (NIL == var155) {
                    var154 = (SubLObject)T;
                }
                else if (NIL != module0135.f8838(var155)) {
                    module0135.f8849(var155);
                    Vectors.set_aref(var151, (SubLObject)TWO_INTEGER, (SubLObject)NIL);
                    var154 = (SubLObject)T;
                }
                else {
                    final SubLObject var156 = module0135.f8844(var155);
                    if (NIL != var156) {
                        SubLObject var158;
                        final SubLObject var157 = var158 = var156;
                        SubLObject var159 = (SubLObject)NIL;
                        SubLObject var160 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic63$);
                        var159 = var158.first();
                        var158 = var158.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic63$);
                        var160 = var158.first();
                        var158 = var158.rest();
                        if (NIL == var158) {
                            var152 = f21903(var160);
                            Vectors.set_aref(var151, (SubLObject)ZERO_INTEGER, var159);
                            Vectors.set_aref(var151, (SubLObject)ONE_INTEGER, var152);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var157, (SubLObject)$ic63$);
                        }
                    }
                    else {
                        module0135.f8849(var155);
                        Vectors.set_aref(var151, (SubLObject)TWO_INTEGER, (SubLObject)NIL);
                        var154 = (SubLObject)T;
                    }
                }
            }
            else if (NIL != module0135.f8838(var152)) {
                module0135.f8849(var152);
                var152 = (SubLObject)NIL;
                Vectors.set_aref(var151, (SubLObject)ONE_INTEGER, (SubLObject)NIL);
            }
            else {
                var153 = module0135.f8844(var152);
            }
        }
        return (SubLObject)((NIL != var153) ? ConsesLow.cons(Vectors.aref(var151, (SubLObject)ZERO_INTEGER), var153) : NIL);
    }
    
    public static SubLObject f21904(final SubLObject var151) {
        if (NIL != Vectors.aref(var151, (SubLObject)ONE_INTEGER)) {
            module0135.f8849(Vectors.aref(var151, (SubLObject)ONE_INTEGER));
        }
        if (NIL != Vectors.aref(var151, (SubLObject)TWO_INTEGER)) {
            module0135.f8849(Vectors.aref(var151, (SubLObject)TWO_INTEGER));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f21903(final SubLObject var168) {
        return module0135.f8839(f21905(var168), (SubLObject)$ic64$, (SubLObject)$ic65$, (SubLObject)$ic66$);
    }
    
    public static SubLObject f21905(final SubLObject var168) {
        final SubLObject var169 = Vectors.make_vector((SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        Vectors.set_aref(var169, (SubLObject)TWO_INTEGER, module0135.f8859(var168));
        return var169;
    }
    
    public static SubLObject f21906(final SubLObject var151) {
        return (SubLObject)makeBoolean((NIL == Vectors.aref(var151, (SubLObject)ONE_INTEGER) || NIL != module0135.f8838(Vectors.aref(var151, (SubLObject)ONE_INTEGER))) && (NIL == Vectors.aref(var151, (SubLObject)TWO_INTEGER) || NIL != module0135.f8838(Vectors.aref(var151, (SubLObject)TWO_INTEGER))));
    }
    
    public static SubLObject f21907(final SubLObject var151) {
        SubLObject var152 = Vectors.aref(var151, (SubLObject)ONE_INTEGER);
        SubLObject var153 = (SubLObject)NIL;
        SubLObject var154 = (SubLObject)NIL;
        while (NIL == var153 && NIL == var154) {
            if (NIL == var152) {
                final SubLObject var155 = Vectors.aref(var151, (SubLObject)TWO_INTEGER);
                if (NIL == var155) {
                    var154 = (SubLObject)T;
                }
                else if (NIL != module0135.f8838(var155)) {
                    module0135.f8849(var155);
                    Vectors.set_aref(var151, (SubLObject)TWO_INTEGER, (SubLObject)NIL);
                    var154 = (SubLObject)T;
                }
                else {
                    final SubLObject var156 = module0135.f8844(var155);
                    if (NIL != var156) {
                        SubLObject var158;
                        final SubLObject var157 = var158 = var156;
                        SubLObject var159 = (SubLObject)NIL;
                        SubLObject var160 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic67$);
                        var159 = var158.first();
                        var158 = var158.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var158, var157, (SubLObject)$ic67$);
                        var160 = var158.first();
                        var158 = var158.rest();
                        if (NIL == var158) {
                            if (NIL == module0147.f9507(var159)) {
                                continue;
                            }
                            var152 = module0135.f8859(var160);
                            Vectors.set_aref(var151, (SubLObject)ZERO_INTEGER, var159);
                            Vectors.set_aref(var151, (SubLObject)ONE_INTEGER, var152);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var157, (SubLObject)$ic67$);
                        }
                    }
                    else {
                        module0135.f8849(var155);
                        Vectors.set_aref(var151, (SubLObject)TWO_INTEGER, (SubLObject)NIL);
                        var154 = (SubLObject)T;
                    }
                }
            }
            else if (NIL != module0135.f8838(var152)) {
                module0135.f8849(var152);
                var152 = (SubLObject)NIL;
                Vectors.set_aref(var151, (SubLObject)ONE_INTEGER, (SubLObject)NIL);
            }
            else {
                var153 = module0135.f8844(var152);
            }
        }
        return (SubLObject)((NIL != var153) ? ConsesLow.cons(Vectors.aref(var151, (SubLObject)ZERO_INTEGER), var153) : NIL);
    }
    
    public static SubLObject f21908(final SubLObject var151) {
        if (NIL != Vectors.aref(var151, (SubLObject)ONE_INTEGER)) {
            module0135.f8849(Vectors.aref(var151, (SubLObject)ONE_INTEGER));
        }
        if (NIL != Vectors.aref(var151, (SubLObject)TWO_INTEGER)) {
            module0135.f8849(Vectors.aref(var151, (SubLObject)TWO_INTEGER));
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f21909() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21850", "S#24433", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21851", "S#24434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21852", "S#5259", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21853", "S#24435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21854", "S#24436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21855", "S#24437", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21856", "S#24438", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21857", "S#24439", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21858", "S#24440", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21859", "S#24441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21860", "S#24442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21861", "S#18660", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21862", "S#24443", 0, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0323", "f21863", "S#24444");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21864", "S#24445", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21865", "S#24446", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21866", "S#24447", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21867", "S#24448", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21868", "S#24449", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21869", "S#24450", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21871", "S#24451", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21870", "S#24452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21872", "S#24453", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21874", "S#24454", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21873", "S#24455", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21875", "S#18661", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21876", "S#24456", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21877", "S#24457", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21878", "S#24458", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21879", "S#24459", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21880", "S#24460", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21881", "S#24461", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21882", "S#24462", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0323", "f21883", "S#24463");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0323", "f21884", "S#24464");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0323", "f21885", "S#24465");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0323", "f21886", "S#24466");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21887", "S#24467", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21888", "S#24468", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21890", "S#24469", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21892", "S#11009", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21893", "S#11017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21894", "S#11025", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21895", "S#24470", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21891", "S#24471", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21896", "S#24472", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21897", "S#11010", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21898", "S#11018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21899", "S#11026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21889", "S#24473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21900", "S#24474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21901", "S#11011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21902", "S#11019", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21904", "S#11027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21903", "S#24475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21905", "S#24476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21906", "S#11012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21907", "S#11020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0323", "f21908", "S#11028", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21910() {
        $g2828$ = SubLFiles.deflexical("S#24477", (NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2828$.getGlobalValue() : module0053.f3868((SubLObject)$ic1$));
        $g2829$ = SubLFiles.deflexical("S#24478", (NIL != Symbols.boundp((SubLObject)$ic15$)) ? $g2829$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic16$));
        $g2830$ = SubLFiles.deflexical("S#24479", (NIL != Symbols.boundp((SubLObject)$ic17$)) ? $g2830$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic16$));
        $g2831$ = SubLFiles.deflexical("S#24480", (NIL != Symbols.boundp((SubLObject)$ic18$)) ? $g2831$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic16$));
        $g2832$ = SubLFiles.deflexical("S#24481", (NIL != Symbols.boundp((SubLObject)$ic19$)) ? $g2832$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic16$));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f21911() {
        module0003.f57((SubLObject)$ic0$);
        module0003.f57((SubLObject)$ic15$);
        module0003.f57((SubLObject)$ic17$);
        module0003.f57((SubLObject)$ic18$);
        module0003.f57((SubLObject)$ic19$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f21909();
    }
    
    public void initializeVariables() {
        f21910();
    }
    
    public void runTopLevelForms() {
        f21911();
    }
    
    static {
        me = (SubLFile)new module0323();
        $g2828$ = null;
        $g2829$ = null;
        $g2830$ = null;
        $g2831$ = null;
        $g2832$ = null;
        $ic0$ = makeSymbol("S#24477", "CYC");
        $ic1$ = makeSymbol("S#5259", "CYC");
        $ic2$ = makeSymbol("S#24433", "CYC");
        $ic3$ = makeKeyword("FORWARD");
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#13151", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#24482", "CYC"), (SubLObject)makeSymbol("S#24483", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#5432", "CYC"), (SubLObject)makeKeyword("FORWARD")), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("EARLIEST"), (SubLObject)makeKeyword("LATEST"), (SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("DONE"));
        $ic6$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic7$ = makeKeyword("EARLIEST");
        $ic8$ = makeKeyword("LATEST");
        $ic9$ = makeKeyword("DIRECTION");
        $ic10$ = makeKeyword("DONE");
        $ic11$ = makeUninternedSymbol("US#2A76813");
        $ic12$ = makeSymbol("CLET");
        $ic13$ = makeSymbol("S#24443", "CYC");
        $ic14$ = makeSymbol("S#11050", "CYC");
        $ic15$ = makeSymbol("S#24478", "CYC");
        $ic16$ = makeInteger(1000);
        $ic17$ = makeSymbol("S#24479", "CYC");
        $ic18$ = makeSymbol("S#24480", "CYC");
        $ic19$ = makeSymbol("S#24481", "CYC");
        $ic20$ = makeKeyword("WEAK");
        $ic21$ = makeSymbol("INTEGERP");
        $ic22$ = constant_handles_oc.f8479((SubLObject)makeString("weak-HL-TimePrecedence"));
        $ic23$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24484", "CYC"), (SubLObject)makeSymbol("S#24485", "CYC"), (SubLObject)makeSymbol("S#13149", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#24486", "CYC")), (SubLObject)makeSymbol("S#24487", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic24$ = makeUninternedSymbol("US#33798D3");
        $ic25$ = makeSymbol("S#24463", "CYC");
        $ic26$ = makeSymbol("IGNORE");
        $ic27$ = makeSymbol("CDESTRUCTURING-BIND");
        $ic28$ = makeSymbol("&OPTIONAL");
        $ic29$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24488", "CYC"), (SubLObject)makeSymbol("S#24489", "CYC"), (SubLObject)makeSymbol("S#24490", "CYC"), (SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#24491", "CYC"), (SubLObject)makeSymbol("S#24492", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic30$ = ConsesLow.list((SubLObject)makeKeyword("DATE-LOWER-BOUND"), (SubLObject)makeKeyword("DATE-UPPER-BOUND"), (SubLObject)makeKeyword("DONE"));
        $ic31$ = makeKeyword("DATE-LOWER-BOUND");
        $ic32$ = makeKeyword("DATE-UPPER-BOUND");
        $ic33$ = makeUninternedSymbol("US#2A76813");
        $ic34$ = makeUninternedSymbol("US#6D4F449");
        $ic35$ = makeSymbol("S#24467", "CYC");
        $ic36$ = ConsesLow.list((SubLObject)makeSymbol("S#11227", "CYC"));
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24488", "CYC"), (SubLObject)makeSymbol("S#24489", "CYC"), (SubLObject)makeSymbol("S#24493", "CYC"), (SubLObject)makeSymbol("S#16943", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic39$ = makeUninternedSymbol("US#2A76813");
        $ic40$ = makeUninternedSymbol("US#6D4F449");
        $ic41$ = makeSymbol("S#24471", "CYC");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11227", "CYC")));
        $ic43$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#24488", "CYC"), (SubLObject)makeSymbol("S#24489", "CYC"), (SubLObject)makeSymbol("S#13151", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#24491", "CYC"), (SubLObject)makeSymbol("S#24492", "CYC"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic44$ = makeUninternedSymbol("US#10628D3");
        $ic45$ = makeUninternedSymbol("US#1062853");
        $ic46$ = makeSymbol("PIF");
        $ic47$ = ConsesLow.list((SubLObject)makeSymbol("S#11220", "CYC"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11227", "CYC")));
        $ic48$ = makeSymbol("CSETQ");
        $ic49$ = makeSymbol("FIF");
        $ic50$ = makeSymbol("CAND");
        $ic51$ = makeSymbol("S#24436", "CYC");
        $ic52$ = makeSymbol("S#24465", "CYC");
        $ic53$ = makeSymbol("S#11009", "CYC");
        $ic54$ = makeSymbol("S#11017", "CYC");
        $ic55$ = makeSymbol("S#11025", "CYC");
        $ic56$ = makeSymbol("S#11010", "CYC");
        $ic57$ = makeSymbol("S#11018", "CYC");
        $ic58$ = makeSymbol("S#11026", "CYC");
        $ic59$ = makeKeyword("BACKWARD");
        $ic60$ = makeSymbol("S#11011", "CYC");
        $ic61$ = makeSymbol("S#11019", "CYC");
        $ic62$ = makeSymbol("S#11027", "CYC");
        $ic63$ = ConsesLow.list((SubLObject)makeSymbol("S#150", "CYC"), (SubLObject)makeSymbol("S#24494", "CYC"));
        $ic64$ = makeSymbol("S#11012", "CYC");
        $ic65$ = makeSymbol("S#11020", "CYC");
        $ic66$ = makeSymbol("S#11028", "CYC");
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#24495", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 341 ms
	
	Decompiled with Procyon 0.5.32.
*/