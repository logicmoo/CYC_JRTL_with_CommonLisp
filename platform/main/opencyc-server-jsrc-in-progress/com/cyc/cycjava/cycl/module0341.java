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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        f23012(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23013(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX25695_native.class) ? T : NIL);
    }
    
    public static SubLObject f23014(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f23015(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f23016(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f23017(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f23018(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f23019(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f23020(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f23021(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f23022(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f23023(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField11();
    }
    
    public static SubLObject f23024(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField12();
    }
    
    public static SubLObject f23025(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField13();
    }
    
    public static SubLObject f23026(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField14();
    }
    
    public static SubLObject f23027(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField15();
    }
    
    public static SubLObject f23028(final SubLObject var1) {
        assert NIL != f23013(var1) : var1;
        return var1.getField16();
    }
    
    public static SubLObject f23029(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f23030(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f23031(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f23032(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f23033(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f23034(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f23035(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f23036(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f23037(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f23038(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField11(var4);
    }
    
    public static SubLObject f23039(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField12(var4);
    }
    
    public static SubLObject f23040(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField13(var4);
    }
    
    public static SubLObject f23041(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField14(var4);
    }
    
    public static SubLObject f23042(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField15(var4);
    }
    
    public static SubLObject f23043(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23013(var1) : var1;
        return var1.setField16(var4);
    }
    
    public static SubLObject f23044(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX25695_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic39$)) {
                f23029(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic40$)) {
                f23030(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic41$)) {
                f23031(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic42$)) {
                f23032(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic43$)) {
                f23033(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic44$)) {
                f23034(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic45$)) {
                f23035(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic46$)) {
                f23036(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic47$)) {
                f23037(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic48$)) {
                f23038(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic49$)) {
                f23039(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic50$)) {
                f23040(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic51$)) {
                f23041(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic52$)) {
                f23042(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic53$)) {
                f23043(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic54$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f23045(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic55$, (SubLObject)$ic56$, (SubLObject)FIFTEEN_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic39$, f23014(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic40$, f23015(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic41$, f23016(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic42$, f23017(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic43$, f23018(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic44$, f23019(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic45$, f23020(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic46$, f23021(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic47$, f23022(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic48$, f23023(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic49$, f23024(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic50$, f23025(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic51$, f23026(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic52$, f23027(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic53$, f23028(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic58$, (SubLObject)$ic56$, (SubLObject)FIFTEEN_INTEGER);
        return var11;
    }
    
    public static SubLObject f23046(final SubLObject var11, final SubLObject var12) {
        return f23045(var11, var12);
    }
    
    public static SubLObject f23012(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLObject var15 = f23026(var13);
        if (NIL != var15) {
            Functions.funcall(var15, var13, var2, var14);
        }
        else {
            compatibility.default_struct_print_function(var13, var2, var14);
        }
        return var13;
    }
    
    public static SubLObject f23047() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = Storage.$current_area$.currentBinding(var16);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var16);
            var17 = f23044((SubLObject)UNPROVIDED);
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
        return (SubLObject)makeBoolean(NIL != f23013(var13) && f23015(var13) == $ic61$);
    }
    
    public static SubLObject f23050(SubLObject var13) {
        assert NIL != f23013(var13) : var13;
        if (NIL == f23049(var13)) {
            var13 = f23048(var13);
            f23030(var13, (SubLObject)$ic61$);
            if (NIL != module0012.$g63$.getGlobalValue()) {
                final SubLObject var14 = $g2930$.getGlobalValue();
                SubLObject var15 = (SubLObject)NIL;
                try {
                    var15 = Locks.seize_lock(var14);
                    f23029(var13, $g2929$.getGlobalValue());
                    $g2929$.setGlobalValue(var13);
                }
                finally {
                    if (NIL != var15) {
                        Locks.release_lock(var14);
                    }
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23051() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != module0012.$g63$.getGlobalValue()) {
            SubLObject var17 = (SubLObject)NIL;
            SubLObject var18 = (SubLObject)NIL;
            final SubLObject var19 = $g2930$.getGlobalValue();
            SubLObject var20 = (SubLObject)NIL;
            try {
                var20 = Locks.seize_lock(var19);
                var17 = $g2929$.getGlobalValue();
                while (NIL == var18 && NIL != var17) {
                    if (NIL != f23049(var17)) {
                        $g2929$.setGlobalValue(f23014(var17));
                        var18 = (SubLObject)T;
                    }
                    else {
                        var17 = f23014(var17);
                    }
                }
                if (NIL == var18) {
                    if (NIL != module0012.$g64$.getDynamicValue(var16)) {
                        var17 = f23047();
                    }
                    else {
                        var17 = f23044((SubLObject)UNPROVIDED);
                    }
                    $g2929$.setGlobalValue((SubLObject)NIL);
                }
            }
            finally {
                if (NIL != var20) {
                    Locks.release_lock(var19);
                }
            }
            return f23048(var17);
        }
        if (NIL != module0012.$g64$.getDynamicValue(var16)) {
            return f23048(f23047());
        }
        return f23048(f23044((SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f23052(final SubLObject var24, final SubLObject var25, final SubLObject var26, final SubLObject var27, final SubLObject var28, final SubLObject var29, final SubLObject var30, final SubLObject var31, SubLObject var32, SubLObject var33) {
        if (var32 == UNPROVIDED) {
            var32 = (SubLObject)NIL;
        }
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var34 = f23051();
        f23029(var34, (SubLObject)NIL);
        f23030(var34, (SubLObject)NIL);
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
        f23054(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23055(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX25697_native.class) ? T : NIL);
    }
    
    public static SubLObject f23056(final SubLObject var1) {
        assert NIL != f23055(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f23057(final SubLObject var1) {
        assert NIL != f23055(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f23058(final SubLObject var1) {
        assert NIL != f23055(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f23059(final SubLObject var1) {
        assert NIL != f23055(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f23060(final SubLObject var1) {
        assert NIL != f23055(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f23061(final SubLObject var1) {
        assert NIL != f23055(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f23062(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23055(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f23063(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23055(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f23064(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23055(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f23065(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23055(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f23066(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23055(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f23067(final SubLObject var1, final SubLObject var4) {
        assert NIL != f23055(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f23068(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX25697_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic84$)) {
                f23062(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic85$)) {
                f23063(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic86$)) {
                f23064(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic87$)) {
                f23065(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic88$)) {
                f23066(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic50$)) {
                f23067(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic54$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f23069(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic55$, (SubLObject)$ic89$, (SubLObject)SIX_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic84$, f23056(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic85$, f23057(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic86$, f23058(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic87$, f23059(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic88$, f23060(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic57$, (SubLObject)$ic50$, f23061(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic58$, (SubLObject)$ic89$, (SubLObject)SIX_INTEGER);
        return var11;
    }
    
    public static SubLObject f23070(final SubLObject var11, final SubLObject var12) {
        return f23069(var11, var12);
    }
    
    public static SubLObject f23054(final SubLObject var13, final SubLObject var2, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        if (NIL != print_high.$print_readably$.getDynamicValue(var15)) {
            print_high.print_not_readable(var13, var2);
        }
        else {
            streams_high.write_string((SubLObject)$ic91$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            PrintLow.write((SubLObject)Types.type_of(var13), new SubLObject[] { $ic92$, var2 });
            streams_high.write_char((SubLObject)Characters.CHAR_space, var2);
            PrintLow.write(Equality.pointer(var13), new SubLObject[] { $ic92$, var2, $ic93$, SIXTEEN_INTEGER });
            streams_high.write_char((SubLObject)Characters.CHAR_greater, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23071() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        SubLObject var17 = (SubLObject)NIL;
        final SubLObject var18 = Storage.$current_area$.currentBinding(var16);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), var16);
            var17 = f23068((SubLObject)UNPROVIDED);
        }
        finally {
            Storage.$current_area$.rebind(var18, var16);
        }
        return var17;
    }
    
    public static SubLObject f23072(final SubLObject var42) {
        f23062(var42, (SubLObject)NIL);
        f23063(var42, (SubLObject)NIL);
        f23064(var42, (SubLObject)NIL);
        f23065(var42, (SubLObject)NIL);
        f23066(var42, (SubLObject)$ic95$);
        f23067(var42, (SubLObject)NIL);
        return var42;
    }
    
    public static SubLObject f23073(final SubLObject var13) {
        return (SubLObject)makeBoolean(NIL != f23055(var13) && f23057(var13) == $ic61$);
    }
    
    public static SubLObject f23074(SubLObject var13) {
        assert NIL != f23055(var13) : var13;
        if (NIL == f23073(var13)) {
            var13 = f23072(var13);
            f23063(var13, (SubLObject)$ic61$);
            if (NIL != module0012.$g63$.getGlobalValue()) {
                final SubLObject var14 = $g2933$.getGlobalValue();
                SubLObject var15 = (SubLObject)NIL;
                try {
                    var15 = Locks.seize_lock(var14);
                    f23062(var13, $g2932$.getGlobalValue());
                    $g2932$.setGlobalValue(var13);
                }
                finally {
                    if (NIL != var15) {
                        Locks.release_lock(var14);
                    }
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23075() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != module0012.$g63$.getGlobalValue()) {
            SubLObject var17 = (SubLObject)NIL;
            SubLObject var18 = (SubLObject)NIL;
            final SubLObject var19 = $g2933$.getGlobalValue();
            SubLObject var20 = (SubLObject)NIL;
            try {
                var20 = Locks.seize_lock(var19);
                var17 = $g2932$.getGlobalValue();
                while (NIL == var18 && NIL != var17) {
                    if (NIL != f23073(var17)) {
                        $g2932$.setGlobalValue(f23056(var17));
                        var18 = (SubLObject)T;
                    }
                    else {
                        var17 = f23056(var17);
                    }
                }
                if (NIL == var18) {
                    if (NIL != module0012.$g64$.getDynamicValue(var16)) {
                        var17 = f23071();
                    }
                    else {
                        var17 = f23068((SubLObject)UNPROVIDED);
                    }
                    $g2932$.setGlobalValue((SubLObject)NIL);
                }
            }
            finally {
                if (NIL != var20) {
                    Locks.release_lock(var19);
                }
            }
            return f23072(var17);
        }
        if (NIL != module0012.$g64$.getDynamicValue(var16)) {
            return f23072(f23071());
        }
        return f23072(f23068((SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f23076(final SubLObject var42, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        if (NIL != f23055(var42)) {
            SubLObject var48 = f23058(var42);
            SubLObject var49 = (SubLObject)NIL;
            var49 = var48.first();
            while (NIL != var48) {
                f23076(var49, var47);
                var48 = var48.rest();
                var49 = var48.first();
            }
            if (NIL != var47) {
                Functions.funcall(var47, f23061(var42));
            }
            f23074(var42);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23077(final SubLObject var50) {
        return (SubLObject)makeBoolean(NIL != f23055(var50) && NIL == f23078(var50) && NIL == f23058(var50));
    }
    
    public static SubLObject f23079(final SubLObject var50) {
        if (NIL != f23055(var50)) {
            final SubLObject var51 = f23057(var50);
            final SubLObject var52 = f23056(var50);
            f23076(var50, (SubLObject)UNPROVIDED);
            if (NIL != f23055(var51)) {
                final SubLObject var53 = f23058(var51);
                f23064(var51, Sequences.delete(var50, var53, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                if (NIL != f23077(var51)) {
                    f23079(var51);
                }
            }
            else if (NIL != f23013(var52) && NIL != conses_high.member(var50, f23014(var52), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                f23080(var52, var50);
            }
            else {
                Errors.cerror((SubLObject)$ic98$, (SubLObject)$ic99$, var50);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23081() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != $g2937$.getDynamicValue(var16)) {
            $g2938$.setDynamicValue((SubLObject)T, var16);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23082() {
        final SubLThread var16 = SubLProcess.currentSubLThread();
        if (NIL != $g2937$.getDynamicValue(var16)) {
            Dynamic.sublisp_throw((SubLObject)$ic100$, (SubLObject)$ic101$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23083(final SubLObject var53, final SubLObject var54) {
        SubLObject var56;
        final SubLObject var55 = var56 = var53.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        final SubLObject var57 = var56.rest();
        var56 = var56.first();
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var58 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var59 = var56.first();
        var56 = var56.rest();
        SubLObject var60 = (SubLObject)NIL;
        SubLObject var61 = var56;
        SubLObject var62 = (SubLObject)NIL;
        SubLObject var62_63 = (SubLObject)NIL;
        while (NIL != var61) {
            cdestructuring_bind.destructuring_bind_must_consp(var61, var55, (SubLObject)$ic102$);
            var62_63 = var61.first();
            var61 = var61.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var61, var55, (SubLObject)$ic102$);
            if (NIL == conses_high.member(var62_63, (SubLObject)$ic103$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var62 = (SubLObject)T;
            }
            if (var62_63 == $ic104$) {
                var60 = var61.first();
            }
            var61 = var61.rest();
        }
        if (NIL != var62 && NIL == var60) {
            cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)$ic102$);
        }
        final SubLObject var63 = cdestructuring_bind.property_list_member((SubLObject)$ic105$, var56);
        final SubLObject var64 = (SubLObject)((NIL != var63) ? conses_high.cadr(var63) : NIL);
        final SubLObject var65 = cdestructuring_bind.property_list_member((SubLObject)$ic106$, var56);
        final SubLObject var66 = (SubLObject)((NIL != var65) ? conses_high.cadr(var65) : NIL);
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)$ic107$, var56);
        final SubLObject var68 = (SubLObject)((NIL != var67) ? conses_high.cadr(var67) : NIL);
        var56 = var57;
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var70 = (SubLObject)NIL;
        SubLObject var71 = (SubLObject)NIL;
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = (SubLObject)NIL;
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var69 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var70 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var71 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var72 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var73 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var74 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var75 = var56.first();
        var56 = var56.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var56, var55, (SubLObject)$ic102$);
        var76 = var56.first();
        var56 = var56.rest();
        if (NIL == var56) {
            final SubLObject var77 = (SubLObject)$ic108$;
            final SubLObject var78 = (SubLObject)$ic109$;
            final SubLObject var79 = (SubLObject)$ic110$;
            final SubLObject var80 = (SubLObject)$ic111$;
            final SubLObject var81 = (SubLObject)$ic112$;
            final SubLObject var82 = (SubLObject)$ic113$;
            final SubLObject var83 = (SubLObject)$ic114$;
            final SubLObject var84 = (SubLObject)$ic115$;
            final SubLObject var85 = (SubLObject)$ic116$;
            final SubLObject var86 = (SubLObject)$ic117$;
            final SubLObject var87 = (SubLObject)$ic118$;
            final SubLObject var88 = (SubLObject)$ic119$;
            final SubLObject var89 = (SubLObject)$ic120$;
            final SubLObject var90 = (SubLObject)$ic121$;
            final SubLObject var91 = (SubLObject)$ic122$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic123$, (SubLObject)ConsesLow.list(reader.bq_cons(var77, (SubLObject)$ic124$), (SubLObject)ConsesLow.list(var78, (SubLObject)ConsesLow.listS((SubLObject)$ic125$, var66, (SubLObject)ConsesLow.list((SubLObject)$ic126$, var66), (SubLObject)$ic127$)), (SubLObject)ConsesLow.list(var79, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var59))), (SubLObject)ConsesLow.list((SubLObject)$ic123$, (SubLObject)ConsesLow.list((SubLObject)$ic128$, var80), (SubLObject)ConsesLow.list((SubLObject)$ic129$, (SubLObject)$ic100$, var80, (SubLObject)ConsesLow.list((SubLObject)$ic123$, (SubLObject)$ic130$, (SubLObject)ConsesLow.listS((SubLObject)$ic131$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var59), (SubLObject)$ic127$), (SubLObject)ConsesLow.list((SubLObject)$ic132$, (SubLObject)ConsesLow.list((SubLObject)$ic133$, (SubLObject)$ic134$, (SubLObject)ConsesLow.list((SubLObject)$ic135$, var64, (SubLObject)ConsesLow.list((SubLObject)$ic136$, var77, var64)), (SubLObject)ConsesLow.list((SubLObject)$ic135$, var66, (SubLObject)ConsesLow.list((SubLObject)$ic137$, var78)), (SubLObject)ConsesLow.list((SubLObject)$ic138$, var69, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var59))), (SubLObject)ConsesLow.list((SubLObject)$ic139$, (SubLObject)ConsesLow.list(var81, var82), (SubLObject)ConsesLow.list((SubLObject)$ic138$, var70, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var59)), (SubLObject)ConsesLow.list((SubLObject)$ic131$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var59), var82), (SubLObject)ConsesLow.list((SubLObject)$ic140$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic141$, var81)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic138$, var71, var81), (SubLObject)ConsesLow.list((SubLObject)$ic123$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var83, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var59))), (SubLObject)ConsesLow.list((SubLObject)$ic139$, (SubLObject)ConsesLow.list(var84, var85), (SubLObject)ConsesLow.list((SubLObject)$ic138$, var72, var81, var83), (SubLObject)ConsesLow.list((SubLObject)$ic131$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, var59), var84), (SubLObject)ConsesLow.list((SubLObject)$ic142$, var85, (SubLObject)ConsesLow.list((SubLObject)$ic143$, var77))), (SubLObject)ConsesLow.listS((SubLObject)$ic131$, (SubLObject)ConsesLow.list((SubLObject)$ic80$, var81), (SubLObject)$ic127$), (SubLObject)ConsesLow.list((SubLObject)$ic142$, (SubLObject)$ic144$, (SubLObject)ConsesLow.list((SubLObject)$ic145$, var81)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic138$, var73, var81, var68), (SubLObject)ConsesLow.listS((SubLObject)$ic146$, var79, (SubLObject)$ic147$), (SubLObject)ConsesLow.list((SubLObject)$ic148$, var81, (SubLObject)ConsesLow.list((SubLObject)$ic35$, var59))), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.list((SubLObject)$ic123$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var86, (SubLObject)ConsesLow.list((SubLObject)$ic138$, var74, var81)), var88), (SubLObject)ConsesLow.list((SubLObject)$ic131$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var59), var81), (SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)ConsesLow.list(var87, var86), (SubLObject)ConsesLow.list((SubLObject)$ic123$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var89, (SubLObject)ConsesLow.list((SubLObject)$ic138$, var75, var81, var87))), (SubLObject)ConsesLow.list((SubLObject)$ic142$, var89, (SubLObject)ConsesLow.list((SubLObject)$ic149$, (SubLObject)ConsesLow.list(var90, var89), (SubLObject)ConsesLow.list((SubLObject)$ic150$, (SubLObject)ConsesLow.list((SubLObject)EQ, var90, var81), (SubLObject)ConsesLow.listS((SubLObject)$ic146$, var88, (SubLObject)$ic147$), (SubLObject)ConsesLow.list((SubLObject)$ic151$, var90, var81)), (SubLObject)ConsesLow.list((SubLObject)$ic123$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var91, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var59)), var82), (SubLObject)ConsesLow.list((SubLObject)$ic146$, var82, (SubLObject)ConsesLow.list((SubLObject)$ic138$, var76, var90, var91)), (SubLObject)ConsesLow.list((SubLObject)$ic131$, (SubLObject)ConsesLow.list((SubLObject)$ic11$, var59), var82)))))), (SubLObject)ConsesLow.listS((SubLObject)$ic131$, (SubLObject)ConsesLow.list((SubLObject)$ic37$, var59), (SubLObject)$ic127$), (SubLObject)ConsesLow.list((SubLObject)$ic131$, (SubLObject)ConsesLow.list((SubLObject)$ic76$, var81), (SubLObject)ConsesLow.list((SubLObject)$ic152$, (SubLObject)ConsesLow.list((SubLObject)$ic76$, var81))), (SubLObject)ConsesLow.list((SubLObject)$ic153$, var88, (SubLObject)ConsesLow.list((SubLObject)$ic142$, (SubLObject)$ic144$, (SubLObject)ConsesLow.list((SubLObject)$ic145$, var81)))))))))), (SubLObject)ConsesLow.list((SubLObject)$ic140$, (SubLObject)ConsesLow.list(var80, (SubLObject)ConsesLow.listS((SubLObject)$ic146$, var58, (SubLObject)$ic154$)), (SubLObject)ConsesLow.list((SubLObject)$ic134$, (SubLObject)ConsesLow.listS((SubLObject)$ic146$, var58, (SubLObject)$ic155$)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic135$, var64, (SubLObject)ConsesLow.list((SubLObject)$ic136$, var77, var64)), (SubLObject)ConsesLow.listS((SubLObject)$ic146$, var58, (SubLObject)$ic156$)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic135$, var66, (SubLObject)ConsesLow.list((SubLObject)$ic137$, var78)), (SubLObject)ConsesLow.listS((SubLObject)$ic146$, var58, (SubLObject)$ic157$)), (SubLObject)ConsesLow.list(var79, (SubLObject)ConsesLow.listS((SubLObject)$ic146$, var58, (SubLObject)$ic158$)), (SubLObject)ConsesLow.list((SubLObject)T, (SubLObject)ConsesLow.listS((SubLObject)$ic146$, var58, (SubLObject)$ic159$)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var55, (SubLObject)$ic102$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23084(final SubLObject var18, SubLObject var65, SubLObject var67, SubLObject var69) {
        if (var65 == UNPROVIDED) {
            var65 = (SubLObject)NIL;
        }
        if (var67 == UNPROVIDED) {
            var67 = (SubLObject)NIL;
        }
        if (var69 == UNPROVIDED) {
            var69 = (SubLObject)NIL;
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
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)ZERO_INTEGER;
        final SubLObject var81 = (SubLObject)((NIL != var67) ? module0051.time_from_now(var67) : NIL);
        SubLObject var82 = f23027(var18);
        final SubLObject var83 = $g2938$.currentBinding(var70);
        try {
            $g2938$.bind((SubLObject)NIL, var70);
            SubLObject var84 = (SubLObject)NIL;
            try {
                var70.throwStack.push($ic100$);
                final SubLObject var17_89 = $g2937$.currentBinding(var70);
                try {
                    $g2937$.bind((SubLObject)T, var70);
                    f23043(var18, (SubLObject)NIL);
                    while (NIL == $g2938$.getDynamicValue(var70) && (NIL == var65 || !var80.numGE(var65)) && (NIL == var67 || NIL == Time.time_has_arrivedP(var81)) && NIL == Functions.funcall(var71, f23015(var18))) {
                        var70.resetMultipleValues();
                        final SubLObject var85 = Functions.funcall(var72, f23015(var18));
                        final SubLObject var86 = var70.secondMultipleValue();
                        var70.resetMultipleValues();
                        f23030(var18, var86);
                        if (NIL != f23085(var85)) {
                            continue;
                        }
                        if (NIL != Functions.funcall(var73, var85)) {
                            final SubLObject var87 = f23016(var18);
                            var70.resetMultipleValues();
                            final SubLObject var88 = Functions.funcall(var74, var85, var87);
                            final SubLObject var89 = var70.secondMultipleValue();
                            var70.resetMultipleValues();
                            f23031(var18, var88);
                            if (NIL != var89) {
                                var80 = Numbers.add(var80, (SubLObject)ONE_INTEGER);
                            }
                            f23066(var85, (SubLObject)NIL);
                            if (NIL == $g2934$.getDynamicValue(var70)) {
                                continue;
                            }
                            f23086(var85);
                        }
                        else if (NIL != Functions.funcall(var75, var85, var69)) {
                            var82 = (SubLObject)T;
                            f23042(var18, (SubLObject)ConsesLow.cons(var85, f23027(var18)));
                        }
                        else {
                            final SubLObject var90 = Functions.funcall(var76, var85);
                            SubLObject var91 = (SubLObject)NIL;
                            f23043(var18, var85);
                            SubLObject var92 = var90;
                            SubLObject var93 = (SubLObject)NIL;
                            var93 = var92.first();
                            while (NIL != var92) {
                                final SubLObject var94 = Functions.funcall(var77, var85, var93);
                                if (NIL != var94) {
                                    SubLObject var48_99 = var94;
                                    SubLObject var95 = (SubLObject)NIL;
                                    var95 = var48_99.first();
                                    while (NIL != var48_99) {
                                        if (var95.eql(var85)) {
                                            var91 = (SubLObject)T;
                                        }
                                        else {
                                            f23087(var95, var85);
                                        }
                                        final SubLObject var96 = f23015(var18);
                                        SubLObject var91_102 = (SubLObject)NIL;
                                        var91_102 = Functions.funcall(var78, var95, var96);
                                        f23030(var18, var91_102);
                                        var48_99 = var48_99.rest();
                                        var95 = var48_99.first();
                                    }
                                }
                                var92 = var92.rest();
                                var93 = var92.first();
                            }
                            f23043(var18, (SubLObject)NIL);
                            f23064(var85, Sequences.nreverse(f23058(var85)));
                            if (NIL != var91 || NIL == $g2934$.getDynamicValue(var70)) {
                                continue;
                            }
                            f23086(var85);
                        }
                    }
                }
                finally {
                    $g2937$.rebind(var17_89, var70);
                }
            }
            catch (Throwable var97) {
                var84 = Errors.handleThrowable(var97, (SubLObject)$ic100$);
            }
            finally {
                var70.throwStack.pop();
            }
            if (NIL != var84) {
                var79 = (SubLObject)$ic101$;
            }
            else if (NIL != $g2938$.getDynamicValue(var70)) {
                var79 = (SubLObject)$ic160$;
            }
            else if (NIL != var65 && var80.numGE(var65)) {
                var79 = (SubLObject)$ic161$;
            }
            else if (NIL != var67 && NIL != Time.time_has_arrivedP(var81)) {
                var79 = (SubLObject)$ic162$;
            }
            else if (NIL != var82) {
                var79 = (SubLObject)$ic87$;
            }
            else {
                var79 = (SubLObject)$ic163$;
            }
        }
        finally {
            $g2938$.rebind(var83, var70);
        }
        return var79;
    }
    
    public static SubLObject f23086(final SubLObject var50) {
        final SubLThread var51 = SubLProcess.currentSubLThread();
        if (NIL != Functions.funcall($g2935$.getDynamicValue(var51), var50)) {
            Functions.funcall($g2936$.getDynamicValue(var51), var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23087(final SubLObject var49, final SubLObject var51) {
        f23063(var49, var51);
        f23062(var49, f23056(var51));
        f23065(var49, Numbers.add((SubLObject)ONE_INTEGER, f23059(var51)));
        f23064(var51, (SubLObject)ConsesLow.cons(var49, f23058(var51)));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23088(final SubLObject var50, final SubLObject var32) {
        f23067(var50, var32);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23089(final SubLObject var32) {
        final SubLObject var33 = f23075();
        f23088(var33, var32);
        f23066(var33, (SubLObject)$ic95$);
        return var33;
    }
    
    public static SubLObject f23090(final SubLObject var18) {
        final SubLObject var19 = f23089((SubLObject)NIL);
        f23062(var19, var18);
        f23063(var19, (SubLObject)NIL);
        f23064(var19, (SubLObject)NIL);
        f23065(var19, (SubLObject)ZERO_INTEGER);
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
        f23029(var18, Sequences.delete(var104, f23014(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var18;
    }
    
    public static SubLObject f23093(final SubLObject var18, final SubLObject var69) {
        final SubLObject var70 = f23023(var18);
        final SubLObject var71 = f23024(var18);
        SubLObject var72 = f23015(var18);
        final SubLObject var73 = f23027(var18);
        SubLObject var74 = (SubLObject)NIL;
        SubLObject var75 = (SubLObject)NIL;
        SubLObject var76 = var73;
        SubLObject var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            if (NIL != Functions.funcall(var71, var77, var69)) {
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
        var77 = (SubLObject)NIL;
        var77 = var76.first();
        while (NIL != var76) {
            var72 = Functions.funcall(var70, var77, var72);
            var76 = var76.rest();
            var77 = var76.first();
        }
        f23030(var18, var72);
        return var18;
    }
    
    public static SubLObject f23078(final SubLObject var50) {
        if (NIL == f23085(var50)) {
            return f23060(var50);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23094(final SubLObject var50, final SubLObject var109) {
        if (NIL == f23085(var50)) {
            f23066(var50, var109);
        }
        return var109;
    }
    
    public static SubLObject f23085(final SubLObject var50) {
        assert NIL != f23055(var50) : var50;
        return Equality.eq(f23060(var50), (SubLObject)$ic164$);
    }
    
    public static SubLObject f23095(final SubLObject var50) {
        if (NIL != var50 && NIL == f23085(var50)) {
            f23066(var50, (SubLObject)$ic164$);
            SubLObject var51 = f23058(var50);
            SubLObject var52 = (SubLObject)NIL;
            var52 = var51.first();
            while (NIL != var51) {
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
        if (NIL != f23055(var42)) {
            return (SubLObject)ConsesLow.cons(var42, f23097(f23057(var42)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23098(final SubLObject var111, final SubLObject var112) {
        if (NIL == var112) {
            return (SubLObject)NIL;
        }
        return Numbers.max((SubLObject)ZERO_INTEGER, Numbers.subtract(var112, Numbers.subtract(Time.get_universal_time(), var111)));
    }
    
    public static SubLObject f23099(final SubLObject var18) {
        assert NIL != f23013(var18) : var18;
        SubLObject var19 = (SubLObject)ZERO_INTEGER;
        SubLObject var20 = f23014(var18);
        SubLObject var21 = (SubLObject)NIL;
        var21 = var20.first();
        while (NIL != var20) {
            var19 = Numbers.add(var19, f23100(var21));
            var20 = var20.rest();
            var21 = var20.first();
        }
        return var19;
    }
    
    public static SubLObject f23100(final SubLObject var42) {
        if (NIL != f23055(var42)) {
            SubLObject var43 = (SubLObject)ONE_INTEGER;
            SubLObject var44 = f23058(var42);
            SubLObject var45 = (SubLObject)NIL;
            var45 = var44.first();
            while (NIL != var44) {
                var43 = Numbers.add(var43, f23100(var45));
                var44 = var44.rest();
                var45 = var44.first();
            }
            return var43;
        }
        return (SubLObject)ZERO_INTEGER;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23102() {
        $g2928$ = SubLFiles.defconstant("S#25787", (SubLObject)$ic0$);
        $g2929$ = SubLFiles.deflexical("S#25788", (SubLObject)NIL);
        $g2930$ = SubLFiles.deflexical("S#25789", Locks.make_lock((SubLObject)$ic60$));
        $g2931$ = SubLFiles.defconstant("S#25790", (SubLObject)$ic62$);
        $g2932$ = SubLFiles.deflexical("S#25791", (SubLObject)NIL);
        $g2933$ = SubLFiles.deflexical("S#25792", Locks.make_lock((SubLObject)$ic94$));
        $g2934$ = SubLFiles.defparameter("S#25793", (SubLObject)T);
        $g2935$ = SubLFiles.defparameter("S#25794", (SubLObject)$ic96$);
        $g2936$ = SubLFiles.defparameter("S#25795", (SubLObject)$ic97$);
        $g2937$ = SubLFiles.defparameter("S#25796", (SubLObject)NIL);
        $g2938$ = SubLFiles.defparameter("S#25797", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23103() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2928$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Structures.def_csetf((SubLObject)$ic17$, (SubLObject)$ic18$);
        Structures.def_csetf((SubLObject)$ic19$, (SubLObject)$ic20$);
        Structures.def_csetf((SubLObject)$ic21$, (SubLObject)$ic22$);
        Structures.def_csetf((SubLObject)$ic23$, (SubLObject)$ic24$);
        Structures.def_csetf((SubLObject)$ic25$, (SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Structures.def_csetf((SubLObject)$ic29$, (SubLObject)$ic30$);
        Structures.def_csetf((SubLObject)$ic31$, (SubLObject)$ic32$);
        Structures.def_csetf((SubLObject)$ic33$, (SubLObject)$ic34$);
        Structures.def_csetf((SubLObject)$ic35$, (SubLObject)$ic36$);
        Structures.def_csetf((SubLObject)$ic37$, (SubLObject)$ic38$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2928$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic59$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2931$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic70$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic71$);
        Structures.def_csetf((SubLObject)$ic72$, (SubLObject)$ic73$);
        Structures.def_csetf((SubLObject)$ic74$, (SubLObject)$ic75$);
        Structures.def_csetf((SubLObject)$ic76$, (SubLObject)$ic77$);
        Structures.def_csetf((SubLObject)$ic78$, (SubLObject)$ic79$);
        Structures.def_csetf((SubLObject)$ic80$, (SubLObject)$ic81$);
        Structures.def_csetf((SubLObject)$ic82$, (SubLObject)$ic83$);
        Equality.identity((SubLObject)$ic62$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2931$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic90$));
        module0012.f419((SubLObject)$ic69$);
        return (SubLObject)NIL;
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
        $g2928$ = null;
        $g2929$ = null;
        $g2930$ = null;
        $g2931$ = null;
        $g2932$ = null;
        $g2933$ = null;
        $g2934$ = null;
        $g2935$ = null;
        $g2936$ = null;
        $g2937$ = null;
        $g2938$ = null;
        $ic0$ = makeSymbol("S#25695", "CYC");
        $ic1$ = makeSymbol("S#25696", "CYC");
        $ic2$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#720", "CYC"), makeSymbol("S#25798", "CYC"), makeSymbol("S#25799", "CYC"), makeSymbol("S#25800", "CYC"), makeSymbol("S#25801", "CYC"), makeSymbol("S#25802", "CYC"), makeSymbol("S#25803", "CYC"), makeSymbol("S#25804", "CYC"), makeSymbol("S#25805", "CYC"), makeSymbol("S#25806", "CYC"), makeSymbol("S#25807", "CYC"), makeSymbol("S#3266", "CYC"), makeSymbol("S#25808", "CYC"), makeSymbol("S#25809", "CYC"), makeSymbol("S#25810", "CYC") });
        $ic3$ = ConsesLow.list(new SubLObject[] { makeKeyword("TREE"), makeKeyword("LEAVES"), makeKeyword("GOALS"), makeKeyword("NO-LEAVES-P-FUNC"), makeKeyword("NEXT-NODE-FUNC"), makeKeyword("GOAL-P-FUNC"), makeKeyword("ADD-GOAL-FUNC"), makeKeyword("OPTIONS-FUNC"), makeKeyword("EXPAND-FUNC"), makeKeyword("ADD-NODE-FUNC"), makeKeyword("TOO-DEEP-FUNC"), makeKeyword("STATE"), makeKeyword("PRINT-FUNC"), makeKeyword("LIMBO"), makeKeyword("CURRENT-NODE") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#25700", "CYC"), makeSymbol("S#25701", "CYC"), makeSymbol("S#25702", "CYC"), makeSymbol("S#25703", "CYC"), makeSymbol("S#25704", "CYC"), makeSymbol("S#25705", "CYC"), makeSymbol("S#25706", "CYC"), makeSymbol("S#25707", "CYC"), makeSymbol("S#25708", "CYC"), makeSymbol("S#25709", "CYC"), makeSymbol("S#25710", "CYC"), makeSymbol("S#25711", "CYC"), makeSymbol("S#25712", "CYC"), makeSymbol("S#25713", "CYC"), makeSymbol("S#25714", "CYC") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#25715", "CYC"), makeSymbol("S#25716", "CYC"), makeSymbol("S#25717", "CYC"), makeSymbol("S#25718", "CYC"), makeSymbol("S#25719", "CYC"), makeSymbol("S#25720", "CYC"), makeSymbol("S#25721", "CYC"), makeSymbol("S#25722", "CYC"), makeSymbol("S#25723", "CYC"), makeSymbol("S#25724", "CYC"), makeSymbol("S#25725", "CYC"), makeSymbol("S#25726", "CYC"), makeSymbol("S#25727", "CYC"), makeSymbol("S#25728", "CYC"), makeSymbol("S#25729", "CYC") });
        $ic6$ = makeSymbol("S#25733", "CYC");
        $ic7$ = makeSymbol("S#25699", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#25696", "CYC"));
        $ic9$ = makeSymbol("S#25700", "CYC");
        $ic10$ = makeSymbol("S#25715", "CYC");
        $ic11$ = makeSymbol("S#25701", "CYC");
        $ic12$ = makeSymbol("S#25716", "CYC");
        $ic13$ = makeSymbol("S#25702", "CYC");
        $ic14$ = makeSymbol("S#25717", "CYC");
        $ic15$ = makeSymbol("S#25703", "CYC");
        $ic16$ = makeSymbol("S#25718", "CYC");
        $ic17$ = makeSymbol("S#25704", "CYC");
        $ic18$ = makeSymbol("S#25719", "CYC");
        $ic19$ = makeSymbol("S#25705", "CYC");
        $ic20$ = makeSymbol("S#25720", "CYC");
        $ic21$ = makeSymbol("S#25706", "CYC");
        $ic22$ = makeSymbol("S#25721", "CYC");
        $ic23$ = makeSymbol("S#25707", "CYC");
        $ic24$ = makeSymbol("S#25722", "CYC");
        $ic25$ = makeSymbol("S#25708", "CYC");
        $ic26$ = makeSymbol("S#25723", "CYC");
        $ic27$ = makeSymbol("S#25709", "CYC");
        $ic28$ = makeSymbol("S#25724", "CYC");
        $ic29$ = makeSymbol("S#25710", "CYC");
        $ic30$ = makeSymbol("S#25725", "CYC");
        $ic31$ = makeSymbol("S#25711", "CYC");
        $ic32$ = makeSymbol("S#25726", "CYC");
        $ic33$ = makeSymbol("S#25712", "CYC");
        $ic34$ = makeSymbol("S#25727", "CYC");
        $ic35$ = makeSymbol("S#25713", "CYC");
        $ic36$ = makeSymbol("S#25728", "CYC");
        $ic37$ = makeSymbol("S#25714", "CYC");
        $ic38$ = makeSymbol("S#25729", "CYC");
        $ic39$ = makeKeyword("TREE");
        $ic40$ = makeKeyword("LEAVES");
        $ic41$ = makeKeyword("GOALS");
        $ic42$ = makeKeyword("NO-LEAVES-P-FUNC");
        $ic43$ = makeKeyword("NEXT-NODE-FUNC");
        $ic44$ = makeKeyword("GOAL-P-FUNC");
        $ic45$ = makeKeyword("ADD-GOAL-FUNC");
        $ic46$ = makeKeyword("OPTIONS-FUNC");
        $ic47$ = makeKeyword("EXPAND-FUNC");
        $ic48$ = makeKeyword("ADD-NODE-FUNC");
        $ic49$ = makeKeyword("TOO-DEEP-FUNC");
        $ic50$ = makeKeyword("STATE");
        $ic51$ = makeKeyword("PRINT-FUNC");
        $ic52$ = makeKeyword("LIMBO");
        $ic53$ = makeKeyword("CURRENT-NODE");
        $ic54$ = makeString("Invalid slot ~S for construction function");
        $ic55$ = makeKeyword("BEGIN");
        $ic56$ = makeSymbol("S#25730", "CYC");
        $ic57$ = makeKeyword("SLOT");
        $ic58$ = makeKeyword("END");
        $ic59$ = makeSymbol("S#25732", "CYC");
        $ic60$ = makeString("SEARCH-STRUC resource lock");
        $ic61$ = makeKeyword("FREE");
        $ic62$ = makeSymbol("S#25697", "CYC");
        $ic63$ = makeSymbol("S#25698", "CYC");
        $ic64$ = makeInteger(151);
        $ic65$ = ConsesLow.list((SubLObject)makeSymbol("SEARCH"), (SubLObject)makeSymbol("S#10127", "CYC"), (SubLObject)makeSymbol("S#9176", "CYC"), (SubLObject)makeSymbol("S#25811", "CYC"), (SubLObject)makeSymbol("S#6511", "CYC"), (SubLObject)makeSymbol("S#3266", "CYC"));
        $ic66$ = ConsesLow.list((SubLObject)makeKeyword("SEARCH"), (SubLObject)makeKeyword("PARENT"), (SubLObject)makeKeyword("CHILDREN"), (SubLObject)makeKeyword("DEPTH"), (SubLObject)makeKeyword("OPTIONS"), (SubLObject)makeKeyword("STATE"));
        $ic67$ = ConsesLow.list((SubLObject)makeSymbol("S#25741", "CYC"), (SubLObject)makeSymbol("S#25742", "CYC"), (SubLObject)makeSymbol("S#25743", "CYC"), (SubLObject)makeSymbol("S#25744", "CYC"), (SubLObject)makeSymbol("S#25745", "CYC"), (SubLObject)makeSymbol("S#25746", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)makeSymbol("S#25747", "CYC"), (SubLObject)makeSymbol("S#25748", "CYC"), (SubLObject)makeSymbol("S#25749", "CYC"), (SubLObject)makeSymbol("S#25750", "CYC"), (SubLObject)makeSymbol("S#25751", "CYC"), (SubLObject)makeSymbol("S#25752", "CYC"));
        $ic69$ = makeSymbol("S#25756", "CYC");
        $ic70$ = makeSymbol("S#25740", "CYC");
        $ic71$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#25698", "CYC"));
        $ic72$ = makeSymbol("S#25741", "CYC");
        $ic73$ = makeSymbol("S#25747", "CYC");
        $ic74$ = makeSymbol("S#25742", "CYC");
        $ic75$ = makeSymbol("S#25748", "CYC");
        $ic76$ = makeSymbol("S#25743", "CYC");
        $ic77$ = makeSymbol("S#25749", "CYC");
        $ic78$ = makeSymbol("S#25744", "CYC");
        $ic79$ = makeSymbol("S#25750", "CYC");
        $ic80$ = makeSymbol("S#25745", "CYC");
        $ic81$ = makeSymbol("S#25751", "CYC");
        $ic82$ = makeSymbol("S#25746", "CYC");
        $ic83$ = makeSymbol("S#25752", "CYC");
        $ic84$ = makeKeyword("SEARCH");
        $ic85$ = makeKeyword("PARENT");
        $ic86$ = makeKeyword("CHILDREN");
        $ic87$ = makeKeyword("DEPTH");
        $ic88$ = makeKeyword("OPTIONS");
        $ic89$ = makeSymbol("S#25753", "CYC");
        $ic90$ = makeSymbol("S#25755", "CYC");
        $ic91$ = makeString("#<");
        $ic92$ = makeKeyword("STREAM");
        $ic93$ = makeKeyword("BASE");
        $ic94$ = makeString("SEARCH-NODE resource lock");
        $ic95$ = makeKeyword("UNDETERMINED");
        $ic96$ = makeSymbol("S#25763", "CYC");
        $ic97$ = makeSymbol("S#25764", "CYC");
        $ic98$ = makeString("So don't");
        $ic99$ = makeString("Cannot reclaim strange node ~S");
        $ic100$ = makeKeyword("ABORT-GENERIC-SEARCH");
        $ic101$ = makeKeyword("ABORT");
        $ic102$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeSymbol("S#25812", "CYC"), (SubLObject)makeSymbol("SEARCH"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#25813", "CYC"), (SubLObject)makeSymbol("S#25814", "CYC"), (SubLObject)makeSymbol("S#25815", "CYC")), makeSymbol("S#25800", "CYC"), makeSymbol("S#25801", "CYC"), makeSymbol("S#25802", "CYC"), makeSymbol("S#25803", "CYC"), makeSymbol("S#25807", "CYC"), makeSymbol("S#25804", "CYC"), makeSymbol("S#25805", "CYC"), makeSymbol("S#25806", "CYC") });
        $ic103$ = ConsesLow.list((SubLObject)makeKeyword("NUMBER-CUT"), (SubLObject)makeKeyword("TIME-CUT"), (SubLObject)makeKeyword("DEPTH-CUT"));
        $ic104$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic105$ = makeKeyword("NUMBER-CUT");
        $ic106$ = makeKeyword("TIME-CUT");
        $ic107$ = makeKeyword("DEPTH-CUT");
        $ic108$ = makeUninternedSymbol("US#342D252");
        $ic109$ = makeUninternedSymbol("US#326A0D5");
        $ic110$ = makeUninternedSymbol("US#51F66");
        $ic111$ = makeUninternedSymbol("US#79B62C3");
        $ic112$ = makeUninternedSymbol("US#11670C1");
        $ic113$ = makeUninternedSymbol("US#72658E4");
        $ic114$ = makeUninternedSymbol("US#666CFA");
        $ic115$ = makeUninternedSymbol("US#72591CE");
        $ic116$ = makeUninternedSymbol("US#58F72");
        $ic117$ = makeUninternedSymbol("US#331DF5E");
        $ic118$ = makeUninternedSymbol("US#151DF5F");
        $ic119$ = makeUninternedSymbol("US#42B0BDE");
        $ic120$ = makeUninternedSymbol("US#7859547");
        $ic121$ = makeUninternedSymbol("US#78597DF");
        $ic122$ = makeUninternedSymbol("US#782560");
        $ic123$ = makeSymbol("CLET");
        $ic124$ = ConsesLow.list((SubLObject)ZERO_INTEGER);
        $ic125$ = makeSymbol("FIF");
        $ic126$ = makeSymbol("TIME-FROM-NOW");
        $ic127$ = ConsesLow.list((SubLObject)NIL);
        $ic128$ = ConsesLow.list((SubLObject)makeSymbol("S#25797", "CYC"), (SubLObject)NIL);
        $ic129$ = makeSymbol("CCATCH");
        $ic130$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25796", "CYC"), (SubLObject)T));
        $ic131$ = makeSymbol("CSETF");
        $ic132$ = makeSymbol("UNTIL");
        $ic133$ = makeSymbol("COR");
        $ic134$ = makeSymbol("S#25797", "CYC");
        $ic135$ = makeSymbol("CAND");
        $ic136$ = makeSymbol(">=");
        $ic137$ = makeSymbol("TIME-HAS-ARRIVED?");
        $ic138$ = makeSymbol("S#520", "CYC");
        $ic139$ = makeSymbol("CMULTIPLE-VALUE-BIND");
        $ic140$ = makeSymbol("PCOND");
        $ic141$ = makeSymbol("S#25780", "CYC");
        $ic142$ = makeSymbol("PWHEN");
        $ic143$ = makeSymbol("CINC");
        $ic144$ = makeSymbol("S#25793", "CYC");
        $ic145$ = makeSymbol("S#25769", "CYC");
        $ic146$ = makeSymbol("CSETQ");
        $ic147$ = ConsesLow.list((SubLObject)T);
        $ic148$ = makeSymbol("CPUSH");
        $ic149$ = makeSymbol("CDOLIST");
        $ic150$ = makeSymbol("PIF");
        $ic151$ = makeSymbol("S#25770", "CYC");
        $ic152$ = makeSymbol("NREVERSE");
        $ic153$ = makeSymbol("PUNLESS");
        $ic154$ = ConsesLow.list((SubLObject)makeKeyword("ABORT"));
        $ic155$ = ConsesLow.list((SubLObject)makeKeyword("INTERRUPT"));
        $ic156$ = ConsesLow.list((SubLObject)makeKeyword("NUMBER"));
        $ic157$ = ConsesLow.list((SubLObject)makeKeyword("TIME"));
        $ic158$ = ConsesLow.list((SubLObject)makeKeyword("DEPTH"));
        $ic159$ = ConsesLow.list((SubLObject)makeKeyword("EXHAUST"));
        $ic160$ = makeKeyword("INTERRUPT");
        $ic161$ = makeKeyword("NUMBER");
        $ic162$ = makeKeyword("TIME");
        $ic163$ = makeKeyword("EXHAUST");
        $ic164$ = makeKeyword("DOOMED");
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
        public static final SubLStructDeclNative structDecl;
        
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
            return (SstructDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX25695_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$tree", "$leaves", "$goals", "$no_leaves_p_func", "$next_node_func", "$goal_p_func", "$add_goal_func", "$options_func", "$expand_func", "$add_node_func", "$too_deep_func", "$state", "$print_func", "$limbo", "$current_node" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f23013$UnaryFunction extends UnaryFunction
    {
        public $f23013$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25696"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f23013(var3);
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
        public static final SubLStructDeclNative structDecl;
        
        public $sX25697_native() {
            this.$search = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$children = (SubLObject)CommonSymbols.NIL;
            this.$depth = (SubLObject)CommonSymbols.NIL;
            this.$options = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX25697_native.class, $ic62$, $ic63$, $ic65$, $ic66$, new String[] { "$search", "$parent", "$children", "$depth", "$options", "$state" }, $ic67$, $ic68$, $ic69$);
        }
    }
    
    public static final class $f23055$UnaryFunction extends UnaryFunction
    {
        public $f23055$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25698"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f23055(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 497 ms
	
	Decompiled with Procyon 0.5.32.
*/