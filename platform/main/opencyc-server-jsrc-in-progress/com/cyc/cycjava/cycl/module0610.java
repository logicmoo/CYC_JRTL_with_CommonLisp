package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0610 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0610";
    public static final String myFingerPrint = "4766ae3c133f10b6da21c846a6666c3e066914f4eb81764423b9a247584738c1";
    public static SubLSymbol $g4702$;
    private static SubLSymbol $g4703$;
    private static SubLSymbol $g4704$;
    private static SubLSymbol $g4705$;
    private static SubLSymbol $g4706$;
    private static SubLSymbol $g4707$;
    private static final SubLList $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLObject $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLObject $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLObject $ic7$;
    private static final SubLObject $ic8$;
    private static final SubLObject $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLObject $ic16$;
    private static final SubLString $ic17$;
    private static final SubLList $ic18$;
    private static final SubLString $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLObject $ic25$;
    private static final SubLObject $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLObject $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLObject $ic33$;
    private static final SubLObject $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLObject $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLInteger $ic51$;
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
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
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
    private static final SubLSymbol $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLObject $ic102$;
    private static final SubLObject $ic103$;
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
    private static final SubLObject $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLList $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLSymbol $ic154$;
    private static final SubLSymbol $ic155$;
    private static final SubLList $ic156$;
    private static final SubLObject $ic157$;
    private static final SubLList $ic158$;
    private static final SubLList $ic159$;
    
    public static SubLObject f37195() {
        if (NIL != module0035.f2370((SubLObject)$ic1$, $g4703$.getGlobalValue(), (SubLObject)UNPROVIDED)) {
            module0131.f8561();
        }
        else {
            module0131.f8562();
        }
        return module0131.f8560();
    }
    
    public static SubLObject f37196(final SubLObject var1) {
        return (SubLObject)makeBoolean(NIL != module0608.f37152(var1) || NIL != module0552.f34136(var1, (SubLObject)UNPROVIDED) || NIL != module0259.f16891(var1, $ic2$));
    }
    
    public static SubLObject f37197(final SubLObject var1) {
        return module0035.f2192(Symbols.symbol_function((SubLObject)$ic3$), var1);
    }
    
    public static SubLObject f37198(final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = var3;
        }
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        var3 = module0609.f37181(var3);
        var4 = module0609.f37181(var4);
        if (NIL == module0608.f37160(var3, var4, (SubLObject)UNPROVIDED)) {
            return (SubLObject)ConsesLow.list(var2, var3, var4);
        }
        if (var2.eql($ic5$)) {
            return var3;
        }
        return (SubLObject)ConsesLow.list(var2, var3);
    }
    
    public static SubLObject f37199(final SubLObject var5) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        if (NIL != module0608.f37152(var5)) {
            return Values.values($ic5$, var5, var5);
        }
        if (NIL != module0173.f10955(var5)) {
            return f37200(var5);
        }
        if (var5.isAtom()) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        var6 = var5.first();
        if (NIL == var6) {
            module0229.f15259();
        }
        var7 = conses_high.second(var5);
        if (NIL == module0608.f37152(var7)) {
            module0229.f15259();
        }
        var8 = (Sequences.length(var5).numE((SubLObject)THREE_INTEGER) ? conses_high.third(var5) : var7);
        if (NIL == module0608.f37152(var8)) {
            module0229.f15259();
        }
        if (NIL == module0608.f37162(var8, var7, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        return Values.values(var6, var7, var8);
    }
    
    public static SubLObject f37200(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        assert NIL != module0173.f10955(var5) : var5;
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        final SubLObject var7 = f37201(var5, (SubLObject)UNPROVIDED);
        final SubLObject var8 = f37202(var5, (SubLObject)UNPROVIDED);
        if (NIL != var7 && NIL != var8 && NIL == module0173.f10955(var7) && NIL == module0173.f10955(var8)) {
            var6.resetMultipleValues();
            final SubLObject var9 = f37199(var7);
            final SubLObject var10 = var6.secondMultipleValue();
            final SubLObject var11 = var6.thirdMultipleValue();
            var6.resetMultipleValues();
            var6.resetMultipleValues();
            final SubLObject var12 = f37199(var8);
            final SubLObject var13 = var6.secondMultipleValue();
            final SubLObject var14 = var6.thirdMultipleValue();
            var6.resetMultipleValues();
            if (!var9.eql(var12)) {
                module0229.f15259();
            }
            if (NIL == module0608.f37162(var10, var14, (SubLObject)UNPROVIDED)) {
                module0229.f15259();
            }
            return Values.values(var9, var14, var10);
        }
        if (NIL != module0167.f10813(var5)) {
            final SubLObject var15 = module0172.f10915(var5);
            if (NIL != var15) {
                return f37199(var15);
            }
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37201(final SubLObject var16, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        return module0220.f14557(var16, $ic7$, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37202(final SubLObject var16, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        return module0220.f14557(var16, $ic8$, var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37203(final SubLObject var18, final SubLObject var2) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        return (SubLObject)makeBoolean(var18.eql(var2) || NIL != module0035.sublisp_boolean(f37204(var2, var18)));
    }
    
    public static SubLObject f37205(final SubLObject var19, final SubLObject var20) {
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        final SubLObject var21 = f37204(var19, var20);
        if (NIL == module0608.f37152(var21)) {
            return (SubLObject)NIL;
        }
        return Numbers.numL(var21, (SubLObject)ONE_INTEGER);
    }
    
    public static SubLObject f37206(final SubLObject var18, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = var3;
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        if (NIL != $g4702$.getDynamicValue(var19)) {
            return f37207(var18, var2, var3, var4);
        }
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        if (var18.equal(var2)) {
            return Values.values(var3, var4);
        }
        final SubLObject var20 = f37204(var2, var18);
        if (NIL == module0608.f37152(var20)) {
            return (SubLObject)NIL;
        }
        if (var20.numE((SubLObject)ONE_INTEGER)) {
            return Values.values(var3, var4);
        }
        return Values.values(module0608.f37165(var3, var20), module0608.f37165(var4, var20));
    }
    
    public static SubLObject f37207(final SubLObject var18, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = var3;
        }
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        if (var18.eql(var2)) {
            return Values.values(var3, var4);
        }
        final SubLObject var19 = f37204(var2, var18);
        final SubLObject var20 = f37208(var2, var18);
        final SubLObject var21 = f37208(var18, var2);
        if (NIL == module0608.f37152(var19)) {
            return (SubLObject)NIL;
        }
        if (NIL != var20) {
            return Values.values(Numbers.add(var20, module0608.f37165(var3, var19)), Numbers.add(var20, module0608.f37165(var4, var19)));
        }
        if (NIL != var21) {
            return Values.values(module0608.f37165(Numbers.subtract(var3, var21), var19), module0608.f37165(Numbers.subtract(var4, var21), var19));
        }
        return Values.values(module0608.f37165(var3, var19), module0608.f37165(var4, var19));
    }
    
    public static SubLObject f37209(final SubLObject var24, final SubLObject var25, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        if (NIL != var17) {
            final SubLObject var28 = module0147.f9540(var17);
            final SubLObject var29 = module0147.$g2095$.currentBinding(var26);
            final SubLObject var30 = module0147.$g2094$.currentBinding(var26);
            final SubLObject var31 = module0147.$g2096$.currentBinding(var26);
            try {
                module0147.$g2095$.bind(module0147.f9545(var28), var26);
                module0147.$g2094$.bind(module0147.f9546(var28), var26);
                module0147.$g2096$.bind(module0147.f9549(var28), var26);
                var27 = f37204(var24, var25);
            }
            finally {
                module0147.$g2096$.rebind(var31, var26);
                module0147.$g2094$.rebind(var30, var26);
                module0147.$g2095$.rebind(var29, var26);
            }
        }
        else {
            var27 = f37204(var24, var25);
        }
        return var27;
    }
    
    public static SubLObject f37204(final SubLObject var24, final SubLObject var25) {
        if (var24.eql(var25)) {
            return (SubLObject)ONE_INTEGER;
        }
        SubLObject var26 = f37210(var24, var25);
        if (NIL == var26) {
            var26 = f37211(var24, var25);
        }
        return var26;
    }
    
    public static SubLObject f37208(final SubLObject var24, final SubLObject var25) {
        SubLObject var26 = (SubLObject)NIL;
        final SubLObject var27 = $ic9$;
        if (NIL != module0158.f10010(var25, (SubLObject)ONE_INTEGER, var27)) {
            final SubLObject var28 = module0158.f10011(var25, (SubLObject)ONE_INTEGER, var27);
            SubLObject var29 = var26;
            final SubLObject var30 = (SubLObject)NIL;
            while (NIL == var29) {
                final SubLObject var31 = module0052.f3695(var28, var30);
                final SubLObject var32 = (SubLObject)makeBoolean(!var30.eql(var31));
                if (NIL != var32) {
                    SubLObject var33 = (SubLObject)NIL;
                    try {
                        var33 = module0158.f10316(var31, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var33_38 = var26;
                        final SubLObject var34_39 = (SubLObject)NIL;
                        while (NIL == var33_38) {
                            final SubLObject var34 = module0052.f3695(var33, var34_39);
                            final SubLObject var36_41 = (SubLObject)makeBoolean(!var34_39.eql(var34));
                            if (NIL != var36_41 && var24.eql(module0178.f11335(var34))) {
                                var26 = module0178.f11336(var34);
                            }
                            var33_38 = (SubLObject)makeBoolean(NIL == var36_41 || NIL != var26);
                        }
                    }
                    finally {
                        final SubLObject var35 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var33) {
                                module0158.f10319(var33);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var35);
                        }
                    }
                }
                var29 = (SubLObject)makeBoolean(NIL == var32 || NIL != var26);
            }
        }
        return var26;
    }
    
    public static SubLObject f37212() {
        final SubLObject var42 = $g4707$.getGlobalValue();
        if (NIL != var42) {
            module0034.f1818(var42);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37213(final SubLObject var24, final SubLObject var25) {
        return module0034.f1829($g4707$.getGlobalValue(), (SubLObject)ConsesLow.list(var24, var25), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37214(final SubLObject var24, final SubLObject var25) {
        return f37215(var24, var25, module0132.$g1546$.getGlobalValue());
    }
    
    public static SubLObject f37210(final SubLObject var24, final SubLObject var25) {
        SubLObject var26 = $g4707$.getGlobalValue();
        if (NIL == var26) {
            var26 = module0034.f1934((SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var27 = module0034.f1782(var24, var25);
        final SubLObject var28 = module0034.f1814(var26, var27, (SubLObject)UNPROVIDED);
        if (var28 != $ic13$) {
            SubLObject var29 = var28;
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                SubLObject var31 = var30.first();
                final SubLObject var32 = conses_high.second(var30);
                if (var24.equal(var31.first())) {
                    var31 = var31.rest();
                    if (NIL != var31 && NIL == var31.rest() && var25.equal(var31.first())) {
                        return module0034.f1959(var32);
                    }
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
        }
        final SubLObject var33 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f37214(var24, var25)));
        module0034.f1836(var26, var27, var28, var33, (SubLObject)ConsesLow.list(var24, var25));
        return module0034.f1959(var33);
    }
    
    public static SubLObject f37211(final SubLObject var24, final SubLObject var25) {
        final SubLObject var26 = module0147.f9496();
        return f37215(var24, var25, var26);
    }
    
    public static SubLObject f37215(final SubLObject var24, final SubLObject var25, final SubLObject var17) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        final SubLObject var28 = $g4706$.currentBinding(var26);
        try {
            $g4706$.bind((SubLObject)NIL, var26);
            var27 = f37216(var25, var24, var17);
            if (NIL == var27) {
                var27 = f37216(var24, var25, var17);
                if (NIL != var27) {
                    var27 = Numbers.divide((SubLObject)ONE_INTEGER, var27);
                }
            }
            if (NIL == var27) {
                final SubLObject var27_51 = $g4706$.currentBinding(var26);
                try {
                    $g4706$.bind((SubLObject)T, var26);
                    var27 = f37216(var25, var24, var17);
                }
                finally {
                    $g4706$.rebind(var27_51, var26);
                }
            }
        }
        finally {
            $g4706$.rebind(var28, var26);
        }
        return var27;
    }
    
    public static SubLObject f37216(final SubLObject var24, final SubLObject var25, final SubLObject var17) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = module0147.f9540(var17);
        final SubLObject var30 = module0147.$g2095$.currentBinding(var26);
        final SubLObject var31 = module0147.$g2094$.currentBinding(var26);
        final SubLObject var32 = module0147.$g2096$.currentBinding(var26);
        final SubLObject var33 = $g4705$.currentBinding(var26);
        final SubLObject var34 = $g4704$.currentBinding(var26);
        try {
            module0147.$g2095$.bind(module0147.f9545(var29), var26);
            module0147.$g2094$.bind(module0147.f9546(var29), var26);
            module0147.$g2096$.bind(module0147.f9549(var29), var26);
            $g4705$.bind((SubLObject)NIL, var26);
            $g4704$.bind(module0055.f4017(), var26);
            module0055.f4021(var24, $g4704$.getDynamicValue(var26));
            final SubLObject var35 = (SubLObject)ConsesLow.list(var24, (SubLObject)NIL, (SubLObject)ONE_INTEGER);
            if (NIL == conses_high.member(var35, $g4705$.getDynamicValue(var26), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                $g4705$.setDynamicValue((SubLObject)ConsesLow.cons(var35, $g4705$.getDynamicValue(var26)), var26);
            }
            var27 = f37217(var25);
            if (NIL != var27) {
                var28 = f37218(var25, var24);
            }
        }
        finally {
            $g4704$.rebind(var34, var26);
            $g4705$.rebind(var33, var26);
            module0147.$g2096$.rebind(var32, var26);
            module0147.$g2094$.rebind(var31, var26);
            module0147.$g2095$.rebind(var30, var26);
        }
        return var28;
    }
    
    public static SubLObject f37217(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0055.f4023($g4704$.getDynamicValue(var26));
        if (var27.eql(var25)) {
            return (SubLObject)T;
        }
        if (NIL != var27) {
            SubLObject var29;
            final SubLObject var28 = var29 = f37219(var27);
            SubLObject var30 = (SubLObject)NIL;
            var30 = var29.first();
            while (NIL != var29) {
                SubLObject var32;
                final SubLObject var31 = var32 = module0178.f11330(var30);
                SubLObject var33 = (SubLObject)NIL;
                SubLObject var34 = (SubLObject)NIL;
                SubLObject var35 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic14$);
                var33 = var32.first();
                var32 = var32.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic14$);
                var34 = var32.first();
                var32 = var32.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var32, var31, (SubLObject)$ic14$);
                var35 = var32.first();
                var32 = var32.rest();
                if (NIL == var32) {
                    var35 = f37220(var35);
                    SubLObject var36 = (SubLObject)NIL;
                    SubLObject var37 = (SubLObject)NIL;
                    if (var33.eql(var27)) {
                        var37 = var34;
                        var36 = var35;
                    }
                    else {
                        var37 = var33;
                        var36 = Numbers.divide((SubLObject)ONE_INTEGER, var35);
                    }
                    if (NIL == module0004.f104(var37, $g4705$.getDynamicValue(var26), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)$ic15$)) && (NIL != $g4706$.getDynamicValue(var26) || !var36.isDouble())) {
                        final SubLObject var38 = (SubLObject)ConsesLow.list(var37, var27, var36);
                        if (NIL == conses_high.member(var38, $g4705$.getDynamicValue(var26), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            $g4705$.setDynamicValue((SubLObject)ConsesLow.cons(var38, $g4705$.getDynamicValue(var26)), var26);
                        }
                        if (var37.eql(var25)) {
                            return (SubLObject)T;
                        }
                        module0055.f4021(var37, $g4704$.getDynamicValue(var26));
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var31, (SubLObject)$ic14$);
                }
                var29 = var29.rest();
                var30 = var29.first();
            }
            return f37217(var25);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37219(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = $ic16$;
        if (NIL != module0158.f10010(var2, (SubLObject)ONE_INTEGER, var5)) {
            final SubLObject var6 = module0158.f10011(var2, (SubLObject)ONE_INTEGER, var5);
            SubLObject var7 = (SubLObject)NIL;
            final SubLObject var8 = (SubLObject)NIL;
            while (NIL == var7) {
                final SubLObject var9 = module0052.f3695(var6, var8);
                final SubLObject var10 = (SubLObject)makeBoolean(!var8.eql(var9));
                if (NIL != var10) {
                    SubLObject var11 = (SubLObject)NIL;
                    try {
                        var11 = module0158.f10316(var9, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var33_66 = (SubLObject)NIL;
                        final SubLObject var34_67 = (SubLObject)NIL;
                        while (NIL == var33_66) {
                            final SubLObject var12 = module0052.f3695(var11, var34_67);
                            final SubLObject var36_68 = (SubLObject)makeBoolean(!var34_67.eql(var12));
                            if (NIL != var36_68) {
                                var4 = (SubLObject)ConsesLow.cons(var12, var4);
                            }
                            var33_66 = (SubLObject)makeBoolean(NIL == var36_68);
                        }
                    }
                    finally {
                        final SubLObject var13 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var11) {
                                module0158.f10319(var11);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var13);
                        }
                    }
                }
                var7 = (SubLObject)makeBoolean(NIL == var10);
            }
        }
        var5 = $ic16$;
        if (NIL != module0158.f10010(var2, (SubLObject)TWO_INTEGER, var5)) {
            final SubLObject var6 = module0158.f10011(var2, (SubLObject)TWO_INTEGER, var5);
            SubLObject var7 = (SubLObject)NIL;
            final SubLObject var8 = (SubLObject)NIL;
            while (NIL == var7) {
                final SubLObject var9 = module0052.f3695(var6, var8);
                final SubLObject var10 = (SubLObject)makeBoolean(!var8.eql(var9));
                if (NIL != var10) {
                    SubLObject var11 = (SubLObject)NIL;
                    try {
                        var11 = module0158.f10316(var9, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var33_67 = (SubLObject)NIL;
                        final SubLObject var34_68 = (SubLObject)NIL;
                        while (NIL == var33_67) {
                            final SubLObject var12 = module0052.f3695(var11, var34_68);
                            final SubLObject var36_69 = (SubLObject)makeBoolean(!var34_68.eql(var12));
                            if (NIL != var36_69) {
                                var4 = (SubLObject)ConsesLow.cons(var12, var4);
                            }
                            var33_67 = (SubLObject)makeBoolean(NIL == var36_69);
                        }
                    }
                    finally {
                        final SubLObject var14 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var11) {
                                module0158.f10319(var11);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var14);
                        }
                    }
                }
                var7 = (SubLObject)makeBoolean(NIL == var10);
            }
        }
        var3 = var4;
        return var3;
    }
    
    public static SubLObject f37218(final SubLObject var72, final SubLObject var73) {
        final SubLThread var74 = SubLProcess.currentSubLThread();
        if (var72.eql(var73)) {
            return (SubLObject)ONE_INTEGER;
        }
        final SubLObject var75 = conses_high.assoc(var72, $g4705$.getDynamicValue(var74), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var75) {
            Errors.error((SubLObject)$ic17$);
        }
        SubLObject var77;
        final SubLObject var76 = var77 = var75;
        SubLObject var78 = (SubLObject)NIL;
        SubLObject var79 = (SubLObject)NIL;
        SubLObject var80 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)$ic18$);
        var78 = var77.first();
        var77 = var77.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)$ic18$);
        var79 = var77.first();
        var77 = var77.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var77, var76, (SubLObject)$ic18$);
        var80 = var77.first();
        var77 = var77.rest();
        if (NIL == var77) {
            if (NIL == var79) {
                Errors.error((SubLObject)$ic19$);
            }
            return Numbers.multiply(var80, f37218(var79, var73));
        }
        cdestructuring_bind.cdestructuring_bind_error(var76, (SubLObject)$ic18$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37221(final SubLObject var19, final SubLObject var20) {
        if (var19.equal($ic5$)) {
            return var20;
        }
        if (var20.equal($ic5$)) {
            return var19;
        }
        return f37222(var19, var20);
    }
    
    public static SubLObject f37223(final SubLObject var19, final SubLObject var20) {
        if (var19.equal(var20)) {
            return $ic5$;
        }
        if (var20.equal($ic5$)) {
            return var19;
        }
        return f37224(var19, var20);
    }
    
    public static SubLObject f37225(final SubLObject var2) {
        if (var2.equal($ic5$)) {
            return var2;
        }
        return f37226(var2);
    }
    
    public static SubLObject f37222(final SubLObject var19, final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        SubLObject var22 = $ic20$;
        if (NIL != module0158.f10010(var19, (SubLObject)ONE_INTEGER, var22)) {
            final SubLObject var23 = module0158.f10011(var19, (SubLObject)ONE_INTEGER, var22);
            SubLObject var24 = var21;
            final SubLObject var25 = (SubLObject)NIL;
            while (NIL == var24) {
                final SubLObject var26 = module0052.f3695(var23, var25);
                final SubLObject var27 = (SubLObject)makeBoolean(!var25.eql(var26));
                if (NIL != var27) {
                    SubLObject var28 = (SubLObject)NIL;
                    try {
                        var28 = module0158.f10316(var26, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var33_80 = var21;
                        final SubLObject var34_81 = (SubLObject)NIL;
                        while (NIL == var33_80) {
                            final SubLObject var29 = module0052.f3695(var28, var34_81);
                            final SubLObject var36_82 = (SubLObject)makeBoolean(!var34_81.eql(var29));
                            if (NIL != var36_82 && var20.eql(module0178.f11335(var29))) {
                                var21 = module0178.f11336(var29);
                            }
                            var33_80 = (SubLObject)makeBoolean(NIL == var36_82 || NIL != var21);
                        }
                    }
                    finally {
                        final SubLObject var30 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var28) {
                                module0158.f10319(var28);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var30);
                        }
                    }
                }
                var24 = (SubLObject)makeBoolean(NIL == var27 || NIL != var21);
            }
        }
        if (NIL != var21) {
            return var21;
        }
        var21 = (SubLObject)NIL;
        var22 = $ic20$;
        if (NIL != module0158.f10010(var19, (SubLObject)TWO_INTEGER, var22)) {
            final SubLObject var23 = module0158.f10011(var19, (SubLObject)TWO_INTEGER, var22);
            SubLObject var24 = var21;
            final SubLObject var25 = (SubLObject)NIL;
            while (NIL == var24) {
                final SubLObject var26 = module0052.f3695(var23, var25);
                final SubLObject var27 = (SubLObject)makeBoolean(!var25.eql(var26));
                if (NIL != var27) {
                    SubLObject var28 = (SubLObject)NIL;
                    try {
                        var28 = module0158.f10316(var26, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var33_81 = var21;
                        final SubLObject var34_82 = (SubLObject)NIL;
                        while (NIL == var33_81) {
                            final SubLObject var29 = module0052.f3695(var28, var34_82);
                            final SubLObject var36_83 = (SubLObject)makeBoolean(!var34_82.eql(var29));
                            if (NIL != var36_83 && var20.eql(module0178.f11334(var29))) {
                                var21 = module0178.f11336(var29);
                            }
                            var33_81 = (SubLObject)makeBoolean(NIL == var36_83 || NIL != var21);
                        }
                    }
                    finally {
                        final SubLObject var31 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var28) {
                                module0158.f10319(var28);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var31);
                        }
                    }
                }
                var24 = (SubLObject)makeBoolean(NIL == var27 || NIL != var21);
            }
        }
        if (NIL != var21) {
            return var21;
        }
        if (NIL != f37227(var19)) {
            return f37228(var19, var20);
        }
        if (NIL != f37227(var20)) {
            return f37228(var20, var19);
        }
        return module0229.f15259();
    }
    
    public static SubLObject f37228(final SubLObject var86, final SubLObject var2) {
        final SubLObject var87 = module0205.f13277(var86, (SubLObject)UNPROVIDED);
        final SubLObject var88 = module0205.f13368(var86, (SubLObject)UNPROVIDED);
        if (var88.equal(var2)) {
            return var87;
        }
        if (NIL == f37227(var2)) {
            module0229.f15259();
        }
        else {
            final SubLObject var89 = module0205.f13277(var2, (SubLObject)UNPROVIDED);
            final SubLObject var90 = module0205.f13368(var2, (SubLObject)UNPROVIDED);
            if (var87.equal(var90)) {
                if (var88.equal(var89)) {
                    return $ic5$;
                }
                return (SubLObject)ConsesLow.list($ic21$, var89, var88);
            }
            else {
                if (var88.equal(var89)) {
                    return (SubLObject)ConsesLow.list($ic21$, var87, var90);
                }
                module0229.f15259();
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37224(final SubLObject var19, final SubLObject var20) {
        SubLObject var21 = (SubLObject)NIL;
        final SubLObject var22 = $ic20$;
        if (NIL != module0158.f10010(var19, (SubLObject)THREE_INTEGER, var22)) {
            final SubLObject var23 = module0158.f10011(var19, (SubLObject)THREE_INTEGER, var22);
            SubLObject var24 = var21;
            final SubLObject var25 = (SubLObject)NIL;
            while (NIL == var24) {
                final SubLObject var26 = module0052.f3695(var23, var25);
                final SubLObject var27 = (SubLObject)makeBoolean(!var25.eql(var26));
                if (NIL != var27) {
                    SubLObject var28 = (SubLObject)NIL;
                    try {
                        var28 = module0158.f10316(var26, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var33_91 = var21;
                        final SubLObject var34_92 = (SubLObject)NIL;
                        while (NIL == var33_91) {
                            final SubLObject var29 = module0052.f3695(var28, var34_92);
                            final SubLObject var36_93 = (SubLObject)makeBoolean(!var34_92.eql(var29));
                            if (NIL != var36_93) {
                                if (var20.eql(module0178.f11334(var29))) {
                                    var21 = module0178.f11335(var29);
                                }
                                else if (var20.eql(module0178.f11335(var29))) {
                                    var21 = module0178.f11334(var29);
                                }
                            }
                            var33_91 = (SubLObject)makeBoolean(NIL == var36_93 || NIL != var21);
                        }
                    }
                    finally {
                        final SubLObject var30 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var28) {
                                module0158.f10319(var28);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var30);
                        }
                    }
                }
                var24 = (SubLObject)makeBoolean(NIL == var27 || NIL != var21);
            }
        }
        if (NIL != var21) {
            return var21;
        }
        if (NIL != f37227(var20)) {
            return f37229(var19, var20);
        }
        if (NIL != f37227(var19)) {
            return module0229.f15259();
        }
        return (SubLObject)ConsesLow.list($ic21$, var19, var20);
    }
    
    public static SubLObject f37229(final SubLObject var2, final SubLObject var86) {
        final SubLObject var87 = module0205.f13277(var86, (SubLObject)UNPROVIDED);
        final SubLObject var88 = module0205.f13368(var86, (SubLObject)UNPROVIDED);
        if (var2.equal(var87)) {
            return var88;
        }
        if (var2.equal($ic5$)) {
            return (SubLObject)ConsesLow.list($ic21$, var88, var87);
        }
        if (NIL == f37227(var2)) {
            module0229.f15259();
        }
        else {
            final SubLObject var89 = module0205.f13277(var2, (SubLObject)UNPROVIDED);
            final SubLObject var90 = module0205.f13368(var2, (SubLObject)UNPROVIDED);
            if (var89.equal(var87)) {
                return (SubLObject)ConsesLow.list($ic21$, var88, var90);
            }
            if (var90.equal(var88)) {
                return (SubLObject)ConsesLow.list($ic21$, var89, var87);
            }
            module0229.f15259();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37226(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        final SubLObject var4 = $ic20$;
        if (NIL != module0158.f10010(var2, (SubLObject)THREE_INTEGER, var4)) {
            final SubLObject var5 = module0158.f10011(var2, (SubLObject)THREE_INTEGER, var4);
            SubLObject var6 = var3;
            final SubLObject var7 = (SubLObject)NIL;
            while (NIL == var6) {
                final SubLObject var8 = module0052.f3695(var5, var7);
                final SubLObject var9 = (SubLObject)makeBoolean(!var7.eql(var8));
                if (NIL != var9) {
                    SubLObject var10 = (SubLObject)NIL;
                    try {
                        var10 = module0158.f10316(var8, (SubLObject)$ic10$, (SubLObject)NIL, (SubLObject)NIL);
                        SubLObject var33_94 = var3;
                        final SubLObject var34_95 = (SubLObject)NIL;
                        while (NIL == var33_94) {
                            final SubLObject var11 = module0052.f3695(var10, var34_95);
                            final SubLObject var36_96 = (SubLObject)makeBoolean(!var34_95.eql(var11));
                            if (NIL != var36_96 && module0178.f11334(var11).eql(module0178.f11335(var11))) {
                                var3 = module0178.f11334(var11);
                            }
                            var33_94 = (SubLObject)makeBoolean(NIL == var36_96 || NIL != var3);
                        }
                    }
                    finally {
                        final SubLObject var12 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            if (NIL != var10) {
                                module0158.f10319(var10);
                            }
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var12);
                        }
                    }
                }
                var6 = (SubLObject)makeBoolean(NIL == var9 || NIL != var3);
            }
        }
        if (NIL != var3) {
            return var3;
        }
        return module0229.f15259();
    }
    
    public static SubLObject f37227(final SubLObject var2) {
        if (NIL != module0210.f13594(var2) || (NIL != module0167.f10813(var2) && NIL != module0172.f10915(var2))) {
            return Equality.eql(module0205.f13364(var2), $ic21$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37230(final SubLObject var2, SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = var3;
        }
        if (NIL != f37227(var2)) {
            var3 = module0609.f37181(var3);
            var4 = module0609.f37181(var4);
            final SubLObject var5 = module0205.f13277(var2, (SubLObject)UNPROVIDED);
            final SubLObject var6 = module0205.f13368(var2, (SubLObject)UNPROVIDED);
            if (NIL != f37203(var5, var6)) {
                return f37231(f37198(var5, var3, var4), f37198(var6, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
            }
        }
        return f37198(var2, var3, var4);
    }
    
    public static SubLObject f37232(final SubLObject var99, final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        if (NIL != module0193.f12067(var99)) {
            return module0235.f15474(var99, var100, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var102 = (SubLObject)NIL;
        SubLObject var103 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var99, var99, (SubLObject)$ic22$);
        var102 = var99.first();
        SubLObject var104 = var99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var104, var99, (SubLObject)$ic22$);
        var103 = var104.first();
        var104 = var104.rest();
        SubLObject var105 = (SubLObject)(var104.isCons() ? var104.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var104, var99, (SubLObject)$ic22$);
        var104 = var104.rest();
        if (NIL == var104) {
            if (NIL == var105) {
                var105 = var103;
            }
            var102 = module0285.f18875(var102, (SubLObject)UNPROVIDED);
            SubLObject var106 = (SubLObject)NIL;
            SubLObject var107 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var100, var100, (SubLObject)$ic23$);
            var106 = var100.first();
            SubLObject var107_108 = var100.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var107_108, var100, (SubLObject)$ic23$);
            var107 = var107_108.first();
            var107_108 = var107_108.rest();
            SubLObject var108 = (SubLObject)(var107_108.isCons() ? var107_108.first() : NIL);
            cdestructuring_bind.destructuring_bind_must_listp(var107_108, var100, (SubLObject)$ic23$);
            var107_108 = var107_108.rest();
            if (NIL == var107_108) {
                if (NIL == var108) {
                    var108 = var107;
                }
                var106 = module0285.f18875(var106, (SubLObject)UNPROVIDED);
                if (NIL != module0193.f12067(var102) || NIL != module0193.f12067(var106)) {
                    return module0235.f15474((SubLObject)ConsesLow.list(var102, var103), (SubLObject)ConsesLow.list(var106, var107), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var101.resetMultipleValues();
                final SubLObject var109 = f37206(var102, var106, var107, var108);
                final SubLObject var110 = var101.secondMultipleValue();
                var101.resetMultipleValues();
                if (var109.isNumber()) {
                    return module0235.f15474(var99, f37230(var102, var109, var110), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var100, (SubLObject)$ic23$);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var99, (SubLObject)$ic22$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37233(final SubLObject var113) {
        if (var113.isInteger()) {
            final SubLObject var114 = module0144.f9460();
            if (NIL != module0173.f10955(var114)) {
                final SubLObject var115 = module0220.f14553(var114, $ic25$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var115) {
                    return module0229.f15243(module0202.f12768($ic26$, var115, var113));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37234(final SubLObject var116) {
        if (var116.isNumber()) {
            final SubLObject var117 = module0144.f9460();
            if (NIL != module0173.f10955(var117)) {
                final SubLObject var118 = module0220.f14553(var117, $ic28$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != var118) {
                    return module0229.f15243(module0202.f12768($ic26$, var118, var116));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37235(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        try {
            var119.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var121 = Errors.$error_handler$.currentBinding(var119);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic29$, var119);
                try {
                    try {
                        var119.throwStack.push($ic30$);
                        return f37236(var117, var118);
                    }
                    catch (Throwable var122) {
                        var120 = Errors.handleThrowable(var122, (SubLObject)$ic30$);
                    }
                    finally {
                        var119.throwStack.pop();
                    }
                }
                catch (Throwable var123) {
                    Errors.handleThrowable(var123, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var121, var119);
            }
        }
        catch (Throwable var124) {
            var120 = Errors.handleThrowable(var124, module0003.$g3$.getGlobalValue());
        }
        finally {
            var119.throwStack.pop();
        }
        if (NIL != var120 && (NIL != module0035.f2439((SubLObject)$ic32$, var117, (SubLObject)UNPROVIDED) || NIL != module0035.f2439((SubLObject)$ic32$, var118, (SubLObject)UNPROVIDED))) {
            return module0202.f12768($ic33$, var117, var118);
        }
        return module0229.f15259();
    }
    
    public static SubLObject f37236(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        if (NIL != module0608.f37152(var117) && NIL != module0608.f37152(var118)) {
            var120 = module0608.f37167(var117, var118);
        }
        else {
            if (ZERO_INTEGER.eql(var117) && NIL != module0305.f20438(var118, $ic34$, (SubLObject)UNPROVIDED)) {
                return var118;
            }
            if (ZERO_INTEGER.eql(var118) && NIL != module0305.f20438(var117, $ic34$, (SubLObject)UNPROVIDED)) {
                return var117;
            }
            var119.resetMultipleValues();
            final SubLObject var121 = f37199(var117);
            final SubLObject var122 = var119.secondMultipleValue();
            final SubLObject var123 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            var119.resetMultipleValues();
            final SubLObject var124 = f37199(var118);
            SubLObject var125 = var119.secondMultipleValue();
            SubLObject var126 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (NIL == f37203(var121, var124)) {
                module0229.f15259();
            }
            var119.resetMultipleValues();
            final SubLObject var127 = f37206(var121, var124, var125, var126);
            final SubLObject var128 = var119.secondMultipleValue();
            var119.resetMultipleValues();
            var125 = var127;
            var126 = var128;
            var120 = f37198(var121, module0608.f37167(var122, var125), module0608.f37167(var123, var126));
        }
        return var120;
    }
    
    public static SubLObject f37237(final SubLObject var5) {
        if (NIL != module0608.f37152(var5)) {
            return module0608.f37158(var5);
        }
        return module0609.f37185((SubLObject)MINUS_ONE_INTEGER, var5);
    }
    
    public static SubLObject f37238(final SubLObject var64, final SubLObject var5) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        var65.resetMultipleValues();
        final SubLObject var66 = f37199(var5);
        final SubLObject var67 = var65.secondMultipleValue();
        final SubLObject var68 = var65.thirdMultipleValue();
        var65.resetMultipleValues();
        if (NIL == f37203(var64, var66)) {
            module0229.f15259();
        }
        var65.resetMultipleValues();
        final SubLObject var69 = f37206(var64, var66, var67, var68);
        final SubLObject var70 = var65.secondMultipleValue();
        var65.resetMultipleValues();
        final SubLObject var71 = f37198(var64, var69, var70);
        return var71;
    }
    
    public static SubLObject f37239(final SubLObject var64, final SubLObject var5) {
        final SubLThread var65 = SubLProcess.currentSubLThread();
        var65.resetMultipleValues();
        final SubLObject var66 = f37199(var5);
        final SubLObject var67 = var65.secondMultipleValue();
        final SubLObject var68 = var65.thirdMultipleValue();
        var65.resetMultipleValues();
        if (NIL == f37203(var64, var66)) {
            module0229.f15259();
        }
        var65.resetMultipleValues();
        final SubLObject var69 = f37207(var64, var66, var67, var68);
        final SubLObject var70 = var65.secondMultipleValue();
        var65.resetMultipleValues();
        final SubLObject var71 = f37198(var64, var69, var70);
        return var71;
    }
    
    public static SubLObject f37220(final SubLObject var125) {
        final SubLThread var126 = SubLProcess.currentSubLThread();
        if (NIL != module0608.f37152(var125)) {
            return var125;
        }
        var126.resetMultipleValues();
        final SubLObject var127 = f37199(f37238($ic5$, var125));
        final SubLObject var128 = var126.secondMultipleValue();
        final SubLObject var129 = var126.thirdMultipleValue();
        var126.resetMultipleValues();
        if (!var128.numE(var129)) {
            module0229.f15259();
        }
        return var128;
    }
    
    public static SubLObject f37240(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        try {
            var119.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var121 = Errors.$error_handler$.currentBinding(var119);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic29$, var119);
                try {
                    try {
                        var119.throwStack.push($ic30$);
                        return f37241(var117, var118);
                    }
                    catch (Throwable var122) {
                        var120 = Errors.handleThrowable(var122, (SubLObject)$ic30$);
                    }
                    finally {
                        var119.throwStack.pop();
                    }
                }
                catch (Throwable var123) {
                    Errors.handleThrowable(var123, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var121, var119);
            }
        }
        catch (Throwable var124) {
            var120 = Errors.handleThrowable(var124, module0003.$g3$.getGlobalValue());
        }
        finally {
            var119.throwStack.pop();
        }
        if (NIL != var120 && (NIL != module0035.f2439((SubLObject)$ic32$, var117, (SubLObject)UNPROVIDED) || NIL != module0035.f2439((SubLObject)$ic32$, var118, (SubLObject)UNPROVIDED))) {
            return module0202.f12768($ic37$, var117, var118);
        }
        return module0229.f15259();
    }
    
    public static SubLObject f37241(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        if (NIL != module0608.f37152(var117) && NIL != module0608.f37152(var118)) {
            var120 = module0608.f37165(var117, var118);
        }
        else if (NIL != module0608.f37152(var117)) {
            var119.resetMultipleValues();
            final SubLObject var121 = f37199(var118);
            final SubLObject var122 = var119.secondMultipleValue();
            final SubLObject var123 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (NIL != module0608.f37154(var117)) {
                var120 = f37198(var121, module0608.f37165(var117, var123), module0608.f37165(var117, var122));
            }
            else {
                var120 = f37198(var121, module0608.f37165(var117, var122), module0608.f37165(var117, var123));
            }
        }
        else if (NIL != module0608.f37152(var118)) {
            var119.resetMultipleValues();
            final SubLObject var124 = f37199(var117);
            final SubLObject var125 = var119.secondMultipleValue();
            final SubLObject var126 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (NIL != module0608.f37154(var118)) {
                var120 = f37198(var124, module0608.f37165(var118, var126), module0608.f37165(var118, var125));
            }
            else {
                var120 = f37198(var124, module0608.f37165(var118, var125), module0608.f37165(var118, var126));
            }
        }
        else {
            var119.resetMultipleValues();
            final SubLObject var124 = f37199(var117);
            final SubLObject var125 = var119.secondMultipleValue();
            final SubLObject var126 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            var119.resetMultipleValues();
            final SubLObject var127 = f37199(var118);
            final SubLObject var128 = var119.secondMultipleValue();
            final SubLObject var129 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            final SubLObject var130 = f37221(var124, var127);
            final SubLObject var131 = module0608.f37165(var125, var128);
            final SubLObject var132 = module0608.f37165(var125, var129);
            final SubLObject var133 = module0608.f37165(var126, var128);
            final SubLObject var134 = module0608.f37165(var126, var129);
            final SubLObject var135 = Numbers.min(var131, new SubLObject[] { var132, var133, var134 });
            final SubLObject var136 = Numbers.max(var131, new SubLObject[] { var132, var133, var134 });
            var120 = f37230(var130, var135, var136);
        }
        return var120;
    }
    
    public static SubLObject f37242(final SubLObject var135) {
        if (NIL != module0173.f10955(var135)) {
            return (SubLObject)makeBoolean(NIL != module0259.f16854(var135, $ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && (NIL == f37201(var135, (SubLObject)UNPROVIDED) || NIL == f37202(var135, (SubLObject)UNPROVIDED)));
        }
        if (NIL != module0210.f13576(var135, (SubLObject)UNPROVIDED)) {
            return (SubLObject)makeBoolean(NIL != module0259.f16854(var135, $ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL == module0259.f16854(var135, $ic39$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37231(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        if (var118.isNumber() && var118.isZero()) {
            module0229.f15259();
        }
        else if (NIL != module0608.f37152(var118) && NIL != module0608.f37152(var117)) {
            if (NIL != module0606.f37086(var117) || NIL != module0606.f37086(var118)) {
                var120 = module0608.f37166(var117, var118);
            }
            else if (NIL != module0608.f37160(var118, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                var120 = var117;
            }
            else if (NIL != module0608.f37160(var117, var118, (SubLObject)UNPROVIDED)) {
                var120 = (SubLObject)ONE_INTEGER;
            }
            else {
                var120 = module0608.f37166(var117, var118);
            }
        }
        else if (var118.isNumber()) {
            var119.resetMultipleValues();
            final SubLObject var121 = f37199(var117);
            final SubLObject var122 = var119.secondMultipleValue();
            final SubLObject var123 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            var120 = f37198(var121, module0608.f37166(var122, var118), module0608.f37166(var123, var118));
        }
        else {
            var119.resetMultipleValues();
            final SubLObject var124 = f37199(var118);
            final SubLObject var125 = var119.secondMultipleValue();
            final SubLObject var126 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (NIL == module0608.f37154(var126) && NIL == module0608.f37155(var125)) {
                module0229.f15259();
            }
            var119.resetMultipleValues();
            SubLObject var127 = f37199(var117);
            SubLObject var128 = var119.secondMultipleValue();
            SubLObject var129 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (NIL != f37203(var127, var124)) {
                var119.resetMultipleValues();
                final SubLObject var130 = f37206(var124, var127, var128, var129);
                final SubLObject var131 = var119.secondMultipleValue();
                var119.resetMultipleValues();
                var127 = var124;
                var128 = var130;
                var129 = var131;
            }
            final SubLObject var132 = f37223(var127, var124);
            final SubLObject var133 = module0608.f37166(var128, var125);
            final SubLObject var134 = module0608.f37166(var128, var126);
            final SubLObject var135 = module0608.f37166(var129, var125);
            final SubLObject var136 = module0608.f37166(var129, var126);
            final SubLObject var137 = module0608.f37169((SubLObject)ConsesLow.list(var133, var134, var135, var136));
            final SubLObject var138 = module0608.f37170((SubLObject)ConsesLow.list(var133, var134, var135, var136));
            var120 = f37230(var132, module0609.f37181(var137), module0609.f37181(var138));
        }
        return var120;
    }
    
    public static SubLObject f37243(final SubLObject var5) {
        return f37231((SubLObject)ONE_INTEGER, var5);
    }
    
    public static SubLObject f37244(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        if (var118.isNumber() && var118.isZero()) {
            module0229.f15259();
        }
        else if (var118.isNumber() && var117.isNumber()) {
            var120 = Numbers.mod(var117, var118);
        }
        else {
            var119.resetMultipleValues();
            final SubLObject var121 = f37199(var118);
            final SubLObject var122 = var119.secondMultipleValue();
            final SubLObject var123 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (!var122.numE(var123)) {
                module0229.f15259();
            }
            if (var122.isZero()) {
                module0229.f15259();
            }
            var119.resetMultipleValues();
            final SubLObject var124 = f37199(var117);
            final SubLObject var125 = var119.secondMultipleValue();
            final SubLObject var126 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (!var125.numE(var126)) {
                module0229.f15259();
            }
            if (NIL == f37203(var124, var121)) {
                module0229.f15259();
            }
            final SubLObject var127 = f37206(var121, var124, var125, (SubLObject)UNPROVIDED);
            final SubLObject var128 = var121;
            final SubLObject var129 = Numbers.mod(var127, var122);
            var120 = f37230(var128, var129, (SubLObject)UNPROVIDED);
        }
        return module0609.f37181(var120);
    }
    
    public static SubLObject f37245(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        var6.resetMultipleValues();
        final SubLObject var7 = f37199(var5);
        final SubLObject var8 = var6.secondMultipleValue();
        final SubLObject var9 = var6.thirdMultipleValue();
        var6.resetMultipleValues();
        if (NIL == var7) {
            module0229.f15259();
        }
        final SubLObject var10 = f37246(var7);
        if (NIL == var10) {
            module0229.f15259();
        }
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = (SubLObject)NIL;
        if (NIL == var11) {
            SubLObject var13 = var10;
            SubLObject var14 = (SubLObject)NIL;
            var14 = var13.first();
            while (NIL == var11 && NIL != var13) {
                if (NIL == var11) {
                    SubLObject var140_142 = f37247(var14);
                    SubLObject var15 = (SubLObject)NIL;
                    var15 = var140_142.first();
                    while (NIL == var11 && NIL != var140_142) {
                        var6.resetMultipleValues();
                        final SubLObject var16 = f37199(var15);
                        final SubLObject var17 = var6.secondMultipleValue();
                        final SubLObject var18 = var6.thirdMultipleValue();
                        var6.resetMultipleValues();
                        if (var17.numE(var18) && NIL != f37203(var7, var16)) {
                            final SubLObject var19 = f37206(var7, var16, var17, (SubLObject)UNPROVIDED);
                            var11 = Numbers.mod(var8, var19);
                            var12 = Numbers.add(var11, Numbers.subtract(var9, var8));
                        }
                        var140_142 = var140_142.rest();
                        var15 = var140_142.first();
                    }
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
        }
        return f37198(var7, (NIL != var11) ? var11 : var8, (NIL != var12) ? var12 : var9);
    }
    
    public static SubLObject f37247(final SubLObject var148) {
        return module0220.f14562(var148, $ic44$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)$ic45$);
    }
    
    public static SubLObject f37246(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = module0226.f14990(var2, (SubLObject)UNPROVIDED);
        SubLObject var5 = (SubLObject)NIL;
        var5 = var4.first();
        while (NIL != var4) {
            if (NIL != module0305.f20438(var5, $ic46$, (SubLObject)UNPROVIDED)) {
                var3 = (SubLObject)ConsesLow.cons(var5, var3);
            }
            var4 = var4.rest();
            var5 = var4.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f37248(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        if (NIL != module0608.f37152(var5)) {
            var7 = module0608.f37157(var5);
        }
        else {
            var6.resetMultipleValues();
            final SubLObject var8 = f37199(var5);
            final SubLObject var9 = var6.secondMultipleValue();
            final SubLObject var10 = var6.thirdMultipleValue();
            var6.resetMultipleValues();
            final SubLObject var11 = module0608.f37157(var9);
            final SubLObject var12 = module0608.f37157(var10);
            SubLObject var13 = module0608.f37169((SubLObject)ConsesLow.list(var11, var12));
            final SubLObject var14 = module0608.f37170((SubLObject)ConsesLow.list(var11, var12));
            if (NIL != module0608.f37154(var9) && NIL != module0608.f37155(var10)) {
                var13 = (SubLObject)ZERO_INTEGER;
            }
            var7 = f37198(var8, var13, var14);
        }
        return var7;
    }
    
    public static SubLObject f37249(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        if (NIL != module0608.f37152(var5) && NIL != module0608.f37154(var5)) {
            module0229.f15259();
        }
        else if (NIL != module0608.f37152(var5)) {
            var7 = module0608.f37171(var5);
        }
        else {
            var6.resetMultipleValues();
            final SubLObject var8 = f37199(var5);
            final SubLObject var9 = var6.secondMultipleValue();
            final SubLObject var10 = var6.thirdMultipleValue();
            var6.resetMultipleValues();
            if (NIL != module0608.f37154(var9) || NIL != module0608.f37154(var10)) {
                module0229.f15259();
            }
            final SubLObject var11 = f37225(var8);
            final SubLObject var12 = module0608.f37171(var9);
            final SubLObject var13 = module0608.f37171(var10);
            var7 = f37198(var11, var12, var13);
        }
        return var7;
    }
    
    public static SubLObject f37250(final SubLObject var5) {
        return module0609.f37185(var5, var5);
    }
    
    public static SubLObject f37251(final SubLObject var155) {
        SubLObject var156 = (SubLObject)NIL;
        if (NIL == module0035.f2000(var155, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED) || NIL == module0035.f1994(var155, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        SubLObject var157 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var155, var155, (SubLObject)$ic50$);
        var157 = var155.first();
        SubLObject var158 = var155.rest();
        final SubLObject var159 = var158.isCons() ? var158.first() : var157;
        cdestructuring_bind.destructuring_bind_must_listp(var158, var155, (SubLObject)$ic50$);
        var158 = var158.rest();
        if (NIL == var158) {
            if (!var157.isNumber() || !var159.isNumber()) {
                module0229.f15259();
            }
            final SubLObject var160 = Numbers.divide(var157, (SubLObject)$ic51$);
            final SubLObject var161 = Numbers.divide(var159, (SubLObject)$ic51$);
            var156 = f37198($ic5$, module0609.f37181(var160), module0609.f37181(var161));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var155, (SubLObject)$ic50$);
        }
        return var156;
    }
    
    public static SubLObject f37252(final SubLObject var5) {
        return f37253(var5, (SubLObject)$ic53$);
    }
    
    public static SubLObject f37254(final SubLObject var5) {
        return f37253(var5, (SubLObject)$ic55$);
    }
    
    public static SubLObject f37255(final SubLObject var5) {
        return f37253(var5, (SubLObject)$ic57$);
    }
    
    public static SubLObject f37256(final SubLObject var5) {
        return f37253(var5, (SubLObject)$ic59$);
    }
    
    public static SubLObject f37253(final SubLObject var5, final SubLObject var160) {
        final SubLThread var161 = SubLProcess.currentSubLThread();
        SubLObject var162 = (SubLObject)NIL;
        if (var5.isNumber()) {
            var162 = Functions.funcall(var160, var5);
        }
        else {
            var161.resetMultipleValues();
            final SubLObject var163 = f37199(var5);
            final SubLObject var164 = var161.secondMultipleValue();
            final SubLObject var165 = var161.thirdMultipleValue();
            var161.resetMultipleValues();
            final SubLObject var166 = Functions.funcall(var160, var164);
            final SubLObject var167 = Functions.funcall(var160, var165);
            var162 = f37198(var163, var166, var167);
        }
        return var162;
    }
    
    public static SubLObject f37257(final SubLObject var5, final SubLObject var163) {
        final SubLThread var164 = SubLProcess.currentSubLThread();
        SubLObject var165 = (SubLObject)NIL;
        if (var5.isNumber()) {
            var165 = f37258(var5, var163);
        }
        else {
            var164.resetMultipleValues();
            final SubLObject var166 = f37199(var5);
            final SubLObject var167 = var164.secondMultipleValue();
            final SubLObject var168 = var164.thirdMultipleValue();
            var164.resetMultipleValues();
            final SubLObject var169 = f37258(var167, var163);
            final SubLObject var170 = f37258(var168, var163);
            var165 = f37198(var166, var169, var170);
        }
        return var165;
    }
    
    public static SubLObject f37258(final SubLObject var116, final SubLObject var164) {
        assert NIL != Types.numberp(var116) : var116;
        assert NIL != module0004.f106(var164) : var164;
        final SubLObject var165 = module0048.f3323(var164);
        return Numbers.divide(Numbers.round(Numbers.multiply(var116, var165), (SubLObject)UNPROVIDED), var165);
    }
    
    public static SubLObject f37259(final SubLObject var155) {
        if (NIL == var155) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var155)) {
            return var155.first();
        }
        return module0609.f37179(Symbols.symbol_function((SubLObject)$ic64$), (SubLObject)NIL, var155);
    }
    
    public static SubLObject f37260(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        if (var117.isNumber() && var118.isNumber()) {
            final SubLObject var121 = Numbers.min(var117, var118);
            final SubLObject var122 = Numbers.max(var117, var118);
            var120 = f37198($ic5$, var121, var122);
        }
        else {
            var119.resetMultipleValues();
            final SubLObject var123 = f37199(var117);
            final SubLObject var124 = var119.secondMultipleValue();
            final SubLObject var125 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            var119.resetMultipleValues();
            final SubLObject var126 = f37199(var118);
            SubLObject var127 = var119.secondMultipleValue();
            SubLObject var128 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (NIL == f37203(var123, var126)) {
                module0229.f15259();
            }
            var119.resetMultipleValues();
            final SubLObject var129 = f37206(var123, var126, var127, var128);
            final SubLObject var130 = var119.secondMultipleValue();
            var119.resetMultipleValues();
            var127 = var129;
            var128 = var130;
            final SubLObject var131 = Numbers.min(var124, var127);
            final SubLObject var132 = Numbers.max(var125, var128);
            var120 = f37198(var123, var131, var132);
        }
        return var120;
    }
    
    public static SubLObject f37261(final SubLObject var155) {
        if (NIL == var155) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        if (NIL != module0035.f1997(var155)) {
            return var155.first();
        }
        return module0609.f37179(Symbols.symbol_function((SubLObject)$ic66$), (SubLObject)NIL, var155);
    }
    
    public static SubLObject f37262(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        if (var117.isNumber() && var118.isNumber()) {
            if (var117.numE(var118)) {
                var120 = var117;
            }
            else {
                module0229.f15259();
            }
        }
        else {
            var119.resetMultipleValues();
            final SubLObject var121 = f37199(var117);
            final SubLObject var122 = var119.secondMultipleValue();
            final SubLObject var123 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            var119.resetMultipleValues();
            final SubLObject var124 = f37199(var118);
            SubLObject var125 = var119.secondMultipleValue();
            SubLObject var126 = var119.thirdMultipleValue();
            var119.resetMultipleValues();
            if (NIL == f37203(var121, var124)) {
                module0229.f15259();
            }
            var119.resetMultipleValues();
            final SubLObject var127 = f37206(var121, var124, var125, var126);
            final SubLObject var128 = var119.secondMultipleValue();
            var119.resetMultipleValues();
            var125 = var127;
            var126 = var128;
            final SubLObject var129 = Numbers.max(var122, var125);
            final SubLObject var130 = Numbers.min(var123, var126);
            if (var130.numGE(var129)) {
                var120 = f37198(var121, var129, var130);
            }
            else {
                module0229.f15259();
            }
        }
        return module0609.f37181(var120);
    }
    
    public static SubLObject f37263(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        if (var5.isNumber()) {
            var7 = var5;
        }
        else {
            var6.resetMultipleValues();
            final SubLObject var8 = f37199(var5);
            final SubLObject var9 = var6.secondMultipleValue();
            final SubLObject var10 = var6.thirdMultipleValue();
            var6.resetMultipleValues();
            var7 = f37198(var8, var9, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f37264(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        if (var5.isNumber()) {
            var7 = var5;
        }
        else {
            var6.resetMultipleValues();
            final SubLObject var8 = f37199(var5);
            final SubLObject var9 = var6.secondMultipleValue();
            final SubLObject var10 = var6.thirdMultipleValue();
            var6.resetMultipleValues();
            var7 = f37198(var8, var10, (SubLObject)UNPROVIDED);
        }
        return var7;
    }
    
    public static SubLObject f37265(final SubLObject var5, final SubLObject var168) {
        final SubLThread var169 = SubLProcess.currentSubLThread();
        SubLObject var170 = (SubLObject)NIL;
        if (NIL != module0608.f37152(var5)) {
            var170 = f37266(var168, $ic5$, var5, var5, var5);
        }
        else {
            var169.resetMultipleValues();
            final SubLObject var171 = f37199(var5);
            final SubLObject var172 = var169.secondMultipleValue();
            final SubLObject var173 = var169.thirdMultipleValue();
            var169.resetMultipleValues();
            final SubLObject var174 = module0608.f37166(module0608.f37167(var172, var173), (SubLObject)TWO_INTEGER);
            var170 = f37266(var168, var171, var172, var174, var173);
        }
        return module0609.f37181(var170);
    }
    
    public static SubLObject f37266(final SubLObject var168, final SubLObject var2, final SubLObject var3, final SubLObject var169, final SubLObject var4) {
        final SubLObject var170 = module0608.f37157(module0608.f37165(var169, var168));
        final SubLObject var171 = module0608.f37168(var3, var170);
        final SubLObject var172 = module0608.f37167(var4, var170);
        return f37198(var2, var171, var172);
    }
    
    public static SubLObject f37267(SubLObject var171, final SubLObject var5) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        var171 = f37220(var171);
        if (NIL == module0004.f105(var171)) {
            module0229.f15259();
        }
        var172.resetMultipleValues();
        final SubLObject var173 = f37199(var5);
        SubLObject var174 = var172.secondMultipleValue();
        SubLObject var175 = var172.thirdMultipleValue();
        var172.resetMultipleValues();
        var174 = module0048.f3302(var174, var171);
        var175 = module0048.f3302(var175, var171);
        final SubLObject var176 = f37198(var173, var174, var175);
        return var176;
    }
    
    public static SubLObject f37268(final SubLObject var5) {
        return f37269((SubLObject)$ic72$, var5);
    }
    
    public static SubLObject f37270(final SubLObject var5) {
        return f37269((SubLObject)$ic74$, var5);
    }
    
    public static SubLObject f37271(final SubLObject var5) {
        return f37269((SubLObject)$ic76$, var5);
    }
    
    public static SubLObject f37272(final SubLObject var5) {
        return f37243(f37268(var5));
    }
    
    public static SubLObject f37273(final SubLObject var5) {
        return f37243(f37270(var5));
    }
    
    public static SubLObject f37274(final SubLObject var5) {
        return f37243(f37271(var5));
    }
    
    public static SubLObject f37269(final SubLObject var172, final SubLObject var5) {
        final SubLThread var173 = SubLProcess.currentSubLThread();
        var173.resetMultipleValues();
        final SubLObject var174 = f37199(f37238($ic81$, var5));
        final SubLObject var175 = var173.secondMultipleValue();
        final SubLObject var176 = var173.thirdMultipleValue();
        var173.resetMultipleValues();
        if (!var175.numE(var176)) {
            module0229.f15259();
        }
        final SubLObject var177 = Functions.funcall(var172, var175);
        return module0609.f37181(var177);
    }
    
    public static SubLObject f37275(final SubLObject var116) {
        return f37276((SubLObject)$ic82$, var116);
    }
    
    public static SubLObject f37277(final SubLObject var116) {
        return f37276((SubLObject)$ic84$, var116);
    }
    
    public static SubLObject f37278(final SubLObject var116) {
        return f37276((SubLObject)$ic86$, var116);
    }
    
    public static SubLObject f37279(final SubLObject var116) {
        return f37275(f37243(var116));
    }
    
    public static SubLObject f37280(final SubLObject var116) {
        return f37277(f37243(var116));
    }
    
    public static SubLObject f37281(final SubLObject var116) {
        return f37278(f37243(var116));
    }
    
    public static SubLObject f37276(final SubLObject var173, final SubLObject var116) {
        final SubLThread var174 = SubLProcess.currentSubLThread();
        SubLObject var175 = (SubLObject)NIL;
        SubLObject var176 = (SubLObject)NIL;
        try {
            var174.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var177 = Errors.$error_handler$.currentBinding(var174);
            try {
                Errors.$error_handler$.bind((SubLObject)$ic29$, var174);
                try {
                    var176 = Functions.funcall(var173, var116);
                }
                catch (Throwable var178) {
                    Errors.handleThrowable(var178, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var177, var174);
            }
        }
        catch (Throwable var179) {
            var175 = Errors.handleThrowable(var179, module0003.$g3$.getGlobalValue());
        }
        finally {
            var174.throwStack.pop();
        }
        if (NIL != var175) {
            module0229.f15259();
        }
        final SubLObject var180 = f37198($ic81$, var176, var176);
        return var180;
    }
    
    public static SubLObject f37282(SubLObject var116, SubLObject var143) {
        final SubLThread var144 = SubLProcess.currentSubLThread();
        var116 = f37220(var116);
        var143 = f37220(var143);
        if (NIL == module0608.f37155(var116) || NIL == module0608.f37156(var143) || NIL != module0608.f37160(var143, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        SubLObject var145 = (SubLObject)NIL;
        SubLObject var146 = (SubLObject)NIL;
        try {
            var144.throwStack.push($ic91$);
            final SubLObject var147 = Errors.$error_handler$.currentBinding(var144);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic92$), var144);
                try {
                    var145 = module0608.f37172(var116, var143);
                }
                catch (Throwable var148) {
                    Errors.handleThrowable(var148, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var147, var144);
            }
        }
        catch (Throwable var149) {
            var146 = Errors.handleThrowable(var149, (SubLObject)$ic91$);
        }
        finally {
            var144.throwStack.pop();
        }
        if (NIL == module0608.f37152(var145)) {
            module0229.f15259();
        }
        return module0609.f37181(var145);
    }
    
    public static SubLObject f37283(SubLObject var116, SubLObject var176) {
        final SubLThread var177 = SubLProcess.currentSubLThread();
        var116 = f37220(var116);
        var176 = f37220(var176);
        SubLObject var178 = (SubLObject)NIL;
        SubLObject var179 = (SubLObject)NIL;
        try {
            var177.throwStack.push($ic91$);
            final SubLObject var180 = Errors.$error_handler$.currentBinding(var177);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic92$), var177);
                try {
                    var178 = module0608.f37173(var116, var176);
                }
                catch (Throwable var181) {
                    Errors.handleThrowable(var181, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var180, var177);
            }
        }
        catch (Throwable var182) {
            var179 = Errors.handleThrowable(var182, (SubLObject)$ic91$);
        }
        finally {
            var177.throwStack.pop();
        }
        if (NIL == module0608.f37152(var178)) {
            module0229.f15259();
        }
        return module0609.f37181(var178);
    }
    
    public static SubLObject f37284(SubLObject var178, SubLObject var179, SubLObject var180) {
        var178 = f37220(var178);
        var179 = f37220(var179);
        var180 = f37220(var180);
        final SubLObject var181 = module0608.f37168(module0608.f37173(var179, (SubLObject)TWO_INTEGER), module0608.f37165((SubLObject)FOUR_INTEGER, module0608.f37165(var178, var180)));
        if (NIL != module0608.f37153(var178) || NIL != module0608.f37154(var181)) {
            module0229.f15259();
        }
        return module0609.f37181(module0608.f37166(module0608.f37167(module0608.f37158(var179), module0608.f37171(var181)), module0608.f37165((SubLObject)TWO_INTEGER, var178)));
    }
    
    public static SubLObject f37285(SubLObject var178, SubLObject var179, SubLObject var180) {
        var178 = f37220(var178);
        var179 = f37220(var179);
        var180 = f37220(var180);
        final SubLObject var181 = module0608.f37168(module0608.f37173(var179, (SubLObject)TWO_INTEGER), module0608.f37165((SubLObject)FOUR_INTEGER, module0608.f37165(var178, var180)));
        if (NIL != module0608.f37153(var178) || NIL != module0608.f37154(var181)) {
            module0229.f15259();
        }
        return module0609.f37181(module0608.f37166(module0608.f37168(module0608.f37158(var179), module0608.f37171(var181)), module0608.f37165((SubLObject)TWO_INTEGER, var178)));
    }
    
    public static SubLObject f37286(final SubLObject var181) {
        if (NIL == module0202.f12676(var181)) {
            module0229.f15259();
        }
        final SubLObject var182 = f37287(var181, (SubLObject)$ic97$);
        final SubLObject var183 = module0213.f14033(var182);
        final SubLObject var184 = Mapping.mapcar((SubLObject)$ic98$, var183);
        return module0202.f12791(var184, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37288(final SubLObject var181) {
        if (NIL == module0202.f12676(var181)) {
            module0229.f15259();
        }
        final SubLObject var182 = f37287(var181, (SubLObject)$ic97$);
        final SubLObject var183 = module0213.f14036(var182);
        final SubLObject var184 = Mapping.mapcar((SubLObject)$ic98$, var183);
        return module0202.f12791(var184, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37289(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL != module0608.f37152(var117) && NIL != module0608.f37152(var118)) {
            return module0608.f37163(var117, var118, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var117) && NIL != module0173.f10955(var118) && NIL != module0259.f16891(var117, $ic2$) && NIL != module0259.f16891(var118, $ic2$)) {
            if (NIL != module0331.f22370(var117, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            if (NIL != f37290(var117, var118, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            if (NIL != f37290(var118, var117, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0220.f14604((SubLObject)ConsesLow.list($ic101$, var118, var117))) {
                return (SubLObject)T;
            }
        }
        var119.resetMultipleValues();
        final SubLObject var120 = f37199(var117);
        final SubLObject var121 = var119.secondMultipleValue();
        final SubLObject var122 = var119.thirdMultipleValue();
        var119.resetMultipleValues();
        var119.resetMultipleValues();
        final SubLObject var123 = f37199(var118);
        SubLObject var124 = var119.secondMultipleValue();
        final SubLObject var125 = var119.thirdMultipleValue();
        var119.resetMultipleValues();
        if (NIL == f37203(var120, var123)) {
            module0229.f15259();
        }
        var124 = f37206(var120, var123, var124, (SubLObject)UNPROVIDED);
        return module0608.f37163(var122, var124, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37290(final SubLObject var186, final SubLObject var187, SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        return module0440.f30711($ic102$, var186, var187, var17, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37291(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL != module0608.f37152(var117) && NIL != module0608.f37152(var118)) {
            return module0608.f37164(var117, var118, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0173.f10955(var117) && NIL != module0173.f10955(var118) && NIL != module0259.f16891(var117, $ic2$) && NIL != module0259.f16891(var118, $ic2$)) {
            if (NIL != module0331.f22370(var117, var118, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            if (NIL != f37290(var117, var118, (SubLObject)UNPROVIDED)) {
                return (SubLObject)T;
            }
            if (NIL != f37290(var118, var117, (SubLObject)UNPROVIDED)) {
                return (SubLObject)NIL;
            }
            if (NIL != module0220.f14604((SubLObject)ConsesLow.list($ic103$, var118, var117))) {
                return (SubLObject)T;
            }
            if (NIL != module0220.f14604((SubLObject)ConsesLow.list($ic101$, var118, var117))) {
                return (SubLObject)T;
            }
        }
        var119.resetMultipleValues();
        final SubLObject var120 = f37199(var117);
        final SubLObject var121 = var119.secondMultipleValue();
        final SubLObject var122 = var119.thirdMultipleValue();
        var119.resetMultipleValues();
        var119.resetMultipleValues();
        final SubLObject var123 = f37199(var118);
        SubLObject var124 = var119.secondMultipleValue();
        final SubLObject var125 = var119.thirdMultipleValue();
        var119.resetMultipleValues();
        if (NIL == f37203(var120, var123)) {
            module0229.f15259();
        }
        var124 = f37206(var120, var123, var124, (SubLObject)UNPROVIDED);
        return module0608.f37164(var122, var124, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37292(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (NIL == f37196(var117) || NIL == f37196(var118)) {
            module0229.f15259();
        }
        SubLObject var120 = (SubLObject)NIL;
        if (var117.isNumber() && var118.isNumber()) {
            var120 = Numbers.numE(var117, var118);
        }
        else if (NIL != module0173.f10955(var117) && NIL != module0173.f10955(var118)) {
            var120 = module0331.f22370(var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == var120) {
                final SubLObject var121 = module0145.$g1942$.currentBinding(var119);
                try {
                    module0145.$g1942$.bind((SubLObject)T, var119);
                    var120 = module0315.f21297($ic26$, var117, var118, (SubLObject)UNPROVIDED);
                }
                finally {
                    module0145.$g1942$.rebind(var121, var119);
                }
                if (NIL == var120) {
                    var120 = f37293(var117, var118);
                }
            }
        }
        else {
            var120 = f37293(var117, var118);
        }
        return var120;
    }
    
    public static SubLObject f37293(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        var119.resetMultipleValues();
        final SubLObject var120 = f37199(var117);
        final SubLObject var121 = var119.secondMultipleValue();
        final SubLObject var122 = var119.thirdMultipleValue();
        var119.resetMultipleValues();
        var119.resetMultipleValues();
        final SubLObject var123 = f37199(var118);
        SubLObject var124 = var119.secondMultipleValue();
        SubLObject var125 = var119.thirdMultipleValue();
        var119.resetMultipleValues();
        if (NIL == f37203(var120, var123)) {
            module0229.f15259();
        }
        var124 = f37206(var120, var123, var124, (SubLObject)UNPROVIDED);
        var125 = f37206(var120, var123, var125, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(var121.numLE(var124) && var122.numGE(var125));
    }
    
    public static SubLObject f37294(final SubLObject var117, final SubLObject var118) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        if (var117.isNumber() && var118.isNumber()) {
            return Numbers.numE(var117, var118);
        }
        if (NIL != module0173.f10955(var117) && NIL != module0173.f10955(var118) && NIL != module0259.f16891(var117, $ic2$) && NIL != module0259.f16891(var117, $ic2$) && NIL != module0331.f22370(var118, var117, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        var119.resetMultipleValues();
        final SubLObject var120 = f37199(var117);
        final SubLObject var121 = var119.secondMultipleValue();
        final SubLObject var122 = var119.thirdMultipleValue();
        var119.resetMultipleValues();
        var119.resetMultipleValues();
        final SubLObject var123 = f37199(var118);
        SubLObject var124 = var119.secondMultipleValue();
        SubLObject var125 = var119.thirdMultipleValue();
        var119.resetMultipleValues();
        if (NIL == f37203(var120, var123)) {
            module0229.f15259();
        }
        var124 = f37206(var120, var123, var124, (SubLObject)UNPROVIDED);
        var125 = f37206(var120, var123, var125, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(var121.numLE(var125) && var124.numLE(var122));
    }
    
    public static SubLObject f37295(final SubLObject var189, SubLObject var190) {
        if (NIL == module0202.f12671(var189) || !var190.isInteger()) {
            module0229.f15259();
        }
        if (!var190.isPositive()) {
            module0229.f15259();
        }
        var190 = Numbers.subtract(var190, (SubLObject)ONE_INTEGER);
        final SubLObject var191 = module0202.f12751(var189);
        if (var190.numGE(Sequences.length(var191))) {
            module0229.f15259();
        }
        return ConsesLow.nth(var190, var191);
    }
    
    public static SubLObject f37296(final SubLObject var155) {
        if (NIL == module0035.f2370(Symbols.symbol_function((SubLObject)$ic107$), var155, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        return module0202.f12787(Functions.apply(Symbols.symbol_function((SubLObject)$ic108$), Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic109$), var155)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37297(final SubLObject var189) {
        if (NIL == module0202.f12671(var189)) {
            module0229.f15259();
        }
        return module0202.f12751(var189).first();
    }
    
    public static SubLObject f37298(final SubLObject var189) {
        if (NIL == module0202.f12671(var189)) {
            module0229.f15259();
        }
        final SubLObject var190 = module0202.f12751(var189);
        if (NIL == module0035.f2000(var190, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        return conses_high.second(var190);
    }
    
    public static SubLObject f37299(final SubLObject var189) {
        if (NIL == module0202.f12671(var189)) {
            module0229.f15259();
        }
        return module0202.f12787(module0202.f12751(var189).rest(), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37300(final SubLObject var189) {
        if (NIL == module0202.f12671(var189)) {
            module0229.f15259();
        }
        return conses_high.last(module0202.f12751(var189), (SubLObject)UNPROVIDED).first();
    }
    
    public static SubLObject f37301(final SubLObject var189, SubLObject var193, final SubLObject var194) {
        if (NIL == module0202.f12674(var189) || !var193.isInteger() || !var194.isInteger()) {
            module0229.f15259();
        }
        if (!var193.isPositive() || !var194.isPositive() || var194.numL(var193)) {
            module0229.f15259();
        }
        final SubLObject var195 = module0202.f12751(var189);
        final SubLObject var196 = Sequences.length(var195);
        if (var193.numG(var196) || var194.numG(var196)) {
            module0229.f15259();
        }
        var193 = Numbers.subtract(var193, (SubLObject)ONE_INTEGER);
        return module0202.f12787(Sequences.subseq(var195, var193, var194), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37302(final SubLObject var196, final SubLObject var189) {
        if (NIL == module0202.f12674(var196) || NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        final SubLObject var197 = module0202.f12751(var196);
        final SubLObject var198 = module0202.f12751(var189);
        SubLObject var199 = (SubLObject)NIL;
        if (NIL == var197) {
            SubLObject var200;
            SubLObject var201;
            for (var200 = Sequences.length(var198), var201 = (SubLObject)NIL, var201 = (SubLObject)ZERO_INTEGER; var201.numL(var200); var201 = Numbers.add(var201, (SubLObject)ONE_INTEGER)) {
                var199 = (SubLObject)ConsesLow.cons(Numbers.add(var201, (SubLObject)ONE_INTEGER), var199);
            }
        }
        else {
            SubLObject var202;
            for (var202 = (SubLObject)NIL, var202 = Sequences.search(var197, var198, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, (SubLObject)ZERO_INTEGER, (SubLObject)NIL); NIL != var202; var202 = Sequences.search(var197, var198, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY), (SubLObject)ZERO_INTEGER, (SubLObject)NIL, Numbers.add(var202, (SubLObject)ONE_INTEGER), (SubLObject)NIL)) {
                var199 = (SubLObject)ConsesLow.cons(Numbers.add(var202, (SubLObject)ONE_INTEGER), var199);
            }
        }
        return module0202.f12787(Sequences.nreverse(var199), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37303(final SubLObject var202, final SubLObject var189) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        final SubLObject var203 = module0202.f12751(var189);
        final SubLObject var204 = Sequences.position(var202, var203, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (!var204.isInteger()) {
            module0229.f15259();
        }
        return module0609.f37181(Numbers.add(var204, (SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f37304(final SubLObject var189) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        return Sequences.length(module0202.f12751(var189));
    }
    
    public static SubLObject f37305(final SubLObject var189) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        return module0202.f12787(Sequences.reverse(module0202.f12751(var189)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37306(final SubLObject var189) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        final SubLObject var190 = module0202.f12751(var189);
        final SubLObject var191 = Sequences.nreverse(Sequences.delete_duplicates(Sequences.reverse(var190), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return reader.bq_cons($ic120$, ConsesLow.append(var191, (SubLObject)NIL));
    }
    
    public static SubLObject f37307(final SubLObject var181) {
        if (NIL == module0202.f12675(var181)) {
            module0229.f15259();
        }
        final SubLObject var182 = f37287(var181, (SubLObject)$ic97$);
        return module0202.f12787(var182, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37308(final SubLObject var204, final SubLObject var189) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        final SubLObject var205 = module0202.f12751(var189);
        if (NIL == module0035.f2370((SubLObject)$ic107$, var205, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        final SubLObject var206 = Mapping.mapcar((SubLObject)$ic109$, var205);
        if (NIL == module0035.f2370((SubLObject)$ic123$, var206, (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        final SubLObject var207 = Mapping.mapcar((SubLObject)$ic124$, var206);
        final SubLObject var208 = module0205.f13257(module0035.f2230(var207), var204, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        return var208;
    }
    
    public static SubLObject f37309(final SubLObject var209) {
        SubLObject var210 = (SubLObject)NIL;
        SubLObject var211 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var209, var209, (SubLObject)$ic126$);
        var210 = var209.first();
        SubLObject var212 = var209.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var212, var209, (SubLObject)$ic126$);
        var211 = var212.first();
        var212 = var212.rest();
        if (NIL == var212) {
            return (SubLObject)ConsesLow.cons(var210, var211);
        }
        cdestructuring_bind.cdestructuring_bind_error(var209, (SubLObject)$ic126$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37310(final SubLObject var214, final SubLObject var189) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        final SubLObject var215 = module0202.f12751(var189);
        final SubLObject var216 = f37311(var214, var215);
        if (NIL == var216) {
            module0229.f15259();
        }
        return module0202.f12787(var216, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37311(final SubLObject var214, final SubLObject var191) {
        final SubLThread var215 = SubLProcess.currentSubLThread();
        SubLObject var216 = (SubLObject)NIL;
        SubLObject var217 = var191;
        SubLObject var218 = (SubLObject)NIL;
        var218 = var217.first();
        while (NIL != var217) {
            var215.resetMultipleValues();
            final SubLObject var219 = module0229.f15243((SubLObject)ConsesLow.list(var214, var218));
            final SubLObject var220 = var215.secondMultipleValue();
            var215.resetMultipleValues();
            if (NIL == var220) {
                module0229.f15259();
            }
            else {
                var216 = (SubLObject)ConsesLow.cons(var219, var216);
            }
            var217 = var217.rest();
            var218 = var217.first();
        }
        return Sequences.nreverse(var216);
    }
    
    public static SubLObject f37312(final SubLObject var214, final SubLObject var189, final SubLObject var219) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        final SubLObject var220 = module0202.f12751(var189);
        final SubLObject var221 = f37313(var214, var220, var219);
        if (NIL == var221) {
            module0229.f15259();
        }
        return module0202.f12787(var221, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37313(final SubLObject var214, final SubLObject var191, final SubLObject var219) {
        final SubLThread var220 = SubLProcess.currentSubLThread();
        SubLObject var221 = (SubLObject)NIL;
        SubLObject var222 = (SubLObject)NIL;
        if (NIL == var222) {
            SubLObject var223 = var191;
            SubLObject var224 = (SubLObject)NIL;
            var224 = var223.first();
            while (NIL == var222 && NIL != var223) {
                var220.resetMultipleValues();
                final SubLObject var225 = module0229.f15243((SubLObject)ConsesLow.list(var214, var224));
                final SubLObject var226 = var220.secondMultipleValue();
                var220.resetMultipleValues();
                if (NIL == var226) {
                    module0229.f15259();
                }
                else {
                    var221 = (SubLObject)ConsesLow.cons(var225, var221);
                }
                final SubLObject var227 = module0434.f30589((SubLObject)NIL, (SubLObject)ConsesLow.list(var219, var224), module0373.f26143(), (SubLObject)UNPROVIDED);
                if (NIL != var227) {
                    var222 = (SubLObject)T;
                }
                var223 = var223.rest();
                var224 = var223.first();
            }
        }
        return Sequences.nreverse(var221);
    }
    
    public static SubLObject f37314(final SubLObject var214, final SubLObject var189, final SubLObject var219) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        final SubLObject var220 = module0202.f12751(var189);
        final SubLObject var221 = f37315(var214, var220, var219);
        if (NIL == var221) {
            module0229.f15259();
        }
        return module0202.f12787(var221, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37315(final SubLObject var214, final SubLObject var191, final SubLObject var219) {
        final SubLThread var220 = SubLProcess.currentSubLThread();
        SubLObject var221 = (SubLObject)NIL;
        SubLObject var222 = (SubLObject)NIL;
        if (NIL == var222) {
            SubLObject var223 = var191;
            SubLObject var224 = (SubLObject)NIL;
            var224 = var223.first();
            while (NIL == var222 && NIL != var223) {
                var220.resetMultipleValues();
                final SubLObject var225 = module0229.f15243((SubLObject)ConsesLow.list(var214, var224));
                final SubLObject var226 = var220.secondMultipleValue();
                var220.resetMultipleValues();
                if (NIL == var226) {
                    module0229.f15259();
                }
                else {
                    var221 = (SubLObject)ConsesLow.cons(var225, var221);
                }
                final SubLObject var227 = module0434.f30589((SubLObject)NIL, (SubLObject)ConsesLow.list(var219, var225), module0373.f26143(), (SubLObject)UNPROVIDED);
                if (NIL != var227) {
                    var222 = (SubLObject)T;
                }
                var223 = var223.rest();
                var224 = var223.first();
            }
        }
        return Sequences.nreverse(var221);
    }
    
    public static SubLObject f37316(final SubLObject var214, final SubLObject var222, final SubLObject var223, final SubLObject var224, final SubLObject var225) {
        if (NIL == module0202.f12674(var222) || NIL == module0202.f12674(var223) || NIL == module0202.f12674(var224) || NIL == module0202.f12674(var225) || NIL == module0035.f2370((SubLObject)$ic107$, module0202.f12751(var225), (SubLObject)UNPROVIDED)) {
            module0229.f15259();
        }
        final SubLObject var226 = module0202.f12751(var222);
        final SubLObject var227 = module0202.f12751(var223);
        final SubLObject var228 = module0202.f12751(var224);
        final SubLObject var229 = Mapping.mapcar((SubLObject)$ic109$, module0202.f12751(var225));
        if (NIL == module0035.f2192(Symbols.symbol_function((SubLObject)$ic63$), var226) || NIL == module0035.f2192(Symbols.symbol_function((SubLObject)$ic63$), var228) || NIL == module0035.f2004(var226, var227) || NIL == module0035.f2004(var228, var229) || NIL != module0076.f5290(var226, var228, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL == module0035.f2005(var229)) {
            module0229.f15259();
        }
        final SubLObject var230 = f37317(var214, var226, var227, var228, var229);
        return module0202.f12787(var230, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37317(final SubLObject var214, final SubLObject var222, final SubLObject var223, final SubLObject var224, final SubLObject var225) {
        final SubLObject var226 = module0048.f_1X(Functions.apply(Symbols.symbol_function((SubLObject)$ic131$), ConsesLow.append(var222, var224)));
        final SubLObject var227 = (SubLObject)ConsesLow.make_list(var226, (SubLObject)NIL);
        final SubLObject var228 = Sequences.length(var225.first());
        SubLObject var229 = (SubLObject)NIL;
        SubLObject var230 = (SubLObject)NIL;
        SubLObject var233_234 = (SubLObject)NIL;
        SubLObject var231 = (SubLObject)NIL;
        SubLObject var236_237 = (SubLObject)NIL;
        var230 = var222;
        var233_234 = var230.first();
        var231 = var223;
        var236_237 = var231.first();
        while (NIL != var231 || NIL != var230) {
            ConsesLow.set_nth(var233_234, var227, var236_237);
            var230 = var230.rest();
            var233_234 = var230.first();
            var231 = var231.rest();
            var236_237 = var231.first();
        }
        SubLObject var232;
        SubLObject var233;
        SubLObject var234;
        SubLObject var240_241;
        SubLObject var235;
        SubLObject var243_244;
        for (var232 = (SubLObject)NIL, var232 = (SubLObject)ZERO_INTEGER; var232.numL(var228); var232 = Numbers.add(var232, (SubLObject)ONE_INTEGER)) {
            var233 = conses_high.copy_list(var227);
            var234 = (SubLObject)NIL;
            var240_241 = (SubLObject)NIL;
            var235 = (SubLObject)NIL;
            var243_244 = (SubLObject)NIL;
            var234 = var224;
            var240_241 = var234.first();
            var235 = var225;
            var243_244 = var235.first();
            while (NIL != var235 || NIL != var234) {
                ConsesLow.set_nth(var240_241, var233, ConsesLow.nth(var232, var243_244));
                var234 = var234.rest();
                var240_241 = var234.first();
                var235 = var235.rest();
                var243_244 = var235.first();
            }
            var229 = (SubLObject)ConsesLow.cons(module0229.f15243((SubLObject)ConsesLow.cons(var214, var233)), var229);
        }
        return Sequences.nreverse(var229);
    }
    
    public static SubLObject f37318(final SubLObject var155, final SubLObject var245, final SubLObject var246) {
        if (NIL == module0202.f12674(var155) || NIL == module0229.f15234(var246)) {
            module0229.f15259();
        }
        SubLObject var247 = var245;
        SubLObject var248 = module0202.f12751(var155);
        SubLObject var249 = (SubLObject)NIL;
        var249 = var248.first();
        while (NIL != var248) {
            var247 = module0229.f15243(module0202.f12768(var246, var249, var247));
            var248 = var248.rest();
            var249 = var248.first();
        }
        return var247;
    }
    
    public static SubLObject f37319(final SubLObject var189, final SubLObject var249) {
        if (NIL == module0202.f12674(var189)) {
            module0229.f15259();
        }
        return module0004.f104(var249, module0202.f12751(var189), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37320(final SubLObject var189, final SubLObject var249) {
        return f37319(var189, var249);
    }
    
    public static SubLObject f37321(final SubLObject var189, final SubLObject var250) {
        if (NIL == module0202.f12674(var189) || NIL == module0202.f12674(var250)) {
            module0229.f15259();
        }
        return Sequences.search(module0202.f12751(var250), module0202.f12751(var189), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37322(final SubLObject var191, final SubLObject var251) {
        if (!var191.isList() || !var251.isList()) {
            module0229.f15259();
        }
        if (Sequences.length(var251).numG(Sequences.length(var191))) {
            return (SubLObject)NIL;
        }
        SubLObject var252 = (SubLObject)NIL;
        SubLObject var253 = (SubLObject)NIL;
        SubLObject var254 = (SubLObject)NIL;
        var253 = var191;
        for (var254 = var251; NIL == var252 && NIL != var254; var254 = var254.rest()) {
            if (!var254.first().equalp(var253.first())) {
                var252 = (SubLObject)T;
            }
            var253 = var253.rest();
        }
        return (SubLObject)makeBoolean(NIL == var252);
    }
    
    public static SubLObject f37323(final SubLObject var1) {
        return module0202.f12680(var1);
    }
    
    public static SubLObject f37324(final SubLObject var1) {
        return module0202.f12679(var1);
    }
    
    public static SubLObject f37325(final SubLObject var1) {
        return module0202.f12676(var1);
    }
    
    public static SubLObject f37326(final SubLObject var1) {
        return module0202.f12677(var1);
    }
    
    public static SubLObject f37327(final SubLObject var1) {
        return module0202.f12678(var1);
    }
    
    public static SubLObject f37328(final SubLObject var255) {
        return module0285.f18990(module0202.f12681(var255));
    }
    
    public static SubLObject f37287(final SubLObject var203, SubLObject var256) {
        if (var256 == UNPROVIDED) {
            var256 = (SubLObject)$ic138$;
        }
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        if (NIL != module0173.f10955(var203) && NIL != module0269.f17705(var203)) {
            return module0259.f16848(var203, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f37326(var203)) {
            return module0202.f12684(var203);
        }
        if (NIL != f37327(var203)) {
            return module0434.f30598(var203, var256, (SubLObject)UNPROVIDED);
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37329(final SubLObject var203, SubLObject var17, SubLObject var256) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        if (var256 == UNPROVIDED) {
            var256 = (SubLObject)$ic138$;
        }
        if (NIL == module0131.f8560()) {
            Errors.error((SubLObject)$ic4$);
        }
        if (NIL != module0173.f10955(var203) && NIL != module0269.f17705(var203)) {
            return module0259.f16848(var203, var17, (SubLObject)UNPROVIDED);
        }
        if (NIL != f37326(var203)) {
            return module0202.f12684(var203);
        }
        if (NIL == f37327(var203)) {
            Errors.error((SubLObject)$ic139$, var203, var17);
            return (SubLObject)NIL;
        }
        if (NIL != var17) {
            return module0434.f30598(var203, var256, var17);
        }
        return module0434.f30598(var203, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37330(final SubLObject var257, final SubLObject var258) {
        if (NIL != f37325(var257) && NIL != f37325(var258)) {
            final SubLObject var259 = f37287(var257, (SubLObject)$ic97$);
            final SubLObject var260 = f37287(var258, (SubLObject)$ic97$);
            final SubLObject var261 = module0076.f5290(var259, var260, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return f37328(var261);
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37331(final SubLObject var257, final SubLObject var258) {
        if (NIL != f37325(var257) && NIL != f37325(var258)) {
            final SubLObject var259 = f37287(var257, (SubLObject)$ic97$);
            final SubLObject var260 = f37287(var258, (SubLObject)$ic97$);
            final SubLObject var261 = ConsesLow.append(var259, var260);
            return f37328(var261);
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37332(final SubLObject var257, final SubLObject var258) {
        if (NIL != f37325(var257) && NIL != f37325(var258)) {
            final SubLObject var259 = f37287(var257, (SubLObject)$ic97$);
            final SubLObject var260 = f37287(var258, (SubLObject)$ic97$);
            final SubLObject var261 = module0035.f2220(var259, var260, Symbols.symbol_function((SubLObject)EQUAL));
            return f37328(var261);
        }
        module0229.f15259();
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37333(final SubLObject var203) {
        if (NIL == f37325(var203) && NIL == module0173.f10955(var203)) {
            module0229.f15259();
        }
        final SubLObject var204 = f37287(var203, (SubLObject)$ic97$);
        final SubLObject var205 = f37328(var204);
        if ($ic143$.eql(var205)) {
            return module0202.f12786($ic120$, (SubLObject)NIL);
        }
        return var205;
    }
    
    public static SubLObject f37334(final SubLObject var214, final SubLObject var203) {
        final SubLObject var215 = f37287(var203, (SubLObject)$ic97$);
        final SubLObject var216 = f37311(var214, var215);
        if (NIL == var216) {
            module0229.f15259();
        }
        return f37328(var216);
    }
    
    public static SubLObject f37335(final SubLObject var155) {
        if (NIL == f37197(var155)) {
            module0229.f15259();
        }
        if (NIL == var155) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        return module0609.f37179(Symbols.symbol_function((SubLObject)$ic146$), (SubLObject)NIL, var155);
    }
    
    public static SubLObject f37336(final SubLObject var266, final SubLObject var267) {
        final SubLThread var268 = SubLProcess.currentSubLThread();
        SubLObject var269 = (SubLObject)NIL;
        if (var266.isInteger() && var267.isInteger()) {
            var269 = module0048.f3434(var266, var267);
        }
        else {
            var268.resetMultipleValues();
            final SubLObject var270 = f37199(var266);
            final SubLObject var271 = var268.secondMultipleValue();
            final SubLObject var272 = var268.thirdMultipleValue();
            var268.resetMultipleValues();
            var268.resetMultipleValues();
            final SubLObject var273 = f37199(var267);
            final SubLObject var274 = var268.secondMultipleValue();
            final SubLObject var275 = var268.thirdMultipleValue();
            var268.resetMultipleValues();
            if (!var271.isInteger() || !var272.isInteger() || !var274.isInteger() || !var275.isInteger()) {
                module0229.f15259();
            }
            if (!var271.numE(var272) || !var274.numE(var275)) {
                module0229.f15259();
            }
            if (NIL == f37203(var270, var273)) {
                module0229.f15259();
            }
            SubLObject var276 = (SubLObject)NIL;
            SubLObject var277 = (SubLObject)NIL;
            SubLObject var278 = (SubLObject)NIL;
            SubLObject var279 = (SubLObject)NIL;
            if (NIL != f37205(var270, var273)) {
                var276 = var270;
                var277 = var273;
                var278 = var271;
                var279 = var274;
            }
            else {
                var276 = var273;
                var277 = var270;
                var278 = var274;
                var279 = var271;
            }
            if (!var276.eql(var277) && NIL == f37337(f37204(var277, var276))) {
                module0229.f15259();
            }
            var279 = Numbers.round(f37206(var276, var277, var279, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            final SubLObject var280 = module0048.f3434(var278, var279);
            final SubLObject var281 = Numbers.round(f37206(var277, var276, var280, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            var269 = f37198(var277, var281, (SubLObject)UNPROVIDED);
        }
        return module0609.f37181(var269);
    }
    
    public static SubLObject f37338(final SubLObject var155) {
        if (NIL == f37197(var155)) {
            module0229.f15259();
        }
        if (NIL == var155) {
            module0229.f15259();
            return (SubLObject)NIL;
        }
        return module0609.f37179(Symbols.symbol_function((SubLObject)$ic148$), (SubLObject)NIL, var155);
    }
    
    public static SubLObject f37339(final SubLObject var266, final SubLObject var267) {
        final SubLThread var268 = SubLProcess.currentSubLThread();
        SubLObject var269 = (SubLObject)NIL;
        if (var266.isInteger() && var267.isInteger()) {
            var269 = module0048.f3437(var266, var267);
        }
        else {
            var268.resetMultipleValues();
            final SubLObject var270 = f37199(var266);
            final SubLObject var271 = var268.secondMultipleValue();
            final SubLObject var272 = var268.thirdMultipleValue();
            var268.resetMultipleValues();
            var268.resetMultipleValues();
            final SubLObject var273 = f37199(var267);
            final SubLObject var274 = var268.secondMultipleValue();
            final SubLObject var275 = var268.thirdMultipleValue();
            var268.resetMultipleValues();
            if (!var271.isInteger() || !var272.isInteger() || !var274.isInteger() || !var275.isInteger()) {
                module0229.f15259();
            }
            if (!var271.numE(var272) || !var274.numE(var275)) {
                module0229.f15259();
            }
            if (NIL == f37203(var270, var273)) {
                module0229.f15259();
            }
            SubLObject var276 = (SubLObject)NIL;
            SubLObject var277 = (SubLObject)NIL;
            SubLObject var278 = (SubLObject)NIL;
            SubLObject var279 = (SubLObject)NIL;
            if (NIL != f37205(var270, var273)) {
                var276 = var270;
                var277 = var273;
                var278 = var271;
                var279 = var274;
            }
            else {
                var276 = var273;
                var277 = var270;
                var278 = var274;
                var279 = var271;
            }
            if (!var276.eql(var277) && NIL == f37337(f37204(var277, var276))) {
                module0229.f15259();
            }
            var279 = Numbers.round(f37206(var276, var277, var279, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
            var269 = f37198(var276, module0048.f3437(var278, var279), (SubLObject)UNPROVIDED);
        }
        return var269;
    }
    
    public static SubLObject f37337(final SubLObject var116) {
        return (SubLObject)makeBoolean(var116.isNumber() && Numbers.mod(var116, (SubLObject)ONE_INTEGER).isZero());
    }
    
    public static SubLObject f37340(SubLObject var4) {
        var4 = f37220(var4);
        if (NIL == module0004.f105(var4)) {
            module0229.f15259();
        }
        return module0609.f37181(random.random(var4));
    }
    
    public static SubLObject f37341(SubLObject var190, SubLObject var4) {
        var190 = f37220(var190);
        var4 = f37220(var4);
        if (NIL == module0004.f106(var190) || NIL == module0004.f105(var4)) {
            module0229.f15259();
        }
        return module0202.f12787(Mapping.mapcar(Symbols.symbol_function((SubLObject)$ic151$), module0048.f3453(var190, var4, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f37342(final SubLObject var274) {
        SubLObject var275 = conses_high.copy_tree(module0202.f12751(var274));
        SubLObject var276 = (SubLObject)NIL;
        SubLObject var277 = (SubLObject)NIL;
        SubLObject var278 = (SubLObject)NIL;
        var276 = var275;
        var277 = var276.first();
        for (var278 = (SubLObject)ZERO_INTEGER; NIL != var276; var276 = var276.rest(), var277 = var276.first(), var278 = Numbers.add((SubLObject)ONE_INTEGER, var278)) {
            ConsesLow.set_nth(var278, var275, module0202.f12751(var277));
        }
        var275 = module0050.f3536(var275);
        if (NIL == var275) {
            module0229.f15259();
        }
        else {
            var275 = module0050.f3532(var275);
            if (NIL != module0050.f3521(var275)) {
                return module0202.f12787(module0049.f3515(module0035.f1973((SubLObject)ONE_INTEGER, module0050.f3531(var275))), (SubLObject)UNPROVIDED);
            }
            module0229.f15259();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37343(SubLObject var279) {
        if (var279 == UNPROVIDED) {
            var279 = Symbols.symbol_function((SubLObject)$ic155$);
        }
        final SubLObject var280 = module0067.f4880((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var282;
        final SubLObject var281 = var282 = module0409.f28506((SubLObject)$ic156$, $ic157$, (SubLObject)$ic158$);
        SubLObject var283 = (SubLObject)NIL;
        var283 = var282.first();
        while (NIL != var282) {
            SubLObject var285;
            final SubLObject var284 = var285 = var283;
            SubLObject var286 = (SubLObject)NIL;
            SubLObject var287 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var285, var284, (SubLObject)$ic159$);
            var286 = var285.first();
            var285 = var285.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var285, var284, (SubLObject)$ic159$);
            var287 = var285.first();
            var285 = var285.rest();
            if (NIL == var285) {
                if (NIL == Functions.funcall(var279, var286) && NIL == Functions.funcall(var279, var287)) {
                    module0079.f5438(var280, var286, var287);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var284, (SubLObject)$ic159$);
            }
            var282 = var282.rest();
            var283 = var282.first();
        }
        return var280;
    }
    
    public static SubLObject f37344() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37195", "S#40990", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37196", "S#40991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37197", "S#40992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37198", "S#36039", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37199", "S#36038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37200", "S#40993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37201", "S#40994", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37202", "S#40995", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37203", "S#32661", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37205", "S#40996", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37206", "S#32662", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37207", "S#36029", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37209", "S#40997", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37204", "S#40998", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37208", "S#40999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37212", "S#25959", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37213", "S#41000", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37214", "S#41001", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37210", "S#41002", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37211", "S#41003", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37215", "S#41004", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37216", "S#41005", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37217", "S#41006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37219", "S#41007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37218", "S#41008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37221", "S#41009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37223", "S#41010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37225", "S#41011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37222", "S#41012", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37228", "S#41013", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37224", "S#41014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37229", "S#41015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37226", "S#41016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37227", "S#41017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37230", "S#41018", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37232", "S#36030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37233", "CYC-INTEGER-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37234", "CYC-NUMBER-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37235", "S#40980", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37236", "S#41019", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37237", "S#40981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37238", "CYC-QUANTITY-CONVERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37239", "CYC-QUANTITY-CONVERSION-ABSOLUTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37220", "S#17516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37240", "S#40982", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37241", "S#41020", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37242", "S#41021", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37231", "CYC-QUOTIENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37243", "CYC-INVERSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37244", "CYC-MODULO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37245", "CYC-RESIDUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37247", "S#41022", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37246", "S#41023", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37248", "CYC-ABSOLUTE-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37249", "CYC-SQRT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37250", "CYC-SQUARED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37251", "CYC-PERCENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37252", "CYC-ROUND-UP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37254", "CYC-ROUND-CLOSEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37255", "CYC-ROUND-DOWN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37256", "CYC-ROUND-TRUNCATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37253", "S#41024", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37257", "CYC-ROUND-CLOSEST-TO-NTH-DECIMAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37258", "S#41025", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37259", "CYC-MAX-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37260", "S#41026", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37261", "CYC-MIN-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37262", "S#41027", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37263", "CYC-MIN-QUANT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37264", "CYC-MAX-QUANT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37265", "CYC-TOLERANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37266", "S#41028", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37267", "CYC-SIGNIFICANT-DIGITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37268", "CYC-SINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37270", "CYC-COSINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37271", "CYC-TANGENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37272", "CYC-COSECANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37273", "CYC-SECANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37274", "CYC-COTANGENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37269", "S#41029", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37275", "CYC-ARC-SINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37277", "CYC-ARC-COSINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37278", "CYC-ARC-TANGENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37279", "CYC-ARC-COSECANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37280", "CYC-ARC-SECANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37281", "CYC-ARC-COTANGENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37276", "S#41030", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37282", "CYC-LOGARITHM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37283", "CYC-EXPONENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37284", "CYC-QUADRATIC-SOLUTION-POSITIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37285", "CYC-QUADRATIC-SOLUTION-NEGATIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37286", "CYC-COLLECTION-SUBSUMPTION-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37288", "CYC-PREDICATE-SUBSUMPTION-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37289", "S#40983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37290", "S#41031", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37291", "S#40984", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37292", "CYC-QUANTITY-SUBSUMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37293", "S#41032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37294", "CYC-QUANTITY-INTERSECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37295", "CYC-LIST-NTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37296", "CYC-LIST-CONCATENATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37297", "CYC-LIST-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37298", "CYC-LIST-SECOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37299", "CYC-LIST-REST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37300", "CYC-LIST-LAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37301", "CYC-LIST-SUBSEQ", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37302", "CYC-LIST-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37303", "CYC-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37304", "CYC-LIST-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37305", "CYC-LIST-REVERSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37306", "CYC-LIST-MEMBER-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37307", "CYC-SET-ELEMENT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37308", "CYC-SUBSTITUTE-FROM-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37309", "S#41033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37310", "CYC-MAP-FUNCTION-OVER-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37311", "S#41034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37312", "CYC-MAP-FUNCTION-OVER-LIST-UNTIL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37313", "S#41035", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37314", "CYC-MAP-FUNCTION-OVER-LIST-UNTIL-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37315", "S#41036", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37316", "CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37317", "S#41037", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37318", "CYC-APPLY-FUNCTION-RECURSIVELY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37319", "CYC-LIST-MEMBER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37320", "S#41038", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37321", "CYC-SUBLIST?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37322", "CYC-INITIAL-SUBLIST?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37323", "S#41039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37324", "S#41040", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37325", "S#41041", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37326", "S#41042", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37327", "S#41043", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37328", "S#41044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37287", "S#35509", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37329", "S#16040", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37330", "CYC-SET-INTERSECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37331", "CYC-SET-UNION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37332", "CYC-SET-DIFFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37333", "CYC-SET-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37334", "CYC-MAP-FUNCTION-OVER-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37335", "CYC-LEAST-COMMON-MULTIPLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37336", "S#41045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37338", "CYC-GREATEST-COMMON-DIVISOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37339", "S#41046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37337", "S#41047", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37340", "CYC-RANDOM-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37341", "CYC-N-RANDOM-INTEGERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37342", "CYC-MATRIX-SOLUTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0610", "f37343", "GET-INTERCONVERTIBLE-UNITS-OF-MEASURE", 0, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37345() {
        $g4702$ = SubLFiles.defparameter("S#41048", (SubLObject)NIL);
        $g4703$ = SubLFiles.deflexical("S#41049", (SubLObject)$ic0$);
        $g4704$ = SubLFiles.defparameter("S#41050", (SubLObject)NIL);
        $g4705$ = SubLFiles.defparameter("S#41051", (SubLObject)NIL);
        $g4706$ = SubLFiles.defparameter("S#41052", (SubLObject)NIL);
        $g4707$ = SubLFiles.deflexical("S#41053", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f37346() {
        module0034.f1909((SubLObject)$ic11$);
        if ($ic24$.isSymbol()) {
            final SubLObject var55 = (SubLObject)$ic24$;
            if (NIL == conses_high.member(var55, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var55, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic24$);
        if ($ic27$.isSymbol()) {
            final SubLObject var55 = (SubLObject)$ic27$;
            if (NIL == conses_high.member(var55, module0144.$g1862$.getDynamicValue(), Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                module0144.$g1862$.setDynamicValue((SubLObject)ConsesLow.cons(var55, module0144.$g1862$.getDynamicValue()));
            }
        }
        module0012.f416((SubLObject)$ic27$);
        module0012.f416((SubLObject)$ic35$);
        module0012.f416((SubLObject)$ic36$);
        module0012.f416((SubLObject)$ic40$);
        module0012.f416((SubLObject)$ic41$);
        module0012.f416((SubLObject)$ic42$);
        module0012.f416((SubLObject)$ic43$);
        module0012.f416((SubLObject)$ic47$);
        module0012.f416((SubLObject)$ic48$);
        module0012.f416((SubLObject)$ic49$);
        module0012.f416((SubLObject)$ic52$);
        module0012.f416((SubLObject)$ic54$);
        module0012.f416((SubLObject)$ic56$);
        module0012.f416((SubLObject)$ic58$);
        module0012.f416((SubLObject)$ic60$);
        module0012.f416((SubLObject)$ic61$);
        module0012.f416((SubLObject)$ic65$);
        module0012.f416((SubLObject)$ic67$);
        module0012.f416((SubLObject)$ic68$);
        module0012.f416((SubLObject)$ic69$);
        module0012.f416((SubLObject)$ic70$);
        module0012.f416((SubLObject)$ic71$);
        module0012.f416((SubLObject)$ic73$);
        module0012.f416((SubLObject)$ic75$);
        module0012.f416((SubLObject)$ic77$);
        module0012.f416((SubLObject)$ic78$);
        module0012.f416((SubLObject)$ic79$);
        module0012.f416((SubLObject)$ic80$);
        module0012.f416((SubLObject)$ic83$);
        module0012.f416((SubLObject)$ic85$);
        module0012.f416((SubLObject)$ic87$);
        module0012.f416((SubLObject)$ic88$);
        module0012.f416((SubLObject)$ic89$);
        module0012.f416((SubLObject)$ic90$);
        module0012.f416((SubLObject)$ic93$);
        module0012.f416((SubLObject)$ic94$);
        module0012.f416((SubLObject)$ic95$);
        module0012.f416((SubLObject)$ic96$);
        module0012.f416((SubLObject)$ic99$);
        module0012.f416((SubLObject)$ic100$);
        module0012.f416((SubLObject)$ic104$);
        module0012.f416((SubLObject)$ic105$);
        module0012.f416((SubLObject)$ic106$);
        module0012.f416((SubLObject)$ic110$);
        module0012.f416((SubLObject)$ic111$);
        module0012.f416((SubLObject)$ic112$);
        module0012.f416((SubLObject)$ic113$);
        module0012.f416((SubLObject)$ic114$);
        module0012.f416((SubLObject)$ic115$);
        module0012.f416((SubLObject)$ic116$);
        module0012.f416((SubLObject)$ic117$);
        module0012.f416((SubLObject)$ic118$);
        module0012.f416((SubLObject)$ic119$);
        module0012.f416((SubLObject)$ic121$);
        module0012.f416((SubLObject)$ic122$);
        module0012.f416((SubLObject)$ic125$);
        module0012.f416((SubLObject)$ic127$);
        module0012.f416((SubLObject)$ic128$);
        module0012.f416((SubLObject)$ic129$);
        module0012.f416((SubLObject)$ic130$);
        module0012.f416((SubLObject)$ic132$);
        module0012.f416((SubLObject)$ic133$);
        module0002.f35((SubLObject)$ic134$, (SubLObject)$ic135$);
        module0012.f416((SubLObject)$ic136$);
        module0012.f416((SubLObject)$ic137$);
        module0012.f416((SubLObject)$ic140$);
        module0012.f416((SubLObject)$ic141$);
        module0012.f416((SubLObject)$ic142$);
        module0012.f416((SubLObject)$ic144$);
        module0012.f416((SubLObject)$ic145$);
        module0012.f416((SubLObject)$ic147$);
        module0012.f416((SubLObject)$ic149$);
        module0012.f416((SubLObject)$ic150$);
        module0012.f416((SubLObject)$ic152$);
        module0012.f416((SubLObject)$ic153$);
        module0002.f38((SubLObject)$ic154$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f37344();
    }
    
    public void initializeVariables() {
        f37345();
    }
    
    public void runTopLevelForms() {
        f37346();
    }
    
    static {
        me = (SubLFile)new module0610();
        $g4702$ = null;
        $g4703$ = null;
        $g4704$ = null;
        $g4705$ = null;
        $g4706$ = null;
        $g4707$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { constant_handles_oc.f8479((SubLObject)makeString("IntervalMinFn")), constant_handles_oc.f8479((SubLObject)makeString("IntervalMaxFn")), constant_handles_oc.f8479((SubLObject)makeString("Unity")), constant_handles_oc.f8479((SubLObject)makeString("UnitOfMeasure")), constant_handles_oc.f8479((SubLObject)makeString("maxQuantValue")), constant_handles_oc.f8479((SubLObject)makeString("minQuantValue")), constant_handles_oc.f8479((SubLObject)makeString("unitMultiplicationFactor")), constant_handles_oc.f8479((SubLObject)makeString("multiplicationUnits")), constant_handles_oc.f8479((SubLObject)makeString("PerFn")), constant_handles_oc.f8479((SubLObject)makeString("TheSet")), constant_handles_oc.f8479((SubLObject)makeString("TheSetOf")), constant_handles_oc.f8479((SubLObject)makeString("thereExistAtLeast")), constant_handles_oc.f8479((SubLObject)makeString("thereExistAtMost")), constant_handles_oc.f8479((SubLObject)makeString("thereExistExactly")) });
        $ic1$ = makeSymbol("VALID-CONSTANT?");
        $ic2$ = constant_handles_oc.f8479((SubLObject)makeString("ScalarInterval"));
        $ic3$ = makeSymbol("S#40991", "CYC");
        $ic4$ = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
        $ic5$ = constant_handles_oc.f8479((SubLObject)makeString("Unity"));
        $ic6$ = makeSymbol("FORT-P");
        $ic7$ = constant_handles_oc.f8479((SubLObject)makeString("maxQuantValue"));
        $ic8$ = constant_handles_oc.f8479((SubLObject)makeString("minQuantValue"));
        $ic9$ = constant_handles_oc.f8479((SubLObject)makeString("unitAbsoluteScaleOffset"));
        $ic10$ = makeKeyword("GAF");
        $ic11$ = makeSymbol("S#41002", "CYC");
        $ic12$ = makeSymbol("S#41053", "CYC");
        $ic13$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic14$ = ConsesLow.list((SubLObject)makeSymbol("S#41054", "CYC"), (SubLObject)makeSymbol("S#41055", "CYC"), (SubLObject)makeSymbol("S#41056", "CYC"));
        $ic15$ = makeSymbol("CAR");
        $ic16$ = constant_handles_oc.f8479((SubLObject)makeString("unitMultiplicationFactor"));
        $ic17$ = makeString("Link not found!");
        $ic18$ = ConsesLow.list((SubLObject)makeSymbol("IGNORE"), (SubLObject)makeSymbol("S#41057", "CYC"), (SubLObject)makeSymbol("S#41058", "CYC"));
        $ic19$ = makeString("No previous unit.");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("multiplicationUnits"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("PerFn"));
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#41059", "CYC"), (SubLObject)makeSymbol("S#41060", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#41061", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#41062", "CYC"), (SubLObject)makeSymbol("MIN2"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("MAX2"));
        $ic24$ = makeSymbol("CYC-INTEGER-RANGE");
        $ic25$ = constant_handles_oc.f8479((SubLObject)makeString("integerRange"));
        $ic26$ = constant_handles_oc.f8479((SubLObject)makeString("quantitySubsumes"));
        $ic27$ = makeSymbol("CYC-NUMBER-RANGE");
        $ic28$ = constant_handles_oc.f8479((SubLObject)makeString("numberRange"));
        $ic29$ = makeSymbol("S#38", "CYC");
        $ic30$ = makeKeyword("UNEVALUATABLE");
        $ic31$ = makeSymbol("S#5859", "CYC");
        $ic32$ = makeSymbol("S#41021", "CYC");
        $ic33$ = constant_handles_oc.f8479((SubLObject)makeString("PlusFn"));
        $ic34$ = constant_handles_oc.f8479((SubLObject)makeString("IntervalOnNumberLine"));
        $ic35$ = makeSymbol("CYC-QUANTITY-CONVERSION");
        $ic36$ = makeSymbol("CYC-QUANTITY-CONVERSION-ABSOLUTE");
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("TimesFn"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("IntegerExtent"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("ScalarPointValue"));
        $ic40$ = makeSymbol("CYC-QUOTIENT");
        $ic41$ = makeSymbol("CYC-INVERSE");
        $ic42$ = makeSymbol("CYC-MODULO");
        $ic43$ = makeSymbol("CYC-RESIDUE");
        $ic44$ = constant_handles_oc.f8479((SubLObject)makeString("quantityCongruenceBase"));
        $ic45$ = makeKeyword("TRUE");
        $ic46$ = constant_handles_oc.f8479((SubLObject)makeString("MeasurableQuantityType"));
        $ic47$ = makeSymbol("CYC-ABSOLUTE-VALUE");
        $ic48$ = makeSymbol("CYC-SQRT");
        $ic49$ = makeSymbol("CYC-SQUARED");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("MIN"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("MAX"), (SubLObject)makeSymbol("MIN")));
        $ic51$ = makeInteger(100);
        $ic52$ = makeSymbol("CYC-PERCENT");
        $ic53$ = makeSymbol("CEILING");
        $ic54$ = makeSymbol("CYC-ROUND-UP");
        $ic55$ = makeSymbol("ROUND");
        $ic56$ = makeSymbol("CYC-ROUND-CLOSEST");
        $ic57$ = makeSymbol("FLOOR");
        $ic58$ = makeSymbol("CYC-ROUND-DOWN");
        $ic59$ = makeSymbol("TRUNCATE");
        $ic60$ = makeSymbol("CYC-ROUND-TRUNCATE");
        $ic61$ = makeSymbol("CYC-ROUND-CLOSEST-TO-NTH-DECIMAL");
        $ic62$ = makeSymbol("NUMBERP");
        $ic63$ = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic64$ = makeSymbol("S#41026", "CYC");
        $ic65$ = makeSymbol("CYC-MAX-RANGE");
        $ic66$ = makeSymbol("S#41027", "CYC");
        $ic67$ = makeSymbol("CYC-MIN-RANGE");
        $ic68$ = makeSymbol("CYC-MIN-QUANT-VALUE");
        $ic69$ = makeSymbol("CYC-MAX-QUANT-VALUE");
        $ic70$ = makeSymbol("CYC-TOLERANCE");
        $ic71$ = makeSymbol("CYC-SIGNIFICANT-DIGITS");
        $ic72$ = makeSymbol("SIN");
        $ic73$ = makeSymbol("CYC-SINE");
        $ic74$ = makeSymbol("COS");
        $ic75$ = makeSymbol("CYC-COSINE");
        $ic76$ = makeSymbol("TAN");
        $ic77$ = makeSymbol("CYC-TANGENT");
        $ic78$ = makeSymbol("CYC-COSECANT");
        $ic79$ = makeSymbol("CYC-SECANT");
        $ic80$ = makeSymbol("CYC-COTANGENT");
        $ic81$ = constant_handles_oc.f8479((SubLObject)makeString("Radian"));
        $ic82$ = makeSymbol("ASIN");
        $ic83$ = makeSymbol("CYC-ARC-SINE");
        $ic84$ = makeSymbol("ACOS");
        $ic85$ = makeSymbol("CYC-ARC-COSINE");
        $ic86$ = makeSymbol("ATAN");
        $ic87$ = makeSymbol("CYC-ARC-TANGENT");
        $ic88$ = makeSymbol("CYC-ARC-COSECANT");
        $ic89$ = makeSymbol("CYC-ARC-SECANT");
        $ic90$ = makeSymbol("CYC-ARC-COTANGENT");
        $ic91$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic92$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic93$ = makeSymbol("CYC-LOGARITHM");
        $ic94$ = makeSymbol("CYC-EXPONENT");
        $ic95$ = makeSymbol("CYC-QUADRATIC-SOLUTION-POSITIVE");
        $ic96$ = makeSymbol("CYC-QUADRATIC-SOLUTION-NEGATIVE");
        $ic97$ = makeKeyword("HL");
        $ic98$ = makeSymbol("S#15686", "CYC");
        $ic99$ = makeSymbol("CYC-COLLECTION-SUBSUMPTION-PATHS");
        $ic100$ = makeSymbol("CYC-PREDICATE-SUBSUMPTION-PATHS");
        $ic101$ = constant_handles_oc.f8479((SubLObject)makeString("greaterThan"));
        $ic102$ = constant_handles_oc.f8479((SubLObject)makeString("followingValue"));
        $ic103$ = constant_handles_oc.f8479((SubLObject)makeString("greaterThanOrEqualTo"));
        $ic104$ = makeSymbol("CYC-QUANTITY-SUBSUMES");
        $ic105$ = makeSymbol("CYC-QUANTITY-INTERSECTS");
        $ic106$ = makeSymbol("CYC-LIST-NTH");
        $ic107$ = makeSymbol("S#15600", "CYC");
        $ic108$ = makeSymbol("APPEND");
        $ic109$ = makeSymbol("S#15664", "CYC");
        $ic110$ = makeSymbol("CYC-LIST-CONCATENATE");
        $ic111$ = makeSymbol("CYC-LIST-FIRST");
        $ic112$ = makeSymbol("CYC-LIST-SECOND");
        $ic113$ = makeSymbol("CYC-LIST-REST");
        $ic114$ = makeSymbol("CYC-LIST-LAST");
        $ic115$ = makeSymbol("CYC-LIST-SUBSEQ");
        $ic116$ = makeSymbol("CYC-LIST-SEARCH");
        $ic117$ = makeSymbol("CYC-POSITION");
        $ic118$ = makeSymbol("CYC-LIST-LENGTH");
        $ic119$ = makeSymbol("CYC-LIST-REVERSE");
        $ic120$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic121$ = makeSymbol("CYC-LIST-MEMBER-SET");
        $ic122$ = makeSymbol("CYC-SET-ELEMENT-LIST");
        $ic123$ = makeSymbol("DOUBLETON?");
        $ic124$ = makeSymbol("S#41033", "CYC");
        $ic125$ = makeSymbol("CYC-SUBSTITUTE-FROM-LIST");
        $ic126$ = ConsesLow.list((SubLObject)makeSymbol("S#173", "CYC"), (SubLObject)makeSymbol("S#174", "CYC"));
        $ic127$ = makeSymbol("CYC-MAP-FUNCTION-OVER-LIST");
        $ic128$ = makeSymbol("CYC-MAP-FUNCTION-OVER-LIST-UNTIL");
        $ic129$ = makeSymbol("CYC-MAP-FUNCTION-OVER-LIST-UNTIL-RESULT");
        $ic130$ = makeSymbol("CYC-MAP-FUNCTION-WITH-ARGS-OVER-LISTS");
        $ic131$ = makeSymbol("MAX");
        $ic132$ = makeSymbol("CYC-APPLY-FUNCTION-RECURSIVELY");
        $ic133$ = makeSymbol("CYC-LIST-MEMBER?");
        $ic134$ = makeSymbol("S#41038", "CYC");
        $ic135$ = ConsesLow.list((SubLObject)makeSymbol("CYC-LIST-MEMBER?"));
        $ic136$ = makeSymbol("CYC-SUBLIST?");
        $ic137$ = makeSymbol("CYC-INITIAL-SUBLIST?");
        $ic138$ = makeKeyword("EL");
        $ic139$ = makeString("Don't know how to determine the extent of ~S in ~S");
        $ic140$ = makeSymbol("CYC-SET-INTERSECTION");
        $ic141$ = makeSymbol("CYC-SET-UNION");
        $ic142$ = makeSymbol("CYC-SET-DIFFERENCE");
        $ic143$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptySet"));
        $ic144$ = makeSymbol("CYC-SET-EXTENT");
        $ic145$ = makeSymbol("CYC-MAP-FUNCTION-OVER-SET");
        $ic146$ = makeSymbol("S#41045", "CYC");
        $ic147$ = makeSymbol("CYC-LEAST-COMMON-MULTIPLE");
        $ic148$ = makeSymbol("S#41046", "CYC");
        $ic149$ = makeSymbol("CYC-GREATEST-COMMON-DIVISOR");
        $ic150$ = makeSymbol("CYC-RANDOM-INTEGER");
        $ic151$ = makeSymbol("S#40988", "CYC");
        $ic152$ = makeSymbol("CYC-N-RANDOM-INTEGERS");
        $ic153$ = makeSymbol("CYC-MATRIX-SOLUTION");
        $ic154$ = makeSymbol("GET-INTERCONVERTIBLE-UNITS-OF-MEASURE");
        $ic155$ = makeSymbol("FALSE");
        $ic156$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("and")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?U"), constant_handles_oc.f8479((SubLObject)makeString("UnitOfMeasureNoPrefix"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?UT"), constant_handles_oc.f8479((SubLObject)makeString("InterconvertibleUnitType"))), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeSymbol("?U"), (SubLObject)makeSymbol("?UT")));
        $ic157$ = constant_handles_oc.f8479((SubLObject)makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $ic158$ = ConsesLow.list(new SubLObject[] { makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), ConsesLow.list((SubLObject)makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("?UT"), (SubLObject)makeSymbol("?U"))) });
        $ic159$ = ConsesLow.list((SubLObject)makeSymbol("S#41063", "CYC"), (SubLObject)makeSymbol("S#22109", "CYC"));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 874 ms
	
	Decompiled with Procyon 0.5.32.
*/