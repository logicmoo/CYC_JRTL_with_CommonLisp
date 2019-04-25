package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0205 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0205";
    public static final String myFingerPrint = "a1098d3ec9ff4fb5179cd46077101f9879749e7309a9d3b236a1e4737eb86784";
    public static SubLSymbol $g2314$;
    public static SubLSymbol $g2315$;
    private static SubLSymbol $g2316$;
    private static SubLSymbol $g2317$;
    private static SubLSymbol $g2318$;
    private static SubLSymbol $g2319$;
    private static SubLSymbol $g2320$;
    private static SubLSymbol $g2321$;
    private static SubLSymbol $g2322$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
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
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLInteger $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLObject $ic30$;
    private static final SubLObject $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLObject $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLInteger $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLObject $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLInteger $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLObject $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLList $ic76$;
    private static final SubLString $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLList $ic81$;
    private static final SubLString $ic82$;
    private static final SubLList $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLList $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLList $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLList $ic95$;
    private static final SubLList $ic96$;
    private static final SubLList $ic97$;
    private static final SubLList $ic98$;
    private static final SubLList $ic99$;
    private static final SubLList $ic100$;
    private static final SubLList $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    
    public static SubLObject f13123(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0205.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0205.$ic2$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0205.$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0205.$ic4$, var5)), ConsesLow.append(var6, (SubLObject)module0205.NIL));
    }
    
    public static SubLObject f13124(final SubLObject var1, final SubLObject var2) {
        SubLObject var4;
        final SubLObject var3 = var4 = var1.rest();
        SubLObject var5 = (SubLObject)module0205.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var4, var3, (SubLObject)module0205.$ic2$);
        var5 = var4.first();
        final SubLObject var6;
        var4 = (var6 = var4.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0205.$ic3$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0205.$ic5$, var5)), ConsesLow.append(var6, (SubLObject)module0205.NIL));
    }
    
    public static SubLObject f13125(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.$g2314$.getDynamicValue(var10) != module0205.$ic0$ || module0205.NIL != module0202.f12639(var9) || module0205.NIL != module0202.f12714(var9));
    }
    
    public static SubLObject f13126(final SubLObject var11, final SubLObject var12) {
        final SubLThread var13 = SubLProcess.currentSubLThread();
        return f13127(var11, var12, module0205.$g2314$.getDynamicValue(var13));
    }
    
    public static SubLObject f13127(final SubLObject var11, final SubLObject var12, final SubLObject var13) {
        SubLObject var14 = (SubLObject)module0205.NIL;
        if (var13.eql((SubLObject)module0205.$ic0$)) {
            var14 = f13128(var11, var12);
        }
        else if (var13.eql((SubLObject)module0205.$ic6$)) {
            var14 = f13129(var11, var12);
        }
        else {
            var14 = Functions.funcall(var13, var11, var12);
        }
        return var14;
    }
    
    public static SubLObject f13130(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        return Functions.funcall(module0205.$g2315$.getDynamicValue(var12), var11);
    }
    
    public static SubLObject f13128(final SubLObject var11, final SubLObject var12) {
        if (module0205.NIL != module0202.f12729(var11, var12, (SubLObject)module0205.UNPROVIDED)) {
            return f13130(var11);
        }
        return module0202.f12639(var11);
    }
    
    public static SubLObject f13131(final SubLObject var11, final SubLObject var12) {
        if (module0205.TWO_INTEGER.eql(var12) && module0205.NIL != module0202.f12589(var11, module0205.$ic7$)) {
            return (SubLObject)module0205.T;
        }
        if (module0205.NIL != module0202.f12729(var11, var12, (SubLObject)module0205.UNPROVIDED)) {
            return f13130(var11);
        }
        return module0202.f12641(var11);
    }
    
    public static SubLObject f13129(final SubLObject var11, final SubLObject var12) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != f13128(var11, var12) || module0205.NIL != module0279.f18485(f13132(var11), var12, (SubLObject)module0205.UNPROVIDED));
    }
    
    public static SubLObject f13133(final SubLObject var11, final SubLObject var12) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != f13128(var11, var12) || (module0205.NIL == module0202.f12871(var11) && (module0205.NIL != module0206.f13472(f13134(var11, var12, (SubLObject)module0205.UNPROVIDED)) || module0205.NIL != module0226.f14837(f13132(var11), var12))));
    }
    
    public static SubLObject f13135(final SubLObject var11, final SubLObject var12) {
        if (module0205.NIL != module0202.f12589(var11, module0205.$ic8$) || module0205.NIL != module0202.f12628(f13136(var11)) || module0205.NIL != module0202.f12626(f13136(var11))) {
            return (SubLObject)module0205.NIL;
        }
        return f13133(var11, var12);
    }
    
    public static SubLObject f13137(final SubLObject var11, final SubLObject var12) {
        return module0206.f13472(f13134(var11, var12, (SubLObject)module0205.UNPROVIDED));
    }
    
    public static SubLObject f13138(final SubLObject var11, final SubLObject var12) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != f13129(var11, var12) || module0205.NIL != f13137(var11, var12));
    }
    
    public static SubLObject f13139(final SubLObject var11, final SubLObject var12) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != f13128(var11, var12) || module0205.NIL != module0202.f12872(var11));
    }
    
    public static SubLObject f13140(final SubLObject var11) {
        return module0202.f12639(var11);
    }
    
    public static SubLObject f13141(final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0167.f10822(var18) || module0205.NIL != assertion_handles_oc.f11045(var18) || module0205.NIL != module0193.f12067(var18));
    }
    
    public static SubLObject f13142(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0205.NIL != module0167.f10813(var19)) {
            return module0202.f12702(Functions.funcall(module0146.$g1963$.getDynamicValue(var20), var19));
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var19)) {
            return module0202.f12702(Functions.funcall(module0146.$g1962$.getDynamicValue(var20), var19));
        }
        if (module0205.NIL != module0193.f12067(var19)) {
            return module0193.f12082(var19);
        }
        return var19;
    }
    
    public static SubLObject f13143(final SubLObject var19) {
        final SubLThread var20 = SubLProcess.currentSubLThread();
        if (module0205.NIL != module0167.f10813(var19)) {
            return Functions.funcall(module0146.$g1963$.getDynamicValue(var20), var19);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var19)) {
            return Functions.funcall(module0146.$g1962$.getDynamicValue(var20), var19);
        }
        if (module0205.NIL != module0193.f12067(var19)) {
            return module0193.f12082(var19);
        }
        return var19;
    }
    
    public static SubLObject f13144(final SubLObject var20) {
        if (module0205.NIL == f13145(Symbols.symbol_function((SubLObject)module0205.$ic9$), var20, (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED)) {
            return var20;
        }
        return f13146(f13147(f13148(var20), Symbols.symbol_function((SubLObject)module0205.$ic9$), Symbols.symbol_function((SubLObject)module0205.$ic10$), (SubLObject)module0205.T, (SubLObject)module0205.UNPROVIDED));
    }
    
    public static SubLObject f13149(final SubLObject var20) {
        if (module0205.NIL == f13145(Symbols.symbol_function((SubLObject)module0205.$ic9$), var20, (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED)) {
            return var20;
        }
        return f13150(f13151(f13152(var20), Symbols.symbol_function((SubLObject)module0205.$ic9$), Symbols.symbol_function((SubLObject)module0205.$ic11$), (SubLObject)module0205.T, (SubLObject)module0205.UNPROVIDED));
    }
    
    public static SubLObject f13153(final SubLObject var21) {
        if (module0205.NIL == module0035.f2439(Symbols.symbol_function((SubLObject)module0205.$ic9$), var21, (SubLObject)module0205.UNPROVIDED)) {
            return var21;
        }
        return module0202.f12997(f13144(module0202.f12996(var21)));
    }
    
    public static SubLObject f13154(final SubLObject var22) {
        if (module0205.NIL != constant_handles_oc.f8449(var22)) {
            return var22;
        }
        if (var22.isString()) {
            return var22;
        }
        if (var22.isNumber()) {
            return var22;
        }
        if (module0205.NIL != f13141(var22)) {
            return f13144(var22);
        }
        if (var22.isCons()) {
            return module0035.f2071(f13154(var22.first()), f13154(var22.rest()), var22);
        }
        return var22;
    }
    
    public static SubLObject f13155(final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != f13156(var18) || module0205.NIL != f13157(var18));
    }
    
    public static SubLObject f13156(final SubLObject var18) {
        return constant_handles_oc.f8449(var18);
    }
    
    public static SubLObject f13157(final SubLObject var18) {
        return module0552.f34023(var18);
    }
    
    public static SubLObject f13158(final SubLObject var18) {
        return f13157(var18);
    }
    
    public static SubLObject f13159(final SubLObject var23) {
        if (module0205.NIL != module0167.f10813(var23)) {
            return (SubLObject)module0205.$ic12$;
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var23)) {
            return (SubLObject)module0205.$ic13$;
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13160(final SubLObject var23) {
        if (module0205.NIL != module0167.f10813(var23)) {
            return module0167.f10803(var23);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var23)) {
            return assertion_handles_oc.f11025(var23);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13161(final SubLObject var23) {
        return (SubLObject)ConsesLow.cons(f13159(var23), f13160(var23));
    }
    
    public static SubLObject f13162(final SubLObject var24) {
        final SubLObject var25 = var24.first();
        final SubLObject var26 = var24.rest();
        if (var26.isInteger()) {
            final SubLObject var27 = var25;
            if (var27.eql((SubLObject)module0205.$ic12$)) {
                return module0167.f10832(var26);
            }
            if (var27.eql((SubLObject)module0205.$ic13$)) {
                return assertion_handles_oc.f11053(var26);
            }
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13163(final SubLObject var11) {
        final SubLObject var12 = module0172.f10921(var11);
        return (module0205.NIL != var12) ? var12 : module0288.f19338(var11, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13164(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var13 = (SubLObject)module0205.NIL;
        final SubLObject var14 = module0146.$g2008$.currentBinding(var12);
        final SubLObject var15 = module0146.$g2009$.currentBinding(var12);
        try {
            module0146.$g2008$.bind((SubLObject)module0205.T, var12);
            module0146.$g2009$.bind((SubLObject)module0205.T, var12);
            final SubLObject var16 = module0279.f18568(var11);
            var13 = ((module0205.NIL != var16) ? var16 : module0288.f19338(var11, (SubLObject)module0205.UNPROVIDED));
        }
        finally {
            module0146.$g2009$.rebind(var15, var12);
            module0146.$g2008$.rebind(var14, var12);
        }
        return var13;
    }
    
    public static SubLObject f13165(final SubLObject var23) {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        if (module0205.NIL != module0167.f10813(var23)) {
            return Functions.funcall(module0146.$g1963$.getDynamicValue(var24), var23);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var23)) {
            return Functions.funcall(module0146.$g1962$.getDynamicValue(var24), var23);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13166(final SubLObject var23) {
        if (module0205.NIL != module0167.f10813(var23)) {
            return module0172.f10930(var23);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var23)) {
            return module0538.f33483(var23);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13167(final SubLObject var23, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        return f13168(Functions.funcall(module0146.$g1964$.getDynamicValue(var31), var23), var30, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13169(final SubLObject var23, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        return module0538.f33373(Functions.funcall(module0146.$g1964$.getDynamicValue(var31), var23), var30);
    }
    
    public static SubLObject f13170(final SubLObject var23) {
        if (module0205.NIL != module0167.f10813(var23)) {
            return module0210.f13573(module0172.f10915(var23));
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var23)) {
            return module0207.f13509(module0538.f33478(var23, (SubLObject)module0205.UNPROVIDED));
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13171(final SubLObject var23) {
        if (module0205.NIL != module0167.f10813(var23)) {
            return module0167.f10824(var23, (SubLObject)module0205.UNPROVIDED);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var23)) {
            return module0178.f11361(var23, (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13172() {
        return ConsesLow.nconc(module0213.f13969(), module0213.f13973());
    }
    
    public static SubLObject f13173(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        return module0036.f2531(var11, Symbols.symbol_function((SubLObject)module0205.$ic14$), module0146.$g1964$.getDynamicValue(var12), (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13174() {
        return Numbers.add(module0167.f10796(), assertion_handles_oc.f11019());
    }
    
    public static SubLObject f13175(final SubLObject var23, final SubLObject var30) {
        final SubLObject var31 = f13165(var23);
        return ConsesLow.nconc(f13168(var31, var30, (SubLObject)module0205.UNPROVIDED), f13176(var31, var30, (SubLObject)module0205.UNPROVIDED));
    }
    
    public static SubLObject f13177(final SubLObject var23) {
        return ConsesLow.nconc((SubLObject)((module0205.NIL != module0167.f10813(var23)) ? module0230.f15279(var23) : module0205.NIL), module0226.f15093(var23, (SubLObject)module0205.T));
    }
    
    public static SubLObject f13178(final SubLObject var23) {
        return (SubLObject)ConsesLow.cons(var23, f13175(var23, (SubLObject)module0205.T));
    }
    
    public static SubLObject f13179(final SubLObject var9, final SubLObject var31, final SubLObject var30, final SubLObject var32, final SubLObject var33) {
        SubLObject var34 = (SubLObject)((module0205.NIL != Functions.funcall(var31, Functions.funcall(var32, var9))) ? ConsesLow.list(var9) : module0205.NIL);
        if (module0205.NIL != var33 || module0205.NIL == var34) {
            if (module0205.NIL != var30 && module0205.NIL != f13141(var9)) {
                var34 = ConsesLow.nconc(f13179(f13143(var9), var31, (SubLObject)module0205.T, var32, var33), var34);
            }
            else if (module0205.NIL != module0202.f12590(var9)) {
                final SubLObject var35 = f13125(var9);
                final SubLObject var36 = f13180(var9, (SubLObject)module0205.$ic15$);
                SubLObject var37 = (SubLObject)module0205.NIL;
                SubLObject var38 = (SubLObject)module0205.NIL;
                SubLObject var39 = (SubLObject)module0205.NIL;
                var37 = var36;
                var38 = var37.first();
                for (var39 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL != var37; var37 = var37.rest(), var38 = var37.first(), var39 = module0048.f_1X(var39)) {
                    if (module0205.NIL == var35 || module0205.NIL == f13126(var9, var39)) {
                        var34 = ConsesLow.nconc(f13179(var38, var31, var30, var32, var33), var34);
                    }
                }
            }
        }
        return var34;
    }
    
    public static SubLObject f13181(final SubLObject var9, final SubLObject var31, final SubLObject var30, final SubLObject var38, final SubLObject var32, final SubLObject var33) {
        return module0035.f2269(f13179(var9, var31, var30, var32, var33), var38, var32, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13182(final SubLObject var9, final SubLObject var31, SubLObject var30, SubLObject var38, SubLObject var32, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        return f13179(var9, var31, var30, var32, var33);
    }
    
    public static SubLObject f13183(final SubLObject var9, final SubLObject var31, SubLObject var30, SubLObject var38, SubLObject var32, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        return f13181(var9, var31, var30, var38, var32, var33);
    }
    
    public static SubLObject f13184(final SubLObject var31, final SubLObject var39, SubLObject var30, SubLObject var38, SubLObject var32, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        assert module0205.NIL != assertion_handles_oc.f11035(var39) : var39;
        if (module0205.NIL == f13141(var39)) {
            return (SubLObject)module0205.NIL;
        }
        final SubLObject var40 = f13181(module0178.f11287(var39), var31, var30, var38, var32, var33);
        final SubLObject var41 = f13181(module0178.f11289(var39), var31, var30, var38, var32, var33);
        if (module0205.NIL == var40) {
            return var41;
        }
        if (module0205.NIL == var41) {
            return var40;
        }
        return module0035.f2269(ConsesLow.nconc(var40, var41), var38, var32, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13185(final SubLObject var42, final SubLObject var43, SubLObject var30, SubLObject var38, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        final SubLThread var44 = SubLProcess.currentSubLThread();
        SubLObject var45 = (SubLObject)module0205.NIL;
        final SubLObject var46 = module0205.$g2316$.currentBinding(var44);
        final SubLObject var47 = module0205.$g2317$.currentBinding(var44);
        try {
            module0205.$g2316$.bind(var42, var44);
            module0205.$g2317$.bind(var38, var44);
            var45 = Sequences.length(f13179(var43, (SubLObject)module0205.$ic17$, var30, Symbols.symbol_function((SubLObject)module0205.IDENTITY), var33));
        }
        finally {
            module0205.$g2317$.rebind(var47, var44);
            module0205.$g2316$.rebind(var46, var44);
        }
        return var45;
    }
    
    public static SubLObject f13186(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        return Functions.funcall(module0205.$g2317$.getDynamicValue(var45), module0205.$g2316$.getDynamicValue(var45), var44);
    }
    
    public static SubLObject f13187(final SubLObject var45, final SubLObject var31, SubLObject var30, SubLObject var38, SubLObject var32, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        SubLObject var46 = (SubLObject)module0205.NIL;
        SubLObject var47 = var45;
        SubLObject var48 = (SubLObject)module0205.NIL;
        var48 = var47.first();
        while (module0205.NIL != var47) {
            final SubLObject var49 = f13179(var48, var31, var30, var32, var33);
            var46 = ConsesLow.nconc(var46, var49);
            var47 = var47.rest();
            var48 = var47.first();
        }
        return module0035.f2269(var46, var38, var32, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13188(final SubLObject var11, final SubLObject var31, SubLObject var30, SubLObject var38, SubLObject var32, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13183(var11, var31, var30, var38, var32, var33);
    }
    
    public static SubLObject f13189(final SubLObject var9, SubLObject var30, SubLObject var33, SubLObject var48) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        if (var48 == module0205.UNPROVIDED) {
            var48 = (SubLObject)module0205.T;
        }
        return (module0205.NIL != var48) ? f13181(var9, Symbols.symbol_function((SubLObject)module0205.$ic19$), var30, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY), var33) : f13179(var9, Symbols.symbol_function((SubLObject)module0205.$ic19$), var30, Symbols.symbol_function((SubLObject)module0205.IDENTITY), var33);
    }
    
    public static SubLObject f13190(final SubLObject var45, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        return f13187(var45, Symbols.symbol_function((SubLObject)module0205.$ic19$), var30, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY), var33);
    }
    
    public static SubLObject f13191(final SubLObject var11, SubLObject var30, SubLObject var33, SubLObject var48) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        if (var48 == module0205.UNPROVIDED) {
            var48 = (SubLObject)module0205.T;
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13189(var11, var30, var33, var48);
    }
    
    public static SubLObject f13192(final SubLObject var9, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        return f13181(var9, Symbols.symbol_function((SubLObject)module0205.$ic20$), var30, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY), (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13193(final SubLObject var45, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        return f13187(var45, Symbols.symbol_function((SubLObject)module0205.$ic20$), var30, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13194(final SubLObject var11, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13192(var11, var30);
    }
    
    public static SubLObject f13195(final SubLObject var9, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        return f13181(var9, Symbols.symbol_function((SubLObject)module0205.$ic21$), var30, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY), var33);
    }
    
    public static SubLObject f13196(final SubLObject var45, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        return f13187(var45, Symbols.symbol_function((SubLObject)module0205.$ic21$), var30, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY), var33);
    }
    
    public static SubLObject f13168(final SubLObject var11, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13195(var11, var30, var33);
    }
    
    public static SubLObject f13197(final SubLObject var9, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        return f13181(var9, Symbols.symbol_function((SubLObject)module0205.$ic16$), var30, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY), var33);
    }
    
    public static SubLObject f13198(final SubLObject var45, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        return f13187(var45, Symbols.symbol_function((SubLObject)module0205.$ic16$), var30, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY), var33);
    }
    
    public static SubLObject f13176(final SubLObject var11, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13197(var11, var30, var33);
    }
    
    public static SubLObject f13199(final SubLObject var39, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        assert module0205.NIL != assertion_handles_oc.f11035(var39) : var39;
        return f13197(module0538.f33367(var39, (SubLObject)module0205.UNPROVIDED), var30, var33);
    }
    
    public static SubLObject f13200(final SubLObject var27, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        assert module0205.NIL != module0167.f10813(var27) : var27;
        return f13197(var27, var30, var33);
    }
    
    public static SubLObject f13201(final SubLObject var27, SubLObject var30, SubLObject var33) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var33 == module0205.UNPROVIDED) {
            var33 = (SubLObject)module0205.T;
        }
        return f13195(module0172.f10915(var27), var30, var33);
    }
    
    public static SubLObject f13202(final SubLObject var11, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (!var11.isAtom()) {
            if (module0205.NIL != var30 && module0205.NIL != module0167.f10813(var11)) {
                return f13202(module0172.f10915(var11), var30);
            }
            if (module0205.NIL != var30 && module0205.NIL != assertion_handles_oc.f11035(var11)) {
                return f13202(module0538.f33478(var11, (SubLObject)module0205.UNPROVIDED), var30);
            }
            if (module0205.NIL != module0202.f12592(var11)) {
                return f13202(f13203(var11, (SubLObject)module0205.UNPROVIDED), var30);
            }
            if (module0205.NIL != module0202.f12595(var11) || module0205.NIL != module0202.f12594(var11)) {
                SubLObject var32 = (SubLObject)module0205.NIL;
                SubLObject var34;
                final SubLObject var33 = var34 = f13180(var11, (SubLObject)module0205.$ic22$);
                SubLObject var35 = (SubLObject)module0205.NIL;
                var35 = var34.first();
                while (module0205.NIL != var34) {
                    var32 = (SubLObject)ConsesLow.cons(f13202(var35, var30), var32);
                    var34 = var34.rest();
                    var35 = var34.first();
                }
                return var32;
            }
            if (module0205.NIL != module0202.f12597(var11)) {
                return conses_high.union(f13202(f13203(var11, (SubLObject)module0205.UNPROVIDED), var30), f13202(f13204(var11, (SubLObject)module0205.UNPROVIDED), var30), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
            }
            if (module0205.NIL != module0202.f12648(var11)) {
                return conses_high.union(f13202(f13203(var11, (SubLObject)module0205.UNPROVIDED), var30), f13202(f13204(var11, (SubLObject)module0205.UNPROVIDED), var30), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
            }
            if (module0205.NIL != module0202.f12604(var11) || module0205.NIL != module0202.f12606(var11)) {
                return conses_high.adjoin(f13203(var11, (SubLObject)module0205.UNPROVIDED), f13202(f13204(var11, (SubLObject)module0205.UNPROVIDED), var30), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
            }
            if (module0205.NIL != module0202.f12623(var11)) {
                return conses_high.adjoin(f13204(var11, (SubLObject)module0205.UNPROVIDED), f13202(f13205(var11, (SubLObject)module0205.UNPROVIDED), var30), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
            }
            if (module0205.NIL != module0202.f12903(var11)) {
                final SubLObject var36 = module0202.f12906(var11);
                final SubLObject var37 = module0202.f12887(var11);
                SubLObject var38 = (SubLObject)module0205.NIL;
                final SubLObject var39 = (SubLObject)((module0205.NIL != module0269.f17707(var36)) ? var36 : module0205.NIL);
                final SubLObject var40 = module0147.$g2094$.currentBinding(var31);
                final SubLObject var41 = module0147.$g2095$.currentBinding(var31);
                try {
                    module0147.$g2094$.bind(module0147.f9531(var39), var31);
                    module0147.$g2095$.bind(module0147.f9534(var39), var31);
                    var38 = f13202(var37, var30);
                }
                finally {
                    module0147.$g2095$.rebind(var41, var31);
                    module0147.$g2094$.rebind(var40, var31);
                }
                return conses_high.adjoin(var36, var38, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
            }
            if (module0205.NIL != module0202.f12925(var11)) {
                return f13206(var11, var30);
            }
            module0202.f12747((SubLObject)module0205.FOUR_INTEGER, (SubLObject)module0205.$ic23$, var11, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13206(final SubLObject var53, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        final SubLThread var54 = SubLProcess.currentSubLThread();
        if (module0205.NIL != module0202.f12592(var53)) {
            return f13206(f13203(var53, (SubLObject)module0205.UNPROVIDED), var30);
        }
        SubLObject var55 = (SubLObject)module0205.NIL;
        SubLObject var56 = (SubLObject)module0205.ONE_INTEGER;
        SubLObject var58;
        final SubLObject var57 = var58 = f13207(var53, (SubLObject)module0205.$ic22$);
        SubLObject var59 = (SubLObject)module0205.NIL;
        var59 = var58.first();
        while (module0205.NIL != var58) {
            if (module0205.NIL != module0173.f10955(var59)) {
                final SubLObject var60 = var59;
                if (module0205.NIL == conses_high.member(var60, var55, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY))) {
                    var55 = (SubLObject)ConsesLow.cons(var60, var55);
                }
                if (module0205.NIL != var30 && module0205.NIL != module0167.f10813(var59)) {
                    var55 = module0035.f2269(ConsesLow.append(var55, f13206(Functions.funcall(module0146.$g1963$.getDynamicValue(var54), var59), (SubLObject)module0205.T)), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
                }
            }
            else if (module0205.NIL != var30 && module0205.NIL != assertion_handles_oc.f11035(var59)) {
                var55 = module0035.f2269(ConsesLow.append(var55, f13202(Functions.funcall(module0146.$g1962$.getDynamicValue(var54), var59), (SubLObject)module0205.T)), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
            }
            else if (module0205.NIL != module0201.f12585(var59)) {
                final SubLObject var60 = var59;
                if (module0205.NIL == conses_high.member(var60, var55, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY))) {
                    var55 = (SubLObject)ConsesLow.cons(var60, var55);
                }
            }
            else if (module0205.NIL != module0552.f34132(var59)) {
                final SubLObject var60 = var59;
                if (module0205.NIL == conses_high.member(var60, var55, Symbols.symbol_function((SubLObject)module0205.EQL), Symbols.symbol_function((SubLObject)module0205.IDENTITY))) {
                    var55 = (SubLObject)ConsesLow.cons(var60, var55);
                }
            }
            else if (module0205.NIL != module0210.f13589(var59)) {
                SubLObject var46_58 = conses_high.second(var59);
                SubLObject var61 = (SubLObject)module0205.NIL;
                var61 = var46_58.first();
                while (module0205.NIL != var46_58) {
                    final SubLObject var62 = var61;
                    if (module0205.NIL == conses_high.member(var62, var55, Symbols.symbol_function((SubLObject)module0205.EQUAL), Symbols.symbol_function((SubLObject)module0205.IDENTITY))) {
                        var55 = (SubLObject)ConsesLow.cons(var62, var55);
                    }
                    var46_58 = var46_58.rest();
                    var61 = var46_58.first();
                }
            }
            else if (module0205.NIL != module0210.f13576(var59, (SubLObject)module0205.UNPROVIDED)) {
                SubLObject var46_59 = f13206(var59, var30);
                SubLObject var61 = (SubLObject)module0205.NIL;
                var61 = var46_59.first();
                while (module0205.NIL != var46_59) {
                    final SubLObject var62 = var61;
                    if (module0205.NIL == conses_high.member(var62, var55, Symbols.symbol_function((SubLObject)module0205.EQUAL), Symbols.symbol_function((SubLObject)module0205.IDENTITY))) {
                        var55 = (SubLObject)ConsesLow.cons(var62, var55);
                    }
                    var46_59 = var46_59.rest();
                    var61 = var46_59.first();
                }
            }
            else if (module0205.NIL != module0210.f13606(var59, (SubLObject)module0205.UNPROVIDED)) {
                SubLObject var46_60 = f13202(var59, var30);
                SubLObject var61 = (SubLObject)module0205.NIL;
                var61 = var46_60.first();
                while (module0205.NIL != var46_60) {
                    final SubLObject var62 = var61;
                    if (module0205.NIL == conses_high.member(var62, var55, Symbols.symbol_function((SubLObject)module0205.EQUAL), Symbols.symbol_function((SubLObject)module0205.IDENTITY))) {
                        var55 = (SubLObject)ConsesLow.cons(var62, var55);
                    }
                    var46_60 = var46_60.rest();
                    var61 = var46_60.first();
                }
            }
            else {
                module0202.f12747((SubLObject)module0205.FOUR_INTEGER, (SubLObject)module0205.$ic23$, var53, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
            }
            var56 = Numbers.add(var56, (SubLObject)module0205.ONE_INTEGER);
            var58 = var58.rest();
            var59 = var58.first();
        }
        return Sequences.reverse(var55);
    }
    
    public static SubLObject f13208(final SubLObject var62, SubLObject var63) {
        if (var63 == module0205.UNPROVIDED) {
            var63 = (SubLObject)module0205.NIL;
        }
        SubLObject var64 = f13209(var62);
        if (module0205.NIL != var63) {
            var64 = module0035.f2269(var64, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        }
        return var64;
    }
    
    public static SubLObject f13209(final SubLObject var62) {
        SubLObject var63 = (SubLObject)module0205.NIL;
        final SubLObject var64 = f13210(var62);
        if (module0205.NIL != module0202.f12628(var64)) {
            SubLObject var66;
            final SubLObject var65 = var66 = f13207(var62, (SubLObject)module0205.$ic22$);
            SubLObject var67 = (SubLObject)module0205.NIL;
            var67 = var66.first();
            while (module0205.NIL != var66) {
                final SubLObject var68 = f13209(var67);
                var63 = ConsesLow.nconc(var63, var68);
                var66 = var66.rest();
                var67 = var66.first();
            }
        }
        else if (module0205.NIL != module0269.f17706(var64)) {
            final SubLObject var69 = var64;
            var63 = (SubLObject)ConsesLow.cons(var69, var63);
        }
        return var63;
    }
    
    public static SubLObject f13211(final SubLObject var37, final SubLObject var11) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0205.NIL;
        final SubLObject var40 = module0205.$g2318$.currentBinding(var38);
        try {
            module0205.$g2318$.bind(var37, var38);
            var39 = f13183(var11, (SubLObject)module0205.$ic24$, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        }
        finally {
            module0205.$g2318$.rebind(var40, var38);
        }
        return var39;
    }
    
    public static SubLObject f13212(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        SubLObject var14;
        final SubLObject var13 = var14 = f13180(var11, (SubLObject)module0205.$ic22$);
        SubLObject var15 = (SubLObject)module0205.NIL;
        var15 = var14.first();
        while (module0205.NIL != var14) {
            if (var15.equal(module0205.$g2318$.getDynamicValue(var12))) {
                return (SubLObject)module0205.T;
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13213(final SubLObject var11, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        return module0035.sublisp_boolean(f13145((SubLObject)module0205.$ic25$, var11, var30, (SubLObject)module0205.UNPROVIDED));
    }
    
    public static SubLObject f13214(final SubLObject var38, final SubLObject var9, final SubLObject var30, final SubLObject var32) {
        final SubLObject var39 = Symbols.symbol_function((SubLObject)module0205.IDENTITY).eql(var32) ? var9 : Functions.funcall(var32, var9);
        final SubLObject var40 = Functions.funcall(var38, var39);
        if (module0205.NIL != var40) {
            return var9;
        }
        if (module0205.NIL != var30 && module0205.NIL != f13141(var9)) {
            return f13214(var38, f13143(var9), (SubLObject)module0205.T, var32);
        }
        if (module0205.NIL == module0202.f12590(var9)) {
            return (SubLObject)module0205.NIL;
        }
        final SubLObject var41 = f13125(var9);
        SubLObject var42 = (SubLObject)module0205.NIL;
        final SubLObject var43 = f13180(var9, (SubLObject)module0205.$ic15$);
        SubLObject var44 = (SubLObject)module0205.NIL;
        SubLObject var45 = (SubLObject)module0205.NIL;
        SubLObject var46 = (SubLObject)module0205.NIL;
        var44 = var43;
        var45 = var44.first();
        for (var46 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL == var42 && module0205.NIL != var44; var44 = var44.rest(), var45 = var44.first(), var46 = module0048.f_1X(var46)) {
            if (module0205.NIL == var41 || module0205.NIL == f13126(var9, var46)) {
                var42 = f13214(var38, var45, var30, var32);
            }
        }
        return var42;
    }
    
    public static SubLObject f13145(final SubLObject var38, final SubLObject var9, SubLObject var30, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        if (module0205.NIL == var30 && module0205.NIL == module0035.f2439(var38, var9, var32)) {
            return (SubLObject)module0205.NIL;
        }
        return f13214(var38, var9, var30, var32);
    }
    
    public static SubLObject f13215(final SubLObject var38, final SubLObject var11, SubLObject var30, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13145(var38, var11, var30, var32);
    }
    
    public static SubLObject f13216(final SubLObject var38, final SubLObject var39, SubLObject var30, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != assertion_handles_oc.f11035(var39) : var39;
        if (module0205.NIL != f13141(var39)) {
            SubLObject var40 = f13145(var38, module0178.f11289(var39), var30, var32);
            if (module0205.NIL != var40) {
                return var40;
            }
            var40 = f13145(var38, module0178.f11287(var39), var30, var32);
            if (module0205.NIL != var40) {
                return var40;
            }
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13217(final SubLObject var38, final SubLObject var27, SubLObject var30, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0167.f10813(var27) : var27;
        if (module0205.NIL != f13141(var27)) {
            return f13145(var38, f13218(var27), var30, var32);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13219(final SubLObject var18, final SubLObject var9, final SubLObject var30, final SubLObject var38, final SubLObject var32) {
        if (module0205.NIL != Functions.funcall(var38, var18, Functions.funcall(var32, var9))) {
            return var9;
        }
        if (module0205.NIL != var30 && module0205.NIL != f13141(var9)) {
            return f13219(var18, f13143(var9), (SubLObject)module0205.T, var38, var32);
        }
        if (module0205.NIL == module0202.f12590(var9)) {
            return (SubLObject)module0205.NIL;
        }
        final SubLObject var39 = f13125(var9);
        SubLObject var40 = (SubLObject)module0205.NIL;
        final SubLObject var41 = f13180(var9, (SubLObject)module0205.$ic15$);
        SubLObject var42 = (SubLObject)module0205.NIL;
        SubLObject var43 = (SubLObject)module0205.NIL;
        SubLObject var44 = (SubLObject)module0205.NIL;
        var42 = var41;
        var43 = var42.first();
        for (var44 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL == var40 && module0205.NIL != var42; var42 = var42.rest(), var43 = var42.first(), var44 = module0048.f_1X(var44)) {
            if (module0205.NIL == var39 || module0205.NIL == f13126(var9, var44)) {
                var40 = f13219(var18, var43, var30, var38, var32);
            }
        }
        return var40;
    }
    
    public static SubLObject f13220(final SubLObject var18, final SubLObject var9, SubLObject var30, SubLObject var38, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        return f13219(var18, var9, var30, var38, var32);
    }
    
    public static SubLObject f13221(final SubLObject var18, final SubLObject var11, SubLObject var30, SubLObject var38, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13219(var18, var11, var30, var38, var32);
    }
    
    public static SubLObject f13222(final SubLObject var18, final SubLObject var39, SubLObject var30, SubLObject var38, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != assertion_handles_oc.f11035(var39) : var39;
        SubLObject var40 = f13219(var18, module0178.f11289(var39), var30, var38, var32);
        if (module0205.NIL != var40) {
            return var40;
        }
        var40 = f13219(var18, module0178.f11287(var39), var30, var38, var32);
        if (module0205.NIL != var40) {
            return var40;
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13223(final SubLObject var18, final SubLObject var27, SubLObject var30, SubLObject var38, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0167.f10813(var27) : var27;
        return f13219(var18, var27, var30, var38, var32);
    }
    
    public static SubLObject f13224(final SubLObject var18, final SubLObject var45, SubLObject var30, SubLObject var38, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != Types.listp(var45) : var45;
        SubLObject var46 = var45;
        SubLObject var47 = (SubLObject)module0205.NIL;
        var47 = var46.first();
        while (module0205.NIL != var46) {
            final SubLObject var48 = f13220(var18, var47, var30, var38, var32);
            if (module0205.NIL != var48) {
                return var48;
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13225(final SubLObject var43, final SubLObject var9, SubLObject var30, SubLObject var38, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        SubLObject var44 = (SubLObject)module0205.NIL;
        SubLObject var45 = var43;
        SubLObject var46 = (SubLObject)module0205.NIL;
        var46 = var45.first();
        while (module0205.NIL != var45) {
            if (module0205.NIL != f13220(var46, var9, var30, var38, var32)) {
                var44 = (SubLObject)ConsesLow.cons(var46, var44);
            }
            var45 = var45.rest();
            var46 = var45.first();
        }
        return Sequences.nreverse(var44);
    }
    
    public static SubLObject f13226(final SubLObject var74, final SubLObject var9, SubLObject var30, SubLObject var38, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        SubLObject var75 = var74;
        SubLObject var76 = (SubLObject)module0205.NIL;
        var76 = var75.first();
        while (module0205.NIL != var75) {
            final SubLObject var77 = f13220(var76, var9, var30, var38, var32);
            if (module0205.NIL != var77) {
                return var77;
            }
            var75 = var75.rest();
            var76 = var75.first();
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13227(final SubLObject var5, final SubLObject var9, final SubLObject var30, final SubLObject var32) {
        Functions.funcall(var5, Functions.funcall(var32, var9));
        if (module0205.NIL != var30 && module0205.NIL != f13141(var9)) {
            return f13227(var5, f13143(var9), (SubLObject)module0205.T, var32);
        }
        if (module0205.NIL == module0202.f12590(var9)) {
            return (SubLObject)module0205.NIL;
        }
        final SubLObject var33 = f13180(var9, (SubLObject)module0205.$ic15$);
        SubLObject var34 = (SubLObject)module0205.NIL;
        SubLObject var35 = (SubLObject)module0205.NIL;
        SubLObject var36 = (SubLObject)module0205.NIL;
        var34 = var33;
        var35 = var34.first();
        for (var36 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL != var34; var34 = var34.rest(), var35 = var34.first(), var36 = module0048.f_1X(var36)) {
            if (module0205.NIL == f13126(var9, var36)) {
                f13227(var5, var35, var30, var32);
            }
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13228(final SubLObject var5, final SubLObject var9, SubLObject var30, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        return f13227(var5, var9, var30, var32);
    }
    
    public static SubLObject f13229(final SubLObject var5, final SubLObject var11, SubLObject var30, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13227(var5, var11, var30, var32);
    }
    
    public static SubLObject f13230(final SubLObject var5, final SubLObject var39, SubLObject var30, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != assertion_handles_oc.f11035(var39) : var39;
        if (module0205.NIL != f13141(var39)) {
            f13227(var5, module0178.f11287(var39), var30, var32);
            f13227(var5, module0178.f11289(var39), var30, var32);
            return (SubLObject)module0205.NIL;
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13231(final SubLObject var5, final SubLObject var27, SubLObject var30, SubLObject var32) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.NIL;
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0167.f10813(var27) : var27;
        if (module0205.NIL != f13141(var27)) {
            return f13227(var5, f13218(var27), var30, var32);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13232(final SubLObject var9, final SubLObject var31, final SubLObject var75, final SubLObject var76, final SubLObject var77, final SubLObject var78, final SubLObject var79, final SubLObject var80) {
        final SubLThread var81 = SubLProcess.currentSubLThread();
        if (var78.numG(var77)) {
            Dynamic.sublisp_throw((SubLObject)module0205.$ic29$, var77);
        }
        SubLObject var82 = (SubLObject)module0205.NIL;
        if (module0205.NIL != var79) {
            final SubLObject var83 = Functions.funcall(var75, var9);
            if (!SubLObjectFactory.makeBoolean(module0205.NIL == var80).eql((SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL == Functions.funcall(var31, var83)))) {
                var82 = f13232(var83, var31, var75, var76, var77, module0048.f_1X(var78), var79, var80);
            }
            else {
                var82 = var9;
            }
        }
        else if (!SubLObjectFactory.makeBoolean(module0205.NIL == var80).eql((SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL == Functions.funcall(var31, var9)))) {
            final SubLObject var83 = Functions.funcall(var75, var9);
            if (!var9.eql(var83)) {
                var82 = f13232(var83, var31, var75, var76, var77, module0048.f_1X(var78), var79, var80);
            }
            else {
                var82 = var9;
            }
        }
        else {
            var82 = var9;
        }
        if (module0205.NIL == module0202.f12590(var82)) {
            return var82;
        }
        final SubLObject var84 = module0202.f12707(var82, (SubLObject)module0205.UNPROVIDED);
        final SubLObject var85 = (module0205.NIL != var84 && module0205.NIL != var76 && module0205.NIL == f13130(var82)) ? f13232(var84, var31, var75, (SubLObject)module0205.T, var77, module0048.f_1X(var78), var79, var80) : var84;
        final SubLObject var86 = module0202.f12883(var82, (SubLObject)module0205.UNPROVIDED);
        final SubLObject var87 = f13125(var82);
        SubLObject var88 = (SubLObject)module0205.NIL;
        SubLObject var89 = (SubLObject)module0205.NIL;
        SubLObject var90 = (SubLObject)module0205.NIL;
        SubLObject var91 = (SubLObject)module0205.NIL;
        var89 = var82;
        var90 = var89.first();
        for (var91 = (SubLObject)module0205.ZERO_INTEGER; var89.rest().isCons(); var89 = var89.rest(), var90 = var89.first(), var91 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var91)) {
            final SubLObject var92 = var88;
            final SubLObject var93 = module0147.$g2094$.currentBinding(var81);
            final SubLObject var94 = module0147.$g2095$.currentBinding(var81);
            try {
                module0147.$g2094$.bind(module0147.f9531(var92), var81);
                module0147.$g2095$.bind(module0147.f9534(var92), var81);
                if (module0205.NIL == var87 || module0205.NIL == f13126(var82, var91)) {
                    ConsesLow.rplaca(var89, f13232(var90, var31, var75, var76, var77, module0048.f_1X(var78), var79, var80));
                    if (module0205.NIL != var86 && var91.numE((SubLObject)module0205.ONE_INTEGER)) {
                        var88 = var89.first();
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var94, var81);
                module0147.$g2094$.rebind(var93, var81);
            }
        }
        if (module0205.NIL == var87 || module0205.NIL == f13126(var82, var91)) {
            ConsesLow.rplaca(var89, f13232(var90, var31, var75, var76, var77, module0048.f_1X(var78), var79, var80));
        }
        ConsesLow.rplacd(var89, var85);
        return var82;
    }
    
    public static SubLObject f13147(final SubLObject var9, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        return f13232(module0202.f12702(var9), var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.NIL, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13151(final SubLObject var9, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        return f13232(var9, var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.NIL, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13233(final SubLObject var11, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13232(module0202.f12763(var11), var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.NIL, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13234(final SubLObject var11, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13232(var11, var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.NIL, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13235(final SubLObject var9, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        return f13232(module0202.f12702(var9), var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.T, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13236(final SubLObject var9, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        return f13232(var9, var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.T, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13237(final SubLObject var11, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13232(module0202.f12763(var11), var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.T, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13238(final SubLObject var11, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13232(var11, var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.T, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13239(final SubLObject var9, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        return f13232(module0202.f12702(var9), var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.T, (SubLObject)module0205.T);
    }
    
    public static SubLObject f13240(final SubLObject var9, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        return f13232(var9, var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.T, (SubLObject)module0205.T);
    }
    
    public static SubLObject f13241(final SubLObject var11, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13232(module0202.f12763(var11), var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.T, (SubLObject)module0205.T);
    }
    
    public static SubLObject f13242(final SubLObject var11, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13232(var11, var31, var75, var76, var77, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.T, (SubLObject)module0205.T);
    }
    
    public static SubLObject f13243(SubLObject var11, SubLObject var50, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        final SubLThread var78 = SubLProcess.currentSubLThread();
        final SubLObject var79 = var50;
        final SubLObject var80 = module0147.$g2094$.currentBinding(var78);
        final SubLObject var81 = module0147.$g2095$.currentBinding(var78);
        try {
            module0147.$g2094$.bind(module0147.f9531(var79), var78);
            module0147.$g2095$.bind(module0147.f9534(var79), var78);
            var11 = f13233(var11, var31, var75, var76, var77);
        }
        finally {
            module0147.$g2095$.rebind(var81, var78);
            module0147.$g2094$.rebind(var80, var78);
        }
        var78.resetMultipleValues();
        final SubLObject var87_88 = module0279.f18576(var11, var50);
        final SubLObject var89_90 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        var11 = var87_88;
        var50 = var89_90;
        return Values.values(var11, var50);
    }
    
    public static SubLObject f13244(SubLObject var11, SubLObject var50, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        final SubLThread var78 = SubLProcess.currentSubLThread();
        final SubLObject var79 = var50;
        final SubLObject var80 = module0147.$g2094$.currentBinding(var78);
        final SubLObject var81 = module0147.$g2095$.currentBinding(var78);
        try {
            module0147.$g2094$.bind(module0147.f9531(var79), var78);
            module0147.$g2095$.bind(module0147.f9534(var79), var78);
            var11 = f13234(var11, var31, var75, var76, var77);
        }
        finally {
            module0147.$g2095$.rebind(var81, var78);
            module0147.$g2094$.rebind(var80, var78);
        }
        var78.resetMultipleValues();
        final SubLObject var91_92 = module0279.f18576(var11, var50);
        final SubLObject var93_94 = var78.secondMultipleValue();
        var78.resetMultipleValues();
        var11 = var91_92;
        var50 = var93_94;
        return Values.values(var11, var50);
    }
    
    public static SubLObject f13245(final SubLObject var62, final SubLObject var50, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        return f13243(var62, var50, var31, var75, var76, var77);
    }
    
    public static SubLObject f13246(final SubLObject var62, final SubLObject var50, final SubLObject var31, final SubLObject var75, SubLObject var76, SubLObject var77) {
        if (var76 == module0205.UNPROVIDED) {
            var76 = (SubLObject)module0205.NIL;
        }
        if (var77 == module0205.UNPROVIDED) {
            var77 = module0205.$g2319$.getGlobalValue();
        }
        return f13244(var62, var50, var31, var75, var76, var77);
    }
    
    public static SubLObject f13247(final SubLObject var95, final SubLObject var96, final SubLObject var9, final SubLObject var38) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        if (module0205.NIL != Functions.funcall(var38, var9, var96)) {
            if (module0205.NIL != module0146.$g1984$.getDynamicValue(var97)) {
                return var9;
            }
            return var95;
        }
        else {
            if (module0205.NIL == module0202.f12590(var9)) {
                return var9;
            }
            if (module0205.NIL != module0206.f13473(var9) || module0205.NIL != module0206.f13471(var9)) {
                SubLObject var98 = (SubLObject)module0205.NIL;
                final SubLObject var99 = module0146.$g1984$.currentBinding(var97);
                try {
                    module0146.$g1984$.bind((SubLObject)module0205.NIL, var97);
                    if (module0205.NIL != module0146.$g2024$.getDynamicValue(var97)) {
                        var98 = f13247(var95, var96, f13203(var9, (SubLObject)module0205.UNPROVIDED), var38);
                    }
                    else {
                        var98 = module0202.f12643(f13132(var9), f13247(var95, var96, f13203(var9, (SubLObject)module0205.UNPROVIDED), var38));
                    }
                }
                finally {
                    module0146.$g1984$.rebind(var99, var97);
                }
                return var98;
            }
            if (module0205.NIL != module0206.f13472(var9)) {
                SubLObject var98 = (SubLObject)module0205.NIL;
                final SubLObject var99 = module0146.$g1984$.currentBinding(var97);
                try {
                    module0146.$g1984$.bind((SubLObject)module0205.T, var97);
                    var98 = module0202.f12643(module0205.$ic30$, f13247(var95, var96, f13203(var9, (SubLObject)module0205.UNPROVIDED), var38));
                }
                finally {
                    module0146.$g1984$.rebind(var99, var97);
                }
                return var98;
            }
            if (module0205.NIL != module0202.f12640(var9) && module0205.NIL != module0004.f104(var96, f13203(var9, (SubLObject)module0205.UNPROVIDED), var38, (SubLObject)module0205.UNPROVIDED)) {
                return module0202.f12768(module0205.$ic31$, conses_high.subst(var95, var96, f13203(var9, (SubLObject)module0205.UNPROVIDED), var38, (SubLObject)module0205.UNPROVIDED), f13247(var95, var96, f13204(var9, (SubLObject)module0205.UNPROVIDED), var38));
            }
            final SubLObject var100 = module0202.f12707(var9, (SubLObject)module0205.UNPROVIDED);
            final SubLObject var101 = (module0205.NIL != var100 && module0205.NIL == f13130(var9)) ? f13247(var95, var96, var100, var38) : var100;
            SubLObject var102 = (SubLObject)module0205.NIL;
            SubLObject var103 = (SubLObject)module0205.NIL;
            SubLObject var104 = (SubLObject)module0205.NIL;
            var102 = var9;
            var103 = var102.first();
            for (var104 = (SubLObject)module0205.ZERO_INTEGER; var102.rest().isCons(); var102 = var102.rest(), var103 = var102.first(), var104 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var104)) {
                if (module0205.NIL == f13131(var9, var104)) {
                    ConsesLow.rplaca(var102, f13247(var95, var96, var103, var38));
                }
            }
            if (module0205.NIL == f13131(var9, var104)) {
                ConsesLow.rplaca(var102, f13247(var95, var96, var103, var38));
            }
            ConsesLow.rplacd(var102, var101);
            return var9;
        }
    }
    
    public static SubLObject f13248(final SubLObject var95, final SubLObject var96, final SubLObject var9, SubLObject var38) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        return f13247(var95, var96, var9, var38);
    }
    
    public static SubLObject f13249(final SubLObject var95, final SubLObject var96, final SubLObject var9, final SubLObject var38, final SubLObject var32) {
        if (module0205.NIL != Functions.funcall(var38, Functions.funcall(var32, var9), var96)) {
            return var95;
        }
        if (module0205.NIL == module0202.f12590(var9)) {
            return var9;
        }
        final SubLObject var97 = module0202.f12707(var9, (SubLObject)module0205.UNPROVIDED);
        final SubLObject var98 = (module0205.NIL != var97 && module0205.NIL == f13130(var9)) ? f13249(var95, var96, var97, var38, var32) : var97;
        SubLObject var99 = (SubLObject)module0205.NIL;
        SubLObject var100 = (SubLObject)module0205.NIL;
        SubLObject var101 = (SubLObject)module0205.NIL;
        var99 = var9;
        var100 = var99.first();
        for (var101 = (SubLObject)module0205.ZERO_INTEGER; var99.rest().isCons(); var99 = var99.rest(), var100 = var99.first(), var101 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var101)) {
            if (module0205.NIL == f13126(var9, var101)) {
                ConsesLow.rplaca(var99, f13249(var95, var96, var100, var38, var32));
            }
        }
        if (module0205.NIL == f13126(var9, var101)) {
            ConsesLow.rplaca(var99, f13249(var95, var96, var100, var38, var32));
        }
        ConsesLow.rplacd(var99, var98);
        return var9;
    }
    
    public static SubLObject f13250(final SubLObject var95, final SubLObject var96, final SubLObject var9, SubLObject var38, SubLObject var32) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        return f13249(var95, var96, module0202.f12702(var9), var38, var32);
    }
    
    public static SubLObject f13251(final SubLObject var95, final SubLObject var96, final SubLObject var9, SubLObject var38, SubLObject var32) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        return f13249(var95, var96, var9, var38, var32);
    }
    
    public static SubLObject f13252(final SubLObject var95, final SubLObject var96, final SubLObject var11, SubLObject var38, SubLObject var32) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13249(var95, var96, module0202.f12763(var11), var38, var32);
    }
    
    public static SubLObject f13253(final SubLObject var95, final SubLObject var96, final SubLObject var11, SubLObject var38, SubLObject var32) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13249(var95, var96, var11, var38, var32);
    }
    
    public static SubLObject f13254(final SubLObject var98, SubLObject var9, final SubLObject var38) {
        final SubLThread var99 = SubLProcess.currentSubLThread();
        final SubLObject var100 = conses_high.assoc(var9, var98, var38, (SubLObject)module0205.UNPROVIDED);
        if (module0205.NIL != var100) {
            if (module0205.NIL != module0146.$g1984$.getDynamicValue(var99)) {
                return var9;
            }
            return var100.rest();
        }
        else {
            if (module0205.NIL == module0202.f12590(var9)) {
                return var9;
            }
            if (module0205.NIL != module0206.f13473(var9) || module0205.NIL != module0206.f13471(var9)) {
                SubLObject var101 = (SubLObject)module0205.NIL;
                final SubLObject var102 = module0146.$g1984$.currentBinding(var99);
                try {
                    module0146.$g1984$.bind((SubLObject)module0205.NIL, var99);
                    if (module0205.NIL != module0146.$g2024$.getDynamicValue(var99)) {
                        var101 = f13254(var98, f13203(var9, (SubLObject)module0205.UNPROVIDED), var38);
                    }
                    else {
                        var101 = module0202.f12643(f13132(var9), f13254(var98, f13203(var9, (SubLObject)module0205.UNPROVIDED), var38));
                    }
                }
                finally {
                    module0146.$g1984$.rebind(var102, var99);
                }
                return var101;
            }
            if (module0205.NIL != module0206.f13472(var9)) {
                SubLObject var101 = (SubLObject)module0205.NIL;
                final SubLObject var102 = module0146.$g1984$.currentBinding(var99);
                try {
                    module0146.$g1984$.bind((SubLObject)module0205.T, var99);
                    var101 = module0202.f12643(module0205.$ic30$, f13254(var98, f13203(var9, (SubLObject)module0205.UNPROVIDED), var38));
                }
                finally {
                    module0146.$g1984$.rebind(var102, var99);
                }
                return var101;
            }
            if (module0205.NIL != module0202.f12640(var9)) {
                final SubLObject var103 = f13203(var9, (SubLObject)module0205.UNPROVIDED);
                final SubLObject var104 = f13183(var103, Symbols.symbol_function((SubLObject)module0205.$ic32$), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
                SubLObject var105 = (SubLObject)module0205.NIL;
                if (module0205.NIL != var104) {
                    SubLObject var106 = var104;
                    SubLObject var107 = (SubLObject)module0205.NIL;
                    var107 = var106.first();
                    while (module0205.NIL != var106) {
                        final SubLObject var108 = conses_high.assoc(var107, var98, var38, (SubLObject)module0205.UNPROVIDED);
                        if (module0205.NIL != var108) {
                            var105 = (SubLObject)ConsesLow.cons(var108, var105);
                        }
                        var106 = var106.rest();
                        var107 = var106.first();
                    }
                    if (module0205.NIL != var105) {
                        var9 = module0202.f12768(module0205.$ic31$, f13254(var98, var103, var38), f13254(var105, f13204(var9, (SubLObject)module0205.UNPROVIDED), var38));
                    }
                }
                return var9;
            }
            final SubLObject var109 = module0202.f12707(var9, (SubLObject)module0205.UNPROVIDED);
            final SubLObject var110 = (module0205.NIL != var109 && module0205.NIL == f13130(var9)) ? f13254(var98, var109, var38) : var109;
            SubLObject var111 = (SubLObject)module0205.NIL;
            SubLObject var112 = (SubLObject)module0205.NIL;
            SubLObject var113 = (SubLObject)module0205.NIL;
            var111 = var9;
            var112 = var111.first();
            for (var113 = (SubLObject)module0205.ZERO_INTEGER; var111.rest().isCons(); var111 = var111.rest(), var112 = var111.first(), var113 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var113)) {
                if (module0205.NIL == f13131(var9, var113)) {
                    ConsesLow.rplaca(var111, f13254(var98, var112, var38));
                }
            }
            if (module0205.NIL == f13131(var9, var113)) {
                ConsesLow.rplaca(var111, f13254(var98, var112, var38));
            }
            ConsesLow.rplacd(var111, var110);
            return var9;
        }
    }
    
    public static SubLObject f13255(final SubLObject var98, final SubLObject var9, SubLObject var38) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        return f13254(var98, var9, var38);
    }
    
    public static SubLObject f13256(final SubLObject var98, final SubLObject var9, final SubLObject var38, final SubLObject var32) {
        final SubLObject var99 = conses_high.assoc(Functions.funcall(var32, var9), var98, var38, (SubLObject)module0205.UNPROVIDED);
        if (module0205.NIL != var99) {
            return var99.rest();
        }
        if (module0205.NIL == module0202.f12590(var9)) {
            return var9;
        }
        final SubLObject var100 = module0202.f12707(var9, (SubLObject)module0205.UNPROVIDED);
        final SubLObject var101 = (module0205.NIL != var100 && module0205.NIL == f13130(var9)) ? f13256(var98, var100, var38, var32) : var100;
        SubLObject var102 = (SubLObject)module0205.NIL;
        SubLObject var103 = (SubLObject)module0205.NIL;
        SubLObject var104 = (SubLObject)module0205.NIL;
        var102 = var9;
        var103 = var102.first();
        for (var104 = (SubLObject)module0205.ZERO_INTEGER; var102.rest().isCons(); var102 = var102.rest(), var103 = var102.first(), var104 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var104)) {
            if (module0205.NIL == f13126(var9, var104)) {
                ConsesLow.rplaca(var102, f13256(var98, var103, var38, var32));
            }
        }
        if (module0205.NIL == f13126(var9, var104)) {
            ConsesLow.rplaca(var102, f13256(var98, var103, var38, var32));
        }
        ConsesLow.rplacd(var102, var101);
        return var9;
    }
    
    public static SubLObject f13257(final SubLObject var98, final SubLObject var9, SubLObject var38, SubLObject var32) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        return f13256(var98, module0202.f12702(var9), var38, var32);
    }
    
    public static SubLObject f13258(final SubLObject var98, final SubLObject var9, SubLObject var38, SubLObject var32) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        return f13256(var98, var9, var38, var32);
    }
    
    public static SubLObject f13259(final SubLObject var98, final SubLObject var11, SubLObject var38, SubLObject var32) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13256(var98, module0202.f12763(var11), var38, var32);
    }
    
    public static SubLObject f13260(final SubLObject var98, final SubLObject var11, SubLObject var38, SubLObject var32) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13256(var98, var11, var38, var32);
    }
    
    public static SubLObject f13261(final SubLObject var9, final SubLObject var103) {
        SubLObject var104 = (SubLObject)module0205.NIL;
        SubLObject var105 = (SubLObject)module0205.NIL;
        SubLObject var106 = (SubLObject)module0205.NIL;
        SubLObject var107 = (SubLObject)module0205.NIL;
        var105 = var103;
        var106 = var105.first();
        for (var107 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL != var105; var105 = var105.rest(), var106 = var105.first(), var107 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var107)) {
            final SubLObject var108 = module0193.f12079(var107);
            var104 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var108, var106), var104);
        }
        return f13258(var104, var9, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13262(final SubLObject var9, final SubLObject var103) {
        return f13261(module0202.f12702(var9), var103);
    }
    
    public static SubLObject f13263(final SubLObject var9) {
        SubLObject var10 = (SubLObject)module0205.NIL;
        SubLObject var11 = (SubLObject)module0205.NIL;
        SubLObject var12 = (SubLObject)module0205.NIL;
        SubLObject var13 = (SubLObject)module0205.NIL;
        var11 = f13183(var9, (SubLObject)module0205.$ic33$, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        var12 = var11.first();
        for (var13 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL != var11; var11 = var11.rest(), var12 = var11.first(), var13 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var13)) {
            final SubLObject var14 = module0193.f12079(var13);
            var10 = module0035.f2063(var10, var12, var14, (SubLObject)module0205.UNPROVIDED);
        }
        return Values.values(f13258(var10, var9, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED), var10);
    }
    
    public static SubLObject f13264(final SubLObject var9) {
        return f13263(module0202.f12702(var9));
    }
    
    public static SubLObject f13265(final SubLObject var108, final SubLObject var103) {
        return f13261(var108, var103);
    }
    
    public static SubLObject f13266(final SubLObject var108, final SubLObject var103) {
        return f13262(var108, var103);
    }
    
    public static SubLObject f13267(final SubLObject var109, final SubLObject var110, final SubLObject var11) {
        return f13268(var109, var110, module0202.f12702(var11));
    }
    
    public static SubLObject f13268(final SubLObject var109, final SubLObject var110, final SubLObject var11) {
        if (module0205.NIL == var110) {
            return (SubLObject)module0205.NIL;
        }
        if (module0205.NIL != module0035.f1997(var110)) {
            return module0202.f12818(var110.first(), var109, var11);
        }
        f13268(var109, var110.rest(), f13134(var11, var110.first(), (SubLObject)module0205.UNPROVIDED));
        return var11;
    }
    
    public static SubLObject f13269(final SubLObject var111, final SubLObject var112, final SubLObject var113) {
        SubLObject var114 = module0202.f12763(var111);
        SubLObject var115 = (SubLObject)module0205.NIL;
        SubLObject var116 = (SubLObject)module0205.NIL;
        SubLObject var117 = (SubLObject)module0205.NIL;
        var115 = var113;
        var116 = var115.first();
        for (var117 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL != var115; var115 = var115.rest(), var116 = var115.first(), var117 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var117)) {
            final SubLObject var118 = ConsesLow.nth(var117, var112);
            final SubLObject var119 = f13134(var111, var118, (SubLObject)module0205.UNPROVIDED);
            var114 = module0202.f12818(var116, var119, var114);
        }
        return var114;
    }
    
    public static SubLObject f13270(final SubLObject var111, final SubLObject var112) {
        SubLObject var113 = (SubLObject)module0205.NIL;
        SubLObject var115;
        final SubLObject var114 = var115 = f13271(var112);
        SubLObject var116 = (SubLObject)module0205.NIL;
        var116 = var115.first();
        while (module0205.NIL != var115) {
            final SubLObject var117 = f13269(var111, var112, var116);
            var113 = (SubLObject)ConsesLow.cons(var117, var113);
            var115 = var115.rest();
            var116 = var115.first();
        }
        return Sequences.nreverse(var113);
    }
    
    public static SubLObject f13272(final SubLObject var121, final SubLObject var112) {
        SubLObject var122 = (SubLObject)module0205.NIL;
        SubLObject var123 = var121;
        SubLObject var124 = (SubLObject)module0205.NIL;
        var124 = var123.first();
        while (module0205.NIL != var123) {
            var122 = ConsesLow.nconc(f13270(var124, var112), var122);
            var123 = var123.rest();
            var124 = var123.first();
        }
        return Sequences.delete_duplicates(var122, Symbols.symbol_function((SubLObject)module0205.EQUAL), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13273(final SubLObject var111) {
        SubLObject var112 = (SubLObject)ConsesLow.list(module0202.f12763(var111));
        SubLObject var113 = (SubLObject)module0205.ZERO_INTEGER;
        SubLObject var115;
        final SubLObject var114 = var115 = f13207(var111, (SubLObject)module0205.$ic22$);
        SubLObject var116 = (SubLObject)module0205.NIL;
        var116 = var115.first();
        while (module0205.NIL != var115) {
            var113 = Numbers.add(var113, (SubLObject)module0205.ONE_INTEGER);
            if (module0205.NIL == module0202.f12639(var116)) {
                if (module0205.NIL != module0210.f13576(var116, (SubLObject)module0205.UNPROVIDED)) {
                    SubLObject var46_122 = f13274(var116);
                    SubLObject var117 = (SubLObject)module0205.NIL;
                    var117 = var46_122.first();
                    while (module0205.NIL != var46_122) {
                        if (!var117.equal(var116)) {
                            var112 = (SubLObject)ConsesLow.cons(module0202.f12818(var113, var117, module0202.f12763(var111)), var112);
                        }
                        var46_122 = var46_122.rest();
                        var117 = var46_122.first();
                    }
                }
                else if (module0205.NIL != module0202.f12929(var116)) {
                    SubLObject var46_123 = f13275(var116, (SubLObject)module0205.T);
                    SubLObject var118 = (SubLObject)module0205.NIL;
                    var118 = var46_123.first();
                    while (module0205.NIL != var46_123) {
                        if (!var118.equal(var116)) {
                            var112 = (SubLObject)ConsesLow.cons(module0202.f12818(var113, var118, module0202.f12763(var111)), var112);
                        }
                        var46_123 = var46_123.rest();
                        var118 = var46_123.first();
                    }
                }
            }
            var115 = var115.rest();
            var116 = var115.first();
        }
        return var112;
    }
    
    public static SubLObject f13274(final SubLObject var126) {
        SubLObject var127 = (SubLObject)module0205.NIL;
        final SubLObject var128 = f13276(var126);
        if (module0205.NIL != module0285.f18951(var126)) {
            final SubLObject var129 = f13276(f13277(var126, (SubLObject)module0205.UNPROVIDED));
            final SubLObject var130 = f13277(f13277(var126, (SubLObject)module0205.UNPROVIDED), (SubLObject)module0205.UNPROVIDED);
            var127 = (SubLObject)ConsesLow.cons(var126, var127);
            var127 = (SubLObject)ConsesLow.cons(module0202.f12784(var129, module0202.f12784(var128, var130)), var127);
        }
        else if (module0205.NIL != module0226.f14806(var128) || module0205.NIL != module0269.f17781(var128)) {
            var127 = f13275(var126, (SubLObject)module0205.T);
        }
        return var127;
    }
    
    public static SubLObject f13278() {
        final SubLObject var130 = module0205.$g2320$.getGlobalValue();
        if (module0205.NIL != var130) {
            module0034.f1818(var130);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13279(final SubLObject var43) {
        return module0034.f1829(module0205.$g2320$.getGlobalValue(), (SubLObject)ConsesLow.list(var43), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13280(final SubLObject var43) {
        return module0035.f2475(var43, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13271(final SubLObject var43) {
        SubLObject var44 = module0205.$g2320$.getGlobalValue();
        if (module0205.NIL == var44) {
            var44 = module0034.f1934((SubLObject)module0205.$ic34$, (SubLObject)module0205.$ic35$, (SubLObject)module0205.NIL, (SubLObject)module0205.EQUAL, (SubLObject)module0205.ONE_INTEGER, (SubLObject)module0205.ZERO_INTEGER);
        }
        SubLObject var45 = module0034.f1814(var44, var43, (SubLObject)module0205.$ic36$);
        if (var45 == module0205.$ic36$) {
            var45 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13280(var43)));
            module0034.f1816(var44, var43, var45, (SubLObject)module0205.UNPROVIDED);
        }
        return module0034.f1959(var45);
    }
    
    public static SubLObject f13275(final SubLObject var11, SubLObject var133) {
        if (var133 == module0205.UNPROVIDED) {
            var133 = (SubLObject)module0205.NIL;
        }
        SubLObject var134 = (SubLObject)((module0205.NIL != var133) ? f13273(var11) : ConsesLow.list(var11));
        SubLObject var135 = module0285.f18957(var11);
        SubLObject var136 = (SubLObject)module0205.NIL;
        var136 = var135.first();
        while (module0205.NIL != var135) {
            var134 = f13272(var134, var136);
            var135 = var135.rest();
            var136 = var135.first();
        }
        return Sequences.nreverse(var134);
    }
    
    public static SubLObject f13281(final SubLObject var11, SubLObject var134, SubLObject var133) {
        if (var134 == module0205.UNPROVIDED) {
            var134 = Symbols.symbol_function((SubLObject)module0205.$ic32$);
        }
        if (var133 == module0205.UNPROVIDED) {
            var133 = (SubLObject)module0205.NIL;
        }
        if (module0205.NIL != module0202.f12689(var11, var134)) {
            return (SubLObject)ConsesLow.list(module0285.f18943(var11));
        }
        final SubLObject var135 = f13282(var11, var134);
        SubLObject var136 = (SubLObject)module0205.NIL;
        if (module0205.NIL == var133 && module0205.NIL == var135) {
            var136 = (SubLObject)ConsesLow.list(module0285.f18948(var11));
            return var136;
        }
        if (module0205.NIL != var133 && module0205.NIL == var135) {
            var136 = f13283(module0285.f18943(var11), var134);
            return Sequences.nreverse(var136);
        }
        if (module0205.NIL != var133 && module0205.NIL != var135) {
            var136 = f13283(module0285.f18943(var11), var134);
        }
        else {
            var136 = (SubLObject)ConsesLow.list(module0285.f18948(var11));
        }
        var136 = f13284(var136);
        return Sequences.nreverse(var136);
    }
    
    public static SubLObject f13282(final SubLObject var11, SubLObject var134) {
        if (var134 == module0205.UNPROVIDED) {
            var134 = Symbols.symbol_function((SubLObject)module0205.$ic32$);
        }
        if (module0205.NIL != module0202.f12689(var11, var134)) {
            return (SubLObject)module0205.NIL;
        }
        SubLObject var135 = (SubLObject)module0205.NIL;
        SubLObject var136 = (SubLObject)module0205.ZERO_INTEGER;
        SubLObject var138;
        final SubLObject var137 = var138 = f13207(var11, (SubLObject)module0205.$ic22$);
        SubLObject var139 = (SubLObject)module0205.NIL;
        var139 = var138.first();
        while (module0205.NIL != var138) {
            var136 = Numbers.add(var136, (SubLObject)module0205.ONE_INTEGER);
            if (module0205.NIL != Functions.funcall(var134, var139)) {
                var135 = (SubLObject)ConsesLow.cons(var136, var135);
            }
            var138 = var138.rest();
            var139 = var138.first();
        }
        return var135;
    }
    
    public static SubLObject f13283(final SubLObject var11, final SubLObject var134) {
        SubLObject var135 = (SubLObject)ConsesLow.list(module0202.f12763(var11));
        SubLObject var136 = (SubLObject)module0205.ZERO_INTEGER;
        SubLObject var138;
        final SubLObject var137 = var138 = f13207(var11, (SubLObject)module0205.$ic22$);
        SubLObject var139 = (SubLObject)module0205.NIL;
        var139 = var138.first();
        while (module0205.NIL != var138) {
            var136 = Numbers.add(var136, (SubLObject)module0205.ONE_INTEGER);
            if (module0205.NIL == module0202.f12639(var139)) {
                if (module0205.NIL != module0210.f13576(var139, var134)) {
                    SubLObject var46_137 = f13285(var139, var134);
                    SubLObject var140 = (SubLObject)module0205.NIL;
                    var140 = var46_137.first();
                    while (module0205.NIL != var46_137) {
                        if (!var140.equal(var139)) {
                            var135 = (SubLObject)ConsesLow.cons(module0202.f12818(var136, var140, module0202.f12763(var11)), var135);
                        }
                        var46_137 = var46_137.rest();
                        var140 = var46_137.first();
                    }
                }
                else if (module0205.NIL != module0202.f12929(var139)) {
                    SubLObject var46_138 = f13281(var139, var134, (SubLObject)module0205.T);
                    SubLObject var141 = (SubLObject)module0205.NIL;
                    var141 = var46_138.first();
                    while (module0205.NIL != var46_138) {
                        if (!var141.equal(var139)) {
                            var135 = (SubLObject)ConsesLow.cons(module0202.f12818(var136, var141, module0202.f12763(var11)), var135);
                        }
                        var46_138 = var46_138.rest();
                        var141 = var46_138.first();
                    }
                }
            }
            var138 = var138.rest();
            var139 = var138.first();
        }
        return var135;
    }
    
    public static SubLObject f13284(final SubLObject var121) {
        SubLObject var122 = (SubLObject)module0205.NIL;
        SubLObject var123 = (SubLObject)module0205.NIL;
        SubLObject var124 = var121;
        SubLObject var125 = (SubLObject)module0205.NIL;
        var125 = var124.first();
        while (module0205.NIL != var124) {
            SubLObject var46_140 = module0285.f18957(var125);
            SubLObject var126 = (SubLObject)module0205.NIL;
            var126 = var46_140.first();
            while (module0205.NIL != var46_140) {
                final SubLObject var127 = f13282(var125, (SubLObject)module0205.UNPROVIDED);
                final SubLObject var128 = module0076.f5290(var126, var127, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
                SubLObject var129 = (SubLObject)module0205.NIL;
                SubLObject var130 = (SubLObject)module0205.NIL;
                if (module0205.NIL != var128) {
                    var129 = Sequences.nreverse(conses_high.set_difference(var126, var128, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED));
                    var130 = f13286(var129, var128);
                    var123 = (SubLObject)module0205.T;
                    SubLObject var46_141 = var130;
                    SubLObject var131 = (SubLObject)module0205.NIL;
                    var131 = var46_141.first();
                    while (module0205.NIL != var46_141) {
                        var122 = (SubLObject)ConsesLow.cons(f13287(var125, var126, var131), var122);
                        var46_141 = var46_141.rest();
                        var131 = var46_141.first();
                    }
                }
                else {
                    var122 = (SubLObject)ConsesLow.cons(var125, var122);
                }
                var46_140 = var46_140.rest();
                var126 = var46_140.first();
            }
            var124 = var124.rest();
            var125 = var124.first();
        }
        if (module0205.NIL != var123) {
            return Sequences.delete_duplicates(var122, Symbols.symbol_function((SubLObject)module0205.EQUAL), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        }
        return var121;
    }
    
    public static SubLObject f13287(final SubLObject var111, final SubLObject var112, final SubLObject var113) {
        SubLObject var114 = module0202.f12763(var111);
        SubLObject var115 = (SubLObject)module0205.NIL;
        SubLObject var116 = (SubLObject)module0205.NIL;
        SubLObject var117 = (SubLObject)module0205.NIL;
        var115 = var113;
        var116 = var115.first();
        for (var117 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL != var115; var115 = var115.rest(), var116 = var115.first(), var117 = Numbers.add((SubLObject)module0205.ONE_INTEGER, var117)) {
            final SubLObject var118 = ConsesLow.nth(var117, var112);
            if (!var118.eql(var116)) {
                final SubLObject var119 = f13134(var111, var116, (SubLObject)module0205.UNPROVIDED);
                var114 = module0202.f12818(var118, var119, var114);
            }
        }
        return var114;
    }
    
    public static SubLObject f13285(final SubLObject var126, final SubLObject var134) {
        SubLObject var135 = (SubLObject)module0205.NIL;
        final SubLObject var136 = f13276(var126);
        if (module0205.NIL != module0226.f14806(var136) || module0205.NIL != module0269.f17781(var136)) {
            var135 = f13281(var126, var134, (SubLObject)module0205.UNPROVIDED);
        }
        return var135;
    }
    
    public static SubLObject f13288(final SubLObject var144) {
        final SubLThread var145 = SubLProcess.currentSubLThread();
        SubLObject var146 = (SubLObject)ConsesLow.list(reader.bq_cons(var144, (SubLObject)module0205.$ic37$));
        SubLObject var148;
        SubLObject var147;
        SubLObject var149;
        SubLObject var150;
        SubLObject var151;
        for (var147 = (var148 = Sequences.length(var144)), var149 = (SubLObject)module0205.NIL, var149 = (SubLObject)module0205.ONE_INTEGER; !var149.numGE(var148); var149 = module0048.f_1X(var149)) {
            var145.resetMultipleValues();
            var150 = module0035.f2098(var144, var149);
            var151 = var145.secondMultipleValue();
            var145.resetMultipleValues();
            var146 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var150, var151), var146);
        }
        return var146;
    }
    
    public static SubLObject f13286(final SubLObject var149, final SubLObject var150) {
        SubLObject var151 = (SubLObject)module0205.NIL;
        final SubLObject var152 = module0035.f2475(var150, (SubLObject)module0205.UNPROVIDED);
        SubLObject var154;
        final SubLObject var153 = var154 = f13288(var149);
        SubLObject var155 = (SubLObject)module0205.NIL;
        var155 = var154.first();
        while (module0205.NIL != var154) {
            SubLObject var157;
            final SubLObject var156 = var157 = var155;
            SubLObject var158 = (SubLObject)module0205.NIL;
            SubLObject var159 = (SubLObject)module0205.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0205.$ic38$);
            var158 = var157.first();
            var157 = var157.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var157, var156, (SubLObject)module0205.$ic38$);
            var159 = var157.first();
            var157 = var157.rest();
            if (module0205.NIL == var157) {
                SubLObject var46_158 = var152;
                SubLObject var160 = (SubLObject)module0205.NIL;
                var160 = var46_158.first();
                while (module0205.NIL != var46_158) {
                    SubLObject var46_159;
                    final SubLObject var161 = var46_159 = f13288(var160);
                    SubLObject var162 = (SubLObject)module0205.NIL;
                    var162 = var46_159.first();
                    while (module0205.NIL != var46_159) {
                        SubLObject var165_166;
                        final SubLObject var163_164 = var165_166 = var162;
                        SubLObject var163 = (SubLObject)module0205.NIL;
                        SubLObject var164 = (SubLObject)module0205.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var165_166, var163_164, (SubLObject)module0205.$ic39$);
                        var163 = var165_166.first();
                        var165_166 = var165_166.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var165_166, var163_164, (SubLObject)module0205.$ic39$);
                        var164 = var165_166.first();
                        var165_166 = var165_166.rest();
                        if (module0205.NIL == var165_166) {
                            var151 = (SubLObject)ConsesLow.cons(ConsesLow.append(var158, var163, var159, var164), var151);
                            var151 = (SubLObject)ConsesLow.cons(ConsesLow.append(var163, var158, var164, var159), var151);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var163_164, (SubLObject)module0205.$ic39$);
                        }
                        var46_159 = var46_159.rest();
                        var162 = var46_159.first();
                    }
                    var46_158 = var46_158.rest();
                    var160 = var46_158.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var156, (SubLObject)module0205.$ic38$);
            }
            var154 = var154.rest();
            var155 = var154.first();
        }
        return Sequences.delete_duplicates(var151, Symbols.symbol_function((SubLObject)module0205.EQUAL), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13289(final SubLObject var11) {
        assert module0205.NIL != module0202.f12590(var11) : var11;
        final SubLObject var12 = f13136(var11);
        if (module0205.NIL != module0173.f10955(var12)) {
            return var12;
        }
        if (module0205.NIL != module0202.f12590(var12)) {
            return f13136(var12);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13290(final SubLObject var9, final SubLObject var169) {
        final SubLObject var170 = f13183(var9, Symbols.symbol_function((SubLObject)module0205.$ic40$), (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        final SubLObject var171 = f13183(var9, Symbols.symbol_function((SubLObject)module0205.$ic41$), (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        final SubLObject var172 = module0035.f2409(var171, (SubLObject)module0205.MINUS_ONE_INTEGER);
        SubLObject var173 = module0048.f_1X(var172);
        SubLObject var174 = (SubLObject)module0205.NIL;
        SubLObject var175 = var170;
        SubLObject var176 = (SubLObject)module0205.NIL;
        var176 = var175.first();
        while (module0205.NIL != var175) {
            var174 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var176, f13291(var173)), var174);
            var173 = Numbers.add(var173, (SubLObject)module0205.ONE_INTEGER);
            var175 = var175.rest();
            var176 = var175.first();
        }
        return (module0205.NIL != var169) ? f13258(var174, var9, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED) : f13257(var174, var9, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13148(final SubLObject var9) {
        return f13290(var9, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13152(final SubLObject var9) {
        return f13290(var9, (SubLObject)module0205.T);
    }
    
    public static SubLObject f13292(final SubLObject var9, final SubLObject var169) {
        final SubLObject var170 = f13183(var9, Symbols.symbol_function((SubLObject)module0205.$ic41$), (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        final SubLObject var171 = f13183(var9, Symbols.symbol_function((SubLObject)module0205.$ic40$), (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        final SubLObject var172 = module0035.f2409(var171, (SubLObject)module0205.MINUS_ONE_INTEGER);
        SubLObject var173 = module0048.f_1X(var172);
        SubLObject var174 = (SubLObject)module0205.NIL;
        SubLObject var175 = var170;
        SubLObject var176 = (SubLObject)module0205.NIL;
        var176 = var175.first();
        while (module0205.NIL != var175) {
            var174 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var176, module0193.f12087(var173)), var174);
            var173 = Numbers.add(var173, (SubLObject)module0205.ONE_INTEGER);
            var175 = var175.rest();
            var176 = var175.first();
        }
        return (module0205.NIL != var169) ? f13258(var174, var9, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED) : f13257(var174, var9, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13146(final SubLObject var9) {
        return f13292(var9, (SubLObject)module0205.NIL);
    }
    
    public static SubLObject f13150(final SubLObject var9) {
        return f13292(var9, (SubLObject)module0205.T);
    }
    
    public static SubLObject f13293(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (module0205.NIL != module0201.f12546(var18)) {
            final SubLObject var20 = module0201.f12548(var18);
            if (var20.isString() && module0205.NIL != module0038.f2684(var20, module0205.$g2321$.getDynamicValue(var19))) {
                final SubLObject var21 = module0038.f2623(var20, Sequences.length(module0205.$g2321$.getDynamicValue(var19)), (SubLObject)module0205.UNPROVIDED);
                return module0038.f2642(var21);
            }
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13294(final SubLObject var18) {
        return Types.integerp(f13293(var18));
    }
    
    public static SubLObject f13291(final SubLObject var179) {
        final SubLThread var180 = SubLProcess.currentSubLThread();
        return module0201.f12550(Sequences.cconcatenate(module0205.$g2321$.getDynamicValue(var180), module0038.f2618(var179)));
    }
    
    public static SubLObject f13295(final SubLObject var180) {
        assert module0205.NIL != module0173.f10955(var180) : var180;
        return module0004.f104(var180, module0205.$g2322$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0205.$ic43$), (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13296(final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0173.f10955(var18) || (module0205.NIL != module0202.f12659(var18) && module0205.NIL != module0269.f17724(f13276(var18))));
    }
    
    public static SubLObject f13297(final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0173.f10955(var18) || module0205.NIL != module0202.f12659(var18));
    }
    
    public static SubLObject f13298(final SubLObject var18) {
        if (module0205.NIL != module0206.f13453(var18)) {
            final SubLObject var19 = f13276(var18);
            return (SubLObject)SubLObjectFactory.makeBoolean(var19.eql(module0205.$ic44$) || var19.eql(module0205.$ic45$));
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13299(final SubLObject var18) {
        return f13300(var18, module0205.$ic46$);
    }
    
    public static SubLObject f13301(final SubLObject var182) {
        final SubLObject var183 = Sequences.length(var182);
        if (var183.eql((SubLObject)module0205.ZERO_INTEGER)) {
            return (SubLObject)module0205.NIL;
        }
        if (var183.eql((SubLObject)module0205.ONE_INTEGER)) {
            return var182.first();
        }
        return (SubLObject)ConsesLow.list(module0205.$ic44$, (SubLObject)ConsesLow.cons(module0205.$ic47$, var182));
    }
    
    public static SubLObject f13302(final SubLObject var182) {
        final SubLObject var183 = Sequences.length(var182);
        if (var183.eql((SubLObject)module0205.ZERO_INTEGER)) {
            return (SubLObject)module0205.NIL;
        }
        if (var183.eql((SubLObject)module0205.ONE_INTEGER)) {
            return var182.first();
        }
        return (SubLObject)ConsesLow.list(module0205.$ic46$, (SubLObject)ConsesLow.cons(module0205.$ic47$, var182));
    }
    
    public static SubLObject f13303(final SubLObject var183) {
        assert module0205.NIL != f13298(var183) : var183;
        final SubLObject var184 = f13276(var183);
        if (var184.eql(module0205.$ic44$)) {
            return module0610.f37329(f13277(var183, (SubLObject)module0205.UNPROVIDED), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
        }
        if (var184.eql(module0205.$ic45$)) {
            return f13304(var183, (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13305(final SubLObject var184) {
        assert module0205.NIL != f13299(var184) : var184;
        return module0610.f37329(f13277(var184, (SubLObject)module0205.UNPROVIDED), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13306(final SubLObject var185) {
        final SubLThread var186 = SubLProcess.currentSubLThread();
        if (!var185.isString()) {
            return (SubLObject)module0205.NIL;
        }
        if (module0205.NIL != constants_high_oc.f10737(var185)) {
            return constants_high_oc.f10737(var185);
        }
        final SubLObject var187 = reader.$read_eval$.currentBinding(var186);
        try {
            reader.$read_eval$.bind((SubLObject)module0205.NIL, var186);
            final SubLObject var188 = (module0205.NIL != module0035.f2002(var185, (SubLObject)module0205.$ic50$, (SubLObject)module0205.UNPROVIDED)) ? Sequences.subseq(var185, (SubLObject)module0205.ZERO_INTEGER, (SubLObject)module0205.$ic50$) : var185;
            final SubLObject var189 = reader.read_from_string_ignoring_errors(var188, (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
            final SubLObject var190 = (SubLObject)((module0205.NIL != module0206.f13444(var189)) ? module0285.f18875(var189, (SubLObject)module0205.UNPROVIDED) : module0205.NIL);
            return var190;
        }
        finally {
            reader.$read_eval$.rebind(var187, var186);
        }
    }
    
    public static SubLObject f13307(final SubLObject var188) {
        if (module0205.NIL != constant_handles_oc.f8449(var188)) {
            return constants_high_oc.f10743(var188);
        }
        if (module0205.NIL != module0167.f10813(var188)) {
            return module0038.f2659((SubLObject)module0205.$ic52$, (SubLObject)module0205.$ic53$, module0038.f2618(module0172.f10920(var188)), (SubLObject)module0205.UNPROVIDED);
        }
        if (module0205.NIL != module0172.f10917(var188)) {
            return module0038.f2659((SubLObject)module0205.$ic52$, (SubLObject)module0205.$ic53$, module0038.f2618(var188), (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13308(final SubLObject var9) {
        return Sort.sort(f13309(var9, (SubLObject)module0205.NIL), Symbols.symbol_function((SubLObject)module0205.$ic54$), (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13310(final SubLObject var9) {
        return Sort.sort(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0205.$ic55$), f13309(var9, (SubLObject)module0205.NIL)), Symbols.symbol_function((SubLObject)module0205.$ic56$), (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13311(final SubLObject var9) {
        return Sort.sort(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0205.$ic57$), f13309(var9, (SubLObject)module0205.NIL)), Symbols.symbol_function((SubLObject)module0205.$ic56$), (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13309(final SubLObject var9, SubLObject var30) {
        if (var30 == module0205.UNPROVIDED) {
            var30 = (SubLObject)module0205.T;
        }
        return f13183(var9, Symbols.symbol_function((SubLObject)module0205.$ic20$), var30, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13312(final SubLObject var9) {
        return Sort.sort(f13313(var9), Symbols.symbol_function((SubLObject)module0205.$ic56$), Symbols.symbol_function((SubLObject)module0205.$ic58$));
    }
    
    public static SubLObject f13313(final SubLObject var9) {
        return f13183(var9, Symbols.symbol_function((SubLObject)module0205.$ic21$), (SubLObject)module0205.T, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13314(final SubLObject var9) {
        return Sort.sort(f13315(var9), Symbols.symbol_function((SubLObject)module0205.$ic56$), Symbols.symbol_function((SubLObject)module0205.$ic59$));
    }
    
    public static SubLObject f13315(final SubLObject var9) {
        return f13183(var9, Symbols.symbol_function((SubLObject)module0205.$ic16$), (SubLObject)module0205.T, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13316(final SubLObject var9) {
        return Sort.sort(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0205.$ic60$), module0035.f2399(var9, Symbols.symbol_function((SubLObject)module0205.$ic19$), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED)), Symbols.symbol_function((SubLObject)module0205.$ic56$), (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13317(final SubLObject var31) {
        assert module0205.NIL != module0222.f14637(var31) : var31;
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0222.f14635(module0205.$ic62$, var31, (SubLObject)module0205.ONE_INTEGER, (SubLObject)module0205.UNPROVIDED) || module0205.NIL != module0222.f14635(module0205.$ic63$, var31, (SubLObject)module0205.ONE_INTEGER, (SubLObject)module0205.UNPROVIDED));
    }
    
    public static SubLObject f13318(final SubLObject var31, SubLObject var189) {
        if (var189 == module0205.UNPROVIDED) {
            var189 = (SubLObject)module0205.NIL;
        }
        assert module0205.NIL != module0212.f13762(var31) : var31;
        if (module0205.NIL == var189 && module0205.NIL != module0222.f14637(var31) && module0205.NIL == f13317(var31)) {
            return (SubLObject)module0205.NIL;
        }
        return module0035.f2269(ConsesLow.append(module0220.f14565(var31, module0205.$ic62$, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED), module0220.f14565(var31, module0205.$ic63$, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED)), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13319(final SubLObject var31, SubLObject var189) {
        if (var189 == module0205.UNPROVIDED) {
            var189 = (SubLObject)module0205.NIL;
        }
        final SubLThread var190 = SubLProcess.currentSubLThread();
        final SubLObject var191 = module0034.$g879$.getDynamicValue(var190);
        SubLObject var192 = (SubLObject)module0205.NIL;
        if (module0205.NIL == var191) {
            return f13318(var31, var189);
        }
        var192 = module0034.f1857(var191, (SubLObject)module0205.$ic64$, (SubLObject)module0205.UNPROVIDED);
        if (module0205.NIL == var192) {
            var192 = module0034.f1807(module0034.f1842(var191), (SubLObject)module0205.$ic64$, (SubLObject)module0205.TWO_INTEGER, (SubLObject)module0205.$ic66$, (SubLObject)module0205.EQL, (SubLObject)module0205.UNPROVIDED);
            module0034.f1860(var191, (SubLObject)module0205.$ic64$, var192);
        }
        final SubLObject var193 = module0034.f1782(var31, var189);
        final SubLObject var194 = module0034.f1814(var192, var193, (SubLObject)module0205.UNPROVIDED);
        if (var194 != module0205.$ic36$) {
            SubLObject var195 = var194;
            SubLObject var196 = (SubLObject)module0205.NIL;
            var196 = var195.first();
            while (module0205.NIL != var195) {
                SubLObject var197 = var196.first();
                final SubLObject var198 = conses_high.second(var196);
                if (var31.eql(var197.first())) {
                    var197 = var197.rest();
                    if (module0205.NIL != var197 && module0205.NIL == var197.rest() && var189.eql(var197.first())) {
                        return module0034.f1959(var198);
                    }
                }
                var195 = var195.rest();
                var196 = var195.first();
            }
        }
        final SubLObject var199 = Values.arg2(var190.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13318(var31, var189)));
        module0034.f1836(var192, var193, var194, var199, (SubLObject)ConsesLow.list(var31, var189));
        return module0034.f1959(var199);
    }
    
    public static SubLObject f13320(final SubLObject var31) {
        assert module0205.NIL != module0222.f14637(var31) : var31;
        return module0222.f14635(module0205.$ic63$, var31, (SubLObject)module0205.ONE_INTEGER, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13321(final SubLObject var31, SubLObject var189) {
        if (var189 == module0205.UNPROVIDED) {
            var189 = (SubLObject)module0205.NIL;
        }
        assert module0205.NIL != module0212.f13762(var31) : var31;
        if (module0205.NIL == var189 && module0205.NIL != module0222.f14637(var31) && module0205.NIL == f13320(var31)) {
            return (SubLObject)module0205.NIL;
        }
        return module0035.f2269(module0220.f14565(var31, module0205.$ic63$, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED), (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13322(final SubLObject var31, SubLObject var189) {
        if (var189 == module0205.UNPROVIDED) {
            var189 = (SubLObject)module0205.NIL;
        }
        final SubLThread var190 = SubLProcess.currentSubLThread();
        final SubLObject var191 = module0034.$g879$.getDynamicValue(var190);
        SubLObject var192 = (SubLObject)module0205.NIL;
        if (module0205.NIL == var191) {
            return f13321(var31, var189);
        }
        var192 = module0034.f1857(var191, (SubLObject)module0205.$ic67$, (SubLObject)module0205.UNPROVIDED);
        if (module0205.NIL == var192) {
            var192 = module0034.f1807(module0034.f1842(var191), (SubLObject)module0205.$ic67$, (SubLObject)module0205.TWO_INTEGER, (SubLObject)module0205.$ic66$, (SubLObject)module0205.EQL, (SubLObject)module0205.UNPROVIDED);
            module0034.f1860(var191, (SubLObject)module0205.$ic67$, var192);
        }
        final SubLObject var193 = module0034.f1782(var31, var189);
        final SubLObject var194 = module0034.f1814(var192, var193, (SubLObject)module0205.UNPROVIDED);
        if (var194 != module0205.$ic36$) {
            SubLObject var195 = var194;
            SubLObject var196 = (SubLObject)module0205.NIL;
            var196 = var195.first();
            while (module0205.NIL != var195) {
                SubLObject var197 = var196.first();
                final SubLObject var198 = conses_high.second(var196);
                if (var31.eql(var197.first())) {
                    var197 = var197.rest();
                    if (module0205.NIL != var197 && module0205.NIL == var197.rest() && var189.eql(var197.first())) {
                        return module0034.f1959(var198);
                    }
                }
                var195 = var195.rest();
                var196 = var195.first();
            }
        }
        final SubLObject var199 = Values.arg2(var190.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f13321(var31, var189)));
        module0034.f1836(var192, var193, var194, var199, (SubLObject)ConsesLow.list(var31, var189));
        return module0034.f1959(var199);
    }
    
    public static SubLObject f13218(final SubLObject var27) {
        return module0172.f10915(var27);
    }
    
    public static SubLObject f13323(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0205.NIL;
        final SubLObject var12 = module0205.$g2314$.currentBinding(var10);
        try {
            module0205.$g2314$.bind((SubLObject)module0205.$ic68$, var10);
            var11 = f13235(var9, Symbols.symbol_function((SubLObject)module0205.$ic21$), (SubLObject)module0205.$ic69$, (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED);
        }
        finally {
            module0205.$g2314$.rebind(var12, var10);
        }
        return var11;
    }
    
    public static SubLObject f13324(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        SubLObject var11 = (SubLObject)module0205.NIL;
        final SubLObject var12 = module0205.$g2314$.currentBinding(var10);
        try {
            module0205.$g2314$.bind((SubLObject)module0205.$ic68$, var10);
            var11 = f13239(var9, Symbols.symbol_function((SubLObject)module0205.$ic70$), (SubLObject)module0205.$ic71$, (SubLObject)module0205.NIL, (SubLObject)module0205.UNPROVIDED);
        }
        finally {
            module0205.$g2314$.rebind(var12, var10);
        }
        return var11;
    }
    
    public static SubLObject f13325(final SubLObject var11, final SubLObject var12) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != f13128(var11, var12) || module0205.NIL != module0202.f12980(var11, var12));
    }
    
    public static SubLObject f13326(final SubLObject var198, final SubLObject var55) {
        final SubLObject var199 = f13134(var198, var55, (SubLObject)module0205.UNPROVIDED);
        if (module0205.NIL != module0202.f12981(var198, var55)) {
            return var199;
        }
        return f13327(var199);
    }
    
    public static SubLObject f13327(final SubLObject var18) {
        if (module0205.NIL == module0202.f12659(var18)) {
            return var18;
        }
        if (module0205.NIL != module0210.f13595(var18, (SubLObject)module0205.UNPROVIDED)) {
            final SubLObject var19 = module0172.f10922(var18);
            if (module0205.NIL != var19) {
                return var19;
            }
            return var18;
        }
        else {
            if (module0205.NIL != module0202.f12930(var18)) {
                SubLObject var20 = (SubLObject)module0205.NIL;
                SubLObject var21;
                SubLObject var22;
                for (var21 = module0202.f12728(var18, (SubLObject)module0205.$ic22$), var22 = (SubLObject)module0205.NIL, var22 = (SubLObject)module0205.ZERO_INTEGER; var22.numL(var21); var22 = Numbers.add(var22, (SubLObject)module0205.ONE_INTEGER)) {
                    var20 = (SubLObject)ConsesLow.cons(f13326(var18, var22), var20);
                }
                return Sequences.nreverse(var20);
            }
            return var18;
        }
    }
    
    public static SubLObject f13328(final SubLObject var18) {
        if (module0205.NIL != module0210.f13595(var18, (SubLObject)module0205.UNPROVIDED)) {
            final SubLObject var19 = module0172.f10921(var18);
            if (module0205.NIL != module0167.f10813(var19)) {
                return var19;
            }
        }
        return var18;
    }
    
    public static SubLObject f13329(final SubLObject var18) {
        if (module0205.NIL != module0210.f13595(var18, (SubLObject)module0205.UNPROVIDED)) {
            final SubLObject var19 = module0172.f10921(var18);
            if (module0205.NIL != module0167.f10813(var19)) {
                return var19;
            }
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13330(final SubLObject var18) {
        if (module0205.NIL != module0210.f13593(var18, (SubLObject)module0205.UNPROVIDED)) {
            final SubLObject var19 = module0172.f10921(var18);
            return (SubLObject)((module0205.NIL != module0167.f10813(var19)) ? var19 : module0205.NIL);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13331(final SubLObject var201) {
        return module0202.f12689(var201, Symbols.symbol_function((SubLObject)module0205.$ic72$));
    }
    
    public static SubLObject f13332(final SubLObject var202, final SubLObject var31) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0202.f12664(var202) && module0205.NIL != module0213.f14081(var31, f13333(var202)));
    }
    
    public static SubLObject f13334(final SubLObject var202, final SubLObject var203) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0202.f12664(var202) && module0205.NIL != module0035.f2170(f13333(var202), var203));
    }
    
    public static SubLObject f13335(final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL == var18 || module0205.NIL != module0213.f14081(module0205.$ic73$, var18));
    }
    
    public static SubLObject f13336(final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0202.f12590(var18) || module0205.NIL != module0167.f10813(var18) || module0205.NIL != assertion_handles_oc.f11035(var18));
    }
    
    public static SubLObject f13337(final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var18.isCons() && var18.first().eql(module0205.$ic74$) && Sequences.length(var18).numE((SubLObject)module0205.TWO_INTEGER));
    }
    
    public static SubLObject f13338(final SubLObject var22) {
        assert module0205.NIL != module0202.f12662(var22) : var22;
        if (module0205.NIL != f13337(var22)) {
            return f13203(var22, (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(module0205.$ic74$, var22);
    }
    
    public static SubLObject f13339(final SubLObject var62, final SubLObject var204) {
        assert module0205.NIL != module0130.f8511(var204) : var204;
        if (var204 == module0205.$ic86$) {
            return var62;
        }
        return f13338(var62);
    }
    
    public static SubLObject f13134(final SubLObject var11, final SubLObject var12, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        if (module0205.NIL == module0004.f106(var12)) {
            return (SubLObject)module0205.NIL;
        }
        if (module0205.NIL != module0202.f12590(var11)) {
            return f13340(var11, var12, var205);
        }
        if (module0205.NIL != module0167.f10813(var11)) {
            return f13340(module0172.f10915(var11), var12, (SubLObject)module0205.UNPROVIDED);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var11)) {
            return f13340(module0538.f33367(var11, (SubLObject)module0205.UNPROVIDED), var12, (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13340(final SubLObject var206, final SubLObject var12, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        assert module0205.NIL != module0202.f12590(var206) : var206;
        assert module0205.NIL != module0004.f106(var12) : var12;
        if (module0205.NIL != module0202.f12733(var206, var12, var205)) {
            return ConsesLow.nth(var12, f13341(var206, var205));
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13132(final SubLObject var11) {
        if (module0205.NIL != module0202.f12590(var11)) {
            return f13342(var11);
        }
        if (module0205.NIL != module0167.f10813(var11)) {
            return f13342(module0172.f10915(var11));
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var11)) {
            return f13342(module0538.f33367(var11, (SubLObject)module0205.UNPROVIDED));
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13136(final SubLObject var11) {
        return f13132(var11);
    }
    
    public static SubLObject f13342(final SubLObject var206) {
        assert module0205.NIL != module0202.f12590(var206) : var206;
        return var206.first();
    }
    
    public static SubLObject f13343(final SubLObject var206, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13340(var206, (SubLObject)module0205.ONE_INTEGER, var205);
    }
    
    public static SubLObject f13344(final SubLObject var206, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13340(var206, (SubLObject)module0205.TWO_INTEGER, var205);
    }
    
    public static SubLObject f13203(final SubLObject var11, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var11, (SubLObject)module0205.ONE_INTEGER, var205);
    }
    
    public static SubLObject f13204(final SubLObject var11, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var11, (SubLObject)module0205.TWO_INTEGER, var205);
    }
    
    public static SubLObject f13205(final SubLObject var11, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var11, (SubLObject)module0205.THREE_INTEGER, var205);
    }
    
    public static SubLObject f13345(final SubLObject var11, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var11, (SubLObject)module0205.FOUR_INTEGER, var205);
    }
    
    public static SubLObject f13346(final SubLObject var11, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var11, (SubLObject)module0205.FIVE_INTEGER, var205);
    }
    
    public static SubLObject f13347(final SubLObject var11, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var11, (SubLObject)module0205.SIX_INTEGER, var205);
    }
    
    public static SubLObject f13207(final SubLObject var11, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        if (module0205.NIL != module0202.f12590(var11)) {
            return f13348(var11, var205);
        }
        if (module0205.NIL != module0167.f10813(var11)) {
            return f13348(module0172.f10915(var11), (SubLObject)module0205.UNPROVIDED);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var11)) {
            return f13348(module0538.f33367(var11, (SubLObject)module0205.UNPROVIDED), (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13348(final SubLObject var206, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        assert module0205.NIL != module0202.f12590(var206) : var206;
        if (module0205.NIL != module0035.f2015(var206)) {
            return var206.rest();
        }
        return f13349(var206.rest(), var205, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13350(final SubLObject var207) {
        assert module0205.NIL != module0206.f13425(var207) : var207;
        SubLObject var208 = (SubLObject)module0205.NIL;
        if (module0205.NIL != assertion_handles_oc.f11035(var207)) {
            var208 = module0178.f11303(var207);
        }
        else {
            var208 = var207;
        }
        return f13207(var208, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13351(final SubLObject var207) {
        assert module0205.NIL != module0206.f13425(var207) : var207;
        SubLObject var208 = (SubLObject)module0205.NIL;
        if (module0205.NIL != assertion_handles_oc.f11035(var207)) {
            var208 = module0178.f11303(var207);
        }
        else {
            var208 = var207;
        }
        return f13132(var208);
    }
    
    public static SubLObject f13352(final SubLObject var207) {
        assert module0205.NIL != module0206.f13425(var207) : var207;
        SubLObject var208 = (SubLObject)module0205.NIL;
        if (module0205.NIL != assertion_handles_oc.f11035(var207)) {
            var208 = module0178.f11303(var207);
        }
        else {
            var208 = var207;
        }
        return f13203(var208, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13353(final SubLObject var207) {
        assert module0205.NIL != module0206.f13425(var207) : var207;
        SubLObject var208 = (SubLObject)module0205.NIL;
        if (module0205.NIL != assertion_handles_oc.f11035(var207)) {
            var208 = module0178.f11303(var207);
        }
        else {
            var208 = var207;
        }
        return f13204(var208, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13354(final SubLObject var207) {
        assert module0205.NIL != module0206.f13425(var207) : var207;
        SubLObject var208 = (SubLObject)module0205.NIL;
        if (module0205.NIL != assertion_handles_oc.f11035(var207)) {
            var208 = module0178.f11303(var207);
        }
        else {
            var208 = var207;
        }
        return f13205(var208, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13180(final SubLObject var11, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        if (module0205.NIL != module0202.f12590(var11)) {
            return f13341(var11, var205);
        }
        if (module0205.NIL != module0167.f10813(var11)) {
            return f13341(module0172.f10915(var11), (SubLObject)module0205.UNPROVIDED);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var11)) {
            return f13341(module0538.f33367(var11, (SubLObject)module0205.UNPROVIDED), (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13341(final SubLObject var206, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        assert module0205.NIL != module0202.f12590(var206) : var206;
        return f13349(var206, var205, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13349(final SubLObject var11, final SubLObject var205, SubLObject var208) {
        if (var208 == module0205.UNPROVIDED) {
            var208 = (SubLObject)module0205.NIL;
        }
        if (module0205.NIL != var208) {
            return f13355(var11, var205);
        }
        return f13356(var11, var205);
    }
    
    public static SubLObject f13356(final SubLObject var11, final SubLObject var205) {
        if (module0205.NIL != module0202.f12714(var11)) {
            return f13355(var11, var205);
        }
        if (var11.isCons()) {
            return var11;
        }
        return f13355(var11, var205);
    }
    
    public static SubLObject f13355(final SubLObject var11, final SubLObject var205) {
        final SubLThread var206 = SubLProcess.currentSubLThread();
        if (module0205.NIL == var11) {
            return Values.values((SubLObject)module0205.NIL, (SubLObject)module0205.NIL);
        }
        if (var11.isCons()) {
            var206.resetMultipleValues();
            final SubLObject var207 = f13349(var11.rest(), var205, (SubLObject)module0205.T);
            final SubLObject var208 = var206.secondMultipleValue();
            var206.resetMultipleValues();
            if (module0205.NIL != var208) {
                return Values.values((SubLObject)ConsesLow.cons(var11.first(), var207), (SubLObject)module0205.T);
            }
            return Values.values(var11, (SubLObject)module0205.NIL);
        }
        else {
            if (module0205.NIL == module0201.f12580(var11)) {
                module0202.f12747((SubLObject)module0205.THREE_INTEGER, (SubLObject)module0205.$ic93$, var11, (SubLObject)module0205.UNPROVIDED, (SubLObject)module0205.UNPROVIDED);
                return Values.values((SubLObject)module0205.NIL, (SubLObject)module0205.T);
            }
            if (var205.eql((SubLObject)module0205.$ic22$)) {
                return Values.values((SubLObject)module0205.NIL, (SubLObject)module0205.T);
            }
            if (var205.eql((SubLObject)module0205.$ic15$)) {
                return Values.values((SubLObject)ConsesLow.list(var11), (SubLObject)module0205.T);
            }
            if (var205.eql((SubLObject)module0205.$ic92$)) {
                return Values.values(var11, (SubLObject)module0205.NIL);
            }
            return Values.values((SubLObject)module0205.NIL, (SubLObject)module0205.T);
        }
    }
    
    public static SubLObject f13357(final SubLObject var11, final SubLObject var70, SubLObject var38) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = (SubLObject)module0205.EQUAL;
        }
        if (module0205.NIL != module0202.f12590(var11)) {
            return f13358(var11, var70, var38);
        }
        if (module0205.NIL != module0167.f10813(var11)) {
            return f13358(module0172.f10915(var11), var70, var38);
        }
        if (module0205.NIL != assertion_handles_oc.f11035(var11)) {
            return f13358(module0538.f33367(var11, (SubLObject)module0205.UNPROVIDED), var70, var38);
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13358(final SubLObject var206, final SubLObject var70, SubLObject var38) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = (SubLObject)module0205.EQUAL;
        }
        assert module0205.NIL != module0202.f12590(var206) : var206;
        SubLObject var207 = (SubLObject)module0205.NIL;
        final SubLObject var208 = f13180(var206, (SubLObject)module0205.$ic22$);
        SubLObject var209 = (SubLObject)module0205.NIL;
        SubLObject var210 = (SubLObject)module0205.NIL;
        SubLObject var211 = (SubLObject)module0205.NIL;
        var209 = var208;
        var210 = var209.first();
        for (var211 = (SubLObject)module0205.ZERO_INTEGER; module0205.NIL != var209; var209 = var209.rest(), var210 = var209.first(), var211 = module0048.f_1X(var211)) {
            if (module0205.NIL != Functions.funcall(var38, var210, var70)) {
                var207 = (SubLObject)ConsesLow.cons(var211, var207);
            }
        }
        return Sequences.nreverse(var207);
    }
    
    public static SubLObject f13359(final SubLObject var206) {
        if (module0205.NIL != module0202.f12595(var206)) {
            return f13207(var206, (SubLObject)module0205.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(var206);
    }
    
    public static SubLObject f13360(final SubLObject var126, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return Sequences.length(f13304(var126, var205));
    }
    
    public static SubLObject f13304(final SubLObject var126, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13207(var126, var205);
    }
    
    public static SubLObject f13361(final SubLObject var210, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        assert module0205.NIL != module0202.f12659(var210) : var210;
        return f13348(var210, var205);
    }
    
    public static SubLObject f13362(final SubLObject var126, final SubLObject var106, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var126, var106, var205);
    }
    
    public static SubLObject f13363(final SubLObject var210, final SubLObject var106, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        assert module0205.NIL != module0202.f12659(var210) : var210;
        return f13340(var210, var106, var205);
    }
    
    public static SubLObject f13364(final SubLObject var126) {
        return f13365(var126);
    }
    
    public static SubLObject f13276(final SubLObject var126) {
        return f13365(var126);
    }
    
    public static SubLObject f13366(final SubLObject var210) {
        return f13342(var210);
    }
    
    public static SubLObject f13365(final SubLObject var126) {
        if (module0205.NIL != module0202.f12590(var126)) {
            return f13366(var126);
        }
        if (module0205.NIL != module0167.f10813(var126)) {
            return f13366(module0172.f10915(var126));
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13277(final SubLObject var126, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13362(var126, (SubLObject)module0205.ONE_INTEGER, var205);
    }
    
    public static SubLObject f13367(final SubLObject var210, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13363(var210, (SubLObject)module0205.ONE_INTEGER, var205);
    }
    
    public static SubLObject f13368(final SubLObject var126, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13362(var126, (SubLObject)module0205.TWO_INTEGER, var205);
    }
    
    public static SubLObject f13369(final SubLObject var210, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13363(var210, (SubLObject)module0205.TWO_INTEGER, var205);
    }
    
    public static SubLObject f13370(final SubLObject var126, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13362(var126, (SubLObject)module0205.THREE_INTEGER, var205);
    }
    
    public static SubLObject f13371(final SubLObject var126, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13362(var126, (SubLObject)module0205.FOUR_INTEGER, var205);
    }
    
    public static SubLObject f13372(final SubLObject var126, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13362(var126, (SubLObject)module0205.FIVE_INTEGER, var205);
    }
    
    public static SubLObject f13373(final SubLObject var18, final SubLObject var181) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0202.f12658(var18) && f13276(var18).eql(var181));
    }
    
    public static SubLObject f13374(final SubLObject var18, final SubLObject var181) {
        return module0202.f12589(var18, var181);
    }
    
    public static SubLObject f13375(final SubLObject var18, final SubLObject var211) {
        return module0202.f12591(var18, var211);
    }
    
    public static SubLObject f13300(final SubLObject var18, final SubLObject var181) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0206.f13453(var18) && f13276(var18).eql(var181));
    }
    
    public static SubLObject f13376(final SubLObject var62, final SubLObject var12, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var62, var12, var205);
    }
    
    public static SubLObject f13377(final SubLObject var62, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13207(var62, var205);
    }
    
    public static SubLObject f13210(final SubLObject var62) {
        return f13132(var62);
    }
    
    public static SubLObject f13378(final SubLObject var62) {
        return f13132(var62);
    }
    
    public static SubLObject f13379(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13203(var202, var205);
    }
    
    public static SubLObject f13380(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13204(var202, var205);
    }
    
    public static SubLObject f13381(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13205(var202, var205);
    }
    
    public static SubLObject f13382(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13345(var202, var205);
    }
    
    public static SubLObject f13383(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13346(var202, var205);
    }
    
    public static SubLObject f13384(final SubLObject var202, final SubLObject var12, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13134(var202, var12, var205);
    }
    
    public static SubLObject f13385(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13207(var202, var205);
    }
    
    public static SubLObject f13333(final SubLObject var202) {
        return f13132(var202);
    }
    
    public static SubLObject f13386(final SubLObject var202) {
        return f13132(var202);
    }
    
    public static SubLObject f13387(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13203(var202, var205);
    }
    
    public static SubLObject f13388(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13204(var202, var205);
    }
    
    public static SubLObject f13389(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13205(var202, var205);
    }
    
    public static SubLObject f13390(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13345(var202, var205);
    }
    
    public static SubLObject f13391(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13346(var202, var205);
    }
    
    public static SubLObject f13392(final SubLObject var202, SubLObject var205) {
        if (var205 == module0205.UNPROVIDED) {
            var205 = (SubLObject)module0205.$ic22$;
        }
        return f13347(var202, var205);
    }
    
    public static SubLObject f13393(final SubLObject var18) {
        return module0035.f2495(Symbols.symbol_function((SubLObject)module0205.$ic102$), var18);
    }
    
    public static SubLObject f13394(final SubLObject var11, final SubLObject var110, SubLObject var212) {
        if (var212 == module0205.UNPROVIDED) {
            var212 = (SubLObject)module0205.NIL;
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return module0035.f2037(module0202.f12762(var11), var110, var212);
    }
    
    public static SubLObject f13395(final SubLObject var11, final SubLObject var213, SubLObject var212) {
        if (var212 == module0205.UNPROVIDED) {
            var212 = (SubLObject)module0205.NIL;
        }
        return f13394(var11, var213, var212);
    }
    
    public static SubLObject f13396(final SubLObject var42, final SubLObject var11, SubLObject var38) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return module0035.f2047(var42, module0202.f12762(var11), var38);
    }
    
    public static SubLObject f13397(final SubLObject var42, final SubLObject var11, SubLObject var38) {
        if (var38 == module0205.UNPROVIDED) {
            var38 = Symbols.symbol_function((SubLObject)module0205.EQL);
        }
        return module0035.f2048(var42, module0202.f12762(var11), var38);
    }
    
    public static SubLObject f13398(final SubLObject var38, final SubLObject var11, SubLObject var32) {
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return module0035.f2050(var38, module0202.f12762(var11), var32);
    }
    
    public static SubLObject f13399(final SubLObject var38, final SubLObject var11, SubLObject var32) {
        if (var32 == module0205.UNPROVIDED) {
            var32 = Symbols.symbol_function((SubLObject)module0205.IDENTITY);
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return module0035.f2052(var38, module0202.f12762(var11), var32);
    }
    
    public static SubLObject f13400(final SubLObject var11, final SubLObject var110) {
        assert module0205.NIL != module0202.f12590(var11) : var11;
        for (SubLObject var111 = var110; module0205.NIL != var111; var111 = conses_high.butlast(var111, (SubLObject)module0205.UNPROVIDED)) {
            final SubLObject var112 = f13394(var11, var111, (SubLObject)module0205.UNPROVIDED);
            if (module0205.NIL != module0206.f13425(var112)) {
                return var112;
            }
        }
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13401(final SubLObject var18) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0205.NIL != module0202.f12589(var18, module0205.$ic103$) && module0205.NIL != f13393(f13207(var18, (SubLObject)module0205.UNPROVIDED)));
    }
    
    public static SubLObject f13402(final SubLObject var110) {
        assert module0205.NIL != f13393(var110) : var110;
        return module0202.f12683(module0205.$ic103$, var110, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13403(final SubLObject var216) {
        assert module0205.NIL != f13401(var216) : var216;
        return f13207(var216, (SubLObject)module0205.UNPROVIDED);
    }
    
    public static SubLObject f13404(final SubLObject var11, final SubLObject var214, SubLObject var212) {
        if (var212 == module0205.UNPROVIDED) {
            var212 = (SubLObject)module0205.NIL;
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        assert module0205.NIL != f13401(var214) : var214;
        return f13394(var11, f13403(var214), var212);
    }
    
    public static SubLObject f13405(final SubLObject var37, final SubLObject var214, final SubLObject var11) {
        assert module0205.NIL != f13401(var214) : var214;
        assert module0205.NIL != module0202.f12590(var11) : var11;
        return f13268(var37, f13403(var214), var11);
    }
    
    public static SubLObject f13406(final SubLObject var217, final SubLObject var218, final SubLObject var11) {
        assert module0205.NIL != module0035.f2015(var217) : var217;
        assert module0205.NIL != module0035.f2015(var218) : var218;
        SubLObject var219 = var218;
        SubLObject var220 = (SubLObject)module0205.NIL;
        var220 = var219.first();
        while (module0205.NIL != var219) {
            assert module0205.NIL != f13401(var220) : var220;
            var219 = var219.rest();
            var220 = var219.first();
        }
        assert module0205.NIL != module0202.f12590(var11) : var11;
        final SubLObject var221 = conses_high.copy_tree(var11);
        SubLObject var222 = (SubLObject)module0205.NIL;
        SubLObject var37_222 = (SubLObject)module0205.NIL;
        SubLObject var223 = (SubLObject)module0205.NIL;
        SubLObject var214_224 = (SubLObject)module0205.NIL;
        var222 = var217;
        var37_222 = var222.first();
        var223 = var218;
        var214_224 = var223.first();
        while (module0205.NIL != var223 || module0205.NIL != var222) {
            f13405(var37_222, var214_224, var221);
            var222 = var222.rest();
            var37_222 = var222.first();
            var223 = var223.rest();
            var214_224 = var223.first();
        }
        return var221;
    }
    
    public static SubLObject f13407() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0205", "f13123", "S#16043");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0205", "f13124", "S#16044");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13125", "S#16045", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13126", "S#15509", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13127", "S#16046", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13130", "S#15510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13128", "S#16047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13131", "S#16048", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13129", "S#16049", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13133", "S#16025", 2, 0, false);
        new $f13133$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13135", "S#16050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13137", "S#16051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13138", "S#16052", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13139", "S#16053", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13140", "S#16054", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13141", "S#16026", 1, 0, false);
        new $f13141$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13142", "S#16027", 1, 0, false);
        new $f13142$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13143", "S#16055", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13144", "HL-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13149", "S#16056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13153", "S#16057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13154", "S#9984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13155", "S#16058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13156", "S#16059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13157", "S#16060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13158", "S#16061", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13159", "S#16062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13160", "S#16063", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13161", "S#16064", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13162", "S#16065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13163", "S#16066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13164", "S#16067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13165", "S#12257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13166", "S#16068", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13167", "S#16069", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13169", "S#16070", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13170", "S#16071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13171", "S#16072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13172", "S#16073", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13173", "S#16074", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13174", "S#16075", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13175", "S#16076", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13177", "S#16077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13178", "S#16078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13179", "S#16079", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13181", "S#16080", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13182", "S#16081", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13183", "EXPRESSION-GATHER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13184", "ASSERTION-GATHER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13185", "S#16082", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13186", "S#16083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13187", "S#16084", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13188", "S#15487", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13189", "S#14098", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13190", "S#16085", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13191", "S#14097", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13192", "S#16086", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13193", "S#16087", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13194", "S#14099", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13195", "S#16088", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13196", "S#16089", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13168", "S#16090", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13197", "S#16091", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13198", "S#16092", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13176", "S#16093", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13199", "S#16094", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13200", "S#16095", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13201", "S#16096", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13202", "S#16097", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13206", "S#16098", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13208", "S#16099", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13209", "S#16100", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13211", "S#16101", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13212", "S#16102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13213", "S#16103", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13214", "S#16104", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13145", "EXPRESSION-FIND-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13215", "S#15533", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13216", "ASSERTION-FIND-IF", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13217", "S#16105", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13219", "S#16106", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13220", "EXPRESSION-FIND", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13221", "S#16107", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13222", "S#16108", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13223", "S#16109", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13224", "S#16110", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13225", "S#16111", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13226", "S#16112", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13227", "S#16113", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13228", "S#16114", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13229", "S#16115", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13230", "S#16116", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13231", "S#16117", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13232", "S#16118", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13147", "EXPRESSION-TRANSFORM", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13151", "EXPRESSION-NTRANSFORM", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13233", "S#15498", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13234", "S#15499", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13235", "S#16119", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13236", "S#16120", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13237", "S#16121", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13238", "S#16122", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13239", "S#16123", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13240", "S#16124", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13241", "S#16125", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13242", "S#16126", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13243", "S#16127", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13244", "S#16128", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13245", "S#16129", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13246", "S#16130", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13247", "S#16131", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13248", "S#16132", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13249", "S#16133", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13250", "EXPRESSION-SUBST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13251", "EXPRESSION-NSUBST", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13252", "S#16134", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13253", "S#16135", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13254", "S#16136", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13255", "S#16137", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13256", "S#16138", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13257", "EXPRESSION-SUBLIS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13258", "EXPRESSION-NSUBLIS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13259", "S#16139", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13260", "S#16140", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13261", "S#16141", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13262", "S#16142", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13263", "S#16143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13264", "S#16144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13265", "S#16145", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13266", "S#16146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13267", "S#16147", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13268", "S#16148", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13269", "S#16149", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13270", "S#16150", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13272", "S#16151", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13273", "S#16152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13274", "S#16153", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13278", "S#16154", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13279", "S#16155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13280", "S#16156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13271", "S#16157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13275", "S#16158", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13281", "S#16159", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13282", "S#16160", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13283", "S#16161", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13284", "S#16162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13287", "S#16163", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13285", "S#16164", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13288", "S#16165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13286", "S#16166", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13289", "S#16167", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13290", "S#16168", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13148", "S#16169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13152", "S#16170", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13292", "S#16171", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13146", "S#16172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13150", "S#16173", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13293", "S#16174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13294", "S#16039", 1, 0, false);
        new $f13294$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13291", "S#16175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13295", "S#16176", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13296", "S#16177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13297", "S#16178", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13298", "S#16179", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13299", "S#16180", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13301", "S#16181", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13302", "S#16182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13303", "S#16183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13305", "S#16184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13306", "S#16185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13307", "S#16186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13308", "S#16187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13310", "S#16188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13311", "S#16189", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13309", "S#16190", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13312", "S#16191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13313", "S#16192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13314", "S#16193", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13315", "S#16194", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13316", "S#16195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13317", "S#16196", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13318", "S#16197", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13319", "S#16198", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13320", "S#16199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13321", "S#16200", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13322", "S#16201", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13218", "S#16202", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13323", "S#16203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13324", "S#16204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13325", "S#16205", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13326", "S#12593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13327", "S#12594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13328", "S#12595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13329", "S#12596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13330", "S#12591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13331", "S#16206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13332", "S#15514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13334", "S#16207", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13335", "S#16208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13336", "S#15500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13337", "NEGATED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13338", "NEGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13339", "S#14913", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13134", "S#15512", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13340", "S#16209", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13132", "S#11996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13136", "FORMULA-OPERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13342", "S#15476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13343", "S#15478", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13344", "S#15482", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13203", "S#13440", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13204", "S#15505", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13205", "S#15507", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13345", "S#15508", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13346", "S#16210", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13347", "S#16211", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13207", "FORMULA-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13348", "S#15488", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13350", "S#16212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13351", "S#16213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13352", "S#16214", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13353", "S#16215", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13354", "S#16216", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13180", "S#15204", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13341", "S#16217", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13349", "S#16218", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13356", "S#16219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13355", "S#16220", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13357", "S#16221", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13358", "S#16222", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13359", "S#16223", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13360", "S#16224", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13304", "S#13275", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13361", "S#13263", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13362", "S#16225", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13363", "S#16226", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13364", "NAT-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13276", "NAT-FUNCTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13366", "S#13262", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13365", "S#16227", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13277", "NAT-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13367", "S#13277", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13368", "NAT-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13369", "S#16228", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13370", "S#16229", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13371", "S#16230", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13372", "S#16231", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13373", "S#16232", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13374", "S#16233", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13375", "S#16234", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13300", "S#16235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13376", "S#16236", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13377", "S#15528", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13210", "S#16237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13378", "S#13459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13379", "S#13457", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13380", "S#13458", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13381", "S#15504", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13382", "S#16238", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13383", "S#16239", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13384", "S#16240", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13385", "ATOMIC-SENTENCE-ARGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13333", "ATOMIC-SENTENCE-PREDICATE", 1, 0, false);
        new $f13333$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13386", "S#16241", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13387", "ATOMIC-SENTENCE-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13388", "ATOMIC-SENTENCE-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13389", "ATOMIC-SENTENCE-ARG3", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13390", "ATOMIC-SENTENCE-ARG4", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13391", "S#16242", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13392", "S#16243", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13393", "S#16244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13394", "S#16245", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13395", "S#16246", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13396", "S#16247", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13397", "S#16248", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13398", "S#16249", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13399", "S#16250", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13400", "S#16251", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13401", "S#16252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13402", "S#16253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13403", "S#16254", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13404", "S#16255", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13405", "S#16256", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0205", "f13406", "S#16257", 3, 0, false);
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13408() {
        module0205.$g2314$ = SubLFiles.defparameter("S#16258", (SubLObject)module0205.$ic0$);
        module0205.$g2315$ = SubLFiles.defparameter("S#16259", (SubLObject)module0205.$ic1$);
        module0205.$g2316$ = SubLFiles.defparameter("S#16260", (SubLObject)module0205.NIL);
        module0205.$g2317$ = SubLFiles.defparameter("S#16261", (SubLObject)module0205.NIL);
        module0205.$g2318$ = SubLFiles.defparameter("S#16262", (SubLObject)module0205.NIL);
        module0205.$g2319$ = SubLFiles.deflexical("S#16263", (SubLObject)module0205.$ic28$);
        module0205.$g2320$ = SubLFiles.deflexical("S#16264", (SubLObject)module0205.NIL);
        module0205.$g2321$ = SubLFiles.defparameter("S#16265", (SubLObject)module0205.$ic42$);
        module0205.$g2322$ = SubLFiles.deflexical("S#16266", ConsesLow.append(new SubLObject[] { module0202.$g2293$.getGlobalValue(), module0202.$g2294$.getGlobalValue(), module0202.$g2295$.getGlobalValue(), module0202.$g2296$.getGlobalValue(), module0202.$g2297$.getGlobalValue(), module0202.$g2298$.getGlobalValue(), module0202.$g2299$.getGlobalValue(), module0202.$g2300$.getGlobalValue(), module0202.$g2303$.getGlobalValue(), module0202.$g2304$.getGlobalValue() }));
        return (SubLObject)module0205.NIL;
    }
    
    public static SubLObject f13409() {
        module0002.f38((SubLObject)module0205.$ic26$);
        module0034.f1909((SubLObject)module0205.$ic34$);
        module0034.f1895((SubLObject)module0205.$ic64$);
        module0034.f1895((SubLObject)module0205.$ic67$);
        module0012.f368((SubLObject)module0205.$ic75$, (SubLObject)module0205.$ic76$, (SubLObject)module0205.$ic77$, (SubLObject)module0205.NIL, (SubLObject)module0205.$ic78$);
        module0012.f368((SubLObject)module0205.$ic80$, (SubLObject)module0205.$ic81$, (SubLObject)module0205.$ic82$, (SubLObject)module0205.$ic83$, (SubLObject)module0205.$ic84$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic88$);
        module0002.f38((SubLObject)module0205.$ic89$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic90$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic95$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic96$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic97$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic98$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic99$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic100$);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0205.$ic101$);
        return (SubLObject)module0205.NIL;
    }
    
    public void declareFunctions() {
        f13407();
    }
    
    public void initializeVariables() {
        f13408();
    }
    
    public void runTopLevelForms() {
        f13409();
    }
    
    static {
        me = (SubLFile)new module0205();
        module0205.$g2314$ = null;
        module0205.$g2315$ = null;
        module0205.$g2316$ = null;
        module0205.$g2317$ = null;
        module0205.$g2318$ = null;
        module0205.$g2319$ = null;
        module0205.$g2320$ = null;
        module0205.$g2321$ = null;
        module0205.$g2322$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#16047", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#16054", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#168", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic3$ = SubLObjectFactory.makeSymbol("CLET");
        $ic4$ = SubLObjectFactory.makeSymbol("S#16258", "CYC");
        $ic5$ = SubLObjectFactory.makeSymbol("S#16259", "CYC");
        $ic6$ = SubLObjectFactory.makeSymbol("S#16049", "CYC");
        $ic7$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SkolemFunctionFn"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#16026", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#16027", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#16055", "CYC");
        $ic12$ = SubLObjectFactory.makeKeyword("NART");
        $ic13$ = SubLObjectFactory.makeKeyword("ASSERTION");
        $ic14$ = SubLObjectFactory.makeSymbol("S#16061", "CYC");
        $ic15$ = SubLObjectFactory.makeKeyword("REGULARIZE");
        $ic16$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic17$ = SubLObjectFactory.makeSymbol("S#16083", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic20$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic21$ = SubLObjectFactory.makeSymbol("NART-P");
        $ic22$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic23$ = SubLObjectFactory.makeString("~S is not well formed.");
        $ic24$ = SubLObjectFactory.makeSymbol("S#16102", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic26$ = SubLObjectFactory.makeSymbol("EXPRESSION-FIND-IF");
        $ic27$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic28$ = SubLObjectFactory.makeInteger(212);
        $ic29$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");
        $ic30$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic31$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ExpandSubLFn"));
        $ic32$ = SubLObjectFactory.makeSymbol("S#12629", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic34$ = SubLObjectFactory.makeSymbol("S#16157", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#16264", "CYC");
        $ic36$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic37$ = ConsesLow.list((SubLObject)module0205.NIL);
        $ic38$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#16267", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16268", "CYC"));
        $ic39$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#16269", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#16270", "CYC"));
        $ic40$ = SubLObjectFactory.makeSymbol("DEFAULT-EL-VAR?");
        $ic41$ = SubLObjectFactory.makeSymbol("S#16039", "CYC");
        $ic42$ = SubLObjectFactory.makeString("?RENAMED-VAR");
        $ic43$ = SubLObjectFactory.makeSymbol("S#2879", "CYC");
        $ic44$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $ic45$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic48$ = SubLObjectFactory.makeSymbol("S#16179", "CYC");
        $ic49$ = SubLObjectFactory.makeSymbol("S#16180", "CYC");
        $ic50$ = SubLObjectFactory.makeInteger(5000);
        $ic51$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic52$ = SubLObjectFactory.makeString("");
        $ic53$ = SubLObjectFactory.makeString("#$");
        $ic54$ = SubLObjectFactory.makeSymbol("S#13570", "CYC");
        $ic55$ = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID");
        $ic56$ = SubLObjectFactory.makeSymbol("<");
        $ic57$ = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $ic58$ = SubLObjectFactory.makeSymbol("NART-ID");
        $ic59$ = SubLObjectFactory.makeSymbol("ASSERTION-ID");
        $ic60$ = SubLObjectFactory.makeSymbol("S#13754", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("S#16041", "CYC");
        $ic62$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("functionalInArgs"));
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("strictlyFunctionalInArgs"));
        $ic64$ = SubLObjectFactory.makeSymbol("S#16198", "CYC");
        $ic65$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic66$ = SubLObjectFactory.makeInteger(100);
        $ic67$ = SubLObjectFactory.makeSymbol("S#16201", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("S#16205", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#13726", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("NULL");
        $ic71$ = SubLObjectFactory.makeSymbol("S#16271", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $ic73$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("False"));
        $ic74$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic75$ = SubLObjectFactory.makeSymbol("NEGATED?");
        $ic76$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic77$ = SubLObjectFactory.makeString("Return T iff OBJECT is a negated EL formula.");
        $ic78$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $ic79$ = SubLObjectFactory.makeSymbol("S#15590", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("NEGATE");
        $ic81$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"));
        $ic82$ = SubLObjectFactory.makeString("Assuming FORM is a valid CycL formula, return a negated version of it.");
        $ic83$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15590", "CYC")));
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC"));
        $ic85$ = SubLObjectFactory.makeSymbol("TRUTH-P");
        $ic86$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic87$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic88$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"));
        $ic89$ = SubLObjectFactory.makeSymbol("FORMULA-OPERATOR");
        $ic90$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#15476", "CYC"));
        $ic91$ = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-P");
        $ic92$ = SubLObjectFactory.makeKeyword("INCLUDE");
        $ic93$ = SubLObjectFactory.makeString("formula-terms-int got a non-el-variable or cons: ~A~%");
        $ic94$ = SubLObjectFactory.makeSymbol("S#12761", "CYC");
        $ic95$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("NAT-FUNCTION"));
        $ic96$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("NAT-FUNCTOR"));
        $ic97$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13262", "CYC"));
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#16237", "CYC"));
        $ic99$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13459", "CYC"));
        $ic100$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE"));
        $ic101$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("S#16241", "CYC"));
        $ic102$ = SubLObjectFactory.makeSymbol("FIXNUMP");
        $ic103$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgPositionFn"));
        $ic104$ = SubLObjectFactory.makeSymbol("S#16244", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#16252", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
    }
    
    public static final class $f13133$BinaryFunction extends BinaryFunction
    {
        public $f13133$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16025"));
        }
        
        public SubLObject processItem(final SubLObject var16, final SubLObject var17) {
            return module0205.f13133(var16, var17);
        }
    }
    
    public static final class $f13141$UnaryFunction extends UnaryFunction
    {
        public $f13141$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16026"));
        }
        
        public SubLObject processItem(final SubLObject var16) {
            return module0205.f13141(var16);
        }
    }
    
    public static final class $f13142$UnaryFunction extends UnaryFunction
    {
        public $f13142$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16027"));
        }
        
        public SubLObject processItem(final SubLObject var16) {
            return module0205.f13142(var16);
        }
    }
    
    public static final class $f13294$UnaryFunction extends UnaryFunction
    {
        public $f13294$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16039"));
        }
        
        public SubLObject processItem(final SubLObject var16) {
            return module0205.f13294(var16);
        }
    }
    
    public static final class $f13333$UnaryFunction extends UnaryFunction
    {
        public $f13333$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ATOMIC-SENTENCE-PREDICATE"));
        }
        
        public SubLObject processItem(final SubLObject var16) {
            return module0205.f13333(var16);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0205.class
	Total time: 989 ms
	
	Decompiled with Procyon 0.5.32.
*/