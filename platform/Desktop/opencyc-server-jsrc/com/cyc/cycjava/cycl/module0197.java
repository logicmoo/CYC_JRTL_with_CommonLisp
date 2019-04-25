package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0197 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0197";
    public static final String myFingerPrint = "4c642b66ddf10c93096cb2b526a9af703ef2f4659f8d8c0f265e1d2270de981b";
    private static SubLSymbol $g2283$;
    private static SubLSymbol $g2284$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLList $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLString $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
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
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    
    public static SubLObject f12248(final SubLObject var1, final SubLObject var2) {
        if (NIL != f12249((SubLObject)$ic2$)) {
            return f12250((SubLObject)$ic2$, (SubLObject)ConsesLow.list((SubLObject)$ic42$, module0196.f12243(var1), (SubLObject)$ic43$, module0196.f12243(var2)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12251(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic2$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic2$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic43$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12252(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic2$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic2$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic42$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12253(final SubLObject var4, final SubLObject var5, final SubLObject var6) {
        if (NIL != f12249((SubLObject)$ic6$)) {
            return f12250((SubLObject)$ic6$, (SubLObject)ConsesLow.list((SubLObject)$ic46$, module0196.f12243(var4), (SubLObject)$ic47$, module0196.f12243(var5), (SubLObject)$ic48$, module0196.f12243(var6)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12254(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic6$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic6$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic48$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12255(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic6$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic6$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic47$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12256(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic6$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic6$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic46$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12257(final SubLObject var4) {
        if (NIL != f12249((SubLObject)$ic4$)) {
            return f12250((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)$ic46$, module0196.f12243(var4), (SubLObject)$ic43$, module0196.f12243(constants_high_oc.f10757(var4))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12258(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic4$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic4$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic46$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12259(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic4$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic4$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic43$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12260(final SubLObject var7) {
        if (NIL != f12249((SubLObject)$ic8$)) {
            return f12250((SubLObject)$ic8$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, module0196.f12243(var7)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12261(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic8$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic8$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic49$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12262(final SubLObject var8) {
        if (NIL != f12249((SubLObject)$ic10$)) {
            return f12250((SubLObject)$ic10$, (SubLObject)ConsesLow.list((SubLObject)$ic49$, module0196.f12243(module0172.f10915(var8))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12263(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic10$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic10$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic49$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12264(final SubLObject var9, final SubLObject var10) {
        if (NIL != f12249((SubLObject)$ic12$) && NIL == f12265(var9)) {
            return f12250((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic50$, module0196.f12243(var9), (SubLObject)$ic51$, module0196.f12243(var10)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12265(final SubLObject var9) {
        return f12266(var9);
    }
    
    public static SubLObject f12266(final SubLObject var9) {
        if (NIL != module0204.f13044(var9)) {
            final SubLObject var10 = module0232.f15308(var9).first();
            final SubLObject var11 = module0205.f13132(var10);
            return Equality.eql(var11, $ic52$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12267(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic12$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic12$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic51$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12268(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic12$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic12$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic50$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12269(final SubLObject var13, SubLObject var14) {
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)$ic53$;
        }
        if (NIL != f12249((SubLObject)$ic14$)) {
            return f12250((SubLObject)$ic14$, (SubLObject)ConsesLow.list((SubLObject)$ic54$, module0571.f34986(module0205.f13339(module0289.f19396(var13), var14)), (SubLObject)$ic51$, module0196.f12243(module0178.f11287(var13)), (SubLObject)$ic55$, module0196.f12243(module0178.f11284(var13))));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12270(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic14$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic14$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic55$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12271(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic14$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic14$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic51$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12272(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic14$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic14$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic54$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12273(final SubLObject var13, final SubLObject var15, final SubLObject var16) {
        if (NIL != f12249((SubLObject)$ic16$)) {
            return f12250((SubLObject)$ic16$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic57$, module0196.f12243(var15), (SubLObject)$ic58$, module0196.f12243(var16)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12274(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic16$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic16$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic58$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12275(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic16$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic16$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic57$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12276(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic16$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic16$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12277(final SubLObject var13, final SubLObject var17, final SubLObject var18) {
        if (NIL != f12249((SubLObject)$ic19$)) {
            return f12250((SubLObject)$ic19$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic59$, module0196.f12243(var17), (SubLObject)$ic60$, module0196.f12243(var18)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12278(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic19$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic19$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic60$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12279(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic19$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic19$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic59$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12280(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic19$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic19$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12281(final SubLObject var13, final SubLObject var19, final SubLObject var20) {
        if (NIL != f12249((SubLObject)$ic18$)) {
            return f12250((SubLObject)$ic18$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic61$, module0196.f12243(var19), (SubLObject)$ic62$, module0196.f12243(var20)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12282(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic18$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic18$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic62$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12283(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic18$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic18$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic61$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12284(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic18$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic18$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12285(final SubLObject var13, final SubLObject var21, final SubLObject var22) {
        if (NIL != f12249((SubLObject)$ic20$)) {
            return f12250((SubLObject)$ic20$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic63$, module0196.f12243(var21), (SubLObject)$ic64$, module0196.f12243(var22)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12286(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic20$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic20$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic64$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12287(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic20$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic20$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic63$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12288(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic20$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic20$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12289(final SubLObject var13, final SubLObject var23, final SubLObject var24) {
        if (NIL != f12249((SubLObject)$ic22$)) {
            return f12250((SubLObject)$ic22$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic65$, module0196.f12243(var23), (SubLObject)$ic66$, module0196.f12243(var24)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12290(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic22$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic22$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic66$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12291(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic22$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic22$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic65$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12292(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic22$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic22$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12293(final SubLObject var13, final SubLObject var25, final SubLObject var26) {
        if (NIL != f12249((SubLObject)$ic24$)) {
            return f12250((SubLObject)$ic24$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic67$, module0196.f12243(var25), (SubLObject)$ic68$, module0196.f12243(var26)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12294(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic24$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic24$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic68$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12295(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic24$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic24$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic67$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12296(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic24$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic24$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12297(final SubLObject var13, final SubLObject var27, final SubLObject var28) {
        if (NIL != f12249((SubLObject)$ic23$)) {
            return f12250((SubLObject)$ic23$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic69$, module0196.f12243(var27), (SubLObject)$ic70$, module0196.f12243(var28)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12298(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic23$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic23$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic70$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12299(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic23$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic23$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic69$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12300(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic23$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic23$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12301(final SubLObject var13, final SubLObject var29, final SubLObject var30) {
        if (NIL != f12249((SubLObject)$ic25$)) {
            return f12250((SubLObject)$ic25$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic71$, module0196.f12243(var29), (SubLObject)$ic72$, module0196.f12243(var30)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12302(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic25$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic25$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic72$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12303(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic25$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic25$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic71$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12304(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic25$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic25$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12305(final SubLObject var13, final SubLObject var31, final SubLObject var32) {
        if (NIL != f12249((SubLObject)$ic26$)) {
            return f12250((SubLObject)$ic26$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic73$, module0196.f12243(var31), (SubLObject)$ic74$, module0196.f12243(var32)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12306(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic26$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic26$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic74$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12307(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic26$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic26$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic73$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12308(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic26$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic26$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12309(final SubLObject var13, final SubLObject var33) {
        if (NIL != f12249((SubLObject)$ic28$)) {
            return f12250((SubLObject)$ic28$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic75$, module0196.f12243(var33)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12310(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic28$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic28$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic75$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12311(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic28$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic28$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12312(final SubLObject var13, final SubLObject var34, final SubLObject var31, final SubLObject var32) {
        if (NIL != f12249((SubLObject)$ic30$)) {
            return f12250((SubLObject)$ic30$, (SubLObject)ConsesLow.list((SubLObject)$ic56$, module0196.f12243(var13), (SubLObject)$ic76$, module0196.f12243(var34), (SubLObject)$ic73$, module0196.f12243(var31), (SubLObject)$ic74$, module0196.f12243(var32)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12313(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic30$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic30$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic73$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12314(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic30$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic30$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic76$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12315(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic30$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic30$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12316(final SubLObject var35) {
        if (NIL != f12249((SubLObject)$ic32$)) {
            return f12250((SubLObject)$ic32$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, var35));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12317(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic32$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic32$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic77$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12318(final SubLObject var35, final SubLObject var19, final SubLObject var20) {
        if (NIL != f12249((SubLObject)$ic34$)) {
            return f12250((SubLObject)$ic34$, (SubLObject)ConsesLow.list((SubLObject)$ic77$, var35, (SubLObject)$ic61$, var19, (SubLObject)$ic62$, var20));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12319(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic34$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic34$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic62$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12320(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic34$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic34$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic61$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12321(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic34$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic34$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic77$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12322(final SubLObject var36, final SubLObject var37) {
        if (NIL != f12249((SubLObject)$ic36$)) {
            return f12250((SubLObject)$ic36$, (SubLObject)ConsesLow.list((SubLObject)$ic78$, module0196.f12243(var36), (SubLObject)$ic79$, module0196.f12243(var37)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12323(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic36$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic36$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic79$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12324(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic36$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic36$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic78$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12325(final SubLObject var38) {
        if (NIL != f12249((SubLObject)$ic38$)) {
            return f12250((SubLObject)$ic38$, (SubLObject)ConsesLow.list((SubLObject)$ic80$, module0196.f12243(var38)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12326(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic38$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic38$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic80$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12327(final SubLObject var39, final SubLObject var13) {
        return f12250((SubLObject)$ic40$, (SubLObject)ConsesLow.list((SubLObject)$ic81$, module0196.f12243(var39), (SubLObject)$ic56$, module0196.f12243(var13)));
    }
    
    public static SubLObject f12328(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic40$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic40$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12329(final SubLObject var3) {
        assert NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != $ic40$ && NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)$ic45$, var3, module0116.f8053(var3), (SubLObject)$ic40$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)$ic81$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f12250(final SubLObject var40, final SubLObject var41) {
        return f12330(f12331(var40, var41));
    }
    
    public static SubLObject f12331(final SubLObject var40, final SubLObject var41) {
        return module0116.f8064(var40, var41, module0018.f967());
    }
    
    public static SubLObject f12330(final SubLObject var42) {
        return module0117.f8161(var42, f12332());
    }
    
    public static SubLObject f12332() {
        return module0117.f8146();
    }
    
    public static SubLObject f12249(final SubLObject var40) {
        return module0117.f8152(var40, f12332());
    }
    
    public static SubLObject f12333() {
        return module0118.f8175((SubLObject)$ic83$);
    }
    
    public static SubLObject f12334() {
        if (NIL == f12333()) {
            f12335();
        }
        return module0118.f8177();
    }
    
    public static SubLObject f12336(final SubLObject var43) {
        final SubLObject var44 = $g2283$.getGlobalValue();
        SubLObject var45 = (SubLObject)NIL;
        try {
            var45 = Locks.seize_lock(var44);
            if (NIL == Sequences.find(var43, $g2284$.getGlobalValue(), (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                $g2284$.setGlobalValue((SubLObject)ConsesLow.cons(var43, $g2284$.getGlobalValue()));
                if (NIL != f12333()) {
                    module0117.f8156(var43, (SubLObject)NIL);
                }
            }
        }
        finally {
            if (NIL != var45) {
                Locks.release_lock(var44);
            }
        }
        return var43;
    }
    
    public static SubLObject f12337(final SubLObject var46) {
        final SubLObject var47 = $g2283$.getGlobalValue();
        SubLObject var48 = (SubLObject)NIL;
        try {
            var48 = Locks.seize_lock(var47);
            $g2284$.setGlobalValue(Sequences.remove(var46, $g2284$.getGlobalValue(), (SubLObject)EQUALP, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            if (NIL != f12333()) {
                module0117.f8158(var46, (SubLObject)NIL);
            }
        }
        finally {
            if (NIL != var48) {
                Locks.release_lock(var47);
            }
        }
        return var46;
    }
    
    public static SubLObject f12338() {
        return module0118.f8181((SubLObject)$ic83$);
    }
    
    public static SubLObject f12335() {
        return module0118.f8178((SubLObject)$ic83$);
    }
    
    public static SubLObject f12339() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12248", "S#13485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12251", "S#15070", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12252", "S#15071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12253", "S#13495", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12254", "S#15072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12255", "S#15073", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12256", "S#15074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12257", "S#13489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12258", "S#15075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12259", "S#15076", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12260", "S#13651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12261", "S#15077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12262", "S#13655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12263", "S#15078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12264", "S#15079", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12265", "S#15080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12266", "S#15081", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12267", "S#15082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12268", "S#15083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12269", "S#15084", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12270", "S#15085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12271", "S#15086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12272", "S#15087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12273", "S#13876", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12274", "S#15088", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12275", "S#15089", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12276", "S#15090", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12277", "S#13878", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12278", "S#15091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12279", "S#15092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12280", "S#15093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12281", "S#13880", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12282", "S#15094", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12283", "S#15095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12284", "S#15096", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12285", "S#13882", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12286", "S#15097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12287", "S#15098", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12288", "S#15099", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12289", "S#13883", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12290", "S#15100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12291", "S#15101", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12292", "S#15102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12293", "S#13885", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12294", "S#15103", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12295", "S#15104", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12296", "S#15105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12297", "S#13887", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12298", "S#15106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12299", "S#15107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12300", "S#15108", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12301", "S#13888", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12302", "S#15109", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12303", "S#15110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12304", "S#15111", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12305", "S#13895", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12306", "S#15112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12307", "S#15113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12308", "S#15114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12309", "S#13896", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12310", "S#15115", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12311", "S#15116", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12312", "S#14494", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12313", "S#15117", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12314", "S#15118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12315", "S#15119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12316", "S#14498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12317", "S#15120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12318", "S#14507", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12319", "S#15121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12320", "S#15122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12321", "S#15123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12322", "S#14255", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12323", "S#15124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12324", "S#15125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12325", "S#14259", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12326", "S#15126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12327", "S#15127", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12328", "S#15128", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12329", "S#15129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12250", "S#15130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12331", "S#15131", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12330", "S#15132", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12332", "S#15133", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12249", "S#15134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12333", "S#15135", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12334", "S#15136", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12336", "S#15137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12337", "S#15138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12338", "S#15139", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0197", "f12335", "S#15140", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12340() {
        $g2283$ = SubLFiles.deflexical("S#15141", Locks.make_lock((SubLObject)$ic82$));
        $g2284$ = SubLFiles.deflexical("S#15142", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic83$)) ? $g2284$.getGlobalValue() : NIL));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f12341() {
        module0116.f8043((SubLObject)$ic0$, (SubLObject)$ic1$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic0$, (SubLObject)NIL);
        module0116.f8043((SubLObject)$ic2$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic2$, (SubLObject)$ic3$);
        module0116.f8043((SubLObject)$ic4$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic4$, (SubLObject)$ic5$);
        module0116.f8043((SubLObject)$ic6$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic6$, (SubLObject)$ic7$);
        module0116.f8043((SubLObject)$ic8$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic8$, (SubLObject)$ic9$);
        module0116.f8043((SubLObject)$ic10$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic10$, (SubLObject)$ic11$);
        module0116.f8043((SubLObject)$ic12$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic12$, (SubLObject)$ic13$);
        module0116.f8043((SubLObject)$ic14$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic14$, (SubLObject)$ic15$);
        module0116.f8043((SubLObject)$ic16$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic16$, (SubLObject)$ic17$);
        module0116.f8043((SubLObject)$ic18$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic18$, (SubLObject)$ic17$);
        module0116.f8043((SubLObject)$ic19$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic19$, (SubLObject)$ic17$);
        module0116.f8043((SubLObject)$ic20$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic20$, (SubLObject)$ic21$);
        module0116.f8043((SubLObject)$ic22$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic22$, (SubLObject)$ic21$);
        module0116.f8043((SubLObject)$ic23$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic23$, (SubLObject)$ic21$);
        module0116.f8043((SubLObject)$ic24$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic24$, (SubLObject)$ic21$);
        module0116.f8043((SubLObject)$ic25$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic25$, (SubLObject)$ic21$);
        module0116.f8043((SubLObject)$ic26$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic26$, (SubLObject)$ic27$);
        module0116.f8043((SubLObject)$ic28$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0116.f8043((SubLObject)$ic30$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic30$, (SubLObject)$ic31$);
        module0116.f8043((SubLObject)$ic32$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic32$, (SubLObject)$ic33$);
        module0116.f8043((SubLObject)$ic34$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic34$, (SubLObject)$ic35$);
        module0116.f8043((SubLObject)$ic36$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic36$, (SubLObject)$ic37$);
        module0116.f8043((SubLObject)$ic38$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic38$, (SubLObject)$ic39$);
        module0116.f8043((SubLObject)$ic40$, (SubLObject)$ic0$, (SubLObject)NIL);
        module0196.f12234((SubLObject)$ic40$, (SubLObject)$ic41$);
        module0003.f57((SubLObject)$ic83$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f12339();
    }
    
    public void initializeVariables() {
        f12340();
    }
    
    public void runTopLevelForms() {
        f12341();
    }
    
    static {
        me = (SubLFile)new module0197();
        $g2283$ = null;
        $g2284$ = null;
        $ic0$ = makeKeyword("KB-MODIFICATION-EVENT");
        $ic1$ = makeKeyword("KB-STORE-EVENT");
        $ic2$ = makeKeyword("KB-MODIFY-CREATE-CONSTANT");
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("EXISTENCE"), (SubLObject)makeKeyword("CREATION"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("CONSTANT"));
        $ic4$ = makeKeyword("KB-MODIFY-REMOVE-CONSTANT");
        $ic5$ = ConsesLow.list((SubLObject)makeKeyword("EXISTENCE"), (SubLObject)makeKeyword("REMOVAL"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("CONSTANT"));
        $ic6$ = makeKeyword("KB-MODIFY-RENAME-CONSTANT");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("PROPERTY-CHANGE"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("CONSTANT"));
        $ic8$ = makeKeyword("KB-MODIFY-CREATE-NART");
        $ic9$ = ConsesLow.list((SubLObject)makeKeyword("EXISTENCE"), (SubLObject)makeKeyword("CREATION"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NART"));
        $ic10$ = makeKeyword("KB-MODIFY-REMOVE-NART");
        $ic11$ = ConsesLow.list((SubLObject)makeKeyword("EXISTENCE"), (SubLObject)makeKeyword("REMOVAL"), (SubLObject)makeKeyword("FORT"), (SubLObject)makeKeyword("NART"));
        $ic12$ = makeKeyword("KB-MODIFY-CREATE-ASSERTION");
        $ic13$ = ConsesLow.list((SubLObject)makeKeyword("EXISTENCE"), (SubLObject)makeKeyword("CREATION"), (SubLObject)makeKeyword("ASSERTION"));
        $ic14$ = makeKeyword("KB-MODIFY-REMOVE-ASSERTION");
        $ic15$ = ConsesLow.list((SubLObject)makeKeyword("EXISTENCE"), (SubLObject)makeKeyword("REMOVAL"), (SubLObject)makeKeyword("ASSERTION"));
        $ic16$ = makeKeyword("KB-MODIFY-SET-ASSERTION-DIRECTION");
        $ic17$ = ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("PROPERTY-CHANGE"));
        $ic18$ = makeKeyword("KB-MODIFY-SET-ASSERTION-STRENGTH");
        $ic19$ = makeKeyword("KB-MODIFY-SET-ASSERTION-TRUTH");
        $ic20$ = makeKeyword("KB-MODIFY-SET-ASSERTION-VARIABLE-NAMES");
        $ic21$ = ConsesLow.list((SubLObject)makeKeyword("ASSERTION"), (SubLObject)makeKeyword("META-PROPERTY-CHANGE"));
        $ic22$ = makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-BY");
        $ic23$ = makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-WHY");
        $ic24$ = makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN");
        $ic25$ = makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND");
        $ic26$ = makeKeyword("KB-MODIFY-CREATE-ASSERTED-ARGUMENT");
        $ic27$ = ConsesLow.list((SubLObject)makeKeyword("ASSERTED-ARGUMENT"), (SubLObject)makeKeyword("CREATION"), (SubLObject)makeKeyword("EXISTENCE"));
        $ic28$ = makeKeyword("KB-MODIFY-REMOVE-ASSERTED-ARGUMENT");
        $ic29$ = ConsesLow.list((SubLObject)makeKeyword("ASSERTED-ARGUMENT"), (SubLObject)makeKeyword("REMOVAL"), (SubLObject)makeKeyword("EXISTENCE"));
        $ic30$ = makeKeyword("KB-MODIFY-CREATE-NEW-DEDUCTION");
        $ic31$ = ConsesLow.list((SubLObject)makeKeyword("DEDUCTION"), (SubLObject)makeKeyword("CREATION"), (SubLObject)makeKeyword("EXISTENCE"));
        $ic32$ = makeKeyword("KB-MODIFY-REMOVE-DEDUCTION");
        $ic33$ = ConsesLow.list((SubLObject)makeKeyword("DEDUCTION"), (SubLObject)makeKeyword("REMOVAL"), (SubLObject)makeKeyword("EXISTENCE"));
        $ic34$ = makeKeyword("KB-MODIFY-SET-DEDUCTION-STRENGTH");
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("DEDUCTION"), (SubLObject)makeKeyword("PROPERTY-CHANGE"));
        $ic36$ = makeKeyword("KB-MODIFY-CREATE-NEW-KB-HL-SUPPORT");
        $ic37$ = ConsesLow.list((SubLObject)makeKeyword("KB-HL-SUPPORT"), (SubLObject)makeKeyword("CREATION"), (SubLObject)makeKeyword("EXISTENCE"));
        $ic38$ = makeKeyword("KB-MODIFY-REMOVE-KB-HL-SUPPORT");
        $ic39$ = ConsesLow.list((SubLObject)makeKeyword("KB-HL-SUPPORT"), (SubLObject)makeKeyword("REMOVAL"), (SubLObject)makeKeyword("EXISTENCE"));
        $ic40$ = makeKeyword("KB-MODIFY-IRRELEVANCE");
        $ic41$ = ConsesLow.list((SubLObject)makeKeyword("TERM"), (SubLObject)makeKeyword("ASSERTION"));
        $ic42$ = makeKeyword("NAME");
        $ic43$ = makeKeyword("EXTERNAL-ID");
        $ic44$ = makeSymbol("S#10059", "CYC");
        $ic45$ = makeString("Event ~S is of type ~S, not ~S.");
        $ic46$ = makeKeyword("CONSTANT");
        $ic47$ = makeKeyword("OLD-CONSTANT-NAME");
        $ic48$ = makeKeyword("NEW-CONSTANT-NAME");
        $ic49$ = makeKeyword("NART-HL-FORMULA");
        $ic50$ = makeKeyword("CNF");
        $ic51$ = makeKeyword("MT");
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("termOfUnit"));
        $ic53$ = makeKeyword("TRUE");
        $ic54$ = makeKeyword("SENTENCE");
        $ic55$ = makeKeyword("GAF");
        $ic56$ = makeKeyword("ASSERTION");
        $ic57$ = makeKeyword("OLD-DIRECTION");
        $ic58$ = makeKeyword("NEW-DIRECTION");
        $ic59$ = makeKeyword("OLD-TRUTH");
        $ic60$ = makeKeyword("NEW-TRUTH");
        $ic61$ = makeKeyword("OLD-STRENGTH");
        $ic62$ = makeKeyword("NEW-STRENGTH");
        $ic63$ = makeKeyword("OLD-VAR-NAMES");
        $ic64$ = makeKeyword("NEW-VAR-NAMES");
        $ic65$ = makeKeyword("OLD-ASSERTED-BY");
        $ic66$ = makeKeyword("NEW-ASSERTED-BY");
        $ic67$ = makeKeyword("OLD-ASSERTED-WHEN");
        $ic68$ = makeKeyword("NEW-ASSERTED-WHEN");
        $ic69$ = makeKeyword("OLD-ASSERTED-WHY");
        $ic70$ = makeKeyword("NEW-ASSERTED-WHY");
        $ic71$ = makeKeyword("OLD-ASSERTED-SECOND");
        $ic72$ = makeKeyword("NEW-ASSERTED-SECOND");
        $ic73$ = makeKeyword("TRUTH");
        $ic74$ = makeKeyword("STRENGTH");
        $ic75$ = makeKeyword("ASSERTED-ARGUMENT");
        $ic76$ = makeKeyword("SUPPORTS");
        $ic77$ = makeKeyword("DEDUCTION");
        $ic78$ = makeKeyword("HL-SUPPORT");
        $ic79$ = makeKeyword("JUSTIFICATION");
        $ic80$ = makeKeyword("KB-HL-SUPPORT");
        $ic81$ = makeKeyword("TERM");
        $ic82$ = makeString("KB-MODIFICATIONS-EVENT-DISPATCHER Lock");
        $ic83$ = makeSymbol("S#15142", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 256 ms
	
	Decompiled with Procyon 0.5.32.
*/