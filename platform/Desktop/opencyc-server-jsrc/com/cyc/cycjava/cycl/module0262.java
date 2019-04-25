package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0262 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0262";
    public static final String myFingerPrint = "7024b0d35aa68c327c3cd0e8fa78e05c69f835213f6fcb9bb8988694925ef408";
    private static SubLSymbol $g2509$;
    public static SubLSymbol $g2510$;
    private static SubLSymbol $g2511$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLString $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLInteger $ic15$;
    private static final SubLInteger $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLInteger $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    
    public static SubLObject f17300(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0248.f15931(module0137.f8955(module0262.$ic0$), var1, var2, var3, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17301(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16303(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17302(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0248.f15932(module0137.f8955(module0262.$ic0$), var1, var2, var3, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17303(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16306(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17304(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0248.f15933(module0137.f8955(module0262.$ic0$), var1, var2, var3, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17305(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0262.NIL == module0248.f15934(module0137.f8955(module0262.$ic0$), var1, var2, var3));
    }
    
    public static SubLObject f17306(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16308(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17307(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0248.f15935(module0137.f8955(module0262.$ic0$), var1, var2, var3, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17308(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16309(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17309(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0248.f15937(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17310(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0248.f15938(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17311(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16245(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17312(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16248(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17313(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return Sequences.remove(var1, f17311(var1, var2, var3), (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17314(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return Sequences.remove(var1, f17312(var1, var2, var3), (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17315(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0035.f2099(f17311(var1, var2, var3));
    }
    
    public static SubLObject f17316(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        if (module0262.NIL != module0132.f8596(var1)) {
            return module0259.f16927(module0262.$ic1$, (SubLObject)module0262.UNPROVIDED);
        }
        return module0035.f2099(f17312(var1, var2, var3));
    }
    
    public static SubLObject f17317(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0035.f2099(f17313(var1, var2, var3));
    }
    
    public static SubLObject f17318(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0035.f2099(f17314(var1, var2, var3));
    }
    
    public static SubLObject f17319(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0254.f16477(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17320(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0254.f16478(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17321(final SubLObject var4, final SubLObject var5, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16330(module0137.f8955(module0262.$ic0$), var4, var5, var2, var3);
    }
    
    public static SubLObject f17322(final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16252(module0137.f8955(module0262.$ic0$), var6, var2, var3);
    }
    
    public static SubLObject f17323(final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16254(module0137.f8955(module0262.$ic0$), var6, var2, var3);
    }
    
    public static SubLObject f17324(final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16340(module0137.f8955(module0262.$ic0$), var1, var2, var3);
    }
    
    public static SubLObject f17325(final SubLObject var1, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16332(module0137.f8955(module0262.$ic0$), var1, var6, var2, var3);
    }
    
    public static SubLObject f17326(final SubLObject var1, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16334(module0137.f8955(module0262.$ic0$), var1, var6, var2, var3);
    }
    
    public static SubLObject f17327(final SubLObject var1, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return f17325(var1, var6, var2, var3);
    }
    
    public static SubLObject f17328(final SubLObject var1, final SubLObject var7, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16291(module0137.f8955(module0262.$ic0$), var1, var7, var2, var3);
    }
    
    public static SubLObject f17329(final SubLObject var1, final SubLObject var7, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16293(module0137.f8955(module0262.$ic0$), var1, var7, var2, var3);
    }
    
    public static SubLObject f17330(final SubLObject var8, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        module0252.f16269(module0137.f8955(module0262.$ic0$), var1, var8, var2, var3);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17331(final SubLObject var8, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        module0252.f16272(module0137.f8955(module0262.$ic0$), var1, var8, var2, var3);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17332(final SubLObject var8, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        module0252.f16274(var6, var8, var2, var3, (SubLObject)module0262.UNPROVIDED);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17333(final SubLObject var8, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        f17332(var8, var6, var2, var3);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17334(final SubLObject var8, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        module0252.f16275(var6, var8, var2, var3, (SubLObject)module0262.UNPROVIDED);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17335(final SubLObject var8, final SubLObject var6, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        f17334(var8, var6, var2, var3);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17336(final SubLObject var9, final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        if (module0262.NIL != module0161.f10471()) {
            return module0267.f17553(var9, var10);
        }
        return f17337(var9, var10, var2, var3);
    }
    
    public static SubLObject f17338(final SubLObject var9, final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0262.NIL != f17336(var9, var10, var2, var3) && module0262.NIL == f17336(var10, var9, var2, var3));
    }
    
    public static SubLObject f17337(final SubLObject var9, final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0262.NIL;
        final SubLObject var13 = module0147.$g2094$.currentBinding(var11);
        final SubLObject var14 = module0147.$g2095$.currentBinding(var11);
        try {
            module0147.$g2094$.bind((SubLObject)module0262.$ic2$, var11);
            module0147.$g2095$.bind(module0262.$ic3$, var11);
            var12 = module0252.f16343(module0137.f8955(module0262.$ic0$), var9, var10, var2, var3);
        }
        finally {
            module0147.$g2095$.rebind(var14, var11);
            module0147.$g2094$.rebind(var13, var11);
        }
        return var12;
    }
    
    public static SubLObject f17339(final SubLObject var10, final SubLObject var9, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return f17336(var9, var10, var2, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17340(final SubLObject var10, final SubLObject var9, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16345(module0137.f8955(module0262.$ic0$), var10, var9, var2, var3);
    }
    
    public static SubLObject f17341(final SubLObject var9, final SubLObject var15, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return f17342(var9, var15, var2, var3);
    }
    
    public static SubLObject f17343(final SubLObject var9, final SubLObject var15, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        final SubLThread var16 = SubLProcess.currentSubLThread();
        final SubLObject var17 = module0034.$g879$.getDynamicValue(var16);
        SubLObject var18 = (SubLObject)module0262.NIL;
        if (module0262.NIL == var17) {
            return f17341(var9, var15, var2, var3);
        }
        var18 = module0034.f1857(var17, (SubLObject)module0262.$ic4$, (SubLObject)module0262.UNPROVIDED);
        if (module0262.NIL == var18) {
            var18 = module0034.f1807(module0034.f1842(var17), (SubLObject)module0262.$ic4$, (SubLObject)module0262.FOUR_INTEGER, (SubLObject)module0262.NIL, (SubLObject)module0262.EQUAL, (SubLObject)module0262.UNPROVIDED);
            module0034.f1860(var17, (SubLObject)module0262.$ic4$, var18);
        }
        final SubLObject var19 = module0034.f1780(var9, var15, var2, var3);
        final SubLObject var20 = module0034.f1814(var18, var19, (SubLObject)module0262.UNPROVIDED);
        if (var20 != module0262.$ic5$) {
            SubLObject var21 = var20;
            SubLObject var22 = (SubLObject)module0262.NIL;
            var22 = var21.first();
            while (module0262.NIL != var21) {
                SubLObject var23 = var22.first();
                final SubLObject var24 = conses_high.second(var22);
                if (var9.equal(var23.first())) {
                    var23 = var23.rest();
                    if (var15.equal(var23.first())) {
                        var23 = var23.rest();
                        if (var2.equal(var23.first())) {
                            var23 = var23.rest();
                            if (module0262.NIL != var23 && module0262.NIL == var23.rest() && var3.equal(var23.first())) {
                                return module0034.f1959(var24);
                            }
                        }
                    }
                }
                var21 = var21.rest();
                var22 = var21.first();
            }
        }
        final SubLObject var25 = Values.arg2(var16.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17341(var9, var15, var2, var3)));
        module0034.f1836(var18, var19, var20, var25, (SubLObject)ConsesLow.list(var9, var15, var2, var3));
        return module0034.f1959(var25);
    }
    
    public static SubLObject f17342(final SubLObject var9, final SubLObject var15, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        assert module0262.NIL != module0210.f13565(var9) : var9;
        assert module0262.NIL != module0210.f13565(var15) : var15;
        if (module0262.NIL == module0035.f2369((SubLObject)module0262.$ic7$, var15, (SubLObject)module0262.UNPROVIDED)) {
            return module0252.f16352(module0137.f8955(module0262.$ic0$), var9, var15, var2, var3);
        }
        if (module0262.NIL != module0132.f8596(var9)) {
            return module0132.f8601(var9, var15);
        }
        return (SubLObject)module0262.T;
    }
    
    public static SubLObject f17344(final SubLObject var25, final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16360(module0137.f8955(module0262.$ic0$), var25, var10, var2, var3);
    }
    
    public static SubLObject f17345(final SubLObject var9, final SubLObject var15, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16358(module0137.f8955(module0262.$ic0$), var9, var15, var2, var3);
    }
    
    public static SubLObject f17346(final SubLObject var25, final SubLObject var10, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16365(module0137.f8955(module0262.$ic0$), var25, var10, var2, var3);
    }
    
    public static SubLObject f17347(final SubLObject var25, final SubLObject var15, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0252.f16370(module0137.f8955(module0262.$ic0$), var25, var15, var2, var3);
    }
    
    public static SubLObject f17348(final SubLObject var1, final SubLObject var26, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0254.f16488(module0137.f8955(module0262.$ic0$), var1, var26, var2, var3);
    }
    
    public static SubLObject f17349(final SubLObject var1, final SubLObject var26, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0254.f16487(module0137.f8955(module0262.$ic0$), var1, var26, var2, var3);
    }
    
    public static SubLObject f17350(final SubLObject var26, final SubLObject var1, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return f17348(var1, var26, var2, var3);
    }
    
    public static SubLObject f17351(final SubLObject var1, final SubLObject var27, SubLObject var2, SubLObject var3) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        return module0254.f16492(module0137.f8955(module0262.$ic0$), var1, var27, var2, var3);
    }
    
    public static SubLObject f17352(final SubLObject var28, final SubLObject var29, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0262.NIL != f17353(var28, var29, var2) || module0262.NIL != module0265.f17475(var28, var29, var2, (SubLObject)module0262.UNPROVIDED));
    }
    
    public static SubLObject f17353(final SubLObject var28, final SubLObject var29, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0262.NIL != f17336(var28, var29, var2, (SubLObject)module0262.UNPROVIDED) || module0262.NIL != f17336(var29, var28, var2, (SubLObject)module0262.UNPROVIDED));
    }
    
    public static SubLObject f17354(final SubLObject var9, final SubLObject var10, SubLObject var2, SubLObject var3, SubLObject var30) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        if (var30 == module0262.UNPROVIDED) {
            var30 = (SubLObject)module0262.NIL;
        }
        if (module0262.NIL != module0161.f10471()) {
            return module0267.f17557(var9, var10, var2, var3, var30);
        }
        return f17355(var9, var10, var2, var3, var30);
    }
    
    public static SubLObject f17355(final SubLObject var9, final SubLObject var10, SubLObject var2, SubLObject var3, SubLObject var30) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        if (var30 == module0262.UNPROVIDED) {
            var30 = (SubLObject)module0262.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0262.NIL;
        final SubLObject var33 = module0147.$g2094$.currentBinding(var31);
        final SubLObject var34 = module0147.$g2095$.currentBinding(var31);
        try {
            module0147.$g2094$.bind((SubLObject)module0262.$ic2$, var31);
            module0147.$g2095$.bind(module0262.$ic3$, var31);
            var32 = module0252.f16349(module0137.f8955(module0262.$ic0$), var9, var10, var2, var3, var30);
        }
        finally {
            module0147.$g2095$.rebind(var34, var31);
            module0147.$g2094$.rebind(var33, var31);
        }
        return var32;
    }
    
    public static SubLObject f17356(final SubLObject var9, final SubLObject var10, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return f17354(var9, var10, var2, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17357(final SubLObject var9, final SubLObject var10, SubLObject var2, SubLObject var3, SubLObject var30) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (var3 == module0262.UNPROVIDED) {
            var3 = (SubLObject)module0262.NIL;
        }
        if (var30 == module0262.UNPROVIDED) {
            var30 = (SubLObject)module0262.NIL;
        }
        return module0254.f16496(module0137.f8955(module0262.$ic0$), var9, var10, var2, var3, var30);
    }
    
    public static SubLObject f17358(final SubLObject var9, final SubLObject var10, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return f17357(var9, var10, var2, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17359() {
        final SubLObject var31 = module0262.$g2509$.getGlobalValue();
        if (module0262.NIL != var31) {
            module0034.f1818(var31);
        }
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17360(final SubLObject var1) {
        return module0034.f1829(module0262.$g2509$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17361(final SubLObject var1) {
        return f17311(var1, module0132.$g1548$.getGlobalValue(), (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17362(final SubLObject var1) {
        SubLObject var2 = module0262.$g2509$.getGlobalValue();
        if (module0262.NIL == var2) {
            var2 = module0034.f1934((SubLObject)module0262.$ic13$, (SubLObject)module0262.$ic14$, (SubLObject)module0262.$ic15$, (SubLObject)module0262.EQL, (SubLObject)module0262.ONE_INTEGER, (SubLObject)module0262.$ic16$);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)module0262.$ic5$);
        if (var3 == module0262.$ic5$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17361(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)module0262.UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f17363(final SubLObject var34, final SubLObject var35) {
        SubLObject var37;
        final SubLObject var36 = var37 = var34.rest();
        SubLObject var38 = (SubLObject)module0262.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var37, var36, (SubLObject)module0262.$ic17$);
        var38 = var37.first();
        final SubLObject var39;
        var37 = (var39 = var37.rest());
        final SubLObject var40 = (SubLObject)module0262.$ic18$;
        return (SubLObject)ConsesLow.list((SubLObject)module0262.$ic19$, (SubLObject)ConsesLow.list(var40, (SubLObject)ConsesLow.list((SubLObject)module0262.$ic13$, var38)), (SubLObject)ConsesLow.listS((SubLObject)module0262.$ic20$, var40, ConsesLow.append(var39, (SubLObject)module0262.NIL)));
    }
    
    public static SubLObject f17364(SubLObject var6, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0262.NIL != module0132.$g1574$.getDynamicValue(var7)) {
            var6 = module0132.f8602(var6);
        }
        if (module0262.NIL != module0262.$g2510$.getDynamicValue(var7) && module0262.NIL != module0035.f1998(var6)) {
            return f17365(var6.first(), conses_high.second(var6), var2);
        }
        return module0252.f16262(module0137.f8955(module0262.$ic0$), var6, var2, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17366(final SubLObject var6, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return f17364(var6, var2);
    }
    
    public static SubLObject f17365(final SubLObject var40, final SubLObject var41, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        if (module0262.NIL != f17336(var40, var41, var2, (SubLObject)module0262.UNPROVIDED)) {
            if (module0262.NIL != f17336(var41, var40, var2, (SubLObject)module0262.UNPROVIDED)) {
                return (SubLObject)ConsesLow.list(var40, var41);
            }
            return (SubLObject)ConsesLow.list(var40);
        }
        else {
            if (module0262.NIL != f17336(var41, var40, var2, (SubLObject)module0262.UNPROVIDED)) {
                return (SubLObject)ConsesLow.list(var41);
            }
            return (SubLObject)ConsesLow.list(var40, var41);
        }
    }
    
    public static SubLObject f17367(SubLObject var6, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0262.NIL != module0132.$g1574$.getDynamicValue(var7)) {
            var6 = module0132.f8603(var6);
        }
        return module0252.f16260(module0137.f8955(module0262.$ic0$), var6, var2, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17368(SubLObject var6, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        final SubLThread var7 = SubLProcess.currentSubLThread();
        if (module0262.NIL != module0132.$g1574$.getDynamicValue(var7)) {
            var6 = module0132.f8603(var6);
        }
        return module0035.f2269(var6, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17369(SubLObject var6, SubLObject var42, SubLObject var2) {
        if (var42 == module0262.UNPROVIDED) {
            var42 = (SubLObject)module0262.NIL;
        }
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        var6 = f17368(var6, var2);
        return module0252.f16314(module0137.f8955(module0262.$ic0$), var6, var42, var2, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17370(final SubLObject var6, SubLObject var42, SubLObject var2) {
        if (var42 == module0262.UNPROVIDED) {
            var42 = (SubLObject)module0262.NIL;
        }
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        final SubLObject var43 = (module0262.NIL != module0161.f10471()) ? f17371(var6, var42, var2) : f17372(var6, var42, var2);
        if (Sequences.length(var43).numG(Sequences.length(var6))) {
            f17373(var6, var43);
        }
        return var43;
    }
    
    public static SubLObject f17374(final SubLObject var6, final SubLObject var43) {
        Errors.warn((SubLObject)module0262.$ic22$, Sequences.length(var6), Sequences.length(var43), module0035.f2241(var6));
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17373(final SubLObject var6, final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        final SubLObject var45 = module0034.$g879$.getDynamicValue(var44);
        SubLObject var46 = (SubLObject)module0262.NIL;
        if (module0262.NIL == var45) {
            return f17374(var6, var43);
        }
        var46 = module0034.f1857(var45, (SubLObject)module0262.$ic21$, (SubLObject)module0262.UNPROVIDED);
        if (module0262.NIL == var46) {
            var46 = module0034.f1807(module0034.f1842(var45), (SubLObject)module0262.$ic21$, (SubLObject)module0262.TWO_INTEGER, (SubLObject)module0262.NIL, (SubLObject)module0262.EQUAL, (SubLObject)module0262.UNPROVIDED);
            module0034.f1860(var45, (SubLObject)module0262.$ic21$, var46);
        }
        final SubLObject var47 = module0034.f1782(var6, var43);
        final SubLObject var48 = module0034.f1814(var46, var47, (SubLObject)module0262.UNPROVIDED);
        if (var48 != module0262.$ic5$) {
            SubLObject var49 = var48;
            SubLObject var50 = (SubLObject)module0262.NIL;
            var50 = var49.first();
            while (module0262.NIL != var49) {
                SubLObject var51 = var50.first();
                final SubLObject var52 = conses_high.second(var50);
                if (var6.equal(var51.first())) {
                    var51 = var51.rest();
                    if (module0262.NIL != var51 && module0262.NIL == var51.rest() && var43.equal(var51.first())) {
                        return module0034.f1959(var52);
                    }
                }
                var49 = var49.rest();
                var50 = var49.first();
            }
        }
        final SubLObject var53 = Values.arg2(var44.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17374(var6, var43)));
        module0034.f1836(var46, var47, var48, var53, (SubLObject)ConsesLow.list(var6, var43));
        return module0034.f1959(var53);
    }
    
    public static SubLObject f17371(final SubLObject var6, final SubLObject var42, final SubLObject var2) {
        return (module0262.NIL != module0035.f2370((SubLObject)module0262.$ic23$, var6, (SubLObject)module0262.UNPROVIDED)) ? f17372(Mapping.mapcar((SubLObject)module0262.$ic24$, var6), var42, var2) : module0267.f17579(var6, var42, var2, (SubLObject)module0262.NIL);
    }
    
    public static SubLObject f17375(final SubLObject var6, final SubLObject var42, final SubLObject var2) {
        return (SubLObject)((module0262.NIL != var6) ? module0252.f16316(module0137.f8955(module0262.$ic0$), f17366(var6, var2), var42, var2, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED) : module0262.NIL);
    }
    
    public static SubLObject f17372(final SubLObject var6, final SubLObject var42, final SubLObject var2) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        final SubLObject var44 = module0034.$g879$.getDynamicValue(var43);
        SubLObject var45 = (SubLObject)module0262.NIL;
        if (module0262.NIL == var44) {
            return f17375(var6, var42, var2);
        }
        var45 = module0034.f1857(var44, (SubLObject)module0262.$ic25$, (SubLObject)module0262.UNPROVIDED);
        if (module0262.NIL == var45) {
            var45 = module0034.f1807(module0034.f1842(var44), (SubLObject)module0262.$ic25$, (SubLObject)module0262.THREE_INTEGER, (SubLObject)module0262.NIL, (SubLObject)module0262.EQUAL, (SubLObject)module0262.UNPROVIDED);
            module0034.f1860(var44, (SubLObject)module0262.$ic25$, var45);
        }
        final SubLObject var46 = module0034.f1781(var6, var42, var2);
        final SubLObject var47 = module0034.f1814(var45, var46, (SubLObject)module0262.UNPROVIDED);
        if (var47 != module0262.$ic5$) {
            SubLObject var48 = var47;
            SubLObject var49 = (SubLObject)module0262.NIL;
            var49 = var48.first();
            while (module0262.NIL != var48) {
                SubLObject var50 = var49.first();
                final SubLObject var51 = conses_high.second(var49);
                if (var6.equal(var50.first())) {
                    var50 = var50.rest();
                    if (var42.equal(var50.first())) {
                        var50 = var50.rest();
                        if (module0262.NIL != var50 && module0262.NIL == var50.rest() && var2.equal(var50.first())) {
                            return module0034.f1959(var51);
                        }
                    }
                }
                var48 = var48.rest();
                var49 = var48.first();
            }
        }
        final SubLObject var52 = Values.arg2(var43.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17375(var6, var42, var2)));
        module0034.f1836(var45, var46, var47, var52, (SubLObject)ConsesLow.list(var6, var42, var2));
        return module0034.f1959(var52);
    }
    
    public static SubLObject f17376(final SubLObject var6, SubLObject var42, SubLObject var2) {
        if (var42 == module0262.UNPROVIDED) {
            var42 = (SubLObject)module0262.NIL;
        }
        if (var2 == module0262.UNPROVIDED) {
            var2 = module0132.$g1548$.getGlobalValue();
        }
        return (module0262.NIL != module0161.f10471()) ? f17377(var6, var42, var2) : f17378(var6, var42, var2);
    }
    
    public static SubLObject f17377(final SubLObject var6, final SubLObject var42, final SubLObject var2) {
        return (module0262.NIL != module0035.f2370((SubLObject)module0262.$ic23$, var6, (SubLObject)module0262.UNPROVIDED)) ? f17378(Mapping.mapcar((SubLObject)module0262.$ic24$, var6), var42, var2) : module0267.f17579(var6, var42, var2, (SubLObject)module0262.NIL);
    }
    
    public static SubLObject f17378(final SubLObject var6, final SubLObject var42, final SubLObject var2) {
        return (SubLObject)((module0262.NIL != var6) ? module0252.f16318(module0137.f8955(module0262.$ic0$), f17366(var6, var2), var42, var2, (SubLObject)module0262.UNPROVIDED) : module0262.NIL);
    }
    
    public static SubLObject f17379(final SubLObject var44) {
        return f17367(Sequences.creduce(Symbols.symbol_function((SubLObject)module0262.$ic26$), Sequences.delete((SubLObject)module0262.NIL, Mapping.mapcar(Symbols.symbol_function((SubLObject)module0262.$ic27$), var44), (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED), (SubLObject)module0262.ZERO_INTEGER, (SubLObject)module0262.NIL, (SubLObject)module0262.NIL), (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17380() {
        final SubLObject var31 = module0262.$g2511$.getGlobalValue();
        if (module0262.NIL != var31) {
            module0034.f1818(var31);
        }
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17381(final SubLObject var44) {
        return module0034.f1829(module0262.$g2511$.getGlobalValue(), (SubLObject)ConsesLow.list(var44), (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17382(final SubLObject var44) {
        return f17379(var44);
    }
    
    public static SubLObject f17383(final SubLObject var44) {
        SubLObject var45 = module0262.$g2511$.getGlobalValue();
        if (module0262.NIL == var45) {
            var45 = module0034.f1934((SubLObject)module0262.$ic28$, (SubLObject)module0262.$ic29$, (SubLObject)module0262.$ic30$, (SubLObject)module0262.EQUAL, (SubLObject)module0262.ONE_INTEGER, (SubLObject)module0262.$ic30$);
        }
        SubLObject var46 = module0034.f1814(var45, var44, (SubLObject)module0262.$ic5$);
        if (var46 == module0262.$ic5$) {
            var46 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17382(var44)));
            module0034.f1816(var45, var44, var46, (SubLObject)module0262.UNPROVIDED);
        }
        return module0034.f1959(var46);
    }
    
    public static SubLObject f17384(final SubLObject var4, final SubLObject var5) {
        if (module0262.NIL != f17336(var4, var5, (SubLObject)module0262.UNPROVIDED, (SubLObject)module0262.UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(module0132.$g1548$.getGlobalValue());
        }
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17385(final SubLObject var1) {
        return module0226.f15062(var1, module0262.$ic0$, (SubLObject)module0262.UNPROVIDED);
    }
    
    public static SubLObject f17386(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16006(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17387(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16007(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17388(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0262.NIL;
        final SubLObject var3 = module0262.$ic0$;
        if (module0262.NIL != module0158.f10010(var1, (SubLObject)module0262.ONE_INTEGER, var3)) {
            final SubLObject var4 = module0158.f10011(var1, (SubLObject)module0262.ONE_INTEGER, var3);
            SubLObject var5 = (SubLObject)module0262.NIL;
            final SubLObject var6 = (SubLObject)module0262.NIL;
            while (module0262.NIL == var5) {
                final SubLObject var7 = module0052.f3695(var4, var6);
                final SubLObject var8 = (SubLObject)SubLObjectFactory.makeBoolean(!var6.eql(var7));
                if (module0262.NIL != var8) {
                    SubLObject var9 = (SubLObject)module0262.NIL;
                    try {
                        var9 = module0158.f10316(var7, (SubLObject)module0262.$ic31$, (SubLObject)module0262.$ic32$, (SubLObject)module0262.NIL);
                        SubLObject var48_53 = (SubLObject)module0262.NIL;
                        final SubLObject var49_54 = (SubLObject)module0262.NIL;
                        while (module0262.NIL == var48_53) {
                            final SubLObject var10 = module0052.f3695(var9, var49_54);
                            final SubLObject var51_56 = (SubLObject)SubLObjectFactory.makeBoolean(!var49_54.eql(var10));
                            if (module0262.NIL != var51_56 && module0262.NIL != module0178.f11375(var10)) {
                                var2 = (SubLObject)ConsesLow.cons(module0178.f11335(var10), var2);
                            }
                            var48_53 = (SubLObject)SubLObjectFactory.makeBoolean(module0262.NIL == var51_56);
                        }
                    }
                    finally {
                        final SubLObject var11 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0262.T);
                            if (module0262.NIL != var9) {
                                module0158.f10319(var9);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var11);
                        }
                    }
                }
                var5 = (SubLObject)SubLObjectFactory.makeBoolean(module0262.NIL == var8);
            }
        }
        return Sequences.nreverse(var2);
    }
    
    public static SubLObject f17389(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16008(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17390(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16011(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17391(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16012(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17392(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16009(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17393(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16010(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17394(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16013(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17395(final SubLObject var1, SubLObject var2) {
        if (var2 == module0262.UNPROVIDED) {
            var2 = (SubLObject)module0262.NIL;
        }
        return module0248.f16014(module0137.f8955(module0262.$ic0$), var1, var2);
    }
    
    public static SubLObject f17396(final SubLObject var57, final SubLObject var58) {
        return f17397(var57, var58);
    }
    
    public static SubLObject f17397(final SubLObject var57, final SubLObject var58) {
        module0248.f15957(var57, var58, module0137.f8955(module0262.$ic0$));
        module0345.f23233(var57, var58);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17398(final SubLObject var57, final SubLObject var58) {
        return f17399(var57, var58);
    }
    
    public static SubLObject f17399(final SubLObject var57, final SubLObject var58) {
        module0248.f15962(var57, var58, module0137.f8955(module0262.$ic0$));
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17400() {
        module0248.f16004(module0137.f8955(module0262.$ic0$));
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17401(final SubLObject var1, final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0141.$g1670$.currentBinding(var3);
        final SubLObject var5 = module0141.$g1671$.currentBinding(var3);
        final SubLObject var6 = module0141.$g1672$.currentBinding(var3);
        final SubLObject var7 = module0141.$g1674$.currentBinding(var3);
        final SubLObject var8 = module0137.$g1605$.currentBinding(var3);
        try {
            module0141.$g1670$.bind(module0137.f8955(module0262.$ic0$), var3);
            module0141.$g1671$.bind(module0244.f15739(module0137.f8955(module0262.$ic0$)), var3);
            module0141.$g1672$.bind(module0244.f15746(module0137.f8955(module0262.$ic0$)), var3);
            module0141.$g1674$.bind((SubLObject)module0262.NIL, var3);
            module0137.$g1605$.bind(module0137.f8955(module0262.$ic0$), var3);
            module0248.f15999(var1, var2, (SubLObject)module0262.UNPROVIDED);
        }
        finally {
            module0137.$g1605$.rebind(var8, var3);
            module0141.$g1674$.rebind(var7, var3);
            module0141.$g1672$.rebind(var6, var3);
            module0141.$g1671$.rebind(var5, var3);
            module0141.$g1670$.rebind(var4, var3);
        }
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17402(final SubLObject var1, SubLObject var6) {
        if (var6 == module0262.UNPROVIDED) {
            var6 = (SubLObject)module0262.NIL;
        }
        return f17403(var1, var6);
    }
    
    public static SubLObject f17403(final SubLObject var1, SubLObject var6) {
        if (var6 == module0262.UNPROVIDED) {
            var6 = (SubLObject)module0262.NIL;
        }
        final SubLObject var7 = (module0262.NIL != var6) ? var6 : module0248.f15925(module0137.f8955(module0262.$ic0$), var1);
        final SubLObject var8 = (module0262.NIL != var6) ? var6 : f17385(var1);
        SubLObject var9 = var7;
        SubLObject var10 = (SubLObject)module0262.NIL;
        var10 = var9.first();
        while (module0262.NIL != var9) {
            f17401(var1, var10);
            var9 = var9.rest();
            var10 = var9.first();
        }
        var9 = var8;
        var10 = (SubLObject)module0262.NIL;
        var10 = var9.first();
        while (module0262.NIL != var9) {
            f17404(var1, var10);
            var9 = var9.rest();
            var10 = var9.first();
        }
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17404(final SubLObject var1, final SubLObject var2) {
        module0345.f23233((SubLObject)module0262.T, (SubLObject)module0262.T);
        module0248.f15951(var1, var2, module0137.f8955(module0262.$ic0$));
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17405(SubLObject var64) {
        if (var64 == module0262.UNPROVIDED) {
            var64 = (SubLObject)module0262.T;
        }
        module0345.f23233((SubLObject)module0262.T, (SubLObject)module0262.T);
        if (module0262.NIL != var64) {
            f17400();
        }
        module0248.f15952(module0137.f8955(module0262.$ic0$));
        module0345.f23233((SubLObject)module0262.T, (SubLObject)module0262.T);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17406() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17300", "S#19849", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17301", "MIN-GENL-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17302", "S#19850", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17303", "S#19851", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17304", "S#19852", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17305", "S#19853", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17306", "S#19854", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17307", "S#19855", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17308", "S#19856", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17309", "S#19857", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17310", "S#19858", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17311", "S#19859", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17312", "ALL-SPEC-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17313", "S#19860", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17314", "S#19861", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17315", "S#19862", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17316", "S#19863", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17317", "S#19864", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17318", "S#19865", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17319", "S#19866", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17320", "S#19867", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17321", "S#19868", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17322", "S#19869", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17323", "S#19870", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17324", "S#19871", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17325", "S#19872", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17326", "S#19873", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17327", "S#19270", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17328", "S#19874", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17329", "S#19875", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17330", "S#19876", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17331", "S#19877", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17332", "S#19878", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17333", "S#19879", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17334", "S#19880", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17335", "S#19881", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17336", "GENL-MT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17338", "S#17583", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17337", "S#18225", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17339", "S#19882", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17340", "S#19883", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17341", "S#19884", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17343", "S#19885", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17342", "ANY-GENL-MT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17344", "S#19886", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17345", "S#19887", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17346", "S#19888", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17347", "S#19889", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17348", "S#19890", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17349", "S#19891", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17350", "S#19892", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17351", "S#19893", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17352", "S#19894", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17353", "S#19895", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17354", "S#19896", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17355", "S#19897", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17356", "S#19898", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17357", "S#19899", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17358", "S#19900", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17359", "S#19901", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17360", "S#19902", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17361", "S#19903", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17362", "S#19263", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0262", "f17363", "S#19904");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17364", "S#13271", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17366", "S#19905", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17365", "S#19906", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17367", "S#19907", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17368", "S#19908", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17369", "S#19909", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17370", "S#18607", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17374", "S#19910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17373", "S#19911", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17371", "S#19912", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17375", "S#19913", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17372", "S#19914", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17376", "S#19915", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17377", "S#19916", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17378", "S#19917", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17379", "S#19516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17380", "S#19918", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17381", "S#19919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17382", "S#19920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17383", "S#19921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17384", "S#19922", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17385", "S#19923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17386", "S#19924", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17387", "S#19925", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17388", "S#19926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17389", "S#19927", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17390", "S#19928", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17391", "S#19929", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17392", "S#19930", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17393", "S#19931", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17394", "S#19932", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17395", "S#19933", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17396", "ADD-BASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17397", "ADD-GENL-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17398", "REMOVE-BASE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17399", "REMOVE-GENL-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17400", "S#19934", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17401", "S#19935", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17402", "S#19936", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17403", "S#19937", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17404", "S#19938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0262", "f17405", "S#19939", 0, 1, false);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17407() {
        module0262.$g2509$ = SubLFiles.deflexical("S#19940", (SubLObject)module0262.NIL);
        module0262.$g2510$ = SubLFiles.defvar("S#19941", (SubLObject)module0262.NIL);
        module0262.$g2511$ = SubLFiles.deflexical("S#19942", (SubLObject)module0262.NIL);
        return (SubLObject)module0262.NIL;
    }
    
    public static SubLObject f17408() {
        module0034.f1895((SubLObject)module0262.$ic4$);
        module0012.f368((SubLObject)module0262.$ic8$, (SubLObject)module0262.$ic9$, (SubLObject)module0262.$ic10$, (SubLObject)module0262.$ic11$, (SubLObject)module0262.$ic12$);
        module0034.f1909((SubLObject)module0262.$ic13$);
        module0034.f1895((SubLObject)module0262.$ic21$);
        module0034.f1895((SubLObject)module0262.$ic25$);
        module0034.f1909((SubLObject)module0262.$ic28$);
        module0012.f416((SubLObject)module0262.$ic33$);
        module0012.f416((SubLObject)module0262.$ic34$);
        module0012.f416((SubLObject)module0262.$ic35$);
        module0012.f416((SubLObject)module0262.$ic36$);
        return (SubLObject)module0262.NIL;
    }
    
    public void declareFunctions() {
        f17406();
    }
    
    public void initializeVariables() {
        f17407();
    }
    
    public void runTopLevelForms() {
        f17408();
    }
    
    static {
        me = (SubLFile)new module0262();
        module0262.$g2509$ = null;
        module0262.$g2510$ = null;
        module0262.$g2511$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic2$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic4$ = SubLObjectFactory.makeSymbol("S#19885", "CYC");
        $ic5$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic6$ = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $ic7$ = SubLObjectFactory.makeSymbol("S#10714", "CYC");
        $ic8$ = SubLObjectFactory.makeSymbol("ANY-GENL-MT?");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12109", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15426", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*MT-MT*")), (SubLObject)SubLObjectFactory.makeSymbol("S#10995", "CYC"));
        $ic10$ = SubLObjectFactory.makeString("(any-genl-mt? spec genls) is t iff (genl-mt? spec genl) for some genl in genls\n   (ascending transitive search; inexpensive)");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12109", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $ic12$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#19263", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#19940", "CYC");
        $ic15$ = SubLObjectFactory.makeInteger(2048);
        $ic16$ = SubLObjectFactory.makeInteger(1000);
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = SubLObjectFactory.makeUninternedSymbol("US#5955653");
        $ic19$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic20$ = SubLObjectFactory.makeSymbol("WITH-MT");
        $ic21$ = SubLObjectFactory.makeSymbol("S#19911", "CYC");
        $ic22$ = SubLObjectFactory.makeString("Forward inference mt placement explosion detected (~A -> ~A): (max-floor-mts ~S)");
        $ic23$ = SubLObjectFactory.makeSymbol("S#13367", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("HLMT-MONAD-MT");
        $ic25$ = SubLObjectFactory.makeSymbol("S#19914", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("UNION");
        $ic27$ = SubLObjectFactory.makeSymbol("S#18607", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#19921", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#19942", "CYC");
        $ic30$ = SubLObjectFactory.makeInteger(10000);
        $ic31$ = SubLObjectFactory.makeKeyword("GAF");
        $ic32$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic33$ = SubLObjectFactory.makeSymbol("ADD-BASE-MT");
        $ic34$ = SubLObjectFactory.makeSymbol("ADD-GENL-MT");
        $ic35$ = SubLObjectFactory.makeSymbol("REMOVE-BASE-MT");
        $ic36$ = SubLObjectFactory.makeSymbol("REMOVE-GENL-MT");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0262.class
	Total time: 336 ms
	
	Decompiled with Procyon 0.5.32.
*/