package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0295 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0295";
    public static final String myFingerPrint = "6b9a2f321c202b2286312ead23d00dfc8714bb93c02345e2ab974e107ae7b70b";
    public static SubLSymbol $g2681$;
    public static SubLSymbol $g2682$;
    private static SubLSymbol $g2683$;
    private static SubLSymbol $g2684$;
    private static SubLSymbol $g2685$;
    private static SubLSymbol $g2686$;
    private static SubLSymbol $g2687$;
    private static SubLSymbol $g2688$;
    private static SubLSymbol $g2689$;
    private static SubLSymbol $g2690$;
    public static SubLSymbol $g2691$;
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
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLList $ic30$;
    private static final SubLList $ic31$;
    private static final SubLList $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLList $ic35$;
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
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLString $ic66$;
    private static final SubLString $ic67$;
    private static final SubLString $ic68$;
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLObject $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLObject $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLList $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLList $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLList $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLList $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLInteger $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLObject $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLObject $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLObject $ic122$;
    private static final SubLObject $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLString $ic125$;
    private static final SubLList $ic126$;
    
    public static SubLObject f19775(final SubLObject var1, final SubLObject var2) {
        f19776(var1, var2, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19777(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX22425_native.class) ? T : NIL);
    }
    
    public static SubLObject f19778(final SubLObject var1) {
        assert NIL != f19777(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f19779(final SubLObject var1) {
        assert NIL != f19777(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f19780(final SubLObject var1) {
        assert NIL != f19777(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f19781(final SubLObject var1) {
        assert NIL != f19777(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f19782(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19777(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f19783(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19777(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f19784(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19777(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f19785(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19777(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f19786(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX22425_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic17$)) {
                f19782(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic18$)) {
                f19783(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f19784(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic20$)) {
                f19785(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f19787(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic17$, f19778(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic18$, f19779(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic19$, f19780(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic20$, f19781(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic23$, (SubLObject)FOUR_INTEGER);
        return var11;
    }
    
    public static SubLObject f19788(final SubLObject var11, final SubLObject var12) {
        return f19787(var11, var12);
    }
    
    public static SubLObject f19789(final SubLObject var1, final SubLObject var2) {
        f19790(var1, var2, (SubLObject)ZERO_INTEGER, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19791(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX22427_native.class) ? T : NIL);
    }
    
    public static SubLObject f19792(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f19793(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f19794(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField4();
    }
    
    public static SubLObject f19795(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField5();
    }
    
    public static SubLObject f19796(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField6();
    }
    
    public static SubLObject f19797(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField7();
    }
    
    public static SubLObject f19798(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField8();
    }
    
    public static SubLObject f19799(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField9();
    }
    
    public static SubLObject f19800(final SubLObject var1) {
        assert NIL != f19791(var1) : var1;
        return var1.getField10();
    }
    
    public static SubLObject f19801(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f19802(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f19803(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField4(var4);
    }
    
    public static SubLObject f19804(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField5(var4);
    }
    
    public static SubLObject f19805(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField6(var4);
    }
    
    public static SubLObject f19806(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField7(var4);
    }
    
    public static SubLObject f19807(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField8(var4);
    }
    
    public static SubLObject f19808(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField9(var4);
    }
    
    public static SubLObject f19809(final SubLObject var1, final SubLObject var4) {
        assert NIL != f19791(var1) : var1;
        return var1.setField10(var4);
    }
    
    public static SubLObject f19810(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX22427_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic54$)) {
                f19801(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic55$)) {
                f19802(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic19$)) {
                f19803(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic56$)) {
                f19804(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic57$)) {
                f19805(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic58$)) {
                f19806(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic59$)) {
                f19807(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic60$)) {
                f19808(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic61$)) {
                f19809(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic21$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f19811(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic22$, (SubLObject)$ic62$, (SubLObject)NINE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic54$, f19792(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic55$, f19793(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic19$, f19794(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic56$, f19795(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic57$, f19796(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic58$, f19797(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic59$, f19798(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic60$, f19799(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic24$, (SubLObject)$ic61$, f19800(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic25$, (SubLObject)$ic62$, (SubLObject)NINE_INTEGER);
        return var11;
    }
    
    public static SubLObject f19812(final SubLObject var11, final SubLObject var12) {
        return f19811(var11, var12);
    }
    
    public static SubLObject f19776(final SubLObject var16, final SubLObject var2, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = module0291.f19599();
        }
        if (var18.isZero()) {
            PrintLow.format(var2, (SubLObject)$ic64$);
        }
        else if (ONE_INTEGER.numE(var18)) {
            PrintLow.format(var2, (SubLObject)$ic65$, f19813(var16));
        }
        else if (var18.numGE((SubLObject)TWO_INTEGER)) {
            PrintLow.format(var2, (SubLObject)$ic66$, new SubLObject[] { f19813(var16), f19814(var16), f19815(var16), f19816(var16) });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19813(final SubLObject var19) {
        return f19778(var19);
    }
    
    public static SubLObject f19817(final SubLObject var19) {
        return module0004.f91(f19814(var19), module0202.f12702(f19813(var19)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19814(final SubLObject var19) {
        return f19779(var19);
    }
    
    public static SubLObject f19815(final SubLObject var19) {
        return f19780(var19);
    }
    
    public static SubLObject f19816(final SubLObject var19) {
        return f19781(var19);
    }
    
    public static SubLObject f19818(final SubLObject var19) {
        return module0232.f15323(f19778(var19));
    }
    
    public static SubLObject f19790(final SubLObject var16, final SubLObject var2, final SubLObject var17, SubLObject var18) {
        if (var18 == UNPROVIDED) {
            var18 = module0291.f19599();
        }
        if (var18.isZero()) {
            PrintLow.format(var2, (SubLObject)$ic67$, f19819(var16));
        }
        else if (ONE_INTEGER.numE(var18)) {
            PrintLow.format(var2, (SubLObject)$ic68$, new SubLObject[] { f19820(var16), f19821(var16), f19822(var16) });
        }
        else if (TWO_INTEGER.numE(var18)) {
            PrintLow.format(var2, (SubLObject)$ic69$, new SubLObject[] { f19820(var16), f19821(var16), f19822(var16), f19823(var16), f19824(var16), f19819(var16), f19825(var16) });
        }
        else if (THREE_INTEGER.numGE(var18)) {
            PrintLow.format(var2, (SubLObject)$ic70$, new SubLObject[] { f19820(var16), f19821(var16), f19822(var16), f19823(var16), f19824(var16), f19819(var16), f19825(var16), f19826(var16), f19827(var16) });
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19820(final SubLObject var20) {
        return f19792(var20);
    }
    
    public static SubLObject f19821(final SubLObject var20) {
        return f19793(var20);
    }
    
    public static SubLObject f19828(final SubLObject var20, final SubLObject var21) {
        if (var21.eql($ic71$)) {
            return f19820(var20);
        }
        if (var21.eql($ic72$)) {
            return f19821(var20);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19829(final SubLObject var20, final SubLObject var21) {
        if (var21.eql($ic71$)) {
            return f19821(var20);
        }
        if (var21.eql($ic72$)) {
            return f19820(var20);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19830(final SubLObject var20) {
        return f19814(f19820(var20));
    }
    
    public static SubLObject f19831(final SubLObject var20) {
        return f19814(f19821(var20));
    }
    
    public static SubLObject f19832(final SubLObject var20, final SubLObject var21) {
        if (var21.eql($ic71$)) {
            return f19830(var20);
        }
        if (var21.eql($ic72$)) {
            return f19831(var20);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19833(final SubLObject var20, final SubLObject var21) {
        if (var21.eql($ic71$)) {
            return f19831(var20);
        }
        if (var21.eql($ic72$)) {
            return f19830(var20);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19822(final SubLObject var20) {
        return f19794(var20);
    }
    
    public static SubLObject f19823(final SubLObject var20) {
        return f19795(var20);
    }
    
    public static SubLObject f19824(final SubLObject var20) {
        return f19796(var20);
    }
    
    public static SubLObject f19834(final SubLObject var20) {
        return f19797(var20);
    }
    
    public static SubLObject f19819(final SubLObject var20) {
        return assertion_handles_oc.f11025(f19834(var20));
    }
    
    public static SubLObject f19825(final SubLObject var20) {
        return f19798(var20);
    }
    
    public static SubLObject f19826(final SubLObject var20) {
        return f19799(var20);
    }
    
    public static SubLObject f19827(final SubLObject var20) {
        return f19800(var20);
    }
    
    public static SubLObject f19835() {
        return $g2683$.getGlobalValue();
    }
    
    public static SubLObject f19836() {
        return $g2684$.getGlobalValue();
    }
    
    public static SubLObject f19837() {
        return $g2685$.getGlobalValue();
    }
    
    public static SubLObject f19838() {
        return $g2686$.getGlobalValue();
    }
    
    public static SubLObject f19839() {
        return $g2687$.getGlobalValue();
    }
    
    public static SubLObject f19840(final SubLObject var22, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLObject var24 = f19841(var22);
        if (NIL != var24) {
            return f19842(var24, var23);
        }
        module0293.f19714((SubLObject)THREE_INTEGER, (SubLObject)$ic78$, var22, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19843(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f19844(var22);
        final SubLObject var25 = module0291.f19561(var24);
        final SubLObject var26 = f19845(var22);
        if (NIL != var25) {
            final SubLObject var27 = module0291.$g2668$.getDynamicValue(var23);
            SubLObject var28 = (SubLObject)NIL;
            try {
                var28 = Locks.seize_lock(var27);
                f19808(var25, (SubLObject)ConsesLow.cons(var26, f19799(var25)));
            }
            finally {
                if (NIL != var28) {
                    Locks.release_lock(var27);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19846(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f19847(var22);
        final SubLObject var25 = f19848(var22);
        final SubLObject var26 = f19849(var22);
        final SubLObject var27 = module0178.f11287(var22);
        final SubLObject var28 = module0291.f19561(var26);
        final SubLObject var29 = f19850(var24, var27);
        if (NIL != var28) {
            final SubLObject var30 = module0291.$g2668$.getDynamicValue(var23);
            SubLObject var31 = (SubLObject)NIL;
            try {
                var31 = Locks.seize_lock(var30);
                f19805(var28, f19851(var25, var29, f19796(var28)));
            }
            finally {
                if (NIL != var31) {
                    Locks.release_lock(var30);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19852(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f19853(var22);
        final SubLObject var25 = module0178.f11287(var22);
        final SubLObject var26 = f19854(var24, var25);
        final SubLObject var27 = f19855(var22);
        final SubLObject var28 = module0291.f19561(var27);
        if (NIL != var28) {
            final SubLObject var29 = module0291.$g2668$.getDynamicValue(var23);
            SubLObject var30 = (SubLObject)NIL;
            try {
                var30 = Locks.seize_lock(var29);
                f19809(var28, module0291.f19588(var26, f19800(var28)));
            }
            finally {
                if (NIL != var30) {
                    Locks.release_lock(var29);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19856(final SubLObject var22) {
        final SubLObject var23 = module0291.f19561(var22);
        if (NIL != var23) {
            return f19857(var23);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19858(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f19844(var22);
        final SubLObject var25 = module0291.f19561(var24);
        final SubLObject var26 = f19845(var22);
        if (NIL != var25) {
            final SubLObject var27 = module0291.$g2668$.getDynamicValue(var23);
            SubLObject var28 = (SubLObject)NIL;
            try {
                var28 = Locks.seize_lock(var27);
                f19808(var25, Sequences.delete(var26, f19799(var25), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            }
            finally {
                if (NIL != var28) {
                    Locks.release_lock(var27);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19859(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f19847(var22);
        final SubLObject var25 = f19848(var22);
        final SubLObject var26 = f19849(var22);
        final SubLObject var27 = module0178.f11287(var22);
        final SubLObject var28 = module0291.f19561(var26);
        final SubLObject var29 = f19850(var24, var27);
        if (NIL != var28) {
            final SubLObject var30 = module0291.$g2668$.getDynamicValue(var23);
            SubLObject var31 = (SubLObject)NIL;
            try {
                var31 = Locks.seize_lock(var30);
                f19805(var28, f19860(var25, var29, f19796(var28)));
            }
            finally {
                if (NIL != var31) {
                    Locks.release_lock(var30);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19861(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = f19853(var22);
        final SubLObject var25 = module0178.f11287(var22);
        final SubLObject var26 = f19854(var24, var25);
        final SubLObject var27 = f19855(var22);
        final SubLObject var28 = module0291.f19561(var27);
        if (NIL != var28) {
            final SubLObject var29 = module0291.$g2668$.getDynamicValue(var23);
            SubLObject var30 = (SubLObject)NIL;
            try {
                var30 = Locks.seize_lock(var29);
                f19809(var28, module0291.f19592(var26, f19800(var28)));
            }
            finally {
                if (NIL != var30) {
                    Locks.release_lock(var29);
                }
            }
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19842(final SubLObject var20, SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLObject var24 = f19834(var20);
        final SubLObject var25 = f19820(var20);
        final SubLObject var26 = f19821(var20);
        final SubLObject var27 = f19813(var25);
        final SubLObject var28 = f19813(var26);
        final SubLObject var29 = f19816(var25);
        final SubLObject var30 = f19816(var26);
        SubLObject var31 = (SubLObject)NIL;
        SubLObject var32 = (SubLObject)NIL;
        if (NIL != var23) {
            final SubLObject var52_53 = var23;
            SubLObject var33 = (SubLObject)NIL;
            try {
                var33 = Locks.seize_lock(var52_53);
                Hashtables.sethash(var24, $g2683$.getGlobalValue(), var20);
            }
            finally {
                if (NIL != var33) {
                    Locks.release_lock(var52_53);
                }
            }
        }
        else {
            Hashtables.sethash(var24, $g2683$.getGlobalValue(), var20);
        }
        var31 = f19862(var27, var24, var23);
        var32 = f19862(var28, var24, var23);
        if (NIL == var31 || NIL == var32) {
            SubLObject var34 = (SubLObject)NIL;
            if (NIL != var31) {
                var34 = var30;
            }
            else if (NIL != var32) {
                var34 = var29;
            }
            else {
                var34 = ConsesLow.append(var29, var30);
            }
            SubLObject var35 = var34;
            SubLObject var36 = (SubLObject)NIL;
            var36 = var35.first();
            while (NIL != var35) {
                if (NIL != var23) {
                    final SubLObject var58_59 = var23;
                    SubLObject var37 = (SubLObject)NIL;
                    try {
                        var37 = Locks.seize_lock(var58_59);
                        module0030.f1599(var36, var24, $g2684$.getGlobalValue());
                    }
                    finally {
                        if (NIL != var37) {
                            Locks.release_lock(var58_59);
                        }
                    }
                }
                else {
                    module0030.f1599(var36, var24, $g2684$.getGlobalValue());
                }
                var35 = var35.rest();
                var36 = var35.first();
            }
            if (NIL == var29 || NIL == var30) {
                $g2687$.setGlobalValue((SubLObject)ConsesLow.cons(var20, $g2687$.getGlobalValue()));
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f19862(final SubLObject var61, final SubLObject var22, final SubLObject var23) {
        SubLObject var62 = (SubLObject)NIL;
        if (NIL != constant_handles_oc.f8449(var61)) {
            if (NIL != var23) {
                SubLObject var63 = (SubLObject)NIL;
                try {
                    var63 = Locks.seize_lock(var23);
                    module0030.f1599(var61, var22, $g2685$.getGlobalValue());
                }
                finally {
                    if (NIL != var63) {
                        Locks.release_lock(var23);
                    }
                }
            }
            else {
                module0030.f1599(var61, var22, $g2685$.getGlobalValue());
            }
            var62 = (SubLObject)T;
        }
        else if (NIL != module0167.f10813(var61)) {
            if (NIL != var23) {
                SubLObject var64 = (SubLObject)NIL;
                try {
                    var64 = Locks.seize_lock(var23);
                    module0030.f1599(var61, var22, $g2686$.getGlobalValue());
                }
                finally {
                    if (NIL != var64) {
                        Locks.release_lock(var23);
                    }
                }
            }
            else {
                module0030.f1599(var61, var22, $g2686$.getGlobalValue());
            }
            var62 = (SubLObject)T;
        }
        return var62;
    }
    
    public static SubLObject f19857(final SubLObject var20) {
        final SubLThread var21 = SubLProcess.currentSubLThread();
        final SubLObject var22 = f19834(var20);
        final SubLObject var23 = f19813(f19820(var20));
        final SubLObject var24 = f19813(f19821(var20));
        final SubLObject var25 = f19863(var20);
        final SubLObject var26 = module0291.$g2668$.getDynamicValue(var21);
        SubLObject var27 = (SubLObject)NIL;
        try {
            var27 = Locks.seize_lock(var26);
            Hashtables.remhash(var22, $g2683$.getGlobalValue());
        }
        finally {
            if (NIL != var27) {
                Locks.release_lock(var26);
            }
        }
        f19864(var23, var22);
        f19864(var24, var22);
        SubLObject var28 = var25;
        SubLObject var29 = (SubLObject)NIL;
        var29 = var28.first();
        while (NIL != var28) {
            final SubLObject var72_73 = module0291.$g2668$.getDynamicValue(var21);
            SubLObject var74_75 = (SubLObject)NIL;
            try {
                var74_75 = Locks.seize_lock(var72_73);
                module0030.f1614(var29, var22, $g2684$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                if (NIL != var74_75) {
                    Locks.release_lock(var72_73);
                }
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        final SubLObject var76_77 = module0291.$g2668$.getDynamicValue(var21);
        SubLObject var78_79 = (SubLObject)NIL;
        try {
            var78_79 = Locks.seize_lock(var76_77);
            $g2687$.setGlobalValue(Sequences.delete(var20, $g2687$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        finally {
            if (NIL != var78_79) {
                Locks.release_lock(var76_77);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f19864(final SubLObject var61, final SubLObject var22) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        if (NIL != constant_handles_oc.f8449(var61)) {
            final SubLObject var63 = module0291.$g2668$.getDynamicValue(var62);
            SubLObject var64 = (SubLObject)NIL;
            try {
                var64 = Locks.seize_lock(var63);
                module0030.f1614(var61, var22, $g2685$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                if (NIL != var64) {
                    Locks.release_lock(var63);
                }
            }
        }
        else if (NIL != module0167.f10813(var61)) {
            final SubLObject var65 = module0291.$g2668$.getDynamicValue(var62);
            SubLObject var66 = (SubLObject)NIL;
            try {
                var66 = Locks.seize_lock(var65);
                module0030.f1614(var61, var22, $g2686$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                if (NIL != var66) {
                    Locks.release_lock(var65);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19863(final SubLObject var20) {
        return conses_high.union(f19816(f19820(var20)), f19816(f19821(var20)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19865() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)ZERO_INTEGER;
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = module0147.$g2094$.currentBinding(var24);
        final SubLObject var29 = module0147.$g2095$.currentBinding(var24);
        try {
            module0147.$g2094$.bind((SubLObject)$ic79$, var24);
            module0147.$g2095$.bind($ic80$, var24);
            var26 = Mapping.mapcan((SubLObject)$ic81$, module0291.f19552(), EMPTY_SUBL_OBJECT_ARRAY);
        }
        finally {
            module0147.$g2095$.rebind(var29, var24);
            module0147.$g2094$.rebind(var28, var24);
        }
        var27 = Sequences.length(var26);
        $g2683$.setGlobalValue(Hashtables.make_hash_table(var27, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2684$.setGlobalValue(Hashtables.make_hash_table(Numbers.multiply((SubLObject)TWO_INTEGER, var27), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2685$.setGlobalValue(Hashtables.make_hash_table(Numbers.integerDivide(var27, (SubLObject)FOUR_INTEGER), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2686$.setGlobalValue(Hashtables.make_hash_table(Numbers.integerDivide(var27, (SubLObject)FOUR_INTEGER), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2687$.setGlobalValue((SubLObject)NIL);
        var28 = module0152.$g2102$.currentBinding(var24);
        try {
            module0152.$g2102$.bind(module0151.f9695(), var24);
            final SubLObject var30 = module0152.$g2102$.getDynamicValue(var24);
            final SubLObject var87_90 = module0034.$g879$.currentBinding(var24);
            try {
                module0034.$g879$.bind(var30, var24);
                SubLObject var31 = (SubLObject)NIL;
                if (NIL != var30 && NIL == module0034.f1842(var30)) {
                    var31 = module0034.f1869(var30);
                    final SubLObject var32 = Threads.current_process();
                    if (NIL == var31) {
                        module0034.f1873(var30, var32);
                    }
                    else if (!var31.eql(var32)) {
                        Errors.error((SubLObject)$ic82$);
                    }
                }
                try {
                    if (NIL == module0151.f9690()) {
                        module0274.f18061();
                    }
                }
                finally {
                    final SubLObject var87_91 = Threads.$is_thread_performing_cleanupP$.currentBinding(var24);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var24);
                        final SubLObject var33 = module0139.$g1630$.getDynamicValue(var24);
                        final SubLObject var87_92 = module0139.$g1631$.currentBinding(var24);
                        final SubLObject var34 = module0139.$g1632$.currentBinding(var24);
                        final SubLObject var35 = module0139.$g1630$.currentBinding(var24);
                        final SubLObject var36 = module0012.$g75$.currentBinding(var24);
                        final SubLObject var37 = module0012.$g76$.currentBinding(var24);
                        final SubLObject var38 = module0012.$g77$.currentBinding(var24);
                        final SubLObject var39 = module0012.$g78$.currentBinding(var24);
                        try {
                            module0139.$g1631$.bind(module0139.f9015(var33, (SubLObject)TWELVE_INTEGER), var24);
                            module0139.$g1632$.bind(module0139.f9016(var33), var24);
                            module0139.$g1630$.bind((SubLObject)T, var24);
                            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var24);
                            module0012.$g76$.bind((SubLObject)NIL, var24);
                            module0012.$g77$.bind((SubLObject)T, var24);
                            module0012.$g78$.bind(Time.get_universal_time(), var24);
                            module0012.f478((SubLObject)$ic83$);
                            final SubLObject var40 = module0291.$g2668$.getDynamicValue(var24);
                            SubLObject var41 = (SubLObject)NIL;
                            try {
                                var41 = Locks.seize_lock(var40);
                                SubLObject var42 = var26;
                                SubLObject var43 = (SubLObject)NIL;
                                var43 = var42.first();
                                while (NIL != var42) {
                                    if (NIL != module0178.f11341(var43) || NIL != f19840(var43, (SubLObject)UNPROVIDED)) {
                                        var25 = Numbers.add(var25, (SubLObject)ONE_INTEGER);
                                        module0012.note_percent_progress(var25, var27);
                                    }
                                    var42 = var42.rest();
                                    var43 = var42.first();
                                }
                            }
                            finally {
                                if (NIL != var41) {
                                    Locks.release_lock(var40);
                                }
                            }
                            module0012.f479();
                        }
                        finally {
                            module0012.$g78$.rebind(var39, var24);
                            module0012.$g77$.rebind(var38, var24);
                            module0012.$g76$.rebind(var37, var24);
                            module0012.$g75$.rebind(var36, var24);
                            module0139.$g1630$.rebind(var35, var24);
                            module0139.$g1632$.rebind(var34, var24);
                            module0139.$g1631$.rebind(var87_92, var24);
                        }
                        if (NIL != var30 && NIL == var31) {
                            module0034.f1873(var30, (SubLObject)NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var87_91, var24);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var87_90, var24);
            }
        }
        finally {
            module0152.$g2102$.rebind(var28, var24);
        }
        return var25;
    }
    
    public static SubLObject f19866() {
        SubLObject var104 = (SubLObject)ZERO_INTEGER;
        SubLObject var105 = module0291.f19552();
        SubLObject var106 = (SubLObject)NIL;
        var106 = var105.first();
        while (NIL != var105) {
            var104 = Numbers.add(var104, module0217.f14247(var106, (SubLObject)UNPROVIDED));
            var105 = var105.rest();
            var106 = var105.first();
        }
        return var104;
    }
    
    public static SubLObject f19841(final SubLObject var22) {
        if (NIL != f19867(var22)) {
            return f19868(var22);
        }
        if (NIL != f19869(var22)) {
            return f19870(var22);
        }
        if (NIL != f19871(var22)) {
            return f19872(var22);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19868(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0178.f11333(var22);
        final SubLObject var25 = module0178.f11334(var22);
        final SubLObject var26 = module0178.f11287(var22);
        final SubLObject var27 = module0178.f11335(var22);
        if (NIL != module0205.f13145((SubLObject)$ic84$, var27, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            module0293.f19714((SubLObject)ONE_INTEGER, (SubLObject)$ic85$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var28 = module0205.f13147(var27, (SubLObject)$ic86$, (SubLObject)$ic87$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0277.f18376(var27);
        final SubLObject var30 = module0202.f12683(var25, Mapping.mapcar((SubLObject)$ic88$, module0035.f2167(var29, (SubLObject)ONE_INTEGER)), (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0202.f12973(var28, var30, (SubLObject)UNPROVIDED);
        var23.resetMultipleValues();
        final SubLObject var32 = f19873(var22, var28, var26, var24, var31);
        final SubLObject var33 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        var23.resetMultipleValues();
        final SubLObject var34 = f19873(var22, var30, var26, var24, var31);
        final SubLObject var35 = var23.secondMultipleValue();
        var23.resetMultipleValues();
        final SubLObject var36 = f19874((SubLObject)ConsesLow.list(var33, var35));
        final SubLObject var37 = (NIL != f19875(var22)) ? f19876(var32, var34, var26, var22, var36) : f19876(var34, var32, var26, var22, var36);
        return var37;
    }
    
    public static SubLObject f19870(final SubLObject var22) {
        return f19872(var22);
    }
    
    public static SubLObject f19872(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        final SubLObject var24 = module0178.f11333(var22);
        final SubLObject var25 = module0178.f11334(var22);
        final SubLObject var26 = module0178.f11335(var22);
        if (NIL != var25 && NIL != var26) {
            final SubLObject var27 = module0178.f11287(var22);
            final SubLObject var28 = module0202.f12973(var25, var26, (SubLObject)UNPROVIDED);
            var23.resetMultipleValues();
            final SubLObject var29 = f19873(var22, var25, var27, var24, var28);
            final SubLObject var30 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            var23.resetMultipleValues();
            final SubLObject var31 = f19873(var22, var26, var27, var24, var28);
            final SubLObject var32 = var23.secondMultipleValue();
            var23.resetMultipleValues();
            return f19876(var29, var31, var27, var22, f19874((SubLObject)ConsesLow.list(var30, var32)));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19876(final SubLObject var44, final SubLObject var45, final SubLObject var30, final SubLObject var22, final SubLObject var120) {
        if (NIL == var44 || NIL == var45 || NIL == module0178.f11361(var22, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        assert NIL != f19777(var44) : var44;
        assert NIL != f19777(var45) : var45;
        assert NIL != module0161.f10484(var30) : var30;
        if (var44.equalp(var45)) {
            module0293.f19714((SubLObject)THREE_INTEGER, (SubLObject)$ic90$, f19813(var44), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var121 = f19810((SubLObject)UNPROVIDED);
        final SubLObject var122 = module0205.f13327(var30);
        final SubLObject var123 = module0178.f11333(var22);
        final SubLObject var124 = f19877(var22);
        final SubLObject var125 = f19878(var22);
        final SubLObject var126 = f19879(var22);
        f19801(var121, var44);
        f19802(var121, var45);
        f19803(var121, var122);
        f19804(var121, var120);
        f19805(var121, var125);
        f19806(var121, var22);
        f19807(var121, var123);
        f19808(var121, var124);
        f19809(var121, var126);
        return var121;
    }
    
    public static SubLObject f19873(final SubLObject var22, final SubLObject var126, final SubLObject var30, final SubLObject var106, final SubLObject var112) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        SubLObject var128 = (SubLObject)NIL;
        final SubLObject var129 = module0147.$g2094$.currentBinding(var127);
        final SubLObject var130 = module0147.$g2095$.currentBinding(var127);
        try {
            module0147.$g2094$.bind((SubLObject)$ic79$, var127);
            module0147.$g2095$.bind($ic80$, var127);
            if (NIL == module0552.f33990(var126)) {
                Errors.warn((SubLObject)$ic91$, var126, var22);
                var128 = (SubLObject)T;
            }
        }
        finally {
            module0147.$g2095$.rebind(var130, var127);
            module0147.$g2094$.rebind(var129, var127);
        }
        if (NIL != var128) {
            return (SubLObject)NIL;
        }
        assert NIL != module0161.f10484(var30) : var30;
        final SubLObject var131 = f19786((SubLObject)UNPROVIDED);
        final SubLObject var132 = module0205.f13327(var30);
        f19782(var131, var126);
        f19784(var131, var132);
        return f19880(var131, var106, var112);
    }
    
    public static SubLObject f19880(final SubLObject var19, final SubLObject var106, final SubLObject var112) {
        final SubLThread var113 = SubLProcess.currentSubLThread();
        var113.resetMultipleValues();
        final SubLObject var114 = module0293.f19735(f19813(var19), f19815(var19), (SubLObject)T, (SubLObject)NIL, var106);
        final SubLObject var115 = var113.secondMultipleValue();
        var113.resetMultipleValues();
        if (NIL == var114) {
            return (SubLObject)NIL;
        }
        var113.resetMultipleValues();
        final SubLObject var116 = f19881(var114, var112);
        final SubLObject var117 = var113.secondMultipleValue();
        var113.resetMultipleValues();
        f19782(var19, var116);
        f19783(var19, var117);
        f19785(var19, f19882(var114));
        return Values.values(var19, var115);
    }
    
    public static SubLObject f19874(final SubLObject var131) {
        SubLObject var132 = (SubLObject)NIL;
        if (NIL != conses_high.member((SubLObject)$ic92$, var131, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var132 = (SubLObject)$ic92$;
        }
        else if (NIL != conses_high.member((SubLObject)$ic93$, var131, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var132 = (SubLObject)$ic93$;
        }
        else if (NIL != conses_high.member((SubLObject)$ic94$, var131, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var132 = (SubLObject)$ic94$;
        }
        else if (NIL != conses_high.member((SubLObject)$ic95$, var131, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            var132 = (SubLObject)$ic95$;
        }
        return var132;
    }
    
    public static SubLObject f19883(final SubLObject var133, final SubLObject var134) {
        SubLObject var136;
        final SubLObject var135 = var136 = var133.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var136, var135, (SubLObject)$ic96$);
        final SubLObject var137 = var136.rest();
        var136 = var136.first();
        SubLObject var138 = (SubLObject)NIL;
        SubLObject var139 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var136, var135, (SubLObject)$ic96$);
        var138 = var136.first();
        var136 = var136.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var136, var135, (SubLObject)$ic96$);
        var139 = var136.first();
        var136 = var136.rest();
        if (NIL == var136) {
            final SubLObject var140;
            var136 = (var140 = var137);
            final SubLObject var141 = (SubLObject)$ic97$;
            return (SubLObject)ConsesLow.listS((SubLObject)$ic98$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic99$, var138), (SubLObject)$ic100$, (SubLObject)ConsesLow.list(var141, (SubLObject)ConsesLow.list((SubLObject)$ic101$, (SubLObject)ConsesLow.list((SubLObject)$ic102$, (SubLObject)$ic103$, (SubLObject)ConsesLow.listS((SubLObject)$ic104$, var139, (SubLObject)$ic105$)))), (SubLObject)ConsesLow.list((SubLObject)$ic106$, var141)), ConsesLow.append(var140, (SubLObject)NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var135, (SubLObject)$ic96$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19881(final SubLObject var126, final SubLObject var112) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        SubLObject var128 = (SubLObject)NIL;
        SubLObject var129 = (SubLObject)NIL;
        final SubLObject var130 = $g2688$.currentBinding(var127);
        final SubLObject var131 = $g2689$.currentBinding(var127);
        try {
            $g2688$.bind(var112, var127);
            $g2689$.bind((SubLObject)NIL, var127);
            final SubLObject var132 = module0035.f2409(Mapping.mapcar((SubLObject)$ic107$, module0205.f13183(var126, Symbols.symbol_function((SubLObject)$ic108$), (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
            final SubLObject var87_142 = $g2690$.currentBinding(var127);
            try {
                $g2690$.bind(var132, var127);
                var128 = module0205.f13147(var126, (SubLObject)$ic109$, (SubLObject)$ic110$, (SubLObject)T, (SubLObject)UNPROVIDED);
                var129 = $g2689$.getDynamicValue(var127);
            }
            finally {
                $g2690$.rebind(var87_142, var127);
            }
        }
        finally {
            $g2689$.rebind(var131, var127);
            $g2688$.rebind(var130, var127);
        }
        return Values.values(var128, var129);
    }
    
    public static SubLObject f19884(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        return module0004.f104(var16, $g2688$.getDynamicValue(var17), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19885(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL != f19884(var16) || NIL != module0201.f12549(var16));
    }
    
    public static SubLObject f19886(final SubLObject var143) {
        final SubLThread var144 = SubLProcess.currentSubLThread();
        final SubLObject var145 = conses_high.assoc(var143, $g2689$.getDynamicValue(var144), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var145) {
            return var145.rest();
        }
        final SubLObject var146 = $g2690$.getDynamicValue(var144);
        final SubLObject var147 = module0193.f12079(var146);
        $g2690$.setDynamicValue(Numbers.add($g2690$.getDynamicValue(var144), (SubLObject)ONE_INTEGER), var144);
        $g2689$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var143, var147), $g2689$.getDynamicValue(var144)), var144);
        return var147;
    }
    
    public static SubLObject f19887(final SubLObject var147) {
        final SubLThread var148 = SubLProcess.currentSubLThread();
        final SubLObject var149 = conses_high.copy_tree(var147);
        final SubLObject var150 = var149.rest();
        final SubLObject var151 = module0193.f12079($g2690$.getDynamicValue(var148));
        f19888(var150.first(), var151);
        ConsesLow.rplaca(var150, var151);
        $g2690$.setDynamicValue(Numbers.add($g2690$.getDynamicValue(var148), (SubLObject)ONE_INTEGER), var148);
        return var149;
    }
    
    public static SubLObject f19889(final SubLObject var126) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        if (NIL != module0205.f13145((SubLObject)$ic111$, var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            SubLObject var128 = (SubLObject)NIL;
            final SubLObject var129 = $g2688$.currentBinding(var127);
            final SubLObject var130 = $g2689$.currentBinding(var127);
            try {
                $g2688$.bind((SubLObject)NIL, var127);
                $g2689$.bind((SubLObject)NIL, var127);
                final SubLObject var131 = module0035.f2409(Mapping.mapcar((SubLObject)$ic107$, module0205.f13183(var126, Symbols.symbol_function((SubLObject)$ic108$), (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
                final SubLObject var87_151 = $g2690$.currentBinding(var127);
                try {
                    $g2690$.bind(var131, var127);
                    var128 = module0036.f2531(var126, (SubLObject)$ic111$, (SubLObject)$ic112$, (SubLObject)UNPROVIDED);
                }
                finally {
                    $g2690$.rebind(var87_151, var127);
                }
            }
            finally {
                $g2689$.rebind(var130, var127);
                $g2688$.rebind(var129, var127);
            }
            return var128;
        }
        return var126;
    }
    
    public static SubLObject f19890(final SubLObject var126) {
        final SubLThread var127 = SubLProcess.currentSubLThread();
        return conses_high.nsublis($g2691$.getDynamicValue(var127), var126, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19888(final SubLObject var152, final SubLObject var153) {
        final SubLThread var154 = SubLProcess.currentSubLThread();
        final SubLObject var155 = (NIL != module0206.f13500(var153) && module0193.f12073(var153).numL((SubLObject)$ic113$)) ? module0193.f12075(Numbers.add(module0193.f12073(var153), (SubLObject)$ic113$)) : var153;
        $g2691$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var155, var152), $g2691$.getDynamicValue(var154)), var154);
        return $g2691$.getDynamicValue(var154);
    }
    
    public static SubLObject f19891(SubLObject var155) {
        SubLObject var156 = module0035.f2259((SubLObject)$ic114$, var155, (SubLObject)UNPROVIDED);
        SubLObject var157 = (SubLObject)NIL;
        var157 = var156.first();
        while (NIL != var156) {
            var155 = module0035.f2457(var155, var157, f19892(var157));
            var156 = var156.rest();
            var157 = var156.first();
        }
        return var155;
    }
    
    public static SubLObject f19893(final SubLObject var126) {
        return (SubLObject)makeBoolean($ic115$.eql(module0205.f13132(var126)) && NIL != module0035.find_if_not((SubLObject)$ic116$, module0205.f13203(var126, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f19892(final SubLObject var126) {
        if ($ic115$.eql(module0205.f13132(var126))) {
            return module0202.f12769($ic115$, module0035.remove_if_not((SubLObject)$ic116$, module0205.f13203(var126, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), module0205.f13204(var126, (SubLObject)UNPROVIDED), module0205.f13205(var126, (SubLObject)UNPROVIDED));
        }
        return var126;
    }
    
    public static SubLObject f19877(final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = assertions_low_oc.f11242(var25);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            if (NIL != module0211.f13649(var28, $ic117$) && NIL == module0178.f11341(var28)) {
                var26 = (SubLObject)ConsesLow.cons(f19845(var28), var26);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f19845(final SubLObject var158) {
        final SubLObject var159 = f19894(var158);
        final SubLObject var160 = f19895(var158);
        final SubLObject var161 = module0178.f11287(var158);
        return (SubLObject)ConsesLow.list(var159, var160, var161);
    }
    
    public static SubLObject f19894(final SubLObject var22) {
        return module0178.f11334(var22);
    }
    
    public static SubLObject f19895(final SubLObject var22) {
        return module0178.f11335(var22);
    }
    
    public static SubLObject f19844(final SubLObject var22) {
        return module0178.f11336(var22);
    }
    
    public static SubLObject f19878(final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = assertions_low_oc.f11242(var25);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            if (NIL != module0211.f13649(var28, $ic118$) && NIL == module0178.f11341(var28)) {
                final SubLObject var29 = f19847(var28);
                final SubLObject var30 = f19848(var28);
                final SubLObject var31 = module0178.f11287(var28);
                final SubLObject var32 = f19850(var29, var31);
                var26 = f19851(var30, var32, var26);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f19851(final SubLObject var29, final SubLObject var31, SubLObject var160) {
        SubLObject var161 = f19896(var29, var160);
        var161 = module0291.f19588(var31, var161);
        var160 = f19897(var29, var161, var160);
        return var160;
    }
    
    public static SubLObject f19860(final SubLObject var29, final SubLObject var31, SubLObject var160) {
        SubLObject var161 = f19896(var29, var160);
        if (NIL != var161) {
            var161 = module0291.f19592(var31, var161);
            var160 = f19897(var29, var161, var160);
        }
        return var160;
    }
    
    public static SubLObject f19896(final SubLObject var29, final SubLObject var162) {
        return conses_high.getf(var162, var29, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19897(final SubLObject var29, final SubLObject var163, final SubLObject var164) {
        return conses_high.putf(conses_high.remf(var164, var29), var29, var163);
    }
    
    public static SubLObject f19850(final SubLObject var21, final SubLObject var30) {
        return (SubLObject)ConsesLow.list(var21, var30);
    }
    
    public static SubLObject f19847(final SubLObject var22) {
        return module0178.f11334(var22);
    }
    
    public static SubLObject f19848(final SubLObject var22) {
        return module0178.f11335(var22);
    }
    
    public static SubLObject f19849(final SubLObject var22) {
        return module0178.f11336(var22);
    }
    
    public static SubLObject f19879(final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        SubLObject var27 = assertions_low_oc.f11242(var25);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            if (NIL != module0211.f13649(var28, $ic119$) && NIL == module0178.f11341(var28)) {
                final SubLObject var29 = f19853(var28);
                final SubLObject var30 = module0178.f11287(var28);
                final SubLObject var31 = f19854(var29, var30);
                var26 = module0291.f19588(var31, var26);
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        return var26;
    }
    
    public static SubLObject f19854(final SubLObject var34, final SubLObject var30) {
        return (SubLObject)ConsesLow.list(var34, var30);
    }
    
    public static SubLObject f19853(final SubLObject var22) {
        return module0178.f11334(var22);
    }
    
    public static SubLObject f19855(final SubLObject var22) {
        return module0178.f11335(var22);
    }
    
    public static SubLObject f19898() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)ZERO_INTEGER;
        SubLObject var26 = module0291.f19564();
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            final SubLObject var28 = module0147.$g2094$.currentBinding(var24);
            final SubLObject var29 = module0147.$g2095$.currentBinding(var24);
            try {
                module0147.$g2094$.bind((SubLObject)$ic79$, var24);
                module0147.$g2095$.bind($ic80$, var24);
                var25 = Numbers.add(var25, module0217.f14247(var27, (SubLObject)UNPROVIDED));
            }
            finally {
                module0147.$g2095$.rebind(var29, var24);
                module0147.$g2094$.rebind(var28, var24);
            }
            var26 = var26.rest();
            var27 = var26.first();
        }
        return var25;
    }
    
    public static SubLObject f19899() {
        final SubLThread var24 = SubLProcess.currentSubLThread();
        SubLObject var25 = (SubLObject)ZERO_INTEGER;
        SubLObject var26 = module0291.f19552();
        SubLObject var27 = (SubLObject)NIL;
        var27 = var26.first();
        while (NIL != var26) {
            final SubLObject var28 = module0147.$g2094$.currentBinding(var24);
            final SubLObject var29 = module0147.$g2095$.currentBinding(var24);
            try {
                module0147.$g2094$.bind((SubLObject)$ic79$, var24);
                module0147.$g2095$.bind($ic80$, var24);
                var25 = Numbers.add(var25, module0217.f14247(var27, (SubLObject)UNPROVIDED));
            }
            finally {
                module0147.$g2095$.rebind(var29, var24);
                module0147.$g2094$.rebind(var28, var24);
            }
            var26 = var26.rest();
            var27 = var26.first();
        }
        return var25;
    }
    
    public static SubLObject f19900(final SubLObject var57) {
        return (SubLObject)makeBoolean(NIL == module0004.f104(var57, module0291.f19550(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0202.f12628(var57) && NIL == module0202.f12626(var57));
    }
    
    public static SubLObject f19882(final SubLObject var126) {
        return module0213.f13937(module0035.delete_if_not((SubLObject)$ic120$, module0205.f13192(var126, (SubLObject)T), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f19901(final SubLObject var57, final SubLObject var30) {
        return module0259.f16854(var57, $ic121$, var30, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f19867(final SubLObject var22) {
        return module0211.f13649(var22, $ic122$);
    }
    
    public static SubLObject f19869(final SubLObject var22) {
        return module0211.f13649(var22, $ic123$);
    }
    
    public static SubLObject f19871(final SubLObject var22) {
        return module0211.f13651(var22, module0291.f19553());
    }
    
    public static SubLObject f19902(final SubLObject var166) {
        return module0193.f12082(module0277.f18371(var166));
    }
    
    public static SubLObject f19903(final SubLObject var145) {
        return module0193.f12082(module0193.f12079(var145));
    }
    
    public static SubLObject f19875(final SubLObject var22) {
        return (SubLObject)makeBoolean(NIL != module0178.f11284(var22) && $ic122$.eql(module0178.f11333(var22)) && NIL != module0259.f16854(module0178.f11334(var22), $ic124$, module0178.f11287(var22), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f19904() {
        module0291.f19547();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19905(final SubLObject var2) {
        module0021.f1038((SubLObject)ONE_INTEGER, var2);
        module0021.f1038(module0291.f19555(), var2);
        final SubLObject var3 = f19835();
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        final Iterator var6 = Hashtables.getEntrySetIterator(var3);
        try {
            while (Hashtables.iteratorHasNext(var6)) {
                final Map.Entry var7 = Hashtables.iteratorNextEntry(var6);
                var4 = Hashtables.getEntryKey(var7);
                var5 = Hashtables.getEntryValue(var7);
                f19906(var5, var2);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var6);
        }
        module0021.f1038($g2684$.getGlobalValue(), var2);
        module0021.f1038($g2685$.getGlobalValue(), var2);
        module0021.f1038($g2686$.getGlobalValue(), var2);
        module0021.f1038(module0291.f19559(), var2);
        SubLObject var8 = f19839();
        SubLObject var9 = (SubLObject)NIL;
        var9 = var8.first();
        while (NIL != var8) {
            if (NIL != Hashtables.gethash_without_values(f19797(var9), $g2683$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
                module0021.f1038(f19797(var9), var2);
            }
            else {
                f19906(var9, var2);
            }
            var8 = var8.rest();
            var9 = var8.first();
        }
        module0021.f1038((SubLObject)NIL, var2);
        module0021.f1038((SubLObject)NIL, var2);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19907(final SubLObject var2) {
        final SubLObject var3 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (!var3.eql((SubLObject)ONE_INTEGER)) {
            Errors.warn((SubLObject)$ic125$, var3);
        }
        final SubLObject var4 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        $g2683$.setGlobalValue(Hashtables.make_hash_table(var4, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        SubLObject var5;
        SubLObject var6;
        for (var5 = (SubLObject)NIL, var5 = (SubLObject)ZERO_INTEGER; var5.numL(var4); var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER)) {
            var6 = f19908(var2);
            Hashtables.sethash(f19797(var6), $g2683$.getGlobalValue(), var6);
        }
        $g2684$.setGlobalValue(module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2685$.setGlobalValue(module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2686$.setGlobalValue(module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        for (var7 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var5 = (SubLObject)NIL, var5 = (SubLObject)ZERO_INTEGER; var5.numL(var7); var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER)) {
            var8 = module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var9 = (SubLObject)NIL;
            if (NIL != assertion_handles_oc.f11035(var8)) {
                var9 = Hashtables.gethash_without_values(var8, $g2683$.getGlobalValue(), (SubLObject)UNPROVIDED);
            }
            else {
                var9 = var8;
            }
            $g2687$.setGlobalValue((SubLObject)ConsesLow.cons(var9, $g2687$.getGlobalValue()));
        }
        $g2687$.setGlobalValue(Sequences.nreverse($g2687$.getGlobalValue()));
        module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19906(final SubLObject var20, final SubLObject var2) {
        f19909(f19792(var20), var2);
        f19909(f19793(var20), var2);
        module0021.f1038(f19794(var20), var2);
        module0021.f1038(f19795(var20), var2);
        module0021.f1038(f19796(var20), var2);
        module0021.f1038(f19797(var20), var2);
        module0021.f1038(f19798(var20), var2);
        module0021.f1038(f19799(var20), var2);
        module0021.f1038(f19800(var20), var2);
        return var20;
    }
    
    public static SubLObject f19908(final SubLObject var2) {
        final SubLObject var3 = f19910(var2);
        final SubLObject var4 = f19910(var2);
        final SubLObject var5 = f19810((SubLObject)UNPROVIDED);
        f19801(var5, var3);
        f19802(var5, var4);
        f19803(var5, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19804(var5, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19805(var5, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19806(var5, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19807(var5, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19808(var5, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19809(var5, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var5;
    }
    
    public static SubLObject f19909(final SubLObject var19, final SubLObject var2) {
        module0021.f1038(f19778(var19), var2);
        module0021.f1038(f19779(var19), var2);
        module0021.f1038(f19780(var19), var2);
        module0021.f1038(f19781(var19), var2);
        return var19;
    }
    
    public static SubLObject f19910(final SubLObject var2) {
        final SubLObject var3 = f19786((SubLObject)UNPROVIDED);
        f19782(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19783(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19784(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        f19785(var3, module0021.f1060(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var3;
    }
    
    public static SubLObject f19911() {
        SubLObject var176 = (SubLObject)NIL;
        if (NIL != f19912()) {
            var176 = (SubLObject)T;
        }
        if (NIL != f19913()) {
            var176 = (SubLObject)T;
        }
        if (NIL != f19914()) {
            var176 = (SubLObject)T;
        }
        if (NIL != f19915()) {
            var176 = (SubLObject)T;
        }
        return var176;
    }
    
    public static SubLObject f19912() {
        if ($g2683$.getGlobalValue().isHashtable() && module0030.f1598($g2683$.getGlobalValue()).isInteger()) {
            SubLObject var178;
            final SubLObject var177 = var178 = module0030.f1630($g2683$.getGlobalValue());
            SubLObject var179 = (SubLObject)NIL;
            var179 = var178.first();
            while (NIL != var178) {
                final SubLObject var180 = var179.first();
                final SubLObject var181 = assertion_handles_oc.f11053(var180);
                final SubLObject var182 = var179.rest();
                f19916(var182);
                ConsesLow.rplaca(var179, var181);
                var178 = var178.rest();
                var179 = var178.first();
            }
            $g2683$.setGlobalValue(module0030.f1631(var177, Symbols.symbol_function((SubLObject)EQL)));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19916(final SubLObject var20) {
        final SubLObject var21 = f19797(var20);
        if (var21.isInteger()) {
            final SubLObject var22 = assertion_handles_oc.f11053(var21);
            f19806(var20, var22);
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19913() {
        if ($g2684$.getGlobalValue().isHashtable() && module0030.f1626($g2684$.getGlobalValue()).first().isInteger()) {
            SubLObject var178;
            final SubLObject var177 = var178 = module0030.f1630($g2684$.getGlobalValue());
            SubLObject var179 = (SubLObject)NIL;
            var179 = var178.first();
            while (NIL != var178) {
                SubLObject var181;
                final SubLObject var180 = var181 = var179;
                SubLObject var182 = (SubLObject)NIL;
                SubLObject var183 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var181, var180, (SubLObject)$ic126$);
                var182 = var181.first();
                var181 = (var183 = var181.rest());
                SubLObject var184_185;
                for (var184_185 = (SubLObject)NIL, var184_185 = var183; !var184_185.isAtom(); var184_185 = var184_185.rest()) {
                    ConsesLow.rplaca(var184_185, assertion_handles_oc.f11053(var184_185.first()));
                }
                var178 = var178.rest();
                var179 = var178.first();
            }
            $g2684$.setGlobalValue(module0030.f1631(var177, Symbols.symbol_function((SubLObject)EQL)));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19914() {
        if ($g2685$.getGlobalValue().isHashtable() && module0030.f1626($g2685$.getGlobalValue()).first().isInteger()) {
            SubLObject var178;
            final SubLObject var177 = var178 = module0030.f1630($g2685$.getGlobalValue());
            SubLObject var179 = (SubLObject)NIL;
            var179 = var178.first();
            while (NIL != var178) {
                SubLObject var181;
                final SubLObject var180 = var181 = var179;
                SubLObject var182 = (SubLObject)NIL;
                SubLObject var183 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var181, var180, (SubLObject)$ic126$);
                var182 = var181.first();
                var181 = (var183 = var181.rest());
                SubLObject var184_188;
                for (var184_188 = (SubLObject)NIL, var184_188 = var183; !var184_188.isAtom(); var184_188 = var184_188.rest()) {
                    ConsesLow.rplaca(var184_188, assertion_handles_oc.f11053(var184_188.first()));
                }
                var178 = var178.rest();
                var179 = var178.first();
            }
            $g2685$.setGlobalValue(module0030.f1631(var177, Symbols.symbol_function((SubLObject)EQL)));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19915() {
        if ($g2686$.getGlobalValue().isHashtable() && module0030.f1626($g2686$.getGlobalValue()).first().isInteger()) {
            SubLObject var178;
            final SubLObject var177 = var178 = module0030.f1630($g2686$.getGlobalValue());
            SubLObject var179 = (SubLObject)NIL;
            var179 = var178.first();
            while (NIL != var178) {
                SubLObject var181;
                final SubLObject var180 = var181 = var179;
                SubLObject var182 = (SubLObject)NIL;
                SubLObject var183 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var181, var180, (SubLObject)$ic126$);
                var182 = var181.first();
                var181 = (var183 = var181.rest());
                SubLObject var184_191;
                for (var184_191 = (SubLObject)NIL, var184_191 = var183; !var184_191.isAtom(); var184_191 = var184_191.rest()) {
                    ConsesLow.rplaca(var184_191, assertion_handles_oc.f11053(var184_191.first()));
                }
                var178 = var178.rest();
                var179 = var178.first();
            }
            $g2686$.setGlobalValue(module0030.f1631(var177, Symbols.symbol_function((SubLObject)EQL)));
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19917() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19775", "S#22428", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19777", "S#22426", 1, 0, false);
        new $f19777$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19778", "S#22429", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19779", "S#22430", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19780", "S#22431", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19781", "S#22432", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19782", "S#22433", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19783", "S#22434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19784", "S#22435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19785", "S#22436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19786", "S#22437", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19787", "S#22438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19788", "S#22439", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19789", "S#22440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19791", "S#22164", 1, 0, false);
        new $f19791$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19792", "S#22441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19793", "S#22442", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19794", "S#22443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19795", "S#22444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19796", "S#22445", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19797", "S#22446", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19798", "S#22447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19799", "S#22448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19800", "S#22449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19801", "S#22450", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19802", "S#22451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19803", "S#22452", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19804", "S#22453", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19805", "S#22454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19806", "S#22455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19807", "S#22456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19808", "S#22457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19809", "S#22458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19810", "S#22459", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19811", "S#22460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19812", "S#22461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19776", "S#22462", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19813", "S#22463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19817", "S#22464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19814", "S#22465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19815", "S#22466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19816", "S#22356", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19818", "S#22467", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19790", "S#22468", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19820", "S#22357", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19821", "S#22358", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19828", "S#22469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19829", "S#22470", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19830", "S#22471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19831", "S#22472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19832", "S#22473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19833", "S#22474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19822", "S#22475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19823", "S#22362", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19824", "S#22476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19834", "S#22355", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19819", "S#22477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19825", "S#22478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19826", "S#22479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19827", "S#22480", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19835", "S#22151", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19836", "S#22361", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19837", "S#22359", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19838", "S#22360", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19839", "S#22153", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19840", "S#22154", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19843", "S#22155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19846", "S#22156", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19852", "S#22157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19856", "S#22159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19858", "S#22160", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19859", "S#22161", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19861", "S#22162", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19842", "S#22481", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19862", "S#22482", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19857", "S#22483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19864", "S#22484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19863", "S#22363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19865", "S#22166", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19866", "S#22152", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19841", "S#22485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19868", "S#22486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19870", "S#22487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19872", "S#22488", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19876", "S#22489", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19873", "S#22490", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19880", "S#22491", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19874", "S#22492", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0295", "f19883", "S#22493");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19881", "S#22494", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19884", "S#22495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19885", "S#22496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19886", "S#22497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19887", "S#22498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19889", "S#22499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19890", "S#22500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19888", "S#22501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19891", "S#22502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19893", "S#22503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19892", "S#22504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19877", "S#22505", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19845", "S#22506", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19894", "S#22507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19895", "S#22508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19844", "S#22509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19878", "S#22510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19851", "S#22168", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19860", "S#22511", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19896", "S#22170", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19897", "S#22169", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19850", "S#22158", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19847", "S#22512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19848", "S#22513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19849", "S#22514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19879", "S#22515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19854", "S#22516", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19853", "S#22517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19855", "S#22518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19898", "S#22519", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19899", "S#22520", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19900", "S#22521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19882", "S#22522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19901", "S#22523", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19867", "S#22524", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19869", "S#22525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19871", "S#22526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19902", "S#22527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19903", "S#22528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19875", "S#22529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19904", "S#22530", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19905", "S#22531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19907", "S#22532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19906", "S#22533", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19908", "S#22534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19909", "S#22535", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19910", "S#22536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19911", "S#22537", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19912", "S#22538", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19916", "S#22539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19913", "S#22540", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19914", "S#22541", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0295", "f19915", "S#22542", 0, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19918() {
        $g2681$ = SubLFiles.defconstant("S#22543", (SubLObject)$ic0$);
        $g2682$ = SubLFiles.defconstant("S#22544", (SubLObject)$ic27$);
        $g2683$ = SubLFiles.deflexical("S#22545", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic73$)) ? $g2683$.getGlobalValue() : NIL));
        $g2684$ = SubLFiles.deflexical("S#22546", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic74$)) ? $g2684$.getGlobalValue() : NIL));
        $g2685$ = SubLFiles.deflexical("S#22547", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic75$)) ? $g2685$.getGlobalValue() : NIL));
        $g2686$ = SubLFiles.deflexical("S#22548", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic76$)) ? $g2686$.getGlobalValue() : NIL));
        $g2687$ = SubLFiles.deflexical("S#22549", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic77$)) ? $g2687$.getGlobalValue() : NIL));
        $g2688$ = SubLFiles.defparameter("S#22550", (SubLObject)NIL);
        $g2689$ = SubLFiles.defparameter("S#22551", (SubLObject)NIL);
        $g2690$ = SubLFiles.defparameter("S#22552", (SubLObject)ZERO_INTEGER);
        $g2691$ = SubLFiles.defparameter("S#22553", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f19919() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2681$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Structures.def_csetf((SubLObject)$ic11$, (SubLObject)$ic12$);
        Structures.def_csetf((SubLObject)$ic13$, (SubLObject)$ic14$);
        Structures.def_csetf((SubLObject)$ic15$, (SubLObject)$ic16$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2681$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic26$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2682$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic34$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic35$);
        Structures.def_csetf((SubLObject)$ic36$, (SubLObject)$ic37$);
        Structures.def_csetf((SubLObject)$ic38$, (SubLObject)$ic39$);
        Structures.def_csetf((SubLObject)$ic40$, (SubLObject)$ic41$);
        Structures.def_csetf((SubLObject)$ic42$, (SubLObject)$ic43$);
        Structures.def_csetf((SubLObject)$ic44$, (SubLObject)$ic45$);
        Structures.def_csetf((SubLObject)$ic46$, (SubLObject)$ic47$);
        Structures.def_csetf((SubLObject)$ic48$, (SubLObject)$ic49$);
        Structures.def_csetf((SubLObject)$ic50$, (SubLObject)$ic51$);
        Structures.def_csetf((SubLObject)$ic52$, (SubLObject)$ic53$);
        Equality.identity((SubLObject)$ic27$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2682$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic63$));
        module0003.f57((SubLObject)$ic73$);
        module0003.f57((SubLObject)$ic74$);
        module0003.f57((SubLObject)$ic75$);
        module0003.f57((SubLObject)$ic76$);
        module0003.f57((SubLObject)$ic77$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f19917();
    }
    
    public void initializeVariables() {
        f19918();
    }
    
    public void runTopLevelForms() {
        f19919();
    }
    
    static {
        me = (SubLFile)new module0295();
        $g2681$ = null;
        $g2682$ = null;
        $g2683$ = null;
        $g2684$ = null;
        $g2685$ = null;
        $g2686$ = null;
        $g2687$ = null;
        $g2688$ = null;
        $g2689$ = null;
        $g2690$ = null;
        $g2691$ = null;
        $ic0$ = makeSymbol("S#22425", "CYC");
        $ic1$ = makeSymbol("S#22426", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#63", "CYC"), (SubLObject)makeSymbol("S#22554", "CYC"), (SubLObject)makeSymbol("S#11445", "CYC"), (SubLObject)makeSymbol("S#12118", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("EXPRESSION"), (SubLObject)makeKeyword("SHARED-VAR-BINDINGS"), (SubLObject)makeKeyword("MT"), (SubLObject)makeKeyword("FORTS"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#22429", "CYC"), (SubLObject)makeSymbol("S#22430", "CYC"), (SubLObject)makeSymbol("S#22431", "CYC"), (SubLObject)makeSymbol("S#22432", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#22433", "CYC"), (SubLObject)makeSymbol("S#22434", "CYC"), (SubLObject)makeSymbol("S#22435", "CYC"), (SubLObject)makeSymbol("S#22436", "CYC"));
        $ic6$ = makeSymbol("S#22462", "CYC");
        $ic7$ = makeSymbol("S#22428", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#22426", "CYC"));
        $ic9$ = makeSymbol("S#22429", "CYC");
        $ic10$ = makeSymbol("S#22433", "CYC");
        $ic11$ = makeSymbol("S#22430", "CYC");
        $ic12$ = makeSymbol("S#22434", "CYC");
        $ic13$ = makeSymbol("S#22431", "CYC");
        $ic14$ = makeSymbol("S#22435", "CYC");
        $ic15$ = makeSymbol("S#22432", "CYC");
        $ic16$ = makeSymbol("S#22436", "CYC");
        $ic17$ = makeKeyword("EXPRESSION");
        $ic18$ = makeKeyword("SHARED-VAR-BINDINGS");
        $ic19$ = makeKeyword("MT");
        $ic20$ = makeKeyword("FORTS");
        $ic21$ = makeString("Invalid slot ~S for construction function");
        $ic22$ = makeKeyword("BEGIN");
        $ic23$ = makeSymbol("S#22437", "CYC");
        $ic24$ = makeKeyword("SLOT");
        $ic25$ = makeKeyword("END");
        $ic26$ = makeSymbol("S#22439", "CYC");
        $ic27$ = makeSymbol("S#22427", "CYC");
        $ic28$ = makeSymbol("S#22164", "CYC");
        $ic29$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#22555", "CYC"), makeSymbol("S#22556", "CYC"), makeSymbol("S#11445", "CYC"), makeSymbol("S#22557", "CYC"), makeSymbol("S#22558", "CYC"), makeSymbol("ASSERTION", "CYC"), makeSymbol("S#22559", "CYC"), makeSymbol("S#22560", "CYC"), makeSymbol("S#5852", "CYC") });
        $ic30$ = ConsesLow.list(new SubLObject[] { makeKeyword("FIRST-RT"), makeKeyword("SECOND-RT"), makeKeyword("MT"), makeKeyword("WFF-DEGREE"), makeKeyword("DIRECTIONS"), makeKeyword("ASSERTION"), makeKeyword("RULE-PRED"), makeKeyword("PRECONDITIONS"), makeKeyword("PROPERTIES") });
        $ic31$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#22441", "CYC"), makeSymbol("S#22442", "CYC"), makeSymbol("S#22443", "CYC"), makeSymbol("S#22444", "CYC"), makeSymbol("S#22445", "CYC"), makeSymbol("S#22446", "CYC"), makeSymbol("S#22447", "CYC"), makeSymbol("S#22448", "CYC"), makeSymbol("S#22449", "CYC") });
        $ic32$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#22450", "CYC"), makeSymbol("S#22451", "CYC"), makeSymbol("S#22452", "CYC"), makeSymbol("S#22453", "CYC"), makeSymbol("S#22454", "CYC"), makeSymbol("S#22455", "CYC"), makeSymbol("S#22456", "CYC"), makeSymbol("S#22457", "CYC"), makeSymbol("S#22458", "CYC") });
        $ic33$ = makeSymbol("S#22468", "CYC");
        $ic34$ = makeSymbol("S#22440", "CYC");
        $ic35$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#22164", "CYC"));
        $ic36$ = makeSymbol("S#22441", "CYC");
        $ic37$ = makeSymbol("S#22450", "CYC");
        $ic38$ = makeSymbol("S#22442", "CYC");
        $ic39$ = makeSymbol("S#22451", "CYC");
        $ic40$ = makeSymbol("S#22443", "CYC");
        $ic41$ = makeSymbol("S#22452", "CYC");
        $ic42$ = makeSymbol("S#22444", "CYC");
        $ic43$ = makeSymbol("S#22453", "CYC");
        $ic44$ = makeSymbol("S#22445", "CYC");
        $ic45$ = makeSymbol("S#22454", "CYC");
        $ic46$ = makeSymbol("S#22446", "CYC");
        $ic47$ = makeSymbol("S#22455", "CYC");
        $ic48$ = makeSymbol("S#22447", "CYC");
        $ic49$ = makeSymbol("S#22456", "CYC");
        $ic50$ = makeSymbol("S#22448", "CYC");
        $ic51$ = makeSymbol("S#22457", "CYC");
        $ic52$ = makeSymbol("S#22449", "CYC");
        $ic53$ = makeSymbol("S#22458", "CYC");
        $ic54$ = makeKeyword("FIRST-RT");
        $ic55$ = makeKeyword("SECOND-RT");
        $ic56$ = makeKeyword("WFF-DEGREE");
        $ic57$ = makeKeyword("DIRECTIONS");
        $ic58$ = makeKeyword("ASSERTION");
        $ic59$ = makeKeyword("RULE-PRED");
        $ic60$ = makeKeyword("PRECONDITIONS");
        $ic61$ = makeKeyword("PROPERTIES");
        $ic62$ = makeSymbol("S#22459", "CYC");
        $ic63$ = makeSymbol("S#22461", "CYC");
        $ic64$ = makeString("#<RT>");
        $ic65$ = makeString("#<RT:~s>");
        $ic66$ = makeString("#<RT:~s:~s:~s>");
        $ic67$ = makeString("#<RR:~s>");
        $ic68$ = makeString("#<REFORMULATOR-RULE:~s:~s:~s>");
        $ic69$ = makeString("#<REFORMULATOR-RULE:~s:~s:~s:~s:~s:~s:~s>");
        $ic70$ = makeString("#<REFORMULATOR-RULE:~s:~s:~s:~s:~s:~s:~s:~s:~s>");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("ReformulationForwardDirection"));
        $ic72$ = constant_handles_oc.f8479((SubLObject)makeString("ReformulationBackwardDirection"));
        $ic73$ = makeSymbol("S#22545", "CYC");
        $ic74$ = makeSymbol("S#22546", "CYC");
        $ic75$ = makeSymbol("S#22547", "CYC");
        $ic76$ = makeSymbol("S#22548", "CYC");
        $ic77$ = makeSymbol("S#22549", "CYC");
        $ic78$ = makeString("Found an ill-formed reformulation assertion: ~s - ignoring it~%");
        $ic79$ = makeSymbol("S#12274", "CYC");
        $ic80$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic81$ = makeSymbol("GATHER-PREDICATE-EXTENT-INDEX");
        $ic82$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic83$ = makeString("Initializing Reformulator Rules");
        $ic84$ = makeSymbol("DEFAULT-EL-VAR?");
        $ic85$ = makeString("expansion rule ~s contains a default EL variable and cannot be used by the CycL reformulator.");
        $ic86$ = makeSymbol("S#15431", "CYC");
        $ic87$ = makeSymbol("S#22527", "CYC");
        $ic88$ = makeSymbol("S#22528", "CYC");
        $ic89$ = makeSymbol("S#11214", "CYC");
        $ic90$ = makeString("Found a reformulator rule that would reformulate ~s to itself - ignoring rule~%");
        $ic91$ = makeString("Encountered ~A which is not a CYCL-EXPRESSION.  Skipping the reformulator rule ~A.");
        $ic92$ = makeKeyword("NONE");
        $ic93$ = makeKeyword("KB");
        $ic94$ = makeKeyword("ARITY");
        $ic95$ = makeKeyword("ALL");
        $ic96$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#22561", "CYC"), (SubLObject)makeSymbol("S#63", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic97$ = makeUninternedSymbol("US#1E11E9");
        $ic98$ = makeSymbol("CLET");
        $ic99$ = makeSymbol("S#22550", "CYC");
        $ic100$ = ConsesLow.list((SubLObject)makeSymbol("S#22551", "CYC"), (SubLObject)NIL);
        $ic101$ = makeSymbol("S#3704", "CYC");
        $ic102$ = makeSymbol("MAPCAR");
        $ic103$ = ConsesLow.list((SubLObject)makeSymbol("QUOTE"), (SubLObject)makeSymbol("VARIABLE-ID"));
        $ic104$ = makeSymbol("EXPRESSION-GATHER");
        $ic105$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("FUNCTION"), (SubLObject)makeSymbol("VARIABLE-P")), (SubLObject)NIL);
        $ic106$ = makeSymbol("S#22552", "CYC");
        $ic107$ = makeSymbol("VARIABLE-ID");
        $ic108$ = makeSymbol("VARIABLE-P");
        $ic109$ = makeSymbol("S#22496", "CYC");
        $ic110$ = makeSymbol("S#22497", "CYC");
        $ic111$ = makeSymbol("S#15529", "CYC");
        $ic112$ = makeSymbol("S#22498", "CYC");
        $ic113$ = makeInteger(100);
        $ic114$ = makeSymbol("S#22503", "CYC");
        $ic115$ = constant_handles_oc.f8479((SubLObject)makeString("SkolemFunctionFn"));
        $ic116$ = makeSymbol("EL-VARIABLE?");
        $ic117$ = constant_handles_oc.f8479((SubLObject)makeString("reformulationPrecondition"));
        $ic118$ = constant_handles_oc.f8479((SubLObject)makeString("reformulationDirectionInMode"));
        $ic119$ = constant_handles_oc.f8479((SubLObject)makeString("reformulatorRuleProperties"));
        $ic120$ = makeSymbol("S#22521", "CYC");
        $ic121$ = constant_handles_oc.f8479((SubLObject)makeString("ReformulatorHighlyRelevantFORT"));
        $ic122$ = constant_handles_oc.f8479((SubLObject)makeString("expansion"));
        $ic123$ = constant_handles_oc.f8479((SubLObject)makeString("rewriteOf"));
        $ic124$ = constant_handles_oc.f8479((SubLObject)makeString("ELRelation"));
        $ic125$ = makeString("This code can only handle reformulator unit version 1.  Got version ~a, but will try anyway...");
        $ic126$ = (SubLList)ConsesLow.cons((SubLObject)makeUninternedSymbol("US#3165895"), (SubLObject)makeSymbol("S#22562", "CYC"));
    }
    
    public static final class $sX22425_native extends SubLStructNative
    {
        public SubLObject $expression;
        public SubLObject $shared_var_bindings;
        public SubLObject $mt;
        public SubLObject $forts;
        public static final SubLStructDeclNative structDecl;
        
        public $sX22425_native() {
            this.$expression = (SubLObject)CommonSymbols.NIL;
            this.$shared_var_bindings = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$forts = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$expression;
        }
        
        public SubLObject getField3() {
            return this.$shared_var_bindings;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject getField5() {
            return this.$forts;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$expression = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$shared_var_bindings = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$forts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX22425_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$expression", "$shared_var_bindings", "$mt", "$forts" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f19777$UnaryFunction extends UnaryFunction
    {
        public $f19777$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22426"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f19777(var3);
        }
    }
    
    public static final class $sX22427_native extends SubLStructNative
    {
        public SubLObject $first_rt;
        public SubLObject $second_rt;
        public SubLObject $mt;
        public SubLObject $wff_degree;
        public SubLObject $directions;
        public SubLObject $assertion;
        public SubLObject $rule_pred;
        public SubLObject $preconditions;
        public SubLObject $properties;
        public static final SubLStructDeclNative structDecl;
        
        public $sX22427_native() {
            this.$first_rt = (SubLObject)CommonSymbols.NIL;
            this.$second_rt = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$wff_degree = (SubLObject)CommonSymbols.NIL;
            this.$directions = (SubLObject)CommonSymbols.NIL;
            this.$assertion = (SubLObject)CommonSymbols.NIL;
            this.$rule_pred = (SubLObject)CommonSymbols.NIL;
            this.$preconditions = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$first_rt;
        }
        
        public SubLObject getField3() {
            return this.$second_rt;
        }
        
        public SubLObject getField4() {
            return this.$mt;
        }
        
        public SubLObject getField5() {
            return this.$wff_degree;
        }
        
        public SubLObject getField6() {
            return this.$directions;
        }
        
        public SubLObject getField7() {
            return this.$assertion;
        }
        
        public SubLObject getField8() {
            return this.$rule_pred;
        }
        
        public SubLObject getField9() {
            return this.$preconditions;
        }
        
        public SubLObject getField10() {
            return this.$properties;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$first_rt = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$second_rt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$wff_degree = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$directions = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$assertion = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$rule_pred = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$preconditions = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX22427_native.class, $ic27$, $ic28$, $ic29$, $ic30$, new String[] { "$first_rt", "$second_rt", "$mt", "$wff_degree", "$directions", "$assertion", "$rule_pred", "$preconditions", "$properties" }, $ic31$, $ic32$, $ic33$);
        }
    }
    
    public static final class $f19791$UnaryFunction extends UnaryFunction
    {
        public $f19791$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#22164"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f19791(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 618 ms
	
	Decompiled with Procyon 0.5.32.
*/