package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0340 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0340";
    public static final String myFingerPrint = "cd316b448ad05b1392876fb0b263c97f20ed9594d94e21a511445db4123cde41";
    private static SubLSymbol $g2903$;
    private static SubLSymbol $g2904$;
    private static SubLSymbol $g2905$;
    private static SubLSymbol $g2906$;
    private static SubLSymbol $g2907$;
    public static SubLSymbol $g2908$;
    private static SubLSymbol $g2909$;
    private static SubLSymbol $g2910$;
    private static SubLSymbol $g2911$;
    private static SubLSymbol $g2912$;
    private static SubLSymbol $g2913$;
    private static SubLSymbol $g2914$;
    private static SubLSymbol $g2916$;
    private static SubLSymbol $g2917$;
    private static SubLSymbol $g2918$;
    private static SubLSymbol $g2915$;
    private static SubLSymbol $g2919$;
    private static SubLSymbol $g2920$;
    private static SubLSymbol $g2921$;
    private static SubLSymbol $g2922$;
    private static SubLSymbol $g2923$;
    private static SubLSymbol $g2924$;
    private static SubLSymbol $g2925$;
    private static SubLSymbol $g2926$;
    private static SubLSymbol $g2927$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLList $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
    private static final SubLList $ic24$;
    private static final SubLList $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
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
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLInteger $ic86$;
    private static final SubLList $ic87$;
    private static final SubLList $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLList $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
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
    private static final SubLList $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLList $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLInteger $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLSymbol $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLInteger $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLString $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLList $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLSymbol $ic167$;
    private static final SubLList $ic168$;
    private static final SubLList $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLList $ic173$;
    private static final SubLSymbol $ic174$;
    private static final SubLSymbol $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLList $ic178$;
    private static final SubLSymbol $ic179$;
    private static final SubLSymbol $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLList $ic183$;
    private static final SubLSymbol $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLList $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLSymbol $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLSymbol $ic195$;
    private static final SubLList $ic196$;
    private static final SubLSymbol $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLSymbol $ic199$;
    private static final SubLInteger $ic200$;
    private static final SubLSymbol $ic201$;
    private static final SubLSymbol $ic202$;
    
    public static SubLObject f22774(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isKeyword() && NIL != module0004.f104(var1, $g2904$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f22775(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic2$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic2$);
        var7 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic2$);
        var8 = var5.first();
        var5 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic2$);
        var9 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            final SubLObject var10;
            var5 = (var10 = var6);
            final SubLObject var11 = (SubLObject)$ic3$;
            return (SubLObject)ConsesLow.list((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var11, var9)), (SubLObject)ConsesLow.list((SubLObject)$ic5$, reader.bq_cons(var7, (SubLObject)$ic6$), (SubLObject)ConsesLow.list((SubLObject)$ic7$, (SubLObject)ConsesLow.list((SubLObject)$ic8$, var11, var7), (SubLObject)ConsesLow.listS((SubLObject)$ic4$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var8, (SubLObject)ConsesLow.list((SubLObject)$ic9$, var11, var7))), ConsesLow.append(var10, (SubLObject)NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic2$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22776() {
        return $g2904$.getGlobalValue();
    }
    
    public static SubLObject f22777() {
        return f22776();
    }
    
    public static SubLObject f22778(final SubLObject var1) {
        return module0004.f104(var1, $g2905$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22779(final SubLObject var1) {
        return (SubLObject)makeBoolean($ic15$ == var1 || NIL != f22780(var1) || NIL != f22781(var1) || NIL != f22782(var1) || NIL != f22783(var1) || NIL != f22784(var1) || NIL != f22785(var1) || NIL != f22786(var1));
    }
    
    public static SubLObject f22787(final SubLObject var1) {
        return (SubLObject)makeBoolean($ic15$ != var1 && NIL != f22779(var1));
    }
    
    public static SubLObject f22780(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isCons() && $ic16$ == var1.first() && NIL != module0035.f2192((SubLObject)$ic17$, var1.rest()));
    }
    
    public static SubLObject f22781(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isCons() && $ic18$ == var1.first() && NIL != module0035.f2192((SubLObject)$ic17$, var1.rest()));
    }
    
    public static SubLObject f22782(final SubLObject var1) {
        return (SubLObject)makeBoolean(var1.isCons() && $ic19$ == var1.first() && NIL != module0035.f2192((SubLObject)$ic17$, var1.rest()));
    }
    
    public static SubLObject f22783(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0035.f1998(var1) && $ic20$ == var1.first());
    }
    
    public static SubLObject f22784(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0035.f1998(var1) && $ic13$ == var1.first());
    }
    
    public static SubLObject f22785(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0035.f1998(var1) && NIL != f22774(var1.first()));
    }
    
    public static SubLObject f22788(final SubLObject var9, final SubLObject var13) {
        assert NIL != f22789(var9) : var9;
        assert NIL != f22779(var13) : var13;
        return f22790(var9, var13);
    }
    
    public static SubLObject f22790(final SubLObject var9, final SubLObject var13) {
        if ($ic15$ == var13) {
            return (SubLObject)T;
        }
        if (NIL != f22780(var13)) {
            SubLObject var14 = var13.rest();
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL != f22790(var9, var15)) {
                    return (SubLObject)T;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)NIL;
        }
        if (NIL != f22781(var13)) {
            SubLObject var14 = var13.rest();
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL == f22790(var9, var15)) {
                    return (SubLObject)NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)T;
        }
        if (NIL != f22782(var13)) {
            return (SubLObject)makeBoolean(NIL == f22790(var9, conses_high.second(var13)));
        }
        if (NIL != f22783(var13)) {
            return Equality.eql(conses_high.second(var13), f22791(var9));
        }
        if (NIL != f22784(var13)) {
            return module0004.f104(conses_high.second(var13), f22792(var9), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f22785(var13)) {
            final SubLObject var16 = var13.first();
            final SubLObject var17 = conses_high.second(var13);
            final SubLObject var18 = f22793(var9, var16);
            return Equality.equal(var17, var18);
        }
        return Equality.eql(var9, f22786(var13));
    }
    
    public static SubLObject f22794(final SubLObject var13) {
        if (NIL != f22786(var13)) {
            return (SubLObject)T;
        }
        if (NIL != f22780(var13)) {
            SubLObject var14 = var13.rest();
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL == f22794(var15)) {
                    return (SubLObject)NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)T;
        }
        if (NIL != f22781(var13)) {
            SubLObject var14 = var13.rest();
            SubLObject var15 = (SubLObject)NIL;
            var15 = var14.first();
            while (NIL != var14) {
                if (NIL == f22794(var15)) {
                    return (SubLObject)NIL;
                }
                var14 = var14.rest();
                var15 = var14.first();
            }
            return (SubLObject)T;
        }
        if ($ic15$ == var13 || NIL != f22782(var13) || NIL != f22783(var13) || NIL != f22784(var13) || NIL != f22785(var13)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22795(final SubLObject var13) {
        if (NIL != f22780(var13)) {
            SubLObject var14 = (SubLObject)NIL;
            SubLObject var15 = var13.rest();
            SubLObject var16 = (SubLObject)NIL;
            var16 = var15.first();
            while (NIL != var15) {
                var14 = ConsesLow.append(var14, f22795(var16));
                var15 = var15.rest();
                var16 = var15.first();
            }
            return var14;
        }
        if (NIL != f22781(var13)) {
            SubLObject var14 = (SubLObject)NIL;
            SubLObject var15 = var13.rest();
            SubLObject var16 = (SubLObject)NIL;
            var16 = var15.first();
            while (NIL != var15) {
                var14 = ConsesLow.append(var14, f22795(var16));
                var15 = var15.rest();
                var16 = var15.first();
            }
            return var14;
        }
        return (SubLObject)ConsesLow.list(f22786(var13));
    }
    
    public static SubLObject f22796(final SubLObject var20, final SubLObject var21) {
        f22797(var20, var21, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22789(final SubLObject var20) {
        return (SubLObject)((var20.getClass() == $sX14781_native.class) ? T : NIL);
    }
    
    public static SubLObject f22798(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField2();
    }
    
    public static SubLObject f22799(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField3();
    }
    
    public static SubLObject f22800(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField4();
    }
    
    public static SubLObject f22801(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField5();
    }
    
    public static SubLObject f22802(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField6();
    }
    
    public static SubLObject f22803(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField7();
    }
    
    public static SubLObject f22804(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField8();
    }
    
    public static SubLObject f22805(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField9();
    }
    
    public static SubLObject f22806(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField10();
    }
    
    public static SubLObject f22807(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField11();
    }
    
    public static SubLObject f22808(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField12();
    }
    
    public static SubLObject f22809(final SubLObject var20) {
        assert NIL != f22789(var20) : var20;
        return var20.getField13();
    }
    
    public static SubLObject f22810(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField2(var22);
    }
    
    public static SubLObject f22811(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField3(var22);
    }
    
    public static SubLObject f22812(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField4(var22);
    }
    
    public static SubLObject f22813(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField5(var22);
    }
    
    public static SubLObject f22814(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField6(var22);
    }
    
    public static SubLObject f22815(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField7(var22);
    }
    
    public static SubLObject f22816(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField8(var22);
    }
    
    public static SubLObject f22817(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField9(var22);
    }
    
    public static SubLObject f22818(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField10(var22);
    }
    
    public static SubLObject f22819(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField11(var22);
    }
    
    public static SubLObject f22820(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField12(var22);
    }
    
    public static SubLObject f22821(final SubLObject var20, final SubLObject var22) {
        assert NIL != f22789(var20) : var20;
        return var20.setField13(var22);
    }
    
    public static SubLObject f22822(SubLObject var23) {
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)NIL;
        }
        final SubLObject var24 = (SubLObject)new $sX14781_native();
        SubLObject var25;
        SubLObject var26;
        SubLObject var27;
        SubLObject var28;
        for (var25 = (SubLObject)NIL, var25 = var23; NIL != var25; var25 = conses_high.cddr(var25)) {
            var26 = var25.first();
            var27 = conses_high.cadr(var25);
            var28 = var26;
            if (var28.eql((SubLObject)$ic54$)) {
                f22810(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic55$)) {
                f22811(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic56$)) {
                f22812(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic57$)) {
                f22813(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic58$)) {
                f22814(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic59$)) {
                f22815(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic60$)) {
                f22816(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic61$)) {
                f22817(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic62$)) {
                f22818(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic63$)) {
                f22819(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic64$)) {
                f22820(var24, var27);
            }
            else if (var28.eql((SubLObject)$ic65$)) {
                f22821(var24, var27);
            }
            else {
                Errors.error((SubLObject)$ic66$, var26);
            }
        }
        return var24;
    }
    
    public static SubLObject f22823(final SubLObject var29, final SubLObject var30) {
        Functions.funcall(var30, var29, (SubLObject)$ic67$, (SubLObject)$ic68$, (SubLObject)TWELVE_INTEGER);
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic54$, f22798(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic55$, f22799(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic56$, f22800(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic57$, f22801(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic58$, f22802(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic59$, f22803(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic60$, f22804(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic61$, f22805(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic62$, f22806(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic63$, f22807(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic64$, f22808(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic69$, (SubLObject)$ic65$, f22809(var29));
        Functions.funcall(var30, var29, (SubLObject)$ic70$, (SubLObject)$ic68$, (SubLObject)TWELVE_INTEGER);
        return var29;
    }
    
    public static SubLObject f22824(final SubLObject var29, final SubLObject var30) {
        return f22823(var29, var30);
    }
    
    public static SubLObject f22797(final SubLObject var1, final SubLObject var21, final SubLObject var31) {
        final SubLObject var32 = f22825(var1);
        PrintLow.format(var21, (SubLObject)$ic72$, var32);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22826(final SubLObject var1) {
        return Sxhash.sxhash(f22798(var1));
    }
    
    public static SubLObject f22827(final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        assert NIL != module0035.f2327(var33) : var33;
        SubLObject var35 = (SubLObject)NIL;
        SubLObject var36;
        SubLObject var37;
        SubLObject var38;
        SubLObject var39;
        for (var36 = (SubLObject)NIL, var36 = var33; NIL != var36; var36 = conses_high.cddr(var36)) {
            var37 = var36.first();
            var38 = conses_high.cadr(var36);
            assert NIL != f22774(var37) : var37;
            var39 = var37;
            if (var39.eql((SubLObject)$ic76$)) {
                var35 = (SubLObject)T;
            }
        }
        for (var36 = (SubLObject)NIL, var36 = var33; NIL != var36; var36 = conses_high.cddr(var36)) {
            var37 = var36.first();
            var38 = conses_high.cadr(var36);
            var39 = var37;
            if (var39.eql((SubLObject)$ic77$) && NIL == Errors.$ignore_mustsP$.getDynamicValue(var34) && NIL == var35) {
                Errors.error((SubLObject)$ic78$, var33);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22828(final SubLObject var32, SubLObject var33) {
        f22827(var33);
        final SubLObject var34 = f22829(var32);
        var33 = f22830(var33);
        f22811(var34, var33);
        f22831(var34);
        return var34;
    }
    
    public static SubLObject f22832() {
        final SubLObject var38 = $g2909$.getGlobalValue();
        if (NIL != var38) {
            module0034.f1818(var38);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22833(final SubLObject var32) {
        return module0034.f1829($g2909$.getGlobalValue(), (SubLObject)ConsesLow.list(var32), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22834(final SubLObject var32) {
        return f22828(var32, (SubLObject)$ic80$);
    }
    
    public static SubLObject f22835(final SubLObject var32) {
        SubLObject var33 = $g2909$.getGlobalValue();
        if (NIL == var33) {
            var33 = module0034.f1934((SubLObject)$ic79$, (SubLObject)$ic81$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var34 = module0034.f1814(var33, var32, (SubLObject)$ic82$);
        if (var34 == $ic82$) {
            var34 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f22834(var32)));
            module0034.f1816(var33, var32, var34, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var34);
    }
    
    public static SubLObject f22830(SubLObject var33) {
        final SubLObject var34 = conses_high.getf(var33, (SubLObject)$ic13$, (SubLObject)UNPROVIDED);
        if (!var34.isList()) {
            var33 = conses_high.putf(conses_high.copy_list(var33), (SubLObject)$ic13$, (SubLObject)ConsesLow.list(var34));
        }
        return var33;
    }
    
    public static SubLObject f22829(final SubLObject var32) {
        SubLObject var33 = f22786(var32);
        if (NIL != var33) {
            f22836(var33);
        }
        else {
            var33 = f22822((SubLObject)UNPROVIDED);
            f22810(var33, var32);
        }
        f22811(var33, (SubLObject)NIL);
        return var33;
    }
    
    public static SubLObject f22837(final SubLObject var9) {
        f22836(var9);
        f22811(var9, (SubLObject)$ic83$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22825(final SubLObject var9) {
        assert NIL != f22789(var9) : var9;
        return f22798(var9);
    }
    
    public static SubLObject f22838(final SubLObject var9) {
        return f22799(var9);
    }
    
    public static SubLObject f22839(final SubLObject var9, final SubLObject var16) {
        final SubLObject var17 = f22838(var9);
        final SubLObject var18 = conses_high.getf(var17, var16, (SubLObject)$ic84$);
        if (var18 == $ic84$) {
            final SubLObject var19 = module0067.f4885($g2907$.getGlobalValue(), var16, (SubLObject)UNPROVIDED);
            return Values.values(var19, (SubLObject)T);
        }
        return Values.values(var18, (SubLObject)NIL);
    }
    
    public static SubLObject f22793(final SubLObject var9, final SubLObject var16) {
        final SubLObject var17 = f22838(var9);
        SubLObject var18 = conses_high.getf(var17, var16, (SubLObject)$ic84$);
        if (var18 == $ic84$) {
            var18 = module0067.f4885($g2907$.getGlobalValue(), var16, (SubLObject)UNPROVIDED);
        }
        return var18;
    }
    
    public static SubLObject f22840(final SubLObject var9, final SubLObject var16) {
        final SubLObject var17 = f22793(var9, var16);
        final SubLObject var18 = module0067.f4885($g2907$.getGlobalValue(), var16, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(!var17.equal(var18));
    }
    
    public static SubLObject f22841(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic87$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic87$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var50_51 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic87$);
            var50_51 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic87$);
            if (NIL == conses_high.member(var50_51, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var50_51 == $ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic87$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        final SubLObject var14 = (SubLObject)$ic91$;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic92$, (SubLObject)ConsesLow.list(var14, var7, (SubLObject)$ic93$, (SubLObject)$ic90$, var12), (SubLObject)ConsesLow.list((SubLObject)$ic94$, var14), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f22842() {
        return $g2910$.getGlobalValue();
    }
    
    public static SubLObject f22786(final SubLObject var32) {
        final SubLObject var33 = Hashtables.gethash_without_values(var32, $g2910$.getGlobalValue(), (SubLObject)UNPROVIDED);
        return var33;
    }
    
    public static SubLObject f22831(final SubLObject var9) {
        final SubLObject var10 = f22825(var9);
        Hashtables.sethash(var10, $g2910$.getGlobalValue(), var9);
        return var9;
    }
    
    public static SubLObject f22836(final SubLObject var9) {
        final SubLObject var10 = f22825(var9);
        Hashtables.remhash(var10, $g2910$.getGlobalValue());
        return var9;
    }
    
    public static SubLObject f22843(final SubLObject var32, final SubLObject var55, final SubLObject var33) {
        SubLObject var56 = conses_high.copy_list(var33);
        var56 = conses_high.putf(var33, (SubLObject)$ic20$, var55);
        final SubLObject var57 = f22828(var32, var56);
        return var57;
    }
    
    public static SubLObject f22844(SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        return (SubLObject)ZERO_INTEGER;
    }
    
    public static SubLObject f22845(SubLObject var12, SubLObject var57) {
        if (var12 == UNPROVIDED) {
            var12 = (SubLObject)NIL;
        }
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22791(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic20$);
    }
    
    public static SubLObject f22792(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic13$);
    }
    
    public static SubLObject f22846(final SubLObject var9) {
        return module0035.f2169((SubLObject)$ic97$, f22792(var9));
    }
    
    public static SubLObject f22847(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic98$);
    }
    
    public static SubLObject f22848(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic99$);
    }
    
    public static SubLObject f22849(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic56$);
    }
    
    public static SubLObject f22850(final SubLObject var9, final SubLObject var58) {
        final SubLObject var59 = f22849(var9);
        return (SubLObject)makeBoolean(NIL == var59 || var59.eql(var58));
    }
    
    public static SubLObject f22851(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic61$);
    }
    
    public static SubLObject f22852(final SubLObject var9, final SubLObject var60) {
        final SubLObject var61 = f22851(var9);
        return (SubLObject)makeBoolean($ic100$ == var61 || NIL != module0337.f22628(var61, var60));
    }
    
    public static SubLObject f22853(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic62$);
    }
    
    public static SubLObject f22854(final SubLObject var9) {
        final SubLObject var10 = f22853(var9);
        if (NIL != var10) {
            return f22855(var10);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22855(final SubLObject var63) {
        if (NIL != module0161.f10481(var63)) {
            return var63;
        }
        if (var63.isSymbol() && NIL != Symbols.boundp(var63)) {
            return Symbols.symbol_value(var63);
        }
        return module0112.f7691(var63);
    }
    
    public static SubLObject f22856(final SubLObject var9) {
        final SubLObject var10 = f22854(var9);
        return (SubLObject)makeBoolean(NIL == var10 || NIL != module0147.f9507(var10));
    }
    
    public static SubLObject f22857(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic101$);
    }
    
    public static SubLObject f22858(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic102$);
    }
    
    public static SubLObject f22859(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic103$);
    }
    
    public static SubLObject f22860(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic104$);
    }
    
    public static SubLObject f22861(final SubLObject var9, final SubLObject var1, SubLObject var58) {
        if (var58 == UNPROVIDED) {
            var58 = (SubLObject)NIL;
        }
        SubLObject var59 = f22862(var9, var1);
        if (!var59.isNumber()) {
            var59 = f22863(var9);
            if (!var59.isNumber()) {
                var59 = f22864(var9, var1);
            }
        }
        return var59;
    }
    
    public static SubLObject f22865(final SubLObject var9, final SubLObject var60) {
        return f22861(var9, var60, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22866(final SubLObject var9, final SubLObject var66) {
        return f22861(var9, var66, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22862(final SubLObject var9, final SubLObject var67) {
        final SubLObject var68 = f22858(var9);
        if (NIL != var68) {
            return module0337.f22649(var68, var67, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22863(final SubLObject var9) {
        final SubLObject var10 = f22859(var9);
        if (NIL == var10) {
            return (SubLObject)NIL;
        }
        if (var10.isNumber()) {
            return var10;
        }
        if (var10.isSymbol() && NIL != Symbols.boundp(var10)) {
            return Symbols.symbol_value(var10);
        }
        return module0112.f7691(var10);
    }
    
    public static SubLObject f22864(final SubLObject var9, final SubLObject var1) {
        final SubLObject var10 = f22860(var9);
        if (NIL != module0112.f7693(var10)) {
            final SubLObject var11 = module0112.f7695(var10, var1);
            return var11;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22867(final SubLObject var9, final SubLObject var60) {
        return f22864(var9, var60);
    }
    
    public static SubLObject f22868(final SubLObject var9, final SubLObject var66) {
        return f22864(var9, var66);
    }
    
    public static SubLObject f22869(final SubLObject var9) {
        final SubLObject var10 = f22793(var9, (SubLObject)$ic105$);
        if (var10 == $ic106$) {
            return f22870(var9);
        }
        return module0035.sublisp_boolean(var10);
    }
    
    public static SubLObject f22870(final SubLObject var9) {
        final SubLObject var10 = f22851(var9);
        if (NIL != module0205.f13220((SubLObject)$ic107$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        final SubLObject var11 = module0038.f2638(f22825(var9));
        final SubLObject var12 = module0038.f2668((SubLObject)$ic108$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return var12;
    }
    
    public static SubLObject f22871(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic109$);
    }
    
    public static SubLObject f22872(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic110$);
    }
    
    public static SubLObject f22873(final SubLObject var9) {
        module0414.f28983(var9);
        final SubLObject var10 = f22793(var9, (SubLObject)$ic111$);
        if ($ic84$ == var10) {
            return f22874(var9);
        }
        return var10;
    }
    
    public static SubLObject f22874(final SubLObject var9) {
        if ($ic112$ != f22791(var9)) {
            return (SubLObject)$ic115$;
        }
        if (NIL != f22869(var9)) {
            return (SubLObject)$ic113$;
        }
        return (SubLObject)$ic114$;
    }
    
    public static SubLObject f22875(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic116$);
    }
    
    public static SubLObject f22876(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic117$);
    }
    
    public static SubLObject f22877(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic57$);
    }
    
    public static SubLObject f22878(final SubLObject var9, final SubLObject var75) {
        final SubLObject var76 = f22877(var9);
        if (NIL != var76) {
            return Equality.eql(var76, var75);
        }
        final SubLObject var77 = f22879(var9);
        if (NIL != var77) {
            return module0004.f104(var75, var77, (SubLObject)$ic118$, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f22880(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic59$);
    }
    
    public static SubLObject f22881(final SubLObject var9, final SubLObject var60) {
        final SubLObject var61 = f22880(var9);
        return (SubLObject)makeBoolean(NIL == var61 || (NIL != module0202.f12715(var60) && var61.numE(Sequences.length(var60.rest()))));
    }
    
    public static SubLObject f22882(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic76$);
    }
    
    public static SubLObject f22883(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic77$);
    }
    
    public static SubLObject f22884(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic60$);
    }
    
    public static SubLObject f22885(final SubLObject var9) {
        if (NIL == module0131.f8587()) {
            return (SubLObject)T;
        }
        final SubLObject var10 = f22884(var9);
        return Equality.eq(var10, (SubLObject)$ic119$);
    }
    
    public static SubLObject f22886(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic120$);
    }
    
    public static SubLObject f22887(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic121$);
    }
    
    public static SubLObject f22888(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic122$);
    }
    
    public static SubLObject f22889(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic123$);
    }
    
    public static SubLObject f22890(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic124$);
    }
    
    public static SubLObject f22891(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic125$);
    }
    
    public static SubLObject f22892(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic126$);
    }
    
    public static SubLObject f22893(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic127$);
    }
    
    public static SubLObject f22894(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic128$);
    }
    
    public static SubLObject f22895(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic129$);
    }
    
    public static SubLObject f22896(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic130$);
    }
    
    public static SubLObject f22897(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        var10.resetMultipleValues();
        SubLObject var11 = f22839(var9, (SubLObject)$ic131$);
        final SubLObject var12 = var10.secondMultipleValue();
        var10.resetMultipleValues();
        if (NIL != var12) {
            var11 = module0147.f9496();
        }
        return var11;
    }
    
    public static SubLObject f22898(final SubLObject var9) {
        final SubLObject var10 = f22897(var9);
        return f22855(var10);
    }
    
    public static SubLObject f22899(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic132$);
    }
    
    public static SubLObject f22900(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic133$);
    }
    
    public static SubLObject f22901(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic134$);
    }
    
    public static SubLObject f22902(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic135$);
    }
    
    public static SubLObject f22879(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic58$);
    }
    
    public static SubLObject f22903(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic136$);
    }
    
    public static SubLObject f22904(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic137$);
    }
    
    public static SubLObject f22905(final SubLObject var9, final SubLObject var60) {
        return Equality.eq((SubLObject)$ic138$, f22906(var9, var60, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f22907(final SubLObject var9, final SubLObject var60) {
        return Equality.eq((SubLObject)$ic139$, f22906(var9, var60, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f22906(final SubLObject var9, final SubLObject var60, SubLObject var83) {
        if (var83 == UNPROVIDED) {
            var83 = (SubLObject)$ic139$;
        }
        final SubLObject var84 = f22793(var9, (SubLObject)$ic65$);
        if (NIL != var84) {
            return var84;
        }
        SubLObject var85 = f22793(var9, (SubLObject)$ic140$);
        if (NIL != var85 && NIL != module0337.f22628(var85, var60)) {
            return (SubLObject)$ic138$;
        }
        var85 = f22793(var9, (SubLObject)$ic141$);
        if (NIL != var85) {
            final SubLObject var86 = module0337.f22649(var85, var60, (SubLObject)UNPROVIDED);
            if (NIL != var86) {
                return var86;
            }
        }
        return var83;
    }
    
    public static SubLObject f22908(final SubLObject var9, final SubLObject var85) {
        final SubLObject var86 = f22793(var9, (SubLObject)$ic65$);
        if (NIL != var86) {
            return var86;
        }
        SubLObject var87 = f22793(var9, (SubLObject)$ic140$);
        if (NIL != var87 && NIL != module0337.f22628(var87, var85)) {
            return (SubLObject)$ic138$;
        }
        var87 = f22793(var9, (SubLObject)$ic141$);
        if (NIL != var87) {
            final SubLObject var88 = module0337.f22649(var87, var85, (SubLObject)UNPROVIDED);
            if (NIL != var88) {
                return var88;
            }
        }
        return (SubLObject)$ic139$;
    }
    
    public static SubLObject f22909(final SubLObject var9) {
        return f22793(var9, (SubLObject)$ic142$);
    }
    
    public static SubLObject f22910(final SubLObject var9, SubLObject var86) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean(NIL == module0004.f104(var9, var86, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f22911(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var93_94 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            var93_94 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            if (NIL == conses_high.member(var93_94, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var93_94 == $ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic145$, (SubLObject)ConsesLow.list(var7, (SubLObject)$ic146$, (SubLObject)$ic90$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f22912() {
        return $g2911$.getGlobalValue();
    }
    
    public static SubLObject f22913(final SubLObject var1) {
        return module0077.f5320(var1, $g2911$.getGlobalValue());
    }
    
    public static SubLObject f22914() {
        return module0077.f5311($g2911$.getGlobalValue());
    }
    
    public static SubLObject f22915() {
        return module0035.sublisp_boolean($g2912$.getGlobalValue());
    }
    
    public static SubLObject f22916() {
        return $g2912$.getGlobalValue();
    }
    
    public static SubLObject f22917(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f22913(var1) && NIL != module0004.f104(var1, $g2913$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f22918() {
        return conses_high.copy_list($g2913$.getGlobalValue());
    }
    
    public static SubLObject f22919(final SubLObject var58) {
        return Sequences.remove(module0130.f8517(var58), $g2913$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic151$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22920() {
        return Sequences.length($g2913$.getGlobalValue());
    }
    
    public static SubLObject f22921() {
        return conses_high.copy_list($g2914$.getGlobalValue());
    }
    
    public static SubLObject f22922(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != f22913(var1) && NIL != module0004.f104(var1, $g2914$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f22923() {
        return Sequences.length($g2914$.getGlobalValue());
    }
    
    public static SubLObject f22924(final SubLObject var96) {
        return module0035.f2293($g2915$.getGlobalValue(), var96, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22925(final SubLObject var96, final SubLObject var75) {
        return module0004.f104(var75, f22924(var96), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22926(final SubLObject var75, final SubLObject var96) {
        if (NIL != module0173.f10955(var75) && NIL == f22925(var96, var75)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f22927(final SubLObject var58) {
        return Sequences.remove(module0130.f8517(var58), $g2914$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic151$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22928(final SubLObject var75) {
        assert NIL != module0173.f10955(var75) : var75;
        return conses_high.copy_list(Hashtables.gethash_without_values(var75, $g2916$.getGlobalValue(), (SubLObject)NIL));
    }
    
    public static SubLObject f22929(final SubLObject var75) {
        return module0035.sublisp_boolean(Hashtables.gethash_without_values(var75, $g2916$.getGlobalValue(), (SubLObject)NIL));
    }
    
    public static SubLObject f22930(final SubLObject var75, final SubLObject var58) {
        assert NIL != module0173.f10955(var75) : var75;
        return Sequences.remove(module0130.f8517(var58), Hashtables.gethash_without_values(var75, $g2916$.getGlobalValue(), (SubLObject)NIL), Symbols.symbol_function((SubLObject)EQL), (SubLObject)$ic151$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22931(final SubLObject var75, final SubLObject var58) {
        assert NIL != module0173.f10955(var75) : var75;
        SubLObject var76 = (SubLObject)NIL;
        SubLObject var77 = f22927(var58);
        SubLObject var78 = (SubLObject)NIL;
        var78 = var77.first();
        while (NIL != var77) {
            if (NIL == f22926(var75, var78)) {
                var76 = (SubLObject)ConsesLow.cons(var78, var76);
            }
            var77 = var77.rest();
            var78 = var77.first();
        }
        return Sequences.nreverse(var76);
    }
    
    public static SubLObject f22932() {
        return module0030.f1625($g2916$.getGlobalValue());
    }
    
    public static SubLObject f22933() {
        return module0077.f5312(f22934());
    }
    
    public static SubLObject f22935() {
        return module0077.f5311(f22934());
    }
    
    public static SubLObject f22934() {
        final SubLObject var98 = module0077.f5313((SubLObject)EQL, f22914());
        SubLObject var99 = (SubLObject)NIL;
        SubLObject var100 = (SubLObject)NIL;
        final Iterator var101 = Hashtables.getEntrySetIterator($g2916$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(var101)) {
                final Map.Entry var102 = Hashtables.iteratorNextEntry(var101);
                var99 = Hashtables.getEntryKey(var102);
                SubLObject var103;
                var100 = (var103 = Hashtables.getEntryValue(var102));
                SubLObject var104 = (SubLObject)NIL;
                var104 = var103.first();
                while (NIL != var103) {
                    if (NIL == f22917(var104)) {
                        module0077.f5326(var104, var98);
                    }
                    var103 = var103.rest();
                    var104 = var103.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var101);
        }
        return var98;
    }
    
    public static SubLObject f22936() {
        module0077.f5328($g2919$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22937() {
        return module0077.f5339($g2919$.getGlobalValue());
    }
    
    public static SubLObject f22938(final SubLObject var75) {
        return module0077.f5326(var75, $g2919$.getGlobalValue());
    }
    
    public static SubLObject f22939(final SubLObject var75) {
        return module0077.f5327(var75, $g2919$.getGlobalValue());
    }
    
    public static SubLObject f22940(final SubLObject var75) {
        return module0077.f5320(var75, $g2919$.getGlobalValue());
    }
    
    public static SubLObject f22941(final SubLObject var32, final SubLObject var33) {
        final SubLObject var34 = f22942(var32, var33);
        final SubLObject var35 = f22843(var32, (SubLObject)$ic112$, var34);
        module0077.f5326(var35, $g2911$.getGlobalValue());
        f22943(var35);
        return var35;
    }
    
    public static SubLObject f22944(final SubLObject var75, final SubLObject var32) {
        final SubLObject var76 = f22786(var32);
        if (NIL != var76) {
            SubLObject var77 = conses_high.assoc(var76, $g2917$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var77) {
                var77 = (SubLObject)ConsesLow.list(var76);
                $g2917$.setGlobalValue((SubLObject)ConsesLow.cons(var77, $g2917$.getGlobalValue()));
            }
            ConsesLow.rplacd(var77, conses_high.adjoin(var75, var77.rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            return f22945(var75, var76);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22946(final SubLObject var75, final SubLObject var32) {
        final SubLObject var76 = f22786(var32);
        if (NIL != var76) {
            SubLObject var77 = conses_high.assoc(var76, $g2918$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var77) {
                var77 = (SubLObject)ConsesLow.list(var76);
                $g2918$.setGlobalValue((SubLObject)ConsesLow.cons(var77, $g2918$.getGlobalValue()));
            }
            ConsesLow.rplacd(var77, conses_high.adjoin(var75, var77.rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            return var76;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22947(final SubLObject var75, final SubLObject var32) {
        final SubLObject var76 = f22786(var32);
        if (NIL != var76) {
            SubLObject var77 = conses_high.assoc(var76, $g2915$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var77) {
                var77 = (SubLObject)ConsesLow.list(var76);
                $g2915$.setGlobalValue((SubLObject)ConsesLow.cons(var77, $g2915$.getGlobalValue()));
            }
            ConsesLow.rplacd(var77, conses_high.adjoin(var75, var77.rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            return var76;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22948(final SubLObject var32) {
        final SubLObject var33 = f22786(var32);
        if (NIL != var33) {
            module0077.f5326(var33, $g2911$.getGlobalValue());
            f22943(var33);
            return var33;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22942(final SubLObject var32, SubLObject var33) {
        var33 = conses_high.copy_tree(var33);
        final SubLObject var35;
        final SubLObject var34 = var35 = conses_high.getf(var33, (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
        if (!var35.eql((SubLObject)$ic161$)) {
            if (!var35.eql((SubLObject)$ic162$)) {
                Errors.error((SubLObject)$ic163$, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f22949(final SubLObject var32, SubLObject var105) {
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)T;
        }
        final SubLObject var106 = f22786(var32);
        if (NIL != var106) {
            f22836(var106);
            module0077.f5327(var106, $g2911$.getGlobalValue());
            $g2913$.setGlobalValue(Sequences.remove(var106, $g2913$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            $g2914$.setGlobalValue(Sequences.remove(var106, $g2914$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            $g2917$.setGlobalValue(Sequences.delete(var106, $g2917$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic164$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            $g2918$.setGlobalValue(Sequences.delete(var106, $g2918$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic164$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            $g2915$.setGlobalValue(Sequences.delete(var106, $g2915$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic164$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
            if (NIL != var105) {
                f22950();
            }
            return var106;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22951(final SubLObject var32) {
        final SubLObject var33 = f22786(var32);
        if (NIL != var33) {
            f22836(var33);
            module0077.f5327(var33, $g2903$.getGlobalValue());
        }
        return var33;
    }
    
    public static SubLObject f22952(final SubLObject var75, final SubLObject var32, SubLObject var105) {
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)NIL;
        }
        final SubLObject var106 = f22786(var32);
        if (NIL != var106) {
            final SubLObject var107 = conses_high.assoc(var106, $g2917$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var107) {
                ConsesLow.rplacd(var107, Sequences.delete(var75, var107.rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                if (NIL == var107.rest()) {
                    $g2917$.setGlobalValue(Sequences.delete(var107, $g2917$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
            }
            if (NIL != var105) {
                f22950();
            }
            return var106;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22953(final SubLObject var75, final SubLObject var32, SubLObject var105) {
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)NIL;
        }
        final SubLObject var106 = f22786(var32);
        if (NIL != var106) {
            final SubLObject var107 = conses_high.assoc(var106, $g2918$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var107) {
                ConsesLow.rplacd(var107, Sequences.delete(var75, var107.rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                if (NIL == var107.rest()) {
                    $g2918$.setGlobalValue(Sequences.delete(var107, $g2918$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
            }
            if (NIL != var105) {
                f22950();
            }
            return var106;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22954(final SubLObject var75, final SubLObject var32, SubLObject var105) {
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)NIL;
        }
        final SubLObject var106 = f22786(var32);
        if (NIL != var106) {
            final SubLObject var107 = conses_high.assoc(var106, $g2915$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var107) {
                ConsesLow.rplacd(var107, Sequences.delete(var75, var107.rest(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                if (NIL == var107.rest()) {
                    $g2915$.setGlobalValue(Sequences.delete(var107, $g2915$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
            }
            if (NIL != var105) {
                f22950();
            }
            return var106;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22950() {
        f22955();
        f22937();
        SubLObject var14 = $g2917$.getGlobalValue();
        SubLObject var15 = (SubLObject)NIL;
        var15 = var14.first();
        while (NIL != var14) {
            SubLObject var17;
            final SubLObject var16 = var17 = var15;
            SubLObject var18 = (SubLObject)NIL;
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var16, (SubLObject)$ic165$);
            var18 = var17.first();
            var17 = var17.rest();
            SubLObject var14_110;
            var19 = (var14_110 = var17);
            SubLObject var20 = (SubLObject)NIL;
            var20 = var14_110.first();
            while (NIL != var14_110) {
                f22945(var20, var18);
                var14_110 = var14_110.rest();
                var20 = var14_110.first();
            }
            var14 = var14.rest();
            var15 = var14.first();
        }
        final SubLObject var21 = module0077.f5333(f22912());
        SubLObject var22;
        SubLObject var23;
        SubLObject var24;
        for (var22 = module0032.f1741(var21), var23 = (SubLObject)NIL, var23 = module0032.f1742(var22, var21); NIL == module0032.f1744(var22, var23); var23 = module0032.f1743(var23)) {
            var24 = module0032.f1745(var22, var23);
            if (NIL != module0032.f1746(var23, var24)) {
                f22943(var24);
            }
        }
        module0358.f23694();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22955() {
        Hashtables.clrhash($g2916$.getGlobalValue());
        $g2912$.setGlobalValue((SubLObject)NIL);
        $g2913$.setGlobalValue((SubLObject)NIL);
        $g2914$.setGlobalValue((SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22943(final SubLObject var9) {
        final SubLThread var10 = SubLProcess.currentSubLThread();
        if (NIL != f22909(var9)) {
            if (NIL != $g2920$.getDynamicValue(var10)) {
                $g2912$.setGlobalValue(module0035.f2243(var9, $g2912$.getGlobalValue(), (SubLObject)EQL, (SubLObject)$ic166$, (SubLObject)IDENTITY));
            }
            else if (NIL == conses_high.member(var9, $g2912$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                $g2912$.setGlobalValue((SubLObject)ConsesLow.cons(var9, $g2912$.getGlobalValue()));
            }
        }
        else {
            final SubLObject var11 = f22877(var9);
            final SubLObject var12 = f22847(var9);
            if (NIL != var12) {
                if (NIL != $g2920$.getDynamicValue(var10)) {
                    $g2914$.setGlobalValue(module0035.f2243(var9, $g2914$.getGlobalValue(), (SubLObject)EQL, (SubLObject)$ic166$, (SubLObject)IDENTITY));
                }
                else if (NIL == conses_high.member(var9, $g2914$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    $g2914$.setGlobalValue((SubLObject)ConsesLow.cons(var9, $g2914$.getGlobalValue()));
                }
            }
            else if (NIL == var11) {
                if (NIL != $g2920$.getDynamicValue(var10)) {
                    $g2913$.setGlobalValue(module0035.f2243(var9, $g2913$.getGlobalValue(), (SubLObject)EQL, (SubLObject)$ic166$, (SubLObject)IDENTITY));
                }
                else if (NIL == conses_high.member(var9, $g2913$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    $g2913$.setGlobalValue((SubLObject)ConsesLow.cons(var9, $g2913$.getGlobalValue()));
                }
            }
            else if (var11.isAtom()) {
                f22945(var11, var9);
            }
            else {
                SubLObject var13 = var11;
                SubLObject var14 = (SubLObject)NIL;
                var14 = var13.first();
                while (NIL != var13) {
                    f22945(var14, var9);
                    var13 = var13.rest();
                    var14 = var13.first();
                }
            }
        }
        return var9;
    }
    
    public static SubLObject f22945(final SubLObject var75, final SubLObject var9) {
        final SubLThread var76 = SubLProcess.currentSubLThread();
        Hashtables.sethash(var75, $g2916$.getGlobalValue(), (NIL != $g2920$.getDynamicValue(var76)) ? module0035.f2243(var9, Hashtables.gethash(var75, $g2916$.getGlobalValue(), (SubLObject)NIL), (SubLObject)EQL, (SubLObject)$ic166$, (SubLObject)IDENTITY) : conses_high.adjoin(var9, Hashtables.gethash(var75, $g2916$.getGlobalValue(), (SubLObject)NIL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var9;
    }
    
    public static SubLObject f22956(final SubLObject var117, final SubLObject var118) {
        final SubLObject var119 = conses_high.assoc(var117, $g2917$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var120 = conses_high.assoc(var118, $g2917$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var121 = module0038.f2638(f22825(var117));
        final SubLObject var122 = module0038.f2638(f22825(var118));
        final SubLObject var123 = Sequences.length(var121);
        final SubLObject var124 = Sequences.length(var122);
        if (NIL != var119 && NIL == var120) {
            return (SubLObject)NIL;
        }
        if (NIL == var119 && NIL != var120) {
            return (SubLObject)T;
        }
        if (var123.numL(var124)) {
            return (SubLObject)T;
        }
        if (var123.numG(var124)) {
            return (SubLObject)NIL;
        }
        return Strings.stringL(var121, var122, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22957(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic168$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic168$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var132_133 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic168$);
            var132_133 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic168$);
            if (NIL == conses_high.member(var132_133, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var132_133 == $ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic168$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic145$, (SubLObject)ConsesLow.list(var7, (SubLObject)$ic169$, (SubLObject)$ic90$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f22958() {
        return $g2921$.getGlobalValue();
    }
    
    public static SubLObject f22959(final SubLObject var1) {
        return module0077.f5320(var1, $g2921$.getGlobalValue());
    }
    
    public static SubLObject f22960() {
        return module0077.f5311($g2921$.getGlobalValue());
    }
    
    public static SubLObject f22961() {
        SubLObject var135 = (SubLObject)NIL;
        final SubLObject var136 = module0077.f5333(f22958());
        SubLObject var137;
        SubLObject var138;
        SubLObject var139;
        for (var137 = module0032.f1741(var136), var138 = (SubLObject)NIL, var138 = module0032.f1742(var137, var136); NIL == module0032.f1744(var137, var138); var138 = module0032.f1743(var138)) {
            var139 = module0032.f1745(var137, var138);
            if (NIL != module0032.f1746(var138, var139)) {
                var135 = (SubLObject)ConsesLow.cons(var139, var135);
            }
        }
        return var135;
    }
    
    public static SubLObject f22962(final SubLObject var32, final SubLObject var33) {
        final SubLObject var34 = f22843(var32, (SubLObject)$ic172$, var33);
        module0077.f5326(var34, $g2921$.getGlobalValue());
        return var34;
    }
    
    public static SubLObject f22963(final SubLObject var32) {
        final SubLObject var33 = f22786(var32);
        if (NIL != f22789(var33)) {
            f22836(var33);
            return module0077.f5327(var33, $g2921$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22964(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var142_143 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            var142_143 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            if (NIL == conses_high.member(var142_143, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var142_143 == $ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)$ic173$, (SubLObject)$ic90$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f22965() {
        return $g2903$.getGlobalValue();
    }
    
    public static SubLObject f22966() {
        return conses_high.copy_list($g2903$.getGlobalValue());
    }
    
    public static SubLObject f22967(final SubLObject var1) {
        SubLObject var2 = f22965();
        SubLObject var3 = (SubLObject)NIL;
        var3 = var2.first();
        while (NIL != var2) {
            if (var1.eql(var3)) {
                return (SubLObject)T;
            }
            var2 = var2.rest();
            var3 = var2.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f22968() {
        return Sequences.length($g2903$.getGlobalValue());
    }
    
    public static SubLObject f22969(final SubLObject var145) {
        return module0035.f2293($g2918$.getGlobalValue(), var145, Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22970(final SubLObject var145, final SubLObject var75) {
        return module0004.f104(var75, f22969(var145), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22971(final SubLObject var75, final SubLObject var145) {
        if (NIL != module0173.f10955(var75) && NIL != f22940(var75) && NIL == f22970(var145, var75)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f22972(final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)$ic176$, var33);
        if (NIL == conses_high.member(var35, $g2903$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2903$.setGlobalValue((SubLObject)ConsesLow.cons(var35, $g2903$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f22973(final SubLObject var9) {
        return (SubLObject)makeBoolean(NIL != f22913(var9) || NIL != f22959(var9));
    }
    
    public static SubLObject f22974(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var152_153 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            var152_153 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            if (NIL == conses_high.member(var152_153, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var152_153 == $ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)$ic178$, (SubLObject)$ic90$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f22975() {
        return $g2922$.getGlobalValue();
    }
    
    public static SubLObject f22976(final SubLObject var1) {
        return module0004.f104(var1, $g2922$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22977() {
        return Sequences.length($g2922$.getGlobalValue());
    }
    
    public static SubLObject f22978(final SubLObject var32, final SubLObject var33) {
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)$ic181$, var33);
        if (NIL == conses_high.member(var35, $g2922$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2922$.setGlobalValue((SubLObject)ConsesLow.cons(var35, $g2922$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f22979(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var161_162 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            var161_162 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            if (NIL == conses_high.member(var161_162, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var161_162 == $ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)$ic183$, (SubLObject)$ic90$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f22980() {
        return $g2923$.getGlobalValue();
    }
    
    public static SubLObject f22981(final SubLObject var1) {
        return module0004.f104(var1, $g2923$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22982() {
        return Sequences.length($g2923$.getGlobalValue());
    }
    
    public static SubLObject f22983(final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)$ic186$, var33);
        if (NIL == conses_high.member(var35, $g2923$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2923$.setGlobalValue((SubLObject)ConsesLow.cons(var35, $g2923$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f22984(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic168$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic168$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var170_171 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic168$);
            var170_171 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic168$);
            if (NIL == conses_high.member(var170_171, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var170_171 == $ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic168$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)$ic188$, (SubLObject)$ic90$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f22985() {
        return conses_high.copy_list($g2924$.getGlobalValue());
    }
    
    public static SubLObject f22986(final SubLObject var1) {
        return module0004.f104(var1, $g2924$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22987() {
        return Sequences.length($g2924$.getGlobalValue());
    }
    
    public static SubLObject f22988(final SubLObject var128) {
        final SubLObject var129 = f22793(var128, (SubLObject)$ic189$);
        if (var129.isSymbol()) {
            return Symbols.symbol_value(var129);
        }
        return var129;
    }
    
    public static SubLObject f22989(final SubLObject var128) {
        return f22793(var128, (SubLObject)$ic190$);
    }
    
    public static SubLObject f22990(final SubLObject var32, final SubLObject var33) {
        final SubLObject var34 = f22991(var32, var33);
        final SubLObject var36;
        final SubLObject var35 = var36 = f22843(var32, (SubLObject)$ic191$, var34);
        if (NIL == conses_high.member(var36, $g2924$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2924$.setGlobalValue((SubLObject)ConsesLow.cons(var36, $g2924$.getGlobalValue()));
        }
        return var35;
    }
    
    public static SubLObject f22992(final SubLObject var9) {
        return f22993(var9);
    }
    
    public static SubLObject f22994(final SubLObject var32) {
        return f22995(var32);
    }
    
    public static SubLObject f22993(final SubLObject var128) {
        f22836(var128);
        $g2924$.setGlobalValue(Sequences.remove(var128, $g2924$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return var128;
    }
    
    public static SubLObject f22995(final SubLObject var32) {
        final SubLObject var33 = f22786(var32);
        return f22993(var33);
    }
    
    public static SubLObject f22991(final SubLObject var32, SubLObject var33) {
        var33 = conses_high.copy_tree(var33);
        final SubLObject var35;
        final SubLObject var34 = var35 = conses_high.getf(var33, (SubLObject)$ic56$, (SubLObject)UNPROVIDED);
        if (!var35.eql((SubLObject)$ic161$)) {
            if (!var35.eql((SubLObject)$ic162$)) {
                Errors.error((SubLObject)$ic192$, var32);
            }
        }
        return var33;
    }
    
    public static SubLObject f22996(final SubLObject var1) {
        return module0004.f104(var1, $g2925$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f22997(final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)$ic194$, var33);
        if (NIL == conses_high.member(var35, $g2925$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2925$.setGlobalValue((SubLObject)ConsesLow.cons(var35, $g2925$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f22998() {
        return Sequences.length($g2925$.getGlobalValue());
    }
    
    public static SubLObject f22999(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        final SubLObject var6 = var5.rest();
        var5 = var5.first();
        SubLObject var7 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic144$);
        var7 = var5.first();
        var5 = var5.rest();
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = var5;
        SubLObject var10 = (SubLObject)NIL;
        SubLObject var180_181 = (SubLObject)NIL;
        while (NIL != var9) {
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            var180_181 = var9.first();
            var9 = var9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var9, var4, (SubLObject)$ic144$);
            if (NIL == conses_high.member(var180_181, (SubLObject)$ic88$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var10 = (SubLObject)T;
            }
            if (var180_181 == $ic89$) {
                var8 = var9.first();
            }
            var9 = var9.rest();
        }
        if (NIL != var10 && NIL == var8) {
            cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic144$);
        }
        final SubLObject var11 = cdestructuring_bind.property_list_member((SubLObject)$ic90$, var5);
        final SubLObject var12 = (SubLObject)((NIL != var11) ? conses_high.cadr(var11) : NIL);
        final SubLObject var13;
        var5 = (var13 = var6);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic5$, (SubLObject)ConsesLow.list(var7, (SubLObject)$ic196$, (SubLObject)$ic90$, var12), ConsesLow.append(var13, (SubLObject)NIL));
    }
    
    public static SubLObject f23000() {
        return $g2926$.getGlobalValue();
    }
    
    public static SubLObject f23001(final SubLObject var1) {
        return module0004.f104(var1, $g2926$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f23002() {
        return Sequences.length($g2926$.getGlobalValue());
    }
    
    public static SubLObject f23003(final SubLObject var32, SubLObject var33) {
        if (var33 == UNPROVIDED) {
            var33 = (SubLObject)NIL;
        }
        final SubLObject var35;
        final SubLObject var34 = var35 = f22843(var32, (SubLObject)$ic199$, var33);
        if (NIL == conses_high.member(var35, $g2926$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
            $g2926$.setGlobalValue((SubLObject)ConsesLow.cons(var35, $g2926$.getGlobalValue()));
        }
        return var34;
    }
    
    public static SubLObject f23004(final SubLObject var1, final SubLObject var21) {
        return f23005(var1, var21);
    }
    
    public static SubLObject f23005(final SubLObject var9, final SubLObject var21) {
        module0021.f1110($g2927$.getGlobalValue(), var21);
        f23006(var9, var21);
        return var9;
    }
    
    public static SubLObject f23006(final SubLObject var9, final SubLObject var21) {
        module0021.f1038(f22825(var9), var21);
        module0021.f1038(f22838(var9), var21);
        return var9;
    }
    
    public static SubLObject f23007(final SubLObject var21) {
        final SubLObject var22 = module0021.f1060(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var23 = module0021.f1060(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return f22828(var22, var23);
    }
    
    public static SubLObject f23008() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22774", "S#25445", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22775", "S#25446");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22776", "S#25447", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22777", "S#25448", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22778", "S#25449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22779", "S#25440", 1, 0, false);
        new $f22779$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22787", "S#25450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22780", "S#25451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22781", "S#25452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22782", "S#25453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22783", "S#25454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22784", "S#25455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22785", "S#25456", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22788", "S#25457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22790", "S#25458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22794", "S#25459", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22795", "S#25460", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22796", "S#25461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22789", "S#14902", 1, 0, false);
        new $f22789$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22798", "S#25462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22799", "S#25463", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22800", "S#25464", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22801", "S#25465", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22802", "S#25466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22803", "S#25467", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22804", "S#25468", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22805", "S#25469", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22806", "S#25470", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22807", "S#25471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22808", "S#25472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22809", "S#25473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22810", "S#25474", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22811", "S#25475", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22812", "S#25476", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22813", "S#25477", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22814", "S#25478", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22815", "S#25479", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22816", "S#25480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22817", "S#25481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22818", "S#25482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22819", "S#25483", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22820", "S#25484", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22821", "S#25485", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22822", "S#25486", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22823", "S#25487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22824", "S#25488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22797", "S#25489", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22826", "S#25441", 1, 0, false);
        new $f22826$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22827", "S#25490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22828", "S#25491", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22832", "S#25492", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22833", "S#25493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22834", "S#25494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22835", "S#25495", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22830", "S#25496", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22829", "S#25497", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22837", "S#25498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22825", "HL-MODULE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22838", "S#25499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22839", "S#14903", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22793", "S#25500", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22840", "S#25501", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22841", "S#25502");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22842", "S#25503", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22786", "S#14901", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22831", "S#25504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22836", "S#14904", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22843", "S#14905", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22844", "S#25505", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22845", "S#25506", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22791", "S#25507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22792", "S#25508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22846", "S#25509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22847", "S#25510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22848", "S#25511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22849", "S#25442", 1, 0, false);
        new $f22849$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22850", "S#25512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22851", "S#25513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22852", "S#25514", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22853", "S#25515", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22854", "S#25516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22855", "S#25517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22856", "S#25518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22857", "S#25519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22858", "S#25520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22859", "S#25521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22860", "S#25522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22861", "S#25523", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22865", "S#25524", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22866", "S#25525", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22862", "S#25526", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22863", "S#25527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22864", "S#25528", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22867", "S#25529", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22868", "S#25530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22869", "S#25531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22870", "S#25532", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22871", "S#25533", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22872", "S#25534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22873", "S#25535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22874", "S#25536", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22875", "S#25537", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22876", "S#25538", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22877", "S#25539", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22878", "S#25540", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22880", "S#25541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22881", "S#25542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22882", "S#25543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22883", "S#25544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22884", "S#25545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22885", "S#25546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22886", "S#25547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22887", "S#25548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22888", "S#25549", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22889", "S#25550", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22890", "S#25551", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22891", "S#25552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22892", "S#25553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22893", "S#25554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22894", "S#25555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22895", "S#25556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22896", "S#25557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22897", "S#25558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22898", "S#25559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22899", "S#25560", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22900", "S#25561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22901", "S#25562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22902", "S#25563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22879", "S#25564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22903", "S#25565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22904", "S#25566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22905", "S#25567", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22907", "S#25568", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22906", "S#25569", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22908", "S#25570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22909", "S#25571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22910", "S#25572", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22911", "S#25573");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22912", "S#25574", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22913", "S#25575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22914", "S#25576", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22915", "S#25577", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22916", "S#25578", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22917", "S#25579", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22918", "S#25580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22919", "S#25581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22920", "S#25582", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22921", "S#25583", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22922", "S#25584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22923", "S#25585", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22924", "S#25586", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22925", "S#25587", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22926", "S#25588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22927", "S#25589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22928", "S#25590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22929", "S#25591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22930", "S#25592", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22931", "S#25593", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22932", "S#25594", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22933", "S#25595", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22935", "S#25596", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22934", "S#25597", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22936", "S#25598", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22937", "S#25599", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22938", "REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22939", "S#25600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22940", "S#25601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22941", "INFERENCE-REMOVAL-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22944", "S#25602", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22946", "S#25603", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22947", "S#25604", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22948", "REDECLARE-INFERENCE-REMOVAL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22942", "S#25605", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22949", "UNDECLARE-INFERENCE-REMOVAL-MODULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22951", "S#25606", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22952", "S#25607", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22953", "S#25608", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22954", "S#25609", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22950", "RECLASSIFY-REMOVAL-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22955", "S#25610", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22943", "S#25611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22945", "S#25612", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22956", "S#25613", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22957", "S#25614");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22958", "S#25615", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22959", "S#25616", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22960", "S#25617", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22961", "S#25618", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22962", "S#25619", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22963", "S#25620", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22964", "S#25621");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22965", "S#25622", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22966", "S#25623", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22967", "S#25624", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22968", "S#25625", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22969", "S#25626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22970", "S#25627", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22971", "S#25628", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22972", "S#25629", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22973", "S#25630", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22974", "S#25631");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22975", "S#25632", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22976", "S#25633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22977", "S#25634", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22978", "S#25635", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22979", "S#25636");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22980", "S#25637", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22981", "S#25638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22982", "S#25639", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22983", "S#25640", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22984", "S#25641");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22985", "S#25642", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22986", "S#25643", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22987", "S#25644", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22988", "S#25645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22989", "S#25646", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22990", "INFERENCE-REWRITE-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22992", "S#25647", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22994", "S#25648", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22993", "S#25649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22995", "S#25650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22991", "S#25651", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22996", "S#25652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22997", "S#25653", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f22998", "S#25654", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0340", "f22999", "S#25655");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23000", "S#25656", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23001", "S#25657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23002", "S#25658", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23003", "S#25659", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23004", "S#25660", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23005", "S#25661", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23006", "S#25662", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0340", "f23007", "S#25663", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23009() {
        $g2903$ = SubLFiles.deflexical("S#25664", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic0$)) ? $g2903$.getGlobalValue() : NIL));
        $g2904$ = SubLFiles.deflexical("S#25665", (SubLObject)$ic1$);
        $g2905$ = SubLFiles.deflexical("S#25666", (SubLObject)$ic10$);
        $g2906$ = SubLFiles.deflexical("S#25667", (SubLObject)$ic11$);
        $g2907$ = SubLFiles.deflexical("S#25668", module0084.f5781(Sequences.reverse((SubLObject)ConsesLow.listS((SubLObject)$ic12$, (SubLObject)ConsesLow.list((SubLObject)$ic13$, $g2906$.getGlobalValue()), (SubLObject)$ic14$)), Symbols.symbol_function((SubLObject)EQL)));
        $g2908$ = SubLFiles.defconstant("S#25669", (SubLObject)$ic22$);
        $g2909$ = SubLFiles.deflexical("S#25670", (SubLObject)NIL);
        $g2910$ = SubLFiles.deflexical("S#25671", (NIL != Symbols.boundp((SubLObject)$ic85$)) ? $g2910$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic86$, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        $g2911$ = SubLFiles.deflexical("S#25672", (NIL != Symbols.boundp((SubLObject)$ic143$)) ? $g2911$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2912$ = SubLFiles.deflexical("S#25673", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic149$)) ? $g2912$.getGlobalValue() : NIL));
        $g2913$ = SubLFiles.deflexical("S#25674", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic150$)) ? $g2913$.getGlobalValue() : NIL));
        $g2914$ = SubLFiles.deflexical("S#25675", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic152$)) ? $g2914$.getGlobalValue() : NIL));
        $g2916$ = SubLFiles.deflexical("S#25676", (NIL != Symbols.boundp((SubLObject)$ic153$)) ? $g2916$.getGlobalValue() : Hashtables.make_hash_table((SubLObject)$ic154$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g2917$ = SubLFiles.deflexical("S#25677", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic156$)) ? $g2917$.getGlobalValue() : NIL));
        $g2918$ = SubLFiles.deflexical("S#25678", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic157$)) ? $g2918$.getGlobalValue() : NIL));
        $g2915$ = SubLFiles.deflexical("S#25679", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic158$)) ? $g2915$.getGlobalValue() : NIL));
        $g2919$ = SubLFiles.deflexical("S#25680", (NIL != Symbols.boundp((SubLObject)$ic159$)) ? $g2919$.getGlobalValue() : module0077.f5313((SubLObject)EQL, (SubLObject)$ic160$));
        $g2920$ = SubLFiles.defparameter("S#25681", (SubLObject)T);
        $g2921$ = SubLFiles.deflexical("S#25682", (NIL != Symbols.boundp((SubLObject)$ic167$)) ? $g2921$.getGlobalValue() : module0077.f5313(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g2922$ = SubLFiles.deflexical("S#25683", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic177$)) ? $g2922$.getGlobalValue() : NIL));
        $g2923$ = SubLFiles.deflexical("S#25684", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic182$)) ? $g2923$.getGlobalValue() : NIL));
        $g2924$ = SubLFiles.deflexical("*REWRITE-MODULES*", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic187$)) ? $g2924$.getGlobalValue() : NIL));
        $g2925$ = SubLFiles.deflexical("S#25685", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic193$)) ? $g2925$.getGlobalValue() : NIL));
        $g2926$ = SubLFiles.deflexical("S#25686", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic195$)) ? $g2926$.getGlobalValue() : NIL));
        $g2927$ = SubLFiles.defconstant("S#25687", (SubLObject)$ic200$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f23010() {
        module0003.f57((SubLObject)$ic0$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g2908$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic28$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic29$);
        Structures.def_csetf((SubLObject)$ic30$, (SubLObject)$ic31$);
        Structures.def_csetf((SubLObject)$ic32$, (SubLObject)$ic33$);
        Structures.def_csetf((SubLObject)$ic34$, (SubLObject)$ic35$);
        Structures.def_csetf((SubLObject)$ic36$, (SubLObject)$ic37$);
        Structures.def_csetf((SubLObject)$ic38$, (SubLObject)$ic39$);
        Structures.def_csetf((SubLObject)$ic40$, (SubLObject)$ic41$);
        Structures.def_csetf((SubLObject)$ic42$, (SubLObject)$ic43$);
        Structures.def_csetf((SubLObject)$ic44$, (SubLObject)$ic45$);
        Structures.def_csetf((SubLObject)$ic46$, (SubLObject)$ic47$);
        Structures.def_csetf((SubLObject)$ic48$, (SubLObject)$ic49$);
        Structures.def_csetf((SubLObject)$ic50$, (SubLObject)$ic51$);
        Structures.def_csetf((SubLObject)$ic52$, (SubLObject)$ic53$);
        Equality.identity((SubLObject)$ic22$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2908$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic71$));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g2908$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic73$));
        module0034.f1909((SubLObject)$ic79$);
        module0003.f57((SubLObject)$ic85$);
        module0002.f50((SubLObject)$ic95$, (SubLObject)$ic96$);
        module0003.f57((SubLObject)$ic143$);
        module0002.f50((SubLObject)$ic147$, (SubLObject)$ic148$);
        module0003.f57((SubLObject)$ic149$);
        module0003.f57((SubLObject)$ic150$);
        module0003.f57((SubLObject)$ic152$);
        module0003.f57((SubLObject)$ic153$);
        module0003.f57((SubLObject)$ic156$);
        module0003.f57((SubLObject)$ic157$);
        module0003.f57((SubLObject)$ic158$);
        module0003.f57((SubLObject)$ic159$);
        module0003.f57((SubLObject)$ic167$);
        module0002.f50((SubLObject)$ic170$, (SubLObject)$ic171$);
        module0002.f50((SubLObject)$ic174$, (SubLObject)$ic175$);
        module0003.f57((SubLObject)$ic177$);
        module0002.f50((SubLObject)$ic179$, (SubLObject)$ic180$);
        module0003.f57((SubLObject)$ic182$);
        module0002.f50((SubLObject)$ic184$, (SubLObject)$ic185$);
        module0003.f57((SubLObject)$ic187$);
        module0003.f57((SubLObject)$ic193$);
        module0003.f57((SubLObject)$ic195$);
        module0002.f50((SubLObject)$ic197$, (SubLObject)$ic198$);
        module0021.f1193($g2927$.getGlobalValue(), (SubLObject)$ic201$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), $g2908$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic202$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f23008();
    }
    
    public void initializeVariables() {
        f23009();
    }
    
    public void runTopLevelForms() {
        f23010();
    }
    
    static {
        me = (SubLFile)new module0340();
        $g2903$ = null;
        $g2904$ = null;
        $g2905$ = null;
        $g2906$ = null;
        $g2907$ = null;
        $g2908$ = null;
        $g2909$ = null;
        $g2910$ = null;
        $g2911$ = null;
        $g2912$ = null;
        $g2913$ = null;
        $g2914$ = null;
        $g2916$ = null;
        $g2917$ = null;
        $g2918$ = null;
        $g2915$ = null;
        $g2919$ = null;
        $g2920$ = null;
        $g2921$ = null;
        $g2922$ = null;
        $g2923$ = null;
        $g2924$ = null;
        $g2925$ = null;
        $g2926$ = null;
        $g2927$ = null;
        $ic0$ = makeSymbol("S#25664", "CYC");
        $ic1$ = ConsesLow.list(new SubLObject[] { makeKeyword("MODULE-TYPE"), makeKeyword("MODULE-SUBTYPE"), makeKeyword("MODULE-SOURCE"), makeKeyword("CHECK"), makeKeyword("EXTERNAL"), makeKeyword("UNIVERSAL"), makeKeyword("SENSE"), makeKeyword("DIRECTION"), makeKeyword("PREDICATE"), makeKeyword("EVERY-PREDICATES"), makeKeyword("ANY-PREDICATES"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("ARITY"), makeKeyword("EXCLUSIVE"), makeKeyword("SUPPLANTS"), makeKeyword("REQUIRED"), makeKeyword("APPLICABILITY-PATTERN"), makeKeyword("APPLICABILITY"), makeKeyword("COST-PATTERN"), makeKeyword("COST-EXPRESSION"), makeKeyword("COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE-PATTERN"), makeKeyword("COMPLETENESS-PATTERN"), makeKeyword("INPUT-EXTRACT-PATTERN"), makeKeyword("INPUT-VERIFY-PATTERN"), makeKeyword("INPUT-ENCODE-PATTERN"), makeKeyword("OUTPUT-CHECK-PATTERN"), makeKeyword("OUTPUT-GENERATE-PATTERN"), makeKeyword("OUTPUT-DECODE-PATTERN"), makeKeyword("OUTPUT-VERIFY-PATTERN"), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), makeKeyword("RULE-SELECT"), makeKeyword("RULE-FILTER"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), makeKeyword("EXPAND-PATTERN"), makeKeyword("EXPAND"), makeKeyword("REWRITE-CLOSURE"), makeKeyword("SUPPORT-PATTERN"), makeKeyword("SUPPORT"), makeKeyword("SUPPORT-MODULE"), makeKeyword("SUPPORT-MT"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("REWRITE-SUPPORT"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("INCOMPLETENESS"), makeKeyword("ADD"), makeKeyword("REMOVE"), makeKeyword("REMOVE-ALL"), makeKeyword("PREFERRED-OVER"), makeKeyword("DOCUMENTATION"), makeKeyword("EXAMPLE"), makeKeyword("PRETTY-NAME") });
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#11211", "CYC"), (SubLObject)makeSymbol("S#149", "CYC"), (SubLObject)makeSymbol("S#14781", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic3$ = makeUninternedSymbol("US#8E4499");
        $ic4$ = makeSymbol("CLET");
        $ic5$ = makeSymbol("DO-LIST");
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25447", "CYC")));
        $ic7$ = makeSymbol("PWHEN");
        $ic8$ = makeSymbol("S#25501", "CYC");
        $ic9$ = makeSymbol("S#25500", "CYC");
        $ic10$ = ConsesLow.list((SubLObject)makeKeyword("SKSI"), (SubLObject)makeKeyword("KB"), (SubLObject)makeKeyword("ABDUCTION"));
        $ic11$ = makeKeyword("KB");
        $ic12$ = ConsesLow.list((SubLObject)makeKeyword("MODULE-TYPE"));
        $ic13$ = makeKeyword("MODULE-SUBTYPE");
        $ic14$ = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)makeKeyword("MODULE-SOURCE")), ConsesLow.list((SubLObject)makeKeyword("UNIVERSAL")), ConsesLow.list((SubLObject)makeKeyword("SENSE")), ConsesLow.cons((SubLObject)makeKeyword("REQUIRED-PATTERN"), (SubLObject)makeKeyword("ANYTHING")), ConsesLow.list((SubLObject)makeKeyword("REQUIRED-MT")), ConsesLow.list((SubLObject)makeKeyword("REQUIRED")), ConsesLow.list((SubLObject)makeKeyword("COST-PATTERN")), ConsesLow.list((SubLObject)makeKeyword("COST-EXPRESSION")), ConsesLow.cons((SubLObject)makeKeyword("COST"), (SubLObject)makeSymbol("S#25505", "CYC")), ConsesLow.list((SubLObject)makeKeyword("COMPLETENESS")), ConsesLow.list((SubLObject)makeKeyword("COMPLETE-PATTERN")), ConsesLow.list((SubLObject)makeKeyword("COMPLETENESS-PATTERN")), ConsesLow.cons((SubLObject)makeKeyword("CHECK"), (SubLObject)makeKeyword("UNKNOWN")), ConsesLow.list((SubLObject)makeKeyword("RULE-SELECT")), ConsesLow.cons((SubLObject)makeKeyword("EXPAND"), (SubLObject)makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)makeKeyword("EXPAND-PATTERN")), ConsesLow.list((SubLObject)makeKeyword("EXPAND-ITERATIVE-PATTERN")), ConsesLow.list((SubLObject)makeKeyword("PREDICATE")), ConsesLow.list((SubLObject)makeKeyword("ARITY")), ConsesLow.list((SubLObject)makeKeyword("EXCLUSIVE")), ConsesLow.cons((SubLObject)makeKeyword("SUPPLANTS"), (SubLObject)makeKeyword("ALL")), ConsesLow.cons((SubLObject)makeKeyword("DIRECTION"), (SubLObject)makeKeyword("FORWARD")), ConsesLow.cons((SubLObject)makeKeyword("INPUT-EXTRACT-PATTERN"), (SubLObject)makeKeyword("INPUT")), ConsesLow.cons((SubLObject)makeKeyword("INPUT-VERIFY-PATTERN"), (SubLObject)makeKeyword("ANYTHING")), ConsesLow.cons((SubLObject)makeKeyword("INPUT-ENCODE-PATTERN"), (SubLObject)makeKeyword("INPUT")), ConsesLow.list((SubLObject)makeKeyword("OUTPUT-CHECK-PATTERN")), ConsesLow.list((SubLObject)makeKeyword("OUTPUT-GENERATE-PATTERN")), ConsesLow.cons((SubLObject)makeKeyword("OUTPUT-DECODE-PATTERN"), (SubLObject)makeKeyword("INPUT")), ConsesLow.cons((SubLObject)makeKeyword("OUTPUT-VERIFY-PATTERN"), (SubLObject)makeKeyword("ANYTHING")), ConsesLow.cons((SubLObject)makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), (SubLObject)makeKeyword("INPUT")), ConsesLow.list((SubLObject)makeKeyword("SUPPORT-PATTERN")), ConsesLow.list((SubLObject)makeKeyword("SUPPORT")), ConsesLow.cons((SubLObject)makeKeyword("SUPPORT-MODULE"), (SubLObject)makeKeyword("OPAQUE")), ConsesLow.list((SubLObject)makeKeyword("SUPPORT-MT")), ConsesLow.cons((SubLObject)makeKeyword("SUPPORT-STRENGTH"), (SubLObject)makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)makeKeyword("EVERY-PREDICATES")), ConsesLow.cons((SubLObject)makeKeyword("APPLICABILITY"), (SubLObject)makeSymbol("FALSE")), ConsesLow.list((SubLObject)makeKeyword("APPLICABILITY-PATTERN")), ConsesLow.list((SubLObject)makeKeyword("ANY-PREDICATES")), ConsesLow.cons((SubLObject)makeKeyword("DOCUMENTATION"), (SubLObject)makeString("")), ConsesLow.cons((SubLObject)makeKeyword("EXAMPLE"), (SubLObject)makeString("")), ConsesLow.list((SubLObject)makeKeyword("EXTERNAL")), ConsesLow.list((SubLObject)makeKeyword("REWRITE-SUPPORT")), ConsesLow.list((SubLObject)makeKeyword("REWRITE-CLOSURE")) });
        $ic15$ = makeKeyword("ALL");
        $ic16$ = makeKeyword("OR");
        $ic17$ = makeSymbol("S#25440", "CYC");
        $ic18$ = makeKeyword("AND");
        $ic19$ = makeKeyword("NOT");
        $ic20$ = makeKeyword("MODULE-TYPE");
        $ic21$ = makeSymbol("S#14902", "CYC");
        $ic22$ = makeSymbol("S#14781", "CYC");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#29", "CYC"), makeSymbol("S#138", "CYC"), makeSymbol("S#12397", "CYC"), makeSymbol("S#717", "CYC"), makeSymbol("S#15032", "CYC"), makeSymbol("ARITY"), makeSymbol("S#5432", "CYC"), makeSymbol("S#25688", "CYC"), makeSymbol("S#15031", "CYC"), makeSymbol("S#25689", "CYC"), makeSymbol("S#25690", "CYC"), makeSymbol("S#25691", "CYC") });
        $ic24$ = ConsesLow.list(new SubLObject[] { makeKeyword("NAME"), makeKeyword("PLIST"), makeKeyword("SENSE"), makeKeyword("PREDICATE"), makeKeyword("ANY-PREDICATES"), makeKeyword("ARITY"), makeKeyword("DIRECTION"), makeKeyword("REQUIRED-PATTERN"), makeKeyword("REQUIRED-MT"), makeKeyword("EXCLUSIVE-FUNC"), makeKeyword("REQUIRED-FUNC"), makeKeyword("COMPLETENESS") });
        $ic25$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#25462", "CYC"), makeSymbol("S#25463", "CYC"), makeSymbol("S#25464", "CYC"), makeSymbol("S#25465", "CYC"), makeSymbol("S#25466", "CYC"), makeSymbol("S#25467", "CYC"), makeSymbol("S#25468", "CYC"), makeSymbol("S#25469", "CYC"), makeSymbol("S#25470", "CYC"), makeSymbol("S#25471", "CYC"), makeSymbol("S#25472", "CYC"), makeSymbol("S#25473", "CYC") });
        $ic26$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#25474", "CYC"), makeSymbol("S#25475", "CYC"), makeSymbol("S#25476", "CYC"), makeSymbol("S#25477", "CYC"), makeSymbol("S#25478", "CYC"), makeSymbol("S#25479", "CYC"), makeSymbol("S#25480", "CYC"), makeSymbol("S#25481", "CYC"), makeSymbol("S#25482", "CYC"), makeSymbol("S#25483", "CYC"), makeSymbol("S#25484", "CYC"), makeSymbol("S#25485", "CYC") });
        $ic27$ = makeSymbol("S#25489", "CYC");
        $ic28$ = makeSymbol("S#25461", "CYC");
        $ic29$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#14902", "CYC"));
        $ic30$ = makeSymbol("S#25462", "CYC");
        $ic31$ = makeSymbol("S#25474", "CYC");
        $ic32$ = makeSymbol("S#25463", "CYC");
        $ic33$ = makeSymbol("S#25475", "CYC");
        $ic34$ = makeSymbol("S#25464", "CYC");
        $ic35$ = makeSymbol("S#25476", "CYC");
        $ic36$ = makeSymbol("S#25465", "CYC");
        $ic37$ = makeSymbol("S#25477", "CYC");
        $ic38$ = makeSymbol("S#25466", "CYC");
        $ic39$ = makeSymbol("S#25478", "CYC");
        $ic40$ = makeSymbol("S#25467", "CYC");
        $ic41$ = makeSymbol("S#25479", "CYC");
        $ic42$ = makeSymbol("S#25468", "CYC");
        $ic43$ = makeSymbol("S#25480", "CYC");
        $ic44$ = makeSymbol("S#25469", "CYC");
        $ic45$ = makeSymbol("S#25481", "CYC");
        $ic46$ = makeSymbol("S#25470", "CYC");
        $ic47$ = makeSymbol("S#25482", "CYC");
        $ic48$ = makeSymbol("S#25471", "CYC");
        $ic49$ = makeSymbol("S#25483", "CYC");
        $ic50$ = makeSymbol("S#25472", "CYC");
        $ic51$ = makeSymbol("S#25484", "CYC");
        $ic52$ = makeSymbol("S#25473", "CYC");
        $ic53$ = makeSymbol("S#25485", "CYC");
        $ic54$ = makeKeyword("NAME");
        $ic55$ = makeKeyword("PLIST");
        $ic56$ = makeKeyword("SENSE");
        $ic57$ = makeKeyword("PREDICATE");
        $ic58$ = makeKeyword("ANY-PREDICATES");
        $ic59$ = makeKeyword("ARITY");
        $ic60$ = makeKeyword("DIRECTION");
        $ic61$ = makeKeyword("REQUIRED-PATTERN");
        $ic62$ = makeKeyword("REQUIRED-MT");
        $ic63$ = makeKeyword("EXCLUSIVE-FUNC");
        $ic64$ = makeKeyword("REQUIRED-FUNC");
        $ic65$ = makeKeyword("COMPLETENESS");
        $ic66$ = makeString("Invalid slot ~S for construction function");
        $ic67$ = makeKeyword("BEGIN");
        $ic68$ = makeSymbol("S#25486", "CYC");
        $ic69$ = makeKeyword("SLOT");
        $ic70$ = makeKeyword("END");
        $ic71$ = makeSymbol("S#25488", "CYC");
        $ic72$ = makeString("[HL Module: ~a]");
        $ic73$ = makeSymbol("S#25441", "CYC");
        $ic74$ = makeSymbol("S#748", "CYC");
        $ic75$ = makeSymbol("S#25445", "CYC");
        $ic76$ = makeKeyword("EXCLUSIVE");
        $ic77$ = makeKeyword("SUPPLANTS");
        $ic78$ = makeString(":supplants is meaningless without :exclusive being specified.  ~s contains a :supplants specification without an :exclusive.");
        $ic79$ = makeSymbol("S#25495", "CYC");
        $ic80$ = ConsesLow.list((SubLObject)makeKeyword("MODULE-TYPE"), (SubLObject)makeKeyword("INVALID"));
        $ic81$ = makeSymbol("S#25670", "CYC");
        $ic82$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic83$ = makeKeyword("FREE");
        $ic84$ = makeKeyword("DEFAULT");
        $ic85$ = makeSymbol("S#25671", "CYC");
        $ic86$ = makeInteger(212);
        $ic87$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#25692", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic88$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic89$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic90$ = makeKeyword("DONE");
        $ic91$ = makeUninternedSymbol("US#333F606");
        $ic92$ = makeSymbol("DO-HASH-TABLE");
        $ic93$ = ConsesLow.list((SubLObject)makeSymbol("S#25503", "CYC"));
        $ic94$ = makeSymbol("IGNORE");
        $ic95$ = makeSymbol("S#25503", "CYC");
        $ic96$ = makeSymbol("S#25502", "CYC");
        $ic97$ = makeKeyword("ABDUCTION");
        $ic98$ = makeKeyword("UNIVERSAL");
        $ic99$ = makeKeyword("MODULE-SOURCE");
        $ic100$ = makeKeyword("ANYTHING");
        $ic101$ = makeKeyword("REQUIRED");
        $ic102$ = makeKeyword("COST-PATTERN");
        $ic103$ = makeKeyword("COST-EXPRESSION");
        $ic104$ = makeKeyword("COST");
        $ic105$ = makeKeyword("CHECK");
        $ic106$ = makeKeyword("UNKNOWN");
        $ic107$ = makeKeyword("NOT-FULLY-BOUND");
        $ic108$ = makeString("check");
        $ic109$ = makeKeyword("RULE-SELECT");
        $ic110$ = makeKeyword("RULE-FILTER");
        $ic111$ = makeKeyword("EXPAND");
        $ic112$ = makeKeyword("REMOVAL");
        $ic113$ = makeSymbol("S#25693", "CYC");
        $ic114$ = makeSymbol("S#25694", "CYC");
        $ic115$ = makeSymbol("S#25506", "CYC");
        $ic116$ = makeKeyword("EXPAND-PATTERN");
        $ic117$ = makeKeyword("EXPAND-ITERATIVE-PATTERN");
        $ic118$ = makeSymbol("S#14908", "CYC");
        $ic119$ = makeKeyword("FORWARD");
        $ic120$ = makeKeyword("INPUT-EXTRACT-PATTERN");
        $ic121$ = makeKeyword("INPUT-VERIFY-PATTERN");
        $ic122$ = makeKeyword("INPUT-ENCODE-PATTERN");
        $ic123$ = makeKeyword("OUTPUT-CHECK-PATTERN");
        $ic124$ = makeKeyword("OUTPUT-GENERATE-PATTERN");
        $ic125$ = makeKeyword("OUTPUT-DECODE-PATTERN");
        $ic126$ = makeKeyword("OUTPUT-VERIFY-PATTERN");
        $ic127$ = makeKeyword("OUTPUT-CONSTRUCT-PATTERN");
        $ic128$ = makeKeyword("SUPPORT-PATTERN");
        $ic129$ = makeKeyword("SUPPORT");
        $ic130$ = makeKeyword("SUPPORT-MODULE");
        $ic131$ = makeKeyword("SUPPORT-MT");
        $ic132$ = makeKeyword("SUPPORT-STRENGTH");
        $ic133$ = makeKeyword("EVERY-PREDICATES");
        $ic134$ = makeKeyword("APPLICABILITY");
        $ic135$ = makeKeyword("APPLICABILITY-PATTERN");
        $ic136$ = makeKeyword("DOCUMENTATION");
        $ic137$ = makeKeyword("EXAMPLE");
        $ic138$ = makeKeyword("COMPLETE");
        $ic139$ = makeKeyword("INCOMPLETE");
        $ic140$ = makeKeyword("COMPLETE-PATTERN");
        $ic141$ = makeKeyword("COMPLETENESS-PATTERN");
        $ic142$ = makeKeyword("EXTERNAL");
        $ic143$ = makeSymbol("S#25672", "CYC");
        $ic144$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic145$ = makeSymbol("S#708", "CYC");
        $ic146$ = ConsesLow.list((SubLObject)makeSymbol("S#25574", "CYC"));
        $ic147$ = makeSymbol("S#25574", "CYC");
        $ic148$ = makeSymbol("S#25573", "CYC");
        $ic149$ = makeSymbol("S#25673", "CYC");
        $ic150$ = makeSymbol("S#25674", "CYC");
        $ic151$ = makeSymbol("S#25442", "CYC");
        $ic152$ = makeSymbol("S#25675", "CYC");
        $ic153$ = makeSymbol("S#25676", "CYC");
        $ic154$ = makeInteger(32);
        $ic155$ = makeSymbol("FORT-P");
        $ic156$ = makeSymbol("S#25677", "CYC");
        $ic157$ = makeSymbol("S#25678", "CYC");
        $ic158$ = makeSymbol("S#25679", "CYC");
        $ic159$ = makeSymbol("S#25680", "CYC");
        $ic160$ = makeInteger(50);
        $ic161$ = makeKeyword("POS");
        $ic162$ = makeKeyword("NEG");
        $ic163$ = makeString("removal module ~S must have a :SENSE of :POS or :NEG");
        $ic164$ = makeSymbol("CAR");
        $ic165$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#14781", "CYC"), (SubLObject)makeSymbol("S#10994", "CYC"));
        $ic166$ = makeSymbol("S#25613", "CYC");
        $ic167$ = makeSymbol("S#25682", "CYC");
        $ic168$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#205", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic169$ = ConsesLow.list((SubLObject)makeSymbol("S#25615", "CYC"));
        $ic170$ = makeSymbol("S#25615", "CYC");
        $ic171$ = makeSymbol("S#25614", "CYC");
        $ic172$ = makeKeyword("REMOVAL-CONJUNCTIVE");
        $ic173$ = ConsesLow.list((SubLObject)makeSymbol("S#25622", "CYC"));
        $ic174$ = makeSymbol("S#25622", "CYC");
        $ic175$ = makeSymbol("S#25621", "CYC");
        $ic176$ = makeKeyword("META-REMOVAL");
        $ic177$ = makeSymbol("S#25683", "CYC");
        $ic178$ = ConsesLow.list((SubLObject)makeSymbol("S#25632", "CYC"));
        $ic179$ = makeSymbol("S#25632", "CYC");
        $ic180$ = makeSymbol("S#25631", "CYC");
        $ic181$ = makeKeyword("TRANSFORMATION");
        $ic182$ = makeSymbol("S#25684", "CYC");
        $ic183$ = ConsesLow.list((SubLObject)makeSymbol("S#25637", "CYC"));
        $ic184$ = makeSymbol("S#25637", "CYC");
        $ic185$ = makeSymbol("S#25636", "CYC");
        $ic186$ = makeKeyword("META-TRANSFORMATION");
        $ic187$ = makeSymbol("*REWRITE-MODULES*");
        $ic188$ = ConsesLow.list((SubLObject)makeSymbol("S#25642", "CYC"));
        $ic189$ = makeKeyword("REWRITE-SUPPORT");
        $ic190$ = makeKeyword("REWRITE-CLOSURE");
        $ic191$ = makeKeyword("REWRITE");
        $ic192$ = makeString("rewrite module ~S must have a :SENSE of :POS or :NEG");
        $ic193$ = makeSymbol("S#25685", "CYC");
        $ic194$ = makeKeyword("STRUCTURAL");
        $ic195$ = makeSymbol("S#25686", "CYC");
        $ic196$ = ConsesLow.list((SubLObject)makeSymbol("S#25656", "CYC"));
        $ic197$ = makeSymbol("S#25656", "CYC");
        $ic198$ = makeSymbol("S#25655", "CYC");
        $ic199$ = makeKeyword("META-STRUCTURAL");
        $ic200$ = makeInteger(256);
        $ic201$ = makeSymbol("S#25663", "CYC");
        $ic202$ = makeSymbol("S#25660", "CYC");
    }
    
    public static final class $f22779$UnaryFunction extends UnaryFunction
    {
        public $f22779$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25440"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return f22779(var12);
        }
    }
    
    public static final class $sX14781_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $plist;
        public SubLObject $sense;
        public SubLObject $predicate;
        public SubLObject $any_predicates;
        public SubLObject $arity;
        public SubLObject $direction;
        public SubLObject $required_pattern;
        public SubLObject $required_mt;
        public SubLObject $exclusive_func;
        public SubLObject $required_func;
        public SubLObject $completeness;
        private static final SubLStructDeclNative structDecl;
        
        public $sX14781_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
            this.$sense = (SubLObject)CommonSymbols.NIL;
            this.$predicate = (SubLObject)CommonSymbols.NIL;
            this.$any_predicates = (SubLObject)CommonSymbols.NIL;
            this.$arity = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$required_pattern = (SubLObject)CommonSymbols.NIL;
            this.$required_mt = (SubLObject)CommonSymbols.NIL;
            this.$exclusive_func = (SubLObject)CommonSymbols.NIL;
            this.$required_func = (SubLObject)CommonSymbols.NIL;
            this.$completeness = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX14781_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$plist;
        }
        
        public SubLObject getField4() {
            return this.$sense;
        }
        
        public SubLObject getField5() {
            return this.$predicate;
        }
        
        public SubLObject getField6() {
            return this.$any_predicates;
        }
        
        public SubLObject getField7() {
            return this.$arity;
        }
        
        public SubLObject getField8() {
            return this.$direction;
        }
        
        public SubLObject getField9() {
            return this.$required_pattern;
        }
        
        public SubLObject getField10() {
            return this.$required_mt;
        }
        
        public SubLObject getField11() {
            return this.$exclusive_func;
        }
        
        public SubLObject getField12() {
            return this.$required_func;
        }
        
        public SubLObject getField13() {
            return this.$completeness;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$plist = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$sense = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$predicate = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$any_predicates = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$arity = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$required_pattern = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$required_mt = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$exclusive_func = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$required_func = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$completeness = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX14781_native.class, $ic22$, $ic21$, $ic23$, $ic24$, new String[] { "$name", "$plist", "$sense", "$predicate", "$any_predicates", "$arity", "$direction", "$required_pattern", "$required_mt", "$exclusive_func", "$required_func", "$completeness" }, $ic25$, $ic26$, $ic27$);
        }
    }
    
    public static final class $f22789$UnaryFunction extends UnaryFunction
    {
        public $f22789$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#14902"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return f22789(var12);
        }
    }
    
    public static final class $f22826$UnaryFunction extends UnaryFunction
    {
        public $f22826$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25441"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return f22826(var12);
        }
    }
    
    public static final class $f22849$UnaryFunction extends UnaryFunction
    {
        public $f22849$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#25442"));
        }
        
        public SubLObject processItem(final SubLObject var12) {
            return f22849(var12);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 740 ms
	
	Decompiled with Procyon 0.5.32.
*/