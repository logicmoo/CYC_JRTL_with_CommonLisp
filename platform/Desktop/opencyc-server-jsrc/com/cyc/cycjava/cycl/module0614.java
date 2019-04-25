package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0614 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0614";
    public static final String myFingerPrint = "2d3767d7b76b9f6dd0e8e1a871ac21f6e55a9d637cae3ecb6b3a9212e7fc4051";
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLInteger $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLList $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLObject $ic34$;
    
    
    public static SubLObject f37617(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0612.f37382(var1) || NIL != module0612.f37387(var1) || NIL != f37618(var1) || NIL != f37619(var1));
    }
    
    public static SubLObject f37620(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f37617(var1) || NIL != module0612.f37473(var1));
    }
    
    public static SubLObject f37618(final SubLObject var1) {
        if (NIL == module0202.f12590(var1)) {
            return (SubLObject)NIL;
        }
        final SubLObject var3;
        final SubLObject var2 = var3 = module0205.f13132(var1);
        if (var3.eql($ic0$) || var3.eql($ic1$)) {
            final SubLObject var4 = module0205.f13203(var1, (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0205.f13204(var1, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != f37620(var4) && NIL != f37620(var5));
        }
        if (var3.eql($ic2$) || var3.eql($ic3$) || var3.eql($ic4$) || var3.eql($ic5$) || var3.eql($ic6$) || var3.eql($ic7$) || var3.eql($ic8$) || var3.eql($ic9$)) {
            final SubLObject var6 = module0205.f13203(var1, (SubLObject)UNPROVIDED);
            return f37620(var6);
        }
        if (var3.eql($ic10$) || var3.eql($ic11$)) {
            final SubLObject var7 = module0205.f13203(var1, (SubLObject)UNPROVIDED);
            final SubLObject var8 = module0205.f13204(var1, (SubLObject)UNPROVIDED);
            return (SubLObject)makeBoolean(NIL != f37620(var7) && NIL != module0615.f37703(var8));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37619(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0202.f12659(var1) && NIL != f37621(module0205.f13276(var1)) && NIL != f37622(module0205.f13368(var1, (SubLObject)UNPROVIDED)) && NIL != f37617(module0205.f13277(var1, (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f37623(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f37619(var1) || (NIL != module0206.f13453(var1) && NIL != module0035.f2369((SubLObject)$ic12$, module0205.f13304(var1, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED)));
    }
    
    public static SubLObject f37621(final SubLObject var9) {
        return Equality.eql(var9, $ic13$);
    }
    
    public static SubLObject f37622(final SubLObject var9) {
        return (SubLObject)makeBoolean(var9.isString() && Sequences.length(var9).numE((SubLObject)$ic14$));
    }
    
    public static SubLObject f37624(final SubLObject var10) {
        return (SubLObject)ConsesLow.list($ic13$, var10, Guids.guid_to_string(Guids.new_guid()));
    }
    
    public static SubLObject f37625(final SubLObject var11) {
        return module0612.f37453(var11, module0615.f37716(module0612.f37425(var11)));
    }
    
    public static SubLObject f37626(final SubLObject var11) {
        return module0612.f37450(var11, module0615.f37716(module0612.f37425(var11)));
    }
    
    public static SubLObject f37627(final SubLObject var12, final SubLObject var13) {
        return f37628(module0612.f37519(var12), module0612.f37519(var13));
    }
    
    public static SubLObject f37628(final SubLObject var12, final SubLObject var13) {
        if (var12.equal(var13)) {
            return (SubLObject)T;
        }
        final SubLObject var14 = f37629(var12);
        final SubLObject var15 = f37630(var12);
        final SubLObject var16 = f37631(var13);
        final SubLObject var17 = f37632(var13);
        return (SubLObject)makeBoolean(NIL != module0612.f37485(var14, var16) && NIL != module0612.f37485(var17, var15));
    }
    
    public static SubLObject f37633(final SubLObject var12, final SubLObject var13) {
        return f37634(module0612.f37519(var12), module0612.f37519(var13), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37634(final SubLObject var12, final SubLObject var13, SubLObject var18, SubLObject var19) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        if (var19 == UNPROVIDED) {
            var19 = (SubLObject)NIL;
        }
        if (var12.equal(var13)) {
            return (SubLObject)T;
        }
        final SubLObject var20 = f37623(var12);
        final SubLObject var21 = f37623(var13);
        if (NIL != var20 && NIL != var21) {
            final SubLObject var22 = f37635(var12);
            final SubLObject var23 = f37636(var12);
            final SubLObject var24 = f37637(var12);
            final SubLObject var25 = f37638(var12);
            final SubLObject var26 = f37635(var13);
            final SubLObject var27 = f37636(var13);
            final SubLObject var28 = f37637(var13);
            final SubLObject var29 = f37638(var13);
            return (SubLObject)makeBoolean(NIL != f37639(var22, var24, var26, var28, var18) && NIL != f37639(var22, var24, var26, var29, var18) && (NIL != var19 || NIL != f37639(var22, var24, var27, var28, var18)) && (NIL != var19 || NIL != f37639(var22, var24, var27, var29, var18)) && NIL != f37639(var22, var25, var26, var28, var18) && NIL != f37639(var22, var25, var26, var29, var18) && NIL != f37639(var22, var25, var27, var28, var18) && NIL != f37639(var22, var25, var27, var29, var18) && (NIL != var19 || NIL != f37639(var23, var24, var26, var28, var18)) && NIL != f37639(var23, var24, var26, var29, var18) && (NIL != var19 || NIL != f37639(var23, var24, var27, var28, var18)) && (NIL != var19 || NIL != f37639(var23, var24, var27, var29, var18)) && (NIL != var19 || NIL != f37639(var23, var25, var26, var28, var18)) && NIL != f37639(var23, var25, var26, var29, var18) && (NIL != var19 || NIL != f37639(var23, var25, var27, var28, var18)) && NIL != f37639(var23, var25, var27, var29, var18));
        }
        if (NIL != var20) {
            final SubLObject var22 = f37635(var12);
            final SubLObject var23 = f37636(var12);
            final SubLObject var24 = f37637(var12);
            final SubLObject var25 = f37638(var12);
            final SubLObject var30 = f37640(var13);
            final SubLObject var31 = f37641(var13);
            return (SubLObject)makeBoolean(NIL != f37639(var22, var24, var30, var31, var18) && NIL != f37639(var22, var25, var30, var31, var18) && NIL != f37639(var23, var24, var30, var31, var18) && NIL != f37639(var23, var25, var30, var31, var18));
        }
        if (NIL != var21) {
            final SubLObject var32 = f37640(var12);
            final SubLObject var33 = f37641(var12);
            final SubLObject var34 = f37635(var13);
            final SubLObject var35 = f37636(var13);
            final SubLObject var36 = f37637(var13);
            final SubLObject var37 = f37638(var13);
            return (SubLObject)makeBoolean(NIL != f37639(var32, var33, var34, var36, var18) && NIL != f37639(var32, var33, var34, var37, var18) && NIL != f37639(var32, var33, var35, var36, var18) && NIL != f37639(var32, var33, var35, var37, var18));
        }
        final SubLObject var32 = f37640(var12);
        final SubLObject var33 = f37641(var12);
        final SubLObject var38 = f37640(var13);
        final SubLObject var39 = f37641(var13);
        return f37639(var32, var33, var38, var39, var18);
    }
    
    public static SubLObject f37639(final SubLObject var14, final SubLObject var15, final SubLObject var16, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = (SubLObject)NIL;
        }
        return (NIL != var18) ? ((NIL != module0612.f37485(var14, var16)) ? f37642(var16, var15) : f37642(var14, var17)) : ((NIL != module0612.f37485(var14, var16)) ? module0612.f37485(var16, var15) : module0612.f37485(var14, var17));
    }
    
    public static SubLObject f37642(final SubLObject var12, final SubLObject var13) {
        if (NIL == module0612.f37382(var13)) {
            return module0612.f37485(var12, var13);
        }
        return module0612.f37485(var12, module0612.f37426(Numbers.add((SubLObject)ONE_INTEGER, module0612.f37427(var13))));
    }
    
    public static SubLObject f37631(final SubLObject var11) {
        return (NIL != f37623(var11)) ? f37635(var11) : f37640(var11);
    }
    
    public static SubLObject f37629(final SubLObject var11) {
        return (NIL != f37623(var11)) ? f37636(var11) : f37640(var11);
    }
    
    public static SubLObject f37630(final SubLObject var11) {
        return (NIL != f37623(var11)) ? f37637(var11) : f37641(var11);
    }
    
    public static SubLObject f37632(final SubLObject var11) {
        return (NIL != f37623(var11)) ? f37638(var11) : f37641(var11);
    }
    
    public static SubLObject f37640(final SubLObject var11) {
        if (NIL != module0612.f37390(var11)) {
            return module0612.$g2464$.getGlobalValue();
        }
        if (NIL != module0612.f37389(var11)) {
            return module0612.$g2464$.getGlobalValue();
        }
        if (NIL != f37619(var11)) {
            return var11;
        }
        if (NIL != f37618(var11)) {
            final SubLObject var12 = module0205.f13132(var11);
            if (var12.eql($ic0$) || var12.eql($ic6$) || var12.eql($ic2$)) {
                return f37640(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic1$) || var12.eql($ic4$)) {
                final SubLObject var13 = module0205.f13203(var11, (SubLObject)UNPROVIDED);
                final SubLObject var14 = f37641(var13);
                return (SubLObject)((NIL != module0612.f37382(var14)) ? f37625(var14) : NIL);
            }
            if (var12.eql($ic3$)) {
                return f37641(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic5$) || var12.eql($ic7$)) {
                return module0612.$g2464$.getGlobalValue();
            }
            if (var12.eql($ic10$)) {
                final SubLObject var13 = module0205.f13203(var11, (SubLObject)UNPROVIDED);
                final SubLObject var14 = f37641(var13);
                return (SubLObject)((NIL != module0612.f37382(var14)) ? f37625(var14) : NIL);
            }
            if (var12.eql($ic11$)) {
                final SubLObject var15 = module0205.f13203(var11, (SubLObject)UNPROVIDED);
                final SubLObject var16 = module0205.f13204(var11, (SubLObject)UNPROVIDED);
                final SubLObject var17 = f37640(var15);
                final SubLObject var18 = (SubLObject)((NIL != module0612.f37382(var17)) ? module0612.f37450(var17, var16) : NIL);
                return f37640(var18);
            }
            return (SubLObject)NIL;
        }
        else {
            if (NIL != module0612.f37382(var11)) {
                return module0612.f37491(var11);
            }
            if (NIL != module0612.f37473(var11)) {
                return var11;
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f37641(final SubLObject var11) {
        if (NIL != module0612.f37390(var11)) {
            return module0612.$g2466$.getGlobalValue();
        }
        if (NIL != module0612.f37388(var11)) {
            return module0612.$g2466$.getGlobalValue();
        }
        if (NIL != f37619(var11)) {
            return var11;
        }
        if (NIL != f37618(var11)) {
            final SubLObject var12 = module0205.f13132(var11);
            if (var12.eql($ic7$) || var12.eql($ic3$)) {
                return f37641(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic0$)) {
                return f37641(module0205.f13204(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic1$)) {
                final SubLObject var13 = module0205.f13204(var11, (SubLObject)UNPROVIDED);
                final SubLObject var14 = f37640(var13);
                return (SubLObject)((NIL != module0612.f37382(var14)) ? f37626(var14) : NIL);
            }
            if (var12.eql($ic2$)) {
                return f37640(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic4$) || var12.eql($ic6$)) {
                return module0612.$g2466$.getGlobalValue();
            }
            if (var12.eql($ic5$)) {
                final SubLObject var13 = module0205.f13203(var11, (SubLObject)UNPROVIDED);
                final SubLObject var14 = f37640(var13);
                return (SubLObject)((NIL != module0612.f37382(var14)) ? f37626(var14) : NIL);
            }
            if (var12.eql($ic10$)) {
                final SubLObject var15 = module0205.f13203(var11, (SubLObject)UNPROVIDED);
                final SubLObject var16 = module0205.f13204(var11, (SubLObject)UNPROVIDED);
                final SubLObject var17 = f37641(var15);
                final SubLObject var18 = (SubLObject)((NIL != module0612.f37382(var17)) ? module0612.f37453(var17, var16) : NIL);
                return f37641(var18);
            }
            if (var12.eql($ic11$)) {
                final SubLObject var13 = module0205.f13203(var11, (SubLObject)UNPROVIDED);
                final SubLObject var14 = f37640(var13);
                return (SubLObject)((NIL != module0612.f37382(var14)) ? f37626(var14) : NIL);
            }
            return (SubLObject)NIL;
        }
        else {
            if (NIL != module0612.f37382(var11)) {
                return module0612.f37492(var11);
            }
            if (NIL != module0612.f37473(var11)) {
                return var11;
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f37635(final SubLObject var11) {
        final SubLObject var12 = module0205.f13132(var11);
        if (var12.eql($ic13$)) {
            return f37631(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic0$) || var12.eql($ic6$)) {
            return f37631(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic1$)) {
            return f37625(f37630(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic4$)) {
            return f37625(f37630(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic5$) || var12.eql($ic7$)) {
            return module0612.$g2464$.getGlobalValue();
        }
        if (var12.eql($ic2$)) {
            return f37631(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic3$)) {
            return f37630(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic11$)) {
            return f37631(module0612.f37450(f37640(module0205.f13203(var11, (SubLObject)UNPROVIDED)), module0205.f13204(var11, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic10$)) {
            return f37625(f37630(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37636(final SubLObject var11) {
        final SubLObject var12 = module0205.f13132(var11);
        if (var12.eql($ic13$)) {
            return f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic6$)) {
            return f37629(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic0$)) {
            final SubLObject var13 = f37629(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            final SubLObject var14 = (SubLObject)((NIL != f37623(module0205.f13204(var11, (SubLObject)UNPROVIDED))) ? NIL : f37631(module0205.f13204(var11, (SubLObject)UNPROVIDED)));
            if (NIL != module0612.f37382(var14) && NIL != module0612.f37485(var14, var13)) {
                return var14;
            }
            return var13;
        }
        else {
            if (var12.eql($ic1$)) {
                return f37625(f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
            }
            if (var12.eql($ic4$)) {
                return f37625(f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
            }
            if (var12.eql($ic5$) || var12.eql($ic7$)) {
                return module0612.$g2464$.getGlobalValue();
            }
            if (var12.eql($ic2$)) {
                return f37629(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic3$)) {
                return f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic11$)) {
                return f37629(module0612.f37450(f37640(module0205.f13203(var11, (SubLObject)UNPROVIDED)), module0205.f13204(var11, (SubLObject)UNPROVIDED)));
            }
            if (var12.eql($ic10$)) {
                return f37625(f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f37637(final SubLObject var11) {
        final SubLObject var12 = module0205.f13132(var11);
        if (var12.eql($ic13$)) {
            return f37631(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic0$)) {
            final SubLObject var13 = (SubLObject)((NIL != f37623(module0205.f13203(var11, (SubLObject)UNPROVIDED))) ? NIL : f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
            final SubLObject var14 = f37630(module0205.f13204(var11, (SubLObject)UNPROVIDED));
            if (NIL != module0612.f37382(var13) && NIL != module0612.f37488(var13, var14)) {
                return var13;
            }
            return var14;
        }
        else {
            if (var12.eql($ic1$)) {
                return f37626(f37631(module0205.f13204(var11, (SubLObject)UNPROVIDED)));
            }
            if (var12.eql($ic4$) || var12.eql($ic6$)) {
                return module0612.$g2466$.getGlobalValue();
            }
            if (var12.eql($ic5$)) {
                return f37626(f37631(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
            }
            if (var12.eql($ic7$)) {
                return f37630(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic2$)) {
                return f37631(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic3$)) {
                return f37630(module0205.f13203(var11, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic11$)) {
                return f37626(f37631(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
            }
            if (var12.eql($ic10$)) {
                return f37630(module0612.f37453(f37630(module0205.f13203(var11, (SubLObject)UNPROVIDED)), module0205.f13204(var11, (SubLObject)UNPROVIDED)));
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f37638(final SubLObject var11) {
        final SubLObject var12 = module0205.f13132(var11);
        if (var12.eql($ic13$)) {
            return f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic0$)) {
            return f37632(module0205.f13204(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic1$)) {
            return f37626(f37629(module0205.f13204(var11, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic4$) || var12.eql($ic6$)) {
            return module0612.$g2466$.getGlobalValue();
        }
        if (var12.eql($ic5$)) {
            return f37626(f37629(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic7$)) {
            return f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic2$)) {
            return f37629(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic3$)) {
            return f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic11$)) {
            return f37626(f37629(module0205.f13203(var11, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic10$)) {
            return f37632(module0612.f37453(f37632(module0205.f13203(var11, (SubLObject)UNPROVIDED)), module0205.f13204(var11, (SubLObject)UNPROVIDED)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37643(SubLObject var41) {
        if (NIL != module0167.f10813(var41)) {
            var41 = module0172.f10920(var41);
        }
        return f37640(var41);
    }
    
    public static SubLObject f37644(SubLObject var41) {
        if (NIL != module0167.f10813(var41)) {
            var41 = module0172.f10920(var41);
        }
        return f37641(var41);
    }
    
    public static SubLObject f37645(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var11) && NIL == f37617(var10)) {
            Errors.error((SubLObject)$ic15$, var10);
        }
        return f37646(var10);
    }
    
    public static SubLObject f37647(final SubLObject var10, SubLObject var43, SubLObject var44) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        final SubLObject var45 = f37631(var10);
        final SubLObject var46 = f37629(var10);
        final SubLObject var47 = f37632(var10);
        final SubLObject var48 = f37630(var10);
        return f37648(var45, var46, var48, var47, var43, var44);
    }
    
    public static SubLObject f37648(SubLObject var49, SubLObject var50, SubLObject var51, SubLObject var52, SubLObject var43, SubLObject var44) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        if (NIL != var43) {
            final SubLObject var53 = (SubLObject)makeBoolean(NIL != var44 && !var49.equal(var50));
            if (NIL != module0612.f37382(var49)) {
                var49 = module0612.f37424(var49, var43, (SubLObject)((NIL != var53) ? $ic16$ : NIL));
            }
            if (NIL != module0612.f37382(var50)) {
                var50 = module0612.f37424(var50, var43, (SubLObject)((NIL != var53) ? $ic17$ : NIL));
            }
            final SubLObject var54 = (SubLObject)makeBoolean(NIL != var44 && !var51.equal(var52));
            if (NIL != module0612.f37382(var51)) {
                var51 = module0612.f37424(var51, var43, (SubLObject)((NIL != var54) ? $ic16$ : NIL));
            }
            if (NIL != module0612.f37382(var52)) {
                var52 = module0612.f37424(var52, var43, (SubLObject)((NIL != var54) ? $ic17$ : NIL));
            }
        }
        if (NIL == module0612.f37486(var49, var50) && NIL != module0612.f37486(var49, var51) && NIL != module0612.f37486(var50, var52)) {
            return f37624(f37649(var49, var52));
        }
        if (NIL != module0612.f37388(var50) && NIL != module0612.f37382(var52)) {
            return f37648(var49, var52, var51, var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0612.f37389(var51) && NIL != module0612.f37382(var49)) {
            return f37648(var49, var50, var49, var52, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var55 = (NIL != module0612.f37486(var49, var50)) ? var49 : f37624(f37649(var49, var50));
        final SubLObject var56 = (NIL != module0612.f37486(var51, var52)) ? var51 : f37624(f37649(var51, var52));
        return f37649(var55, var56);
    }
    
    public static SubLObject f37650(final SubLObject var57, final SubLObject var58) {
        return Equality.equal(module0035.f2426(var57, (SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)UNPROVIDED), module0035.f2426(var58, (SubLObject)$ic18$, (SubLObject)$ic19$, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f37646(final SubLObject var10) {
        if (NIL != module0612.f37382(var10) || NIL != module0612.f37389(var10) || NIL != module0612.f37388(var10) || NIL != module0612.f37390(var10) || NIL != module0612.f37393(var10) || NIL != module0612.f37473(var10)) {
            return var10;
        }
        final SubLObject var12;
        final SubLObject var11 = var12 = module0205.f13276(var10);
        if (var12.eql($ic0$)) {
            SubLObject var14;
            final SubLObject var13 = var14 = module0205.f13304(var10, (SubLObject)UNPROVIDED);
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic20$);
            var15 = var14.first();
            var14 = var14.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var14, var13, (SubLObject)$ic20$);
            var16 = var14.first();
            var14 = var14.rest();
            if (NIL == var14) {
                var15 = f37646(var15);
                var16 = f37646(var16);
                return f37649(var15, var16);
            }
            cdestructuring_bind.cdestructuring_bind_error(var13, (SubLObject)$ic20$);
        }
        else if (var12.eql($ic1$)) {
            SubLObject var18;
            final SubLObject var17 = var18 = module0205.f13304(var10, (SubLObject)UNPROVIDED);
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var16 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic20$);
            var15 = var18.first();
            var18 = var18.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var18, var17, (SubLObject)$ic20$);
            var16 = var18.first();
            var18 = var18.rest();
            if (NIL == var18) {
                var15 = f37646(var15);
                var16 = f37646(var16);
                return f37651(var15, var16);
            }
            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic20$);
        }
        else if (var12.eql($ic10$) || var12.eql($ic9$)) {
            SubLObject var20;
            final SubLObject var19 = var20 = module0205.f13304(var10, (SubLObject)UNPROVIDED);
            SubLObject var15 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic21$);
            var15 = var20.first();
            var20 = var20.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var20, var19, (SubLObject)$ic21$);
            var21 = var20.first();
            var20 = var20.rest();
            if (NIL == var20) {
                var15 = f37646(var15);
                return f37652(var11, var15, var21);
            }
            cdestructuring_bind.cdestructuring_bind_error(var19, (SubLObject)$ic21$);
        }
        else if (var12.eql($ic11$) || var12.eql($ic8$)) {
            SubLObject var23;
            final SubLObject var22 = var23 = module0205.f13304(var10, (SubLObject)UNPROVIDED);
            SubLObject var24 = (SubLObject)NIL;
            SubLObject var21 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic22$);
            var24 = var23.first();
            var23 = var23.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var23, var22, (SubLObject)$ic22$);
            var21 = var23.first();
            var23 = var23.rest();
            if (NIL == var23) {
                var24 = f37646(var24);
                return f37653(var11, var24, var21);
            }
            cdestructuring_bind.cdestructuring_bind_error(var22, (SubLObject)$ic22$);
        }
        else {
            if (var12.eql($ic4$)) {
                final SubLObject var25 = f37646(module0205.f13277(var10, (SubLObject)UNPROVIDED));
                return f37654(var25);
            }
            if (var12.eql($ic6$)) {
                final SubLObject var25 = f37646(module0205.f13277(var10, (SubLObject)UNPROVIDED));
                return f37655(var25);
            }
            if (var12.eql($ic5$)) {
                final SubLObject var26 = f37646(module0205.f13277(var10, (SubLObject)UNPROVIDED));
                return f37656(var26);
            }
            if (var12.eql($ic7$)) {
                final SubLObject var26 = f37646(module0205.f13277(var10, (SubLObject)UNPROVIDED));
                return f37657(var26);
            }
            if (var12.eql($ic3$)) {
                final SubLObject var27 = f37646(module0205.f13277(var10, (SubLObject)UNPROVIDED));
                return f37658(var27);
            }
            if (var12.eql($ic2$)) {
                final SubLObject var27 = f37646(module0205.f13277(var10, (SubLObject)UNPROVIDED));
                return f37659(var27);
            }
            if (var12.eql($ic13$)) {
                SubLObject var29;
                final SubLObject var28 = var29 = module0205.f13304(var10, (SubLObject)UNPROVIDED);
                SubLObject var30 = (SubLObject)NIL;
                SubLObject var31 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic23$);
                var30 = var29.first();
                var29 = var29.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)$ic23$);
                var31 = var29.first();
                var29 = var29.rest();
                if (NIL == var29) {
                    var30 = f37646(var30);
                    return f37660(var30, var31);
                }
                cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)$ic23$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37649(final SubLObject var61, final SubLObject var62) {
        if (NIL != module0328.f22198(var61, var62, (SubLObject)UNPROVIDED)) {
            return module0202.f12768($ic0$, var61, var62);
        }
        if (NIL != module0328.f22177(var61, var62, (SubLObject)UNPROVIDED)) {
            return module0202.f12768($ic0$, var61, var62);
        }
        SubLObject var63 = f37661(var61);
        SubLObject var64 = f37662(var62);
        if (NIL != module0612.f37389(var63) && NIL != module0612.f37388(var64)) {
            return $ic24$;
        }
        if (NIL != module0612.f37389(var63)) {
            return f37657(var62);
        }
        if (NIL != module0612.f37388(var64)) {
            return f37655(var61);
        }
        if (var63.equal(var64)) {
            return var63;
        }
        if (NIL != module0328.f22251(var61, var62, (SubLObject)UNPROVIDED) && NIL != module0259.f16854(var61, $ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var61;
        }
        if (NIL != module0328.f22251(var61, var62, (SubLObject)UNPROVIDED) && NIL != module0259.f16854(var62, $ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return var62;
        }
        if (NIL != module0328.f22198(var63, var62, (SubLObject)UNPROVIDED)) {
            if (NIL != module0612.f37382(var62)) {
                var63 = f37663(var61, var62);
            }
            else {
                var63 = var61;
            }
        }
        else if (NIL != module0328.f22177(var61, var64, (SubLObject)UNPROVIDED)) {
            if (NIL != module0612.f37382(var61)) {
                var64 = f37664(var62, var61);
            }
            else {
                var64 = var62;
            }
        }
        if (var63.equal(var64)) {
            return var63;
        }
        return module0202.f12768($ic0$, var63, var64);
    }
    
    public static SubLObject f37651(final SubLObject var61, final SubLObject var62) {
        final SubLObject var63 = f37662(var61);
        final SubLObject var64 = f37661(var62);
        return module0202.f12768($ic1$, var63, var64);
    }
    
    public static SubLObject f37652(final SubLObject var2, final SubLObject var61, final SubLObject var67) {
        final SubLObject var68 = f37662(var61);
        final SubLObject var69 = f37665(var67);
        return (SubLObject)((NIL != module0615.f37704(var69)) ? $ic26$ : ConsesLow.list(var2, var68, var69));
    }
    
    public static SubLObject f37653(final SubLObject var2, final SubLObject var62, final SubLObject var67) {
        final SubLObject var68 = f37661(var62);
        final SubLObject var69 = f37665(var67);
        return (SubLObject)((NIL != module0615.f37704(var69)) ? $ic26$ : ConsesLow.list(var2, var68, var69));
    }
    
    public static SubLObject f37654(final SubLObject var61) {
        final SubLObject var62 = f37662(var61);
        if (NIL != module0612.f37389(var62)) {
            return $ic24$;
        }
        if (NIL != module0612.f37388(var62)) {
            return $ic26$;
        }
        return (SubLObject)ConsesLow.list($ic4$, var62);
    }
    
    public static SubLObject f37655(final SubLObject var61) {
        final SubLObject var62 = f37661(var61);
        if (NIL != module0612.f37389(var62)) {
            return $ic24$;
        }
        if (NIL != module0612.f37388(var62)) {
            return $ic26$;
        }
        return (SubLObject)ConsesLow.list($ic6$, var62);
    }
    
    public static SubLObject f37656(final SubLObject var62) {
        final SubLObject var63 = f37661(var62);
        if (NIL != module0612.f37388(var63)) {
            return $ic24$;
        }
        if (NIL != module0612.f37389(var63)) {
            return $ic26$;
        }
        return (SubLObject)ConsesLow.list($ic5$, var63);
    }
    
    public static SubLObject f37657(final SubLObject var62) {
        final SubLObject var63 = f37662(var62);
        if (NIL != module0612.f37388(var63)) {
            return $ic24$;
        }
        if (NIL != module0612.f37389(var63)) {
            return $ic26$;
        }
        return (SubLObject)ConsesLow.list($ic7$, var63);
    }
    
    public static SubLObject f37658(final SubLObject var10) {
        return f37641(var10);
    }
    
    public static SubLObject f37659(final SubLObject var10) {
        return f37640(var10);
    }
    
    public static SubLObject f37660(final SubLObject var10, final SubLObject var73) {
        return (SubLObject)((NIL != module0612.f37393(var10)) ? var10 : ConsesLow.list($ic13$, var10, var73));
    }
    
    public static SubLObject f37663(final SubLObject var11, final SubLObject var77) {
        final SubLThread var78 = SubLProcess.currentSubLThread();
        if (NIL != module0328.f22198(var11, var77, (SubLObject)UNPROVIDED)) {
            return var11;
        }
        var78.resetMultipleValues();
        final SubLObject var79 = module0612.f37398(var11);
        final SubLObject var80 = var78.secondMultipleValue();
        final SubLObject var81 = var78.thirdMultipleValue();
        final SubLObject var82 = var78.fourthMultipleValue();
        final SubLObject var83 = var78.fifthMultipleValue();
        final SubLObject var84 = var78.sixthMultipleValue();
        final SubLObject var85 = var78.seventhMultipleValue();
        var78.resetMultipleValues();
        final SubLObject var86 = (SubLObject)ConsesLow.list(var85, var84, var83, var82, var81, var80);
        var78.resetMultipleValues();
        final SubLObject var78_86 = module0612.f37398(var77);
        final SubLObject var79_87 = var78.secondMultipleValue();
        final SubLObject var80_88 = var78.thirdMultipleValue();
        final SubLObject var81_89 = var78.fourthMultipleValue();
        final SubLObject var82_90 = var78.fifthMultipleValue();
        final SubLObject var83_91 = var78.sixthMultipleValue();
        final SubLObject var84_92 = var78.seventhMultipleValue();
        var78.resetMultipleValues();
        final SubLObject var87 = (SubLObject)ConsesLow.list(var84_92, var83_91, var82_90, var81_89, var80_88, var79_87);
        SubLObject var88 = (SubLObject)NIL;
        if (NIL == var88) {
            SubLObject var89;
            SubLObject var90;
            SubLObject var91;
            SubLObject var92;
            for (var89 = (SubLObject)SIX_INTEGER, var90 = (SubLObject)NIL, var90 = (SubLObject)ZERO_INTEGER; NIL == var88 && !var90.numGE(var89); var90 = module0048.f_1X(var90)) {
                var91 = ConsesLow.nth(var90, var86);
                var92 = ConsesLow.nth(var90, module0612.$g4714$.getGlobalValue());
                if (NIL != var91) {
                    if (NIL == module0612.f37464(var91, var92)) {
                        var88 = (SubLObject)T;
                    }
                    else if (Sequences.subseq(var86, module0048.f_1X(var90), (SubLObject)UNPROVIDED).equal(Sequences.subseq(var87, module0048.f_1X(var90), (SubLObject)UNPROVIDED)) && NIL == module0612.f37467(module0035.f2124(module0048.f_1X(var90), var87), var92, ConsesLow.nth((SubLObject)FOUR_INTEGER, var87), ConsesLow.nth((SubLObject)FIVE_INTEGER, var87))) {
                        var88 = (SubLObject)T;
                    }
                    else {
                        ConsesLow.set_nth(var90, var86, (SubLObject)NIL);
                    }
                }
            }
        }
        return Functions.apply((SubLObject)$ic27$, var86);
    }
    
    public static SubLObject f37661(final SubLObject var10) {
        if (NIL != module0612.f37382(var10)) {
            return module0612.f37420(var10);
        }
        if (NIL != module0612.f37389(var10) || NIL != module0612.f37388(var10) || $ic28$.eql(var10)) {
            return var10;
        }
        if (NIL != module0612.f37390(var10)) {
            return module0612.$g2464$.getGlobalValue();
        }
        if (NIL != f37619(var10)) {
            return var10;
        }
        final SubLObject var12;
        final SubLObject var11 = var12 = module0205.f13276(var10);
        if (var12.eql($ic0$)) {
            return f37661(module0205.f13277(var10, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic1$)) {
            return f37662(module0205.f13277(var10, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic10$) || var12.eql($ic9$)) {
            return module0202.f12768(var11, f37662(module0205.f13277(var10, (SubLObject)UNPROVIDED)), f37665(module0205.f13368(var10, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic11$) || var12.eql($ic8$)) {
            return (SubLObject)ConsesLow.list(var11, f37661(module0205.f13277(var10, (SubLObject)UNPROVIDED)), f37665(module0205.f13368(var10, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic4$)) {
            final SubLObject var13 = f37661(f37625(f37641(module0205.f13277(var10, (SubLObject)UNPROVIDED))));
            if (NIL != module0612.f37389(var13)) {
                return $ic24$;
            }
            if (NIL != module0612.f37388(var13)) {
                return $ic26$;
            }
            return var13;
        }
        else if (var12.eql($ic6$)) {
            final SubLObject var13 = f37661(module0205.f13277(var10, (SubLObject)UNPROVIDED));
            if (NIL != module0612.f37389(var13)) {
                return $ic24$;
            }
            if (NIL != module0612.f37388(var13)) {
                return $ic26$;
            }
            return var13;
        }
        else {
            if (var12.eql($ic5$) || var12.eql($ic7$)) {
                return module0612.$g2464$.getGlobalValue();
            }
            if (var12.eql($ic3$)) {
                return f37641(module0205.f13277(var10, (SubLObject)UNPROVIDED));
            }
            if (var12.eql($ic2$)) {
                return f37661(f37640(module0205.f13277(var10, (SubLObject)UNPROVIDED)));
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f37664(final SubLObject var11, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (NIL != module0328.f22177(var100, var11, (SubLObject)UNPROVIDED)) {
            return var11;
        }
        var101.resetMultipleValues();
        final SubLObject var102 = module0612.f37398(var11);
        final SubLObject var103 = var101.secondMultipleValue();
        final SubLObject var104 = var101.thirdMultipleValue();
        final SubLObject var105 = var101.fourthMultipleValue();
        final SubLObject var106 = var101.fifthMultipleValue();
        final SubLObject var107 = var101.sixthMultipleValue();
        final SubLObject var108 = var101.seventhMultipleValue();
        var101.resetMultipleValues();
        final SubLObject var109 = (SubLObject)ConsesLow.list(var108, var107, var106, var105, var104, var103);
        var101.resetMultipleValues();
        final SubLObject var78_101 = module0612.f37398(var100);
        final SubLObject var79_102 = var101.secondMultipleValue();
        final SubLObject var80_103 = var101.thirdMultipleValue();
        final SubLObject var81_104 = var101.fourthMultipleValue();
        final SubLObject var82_105 = var101.fifthMultipleValue();
        final SubLObject var83_106 = var101.sixthMultipleValue();
        final SubLObject var84_107 = var101.seventhMultipleValue();
        var101.resetMultipleValues();
        final SubLObject var110 = (SubLObject)ConsesLow.list(var84_107, var83_106, var82_105, var81_104, var80_103, var79_102);
        SubLObject var111 = (SubLObject)NIL;
        if (NIL == var111) {
            SubLObject var112;
            SubLObject var113;
            SubLObject var114;
            SubLObject var115;
            for (var112 = (SubLObject)SIX_INTEGER, var113 = (SubLObject)NIL, var113 = (SubLObject)ZERO_INTEGER; NIL == var111 && !var113.numGE(var112); var113 = module0048.f_1X(var113)) {
                var114 = ConsesLow.nth(var113, var109);
                var115 = ConsesLow.nth(var113, module0612.$g4714$.getGlobalValue());
                if (NIL != var114) {
                    if (NIL == module0612.f37466(var114, var115, ConsesLow.nth((SubLObject)FOUR_INTEGER, var109), ConsesLow.nth((SubLObject)FIVE_INTEGER, var109))) {
                        var111 = (SubLObject)T;
                    }
                    else if (Sequences.subseq(var109, module0048.f_1X(var113), (SubLObject)UNPROVIDED).equal(Sequences.subseq(var110, module0048.f_1X(var113), (SubLObject)UNPROVIDED)) && NIL == module0612.f37465(module0035.f2124(module0048.f_1X(var113), var110), var115)) {
                        var111 = (SubLObject)T;
                    }
                    else {
                        ConsesLow.set_nth(var113, var109, (SubLObject)NIL);
                    }
                }
            }
        }
        return Functions.apply((SubLObject)$ic27$, var109);
    }
    
    public static SubLObject f37662(final SubLObject var10) {
        if (NIL != module0612.f37382(var10)) {
            return module0612.f37422(var10);
        }
        if (NIL != module0612.f37389(var10) || NIL != module0612.f37388(var10) || $ic28$.eql(var10)) {
            return var10;
        }
        if (NIL != module0612.f37390(var10)) {
            return module0612.$g2466$.getGlobalValue();
        }
        if (NIL != f37619(var10)) {
            return var10;
        }
        final SubLObject var12;
        final SubLObject var11 = var12 = module0205.f13276(var10);
        if (var12.eql($ic0$)) {
            return f37662(module0205.f13368(var10, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic1$)) {
            return f37661(module0205.f13368(var10, (SubLObject)UNPROVIDED));
        }
        if (var12.eql($ic10$) || var12.eql($ic9$)) {
            return (SubLObject)ConsesLow.list(var11, f37661(module0205.f13277(var10, (SubLObject)UNPROVIDED)), f37665(module0205.f13368(var10, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic11$) || var12.eql($ic8$)) {
            return (SubLObject)ConsesLow.list(var11, f37662(module0205.f13277(var10, (SubLObject)UNPROVIDED)), f37665(module0205.f13368(var10, (SubLObject)UNPROVIDED)));
        }
        if (var12.eql($ic4$) || var12.eql($ic6$)) {
            return module0612.$g2466$.getGlobalValue();
        }
        if (var12.eql($ic5$)) {
            final SubLObject var13 = f37662(f37626(f37640(module0205.f13277(var10, (SubLObject)UNPROVIDED))));
            if (NIL != module0612.f37388(var13)) {
                return $ic24$;
            }
            if (NIL != module0612.f37389(var13)) {
                return $ic26$;
            }
            return var13;
        }
        else if (var12.eql($ic7$)) {
            final SubLObject var13 = f37662(module0205.f13277(var10, (SubLObject)UNPROVIDED));
            if (NIL != module0612.f37388(var13)) {
                return $ic24$;
            }
            if (NIL != module0612.f37389(var13)) {
                return $ic26$;
            }
            return var13;
        }
        else {
            if (var12.eql($ic3$)) {
                return f37662(f37641(var10));
            }
            if (var12.eql($ic2$)) {
                return f37640(var10);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f37665(final SubLObject var67) {
        return var67;
    }
    
    public static SubLObject f37666(final SubLObject var12, final SubLObject var13) {
        final SubLObject var14 = f37623(var12);
        final SubLObject var15 = f37623(var13);
        final SubLObject var16 = f37631(var12);
        final SubLObject var17 = f37629(var12);
        final SubLObject var18 = f37630(var12);
        final SubLObject var19 = f37632(var12);
        final SubLObject var20 = f37631(var13);
        final SubLObject var21 = f37629(var13);
        final SubLObject var22 = f37630(var13);
        final SubLObject var23 = f37632(var13);
        SubLObject var24 = (NIL != module0612.f37485(var16, var20)) ? var16 : var20;
        final SubLObject var25 = (NIL != module0612.f37485(var17, var21)) ? var17 : var21;
        final SubLObject var26 = (NIL != module0612.f37488(var18, var22)) ? var18 : var22;
        SubLObject var27 = (NIL != module0612.f37488(var19, var23)) ? var19 : var23;
        if (NIL != module0612.f37389(var24) && ((var25.equal(var16) && var25.equal(var17)) || (var25.equal(var20) && var25.equal(var21))) && NIL != module0612.f37388(var27) && ((var26.equal(var18) && var26.equal(var19)) || (var26.equal(var22) && var26.equal(var23)))) {
            var24 = var25;
            var27 = var26;
        }
        return f37648(var24, var25, var26, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37667(final SubLObject var10) {
        return f37645(f37624((SubLObject)ConsesLow.list($ic5$, var10)));
    }
    
    public static SubLObject f37668(final SubLObject var10) {
        return f37645(f37624((SubLObject)ConsesLow.list($ic4$, var10)));
    }
    
    public static SubLObject f37669(final SubLObject var78) {
        return (SubLObject)makeBoolean(NIL != module0004.f104(var78, (SubLObject)$ic29$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || (NIL != module0615.f37692(var78) && NIL != module0612.f37437(var78)) || NIL != module0615.f37694(var78) || NIL != module0615.f37695(var78) || NIL != module0615.f37693(var78));
    }
    
    public static SubLObject f37670(final SubLObject var10, final SubLObject var78, final SubLObject var113) {
        if (NIL == f37617(var10) || NIL == f37669(var78)) {
            return (SubLObject)ConsesLow.list($ic30$, var113, var10, var78);
        }
        final SubLObject var114 = module0615.f37753(var10, var78, (SubLObject)ZERO_INTEGER);
        return (SubLObject)((NIL != var114) ? module0615.f37720(var114, var78, var113) : NIL);
    }
    
    public static SubLObject f37671(final SubLObject var10, final SubLObject var78, final SubLObject var113) {
        if (NIL == f37617(var10) || NIL == f37669(var78)) {
            return (SubLObject)ConsesLow.list($ic31$, var113, var10, var78);
        }
        final SubLObject var114 = module0615.f37720(var10, var78, (SubLObject)ZERO_INTEGER);
        return (SubLObject)((NIL != var114) ? module0615.f37717(var114, var78, var113) : NIL);
    }
    
    public static SubLObject f37672(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var11) && NIL == f37617(var10)) {
            Errors.error((SubLObject)$ic32$, var10);
        }
        return Equality.eql(module0205.f13276(var10), $ic5$);
    }
    
    public static SubLObject f37673(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var11) && NIL == f37617(var10)) {
            Errors.error((SubLObject)$ic32$, var10);
        }
        return Equality.eql(module0205.f13276(var10), $ic4$);
    }
    
    public static SubLObject f37674(final SubLObject var10, final SubLObject var67) {
        final SubLObject var68 = module0615.f37707(var67);
        return module0609.f37191(f37675(var10, var68), var67);
    }
    
    public static SubLObject f37675(final SubLObject var10, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        if (NIL != f37617(var10)) {
            return f37676(var10, var43);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37676(final SubLObject var10, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        if (NIL != var43 && !areAssertionsDisabledFor(me) && NIL == module0615.f37702(var43)) {
            throw new AssertionError(var43);
        }
        if (NIL != module0612.f37382(var10)) {
            final SubLObject var44 = module0612.f37425(var10);
            if (NIL == var43 || var43.eql(var44)) {
                final SubLObject var45 = module0615.f37716(module0612.f37425(var10));
                return (SubLObject)((NIL != module0615.f37703(var45)) ? var45 : NIL);
            }
            final SubLObject var46 = f37640(var10);
            final SubLObject var47 = f37641(var10);
            return module0612.f37500(var46, f37625(var47), var43);
        }
        else {
            if (NIL != f37623(var10)) {
                return (SubLObject)NIL;
            }
            if (NIL != f37618(var10)) {
                final SubLObject var48 = module0205.f13136(var10);
                if (var48.eql($ic0$)) {
                    SubLObject var50;
                    final SubLObject var49 = var50 = module0205.f13207(var10, (SubLObject)UNPROVIDED);
                    SubLObject var51 = (SubLObject)NIL;
                    SubLObject var52 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var50, var49, (SubLObject)$ic20$);
                    var51 = var50.first();
                    var50 = var50.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var50, var49, (SubLObject)$ic20$);
                    var52 = var50.first();
                    var50 = var50.rest();
                    if (NIL == var50) {
                        if (NIL == module0612.f37382(var51)) {
                            var51 = f37640(var51);
                        }
                        if (NIL == module0612.f37382(var52)) {
                            var52 = f37641(var52);
                        }
                        return module0612.f37500(var51, f37625(var52), var43);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var49, (SubLObject)$ic20$);
                }
                else if (var48.eql($ic1$)) {
                    SubLObject var54;
                    final SubLObject var53 = var54 = module0205.f13207(var10, (SubLObject)UNPROVIDED);
                    SubLObject var51 = (SubLObject)NIL;
                    SubLObject var52 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)$ic20$);
                    var51 = var54.first();
                    var54 = var54.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var54, var53, (SubLObject)$ic20$);
                    var52 = var54.first();
                    var54 = var54.rest();
                    if (NIL == var54) {
                        if (NIL == module0612.f37382(var51)) {
                            var51 = f37641(var51);
                        }
                        if (NIL == module0612.f37382(var52)) {
                            var52 = f37640(var52);
                        }
                        return module0612.f37500(f37625(var51), var52, var43);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(var53, (SubLObject)$ic20$);
                }
                else {
                    if (var48.eql($ic2$) || var48.eql($ic3$)) {
                        return module0202.f12643($ic34$, (SubLObject)ONE_INTEGER);
                    }
                    if (var48.eql($ic11$) || var48.eql($ic10$)) {
                        return module0205.f13204(var10, (SubLObject)UNPROVIDED);
                    }
                    if (var48.eql($ic6$) || var48.eql($ic4$) || var48.eql($ic7$) || var48.eql($ic5$)) {
                        return (SubLObject)NIL;
                    }
                    return (SubLObject)NIL;
                }
                return (SubLObject)NIL;
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f37677() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37617", "S#13436", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37620", "S#41280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37618", "S#41281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37619", "S#41282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37623", "S#34878", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37621", "S#41283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37622", "S#41284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37624", "S#41285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37625", "S#41286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37626", "S#41287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37627", "S#34880", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37628", "S#14103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37633", "S#34879", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37634", "S#20105", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37639", "S#41288", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37642", "S#41289", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37631", "S#41290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37629", "S#41291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37630", "S#41292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37632", "S#41293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37640", "S#20102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37641", "S#20103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37635", "S#41294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37636", "S#41295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37637", "S#41296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37638", "S#41297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37643", "S#20161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37644", "S#20162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37645", "S#13437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37647", "S#20111", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37648", "S#41298", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37650", "S#41299", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37646", "S#41300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37649", "S#41301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37651", "S#41302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37652", "S#41303", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37653", "S#41304", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37654", "S#41305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37655", "S#41306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37656", "S#41307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37657", "S#41308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37658", "S#41309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37659", "S#41310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37660", "S#41311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37663", "S#41312", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37661", "S#34901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37664", "S#41313", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37662", "S#34903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37665", "S#41314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37666", "S#41315", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37667", "S#41316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37668", "S#41317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37669", "S#13447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37670", "S#13453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37671", "S#13454", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37672", "S#41318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37673", "S#41319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37674", "S#24966", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37675", "S#41320", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0614", "f37676", "S#34854", 1, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37678() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37679() {
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f37677();
    }
    
    public void initializeVariables() {
        f37678();
    }
    
    public void runTopLevelForms() {
        f37679();
    }
    
    static {
        me = (SubLFile)new module0614();
        $ic0$ = constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalInclusiveFn"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)makeString("TimeIntervalBetweenFn"));
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("StartFn"));
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("EndFn"));
        $ic4$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalStartedByFn-Inclusive"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalEndedByFn-Inclusive"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("DateBeforeFn"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("DateAfterFn"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalAfterFn"));
        $ic11$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalBeforeFn"));
        $ic12$ = makeSymbol("S#34878", "CYC");
        $ic13$ = constant_handles_oc.f8479((SubLObject)makeString("SomeTimeInIntervalFn"));
        $ic14$ = makeInteger(36);
        $ic15$ = makeString("~a is not a proper time interval.");
        $ic16$ = makeKeyword("END");
        $ic17$ = makeKeyword("START");
        $ic18$ = makeSymbol("GUID-STRING-P");
        $ic19$ = makeSymbol("NULL");
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#125", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)makeSymbol("S#124", "CYC"), (SubLObject)makeSymbol("S#34883", "CYC"));
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#125", "CYC"), (SubLObject)makeSymbol("S#34883", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#41321", "CYC"), (SubLObject)makeSymbol("S#1519", "CYC"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)makeString("Always-TimeInterval"));
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("ContinuousTimeInterval"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptyTimeInterval"));
        $ic27$ = makeSymbol("S#41116", "CYC");
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("Now"));
        $ic29$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("CalendarSecond")), constant_handles_oc.f8479((SubLObject)makeString("CalendarMinute")), constant_handles_oc.f8479((SubLObject)makeString("CalendarHour")), constant_handles_oc.f8479((SubLObject)makeString("CalendarDay")), constant_handles_oc.f8479((SubLObject)makeString("CalendarMonth")), constant_handles_oc.f8479((SubLObject)makeString("CalendarYear")), constant_handles_oc.f8479((SubLObject)makeString("CalendarWeek")), constant_handles_oc.f8479((SubLObject)makeString("CalendarQuarter")), constant_handles_oc.f8479((SubLObject)makeString("CalendarDecade")), constant_handles_oc.f8479((SubLObject)makeString("CalendarCentury")), constant_handles_oc.f8479((SubLObject)makeString("CalendarHalfCentury")), constant_handles_oc.f8479((SubLObject)makeString("CalendarMillennium")), constant_handles_oc.f8479((SubLObject)makeString("CalendarWorkWeek")), constant_handles_oc.f8479((SubLObject)makeString("CalendarWeekend")), constant_handles_oc.f8479((SubLObject)makeString("Weekday")) });
        $ic30$ = constant_handles_oc.f8479((SubLObject)makeString("NthMetricallyPrecedingTimeIntervalOfTypeFn"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)makeString("NthMetricallySucceedingTimeIntervalOfTypeFn"));
        $ic32$ = makeString("~a not a date-interval-p");
        $ic33$ = makeSymbol("S#34853", "CYC");
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("TimePointsDuration"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 302 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/