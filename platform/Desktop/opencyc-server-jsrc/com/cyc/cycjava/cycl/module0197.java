package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
        if (module0197.NIL != f12249((SubLObject)module0197.$ic2$)) {
            return f12250((SubLObject)module0197.$ic2$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic42$, module0196.f12243(var1), (SubLObject)module0197.$ic43$, module0196.f12243(var2)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12251(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic2$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic2$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic43$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12252(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic2$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic2$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic42$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12253(final SubLObject var4, final SubLObject var5, final SubLObject var6) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic6$)) {
            return f12250((SubLObject)module0197.$ic6$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic46$, module0196.f12243(var4), (SubLObject)module0197.$ic47$, module0196.f12243(var5), (SubLObject)module0197.$ic48$, module0196.f12243(var6)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12254(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic6$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic6$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic48$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12255(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic6$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic6$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic47$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12256(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic6$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic6$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic46$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12257(final SubLObject var4) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic4$)) {
            return f12250((SubLObject)module0197.$ic4$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic46$, module0196.f12243(var4), (SubLObject)module0197.$ic43$, module0196.f12243(constants_high_oc.f10757(var4))));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12258(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic4$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic4$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic46$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12259(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic4$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic4$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic43$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12260(final SubLObject var7) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic8$)) {
            return f12250((SubLObject)module0197.$ic8$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic49$, module0196.f12243(var7)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12261(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic8$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic8$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic49$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12262(final SubLObject var8) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic10$)) {
            return f12250((SubLObject)module0197.$ic10$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic49$, module0196.f12243(module0172.f10915(var8))));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12263(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic10$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic10$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic49$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12264(final SubLObject var9, final SubLObject var10) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic12$) && module0197.NIL == f12265(var9)) {
            return f12250((SubLObject)module0197.$ic12$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic50$, module0196.f12243(var9), (SubLObject)module0197.$ic51$, module0196.f12243(var10)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12265(final SubLObject var9) {
        return f12266(var9);
    }
    
    public static SubLObject f12266(final SubLObject var9) {
        if (module0197.NIL != module0204.f13044(var9)) {
            final SubLObject var10 = module0232.f15308(var9).first();
            final SubLObject var11 = module0205.f13132(var10);
            return Equality.eql(var11, module0197.$ic52$);
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12267(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic12$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic12$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic51$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12268(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic12$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic12$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic50$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12269(final SubLObject var13, SubLObject var14) {
        if (var14 == module0197.UNPROVIDED) {
            var14 = (SubLObject)module0197.$ic53$;
        }
        if (module0197.NIL != f12249((SubLObject)module0197.$ic14$)) {
            return f12250((SubLObject)module0197.$ic14$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic54$, module0571.f34986(module0205.f13339(module0289.f19396(var13), var14)), (SubLObject)module0197.$ic51$, module0196.f12243(module0178.f11287(var13)), (SubLObject)module0197.$ic55$, module0196.f12243(module0178.f11284(var13))));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12270(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic14$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic14$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic55$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12271(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic14$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic14$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic51$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12272(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic14$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic14$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic54$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12273(final SubLObject var13, final SubLObject var15, final SubLObject var16) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic16$)) {
            return f12250((SubLObject)module0197.$ic16$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic57$, module0196.f12243(var15), (SubLObject)module0197.$ic58$, module0196.f12243(var16)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12274(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic16$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic16$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic58$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12275(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic16$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic16$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic57$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12276(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic16$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic16$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12277(final SubLObject var13, final SubLObject var17, final SubLObject var18) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic19$)) {
            return f12250((SubLObject)module0197.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic59$, module0196.f12243(var17), (SubLObject)module0197.$ic60$, module0196.f12243(var18)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12278(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic19$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic19$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic60$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12279(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic19$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic19$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic59$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12280(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic19$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic19$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12281(final SubLObject var13, final SubLObject var19, final SubLObject var20) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic18$)) {
            return f12250((SubLObject)module0197.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic61$, module0196.f12243(var19), (SubLObject)module0197.$ic62$, module0196.f12243(var20)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12282(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic18$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic18$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic62$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12283(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic18$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic18$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic61$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12284(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic18$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic18$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12285(final SubLObject var13, final SubLObject var21, final SubLObject var22) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic20$)) {
            return f12250((SubLObject)module0197.$ic20$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic63$, module0196.f12243(var21), (SubLObject)module0197.$ic64$, module0196.f12243(var22)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12286(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic20$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic20$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic64$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12287(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic20$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic20$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic63$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12288(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic20$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic20$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12289(final SubLObject var13, final SubLObject var23, final SubLObject var24) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic22$)) {
            return f12250((SubLObject)module0197.$ic22$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic65$, module0196.f12243(var23), (SubLObject)module0197.$ic66$, module0196.f12243(var24)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12290(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic22$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic22$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic66$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12291(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic22$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic22$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic65$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12292(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic22$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic22$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12293(final SubLObject var13, final SubLObject var25, final SubLObject var26) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic24$)) {
            return f12250((SubLObject)module0197.$ic24$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic67$, module0196.f12243(var25), (SubLObject)module0197.$ic68$, module0196.f12243(var26)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12294(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic24$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic24$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic68$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12295(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic24$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic24$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic67$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12296(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic24$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic24$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12297(final SubLObject var13, final SubLObject var27, final SubLObject var28) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic23$)) {
            return f12250((SubLObject)module0197.$ic23$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic69$, module0196.f12243(var27), (SubLObject)module0197.$ic70$, module0196.f12243(var28)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12298(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic23$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic23$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic70$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12299(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic23$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic23$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic69$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12300(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic23$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic23$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12301(final SubLObject var13, final SubLObject var29, final SubLObject var30) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic25$)) {
            return f12250((SubLObject)module0197.$ic25$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic71$, module0196.f12243(var29), (SubLObject)module0197.$ic72$, module0196.f12243(var30)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12302(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic25$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic25$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic72$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12303(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic25$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic25$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic71$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12304(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic25$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic25$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12305(final SubLObject var13, final SubLObject var31, final SubLObject var32) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic26$)) {
            return f12250((SubLObject)module0197.$ic26$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic73$, module0196.f12243(var31), (SubLObject)module0197.$ic74$, module0196.f12243(var32)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12306(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic26$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic26$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic74$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12307(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic26$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic26$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic73$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12308(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic26$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic26$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12309(final SubLObject var13, final SubLObject var33) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic28$)) {
            return f12250((SubLObject)module0197.$ic28$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic75$, module0196.f12243(var33)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12310(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic28$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic28$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic75$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12311(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic28$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic28$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12312(final SubLObject var13, final SubLObject var34, final SubLObject var31, final SubLObject var32) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic30$)) {
            return f12250((SubLObject)module0197.$ic30$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic56$, module0196.f12243(var13), (SubLObject)module0197.$ic76$, module0196.f12243(var34), (SubLObject)module0197.$ic73$, module0196.f12243(var31), (SubLObject)module0197.$ic74$, module0196.f12243(var32)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12313(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic30$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic30$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic73$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12314(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic30$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic30$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic76$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12315(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic30$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic30$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12316(final SubLObject var35) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic32$)) {
            return f12250((SubLObject)module0197.$ic32$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic77$, var35));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12317(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic32$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic32$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic77$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12318(final SubLObject var35, final SubLObject var19, final SubLObject var20) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic34$)) {
            return f12250((SubLObject)module0197.$ic34$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic77$, var35, (SubLObject)module0197.$ic61$, var19, (SubLObject)module0197.$ic62$, var20));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12319(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic34$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic34$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic62$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12320(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic34$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic34$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic61$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12321(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic34$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic34$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic77$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12322(final SubLObject var36, final SubLObject var37) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic36$)) {
            return f12250((SubLObject)module0197.$ic36$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic78$, module0196.f12243(var36), (SubLObject)module0197.$ic79$, module0196.f12243(var37)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12323(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic36$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic36$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic79$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12324(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic36$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic36$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic78$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12325(final SubLObject var38) {
        if (module0197.NIL != f12249((SubLObject)module0197.$ic38$)) {
            return f12250((SubLObject)module0197.$ic38$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic80$, module0196.f12243(var38)));
        }
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12326(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic38$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic38$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic80$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12327(final SubLObject var39, final SubLObject var13) {
        return f12250((SubLObject)module0197.$ic40$, (SubLObject)ConsesLow.list((SubLObject)module0197.$ic81$, module0196.f12243(var39), (SubLObject)module0197.$ic56$, module0196.f12243(var13)));
    }
    
    public static SubLObject f12328(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic40$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic40$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic56$, (SubLObject)module0197.UNPROVIDED);
    }
    
    public static SubLObject f12329(final SubLObject var3) {
        assert module0197.NIL != module0116.f8052(var3) : var3;
        if (module0116.f8053(var3) != module0197.$ic40$ && module0197.NIL == module0118.f8204(var3)) {
            Errors.error((SubLObject)module0197.$ic45$, var3, module0116.f8053(var3), (SubLObject)module0197.$ic40$);
        }
        return conses_high.getf(module0116.f8056(var3), (SubLObject)module0197.$ic81$, (SubLObject)module0197.UNPROVIDED);
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
        return module0118.f8175((SubLObject)module0197.$ic83$);
    }
    
    public static SubLObject f12334() {
        if (module0197.NIL == f12333()) {
            f12335();
        }
        return module0118.f8177();
    }
    
    public static SubLObject f12336(final SubLObject var43) {
        final SubLObject var44 = module0197.$g2283$.getGlobalValue();
        SubLObject var45 = (SubLObject)module0197.NIL;
        try {
            var45 = Locks.seize_lock(var44);
            if (module0197.NIL == Sequences.find(var43, module0197.$g2284$.getGlobalValue(), (SubLObject)module0197.EQUALP, (SubLObject)module0197.UNPROVIDED, (SubLObject)module0197.UNPROVIDED, (SubLObject)module0197.UNPROVIDED)) {
                module0197.$g2284$.setGlobalValue((SubLObject)ConsesLow.cons(var43, module0197.$g2284$.getGlobalValue()));
                if (module0197.NIL != f12333()) {
                    module0117.f8156(var43, (SubLObject)module0197.NIL);
                }
            }
        }
        finally {
            if (module0197.NIL != var45) {
                Locks.release_lock(var44);
            }
        }
        return var43;
    }
    
    public static SubLObject f12337(final SubLObject var46) {
        final SubLObject var47 = module0197.$g2283$.getGlobalValue();
        SubLObject var48 = (SubLObject)module0197.NIL;
        try {
            var48 = Locks.seize_lock(var47);
            module0197.$g2284$.setGlobalValue(Sequences.remove(var46, module0197.$g2284$.getGlobalValue(), (SubLObject)module0197.EQUALP, (SubLObject)module0197.UNPROVIDED, (SubLObject)module0197.UNPROVIDED, (SubLObject)module0197.UNPROVIDED, (SubLObject)module0197.UNPROVIDED));
            if (module0197.NIL != f12333()) {
                module0117.f8158(var46, (SubLObject)module0197.NIL);
            }
        }
        finally {
            if (module0197.NIL != var48) {
                Locks.release_lock(var47);
            }
        }
        return var46;
    }
    
    public static SubLObject f12338() {
        return module0118.f8181((SubLObject)module0197.$ic83$);
    }
    
    public static SubLObject f12335() {
        return module0118.f8178((SubLObject)module0197.$ic83$);
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
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12340() {
        module0197.$g2283$ = SubLFiles.deflexical("S#15141", Locks.make_lock((SubLObject)module0197.$ic82$));
        module0197.$g2284$ = SubLFiles.deflexical("S#15142", (SubLObject)((module0197.NIL != Symbols.boundp((SubLObject)module0197.$ic83$)) ? module0197.$g2284$.getGlobalValue() : module0197.NIL));
        return (SubLObject)module0197.NIL;
    }
    
    public static SubLObject f12341() {
        module0116.f8043((SubLObject)module0197.$ic0$, (SubLObject)module0197.$ic1$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0116.f8043((SubLObject)module0197.$ic2$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic2$, (SubLObject)module0197.$ic3$);
        module0116.f8043((SubLObject)module0197.$ic4$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic4$, (SubLObject)module0197.$ic5$);
        module0116.f8043((SubLObject)module0197.$ic6$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic6$, (SubLObject)module0197.$ic7$);
        module0116.f8043((SubLObject)module0197.$ic8$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic8$, (SubLObject)module0197.$ic9$);
        module0116.f8043((SubLObject)module0197.$ic10$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic10$, (SubLObject)module0197.$ic11$);
        module0116.f8043((SubLObject)module0197.$ic12$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic12$, (SubLObject)module0197.$ic13$);
        module0116.f8043((SubLObject)module0197.$ic14$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic14$, (SubLObject)module0197.$ic15$);
        module0116.f8043((SubLObject)module0197.$ic16$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic16$, (SubLObject)module0197.$ic17$);
        module0116.f8043((SubLObject)module0197.$ic18$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic18$, (SubLObject)module0197.$ic17$);
        module0116.f8043((SubLObject)module0197.$ic19$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic19$, (SubLObject)module0197.$ic17$);
        module0116.f8043((SubLObject)module0197.$ic20$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic20$, (SubLObject)module0197.$ic21$);
        module0116.f8043((SubLObject)module0197.$ic22$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic22$, (SubLObject)module0197.$ic21$);
        module0116.f8043((SubLObject)module0197.$ic23$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic23$, (SubLObject)module0197.$ic21$);
        module0116.f8043((SubLObject)module0197.$ic24$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic24$, (SubLObject)module0197.$ic21$);
        module0116.f8043((SubLObject)module0197.$ic25$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic25$, (SubLObject)module0197.$ic21$);
        module0116.f8043((SubLObject)module0197.$ic26$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic26$, (SubLObject)module0197.$ic27$);
        module0116.f8043((SubLObject)module0197.$ic28$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic28$, (SubLObject)module0197.$ic29$);
        module0116.f8043((SubLObject)module0197.$ic30$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic30$, (SubLObject)module0197.$ic31$);
        module0116.f8043((SubLObject)module0197.$ic32$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic32$, (SubLObject)module0197.$ic33$);
        module0116.f8043((SubLObject)module0197.$ic34$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic34$, (SubLObject)module0197.$ic35$);
        module0116.f8043((SubLObject)module0197.$ic36$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic36$, (SubLObject)module0197.$ic37$);
        module0116.f8043((SubLObject)module0197.$ic38$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic38$, (SubLObject)module0197.$ic39$);
        module0116.f8043((SubLObject)module0197.$ic40$, (SubLObject)module0197.$ic0$, (SubLObject)module0197.NIL);
        module0196.f12234((SubLObject)module0197.$ic40$, (SubLObject)module0197.$ic41$);
        module0003.f57((SubLObject)module0197.$ic83$);
        return (SubLObject)module0197.NIL;
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
        module0197.$g2283$ = null;
        module0197.$g2284$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("KB-MODIFICATION-EVENT");
        $ic1$ = SubLObjectFactory.makeKeyword("KB-STORE-EVENT");
        $ic2$ = SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-CONSTANT");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("CREATION"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"));
        $ic4$ = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-CONSTANT");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"));
        $ic6$ = SubLObjectFactory.makeKeyword("KB-MODIFY-RENAME-CONSTANT");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROPERTY-CHANGE"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"));
        $ic8$ = SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-NART");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("CREATION"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NART"));
        $ic10$ = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-NART");
        $ic11$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NART"));
        $ic12$ = SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-ASSERTION");
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("CREATION"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $ic14$ = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-ASSERTION");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $ic16$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-ASSERTION-DIRECTION");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("PROPERTY-CHANGE"));
        $ic18$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-ASSERTION-STRENGTH");
        $ic19$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-ASSERTION-TRUTH");
        $ic20$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-ASSERTION-VARIABLE-NAMES");
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeKeyword("META-PROPERTY-CHANGE"));
        $ic22$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-BY");
        $ic23$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-WHY");
        $ic24$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN");
        $ic25$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND");
        $ic26$ = SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-ASSERTED-ARGUMENT");
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("CREATION"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"));
        $ic28$ = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-ASSERTED-ARGUMENT");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"));
        $ic30$ = SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-NEW-DEDUCTION");
        $ic31$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"), (SubLObject)SubLObjectFactory.makeKeyword("CREATION"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"));
        $ic32$ = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-DEDUCTION");
        $ic33$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"));
        $ic34$ = SubLObjectFactory.makeKeyword("KB-MODIFY-SET-DEDUCTION-STRENGTH");
        $ic35$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"), (SubLObject)SubLObjectFactory.makeKeyword("PROPERTY-CHANGE"));
        $ic36$ = SubLObjectFactory.makeKeyword("KB-MODIFY-CREATE-NEW-KB-HL-SUPPORT");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeKeyword("CREATION"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"));
        $ic38$ = SubLObjectFactory.makeKeyword("KB-MODIFY-REMOVE-KB-HL-SUPPORT");
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL"), (SubLObject)SubLObjectFactory.makeKeyword("EXISTENCE"));
        $ic40$ = SubLObjectFactory.makeKeyword("KB-MODIFY-IRRELEVANCE");
        $ic41$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $ic42$ = SubLObjectFactory.makeKeyword("NAME");
        $ic43$ = SubLObjectFactory.makeKeyword("EXTERNAL-ID");
        $ic44$ = SubLObjectFactory.makeSymbol("S#10059", "CYC");
        $ic45$ = SubLObjectFactory.makeString("Event ~S is of type ~S, not ~S.");
        $ic46$ = SubLObjectFactory.makeKeyword("CONSTANT");
        $ic47$ = SubLObjectFactory.makeKeyword("OLD-CONSTANT-NAME");
        $ic48$ = SubLObjectFactory.makeKeyword("NEW-CONSTANT-NAME");
        $ic49$ = SubLObjectFactory.makeKeyword("NART-HL-FORMULA");
        $ic50$ = SubLObjectFactory.makeKeyword("CNF");
        $ic51$ = SubLObjectFactory.makeKeyword("MT");
        $ic52$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic53$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic54$ = SubLObjectFactory.makeKeyword("SENTENCE");
        $ic55$ = SubLObjectFactory.makeKeyword("GAF");
        $ic56$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic57$ = SubLObjectFactory.makeKeyword("OLD-DIRECTION");
        $ic58$ = SubLObjectFactory.makeKeyword("NEW-DIRECTION");
        $ic59$ = SubLObjectFactory.makeKeyword("OLD-TRUTH");
        $ic60$ = SubLObjectFactory.makeKeyword("NEW-TRUTH");
        $ic61$ = SubLObjectFactory.makeKeyword("OLD-STRENGTH");
        $ic62$ = SubLObjectFactory.makeKeyword("NEW-STRENGTH");
        $ic63$ = SubLObjectFactory.makeKeyword("OLD-VAR-NAMES");
        $ic64$ = SubLObjectFactory.makeKeyword("NEW-VAR-NAMES");
        $ic65$ = SubLObjectFactory.makeKeyword("OLD-ASSERTED-BY");
        $ic66$ = SubLObjectFactory.makeKeyword("NEW-ASSERTED-BY");
        $ic67$ = SubLObjectFactory.makeKeyword("OLD-ASSERTED-WHEN");
        $ic68$ = SubLObjectFactory.makeKeyword("NEW-ASSERTED-WHEN");
        $ic69$ = SubLObjectFactory.makeKeyword("OLD-ASSERTED-WHY");
        $ic70$ = SubLObjectFactory.makeKeyword("NEW-ASSERTED-WHY");
        $ic71$ = SubLObjectFactory.makeKeyword("OLD-ASSERTED-SECOND");
        $ic72$ = SubLObjectFactory.makeKeyword("NEW-ASSERTED-SECOND");
        $ic73$ = SubLObjectFactory.makeKeyword("TRUTH");
        $ic74$ = SubLObjectFactory.makeKeyword("STRENGTH");
        $ic75$ = SubLObjectFactory.makeKeyword("ASSERTED-ARGUMENT");
        $ic76$ = SubLObjectFactory.makeKeyword("SUPPORTS");
        $ic77$ = SubLObjectFactory.makeKeyword("DEDUCTION");
        $ic78$ = SubLObjectFactory.makeKeyword("HL-SUPPORT");
        $ic79$ = SubLObjectFactory.makeKeyword("JUSTIFICATION");
        $ic80$ = SubLObjectFactory.makeKeyword("KB-HL-SUPPORT");
        $ic81$ = SubLObjectFactory.makeKeyword("TERM");
        $ic82$ = SubLObjectFactory.makeString("KB-MODIFICATIONS-EVENT-DISPATCHER Lock");
        $ic83$ = SubLObjectFactory.makeSymbol("S#15142", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0197.class
	Total time: 256 ms
	
	Decompiled with Procyon 0.5.32.
*/