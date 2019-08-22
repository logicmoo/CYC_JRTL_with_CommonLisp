package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0206 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0206";
    public static final String myFingerPrint = "8cfb8d9eab87ae3f327589a3c434564da7f33fea07cc6ce2c30cba62d23aaf4a";
    public static SubLSymbol $g2323$;
    public static SubLSymbol $g2324$;
    public static SubLSymbol $g2325$;
    public static SubLSymbol $g2326$;
    public static SubLSymbol $g2327$;
    private static SubLSymbol $g2328$;
    private static SubLSymbol $g2329$;
    public static SubLSymbol $g2330$;
    private static final SubLSymbol $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLList $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLList $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLList $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLObject $ic18$;
    private static final SubLObject $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLList $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLString $ic56$;
    private static final SubLString $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    
    public static SubLObject f13410() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2323$.getDynamicValue(var1);
    }
    
    public static SubLObject f13411() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2325$.getDynamicValue(var1);
    }
    
    public static SubLObject f13412() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2327$.getDynamicValue(var1);
    }
    
    public static SubLObject f13413() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2328$.getDynamicValue(var1);
    }
    
    public static SubLObject f13414() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != $g2324$.getDynamicValue(var1) && NIL != module0018.f971());
    }
    
    public static SubLObject f13415() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return $g2330$.getDynamicValue(var1);
    }
    
    public static SubLObject f13416(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic1$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f13417(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic2$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f13418(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic3$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f13419(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic4$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f13420(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic5$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f13421(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic6$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f13422(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic7$);
        var6 = var5.first();
        var5 = var5.rest();
        if (NIL == var5) {
            return (SubLObject)ConsesLow.list((SubLObject)$ic8$, (SubLObject)$ic9$, (SubLObject)ConsesLow.list((SubLObject)$ic10$, var6));
        }
        cdestructuring_bind.cdestructuring_bind_error(var4, (SubLObject)$ic7$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13423(final SubLObject var2, final SubLObject var3) {
        final SubLObject var4 = var2.rest();
        final SubLObject var6;
        final SubLObject var5 = var6 = var4;
        return (SubLObject)ConsesLow.listS((SubLObject)$ic0$, (SubLObject)$ic11$, ConsesLow.append(var6, (SubLObject)NIL));
    }
    
    public static SubLObject f13424(final SubLObject var2, final SubLObject var3) {
        SubLObject var5;
        final SubLObject var4 = var5 = var2.rest();
        SubLObject var6 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var5, var4, (SubLObject)$ic12$);
        var6 = var5.first();
        final SubLObject var7;
        var5 = (var7 = var5.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic13$, (SubLObject)ConsesLow.listS((SubLObject)EQL, var6, (SubLObject)$ic14$), reader.bq_cons((SubLObject)$ic15$, ConsesLow.append(var7, (SubLObject)NIL)), ConsesLow.append(var7, (SubLObject)NIL));
    }
    
    public static SubLObject f13425(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        var27 = (SubLObject)makeBoolean(NIL != f13426(var25) || NIL != f13427(var25));
        if (NIL == var27 && NIL == module0152.$g2129$.getDynamicValue(var26)) {
            if (NIL != module0202.f12590(var25)) {
                if (NIL != module0274.f18149()) {
                    module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic16$, f13428(var25)));
                }
            }
            else if (NIL != module0274.f18149()) {
                module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic17$, var25));
            }
        }
        return var27;
    }
    
    public static SubLObject f13426(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            return (SubLObject)makeBoolean(NIL != f13429(var25) || NIL != f13430(var25) || NIL != f13431(var25) || NIL != f13432(var25) || NIL != f13433(var25) || NIL != f13434(var25) || NIL != f13435(var25) || NIL != f13436(var25) || NIL != f13437(var25));
        }
        return (SubLObject)makeBoolean((NIL != f13410() && NIL != module0552.f34013(var25)) || NIL != f13438(var25));
    }
    
    public static SubLObject f13439(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12646(var25) || NIL != f13438(var25) || (NIL != f13425(module0202.f12741(var25)) && NIL != f13439(module0202.f12742(var25))));
    }
    
    public static SubLObject f13427(final SubLObject var25) {
        return (SubLObject)makeBoolean($ic18$.eql(var25) || $ic19$.eql(var25));
    }
    
    public static SubLObject f13428(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        final SubLObject var27 = module0205.f13132(var25);
        if (NIL != $g2330$.getDynamicValue(var26) && NIL != module0202.f12590(var25) && $ic20$.eql(module0205.f13132(var27))) {
            return module0205.f13203(var27, (SubLObject)UNPROVIDED);
        }
        return var27;
    }
    
    public static SubLObject f13429(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13429(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != module0202.f12611(f13428(var25))) {
                if (module0202.f12725(var25, (SubLObject)UNPROVIDED).numE((SubLObject)ONE_INTEGER)) {
                    return f13425(module0205.f13203(var25, (SubLObject)UNPROVIDED));
                }
                if (NIL != module0274.f18149()) {
                    module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, f13428(var25), (SubLObject)$ic22$, (SubLObject)ONE_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13430(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13430(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != module0202.f12612(f13428(var25))) {
                if (module0202.f12725(var25, (SubLObject)UNPROVIDED).numE((SubLObject)TWO_INTEGER)) {
                    return (SubLObject)makeBoolean(NIL != f13425(module0205.f13203(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13204(var25, (SubLObject)UNPROVIDED)));
                }
                if (NIL != module0274.f18149()) {
                    module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, f13428(var25), (SubLObject)$ic23$, (SubLObject)TWO_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13434(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13434(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != module0202.f12613(f13428(var25))) {
                if (module0202.f12725(var25, (SubLObject)UNPROVIDED).numE((SubLObject)THREE_INTEGER)) {
                    return (SubLObject)makeBoolean(NIL != f13425(module0205.f13203(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13204(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13205(var25, (SubLObject)UNPROVIDED)));
                }
                if (NIL != module0274.f18149()) {
                    module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, f13428(var25), (SubLObject)$ic24$, (SubLObject)THREE_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13435(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13435(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != module0202.f12614(f13428(var25))) {
                if (module0202.f12725(var25, (SubLObject)UNPROVIDED).numE((SubLObject)FOUR_INTEGER)) {
                    return (SubLObject)makeBoolean(NIL != f13425(module0205.f13203(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13204(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13205(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13345(var25, (SubLObject)UNPROVIDED)));
                }
                if (NIL != module0274.f18149()) {
                    module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, f13428(var25), (SubLObject)$ic25$, (SubLObject)FOUR_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13436(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13436(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != module0202.f12615(f13428(var25))) {
                if (module0202.f12725(var25, (SubLObject)UNPROVIDED).numE((SubLObject)FIVE_INTEGER)) {
                    return (SubLObject)makeBoolean(NIL != f13425(module0205.f13203(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13204(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13205(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13345(var25, (SubLObject)UNPROVIDED)) && NIL != f13425(module0205.f13346(var25, (SubLObject)UNPROVIDED)));
                }
                if (NIL != module0274.f18149()) {
                    module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, f13428(var25), (SubLObject)$ic26$, (SubLObject)FIVE_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13432(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13432(module0205.f13143(var25));
        }
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var25) && NIL != module0202.f12616(f13428(var25)) && NIL != module0202.f12933(var25) && NIL != f13439(module0205.f13207(var25, (SubLObject)$ic27$)));
    }
    
    public static SubLObject f13437(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13437(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != module0202.f12629(f13428(var25))) {
                return f13439(module0205.f13207(var25, (SubLObject)$ic27$));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13440(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13440(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != f13441(f13428(var25))) {
                if (!module0202.f12725(var25, (SubLObject)UNPROVIDED).numE((SubLObject)TWO_INTEGER)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, f13428(var25), (SubLObject)$ic28$, (SubLObject)TWO_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else {
                    if (NIL != f13438(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                        return f13425(module0205.f13204(var25, (SubLObject)UNPROVIDED));
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic29$, module0205.f13203(var25, (SubLObject)UNPROVIDED)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13442(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13442(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != f13443(f13428(var25))) {
                if (!module0202.f12725(var25, (SubLObject)UNPROVIDED).numE((SubLObject)THREE_INTEGER)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, f13428(var25), (SubLObject)$ic30$, (SubLObject)THREE_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else if (NIL == f13444(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic31$, module0205.f13203(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else {
                    if (NIL != f13438(module0205.f13204(var25, (SubLObject)UNPROVIDED))) {
                        return f13425(module0205.f13205(var25, (SubLObject)UNPROVIDED));
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic29$, module0205.f13204(var25, (SubLObject)UNPROVIDED)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13445(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12628(var25) || NIL != module0202.f12629(var25));
    }
    
    public static SubLObject f13446(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12626(var25) || NIL != module0202.f12622(var25));
    }
    
    public static SubLObject f13441(final SubLObject var25) {
        return module0202.f12619(var25);
    }
    
    public static SubLObject f13443(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12621(var25) || NIL != module0202.f12622(var25));
    }
    
    public static SubLObject f13433(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13433(module0205.f13143(var25));
        }
        if (NIL != module0202.f12590(var25)) {
            if (NIL != f13447(f13428(var25))) {
                if (NIL == module0202.f12933(var25)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic32$, var25, module0202.f12708(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else if (NIL == f13448(module0205.f13207(var25, (SubLObject)$ic27$))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic34$, f13428(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else if (NIL != f13449(var25)) {
                    return (SubLObject)T;
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13448(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12646(var25) || NIL != f13438(var25) || (NIL != f13450(module0202.f12741(var25)) && NIL != f13448(module0202.f12742(var25))));
    }
    
    public static SubLObject f13447(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13451(var25) && NIL == module0202.f12628(var25) && NIL == module0202.f12626(var25) && (NIL == f13414() || NIL != module0202.f12921(var25, (SubLObject)$ic35$)));
    }
    
    public static SubLObject f13452(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13451(var25) && NIL == module0202.f12628(var25) && NIL == module0202.f12626(var25) && (NIL == f13414() || NIL != module0202.f12922(var25, (SubLObject)$ic35$)));
    }
    
    public static SubLObject f13453(final SubLObject var25) {
        if (NIL != f13410() && NIL != module0167.f10813(var25)) {
            return (SubLObject)T;
        }
        if (NIL != module0202.f12590(var25)) {
            if (!$ic36$.eql(module0205.f13132(var25)) && !$ic37$.eql(module0205.f13132(var25))) {
                if (!$ic20$.eql(module0205.f13132(var25))) {
                    if ($ic38$.eql(module0205.f13132(var25))) {
                        return f13454(var25);
                    }
                    if ($ic39$.eql(module0205.f13132(var25))) {
                        return f13455(var25);
                    }
                    if ($ic40$.eql(module0205.f13132(var25))) {
                        return f13456(var25);
                    }
                    if ($ic41$.eql(module0205.f13132(var25))) {
                        return f13457(var25);
                    }
                    if ($ic42$.eql(module0205.f13132(var25))) {
                        return f13458(var25);
                    }
                    if ($ic43$.eql(module0205.f13132(var25))) {
                        return f13459(var25);
                    }
                    if (NIL != f13452(module0205.f13132(var25))) {
                        if (NIL == module0202.f12933(var25)) {
                            if (NIL != module0274.f18149()) {
                                module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic32$, var25, module0202.f12708(var25, (SubLObject)UNPROVIDED)));
                            }
                        }
                        else if (NIL == f13448(module0205.f13207(var25, (SubLObject)$ic27$))) {
                            if (NIL != module0274.f18149()) {
                                module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic44$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                            }
                        }
                        else if (NIL != f13449(var25)) {
                            return (SubLObject)T;
                        }
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13449(final SubLObject var28) {
        SubLObject var29 = (SubLObject)T;
        if (NIL != f13414() && NIL != module0274.f18126(var28)) {
            var29 = (SubLObject)NIL;
        }
        return var29;
    }
    
    public static SubLObject f13454(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic38$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic45$, (SubLObject)TWO_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else if (NIL == f13460(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else {
                    if (NIL != f13461(module0205.f13204(var25, (SubLObject)UNPROVIDED))) {
                        return f13462(var25);
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13462(final SubLObject var30) {
        final SubLObject var31 = module0205.f13387(var30, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0205.f13388(var30, (SubLObject)UNPROVIDED);
        final SubLObject var33 = Sequences.remove_if((SubLObject)$ic47$, var31, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var34 = (SubLObject)T;
        SubLObject var35 = (SubLObject)NIL;
        if (NIL == var33) {
            return (SubLObject)T;
        }
        if (var33.equal((SubLObject)$ic48$)) {
            return (SubLObject)T;
        }
        SubLObject var36 = var33;
        SubLObject var37 = (SubLObject)NIL;
        var37 = var36.first();
        while (NIL != var36) {
            if (NIL == module0035.f2428(var37, var32, (SubLObject)EQUAL, (SubLObject)UNPROVIDED)) {
                var35 = (SubLObject)ConsesLow.cons(var37, var35);
                var34 = (SubLObject)NIL;
            }
            var36 = var36.rest();
            var37 = var36.first();
        }
        if (NIL != var35 && NIL != module0274.f18149()) {
            module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic49$, var30, var35, module0205.f13204(var30, (SubLObject)UNPROVIDED)));
        }
        return var34;
    }
    
    public static SubLObject f13455(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic39$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic50$, (SubLObject)ONE_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else {
                    if (NIL != f13461(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13456(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic40$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic51$, (SubLObject)TWO_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else if (NIL == f13463(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else {
                    if (NIL != f13425(module0205.f13204(var25, (SubLObject)UNPROVIDED))) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13457(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic41$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic52$, (SubLObject)TWO_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else if (NIL == f13463(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else {
                    if (NIL != f13444(module0205.f13204(var25, (SubLObject)UNPROVIDED))) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13458(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic42$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic53$, (SubLObject)THREE_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else if (NIL == f13463(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else if (NIL == f13438(module0205.f13204(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else {
                    if (NIL == module0205.f13205(var25, (SubLObject)UNPROVIDED) || NIL != f13438(module0205.f13205(var25, (SubLObject)UNPROVIDED))) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13459(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic43$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)FOUR_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic54$, (SubLObject)FOUR_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else if (NIL == f13463(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else if (NIL == f13438(module0205.f13204(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else if (NIL != module0205.f13205(var25, (SubLObject)UNPROVIDED) && NIL == f13438(module0205.f13205(var25, (SubLObject)UNPROVIDED))) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
                else {
                    if (NIL != f13444(module0205.f13345(var25, (SubLObject)UNPROVIDED))) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13463(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12646(var25) || (NIL != f13438(module0202.f12741(var25)) && NIL != f13463(module0202.f12742(var25))));
    }
    
    public static SubLObject f13460(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12646(var25) || (NIL != module0202.f12687(var25) && NIL != f13450(module0202.f12741(var25)) && NIL != f13460(module0202.f12742(var25))));
    }
    
    public static SubLObject f13461(final SubLObject var25) {
        return (SubLObject)T;
    }
    
    public static SubLObject f13464(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13444(var25) || (NIL != f13415() && NIL != f13465(var25)) || NIL != f13425(var25));
    }
    
    public static SubLObject f13450(final SubLObject var25) {
        return f13464(var25);
    }
    
    public static SubLObject f13444(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != f13451(var25) || NIL != f13466(var25) || NIL != ((NIL != $g2329$.getDynamicValue(var26)) ? f13467(var25) : NIL));
    }
    
    public static SubLObject f13467(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13468(var25) || NIL != f13469(var25));
    }
    
    public static SubLObject f13470(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var25) && ($ic36$.eql(module0205.f13132(var25)) || $ic37$.eql(module0205.f13132(var25))) && NIL != module0202.f12734(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13471(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var25) && $ic37$.eql(module0205.f13132(var25)) && NIL != module0202.f12734(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13472(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var25) && $ic36$.eql(module0205.f13132(var25)) && NIL != module0202.f12734(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13473(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var25) && $ic20$.eql(module0205.f13132(var25)) && NIL != module0202.f12734(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f13474(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        final SubLObject var28 = module0152.$g2116$.currentBinding(var26);
        final SubLObject var29 = module0152.$g2115$.currentBinding(var26);
        try {
            module0152.$g2116$.bind((SubLObject)NIL, var26);
            module0152.$g2115$.bind((SubLObject)NIL, var26);
            var27 = f13468(var25);
        }
        finally {
            module0152.$g2115$.rebind(var29, var26);
            module0152.$g2116$.rebind(var28, var26);
        }
        return var27;
    }
    
    public static SubLObject f13468(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic36$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic55$, (SubLObject)TWO_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else {
                    if (NIL != f13475(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13469(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic37$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic56$, (SubLObject)TWO_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else {
                    if (NIL != f13475(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13475(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        final SubLObject var28 = $g2330$.currentBinding(var26);
        try {
            $g2330$.bind((SubLObject)T, var26);
            if (NIL != f13464(var25) || NIL != f13467(var25) || NIL != f13465(var25)) {
                var27 = (SubLObject)T;
            }
        }
        finally {
            $g2330$.rebind(var28, var26);
        }
        return var27;
    }
    
    public static SubLObject f13465(final SubLObject var25) {
        if (NIL != module0202.f12590(var25)) {
            if ($ic20$.eql(module0205.f13132(var25))) {
                if (NIL == module0202.f12734(var25, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED)) {
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic21$, var25, module0205.f13132(var25), (SubLObject)$ic57$, (SubLObject)TWO_INTEGER, module0202.f12725(var25, (SubLObject)UNPROVIDED)));
                    }
                }
                else {
                    if (NIL != f13464(module0205.f13203(var25, (SubLObject)UNPROVIDED)) || NIL != f13467(module0205.f13203(var25, (SubLObject)UNPROVIDED)) || NIL != f13465(module0205.f13203(var25, (SubLObject)UNPROVIDED))) {
                        return (SubLObject)T;
                    }
                    if (NIL != module0274.f18149()) {
                        module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic33$, (SubLObject)$ic46$, module0205.f13132(var25), module0205.f13207(var25, (SubLObject)$ic27$)));
                    }
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13476(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13477(var25) || NIL != f13453(var25));
    }
    
    public static SubLObject f13451(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13477(var25) || NIL != f13453(var25) || NIL != f13438(var25));
    }
    
    public static SubLObject f13478(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13479(var25) || NIL != f13480(var25));
    }
    
    public static SubLObject f13466(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13481(var25) || (NIL != f13411() && var25.isCons()));
    }
    
    public static SubLObject f13481(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != f13478(var25) || NIL != ((NIL != $g2326$.getDynamicValue(var26)) ? f13482(var25) : NIL));
    }
    
    public static SubLObject f13483(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13477(var25) || NIL != f13453(var25));
    }
    
    public static SubLObject f13484(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        if (NIL != module0167.f10813(var25)) {
            return (SubLObject)T;
        }
        if (var25.isCons() && NIL != module0172.f10921(var25)) {
            return (SubLObject)T;
        }
        if (var25.isCons()) {
            SubLObject var27 = (SubLObject)NIL;
            final SubLObject var28 = module0147.$g2094$.currentBinding(var26);
            final SubLObject var29 = module0147.$g2095$.currentBinding(var26);
            try {
                module0147.$g2094$.bind((SubLObject)$ic58$, var26);
                module0147.$g2095$.bind($ic59$, var26);
                var27 = module0279.f18536(var25);
            }
            finally {
                module0147.$g2095$.rebind(var29, var26);
                module0147.$g2094$.rebind(var28, var26);
            }
            return var27;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13485(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13453(var25) && NIL == f13484(var25));
    }
    
    public static SubLObject f13431(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13431(module0205.f13143(var25));
        }
        return (SubLObject)makeBoolean(NIL != f13440(var25) || NIL != f13442(var25));
    }
    
    public static SubLObject f13486(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13453(var25) || NIL != f13426(var25));
    }
    
    public static SubLObject f13487(final SubLObject var25) {
        if (NIL != f13410() && NIL != assertion_handles_oc.f11035(var25)) {
            return f13487(module0205.f13143(var25));
        }
        return (SubLObject)makeBoolean(NIL != f13433(var25) || (NIL != module0202.f12590(var25) && NIL != module0202.f12592(var25) && NIL != f13433(module0205.f13203(var25, (SubLObject)UNPROVIDED))));
    }
    
    public static SubLObject f13488(final SubLObject var42) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var42) && NIL != module0202.f12631(module0202.f12832(var42, (SubLObject)UNPROVIDED)) && NIL != f13487(var42));
    }
    
    public static SubLObject f13489(final SubLObject var42) {
        return (SubLObject)makeBoolean(NIL != module0202.f12590(var42) && NIL != module0202.f12633(module0202.f12832(var42, (SubLObject)UNPROVIDED)) && NIL != f13487(var42));
    }
    
    public static SubLObject f13490(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13491(var25) || NIL != f13425(var25));
    }
    
    public static SubLObject f13491(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13451(var25) || NIL != f13481(var25));
    }
    
    public static SubLObject f13492(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        final SubLObject var28 = $g2324$.currentBinding(var26);
        final SubLObject var29 = $g2323$.currentBinding(var26);
        try {
            $g2324$.bind((SubLObject)NIL, var26);
            $g2323$.bind((SubLObject)NIL, var26);
            var27 = (SubLObject)makeBoolean(NIL != module0202.f12590(var25) && (NIL != f13453(var25) || NIL != f13425(var25) || NIL != module0552.f34026(var25)));
        }
        finally {
            $g2323$.rebind(var29, var26);
            $g2324$.rebind(var28, var26);
        }
        return var27;
    }
    
    public static SubLObject f13493(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13427(var25) || (NIL != module0202.f12590(var25) && (NIL != f13433(var25) || (NIL != f13445(module0205.f13136(var25)) && NIL != module0035.f2370((SubLObject)$ic60$, module0205.f13207(var25, (SubLObject)$ic61$), (SubLObject)UNPROVIDED)))));
    }
    
    public static SubLObject f13494(final SubLObject var43, final SubLObject var25) {
        SubLObject var44 = (SubLObject)makeBoolean(NIL != f13427(var25) || NIL != Functions.funcall(var43, var25));
        if (NIL == var44 && NIL != module0202.f12590(var25) && NIL != f13445(module0205.f13136(var25))) {
            SubLObject var45 = (SubLObject)NIL;
            final SubLObject var46 = module0205.f13207(var25, (SubLObject)$ic61$);
            SubLObject var47;
            SubLObject var48;
            for (var47 = (SubLObject)NIL, var47 = var46; NIL == var45 && NIL != var47; var45 = (SubLObject)makeBoolean(NIL == f13494(var43, var48)), var47 = var47.rest()) {
                var48 = var47.first();
            }
            var44 = (SubLObject)makeBoolean(NIL == var45);
        }
        return var44;
    }
    
    public static SubLObject f13477(final SubLObject var25) {
        return constant_handles_oc.f8449(var25);
    }
    
    public static SubLObject f13479(final SubLObject var25) {
        if (var25.isString()) {
            if (NIL != f13412()) {
                return (SubLObject)T;
            }
            if (NIL != module0039.f3006(var25)) {
                return (SubLObject)T;
            }
            if (NIL != module0274.f18149()) {
                module0274.f18082((SubLObject)ConsesLow.list((SubLObject)$ic62$, var25));
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13480(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13495(var25) || NIL != f13496(var25));
    }
    
    public static SubLObject f13496(final SubLObject var25) {
        return (SubLObject)makeBoolean(var25.isNumber() && NIL == f13495(var25));
    }
    
    public static SubLObject f13495(final SubLObject var25) {
        return Types.integerp(var25);
    }
    
    public static SubLObject f13482(final SubLObject var25) {
        return (SubLObject)makeBoolean(var25.isSymbol() && NIL == f13497(var25));
    }
    
    public static SubLObject f13498(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13482(var25) && !var25.isKeyword());
    }
    
    public static SubLObject f13438(final SubLObject var25) {
        return (SubLObject)makeBoolean(NIL != f13497(var25) || NIL != f13499(var25) || (NIL != f13410() && NIL != f13500(var25)));
    }
    
    public static SubLObject f13499(final SubLObject var25) {
        return module0201.f12570(var25);
    }
    
    public static SubLObject f13497(final SubLObject var25) {
        return module0201.f12546(var25);
    }
    
    public static SubLObject f13500(final SubLObject var25) {
        return module0193.f12067(var25);
    }
    
    public static SubLObject f13501(final SubLObject var25) {
        return (SubLObject)makeBoolean(var25.eql($ic40$) || var25.eql($ic41$));
    }
    
    public static SubLObject f13502(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = module0152.$g2129$.currentBinding(var26);
        final SubLObject var30 = module0152.$g2116$.currentBinding(var26);
        final SubLObject var31 = module0152.$g2115$.currentBinding(var26);
        try {
            module0152.$g2129$.bind((SubLObject)NIL, var26);
            module0152.$g2116$.bind((SubLObject)T, var26);
            module0152.$g2115$.bind((SubLObject)T, var26);
            var27 = f13425(var25);
            var28 = module0274.f18211(Sequences.nreverse(module0152.$g2129$.getDynamicValue(var26)));
        }
        finally {
            module0152.$g2115$.rebind(var31, var26);
            module0152.$g2116$.rebind(var30, var26);
            module0152.$g2129$.rebind(var29, var26);
        }
        return Values.values(var28, var27);
    }
    
    public static SubLObject f13503(final SubLObject var25) {
        final SubLThread var26 = SubLProcess.currentSubLThread();
        SubLObject var27 = (SubLObject)NIL;
        SubLObject var28 = (SubLObject)NIL;
        final SubLObject var29 = module0152.$g2129$.currentBinding(var26);
        final SubLObject var30 = module0152.$g2116$.currentBinding(var26);
        final SubLObject var31 = module0152.$g2115$.currentBinding(var26);
        try {
            module0152.$g2129$.bind((SubLObject)NIL, var26);
            module0152.$g2116$.bind((SubLObject)T, var26);
            module0152.$g2115$.bind((SubLObject)T, var26);
            var27 = f13464(var25);
            var28 = module0274.f18211(Sequences.nreverse(module0152.$g2129$.getDynamicValue(var26)));
        }
        finally {
            module0152.$g2115$.rebind(var31, var26);
            module0152.$g2116$.rebind(var30, var26);
            module0152.$g2129$.rebind(var29, var26);
        }
        return Values.values(var28, var27);
    }
    
    public static SubLObject f13504(final SubLObject var25) {
        return f13503(var25);
    }
    
    public static SubLObject f13505() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13410", "S#16280", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13411", "S#16281", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13412", "S#16282", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13413", "S#16283", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13414", "S#16284", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13415", "S#16285", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13416", "S#16286");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13417", "S#16287");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13418", "S#15213");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13419", "S#16288");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13420", "S#16289");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13421", "S#16290");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13422", "S#16291");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13423", "S#16292");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0206", "f13424", "S#16293");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13425", "CYCL-SENTENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13426", "S#16294", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13439", "S#16295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13427", "S#15486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13428", "S#16296", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13429", "S#16297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13430", "S#16298", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13434", "S#16299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13435", "S#16300", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13436", "S#16301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13432", "S#16302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13437", "S#16303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13440", "S#16304", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13442", "S#15501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13445", "S#16305", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13446", "S#16306", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13441", "S#15502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13443", "S#15503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13433", "S#15527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13448", "S#16307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13447", "S#16308", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13452", "S#16309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13453", "S#12628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13449", "S#16310", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13454", "S#16311", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13462", "S#16312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13455", "S#16313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13456", "S#16314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13457", "S#16315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13458", "S#16316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13459", "S#16317", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13463", "S#16318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13460", "S#16319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13461", "S#16320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13464", "S#16321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13450", "CYCL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13444", "CYCL-DENOTATIONAL-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13467", "S#15918", 1, 0, false);
        new $f13467$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13470", "S#16322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13471", "S#16033", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13472", "S#15535", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13473", "S#15534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13474", "S#16323", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13468", "S#16324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13469", "S#16275", 1, 0, false);
        new $f13469$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13475", "S#16325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13465", "S#16276", 1, 0, false);
        new $f13465$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13476", "S#16326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13451", "S#13264", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13478", "S#14626", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13466", "S#16327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13481", "S#16328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13483", "S#16329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13484", "CYCL-NART-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13485", "CYCL-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13431", "S#16330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13486", "S#16331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13487", "S#15916", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13488", "S#16332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13489", "S#16278", 1, 0, false);
        new $f13489$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13490", "S#16333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13491", "S#16334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13492", "S#16335", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13493", "S#16336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13494", "S#16337", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13477", "CYCL-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13479", "SUBL-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13480", "S#14708", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13496", "S#16338", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13495", "S#16339", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13482", "S#16340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13498", "SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13438", "CYCL-VARIABLE-P", 1, 0, false);
        new $f13438$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13499", "S#16341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13497", "EL-VARIABLE-P", 1, 0, false);
        new $f13497$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13500", "HL-VARIABLE-P", 1, 0, false);
        new $f13500$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13501", "S#16342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13502", "S#16343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13503", "S#16344", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0206", "f13504", "S#16345", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13506() {
        $g2323$ = SubLFiles.defvar("S#16346", (SubLObject)T);
        $g2324$ = SubLFiles.defvar("S#16347", (SubLObject)T);
        $g2325$ = SubLFiles.defparameter("S#16348", (SubLObject)NIL);
        $g2326$ = SubLFiles.defparameter("S#16349", (SubLObject)NIL);
        $g2327$ = SubLFiles.defparameter("S#16350", (SubLObject)NIL);
        $g2328$ = SubLFiles.defparameter("S#16351", (SubLObject)T);
        $g2329$ = SubLFiles.defparameter("S#16352", (SubLObject)T);
        $g2330$ = SubLFiles.defvar("S#16353", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f13507() {
        module0012.f416((SubLObject)$ic63$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f13505();
    }
    
    public void initializeVariables() {
        f13506();
    }
    
    public void runTopLevelForms() {
        f13507();
    }
    
    static {
        me = (SubLFile)new module0206();
        $g2323$ = null;
        $g2324$ = null;
        $g2325$ = null;
        $g2326$ = null;
        $g2327$ = null;
        $g2328$ = null;
        $g2329$ = null;
        $g2330$ = null;
        $ic0$ = makeSymbol("CLET");
        $ic1$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#16346", "CYC"), (SubLObject)NIL));
        $ic2$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#16346", "CYC"), (SubLObject)T));
        $ic3$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#16347", "CYC"), (SubLObject)NIL));
        $ic4$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#16347", "CYC"), (SubLObject)T));
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12538", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12463", "CYC"), (SubLObject)T), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), (SubLObject)T));
        $ic6$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#12463", "CYC"), (SubLObject)NIL), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), (SubLObject)NIL));
        $ic7$ = ConsesLow.list((SubLObject)makeSymbol("S#16354", "CYC"));
        $ic8$ = makeSymbol("PWHEN");
        $ic9$ = ConsesLow.list((SubLObject)makeSymbol("S#16272", "CYC"));
        $ic10$ = makeSymbol("S#16273", "CYC");
        $ic11$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#16353", "CYC"), (SubLObject)T));
        $ic12$ = ConsesLow.list((SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic13$ = makeSymbol("PIF");
        $ic14$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Quote")));
        $ic15$ = makeSymbol("S#16292", "CYC");
        $ic16$ = makeKeyword("NOT-A-TRUTH-FUNCTION");
        $ic17$ = makeKeyword("NOT-AN-EL-FORMULA");
        $ic18$ = constant_handles_oc.f8479((SubLObject)makeString("True"));
        $ic19$ = constant_handles_oc.f8479((SubLObject)makeString("False"));
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("EscapeQuote"));
        $ic21$ = makeKeyword("ARITY-MISMATCH");
        $ic22$ = makeString("unary operator");
        $ic23$ = makeString("binary operator");
        $ic24$ = makeString("ternary operator");
        $ic25$ = makeString("quaternary operator");
        $ic26$ = makeString("quintary operator");
        $ic27$ = makeKeyword("INCLUDE");
        $ic28$ = makeString("regular quantifier");
        $ic29$ = makeKeyword("NOT-AN-EL-VARIABLE");
        $ic30$ = makeString("bounded existential");
        $ic31$ = makeKeyword("NOT-A-DENOTATIONAL-TERM");
        $ic32$ = makeKeyword("SEQUENCE-NON-VAR");
        $ic33$ = makeKeyword("MALFORMED-ARGS");
        $ic34$ = makeString("predicate");
        $ic35$ = makeSymbol("CYCL-VARIABLE-P");
        $ic36$ = constant_handles_oc.f8479((SubLObject)makeString("Quote"));
        $ic37$ = constant_handles_oc.f8479((SubLObject)makeString("QuasiQuote"));
        $ic38$ = constant_handles_oc.f8479((SubLObject)makeString("ExpandSubLFn"));
        $ic39$ = constant_handles_oc.f8479((SubLObject)makeString("SubLQuoteFn"));
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("Kappa"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("Lambda"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("SkolemFunctionFn"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("SkolemFuncNFn"));
        $ic44$ = makeString("functor");
        $ic45$ = makeString("#$ExpandSubLFn expression");
        $ic46$ = makeString("reserved constant");
        $ic47$ = makeSymbol("S#12629", "CYC");
        $ic48$ = ConsesLow.list((SubLObject)NIL);
        $ic49$ = makeKeyword("EXPAND-SUBL-FN-IRRELEVANT-TERM-IN-ARG1");
        $ic50$ = makeString("#$SubLQuoteFn expression");
        $ic51$ = makeString("#$Kappa expression");
        $ic52$ = makeString("#$Lambda expression");
        $ic53$ = makeString("#$SkolemFunctionFn expression");
        $ic54$ = makeString("#$SkolemFuncNFn expression");
        $ic55$ = makeString("#$Quote expression");
        $ic56$ = makeString("#$QuasiQuote expression");
        $ic57$ = makeString("#$EscapeQuote expression");
        $ic58$ = makeSymbol("S#12274", "CYC");
        $ic59$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic60$ = makeSymbol("S#16336", "CYC");
        $ic61$ = makeKeyword("REGULARIZE");
        $ic62$ = makeKeyword("NOT-AN-ASCII-STRING");
        $ic63$ = makeSymbol("SUBL-NON-VARIABLE-NON-KEYWORD-SYMBOL-P");
    }
    
    public static final class $f13467$UnaryFunction extends UnaryFunction
    {
        public $f13467$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#15918"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f13467(var31);
        }
    }
    
    public static final class $f13469$UnaryFunction extends UnaryFunction
    {
        public $f13469$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16275"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f13469(var31);
        }
    }
    
    public static final class $f13465$UnaryFunction extends UnaryFunction
    {
        public $f13465$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16276"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f13465(var31);
        }
    }
    
    public static final class $f13489$UnaryFunction extends UnaryFunction
    {
        public $f13489$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#16278"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f13489(var31);
        }
    }
    
    public static final class $f13438$UnaryFunction extends UnaryFunction
    {
        public $f13438$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CYCL-VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f13438(var31);
        }
    }
    
    public static final class $f13497$UnaryFunction extends UnaryFunction
    {
        public $f13497$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("EL-VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f13497(var31);
        }
    }
    
    public static final class $f13500$UnaryFunction extends UnaryFunction
    {
        public $f13500$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-VARIABLE-P"));
        }
        
        public SubLObject processItem(final SubLObject var31) {
            return f13500(var31);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 347 ms
	
	Decompiled with Procyon 0.5.32.
*/