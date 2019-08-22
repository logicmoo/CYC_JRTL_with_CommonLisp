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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0713 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0713";
    public static final String myFingerPrint = "6fc0b7a70644bf05b1494b195f60a13cfe5ee4263336cc83acddce10b9df75ad";
    private static SubLSymbol $g5654$;
    private static SubLSymbol $g5655$;
    public static SubLSymbol $g5656$;
    private static SubLSymbol $g5657$;
    private static SubLSymbol $g5658$;
    private static SubLSymbol $g5659$;
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLString $ic2$;
    private static final SubLString $ic3$;
    private static final SubLString $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLString $ic6$;
    private static final SubLList $ic7$;
    private static final SubLString $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLList $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLString $ic19$;
    private static final SubLList $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLString $ic28$;
    private static final SubLString $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLSymbol $ic39$;
    private static final SubLObject $ic40$;
    private static final SubLObject $ic41$;
    private static final SubLObject $ic42$;
    private static final SubLObject $ic43$;
    private static final SubLString $ic44$;
    private static final SubLString $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLList $ic48$;
    private static final SubLString $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLObject $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLSymbol $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLSymbol $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLObject $ic71$;
    private static final SubLString $ic72$;
    private static final SubLObject $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLSymbol $ic77$;
    private static final SubLString $ic78$;
    private static final SubLSymbol $ic79$;
    private static final SubLString $ic80$;
    private static final SubLObject $ic81$;
    private static final SubLObject $ic82$;
    private static final SubLObject $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLSymbol $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLSymbol $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLList $ic92$;
    private static final SubLList $ic93$;
    private static final SubLList $ic94$;
    private static final SubLList $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLList $ic98$;
    private static final SubLSymbol $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLSymbol $ic102$;
    private static final SubLSymbol $ic103$;
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
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLString $ic139$;
    private static final SubLSymbol $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLObject $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLSymbol $ic148$;
    private static final SubLSymbol $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLSymbol $ic151$;
    private static final SubLSymbol $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLInteger $ic159$;
    private static final SubLString $ic160$;
    private static final SubLObject $ic161$;
    private static final SubLList $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLObject $ic167$;
    private static final SubLObject $ic168$;
    private static final SubLString $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLString $ic174$;
    private static final SubLObject $ic175$;
    private static final SubLString $ic176$;
    private static final SubLSymbol $ic177$;
    private static final SubLObject $ic178$;
    private static final SubLObject $ic179$;
    private static final SubLObject $ic180$;
    private static final SubLObject $ic181$;
    private static final SubLObject $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLString $ic184$;
    private static final SubLString $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLString $ic188$;
    private static final SubLObject $ic189$;
    private static final SubLObject $ic190$;
    private static final SubLString $ic191$;
    private static final SubLObject $ic192$;
    private static final SubLString $ic193$;
    private static final SubLObject $ic194$;
    private static final SubLObject $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLObject $ic206$;
    private static final SubLObject $ic207$;
    private static final SubLObject $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLObject $ic210$;
    private static final SubLObject $ic211$;
    private static final SubLObject $ic212$;
    private static final SubLObject $ic213$;
    private static final SubLObject $ic214$;
    private static final SubLObject $ic215$;
    private static final SubLObject $ic216$;
    private static final SubLObject $ic217$;
    private static final SubLObject $ic218$;
    private static final SubLObject $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLObject $ic222$;
    private static final SubLString $ic223$;
    private static final SubLObject $ic224$;
    private static final SubLObject $ic225$;
    private static final SubLSymbol $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLString $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLSymbol $ic232$;
    private static final SubLString $ic233$;
    
    
    public static SubLObject f43749() {
        module0006.f218((SubLObject)T, (SubLObject)$ic1$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0006.f218((SubLObject)T, (SubLObject)$ic2$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0006.f218((SubLObject)T, (SubLObject)$ic3$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0006.f218((SubLObject)T, (SubLObject)$ic4$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43750(final SubLObject var1, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var2 = conses_high.copy_list(var2);
        f43751((SubLObject)$ic6$, module0035.f2333((SubLObject)$ic7$, (SubLObject)ConsesLow.list(var1, var2)));
        final SubLObject var4 = module0699.f42601(var1, (SubLObject)UNPROVIDED);
        if (NIL == module0075.f5218(var4)) {
            Errors.error((SubLObject)$ic8$, var1);
        }
        final SubLObject var5 = f43752(var2);
        final SubLObject var6 = f43753(var4, var5, var1);
        f43754(var6, var2);
        f43755(var6, (SubLObject)$ic9$, (SubLObject)$ic10$);
        f43755(var6, (SubLObject)$ic11$, var1);
        f43755(var6, (SubLObject)$ic12$, var5);
        f43755(var6, (SubLObject)$ic13$, StreamsLow.$standard_output$.getDynamicValue(var3));
        return f43756(var6);
    }
    
    public static SubLObject f43757(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var2 = conses_high.copy_list(var2);
        f43751((SubLObject)$ic15$, module0035.f2333((SubLObject)$ic16$, (SubLObject)ConsesLow.list(var4, var2)));
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = module0012.$silent_progressP$.currentBinding(var5);
        try {
            module0012.$silent_progressP$.bind((SubLObject)makeBoolean(NIL == conses_high.getf(var2, (SubLObject)$ic17$, (SubLObject)UNPROVIDED)), var5);
            var6 = f43758(var4);
        }
        finally {
            module0012.$silent_progressP$.rebind(var7, var5);
        }
        final SubLObject var8 = f43752(var2);
        final SubLObject var9 = f43759(var6, var8, var2);
        final SubLObject var10 = module0701.f42703(var6);
        final SubLObject var11 = (SubLObject)((NIL != module0702.f42828(var10)) ? f43760(var10) : NIL);
        f43754(var9, var2);
        f43755(var9, (SubLObject)$ic9$, (SubLObject)$ic10$);
        if (NIL != module0589.f35909(var11)) {
            f43755(var9, (SubLObject)$ic11$, var11);
        }
        f43755(var9, (SubLObject)$ic12$, var8);
        f43755(var9, (SubLObject)$ic13$, StreamsLow.$standard_output$.getDynamicValue(var5));
        return f43756(var9);
    }
    
    public static SubLObject f43761(final SubLObject var1, final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var2 = conses_high.copy_list(var2);
        f43751((SubLObject)$ic19$, module0035.f2333((SubLObject)$ic20$, (SubLObject)ConsesLow.list(var1, var4, var2)));
        final SubLObject var6 = f43752(var2);
        final SubLObject var7 = f43753(var4, var6, var1);
        f43754(var7, var2);
        f43755(var7, (SubLObject)$ic9$, (SubLObject)$ic10$);
        f43755(var7, (SubLObject)$ic11$, var1);
        f43755(var7, (SubLObject)$ic12$, var6);
        f43755(var7, (SubLObject)$ic13$, StreamsLow.$standard_output$.getDynamicValue(var5));
        return f43756(var7);
    }
    
    public static SubLObject f43762(final SubLObject var4, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        var2 = conses_high.putf(var2, (SubLObject)$ic21$, (SubLObject)$ic22$);
        return f43757(var4, var2);
    }
    
    public static SubLObject f43758(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)NIL;
        final SubLObject var7 = (SubLObject)$ic24$;
        final SubLObject var8 = module0012.$g73$.currentBinding(var5);
        final SubLObject var9 = module0012.$g65$.currentBinding(var5);
        final SubLObject var10 = module0012.$g67$.currentBinding(var5);
        final SubLObject var11 = module0012.$g68$.currentBinding(var5);
        final SubLObject var12 = module0012.$g66$.currentBinding(var5);
        final SubLObject var13 = module0012.$g69$.currentBinding(var5);
        final SubLObject var14 = module0012.$g70$.currentBinding(var5);
        final SubLObject var15 = module0012.$silent_progressP$.currentBinding(var5);
        try {
            module0012.$g73$.bind(Time.get_universal_time(), var5);
            module0012.$g65$.bind(module0012.$g73$.getDynamicValue(var5), var5);
            module0012.$g67$.bind((SubLObject)ONE_INTEGER, var5);
            module0012.$g68$.bind((SubLObject)ZERO_INTEGER, var5);
            module0012.$g66$.bind((SubLObject)ZERO_INTEGER, var5);
            module0012.$g69$.bind((SubLObject)ZERO_INTEGER, var5);
            module0012.$g70$.bind((SubLObject)T, var5);
            module0012.$silent_progressP$.bind((SubLObject)((NIL != var7) ? module0012.$silent_progressP$.getDynamicValue(var5) : T), var5);
            module0012.f474(var7);
            var6 = module0705.f42915(var4);
            module0012.f475();
        }
        finally {
            module0012.$silent_progressP$.rebind(var15, var5);
            module0012.$g70$.rebind(var14, var5);
            module0012.$g69$.rebind(var13, var5);
            module0012.$g66$.rebind(var12, var5);
            module0012.$g68$.rebind(var11, var5);
            module0012.$g67$.rebind(var10, var5);
            module0012.$g65$.rebind(var9, var5);
            module0012.$g73$.rebind(var8, var5);
        }
        return var6;
    }
    
    public static SubLObject f43756(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = f43763(var6, (SubLObject)$ic17$, (SubLObject)UNPROVIDED);
        if (NIL != var8) {
            module0708.f43052(f43764(var6));
        }
        if ($ic22$ == f43763(var6, (SubLObject)$ic21$, (SubLObject)UNPROVIDED)) {
            return var6;
        }
        final SubLObject var9 = f43763(var6, (SubLObject)$ic11$, (SubLObject)UNPROVIDED);
        SubLObject var10 = f43763(var6, (SubLObject)$ic25$, (SubLObject)UNPROVIDED);
        final SubLObject var11 = f43763(var6, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        if (NIL == var10) {
            var10 = f43765(var9, module0701.f42758(f43766(var6)));
            if (NIL != module0038.f2611(var10)) {
                f43767(var6, (SubLObject)$ic25$, var10);
            }
            else {
                var10 = (SubLObject)$ic10$;
                f43767(var6, (SubLObject)$ic25$, (SubLObject)$ic10$);
            }
        }
        if (NIL != module0038.f2608(var11)) {
            if (NIL != var8) {
                module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic26$, var11, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else if (NIL != module0038.f2611(var11)) {
            if (NIL != var8) {
                module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic27$, var11, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else if (NIL != var8) {
            module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic28$, var11, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0038.f2611(var11) && NIL == Strings.stringE(var10, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != var8) {
            module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic29$, var11, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var12 = f43763(var6, (SubLObject)$ic30$, (SubLObject)UNPROVIDED);
        final SubLObject var13 = f43763(var6, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
        if ((NIL == module0038.f2611(var12) || (NIL != var13 && NIL == module0038.f2611(var13))) && NIL != module0038.f2611(var10)) {
            var12 = Sequences.cconcatenate(var10, (SubLObject)$ic32$);
        }
        if (NIL != module0038.f2611(var12)) {
            final SubLObject var14 = module0035.remove_if_not((SubLObject)$ic33$, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == Strings.stringE(var12, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                if (NIL != var8) {
                    module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic34$, var12, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                var12 = var14;
            }
        }
        f43767(var6, (SubLObject)$ic30$, var12);
        f43767(var6, (SubLObject)$ic31$, var13);
        if (NIL != var8) {
            if (NIL != module0038.f2611(var12)) {
                if (NIL == module0038.f2673(var12, (SubLObject)$ic32$, (SubLObject)UNPROVIDED)) {
                    var12 = Sequences.cconcatenate(var12, (SubLObject)$ic32$);
                }
                module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic35$, var12, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0038.f2611(var13)) {
                module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic36$, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0038.f2608(var12) && NIL != module0038.f2608(var13)) {
                module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic37$, var10, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        SubLObject var15 = f43763(var6, (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
        SubLObject var16 = f43763(var6, (SubLObject)$ic39$, (SubLObject)UNPROVIDED);
        final SubLObject var17 = module0012.$silent_progressP$.currentBinding(var7);
        try {
            module0012.$silent_progressP$.bind((SubLObject)makeBoolean(NIL == var8), var7);
            if (NIL == module0173.f10955(var15)) {
                module0708.f43031((SubLObject)ConsesLow.list($ic40$, (SubLObject)ConsesLow.list($ic41$, var9)), $ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var15 = module0285.f18993((SubLObject)ConsesLow.list($ic41$, var9), (SubLObject)UNPROVIDED);
                f43767(var6, (SubLObject)$ic38$, var15);
            }
            if (NIL == module0161.f10481(var16)) {
                var16 = module0285.f18993((SubLObject)ConsesLow.list($ic43$, var15), (SubLObject)UNPROVIDED);
                f43767(var6, (SubLObject)$ic39$, var16);
            }
            if (NIL != var8) {
                if (module0015.$g131$.getDynamicValue(var7).equal(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED))) {
                    module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic44$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0656.f39804(var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    streams_high.terpri((SubLObject)UNPROVIDED);
                    module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0656.f39804(var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    streams_high.terpri((SubLObject)UNPROVIDED);
                }
                else {
                    module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic46$, module0172.f10930(var15), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic47$, module0172.f10930(var16), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            SubLObject var18 = module0701.f42758(f43766(var6));
            SubLObject var19 = (SubLObject)NIL;
            var19 = var18.first();
            while (NIL != var18) {
                SubLObject var21;
                final SubLObject var20 = var21 = var19;
                SubLObject var22 = (SubLObject)NIL;
                SubLObject var23 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)$ic48$);
                var22 = var21.first();
                var21 = (var23 = var21.rest());
                if (NIL != module0589.f35909(var23)) {
                    if (NIL != Strings.stringE(var22, (SubLObject)$ic49$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                        module0708.f43031((SubLObject)ConsesLow.list($ic50$, var15, (SubLObject)ConsesLow.list($ic51$, var23)), var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    else {
                        module0708.f43031((SubLObject)ConsesLow.list($ic52$, var15, var22, (SubLObject)ConsesLow.list($ic51$, var23)), var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
            final SubLObject var24 = module0035.remove_if_not((SubLObject)$ic53$, f43763(var6, (SubLObject)$ic54$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var24) {
                final SubLObject var25 = f43766(var6);
                SubLObject var26 = var24;
                SubLObject var27 = (SubLObject)NIL;
                var27 = var26.first();
                while (NIL != var26) {
                    Functions.funcall(var27, var25, var8);
                    var26 = var26.rest();
                    var27 = var26.first();
                }
                f43768(var6, (SubLObject)$ic55$, module0701.f42752(var25));
                f43768(var6, (SubLObject)$ic56$, module0701.f42686(var25));
            }
            if (NIL != var8) {
                module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic57$, module0701.f42686(f43766(var6)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic58$, module0701.f42752(f43766(var6)), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            f43769(var6);
        }
        finally {
            module0012.$silent_progressP$.rebind(var17, var7);
        }
        return var6;
    }
    
    public static SubLObject f43765(final SubLObject var1, final SubLObject var35) {
        return Sort.sort(Mapping.mapcar((SubLObject)$ic59$, module0035.f2109(var1, var35, (SubLObject)$ic60$, (SubLObject)$ic61$)), (SubLObject)$ic62$, (SubLObject)$ic63$).first();
    }
    
    public static SubLObject f43770(final SubLObject var35) {
        return Sort.sort(Mapping.mapcar((SubLObject)$ic61$, module0035.f2109((SubLObject)$ic10$, var35, (SubLObject)$ic64$, (SubLObject)$ic59$)), (SubLObject)$ic62$, (SubLObject)$ic63$).first();
    }
    
    public static SubLObject f43751(final SubLObject var36, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)NIL;
        if (NIL != module0035.f2346(var37, (SubLObject)$ic65$) && NIL == module0589.f35909(conses_high.getf(var37, (SubLObject)$ic65$, (SubLObject)UNPROVIDED))) {
            module0006.f218((SubLObject)T, (SubLObject)$ic66$, var36, conses_high.getf(var37, (SubLObject)$ic65$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var39 = (SubLObject)T;
        }
        if (NIL != module0035.f2346(var37, (SubLObject)$ic67$) && NIL == module0075.f5218(conses_high.getf(var37, (SubLObject)$ic67$, (SubLObject)UNPROVIDED))) {
            module0006.f218((SubLObject)T, (SubLObject)$ic68$, var36, conses_high.getf(var37, (SubLObject)$ic67$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var39 = (SubLObject)T;
        }
        final SubLObject var40 = conses_high.getf(var37, (SubLObject)$ic69$, (SubLObject)UNPROVIDED);
        if (NIL == module0035.f2327(var40)) {
            module0006.f218((SubLObject)T, (SubLObject)$ic70$, var36, conses_high.getf(var37, (SubLObject)$ic69$, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var39 = (SubLObject)T;
        }
        final SubLObject var41 = conses_high.getf(var40, (SubLObject)$ic12$, (SubLObject)UNPROVIDED);
        if (NIL != var41) {
            if (NIL == module0259.f16891(var41, $ic71$)) {
                module0006.f218((SubLObject)T, (SubLObject)$ic72$, var36, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                var39 = (SubLObject)T;
            }
        }
        else if (NIL == module0259.f16891(module0574.f35152(), $ic71$) || $ic73$.eql(module0574.f35152())) {
            module0006.f218((SubLObject)T, (SubLObject)$ic74$, var36, var40, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var39 = (SubLObject)T;
        }
        final SubLObject var42 = conses_high.set_difference(module0035.f2354(var40), $g5654$.getDynamicValue(var38), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != var42) {
            module0006.f218((SubLObject)T, (SubLObject)$ic75$, var36, var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var39 = (SubLObject)T;
        }
        if (NIL != var39) {
            f43749();
            Errors.error((SubLObject)$ic76$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43752(final SubLObject var2) {
        SubLObject var3 = conses_high.getf(var2, (SubLObject)$ic12$, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var3)) {
            var3 = module0574.f35152();
        }
        return var3;
    }
    
    public static SubLObject f43771() {
        final SubLObject var41 = Sequences.position_if((SubLObject)$ic79$, $g5655$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var42 = module0038.f2666(module0038.f2623($g5655$.getGlobalValue(), var41, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER);
        module0038.f2743((SubLObject)ZERO_INTEGER, var42, (SubLObject)Characters.CHAR_2, (SubLObject)UNPROVIDED);
        return var42;
    }
    
    public static SubLObject f43772(final SubLObject var43, final SubLObject var44, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        final SubLObject var45 = module0699.f42601(var43, (SubLObject)UNPROVIDED);
        return f43773(var45, var44, var5, var43);
    }
    
    public static SubLObject f43773(final SubLObject var46, final SubLObject var44, SubLObject var5, SubLObject var47) {
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        final SubLObject var48 = f43753(var46, var5, var47);
        f43769(var48);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43774(final SubLObject var43, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        final SubLObject var44 = module0699.f42601(var43, (SubLObject)UNPROVIDED);
        return f43753(var44, var5, var43);
    }
    
    public static SubLObject f43753(final SubLObject var46, SubLObject var5, SubLObject var47) {
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        final SubLObject var48 = f43775(var47, var46, var5, (SubLObject)UNPROVIDED);
        f43776(var48, var47);
        return var48;
    }
    
    public static SubLObject f43777(final SubLObject var48) {
        return module0067.f4885(f43778(), var48, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43779() {
        final SubLObject var41 = Sequences.position((SubLObject)Characters.CHAR_period, $g5655$.getGlobalValue(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return Sequences.cconcatenate((SubLObject)$ic80$, module0038.f2666(module0038.f2623($g5655$.getGlobalValue(), var41, (SubLObject)UNPROVIDED), (SubLObject)TWO_INTEGER));
    }
    
    public static SubLObject f43780(final SubLObject var7, final SubLObject var44, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        final SubLObject var45 = f43759(var7, var5, (SubLObject)UNPROVIDED);
        f43769(var45);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43781(final SubLObject var5) {
        final SubLObject var6 = f43779();
        final SubLObject var7 = module0202.f12768($ic81$, $ic82$, var6);
        return module0285.f18993(module0202.f12768($ic83$, var7, var5), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43776(final SubLObject var6, SubLObject var47) {
        if (var47 == UNPROVIDED) {
            var47 = (SubLObject)NIL;
        }
        final SubLObject var48 = module0705.f42913(f43782(var6), var47);
        return f43783(var6, var48);
    }
    
    public static SubLObject f43783(final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        f43784(var6, var7);
        final SubLObject var9 = module0701.f42689(var7);
        SubLObject var10 = (SubLObject)NIL;
        try {
            var10 = ReadWriteLocks.rw_lock_seize_read_lock(var9);
            final SubLObject var11 = module0701.f42690(var7);
            SubLObject var14;
            for (SubLObject var12 = (SubLObject)NIL; NIL == var12; var12 = (SubLObject)makeBoolean(NIL == var14)) {
                var8.resetMultipleValues();
                final SubLObject var13 = module0052.f3693(var11);
                var14 = var8.secondMultipleValue();
                var8.resetMultipleValues();
                if (NIL != var14) {
                    module0067.f4886(f43785(var6), var13, (SubLObject)NIL);
                }
            }
        }
        finally {
            if (NIL != var10) {
                ReadWriteLocks.rw_lock_release_read_lock(var9);
            }
        }
        f43768(var6, (SubLObject)$ic55$, module0701.f42752(var7));
        f43768(var6, (SubLObject)$ic56$, module0701.f42686(var7));
        f43768(var6, (SubLObject)$ic84$, (SubLObject)ZERO_INTEGER);
        f43768(var6, (SubLObject)$ic85$, (SubLObject)ZERO_INTEGER);
        f43768(var6, (SubLObject)$ic86$, (SubLObject)ZERO_INTEGER);
        f43768(var6, (SubLObject)$ic87$, (SubLObject)ZERO_INTEGER);
        final SubLObject var15 = module0701.f42657(var7, module0699.f42531((SubLObject)$ic88$), module0708.f43016((SubLObject)$ic89$));
        f43786(var6, var15);
        return var7;
    }
    
    public static SubLObject f43787(final SubLObject var57, final SubLObject var58) {
        f43788(var57, var58, (SubLObject)ZERO_INTEGER);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43789(final SubLObject var57) {
        return (SubLObject)((var57.getClass() == $sX47920_native.class) ? T : NIL);
    }
    
    public static SubLObject f43790(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField2();
    }
    
    public static SubLObject f43791(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField3();
    }
    
    public static SubLObject f43792(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField4();
    }
    
    public static SubLObject f43793(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField5();
    }
    
    public static SubLObject f43794(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField6();
    }
    
    public static SubLObject f43795(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField7();
    }
    
    public static SubLObject f43796(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField8();
    }
    
    public static SubLObject f43797(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField9();
    }
    
    public static SubLObject f43798(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField10();
    }
    
    public static SubLObject f43799(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField11();
    }
    
    public static SubLObject f43800(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField12();
    }
    
    public static SubLObject f43801(final SubLObject var57) {
        assert NIL != f43789(var57) : var57;
        return var57.getField13();
    }
    
    public static SubLObject f43802(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField2(var60);
    }
    
    public static SubLObject f43803(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField3(var60);
    }
    
    public static SubLObject f43804(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField4(var60);
    }
    
    public static SubLObject f43805(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField5(var60);
    }
    
    public static SubLObject f43806(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField6(var60);
    }
    
    public static SubLObject f43807(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField7(var60);
    }
    
    public static SubLObject f43808(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField8(var60);
    }
    
    public static SubLObject f43809(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField9(var60);
    }
    
    public static SubLObject f43810(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField10(var60);
    }
    
    public static SubLObject f43811(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField11(var60);
    }
    
    public static SubLObject f43812(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField12(var60);
    }
    
    public static SubLObject f43813(final SubLObject var57, final SubLObject var60) {
        assert NIL != f43789(var57) : var57;
        return var57.setField13(var60);
    }
    
    public static SubLObject f43814(SubLObject var61) {
        if (var61 == UNPROVIDED) {
            var61 = (SubLObject)NIL;
        }
        final SubLObject var62 = (SubLObject)new $sX47920_native();
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        for (var63 = (SubLObject)NIL, var63 = var61; NIL != var63; var63 = conses_high.cddr(var63)) {
            var64 = var63.first();
            var65 = conses_high.cadr(var63);
            var66 = var64;
            if (var66.eql((SubLObject)$ic123$)) {
                f43802(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic65$)) {
                f43803(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic124$)) {
                f43804(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic125$)) {
                f43805(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic12$)) {
                f43806(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic126$)) {
                f43807(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic127$)) {
                f43808(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic128$)) {
                f43809(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic129$)) {
                f43810(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic130$)) {
                f43811(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic131$)) {
                f43812(var62, var65);
            }
            else if (var66.eql((SubLObject)$ic132$)) {
                f43813(var62, var65);
            }
            else {
                Errors.error((SubLObject)$ic133$, var64);
            }
        }
        return var62;
    }
    
    public static SubLObject f43815(final SubLObject var67, final SubLObject var68) {
        Functions.funcall(var68, var67, (SubLObject)$ic134$, (SubLObject)$ic135$, (SubLObject)TWELVE_INTEGER);
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic123$, f43790(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic65$, f43791(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic124$, f43792(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic125$, f43793(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic12$, f43794(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic126$, f43795(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic127$, f43796(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic128$, f43797(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic129$, f43798(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic130$, f43799(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic131$, f43800(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic136$, (SubLObject)$ic132$, f43801(var67));
        Functions.funcall(var68, var67, (SubLObject)$ic137$, (SubLObject)$ic135$, (SubLObject)TWELVE_INTEGER);
        return var67;
    }
    
    public static SubLObject f43816(final SubLObject var67, final SubLObject var68) {
        return f43815(var67, var68);
    }
    
    public static SubLObject f43788(final SubLObject var69, final SubLObject var58, final SubLObject var70) {
        PrintLow.format(var58, (SubLObject)$ic139$, f43790(var69), f43791(var69));
        return var69;
    }
    
    public static SubLObject f43775(final SubLObject var1, final SubLObject var46, SubLObject var5, SubLObject var39) {
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        assert NIL != module0589.f35909(var1) : var1;
        assert NIL != module0075.f5218(var46) : var46;
        assert NIL != module0173.f10955(var5) : var5;
        assert NIL != module0035.f2327(var39) : var39;
        final SubLObject var47 = f43814((SubLObject)UNPROVIDED);
        f43802(var47, f43817());
        f43803(var47, var1);
        f43804(var47, var46);
        f43806(var47, var5);
        f43809(var47, module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        f43810(var47, module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f43811(var47, module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        f43812(var47, var39);
        return var47;
    }
    
    public static SubLObject f43759(final SubLObject var7, SubLObject var5, SubLObject var39) {
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var39 == UNPROVIDED) {
            var39 = (SubLObject)NIL;
        }
        assert NIL != module0701.f42628(var7) : var7;
        assert NIL != module0173.f10955(var5) : var5;
        if (NIL == module0702.f42828(module0701.f42703(var7))) {
            Errors.error((SubLObject)$ic145$);
        }
        final SubLObject var40 = f43814((SubLObject)UNPROVIDED);
        f43802(var40, f43817());
        f43803(var40, module0702.f42830(module0701.f42703(var7)));
        f43806(var40, var5);
        f43809(var40, module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        f43810(var40, module0077.f5313(Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED));
        f43811(var40, module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        f43812(var40, var39);
        f43783(var40, var7);
        return var40;
    }
    
    public static SubLObject f43818(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = f43771();
        final SubLObject var8 = module0202.f12768($ic146$, $ic82$, var7);
        final SubLObject var9 = module0202.f12768($ic83$, var8, var5);
        if (NIL == module0226.f14809(module0172.f10921(var9))) {
            final SubLObject var10 = module0111.$g1405$.currentBinding(var6);
            try {
                module0111.$g1405$.bind((SubLObject)NIL, var6);
                module0574.f35153(var5);
                module0543.f33631((SubLObject)ConsesLow.list($ic40$, var9), $ic42$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0111.$g1405$.rebind(var10, var6);
            }
        }
        return module0172.f10921(var9);
    }
    
    public static SubLObject f43817() {
        return module0057.f4175($g5657$.getGlobalValue());
    }
    
    public static SubLObject f43778() {
        return $g5658$.getGlobalValue();
    }
    
    public static SubLObject f43819(final SubLObject var6, final SubLObject var48) {
        return module0067.f4886($g5658$.getGlobalValue(), var48, var6);
    }
    
    public static SubLObject f43820(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43790(var6);
    }
    
    public static SubLObject f43821(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43791(var6);
    }
    
    public static SubLObject f43782(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43792(var6);
    }
    
    public static SubLObject f43766(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43793(var6);
    }
    
    public static SubLObject f43784(final SubLObject var6, final SubLObject var7) {
        assert NIL != f43789(var6) : var6;
        assert NIL != module0701.f42628(var7) : var7;
        f43805(var6, var7);
        return var7;
    }
    
    public static SubLObject f43822(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43794(var6);
    }
    
    public static SubLObject f43823(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43795(var6);
    }
    
    public static SubLObject f43824(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43796(var6);
    }
    
    public static SubLObject f43786(final SubLObject var6, final SubLObject var56) {
        assert NIL != f43789(var6) : var6;
        assert NIL != module0035.f2015(var56) : var56;
        SubLObject var57 = var56;
        SubLObject var58 = (SubLObject)NIL;
        var58 = var57.first();
        while (NIL != var57) {
            assert NIL != module0702.f42828(var58) : var58;
            var57 = var57.rest();
            var58 = var57.first();
        }
        f43808(var6, var56);
        return var56;
    }
    
    public static SubLObject f43785(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43797(var6);
    }
    
    public static SubLObject f43825(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43798(var6);
    }
    
    public static SubLObject f43826(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43799(var6);
    }
    
    public static SubLObject f43768(final SubLObject var6, final SubLObject var74, final SubLObject var75) {
        return module0067.f4886(f43826(var6), var74, var75);
    }
    
    public static SubLObject f43827(final SubLObject var6, final SubLObject var74) {
        return module0067.f4885(f43826(var6), var74, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43828(final SubLObject var6) {
        return f43827(var6, (SubLObject)$ic56$);
    }
    
    public static SubLObject f43829(final SubLObject var6) {
        return f43827(var6, (SubLObject)$ic85$);
    }
    
    public static SubLObject f43830(final SubLObject var6) {
        return f43827(var6, (SubLObject)$ic84$);
    }
    
    public static SubLObject f43831(final SubLObject var6) {
        return f43768(var6, (SubLObject)$ic85$, module0048.f_1X(f43829(var6)));
    }
    
    public static SubLObject f43832(final SubLObject var6) {
        return f43768(var6, (SubLObject)$ic84$, module0048.f_1X(f43830(var6)));
    }
    
    public static SubLObject f43754(final SubLObject var6, final SubLObject var39) {
        assert NIL != f43789(var6) : var6;
        if (NIL != var39 && !areAssertionsDisabledFor(me) && NIL == module0035.f2327(var39)) {
            throw new AssertionError(var39);
        }
        f43812(var6, var39);
        return var39;
    }
    
    public static SubLObject f43767(final SubLObject var6, final SubLObject var76, final SubLObject var75) {
        assert NIL != f43789(var6) : var6;
        SubLObject var77 = f43800(var6);
        var77 = conses_high.putf(var77, var76, var75);
        f43812(var6, var77);
        return var77;
    }
    
    public static SubLObject f43755(final SubLObject var6, final SubLObject var76, final SubLObject var75) {
        assert NIL != f43789(var6) : var6;
        SubLObject var77 = f43800(var6);
        if (NIL == module0035.f2346(var77, var76)) {
            var77 = conses_high.putf(var77, var76, var75);
            f43812(var6, var77);
        }
        return var77;
    }
    
    public static SubLObject f43763(final SubLObject var6, final SubLObject var76, SubLObject var77) {
        if (var77 == UNPROVIDED) {
            var77 = (SubLObject)NIL;
        }
        assert NIL != f43789(var6) : var6;
        return conses_high.getf(f43800(var6), var76, var77);
    }
    
    public static SubLObject f43764(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43800(var6);
    }
    
    public static SubLObject f43833(final SubLObject var6, final SubLObject var78) {
        assert NIL != f43789(var6) : var6;
        assert NIL != Types.processp(var78) : var78;
        f43813(var6, var78);
        return f43801(var6);
    }
    
    public static SubLObject f43834(final SubLObject var6) {
        assert NIL != f43789(var6) : var6;
        return f43801(var6);
    }
    
    public static SubLObject f43835(final SubLObject var69) {
        return f43836(var69);
    }
    
    public static SubLObject f43836(final SubLObject var6) {
        return Sxhash.sxhash(f43790(var6));
    }
    
    public static SubLObject f43769(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        f43833(var6, Threads.current_process());
        final SubLObject var8 = f43766(var6);
        final SubLObject var9 = module0012.$g75$.currentBinding(var7);
        final SubLObject var10 = module0012.$g76$.currentBinding(var7);
        final SubLObject var11 = module0012.$g77$.currentBinding(var7);
        final SubLObject var12 = module0012.$g78$.currentBinding(var7);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var7);
            module0012.$g76$.bind((SubLObject)NIL, var7);
            module0012.$g77$.bind((SubLObject)T, var7);
            module0012.$g78$.bind(Time.get_universal_time(), var7);
            module0012.f478(Sequences.cconcatenate((SubLObject)$ic153$, new SubLObject[] { module0006.f207(f43828(var6)), $ic154$ }));
            if (NIL != f43763(var6, (SubLObject)$ic17$, (SubLObject)UNPROVIDED)) {
                SubLObject var13 = (SubLObject)ZERO_INTEGER;
                SubLObject var14 = (SubLObject)ZERO_INTEGER;
                SubLObject var15 = (SubLObject)ZERO_INTEGER;
                SubLObject var16 = (SubLObject)ZERO_INTEGER;
                final SubLObject var17 = module0701.f42689(var8);
                SubLObject var18 = (SubLObject)NIL;
                try {
                    var18 = ReadWriteLocks.rw_lock_seize_read_lock(var17);
                    final SubLObject var19 = module0701.f42690(var8);
                    SubLObject var22;
                    for (SubLObject var20 = (SubLObject)NIL; NIL == var20; var20 = (SubLObject)makeBoolean(NIL == var22)) {
                        var7.resetMultipleValues();
                        final SubLObject var21 = module0052.f3693(var19);
                        var22 = var7.secondMultipleValue();
                        var7.resetMultipleValues();
                        if (NIL != var22) {
                            var13 = Numbers.add(var13, (SubLObject)ONE_INTEGER);
                            if (NIL != module0702.f42828(var21) || NIL != module0704.f42888(var21)) {
                                var14 = Numbers.add(var14, (SubLObject)ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    if (NIL != var18) {
                        ReadWriteLocks.rw_lock_release_read_lock(var17);
                    }
                }
                final SubLObject var19 = module0701.f42700(var8);
                SubLObject var22;
                for (SubLObject var20 = (SubLObject)NIL; NIL == var20; var20 = (SubLObject)makeBoolean(NIL == var22)) {
                    var7.resetMultipleValues();
                    final SubLObject var23 = module0052.f3693(var19);
                    var22 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    if (NIL != var22) {
                        var15 = Numbers.add(var15, (SubLObject)ONE_INTEGER);
                        if (NIL != module0700.f42611(var23, (SubLObject)UNPROVIDED)) {
                            var16 = Numbers.add(var16, (SubLObject)ONE_INTEGER);
                        }
                    }
                }
                module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)$ic155$, var13, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)$ic156$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)$ic157$, var15, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)$ic158$, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var24 = module0701.f42689(var8);
            SubLObject var25 = (SubLObject)NIL;
            try {
                var25 = ReadWriteLocks.rw_lock_seize_read_lock(var24);
                final SubLObject var26 = module0701.f42690(var8);
                SubLObject var29;
                for (SubLObject var27 = (SubLObject)NIL; NIL == var27; var27 = (SubLObject)makeBoolean(NIL == var29)) {
                    var7.resetMultipleValues();
                    final SubLObject var28 = module0052.f3693(var26);
                    var29 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    if (NIL != var29) {
                        f43837(var6, var28);
                        f43832(var6);
                    }
                }
            }
            finally {
                if (NIL != var25) {
                    ReadWriteLocks.rw_lock_release_read_lock(var24);
                }
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var12, var7);
            module0012.$g77$.rebind(var11, var7);
            module0012.$g76$.rebind(var10, var7);
            module0012.$g75$.rebind(var9, var7);
        }
        return f43830(var6);
    }
    
    public static SubLObject f43837(final SubLObject var6, final SubLObject var54) {
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (NIL == module0004.f104(var54, $g5659$.getDynamicValue(var55), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            final SubLObject var56 = f43766(var6);
            final SubLObject var57 = $g5659$.currentBinding(var55);
            try {
                $g5659$.bind((SubLObject)ConsesLow.cons(var54, $g5659$.getDynamicValue(var55)), var55);
                if (NIL != module0701.f42629(var54) && NIL == module0699.f42594(var54, var56)) {
                    if (NIL != module0035.f2002($g5659$.getDynamicValue(var55), (SubLObject)$ic159$, (SubLObject)UNPROVIDED)) {
                        Errors.sublisp_break((SubLObject)$ic160$, new SubLObject[] { Sequences.length($g5659$.getDynamicValue(var55)) });
                    }
                    SubLObject var58 = module0701.f42651(var56, var54, (SubLObject)UNPROVIDED);
                    SubLObject var59 = (SubLObject)NIL;
                    var59 = var58.first();
                    while (NIL != var58) {
                        f43838(var6, var59);
                        var58 = var58.rest();
                        var59 = var58.first();
                    }
                }
            }
            finally {
                $g5659$.rebind(var57, var55);
            }
        }
        return var54;
    }
    
    public static SubLObject f43838(final SubLObject var6, final SubLObject var83) {
        final SubLObject var84 = f43839(var6, var83);
        final SubLObject var85 = module0205.f13333(var84);
        final SubLObject var86 = f43823(var6);
        final SubLObject var87 = f43822(var6);
        final SubLObject var88 = f43763(var6, (SubLObject)$ic39$, (SubLObject)UNPROVIDED);
        if (NIL == module0226.f14807(var85)) {
            module0708.f43031((SubLObject)ConsesLow.listS($ic161$, var85, (SubLObject)$ic162$), var88, var86, var87, (SubLObject)UNPROVIDED);
        }
        if (NIL != var84) {
            final SubLObject var89 = (SubLObject)makeBoolean(NIL != f43840(var6, var84) || NIL != module0708.f43031(var84, var88, var86, var87, (SubLObject)UNPROVIDED));
            if (NIL == var89) {
                Errors.warn((SubLObject)$ic163$, var84, var88);
                module0274.f18198(module0172.f10930(var84), var88, (SubLObject)UNPROVIDED);
                module0006.f218(f43763(var6, (SubLObject)$ic13$, (SubLObject)UNPROVIDED), (SubLObject)$ic164$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        f43841(var6, var84);
        module0012.note_percent_progress(f43829(var6), f43828(var6));
        return var83;
    }
    
    public static SubLObject f43840(final SubLObject var6, final SubLObject var84) {
        return module0077.f5320(var84, f43825(var6));
    }
    
    public static SubLObject f43841(final SubLObject var6, final SubLObject var84) {
        f43831(var6);
        return module0077.f5326(var84, f43825(var6));
    }
    
    public static SubLObject f43839(final SubLObject var6, final SubLObject var83) {
        final SubLObject var84 = f43842(var6, module0700.f42613(var83), (SubLObject)UNPROVIDED);
        final SubLObject var85 = f43842(var6, module0700.f42612(var83), (SubLObject)T);
        final SubLObject var86 = f43842(var6, module0700.f42614(var83), module0701.f42654(module0700.f42613(var83)));
        if (NIL != var84 && NIL != var85 && NIL != var86) {
            return module0202.f12768(var84, var85, var86);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43843(final SubLObject var6, final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = f43766(var6);
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(var91) && NIL == module0699.f42594(var90, var92)) {
            Errors.error((SubLObject)$ic165$, var90);
        }
        if (NIL != module0702.f42828(var90) && NIL != module0702.f42832(var90, module0699.f42531((SubLObject)$ic166$))) {
            return $ic167$;
        }
        return module0285.f18875(module0202.f12683($ic168$, f43844(var6, var90), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f43844(final SubLObject var6, final SubLObject var54) {
        if (NIL != module0702.f42828(var54) && NIL != module0702.f42832(var54, module0699.f42531((SubLObject)$ic166$))) {
            return (SubLObject)NIL;
        }
        final SubLObject var55 = f43766(var6);
        final SubLObject var56 = module0701.f42651(var55, var54, (SubLObject)UNPROVIDED);
        final SubLObject var57 = Sequences.find(module0701.f42634(var55, module0699.f42531((SubLObject)$ic169$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var56, (SubLObject)EQ, (SubLObject)$ic170$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var58 = f43842(var6, module0700.f42614(var57), (SubLObject)UNPROVIDED);
        final SubLObject var59 = Sequences.find(module0701.f42634(var55, module0699.f42531((SubLObject)$ic171$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var56, (SubLObject)EQ, (SubLObject)$ic170$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var60 = f43844(var6, module0700.f42614(var59));
        return (SubLObject)ConsesLow.cons(var58, var60);
    }
    
    public static SubLObject f43842(final SubLObject var6, final SubLObject var96, SubLObject var97) {
        if (var97 == UNPROVIDED) {
            var97 = (SubLObject)NIL;
        }
        SubLObject var98 = module0067.f4885(f43785(var6), var96, (SubLObject)UNPROVIDED);
        if (NIL != var98) {
            return var98;
        }
        if (NIL != module0702.f42828(var96)) {
            var98 = f43845(var6, var96, var97);
        }
        else if (NIL != module0704.f42888(var96)) {
            var98 = module0699.f42593(var96);
        }
        else if (NIL != module0703.f42867(var96)) {
            var98 = f43846(var96, var6);
            f43847(var6, var98, (SubLObject)UNPROVIDED);
            var97 = (SubLObject)NIL;
        }
        else {
            Errors.error((SubLObject)$ic172$, var96);
        }
        if (NIL != var97) {
            f43847(var6, var98, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0699.f42594(var96, f43766(var6))) {
            f43837(var6, var96);
        }
        module0067.f4886(f43785(var6), var96, var98);
        return var98;
    }
    
    public static SubLObject f43845(final SubLObject var6, final SubLObject var1, SubLObject var97) {
        if (var97 == UNPROVIDED) {
            var97 = (SubLObject)NIL;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        assert NIL != module0702.f42828(var1) : var1;
        final SubLObject var99 = f43763(var6, (SubLObject)$ic11$, (SubLObject)UNPROVIDED);
        SubLObject var100 = (SubLObject)NIL;
        if (NIL != f43763(var6, (SubLObject)$ic173$, (SubLObject)UNPROVIDED) && NIL != module0701.f42633(var1, module0701.f42807((SubLObject)$ic174$))) {
            return $ic175$;
        }
        if (NIL != module0708.f43032(var1)) {
            return module0699.f42592(var1);
        }
        if (NIL != module0712.f43666(var1)) {
            var100 = f43848(var1);
            if (NIL == module0173.f10955(var100)) {
                Errors.warn((SubLObject)$ic176$, f43760(var1));
            }
        }
        if (NIL == module0173.f10955(var100) && NIL != module0038.f2684(module0702.f42830(var1), var99)) {
            var100 = f43849(var6, var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == module0173.f10955(var100) && NIL != f43763(var6, (SubLObject)$ic177$, (SubLObject)UNPROVIDED)) {
            var98.resetMultipleValues();
            final SubLObject var101 = module0708.f43034(module0701.f42758(f43766(var6)), var1);
            final SubLObject var102 = var98.secondMultipleValue();
            var98.resetMultipleValues();
            if (NIL != module0038.f2611(var101) && NIL != module0038.f2611(var102)) {
                var100 = f43849(var6, var1, var101, var102);
            }
        }
        if (NIL != var97 && NIL != module0173.f10955(var100)) {
            f43847(var6, var100, var1);
        }
        if (NIL == module0173.f10955(var100)) {
            var100 = module0699.f42592(var1);
        }
        return var100;
    }
    
    public static SubLObject f43847(final SubLObject var6, final SubLObject var98, SubLObject var1) {
        if (var1 == UNPROVIDED) {
            var1 = (SubLObject)NIL;
        }
        assert NIL != f43789(var6) : var6;
        if (NIL != var1 && !areAssertionsDisabledFor(me) && NIL == module0702.f42828(var1)) {
            throw new AssertionError(var1);
        }
        final SubLObject var99 = f43763(var6, (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
        final SubLObject var100 = f43763(var6, (SubLObject)$ic39$, (SubLObject)UNPROVIDED);
        final SubLObject var101 = (SubLObject)((NIL != var1) ? f43850(var6, var1) : NIL);
        module0708.f43031((SubLObject)ConsesLow.list($ic178$, var98, (SubLObject)ConsesLow.list($ic179$, var99)), $ic180$, var98, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL != module0038.f2611(var101)) {
            module0708.f43031((SubLObject)ConsesLow.list($ic181$, var98, var99, var101), var100, var98, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return var98;
    }
    
    public static SubLObject f43849(final SubLObject var6, final SubLObject var1, SubLObject var31, SubLObject var103) {
        if (var31 == UNPROVIDED) {
            var31 = (SubLObject)NIL;
        }
        if (var103 == UNPROVIDED) {
            var103 = (SubLObject)NIL;
        }
        assert NIL != f43789(var6) : var6;
        assert NIL != module0702.f42828(var1) : var1;
        final SubLObject var104 = f43760(var1);
        final SubLObject var105 = f43763(var6, (SubLObject)$ic38$, (SubLObject)UNPROVIDED);
        final SubLObject var106 = f43763(var6, (SubLObject)$ic39$, (SubLObject)UNPROVIDED);
        SubLObject var107 = module0220.f14556(var104, $ic182$, (SubLObject)TWO_INTEGER, (SubLObject)ONE_INTEGER, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var107)) {
            final SubLObject var108 = module0702.f42840(var1);
            if (NIL != module0038.f2608(var108)) {
                return var105;
            }
            SubLObject var109 = f43763(var6, (SubLObject)$ic31$, (SubLObject)UNPROVIDED);
            if (NIL == module0038.f2611(var31)) {
                var31 = f43763(var6, (SubLObject)$ic30$, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0038.f2611(var31) && NIL == module0038.f2673(var31, (SubLObject)$ic32$, (SubLObject)UNPROVIDED)) {
                var31 = Sequences.cconcatenate(var31, (SubLObject)$ic32$);
            }
            if (!var31.isString()) {
                var31 = (SubLObject)$ic10$;
            }
            if (!var109.isString()) {
                var109 = (SubLObject)$ic10$;
            }
            if (NIL == module0038.f2611(var103)) {
                var103 = var108;
            }
            if (NIL != f43763(var6, (SubLObject)$ic183$, (SubLObject)UNPROVIDED)) {
                final SubLObject var110 = f43766(var6);
                final SubLObject var111 = module0701.f42651(var110, var1, module0701.f42807((SubLObject)$ic184$)).first();
                final SubLObject var112 = (SubLObject)((NIL != module0700.f42611(var111, (SubLObject)UNPROVIDED)) ? module0700.f42614(var111) : NIL);
                final SubLObject var113 = (SubLObject)((NIL != module0704.f42888(var112)) ? module0704.f42881(var112) : NIL);
                if (NIL != module0038.f2611(var113)) {
                    var103 = module0038.f2867(var113, module0701.f42643(var110, var1, module0701.f42807((SubLObject)$ic185$), module0701.f42807((SubLObject)$ic186$)));
                }
            }
            if (NIL != module0038.f2611(var109)) {
                var103 = Sequences.cconcatenate(var103, var109);
            }
            if (NIL != module0038.f2608(var31) && NIL != module0038.f2608(var109)) {
                var107 = module0699.f42592(var1);
            }
            else {
                var107 = module0708.f43025(var103, (SubLObject)NIL, var106, var31, (SubLObject)NIL, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0173.f10955(var107)) {
                module0708.f43031((SubLObject)ConsesLow.list($ic182$, var107, f43760(var1)), var106, var107, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (NIL != module0172.f10917(var107)) ? module0172.f10921(var107) : var107;
    }
    
    public static SubLObject f43850(final SubLObject var6, final SubLObject var1) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        assert NIL != f43789(var6) : var6;
        assert NIL != module0702.f42828(var1) : var1;
        final SubLObject var8 = f43763(var6, (SubLObject)$ic11$, (SubLObject)UNPROVIDED);
        final SubLObject var9 = f43763(var6, (SubLObject)$ic9$, (SubLObject)UNPROVIDED);
        if (NIL != module0038.f2668(module0702.f42829(var1), var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            if (NIL != module0038.f2608(var9)) {
                return module0702.f42840(var1);
            }
            if (NIL != module0038.f2611(var9)) {
                return Sequences.cconcatenate(var9, new SubLObject[] { $ic32$, module0702.f42840(var1) });
            }
            return module0702.f42830(var1);
        }
        else {
            if (NIL != module0712.f43666(var1)) {
                return module0702.f42830(var1);
            }
            if (T != f43763(var6, (SubLObject)$ic9$, (SubLObject)UNPROVIDED)) {
                var7.resetMultipleValues();
                final SubLObject var10 = module0708.f43034(module0701.f42758(f43766(var6)), var1);
                final SubLObject var11 = var7.secondMultipleValue();
                var7.resetMultipleValues();
                if (NIL != module0038.f2611(var10) && NIL != module0038.f2611(var11)) {
                    return Sequences.cconcatenate(var10, new SubLObject[] { $ic32$, var11 });
                }
            }
            return module0702.f42830(var1);
        }
    }
    
    public static SubLObject f43848(final SubLObject var1) {
        assert NIL != module0712.f43666(var1) : var1;
        final SubLObject var2 = (NIL != module0702.f42828(var1)) ? module0702.f42840(var1) : module0702.f42840(module0702.f42814(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        SubLObject var3 = (SubLObject)NIL;
        var3 = module0213.f13923(var2);
        if (NIL != module0173.f10955(var3)) {
            return var3;
        }
        var3 = constants_high_oc.f10737(var2);
        if (NIL != module0173.f10955(var3)) {
            return var3;
        }
        var3 = constants_high_oc.f10737(module0038.f2842((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_hyphen, var2));
        if (NIL != module0173.f10955(var3)) {
            return var3;
        }
        var3 = constants_high_oc.f10737(module0038.f2842((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_underbar, var2));
        if (NIL != module0173.f10955(var3)) {
            return var3;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43760(final SubLObject var1) {
        return (SubLObject)(var1.isString() ? var1 : ((NIL != module0702.f42828(var1)) ? module0702.f42830(var1) : $ic10$));
    }
    
    public static SubLObject f43846(final SubLObject var54, final SubLObject var6) {
        final SubLObject var55 = f43766(var6);
        final SubLObject var56 = f43822(var6);
        SubLObject var57 = (SubLObject)NIL;
        if (NIL != module0699.f42594(var54, var55)) {
            final SubLObject var58 = f43843(var6, var54);
            SubLObject var59 = module0699.f42598(var54, var55);
            SubLObject var60 = (SubLObject)NIL;
            var60 = var59.first();
            while (NIL != var59) {
                f43837(var6, var60);
                var59 = var59.rest();
                var60 = var59.first();
            }
            var57 = var58;
        }
        else if (NIL != module0708.f43047(var54, var55)) {
            final SubLObject var61 = module0701.f42665(var55, var54, module0708.f43016((SubLObject)$ic188$));
            SubLObject var62 = (SubLObject)NIL;
            SubLObject var63 = var61;
            SubLObject var64 = (SubLObject)NIL;
            var64 = var63.first();
            while (NIL != var63) {
                SubLObject var27_115 = module0202.f12751(f43842(var6, var64, (SubLObject)UNPROVIDED));
                SubLObject var65 = (SubLObject)NIL;
                var65 = var27_115.first();
                while (NIL != var27_115) {
                    final SubLObject var66 = var65;
                    if (NIL == conses_high.member(var66, var62, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var62 = (SubLObject)ConsesLow.cons(var66, var62);
                    }
                    var27_115 = var27_115.rest();
                    var65 = var27_115.first();
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
            var62 = Sequences.nreverse(var62);
            var57 = (SubLObject)ConsesLow.list($ic189$, reader.bq_cons($ic190$, ConsesLow.append(var62, (SubLObject)NIL)));
        }
        else if (NIL != module0708.f43048(var54, var55)) {
            final SubLObject var67 = module0701.f42665(var55, var54, module0708.f43016((SubLObject)$ic191$));
            SubLObject var68 = (SubLObject)NIL;
            SubLObject var63 = var67;
            SubLObject var69 = (SubLObject)NIL;
            var69 = var63.first();
            while (NIL != var63) {
                SubLObject var27_116 = module0202.f12751(f43842(var6, var69, (SubLObject)UNPROVIDED));
                SubLObject var65 = (SubLObject)NIL;
                var65 = var27_116.first();
                while (NIL != var27_116) {
                    final SubLObject var66 = var65;
                    if (NIL == conses_high.member(var66, var68, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                        var68 = (SubLObject)ConsesLow.cons(var66, var68);
                    }
                    var27_116 = var27_116.rest();
                    var65 = var27_116.first();
                }
                var63 = var63.rest();
                var69 = var63.first();
            }
            var68 = Sequences.nreverse(var68);
            var57 = (SubLObject)ConsesLow.list($ic192$, reader.bq_cons($ic190$, ConsesLow.append(var68, (SubLObject)NIL)));
        }
        else if (NIL != module0708.f43049(var54, var55)) {
            final SubLObject var70 = module0701.f42665(var55, var54, module0708.f43016((SubLObject)$ic193$)).first();
            final SubLObject var71 = f43842(var6, var70, (SubLObject)UNPROVIDED);
            var57 = (SubLObject)ConsesLow.list($ic194$, $ic195$, var71);
        }
        else if (NIL != module0708.f43050(var54, var55)) {
            final SubLObject var72 = module0701.f42651(var55, var54, (SubLObject)UNPROVIDED);
            SubLObject var73 = (SubLObject)NIL;
            SubLObject var74 = (SubLObject)NIL;
            SubLObject var75 = (SubLObject)NIL;
            SubLObject var76 = (SubLObject)NIL;
            SubLObject var77 = (SubLObject)NIL;
            SubLObject var78 = (SubLObject)NIL;
            SubLObject var79 = var72;
            SubLObject var80 = (SubLObject)NIL;
            var80 = var79.first();
            while (NIL != var79) {
                if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)$ic196$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var73 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0699.f42531((SubLObject)$ic88$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var74 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)$ic197$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var75 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)$ic198$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var75 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)$ic199$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var75 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)$ic200$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var75 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0699.f42551((SubLObject)$ic201$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var77 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)$ic202$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var76 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)$ic203$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var76 = var80;
                }
                else if (NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)$ic204$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                    var76 = var80;
                }
                else {
                    var78 = (SubLObject)ConsesLow.cons(var80, var78);
                }
                var79 = var79.rest();
                var80 = var79.first();
            }
            final SubLObject var81 = f43763(var6, (SubLObject)$ic205$, (SubLObject)UNPROVIDED);
            final SubLObject var82 = (SubLObject)((NIL != var75) ? module0700.f42613(var75) : NIL);
            final SubLObject var83 = (SubLObject)((NIL != var76) ? module0700.f42613(var76) : NIL);
            final SubLObject var84 = (SubLObject)((NIL != var76) ? f43842(var6, module0700.f42614(var76), (SubLObject)UNPROVIDED) : NIL);
            final SubLObject var85 = f43842(var6, module0700.f42614(var73), (SubLObject)UNPROVIDED);
            final SubLObject var86 = (SubLObject)((NIL != var75) ? f43842(var6, module0700.f42614(var75), (SubLObject)UNPROVIDED) : NIL);
            final SubLObject var87 = (NIL != var77) ? f43842(var6, module0700.f42614(var77), (SubLObject)UNPROVIDED) : $ic195$;
            if (NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)$ic197$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                if (NIL != var81) {
                    var57 = f43851(var6, var54, $ic206$, var85, var86, (SubLObject)UNPROVIDED);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list($ic207$, var87, (SubLObject)ConsesLow.list($ic208$, (SubLObject)$ic209$, (SubLObject)ConsesLow.list($ic210$, var85, (SubLObject)$ic209$, var86)));
                }
            }
            else if (NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)$ic199$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                if (NIL != var81) {
                    var57 = f43851(var6, var54, $ic211$, var85, var86, (SubLObject)UNPROVIDED);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list($ic207$, var87, (SubLObject)ConsesLow.list($ic208$, (SubLObject)$ic209$, (SubLObject)ConsesLow.list($ic212$, var85, (SubLObject)$ic209$, var86)));
                }
            }
            else if (NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)$ic198$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                if (NIL != var81) {
                    var57 = f43851(var6, var54, $ic213$, var85, var86, (SubLObject)UNPROVIDED);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list($ic207$, var87, (SubLObject)ConsesLow.list($ic208$, (SubLObject)$ic209$, (SubLObject)ConsesLow.list(var85, (SubLObject)$ic209$, var86)));
                }
            }
            else if (NIL != module0701.f42633(var83, module0701.f42634(var55, module0708.f43016((SubLObject)$ic204$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                final SubLObject var88 = (NIL != var82 && NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)$ic200$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) ? var86 : $ic195$;
                if (NIL != var81) {
                    var57 = f43851(var6, var54, $ic214$, var85, var86, var84);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list($ic207$, var87, (SubLObject)ConsesLow.list($ic208$, (SubLObject)$ic209$, (SubLObject)ConsesLow.list($ic215$, var85, (SubLObject)$ic209$, var88, var84)));
                }
            }
            else if (NIL != module0701.f42633(var83, module0701.f42634(var55, module0708.f43016((SubLObject)$ic203$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                final SubLObject var88 = (NIL != var82 && NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)$ic200$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) ? var86 : $ic195$;
                if (NIL != var81) {
                    var57 = f43851(var6, var54, $ic216$, var85, var86, var84);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list($ic207$, var87, (SubLObject)ConsesLow.list($ic208$, (SubLObject)$ic209$, (SubLObject)ConsesLow.list($ic217$, var85, (SubLObject)$ic209$, var88, var84)));
                }
            }
            else if (NIL != module0701.f42633(var83, module0701.f42634(var55, module0708.f43016((SubLObject)$ic202$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) {
                final SubLObject var88 = (NIL != var82 && NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)$ic200$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED))) ? var86 : $ic195$;
                if (NIL != var81) {
                    var57 = f43851(var6, var54, $ic218$, var85, var86, var84);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list($ic207$, var87, (SubLObject)ConsesLow.list($ic208$, (SubLObject)$ic209$, (SubLObject)ConsesLow.list($ic219$, var85, (SubLObject)$ic209$, var88, var84)));
                }
            }
            else {
                Errors.sublisp_break((SubLObject)$ic220$, new SubLObject[] { var72, var73, var74, var75 });
            }
        }
        else if (NIL != module0708.f43051(var54, var55)) {
            final SubLObject var89 = module0701.f42651(var55, var54, module0708.f43016((SubLObject)$ic221$)).first();
            final SubLObject var90 = f43842(var6, module0700.f42614(var89), (SubLObject)UNPROVIDED);
            var57 = reader.bq_cons($ic222$, ConsesLow.append(module0202.f12751(var90), (SubLObject)NIL));
        }
        else {
            final SubLObject var58 = module0708.f43025((SubLObject)$ic223$, (SubLObject)NIL, $ic224$, (SubLObject)$ic10$, (SubLObject)T, var56);
            module0708.f43031(module0202.f12768($ic178$, var58, $ic225$), $ic224$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            var57 = var58;
        }
        return var57;
    }
    
    public static SubLObject f43851(final SubLObject var6, final SubLObject var54, final SubLObject var140, final SubLObject var134, final SubLObject var135, SubLObject var133) {
        if (var133 == UNPROVIDED) {
            var133 = (SubLObject)NIL;
        }
        final SubLObject var141 = f43766(var6);
        final SubLObject var142 = f43763(var6, (SubLObject)$ic39$, (SubLObject)UNPROVIDED);
        final SubLObject var143 = Mapping.mapcar((SubLObject)$ic226$, module0701.f42662(var141, var54, module0701.f42634(var141, module0699.f42551((SubLObject)$ic201$), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)));
        if (NIL == var143) {
            Errors.warn((SubLObject)$ic227$, var54);
            return (SubLObject)NIL;
        }
        SubLObject var144 = var143;
        SubLObject var145 = (SubLObject)NIL;
        var145 = var144.first();
        while (NIL != var144) {
            final SubLObject var146 = f43842(var6, var145, (SubLObject)UNPROVIDED);
            if (NIL == var133) {
                f43852(var6, module0202.f12769(var140, var134, var146, var135), var142, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                f43852(var6, module0202.f12770(var140, var134, var146, var135, var133), var142, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var144 = var144.rest();
            var145 = var144.first();
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43853(final SubLObject var6, final SubLObject var103, final SubLObject var144, final SubLObject var145, final SubLObject var31, final SubLObject var146, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        return module0708.f43025(var103, var144, var145, var31, var146, var5);
    }
    
    public static SubLObject f43854(final SubLObject var6, final SubLObject var147, final SubLObject var148) {
        return module0285.f18993(var147, var148);
    }
    
    public static SubLObject f43852(final SubLObject var6, final SubLObject var149, final SubLObject var150, SubLObject var86, SubLObject var5, SubLObject var151) {
        if (var86 == UNPROVIDED) {
            var86 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var151 == UNPROVIDED) {
            var151 = (SubLObject)T;
        }
        return module0708.f43031(var149, var150, var86, var5, var151);
    }
    
    public static SubLObject f43855(final SubLObject var4, final SubLObject var152, final SubLObject var153, final SubLObject var154, SubLObject var2) {
        if (var2 == UNPROVIDED) {
            var2 = (SubLObject)NIL;
        }
        final SubLObject var155 = f43757(var4, var2);
        return var155;
    }
    
    public static SubLObject f43856(final SubLObject var7, final SubLObject var155, final SubLObject var156, final SubLObject var157, SubLObject var158) {
        if (var158 == UNPROVIDED) {
            var158 = (SubLObject)$ic228$;
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        SubLObject var160 = (SubLObject)NIL;
        final SubLObject var161 = module0701.f42659(var7, var155);
        module0012.$g82$.setDynamicValue(var158, var159);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var159);
        module0012.$g83$.setDynamicValue(Sequences.length(var161), var159);
        module0012.$g84$.setDynamicValue((SubLObject)ZERO_INTEGER, var159);
        final SubLObject var162 = module0012.$g75$.currentBinding(var159);
        final SubLObject var163 = module0012.$g76$.currentBinding(var159);
        final SubLObject var164 = module0012.$g77$.currentBinding(var159);
        final SubLObject var165 = module0012.$g78$.currentBinding(var159);
        try {
            module0012.$g75$.bind((SubLObject)ZERO_INTEGER, var159);
            module0012.$g76$.bind((SubLObject)NIL, var159);
            module0012.$g77$.bind((SubLObject)T, var159);
            module0012.$g78$.bind(Time.get_universal_time(), var159);
            module0012.f478(module0012.$g82$.getDynamicValue(var159));
            SubLObject var166 = var161;
            SubLObject var167 = (SubLObject)NIL;
            var167 = var166.first();
            while (NIL != var166) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var159), module0012.$g83$.getDynamicValue(var159));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var159), (SubLObject)ONE_INTEGER), var159);
                final SubLObject var168 = module0700.f42612(var167);
                final SubLObject var169 = module0700.f42614(var167);
                final SubLObject var170 = module0701.f42651(var7, var169, var156).first();
                final SubLObject var171 = (SubLObject)((NIL != module0700.f42611(var170, (SubLObject)UNPROVIDED)) ? module0700.f42614(var170) : NIL);
                if (NIL != module0701.f42631(var171)) {
                    var160 = (SubLObject)T;
                    module0699.f42599(var7, var169);
                    module0701.f42627(var7, var168, var157, var171);
                }
                var166 = var166.rest();
                var167 = var166.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var165, var159);
            module0012.$g77$.rebind(var164, var159);
            module0012.$g76$.rebind(var163, var159);
            module0012.$g75$.rebind(var162, var159);
        }
        if (NIL != var160) {
            final SubLObject var172 = module0701.f42651(var7, var155, module0701.f42807((SubLObject)$ic229$)).first();
            final SubLObject var173 = (NIL != module0700.f42611(var172, (SubLObject)UNPROVIDED)) ? module0700.f42614(var172) : module0701.f42807((SubLObject)$ic230$);
            final SubLObject var174 = module0701.f42651(var7, var155, module0701.f42807((SubLObject)$ic231$)).first();
            final SubLObject var175 = (NIL != module0700.f42611(var174, (SubLObject)UNPROVIDED)) ? module0700.f42614(var174) : module0701.f42807((SubLObject)$ic230$);
            final SubLObject var176 = Mapping.mapcar((SubLObject)$ic232$, module0701.f42651(var7, var156, module0701.f42807((SubLObject)$ic185$)));
            if (NIL != var176) {
                SubLObject var177 = var176;
                SubLObject var178 = (SubLObject)NIL;
                var178 = var177.first();
                while (NIL != var177) {
                    module0701.f42627(var7, var157, module0701.f42807((SubLObject)$ic185$), var178);
                    var177 = var177.rest();
                    var178 = var177.first();
                }
            }
            else {
                module0701.f42627(var7, var157, module0701.f42807((SubLObject)$ic185$), module0701.f42807((SubLObject)$ic233$));
            }
            module0701.f42627(var7, var157, module0701.f42807((SubLObject)$ic229$), var173);
            module0701.f42627(var7, var157, module0701.f42807((SubLObject)$ic231$), var175);
        }
        module0699.f42599(var7, var155);
        return var160;
    }
    
    public static SubLObject f43857() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43749", "S#47922", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43750", "OWL-IMPORT-URI", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43757", "OWL-IMPORT-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43761", "OWL-IMPORT-URI-FROM-FILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43762", "S#47923", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43758", "OWL-IMPORT-XML-GRAPH-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43756", "S#47924", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43765", "S#47925", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43770", "S#47926", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43751", "S#47927", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43752", "S#47928", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43771", "S#47929", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43772", "S#47930", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43773", "S#47931", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43774", "S#47932", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43753", "S#47933", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43777", "S#47934", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43779", "S#47935", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43780", "S#47936", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43781", "S#47937", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43776", "S#47938", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43783", "S#47939", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43787", "S#47940", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43789", "S#47921", 1, 0, false);
        new $f43789$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43790", "S#47941", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43791", "S#47942", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43792", "S#47943", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43793", "S#47944", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43794", "S#47945", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43795", "S#47946", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43796", "S#47947", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43797", "S#47948", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43798", "S#47949", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43799", "S#47950", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43800", "S#47951", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43801", "S#47952", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43802", "S#47953", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43803", "S#47954", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43804", "S#47955", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43805", "S#47956", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43806", "S#47957", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43807", "S#47958", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43808", "S#47959", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43809", "S#47960", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43810", "S#47961", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43811", "S#47962", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43812", "S#47963", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43813", "S#47964", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43814", "S#47965", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43815", "S#47966", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43816", "S#47967", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43788", "S#47968", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43775", "S#47969", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43759", "S#47970", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43818", "S#47971", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43817", "S#47972", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43778", "S#47973", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43819", "S#47974", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43820", "S#47975", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43821", "S#47976", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43782", "S#47977", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43766", "S#47978", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43784", "S#47979", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43822", "S#47980", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43823", "S#47981", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43824", "S#47982", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43786", "S#47983", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43785", "S#47984", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43825", "S#47985", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43826", "S#47986", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43768", "S#47987", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43827", "S#47988", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43828", "S#47989", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43829", "S#47990", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43830", "S#47991", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43831", "S#47992", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43832", "S#47993", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43754", "S#47994", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43767", "S#47995", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43755", "S#47996", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43763", "S#47997", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43764", "S#47998", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43833", "S#47999", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43834", "S#48000", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43835", "S#48001", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43836", "S#48002", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43769", "S#48003", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43837", "S#48004", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43838", "S#48005", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43840", "S#48006", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43841", "S#48007", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43839", "S#48008", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43843", "S#48009", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43844", "S#48010", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43842", "S#48011", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43845", "S#48012", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43847", "S#48013", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43849", "S#48014", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43850", "S#48015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43848", "S#48016", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43760", "S#48017", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43846", "S#48018", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43851", "S#48019", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43853", "S#48020", 6, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43854", "S#48021", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43852", "S#48022", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43855", "S#48023", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0713", "f43856", "S#48024", 4, 1, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43858() {
        $g5654$ = SubLFiles.defparameter("S#48025", (SubLObject)$ic0$);
        $g5655$ = SubLFiles.deflexical("S#48026", (SubLObject)((NIL != Symbols.boundp((SubLObject)$ic77$)) ? $g5655$.getGlobalValue() : NIL));
        $g5656$ = SubLFiles.defconstant("S#48027", (SubLObject)$ic90$);
        $g5657$ = SubLFiles.deflexical("S#48028", (NIL != Symbols.boundp((SubLObject)$ic147$)) ? $g5657$.getGlobalValue() : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        $g5658$ = SubLFiles.deflexical("S#48029", (NIL != Symbols.boundp((SubLObject)$ic148$)) ? $g5658$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)EQL), (SubLObject)UNPROVIDED));
        $g5659$ = SubLFiles.defparameter("S#48030", (SubLObject)NIL);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f43859() {
        module0002.f38((SubLObject)$ic5$);
        module0002.f38((SubLObject)$ic14$);
        module0002.f38((SubLObject)$ic18$);
        module0002.f38((SubLObject)$ic23$);
        module0003.f57((SubLObject)$ic77$);
        $g5655$.setGlobalValue((SubLObject)$ic78$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $g5656$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic97$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)$ic98$);
        Structures.def_csetf((SubLObject)$ic99$, (SubLObject)$ic100$);
        Structures.def_csetf((SubLObject)$ic101$, (SubLObject)$ic102$);
        Structures.def_csetf((SubLObject)$ic103$, (SubLObject)$ic104$);
        Structures.def_csetf((SubLObject)$ic105$, (SubLObject)$ic106$);
        Structures.def_csetf((SubLObject)$ic107$, (SubLObject)$ic108$);
        Structures.def_csetf((SubLObject)$ic109$, (SubLObject)$ic110$);
        Structures.def_csetf((SubLObject)$ic111$, (SubLObject)$ic112$);
        Structures.def_csetf((SubLObject)$ic113$, (SubLObject)$ic114$);
        Structures.def_csetf((SubLObject)$ic115$, (SubLObject)$ic116$);
        Structures.def_csetf((SubLObject)$ic117$, (SubLObject)$ic118$);
        Structures.def_csetf((SubLObject)$ic119$, (SubLObject)$ic120$);
        Structures.def_csetf((SubLObject)$ic121$, (SubLObject)$ic122$);
        Equality.identity((SubLObject)$ic90$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g5656$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic138$));
        module0012.f419((SubLObject)$ic96$);
        module0003.f57((SubLObject)$ic147$);
        module0003.f57((SubLObject)$ic148$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $g5656$.getGlobalValue(), Symbols.symbol_function((SubLObject)$ic152$));
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f43857();
    }
    
    public void initializeVariables() {
        f43858();
    }
    
    public void runTopLevelForms() {
        f43859();
    }
    
    static {
        me = (SubLFile)new module0713();
        $g5654$ = null;
        $g5655$ = null;
        $g5656$ = null;
        $g5657$ = null;
        $g5658$ = null;
        $g5659$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { makeKeyword("ONTOLOGY-URI"), makeKeyword("ONTOLOGY-TERM"), makeKeyword("ONTOLOGY-MT"), makeKeyword("URI-PREFIX"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("CONSTANT-SUFFIX"), makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES"), makeKeyword("SYNONYMOUS-CONCEPT-PREFIX"), makeKeyword("CYCLIST"), makeKeyword("TEST-MODE"), makeKeyword("VERBOSE?"), makeKeyword("PROGRESS-STREAM"), makeKeyword("GRAPH-TRANSLATION-FUNCTIONS"), makeKeyword("ONLY-ASSERT-RESTRICTIONS-AS-RMP-GAFS?"), makeKeyword("USE-RDFS-LABEL-FOR-CONSTANT-NAME?"), makeKeyword("USE-GENLS-FOR-RDFS-SUBCLASS?") });
        $ic1$ = makeString("OWL Importer usages:~%");
        $ic2$ = makeString(" owl-import-uri (uri &optional importer-options)~%");
        $ic3$ = makeString(" owl-import-file (filename &optional importer-options)~%");
        $ic4$ = makeString(" owl-import-uri-from-file (uri filename &optional importer-options)~%");
        $ic5$ = makeSymbol("OWL-IMPORT-URI");
        $ic6$ = makeString("owl-import-uri");
        $ic7$ = ConsesLow.list((SubLObject)makeKeyword("URI"), (SubLObject)makeKeyword("IMPORTER-OPTIONS"));
        $ic8$ = makeString("Download of URI ~S to temp file failed.");
        $ic9$ = makeKeyword("SYNONYMOUS-CONCEPT-PREFIX");
        $ic10$ = makeString("");
        $ic11$ = makeKeyword("ONTOLOGY-URI");
        $ic12$ = makeKeyword("CYCLIST");
        $ic13$ = makeKeyword("PROGRESS-STREAM");
        $ic14$ = makeSymbol("OWL-IMPORT-FILE");
        $ic15$ = makeString("owl-import-file");
        $ic16$ = ConsesLow.list((SubLObject)makeKeyword("FILENAME"), (SubLObject)makeKeyword("IMPORTER-OPTIONS"));
        $ic17$ = makeKeyword("VERBOSE?");
        $ic18$ = makeSymbol("OWL-IMPORT-URI-FROM-FILE");
        $ic19$ = makeString("owl-import-uri-from-file");
        $ic20$ = ConsesLow.list((SubLObject)makeKeyword("URI"), (SubLObject)makeKeyword("FILENAME"), (SubLObject)makeKeyword("IMPORTER-OPTIONS"));
        $ic21$ = makeKeyword("TEST-MODE");
        $ic22$ = makeKeyword("GRAPH-ONLY");
        $ic23$ = makeSymbol("OWL-IMPORT-XML-GRAPH-FROM-FILE");
        $ic24$ = makeString("Importing XML...");
        $ic25$ = makeKeyword("URI-PREFIX");
        $ic26$ = makeString("~&Using local URI part for #$synonymousExternalConcept assertions~%");
        $ic27$ = makeString("~&Using URI prefix \"~A\" for #$synonymousExternalConcept assertions~%");
        $ic28$ = makeString("~&Using full URIs for #$synonymousExternalConcept assertions~%");
        $ic29$ = makeString("~&Note that synonymous-concept-prefix of ~S and uri-prefix of ~S do not match~%");
        $ic30$ = makeKeyword("CONSTANT-PREFIX");
        $ic31$ = makeKeyword("CONSTANT-SUFFIX");
        $ic32$ = makeString(":");
        $ic33$ = makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic34$ = makeString("Changing constant prefix from ~S to ~S to avoid invalid chars~%");
        $ic35$ = makeString("~&Using prefix \"~A\" for new constants~%");
        $ic36$ = makeString("~&Using suffix \"~A\" for new constants~%");
        $ic37$ = makeString("~&Using #$ResourceWithURIFn NARTs~%");
        $ic38$ = makeKeyword("ONTOLOGY-TERM");
        $ic39$ = makeKeyword("ONTOLOGY-MT");
        $ic40$ = constant_handles_oc.f8479((SubLObject)makeString("retainTerm"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)makeString("OWLOntologyFn"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)makeString("ContextOfPCWFn"));
        $ic44$ = makeString("~&Using ontology-term ");
        $ic45$ = makeString("~&Using ontology-mt ");
        $ic46$ = makeString("~&Using ontology-term ~S~%");
        $ic47$ = makeString("~&Using ontology-mt ~S~%");
        $ic48$ = (SubLList)ConsesLow.cons((SubLObject)makeSymbol("S#10299", "CYC"), (SubLObject)makeSymbol("S#48031", "CYC"));
        $ic49$ = makeString("xml:base");
        $ic50$ = constant_handles_oc.f8479((SubLObject)makeString("baseNamespaceForSKS"));
        $ic51$ = constant_handles_oc.f8479((SubLObject)makeString("URIFn"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)makeString("nameSpacePrefixForSKS"));
        $ic53$ = makeSymbol("FUNCTION-SPEC-P");
        $ic54$ = makeKeyword("GRAPH-TRANSLATION-FUNCTIONS");
        $ic55$ = makeKeyword("NODE-COUNT");
        $ic56$ = makeKeyword("TRIPLE-COUNT");
        $ic57$ = makeString("~A triples~%");
        $ic58$ = makeString("~A nodes~%");
        $ic59$ = makeSymbol("CAR");
        $ic60$ = makeSymbol("S#4084", "CYC");
        $ic61$ = makeSymbol("CDR");
        $ic62$ = makeSymbol(">");
        $ic63$ = makeSymbol("LENGTH");
        $ic64$ = makeSymbol("STRING=");
        $ic65$ = makeKeyword("URI");
        $ic66$ = makeString("~A: URI ~S is not valid~%");
        $ic67$ = makeKeyword("FILENAME");
        $ic68$ = makeString("~A: FILENAME ~S does not exist~%");
        $ic69$ = makeKeyword("IMPORTER-OPTIONS");
        $ic70$ = makeString("~A: IMPORTER-OPTIONS ~S is not a valid property list~%");
        $ic71$ = constant_handles_oc.f8479((SubLObject)makeString("Cyclist"));
        $ic72$ = makeString("~A: IMPORTER-OPTIONS :cyclist ~A is not a #$Cyclist~%");
        $ic73$ = constant_handles_oc.f8479((SubLObject)makeString("Guest"));
        $ic74$ = makeString("~A: Please log in with (set-the-cyclist [Cyc Account])~%");
        $ic75$ = makeString("~A: IMPORTER-OPTIONS has invalid keys: ~A~%");
        $ic76$ = makeString("Errors found, aborting import...");
        $ic77$ = makeSymbol("S#48026", "CYC");
        $ic78$ = makeString("$revision: 1.2 $");
        $ic79$ = makeSymbol("DIGIT-CHAR-P");
        $ic80$ = makeString("2");
        $ic81$ = constant_handles_oc.f8479((SubLObject)makeString("SoftwareVersion"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)makeString("OWLImporter-Cyc"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)makeString("UserOfProgramFn"));
        $ic84$ = makeKeyword("NODES-DONE");
        $ic85$ = makeKeyword("TRIPLES-DONE");
        $ic86$ = makeKeyword("TERMS-CREATED");
        $ic87$ = makeKeyword("ASSERTIONS-CREATED");
        $ic88$ = makeString("type");
        $ic89$ = makeString("Ontology");
        $ic90$ = makeSymbol("S#47920", "CYC");
        $ic91$ = makeSymbol("S#47921", "CYC");
        $ic92$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#1519", "CYC"), makeSymbol("S#47557", "CYC"), makeSymbol("S#2813", "CYC"), makeSymbol("S#10129", "CYC"), makeSymbol("S#710", "CYC"), makeSymbol("IMPORT"), makeSymbol("S#45584", "CYC"), makeSymbol("S#13098", "CYC"), makeSymbol("S#45663", "CYC"), makeSymbol("S#48032", "CYC"), makeSymbol("S#6511", "CYC"), makeSymbol("S#5845", "CYC") });
        $ic93$ = ConsesLow.list(new SubLObject[] { makeKeyword("ID"), makeKeyword("URI"), makeKeyword("FILE"), makeKeyword("GRAPH"), makeKeyword("CYCLIST"), makeKeyword("IMPORT"), makeKeyword("ONTOLOGIES"), makeKeyword("TERMS"), makeKeyword("SENTENCES"), makeKeyword("STATS"), makeKeyword("OPTIONS"), makeKeyword("THREAD") });
        $ic94$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#47941", "CYC"), makeSymbol("S#47942", "CYC"), makeSymbol("S#47943", "CYC"), makeSymbol("S#47944", "CYC"), makeSymbol("S#47945", "CYC"), makeSymbol("S#47946", "CYC"), makeSymbol("S#47947", "CYC"), makeSymbol("S#47948", "CYC"), makeSymbol("S#47949", "CYC"), makeSymbol("S#47950", "CYC"), makeSymbol("S#47951", "CYC"), makeSymbol("S#47952", "CYC") });
        $ic95$ = ConsesLow.list(new SubLObject[] { makeSymbol("S#47953", "CYC"), makeSymbol("S#47954", "CYC"), makeSymbol("S#47955", "CYC"), makeSymbol("S#47956", "CYC"), makeSymbol("S#47957", "CYC"), makeSymbol("S#47958", "CYC"), makeSymbol("S#47959", "CYC"), makeSymbol("S#47960", "CYC"), makeSymbol("S#47961", "CYC"), makeSymbol("S#47962", "CYC"), makeSymbol("S#47963", "CYC"), makeSymbol("S#47964", "CYC") });
        $ic96$ = makeSymbol("S#47968", "CYC");
        $ic97$ = makeSymbol("S#47940", "CYC");
        $ic98$ = ConsesLow.list((SubLObject)makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)makeSymbol("S#47921", "CYC"));
        $ic99$ = makeSymbol("S#47941", "CYC");
        $ic100$ = makeSymbol("S#47953", "CYC");
        $ic101$ = makeSymbol("S#47942", "CYC");
        $ic102$ = makeSymbol("S#47954", "CYC");
        $ic103$ = makeSymbol("S#47943", "CYC");
        $ic104$ = makeSymbol("S#47955", "CYC");
        $ic105$ = makeSymbol("S#47944", "CYC");
        $ic106$ = makeSymbol("S#47956", "CYC");
        $ic107$ = makeSymbol("S#47945", "CYC");
        $ic108$ = makeSymbol("S#47957", "CYC");
        $ic109$ = makeSymbol("S#47946", "CYC");
        $ic110$ = makeSymbol("S#47958", "CYC");
        $ic111$ = makeSymbol("S#47947", "CYC");
        $ic112$ = makeSymbol("S#47959", "CYC");
        $ic113$ = makeSymbol("S#47948", "CYC");
        $ic114$ = makeSymbol("S#47960", "CYC");
        $ic115$ = makeSymbol("S#47949", "CYC");
        $ic116$ = makeSymbol("S#47961", "CYC");
        $ic117$ = makeSymbol("S#47950", "CYC");
        $ic118$ = makeSymbol("S#47962", "CYC");
        $ic119$ = makeSymbol("S#47951", "CYC");
        $ic120$ = makeSymbol("S#47963", "CYC");
        $ic121$ = makeSymbol("S#47952", "CYC");
        $ic122$ = makeSymbol("S#47964", "CYC");
        $ic123$ = makeKeyword("ID");
        $ic124$ = makeKeyword("FILE");
        $ic125$ = makeKeyword("GRAPH");
        $ic126$ = makeKeyword("IMPORT");
        $ic127$ = makeKeyword("ONTOLOGIES");
        $ic128$ = makeKeyword("TERMS");
        $ic129$ = makeKeyword("SENTENCES");
        $ic130$ = makeKeyword("STATS");
        $ic131$ = makeKeyword("OPTIONS");
        $ic132$ = makeKeyword("THREAD");
        $ic133$ = makeString("Invalid slot ~S for construction function");
        $ic134$ = makeKeyword("BEGIN");
        $ic135$ = makeSymbol("S#47965", "CYC");
        $ic136$ = makeKeyword("SLOT");
        $ic137$ = makeKeyword("END");
        $ic138$ = makeSymbol("S#47967", "CYC");
        $ic139$ = makeString("<OWL-IMPORTER ~D for ~A>");
        $ic140$ = makeSymbol("URL-P");
        $ic141$ = makeSymbol("S#6825", "CYC");
        $ic142$ = makeSymbol("FORT-P");
        $ic143$ = makeSymbol("S#748", "CYC");
        $ic144$ = makeSymbol("S#46652", "CYC");
        $ic145$ = makeString("No import owl:Ontology URI found.  Aborting.");
        $ic146$ = constant_handles_oc.f8479((SubLObject)makeString("SoftwareVersionFn"));
        $ic147$ = makeSymbol("S#48028", "CYC");
        $ic148$ = makeSymbol("S#48029", "CYC");
        $ic149$ = makeSymbol("S#747", "CYC");
        $ic150$ = makeSymbol("S#46508", "CYC");
        $ic151$ = makeSymbol("PROCESSP");
        $ic152$ = makeSymbol("S#48001", "CYC");
        $ic153$ = makeString("Importing ");
        $ic154$ = makeString(" triples...");
        $ic155$ = makeString("node-count: ~A~%");
        $ic156$ = makeString("real-node-count: ~A~%");
        $ic157$ = makeString("triple-count: ~A~%");
        $ic158$ = makeString("real-triple-count: ~A~%");
        $ic159$ = makeInteger(40);
        $ic160$ = makeString("Assert nesting depth: ~D");
        $ic161$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic162$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("OWLProperty")));
        $ic163$ = makeString("Failed to assert ~S in ~S");
        $ic164$ = makeString("~%");
        $ic165$ = makeString("~S is not a list node.");
        $ic166$ = makeString("nil");
        $ic167$ = constant_handles_oc.f8479((SubLObject)makeString("TheEmptyList"));
        $ic168$ = constant_handles_oc.f8479((SubLObject)makeString("TheList"));
        $ic169$ = makeString("first");
        $ic170$ = makeSymbol("S#46526", "CYC");
        $ic171$ = makeString("rest");
        $ic172$ = makeString("Can't find or create term for ~S");
        $ic173$ = makeKeyword("USE-GENLS-FOR-RDFS-SUBCLASS?");
        $ic174$ = makeString("rdfs:subClassOf");
        $ic175$ = constant_handles_oc.f8479((SubLObject)makeString("genls"));
        $ic176$ = makeString("Could not find Cyc term for URI ~A");
        $ic177$ = makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES");
        $ic178$ = constant_handles_oc.f8479((SubLObject)makeString("quotedIsa"));
        $ic179$ = constant_handles_oc.f8479((SubLObject)makeString("TermFromOntologyFn"));
        $ic180$ = constant_handles_oc.f8479((SubLObject)makeString("BookkeepingMt"));
        $ic181$ = constant_handles_oc.f8479((SubLObject)makeString("synonymousExternalConcept"));
        $ic182$ = constant_handles_oc.f8479((SubLObject)makeString("rdfURI"));
        $ic183$ = makeKeyword("USE-RDFS-LABEL-FOR-CONSTANT-NAME?");
        $ic184$ = makeString("rdfs:label");
        $ic185$ = makeString("rdf:type");
        $ic186$ = makeString("owl:Class");
        $ic187$ = makeSymbol("S#46534", "CYC");
        $ic188$ = makeString("intersectionOf");
        $ic189$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionIntersectionFn"));
        $ic190$ = constant_handles_oc.f8479((SubLObject)makeString("TheSet"));
        $ic191$ = makeString("unionOf");
        $ic192$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionUnionFn"));
        $ic193$ = makeString("complementOf");
        $ic194$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionDifferenceFn"));
        $ic195$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic196$ = makeString("onProperty");
        $ic197$ = makeString("allValuesFrom");
        $ic198$ = makeString("hasValue");
        $ic199$ = makeString("someValuesFrom");
        $ic200$ = makeString("valuesFrom");
        $ic201$ = makeString("subClassOf");
        $ic202$ = makeString("cardinality");
        $ic203$ = makeString("minCardinality");
        $ic204$ = makeString("maxCardinality");
        $ic205$ = makeKeyword("ONLY-ASSERT-RESTRICTIONS-AS-RMP-GAFS?");
        $ic206$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllOnly"));
        $ic207$ = constant_handles_oc.f8479((SubLObject)makeString("CollectionSubsetFn"));
        $ic208$ = constant_handles_oc.f8479((SubLObject)makeString("TheSetOf"));
        $ic209$ = makeSymbol("?X");
        $ic210$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceOnly"));
        $ic211$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExists"));
        $ic212$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExists"));
        $ic213$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllInstance"));
        $ic214$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMax"));
        $ic215$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMax"));
        $ic216$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsMin"));
        $ic217$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsMin"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)makeString("relationAllExistsCount"));
        $ic219$ = constant_handles_oc.f8479((SubLObject)makeString("relationInstanceExistsCount"));
        $ic220$ = makeString("restriction not handled yet: ~A~% ~A~% ~A~% ~A~%");
        $ic221$ = makeString("oneOf");
        $ic222$ = constant_handles_oc.f8479((SubLObject)makeString("TheCollection"));
        $ic223$ = makeString("AnonymousOWLTerm");
        $ic224$ = constant_handles_oc.f8479((SubLObject)makeString("UniversalVocabularyMt"));
        $ic225$ = constant_handles_oc.f8479((SubLObject)makeString("IndeterminateTerm"));
        $ic226$ = makeSymbol("S#46525", "CYC");
        $ic227$ = makeString("~&~A was not the object of any rdfs:subClassOf triples!  No RMP assertion made.~%");
        $ic228$ = makeString("Eliminating blank nodes...");
        $ic229$ = makeString("rdfs:domain");
        $ic230$ = makeString("owl:Thing");
        $ic231$ = makeString("rdfs:range");
        $ic232$ = makeSymbol("S#46521", "CYC");
        $ic233$ = makeString("rdf:Property");
    }
    
    public static final class $sX47920_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $uri;
        public SubLObject $file;
        public SubLObject $graph;
        public SubLObject $cyclist;
        public SubLObject $import;
        public SubLObject $ontologies;
        public SubLObject $terms;
        public SubLObject $sentences;
        public SubLObject $stats;
        public SubLObject $options;
        public SubLObject $thread;
        public static final SubLStructDeclNative structDecl;
        
        public $sX47920_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$uri = (SubLObject)CommonSymbols.NIL;
            this.$file = (SubLObject)CommonSymbols.NIL;
            this.$graph = (SubLObject)CommonSymbols.NIL;
            this.$cyclist = (SubLObject)CommonSymbols.NIL;
            this.$import = (SubLObject)CommonSymbols.NIL;
            this.$ontologies = (SubLObject)CommonSymbols.NIL;
            this.$terms = (SubLObject)CommonSymbols.NIL;
            this.$sentences = (SubLObject)CommonSymbols.NIL;
            this.$stats = (SubLObject)CommonSymbols.NIL;
            this.$options = (SubLObject)CommonSymbols.NIL;
            this.$thread = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SstructDecl;
        }
        
        public SubLObject getField2() {
            return this.$id;
        }
        
        public SubLObject getField3() {
            return this.$uri;
        }
        
        public SubLObject getField4() {
            return this.$file;
        }
        
        public SubLObject getField5() {
            return this.$graph;
        }
        
        public SubLObject getField6() {
            return this.$cyclist;
        }
        
        public SubLObject getField7() {
            return this.$import;
        }
        
        public SubLObject getField8() {
            return this.$ontologies;
        }
        
        public SubLObject getField9() {
            return this.$terms;
        }
        
        public SubLObject getField10() {
            return this.$sentences;
        }
        
        public SubLObject getField11() {
            return this.$stats;
        }
        
        public SubLObject getField12() {
            return this.$options;
        }
        
        public SubLObject getField13() {
            return this.$thread;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$uri = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$file = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$graph = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$cyclist = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$import = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$ontologies = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$terms = value;
        }
        
        public SubLObject setField10(final SubLObject value) {
            return this.$sentences = value;
        }
        
        public SubLObject setField11(final SubLObject value) {
            return this.$stats = value;
        }
        
        public SubLObject setField12(final SubLObject value) {
            return this.$options = value;
        }
        
        public SubLObject setField13(final SubLObject value) {
            return this.$thread = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX47920_native.class, $ic90$, $ic91$, $ic92$, $ic93$, new String[] { "$id", "$uri", "$file", "$graph", "$cyclist", "$import", "$ontologies", "$terms", "$sentences", "$stats", "$options", "$thread" }, $ic94$, $ic95$, $ic96$);
        }
    }
    
    public static final class $f43789$UnaryFunction extends UnaryFunction
    {
        public $f43789$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47921"));
        }
        
        public SubLObject processItem(final SubLObject var59) {
            return f43789(var59);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 872 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/