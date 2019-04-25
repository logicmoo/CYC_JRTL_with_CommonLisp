package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0602 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0602";
    public static final String myFingerPrint = "5661e6ef928787d495a9aff632259403c4d53b2bcbd436e41f089e2379dae2f1";
    private static SubLSymbol $g4661$;
    private static SubLSymbol $g4662$;
    private static SubLSymbol $g4663$;
    private static SubLSymbol $g4664$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLString $ic2$;
    private static final SubLList $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    
    public static SubLObject f36818(final SubLObject var1, final SubLObject var2, final SubLObject var3, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = module0559.$g4032$.getDynamicValue();
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != Types.listp(var2) : var2;
        assert NIL != Types.hash_table_p(var3) : var3;
        var5.resetMultipleValues();
        final SubLObject var6 = f36819(var2, var3);
        final SubLObject var7 = var5.secondMultipleValue();
        var5.resetMultipleValues();
        module0559.f34497(var1, var6, var4);
        return var7;
    }
    
    public static SubLObject f36819(final SubLObject var2, final SubLObject var8) {
        assert NIL != Types.listp(var2) : var2;
        assert NIL != Types.hash_table_p(var8) : var8;
        final SubLObject var9 = Numbers.add(Sequences.length(var2), Hashtables.hash_table_count(var8));
        final SubLObject var10 = module0559.f34479(var9);
        SubLObject var11 = (SubLObject)NIL;
        SubLObject var12 = var2;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            final SubLObject var14 = constants_high_oc.f10743(var13);
            final SubLObject var15 = constants_high_oc.f10757(var13);
            final SubLObject var16 = constants_high_oc.f10749(var13);
            final SubLObject var17 = module0540.f33502(module0126.f8395(var14, (SubLObject)UNPROVIDED));
            Hashtables.sethash(var15, var10, var17);
            Hashtables.sethash(var16, var10, var17);
            var11 = (SubLObject)ConsesLow.cons(var17, var11);
            var12 = var12.rest();
            var13 = var12.first();
        }
        SubLObject var18 = (SubLObject)NIL;
        SubLObject var19 = (SubLObject)NIL;
        final Iterator var20 = Hashtables.getEntrySetIterator(var8);
        try {
            while (Hashtables.iteratorHasNext(var20)) {
                final Map.Entry var21 = Hashtables.iteratorNextEntry(var20);
                var18 = Hashtables.getEntryKey(var21);
                var19 = Hashtables.getEntryValue(var21);
                Hashtables.sethash(var18, var10, var19);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(var20);
        }
        return Values.values(var10, var11);
    }
    
    public static SubLObject f36820(final SubLObject var1, final SubLObject var20, SubLObject var4) {
        if (var4 == UNPROVIDED) {
            var4 = module0559.$g4032$.getDynamicValue();
        }
        assert NIL != Types.hash_table_p(var20) : var20;
        final SubLObject var21 = module0021.f1060(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var23;
        final SubLObject var22 = var23 = module0021.f1060(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var24 = (SubLObject)NIL;
        var24 = var23.first();
        while (NIL != var23) {
            if (NIL == Hashtables.gethash_without_values(constants_high_oc.f10757(var24), var20, (SubLObject)UNPROVIDED)) {
                Errors.error((SubLObject)$ic2$, var24);
            }
            var23 = var23.rest();
            var24 = var23.first();
        }
        return f36818(var1, var21, var20, var4);
    }
    
    public static SubLObject f36821(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        assert NIL != Types.listp(var2) : var2;
        assert NIL != Types.listp(var3) : var3;
        final SubLObject var4 = f36822(var2);
        module0021.f1038(var2, var1);
        module0021.f1038(var3, var1);
        module0559.f34398(var1, var4);
        return var1;
    }
    
    public static SubLObject f36823(final SubLObject var23) {
        assert NIL != Types.listp(var23) : var23;
        final SubLObject var24 = Hashtables.make_hash_table(Sequences.length(var23), Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED);
        SubLObject var25 = var23;
        SubLObject var26 = (SubLObject)NIL;
        var26 = var25.first();
        while (NIL != var25) {
            SubLObject var28;
            final SubLObject var27 = var28 = var26;
            SubLObject var29 = (SubLObject)NIL;
            SubLObject var30 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)$ic3$);
            var29 = var28.first();
            var28 = var28.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var28, var27, (SubLObject)$ic3$);
            var30 = var28.first();
            var28 = var28.rest();
            if (NIL == var28) {
                Hashtables.sethash(constants_high_oc.f10757(var29), var24, var30);
                Hashtables.sethash(constants_high_oc.f10749(var29), var24, var30);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var27, (SubLObject)$ic3$);
            }
            var25 = var25.rest();
            var26 = var25.first();
        }
        return var24;
    }
    
    public static SubLObject f36822(final SubLObject var2) {
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = var2;
        SubLObject var6 = (SubLObject)NIL;
        var6 = var5.first();
        while (NIL != var5) {
            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic4$, var6), var3);
            if (NIL != module0269.f17731(var6)) {
                var4 = (SubLObject)ConsesLow.cons(var6, var4);
            }
            var5 = var5.rest();
            var6 = var5.first();
        }
        var5 = Sequences.nreverse(var4);
        SubLObject var7 = (SubLObject)NIL;
        var7 = var5.first();
        while (NIL != var5) {
            var3 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic5$, (SubLObject)$ic6$, var7), var3);
            var5 = var5.rest();
            var7 = var5.first();
        }
        return Sequences.nreverse(var3);
    }
    
    public static SubLObject f36824(final SubLObject var32, final SubLObject var33, SubLObject var34) {
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        assert NIL != module0035.f2015(var32) : var32;
        SubLObject var36 = var32;
        SubLObject var37 = (SubLObject)NIL;
        var37 = var36.first();
        while (NIL != var36) {
            assert NIL != assertion_handles_oc.f11035(var37) : var37;
            var36 = var36.rest();
            var37 = var36.first();
        }
        final SubLObject var38 = $g4662$.currentBinding(var35);
        final SubLObject var39 = module0559.$g4035$.currentBinding(var35);
        try {
            $g4662$.bind(var32, var35);
            module0559.$g4035$.bind(var34, var35);
            return module0559.f34397(var33, $g4661$.getDynamicValue(var35));
        }
        finally {
            module0559.$g4035$.rebind(var39, var35);
            $g4662$.rebind(var38, var35);
        }
    }
    
    public static SubLObject f36825() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = $g4662$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)NIL;
        var7 = var6.first();
        while (NIL != var6) {
            module0559.f34351(var7);
            var6 = var6.rest();
            var7 = var6.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36826(final SubLObject var40, final SubLObject var33) {
        final SubLThread var41 = SubLProcess.currentSubLThread();
        assert NIL != kb_compare_oc.f36434(var40) : var40;
        final SubLObject var42 = $g4664$.currentBinding(var41);
        try {
            $g4664$.bind(var40, var41);
            return module0559.f34397(var33, $g4663$.getDynamicValue(var41));
        }
        finally {
            $g4664$.rebind(var42, var41);
        }
    }
    
    public static SubLObject f36827() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0077.f5333(kb_compare_oc.f36454($g4663$.getDynamicValue(var5)));
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10)) {
                module0559.f34347(var10);
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
            }
        }
        return var6;
    }
    
    public static SubLObject f36828() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0077.f5333(kb_compare_oc.f36455($g4663$.getDynamicValue(var5)));
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10)) {
                module0559.f34347(var10);
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
            }
        }
        return var6;
    }
    
    public static SubLObject f36829() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0077.f5333(kb_compare_oc.f36456($g4663$.getDynamicValue(var5)));
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10)) {
                module0559.f34347(var10);
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
            }
        }
        return var6;
    }
    
    public static SubLObject f36830() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = module0077.f5333(kb_compare_oc.f36457($g4663$.getDynamicValue(var5)));
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10)) {
                module0559.f34347(var10);
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
            }
        }
        return var6;
    }
    
    public static SubLObject f36831(final SubLObject var31) {
        if (NIL != module0158.f10270(var31, (SubLObject)NIL)) {
            final SubLObject var32 = module0158.f10271(var31);
            SubLObject var33 = (SubLObject)NIL;
            try {
                var33 = module0158.f10316(var32, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var34 = (SubLObject)NIL;
                final SubLObject var35 = (SubLObject)NIL;
                while (NIL == var34) {
                    final SubLObject var36 = module0052.f3695(var33, var35);
                    final SubLObject var37 = (SubLObject)makeBoolean(!var35.eql(var36));
                    if (NIL != var37) {
                        module0559.f34347(var36);
                        SubLObject var38 = module0205.f13175(var36, (SubLObject)T);
                        SubLObject var39 = (SubLObject)NIL;
                        var39 = var38.first();
                        while (NIL != var38) {
                            if (NIL != f36832(var39, var31)) {
                                module0559.f34356(var39);
                            }
                            var38 = var38.rest();
                            var39 = var38.first();
                        }
                    }
                    var34 = (SubLObject)makeBoolean(NIL == var37);
                }
            }
            finally {
                final SubLObject var40 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                    if (NIL != var33) {
                        module0158.f10319(var33);
                    }
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var40);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36832(final SubLObject var54, final SubLObject var31) {
        if (NIL != assertion_handles_oc.f11035(var54)) {
            return module0161.f10514(var31, module0178.f11287(var54));
        }
        SubLObject var55 = module0172.f10943(var54);
        SubLObject var56 = (SubLObject)NIL;
        var56 = var55.first();
        while (NIL != var55) {
            if (NIL == module0161.f10514(var31, module0178.f11287(var56))) {
                return (SubLObject)NIL;
            }
            var55 = var55.rest();
            var56 = var55.first();
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f36833(final SubLObject var56) {
        final SubLThread var57 = SubLProcess.currentSubLThread();
        module0559.f34353(var56);
        final SubLObject var58 = module0147.$g2094$.currentBinding(var57);
        final SubLObject var59 = module0147.$g2095$.currentBinding(var57);
        try {
            module0147.$g2094$.bind((SubLObject)$ic19$, var57);
            module0147.$g2095$.bind($ic20$, var57);
            assert NIL != Functions.funcall((SubLObject)makeSymbol("S#40613", "CYC"), var56) : var56;
            final SubLObject var60 = module0226.f15152(var56);
            final SubLObject var61 = Functions.funcall((SubLObject)makeSymbol("S#40614", "CYC"), var56);
            if (NIL != module0269.f17731(var60)) {
                f36831(var60);
            }
            if (NIL != module0269.f17731(var61)) {
                f36831(var61);
            }
            if (NIL != module0158.f10054(var56, (SubLObject)NIL, (SubLObject)NIL)) {
                final SubLObject var62 = module0158.f10055(var56, (SubLObject)NIL, (SubLObject)NIL);
                SubLObject var63 = (SubLObject)NIL;
                final SubLObject var64 = (SubLObject)NIL;
                while (NIL == var63) {
                    final SubLObject var65 = module0052.f3695(var62, var64);
                    final SubLObject var66 = (SubLObject)makeBoolean(!var64.eql(var65));
                    if (NIL != var66) {
                        SubLObject var67 = (SubLObject)NIL;
                        try {
                            var67 = module0158.f10316(var65, (SubLObject)$ic22$, (SubLObject)NIL, (SubLObject)NIL);
                            SubLObject var51_61 = (SubLObject)NIL;
                            final SubLObject var52_62 = (SubLObject)NIL;
                            while (NIL == var51_61) {
                                final SubLObject var68 = module0052.f3695(var67, var52_62);
                                final SubLObject var53_64 = (SubLObject)makeBoolean(!var52_62.eql(var68));
                                if (NIL != var53_64) {
                                    final SubLObject var69 = module0178.f11334(var68);
                                    assert NIL != module0167.f10813(var69) : var69;
                                    if (NIL != module0269.f17731(var69)) {
                                        f36831(var69);
                                    }
                                }
                                var51_61 = (SubLObject)makeBoolean(NIL == var53_64);
                            }
                        }
                        finally {
                            final SubLObject var37_65 = Threads.$is_thread_performing_cleanupP$.currentBinding(var57);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var57);
                                if (NIL != var67) {
                                    module0158.f10319(var67);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var37_65, var57);
                            }
                        }
                    }
                    var63 = (SubLObject)makeBoolean(NIL == var66);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var59, var57);
            module0147.$g2094$.rebind(var58, var57);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36834() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36818", "S#40615", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36819", "S#40616", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36820", "S#40617", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36821", "S#40618", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36823", "S#40619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36822", "S#40620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36824", "S#40621", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36825", "S#40622", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36826", "S#40623", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36827", "S#40624", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36828", "S#40625", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36829", "S#40626", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36830", "S#40627", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36831", "S#40628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36832", "S#40629", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0602", "f36833", "S#40630", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36835() {
        $g4661$ = SubLFiles.defparameter("S#40631", (SubLObject)$ic7$);
        $g4662$ = SubLFiles.defparameter("S#40632", (SubLObject)NIL);
        $g4663$ = SubLFiles.defparameter("S#40633", (SubLObject)$ic12$);
        $g4664$ = SubLFiles.defparameter("S#40634", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f36836() {
        module0012.f419((SubLObject)$ic11$);
        module0012.f419((SubLObject)$ic14$);
        module0012.f419((SubLObject)$ic15$);
        module0012.f419((SubLObject)$ic16$);
        module0012.f419((SubLObject)$ic17$);
        module0012.f419((SubLObject)$ic18$);
        module0012.f419((SubLObject)$ic24$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f36834();
    }
    
    public void initializeVariables() {
        f36835();
    }
    
    public void runTopLevelForms() {
        f36836();
    }
    
    static {
        me = (SubLFile)new module0602();
        $g4661$ = null;
        $g4662$ = null;
        $g4663$ = null;
        $g4664$ = null;
        $ic0$ = makeSymbol("LISTP");
        $ic1$ = makeSymbol("HASH-TABLE-P");
        $ic2$ = makeString("Mismatch between parameterization and actualization list: no actual for ~S~%");
        $ic3$ = ConsesLow.list((SubLObject)makeSymbol("S#723", "CYC"), (SubLObject)makeSymbol("S#40635", "CYC"));
        $ic4$ = makeKeyword("TERM");
        $ic5$ = makeKeyword("FUNCTION");
        $ic6$ = makeSymbol("S#37624", "CYC");
        $ic7$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#40622", "CYC")));
        $ic8$ = makeSymbol("S#747", "CYC");
        $ic9$ = makeSymbol("ASSERTION-P");
        $ic10$ = makeSymbol("S#5859", "CYC");
        $ic11$ = makeSymbol("S#40622", "CYC");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#40624", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#40625", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#40626", "CYC")), (SubLObject)ConsesLow.list((SubLObject)makeKeyword("FUNCTION"), (SubLObject)makeSymbol("S#40627", "CYC")));
        $ic13$ = makeSymbol("S#40110", "CYC");
        $ic14$ = makeSymbol("S#40624", "CYC");
        $ic15$ = makeSymbol("S#40625", "CYC");
        $ic16$ = makeSymbol("S#40626", "CYC");
        $ic17$ = makeSymbol("S#40627", "CYC");
        $ic18$ = makeSymbol("S#40628", "CYC");
        $ic19$ = makeSymbol("S#12274", "CYC");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic21$ = makeSymbol("S#40613", "CYC");
        $ic22$ = makeKeyword("GAF");
        $ic23$ = makeSymbol("NART-P");
        $ic24$ = makeSymbol("S#40630", "CYC");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 211 ms
	
	Decompiled with Procyon 0.5.32.
*/