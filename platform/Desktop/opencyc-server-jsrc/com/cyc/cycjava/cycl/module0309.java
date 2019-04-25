package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0309 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0309";
    public static final String myFingerPrint = "1fe2fdfc4858fa25d338f14174b0f47bcfc1943f6c76c303256a1fc3e70a1404";
    private static SubLSymbol $g2792$;
    private static SubLSymbol $g2793$;
    private static SubLSymbol $g2794$;
    public static SubLSymbol $g2795$;
    private static SubLSymbol $g2796$;
    private static SubLSymbol $g2797$;
    private static final SubLObject $ic0$;
    private static final SubLObject $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLInteger $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLObject $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLObject $ic12$;
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
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLObject $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLString $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLString $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLObject $ic66$;
    private static final SubLObject $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLList $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
    private static final SubLList $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLObject $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLInteger $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLObject $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLObject $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLObject $ic88$;
    private static final SubLObject $ic89$;
    private static final SubLObject $ic90$;
    private static final SubLObject $ic91$;
    private static final SubLObject $ic92$;
    private static final SubLString $ic93$;
    private static final SubLObject $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLList $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLList $ic101$;
    private static final SubLList $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLList $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLString $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLList $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLObject $ic150$;
    private static final SubLObject $ic151$;
    
    public static SubLObject f20927(final SubLObject var1, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (module0309.NIL != module0202.f12903(var1)) {
            return f20928(var1, var2);
        }
        return f20929(var1, var2);
    }
    
    public static SubLObject f20930(final SubLObject var1, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0274.f18061();
        final SubLObject var4 = module0152.$g2125$.currentBinding(var3);
        final SubLObject var5 = module0152.$g2126$.currentBinding(var3);
        final SubLObject var6 = module0144.$g1796$.currentBinding(var3);
        final SubLObject var7 = module0144.$g1795$.currentBinding(var3);
        final SubLObject var8 = module0152.$g2116$.currentBinding(var3);
        final SubLObject var9 = module0152.$g2115$.currentBinding(var3);
        try {
            module0152.$g2125$.bind(var1, var3);
            module0152.$g2126$.bind((module0309.NIL != module0151.f9690() && module0309.NIL != module0152.f9724()) ? module0152.f9724() : var1, var3);
            module0144.$g1796$.bind((SubLObject)module0309.T, var3);
            module0144.$g1795$.bind((SubLObject)module0309.T, var3);
            module0152.$g2116$.bind((SubLObject)module0309.T, var3);
            module0152.$g2115$.bind((SubLObject)module0309.T, var3);
            f20927(var1, var2);
        }
        finally {
            module0152.$g2115$.rebind(var9, var3);
            module0152.$g2116$.rebind(var8, var3);
            module0144.$g1795$.rebind(var7, var3);
            module0144.$g1796$.rebind(var6, var3);
            module0152.$g2126$.rebind(var5, var3);
            module0152.$g2125$.rebind(var4, var3);
        }
        return Sequences.nreverse(module0144.$g1853$.getDynamicValue(var3));
    }
    
    public static SubLObject f20928(final SubLObject var10, final SubLObject var2) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        final SubLObject var12 = module0205.f13327(module0202.f12906(var10));
        if (module0309.NIL != module0161.f10499(var12)) {
            return f20929(var10, var12);
        }
        if (module0309.NIL == module0201.f12580(var12)) {
            return f20929(var10, var2);
        }
        if (module0309.NIL != module0018.f979()) {
            return (SubLObject)module0309.T;
        }
        if (module0309.NIL != module0018.f981()) {
            return f20929(var10, module0147.$g2095$.getDynamicValue(var11));
        }
        return f20929(var10, var2);
    }
    
    public static SubLObject f20931(final SubLObject var12) {
        if (module0309.NIL != module0202.f12977(var12) && module0309.NIL == module0202.f12589(var12, module0309.$ic0$) && module0309.NIL == module0202.f12589(var12, module0309.$ic1$)) {
            return module0202.f12947(var12, (SubLObject)module0309.UNPROVIDED);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20932(final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return ConsesLow.append(module0146.$g1980$.getDynamicValue(var13), f20931(var12));
    }
    
    public static SubLObject f20933() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1799$.getDynamicValue(var3) && module0309.NIL == module0144.$g1805$.getDynamicValue(var3) && module0309.NIL == module0144.$g1806$.getDynamicValue(var3) && module0309.NIL == module0279.f18527());
    }
    
    public static SubLObject f20929(final SubLObject var1, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        final SubLObject var4 = module0205.f13207(var1, (SubLObject)module0309.UNPROVIDED);
        final SubLObject var5 = module0202.f12707(var1, (SubLObject)module0309.UNPROVIDED);
        SubLObject var6 = (SubLObject)module0309.T;
        SubLObject var7 = (SubLObject)module0309.NIL;
        final SubLObject var8 = module0144.$g1777$.currentBinding(var3);
        final SubLObject var9 = module0144.$g1833$.currentBinding(var3);
        try {
            module0144.$g1777$.bind(module0144.$g1778$.getDynamicValue(var3), var3);
            module0144.$g1833$.bind((SubLObject)module0309.ZERO_INTEGER, var3);
            final SubLObject var10 = Types.sublisp_null(module0202.f12911(var1, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED));
            final SubLObject var4_18 = module0144.$g1769$.currentBinding(var3);
            final SubLObject var5_19 = module0144.$g1771$.currentBinding(var3);
            final SubLObject var11 = module0144.$g1828$.currentBinding(var3);
            final SubLObject var12 = module0144.$g1831$.currentBinding(var3);
            final SubLObject var13 = module0146.$g1980$.currentBinding(var3);
            try {
                module0144.$g1769$.bind((SubLObject)((module0309.NIL != module0144.$g1769$.getDynamicValue(var3)) ? ((module0309.NIL != module0144.$g1799$.getDynamicValue(var3) || module0309.NIL != module0144.$g1805$.getDynamicValue(var3) || module0309.NIL != module0144.$g1806$.getDynamicValue(var3) || module0309.NIL != module0279.f18527()) ? module0309.NIL : var10) : module0309.NIL), var3);
                module0144.$g1771$.bind((SubLObject)((module0309.NIL != module0144.$g1771$.getDynamicValue(var3)) ? ((module0309.NIL != module0144.$g1799$.getDynamicValue(var3) || module0309.NIL != module0144.$g1805$.getDynamicValue(var3) || module0309.NIL != module0144.$g1806$.getDynamicValue(var3) || module0309.NIL != module0279.f18527()) ? module0309.NIL : var10) : module0309.NIL), var3);
                module0144.$g1828$.bind(var1, var3);
                module0144.$g1831$.bind(module0205.f13327(module0205.f13132(var1)), var3);
                module0146.$g1980$.bind(f20932(var1), var3);
                if (module0309.NIL != module0004.f104(var5, module0146.$g1980$.getDynamicValue(var3), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                    module0274.f18082((SubLObject)ConsesLow.list((SubLObject)module0309.$ic2$, var5, var1));
                    var6 = (SubLObject)module0309.NIL;
                }
                if (module0309.NIL != module0173.f10955(module0144.$g1831$.getDynamicValue(var3))) {
                    var6 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20934(module0144.$g1831$.getDynamicValue(var3), var2) && module0309.NIL != f20935(var1, (SubLObject)module0309.UNPROVIDED) && module0309.NIL != var6);
                    var7 = module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var6));
                    final SubLObject var4_19 = module0146.$g2004$.currentBinding(var3);
                    try {
                        module0146.$g2004$.bind(module0279.f18488(module0144.$g1831$.getDynamicValue(var3)), var3);
                        if (module0309.NIL == var7) {
                            SubLObject var14 = var4;
                            SubLObject var15 = (SubLObject)module0309.NIL;
                            var15 = var14.first();
                            while (module0309.NIL == var7 && module0309.NIL != var14) {
                                module0144.$g1833$.setDynamicValue(Numbers.add(module0144.$g1833$.getDynamicValue(var3), (SubLObject)module0309.ONE_INTEGER), var3);
                                final SubLObject var4_20 = module0146.$g2032$.currentBinding(var3);
                                final SubLObject var5_20 = module0144.$g1805$.currentBinding(var3);
                                final SubLObject var6_25 = module0144.$g1806$.currentBinding(var3);
                                final SubLObject var7_26 = module0144.$g1801$.currentBinding(var3);
                                final SubLObject var8_27 = module0271.$g2564$.currentBinding(var3);
                                final SubLObject var16 = module0144.$g1752$.currentBinding(var3);
                                final SubLObject var17 = module0144.$g1754$.currentBinding(var3);
                                final SubLObject var18 = module0144.$g1799$.currentBinding(var3);
                                final SubLObject var19 = module0144.$g1800$.currentBinding(var3);
                                try {
                                    module0146.$g2032$.bind(f20936(module0144.$g1831$.getDynamicValue(var3), module0144.$g1833$.getDynamicValue(var3)), var3);
                                    module0144.$g1805$.bind(f20937(module0144.$g1831$.getDynamicValue(var3)), var3);
                                    module0144.$g1806$.bind(f20938(module0144.$g1831$.getDynamicValue(var3)), var3);
                                    module0144.$g1801$.bind(f20939(var1, module0144.$g1833$.getDynamicValue(var3)), var3);
                                    module0271.$g2564$.bind(module0274.f18112(module0144.$g1831$.getDynamicValue(var3), module0144.$g1833$.getDynamicValue(var3)), var3);
                                    module0144.$g1752$.bind(f20940(module0144.$g1831$.getDynamicValue(var3), module0144.$g1833$.getDynamicValue(var3), var2), var3);
                                    module0144.$g1754$.bind(f20941(var1, module0144.$g1833$.getDynamicValue(var3)), var3);
                                    module0144.$g1799$.bind(f20942(var1, var2), var3);
                                    module0144.$g1800$.bind(f20943(var1), var3);
                                    var6 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20944(module0144.$g1831$.getDynamicValue(var3), var15, module0144.$g1833$.getDynamicValue(var3), module0303.f20118(module0144.$g1831$.getDynamicValue(var3), var4, module0144.$g1833$.getDynamicValue(var3), var2)) && module0309.NIL != var6);
                                }
                                finally {
                                    module0144.$g1800$.rebind(var19, var3);
                                    module0144.$g1799$.rebind(var18, var3);
                                    module0144.$g1754$.rebind(var17, var3);
                                    module0144.$g1752$.rebind(var16, var3);
                                    module0271.$g2564$.rebind(var8_27, var3);
                                    module0144.$g1801$.rebind(var7_26, var3);
                                    module0144.$g1806$.rebind(var6_25, var3);
                                    module0144.$g1805$.rebind(var5_20, var3);
                                    module0146.$g2032$.rebind(var4_20, var3);
                                }
                                var7 = module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var6));
                                var14 = var14.rest();
                                var15 = var14.first();
                            }
                        }
                    }
                    finally {
                        module0146.$g2004$.rebind(var4_19, var3);
                    }
                }
            }
            finally {
                module0146.$g1980$.rebind(var13, var3);
                module0144.$g1831$.rebind(var12, var3);
                module0144.$g1828$.rebind(var11, var3);
                module0144.$g1771$.rebind(var5_19, var3);
                module0144.$g1769$.rebind(var4_18, var3);
            }
        }
        finally {
            module0144.$g1833$.rebind(var9, var3);
            module0144.$g1777$.rebind(var8, var3);
        }
        return var6;
    }
    
    public static SubLObject f20944(final SubLObject var12, final SubLObject var22, final SubLObject var31, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0151.f9690() && module0309.NIL != module0269.f17737(var12)) {
            return (SubLObject)module0309.T;
        }
        SubLObject var33 = (SubLObject)module0309.NIL;
        final SubLObject var34 = module0152.$g2120$.currentBinding(var32);
        final SubLObject var35 = module0152.$g2121$.currentBinding(var32);
        try {
            module0152.$g2120$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0152.$g2120$.getDynamicValue(var32) || module0309.NIL != module0279.f18444(var12, var31, var2)), var32);
            module0152.$g2121$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0152.$g2121$.getDynamicValue(var32) || module0309.NIL != module0279.f18443(var12, var31, var2)), var32);
            if (module0309.NIL != f20945(var22)) {
                var33 = f20946(var12, var22, var31, var2);
            }
            if (module0309.NIL == var33) {
                var33 = f20947(var12, var22, var31, var2);
            }
        }
        finally {
            module0152.$g2121$.rebind(var35, var32);
            module0152.$g2120$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f20948() {
        final SubLObject var32 = module0309.$g2793$.getGlobalValue();
        if (module0309.NIL != var32) {
            module0034.f1818(var32);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20949(final SubLObject var12, final SubLObject var22, final SubLObject var31, final SubLObject var2, final SubLObject var33, final SubLObject var34) {
        return module0034.f1829(module0309.$g2793$.getGlobalValue(), (SubLObject)ConsesLow.list(var12, var22, var31, var2, var33, var34), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
    }
    
    public static SubLObject f20950(final SubLObject var12, final SubLObject var22, final SubLObject var31, final SubLObject var2, final SubLObject var33, final SubLObject var34) {
        final SubLThread var35 = SubLProcess.currentSubLThread();
        return f20947(var12, var22, module0309.$g2792$.getDynamicValue(var35), var2);
    }
    
    public static SubLObject f20951(final SubLObject var12, final SubLObject var22, final SubLObject var31, final SubLObject var2, final SubLObject var33, final SubLObject var34) {
        SubLObject var35 = module0309.$g2793$.getGlobalValue();
        if (module0309.NIL == var35) {
            var35 = module0034.f1934((SubLObject)module0309.$ic3$, (SubLObject)module0309.$ic4$, (SubLObject)module0309.$ic5$, (SubLObject)module0309.EQUAL, (SubLObject)module0309.SIX_INTEGER, (SubLObject)module0309.ZERO_INTEGER);
            module0034.f1940((SubLObject)module0309.$ic6$);
        }
        final SubLObject var36 = module0034.f1778(var12, var22, var31, var2, var33, var34);
        final SubLObject var37 = module0034.f1814(var35, var36, (SubLObject)module0309.UNPROVIDED);
        if (var37 != module0309.$ic7$) {
            SubLObject var38 = var37;
            SubLObject var39 = (SubLObject)module0309.NIL;
            var39 = var38.first();
            while (module0309.NIL != var38) {
                SubLObject var40 = var39.first();
                final SubLObject var41 = conses_high.second(var39);
                if (var12.equal(var40.first())) {
                    var40 = var40.rest();
                    if (var22.equal(var40.first())) {
                        var40 = var40.rest();
                        if (var31.equal(var40.first())) {
                            var40 = var40.rest();
                            if (var2.equal(var40.first())) {
                                var40 = var40.rest();
                                if (var33.equal(var40.first())) {
                                    var40 = var40.rest();
                                    if (module0309.NIL != var40 && module0309.NIL == var40.rest() && var34.equal(var40.first())) {
                                        return module0034.f1959(var41);
                                    }
                                }
                            }
                        }
                    }
                }
                var38 = var38.rest();
                var39 = var38.first();
            }
        }
        final SubLObject var42 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20950(var12, var22, var31, var2, var33, var34)));
        module0034.f1836(var35, var36, var37, var42, (SubLObject)ConsesLow.list(var12, var22, var31, var2, var33, var34));
        return module0034.f1959(var42);
    }
    
    public static SubLObject f20947(final SubLObject var12, final SubLObject var22, final SubLObject var31, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0309.NIL;
        final SubLObject var34 = module0144.$g1831$.currentBinding(var32);
        final SubLObject var35 = module0144.$g1832$.currentBinding(var32);
        final SubLObject var36 = module0144.$g1833$.currentBinding(var32);
        try {
            module0144.$g1831$.bind(var12, var32);
            module0144.$g1832$.bind(var22, var32);
            module0144.$g1833$.bind(var31, var32);
            var33 = f20934(var22, var2);
            if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var33))) {
                if (module0309.NIL != f20952(var22)) {
                    var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20953(var22, var31) && module0309.NIL != var33);
                }
                else if (module0309.NIL != f20954(var22)) {
                    var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20955(var12, var22, var31, var2) && module0309.NIL != var33);
                }
                else if (module0309.NIL != f20956(var22)) {
                    var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20957(var12, var22, var31, var2) && module0309.NIL != var33);
                }
                else if (module0309.NIL != f20958(var22)) {
                    var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20959(var22, var31) && module0309.NIL != var33);
                }
                else if (module0309.NIL != f20960(var22)) {
                    var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20961(var22, var31) && module0309.NIL != var33);
                }
                else if (module0309.NIL != f20962(var22, var2)) {
                    var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20963(var12, var22, var31, var2) && module0309.NIL != var33);
                }
                else if (module0309.NIL != f20964(var22, (SubLObject)module0309.UNPROVIDED)) {
                    var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20965(var12, var22, var31, var2) && module0309.NIL != var33);
                }
                else {
                    var33 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20966(var12, var22, var31, var2) && module0309.NIL != var33);
                }
            }
        }
        finally {
            module0144.$g1833$.rebind(var36, var32);
            module0144.$g1832$.rebind(var35, var32);
            module0144.$g1831$.rebind(var34, var32);
        }
        return var33;
    }
    
    public static SubLObject f20936(final SubLObject var43, final SubLObject var22) {
        return (SubLObject)((var43.eql(module0309.$ic8$) || (module0309.NIL != module0303.f20135(var43) && var22.eql((SubLObject)module0309.ONE_INTEGER))) ? SubLObjectFactory.makeBoolean(module0309.NIL == module0279.f18527()) : module0279.f18527());
    }
    
    public static SubLObject f20938(final SubLObject var43) {
        final SubLThread var44 = SubLProcess.currentSubLThread();
        if (module0309.$ic9$.eql(var43)) {
            return (SubLObject)module0309.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0144.$g1806$.getDynamicValue(var44) || module0309.NIL != module0202.f12921(var43, (SubLObject)module0309.UNPROVIDED));
    }
    
    public static SubLObject f20937(SubLObject var43) {
        if (var43 == module0309.UNPROVIDED) {
            var43 = (SubLObject)module0309.NIL;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0144.$g1805$.getDynamicValue(var44) || module0309.NIL != module0269.f17724(var43));
    }
    
    public static SubLObject f20940(SubLObject var12, SubLObject var31, SubLObject var2) {
        if (var12 == module0309.UNPROVIDED) {
            var12 = (SubLObject)module0309.NIL;
        }
        if (var31 == module0309.UNPROVIDED) {
            var31 = (SubLObject)module0309.NIL;
        }
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var32 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0144.$g1752$.getDynamicValue(var32) && (module0309.NIL == module0279.f18450(var12, var31, var2) || module0309.NIL == module0279.f18452(var12, var31, var2) || module0309.NIL != module0279.f18451(var12, var31, var2)));
    }
    
    public static SubLObject f20941(final SubLObject var1, final SubLObject var31) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0144.$g1753$.getDynamicValue(var32) && module0309.NIL != module0144.f9453()) {
            final SubLObject var33 = module0205.f13132(var1);
            if (module0309.NIL == module0173.f10955(var33)) {
                return (SubLObject)module0309.T;
            }
            if (module0309.NIL == module0226.f14837(var33, var31)) {
                return (SubLObject)module0309.T;
            }
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20942(final SubLObject var1, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0144.$g1808$.getDynamicValue(var3) && module0309.NIL == module0279.f18534(var1, var2)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0144.$g1799$.getDynamicValue(var3) || module0309.NIL != module0279.f18525());
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20939(final SubLObject var1, final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0279.f18525() || (module0309.NIL != module0202.f12732(var1, (SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.UNPROVIDED) && module0309.NIL != ((module0309.NIL != module0279.f18527()) ? SubLObjectFactory.makeBoolean(module0309.NIL != module0202.f12595(var1) || (module0309.NIL != module0202.f12597(var1) && var31.eql((SubLObject)module0309.ONE_INTEGER))) : SubLObjectFactory.makeBoolean(module0309.NIL != module0202.f12594(var1) || module0309.NIL != module0202.f12597(var1) || module0309.NIL != module0202.f12874(var1) || module0309.NIL != module0202.f12648(var1)))));
    }
    
    public static SubLObject f20967(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0144.$g1808$.getDynamicValue(var45)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0144.$g1799$.getDynamicValue(var45) || (module0309.NIL != module0232.f15308(var44) && module0309.NIL != module0232.f15306(var44)));
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20943(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0144.$g1800$.getDynamicValue(var2) || module0309.NIL != module0226.f14824(var1));
    }
    
    public static SubLObject f20946(final SubLObject var12, final SubLObject var22, final SubLObject var31, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (var12.eql(module0309.$ic10$)) {
            return f20953(var22, var31);
        }
        if (module0309.NIL == module0210.f13598(var22) || module0309.NIL != module0210.f13589(var22)) {
            return (SubLObject)module0309.T;
        }
        if (module0309.NIL != f20963(var12, var22, var31, var2)) {
            return (SubLObject)module0309.T;
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20955(final SubLObject var12, final SubLObject var22, final SubLObject var31, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        return f20968(var12, var22, var31, var2);
    }
    
    public static SubLObject f20957(final SubLObject var12, final SubLObject var22, final SubLObject var31, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        return f20969(var12, var22, var31, var2);
    }
    
    public static SubLObject f20963(final SubLObject var12, final SubLObject var22, final SubLObject var31, final SubLObject var2) {
        SubLObject var32 = f20970(var22, var2);
        if (module0309.NIL != var32) {
            var32 = f20971(var22, var2);
        }
        else if (module0309.NIL == module0303.f20199((SubLObject)module0309.T)) {
            f20971(var22, var2);
        }
        if (module0309.NIL != var32) {
            var32 = f20972(var12, var22, var31, var2);
        }
        else if (module0309.NIL == module0303.f20199((SubLObject)module0309.T)) {
            f20972(var12, var22, var31, var2);
        }
        return var32;
    }
    
    public static SubLObject f20973(final SubLObject var45, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        SubLObject var46 = f20974(var45, var2);
        if (module0309.NIL != var46) {
            var46 = f20975(var45, var2);
        }
        else if (module0309.NIL == module0303.f20199((SubLObject)module0309.T)) {
            f20975(var45, var2);
        }
        return var46;
    }
    
    public static SubLObject f20974(final SubLObject var45, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (module0309.NIL != module0167.f10813(var45)) {
            return f20970(module0172.f10915(var45), var2);
        }
        return f20970(var45, var2);
    }
    
    public static SubLObject f20975(final SubLObject var45, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (module0309.NIL != module0167.f10813(var45)) {
            return f20971(module0172.f10915(var45), var2);
        }
        return f20971(var45, var2);
    }
    
    public static SubLObject f20976(final SubLObject var46, final SubLObject var2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0167.f10813(var46) || (module0309.NIL != module0131.f8587() && module0309.NIL != module0202.f12659(var46) && module0309.NIL != module0226.f14878(module0205.f13276(var46), var2)));
    }
    
    public static SubLObject f20953(final SubLObject var45, final SubLObject var31) {
        final SubLThread var46 = SubLProcess.currentSubLThread();
        if (var31.eql((SubLObject)module0309.ONE_INTEGER)) {
            if (module0309.NIL != module0167.f10813(var45)) {
                return (SubLObject)module0309.T;
            }
            if (module0309.NIL != module0201.f12580(var45)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0018.f979() || module0309.NIL != module0279.f18525() || module0309.NIL != module0144.$g1799$.getDynamicValue(var46));
            }
            if (module0309.NIL != module0210.f13576(var45, (SubLObject)module0309.UNPROVIDED)) {
                return f20977(var45);
            }
        }
        else if (var31.eql((SubLObject)module0309.TWO_INTEGER)) {
            if (module0309.NIL != module0210.f13576(var45, (SubLObject)module0309.UNPROVIDED)) {
                return f20977(var45);
            }
            if (module0309.NIL != module0201.f12580(var45)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0018.f979() || module0309.NIL != module0279.f18525() || module0309.NIL != module0144.$g1799$.getDynamicValue(var46));
            }
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20959(final SubLObject var22, final SubLObject var31) {
        if (var31.eql((SubLObject)module0309.ONE_INTEGER)) {
            if (module0309.NIL != module0167.f10813(var22)) {
                return (SubLObject)module0309.T;
            }
            if (module0309.NIL != module0201.f12580(var22)) {
                return (SubLObject)module0309.T;
            }
            if (module0309.NIL != module0210.f13576(var22, (SubLObject)module0309.UNPROVIDED)) {
                return f20977(var22);
            }
        }
        else if (var31.eql((SubLObject)module0309.TWO_INTEGER)) {
            if (module0309.NIL != module0201.f12580(var22)) {
                return (SubLObject)module0309.T;
            }
            if (module0309.NIL != module0279.f18533(var22, (SubLObject)module0309.UNPROVIDED)) {
                return (SubLObject)module0309.T;
            }
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20961(final SubLObject var22, final SubLObject var31) {
        if (var31.eql((SubLObject)module0309.ONE_INTEGER)) {
            if (module0309.NIL != module0167.f10813(var22)) {
                return (SubLObject)module0309.T;
            }
            if (module0309.NIL != module0201.f12580(var22)) {
                return (SubLObject)module0309.T;
            }
            if (module0309.NIL != module0210.f13576(var22, (SubLObject)module0309.UNPROVIDED)) {
                return f20977(var22);
            }
        }
        else {
            if (var31.eql((SubLObject)module0309.TWO_INTEGER)) {
                return module0552.f34094(var22);
            }
            if (var31.eql((SubLObject)module0309.THREE_INTEGER)) {
                return (SubLObject)module0309.T;
            }
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20977(final SubLObject var48) {
        final SubLThread var49 = SubLProcess.currentSubLThread();
        final SubLObject var50 = module0205.f13276(var48);
        SubLObject var51 = module0201.f12580(var50);
        if (module0309.NIL == var51) {
            final SubLObject var52 = module0147.$g2094$.currentBinding(var49);
            final SubLObject var53 = module0147.$g2095$.currentBinding(var49);
            try {
                module0147.$g2094$.bind((SubLObject)module0309.$ic11$, var49);
                module0147.$g2095$.bind(module0309.$ic12$, var49);
                var51 = module0279.f18533(module0205.f13276(var48), (SubLObject)module0309.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var53, var49);
                module0147.$g2094$.rebind(var52, var49);
            }
        }
        return var51;
    }
    
    public static SubLObject f20965(final SubLObject var12, final SubLObject var22, final SubLObject var31, final SubLObject var2) {
        return f20978(var12, var22, var31, var2);
    }
    
    public static SubLObject f20966(final SubLObject var12, final SubLObject var22, final SubLObject var31, final SubLObject var2) {
        return f20979(var12, var22, var31, var2);
    }
    
    public static SubLObject f20970(final SubLObject var48, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0210.f13571(var48)) {
            final SubLObject var50 = (SubLObject)module0309.T;
            final SubLObject var51 = module0205.f13276(var48);
            if (module0309.NIL != module0144.$g1747$.getDynamicValue(var49)) {
                if (module0309.NIL != module0173.f10955(var51)) {
                    return (SubLObject)module0309.T;
                }
                if (module0309.NIL != module0210.f13576(var51, (SubLObject)module0309.UNPROVIDED)) {
                    return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20970(var51, var2) && module0309.NIL != f20971(var51, var2));
                }
            }
            return var50;
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20971(final SubLObject var48, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (module0309.NIL != module0210.f13571(var48)) {
            return f20980(var48, var2);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20980(final SubLObject var48, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var49 = SubLProcess.currentSubLThread();
        if (module0309.NIL == module0144.f9453()) {
            return (SubLObject)module0309.T;
        }
        if (module0309.NIL != module0210.f13571(var48)) {
            SubLObject var50 = (SubLObject)module0309.NIL;
            final SubLObject var51 = module0152.$g2108$.currentBinding(var49);
            try {
                module0152.$g2108$.bind((SubLObject)module0309.T, var49);
                var50 = f20927(var48, var2);
            }
            finally {
                module0152.$g2108$.rebind(var51, var49);
            }
            return var50;
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20968(final SubLObject var50, final SubLObject var22, final SubLObject var31, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        final SubLObject var52 = module0144.$g1769$.currentBinding(var51);
        try {
            module0144.$g1769$.bind((SubLObject)module0309.NIL, var51);
            return f20969(var50, var22, var31, var2);
        }
        finally {
            module0144.$g1769$.rebind(var52, var51);
        }
    }
    
    public static SubLObject f20969(final SubLObject var50, final SubLObject var22, final SubLObject var31, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1764$.getDynamicValue(var51));
        SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1765$.getDynamicValue(var51));
        SubLObject var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1751$.getDynamicValue(var51));
        SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1766$.getDynamicValue(var51));
        SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1758$.getDynamicValue(var51));
        SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1760$.getDynamicValue(var51));
        SubLObject var58 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1759$.getDynamicValue(var51));
        SubLObject var59 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1780$.getDynamicValue(var51));
        SubLObject var60 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1769$.getDynamicValue(var51));
        final SubLObject var61 = (SubLObject)((module0309.NIL != module0202.f12981(var50, var31)) ? module0309.NIL : module0205.f13329(var22));
        final SubLObject var62 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0152.f9720() || (module0309.NIL != module0144.$g1811$.getDynamicValue(var51) && module0309.NIL != module0167.f10813(var22)));
        if (module0309.NIL != module0167.f10813(var61)) {
            return f20944(var50, var61, var31, var2);
        }
        if (module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58 || module0309.NIL == var59 || module0309.NIL == var60) {
            final SubLObject var63 = module0144.$g1796$.currentBinding(var51);
            final SubLObject var64 = module0144.$g1795$.currentBinding(var51);
            final SubLObject var65 = module0152.$g2116$.currentBinding(var51);
            final SubLObject var66 = module0152.$g2115$.currentBinding(var51);
            try {
                module0144.$g1796$.bind((SubLObject)module0309.NIL, var51);
                module0144.$g1795$.bind((SubLObject)module0309.NIL, var51);
                module0152.$g2116$.bind((SubLObject)module0309.NIL, var51);
                module0152.$g2115$.bind((SubLObject)module0309.NIL, var51);
                if (module0309.NIL != f20978(var50, var22, var31, var2)) {
                    return (SubLObject)module0309.T;
                }
            }
            finally {
                module0152.$g2115$.rebind(var66, var51);
                module0152.$g2116$.rebind(var65, var51);
                module0144.$g1795$.rebind(var64, var51);
                module0144.$g1796$.rebind(var63, var51);
            }
            final SubLObject var67 = var2;
            final SubLObject var68 = module0147.$g2095$.currentBinding(var51);
            final SubLObject var69 = module0147.$g2094$.currentBinding(var51);
            final SubLObject var70 = module0147.$g2096$.currentBinding(var51);
            final SubLObject var71 = module0144.$g1826$.currentBinding(var51);
            try {
                module0147.$g2095$.bind(module0147.f9545(var67), var51);
                module0147.$g2094$.bind(module0147.f9546(var67), var51);
                module0147.$g2096$.bind(module0147.f9549(var67), var51);
                module0144.$g1826$.bind((SubLObject)module0309.$ic14$, var51);
                if (module0309.NIL == var52) {
                    if (module0309.NIL != var62 || module0309.NIL != module0259.f16821(var22, var2, (SubLObject)module0309.UNPROVIDED)) {
                        var52 = f20981(var50, var22, var31, (SubLObject)module0309.$ic15$);
                    }
                    else {
                        final SubLObject var4_62 = module0144.$g1750$.currentBinding(var51);
                        final SubLObject var5_63 = module0144.$g1748$.currentBinding(var51);
                        final SubLObject var6_64 = module0144.$g1769$.currentBinding(var51);
                        try {
                            module0144.$g1750$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1748$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1769$.bind((SubLObject)module0309.NIL, var51);
                            var52 = f20979(var50, var22, var31, var2);
                        }
                        finally {
                            module0144.$g1769$.rebind(var6_64, var51);
                            module0144.$g1748$.rebind(var5_63, var51);
                            module0144.$g1750$.rebind(var4_62, var51);
                        }
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52)) && module0309.NIL == var53) {
                    if (module0309.NIL != var62 || module0309.NIL != module0259.f16972(var22, var2, (SubLObject)module0309.UNPROVIDED)) {
                        var53 = f20981(var50, var22, var31, (SubLObject)module0309.$ic16$);
                    }
                    else {
                        final SubLObject var4_63 = module0144.$g1749$.currentBinding(var51);
                        final SubLObject var5_64 = module0144.$g1748$.currentBinding(var51);
                        final SubLObject var6_65 = module0144.$g1769$.currentBinding(var51);
                        try {
                            module0144.$g1749$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1748$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1769$.bind((SubLObject)module0309.NIL, var51);
                            var53 = f20979(var50, var22, var31, var2);
                        }
                        finally {
                            module0144.$g1769$.rebind(var6_65, var51);
                            module0144.$g1748$.rebind(var5_64, var51);
                            module0144.$g1749$.rebind(var4_63, var51);
                        }
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53)) && module0309.NIL == var54) {
                    var54 = f20981(var50, var22, var31, (SubLObject)module0309.$ic17$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54)) && module0309.NIL == var55) {
                    if (module0309.NIL != var62 || module0309.NIL != module0256.f16524(var22, var2, (SubLObject)module0309.UNPROVIDED)) {
                        var55 = f20981(var50, var22, var31, (SubLObject)module0309.$ic18$);
                    }
                    else {
                        var55 = f20981(var50, var22, var31, (SubLObject)module0309.$ic19$);
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55)) && module0309.NIL == var56) {
                    var56 = f20981(var50, var22, var31, (SubLObject)module0309.$ic20$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56)) && module0309.NIL == var57) {
                    var57 = f20981(var50, var22, var31, (SubLObject)module0309.$ic21$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57)) && module0309.NIL == var58) {
                    var58 = f20981(var50, var22, var31, (SubLObject)module0309.$ic22$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58)) && module0309.NIL == var59) {
                    var59 = f20981(var50, var22, var31, (SubLObject)module0309.$ic23$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58 || module0309.NIL == var59)) && module0309.NIL == var60) {
                    var60 = f20981(var50, var22, var31, (SubLObject)module0309.$ic24$);
                }
            }
            finally {
                module0144.$g1826$.rebind(var71, var51);
                module0147.$g2096$.rebind(var70, var51);
                module0147.$g2094$.rebind(var69, var51);
                module0147.$g2095$.rebind(var68, var51);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != var52 && module0309.NIL != var53 && module0309.NIL != var54 && module0309.NIL != var55 && module0309.NIL != var56 && module0309.NIL != var57 && module0309.NIL != var58 && module0309.NIL != var59 && module0309.NIL != var60);
    }
    
    public static SubLObject f20972(final SubLObject var50, final SubLObject var22, final SubLObject var31, final SubLObject var2) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        assert module0309.NIL != module0202.f12659(var22) : var22;
        if (module0309.NIL != module0144.$g1810$.getDynamicValue(var51)) {
            return f20982(var50, var22, var31, var2);
        }
        return f20983(var50, var22, var31, var2);
    }
    
    public static SubLObject f20982(final SubLObject var50, final SubLObject var22, final SubLObject var31, final SubLObject var2) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1764$.getDynamicValue(var51));
        SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1765$.getDynamicValue(var51));
        SubLObject var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1751$.getDynamicValue(var51));
        SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1766$.getDynamicValue(var51));
        SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1758$.getDynamicValue(var51));
        SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1760$.getDynamicValue(var51));
        SubLObject var58 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1759$.getDynamicValue(var51));
        SubLObject var59 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1780$.getDynamicValue(var51));
        SubLObject var60 = (SubLObject)module0309.T;
        SubLObject var61 = module0205.f13276(var22);
        final SubLObject var62 = (SubLObject)((module0309.NIL != module0202.f12981(var50, var31)) ? module0309.NIL : module0205.f13329(var22));
        if (module0309.NIL != module0167.f10813(var62)) {
            return f20944(var50, var62, var31, var2);
        }
        if (module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58 || module0309.NIL == var59 || module0309.NIL == var60) {
            if (!var61.isAtom()) {
                var61 = module0172.f10922(var61);
            }
            final SubLObject var63 = module0147.$g2095$.currentBinding(var51);
            final SubLObject var64 = module0147.$g2094$.currentBinding(var51);
            final SubLObject var65 = module0147.$g2096$.currentBinding(var51);
            final SubLObject var66 = module0144.$g1826$.currentBinding(var51);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var51);
                module0147.$g2094$.bind(module0147.f9546(var2), var51);
                module0147.$g2096$.bind(module0147.f9549(var2), var51);
                module0144.$g1826$.bind((SubLObject)module0309.$ic26$, var51);
                if (module0309.NIL == var52) {
                    if (module0309.NIL != module0226.f14982(var61, var2) || module0309.NIL != module0226.f14985(var61, var2) || module0309.NIL != module0226.f14989(var22, var2)) {
                        var52 = f20981(var50, var22, var31, (SubLObject)module0309.$ic15$);
                    }
                    else {
                        final SubLObject var4_68 = module0144.$g1750$.currentBinding(var51);
                        final SubLObject var5_69 = module0144.$g1748$.currentBinding(var51);
                        final SubLObject var6_70 = module0144.$g1769$.currentBinding(var51);
                        try {
                            module0144.$g1750$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1748$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1769$.bind((SubLObject)module0309.NIL, var51);
                            var52 = f20979(var50, var22, var31, (SubLObject)module0309.UNPROVIDED);
                        }
                        finally {
                            module0144.$g1769$.rebind(var6_70, var51);
                            module0144.$g1748$.rebind(var5_69, var51);
                            module0144.$g1750$.rebind(var4_68, var51);
                        }
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52)) && module0309.NIL == var53) {
                    if (module0309.NIL != module0279.f18533(var61, var2) || module0309.NIL != module0226.f14991(var61, var2) || module0309.NIL != module0226.f14994(var61, var2)) {
                        var53 = f20981(var50, var22, var31, (SubLObject)module0309.$ic16$);
                    }
                    else {
                        final SubLObject var4_69 = module0144.$g1749$.currentBinding(var51);
                        final SubLObject var5_70 = module0144.$g1748$.currentBinding(var51);
                        final SubLObject var6_71 = module0144.$g1769$.currentBinding(var51);
                        try {
                            module0144.$g1749$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1748$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1769$.bind((SubLObject)module0309.NIL, var51);
                            var53 = f20979(var50, var22, var31, (SubLObject)module0309.UNPROVIDED);
                        }
                        finally {
                            module0144.$g1769$.rebind(var6_71, var51);
                            module0144.$g1748$.rebind(var5_70, var51);
                            module0144.$g1749$.rebind(var4_69, var51);
                        }
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53)) && module0309.NIL == var54) {
                    var54 = f20981(var50, var22, var31, (SubLObject)module0309.$ic17$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54)) && module0309.NIL == var55) {
                    if (module0309.NIL != module0205.f13145((SubLObject)module0309.$ic27$, var22, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                        var55 = (SubLObject)module0309.T;
                    }
                    else {
                        var55 = f20981(var50, var22, var31, (SubLObject)module0309.$ic18$);
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55)) && module0309.NIL == var56) {
                    var56 = f20981(var50, var22, var31, (SubLObject)module0309.$ic20$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56)) && module0309.NIL == var57) {
                    var57 = f20981(var50, var22, var31, (SubLObject)module0309.$ic21$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57)) && module0309.NIL == var58) {
                    var58 = f20981(var50, var22, var31, (SubLObject)module0309.$ic20$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58)) && module0309.NIL == var59) {
                    var59 = f20981(var50, var22, var31, (SubLObject)module0309.$ic23$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58 || module0309.NIL == var59)) && module0309.NIL == var60) {
                    final SubLObject var4_70 = module0144.$g1770$.currentBinding(var51);
                    try {
                        module0144.$g1770$.bind((SubLObject)module0309.NIL, var51);
                        var60 = f20981(var50, var22, var31, (SubLObject)module0309.$ic24$);
                    }
                    finally {
                        module0144.$g1770$.rebind(var4_70, var51);
                    }
                }
            }
            finally {
                module0144.$g1826$.rebind(var66, var51);
                module0147.$g2096$.rebind(var65, var51);
                module0147.$g2094$.rebind(var64, var51);
                module0147.$g2095$.rebind(var63, var51);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != var52 && module0309.NIL != var53 && module0309.NIL != var54 && module0309.NIL != var55 && module0309.NIL != var56 && module0309.NIL != var57 && module0309.NIL != var58 && module0309.NIL != var59 && module0309.NIL != var60);
    }
    
    public static SubLObject f20983(final SubLObject var50, final SubLObject var22, final SubLObject var31, final SubLObject var2) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1749$.getDynamicValue(var51));
        SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1750$.getDynamicValue(var51));
        SubLObject var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1751$.getDynamicValue(var51));
        SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1748$.getDynamicValue(var51));
        SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1758$.getDynamicValue(var51));
        SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1760$.getDynamicValue(var51));
        SubLObject var58 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1759$.getDynamicValue(var51));
        SubLObject var59 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1780$.getDynamicValue(var51));
        SubLObject var60 = (SubLObject)module0309.T;
        SubLObject var61 = module0205.f13276(var22);
        final SubLObject var62 = (SubLObject)((module0309.NIL == module0202.f12981(var50, var31)) ? module0309.NIL : module0205.f13329(var22));
        if (module0309.NIL != module0167.f10813(var62)) {
            return f20944(var50, var62, var31, var2);
        }
        if (module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58 || module0309.NIL == var59 || module0309.NIL == var60) {
            if (!var61.isAtom()) {
                var61 = module0172.f10922(var61);
            }
            final SubLObject var63 = module0147.$g2095$.currentBinding(var51);
            final SubLObject var64 = module0147.$g2094$.currentBinding(var51);
            final SubLObject var65 = module0147.$g2096$.currentBinding(var51);
            final SubLObject var66 = module0144.$g1826$.currentBinding(var51);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var51);
                module0147.$g2094$.bind(module0147.f9546(var2), var51);
                module0147.$g2096$.bind(module0147.f9549(var2), var51);
                module0144.$g1826$.bind((SubLObject)module0309.$ic26$, var51);
                if (module0309.NIL == var52) {
                    if (module0309.NIL != module0226.f14982(var61, var2) || module0309.NIL != module0226.f14985(var61, var2) || module0309.NIL != module0226.f14989(var22, var2)) {
                        var52 = f20981(var50, var22, var31, (SubLObject)module0309.$ic28$);
                    }
                    else {
                        final SubLObject var4_75 = module0144.$g1750$.currentBinding(var51);
                        final SubLObject var5_76 = module0144.$g1748$.currentBinding(var51);
                        final SubLObject var6_77 = module0144.$g1769$.currentBinding(var51);
                        try {
                            module0144.$g1750$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1748$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1769$.bind((SubLObject)module0309.NIL, var51);
                            var52 = f20979(var50, var22, var31, (SubLObject)module0309.UNPROVIDED);
                        }
                        finally {
                            module0144.$g1769$.rebind(var6_77, var51);
                            module0144.$g1748$.rebind(var5_76, var51);
                            module0144.$g1750$.rebind(var4_75, var51);
                        }
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52)) && module0309.NIL == var53) {
                    if (module0309.NIL != module0226.f14991(var61, var2) || module0309.NIL != module0226.f14994(var61, var2)) {
                        var53 = f20981(var50, var22, var31, (SubLObject)module0309.$ic29$);
                    }
                    else {
                        final SubLObject var4_76 = module0144.$g1749$.currentBinding(var51);
                        final SubLObject var5_77 = module0144.$g1748$.currentBinding(var51);
                        final SubLObject var6_78 = module0144.$g1769$.currentBinding(var51);
                        try {
                            module0144.$g1749$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1748$.bind((SubLObject)module0309.NIL, var51);
                            module0144.$g1769$.bind((SubLObject)module0309.NIL, var51);
                            var53 = f20979(var50, var22, var31, (SubLObject)module0309.UNPROVIDED);
                        }
                        finally {
                            module0144.$g1769$.rebind(var6_78, var51);
                            module0144.$g1748$.rebind(var5_77, var51);
                            module0144.$g1749$.rebind(var4_76, var51);
                        }
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53)) && module0309.NIL == var54) {
                    var54 = f20981(var50, var22, var31, (SubLObject)module0309.$ic17$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54)) && module0309.NIL == var55) {
                    if (module0309.NIL != module0226.f14997(var61, (SubLObject)module0309.UNPROVIDED) || module0309.NIL != module0226.f14999(var61, (SubLObject)module0309.UNPROVIDED) || module0309.NIL != module0226.f15001(var22, var2)) {
                        var55 = f20981(var50, var22, var31, (SubLObject)module0309.$ic19$);
                    }
                    else if (module0309.NIL != module0205.f13215((SubLObject)module0309.$ic27$, var22, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                        var55 = (SubLObject)module0309.T;
                    }
                    else {
                        final SubLObject var67 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0256.f16596(var62, module0309.$ic30$, var2, (SubLObject)module0309.UNPROVIDED) || module0309.NIL != module0259.f16854(var61, module0309.$ic31$, var2, (SubLObject)module0309.UNPROVIDED));
                        final SubLObject var68 = module0139.f9008();
                        final SubLObject var4_77 = module0139.$g1630$.currentBinding(var51);
                        final SubLObject var5_78 = module0139.$g1659$.currentBinding(var51);
                        try {
                            module0139.$g1630$.bind((SubLObject)module0309.NIL, var51);
                            module0139.$g1659$.bind(module0139.f9007(), var51);
                            final SubLObject var4_78 = module0144.$g1856$.currentBinding(var51);
                            final SubLObject var5_79 = module0139.$g1630$.currentBinding(var51);
                            try {
                                module0144.$g1856$.bind(module0139.$g1659$.getDynamicValue(var51), var51);
                                module0139.$g1630$.bind(var68, var51);
                                if (module0309.NIL != var67) {
                                    module0251.f16238(module0309.$ic32$, (SubLObject)module0309.UNPROVIDED);
                                }
                                final SubLObject var4_79 = module0144.$g1826$.currentBinding(var51);
                                try {
                                    module0144.$g1826$.bind((SubLObject)module0309.$ic33$, var51);
                                    var55 = f20981(var50, var22, var31, (SubLObject)module0309.$ic19$);
                                }
                                finally {
                                    module0144.$g1826$.rebind(var4_79, var51);
                                }
                            }
                            finally {
                                module0139.$g1630$.rebind(var5_79, var51);
                                module0144.$g1856$.rebind(var4_78, var51);
                            }
                            module0139.f9011(module0139.$g1659$.getDynamicValue(var51));
                        }
                        finally {
                            module0139.$g1659$.rebind(var5_78, var51);
                            module0139.$g1630$.rebind(var4_77, var51);
                        }
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55)) && module0309.NIL == var56) {
                    var56 = f20981(var50, var22, var31, (SubLObject)module0309.$ic20$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56)) && module0309.NIL == var57) {
                    var57 = f20981(var50, var22, var31, (SubLObject)module0309.$ic21$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57)) && module0309.NIL == var58) {
                    var58 = f20981(var50, var22, var31, (SubLObject)module0309.$ic22$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58)) && module0309.NIL == var59) {
                    var59 = f20981(var50, var22, var31, (SubLObject)module0309.$ic23$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58 || module0309.NIL == var59)) && module0309.NIL == var60) {
                    final SubLObject var4_80 = module0144.$g1770$.currentBinding(var51);
                    try {
                        module0144.$g1770$.bind((SubLObject)module0309.NIL, var51);
                        var60 = f20981(var50, var22, var31, (SubLObject)module0309.$ic24$);
                    }
                    finally {
                        module0144.$g1770$.rebind(var4_80, var51);
                    }
                }
            }
            finally {
                module0144.$g1826$.rebind(var66, var51);
                module0147.$g2096$.rebind(var65, var51);
                module0147.$g2094$.rebind(var64, var51);
                module0147.$g2095$.rebind(var63, var51);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != var52 && module0309.NIL != var53 && module0309.NIL != var54 && module0309.NIL != var55 && module0309.NIL != var56 && module0309.NIL != var57 && module0309.NIL != var58 && module0309.NIL != var59 && module0309.NIL != var60);
    }
    
    public static SubLObject f20978(SubLObject var50, SubLObject var22, SubLObject var31, SubLObject var2) {
        if (var50 == module0309.UNPROVIDED) {
            var50 = module0144.$g1831$.getDynamicValue();
        }
        if (var22 == module0309.UNPROVIDED) {
            var22 = module0144.$g1832$.getDynamicValue();
        }
        if (var31 == module0309.UNPROVIDED) {
            var31 = module0144.$g1833$.getDynamicValue();
        }
        if (var2 == module0309.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1749$.getDynamicValue(var51));
        SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1750$.getDynamicValue(var51));
        SubLObject var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1751$.getDynamicValue(var51));
        SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1748$.getDynamicValue(var51));
        SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1758$.getDynamicValue(var51));
        SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1760$.getDynamicValue(var51));
        SubLObject var58 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1759$.getDynamicValue(var51));
        SubLObject var59 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1769$.getDynamicValue(var51));
        SubLObject var60 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1780$.getDynamicValue(var51));
        if (module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58 || module0309.NIL == var59 || module0309.NIL == var60) {
            final SubLObject var61 = var2;
            final SubLObject var62 = module0147.$g2095$.currentBinding(var51);
            final SubLObject var63 = module0147.$g2094$.currentBinding(var51);
            final SubLObject var64 = module0147.$g2096$.currentBinding(var51);
            final SubLObject var65 = module0144.$g1826$.currentBinding(var51);
            try {
                module0147.$g2095$.bind(module0147.f9545(var61), var51);
                module0147.$g2094$.bind(module0147.f9546(var61), var51);
                module0147.$g2096$.bind(module0147.f9549(var61), var51);
                module0144.$g1826$.bind((SubLObject)module0309.$ic34$, var51);
                if (module0309.NIL == var52) {
                    var52 = f20981(var50, var22, var31, (SubLObject)module0309.$ic28$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52)) && module0309.NIL == var53) {
                    var53 = f20981(var50, var22, var31, (SubLObject)module0309.$ic29$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53)) && module0309.NIL == var54) {
                    var54 = f20981(var50, var22, var31, (SubLObject)module0309.$ic17$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54)) && module0309.NIL == var55) {
                    var55 = f20981(var50, var22, var31, (SubLObject)module0309.$ic19$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55)) && module0309.NIL == var56) {
                    var56 = f20981(var50, var22, var31, (SubLObject)module0309.$ic20$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56)) && module0309.NIL == var57) {
                    var57 = f20981(var50, var22, var31, (SubLObject)module0309.$ic21$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57)) && module0309.NIL == var58) {
                    var58 = f20981(var50, var22, var31, (SubLObject)module0309.$ic22$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var58 || module0309.NIL == var57)) && module0309.NIL == var59) {
                    var59 = f20981(var50, var22, var31, (SubLObject)module0309.$ic24$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var58 || module0309.NIL == var57 || module0309.NIL == var59)) && module0309.NIL == var60) {
                    var60 = f20981(var50, var22, var31, (SubLObject)module0309.$ic23$);
                }
            }
            finally {
                module0144.$g1826$.rebind(var65, var51);
                module0147.$g2096$.rebind(var64, var51);
                module0147.$g2094$.rebind(var63, var51);
                module0147.$g2095$.rebind(var62, var51);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != var52 && module0309.NIL != var53 && module0309.NIL != var54 && module0309.NIL != var55 && module0309.NIL != var56 && module0309.NIL != var58 && module0309.NIL != var57 && module0309.NIL != var59 && module0309.NIL != var60 && (module0309.NIL == module0144.$g1772$.getDynamicValue(var51) || module0309.NIL != f20968(var50, var22, var31, var2)));
    }
    
    public static SubLObject f20979(SubLObject var50, SubLObject var22, SubLObject var31, SubLObject var2) {
        if (var50 == module0309.UNPROVIDED) {
            var50 = module0144.$g1831$.getDynamicValue();
        }
        if (var22 == module0309.UNPROVIDED) {
            var22 = module0144.$g1832$.getDynamicValue();
        }
        if (var31 == module0309.UNPROVIDED) {
            var31 = module0144.$g1833$.getDynamicValue();
        }
        if (var2 == module0309.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var51 = SubLProcess.currentSubLThread();
        SubLObject var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1749$.getDynamicValue(var51));
        SubLObject var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1750$.getDynamicValue(var51));
        SubLObject var54 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1751$.getDynamicValue(var51));
        SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1748$.getDynamicValue(var51));
        SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1758$.getDynamicValue(var51));
        SubLObject var57 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1760$.getDynamicValue(var51));
        SubLObject var58 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1759$.getDynamicValue(var51));
        SubLObject var59 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1769$.getDynamicValue(var51));
        SubLObject var60 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1780$.getDynamicValue(var51));
        if (module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57 || module0309.NIL == var58 || module0309.NIL == var59 || module0309.NIL == var60) {
            final SubLObject var61 = var2;
            final SubLObject var62 = module0147.$g2095$.currentBinding(var51);
            final SubLObject var63 = module0147.$g2094$.currentBinding(var51);
            final SubLObject var64 = module0147.$g2096$.currentBinding(var51);
            final SubLObject var65 = module0144.$g1826$.currentBinding(var51);
            try {
                module0147.$g2095$.bind(module0147.f9545(var61), var51);
                module0147.$g2094$.bind(module0147.f9546(var61), var51);
                module0147.$g2096$.bind(module0147.f9549(var61), var51);
                module0144.$g1826$.bind((SubLObject)module0309.$ic33$, var51);
                if (module0309.NIL == var52) {
                    var52 = f20981(var50, var22, var31, (SubLObject)module0309.$ic28$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52)) && module0309.NIL == var53) {
                    var53 = f20981(var50, var22, var31, (SubLObject)module0309.$ic29$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53)) && module0309.NIL == var54) {
                    var54 = f20981(var50, var22, var31, (SubLObject)module0309.$ic17$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54)) && module0309.NIL == var55) {
                    final SubLObject var66 = module0139.f9008();
                    final SubLObject var4_89 = module0139.$g1630$.currentBinding(var51);
                    final SubLObject var5_90 = module0139.$g1659$.currentBinding(var51);
                    try {
                        module0139.$g1630$.bind((SubLObject)module0309.NIL, var51);
                        module0139.$g1659$.bind(module0139.f9007(), var51);
                        final SubLObject var4_90 = module0144.$g1856$.currentBinding(var51);
                        final SubLObject var5_91 = module0139.$g1630$.currentBinding(var51);
                        try {
                            module0144.$g1856$.bind(module0139.$g1659$.getDynamicValue(var51), var51);
                            module0139.$g1630$.bind(var66, var51);
                            var55 = f20981(var50, var22, var31, (SubLObject)module0309.$ic19$);
                        }
                        finally {
                            module0139.$g1630$.rebind(var5_91, var51);
                            module0144.$g1856$.rebind(var4_90, var51);
                        }
                        module0139.f9011(module0139.$g1659$.getDynamicValue(var51));
                    }
                    finally {
                        module0139.$g1659$.rebind(var5_90, var51);
                        module0139.$g1630$.rebind(var4_89, var51);
                    }
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55)) && module0309.NIL == var56) {
                    var56 = f20981(var50, var22, var31, (SubLObject)module0309.$ic20$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56)) && module0309.NIL == var57) {
                    var57 = f20981(var50, var22, var31, (SubLObject)module0309.$ic21$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var57)) && module0309.NIL == var58) {
                    var58 = f20981(var50, var22, var31, (SubLObject)module0309.$ic22$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var55 || module0309.NIL == var58)) && module0309.NIL == var59) {
                    var59 = f20981(var50, var22, var31, (SubLObject)module0309.$ic24$);
                }
                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var52 || module0309.NIL == var53 || module0309.NIL == var54 || module0309.NIL == var55 || module0309.NIL == var56 || module0309.NIL == var55 || module0309.NIL == var58 || module0309.NIL == var59)) && module0309.NIL == var60) {
                    var60 = f20981(var50, var22, var31, (SubLObject)module0309.$ic23$);
                }
            }
            finally {
                module0144.$g1826$.rebind(var65, var51);
                module0147.$g2096$.rebind(var64, var51);
                module0147.$g2094$.rebind(var63, var51);
                module0147.$g2095$.rebind(var62, var51);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != var52 && module0309.NIL != var53 && module0309.NIL != var54 && module0309.NIL != var55 && module0309.NIL != var56 && module0309.NIL != var55 && module0309.NIL != var58 && module0309.NIL != var59 && module0309.NIL != var60);
    }
    
    public static SubLObject f20984(SubLObject var50, SubLObject var93, SubLObject var31, SubLObject var2) {
        if (var50 == module0309.UNPROVIDED) {
            var50 = module0144.$g1831$.getDynamicValue();
        }
        if (var93 == module0309.UNPROVIDED) {
            var93 = module0144.$g1832$.getDynamicValue();
        }
        if (var31 == module0309.UNPROVIDED) {
            var31 = module0144.$g1833$.getDynamicValue();
        }
        if (var2 == module0309.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1749$.getDynamicValue(var94));
        SubLObject var96 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1750$.getDynamicValue(var94));
        SubLObject var97 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0144.$g1748$.getDynamicValue(var94));
        if (module0309.NIL == var95 || module0309.NIL == var96 || module0309.NIL == var97) {
            final SubLObject var98 = var2;
            final SubLObject var99 = module0147.$g2095$.currentBinding(var94);
            final SubLObject var100 = module0147.$g2094$.currentBinding(var94);
            final SubLObject var101 = module0147.$g2096$.currentBinding(var94);
            try {
                module0147.$g2095$.bind(module0147.f9545(var98), var94);
                module0147.$g2094$.bind(module0147.f9546(var98), var94);
                module0147.$g2096$.bind(module0147.f9549(var98), var94);
                final SubLObject var102 = (SubLObject)((module0309.NIL != module0173.f10955(var50)) ? SubLObjectFactory.makeBoolean(module0309.NIL != module0260.f17006(var50, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED) || module0309.NIL != module0260.f17008(var50, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) : module0309.NIL);
                final SubLObject var4_95 = module0144.$g1831$.currentBinding(var94);
                final SubLObject var5_96 = module0144.$g1843$.currentBinding(var94);
                final SubLObject var6_97 = module0144.$g1844$.currentBinding(var94);
                final SubLObject var103 = module0144.$g1832$.currentBinding(var94);
                try {
                    module0144.$g1831$.bind(var50, var94);
                    module0144.$g1843$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0144.$g1781$.getDynamicValue(var94) && module0309.NIL != var102), var94);
                    module0144.$g1844$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0144.$g1782$.getDynamicValue(var94) && module0309.NIL != var102), var94);
                    module0144.$g1832$.bind(var93, var94);
                    assert module0309.NIL != Types.integerp(var31) : var31;
                    final SubLObject var4_96 = module0144.$g1833$.currentBinding(var94);
                    final SubLObject var5_97 = module0144.$g1881$.currentBinding(var94);
                    final SubLObject var6_98 = module0144.$g1882$.currentBinding(var94);
                    final SubLObject var7_101 = module0144.$g1879$.currentBinding(var94);
                    final SubLObject var104 = module0144.$g1880$.currentBinding(var94);
                    try {
                        module0144.$g1833$.bind(var31, var94);
                        module0144.$g1881$.bind(module0149.f9622(), var94);
                        module0144.$g1882$.bind(module0149.f9623(), var94);
                        module0144.$g1879$.bind(module0149.f9624(), var94);
                        module0144.$g1880$.bind(module0149.f9625(), var94);
                        try {
                            final SubLObject var4_97 = module0144.$g1826$.currentBinding(var94);
                            try {
                                module0144.$g1826$.bind((SubLObject)module0309.$ic34$, var94);
                                if (module0309.NIL == var95) {
                                    final SubLObject var105 = module0139.f9008();
                                    final SubLObject var4_98 = module0139.$g1630$.currentBinding(var94);
                                    final SubLObject var5_98 = module0139.$g1659$.currentBinding(var94);
                                    try {
                                        module0139.$g1630$.bind((SubLObject)module0309.NIL, var94);
                                        module0139.$g1659$.bind(module0139.f9007(), var94);
                                        final SubLObject var4_99 = module0144.$g1855$.currentBinding(var94);
                                        final SubLObject var5_99 = module0139.$g1630$.currentBinding(var94);
                                        try {
                                            module0144.$g1855$.bind(module0139.$g1659$.getDynamicValue(var94), var94);
                                            module0139.$g1630$.bind(var105, var94);
                                            module0251.f16232(module0137.f8955(module0309.$ic36$), var93, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                                            var95 = f20981(var50, var93, var31, (SubLObject)module0309.$ic28$);
                                        }
                                        finally {
                                            module0139.$g1630$.rebind(var5_99, var94);
                                            module0144.$g1855$.rebind(var4_99, var94);
                                        }
                                        module0139.f9011(module0139.$g1659$.getDynamicValue(var94));
                                    }
                                    finally {
                                        module0139.$g1659$.rebind(var5_98, var94);
                                        module0139.$g1630$.rebind(var4_98, var94);
                                    }
                                }
                                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var95)) && module0309.NIL == var96) {
                                    var96 = f20981(var50, var93, var31, (SubLObject)module0309.$ic29$);
                                }
                                if (module0309.NIL == module0303.f20199((SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var95 || module0309.NIL == var96)) && module0309.NIL == var97) {
                                    final SubLObject var106 = module0269.f17705(var93);
                                    final SubLObject var107 = module0139.f9008();
                                    final SubLObject var4_100 = module0139.$g1630$.currentBinding(var94);
                                    final SubLObject var5_100 = module0139.$g1659$.currentBinding(var94);
                                    try {
                                        module0139.$g1630$.bind((SubLObject)module0309.NIL, var94);
                                        module0139.$g1659$.bind(module0139.f9007(), var94);
                                        final SubLObject var4_101 = module0144.$g1856$.currentBinding(var94);
                                        final SubLObject var5_101 = module0139.$g1630$.currentBinding(var94);
                                        try {
                                            module0144.$g1856$.bind(module0139.$g1659$.getDynamicValue(var94), var94);
                                            module0139.$g1630$.bind(var107, var94);
                                            if (module0309.NIL != var106) {
                                                module0251.f16232(module0137.f8955(module0309.$ic36$), var93, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                                            }
                                            var97 = f20981(var50, var93, var31, (SubLObject)module0309.$ic19$);
                                        }
                                        finally {
                                            module0139.$g1630$.rebind(var5_101, var94);
                                            module0144.$g1856$.rebind(var4_101, var94);
                                        }
                                        module0139.f9011(module0139.$g1659$.getDynamicValue(var94));
                                    }
                                    finally {
                                        module0139.$g1659$.rebind(var5_100, var94);
                                        module0139.$g1630$.rebind(var4_100, var94);
                                    }
                                }
                            }
                            finally {
                                module0144.$g1826$.rebind(var4_97, var94);
                            }
                        }
                        finally {
                            final SubLObject var4_102 = Threads.$is_thread_performing_cleanupP$.currentBinding(var94);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var94);
                                module0305.f20348();
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var4_102, var94);
                            }
                        }
                    }
                    finally {
                        module0144.$g1880$.rebind(var104, var94);
                        module0144.$g1879$.rebind(var7_101, var94);
                        module0144.$g1882$.rebind(var6_98, var94);
                        module0144.$g1881$.rebind(var5_97, var94);
                        module0144.$g1833$.rebind(var4_96, var94);
                    }
                }
                finally {
                    module0144.$g1832$.rebind(var103, var94);
                    module0144.$g1844$.rebind(var6_97, var94);
                    module0144.$g1843$.rebind(var5_96, var94);
                    module0144.$g1831$.rebind(var4_95, var94);
                }
            }
            finally {
                module0147.$g2096$.rebind(var101, var94);
                module0147.$g2094$.rebind(var100, var94);
                module0147.$g2095$.rebind(var99, var94);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != var95 && module0309.NIL != var96 && module0309.NIL != var97);
    }
    
    public static SubLObject f20981(final SubLObject var50, final SubLObject var22, final SubLObject var31, SubLObject var112) {
        if (var112 == module0309.UNPROVIDED) {
            var112 = (SubLObject)module0309.$ic28$;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        SubLObject var114 = (SubLObject)module0309.NIL;
        if (var50.eql(module0309.$ic37$)) {
            final SubLObject var115 = module0206.$g2330$.currentBinding(var113);
            try {
                module0206.$g2330$.bind((SubLObject)module0309.T, var113);
                if (module0309.$ic33$ != module0144.$g1826$.getDynamicValue(var113) || module0309.NIL == module0144.$g1809$.getDynamicValue(var113) || module0309.NIL == module0152.f9726() || module0309.NIL == module0278.f18430(var22, (SubLObject)module0309.UNPROVIDED)) {
                    if (module0309.NIL != module0004.f104(var112, (SubLObject)module0309.$ic38$, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                        if (module0309.NIL != module0144.$g1755$.getDynamicValue(var113)) {
                            var114 = f20985(var50, var22, var31, var112);
                        }
                    }
                    else if (module0309.NIL != module0144.$g1756$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic17$)) {
                        var114 = f20985(var50, var22, var31, var112);
                    }
                    else if (module0309.NIL != module0144.$g1757$.getDynamicValue(var113) && module0309.NIL != module0004.f104(var112, (SubLObject)module0309.$ic39$, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                        var114 = f20985(var50, var22, var31, var112);
                    }
                    else if (module0309.NIL != module0144.$g1758$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic20$)) {
                        var114 = f20985(var50, var22, var31, var112);
                    }
                    else if (module0309.NIL != module0144.$g1760$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic21$)) {
                        var114 = f20985(var50, var22, var31, var112);
                    }
                    else if (module0309.NIL != module0144.$g1759$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic22$)) {
                        var114 = f20985(var50, var22, var31, var112);
                    }
                    else if (module0309.NIL != module0144.$g1779$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic24$)) {
                        f20986();
                        var114 = f20985(var50, var22, var31, var112);
                    }
                    else if (module0309.NIL != module0144.$g1780$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic23$)) {
                        var114 = f20985(var50, var22, var31, var112);
                    }
                    if (module0309.NIL == module0303.f20199(var114)) {
                        var114 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20987(var50, var22, var31, var112) || module0309.NIL != var114);
                    }
                }
            }
            finally {
                module0206.$g2330$.rebind(var115, var113);
            }
        }
        else if (module0309.$ic33$ != module0144.$g1826$.getDynamicValue(var113) || module0309.NIL == module0144.$g1809$.getDynamicValue(var113) || module0309.NIL == module0152.f9726() || module0309.NIL == module0278.f18430(var22, (SubLObject)module0309.UNPROVIDED)) {
            if (module0309.NIL != module0004.f104(var112, (SubLObject)module0309.$ic38$, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                if (module0309.NIL != module0144.$g1755$.getDynamicValue(var113)) {
                    var114 = f20985(var50, var22, var31, var112);
                }
            }
            else if (module0309.NIL != module0144.$g1756$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic17$)) {
                var114 = f20985(var50, var22, var31, var112);
            }
            else if (module0309.NIL != module0144.$g1757$.getDynamicValue(var113) && module0309.NIL != module0004.f104(var112, (SubLObject)module0309.$ic39$, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                var114 = f20985(var50, var22, var31, var112);
            }
            else if (module0309.NIL != module0144.$g1758$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic20$)) {
                var114 = f20985(var50, var22, var31, var112);
            }
            else if (module0309.NIL != module0144.$g1760$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic21$)) {
                var114 = f20985(var50, var22, var31, var112);
            }
            else if (module0309.NIL != module0144.$g1759$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic22$)) {
                var114 = f20985(var50, var22, var31, var112);
            }
            else if (module0309.NIL != module0144.$g1779$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic24$)) {
                f20986();
                var114 = f20985(var50, var22, var31, var112);
            }
            else if (module0309.NIL != module0144.$g1780$.getDynamicValue(var113) && var112.eql((SubLObject)module0309.$ic23$)) {
                var114 = f20985(var50, var22, var31, var112);
            }
            if (module0309.NIL == module0303.f20199(var114)) {
                var114 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20987(var50, var22, var31, var112) || module0309.NIL != var114);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var114);
    }
    
    public static SubLObject f20985(final SubLObject var50, final SubLObject var22, final SubLObject var31, SubLObject var112) {
        if (var112 == module0309.UNPROVIDED) {
            var112 = (SubLObject)module0309.$ic28$;
        }
        final SubLThread var113 = SubLProcess.currentSubLThread();
        SubLObject var114 = (SubLObject)module0309.ZERO_INTEGER;
        SubLObject var115 = (SubLObject)module0309.NIL;
        SubLObject var116 = (SubLObject)module0309.NIL;
        if (module0309.NIL == var116) {
            SubLObject var117 = module0205.f13207(module0144.$g1828$.getDynamicValue(var113), (SubLObject)module0309.UNPROVIDED);
            SubLObject var118 = (SubLObject)module0309.NIL;
            var118 = var117.first();
            while (module0309.NIL == var116 && module0309.NIL != var117) {
                var114 = Numbers.add(var114, (SubLObject)module0309.ONE_INTEGER);
                if (!var31.eql(var114)) {
                    var115 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20988(var50, var118, var114, var22, var31, var112) || module0309.NIL != var115);
                    var116 = module0303.f20199(var115);
                }
                var117 = var117.rest();
                var118 = var117.first();
            }
        }
        return var115;
    }
    
    public static SubLObject f20987(final SubLObject var50, final SubLObject var22, final SubLObject var31, final SubLObject var112) {
        if (var112.eql((SubLObject)module0309.$ic28$)) {
            return module0302.f20034(var50, var22, var31);
        }
        if (var112.eql((SubLObject)module0309.$ic17$)) {
            return module0302.f20042(var50, var22, var31);
        }
        if (var112.eql((SubLObject)module0309.$ic29$)) {
            return module0302.f20051(var50, var22, var31);
        }
        if (var112.eql((SubLObject)module0309.$ic19$)) {
            return module0302.f20056(var50, var22, var31);
        }
        if (var112.eql((SubLObject)module0309.$ic15$)) {
            return module0302.f20047(var50, var22, var31);
        }
        if (var112.eql((SubLObject)module0309.$ic16$)) {
            return module0302.f20054(var50, var22, var31);
        }
        if (var112.eql((SubLObject)module0309.$ic18$)) {
            return module0302.f20059(var50, var22, var31);
        }
        if (var112.eql((SubLObject)module0309.$ic24$)) {
            return module0302.f20061(var50, var22, var31);
        }
        if (var112.eql((SubLObject)module0309.$ic23$)) {
            return (SubLObject)module0309.NIL;
        }
        module0202.f12747((SubLObject)module0309.THREE_INTEGER, (SubLObject)module0309.$ic40$, var112, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20988(final SubLObject var50, final SubLObject var115, final SubLObject var114, final SubLObject var116, final SubLObject var117, final SubLObject var112) {
        if (var112.eql((SubLObject)module0309.$ic28$)) {
            return module0302.f20063(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic17$)) {
            return module0302.f20071(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic15$)) {
            return module0302.f20079(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic19$)) {
            return module0302.f20069(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic20$)) {
            return module0302.f20073(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic18$)) {
            return module0302.f20081(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic21$)) {
            return module0302.f20075(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic22$)) {
            return module0302.f20077(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic24$)) {
            return module0302.f20083(var50, var115, var114, var116, var117);
        }
        if (var112.eql((SubLObject)module0309.$ic23$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var114.numG(var117) && module0309.NIL != module0302.f20087(var50, var115, var114, var116, var117));
        }
        module0202.f12747((SubLObject)module0309.THREE_INTEGER, (SubLObject)module0309.$ic41$, var112, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20934(final SubLObject var118, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (module0309.NIL == module0173.f10955(var118) || module0309.NIL == module0144.f9454()) {
            return (SubLObject)module0309.T;
        }
        if (module0309.NIL != module0151.f9690()) {
            return f20989(var118, var2);
        }
        return f20990(var118, var2);
    }
    
    public static SubLObject f20991(final SubLObject var118, final SubLObject var2) {
        return f20990(var118, var2);
    }
    
    public static SubLObject f20989(final SubLObject var118, final SubLObject var2) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        final SubLObject var120 = module0034.$g879$.getDynamicValue(var119);
        SubLObject var121 = (SubLObject)module0309.NIL;
        if (module0309.NIL == var120) {
            return f20991(var118, var2);
        }
        var121 = module0034.f1857(var120, (SubLObject)module0309.$ic42$, (SubLObject)module0309.UNPROVIDED);
        if (module0309.NIL == var121) {
            var121 = module0034.f1807(module0034.f1842(var120), (SubLObject)module0309.$ic42$, (SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.NIL, (SubLObject)module0309.EQUAL, (SubLObject)module0309.UNPROVIDED);
            module0034.f1860(var120, (SubLObject)module0309.$ic42$, var121);
        }
        final SubLObject var122 = module0034.f1782(var118, var2);
        final SubLObject var123 = module0034.f1814(var121, var122, (SubLObject)module0309.UNPROVIDED);
        if (var123 != module0309.$ic7$) {
            SubLObject var124 = var123;
            SubLObject var125 = (SubLObject)module0309.NIL;
            var125 = var124.first();
            while (module0309.NIL != var124) {
                SubLObject var126 = var125.first();
                final SubLObject var127 = conses_high.second(var125);
                if (var118.equal(var126.first())) {
                    var126 = var126.rest();
                    if (module0309.NIL != var126 && module0309.NIL == var126.rest() && var2.equal(var126.first())) {
                        return module0034.f1959(var127);
                    }
                }
                var124 = var124.rest();
                var125 = var124.first();
            }
        }
        final SubLObject var128 = Values.arg2(var119.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f20991(var118, var2)));
        module0034.f1836(var121, var122, var123, var128, (SubLObject)ConsesLow.list(var118, var2));
        return module0034.f1959(var128);
    }
    
    public static SubLObject f20990(final SubLObject var118, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)module0309.T;
        final SubLObject var121 = (SubLObject)((module0309.NIL != module0144.$g1754$.getDynamicValue(var119)) ? ConsesLow.list(module0226.f15152(var118)) : module0309.NIL);
        if (module0309.NIL != var121 && module0309.NIL == module0262.f17342(var2, var121, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
            var120 = (SubLObject)module0309.NIL;
            if (module0309.NIL != module0144.$g1796$.getDynamicValue(var119)) {
                module0303.f20257((SubLObject)module0309.THREE_INTEGER, (SubLObject)module0309.$ic43$, var118, var2, var121, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                if (module0309.NIL != module0144.$g1794$.getDynamicValue(var119)) {
                    module0303.f20193((SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.$ic43$, var118, var2, var121, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                }
                module0303.f20203((SubLObject)ConsesLow.list((SubLObject)module0309.$ic44$, var118, var2, var121));
            }
        }
        return var120;
    }
    
    public static SubLObject f20935(final SubLObject var12, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var13 = SubLProcess.currentSubLThread();
        final SubLObject var14 = module0205.f13132(var12);
        SubLObject var15 = (SubLObject)module0309.T;
        if (module0309.NIL != module0144.$g1771$.getDynamicValue(var13)) {
            if (module0309.NIL != module0173.f10955(var14)) {
                if (module0309.NIL != module0210.f13568(var14)) {
                    var15 = f20992(var12, var2);
                }
            }
        }
        return var15;
    }
    
    public static SubLObject f20992(final SubLObject var10, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        SubLObject var12 = (SubLObject)module0309.T;
        final SubLObject var13 = module0202.f12832(var10, (SubLObject)module0309.UNPROVIDED);
        SubLObject var14 = (SubLObject)module0309.NIL;
        if (module0309.NIL == var14) {
            SubLObject var15 = module0144.$g1773$.getDynamicValue(var11);
            final SubLObject var16 = module0144.$g1824$.currentBinding(var11);
            try {
                module0144.$g1824$.bind((SubLObject)module0309.NIL, var11);
                module0144.$g1824$.setDynamicValue(var15.first(), var11);
                while (module0309.NIL == var14 && module0309.NIL != var15) {
                    final SubLObject var17 = module0144.$g1824$.getDynamicValue(var11);
                    if (var17.eql((SubLObject)module0309.$ic45$)) {
                        if (module0309.NIL != module0226.f14798(var13)) {
                            final SubLObject var4_127 = module0144.$g1789$.currentBinding(var11);
                            final SubLObject var18 = module0144.$g1774$.currentBinding(var11);
                            try {
                                module0144.$g1789$.bind((SubLObject)module0309.T, var11);
                                module0144.$g1774$.bind((SubLObject)module0309.NIL, var11);
                                var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20993(var10, var2) && module0309.NIL != var12);
                            }
                            finally {
                                module0144.$g1774$.rebind(var18, var11);
                                module0144.$g1789$.rebind(var4_127, var11);
                            }
                        }
                    }
                    else if (var17.eql((SubLObject)module0309.$ic46$)) {
                        if (module0309.NIL != module0226.f14799(var13)) {
                            final SubLObject var4_128 = module0144.$g1789$.currentBinding(var11);
                            final SubLObject var18 = module0144.$g1774$.currentBinding(var11);
                            try {
                                module0144.$g1789$.bind((SubLObject)module0309.T, var11);
                                module0144.$g1774$.bind((SubLObject)module0309.NIL, var11);
                                var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20994(var10, var2) && module0309.NIL != var12);
                            }
                            finally {
                                module0144.$g1774$.rebind(var18, var11);
                                module0144.$g1789$.rebind(var4_128, var11);
                            }
                        }
                    }
                    else if (var17.eql((SubLObject)module0309.$ic47$)) {
                        if (module0309.NIL != module0226.f14796(var13)) {
                            final SubLObject var4_129 = module0144.$g1789$.currentBinding(var11);
                            final SubLObject var18 = module0144.$g1774$.currentBinding(var11);
                            try {
                                module0144.$g1789$.bind((SubLObject)module0309.T, var11);
                                module0144.$g1774$.bind((SubLObject)module0309.NIL, var11);
                                var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20995(var10, var2) && module0309.NIL != var12);
                            }
                            finally {
                                module0144.$g1774$.rebind(var18, var11);
                                module0144.$g1789$.rebind(var4_129, var11);
                            }
                        }
                    }
                    else if (var17.eql((SubLObject)module0309.$ic48$)) {
                        if (module0309.NIL != module0226.f14801(var13)) {
                            final SubLObject var4_130 = module0144.$g1789$.currentBinding(var11);
                            final SubLObject var18 = module0144.$g1774$.currentBinding(var11);
                            try {
                                module0144.$g1789$.bind((SubLObject)module0309.T, var11);
                                module0144.$g1774$.bind((SubLObject)module0309.NIL, var11);
                                var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20996(var10, var2) && module0309.NIL != var12);
                            }
                            finally {
                                module0144.$g1774$.rebind(var18, var11);
                                module0144.$g1789$.rebind(var4_130, var11);
                            }
                        }
                    }
                    else if (var17.eql((SubLObject)module0309.$ic49$)) {
                        final SubLObject var4_131 = module0144.$g1789$.currentBinding(var11);
                        final SubLObject var18 = module0144.$g1774$.currentBinding(var11);
                        try {
                            module0144.$g1789$.bind((SubLObject)module0309.T, var11);
                            module0144.$g1774$.bind((SubLObject)module0309.NIL, var11);
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20997(var10, var2) && module0309.NIL != var12);
                        }
                        finally {
                            module0144.$g1774$.rebind(var18, var11);
                            module0144.$g1789$.rebind(var4_131, var11);
                        }
                    }
                    else if (var17.eql((SubLObject)module0309.$ic50$)) {
                        final SubLObject var4_132 = module0144.$g1789$.currentBinding(var11);
                        final SubLObject var18 = module0144.$g1774$.currentBinding(var11);
                        try {
                            module0144.$g1789$.bind((SubLObject)module0309.T, var11);
                            module0144.$g1774$.bind((SubLObject)module0309.NIL, var11);
                            var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f20998(var10, var2) && module0309.NIL != var12);
                        }
                        finally {
                            module0144.$g1774$.rebind(var18, var11);
                            module0144.$g1789$.rebind(var4_132, var11);
                        }
                    }
                    else {
                        module0202.f12747((SubLObject)module0309.THREE_INTEGER, (SubLObject)module0309.$ic51$, module0144.$g1824$.getDynamicValue(var11), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                    }
                    if (module0309.NIL == var12 && module0309.NIL == module0144.$g1795$.getDynamicValue(var11)) {
                        var14 = (SubLObject)module0309.T;
                    }
                    var15 = var15.rest();
                    module0144.$g1824$.setDynamicValue(var15.first(), var11);
                }
            }
            finally {
                module0144.$g1824$.rebind(var16, var11);
            }
        }
        return var12;
    }
    
    public static SubLObject f20993(final SubLObject var133, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = f20999(var133, var2);
        if (module0309.NIL != var135) {
            final SubLObject var136 = module0144.$g1829$.currentBinding(var134);
            try {
                module0144.$g1829$.bind(module0309.$ic52$, var134);
                if (module0309.NIL != module0144.$g1829$.getDynamicValue(var134)) {
                    module0303.f20202(module0309.$ic53$);
                }
            }
            finally {
                module0144.$g1829$.rebind(var136, var134);
            }
        }
        return Types.sublisp_null(var135);
    }
    
    public static SubLObject f20999(final SubLObject var133, final SubLObject var2) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = module0205.f13326(var133, (SubLObject)module0309.ZERO_INTEGER);
        final SubLObject var136 = module0205.f13326(var133, (SubLObject)module0309.ONE_INTEGER);
        final SubLObject var137 = module0205.f13326(var133, (SubLObject)module0309.TWO_INTEGER);
        SubLObject var138 = (SubLObject)module0309.NIL;
        final SubLObject var139 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var140 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var141 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var2), var134);
            module0147.$g2094$.bind(module0147.f9546(var2), var134);
            module0147.$g2096$.bind(module0147.f9549(var2), var134);
            var138 = f21000(var135, var136, var137);
        }
        finally {
            module0147.$g2096$.rebind(var141, var134);
            module0147.$g2094$.rebind(var140, var134);
            module0147.$g2095$.rebind(var139, var134);
        }
        return var138;
    }
    
    public static SubLObject f21000(final SubLObject var135, final SubLObject var136, final SubLObject var137) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = (SubLObject)module0309.NIL;
        final SubLObject var140 = module0018.$g584$.currentBinding(var138);
        final SubLObject var141 = module0144.$g1834$.currentBinding(var138);
        final SubLObject var142 = module0144.$g1835$.currentBinding(var138);
        try {
            module0018.$g584$.bind((SubLObject)module0309.NIL, var138);
            module0144.$g1834$.bind(var136, var138);
            module0144.$g1835$.bind(var137, var138);
            final SubLObject var143 = f21001(module0202.f12768(var135, var137, var136), (SubLObject)module0309.$ic54$, (SubLObject)module0309.$ic55$);
            final SubLObject var144 = module0217.f14398(var143);
            SubLObject var145 = (SubLObject)module0309.NIL;
            try {
                var138.throwStack.push(module0309.$ic56$);
                final SubLObject var4_141 = module0144.$g1793$.currentBinding(var138);
                try {
                    module0144.$g1793$.bind((SubLObject)module0309.T, var138);
                    if (var144 == module0309.$ic57$) {
                        final SubLObject var146 = module0217.f14399(var143);
                        if (module0309.NIL != f21002(module0144.$g1828$.getDynamicValue(var138))) {
                            module0219.f14478((SubLObject)module0309.$ic58$, var146, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                        }
                    }
                    else if (var144 == module0309.$ic59$) {
                        var138.resetMultipleValues();
                        final SubLObject var147 = module0217.f14400(var143);
                        final SubLObject var148 = var138.secondMultipleValue();
                        final SubLObject var149 = var138.thirdMultipleValue();
                        var138.resetMultipleValues();
                        module0221.f14612((SubLObject)module0309.$ic58$, var147, var148, var149);
                    }
                    else {
                        Errors.cerror((SubLObject)module0309.$ic60$, (SubLObject)module0309.$ic61$);
                    }
                }
                finally {
                    module0144.$g1793$.rebind(var4_141, var138);
                }
            }
            catch (Throwable var150) {
                var145 = Errors.handleThrowable(var150, (SubLObject)module0309.$ic56$);
            }
            finally {
                var138.throwStack.pop();
            }
            var139 = module0018.$g584$.getDynamicValue(var138);
        }
        finally {
            module0144.$g1835$.rebind(var142, var138);
            module0144.$g1834$.rebind(var141, var138);
            module0018.$g584$.rebind(var140, var138);
        }
        return var139;
    }
    
    public static SubLObject f21003(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0178.f11284(var144)) {
            final SubLObject var146 = module0178.f11285(var144);
            if (module0144.$g1834$.getDynamicValue(var145).equal(module0202.f12831(var146, (SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.UNPROVIDED)) && module0144.$g1835$.getDynamicValue(var145).equal(module0202.f12831(var146, (SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.UNPROVIDED))) {
                module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0018.$g584$.getDynamicValue(var145)), var145);
                if (module0309.NIL != module0144.$g1789$.getDynamicValue(var145) && module0309.NIL == conses_high.member(var144, module0144.$g1774$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                    module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0144.$g1774$.getDynamicValue(var145)), var145);
                }
                if (module0309.NIL == module0144.$g1795$.getDynamicValue(var145)) {
                    module0303.f20201();
                }
            }
        }
        return module0018.$g584$.getDynamicValue(var145);
    }
    
    public static SubLObject f20994(final SubLObject var133, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = f21004(var133, var2);
        if (module0309.NIL != var135) {
            final SubLObject var136 = module0144.$g1829$.currentBinding(var134);
            try {
                module0144.$g1829$.bind(module0309.$ic52$, var134);
                if (module0309.NIL != module0144.$g1829$.getDynamicValue(var134)) {
                    module0303.f20202(module0309.$ic62$);
                }
            }
            finally {
                module0144.$g1829$.rebind(var136, var134);
            }
        }
        return Types.sublisp_null(var135);
    }
    
    public static SubLObject f21004(final SubLObject var133, final SubLObject var2) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = module0205.f13326(var133, (SubLObject)module0309.ZERO_INTEGER);
        final SubLObject var136 = module0205.f13326(var133, (SubLObject)module0309.ONE_INTEGER);
        final SubLObject var137 = module0205.f13326(var133, (SubLObject)module0309.TWO_INTEGER);
        SubLObject var138 = (SubLObject)module0309.NIL;
        final SubLObject var139 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var140 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var141 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var2), var134);
            module0147.$g2094$.bind(module0147.f9546(var2), var134);
            module0147.$g2096$.bind(module0147.f9549(var2), var134);
            if (module0309.NIL == module0331.f22370(var136, var137, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                var138 = f21000(var135, var136, var137);
            }
        }
        finally {
            module0147.$g2096$.rebind(var141, var134);
            module0147.$g2094$.rebind(var140, var134);
            module0147.$g2095$.rebind(var139, var134);
        }
        return var138;
    }
    
    public static SubLObject f20995(final SubLObject var133, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)module0309.T;
        final SubLObject var136 = module0205.f13326(var133, (SubLObject)module0309.ONE_INTEGER);
        final SubLObject var137 = module0205.f13326(var133, (SubLObject)module0309.TWO_INTEGER);
        final SubLObject var138 = var2;
        final SubLObject var139 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var140 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var141 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var138), var134);
            module0147.$g2094$.bind(module0147.f9546(var138), var134);
            module0147.$g2096$.bind(module0147.f9549(var138), var134);
            if (module0309.NIL != module0331.f22370(var136, var137, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                var135 = (SubLObject)module0309.NIL;
                final SubLObject var4_146 = module0144.$g1829$.currentBinding(var134);
                try {
                    module0144.$g1829$.bind(module0309.$ic52$, var134);
                    if (module0309.NIL != module0144.$g1829$.getDynamicValue(var134)) {
                        module0303.f20202(module0309.$ic63$);
                    }
                }
                finally {
                    module0144.$g1829$.rebind(var4_146, var134);
                }
            }
            if (module0309.NIL != var135 || module0309.NIL != module0144.$g1795$.getDynamicValue(var134)) {
                final SubLObject var142 = module0205.f13326(var133, (SubLObject)module0309.ZERO_INTEGER);
                if (module0309.NIL != module0226.f14800(var142) && module0309.NIL != module0316.f21362(var142, (SubLObject)module0309.$ic64$, var136, var137, var2, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                    var135 = (SubLObject)module0309.NIL;
                    if (module0309.NIL != module0144.$g1789$.getDynamicValue(var134)) {
                        module0144.$g1774$.setDynamicValue(module0316.f21362(var142, (SubLObject)module0309.$ic65$, var136, var137, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED), var134);
                        if (module0309.NIL != module0144.$g1774$.getDynamicValue(var134)) {
                            module0144.$g1774$.setDynamicValue(ConsesLow.nconc(module0333.f22524(module0259.f16914(var142, module0309.$ic66$, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED), module0147.$g2095$.getDynamicValue(var134)), module0144.$g1774$.getDynamicValue(var134)), var134);
                        }
                    }
                    final SubLObject var4_147 = module0144.$g1829$.currentBinding(var134);
                    try {
                        module0144.$g1829$.bind(module0309.$ic52$, var134);
                        if (module0309.NIL != module0144.$g1829$.getDynamicValue(var134)) {
                            module0303.f20202(module0309.$ic63$);
                        }
                    }
                    finally {
                        module0144.$g1829$.rebind(var4_147, var134);
                    }
                }
            }
        }
        finally {
            module0147.$g2096$.rebind(var141, var134);
            module0147.$g2094$.rebind(var140, var134);
            module0147.$g2095$.rebind(var139, var134);
        }
        return var135;
    }
    
    public static SubLObject f20996(final SubLObject var133, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = f21005(var133, var2);
        if (module0309.NIL != var135 && module0309.NIL != module0151.f9690()) {
            final SubLObject var136 = module0144.$g1829$.currentBinding(var134);
            try {
                module0144.$g1829$.bind(module0309.$ic52$, var134);
                if (module0309.NIL != module0144.$g1829$.getDynamicValue(var134)) {
                    final SubLObject var4_148 = module0144.$g1833$.currentBinding(var134);
                    final SubLObject var137 = module0144.$g1812$.currentBinding(var134);
                    try {
                        module0144.$g1833$.bind((SubLObject)module0309.ZERO_INTEGER, var134);
                        module0144.$g1812$.bind((SubLObject)module0309.NIL, var134);
                        module0303.f20202(module0309.$ic67$);
                    }
                    finally {
                        module0144.$g1812$.rebind(var137, var134);
                        module0144.$g1833$.rebind(var4_148, var134);
                    }
                }
            }
            finally {
                module0144.$g1829$.rebind(var136, var134);
            }
        }
        return Types.sublisp_null(var135);
    }
    
    public static SubLObject f21005(final SubLObject var133, final SubLObject var2) {
        final SubLThread var134 = SubLProcess.currentSubLThread();
        SubLObject var135 = (SubLObject)module0309.NIL;
        final SubLObject var136 = module0144.$g1831$.currentBinding(var134);
        final SubLObject var137 = module0144.$g1834$.currentBinding(var134);
        final SubLObject var138 = module0144.$g1835$.currentBinding(var134);
        try {
            module0144.$g1831$.bind(module0205.f13327(module0205.f13132(var133)), var134);
            module0144.$g1834$.bind(module0205.f13326(var133, (SubLObject)module0309.ONE_INTEGER), var134);
            module0144.$g1835$.bind(module0205.f13326(var133, (SubLObject)module0309.TWO_INTEGER), var134);
            final SubLObject var4_149 = module0147.$g2095$.currentBinding(var134);
            final SubLObject var5_150 = module0147.$g2094$.currentBinding(var134);
            final SubLObject var6_151 = module0147.$g2096$.currentBinding(var134);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var134);
                module0147.$g2094$.bind(module0147.f9546(var2), var134);
                module0147.$g2096$.bind(module0147.f9549(var2), var134);
                var135 = f21006(module0144.$g1831$.getDynamicValue(var134), module0144.$g1834$.getDynamicValue(var134), module0144.$g1835$.getDynamicValue(var134));
            }
            finally {
                module0147.$g2096$.rebind(var6_151, var134);
                module0147.$g2094$.rebind(var5_150, var134);
                module0147.$g2095$.rebind(var4_149, var134);
            }
        }
        finally {
            module0144.$g1835$.rebind(var138, var134);
            module0144.$g1834$.rebind(var137, var134);
            module0144.$g1831$.rebind(var136, var134);
        }
        return var135;
    }
    
    public static SubLObject f21006(final SubLObject var135, final SubLObject var136, final SubLObject var137) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = (SubLObject)module0309.NIL;
        final SubLObject var140 = module0018.$g584$.currentBinding(var138);
        try {
            module0018.$g584$.bind((SubLObject)module0309.NIL, var138);
            final SubLObject var141 = f21001(module0202.f12768(var135, var136, var137), (SubLObject)module0309.$ic54$, (SubLObject)module0309.$ic55$);
            final SubLObject var142 = module0217.f14398(var141);
            SubLObject var143 = (SubLObject)module0309.NIL;
            try {
                var138.throwStack.push(module0309.$ic56$);
                final SubLObject var4_152 = module0144.$g1793$.currentBinding(var138);
                try {
                    module0144.$g1793$.bind((SubLObject)module0309.T, var138);
                    final SubLObject var144 = var142;
                    if (var144.eql((SubLObject)module0309.$ic57$)) {
                        final SubLObject var145 = module0217.f14399(var141);
                        final SubLObject var4_153 = module0018.$g585$.currentBinding(var138);
                        try {
                            module0018.$g585$.bind(var145, var138);
                            if (module0309.NIL != f21002(module0144.$g1828$.getDynamicValue(var138))) {
                                final SubLObject var4_154 = module0018.$g598$.currentBinding(var138);
                                final SubLObject var146 = module0018.$g599$.currentBinding(var138);
                                try {
                                    module0018.$g598$.bind((SubLObject)module0309.NIL, var138);
                                    module0018.$g599$.bind((SubLObject)module0309.NIL, var138);
                                    module0219.f14478((SubLObject)module0309.$ic68$, var145, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                                }
                                finally {
                                    module0018.$g599$.rebind(var146, var138);
                                    module0018.$g598$.rebind(var4_154, var138);
                                }
                            }
                        }
                        finally {
                            module0018.$g585$.rebind(var4_153, var138);
                        }
                    }
                    else if (var144.eql((SubLObject)module0309.$ic59$)) {
                        var138.resetMultipleValues();
                        final SubLObject var147 = module0217.f14400(var141);
                        final SubLObject var148 = var138.secondMultipleValue();
                        final SubLObject var149 = var138.thirdMultipleValue();
                        var138.resetMultipleValues();
                        final SubLObject var4_155 = module0018.$g585$.currentBinding(var138);
                        try {
                            module0018.$g585$.bind(var149, var138);
                            final SubLObject var47_156 = var148;
                            if (var47_156.eql((SubLObject)module0309.ONE_INTEGER)) {
                                final SubLObject var4_156 = module0018.$g587$.currentBinding(var138);
                                try {
                                    module0018.$g587$.bind(var137, var138);
                                    SubLObject var150 = (SubLObject)module0309.$ic71$;
                                    SubLObject var151 = (SubLObject)module0309.NIL;
                                    var151 = var150.first();
                                    while (module0309.NIL != var150) {
                                        SubLObject var153;
                                        final SubLObject var152 = var153 = var151;
                                        final SubLObject var4_157 = module0018.$g589$.currentBinding(var138);
                                        final SubLObject var154 = module0018.$g600$.currentBinding(var138);
                                        final SubLObject var155 = module0018.$g588$.currentBinding(var138);
                                        try {
                                            module0018.$g589$.bind((SubLObject)module0309.NIL, var138);
                                            module0018.$g600$.bind((SubLObject)module0309.NIL, var138);
                                            module0018.$g588$.bind((SubLObject)module0309.NIL, var138);
                                            cdestructuring_bind.destructuring_bind_must_consp(var153, var152, (SubLObject)module0309.$ic69$);
                                            module0018.$g589$.setDynamicValue(var153.first(), var138);
                                            var153 = var153.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var153, var152, (SubLObject)module0309.$ic69$);
                                            module0018.$g600$.setDynamicValue(var153.first(), var138);
                                            var153 = var153.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var153, var152, (SubLObject)module0309.$ic69$);
                                            module0018.$g588$.setDynamicValue(var153.first(), var138);
                                            var153 = var153.rest();
                                            if (module0309.NIL == var153) {
                                                module0221.f14612((SubLObject)module0309.$ic70$, var147, module0018.$g589$.getDynamicValue(var138), module0018.$g585$.getDynamicValue(var138));
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var152, (SubLObject)module0309.$ic69$);
                                            }
                                        }
                                        finally {
                                            module0018.$g588$.rebind(var155, var138);
                                            module0018.$g600$.rebind(var154, var138);
                                            module0018.$g589$.rebind(var4_157, var138);
                                        }
                                        var150 = var150.rest();
                                        var151 = var150.first();
                                    }
                                }
                                finally {
                                    module0018.$g587$.rebind(var4_156, var138);
                                }
                            }
                            else if (var47_156.eql((SubLObject)module0309.TWO_INTEGER)) {
                                final SubLObject var4_158 = module0018.$g587$.currentBinding(var138);
                                try {
                                    module0018.$g587$.bind(var136, var138);
                                    SubLObject var150 = (SubLObject)module0309.$ic72$;
                                    SubLObject var151 = (SubLObject)module0309.NIL;
                                    var151 = var150.first();
                                    while (module0309.NIL != var150) {
                                        SubLObject var157;
                                        final SubLObject var156 = var157 = var151;
                                        final SubLObject var4_159 = module0018.$g589$.currentBinding(var138);
                                        final SubLObject var154 = module0018.$g600$.currentBinding(var138);
                                        final SubLObject var155 = module0018.$g588$.currentBinding(var138);
                                        try {
                                            module0018.$g589$.bind((SubLObject)module0309.NIL, var138);
                                            module0018.$g600$.bind((SubLObject)module0309.NIL, var138);
                                            module0018.$g588$.bind((SubLObject)module0309.NIL, var138);
                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0309.$ic69$);
                                            module0018.$g589$.setDynamicValue(var157.first(), var138);
                                            var157 = var157.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0309.$ic69$);
                                            module0018.$g600$.setDynamicValue(var157.first(), var138);
                                            var157 = var157.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0309.$ic69$);
                                            module0018.$g588$.setDynamicValue(var157.first(), var138);
                                            var157 = var157.rest();
                                            if (module0309.NIL == var157) {
                                                module0221.f14612((SubLObject)module0309.$ic70$, var147, module0018.$g589$.getDynamicValue(var138), module0018.$g585$.getDynamicValue(var138));
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(var156, (SubLObject)module0309.$ic69$);
                                            }
                                        }
                                        finally {
                                            module0018.$g588$.rebind(var155, var138);
                                            module0018.$g600$.rebind(var154, var138);
                                            module0018.$g589$.rebind(var4_159, var138);
                                        }
                                        var150 = var150.rest();
                                        var151 = var150.first();
                                    }
                                }
                                finally {
                                    module0018.$g587$.rebind(var4_158, var138);
                                }
                            }
                        }
                        finally {
                            module0018.$g585$.rebind(var4_155, var138);
                        }
                    }
                }
                finally {
                    module0144.$g1793$.rebind(var4_152, var138);
                }
            }
            catch (Throwable var158) {
                var143 = Errors.handleThrowable(var158, (SubLObject)module0309.$ic56$);
            }
            finally {
                var138.throwStack.pop();
            }
            var139 = module0018.$g584$.getDynamicValue(var138);
        }
        finally {
            module0018.$g584$.rebind(var140, var138);
        }
        return var139;
    }
    
    public static SubLObject f21001(final SubLObject var166, final SubLObject var167, final SubLObject var168) {
        return module0217.f14404(var166, var167, var168);
    }
    
    public static SubLObject f21007(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0221.$g2399$.getDynamicValue(var145)) {
            return f21008(var144);
        }
        return f21009(var144);
    }
    
    public static SubLObject f21009(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0178.f11284(var144)) {
            final SubLObject var146 = module0018.$g597$.currentBinding(var145);
            try {
                module0018.$g597$.bind(var144, var145);
                final SubLObject var147 = module0178.f11331(var144, module0107.f7613(module0018.$g589$.getDynamicValue(var145)));
                if (module0309.NIL != module0173.f10955(var147)) {
                    module0221.f14612((SubLObject)module0309.$ic73$, var147, module0018.$g600$.getDynamicValue(var145), module0018.$g585$.getDynamicValue(var145));
                }
            }
            finally {
                module0018.$g597$.rebind(var146, var145);
            }
            return module0018.$g584$.getDynamicValue(var145);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21008(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0178.f11284(var144)) {
            final SubLObject var146 = module0018.$g597$.currentBinding(var145);
            try {
                module0018.$g597$.bind(var144, var145);
                final SubLObject var147 = module0178.f11331(var144, module0018.$g589$.getDynamicValue(var145));
                final SubLObject var148 = module0107.f7613(module0018.$g600$.getDynamicValue(var145));
                if (module0309.NIL != module0173.f10955(var147)) {
                    module0221.f14612((SubLObject)module0309.$ic73$, var147, var148, module0018.$g585$.getDynamicValue(var145));
                }
            }
            finally {
                module0018.$g597$.rebind(var146, var145);
            }
            return module0018.$g584$.getDynamicValue(var145);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21010(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0178.f11284(var144)) {
            final SubLObject var146 = module0178.f11285(var144);
            final SubLObject var147 = (module0309.NIL != module0221.$g2399$.getDynamicValue(var145)) ? module0107.f7613(module0018.$g588$.getDynamicValue(var145)) : module0018.$g588$.getDynamicValue(var145);
            if (module0018.$g587$.getDynamicValue(var145).equal(module0202.f12831(var146, var147, (SubLObject)module0309.UNPROVIDED))) {
                module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0018.$g584$.getDynamicValue(var145)), var145);
                if (module0309.NIL != module0144.$g1789$.getDynamicValue(var145)) {
                    if (!module0018.$g585$.getDynamicValue(var145).equal(module0202.f12832(var146, (SubLObject)module0309.UNPROVIDED))) {
                        SubLObject var149;
                        final SubLObject var148 = var149 = module0333.f22524(module0260.f17131(module0202.f12832(var146, (SubLObject)module0309.UNPROVIDED), module0018.$g585$.getDynamicValue(var145), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED), module0147.$g2095$.getDynamicValue(var145));
                        SubLObject var150 = (SubLObject)module0309.NIL;
                        var150 = var149.first();
                        while (module0309.NIL != var149) {
                            if (module0309.NIL != module0210.f13566(var150)) {
                                final SubLObject var151 = var150;
                                if (module0309.NIL == conses_high.member(var151, module0144.$g1774$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                                    module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var151, module0144.$g1774$.getDynamicValue(var145)), var145);
                                }
                            }
                            var149 = var149.rest();
                            var150 = var149.first();
                        }
                    }
                    if (module0309.NIL == conses_high.member(var144, module0144.$g1774$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                        module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0144.$g1774$.getDynamicValue(var145)), var145);
                    }
                    final SubLObject var152 = module0018.$g597$.getDynamicValue(var145);
                    if (module0309.NIL == conses_high.member(var152, module0144.$g1774$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                        module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var152, module0144.$g1774$.getDynamicValue(var145)), var145);
                    }
                }
                if (module0309.NIL == module0144.$g1795$.getDynamicValue(var145)) {
                    module0303.f20201();
                }
            }
        }
        return module0018.$g584$.getDynamicValue(var145);
    }
    
    public static SubLObject f21011(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0178.f11284(var144)) {
            final SubLObject var146 = module0178.f11285(var144);
            final SubLObject var147 = module0202.f12833(var146, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var148 = module0202.f12834(var146, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var149 = module0202.f12835(var146, (SubLObject)module0309.UNPROVIDED);
            if (var148.equal(module0144.$g1834$.getDynamicValue(var145))) {
                module0018.$g598$.setDynamicValue((SubLObject)ConsesLow.cons(var149, module0018.$g598$.getDynamicValue(var145)), var145);
                if (module0309.NIL != module0004.f104(var149, module0018.$g599$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQUAL), (SubLObject)module0309.UNPROVIDED)) {
                    module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0018.$g584$.getDynamicValue(var145)), var145);
                    if (module0309.NIL != module0144.$g1789$.getDynamicValue(var145)) {
                        if (module0309.NIL == conses_high.member(var144, module0144.$g1774$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                            module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0144.$g1774$.getDynamicValue(var145)), var145);
                        }
                        final SubLObject var150 = module0144.$g1777$.currentBinding(var145);
                        try {
                            module0144.$g1777$.bind((SubLObject)module0309.NIL, var145);
                            final SubLObject var151 = f21012((SubLObject)ConsesLow.list(var147, var149, module0144.$g1835$.getDynamicValue(var145)), (SubLObject)module0309.ZERO_INTEGER, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                            if (module0309.NIL != var151) {
                                final SubLObject var152 = var151;
                                if (module0309.NIL == conses_high.member(var152, module0144.$g1774$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                                    module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var152, module0144.$g1774$.getDynamicValue(var145)), var145);
                                }
                            }
                        }
                        finally {
                            module0144.$g1777$.rebind(var150, var145);
                        }
                    }
                    if (module0309.NIL == module0144.$g1795$.getDynamicValue(var145)) {
                        module0303.f20201();
                    }
                }
            }
            if (var149.equal(module0144.$g1835$.getDynamicValue(var145))) {
                module0018.$g599$.setDynamicValue((SubLObject)ConsesLow.cons(var148, module0018.$g599$.getDynamicValue(var145)), var145);
                if (module0309.NIL != module0004.f104(var148, module0018.$g598$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQUAL), (SubLObject)module0309.UNPROVIDED)) {
                    module0018.$g584$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0018.$g584$.getDynamicValue(var145)), var145);
                    if (module0309.NIL != module0144.$g1789$.getDynamicValue(var145)) {
                        if (module0309.NIL == conses_high.member(var144, module0144.$g1774$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                            module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0144.$g1774$.getDynamicValue(var145)), var145);
                        }
                        final SubLObject var150 = module0144.$g1777$.currentBinding(var145);
                        try {
                            module0144.$g1777$.bind((SubLObject)module0309.NIL, var145);
                            final SubLObject var151 = f21012((SubLObject)ConsesLow.list(var147, module0144.$g1834$.getDynamicValue(var145), var148), (SubLObject)module0309.ZERO_INTEGER, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                            if (module0309.NIL != var151) {
                                final SubLObject var152 = var151;
                                if (module0309.NIL == conses_high.member(var152, module0144.$g1774$.getDynamicValue(var145), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                                    module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var152, module0144.$g1774$.getDynamicValue(var145)), var145);
                                }
                            }
                        }
                        finally {
                            module0144.$g1777$.rebind(var150, var145);
                        }
                    }
                    if (module0309.NIL == module0144.$g1795$.getDynamicValue(var145)) {
                        module0303.f20201();
                    }
                }
            }
        }
        return module0018.$g584$.getDynamicValue(var145);
    }
    
    public static SubLObject f21012(final SubLObject var174, SubLObject var175, SubLObject var2, SubLObject var167) {
        if (var175 == module0309.UNPROVIDED) {
            var175 = (SubLObject)module0309.NIL;
        }
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (var167 == module0309.UNPROVIDED) {
            var167 = (SubLObject)module0309.$ic54$;
        }
        final SubLThread var176 = SubLProcess.currentSubLThread();
        SubLObject var177 = (SubLObject)module0309.NIL;
        final SubLObject var178 = module0018.$g587$.currentBinding(var176);
        try {
            module0018.$g587$.bind(var174, var176);
            final SubLObject var179 = var2;
            final SubLObject var4_177 = module0147.$g2094$.currentBinding(var176);
            final SubLObject var180 = module0147.$g2095$.currentBinding(var176);
            try {
                module0147.$g2094$.bind(module0147.f9531(var179), var176);
                module0147.$g2095$.bind(module0147.f9534(var179), var176);
                final SubLObject var181 = module0443.f30755(var174);
                if (module0309.NIL == module0205.f13145((SubLObject)module0309.$ic74$, var174, (SubLObject)module0309.NIL, (SubLObject)module0309.UNPROVIDED)) {
                    final SubLObject var4_178 = module0148.$g2099$.currentBinding(var176);
                    final SubLObject var5_180 = module0148.$g2097$.currentBinding(var176);
                    try {
                        module0148.$g2099$.bind((SubLObject)module0309.$ic75$, var176);
                        module0148.$g2097$.bind(module0205.f13333(var174), var176);
                        final SubLObject var182 = module0217.f14404(var181, var167, (SubLObject)module0309.NIL);
                        final SubLObject var184;
                        final SubLObject var183 = var184 = module0158.f10294(var182);
                        if (var184.eql((SubLObject)module0309.$ic59$)) {
                            var176.resetMultipleValues();
                            final SubLObject var185 = module0158.f10297(var182);
                            final SubLObject var186 = var176.secondMultipleValue();
                            final SubLObject var187 = var176.thirdMultipleValue();
                            var176.resetMultipleValues();
                            if (module0309.NIL != var186) {
                                if (module0309.NIL != var187) {
                                    final SubLObject var188 = var187;
                                    if (module0309.NIL != module0158.f10010(var185, var186, var188)) {
                                        final SubLObject var189 = module0158.f10011(var185, var186, var188);
                                        SubLObject var190 = var177;
                                        final SubLObject var191 = (SubLObject)module0309.NIL;
                                        while (module0309.NIL == var190) {
                                            final SubLObject var192 = module0052.f3695(var189, var191);
                                            final SubLObject var193 = (SubLObject)SubLObjectFactory.makeBoolean(!var191.eql(var192));
                                            if (module0309.NIL != var193) {
                                                SubLObject var194 = (SubLObject)module0309.NIL;
                                                try {
                                                    var194 = module0158.f10316(var192, (SubLObject)module0309.$ic76$, var167, (SubLObject)module0309.NIL);
                                                    SubLObject var188_193 = var177;
                                                    final SubLObject var189_194 = (SubLObject)module0309.NIL;
                                                    while (module0309.NIL == var188_193) {
                                                        final SubLObject var195 = module0052.f3695(var194, var189_194);
                                                        final SubLObject var191_196 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_194.eql(var195));
                                                        if (module0309.NIL != var191_196) {
                                                            var177 = f21013(var195);
                                                        }
                                                        var188_193 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_196 || module0309.NIL != var177);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var4_179 = Threads.$is_thread_performing_cleanupP$.currentBinding(var176);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var176);
                                                        if (module0309.NIL != var194) {
                                                            module0158.f10319(var194);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_179, var176);
                                                    }
                                                }
                                            }
                                            var190 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var193 || module0309.NIL != var177);
                                        }
                                    }
                                }
                                else {
                                    final SubLObject var188 = (SubLObject)module0309.NIL;
                                    if (module0309.NIL != module0158.f10010(var185, var186, var188)) {
                                        final SubLObject var189 = module0158.f10011(var185, var186, var188);
                                        SubLObject var190 = var177;
                                        final SubLObject var191 = (SubLObject)module0309.NIL;
                                        while (module0309.NIL == var190) {
                                            final SubLObject var192 = module0052.f3695(var189, var191);
                                            final SubLObject var193 = (SubLObject)SubLObjectFactory.makeBoolean(!var191.eql(var192));
                                            if (module0309.NIL != var193) {
                                                SubLObject var194 = (SubLObject)module0309.NIL;
                                                try {
                                                    var194 = module0158.f10316(var192, (SubLObject)module0309.$ic76$, var167, (SubLObject)module0309.NIL);
                                                    SubLObject var188_194 = var177;
                                                    final SubLObject var189_195 = (SubLObject)module0309.NIL;
                                                    while (module0309.NIL == var188_194) {
                                                        final SubLObject var195 = module0052.f3695(var194, var189_195);
                                                        final SubLObject var191_197 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_195.eql(var195));
                                                        if (module0309.NIL != var191_197) {
                                                            var177 = f21013(var195);
                                                        }
                                                        var188_194 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_197 || module0309.NIL != var177);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var4_180 = Threads.$is_thread_performing_cleanupP$.currentBinding(var176);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var176);
                                                        if (module0309.NIL != var194) {
                                                            module0158.f10319(var194);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_180, var176);
                                                    }
                                                }
                                            }
                                            var190 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var193 || module0309.NIL != var177);
                                        }
                                    }
                                }
                            }
                            else if (module0309.NIL != var187) {
                                final SubLObject var188 = var187;
                                if (module0309.NIL != module0158.f10010(var185, (SubLObject)module0309.NIL, var188)) {
                                    final SubLObject var189 = module0158.f10011(var185, (SubLObject)module0309.NIL, var188);
                                    SubLObject var190 = var177;
                                    final SubLObject var191 = (SubLObject)module0309.NIL;
                                    while (module0309.NIL == var190) {
                                        final SubLObject var192 = module0052.f3695(var189, var191);
                                        final SubLObject var193 = (SubLObject)SubLObjectFactory.makeBoolean(!var191.eql(var192));
                                        if (module0309.NIL != var193) {
                                            SubLObject var194 = (SubLObject)module0309.NIL;
                                            try {
                                                var194 = module0158.f10316(var192, (SubLObject)module0309.$ic76$, var167, (SubLObject)module0309.NIL);
                                                SubLObject var188_195 = var177;
                                                final SubLObject var189_196 = (SubLObject)module0309.NIL;
                                                while (module0309.NIL == var188_195) {
                                                    final SubLObject var195 = module0052.f3695(var194, var189_196);
                                                    final SubLObject var191_198 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_196.eql(var195));
                                                    if (module0309.NIL != var191_198) {
                                                        var177 = f21013(var195);
                                                    }
                                                    var188_195 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_198 || module0309.NIL != var177);
                                                }
                                            }
                                            finally {
                                                final SubLObject var4_181 = Threads.$is_thread_performing_cleanupP$.currentBinding(var176);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var176);
                                                    if (module0309.NIL != var194) {
                                                        module0158.f10319(var194);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_181, var176);
                                                }
                                            }
                                        }
                                        var190 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var193 || module0309.NIL != var177);
                                    }
                                }
                            }
                            else {
                                final SubLObject var188 = (SubLObject)module0309.NIL;
                                if (module0309.NIL != module0158.f10010(var185, (SubLObject)module0309.NIL, var188)) {
                                    final SubLObject var189 = module0158.f10011(var185, (SubLObject)module0309.NIL, var188);
                                    SubLObject var190 = var177;
                                    final SubLObject var191 = (SubLObject)module0309.NIL;
                                    while (module0309.NIL == var190) {
                                        final SubLObject var192 = module0052.f3695(var189, var191);
                                        final SubLObject var193 = (SubLObject)SubLObjectFactory.makeBoolean(!var191.eql(var192));
                                        if (module0309.NIL != var193) {
                                            SubLObject var194 = (SubLObject)module0309.NIL;
                                            try {
                                                var194 = module0158.f10316(var192, (SubLObject)module0309.$ic76$, var167, (SubLObject)module0309.NIL);
                                                SubLObject var188_196 = var177;
                                                final SubLObject var189_197 = (SubLObject)module0309.NIL;
                                                while (module0309.NIL == var188_196) {
                                                    final SubLObject var195 = module0052.f3695(var194, var189_197);
                                                    final SubLObject var191_199 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_197.eql(var195));
                                                    if (module0309.NIL != var191_199) {
                                                        var177 = f21013(var195);
                                                    }
                                                    var188_196 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_199 || module0309.NIL != var177);
                                                }
                                            }
                                            finally {
                                                final SubLObject var4_182 = Threads.$is_thread_performing_cleanupP$.currentBinding(var176);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var176);
                                                    if (module0309.NIL != var194) {
                                                        module0158.f10319(var194);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_182, var176);
                                                }
                                            }
                                        }
                                        var190 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var193 || module0309.NIL != var177);
                                    }
                                }
                            }
                        }
                        else if (var184.eql((SubLObject)module0309.$ic57$)) {
                            final SubLObject var196 = module0158.f10299(var182);
                            if (module0309.NIL != module0158.f10038(var196)) {
                                final SubLObject var197 = (SubLObject)module0309.NIL;
                                final SubLObject var4_183 = module0012.$g73$.currentBinding(var176);
                                final SubLObject var5_181 = module0012.$g65$.currentBinding(var176);
                                final SubLObject var198 = module0012.$g67$.currentBinding(var176);
                                final SubLObject var199 = module0012.$g68$.currentBinding(var176);
                                final SubLObject var200 = module0012.$g66$.currentBinding(var176);
                                final SubLObject var201 = module0012.$g69$.currentBinding(var176);
                                final SubLObject var202 = module0012.$g70$.currentBinding(var176);
                                final SubLObject var203 = module0012.$silent_progressP$.currentBinding(var176);
                                try {
                                    module0012.$g73$.bind(Time.get_universal_time(), var176);
                                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var176), var176);
                                    module0012.$g67$.bind((SubLObject)module0309.ONE_INTEGER, var176);
                                    module0012.$g68$.bind((SubLObject)module0309.ZERO_INTEGER, var176);
                                    module0012.$g66$.bind((SubLObject)module0309.ZERO_INTEGER, var176);
                                    module0012.$g69$.bind((SubLObject)module0309.ZERO_INTEGER, var176);
                                    module0012.$g70$.bind((SubLObject)module0309.T, var176);
                                    module0012.$silent_progressP$.bind((SubLObject)((module0309.NIL != var197) ? module0012.$silent_progressP$.getDynamicValue(var176) : module0309.T), var176);
                                    module0012.f474(var197);
                                    final SubLObject var204 = module0158.f10039(var196);
                                    SubLObject var205 = var177;
                                    final SubLObject var206 = (SubLObject)module0309.NIL;
                                    while (module0309.NIL == var205) {
                                        final SubLObject var207 = module0052.f3695(var204, var206);
                                        final SubLObject var208 = (SubLObject)SubLObjectFactory.makeBoolean(!var206.eql(var207));
                                        if (module0309.NIL != var208) {
                                            module0012.f476();
                                            SubLObject var209 = (SubLObject)module0309.NIL;
                                            try {
                                                var209 = module0158.f10316(var207, (SubLObject)module0309.$ic76$, var167, (SubLObject)module0309.NIL);
                                                SubLObject var188_197 = var177;
                                                final SubLObject var189_198 = (SubLObject)module0309.NIL;
                                                while (module0309.NIL == var188_197) {
                                                    final SubLObject var210 = module0052.f3695(var209, var189_198);
                                                    final SubLObject var191_200 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_198.eql(var210));
                                                    if (module0309.NIL != var191_200) {
                                                        var177 = f21013(var210);
                                                    }
                                                    var188_197 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_200 || module0309.NIL != var177);
                                                }
                                            }
                                            finally {
                                                final SubLObject var4_184 = Threads.$is_thread_performing_cleanupP$.currentBinding(var176);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var176);
                                                    if (module0309.NIL != var209) {
                                                        module0158.f10319(var209);
                                                    }
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(var4_184, var176);
                                                }
                                            }
                                        }
                                        var205 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var208 || module0309.NIL != var177);
                                    }
                                    module0012.f475();
                                }
                                finally {
                                    module0012.$silent_progressP$.rebind(var203, var176);
                                    module0012.$g70$.rebind(var202, var176);
                                    module0012.$g69$.rebind(var201, var176);
                                    module0012.$g66$.rebind(var200, var176);
                                    module0012.$g68$.rebind(var199, var176);
                                    module0012.$g67$.rebind(var198, var176);
                                    module0012.$g65$.rebind(var5_181, var176);
                                    module0012.$g73$.rebind(var4_183, var176);
                                }
                            }
                        }
                        else if (var184.eql((SubLObject)module0309.$ic77$)) {
                            SubLObject var211;
                            SubLObject var212;
                            for (var211 = (SubLObject)module0309.NIL, var211 = module0218.f14453(module0158.f10301(var182), (SubLObject)module0309.UNPROVIDED); module0309.NIL == var177 && module0309.NIL != var211; var211 = var211.rest()) {
                                var212 = var211.first();
                                if (module0309.NIL == var167 || module0309.NIL != module0178.f11343(var212, var167)) {
                                    var177 = f21013(var212);
                                }
                            }
                        }
                        else {
                            module0158.f10295(var182, var183);
                        }
                    }
                    finally {
                        module0148.$g2097$.rebind(var5_180, var176);
                        module0148.$g2099$.rebind(var4_178, var176);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var180, var176);
                module0147.$g2094$.rebind(var4_177, var176);
            }
        }
        finally {
            module0018.$g587$.rebind(var178, var176);
        }
        return var177;
    }
    
    public static SubLObject f21013(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0178.f11284(var144)) {
            final SubLObject var146 = module0178.f11285(var144);
            if (module0202.f12829(module0018.$g587$.getDynamicValue(var145), (SubLObject)module0309.UNPROVIDED).equal(module0202.f12829(var146, (SubLObject)module0309.UNPROVIDED)) && (module0202.f12832(module0018.$g587$.getDynamicValue(var145), (SubLObject)module0309.UNPROVIDED).equal(module0202.f12832(var146, (SubLObject)module0309.UNPROVIDED)) || module0309.NIL != module0260.f17089(module0202.f12832(module0018.$g587$.getDynamicValue(var145), (SubLObject)module0309.UNPROVIDED), module0202.f12832(var146, (SubLObject)module0309.UNPROVIDED), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED))) {
                return var144;
            }
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f20997(final SubLObject var133, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = module0205.f13326(var133, (SubLObject)module0309.ZERO_INTEGER);
        final SubLObject var136 = module0205.f13326(var133, (SubLObject)module0309.ONE_INTEGER);
        final SubLObject var137 = module0205.f13326(var133, (SubLObject)module0309.TWO_INTEGER);
        SubLObject var138 = (SubLObject)module0309.NIL;
        final SubLObject var139 = var2;
        final SubLObject var140 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var141 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var142 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var139), var134);
            module0147.$g2094$.bind(module0147.f9546(var139), var134);
            module0147.$g2096$.bind(module0147.f9549(var139), var134);
            var138 = f21014(var135, var136, var137);
        }
        finally {
            module0147.$g2096$.rebind(var142, var134);
            module0147.$g2094$.rebind(var141, var134);
            module0147.$g2095$.rebind(var140, var134);
        }
        return Types.sublisp_null(var138);
    }
    
    public static SubLObject f21014(final SubLObject var135, final SubLObject var136, final SubLObject var137) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = (SubLObject)module0309.NIL;
        SubLObject var140 = (SubLObject)module0309.NIL;
        final SubLObject var141 = Sequences.remove((SubLObject)module0309.NIL, (SubLObject)ConsesLow.list(var136, var137), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
        if (module0309.NIL == var139) {
            SubLObject var142 = module0261.f17231(var135, (SubLObject)module0309.UNPROVIDED);
            SubLObject var143 = (SubLObject)module0309.NIL;
            var143 = var142.first();
            while (module0309.NIL == var139 && module0309.NIL != var142) {
                final SubLObject var144 = f21012(module0285.f18943(module0202.f12767(var143, var141, (SubLObject)module0309.UNPROVIDED)), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                if (module0309.NIL != module0210.f13566(var144)) {
                    final SubLObject var145 = module0144.$g1789$.currentBinding(var138);
                    final SubLObject var146 = module0144.$g1774$.currentBinding(var138);
                    try {
                        module0144.$g1789$.bind((SubLObject)module0309.T, var138);
                        module0144.$g1774$.bind((SubLObject)module0309.NIL, var138);
                        final SubLObject var147 = var144;
                        if (module0309.NIL == conses_high.member(var147, module0144.$g1774$.getDynamicValue(var138), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                            module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var147, module0144.$g1774$.getDynamicValue(var138)), var138);
                        }
                        final SubLObject var4_221 = module0144.$g1829$.currentBinding(var138);
                        try {
                            module0144.$g1829$.bind(module0309.$ic78$, var138);
                            if (module0309.NIL != module0144.$g1829$.getDynamicValue(var138)) {
                                module0303.f20202(var143);
                            }
                        }
                        finally {
                            module0144.$g1829$.rebind(var4_221, var138);
                        }
                    }
                    finally {
                        module0144.$g1774$.rebind(var146, var138);
                        module0144.$g1789$.rebind(var145, var138);
                    }
                    var140 = (SubLObject)ConsesLow.cons(var143, var140);
                    if (module0309.NIL == module0144.$g1795$.getDynamicValue(var138)) {
                        var139 = (SubLObject)module0309.T;
                    }
                }
                var142 = var142.rest();
                var143 = var142.first();
            }
        }
        return var140;
    }
    
    public static SubLObject f20998(final SubLObject var133, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var134 = SubLProcess.currentSubLThread();
        final SubLObject var135 = module0205.f13326(var133, (SubLObject)module0309.ZERO_INTEGER);
        final SubLObject var136 = module0205.f13326(var133, (SubLObject)module0309.ONE_INTEGER);
        final SubLObject var137 = module0205.f13326(var133, (SubLObject)module0309.TWO_INTEGER);
        SubLObject var138 = (SubLObject)module0309.NIL;
        final SubLObject var139 = var2;
        final SubLObject var140 = module0147.$g2095$.currentBinding(var134);
        final SubLObject var141 = module0147.$g2094$.currentBinding(var134);
        final SubLObject var142 = module0147.$g2096$.currentBinding(var134);
        try {
            module0147.$g2095$.bind(module0147.f9545(var139), var134);
            module0147.$g2094$.bind(module0147.f9546(var139), var134);
            module0147.$g2096$.bind(module0147.f9549(var139), var134);
            var138 = f21015(var135, var136, var137);
        }
        finally {
            module0147.$g2096$.rebind(var142, var134);
            module0147.$g2094$.rebind(var141, var134);
            module0147.$g2095$.rebind(var140, var134);
        }
        return Types.sublisp_null(var138);
    }
    
    public static SubLObject f21015(final SubLObject var135, final SubLObject var136, final SubLObject var137) {
        final SubLThread var138 = SubLProcess.currentSubLThread();
        SubLObject var139 = (SubLObject)module0309.NIL;
        SubLObject var140 = (SubLObject)module0309.NIL;
        if (module0309.NIL != var136 && module0309.NIL != var137) {
            final SubLObject var141 = (SubLObject)ConsesLow.list(var137, var136);
            if (module0309.NIL == var139) {
                SubLObject var142 = module0261.f17234(var135, (SubLObject)module0309.UNPROVIDED);
                SubLObject var143 = (SubLObject)module0309.NIL;
                var143 = var142.first();
                while (module0309.NIL == var139 && module0309.NIL != var142) {
                    final SubLObject var144 = f21012(module0285.f18943(module0202.f12767(var143, var141, (SubLObject)module0309.UNPROVIDED)), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
                    if (module0309.NIL != module0210.f13566(var144)) {
                        final SubLObject var145 = module0144.$g1789$.currentBinding(var138);
                        final SubLObject var146 = module0144.$g1774$.currentBinding(var138);
                        try {
                            module0144.$g1789$.bind((SubLObject)module0309.T, var138);
                            module0144.$g1774$.bind((SubLObject)module0309.NIL, var138);
                            final SubLObject var147 = var144;
                            if (module0309.NIL == conses_high.member(var147, module0144.$g1774$.getDynamicValue(var138), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                                module0144.$g1774$.setDynamicValue((SubLObject)ConsesLow.cons(var147, module0144.$g1774$.getDynamicValue(var138)), var138);
                            }
                            final SubLObject var4_223 = module0144.$g1829$.currentBinding(var138);
                            try {
                                module0144.$g1829$.bind(module0309.$ic79$, var138);
                                if (module0309.NIL != module0144.$g1829$.getDynamicValue(var138)) {
                                    module0303.f20202(var143);
                                }
                            }
                            finally {
                                module0144.$g1829$.rebind(var4_223, var138);
                            }
                        }
                        finally {
                            module0144.$g1774$.rebind(var146, var138);
                            module0144.$g1789$.rebind(var145, var138);
                        }
                        var140 = (SubLObject)ConsesLow.cons(var143, var140);
                        if (module0309.NIL == module0144.$g1795$.getDynamicValue(var138)) {
                            var139 = (SubLObject)module0309.T;
                        }
                    }
                    var142 = var142.rest();
                    var143 = var142.first();
                }
            }
        }
        return var140;
    }
    
    public static SubLObject f20986() {
        final SubLObject var32 = module0309.$g2794$.getGlobalValue();
        if (module0309.NIL != var32) {
            module0034.f1818(var32);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21016(final SubLObject var224) {
        return module0034.f1829(module0309.$g2794$.getGlobalValue(), (SubLObject)ConsesLow.list(var224), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
    }
    
    public static SubLObject f21017(final SubLObject var224) {
        return f21018(var224, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
    }
    
    public static SubLObject f21019(final SubLObject var224) {
        SubLObject var225 = module0309.$g2794$.getGlobalValue();
        if (module0309.NIL == var225) {
            var225 = module0034.f1934((SubLObject)module0309.$ic80$, (SubLObject)module0309.$ic81$, (SubLObject)module0309.$ic82$, (SubLObject)module0309.EQL, (SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.EIGHT_INTEGER);
        }
        SubLObject var226 = module0034.f1814(var225, var224, (SubLObject)module0309.$ic7$);
        if (var226 == module0309.$ic7$) {
            var226 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21017(var224)));
            module0034.f1816(var225, var224, var226, (SubLObject)module0309.UNPROVIDED);
        }
        return module0034.f1959(var226);
    }
    
    public static SubLObject f21020(final SubLObject var224, final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        return f21018(var224, var10, var31, var2);
    }
    
    public static SubLObject f21021(final SubLObject var224, final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        final SubLThread var225 = SubLProcess.currentSubLThread();
        final SubLObject var226 = module0034.$g879$.getDynamicValue(var225);
        SubLObject var227 = (SubLObject)module0309.NIL;
        if (module0309.NIL == var226) {
            return f21020(var224, var10, var31, var2);
        }
        var227 = module0034.f1857(var226, (SubLObject)module0309.$ic83$, (SubLObject)module0309.UNPROVIDED);
        if (module0309.NIL == var227) {
            var227 = module0034.f1807(module0034.f1842(var226), (SubLObject)module0309.$ic83$, (SubLObject)module0309.FOUR_INTEGER, (SubLObject)module0309.NIL, (SubLObject)module0309.EQUAL, (SubLObject)module0309.UNPROVIDED);
            module0034.f1860(var226, (SubLObject)module0309.$ic83$, var227);
        }
        final SubLObject var228 = module0034.f1780(var224, var10, var31, var2);
        final SubLObject var229 = module0034.f1814(var227, var228, (SubLObject)module0309.UNPROVIDED);
        if (var229 != module0309.$ic7$) {
            SubLObject var230 = var229;
            SubLObject var231 = (SubLObject)module0309.NIL;
            var231 = var230.first();
            while (module0309.NIL != var230) {
                SubLObject var232 = var231.first();
                final SubLObject var233 = conses_high.second(var231);
                if (var224.equal(var232.first())) {
                    var232 = var232.rest();
                    if (var10.equal(var232.first())) {
                        var232 = var232.rest();
                        if (var31.equal(var232.first())) {
                            var232 = var232.rest();
                            if (module0309.NIL != var232 && module0309.NIL == var232.rest() && var2.equal(var232.first())) {
                                return module0034.f1959(var233);
                            }
                        }
                    }
                }
                var230 = var230.rest();
                var231 = var230.first();
            }
        }
        final SubLObject var234 = Values.arg2(var225.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21020(var224, var10, var31, var2)));
        module0034.f1836(var227, var228, var229, var234, (SubLObject)ConsesLow.list(var224, var10, var31, var2));
        return module0034.f1959(var234);
    }
    
    public static SubLObject f21018(final SubLObject var224, SubLObject var10, SubLObject var31, SubLObject var2) {
        if (var10 == module0309.UNPROVIDED) {
            var10 = module0144.$g1828$.getDynamicValue();
        }
        if (var31 == module0309.UNPROVIDED) {
            var31 = module0144.$g1833$.getDynamicValue();
        }
        if (var2 == module0309.UNPROVIDED) {
            var2 = module0147.$g2095$.getDynamicValue();
        }
        if (var224.eql(module0309.$ic84$)) {
            return f21022(var10, var31, var2);
        }
        if (var224.eql(module0309.$ic85$)) {
            return f21023(var10, var31, var2);
        }
        if (var224.eql(module0309.$ic86$)) {
            return f21024(var10, var31, var2);
        }
        if (var224.eql(module0309.$ic87$)) {
            return f21022(var10, var31, var2);
        }
        if (var224.eql(module0309.$ic88$)) {
            return f21023(var10, var31, var2);
        }
        if (var224.eql(module0309.$ic89$)) {
            return f21024(var10, var31, var2);
        }
        if (var224.eql(module0309.$ic90$)) {
            return f21025(var10, var31, var2);
        }
        if (var224.eql(module0309.$ic91$)) {
            return f21026(var10, var31, var2);
        }
        if (var224.eql(module0309.$ic92$)) {
            return f21027(var10, var31, var2);
        }
        module0202.f12747((SubLObject)module0309.THREE_INTEGER, (SubLObject)module0309.$ic93$, var224, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
        return (SubLObject)module0309.T;
    }
    
    public static SubLObject f21022(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0144.$g1770$.getDynamicValue(var32)) {
            return Types.sublisp_null(f21028(var10, var31, var2));
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21029(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        return f21022(var10, var31, var2);
    }
    
    public static SubLObject f21030(final SubLObject var10, final SubLObject var31, final SubLObject var2, SubLObject var144) {
        if (var144 == module0309.UNPROVIDED) {
            var144 = module0288.f19338(var10, var2);
        }
        final SubLThread var145 = SubLProcess.currentSubLThread();
        SubLObject var146 = (SubLObject)module0309.NIL;
        final SubLObject var147 = module0144.$g1795$.currentBinding(var145);
        try {
            module0144.$g1795$.bind((SubLObject)module0309.T, var145);
            var146 = f21028(var10, var31, var2);
        }
        finally {
            module0144.$g1795$.rebind(var147, var145);
        }
        if (module0309.NIL != var146) {
            final SubLObject var148 = var144;
            if (module0309.NIL != var148) {
                var146 = (SubLObject)ConsesLow.cons(var148, var146);
            }
        }
        return var146;
    }
    
    public static SubLObject f21028(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0309.NIL;
        final SubLObject var34 = module0035.f2151(var31, module0193.f12079((SubLObject)module0309.ZERO_INTEGER), var10);
        final SubLObject var35 = module0205.f13326(var10, var31);
        if (module0309.NIL == module0152.f9726() || module0309.NIL == module0235.f15475(module0152.f9728(), var34, (SubLObject)module0309.T, (SubLObject)module0309.UNPROVIDED)) {
            final SubLObject var36 = module0147.$g2095$.currentBinding(var32);
            final SubLObject var37 = module0147.$g2094$.currentBinding(var32);
            final SubLObject var38 = module0147.$g2096$.currentBinding(var32);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var32);
                module0147.$g2094$.bind(module0147.f9546(var2), var32);
                module0147.$g2096$.bind(module0147.f9549(var2), var32);
                final SubLObject var39 = module0217.f14404(var34, (SubLObject)module0309.$ic54$, (SubLObject)module0309.$ic55$);
                final SubLObject var40 = module0217.f14398(var39);
                SubLObject var41 = (SubLObject)module0309.NIL;
                SubLObject var42 = (SubLObject)module0309.NIL;
                try {
                    var32.throwStack.push(module0309.$ic56$);
                    final SubLObject var4_229 = module0144.$g1793$.currentBinding(var32);
                    try {
                        module0144.$g1793$.bind((SubLObject)module0309.T, var32);
                        final SubLObject var43 = var40;
                        if (var43.eql((SubLObject)module0309.$ic57$)) {
                            final SubLObject var44 = module0217.f14399(var39);
                            if (module0309.NIL != f21002(var34)) {
                                final SubLObject var45 = var44;
                                if (module0309.NIL != module0158.f10038(var45)) {
                                    final SubLObject var46 = (SubLObject)module0309.NIL;
                                    final SubLObject var4_230 = module0012.$g73$.currentBinding(var32);
                                    final SubLObject var5_231 = module0012.$g65$.currentBinding(var32);
                                    final SubLObject var6_232 = module0012.$g67$.currentBinding(var32);
                                    final SubLObject var47 = module0012.$g68$.currentBinding(var32);
                                    final SubLObject var48 = module0012.$g66$.currentBinding(var32);
                                    final SubLObject var49 = module0012.$g69$.currentBinding(var32);
                                    final SubLObject var50 = module0012.$g70$.currentBinding(var32);
                                    final SubLObject var51 = module0012.$silent_progressP$.currentBinding(var32);
                                    try {
                                        module0012.$g73$.bind(Time.get_universal_time(), var32);
                                        module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var32), var32);
                                        module0012.$g67$.bind((SubLObject)module0309.ONE_INTEGER, var32);
                                        module0012.$g68$.bind((SubLObject)module0309.ZERO_INTEGER, var32);
                                        module0012.$g66$.bind((SubLObject)module0309.ZERO_INTEGER, var32);
                                        module0012.$g69$.bind((SubLObject)module0309.ZERO_INTEGER, var32);
                                        module0012.$g70$.bind((SubLObject)module0309.T, var32);
                                        module0012.$silent_progressP$.bind((SubLObject)((module0309.NIL != var46) ? module0012.$silent_progressP$.getDynamicValue(var32) : module0309.T), var32);
                                        module0012.f474(var46);
                                        final SubLObject var52 = module0158.f10039(var45);
                                        SubLObject var53 = var41;
                                        final SubLObject var54 = (SubLObject)module0309.NIL;
                                        while (module0309.NIL == var53) {
                                            final SubLObject var55 = module0052.f3695(var52, var54);
                                            final SubLObject var56 = (SubLObject)SubLObjectFactory.makeBoolean(!var54.eql(var55));
                                            if (module0309.NIL != var56) {
                                                module0012.f476();
                                                SubLObject var57 = (SubLObject)module0309.NIL;
                                                try {
                                                    var57 = module0158.f10316(var55, (SubLObject)module0309.$ic76$, (SubLObject)module0309.NIL, (SubLObject)module0309.NIL);
                                                    SubLObject var188_233 = var41;
                                                    final SubLObject var189_234 = (SubLObject)module0309.NIL;
                                                    while (module0309.NIL == var188_233) {
                                                        final SubLObject var58 = module0052.f3695(var57, var189_234);
                                                        final SubLObject var191_235 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_234.eql(var58));
                                                        if (module0309.NIL != var191_235 && module0309.NIL != f21031(var58, var34, var35, var31)) {
                                                            var33 = (SubLObject)ConsesLow.cons(var58, var33);
                                                            if (module0309.NIL == module0144.$g1795$.getDynamicValue(var32)) {
                                                                var41 = (SubLObject)module0309.T;
                                                            }
                                                        }
                                                        var188_233 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_235 || module0309.NIL != var41);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject var4_231 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var32);
                                                        if (module0309.NIL != var57) {
                                                            module0158.f10319(var57);
                                                        }
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_231, var32);
                                                    }
                                                }
                                            }
                                            var53 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var56 || module0309.NIL != var41);
                                        }
                                        module0012.f475();
                                    }
                                    finally {
                                        module0012.$silent_progressP$.rebind(var51, var32);
                                        module0012.$g70$.rebind(var50, var32);
                                        module0012.$g69$.rebind(var49, var32);
                                        module0012.$g66$.rebind(var48, var32);
                                        module0012.$g68$.rebind(var47, var32);
                                        module0012.$g67$.rebind(var6_232, var32);
                                        module0012.$g65$.rebind(var5_231, var32);
                                        module0012.$g73$.rebind(var4_230, var32);
                                    }
                                }
                            }
                        }
                        else if (var43.eql((SubLObject)module0309.$ic59$)) {
                            var32.resetMultipleValues();
                            final SubLObject var59 = module0217.f14400(var39);
                            final SubLObject var60 = var32.secondMultipleValue();
                            final SubLObject var61 = var32.thirdMultipleValue();
                            var32.resetMultipleValues();
                            final SubLObject var62 = var61;
                            if (module0309.NIL != module0158.f10010(var59, var60, var62)) {
                                final SubLObject var63 = module0158.f10011(var59, var60, var62);
                                SubLObject var64 = var41;
                                final SubLObject var65 = (SubLObject)module0309.NIL;
                                while (module0309.NIL == var64) {
                                    final SubLObject var66 = module0052.f3695(var63, var65);
                                    final SubLObject var67 = (SubLObject)SubLObjectFactory.makeBoolean(!var65.eql(var66));
                                    if (module0309.NIL != var67) {
                                        SubLObject var68 = (SubLObject)module0309.NIL;
                                        try {
                                            var68 = module0158.f10316(var66, (SubLObject)module0309.$ic76$, (SubLObject)module0309.NIL, (SubLObject)module0309.NIL);
                                            SubLObject var188_234 = var41;
                                            final SubLObject var189_235 = (SubLObject)module0309.NIL;
                                            while (module0309.NIL == var188_234) {
                                                final SubLObject var69 = module0052.f3695(var68, var189_235);
                                                final SubLObject var191_236 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_235.eql(var69));
                                                if (module0309.NIL != var191_236 && module0309.NIL != f21031(var69, var34, var35, var31)) {
                                                    var33 = (SubLObject)ConsesLow.cons(var69, var33);
                                                    if (module0309.NIL == module0144.$g1795$.getDynamicValue(var32)) {
                                                        var41 = (SubLObject)module0309.T;
                                                    }
                                                }
                                                var188_234 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_236 || module0309.NIL != var41);
                                            }
                                        }
                                        finally {
                                            final SubLObject var4_232 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var32);
                                                if (module0309.NIL != var68) {
                                                    module0158.f10319(var68);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var4_232, var32);
                                            }
                                        }
                                    }
                                    var64 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var67 || module0309.NIL != var41);
                                }
                            }
                        }
                    }
                    finally {
                        module0144.$g1793$.rebind(var4_229, var32);
                    }
                }
                catch (Throwable var70) {
                    var42 = Errors.handleThrowable(var70, (SubLObject)module0309.$ic56$);
                }
                finally {
                    var32.throwStack.pop();
                }
            }
            finally {
                module0147.$g2096$.rebind(var38, var32);
                module0147.$g2094$.rebind(var37, var32);
                module0147.$g2095$.rebind(var36, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f21002(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0144.$g1775$.getDynamicValue(var2) && module0309.NIL != var1) {
            if (!module0144.$g1776$.getDynamicValue(var2).isNumber()) {
                return (SubLObject)module0309.T;
            }
            final SubLObject var3 = module0202.f12832(var1, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var4 = (SubLObject)((module0309.NIL != module0173.f10955(var3)) ? module0217.f14249(var3) : module0309.NIL);
            if (var4.isNumber()) {
                return Numbers.numGE(module0144.$g1776$.getDynamicValue(var2), var4);
            }
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21031(final SubLObject var144, final SubLObject var228, final SubLObject var22, final SubLObject var31) {
        final SubLThread var229 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0178.f11284(var144) && module0309.NIL != module0211.f13635(var144)) {
            final SubLObject var230 = module0178.f11285(var144);
            if (module0309.NIL != module0235.f15475(var228, var230, (SubLObject)module0309.T, (SubLObject)module0309.UNPROVIDED) && module0309.NIL == module0331.f22370(var22, module0205.f13326(var230, var31), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
                if (module0309.NIL != module0144.$g1787$.getDynamicValue(var229) && module0309.NIL == conses_high.member(var144, module0144.$g1790$.getDynamicValue(var229), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                    module0144.$g1790$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0144.$g1790$.getDynamicValue(var229)), var229);
                }
                return (SubLObject)module0309.T;
            }
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21025(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        return Types.sublisp_null(f21032(var10, var31, var2));
    }
    
    public static SubLObject f21032(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        final SubLThread var32 = SubLProcess.currentSubLThread();
        SubLObject var33 = (SubLObject)module0309.NIL;
        final SubLObject var34 = module0035.f2151(var31, module0193.f12079((SubLObject)module0309.ZERO_INTEGER), var10);
        final SubLObject var35 = module0205.f13326(var10, var31);
        if (module0309.NIL == module0152.f9726() || module0309.NIL == module0235.f15475(module0152.f9728(), var34, (SubLObject)module0309.T, (SubLObject)module0309.UNPROVIDED)) {
            final SubLObject var36 = module0147.$g2095$.currentBinding(var32);
            final SubLObject var37 = module0147.$g2094$.currentBinding(var32);
            final SubLObject var38 = module0147.$g2096$.currentBinding(var32);
            try {
                module0147.$g2095$.bind(module0147.f9545(var2), var32);
                module0147.$g2094$.bind(module0147.f9546(var2), var32);
                module0147.$g2096$.bind(module0147.f9549(var2), var32);
                final SubLObject var39 = module0217.f14404(var34, (SubLObject)module0309.$ic54$, (SubLObject)module0309.$ic55$);
                final SubLObject var40 = module0217.f14398(var39);
                SubLObject var41 = (SubLObject)module0309.NIL;
                final SubLObject var42 = var40;
                if (var42.eql((SubLObject)module0309.$ic57$)) {
                    final SubLObject var43 = module0217.f14399(var39);
                    if (module0309.NIL != f21002(var34)) {
                        final SubLObject var44 = var43;
                        if (module0309.NIL != module0158.f10038(var44)) {
                            final SubLObject var45 = (SubLObject)module0309.NIL;
                            final SubLObject var4_243 = module0012.$g73$.currentBinding(var32);
                            final SubLObject var5_244 = module0012.$g65$.currentBinding(var32);
                            final SubLObject var6_245 = module0012.$g67$.currentBinding(var32);
                            final SubLObject var46 = module0012.$g68$.currentBinding(var32);
                            final SubLObject var47 = module0012.$g66$.currentBinding(var32);
                            final SubLObject var48 = module0012.$g69$.currentBinding(var32);
                            final SubLObject var49 = module0012.$g70$.currentBinding(var32);
                            final SubLObject var50 = module0012.$silent_progressP$.currentBinding(var32);
                            try {
                                module0012.$g73$.bind(Time.get_universal_time(), var32);
                                module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var32), var32);
                                module0012.$g67$.bind((SubLObject)module0309.ONE_INTEGER, var32);
                                module0012.$g68$.bind((SubLObject)module0309.ZERO_INTEGER, var32);
                                module0012.$g66$.bind((SubLObject)module0309.ZERO_INTEGER, var32);
                                module0012.$g69$.bind((SubLObject)module0309.ZERO_INTEGER, var32);
                                module0012.$g70$.bind((SubLObject)module0309.T, var32);
                                module0012.$silent_progressP$.bind((SubLObject)((module0309.NIL != var45) ? module0012.$silent_progressP$.getDynamicValue(var32) : module0309.T), var32);
                                module0012.f474(var45);
                                final SubLObject var51 = module0158.f10039(var44);
                                SubLObject var52 = var41;
                                final SubLObject var53 = (SubLObject)module0309.NIL;
                                while (module0309.NIL == var52) {
                                    final SubLObject var54 = module0052.f3695(var51, var53);
                                    final SubLObject var55 = (SubLObject)SubLObjectFactory.makeBoolean(!var53.eql(var54));
                                    if (module0309.NIL != var55) {
                                        module0012.f476();
                                        SubLObject var56 = (SubLObject)module0309.NIL;
                                        try {
                                            var56 = module0158.f10316(var54, (SubLObject)module0309.$ic76$, (SubLObject)module0309.NIL, (SubLObject)module0309.NIL);
                                            SubLObject var188_246 = var41;
                                            final SubLObject var189_247 = (SubLObject)module0309.NIL;
                                            while (module0309.NIL == var188_246) {
                                                final SubLObject var57 = module0052.f3695(var56, var189_247);
                                                final SubLObject var191_248 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_247.eql(var57));
                                                if (module0309.NIL != var191_248 && module0309.NIL != f21033(var57, var34, var35, var31)) {
                                                    var33 = (SubLObject)ConsesLow.cons(var57, var33);
                                                    if (module0309.NIL == module0144.$g1795$.getDynamicValue(var32)) {
                                                        var41 = (SubLObject)module0309.T;
                                                    }
                                                }
                                                var188_246 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_248 || module0309.NIL != var41);
                                            }
                                        }
                                        finally {
                                            final SubLObject var4_244 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var32);
                                                if (module0309.NIL != var56) {
                                                    module0158.f10319(var56);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var4_244, var32);
                                            }
                                        }
                                    }
                                    var52 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var55 || module0309.NIL != var41);
                                }
                                module0012.f475();
                            }
                            finally {
                                module0012.$silent_progressP$.rebind(var50, var32);
                                module0012.$g70$.rebind(var49, var32);
                                module0012.$g69$.rebind(var48, var32);
                                module0012.$g66$.rebind(var47, var32);
                                module0012.$g68$.rebind(var46, var32);
                                module0012.$g67$.rebind(var6_245, var32);
                                module0012.$g65$.rebind(var5_244, var32);
                                module0012.$g73$.rebind(var4_243, var32);
                            }
                        }
                    }
                }
                else if (var42.eql((SubLObject)module0309.$ic59$)) {
                    var32.resetMultipleValues();
                    final SubLObject var58 = module0217.f14400(var39);
                    final SubLObject var59 = var32.secondMultipleValue();
                    final SubLObject var60 = var32.thirdMultipleValue();
                    var32.resetMultipleValues();
                    final SubLObject var61 = var60;
                    if (module0309.NIL != module0158.f10010(var58, var59, var61)) {
                        final SubLObject var62 = module0158.f10011(var58, var59, var61);
                        SubLObject var63 = var41;
                        final SubLObject var64 = (SubLObject)module0309.NIL;
                        while (module0309.NIL == var63) {
                            final SubLObject var65 = module0052.f3695(var62, var64);
                            final SubLObject var66 = (SubLObject)SubLObjectFactory.makeBoolean(!var64.eql(var65));
                            if (module0309.NIL != var66) {
                                SubLObject var67 = (SubLObject)module0309.NIL;
                                try {
                                    var67 = module0158.f10316(var65, (SubLObject)module0309.$ic76$, (SubLObject)module0309.NIL, (SubLObject)module0309.NIL);
                                    SubLObject var188_247 = var41;
                                    final SubLObject var189_248 = (SubLObject)module0309.NIL;
                                    while (module0309.NIL == var188_247) {
                                        final SubLObject var68 = module0052.f3695(var67, var189_248);
                                        final SubLObject var191_249 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_248.eql(var68));
                                        if (module0309.NIL != var191_249 && module0309.NIL != f21033(var68, var34, var35, var31)) {
                                            var33 = (SubLObject)ConsesLow.cons(var68, var33);
                                            if (module0309.NIL == module0144.$g1795$.getDynamicValue(var32)) {
                                                var41 = (SubLObject)module0309.T;
                                            }
                                        }
                                        var188_247 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_249 || module0309.NIL != var41);
                                    }
                                }
                                finally {
                                    final SubLObject var4_245 = Threads.$is_thread_performing_cleanupP$.currentBinding(var32);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0309.T, var32);
                                        if (module0309.NIL != var67) {
                                            module0158.f10319(var67);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var4_245, var32);
                                    }
                                }
                            }
                            var63 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var66 || module0309.NIL != var41);
                        }
                    }
                }
            }
            finally {
                module0147.$g2096$.rebind(var38, var32);
                module0147.$g2094$.rebind(var37, var32);
                module0147.$g2095$.rebind(var36, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f21033(final SubLObject var144, final SubLObject var228, final SubLObject var22, final SubLObject var31) {
        final SubLThread var229 = SubLProcess.currentSubLThread();
        if (module0309.NIL != module0178.f11284(var144)) {
            final SubLObject var230 = module0178.f11285(var144);
            if (module0309.NIL != module0235.f15475(var228, var230, (SubLObject)module0309.T, (SubLObject)module0309.UNPROVIDED) && module0309.NIL != module0328.f22230(var22, module0202.f12831(var230, var31, (SubLObject)module0309.UNPROVIDED), (SubLObject)module0309.UNPROVIDED)) {
                if (module0309.NIL != module0144.$g1787$.getDynamicValue(var229) && module0309.NIL == conses_high.member(var144, module0144.$g1790$.getDynamicValue(var229), Symbols.symbol_function((SubLObject)module0309.EQL), Symbols.symbol_function((SubLObject)module0309.IDENTITY))) {
                    module0144.$g1790$.setDynamicValue((SubLObject)ConsesLow.cons(var144, module0144.$g1790$.getDynamicValue(var229)), var229);
                }
                return (SubLObject)module0309.T;
            }
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21026(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        return Types.sublisp_null(f21034(var10, var31, var2));
    }
    
    public static SubLObject f21034(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21035(final SubLObject var144, final SubLObject var228, final SubLObject var22, final SubLObject var31) {
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21027(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        return Types.sublisp_null(f21036(var10, var31, var2));
    }
    
    public static SubLObject f21036(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        final SubLObject var32 = f21032(var10, var31, var2);
        final SubLObject var33 = f21034(var10, var31, var2);
        return ConsesLow.append(var32, var33);
    }
    
    public static SubLObject f21023(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        return (SubLObject)module0309.T;
    }
    
    public static SubLObject f21024(final SubLObject var10, final SubLObject var31, final SubLObject var2) {
        return (SubLObject)module0309.T;
    }
    
    public static SubLObject f20945(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        if (module0309.NIL == module0152.$g2108$.getDynamicValue(var23)) {
            return (SubLObject)module0309.NIL;
        }
        if (module0309.NIL != f21037(var22)) {
            return (SubLObject)module0309.T;
        }
        if (module0309.NIL != module0210.f13598(var22) && (module0309.NIL != module0226.f14982(module0205.f13276(var22), (SubLObject)module0309.UNPROVIDED) || module0309.NIL != module0226.f14985(module0205.f13276(var22), (SubLObject)module0309.UNPROVIDED) || module0309.NIL != module0226.f14989(var22, (SubLObject)module0309.UNPROVIDED))) {
            return (SubLObject)module0309.NIL;
        }
        if (module0309.NIL != module0210.f13576(var22, (SubLObject)module0309.UNPROVIDED) && module0309.NIL != module0205.f13215((SubLObject)module0309.$ic27$, var22, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED)) {
            return (SubLObject)module0309.T;
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21037(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0201.f12546(var142) || module0309.NIL != module0201.f12581(var142) || (module0309.NIL != module0152.$g2121$.getDynamicValue(var143) && module0309.NIL != module0304.f20296(var142)) || (module0309.NIL != module0152.$g2120$.getDynamicValue(var143) && var142.isKeyword()) || module0309.NIL != module0210.f13577(var142) || module0309.NIL != module0210.f13589(var142) || (module0309.NIL != module0131.$g1535$.getDynamicValue(var143) && module0309.NIL != module0167.f10813(var142)));
    }
    
    public static SubLObject f20962(final SubLObject var142, final SubLObject var2) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((module0309.NIL != module0144.$g1800$.getDynamicValue(var143) && module0309.NIL != module0172.f10917(var142)) || (module0309.NIL == module0167.f10813(var142) && module0309.NIL != module0210.f13571(var142) && (module0309.NIL != module0173.f10955(module0205.f13276(var142)) || module0309.NIL == module0279.f18485(module0144.$g1831$.getDynamicValue(var143), module0144.$g1833$.getDynamicValue(var143), var2))));
    }
    
    public static SubLObject f20952(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        return Equality.eql(module0144.$g1831$.getDynamicValue(var143), module0309.$ic10$);
    }
    
    public static SubLObject f20958(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        return Equality.eql(module0144.$g1831$.getDynamicValue(var143), module0309.$ic94$);
    }
    
    public static SubLObject f20960(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        return Equality.eql(module0144.$g1831$.getDynamicValue(var143), module0309.$ic95$);
    }
    
    public static SubLObject f20964(final SubLObject var142, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        return module0173.f10955(var142);
    }
    
    public static SubLObject f20956(final SubLObject var142) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0173.f10955(var142) && module0309.NIL != module0152.f9720());
    }
    
    public static SubLObject f20954(final SubLObject var142) {
        final SubLThread var143 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(((module0309.NIL != module0144.$g1799$.getDynamicValue(var143) || module0309.NIL != module0144.$g1800$.getDynamicValue(var143)) && module0309.NIL != module0173.f10955(var142)) || (module0309.NIL != module0144.$g1811$.getDynamicValue(var143) && (module0309.NIL != module0167.f10813(var142) || (module0309.NIL != module0279.f18539(var142, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED) && module0309.NIL != module0172.f10921(var142)))));
    }
    
    public static SubLObject f21038(final SubLObject var256, SubLObject var2, SubLObject var257) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (var257 == module0309.UNPROVIDED) {
            var257 = (SubLObject)module0309.$ic96$;
        }
        final SubLThread var258 = SubLProcess.currentSubLThread();
        if (module0309.NIL != var256) {
            module0303.f20212((SubLObject)module0309.UNPROVIDED);
            SubLObject var259 = (SubLObject)module0309.NIL;
            SubLObject var260 = (SubLObject)module0309.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var256, var256, (SubLObject)module0309.$ic97$);
            var259 = var256.first();
            SubLObject var261 = var256.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var261, var256, (SubLObject)module0309.$ic97$);
            var260 = var261.first();
            var261 = var261.rest();
            if (module0309.NIL == var261) {
                SubLObject var262 = (SubLObject)module0309.NIL;
                final SubLObject var263 = module0144.$g1795$.currentBinding(var258);
                final SubLObject var264 = module0152.$g2131$.currentBinding(var258);
                try {
                    module0144.$g1795$.bind((SubLObject)module0309.NIL, var258);
                    module0152.$g2131$.bind((SubLObject)module0309.NIL, var258);
                    if (module0309.NIL == var259) {
                        if (module0309.NIL == var262) {
                            SubLObject var265 = var260;
                            SubLObject var266 = (SubLObject)module0309.NIL;
                            var266 = var265.first();
                            while (module0309.NIL == var262 && module0309.NIL != var265) {
                                if (module0309.NIL == f21039(var266, var2, var257)) {
                                    var262 = (SubLObject)module0309.T;
                                }
                                var265 = var265.rest();
                                var266 = var265.first();
                            }
                        }
                        if (module0309.NIL == var262 && module0309.NIL != module0271.$g2563$.getDynamicValue(var258)) {
                            var262 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0307.f20758((SubLObject)ConsesLow.list(var256), var2, var257));
                        }
                    }
                }
                finally {
                    module0152.$g2131$.rebind(var264, var258);
                    module0144.$g1795$.rebind(var263, var258);
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var262);
            }
            cdestructuring_bind.cdestructuring_bind_error(var256, (SubLObject)module0309.$ic97$);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21040(final SubLObject var256, SubLObject var2, SubLObject var257) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (var257 == module0309.UNPROVIDED) {
            var257 = (SubLObject)module0309.$ic96$;
        }
        final SubLThread var258 = SubLProcess.currentSubLThread();
        SubLObject var259 = (SubLObject)module0309.NIL;
        final SubLObject var260 = module0271.$g2562$.currentBinding(var258);
        try {
            module0271.$g2562$.bind((SubLObject)module0309.NIL, var258);
            if (module0309.NIL == var259) {
                SubLObject var261;
                SubLObject var262;
                for (var261 = module0232.f15308(var256), var262 = (SubLObject)module0309.NIL, var262 = var261.first(); module0309.NIL == var259 && module0309.NIL != var261; var259 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == f21039(var262, var2, var257)), var261 = var261.rest(), var262 = var261.first()) {}
            }
        }
        finally {
            module0271.$g2562$.rebind(var260, var258);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var259);
    }
    
    public static SubLObject f21041(final SubLObject var10, SubLObject var2, SubLObject var257) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (var257 == module0309.UNPROVIDED) {
            var257 = (SubLObject)module0309.$ic96$;
        }
        final SubLThread var258 = SubLProcess.currentSubLThread();
        SubLObject var259 = (SubLObject)module0309.NIL;
        final SubLObject var260 = module0144.$g1795$.currentBinding(var258);
        try {
            module0144.$g1795$.bind((SubLObject)module0309.NIL, var258);
            var259 = f21039(var10, var2, var257);
        }
        finally {
            module0144.$g1795$.rebind(var260, var258);
        }
        if (module0309.NIL != var259 && module0309.NIL != module0271.$g2563$.getDynamicValue(var258)) {
            var259 = module0307.f20758((SubLObject)ConsesLow.list(module0232.f15330((SubLObject)module0309.NIL, (SubLObject)ConsesLow.list(var10))), var2, var257);
        }
        return var259;
    }
    
    public static SubLObject f21039(final SubLObject var10, SubLObject var2, SubLObject var257) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        if (var257 == module0309.UNPROVIDED) {
            var257 = (SubLObject)module0309.$ic96$;
        }
        final SubLThread var258 = SubLProcess.currentSubLThread();
        SubLObject var259 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0271.$g2562$.getDynamicValue(var258) || module0309.NIL != f20927(var10, var2));
        if (module0309.NIL != var259 && module0309.NIL != module0144.$g1746$.getDynamicValue(var258)) {
            if (module0309.NIL != module0202.f12859(var10)) {
                if (module0309.NIL != module0202.f12691(var10, var257)) {
                    var259 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0210.f13565(module0202.f12835(var10, (SubLObject)module0309.UNPROVIDED)) && module0309.NIL != module0259.f16854(module0202.f12834(var10, (SubLObject)module0309.UNPROVIDED), module0202.f12835(var10, (SubLObject)module0309.UNPROVIDED), var2, (SubLObject)module0309.UNPROVIDED));
                }
            }
            else if (module0309.NIL != module0202.f12865(var10) && module0309.NIL != module0202.f12691(var10, var257)) {
                var259 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != module0210.f13565(module0202.f12834(var10, (SubLObject)module0309.UNPROVIDED)) && module0309.NIL != module0210.f13565(module0202.f12835(var10, (SubLObject)module0309.UNPROVIDED)) && module0309.NIL != module0256.f16596(module0202.f12834(var10, (SubLObject)module0309.UNPROVIDED), module0202.f12835(var10, (SubLObject)module0309.UNPROVIDED), var2, (SubLObject)module0309.UNPROVIDED));
            }
        }
        return var259;
    }
    
    public static SubLObject f21042(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        module0274.f18061();
        module0303.f20212((SubLObject)module0309.UNPROVIDED);
        final SubLObject var146 = module0144.$g1795$.currentBinding(var145);
        try {
            module0144.$g1795$.bind((SubLObject)module0309.T, var145);
            if (module0309.NIL != module0178.f11284(var144)) {
                f21041(module0178.f11328(var144), module0178.f11287(var144), (SubLObject)module0309.UNPROVIDED);
            }
            else {
                f21043(module0178.f11282(var144), module0178.f11287(var144));
            }
        }
        finally {
            module0144.$g1795$.rebind(var146, var145);
        }
        return module0303.f20207();
    }
    
    public static SubLObject f21044(final SubLObject var44, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var45 = SubLProcess.currentSubLThread();
        module0274.f18061();
        module0303.f20212((SubLObject)module0309.UNPROVIDED);
        final SubLObject var46 = module0144.$g1795$.currentBinding(var45);
        try {
            module0144.$g1795$.bind((SubLObject)module0309.T, var45);
            f21043(var44, var2);
        }
        finally {
            module0144.$g1795$.rebind(var46, var45);
        }
        return module0303.f20207();
    }
    
    public static SubLObject f21043(final SubLObject var44, final SubLObject var2) {
        SubLObject var45 = module0232.f15306(var44);
        SubLObject var46 = (SubLObject)module0309.NIL;
        var46 = var45.first();
        while (module0309.NIL != var45) {
            f21041(var46, var2, (SubLObject)module0309.UNPROVIDED);
            var45 = var45.rest();
            var46 = var45.first();
        }
        var45 = module0232.f15308(var44);
        var46 = (SubLObject)module0309.NIL;
        var46 = var45.first();
        while (module0309.NIL != var45) {
            f21041(var46, var2, (SubLObject)module0309.UNPROVIDED);
            var45 = var45.rest();
            var46 = var45.first();
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21045(final SubLObject var10, SubLObject var2) {
        if (var2 == module0309.UNPROVIDED) {
            var2 = (SubLObject)module0309.NIL;
        }
        final SubLThread var11 = SubLProcess.currentSubLThread();
        module0274.f18061();
        final SubLObject var12 = module0144.$g1795$.currentBinding(var11);
        try {
            module0144.$g1795$.bind((SubLObject)module0309.T, var11);
            f21041(var10, var2, (SubLObject)module0309.UNPROVIDED);
        }
        finally {
            module0144.$g1795$.rebind(var12, var11);
        }
        return module0303.f20207();
    }
    
    public static SubLObject f21046(final SubLObject var265, final SubLObject var266) {
        f21047(var265, var266, (SubLObject)module0309.ZERO_INTEGER);
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21048(final SubLObject var265) {
        return (SubLObject)((var265.getClass() == $sX23552_native.class) ? module0309.T : module0309.NIL);
    }
    
    public static SubLObject f21049(final SubLObject var265) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.getField2();
    }
    
    public static SubLObject f21050(final SubLObject var265) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.getField3();
    }
    
    public static SubLObject f21051(final SubLObject var265) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.getField4();
    }
    
    public static SubLObject f21052(final SubLObject var265) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.getField5();
    }
    
    public static SubLObject f21053(final SubLObject var265) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.getField6();
    }
    
    public static SubLObject f21054(final SubLObject var265) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.getField7();
    }
    
    public static SubLObject f21055(final SubLObject var265, final SubLObject var267) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.setField2(var267);
    }
    
    public static SubLObject f21056(final SubLObject var265, final SubLObject var267) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.setField3(var267);
    }
    
    public static SubLObject f21057(final SubLObject var265, final SubLObject var267) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.setField4(var267);
    }
    
    public static SubLObject f21058(final SubLObject var265, final SubLObject var267) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.setField5(var267);
    }
    
    public static SubLObject f21059(final SubLObject var265, final SubLObject var267) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.setField6(var267);
    }
    
    public static SubLObject f21060(final SubLObject var265, final SubLObject var267) {
        assert module0309.NIL != f21048(var265) : var265;
        return var265.setField7(var267);
    }
    
    public static SubLObject f21061(SubLObject var268) {
        if (var268 == module0309.UNPROVIDED) {
            var268 = (SubLObject)module0309.NIL;
        }
        final SubLObject var269 = (SubLObject)new $sX23552_native();
        SubLObject var270;
        SubLObject var271;
        SubLObject var272;
        SubLObject var273;
        for (var270 = (SubLObject)module0309.NIL, var270 = var268; module0309.NIL != var270; var270 = conses_high.cddr(var270)) {
            var271 = var270.first();
            var272 = conses_high.cadr(var270);
            var273 = var271;
            if (var273.eql((SubLObject)module0309.$ic119$)) {
                f21055(var269, var272);
            }
            else if (var273.eql((SubLObject)module0309.$ic120$)) {
                f21056(var269, var272);
            }
            else if (var273.eql((SubLObject)module0309.$ic121$)) {
                f21057(var269, var272);
            }
            else if (var273.eql((SubLObject)module0309.$ic122$)) {
                f21058(var269, var272);
            }
            else if (var273.eql((SubLObject)module0309.$ic123$)) {
                f21059(var269, var272);
            }
            else if (var273.eql((SubLObject)module0309.$ic124$)) {
                f21060(var269, var272);
            }
            else {
                Errors.error((SubLObject)module0309.$ic125$, var271);
            }
        }
        return var269;
    }
    
    public static SubLObject f21062(final SubLObject var273, final SubLObject var274) {
        Functions.funcall(var274, var273, (SubLObject)module0309.$ic126$, (SubLObject)module0309.$ic127$, (SubLObject)module0309.SIX_INTEGER);
        Functions.funcall(var274, var273, (SubLObject)module0309.$ic128$, (SubLObject)module0309.$ic119$, f21049(var273));
        Functions.funcall(var274, var273, (SubLObject)module0309.$ic128$, (SubLObject)module0309.$ic120$, f21050(var273));
        Functions.funcall(var274, var273, (SubLObject)module0309.$ic128$, (SubLObject)module0309.$ic121$, f21051(var273));
        Functions.funcall(var274, var273, (SubLObject)module0309.$ic128$, (SubLObject)module0309.$ic122$, f21052(var273));
        Functions.funcall(var274, var273, (SubLObject)module0309.$ic128$, (SubLObject)module0309.$ic123$, f21053(var273));
        Functions.funcall(var274, var273, (SubLObject)module0309.$ic128$, (SubLObject)module0309.$ic124$, f21054(var273));
        Functions.funcall(var274, var273, (SubLObject)module0309.$ic129$, (SubLObject)module0309.$ic127$, (SubLObject)module0309.SIX_INTEGER);
        return var273;
    }
    
    public static SubLObject f21063(final SubLObject var273, final SubLObject var274) {
        return f21062(var273, var274);
    }
    
    public static SubLObject f21047(final SubLObject var46, final SubLObject var266, final SubLObject var275) {
        final SubLThread var276 = SubLProcess.currentSubLThread();
        final SubLObject var277 = f21064(var46);
        final SubLObject var278 = f21065(var46);
        if (module0309.NIL != module0309.$g2796$.getDynamicValue(var276)) {
            final SubLObject var279 = f21066(var46);
            final SubLObject var280 = f21067(var46);
            final SubLObject var281 = f21068(var46);
            PrintLow.format(var266, (SubLObject)module0309.$ic131$, new SubLObject[] { var281, var277, var278, var279, var280 });
        }
        else {
            PrintLow.format(var266, (SubLObject)module0309.$ic132$, var277, var278);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21064(final SubLObject var280) {
        assert module0309.NIL != f21048(var280) : var280;
        return f21049(var280);
    }
    
    public static SubLObject f21065(final SubLObject var280) {
        assert module0309.NIL != f21048(var280) : var280;
        return f21050(var280);
    }
    
    public static SubLObject f21066(final SubLObject var280) {
        assert module0309.NIL != f21048(var280) : var280;
        return f21051(var280);
    }
    
    public static SubLObject f21067(final SubLObject var280) {
        assert module0309.NIL != f21048(var280) : var280;
        return f21052(var280);
    }
    
    public static SubLObject f21069(final SubLObject var280) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == f21053(var280));
    }
    
    public static SubLObject f21070(final SubLObject var280) {
        return f21053(var280);
    }
    
    public static SubLObject f21071(final SubLObject var280) {
        return f21054(var280);
    }
    
    public static SubLObject f21072(final SubLObject var280) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == f21054(var280));
    }
    
    public static SubLObject f21073(final SubLObject var280) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL != f21070(var280) && module0309.NIL != f21071(var280));
    }
    
    public static SubLObject f21068(final SubLObject var280) {
        if (module0309.NIL != f21073(var280)) {
            return (SubLObject)module0309.$ic133$;
        }
        if (module0309.NIL != f21070(var280)) {
            return (SubLObject)module0309.$ic134$;
        }
        if (module0309.NIL != f21071(var280)) {
            return (SubLObject)module0309.$ic135$;
        }
        return (SubLObject)module0309.$ic136$;
    }
    
    public static SubLObject f21074(final SubLObject var276, final SubLObject var2, final SubLObject var277, final SubLObject var278, SubLObject var281, SubLObject var282) {
        if (var281 == module0309.UNPROVIDED) {
            var281 = (SubLObject)module0309.$ic137$;
        }
        if (var282 == module0309.UNPROVIDED) {
            var282 = (SubLObject)module0309.$ic137$;
        }
        final SubLObject var283 = f21061((SubLObject)module0309.UNPROVIDED);
        final SubLObject var284 = f21075(var276, var281);
        final SubLObject var285 = f21076(var276, var282);
        f21055(var283, var276);
        f21056(var283, var2);
        f21057(var283, var277);
        f21058(var283, var278);
        f21059(var283, var284);
        f21060(var283, var285);
        return var283;
    }
    
    public static SubLObject f21075(final SubLObject var276, final SubLObject var281) {
        final SubLThread var282 = SubLProcess.currentSubLThread();
        SubLObject var283 = (SubLObject)module0309.NIL;
        if (module0309.NIL != Types.booleanp(var281)) {
            var283 = var281;
        }
        else {
            final SubLObject var284 = module0147.$g2094$.currentBinding(var282);
            final SubLObject var285 = module0147.$g2095$.currentBinding(var282);
            try {
                module0147.$g2094$.bind((SubLObject)module0309.$ic11$, var282);
                module0147.$g2095$.bind(module0309.$ic12$, var282);
                var283 = module0202.f12691(var276, (SubLObject)module0309.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var285, var282);
                module0147.$g2094$.rebind(var284, var282);
            }
        }
        return var283;
    }
    
    public static SubLObject f21076(final SubLObject var276, final SubLObject var282) {
        SubLObject var283 = (SubLObject)module0309.NIL;
        if (module0309.NIL != Types.booleanp(var282)) {
            var283 = var282;
        }
        else {
            var283 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == module0202.f12635(var276));
        }
        return var283;
    }
    
    public static SubLObject f21077(final SubLObject var286, final SubLObject var287, final SubLObject var2) {
        return f21074((SubLObject)ConsesLow.list(module0309.$ic52$, var286, var287), var2, (SubLObject)module0309.$ic138$, (SubLObject)ConsesLow.list(var286, var287), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
    }
    
    public static SubLObject f21078(final SubLObject var288, final SubLObject var289, final SubLObject var2) {
        return f21074((SubLObject)ConsesLow.list(module0309.$ic36$, var288, var289), var2, (SubLObject)module0309.$ic139$, (SubLObject)ConsesLow.list(var288, var289), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
    }
    
    public static SubLObject f21079() {
        final SubLObject var32 = module0309.$g2797$.getGlobalValue();
        if (module0309.NIL != var32) {
            module0034.f1818(var32);
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21080() {
        return module0034.f1829(module0309.$g2797$.getGlobalValue(), (SubLObject)ConsesLow.list(module0309.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
    }
    
    public static SubLObject f21081() {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        SubLObject var4 = (SubLObject)module0309.NIL;
        final SubLObject var5 = module0147.$g2094$.currentBinding(var3);
        final SubLObject var6 = module0147.$g2095$.currentBinding(var3);
        try {
            module0147.$g2094$.bind((SubLObject)module0309.$ic11$, var3);
            module0147.$g2095$.bind(module0309.$ic12$, var3);
            final SubLObject var7 = (SubLObject)module0309.$ic141$;
            final SubLObject var8 = module0259.f16848(module0309.$ic142$, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var9 = Sequences.delete_if((SubLObject)module0309.$ic143$, var8, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var10 = conses_high.set_difference(var9, var7, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var11 = module0259.f16848(module0309.$ic144$, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var12 = Sequences.delete_if((SubLObject)module0309.$ic143$, var11, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var13 = conses_high.set_difference(var12, ConsesLow.append(var7, var10), (SubLObject)module0309.UNPROVIDED, (SubLObject)module0309.UNPROVIDED);
            var4 = ConsesLow.append(var7, var10, var13);
        }
        finally {
            module0147.$g2095$.rebind(var6, var3);
            module0147.$g2094$.rebind(var5, var3);
        }
        return var4;
    }
    
    public static SubLObject f21082() {
        SubLObject var225 = module0309.$g2797$.getGlobalValue();
        if (module0309.NIL == var225) {
            var225 = module0034.f1934((SubLObject)module0309.$ic140$, (SubLObject)module0309.$ic145$, (SubLObject)module0309.NIL, (SubLObject)module0309.EQ, (SubLObject)module0309.ZERO_INTEGER, (SubLObject)module0309.ONE_INTEGER);
        }
        SubLObject var226 = module0034.f1810(var225, (SubLObject)module0309.UNPROVIDED);
        if (var226 == module0309.$ic7$) {
            var226 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f21081()));
            module0034.f1812(var225, var226, (SubLObject)module0309.UNPROVIDED);
        }
        return module0034.f1959(var226);
    }
    
    public static SubLObject f21083(final SubLObject var1) {
        final SubLObject var2 = module0205.f13136(var1);
        if (module0309.NIL != module0201.f12580(var2)) {
            return f21084(var1);
        }
        if (module0309.NIL == module0173.f10955(var2)) {
            return (SubLObject)module0309.NIL;
        }
        SubLObject var3 = (SubLObject)module0309.NIL;
        SubLObject var5;
        final SubLObject var4 = var5 = f21082();
        SubLObject var6 = (SubLObject)module0309.NIL;
        var6 = var5.first();
        while (module0309.NIL != var5) {
            final SubLObject var7 = var6;
            if (module0309.NIL != module0158.f10010(var2, (SubLObject)module0309.ONE_INTEGER, var7)) {
                final SubLObject var8 = module0158.f10011(var2, (SubLObject)module0309.ONE_INTEGER, var7);
                SubLObject var9 = (SubLObject)module0309.NIL;
                final SubLObject var10 = (SubLObject)module0309.NIL;
                while (module0309.NIL == var9) {
                    final SubLObject var11 = module0052.f3695(var8, var10);
                    final SubLObject var12 = (SubLObject)SubLObjectFactory.makeBoolean(!var10.eql(var11));
                    if (module0309.NIL != var12) {
                        SubLObject var13 = (SubLObject)module0309.NIL;
                        try {
                            var13 = module0158.f10316(var11, (SubLObject)module0309.$ic76$, (SubLObject)module0309.$ic54$, (SubLObject)module0309.NIL);
                            SubLObject var188_302 = (SubLObject)module0309.NIL;
                            final SubLObject var189_303 = (SubLObject)module0309.NIL;
                            while (module0309.NIL == var188_302) {
                                final SubLObject var14 = module0052.f3695(var13, var189_303);
                                final SubLObject var191_305 = (SubLObject)SubLObjectFactory.makeBoolean(!var189_303.eql(var14));
                                if (module0309.NIL != var191_305) {
                                    final SubLObject var15 = f21085(var14, var1);
                                    if (module0309.NIL != var15) {
                                        var3 = (SubLObject)ConsesLow.cons(var15, var3);
                                    }
                                }
                                var188_302 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var191_305);
                            }
                        }
                        finally {
                            final SubLObject var16 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0309.T);
                                if (module0309.NIL != var13) {
                                    module0158.f10319(var13);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var16);
                            }
                        }
                    }
                    var9 = (SubLObject)SubLObjectFactory.makeBoolean(module0309.NIL == var12);
                }
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f21086(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0309.NIL;
        SubLObject var4;
        final SubLObject var3 = var4 = module0205.f13207(var1, (SubLObject)module0309.$ic146$);
        SubLObject var5 = (SubLObject)module0309.NIL;
        var5 = var4.first();
        while (module0309.NIL != var4) {
            if (module0309.NIL != module0202.f12590(var5)) {
                final SubLObject var6 = f21086(var5);
                var2 = ConsesLow.append(var2, var6);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        final SubLObject var7 = f21083(var1);
        var2 = ConsesLow.append(var2, var7);
        return var2;
    }
    
    public static SubLObject f21087(final SubLObject var280) {
        assert module0309.NIL != f21048(var280) : var280;
        final SubLObject var281 = f21066(var280);
        final SubLObject var282 = f21067(var280);
        assert module0309.NIL != Types.function_spec_p(var281) : var281;
        assert module0309.NIL != Types.listp(var282) : var282;
        return Functions.apply(var281, var282);
    }
    
    public static SubLObject f21084(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0309.NIL;
        final SubLObject var3 = module0205.f13136(var1);
        final SubLObject var4 = f21077(var3, module0309.$ic149$, module0132.$g1561$.getGlobalValue());
        var2 = (SubLObject)ConsesLow.cons(var4, var2);
        SubLObject var6;
        final SubLObject var5 = var6 = module0205.f13207(var1, (SubLObject)module0309.$ic146$);
        SubLObject var7 = (SubLObject)module0309.NIL;
        var7 = var6.first();
        while (module0309.NIL != var6) {
            if (module0309.NIL == module0201.f12580(var7)) {
                final SubLObject var8 = f21077(var7, module0309.$ic32$, module0132.$g1560$.getGlobalValue());
                var2 = (SubLObject)ConsesLow.cons(var8, var2);
            }
            var6 = var6.rest();
            var7 = var6.first();
        }
        return var2;
    }
    
    public static SubLObject f21085(final SubLObject var304, final SubLObject var1) {
        final SubLObject var305 = module0178.f11332(var304);
        final SubLObject var306 = module0178.f11287(var304);
        final SubLObject var307 = var305;
        if (var307.eql(module0309.$ic150$)) {
            final SubLObject var308 = module0178.f11335(var304);
            final SubLObject var309 = module0178.f11336(var304);
            final SubLObject var310 = module0205.f13134(var1, var308, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var311 = f21077(var310, var309, var306);
            return var311;
        }
        if (var307.eql(module0309.$ic151$)) {
            final SubLObject var308 = module0178.f11335(var304);
            final SubLObject var309 = module0178.f11336(var304);
            final SubLObject var310 = module0205.f13134(var1, var308, (SubLObject)module0309.UNPROVIDED);
            final SubLObject var311 = f21078(var310, var309, var306);
            return var311;
        }
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21088() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20927", "FORMULA-ARGS-OK-WRT-TYPE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20930", "S#23554", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20928", "S#23555", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20931", "S#23556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20932", "S#23557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20933", "S#23558", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20929", "S#23559", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20944", "S#22783", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20948", "S#23548", 0, 0, false);
        new $f20948$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20949", "S#23560", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20950", "S#23561", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20951", "S#23562", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20947", "S#23563", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20936", "S#20653", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20938", "S#22926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20937", "S#22925", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20940", "S#23564", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20941", "S#23565", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20942", "S#20655", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20939", "S#20654", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20967", "S#20642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20943", "S#23566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20946", "S#23567", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20955", "S#23568", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20957", "S#23569", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20963", "S#23570", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20973", "S#20664", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20974", "S#23571", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20975", "S#23572", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20976", "S#23573", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20953", "S#23574", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20959", "S#23575", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20961", "S#23576", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20977", "S#23577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20965", "S#23578", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20966", "S#23579", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20970", "S#23580", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20971", "S#23581", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20980", "S#23582", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20968", "S#23583", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20969", "S#23584", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20972", "S#23585", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20982", "S#23586", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20983", "S#23587", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20978", "S#23588", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20979", "S#23589", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20984", "S#22784", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20981", "S#22781", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20985", "S#23590", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20987", "S#23591", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20988", "S#22782", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20934", "S#23592", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20991", "S#23593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20989", "S#23594", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20990", "S#23595", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20935", "S#23596", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20992", "S#23597", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20993", "S#23598", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20999", "S#23599", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21000", "S#23600", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21003", "S#23601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20994", "S#23602", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21004", "S#23603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20995", "S#23604", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20996", "GAF-OK-WRT-ANTI-TRANSITIVE-PRED?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21005", "S#23605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21006", "S#23606", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21001", "S#23607", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21007", "S#23608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21009", "S#23609", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21008", "S#23610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21010", "S#23611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21011", "S#23612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21012", "S#23613", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21013", "S#23614", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20997", "S#23615", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21014", "S#23616", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20998", "S#23617", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21015", "S#23618", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20986", "S#23619", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21016", "S#23620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21017", "S#23621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21019", "S#23622", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21020", "S#23623", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21021", "S#22679", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21018", "S#23624", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21022", "S#23625", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21029", "S#23626", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21030", "S#23627", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21028", "S#23628", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21002", "S#23629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21031", "S#23630", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21025", "S#23631", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21032", "S#23632", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21033", "S#23633", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21026", "S#23634", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21034", "S#23635", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21035", "S#23636", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21027", "S#23637", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21036", "S#23638", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21023", "S#23639", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21024", "S#23640", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20945", "S#22687", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21037", "S#22774", 1, 0, false);
        new $f21037$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20962", "S#23641", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20952", "S#23642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20958", "S#23643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20960", "S#23644", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20964", "S#23645", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20956", "S#23646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f20954", "S#23647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21038", "S#23648", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21040", "S#23649", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21041", "S#20647", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21039", "S#23650", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21042", "S#23651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21044", "S#23652", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21043", "S#23653", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21045", "S#23654", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21046", "S#23655", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21048", "S#23553", 1, 0, false);
        new $f21048$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21049", "S#23656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21050", "S#23657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21051", "S#23658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21052", "S#23659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21053", "S#23660", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21054", "S#23661", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21055", "S#23662", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21056", "S#23663", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21057", "S#23664", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21058", "S#23665", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21059", "S#23666", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21060", "S#23667", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21061", "S#23668", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21062", "S#23669", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21063", "S#23670", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21047", "S#23671", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21064", "S#23672", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21065", "S#23673", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21066", "S#23674", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21067", "S#23675", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21069", "S#23676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21070", "S#23677", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21071", "S#23678", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21072", "S#23679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21073", "S#23680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21068", "S#23681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21074", "S#23682", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21075", "S#23683", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21076", "S#23684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21077", "S#23685", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21078", "S#23686", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21079", "S#23687", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21080", "S#23688", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21081", "S#23689", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21082", "S#23690", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21083", "S#12399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21086", "S#12400", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21087", "S#23691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21084", "S#23692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0309", "f21085", "S#23693", 2, 0, false);
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21089() {
        module0309.$g2792$ = SubLFiles.defparameter("S#23694", (SubLObject)module0309.NIL);
        module0309.$g2793$ = SubLFiles.deflexical("S#23695", (SubLObject)module0309.NIL);
        module0309.$g2794$ = SubLFiles.deflexical("S#23696", (SubLObject)module0309.NIL);
        module0309.$g2795$ = SubLFiles.defconstant("S#23697", (SubLObject)module0309.$ic98$);
        module0309.$g2796$ = SubLFiles.defparameter("S#23698", (SubLObject)module0309.NIL);
        module0309.$g2797$ = SubLFiles.deflexical("S#23699", (SubLObject)module0309.NIL);
        return (SubLObject)module0309.NIL;
    }
    
    public static SubLObject f21090() {
        module0034.f1909((SubLObject)module0309.$ic3$);
        module0034.f1895((SubLObject)module0309.$ic42$);
        module0034.f1909((SubLObject)module0309.$ic80$);
        module0034.f1895((SubLObject)module0309.$ic83$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0309.$g2795$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0309.$ic105$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0309.$ic106$);
        Structures.def_csetf((SubLObject)module0309.$ic107$, (SubLObject)module0309.$ic108$);
        Structures.def_csetf((SubLObject)module0309.$ic109$, (SubLObject)module0309.$ic110$);
        Structures.def_csetf((SubLObject)module0309.$ic111$, (SubLObject)module0309.$ic112$);
        Structures.def_csetf((SubLObject)module0309.$ic113$, (SubLObject)module0309.$ic114$);
        Structures.def_csetf((SubLObject)module0309.$ic115$, (SubLObject)module0309.$ic116$);
        Structures.def_csetf((SubLObject)module0309.$ic117$, (SubLObject)module0309.$ic118$);
        Equality.identity((SubLObject)module0309.$ic98$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0309.$g2795$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0309.$ic130$));
        module0034.f1909((SubLObject)module0309.$ic140$);
        return (SubLObject)module0309.NIL;
    }
    
    public void declareFunctions() {
        f21088();
    }
    
    public void initializeVariables() {
        f21089();
    }
    
    public void runTopLevelForms() {
        f21090();
    }
    
    static {
        me = (SubLFile)new module0309();
        module0309.$g2792$ = null;
        module0309.$g2793$ = null;
        module0309.$g2794$ = null;
        module0309.$g2795$ = null;
        module0309.$g2796$ = null;
        module0309.$g2797$ = null;
        $ic0$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("forAll"));
        $ic1$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic2$ = SubLObjectFactory.makeKeyword("INHIBITED-SEQUENCE-VARIABLE");
        $ic3$ = SubLObjectFactory.makeSymbol("S#23562", "CYC");
        $ic4$ = SubLObjectFactory.makeSymbol("S#23695", "CYC");
        $ic5$ = SubLObjectFactory.makeInteger(1024);
        $ic6$ = SubLObjectFactory.makeSymbol("S#23548", "CYC");
        $ic7$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic10$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic11$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic12$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic13$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic14$ = SubLObjectFactory.makeKeyword("WEAK-FORT");
        $ic15$ = SubLObjectFactory.makeKeyword("NOT-ISA-DISJOINT");
        $ic16$ = SubLObjectFactory.makeKeyword("NOT-QUOTED-ISA-DISJOINT");
        $ic17$ = SubLObjectFactory.makeKeyword("NOT-ISA");
        $ic18$ = SubLObjectFactory.makeKeyword("NOT-GENLS-DISJOINT");
        $ic19$ = SubLObjectFactory.makeKeyword("GENLS");
        $ic20$ = SubLObjectFactory.makeKeyword("NOT-GENLS");
        $ic21$ = SubLObjectFactory.makeKeyword("GENL-ISA");
        $ic22$ = SubLObjectFactory.makeKeyword("ISA-GENL");
        $ic23$ = SubLObjectFactory.makeKeyword("DIFFERENT");
        $ic24$ = SubLObjectFactory.makeKeyword("FORMAT");
        $ic25$ = SubLObjectFactory.makeSymbol("S#12761", "CYC");
        $ic26$ = SubLObjectFactory.makeKeyword("NAUT");
        $ic27$ = SubLObjectFactory.makeSymbol("S#22774", "CYC");
        $ic28$ = SubLObjectFactory.makeKeyword("ISA");
        $ic29$ = SubLObjectFactory.makeKeyword("QUOTED-ISA");
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction"));
        $ic32$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic33$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic34$ = SubLObjectFactory.makeKeyword("STRONG-FORT");
        $ic35$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic36$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-ISA-DISJOINT"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-GENLS-DISJOINT"));
        $ic40$ = SubLObjectFactory.makeString("invalid at test ~s in mal-intra-arg?");
        $ic41$ = SubLObjectFactory.makeString("invalid at test ~s in mal-inter-arg?");
        $ic42$ = SubLObjectFactory.makeSymbol("S#23594", "CYC");
        $ic43$ = SubLObjectFactory.makeString("~%at test fails: ~s in ~s fails #$definingMt constraint: ~s");
        $ic44$ = SubLObjectFactory.makeKeyword("DEFINING-MT-VIOLATION");
        $ic45$ = SubLObjectFactory.makeKeyword("ASYMMETRIC-PREDICATE");
        $ic46$ = SubLObjectFactory.makeKeyword("ANTI-SYMMETRIC-PREDICATE");
        $ic47$ = SubLObjectFactory.makeKeyword("IRREFLEXIVE-PREDICATE");
        $ic48$ = SubLObjectFactory.makeKeyword("ANTI-TRANSITIVE-PREDICATE");
        $ic49$ = SubLObjectFactory.makeKeyword("NEGATION-PREDS");
        $ic50$ = SubLObjectFactory.makeKeyword("NEGATION-INVERSES");
        $ic51$ = SubLObjectFactory.makeString("unknown predicate constraint: ~s");
        $ic52$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate"));
        $ic54$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic55$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE-EXTENT"), (SubLObject)SubLObjectFactory.makeKeyword("GAF-ARG"));
        $ic56$ = SubLObjectFactory.makeKeyword("AT-MAPPING-DONE");
        $ic57$ = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
        $ic58$ = SubLObjectFactory.makeSymbol("S#23601", "CYC");
        $ic59$ = SubLObjectFactory.makeKeyword("GAF-ARG");
        $ic60$ = SubLObjectFactory.makeString("Ignore it");
        $ic61$ = SubLObjectFactory.makeString("Unexpected index type when gathering asymmetric violations");
        $ic62$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AntiSymmetricBinaryPredicate"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IrreflexiveBinaryPredicate"));
        $ic64$ = SubLObjectFactory.makeKeyword("COMPLETES-CYCLE?");
        $ic65$ = SubLObjectFactory.makeKeyword("WHY-COMPLETES-CYCLE?");
        $ic66$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate"));
        $ic67$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("AntiTransitiveBinaryPredicate"));
        $ic68$ = SubLObjectFactory.makeSymbol("S#23612", "CYC");
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1821", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1832", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#1820", "CYC"));
        $ic70$ = SubLObjectFactory.makeSymbol("S#23608", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.TWO_INTEGER));
        $ic72$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.ONE_INTEGER, (SubLObject)module0309.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.TWO_INTEGER, (SubLObject)module0309.ONE_INTEGER));
        $ic73$ = SubLObjectFactory.makeSymbol("S#23611", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#15529", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#12347", "CYC");
        $ic76$ = SubLObjectFactory.makeKeyword("GAF");
        $ic77$ = SubLObjectFactory.makeKeyword("OVERLAP");
        $ic78$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $ic79$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $ic80$ = SubLObjectFactory.makeSymbol("S#23622", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#23696", "CYC");
        $ic82$ = SubLObjectFactory.makeInteger(128);
        $ic83$ = SubLObjectFactory.makeSymbol("S#22679", "CYC");
        $ic84$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SingleEntry"));
        $ic85$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEntry"));
        $ic86$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SetTheFormat"));
        $ic87$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singleEntryFormatInArgs"));
        $ic88$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("intervalEntryFormatInArgs"));
        $ic89$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("openEntryFormatInArgs"));
        $ic90$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("temporallyIntersectingEntryFormatInArgs"));
        $ic91$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("spatiallyIntersectingEntryFormatInArgs"));
        $ic92$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("spatioTemporallyIntersectingEntryFormatInArgs"));
        $ic93$ = SubLObjectFactory.makeString("unknown entry format: ~s");
        $ic94$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("natFunction"));
        $ic95$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("natArgument"));
        $ic96$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $ic98$ = SubLObjectFactory.makeSymbol("S#23552", "CYC");
        $ic99$ = SubLObjectFactory.makeSymbol("S#23553", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#2960", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23700", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15615", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23701", "CYC"));
        $ic101$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("TEST-ARGS"), (SubLObject)SubLObjectFactory.makeKeyword("CLOSED?"), (SubLObject)SubLObjectFactory.makeKeyword("ATOMIC?"));
        $ic102$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#23656", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23657", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23658", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23659", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23660", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23661", "CYC"));
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#23662", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23663", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23666", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#23667", "CYC"));
        $ic104$ = SubLObjectFactory.makeSymbol("S#23671", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#23655", "CYC");
        $ic106$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#23553", "CYC"));
        $ic107$ = SubLObjectFactory.makeSymbol("S#23656", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#23662", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#23657", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#23663", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#23658", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#23664", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#23659", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#23665", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#23660", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#23666", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#23661", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#23667", "CYC");
        $ic119$ = SubLObjectFactory.makeKeyword("SENTENCE");
        $ic120$ = SubLObjectFactory.makeKeyword("MT");
        $ic121$ = SubLObjectFactory.makeKeyword("TEST-FUNCTION");
        $ic122$ = SubLObjectFactory.makeKeyword("TEST-ARGS");
        $ic123$ = SubLObjectFactory.makeKeyword("CLOSED?");
        $ic124$ = SubLObjectFactory.makeKeyword("ATOMIC?");
        $ic125$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic126$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic127$ = SubLObjectFactory.makeSymbol("S#23668", "CYC");
        $ic128$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic129$ = SubLObjectFactory.makeKeyword("END");
        $ic130$ = SubLObjectFactory.makeSymbol("S#23670", "CYC");
        $ic131$ = SubLObjectFactory.makeString("<~a ARG-CONSTRAINT:~a:~a:~a:~a>");
        $ic132$ = SubLObjectFactory.makeString("<ARG-CONSTRAINT:~a:~a>");
        $ic133$ = SubLObjectFactory.makeString("GAF");
        $ic134$ = SubLObjectFactory.makeString("GNAF");
        $ic135$ = SubLObjectFactory.makeString("OAF");
        $ic136$ = SubLObjectFactory.makeString("ONAF");
        $ic137$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic138$ = SubLObjectFactory.makeSymbol("ISA?");
        $ic139$ = SubLObjectFactory.makeSymbol("GENLS?");
        $ic140$ = SubLObjectFactory.makeSymbol("S#23690", "CYC");
        $ic141$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argGenl")));
        $ic142$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArgTypePredicate"));
        $ic143$ = SubLObjectFactory.makeSymbol("S#17176", "CYC");
        $ic144$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ArgConstraintPredicate"));
        $ic145$ = SubLObjectFactory.makeSymbol("S#23699", "CYC");
        $ic146$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic147$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic148$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic149$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Relation"));
        $ic150$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $ic151$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("argGenl"));
    }
    
    public static final class $f20948$ZeroArityFunction extends ZeroArityFunction
    {
        public $f20948$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23548"));
        }
        
        public SubLObject processItem() {
            return module0309.f20948();
        }
    }
    
    public static final class $f21037$UnaryFunction extends UnaryFunction
    {
        public $f21037$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22774"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return module0309.f21037(var136);
        }
    }
    
    public static final class $sX23552_native extends SubLStructNative
    {
        public SubLObject $sentence;
        public SubLObject $mt;
        public SubLObject $test_function;
        public SubLObject $test_args;
        public SubLObject $closedP;
        public SubLObject $atomicP;
        private static final SubLStructDeclNative structDecl;
        
        public $sX23552_native() {
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$test_function = (SubLObject)CommonSymbols.NIL;
            this.$test_args = (SubLObject)CommonSymbols.NIL;
            this.$closedP = (SubLObject)CommonSymbols.NIL;
            this.$atomicP = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX23552_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$sentence;
        }
        
        public SubLObject getField3() {
            return this.$mt;
        }
        
        public SubLObject getField4() {
            return this.$test_function;
        }
        
        public SubLObject getField5() {
            return this.$test_args;
        }
        
        public SubLObject getField6() {
            return this.$closedP;
        }
        
        public SubLObject getField7() {
            return this.$atomicP;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$sentence = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$test_function = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$test_args = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$closedP = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$atomicP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX23552_native.class, module0309.$ic98$, module0309.$ic99$, module0309.$ic100$, module0309.$ic101$, new String[] { "$sentence", "$mt", "$test_function", "$test_args", "$closedP", "$atomicP" }, module0309.$ic102$, module0309.$ic103$, module0309.$ic104$);
        }
    }
    
    public static final class $f21048$UnaryFunction extends UnaryFunction
    {
        public $f21048$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#23553"));
        }
        
        public SubLObject processItem(final SubLObject var136) {
            return module0309.f21048(var136);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0309.class
	Total time: 2401 ms
	
	Decompiled with Procyon 0.5.32.
*/