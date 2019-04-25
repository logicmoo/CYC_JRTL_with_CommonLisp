package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0367 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0367";
    public static final String myFingerPrint = "2bc415d23b725ef0487668de811a65fbf06912be1abf284e7b4d1288de6d4bba";
    public static SubLSymbol $g3140$;
    public static SubLSymbol $g3141$;
    private static SubLSymbol $g3142$;
    private static SubLSymbol $g3143$;
    public static SubLSymbol $g3144$;
    public static SubLSymbol $g3145$;
    private static SubLSymbol $g3146$;
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
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
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
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
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
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLList $ic118$;
    private static final SubLList $ic119$;
    private static final SubLList $ic120$;
    private static final SubLList $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
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
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLList $ic155$;
    private static final SubLList $ic156$;
    private static final SubLList $ic157$;
    private static final SubLList $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLList $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLString $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    
    public static SubLObject f24995(final SubLObject var1, final SubLObject var2) {
        f24996(var1, var2, (SubLObject)module0367.ZERO_INTEGER);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f24997(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX8816_native.class) ? module0367.T : module0367.NIL);
    }
    
    public static SubLObject f24998(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f24999(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f25000(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f25001(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f25002(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f25003(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f25004(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f25005(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f25006(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f25007(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f25008(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f25009(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f25010(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f25011(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f25012(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f25013(final SubLObject var1) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.getField17();
    }
    
    public static SubLObject f25014(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f25015(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f25016(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f25017(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f25018(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f25019(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f25020(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f25021(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f25022(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f25023(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f25024(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f25025(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f25026(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f25027(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f25028(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f25029(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f24997(var1) : var1;
        return var1.setField17(var4);
    }
    
    public static SubLObject f25030(SubLObject var5) {
        if (var5 == module0367.UNPROVIDED) {
            var5 = (SubLObject)module0367.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX8816_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0367.NIL, var7 = var5; module0367.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0367.$ic41$)) {
                f25014(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic42$)) {
                f25015(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic43$)) {
                f25016(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic44$)) {
                f25017(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic45$)) {
                f25018(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic46$)) {
                f25019(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic47$)) {
                f25020(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic48$)) {
                f25021(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic49$)) {
                f25022(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic50$)) {
                f25023(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic51$)) {
                f25024(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic52$)) {
                f25025(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic53$)) {
                f25026(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic54$)) {
                f25027(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic55$)) {
                f25028(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic56$)) {
                f25029(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0367.$ic57$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f25031(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic58$, (SubLObject)module0367.$ic59$, (SubLObject)module0367.SIXTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic41$, f24998(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic42$, f24999(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic43$, f25000(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic44$, f25001(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic45$, f25002(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic46$, f25003(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic47$, f25004(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic48$, f25005(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic49$, f25006(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic50$, f25007(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic51$, f25008(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic52$, f25009(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic53$, f25010(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic54$, f25011(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic55$, f25012(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic56$, f25013(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic61$, (SubLObject)module0367.$ic59$, (SubLObject)module0367.SIXTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f25032(final SubLObject var11, final SubLObject var12) {
        return f25031(var11, var12);
    }
    
    public static SubLObject f25033(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0367.NIL != f24997(var13) && module0367.NIL == f25034(var13));
    }
    
    public static SubLObject f25034(final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic63$, f25035(var14));
    }
    
    public static SubLObject f24996(final SubLObject var13, final SubLObject var2, final SubLObject var15) {
        if (module0367.NIL != f25034(var13)) {
            PrintLow.format(var2, (SubLObject)module0367.$ic64$, f24998(var13));
        }
        else {
            final SubLObject var16 = f25035(var13);
            final SubLObject var17 = f25036(var13);
            final SubLObject var18 = f25037(var13);
            final SubLObject var19 = (SubLObject)((module0367.NIL != var18) ? oc_inference_datastructures_inference.f25422(var18) : module0367.NIL);
            final SubLObject var20 = (SubLObject)((module0367.NIL != var18) ? oc_inference_datastructures_inference.f25421(var18) : module0367.NIL);
            final SubLObject var21 = (SubLObject)((module0367.NIL != var20) ? module0361.f23996(var20) : module0367.NIL);
            PrintLow.format(var2, (SubLObject)module0367.$ic65$, new SubLObject[] { var16, var21, var17, var21, var19 });
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25038(final SubLObject var13) {
        return f24998(var13);
    }
    
    public static SubLObject f25039(final SubLObject var22, final SubLObject var18) {
        assert module0367.NIL != f25040(var22) : var22;
        assert module0367.NIL != oc_inference_datastructures_inference.f25275(var18) : var18;
        final SubLObject var23 = oc_inference_datastructures_inference.f25421(var18);
        final SubLObject var24 = module0361.f24357(var23);
        final SubLObject var25 = f25030((SubLObject)module0367.UNPROVIDED);
        f25014(var25, var24);
        f25015(var25, var18);
        f25016(var25, (SubLObject)module0367.NIL);
        f25017(var25, module0077.f5313(Symbols.symbol_function((SubLObject)module0367.EQ), (SubLObject)module0367.UNPROVIDED));
        f25018(var25, module0032.f1726((SubLObject)module0367.ZERO_INTEGER, Symbols.symbol_function((SubLObject)module0367.EQ)));
        f25019(var25, module0077.f5313(Symbols.symbol_function((SubLObject)module0367.EQ), (SubLObject)module0367.UNPROVIDED));
        f25024(var25, module0067.f4880(Symbols.symbol_function((SubLObject)module0367.EQ), (SubLObject)module0367.UNPROVIDED));
        f25020(var25, (SubLObject)module0367.NIL);
        f25021(var25, module0360.$g3047$.getGlobalValue());
        f25022(var25, module0360.$g3044$.getGlobalValue());
        f25023(var25, module0360.$g3045$.getGlobalValue());
        f25025(var25, Hashtables.make_hash_table((SubLObject)module0367.ONE_INTEGER, Symbols.symbol_function((SubLObject)module0367.EQ), (SubLObject)module0367.UNPROVIDED));
        f25026(var25, module0034.f1854((SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED));
        f25027(var25, (SubLObject)module0367.ZERO_INTEGER);
        f25028(var25, var22);
        f25029(var25, (SubLObject)module0367.NIL);
        final SubLObject var26 = f25041(var22, (SubLObject)module0367.$ic69$);
        Functions.funcall(var26, var25);
        module0361.f24366(var23, var25);
        oc_inference_datastructures_inference.f25680(var18, var25);
        return var25;
    }
    
    public static SubLObject f25042(final SubLObject var14) {
        if (module0367.NIL != f25033(var14)) {
            f25043(var14);
            module0361.f24367(f25044(var14), var14);
            oc_inference_datastructures_inference.f25681(f25037(var14), var14);
            return f25045(var14);
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25046(final SubLObject var14) {
        if (module0367.NIL != f25033(var14)) {
            f25043(var14);
            return f25045(var14);
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25047(final SubLObject var14) {
        if (module0367.NIL != f25033(var14)) {
            f25043(var14);
            module0361.f24367(f25044(var14), var14);
            return f25045(var14);
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25045(final SubLObject var14) {
        f25029(var14, (SubLObject)module0367.$ic63$);
        f25023(var14, (SubLObject)module0367.$ic63$);
        f25022(var14, (SubLObject)module0367.$ic63$);
        f25021(var14, (SubLObject)module0367.$ic63$);
        f25020(var14, (SubLObject)module0367.$ic63$);
        module0034.f1891(f25048(var14));
        f25026(var14, (SubLObject)module0367.$ic63$);
        module0067.f4881(f25008(var14));
        f25024(var14, (SubLObject)module0367.$ic63$);
        Hashtables.clrhash(f25009(var14));
        f25025(var14, (SubLObject)module0367.$ic63$);
        module0077.f5328(f25003(var14));
        f25019(var14, (SubLObject)module0367.$ic63$);
        module0077.f5328(f25001(var14));
        f25017(var14, (SubLObject)module0367.$ic63$);
        module0032.f1738(f25002(var14));
        f25018(var14, (SubLObject)module0367.$ic63$);
        f25016(var14, (SubLObject)module0367.$ic63$);
        f25015(var14, (SubLObject)module0367.$ic63$);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25043(final SubLObject var14) {
        f25028(var14, (SubLObject)module0367.$ic63$);
        return var14;
    }
    
    public static SubLObject f25049(final SubLObject var14, final SubLObject var25) {
        f25050(var14, var25);
        f25051(var14, var25);
        f25052(var14, var25);
        f25053(var25, var14);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25036(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f24998(var14);
    }
    
    public static SubLObject f25037(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f24999(var14);
    }
    
    public static SubLObject f25054(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25000(var14);
    }
    
    public static SubLObject f25055(final SubLObject var14) {
        return f25009(var14);
    }
    
    public static SubLObject f25035(final SubLObject var14) {
        return f25012(var14);
    }
    
    public static SubLObject f25056(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25013(var14);
    }
    
    public static SubLObject f25057(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25001(var14);
    }
    
    public static SubLObject f25058(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25002(var14);
    }
    
    public static SubLObject f25059(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25003(var14);
    }
    
    public static SubLObject f25060(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25004(var14);
    }
    
    public static SubLObject f25061(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25005(var14);
    }
    
    public static SubLObject f25062(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25006(var14);
    }
    
    public static SubLObject f25063(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25007(var14);
    }
    
    public static SubLObject f25064(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25008(var14);
    }
    
    public static SubLObject f25065(final SubLObject var14) {
        assert module0367.NIL != f24997(var14) : var14;
        return f25011(var14);
    }
    
    public static SubLObject f25066(final SubLObject var14, final SubLObject var26) {
        assert module0367.NIL != f24997(var14) : var14;
        assert module0367.NIL != module0360.f23966(var26) : var26;
        f25016(var14, var26);
        return var14;
    }
    
    public static SubLObject f25067(final SubLObject var14, final SubLObject var27) {
        assert module0367.NIL != f24997(var14) : var14;
        assert module0367.NIL != module0360.f23933(var27) : var27;
        f25021(var14, var27);
        return var14;
    }
    
    public static SubLObject f25068(final SubLObject var14, final SubLObject var27) {
        assert module0367.NIL != f24997(var14) : var14;
        assert module0367.NIL != module0360.f23933(var27) : var27;
        f25022(var14, var27);
        return var14;
    }
    
    public static SubLObject f25069(final SubLObject var14, final SubLObject var28) {
        assert module0367.NIL != f24997(var14) : var14;
        assert module0367.NIL != module0371.f25933(var28) : var28;
        f25023(var14, var28);
        return var14;
    }
    
    public static SubLObject f25070(final SubLObject var14, final SubLObject var29) {
        assert module0367.NIL != f24997(var14) : var14;
        f25029(var14, var29);
        return var14;
    }
    
    public static SubLObject f25071(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        final SubLObject var34 = var33.rest();
        var33 = var33.first();
        SubLObject var35 = (SubLObject)module0367.NIL;
        SubLObject var36 = (SubLObject)module0367.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        var35 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        var36 = var33.first();
        var33 = var33.rest();
        SubLObject var37 = (SubLObject)module0367.NIL;
        SubLObject var38 = var33;
        SubLObject var39 = (SubLObject)module0367.NIL;
        SubLObject var39_40 = (SubLObject)module0367.NIL;
        while (module0367.NIL != var38) {
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)module0367.$ic79$);
            var39_40 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)module0367.$ic79$);
            if (module0367.NIL == conses_high.member(var39_40, (SubLObject)module0367.$ic80$, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED)) {
                var39 = (SubLObject)module0367.T;
            }
            if (var39_40 == module0367.$ic81$) {
                var37 = var38.first();
            }
            var38 = var38.rest();
        }
        if (module0367.NIL != var39 && module0367.NIL == var37) {
            cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0367.$ic79$);
        }
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0367.$ic82$, var33);
        final SubLObject var41 = (SubLObject)((module0367.NIL != var40) ? conses_high.cadr(var40) : module0367.NIL);
        final SubLObject var42;
        var33 = (var42 = var34);
        return (SubLObject)ConsesLow.listS((SubLObject)module0367.$ic83$, (SubLObject)ConsesLow.list(var35, (SubLObject)ConsesLow.list((SubLObject)module0367.$ic70$, var36), (SubLObject)module0367.$ic82$, var41), ConsesLow.append(var42, (SubLObject)module0367.NIL));
    }
    
    public static SubLObject f25072(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        final SubLObject var34 = var33.rest();
        var33 = var33.first();
        SubLObject var35 = (SubLObject)module0367.NIL;
        SubLObject var36 = (SubLObject)module0367.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        var35 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        var36 = var33.first();
        var33 = var33.rest();
        SubLObject var37 = (SubLObject)module0367.NIL;
        SubLObject var38 = var33;
        SubLObject var39 = (SubLObject)module0367.NIL;
        SubLObject var50_51 = (SubLObject)module0367.NIL;
        while (module0367.NIL != var38) {
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)module0367.$ic79$);
            var50_51 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)module0367.$ic79$);
            if (module0367.NIL == conses_high.member(var50_51, (SubLObject)module0367.$ic80$, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED)) {
                var39 = (SubLObject)module0367.T;
            }
            if (var50_51 == module0367.$ic81$) {
                var37 = var38.first();
            }
            var38 = var38.rest();
        }
        if (module0367.NIL != var39 && module0367.NIL == var37) {
            cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0367.$ic79$);
        }
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0367.$ic82$, var33);
        final SubLObject var41 = (SubLObject)((module0367.NIL != var40) ? conses_high.cadr(var40) : module0367.NIL);
        final SubLObject var42;
        var33 = (var42 = var34);
        return (SubLObject)ConsesLow.listS((SubLObject)module0367.$ic84$, (SubLObject)ConsesLow.list(var35, (SubLObject)ConsesLow.list((SubLObject)module0367.$ic72$, var36), (SubLObject)module0367.$ic82$, var41), ConsesLow.append(var42, (SubLObject)module0367.NIL));
    }
    
    public static SubLObject f25073(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        final SubLObject var34 = var33.rest();
        var33 = var33.first();
        SubLObject var35 = (SubLObject)module0367.NIL;
        SubLObject var36 = (SubLObject)module0367.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        var35 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic79$);
        var36 = var33.first();
        var33 = var33.rest();
        SubLObject var37 = (SubLObject)module0367.NIL;
        SubLObject var38 = var33;
        SubLObject var39 = (SubLObject)module0367.NIL;
        SubLObject var59_60 = (SubLObject)module0367.NIL;
        while (module0367.NIL != var38) {
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)module0367.$ic79$);
            var59_60 = var38.first();
            var38 = var38.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var38, var32, (SubLObject)module0367.$ic79$);
            if (module0367.NIL == conses_high.member(var59_60, (SubLObject)module0367.$ic80$, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED)) {
                var39 = (SubLObject)module0367.T;
            }
            if (var59_60 == module0367.$ic81$) {
                var37 = var38.first();
            }
            var38 = var38.rest();
        }
        if (module0367.NIL != var39 && module0367.NIL == var37) {
            cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0367.$ic79$);
        }
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0367.$ic82$, var33);
        final SubLObject var41 = (SubLObject)((module0367.NIL != var40) ? conses_high.cadr(var40) : module0367.NIL);
        final SubLObject var42;
        var33 = (var42 = var34);
        return (SubLObject)ConsesLow.listS((SubLObject)module0367.$ic83$, (SubLObject)ConsesLow.list(var35, (SubLObject)ConsesLow.list((SubLObject)module0367.$ic74$, var36), (SubLObject)module0367.$ic82$, var41), ConsesLow.append(var42, (SubLObject)module0367.NIL));
    }
    
    public static SubLObject f25074(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        SubLObject var34 = (SubLObject)module0367.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic85$);
        var34 = var33.first();
        final SubLObject var35;
        var33 = (var35 = var33.rest());
        final SubLObject var36 = (SubLObject)module0367.$ic86$;
        final SubLObject var37 = (SubLObject)module0367.$ic87$;
        return (SubLObject)ConsesLow.list((SubLObject)module0367.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var36, var34), (SubLObject)ConsesLow.list(var37, (SubLObject)ConsesLow.list((SubLObject)module0367.$ic89$, var36)), (SubLObject)ConsesLow.list((SubLObject)module0367.$ic90$, var36)), (SubLObject)ConsesLow.listS((SubLObject)module0367.$ic91$, (SubLObject)ConsesLow.list(var37), ConsesLow.append(var35, (SubLObject)module0367.NIL)));
    }
    
    public static SubLObject f25048(final SubLObject var14) {
        return f25010(var14);
    }
    
    public static SubLObject f25075() {
        final SubLThread var66 = SubLProcess.currentSubLThread();
        return module0367.$g3141$.getDynamicValue(var66);
    }
    
    public static SubLObject f25076(final SubLObject var67) {
        return (SubLObject)((module0367.NIL != f24997(var67)) ? f25037(var67) : module0367.NIL);
    }
    
    public static SubLObject f25077(final SubLObject var14) {
        return oc_inference_datastructures_inference.f25474(f25037(var14));
    }
    
    public static SubLObject f25078(final SubLObject var14) {
        return module0374.f26534(f25077(var14));
    }
    
    public static SubLObject f25079(final SubLObject var14) {
        if (module0367.NIL != f25078(var14)) {
            return (SubLObject)module0367.NIL;
        }
        if (module0367.NIL != module0373.f26352(f25037(var14), f25077(var14)) && module0367.NIL != oc_inference_datastructures_inference.f25615(f25037(var14))) {
            return (SubLObject)module0367.NIL;
        }
        return (SubLObject)module0367.T;
    }
    
    public static SubLObject f25080(final SubLObject var14) {
        return oc_inference_datastructures_inference.f25597(f25037(var14));
    }
    
    public static SubLObject f25081(final SubLObject var14) {
        return oc_inference_datastructures_inference.f25432(f25037(var14));
    }
    
    public static SubLObject f25082(final SubLObject var25, final SubLObject var14) {
        return module0077.f5320(var25, f25057(var14));
    }
    
    public static SubLObject f25083(final SubLObject var25, final SubLObject var14) {
        return module0032.f1731(var25, f25058(var14), Symbols.symbol_function((SubLObject)module0367.EQ));
    }
    
    public static SubLObject f25084(final SubLObject var25, final SubLObject var14) {
        return module0077.f5320(var25, f25059(var14));
    }
    
    public static SubLObject f25085(final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0367.NIL == module0077.f5316(f25059(var14)));
    }
    
    public static SubLObject f25086(final SubLObject var14) {
        return module0035.delete_if_not((SubLObject)module0367.$ic94$, module0077.f5312(f25059(var14)), (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED);
    }
    
    public static SubLObject f25044(final SubLObject var14) {
        return oc_inference_datastructures_inference.f25421(f25037(var14));
    }
    
    public static SubLObject f25087(final SubLObject var14) {
        final SubLObject var15 = f25054(var14);
        if (module0367.NIL != var15) {
            return var15;
        }
        final SubLObject var16 = f25037(var14);
        return oc_inference_datastructures_inference.f25504(var16);
    }
    
    public static SubLObject f25088(final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic95$, f25087(var14));
    }
    
    public static SubLObject f25089(final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic96$, f25087(var14));
    }
    
    public static SubLObject f25090(final SubLObject var14) {
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25091(final SubLObject var14) {
        return module0077.f5311(f25057(var14));
    }
    
    public static SubLObject f25092(final SubLObject var14) {
        return module0032.f1728(f25058(var14));
    }
    
    public static SubLObject f25093(final SubLObject var14) {
        return module0077.f5311(f25059(var14));
    }
    
    public static SubLObject f25094(final SubLObject var14, final SubLObject var25) {
        assert module0367.NIL != f24997(var14) : var14;
        assert module0367.NIL != module0363.f24478(var25) : var25;
        return module0067.f4885(f25064(var14), var25, (SubLObject)module0367.$ic98$);
    }
    
    public static SubLObject f25095(final SubLObject var14, final SubLObject var69, final SubLObject var70) {
        assert module0367.NIL != f24997(var14) : var14;
        assert module0367.NIL != module0360.f23846(var69) : var69;
        if (var69.eql((SubLObject)module0367.$ic48$)) {
            f25067(var14, var70);
        }
        else if (var69.eql((SubLObject)module0367.$ic49$)) {
            f25068(var14, var70);
        }
        else if (var69.eql((SubLObject)module0367.$ic50$)) {
            f25069(var14, var70);
        }
        else {
            Errors.error((SubLObject)module0367.$ic100$, var69, var70);
        }
        return var14;
    }
    
    public static SubLObject f25096(final SubLObject var71, final SubLObject var72) {
        f25067(var72, f25061(var71));
        f25068(var72, f25062(var71));
        f25069(var72, f25063(var71));
        return var72;
    }
    
    public static SubLObject f25097(final SubLObject var14, final SubLObject var73) {
        assert module0367.NIL != module0360.f23847(var73) : var73;
        SubLObject var74;
        SubLObject var75;
        SubLObject var76;
        for (var74 = (SubLObject)module0367.NIL, var74 = var73; module0367.NIL != var74; var74 = conses_high.cddr(var74)) {
            var75 = var74.first();
            var76 = conses_high.cadr(var74);
            f25095(var14, var75, var76);
        }
        return var14;
    }
    
    public static SubLObject f25098(final SubLObject var14, final SubLObject var25) {
        module0077.f5326(var25, f25057(var14));
        return var14;
    }
    
    public static SubLObject f25050(final SubLObject var14, final SubLObject var25) {
        module0077.f5327(var25, f25057(var14));
        return var14;
    }
    
    public static SubLObject f25099(final SubLObject var14, final SubLObject var25) {
        final SubLObject var26 = f25058(var14);
        f25018(var14, module0032.f1736(var25, var26, Symbols.symbol_function((SubLObject)module0367.EQ)));
        f25100(var14, (SubLObject)module0367.$ic102$, var25, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED);
        return var14;
    }
    
    public static SubLObject f25051(final SubLObject var14, final SubLObject var25) {
        module0032.f1737(var25, f25058(var14), Symbols.symbol_function((SubLObject)module0367.EQ));
        return var14;
    }
    
    public static SubLObject f25101(final SubLObject var14, final SubLObject var25) {
        module0077.f5326(var25, f25059(var14));
        return var14;
    }
    
    public static SubLObject f25052(final SubLObject var14, final SubLObject var25) {
        module0077.f5327(var25, f25059(var14));
        return var14;
    }
    
    public static SubLObject f25102(final SubLObject var14) {
        module0077.f5328(f25059(var14));
        return var14;
    }
    
    public static SubLObject f25103(final SubLObject var14) {
        f25020(var14, (SubLObject)module0367.T);
        return var14;
    }
    
    public static SubLObject f25104(final SubLObject var14) {
        f25020(var14, (SubLObject)module0367.NIL);
        return var14;
    }
    
    public static SubLObject f25105(final SubLObject var30, final SubLObject var31) {
        SubLObject var33;
        final SubLObject var32 = var33 = var30.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic103$);
        final SubLObject var34 = var33.rest();
        var33 = var33.first();
        SubLObject var35 = (SubLObject)module0367.NIL;
        SubLObject var36 = (SubLObject)module0367.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic103$);
        var35 = var33.first();
        var33 = var33.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var33, var32, (SubLObject)module0367.$ic103$);
        var36 = var33.first();
        var33 = var33.rest();
        if (module0367.NIL == var33) {
            final SubLObject var37;
            var33 = (var37 = var34);
            final SubLObject var38 = (SubLObject)module0367.$ic104$;
            final SubLObject var39 = (SubLObject)module0367.$ic105$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0367.$ic88$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var38, var35), (SubLObject)ConsesLow.list(var39, var36)), (SubLObject)ConsesLow.list((SubLObject)module0367.$ic106$, var38, var39), ConsesLow.append(var37, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0367.$ic107$, var38, var39), (SubLObject)ConsesLow.list((SubLObject)module0367.$ic108$, var38, var39))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var32, (SubLObject)module0367.$ic103$);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25106(final SubLObject var14, final SubLObject var25, final SubLObject var28) {
        assert module0367.NIL != module0363.f24478(var25) : var25;
        final SubLObject var29 = module0067.f4885(f25064(var14), var25, (SubLObject)module0367.$ic109$);
        final SubLObject var30 = module0371.f26018(var29, var28);
        if (!var30.equal(var29)) {
            module0067.f4886(f25064(var14), var25, var30);
            f25107(var25, var14);
            return (SubLObject)module0367.T;
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25108(final SubLObject var14) {
        SubLObject var15 = f25011(var14);
        var15 = Numbers.add(var15, (SubLObject)module0367.ONE_INTEGER);
        f25027(var14, var15);
        return var15;
    }
    
    public static SubLObject f25109(final SubLObject var14, final SubLObject var82, SubLObject var3, SubLObject var83, SubLObject var84, SubLObject var85, SubLObject var86) {
        final SubLObject var87 = (SubLObject)SubLObjectFactory.makeBoolean(var3 != module0367.UNPROVIDED);
        final SubLObject var88 = (SubLObject)SubLObjectFactory.makeBoolean(var83 != module0367.UNPROVIDED);
        final SubLObject var89 = (SubLObject)SubLObjectFactory.makeBoolean(var84 != module0367.UNPROVIDED);
        final SubLObject var90 = (SubLObject)SubLObjectFactory.makeBoolean(var85 != module0367.UNPROVIDED);
        final SubLObject var91 = (SubLObject)SubLObjectFactory.makeBoolean(var86 != module0367.UNPROVIDED);
        if (var3 == module0367.UNPROVIDED) {
            var3 = (SubLObject)module0367.NIL;
        }
        if (var83 == module0367.UNPROVIDED) {
            var83 = (SubLObject)module0367.NIL;
        }
        if (var84 == module0367.UNPROVIDED) {
            var84 = (SubLObject)module0367.NIL;
        }
        if (var85 == module0367.UNPROVIDED) {
            var85 = (SubLObject)module0367.NIL;
        }
        if (var86 == module0367.UNPROVIDED) {
            var86 = (SubLObject)module0367.NIL;
        }
        SubLObject var92 = f25110(var14, var82);
        if (module0367.NIL == var92) {
            var92 = module0360.f23957(var82);
        }
        if (module0367.NIL == var92 && module0367.NIL != module0390.f27709(var14)) {
            return Errors.error((SubLObject)module0367.$ic110$, var82);
        }
        if (module0367.NIL != var91) {
            return f25111(var92, var14, var3, var83, var84, var85, var86);
        }
        if (module0367.NIL != var90) {
            return f25112(var92, var14, var3, var83, var84, var85);
        }
        if (module0367.NIL != var89) {
            return f25113(var92, var14, var3, var83, var84);
        }
        if (module0367.NIL != var88) {
            return f25114(var92, var14, var3, var83);
        }
        if (module0367.NIL != var87) {
            return f25115(var92, var14, var3);
        }
        return f25116(var92, var14);
    }
    
    public static SubLObject f25110(final SubLObject var14, final SubLObject var82) {
        final SubLObject var83 = f25035(var14);
        return module0387.f27535(var83, var82);
    }
    
    public static SubLObject f25116(final SubLObject var93, final SubLObject var14) {
        return Functions.funcall(var93, var14);
    }
    
    public static SubLObject f25115(final SubLObject var93, final SubLObject var14, final SubLObject var3) {
        return Functions.funcall(var93, var14, var3);
    }
    
    public static SubLObject f25114(final SubLObject var93, final SubLObject var14, final SubLObject var3, final SubLObject var83) {
        return Functions.funcall(var93, var14, var3, var83);
    }
    
    public static SubLObject f25113(final SubLObject var93, final SubLObject var14, final SubLObject var3, final SubLObject var83, final SubLObject var84) {
        return Functions.funcall(var93, var14, var3, var83, var84);
    }
    
    public static SubLObject f25112(final SubLObject var93, final SubLObject var14, final SubLObject var3, final SubLObject var83, final SubLObject var84, final SubLObject var85) {
        return Functions.funcall(var93, var14, var3, var83, var84, var85);
    }
    
    public static SubLObject f25111(final SubLObject var93, final SubLObject var14, final SubLObject var3, final SubLObject var83, final SubLObject var84, final SubLObject var85, final SubLObject var86) {
        return Functions.funcall(var93, var14, var3, var83, var84, var85, var86);
    }
    
    public static SubLObject f25117(final SubLObject var14) {
        return Errors.error((SubLObject)module0367.$ic111$, var14);
    }
    
    public static SubLObject f25100(final SubLObject var94, final SubLObject var82, SubLObject var3, SubLObject var83, SubLObject var84, SubLObject var85) {
        final SubLObject var95 = (SubLObject)SubLObjectFactory.makeBoolean(var3 != module0367.UNPROVIDED);
        final SubLObject var96 = (SubLObject)SubLObjectFactory.makeBoolean(var83 != module0367.UNPROVIDED);
        final SubLObject var97 = (SubLObject)SubLObjectFactory.makeBoolean(var84 != module0367.UNPROVIDED);
        final SubLObject var98 = (SubLObject)SubLObjectFactory.makeBoolean(var85 != module0367.UNPROVIDED);
        if (var3 == module0367.UNPROVIDED) {
            var3 = (SubLObject)module0367.NIL;
        }
        if (var83 == module0367.UNPROVIDED) {
            var83 = (SubLObject)module0367.NIL;
        }
        if (var84 == module0367.UNPROVIDED) {
            var84 = (SubLObject)module0367.NIL;
        }
        if (var85 == module0367.UNPROVIDED) {
            var85 = (SubLObject)module0367.NIL;
        }
        final SubLObject var99 = module0387.f27481(var94);
        if (var94.eql(var99)) {
            return (SubLObject)module0367.NIL;
        }
        if (module0367.NIL != var98) {
            return f25109(var99, var82, var94, var3, var83, var84, var85);
        }
        if (module0367.NIL != var97) {
            return f25109(var99, var82, var94, var3, var83, var84, (SubLObject)module0367.UNPROVIDED);
        }
        if (module0367.NIL != var96) {
            return f25109(var99, var82, var94, var3, var83, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED);
        }
        if (module0367.NIL != var95) {
            return f25109(var99, var82, var94, var3, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED);
        }
        return f25109(var99, var82, var94, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED, (SubLObject)module0367.UNPROVIDED);
    }
    
    public static SubLObject f25040(final SubLObject var13) {
        return module0067.f4884(module0367.$g3142$.getGlobalValue(), var13, (SubLObject)module0367.UNPROVIDED);
    }
    
    public static SubLObject f25118(final SubLObject var22, final SubLObject var96) {
        assert module0367.NIL != module0035.f2327(var96) : var96;
        f25119(var22);
        SubLObject var97;
        SubLObject var98;
        SubLObject var99;
        for (var97 = (SubLObject)module0367.NIL, var97 = var96; module0367.NIL != var97; var97 = conses_high.cddr(var97)) {
            var98 = var97.first();
            var99 = conses_high.cadr(var97);
            f25120(var22, var98, var99);
        }
        return var22;
    }
    
    public static SubLObject f25119(final SubLObject var22) {
        return module0067.f4887(module0367.$g3142$.getGlobalValue(), var22);
    }
    
    public static SubLObject f25121() {
        module0067.f4881(module0367.$g3142$.getGlobalValue());
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25041(final SubLObject var22, final SubLObject var69) {
        return module0084.f5769(module0367.$g3142$.getGlobalValue(), var22, var69, (SubLObject)module0367.UNPROVIDED);
    }
    
    public static SubLObject f25120(final SubLObject var22, final SubLObject var69, final SubLObject var70) {
        assert module0367.NIL != module0360.f23956(var69) : var69;
        return module0084.f5770(module0367.$g3142$.getGlobalValue(), var22, var69, var70);
    }
    
    public static SubLObject f25122() {
        return Vectors.make_vector((SubLObject)module0367.TWO_INTEGER, (SubLObject)module0367.$ic115$);
    }
    
    public static SubLObject f25123(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0367.ZERO_INTEGER);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25124(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX27910_native.class) ? module0367.T : module0367.NIL);
    }
    
    public static SubLObject f25125(final SubLObject var1) {
        assert module0367.NIL != f25124(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f25126(final SubLObject var1) {
        assert module0367.NIL != f25124(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f25127(final SubLObject var1) {
        assert module0367.NIL != f25124(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f25128(final SubLObject var1) {
        assert module0367.NIL != f25124(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f25129(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f25124(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f25130(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f25124(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f25131(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f25124(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f25132(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f25124(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f25133(SubLObject var5) {
        if (var5 == module0367.UNPROVIDED) {
            var5 = (SubLObject)module0367.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX27910_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0367.NIL, var7 = var5; module0367.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0367.$ic133$)) {
                f25129(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic134$)) {
                f25130(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic135$)) {
                f25131(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic136$)) {
                f25132(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0367.$ic57$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f25134(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic58$, (SubLObject)module0367.$ic137$, (SubLObject)module0367.FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic133$, f25125(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic134$, f25126(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic135$, f25127(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic136$, f25128(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic61$, (SubLObject)module0367.$ic137$, (SubLObject)module0367.FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f25135(final SubLObject var11, final SubLObject var12) {
        return f25134(var11, var12);
    }
    
    public static SubLObject f25136() {
        final SubLObject var100 = f25133((SubLObject)module0367.UNPROVIDED);
        f25129(var100, (SubLObject)module0367.$ic139$);
        f25130(var100, (SubLObject)module0367.NIL);
        f25131(var100, (SubLObject)module0367.ZERO_INTEGER);
        f25132(var100, f25122());
        return var100;
    }
    
    public static SubLObject f25137(final SubLObject var25, final SubLObject var14) {
        assert module0367.NIL != module0363.f24478(var25) : var25;
        assert module0367.NIL != f24997(var14) : var14;
        final SubLObject var26 = Hashtables.gethash_without_values(var25, f25055(var14), (SubLObject)module0367.UNPROVIDED);
        return var26;
    }
    
    public static SubLObject f25138(final SubLObject var25, final SubLObject var14, final SubLObject var101) {
        assert module0367.NIL != module0363.f24478(var25) : var25;
        assert module0367.NIL != f24997(var14) : var14;
        assert module0367.NIL != f25124(var101) : var101;
        final SubLObject var102 = f25055(var14);
        Hashtables.sethash(var25, var102, var101);
        return var25;
    }
    
    public static SubLObject f25053(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25055(var14);
        Hashtables.remhash(var25, var26);
        return var25;
    }
    
    public static SubLObject f25139(final SubLObject var25, final SubLObject var14) {
        SubLObject var26 = f25137(var25, var14);
        if (module0367.NIL == f25124(var26)) {
            var26 = f25136();
            f25138(var25, var14, var26);
        }
        return var26;
    }
    
    public static SubLObject f25140(final SubLObject var25, final SubLObject var100) {
        SubLObject var101 = f25126(var100);
        if (!var101.isVector()) {
            var101 = Vectors.make_vector(module0363.f24611(var25), (SubLObject)module0367.UNPROVIDED);
            f25130(var100, var101);
        }
        if (Sequences.length(var101).numL(module0363.f24611(var25))) {
            var101 = module0037.f2564(var101, module0363.f24611(var25), (SubLObject)module0367.UNPROVIDED);
            f25130(var100, var101);
        }
        return var101;
    }
    
    public static SubLObject f25141(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25142(var25, var14);
        if (module0367.NIL != module0373.f26329(var25)) {
            final SubLObject var27 = module0373.f26381(var26);
            return var27;
        }
        return var26;
    }
    
    public static SubLObject f25142(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25139(var25, var14);
        final SubLObject var27 = f25125(var26);
        if (module0367.$ic139$ == var27 && module0367.$ic139$ != module0363.f24506(var25)) {
            return (SubLObject)module0367.$ic140$;
        }
        return var27;
    }
    
    public static SubLObject f25143(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25142(var25, var14);
        final SubLObject var27 = module0360.f23886(var26);
        return var27;
    }
    
    public static SubLObject f25144(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25143(var25, var14);
        if (module0367.NIL != module0363.f24689(var25)) {
            return (SubLObject)module0367.$ic141$;
        }
        return var26;
    }
    
    public static SubLObject f25145(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25141(var25, var14);
        final SubLObject var27 = module0360.f23887(var26);
        if (module0367.$ic142$ == var27 && module0367.NIL != module0363.f24681(var25)) {
            return (SubLObject)module0367.$ic143$;
        }
        return var27;
    }
    
    public static SubLObject f25146(final SubLObject var25, final SubLObject var67) {
        assert module0367.NIL != module0373.f26190(var67) : var67;
        return (module0367.NIL != f24997(var67)) ? f25144(var25, var67) : module0363.f24683(var25);
    }
    
    public static SubLObject f25147(final SubLObject var25, final SubLObject var67) {
        assert module0367.NIL != module0373.f26190(var67) : var67;
        return (module0367.NIL != f24997(var67)) ? f25145(var25, var67) : module0363.f24679(var25);
    }
    
    public static SubLObject f25148(final SubLObject var25, final SubLObject var14, final SubLObject var106) {
        final SubLThread var107 = SubLProcess.currentSubLThread();
        if (module0367.NIL == Errors.$ignore_mustsP$.getDynamicValue(var107) && module0367.NIL != module0360.f23888(var106)) {
            Errors.error((SubLObject)module0367.$ic145$, var106, var25, var14);
        }
        if (module0367.NIL == Errors.$ignore_mustsP$.getDynamicValue(var107) && module0367.$ic146$ == var106) {
            Errors.error((SubLObject)module0367.$ic147$, var25, var14);
        }
        final SubLObject var108 = f25139(var25, var14);
        f25129(var108, var106);
        return var25;
    }
    
    public static SubLObject f25149(final SubLObject var25, final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic140$, f25144(var25, var14));
    }
    
    public static SubLObject f25150(final SubLObject var25, final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic148$, f25144(var25, var14));
    }
    
    public static SubLObject f25151(final SubLObject var25, final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic149$, f25144(var25, var14));
    }
    
    public static SubLObject f25152(final SubLObject var25, final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic150$, f25144(var25, var14));
    }
    
    public static SubLObject f25153(final SubLObject var25, final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic141$, f25144(var25, var14));
    }
    
    public static SubLObject f25154(final SubLObject var25, final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic143$, f25145(var25, var14));
    }
    
    public static SubLObject f25155(final SubLObject var25, final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic142$, f25145(var25, var14));
    }
    
    public static SubLObject f25156(final SubLObject var25, final SubLObject var14) {
        return module0373.f26329(var25);
    }
    
    public static SubLObject f25157(final SubLObject var25, final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0367.NIL != f25151(var25, var14) || module0367.NIL != module0363.f24685(var25));
    }
    
    public static SubLObject f25158(final SubLObject var25, final SubLObject var14) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0367.NIL != f25150(var25, var14) || module0367.NIL != f25152(var25, var14) || module0367.NIL != f25153(var25, var14));
    }
    
    public static SubLObject f25159(final SubLObject var25, final SubLObject var14) {
        return f25154(var25, module0387.f27481(var14));
    }
    
    public static SubLObject f25160(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25139(var25, var14);
        return f25128(var26);
    }
    
    public static SubLObject f25161(final SubLObject var25, final SubLObject var14, final SubLObject var109) {
        assert module0367.NIL != f25162(var109) : var109;
        final SubLObject var110 = f25139(var25, var14);
        f25132(var110, var109);
        return var109;
    }
    
    public static SubLObject f25163(final SubLObject var25, final SubLObject var14, final SubLObject var110) {
        final SubLObject var111 = f25160(var25, var14);
        final SubLObject var112 = f25164(var111, (SubLObject)module0367.T, var110);
        return f25161(var25, var14, var112);
    }
    
    public static SubLObject f25165(final SubLObject var25, final SubLObject var14, final SubLObject var110) {
        final SubLObject var111 = f25160(var25, var14);
        final SubLObject var112 = f25164(var111, (SubLObject)module0367.NIL, var110);
        return f25161(var25, var14, var112);
    }
    
    public static SubLObject f25166(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25160(var25, var14);
        final SubLObject var27 = f25164(var26, (SubLObject)module0367.$ic115$, (SubLObject)module0367.$ic152$);
        return f25161(var25, var14, var27);
    }
    
    public static SubLObject f25167(final SubLObject var25, final SubLObject var14, final SubLObject var110) {
        final SubLObject var111 = f25160(var25, var14);
        final SubLObject var112 = f25168(var111, (SubLObject)module0367.T, var110);
        return f25161(var25, var14, var112);
    }
    
    public static SubLObject f25169(final SubLObject var25, final SubLObject var14, final SubLObject var110) {
        final SubLObject var111 = f25160(var25, var14);
        final SubLObject var112 = f25168(var111, (SubLObject)module0367.NIL, var110);
        return f25161(var25, var14, var112);
    }
    
    public static SubLObject f25170(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25160(var25, var14);
        final SubLObject var27 = f25168(var26, (SubLObject)module0367.$ic115$, (SubLObject)module0367.$ic152$);
        return f25161(var25, var14, var27);
    }
    
    public static SubLObject f25171(final SubLObject var25, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25172(f25160(var25, var14), var110);
    }
    
    public static SubLObject f25173(final SubLObject var25, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25174(f25160(var25, var14), var110);
    }
    
    public static SubLObject f25175(final SubLObject var25, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25163(var25, var14, var110);
    }
    
    public static SubLObject f25176(final SubLObject var25, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25165(var25, var14, var110);
    }
    
    public static SubLObject f25177(final SubLObject var25, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        f25167(var25, var14, var110);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25178(final SubLObject var25, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25169(var25, var14, var110);
    }
    
    public static SubLObject f25107(final SubLObject var25, final SubLObject var14) {
        return f25166(var25, var14);
    }
    
    public static SubLObject f25179(final SubLObject var25, final SubLObject var14) {
        return f25170(var25, var14);
    }
    
    public static SubLObject f25180(final SubLObject var1, final SubLObject var2) {
        compatibility.default_struct_print_function(var1, var2, (SubLObject)module0367.ZERO_INTEGER);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25181(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX27912_native.class) ? module0367.T : module0367.NIL);
    }
    
    public static SubLObject f25182(final SubLObject var1) {
        assert module0367.NIL != f25181(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f25183(final SubLObject var1) {
        assert module0367.NIL != f25181(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f25184(final SubLObject var1) {
        assert module0367.NIL != f25181(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f25185(final SubLObject var1) {
        assert module0367.NIL != f25181(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f25186(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f25181(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f25187(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f25181(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f25188(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f25181(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f25189(final SubLObject var1, final SubLObject var4) {
        assert module0367.NIL != f25181(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f25190(SubLObject var5) {
        if (var5 == module0367.UNPROVIDED) {
            var5 = (SubLObject)module0367.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX27912_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0367.NIL, var7 = var5; module0367.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0367.$ic169$)) {
                f25186(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic170$)) {
                f25187(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic171$)) {
                f25188(var6, var9);
            }
            else if (var10.eql((SubLObject)module0367.$ic136$)) {
                f25189(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0367.$ic57$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f25191(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic58$, (SubLObject)module0367.$ic172$, (SubLObject)module0367.FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic169$, f25182(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic170$, f25183(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic171$, f25184(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic60$, (SubLObject)module0367.$ic136$, f25185(var11));
        Functions.funcall(var12, var11, (SubLObject)module0367.$ic61$, (SubLObject)module0367.$ic172$, (SubLObject)module0367.FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f25192(final SubLObject var11, final SubLObject var12) {
        return f25191(var11, var12);
    }
    
    public static SubLObject f25193() {
        final SubLObject var115 = f25190((SubLObject)module0367.UNPROVIDED);
        f25186(var115, module0358.$g3008$.getGlobalValue());
        f25187(var115, (SubLObject)module0367.$ic174$);
        f25188(var115, module0048.f3326());
        f25189(var115, f25122());
        return var115;
    }
    
    public static SubLObject f25194(final SubLObject var116, final SubLObject var14) {
        assert module0367.NIL != module0365.f24819(var116) : var116;
        assert module0367.NIL != f24997(var14) : var14;
        final SubLObject var117 = module0365.f24850(var116);
        final SubLObject var118 = f25139(var117, var14);
        if (module0367.NIL != f25124(var118)) {
            final SubLObject var119 = f25140(var117, var118);
            if (var119.isVector()) {
                final SubLObject var120 = module0365.f24849(var116);
                return Vectors.aref(var119, var120);
            }
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25195(final SubLObject var116, final SubLObject var14, final SubLObject var101) {
        assert module0367.NIL != module0365.f24819(var116) : var116;
        assert module0367.NIL != f24997(var14) : var14;
        assert module0367.NIL != f25181(var101) : var101;
        final SubLObject var117 = module0365.f24850(var116);
        final SubLObject var118 = f25139(var117, var14);
        final SubLObject var119 = f25140(var117, var118);
        final SubLObject var120 = module0365.f24849(var116);
        Vectors.set_aref(var119, var120, var101);
        return var116;
    }
    
    public static SubLObject f25196(final SubLObject var116, final SubLObject var14) {
        SubLObject var117 = f25194(var116, var14);
        if (module0367.NIL == f25181(var117)) {
            var117 = f25193();
            f25195(var116, var14, var117);
        }
        return var117;
    }
    
    public static SubLObject f25197(final SubLObject var116, final SubLObject var67) {
        assert module0367.NIL != module0373.f26190(var67) : var67;
        if (module0367.$ic176$ == var67) {
            return module0365.f24867(var116);
        }
        if (module0367.NIL != module0373.f26176(var116)) {
            return module0365.f24867(var116);
        }
        return Errors.error((SubLObject)module0367.$ic177$, var116);
    }
    
    public static SubLObject f25198(final SubLObject var116, final SubLObject var67) {
        assert module0367.NIL != module0373.f26190(var67) : var67;
        if (module0367.$ic176$ == var67) {
            return module0365.f24868(var116);
        }
        if (module0367.NIL != module0373.f26171(var116)) {
            final SubLObject var117 = f25196(var116, var67);
            return f25182(var117);
        }
        return Errors.error((SubLObject)module0367.$ic178$, var116);
    }
    
    public static SubLObject f25199(final SubLObject var116, final SubLObject var67) {
        assert module0367.NIL != module0373.f26190(var67) : var67;
        if (module0367.$ic176$ == var67) {
            return module0365.f24869(var116);
        }
        if (module0367.NIL != module0373.f26171(var116)) {
            final SubLObject var117 = f25196(var116, var67);
            return f25183(var117);
        }
        return Errors.error((SubLObject)module0367.$ic179$, var116);
    }
    
    public static SubLObject f25200(final SubLObject var116, final SubLObject var67) {
        if (module0367.NIL != module0373.f26176(var116)) {
            return f25197(var116, var67);
        }
        return module0358.f23691(f25198(var116, var67));
    }
    
    public static SubLObject f25201(final SubLObject var116, final SubLObject var67) {
        assert module0367.NIL != module0373.f26134(var116) : var116;
        if (module0367.NIL != module0376.f26620(var116)) {
            return module0358.f23690(f25197(var116, var67));
        }
        return f25198(var116, var67);
    }
    
    public static SubLObject f25202(final SubLObject var116, final SubLObject var67) {
        assert module0367.NIL != module0373.f26134(var116) : var116;
        if (module0367.NIL != module0376.f26620(var116)) {
            return module0038.f2638(f25197(var116, var67));
        }
        return f25199(var116, var67);
    }
    
    public static SubLObject f25203(final SubLObject var116, final SubLObject var67) {
        if (module0367.$ic176$ == var67) {
            return module0365.f24852(var116);
        }
        if (module0367.NIL != module0373.f26176(var116)) {
            return module0365.f24852(var116);
        }
        final SubLObject var117 = f25196(var116, var67);
        return f25184(var117);
    }
    
    public static SubLObject f25204(final SubLObject var116, final SubLObject var14) {
        return Equality.eq((SubLObject)module0367.$ic181$, f25198(var116, var14));
    }
    
    public static SubLObject f25205(final SubLObject var116, final SubLObject var14, final SubLObject var118, final SubLObject var119) {
        assert module0367.NIL != module0358.f23680(var118) : var118;
        final SubLObject var120 = f25196(var116, var14);
        f25186(var120, var118);
        f25187(var120, var119);
        return var116;
    }
    
    public static SubLObject f25206(final SubLObject var116, final SubLObject var14, final SubLObject var120) {
        final SubLObject var121 = f25196(var116, var14);
        f25188(var121, var120);
        return var116;
    }
    
    public static SubLObject f25207(final SubLObject var25, final SubLObject var14) {
        assert module0367.NIL != module0363.f24478(var25) : var25;
        assert module0367.NIL != f24997(var14) : var14;
        final SubLObject var26 = f25139(var25, var14);
        return f25127(var26);
    }
    
    public static SubLObject f25208(final SubLObject var25, final SubLObject var116, final SubLObject var14) {
        assert module0367.NIL != module0363.f24478(var25) : var25;
        assert module0367.NIL != module0365.f24819(var116) : var116;
        assert module0367.NIL != f24997(var14) : var14;
        final SubLObject var117 = f25139(var25, var14);
        f25131(var117, Numbers.add(f25127(var117), (SubLObject)module0367.ONE_INTEGER));
        return var25;
    }
    
    public static SubLObject f25209(final SubLObject var25, final SubLObject var116, final SubLObject var14) {
        assert module0367.NIL != module0363.f24478(var25) : var25;
        assert module0367.NIL != module0365.f24819(var116) : var116;
        assert module0367.NIL != f24997(var14) : var14;
        final SubLObject var117 = f25139(var25, var14);
        f25131(var117, Numbers.subtract(f25127(var117), (SubLObject)module0367.ONE_INTEGER));
        return var25;
    }
    
    public static SubLObject f25210(final SubLObject var25, final SubLObject var14) {
        final SubLObject var26 = f25139(var25, var14);
        f25131(var26, (SubLObject)module0367.ZERO_INTEGER);
        return var25;
    }
    
    public static SubLObject f25211(final SubLObject var116, final SubLObject var14) {
        final SubLObject var117 = f25196(var116, var14);
        return f25185(var117);
    }
    
    public static SubLObject f25212(final SubLObject var116, final SubLObject var14, final SubLObject var109) {
        assert module0367.NIL != f25162(var109) : var109;
        final SubLObject var117 = f25196(var116, var14);
        f25189(var117, var109);
        return var109;
    }
    
    public static SubLObject f25172(final SubLObject var109, final SubLObject var110) {
        return f25213(Vectors.aref(var109, (SubLObject)module0367.ZERO_INTEGER), var110);
    }
    
    public static SubLObject f25174(final SubLObject var109, final SubLObject var110) {
        return f25213(Vectors.aref(var109, (SubLObject)module0367.ONE_INTEGER), var110);
    }
    
    public static SubLObject f25164(final SubLObject var109, final SubLObject var70, final SubLObject var110) {
        assert module0367.NIL != f25214(var110) : var110;
        SubLObject var111 = Vectors.aref(var109, (SubLObject)module0367.ZERO_INTEGER);
        var111 = f25215(var111, var70, var110);
        Vectors.set_aref(var109, (SubLObject)module0367.ZERO_INTEGER, var111);
        return var109;
    }
    
    public static SubLObject f25168(final SubLObject var109, final SubLObject var70, final SubLObject var110) {
        assert module0367.NIL != f25214(var110) : var110;
        SubLObject var111 = Vectors.aref(var109, (SubLObject)module0367.ONE_INTEGER);
        var111 = f25215(var111, var70, var110);
        Vectors.set_aref(var109, (SubLObject)module0367.ONE_INTEGER, var111);
        return var109;
    }
    
    public static SubLObject f25162(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var13.isVector() && module0367.NIL != module0035.f1995(var13, (SubLObject)module0367.TWO_INTEGER, (SubLObject)module0367.UNPROVIDED) && module0367.NIL != f25216(Vectors.aref(var13, (SubLObject)module0367.ZERO_INTEGER)) && module0367.NIL != f25217(Vectors.aref(var13, (SubLObject)module0367.ONE_INTEGER)));
    }
    
    public static SubLObject f25214(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0367.$ic152$ == var13 || (var13.isCons() && module0367.NIL != module0035.f2370((SubLObject)module0367.$ic184$, var13, (SubLObject)module0367.UNPROVIDED)));
    }
    
    public static SubLObject f25218(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var13.isList() && module0367.NIL != module0035.f2370((SubLObject)module0367.$ic183$, var13, (SubLObject)module0367.UNPROVIDED));
    }
    
    public static SubLObject f25216(final SubLObject var13) {
        return f25219(var13);
    }
    
    public static SubLObject f25217(final SubLObject var13) {
        return f25219(var13);
    }
    
    public static SubLObject f25219(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0367.$ic115$ == var13 || (module0367.NIL != module0035.f1998(var13) && module0367.NIL != f25218(var13.first()) && module0367.NIL != f25218(conses_high.second(var13))));
    }
    
    public static SubLObject f25220(final SubLObject var116, final SubLObject var14, final SubLObject var110) {
        final SubLObject var117 = f25211(var116, var14);
        final SubLObject var118 = f25164(var117, (SubLObject)module0367.T, var110);
        return f25212(var116, var14, var118);
    }
    
    public static SubLObject f25221(final SubLObject var116, final SubLObject var14, final SubLObject var110) {
        final SubLObject var117 = f25211(var116, var14);
        final SubLObject var118 = f25164(var117, (SubLObject)module0367.NIL, var110);
        return f25212(var116, var14, var118);
    }
    
    public static SubLObject f25222(final SubLObject var116, final SubLObject var14) {
        final SubLObject var117 = f25211(var116, var14);
        final SubLObject var118 = f25164(var117, (SubLObject)module0367.$ic115$, (SubLObject)module0367.$ic152$);
        return f25212(var116, var14, var118);
    }
    
    public static SubLObject f25223(final SubLObject var116, final SubLObject var14, final SubLObject var110) {
        final SubLObject var117 = f25211(var116, var14);
        final SubLObject var118 = f25168(var117, (SubLObject)module0367.T, var110);
        return f25212(var116, var14, var118);
    }
    
    public static SubLObject f25224(final SubLObject var116, final SubLObject var14, final SubLObject var110) {
        final SubLObject var117 = f25211(var116, var14);
        final SubLObject var118 = f25168(var117, (SubLObject)module0367.NIL, var110);
        return f25212(var116, var14, var118);
    }
    
    public static SubLObject f25225(final SubLObject var116, final SubLObject var14) {
        final SubLObject var117 = f25211(var116, var14);
        final SubLObject var118 = f25168(var117, (SubLObject)module0367.$ic115$, (SubLObject)module0367.$ic152$);
        return f25212(var116, var14, var118);
    }
    
    public static SubLObject f25226(final SubLObject var116, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25172(f25211(var116, var14), var110);
    }
    
    public static SubLObject f25227(final SubLObject var116, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25174(f25211(var116, var14), var110);
    }
    
    public static SubLObject f25228(final SubLObject var116, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        f25220(var116, var14, var110);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25229(final SubLObject var116, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25221(var116, var14, var110);
    }
    
    public static SubLObject f25230(final SubLObject var116, final SubLObject var14) {
        f25222(var116, var14);
        f25166(module0365.f24850(var116), var14);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25231(final SubLObject var116, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        f25223(var116, var14, var110);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25232(final SubLObject var116, final SubLObject var14, SubLObject var110) {
        if (var110 == module0367.UNPROVIDED) {
            var110 = (SubLObject)module0367.$ic152$;
        }
        return f25224(var116, var14, var110);
    }
    
    public static SubLObject f25233(final SubLObject var116, final SubLObject var14) {
        f25225(var116, var14);
        if (module0367.NIL == f25081(var14)) {
            f25222(var116, var14);
        }
        f25170(module0365.f24850(var116), var14);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25234(final SubLObject var25) {
        final SubLObject var26 = module0363.f24507(var25);
        final SubLObject var27 = module0361.f24123(var26);
        if (module0367.NIL == module0065.f4772(var27, (SubLObject)module0367.$ic185$)) {
            final SubLObject var125_126 = var27;
            if (module0367.NIL == module0065.f4775(var125_126, (SubLObject)module0367.$ic185$)) {
                final SubLObject var28 = module0065.f4740(var125_126);
                final SubLObject var29 = (SubLObject)module0367.NIL;
                SubLObject var30;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                SubLObject var38;
                for (var30 = Sequences.length(var28), var31 = (SubLObject)module0367.NIL, var31 = (SubLObject)module0367.ZERO_INTEGER; var31.numL(var30); var31 = Numbers.add(var31, (SubLObject)module0367.ONE_INTEGER)) {
                    var32 = ((module0367.NIL != var29) ? Numbers.subtract(var30, var31, (SubLObject)module0367.ONE_INTEGER) : var31);
                    var33 = Vectors.aref(var28, var32);
                    if (module0367.NIL == module0065.f4749(var33) || module0367.NIL == module0065.f4773((SubLObject)module0367.$ic185$)) {
                        if (module0367.NIL != module0065.f4749(var33)) {
                            var33 = (SubLObject)module0367.$ic185$;
                        }
                        if (module0367.NIL != module0363.f24547(var25, var33)) {
                            var34 = var33;
                            var35 = module0077.f5333(oc_inference_datastructures_inference.f25473(var34));
                            for (var36 = module0032.f1741(var35), var37 = (SubLObject)module0367.NIL, var37 = module0032.f1742(var36, var35); module0367.NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
                                var38 = module0032.f1745(var36, var37);
                                if (module0367.NIL != module0032.f1746(var37, var38)) {
                                    f25107(var25, var38);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var137_138 = var27;
            if (module0367.NIL == module0065.f4777(var137_138)) {
                final SubLObject var39 = module0065.f4738(var137_138);
                SubLObject var40 = (SubLObject)module0367.NIL;
                SubLObject var41 = (SubLObject)module0367.NIL;
                final Iterator var42 = Hashtables.getEntrySetIterator(var39);
                try {
                    while (Hashtables.iteratorHasNext(var42)) {
                        final Map.Entry var43 = Hashtables.iteratorNextEntry(var42);
                        var40 = Hashtables.getEntryKey(var43);
                        var41 = Hashtables.getEntryValue(var43);
                        if (module0367.NIL != module0363.f24547(var25, var41)) {
                            final SubLObject var44 = var41;
                            final SubLObject var45 = module0077.f5333(oc_inference_datastructures_inference.f25473(var44));
                            SubLObject var46;
                            SubLObject var47;
                            SubLObject var48;
                            for (var46 = module0032.f1741(var45), var47 = (SubLObject)module0367.NIL, var47 = module0032.f1742(var46, var45); module0367.NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                var48 = module0032.f1745(var46, var47);
                                if (module0367.NIL != module0032.f1746(var47, var48)) {
                                    f25107(var25, var48);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var42);
                }
            }
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25235(final SubLObject var25) {
        final SubLObject var26 = module0363.f24507(var25);
        final SubLObject var27 = module0361.f24123(var26);
        if (module0367.NIL == module0065.f4772(var27, (SubLObject)module0367.$ic185$)) {
            final SubLObject var125_142 = var27;
            if (module0367.NIL == module0065.f4775(var125_142, (SubLObject)module0367.$ic185$)) {
                final SubLObject var28 = module0065.f4740(var125_142);
                final SubLObject var29 = (SubLObject)module0367.NIL;
                SubLObject var30;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                SubLObject var38;
                for (var30 = Sequences.length(var28), var31 = (SubLObject)module0367.NIL, var31 = (SubLObject)module0367.ZERO_INTEGER; var31.numL(var30); var31 = Numbers.add(var31, (SubLObject)module0367.ONE_INTEGER)) {
                    var32 = ((module0367.NIL != var29) ? Numbers.subtract(var30, var31, (SubLObject)module0367.ONE_INTEGER) : var31);
                    var33 = Vectors.aref(var28, var32);
                    if (module0367.NIL == module0065.f4749(var33) || module0367.NIL == module0065.f4773((SubLObject)module0367.$ic185$)) {
                        if (module0367.NIL != module0065.f4749(var33)) {
                            var33 = (SubLObject)module0367.$ic185$;
                        }
                        if (module0367.NIL != module0363.f24547(var25, var33)) {
                            var34 = var33;
                            var35 = module0077.f5333(oc_inference_datastructures_inference.f25473(var34));
                            for (var36 = module0032.f1741(var35), var37 = (SubLObject)module0367.NIL, var37 = module0032.f1742(var36, var35); module0367.NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
                                var38 = module0032.f1745(var36, var37);
                                if (module0367.NIL != module0032.f1746(var37, var38)) {
                                    f25179(var25, var38);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var137_143 = var27;
            if (module0367.NIL == module0065.f4777(var137_143)) {
                final SubLObject var39 = module0065.f4738(var137_143);
                SubLObject var40 = (SubLObject)module0367.NIL;
                SubLObject var41 = (SubLObject)module0367.NIL;
                final Iterator var42 = Hashtables.getEntrySetIterator(var39);
                try {
                    while (Hashtables.iteratorHasNext(var42)) {
                        final Map.Entry var43 = Hashtables.iteratorNextEntry(var42);
                        var40 = Hashtables.getEntryKey(var43);
                        var41 = Hashtables.getEntryValue(var43);
                        if (module0367.NIL != module0363.f24547(var25, var41)) {
                            final SubLObject var44 = var41;
                            final SubLObject var45 = module0077.f5333(oc_inference_datastructures_inference.f25473(var44));
                            SubLObject var46;
                            SubLObject var47;
                            SubLObject var48;
                            for (var46 = module0032.f1741(var45), var47 = (SubLObject)module0367.NIL, var47 = module0032.f1742(var46, var45); module0367.NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                var48 = module0032.f1745(var46, var47);
                                if (module0367.NIL != module0032.f1746(var47, var48)) {
                                    f25179(var25, var48);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var42);
                }
            }
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25236(final SubLObject var116) {
        final SubLObject var117 = module0365.f24850(var116);
        final SubLObject var118 = module0363.f24507(var117);
        final SubLObject var119 = module0361.f24123(var118);
        if (module0367.NIL == module0065.f4772(var119, (SubLObject)module0367.$ic185$)) {
            final SubLObject var125_144 = var119;
            if (module0367.NIL == module0065.f4775(var125_144, (SubLObject)module0367.$ic185$)) {
                final SubLObject var120 = module0065.f4740(var125_144);
                final SubLObject var121 = (SubLObject)module0367.NIL;
                SubLObject var122;
                SubLObject var123;
                SubLObject var124;
                SubLObject var125;
                SubLObject var126;
                SubLObject var127;
                SubLObject var128;
                SubLObject var129;
                SubLObject var130;
                for (var122 = Sequences.length(var120), var123 = (SubLObject)module0367.NIL, var123 = (SubLObject)module0367.ZERO_INTEGER; var123.numL(var122); var123 = Numbers.add(var123, (SubLObject)module0367.ONE_INTEGER)) {
                    var124 = ((module0367.NIL != var121) ? Numbers.subtract(var122, var123, (SubLObject)module0367.ONE_INTEGER) : var123);
                    var125 = Vectors.aref(var120, var124);
                    if (module0367.NIL == module0065.f4749(var125) || module0367.NIL == module0065.f4773((SubLObject)module0367.$ic185$)) {
                        if (module0367.NIL != module0065.f4749(var125)) {
                            var125 = (SubLObject)module0367.$ic185$;
                        }
                        if (module0367.NIL != module0363.f24547(var117, var125)) {
                            var126 = var125;
                            var127 = module0077.f5333(oc_inference_datastructures_inference.f25473(var126));
                            for (var128 = module0032.f1741(var127), var129 = (SubLObject)module0367.NIL, var129 = module0032.f1742(var128, var127); module0367.NIL == module0032.f1744(var128, var129); var129 = module0032.f1743(var129)) {
                                var130 = module0032.f1745(var128, var129);
                                if (module0367.NIL != module0032.f1746(var129, var130)) {
                                    f25230(var116, var130);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var137_145 = var119;
            if (module0367.NIL == module0065.f4777(var137_145)) {
                final SubLObject var131 = module0065.f4738(var137_145);
                SubLObject var132 = (SubLObject)module0367.NIL;
                SubLObject var133 = (SubLObject)module0367.NIL;
                final Iterator var134 = Hashtables.getEntrySetIterator(var131);
                try {
                    while (Hashtables.iteratorHasNext(var134)) {
                        final Map.Entry var135 = Hashtables.iteratorNextEntry(var134);
                        var132 = Hashtables.getEntryKey(var135);
                        var133 = Hashtables.getEntryValue(var135);
                        if (module0367.NIL != module0363.f24547(var117, var133)) {
                            final SubLObject var136 = var133;
                            final SubLObject var137 = module0077.f5333(oc_inference_datastructures_inference.f25473(var136));
                            SubLObject var138;
                            SubLObject var139;
                            SubLObject var140;
                            for (var138 = module0032.f1741(var137), var139 = (SubLObject)module0367.NIL, var139 = module0032.f1742(var138, var137); module0367.NIL == module0032.f1744(var138, var139); var139 = module0032.f1743(var139)) {
                                var140 = module0032.f1745(var138, var139);
                                if (module0367.NIL != module0032.f1746(var139, var140)) {
                                    f25230(var116, var140);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var134);
                }
            }
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25237(final SubLObject var116) {
        final SubLObject var117 = module0365.f24850(var116);
        final SubLObject var118 = module0363.f24507(var117);
        final SubLObject var119 = module0361.f24123(var118);
        if (module0367.NIL == module0065.f4772(var119, (SubLObject)module0367.$ic185$)) {
            final SubLObject var125_146 = var119;
            if (module0367.NIL == module0065.f4775(var125_146, (SubLObject)module0367.$ic185$)) {
                final SubLObject var120 = module0065.f4740(var125_146);
                final SubLObject var121 = (SubLObject)module0367.NIL;
                SubLObject var122;
                SubLObject var123;
                SubLObject var124;
                SubLObject var125;
                SubLObject var126;
                SubLObject var127;
                SubLObject var128;
                SubLObject var129;
                SubLObject var130;
                for (var122 = Sequences.length(var120), var123 = (SubLObject)module0367.NIL, var123 = (SubLObject)module0367.ZERO_INTEGER; var123.numL(var122); var123 = Numbers.add(var123, (SubLObject)module0367.ONE_INTEGER)) {
                    var124 = ((module0367.NIL != var121) ? Numbers.subtract(var122, var123, (SubLObject)module0367.ONE_INTEGER) : var123);
                    var125 = Vectors.aref(var120, var124);
                    if (module0367.NIL == module0065.f4749(var125) || module0367.NIL == module0065.f4773((SubLObject)module0367.$ic185$)) {
                        if (module0367.NIL != module0065.f4749(var125)) {
                            var125 = (SubLObject)module0367.$ic185$;
                        }
                        if (module0367.NIL != module0363.f24547(var117, var125)) {
                            var126 = var125;
                            var127 = module0077.f5333(oc_inference_datastructures_inference.f25473(var126));
                            for (var128 = module0032.f1741(var127), var129 = (SubLObject)module0367.NIL, var129 = module0032.f1742(var128, var127); module0367.NIL == module0032.f1744(var128, var129); var129 = module0032.f1743(var129)) {
                                var130 = module0032.f1745(var128, var129);
                                if (module0367.NIL != module0032.f1746(var129, var130)) {
                                    f25233(var116, var130);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var137_147 = var119;
            if (module0367.NIL == module0065.f4777(var137_147)) {
                final SubLObject var131 = module0065.f4738(var137_147);
                SubLObject var132 = (SubLObject)module0367.NIL;
                SubLObject var133 = (SubLObject)module0367.NIL;
                final Iterator var134 = Hashtables.getEntrySetIterator(var131);
                try {
                    while (Hashtables.iteratorHasNext(var134)) {
                        final Map.Entry var135 = Hashtables.iteratorNextEntry(var134);
                        var132 = Hashtables.getEntryKey(var135);
                        var133 = Hashtables.getEntryValue(var135);
                        if (module0367.NIL != module0363.f24547(var117, var133)) {
                            final SubLObject var136 = var133;
                            final SubLObject var137 = module0077.f5333(oc_inference_datastructures_inference.f25473(var136));
                            SubLObject var138;
                            SubLObject var139;
                            SubLObject var140;
                            for (var138 = module0032.f1741(var137), var139 = (SubLObject)module0367.NIL, var139 = module0032.f1742(var138, var137); module0367.NIL == module0032.f1744(var138, var139); var139 = module0032.f1743(var139)) {
                                var140 = module0032.f1745(var138, var139);
                                if (module0367.NIL != module0032.f1746(var139, var140)) {
                                    f25233(var116, var140);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var134);
                }
            }
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25238(final SubLObject var25) {
        final SubLObject var26 = module0363.f24507(var25);
        final SubLObject var27 = module0361.f24123(var26);
        if (module0367.NIL == module0065.f4772(var27, (SubLObject)module0367.$ic185$)) {
            final SubLObject var125_148 = var27;
            if (module0367.NIL == module0065.f4775(var125_148, (SubLObject)module0367.$ic185$)) {
                final SubLObject var28 = module0065.f4740(var125_148);
                final SubLObject var29 = (SubLObject)module0367.NIL;
                SubLObject var30;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                SubLObject var38;
                for (var30 = Sequences.length(var28), var31 = (SubLObject)module0367.NIL, var31 = (SubLObject)module0367.ZERO_INTEGER; var31.numL(var30); var31 = Numbers.add(var31, (SubLObject)module0367.ONE_INTEGER)) {
                    var32 = ((module0367.NIL != var29) ? Numbers.subtract(var30, var31, (SubLObject)module0367.ONE_INTEGER) : var31);
                    var33 = Vectors.aref(var28, var32);
                    if (module0367.NIL == module0065.f4749(var33) || module0367.NIL == module0065.f4773((SubLObject)module0367.$ic185$)) {
                        if (module0367.NIL != module0065.f4749(var33)) {
                            var33 = (SubLObject)module0367.$ic185$;
                        }
                        if (module0367.NIL != module0363.f24547(var25, var33)) {
                            var34 = var33;
                            var35 = module0077.f5333(oc_inference_datastructures_inference.f25473(var34));
                            for (var36 = module0032.f1741(var35), var37 = (SubLObject)module0367.NIL, var37 = module0032.f1742(var36, var35); module0367.NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
                                var38 = module0032.f1745(var36, var37);
                                if (module0367.NIL != module0032.f1746(var37, var38)) {
                                    f25239(var25, var38);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var137_149 = var27;
            if (module0367.NIL == module0065.f4777(var137_149)) {
                final SubLObject var39 = module0065.f4738(var137_149);
                SubLObject var40 = (SubLObject)module0367.NIL;
                SubLObject var41 = (SubLObject)module0367.NIL;
                final Iterator var42 = Hashtables.getEntrySetIterator(var39);
                try {
                    while (Hashtables.iteratorHasNext(var42)) {
                        final Map.Entry var43 = Hashtables.iteratorNextEntry(var42);
                        var40 = Hashtables.getEntryKey(var43);
                        var41 = Hashtables.getEntryValue(var43);
                        if (module0367.NIL != module0363.f24547(var25, var41)) {
                            final SubLObject var44 = var41;
                            final SubLObject var45 = module0077.f5333(oc_inference_datastructures_inference.f25473(var44));
                            SubLObject var46;
                            SubLObject var47;
                            SubLObject var48;
                            for (var46 = module0032.f1741(var45), var47 = (SubLObject)module0367.NIL, var47 = module0032.f1742(var46, var45); module0367.NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                var48 = module0032.f1745(var46, var47);
                                if (module0367.NIL != module0032.f1746(var47, var48)) {
                                    f25239(var25, var48);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var42);
                }
            }
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25240(final SubLObject var25) {
        final SubLObject var26 = module0363.f24507(var25);
        final SubLObject var27 = module0361.f24123(var26);
        if (module0367.NIL == module0065.f4772(var27, (SubLObject)module0367.$ic185$)) {
            final SubLObject var125_150 = var27;
            if (module0367.NIL == module0065.f4775(var125_150, (SubLObject)module0367.$ic185$)) {
                final SubLObject var28 = module0065.f4740(var125_150);
                final SubLObject var29 = (SubLObject)module0367.NIL;
                SubLObject var30;
                SubLObject var31;
                SubLObject var32;
                SubLObject var33;
                SubLObject var34;
                SubLObject var35;
                SubLObject var36;
                SubLObject var37;
                SubLObject var38;
                for (var30 = Sequences.length(var28), var31 = (SubLObject)module0367.NIL, var31 = (SubLObject)module0367.ZERO_INTEGER; var31.numL(var30); var31 = Numbers.add(var31, (SubLObject)module0367.ONE_INTEGER)) {
                    var32 = ((module0367.NIL != var29) ? Numbers.subtract(var30, var31, (SubLObject)module0367.ONE_INTEGER) : var31);
                    var33 = Vectors.aref(var28, var32);
                    if (module0367.NIL == module0065.f4749(var33) || module0367.NIL == module0065.f4773((SubLObject)module0367.$ic185$)) {
                        if (module0367.NIL != module0065.f4749(var33)) {
                            var33 = (SubLObject)module0367.$ic185$;
                        }
                        if (module0367.NIL != module0363.f24547(var25, var33)) {
                            var34 = var33;
                            var35 = module0077.f5333(oc_inference_datastructures_inference.f25473(var34));
                            for (var36 = module0032.f1741(var35), var37 = (SubLObject)module0367.NIL, var37 = module0032.f1742(var36, var35); module0367.NIL == module0032.f1744(var36, var37); var37 = module0032.f1743(var37)) {
                                var38 = module0032.f1745(var36, var37);
                                if (module0367.NIL != module0032.f1746(var37, var38)) {
                                    f25241(var25, var38);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject var137_151 = var27;
            if (module0367.NIL == module0065.f4777(var137_151)) {
                final SubLObject var39 = module0065.f4738(var137_151);
                SubLObject var40 = (SubLObject)module0367.NIL;
                SubLObject var41 = (SubLObject)module0367.NIL;
                final Iterator var42 = Hashtables.getEntrySetIterator(var39);
                try {
                    while (Hashtables.iteratorHasNext(var42)) {
                        final Map.Entry var43 = Hashtables.iteratorNextEntry(var42);
                        var40 = Hashtables.getEntryKey(var43);
                        var41 = Hashtables.getEntryValue(var43);
                        if (module0367.NIL != module0363.f24547(var25, var41)) {
                            final SubLObject var44 = var41;
                            final SubLObject var45 = module0077.f5333(oc_inference_datastructures_inference.f25473(var44));
                            SubLObject var46;
                            SubLObject var47;
                            SubLObject var48;
                            for (var46 = module0032.f1741(var45), var47 = (SubLObject)module0367.NIL, var47 = module0032.f1742(var46, var45); module0367.NIL == module0032.f1744(var46, var47); var47 = module0032.f1743(var47)) {
                                var48 = module0032.f1745(var46, var47);
                                if (module0367.NIL != module0032.f1746(var47, var48)) {
                                    f25241(var25, var48);
                                }
                            }
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var42);
                }
            }
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25239(final SubLObject var25, final SubLObject var14) {
        SubLObject var26 = module0363.f24517(var25);
        SubLObject var27 = (SubLObject)module0367.NIL;
        var27 = var26.first();
        while (module0367.NIL != var26) {
            f25222(var27, var14);
            var26 = var26.rest();
            var27 = var26.first();
        }
        f25166(var25, var14);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25241(final SubLObject var25, final SubLObject var14) {
        SubLObject var26 = module0363.f24517(var25);
        SubLObject var27 = (SubLObject)module0367.NIL;
        var27 = var26.first();
        while (module0367.NIL != var26) {
            f25225(var27, var14);
            var26 = var26.rest();
            var27 = var26.first();
        }
        f25170(var25, var14);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25242(final SubLObject var121, final SubLObject var70, final SubLObject var110) {
        return Equality.eq(var70, f25213(var121, var110));
    }
    
    public static SubLObject f25213(final SubLObject var121, final SubLObject var110) {
        if (var121 == module0367.$ic115$) {
            return (SubLObject)module0367.$ic115$;
        }
        if (var121.eql(module0367.$g3146$.getGlobalValue())) {
            return (SubLObject)module0367.$ic115$;
        }
        if (module0367.NIL != f25243(ConsesLow.nth((SubLObject)module0367.ZERO_INTEGER, var121), var110, (SubLObject)module0367.NIL)) {
            return (SubLObject)module0367.T;
        }
        if (module0367.NIL != f25243(ConsesLow.nth((SubLObject)module0367.ONE_INTEGER, var121), var110, (SubLObject)module0367.T)) {
            return (SubLObject)module0367.NIL;
        }
        return (SubLObject)module0367.$ic115$;
    }
    
    public static SubLObject f25215(SubLObject var121, final SubLObject var70, final SubLObject var110) {
        if (var70 == module0367.$ic115$) {
            var121 = module0367.$g3146$.getGlobalValue();
        }
        else if (module0367.NIL == f25242(var121, var70, var110)) {
            if (var121 == module0367.$ic115$ || var121.eql(module0367.$g3146$.getGlobalValue())) {
                var121 = conses_high.copy_list(module0367.$g3146$.getGlobalValue());
            }
            final SubLObject var122 = (SubLObject)((module0367.NIL != var70) ? module0367.ZERO_INTEGER : module0367.ONE_INTEGER);
            final SubLObject var123 = ConsesLow.nth(var122, var121);
            SubLObject var124 = (SubLObject)module0367.NIL;
            if (var110 == module0367.$ic152$) {
                var124 = (SubLObject)ConsesLow.list((SubLObject)module0367.$ic152$);
            }
            else {
                var124 = (SubLObject)ConsesLow.cons(var110, var124);
                SubLObject var125 = var123;
                SubLObject var126 = (SubLObject)module0367.NIL;
                var126 = var125.first();
                while (module0367.NIL != var125) {
                    if (module0367.NIL == f25244(var110, var126, (SubLObject)SubLObjectFactory.makeBoolean(module0367.NIL == var70))) {
                        var124 = (SubLObject)ConsesLow.cons(var126, var124);
                    }
                    var125 = var125.rest();
                    var126 = var125.first();
                }
            }
            ConsesLow.set_nth(var122, var121, var124);
        }
        return var121;
    }
    
    public static SubLObject f25243(final SubLObject var157, final SubLObject var158, final SubLObject var159) {
        SubLObject var160 = var157;
        SubLObject var161 = (SubLObject)module0367.NIL;
        var161 = var160.first();
        while (module0367.NIL != var160) {
            if (module0367.NIL != f25244(var161, var158, var159)) {
                return (SubLObject)module0367.T;
            }
            var160 = var160.rest();
            var161 = var160.first();
        }
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25244(final SubLObject var160, final SubLObject var158, SubLObject var159) {
        if (var159 == module0367.UNPROVIDED) {
            var159 = (SubLObject)module0367.NIL;
        }
        if (var160 == module0367.$ic152$) {
            return (SubLObject)module0367.T;
        }
        if (var158 == module0367.$ic152$) {
            return (SubLObject)module0367.NIL;
        }
        return (module0367.NIL == var159) ? f25245(var160, var158) : f25245(var158, var160);
    }
    
    public static SubLObject f25245(final SubLObject var160, final SubLObject var158) {
        SubLObject var161 = (SubLObject)module0367.NIL;
        SubLObject var162_163 = (SubLObject)module0367.NIL;
        SubLObject var162 = (SubLObject)module0367.NIL;
        SubLObject var165_166 = (SubLObject)module0367.NIL;
        var161 = var160;
        var162_163 = var161.first();
        var162 = var158;
        var165_166 = var162.first();
        while (module0367.NIL != var162 || module0367.NIL != var161) {
            if (module0367.NIL != var162_163 && module0367.NIL == var165_166) {
                return (SubLObject)module0367.NIL;
            }
            var161 = var161.rest();
            var162_163 = var161.first();
            var162 = var162.rest();
            var165_166 = var162.first();
        }
        return (SubLObject)module0367.T;
    }
    
    public static SubLObject f25246() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f24995", "S#27917", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f24997", "S#27896", 1, 0, false);
        new $f24997$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f24998", "S#27918", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f24999", "S#27919", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25000", "S#27920", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25001", "S#27921", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25002", "S#27922", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25003", "S#27923", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25004", "S#27924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25005", "S#27925", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25006", "S#27926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25007", "S#27927", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25008", "S#27928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25009", "S#27929", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25010", "S#27930", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25011", "S#27931", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25012", "S#27932", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25013", "S#27933", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25014", "S#27934", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25015", "S#27935", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25016", "S#27936", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25017", "S#27937", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25018", "S#27938", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25019", "S#27939", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25020", "S#27940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25021", "S#27941", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25022", "S#27942", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25023", "S#27943", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25024", "S#27944", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25025", "S#27945", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25026", "S#27946", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25027", "S#27947", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25028", "S#27948", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25029", "S#27949", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25030", "S#27950", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25031", "S#27951", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25032", "S#27952", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25033", "S#27953", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25034", "S#27954", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f24996", "S#27955", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25038", "S#27897", 1, 0, false);
        new $f25038$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25039", "S#27956", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25042", "S#27957", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25046", "S#26786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25047", "S#27958", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25045", "S#27959", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25043", "S#27960", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25049", "S#27359", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25036", "S#26812", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25037", "S#27367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25054", "S#27961", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25055", "S#27962", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25035", "S#27963", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25056", "S#27964", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25057", "S#27965", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25058", "S#27966", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25059", "S#27967", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25060", "S#27968", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25061", "S#27969", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25062", "S#27970", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25063", "S#27971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25064", "S#27972", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25065", "S#27973", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25066", "S#27974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25067", "S#27975", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25068", "S#27976", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25069", "S#27977", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25070", "S#27978", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0367", "f25071", "S#27979");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0367", "f25072", "S#27980");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0367", "f25073", "S#27981");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0367", "f25074", "S#27982");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25048", "S#27983", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25075", "S#27984", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25076", "S#27985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25077", "S#27986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25078", "S#27987", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25079", "S#27988", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25080", "S#27989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25081", "S#27990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25082", "S#27368", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25083", "S#27991", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25084", "S#27992", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25085", "S#26780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25086", "S#27993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25044", "S#27994", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25087", "S#27995", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25088", "S#27996", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25089", "S#27997", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25090", "S#27998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25091", "S#27999", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25092", "S#28000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25093", "S#28001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25094", "S#28002", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25095", "S#28003", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25096", "S#28004", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25097", "S#28005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25098", "S#28006", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25050", "S#28007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25099", "S#28008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25051", "S#28009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25101", "S#28010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25052", "S#28011", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25102", "S#28012", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25103", "S#28013", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25104", "S#28014", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0367", "f25105", "S#28015");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25106", "S#28016", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25108", "S#28017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25109", "S#28018", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25110", "S#28019", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25116", "S#28020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25115", "S#28021", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25114", "S#28022", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25113", "S#28023", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25112", "S#28024", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25111", "S#28025", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25117", "S#28026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25100", "S#28027", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25040", "S#28028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25118", "S#28029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25119", "S#28030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25121", "S#28031", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25041", "S#28032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25120", "S#28033", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25122", "S#28034", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25123", "S#28035", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25124", "S#27911", 1, 0, false);
        new $f25124$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25125", "S#28036", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25126", "S#28037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25127", "S#28038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25128", "S#28039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25129", "S#28040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25130", "S#28041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25131", "S#28042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25132", "S#28043", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25133", "S#28044", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25134", "S#28045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25135", "S#28046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25136", "S#28047", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25137", "S#28048", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25138", "S#28049", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25053", "S#28050", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25139", "S#27910", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25140", "S#28051", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25141", "S#28052", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25142", "S#28053", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25143", "S#28054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25144", "S#28055", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25145", "S#28056", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25146", "S#28057", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25147", "S#28058", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25148", "S#28059", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25149", "S#28060", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25150", "S#28061", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25151", "STRATEGICALLY-POSSIBLE-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25152", "STRATEGICALLY-PENDING-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25153", "STRATEGICALLY-FINISHED-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25154", "STRATEGICALLY-NO-GOOD-PROBLEM-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25155", "S#28062", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25156", "S#28063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25157", "S#28064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25158", "S#28065", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25159", "S#28066", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25160", "S#28067", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25161", "S#28068", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25163", "S#28069", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25165", "S#28070", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25166", "S#28071", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25167", "S#28072", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25169", "S#28073", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25170", "S#28074", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25171", "S#28075", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25173", "S#28076", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25175", "S#28077", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25176", "S#28078", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25177", "S#28079", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25178", "S#28080", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25107", "S#28081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25179", "S#28082", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25180", "S#28083", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25181", "S#27913", 1, 0, false);
        new $f25181$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25182", "S#28084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25183", "S#28085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25184", "S#28086", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25185", "S#28087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25186", "S#28088", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25187", "S#28089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25188", "S#28090", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25189", "S#28091", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25190", "S#28092", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25191", "S#28093", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25192", "S#28094", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25193", "S#28095", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25194", "S#28096", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25195", "S#28097", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25196", "S#27912", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25197", "S#28098", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25198", "S#28099", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25199", "S#28100", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25200", "S#28101", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25201", "S#28102", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25202", "S#28103", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25203", "S#28104", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25204", "S#28105", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25205", "S#28106", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25206", "S#28107", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25207", "S#28108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25208", "S#28109", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25209", "S#28110", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25210", "S#28111", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25211", "S#28112", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25212", "S#28113", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25172", "S#28114", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25174", "S#28115", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25164", "S#28116", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25168", "S#28117", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25162", "S#28118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25214", "S#28119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25218", "S#28120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25216", "S#28121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25217", "S#28122", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25219", "S#28123", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25220", "S#28124", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25221", "S#28125", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25222", "S#28126", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25223", "S#28127", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25224", "S#28128", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25225", "S#28129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25226", "S#28130", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25227", "S#28131", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25228", "S#28132", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25229", "S#28133", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25230", "S#28134", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25231", "S#28135", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25232", "S#28136", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25233", "S#28137", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25234", "S#28138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25235", "S#28139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25236", "S#27717", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25237", "S#28140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25238", "S#28141", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25240", "S#28142", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25239", "S#28143", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25241", "S#28144", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25242", "S#28145", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25213", "S#28146", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25215", "S#28147", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25243", "S#28148", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25244", "S#28149", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0367", "f25245", "S#28150", 2, 0, false);
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25247() {
        module0367.$g3140$ = SubLFiles.defconstant("S#28151", (SubLObject)module0367.$ic0$);
        module0367.$g3141$ = SubLFiles.defparameter("S#28152", (SubLObject)module0367.NIL);
        module0367.$g3142$ = SubLFiles.deflexical("S#28153", (module0367.NIL != Symbols.boundp((SubLObject)module0367.$ic112$)) ? module0367.$g3142$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0367.EQ), (SubLObject)module0367.FIVE_INTEGER));
        module0367.$g3143$ = SubLFiles.defparameter("S#28154", (SubLObject)module0367.T);
        module0367.$g3144$ = SubLFiles.defconstant("S#28155", (SubLObject)module0367.$ic116$);
        module0367.$g3145$ = SubLFiles.defconstant("S#28156", (SubLObject)module0367.$ic153$);
        module0367.$g3146$ = SubLFiles.deflexical("S#28157", (SubLObject)ConsesLow.list((SubLObject)module0367.NIL, (SubLObject)module0367.NIL));
        return (SubLObject)module0367.NIL;
    }
    
    public static SubLObject f25248() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0367.$g3140$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0367.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0367.$ic8$);
        Structures.def_csetf((SubLObject)module0367.$ic9$, (SubLObject)module0367.$ic10$);
        Structures.def_csetf((SubLObject)module0367.$ic11$, (SubLObject)module0367.$ic12$);
        Structures.def_csetf((SubLObject)module0367.$ic13$, (SubLObject)module0367.$ic14$);
        Structures.def_csetf((SubLObject)module0367.$ic15$, (SubLObject)module0367.$ic16$);
        Structures.def_csetf((SubLObject)module0367.$ic17$, (SubLObject)module0367.$ic18$);
        Structures.def_csetf((SubLObject)module0367.$ic19$, (SubLObject)module0367.$ic20$);
        Structures.def_csetf((SubLObject)module0367.$ic21$, (SubLObject)module0367.$ic22$);
        Structures.def_csetf((SubLObject)module0367.$ic23$, (SubLObject)module0367.$ic24$);
        Structures.def_csetf((SubLObject)module0367.$ic25$, (SubLObject)module0367.$ic26$);
        Structures.def_csetf((SubLObject)module0367.$ic27$, (SubLObject)module0367.$ic28$);
        Structures.def_csetf((SubLObject)module0367.$ic29$, (SubLObject)module0367.$ic30$);
        Structures.def_csetf((SubLObject)module0367.$ic31$, (SubLObject)module0367.$ic32$);
        Structures.def_csetf((SubLObject)module0367.$ic33$, (SubLObject)module0367.$ic34$);
        Structures.def_csetf((SubLObject)module0367.$ic35$, (SubLObject)module0367.$ic36$);
        Structures.def_csetf((SubLObject)module0367.$ic37$, (SubLObject)module0367.$ic38$);
        Structures.def_csetf((SubLObject)module0367.$ic39$, (SubLObject)module0367.$ic40$);
        Equality.identity((SubLObject)module0367.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0367.$g3140$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0367.$ic62$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0367.$g3140$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0367.$ic66$));
        module0002.f50((SubLObject)module0367.$ic70$, (SubLObject)module0367.$ic71$);
        module0002.f50((SubLObject)module0367.$ic72$, (SubLObject)module0367.$ic73$);
        module0002.f50((SubLObject)module0367.$ic74$, (SubLObject)module0367.$ic75$);
        module0002.f50((SubLObject)module0367.$ic89$, (SubLObject)module0367.$ic92$);
        module0002.f50((SubLObject)module0367.$ic93$, (SubLObject)module0367.$ic92$);
        module0003.f57((SubLObject)module0367.$ic112$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0367.$g3144$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0367.$ic123$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0367.$ic124$);
        Structures.def_csetf((SubLObject)module0367.$ic125$, (SubLObject)module0367.$ic126$);
        Structures.def_csetf((SubLObject)module0367.$ic127$, (SubLObject)module0367.$ic128$);
        Structures.def_csetf((SubLObject)module0367.$ic129$, (SubLObject)module0367.$ic130$);
        Structures.def_csetf((SubLObject)module0367.$ic131$, (SubLObject)module0367.$ic132$);
        Equality.identity((SubLObject)module0367.$ic116$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0367.$g3144$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0367.$ic138$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0367.$g3145$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0367.$ic159$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0367.$ic160$);
        Structures.def_csetf((SubLObject)module0367.$ic161$, (SubLObject)module0367.$ic162$);
        Structures.def_csetf((SubLObject)module0367.$ic163$, (SubLObject)module0367.$ic164$);
        Structures.def_csetf((SubLObject)module0367.$ic165$, (SubLObject)module0367.$ic166$);
        Structures.def_csetf((SubLObject)module0367.$ic167$, (SubLObject)module0367.$ic168$);
        Equality.identity((SubLObject)module0367.$ic153$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0367.$g3145$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0367.$ic173$));
        return (SubLObject)module0367.NIL;
    }
    
    public void declareFunctions() {
        f25246();
    }
    
    public void initializeVariables() {
        f25247();
    }
    
    public void runTopLevelForms() {
        f25248();
    }
    
    static {
        me = (SubLFile)new module0367();
        module0367.$g3140$ = null;
        module0367.$g3141$ = null;
        module0367.$g3142$ = null;
        module0367.$g3143$ = null;
        module0367.$g3144$ = null;
        module0367.$g3145$ = null;
        module0367.$g3146$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#8816", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#27896", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#10593", "CYC"), SubLObjectFactory.makeSymbol("S#25426", "CYC"), SubLObjectFactory.makeSymbol("S#28158", "CYC"), SubLObjectFactory.makeSymbol("S#28159", "CYC"), SubLObjectFactory.makeSymbol("S#28160", "CYC"), SubLObjectFactory.makeSymbol("S#28161", "CYC"), SubLObjectFactory.makeSymbol("S#28162", "CYC"), SubLObjectFactory.makeSymbol("S#28163", "CYC"), SubLObjectFactory.makeSymbol("S#28164", "CYC"), SubLObjectFactory.makeSymbol("S#28165", "CYC"), SubLObjectFactory.makeSymbol("S#28166", "CYC"), SubLObjectFactory.makeSymbol("S#28167", "CYC"), SubLObjectFactory.makeSymbol("S#3043", "CYC"), SubLObjectFactory.makeSymbol("S#28168", "CYC"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("S#1625", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUID"), SubLObjectFactory.makeKeyword("INFERENCE"), SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS-CRITERION"), SubLObjectFactory.makeKeyword("ACTIVE-PROBLEMS"), SubLObjectFactory.makeKeyword("MOTIVATED-PROBLEMS"), SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEMS"), SubLObjectFactory.makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?"), SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), SubLObjectFactory.makeKeyword("PROOF-SPEC"), SubLObjectFactory.makeKeyword("PROBLEM-PROOF-SPEC-INDEX"), SubLObjectFactory.makeKeyword("PROBLEM-STRATEGIC-INDEX"), SubLObjectFactory.makeKeyword("MEMOIZATION-STATE"), SubLObjectFactory.makeKeyword("STEP-COUNT"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("DATA") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#27918", "CYC"), SubLObjectFactory.makeSymbol("S#27919", "CYC"), SubLObjectFactory.makeSymbol("S#27920", "CYC"), SubLObjectFactory.makeSymbol("S#27921", "CYC"), SubLObjectFactory.makeSymbol("S#27922", "CYC"), SubLObjectFactory.makeSymbol("S#27923", "CYC"), SubLObjectFactory.makeSymbol("S#27924", "CYC"), SubLObjectFactory.makeSymbol("S#27925", "CYC"), SubLObjectFactory.makeSymbol("S#27926", "CYC"), SubLObjectFactory.makeSymbol("S#27927", "CYC"), SubLObjectFactory.makeSymbol("S#27928", "CYC"), SubLObjectFactory.makeSymbol("S#27929", "CYC"), SubLObjectFactory.makeSymbol("S#27930", "CYC"), SubLObjectFactory.makeSymbol("S#27931", "CYC"), SubLObjectFactory.makeSymbol("S#27932", "CYC"), SubLObjectFactory.makeSymbol("S#27933", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#27934", "CYC"), SubLObjectFactory.makeSymbol("S#27935", "CYC"), SubLObjectFactory.makeSymbol("S#27936", "CYC"), SubLObjectFactory.makeSymbol("S#27937", "CYC"), SubLObjectFactory.makeSymbol("S#27938", "CYC"), SubLObjectFactory.makeSymbol("S#27939", "CYC"), SubLObjectFactory.makeSymbol("S#27940", "CYC"), SubLObjectFactory.makeSymbol("S#27941", "CYC"), SubLObjectFactory.makeSymbol("S#27942", "CYC"), SubLObjectFactory.makeSymbol("S#27943", "CYC"), SubLObjectFactory.makeSymbol("S#27944", "CYC"), SubLObjectFactory.makeSymbol("S#27945", "CYC"), SubLObjectFactory.makeSymbol("S#27946", "CYC"), SubLObjectFactory.makeSymbol("S#27947", "CYC"), SubLObjectFactory.makeSymbol("S#27948", "CYC"), SubLObjectFactory.makeSymbol("S#27949", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#27955", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#27917", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#27896", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#27918", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#27934", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#27919", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#27935", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#27920", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#27936", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#27921", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#27937", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#27922", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#27938", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#27923", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#27939", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#27924", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#27940", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#27925", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#27941", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#27926", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#27942", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#27927", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#27943", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#27928", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#27944", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#27929", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#27945", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#27930", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#27946", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#27931", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#27947", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#27932", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#27948", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#27933", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#27949", "CYC");
        $ic41$ = SubLObjectFactory.makeKeyword("SUID");
        $ic42$ = SubLObjectFactory.makeKeyword("INFERENCE");
        $ic43$ = SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS-CRITERION");
        $ic44$ = SubLObjectFactory.makeKeyword("ACTIVE-PROBLEMS");
        $ic45$ = SubLObjectFactory.makeKeyword("MOTIVATED-PROBLEMS");
        $ic46$ = SubLObjectFactory.makeKeyword("SET-ASIDE-PROBLEMS");
        $ic47$ = SubLObjectFactory.makeKeyword("SHOULD-RECONSIDER-SET-ASIDES?");
        $ic48$ = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $ic49$ = SubLObjectFactory.makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
        $ic50$ = SubLObjectFactory.makeKeyword("PROOF-SPEC");
        $ic51$ = SubLObjectFactory.makeKeyword("PROBLEM-PROOF-SPEC-INDEX");
        $ic52$ = SubLObjectFactory.makeKeyword("PROBLEM-STRATEGIC-INDEX");
        $ic53$ = SubLObjectFactory.makeKeyword("MEMOIZATION-STATE");
        $ic54$ = SubLObjectFactory.makeKeyword("STEP-COUNT");
        $ic55$ = SubLObjectFactory.makeKeyword("TYPE");
        $ic56$ = SubLObjectFactory.makeKeyword("DATA");
        $ic57$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic58$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic59$ = SubLObjectFactory.makeSymbol("S#27950", "CYC");
        $ic60$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic61$ = SubLObjectFactory.makeKeyword("END");
        $ic62$ = SubLObjectFactory.makeSymbol("S#27952", "CYC");
        $ic63$ = SubLObjectFactory.makeKeyword("FREE");
        $ic64$ = SubLObjectFactory.makeString("<Invalid STRATEGY ~s>");
        $ic65$ = SubLObjectFactory.makeString("<~a STRATEGY ~a.~a for inference ~a.~a>");
        $ic66$ = SubLObjectFactory.makeSymbol("S#27897", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#28028", "CYC");
        $ic68$ = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $ic69$ = SubLObjectFactory.makeKeyword("CONSTRUCTOR");
        $ic70$ = SubLObjectFactory.makeSymbol("S#27965", "CYC");
        $ic71$ = SubLObjectFactory.makeSymbol("S#27979", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#27966", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#27980", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#27967", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#27981", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#26657", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#26625", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#27900", "CYC");
        $ic79$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#27287", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#8816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic80$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic81$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic82$ = SubLObjectFactory.makeKeyword("DONE");
        $ic83$ = SubLObjectFactory.makeSymbol("S#708", "CYC");
        $ic84$ = SubLObjectFactory.makeSymbol("S#2964", "CYC");
        $ic85$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic86$ = SubLObjectFactory.makeUninternedSymbol("US#720AAEC");
        $ic87$ = SubLObjectFactory.makeUninternedSymbol("US#191F897");
        $ic88$ = SubLObjectFactory.makeSymbol("CLET");
        $ic89$ = SubLObjectFactory.makeSymbol("S#27983", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#28152", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#3165", "CYC");
        $ic92$ = SubLObjectFactory.makeSymbol("S#27982", "CYC");
        $ic93$ = SubLObjectFactory.makeSymbol("S#27984", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("S#27421", "CYC");
        $ic95$ = SubLObjectFactory.makeKeyword("PROOF");
        $ic96$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic97$ = SubLObjectFactory.makeSymbol("S#26082", "CYC");
        $ic98$ = SubLObjectFactory.makeKeyword("ANYTHING");
        $ic99$ = SubLObjectFactory.makeSymbol("S#26535", "CYC");
        $ic100$ = SubLObjectFactory.makeString("Unexpected strategy property ~s with value ~s");
        $ic101$ = SubLObjectFactory.makeSymbol("S#26536", "CYC");
        $ic102$ = SubLObjectFactory.makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED");
        $ic103$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8816", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#24274", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic104$ = SubLObjectFactory.makeUninternedSymbol("US#720AAEC");
        $ic105$ = SubLObjectFactory.makeUninternedSymbol("US#65EE06E");
        $ic106$ = SubLObjectFactory.makeSymbol("S#28006", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#28007", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#28169", "CYC");
        $ic109$ = SubLObjectFactory.makeKeyword("NOTHING");
        $ic110$ = SubLObjectFactory.makeString("balancing tactician does not implement ~a");
        $ic111$ = SubLObjectFactory.makeString("Unexpected strategy type ~a");
        $ic112$ = SubLObjectFactory.makeSymbol("S#28153", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#26647", "CYC");
        $ic115$ = SubLObjectFactory.makeKeyword("RECOMPUTE");
        $ic116$ = SubLObjectFactory.makeSymbol("S#27910", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#27911", "CYC");
        $ic118$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#5846", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28170", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28171", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28172", "CYC"));
        $ic119$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("POSSIBLE-TACTIC-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("UNINTERESTINGNESS"));
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28036", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28037", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28038", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28039", "CYC"));
        $ic121$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28040", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28041", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28042", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28043", "CYC"));
        $ic122$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic123$ = SubLObjectFactory.makeSymbol("S#28035", "CYC");
        $ic124$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#27911", "CYC"));
        $ic125$ = SubLObjectFactory.makeSymbol("S#28036", "CYC");
        $ic126$ = SubLObjectFactory.makeSymbol("S#28040", "CYC");
        $ic127$ = SubLObjectFactory.makeSymbol("S#28037", "CYC");
        $ic128$ = SubLObjectFactory.makeSymbol("S#28041", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#28038", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("S#28042", "CYC");
        $ic131$ = SubLObjectFactory.makeSymbol("S#28039", "CYC");
        $ic132$ = SubLObjectFactory.makeSymbol("S#28043", "CYC");
        $ic133$ = SubLObjectFactory.makeKeyword("STATUS");
        $ic134$ = SubLObjectFactory.makeKeyword("TACTIC-STRATEGIC-PROPERTY-INDEX");
        $ic135$ = SubLObjectFactory.makeKeyword("POSSIBLE-TACTIC-COUNT");
        $ic136$ = SubLObjectFactory.makeKeyword("UNINTERESTINGNESS");
        $ic137$ = SubLObjectFactory.makeSymbol("S#28044", "CYC");
        $ic138$ = SubLObjectFactory.makeSymbol("S#28046", "CYC");
        $ic139$ = SubLObjectFactory.makeKeyword("NEW");
        $ic140$ = SubLObjectFactory.makeKeyword("UNEXAMINED");
        $ic141$ = SubLObjectFactory.makeKeyword("FINISHED");
        $ic142$ = SubLObjectFactory.makeKeyword("NEUTRAL");
        $ic143$ = SubLObjectFactory.makeKeyword("NO-GOOD");
        $ic144$ = SubLObjectFactory.makeSymbol("S#27373", "CYC");
        $ic145$ = SubLObjectFactory.makeString("poking good status ~s into problem ~s wrt strategy ~s");
        $ic146$ = SubLObjectFactory.makeKeyword("POSSIBLE-NO-GOOD");
        $ic147$ = SubLObjectFactory.makeString(":possible-no-good ~s wrt ~s");
        $ic148$ = SubLObjectFactory.makeKeyword("EXAMINED");
        $ic149$ = SubLObjectFactory.makeKeyword("POSSIBLE");
        $ic150$ = SubLObjectFactory.makeKeyword("PENDING");
        $ic151$ = SubLObjectFactory.makeSymbol("S#28118", "CYC");
        $ic152$ = SubLObjectFactory.makeKeyword("ALL");
        $ic153$ = SubLObjectFactory.makeSymbol("S#27912", "CYC");
        $ic154$ = SubLObjectFactory.makeSymbol("S#27913", "CYC");
        $ic155$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#26474", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#27804", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#26071", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28172", "CYC"));
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeKeyword("PRODUCTIVITY"), (SubLObject)SubLObjectFactory.makeKeyword("UNINTERESTINGNESS"));
        $ic157$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28084", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28085", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28086", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28087", "CYC"));
        $ic158$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#28088", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28089", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28090", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28091", "CYC"));
        $ic159$ = SubLObjectFactory.makeSymbol("S#28083", "CYC");
        $ic160$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#27913", "CYC"));
        $ic161$ = SubLObjectFactory.makeSymbol("S#28084", "CYC");
        $ic162$ = SubLObjectFactory.makeSymbol("S#28088", "CYC");
        $ic163$ = SubLObjectFactory.makeSymbol("S#28085", "CYC");
        $ic164$ = SubLObjectFactory.makeSymbol("S#28089", "CYC");
        $ic165$ = SubLObjectFactory.makeSymbol("S#28086", "CYC");
        $ic166$ = SubLObjectFactory.makeSymbol("S#28090", "CYC");
        $ic167$ = SubLObjectFactory.makeSymbol("S#28087", "CYC");
        $ic168$ = SubLObjectFactory.makeSymbol("S#28091", "CYC");
        $ic169$ = SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL");
        $ic170$ = SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL-JUSTIFICATION");
        $ic171$ = SubLObjectFactory.makeKeyword("PRODUCTIVITY");
        $ic172$ = SubLObjectFactory.makeSymbol("S#28092", "CYC");
        $ic173$ = SubLObjectFactory.makeSymbol("S#28094", "CYC");
        $ic174$ = SubLObjectFactory.makeString("");
        $ic175$ = SubLObjectFactory.makeSymbol("S#26790", "CYC");
        $ic176$ = SubLObjectFactory.makeKeyword("TACTICAL");
        $ic177$ = SubLObjectFactory.makeString("structural tactic ~s cannot have a completeness");
        $ic178$ = SubLObjectFactory.makeString("content tactic ~s cannot have a preference level");
        $ic179$ = SubLObjectFactory.makeString("content tactic ~s cannot have a preference level justification");
        $ic180$ = SubLObjectFactory.makeSymbol("S#27915", "CYC");
        $ic181$ = SubLObjectFactory.makeKeyword("PREFERRED");
        $ic182$ = SubLObjectFactory.makeSymbol("S#26357", "CYC");
        $ic183$ = SubLObjectFactory.makeSymbol("S#28119", "CYC");
        $ic184$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic185$ = SubLObjectFactory.makeKeyword("SKIP");
    }
    
    public static final class $sX8816_native extends SubLStructNative
    {
        public SubLObject $suid;
        public SubLObject $inference;
        public SubLObject $result_uniqueness_criterion;
        public SubLObject $active_problems;
        public SubLObject $motivated_problems;
        public SubLObject $set_aside_problems;
        public SubLObject $should_reconsider_set_asidesP;
        public SubLObject $productivity_limit;
        public SubLObject $removal_backtracking_productivity_limit;
        public SubLObject $proof_spec;
        public SubLObject $problem_proof_spec_index;
        public SubLObject $problem_strategic_index;
        public SubLObject $memoization_state;
        public SubLObject $step_count;
        public SubLObject $type;
        public SubLObject $data;
        private static final SubLStructDeclNative structDecl;
        
        public $sX8816_native() {
            this.$suid = (SubLObject)CommonSymbols.NIL;
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$result_uniqueness_criterion = (SubLObject)CommonSymbols.NIL;
            this.$active_problems = (SubLObject)CommonSymbols.NIL;
            this.$motivated_problems = (SubLObject)CommonSymbols.NIL;
            this.$set_aside_problems = (SubLObject)CommonSymbols.NIL;
            this.$should_reconsider_set_asidesP = (SubLObject)CommonSymbols.NIL;
            this.$productivity_limit = (SubLObject)CommonSymbols.NIL;
            this.$removal_backtracking_productivity_limit = (SubLObject)CommonSymbols.NIL;
            this.$proof_spec = (SubLObject)CommonSymbols.NIL;
            this.$problem_proof_spec_index = (SubLObject)CommonSymbols.NIL;
            this.$problem_strategic_index = (SubLObject)CommonSymbols.NIL;
            this.$memoization_state = (SubLObject)CommonSymbols.NIL;
            this.$step_count = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$data = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX8816_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$suid;
        }
        
        public SubLObject getField3() {
            return this.$inference;
        }
        
        public SubLObject getField4() {
            return this.$result_uniqueness_criterion;
        }
        
        public SubLObject getField5() {
            return this.$active_problems;
        }
        
        public SubLObject getField6() {
            return this.$motivated_problems;
        }
        
        public SubLObject getField7() {
            return this.$set_aside_problems;
        }
        
        public SubLObject getField8() {
            return this.$should_reconsider_set_asidesP;
        }
        
        public SubLObject getField9() {
            return this.$productivity_limit;
        }
        
        public SubLObject getField10() {
            return this.$removal_backtracking_productivity_limit;
        }
        
        public SubLObject getField11() {
            return this.$proof_spec;
        }
        
        public SubLObject getField12() {
            return this.$problem_proof_spec_index;
        }
        
        public SubLObject getField13() {
            return this.$problem_strategic_index;
        }
        
        public SubLObject getField14() {
            return this.$memoization_state;
        }
        
        public SubLObject getField15() {
            return this.$step_count;
        }
        
        public SubLObject getField16() {
            return this.$type;
        }
        
        public SubLObject getField17() {
            return this.$data;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$suid = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$inference = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$result_uniqueness_criterion = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$active_problems = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$motivated_problems = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$set_aside_problems = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$should_reconsider_set_asidesP = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$productivity_limit = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$removal_backtracking_productivity_limit = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$proof_spec = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$problem_proof_spec_index = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$problem_strategic_index = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$memoization_state = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$step_count = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$type = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$data = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX8816_native.class, module0367.$ic0$, module0367.$ic1$, module0367.$ic2$, module0367.$ic3$, new String[] { "$suid", "$inference", "$result_uniqueness_criterion", "$active_problems", "$motivated_problems", "$set_aside_problems", "$should_reconsider_set_asidesP", "$productivity_limit", "$removal_backtracking_productivity_limit", "$proof_spec", "$problem_proof_spec_index", "$problem_strategic_index", "$memoization_state", "$step_count", "$type", "$data" }, module0367.$ic4$, module0367.$ic5$, module0367.$ic6$);
        }
    }
    
    public static final class $f24997$UnaryFunction extends UnaryFunction
    {
        public $f24997$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27896"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0367.f24997(var3);
        }
    }
    
    public static final class $f25038$UnaryFunction extends UnaryFunction
    {
        public $f25038$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27897"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0367.f25038(var3);
        }
    }
    
    public static final class $sX27910_native extends SubLStructNative
    {
        public SubLObject $status;
        public SubLObject $tactic_strategic_property_index;
        public SubLObject $possible_tactic_count;
        public SubLObject $uninterestingness;
        private static final SubLStructDeclNative structDecl;
        
        public $sX27910_native() {
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$tactic_strategic_property_index = (SubLObject)CommonSymbols.NIL;
            this.$possible_tactic_count = (SubLObject)CommonSymbols.NIL;
            this.$uninterestingness = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX27910_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$status;
        }
        
        public SubLObject getField3() {
            return this.$tactic_strategic_property_index;
        }
        
        public SubLObject getField4() {
            return this.$possible_tactic_count;
        }
        
        public SubLObject getField5() {
            return this.$uninterestingness;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$status = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$tactic_strategic_property_index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$possible_tactic_count = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$uninterestingness = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX27910_native.class, module0367.$ic116$, module0367.$ic117$, module0367.$ic118$, module0367.$ic119$, new String[] { "$status", "$tactic_strategic_property_index", "$possible_tactic_count", "$uninterestingness" }, module0367.$ic120$, module0367.$ic121$, module0367.$ic122$);
        }
    }
    
    public static final class $f25124$UnaryFunction extends UnaryFunction
    {
        public $f25124$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27911"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0367.f25124(var3);
        }
    }
    
    public static final class $sX27912_native extends SubLStructNative
    {
        public SubLObject $preference_level;
        public SubLObject $preference_level_justification;
        public SubLObject $productivity;
        public SubLObject $uninterestingness;
        private static final SubLStructDeclNative structDecl;
        
        public $sX27912_native() {
            this.$preference_level = (SubLObject)CommonSymbols.NIL;
            this.$preference_level_justification = (SubLObject)CommonSymbols.NIL;
            this.$productivity = (SubLObject)CommonSymbols.NIL;
            this.$uninterestingness = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX27912_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$preference_level;
        }
        
        public SubLObject getField3() {
            return this.$preference_level_justification;
        }
        
        public SubLObject getField4() {
            return this.$productivity;
        }
        
        public SubLObject getField5() {
            return this.$uninterestingness;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$preference_level = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$preference_level_justification = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$productivity = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$uninterestingness = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX27912_native.class, module0367.$ic153$, module0367.$ic154$, module0367.$ic155$, module0367.$ic156$, new String[] { "$preference_level", "$preference_level_justification", "$productivity", "$uninterestingness" }, module0367.$ic157$, module0367.$ic158$, module0367.$ic122$);
        }
    }
    
    public static final class $f25181$UnaryFunction extends UnaryFunction
    {
        public $f25181$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#27913"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0367.f25181(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0367.class
	Total time: 831 ms
	
	Decompiled with Procyon 0.5.32.
*/