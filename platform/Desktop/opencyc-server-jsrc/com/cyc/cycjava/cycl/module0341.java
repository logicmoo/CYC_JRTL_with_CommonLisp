package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
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

public final class module0341 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0341";
    public static final String myFingerPrint = "47a1814f8b40406f7321d9a9067c8848f2f35b2c535e9a2908789299618d7962";
    public static SubLSymbol $g2928$;
    private static SubLSymbol $g2929$;
    private static SubLSymbol $g2930$;
    public static SubLSymbol $g2931$;
    private static SubLSymbol $g2932$;
    private static SubLSymbol $g2933$;
    public static SubLSymbol $g2934$;
    public static SubLSymbol $g2935$;
    public static SubLSymbol $g2936$;
    public static SubLSymbol $g2937$;
    public static SubLSymbol $g2938$;
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
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLInteger $ic64$;
    private static final SubLList $ic65$;
    private static final SubLList $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLList $ic71$;
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
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLList $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
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
    private static final SubLList $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLList $ic127$;
    private static final SubLList $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLList $ic130$;
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
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLList $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLList $ic154$;
    private static final SubLList $ic155$;
    private static final SubLList $ic156$;
    private static final SubLList $ic157$;
    private static final SubLList $ic158$;
    private static final SubLList $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    
    public static SubLObject f23011(final SubLObject var1, final SubLObject var2) {
        f23012(var1, var2, (SubLObject)module0341.ZERO_INTEGER);
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23013(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX25695_native.class) ? module0341.T : module0341.NIL);
    }
    
    public static SubLObject f23014(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f23015(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f23016(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f23017(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f23018(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f23019(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f23020(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f23021(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f23022(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f23023(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f23024(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f23025(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f23026(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f23027(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f23028(final SubLObject var1) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f23029(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f23030(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f23031(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f23032(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f23033(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f23034(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f23035(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f23036(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f23037(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f23038(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f23039(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f23040(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f23041(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f23042(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f23043(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23013(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f23044(SubLObject var5) {
        if (var5 == module0341.UNPROVIDED) {
            var5 = (SubLObject)module0341.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX25695_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0341.NIL, var7 = var5; module0341.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0341.$ic39$)) {
                f23029(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic40$)) {
                f23030(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic41$)) {
                f23031(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic42$)) {
                f23032(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic43$)) {
                f23033(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic44$)) {
                f23034(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic45$)) {
                f23035(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic46$)) {
                f23036(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic47$)) {
                f23037(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic48$)) {
                f23038(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic49$)) {
                f23039(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic50$)) {
                f23040(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic51$)) {
                f23041(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic52$)) {
                f23042(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic53$)) {
                f23043(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0341.$ic54$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f23045(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic55$, (SubLObject)module0341.$ic56$, (SubLObject)module0341.FIFTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic39$, f23014(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic40$, f23015(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic41$, f23016(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic42$, f23017(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic43$, f23018(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic44$, f23019(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic45$, f23020(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic46$, f23021(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic47$, f23022(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic48$, f23023(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic49$, f23024(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic50$, f23025(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic51$, f23026(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic52$, f23027(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic53$, f23028(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic58$, (SubLObject)module0341.$ic56$, (SubLObject)module0341.FIFTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f23046(final SubLObject var11, final SubLObject var12) {
        return f23045(var11, var12);
    }
    
    public static SubLObject f23012(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLObject var15 = f23026(var13);
        if (module0341.NIL != var15) {
            Functions.funcall(var15, var13, var2, var14);
        }
        else {
            compatibility.default_struct_print_function(var13, var2, var14);
        }
        return var13;
    }
    
    public static SubLObject f23047() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0341.NIL;
        final SubLObject var18 = Storage.$current_area$.currentBinding(var16);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var16);
            var17 = f23044((SubLObject)module0341.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f23048(final SubLObject var18) {
        return var18;
    }
    
    public static SubLObject f23049(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0341.NIL != f23013(var13) && f23015(var13) == module0341.$ic61$);
    }
    
    public static SubLObject f23050(SubLObject var13) {
        assert module0341.NIL != f23013(var13) : var13;
        if (module0341.NIL == f23049(var13)) {
            var13 = f23048(var13);
            f23030(var13, (SubLObject)module0341.$ic61$);
            if (module0341.NIL != module0012.$g63$.getGlobalValue()) {
                final SubLObject var14 = module0341.$g2930$.getGlobalValue();
                SubLObject var15 = (SubLObject)module0341.NIL;
                try {
                    var15 = Locks.seize_lock(var14);
                    f23029(var13, module0341.$g2929$.getGlobalValue());
                    module0341.$g2929$.setGlobalValue(var13);
                }
                finally {
                    if (module0341.NIL != var15) {
                        Locks.release_lock(var14);
                    }
                }
            }
            return (SubLObject)module0341.T;
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23051() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0341.NIL != module0012.$g63$.getGlobalValue()) {
            SubLObject var17 = (SubLObject)module0341.NIL;
            SubLObject var18 = (SubLObject)module0341.NIL;
            final SubLObject var19 = module0341.$g2930$.getGlobalValue();
            SubLObject var20 = (SubLObject)module0341.NIL;
            try {
                var20 = Locks.seize_lock(var19);
                var17 = module0341.$g2929$.getGlobalValue();
                while (module0341.NIL == var18 && module0341.NIL != var17) {
                    if (module0341.NIL != f23049(var17)) {
                        module0341.$g2929$.setGlobalValue(f23014(var17));
                        var18 = (SubLObject)module0341.T;
                    }
                    else {
                        var17 = f23014(var17);
                    }
                }
                if (module0341.NIL == var18) {
                    if (module0341.NIL != module0012.$g64$.getDynamicValue(var16)) {
                        var17 = f23047();
                    }
                    else {
                        var17 = f23044((SubLObject)module0341.UNPROVIDED);
                    }
                    module0341.$g2929$.setGlobalValue((SubLObject)module0341.NIL);
                }
            }
            finally {
                if (module0341.NIL != var20) {
                    Locks.release_lock(var19);
                }
            }
            return f23048(var17);
        }
        if (module0341.NIL != module0012.$g64$.getDynamicValue(var16)) {
            return f23048(f23047());
        }
        return f23048(f23044((SubLObject)module0341.UNPROVIDED));
    }
    
    public static SubLObject f23052(final SubLObject var24, final SubLObject var25, final SubLObject var26, final SubLObject var27, final SubLObject var28, final SubLObject var29, final SubLObject var30, final SubLObject var31, SubLObject var32, SubLObject var33) {
        if (var32 == module0341.UNPROVIDED) {
            var32 = (SubLObject)module0341.NIL;
        }
        if (var33 == module0341.UNPROVIDED) {
            var33 = (SubLObject)module0341.NIL;
        }
        final SubLObject var34 = f23051();
        f23029(var34, (SubLObject)module0341.NIL);
        f23030(var34, (SubLObject)module0341.NIL);
        f23032(var34, var24);
        f23033(var34, var25);
        f23034(var34, var26);
        f23035(var34, var27);
        f23036(var34, var28);
        f23037(var34, var29);
        f23038(var34, var30);
        f23039(var34, var31);
        f23040(var34, var32);
        f23041(var34, var33);
        return var34;
    }
    
    public static SubLObject f23053(final SubLObject var1, final SubLObject var2) {
        f23054(var1, var2, (SubLObject)module0341.ZERO_INTEGER);
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23055(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX25697_native.class) ? module0341.T : module0341.NIL);
    }
    
    public static SubLObject f23056(final SubLObject var1) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f23057(final SubLObject var1) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f23058(final SubLObject var1) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f23059(final SubLObject var1) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f23060(final SubLObject var1) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f23061(final SubLObject var1) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f23062(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f23063(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f23064(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f23065(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f23066(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f23067(final SubLObject var1, final SubLObject var4) {
        assert module0341.NIL != f23055(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f23068(SubLObject var5) {
        if (var5 == module0341.UNPROVIDED) {
            var5 = (SubLObject)module0341.NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX25697_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)module0341.NIL, var7 = var5; module0341.NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)module0341.$ic84$)) {
                f23062(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic85$)) {
                f23063(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic86$)) {
                f23064(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic87$)) {
                f23065(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic88$)) {
                f23066(var6, var9);
            }
            else if (var10.eql((SubLObject)module0341.$ic50$)) {
                f23067(var6, var9);
            }
            else {
                Errors.error((SubLObject)module0341.$ic54$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f23069(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic55$, (SubLObject)module0341.$ic89$, (SubLObject)module0341.SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic84$, f23056(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic85$, f23057(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic86$, f23058(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic87$, f23059(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic88$, f23060(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic57$, (SubLObject)module0341.$ic50$, f23061(var11));
        Functions.funcall(var12, var11, (SubLObject)module0341.$ic58$, (SubLObject)module0341.$ic89$, (SubLObject)module0341.SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f23070(final SubLObject var11, final SubLObject var12) {
        return f23069(var11, var12);
    }
    
    public static SubLObject f23054(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (module0341.NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)module0341.$ic91$, var2, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { module0341.$ic92$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { module0341.$ic92$, var2, module0341.$ic93$, module0341.SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23071() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)module0341.NIL;
        final SubLObject var18 = Storage.$current_area$.currentBinding(var16);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var16);
            var17 = f23068((SubLObject)module0341.UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f23072(final SubLObject var42) {
        f23062(var42, (SubLObject)module0341.NIL);
        f23063(var42, (SubLObject)module0341.NIL);
        f23064(var42, (SubLObject)module0341.NIL);
        f23065(var42, (SubLObject)module0341.NIL);
        f23066(var42, (SubLObject)module0341.$ic95$);
        f23067(var42, (SubLObject)module0341.NIL);
        return var42;
    }
    
    public static SubLObject f23073(final SubLObject var13) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0341.NIL != f23055(var13) && f23057(var13) == module0341.$ic61$);
    }
    
    public static SubLObject f23074(SubLObject var13) {
        assert module0341.NIL != f23055(var13) : var13;
        if (module0341.NIL == f23073(var13)) {
            var13 = f23072(var13);
            f23063(var13, (SubLObject)module0341.$ic61$);
            if (module0341.NIL != module0012.$g63$.getGlobalValue()) {
                final SubLObject var14 = module0341.$g2933$.getGlobalValue();
                SubLObject var15 = (SubLObject)module0341.NIL;
                try {
                    var15 = Locks.seize_lock(var14);
                    f23062(var13, module0341.$g2932$.getGlobalValue());
                    module0341.$g2932$.setGlobalValue(var13);
                }
                finally {
                    if (module0341.NIL != var15) {
                        Locks.release_lock(var14);
                    }
                }
            }
            return (SubLObject)module0341.T;
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23075() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0341.NIL != module0012.$g63$.getGlobalValue()) {
            SubLObject var17 = (SubLObject)module0341.NIL;
            SubLObject var18 = (SubLObject)module0341.NIL;
            final SubLObject var19 = module0341.$g2933$.getGlobalValue();
            SubLObject var20 = (SubLObject)module0341.NIL;
            try {
                var20 = Locks.seize_lock(var19);
                var17 = module0341.$g2932$.getGlobalValue();
                while (module0341.NIL == var18 && module0341.NIL != var17) {
                    if (module0341.NIL != f23073(var17)) {
                        module0341.$g2932$.setGlobalValue(f23056(var17));
                        var18 = (SubLObject)module0341.T;
                    }
                    else {
                        var17 = f23056(var17);
                    }
                }
                if (module0341.NIL == var18) {
                    if (module0341.NIL != module0012.$g64$.getDynamicValue(var16)) {
                        var17 = f23071();
                    }
                    else {
                        var17 = f23068((SubLObject)module0341.UNPROVIDED);
                    }
                    module0341.$g2932$.setGlobalValue((SubLObject)module0341.NIL);
                }
            }
            finally {
                if (module0341.NIL != var20) {
                    Locks.release_lock(var19);
                }
            }
            return f23072(var17);
        }
        if (module0341.NIL != module0012.$g64$.getDynamicValue(var16)) {
            return f23072(f23071());
        }
        return f23072(f23068((SubLObject)module0341.UNPROVIDED));
    }
    
    public static SubLObject f23076(final SubLObject var42, SubLObject var47) {
        if (var47 == module0341.UNPROVIDED) {
            var47 = (SubLObject)module0341.NIL;
        }
        if (module0341.NIL != f23055(var42)) {
            SubLObject var48 = f23058(var42);
            SubLObject var49 = (SubLObject)module0341.NIL;
            var49 = var48.first();
            while (module0341.NIL != var48) {
                f23076(var49, var47);
                var48 = var48.rest();
                var49 = var48.first();
            }
            if (module0341.NIL != var47) {
                Functions.funcall(var47, f23061(var42));
            }
            f23074(var42);
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23077(final SubLObject var50) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0341.NIL != f23055(var50) && module0341.NIL == f23078(var50) && module0341.NIL == f23058(var50));
    }
    
    public static SubLObject f23079(final SubLObject var50) {
        if (module0341.NIL != f23055(var50)) {
            final SubLObject var51 = f23057(var50);
            final SubLObject var52 = f23056(var50);
            f23076(var50, (SubLObject)module0341.UNPROVIDED);
            if (module0341.NIL != f23055(var51)) {
                final SubLObject var53 = f23058(var51);
                f23064(var51, Sequences.delete(var50, var53, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED));
                if (module0341.NIL != f23077(var51)) {
                    f23079(var51);
                }
            }
            else if (module0341.NIL != f23013(var52) && module0341.NIL != conses_high.member(var50, f23014(var52), (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED)) {
                f23080(var52, var50);
            }
            else {
                Errors.cerror((SubLObject)module0341.$ic98$, (SubLObject)module0341.$ic99$, var50);
            }
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23081() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0341.NIL != module0341.$g2937$.getDynamicValue(var16)) {
            module0341.$g2938$.setDynamicValue((SubLObject)module0341.T, var16);
            return (SubLObject)module0341.T;
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23082() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (module0341.NIL != module0341.$g2937$.getDynamicValue(var16)) {
            Dynamic.sublisp_throw((SubLObject)module0341.$ic100$, (SubLObject)module0341.$ic101$);
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23083(final SubLObject var53, final SubLObject var54) {
        SubLObject var56;
        final SubLObject var55 = var56 = var53.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        final SubLObject var57 = var56.rest();
        var56 = var56.first();
        SubLObject var58 = (SubLObject)module0341.NIL;
        SubLObject var59 = (SubLObject)module0341.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var58 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var59 = var56.first();
        var56 = var56.rest();
        SubLObject var60 = (SubLObject)module0341.NIL;
        SubLObject var61 = var56;
        SubLObject var62 = (SubLObject)module0341.NIL;
        SubLObject var62_63 = (SubLObject)module0341.NIL;
        while (module0341.NIL != var61) {
            cdestructuring_bind.destructuring_bind_must_consp(var61, var55, (SubLObject)module0341.$ic102$);
            var62_63 = var61.first();
            var61 = var61.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var61, var55, (SubLObject)module0341.$ic102$);
            if (module0341.NIL == conses_high.member(var62_63, (SubLObject)module0341.$ic103$, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED)) {
                var62 = (SubLObject)module0341.T;
            }
            if (var62_63 == module0341.$ic104$) {
                var60 = var61.first();
            }
            var61 = var61.rest();
        }
        if (module0341.NIL != var62 && module0341.NIL == var60) {
            cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)module0341.$ic102$);
        }
        final SubLObject var63 = cdestructuring_bind.property_list_member((SubLObject)module0341.$ic105$, var56);
        final SubLObject var64 = (SubLObject)((module0341.NIL != var63) ? conses_high.cadr(var63) : module0341.NIL);
        final SubLObject var65 = cdestructuring_bind.property_list_member((SubLObject)module0341.$ic106$, var56);
        final SubLObject var66 = (SubLObject)((module0341.NIL != var65) ? conses_high.cadr(var65) : module0341.NIL);
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)module0341.$ic107$, var56);
        final SubLObject var68 = (SubLObject)((module0341.NIL != var67) ? conses_high.cadr(var67) : module0341.NIL);
        var56 = var57;
        SubLObject var69 = (SubLObject)module0341.NIL;
        SubLObject var70 = (SubLObject)module0341.NIL;
        SubLObject var71 = (SubLObject)module0341.NIL;
        SubLObject var72 = (SubLObject)module0341.NIL;
        SubLObject var73 = (SubLObject)module0341.NIL;
        SubLObject var74 = (SubLObject)module0341.NIL;
        SubLObject var75 = (SubLObject)module0341.NIL;
        SubLObject var76 = (SubLObject)module0341.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var69 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var70 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var71 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var72 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var73 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var74 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var75 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)module0341.$ic102$);
        var76 = var56.first();
        var56 = var56.rest();
        if (module0341.NIL == var56) {
            final SubLObject var77 = (SubLObject)module0341.$ic108$;
            final SubLObject var78 = (SubLObject)module0341.$ic109$;
            final SubLObject var79 = (SubLObject)module0341.$ic110$;
            final SubLObject var80 = (SubLObject)module0341.$ic111$;
            final SubLObject var81 = (SubLObject)module0341.$ic112$;
            final SubLObject var82 = (SubLObject)module0341.$ic113$;
            final SubLObject var83 = (SubLObject)module0341.$ic114$;
            final SubLObject var84 = (SubLObject)module0341.$ic115$;
            final SubLObject var85 = (SubLObject)module0341.$ic116$;
            final SubLObject var86 = (SubLObject)module0341.$ic117$;
            final SubLObject var87 = (SubLObject)module0341.$ic118$;
            final SubLObject var88 = (SubLObject)module0341.$ic119$;
            final SubLObject var89 = (SubLObject)module0341.$ic120$;
            final SubLObject var90 = (SubLObject)module0341.$ic121$;
            final SubLObject var91 = (SubLObject)module0341.$ic122$;
            return (SubLObject)ConsesLow.list((SubLObject)module0341.$ic123$, (SubLObject)ConsesLow.list(reader.bq_cons(var77, (SubLObject)module0341.$ic124$), (SubLObject)ConsesLow.list(var78, (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic125$, var66, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic126$, var66), (SubLObject)module0341.$ic127$)), (SubLObject)ConsesLow.list(var79, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic35$, var59))), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic123$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic128$, var80), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic129$, (SubLObject)module0341.$ic100$, var80, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic123$, (SubLObject)module0341.$ic130$, (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic37$, var59), (SubLObject)module0341.$ic127$), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic132$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic133$, (SubLObject)module0341.$ic134$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic135$, var64, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic136$, var77, var64)), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic135$, var66, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic137$, var78)), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic138$, var69, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic11$, var59))), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic139$, (SubLObject)ConsesLow.list(var81, var82), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic138$, var70, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic11$, var59)), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic11$, var59), var82), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic140$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0341.$ic141$, var81)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0341.$ic138$, var71, var81), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic123$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var83, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic13$, var59))), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic139$, (SubLObject)ConsesLow.list(var84, var85), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic138$, var72, var81, var83), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic13$, var59), var84), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic142$, var85, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic143$, var77))), (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic80$, var81), (SubLObject)module0341.$ic127$), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic142$, (SubLObject)module0341.$ic144$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic145$, var81)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0341.$ic138$, var73, var81, var68), (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic146$, var79, (SubLObject)module0341.$ic147$), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic148$, var81, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic35$, var59))), (SubLObject)ConsesLow.list((SubLObject)module0341.T, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic123$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var86, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic138$, var74, var81)), var88), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic37$, var59), var81), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic149$, (SubLObject)ConsesLow.list(var87, var86), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic123$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var89, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic138$, var75, var81, var87))), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic142$, var89, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic149$, (SubLObject)ConsesLow.list(var90, var89), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic150$, (SubLObject)ConsesLow.list((SubLObject)module0341.EQ, var90, var81), (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic146$, var88, (SubLObject)module0341.$ic147$), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic151$, var90, var81)), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic123$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var91, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic11$, var59)), var82), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic146$, var82, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic138$, var76, var90, var91)), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic11$, var59), var82)))))), (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic37$, var59), (SubLObject)module0341.$ic127$), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic131$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic76$, var81), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic152$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic76$, var81))), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic153$, var88, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic142$, (SubLObject)module0341.$ic144$, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic145$, var81)))))))))), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic140$, (SubLObject)ConsesLow.list(var80, (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic146$, var58, (SubLObject)module0341.$ic154$)), (SubLObject)ConsesLow.list((SubLObject)module0341.$ic134$, (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic146$, var58, (SubLObject)module0341.$ic155$)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0341.$ic135$, var64, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic136$, var77, var64)), (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic146$, var58, (SubLObject)module0341.$ic156$)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0341.$ic135$, var66, (SubLObject)ConsesLow.list((SubLObject)module0341.$ic137$, var78)), (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic146$, var58, (SubLObject)module0341.$ic157$)), (SubLObject)ConsesLow.list(var79, (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic146$, var58, (SubLObject)module0341.$ic158$)), (SubLObject)ConsesLow.list((SubLObject)module0341.T, (SubLObject)ConsesLow.listS((SubLObject)module0341.$ic146$, var58, (SubLObject)module0341.$ic159$)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)module0341.$ic102$);
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23084(final SubLObject var18, SubLObject var65, SubLObject var67, SubLObject var69) {
        if (var65 == module0341.UNPROVIDED) {
            var65 = (SubLObject)module0341.NIL;
        }
        if (var67 == module0341.UNPROVIDED) {
            var67 = (SubLObject)module0341.NIL;
        }
        if (var69 == module0341.UNPROVIDED) {
            var69 = (SubLObject)module0341.NIL;
        }
        final SubLThread var70 = SubLProcess.currentSubLThread();
        final SubLObject var71 = f23017(var18);
        final SubLObject var72 = f23018(var18);
        final SubLObject var73 = f23019(var18);
        final SubLObject var74 = f23020(var18);
        final SubLObject var75 = f23024(var18);
        final SubLObject var76 = f23021(var18);
        final SubLObject var77 = f23022(var18);
        final SubLObject var78 = f23023(var18);
        SubLObject var79 = (SubLObject)module0341.NIL;
        SubLObject var80 = (SubLObject)module0341.ZERO_INTEGER;
        final SubLObject var81 = (SubLObject)((module0341.NIL != var67) ? module0051.time_from_now(var67) : module0341.NIL);
        SubLObject var82 = f23027(var18);
        final SubLObject var83 = module0341.$g2938$.currentBinding(var70);
        try {
            module0341.$g2938$.bind((SubLObject)module0341.NIL, var70);
            SubLObject var84 = (SubLObject)module0341.NIL;
            try {
                var70.throwStack.push(module0341.$ic100$);
                final SubLObject var17_89 = module0341.$g2937$.currentBinding(var70);
                try {
                    module0341.$g2937$.bind((SubLObject)module0341.T, var70);
                    f23043(var18, (SubLObject)module0341.NIL);
                    while (module0341.NIL == module0341.$g2938$.getDynamicValue(var70) && (module0341.NIL == var65 || !var80.numGE(var65)) && (module0341.NIL == var67 || module0341.NIL == Time.time_has_arrivedP(var81)) && module0341.NIL == Functions.funcall(var71, f23015(var18))) {
                        var70.resetMultipleValues();
                        final SubLObject var85 = Functions.funcall(var72, f23015(var18));
                        final SubLObject var86 = var70.secondMultipleValue();
                        var70.resetMultipleValues();
                        f23030(var18, var86);
                        if (module0341.NIL != f23085(var85)) {
                            continue;
                        }
                        if (module0341.NIL != Functions.funcall(var73, var85)) {
                            final SubLObject var87 = f23016(var18);
                            var70.resetMultipleValues();
                            final SubLObject var88 = Functions.funcall(var74, var85, var87);
                            final SubLObject var89 = var70.secondMultipleValue();
                            var70.resetMultipleValues();
                            f23031(var18, var88);
                            if (module0341.NIL != var89) {
                                var80 = Numbers.add(var80, (SubLObject)module0341.ONE_INTEGER);
                            }
                            f23066(var85, (SubLObject)module0341.NIL);
                            if (module0341.NIL == module0341.$g2934$.getDynamicValue(var70)) {
                                continue;
                            }
                            f23086(var85);
                        }
                        else if (module0341.NIL != Functions.funcall(var75, var85, var69)) {
                            var82 = (SubLObject)module0341.T;
                            f23042(var18, (SubLObject)ConsesLow.cons(var85, f23027(var18)));
                        }
                        else {
                            final SubLObject var90 = Functions.funcall(var76, var85);
                            SubLObject var91 = (SubLObject)module0341.NIL;
                            f23043(var18, var85);
                            SubLObject var92 = var90;
                            SubLObject var93 = (SubLObject)module0341.NIL;
                            var93 = var92.first();
                            while (module0341.NIL != var92) {
                                final SubLObject var94 = Functions.funcall(var77, var85, var93);
                                if (module0341.NIL != var94) {
                                    SubLObject var48_99 = var94;
                                    SubLObject var95 = (SubLObject)module0341.NIL;
                                    var95 = var48_99.first();
                                    while (module0341.NIL != var48_99) {
                                        if (var95.eql(var85)) {
                                            var91 = (SubLObject)module0341.T;
                                        }
                                        else {
                                            f23087(var95, var85);
                                        }
                                        final SubLObject var96 = f23015(var18);
                                        SubLObject var91_102 = (SubLObject)module0341.NIL;
                                        var91_102 = Functions.funcall(var78, var95, var96);
                                        f23030(var18, var91_102);
                                        var48_99 = var48_99.rest();
                                        var95 = var48_99.first();
                                    }
                                }
                                var92 = var92.rest();
                                var93 = var92.first();
                            }
                            f23043(var18, (SubLObject)module0341.NIL);
                            f23064(var85, Sequences.nreverse(f23058(var85)));
                            if (module0341.NIL != var91 || module0341.NIL == module0341.$g2934$.getDynamicValue(var70)) {
                                continue;
                            }
                            f23086(var85);
                        }
                    }
                }
                finally {
                    module0341.$g2937$.rebind(var17_89, var70);
                }
            }
            catch (Throwable var97) {
                var84 = Errors.handleThrowable(var97, (SubLObject)module0341.$ic100$);
            }
            finally {
                var70.throwStack.pop();
            }
            if (module0341.NIL != var84) {
                var79 = (SubLObject)module0341.$ic101$;
            }
            else if (module0341.NIL != module0341.$g2938$.getDynamicValue(var70)) {
                var79 = (SubLObject)module0341.$ic160$;
            }
            else if (module0341.NIL != var65 && var80.numGE(var65)) {
                var79 = (SubLObject)module0341.$ic161$;
            }
            else if (module0341.NIL != var67 && module0341.NIL != Time.time_has_arrivedP(var81)) {
                var79 = (SubLObject)module0341.$ic162$;
            }
            else if (module0341.NIL != var82) {
                var79 = (SubLObject)module0341.$ic87$;
            }
            else {
                var79 = (SubLObject)module0341.$ic163$;
            }
        }
        finally {
            module0341.$g2938$.rebind(var83, var70);
        }
        return var79;
    }
    
    public static SubLObject f23086(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (module0341.NIL != Functions.funcall(module0341.$g2935$.getDynamicValue(var51), var50)) {
            Functions.funcall(module0341.$g2936$.getDynamicValue(var51), var50);
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23087(final SubLObject var49, final SubLObject var51) {
        f23063(var49, var51);
        f23062(var49, f23056(var51));
        f23065(var49, Numbers.add((SubLObject)module0341.ONE_INTEGER, f23059(var51)));
        f23064(var51, (SubLObject)ConsesLow.cons(var49, f23058(var51)));
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23088(final SubLObject var50, final SubLObject var32) {
        f23067(var50, var32);
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23089(final SubLObject var32) {
        final SubLObject var33 = f23075();
        f23088(var33, var32);
        f23066(var33, (SubLObject)module0341.$ic95$);
        return var33;
    }
    
    public static SubLObject f23090(final SubLObject var18) {
        final SubLObject var19 = f23089((SubLObject)module0341.NIL);
        f23062(var19, var18);
        f23063(var19, (SubLObject)module0341.NIL);
        f23064(var19, (SubLObject)module0341.NIL);
        f23065(var19, (SubLObject)module0341.ZERO_INTEGER);
        return var19;
    }
    
    public static SubLObject f23091(final SubLObject var18, final SubLObject var104) {
        f23029(var18, (SubLObject)ConsesLow.cons(var104, f23014(var18)));
        f23030(var18, Functions.funcall(f23023(var18), var104, f23015(var18)));
        return var104;
    }
    
    public static SubLObject f23092(final SubLObject var18, final SubLObject var32) {
        final SubLObject var33 = f23090(var18);
        f23088(var33, var32);
        return f23091(var18, var33);
    }
    
    public static SubLObject f23080(final SubLObject var18, final SubLObject var104) {
        f23029(var18, Sequences.delete(var104, f23014(var18), (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED, (SubLObject)module0341.UNPROVIDED));
        return var18;
    }
    
    public static SubLObject f23093(final SubLObject var18, final SubLObject var69) {
        final SubLObject var70 = f23023(var18);
        final SubLObject var71 = f23024(var18);
        SubLObject var72 = f23015(var18);
        final SubLObject var73 = f23027(var18);
        SubLObject var74 = (SubLObject)module0341.NIL;
        SubLObject var75 = (SubLObject)module0341.NIL;
        SubLObject var76 = var73;
        SubLObject var77 = (SubLObject)module0341.NIL;
        var77 = var76.first();
        while (module0341.NIL != var76) {
            if (module0341.NIL != Functions.funcall(var71, var77, var69)) {
                var75 = (SubLObject)ConsesLow.cons(var77, var75);
            }
            else {
                var74 = (SubLObject)ConsesLow.cons(var77, var74);
            }
            var76 = var76.rest();
            var77 = var76.first();
        }
        f23042(var18, Sequences.nreverse(var75));
        var76 = Sequences.nreverse(var74);
        var77 = (SubLObject)module0341.NIL;
        var77 = var76.first();
        while (module0341.NIL != var76) {
            var72 = Functions.funcall(var70, var77, var72);
            var76 = var76.rest();
            var77 = var76.first();
        }
        f23030(var18, var72);
        return var18;
    }
    
    public static SubLObject f23078(final SubLObject var50) {
        if (module0341.NIL == f23085(var50)) {
            return f23060(var50);
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23094(final SubLObject var50, final SubLObject var109) {
        if (module0341.NIL == f23085(var50)) {
            f23066(var50, var109);
        }
        return var109;
    }
    
    public static SubLObject f23085(final SubLObject var50) {
        assert module0341.NIL != f23055(var50) : var50;
        return Equality.eq(f23060(var50), (SubLObject)module0341.$ic164$);
    }
    
    public static SubLObject f23095(final SubLObject var50) {
        if (module0341.NIL != var50 && module0341.NIL == f23085(var50)) {
            f23066(var50, (SubLObject)module0341.$ic164$);
            SubLObject var51 = f23058(var50);
            SubLObject var52 = (SubLObject)module0341.NIL;
            var52 = var51.first();
            while (module0341.NIL != var51) {
                f23095(var52);
                var51 = var51.rest();
                var52 = var51.first();
            }
        }
        return var50;
    }
    
    public static SubLObject f23096(final SubLObject var18) {
        return Sequences.nreverse(f23097(f23028(var18)));
    }
    
    public static SubLObject f23097(final SubLObject var42) {
        if (module0341.NIL != f23055(var42)) {
            return (SubLObject)ConsesLow.cons(var42, f23097(f23057(var42)));
        }
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23098(final SubLObject var111, final SubLObject var112) {
        if (module0341.NIL == var112) {
            return (SubLObject)module0341.NIL;
        }
        return Numbers.max((SubLObject)module0341.ZERO_INTEGER, Numbers.subtract(var112, Numbers.subtract(Time.get_universal_time(), var111)));
    }
    
    public static SubLObject f23099(final SubLObject var18) {
        assert module0341.NIL != f23013(var18) : var18;
        SubLObject var19 = (SubLObject)module0341.ZERO_INTEGER;
        SubLObject var20 = f23014(var18);
        SubLObject var21 = (SubLObject)module0341.NIL;
        var21 = var20.first();
        while (module0341.NIL != var20) {
            var19 = Numbers.add(var19, f23100(var21));
            var20 = var20.rest();
            var21 = var20.first();
        }
        return var19;
    }
    
    public static SubLObject f23100(final SubLObject var42) {
        if (module0341.NIL != f23055(var42)) {
            SubLObject var43 = (SubLObject)module0341.ONE_INTEGER;
            SubLObject var44 = f23058(var42);
            SubLObject var45 = (SubLObject)module0341.NIL;
            var45 = var44.first();
            while (module0341.NIL != var44) {
                var43 = Numbers.add(var43, f23100(var45));
                var44 = var44.rest();
                var45 = var44.first();
            }
            return var43;
        }
        return (SubLObject)module0341.ZERO_INTEGER;
    }
    
    public static SubLObject f23101() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23011", "S#25699", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23013", "S#25696", 1, 0, false);
        new $f23013$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23014", "S#25700", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23015", "S#25701", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23016", "S#25702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23017", "S#25703", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23018", "S#25704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23019", "S#25705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23020", "S#25706", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23021", "S#25707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23022", "S#25708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23023", "S#25709", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23024", "S#25710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23025", "S#25711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23026", "S#25712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23027", "S#25713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23028", "S#25714", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23029", "S#25715", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23030", "S#25716", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23031", "S#25717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23032", "S#25718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23033", "S#25719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23034", "S#25720", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23035", "S#25721", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23036", "S#25722", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23037", "S#25723", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23038", "S#25724", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23039", "S#25725", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23040", "S#25726", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23041", "S#25727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23042", "S#25728", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23043", "S#25729", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23044", "S#25730", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23045", "S#25731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23046", "S#25732", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23012", "S#25733", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23047", "S#25734", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23048", "S#25735", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23049", "S#25736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23050", "S#25737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23051", "S#25738", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23052", "S#25739", 8, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23053", "S#25740", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23055", "S#25698", 1, 0, false);
        new $f23055$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23056", "S#25741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23057", "S#25742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23058", "S#25743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23059", "S#25744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23060", "S#25745", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23061", "S#25746", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23062", "S#25747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23063", "S#25748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23064", "S#25749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23065", "S#25750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23066", "S#25751", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23067", "S#25752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23068", "S#25753", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23069", "S#25754", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23070", "S#25755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23054", "S#25756", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23071", "S#25757", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23072", "S#25758", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23073", "S#25759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23074", "S#25760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23075", "S#25761", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23076", "S#25762", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23077", "S#25763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23079", "S#25764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23081", "S#25765", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23082", "S#25766", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0341", "f23083", "S#25767");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23084", "S#25768", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23086", "S#25769", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23087", "S#25770", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23088", "S#25771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23089", "S#25772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23090", "S#25773", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23091", "S#25774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23092", "S#25775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23080", "S#25776", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23093", "S#25777", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23078", "S#25778", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23094", "S#25779", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23085", "S#25780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23095", "S#25781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23096", "S#25782", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23097", "S#25783", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23098", "S#25784", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23099", "S#25785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0341", "f23100", "S#25786", 1, 0, false);
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23102() {
        module0341.$g2928$ = SubLFiles.defconstant("S#25787", (SubLObject)module0341.$ic0$);
        module0341.$g2929$ = SubLFiles.deflexical("S#25788", (SubLObject)module0341.NIL);
        module0341.$g2930$ = SubLFiles.deflexical("S#25789", Locks.make_lock((SubLObject)module0341.$ic60$));
        module0341.$g2931$ = SubLFiles.defconstant("S#25790", (SubLObject)module0341.$ic62$);
        module0341.$g2932$ = SubLFiles.deflexical("S#25791", (SubLObject)module0341.NIL);
        module0341.$g2933$ = SubLFiles.deflexical("S#25792", Locks.make_lock((SubLObject)module0341.$ic94$));
        module0341.$g2934$ = SubLFiles.defparameter("S#25793", (SubLObject)module0341.T);
        module0341.$g2935$ = SubLFiles.defparameter("S#25794", (SubLObject)module0341.$ic96$);
        module0341.$g2936$ = SubLFiles.defparameter("S#25795", (SubLObject)module0341.$ic97$);
        module0341.$g2937$ = SubLFiles.defparameter("S#25796", (SubLObject)module0341.NIL);
        module0341.$g2938$ = SubLFiles.defparameter("S#25797", (SubLObject)module0341.NIL);
        return (SubLObject)module0341.NIL;
    }
    
    public static SubLObject f23103() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0341.$g2928$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0341.$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0341.$ic8$);
        Structures.def_csetf((SubLObject)module0341.$ic9$, (SubLObject)module0341.$ic10$);
        Structures.def_csetf((SubLObject)module0341.$ic11$, (SubLObject)module0341.$ic12$);
        Structures.def_csetf((SubLObject)module0341.$ic13$, (SubLObject)module0341.$ic14$);
        Structures.def_csetf((SubLObject)module0341.$ic15$, (SubLObject)module0341.$ic16$);
        Structures.def_csetf((SubLObject)module0341.$ic17$, (SubLObject)module0341.$ic18$);
        Structures.def_csetf((SubLObject)module0341.$ic19$, (SubLObject)module0341.$ic20$);
        Structures.def_csetf((SubLObject)module0341.$ic21$, (SubLObject)module0341.$ic22$);
        Structures.def_csetf((SubLObject)module0341.$ic23$, (SubLObject)module0341.$ic24$);
        Structures.def_csetf((SubLObject)module0341.$ic25$, (SubLObject)module0341.$ic26$);
        Structures.def_csetf((SubLObject)module0341.$ic27$, (SubLObject)module0341.$ic28$);
        Structures.def_csetf((SubLObject)module0341.$ic29$, (SubLObject)module0341.$ic30$);
        Structures.def_csetf((SubLObject)module0341.$ic31$, (SubLObject)module0341.$ic32$);
        Structures.def_csetf((SubLObject)module0341.$ic33$, (SubLObject)module0341.$ic34$);
        Structures.def_csetf((SubLObject)module0341.$ic35$, (SubLObject)module0341.$ic36$);
        Structures.def_csetf((SubLObject)module0341.$ic37$, (SubLObject)module0341.$ic38$);
        Equality.identity((SubLObject)module0341.$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0341.$g2928$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0341.$ic59$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0341.$g2931$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0341.$ic70$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0341.$ic71$);
        Structures.def_csetf((SubLObject)module0341.$ic72$, (SubLObject)module0341.$ic73$);
        Structures.def_csetf((SubLObject)module0341.$ic74$, (SubLObject)module0341.$ic75$);
        Structures.def_csetf((SubLObject)module0341.$ic76$, (SubLObject)module0341.$ic77$);
        Structures.def_csetf((SubLObject)module0341.$ic78$, (SubLObject)module0341.$ic79$);
        Structures.def_csetf((SubLObject)module0341.$ic80$, (SubLObject)module0341.$ic81$);
        Structures.def_csetf((SubLObject)module0341.$ic82$, (SubLObject)module0341.$ic83$);
        Equality.identity((SubLObject)module0341.$ic62$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0341.$g2931$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0341.$ic90$));
        module0012.f419((SubLObject)module0341.$ic69$);
        return (SubLObject)module0341.NIL;
    }
    
    public void declareFunctions() {
        f23101();
    }
    
    public void initializeVariables() {
        f23102();
    }
    
    public void runTopLevelForms() {
        f23103();
    }
    
    static {
        me = (SubLFile)new module0341();
        module0341.$g2928$ = null;
        module0341.$g2929$ = null;
        module0341.$g2930$ = null;
        module0341.$g2931$ = null;
        module0341.$g2932$ = null;
        module0341.$g2933$ = null;
        module0341.$g2934$ = null;
        module0341.$g2935$ = null;
        module0341.$g2936$ = null;
        module0341.$g2937$ = null;
        module0341.$g2938$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#25695", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#25696", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#720", "CYC"), SubLObjectFactory.makeSymbol("S#25798", "CYC"), SubLObjectFactory.makeSymbol("S#25799", "CYC"), SubLObjectFactory.makeSymbol("S#25800", "CYC"), SubLObjectFactory.makeSymbol("S#25801", "CYC"), SubLObjectFactory.makeSymbol("S#25802", "CYC"), SubLObjectFactory.makeSymbol("S#25803", "CYC"), SubLObjectFactory.makeSymbol("S#25804", "CYC"), SubLObjectFactory.makeSymbol("S#25805", "CYC"), SubLObjectFactory.makeSymbol("S#25806", "CYC"), SubLObjectFactory.makeSymbol("S#25807", "CYC"), SubLObjectFactory.makeSymbol("S#3266", "CYC"), SubLObjectFactory.makeSymbol("S#25808", "CYC"), SubLObjectFactory.makeSymbol("S#25809", "CYC"), SubLObjectFactory.makeSymbol("S#25810", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TREE"), SubLObjectFactory.makeKeyword("LEAVES"), SubLObjectFactory.makeKeyword("GOALS"), SubLObjectFactory.makeKeyword("NO-LEAVES-P-FUNC"), SubLObjectFactory.makeKeyword("NEXT-NODE-FUNC"), SubLObjectFactory.makeKeyword("GOAL-P-FUNC"), SubLObjectFactory.makeKeyword("ADD-GOAL-FUNC"), SubLObjectFactory.makeKeyword("OPTIONS-FUNC"), SubLObjectFactory.makeKeyword("EXPAND-FUNC"), SubLObjectFactory.makeKeyword("ADD-NODE-FUNC"), SubLObjectFactory.makeKeyword("TOO-DEEP-FUNC"), SubLObjectFactory.makeKeyword("STATE"), SubLObjectFactory.makeKeyword("PRINT-FUNC"), SubLObjectFactory.makeKeyword("LIMBO"), SubLObjectFactory.makeKeyword("CURRENT-NODE") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#25700", "CYC"), SubLObjectFactory.makeSymbol("S#25701", "CYC"), SubLObjectFactory.makeSymbol("S#25702", "CYC"), SubLObjectFactory.makeSymbol("S#25703", "CYC"), SubLObjectFactory.makeSymbol("S#25704", "CYC"), SubLObjectFactory.makeSymbol("S#25705", "CYC"), SubLObjectFactory.makeSymbol("S#25706", "CYC"), SubLObjectFactory.makeSymbol("S#25707", "CYC"), SubLObjectFactory.makeSymbol("S#25708", "CYC"), SubLObjectFactory.makeSymbol("S#25709", "CYC"), SubLObjectFactory.makeSymbol("S#25710", "CYC"), SubLObjectFactory.makeSymbol("S#25711", "CYC"), SubLObjectFactory.makeSymbol("S#25712", "CYC"), SubLObjectFactory.makeSymbol("S#25713", "CYC"), SubLObjectFactory.makeSymbol("S#25714", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#25715", "CYC"), SubLObjectFactory.makeSymbol("S#25716", "CYC"), SubLObjectFactory.makeSymbol("S#25717", "CYC"), SubLObjectFactory.makeSymbol("S#25718", "CYC"), SubLObjectFactory.makeSymbol("S#25719", "CYC"), SubLObjectFactory.makeSymbol("S#25720", "CYC"), SubLObjectFactory.makeSymbol("S#25721", "CYC"), SubLObjectFactory.makeSymbol("S#25722", "CYC"), SubLObjectFactory.makeSymbol("S#25723", "CYC"), SubLObjectFactory.makeSymbol("S#25724", "CYC"), SubLObjectFactory.makeSymbol("S#25725", "CYC"), SubLObjectFactory.makeSymbol("S#25726", "CYC"), SubLObjectFactory.makeSymbol("S#25727", "CYC"), SubLObjectFactory.makeSymbol("S#25728", "CYC"), SubLObjectFactory.makeSymbol("S#25729", "CYC") });
        $ic6$ = SubLObjectFactory.makeSymbol("S#25733", "CYC");
        $ic7$ = SubLObjectFactory.makeSymbol("S#25699", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#25696", "CYC"));
        $ic9$ = SubLObjectFactory.makeSymbol("S#25700", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("S#25715", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#25701", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#25716", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#25702", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#25717", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#25703", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#25718", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#25704", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#25719", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#25705", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#25720", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#25706", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#25721", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#25707", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#25722", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#25708", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#25723", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#25709", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#25724", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#25710", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#25725", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#25711", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#25726", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#25712", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#25727", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#25713", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#25728", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#25714", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#25729", "CYC");
        $ic39$ = SubLObjectFactory.makeKeyword("TREE");
        $ic40$ = SubLObjectFactory.makeKeyword("LEAVES");
        $ic41$ = SubLObjectFactory.makeKeyword("GOALS");
        $ic42$ = SubLObjectFactory.makeKeyword("NO-LEAVES-P-FUNC");
        $ic43$ = SubLObjectFactory.makeKeyword("NEXT-NODE-FUNC");
        $ic44$ = SubLObjectFactory.makeKeyword("GOAL-P-FUNC");
        $ic45$ = SubLObjectFactory.makeKeyword("ADD-GOAL-FUNC");
        $ic46$ = SubLObjectFactory.makeKeyword("OPTIONS-FUNC");
        $ic47$ = SubLObjectFactory.makeKeyword("EXPAND-FUNC");
        $ic48$ = SubLObjectFactory.makeKeyword("ADD-NODE-FUNC");
        $ic49$ = SubLObjectFactory.makeKeyword("TOO-DEEP-FUNC");
        $ic50$ = SubLObjectFactory.makeKeyword("STATE");
        $ic51$ = SubLObjectFactory.makeKeyword("PRINT-FUNC");
        $ic52$ = SubLObjectFactory.makeKeyword("LIMBO");
        $ic53$ = SubLObjectFactory.makeKeyword("CURRENT-NODE");
        $ic54$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic55$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic56$ = SubLObjectFactory.makeSymbol("S#25730", "CYC");
        $ic57$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic58$ = SubLObjectFactory.makeKeyword("END");
        $ic59$ = SubLObjectFactory.makeSymbol("S#25732", "CYC");
        $ic60$ = SubLObjectFactory.makeString("SEARCH-STRUC resource lock");
        $ic61$ = SubLObjectFactory.makeKeyword("FREE");
        $ic62$ = SubLObjectFactory.makeSymbol("S#25697", "CYC");
        $ic63$ = SubLObjectFactory.makeSymbol("S#25698", "CYC");
        $ic64$ = SubLObjectFactory.makeInteger(151);
        $ic65$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("S#10127", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#9176", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25811", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6511", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#3266", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEARCH"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT"), (SubLObject)SubLObjectFactory.makeKeyword("CHILDREN"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH"), (SubLObject)SubLObjectFactory.makeKeyword("OPTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("STATE"));
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25741", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25742", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25743", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25744", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25745", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25746", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25747", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25748", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25749", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25750", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25751", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25752", "CYC"));
        $ic69$ = SubLObjectFactory.makeSymbol("S#25756", "CYC");
        $ic70$ = SubLObjectFactory.makeSymbol("S#25740", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#25698", "CYC"));
        $ic72$ = SubLObjectFactory.makeSymbol("S#25741", "CYC");
        $ic73$ = SubLObjectFactory.makeSymbol("S#25747", "CYC");
        $ic74$ = SubLObjectFactory.makeSymbol("S#25742", "CYC");
        $ic75$ = SubLObjectFactory.makeSymbol("S#25748", "CYC");
        $ic76$ = SubLObjectFactory.makeSymbol("S#25743", "CYC");
        $ic77$ = SubLObjectFactory.makeSymbol("S#25749", "CYC");
        $ic78$ = SubLObjectFactory.makeSymbol("S#25744", "CYC");
        $ic79$ = SubLObjectFactory.makeSymbol("S#25750", "CYC");
        $ic80$ = SubLObjectFactory.makeSymbol("S#25745", "CYC");
        $ic81$ = SubLObjectFactory.makeSymbol("S#25751", "CYC");
        $ic82$ = SubLObjectFactory.makeSymbol("S#25746", "CYC");
        $ic83$ = SubLObjectFactory.makeSymbol("S#25752", "CYC");
        $ic84$ = SubLObjectFactory.makeKeyword("SEARCH");
        $ic85$ = SubLObjectFactory.makeKeyword("PARENT");
        $ic86$ = SubLObjectFactory.makeKeyword("CHILDREN");
        $ic87$ = SubLObjectFactory.makeKeyword("DEPTH");
        $ic88$ = SubLObjectFactory.makeKeyword("OPTIONS");
        $ic89$ = SubLObjectFactory.makeSymbol("S#25753", "CYC");
        $ic90$ = SubLObjectFactory.makeSymbol("S#25755", "CYC");
        $ic91$ = SubLObjectFactory.makeString("#<");
        $ic92$ = SubLObjectFactory.makeKeyword("STREAM");
        $ic93$ = SubLObjectFactory.makeKeyword("BASE");
        $ic94$ = SubLObjectFactory.makeString("SEARCH-NODE resource lock");
        $ic95$ = SubLObjectFactory.makeKeyword("UNDETERMINED");
        $ic96$ = SubLObjectFactory.makeSymbol("S#25763", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#25764", "CYC");
        $ic98$ = SubLObjectFactory.makeString("So don't");
        $ic99$ = SubLObjectFactory.makeString("Cannot reclaim strange node ~S");
        $ic100$ = SubLObjectFactory.makeKeyword("ABORT-GENERIC-SEARCH");
        $ic101$ = SubLObjectFactory.makeKeyword("ABORT");
        $ic102$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25812", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#25813", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25814", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#25815", "CYC")), SubLObjectFactory.makeSymbol("S#25800", "CYC"), SubLObjectFactory.makeSymbol("S#25801", "CYC"), SubLObjectFactory.makeSymbol("S#25802", "CYC"), SubLObjectFactory.makeSymbol("S#25803", "CYC"), SubLObjectFactory.makeSymbol("S#25807", "CYC"), SubLObjectFactory.makeSymbol("S#25804", "CYC"), SubLObjectFactory.makeSymbol("S#25805", "CYC"), SubLObjectFactory.makeSymbol("S#25806", "CYC") });
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUMBER-CUT"), (SubLObject)SubLObjectFactory.makeKeyword("TIME-CUT"), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH-CUT"));
        $ic104$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic105$ = SubLObjectFactory.makeKeyword("NUMBER-CUT");
        $ic106$ = SubLObjectFactory.makeKeyword("TIME-CUT");
        $ic107$ = SubLObjectFactory.makeKeyword("DEPTH-CUT");
        $ic108$ = SubLObjectFactory.makeUninternedSymbol("US#342D252");
        $ic109$ = SubLObjectFactory.makeUninternedSymbol("US#326A0D5");
        $ic110$ = SubLObjectFactory.makeUninternedSymbol("US#51F66");
        $ic111$ = SubLObjectFactory.makeUninternedSymbol("US#79B62C3");
        $ic112$ = SubLObjectFactory.makeUninternedSymbol("US#11670C1");
        $ic113$ = SubLObjectFactory.makeUninternedSymbol("US#72658E4");
        $ic114$ = SubLObjectFactory.makeUninternedSymbol("US#666CFA");
        $ic115$ = SubLObjectFactory.makeUninternedSymbol("US#72591CE");
        $ic116$ = SubLObjectFactory.makeUninternedSymbol("US#58F72");
        $ic117$ = SubLObjectFactory.makeUninternedSymbol("US#331DF5E");
        $ic118$ = SubLObjectFactory.makeUninternedSymbol("US#151DF5F");
        $ic119$ = SubLObjectFactory.makeUninternedSymbol("US#42B0BDE");
        $ic120$ = SubLObjectFactory.makeUninternedSymbol("US#7859547");
        $ic121$ = SubLObjectFactory.makeUninternedSymbol("US#78597DF");
        $ic122$ = SubLObjectFactory.makeUninternedSymbol("US#782560");
        $ic123$ = SubLObjectFactory.makeSymbol("CLET");
        $ic124$ = ConsesLow.list((SubLObject)module0341.ZERO_INTEGER);
        $ic125$ = SubLObjectFactory.makeSymbol("FIF");
        $ic126$ = SubLObjectFactory.makeSymbol("TIME-FROM-NOW");
        $ic127$ = ConsesLow.list((SubLObject)module0341.NIL);
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25797", "CYC"), (SubLObject)module0341.NIL);
        $ic129$ = SubLObjectFactory.makeSymbol("CCATCH");
        $ic130$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#25796", "CYC"), (SubLObject)module0341.T));
        $ic131$ = SubLObjectFactory.makeSymbol("CSETF");
        $ic132$ = SubLObjectFactory.makeSymbol("UNTIL");
        $ic133$ = SubLObjectFactory.makeSymbol("COR");
        $ic134$ = SubLObjectFactory.makeSymbol("S#25797", "CYC");
        $ic135$ = SubLObjectFactory.makeSymbol("CAND");
        $ic136$ = SubLObjectFactory.makeSymbol(">=");
        $ic137$ = SubLObjectFactory.makeSymbol("TIME-HAS-ARRIVED?");
        $ic138$ = SubLObjectFactory.makeSymbol("S#520", "CYC");
        $ic139$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic140$ = SubLObjectFactory.makeSymbol("PCOND");
        $ic141$ = SubLObjectFactory.makeSymbol("S#25780", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic143$ = SubLObjectFactory.makeSymbol("CINC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#25793", "CYC");
        $ic145$ = SubLObjectFactory.makeSymbol("S#25769", "CYC");
        $ic146$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic147$ = ConsesLow.list((SubLObject)module0341.T);
        $ic148$ = SubLObjectFactory.makeSymbol("CPUSH");
        $ic149$ = SubLObjectFactory.makeSymbol("CDOLIST");
        $ic150$ = SubLObjectFactory.makeSymbol("PIF");
        $ic151$ = SubLObjectFactory.makeSymbol("S#25770", "CYC");
        $ic152$ = SubLObjectFactory.makeSymbol("NREVERSE");
        $ic153$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABORT"));
        $ic155$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERRUPT"));
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUMBER"));
        $ic157$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIME"));
        $ic158$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEPTH"));
        $ic159$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXHAUST"));
        $ic160$ = SubLObjectFactory.makeKeyword("INTERRUPT");
        $ic161$ = SubLObjectFactory.makeKeyword("NUMBER");
        $ic162$ = SubLObjectFactory.makeKeyword("TIME");
        $ic163$ = SubLObjectFactory.makeKeyword("EXHAUST");
        $ic164$ = SubLObjectFactory.makeKeyword("DOOMED");
    }
    
    public static final class $sX25695_native extends SubLStructNative
    {
        public SubLObject $tree;
        public SubLObject $leaves;
        public SubLObject $goals;
        public SubLObject $no_leaves_p_func;
        public SubLObject $next_node_func;
        public SubLObject $goal_p_func;
        public SubLObject $add_goal_func;
        public SubLObject $options_func;
        public SubLObject $expand_func;
        public SubLObject $add_node_func;
        public SubLObject $too_deep_func;
        public SubLObject $state;
        public SubLObject $print_func;
        public SubLObject $limbo;
        public SubLObject $current_node;
        private static final SubLStructDeclNative structDecl;
        
        public $sX25695_native() {
            this.$tree = (SubLObject)CommonSymbols.NIL;
            this.$leaves = (SubLObject)CommonSymbols.NIL;
            this.$goals = (SubLObject)CommonSymbols.NIL;
            this.$no_leaves_p_func = (SubLObject)CommonSymbols.NIL;
            this.$next_node_func = (SubLObject)CommonSymbols.NIL;
            this.$goal_p_func = (SubLObject)CommonSymbols.NIL;
            this.$add_goal_func = (SubLObject)CommonSymbols.NIL;
            this.$options_func = (SubLObject)CommonSymbols.NIL;
            this.$expand_func = (SubLObject)CommonSymbols.NIL;
            this.$add_node_func = (SubLObject)CommonSymbols.NIL;
            this.$too_deep_func = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$print_func = (SubLObject)CommonSymbols.NIL;
            this.$limbo = (SubLObject)CommonSymbols.NIL;
            this.$current_node = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX25695_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$tree;
        }
        
        public SubLObject getField3() {
            return this.$leaves;
        }
        
        public SubLObject getField4() {
            return this.$goals;
        }
        
        public SubLObject getField5() {
            return this.$no_leaves_p_func;
        }
        
        public SubLObject getField6() {
            return this.$next_node_func;
        }
        
        public SubLObject getField7() {
            return this.$goal_p_func;
        }
        
        public SubLObject getField8() {
            return this.$add_goal_func;
        }
        
        public SubLObject getField9() {
            return this.$options_func;
        }
        
        public SubLObject getField10() {
            return this.$expand_func;
        }
        
        public SubLObject getField11() {
            return this.$add_node_func;
        }
        
        public SubLObject getField12() {
            return this.$too_deep_func;
        }
        
        public SubLObject getField13() {
            return this.$state;
        }
        
        public SubLObject getField14() {
            return this.$print_func;
        }
        
        public SubLObject getField15() {
            return this.$limbo;
        }
        
        public SubLObject getField16() {
            return this.$current_node;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$tree = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$leaves = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$goals = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$no_leaves_p_func = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$next_node_func = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$goal_p_func = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$add_goal_func = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$options_func = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$expand_func = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$add_node_func = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$too_deep_func = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$state = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$print_func = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$limbo = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$current_node = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX25695_native.class, module0341.$ic0$, module0341.$ic1$, module0341.$ic2$, module0341.$ic3$, new String[] { "$tree", "$leaves", "$goals", "$no_leaves_p_func", "$next_node_func", "$goal_p_func", "$add_goal_func", "$options_func", "$expand_func", "$add_node_func", "$too_deep_func", "$state", "$print_func", "$limbo", "$current_node" }, module0341.$ic4$, module0341.$ic5$, module0341.$ic6$);
        }
    }
    
    public static final class $f23013$UnaryFunction extends UnaryFunction
    {
        public $f23013$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25696"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0341.f23013(var3);
        }
    }
    
    public static final class $sX25697_native extends SubLStructNative
    {
        public SubLObject $search;
        public SubLObject $parent;
        public SubLObject $children;
        public SubLObject $depth;
        public SubLObject $options;
        public SubLObject $state;
        private static final SubLStructDeclNative structDecl;
        
        public $sX25697_native() {
            this.$search = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$children = (SubLObject)CommonSymbols.NIL;
            this.$depth = (SubLObject)CommonSymbols.NIL;
            this.$options = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX25697_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$search;
        }
        
        public SubLObject getField3() {
            return this.$parent;
        }
        
        public SubLObject getField4() {
            return this.$children;
        }
        
        public SubLObject getField5() {
            return this.$depth;
        }
        
        public SubLObject getField6() {
            return this.$options;
        }
        
        public SubLObject getField7() {
            return this.$state;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$search = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$parent = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$children = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$depth = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$options = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$state = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX25697_native.class, module0341.$ic62$, module0341.$ic63$, module0341.$ic65$, module0341.$ic66$, new String[] { "$search", "$parent", "$children", "$depth", "$options", "$state" }, module0341.$ic67$, module0341.$ic68$, module0341.$ic69$);
        }
    }
    
    public static final class $f23055$UnaryFunction extends UnaryFunction
    {
        public $f23055$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25698"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return module0341.f23055(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0341.class
	Total time: 497 ms
	
	Decompiled with Procyon 0.5.32.
*/