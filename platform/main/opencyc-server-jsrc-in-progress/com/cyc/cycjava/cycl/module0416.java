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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
        return $g3400$.getDynamicValue(var1);
    }
    
    public static SubLObject f29090(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        $g3401$.setDynamicValue((SubLObject)ConsesLow.cons(var2, $g3401$.getDynamicValue(var3)), var3);
        return var2;
    }
    
    public static SubLObject f29091() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29092(final SubLObject var3, final SubLObject var4) {
        compatibility.default_struct_print_function(var3, var4, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29093(final SubLObject var3) {
        return (SubLObject)((var3.getClass() == $sX32270_native.class) ? T : NIL);
    }
    
    public static SubLObject f29094(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField2();
    }
    
    public static SubLObject f29095(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField3();
    }
    
    public static SubLObject f29096(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField4();
    }
    
    public static SubLObject f29097(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField5();
    }
    
    public static SubLObject f29098(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField6();
    }
    
    public static SubLObject f29099(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField7();
    }
    
    public static SubLObject f29100(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField8();
    }
    
    public static SubLObject f29101(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField9();
    }
    
    public static SubLObject f29102(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField10();
    }
    
    public static SubLObject f29103(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField11();
    }
    
    public static SubLObject f29104(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField12();
    }
    
    public static SubLObject f29105(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField13();
    }
    
    public static SubLObject f29106(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField14();
    }
    
    public static SubLObject f29107(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField15();
    }
    
    public static SubLObject f29108(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField16();
    }
    
    public static SubLObject f29109(final SubLObject var3) {
        assert NIL != f29093(var3) : var3;
        return var3.getField17();
    }
    
    public static SubLObject f29110(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField2(var6);
    }
    
    public static SubLObject f29111(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField3(var6);
    }
    
    public static SubLObject f29112(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField4(var6);
    }
    
    public static SubLObject f29113(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField5(var6);
    }
    
    public static SubLObject f29114(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField6(var6);
    }
    
    public static SubLObject f29115(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField7(var6);
    }
    
    public static SubLObject f29116(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField8(var6);
    }
    
    public static SubLObject f29117(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField9(var6);
    }
    
    public static SubLObject f29118(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField10(var6);
    }
    
    public static SubLObject f29119(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField11(var6);
    }
    
    public static SubLObject f29120(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField12(var6);
    }
    
    public static SubLObject f29121(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField13(var6);
    }
    
    public static SubLObject f29122(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField14(var6);
    }
    
    public static SubLObject f29123(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField15(var6);
    }
    
    public static SubLObject f29124(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField16(var6);
    }
    
    public static SubLObject f29125(final SubLObject var3, final SubLObject var6) {
        assert NIL != f29093(var3) : var3;
        return var3.setField17(var6);
    }
    
    public static SubLObject f29126(SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLObject var8 = (SubLObject)new $sX32270_native();
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        SubLObject var12;
        for (var9 = (SubLObject)NIL, var9 = var7; NIL != var9; var9 = conses_high.cddr(var9)) {
            var10 = var9.first();
            var11 = conses_high.cadr(var9);
            var12 = var10;
            if (var12.eql((SubLObject)$ic42$)) {
                f29110(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic43$)) {
                f29111(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic44$)) {
                f29112(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic45$)) {
                f29113(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic46$)) {
                f29114(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic47$)) {
                f29115(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic48$)) {
                f29116(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic49$)) {
                f29117(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic50$)) {
                f29118(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic51$)) {
                f29119(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic52$)) {
                f29120(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic53$)) {
                f29121(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic54$)) {
                f29122(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic55$)) {
                f29123(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic56$)) {
                f29124(var8, var11);
            }
            else if (var12.eql((SubLObject)$ic57$)) {
                f29125(var8, var11);
            }
            else {
                Errors.error((SubLObject)$ic58$, var10);
            }
        }
        return var8;
    }
    
    public static SubLObject f29127(final SubLObject var13, final SubLObject var14) {
        Functions.funcall(var14, var13, (SubLObject)$ic59$, (SubLObject)$ic60$, (SubLObject)SIXTEEN_INTEGER);
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic42$, f29094(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic43$, f29095(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic44$, f29096(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic45$, f29097(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic46$, f29098(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic47$, f29099(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic48$, f29100(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic49$, f29101(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic50$, f29102(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic51$, f29103(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic52$, f29104(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic53$, f29105(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic54$, f29106(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic55$, f29107(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic56$, f29108(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic61$, (SubLObject)$ic57$, f29109(var13));
        Functions.funcall(var14, var13, (SubLObject)$ic62$, (SubLObject)$ic60$, (SubLObject)SIXTEEN_INTEGER);
        return var13;
    }
    
    public static SubLObject f29128(final SubLObject var13, final SubLObject var14) {
        return f29127(var13, var14);
    }
    
    public static SubLObject f29129(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29094(var15);
    }
    
    public static SubLObject f29130(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29095(var15);
    }
    
    public static SubLObject f29131(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29096(var15);
    }
    
    public static SubLObject f29132(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29097(var15);
    }
    
    public static SubLObject f29133(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29098(var15);
    }
    
    public static SubLObject f29134(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29099(var15);
    }
    
    public static SubLObject f29135(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29100(var15);
    }
    
    public static SubLObject f29136(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29101(var15);
    }
    
    public static SubLObject f29137(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29102(var15);
    }
    
    public static SubLObject f29138(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29103(var15);
    }
    
    public static SubLObject f29139(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29104(var15);
    }
    
    public static SubLObject f29140(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29105(var15);
    }
    
    public static SubLObject f29141(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29106(var15);
    }
    
    public static SubLObject f29142(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29107(var15);
    }
    
    public static SubLObject f29143(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29108(var15);
    }
    
    public static SubLObject f29144(final SubLObject var15) {
        assert NIL != f29093(var15) : var15;
        return f29109(var15);
    }
    
    public static SubLObject f29145(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != module0035.f2439(Symbols.symbol_function((SubLObject)$ic64$), f29131(var16), (SubLObject)UNPROVIDED) || NIL != module0035.f2439(Symbols.symbol_function((SubLObject)$ic64$), f29136(var16), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f29146(final SubLObject var16) {
        return Sequences.remove_duplicates(ConsesLow.append(module0205.f13183(f29131(var16), (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0205.f13183(f29136(var16), (SubLObject)$ic64$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29147(final SubLObject var15) {
        final SubLObject var16 = f29135(var15);
        final SubLObject var17 = f29148(var16);
        SubLObject var18 = (SubLObject)NIL;
        if (NIL == var17 && var16.isFunction()) {
            Errors.error((SubLObject)$ic65$, var16);
        }
        var18 = conses_high.putf(var18, (SubLObject)$ic42$, f29129(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic43$, f29130(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic44$, f29131(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic45$, f29132(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic46$, f29133(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic47$, f29134(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic48$, var17);
        var18 = conses_high.putf(var18, (SubLObject)$ic49$, f29136(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic50$, f29137(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic51$, f29138(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic52$, f29139(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic53$, f29140(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic54$, f29141(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic55$, f29142(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic56$, f29143(var15));
        var18 = conses_high.putf(var18, (SubLObject)$ic57$, f29144(var15));
        return var18;
    }
    
    public static SubLObject f29148(final SubLObject var18) {
        if (var18.isSymbol()) {
            return var18;
        }
        SubLObject var19 = (SubLObject)NIL;
        var19 = module0030.f1592(var18);
        if (NIL != module0035.sublisp_boolean(var19)) {
            return var19;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29149(final SubLObject var19) {
        final SubLObject var20 = cdestructuring_bind.property_list_member((SubLObject)$ic42$, var19);
        final SubLObject var21 = (SubLObject)((NIL != var20) ? conses_high.cadr(var20) : NIL);
        final SubLObject var22 = cdestructuring_bind.property_list_member((SubLObject)$ic43$, var19);
        final SubLObject var23 = (SubLObject)((NIL != var22) ? conses_high.cadr(var22) : NIL);
        final SubLObject var24 = cdestructuring_bind.property_list_member((SubLObject)$ic44$, var19);
        final SubLObject var25 = (SubLObject)((NIL != var24) ? conses_high.cadr(var24) : NIL);
        final SubLObject var26 = cdestructuring_bind.property_list_member((SubLObject)$ic45$, var19);
        final SubLObject var27 = (SubLObject)((NIL != var26) ? conses_high.cadr(var26) : NIL);
        final SubLObject var28 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var19);
        final SubLObject var29 = (SubLObject)((NIL != var28) ? conses_high.cadr(var28) : NIL);
        final SubLObject var30 = cdestructuring_bind.property_list_member((SubLObject)$ic47$, var19);
        final SubLObject var31 = (SubLObject)((NIL != var30) ? conses_high.cadr(var30) : NIL);
        final SubLObject var32 = cdestructuring_bind.property_list_member((SubLObject)$ic48$, var19);
        final SubLObject var33 = (SubLObject)((NIL != var32) ? conses_high.cadr(var32) : NIL);
        final SubLObject var34 = cdestructuring_bind.property_list_member((SubLObject)$ic49$, var19);
        final SubLObject var35 = (SubLObject)((NIL != var34) ? conses_high.cadr(var34) : NIL);
        final SubLObject var36 = cdestructuring_bind.property_list_member((SubLObject)$ic50$, var19);
        final SubLObject var37 = (SubLObject)((NIL != var36) ? conses_high.cadr(var36) : NIL);
        final SubLObject var38 = cdestructuring_bind.property_list_member((SubLObject)$ic51$, var19);
        final SubLObject var39 = (SubLObject)((NIL != var38) ? conses_high.cadr(var38) : NIL);
        final SubLObject var40 = cdestructuring_bind.property_list_member((SubLObject)$ic52$, var19);
        final SubLObject var41 = (SubLObject)((NIL != var40) ? conses_high.cadr(var40) : NIL);
        final SubLObject var42 = cdestructuring_bind.property_list_member((SubLObject)$ic53$, var19);
        final SubLObject var43 = (SubLObject)((NIL != var42) ? conses_high.cadr(var42) : NIL);
        final SubLObject var44 = cdestructuring_bind.property_list_member((SubLObject)$ic54$, var19);
        final SubLObject var45 = (SubLObject)((NIL != var44) ? conses_high.cadr(var44) : NIL);
        final SubLObject var46 = cdestructuring_bind.property_list_member((SubLObject)$ic55$, var19);
        final SubLObject var47 = (SubLObject)((NIL != var46) ? conses_high.cadr(var46) : NIL);
        final SubLObject var48 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var19);
        final SubLObject var49 = (SubLObject)((NIL != var48) ? conses_high.cadr(var48) : NIL);
        final SubLObject var50 = cdestructuring_bind.property_list_member((SubLObject)$ic57$, var19);
        final SubLObject var51 = (SubLObject)((NIL != var50) ? conses_high.cadr(var50) : NIL);
        return f29150(var21, var23, var25, var27, var29, var31, var33, var35, var37, var39, var41, var43, var45, var47, var49, var51);
    }
    
    public static SubLObject f29151(final SubLObject var54, final SubLObject var4) {
        return f29152(var54, var4);
    }
    
    public static SubLObject f29152(final SubLObject var15, final SubLObject var4) {
        module0021.f1110($g3403$.getGlobalValue(), var4);
        f29153(var15, var4);
        return var15;
    }
    
    public static SubLObject f29153(final SubLObject var15, final SubLObject var4) {
        final SubLObject var16 = f29147(var15);
        module0021.f1038(var16, var4);
        return var15;
    }
    
    public static SubLObject f29154(final SubLObject var4) {
        final SubLObject var5 = module0021.f1060(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f29149(var5);
    }
    
    public static SubLObject f29155(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        final SubLObject var18 = f29147(var16);
        SubLObject var19 = (SubLObject)NIL;
        var19 = module0069.f4956(var16);
        final SubLObject var20 = f29147(var19);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var17) && NIL == module0035.f2362(var18, var20, (SubLObject)EQUALP)) {
            Errors.error((SubLObject)$ic70$, var20, var18, var16);
        }
        return var16;
    }
    
    public static SubLObject f29156(final SubLObject var24) {
        return Hashtables.gethash(var24, $g3405$.getGlobalValue(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29157(final SubLObject var15) {
        final SubLObject var16 = f29129(var15);
        $g3404$.setGlobalValue(Sequences.delete(var16, $g3404$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g3404$.setGlobalValue(ConsesLow.append($g3404$.getGlobalValue(), (SubLObject)ConsesLow.list(var16)));
        return Hashtables.sethash(var16, $g3405$.getGlobalValue(), var15);
    }
    
    public static SubLObject f29158(final SubLObject var58, final SubLObject var59) {
        SubLObject var61;
        final SubLObject var60 = var61 = var58.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)$ic74$);
        final SubLObject var62 = var61.rest();
        var61 = var61.first();
        SubLObject var63 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)$ic74$);
        var63 = var61.first();
        var61 = var61.rest();
        SubLObject var64 = (SubLObject)NIL;
        SubLObject var65 = var61;
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67_68 = (SubLObject)NIL;
        while (NIL != var65) {
            cdestructuring_bind.destructuring_bind_must_consp(var65, var60, (SubLObject)$ic74$);
            var67_68 = var65.first();
            var65 = var65.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var65, var60, (SubLObject)$ic74$);
            if (NIL == conses_high.member(var67_68, (SubLObject)$ic75$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var66 = (SubLObject)T;
            }
            if (var67_68 == $ic76$) {
                var64 = var65.first();
            }
            var65 = var65.rest();
        }
        if (NIL != var66 && NIL == var64) {
            cdestructuring_bind.cdestructuring_bind_error(var60, (SubLObject)$ic74$);
        }
        final SubLObject var67 = cdestructuring_bind.property_list_member((SubLObject)$ic77$, var61);
        final SubLObject var68 = (SubLObject)((NIL != var67) ? conses_high.cadr(var67) : NIL);
        final SubLObject var69;
        var61 = (var69 = var62);
        final SubLObject var70 = (SubLObject)$ic78$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic79$, (SubLObject)ConsesLow.list(var70, (SubLObject)$ic71$, (SubLObject)$ic77$, var68), (SubLObject)ConsesLow.listS((SubLObject)$ic80$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var63, (SubLObject)ConsesLow.list((SubLObject)$ic81$, var70))), ConsesLow.append(var69, (SubLObject)NIL)));
    }
    
    public static SubLObject f29159() {
        SubLObject var72 = (SubLObject)NIL;
        SubLObject var73 = $g3404$.getGlobalValue();
        SubLObject var74 = (SubLObject)NIL;
        var74 = var73.first();
        while (NIL != var73) {
            final SubLObject var75 = f29156(var74);
            final SubLObject var24_75 = f29129(var75);
            var72 = (SubLObject)ConsesLow.cons(var24_75, var72);
            var73 = var73.rest();
            var74 = var73.first();
        }
        return Sequences.nreverse(var72);
    }
    
    public static SubLObject f29160(final SubLObject var76) {
        if (NIL != module0035.f2014(var76) && NIL != module0035.f1995(var76, (SubLObject)FIVE_INTEGER, (SubLObject)UNPROVIDED)) {
            SubLObject var77 = (SubLObject)NIL;
            SubLObject var78 = (SubLObject)NIL;
            SubLObject var79 = (SubLObject)NIL;
            SubLObject var80 = (SubLObject)NIL;
            SubLObject var81 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var76, var76, (SubLObject)$ic82$);
            var77 = var76.first();
            SubLObject var82 = var76.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var76, (SubLObject)$ic82$);
            var78 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var76, (SubLObject)$ic82$);
            var79 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var76, (SubLObject)$ic82$);
            var80 = var82.first();
            var82 = var82.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var82, var76, (SubLObject)$ic82$);
            var81 = var82.first();
            var82 = var82.rest();
            if (NIL == var82) {
                return (SubLObject)makeBoolean(($ic83$ == var77 || $ic84$ == var77 || NIL != module0202.f12660(var77)) && NIL != module0360.f23784(var78) && (NIL == var80 || NIL != module0004.f85(var80)) && (NIL == var81 || NIL != module0360.f23864(var81)));
            }
            cdestructuring_bind.cdestructuring_bind_error(var76, (SubLObject)$ic82$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29161(final SubLObject var58, final SubLObject var59) {
        SubLObject var61;
        final SubLObject var60 = var61 = var58.rest();
        SubLObject var62 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var61, var60, (SubLObject)$ic85$);
        var62 = var61.first();
        final SubLObject var63;
        var61 = (var63 = var61.rest());
        final SubLObject var64 = cdestructuring_bind.property_list_member((SubLObject)$ic44$, var61);
        final SubLObject var65 = (SubLObject)((NIL != var64) ? conses_high.cadr(var64) : NIL);
        final SubLObject var66 = cdestructuring_bind.property_list_member((SubLObject)$ic45$, var61);
        final SubLObject var67 = (SubLObject)((NIL != var66) ? conses_high.cadr(var66) : NIL);
        final SubLObject var68 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var61);
        final SubLObject var69 = (SubLObject)((NIL != var68) ? conses_high.cadr(var68) : NIL);
        final SubLObject var70 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var61);
        final SubLObject var71 = (SubLObject)((NIL != var70) ? conses_high.cadr(var70) : $ic87$);
        final SubLObject var72 = cdestructuring_bind.property_list_member((SubLObject)$ic88$, var61);
        final SubLObject var73 = (SubLObject)((NIL != var72) ? conses_high.cadr(var72) : NIL);
        final SubLObject var74 = cdestructuring_bind.property_list_member((SubLObject)$ic43$, var61);
        final SubLObject var75 = (SubLObject)((NIL != var74) ? conses_high.cadr(var74) : NIL);
        final SubLObject var76 = cdestructuring_bind.property_list_member((SubLObject)$ic49$, var61);
        final SubLObject var77 = (SubLObject)((NIL != var76) ? conses_high.cadr(var76) : NIL);
        final SubLObject var78 = cdestructuring_bind.property_list_member((SubLObject)$ic50$, var61);
        final SubLObject var79 = (SubLObject)((NIL != var78) ? conses_high.cadr(var78) : NIL);
        final SubLObject var80 = cdestructuring_bind.property_list_member((SubLObject)$ic51$, var61);
        final SubLObject var81 = (SubLObject)((NIL != var80) ? conses_high.cadr(var80) : $ic89$);
        final SubLObject var82 = cdestructuring_bind.property_list_member((SubLObject)$ic52$, var61);
        final SubLObject var83 = (SubLObject)((NIL != var82) ? conses_high.cadr(var82) : NIL);
        final SubLObject var84 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var61);
        final SubLObject var85 = (SubLObject)((NIL != var84) ? conses_high.cadr(var84) : NIL);
        final SubLObject var86 = cdestructuring_bind.property_list_member((SubLObject)$ic91$, var61);
        final SubLObject var87 = (SubLObject)((NIL != var86) ? conses_high.cadr(var86) : NIL);
        final SubLObject var88 = cdestructuring_bind.property_list_member((SubLObject)$ic55$, var61);
        final SubLObject var89 = (SubLObject)((NIL != var88) ? conses_high.cadr(var88) : NIL);
        final SubLObject var90 = cdestructuring_bind.property_list_member((SubLObject)$ic56$, var61);
        final SubLObject var91 = (SubLObject)((NIL != var90) ? conses_high.cadr(var90) : T);
        final SubLObject var92 = cdestructuring_bind.property_list_member((SubLObject)$ic57$, var61);
        final SubLObject var93 = (SubLObject)((NIL != var92) ? conses_high.cadr(var92) : NIL);
        return (SubLObject)ConsesLow.list((SubLObject)$ic92$, (SubLObject)ConsesLow.list((SubLObject)$ic93$, (SubLObject)ConsesLow.list((SubLObject)$ic94$, var63)), (SubLObject)ConsesLow.list(new SubLObject[] { $ic95$, var62, var75, var65, var67, var69, var71, var73, ConsesLow.list((SubLObject)$ic96$, var77), var79, var81, var83, var85, var87, var89, var91, var93 }));
    }
    
    public static SubLObject f29162(final SubLObject var24) {
        final SubLObject var25 = Hashtables.remhash(var24, $g3405$.getGlobalValue());
        $g3404$.setGlobalValue(Sequences.delete(var24, $g3404$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var25;
    }
    
    public static SubLObject f29163() {
        $g3404$.setGlobalValue((SubLObject)NIL);
        $g3405$.setGlobalValue(Hashtables.make_hash_table((SubLObject)$ic73$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29164(final SubLObject var54) {
        return module0035.f2169(var54, $g3406$.getGlobalValue());
    }
    
    public static SubLObject f29165(final SubLObject var83) {
        assert NIL != module0035.f2327(var83) : var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var84 = (SubLObject)NIL, var84 = var83; NIL != var84; var84 = conses_high.cddr(var84)) {
            var85 = var84.first();
            var86 = conses_high.cadr(var84);
            if (NIL == f29164(var85)) {
                Errors.warn((SubLObject)$ic101$, var85, (SubLObject)$ic102$);
            }
        }
        return var83;
    }
    
    public static SubLObject f29166(final SubLObject var54) {
        return module0035.f2169(var54, $g3407$.getGlobalValue());
    }
    
    public static SubLObject f29167(final SubLObject var83) {
        assert NIL != module0035.f2327(var83) : var83;
        SubLObject var84;
        SubLObject var85;
        SubLObject var86;
        for (var84 = (SubLObject)NIL, var84 = var83; NIL != var84; var84 = conses_high.cddr(var84)) {
            var85 = var84.first();
            var86 = conses_high.cadr(var84);
            if (NIL == f29166(var85)) {
                Errors.warn((SubLObject)$ic101$, var85, (SubLObject)$ic105$);
            }
        }
        return var83;
    }
    
    public static SubLObject f29150(final SubLObject var24, final SubLObject var26, final SubLObject var28, final SubLObject var30, final SubLObject var32, final SubLObject var34, final SubLObject var18, final SubLObject var37, final SubLObject var39, final SubLObject var41, final SubLObject var43, final SubLObject var45, final SubLObject var47, final SubLObject var49, final SubLObject var51, final SubLObject var53) {
        final SubLThread var54 = SubLProcess.currentSubLThread();
        assert NIL != Types.keywordp(var24) : var24;
        assert NIL != module0202.f12660(var28) : var28;
        assert NIL != module0035.f2327(var30) : var30;
        SubLObject var55;
        SubLObject var56;
        SubLObject var57;
        for (var55 = (SubLObject)NIL, var55 = var30; NIL != var55; var55 = conses_high.cddr(var55)) {
            var56 = var55.first();
            var57 = conses_high.cadr(var55);
            assert NIL != module0360.f23781(var56) : var56;
        }
        if (NIL == var18 && !areAssertionsDisabledFor(me) && NIL == module0233.f15352(var32)) {
            throw new AssertionError(var32);
        }
        if (NIL != var34 && !areAssertionsDisabledFor(me) && NIL == module0360.f23864(var34)) {
            throw new AssertionError(var34);
        }
        if (NIL != var18 && !areAssertionsDisabledFor(me) && NIL == module0004.f85(var18)) {
            throw new AssertionError(var18);
        }
        assert NIL != module0421.f29457(var26) : var26;
        assert NIL != module0035.f2015(var37) : var37;
        SubLObject var58 = var37;
        SubLObject var59 = (SubLObject)NIL;
        var59 = var58.first();
        while (NIL != var58) {
            assert NIL != f29160(var59) : var59;
            var58 = var58.rest();
            var59 = var58.first();
        }
        assert NIL != module0107.f7633(var39) : var39;
        assert NIL != module0029.f1472(var41) : var41;
        assert NIL != module0421.f29459(var43) : var43;
        if (NIL != var45 && !areAssertionsDisabledFor(me) && NIL == module0004.f105(var45)) {
            throw new AssertionError(var45);
        }
        if (NIL != var47 && !areAssertionsDisabledFor(me) && NIL == module0051.f3603(var47)) {
            throw new AssertionError(var47);
        }
        if (NIL != var49 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var49)) {
            throw new AssertionError(var49);
        }
        assert NIL != Types.booleanp(var51) : var51;
        if (NIL != var53 && !areAssertionsDisabledFor(me) && NIL == Types.keywordp(var53)) {
            throw new AssertionError(var53);
        }
        if (NIL != module0202.f12603(var28) && NIL == conses_high.getf(var30, (SubLObject)$ic122$, (SubLObject)UNPROVIDED)) {
            Errors.warn((SubLObject)$ic123$, var24);
        }
        final SubLObject var60 = f29126((SubLObject)ConsesLow.list(new SubLObject[] { $ic42$, var24, $ic43$, var26, $ic44$, var28, $ic45$, var30, $ic46$, var32, $ic47$, var34, $ic48$, var18, $ic49$, var37, $ic50$, var39, $ic51$, var41, $ic52$, var43, $ic53$, var45, $ic54$, var47, $ic55$, var49, $ic56$, var51, $ic57$, var53 }));
        f29157(var60);
        module0029.f1506(module0029.$g836$.getDynamicValue(var54), var60);
        return var60;
    }
    
    public static SubLObject f29168(final SubLObject var111) {
        SubLObject var112 = (SubLObject)NIL;
        SubLObject var113 = var111;
        SubLObject var114 = (SubLObject)NIL;
        var114 = var113.first();
        while (NIL != var113) {
            f29167(var114);
            final SubLObject var116;
            final SubLObject var115 = var116 = var114;
            final SubLObject var117 = cdestructuring_bind.property_list_member((SubLObject)$ic44$, var116);
            final SubLObject var118 = (SubLObject)((NIL != var117) ? conses_high.cadr(var117) : $ic83$);
            final SubLObject var119 = cdestructuring_bind.property_list_member((SubLObject)$ic45$, var116);
            final SubLObject var120 = (SubLObject)((NIL != var119) ? conses_high.cadr(var119) : NIL);
            final SubLObject var121 = cdestructuring_bind.property_list_member((SubLObject)$ic66$, var116);
            final SubLObject var122 = (SubLObject)((NIL != var121) ? conses_high.cadr(var121) : NIL);
            final SubLObject var123 = cdestructuring_bind.property_list_member((SubLObject)$ic88$, var116);
            final SubLObject var124 = (SubLObject)((NIL != var123) ? conses_high.cadr(var123) : NIL);
            final SubLObject var125 = cdestructuring_bind.property_list_member((SubLObject)$ic86$, var116);
            final SubLObject var126 = (SubLObject)((NIL != var125) ? conses_high.cadr(var125) : $ic87$);
            var112 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var118, var120, var122, var124, var126), var112);
            var113 = var113.rest();
            var114 = var113.first();
        }
        return Sequences.nreverse(var112);
    }
    
    public static SubLObject f29169(SubLObject var120, SubLObject var121, SubLObject var122, SubLObject var4, SubLObject var123, SubLObject var124) {
        if (var120 == UNPROVIDED) {
            var120 = (SubLObject)T;
        }
        if (var121 == UNPROVIDED) {
            var121 = (SubLObject)NIL;
        }
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)$ic124$;
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var123 == UNPROVIDED) {
            var123 = module0029.$g835$.getDynamicValue();
        }
        if (var124 == UNPROVIDED) {
            var124 = (SubLObject)NIL;
        }
        final SubLObject var125 = (SubLObject)((NIL != var120) ? $ic125$ : $ic126$);
        return module0029.f1577(var4, var125, var121, var122, var123, (SubLObject)NIL, var124, (SubLObject)$ic127$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29170(SubLObject var72, SubLObject var120, SubLObject var121, SubLObject var122, SubLObject var4, SubLObject var123, SubLObject var124) {
        if (var72 == UNPROVIDED) {
            var72 = f29159();
        }
        if (var120 == UNPROVIDED) {
            var120 = (SubLObject)T;
        }
        if (var121 == UNPROVIDED) {
            var121 = (SubLObject)NIL;
        }
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)$ic124$;
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var123 == UNPROVIDED) {
            var123 = module0029.$g835$.getDynamicValue();
        }
        if (var124 == UNPROVIDED) {
            var124 = (SubLObject)NIL;
        }
        assert NIL != Types.booleanp(var120) : var120;
        assert NIL != Types.booleanp(var121) : var121;
        assert NIL != module0029.f1474(var122) : var122;
        final SubLObject var125 = (SubLObject)((NIL != var120) ? $ic125$ : $ic126$);
        final SubLObject var126 = module0035.delete_if_not((SubLObject)$ic129$, Mapping.mapcar((SubLObject)$ic130$, var72), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return module0029.f1577(var4, var125, var121, var122, var123, (SubLObject)NIL, var124, (SubLObject)$ic127$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f29171(final SubLObject var24, SubLObject var120, SubLObject var127, SubLObject var128, SubLObject var122, SubLObject var4, SubLObject var123) {
        if (var120 == UNPROVIDED) {
            var120 = (SubLObject)T;
        }
        if (var127 == UNPROVIDED) {
            var127 = (SubLObject)NIL;
        }
        if (var128 == UNPROVIDED) {
            var128 = (SubLObject)NIL;
        }
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)$ic124$;
        }
        if (var4 == UNPROVIDED) {
            var4 = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (var123 == UNPROVIDED) {
            var123 = module0029.$g835$.getDynamicValue();
        }
        assert NIL != Types.keywordp(var24) : var24;
        assert NIL != module0029.f1474(var122) : var122;
        final SubLObject var129 = f29156(var24);
        if (NIL == var129) {
            Errors.error((SubLObject)$ic131$, var24);
        }
        return f29172(var129, var120, var127, var128, var122, var4, var123);
    }
    
    public static SubLObject f29172(final SubLObject var15, final SubLObject var120, final SubLObject var127, final SubLObject var128, final SubLObject var122, final SubLObject var4, final SubLObject var123) {
        final SubLThread var129 = SubLProcess.currentSubLThread();
        if (NIL == f29173(var15, var123)) {
            final SubLObject var130 = f29129(var15);
            return Values.values((SubLObject)$ic132$, module0029.f1535((SubLObject)$ic127$, var130, (SubLObject)$ic132$, (SubLObject)NIL));
        }
        if (NIL != f29145(var15)) {
            final SubLObject var130 = f29129(var15);
            return Values.values((SubLObject)$ic133$, module0029.f1535((SubLObject)$ic127$, var130, (SubLObject)$ic133$, (SubLObject)NIL));
        }
        SubLObject var131 = (SubLObject)NIL;
        SubLObject var132 = (SubLObject)NIL;
        SubLObject var133 = (SubLObject)NIL;
        SubLObject var134 = (SubLObject)NIL;
        final SubLObject var135 = $g3400$.currentBinding(var129);
        final SubLObject var136 = $g3401$.currentBinding(var129);
        final SubLObject var137 = print_high.$print_pretty$.currentBinding(var129);
        try {
            $g3400$.bind((SubLObject)T, var129);
            $g3401$.bind((SubLObject)NIL, var129);
            print_high.$print_pretty$.bind((SubLObject)NIL, var129);
            final SubLObject var138 = f29129(var15);
            final SubLObject var139 = f29131(var15);
            final SubLObject var140 = f29132(var15);
            final SubLObject var141 = f29133(var15);
            final SubLObject var142 = f29134(var15);
            final SubLObject var143 = f29135(var15);
            final SubLObject var144 = f29136(var15);
            final SubLObject var145 = f29137(var15);
            final SubLObject var146 = f29144(var15);
            SubLObject var147 = (SubLObject)NIL;
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
            if (NIL != var148) {
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
            for (var149 = (SubLObject)NIL, var149 = var144; $ic134$ == var132 && NIL != var149; var149 = var149.rest()) {
                var150 = var149.first();
                var151 = (var152 = var150);
                var28_148 = (SubLObject)NIL;
                var30_149 = (SubLObject)NIL;
                var32_150 = (SubLObject)NIL;
                var153 = (SubLObject)NIL;
                var80_151 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)$ic82$);
                var28_148 = var152.first();
                var152 = var152.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)$ic82$);
                var30_149 = var152.first();
                var152 = var152.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)$ic82$);
                var32_150 = var152.first();
                var152 = var152.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)$ic82$);
                var153 = var152.first();
                var152 = var152.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var152, var151, (SubLObject)$ic82$);
                var80_151 = var152.first();
                var152 = var152.rest();
                if (NIL == var152) {
                    var129.resetMultipleValues();
                    var154 = f29176(var138, var147, var28_148, var30_149, var145, var32_150, var80_151, var153, var120, var127, var128, var146, var122, var4);
                    var155 = var129.secondMultipleValue();
                    var156 = var129.thirdMultipleValue();
                    var129.resetMultipleValues();
                    var132 = var154;
                    var133 = Numbers.add(var133, var155);
                    var147 = (var157 = var156);
                    if (NIL != var157) {
                        var158 = var157;
                        if (NIL == conses_high.member(var158, var131, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var131 = (SubLObject)ConsesLow.cons(var158, var131);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var151, (SubLObject)$ic82$);
                }
            }
            if ($ic134$ == var132) {
                f29177(var132, var138, var133, var120, var122, var4);
            }
            var134 = module0029.f1535((SubLObject)$ic127$, var138, var132, var133);
            f29091();
        }
        finally {
            print_high.$print_pretty$.rebind(var137, var129);
            $g3401$.rebind(var136, var129);
            $g3400$.rebind(var135, var129);
        }
        if (NIL == var127) {
            SubLObject var159 = var131;
            SubLObject var160 = (SubLObject)NIL;
            var160 = var159.first();
            while (NIL != var159) {
                inference_datastructures_inference_oc.f25476(var160);
                var159 = var159.rest();
                var160 = var159.first();
            }
        }
        return Values.values(var132, var134);
    }
    
    public static SubLObject f29173(final SubLObject var15, final SubLObject var123) {
        final SubLObject var124 = f29138(var15);
        if (NIL == module0421.f29447(var124, var123)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f29176(final SubLObject var24, final SubLObject var137, SubLObject var159, SubLObject var30, final SubLObject var39, SubLObject var32, final SubLObject var80, final SubLObject var136, final SubLObject var120, final SubLObject var127, final SubLObject var128, final SubLObject var53, final SubLObject var122, final SubLObject var4) {
        if ($ic83$ == var159) {
            return f29175(var24, var137, var30, var39, var32, var80, var136, var120, var127, var128, (SubLObject)T, var53, var122, var4);
        }
        if ($ic84$ == var159) {
            var159 = module0202.f12782(inference_datastructures_inference_oc.f25484(var137), inference_datastructures_inference_oc.f25485(var137));
        }
        SubLObject var160 = var159;
        assert NIL != module0207.f13509(var160) : var160;
        if (NIL != var137) {
            final SubLObject var161 = inference_datastructures_inference_oc.f25421(var137);
            var160 = f29178(var161, var160);
            var32 = f29178(var161, var32);
        }
        if ($ic136$ != conses_high.getf(var30, (SubLObject)$ic137$, (SubLObject)$ic136$)) {
            return f29175(var24, var160, var30, var39, var32, var80, var136, var120, var127, var128, (SubLObject)T, var53, var122, var4);
        }
        if (NIL == var137) {
            final SubLObject var162 = (SubLObject)NIL;
            final SubLObject var163 = module0360.f23875((SubLObject)$ic138$);
            final SubLObject var164 = (SubLObject)$ic139$;
            final SubLObject var165 = (SubLObject)ZERO_INTEGER;
            final SubLObject var166 = (SubLObject)NIL;
            f29177(var164, var24, var165, var120, var122, var4);
            f29179(var4, var120, var160, var30, var136, var32, var162, var80, var163);
            return Values.values(var164, var165, var166);
        }
        final SubLObject var167 = inference_datastructures_inference_oc.f25421(var137);
        var30 = conses_high.putf(conses_high.copy_list(var30), (SubLObject)$ic137$, var167);
        return f29175(var24, var160, var30, var39, var32, var80, var136, var120, var127, var128, (SubLObject)T, var53, var122, var4);
    }
    
    public static SubLObject f29178(final SubLObject var160, SubLObject var28) {
        final SubLObject var161 = module0361.f24123(var160);
        if (NIL == module0065.f4772(var161, (SubLObject)$ic140$)) {
            final SubLObject var167_168 = var161;
            if (NIL == module0065.f4775(var167_168, (SubLObject)$ic140$)) {
                final SubLObject var162 = module0065.f4740(var167_168);
                final SubLObject var163 = (SubLObject)NIL;
                SubLObject var164;
                SubLObject var165;
                SubLObject var166;
                SubLObject var167;
                SubLObject var168;
                for (var164 = Sequences.length(var162), var165 = (SubLObject)NIL, var165 = (SubLObject)ZERO_INTEGER; var165.numL(var164); var165 = Numbers.add(var165, (SubLObject)ONE_INTEGER)) {
                    var166 = ((NIL != var163) ? Numbers.subtract(var164, var165, (SubLObject)ONE_INTEGER) : var165);
                    var167 = Vectors.aref(var162, var166);
                    if (NIL == module0065.f4749(var167) || NIL == module0065.f4773((SubLObject)$ic140$)) {
                        if (NIL != module0065.f4749(var167)) {
                            var167 = (SubLObject)$ic140$;
                        }
                        var168 = inference_datastructures_inference_oc.f25491(var167);
                        var28 = module0233.f15362(var168, var28);
                    }
                }
            }
            final SubLObject var176_177 = var161;
            if (NIL == module0065.f4777(var176_177)) {
                final SubLObject var169 = module0065.f4738(var176_177);
                SubLObject var170 = (SubLObject)NIL;
                SubLObject var171 = (SubLObject)NIL;
                final Iterator var172 = Hashtables.getEntrySetIterator(var169);
                try {
                    while (Hashtables.iteratorHasNext(var172)) {
                        final Map.Entry var173 = Hashtables.iteratorNextEntry(var172);
                        var170 = Hashtables.getEntryKey(var173);
                        var171 = Hashtables.getEntryValue(var173);
                        final SubLObject var174 = inference_datastructures_inference_oc.f25491(var171);
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
        SubLObject var184 = (SubLObject)NIL;
        SubLObject var185 = (SubLObject)NIL;
        SubLObject var186 = (SubLObject)NIL;
        if (NIL != var128) {
            var30 = conses_high.putf(conses_high.copy_list(var30), (SubLObject)$ic141$, (SubLObject)T);
            var30 = module0035.f2340(var30, (SubLObject)$ic142$);
        }
        if (NIL != var127) {
            var30 = conses_high.putf(conses_high.copy_list(var30), (SubLObject)$ic143$, (SubLObject)T);
        }
        if (NIL != $g3408$.getDynamicValue(var183) && NIL != var182 && NIL == f29180(var53) && NIL == inference_datastructures_inference_oc.f25275(var181)) {
            final SubLObject var187 = module0409.f28519(module0360.f23793(var30));
            var30 = conses_high.putf(conses_high.copy_list(var30), (SubLObject)$ic137$, var187);
        }
        SubLObject var188 = (SubLObject)NIL;
        SubLObject var189 = (SubLObject)NIL;
        SubLObject var190 = (SubLObject)NIL;
        SubLObject var191 = (SubLObject)NIL;
        final SubLObject var192 = module0360.f23960(var30);
        SubLObject var193 = (SubLObject)ZERO_INTEGER;
        final SubLObject var194 = module0018.$g689$.currentBinding(var183);
        final SubLObject var195 = module0111.$g1406$.currentBinding(var183);
        try {
            module0018.$g689$.bind((SubLObject)NIL, var183);
            module0111.$g1406$.bind((SubLObject)NIL, var183);
            final SubLObject var196 = module0107.f7635(var39);
            final ArrayList var197 = Dynamic.extract_dynamic_values(var196);
            try {
                Dynamic.bind_dynamic_vars(var196, module0107.f7636(var39));
                if (NIL != inference_datastructures_inference_oc.f25275(var181)) {
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
                    final SubLObject var197_198 = module0409.f28506(var181, (SubLObject)NIL, var30);
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
        if (var199.eql((SubLObject)$ic50$)) {
            var188 = var191;
            var189 = (SubLObject)NIL;
        }
        else if (var199.eql((SubLObject)$ic144$)) {
            var188 = var191.first();
            var189 = conses_high.second(var191);
        }
        else {
            var188 = var191;
            var189 = (SubLObject)NIL;
        }
        if (NIL != var189) {
            var32 = module0233.f15362(var189, var32);
        }
        var184 = f29181((SubLObject)makeBoolean(NIL != f29182(var190, var80) && NIL != f29183(var136, var188, var32)));
        if ($ic139$ == var184) {
            f29177(var184, var24, var185, var120, var122, var4);
            f29179(var4, var120, var181, var30, var136, var32, var188, var80, var190);
        }
        return Values.values(var184, var185, var186);
    }
    
    public static SubLObject f29180(final SubLObject var53) {
        return Equality.eq((SubLObject)$ic145$, var53);
    }
    
    public static SubLObject f29181(final SubLObject var203) {
        if (NIL != var203) {
            return (SubLObject)$ic134$;
        }
        return (SubLObject)$ic139$;
    }
    
    public static SubLObject f29182(final SubLObject var162, final SubLObject var80) {
        return (SubLObject)makeBoolean(NIL == var80 || var162.equal(var80));
    }
    
    public static SubLObject f29183(final SubLObject var136, final SubLObject var161, final SubLObject var32) {
        if (NIL == var136) {
            return module0233.f15365(var161, var32);
        }
        return Functions.funcall(var136, var161, var32);
    }
    
    public static SubLObject f29174(final SubLObject var24, final SubLObject var120, final SubLObject var122, final SubLObject var4) {
        if (NIL != var120 && $ic124$ == var122) {
            PrintLow.format(var4, (SubLObject)$ic146$, var24);
            streams_high.force_output(var4);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29177(final SubLObject var163, final SubLObject var24, final SubLObject var183, final SubLObject var120, final SubLObject var122, final SubLObject var4) {
        if (NIL != var120 && $ic124$ == var122) {
            PrintLow.format(var4, (SubLObject)$ic147$, var163, var183);
        }
        if ($ic148$ == var122) {
            PrintLow.format(var4, (SubLObject)$ic149$, new SubLObject[] { var163, var183, var24, f29139(f29156(var24)) });
        }
        streams_high.force_output(var4);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29179(final SubLObject var4, final SubLObject var120, final SubLObject var181, final SubLObject var30, final SubLObject var136, final SubLObject var32, final SubLObject var161, final SubLObject var80, final SubLObject var162) {
        final SubLThread var182 = SubLProcess.currentSubLThread();
        if (NIL != var120) {
            final SubLObject var183 = print_high.$print_pretty$.currentBinding(var182);
            try {
                print_high.$print_pretty$.bind((SubLObject)T, var182);
                PrintLow.format(var4, (SubLObject)$ic150$);
                PrintLow.format(var4, (SubLObject)$ic151$, var181);
                PrintLow.format(var4, (SubLObject)$ic152$, var30);
                if (var136.isFunctionSpec()) {
                    PrintLow.format(var4, (SubLObject)$ic153$, var136);
                }
                PrintLow.format(var4, (SubLObject)$ic154$, var161);
                PrintLow.format(var4, (SubLObject)$ic155$, var32);
                PrintLow.format(var4, (SubLObject)$ic156$, var162);
                PrintLow.format(var4, (SubLObject)$ic157$, var80);
                PrintLow.format(var4, (SubLObject)$ic158$);
                streams_high.force_output(var4);
            }
            finally {
                print_high.$print_pretty$.rebind(var183, var182);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29184() {
        final SubLObject var160 = module0373.f26113();
        final SubLObject var161 = module0361.f24194(var160, (SubLObject)ZERO_INTEGER);
        return var161;
    }
    
    public static SubLObject f29185() {
        final SubLObject var157 = f29184();
        final SubLObject var158 = inference_datastructures_inference_oc.f25597(var157);
        final SubLObject var159 = inference_datastructures_inference_oc.f25606(var157);
        return Values.values(var158, var159);
    }
    
    public static SubLObject f29186() {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)ZERO_INTEGER), f29185());
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29188() {
        $g3400$ = SubLFiles.defparameter("S#32360", (SubLObject)NIL);
        $g3401$ = SubLFiles.defparameter("S#32361", (SubLObject)$ic0$);
        $g3402$ = SubLFiles.defconstant("S#32362", (SubLObject)$ic1$);
        $g3403$ = SubLFiles.defconstant("S#32363", (SubLObject)$ic67$);
        $g3404$ = SubLFiles.deflexical("S#32364", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic71$)) ? $g3404$.getGlobalValue() : NIL));
        $g3405$ = SubLFiles.deflexical("S#32365", (NIL != Symbols.boundp((SubLObject)$ic72$)) ? $g3405$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic73$, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED));
        $g3406$ = SubLFiles.deflexical("S#32366", (SubLObject)$ic99$);
        $g3407$ = SubLFiles.deflexical("S#32367", (SubLObject)$ic103$);
        $g3408$ = SubLFiles.defparameter("S#32368", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f29189() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g3402$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic8$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic9$);
        Structures.def_csetf((SubLObject)$ic10$, (SubLObject)$ic11$);
        Structures.def_csetf((SubLObject)$ic12$, (SubLObject)$ic13$);
        Structures.def_csetf((SubLObject)$ic14$, (SubLObject)$ic15$);
        Structures.def_csetf((SubLObject)$ic16$, (SubLObject)$ic17$);
        Structures.def_csetf((SubLObject)$ic18$, (SubLObject)$ic19$);
        Structures.def_csetf((SubLObject)$ic20$, (SubLObject)$ic21$);
        Structures.def_csetf((SubLObject)$ic22$, (SubLObject)$ic23$);
        Structures.def_csetf((SubLObject)$ic24$, (SubLObject)$ic25$);
        Structures.def_csetf((SubLObject)$ic26$, (SubLObject)$ic27$);
        Structures.def_csetf((SubLObject)$ic28$, (SubLObject)$ic29$);
        Structures.def_csetf((SubLObject)$ic30$, (SubLObject)$ic31$);
        Structures.def_csetf((SubLObject)$ic32$, (SubLObject)$ic33$);
        Structures.def_csetf((SubLObject)$ic34$, (SubLObject)$ic35$);
        Structures.def_csetf((SubLObject)$ic36$, (SubLObject)$ic37$);
        Structures.def_csetf((SubLObject)$ic38$, (SubLObject)$ic39$);
        Structures.def_csetf((SubLObject)$ic40$, (SubLObject)$ic41$);
        Equality.identity((SubLObject)$ic1$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g3402$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic63$));
        module0021.f1193($g3403$.getGlobalValue(), (SubLObject)$ic68$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g3402$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic69$));
        module0003.f57((SubLObject)$ic71$);
        module0003.f57((SubLObject)$ic72$);
        module0001.f5((SubLObject)$ic97$, (SubLObject)$ic98$);
        module0002.f50((SubLObject)$ic93$, (SubLObject)$ic97$);
        module0002.f50((SubLObject)$ic104$, (SubLObject)$ic97$);
        module0002.f50((SubLObject)$ic95$, (SubLObject)$ic97$);
        module0002.f50((SubLObject)$ic96$, (SubLObject)$ic97$);
        return (SubLObject)NIL;
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
        $g3400$ = null;
        $g3401$ = null;
        $g3402$ = null;
        $g3403$ = null;
        $g3404$ = null;
        $g3405$ = null;
        $g3406$ = null;
        $g3407$ = null;
        $g3408$ = null;
        $ic0$ = makeKeyword("UNINITIALIZED");
        $ic1$ = makeSymbol("S#32270", "CYC");
        $ic2$ = makeSymbol("S#2622", "CYC");
        $ic3$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#29", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#14349", "CYC"), makeSymbol("S#5852", "CYC"), makeSymbol("S#3267", "CYC"), makeSymbol("S#32369", "CYC"), makeSymbol("S#32370", "CYC"), makeSymbol("S#32371", "CYC"), makeSymbol("S#713", "CYC"), makeSymbol("S#2607", "CYC"), makeSymbol("S#2605", "CYC"), makeSymbol("S#32372", "CYC"), makeSymbol("S#32373", "CYC"), makeSymbol("CREATOR"), makeSymbol("S#2608", "CYC"), makeSymbol("S#32374", "CYC") });
        $ic4$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeKeyword("COMMENT"), makeKeyword("SENTENCE"), makeKeyword("PROPERTIES"), makeKeyword("RESULT"), makeKeyword("HALT-REASON"), makeKeyword("RESULT-TEST"), makeKeyword("FOLLOWUPS"), makeKeyword("BINDINGS"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?"), makeKeyword("SUBTYPE") });
        $ic5$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#32277", "CYC"), makeSymbol("S#32278", "CYC"), makeSymbol("S#32279", "CYC"), makeSymbol("S#32280", "CYC"), makeSymbol("S#32281", "CYC"), makeSymbol("S#32282", "CYC"), makeSymbol("S#32283", "CYC"), makeSymbol("S#32284", "CYC"), makeSymbol("S#32285", "CYC"), makeSymbol("S#32286", "CYC"), makeSymbol("S#32287", "CYC"), makeSymbol("S#32288", "CYC"), makeSymbol("S#32289", "CYC"), makeSymbol("S#32290", "CYC"), makeSymbol("S#32291", "CYC"), makeSymbol("S#32292", "CYC") });
        $ic6$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#32293", "CYC"), makeSymbol("S#32294", "CYC"), makeSymbol("S#32295", "CYC"), makeSymbol("S#32296", "CYC"), makeSymbol("S#32297", "CYC"), makeSymbol("S#32298", "CYC"), makeSymbol("S#32299", "CYC"), makeSymbol("S#32300", "CYC"), makeSymbol("S#32301", "CYC"), makeSymbol("S#32302", "CYC"), makeSymbol("S#32303", "CYC"), makeSymbol("S#32304", "CYC"), makeSymbol("S#32305", "CYC"), makeSymbol("S#32306", "CYC"), makeSymbol("S#32307", "CYC"), makeSymbol("S#32308", "CYC") });
        $ic7$ = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $ic8$ = makeSymbol("S#32276", "CYC");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2622", "CYC"));
        $ic10$ = makeSymbol("S#32277", "CYC");
        $ic11$ = makeSymbol("S#32293", "CYC");
        $ic12$ = makeSymbol("S#32278", "CYC");
        $ic13$ = makeSymbol("S#32294", "CYC");
        $ic14$ = makeSymbol("S#32279", "CYC");
        $ic15$ = makeSymbol("S#32295", "CYC");
        $ic16$ = makeSymbol("S#32280", "CYC");
        $ic17$ = makeSymbol("S#32296", "CYC");
        $ic18$ = makeSymbol("S#32281", "CYC");
        $ic19$ = makeSymbol("S#32297", "CYC");
        $ic20$ = makeSymbol("S#32282", "CYC");
        $ic21$ = makeSymbol("S#32298", "CYC");
        $ic22$ = makeSymbol("S#32283", "CYC");
        $ic23$ = makeSymbol("S#32299", "CYC");
        $ic24$ = makeSymbol("S#32284", "CYC");
        $ic25$ = makeSymbol("S#32300", "CYC");
        $ic26$ = makeSymbol("S#32285", "CYC");
        $ic27$ = makeSymbol("S#32301", "CYC");
        $ic28$ = makeSymbol("S#32286", "CYC");
        $ic29$ = makeSymbol("S#32302", "CYC");
        $ic30$ = makeSymbol("S#32287", "CYC");
        $ic31$ = makeSymbol("S#32303", "CYC");
        $ic32$ = makeSymbol("S#32288", "CYC");
        $ic33$ = makeSymbol("S#32304", "CYC");
        $ic34$ = makeSymbol("S#32289", "CYC");
        $ic35$ = makeSymbol("S#32305", "CYC");
        $ic36$ = makeSymbol("S#32290", "CYC");
        $ic37$ = makeSymbol("S#32306", "CYC");
        $ic38$ = makeSymbol("S#32291", "CYC");
        $ic39$ = makeSymbol("S#32307", "CYC");
        $ic40$ = makeSymbol("S#32292", "CYC");
        $ic41$ = makeSymbol("S#32308", "CYC");
        $ic42$ = makeKeyword("NAME");
        $ic43$ = makeKeyword("COMMENT");
        $ic44$ = makeKeyword("SENTENCE");
        $ic45$ = makeKeyword("PROPERTIES");
        $ic46$ = makeKeyword("RESULT");
        $ic47$ = makeKeyword("HALT-REASON");
        $ic48$ = makeKeyword("RESULT-TEST");
        $ic49$ = makeKeyword("FOLLOWUPS");
        $ic50$ = makeKeyword("BINDINGS");
        $ic51$ = makeKeyword("KB");
        $ic52$ = makeKeyword("OWNER");
        $ic53$ = makeKeyword("BUG-NUMBER");
        $ic54$ = makeKeyword("CREATION-DATE");
        $ic55$ = makeKeyword("CREATOR");
        $ic56$ = makeKeyword("WORKING?");
        $ic57$ = makeKeyword("SUBTYPE");
        $ic58$ = makeString("Invalid slot ~S for construction function");
        $ic59$ = makeKeyword("BEGIN");
        $ic60$ = makeSymbol("S#32309", "CYC");
        $ic61$ = makeKeyword("SLOT");
        $ic62$ = makeKeyword("END");
        $ic63$ = makeSymbol("S#32311", "CYC");
        $ic64$ = makeSymbol("S#2609", "CYC");
        $ic65$ = makeString("Cannot build inference test recipe; symbolic form of result test function ~A unknown.");
        $ic66$ = makeKeyword("EXPECTED-RESULT");
        $ic67$ = makeInteger(513);
        $ic68$ = makeSymbol("S#32329", "CYC");
        $ic69$ = makeSymbol("S#32326", "CYC");
        $ic70$ = makeString("Deserialization produced ~A instead of ~A for IUT ~A.");
        $ic71$ = makeSymbol("S#32364", "CYC");
        $ic72$ = makeSymbol("S#32365", "CYC");
        $ic73$ = makeInteger(212);
        $ic74$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11212", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic75$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic76$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic77$ = makeKeyword("DONE");
        $ic78$ = makeUninternedSymbol("US#30670D5");
        $ic79$ = makeSymbol("DO-LIST");
        $ic80$ = makeSymbol("CLET");
        $ic81$ = makeSymbol("S#32331", "CYC");
        $ic82$ = ConsesLow.list((SubLObject)makeSymbol("S#14349", "CYC"), (SubLObject)makeSymbol("S#5852", "CYC"), (SubLObject)makeSymbol("S#32375", "CYC"), (SubLObject)makeSymbol("S#32376", "CYC"), (SubLObject)makeSymbol("S#32377", "CYC"));
        $ic83$ = makeKeyword("CONTINUE");
        $ic84$ = makeKeyword("PREVIOUS");
        $ic85$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#29", "CYC"), makeSymbol("&REST"), makeSymbol("S#138", "CYC"), makeSymbol("&KEY"), makeSymbol("S#14349", "CYC"), makeSymbol("S#5852", "CYC"), makeSymbol("S#32375", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#32377", "CYC"), (SubLObject)makeKeyword("EXHAUST-TOTAL")), makeSymbol("S#32376", "CYC"), makeSymbol("COMMENT"), makeSymbol("S#32371", "CYC"), makeSymbol("S#713", "CYC"), ConsesLow.list((SubLObject)makeSymbol("S#2607", "CYC"), (SubLObject)makeKeyword("TINY")), makeSymbol("S#2605", "CYC"), makeSymbol("S#32378", "CYC"), makeSymbol("S#32379", "CYC"), makeSymbol("CREATOR"), ConsesLow.list((SubLObject)makeSymbol("S#2608", "CYC"), (SubLObject)T), makeSymbol("S#32374", "CYC"), makeSymbol("&ALLOW-OTHER-KEYS") });
        $ic86$ = makeKeyword("EXPECTED-HALT-REASON");
        $ic87$ = makeKeyword("EXHAUST-TOTAL");
        $ic88$ = makeKeyword("EXPECTED-RESULT-TEST");
        $ic89$ = makeKeyword("TINY");
        $ic90$ = makeKeyword("BUG");
        $ic91$ = makeKeyword("CREATED");
        $ic92$ = makeSymbol("PROGN");
        $ic93$ = makeSymbol("S#32339", "CYC");
        $ic94$ = makeSymbol("QUOTE");
        $ic95$ = makeSymbol("S#32342", "CYC");
        $ic96$ = makeSymbol("S#32343", "CYC");
        $ic97$ = makeSymbol("DEFINE-INFERENCE-UNIT-TEST");
        $ic98$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic99$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeKeyword("COMMENT"), makeKeyword("SENTENCE"), makeKeyword("PROPERTIES"), makeKeyword("EXPECTED-RESULT"), makeKeyword("EXPECTED-HALT-REASON"), makeKeyword("EXPECTED-RESULT-TEST"), makeKeyword("FOLLOWUPS"), makeKeyword("BINDINGS"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG"), makeKeyword("CREATION"), makeKeyword("CREATOR"), makeKeyword("WORKING?"), makeKeyword("SUBTYPE") });
        $ic100$ = makeSymbol("S#748", "CYC");
        $ic101$ = makeString("~s is not a known ~a");
        $ic102$ = makeSymbol("S#32338", "CYC");
        $ic103$ = ConsesLow.list((SubLObject)makeKeyword("SENTENCE"), (SubLObject)makeKeyword("PROPERTIES"), (SubLObject)makeKeyword("EXPECTED-RESULT"), (SubLObject)makeKeyword("EXPECTED-HALT-REASON"), (SubLObject)makeKeyword("EXPECTED-RESULT-TEST"));
        $ic104$ = makeSymbol("S#32341", "CYC");
        $ic105$ = makeSymbol("S#32340", "CYC");
        $ic106$ = makeSymbol("KEYWORDP");
        $ic107$ = makeSymbol("S#13920", "CYC");
        $ic108$ = makeSymbol("QUERY-PROPERTY-P");
        $ic109$ = makeSymbol("S#18090", "CYC");
        $ic110$ = makeSymbol("S#26559", "CYC");
        $ic111$ = makeSymbol("S#73", "CYC");
        $ic112$ = makeSymbol("S#32271", "CYC");
        $ic113$ = makeSymbol("S#747", "CYC");
        $ic114$ = makeSymbol("S#32335", "CYC");
        $ic115$ = makeSymbol("S#9610", "CYC");
        $ic116$ = makeSymbol("S#2526", "CYC");
        $ic117$ = makeSymbol("S#32272", "CYC");
        $ic118$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic119$ = makeSymbol("S#4999", "CYC");
        $ic120$ = makeSymbol("STRINGP");
        $ic121$ = makeSymbol("BOOLEANP");
        $ic122$ = makeKeyword("CONDITIONAL-SENTENCE?");
        $ic123$ = makeString("The test ~S is not queried with :conditional-sentence? T.");
        $ic124$ = makeKeyword("STANDARD");
        $ic125$ = makeKeyword("VERBOSE");
        $ic126$ = makeKeyword("TERSE");
        $ic127$ = makeKeyword("IUT");
        $ic128$ = makeSymbol("S#2688", "CYC");
        $ic129$ = makeSymbol("S#2621", "CYC");
        $ic130$ = makeSymbol("S#2737", "CYC");
        $ic131$ = makeString("No test with name ~a was found");
        $ic132$ = makeKeyword("NOT-RUN");
        $ic133$ = makeKeyword("INVALID");
        $ic134$ = makeKeyword("SUCCESS");
        $ic135$ = makeSymbol("S#15496", "CYC");
        $ic136$ = makeKeyword("UNPROVIDED");
        $ic137$ = makeKeyword("PROBLEM-STORE");
        $ic138$ = makeString("Previous inference was not browsable");
        $ic139$ = makeKeyword("FAILURE");
        $ic140$ = makeKeyword("SKIP");
        $ic141$ = makeKeyword("BLOCK?");
        $ic142$ = ConsesLow.list((SubLObject)makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)ONE_INTEGER, (SubLObject)makeKeyword("MAX-TIME"), (SubLObject)NIL);
        $ic143$ = makeKeyword("BROWSABLE?");
        $ic144$ = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
        $ic145$ = makeKeyword("PRUNING");
        $ic146$ = makeString("~&:IUT ~S -> ");
        $ic147$ = makeString("~S (~,3f)~%");
        $ic148$ = makeKeyword("POST-BUILD");
        $ic149$ = makeString("~&~S (~S) :IUT ~S :OWNER ~S~%");
        $ic150$ = makeString("~%Failure when asking");
        $ic151$ = makeString("~%~%  ~S");
        $ic152$ = makeString("~%~%with properties ~s");
        $ic153$ = makeString("~%Result test : ~s");
        $ic154$ = makeString("~%Actual result   : ~s");
        $ic155$ = makeString("~%Expected result : ~s");
        $ic156$ = makeString("~%Actual halt reason   : ~s");
        $ic157$ = makeString("~%Expected halt reason : ~s");
        $ic158$ = makeString("~%~%");
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
        public static final SubLStructDeclNative structDecl;
        
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
            structDecl = Structures.makeStructDeclNative((Class)$sX32270_native.class, $ic1$, $ic2$, $ic3$, $ic4$, new String[] { "$name", "$comment", "$sentence", "$properties", "$result", "$halt_reason", "$result_test", "$followups", "$bindings", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP", "$subtype" }, $ic5$, $ic6$, $ic7$);
        }
    }
    
    public static final class $f29093$UnaryFunction extends UnaryFunction
    {
        public $f29093$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2622"));
        }
        
        public SubLObject processItem(final SubLObject var5) {
            return f29093(var5);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 556 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/