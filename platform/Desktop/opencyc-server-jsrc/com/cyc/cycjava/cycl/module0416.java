package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0416 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0416";
    public static final String myFingerPrint = "aaf86d97ff2ebb19888e68092a339d910bd2c612fe6f0628e3ee93bfc6e15fd5";
    private static SubLSymbol $g3400$;
    private static SubLSymbol $g3401$;
    public static SubLSymbol $g3402$;
    private static SubLSymbol $g3403$;
    private static SubLSymbol $g3404$;
    private static SubLSymbol $g3405$;
    private static SubLSymbol $g3406$;
    private static SubLSymbol $g3407$;
    private static SubLSymbol $g3408$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
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
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLInteger $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLInteger $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLList $ic82$;
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
    private static final SubLList $ic98$;
    private static final SubLList $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLString $ic101$;
    private static final SubLSymbol $ic102$;
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
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLString $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLList $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    
    
    public static SubLObject f29089() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0416.$g3400$.getDynamicValue(var1);
    }
    
    public static SubLObject f29090(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        module0416.$g3401$.setDynamicValue((SubLObject)ConsesLow.cons(var2, module0416.$g3401$.getDynamicValue(var3)), var3);
        return var2;
    }
    
    public static SubLObject f29091() {
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29092(final SubLObject var3, final SubLObject var4) {
        compatibility.default_struct_print_function(var3, var4, (SubLObject)module0416.ZERO_INTEGER);
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29093(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX32270_native.class) ? module0416.T : module0416.NIL);
    }
    
    public static SubLObject f29094(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f29095(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f29096(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f29097(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField5();
    }
    
    public static SubLObject f29098(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField6();
    }
    
    public static SubLObject f29099(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField7();
    }
    
    public static SubLObject f29100(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField8();
    }
    
    public static SubLObject f29101(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField9();
    }
    
    public static SubLObject f29102(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField10();
    }
    
    public static SubLObject f29103(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField11();
    }
    
    public static SubLObject f29104(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField12();
    }
    
    public static SubLObject f29105(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField13();
    }
    
    public static SubLObject f29106(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField14();
    }
    
    public static SubLObject f29107(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField15();
    }
    
    public static SubLObject f29108(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField16();
    }
    
    public static SubLObject f29109(final SubLObject var3) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.getField17();
    }
    
    public static SubLObject f29110(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f29111(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f29112(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f29113(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField5(var6);
    }
    
    public static SubLObject f29114(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField6(var6);
    }
    
    public static SubLObject f29115(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField7(var6);
    }
    
    public static SubLObject f29116(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField8(var6);
    }
    
    public static SubLObject f29117(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField9(var6);
    }
    
    public static SubLObject f29118(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField10(var6);
    }
    
    public static SubLObject f29119(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField11(var6);
    }
    
    public static SubLObject f29120(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField12(var6);
    }
    
    public static SubLObject f29121(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField13(var6);
    }
    
    public static SubLObject f29122(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField14(var6);
    }
    
    public static SubLObject f29123(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField15(var6);
    }
    
    public static SubLObject f29124(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField16(var6);
    }
    
    public static SubLObject f29125(final SubLObject var3, final SubLObject var6) {
        assert module0416.NIL != f29093(var3) : var3;
        return var3.setField17(var6);
    }
    
    public static SubLObject f29126(SubLObject var7) {
        if (var7 == module0416.UNPROVIDED) {
            var7 = (SubLObject)module0416.NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX32270_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)module0416.NIL, var9 = var7; module0416.NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)module0416.$ic42$)) {
                f29110(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic43$)) {
                f29111(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic44$)) {
                f29112(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic45$)) {
                f29113(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic46$)) {
                f29114(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic47$)) {
                f29115(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic48$)) {
                f29116(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic49$)) {
                f29117(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic50$)) {
                f29118(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic51$)) {
                f29119(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic52$)) {
                f29120(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic53$)) {
                f29121(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic54$)) {
                f29122(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic55$)) {
                f29123(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic56$)) {
                f29124(var8, var11);
            }
            else if (var12.eql((SubLObject)module0416.$ic57$)) {
                f29125(var8, var11);
            }
            else {
                Errors.error((SubLObject)module0416.$ic58$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f29127(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic59$, (SubLObject)module0416.$ic60$, (SubLObject)module0416.SIXTEEN_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic42$, f29094(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic43$, f29095(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic44$, f29096(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic45$, f29097(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic46$, f29098(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic47$, f29099(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic48$, f29100(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic49$, f29101(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic50$, f29102(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic51$, f29103(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic52$, f29104(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic53$, f29105(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic54$, f29106(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic55$, f29107(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic56$, f29108(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic61$, (SubLObject)module0416.$ic57$, f29109(var13));
        Functions.funcall(var14, var13, (SubLObject)module0416.$ic62$, (SubLObject)module0416.$ic60$, (SubLObject)module0416.SIXTEEN_INTEGER);
        return var13;
    }
    
    public static SubLObject f29128(final SubLObject var13, final SubLObject var14) {
        return f29127(var13, var14);
    }
    
    public static SubLObject f29129(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29094(var15);
    }
    
    public static SubLObject f29130(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29095(var15);
    }
    
    public static SubLObject f29131(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29096(var15);
    }
    
    public static SubLObject f29132(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29097(var15);
    }
    
    public static SubLObject f29133(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29098(var15);
    }
    
    public static SubLObject f29134(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29099(var15);
    }
    
    public static SubLObject f29135(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29100(var15);
    }
    
    public static SubLObject f29136(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29101(var15);
    }
    
    public static SubLObject f29137(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29102(var15);
    }
    
    public static SubLObject f29138(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29103(var15);
    }
    
    public static SubLObject f29139(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29104(var15);
    }
    
    public static SubLObject f29140(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29105(var15);
    }
    
    public static SubLObject f29141(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29106(var15);
    }
    
    public static SubLObject f29142(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29107(var15);
    }
    
    public static SubLObject f29143(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29108(var15);
    }
    
    public static SubLObject f29144(final SubLObject var15) {
        assert module0416.NIL != f29093(var15) : var15;
        return f29109(var15);
    }
    
    public static SubLObject f29145(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0416.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0416.$ic64$), f29131(var16), (SubLObject)module0416.UNPROVIDED) || module0416.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0416.$ic64$), f29136(var16), (SubLObject)module0416.UNPROVIDED));
    }
    
    public static SubLObject f29146(final SubLObject var16) {
        return Sequences.remove_duplicates(ConsesLow.append(module0205.f13183(f29131(var16), (SubLObject)module0416.$ic64$, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED), module0205.f13183(f29136(var16), (SubLObject)module0416.$ic64$, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED)), (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED);
    }
    
    public static SubLObject f29147(final SubLObject var15) {
        final SubLObject var16 = f29135(var15);
        final SubLObject var17 = f29148(var16);
        SubLObject var18 = (SubLObject)module0416.NIL;
        if (module0416.NIL == var17 && var16.isFunction()) {
            Errors.error((SubLObject)module0416.$ic65$, var16);
        }
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic42$, f29129(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic43$, f29130(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic44$, f29131(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic45$, f29132(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic46$, f29133(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic47$, f29134(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic48$, var17);
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic49$, f29136(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic50$, f29137(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic51$, f29138(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic52$, f29139(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic53$, f29140(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic54$, f29141(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic55$, f29142(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic56$, f29143(var15));
        var18 = conses_high.putf(var18, (SubLObject)module0416.$ic57$, f29144(var15));
        return var18;
    }
    
    public static SubLObject f29148(final SubLObject var18) {
        if (var18.isSymbol()) {
            return var18;
        }
        SubLObject var19 = (SubLObject)module0416.NIL;
        var19 = module0030.f1592(var18);
        if (module0416.NIL != module0035.sublisp_boolean(var19)) {
            return var19;
        }
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29149(final SubLObject var19) {
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic42$, var19);
        final SubLObject var21 = (SubLObject)((module0416.NIL != var20) ? conses_high.cadr(var20) : module0416.NIL);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic43$, var19);
        final SubLObject var23 = (SubLObject)((module0416.NIL != var22) ? conses_high.cadr(var22) : module0416.NIL);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic44$, var19);
        final SubLObject var25 = (SubLObject)((module0416.NIL != var24) ? conses_high.cadr(var24) : module0416.NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic45$, var19);
        final SubLObject var27 = (SubLObject)((module0416.NIL != var26) ? conses_high.cadr(var26) : module0416.NIL);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic66$, var19);
        final SubLObject var29 = (SubLObject)((module0416.NIL != var28) ? conses_high.cadr(var28) : module0416.NIL);
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic47$, var19);
        final SubLObject var31 = (SubLObject)((module0416.NIL != var30) ? conses_high.cadr(var30) : module0416.NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic48$, var19);
        final SubLObject var33 = (SubLObject)((module0416.NIL != var32) ? conses_high.cadr(var32) : module0416.NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic49$, var19);
        final SubLObject var35 = (SubLObject)((module0416.NIL != var34) ? conses_high.cadr(var34) : module0416.NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic50$, var19);
        final SubLObject var37 = (SubLObject)((module0416.NIL != var36) ? conses_high.cadr(var36) : module0416.NIL);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic51$, var19);
        final SubLObject var39 = (SubLObject)((module0416.NIL != var38) ? conses_high.cadr(var38) : module0416.NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic52$, var19);
        final SubLObject var41 = (SubLObject)((module0416.NIL != var40) ? conses_high.cadr(var40) : module0416.NIL);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic53$, var19);
        final SubLObject var43 = (SubLObject)((module0416.NIL != var42) ? conses_high.cadr(var42) : module0416.NIL);
        final SubLObject var44 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic54$, var19);
        final SubLObject var45 = (SubLObject)((module0416.NIL != var44) ? conses_high.cadr(var44) : module0416.NIL);
        final SubLObject var46 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic55$, var19);
        final SubLObject var47 = (SubLObject)((module0416.NIL != var46) ? conses_high.cadr(var46) : module0416.NIL);
        final SubLObject var48 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic56$, var19);
        final SubLObject var49 = (SubLObject)((module0416.NIL != var48) ? conses_high.cadr(var48) : module0416.NIL);
        final SubLObject var50 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic57$, var19);
        final SubLObject var51 = (SubLObject)((module0416.NIL != var50) ? conses_high.cadr(var50) : module0416.NIL);
        return f29150(var21, var23, var25, var27, var29, var31, var33, var35, var37, var39, var41, var43, var45, var47, var49, var51);
    }
    
    public static SubLObject f29151(final SubLObject var54, final SubLObject var4) {
        return f29152(var54, var4);
    }
    
    public static SubLObject f29152(final SubLObject var15, final SubLObject var4) {
        module0021.f1110(module0416.$g3403$.getGlobalValue(), var4);
        f29153(var15, var4);
        return var15;
    }
    
    public static SubLObject f29153(final SubLObject var15, final SubLObject var4) {
        final SubLObject var16 = f29147(var15);
        module0021.f1038(var16, var4);
        return var15;
    }
    
    public static SubLObject f29154(final SubLObject var4) {
        final SubLObject var5 = module0021.f1060(var4, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED);
        return f29149(var5);
    }
    
    public static SubLObject f29155(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f29147(var16);
        SubLObject var19 = (SubLObject)module0416.NIL;
        var19 = module0069.f4956(var16);
        final SubLObject var20 = f29147(var19);
        if (module0416.NIL == Errors.$ignore_mustsP$.getDynamicValue(var17) && module0416.NIL == module0035.f2362(var18, var20, (SubLObject)module0416.EQUALP)) {
            Errors.error((SubLObject)module0416.$ic70$, var20, var18, var16);
        }
        return var16;
    }
    
    public static SubLObject f29156(final SubLObject var24) {
        return Hashtables.gethash(var24, module0416.$g3405$.getGlobalValue(), (SubLObject)module0416.UNPROVIDED);
    }
    
    public static SubLObject f29157(final SubLObject var15) {
        final SubLObject var16 = f29129(var15);
        module0416.$g3404$.setGlobalValue(Sequences.delete(var16, module0416.$g3404$.getGlobalValue(), (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED));
        module0416.$g3404$.setGlobalValue(ConsesLow.append(module0416.$g3404$.getGlobalValue(), (SubLObject)ConsesLow.list(var16)));
        return Hashtables.sethash(var16, module0416.$g3405$.getGlobalValue(), var15);
    }
    
    public static SubLObject f29158(final SubLObject var58, final SubLObject var59) {
        SubLObject var61;
        final SubLObject var60 = var61 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0416.$ic74$);
        final SubLObject var62 = var61.rest();
        var61 = var61.first();
        SubLObject var63 = (SubLObject)module0416.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0416.$ic74$);
        var63 = var61.first();
        var61 = var61.rest();
        SubLObject var64 = (SubLObject)module0416.NIL;
        SubLObject var65 = var61;
        SubLObject var66 = (SubLObject)module0416.NIL;
        SubLObject var67_68 = (SubLObject)module0416.NIL;
        while (module0416.NIL != var65) {
            cdestructuring_bind.destructuring_bind_must_consp(var65, var60, (SubLObject)module0416.$ic74$);
            var67_68 = var65.first();
            var65 = var65.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var65, var60, (SubLObject)module0416.$ic74$);
            if (module0416.NIL == conses_high.member(var67_68, (SubLObject)module0416.$ic75$, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED)) {
                var66 = (SubLObject)module0416.T;
            }
            if (var67_68 == module0416.$ic76$) {
                var64 = var65.first();
            }
            var65 = var65.rest();
        }
        if (module0416.NIL != var66 && module0416.NIL == var64) {
            cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)module0416.$ic74$);
        }
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic77$, var61);
        final SubLObject var68 = (SubLObject)((module0416.NIL != var67) ? conses_high.cadr(var67) : module0416.NIL);
        final SubLObject var69;
        var61 = (var69 = var62);
        final SubLObject var70 = (SubLObject)module0416.$ic78$;
        return (SubLObject)ConsesLow.list((SubLObject)module0416.$ic79$, (SubLObject)ConsesLow.list(var70, (SubLObject)module0416.$ic71$, (SubLObject)module0416.$ic77$, var68), (SubLObject)ConsesLow.listS((SubLObject)module0416.$ic80$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var63, (SubLObject)ConsesLow.list((SubLObject)module0416.$ic81$, var70))), ConsesLow.append(var69, (SubLObject)module0416.NIL)));
    }
    
    public static SubLObject f29159() {
        SubLObject var72 = (SubLObject)module0416.NIL;
        SubLObject var73 = module0416.$g3404$.getGlobalValue();
        SubLObject var74 = (SubLObject)module0416.NIL;
        var74 = var73.first();
        while (module0416.NIL != var73) {
            final SubLObject var75 = f29156(var74);
            final SubLObject var24_75 = f29129(var75);
            var72 = (SubLObject)ConsesLow.cons(var24_75, var72);
            var73 = var73.rest();
            var74 = var73.first();
        }
        return Sequences.nreverse(var72);
    }
    
    public static SubLObject f29160(final SubLObject var76) {
        if (module0416.NIL != module0035.f2014(var76) && module0416.NIL != module0035.f1995(var76, (SubLObject)module0416.FIVE_INTEGER, (SubLObject)module0416.UNPROVIDED)) {
            SubLObject var77 = (SubLObject)module0416.NIL;
            SubLObject var78 = (SubLObject)module0416.NIL;
            SubLObject var79 = (SubLObject)module0416.NIL;
            SubLObject var80 = (SubLObject)module0416.NIL;
            SubLObject var81 = (SubLObject)module0416.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var76, var76, (SubLObject)module0416.$ic82$);
            var77 = var76.first();
            SubLObject var82 = var76.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var76, (SubLObject)module0416.$ic82$);
            var78 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var76, (SubLObject)module0416.$ic82$);
            var79 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var76, (SubLObject)module0416.$ic82$);
            var80 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var76, (SubLObject)module0416.$ic82$);
            var81 = var82.first();
            var82 = var82.rest();
            if (module0416.NIL == var82) {
                return (SubLObject)SubLObjectFactory.makeBoolean((module0416.$ic83$ == var77 || module0416.$ic84$ == var77 || module0416.NIL != module0202.f12660(var77)) && module0416.NIL != module0360.f23784(var78) && (module0416.NIL == var80 || module0416.NIL != module0004.f85(var80)) && (module0416.NIL == var81 || module0416.NIL != module0360.f23864(var81)));
            }
            cdestructuring_bind.cdestructuring_bind_error(var76, (SubLObject)module0416.$ic82$);
        }
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29161(final SubLObject var58, final SubLObject var59) {
        SubLObject var61;
        final SubLObject var60 = var61 = var58.rest();
        SubLObject var62 = (SubLObject)module0416.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)module0416.$ic85$);
        var62 = var61.first();
        final SubLObject var63;
        var61 = (var63 = var61.rest());
        final SubLObject var64 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic44$, var61);
        final SubLObject var65 = (SubLObject)((module0416.NIL != var64) ? conses_high.cadr(var64) : module0416.NIL);
        final SubLObject var66 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic45$, var61);
        final SubLObject var67 = (SubLObject)((module0416.NIL != var66) ? conses_high.cadr(var66) : module0416.NIL);
        final SubLObject var68 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic66$, var61);
        final SubLObject var69 = (SubLObject)((module0416.NIL != var68) ? conses_high.cadr(var68) : module0416.NIL);
        final SubLObject var70 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic86$, var61);
        final SubLObject var71 = (SubLObject)((module0416.NIL != var70) ? conses_high.cadr(var70) : module0416.$ic87$);
        final SubLObject var72 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic88$, var61);
        final SubLObject var73 = (SubLObject)((module0416.NIL != var72) ? conses_high.cadr(var72) : module0416.NIL);
        final SubLObject var74 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic43$, var61);
        final SubLObject var75 = (SubLObject)((module0416.NIL != var74) ? conses_high.cadr(var74) : module0416.NIL);
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic49$, var61);
        final SubLObject var77 = (SubLObject)((module0416.NIL != var76) ? conses_high.cadr(var76) : module0416.NIL);
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic50$, var61);
        final SubLObject var79 = (SubLObject)((module0416.NIL != var78) ? conses_high.cadr(var78) : module0416.NIL);
        final SubLObject var80 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic51$, var61);
        final SubLObject var81 = (SubLObject)((module0416.NIL != var80) ? conses_high.cadr(var80) : module0416.$ic89$);
        final SubLObject var82 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic52$, var61);
        final SubLObject var83 = (SubLObject)((module0416.NIL != var82) ? conses_high.cadr(var82) : module0416.NIL);
        final SubLObject var84 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic90$, var61);
        final SubLObject var85 = (SubLObject)((module0416.NIL != var84) ? conses_high.cadr(var84) : module0416.NIL);
        final SubLObject var86 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic91$, var61);
        final SubLObject var87 = (SubLObject)((module0416.NIL != var86) ? conses_high.cadr(var86) : module0416.NIL);
        final SubLObject var88 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic55$, var61);
        final SubLObject var89 = (SubLObject)((module0416.NIL != var88) ? conses_high.cadr(var88) : module0416.NIL);
        final SubLObject var90 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic56$, var61);
        final SubLObject var91 = (SubLObject)((module0416.NIL != var90) ? conses_high.cadr(var90) : module0416.T);
        final SubLObject var92 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic57$, var61);
        final SubLObject var93 = (SubLObject)((module0416.NIL != var92) ? conses_high.cadr(var92) : module0416.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)module0416.$ic92$, (SubLObject)ConsesLow.list((SubLObject)module0416.$ic93$, (SubLObject)ConsesLow.list((SubLObject)module0416.$ic94$, var63)), (SubLObject)ConsesLow.list(new SubLObject[] { module0416.$ic95$, var62, var75, var65, var67, var69, var71, var73, ConsesLow.list((SubLObject)module0416.$ic96$, var77), var79, var81, var83, var85, var87, var89, var91, var93 }));
    }
    
    public static SubLObject f29162(final SubLObject var24) {
        final SubLObject var25 = Hashtables.remhash(var24, module0416.$g3405$.getGlobalValue());
        module0416.$g3404$.setGlobalValue(Sequences.delete(var24, module0416.$g3404$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0416.EQ), (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED));
        return var25;
    }
    
    public static SubLObject f29163() {
        module0416.$g3404$.setGlobalValue((SubLObject)module0416.NIL);
        module0416.$g3405$.setGlobalValue(Hashtables.make_hash_table((SubLObject)module0416.$ic73$, Symbols.symbol_function((SubLObject)module0416.EQ), (SubLObject)module0416.UNPROVIDED));
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29164(final SubLObject var54) {
        return module0035.f2169(var54, module0416.$g3406$.getGlobalValue());
    }
    
    public static SubLObject f29165(final SubLObject var83) {
        assert module0416.NIL != module0035.f2327(var83) : var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var84 = (SubLObject)module0416.NIL, var84 = var83; module0416.NIL != var84; var84 = conses_high.cddr(var84)) {
            var85 = var84.first();
            var86 = conses_high.cadr(var84);
            if (module0416.NIL == f29164(var85)) {
                Errors.warn((SubLObject)module0416.$ic101$, var85, (SubLObject)module0416.$ic102$);
            }
        }
        return var83;
    }
    
    public static SubLObject f29166(final SubLObject var54) {
        return module0035.f2169(var54, module0416.$g3407$.getGlobalValue());
    }
    
    public static SubLObject f29167(final SubLObject var83) {
        assert module0416.NIL != module0035.f2327(var83) : var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var84 = (SubLObject)module0416.NIL, var84 = var83; module0416.NIL != var84; var84 = conses_high.cddr(var84)) {
            var85 = var84.first();
            var86 = conses_high.cadr(var84);
            if (module0416.NIL == f29166(var85)) {
                Errors.warn((SubLObject)module0416.$ic101$, var85, (SubLObject)module0416.$ic105$);
            }
        }
        return var83;
    }
    
    public static SubLObject f29150(final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32, final SubLObject var34, final SubLObject var18, final SubLObject var37, final SubLObject var39, final SubLObject var41, final SubLObject var43, final SubLObject var45, final SubLObject var47, final SubLObject var49, final SubLObject var51, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        assert module0416.NIL != Types.keywordp(var24) : var24;
        assert module0416.NIL != module0202.f12660(var28) : var28;
        assert module0416.NIL != module0035.f2327(var30) : var30;
        SubLObject var55;
        SubLObject var56;
        SubLObject var57;
        for (var55 = (SubLObject)module0416.NIL, var55 = var30; module0416.NIL != var55; var55 = conses_high.cddr(var55)) {
            var56 = var55.first();
            var57 = conses_high.cadr(var55);
            assert module0416.NIL != module0360.f23781(var56) : var56;
        }
        if (module0416.NIL == var18 && !module0416.areAssertionsDisabledFor(me) && module0416.NIL == module0233.f15352(var32)) {
            throw new AssertionError(var32);
        }
        if (module0416.NIL != var34 && !module0416.areAssertionsDisabledFor(me) && module0416.NIL == module0360.f23864(var34)) {
            throw new AssertionError(var34);
        }
        if (module0416.NIL != var18 && !module0416.areAssertionsDisabledFor(me) && module0416.NIL == module0004.f85(var18)) {
            throw new AssertionError(var18);
        }
        assert module0416.NIL != module0421.f29457(var26) : var26;
        assert module0416.NIL != module0035.f2015(var37) : var37;
        SubLObject var58 = var37;
        SubLObject var59 = (SubLObject)module0416.NIL;
        var59 = var58.first();
        while (module0416.NIL != var58) {
            assert module0416.NIL != f29160(var59) : var59;
            var58 = var58.rest();
            var59 = var58.first();
        }
        assert module0416.NIL != module0107.f7633(var39) : var39;
        assert module0416.NIL != module0029.f1472(var41) : var41;
        assert module0416.NIL != module0421.f29459(var43) : var43;
        if (module0416.NIL != var45 && !module0416.areAssertionsDisabledFor(me) && module0416.NIL == module0004.f105(var45)) {
            throw new AssertionError(var45);
        }
        if (module0416.NIL != var47 && !module0416.areAssertionsDisabledFor(me) && module0416.NIL == module0051.f3603(var47)) {
            throw new AssertionError(var47);
        }
        if (module0416.NIL != var49 && !module0416.areAssertionsDisabledFor(me) && module0416.NIL == Types.stringp(var49)) {
            throw new AssertionError(var49);
        }
        assert module0416.NIL != Types.booleanp(var51) : var51;
        if (module0416.NIL != var53 && !module0416.areAssertionsDisabledFor(me) && module0416.NIL == Types.keywordp(var53)) {
            throw new AssertionError(var53);
        }
        if (module0416.NIL != module0202.f12603(var28) && module0416.NIL == conses_high.getf(var30, (SubLObject)module0416.$ic122$, (SubLObject)module0416.UNPROVIDED)) {
            Errors.warn((SubLObject)module0416.$ic123$, var24);
        }
        final SubLObject var60 = f29126((SubLObject)ConsesLow.list(new SubLObject[] { module0416.$ic42$, var24, module0416.$ic43$, var26, module0416.$ic44$, var28, module0416.$ic45$, var30, module0416.$ic46$, var32, module0416.$ic47$, var34, module0416.$ic48$, var18, module0416.$ic49$, var37, module0416.$ic50$, var39, module0416.$ic51$, var41, module0416.$ic52$, var43, module0416.$ic53$, var45, module0416.$ic54$, var47, module0416.$ic55$, var49, module0416.$ic56$, var51, module0416.$ic57$, var53 }));
        f29157(var60);
        module0029.f1506(module0029.$g836$.getDynamicValue(var54), var60);
        return var60;
    }
    
    public static SubLObject f29168(final SubLObject var111) {
        SubLObject var112 = (SubLObject)module0416.NIL;
        SubLObject var113 = var111;
        SubLObject var114 = (SubLObject)module0416.NIL;
        var114 = var113.first();
        while (module0416.NIL != var113) {
            f29167(var114);
            final SubLObject var116;
            final SubLObject var115 = var116 = var114;
            final SubLObject var117 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic44$, var116);
            final SubLObject var118 = (SubLObject)((module0416.NIL != var117) ? conses_high.cadr(var117) : module0416.$ic83$);
            final SubLObject var119 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic45$, var116);
            final SubLObject var120 = (SubLObject)((module0416.NIL != var119) ? conses_high.cadr(var119) : module0416.NIL);
            final SubLObject var121 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic66$, var116);
            final SubLObject var122 = (SubLObject)((module0416.NIL != var121) ? conses_high.cadr(var121) : module0416.NIL);
            final SubLObject var123 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic88$, var116);
            final SubLObject var124 = (SubLObject)((module0416.NIL != var123) ? conses_high.cadr(var123) : module0416.NIL);
            final SubLObject var125 = cdestructuring_bind.property_list_member((SubLObject)module0416.$ic86$, var116);
            final SubLObject var126 = (SubLObject)((module0416.NIL != var125) ? conses_high.cadr(var125) : module0416.$ic87$);
            var112 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var118, var120, var122, var124, var126), var112);
            var113 = var113.rest();
            var114 = var113.first();
        }
        return Sequences.nreverse(var112);
    }
    
    public static SubLObject f29169(SubLObject var120, SubLObject var121, SubLObject var122, SubLObject var4, SubLObject var123, SubLObject var124) {
        if (var120 == module0416.UNPROVIDED) {
            var120 = (SubLObject)module0416.T;
        }
        if (var121 == module0416.UNPROVIDED) {
            var121 = (SubLObject)module0416.NIL;
        }
        if (var122 == module0416.UNPROVIDED) {
            var122 = (SubLObject)module0416.$ic124$;
        }
        if (var4 == module0416.UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var123 == module0416.UNPROVIDED) {
            var123 = module0029.$g835$.getDynamicValue();
        }
        if (var124 == module0416.UNPROVIDED) {
            var124 = (SubLObject)module0416.NIL;
        }
        final SubLObject var125 = (SubLObject)((module0416.NIL != var120) ? module0416.$ic125$ : module0416.$ic126$);
        return module0029.f1577(var4, var125, var121, var122, var123, (SubLObject)module0416.NIL, var124, (SubLObject)module0416.$ic127$, (SubLObject)module0416.NIL, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED);
    }
    
    public static SubLObject f29170(SubLObject var72, SubLObject var120, SubLObject var121, SubLObject var122, SubLObject var4, SubLObject var123, SubLObject var124) {
        if (var72 == module0416.UNPROVIDED) {
            var72 = f29159();
        }
        if (var120 == module0416.UNPROVIDED) {
            var120 = (SubLObject)module0416.T;
        }
        if (var121 == module0416.UNPROVIDED) {
            var121 = (SubLObject)module0416.NIL;
        }
        if (var122 == module0416.UNPROVIDED) {
            var122 = (SubLObject)module0416.$ic124$;
        }
        if (var4 == module0416.UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var123 == module0416.UNPROVIDED) {
            var123 = module0029.$g835$.getDynamicValue();
        }
        if (var124 == module0416.UNPROVIDED) {
            var124 = (SubLObject)module0416.NIL;
        }
        assert module0416.NIL != Types.booleanp(var120) : var120;
        assert module0416.NIL != Types.booleanp(var121) : var121;
        assert module0416.NIL != module0029.f1474(var122) : var122;
        final SubLObject var125 = (SubLObject)((module0416.NIL != var120) ? module0416.$ic125$ : module0416.$ic126$);
        final SubLObject var126 = module0035.delete_if_not((SubLObject)module0416.$ic129$, Mapping.mapcar((SubLObject)module0416.$ic130$, var72), (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED);
        return module0029.f1577(var4, var125, var121, var122, var123, (SubLObject)module0416.NIL, var124, (SubLObject)module0416.$ic127$, (SubLObject)module0416.NIL, (SubLObject)module0416.NIL, (SubLObject)module0416.NIL, var126, (SubLObject)module0416.UNPROVIDED, (SubLObject)module0416.UNPROVIDED);
    }
    
    public static SubLObject f29171(final SubLObject var24, SubLObject var120, SubLObject var127, SubLObject var128, SubLObject var122, SubLObject var4, SubLObject var123) {
        if (var120 == module0416.UNPROVIDED) {
            var120 = (SubLObject)module0416.T;
        }
        if (var127 == module0416.UNPROVIDED) {
            var127 = (SubLObject)module0416.NIL;
        }
        if (var128 == module0416.UNPROVIDED) {
            var128 = (SubLObject)module0416.NIL;
        }
        if (var122 == module0416.UNPROVIDED) {
            var122 = (SubLObject)module0416.$ic124$;
        }
        if (var4 == module0416.UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var123 == module0416.UNPROVIDED) {
            var123 = module0029.$g835$.getDynamicValue();
        }
        assert module0416.NIL != Types.keywordp(var24) : var24;
        assert module0416.NIL != module0029.f1474(var122) : var122;
        final SubLObject var129 = f29156(var24);
        if (module0416.NIL == var129) {
            Errors.error((SubLObject)module0416.$ic131$, var24);
        }
        return f29172(var129, var120, var127, var128, var122, var4, var123);
    }
    
    public static SubLObject f29172(final SubLObject var15, final SubLObject var120, final SubLObject var127, final SubLObject var128, final SubLObject var122, final SubLObject var4, final SubLObject var123) {
        final SubLThread var129 = SubLProcess.currentSubLThread();
        if (module0416.NIL == f29173(var15, var123)) {
            final SubLObject var130 = f29129(var15);
            return Values.values((SubLObject)module0416.$ic132$, module0029.f1535((SubLObject)module0416.$ic127$, var130, (SubLObject)module0416.$ic132$, (SubLObject)module0416.NIL));
        }
        if (module0416.NIL != f29145(var15)) {
            final SubLObject var130 = f29129(var15);
            return Values.values((SubLObject)module0416.$ic133$, module0029.f1535((SubLObject)module0416.$ic127$, var130, (SubLObject)module0416.$ic133$, (SubLObject)module0416.NIL));
        }
        SubLObject var131 = (SubLObject)module0416.NIL;
        SubLObject var132 = (SubLObject)module0416.NIL;
        SubLObject var133 = (SubLObject)module0416.NIL;
        SubLObject var134 = (SubLObject)module0416.NIL;
        final SubLObject var135 = module0416.$g3400$.currentBinding(var129);
        final SubLObject var136 = module0416.$g3401$.currentBinding(var129);
        final SubLObject var137 = print_high.$print_pretty$.currentBinding(var129);
        try {
            module0416.$g3400$.bind((SubLObject)module0416.T, var129);
            module0416.$g3401$.bind((SubLObject)module0416.NIL, var129);
            print_high.$print_pretty$.bind((SubLObject)module0416.NIL, var129);
            final SubLObject var138 = f29129(var15);
            final SubLObject var139 = f29131(var15);
            final SubLObject var140 = f29132(var15);
            final SubLObject var141 = f29133(var15);
            final SubLObject var142 = f29134(var15);
            final SubLObject var143 = f29135(var15);
            final SubLObject var144 = f29136(var15);
            final SubLObject var145 = f29137(var15);
            final SubLObject var146 = f29144(var15);
            SubLObject var147 = (SubLObject)module0416.NIL;
            f29174(var138, var120, var122, var4);
            var129.resetMultipleValues();
            final SubLObject var138_139 = f29175(var138, var139, var140, var145, var141, var142, var143, var120, var127, var128, module0035.sublisp_boolean(var144), var146, var122, var4);
            final SubLObject var140_141 = var129.secondMultipleValue();
            final SubLObject var142_143 = var129.thirdMultipleValue();
            var129.resetMultipleValues();
            var132 = var138_139;
            var133 = var140_141;
            final SubLObject var148;
            var147 = (var148 = var142_143);
            if (module0416.NIL != var148) {
                var131 = (SubLObject)ConsesLow.cons(var148, var131);
            }
            SubLObject var149;
            SubLObject var150;
            SubLObject var152;
            SubLObject var151;
            SubLObject var28_148;
            SubLObject var30_149;
            SubLObject var32_150;
            SubLObject var153;
            SubLObject var80_151;
            SubLObject var154;
            SubLObject var155;
            SubLObject var156;
            SubLObject var157;
            SubLObject var158;
            for (var149 = (SubLObject)module0416.NIL, var149 = var144; module0416.$ic134$ == var132 && module0416.NIL != var149; var149 = var149.rest()) {
                var150 = var149.first();
                var151 = (var152 = var150);
                var28_148 = (SubLObject)module0416.NIL;
                var30_149 = (SubLObject)module0416.NIL;
                var32_150 = (SubLObject)module0416.NIL;
                var153 = (SubLObject)module0416.NIL;
                var80_151 = (SubLObject)module0416.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)module0416.$ic82$);
                var28_148 = var152.first();
                var152 = var152.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)module0416.$ic82$);
                var30_149 = var152.first();
                var152 = var152.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)module0416.$ic82$);
                var32_150 = var152.first();
                var152 = var152.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)module0416.$ic82$);
                var153 = var152.first();
                var152 = var152.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)module0416.$ic82$);
                var80_151 = var152.first();
                var152 = var152.rest();
                if (module0416.NIL == var152) {
                    var129.resetMultipleValues();
                    var154 = f29176(var138, var147, var28_148, var30_149, var145, var32_150, var80_151, var153, var120, var127, var128, var146, var122, var4);
                    var155 = var129.secondMultipleValue();
                    var156 = var129.thirdMultipleValue();
                    var129.resetMultipleValues();
                    var132 = var154;
                    var133 = Numbers.add(var133, var155);
                    var147 = (var157 = var156);
                    if (module0416.NIL != var157) {
                        var158 = var157;
                        if (module0416.NIL == conses_high.member(var158, var131, Symbols.symbol_function((SubLObject)module0416.EQL), Symbols.symbol_function((SubLObject)module0416.IDENTITY))) {
                            var131 = (SubLObject)ConsesLow.cons(var158, var131);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var151, (SubLObject)module0416.$ic82$);
                }
            }
            if (module0416.$ic134$ == var132) {
                f29177(var132, var138, var133, var120, var122, var4);
            }
            var134 = module0029.f1535((SubLObject)module0416.$ic127$, var138, var132, var133);
            f29091();
        }
        finally {
            print_high.$print_pretty$.rebind(var137, var129);
            module0416.$g3401$.rebind(var136, var129);
            module0416.$g3400$.rebind(var135, var129);
        }
        if (module0416.NIL == var127) {
            SubLObject var159 = var131;
            SubLObject var160 = (SubLObject)module0416.NIL;
            var160 = var159.first();
            while (module0416.NIL != var159) {
                module0369.f25476(var160);
                var159 = var159.rest();
                var160 = var159.first();
            }
        }
        return Values.values(var132, var134);
    }
    
    public static SubLObject f29173(final SubLObject var15, final SubLObject var123) {
        final SubLObject var124 = f29138(var15);
        if (module0416.NIL == module0421.f29447(var124, var123)) {
            return (SubLObject)module0416.NIL;
        }
        return (SubLObject)module0416.T;
    }
    
    public static SubLObject f29176(final SubLObject var24, final SubLObject var137, SubLObject var159, SubLObject var30, final SubLObject var39, SubLObject var32, final SubLObject var80, final SubLObject var136, final SubLObject var120, final SubLObject var127, final SubLObject var128, final SubLObject var53, final SubLObject var122, final SubLObject var4) {
        if (module0416.$ic83$ == var159) {
            return f29175(var24, var137, var30, var39, var32, var80, var136, var120, var127, var128, (SubLObject)module0416.T, var53, var122, var4);
        }
        if (module0416.$ic84$ == var159) {
            var159 = module0202.f12782(module0369.f25484(var137), module0369.f25485(var137));
        }
        SubLObject var160 = var159;
        assert module0416.NIL != module0207.f13509(var160) : var160;
        if (module0416.NIL != var137) {
            final SubLObject var161 = module0369.f25421(var137);
            var160 = f29178(var161, var160);
            var32 = f29178(var161, var32);
        }
        if (module0416.$ic136$ != conses_high.getf(var30, (SubLObject)module0416.$ic137$, (SubLObject)module0416.$ic136$)) {
            return f29175(var24, var160, var30, var39, var32, var80, var136, var120, var127, var128, (SubLObject)module0416.T, var53, var122, var4);
        }
        if (module0416.NIL == var137) {
            final SubLObject var162 = (SubLObject)module0416.NIL;
            final SubLObject var163 = module0360.f23875((SubLObject)module0416.$ic138$);
            final SubLObject var164 = (SubLObject)module0416.$ic139$;
            final SubLObject var165 = (SubLObject)module0416.ZERO_INTEGER;
            final SubLObject var166 = (SubLObject)module0416.NIL;
            f29177(var164, var24, var165, var120, var122, var4);
            f29179(var4, var120, var160, var30, var136, var32, var162, var80, var163);
            return Values.values(var164, var165, var166);
        }
        final SubLObject var167 = module0369.f25421(var137);
        var30 = conses_high.putf(conses_high.copy_list(var30), (SubLObject)module0416.$ic137$, var167);
        return f29175(var24, var160, var30, var39, var32, var80, var136, var120, var127, var128, (SubLObject)module0416.T, var53, var122, var4);
    }
    
    public static SubLObject f29178(final SubLObject var160, SubLObject var28) {
        final SubLObject var161 = module0361.f24123(var160);
        if (module0416.NIL == module0065.f4772(var161, (SubLObject)module0416.$ic140$)) {
            final SubLObject var167_168 = var161;
            if (module0416.NIL == module0065.f4775(var167_168, (SubLObject)module0416.$ic140$)) {
                final SubLObject var162 = module0065.f4740(var167_168);
                final SubLObject var163 = (SubLObject)module0416.NIL;
                SubLObject var164;
                SubLObject var165;
                SubLObject var166;
                SubLObject var167;
                SubLObject var168;
                for (var164 = Sequences.length(var162), var165 = (SubLObject)module0416.NIL, var165 = (SubLObject)module0416.ZERO_INTEGER; var165.numL(var164); var165 = Numbers.add(var165, (SubLObject)module0416.ONE_INTEGER)) {
                    var166 = ((module0416.NIL != var163) ? Numbers.subtract(var164, var165, (SubLObject)module0416.ONE_INTEGER) : var165);
                    var167 = Vectors.aref(var162, var166);
                    if (module0416.NIL == module0065.f4749(var167) || module0416.NIL == module0065.f4773((SubLObject)module0416.$ic140$)) {
                        if (module0416.NIL != module0065.f4749(var167)) {
                            var167 = (SubLObject)module0416.$ic140$;
                        }
                        var168 = module0369.f25491(var167);
                        var28 = module0233.f15362(var168, var28);
                    }
                }
            }
            final SubLObject var176_177 = var161;
            if (module0416.NIL == module0065.f4777(var176_177)) {
                final SubLObject var169 = module0065.f4738(var176_177);
                SubLObject var170 = (SubLObject)module0416.NIL;
                SubLObject var171 = (SubLObject)module0416.NIL;
                final Iterator var172 = Hashtables.getEntrySetIterator(var169);
                try {
                    while (Hashtables.iteratorHasNext(var172)) {
                        final Map.Entry var173 = Hashtables.iteratorNextEntry(var172);
                        var170 = Hashtables.getEntryKey(var173);
                        var171 = Hashtables.getEntryValue(var173);
                        final SubLObject var174 = module0369.f25491(var171);
                        var28 = module0233.f15362(var174, var28);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(var172);
                }
            }
        }
        return var28;
    }
    
    public static SubLObject f29175(final SubLObject var24, final SubLObject var181, SubLObject var30, final SubLObject var39, SubLObject var32, final SubLObject var80, final SubLObject var136, final SubLObject var120, final SubLObject var127, final SubLObject var128, final SubLObject var182, final SubLObject var53, final SubLObject var122, final SubLObject var4) {
        final SubLThread var183 = SubLProcess.currentSubLThread();
        SubLObject var184 = (SubLObject)module0416.NIL;
        SubLObject var185 = (SubLObject)module0416.NIL;
        SubLObject var186 = (SubLObject)module0416.NIL;
        if (module0416.NIL != var128) {
            var30 = conses_high.putf(conses_high.copy_list(var30), (SubLObject)module0416.$ic141$, (SubLObject)module0416.T);
            var30 = module0035.f2340(var30, (SubLObject)module0416.$ic142$);
        }
        if (module0416.NIL != var127) {
            var30 = conses_high.putf(conses_high.copy_list(var30), (SubLObject)module0416.$ic143$, (SubLObject)module0416.T);
        }
        if (module0416.NIL != module0416.$g3408$.getDynamicValue(var183) && module0416.NIL != var182 && module0416.NIL == f29180(var53) && module0416.NIL == module0369.f25275(var181)) {
            final SubLObject var187 = module0409.f28519(module0360.f23793(var30));
            var30 = conses_high.putf(conses_high.copy_list(var30), (SubLObject)module0416.$ic137$, var187);
        }
        SubLObject var188 = (SubLObject)module0416.NIL;
        SubLObject var189 = (SubLObject)module0416.NIL;
        SubLObject var190 = (SubLObject)module0416.NIL;
        SubLObject var191 = (SubLObject)module0416.NIL;
        final SubLObject var192 = module0360.f23960(var30);
        SubLObject var193 = (SubLObject)module0416.ZERO_INTEGER;
        final SubLObject var194 = module0018.$g689$.currentBinding(var183);
        final SubLObject var195 = module0111.$g1406$.currentBinding(var183);
        try {
            module0018.$g689$.bind((SubLObject)module0416.NIL, var183);
            module0111.$g1406$.bind((SubLObject)module0416.NIL, var183);
            final SubLObject var196 = module0107.f7635(var39);
            final ArrayList var197 = Dynamic.extract_dynamic_values(var196);
            try {
                Dynamic.bind_dynamic_vars(var196, module0107.f7636(var39));
                if (module0416.NIL != module0369.f25275(var181)) {
                    final SubLObject var198 = Time.get_internal_real_time();
                    var183.resetMultipleValues();
                    final SubLObject var191_192 = module0409.f28521(var181, var30);
                    final SubLObject var193_194 = var183.secondMultipleValue();
                    final SubLObject var195_196 = var183.thirdMultipleValue();
                    var183.resetMultipleValues();
                    var191 = var191_192;
                    var190 = var193_194;
                    var186 = var195_196;
                    var193 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var198), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else {
                    final SubLObject var198 = Time.get_internal_real_time();
                    var183.resetMultipleValues();
                    final SubLObject var197_198 = module0409.f28506(var181, (SubLObject)module0416.NIL, var30);
                    final SubLObject var199_200 = var183.secondMultipleValue();
                    final SubLObject var201_202 = var183.thirdMultipleValue();
                    var183.resetMultipleValues();
                    var191 = var197_198;
                    var190 = var199_200;
                    var186 = var201_202;
                    var193 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var198), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
            }
            finally {
                Dynamic.rebind_dynamic_vars(var196, var197);
            }
        }
        finally {
            module0111.$g1406$.rebind(var195, var183);
            module0018.$g689$.rebind(var194, var183);
        }
        var185 = var193;
        final SubLObject var199 = var192;
        if (var199.eql((SubLObject)module0416.$ic50$)) {
            var188 = var191;
            var189 = (SubLObject)module0416.NIL;
        }
        else if (var199.eql((SubLObject)module0416.$ic144$)) {
            var188 = var191.first();
            var189 = conses_high.second(var191);
        }
        else {
            var188 = var191;
            var189 = (SubLObject)module0416.NIL;
        }
        if (module0416.NIL != var189) {
            var32 = module0233.f15362(var189, var32);
        }
        var184 = f29181((SubLObject)SubLObjectFactory.makeBoolean(module0416.NIL != f29182(var190, var80) && module0416.NIL != f29183(var136, var188, var32)));
        if (module0416.$ic139$ == var184) {
            f29177(var184, var24, var185, var120, var122, var4);
            f29179(var4, var120, var181, var30, var136, var32, var188, var80, var190);
        }
        return Values.values(var184, var185, var186);
    }
    
    public static SubLObject f29180(final SubLObject var53) {
        return Equality.eq((SubLObject)module0416.$ic145$, var53);
    }
    
    public static SubLObject f29181(final SubLObject var203) {
        if (module0416.NIL != var203) {
            return (SubLObject)module0416.$ic134$;
        }
        return (SubLObject)module0416.$ic139$;
    }
    
    public static SubLObject f29182(final SubLObject var162, final SubLObject var80) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0416.NIL == var80 || var162.equal(var80));
    }
    
    public static SubLObject f29183(final SubLObject var136, final SubLObject var161, final SubLObject var32) {
        if (module0416.NIL == var136) {
            return module0233.f15365(var161, var32);
        }
        return Functions.funcall(var136, var161, var32);
    }
    
    public static SubLObject f29174(final SubLObject var24, final SubLObject var120, final SubLObject var122, final SubLObject var4) {
        if (module0416.NIL != var120 && module0416.$ic124$ == var122) {
            PrintLow.format(var4, (SubLObject)module0416.$ic146$, var24);
            streams_high.force_output(var4);
        }
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29177(final SubLObject var163, final SubLObject var24, final SubLObject var183, final SubLObject var120, final SubLObject var122, final SubLObject var4) {
        if (module0416.NIL != var120 && module0416.$ic124$ == var122) {
            PrintLow.format(var4, (SubLObject)module0416.$ic147$, var163, var183);
        }
        if (module0416.$ic148$ == var122) {
            PrintLow.format(var4, (SubLObject)module0416.$ic149$, new SubLObject[] { var163, var183, var24, f29139(f29156(var24)) });
        }
        streams_high.force_output(var4);
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29179(final SubLObject var4, final SubLObject var120, final SubLObject var181, final SubLObject var30, final SubLObject var136, final SubLObject var32, final SubLObject var161, final SubLObject var80, final SubLObject var162) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        if (module0416.NIL != var120) {
            final SubLObject var183 = print_high.$print_pretty$.currentBinding(var182);
            try {
                print_high.$print_pretty$.bind((SubLObject)module0416.T, var182);
                PrintLow.format(var4, (SubLObject)module0416.$ic150$);
                PrintLow.format(var4, (SubLObject)module0416.$ic151$, var181);
                PrintLow.format(var4, (SubLObject)module0416.$ic152$, var30);
                if (var136.isFunctionSpec()) {
                    PrintLow.format(var4, (SubLObject)module0416.$ic153$, var136);
                }
                PrintLow.format(var4, (SubLObject)module0416.$ic154$, var161);
                PrintLow.format(var4, (SubLObject)module0416.$ic155$, var32);
                PrintLow.format(var4, (SubLObject)module0416.$ic156$, var162);
                PrintLow.format(var4, (SubLObject)module0416.$ic157$, var80);
                PrintLow.format(var4, (SubLObject)module0416.$ic158$);
                streams_high.force_output(var4);
            }
            finally {
                print_high.$print_pretty$.rebind(var183, var182);
            }
        }
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29184() {
        final SubLObject var160 = module0373.f26113();
        final SubLObject var161 = module0361.f24194(var160, (SubLObject)module0416.ZERO_INTEGER);
        return var161;
    }
    
    public static SubLObject f29185() {
        final SubLObject var157 = f29184();
        final SubLObject var158 = module0369.f25597(var157);
        final SubLObject var159 = module0369.f25606(var157);
        return Values.values(var158, var159);
    }
    
    public static SubLObject f29186() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0416.ZERO_INTEGER), f29185());
    }
    
    public static SubLObject f29187() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29089", "S#32273", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29090", "S#32274", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29091", "S#32275", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29092", "S#32276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29093", "S#2622", 1, 0, false);
        new $f29093$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29094", "S#32277", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29095", "S#32278", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29096", "S#32279", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29097", "S#32280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29098", "S#32281", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29099", "S#32282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29100", "S#32283", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29101", "S#32284", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29102", "S#32285", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29103", "S#32286", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29104", "S#32287", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29105", "S#32288", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29106", "S#32289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29107", "S#32290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29108", "S#32291", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29109", "S#32292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29110", "S#32293", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29111", "S#32294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29112", "S#32295", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29113", "S#32296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29114", "S#32297", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29115", "S#32298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29116", "S#32299", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29117", "S#32300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29118", "S#32301", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29119", "S#32302", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29120", "S#32303", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29121", "S#32304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29122", "S#32305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29123", "S#32306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29124", "S#32307", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29125", "S#32308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29126", "S#32309", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29127", "S#32310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29128", "S#32311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29129", "S#2629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29130", "S#2656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29131", "S#32312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29132", "S#32313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29133", "S#32314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29134", "S#32315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29135", "S#32316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29136", "S#32317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29137", "S#32318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29138", "S#2635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29139", "S#2642", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29140", "S#32319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29141", "S#32320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29142", "S#32321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29143", "S#2649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29144", "S#32322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29145", "S#2664", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29146", "S#2671", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29147", "S#32323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29148", "S#32324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29149", "S#32325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29151", "S#32326", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29152", "S#32327", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29153", "S#32328", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29154", "S#32329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29155", "S#32330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29156", "S#32331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29157", "S#32332", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0416", "f29158", "S#32333");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29159", "S#32334", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29160", "S#32335", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0416", "f29161", "DEFINE-INFERENCE-UNIT-TEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29162", "S#32336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29163", "S#32337", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29164", "S#32338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29165", "S#32339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29166", "S#32340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29167", "S#32341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29150", "S#32342", 16, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29168", "S#32343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29169", "RUN-ALL-INFERENCE-UNIT-TESTS", 0, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29170", "S#32344", 0, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29171", "S#32345", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29172", "S#9330", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29173", "S#32346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29176", "S#32347", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29178", "S#32348", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29175", "S#32349", 14, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29180", "S#32350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29181", "S#32351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29182", "S#32352", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29183", "S#32353", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29174", "S#32354", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29177", "S#32355", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29179", "S#32356", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29184", "S#32357", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29185", "S#32358", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0416", "f29186", "S#32359", 0, 0, false);
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29188() {
        module0416.$g3400$ = SubLFiles.defparameter("S#32360", (SubLObject)module0416.NIL);
        module0416.$g3401$ = SubLFiles.defparameter("S#32361", (SubLObject)module0416.$ic0$);
        module0416.$g3402$ = SubLFiles.defconstant("S#32362", (SubLObject)module0416.$ic1$);
        module0416.$g3403$ = SubLFiles.defconstant("S#32363", (SubLObject)module0416.$ic67$);
        module0416.$g3404$ = SubLFiles.deflexical("S#32364", (SubLObject)((module0416.NIL != Symbols.boundp((SubLObject)module0416.$ic71$)) ? module0416.$g3404$.getGlobalValue() : module0416.NIL));
        module0416.$g3405$ = SubLFiles.deflexical("S#32365", (module0416.NIL != Symbols.boundp((SubLObject)module0416.$ic72$)) ? module0416.$g3405$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)module0416.$ic73$, Symbols.symbol_function((SubLObject)module0416.EQ), (SubLObject)module0416.UNPROVIDED));
        module0416.$g3406$ = SubLFiles.deflexical("S#32366", (SubLObject)module0416.$ic99$);
        module0416.$g3407$ = SubLFiles.deflexical("S#32367", (SubLObject)module0416.$ic103$);
        module0416.$g3408$ = SubLFiles.defparameter("S#32368", (SubLObject)module0416.NIL);
        return (SubLObject)module0416.NIL;
    }
    
    public static SubLObject f29189() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0416.$g3402$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0416.$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0416.$ic9$);
        Structures.def_csetf((SubLObject)module0416.$ic10$, (SubLObject)module0416.$ic11$);
        Structures.def_csetf((SubLObject)module0416.$ic12$, (SubLObject)module0416.$ic13$);
        Structures.def_csetf((SubLObject)module0416.$ic14$, (SubLObject)module0416.$ic15$);
        Structures.def_csetf((SubLObject)module0416.$ic16$, (SubLObject)module0416.$ic17$);
        Structures.def_csetf((SubLObject)module0416.$ic18$, (SubLObject)module0416.$ic19$);
        Structures.def_csetf((SubLObject)module0416.$ic20$, (SubLObject)module0416.$ic21$);
        Structures.def_csetf((SubLObject)module0416.$ic22$, (SubLObject)module0416.$ic23$);
        Structures.def_csetf((SubLObject)module0416.$ic24$, (SubLObject)module0416.$ic25$);
        Structures.def_csetf((SubLObject)module0416.$ic26$, (SubLObject)module0416.$ic27$);
        Structures.def_csetf((SubLObject)module0416.$ic28$, (SubLObject)module0416.$ic29$);
        Structures.def_csetf((SubLObject)module0416.$ic30$, (SubLObject)module0416.$ic31$);
        Structures.def_csetf((SubLObject)module0416.$ic32$, (SubLObject)module0416.$ic33$);
        Structures.def_csetf((SubLObject)module0416.$ic34$, (SubLObject)module0416.$ic35$);
        Structures.def_csetf((SubLObject)module0416.$ic36$, (SubLObject)module0416.$ic37$);
        Structures.def_csetf((SubLObject)module0416.$ic38$, (SubLObject)module0416.$ic39$);
        Structures.def_csetf((SubLObject)module0416.$ic40$, (SubLObject)module0416.$ic41$);
        Equality.identity((SubLObject)module0416.$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0416.$g3402$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0416.$ic63$));
        module0021.f1193(module0416.$g3403$.getGlobalValue(), (SubLObject)module0416.$ic68$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0416.$g3402$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0416.$ic69$));
        module0003.f57((SubLObject)module0416.$ic71$);
        module0003.f57((SubLObject)module0416.$ic72$);
        module0001.f5((SubLObject)module0416.$ic97$, (SubLObject)module0416.$ic98$);
        module0002.f50((SubLObject)module0416.$ic93$, (SubLObject)module0416.$ic97$);
        module0002.f50((SubLObject)module0416.$ic104$, (SubLObject)module0416.$ic97$);
        module0002.f50((SubLObject)module0416.$ic95$, (SubLObject)module0416.$ic97$);
        module0002.f50((SubLObject)module0416.$ic96$, (SubLObject)module0416.$ic97$);
        return (SubLObject)module0416.NIL;
    }
    
    public void declareFunctions() {
        f29187();
    }
    
    public void initializeVariables() {
        f29188();
    }
    
    public void runTopLevelForms() {
        f29189();
    }
    
    static {
        me = (SubLFile)new module0416();
        module0416.$g3400$ = null;
        module0416.$g3401$ = null;
        module0416.$g3402$ = null;
        module0416.$g3403$ = null;
        module0416.$g3404$ = null;
        module0416.$g3405$ = null;
        module0416.$g3406$ = null;
        module0416.$g3407$ = null;
        module0416.$g3408$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic1$ = SubLObjectFactory.makeSymbol("S#32270", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#2622", "CYC");
        $ic3$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#14349", "CYC"), SubLObjectFactory.makeSymbol("S#5852", "CYC"), SubLObjectFactory.makeSymbol("S#3267", "CYC"), SubLObjectFactory.makeSymbol("S#32369", "CYC"), SubLObjectFactory.makeSymbol("S#32370", "CYC"), SubLObjectFactory.makeSymbol("S#32371", "CYC"), SubLObjectFactory.makeSymbol("S#713", "CYC"), SubLObjectFactory.makeSymbol("S#2607", "CYC"), SubLObjectFactory.makeSymbol("S#2605", "CYC"), SubLObjectFactory.makeSymbol("S#32372", "CYC"), SubLObjectFactory.makeSymbol("S#32373", "CYC"), SubLObjectFactory.makeSymbol("CREATOR"), SubLObjectFactory.makeSymbol("S#2608", "CYC"), SubLObjectFactory.makeSymbol("S#32374", "CYC") });
        $ic4$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("PROPERTIES"), SubLObjectFactory.makeKeyword("RESULT"), SubLObjectFactory.makeKeyword("HALT-REASON"), SubLObjectFactory.makeKeyword("RESULT-TEST"), SubLObjectFactory.makeKeyword("FOLLOWUPS"), SubLObjectFactory.makeKeyword("BINDINGS"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("BUG-NUMBER"), SubLObjectFactory.makeKeyword("CREATION-DATE"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?"), SubLObjectFactory.makeKeyword("SUBTYPE") });
        $ic5$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#32277", "CYC"), SubLObjectFactory.makeSymbol("S#32278", "CYC"), SubLObjectFactory.makeSymbol("S#32279", "CYC"), SubLObjectFactory.makeSymbol("S#32280", "CYC"), SubLObjectFactory.makeSymbol("S#32281", "CYC"), SubLObjectFactory.makeSymbol("S#32282", "CYC"), SubLObjectFactory.makeSymbol("S#32283", "CYC"), SubLObjectFactory.makeSymbol("S#32284", "CYC"), SubLObjectFactory.makeSymbol("S#32285", "CYC"), SubLObjectFactory.makeSymbol("S#32286", "CYC"), SubLObjectFactory.makeSymbol("S#32287", "CYC"), SubLObjectFactory.makeSymbol("S#32288", "CYC"), SubLObjectFactory.makeSymbol("S#32289", "CYC"), SubLObjectFactory.makeSymbol("S#32290", "CYC"), SubLObjectFactory.makeSymbol("S#32291", "CYC"), SubLObjectFactory.makeSymbol("S#32292", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#32293", "CYC"), SubLObjectFactory.makeSymbol("S#32294", "CYC"), SubLObjectFactory.makeSymbol("S#32295", "CYC"), SubLObjectFactory.makeSymbol("S#32296", "CYC"), SubLObjectFactory.makeSymbol("S#32297", "CYC"), SubLObjectFactory.makeSymbol("S#32298", "CYC"), SubLObjectFactory.makeSymbol("S#32299", "CYC"), SubLObjectFactory.makeSymbol("S#32300", "CYC"), SubLObjectFactory.makeSymbol("S#32301", "CYC"), SubLObjectFactory.makeSymbol("S#32302", "CYC"), SubLObjectFactory.makeSymbol("S#32303", "CYC"), SubLObjectFactory.makeSymbol("S#32304", "CYC"), SubLObjectFactory.makeSymbol("S#32305", "CYC"), SubLObjectFactory.makeSymbol("S#32306", "CYC"), SubLObjectFactory.makeSymbol("S#32307", "CYC"), SubLObjectFactory.makeSymbol("S#32308", "CYC") });
        $ic7$ = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic8$ = SubLObjectFactory.makeSymbol("S#32276", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#2622", "CYC"));
        $ic10$ = SubLObjectFactory.makeSymbol("S#32277", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#32293", "CYC");
        $ic12$ = SubLObjectFactory.makeSymbol("S#32278", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("S#32294", "CYC");
        $ic14$ = SubLObjectFactory.makeSymbol("S#32279", "CYC");
        $ic15$ = SubLObjectFactory.makeSymbol("S#32295", "CYC");
        $ic16$ = SubLObjectFactory.makeSymbol("S#32280", "CYC");
        $ic17$ = SubLObjectFactory.makeSymbol("S#32296", "CYC");
        $ic18$ = SubLObjectFactory.makeSymbol("S#32281", "CYC");
        $ic19$ = SubLObjectFactory.makeSymbol("S#32297", "CYC");
        $ic20$ = SubLObjectFactory.makeSymbol("S#32282", "CYC");
        $ic21$ = SubLObjectFactory.makeSymbol("S#32298", "CYC");
        $ic22$ = SubLObjectFactory.makeSymbol("S#32283", "CYC");
        $ic23$ = SubLObjectFactory.makeSymbol("S#32299", "CYC");
        $ic24$ = SubLObjectFactory.makeSymbol("S#32284", "CYC");
        $ic25$ = SubLObjectFactory.makeSymbol("S#32300", "CYC");
        $ic26$ = SubLObjectFactory.makeSymbol("S#32285", "CYC");
        $ic27$ = SubLObjectFactory.makeSymbol("S#32301", "CYC");
        $ic28$ = SubLObjectFactory.makeSymbol("S#32286", "CYC");
        $ic29$ = SubLObjectFactory.makeSymbol("S#32302", "CYC");
        $ic30$ = SubLObjectFactory.makeSymbol("S#32287", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#32303", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#32288", "CYC");
        $ic33$ = SubLObjectFactory.makeSymbol("S#32304", "CYC");
        $ic34$ = SubLObjectFactory.makeSymbol("S#32289", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("S#32305", "CYC");
        $ic36$ = SubLObjectFactory.makeSymbol("S#32290", "CYC");
        $ic37$ = SubLObjectFactory.makeSymbol("S#32306", "CYC");
        $ic38$ = SubLObjectFactory.makeSymbol("S#32291", "CYC");
        $ic39$ = SubLObjectFactory.makeSymbol("S#32307", "CYC");
        $ic40$ = SubLObjectFactory.makeSymbol("S#32292", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("S#32308", "CYC");
        $ic42$ = SubLObjectFactory.makeKeyword("NAME");
        $ic43$ = SubLObjectFactory.makeKeyword("COMMENT");
        $ic44$ = SubLObjectFactory.makeKeyword("SENTENCE");
        $ic45$ = SubLObjectFactory.makeKeyword("PROPERTIES");
        $ic46$ = SubLObjectFactory.makeKeyword("RESULT");
        $ic47$ = SubLObjectFactory.makeKeyword("HALT-REASON");
        $ic48$ = SubLObjectFactory.makeKeyword("RESULT-TEST");
        $ic49$ = SubLObjectFactory.makeKeyword("FOLLOWUPS");
        $ic50$ = SubLObjectFactory.makeKeyword("BINDINGS");
        $ic51$ = SubLObjectFactory.makeKeyword("KB");
        $ic52$ = SubLObjectFactory.makeKeyword("OWNER");
        $ic53$ = SubLObjectFactory.makeKeyword("BUG-NUMBER");
        $ic54$ = SubLObjectFactory.makeKeyword("CREATION-DATE");
        $ic55$ = SubLObjectFactory.makeKeyword("CREATOR");
        $ic56$ = SubLObjectFactory.makeKeyword("WORKING?");
        $ic57$ = SubLObjectFactory.makeKeyword("SUBTYPE");
        $ic58$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic59$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic60$ = SubLObjectFactory.makeSymbol("S#32309", "CYC");
        $ic61$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic62$ = SubLObjectFactory.makeKeyword("END");
        $ic63$ = SubLObjectFactory.makeSymbol("S#32311", "CYC");
        $ic64$ = SubLObjectFactory.makeSymbol("S#2609", "CYC");
        $ic65$ = SubLObjectFactory.makeString("Cannot build inference test recipe; symbolic form of result test function ~A unknown.");
        $ic66$ = SubLObjectFactory.makeKeyword("EXPECTED-RESULT");
        $ic67$ = SubLObjectFactory.makeInteger(513);
        $ic68$ = SubLObjectFactory.makeSymbol("S#32329", "CYC");
        $ic69$ = SubLObjectFactory.makeSymbol("S#32326", "CYC");
        $ic70$ = SubLObjectFactory.makeString("Deserialization produced ~A instead of ~A for IUT ~A.");
        $ic71$ = SubLObjectFactory.makeSymbol("S#32364", "CYC");
        $ic72$ = SubLObjectFactory.makeSymbol("S#32365", "CYC");
        $ic73$ = SubLObjectFactory.makeInteger(212);
        $ic74$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#11212", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("S#127", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $ic76$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic77$ = SubLObjectFactory.makeKeyword("DONE");
        $ic78$ = SubLObjectFactory.makeUninternedSymbol("US#30670D5");
        $ic79$ = SubLObjectFactory.makeSymbol("DO-LIST");
        $ic80$ = SubLObjectFactory.makeSymbol("CLET");
        $ic81$ = SubLObjectFactory.makeSymbol("S#32331", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#14349", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#5852", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32375", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32376", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#32377", "CYC"));
        $ic83$ = SubLObjectFactory.makeKeyword("CONTINUE");
        $ic84$ = SubLObjectFactory.makeKeyword("PREVIOUS");
        $ic85$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#29", "CYC"), SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("S#138", "CYC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("S#14349", "CYC"), SubLObjectFactory.makeSymbol("S#5852", "CYC"), SubLObjectFactory.makeSymbol("S#32375", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#32377", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("EXHAUST-TOTAL")), SubLObjectFactory.makeSymbol("S#32376", "CYC"), SubLObjectFactory.makeSymbol("COMMENT"), SubLObjectFactory.makeSymbol("S#32371", "CYC"), SubLObjectFactory.makeSymbol("S#713", "CYC"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2607", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("TINY")), SubLObjectFactory.makeSymbol("S#2605", "CYC"), SubLObjectFactory.makeSymbol("S#32378", "CYC"), SubLObjectFactory.makeSymbol("S#32379", "CYC"), SubLObjectFactory.makeSymbol("CREATOR"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#2608", "CYC"), (SubLObject)module0416.T), SubLObjectFactory.makeSymbol("S#32374", "CYC"), SubLObjectFactory.makeSymbol("&ALLOW-OTHER-KEYS") });
        $ic86$ = SubLObjectFactory.makeKeyword("EXPECTED-HALT-REASON");
        $ic87$ = SubLObjectFactory.makeKeyword("EXHAUST-TOTAL");
        $ic88$ = SubLObjectFactory.makeKeyword("EXPECTED-RESULT-TEST");
        $ic89$ = SubLObjectFactory.makeKeyword("TINY");
        $ic90$ = SubLObjectFactory.makeKeyword("BUG");
        $ic91$ = SubLObjectFactory.makeKeyword("CREATED");
        $ic92$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic93$ = SubLObjectFactory.makeSymbol("S#32339", "CYC");
        $ic94$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic95$ = SubLObjectFactory.makeSymbol("S#32342", "CYC");
        $ic96$ = SubLObjectFactory.makeSymbol("S#32343", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("DEFINE-INFERENCE-UNIT-TEST");
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic99$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeKeyword("SENTENCE"), SubLObjectFactory.makeKeyword("PROPERTIES"), SubLObjectFactory.makeKeyword("EXPECTED-RESULT"), SubLObjectFactory.makeKeyword("EXPECTED-HALT-REASON"), SubLObjectFactory.makeKeyword("EXPECTED-RESULT-TEST"), SubLObjectFactory.makeKeyword("FOLLOWUPS"), SubLObjectFactory.makeKeyword("BINDINGS"), SubLObjectFactory.makeKeyword("KB"), SubLObjectFactory.makeKeyword("OWNER"), SubLObjectFactory.makeKeyword("BUG"), SubLObjectFactory.makeKeyword("CREATION"), SubLObjectFactory.makeKeyword("CREATOR"), SubLObjectFactory.makeKeyword("WORKING?"), SubLObjectFactory.makeKeyword("SUBTYPE") });
        $ic100$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic101$ = SubLObjectFactory.makeString("~s is not a known ~a");
        $ic102$ = SubLObjectFactory.makeSymbol("S#32338", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-RESULT"), (SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-HALT-REASON"), (SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-RESULT-TEST"));
        $ic104$ = SubLObjectFactory.makeSymbol("S#32341", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#32340", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic107$ = SubLObjectFactory.makeSymbol("S#13920", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("QUERY-PROPERTY-P");
        $ic109$ = SubLObjectFactory.makeSymbol("S#18090", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#26559", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#73", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#32271", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#32335", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#9610", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#2526", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#32272", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $ic119$ = SubLObjectFactory.makeSymbol("S#4999", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic121$ = SubLObjectFactory.makeSymbol("BOOLEANP");
        $ic122$ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $ic123$ = SubLObjectFactory.makeString("The test ~S is not queried with :conditional-sentence? T.");
        $ic124$ = SubLObjectFactory.makeKeyword("STANDARD");
        $ic125$ = SubLObjectFactory.makeKeyword("VERBOSE");
        $ic126$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic127$ = SubLObjectFactory.makeKeyword("IUT");
        $ic128$ = SubLObjectFactory.makeSymbol("S#2688", "CYC");
        $ic129$ = SubLObjectFactory.makeSymbol("S#2621", "CYC");
        $ic130$ = SubLObjectFactory.makeSymbol("S#2737", "CYC");
        $ic131$ = SubLObjectFactory.makeString("No test with name ~a was found");
        $ic132$ = SubLObjectFactory.makeKeyword("NOT-RUN");
        $ic133$ = SubLObjectFactory.makeKeyword("INVALID");
        $ic134$ = SubLObjectFactory.makeKeyword("SUCCESS");
        $ic135$ = SubLObjectFactory.makeSymbol("S#15496", "CYC");
        $ic136$ = SubLObjectFactory.makeKeyword("UNPROVIDED");
        $ic137$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic138$ = SubLObjectFactory.makeString("Previous inference was not browsable");
        $ic139$ = SubLObjectFactory.makeKeyword("FAILURE");
        $ic140$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic141$ = SubLObjectFactory.makeKeyword("BLOCK?");
        $ic142$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)module0416.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("MAX-TIME"), (SubLObject)module0416.NIL);
        $ic143$ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $ic144$ = SubLObjectFactory.makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $ic145$ = SubLObjectFactory.makeKeyword("PRUNING");
        $ic146$ = SubLObjectFactory.makeString("~&:IUT ~S -> ");
        $ic147$ = SubLObjectFactory.makeString("~S (~,3f)~%");
        $ic148$ = SubLObjectFactory.makeKeyword("POST-BUILD");
        $ic149$ = SubLObjectFactory.makeString("~&~S (~S) :IUT ~S :OWNER ~S~%");
        $ic150$ = SubLObjectFactory.makeString("~%Failure when asking");
        $ic151$ = SubLObjectFactory.makeString("~%~%  ~S");
        $ic152$ = SubLObjectFactory.makeString("~%~%with properties ~s");
        $ic153$ = SubLObjectFactory.makeString("~%Result test : ~s");
        $ic154$ = SubLObjectFactory.makeString("~%Actual result   : ~s");
        $ic155$ = SubLObjectFactory.makeString("~%Expected result : ~s");
        $ic156$ = SubLObjectFactory.makeString("~%Actual halt reason   : ~s");
        $ic157$ = SubLObjectFactory.makeString("~%Expected halt reason : ~s");
        $ic158$ = SubLObjectFactory.makeString("~%~%");
    }
    
    public static final class $sX32270_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $comment;
        public SubLObject $sentence;
        public SubLObject $properties;
        public SubLObject $result;
        public SubLObject $halt_reason;
        public SubLObject $result_test;
        public SubLObject $followups;
        public SubLObject $bindings;
        public SubLObject $kb;
        public SubLObject $owner;
        public SubLObject $bug_number;
        public SubLObject $creation_date;
        public SubLObject $creator;
        public SubLObject $workingP;
        public SubLObject $subtype;
        private static final SubLStructDeclNative structDecl;
        
        public $sX32270_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$comment = (SubLObject)CommonSymbols.NIL;
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$halt_reason = (SubLObject)CommonSymbols.NIL;
            this.$result_test = (SubLObject)CommonSymbols.NIL;
            this.$followups = (SubLObject)CommonSymbols.NIL;
            this.$bindings = (SubLObject)CommonSymbols.NIL;
            this.$kb = (SubLObject)CommonSymbols.NIL;
            this.$owner = (SubLObject)CommonSymbols.NIL;
            this.$bug_number = (SubLObject)CommonSymbols.NIL;
            this.$creation_date = (SubLObject)CommonSymbols.NIL;
            this.$creator = (SubLObject)CommonSymbols.NIL;
            this.$workingP = (SubLObject)CommonSymbols.NIL;
            this.$subtype = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX32270_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$comment;
        }
        
        public SubLObject getField4() {
            return this.$sentence;
        }
        
        public SubLObject getField5() {
            return this.$properties;
        }
        
        public SubLObject getField6() {
            return this.$result;
        }
        
        public SubLObject getField7() {
            return this.$halt_reason;
        }
        
        public SubLObject getField8() {
            return this.$result_test;
        }
        
        public SubLObject getField9() {
            return this.$followups;
        }
        
        public SubLObject getField10() {
            return this.$bindings;
        }
        
        public SubLObject getField11() {
            return this.$kb;
        }
        
        public SubLObject getField12() {
            return this.$owner;
        }
        
        public SubLObject getField13() {
            return this.$bug_number;
        }
        
        public SubLObject getField14() {
            return this.$creation_date;
        }
        
        public SubLObject getField15() {
            return this.$creator;
        }
        
        public SubLObject getField16() {
            return this.$workingP;
        }
        
        public SubLObject getField17() {
            return this.$subtype;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$properties = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$result = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$halt_reason = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$result_test = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$followups = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$bindings = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$kb = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$owner = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$bug_number = value;
        }
        
        public SubLObject setField14(final SubLObject value) {
            return this.$creation_date = value;
        }
        
        public SubLObject setField15(final SubLObject value) {
            return this.$creator = value;
        }
        
        public SubLObject setField16(final SubLObject value) {
            return this.$workingP = value;
        }
        
        public SubLObject setField17(final SubLObject value) {
            return this.$subtype = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX32270_native.class, module0416.$ic1$, module0416.$ic2$, module0416.$ic3$, module0416.$ic4$, new String[] { "$name", "$comment", "$sentence", "$properties", "$result", "$halt_reason", "$result_test", "$followups", "$bindings", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP", "$subtype" }, module0416.$ic5$, module0416.$ic6$, module0416.$ic7$);
        }
    }
    
    public static final class $f29093$UnaryFunction extends UnaryFunction
    {
        public $f29093$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2622"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return module0416.f29093(var5);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0416.class
	Total time: 556 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/