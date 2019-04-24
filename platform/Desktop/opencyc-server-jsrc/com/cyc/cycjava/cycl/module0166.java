package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0166 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0166";
    public static final String myFingerPrint = "8e677c146b898dd2dd71358e4872bfe8ed60127e65e5c38f48f175027852b287";
    private static SubLSymbol $g2179$;
    public static SubLSymbol $g2180$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLList $ic3$;
    private static final SubLString $ic4$;
    private static final SubLList $ic5$;
    private static final SubLList $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLList $ic10$;
    private static final SubLString $ic11$;
    private static final SubLString $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLList $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLList $ic24$;
    private static final SubLString $ic25$;
    private static final SubLList $ic26$;
    private static final SubLList $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLList $ic29$;
    private static final SubLString $ic30$;
    private static final SubLList $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLList $ic37$;
    private static final SubLString $ic38$;
    private static final SubLList $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLString $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLString $ic46$;
    private static final SubLList $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLList $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLList $ic52$;
    private static final SubLString $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLList $ic57$;
    private static final SubLString $ic58$;
    private static final SubLList $ic59$;
    private static final SubLList $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLList $ic62$;
    private static final SubLString $ic63$;
    private static final SubLList $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLList $ic67$;
    private static final SubLList $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLString $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLList $ic77$;
    private static final SubLString $ic78$;
    private static final SubLInteger $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLList $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLList $ic86$;
    
    
    public static SubLObject f10733(final SubLObject var1, SubLObject var2) {
        if (var2 == module0166.UNPROVIDED) {
            var2 = (SubLObject)module0166.NIL;
        }
        assert module0166.NIL != module0126.f8391(var1) : var1;
        if (module0166.NIL != var2 && !module0166.areAssertionsDisabledFor(me) && module0166.NIL == f10734(var2)) {
            throw new AssertionError(var2);
        }
        if (module0166.NIL == var2) {
            var2 = f10735();
        }
        SubLObject var3 = (SubLObject)module0166.NIL;
        var3 = module0163.f10653(var1, var2);
        return var3;
    }
    
    public static SubLObject f10736(final SubLObject var1, SubLObject var2) {
        if (var2 == module0166.UNPROVIDED) {
            var2 = (SubLObject)module0166.NIL;
        }
        assert module0166.NIL != Types.stringp(var1) : var1;
        final SubLObject var3 = f10737(var1);
        if (module0166.NIL != f10738(var3)) {
            return var3;
        }
        return f10733(var1, var2);
    }
    
    public static SubLObject f10739(final SubLObject var5, SubLObject var6) {
        if (var6 == module0166.UNPROVIDED) {
            var6 = (SubLObject)module0166.$ic11$;
        }
        assert module0166.NIL != Types.stringp(var5) : var5;
        final SubLObject var7 = module0126.f8395(PrintLow.format((SubLObject)module0166.NIL, (SubLObject)module0166.$ic12$, var6, var5), (SubLObject)module0166.UNPROVIDED);
        final SubLObject var8 = f10733(var7, (SubLObject)module0166.UNPROVIDED);
        return var8;
    }
    
    public static SubLObject f10740(final SubLObject var7, SubLObject var6, SubLObject var8, SubLObject var9, SubLObject var10, SubLObject var11) {
        if (var6 == module0166.UNPROVIDED) {
            var6 = (SubLObject)module0166.$ic17$;
        }
        if (var8 == module0166.UNPROVIDED) {
            var8 = (SubLObject)module0166.$ic17$;
        }
        if (var9 == module0166.UNPROVIDED) {
            var9 = (SubLObject)module0166.$ic18$;
        }
        if (var10 == module0166.UNPROVIDED) {
            var10 = (SubLObject)module0166.T;
        }
        if (var11 == module0166.UNPROVIDED) {
            var11 = (SubLObject)module0166.NIL;
        }
        SubLObject var12 = (SubLObject)module0166.NIL;
        SubLObject var13 = (SubLObject)module0166.NIL;
        try {
            var13 = streams_high.make_private_string_output_stream();
            final SubLObject var14 = module0039.f3051(var7);
            SubLObject var15_16;
            SubLObject var15;
            SubLObject var16;
            SubLObject var17;
            SubLObject var18;
            for (var15 = (var15_16 = Sequences.length(var14)), var16 = (SubLObject)module0166.NIL, var16 = (SubLObject)module0166.ZERO_INTEGER; !var16.numGE(var15_16); var16 = module0048.f_1X(var16)) {
                var17 = Strings.sublisp_char(var14, var16);
                var18 = module0126.f8387(var17);
                if (var17.eql((SubLObject)Characters.CHAR_space)) {
                    var9 = (SubLObject)module0166.$ic18$;
                }
                else if (module0166.NIL != var18 && var9 == module0166.$ic18$) {
                    print_high.princ(Characters.char_upcase(var17), var13);
                    var9 = (SubLObject)module0166.NIL;
                }
                else if (module0166.NIL != var18 && var9 == module0166.$ic19$) {
                    print_high.princ(Characters.char_downcase(var17), var13);
                    var9 = (SubLObject)module0166.NIL;
                }
                else if (module0166.NIL != var18) {
                    print_high.princ(var17, var13);
                }
            }
            var12 = streams_high.get_output_stream_string(var13);
        }
        finally {
            final SubLObject var19 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0166.T);
                streams_high.close(var13, (SubLObject)module0166.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var19);
            }
        }
        if (var12.equalp((SubLObject)module0166.$ic20$)) {
            var12 = (SubLObject)module0166.$ic21$;
        }
        var12 = Sequences.cconcatenate(var6, new SubLObject[] { var12, var8 });
        if (module0166.NIL != var10) {
            var12 = module0126.f8395(var12, var11);
        }
        return var12;
    }
    
    public static SubLObject f10741(final SubLObject var4) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        f10742(var4);
        if (module0166.NIL != module0342.f23111(var4)) {
            return var4;
        }
        return module0163.f10656(var4);
    }
    
    public static SubLObject f10742(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert module0166.NIL != module0128.f8449(var4) : var4;
        final SubLObject var6 = module0123.$g1493$.currentBinding(var5);
        try {
            module0123.$g1493$.bind((SubLObject)ConsesLow.cons(var4, module0123.$g1493$.getDynamicValue(var5)), var5);
            if (module0166.NIL != module0210.f13582(var4, (SubLObject)module0166.T, (SubLObject)module0166.T)) {
                module0287.f19235(var4, (SubLObject)module0166.UNPROVIDED);
            }
            if (module0166.NIL != module0131.f8563() && module0166.NIL != module0324.f21952(var4)) {
                module0327.f22135(var4);
            }
            module0172.f10928(var4);
            module0617.f37867(var4);
            module0217.f14370(var4);
            module0183.f11626(var4);
            module0549.f33953(var4);
        }
        finally {
            module0123.$g1493$.rebind(var6, var5);
        }
        return (SubLObject)module0166.NIL;
    }
    
    public static SubLObject f10737(final SubLObject var1) {
        assert module0166.NIL != Types.stringp(var1) : var1;
        return module0163.f10657(var1);
    }
    
    public static SubLObject f10743(final SubLObject var4) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        return module0163.f10658(var4);
    }
    
    public static SubLObject f10744(final SubLObject var4) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        return (SubLObject)((module0166.NIL != module0128.f8462(var4)) ? module0163.f10660(var4) : module0166.NIL);
    }
    
    public static SubLObject f10745(final SubLObject var4) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        return (SubLObject)((module0166.NIL != module0128.f8462(var4)) ? module0163.f10661(var4) : module0166.NIL);
    }
    
    public static SubLObject f10746(final SubLObject var22) {
        assert module0166.NIL != Guids.guid_p(var22) : var22;
        return module0163.f10659(var22);
    }
    
    public static SubLObject f10747(final SubLObject var23) {
        assert module0166.NIL != Guids.guid_string_p(var23) : var23;
        return f10746(Guids.string_to_guid(var23));
    }
    
    public static SubLObject f10748(final SubLObject var4, final SubLObject var24) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        assert module0166.NIL != Types.stringp(var24) : var24;
        return module0163.f10662(var4, var24);
    }
    
    public static SubLObject f10749(final SubLObject var4) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        return module0128.f8440(var4);
    }
    
    public static SubLObject f10750(final SubLObject var2) {
        final SubLObject var3 = f10751(var2);
        return (SubLObject)((module0166.NIL != var3) ? f10749(var3) : module0166.NIL);
    }
    
    public static SubLObject f10752(final SubLObject var25) {
        assert module0166.NIL != f10753(var25) : var25;
        return module0128.f8486(var25);
    }
    
    public static SubLObject f10753(final SubLObject var26) {
        return Types.integerp(var26);
    }
    
    public static SubLObject f10754(final SubLObject var27, final SubLObject var28) {
        final SubLObject var29 = module0128.f8440(var27);
        final SubLObject var30 = module0128.f8440(var28);
        if (module0166.NIL != var29 && module0166.NIL != var30) {
            return Numbers.numL(var29, var30);
        }
        if (module0166.NIL == var29 && module0166.NIL == var30) {
            return (SubLObject)module0166.NIL;
        }
        return Types.sublisp_null(var29);
    }
    
    public static SubLObject f10738(final SubLObject var26) {
        return module0128.f8461(var26);
    }
    
    public static SubLObject f10755(final SubLObject var26) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0166.NIL != module0128.f8449(var26) && module0166.NIL == f10738(var26));
    }
    
    public static SubLObject f10756() {
        return module0128.f8436();
    }
    
    public static SubLObject f10757(final SubLObject var4) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        return f10744(var4);
    }
    
    public static SubLObject f10758(final SubLObject var31) {
        final SubLObject var32 = f10752(var31);
        return (SubLObject)((module0166.NIL != module0128.f8449(var32)) ? f10743(var32) : module0166.NIL);
    }
    
    public static SubLObject f10751(final SubLObject var2) {
        assert module0166.NIL != f10734(var2) : var2;
        return f10746(var2);
    }
    
    public static SubLObject f10734(final SubLObject var26) {
        return Guids.guid_p(var26);
    }
    
    public static SubLObject f10759(final SubLObject var4, final SubLObject var2) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        assert module0166.NIL != f10734(var2) : var2;
        final SubLObject var5 = f10744(var4);
        return Guids.guidE(var5, var2);
    }
    
    public static SubLObject f10760(final SubLObject var27, final SubLObject var28) {
        final SubLObject var29 = f10744(var27);
        final SubLObject var30 = f10744(var28);
        if (module0166.NIL != var29 && module0166.NIL != var30) {
            return Guids.guidL(var29, var30);
        }
        if (module0166.NIL == var29 && module0166.NIL == var30) {
            return (SubLObject)module0166.NIL;
        }
        return Types.sublisp_null(var29);
    }
    
    public static SubLObject f10761(final SubLObject var34) {
        assert module0166.NIL != Types.listp(var34) : var34;
        SubLObject var35 = (SubLObject)module0166.NIL;
        SubLObject var36 = (SubLObject)module0166.NIL;
        SubLObject var37 = var34;
        SubLObject var38 = (SubLObject)module0166.NIL;
        var38 = var37.first();
        while (module0166.NIL != var37) {
            var36 = f10751(Guids.string_to_guid(var38));
            if (module0166.NIL != var36) {
                var35 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var38, f10743(var36)), var35);
            }
            else {
                var35 = (SubLObject)ConsesLow.cons((SubLObject)module0166.NIL, var35);
            }
            var37 = var37.rest();
            var38 = var37.first();
        }
        return Sequences.nreverse(var35);
    }
    
    public static SubLObject f10762(final SubLObject var37) {
        assert module0166.NIL != Types.listp(var37) : var37;
        SubLObject var38 = (SubLObject)module0166.NIL;
        SubLObject var39 = (SubLObject)module0166.NIL;
        SubLObject var40 = var37;
        SubLObject var41 = (SubLObject)module0166.NIL;
        var41 = var40.first();
        while (module0166.NIL != var40) {
            var39 = f10737(var41);
            if (module0166.NIL != var39) {
                var38 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(f10744(var39), f10743(var39)), var38);
            }
            else {
                var38 = (SubLObject)ConsesLow.cons((SubLObject)module0166.NIL, var38);
            }
            var40 = var40.rest();
            var41 = var40.first();
        }
        return Sequences.nreverse(var38);
    }
    
    public static SubLObject f10735() {
        return f10763();
    }
    
    public static SubLObject f10764() {
        return f10735();
    }
    
    public static SubLObject f10763() {
        return Guids.new_guid();
    }
    
    public static SubLObject f10765(final SubLObject var39) {
        assert module0166.NIL != f10766(var39) : var39;
        SubLObject var41;
        final SubLObject var40 = var41 = module0166.$g2179$.getGlobalValue();
        SubLObject var42 = (SubLObject)module0166.NIL;
        SubLObject var43 = (SubLObject)module0166.NIL;
        SubLObject var44 = (SubLObject)module0166.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0166.$ic67$);
        var42 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0166.$ic67$);
        var43 = var41.first();
        var41 = var41.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0166.$ic67$);
        var44 = var41.first();
        var41 = var41.rest();
        if (module0166.NIL == var41) {
            return Guids.make_date_relative_guid(var44, var42, var43, var39);
        }
        cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0166.$ic67$);
        return (SubLObject)module0166.NIL;
    }
    
    public static SubLObject f10767(final SubLObject var22) {
        final SubLThread var23 = SubLProcess.currentSubLThread();
        assert module0166.NIL != Guids.guid_p(var22) : var22;
        if (module0166.NIL != Guids.date_relative_guid_p(var22)) {
            var23.resetMultipleValues();
            final SubLObject var24 = Guids.crack_date_relative_guid(var22);
            final SubLObject var25 = var23.secondMultipleValue();
            final SubLObject var26 = var23.thirdMultipleValue();
            final SubLObject var27 = var23.fourthMultipleValue();
            var23.resetMultipleValues();
            SubLObject var29;
            final SubLObject var28 = var29 = module0166.$g2179$.getGlobalValue();
            SubLObject var30 = (SubLObject)module0166.NIL;
            SubLObject var31 = (SubLObject)module0166.NIL;
            SubLObject var32 = (SubLObject)module0166.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0166.$ic68$);
            var30 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0166.$ic68$);
            var31 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0166.$ic68$);
            var32 = var29.first();
            var29 = var29.rest();
            if (module0166.NIL == var29) {
                if (var32.numE(var24) && var30.numE(var25) && var31.numE(var26)) {
                    return var27;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0166.$ic68$);
            }
        }
        return (SubLObject)module0166.NIL;
    }
    
    public static SubLObject f10768(final SubLObject var4) {
        return f10767(f10744(var4));
    }
    
    public static SubLObject f10769(final SubLObject var39) {
        return f10746(f10765(var39));
    }
    
    public static SubLObject f10766(final SubLObject var26) {
        return Types.integerp(var26);
    }
    
    public static SubLObject f10770(final SubLObject var4) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0166.NIL != module0128.f8449(var4) && module0166.$ic69$ == f10743(var4));
    }
    
    public static SubLObject f10771(final SubLObject var4) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        final SubLObject var5 = module0038.f2702((SubLObject)Characters.CHAR_colon, f10743(var4), (SubLObject)module0166.UNPROVIDED);
        if (module0166.NIL != var5) {
            return Sequences.subseq(f10743(var4), (SubLObject)module0166.ZERO_INTEGER, var5);
        }
        return (SubLObject)module0166.$ic70$;
    }
    
    public static SubLObject f10772(final SubLObject var4) {
        assert module0166.NIL != module0128.f8449(var4) : var4;
        final SubLObject var5 = module0038.f2702((SubLObject)Characters.CHAR_colon, f10743(var4), (SubLObject)module0166.UNPROVIDED);
        if (module0166.NIL != var5) {
            return Sequences.subseq(f10743(var4), Numbers.add(var5, (SubLObject)module0166.ONE_INTEGER), (SubLObject)module0166.UNPROVIDED);
        }
        return f10743(var4);
    }
    
    public static SubLObject f10773(SubLObject var54) {
        if (var54 == module0166.UNPROVIDED) {
            var54 = Symbols.symbol_function((SubLObject)module0166.$ic75$);
        }
        if (module0128.f8433().numG((SubLObject)module0166.ZERO_INTEGER)) {
            final SubLObject var55 = module0128.f8435();
            SubLObject var56;
            SubLObject var57;
            for (var56 = (SubLObject)module0166.NIL; module0166.NIL == var56; var56 = var57) {
                var57 = module0128.f8486(random.random(var55));
                if (module0166.NIL != var57 && module0166.NIL != Functions.funcall(var54, var57)) {}
            }
            return var56;
        }
        return (SubLObject)module0166.NIL;
    }
    
    public static SubLObject f10774(SubLObject var58, SubLObject var59, SubLObject var54) {
        if (var58 == module0166.UNPROVIDED) {
            var58 = (SubLObject)module0166.$ic79$;
        }
        if (var59 == module0166.UNPROVIDED) {
            var59 = (SubLObject)module0166.NIL;
        }
        if (var54 == module0166.UNPROVIDED) {
            var54 = Symbols.symbol_function((SubLObject)module0166.$ic75$);
        }
        assert module0166.NIL != module0004.f106(var58) : var58;
        if (module0166.NIL != var59) {
            SubLObject var60 = (SubLObject)module0166.NIL;
            SubLObject var61;
            for (var61 = (SubLObject)module0166.NIL, var61 = (SubLObject)module0166.ZERO_INTEGER; var61.numL(var58); var61 = Numbers.add(var61, (SubLObject)module0166.ONE_INTEGER)) {
                var60 = (SubLObject)ConsesLow.cons(f10773(var54), var60);
            }
            return var60;
        }
        SubLObject var60;
        for (var60 = module0032.f1726(var58, Symbols.symbol_function((SubLObject)module0166.EQL)); module0032.f1728(var60).numL(var58); var60 = module0032.f1736(f10773(var54), var60, Symbols.symbol_function((SubLObject)module0166.EQL))) {}
        return module0032.f1753(var60);
    }
    
    public static SubLObject f10775(final SubLObject var61, SubLObject var62, SubLObject var63) {
        if (var62 == module0166.UNPROVIDED) {
            var62 = (SubLObject)module0166.NIL;
        }
        if (var63 == module0166.UNPROVIDED) {
            var63 = (SubLObject)module0166.NIL;
        }
        final SubLThread var64 = SubLProcess.currentSubLThread();
        assert module0166.NIL != module0024.f1254(var61) : var61;
        SubLObject var65 = (SubLObject)module0166.NIL;
        var64.resetMultipleValues();
        final SubLObject var66 = module0024.f1251(var61, var62);
        final SubLObject var67 = var64.secondMultipleValue();
        final SubLObject var68 = var64.thirdMultipleValue();
        final SubLObject var69 = var64.fourthMultipleValue();
        var64.resetMultipleValues();
        try {
            if (module0166.NIL == module0024.f1253(var66)) {
                Errors.error((SubLObject)module0166.$ic82$, new SubLObject[] { var67, var69, var61, var68 });
            }
            var65 = f10776(var66, var63);
        }
        finally {
            final SubLObject var70 = Threads.$is_thread_performing_cleanupP$.currentBinding(var64);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0166.T, var64);
                if (module0166.NIL != module0024.f1253(var66)) {
                    module0024.f1257(var66);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var70, var64);
            }
        }
        return var65;
    }
    
    public static SubLObject f10776(final SubLObject var65, SubLObject var63) {
        if (var63 == module0166.UNPROVIDED) {
            var63 = (SubLObject)module0166.NIL;
        }
        SubLObject var66 = (SubLObject)module0166.NIL;
        final SubLObject var67 = module0128.f8425();
        if (module0166.NIL == module0065.f4772(var67, (SubLObject)module0166.$ic83$)) {
            final SubLObject var70_71 = var67;
            if (module0166.NIL == module0065.f4775(var70_71, (SubLObject)module0166.$ic83$)) {
                final SubLObject var68 = module0065.f4740(var70_71);
                final SubLObject var69 = (SubLObject)module0166.NIL;
                SubLObject var70;
                SubLObject var71;
                SubLObject var72;
                SubLObject var73;
                for (var70 = Sequences.length(var68), var71 = (SubLObject)module0166.NIL, var71 = (SubLObject)module0166.ZERO_INTEGER; var71.numL(var70); var71 = Numbers.add(var71, (SubLObject)module0166.ONE_INTEGER)) {
                    var72 = ((module0166.NIL != var69) ? Numbers.subtract(var70, var71, (SubLObject)module0166.ONE_INTEGER) : var71);
                    var73 = Vectors.aref(var68, var72);
                    if (module0166.NIL == module0065.f4749(var73) || module0166.NIL == module0065.f4773((SubLObject)module0166.$ic83$)) {
                        if (module0166.NIL != module0065.f4749(var73)) {
                            var73 = (SubLObject)module0166.$ic83$;
                        }
                        if (module0166.NIL != module0035.sublisp_boolean(module0045.f3139(var65, f10743(var73), var63, (SubLObject)module0166.NIL, (SubLObject)module0166.UNPROVIDED, (SubLObject)module0166.UNPROVIDED))) {
                            var66 = (SubLObject)ConsesLow.cons(var73, var66);
                        }
                    }
                }
            }
            final SubLObject var77_78 = var67;
            if (module0166.NIL == module0065.f4777(var77_78) || module0166.NIL == module0065.f4773((SubLObject)module0166.$ic83$)) {
                final SubLObject var74 = module0065.f4738(var77_78);
                SubLObject var75 = module0065.f4739(var77_78);
                final SubLObject var76 = module0065.f4734(var77_78);
                final SubLObject var77 = (SubLObject)((module0166.NIL != module0065.f4773((SubLObject)module0166.$ic83$)) ? module0166.NIL : module0166.$ic83$);
                while (var75.numL(var76)) {
                    final SubLObject var78 = Hashtables.gethash_without_values(var75, var74, var77);
                    if ((module0166.NIL == module0065.f4773((SubLObject)module0166.$ic83$) || module0166.NIL == module0065.f4749(var78)) && module0166.NIL != module0035.sublisp_boolean(module0045.f3139(var65, f10743(var78), var63, (SubLObject)module0166.NIL, (SubLObject)module0166.UNPROVIDED, (SubLObject)module0166.UNPROVIDED))) {
                        var66 = (SubLObject)ConsesLow.cons(var78, var66);
                    }
                    var75 = Numbers.add(var75, (SubLObject)module0166.ONE_INTEGER);
                }
            }
        }
        return Sequences.nreverse(var66);
    }
    
    public static SubLObject f10777(final SubLObject var26) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0166.NIL != module0035.f2014(var26) && module0166.NIL != module0035.f1995(var26, (SubLObject)module0166.TWO_INTEGER, (SubLObject)module0166.UNPROVIDED) && module0166.NIL != module0035.f2370((SubLObject)module0166.$ic80$, var26, (SubLObject)module0166.UNPROVIDED));
    }
    
    public static SubLObject f10778() {
        final SubLObject var82 = module0128.f8433();
        final SubLObject var83 = module0128.f8435();
        return (SubLObject)ConsesLow.list(var82, var83);
    }
    
    public static SubLObject f10779(final SubLObject var84) {
        SubLObject var85 = (SubLObject)module0166.NIL;
        SubLObject var86 = (SubLObject)module0166.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var84, var84, (SubLObject)module0166.$ic84$);
        var85 = var84.first();
        SubLObject var87 = var84.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var87, var84, (SubLObject)module0166.$ic84$);
        var86 = var87.first();
        var87 = var87.rest();
        if (module0166.NIL == var87) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var85.numE(module0128.f8433()) && var86.numE(module0128.f8435()));
        }
        cdestructuring_bind.cdestructuring_bind_error(var84, (SubLObject)module0166.$ic84$);
        return (SubLObject)module0166.NIL;
    }
    
    public static SubLObject f10780(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = f10749(var4);
        final SubLObject var7 = module0166.$g2180$.getDynamicValue(var5);
        if (module0166.NIL != var7) {
            var6 = module0065.f4750(var7, var6, (SubLObject)module0166.UNPROVIDED);
        }
        return var6;
    }
    
    public static SubLObject f10781(final SubLObject var90) {
        return f10752(var90);
    }
    
    public static SubLObject f10782(final SubLObject var91, final SubLObject var92) {
        final SubLObject var93 = var91.rest();
        final SubLObject var95;
        final SubLObject var94 = var95 = var93;
        return (SubLObject)ConsesLow.listS((SubLObject)module0166.$ic85$, (SubLObject)module0166.$ic86$, ConsesLow.append(var95, (SubLObject)module0166.NIL));
    }
    
    public static SubLObject f10783() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10733", "CREATE-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10736", "FIND-OR-CREATE-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10739", "GENTEMP-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10740", "S#13560", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10741", "REMOVE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10742", "S#13561", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10737", "FIND-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10743", "CONSTANT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10744", "CONSTANT-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10745", "S#13531", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10746", "FIND-CONSTANT-BY-GUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10747", "S#13562", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10748", "RENAME-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10749", "CONSTANT-INTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10750", "S#13563", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10752", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10753", "S#13564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10754", "S#13565", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10738", "S#13566", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10755", "S#10507", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10756", "S#13567", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10757", "CONSTANT-EXTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10758", "S#13568", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10751", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10734", "S#13484", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10759", "S#13569", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10760", "S#13570", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10761", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10762", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10735", "S#13571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10764", "S#13572", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10763", "S#13573", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10765", "S#13530", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10767", "S#13574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10768", "S#13575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10769", "S#13576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10766", "S#13529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10770", "S#13577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10771", "CONSTANT-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10772", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10773", "RANDOM-CONSTANT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10774", "S#13578", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10775", "S#13579", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10776", "S#13580", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10777", "S#13581", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10778", "S#13582", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10779", "S#13583", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10780", "S#13584", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0166", "f10781", "S#13585", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0166", "f10782", "S#10592");
        return (SubLObject)module0166.NIL;
    }
    
    public static SubLObject f10784() {
        module0166.$g2179$ = SubLFiles.deflexical("S#13586", (SubLObject)module0166.$ic65$);
        module0166.$g2180$ = SubLFiles.defparameter("S#13587", (SubLObject)module0166.NIL);
        return (SubLObject)module0166.NIL;
    }
    
    public static SubLObject f10785() {
        module0012.f368((SubLObject)module0166.$ic2$, (SubLObject)module0166.$ic3$, (SubLObject)module0166.$ic4$, (SubLObject)module0166.$ic5$, (SubLObject)module0166.$ic6$);
        module0012.f368((SubLObject)module0166.$ic8$, (SubLObject)module0166.$ic3$, (SubLObject)module0166.$ic9$, (SubLObject)module0166.$ic10$, (SubLObject)module0166.$ic6$);
        module0012.f368((SubLObject)module0166.$ic13$, (SubLObject)module0166.$ic14$, (SubLObject)module0166.$ic15$, (SubLObject)module0166.$ic16$, (SubLObject)module0166.$ic6$);
        module0012.f368((SubLObject)module0166.$ic23$, (SubLObject)module0166.$ic24$, (SubLObject)module0166.$ic25$, (SubLObject)module0166.$ic26$, (SubLObject)module0166.$ic27$);
        module0012.f368((SubLObject)module0166.$ic28$, (SubLObject)module0166.$ic29$, (SubLObject)module0166.$ic30$, (SubLObject)module0166.$ic10$, (SubLObject)module0166.$ic31$);
        module0012.f368((SubLObject)module0166.$ic32$, (SubLObject)module0166.$ic24$, (SubLObject)module0166.$ic33$, (SubLObject)module0166.$ic26$, (SubLObject)module0166.NIL);
        module0012.f368((SubLObject)module0166.$ic36$, (SubLObject)module0166.$ic37$, (SubLObject)module0166.$ic38$, (SubLObject)module0166.$ic39$, (SubLObject)module0166.$ic6$);
        module0012.f368((SubLObject)module0166.$ic40$, (SubLObject)module0166.$ic24$, (SubLObject)module0166.$ic41$, (SubLObject)module0166.$ic26$, (SubLObject)module0166.$ic42$);
        module0012.f368((SubLObject)module0166.$ic44$, (SubLObject)module0166.$ic45$, (SubLObject)module0166.$ic46$, (SubLObject)module0166.$ic47$, (SubLObject)module0166.$ic31$);
        module0012.f368((SubLObject)module0166.$ic48$, (SubLObject)module0166.$ic24$, (SubLObject)module0166.$ic49$, (SubLObject)module0166.$ic26$, (SubLObject)module0166.$ic50$);
        module0012.f368((SubLObject)module0166.$ic51$, (SubLObject)module0166.$ic52$, (SubLObject)module0166.$ic53$, (SubLObject)module0166.$ic54$, (SubLObject)module0166.$ic31$);
        module0012.f368((SubLObject)module0166.$ic56$, (SubLObject)module0166.$ic57$, (SubLObject)module0166.$ic58$, (SubLObject)module0166.$ic59$, (SubLObject)module0166.$ic60$);
        module0012.f368((SubLObject)module0166.$ic61$, (SubLObject)module0166.$ic62$, (SubLObject)module0166.$ic63$, (SubLObject)module0166.$ic64$, (SubLObject)module0166.$ic60$);
        module0012.f368((SubLObject)module0166.$ic71$, (SubLObject)module0166.$ic24$, (SubLObject)module0166.$ic72$, (SubLObject)module0166.$ic26$, (SubLObject)module0166.NIL);
        module0012.f368((SubLObject)module0166.$ic73$, (SubLObject)module0166.$ic24$, (SubLObject)module0166.$ic74$, (SubLObject)module0166.$ic26$, (SubLObject)module0166.NIL);
        module0012.f368((SubLObject)module0166.$ic76$, (SubLObject)module0166.$ic77$, (SubLObject)module0166.$ic78$, (SubLObject)module0166.NIL, (SubLObject)module0166.$ic6$);
        return (SubLObject)module0166.NIL;
    }
    
    public void declareFunctions() {
        f10783();
    }
    
    public void initializeVariables() {
        f10784();
    }
    
    public void runTopLevelForms() {
        f10785();
    }
    
    static {
        me = (SubLFile)new module0166();
        module0166.$g2179$ = null;
        module0166.$g2180$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#10492", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#13484", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("CREATE-CONSTANT");
        $ic3$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"));
        $ic4$ = SubLObjectFactory.makeString("Return a new constant named NAME with EXTERNAL-ID as the external ID.");
        $ic5$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#10492", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13484", "CYC"))));
        $ic6$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $ic7$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic8$ = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-CONSTANT");
        $ic9$ = SubLObjectFactory.makeString("Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\n  Also, if it exists but has a null id, install EXTERNAL-ID on the constant.");
        $ic10$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $ic11$ = SubLObjectFactory.makeString("TMP");
        $ic12$ = SubLObjectFactory.makeString("~A-~A");
        $ic13$ = SubLObjectFactory.makeSymbol("GENTEMP-CONSTANT");
        $ic14$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13588", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeString("TMP")));
        $ic15$ = SubLObjectFactory.makeString("Create and return a temporary constant whose name is based on START-NAME");
        $ic16$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13588", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $ic17$ = SubLObjectFactory.makeString("");
        $ic18$ = SubLObjectFactory.makeKeyword("UPCASE");
        $ic19$ = SubLObjectFactory.makeKeyword("DOWNCASE");
        $ic20$ = SubLObjectFactory.makeString("T");
        $ic21$ = SubLObjectFactory.makeString("T-");
        $ic22$ = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $ic23$ = SubLObjectFactory.makeSymbol("REMOVE-CONSTANT");
        $ic24$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"));
        $ic25$ = SubLObjectFactory.makeString("Remove CONSTANT from the KB.");
        $ic26$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $ic27$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $ic28$ = SubLObjectFactory.makeSymbol("FIND-CONSTANT");
        $ic29$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"));
        $ic30$ = SubLObjectFactory.makeString("Return the constant with NAME, or NIL if not present.");
        $ic31$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")));
        $ic32$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $ic33$ = SubLObjectFactory.makeString("Return the name of CONSTANT or :unnamed.");
        $ic34$ = SubLObjectFactory.makeSymbol("GUID-P");
        $ic35$ = SubLObjectFactory.makeSymbol("GUID-STRING-P");
        $ic36$ = SubLObjectFactory.makeSymbol("RENAME-CONSTANT");
        $ic37$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13498", "CYC"));
        $ic38$ = SubLObjectFactory.makeString("Rename CONSTANT to have NEW-NAME as its name.  The constant is returned.");
        $ic39$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10505", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13498", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $ic40$ = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $ic41$ = SubLObjectFactory.makeString("Return the internal id of CONSTANT.");
        $ic42$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13564", "CYC")));
        $ic43$ = SubLObjectFactory.makeSymbol("S#13564", "CYC");
        $ic44$ = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $ic45$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"));
        $ic46$ = SubLObjectFactory.makeString("Return the constant with internal ID, or NIL if not present.");
        $ic47$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1519", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13564", "CYC")));
        $ic48$ = SubLObjectFactory.makeSymbol("CONSTANT-EXTERNAL-ID");
        $ic49$ = SubLObjectFactory.makeString("Return the external id of CONSTANT.");
        $ic50$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13484", "CYC")));
        $ic51$ = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-EXTERNAL-ID");
        $ic52$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"));
        $ic53$ = SubLObjectFactory.makeString("Return the constant with EXTERNAL-ID, or NIL if not present.");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10596", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13484", "CYC")));
        $ic55$ = SubLObjectFactory.makeSymbol("LISTP");
        $ic56$ = SubLObjectFactory.makeSymbol("CONSTANT-INFO-FROM-GUID-STRINGS");
        $ic57$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13589", "CYC"));
        $ic58$ = SubLObjectFactory.makeString("Returns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name.");
        $ic59$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13589", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic60$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic61$ = SubLObjectFactory.makeSymbol("CONSTANT-INFO-FROM-NAME-STRINGS");
        $ic62$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13590", "CYC"));
        $ic63$ = SubLObjectFactory.makeString("Returns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name.");
        $ic64$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13590", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $ic65$ = ConsesLow.list((SubLObject)module0166.SEVEN_INTEGER, (SubLObject)module0166.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeInteger(1969));
        $ic66$ = SubLObjectFactory.makeSymbol("S#13529", "CYC");
        $ic67$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13591", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13592", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13593", "CYC"));
        $ic68$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13594", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13595", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13596", "CYC"));
        $ic69$ = SubLObjectFactory.makeKeyword("UNNAMED");
        $ic70$ = SubLObjectFactory.makeString("cyc");
        $ic71$ = SubLObjectFactory.makeSymbol("CONSTANT-NAMESPACE");
        $ic72$ = SubLObjectFactory.makeString("Return the namespace to which the constant belongs.");
        $ic73$ = SubLObjectFactory.makeSymbol("CONSTANT-NAME-WITHIN-NAMESPACE");
        $ic74$ = SubLObjectFactory.makeString("Return the constant name within its namespace.");
        $ic75$ = SubLObjectFactory.makeSymbol("TRUE");
        $ic76$ = SubLObjectFactory.makeSymbol("RANDOM-CONSTANT");
        $ic77$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#122", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"))));
        $ic78$ = SubLObjectFactory.makeString("Return a randomly chosen constant that satisfies TEST");
        $ic79$ = SubLObjectFactory.makeInteger(500);
        $ic80$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic81$ = SubLObjectFactory.makeSymbol("S#2322", "CYC");
        $ic82$ = SubLObjectFactory.makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");
        $ic83$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13597", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13598", "CYC"));
        $ic85$ = SubLObjectFactory.makeSymbol("CLET");
        $ic86$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#13587", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#10539", "CYC"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#9675", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("S#13584", "CYC"))));
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0166.class
	Total time: 266 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/