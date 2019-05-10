package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0107 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0107";
    public static final String myFingerPrint = "6e7dfca90ae87e2db09e7c5318d5a787cd4f4ba7cdf5af549969690ae045b0d3";
    private static SubLSymbol $g1359$;
    private static SubLSymbol $g1360$;
    private static SubLSymbol $g1361$;
    private static SubLSymbol $g1363$;
    private static SubLSymbol $g1364$;
    private static SubLSymbol $g1365$;
    private static SubLSymbol $g1366$;
    private static SubLSymbol $g1367$;
    private static final SubLString $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLString $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLString $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLList $ic23$;
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
    private static final SubLList $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    
    public static SubLObject f7573() {
        return (SubLObject)$ic0$;
    }
    
    public static SubLObject f7574() {
        return $g1359$.getGlobalValue();
    }
    
    public static SubLObject f7575(final SubLObject var1) {
        print_high.princ(f7574(), var1);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7576(SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)T;
        }
        final SubLObject var3 = $g1361$.getGlobalValue();
        SubLObject var4 = (SubLObject)NIL;
        try {
            var4 = Locks.seize_lock(var3);
            f7577(var2);
        }
        finally {
            if (NIL != var4) {
                Locks.release_lock(var3);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f7577(final SubLObject var2) {
        module0619.f38208();
        f7578();
        f7579();
        f7580();
        f7581();
        if (NIL != var2) {
            f7582();
        }
        if (NIL != module0004.f105(module0018.f971())) {
            f7583();
        }
        else {
            Errors.warn((SubLObject)$ic5$);
        }
        $g1360$.setGlobalValue(Environment.get_process_id((SubLObject)UNPROVIDED));
        return (SubLObject)T;
    }
    
    public static SubLObject f7584() {
        return Numbers.numE($g1360$.getGlobalValue(), Environment.get_process_id((SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f7585() {
        $g1360$.setGlobalValue((SubLObject)NIL);
        return f7576((SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7578() {
        random.seed_random((SubLObject)UNPROVIDED);
        module0011.f354((SubLObject)UNPROVIDED);
        module0018.f966();
        f7586();
        module0593.f36279((SubLObject)UNPROVIDED);
        module0061.f4463();
        module0060.f4400();
        module0117.f8154();
        return (SubLObject)T;
    }
    
    public static SubLObject f7579() {
        module0255.f16518((SubLObject)UNPROVIDED);
        module0328.f22150();
        return (SubLObject)T;
    }
    
    public static SubLObject f7580() {
        module0340.f22950();
        module0195.f12176();
        module0222.f14648();
        module0361.f24004();
        inference_datastructures_inference_oc.f25647((SubLObject)$ic7$);
        return (SubLObject)T;
    }
    
    public static SubLObject f7581() {
        module0112.f7931();
        module0624.f38489();
        module0605.f37075();
        module0605.f37051();
        return (SubLObject)T;
    }
    
    public static SubLObject f7582() {
        module0723.f44303();
        module0414.f28984();
        return (SubLObject)T;
    }
    
    public static SubLObject f7583() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        f7587();
        module0574.f35153(module0110.$g1362$.getDynamicValue(var5));
        module0572.f35015();
        module0593.f36266();
        module0012.f434();
        module0028.f1467();
        module0633.f38711();
        f7588();
        return (SubLObject)T;
    }
    
    public static SubLObject f7588() {
        final SubLObject var6 = f7589();
        final SubLObject var7 = f7590();
        module0737.f45583(var6, var7);
        return (SubLObject)T;
    }
    
    public static SubLObject f7591() {
        return $g1364$.getGlobalValue();
    }
    
    public static SubLObject f7590() {
        return $g1365$.getGlobalValue();
    }
    
    public static SubLObject f7587() {
        if (NIL == f7592()) {
            return f7593(f7589(), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7593(final SubLObject var8, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (NIL != f7594(var8, var7)) {
            module0186.f11718();
            assertion_manager_oc.f11131();
            module0164.f10694();
            module0169.f10865();
            module0170.f10892();
            module0190.f11899();
            module0189.f11826();
            module0181.f11482();
            module0242.f15648();
            module0322.f21842(var8, f7590());
        }
        else {
            Errors.warn((SubLObject)$ic11$);
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f7594(final SubLObject var8, SubLObject var7) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (NIL != Filesys.directory_p(var8)) {
            f7595(var8);
        }
        else {
            Errors.warn((SubLObject)$ic12$, var8);
        }
        if (NIL != Filesys.directory_p(f7589())) {
            f7596(var7);
            return (SubLObject)T;
        }
        Errors.warn((SubLObject)$ic13$, var8);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7596(SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)T, (SubLObject)$ic14$, f7589());
        if (NIL == var7) {
            SubLObject var9 = (SubLObject)NIL;
            try {
                var8.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var10 = Errors.$error_handler$.currentBinding(var8);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic15$, var8);
                    try {
                        var7 = dumper_oc.f38027(f7589());
                    }
                    catch (Throwable var11) {
                        Errors.handleThrowable(var11, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var10, var8);
                }
            }
            catch (Throwable var12) {
                var9 = Errors.handleThrowable(var12, module0003.$g3$.getGlobalValue());
            }
            finally {
                var8.throwStack.pop();
            }
            if (var9.isString()) {
                Errors.warn((SubLObject)$ic16$, f7589());
            }
        }
        if (NIL != var7) {
            $g1364$.setGlobalValue(var7);
            $g1365$.setGlobalValue(Functions.apply((SubLObject)$ic17$, var7));
            return $g1364$.getGlobalValue();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7592() {
        return (SubLObject)makeBoolean(NIL != module0186.f11706() && NIL != assertion_manager_oc.f11111() && NIL != module0164.f10674() && NIL != module0169.f10854() && NIL != module0189.f11809() && NIL != module0242.f15657());
    }
    
    public static SubLObject f7597(final SubLObject var13, final SubLObject var14) {
        return Sequences.cconcatenate($g1363$.getGlobalValue(), new SubLObject[] { var13, $ic18$, var14 });
    }
    
    public static SubLObject f7595(final SubLObject var6) {
        $g1363$.setGlobalValue(var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7598() {
        if (NIL != dumper_oc.f37906()) {
            Errors.error((SubLObject)$ic19$);
        }
        return f7589();
    }
    
    public static SubLObject f7589() {
        if ($g1363$.getGlobalValue().isString()) {
            return $g1363$.getGlobalValue();
        }
        if (NIL == dumper_oc.f37906()) {
            f7595(f7599());
        }
        return $g1363$.getGlobalValue();
    }
    
    public static SubLObject f7599() {
        final SubLObject var15 = module0018.f968().isFixnum() ? module0018.f968() : module0018.f971();
        final SubLObject var16 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic20$, module0574.f35166(var15));
        Errors.warn((SubLObject)$ic21$, var16);
        return var16;
    }
    
    public static SubLObject f7600(final SubLObject var16, final SubLObject var17) {
        return Equality.eql(var16.rest(), var17);
    }
    
    public static SubLObject f7601(final SubLObject var18, final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL == module0004.f104(var18, var16, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f7602(final SubLObject var19, final SubLObject var20, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)EQL);
        }
        return conses_high.assoc(var19, var20, var21, (SubLObject)UNPROVIDED).rest();
    }
    
    public static SubLObject f7603(final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var25, final SubLObject var26, SubLObject var27, SubLObject var28, SubLObject var29, SubLObject var30) {
        if (var27 == UNPROVIDED) {
            var27 = (SubLObject)$ic22$;
        }
        if (var28 == UNPROVIDED) {
            var28 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var29 == UNPROVIDED) {
            var29 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var30 == UNPROVIDED) {
            var30 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var31 = f7602(var22, var23, var28);
        final SubLObject var32 = f7602(var24, var25, var29);
        if (!var31.isVector() || !var32.isInteger()) {
            return (SubLObject)NIL;
        }
        if (NIL != Sequences.find(var27, (SubLObject)$ic23$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var33 = Vectors.aref(var31, var32);
            final SubLObject var34 = var27;
            if (var34.eql((SubLObject)$ic22$)) {
                Vectors.set_aref(var31, var32, (SubLObject)ConsesLow.cons(var26, var33));
                return var31;
            }
            if (var34.eql((SubLObject)$ic24$)) {
                if (var33.isList()) {
                    Vectors.set_aref(var31, var32, conses_high.adjoin(var26, var33, var30, (SubLObject)UNPROVIDED));
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic25$)) {
                if (var26.isList() && var33.isList()) {
                    Vectors.set_aref(var31, var32, ConsesLow.append(var26, var33));
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic26$)) {
                if (var26.isList() && var33.isList()) {
                    Vectors.set_aref(var31, var32, conses_high.union(var26, var33, var30, (SubLObject)UNPROVIDED));
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic27$)) {
                if (var33.isList()) {
                    Vectors.set_aref(var31, var32, var33.rest());
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic28$)) {
                if (var33.isList()) {
                    Vectors.set_aref(var31, var32, var33.first());
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic29$)) {
                if (var33.isList()) {
                    Vectors.set_aref(var31, var32, Sequences.remove(var26, var33, var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic30$)) {
                if (var33.isCons()) {
                    ConsesLow.rplaca(var33, var26);
                    Vectors.set_aref(var31, var32, var33);
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic31$)) {
                if (var33.isCons()) {
                    ConsesLow.rplacd(var33, var26);
                    Vectors.set_aref(var31, var32, var33);
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic32$)) {
                if (var33.isSequence()) {
                    Vectors.set_aref(var31, var32, Sequences.nreverse(var33));
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic33$)) {
                if (var33.isInteger()) {
                    if (NIL == var26) {
                        Vectors.set_aref(var31, var32, Numbers.add(var33, (SubLObject)ONE_INTEGER));
                    }
                    else if (var26.isInteger() && var26.numG((SubLObject)ZERO_INTEGER)) {
                        Vectors.set_aref(var31, var32, Numbers.add(var33, var26));
                    }
                }
                return var31;
            }
            if (var34.eql((SubLObject)$ic34$)) {
                if (var33.isInteger()) {
                    if (NIL == var26 && var33.numG((SubLObject)ZERO_INTEGER)) {
                        Vectors.set_aref(var31, var32, Numbers.subtract(var33, (SubLObject)ONE_INTEGER));
                    }
                    else if (var26.isInteger() && var26.numG((SubLObject)ZERO_INTEGER) && var33.numG((SubLObject)ZERO_INTEGER)) {
                        SubLObject var35 = Numbers.subtract(var33, var26);
                        if (!var35.numGE((SubLObject)ZERO_INTEGER)) {
                            var35 = (SubLObject)ZERO_INTEGER;
                        }
                        Vectors.set_aref(var31, var32, var35);
                    }
                }
                return var31;
            }
            return (SubLObject)NIL;
        }
        else {
            if (NIL != Sequences.find(var27, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                Vectors.set_aref(var31, var32, var26);
                return var31;
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f7604(final SubLObject var22, final SubLObject var23, final SubLObject var24, final SubLObject var25, SubLObject var28, SubLObject var29) {
        if (var28 == UNPROVIDED) {
            var28 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var29 == UNPROVIDED) {
            var29 = Symbols.symbol_function((SubLObject)EQL);
        }
        final SubLObject var30 = f7602(var22, var23, var28);
        final SubLObject var31 = f7602(var24, var25, var29);
        if (var30.isVector() && var31.isInteger()) {
            return Vectors.aref(var30, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7605(final SubLObject var23) {
        SubLObject var24 = var23;
        SubLObject var25 = (SubLObject)NIL;
        var25 = var24.first();
        while (NIL != var24) {
            final SubLObject var26 = var25.rest();
            SubLObject var27;
            SubLObject var28;
            for (var27 = Sequences.length(var26), var28 = (SubLObject)NIL, var28 = (SubLObject)ZERO_INTEGER; var28.numL(var27); var28 = Numbers.add(var28, (SubLObject)ONE_INTEGER)) {
                Vectors.set_aref(var26, var28, (SubLObject)NIL);
            }
            var24 = var24.rest();
            var25 = var24.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7606(final SubLObject var25, SubLObject var40) {
        if (var40 == UNPROVIDED) {
            var40 = (SubLObject)NIL;
        }
        return Vectors.make_vector(Sequences.length(var25), var40);
    }
    
    public static SubLObject f7607(final SubLObject var41) {
        SubLObject var42 = (SubLObject)ZERO_INTEGER;
        SubLObject var43;
        SubLObject var44;
        SubLObject var45;
        for (var43 = Sequences.length(var41), var44 = (SubLObject)NIL, var44 = (SubLObject)ZERO_INTEGER; var44.numL(var43); var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER)) {
            var45 = Vectors.aref(var41, var44);
            if (NIL != var45) {
                var42 = Numbers.add(var42, (SubLObject)ONE_INTEGER);
            }
        }
        return var42;
    }
    
    public static SubLObject f7608(final SubLObject var18, final SubLObject var16, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        return conses_high.ldiff(var16, conses_high.member(var18, var16, var21, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f7609(final SubLObject var45, final SubLObject var16, SubLObject var21) {
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)EQUALP);
        }
        SubLObject var46 = (SubLObject)NIL;
        SubLObject var47 = (SubLObject)NIL;
        SubLObject var48 = (SubLObject)NIL;
        SubLObject var49 = (SubLObject)NIL;
        var47 = var45;
        var48 = var47.first();
        var49 = conses_high.ldiff(var16, conses_high.member(var48, var16, var21, (SubLObject)UNPROVIDED));
        while (NIL != var47) {
            if (NIL == var46 || (var46.isCons() && Sequences.length(var49).numL(Sequences.length(var46)))) {
                var46 = var49;
            }
            var47 = var47.rest();
            var48 = var47.first();
            var49 = conses_high.ldiff(var16, conses_high.member(var48, var16, var21, (SubLObject)UNPROVIDED));
        }
        return var46;
    }
    
    public static SubLObject f7610(final SubLObject var50) {
        assert NIL != Types.listp(var50) : var50;
        SubLObject var51 = (SubLObject)ZERO_INTEGER;
        SubLObject var52 = (SubLObject)NIL;
        SubLObject var53 = var50;
        SubLObject var54 = (SubLObject)NIL;
        var54 = var53.first();
        while (NIL != var53) {
            var52 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var51, (SubLObject)ConsesLow.list(var54)), var52);
            var51 = Numbers.add(var51, (SubLObject)ONE_INTEGER);
            var53 = var53.rest();
            var54 = var53.first();
        }
        return Sequences.nreverse(var52);
    }
    
    public static SubLObject f7611(final SubLObject var48, final SubLObject var54, final SubLObject var20, SubLObject var21, SubLObject var19) {
        if (var21 == UNPROVIDED) {
            var21 = Symbols.symbol_function((SubLObject)EQL);
        }
        if (var19 == UNPROVIDED) {
            var19 = Symbols.symbol_function((SubLObject)IDENTITY);
        }
        if (NIL != conses_high.assoc(var48, var20, var21, var19)) {
            return var20;
        }
        return conses_high.acons(var48, var54, var20);
    }
    
    public static SubLObject f7612(final SubLObject var55, final SubLObject var56, SubLObject var57) {
        if (var57 == UNPROVIDED) {
            var57 = (SubLObject)Characters.CHAR_space;
        }
        assert NIL != module0035.f2014(var55) : var55;
        assert NIL != module0004.f105(var56) : var56;
        SubLObject var58 = (SubLObject)NIL;
        SubLObject var59 = (SubLObject)NIL;
        SubLObject var60 = (SubLObject)NIL;
        var58 = var55;
        var59 = var58.first();
        for (var60 = (SubLObject)ZERO_INTEGER; NIL != var58; var58 = var58.rest(), var59 = var58.first(), var60 = Numbers.add((SubLObject)ONE_INTEGER, var60)) {
            print_high.prin1(var59, (SubLObject)UNPROVIDED);
            if (Numbers.mod(module0048.f_1X(var60), var56).isZero()) {
                streams_high.terpri((SubLObject)UNPROVIDED);
            }
            else {
                print_high.princ(var57, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7613(final SubLObject var59) {
        if (var59.eql((SubLObject)ONE_INTEGER)) {
            return (SubLObject)TWO_INTEGER;
        }
        if (var59.eql((SubLObject)TWO_INTEGER)) {
            return (SubLObject)ONE_INTEGER;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7614(SubLObject var60, SubLObject var61, SubLObject var62, SubLObject var63, SubLObject var64) {
        if (var60 == UNPROVIDED) {
            var60 = (SubLObject)NIL;
        }
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        if (var62 == UNPROVIDED) {
            var62 = (SubLObject)NIL;
        }
        if (var63 == UNPROVIDED) {
            var63 = (SubLObject)NIL;
        }
        if (var64 == UNPROVIDED) {
            var64 = (SubLObject)NIL;
        }
        SubLObject var65 = (SubLObject)ZERO_INTEGER;
        if (NIL != var60) {
            var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
        }
        if (NIL != var61) {
            var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
        }
        if (NIL != var62) {
            var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
        }
        if (NIL != var63) {
            var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
        }
        if (NIL != var64) {
            var65 = Numbers.add(var65, (SubLObject)ONE_INTEGER);
        }
        return var65;
    }
    
    public static SubLObject f7615(final SubLObject var65) {
        if (NIL != var65) {
            return (SubLObject)$ic39$;
        }
        return (SubLObject)$ic40$;
    }
    
    public static SubLObject f7616(final SubLObject var66) {
        return Equality.eq((SubLObject)$ic39$, var66);
    }
    
    public static SubLObject f7617() {
        return module0038.f2752(Environment.get_machine_name((SubLObject)UNPROVIDED), (SubLObject)$ic41$).first();
    }
    
    public static SubLObject f7618() {
        final SubLObject var67 = $g1366$.getGlobalValue();
        if (NIL != var67) {
            module0034.f1818(var67);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7619() {
        return module0034.f1829($g1366$.getGlobalValue(), (SubLObject)ConsesLow.list(EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7620() {
        final SubLObject var68 = Environment.get_machine_name((SubLObject)UNPROVIDED);
        assert NIL != Types.stringp(var68) : var68;
        return Strings.string_downcase(var68, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f7621() {
        SubLObject var69 = $g1366$.getGlobalValue();
        if (NIL == var69) {
            var69 = module0034.f1934((SubLObject)$ic42$, (SubLObject)$ic44$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ZERO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var70 = module0034.f1810(var69, (SubLObject)UNPROVIDED);
        if (var70 == $ic45$) {
            var70 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f7620()));
            module0034.f1812(var69, var70, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var70);
    }
    
    public static SubLObject f7622() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = f7621();
        final SubLObject var7 = module0038.f2752(var6, (SubLObject)$ic41$);
        final SubLObject var8 = var7.first();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var5) && NIL != module0038.f2608(var8)) {
            Errors.error((SubLObject)$ic46$);
        }
        return var8;
    }
    
    public static SubLObject f7623(final SubLObject var73) {
        return var73.isFunction() ? var73 : Symbols.symbol_function(var73);
    }
    
    public static SubLObject f7624() {
        if ($ic47$ == $g1367$.getGlobalValue()) {
            $g1367$.setGlobalValue(f7625());
        }
        return $g1367$.getGlobalValue();
    }
    
    public static SubLObject f7586() {
        $g1367$.setGlobalValue((SubLObject)$ic47$);
        return $g1367$.getGlobalValue();
    }
    
    public static SubLObject f7625() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        try {
            var5.throwStack.push($ic48$);
            final SubLObject var8 = Errors.$error_handler$.currentBinding(var5);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic49$), var5);
                try {
                    SubLObject var9 = (SubLObject)NIL;
                    try {
                        var9 = compatibility.open_text((SubLObject)$ic50$, (SubLObject)$ic51$);
                        if (!var9.isStream()) {
                            Errors.error((SubLObject)$ic52$, (SubLObject)$ic50$);
                        }
                        final SubLObject var10 = var9;
                        if (NIL != var10) {
                            while (NIL == var6) {
                                final SubLObject var11 = module0038.f2835(var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (NIL != Sequences.search((SubLObject)$ic53$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                                    var6 = reader.read_from_string(module0038.f2623(var11, module0048.f_1X(Sequences.search((SubLObject)$ic54$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject var10_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var5);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var5);
                            if (var9.isStream()) {
                                streams_high.close(var9, (SubLObject)UNPROVIDED);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var10_78, var5);
                        }
                    }
                }
                catch (Throwable var12) {
                    Errors.handleThrowable(var12, (SubLObject)NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var8, var5);
            }
        }
        catch (Throwable var13) {
            var7 = Errors.handleThrowable(var13, (SubLObject)$ic48$);
        }
        finally {
            var5.throwStack.pop();
        }
        return var6;
    }
    
    public static SubLObject f7626(final SubLObject var79, final SubLObject var80) {
        final SubLObject var81 = f7624();
        if (!var81.isNumber() || var81.numE(var80)) {
            return var79;
        }
        final SubLObject var82 = Numbers.divide(var80, var81);
        SubLObject var83 = (SubLObject)NIL;
        SubLObject var84 = var79;
        SubLObject var85 = (SubLObject)NIL;
        var85 = var84.first();
        while (NIL != var84) {
            var83 = (SubLObject)ConsesLow.cons(Numbers.multiply(var85, var82), var83);
            var84 = var84.rest();
            var85 = var84.first();
        }
        return Sequences.nreverse(var83);
    }
    
    public static SubLObject f7627() {
        return (SubLObject)$ic47$;
    }
    
    public static SubLObject f7628(final SubLObject var85) {
        return Equality.eq(var85, f7627());
    }
    
    public static SubLObject f7629(final SubLObject var85) {
        return (SubLObject)makeBoolean(NIL == f7628(var85));
    }
    
    public static SubLObject f7630(final SubLObject var86, final SubLObject var87) {
        SubLObject var89;
        final SubLObject var88 = var89 = var86.rest();
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic55$);
        var90 = var89.first();
        var89 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic55$);
        var91 = var89.first();
        final SubLObject var92;
        var89 = (var92 = var89.rest());
        return (SubLObject)ConsesLow.list((SubLObject)$ic56$, var90, (SubLObject)ConsesLow.listS((SubLObject)$ic57$, var91, ConsesLow.append(var92, (SubLObject)NIL)));
    }
    
    public static SubLObject f7631(final SubLObject var86, final SubLObject var87) {
        SubLObject var89;
        final SubLObject var88 = var89 = var86.rest();
        SubLObject var90 = (SubLObject)NIL;
        SubLObject var91 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic55$);
        var90 = var89.first();
        var89 = var89.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var89, var88, (SubLObject)$ic55$);
        var91 = var89.first();
        final SubLObject var92;
        var89 = (var92 = var89.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)$ic58$, var90, var91, ConsesLow.append(var92, (SubLObject)NIL));
    }
    
    public static SubLObject f7632(SubLObject var94) {
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)$ic59$;
        }
        Storage.room(var94);
        streams_high.force_output((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7633(final SubLObject var85) {
        return (SubLObject)makeBoolean(var85.isList() && NIL != module0035.f2370((SubLObject)$ic60$, var85, (SubLObject)UNPROVIDED));
    }
    
    public static SubLObject f7634(final SubLObject var85) {
        return (SubLObject)makeBoolean(NIL != module0035.f1998(var85) && var85.first().isSymbol());
    }
    
    public static SubLObject f7635(final SubLObject var95) {
        assert NIL != f7633(var95) : var95;
        return Mapping.mapcar((SubLObject)$ic62$, var95);
    }
    
    public static SubLObject f7636(final SubLObject var95) {
        assert NIL != f7633(var95) : var95;
        return Mapping.mapcar((SubLObject)$ic63$, var95);
    }
    
    public static SubLObject f7637() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7573", "S#9561", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7574", "S#9396", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7575", "S#9562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7576", "SYSTEM-CODE-INITIALIZATIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7577", "S#9563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7584", "SYSTEM-CODE-INITIALIZATIONS-RUN-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7585", "S#5863", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7578", "S#9564", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7579", "S#9565", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7580", "S#9566", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7581", "S#9567", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7582", "S#9568", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7583", "SYSTEM-KB-INITIALIZATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7588", "S#9569", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7591", "S#9570", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7590", "S#9571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7587", "S#9572", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7593", "S#9573", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7594", "S#9574", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7596", "S#9575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7592", "S#9576", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7597", "S#9577", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7595", "S#9578", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7598", "S#9579", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7589", "S#9580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7599", "S#9581", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7600", "S#9582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7601", "S#9583", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7602", "S#9584", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7603", "S#9585", 5, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7604", "S#9586", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7605", "S#9587", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7606", "S#9588", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7607", "S#9589", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7608", "S#9590", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7609", "S#9591", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7610", "S#9592", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7611", "S#9593", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7612", "S#9594", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7613", "S#9595", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7614", "S#9596", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7615", "S#9597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7616", "S#9598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7617", "S#9599", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7618", "S#9600", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7619", "S#9601", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7620", "S#9602", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7621", "HOSTNAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7622", "S#9603", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7623", "S#5257", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7624", "S#9604", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7586", "S#9605", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7625", "S#9606", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7626", "S#9607", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7627", "S#4341", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7628", "S#4342", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7629", "S#361", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0107", "f7630", "S#749");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0107", "f7631", "S#9608");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7632", "S#9609", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7633", "S#9610", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7634", "S#9611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7635", "S#9612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0107", "f7636", "S#9613", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7638() {
        $g1359$ = SubLFiles.defconstant("S#9614", (SubLObject)$ic1$);
        $g1360$ = SubLFiles.deflexical("S#9615", (NIL != Symbols.boundp((SubLObject)$ic2$)) ? $g1360$.getGlobalValue() : Environment.get_process_id((SubLObject)UNPROVIDED));
        $g1361$ = SubLFiles.deflexical("S#9616", (NIL != Symbols.boundp((SubLObject)$ic3$)) ? $g1361$.getGlobalValue() : Locks.make_lock((SubLObject)$ic4$));
        $g1363$ = SubLFiles.deflexical("S#9617", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic8$)) ? $g1363$.getGlobalValue() : NIL));
        $g1364$ = SubLFiles.deflexical("S#9618", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic9$)) ? $g1364$.getGlobalValue() : NIL));
        $g1365$ = SubLFiles.deflexical("S#9619", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic10$)) ? $g1365$.getGlobalValue() : NIL));
        $g1366$ = SubLFiles.deflexical("S#9620", (SubLObject)NIL);
        $g1367$ = SubLFiles.deflexical("S#9621", (SubLObject)$ic47$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f7639() {
        module0003.f57((SubLObject)$ic2$);
        module0003.f57((SubLObject)$ic3$);
        module0002.f38((SubLObject)$ic6$);
        module0003.f57((SubLObject)$ic8$);
        module0003.f57((SubLObject)$ic9$);
        module0003.f57((SubLObject)$ic10$);
        module0034.f1909((SubLObject)$ic42$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f7637();
    }
    
    public void initializeVariables() {
        f7638();
    }
    
    public void runTopLevelForms() {
        f7639();
    }
    
    static {
        me = (SubLFile)new module0107();
        $g1359$ = null;
        $g1360$ = null;
        $g1361$ = null;
        $g1363$ = null;
        $g1364$ = null;
        $g1365$ = null;
        $g1366$ = null;
        $g1367$ = null;
        $ic0$ = makeString("Copyright (c) 1995 - 2012 Cycorp.  All rights reserved.");
        $ic1$ = makeString(";; Copyright (c) 1998 - 2012 Cycorp, Inc., All Rights Reserved.\n;; This file and its contents are products of Cycorp, Inc.  They are\n;; released only under specific license agreement with Cycorp, and\n;; must be treated as Cycorp Confidential Information, as per that\n;; license agreement, including translations into another language\n;; (including but not limited to Conceptual Graphs, KIF, Ontolingua,\n;; GFP, LOOM, PowerLOOM, CycL, C, C++, IDL, predicate logic, and\n;; English) and any logically equivalent rearrangement or renaming of\n;; assertion components, terms, or variables.  This paragraph shall\n;; not be altered or removed. This file is provided \"AS IS\", without\n;; any warranty; the cumulative liability of Cycorp for all claims\n;; relating to this file shall not exceed the amount of one dollar.\n;; Cycorp, 7718 Wood Hollow Drive, Suite 250, Austin, TX 78731, USA; \n;; Website: www.cyc.com, Tel: (512) 342-4000.");
        $ic2$ = makeSymbol("S#9615", "CYC");
        $ic3$ = makeSymbol("S#9616", "CYC");
        $ic4$ = makeString("System Code Initializations Lock");
        $ic5$ = makeString("No KB is loaded.  System KB initializations will not be run.");
        $ic6$ = makeSymbol("SYSTEM-CODE-INITIALIZATIONS-RUN-P");
        $ic7$ = makeString("hack!");
        $ic8$ = makeSymbol("S#9617", "CYC");
        $ic9$ = makeSymbol("S#9618", "CYC");
        $ic10$ = makeSymbol("S#9619", "CYC");
        $ic11$ = makeString("Cannot initialize HL KB object caches.");
        $ic12$ = makeString("Do not have a valid location for the HL store caches; ~A is not accessible");
        $ic13$ = makeString("Could not initialize HL store caches from ~A.");
        $ic14$ = makeString("Initializing HL backing store caches from ~A.~%");
        $ic15$ = makeSymbol("S#38", "CYC");
        $ic16$ = makeString("Could not initialize shared symbols from ~A.");
        $ic17$ = makeSymbol("VECTOR");
        $ic18$ = makeString(".");
        $ic19$ = makeString("The caches directory will be wrong under monolithic KB assumptions.");
        $ic20$ = makeString("units/~A/");
        $ic21$ = makeString("Guessing HL Store location of ~A");
        $ic22$ = makeKeyword("CONS");
        $ic23$ = ConsesLow.list(new SubLObject[] { makeKeyword("CONS"), makeKeyword("ADJOIN"), makeKeyword("APPEND"), makeKeyword("UNION"), makeKeyword("CDR"), makeKeyword("CAR"), makeKeyword("RPLACA"), makeKeyword("REMOVE"), makeKeyword("RPLACD"), makeKeyword("REVERSE"), makeKeyword("INC"), makeKeyword("DEC") });
        $ic24$ = makeKeyword("ADJOIN");
        $ic25$ = makeKeyword("APPEND");
        $ic26$ = makeKeyword("UNION");
        $ic27$ = makeKeyword("CDR");
        $ic28$ = makeKeyword("CAR");
        $ic29$ = makeKeyword("REMOVE");
        $ic30$ = makeKeyword("RPLACA");
        $ic31$ = makeKeyword("RPLACD");
        $ic32$ = makeKeyword("REVERSE");
        $ic33$ = makeKeyword("INC");
        $ic34$ = makeKeyword("DEC");
        $ic35$ = ConsesLow.list((SubLObject)makeKeyword("REPLACE"));
        $ic36$ = makeSymbol("LISTP");
        $ic37$ = makeSymbol("S#2028", "CYC");
        $ic38$ = makeSymbol("POSITIVE-INTEGER-P");
        $ic39$ = makeKeyword("TRUE");
        $ic40$ = makeKeyword("FALSE");
        $ic41$ = ConsesLow.list((SubLObject)Characters.CHAR_period);
        $ic42$ = makeSymbol("HOSTNAME");
        $ic43$ = makeSymbol("STRINGP");
        $ic44$ = makeSymbol("S#9620", "CYC");
        $ic45$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic46$ = makeString("Could not get hostname.");
        $ic47$ = makeKeyword("UNINITIALIZED");
        $ic48$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic49$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic50$ = makeString("/proc/cpuinfo");
        $ic51$ = makeKeyword("INPUT");
        $ic52$ = makeString("Unable to open ~S");
        $ic53$ = makeString("bogomips");
        $ic54$ = makeString(":");
        $ic55$ = ConsesLow.list((SubLObject)makeSymbol("S#151", "CYC"), (SubLObject)makeSymbol("S#159", "CYC"), (SubLObject)makeSymbol("&REST"), (SubLObject)makeSymbol("S#160", "CYC"));
        $ic56$ = makeSymbol("PUNLESS");
        $ic57$ = makeSymbol("WARN");
        $ic58$ = makeSymbol("S#749", "CYC");
        $ic59$ = makeKeyword("DEFAULT");
        $ic60$ = makeSymbol("S#9611", "CYC");
        $ic61$ = makeSymbol("S#9610", "CYC");
        $ic62$ = makeSymbol("FIRST");
        $ic63$ = makeSymbol("SECOND");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 368 ms
	
	Decompiled with Procyon 0.5.32.
*/