package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0777 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0777";
    public static final String myFingerPrint = "4963a697ac93b7def81e3ea3d8b9bf0795b9a6af132b92671d8f7570fb9f6db3";
    public static SubLSymbol $g6241$;
    public static SubLSymbol $g6242$;
    public static SubLSymbol $g6243$;
    public static SubLSymbol $g6244$;
    public static SubLSymbol $g6245$;
    public static SubLSymbol $g6246$;
    public static SubLSymbol $g6247$;
    public static SubLSymbol $g6248$;
    public static SubLSymbol $g6249$;
    public static SubLSymbol $g6250$;
    public static SubLSymbol $g6251$;
    public static SubLSymbol $g6252$;
    public static SubLSymbol $g5315$;
    public static SubLSymbol $g6253$;
    private static SubLSymbol $g6254$;
    private static SubLSymbol $g6255$;
    private static SubLSymbol $g6256$;
    private static SubLSymbol $g6257$;
    private static SubLSymbol $g6258$;
    private static SubLSymbol $g6259$;
    private static SubLSymbol $g6260$;
    private static SubLSymbol $g6261$;
    private static SubLSymbol $g6262$;
    private static SubLSymbol $g6263$;
    private static SubLSymbol $g6264$;
    private static SubLSymbol $g6265$;
    private static SubLSymbol $g6266$;
    private static final SubLSymbol $ic0$;
    private static final SubLInteger $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLList $ic12$;
    private static final SubLList $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLList $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLList $ic18$;
    private static final SubLList $ic19$;
    private static final SubLList $ic20$;
    private static final SubLList $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLList $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLObject $ic35$;
    private static final SubLObject $ic36$;
    private static final SubLObject $ic37$;
    private static final SubLObject $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLList $ic44$;
    private static final SubLList $ic45$;
    private static final SubLList $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLString $ic48$;
    private static final SubLList $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLString $ic55$;
    private static final SubLObject $ic56$;
    private static final SubLObject $ic57$;
    private static final SubLObject $ic58$;
    private static final SubLObject $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLInteger $ic62$;
    private static final SubLInteger $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLObject $ic68$;
    private static final SubLObject $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLObject $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLObject $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLObject $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLObject $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLObject $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLSymbol $ic89$;
    private static final SubLInteger $ic90$;
    private static final SubLInteger $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLObject $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLObject $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLObject $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLObject $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLString $ic110$;
    private static final SubLObject $ic111$;
    private static final SubLList $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLInteger $ic115$;
    private static final SubLInteger $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLSymbol $ic120$;
    private static final SubLInteger $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLObject $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLInteger $ic132$;
    private static final SubLInteger $ic133$;
    private static final SubLObject $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLString $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLObject $ic138$;
    private static final SubLList $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLObject $ic142$;
    private static final SubLObject $ic143$;
    private static final SubLObject $ic144$;
    private static final SubLObject $ic145$;
    private static final SubLString $ic146$;
    private static final SubLObject $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLObject $ic152$;
    private static final SubLList $ic153$;
    private static final SubLList $ic154$;
    private static final SubLList $ic155$;
    private static final SubLList $ic156$;
    private static final SubLList $ic157$;
    private static final SubLList $ic158$;
    private static final SubLList $ic159$;
    private static final SubLObject $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLSymbol $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLSymbol $ic164$;
    private static final SubLSymbol $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLSymbol $ic171$;
    private static final SubLString $ic172$;
    private static final SubLString $ic173$;
    private static final SubLString $ic174$;
    private static final SubLList $ic175$;
    private static final SubLString $ic176$;
    private static final SubLList $ic177$;
    private static final SubLObject $ic178$;
    private static final SubLList $ic179$;
    private static final SubLObject $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLSymbol $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLSymbol $ic186$;
    private static final SubLObject $ic187$;
    private static final SubLSymbol $ic188$;
    private static final SubLList $ic189$;
    private static final SubLObject $ic190$;
    private static final SubLSymbol $ic191$;
    private static final SubLList $ic192$;
    private static final SubLList $ic193$;
    private static final SubLSymbol $ic194$;
    private static final SubLList $ic195$;
    
    
    public static SubLObject f50019() {
        final SubLThread var1 = SubLProcess.currentSubLThread();
        return module0777.$g5315$.getDynamicValue(var1);
    }
    
    public static SubLObject f50020(final SubLObject var2) {
        final SubLThread var3 = SubLProcess.currentSubLThread();
        if (module0777.NIL != var2 && !module0777.areAssertionsDisabledFor(me) && module0777.NIL == module0173.f10955(var2)) {
            throw new AssertionError(var2);
        }
        module0777.$g5315$.setDynamicValue(var2, var3);
        return module0777.$g5315$.getDynamicValue(var3);
    }
    
    public static SubLObject f50021(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0777.NIL;
        SubLObject var8 = (SubLObject)module0777.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0777.$ic6$);
        var7 = var6.first();
        var6 = var6.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0777.$ic6$);
        var8 = var6.first();
        final SubLObject var9;
        var6 = (var9 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0777.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0777.$ic8$, (SubLObject)module0777.$ic9$, var7), (SubLObject)ConsesLow.listS((SubLObject)module0777.$ic10$, (SubLObject)module0777.$ic11$, var8, ConsesLow.append(var9, (SubLObject)module0777.NIL)), (SubLObject)module0777.$ic12$);
    }
    
    public static SubLObject f50022(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0777.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0777.$ic13$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0777.$ic14$, (SubLObject)module0777.$ic15$, (SubLObject)ConsesLow.list((SubLObject)module0777.$ic16$, (SubLObject)module0777.$ic17$, var7), ConsesLow.append(var8, (SubLObject)module0777.NIL));
    }
    
    public static SubLObject f50023(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0777.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0777.$ic18$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0777.$ic7$, (SubLObject)module0777.$ic19$, var7, ConsesLow.append(var8, (SubLObject)module0777.NIL));
    }
    
    public static SubLObject f50024(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0777.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0777.$ic13$);
        var7 = var6.first();
        final SubLObject var8;
        var6 = (var8 = var6.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)module0777.$ic14$, (SubLObject)module0777.$ic20$, var7, ConsesLow.append(var8, (SubLObject)module0777.NIL));
    }
    
    public static SubLObject f50025(SubLObject var18) {
        if (var18 == module0777.UNPROVIDED) {
            var18 = module0777.$g6245$.getGlobalValue();
        }
        final SubLThread var19 = SubLProcess.currentSubLThread();
        module0777.$g6251$.setDynamicValue(var18, var19);
        return module0777.$g6251$.getDynamicValue(var19);
    }
    
    public static SubLObject f50026(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        SubLObject var7 = (SubLObject)module0777.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0777.$ic21$);
        var7 = var6.first();
        var6 = var6.rest();
        if (module0777.NIL == var6) {
            return (SubLObject)ConsesLow.list((SubLObject)module0777.$ic22$, var7, (SubLObject)ConsesLow.list((SubLObject)module0777.$ic23$, (SubLObject)module0777.$ic24$, (SubLObject)ConsesLow.list((SubLObject)module0777.$ic25$, var7)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0777.$ic21$);
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50027(final SubLObject var3, final SubLObject var4) {
        SubLObject var6;
        final SubLObject var5 = var6 = var3.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0777.$ic26$);
        final SubLObject var7 = var6.rest();
        var6 = var6.first();
        SubLObject var8 = (SubLObject)module0777.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var6, var5, (SubLObject)module0777.$ic26$);
        var8 = var6.first();
        var6 = var6.rest();
        final SubLObject var9 = (SubLObject)(var6.isCons() ? var6.first() : module0777.$ic27$);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0777.$ic26$);
        var6 = var6.rest();
        final SubLObject var10 = (SubLObject)(var6.isCons() ? var6.first() : module0777.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var6, var5, (SubLObject)module0777.$ic26$);
        var6 = var6.rest();
        if (module0777.NIL == var6) {
            final SubLObject var11;
            var6 = (var11 = var7);
            return (SubLObject)ConsesLow.list((SubLObject)module0777.$ic28$, (SubLObject)ConsesLow.list(var8, var9), (SubLObject)ConsesLow.listS((SubLObject)module0777.$ic7$, (SubLObject)ConsesLow.list((SubLObject)module0777.$ic29$, var8, var10), ConsesLow.append(var11, (SubLObject)module0777.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var5, (SubLObject)module0777.$ic26$);
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50028(final SubLObject var2, SubLObject var29, SubLObject var30) {
        if (var29 == module0777.UNPROVIDED) {
            var29 = module0777.$g6252$.getGlobalValue();
        }
        if (var30 == module0777.UNPROVIDED) {
            var30 = (SubLObject)module0777.NIL;
        }
        final SubLThread var31 = SubLProcess.currentSubLThread();
        SubLObject var32 = (SubLObject)module0777.NIL;
        final SubLObject var33 = f50029(var29);
        final SubLObject var34 = f50030(Time.get_universal_time());
        final SubLObject var36;
        final SubLObject var35 = var36 = module0213.f13949(var33, var34, var2);
        module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)module0777.$ic30$, new SubLObject[] { module0006.f205(var2), module0777.$ic31$, module0006.f207(var29), module0777.$ic32$ }), var31);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var31);
        module0012.$g83$.setDynamicValue(Sequences.length(var36), var31);
        module0012.$g84$.setDynamicValue((SubLObject)module0777.ZERO_INTEGER, var31);
        final SubLObject var37 = module0012.$g75$.currentBinding(var31);
        final SubLObject var38 = module0012.$g76$.currentBinding(var31);
        final SubLObject var39 = module0012.$g77$.currentBinding(var31);
        final SubLObject var40 = module0012.$g78$.currentBinding(var31);
        try {
            module0012.$g75$.bind((SubLObject)module0777.ZERO_INTEGER, var31);
            module0012.$g76$.bind((SubLObject)module0777.NIL, var31);
            module0012.$g77$.bind((SubLObject)module0777.T, var31);
            module0012.$g78$.bind(Time.get_universal_time(), var31);
            module0012.f478(module0012.$g82$.getDynamicValue(var31));
            SubLObject var41 = var36;
            SubLObject var42 = (SubLObject)module0777.NIL;
            var42 = var41.first();
            while (module0777.NIL != var41) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var31), module0012.$g83$.getDynamicValue(var31));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var31), (SubLObject)module0777.ONE_INTEGER), var31);
                if (module0777.NIL != f50031(var42, var30)) {
                    var32 = (SubLObject)ConsesLow.cons(var42, var32);
                }
                var41 = var41.rest();
                var42 = var41.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var40, var31);
            module0012.$g77$.rebind(var39, var31);
            module0012.$g76$.rebind(var38, var31);
            module0012.$g75$.rebind(var37, var31);
        }
        return var32;
    }
    
    public static SubLObject f50032(final SubLObject var41) {
        final SubLThread var42 = SubLProcess.currentSubLThread();
        assert module0777.NIL != module0212.f13762(var41) : var41;
        SubLObject var43 = (SubLObject)module0777.NIL;
        final SubLObject var44 = module0147.$g2094$.currentBinding(var42);
        final SubLObject var45 = module0147.$g2095$.currentBinding(var42);
        try {
            module0147.$g2094$.bind((SubLObject)module0777.$ic34$, var42);
            module0147.$g2095$.bind(module0777.$ic35$, var42);
            if (module0777.NIL != module0220.f14562(var41, module0777.$ic36$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) {
                var43 = (SubLObject)module0777.T;
            }
            else if (module0777.NIL != module0259.f16902(var41, module0220.f14567(module0777.$ic37$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) {
                var43 = (SubLObject)module0777.T;
            }
            else if (module0777.NIL != module0259.f16978(var41, module0220.f14567(module0777.$ic38$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) {
                var43 = (SubLObject)module0777.T;
            }
        }
        finally {
            module0147.$g2095$.rebind(var45, var42);
            module0147.$g2094$.rebind(var44, var42);
        }
        return var43;
    }
    
    public static SubLObject f50031(final SubLObject var41, SubLObject var27) {
        if (var27 == module0777.UNPROVIDED) {
            var27 = (SubLObject)module0777.NIL;
        }
        assert module0777.NIL != module0212.f13762(var41) : var41;
        SubLObject var42 = (SubLObject)module0777.NIL;
        if (module0777.NIL == f50032(var41)) {
            var42 = Types.sublisp_null(module0732.f45088(var41, var27, (SubLObject)module0777.ONE_INTEGER));
        }
        return var42;
    }
    
    public static SubLObject f50033(final SubLObject var41, SubLObject var27) {
        if (var27 == module0777.UNPROVIDED) {
            var27 = (SubLObject)module0777.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL == f50031(var41, var27));
    }
    
    public static SubLObject f50034(final SubLObject var44) {
        SubLObject var45 = (SubLObject)module0777.NIL;
        if (module0777.NIL != module0751.f47078(var44)) {
            if (module0777.NIL == var45) {
                SubLObject var46 = module0751.f47077(var44);
                SubLObject var47 = (SubLObject)module0777.NIL;
                var47 = var46.first();
                while (module0777.NIL == var45 && module0777.NIL != var46) {
                    if (module0777.NIL == module0732.f45116(var47)) {
                        var45 = var47;
                    }
                    var46 = var46.rest();
                    var47 = var46.first();
                }
            }
            if (module0777.NIL == var45) {
                SubLObject var46 = module0260.f17030(var44, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                SubLObject var47 = (SubLObject)module0777.NIL;
                var47 = var46.first();
                while (module0777.NIL == var45 && module0777.NIL != var46) {
                    if (module0777.NIL == module0732.f45116(var47)) {
                        var45 = var47;
                    }
                    var46 = var46.rest();
                    var47 = var46.first();
                }
            }
        }
        return Values.values(module0035.sublisp_boolean(var45), var45);
    }
    
    public static SubLObject f50035(SubLObject var27, SubLObject var47) {
        if (var27 == module0777.UNPROVIDED) {
            var27 = (SubLObject)module0777.NIL;
        }
        if (var47 == module0777.UNPROVIDED) {
            var47 = (SubLObject)module0777.NIL;
        }
        final SubLThread var48 = SubLProcess.currentSubLThread();
        SubLObject var49 = (SubLObject)module0777.ZERO_INTEGER;
        final SubLObject var50 = (module0777.NIL != var47) ? var47 : module0173.f10962();
        SubLObject var51 = (SubLObject)module0777.NIL;
        final SubLObject var52 = module0128.f8425();
        final SubLObject var53 = (SubLObject)module0777.$ic27$;
        final SubLObject var54 = module0065.f4733(var52);
        SubLObject var55 = (SubLObject)module0777.ZERO_INTEGER;
        assert module0777.NIL != Types.stringp(var53) : var53;
        final SubLObject var56 = module0012.$g75$.currentBinding(var48);
        final SubLObject var57 = module0012.$g76$.currentBinding(var48);
        final SubLObject var58 = module0012.$g77$.currentBinding(var48);
        final SubLObject var59 = module0012.$g78$.currentBinding(var48);
        try {
            module0012.$g75$.bind((SubLObject)module0777.ZERO_INTEGER, var48);
            module0012.$g76$.bind((SubLObject)module0777.NIL, var48);
            module0012.$g77$.bind((SubLObject)module0777.T, var48);
            module0012.$g78$.bind(Time.get_universal_time(), var48);
            module0012.f478(var53);
            final SubLObject var55_56 = var52;
            if (module0777.NIL == module0065.f4772(var55_56, (SubLObject)module0777.$ic40$)) {
                final SubLObject var57_58 = var55_56;
                if (module0777.NIL == module0065.f4775(var57_58, (SubLObject)module0777.$ic40$)) {
                    final SubLObject var60 = module0065.f4740(var57_58);
                    final SubLObject var61 = (SubLObject)module0777.NIL;
                    SubLObject var62;
                    SubLObject var63;
                    SubLObject var64;
                    SubLObject var65;
                    for (var62 = Sequences.length(var60), var63 = (SubLObject)module0777.NIL, var63 = (SubLObject)module0777.ZERO_INTEGER; var63.numL(var62); var63 = Numbers.add(var63, (SubLObject)module0777.ONE_INTEGER)) {
                        var64 = ((module0777.NIL != var61) ? Numbers.subtract(var62, var63, (SubLObject)module0777.ONE_INTEGER) : var63);
                        var65 = Vectors.aref(var60, var64);
                        if (module0777.NIL == module0065.f4749(var65) || module0777.NIL == module0065.f4773((SubLObject)module0777.$ic40$)) {
                            if (module0777.NIL != module0065.f4749(var65)) {
                                var65 = (SubLObject)module0777.$ic40$;
                            }
                            module0012.note_percent_progress(var55, var54);
                            var55 = Numbers.add(var55, (SubLObject)module0777.ONE_INTEGER);
                            if (module0777.NIL != f50031(var65, var27) && !var49.numGE(var50)) {
                                var49 = Numbers.add(var49, (SubLObject)module0777.ONE_INTEGER);
                                var51 = (SubLObject)ConsesLow.cons(var65, var51);
                            }
                        }
                    }
                }
                final SubLObject var64_65 = var55_56;
                if (module0777.NIL == module0065.f4777(var64_65) || module0777.NIL == module0065.f4773((SubLObject)module0777.$ic40$)) {
                    final SubLObject var66 = module0065.f4738(var64_65);
                    SubLObject var67 = module0065.f4739(var64_65);
                    final SubLObject var68 = module0065.f4734(var64_65);
                    final SubLObject var69 = (SubLObject)((module0777.NIL != module0065.f4773((SubLObject)module0777.$ic40$)) ? module0777.NIL : module0777.$ic40$);
                    while (var67.numL(var68)) {
                        final SubLObject var70 = Hashtables.gethash_without_values(var67, var66, var69);
                        if (module0777.NIL == module0065.f4773((SubLObject)module0777.$ic40$) || module0777.NIL == module0065.f4749(var70)) {
                            module0012.note_percent_progress(var55, var54);
                            var55 = Numbers.add(var55, (SubLObject)module0777.ONE_INTEGER);
                            if (module0777.NIL != f50031(var70, var27) && !var49.numGE(var50)) {
                                var49 = Numbers.add(var49, (SubLObject)module0777.ONE_INTEGER);
                                var51 = (SubLObject)ConsesLow.cons(var70, var51);
                            }
                        }
                        var67 = Numbers.add(var67, (SubLObject)module0777.ONE_INTEGER);
                    }
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var59, var48);
            module0012.$g77$.rebind(var58, var48);
            module0012.$g76$.rebind(var57, var48);
            module0012.$g75$.rebind(var56, var48);
        }
        return var51;
    }
    
    public static SubLObject f50036(SubLObject var2) {
        if (var2 == module0777.UNPROVIDED) {
            var2 = module0574.f35152();
        }
        final SubLObject var3 = f50037(var2);
        return module0219.f14512(module0777.$ic41$, var3, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50037(SubLObject var2) {
        if (var2 == module0777.UNPROVIDED) {
            var2 = module0574.f35152();
        }
        final SubLObject var3 = module0409.f28506((SubLObject)ConsesLow.listS(module0777.$ic42$, (SubLObject)ConsesLow.listS(module0777.$ic43$, var2, (SubLObject)module0777.$ic44$), (SubLObject)module0777.$ic45$), module0777.$ic35$, (SubLObject)module0777.$ic46$).first();
        return (module0777.NIL != var3) ? var3 : module0777.$ic47$;
    }
    
    public static SubLObject f50038(final SubLObject var70) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL != Characters.upper_case_p(var70) || module0777.NIL != Characters.digit_char_p(var70, (SubLObject)module0777.UNPROVIDED));
    }
    
    public static SubLObject f50039(final SubLObject var71) {
        final SubLThread var72 = SubLProcess.currentSubLThread();
        final SubLObject var73 = Sequences.length(var71);
        final SubLObject var74 = Strings.make_string(var73, (SubLObject)module0777.UNPROVIDED);
        SubLObject var75 = (SubLObject)module0777.ZERO_INTEGER;
        SubLObject var76 = (SubLObject)module0777.MINUS_ONE_INTEGER;
        SubLObject var78_79;
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        SubLObject var81;
        for (var77 = (var78_79 = Sequences.length(var71)), var78 = (SubLObject)module0777.NIL, var78 = (SubLObject)module0777.ZERO_INTEGER; !var78.numGE(var78_79); var78 = module0048.f_1X(var78)) {
            var79 = Strings.sublisp_char(var71, var78);
            var80 = module0038.f2631(var71, Numbers.add(var78, (SubLObject)module0777.ONE_INTEGER));
            var81 = module0038.f2631(var71, Numbers.add(var78, (SubLObject)module0777.TWO_INTEGER));
            if (!var79.eql((SubLObject)Characters.CHAR_space) || module0777.NIL == f50038(var80) || (!var81.eql((SubLObject)Characters.CHAR_space) && var81 != module0777.NIL) || !var75.numE((SubLObject)module0777.ONE_INTEGER)) {
                var76 = Numbers.add(var76, (SubLObject)module0777.ONE_INTEGER);
                Strings.set_char(var74, var76, var79);
            }
            if (module0777.$g6251$.getDynamicValue(var72).numGE(module0777.$g6247$.getGlobalValue())) {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var72), (SubLObject)module0777.$ic48$, new SubLObject[] { var79, var80, var81, var75, var76 });
                streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(var72));
            }
            if (module0777.NIL != f50038(var79)) {
                var75 = Numbers.add(var75, (SubLObject)module0777.ONE_INTEGER);
            }
            else {
                var75 = (SubLObject)module0777.ZERO_INTEGER;
            }
        }
        return module0038.f2784(var74, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50040(final SubLObject var44, SubLObject var83) {
        if (var83 == module0777.UNPROVIDED) {
            var83 = (SubLObject)module0777.NIL;
        }
        SubLObject var84 = (module0777.NIL != module0128.f8449(var44)) ? f50039(module0213.f13925(var44, (SubLObject)module0777.UNPROVIDED)) : module0770.f49049(var44, (SubLObject)module0777.$ic49$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        if (module0777.NIL == f50041(var44) && module0777.NIL == var83) {
            var84 = Strings.string_downcase(var84, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        }
        return var84;
    }
    
    public static SubLObject f50041(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        SubLObject var46 = (SubLObject)module0777.NIL;
        final SubLObject var47 = module0147.$g2094$.currentBinding(var45);
        final SubLObject var48 = module0147.$g2095$.currentBinding(var45);
        try {
            module0147.$g2094$.bind((SubLObject)module0777.$ic34$, var45);
            module0147.$g2095$.bind(module0777.$ic35$, var45);
            if (module0777.NIL == module0269.f17697(var44, (SubLObject)module0777.UNPROVIDED)) {
                var46 = (SubLObject)module0777.T;
            }
        }
        finally {
            module0147.$g2095$.rebind(var48, var45);
            module0147.$g2094$.rebind(var47, var45);
        }
        return var46;
    }
    
    public static SubLObject f50042(final SubLObject var69) {
        SubLObject var70 = f50040(var69, (SubLObject)module0777.T);
        var70 = module0038.f2709(var70, (SubLObject)module0777.$ic50$);
        if (module0777.NIL != module0038.f2673(var70, (SubLObject)module0777.$ic51$, (SubLObject)module0777.UNPROVIDED)) {
            var70 = Sequences.cconcatenate((SubLObject)module0777.$ic52$, module0038.f2709(var70, (SubLObject)module0777.$ic51$));
        }
        var70 = module0038.f2659((SubLObject)module0777.$ic53$, (SubLObject)module0777.$ic54$, var70, (SubLObject)module0777.UNPROVIDED);
        var70 = module0038.f2659((SubLObject)module0777.$ic53$, (SubLObject)module0777.$ic55$, var70, (SubLObject)module0777.UNPROVIDED);
        return module0038.f2735(var70);
    }
    
    public static SubLObject f50043(final SubLObject var69) {
        final SubLObject var70 = module0038.f2738(f50042(var69), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        return (SubLObject)ConsesLow.list(module0777.$ic56$, var70, module0777.$ic57$, module0777.$ic58$, var69);
    }
    
    public static SubLObject f50044(final SubLObject var88) {
        SubLObject var89 = var88;
        SubLObject var90 = (SubLObject)module0777.NIL;
        var90 = var89.first();
        while (module0777.NIL != var89) {
            final SubLObject var91 = f50043(var90);
            f50045(var91, module0777.$ic59$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
            var89 = var89.rest();
            var90 = var89.first();
        }
        return (SubLObject)module0777.T;
    }
    
    public static SubLObject f50046(final SubLObject var69) {
        final SubLObject var70 = module0038.f2738(f50042(var69), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        SubLObject var71 = (SubLObject)module0777.NIL;
        if (module0777.NIL == var71) {
            SubLObject var72 = var70;
            SubLObject var73 = (SubLObject)module0777.NIL;
            var73 = var72.first();
            while (module0777.NIL == var71 && module0777.NIL != var72) {
                if (module0777.NIL == module0035.f2014(module0737.f45432(var73, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) && module0777.NIL == module0038.f2734(var73)) {
                    var71 = (SubLObject)module0777.T;
                }
                var72 = var72.rest();
                var73 = var72.first();
            }
        }
        return var71;
    }
    
    public static SubLObject f50047(final SubLObject var93) {
        SubLObject var94 = (SubLObject)module0777.NIL;
        if (module0777.NIL == var94) {
            SubLObject var95 = var93;
            SubLObject var96 = (SubLObject)module0777.NIL;
            var96 = var95.first();
            while (module0777.NIL == var94 && module0777.NIL != var95) {
                if (module0777.NIL == var96 || var96.equal((SubLObject)module0777.$ic60$)) {
                    var94 = (SubLObject)module0777.T;
                }
                var95 = var95.rest();
                var96 = var95.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL == var94);
    }
    
    public static SubLObject f50048(final SubLObject var96) {
        final SubLThread var97 = SubLProcess.currentSubLThread();
        assert module0777.NIL != Types.integerp(var96) : var96;
        var97.resetMultipleValues();
        final SubLObject var98 = module0051.f3613(var96);
        final SubLObject var99 = var97.secondMultipleValue();
        final SubLObject var100 = var97.thirdMultipleValue();
        var97.resetMultipleValues();
        return Time.encode_universal_time((SubLObject)module0777.ZERO_INTEGER, (SubLObject)module0777.ZERO_INTEGER, (SubLObject)module0777.ZERO_INTEGER, var98, var99, var100, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50030(final SubLObject var100) {
        final SubLThread var101 = SubLProcess.currentSubLThread();
        var101.resetMultipleValues();
        final SubLObject var102 = Time.decode_universal_time(var100, (SubLObject)module0777.UNPROVIDED);
        final SubLObject var103 = var101.secondMultipleValue();
        final SubLObject var104 = var101.thirdMultipleValue();
        final SubLObject var105 = var101.fourthMultipleValue();
        final SubLObject var106 = var101.fifthMultipleValue();
        final SubLObject var107 = var101.sixthMultipleValue();
        var101.resetMultipleValues();
        return module0051.f3604(var105, var106, var107);
    }
    
    public static SubLObject f50029(final SubLObject var104) {
        final SubLObject var105 = Time.get_universal_time();
        final SubLObject var106 = Numbers.multiply((SubLObject)module0777.$ic62$, (SubLObject)module0777.$ic63$);
        final SubLObject var107 = Numbers.subtract(var105, Numbers.multiply(var104, var106));
        return f50030(var107);
    }
    
    public static SubLObject f50049(final SubLObject var108, SubLObject var109) {
        if (var109 == module0777.UNPROVIDED) {
            var109 = (SubLObject)module0777.ZERO_INTEGER;
        }
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = var109;
        SubLObject var112 = (SubLObject)module0777.NIL;
        try {
            var110.throwStack.push(module0777.$ic64$);
            final SubLObject var113 = Errors.$error_handler$.currentBinding(var110);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)module0777.$ic65$), var110);
                try {
                    final SubLObject var114 = reader.parse_integer(var108, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                    if (module0777.NIL != var114) {
                        var111 = var114;
                    }
                }
                catch (Throwable var115) {
                    Errors.handleThrowable(var115, (SubLObject)module0777.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var113, var110);
            }
        }
        catch (Throwable var116) {
            var112 = Errors.handleThrowable(var116, (SubLObject)module0777.$ic64$);
        }
        finally {
            var110.throwStack.pop();
        }
        return var111;
    }
    
    public static SubLObject f50050(final SubLObject var93) {
        return Sort.stable_sort(var93, Symbols.symbol_function((SubLObject)module0777.$ic66$), Symbols.symbol_function((SubLObject)module0777.$ic67$));
    }
    
    public static SubLObject f50051(final SubLObject var115) {
        return f50052(var115, (SubLObject)module0777.ONE_INTEGER);
    }
    
    public static SubLObject f50052(final SubLObject var115, final SubLObject var116) {
        final SubLThread var117 = SubLProcess.currentSubLThread();
        SubLObject var118 = module0777.$ic68$;
        final SubLObject var119 = module0147.$g2094$.currentBinding(var117);
        final SubLObject var120 = module0147.$g2095$.currentBinding(var117);
        try {
            module0147.$g2094$.bind((SubLObject)module0777.$ic34$, var117);
            module0147.$g2095$.bind(module0777.$ic35$, var117);
            final SubLObject var121 = Sequences.remove(module0777.$ic68$, module0549.f33908(module0226.f14882(var115, var116, (SubLObject)module0777.UNPROVIDED), (SubLObject)module0777.UNPROVIDED), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
            if (module0777.NIL != var121) {
                var118 = var121.first();
            }
        }
        finally {
            module0147.$g2095$.rebind(var120, var117);
            module0147.$g2094$.rebind(var119, var117);
        }
        return var118;
    }
    
    public static SubLObject f50053(final SubLObject var119, final SubLObject var120) {
        return f50052(var119, var120);
    }
    
    public static SubLObject f50054() {
        final SubLObject var121 = module0777.$g6256$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50055(final SubLObject var122, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0777.$ic69$;
        }
        return module0034.f1829(module0777.$g6256$.getGlobalValue(), (SubLObject)ConsesLow.list(var122, var123), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50056(final SubLObject var122, final SubLObject var123) {
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic71$, var123)) {
            return (SubLObject)module0777.$ic72$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic73$, var123)) {
            return (SubLObject)module0777.$ic74$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic75$, var123)) {
            return (SubLObject)module0777.$ic76$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic77$, var123)) {
            return (SubLObject)module0777.$ic78$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic79$, var123)) {
            return (SubLObject)module0777.$ic80$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic81$, var123)) {
            return (SubLObject)module0777.$ic82$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic83$, var123)) {
            return (SubLObject)module0777.$ic84$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic85$, var123)) {
            return (SubLObject)module0777.$ic86$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic87$, var123)) {
            return (SubLObject)module0777.$ic88$;
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50057(final SubLObject var122, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0777.$ic69$;
        }
        SubLObject var124 = module0777.$g6256$.getGlobalValue();
        if (module0777.NIL == var124) {
            var124 = module0034.f1934((SubLObject)module0777.$ic70$, (SubLObject)module0777.$ic89$, (SubLObject)module0777.$ic90$, (SubLObject)module0777.EQL, (SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.$ic91$);
        }
        final SubLObject var125 = module0034.f1782(var122, var123);
        final SubLObject var126 = module0034.f1814(var124, var125, (SubLObject)module0777.UNPROVIDED);
        if (var126 != module0777.$ic92$) {
            SubLObject var127 = var126;
            SubLObject var128 = (SubLObject)module0777.NIL;
            var128 = var127.first();
            while (module0777.NIL != var127) {
                SubLObject var129 = var128.first();
                final SubLObject var130 = conses_high.second(var128);
                if (var122.eql(var129.first())) {
                    var129 = var129.rest();
                    if (module0777.NIL != var129 && module0777.NIL == var129.rest() && var123.eql(var129.first())) {
                        return module0034.f1959(var130);
                    }
                }
                var127 = var127.rest();
                var128 = var127.first();
            }
        }
        final SubLObject var131 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50056(var122, var123)));
        module0034.f1836(var124, var125, var126, var131, (SubLObject)ConsesLow.list(var122, var123));
        return module0034.f1959(var131);
    }
    
    public static SubLObject f50058() {
        final SubLObject var121 = module0777.$g6257$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50059(final SubLObject var122, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0777.$ic69$;
        }
        return module0034.f1829(module0777.$g6257$.getGlobalValue(), (SubLObject)ConsesLow.list(var122, var123), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50060(final SubLObject var122, final SubLObject var123) {
        assert module0777.NIL != module0173.f10955(var122) : var122;
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic58$, var123)) {
            return (SubLObject)module0777.$ic94$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic95$, var123)) {
            return (SubLObject)module0777.$ic96$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic97$, var123)) {
            return (SubLObject)module0777.$ic98$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic99$, var123)) {
            return (SubLObject)module0777.$ic100$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic101$, var123)) {
            return (SubLObject)module0777.$ic102$;
        }
        if (module0777.NIL != module0731.f44713(var122, module0777.$ic103$, var123)) {
            return (SubLObject)module0777.$ic104$;
        }
        return f50057(var122, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50061(final SubLObject var122, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0777.$ic69$;
        }
        SubLObject var124 = module0777.$g6257$.getGlobalValue();
        if (module0777.NIL == var124) {
            var124 = module0034.f1934((SubLObject)module0777.$ic93$, (SubLObject)module0777.$ic105$, (SubLObject)module0777.$ic90$, (SubLObject)module0777.EQL, (SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.$ic91$);
        }
        final SubLObject var125 = module0034.f1782(var122, var123);
        final SubLObject var126 = module0034.f1814(var124, var125, (SubLObject)module0777.UNPROVIDED);
        if (var126 != module0777.$ic92$) {
            SubLObject var127 = var126;
            SubLObject var128 = (SubLObject)module0777.NIL;
            var128 = var127.first();
            while (module0777.NIL != var127) {
                SubLObject var129 = var128.first();
                final SubLObject var130 = conses_high.second(var128);
                if (var122.eql(var129.first())) {
                    var129 = var129.rest();
                    if (module0777.NIL != var129 && module0777.NIL == var129.rest() && var123.eql(var129.first())) {
                        return module0034.f1959(var130);
                    }
                }
                var127 = var127.rest();
                var128 = var127.first();
            }
        }
        final SubLObject var131 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50060(var122, var123)));
        module0034.f1836(var124, var125, var126, var131, (SubLObject)ConsesLow.list(var122, var123));
        return module0034.f1959(var131);
    }
    
    public static SubLObject f50062() {
        final SubLObject var121 = module0777.$g6258$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50063(final SubLObject var115, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0777.$ic69$;
        }
        return module0034.f1829(module0777.$g6258$.getGlobalValue(), (SubLObject)ConsesLow.list(var115, var123), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50064(final SubLObject var115, final SubLObject var123) {
        return f50057(module0731.f44691(var115), var123);
    }
    
    public static SubLObject f50065(final SubLObject var115, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0777.$ic69$;
        }
        SubLObject var124 = module0777.$g6258$.getGlobalValue();
        if (module0777.NIL == var124) {
            var124 = module0034.f1934((SubLObject)module0777.$ic106$, (SubLObject)module0777.$ic107$, (SubLObject)module0777.$ic90$, (SubLObject)module0777.EQL, (SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.$ic91$);
        }
        final SubLObject var125 = module0034.f1782(var115, var123);
        final SubLObject var126 = module0034.f1814(var124, var125, (SubLObject)module0777.UNPROVIDED);
        if (var126 != module0777.$ic92$) {
            SubLObject var127 = var126;
            SubLObject var128 = (SubLObject)module0777.NIL;
            var128 = var127.first();
            while (module0777.NIL != var127) {
                SubLObject var129 = var128.first();
                final SubLObject var130 = conses_high.second(var128);
                if (var115.eql(var129.first())) {
                    var129 = var129.rest();
                    if (module0777.NIL != var129 && module0777.NIL == var129.rest() && var123.eql(var129.first())) {
                        return module0034.f1959(var130);
                    }
                }
                var127 = var127.rest();
                var128 = var127.first();
            }
        }
        final SubLObject var131 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50064(var115, var123)));
        module0034.f1836(var124, var125, var126, var131, (SubLObject)ConsesLow.list(var115, var123));
        return module0034.f1959(var131);
    }
    
    public static SubLObject f50066() {
        final SubLObject var121 = module0777.$g6259$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50067(final SubLObject var115, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0777.$ic69$;
        }
        return module0034.f1829(module0777.$g6259$.getGlobalValue(), (SubLObject)ConsesLow.list(var115, var123), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50068(final SubLObject var115, final SubLObject var123) {
        return f50061(module0731.f44691(var115), var123);
    }
    
    public static SubLObject f50069(final SubLObject var115, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0777.$ic69$;
        }
        SubLObject var124 = module0777.$g6259$.getGlobalValue();
        if (module0777.NIL == var124) {
            var124 = module0034.f1934((SubLObject)module0777.$ic108$, (SubLObject)module0777.$ic109$, (SubLObject)module0777.$ic90$, (SubLObject)module0777.EQL, (SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.$ic91$);
        }
        final SubLObject var125 = module0034.f1782(var115, var123);
        final SubLObject var126 = module0034.f1814(var124, var125, (SubLObject)module0777.UNPROVIDED);
        if (var126 != module0777.$ic92$) {
            SubLObject var127 = var126;
            SubLObject var128 = (SubLObject)module0777.NIL;
            var128 = var127.first();
            while (module0777.NIL != var127) {
                SubLObject var129 = var128.first();
                final SubLObject var130 = conses_high.second(var128);
                if (var115.eql(var129.first())) {
                    var129 = var129.rest();
                    if (module0777.NIL != var129 && module0777.NIL == var129.rest() && var123.eql(var129.first())) {
                        return module0034.f1959(var130);
                    }
                }
                var127 = var127.rest();
                var128 = var127.first();
            }
        }
        final SubLObject var131 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50068(var115, var123)));
        module0034.f1836(var124, var125, var126, var131, (SubLObject)ConsesLow.list(var115, var123));
        return module0034.f1959(var131);
    }
    
    public static SubLObject f50070(final SubLObject var90, final SubLObject var69) {
        SubLObject var91 = (SubLObject)module0777.NIL;
        if (module0777.NIL == module0274.f18060(var90, var69, (SubLObject)module0777.UNPROVIDED)) {
            var91 = module0274.f18195(var90, var69, (SubLObject)module0777.UNPROVIDED);
        }
        return var91;
    }
    
    public static SubLObject f50071(final SubLObject var90, final SubLObject var69) {
        SubLObject var91 = f50070(var90, var69);
        if (module0777.NIL != var91) {
            var91 = PrintLow.format((SubLObject)module0777.NIL, (SubLObject)module0777.$ic110$, var91);
        }
        return var91;
    }
    
    public static SubLObject f50072(final SubLObject var132) {
        return module0731.f44736(var132, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50073(final SubLObject var133) {
        SubLObject var134 = module0731.f44745(var133, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        if (module0777.NIL == var134) {
            SubLObject var135 = module0731.f44783(var133, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
            SubLObject var136 = (SubLObject)module0777.NIL;
            var136 = var135.first();
            while (module0777.NIL == var134 && module0777.NIL != var135) {
                if (module0777.NIL != module0259.f16891(var136, module0777.$ic111$)) {
                    var134 = (SubLObject)module0777.$ic112$;
                }
                var135 = var135.rest();
                var136 = var135.first();
            }
        }
        return var134;
    }
    
    public static SubLObject f50074() {
        final SubLObject var121 = module0777.$g6260$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50075(final SubLObject var92) {
        return module0034.f1829(module0777.$g6260$.getGlobalValue(), (SubLObject)ConsesLow.list(var92), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50076(final SubLObject var92) {
        return module0728.f44496(module0728.f44519(var92, (SubLObject)module0777.$ic78$), (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50077(final SubLObject var92) {
        SubLObject var93 = module0777.$g6260$.getGlobalValue();
        if (module0777.NIL == var93) {
            var93 = module0034.f1934((SubLObject)module0777.$ic113$, (SubLObject)module0777.$ic114$, (SubLObject)module0777.$ic115$, (SubLObject)module0777.EQUAL, (SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic116$);
        }
        SubLObject var94 = module0034.f1814(var93, var92, (SubLObject)module0777.$ic92$);
        if (var94 == module0777.$ic92$) {
            var94 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50076(var92)));
            module0034.f1816(var93, var92, var94, (SubLObject)module0777.UNPROVIDED);
        }
        return module0034.f1959(var94);
    }
    
    public static SubLObject f50078() {
        final SubLObject var121 = module0777.$g6261$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50079(final SubLObject var92) {
        return module0034.f1829(module0777.$g6261$.getGlobalValue(), (SubLObject)ConsesLow.list(var92), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50080(final SubLObject var92) {
        return module0728.f44524(var92, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50081(final SubLObject var92) {
        SubLObject var93 = module0777.$g6261$.getGlobalValue();
        if (module0777.NIL == var93) {
            var93 = module0034.f1934((SubLObject)module0777.$ic117$, (SubLObject)module0777.$ic118$, (SubLObject)module0777.$ic115$, (SubLObject)module0777.EQUAL, (SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic116$);
        }
        SubLObject var94 = module0034.f1814(var93, var92, (SubLObject)module0777.$ic92$);
        if (var94 == module0777.$ic92$) {
            var94 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50080(var92)));
            module0034.f1816(var93, var92, var94, (SubLObject)module0777.UNPROVIDED);
        }
        return module0034.f1959(var94);
    }
    
    public static SubLObject f50082() {
        final SubLObject var121 = module0777.$g6262$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50083(final SubLObject var132) {
        return module0034.f1829(module0777.$g6262$.getGlobalValue(), (SubLObject)ConsesLow.list(var132), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50084(final SubLObject var132) {
        return conses_high.intersection(module0732.f44951(var132), module0584.$g4426$.getGlobalValue(), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50085(final SubLObject var132) {
        SubLObject var133 = module0777.$g6262$.getGlobalValue();
        if (module0777.NIL == var133) {
            var133 = module0034.f1934((SubLObject)module0777.$ic119$, (SubLObject)module0777.$ic120$, (SubLObject)module0777.$ic121$, (SubLObject)module0777.EQ, (SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.TWELVE_INTEGER);
        }
        SubLObject var134 = module0034.f1814(var133, var132, (SubLObject)module0777.$ic92$);
        if (var134 == module0777.$ic92$) {
            var134 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50084(var132)));
            module0034.f1816(var133, var132, var134, (SubLObject)module0777.UNPROVIDED);
        }
        return module0034.f1959(var134);
    }
    
    public static SubLObject f50086() {
        final SubLObject var121 = module0777.$g6263$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50087(final SubLObject var138) {
        return module0034.f1829(module0777.$g6263$.getGlobalValue(), (SubLObject)ConsesLow.list(var138), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50088(final SubLObject var138) {
        final SubLObject var139 = ConsesLow.append(module0731.f44737(var138, (SubLObject)module0777.$ic80$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED), module0731.f44737(var138, (SubLObject)module0777.$ic78$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED), module0730.f44560(var138, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED));
        SubLObject var140 = (SubLObject)module0777.NIL;
        if (module0777.NIL == var140) {
            SubLObject var141;
            SubLObject var142;
            for (var141 = var139, var142 = (SubLObject)module0777.NIL, var142 = var141.first(); module0777.NIL == var140 && module0777.NIL != var141; var140 = module0730.f44575(var142, module0584.$g4426$.getGlobalValue(), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED).first(), var141 = var141.rest(), var142 = var141.first()) {}
        }
        if (module0777.NIL == var140) {
            SubLObject var141 = module0730.f44560(var138, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
            SubLObject var142 = (SubLObject)module0777.NIL;
            var142 = var141.first();
            while (module0777.NIL == var140 && module0777.NIL != var141) {
                final SubLObject var143 = module0656.f39942(var142);
                var140 = Strings.string_downcase(module0038.f2622(var143, (SubLObject)Characters.CHAR_hyphen), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                var141 = var141.rest();
                var142 = var141.first();
            }
        }
        if (module0777.NIL == var140) {
            var140 = var138;
        }
        return var140;
    }
    
    public static SubLObject f50089(final SubLObject var138) {
        SubLObject var139 = module0777.$g6263$.getGlobalValue();
        if (module0777.NIL == var139) {
            var139 = module0034.f1934((SubLObject)module0777.$ic122$, (SubLObject)module0777.$ic123$, (SubLObject)module0777.$ic115$, (SubLObject)module0777.EQUAL, (SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic116$);
        }
        SubLObject var140 = module0034.f1814(var139, var138, (SubLObject)module0777.$ic92$);
        if (var140 == module0777.$ic92$) {
            var140 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50088(var138)));
            module0034.f1816(var139, var138, var140, (SubLObject)module0777.UNPROVIDED);
        }
        return module0034.f1959(var140);
    }
    
    public static SubLObject f50090(final SubLObject var44, SubLObject var143) {
        if (var143 == module0777.UNPROVIDED) {
            var143 = (SubLObject)module0777.$ic124$;
        }
        final SubLThread var144 = SubLProcess.currentSubLThread();
        SubLObject var145 = (SubLObject)module0777.NIL;
        final SubLObject var146 = module0579.$g4260$.currentBinding(var144);
        try {
            module0579.$g4260$.bind(module0777.$ic125$, var144);
            var145 = Sequences.remove_duplicates(module0764.f48457(var44, var143, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED), Symbols.symbol_function((SubLObject)module0777.EQUALP), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        }
        finally {
            module0579.$g4260$.rebind(var146, var144);
        }
        return var145;
    }
    
    public static SubLObject f50091(final SubLObject var44) {
        return f50090(var44, module0584.$g4426$.getGlobalValue());
    }
    
    public static SubLObject f50092(final SubLObject var145) {
        return module0038.f2761(var145, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50093(final SubLObject var71) {
        SubLObject var72;
        SubLObject var73;
        for (var72 = Sequences.length(var71), var73 = (SubLObject)module0777.NIL, var73 = (SubLObject)module0777.ZERO_INTEGER; var73.numL(var72); var73 = Numbers.add(var73, (SubLObject)module0777.ONE_INTEGER)) {
            if (module0777.NIL != module0728.f44427(Strings.sublisp_char(var71, var73), (SubLObject)module0777.T)) {
                return (SubLObject)module0777.T;
            }
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50094(final SubLObject var138, SubLObject var132) {
        if (var132 == module0777.UNPROVIDED) {
            var132 = (SubLObject)module0777.$ic96$;
        }
        SubLObject var139 = module0728.f44519(var138, (SubLObject)module0777.UNPROVIDED);
        if (var139.equalp(var138) && module0777.NIL == module0730.f44560(var138, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) {
            SubLObject var140 = var139;
            final SubLObject var141 = var132;
            if (var141.eql((SubLObject)module0777.$ic80$)) {
                var140 = module0728.f44521(var138);
            }
            else if (var141.eql((SubLObject)module0777.$ic96$)) {
                var140 = module0728.f44524(var138, (SubLObject)module0777.UNPROVIDED);
            }
            if (module0777.NIL != f50093(var140)) {
                var139 = var140;
            }
        }
        return var139;
    }
    
    public static SubLObject f50095() {
        final SubLObject var121 = module0777.$g6264$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50096(final SubLObject var115) {
        return module0034.f1829(module0777.$g6264$.getGlobalValue(), (SubLObject)ConsesLow.list(var115), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50097(final SubLObject var115) {
        return module0538.f33428((SubLObject)ConsesLow.listS(module0777.$ic42$, (SubLObject)ConsesLow.listS(module0777.$ic127$, var115, (SubLObject)module0777.$ic128$), (SubLObject)module0777.$ic129$), module0777.$ic130$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50098(final SubLObject var115) {
        SubLObject var116 = module0777.$g6264$.getGlobalValue();
        if (module0777.NIL == var116) {
            var116 = module0034.f1934((SubLObject)module0777.$ic126$, (SubLObject)module0777.$ic131$, (SubLObject)module0777.$ic132$, (SubLObject)module0777.EQL, (SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic133$);
        }
        SubLObject var117 = module0034.f1814(var116, var115, (SubLObject)module0777.$ic92$);
        if (var117 == module0777.$ic92$) {
            var117 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50097(var115)));
            module0034.f1816(var116, var115, var117, (SubLObject)module0777.UNPROVIDED);
        }
        return module0034.f1959(var117);
    }
    
    public static SubLObject f50099() {
        SubLObject var151 = (SubLObject)module0777.NIL;
        SubLObject var152 = module0260.f17034(module0777.$ic134$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        SubLObject var153 = (SubLObject)module0777.NIL;
        var153 = var152.first();
        while (module0777.NIL != var152) {
            if (module0777.NIL != f50098(var153)) {
                var151 = (SubLObject)ConsesLow.cons(var153, var151);
            }
            var152 = var152.rest();
            var153 = var152.first();
        }
        return var151;
    }
    
    public static SubLObject f50100() {
        final SubLObject var121 = module0777.$g6265$.getGlobalValue();
        if (module0777.NIL != var121) {
            module0034.f1818(var121);
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50101(final SubLObject var115, SubLObject var112) {
        if (var112 == module0777.UNPROVIDED) {
            var112 = module0777.$g6253$.getGlobalValue();
        }
        return module0034.f1829(module0777.$g6265$.getGlobalValue(), (SubLObject)ConsesLow.list(var115, var112), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50102(final SubLObject var115, final SubLObject var112) {
        final SubLThread var116 = SubLProcess.currentSubLThread();
        if (module0777.$g6251$.getDynamicValue(var116).numGE(Numbers.max(module0777.$g6251$.getDynamicValue(var116), module0777.$g6245$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var116), (SubLObject)module0777.$ic136$, var115, var112);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(var116));
        }
        final SubLObject var117 = f50103(var115);
        SubLObject var118 = module0035.f2124(var112, var117);
        SubLObject var119;
        SubLObject var120;
        SubLObject var121;
        for (var119 = module0035.f2000(var118, var112, (SubLObject)module0777.UNPROVIDED), var120 = (SubLObject)module0777.NIL, var121 = (SubLObject)module0777.NIL, var120 = f50104(var115), var121 = var120.first(); module0777.NIL != var121 && module0777.NIL == var119; var121 = var120.first()) {
            if (module0777.NIL == module0004.f104(var121, var118, Symbols.symbol_function((SubLObject)module0777.EQUALP), (SubLObject)module0777.UNPROVIDED)) {
                var118 = (SubLObject)ConsesLow.cons(var121, var118);
                var119 = module0035.f2000(var118, var112, (SubLObject)module0777.UNPROVIDED);
            }
            var120 = var120.rest();
        }
        return Sequences.nreverse(var118);
    }
    
    public static SubLObject f50105(final SubLObject var115, SubLObject var112) {
        if (var112 == module0777.UNPROVIDED) {
            var112 = module0777.$g6253$.getGlobalValue();
        }
        SubLObject var116 = module0777.$g6265$.getGlobalValue();
        if (module0777.NIL == var116) {
            var116 = module0034.f1934((SubLObject)module0777.$ic135$, (SubLObject)module0777.$ic137$, (SubLObject)module0777.$ic90$, (SubLObject)module0777.EQL, (SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.$ic91$);
        }
        final SubLObject var117 = module0034.f1782(var115, var112);
        final SubLObject var118 = module0034.f1814(var116, var117, (SubLObject)module0777.UNPROVIDED);
        if (var118 != module0777.$ic92$) {
            SubLObject var119 = var118;
            SubLObject var120 = (SubLObject)module0777.NIL;
            var120 = var119.first();
            while (module0777.NIL != var119) {
                SubLObject var121 = var120.first();
                final SubLObject var122 = conses_high.second(var120);
                if (var115.eql(var121.first())) {
                    var121 = var121.rest();
                    if (module0777.NIL != var121 && module0777.NIL == var121.rest() && var112.eql(var121.first())) {
                        return module0034.f1959(var122);
                    }
                }
                var119 = var119.rest();
                var120 = var119.first();
            }
        }
        final SubLObject var123 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f50102(var115, var112)));
        module0034.f1836(var116, var117, var118, var123, (SubLObject)ConsesLow.list(var115, var112));
        return module0034.f1959(var123);
    }
    
    public static SubLObject f50103(final SubLObject var115) {
        SubLObject var116 = f50106(var115);
        SubLObject var117 = module0220.f14565(var115, module0777.$ic138$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        SubLObject var118 = (SubLObject)module0777.NIL;
        var118 = var117.first();
        while (module0777.NIL != var117) {
            final SubLObject var119 = reader.read_from_string_ignoring_errors(var118, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
            final SubLObject var120 = (SubLObject)((module0777.NIL != module0202.f12590(var119)) ? module0205.f13204(var119, (SubLObject)module0777.UNPROVIDED) : module0777.NIL);
            if (var120.isString()) {
                final SubLObject var121 = var120;
                if (module0777.NIL == conses_high.member(var121, var116, Symbols.symbol_function((SubLObject)module0777.EQL), Symbols.symbol_function((SubLObject)module0777.IDENTITY))) {
                    var116 = (SubLObject)ConsesLow.cons(var121, var116);
                }
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        return var116;
    }
    
    public static SubLObject f50106(final SubLObject var115) {
        SubLObject var116 = (SubLObject)module0777.NIL;
        SubLObject var117 = (SubLObject)module0777.$ic139$;
        SubLObject var118 = (SubLObject)module0777.NIL;
        var118 = var117.first();
        while (module0777.NIL != var117) {
            SubLObject var89_160 = module0220.f14565(var115, var118, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
            SubLObject var119 = (SubLObject)module0777.NIL;
            var119 = var89_160.first();
            while (module0777.NIL != var89_160) {
                final SubLObject var120 = module0205.f13204(var119, (SubLObject)module0777.UNPROVIDED);
                if (var120.isString()) {
                    final SubLObject var121 = var120;
                    if (module0777.NIL == conses_high.member(var121, var116, Symbols.symbol_function((SubLObject)module0777.EQL), Symbols.symbol_function((SubLObject)module0777.IDENTITY))) {
                        var116 = (SubLObject)ConsesLow.cons(var121, var116);
                    }
                }
                var89_160 = var89_160.rest();
                var119 = var89_160.first();
            }
            var117 = var117.rest();
            var118 = var117.first();
        }
        return var116;
    }
    
    public static SubLObject f50104(final SubLObject var115) {
        final SubLThread var116 = SubLProcess.currentSubLThread();
        SubLObject var117 = (SubLObject)module0777.NIL;
        final SubLObject var118 = module0147.$g2094$.currentBinding(var116);
        final SubLObject var119 = module0147.$g2095$.currentBinding(var116);
        try {
            module0147.$g2094$.bind((SubLObject)module0777.$ic34$, var116);
            module0147.$g2095$.bind(module0777.$ic35$, var116);
            if (module0777.NIL != module0158.f10038(var115)) {
                final SubLObject var120 = (SubLObject)module0777.NIL;
                final SubLObject var36_163 = module0012.$g73$.currentBinding(var116);
                final SubLObject var37_164 = module0012.$g65$.currentBinding(var116);
                final SubLObject var121 = module0012.$g67$.currentBinding(var116);
                final SubLObject var122 = module0012.$g68$.currentBinding(var116);
                final SubLObject var123 = module0012.$g66$.currentBinding(var116);
                final SubLObject var124 = module0012.$g69$.currentBinding(var116);
                final SubLObject var125 = module0012.$g70$.currentBinding(var116);
                final SubLObject var126 = module0012.$silent_progressP$.currentBinding(var116);
                try {
                    module0012.$g73$.bind(Time.get_universal_time(), var116);
                    module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var116), var116);
                    module0012.$g67$.bind((SubLObject)module0777.ONE_INTEGER, var116);
                    module0012.$g68$.bind((SubLObject)module0777.ZERO_INTEGER, var116);
                    module0012.$g66$.bind((SubLObject)module0777.ZERO_INTEGER, var116);
                    module0012.$g69$.bind((SubLObject)module0777.ZERO_INTEGER, var116);
                    module0012.$g70$.bind((SubLObject)module0777.T, var116);
                    module0012.$silent_progressP$.bind((SubLObject)((module0777.NIL != var120) ? module0012.$silent_progressP$.getDynamicValue(var116) : module0777.T), var116);
                    module0012.f474(var120);
                    final SubLObject var127 = module0158.f10039(var115);
                    SubLObject var128 = (SubLObject)module0777.NIL;
                    final SubLObject var129 = (SubLObject)module0777.NIL;
                    while (module0777.NIL == var128) {
                        final SubLObject var130 = module0052.f3695(var127, var129);
                        final SubLObject var131 = (SubLObject)SubLObjectFactory.makeBoolean(!var129.eql(var130));
                        if (module0777.NIL != var131) {
                            module0012.f476();
                            SubLObject var132 = (SubLObject)module0777.NIL;
                            try {
                                var132 = module0158.f10316(var130, (SubLObject)module0777.$ic140$, (SubLObject)module0777.NIL, (SubLObject)module0777.NIL);
                                SubLObject var170_175 = (SubLObject)module0777.NIL;
                                final SubLObject var171_176 = (SubLObject)module0777.NIL;
                                while (module0777.NIL == var170_175) {
                                    final SubLObject var133 = module0052.f3695(var132, var171_176);
                                    final SubLObject var173_178 = (SubLObject)SubLObjectFactory.makeBoolean(!var171_176.eql(var133));
                                    if (module0777.NIL != var173_178 && module0777.NIL != module0178.f11284(var133)) {
                                        final SubLObject var134 = module0178.f11335(var133);
                                        if (var134.isString()) {
                                            var117 = (SubLObject)ConsesLow.cons(var134, var117);
                                        }
                                    }
                                    var170_175 = (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL == var173_178);
                                }
                            }
                            finally {
                                final SubLObject var36_164 = Threads.$is_thread_performing_cleanupP$.currentBinding(var116);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0777.T, var116);
                                    if (module0777.NIL != var132) {
                                        module0158.f10319(var132);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var36_164, var116);
                                }
                            }
                        }
                        var128 = (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL == var131);
                    }
                    module0012.f475();
                }
                finally {
                    module0012.$silent_progressP$.rebind(var126, var116);
                    module0012.$g70$.rebind(var125, var116);
                    module0012.$g69$.rebind(var124, var116);
                    module0012.$g66$.rebind(var123, var116);
                    module0012.$g68$.rebind(var122, var116);
                    module0012.$g67$.rebind(var121, var116);
                    module0012.$g65$.rebind(var37_164, var116);
                    module0012.$g73$.rebind(var36_163, var116);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var119, var116);
            module0147.$g2094$.rebind(var118, var116);
        }
        return var117;
    }
    
    public static SubLObject f50045(final SubLObject var90, final SubLObject var69, SubLObject var180, SubLObject var181) {
        if (var180 == module0777.UNPROVIDED) {
            var180 = (SubLObject)module0777.$ic141$;
        }
        if (var181 == module0777.UNPROVIDED) {
            var181 = (SubLObject)module0777.NIL;
        }
        final SubLObject var182 = module0603.f36865(var90, var69, var180, var181);
        if (module0777.NIL != var182 && module0777.NIL != module0173.f10955(f50019())) {
            module0603.f36865((SubLObject)ConsesLow.list(module0777.$ic142$, (SubLObject)ConsesLow.list(module0777.$ic143$, var69, var90), f50019()), module0777.$ic144$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        }
        return var182;
    }
    
    public static SubLObject f50107(final SubLObject var90, final SubLObject var69, SubLObject var180, SubLObject var181) {
        if (var180 == module0777.UNPROVIDED) {
            var180 = (SubLObject)module0777.$ic141$;
        }
        if (var181 == module0777.UNPROVIDED) {
            var181 = (SubLObject)module0777.NIL;
        }
        final SubLObject var182 = module0603.f36867(var90, var69, var180, var181);
        if (module0777.NIL != var182 && module0777.NIL != module0173.f10955(f50019())) {
            module0603.f36865((SubLObject)ConsesLow.list(module0777.$ic142$, (SubLObject)ConsesLow.list(module0777.$ic143$, var69, var90), f50019()), module0777.$ic144$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        }
        return var182;
    }
    
    public static SubLObject f50108(final SubLObject var84, SubLObject var183) {
        if (var183 == module0777.UNPROVIDED) {
            var183 = (SubLObject)module0777.NIL;
        }
        final SubLThread var184 = SubLProcess.currentSubLThread();
        return module0782.f50294(f50109(var84), module0777.$g6254$.getDynamicValue(var184), (SubLObject)((module0777.NIL != var183) ? module0777.$g6255$.getDynamicValue(var184) : module0777.NIL), (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50109(SubLObject var84) {
        for (SubLThread var85 = SubLProcess.currentSubLThread(); module0777.NIL != module0038.f2653(var84) && module0777.NIL != conses_high.member(module0038.f2637(var84), module0777.$g6255$.getDynamicValue(var85), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED); var84 = module0038.f2677(var84, (SubLObject)module0777.UNPROVIDED)) {}
        return var84;
    }
    
    public static SubLObject f50110(final SubLObject var184, final SubLObject var71) {
        return Sequences.position(var184, f50108(var71, (SubLObject)module0777.UNPROVIDED), (SubLObject)module0777.EQUAL, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
    }
    
    public static SubLObject f50111(final SubLObject var44, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0584.$g4396$.getDynamicValue();
        }
        final SubLThread var124 = SubLProcess.currentSubLThread();
        SubLObject var125 = (SubLObject)module0777.NIL;
        if (var123.isString()) {
            var123 = module0603.f36871(var123);
        }
        final SubLObject var126 = module0579.$g4260$.currentBinding(var124);
        try {
            module0579.$g4260$.bind(var123, var124);
            var125 = module0038.f2627(module0770.f49049(var44, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED));
        }
        finally {
            module0579.$g4260$.rebind(var126, var124);
        }
        return var125;
    }
    
    public static SubLObject f50112(final SubLObject var186) {
        final SubLObject var187 = module0603.f36871(var186);
        if (!var187.eql(module0777.$ic145$) || module0777.NIL != module0038.f2668((SubLObject)module0777.$ic146$, var186, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) {
            return var187;
        }
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50113(final SubLObject var44) {
        final SubLObject var45 = module0225.f14739(var44);
        return (SubLObject)((module0777.NIL != var45) ? var45 : module0777.ZERO_INTEGER);
    }
    
    public static SubLObject f50114(final SubLObject var44) {
        SubLObject var45 = (SubLObject)module0777.NIL;
        SubLObject var46 = module0732.f45102(var44);
        SubLObject var47 = (SubLObject)module0777.NIL;
        var47 = var46.first();
        while (module0777.NIL != var46) {
            if (module0777.NIL != module0178.f11284(var47)) {
                final SubLObject var48 = module0178.f11335(var47);
                if (module0777.NIL == conses_high.member(var48, var45, Symbols.symbol_function((SubLObject)module0777.EQUALP), Symbols.symbol_function((SubLObject)module0777.IDENTITY))) {
                    var45 = (SubLObject)ConsesLow.cons(var48, var45);
                }
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return var45;
    }
    
    public static SubLObject f50115(final SubLObject var44) {
        final SubLObject var45 = module0220.f14556(var44, module0777.$ic147$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        return var45;
    }
    
    public static SubLObject f50116(final SubLObject var44) {
        SubLObject var45 = (SubLObject)module0777.NIL;
        SubLObject var46 = module0732.f45090(var44);
        SubLObject var47 = (SubLObject)module0777.NIL;
        var47 = var46.first();
        while (module0777.NIL != var46) {
            SubLObject var89_188 = f50117(var47, (SubLObject)module0777.UNPROVIDED);
            SubLObject var48 = (SubLObject)module0777.NIL;
            var48 = var89_188.first();
            while (module0777.NIL != var89_188) {
                final SubLObject var49 = var48;
                if (module0777.NIL == conses_high.member(var49, var45, Symbols.symbol_function((SubLObject)module0777.EQL), Symbols.symbol_function((SubLObject)module0777.IDENTITY))) {
                    var45 = (SubLObject)ConsesLow.cons(var49, var45);
                }
                var89_188 = var89_188.rest();
                var48 = var89_188.first();
            }
            var46 = var46.rest();
            var47 = var46.first();
        }
        return var45;
    }
    
    public static SubLObject f50117(final SubLObject var177, SubLObject var189) {
        if (var189 == module0777.UNPROVIDED) {
            var189 = (SubLObject)module0777.$ic148$;
        }
        final SubLThread var190 = SubLProcess.currentSubLThread();
        assert module0777.NIL != module0174.f11035(var177) : var177;
        SubLObject var191 = (SubLObject)module0777.NIL;
        if (module0777.NIL != module0178.f11284(var177)) {
            final SubLObject var192 = module0584.$g4396$.currentBinding(var190);
            try {
                module0584.$g4396$.bind(module0178.f11287(var177), var190);
                final SubLObject var193 = module0178.f11333(var177);
                final SubLObject var194 = module0732.f44998(var193);
                final SubLObject var195 = module0732.f44996(var177);
                if (module0777.NIL != var194) {
                    final SubLObject var196 = module0178.f11331(var177, var194);
                    final SubLObject var197 = module0732.f44924(var196, (SubLObject)module0777.UNPROVIDED);
                    SubLObject var198 = module0751.f47099(var189, var197, (SubLObject)module0777.UNPROVIDED);
                    SubLObject var199 = (SubLObject)module0777.NIL;
                    var199 = var198.first();
                    while (module0777.NIL != var198) {
                        final SubLObject var200 = module0749.f46455(module0764.f48424(var177, var195, (SubLObject)ConsesLow.list(var199), (SubLObject)module0777.NIL, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED));
                        if (module0777.NIL != var200) {
                            final SubLObject var201 = var200;
                            if (module0777.NIL == conses_high.member(var201, var191, Symbols.symbol_function((SubLObject)module0777.EQUALP), Symbols.symbol_function((SubLObject)module0777.IDENTITY))) {
                                var191 = (SubLObject)ConsesLow.cons(var201, var191);
                            }
                        }
                        var198 = var198.rest();
                        var199 = var198.first();
                    }
                }
                else {
                    final SubLObject var202 = module0749.f46455(module0764.f48424(var177, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED));
                    if (module0777.NIL != var202) {
                        final SubLObject var203 = var202;
                        if (module0777.NIL == conses_high.member(var203, var191, Symbols.symbol_function((SubLObject)module0777.EQUALP), Symbols.symbol_function((SubLObject)module0777.IDENTITY))) {
                            var191 = (SubLObject)ConsesLow.cons(var203, var191);
                        }
                    }
                }
            }
            finally {
                module0584.$g4396$.rebind(var192, var190);
            }
        }
        return Mapping.mapcar((SubLObject)module0777.$ic150$, var191);
    }
    
    public static SubLObject f50118(final SubLObject var44) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL != f50119(var44) || module0777.NIL != f50120(var44));
    }
    
    public static SubLObject f50119(final SubLObject var44) {
        return module0259.f16891(var44, module0777.$ic111$);
    }
    
    public static SubLObject f50120(final SubLObject var44) {
        return module0035.sublisp_boolean(module0538.f33428((SubLObject)ConsesLow.list(module0777.$ic151$, var44), module0777.$ic35$, (SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED));
    }
    
    public static SubLObject f50121(final SubLObject var71) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL != module0038.f2608(var71) || module0777.NIL == var71);
    }
    
    public static SubLObject f50122() {
        f50054();
        f50058();
        f50095();
        f50100();
        f50074();
        f50078();
        f50086();
        f50095();
        return (SubLObject)module0777.T;
    }
    
    public static SubLObject f50123(final SubLObject var41) {
        return (SubLObject)((module0777.NIL != module0173.f10969(var41)) ? module0656.f39941(var41) : module0777.$ic60$);
    }
    
    public static SubLObject f50124(final SubLObject var194) {
        return (SubLObject)((module0777.NIL != var194) ? module0038.f2624(var194) : module0777.$ic60$);
    }
    
    public static SubLObject f50125(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        SubLObject var46 = (SubLObject)module0777.NIL;
        final SubLObject var47 = module0147.$g2094$.currentBinding(var45);
        final SubLObject var48 = module0147.$g2095$.currentBinding(var45);
        try {
            module0147.$g2094$.bind((SubLObject)module0777.$ic34$, var45);
            module0147.$g2095$.bind(module0777.$ic35$, var45);
            if (module0777.NIL != module0269.f17706(var44) || module0777.NIL != module0269.f17708(var44)) {
                var46 = (SubLObject)module0777.T;
            }
        }
        finally {
            module0147.$g2095$.rebind(var48, var45);
            module0147.$g2094$.rebind(var47, var45);
        }
        return var46;
    }
    
    public static SubLObject f50126(final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        SubLObject var46 = (SubLObject)module0777.NIL;
        final SubLObject var47 = module0147.$g2094$.currentBinding(var45);
        final SubLObject var48 = module0147.$g2095$.currentBinding(var45);
        try {
            module0147.$g2094$.bind((SubLObject)module0777.$ic34$, var45);
            module0147.$g2095$.bind(module0777.$ic35$, var45);
            if (module0777.NIL != module0269.f17708(var44)) {
                var46 = (SubLObject)module0777.T;
            }
        }
        finally {
            module0147.$g2095$.rebind(var48, var45);
            module0147.$g2094$.rebind(var47, var45);
        }
        return var46;
    }
    
    public static SubLObject f50127(final SubLObject var44) {
        final SubLObject var45 = module0220.f14565(var44, module0777.$ic152$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        final SubLObject var46 = Strings.make_string((SubLObject)module0777.TWO_INTEGER, (SubLObject)Characters.CHAR_newline);
        SubLObject var47 = (SubLObject)module0777.NIL;
        SubLObject var48 = (SubLObject)module0777.NIL;
        try {
            var48 = streams_high.make_private_string_output_stream();
            SubLObject var49 = (SubLObject)module0777.NIL;
            SubLObject var50 = (SubLObject)module0777.NIL;
            SubLObject var51 = (SubLObject)module0777.NIL;
            var49 = var45;
            var50 = var49.first();
            for (var51 = (SubLObject)module0777.ZERO_INTEGER; module0777.NIL != var49; var49 = var49.rest(), var50 = var49.first(), var51 = Numbers.add((SubLObject)module0777.ONE_INTEGER, var51)) {
                if (var51.numG((SubLObject)module0777.ZERO_INTEGER)) {
                    streams_high.write_string(var46, var48, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                }
                streams_high.write_string(Sequences.substitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, var50, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED), var48, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
            }
            var47 = streams_high.get_output_stream_string(var48);
        }
        finally {
            final SubLObject var52 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0777.T);
                streams_high.close(var48, (SubLObject)module0777.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var52);
            }
        }
        return var47;
    }
    
    public static SubLObject f50128(final SubLObject var203, final SubLObject var138, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0584.$g4396$.getDynamicValue();
        }
        SubLObject var204 = module0004.f104(var203, module0731.f44745(var138, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        SubLObject var205 = (SubLObject)module0777.NIL;
        if (var203.eql(module0777.$ic81$)) {
            var205 = (SubLObject)module0777.$ic153$;
        }
        else if (var203.eql(module0777.$ic83$)) {
            var205 = (SubLObject)module0777.$ic154$;
        }
        else if (var203.eql(module0777.$ic77$)) {
            var205 = (SubLObject)module0777.$ic155$;
        }
        else if (var203.eql(module0777.$ic79$)) {
            var205 = (SubLObject)module0777.$ic156$;
        }
        else if (var203.eql(module0777.$ic99$)) {
            var205 = (SubLObject)module0777.$ic157$;
        }
        else if (var203.eql(module0777.$ic97$)) {
            var205 = (SubLObject)module0777.$ic158$;
        }
        if (module0777.NIL == var204) {
            SubLObject var206 = var205;
            SubLObject var207 = (SubLObject)module0777.NIL;
            var207 = var206.first();
            while (module0777.NIL == var204 && module0777.NIL != var206) {
                if (module0777.NIL != module0038.f2673(var138, var207, (SubLObject)module0777.UNPROVIDED)) {
                    var204 = (SubLObject)module0777.T;
                }
                var206 = var206.rest();
                var207 = var206.first();
            }
        }
        return var204;
    }
    
    public static SubLObject f50129(final SubLObject var138, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0584.$g4396$.getDynamicValue();
        }
        return f50128(module0777.$ic83$, var138, var123);
    }
    
    public static SubLObject f50130(final SubLObject var138, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0584.$g4396$.getDynamicValue();
        }
        return f50128(module0777.$ic81$, var138, var123);
    }
    
    public static SubLObject f50131(final SubLObject var138, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0584.$g4396$.getDynamicValue();
        }
        return f50128(module0777.$ic77$, var138, var123);
    }
    
    public static SubLObject f50132(final SubLObject var138, SubLObject var123) {
        if (var123 == module0777.UNPROVIDED) {
            var123 = module0584.$g4396$.getDynamicValue();
        }
        return f50128(module0777.$ic79$, var138, var123);
    }
    
    public static SubLObject f50133(final SubLObject var141, final SubLObject var203) {
        final SubLThread var204 = SubLProcess.currentSubLThread();
        SubLObject var205 = (SubLObject)module0777.ZERO_INTEGER;
        if (module0777.NIL != module0212.f13762(var141) && module0777.NIL != module0212.f13762(var203)) {
            final SubLObject var206 = module0147.$g2094$.currentBinding(var204);
            final SubLObject var207 = module0147.$g2095$.currentBinding(var204);
            try {
                module0147.$g2094$.bind((SubLObject)module0777.$ic34$, var204);
                module0147.$g2095$.bind(module0777.$ic35$, var204);
                var205 = Sequences.length(module0218.f14449((SubLObject)ConsesLow.list(var141, var203), (SubLObject)module0777.UNPROVIDED));
            }
            finally {
                module0147.$g2095$.rebind(var207, var204);
                module0147.$g2094$.rebind(var206, var204);
            }
        }
        return var205;
    }
    
    public static SubLObject f50134(final SubLObject var138, final SubLObject var203) {
        SubLObject var204 = (SubLObject)module0777.ZERO_INTEGER;
        SubLObject var205 = module0731.f44727(var138, var203, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
        SubLObject var206 = (SubLObject)module0777.NIL;
        var206 = var205.first();
        while (module0777.NIL != var205) {
            var204 = Numbers.add(var204, f50133(var206, var203));
            var205 = var205.rest();
            var206 = var205.first();
        }
        return var204;
    }
    
    public static SubLObject f50135(final SubLObject var141, SubLObject var207, SubLObject var120) {
        if (var207 == module0777.UNPROVIDED) {
            var207 = (SubLObject)module0777.$ic148$;
        }
        if (var120 == module0777.UNPROVIDED) {
            var120 = (SubLObject)module0777.$ic148$;
        }
        final SubLThread var208 = SubLProcess.currentSubLThread();
        SubLObject var209 = (SubLObject)module0777.ZERO_INTEGER;
        final SubLObject var210 = module0147.$g2094$.currentBinding(var208);
        final SubLObject var211 = module0147.$g2095$.currentBinding(var208);
        try {
            module0147.$g2094$.bind((SubLObject)module0777.$ic34$, var208);
            module0147.$g2095$.bind(module0777.$ic35$, var208);
            if (module0777.NIL != module0004.f104(var120, (SubLObject)module0777.$ic159$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) {
                final SubLObject var212 = module0777.$ic160$;
                final SubLObject var36_209 = module0137.$g1605$.currentBinding(var208);
                final SubLObject var37_210 = module0139.$g1636$.currentBinding(var208);
                try {
                    module0137.$g1605$.bind(module0137.f8955(module0777.$ic161$), var208);
                    module0139.$g1636$.bind(module0139.f9007(), var208);
                    SubLObject var211_212 = var212;
                    final SubLObject var213 = (SubLObject)module0777.$ic164$;
                    final SubLObject var214 = module0056.f4145(var213);
                    final SubLObject var36_210 = module0139.$g1635$.currentBinding(var208);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var208);
                        final SubLObject var215 = (SubLObject)module0777.NIL;
                        final SubLObject var36_211 = module0141.$g1714$.currentBinding(var208);
                        final SubLObject var37_211 = module0141.$g1715$.currentBinding(var208);
                        try {
                            module0141.$g1714$.bind((module0777.NIL != var215) ? var215 : module0141.f9283(), var208);
                            module0141.$g1715$.bind((SubLObject)((module0777.NIL != var215) ? module0777.$ic165$ : module0141.$g1715$.getDynamicValue(var208)), var208);
                            if (module0777.NIL != var215 && module0777.NIL != module0136.f8864() && module0777.NIL == module0141.f9279(var215)) {
                                final SubLObject var216 = module0136.$g1591$.getDynamicValue(var208);
                                if (var216.eql((SubLObject)module0777.$ic166$)) {
                                    module0136.f8870((SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                                else if (var216.eql((SubLObject)module0777.$ic169$)) {
                                    module0136.f8871((SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic170$, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                                else if (var216.eql((SubLObject)module0777.$ic171$)) {
                                    Errors.warn((SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0777.$ic172$, module0136.$g1591$.getDynamicValue(var208));
                                    Errors.cerror((SubLObject)module0777.$ic170$, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$);
                                }
                            }
                            final SubLObject var36_212 = module0141.$g1670$.currentBinding(var208);
                            final SubLObject var37_212 = module0141.$g1671$.currentBinding(var208);
                            final SubLObject var217 = module0141.$g1672$.currentBinding(var208);
                            final SubLObject var218 = module0141.$g1674$.currentBinding(var208);
                            final SubLObject var219 = module0137.$g1605$.currentBinding(var208);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0777.$ic161$)), var208);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                module0141.$g1674$.bind((SubLObject)module0777.NIL, var208);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0777.$ic161$)), var208);
                                if (module0777.NIL != module0136.f8865() || module0777.NIL != module0244.f15795(var212, module0137.f8955((SubLObject)module0777.UNPROVIDED))) {
                                    final SubLObject var36_213 = module0141.$g1677$.currentBinding(var208);
                                    final SubLObject var37_213 = module0138.$g1619$.currentBinding(var208);
                                    final SubLObject var38_223 = module0141.$g1674$.currentBinding(var208);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var208);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                        module0141.$g1674$.bind((SubLObject)module0777.NIL, var208);
                                        module0249.f16055(var211_212, (SubLObject)module0777.UNPROVIDED);
                                        while (module0777.NIL != var211_212) {
                                            final SubLObject var220 = var211_212;
                                            SubLObject var222;
                                            final SubLObject var221 = var222 = module0200.f12443(module0137.f8955(module0777.$ic161$));
                                            SubLObject var223 = (SubLObject)module0777.NIL;
                                            var223 = var222.first();
                                            while (module0777.NIL != var222) {
                                                final SubLObject var36_214 = module0137.$g1605$.currentBinding(var208);
                                                final SubLObject var37_214 = module0141.$g1674$.currentBinding(var208);
                                                try {
                                                    module0137.$g1605$.bind(var223, var208);
                                                    module0141.$g1674$.bind((SubLObject)((module0777.NIL != module0141.f9205((SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0777.NIL == module0141.$g1674$.getDynamicValue(var208)) : module0141.$g1674$.getDynamicValue(var208)), var208);
                                                    final SubLObject var224 = module0228.f15229(var220);
                                                    if (module0777.NIL != module0138.f8992(var224)) {
                                                        final SubLObject var225 = module0242.f15664(var224, module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                        if (module0777.NIL != var225) {
                                                            final SubLObject var226 = module0245.f15834(var225, module0244.f15780(module0137.f8955(module0777.$ic161$)), module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                            if (module0777.NIL != var226) {
                                                                SubLObject var227;
                                                                for (var227 = module0066.f4838(module0067.f4891(var226)); module0777.NIL == module0066.f4841(var227); var227 = module0066.f4840(var227)) {
                                                                    var208.resetMultipleValues();
                                                                    final SubLObject var228 = module0066.f4839(var227);
                                                                    final SubLObject var229 = var208.secondMultipleValue();
                                                                    var208.resetMultipleValues();
                                                                    if (module0777.NIL != module0147.f9507(var228)) {
                                                                        final SubLObject var36_215 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var228, var208);
                                                                            SubLObject var232_236;
                                                                            for (var232_236 = module0066.f4838(module0067.f4891(var229)); module0777.NIL == module0066.f4841(var232_236); var232_236 = module0066.f4840(var232_236)) {
                                                                                var208.resetMultipleValues();
                                                                                final SubLObject var230 = module0066.f4839(var232_236);
                                                                                final SubLObject var231 = var208.secondMultipleValue();
                                                                                var208.resetMultipleValues();
                                                                                if (module0777.NIL != module0141.f9289(var230)) {
                                                                                    final SubLObject var36_216 = module0138.$g1624$.currentBinding(var208);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var230, var208);
                                                                                        final SubLObject var232 = var231;
                                                                                        if (module0777.NIL != module0077.f5302(var232)) {
                                                                                            final SubLObject var233 = module0077.f5333(var232);
                                                                                            SubLObject var234;
                                                                                            SubLObject var235;
                                                                                            SubLObject var236;
                                                                                            for (var234 = module0032.f1741(var233), var235 = (SubLObject)module0777.NIL, var235 = module0032.f1742(var234, var233); module0777.NIL == module0032.f1744(var234, var235); var235 = module0032.f1743(var235)) {
                                                                                                var236 = module0032.f1745(var234, var235);
                                                                                                if (module0777.NIL != module0032.f1746(var235, var236) && module0777.NIL == module0249.f16059(var236, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                    module0249.f16055(var236, module0139.$g1636$.getDynamicValue(var208));
                                                                                                    if (module0777.NIL != module0173.f10955(var236)) {
                                                                                                        var209 = Numbers.add(var209, f50136(var141, var207, var236));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var232.isList()) {
                                                                                            SubLObject var237 = var232;
                                                                                            SubLObject var238 = (SubLObject)module0777.NIL;
                                                                                            var238 = var237.first();
                                                                                            while (module0777.NIL != var237) {
                                                                                                if (module0777.NIL == module0249.f16059(var238, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                    module0249.f16055(var238, module0139.$g1636$.getDynamicValue(var208));
                                                                                                    if (module0777.NIL != module0173.f10955(var238)) {
                                                                                                        var209 = Numbers.add(var209, f50136(var141, var207, var238));
                                                                                                    }
                                                                                                }
                                                                                                var237 = var237.rest();
                                                                                                var238 = var237.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0777.$ic173$, var232);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var36_216, var208);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var232_236);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_215, var208);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var227);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0777.FIVE_INTEGER, (SubLObject)module0777.$ic174$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                                        }
                                                        if (module0777.NIL != module0200.f12419(var224, module0137.f8955((SubLObject)module0777.UNPROVIDED))) {
                                                            SubLObject var239 = module0248.f15995(var224);
                                                            SubLObject var240 = (SubLObject)module0777.NIL;
                                                            var240 = var239.first();
                                                            while (module0777.NIL != var239) {
                                                                SubLObject var242;
                                                                final SubLObject var241 = var242 = var240;
                                                                SubLObject var243 = (SubLObject)module0777.NIL;
                                                                SubLObject var244 = (SubLObject)module0777.NIL;
                                                                SubLObject var245 = (SubLObject)module0777.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0777.$ic175$);
                                                                var243 = var242.first();
                                                                var242 = var242.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0777.$ic175$);
                                                                var244 = var242.first();
                                                                var242 = var242.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var242, var241, (SubLObject)module0777.$ic175$);
                                                                var245 = var242.first();
                                                                var242 = var242.rest();
                                                                if (module0777.NIL == var242) {
                                                                    if (module0777.NIL != module0147.f9507(var244)) {
                                                                        final SubLObject var36_217 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var244, var208);
                                                                            if (module0777.NIL != module0141.f9289(var245)) {
                                                                                final SubLObject var36_218 = module0138.$g1624$.currentBinding(var208);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var245, var208);
                                                                                    final SubLObject var232;
                                                                                    final SubLObject var246 = var232 = (SubLObject)ConsesLow.list(var243);
                                                                                    if (module0777.NIL != module0077.f5302(var232)) {
                                                                                        final SubLObject var233 = module0077.f5333(var232);
                                                                                        SubLObject var234;
                                                                                        SubLObject var235;
                                                                                        SubLObject var236;
                                                                                        for (var234 = module0032.f1741(var233), var235 = (SubLObject)module0777.NIL, var235 = module0032.f1742(var234, var233); module0777.NIL == module0032.f1744(var234, var235); var235 = module0032.f1743(var235)) {
                                                                                            var236 = module0032.f1745(var234, var235);
                                                                                            if (module0777.NIL != module0032.f1746(var235, var236) && module0777.NIL == module0249.f16059(var236, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                module0249.f16055(var236, module0139.$g1636$.getDynamicValue(var208));
                                                                                                if (module0777.NIL != module0173.f10955(var236)) {
                                                                                                    var209 = Numbers.add(var209, f50136(var141, var207, var236));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var232.isList()) {
                                                                                        SubLObject var40_252 = var232;
                                                                                        SubLObject var238 = (SubLObject)module0777.NIL;
                                                                                        var238 = var40_252.first();
                                                                                        while (module0777.NIL != var40_252) {
                                                                                            if (module0777.NIL == module0249.f16059(var238, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                module0249.f16055(var238, module0139.$g1636$.getDynamicValue(var208));
                                                                                                if (module0777.NIL != module0173.f10955(var238)) {
                                                                                                    var209 = Numbers.add(var209, f50136(var141, var207, var238));
                                                                                                }
                                                                                            }
                                                                                            var40_252 = var40_252.rest();
                                                                                            var238 = var40_252.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0777.$ic173$, var232);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var36_218, var208);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_217, var208);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var241, (SubLObject)module0777.$ic175$);
                                                                }
                                                                var239 = var239.rest();
                                                                var240 = var239.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0777.NIL != module0155.f9785(var224, (SubLObject)module0777.UNPROVIDED)) {
                                                        SubLObject var89_254;
                                                        final SubLObject var247 = var89_254 = ((module0777.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0777.$ic161$)), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0777.$ic161$)), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED)));
                                                        SubLObject var248 = (SubLObject)module0777.NIL;
                                                        var248 = var89_254.first();
                                                        while (module0777.NIL != var89_254) {
                                                            final SubLObject var36_219 = module0138.$g1625$.currentBinding(var208);
                                                            try {
                                                                module0138.$g1625$.bind(var248, var208);
                                                                final SubLObject var250;
                                                                final SubLObject var249 = var250 = Functions.funcall(var248, var224);
                                                                if (module0777.NIL != module0077.f5302(var250)) {
                                                                    final SubLObject var251 = module0077.f5333(var250);
                                                                    SubLObject var252;
                                                                    SubLObject var253;
                                                                    SubLObject var254;
                                                                    for (var252 = module0032.f1741(var251), var253 = (SubLObject)module0777.NIL, var253 = module0032.f1742(var252, var251); module0777.NIL == module0032.f1744(var252, var253); var253 = module0032.f1743(var253)) {
                                                                        var254 = module0032.f1745(var252, var253);
                                                                        if (module0777.NIL != module0032.f1746(var253, var254) && module0777.NIL == module0249.f16059(var254, module0139.$g1636$.getDynamicValue(var208))) {
                                                                            module0249.f16055(var254, module0139.$g1636$.getDynamicValue(var208));
                                                                            if (module0777.NIL != module0173.f10955(var254)) {
                                                                                var209 = Numbers.add(var209, f50136(var141, var207, var254));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var250.isList()) {
                                                                    SubLObject var255 = var250;
                                                                    SubLObject var256 = (SubLObject)module0777.NIL;
                                                                    var256 = var255.first();
                                                                    while (module0777.NIL != var255) {
                                                                        if (module0777.NIL == module0249.f16059(var256, module0139.$g1636$.getDynamicValue(var208))) {
                                                                            module0249.f16055(var256, module0139.$g1636$.getDynamicValue(var208));
                                                                            if (module0777.NIL != module0173.f10955(var256)) {
                                                                                var209 = Numbers.add(var209, f50136(var141, var207, var256));
                                                                            }
                                                                        }
                                                                        var255 = var255.rest();
                                                                        var256 = var255.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0777.$ic173$, var250);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var36_219, var208);
                                                            }
                                                            var89_254 = var89_254.rest();
                                                            var248 = var89_254.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var37_214, var208);
                                                    module0137.$g1605$.rebind(var36_214, var208);
                                                }
                                                var222 = var222.rest();
                                                var223 = var222.first();
                                            }
                                            SubLObject var258;
                                            final SubLObject var257 = var258 = module0200.f12443(module0244.f15771(module0137.f8955(module0777.$ic161$)));
                                            SubLObject var259 = (SubLObject)module0777.NIL;
                                            var259 = var258.first();
                                            while (module0777.NIL != var258) {
                                                final SubLObject var36_220 = module0137.$g1605$.currentBinding(var208);
                                                final SubLObject var37_215 = module0141.$g1674$.currentBinding(var208);
                                                try {
                                                    module0137.$g1605$.bind(var259, var208);
                                                    module0141.$g1674$.bind((SubLObject)((module0777.NIL != module0141.f9205((SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0777.NIL == module0141.$g1674$.getDynamicValue(var208)) : module0141.$g1674$.getDynamicValue(var208)), var208);
                                                    final SubLObject var260 = module0228.f15229(var211_212);
                                                    if (module0777.NIL != module0138.f8992(var260)) {
                                                        final SubLObject var261 = module0242.f15664(var260, module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                        if (module0777.NIL != var261) {
                                                            final SubLObject var262 = module0245.f15834(var261, module0138.f8979(), module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                            if (module0777.NIL != var262) {
                                                                SubLObject var263;
                                                                for (var263 = module0066.f4838(module0067.f4891(var262)); module0777.NIL == module0066.f4841(var263); var263 = module0066.f4840(var263)) {
                                                                    var208.resetMultipleValues();
                                                                    final SubLObject var264 = module0066.f4839(var263);
                                                                    final SubLObject var265 = var208.secondMultipleValue();
                                                                    var208.resetMultipleValues();
                                                                    if (module0777.NIL != module0147.f9507(var264)) {
                                                                        final SubLObject var36_221 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var264, var208);
                                                                            SubLObject var232_237;
                                                                            for (var232_237 = module0066.f4838(module0067.f4891(var265)); module0777.NIL == module0066.f4841(var232_237); var232_237 = module0066.f4840(var232_237)) {
                                                                                var208.resetMultipleValues();
                                                                                final SubLObject var266 = module0066.f4839(var232_237);
                                                                                final SubLObject var267 = var208.secondMultipleValue();
                                                                                var208.resetMultipleValues();
                                                                                if (module0777.NIL != module0141.f9289(var266)) {
                                                                                    final SubLObject var36_222 = module0138.$g1624$.currentBinding(var208);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var266, var208);
                                                                                        final SubLObject var268 = var267;
                                                                                        if (module0777.NIL != module0077.f5302(var268)) {
                                                                                            final SubLObject var269 = module0077.f5333(var268);
                                                                                            SubLObject var270;
                                                                                            SubLObject var271;
                                                                                            SubLObject var272;
                                                                                            for (var270 = module0032.f1741(var269), var271 = (SubLObject)module0777.NIL, var271 = module0032.f1742(var270, var269); module0777.NIL == module0032.f1744(var270, var271); var271 = module0032.f1743(var271)) {
                                                                                                var272 = module0032.f1745(var270, var271);
                                                                                                if (module0777.NIL != module0032.f1746(var271, var272) && module0777.NIL == module0249.f16059(var272, (SubLObject)module0777.UNPROVIDED)) {
                                                                                                    module0249.f16055(var272, (SubLObject)module0777.UNPROVIDED);
                                                                                                    module0056.f4149(var272, var214);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var268.isList()) {
                                                                                            SubLObject var273 = var268;
                                                                                            SubLObject var274 = (SubLObject)module0777.NIL;
                                                                                            var274 = var273.first();
                                                                                            while (module0777.NIL != var273) {
                                                                                                if (module0777.NIL == module0249.f16059(var274, (SubLObject)module0777.UNPROVIDED)) {
                                                                                                    module0249.f16055(var274, (SubLObject)module0777.UNPROVIDED);
                                                                                                    module0056.f4149(var274, var214);
                                                                                                }
                                                                                                var273 = var273.rest();
                                                                                                var274 = var273.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0777.$ic173$, var268);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var36_222, var208);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var232_237);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_221, var208);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var263);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0777.FIVE_INTEGER, (SubLObject)module0777.$ic174$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0777.NIL != module0155.f9785(var260, (SubLObject)module0777.UNPROVIDED)) {
                                                        SubLObject var89_255;
                                                        final SubLObject var275 = var89_255 = ((module0777.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED)));
                                                        SubLObject var276 = (SubLObject)module0777.NIL;
                                                        var276 = var89_255.first();
                                                        while (module0777.NIL != var89_255) {
                                                            final SubLObject var36_223 = module0138.$g1625$.currentBinding(var208);
                                                            try {
                                                                module0138.$g1625$.bind(var276, var208);
                                                                final SubLObject var278;
                                                                final SubLObject var277 = var278 = Functions.funcall(var276, var260);
                                                                if (module0777.NIL != module0077.f5302(var278)) {
                                                                    final SubLObject var279 = module0077.f5333(var278);
                                                                    SubLObject var280;
                                                                    SubLObject var281;
                                                                    SubLObject var282;
                                                                    for (var280 = module0032.f1741(var279), var281 = (SubLObject)module0777.NIL, var281 = module0032.f1742(var280, var279); module0777.NIL == module0032.f1744(var280, var281); var281 = module0032.f1743(var281)) {
                                                                        var282 = module0032.f1745(var280, var281);
                                                                        if (module0777.NIL != module0032.f1746(var281, var282) && module0777.NIL == module0249.f16059(var282, (SubLObject)module0777.UNPROVIDED)) {
                                                                            module0249.f16055(var282, (SubLObject)module0777.UNPROVIDED);
                                                                            module0056.f4149(var282, var214);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var278.isList()) {
                                                                    SubLObject var283 = var278;
                                                                    SubLObject var284 = (SubLObject)module0777.NIL;
                                                                    var284 = var283.first();
                                                                    while (module0777.NIL != var283) {
                                                                        if (module0777.NIL == module0249.f16059(var284, (SubLObject)module0777.UNPROVIDED)) {
                                                                            module0249.f16055(var284, (SubLObject)module0777.UNPROVIDED);
                                                                            module0056.f4149(var284, var214);
                                                                        }
                                                                        var283 = var283.rest();
                                                                        var284 = var283.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0777.$ic173$, var278);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var36_223, var208);
                                                            }
                                                            var89_255 = var89_255.rest();
                                                            var276 = var89_255.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var37_215, var208);
                                                    module0137.$g1605$.rebind(var36_220, var208);
                                                }
                                                var258 = var258.rest();
                                                var259 = var258.first();
                                            }
                                            var211_212 = module0056.f4150(var214);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var38_223, var208);
                                        module0138.$g1619$.rebind(var37_213, var208);
                                        module0141.$g1677$.rebind(var36_213, var208);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.$ic176$, var212, module0244.f15748(module0137.f8955((SubLObject)module0777.UNPROVIDED)), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var219, var208);
                                module0141.$g1674$.rebind(var218, var208);
                                module0141.$g1672$.rebind(var217, var208);
                                module0141.$g1671$.rebind(var37_212, var208);
                                module0141.$g1670$.rebind(var36_212, var208);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var37_211, var208);
                            module0141.$g1714$.rebind(var36_211, var208);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var208));
                    }
                    finally {
                        module0139.$g1635$.rebind(var36_210, var208);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var208));
                }
                finally {
                    module0139.$g1636$.rebind(var37_210, var208);
                    module0137.$g1605$.rebind(var36_209, var208);
                }
            }
            if (module0777.NIL != module0004.f104(var120, (SubLObject)module0777.$ic177$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) {
                final SubLObject var212 = module0777.$ic178$;
                final SubLObject var36_224 = module0137.$g1605$.currentBinding(var208);
                final SubLObject var37_216 = module0139.$g1636$.currentBinding(var208);
                try {
                    module0137.$g1605$.bind(module0137.f8955(module0777.$ic161$), var208);
                    module0139.$g1636$.bind(module0139.f9007(), var208);
                    SubLObject var211_213 = var212;
                    final SubLObject var213 = (SubLObject)module0777.$ic164$;
                    final SubLObject var214 = module0056.f4145(var213);
                    final SubLObject var36_225 = module0139.$g1635$.currentBinding(var208);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var208);
                        final SubLObject var215 = (SubLObject)module0777.NIL;
                        final SubLObject var36_226 = module0141.$g1714$.currentBinding(var208);
                        final SubLObject var37_217 = module0141.$g1715$.currentBinding(var208);
                        try {
                            module0141.$g1714$.bind((module0777.NIL != var215) ? var215 : module0141.f9283(), var208);
                            module0141.$g1715$.bind((SubLObject)((module0777.NIL != var215) ? module0777.$ic165$ : module0141.$g1715$.getDynamicValue(var208)), var208);
                            if (module0777.NIL != var215 && module0777.NIL != module0136.f8864() && module0777.NIL == module0141.f9279(var215)) {
                                final SubLObject var216 = module0136.$g1591$.getDynamicValue(var208);
                                if (var216.eql((SubLObject)module0777.$ic166$)) {
                                    module0136.f8870((SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                                else if (var216.eql((SubLObject)module0777.$ic169$)) {
                                    module0136.f8871((SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic170$, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                                else if (var216.eql((SubLObject)module0777.$ic171$)) {
                                    Errors.warn((SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0777.$ic172$, module0136.$g1591$.getDynamicValue(var208));
                                    Errors.cerror((SubLObject)module0777.$ic170$, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$);
                                }
                            }
                            final SubLObject var36_227 = module0141.$g1670$.currentBinding(var208);
                            final SubLObject var37_218 = module0141.$g1671$.currentBinding(var208);
                            final SubLObject var217 = module0141.$g1672$.currentBinding(var208);
                            final SubLObject var218 = module0141.$g1674$.currentBinding(var208);
                            final SubLObject var219 = module0137.$g1605$.currentBinding(var208);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0777.$ic161$)), var208);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                module0141.$g1674$.bind((SubLObject)module0777.NIL, var208);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0777.$ic161$)), var208);
                                if (module0777.NIL != module0136.f8865() || module0777.NIL != module0244.f15795(var212, module0137.f8955((SubLObject)module0777.UNPROVIDED))) {
                                    final SubLObject var36_228 = module0141.$g1677$.currentBinding(var208);
                                    final SubLObject var37_219 = module0138.$g1619$.currentBinding(var208);
                                    final SubLObject var38_224 = module0141.$g1674$.currentBinding(var208);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var208);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                        module0141.$g1674$.bind((SubLObject)module0777.NIL, var208);
                                        module0249.f16055(var211_213, (SubLObject)module0777.UNPROVIDED);
                                        while (module0777.NIL != var211_213) {
                                            final SubLObject var220 = var211_213;
                                            SubLObject var222;
                                            final SubLObject var221 = var222 = module0200.f12443(module0137.f8955(module0777.$ic161$));
                                            SubLObject var223 = (SubLObject)module0777.NIL;
                                            var223 = var222.first();
                                            while (module0777.NIL != var222) {
                                                final SubLObject var36_229 = module0137.$g1605$.currentBinding(var208);
                                                final SubLObject var37_220 = module0141.$g1674$.currentBinding(var208);
                                                try {
                                                    module0137.$g1605$.bind(var223, var208);
                                                    module0141.$g1674$.bind((SubLObject)((module0777.NIL != module0141.f9205((SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0777.NIL == module0141.$g1674$.getDynamicValue(var208)) : module0141.$g1674$.getDynamicValue(var208)), var208);
                                                    final SubLObject var224 = module0228.f15229(var220);
                                                    if (module0777.NIL != module0138.f8992(var224)) {
                                                        final SubLObject var225 = module0242.f15664(var224, module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                        if (module0777.NIL != var225) {
                                                            final SubLObject var226 = module0245.f15834(var225, module0244.f15780(module0137.f8955(module0777.$ic161$)), module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                            if (module0777.NIL != var226) {
                                                                SubLObject var227;
                                                                for (var227 = module0066.f4838(module0067.f4891(var226)); module0777.NIL == module0066.f4841(var227); var227 = module0066.f4840(var227)) {
                                                                    var208.resetMultipleValues();
                                                                    final SubLObject var228 = module0066.f4839(var227);
                                                                    final SubLObject var229 = var208.secondMultipleValue();
                                                                    var208.resetMultipleValues();
                                                                    if (module0777.NIL != module0147.f9507(var228)) {
                                                                        final SubLObject var36_230 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var228, var208);
                                                                            SubLObject var232_238;
                                                                            for (var232_238 = module0066.f4838(module0067.f4891(var229)); module0777.NIL == module0066.f4841(var232_238); var232_238 = module0066.f4840(var232_238)) {
                                                                                var208.resetMultipleValues();
                                                                                final SubLObject var230 = module0066.f4839(var232_238);
                                                                                final SubLObject var231 = var208.secondMultipleValue();
                                                                                var208.resetMultipleValues();
                                                                                if (module0777.NIL != module0141.f9289(var230)) {
                                                                                    final SubLObject var36_231 = module0138.$g1624$.currentBinding(var208);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var230, var208);
                                                                                        final SubLObject var232 = var231;
                                                                                        if (module0777.NIL != module0077.f5302(var232)) {
                                                                                            final SubLObject var233 = module0077.f5333(var232);
                                                                                            SubLObject var234;
                                                                                            SubLObject var235;
                                                                                            SubLObject var236;
                                                                                            for (var234 = module0032.f1741(var233), var235 = (SubLObject)module0777.NIL, var235 = module0032.f1742(var234, var233); module0777.NIL == module0032.f1744(var234, var235); var235 = module0032.f1743(var235)) {
                                                                                                var236 = module0032.f1745(var234, var235);
                                                                                                if (module0777.NIL != module0032.f1746(var235, var236) && module0777.NIL == module0249.f16059(var236, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                    module0249.f16055(var236, module0139.$g1636$.getDynamicValue(var208));
                                                                                                    if (module0777.NIL != module0173.f10955(var236)) {
                                                                                                        var209 = Numbers.add(var209, f50136(var141, var207, var236));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var232.isList()) {
                                                                                            SubLObject var237 = var232;
                                                                                            SubLObject var238 = (SubLObject)module0777.NIL;
                                                                                            var238 = var237.first();
                                                                                            while (module0777.NIL != var237) {
                                                                                                if (module0777.NIL == module0249.f16059(var238, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                    module0249.f16055(var238, module0139.$g1636$.getDynamicValue(var208));
                                                                                                    if (module0777.NIL != module0173.f10955(var238)) {
                                                                                                        var209 = Numbers.add(var209, f50136(var141, var207, var238));
                                                                                                    }
                                                                                                }
                                                                                                var237 = var237.rest();
                                                                                                var238 = var237.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0777.$ic173$, var232);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var36_231, var208);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var232_238);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_230, var208);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var227);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0777.FIVE_INTEGER, (SubLObject)module0777.$ic174$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                                        }
                                                        if (module0777.NIL != module0200.f12419(var224, module0137.f8955((SubLObject)module0777.UNPROVIDED))) {
                                                            SubLObject var239 = module0248.f15995(var224);
                                                            SubLObject var240 = (SubLObject)module0777.NIL;
                                                            var240 = var239.first();
                                                            while (module0777.NIL != var239) {
                                                                SubLObject var286;
                                                                final SubLObject var285 = var286 = var240;
                                                                SubLObject var243 = (SubLObject)module0777.NIL;
                                                                SubLObject var244 = (SubLObject)module0777.NIL;
                                                                SubLObject var245 = (SubLObject)module0777.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var286, var285, (SubLObject)module0777.$ic175$);
                                                                var243 = var286.first();
                                                                var286 = var286.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var286, var285, (SubLObject)module0777.$ic175$);
                                                                var244 = var286.first();
                                                                var286 = var286.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var286, var285, (SubLObject)module0777.$ic175$);
                                                                var245 = var286.first();
                                                                var286 = var286.rest();
                                                                if (module0777.NIL == var286) {
                                                                    if (module0777.NIL != module0147.f9507(var244)) {
                                                                        final SubLObject var36_232 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var244, var208);
                                                                            if (module0777.NIL != module0141.f9289(var245)) {
                                                                                final SubLObject var36_233 = module0138.$g1624$.currentBinding(var208);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var245, var208);
                                                                                    final SubLObject var232;
                                                                                    final SubLObject var246 = var232 = (SubLObject)ConsesLow.list(var243);
                                                                                    if (module0777.NIL != module0077.f5302(var232)) {
                                                                                        final SubLObject var233 = module0077.f5333(var232);
                                                                                        SubLObject var234;
                                                                                        SubLObject var235;
                                                                                        SubLObject var236;
                                                                                        for (var234 = module0032.f1741(var233), var235 = (SubLObject)module0777.NIL, var235 = module0032.f1742(var234, var233); module0777.NIL == module0032.f1744(var234, var235); var235 = module0032.f1743(var235)) {
                                                                                            var236 = module0032.f1745(var234, var235);
                                                                                            if (module0777.NIL != module0032.f1746(var235, var236) && module0777.NIL == module0249.f16059(var236, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                module0249.f16055(var236, module0139.$g1636$.getDynamicValue(var208));
                                                                                                if (module0777.NIL != module0173.f10955(var236)) {
                                                                                                    var209 = Numbers.add(var209, f50136(var141, var207, var236));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var232.isList()) {
                                                                                        SubLObject var40_253 = var232;
                                                                                        SubLObject var238 = (SubLObject)module0777.NIL;
                                                                                        var238 = var40_253.first();
                                                                                        while (module0777.NIL != var40_253) {
                                                                                            if (module0777.NIL == module0249.f16059(var238, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                module0249.f16055(var238, module0139.$g1636$.getDynamicValue(var208));
                                                                                                if (module0777.NIL != module0173.f10955(var238)) {
                                                                                                    var209 = Numbers.add(var209, f50136(var141, var207, var238));
                                                                                                }
                                                                                            }
                                                                                            var40_253 = var40_253.rest();
                                                                                            var238 = var40_253.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0777.$ic173$, var232);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var36_233, var208);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_232, var208);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var285, (SubLObject)module0777.$ic175$);
                                                                }
                                                                var239 = var239.rest();
                                                                var240 = var239.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0777.NIL != module0155.f9785(var224, (SubLObject)module0777.UNPROVIDED)) {
                                                        SubLObject var89_256;
                                                        final SubLObject var247 = var89_256 = ((module0777.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0777.$ic161$)), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0777.$ic161$)), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED)));
                                                        SubLObject var248 = (SubLObject)module0777.NIL;
                                                        var248 = var89_256.first();
                                                        while (module0777.NIL != var89_256) {
                                                            final SubLObject var36_234 = module0138.$g1625$.currentBinding(var208);
                                                            try {
                                                                module0138.$g1625$.bind(var248, var208);
                                                                final SubLObject var250;
                                                                final SubLObject var249 = var250 = Functions.funcall(var248, var224);
                                                                if (module0777.NIL != module0077.f5302(var250)) {
                                                                    final SubLObject var251 = module0077.f5333(var250);
                                                                    SubLObject var252;
                                                                    SubLObject var253;
                                                                    SubLObject var254;
                                                                    for (var252 = module0032.f1741(var251), var253 = (SubLObject)module0777.NIL, var253 = module0032.f1742(var252, var251); module0777.NIL == module0032.f1744(var252, var253); var253 = module0032.f1743(var253)) {
                                                                        var254 = module0032.f1745(var252, var253);
                                                                        if (module0777.NIL != module0032.f1746(var253, var254) && module0777.NIL == module0249.f16059(var254, module0139.$g1636$.getDynamicValue(var208))) {
                                                                            module0249.f16055(var254, module0139.$g1636$.getDynamicValue(var208));
                                                                            if (module0777.NIL != module0173.f10955(var254)) {
                                                                                var209 = Numbers.add(var209, f50136(var141, var207, var254));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var250.isList()) {
                                                                    SubLObject var255 = var250;
                                                                    SubLObject var256 = (SubLObject)module0777.NIL;
                                                                    var256 = var255.first();
                                                                    while (module0777.NIL != var255) {
                                                                        if (module0777.NIL == module0249.f16059(var256, module0139.$g1636$.getDynamicValue(var208))) {
                                                                            module0249.f16055(var256, module0139.$g1636$.getDynamicValue(var208));
                                                                            if (module0777.NIL != module0173.f10955(var256)) {
                                                                                var209 = Numbers.add(var209, f50136(var141, var207, var256));
                                                                            }
                                                                        }
                                                                        var255 = var255.rest();
                                                                        var256 = var255.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0777.$ic173$, var250);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var36_234, var208);
                                                            }
                                                            var89_256 = var89_256.rest();
                                                            var248 = var89_256.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var37_220, var208);
                                                    module0137.$g1605$.rebind(var36_229, var208);
                                                }
                                                var222 = var222.rest();
                                                var223 = var222.first();
                                            }
                                            SubLObject var258;
                                            final SubLObject var257 = var258 = module0200.f12443(module0244.f15771(module0137.f8955(module0777.$ic161$)));
                                            SubLObject var259 = (SubLObject)module0777.NIL;
                                            var259 = var258.first();
                                            while (module0777.NIL != var258) {
                                                final SubLObject var36_235 = module0137.$g1605$.currentBinding(var208);
                                                final SubLObject var37_221 = module0141.$g1674$.currentBinding(var208);
                                                try {
                                                    module0137.$g1605$.bind(var259, var208);
                                                    module0141.$g1674$.bind((SubLObject)((module0777.NIL != module0141.f9205((SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0777.NIL == module0141.$g1674$.getDynamicValue(var208)) : module0141.$g1674$.getDynamicValue(var208)), var208);
                                                    final SubLObject var260 = module0228.f15229(var211_213);
                                                    if (module0777.NIL != module0138.f8992(var260)) {
                                                        final SubLObject var261 = module0242.f15664(var260, module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                        if (module0777.NIL != var261) {
                                                            final SubLObject var262 = module0245.f15834(var261, module0138.f8979(), module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                            if (module0777.NIL != var262) {
                                                                SubLObject var263;
                                                                for (var263 = module0066.f4838(module0067.f4891(var262)); module0777.NIL == module0066.f4841(var263); var263 = module0066.f4840(var263)) {
                                                                    var208.resetMultipleValues();
                                                                    final SubLObject var264 = module0066.f4839(var263);
                                                                    final SubLObject var265 = var208.secondMultipleValue();
                                                                    var208.resetMultipleValues();
                                                                    if (module0777.NIL != module0147.f9507(var264)) {
                                                                        final SubLObject var36_236 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var264, var208);
                                                                            SubLObject var232_239;
                                                                            for (var232_239 = module0066.f4838(module0067.f4891(var265)); module0777.NIL == module0066.f4841(var232_239); var232_239 = module0066.f4840(var232_239)) {
                                                                                var208.resetMultipleValues();
                                                                                final SubLObject var266 = module0066.f4839(var232_239);
                                                                                final SubLObject var267 = var208.secondMultipleValue();
                                                                                var208.resetMultipleValues();
                                                                                if (module0777.NIL != module0141.f9289(var266)) {
                                                                                    final SubLObject var36_237 = module0138.$g1624$.currentBinding(var208);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var266, var208);
                                                                                        final SubLObject var268 = var267;
                                                                                        if (module0777.NIL != module0077.f5302(var268)) {
                                                                                            final SubLObject var269 = module0077.f5333(var268);
                                                                                            SubLObject var270;
                                                                                            SubLObject var271;
                                                                                            SubLObject var272;
                                                                                            for (var270 = module0032.f1741(var269), var271 = (SubLObject)module0777.NIL, var271 = module0032.f1742(var270, var269); module0777.NIL == module0032.f1744(var270, var271); var271 = module0032.f1743(var271)) {
                                                                                                var272 = module0032.f1745(var270, var271);
                                                                                                if (module0777.NIL != module0032.f1746(var271, var272) && module0777.NIL == module0249.f16059(var272, (SubLObject)module0777.UNPROVIDED)) {
                                                                                                    module0249.f16055(var272, (SubLObject)module0777.UNPROVIDED);
                                                                                                    module0056.f4149(var272, var214);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var268.isList()) {
                                                                                            SubLObject var273 = var268;
                                                                                            SubLObject var274 = (SubLObject)module0777.NIL;
                                                                                            var274 = var273.first();
                                                                                            while (module0777.NIL != var273) {
                                                                                                if (module0777.NIL == module0249.f16059(var274, (SubLObject)module0777.UNPROVIDED)) {
                                                                                                    module0249.f16055(var274, (SubLObject)module0777.UNPROVIDED);
                                                                                                    module0056.f4149(var274, var214);
                                                                                                }
                                                                                                var273 = var273.rest();
                                                                                                var274 = var273.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0777.$ic173$, var268);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var36_237, var208);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var232_239);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_236, var208);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var263);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0777.FIVE_INTEGER, (SubLObject)module0777.$ic174$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0777.NIL != module0155.f9785(var260, (SubLObject)module0777.UNPROVIDED)) {
                                                        SubLObject var89_257;
                                                        final SubLObject var275 = var89_257 = ((module0777.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED)));
                                                        SubLObject var276 = (SubLObject)module0777.NIL;
                                                        var276 = var89_257.first();
                                                        while (module0777.NIL != var89_257) {
                                                            final SubLObject var36_238 = module0138.$g1625$.currentBinding(var208);
                                                            try {
                                                                module0138.$g1625$.bind(var276, var208);
                                                                final SubLObject var278;
                                                                final SubLObject var277 = var278 = Functions.funcall(var276, var260);
                                                                if (module0777.NIL != module0077.f5302(var278)) {
                                                                    final SubLObject var279 = module0077.f5333(var278);
                                                                    SubLObject var280;
                                                                    SubLObject var281;
                                                                    SubLObject var282;
                                                                    for (var280 = module0032.f1741(var279), var281 = (SubLObject)module0777.NIL, var281 = module0032.f1742(var280, var279); module0777.NIL == module0032.f1744(var280, var281); var281 = module0032.f1743(var281)) {
                                                                        var282 = module0032.f1745(var280, var281);
                                                                        if (module0777.NIL != module0032.f1746(var281, var282) && module0777.NIL == module0249.f16059(var282, (SubLObject)module0777.UNPROVIDED)) {
                                                                            module0249.f16055(var282, (SubLObject)module0777.UNPROVIDED);
                                                                            module0056.f4149(var282, var214);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var278.isList()) {
                                                                    SubLObject var283 = var278;
                                                                    SubLObject var284 = (SubLObject)module0777.NIL;
                                                                    var284 = var283.first();
                                                                    while (module0777.NIL != var283) {
                                                                        if (module0777.NIL == module0249.f16059(var284, (SubLObject)module0777.UNPROVIDED)) {
                                                                            module0249.f16055(var284, (SubLObject)module0777.UNPROVIDED);
                                                                            module0056.f4149(var284, var214);
                                                                        }
                                                                        var283 = var283.rest();
                                                                        var284 = var283.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0777.$ic173$, var278);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var36_238, var208);
                                                            }
                                                            var89_257 = var89_257.rest();
                                                            var276 = var89_257.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var37_221, var208);
                                                    module0137.$g1605$.rebind(var36_235, var208);
                                                }
                                                var258 = var258.rest();
                                                var259 = var258.first();
                                            }
                                            var211_213 = module0056.f4150(var214);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var38_224, var208);
                                        module0138.$g1619$.rebind(var37_219, var208);
                                        module0141.$g1677$.rebind(var36_228, var208);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.$ic176$, var212, module0244.f15748(module0137.f8955((SubLObject)module0777.UNPROVIDED)), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var219, var208);
                                module0141.$g1674$.rebind(var218, var208);
                                module0141.$g1672$.rebind(var217, var208);
                                module0141.$g1671$.rebind(var37_218, var208);
                                module0141.$g1670$.rebind(var36_227, var208);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var37_217, var208);
                            module0141.$g1714$.rebind(var36_226, var208);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var208));
                    }
                    finally {
                        module0139.$g1635$.rebind(var36_225, var208);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var208));
                }
                finally {
                    module0139.$g1636$.rebind(var37_216, var208);
                    module0137.$g1605$.rebind(var36_224, var208);
                }
            }
            if (module0777.NIL != module0004.f104(var120, (SubLObject)module0777.$ic179$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) {
                final SubLObject var212 = module0777.$ic180$;
                final SubLObject var36_239 = module0137.$g1605$.currentBinding(var208);
                final SubLObject var37_222 = module0139.$g1636$.currentBinding(var208);
                try {
                    module0137.$g1605$.bind(module0137.f8955(module0777.$ic161$), var208);
                    module0139.$g1636$.bind(module0139.f9007(), var208);
                    SubLObject var211_214 = var212;
                    final SubLObject var213 = (SubLObject)module0777.$ic164$;
                    final SubLObject var214 = module0056.f4145(var213);
                    final SubLObject var36_240 = module0139.$g1635$.currentBinding(var208);
                    try {
                        module0139.$g1635$.bind(module0139.f9007(), var208);
                        final SubLObject var215 = (SubLObject)module0777.NIL;
                        final SubLObject var36_241 = module0141.$g1714$.currentBinding(var208);
                        final SubLObject var37_223 = module0141.$g1715$.currentBinding(var208);
                        try {
                            module0141.$g1714$.bind((module0777.NIL != var215) ? var215 : module0141.f9283(), var208);
                            module0141.$g1715$.bind((SubLObject)((module0777.NIL != var215) ? module0777.$ic165$ : module0141.$g1715$.getDynamicValue(var208)), var208);
                            if (module0777.NIL != var215 && module0777.NIL != module0136.f8864() && module0777.NIL == module0141.f9279(var215)) {
                                final SubLObject var216 = module0136.$g1591$.getDynamicValue(var208);
                                if (var216.eql((SubLObject)module0777.$ic166$)) {
                                    module0136.f8870((SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                                else if (var216.eql((SubLObject)module0777.$ic169$)) {
                                    module0136.f8871((SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.$ic170$, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                                else if (var216.eql((SubLObject)module0777.$ic171$)) {
                                    Errors.warn((SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$);
                                }
                                else {
                                    Errors.warn((SubLObject)module0777.$ic172$, module0136.$g1591$.getDynamicValue(var208));
                                    Errors.cerror((SubLObject)module0777.$ic170$, (SubLObject)module0777.$ic167$, var215, (SubLObject)module0777.$ic168$);
                                }
                            }
                            final SubLObject var36_242 = module0141.$g1670$.currentBinding(var208);
                            final SubLObject var37_224 = module0141.$g1671$.currentBinding(var208);
                            final SubLObject var217 = module0141.$g1672$.currentBinding(var208);
                            final SubLObject var218 = module0141.$g1674$.currentBinding(var208);
                            final SubLObject var219 = module0137.$g1605$.currentBinding(var208);
                            try {
                                module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0777.$ic161$)), var208);
                                module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                module0141.$g1674$.bind((SubLObject)module0777.NIL, var208);
                                module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0777.$ic161$)), var208);
                                if (module0777.NIL != module0136.f8865() || module0777.NIL != module0244.f15795(var212, module0137.f8955((SubLObject)module0777.UNPROVIDED))) {
                                    final SubLObject var36_243 = module0141.$g1677$.currentBinding(var208);
                                    final SubLObject var37_225 = module0138.$g1619$.currentBinding(var208);
                                    final SubLObject var38_225 = module0141.$g1674$.currentBinding(var208);
                                    try {
                                        module0141.$g1677$.bind(module0141.f9210(), var208);
                                        module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0777.$ic161$))), var208);
                                        module0141.$g1674$.bind((SubLObject)module0777.NIL, var208);
                                        module0249.f16055(var211_214, (SubLObject)module0777.UNPROVIDED);
                                        while (module0777.NIL != var211_214) {
                                            final SubLObject var220 = var211_214;
                                            SubLObject var222;
                                            final SubLObject var221 = var222 = module0200.f12443(module0137.f8955(module0777.$ic161$));
                                            SubLObject var223 = (SubLObject)module0777.NIL;
                                            var223 = var222.first();
                                            while (module0777.NIL != var222) {
                                                final SubLObject var36_244 = module0137.$g1605$.currentBinding(var208);
                                                final SubLObject var37_226 = module0141.$g1674$.currentBinding(var208);
                                                try {
                                                    module0137.$g1605$.bind(var223, var208);
                                                    module0141.$g1674$.bind((SubLObject)((module0777.NIL != module0141.f9205((SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0777.NIL == module0141.$g1674$.getDynamicValue(var208)) : module0141.$g1674$.getDynamicValue(var208)), var208);
                                                    final SubLObject var224 = module0228.f15229(var220);
                                                    if (module0777.NIL != module0138.f8992(var224)) {
                                                        final SubLObject var225 = module0242.f15664(var224, module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                        if (module0777.NIL != var225) {
                                                            final SubLObject var226 = module0245.f15834(var225, module0244.f15780(module0137.f8955(module0777.$ic161$)), module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                            if (module0777.NIL != var226) {
                                                                SubLObject var227;
                                                                for (var227 = module0066.f4838(module0067.f4891(var226)); module0777.NIL == module0066.f4841(var227); var227 = module0066.f4840(var227)) {
                                                                    var208.resetMultipleValues();
                                                                    final SubLObject var228 = module0066.f4839(var227);
                                                                    final SubLObject var229 = var208.secondMultipleValue();
                                                                    var208.resetMultipleValues();
                                                                    if (module0777.NIL != module0147.f9507(var228)) {
                                                                        final SubLObject var36_245 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var228, var208);
                                                                            SubLObject var232_240;
                                                                            for (var232_240 = module0066.f4838(module0067.f4891(var229)); module0777.NIL == module0066.f4841(var232_240); var232_240 = module0066.f4840(var232_240)) {
                                                                                var208.resetMultipleValues();
                                                                                final SubLObject var230 = module0066.f4839(var232_240);
                                                                                final SubLObject var231 = var208.secondMultipleValue();
                                                                                var208.resetMultipleValues();
                                                                                if (module0777.NIL != module0141.f9289(var230)) {
                                                                                    final SubLObject var36_246 = module0138.$g1624$.currentBinding(var208);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var230, var208);
                                                                                        final SubLObject var232 = var231;
                                                                                        if (module0777.NIL != module0077.f5302(var232)) {
                                                                                            final SubLObject var233 = module0077.f5333(var232);
                                                                                            SubLObject var234;
                                                                                            SubLObject var235;
                                                                                            SubLObject var236;
                                                                                            for (var234 = module0032.f1741(var233), var235 = (SubLObject)module0777.NIL, var235 = module0032.f1742(var234, var233); module0777.NIL == module0032.f1744(var234, var235); var235 = module0032.f1743(var235)) {
                                                                                                var236 = module0032.f1745(var234, var235);
                                                                                                if (module0777.NIL != module0032.f1746(var235, var236) && module0777.NIL == module0249.f16059(var236, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                    module0249.f16055(var236, module0139.$g1636$.getDynamicValue(var208));
                                                                                                    if (module0777.NIL != module0173.f10955(var236)) {
                                                                                                        var209 = Numbers.add(var209, f50136(var141, var207, var236));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var232.isList()) {
                                                                                            SubLObject var237 = var232;
                                                                                            SubLObject var238 = (SubLObject)module0777.NIL;
                                                                                            var238 = var237.first();
                                                                                            while (module0777.NIL != var237) {
                                                                                                if (module0777.NIL == module0249.f16059(var238, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                    module0249.f16055(var238, module0139.$g1636$.getDynamicValue(var208));
                                                                                                    if (module0777.NIL != module0173.f10955(var238)) {
                                                                                                        var209 = Numbers.add(var209, f50136(var141, var207, var238));
                                                                                                    }
                                                                                                }
                                                                                                var237 = var237.rest();
                                                                                                var238 = var237.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0777.$ic173$, var232);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var36_246, var208);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var232_240);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_245, var208);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var227);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0777.FIVE_INTEGER, (SubLObject)module0777.$ic174$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                                        }
                                                        if (module0777.NIL != module0200.f12419(var224, module0137.f8955((SubLObject)module0777.UNPROVIDED))) {
                                                            SubLObject var239 = module0248.f15995(var224);
                                                            SubLObject var240 = (SubLObject)module0777.NIL;
                                                            var240 = var239.first();
                                                            while (module0777.NIL != var239) {
                                                                SubLObject var288;
                                                                final SubLObject var287 = var288 = var240;
                                                                SubLObject var243 = (SubLObject)module0777.NIL;
                                                                SubLObject var244 = (SubLObject)module0777.NIL;
                                                                SubLObject var245 = (SubLObject)module0777.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(var288, var287, (SubLObject)module0777.$ic175$);
                                                                var243 = var288.first();
                                                                var288 = var288.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var288, var287, (SubLObject)module0777.$ic175$);
                                                                var244 = var288.first();
                                                                var288 = var288.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(var288, var287, (SubLObject)module0777.$ic175$);
                                                                var245 = var288.first();
                                                                var288 = var288.rest();
                                                                if (module0777.NIL == var288) {
                                                                    if (module0777.NIL != module0147.f9507(var244)) {
                                                                        final SubLObject var36_247 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var244, var208);
                                                                            if (module0777.NIL != module0141.f9289(var245)) {
                                                                                final SubLObject var36_248 = module0138.$g1624$.currentBinding(var208);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var245, var208);
                                                                                    final SubLObject var232;
                                                                                    final SubLObject var246 = var232 = (SubLObject)ConsesLow.list(var243);
                                                                                    if (module0777.NIL != module0077.f5302(var232)) {
                                                                                        final SubLObject var233 = module0077.f5333(var232);
                                                                                        SubLObject var234;
                                                                                        SubLObject var235;
                                                                                        SubLObject var236;
                                                                                        for (var234 = module0032.f1741(var233), var235 = (SubLObject)module0777.NIL, var235 = module0032.f1742(var234, var233); module0777.NIL == module0032.f1744(var234, var235); var235 = module0032.f1743(var235)) {
                                                                                            var236 = module0032.f1745(var234, var235);
                                                                                            if (module0777.NIL != module0032.f1746(var235, var236) && module0777.NIL == module0249.f16059(var236, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                module0249.f16055(var236, module0139.$g1636$.getDynamicValue(var208));
                                                                                                if (module0777.NIL != module0173.f10955(var236)) {
                                                                                                    var209 = Numbers.add(var209, f50136(var141, var207, var236));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var232.isList()) {
                                                                                        SubLObject var40_254 = var232;
                                                                                        SubLObject var238 = (SubLObject)module0777.NIL;
                                                                                        var238 = var40_254.first();
                                                                                        while (module0777.NIL != var40_254) {
                                                                                            if (module0777.NIL == module0249.f16059(var238, module0139.$g1636$.getDynamicValue(var208))) {
                                                                                                module0249.f16055(var238, module0139.$g1636$.getDynamicValue(var208));
                                                                                                if (module0777.NIL != module0173.f10955(var238)) {
                                                                                                    var209 = Numbers.add(var209, f50136(var141, var207, var238));
                                                                                                }
                                                                                            }
                                                                                            var40_254 = var40_254.rest();
                                                                                            var238 = var40_254.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0777.$ic173$, var232);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var36_248, var208);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_247, var208);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(var287, (SubLObject)module0777.$ic175$);
                                                                }
                                                                var239 = var239.rest();
                                                                var240 = var239.first();
                                                            }
                                                        }
                                                    }
                                                    else if (module0777.NIL != module0155.f9785(var224, (SubLObject)module0777.UNPROVIDED)) {
                                                        SubLObject var89_258;
                                                        final SubLObject var247 = var89_258 = ((module0777.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0777.$ic161$)), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0777.$ic161$)), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED)));
                                                        SubLObject var248 = (SubLObject)module0777.NIL;
                                                        var248 = var89_258.first();
                                                        while (module0777.NIL != var89_258) {
                                                            final SubLObject var36_249 = module0138.$g1625$.currentBinding(var208);
                                                            try {
                                                                module0138.$g1625$.bind(var248, var208);
                                                                final SubLObject var250;
                                                                final SubLObject var249 = var250 = Functions.funcall(var248, var224);
                                                                if (module0777.NIL != module0077.f5302(var250)) {
                                                                    final SubLObject var251 = module0077.f5333(var250);
                                                                    SubLObject var252;
                                                                    SubLObject var253;
                                                                    SubLObject var254;
                                                                    for (var252 = module0032.f1741(var251), var253 = (SubLObject)module0777.NIL, var253 = module0032.f1742(var252, var251); module0777.NIL == module0032.f1744(var252, var253); var253 = module0032.f1743(var253)) {
                                                                        var254 = module0032.f1745(var252, var253);
                                                                        if (module0777.NIL != module0032.f1746(var253, var254) && module0777.NIL == module0249.f16059(var254, module0139.$g1636$.getDynamicValue(var208))) {
                                                                            module0249.f16055(var254, module0139.$g1636$.getDynamicValue(var208));
                                                                            if (module0777.NIL != module0173.f10955(var254)) {
                                                                                var209 = Numbers.add(var209, f50136(var141, var207, var254));
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (var250.isList()) {
                                                                    SubLObject var255 = var250;
                                                                    SubLObject var256 = (SubLObject)module0777.NIL;
                                                                    var256 = var255.first();
                                                                    while (module0777.NIL != var255) {
                                                                        if (module0777.NIL == module0249.f16059(var256, module0139.$g1636$.getDynamicValue(var208))) {
                                                                            module0249.f16055(var256, module0139.$g1636$.getDynamicValue(var208));
                                                                            if (module0777.NIL != module0173.f10955(var256)) {
                                                                                var209 = Numbers.add(var209, f50136(var141, var207, var256));
                                                                            }
                                                                        }
                                                                        var255 = var255.rest();
                                                                        var256 = var255.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0777.$ic173$, var250);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var36_249, var208);
                                                            }
                                                            var89_258 = var89_258.rest();
                                                            var248 = var89_258.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var37_226, var208);
                                                    module0137.$g1605$.rebind(var36_244, var208);
                                                }
                                                var222 = var222.rest();
                                                var223 = var222.first();
                                            }
                                            SubLObject var258;
                                            final SubLObject var257 = var258 = module0200.f12443(module0244.f15771(module0137.f8955(module0777.$ic161$)));
                                            SubLObject var259 = (SubLObject)module0777.NIL;
                                            var259 = var258.first();
                                            while (module0777.NIL != var258) {
                                                final SubLObject var36_250 = module0137.$g1605$.currentBinding(var208);
                                                final SubLObject var37_227 = module0141.$g1674$.currentBinding(var208);
                                                try {
                                                    module0137.$g1605$.bind(var259, var208);
                                                    module0141.$g1674$.bind((SubLObject)((module0777.NIL != module0141.f9205((SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0777.NIL == module0141.$g1674$.getDynamicValue(var208)) : module0141.$g1674$.getDynamicValue(var208)), var208);
                                                    final SubLObject var260 = module0228.f15229(var211_214);
                                                    if (module0777.NIL != module0138.f8992(var260)) {
                                                        final SubLObject var261 = module0242.f15664(var260, module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                        if (module0777.NIL != var261) {
                                                            final SubLObject var262 = module0245.f15834(var261, module0138.f8979(), module0137.f8955((SubLObject)module0777.UNPROVIDED));
                                                            if (module0777.NIL != var262) {
                                                                SubLObject var263;
                                                                for (var263 = module0066.f4838(module0067.f4891(var262)); module0777.NIL == module0066.f4841(var263); var263 = module0066.f4840(var263)) {
                                                                    var208.resetMultipleValues();
                                                                    final SubLObject var264 = module0066.f4839(var263);
                                                                    final SubLObject var265 = var208.secondMultipleValue();
                                                                    var208.resetMultipleValues();
                                                                    if (module0777.NIL != module0147.f9507(var264)) {
                                                                        final SubLObject var36_251 = module0138.$g1623$.currentBinding(var208);
                                                                        try {
                                                                            module0138.$g1623$.bind(var264, var208);
                                                                            SubLObject var232_241;
                                                                            for (var232_241 = module0066.f4838(module0067.f4891(var265)); module0777.NIL == module0066.f4841(var232_241); var232_241 = module0066.f4840(var232_241)) {
                                                                                var208.resetMultipleValues();
                                                                                final SubLObject var266 = module0066.f4839(var232_241);
                                                                                final SubLObject var267 = var208.secondMultipleValue();
                                                                                var208.resetMultipleValues();
                                                                                if (module0777.NIL != module0141.f9289(var266)) {
                                                                                    final SubLObject var36_252 = module0138.$g1624$.currentBinding(var208);
                                                                                    try {
                                                                                        module0138.$g1624$.bind(var266, var208);
                                                                                        final SubLObject var268 = var267;
                                                                                        if (module0777.NIL != module0077.f5302(var268)) {
                                                                                            final SubLObject var269 = module0077.f5333(var268);
                                                                                            SubLObject var270;
                                                                                            SubLObject var271;
                                                                                            SubLObject var272;
                                                                                            for (var270 = module0032.f1741(var269), var271 = (SubLObject)module0777.NIL, var271 = module0032.f1742(var270, var269); module0777.NIL == module0032.f1744(var270, var271); var271 = module0032.f1743(var271)) {
                                                                                                var272 = module0032.f1745(var270, var271);
                                                                                                if (module0777.NIL != module0032.f1746(var271, var272) && module0777.NIL == module0249.f16059(var272, (SubLObject)module0777.UNPROVIDED)) {
                                                                                                    module0249.f16055(var272, (SubLObject)module0777.UNPROVIDED);
                                                                                                    module0056.f4149(var272, var214);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (var268.isList()) {
                                                                                            SubLObject var273 = var268;
                                                                                            SubLObject var274 = (SubLObject)module0777.NIL;
                                                                                            var274 = var273.first();
                                                                                            while (module0777.NIL != var273) {
                                                                                                if (module0777.NIL == module0249.f16059(var274, (SubLObject)module0777.UNPROVIDED)) {
                                                                                                    module0249.f16055(var274, (SubLObject)module0777.UNPROVIDED);
                                                                                                    module0056.f4149(var274, var214);
                                                                                                }
                                                                                                var273 = var273.rest();
                                                                                                var274 = var273.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)module0777.$ic173$, var268);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        module0138.$g1624$.rebind(var36_252, var208);
                                                                                    }
                                                                                }
                                                                            }
                                                                            module0066.f4842(var232_241);
                                                                        }
                                                                        finally {
                                                                            module0138.$g1623$.rebind(var36_251, var208);
                                                                        }
                                                                    }
                                                                }
                                                                module0066.f4842(var263);
                                                            }
                                                        }
                                                        else {
                                                            module0136.f8870((SubLObject)module0777.FIVE_INTEGER, (SubLObject)module0777.$ic174$, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (module0777.NIL != module0155.f9785(var260, (SubLObject)module0777.UNPROVIDED)) {
                                                        SubLObject var89_259;
                                                        final SubLObject var275 = var89_259 = ((module0777.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var208), module0137.f8955((SubLObject)module0777.UNPROVIDED)));
                                                        SubLObject var276 = (SubLObject)module0777.NIL;
                                                        var276 = var89_259.first();
                                                        while (module0777.NIL != var89_259) {
                                                            final SubLObject var36_253 = module0138.$g1625$.currentBinding(var208);
                                                            try {
                                                                module0138.$g1625$.bind(var276, var208);
                                                                final SubLObject var278;
                                                                final SubLObject var277 = var278 = Functions.funcall(var276, var260);
                                                                if (module0777.NIL != module0077.f5302(var278)) {
                                                                    final SubLObject var279 = module0077.f5333(var278);
                                                                    SubLObject var280;
                                                                    SubLObject var281;
                                                                    SubLObject var282;
                                                                    for (var280 = module0032.f1741(var279), var281 = (SubLObject)module0777.NIL, var281 = module0032.f1742(var280, var279); module0777.NIL == module0032.f1744(var280, var281); var281 = module0032.f1743(var281)) {
                                                                        var282 = module0032.f1745(var280, var281);
                                                                        if (module0777.NIL != module0032.f1746(var281, var282) && module0777.NIL == module0249.f16059(var282, (SubLObject)module0777.UNPROVIDED)) {
                                                                            module0249.f16055(var282, (SubLObject)module0777.UNPROVIDED);
                                                                            module0056.f4149(var282, var214);
                                                                        }
                                                                    }
                                                                }
                                                                else if (var278.isList()) {
                                                                    SubLObject var283 = var278;
                                                                    SubLObject var284 = (SubLObject)module0777.NIL;
                                                                    var284 = var283.first();
                                                                    while (module0777.NIL != var283) {
                                                                        if (module0777.NIL == module0249.f16059(var284, (SubLObject)module0777.UNPROVIDED)) {
                                                                            module0249.f16055(var284, (SubLObject)module0777.UNPROVIDED);
                                                                            module0056.f4149(var284, var214);
                                                                        }
                                                                        var283 = var283.rest();
                                                                        var284 = var283.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)module0777.$ic173$, var278);
                                                                }
                                                            }
                                                            finally {
                                                                module0138.$g1625$.rebind(var36_253, var208);
                                                            }
                                                            var89_259 = var89_259.rest();
                                                            var276 = var89_259.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    module0141.$g1674$.rebind(var37_227, var208);
                                                    module0137.$g1605$.rebind(var36_250, var208);
                                                }
                                                var258 = var258.rest();
                                                var259 = var258.first();
                                            }
                                            var211_214 = module0056.f4150(var214);
                                        }
                                    }
                                    finally {
                                        module0141.$g1674$.rebind(var38_225, var208);
                                        module0138.$g1619$.rebind(var37_225, var208);
                                        module0141.$g1677$.rebind(var36_243, var208);
                                    }
                                }
                                else {
                                    module0136.f8872((SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.$ic176$, var212, module0244.f15748(module0137.f8955((SubLObject)module0777.UNPROVIDED)), (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                                }
                            }
                            finally {
                                module0137.$g1605$.rebind(var219, var208);
                                module0141.$g1674$.rebind(var218, var208);
                                module0141.$g1672$.rebind(var217, var208);
                                module0141.$g1671$.rebind(var37_224, var208);
                                module0141.$g1670$.rebind(var36_242, var208);
                            }
                        }
                        finally {
                            module0141.$g1715$.rebind(var37_223, var208);
                            module0141.$g1714$.rebind(var36_241, var208);
                        }
                        module0139.f9011(module0139.$g1635$.getDynamicValue(var208));
                    }
                    finally {
                        module0139.$g1635$.rebind(var36_240, var208);
                    }
                    module0139.f9011(module0139.$g1636$.getDynamicValue(var208));
                }
                finally {
                    module0139.$g1636$.rebind(var37_222, var208);
                    module0137.$g1605$.rebind(var36_239, var208);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var211, var208);
            module0147.$g2094$.rebind(var210, var208);
        }
        return var209;
    }
    
    public static SubLObject f50136(final SubLObject var141, final SubLObject var207, final SubLObject var115) {
        final SubLObject var208 = module0732.f45009(var115);
        final SubLObject var209 = module0732.f44998(var115);
        if (!var208.isInteger()) {
            return (SubLObject)module0777.ZERO_INTEGER;
        }
        if (var207 == module0777.$ic148$) {
            return module0217.f14221(var141, var208, var115, (SubLObject)module0777.UNPROVIDED);
        }
        if (!var209.isInteger()) {
            return (SubLObject)module0777.ZERO_INTEGER;
        }
        if (module0777.NIL != module0731.f44656(var207, (SubLObject)module0777.UNPROVIDED)) {
            SubLObject var210 = (SubLObject)module0777.ZERO_INTEGER;
            if (module0777.NIL != module0158.f10010(var141, var208, var115)) {
                final SubLObject var211 = module0158.f10011(var141, var208, var115);
                SubLObject var212 = (SubLObject)module0777.NIL;
                final SubLObject var213 = (SubLObject)module0777.NIL;
                while (module0777.NIL == var212) {
                    final SubLObject var214 = module0052.f3695(var211, var213);
                    final SubLObject var215 = (SubLObject)SubLObjectFactory.makeBoolean(!var213.eql(var214));
                    if (module0777.NIL != var215) {
                        SubLObject var216 = (SubLObject)module0777.NIL;
                        try {
                            var216 = module0158.f10316(var214, (SubLObject)module0777.$ic140$, (SubLObject)module0777.NIL, (SubLObject)module0777.NIL);
                            SubLObject var170_330 = (SubLObject)module0777.NIL;
                            final SubLObject var171_331 = (SubLObject)module0777.NIL;
                            while (module0777.NIL == var170_330) {
                                final SubLObject var217 = module0052.f3695(var216, var171_331);
                                final SubLObject var173_333 = (SubLObject)SubLObjectFactory.makeBoolean(!var171_331.eql(var217));
                                if (module0777.NIL != var173_333 && module0777.NIL != module0731.f44713(module0178.f11331(var217, var209), var207, (SubLObject)module0777.UNPROVIDED)) {
                                    var210 = Numbers.add(var210, (SubLObject)module0777.ONE_INTEGER);
                                }
                                var170_330 = (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL == var173_333);
                            }
                        }
                        finally {
                            final SubLObject var218 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0777.T);
                                if (module0777.NIL != var216) {
                                    module0158.f10319(var216);
                                }
                            }
                            finally {
                                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var218);
                            }
                        }
                    }
                    var212 = (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL == var215);
                }
            }
            return var210;
        }
        return (SubLObject)module0777.ZERO_INTEGER;
    }
    
    public static SubLObject f50137(final SubLObject var334, SubLObject var335) {
        if (var335 == module0777.UNPROVIDED) {
            var335 = (SubLObject)module0777.NIL;
        }
        final SubLThread var336 = SubLProcess.currentSubLThread();
        SubLObject var338;
        final SubLObject var337 = var338 = module0048.f_1_(Sequences.length(var334));
        SubLObject var339 = (SubLObject)module0777.ZERO_INTEGER;
        SubLObject var340 = (SubLObject)module0777.NIL;
        SubLObject var341 = (SubLObject)module0777.NIL;
        SubLObject var342 = (SubLObject)module0777.NIL;
        var340 = var334;
        var341 = var340.first();
        for (var342 = (SubLObject)module0777.ZERO_INTEGER; module0777.NIL != var340; var340 = var340.rest(), var341 = var340.first(), var342 = Numbers.add((SubLObject)module0777.ONE_INTEGER, var342)) {
            SubLObject var343 = (SubLObject)module0777.ZERO_INTEGER;
            final SubLObject var344 = (SubLObject)(var342.isZero() ? module0777.$ic181$ : (var342.eql(var337) ? module0777.$ic182$ : module0777.$ic183$));
            if (module0777.NIL == module0731.f44750(var341, (SubLObject)module0777.UNPROVIDED) && (module0777.NIL == var335 || module0777.NIL == f50138(var341))) {
                SubLObject var345 = module0730.f44560(var341, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                SubLObject var346 = (SubLObject)module0777.NIL;
                var346 = var345.first();
                while (module0777.NIL != var345) {
                    var343 = Numbers.add(var343, (SubLObject)module0777.ONE_INTEGER);
                    SubLObject var89_339 = module0731.f44729(var341, var346, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED, (SubLObject)module0777.UNPROVIDED);
                    SubLObject var347 = (SubLObject)module0777.NIL;
                    var347 = var89_339.first();
                    while (module0777.NIL != var89_339) {
                        var343 = Numbers.add(var343, f50135(var346, var347, var344));
                        var89_339 = var89_339.rest();
                        var347 = var89_339.first();
                    }
                    var345 = var345.rest();
                    var346 = var345.first();
                }
                if (module0777.$g6251$.getDynamicValue(var336).numGE(Numbers.max(module0777.$g6251$.getDynamicValue(var336), module0777.$g6245$.getGlobalValue()))) {
                    PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var336), (SubLObject)module0777.$ic184$, var342, var343);
                    streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(var336));
                }
                if (var343.numGE(var339)) {
                    if (module0777.$g6251$.getDynamicValue(var336).numGE(Numbers.max(module0777.$g6251$.getDynamicValue(var336), module0777.$g6245$.getGlobalValue()))) {
                        PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(var336), (SubLObject)module0777.$ic185$, var341);
                        streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(var336));
                    }
                    var338 = var342;
                    var339 = var343;
                }
            }
        }
        return var338;
    }
    
    public static SubLObject f50138(final SubLObject var92) {
        assert module0777.NIL != Types.stringp(var92) : var92;
        final SubLObject var93 = module0038.f2636(var92);
        return Characters.upper_case_p(var93);
    }
    
    public static SubLObject f50139(final SubLObject var334) {
        return f50137(var334, (SubLObject)module0777.T);
    }
    
    public static SubLObject f50140(final SubLObject var341, SubLObject var342) {
        if (var342 == module0777.UNPROVIDED) {
            var342 = (SubLObject)module0777.NIL;
        }
        final SubLThread var343 = SubLProcess.currentSubLThread();
        SubLObject var344 = (SubLObject)SubLObjectFactory.makeBoolean(module0777.NIL == module0777.$g6266$.getGlobalValue());
        if (module0777.NIL == var344) {
            final SubLObject var345 = module0147.f9540(module0777.$ic59$);
            final SubLObject var346 = module0147.$g2095$.currentBinding(var343);
            final SubLObject var347 = module0147.$g2094$.currentBinding(var343);
            final SubLObject var348 = module0147.$g2096$.currentBinding(var343);
            try {
                module0147.$g2095$.bind(module0147.f9545(var345), var343);
                module0147.$g2094$.bind(module0147.f9546(var345), var343);
                module0147.$g2096$.bind(module0147.f9549(var345), var343);
                var344 = module0220.f14544(var341, module0777.$ic187$, (SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var348, var343);
                module0147.$g2094$.rebind(var347, var343);
                module0147.$g2095$.rebind(var346, var343);
            }
        }
        return (SubLObject)((module0777.NIL != var344) ? module0777.$ic188$ : f50141(var341, var342));
    }
    
    public static SubLObject f50141(final SubLObject var341, SubLObject var342) {
        if (var342 == module0777.UNPROVIDED) {
            var342 = (SubLObject)module0777.NIL;
        }
        final SubLThread var343 = SubLProcess.currentSubLThread();
        SubLObject var344 = (SubLObject)module0777.NIL;
        SubLObject var345 = (SubLObject)module0777.ZERO_INTEGER;
        SubLObject var346 = (SubLObject)module0777.NIL;
        final SubLObject var347 = Time.get_internal_real_time();
        final SubLObject var348 = module0579.$g4245$.currentBinding(var343);
        try {
            module0579.$g4245$.bind((SubLObject)module0777.NIL, var343);
            var346 = f50142(var341, var342);
        }
        finally {
            module0579.$g4245$.rebind(var348, var343);
        }
        SubLObject var349 = var346;
        SubLObject var350 = (SubLObject)module0777.NIL;
        var350 = var349.first();
        while (module0777.NIL != var349) {
            SubLObject var352;
            final SubLObject var351 = var352 = var350;
            SubLObject var353 = (SubLObject)module0777.NIL;
            SubLObject var354 = (SubLObject)module0777.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var352, var351, (SubLObject)module0777.$ic189$);
            var353 = var352.first();
            var352 = var352.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var352, var351, (SubLObject)module0777.$ic189$);
            var354 = var352.first();
            var352 = var352.rest();
            if (module0777.NIL == var352) {
                SubLObject var355 = (SubLObject)module0777.NIL;
                var355 = (SubLObject)ConsesLow.list(module0777.$ic187$, var341, var353);
                if (module0777.NIL != module0543.f33631(var355, module0777.$ic190$, (SubLObject)module0777.$ic141$, (SubLObject)module0777.$ic191$)) {
                    var344 = (SubLObject)ConsesLow.cons(var353, var344);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var351, (SubLObject)module0777.$ic189$);
            }
            var349 = var349.rest();
            var350 = var349.first();
        }
        var345 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var347), time_high.$internal_time_units_per_second$.getGlobalValue());
        return Values.values(var344, var345);
    }
    
    public static SubLObject f50142(final SubLObject var341, SubLObject var342) {
        if (var342 == module0777.UNPROVIDED) {
            var342 = (SubLObject)module0777.NIL;
        }
        final SubLThread var343 = SubLProcess.currentSubLThread();
        SubLObject var344 = (SubLObject)module0777.NIL;
        var343.resetMultipleValues();
        final SubLObject var345 = f50143(var341, var342);
        final SubLObject var346 = var343.secondMultipleValue();
        final SubLObject var347 = var343.thirdMultipleValue();
        var343.resetMultipleValues();
        var344 = module0434.f30576((SubLObject)module0777.$ic192$, var345, var346, var347);
        return var344;
    }
    
    public static SubLObject f50143(final SubLObject var341, SubLObject var342) {
        if (var342 == module0777.UNPROVIDED) {
            var342 = (SubLObject)module0777.NIL;
        }
        final SubLThread var343 = SubLProcess.currentSubLThread();
        var343.resetMultipleValues();
        SubLObject var344 = module0423.f29604(f50144());
        final SubLObject var345 = var343.secondMultipleValue();
        final SubLObject var346 = var343.thirdMultipleValue();
        var343.resetMultipleValues();
        SubLObject var347 = (SubLObject)module0777.$ic193$;
        SubLObject var348 = (SubLObject)module0777.NIL;
        var348 = var347.first();
        while (module0777.NIL != var347) {
            var344 = module0202.f12820(var348, var341, var344);
            var347 = var347.rest();
            var348 = var347.first();
        }
        conses_high.putf(var346, (SubLObject)module0777.$ic194$, var342);
        return Values.values(var344, var345, var346);
    }
    
    public static SubLObject f50144() {
        return module0172.f10921((SubLObject)module0777.$ic195$);
    }
    
    public static SubLObject f50145() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50019", "S#54542", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50020", "S#54543", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0777", "f50021", "S#54544");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0777", "f50022", "S#54545");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0777", "f50023", "S#54546");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0777", "f50024", "S#54547");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50025", "S#54548", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0777", "f50026", "S#54549");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0777", "f50027", "S#54550");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50028", "S#54551", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50032", "S#54552", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50031", "S#50168", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50033", "S#54553", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50034", "S#54554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50035", "S#54555", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50036", "S#54556", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50037", "S#54557", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50038", "S#54558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50039", "S#54559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50040", "S#54560", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50041", "S#54561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50042", "PHRASE-FOR-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50043", "S#54562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50044", "S#54563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50046", "S#54564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50047", "S#54565", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50048", "S#54566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50030", "S#54567", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50029", "S#54568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50049", "S#54569", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50050", "S#54570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50051", "S#54571", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50052", "S#54572", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50053", "S#54573", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50054", "S#54574", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50055", "S#54575", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50056", "S#54576", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50057", "KEYWORD-FOR-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50058", "S#54577", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50059", "S#54578", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50060", "S#54579", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50061", "PRECISE-KEYWORD-FOR-POS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50062", "S#54580", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50063", "S#54581", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50064", "S#54582", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50065", "S#54583", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50066", "S#54584", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50067", "S#54585", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50068", "S#54586", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50069", "S#54587", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50070", "S#54588", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50071", "S#54589", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50072", "S#54590", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50073", "S#54591", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50074", "S#54592", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50075", "S#54593", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50076", "S#54594", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50077", "S#47093", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50078", "S#54595", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50079", "S#54596", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50080", "S#54597", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50081", "S#54598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50082", "S#54599", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50083", "S#54600", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50084", "S#54601", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50085", "S#48598", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50086", "S#54602", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50087", "S#54603", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50088", "S#54604", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50089", "S#54605", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50090", "S#54606", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50091", "S#54607", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50092", "S#49155", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50093", "S#54608", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50094", "S#54609", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50095", "S#54610", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50096", "S#54611", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50097", "S#54612", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50098", "S#54613", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50099", "S#54614", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50100", "S#54615", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50101", "S#54616", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50102", "S#54617", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50105", "S#54618", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50103", "S#54619", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50106", "S#54620", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50104", "S#54621", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50045", "S#54622", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50107", "S#54623", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50108", "S#54624", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50109", "S#54625", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50110", "S#49550", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50111", "S#54626", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50112", "S#54627", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50113", "S#54628", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50114", "S#54629", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50115", "S#54630", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50116", "S#54631", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50117", "S#50169", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50118", "S#54632", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50119", "S#54633", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50120", "S#54634", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50121", "S#54635", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50122", "S#54636", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50123", "S#54637", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50124", "S#54638", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50125", "S#54639", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50126", "S#54640", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50127", "S#54641", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50128", "S#54642", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50129", "S#54643", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50130", "S#54644", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50131", "S#54645", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50132", "S#54646", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50133", "S#54647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50134", "S#54648", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50135", "S#54649", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50136", "S#54650", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50137", "S#54651", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50138", "S#54652", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50139", "S#54653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50140", "POSSIBLY-LEXIFY-TERRORIST-ATTACK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50141", "S#54654", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50142", "S#54655", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50143", "S#54656", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0777", "f50144", "S#54657", 0, 0, false);
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50146() {
        module0777.$g6241$ = SubLFiles.defconstant("S#54658", (SubLObject)module0777.ZERO_INTEGER);
        module0777.$g6242$ = SubLFiles.defconstant("S#54659", (SubLObject)module0777.ONE_INTEGER);
        module0777.$g6243$ = SubLFiles.defconstant("S#54660", (SubLObject)module0777.ONE_INTEGER);
        module0777.$g6244$ = SubLFiles.defconstant("S#54661", (SubLObject)module0777.TWO_INTEGER);
        module0777.$g6245$ = SubLFiles.defconstant("S#54662", (SubLObject)module0777.THREE_INTEGER);
        module0777.$g6246$ = SubLFiles.defconstant("S#54663", (SubLObject)module0777.FOUR_INTEGER);
        module0777.$g6247$ = SubLFiles.defconstant("S#54664", (SubLObject)module0777.FIVE_INTEGER);
        module0777.$g6248$ = SubLFiles.defconstant("S#54665", (SubLObject)module0777.SIX_INTEGER);
        module0777.$g6249$ = SubLFiles.defconstant("S#54666", (SubLObject)module0777.SEVEN_INTEGER);
        module0777.$g6250$ = SubLFiles.defconstant("S#54667", (SubLObject)module0777.NINE_INTEGER);
        module0777.$g6251$ = SubLFiles.defvar("S#54668", module0777.$g6242$.getGlobalValue());
        module0777.$g6252$ = SubLFiles.deflexical("S#54669", (SubLObject)((module0777.NIL != Symbols.boundp((SubLObject)module0777.$ic0$)) ? module0777.$g6252$.getGlobalValue() : module0777.$ic1$));
        module0777.$g5315$ = SubLFiles.defvar("S#54670", (SubLObject)module0777.NIL);
        module0777.$g6253$ = SubLFiles.deflexical("S#54671", (SubLObject)((module0777.NIL != Symbols.boundp((SubLObject)module0777.$ic4$)) ? module0777.$g6253$.getGlobalValue() : module0777.THREE_INTEGER));
        module0777.$g6254$ = SubLFiles.defparameter("S#54672", module0038.f2818());
        module0777.$g6255$ = SubLFiles.defparameter("S#54673", (SubLObject)module0777.$ic5$);
        module0777.$g6256$ = SubLFiles.deflexical("S#54674", (SubLObject)module0777.NIL);
        module0777.$g6257$ = SubLFiles.deflexical("S#54675", (SubLObject)module0777.NIL);
        module0777.$g6258$ = SubLFiles.deflexical("S#54676", (SubLObject)module0777.NIL);
        module0777.$g6259$ = SubLFiles.deflexical("S#54677", (SubLObject)module0777.NIL);
        module0777.$g6260$ = SubLFiles.deflexical("S#54678", (SubLObject)module0777.NIL);
        module0777.$g6261$ = SubLFiles.deflexical("S#54679", (SubLObject)module0777.NIL);
        module0777.$g6262$ = SubLFiles.deflexical("S#54680", (SubLObject)module0777.NIL);
        module0777.$g6263$ = SubLFiles.deflexical("S#54681", (SubLObject)module0777.NIL);
        module0777.$g6264$ = SubLFiles.deflexical("S#54682", (SubLObject)module0777.NIL);
        module0777.$g6265$ = SubLFiles.deflexical("S#54683", (SubLObject)module0777.NIL);
        module0777.$g6266$ = SubLFiles.deflexical("S#54684", (SubLObject)module0777.NIL);
        return (SubLObject)module0777.NIL;
    }
    
    public static SubLObject f50147() {
        module0003.f57((SubLObject)module0777.$ic0$);
        module0012.f441((SubLObject)module0777.$ic2$);
        module0012.f444((SubLObject)module0777.$ic2$);
        module0003.f57((SubLObject)module0777.$ic4$);
        module0034.f1909((SubLObject)module0777.$ic70$);
        module0034.f1909((SubLObject)module0777.$ic93$);
        module0034.f1909((SubLObject)module0777.$ic106$);
        module0034.f1909((SubLObject)module0777.$ic108$);
        module0034.f1909((SubLObject)module0777.$ic113$);
        module0034.f1909((SubLObject)module0777.$ic117$);
        module0034.f1909((SubLObject)module0777.$ic119$);
        module0034.f1909((SubLObject)module0777.$ic122$);
        module0034.f1909((SubLObject)module0777.$ic126$);
        module0034.f1909((SubLObject)module0777.$ic135$);
        module0002.f38((SubLObject)module0777.$ic186$);
        return (SubLObject)module0777.NIL;
    }
    
    public void declareFunctions() {
        f50145();
    }
    
    public void initializeVariables() {
        f50146();
    }
    
    public void runTopLevelForms() {
        f50147();
    }
    
    static {
        me = (SubLFile)new module0777();
        module0777.$g6241$ = null;
        module0777.$g6242$ = null;
        module0777.$g6243$ = null;
        module0777.$g6244$ = null;
        module0777.$g6245$ = null;
        module0777.$g6246$ = null;
        module0777.$g6247$ = null;
        module0777.$g6248$ = null;
        module0777.$g6249$ = null;
        module0777.$g6250$ = null;
        module0777.$g6251$ = null;
        module0777.$g6252$ = null;
        module0777.$g5315$ = null;
        module0777.$g6253$ = null;
        module0777.$g6254$ = null;
        module0777.$g6255$ = null;
        module0777.$g6256$ = null;
        module0777.$g6257$ = null;
        module0777.$g6258$ = null;
        module0777.$g6259$ = null;
        module0777.$g6260$ = null;
        module0777.$g6261$ = null;
        module0777.$g6262$ = null;
        module0777.$g6263$ = null;
        module0777.$g6264$ = null;
        module0777.$g6265$ = null;
        module0777.$g6266$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#54669", "CYC");
        $ic1$ = SubLObjectFactory.makeInteger(30);
        $ic2$ = SubLObjectFactory.makeSymbol("S#54670", "CYC");
        $ic3$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic4$ = SubLObjectFactory.makeSymbol("S#54671", "CYC");
        $ic5$ = ConsesLow.list(new SubLObject[] { Characters.CHAR_period, Characters.CHAR_semicolon, Characters.CHAR_comma, Characters.CHAR_colon, Characters.CHAR_quotation, Characters.CHAR_exclamation, Characters.CHAR_question, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_percent, Characters.CHAR_caret, Characters.CHAR_asterisk });
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#696", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54685", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic7$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic8$ = SubLObjectFactory.makeSymbol(">=");
        $ic9$ = SubLObjectFactory.makeSymbol("S#54668", "CYC");
        $ic10$ = SubLObjectFactory.makeSymbol("FORMAT");
        $ic11$ = SubLObjectFactory.makeSymbol("*TRACE-OUTPUT*");
        $ic12$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("*TRACE-OUTPUT*")));
        $ic13$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54685", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#105", "CYC"));
        $ic14$ = SubLObjectFactory.makeSymbol("S#54544", "CYC");
        $ic15$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("S#54668", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54659", "CYC"));
        $ic16$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic17$ = SubLObjectFactory.makeString("Warning: ");
        $ic18$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#151", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("S#54686", "CYC"));
        $ic19$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("S#54668", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54662", "CYC"));
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("S#54668", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#54662", "CYC"));
        $ic21$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#63", "CYC"));
        $ic22$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic23$ = SubLObjectFactory.makeSymbol("S#54545", "CYC");
        $ic24$ = SubLObjectFactory.makeString("*** assertion failed: ~a ***~%");
        $ic25$ = SubLObjectFactory.makeSymbol("QUOTE");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#54", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#295", "CYC"), (SubLObject)SubLObjectFactory.makeString("Finding unlexified terms...")), (SubLObject)SubLObjectFactory.makeSymbol("S#54687", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic27$ = SubLObjectFactory.makeString("Finding unlexified terms...");
        $ic28$ = SubLObjectFactory.makeSymbol("DO-CONSTANTS");
        $ic29$ = SubLObjectFactory.makeSymbol("S#50168", "CYC");
        $ic30$ = SubLObjectFactory.makeString("Looking for unlexified FORTs created by ");
        $ic31$ = SubLObjectFactory.makeString(" in last ");
        $ic32$ = SubLObjectFactory.makeString(" days...");
        $ic33$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic34$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic35$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic36$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termDoesntNeedLexification"));
        $ic37$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("instancesDontNeedLexification"));
        $ic38$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("quotedInstancesDontNeedLexification"));
        $ic39$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic40$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic41$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $ic42$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("and"));
        $ic43$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated"));
        $ic44$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)SubLObjectFactory.makeSymbol("?MT"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt"))));
        $ic46$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("?MT")));
        $ic47$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt"));
        $ic48$ = SubLObjectFactory.makeString("char=~a next=~a next-next=~a run-len=~a new-index=~a~%");
        $ic49$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("singular")));
        $ic50$ = SubLObjectFactory.makeString(" Mt");
        $ic51$ = SubLObjectFactory.makeString(" G");
        $ic52$ = SubLObjectFactory.makeString("General ");
        $ic53$ = SubLObjectFactory.makeString(" ");
        $ic54$ = SubLObjectFactory.makeString(" - ");
        $ic55$ = SubLObjectFactory.makeString(" -");
        $ic56$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("multiWordString"));
        $ic57$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Know-TheWord"));
        $ic58$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("MassNoun"));
        $ic59$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $ic60$ = SubLObjectFactory.makeString("");
        $ic61$ = SubLObjectFactory.makeSymbol("INTEGERP");
        $ic62$ = SubLObjectFactory.makeInteger(3600);
        $ic63$ = SubLObjectFactory.makeInteger(24);
        $ic64$ = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $ic65$ = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic66$ = SubLObjectFactory.makeSymbol(">");
        $ic67$ = SubLObjectFactory.makeSymbol("NUM-PREDICATE-EXTENT-INDEX");
        $ic68$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CycLReifiableDenotationalTerm"));
        $ic69$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("EnglishLexiconMt"));
        $ic70$ = SubLObjectFactory.makeSymbol("KEYWORD-FOR-POS");
        $ic71$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $ic72$ = SubLObjectFactory.makeKeyword("PROPER-NOUN");
        $ic73$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $ic74$ = SubLObjectFactory.makeKeyword("DET");
        $ic75$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $ic76$ = SubLObjectFactory.makeKeyword("PRONOUN");
        $ic77$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Noun"));
        $ic78$ = SubLObjectFactory.makeKeyword("NOUN");
        $ic79$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Verb"));
        $ic80$ = SubLObjectFactory.makeKeyword("VERB");
        $ic81$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $ic82$ = SubLObjectFactory.makeKeyword("ADJECTIVE");
        $ic83$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Adverb"));
        $ic84$ = SubLObjectFactory.makeKeyword("ADVERB");
        $ic85$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $ic86$ = SubLObjectFactory.makeKeyword("PREP");
        $ic87$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Conjunction"));
        $ic88$ = SubLObjectFactory.makeKeyword("CONJ");
        $ic89$ = SubLObjectFactory.makeSymbol("S#54674", "CYC");
        $ic90$ = SubLObjectFactory.makeInteger(256);
        $ic91$ = SubLObjectFactory.makeInteger(100);
        $ic92$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic93$ = SubLObjectFactory.makeSymbol("PRECISE-KEYWORD-FOR-POS");
        $ic94$ = SubLObjectFactory.makeKeyword("MASS-NOUN");
        $ic95$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $ic96$ = SubLObjectFactory.makeKeyword("SIMPLE-NOUN");
        $ic97$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AgentiveNoun"));
        $ic98$ = SubLObjectFactory.makeKeyword("AGENTIVE-NOUN");
        $ic99$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("GerundiveNoun"));
        $ic100$ = SubLObjectFactory.makeKeyword("GERUNDIVE-NOUN");
        $ic101$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DeVerbalNoun"));
        $ic102$ = SubLObjectFactory.makeKeyword("DEVERBAL-NOUN");
        $ic103$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AuxVerb"));
        $ic104$ = SubLObjectFactory.makeKeyword("AUX");
        $ic105$ = SubLObjectFactory.makeSymbol("S#54675", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#54583", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#54676", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#54587", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#54677", "CYC");
        $ic110$ = SubLObjectFactory.makeString("invalid formula:~%~a~%");
        $ic111$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("Individual"));
        $ic112$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("ProperNoun")));
        $ic113$ = SubLObjectFactory.makeSymbol("S#47093", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#54678", "CYC");
        $ic115$ = SubLObjectFactory.makeInteger(2048);
        $ic116$ = SubLObjectFactory.makeInteger(1024);
        $ic117$ = SubLObjectFactory.makeSymbol("S#54598", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#54679", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#48598", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#54680", "CYC");
        $ic121$ = SubLObjectFactory.makeInteger(64);
        $ic122$ = SubLObjectFactory.makeSymbol("S#54605", "CYC");
        $ic123$ = SubLObjectFactory.makeSymbol("S#54681", "CYC");
        $ic124$ = SubLObjectFactory.makeKeyword("ALL");
        $ic125$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("AllLexicalMicrotheoryPSC"));
        $ic126$ = SubLObjectFactory.makeSymbol("S#54613", "CYC");
        $ic127$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $ic128$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CONSTRAINT"));
        $ic129$ = ConsesLow.list((SubLObject)ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?CONSTRAINT"), module0128.f8479((SubLObject)SubLObjectFactory.makeString("Abbreviation"))));
        $ic130$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic131$ = SubLObjectFactory.makeSymbol("S#54682", "CYC");
        $ic132$ = SubLObjectFactory.makeInteger(128);
        $ic133$ = SubLObjectFactory.makeInteger(40);
        $ic134$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings"));
        $ic135$ = SubLObjectFactory.makeSymbol("S#54618", "CYC");
        $ic136$ = SubLObjectFactory.makeString("examples-for-pred(~a ~a)~%");
        $ic137$ = SubLObjectFactory.makeSymbol("S#54683", "CYC");
        $ic138$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("examples-Positive"));
        $ic139$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("exampleSentence")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("examplePredSentence")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("exampleAssertions")));
        $ic140$ = SubLObjectFactory.makeKeyword("GAF");
        $ic141$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic142$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("toBeReviewedBy"));
        $ic143$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic144$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic145$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("DeadTerm"));
        $ic146$ = SubLObjectFactory.makeString("DeadTerm");
        $ic147$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("preferredTermStrings"));
        $ic148$ = SubLObjectFactory.makeKeyword("ANY");
        $ic149$ = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $ic150$ = SubLObjectFactory.makeSymbol("S#39353", "CYC");
        $ic151$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("nameableCollection"));
        $ic152$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("comment"));
        $ic153$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("worthy"), (SubLObject)SubLObjectFactory.makeString("ous"), (SubLObject)SubLObjectFactory.makeString("ical"), (SubLObject)SubLObjectFactory.makeString("less"), (SubLObject)SubLObjectFactory.makeString("like"), (SubLObject)SubLObjectFactory.makeString("able"), (SubLObject)SubLObjectFactory.makeString("ible"), (SubLObject)SubLObjectFactory.makeString("ic"));
        $ic154$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ly"));
        $ic155$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ability"), (SubLObject)SubLObjectFactory.makeString("ism"), (SubLObject)SubLObjectFactory.makeString("ness"), (SubLObject)SubLObjectFactory.makeString("ation"), (SubLObject)SubLObjectFactory.makeString("ion"), (SubLObject)SubLObjectFactory.makeString("ity"));
        $ic156$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ify"), (SubLObject)SubLObjectFactory.makeString("ize"));
        $ic157$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("ing"));
        $ic158$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("or"), (SubLObject)SubLObjectFactory.makeString("er"));
        $ic159$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), (SubLObject)SubLObjectFactory.makeKeyword("INITIAL"));
        $ic160$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HeadInitialMultiWordPhrasePred"));
        $ic161$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic162$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic163$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic164$ = SubLObjectFactory.makeKeyword("STACK");
        $ic165$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic166$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic167$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic168$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic169$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic170$ = SubLObjectFactory.makeString("continue anyway");
        $ic171$ = SubLObjectFactory.makeKeyword("WARN");
        $ic172$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic173$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic174$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic175$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic176$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic177$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), (SubLObject)SubLObjectFactory.makeKeyword("FINAL"));
        $ic178$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HeadFinalMultiWordPhrasePred"));
        $ic179$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), (SubLObject)SubLObjectFactory.makeKeyword("MEDIAL"));
        $ic180$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("HeadMedialMultiWordPhrasePred"));
        $ic181$ = SubLObjectFactory.makeKeyword("INITIAL");
        $ic182$ = SubLObjectFactory.makeKeyword("FINAL");
        $ic183$ = SubLObjectFactory.makeKeyword("MEDIAL");
        $ic184$ = SubLObjectFactory.makeString("word ~a usage: ~a~%");
        $ic185$ = SubLObjectFactory.makeString("Setting new guessed headword to ~S");
        $ic186$ = SubLObjectFactory.makeSymbol("POSSIBLY-LEXIFY-TERRORIST-ATTACK");
        $ic187$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("definiteDescriptions"));
        $ic188$ = SubLObjectFactory.makeKeyword("DONE");
        $ic189$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#54688", "CYC"));
        $ic190$ = module0128.f8479((SubLObject)SubLObjectFactory.makeString("TerrorismLexicalMt"));
        $ic191$ = SubLObjectFactory.makeKeyword("FORWARD");
        $ic192$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?STRING"), (SubLObject)SubLObjectFactory.makeSymbol("?SET"));
        $ic193$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0777.ONE_INTEGER, (SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.TWO_INTEGER, (SubLObject)module0777.TWO_INTEGER));
        $ic194$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic195$ = ConsesLow.list(module0128.f8479((SubLObject)SubLObjectFactory.makeString("TestQueryFn")), module0128.f8479((SubLObject)SubLObjectFactory.makeString("NLGIT-LexifyTerroristAttack")));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0777.class
	Total time: 5903 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/