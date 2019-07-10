package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0026 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0026";
    public static final String myFingerPrint = "764b942df1c10c5bacd6c6f025b21f1ff18e468ff2a9c2882884950e0621b132";
    public static SubLSymbol $g822$;
    public static SubLSymbol $g823$;
    public static SubLSymbol $g824$;
    public static SubLSymbol $g825$;
    public static SubLSymbol $g826$;
    public static SubLSymbol $g827$;
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
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLList $ic22$;
    private static final SubLList $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLString $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLSymbol $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLList $ic50$;
    private static final SubLList $ic51$;
    private static final SubLList $ic52$;
    private static final SubLList $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLList $ic56$;
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
    private static final SubLString $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLList $ic78$;
    private static final SubLList $ic79$;
    private static final SubLList $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLList $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLString $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLString $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLString $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLString $ic106$;
    private static final SubLString $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLString $ic113$;
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
    private static final SubLString $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLSymbol $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
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
    
    public static SubLObject f1312(final SubLObject var1, final SubLObject var2) {
        f1313(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1314(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX2396_native.class) ? T : NIL);
    }
    
    public static SubLObject f1315(final SubLObject var1) {
        assert NIL != f1314(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f1316(final SubLObject var1, final SubLObject var4) {
        assert NIL != f1314(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f1317(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX2396_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic11$)) {
                f1316(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f1318(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic13$, (SubLObject)$ic14$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic15$, (SubLObject)$ic11$, f1315(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic14$, (SubLObject)ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f1319(final SubLObject var11, final SubLObject var12) {
        return f1318(var11, var12);
    }
    
    public static SubLObject f1320(final SubLObject var1, final SubLObject var2) {
        f1321(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1322(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX2400_native.class) ? T : NIL);
    }
    
    public static SubLObject f1323(final SubLObject var1) {
        assert NIL != f1322(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f1324(final SubLObject var1, final SubLObject var4) {
        assert NIL != f1322(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f1325(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX2400_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic29$)) {
                f1324(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f1326(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic13$, (SubLObject)$ic30$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic15$, (SubLObject)$ic29$, f1323(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic30$, (SubLObject)ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f1327(final SubLObject var11, final SubLObject var12) {
        return f1326(var11, var12);
    }
    
    public static SubLObject f1328() {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        final SubLObject var16 = f1317((SubLObject)UNPROVIDED);
        f1316(var16, SubLMain.get_red_object());
        f1329();
        return var16;
    }
    
    public static SubLObject f1313(final SubLObject var17, final SubLObject var2, final SubLObject var18) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        if (NIL != f1315(var17)) {
            final SubLObject var19 = f1315(var17);
            final SubLObject var20 = f1330((SubLObject)UNPROVIDED);
            final SubLObject var21 = f1331((SubLObject)UNPROVIDED);
            PrintLow.format(var2, (SubLObject)$ic33$, new SubLObject[] { var19, Functions.funcall((SubLObject)$ic34$, var19), Functions.funcall((SubLObject)$ic35$, var19), Functions.funcall((SubLObject)$ic36$, var19), Functions.funcall((SubLObject)$ic37$, var19), var20, var21 });
        }
        else {
            PrintLow.format(var2, (SubLObject)$ic38$);
        }
        return var17;
    }
    
    public static SubLObject f1332(final SubLObject var22) {
        assert NIL != Types.stringp(var22) : var22;
        final SubLObject var23 = f1333(var22);
        if (NIL == var23) {
            return (SubLObject)NIL;
        }
        final SubLObject var24 = f1325((SubLObject)UNPROVIDED);
        f1324(var24, var22);
        return var24;
    }
    
    public static SubLObject f1334(final SubLObject var23) {
        if (NIL == var23) {
            return (SubLObject)NIL;
        }
        final SubLObject var24 = f1335(var23);
        if (NIL == var24) {
            return (SubLObject)NIL;
        }
        final SubLObject var25 = f1325((SubLObject)UNPROVIDED);
        f1324(var25, var24);
        return var25;
    }
    
    public static SubLObject f1336(final SubLObject var25) {
        final SubLObject var26 = f1323(var25);
        return f1337(var26);
    }
    
    public static SubLObject f1321(final SubLObject var17, final SubLObject var2, final SubLObject var18) {
        final SubLObject var19 = f1336(var17);
        final SubLObject var20 = f1338(var17);
        if (NIL == var20) {
            PrintLow.format(var2, (SubLObject)$ic40$, var19);
            return var17;
        }
        PrintLow.format(var2, (SubLObject)$ic41$, new SubLObject[] { Functions.funcall((SubLObject)$ic42$, var19), Functions.funcall((SubLObject)$ic43$, var19), Functions.funcall((SubLObject)$ic44$, var19), Functions.funcall((SubLObject)$ic45$, var19), Functions.funcall((SubLObject)$ic46$, var19) });
        return var17;
    }
    
    public static SubLObject f1338(final SubLObject var27) {
        assert NIL != f1322(var27) : var27;
        final SubLObject var28 = f1336(var27);
        if (NIL == var28) {
            return (SubLObject)NIL;
        }
        final SubLObject var29 = Functions.funcall((SubLObject)$ic47$, f1339(), var28);
        if (var29.eql((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f1340(final SubLObject var29) {
        if (NIL == var29) {
            return (SubLObject)NIL;
        }
        if (!var29.isNumber()) {
            return (SubLObject)NIL;
        }
        if (NIL == var29) {
            return (SubLObject)NIL;
        }
        final SubLObject var30 = Functions.funcall((SubLObject)$ic47$, f1339(), var29);
        if (var30.eql((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f1341(final SubLObject var1, final SubLObject var2) {
        f1342(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1343(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX2412_native.class) ? T : NIL);
    }
    
    public static SubLObject f1344(final SubLObject var1) {
        assert NIL != f1343(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f1345(final SubLObject var1, final SubLObject var4) {
        assert NIL != f1343(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f1346(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX2412_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic59$)) {
                f1345(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f1347(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic13$, (SubLObject)$ic60$, (SubLObject)ONE_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic15$, (SubLObject)$ic59$, f1344(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic60$, (SubLObject)ONE_INTEGER);
        return var11;
    }
    
    public static SubLObject f1348(final SubLObject var11, final SubLObject var12) {
        return f1347(var11, var12);
    }
    
    public static SubLObject f1349(final SubLObject var33) {
        f1350();
        if (var33.eql((SubLObject)$ic62$) || var33.eql((SubLObject)$ic63$) || var33.eql((SubLObject)$ic64$) || var33.eql((SubLObject)$ic65$) || var33.eql((SubLObject)$ic66$) || var33.eql((SubLObject)$ic67$) || var33.eql((SubLObject)$ic68$)) {
            final SubLObject var34 = f1346((SubLObject)UNPROVIDED);
            f1345(var34, var33);
            return var34;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1342(final SubLObject var17, final SubLObject var2, final SubLObject var18) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        PrintLow.format(var2, (SubLObject)$ic69$, f1344(var17));
        return var17;
    }
    
    public static SubLObject f1351(final SubLObject var17, final SubLObject var2, final SubLObject var18) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        final SubLObject var19 = f1352(var17);
        try {
            if (NIL == var19) {
                PrintLow.format(var2, (SubLObject)$ic70$);
            }
            else {
                final SubLObject var20 = f1353(var17);
                SubLObject var21 = (SubLObject)ZERO_INTEGER;
                if (var20.eql((SubLObject)ZERO_INTEGER)) {
                    PrintLow.format(var2, (SubLObject)$ic70$);
                }
                else {
                    PrintLow.format(var2, (SubLObject)$ic71$, f1353(var17));
                    while (var21.numL(var20)) {
                        PrintLow.format(var2, (SubLObject)$ic72$, f1334(Functions.funcall((SubLObject)$ic73$, var19, var21)));
                        var21 = Numbers.add(var21, (SubLObject)ONE_INTEGER);
                    }
                    PrintLow.format(var2, (SubLObject)$ic74$);
                }
            }
        }
        finally {
            final SubLObject var22 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f1354(var19);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var22);
            }
        }
        return var17;
    }
    
    public static SubLObject f1355(final SubLObject var1, final SubLObject var2) {
        f1356(var1, var2, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1357(final SubLObject var1) {
        return (SubLObject)((var1.getClass() == $sX2416_native.class) ? T : NIL);
    }
    
    public static SubLObject f1358(final SubLObject var1) {
        assert NIL != f1357(var1) : var1;
        return var1.getField2();
    }
    
    public static SubLObject f1359(final SubLObject var1) {
        assert NIL != f1357(var1) : var1;
        return var1.getField3();
    }
    
    public static SubLObject f1360(final SubLObject var1, final SubLObject var4) {
        assert NIL != f1357(var1) : var1;
        return var1.setField2(var4);
    }
    
    public static SubLObject f1361(final SubLObject var1, final SubLObject var4) {
        assert NIL != f1357(var1) : var1;
        return var1.setField3(var4);
    }
    
    public static SubLObject f1362(SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var6 = (SubLObject)new $sX2416_native();
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var7 = (SubLObject)NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr(var7)) {
            var8 = var7.first();
            var9 = conses_high.cadr(var7);
            var10 = var8;
            if (var10.eql((SubLObject)$ic88$)) {
                f1360(var6, var9);
            }
            else if (var10.eql((SubLObject)$ic89$)) {
                f1361(var6, var9);
            }
            else {
                Errors.error((SubLObject)$ic12$, var8);
            }
        }
        return var6;
    }
    
    public static SubLObject f1363(final SubLObject var11, final SubLObject var12) {
        Functions.funcall(var12, var11, (SubLObject)$ic13$, (SubLObject)$ic90$, (SubLObject)TWO_INTEGER);
        Functions.funcall(var12, var11, (SubLObject)$ic15$, (SubLObject)$ic88$, f1358(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic15$, (SubLObject)$ic89$, f1359(var11));
        Functions.funcall(var12, var11, (SubLObject)$ic16$, (SubLObject)$ic90$, (SubLObject)TWO_INTEGER);
        return var11;
    }
    
    public static SubLObject f1364(final SubLObject var11, final SubLObject var12) {
        return f1363(var11, var12);
    }
    
    public static SubLObject f1365(final SubLObject var41, final SubLObject var42) {
        assert NIL != f1343(var41) : var41;
        assert NIL != Types.stringp(var42) : var42;
        final SubLObject var43 = f1362((SubLObject)UNPROVIDED);
        f1360(var43, var41);
        f1361(var43, var42);
        return var43;
    }
    
    public static SubLObject f1356(final SubLObject var17, final SubLObject var2, final SubLObject var18) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        assert NIL != f1357(var17) : var17;
        final SubLObject var19 = f1366(var17);
        try {
            if (NIL == var19) {
                PrintLow.format(var2, (SubLObject)$ic92$, f1359(var17));
            }
            else {
                final SubLObject var20 = Functions.funcall((SubLObject)$ic93$, var19);
                if (NIL != var20) {
                    final SubLObject var21 = Functions.funcall((SubLObject)$ic94$, var20);
                    final SubLObject var22 = f1367(var19);
                    PrintLow.format(var2, (SubLObject)$ic95$, f1359(var17), var21);
                    final SubLObject var23 = var22;
                    if (var23.eql((SubLObject)$ic96$)) {
                        PrintLow.format(var2, (SubLObject)$ic97$, Functions.funcall((SubLObject)$ic98$, var20));
                    }
                    else if (var23.eql((SubLObject)$ic99$)) {
                        PrintLow.format(var2, (SubLObject)$ic100$, Functions.funcall((SubLObject)$ic101$, var20));
                    }
                    else if (var23.eql((SubLObject)$ic102$)) {
                        PrintLow.format(var2, (SubLObject)$ic103$);
                        final SubLObject var24 = module0025.f1296(var20);
                        for (SubLObject var25 = Sequences.length(var24), var26 = (SubLObject)ZERO_INTEGER; var26.numL(var25); var26 = Numbers.add(var26, (SubLObject)ONE_INTEGER)) {
                            SubLObject var27 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic104$, Vectors.aref(var24, var26));
                            if (Sequences.length(var27).numE((SubLObject)ONE_INTEGER)) {
                                var27 = Sequences.cconcatenate((SubLObject)$ic105$, var27);
                            }
                            PrintLow.format(var2, (SubLObject)$ic106$, var27);
                        }
                        PrintLow.format(var2, (SubLObject)$ic107$);
                    }
                    else if (var23.eql((SubLObject)$ic108$)) {
                        PrintLow.format(var2, (SubLObject)$ic109$);
                    }
                    PrintLow.format(var2, (SubLObject)$ic110$);
                }
                else {
                    PrintLow.format(var2, (SubLObject)$ic92$, f1359(var17));
                }
            }
        }
        finally {
            final SubLObject var28 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f1368(var19);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var28);
            }
        }
        return var17;
    }
    
    public static SubLObject f1353(final SubLObject var34) {
        f1350();
        assert NIL != f1343(var34) : var34;
        final SubLObject var36;
        final SubLObject var35 = var36 = f1344(var34);
        if (var36.eql((SubLObject)$ic62$)) {
            final SubLObject var37 = f1330((SubLObject)UNPROVIDED);
            if (NIL != var37) {
                return (SubLObject)ONE_INTEGER;
            }
            return (SubLObject)ZERO_INTEGER;
        }
        else if (var36.eql((SubLObject)$ic63$)) {
            final SubLObject var38 = f1331((SubLObject)UNPROVIDED);
            if (NIL != var38) {
                return (SubLObject)ONE_INTEGER;
            }
            return (SubLObject)ZERO_INTEGER;
        }
        else {
            if (var36.eql((SubLObject)$ic64$) || var36.eql((SubLObject)$ic65$)) {
                final SubLObject var38 = f1331((SubLObject)UNPROVIDED);
                final SubLObject var39 = f1330((SubLObject)UNPROVIDED);
                SubLObject var40 = (SubLObject)ZERO_INTEGER;
                if (NIL != var38) {
                    var40 = Numbers.add(var40, (SubLObject)ONE_INTEGER);
                }
                if (NIL != var39) {
                    var40 = Numbers.add(var40, (SubLObject)ONE_INTEGER);
                }
                return var40;
            }
            if (var36.eql((SubLObject)$ic66$)) {
                final SubLObject var41 = f1339();
                return Functions.funcall((SubLObject)$ic37$, var41);
            }
            if (var36.eql((SubLObject)$ic67$) || var36.eql((SubLObject)$ic68$)) {
                final SubLObject var41 = f1339();
                return Functions.funcall((SubLObject)$ic111$, var41);
            }
            return (SubLObject)MINUS_ONE_INTEGER;
        }
    }
    
    public static SubLObject f1369(final SubLObject var52) {
        assert NIL != f1357(var52) : var52;
        return f1359(var52);
    }
    
    public static SubLObject f1370(final SubLObject var52) {
        assert NIL != f1357(var52) : var52;
        final SubLObject var53 = f1366(var52);
        SubLObject var54 = (SubLObject)NIL;
        if (NIL == var53) {
            return var54;
        }
        try {
            var54 = f1367(var53);
        }
        finally {
            final SubLObject var55 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f1368(var53);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var55);
            }
        }
        return var54;
    }
    
    public static SubLObject f1371(final SubLObject var52) {
        assert NIL != f1357(var52) : var52;
        final SubLObject var53 = f1366(var52);
        SubLObject var54 = (SubLObject)NIL;
        if (NIL == var53) {
            return var54;
        }
        try {
            final SubLObject var55 = Functions.funcall((SubLObject)$ic93$, var53);
            final SubLObject var57;
            final SubLObject var56 = var57 = f1367(var53);
            if (var57.eql((SubLObject)$ic96$)) {
                var54 = Functions.funcall((SubLObject)$ic98$, var55);
            }
            else if (var57.eql((SubLObject)$ic99$)) {
                var54 = Functions.funcall((SubLObject)$ic101$, var55);
            }
            else if (var57.eql((SubLObject)$ic102$)) {
                var54 = module0021.f1059(f1372(module0025.f1296(var55)));
            }
            else if (var57.eql((SubLObject)$ic108$)) {
                var54 = (SubLObject)NIL;
            }
        }
        finally {
            final SubLObject var58 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f1368(var53);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var58);
            }
        }
        return var54;
    }
    
    public static SubLObject f1373(final SubLObject var52) {
        assert NIL != f1357(var52) : var52;
        return module0021.f1059(f1371(var52));
    }
    
    public static SubLObject f1374(final SubLObject var41, final SubLObject var42) {
        assert NIL != f1343(var41) : var41;
        assert NIL != Types.stringp(var42) : var42;
        final SubLObject var43 = f1365(var41, var42);
        if (NIL != f1375(var43)) {
            return var43;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1376(final SubLObject var52) {
        assert NIL != f1357(var52) : var52;
        final SubLObject var53 = f1366(var52);
        SubLObject var54 = (SubLObject)NIL;
        if (NIL == var53) {
            return var54;
        }
        try {
            final SubLObject var55 = Functions.funcall((SubLObject)$ic93$, var53);
            if (NIL != var55) {
                var54 = Functions.funcall((SubLObject)$ic93$, var55);
            }
        }
        finally {
            final SubLObject var56 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f1368(var53);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var56);
            }
        }
        return var54;
    }
    
    public static SubLObject f1377(final SubLObject var55, final SubLObject var42) {
        assert NIL != f1357(var55) : var55;
        assert NIL != Types.stringp(var42) : var42;
        final SubLObject var56 = f1359(var55);
        final SubLObject var57 = f1358(var55);
        final SubLObject var58 = f1378(var56, var42);
        return f1374(var57, var58);
    }
    
    public static SubLObject f1379(final SubLObject var52) {
        assert NIL != f1357(var52) : var52;
        SubLObject var53 = f1359(var52);
        final SubLObject var54 = f1358(var52);
        SubLObject var55 = (SubLObject)NIL;
        final SubLObject var56 = f1366(var52);
        if (NIL == var56) {
            return var55;
        }
        try {
            final SubLObject var57 = Functions.funcall((SubLObject)$ic112$, var56);
            if (NIL != var57) {
                try {
                    if (NIL == var53 || ZERO_INTEGER.numE(Sequences.length(var53))) {
                        var53 = (SubLObject)$ic113$;
                    }
                    while (NIL != Numbers.numNE((SubLObject)ZERO_INTEGER, Functions.funcall((SubLObject)$ic114$, var57))) {
                        final SubLObject var58 = Functions.funcall((SubLObject)$ic115$, var57);
                        if (NIL != Numbers.numNE(var58, (SubLObject)ZERO_INTEGER)) {
                            try {
                                SubLObject var59 = Functions.funcall((SubLObject)$ic116$, Functions.funcall((SubLObject)$ic93$, var58));
                                SubLObject var60 = (SubLObject)NIL;
                                var59 = f1378(var53, var59);
                                var60 = f1365(var54, var59);
                                var55 = (SubLObject)ConsesLow.cons(var60, var55);
                            }
                            finally {
                                final SubLObject var61 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                                    Functions.funcall((SubLObject)$ic117$, var58);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var61);
                                }
                            }
                        }
                    }
                }
                finally {
                    final SubLObject var62 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                        Functions.funcall((SubLObject)$ic118$, var57);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var62);
                    }
                }
            }
        }
        finally {
            final SubLObject var63 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f1368(var56);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var63);
            }
        }
        return Sequences.reverse(var55);
    }
    
    public static SubLObject f1380(final SubLObject var52) {
        SubLObject var53 = (SubLObject)NIL;
        final SubLObject var54 = f1379(var52);
        if (NIL == var54) {
            return (SubLObject)NIL;
        }
        SubLObject var55 = var54;
        SubLObject var56 = (SubLObject)NIL;
        var56 = var55.first();
        while (NIL != var55) {
            final SubLObject var57 = f1380(var56);
            var53 = (SubLObject)ConsesLow.cons(var56, var53);
            var53 = ConsesLow.append(var57, var53);
            var55 = var55.rest();
            var56 = var55.first();
        }
        return var53;
    }
    
    public static SubLObject f1381(final SubLObject var68) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        final SubLObject var69 = f1336(var68);
        final SubLObject var70 = f1338(var68);
        final SubLObject var71 = Functions.funcall((SubLObject)$ic119$, var69);
        if (NIL == var70) {
            return (SubLObject)NIL;
        }
        if (NIL == var71) {
            return (SubLObject)NIL;
        }
        return var71;
    }
    
    public static SubLObject f1382(final SubLObject var68) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        final SubLObject var69 = f1336(var68);
        final SubLObject var70 = f1338(var68);
        final SubLObject var71 = Functions.funcall((SubLObject)$ic119$, var69);
        if (NIL == var70) {
            return (SubLObject)NIL;
        }
        if (NIL == var71) {
            return (SubLObject)NIL;
        }
        return f1383((SubLObject)$ic113$, var71);
    }
    
    public static SubLObject f1383(final SubLObject var70, final SubLObject var71) {
        final SubLObject var72 = Functions.funcall((SubLObject)$ic120$, var71);
        SubLObject var73 = (SubLObject)NIL;
        if (NIL == var72) {
            return (SubLObject)NIL;
        }
        while (!Functions.funcall((SubLObject)$ic121$, var72).numE((SubLObject)ZERO_INTEGER)) {
            final SubLObject var74 = Functions.funcall((SubLObject)$ic122$, var72);
            final SubLObject var75 = f1384(var70, var74);
            var73 = (SubLObject)ConsesLow.cons(var75, var73);
            var73 = ConsesLow.append(f1383(var75.first(), var74), var73);
        }
        Functions.funcall((SubLObject)$ic123$, var72);
        return var73;
    }
    
    public static SubLObject f1384(final SubLObject var75, final SubLObject var71) {
        final SubLObject var76 = f1378(var75, Functions.funcall((SubLObject)$ic116$, var71));
        final SubLObject var77 = f1385(Functions.funcall((SubLObject)$ic94$, var71));
        SubLObject var78 = (SubLObject)NIL;
        final SubLObject var79 = var77;
        if (var79.eql((SubLObject)$ic96$)) {
            var78 = Functions.funcall((SubLObject)$ic98$, var71);
        }
        else if (var79.eql((SubLObject)$ic99$)) {
            var78 = Functions.funcall((SubLObject)$ic101$, var71);
        }
        else if (var79.eql((SubLObject)$ic102$)) {
            var78 = f1372(module0025.f1296(var71));
        }
        else if (var79.eql((SubLObject)$ic124$)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)ConsesLow.list(var76, var78, var77);
    }
    
    public static SubLObject f1378(final SubLObject var75, final SubLObject var57) {
        if (var75.equal((SubLObject)$ic113$)) {
            return var57;
        }
        return Sequences.cconcatenate(var75, new SubLObject[] { $ic125$, var57 });
    }
    
    public static SubLObject f1386(final SubLObject var77) {
        final SubLObject var78 = f1336(var77);
        final SubLObject var79 = f1338(var77);
        if (NIL == var79) {
            return (SubLObject)NIL;
        }
        return f1335(var78);
    }
    
    public static SubLObject f1335(final SubLObject var16) {
        final SubLObject var17 = Functions.funcall((SubLObject)$ic126$, var16);
        return var17;
    }
    
    public static SubLObject f1387(final SubLObject var22) {
        final SubLObject var23 = f1388(var22);
        if (NIL == var23) {
            return (SubLObject)NIL;
        }
        return f1334(var23);
    }
    
    public static SubLObject f1388(final SubLObject var22) {
        final SubLObject var23 = module0067.f4884($g823$.getGlobalValue(), var22, (SubLObject)UNPROVIDED);
        if (NIL == var23) {
            return (SubLObject)NIL;
        }
        final SubLObject var24 = Functions.funcall((SubLObject)$ic47$, f1339(), var23);
        if (var24.eql((SubLObject)ZERO_INTEGER)) {
            return (SubLObject)NIL;
        }
        return var23;
    }
    
    public static SubLObject f1389(final SubLObject var29) {
        assert NIL != f1340(var29) : var29;
        final SubLObject var30 = f1335(var29);
        Functions.funcall((SubLObject)$ic128$, var29);
        module0067.f4887($g823$.getGlobalValue(), var30);
        return var30;
    }
    
    public static SubLObject f1329() {
        if (NIL != $g823$.getGlobalValue()) {
            return (SubLObject)NIL;
        }
        $g823$.setGlobalValue(module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        final SubLObject var41 = f1349((SubLObject)$ic68$);
        final SubLObject var42 = f1352(var41);
        try {
            final SubLObject var43 = f1353(var41);
            SubLObject var44 = (SubLObject)ZERO_INTEGER;
            if (!var43.eql((SubLObject)ZERO_INTEGER)) {
                while (var44.numL(var43)) {
                    final SubLObject var45 = Functions.funcall((SubLObject)$ic73$, var42, var44);
                    final SubLObject var46 = Functions.funcall((SubLObject)$ic126$, var45);
                    module0067.f4886($g823$.getGlobalValue(), var46, var45);
                    var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
                }
            }
        }
        finally {
            final SubLObject var47 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                f1354(var42);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var47);
            }
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f1330(SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = f1350();
        }
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        assert NIL != f1314(var19) : var19;
        final SubLObject var20 = f1315(var19);
        final SubLObject var21 = Functions.funcall((SubLObject)$ic129$, var20);
        if (NIL == var21) {
            return (SubLObject)NIL;
        }
        return f1334(var21);
    }
    
    public static SubLObject f1331(SubLObject var19) {
        if (var19 == UNPROVIDED) {
            var19 = f1350();
        }
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        assert NIL != f1314(var19) : var19;
        final SubLObject var20 = f1315(var19);
        final SubLObject var21 = Functions.funcall((SubLObject)$ic130$, var20);
        if (NIL == var21) {
            return (SubLObject)NIL;
        }
        return f1334(var21);
    }
    
    public static SubLObject f1390(final SubLObject var22) {
        f1350();
        return f1332(var22);
    }
    
    public static SubLObject f1391(final SubLObject var22) {
        final SubLObject var23 = f1337(var22);
        if (NIL != var23) {
            f1389(var23);
        }
        return f1390(var22);
    }
    
    public static SubLObject f1392(final SubLObject var22) {
        if (NIL == var22) {
            return (SubLObject)NIL;
        }
        final SubLObject var23 = f1337(var22);
        if (NIL == var23) {
            return (SubLObject)NIL;
        }
        return f1332(var22);
    }
    
    public static SubLObject f1337(final SubLObject var22) {
        if (NIL == var22) {
            return (SubLObject)NIL;
        }
        return module0067.f4884($g823$.getGlobalValue(), var22, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f1333(final SubLObject var22) {
        if (NIL == var22) {
            return (SubLObject)NIL;
        }
        final SubLObject var23 = f1337(var22);
        if (NIL != var23) {
            return var23;
        }
        return f1393(var22);
    }
    
    public static SubLObject f1393(final SubLObject var22) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        final SubLObject var23 = f1339();
        final SubLObject var24 = Functions.funcall((SubLObject)$ic131$, var23, var22);
        if (NIL == var24) {
            return (SubLObject)NIL;
        }
        module0067.f4886($g823$.getGlobalValue(), var22, var24);
        return var24;
    }
    
    public static SubLObject f1350() {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        if (NIL == $g822$.getGlobalValue()) {
            $g822$.setGlobalValue(f1328());
        }
        return $g822$.getGlobalValue();
    }
    
    public static SubLObject f1339() {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        if (NIL == $g822$.getGlobalValue()) {
            $g822$.setGlobalValue(f1328());
        }
        return f1315($g822$.getGlobalValue());
    }
    
    public static SubLObject f1394() {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        if (NIL != $g822$.getGlobalValue()) {
            final SubLObject var19 = f1315($g822$.getGlobalValue());
            Functions.funcall((SubLObject)$ic132$, var19);
            $g822$.setGlobalValue((SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1375(final SubLObject var52) {
        assert NIL != f1357(var52) : var52;
        final SubLObject var53 = f1366(var52);
        if (NIL == var53) {
            return (SubLObject)NIL;
        }
        f1368(var53);
        return (SubLObject)T;
    }
    
    public static SubLObject f1367(final SubLObject var43) {
        if (NIL == var43) {
            return (SubLObject)$ic124$;
        }
        final SubLObject var44 = Functions.funcall((SubLObject)$ic93$, var43);
        if (NIL != var44) {
            final SubLObject var45 = Functions.funcall((SubLObject)$ic94$, var44);
            return f1385(var45);
        }
        return (SubLObject)$ic124$;
    }
    
    public static SubLObject f1385(final SubLObject var45) {
        if (var45.equal((SubLObject)$ic133$)) {
            return (SubLObject)$ic96$;
        }
        if (var45.equal((SubLObject)$ic134$)) {
            return (SubLObject)$ic99$;
        }
        if (var45.equal((SubLObject)$ic135$)) {
            return (SubLObject)$ic102$;
        }
        return (SubLObject)$ic124$;
    }
    
    public static SubLObject f1352(final SubLObject var34) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)$ic32$, (SubLObject)UNPROVIDED);
        if (NIL == var34) {
            return (SubLObject)NIL;
        }
        assert NIL != f1343(var34) : var34;
        final SubLObject var36;
        final SubLObject var35 = var36 = f1344(var34);
        if (var36.eql((SubLObject)$ic62$)) {
            final SubLObject var37 = f1330((SubLObject)UNPROVIDED);
            if (NIL == var37 || NIL == f1338(var37)) {
                return (SubLObject)NIL;
            }
            final SubLObject var38 = f1336(var37);
            final SubLObject var34_81 = Functions.funcall((SubLObject)$ic136$, var38);
            if (NIL == var34_81 || NIL == var34_81) {
                return (SubLObject)NIL;
            }
            return var34_81;
        }
        else if (var36.eql((SubLObject)$ic63$)) {
            final SubLObject var39 = f1331((SubLObject)UNPROVIDED);
            if (NIL == var39 || NIL == f1338(var39)) {
                return (SubLObject)NIL;
            }
            final SubLObject var38 = f1336(var39);
            final SubLObject var34_82 = Functions.funcall((SubLObject)$ic136$, var38);
            if (NIL == var34_82 || NIL == var34_82) {
                return (SubLObject)NIL;
            }
            return var34_82;
        }
        else if (var36.eql((SubLObject)$ic64$)) {
            final SubLObject var40 = f1350();
            final SubLObject var41 = f1315(var40);
            final SubLObject var42 = f1331((SubLObject)UNPROVIDED);
            final SubLObject var43 = f1330((SubLObject)UNPROVIDED);
            SubLObject var44 = (SubLObject)ZERO_INTEGER;
            if (NIL != var42 && NIL != f1338(var42)) {
                var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
            }
            if (NIL != var43 && NIL != f1338(var43)) {
                var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
            }
            if (var44.eql((SubLObject)ZERO_INTEGER)) {
                return (SubLObject)NIL;
            }
            final SubLObject var34_83 = Functions.funcall((SubLObject)$ic137$, var41, var44);
            if (NIL == var34_83 || NIL == var34_83) {
                return (SubLObject)NIL;
            }
            if (NIL != var42 && NIL != f1338(var42)) {
                final SubLObject var45 = f1336(var42);
                Functions.funcall((SubLObject)$ic138$, var34_83, var45);
            }
            if (NIL != var43 && NIL != f1338(var43)) {
                final SubLObject var45 = f1336(var43);
                Functions.funcall((SubLObject)$ic138$, var34_83, var45);
            }
            return var34_83;
        }
        else if (var36.eql((SubLObject)$ic65$)) {
            final SubLObject var40 = f1350();
            final SubLObject var41 = f1315(var40);
            final SubLObject var42 = f1331((SubLObject)UNPROVIDED);
            final SubLObject var43 = f1330((SubLObject)UNPROVIDED);
            SubLObject var44 = (SubLObject)ZERO_INTEGER;
            if (NIL != var42 && NIL != f1338(var42)) {
                var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
            }
            if (NIL != var43 && NIL != f1338(var43)) {
                var44 = Numbers.add(var44, (SubLObject)ONE_INTEGER);
            }
            if (var44.eql((SubLObject)ZERO_INTEGER)) {
                return (SubLObject)NIL;
            }
            final SubLObject var34_84 = Functions.funcall((SubLObject)$ic137$, var41, var44);
            if (NIL == var34_84 || NIL == var34_84) {
                return (SubLObject)NIL;
            }
            if (NIL != var43 && NIL != f1338(var43)) {
                final SubLObject var45 = f1336(var43);
                Functions.funcall((SubLObject)$ic138$, var34_84, var45);
            }
            if (NIL != var42 && NIL != f1338(var42)) {
                final SubLObject var45 = f1336(var42);
                Functions.funcall((SubLObject)$ic138$, var34_84, var45);
            }
            return var34_84;
        }
        else if (var36.eql((SubLObject)$ic66$)) {
            final SubLObject var46 = f1339();
            final SubLObject var34_85 = Functions.funcall((SubLObject)$ic139$, var46);
            if (NIL == var34_85 || NIL == var34_85) {
                return (SubLObject)NIL;
            }
            return var34_85;
        }
        else if (var36.eql((SubLObject)$ic67$)) {
            final SubLObject var46 = f1339();
            final SubLObject var34_86 = Functions.funcall((SubLObject)$ic140$, var46);
            if (NIL == var34_86 || NIL == var34_86) {
                return (SubLObject)NIL;
            }
            return var34_86;
        }
        else {
            if (!var36.eql((SubLObject)$ic68$)) {
                return (SubLObject)NIL;
            }
            final SubLObject var46 = f1339();
            final SubLObject var34_87 = Functions.funcall((SubLObject)$ic141$, var46);
            if (NIL == var34_87 || NIL == var34_87) {
                return (SubLObject)NIL;
            }
            return var34_87;
        }
    }
    
    public static SubLObject f1354(final SubLObject var34) {
        if (NIL == var34 || NIL == var34) {
            return (SubLObject)NIL;
        }
        Functions.funcall((SubLObject)$ic142$, var34);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1366(final SubLObject var52) {
        assert NIL != f1357(var52) : var52;
        final SubLObject var53 = f1359(var52);
        final SubLObject var54 = f1358(var52);
        SubLObject var55 = (SubLObject)NIL;
        assert NIL != f1343(var54) : var54;
        assert NIL != Types.stringp(var53) : var53;
        final SubLObject var56 = f1352(var54);
        SubLObject var57 = (SubLObject)NIL;
        if (NIL == var56 || NIL == var56) {
            return var55;
        }
        try {
            final SubLObject var58 = Functions.funcall((SubLObject)$ic143$, var56);
            if (NIL != var58) {
                if (NIL != var53 && NIL != Numbers.numNE(Sequences.length(var53), (SubLObject)ZERO_INTEGER)) {
                    try {
                        var55 = Functions.funcall((SubLObject)$ic144$, var58, var53);
                    }
                    finally {
                        final SubLObject var59 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                            Functions.funcall((SubLObject)$ic117$, var58);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var59);
                        }
                    }
                }
                else {
                    var55 = var58;
                }
            }
            var57 = (SubLObject)T;
        }
        finally {
            final SubLObject var60 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)T);
                if (NIL == var57) {
                    f1354(var56);
                    var55 = (SubLObject)NIL;
                }
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var60);
            }
        }
        return var55;
    }
    
    public static SubLObject f1368(final SubLObject var93) {
        if (NIL == var93) {
            return (SubLObject)NIL;
        }
        final SubLObject var94 = Functions.funcall((SubLObject)$ic145$, var93);
        f1354(var94);
        Functions.funcall((SubLObject)$ic117$, var93);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1372(final SubLObject var94) {
        final SubLObject var95 = Sequences.length(var94);
        final SubLObject var96 = Vectors.make_vector(var95, (SubLObject)ZERO_INTEGER);
        SubLObject var97;
        for (var97 = (SubLObject)NIL, var97 = (SubLObject)ZERO_INTEGER; var97.numL(var95); var97 = Numbers.add(var97, (SubLObject)ONE_INTEGER)) {
            Vectors.set_aref(var96, var97, Vectors.aref(var94, var97));
        }
        return var96;
    }
    
    public static SubLObject f1395() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1312", "S#2436", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1314", "S#2432", 1, 0, false);
        new $f1314$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1315", "S#2437", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1316", "S#2438", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1317", "S#2439", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1318", "S#2440", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1319", "S#2441", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1320", "S#2442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1322", "S#2433", 1, 0, false);
        new $f1322$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1323", "S#2443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1324", "S#2444", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1325", "S#2445", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1326", "S#2446", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1327", "S#2447", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1328", "S#2448", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1313", "S#2449", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1332", "S#2450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1334", "S#2451", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1336", "S#2452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1321", "S#2453", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1338", "S#2454", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1340", "S#2455", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1341", "S#2456", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1343", "S#2434", 1, 0, false);
        new $f1343$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1344", "S#2457", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1345", "S#2458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1346", "S#2459", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1347", "S#2460", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1348", "S#2461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1349", "S#2462", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1342", "S#2463", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1351", "S#2464", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1355", "S#2465", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1357", "S#2435", 1, 0, false);
        new $f1357$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1358", "S#2466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1359", "S#2467", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1360", "S#2468", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1361", "S#2469", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1362", "S#2470", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1363", "S#2471", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1364", "S#2472", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1365", "S#2473", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1356", "S#2474", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1353", "S#2475", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1369", "S#2476", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1370", "S#2477", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1371", "S#2478", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1373", "S#2479", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1374", "S#2480", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1376", "S#2481", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1377", "S#2482", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1379", "S#2483", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1380", "S#2484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1381", "S#2485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1382", "S#2486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1383", "S#2487", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1384", "S#2488", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1378", "S#2489", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1386", "S#2490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1335", "S#2491", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1387", "S#2492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1388", "S#2493", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1389", "S#2494", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1329", "S#2495", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1330", "S#2496", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1331", "S#2497", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1390", "S#2498", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1391", "S#2499", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1392", "S#2500", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1337", "S#2501", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1333", "S#2502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1393", "S#2503", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1350", "S#2504", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1339", "S#2505", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1394", "S#2506", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1375", "S#2507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1367", "S#2508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1385", "S#2509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1352", "S#2510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1354", "S#2511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1366", "S#2512", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1368", "S#2513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0026", "f1372", "S#2514", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1396() {
        $g822$ = SubLFiles.deflexical("S#2515", (SubLObject)NIL);
        $g823$ = SubLFiles.deflexical("S#2516", (SubLObject)NIL);
        $g824$ = SubLFiles.defconstant("S#2517", (SubLObject)$ic0$);
        $g825$ = SubLFiles.defconstant("S#2518", (SubLObject)$ic18$);
        $g826$ = SubLFiles.defconstant("S#2519", (SubLObject)$ic48$);
        $g827$ = SubLFiles.defconstant("S#2520", (SubLObject)$ic75$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f1397() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g824$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic7$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic8$);
        Structures.def_csetf((SubLObject)$ic9$, (SubLObject)$ic10$);
        Equality.identity((SubLObject)$ic0$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g824$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic17$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g825$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic25$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic26$);
        Structures.def_csetf((SubLObject)$ic27$, (SubLObject)$ic28$);
        Equality.identity((SubLObject)$ic18$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g825$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic31$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g826$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic55$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic56$);
        Structures.def_csetf((SubLObject)$ic57$, (SubLObject)$ic58$);
        Equality.identity((SubLObject)$ic48$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g826$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic61$));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g827$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic82$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic83$);
        Structures.def_csetf((SubLObject)$ic84$, (SubLObject)$ic85$);
        Structures.def_csetf((SubLObject)$ic86$, (SubLObject)$ic87$);
        Equality.identity((SubLObject)$ic75$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g827$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic91$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f1395();
    }
    
    public void initializeVariables() {
        f1396();
    }
    
    public void runTopLevelForms() {
        f1397();
    }
    
    static {
        me = (SubLFile)new module0026();
        $g822$ = null;
        $g823$ = null;
        $g824$ = null;
        $g825$ = null;
        $g826$ = null;
        $g827$ = null;
        $ic0$ = makeSymbol("S#2396", "CYC");
        $ic1$ = makeSymbol("S#2432", "CYC");
        $ic2$ = ConsesLow.list((SubLObject)makeSymbol("S#2521", "CYC"));
        $ic3$ = ConsesLow.list((SubLObject)makeKeyword("COBJ"));
        $ic4$ = ConsesLow.list((SubLObject)makeSymbol("S#2437", "CYC"));
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#2438", "CYC"));
        $ic6$ = makeSymbol("S#2449", "CYC");
        $ic7$ = makeSymbol("S#2436", "CYC");
        $ic8$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2432", "CYC"));
        $ic9$ = makeSymbol("S#2437", "CYC");
        $ic10$ = makeSymbol("S#2438", "CYC");
        $ic11$ = makeKeyword("COBJ");
        $ic12$ = makeString("Invalid slot ~S for construction function");
        $ic13$ = makeKeyword("BEGIN");
        $ic14$ = makeSymbol("S#2439", "CYC");
        $ic15$ = makeKeyword("SLOT");
        $ic16$ = makeKeyword("END");
        $ic17$ = makeSymbol("S#2441", "CYC");
        $ic18$ = makeSymbol("S#2400", "CYC");
        $ic19$ = makeSymbol("S#2433", "CYC");
        $ic20$ = ConsesLow.list((SubLObject)makeSymbol("S#885", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)makeKeyword("FILENAME"));
        $ic22$ = ConsesLow.list((SubLObject)makeSymbol("S#2443", "CYC"));
        $ic23$ = ConsesLow.list((SubLObject)makeSymbol("S#2444", "CYC"));
        $ic24$ = makeSymbol("S#2453", "CYC");
        $ic25$ = makeSymbol("S#2442", "CYC");
        $ic26$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2433", "CYC"));
        $ic27$ = makeSymbol("S#2443", "CYC");
        $ic28$ = makeSymbol("S#2444", "CYC");
        $ic29$ = makeKeyword("FILENAME");
        $ic30$ = makeSymbol("S#2445", "CYC");
        $ic31$ = makeSymbol("S#2447", "CYC");
        $ic32$ = makeKeyword("RED-SHARED");
        $ic33$ = makeString("#<red-struct obj: ~s  version = ~s  date= ~s  time = ~s  number-application-repositories ~s  system-repository = ~s machine-repository=~s >");
        $ic34$ = makeSymbol("S#2351", "CYC");
        $ic35$ = makeSymbol("S#2352", "CYC");
        $ic36$ = makeSymbol("S#2353", "CYC");
        $ic37$ = makeSymbol("S#2409", "CYC");
        $ic38$ = makeString("#<red-struct cobj: nil>");
        $ic39$ = makeSymbol("STRINGP");
        $ic40$ = makeString("#<red-repository-struct INVALID  ~s>");
        $ic41$ = makeString("#<red-repository-struct  name = ~s type = ~s version = ~s date = ~s time = ~s >");
        $ic42$ = makeSymbol("S#2356", "CYC");
        $ic43$ = makeSymbol("S#2358", "CYC");
        $ic44$ = makeSymbol("S#2359", "CYC");
        $ic45$ = makeSymbol("S#2360", "CYC");
        $ic46$ = makeSymbol("S#2361", "CYC");
        $ic47$ = makeSymbol("S#2402", "CYC");
        $ic48$ = makeSymbol("S#2412", "CYC");
        $ic49$ = makeSymbol("S#2434", "CYC");
        $ic50$ = ConsesLow.list((SubLObject)makeSymbol("TYPE"));
        $ic51$ = ConsesLow.list((SubLObject)makeKeyword("TYPE"));
        $ic52$ = ConsesLow.list((SubLObject)makeSymbol("S#2457", "CYC"));
        $ic53$ = ConsesLow.list((SubLObject)makeSymbol("S#2458", "CYC"));
        $ic54$ = makeSymbol("S#2463", "CYC");
        $ic55$ = makeSymbol("S#2456", "CYC");
        $ic56$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2434", "CYC"));
        $ic57$ = makeSymbol("S#2457", "CYC");
        $ic58$ = makeSymbol("S#2458", "CYC");
        $ic59$ = makeKeyword("TYPE");
        $ic60$ = makeSymbol("S#2459", "CYC");
        $ic61$ = makeSymbol("S#2461", "CYC");
        $ic62$ = makeKeyword("SYSTEM");
        $ic63$ = makeKeyword("MACHINE");
        $ic64$ = makeKeyword("MACHINE-SYSTEM");
        $ic65$ = makeKeyword("SYSTEM-MACHINE");
        $ic66$ = makeKeyword("APPLICATION");
        $ic67$ = makeKeyword("MOST-PRIVILEGED");
        $ic68$ = makeKeyword("LEAST-PRIVILEGED");
        $ic69$ = makeString("#<red-repository-list-struct type = ~s>");
        $ic70$ = makeString("#<red-repository-list-struct elts = 0 ()>");
        $ic71$ = makeString("#<red-repository-list-struct elts = ~d ( ");
        $ic72$ = makeString("~s ");
        $ic73$ = makeSymbol("S#2370", "CYC");
        $ic74$ = makeString(")>");
        $ic75$ = makeSymbol("S#2416", "CYC");
        $ic76$ = makeSymbol("S#2435", "CYC");
        $ic77$ = ConsesLow.list((SubLObject)makeSymbol("S#2522", "CYC"), (SubLObject)makeSymbol("S#2523", "CYC"));
        $ic78$ = ConsesLow.list((SubLObject)makeKeyword("REPOSITORY-LIST"), (SubLObject)makeKeyword("KEY-STRING"));
        $ic79$ = ConsesLow.list((SubLObject)makeSymbol("S#2466", "CYC"), (SubLObject)makeSymbol("S#2467", "CYC"));
        $ic80$ = ConsesLow.list((SubLObject)makeSymbol("S#2468", "CYC"), (SubLObject)makeSymbol("S#2469", "CYC"));
        $ic81$ = makeSymbol("S#2474", "CYC");
        $ic82$ = makeSymbol("S#2465", "CYC");
        $ic83$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#2435", "CYC"));
        $ic84$ = makeSymbol("S#2466", "CYC");
        $ic85$ = makeSymbol("S#2468", "CYC");
        $ic86$ = makeSymbol("S#2467", "CYC");
        $ic87$ = makeSymbol("S#2469", "CYC");
        $ic88$ = makeKeyword("REPOSITORY-LIST");
        $ic89$ = makeKeyword("KEY-STRING");
        $ic90$ = makeSymbol("S#2470", "CYC");
        $ic91$ = makeSymbol("S#2472", "CYC");
        $ic92$ = makeString("#<red-element-struct key = ~s>");
        $ic93$ = makeSymbol("S#2387", "CYC");
        $ic94$ = makeSymbol("S#2377", "CYC");
        $ic95$ = makeString("#<red-element-struct key= ~s type = ~s ");
        $ic96$ = makeKeyword("STRING");
        $ic97$ = makeString("value = ~s");
        $ic98$ = makeSymbol("S#2379", "CYC");
        $ic99$ = makeKeyword("INTEGER");
        $ic100$ = makeString("value = ~d");
        $ic101$ = makeSymbol("S#2424", "CYC");
        $ic102$ = makeKeyword("BLOB");
        $ic103$ = makeString("BlobValue = \"");
        $ic104$ = makeString("~x");
        $ic105$ = makeString("0");
        $ic106$ = makeString("~a");
        $ic107$ = makeString("\"");
        $ic108$ = makeKeyword("DEFAULT");
        $ic109$ = makeString("INVALID DATA TYPE");
        $ic110$ = makeString(">");
        $ic111$ = makeSymbol("S#2408", "CYC");
        $ic112$ = makeSymbol("S#2391", "CYC");
        $ic113$ = makeString("");
        $ic114$ = makeSymbol("S#2429", "CYC");
        $ic115$ = makeSymbol("S#2392", "CYC");
        $ic116$ = makeSymbol("S#2376", "CYC");
        $ic117$ = makeSymbol("S#2428", "CYC");
        $ic118$ = makeSymbol("S#2431", "CYC");
        $ic119$ = makeSymbol("S#2371", "CYC");
        $ic120$ = makeSymbol("S#2373", "CYC");
        $ic121$ = makeSymbol("S#2420", "CYC");
        $ic122$ = makeSymbol("S#2374", "CYC");
        $ic123$ = makeSymbol("S#2418", "CYC");
        $ic124$ = makeKeyword("INVALID");
        $ic125$ = makeString(".");
        $ic126$ = makeSymbol("S#2357", "CYC");
        $ic127$ = makeSymbol("S#2455", "CYC");
        $ic128$ = makeSymbol("S#2399", "CYC");
        $ic129$ = makeSymbol("S#2363", "CYC");
        $ic130$ = makeSymbol("S#2364", "CYC");
        $ic131$ = makeSymbol("S#2354", "CYC");
        $ic132$ = makeSymbol("S#2398", "CYC");
        $ic133$ = makeString("string");
        $ic134$ = makeString("integer");
        $ic135$ = makeString("blob");
        $ic136$ = makeSymbol("S#2366", "CYC");
        $ic137$ = makeSymbol("S#2365", "CYC");
        $ic138$ = makeSymbol("S#2414", "CYC");
        $ic139$ = makeSymbol("S#2367", "CYC");
        $ic140$ = makeSymbol("S#2368", "CYC");
        $ic141$ = makeSymbol("S#2369", "CYC");
        $ic142$ = makeSymbol("S#2411", "CYC");
        $ic143$ = makeSymbol("S#2385", "CYC");
        $ic144$ = makeSymbol("S#2390", "CYC");
        $ic145$ = makeSymbol("S#2388", "CYC");
    }
    
    public static final class $sX2396_native extends SubLStructNative
    {
        public SubLObject $cobj;
        public static final SubLStructDeclNative structDecl;
        
        public $sX2396_native() {
            this.$cobj = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2396_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cobj;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cobj = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2396_native.class, $ic0$, $ic1$, $ic2$, $ic3$, new String[] { "$cobj" }, $ic4$, $ic5$, $ic6$);
        }
    }
    
    public static final class $f1314$UnaryFunction extends UnaryFunction
    {
        public $f1314$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2432"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f1314(var3);
        }
    }
    
    public static final class $sX2400_native extends SubLStructNative
    {
        public SubLObject $filename;
        public static final SubLStructDeclNative structDecl;
        
        public $sX2400_native() {
            this.$filename = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2400_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$filename;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$filename = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2400_native.class, $ic18$, $ic19$, $ic20$, $ic21$, new String[] { "$filename" }, $ic22$, $ic23$, $ic24$);
        }
    }
    
    public static final class $f1322$UnaryFunction extends UnaryFunction
    {
        public $f1322$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2433"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f1322(var3);
        }
    }
    
    public static final class $sX2412_native extends SubLStructNative
    {
        public SubLObject $type;
        public static final SubLStructDeclNative structDecl;
        
        public $sX2412_native() {
            this.$type = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2412_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$type;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2412_native.class, $ic48$, $ic49$, $ic50$, $ic51$, new String[] { "$type" }, $ic52$, $ic53$, $ic54$);
        }
    }
    
    public static final class $f1343$UnaryFunction extends UnaryFunction
    {
        public $f1343$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2434"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f1343(var3);
        }
    }
    
    public static final class $sX2416_native extends SubLStructNative
    {
        public SubLObject $repository_list;
        public SubLObject $key_string;
        public static final SubLStructDeclNative structDecl;
        
        public $sX2416_native() {
            this.$repository_list = (SubLObject)CommonSymbols.NIL;
            this.$key_string = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX2416_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$repository_list;
        }
        
        public SubLObject getField3() {
            return this.$key_string;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$repository_list = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$key_string = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX2416_native.class, $ic75$, $ic76$, $ic77$, $ic78$, new String[] { "$repository_list", "$key_string" }, $ic79$, $ic80$, $ic81$);
        }
    }
    
    public static final class $f1357$UnaryFunction extends UnaryFunction
    {
        public $f1357$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#2435"));
        }
        
        public SubLObject processItem(final SubLObject var3) {
            return f1357(var3);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 348 ms
	
	Decompiled with Procyon 0.5.32.
*/