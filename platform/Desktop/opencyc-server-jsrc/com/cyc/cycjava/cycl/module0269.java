package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0269 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0269";
    public static final String myFingerPrint = "768eea7e1d0c9e989ceb85bd9f1e537553b690653e1d7bd157ef5de1a7a3f02d";
    private static SubLSymbol $g2557$;
    private static SubLSymbol $g2558$;
    private static final SubLObject $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLObject $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLObject $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLObject $ic11$;
    private static final SubLObject $ic12$;
    private static final SubLObject $ic13$;
    private static final SubLObject $ic14$;
    private static final SubLObject $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLObject $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLObject $ic22$;
    private static final SubLObject $ic23$;
    private static final SubLObject $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLObject $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLObject $ic54$;
    private static final SubLObject $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLObject $ic60$;
    private static final SubLObject $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLObject $ic64$;
    private static final SubLObject $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLObject $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLObject $ic83$;
    
    public static SubLObject f17697(final SubLObject var1, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        return module0268.f17620(module0269.$ic0$, var1, var2);
    }
    
    public static SubLObject f17698(final SubLObject var1, final SubLObject var3, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0269.NIL;
        if (module0269.NIL != module0173.f10955(var1)) {
            final SubLObject var6 = var2;
            final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
            final SubLObject var8 = module0147.$g2094$.currentBinding(var4);
            final SubLObject var9 = module0147.$g2096$.currentBinding(var4);
            final SubLObject var10 = module0141.$g1598$.currentBinding(var4);
            final SubLObject var11 = module0141.$g1682$.currentBinding(var4);
            try {
                module0147.$g2095$.bind(module0147.f9545(var6), var4);
                module0147.$g2094$.bind(module0147.f9546(var6), var4);
                module0147.$g2096$.bind(module0147.f9549(var6), var4);
                module0141.$g1598$.bind((SubLObject)module0269.NIL, var4);
                module0141.$g1682$.bind((SubLObject)module0269.NIL, var4);
                var5 = module0252.f16335(module0137.f8955(module0269.$ic0$), var1, var3, var2, (SubLObject)module0269.UNPROVIDED);
            }
            finally {
                module0141.$g1682$.rebind(var11, var4);
                module0141.$g1598$.rebind(var10, var4);
                module0147.$g2096$.rebind(var9, var4);
                module0147.$g2094$.rebind(var8, var4);
                module0147.$g2095$.rebind(var7, var4);
            }
        }
        return var5;
    }
    
    public static SubLObject f17699(final SubLObject var1, final SubLObject var3) {
        return (module0269.NIL != module0136.f8877()) ? module0268.f17617(module0269.$ic0$, var1, var3, (SubLObject)module0269.UNPROVIDED) : f17698(var1, var3, (SubLObject)module0269.UNPROVIDED);
    }
    
    public static SubLObject f17700(final SubLObject var1, final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)module0269.NIL;
        final SubLObject var6 = module0147.$g2094$.currentBinding(var4);
        final SubLObject var7 = module0147.$g2095$.currentBinding(var4);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var4);
            module0147.$g2095$.bind(module0269.$ic2$, var4);
            var5 = f17698(var1, var3, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var7, var4);
            module0147.$g2094$.rebind(var6, var4);
        }
        return var5;
    }
    
    public static SubLObject f17701(final SubLObject var1, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        assert module0269.NIL != module0173.f10955(var1) : var1;
        return f17702(f17697(var1, var2));
    }
    
    public static SubLObject f17702(final SubLObject var12) {
        if (module0269.NIL != module0004.f104(module0269.$ic4$, var12, (SubLObject)module0269.UNPROVIDED, (SubLObject)module0269.UNPROVIDED)) {
            return module0269.$ic4$;
        }
        if (module0269.NIL != module0004.f104(module0269.$ic5$, var12, (SubLObject)module0269.UNPROVIDED, (SubLObject)module0269.UNPROVIDED)) {
            return module0269.$ic5$;
        }
        if (module0269.NIL != module0004.f104(module0269.$ic6$, var12, (SubLObject)module0269.UNPROVIDED, (SubLObject)module0269.UNPROVIDED)) {
            return module0269.$ic6$;
        }
        if (module0269.NIL != module0004.f104(module0269.$ic7$, var12, (SubLObject)module0269.UNPROVIDED, (SubLObject)module0269.UNPROVIDED)) {
            return module0269.$ic7$;
        }
        if (module0269.NIL == var12) {
            return (SubLObject)module0269.NIL;
        }
        return (SubLObject)module0269.NIL;
    }
    
    public static SubLObject f17703(final SubLObject var3) {
        return module0268.f17622(module0269.$ic0$, var3);
    }
    
    public static SubLObject f17704(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL == f17705(var1) && module0269.NIL == f17706(var1) && module0269.NIL == f17707(var1) && module0269.NIL == f17708(var1));
    }
    
    public static SubLObject f17709(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic4$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17705(final SubLObject var1) {
        return f17709(var1);
    }
    
    public static SubLObject f17710(final SubLObject var1) {
        return f17709(var1);
    }
    
    public static SubLObject f17711() {
        SubLObject var14;
        for (var14 = (SubLObject)module0269.NIL; module0269.NIL == f17710(var14); var14 = module0173.f10963()) {}
        return var14;
    }
    
    public static SubLObject f17712(final SubLObject var15) {
        return module0035.f2192((SubLObject)module0269.$ic8$, var15);
    }
    
    public static SubLObject f17713(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17705(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic4$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic4$, var16, var2));
    }
    
    public static SubLObject f17714(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17705(var16);
        }
        SubLObject var18 = (SubLObject)module0269.NIL;
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic4$, (SubLObject)module0269.UNPROVIDED, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic4$, var16, (SubLObject)module0269.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17715(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic6$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17706(final SubLObject var1) {
        return f17715(var1);
    }
    
    public static SubLObject f17716(final SubLObject var1) {
        return f17715(var1);
    }
    
    public static SubLObject f17717(final SubLObject var15) {
        return module0035.f2192((SubLObject)module0269.$ic9$, var15);
    }
    
    public static SubLObject f17718(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17706(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic6$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic6$, var16, var2));
    }
    
    public static SubLObject f17719(final SubLObject var15) {
        return module0035.f2192((SubLObject)module0269.$ic10$, var15);
    }
    
    public static SubLObject f17720(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != f17716(var1) && module0269.NIL == f17721(var1));
    }
    
    public static SubLObject f17722(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != f17716(var1) && module0269.NIL != f17721(var1));
    }
    
    public static SubLObject f17723(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic5$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17724(final SubLObject var1) {
        return f17725(var1);
    }
    
    public static SubLObject f17726(final SubLObject var1) {
        return f17723(var1);
    }
    
    public static SubLObject f17725(final SubLObject var1) {
        return f17723(var1);
    }
    
    public static SubLObject f17708(final SubLObject var1) {
        return f17725(var1);
    }
    
    public static SubLObject f17727(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17708(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic5$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic5$, var16, var2));
    }
    
    public static SubLObject f17728(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != f17726(var1) && module0269.NIL == f17721(var1));
    }
    
    public static SubLObject f17729(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != f17726(var1) && module0269.NIL != f17721(var1));
    }
    
    public static SubLObject f17730(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic7$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17707(final SubLObject var1) {
        return f17730(var1);
    }
    
    public static SubLObject f17731(final SubLObject var1) {
        return f17730(var1);
    }
    
    public static SubLObject f17732(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17707(var16);
        }
        if (module0269.NIL != module0161.f10489(var16)) {
            return module0161.f10499(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic7$, (SubLObject)module0269.UNPROVIDED, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic7$, var16, (SubLObject)module0269.UNPROVIDED));
    }
    
    public static SubLObject f17733() {
        SubLObject var2;
        for (var2 = (SubLObject)module0269.NIL; module0269.NIL == f17731(var2); var2 = module0173.f10963()) {}
        return var2;
    }
    
    public static SubLObject f17734(final SubLObject var1) {
        return f17700(var1, module0269.$ic11$);
    }
    
    public static SubLObject f17735(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17734(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic11$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic11$, var16, var2));
    }
    
    public static SubLObject f17736(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != f17737(var1) || module0269.NIL != f17738(var1));
    }
    
    public static SubLObject f17739(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17736(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic12$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic12$, var16, var2));
    }
    
    public static SubLObject f17740(final SubLObject var1) {
        return f17700(var1, module0269.$ic13$);
    }
    
    public static SubLObject f17741(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17740(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic13$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic13$, var16, var2));
    }
    
    public static SubLObject f17742(final SubLObject var1) {
        return f17700(var1, module0269.$ic14$);
    }
    
    public static SubLObject f17743(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17742(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic14$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic14$, var16, var2));
    }
    
    public static SubLObject f17744(final SubLObject var1) {
        return f17700(var1, module0269.$ic15$);
    }
    
    public static SubLObject f17745(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17744(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic15$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic15$, var16, var2));
    }
    
    public static SubLObject f17746(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic16$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic16$, var16, var2));
    }
    
    public static SubLObject f17747(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic17$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic17$, var16, var2));
    }
    
    public static SubLObject f17748(final SubLObject var1) {
        return f17700(var1, module0269.$ic18$);
    }
    
    public static SubLObject f17749(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17748(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic18$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic18$, var16, var2));
    }
    
    public static SubLObject f17750(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic19$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic19$, var16, var2));
    }
    
    public static SubLObject f17751(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic20$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic20$, var16, var2));
    }
    
    public static SubLObject f17752(final SubLObject var1) {
        return f17700(var1, module0269.$ic21$);
    }
    
    public static SubLObject f17753(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17752(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic21$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic21$, var16, var2));
    }
    
    public static SubLObject f17754(final SubLObject var1) {
        return f17700(var1, module0269.$ic22$);
    }
    
    public static SubLObject f17755(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17754(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic22$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic22$, var16, var2));
    }
    
    public static SubLObject f17756(final SubLObject var1, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return f17698(var1, module0269.$ic23$, var2);
    }
    
    public static SubLObject f17757(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17756(var16, var2);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic23$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic23$, var16, var2));
    }
    
    public static SubLObject f17758(final SubLObject var1) {
        return f17700(var1, module0269.$ic24$);
    }
    
    public static SubLObject f17759(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17758(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic24$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic24$, var16, var2));
    }
    
    public static SubLObject f17760(final SubLObject var18) {
        return f17761(var18);
    }
    
    public static SubLObject f17761(final SubLObject var1) {
        return f17700(var1, module0269.$ic29$);
    }
    
    public static SubLObject f17762(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17761(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic29$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic29$, var16, var2));
    }
    
    public static SubLObject f17763(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != f17761(var1) && module0269.NIL != f17716(var1));
    }
    
    public static SubLObject f17764(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17763(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic30$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic30$, var16, var2));
    }
    
    public static SubLObject f17765(final SubLObject var1) {
        return f17700(var1, module0269.$ic31$);
    }
    
    public static SubLObject f17766(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17765(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic31$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic31$, var16, var2));
    }
    
    public static SubLObject f17767() {
        return f17703(module0269.$ic31$);
    }
    
    public static SubLObject f17768(final SubLObject var1) {
        return f17700(var1, module0269.$ic32$);
    }
    
    public static SubLObject f17769(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17768(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic32$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic32$, var16, var2));
    }
    
    public static SubLObject f17770(final SubLObject var1) {
        return f17700(var1, module0269.$ic33$);
    }
    
    public static SubLObject f17771(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17770(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic33$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic33$, var16, var2));
    }
    
    public static SubLObject f17772(final SubLObject var1, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return f17698(var1, module0269.$ic34$, var2);
    }
    
    public static SubLObject f17773(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17772(var16, var2);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic34$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic34$, var16, var2));
    }
    
    public static SubLObject f17774(final SubLObject var1) {
        return f17700(var1, module0269.$ic35$);
    }
    
    public static SubLObject f17775(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17774(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic35$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic35$, var16, var2));
    }
    
    public static SubLObject f17776(final SubLObject var1) {
        return f17700(var1, module0269.$ic36$);
    }
    
    public static SubLObject f17777(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17776(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic36$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic36$, var16, var2));
    }
    
    public static SubLObject f17737(final SubLObject var1) {
        return f17700(var1, module0269.$ic37$);
    }
    
    public static SubLObject f17778(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17737(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic37$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic37$, var16, var2));
    }
    
    public static SubLObject f17779(final SubLObject var1) {
        return f17700(var1, module0269.$ic38$);
    }
    
    public static SubLObject f17780(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17779(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic38$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic38$, var16, var2));
    }
    
    public static SubLObject f17781(final SubLObject var1) {
        return f17700(var1, module0269.$ic39$);
    }
    
    public static SubLObject f17782(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17781(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic39$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic39$, var16, var2));
    }
    
    public static SubLObject f17783(final SubLObject var1) {
        return module0259.f16854(var1, module0269.$ic40$, module0132.$g1555$.getGlobalValue(), (SubLObject)module0269.UNPROVIDED);
    }
    
    public static SubLObject f17784(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17783(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic40$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic40$, var16, var2));
    }
    
    public static SubLObject f17785(final SubLObject var1) {
        return f17700(var1, module0269.$ic41$);
    }
    
    public static SubLObject f17786(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17785(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic41$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic41$, var16, var2));
    }
    
    public static SubLObject f17738(final SubLObject var1) {
        return f17700(var1, module0269.$ic42$);
    }
    
    public static SubLObject f17787(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17738(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic42$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic42$, var16, var2));
    }
    
    public static SubLObject f17788(final SubLObject var1) {
        return f17700(var1, module0269.$ic43$);
    }
    
    public static SubLObject f17789(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17788(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic43$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic43$, var16, var2));
    }
    
    public static SubLObject f17790(final SubLObject var1) {
        return f17700(var1, module0269.$ic44$);
    }
    
    public static SubLObject f17791(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17790(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic44$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic44$, var16, var2));
    }
    
    public static SubLObject f17792(final SubLObject var1) {
        return f17700(var1, module0269.$ic45$);
    }
    
    public static SubLObject f17793(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17792(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic45$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic45$, var16, var2));
    }
    
    public static SubLObject f17794(final SubLObject var1) {
        return f17700(var1, module0269.$ic46$);
    }
    
    public static SubLObject f17795(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17794(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic46$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic46$, var16, var2));
    }
    
    public static SubLObject f17796(final SubLObject var1) {
        return f17700(var1, module0269.$ic47$);
    }
    
    public static SubLObject f17797(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17796(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic47$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic47$, var16, var2));
    }
    
    public static SubLObject f17798() {
        return f17703(module0269.$ic47$);
    }
    
    public static SubLObject f17799(final SubLObject var1) {
        return f17700(var1, module0269.$ic48$);
    }
    
    public static SubLObject f17800(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return module0305.f20438(var16, module0269.$ic49$, var2);
    }
    
    public static SubLObject f17801(final SubLObject var1) {
        return f17700(var1, module0269.$ic49$);
    }
    
    public static SubLObject f17802(final SubLObject var15) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0173.f10955(var15) && module0269.NIL != f17801(var15));
    }
    
    public static SubLObject f17803(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17801(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic49$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic49$, var16, var2));
    }
    
    public static SubLObject f17804(final SubLObject var1) {
        return f17700(var1, module0269.$ic50$);
    }
    
    public static SubLObject f17805(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17804(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic50$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic50$, var16, var2));
    }
    
    public static SubLObject f17806(final SubLObject var1) {
        return f17700(var1, module0269.$ic51$);
    }
    
    public static SubLObject f17807(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17806(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic51$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic51$, var16, var2));
    }
    
    public static SubLObject f17721(final SubLObject var1) {
        return f17700(var1, module0269.$ic52$);
    }
    
    public static SubLObject f17808(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17721(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic52$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic52$, var16, var2));
    }
    
    public static SubLObject f17809(final SubLObject var1, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return f17698(var1, module0269.$ic53$, var2);
    }
    
    public static SubLObject f17810(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17809(var16, var2);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic53$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic53$, var16, var2));
    }
    
    public static SubLObject f17811(final SubLObject var1, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        return f17698(var1, module0269.$ic54$, var2);
    }
    
    public static SubLObject f17812(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17811(var16, var2);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic54$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic54$, var16, var2));
    }
    
    public static SubLObject f17813(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic55$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17814(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17813(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic55$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic55$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17815(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic56$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17816(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17815(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic56$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic56$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17817(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic57$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17818(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17817(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic57$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic57$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17819(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic58$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17820(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17819(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic58$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic58$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17821(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic59$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17822(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17821(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic59$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic59$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17823(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic60$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17824(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17823(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic60$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic60$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17825(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic61$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17826(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17825(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic61$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic61$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17827(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic62$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17828(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17827(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic62$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic62$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17829(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0269.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var2);
            module0147.$g2095$.bind(module0269.$ic2$, var2);
            var3 = f17698(var1, module0269.$ic63$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f17830(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17829(var16);
        }
        SubLObject var18 = module0259.f16891(var16, module0269.$ic63$);
        if (module0269.NIL != var18) {
            return var18;
        }
        final SubLObject var19 = module0147.$g2094$.currentBinding(var17);
        final SubLObject var20 = module0147.$g2095$.currentBinding(var17);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var17);
            module0147.$g2095$.bind(module0269.$ic2$, var17);
            var18 = module0305.f20415(module0269.$ic63$, var16, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var20, var17);
            module0147.$g2094$.rebind(var19, var17);
        }
        return var18;
    }
    
    public static SubLObject f17831(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0269.NIL;
        final SubLObject var18 = module0147.$g2094$.currentBinding(var16);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var16);
            module0147.$g2095$.bind(module0269.$ic2$, var16);
            var17 = f17698(var15, module0269.$ic64$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var19, var16);
            module0147.$g2094$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f17832(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0269.NIL;
        final SubLObject var18 = module0147.$g2094$.currentBinding(var16);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var16);
            module0147.$g2095$.bind(module0269.$ic2$, var16);
            var17 = f17698(var15, module0269.$ic65$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var19, var16);
            module0147.$g2094$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f17833(final SubLObject var15) {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0269.NIL;
        final SubLObject var18 = module0147.$g2094$.currentBinding(var16);
        final SubLObject var19 = module0147.$g2095$.currentBinding(var16);
        try {
            module0147.$g2094$.bind((SubLObject)module0269.$ic1$, var16);
            module0147.$g2095$.bind(module0269.$ic2$, var16);
            var17 = f17698(var15, module0269.$ic66$, (SubLObject)module0269.UNPROVIDED);
        }
        finally {
            module0147.$g2095$.rebind(var19, var16);
            module0147.$g2094$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f17834(final SubLObject var1) {
        return f17700(var1, module0269.$ic67$);
    }
    
    public static SubLObject f17835(final SubLObject var16, SubLObject var2) {
        if (var2 == module0269.UNPROVIDED) {
            var2 = (SubLObject)module0269.NIL;
        }
        if (module0269.NIL != module0173.f10955(var16)) {
            return f17834(var16);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0259.f16854(var16, module0269.$ic67$, var2, (SubLObject)module0269.UNPROVIDED) || module0269.NIL != module0305.f20415(module0269.$ic67$, var16, var2));
    }
    
    public static SubLObject f17836(final SubLObject var1) {
        return module0259.f16976(var1, module0269.$ic68$);
    }
    
    public static SubLObject f17837(final SubLObject var1) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != constant_handles_oc.f8449(var1) && module0269.NIL == f17836(var1));
    }
    
    public static SubLObject f17838() {
        final SubLObject var20 = module0269.$g2557$.getGlobalValue();
        if (module0269.NIL != var20) {
            module0034.f1818(var20);
        }
        return (SubLObject)module0269.NIL;
    }
    
    public static SubLObject f17839(final SubLObject var1) {
        return module0034.f1829(module0269.$g2557$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)module0269.UNPROVIDED, (SubLObject)module0269.UNPROVIDED);
    }
    
    public static SubLObject f17840(final SubLObject var1) {
        return module0259.f16976(var1, module0269.$ic70$);
    }
    
    public static SubLObject f17841(final SubLObject var1) {
        SubLObject var2 = module0269.$g2557$.getGlobalValue();
        if (module0269.NIL == var2) {
            var2 = module0034.f1934((SubLObject)module0269.$ic69$, (SubLObject)module0269.$ic71$, (SubLObject)module0269.NIL, (SubLObject)module0269.EQL, (SubLObject)module0269.ONE_INTEGER, (SubLObject)module0269.ZERO_INTEGER);
            module0034.f1955((SubLObject)module0269.$ic72$);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)module0269.$ic73$);
        if (var3 == module0269.$ic73$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17840(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)module0269.UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f17842() {
        final SubLObject var20 = module0269.$g2558$.getGlobalValue();
        if (module0269.NIL != var20) {
            module0034.f1818(var20);
        }
        return (SubLObject)module0269.NIL;
    }
    
    public static SubLObject f17843(final SubLObject var1) {
        return module0034.f1829(module0269.$g2558$.getGlobalValue(), (SubLObject)ConsesLow.list(var1), (SubLObject)module0269.UNPROVIDED, (SubLObject)module0269.UNPROVIDED);
    }
    
    public static SubLObject f17844(final SubLObject var1) {
        return module0259.f16976(var1, module0269.$ic75$);
    }
    
    public static SubLObject f17845(final SubLObject var1) {
        SubLObject var2 = module0269.$g2558$.getGlobalValue();
        if (module0269.NIL == var2) {
            var2 = module0034.f1934((SubLObject)module0269.$ic74$, (SubLObject)module0269.$ic76$, (SubLObject)module0269.NIL, (SubLObject)module0269.EQL, (SubLObject)module0269.ONE_INTEGER, (SubLObject)module0269.ZERO_INTEGER);
            module0034.f1955((SubLObject)module0269.$ic77$);
        }
        SubLObject var3 = module0034.f1814(var2, var1, (SubLObject)module0269.$ic73$);
        if (var3 == module0269.$ic73$) {
            var3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17844(var1)));
            module0034.f1816(var2, var1, var3, (SubLObject)module0269.UNPROVIDED);
        }
        return module0034.f1959(var3);
    }
    
    public static SubLObject f17846(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0212.f13762(var16) && module0269.NIL != module0259.f16891(var16, module0269.$ic79$));
    }
    
    public static SubLObject f17847(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0034.$g879$.getDynamicValue(var17);
        SubLObject var19 = (SubLObject)module0269.NIL;
        if (module0269.NIL == var18) {
            return f17846(var16);
        }
        var19 = module0034.f1857(var18, (SubLObject)module0269.$ic78$, (SubLObject)module0269.UNPROVIDED);
        if (module0269.NIL == var19) {
            var19 = module0034.f1807(module0034.f1842(var18), (SubLObject)module0269.$ic78$, (SubLObject)module0269.ONE_INTEGER, (SubLObject)module0269.NIL, (SubLObject)module0269.EQUAL, (SubLObject)module0269.UNPROVIDED);
            module0034.f1860(var18, (SubLObject)module0269.$ic78$, var19);
        }
        SubLObject var20 = module0034.f1814(var19, var16, (SubLObject)module0269.$ic73$);
        if (var20 == module0269.$ic73$) {
            var20 = Values.arg2(var17.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17846(var16)));
            module0034.f1816(var19, var16, var20, (SubLObject)module0269.UNPROVIDED);
        }
        return module0034.f1959(var20);
    }
    
    public static SubLObject f17848(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0212.f13762(var16) && module0269.NIL != module0259.f16891(var16, module0269.$ic81$));
    }
    
    public static SubLObject f17849(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0034.$g879$.getDynamicValue(var17);
        SubLObject var19 = (SubLObject)module0269.NIL;
        if (module0269.NIL == var18) {
            return f17848(var16);
        }
        var19 = module0034.f1857(var18, (SubLObject)module0269.$ic80$, (SubLObject)module0269.UNPROVIDED);
        if (module0269.NIL == var19) {
            var19 = module0034.f1807(module0034.f1842(var18), (SubLObject)module0269.$ic80$, (SubLObject)module0269.ONE_INTEGER, (SubLObject)module0269.NIL, (SubLObject)module0269.EQUAL, (SubLObject)module0269.UNPROVIDED);
            module0034.f1860(var18, (SubLObject)module0269.$ic80$, var19);
        }
        SubLObject var20 = module0034.f1814(var19, var16, (SubLObject)module0269.$ic73$);
        if (var20 == module0269.$ic73$) {
            var20 = Values.arg2(var17.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17848(var16)));
            module0034.f1816(var19, var16, var20, (SubLObject)module0269.UNPROVIDED);
        }
        return module0034.f1959(var20);
    }
    
    public static SubLObject f17850(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0269.NIL != module0212.f13762(var16) && module0269.NIL != module0259.f16891(var16, module0269.$ic83$));
    }
    
    public static SubLObject f17851(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = module0034.$g879$.getDynamicValue(var17);
        SubLObject var19 = (SubLObject)module0269.NIL;
        if (module0269.NIL == var18) {
            return f17850(var16);
        }
        var19 = module0034.f1857(var18, (SubLObject)module0269.$ic82$, (SubLObject)module0269.UNPROVIDED);
        if (module0269.NIL == var19) {
            var19 = module0034.f1807(module0034.f1842(var18), (SubLObject)module0269.$ic82$, (SubLObject)module0269.ONE_INTEGER, (SubLObject)module0269.NIL, (SubLObject)module0269.EQUAL, (SubLObject)module0269.UNPROVIDED);
            module0034.f1860(var18, (SubLObject)module0269.$ic82$, var19);
        }
        SubLObject var20 = module0034.f1814(var19, var16, (SubLObject)module0269.$ic73$);
        if (var20 == module0269.$ic73$) {
            var20 = Values.arg2(var17.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f17850(var16)));
            module0034.f1816(var19, var16, var20, (SubLObject)module0269.UNPROVIDED);
        }
        return module0034.f1959(var20);
    }
    
    public static SubLObject f17852() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17697", "S#20274", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17698", "S#17988", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17699", "S#20275", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17700", "S#20276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17701", "S#18499", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17702", "S#20277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17703", "S#16677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17704", "S#20278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17709", "S#17582", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17705", "S#15489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17710", "COLLECTION-P", 1, 0, false);
        new $f17710$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17711", "S#20279", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17712", "S#19266", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17713", "S#17581", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17714", "S#17473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17715", "S#20280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17706", "S#15518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17716", "PREDICATE-P", 1, 0, false);
        new $f17716$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17717", "S#20281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17718", "S#16411", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17719", "S#20282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17720", "S#20283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17722", "S#20284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17723", "S#20285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17724", "S#15523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17726", "S#20286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17725", "S#16407", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17708", "S#16408", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17727", "S#20287", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17728", "S#20288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17729", "S#20289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17730", "S#20290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17707", "S#13273", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17731", "S#16717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17732", "S#18501", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17733", "S#20291", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17734", "RELATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17735", "S#20292", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17736", "S#16410", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17739", "S#20293", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17740", "S#17577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17741", "S#20294", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17742", "S#17579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17743", "S#20295", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17744", "S#20296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17745", "S#20297", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17746", "S#20298", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17747", "S#20299", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17748", "S#20300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17749", "S#20301", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17750", "S#20302", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17751", "S#20303", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17752", "S#17576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17753", "S#20304", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17754", "S#20305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17755", "S#20306", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17756", "S#20307", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17757", "S#20308", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17758", "S#17142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17759", "S#20309", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17760", "COMMUTATIVE-RELATION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17761", "S#16714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17762", "S#20310", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17763", "S#20311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17764", "S#20312", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17765", "S#20313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17766", "S#20314", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17767", "S#20315", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17768", "S#20316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17769", "S#20317", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17770", "S#17597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17771", "S#17596", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17772", "S#17982", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17773", "S#20318", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17774", "S#20319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17775", "S#20320", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17776", "S#17574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17777", "S#20321", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17737", "S#15481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17778", "S#20322", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17779", "S#16401", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17780", "S#20323", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17781", "S#16035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17782", "S#20324", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17783", "S#20325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17784", "S#20326", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17785", "S#20327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17786", "S#20328", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17738", "S#20329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17787", "S#20330", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17788", "S#17573", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17789", "S#20331", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17790", "S#20332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17791", "S#20333", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17792", "S#20334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17793", "S#20335", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17794", "S#15536", 1, 0, false);
        new $f17794$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17795", "S#20336", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17796", "S#19415", 1, 0, false);
        new $f17796$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17797", "S#20337", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17798", "S#20338", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17799", "S#19414", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17800", "SKOLEM-FUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17801", "SKOLEM-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17802", "S#20339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17803", "S#20340", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17804", "S#17575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17805", "S#20341", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17806", "S#17578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17807", "S#20342", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17721", "S#17518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17808", "S#17517", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17809", "S#17580", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17810", "S#20343", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17811", "S#20344", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17812", "S#20345", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17813", "S#20346", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17814", "S#20347", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17815", "S#20348", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17816", "S#20349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17817", "S#20350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17818", "S#20351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17819", "S#20352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17820", "S#20353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17821", "S#20354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17822", "S#20355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17823", "S#20356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17824", "S#20357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17825", "S#20358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17826", "S#20359", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17827", "S#20360", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17828", "S#20361", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17829", "S#20362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17830", "S#20363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17831", "S#20364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17832", "S#20365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17833", "S#15479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17834", "S#17987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17835", "S#20366", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17836", "S#20367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17837", "S#20368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17838", "S#20369", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17839", "S#20370", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17840", "S#20371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17841", "S#20372", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17842", "S#20373", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17843", "S#20374", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17844", "S#20375", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17845", "S#20376", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17846", "S#20377", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17847", "S#20378", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17848", "S#20379", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17849", "S#20380", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17850", "S#20381", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0269", "f17851", "S#20382", 1, 0, false);
        return (SubLObject)module0269.NIL;
    }
    
    public static SubLObject f17853() {
        module0269.$g2557$ = SubLFiles.deflexical("S#20383", (SubLObject)module0269.NIL);
        module0269.$g2558$ = SubLFiles.deflexical("S#20384", (SubLObject)module0269.NIL);
        return (SubLObject)module0269.NIL;
    }
    
    public static SubLObject f17854() {
        module0012.f368((SubLObject)module0269.$ic25$, (SubLObject)module0269.$ic26$, (SubLObject)module0269.$ic27$, (SubLObject)module0269.NIL, (SubLObject)module0269.$ic28$);
        module0034.f1909((SubLObject)module0269.$ic69$);
        module0034.f1909((SubLObject)module0269.$ic74$);
        module0034.f1895((SubLObject)module0269.$ic78$);
        module0034.f1895((SubLObject)module0269.$ic80$);
        module0034.f1895((SubLObject)module0269.$ic82$);
        return (SubLObject)module0269.NIL;
    }
    
    public void declareFunctions() {
        f17852();
    }
    
    public void initializeVariables() {
        f17853();
    }
    
    public void runTopLevelForms() {
        f17854();
    }
    
    static {
        me = (SubLFile)new module0269();
        module0269.$g2557$ = null;
        module0269.$g2558$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic1$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic2$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic3$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic4$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic5$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $ic6$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic8$ = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $ic9$ = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $ic10$ = SubLObjectFactory.makeSymbol("S#16411", "CYC");
        $ic11$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Relation"));
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SententialRelation"));
        $ic13$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AntiSymmetricBinaryPredicate"));
        $ic14$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AntiTransitiveBinaryPredicate"));
        $ic15$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArgTypeBinaryPredicate"));
        $ic16$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArgQuotedIsaBinaryPredicate"));
        $ic17$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArgFormatBinaryPredicate"));
        $ic18$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArgTypeTernaryPredicate"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArgQuotedIsaTernaryPredicate"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArgFormatTernaryPredicate"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate"));
        $ic22$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingPredicate"));
        $ic23$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnderspecifiedPredicate"));
        $ic24$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BroadMicrotheory"));
        $ic25$ = SubLObjectFactory.makeSymbol("COMMUTATIVE-RELATION?");
        $ic26$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17572", "CYC"));
        $ic27$ = SubLObjectFactory.makeString("Return T iff RELATION is a commutative relation.");
        $ic28$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic29$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CommutativeRelation"));
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CommutativePredicate"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DistributingMetaKnowledgePredicate"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ELRelation"));
        $ic33$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EvaluatableFunction"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EvaluatablePredicate"));
        $ic35$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier"));
        $ic36$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IrreflexiveBinaryPredicate"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LogicalConnective"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MicrotheoryDesignatingRelation"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativeRelation"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PartiallyCommutativePredicate"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProblemSolvingCntxt"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Quantifier"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate"));
        $ic44$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ReifiableFunction"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("RuleMacroPredicate"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ScopingRelation"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SiblingDisjointCollectionType"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DisjointCollectionType"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunction"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate"));
        $ic51$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("VariableArityRelation"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DocumentationPredicate"));
        $ic54$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SKSIContentMicrotheory"));
        $ic55$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SKSIExternalTermDenotingFunction"));
        $ic56$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SKSISupportedComparisonPredicate"));
        $ic57$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SKSISupportedFunction"));
        $ic58$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CSQLComparisonPredicate"));
        $ic59$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SKSISupportedConstant"));
        $ic60$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CSQLFunction"));
        $ic61$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CSQLLogicalConnective"));
        $ic62$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CSQLQuantifier"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CSQLConstantFunction"));
        $ic64$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLDefinitenessAttribute"));
        $ic65$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLQuantAttribute"));
        $ic66$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ExistentialQuantifier-Bounded"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EvaluatableRelation-Contextualized"));
        $ic68$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PublicConstant"));
        $ic69$ = SubLObjectFactory.makeSymbol("S#20372", "CYC");
        $ic70$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProprietaryConstant"));
        $ic71$ = SubLObjectFactory.makeSymbol("S#20383", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#20369", "CYC");
        $ic73$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic74$ = SubLObjectFactory.makeSymbol("S#20376", "CYC");
        $ic75$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProprietaryTerm"));
        $ic76$ = SubLObjectFactory.makeSymbol("S#20384", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#20373", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#20378", "CYC");
        $ic79$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("City"));
        $ic80$ = SubLObjectFactory.makeSymbol("S#20380", "CYC");
        $ic81$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("GeographicalRegion"));
        $ic82$ = SubLObjectFactory.makeSymbol("S#20382", "CYC");
        $ic83$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Country"));
    }
    
    public static final class $f17710$UnaryFunction extends UnaryFunction
    {
        public $f17710$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("COLLECTION-P"));
        }
        
        public SubLObject processItem(final SubLObject var13) {
            return module0269.f17710(var13);
        }
    }
    
    public static final class $f17716$UnaryFunction extends UnaryFunction
    {
        public $f17716$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PREDICATE-P"));
        }
        
        public SubLObject processItem(final SubLObject var13) {
            return module0269.f17716(var13);
        }
    }
    
    public static final class $f17794$UnaryFunction extends UnaryFunction
    {
        public $f17794$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15536"));
        }
        
        public SubLObject processItem(final SubLObject var13) {
            return module0269.f17794(var13);
        }
    }
    
    public static final class $f17796$UnaryFunction extends UnaryFunction
    {
        public $f17796$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#19415"));
        }
        
        public SubLObject processItem(final SubLObject var13) {
            return module0269.f17796(var13);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0269.class
	Total time: 400 ms
	
	Decompiled with Procyon 0.5.32.
*/