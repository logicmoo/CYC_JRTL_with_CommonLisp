package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0701 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0701";
    public static final String myFingerPrint = "af6f71b812e56d08d6159d4ea1bd03c3cf26231d77c37e8ebe6b7449479c622e";
    private static SubLSymbol $g5495$;
    public static SubLSymbol $g5496$;
    private static SubLSymbol $g5497$;
    public static SubLSymbol $g5498$;
    private static SubLSymbol $g5499$;
    private static SubLSymbol $g5500$;
    private static SubLSymbol $g5501$;
    private static SubLSymbol $g5502$;
    public static SubLSymbol $g5503$;
    private static SubLSymbol $g5504$;
    private static SubLSymbol $g5505$;
    private static SubLSymbol $g5506$;
    public static SubLSymbol $g5507$;
    private static SubLSymbol $g5508$;
    private static SubLSymbol $g5509$;
    private static final SubLString $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLString $ic16$;
    private static final SubLString $ic17$;
    private static final SubLString $ic18$;
    private static final SubLString $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLList $ic37$;
    private static final SubLList $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLList $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLList $ic45$;
    private static final SubLSymbol $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLList $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLList $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLInteger $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLList $ic72$;
    private static final SubLList $ic73$;
    private static final SubLList $ic74$;
    private static final SubLList $ic75$;
    private static final SubLSymbol $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLList $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLSymbol $ic81$;
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
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLString $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLSymbol $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLSymbol $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLString $ic116$;
    private static final SubLString $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLString $ic120$;
    private static final SubLString $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLSymbol $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLSymbol $ic129$;
    private static final SubLSymbol $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLList $ic132$;
    private static final SubLList $ic133$;
    private static final SubLList $ic134$;
    private static final SubLList $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLList $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLString $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLSymbol $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLString $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLObject $ic173$;
    private static final SubLObject $ic174$;
    private static final SubLList $ic175$;
    private static final SubLList $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLList $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    
    
    public static SubLObject f42625() {
        return f42626();
    }
    
    public static SubLObject f42627(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42630(var3) : var3;
        assert NIL != f42631(var4) : var4;
        final SubLObject var6 = f42632(var2, var1);
        final SubLObject var7 = f42632(var3, var1);
        SubLObject var8 = f42632(var4, var1);
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        if (var4.isString() && (NIL != f42633(var7, f42634(var1, module0699.f42551((SubLObject)$ic5$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) || NIL != f42633(var7, f42634(var1, module0699.f42551((SubLObject)$ic6$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))) {
            var8 = f42635(var1, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var11 = f42636(var1);
        SubLObject var12 = (SubLObject)NIL;
        try {
            var12 = ReadWriteLocks.rw_lock_seize_write_lock(var11);
            var5.resetMultipleValues();
            final SubLObject var13_14 = f42637(var1, var6, var7, var8);
            final SubLObject var15_16 = var5.secondMultipleValue();
            var5.resetMultipleValues();
            var9 = var13_14;
            var10 = var15_16;
            if (NIL != var10) {
                module0077.f5326(var9, f42638(var1));
                SubLObject var13 = module0700.f42617(var9);
                SubLObject var14 = (SubLObject)NIL;
                var14 = var13.first();
                while (NIL != var13) {
                    f42639(var1, var14);
                    var13 = var13.rest();
                    var14 = var13.first();
                }
                f42640(f42641(var1), var9);
            }
        }
        finally {
            if (NIL != var12) {
                ReadWriteLocks.rw_lock_release_write_lock(var11);
            }
        }
        return var10;
    }
    
    public static SubLObject f42642(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42630(var3) : var3;
        assert NIL != f42631(var4) : var4;
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = f42636(var1);
        SubLObject var7 = (SubLObject)NIL;
        try {
            var7 = ReadWriteLocks.rw_lock_seize_write_lock(var6);
            var5 = f42643(var1, var2, var3, var4);
            if (NIL != var5) {
                module0077.f5327(var5, f42638(var1));
                f42644(f42641(var1), var5);
                SubLObject var8 = module0700.f42617(var5);
                SubLObject var9 = (SubLObject)NIL;
                var9 = var8.first();
                while (NIL != var8) {
                    if (NIL == f42645(f42641(var1), var9)) {
                        f42646(var1, var9);
                    }
                    var8 = var8.rest();
                    var9 = var8.first();
                }
            }
        }
        finally {
            if (NIL != var7) {
                ReadWriteLocks.rw_lock_release_write_lock(var6);
            }
        }
        return module0035.sublisp_boolean(var5);
    }
    
    public static SubLObject f42647(final SubLObject var1, final SubLObject var9) {
        assert NIL != module0700.f42611(var9, (SubLObject)UNPROVIDED) : var9;
        f42642(var1, module0700.f42612(var9), module0700.f42613(var9), module0700.f42614(var9));
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42648(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42630(var3) : var3;
        assert NIL != f42631(var4) : var4;
        return module0035.sublisp_boolean(f42643(var1, var2, var3, var4));
    }
    
    public static SubLObject f42649(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42630(var3) : var3;
        assert NIL != f42631(var4) : var4;
        return module0035.sublisp_boolean(f42650(var1, var2, var3, var4));
    }
    
    public static SubLObject f42651(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == f42630(var3)) {
            throw new AssertionError(var3);
        }
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = (SubLObject)((NIL != var3) ? ((NIL != module0702.f42828(var3)) ? var3 : f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
        final SubLObject var6 = module0077.f5333(f42652(var1, var2, (SubLObject)$ic8$));
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        for (var7 = module0032.f1741(var6), var8 = (SubLObject)NIL, var8 = module0032.f1742(var7, var6); NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
            var9 = module0032.f1745(var7, var8);
            if (NIL != module0032.f1746(var8, var9) && (NIL == var3 || var5.eql(module0700.f42613(var9)))) {
                var4 = (SubLObject)ConsesLow.cons(module0700.f42616(var9), var4);
            }
        }
        return var4;
    }
    
    public static SubLObject f42653(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == f42630(var3)) {
            throw new AssertionError(var3);
        }
        SubLObject var4 = (SubLObject)NIL;
        final SubLObject var5 = (SubLObject)((NIL != var3) ? ((NIL != module0702.f42828(var3)) ? var3 : f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
        SubLObject var6 = module0077.f5333(f42652(var1, var2, (SubLObject)$ic8$));
        SubLObject var7;
        SubLObject var8;
        SubLObject var9;
        for (var7 = module0032.f1741(var6), var8 = (SubLObject)NIL, var8 = module0032.f1742(var7, var6); NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
            var9 = module0032.f1745(var7, var8);
            if (NIL != module0032.f1746(var8, var9) && (NIL == var3 || var5.eql(module0700.f42613(var9)))) {
                var4 = (SubLObject)ConsesLow.cons(module0700.f42616(var9), var4);
            }
        }
        var6 = module0077.f5333(f42652(var1, var2, (SubLObject)$ic9$));
        for (var7 = module0032.f1741(var6), var8 = (SubLObject)NIL, var8 = module0032.f1742(var7, var6); NIL == module0032.f1744(var7, var8); var8 = module0032.f1743(var8)) {
            var9 = module0032.f1745(var7, var8);
            if (NIL != module0032.f1746(var8, var9) && NIL != f42654(module0700.f42613(var9)) && (NIL == var3 || var5.eql(module0700.f42613(var9)))) {
                var4 = (SubLObject)ConsesLow.cons(module0700.f42616(var9), var4);
            }
        }
        return var4;
    }
    
    public static SubLObject f42655(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var4 = SubLProcess.currentSubLThread();
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == f42630(var3)) {
            throw new AssertionError(var3);
        }
        final SubLObject var5 = (SubLObject)((NIL != var3) ? ((NIL != module0702.f42828(var3)) ? var3 : f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = module0077.f5333(f42652(var1, var2, (SubLObject)$ic8$));
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10) && NIL == module0004.f104(var10, $g5498$.getDynamicValue(var4), (SubLObject)$ic10$, (SubLObject)UNPROVIDED) && (NIL == var3 || var5.eql(module0700.f42613(var10)))) {
                var6 = (SubLObject)ConsesLow.cons(module0700.f42616(var10), var6);
            }
        }
        var7 = module0077.f5333(f42652(var1, var2, (SubLObject)$ic9$));
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10) && NIL != f42654(module0700.f42613(var10)) && (NIL == var3 || var5.eql(module0700.f42613(var10)))) {
                $g5498$.setDynamicValue((SubLObject)ConsesLow.cons(var10, $g5498$.getDynamicValue(var4)), var4);
                var6 = (SubLObject)ConsesLow.cons(module0700.f42615(module0700.f42614(var10), module0700.f42613(var10), module0700.f42612(var10)), var6);
            }
        }
        return var6;
    }
    
    public static SubLObject f42656(final SubLObject var1, final SubLObject var2, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == f42630(var3)) {
            throw new AssertionError(var3);
        }
        final SubLObject var4 = f42652(var1, var2, (SubLObject)$ic8$);
        if (NIL == var3) {
            return module0077.f5311(var4);
        }
        SubLObject var5 = (SubLObject)ZERO_INTEGER;
        final SubLObject var6 = (NIL != module0702.f42828(var3)) ? var3 : f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var7 = module0077.f5333(var4);
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10) && var6.eql(module0700.f42613(var10))) {
                var5 = Numbers.add(var5, (SubLObject)ONE_INTEGER);
            }
        }
        return var5;
    }
    
    public static SubLObject f42657(final SubLObject var1, final SubLObject var3, final SubLObject var4) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42630(var3) : var3;
        assert NIL != f42631(var4) : var4;
        return f42658(var1, var3, (SubLObject)$ic11$, var4, (SubLObject)$ic9$);
    }
    
    public static SubLObject f42659(final SubLObject var1, final SubLObject var3) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42630(var3) : var3;
        return Mapping.mapcar((SubLObject)$ic12$, module0077.f5312(f42652(var1, var3, (SubLObject)$ic11$)));
    }
    
    public static SubLObject f42660(final SubLObject var1, final SubLObject var2, final SubLObject var4) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42631(var4) : var4;
        return f42658(var1, var2, (SubLObject)$ic8$, var4, (SubLObject)$ic9$);
    }
    
    public static SubLObject f42661(final SubLObject var1, final SubLObject var3) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42630(var3) : var3;
        return module0077.f5311(f42652(var1, var3, (SubLObject)$ic11$));
    }
    
    public static SubLObject f42662(final SubLObject var1, final SubLObject var4, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != f42628(var1) : var1;
        assert NIL != f42631(var4) : var4;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == f42630(var3)) {
            throw new AssertionError(var3);
        }
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = (SubLObject)((NIL != var3) ? ((NIL != module0702.f42828(var3)) ? var3 : f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
        final SubLObject var7 = module0077.f5333(f42652(var1, var4, (SubLObject)$ic9$));
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10) && (NIL == var3 || var6.eql(module0700.f42613(var10)))) {
                var5 = (SubLObject)ConsesLow.cons(module0700.f42616(var10), var5);
            }
        }
        return var5;
    }
    
    public static SubLObject f42663(final SubLObject var1, final SubLObject var4, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != f42628(var1) : var1;
        assert NIL != f42631(var4) : var4;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == f42630(var3)) {
            throw new AssertionError(var3);
        }
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = (SubLObject)((NIL != var3) ? ((NIL != module0702.f42828(var3)) ? var3 : f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
        SubLObject var7 = module0077.f5333(f42652(var1, var4, (SubLObject)$ic9$));
        SubLObject var8;
        SubLObject var9;
        SubLObject var10;
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10) && (NIL == var3 || var6.eql(module0700.f42613(var10)))) {
                var5 = (SubLObject)ConsesLow.cons(module0700.f42616(var10), var5);
            }
        }
        var7 = module0077.f5333(f42652(var1, var4, (SubLObject)$ic8$));
        for (var8 = module0032.f1741(var7), var9 = (SubLObject)NIL, var9 = module0032.f1742(var8, var7); NIL == module0032.f1744(var8, var9); var9 = module0032.f1743(var9)) {
            var10 = module0032.f1745(var8, var9);
            if (NIL != module0032.f1746(var9, var10) && NIL != f42654(module0700.f42613(var10)) && (NIL == var3 || var6.eql(module0700.f42613(var10)))) {
                var5 = (SubLObject)ConsesLow.cons(module0700.f42616(var10), var5);
            }
        }
        return var5;
    }
    
    public static SubLObject f42664(final SubLObject var1, final SubLObject var4, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        assert NIL != f42628(var1) : var1;
        assert NIL != f42631(var4) : var4;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == f42630(var3)) {
            throw new AssertionError(var3);
        }
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = (SubLObject)((NIL != var3) ? ((NIL != module0702.f42828(var3)) ? var3 : f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) : NIL);
        final SubLObject var8 = module0077.f5333(f42652(var1, var4, (SubLObject)$ic9$));
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = module0032.f1741(var8), var10 = (SubLObject)NIL, var10 = module0032.f1742(var9, var8); NIL == module0032.f1744(var9, var10); var10 = module0032.f1743(var10)) {
            var11 = module0032.f1745(var9, var10);
            if (NIL != module0032.f1746(var10, var11) && NIL == module0004.f104(var11, $g5498$.getDynamicValue(var5), (SubLObject)$ic10$, (SubLObject)UNPROVIDED) && (NIL == var3 || var7.eql(module0700.f42613(var11)))) {
                var6 = (SubLObject)ConsesLow.cons(module0700.f42616(var11), var6);
            }
        }
        return var6;
    }
    
    public static SubLObject f42665(final SubLObject var1, final SubLObject var2, final SubLObject var3) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42630(var3) : var3;
        return f42658(var1, var2, (SubLObject)$ic8$, var3, (SubLObject)$ic11$);
    }
    
    public static SubLObject f42666(final SubLObject var1, final SubLObject var4, SubLObject var3) {
        if (var3 == UNPROVIDED) {
            var3 = (SubLObject)NIL;
        }
        assert NIL != f42628(var1) : var1;
        assert NIL != f42631(var4) : var4;
        if (NIL != var3 && !areAssertionsDisabledFor(me) && NIL == f42630(var3)) {
            throw new AssertionError(var3);
        }
        final SubLObject var5 = f42652(var1, var4, (SubLObject)$ic9$);
        if (NIL == var3) {
            return module0077.f5311(var5);
        }
        SubLObject var6 = (SubLObject)ZERO_INTEGER;
        final SubLObject var7 = (NIL != module0702.f42828(var3)) ? var3 : f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var8 = module0077.f5333(var5);
        SubLObject var9;
        SubLObject var10;
        SubLObject var11;
        for (var9 = module0032.f1741(var8), var10 = (SubLObject)NIL, var10 = module0032.f1742(var9, var8); NIL == module0032.f1744(var9, var10); var10 = module0032.f1743(var10)) {
            var11 = module0032.f1745(var9, var10);
            if (NIL != module0032.f1746(var10, var11) && var7.eql(module0700.f42613(var11))) {
                var6 = Numbers.add(var6, (SubLObject)ONE_INTEGER);
            }
        }
        return var6;
    }
    
    public static SubLObject f42629(final SubLObject var4) {
        return (SubLObject)makeBoolean(NIL != module0702.f42828(var4) || NIL != module0589.f35907(var4, (SubLObject)UNPROVIDED) || NIL != module0703.f42867(var4));
    }
    
    public static SubLObject f42630(final SubLObject var4) {
        return (SubLObject)makeBoolean(NIL != module0589.f35907(var4, (SubLObject)UNPROVIDED) || NIL != module0702.f42828(var4));
    }
    
    public static SubLObject f42631(final SubLObject var4) {
        return (SubLObject)makeBoolean(NIL != module0702.f42828(var4) || NIL != module0589.f35907(var4, (SubLObject)UNPROVIDED) || NIL != module0704.f42888(var4) || NIL != module0703.f42867(var4));
    }
    
    public static SubLObject f42667(final SubLObject var1, final SubLObject var28) {
        assert NIL != f42628(var1) : var1;
        return f42668(var1, module0699.f42527(), var28);
    }
    
    public static SubLObject f42634(final SubLObject var1, final SubLObject var29, SubLObject var30, SubLObject var28) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        assert NIL != f42628(var1) : var1;
        return module0702.f42814(var29, var30, var28);
    }
    
    public static SubLObject f42669(final SubLObject var1, final SubLObject var29, SubLObject var30, SubLObject var28) {
        if (var30 == UNPROVIDED) {
            var30 = (SubLObject)NIL;
        }
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        return module0035.sublisp_boolean(f42670(var1, module0702.f42814(var29, var30, var28)));
    }
    
    public static SubLObject f42671(final SubLObject var1, final SubLObject var31) {
        SubLObject var32 = (SubLObject)NIL;
        final SubLObject var33 = f42636(var1);
        SubLObject var34 = (SubLObject)NIL;
        try {
            var34 = ReadWriteLocks.rw_lock_seize_read_lock(var33);
            var32 = f42672(var1, var31);
        }
        finally {
            if (NIL != var34) {
                ReadWriteLocks.rw_lock_release_read_lock(var33);
            }
        }
        return var32;
    }
    
    public static SubLObject f42673(final SubLObject var1) {
        return module0703.f42873(f42674());
    }
    
    public static SubLObject f42635(final SubLObject var1, final SubLObject var34, SubLObject var35, SubLObject var36) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var36 == UNPROVIDED) {
            var36 = (SubLObject)NIL;
        }
        assert NIL != Types.stringp(var34) : var34;
        if (NIL != var35 && !areAssertionsDisabledFor(me) && NIL == Types.stringp(var35)) {
            throw new AssertionError(var35);
        }
        if (NIL != var36 && !areAssertionsDisabledFor(me) && NIL == module0704.f42899(var36)) {
            throw new AssertionError(var36);
        }
        SubLObject var37 = (SubLObject)NIL;
        final SubLObject var38 = f42636(var1);
        SubLObject var39 = (SubLObject)NIL;
        try {
            var39 = ReadWriteLocks.rw_lock_seize_read_lock(var38);
            var37 = f42675(var1, var34, var35, var36);
        }
        finally {
            if (NIL != var39) {
                ReadWriteLocks.rw_lock_release_read_lock(var38);
            }
        }
        return var37;
    }
    
    public static SubLObject f42676(final SubLObject var37, final SubLObject var38) {
        return Values.values(f42677(var37, var38), f42677(var38, var37));
    }
    
    public static SubLObject f42677(final SubLObject var37, final SubLObject var38) {
        SubLObject var39 = (SubLObject)NIL;
        final SubLObject var40 = module0077.f5333(f42638(var37));
        SubLObject var41;
        SubLObject var42;
        SubLObject var43;
        for (var41 = module0032.f1741(var40), var42 = (SubLObject)NIL, var42 = module0032.f1742(var41, var40); NIL == module0032.f1744(var41, var42); var42 = module0032.f1743(var42)) {
            var43 = module0032.f1745(var41, var42);
            if (NIL != module0032.f1746(var42, var43) && NIL == f42649(var38, module0700.f42612(var43), module0700.f42613(var43), module0700.f42614(var43))) {
                var39 = (SubLObject)ConsesLow.cons(var43, var39);
            }
        }
        return var39;
    }
    
    public static SubLObject f42678(final SubLObject var40) {
        return (SubLObject)makeBoolean(NIL != module0173.f10955(var40) || NIL != module0702.f42828(var40));
    }
    
    public static SubLObject f42679(final SubLObject var1, final SubLObject var41, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)T;
        }
        assert NIL != f42678(var41) : var41;
        final SubLObject var43 = (NIL != module0702.f42828(var41)) ? var41 : f42680(var1, var41);
        final SubLObject var44 = f42657(var1, module0699.f42531((SubLObject)$ic16$), var43);
        if (NIL != var42) {
            SubLObject var45 = var44;
            SubLObject var46 = f42681(var1, var43, (SubLObject)UNPROVIDED);
            SubLObject var47 = (SubLObject)NIL;
            var47 = var46.first();
            while (NIL != var46) {
                var45 = ConsesLow.nconc(var45, f42679(var1, var47, (SubLObject)NIL));
                var46 = var46.rest();
                var47 = var46.first();
            }
            return Sequences.delete_duplicates(var45, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var44;
    }
    
    public static SubLObject f42680(final SubLObject var1, final SubLObject var47) {
        return f42657(var1, module0708.f43016((SubLObject)$ic17$), module0712.f43677(var47)).first();
    }
    
    public static SubLObject f42682(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0067.f4880(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        final SubLObject var4 = f42657(var1, module0699.f42531((SubLObject)$ic16$), module0708.f43016((SubLObject)$ic18$));
        module0012.$g82$.setDynamicValue((SubLObject)$ic19$, var2);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var2);
        module0012.$g83$.setDynamicValue(Sequences.length(var4), var2);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var2);
        final SubLObject var5 = module0012.$g75$.currentBinding(var2);
        final SubLObject var6 = module0012.$g76$.currentBinding(var2);
        final SubLObject var7 = module0012.$g77$.currentBinding(var2);
        final SubLObject var8 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)NIL, var2);
            module0012.$g77$.bind((SubLObject)T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(module0012.$g82$.getDynamicValue(var2));
            SubLObject var9 = var4;
            SubLObject var10 = (SubLObject)NIL;
            var10 = var9.first();
            while (NIL != var9) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var2), module0012.$g83$.getDynamicValue(var2));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var2), (SubLObject)ONE_INTEGER), var2);
                if (NIL != module0702.f42828(var10)) {
                    final SubLObject var11 = f42666(var1, var10, module0699.f42531((SubLObject)$ic16$));
                    module0084.f5775(var3, var10, var11);
                    f42683(var3, var1, var10, var11, (SubLObject)UNPROVIDED);
                }
                var9 = var9.rest();
                var10 = var9.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var8, var2);
            module0012.$g77$.rebind(var7, var2);
            module0012.$g76$.rebind(var6, var2);
            module0012.$g75$.rebind(var5, var2);
        }
        return Sequences.remove_if((SubLObject)$ic20$, module0084.f5795(var3, Symbols.symbol_function((SubLObject)$ic21$)), Symbols.symbol_function((SubLObject)$ic22$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42683(final SubLObject var48, final SubLObject var1, final SubLObject var55, final SubLObject var25, SubLObject var57) {
        if (var57 == UNPROVIDED) {
            var57 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var58 = f42665(var1, var55, module0699.f42551((SubLObject)$ic23$));
        SubLObject var59 = (SubLObject)NIL;
        var59 = var58.first();
        while (NIL != var58) {
            if (NIL == module0077.f5320(var59, var57)) {
                module0084.f5775(var48, var59, var25);
                module0077.f5326(var59, var57);
                f42683(var48, var1, var59, var25, var57);
            }
            var58 = var58.rest();
            var59 = var58.first();
        }
        return var48;
    }
    
    public static SubLObject f42684(final SubLObject var1, final SubLObject var41) {
        assert NIL != f42678(var41) : var41;
        final SubLObject var42 = (NIL != module0702.f42828(var41)) ? var41 : f42680(var1, var41);
        SubLObject var43 = (SubLObject)ZERO_INTEGER;
        SubLObject var44 = f42681(var1, var42, (SubLObject)T);
        SubLObject var45 = (SubLObject)NIL;
        var45 = var44.first();
        while (NIL != var44) {
            var43 = Numbers.add(var43, f42666(var1, var45, module0699.f42531((SubLObject)$ic16$)));
            var44 = var44.rest();
            var45 = var44.first();
        }
        return var43;
    }
    
    public static SubLObject f42681(final SubLObject var1, final SubLObject var41, SubLObject var42) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)T;
        }
        assert NIL != f42678(var41) : var41;
        final SubLObject var43 = (NIL != module0702.f42828(var41)) ? var41 : f42680(var1, var41);
        if (NIL != var42) {
            return module0077.f5312(f42685(var1, var43, (SubLObject)UNPROVIDED));
        }
        return Sequences.delete_duplicates((SubLObject)ConsesLow.cons(var43, f42657(var1, module0699.f42551((SubLObject)$ic23$), var43)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42685(final SubLObject var1, final SubLObject var43, SubLObject var59) {
        if (var59 == UNPROVIDED) {
            var59 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0077.f5326(var43, var59)) {
            SubLObject var60 = f42681(var1, var43, (SubLObject)NIL);
            SubLObject var61 = (SubLObject)NIL;
            var61 = var60.first();
            while (NIL != var60) {
                f42685(var1, var61, var59);
                var60 = var60.rest();
                var61 = var60.first();
            }
        }
        return var59;
    }
    
    public static SubLObject f42686(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return module0077.f5311(f42638(var1));
    }
    
    public static SubLObject f42687(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return Equality.eql((SubLObject)ZERO_INTEGER, f42686(var1));
    }
    
    public static SubLObject f42688(final SubLObject var60, final SubLObject var61) {
        SubLObject var63;
        final SubLObject var62 = var63 = var60.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic24$);
        final SubLObject var64 = var63.rest();
        var63 = var63.first();
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic24$);
        var65 = var63.first();
        var63 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic24$);
        var66 = var63.first();
        var63 = var63.rest();
        if (NIL == var63) {
            final SubLObject var67;
            var63 = (var67 = var64);
            return (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)$ic26$, var66)), (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var65, (SubLObject)ConsesLow.list((SubLObject)$ic28$, var66)), ConsesLow.append(var67, (SubLObject)NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)$ic24$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42689(final SubLObject var1) {
        return f42636(var1);
    }
    
    public static SubLObject f42690(final SubLObject var1) {
        return module0052.f3689(f42691(f42692(var1)), (SubLObject)$ic30$, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42691(final SubLObject var66) {
        return (SubLObject)ConsesLow.cons((SubLObject)NIL, module0067.f4889(var66));
    }
    
    public static SubLObject f42693(final SubLObject var67) {
        return (SubLObject)makeBoolean(NIL != module0035.f2012(var67.first()) && NIL != module0052.f3687(var67.rest()));
    }
    
    public static SubLObject f42694(final SubLObject var67) {
        SubLObject var68 = (SubLObject)NIL;
        if (NIL != module0035.f2013(var67.first())) {
            var68 = var67.first().first();
            ConsesLow.rplaca(var67, var67.first().rest());
        }
        else {
            final SubLObject var69 = conses_high.second(module0052.f3693(var67.rest()));
            if (var69.isList()) {
                ConsesLow.rplaca(var67, var69.rest());
                var68 = var69.first();
            }
            else {
                var68 = var69;
            }
        }
        return Values.values(var68, var67);
    }
    
    public static SubLObject f42695(final SubLObject var1, final SubLObject var70) {
        final SubLThread var71 = SubLProcess.currentSubLThread();
        assert NIL != f42628(var1) : var1;
        assert NIL != Types.stringp(var70) : var70;
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var71) && NIL != module0075.f5218(var70)) {
            Errors.error((SubLObject)$ic32$, var70);
        }
        SubLObject var72 = (SubLObject)NIL;
        try {
            final SubLObject var73 = stream_macros.$stream_requires_locking$.currentBinding(var71);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)NIL, var71);
                var72 = compatibility.open_text(var70, (SubLObject)$ic33$);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(var73, var71);
            }
            if (!var72.isStream()) {
                Errors.error((SubLObject)$ic34$, var70);
            }
            final SubLObject var72_73 = var72;
            final SubLObject var74 = f42638(var1);
            module0012.$g82$.setDynamicValue(Sequences.cconcatenate((SubLObject)$ic35$, new SubLObject[] { module0006.f205(var70), $ic36$ }), var71);
            module0012.$g73$.setDynamicValue(Time.get_universal_time(), var71);
            module0012.$g83$.setDynamicValue(module0077.f5311(var74), var71);
            module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var71);
            final SubLObject var75 = module0012.$g75$.currentBinding(var71);
            final SubLObject var76 = module0012.$g76$.currentBinding(var71);
            final SubLObject var77 = module0012.$g77$.currentBinding(var71);
            final SubLObject var78 = module0012.$g78$.currentBinding(var71);
            try {
                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var71);
                module0012.$g76$.bind((SubLObject)NIL, var71);
                module0012.$g77$.bind((SubLObject)T, var71);
                module0012.$g78$.bind(Time.get_universal_time(), var71);
                module0012.f478(module0012.$g82$.getDynamicValue(var71));
                final SubLObject var79 = module0077.f5333(var74);
                SubLObject var80;
                SubLObject var81;
                SubLObject var82;
                for (var80 = module0032.f1741(var79), var81 = (SubLObject)NIL, var81 = module0032.f1742(var80, var79); NIL == module0032.f1744(var80, var81); var81 = module0032.f1743(var81)) {
                    var82 = module0032.f1745(var80, var81);
                    if (NIL != module0032.f1746(var81, var82)) {
                        module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var71), module0012.$g83$.getDynamicValue(var71));
                        module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var71), (SubLObject)ONE_INTEGER), var71);
                        module0707.f42987(var82, var72_73);
                    }
                }
                module0012.f479();
            }
            finally {
                module0012.$g78$.rebind(var78, var71);
                module0012.$g77$.rebind(var77, var71);
                module0012.$g76$.rebind(var76, var71);
                module0012.$g75$.rebind(var75, var71);
            }
        }
        finally {
            final SubLObject var83 = Threads.$is_thread_performing_cleanupP$.currentBinding(var71);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var71);
                if (var72.isStream()) {
                    streams_high.close(var72, (SubLObject)UNPROVIDED);
                }
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(var83, var71);
            }
        }
        return var70;
    }
    
    public static SubLObject f42696(final SubLObject var60, final SubLObject var61) {
        SubLObject var63;
        final SubLObject var62 = var63 = var60.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic37$);
        final SubLObject var64 = var63.rest();
        var63 = var63.first();
        SubLObject var65 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic37$);
        var65 = var63.first();
        var63 = var63.rest();
        SubLObject var66 = (SubLObject)NIL;
        SubLObject var67 = var63;
        SubLObject var68 = (SubLObject)NIL;
        SubLObject var81_82 = (SubLObject)NIL;
        while (NIL != var67) {
            cdestructuring_bind.destructuring_bind_must_consp(var67, var62, (SubLObject)$ic37$);
            var81_82 = var67.first();
            var67 = var67.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var67, var62, (SubLObject)$ic37$);
            if (NIL == conses_high.member(var81_82, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var68 = (SubLObject)T;
            }
            if (var81_82 == $ic39$) {
                var66 = var67.first();
            }
            var67 = var67.rest();
        }
        if (NIL != var68 && NIL == var66) {
            cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)$ic37$);
        }
        final SubLObject var69 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var63);
        final SubLObject var70 = (SubLObject)((NIL != var69) ? conses_high.cadr(var69) : NIL);
        final SubLObject var71;
        var63 = (var71 = var64);
        return (SubLObject)ConsesLow.list((SubLObject)$ic25$, (SubLObject)$ic41$, (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var65, (SubLObject)$ic42$, (SubLObject)$ic40$, var70), ConsesLow.append(var71, (SubLObject)NIL)));
    }
    
    public static SubLObject f42697() {
        return module0052.f3709($g5495$.getGlobalValue());
    }
    
    public static SubLObject f42698(final SubLObject var60, final SubLObject var61) {
        SubLObject var63;
        final SubLObject var62 = var63 = var60.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic45$);
        final SubLObject var64 = var63.rest();
        var63 = var63.first();
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic45$);
        var65 = var63.first();
        var63 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic45$);
        var66 = var63.first();
        var63 = var63.rest();
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = var63;
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var90_91 = (SubLObject)NIL;
        while (NIL != var68) {
            cdestructuring_bind.destructuring_bind_must_consp(var68, var62, (SubLObject)$ic45$);
            var90_91 = var68.first();
            var68 = var68.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var68, var62, (SubLObject)$ic45$);
            if (NIL == conses_high.member(var90_91, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var69 = (SubLObject)T;
            }
            if (var90_91 == $ic39$) {
                var67 = var68.first();
            }
            var68 = var68.rest();
        }
        if (NIL != var69 && NIL == var67) {
            cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)$ic45$);
        }
        final SubLObject var70 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var63);
        final SubLObject var71 = (SubLObject)((NIL != var70) ? conses_high.cadr(var70) : NIL);
        final SubLObject var72;
        var63 = (var72 = var64);
        final SubLObject var73 = (SubLObject)$ic46$;
        final SubLObject var74 = (SubLObject)$ic47$;
        return (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list(reader.bq_cons(var74, (SubLObject)$ic49$)), (SubLObject)ConsesLow.list((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var73, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var66), (SubLObject)$ic40$, var71), (SubLObject)ConsesLow.list((SubLObject)$ic48$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var65, (SubLObject)ConsesLow.list((SubLObject)$ic51$, var73))), (SubLObject)ConsesLow.listS((SubLObject)$ic52$, (SubLObject)ConsesLow.list((SubLObject)$ic53$, var65, var74), ConsesLow.append(var72, (SubLObject)NIL)))));
    }
    
    public static SubLObject f42699(final SubLObject var1, SubLObject var94) {
        if (var94 == UNPROVIDED) {
            var94 = (SubLObject)T;
        }
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = (SubLObject)ZERO_INTEGER;
        final SubLObject var97 = module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var98 = f42700(var1);
        SubLObject var101;
        for (SubLObject var99 = (SubLObject)NIL; NIL == var99; var99 = (SubLObject)makeBoolean(NIL == var101)) {
            var95.resetMultipleValues();
            final SubLObject var100 = module0052.f3693(var98);
            var101 = var95.secondMultipleValue();
            var95.resetMultipleValues();
            if (NIL != var101) {
                final SubLObject var102 = module0700.f42612(var100);
                if (NIL != module0077.f5326(var102, var97) && (NIL == var94 || NIL == module0703.f42867(var102))) {
                    var96 = Numbers.add(var96, (SubLObject)ONE_INTEGER);
                }
            }
        }
        return var96;
    }
    
    public static SubLObject f42701(final SubLObject var60, final SubLObject var61) {
        SubLObject var63;
        final SubLObject var62 = var63 = var60.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic54$);
        final SubLObject var64 = var63.rest();
        var63 = var63.first();
        SubLObject var65 = (SubLObject)NIL;
        SubLObject var66 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic54$);
        var65 = var63.first();
        var63 = var63.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var63, var62, (SubLObject)$ic54$);
        var66 = var63.first();
        var63 = var63.rest();
        SubLObject var67 = (SubLObject)NIL;
        SubLObject var68 = var63;
        SubLObject var69 = (SubLObject)NIL;
        SubLObject var106_107 = (SubLObject)NIL;
        while (NIL != var68) {
            cdestructuring_bind.destructuring_bind_must_consp(var68, var62, (SubLObject)$ic54$);
            var106_107 = var68.first();
            var68 = var68.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var68, var62, (SubLObject)$ic54$);
            if (NIL == conses_high.member(var106_107, (SubLObject)$ic38$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var69 = (SubLObject)T;
            }
            if (var106_107 == $ic39$) {
                var67 = var68.first();
            }
            var68 = var68.rest();
        }
        if (NIL != var69 && NIL == var67) {
            cdestructuring_bind.cdestructuring_bind_error(var62, (SubLObject)$ic54$);
        }
        final SubLObject var70 = cdestructuring_bind.property_list_member((SubLObject)$ic40$, var63);
        final SubLObject var71 = (SubLObject)((NIL != var70) ? conses_high.cadr(var70) : NIL);
        final SubLObject var72;
        var63 = (var72 = var64);
        return (SubLObject)ConsesLow.listS((SubLObject)$ic27$, (SubLObject)ConsesLow.list(var65, (SubLObject)ConsesLow.list((SubLObject)$ic50$, var66), (SubLObject)$ic40$, var71), ConsesLow.append(var72, (SubLObject)NIL));
    }
    
    public static SubLObject f42702(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = $g5496$.getGlobalValue();
        SubLObject var113 = (SubLObject)NIL;
        try {
            var113 = ReadWriteLocks.rw_lock_seize_read_lock(var112);
            final SubLObject var114 = f42697();
            SubLObject var117;
            for (SubLObject var115 = var111; NIL == var115; var115 = (SubLObject)makeBoolean(NIL == var117 || NIL != var111)) {
                var110.resetMultipleValues();
                final SubLObject var116 = module0052.f3693(var114);
                var117 = var110.secondMultipleValue();
                var110.resetMultipleValues();
                if (NIL != var117) {
                    var111 = Equality.eql(var109, f42703(var116));
                }
            }
        }
        finally {
            if (NIL != var113) {
                ReadWriteLocks.rw_lock_release_read_lock(var112);
            }
        }
        return var111;
    }
    
    public static SubLObject f42704() {
        return Sequences.length($g5495$.getGlobalValue());
    }
    
    public static SubLObject f42705(SubLObject var111) {
        final SubLThread var112 = SubLProcess.currentSubLThread();
        if (NIL != module0589.f35907(var111, (SubLObject)UNPROVIDED)) {
            var111 = module0702.f42814(var111, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        assert NIL != module0702.f42828(var111) : var111;
        SubLObject var113 = (SubLObject)NIL;
        final SubLObject var114 = $g5496$.getGlobalValue();
        SubLObject var115 = (SubLObject)NIL;
        try {
            var115 = ReadWriteLocks.rw_lock_seize_read_lock(var114);
            var113 = Sequences.find(var111, $g5495$.getGlobalValue(), Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)$ic56$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var113) {
                f42706(var113);
            }
        }
        finally {
            if (NIL != var115) {
                ReadWriteLocks.rw_lock_release_read_lock(var114);
            }
        }
        if (NIL == var113) {
            SubLObject var116 = (SubLObject)NIL;
            try {
                var112.throwStack.push($ic57$);
                final SubLObject var117 = Errors.$error_handler$.currentBinding(var112);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)$ic58$), var112);
                    try {
                        final SubLObject var11_113 = $g5496$.getGlobalValue();
                        SubLObject var12_114 = (SubLObject)NIL;
                        try {
                            var12_114 = ReadWriteLocks.rw_lock_seize_write_lock(var11_113);
                            var113 = module0705.f42916(module0702.f42830(var111), (SubLObject)UNPROVIDED);
                            if (NIL == f42687(var113)) {
                                f42707(var113);
                            }
                        }
                        finally {
                            if (NIL != var12_114) {
                                ReadWriteLocks.rw_lock_release_write_lock(var11_113);
                            }
                        }
                    }
                    catch (Throwable var118) {
                        Errors.handleThrowable(var118, (SubLObject)NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var117, var112);
                }
            }
            catch (Throwable var119) {
                var116 = Errors.handleThrowable(var119, (SubLObject)$ic57$);
            }
            finally {
                var112.throwStack.pop();
            }
        }
        return var113;
    }
    
    public static SubLObject f42708(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        final SubLObject var2 = f42657(var1, module0699.f42531((SubLObject)$ic16$), module0708.f43016((SubLObject)$ic59$));
        return (SubLObject)((NIL != module0035.f1997(var2)) ? var2.first() : NIL);
    }
    
    public static SubLObject f42709(final SubLObject var109, final SubLObject var118, final SubLObject var3) {
        final SubLThread var119 = SubLProcess.currentSubLThread();
        SubLObject var120 = (SubLObject)NIL;
        final SubLObject var121 = $g5496$.getGlobalValue();
        SubLObject var122 = (SubLObject)NIL;
        try {
            var122 = ReadWriteLocks.rw_lock_seize_read_lock(var121);
            final SubLObject var123 = f42697();
            SubLObject var126;
            for (SubLObject var124 = (SubLObject)NIL; NIL == var124; var124 = (SubLObject)makeBoolean(NIL == var126)) {
                var119.resetMultipleValues();
                final SubLObject var125 = module0052.f3693(var123);
                var126 = var119.secondMultipleValue();
                var119.resetMultipleValues();
                if (NIL != var126) {
                    if (var118.eql((SubLObject)ONE_INTEGER)) {
                        if (NIL != module0035.sublisp_boolean(f42665(var125, var109, var3))) {
                            var120 = (SubLObject)ConsesLow.cons(var125, var120);
                        }
                    }
                    else if (var118.eql((SubLObject)TWO_INTEGER) && NIL != module0035.sublisp_boolean(f42657(var125, var3, var109))) {
                        var120 = (SubLObject)ConsesLow.cons(var125, var120);
                    }
                }
            }
        }
        finally {
            if (NIL != var122) {
                ReadWriteLocks.rw_lock_release_read_lock(var121);
            }
        }
        return var120;
    }
    
    public static SubLObject f42710(final SubLObject var3) {
        final SubLThread var4 = SubLProcess.currentSubLThread();
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = $g5496$.getGlobalValue();
        SubLObject var7 = (SubLObject)NIL;
        try {
            var7 = ReadWriteLocks.rw_lock_seize_read_lock(var6);
            final SubLObject var8 = f42697();
            SubLObject var11;
            for (SubLObject var9 = var5; NIL == var9; var9 = (SubLObject)makeBoolean(NIL == var11 || NIL != var5)) {
                var4.resetMultipleValues();
                final SubLObject var10 = module0052.f3693(var8);
                var11 = var4.secondMultipleValue();
                var4.resetMultipleValues();
                if (NIL != var11) {
                    final SubLObject var12 = module0077.f5333(f42652(var10, var3, (SubLObject)$ic11$));
                    SubLObject var13;
                    SubLObject var14;
                    SubLObject var15;
                    for (var13 = module0032.f1741(var12), var14 = (SubLObject)NIL, var14 = module0032.f1742(var13, var12); NIL == var5 && NIL == module0032.f1744(var13, var14); var14 = module0032.f1743(var14)) {
                        var15 = module0032.f1745(var13, var14);
                        if (NIL != module0032.f1746(var14, var15)) {
                            var5 = module0702.f42828(module0700.f42614(var15));
                        }
                    }
                }
            }
        }
        finally {
            if (NIL != var7) {
                ReadWriteLocks.rw_lock_release_read_lock(var6);
            }
        }
        return var5;
    }
    
    public static SubLObject f42711(final SubLObject var109, SubLObject var122) {
        if (var122 == UNPROVIDED) {
            var122 = (SubLObject)$ic60$;
        }
        final SubLThread var123 = SubLProcess.currentSubLThread();
        SubLObject var124 = (SubLObject)ZERO_INTEGER;
        final SubLObject var125 = $g5496$.getGlobalValue();
        SubLObject var126 = (SubLObject)NIL;
        try {
            var126 = ReadWriteLocks.rw_lock_seize_read_lock(var125);
            final SubLObject var127 = f42697();
            SubLObject var130;
            for (SubLObject var128 = (SubLObject)NIL; NIL == var128; var128 = (SubLObject)makeBoolean(NIL == var130)) {
                var123.resetMultipleValues();
                final SubLObject var129 = module0052.f3693(var127);
                var130 = var123.secondMultipleValue();
                var123.resetMultipleValues();
                if (NIL != var130) {
                    if (var122 == $ic60$ || var122 == $ic8$) {
                        var124 = Numbers.add(var124, f42656(var129, var109, (SubLObject)UNPROVIDED));
                    }
                    if (var122 == $ic60$ || var122 == $ic11$) {
                        var124 = Numbers.add(var124, f42661(var129, var109));
                    }
                    if (var122 == $ic60$ || var122 == $ic9$) {
                        var124 = Numbers.add(var124, f42666(var129, var109, (SubLObject)UNPROVIDED));
                    }
                }
            }
        }
        finally {
            if (NIL != var126) {
                ReadWriteLocks.rw_lock_release_read_lock(var125);
            }
        }
        return var124;
    }
    
    public static SubLObject f42668(final SubLObject var1, final SubLObject var123, final SubLObject var124) {
        final SubLThread var125 = SubLProcess.currentSubLThread();
        var125.resetMultipleValues();
        final SubLObject var126 = module0702.f42853(var123, var124);
        final SubLObject var127 = var125.secondMultipleValue();
        final SubLObject var128 = var125.thirdMultipleValue();
        var125.resetMultipleValues();
        return f42634(var1, var126, var127, var128);
    }
    
    public static SubLObject f42706(final SubLObject var125) {
        $g5495$.setGlobalValue((SubLObject)ConsesLow.cons(var125, Sequences.delete(var125, $g5495$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        return $g5495$.getGlobalValue();
    }
    
    public static SubLObject f42707(final SubLObject var125) {
        $g5495$.setGlobalValue((SubLObject)ConsesLow.cons(var125, Sequences.delete(var125, $g5495$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        f42712();
        return $g5495$.getGlobalValue();
    }
    
    public static SubLObject f42713(final SubLObject var1) {
        $g5495$.setGlobalValue(Sequences.delete(var1, $g5495$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        return $g5495$.getGlobalValue();
    }
    
    public static SubLObject f42714(final SubLObject var109) {
        final SubLThread var110 = SubLProcess.currentSubLThread();
        SubLObject var111 = (SubLObject)NIL;
        final SubLObject var112 = $g5496$.getGlobalValue();
        SubLObject var113 = (SubLObject)NIL;
        try {
            var113 = ReadWriteLocks.rw_lock_seize_read_lock(var112);
            final SubLObject var114 = f42697();
            SubLObject var117;
            for (SubLObject var115 = var111; NIL == var115; var115 = (SubLObject)makeBoolean(NIL == var117 || NIL != var111)) {
                var110.resetMultipleValues();
                final SubLObject var116 = module0052.f3693(var114);
                var117 = var110.secondMultipleValue();
                var110.resetMultipleValues();
                if (NIL != var117) {
                    var111 = f42715(var116, var109);
                }
            }
        }
        finally {
            if (NIL != var113) {
                ReadWriteLocks.rw_lock_release_read_lock(var112);
            }
        }
        return var111;
    }
    
    public static SubLObject f42712() {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        if (f42704().numG((SubLObject)ONE_INTEGER)) {
            SubLObject var6 = (SubLObject)ZERO_INTEGER;
            final SubLObject var7 = $g5496$.getGlobalValue();
            SubLObject var8 = (SubLObject)NIL;
            try {
                var8 = ReadWriteLocks.rw_lock_seize_write_lock(var7);
                final SubLObject var32_128 = $g5496$.getGlobalValue();
                SubLObject var33_129 = (SubLObject)NIL;
                try {
                    var33_129 = ReadWriteLocks.rw_lock_seize_read_lock(var32_128);
                    final SubLObject var9 = f42697();
                    SubLObject var12;
                    for (SubLObject var10 = (SubLObject)NIL; NIL == var10; var10 = (SubLObject)makeBoolean(NIL == var12)) {
                        var5.resetMultipleValues();
                        final SubLObject var11 = module0052.f3693(var9);
                        var12 = var5.secondMultipleValue();
                        var5.resetMultipleValues();
                        if (NIL != var12) {
                            var6 = Numbers.add(var6, f42686(var11));
                        }
                    }
                }
                finally {
                    if (NIL != var33_129) {
                        ReadWriteLocks.rw_lock_release_read_lock(var32_128);
                    }
                }
                while (var6.numG($g5499$.getGlobalValue()) && f42704().numG((SubLObject)ONE_INTEGER)) {
                    final SubLObject var13 = module0035.f2114($g5495$.getGlobalValue());
                    var6 = Numbers.subtract(var6, f42686(var13));
                    f42713(var13);
                }
            }
            finally {
                if (NIL != var8) {
                    ReadWriteLocks.rw_lock_release_write_lock(var7);
                }
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42674() {
        return module0057.f4175($g5500$.getGlobalValue());
    }
    
    public static SubLObject f42716() {
        final SubLObject var131 = $g5501$.getGlobalValue();
        if (NIL != var131) {
            module0034.f1818(var131);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42717(final SubLObject var1, final SubLObject var31) {
        return module0034.f1829($g5501$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var31), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42718(final SubLObject var1, final SubLObject var31) {
        final SubLObject var32 = module0703.f42873(var31);
        final SubLObject var33 = f42670(var1, var32);
        return (NIL != var33) ? var33 : var32;
    }
    
    public static SubLObject f42672(final SubLObject var1, final SubLObject var31) {
        SubLObject var32 = $g5501$.getGlobalValue();
        if (NIL == var32) {
            var32 = module0034.f1934((SubLObject)$ic63$, (SubLObject)$ic64$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)TWO_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var33 = module0034.f1782(var1, var31);
        final SubLObject var34 = module0034.f1814(var32, var33, (SubLObject)UNPROVIDED);
        if (var34 != $ic65$) {
            SubLObject var35 = var34;
            SubLObject var36 = (SubLObject)NIL;
            var36 = var35.first();
            while (NIL != var35) {
                SubLObject var37 = var36.first();
                final SubLObject var38 = conses_high.second(var36);
                if (var1.equal(var37.first())) {
                    var37 = var37.rest();
                    if (NIL != var37 && NIL == var37.rest() && var31.equal(var37.first())) {
                        return module0034.f1959(var38);
                    }
                }
                var35 = var35.rest();
                var36 = var35.first();
            }
        }
        final SubLObject var39 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42718(var1, var31)));
        module0034.f1836(var32, var33, var34, var39, (SubLObject)ConsesLow.list(var1, var31));
        return module0034.f1959(var39);
    }
    
    public static SubLObject f42719() {
        final SubLObject var131 = $g5502$.getGlobalValue();
        if (NIL != var131) {
            module0034.f1818(var131);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42720(final SubLObject var1, final SubLObject var34, final SubLObject var35, final SubLObject var36) {
        return module0034.f1829($g5502$.getGlobalValue(), (SubLObject)ConsesLow.list(var1, var34, var35, var36), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42721(final SubLObject var1, final SubLObject var34, final SubLObject var35, final SubLObject var36) {
        final SubLObject var37 = module0704.f42898(var34, var35, var36);
        final SubLObject var38 = f42670(var1, var37);
        return (NIL != var38) ? var38 : var37;
    }
    
    public static SubLObject f42675(final SubLObject var1, final SubLObject var34, final SubLObject var35, final SubLObject var36) {
        SubLObject var37 = $g5502$.getGlobalValue();
        if (NIL == var37) {
            var37 = module0034.f1934((SubLObject)$ic66$, (SubLObject)$ic67$, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)FOUR_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        final SubLObject var38 = module0034.f1780(var1, var34, var35, var36);
        final SubLObject var39 = module0034.f1814(var37, var38, (SubLObject)UNPROVIDED);
        if (var39 != $ic65$) {
            SubLObject var40 = var39;
            SubLObject var41 = (SubLObject)NIL;
            var41 = var40.first();
            while (NIL != var40) {
                SubLObject var42 = var41.first();
                final SubLObject var43 = conses_high.second(var41);
                if (var1.equal(var42.first())) {
                    var42 = var42.rest();
                    if (var34.equal(var42.first())) {
                        var42 = var42.rest();
                        if (var35.equal(var42.first())) {
                            var42 = var42.rest();
                            if (NIL != var42 && NIL == var42.rest() && var36.equal(var42.first())) {
                                return module0034.f1959(var43);
                            }
                        }
                    }
                }
                var40 = var40.rest();
                var41 = var40.first();
            }
        }
        final SubLObject var44 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42721(var1, var34, var35, var36)));
        module0034.f1836(var37, var38, var39, var44, (SubLObject)ConsesLow.list(var1, var34, var35, var36));
        return module0034.f1959(var44);
    }
    
    public static SubLObject f42637(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42630(var3) : var3;
        assert NIL != f42631(var4) : var4;
        final SubLObject var5 = f42643(var1, var2, var3, var4);
        return Values.values((NIL != var5) ? var5 : module0700.f42615(var2, var3, var4), Types.sublisp_null(var5));
    }
    
    public static SubLObject f42643(final SubLObject var1, SubLObject var2, SubLObject var3, SubLObject var4) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42630(var3) : var3;
        assert NIL != f42631(var4) : var4;
        if (NIL != module0589.f35907(var2, (SubLObject)UNPROVIDED)) {
            var2 = f42634(var1, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0589.f35907(var3, (SubLObject)UNPROVIDED)) {
            var3 = f42634(var1, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0589.f35907(var4, (SubLObject)UNPROVIDED)) {
            var4 = f42634(var1, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var5 = (SubLObject)NIL;
        final SubLObject var6 = f42636(var1);
        SubLObject var7 = (SubLObject)NIL;
        try {
            var7 = ReadWriteLocks.rw_lock_seize_read_lock(var6);
            var5 = f42722(f42641(var1), var2, var3, var4, (SubLObject)UNPROVIDED);
        }
        finally {
            if (NIL != var7) {
                ReadWriteLocks.rw_lock_release_read_lock(var6);
            }
        }
        return var5;
    }
    
    public static SubLObject f42650(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var2) : var2;
        assert NIL != f42630(var3) : var3;
        assert NIL != f42631(var4) : var4;
        final SubLObject var5 = f42632(var2, var1);
        final SubLObject var6 = f42632(var3, var1);
        final SubLObject var7 = f42632(var4, var1);
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = f42636(var1);
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = ReadWriteLocks.rw_lock_seize_read_lock(var9);
            var8 = f42722(f42641(var1), var5, var6, var7, (SubLObject)T);
        }
        finally {
            if (NIL != var10) {
                ReadWriteLocks.rw_lock_release_read_lock(var9);
            }
        }
        return var8;
    }
    
    public static SubLObject f42632(final SubLObject var118, final SubLObject var1) {
        SubLObject var119 = var118;
        if (NIL != module0702.f42828(var118)) {
            var119 = module0702.f42830(var118);
        }
        if (var119.isString()) {
            var119 = f42634(var1, var119, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0704.f42888(var118)) {
            final SubLObject var120 = module0704.f42883(var118);
            final SubLObject var121 = (NIL != f42723(var120)) ? module0699.f42584(module0704.f42881(var118)) : module0704.f42881(var118);
            var119 = f42635(var1, var121, module0704.f42882(var118), var120);
        }
        return var119;
    }
    
    public static SubLObject f42723(final SubLObject var36) {
        return (SubLObject)makeBoolean(NIL != module0702.f42828(var36) && module0699.f42531((SubLObject)$ic68$).equal(module0702.f42830(var36)));
    }
    
    public static SubLObject f42658(final SubLObject var1, SubLObject var18, final SubLObject var122, SubLObject var144, SubLObject var145) {
        if (var144 == UNPROVIDED) {
            var144 = (SubLObject)NIL;
        }
        if (var145 == UNPROVIDED) {
            var145 = (SubLObject)NIL;
        }
        SubLObject var146 = (SubLObject)NIL;
        if (NIL != module0589.f35907(var18, (SubLObject)UNPROVIDED)) {
            var18 = f42634(var1, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0589.f35907(var144, (SubLObject)UNPROVIDED)) {
            var144 = f42634(var1, var144, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var147 = f42636(var1);
        SubLObject var148 = (SubLObject)NIL;
        try {
            var148 = ReadWriteLocks.rw_lock_seize_read_lock(var147);
            var146 = f42724(f42641(var1), var18, var122, var144, var145);
        }
        finally {
            if (NIL != var148) {
                ReadWriteLocks.rw_lock_release_read_lock(var147);
            }
        }
        return var146;
    }
    
    public static SubLObject f42652(final SubLObject var1, SubLObject var18, final SubLObject var122) {
        SubLObject var123 = (SubLObject)NIL;
        if (NIL != module0589.f35907(var18, (SubLObject)UNPROVIDED)) {
            var18 = f42634(var1, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var124 = f42636(var1);
        SubLObject var125 = (SubLObject)NIL;
        try {
            var125 = ReadWriteLocks.rw_lock_seize_read_lock(var124);
            var123 = f42725(f42641(var1), var18, var122);
        }
        finally {
            if (NIL != var125) {
                ReadWriteLocks.rw_lock_release_read_lock(var124);
            }
        }
        return var123;
    }
    
    public static SubLObject f42639(final SubLObject var1, final SubLObject var18) {
        final SubLObject var19 = module0067.f4885(f42692(var1), var18, (SubLObject)$ic69$);
        SubLObject var20 = (SubLObject)NIL;
        if ($ic69$ == var19) {
            module0067.f4886(f42692(var1), var18, var18);
            var20 = (SubLObject)T;
        }
        else if (var19.isList()) {
            if (NIL == Sequences.find(var18, var19, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0084.f5762(f42692(var1), var18, var18);
                var20 = (SubLObject)T;
            }
        }
        else if (!var19.eql(var18)) {
            module0067.f4886(f42692(var1), var18, (SubLObject)ConsesLow.list(var19, var18));
            var20 = (SubLObject)T;
        }
        if (NIL != var20) {
            f42726(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42646(final SubLObject var1, final SubLObject var18) {
        final SubLObject var19 = module0067.f4885(f42692(var1), var18, (SubLObject)$ic69$);
        SubLObject var20 = (SubLObject)NIL;
        if (var19.isList()) {
            if (NIL != Sequences.find(var18, var19, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                module0084.f5772(f42692(var1), var18, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var20 = (SubLObject)T;
            }
        }
        else if (var19.eql(var18)) {
            module0067.f4887(f42692(var1), var18);
            var20 = (SubLObject)T;
        }
        if (NIL != var20) {
            f42727(var1);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42670(final SubLObject var1, final SubLObject var18) {
        final SubLObject var19 = module0067.f4885(f42692(var1), var18, (SubLObject)$ic69$);
        if (var19.isList()) {
            return Sequences.find(var18, var19, (SubLObject)$ic70$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != f42633(var19, var18)) {
            return var19;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42633(final SubLObject var150, final SubLObject var151) {
        if (NIL != module0703.f42867(var150) && NIL != module0703.f42867(var151)) {
            return module0703.f42862(var150, var151);
        }
        if (NIL != module0702.f42828(var150) && NIL != module0702.f42828(var151)) {
            return module0702.f42831(var150, var151);
        }
        if (NIL != module0704.f42888(var150) && NIL != module0704.f42888(var151)) {
            return module0704.f42880(var150, var151);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42728(final SubLObject var152, final SubLObject var72) {
        f42729(var152, var72, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42628(final SubLObject var152) {
        return (SubLObject)((var152.getClass() == $sX46651_native.class) ? T : NIL);
    }
    
    public static SubLObject f42730(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField2();
    }
    
    public static SubLObject f42731(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField3();
    }
    
    public static SubLObject f42732(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField4();
    }
    
    public static SubLObject f42733(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField5();
    }
    
    public static SubLObject f42734(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField6();
    }
    
    public static SubLObject f42735(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField7();
    }
    
    public static SubLObject f42736(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField8();
    }
    
    public static SubLObject f42737(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField9();
    }
    
    public static SubLObject f42738(final SubLObject var152) {
        assert NIL != f42628(var152) : var152;
        return var152.getField10();
    }
    
    public static SubLObject f42739(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField2(var154);
    }
    
    public static SubLObject f42740(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField3(var154);
    }
    
    public static SubLObject f42741(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField4(var154);
    }
    
    public static SubLObject f42742(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField5(var154);
    }
    
    public static SubLObject f42743(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField6(var154);
    }
    
    public static SubLObject f42744(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField7(var154);
    }
    
    public static SubLObject f42745(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField8(var154);
    }
    
    public static SubLObject f42746(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField9(var154);
    }
    
    public static SubLObject f42747(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42628(var152) : var152;
        return var152.setField10(var154);
    }
    
    public static SubLObject f42748(SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = (SubLObject)NIL;
        }
        final SubLObject var156 = (SubLObject)new $sX46651_native();
        SubLObject var157;
        SubLObject var158;
        SubLObject var159;
        SubLObject var160;
        for (var157 = (SubLObject)NIL, var157 = var155; NIL != var157; var157 = conses_high.cddr(var157)) {
            var158 = var157.first();
            var159 = conses_high.cadr(var157);
            var160 = var158;
            if (var160.eql((SubLObject)$ic97$)) {
                f42739(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic98$)) {
                f42740(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic99$)) {
                f42741(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic100$)) {
                f42742(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic101$)) {
                f42743(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic102$)) {
                f42744(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic103$)) {
                f42745(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic104$)) {
                f42746(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic105$)) {
                f42747(var156, var159);
            }
            else {
                Errors.error((SubLObject)$ic106$, var158);
            }
        }
        return var156;
    }
    
    public static SubLObject f42749(final SubLObject var160, final SubLObject var161) {
        Functions.funcall(var161, var160, (SubLObject)$ic107$, (SubLObject)$ic108$, (SubLObject)NINE_INTEGER);
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic97$, f42730(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic98$, f42731(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic99$, f42732(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic100$, f42733(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic101$, f42734(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic102$, f42735(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic103$, f42736(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic104$, f42737(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic105$, f42738(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic110$, (SubLObject)$ic108$, (SubLObject)NINE_INTEGER);
        return var160;
    }
    
    public static SubLObject f42750(final SubLObject var160, final SubLObject var161) {
        return f42749(var160, var161);
    }
    
    public static SubLObject f42729(final SubLObject var4, final SubLObject var72, final SubLObject var162) {
        PrintLow.format(var72, (SubLObject)$ic112$, (NIL != f42737(var4)) ? module0702.f42830(f42737(var4)) : f42736(var4));
        return var4;
    }
    
    public static SubLObject f42626() {
        final SubLObject var1 = f42748((SubLObject)UNPROVIDED);
        f42739(var1, module0077.f5313($g5504$.getGlobalValue(), (SubLObject)UNPROVIDED));
        f42740(var1, module0067.f4880(Symbols.symbol_function((SubLObject)EQUALP), (SubLObject)UNPROVIDED));
        f42741(var1, f42751());
        f42742(var1, ReadWriteLocks.new_rw_lock((SubLObject)$ic113$));
        f42743(var1, (SubLObject)ZERO_INTEGER);
        return var1;
    }
    
    public static SubLObject f42638(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return f42730(var1);
    }
    
    public static SubLObject f42700(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return module0077.f5329(f42730(var1));
    }
    
    public static SubLObject f42692(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return f42731(var1);
    }
    
    public static SubLObject f42641(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return f42732(var1);
    }
    
    public static SubLObject f42636(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return f42733(var1);
    }
    
    public static SubLObject f42752(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return f42734(var1);
    }
    
    public static SubLObject f42726(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        f42743(var1, Numbers.add(f42734(var1), (SubLObject)ONE_INTEGER));
        return f42734(var1);
    }
    
    public static SubLObject f42727(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        f42743(var1, Numbers.subtract(f42734(var1), (SubLObject)ONE_INTEGER));
        return f42734(var1);
    }
    
    public static SubLObject f42753(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return f42736(var1);
    }
    
    public static SubLObject f42754(final SubLObject var1, final SubLObject var163) {
        assert NIL != f42628(var1) : var1;
        assert NIL != Types.stringp(var163) : var163;
        f42745(var1, var163);
        return var163;
    }
    
    public static SubLObject f42703(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return f42737(var1);
    }
    
    public static SubLObject f42755(final SubLObject var1, final SubLObject var164) {
        assert NIL != f42628(var1) : var1;
        assert NIL != module0702.f42828(var164) : var164;
        f42746(var1, var164);
        return var164;
    }
    
    public static SubLObject f42756(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return f42738(var1);
    }
    
    public static SubLObject f42757(final SubLObject var1, final SubLObject var165) {
        assert NIL != f42628(var1) : var1;
        assert NIL != f42629(var165) : var165;
        SubLObject var166 = f42738(var1);
        var166 = (SubLObject)ConsesLow.cons(var165, var166);
        f42747(var1, var166);
        return var165;
    }
    
    public static SubLObject f42758(final SubLObject var1) {
        assert NIL != f42628(var1) : var1;
        return conses_high.copy_tree(f42735(var1));
    }
    
    public static SubLObject f42759(final SubLObject var1, final SubLObject var167) {
        SubLObject var168 = var167;
        SubLObject var169 = (SubLObject)NIL;
        var169 = var168.first();
        while (NIL != var168) {
            SubLObject var171;
            final SubLObject var170 = var171 = var169;
            SubLObject var172 = (SubLObject)NIL;
            SubLObject var173 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var171, var170, (SubLObject)$ic115$);
            var172 = var171.first();
            var171 = (var173 = var171.rest());
            if (NIL != module0038.f2684(var172, (SubLObject)$ic116$) || NIL != Strings.stringE(var172, (SubLObject)$ic117$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                final SubLObject var174 = $ic116$.equal(var172) ? module0038.$g916$.getGlobalValue() : module0038.f2674(var172, (SubLObject)$ic118$, (SubLObject)UNPROVIDED);
                f42744(var1, module0035.f2063(f42735(var1), var174, var173, Symbols.symbol_function((SubLObject)EQUAL)));
            }
            var168 = var168.rest();
            var169 = var168.first();
        }
        return f42735(var1);
    }
    
    public static SubLObject f42715(final SubLObject var1, final SubLObject var174) {
        if (NIL == module0702.f42828(var174) && !areAssertionsDisabledFor(me) && NIL == module0589.f35907(var174, (SubLObject)UNPROVIDED)) {
            throw new AssertionError(var174);
        }
        final SubLObject var175 = (NIL != module0702.f42828(var174)) ? module0702.f42830(var174) : var174;
        final SubLObject var176 = module0035.f2029((SubLObject)Characters.CHAR_hash, var175, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var177 = module0035.f2029((SubLObject)Characters.CHAR_slash, var175, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var178 = (NIL != var176) ? ((NIL != var177) ? module0048.f3381((SubLObject)ConsesLow.list(var176, var177), (SubLObject)UNPROVIDED) : var176) : var177;
        final SubLObject var179 = module0038.f2623(var175, (SubLObject)ZERO_INTEGER, (SubLObject)((NIL != var178) ? module0048.f_1X(var178) : NIL));
        SubLObject var180 = module0035.f2305(f42758(var1), var179, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
        if (NIL == var180) {
            var180 = module0699.f42583(var179);
        }
        return (NIL != var180 && !var175.equal(var179)) ? ((NIL != module0038.f2608(var180)) ? module0038.f2674(var175, var179, (SubLObject)UNPROVIDED) : Sequences.cconcatenate(var180, new SubLObject[] { $ic120$, module0038.f2674(var175, var179, (SubLObject)UNPROVIDED) })) : module0702.f42830(var174);
    }
    
    public static SubLObject f42760(final SubLObject var1, final SubLObject var109) {
        SubLObject var110 = (SubLObject)NIL;
        if (NIL == var110) {
            SubLObject var111;
            SubLObject var112;
            for (var111 = module0699.f42577((SubLObject)NIL), var112 = (SubLObject)NIL, var112 = var111.first(); NIL == var110 && NIL != var111; var110 = Sequences.find((SubLObject)$ic121$, f42665(var1, var109, var112), Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var111 = var111.rest(), var112 = var111.first()) {}
        }
        return (SubLObject)((NIL != var110) ? module0704.f42881(var110) : NIL);
    }
    
    public static SubLObject f42761(final SubLObject var1, final SubLObject var109, SubLObject var35, SubLObject var181) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)NIL;
        }
        SubLObject var182 = (SubLObject)NIL;
        SubLObject var183 = (SubLObject)makeBoolean(NIL != var181 && NIL != module0035.f2000(var182, var181, (SubLObject)UNPROVIDED));
        if (NIL == var183) {
            SubLObject var184 = module0699.f42577((SubLObject)T);
            SubLObject var185 = (SubLObject)NIL;
            var185 = var184.first();
            while (NIL == var183 && NIL != var184) {
                if (NIL == var183) {
                    SubLObject var54_184 = f42665(var1, var109, var185);
                    SubLObject var186 = (SubLObject)NIL;
                    var186 = var54_184.first();
                    while (NIL == var183 && NIL != var54_184) {
                        if (NIL == var35 || NIL == module0704.f42882(var186) || var35.equal(module0704.f42882(var186))) {
                            final SubLObject var187 = module0704.f42885(var186);
                            if (NIL == conses_high.member(var187, var182, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var182 = (SubLObject)ConsesLow.cons(var187, var182);
                            }
                            var183 = (SubLObject)makeBoolean(NIL != var181 && NIL != module0035.f2000(var182, var181, (SubLObject)UNPROVIDED));
                        }
                        var54_184 = var54_184.rest();
                        var186 = var54_184.first();
                    }
                }
                var184 = var184.rest();
                var185 = var184.first();
            }
        }
        return var182;
    }
    
    public static SubLObject f42762(final SubLObject var180, SubLObject var186) {
        if (var186 == UNPROVIDED) {
            var186 = (SubLObject)NIL;
        }
        final SubLThread var187 = SubLProcess.currentSubLThread();
        SubLObject var188 = (SubLObject)NIL;
        final SubLObject var189 = $g5496$.getGlobalValue();
        SubLObject var190 = (SubLObject)NIL;
        try {
            var190 = ReadWriteLocks.rw_lock_seize_read_lock(var189);
            final SubLObject var191 = f42697();
            SubLObject var194;
            for (SubLObject var192 = (SubLObject)NIL; NIL == var192; var192 = (SubLObject)makeBoolean(NIL == var194)) {
                var187.resetMultipleValues();
                final SubLObject var193 = module0052.f3693(var191);
                var194 = var187.secondMultipleValue();
                var187.resetMultipleValues();
                if (NIL != var194) {
                    SubLObject var195 = f42763(var193, var180, var186);
                    SubLObject var196 = (SubLObject)NIL;
                    var196 = var195.first();
                    while (NIL != var195) {
                        final SubLObject var197 = var196;
                        if (NIL == conses_high.member(var197, var188, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                            var188 = (SubLObject)ConsesLow.cons(var197, var188);
                        }
                        var195 = var195.rest();
                        var196 = var195.first();
                    }
                }
            }
        }
        finally {
            if (NIL != var190) {
                ReadWriteLocks.rw_lock_release_read_lock(var189);
            }
        }
        return var188;
    }
    
    public static SubLObject f42763(final SubLObject var1, final SubLObject var180, SubLObject var186) {
        if (var186 == UNPROVIDED) {
            var186 = (SubLObject)NIL;
        }
        SubLObject var187 = (SubLObject)NIL;
        SubLObject var188 = module0699.f42577((SubLObject)T);
        SubLObject var189 = (SubLObject)NIL;
        var189 = var188.first();
        while (NIL != var188) {
            SubLObject var17_188 = f42659(var1, var189);
            SubLObject var190 = (SubLObject)NIL;
            var190 = var17_188.first();
            while (NIL != var17_188) {
                final SubLObject var191 = module0700.f42614(var190);
                final SubLObject var192 = (SubLObject)((NIL != module0704.f42888(var191)) ? module0704.f42885(var191) : NIL);
                if (NIL != var192 && NIL != ((NIL != var186) ? Equality.equal(var192, var180) : module0208.f13543(var180, var192, (SubLObject)NIL))) {
                    final SubLObject var193 = module0700.f42612(var190);
                    if (NIL == conses_high.member(var193, var187, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var187 = (SubLObject)ConsesLow.cons(var193, var187);
                    }
                }
                var17_188 = var17_188.rest();
                var190 = var17_188.first();
            }
            var188 = var188.rest();
            var189 = var188.first();
        }
        return var187;
    }
    
    public static SubLObject f42764(final SubLObject var190, SubLObject var35, SubLObject var181, SubLObject var191) {
        if (var35 == UNPROVIDED) {
            var35 = (SubLObject)NIL;
        }
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)NIL;
        }
        if (var191 == UNPROVIDED) {
            var191 = (SubLObject)NIL;
        }
        SubLObject var192 = (SubLObject)NIL;
        SubLObject var193 = (SubLObject)NIL;
        if (NIL == var193) {
            SubLObject var194 = module0699.f42579(var190, (SubLObject)NIL, var191);
            SubLObject var195 = (SubLObject)NIL;
            var195 = var194.first();
            while (NIL == var193 && NIL != var194) {
                if (NIL != module0038.f2684(var195, (SubLObject)$ic123$)) {
                    final SubLObject var196 = f42705(var195);
                    if (NIL != f42628(var196) && NIL == var193) {
                        SubLObject var54_192 = f42761(var196, var195, var35, (SubLObject)UNPROVIDED);
                        SubLObject var197 = (SubLObject)NIL;
                        var197 = var54_192.first();
                        while (NIL == var193 && NIL != var54_192) {
                            final SubLObject var198 = var197;
                            if (NIL == conses_high.member(var198, var192, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                var192 = (SubLObject)ConsesLow.cons(var198, var192);
                            }
                            var193 = (SubLObject)makeBoolean(NIL != var181 && NIL != module0035.f2000(var192, var181, (SubLObject)UNPROVIDED));
                            var54_192 = var54_192.rest();
                            var197 = var54_192.first();
                        }
                    }
                }
                var194 = var194.rest();
                var195 = var194.first();
            }
        }
        return var192;
    }
    
    public static SubLObject f42765(final SubLObject var4) {
        return f42766(var4);
    }
    
    public static SubLObject f42766(final SubLObject var1) {
        return Sxhash.sxhash(f42730(var1));
    }
    
    public static SubLObject f42640(final SubLObject var193, final SubLObject var9) {
        SubLObject var194 = (SubLObject)NIL;
        SubLObject var195_196 = (SubLObject)NIL;
        SubLObject var195 = (SubLObject)NIL;
        SubLObject var198_199 = (SubLObject)NIL;
        var194 = f42767(var193);
        var195_196 = var194.first();
        var195 = module0700.f42617(var9);
        var198_199 = var195.first();
        while (NIL != var195 || NIL != var194) {
            f42768(var195_196, var198_199, var9);
            var194 = var194.rest();
            var195_196 = var194.first();
            var195 = var195.rest();
            var198_199 = var195.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42768(final SubLObject var195, final SubLObject var198, final SubLObject var9) {
        final SubLThread var199 = SubLProcess.currentSubLThread();
        if (NIL != $g5497$.getDynamicValue(var199) || NIL == module0704.f42888(var198)) {
            SubLObject var200 = module0067.f4885(var195, var198, (SubLObject)NIL);
            if (NIL == module0077.f5302(var200)) {
                var200 = module0077.f5313($g5504$.getGlobalValue(), (SubLObject)UNPROVIDED);
                module0067.f4886(var195, var198, var200);
            }
            return module0077.f5326(var9, var200);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42769() {
        final SubLObject var131 = $g5506$.getGlobalValue();
        if (NIL != var131) {
            module0034.f1818(var131);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42770(final SubLObject var200) {
        return module0034.f1829($g5506$.getGlobalValue(), (SubLObject)ConsesLow.list(var200), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42771(final SubLObject var200) {
        return (SubLObject)ConsesLow.list(f42772(var200), f42773(var200), f42774(var200));
    }
    
    public static SubLObject f42767(final SubLObject var200) {
        SubLObject var201 = $g5506$.getGlobalValue();
        if (NIL == var201) {
            var201 = module0034.f1934((SubLObject)$ic125$, (SubLObject)$ic126$, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)ONE_INTEGER, (SubLObject)ZERO_INTEGER);
        }
        SubLObject var202 = module0034.f1814(var201, var200, (SubLObject)$ic65$);
        if (var202 == $ic65$) {
            var202 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42771(var200)));
            module0034.f1816(var201, var200, var202, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var202);
    }
    
    public static SubLObject f42644(final SubLObject var193, final SubLObject var9) {
        f42775(f42772(var193), var9);
        f42776(f42773(var193), var9);
        f42777(f42774(var193), var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42775(final SubLObject var203, final SubLObject var9) {
        final SubLObject var204 = module0700.f42612(var9);
        final SubLObject var205 = module0067.f4885(var203, var204, (SubLObject)NIL);
        return (SubLObject)((NIL != module0077.f5302(var205)) ? module0077.f5327(var9, var205) : NIL);
    }
    
    public static SubLObject f42776(final SubLObject var204, final SubLObject var9) {
        final SubLObject var205 = module0700.f42613(var9);
        final SubLObject var206 = module0067.f4885(var204, var205, (SubLObject)NIL);
        return (SubLObject)((NIL != module0077.f5302(var206)) ? module0077.f5327(var9, var206) : NIL);
    }
    
    public static SubLObject f42777(final SubLObject var205, final SubLObject var9) {
        final SubLObject var206 = module0700.f42614(var9);
        final SubLObject var207 = module0067.f4885(var205, var206, (SubLObject)NIL);
        return (SubLObject)((NIL != module0077.f5302(var207)) ? module0077.f5327(var9, var207) : NIL);
    }
    
    public static SubLObject f42722(final SubLObject var200, final SubLObject var2, final SubLObject var3, final SubLObject var4, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)NIL;
        }
        final SubLObject var207 = f42778(var200, var2);
        final SubLObject var208 = f42779(var200, var3);
        final SubLObject var209 = f42780(var200, var4);
        if (var207.numLE(var208) && (NIL != module0704.f42888(var4) || var207.numLE(var209)) && (NIL == var206 || NIL == module0703.f42867(var2))) {
            return f42781(f42772(var200), var2, var2, var3, var4, var206);
        }
        if (NIL == module0704.f42888(var4) && var209.numLE(var208) && (NIL == var206 || NIL == module0703.f42867(var4))) {
            return f42781(f42774(var200), var4, var2, var3, var4, var206);
        }
        if (NIL == var206 || NIL == module0703.f42867(var3)) {
            return f42781(f42773(var200), var3, var2, var3, var4, var206);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42725(final SubLObject var200, final SubLObject var18, final SubLObject var122) {
        assert NIL != module0700.f42618(var122) : var122;
        SubLObject var201 = (SubLObject)NIL;
        if (var122.eql((SubLObject)$ic8$)) {
            var201 = module0067.f4885(f42772(var200), var18, (SubLObject)UNPROVIDED);
        }
        else if (var122.eql((SubLObject)$ic11$)) {
            var201 = module0067.f4885(f42773(var200), var18, (SubLObject)UNPROVIDED);
        }
        else if (var122.eql((SubLObject)$ic9$)) {
            var201 = module0067.f4885(f42774(var200), var18, (SubLObject)UNPROVIDED);
        }
        return (NIL != var201) ? var201 : module0077.f5313((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f42724(final SubLObject var200, final SubLObject var18, final SubLObject var122, final SubLObject var144, final SubLObject var145) {
        final SubLObject var201 = f42782(var200, var18, var122);
        final SubLObject var202 = f42782(var200, var144, var145);
        if (var201.numLE(var202)) {
            final SubLObject var203 = f42725(var200, var18, var122);
            SubLObject var204 = (SubLObject)NIL;
            final SubLObject var205 = module0077.f5333(var203);
            SubLObject var206;
            SubLObject var207;
            SubLObject var208;
            SubLObject var209;
            for (var206 = module0032.f1741(var205), var207 = (SubLObject)NIL, var207 = module0032.f1742(var206, var205); NIL == module0032.f1744(var206, var207); var207 = module0032.f1743(var207)) {
                var208 = module0032.f1745(var206, var207);
                if (NIL != module0032.f1746(var207, var208) && var144.eql(module0700.f42620(var208, var145))) {
                    var209 = module0700.f42619(var208, var122, var145);
                    if (NIL == conses_high.member(var209, var204, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var204 = (SubLObject)ConsesLow.cons(var209, var204);
                    }
                }
            }
            return var204;
        }
        final SubLObject var203 = f42725(var200, var144, var145);
        SubLObject var204 = (SubLObject)NIL;
        final SubLObject var205 = module0077.f5333(var203);
        SubLObject var206;
        SubLObject var207;
        SubLObject var208;
        SubLObject var209;
        for (var206 = module0032.f1741(var205), var207 = (SubLObject)NIL, var207 = module0032.f1742(var206, var205); NIL == module0032.f1744(var206, var207); var207 = module0032.f1743(var207)) {
            var208 = module0032.f1745(var206, var207);
            if (NIL != module0032.f1746(var207, var208) && var18.eql(module0700.f42620(var208, var122))) {
                var209 = module0700.f42619(var208, var122, var145);
                if (NIL == conses_high.member(var209, var204, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var204 = (SubLObject)ConsesLow.cons(var209, var204);
                }
            }
        }
        return var204;
    }
    
    public static SubLObject f42782(final SubLObject var200, final SubLObject var18, final SubLObject var122) {
        final SubLObject var201 = f42783(var200, var122);
        final SubLObject var202 = module0067.f4885(var201, var18, (SubLObject)NIL);
        return (SubLObject)((NIL != module0077.f5302(var202)) ? module0077.f5311(var202) : ZERO_INTEGER);
    }
    
    public static SubLObject f42783(final SubLObject var200, final SubLObject var122) {
        assert NIL != module0700.f42618(var122) : var122;
        if (var122.eql((SubLObject)$ic8$)) {
            return f42772(var200);
        }
        if (var122.eql((SubLObject)$ic11$)) {
            return f42773(var200);
        }
        if (var122.eql((SubLObject)$ic9$)) {
            return f42774(var200);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42778(final SubLObject var200, final SubLObject var2) {
        return f42782(var200, var2, (SubLObject)$ic8$);
    }
    
    public static SubLObject f42779(final SubLObject var200, final SubLObject var3) {
        return f42782(var200, var3, (SubLObject)$ic11$);
    }
    
    public static SubLObject f42780(final SubLObject var200, final SubLObject var4) {
        final SubLThread var201 = SubLProcess.currentSubLThread();
        if (NIL != $g5497$.getDynamicValue(var201) && NIL != module0704.f42888(var4)) {
            final SubLObject var202 = Functions.apply((SubLObject)$ic128$, Mapping.mapcar((SubLObject)$ic129$, module0067.f4903(f42774(var200))));
            SubLObject var203 = (SubLObject)ZERO_INTEGER;
            SubLObject var204 = var202;
            SubLObject var205 = (SubLObject)NIL;
            var205 = var204.first();
            while (NIL != var204) {
                if (NIL != f42633(var4, module0700.f42614(var205))) {
                    var203 = Numbers.add(var203, (SubLObject)ONE_INTEGER);
                }
                var204 = var204.rest();
                var205 = var204.first();
            }
            return var203;
        }
        return f42782(var200, var4, (SubLObject)$ic9$);
    }
    
    public static SubLObject f42781(final SubLObject var195, final SubLObject var198, final SubLObject var2, final SubLObject var3, final SubLObject var4, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)NIL;
        }
        final SubLObject var207 = module0067.f4885(var195, var198, (SubLObject)NIL);
        SubLObject var208 = (SubLObject)NIL;
        if (NIL != module0077.f5302(var207)) {
            final SubLObject var209 = module0077.f5333(var207);
            SubLObject var210;
            SubLObject var211;
            SubLObject var212;
            for (var210 = module0032.f1741(var209), var211 = (SubLObject)NIL, var211 = module0032.f1742(var210, var209); NIL == var208 && NIL == module0032.f1744(var210, var211); var211 = module0032.f1743(var211)) {
                var212 = module0032.f1745(var210, var211);
                if (NIL != module0032.f1746(var211, var212) && NIL != f42784(module0700.f42612(var212), var2, var206) && NIL != f42784(module0700.f42613(var212), var3, var206) && NIL != ((NIL != module0704.f42888(var4)) ? f42633(module0700.f42614(var212), var4) : f42784(module0700.f42614(var212), var4, var206))) {
                    var208 = var212;
                }
            }
        }
        return var208;
    }
    
    public static SubLObject f42784(final SubLObject var150, final SubLObject var151, SubLObject var206) {
        if (var206 == UNPROVIDED) {
            var206 = (SubLObject)NIL;
        }
        return (SubLObject)makeBoolean((NIL != var206 && NIL != module0703.f42867(var150) && NIL != module0703.f42867(var151)) || NIL != Functions.funcall($g5505$.getGlobalValue(), var150, var151));
    }
    
    public static SubLObject f42645(final SubLObject var200, final SubLObject var18) {
        return (SubLObject)makeBoolean(f42778(var200, var18).isPositive() || f42779(var200, var18).isPositive() || f42780(var200, var18).isPositive());
    }
    
    public static SubLObject f42785(final SubLObject var152, final SubLObject var72) {
        f42786(var152, var72, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42787(final SubLObject var152) {
        return (SubLObject)((var152.getClass() == $sX46654_native.class) ? T : NIL);
    }
    
    public static SubLObject f42788(final SubLObject var152) {
        assert NIL != f42787(var152) : var152;
        return var152.getField2();
    }
    
    public static SubLObject f42789(final SubLObject var152) {
        assert NIL != f42787(var152) : var152;
        return var152.getField3();
    }
    
    public static SubLObject f42790(final SubLObject var152) {
        assert NIL != f42787(var152) : var152;
        return var152.getField4();
    }
    
    public static SubLObject f42791(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42787(var152) : var152;
        return var152.setField2(var154);
    }
    
    public static SubLObject f42792(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42787(var152) : var152;
        return var152.setField3(var154);
    }
    
    public static SubLObject f42793(final SubLObject var152, final SubLObject var154) {
        assert NIL != f42787(var152) : var152;
        return var152.setField4(var154);
    }
    
    public static SubLObject f42794(SubLObject var155) {
        if (var155 == UNPROVIDED) {
            var155 = (SubLObject)NIL;
        }
        final SubLObject var156 = (SubLObject)new $sX46654_native();
        SubLObject var157;
        SubLObject var158;
        SubLObject var159;
        SubLObject var160;
        for (var157 = (SubLObject)NIL, var157 = var155; NIL != var157; var157 = conses_high.cddr(var157)) {
            var158 = var157.first();
            var159 = conses_high.cadr(var157);
            var160 = var158;
            if (var160.eql((SubLObject)$ic145$)) {
                f42791(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic146$)) {
                f42792(var156, var159);
            }
            else if (var160.eql((SubLObject)$ic147$)) {
                f42793(var156, var159);
            }
            else {
                Errors.error((SubLObject)$ic106$, var158);
            }
        }
        return var156;
    }
    
    public static SubLObject f42795(final SubLObject var160, final SubLObject var161) {
        Functions.funcall(var161, var160, (SubLObject)$ic107$, (SubLObject)$ic148$, (SubLObject)THREE_INTEGER);
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic145$, f42788(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic146$, f42789(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic109$, (SubLObject)$ic147$, f42790(var160));
        Functions.funcall(var161, var160, (SubLObject)$ic110$, (SubLObject)$ic148$, (SubLObject)THREE_INTEGER);
        return var160;
    }
    
    public static SubLObject f42796(final SubLObject var160, final SubLObject var161) {
        return f42795(var160, var161);
    }
    
    public static SubLObject f42786(final SubLObject var4, final SubLObject var72, final SubLObject var162) {
        PrintLow.format(var72, (SubLObject)$ic150$);
        return var4;
    }
    
    public static SubLObject f42751() {
        final SubLObject var200 = f42794((SubLObject)UNPROVIDED);
        f42791(var200, module0067.f4880($g5505$.getGlobalValue(), (SubLObject)UNPROVIDED));
        f42792(var200, module0067.f4880($g5505$.getGlobalValue(), (SubLObject)UNPROVIDED));
        f42793(var200, module0067.f4880($g5505$.getGlobalValue(), (SubLObject)UNPROVIDED));
        return var200;
    }
    
    public static SubLObject f42772(final SubLObject var200) {
        assert NIL != f42787(var200) : var200;
        return f42788(var200);
    }
    
    public static SubLObject f42773(final SubLObject var200) {
        assert NIL != f42787(var200) : var200;
        return f42789(var200);
    }
    
    public static SubLObject f42774(final SubLObject var200) {
        assert NIL != f42787(var200) : var200;
        return f42790(var200);
    }
    
    public static SubLObject f42797(final SubLObject var4) {
        return f42798(var4);
    }
    
    public static SubLObject f42798(final SubLObject var200) {
        return Sxhash.sxhash(f42788(var200));
    }
    
    public static SubLObject f42799(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        assert NIL != f42628(var1) : var1;
        SubLObject var3 = module0077.f5312(f42638(var1));
        SubLObject var4 = (SubLObject)NIL;
        var4 = var3.first();
        while (NIL != var3) {
            final SubLObject var5 = module0708.f43035(var1, module0700.f42613(var4));
            final SubLObject var6 = module0708.f43035(var1, module0700.f42612(var4));
            final SubLObject var7 = module0708.f43035(var1, module0700.f42614(var4));
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(var2), (SubLObject)$ic152$, new SubLObject[] { var5, var6, var7 });
            var3 = var3.rest();
            var4 = var3.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42800(final SubLObject var37, final SubLObject var38, SubLObject var219) {
        if (var219 == UNPROVIDED) {
            var219 = (SubLObject)NIL;
        }
        final SubLThread var220 = SubLProcess.currentSubLThread();
        final SubLObject var221 = f42686(var37);
        final SubLObject var222 = f42686(var38);
        final SubLObject var223 = $g5508$.currentBinding(var220);
        try {
            $g5508$.bind((SubLObject)NIL, var220);
            SubLObject var224 = (SubLObject)NIL;
            SubLObject var225 = (SubLObject)NIL;
            SubLObject var226 = (SubLObject)NIL;
            SubLObject var227 = f42700(var37);
            SubLObject var230;
            for (SubLObject var228 = (SubLObject)NIL; NIL == var228; var228 = (SubLObject)makeBoolean(NIL == var230)) {
                var220.resetMultipleValues();
                final SubLObject var229 = module0052.f3693(var227);
                var230 = var220.secondMultipleValue();
                var220.resetMultipleValues();
                if (NIL != var230 && NIL != module0004.f104(module0700.f42612(var229), f42756(var37), (SubLObject)$ic70$, (SubLObject)UNPROVIDED)) {
                    var224 = (SubLObject)ConsesLow.cons(var229, var224);
                }
            }
            var227 = f42700(var38);
            for (SubLObject var228 = (SubLObject)NIL; NIL == var228; var228 = (SubLObject)makeBoolean(NIL == var230)) {
                var220.resetMultipleValues();
                final SubLObject var231 = module0052.f3693(var227);
                var230 = var220.secondMultipleValue();
                var220.resetMultipleValues();
                if (NIL != var230 && NIL != module0004.f104(module0700.f42612(var231), f42756(var38), (SubLObject)$ic70$, (SubLObject)UNPROVIDED)) {
                    var225 = (SubLObject)ConsesLow.cons(var231, var225);
                }
            }
            if (NIL != var219) {
                module0006.f218((SubLObject)T, (SubLObject)$ic153$, var221, f42752(var37), Sequences.length(var224), var222, f42752(var38), Sequences.length(var225), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var50_227 = module0012.$silent_progressP$.currentBinding(var220);
            try {
                module0012.$silent_progressP$.bind((SubLObject)makeBoolean(NIL == var219), var220);
                final SubLObject var233;
                final SubLObject var232 = var233 = module0034.f1854((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                final SubLObject var50_228 = module0034.$g879$.currentBinding(var220);
                try {
                    module0034.$g879$.bind(var233, var220);
                    SubLObject var234 = (SubLObject)NIL;
                    if (NIL != var233 && NIL == module0034.f1842(var233)) {
                        var234 = module0034.f1869(var233);
                        final SubLObject var235 = Threads.current_process();
                        if (NIL == var234) {
                            module0034.f1873(var233, var235);
                        }
                        else if (!var234.eql(var235)) {
                            Errors.error((SubLObject)$ic154$);
                        }
                    }
                    try {
                        final SubLObject var236 = Numbers.multiply(Sequences.length(var224), Sequences.length(var225));
                        SubLObject var237 = (SubLObject)ZERO_INTEGER;
                        if (ZERO_INTEGER.numL(var236)) {
                            final SubLObject var50_229 = module0012.$g75$.currentBinding(var220);
                            final SubLObject var238 = module0012.$g76$.currentBinding(var220);
                            final SubLObject var239 = module0012.$g77$.currentBinding(var220);
                            final SubLObject var240 = module0012.$g78$.currentBinding(var220);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var220);
                                module0012.$g76$.bind((SubLObject)NIL, var220);
                                module0012.$g77$.bind((SubLObject)T, var220);
                                module0012.$g78$.bind(Time.get_universal_time(), var220);
                                module0012.f478(PrintLow.format((SubLObject)NIL, (SubLObject)$ic155$, var236));
                                SubLObject var241 = var224;
                                SubLObject var242 = (SubLObject)NIL;
                                var242 = var241.first();
                                while (NIL != var241) {
                                    SubLObject var243 = Sequences.length(var225);
                                    SubLObject var244 = (SubLObject)NIL;
                                    if (NIL == var244) {
                                        SubLObject var245 = var225;
                                        SubLObject var246 = (SubLObject)NIL;
                                        var246 = var245.first();
                                        while (NIL == var244 && NIL != var245) {
                                            var237 = Numbers.add(var237, (SubLObject)ONE_INTEGER);
                                            var243 = Numbers.subtract(var243, (SubLObject)ONE_INTEGER);
                                            module0012.note_percent_progress(var237, var236);
                                            if (NIL == module0004.f104(var246, $g5508$.getDynamicValue(var220), (SubLObject)$ic10$, (SubLObject)UNPROVIDED) && NIL != f42801(var37, var242, var38, var246)) {
                                                var244 = (SubLObject)T;
                                                var237 = Numbers.add(var237, var243);
                                            }
                                            var245 = var245.rest();
                                            var246 = var245.first();
                                        }
                                    }
                                    var241 = var241.rest();
                                    var242 = var241.first();
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var240, var220);
                                module0012.$g77$.rebind(var239, var220);
                                module0012.$g76$.rebind(var238, var220);
                                module0012.$g75$.rebind(var50_229, var220);
                            }
                        }
                    }
                    finally {
                        final SubLObject var50_230 = Threads.$is_thread_performing_cleanupP$.currentBinding(var220);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var220);
                            final SubLObject var247 = Numbers.multiply(f42686(var37), f42686(var37));
                            SubLObject var248 = (SubLObject)ZERO_INTEGER;
                            final SubLObject var50_231 = module0012.$g75$.currentBinding(var220);
                            final SubLObject var249 = module0012.$g76$.currentBinding(var220);
                            final SubLObject var250 = module0012.$g77$.currentBinding(var220);
                            final SubLObject var251 = module0012.$g78$.currentBinding(var220);
                            try {
                                module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var220);
                                module0012.$g76$.bind((SubLObject)NIL, var220);
                                module0012.$g77$.bind((SubLObject)T, var220);
                                module0012.$g78$.bind(Time.get_universal_time(), var220);
                                module0012.f478(PrintLow.format((SubLObject)NIL, (SubLObject)$ic156$, var247));
                                final SubLObject var252 = f42700(var37);
                                SubLObject var255;
                                for (SubLObject var253 = (SubLObject)NIL; NIL == var253; var253 = (SubLObject)makeBoolean(NIL == var255)) {
                                    var220.resetMultipleValues();
                                    final SubLObject var254 = module0052.f3693(var252);
                                    var255 = var220.secondMultipleValue();
                                    var220.resetMultipleValues();
                                    if (NIL != var255) {
                                        SubLObject var256 = var222;
                                        SubLObject var257 = (SubLObject)NIL;
                                        final SubLObject var96_240 = f42700(var38);
                                        SubLObject var99_242;
                                        for (SubLObject var97_241 = var257; NIL == var97_241; var97_241 = (SubLObject)makeBoolean(NIL == var99_242 || NIL != var257)) {
                                            var220.resetMultipleValues();
                                            final SubLObject var258 = module0052.f3693(var96_240);
                                            var99_242 = var220.secondMultipleValue();
                                            var220.resetMultipleValues();
                                            if (NIL != var99_242 && NIL == module0004.f104(var258, $g5508$.getDynamicValue(var220), (SubLObject)$ic10$, (SubLObject)UNPROVIDED)) {
                                                var248 = Numbers.add(var248, (SubLObject)ONE_INTEGER);
                                                var256 = Numbers.subtract(var256, (SubLObject)ONE_INTEGER);
                                                module0012.note_percent_progress(var248, var247);
                                                if (NIL != f42801(var37, var254, var38, var258)) {
                                                    var226 = (SubLObject)ConsesLow.cons(var254, var226);
                                                    if (NIL != f42654(module0700.f42613(var258))) {
                                                        final SubLObject var259 = module0700.f42615(module0700.f42614(var258), module0700.f42613(var258), module0700.f42612(var258));
                                                        if (NIL != module0004.f104(var259, $g5508$.getDynamicValue(var220), (SubLObject)$ic10$, (SubLObject)UNPROVIDED)) {
                                                            $g5508$.setDynamicValue((SubLObject)ConsesLow.cons(var258, $g5508$.getDynamicValue(var220)), var220);
                                                        }
                                                        else {
                                                            $g5508$.setDynamicValue((SubLObject)ConsesLow.cons(var259, $g5508$.getDynamicValue(var220)), var220);
                                                        }
                                                    }
                                                    else {
                                                        $g5508$.setDynamicValue((SubLObject)ConsesLow.cons(var258, $g5508$.getDynamicValue(var220)), var220);
                                                    }
                                                    var257 = (SubLObject)T;
                                                    var248 = Numbers.add(var248, var256);
                                                }
                                            }
                                        }
                                    }
                                }
                                module0012.f479();
                            }
                            finally {
                                module0012.$g78$.rebind(var251, var220);
                                module0012.$g77$.rebind(var250, var220);
                                module0012.$g76$.rebind(var249, var220);
                                module0012.$g75$.rebind(var50_231, var220);
                            }
                            if (NIL != var233 && NIL == var234) {
                                module0034.f1873(var233, (SubLObject)NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var50_230, var220);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var50_228, var220);
                }
            }
            finally {
                module0012.$silent_progressP$.rebind(var50_227, var220);
            }
            SubLObject var260 = (SubLObject)NIL;
            SubLObject var261 = (SubLObject)NIL;
            SubLObject var262 = f42700(var37);
            SubLObject var265;
            for (SubLObject var263 = (SubLObject)NIL; NIL == var263; var263 = (SubLObject)makeBoolean(NIL == var265)) {
                var220.resetMultipleValues();
                final SubLObject var264 = module0052.f3693(var262);
                var265 = var220.secondMultipleValue();
                var220.resetMultipleValues();
                if (NIL != var265 && NIL == module0004.f104(var264, var226, (SubLObject)$ic157$, (SubLObject)UNPROVIDED)) {
                    var260 = (SubLObject)ConsesLow.cons(var264, var260);
                }
            }
            var262 = f42700(var38);
            for (SubLObject var263 = (SubLObject)NIL; NIL == var263; var263 = (SubLObject)makeBoolean(NIL == var265)) {
                var220.resetMultipleValues();
                final SubLObject var266 = module0052.f3693(var262);
                var265 = var220.secondMultipleValue();
                var220.resetMultipleValues();
                if (NIL != var265 && NIL == module0004.f104(var266, $g5508$.getDynamicValue(var220), (SubLObject)$ic157$, (SubLObject)UNPROVIDED)) {
                    var261 = (SubLObject)ConsesLow.cons(var266, var261);
                }
            }
            return Values.values(var260, var261);
        }
        finally {
            $g5508$.rebind(var223, var220);
        }
    }
    
    public static SubLObject f42801(final SubLObject var37, final SubLObject var225, final SubLObject var38, final SubLObject var226) {
        final SubLThread var227 = SubLProcess.currentSubLThread();
        if (NIL != module0004.f104((SubLObject)ConsesLow.list(var225, var226), $g5509$.getDynamicValue(var227), Symbols.symbol_function((SubLObject)$ic159$), (SubLObject)UNPROVIDED)) {
            return (SubLObject)T;
        }
        return f42802(var37, var225, var38, var226);
    }
    
    public static SubLObject f42803(final SubLObject var246, final SubLObject var247) {
        final SubLObject var248 = var246.first();
        final SubLObject var249 = conses_high.second(var246);
        final SubLObject var250 = var247.first();
        final SubLObject var251 = conses_high.second(var247);
        return (SubLObject)makeBoolean((NIL != module0700.f42621(var248, var250) && NIL != module0700.f42621(var249, var251)) || (NIL != module0700.f42621(var248, var251) && NIL != module0700.f42621(var249, var250)));
    }
    
    public static SubLObject f42804(final SubLObject var37, final SubLObject var225, final SubLObject var38, final SubLObject var226) {
        final SubLThread var227 = SubLProcess.currentSubLThread();
        SubLObject var228 = (SubLObject)NIL;
        if (NIL != f42805(var37, module0700.f42613(var225), var38, module0700.f42613(var226), (SubLObject)UNPROVIDED) && ((NIL != f42805(var37, module0700.f42612(var225), var38, module0700.f42612(var226), (SubLObject)UNPROVIDED) && NIL != f42805(var37, module0700.f42614(var225), var38, module0700.f42614(var226), (SubLObject)UNPROVIDED)) || (NIL != f42654(module0700.f42613(var225)) && NIL != f42805(var37, module0700.f42612(var225), var38, module0700.f42614(var226), (SubLObject)UNPROVIDED) && NIL != f42805(var37, module0700.f42614(var225), var38, module0700.f42612(var226), (SubLObject)UNPROVIDED)))) {
            final SubLObject var229 = $g5509$.currentBinding(var227);
            try {
                $g5509$.bind((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var225, var226), $g5509$.getDynamicValue(var227)), var227);
                var228 = (SubLObject)makeBoolean(NIL != f42805(var37, module0700.f42613(var225), var38, module0700.f42613(var226), (SubLObject)T) && ((NIL != f42805(var37, module0700.f42612(var225), var38, module0700.f42612(var226), (SubLObject)T) && NIL != f42805(var37, module0700.f42614(var225), var38, module0700.f42614(var226), (SubLObject)T)) || (NIL != f42654(module0700.f42613(var225)) && NIL != f42805(var37, module0700.f42612(var225), var38, module0700.f42614(var226), (SubLObject)T) && NIL != f42805(var37, module0700.f42614(var225), var38, module0700.f42612(var226), (SubLObject)T))));
            }
            finally {
                $g5509$.rebind(var229, var227);
            }
        }
        return var228;
    }
    
    public static SubLObject f42802(final SubLObject var37, final SubLObject var225, final SubLObject var38, final SubLObject var226) {
        final SubLThread var227 = SubLProcess.currentSubLThread();
        final SubLObject var228 = module0034.$g879$.getDynamicValue(var227);
        SubLObject var229 = (SubLObject)NIL;
        if (NIL == var228) {
            return f42804(var37, var225, var38, var226);
        }
        var229 = module0034.f1857(var228, (SubLObject)$ic160$, (SubLObject)UNPROVIDED);
        if (NIL == var229) {
            var229 = module0034.f1807(module0034.f1842(var228), (SubLObject)$ic160$, (SubLObject)FOUR_INTEGER, (SubLObject)NIL, (SubLObject)EQ, (SubLObject)UNPROVIDED);
            module0034.f1860(var228, (SubLObject)$ic160$, var229);
        }
        final SubLObject var230 = module0034.f1780(var37, var225, var38, var226);
        final SubLObject var231 = module0034.f1814(var229, var230, (SubLObject)UNPROVIDED);
        if (var231 != $ic65$) {
            SubLObject var232 = var231;
            SubLObject var233 = (SubLObject)NIL;
            var233 = var232.first();
            while (NIL != var232) {
                SubLObject var234 = var233.first();
                final SubLObject var235 = conses_high.second(var233);
                if (var37.eql(var234.first())) {
                    var234 = var234.rest();
                    if (var225.eql(var234.first())) {
                        var234 = var234.rest();
                        if (var38.eql(var234.first())) {
                            var234 = var234.rest();
                            if (NIL != var234 && NIL == var234.rest() && var226.eql(var234.first())) {
                                return module0034.f1959(var235);
                            }
                        }
                    }
                }
                var232 = var232.rest();
                var233 = var232.first();
            }
        }
        final SubLObject var236 = Values.arg2(var227.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42804(var37, var225, var38, var226)));
        module0034.f1836(var229, var230, var231, var236, (SubLObject)ConsesLow.list(var37, var225, var38, var226));
        return module0034.f1959(var236);
    }
    
    public static SubLObject f42806(final SubLObject var18) {
        return (SubLObject)makeBoolean(NIL != f42633(var18, f42807((SubLObject)$ic162$)) || NIL != f42633(var18, f42807((SubLObject)$ic163$)) || NIL != f42633(var18, f42807((SubLObject)$ic164$)) || NIL != f42633(var18, f42807((SubLObject)$ic165$)) || NIL != f42633(var18, f42807((SubLObject)$ic166$)) || NIL != f42633(var18, f42807((SubLObject)$ic167$)));
    }
    
    public static SubLObject f42654(final SubLObject var18) {
        final SubLThread var19 = SubLProcess.currentSubLThread();
        final SubLObject var20 = module0034.$g879$.getDynamicValue(var19);
        SubLObject var21 = (SubLObject)NIL;
        if (NIL == var20) {
            return f42806(var18);
        }
        var21 = module0034.f1857(var20, (SubLObject)$ic161$, (SubLObject)UNPROVIDED);
        if (NIL == var21) {
            var21 = module0034.f1807(module0034.f1842(var20), (SubLObject)$ic161$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var20, (SubLObject)$ic161$, var21);
        }
        SubLObject var22 = module0034.f1814(var21, var18, (SubLObject)$ic65$);
        if (var22 == $ic65$) {
            var22 = Values.arg2(var19.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42806(var18)));
            module0034.f1816(var21, var18, var22, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var22);
    }
    
    public static SubLObject f42808(final SubLObject var225, final SubLObject var226) {
        if (NIL != module0700.f42621(var225, var226)) {
            return (SubLObject)T;
        }
        if (NIL != f42633(module0700.f42613(var225), module0700.f42613(var226)) && NIL != f42654(module0700.f42613(var225)) && NIL != f42633(module0700.f42612(var225), module0700.f42614(var226)) && NIL != f42633(module0700.f42614(var225), module0700.f42612(var226))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42805(final SubLObject var37, final SubLObject var150, final SubLObject var38, final SubLObject var151, SubLObject var261) {
        if (var261 == UNPROVIDED) {
            var261 = (SubLObject)NIL;
        }
        if (NIL != module0712.f43666(var150) && NIL != module0712.f43666(var151)) {
            return Equality.equal(module0699.f42603(var150), module0699.f42603(var151));
        }
        if (NIL != module0702.f42828(var150) && NIL != module0702.f42828(var151) && NIL != module0699.f42602(var150) && NIL != module0699.f42602(var151)) {
            return Equality.equal(module0699.f42602(var150), module0699.f42602(var151));
        }
        if (NIL != module0702.f42828(var150) && NIL != module0702.f42828(var151)) {
            return module0702.f42831(var150, var151);
        }
        if (NIL != module0704.f42888(var150) && NIL != module0704.f42888(var151)) {
            final SubLObject var262 = (SubLObject)((NIL != module0704.f42883(var150)) ? module0699.f42602(module0704.f42883(var150)) : NIL);
            final SubLObject var263 = (SubLObject)((NIL != module0704.f42883(var151)) ? module0699.f42602(module0704.f42883(var151)) : NIL);
            return (SubLObject)makeBoolean(NIL != Strings.stringE(module0704.f42881(var150), module0704.f42881(var151), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && (((NIL == module0704.f42882(var150) || NIL != Strings.stringE((SubLObject)$ic121$, module0704.f42882(var150), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) && (NIL == module0704.f42882(var151) || NIL != Strings.stringE((SubLObject)$ic121$, module0704.f42882(var151), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) || module0704.f42882(var150).equal(module0704.f42882(var151))) && (module0704.f42883(var150).equal(module0704.f42883(var151)) || (NIL != module0173.f10955(var262) && NIL != module0173.f10955(var263) && (var262.equal(var263) || NIL != module0256.f16596(var262, var263, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) || NIL != module0256.f16596(var263, var262, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)))));
        }
        if (NIL != module0703.f42867(var150) && NIL != module0703.f42867(var151)) {
            final SubLObject var264 = f42653(var37, var150, (SubLObject)UNPROVIDED);
            final SubLObject var265 = f42653(var38, var151, (SubLObject)UNPROVIDED);
            final SubLObject var266 = f42663(var37, var150, (SubLObject)UNPROVIDED);
            final SubLObject var267 = f42663(var38, var151, (SubLObject)UNPROVIDED);
            if (NIL == module0035.f2004(var264, var265) || NIL == module0035.f2004(var266, var267)) {
                return (SubLObject)NIL;
            }
            if (NIL == var261) {
                return (SubLObject)T;
            }
            if (NIL != f42809(var37, var264, var38, var265) && NIL != f42809(var37, var266, var38, var267)) {
                return (SubLObject)T;
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42809(final SubLObject var37, final SubLObject var268, final SubLObject var38, final SubLObject var269) {
        if (NIL == module0035.f2004(var268, var269)) {
            return (SubLObject)NIL;
        }
        SubLObject var270 = (SubLObject)ZERO_INTEGER;
        SubLObject var271 = var268;
        SubLObject var272 = (SubLObject)NIL;
        var272 = var271.first();
        while (NIL != var271) {
            SubLObject var273 = (SubLObject)NIL;
            if (NIL == var273) {
                SubLObject var274 = var269;
                SubLObject var275 = (SubLObject)NIL;
                var275 = var274.first();
                while (NIL == var273 && NIL != var274) {
                    if (NIL != f42801(var37, var272, var38, var275)) {
                        var270 = Numbers.add(var270, (SubLObject)ONE_INTEGER);
                        var273 = (SubLObject)T;
                    }
                    var274 = var274.rest();
                    var275 = var274.first();
                }
            }
            if (NIL == var273) {
                return (SubLObject)NIL;
            }
            var271 = var271.rest();
            var272 = var271.first();
        }
        if (var270.eql(Sequences.length(var268))) {
            return (SubLObject)T;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42810(final SubLObject var4) {
        if (NIL != constant_handles_oc.f8449(var4) && (NIL != module0038.f2684(constants_high_oc.f10743(var4), (SubLObject)$ic169$) || NIL != module0038.f2684(constants_high_oc.f10743(var4), (SubLObject)$ic170$) || NIL != module0038.f2684(constants_high_oc.f10743(var4), (SubLObject)$ic171$) || NIL != module0038.f2684(constants_high_oc.f10743(var4), (SubLObject)$ic172$))) {
            return f42807(constants_high_oc.f10743(var4));
        }
        if (NIL != module0173.f10955(var4)) {
            final SubLObject var5 = module0220.f14554(var4, $ic173$, $ic174$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var6 = (SubLObject)(var5.isString() ? module0702.f42814(var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) : NIL);
            if (NIL != module0699.f42536(var6) || NIL != module0699.f42556(var6) || NIL != module0708.f43005(var6) || NIL != module0699.f42546(var6)) {
                return var6;
            }
            return (SubLObject)NIL;
        }
        else {
            if (var4.isString() && NIL != module0038.f2684(var4, (SubLObject)$ic169$) && NIL != constants_high_oc.f10737(var4)) {
                return module0702.f42814(module0708.f43016(module0038.f2674(var4, (SubLObject)$ic169$, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var4.isString() && NIL != module0038.f2684(var4, (SubLObject)$ic170$) && NIL != constants_high_oc.f10737(var4)) {
                return module0702.f42814(module0699.f42531(module0038.f2674(var4, (SubLObject)$ic170$, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (var4.isString() && NIL != module0038.f2684(var4, (SubLObject)$ic171$) && NIL != constants_high_oc.f10737(var4)) {
                return module0702.f42814(module0699.f42551(module0038.f2674(var4, (SubLObject)$ic171$, (SubLObject)UNPROVIDED)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0708.f43032(var4)) {
                return var4;
            }
            if (var4.isString() && NIL != module0038.f2750(var4, (SubLObject)Characters.CHAR_colon)) {
                final SubLObject var7 = module0038.f2738(var4, (SubLObject)$ic175$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0035.f1998(var7) && var7.first().isString() && NIL != module0004.f104(var7.first(), (SubLObject)$ic176$, (SubLObject)$ic177$, (SubLObject)UNPROVIDED) && NIL != module0038.f2653(conses_high.second(var7))) {
                    SubLObject var9;
                    final SubLObject var8 = var9 = var7;
                    SubLObject var10 = (SubLObject)NIL;
                    SubLObject var11 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic178$);
                    var10 = var9.first();
                    var9 = var9.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var9, var8, (SubLObject)$ic178$);
                    var11 = var9.first();
                    var9 = var9.rest();
                    if (NIL == var9) {
                        if (NIL != Strings.stringE(var10, (SubLObject)$ic179$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            return module0702.f42814(module0708.f43016(var11), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(var10, (SubLObject)$ic180$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            return module0702.f42814(module0699.f42531(var11), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(var10, (SubLObject)$ic181$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            return module0702.f42814(module0699.f42551(var11), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != Strings.stringE(var10, (SubLObject)$ic182$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            return module0702.f42814(module0699.f42541(var11), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var8, (SubLObject)$ic178$);
                    }
                }
            }
            else {
                if (var4.isString() && NIL != module0708.f43032(module0702.f42814(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    return module0702.f42814(var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                Errors.error((SubLObject)$ic183$, var4);
            }
            return (SubLObject)NIL;
        }
    }
    
    public static SubLObject f42807(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        final SubLObject var6 = module0034.$g879$.getDynamicValue(var5);
        SubLObject var7 = (SubLObject)NIL;
        if (NIL == var6) {
            return f42810(var4);
        }
        var7 = module0034.f1857(var6, (SubLObject)$ic168$, (SubLObject)UNPROVIDED);
        if (NIL == var7) {
            var7 = module0034.f1807(module0034.f1842(var6), (SubLObject)$ic168$, (SubLObject)ONE_INTEGER, (SubLObject)NIL, (SubLObject)EQUAL, (SubLObject)UNPROVIDED);
            module0034.f1860(var6, (SubLObject)$ic168$, var7);
        }
        SubLObject var8 = module0034.f1814(var7, var4, (SubLObject)$ic65$);
        if (var8 == $ic65$) {
            var8 = Values.arg2(var5.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f42810(var4)));
            module0034.f1816(var7, var4, var8, (SubLObject)UNPROVIDED);
        }
        return module0034.f1959(var8);
    }
    
    public static SubLObject f42811() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42625", "S#46659", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42627", "S#46660", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42642", "S#46524", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42647", "S#46532", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42648", "S#46661", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42649", "S#46662", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42651", "S#46519", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42653", "S#46663", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42655", "S#46664", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42656", "S#46665", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42657", "S#46666", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42659", "S#46528", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42660", "S#46667", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42661", "S#46668", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42662", "S#46530", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42663", "S#46669", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42664", "S#46670", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42665", "S#46671", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42666", "S#46672", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42629", "S#46523", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42630", "S#46527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42631", "S#46529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42667", "S#46673", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42634", "S#46520", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42669", "S#46674", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42671", "S#46675", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42673", "S#46676", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42635", "S#46677", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42676", "S#46678", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42677", "S#46679", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42678", "S#46680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42679", "S#46681", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42680", "S#46682", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42682", "S#46683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42683", "S#46684", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42684", "S#46685", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42681", "S#46686", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42685", "S#46687", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42686", "S#46688", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42687", "S#46689", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0701", "f42688", "S#46690");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42689", "S#46691", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42690", "S#46692", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42691", "S#46693", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42693", "S#46694", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42694", "S#46695", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42695", "S#46696", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0701", "f42696", "S#46697");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42697", "S#46698", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0701", "f42698", "S#46699");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42699", "S#46700", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0701", "f42701", "S#46701");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42702", "S#46702", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42704", "S#46703", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42705", "S#46704", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42708", "S#46705", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42709", "S#46706", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42710", "S#46707", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42711", "S#46708", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42668", "S#46709", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42706", "S#46710", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42707", "S#46711", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42713", "S#46712", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42714", "S#46713", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42712", "S#46714", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42674", "S#46715", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42716", "S#46716", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42717", "S#46717", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42718", "S#46718", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42672", "S#46719", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42719", "S#46720", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42720", "S#46721", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42721", "S#46722", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42675", "S#46723", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42637", "S#46724", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42643", "S#46725", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42650", "S#46726", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42632", "S#46727", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42723", "S#46728", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42658", "S#46729", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42652", "S#46730", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42639", "S#46731", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42646", "S#46732", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42670", "S#46733", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42633", "S#46734", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42728", "S#46735", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42628", "S#46652", 1, 0, false);
        new $f42628$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42730", "S#46736", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42731", "S#46737", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42732", "S#46738", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42733", "S#46739", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42734", "S#46740", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42735", "S#46741", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42736", "S#46742", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42737", "S#46743", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42738", "S#46744", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42739", "S#46745", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42740", "S#46746", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42741", "S#46747", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42742", "S#46748", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42743", "S#46749", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42744", "S#46750", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42745", "S#46751", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42746", "S#46752", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42747", "S#46753", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42748", "S#46754", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42749", "S#46755", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42750", "S#46756", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42729", "S#46757", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42626", "S#46758", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42638", "S#46759", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42700", "S#46760", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42692", "S#46761", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42641", "S#46654", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42636", "S#46762", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42752", "S#46763", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42726", "S#46764", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42727", "S#46765", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42753", "S#46766", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42754", "S#46767", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42703", "S#46768", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42755", "S#46769", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42756", "S#46770", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42757", "S#46771", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42758", "S#46772", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42759", "S#46773", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42715", "S#46774", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42760", "S#46775", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42761", "S#46776", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42762", "S#46777", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42763", "S#46778", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42764", "S#46779", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42765", "S#46780", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42766", "S#46781", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42640", "S#46782", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42768", "S#46783", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42769", "S#46784", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42770", "S#46785", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42771", "S#46786", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42767", "S#46787", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42644", "S#46788", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42775", "S#46789", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42776", "S#46790", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42777", "S#46791", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42722", "S#46792", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42725", "S#46793", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42724", "S#46794", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42782", "S#46795", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42783", "S#46796", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42778", "S#46797", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42779", "S#46798", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42780", "S#46799", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42781", "S#46800", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42784", "S#46801", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42645", "S#46802", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42785", "S#46803", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42787", "S#46655", 1, 0, false);
        new $f42787$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42788", "S#46804", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42789", "S#46805", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42790", "S#46806", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42791", "S#46807", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42792", "S#46808", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42793", "S#46809", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42794", "S#46810", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42795", "S#46811", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42796", "S#46812", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42786", "S#46813", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42751", "S#46814", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42772", "S#46815", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42773", "S#46816", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42774", "S#46817", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42797", "S#46818", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42798", "S#46819", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42799", "S#46820", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42800", "S#46821", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42801", "S#46822", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42803", "S#46823", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42804", "S#46824", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42802", "S#46825", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42806", "S#46826", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42654", "S#46827", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42808", "S#46828", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42805", "S#46829", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42809", "S#46830", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42810", "S#46831", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0701", "f42807", "S#46832", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42812() {
        $g5495$ = SubLFiles.deflexical("S#46833", (SubLObject)NIL);
        $g5496$ = SubLFiles.deflexical("S#46834", ReadWriteLocks.new_rw_lock((SubLObject)$ic0$));
        $g5497$ = SubLFiles.defparameter("S#46835", (SubLObject)NIL);
        $g5498$ = SubLFiles.defparameter("S#46836", (SubLObject)NIL);
        $g5499$ = SubLFiles.deflexical("S#46837", (SubLObject)$ic61$);
        $g5500$ = SubLFiles.deflexical("S#46838", (NIL != Symbols.boundp((SubLObject)$ic62$)) ? $g5500$.getGlobalValue() : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g5501$ = SubLFiles.deflexical("S#46839", (SubLObject)NIL);
        $g5502$ = SubLFiles.deflexical("S#46840", (SubLObject)NIL);
        $g5503$ = SubLFiles.defconstant("S#46841", (SubLObject)$ic71$);
        $g5504$ = SubLFiles.deflexical("S#46842", Symbols.symbol_function((SubLObject)EQ));
        $g5505$ = SubLFiles.deflexical("S#46843", Symbols.symbol_function((SubLObject)EQ));
        $g5506$ = SubLFiles.deflexical("S#46844", (SubLObject)NIL);
        $g5507$ = SubLFiles.defconstant("S#46845", (SubLObject)$ic130$);
        $g5508$ = SubLFiles.defparameter("S#46846", (SubLObject)NIL);
        $g5509$ = SubLFiles.defparameter("S#46847", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f42813() {
        module0002.f50((SubLObject)$ic26$, (SubLObject)$ic29$);
        module0002.f50((SubLObject)$ic28$, (SubLObject)$ic29$);
        module0012.f419((SubLObject)$ic30$);
        module0012.f419((SubLObject)$ic31$);
        module0002.f50((SubLObject)$ic43$, (SubLObject)$ic44$);
        module0003.f57((SubLObject)$ic62$);
        module0034.f1909((SubLObject)$ic63$);
        module0034.f1909((SubLObject)$ic66$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5503$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic77$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic78$);
        Structures.def_csetf((SubLObject)$ic79$, (SubLObject)$ic80$);
        Structures.def_csetf((SubLObject)$ic81$, (SubLObject)$ic82$);
        Structures.def_csetf((SubLObject)$ic83$, (SubLObject)$ic84$);
        Structures.def_csetf((SubLObject)$ic85$, (SubLObject)$ic86$);
        Structures.def_csetf((SubLObject)$ic87$, (SubLObject)$ic88$);
        Structures.def_csetf((SubLObject)$ic89$, (SubLObject)$ic90$);
        Structures.def_csetf((SubLObject)$ic91$, (SubLObject)$ic92$);
        Structures.def_csetf((SubLObject)$ic93$, (SubLObject)$ic94$);
        Structures.def_csetf((SubLObject)$ic95$, (SubLObject)$ic96$);
        Equality.identity((SubLObject)$ic71$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5503$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic111$));
        module0012.f419((SubLObject)$ic76$);
        module0002.f50((SubLObject)$ic50$, (SubLObject)$ic114$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5503$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic124$));
        module0034.f1909((SubLObject)$ic125$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5507$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic137$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic138$);
        Structures.def_csetf((SubLObject)$ic139$, (SubLObject)$ic140$);
        Structures.def_csetf((SubLObject)$ic141$, (SubLObject)$ic142$);
        Structures.def_csetf((SubLObject)$ic143$, (SubLObject)$ic144$);
        Equality.identity((SubLObject)$ic130$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5507$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic149$));
        module0012.f419((SubLObject)$ic136$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5507$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic151$));
        module0034.f1895((SubLObject)$ic160$);
        module0034.f1895((SubLObject)$ic161$);
        module0034.f1895((SubLObject)$ic168$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f42811();
    }
    
    public void initializeVariables() {
        f42812();
    }
    
    public void runTopLevelForms() {
        f42813();
    }
    
    static {
        me = (SubLFile)new module0701();
        $g5495$ = null;
        $g5496$ = null;
        $g5497$ = null;
        $g5498$ = null;
        $g5499$ = null;
        $g5500$ = null;
        $g5501$ = null;
        $g5502$ = null;
        $g5503$ = null;
        $g5504$ = null;
        $g5505$ = null;
        $g5506$ = null;
        $g5507$ = null;
        $g5508$ = null;
        $g5509$ = null;
        $ic0$ = makeString("Loaded RDF Graphs");
        $ic1$ = makeSymbol("S#46652", "CYC");
        $ic2$ = makeSymbol("S#46523", "CYC");
        $ic3$ = makeSymbol("S#46527", "CYC");
        $ic4$ = makeSymbol("S#46529", "CYC");
        $ic5$ = makeString("label");
        $ic6$ = makeString("comment");
        $ic7$ = makeSymbol("S#46531", "CYC");
        $ic8$ = makeKeyword("SUBJECT");
        $ic9$ = makeKeyword("OBJECT");
        $ic10$ = makeSymbol("S#46638", "CYC");
        $ic11$ = makeKeyword("PREDICATE");
        $ic12$ = makeSymbol("S#46633", "CYC");
        $ic13$ = makeSymbol("STRINGP");
        $ic14$ = makeSymbol("S#46641", "CYC");
        $ic15$ = makeSymbol("S#46680", "CYC");
        $ic16$ = makeString("type");
        $ic17$ = makeString("sameAs");
        $ic18$ = makeString("Class");
        $ic19$ = makeString("Ranking classes by transitive instance count...");
        $ic20$ = makeSymbol("ZEROP");
        $ic21$ = makeSymbol(">");
        $ic22$ = makeSymbol("CDR");
        $ic23$ = makeString("subClassOf");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#9182", "CYC"), (SubLObject)makeSymbol("S#10129", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic25$ = makeSymbol("S#3019", "CYC");
        $ic26$ = makeSymbol("S#46691", "CYC");
        $ic27$ = makeSymbol("S#5129", "CYC");
        $ic28$ = makeSymbol("S#46692", "CYC");
        $ic29$ = makeSymbol("S#46690", "CYC");
        $ic30$ = makeSymbol("S#46694", "CYC");
        $ic31$ = makeSymbol("S#46695", "CYC");
        $ic32$ = makeString("~S already exists.");
        $ic33$ = makeKeyword("OUTPUT");
        $ic34$ = makeString("Unable to open ~S");
        $ic35$ = makeString("Dumping RDF graph to ");
        $ic36$ = makeString("...");
        $ic37$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#10129", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic38$ = ConsesLow.list((SubLObject)makeKeyword("DONE"));
        $ic39$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic40$ = makeKeyword("DONE");
        $ic41$ = ConsesLow.list((SubLObject)makeSymbol("S#46834", "CYC"));
        $ic42$ = ConsesLow.list((SubLObject)makeSymbol("S#46698", "CYC"));
        $ic43$ = makeSymbol("S#46698", "CYC");
        $ic44$ = makeSymbol("S#46697", "CYC");
        $ic45$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#4566", "CYC"), (SubLObject)makeSymbol("S#10129", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic46$ = makeUninternedSymbol("US#35BC6C1");
        $ic47$ = makeUninternedSymbol("US#30DF01F");
        $ic48$ = makeSymbol("CLET");
        $ic49$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("NEW-SET")));
        $ic50$ = makeSymbol("S#46760", "CYC");
        $ic51$ = makeSymbol("S#46525", "CYC");
        $ic52$ = makeSymbol("PWHEN");
        $ic53$ = makeSymbol("SET-ADD");
        $ic54$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#46848", "CYC"), (SubLObject)makeSymbol("S#10129", "CYC"), (SubLObject)makeSymbol("&KEY"), (SubLObject)makeSymbol("S#127", "CYC")), (SubLObject)makeSymbol("&BODY"), (SubLObject)makeSymbol("S#5", "CYC"));
        $ic55$ = makeSymbol("S#46508", "CYC");
        $ic56$ = makeSymbol("S#46768", "CYC");
        $ic57$ = makeKeyword("IGNORE-ERRORS-TARGET");
        $ic58$ = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $ic59$ = makeString("Ontology");
        $ic60$ = makeKeyword("ALL");
        $ic61$ = makeInteger(10000);
        $ic62$ = makeSymbol("S#46838", "CYC");
        $ic63$ = makeSymbol("S#46719", "CYC");
        $ic64$ = makeSymbol("S#46839", "CYC");
        $ic65$ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic66$ = makeSymbol("S#46723", "CYC");
        $ic67$ = makeSymbol("S#46840", "CYC");
        $ic68$ = makeString("XMLLiteral");
        $ic69$ = makeKeyword("NOT-FOUND");
        $ic70$ = makeSymbol("S#46734", "CYC");
        $ic71$ = makeSymbol("S#46651", "CYC");
        $ic72$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#46849", "CYC"), makeSymbol("S#2953", "CYC"), makeSymbol("S#134", "CYC"), makeSymbol("S#672", "CYC"), makeSymbol("S#46850", "CYC"), makeSymbol("S#46851", "CYC"), makeSymbol("S#46852", "CYC"), makeSymbol("S#43314", "CYC"), makeSymbol("S#46853", "CYC") });
        $ic73$ = ConsesLow.list(new SubLObject[] { makeKeyword("TRIPLES"), makeKeyword("NODES"), makeKeyword("INDEX"), makeKeyword("LOCK"), makeKeyword("NODE-COUNT"), makeKeyword("PREFIX-MAP"), makeKeyword("FILE-LOCATION"), makeKeyword("TOPIC"), makeKeyword("FOCAL-NODES") });
        $ic74$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#46736", "CYC"), makeSymbol("S#46737", "CYC"), makeSymbol("S#46738", "CYC"), makeSymbol("S#46739", "CYC"), makeSymbol("S#46740", "CYC"), makeSymbol("S#46741", "CYC"), makeSymbol("S#46742", "CYC"), makeSymbol("S#46743", "CYC"), makeSymbol("S#46744", "CYC") });
        $ic75$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#46745", "CYC"), makeSymbol("S#46746", "CYC"), makeSymbol("S#46747", "CYC"), makeSymbol("S#46748", "CYC"), makeSymbol("S#46749", "CYC"), makeSymbol("S#46750", "CYC"), makeSymbol("S#46751", "CYC"), makeSymbol("S#46752", "CYC"), makeSymbol("S#46753", "CYC") });
        $ic76$ = makeSymbol("S#46757", "CYC");
        $ic77$ = makeSymbol("S#46735", "CYC");
        $ic78$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#46652", "CYC"));
        $ic79$ = makeSymbol("S#46736", "CYC");
        $ic80$ = makeSymbol("S#46745", "CYC");
        $ic81$ = makeSymbol("S#46737", "CYC");
        $ic82$ = makeSymbol("S#46746", "CYC");
        $ic83$ = makeSymbol("S#46738", "CYC");
        $ic84$ = makeSymbol("S#46747", "CYC");
        $ic85$ = makeSymbol("S#46739", "CYC");
        $ic86$ = makeSymbol("S#46748", "CYC");
        $ic87$ = makeSymbol("S#46740", "CYC");
        $ic88$ = makeSymbol("S#46749", "CYC");
        $ic89$ = makeSymbol("S#46741", "CYC");
        $ic90$ = makeSymbol("S#46750", "CYC");
        $ic91$ = makeSymbol("S#46742", "CYC");
        $ic92$ = makeSymbol("S#46751", "CYC");
        $ic93$ = makeSymbol("S#46743", "CYC");
        $ic94$ = makeSymbol("S#46752", "CYC");
        $ic95$ = makeSymbol("S#46744", "CYC");
        $ic96$ = makeSymbol("S#46753", "CYC");
        $ic97$ = makeKeyword("TRIPLES");
        $ic98$ = makeKeyword("NODES");
        $ic99$ = makeKeyword("INDEX");
        $ic100$ = makeKeyword("LOCK");
        $ic101$ = makeKeyword("NODE-COUNT");
        $ic102$ = makeKeyword("PREFIX-MAP");
        $ic103$ = makeKeyword("FILE-LOCATION");
        $ic104$ = makeKeyword("TOPIC");
        $ic105$ = makeKeyword("FOCAL-NODES");
        $ic106$ = makeString("Invalid slot ~S for construction function");
        $ic107$ = makeKeyword("BEGIN");
        $ic108$ = makeSymbol("S#46754", "CYC");
        $ic109$ = makeKeyword("SLOT");
        $ic110$ = makeKeyword("END");
        $ic111$ = makeSymbol("S#46756", "CYC");
        $ic112$ = makeString("<RDF-GRAPH ~A>");
        $ic113$ = makeString("RDF GRAPH");
        $ic114$ = makeSymbol("S#46699", "CYC");
        $ic115$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#1737", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic116$ = makeString("xmlns");
        $ic117$ = makeString("xml:base");
        $ic118$ = makeString("xmlns:");
        $ic119$ = makeSymbol("S#39641", "CYC");
        $ic120$ = makeString(":");
        $ic121$ = makeString("en");
        $ic122$ = makeSymbol("S#46647", "CYC");
        $ic123$ = makeString("http");
        $ic124$ = makeSymbol("S#46780", "CYC");
        $ic125$ = makeSymbol("S#46787", "CYC");
        $ic126$ = makeSymbol("S#46844", "CYC");
        $ic127$ = makeSymbol("S#46635", "CYC");
        $ic128$ = makeSymbol("APPEND");
        $ic129$ = makeSymbol("S#3290", "CYC");
        $ic130$ = makeSymbol("S#46654", "CYC");
        $ic131$ = makeSymbol("S#46655", "CYC");
        $ic132$ = ConsesLow.list((SubLObject)makeSymbol("S#46854", "CYC"), (SubLObject)makeSymbol("S#46855", "CYC"), (SubLObject)makeSymbol("S#46856", "CYC"));
        $ic133$ = ConsesLow.list((SubLObject)makeKeyword("SUBJECT-INDEX"), (SubLObject)makeKeyword("PREDICATE-INDEX"), (SubLObject)makeKeyword("OBJECT-INDEX"));
        $ic134$ = ConsesLow.list((SubLObject)makeSymbol("S#46804", "CYC"), (SubLObject)makeSymbol("S#46805", "CYC"), (SubLObject)makeSymbol("S#46806", "CYC"));
        $ic135$ = ConsesLow.list((SubLObject)makeSymbol("S#46807", "CYC"), (SubLObject)makeSymbol("S#46808", "CYC"), (SubLObject)makeSymbol("S#46809", "CYC"));
        $ic136$ = makeSymbol("S#46813", "CYC");
        $ic137$ = makeSymbol("S#46803", "CYC");
        $ic138$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#46655", "CYC"));
        $ic139$ = makeSymbol("S#46804", "CYC");
        $ic140$ = makeSymbol("S#46807", "CYC");
        $ic141$ = makeSymbol("S#46805", "CYC");
        $ic142$ = makeSymbol("S#46808", "CYC");
        $ic143$ = makeSymbol("S#46806", "CYC");
        $ic144$ = makeSymbol("S#46809", "CYC");
        $ic145$ = makeKeyword("SUBJECT-INDEX");
        $ic146$ = makeKeyword("PREDICATE-INDEX");
        $ic147$ = makeKeyword("OBJECT-INDEX");
        $ic148$ = makeSymbol("S#46810", "CYC");
        $ic149$ = makeSymbol("S#46812", "CYC");
        $ic150$ = makeString("<RDF-GRAPH-INDEX>");
        $ic151$ = makeSymbol("S#46818", "CYC");
        $ic152$ = makeString("~&  (~A ~A ~A)~%");
        $ic153$ = makeString("Comparing graph1 (~A triples, ~A nodes, ~A focal)~%  against graph2 (~A triples, ~A nodes, ~A focal)~%");
        $ic154$ = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic155$ = makeString("Comparing focal nodes (~A compares)...");
        $ic156$ = makeString("Comparing all nodes (~A compares)...");
        $ic157$ = makeSymbol("S#46828", "CYC");
        $ic158$ = makeSymbol("S#5859", "CYC");
        $ic159$ = makeSymbol("S#46823", "CYC");
        $ic160$ = makeSymbol("S#46825", "CYC");
        $ic161$ = makeSymbol("S#46827", "CYC");
        $ic162$ = makeString("owl:complementOf");
        $ic163$ = makeString("owl:disjointWith");
        $ic164$ = makeString("owl:equivalentClass");
        $ic165$ = makeString("owl:equivalentProperty");
        $ic166$ = makeString("owl:incompatibleWith");
        $ic167$ = makeString("owl:inverseOf");
        $ic168$ = makeSymbol("S#46832", "CYC");
        $ic169$ = makeString("owl:");
        $ic170$ = makeString("rdf:");
        $ic171$ = makeString("rdfs:");
        $ic172$ = makeString("xsd:");
        $ic173$ = constant_handles_oc.f8479((SubLObject)makeString("rdfURI"));
        $ic174$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic175$ = ConsesLow.list((SubLObject)makeString(":"));
        $ic176$ = ConsesLow.list((SubLObject)makeString("owl"), (SubLObject)makeString("rdf"), (SubLObject)makeString("rdfs"), (SubLObject)makeString("xsd"));
        $ic177$ = makeSymbol("STRING=");
        $ic178$ = ConsesLow.list((SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("S#46857", "CYC"));
        $ic179$ = makeString("owl");
        $ic180$ = makeString("rdf");
        $ic181$ = makeString("rdfs");
        $ic182$ = makeString("xsd");
        $ic183$ = makeString("get-known-uri called with unhandled object ~S");
    }
    
    public static final class $sX46651_native extends SubLStructNative
    {
        public SubLObject $triples;
        public SubLObject $nodes;
        public SubLObject $index;
        public SubLObject $lock;
        public SubLObject $node_count;
        public SubLObject $prefix_map;
        public SubLObject $file_location;
        public SubLObject $topic;
        public SubLObject $focal_nodes;
        public static final SubLStructDeclNative structDecl;
        
        public $sX46651_native() {
            this.$triples = (SubLObject)CommonSymbols.NIL;
            this.$nodes = (SubLObject)CommonSymbols.NIL;
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$node_count = (SubLObject)CommonSymbols.NIL;
            this.$prefix_map = (SubLObject)CommonSymbols.NIL;
            this.$file_location = (SubLObject)CommonSymbols.NIL;
            this.$topic = (SubLObject)CommonSymbols.NIL;
            this.$focal_nodes = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$triples;
        }
        
        public SubLObject getField3() {
            return this.$nodes;
        }
        
        public SubLObject getField4() {
            return this.$index;
        }
        
        public SubLObject getField5() {
            return this.$lock;
        }
        
        public SubLObject getField6() {
            return this.$node_count;
        }
        
        public SubLObject getField7() {
            return this.$prefix_map;
        }
        
        public SubLObject getField8() {
            return this.$file_location;
        }
        
        public SubLObject getField9() {
            return this.$topic;
        }
        
        public SubLObject getField10() {
            return this.$focal_nodes;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$triples = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$nodes = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$index = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$lock = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$node_count = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$prefix_map = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$file_location = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$topic = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$focal_nodes = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX46651_native.class, $ic71$, $ic1$, $ic72$, $ic73$, new String[] { "$triples", "$nodes", "$index", "$lock", "$node_count", "$prefix_map", "$file_location", "$topic", "$focal_nodes" }, $ic74$, $ic75$, $ic76$);
        }
    }
    
    public static final class $f42628$UnaryFunction extends UnaryFunction
    {
        public $f42628$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46652"));
        }
        
        public SubLObject processItem(final SubLObject var153) {
            return f42628(var153);
        }
    }
    
    public static final class $sX46654_native extends SubLStructNative
    {
        public SubLObject $subject_index;
        public SubLObject $predicate_index;
        public SubLObject $object_index;
        public static final SubLStructDeclNative structDecl;
        
        public $sX46654_native() {
            this.$subject_index = (SubLObject)CommonSymbols.NIL;
            this.$predicate_index = (SubLObject)CommonSymbols.NIL;
            this.$object_index = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$subject_index;
        }
        
        public SubLObject getField3() {
            return this.$predicate_index;
        }
        
        public SubLObject getField4() {
            return this.$object_index;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$subject_index = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$predicate_index = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$object_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX46654_native.class, $ic130$, $ic131$, $ic132$, $ic133$, new String[] { "$subject_index", "$predicate_index", "$object_index" }, $ic134$, $ic135$, $ic136$);
        }
    }
    
    public static final class $f42787$UnaryFunction extends UnaryFunction
    {
        public $f42787$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#46655"));
        }
        
        public SubLObject processItem(final SubLObject var153) {
            return f42787(var153);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 1212 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/