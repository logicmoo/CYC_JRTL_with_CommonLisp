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
        module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic1$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic2$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic3$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic4$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43750(final SubLObject var1, SubLObject var2) {
        if (var2 == module0713.UNPROVIDED) {
            var2 = (SubLObject)module0713.NIL;
        }
        final SubLThread var3 = SubLProcess.currentSubLThread();
        var2 = conses_high.copy_list(var2);
        f43751((SubLObject)module0713.$ic6$, module0035.f2333((SubLObject)module0713.$ic7$, (SubLObject)ConsesLow.list(var1, var2)));
        final SubLObject var4 = module0699.f42601(var1, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL == module0075.f5218(var4)) {
            Errors.error((SubLObject)module0713.$ic8$, var1);
        }
        final SubLObject var5 = f43752(var2);
        final SubLObject var6 = f43753(var4, var5, var1);
        f43754(var6, var2);
        f43755(var6, (SubLObject)module0713.$ic9$, (SubLObject)module0713.$ic10$);
        f43755(var6, (SubLObject)module0713.$ic11$, var1);
        f43755(var6, (SubLObject)module0713.$ic12$, var5);
        f43755(var6, (SubLObject)module0713.$ic13$, StreamsLow.$standard_output$.getDynamicValue(var3));
        return f43756(var6);
    }
    
    public static SubLObject f43757(final SubLObject var4, SubLObject var2) {
        if (var2 == module0713.UNPROVIDED) {
            var2 = (SubLObject)module0713.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var2 = conses_high.copy_list(var2);
        f43751((SubLObject)module0713.$ic15$, module0035.f2333((SubLObject)module0713.$ic16$, (SubLObject)ConsesLow.list(var4, var2)));
        SubLObject var6 = (SubLObject)module0713.NIL;
        final SubLObject var7 = module0012.$silent_progressP$.currentBinding(var5);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0713.NIL == conses_high.getf(var2, (SubLObject)module0713.$ic17$, (SubLObject)module0713.UNPROVIDED)), var5);
            var6 = f43758(var4);
        }
        finally {
            module0012.$silent_progressP$.rebind(var7, var5);
        }
        final SubLObject var8 = f43752(var2);
        final SubLObject var9 = f43759(var6, var8, var2);
        final SubLObject var10 = module0701.f42703(var6);
        final SubLObject var11 = (SubLObject)((module0713.NIL != module0702.f42828(var10)) ? f43760(var10) : module0713.NIL);
        f43754(var9, var2);
        f43755(var9, (SubLObject)module0713.$ic9$, (SubLObject)module0713.$ic10$);
        if (module0713.NIL != module0589.f35909(var11)) {
            f43755(var9, (SubLObject)module0713.$ic11$, var11);
        }
        f43755(var9, (SubLObject)module0713.$ic12$, var8);
        f43755(var9, (SubLObject)module0713.$ic13$, StreamsLow.$standard_output$.getDynamicValue(var5));
        return f43756(var9);
    }
    
    public static SubLObject f43761(final SubLObject var1, final SubLObject var4, SubLObject var2) {
        if (var2 == module0713.UNPROVIDED) {
            var2 = (SubLObject)module0713.NIL;
        }
        final SubLThread var5 = SubLProcess.currentSubLThread();
        var2 = conses_high.copy_list(var2);
        f43751((SubLObject)module0713.$ic19$, module0035.f2333((SubLObject)module0713.$ic20$, (SubLObject)ConsesLow.list(var1, var4, var2)));
        final SubLObject var6 = f43752(var2);
        final SubLObject var7 = f43753(var4, var6, var1);
        f43754(var7, var2);
        f43755(var7, (SubLObject)module0713.$ic9$, (SubLObject)module0713.$ic10$);
        f43755(var7, (SubLObject)module0713.$ic11$, var1);
        f43755(var7, (SubLObject)module0713.$ic12$, var6);
        f43755(var7, (SubLObject)module0713.$ic13$, StreamsLow.$standard_output$.getDynamicValue(var5));
        return f43756(var7);
    }
    
    public static SubLObject f43762(final SubLObject var4, SubLObject var2) {
        if (var2 == module0713.UNPROVIDED) {
            var2 = (SubLObject)module0713.NIL;
        }
        var2 = conses_high.putf(var2, (SubLObject)module0713.$ic21$, (SubLObject)module0713.$ic22$);
        return f43757(var4, var2);
    }
    
    public static SubLObject f43758(final SubLObject var4) {
        final SubLThread var5 = SubLProcess.currentSubLThread();
        SubLObject var6 = (SubLObject)module0713.NIL;
        final SubLObject var7 = (SubLObject)module0713.$ic24$;
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
            module0012.$g67$.bind((SubLObject)module0713.ONE_INTEGER, var5);
            module0012.$g68$.bind((SubLObject)module0713.ZERO_INTEGER, var5);
            module0012.$g66$.bind((SubLObject)module0713.ZERO_INTEGER, var5);
            module0012.$g69$.bind((SubLObject)module0713.ZERO_INTEGER, var5);
            module0012.$g70$.bind((SubLObject)module0713.T, var5);
            module0012.$silent_progressP$.bind((SubLObject)((module0713.NIL != var7) ? module0012.$silent_progressP$.getDynamicValue(var5) : module0713.T), var5);
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
        final SubLObject var8 = f43763(var6, (SubLObject)module0713.$ic17$, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL != var8) {
            module0708.f43052(f43764(var6));
        }
        if (module0713.$ic22$ == f43763(var6, (SubLObject)module0713.$ic21$, (SubLObject)module0713.UNPROVIDED)) {
            return var6;
        }
        final SubLObject var9 = f43763(var6, (SubLObject)module0713.$ic11$, (SubLObject)module0713.UNPROVIDED);
        SubLObject var10 = f43763(var6, (SubLObject)module0713.$ic25$, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var11 = f43763(var6, (SubLObject)module0713.$ic9$, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL == var10) {
            var10 = f43765(var9, module0701.f42758(f43766(var6)));
            if (module0713.NIL != module0038.f2611(var10)) {
                f43767(var6, (SubLObject)module0713.$ic25$, var10);
            }
            else {
                var10 = (SubLObject)module0713.$ic10$;
                f43767(var6, (SubLObject)module0713.$ic25$, (SubLObject)module0713.$ic10$);
            }
        }
        if (module0713.NIL != module0038.f2608(var11)) {
            if (module0713.NIL != var8) {
                module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic26$, var11, var9, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
        }
        else if (module0713.NIL != module0038.f2611(var11)) {
            if (module0713.NIL != var8) {
                module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic27$, var11, var9, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
        }
        else if (module0713.NIL != var8) {
            module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic28$, var11, var9, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        }
        if (module0713.NIL != module0038.f2611(var11) && module0713.NIL == Strings.stringE(var10, var11, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED) && module0713.NIL != var8) {
            module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic29$, var11, var10, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        }
        SubLObject var12 = f43763(var6, (SubLObject)module0713.$ic30$, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var13 = f43763(var6, (SubLObject)module0713.$ic31$, (SubLObject)module0713.UNPROVIDED);
        if ((module0713.NIL == module0038.f2611(var12) || (module0713.NIL != var13 && module0713.NIL == module0038.f2611(var13))) && module0713.NIL != module0038.f2611(var10)) {
            var12 = Sequences.cconcatenate(var10, (SubLObject)module0713.$ic32$);
        }
        if (module0713.NIL != module0038.f2611(var12)) {
            final SubLObject var14 = module0035.remove_if_not((SubLObject)module0713.$ic33$, var12, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            if (module0713.NIL == Strings.stringE(var12, var14, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED)) {
                if (module0713.NIL != var8) {
                    module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic34$, var12, var14, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                }
                var12 = var14;
            }
        }
        f43767(var6, (SubLObject)module0713.$ic30$, var12);
        f43767(var6, (SubLObject)module0713.$ic31$, var13);
        if (module0713.NIL != var8) {
            if (module0713.NIL != module0038.f2611(var12)) {
                if (module0713.NIL == module0038.f2673(var12, (SubLObject)module0713.$ic32$, (SubLObject)module0713.UNPROVIDED)) {
                    var12 = Sequences.cconcatenate(var12, (SubLObject)module0713.$ic32$);
                }
                module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic35$, var12, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
            if (module0713.NIL != module0038.f2611(var13)) {
                module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic36$, var13, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
            if (module0713.NIL != module0038.f2608(var12) && module0713.NIL != module0038.f2608(var13)) {
                module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic37$, var10, var9, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
        }
        SubLObject var15 = f43763(var6, (SubLObject)module0713.$ic38$, (SubLObject)module0713.UNPROVIDED);
        SubLObject var16 = f43763(var6, (SubLObject)module0713.$ic39$, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var17 = module0012.$silent_progressP$.currentBinding(var7);
        try {
            module0012.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(module0713.NIL == var8), var7);
            if (module0713.NIL == module0173.f10955(var15)) {
                module0708.f43031((SubLObject)ConsesLow.list(module0713.$ic40$, (SubLObject)ConsesLow.list(module0713.$ic41$, var9)), module0713.$ic42$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                var15 = module0285.f18993((SubLObject)ConsesLow.list(module0713.$ic41$, var9), (SubLObject)module0713.UNPROVIDED);
                f43767(var6, (SubLObject)module0713.$ic38$, var15);
            }
            if (module0713.NIL == module0161.f10481(var16)) {
                var16 = module0285.f18993((SubLObject)ConsesLow.list(module0713.$ic43$, var15), (SubLObject)module0713.UNPROVIDED);
                f43767(var6, (SubLObject)module0713.$ic39$, var16);
            }
            if (module0713.NIL != var8) {
                if (module0015.$g131$.getDynamicValue(var7).equal(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED))) {
                    module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic44$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                    module0656.f39804(var15, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                    streams_high.terpri((SubLObject)module0713.UNPROVIDED);
                    module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic45$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                    module0656.f39804(var16, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                    streams_high.terpri((SubLObject)module0713.UNPROVIDED);
                }
                else {
                    module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic46$, module0172.f10930(var15), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                    module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic47$, module0172.f10930(var16), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                }
            }
            SubLObject var18 = module0701.f42758(f43766(var6));
            SubLObject var19 = (SubLObject)module0713.NIL;
            var19 = var18.first();
            while (module0713.NIL != var18) {
                SubLObject var21;
                final SubLObject var20 = var21 = var19;
                SubLObject var22 = (SubLObject)module0713.NIL;
                SubLObject var23 = (SubLObject)module0713.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var21, var20, (SubLObject)module0713.$ic48$);
                var22 = var21.first();
                var21 = (var23 = var21.rest());
                if (module0713.NIL != module0589.f35909(var23)) {
                    if (module0713.NIL != Strings.stringE(var22, (SubLObject)module0713.$ic49$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED)) {
                        module0708.f43031((SubLObject)ConsesLow.list(module0713.$ic50$, var15, (SubLObject)ConsesLow.list(module0713.$ic51$, var23)), var16, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                    }
                    else {
                        module0708.f43031((SubLObject)ConsesLow.list(module0713.$ic52$, var15, var22, (SubLObject)ConsesLow.list(module0713.$ic51$, var23)), var16, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                    }
                }
                var18 = var18.rest();
                var19 = var18.first();
            }
            final SubLObject var24 = module0035.remove_if_not((SubLObject)module0713.$ic53$, f43763(var6, (SubLObject)module0713.$ic54$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            if (module0713.NIL != var24) {
                final SubLObject var25 = f43766(var6);
                SubLObject var26 = var24;
                SubLObject var27 = (SubLObject)module0713.NIL;
                var27 = var26.first();
                while (module0713.NIL != var26) {
                    Functions.funcall(var27, var25, var8);
                    var26 = var26.rest();
                    var27 = var26.first();
                }
                f43768(var6, (SubLObject)module0713.$ic55$, module0701.f42752(var25));
                f43768(var6, (SubLObject)module0713.$ic56$, module0701.f42686(var25));
            }
            if (module0713.NIL != var8) {
                module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic57$, module0701.f42686(f43766(var6)), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic58$, module0701.f42752(f43766(var6)), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
            f43769(var6);
        }
        finally {
            module0012.$silent_progressP$.rebind(var17, var7);
        }
        return var6;
    }
    
    public static SubLObject f43765(final SubLObject var1, final SubLObject var35) {
        return Sort.sort(Mapping.mapcar((SubLObject)module0713.$ic59$, module0035.f2109(var1, var35, (SubLObject)module0713.$ic60$, (SubLObject)module0713.$ic61$)), (SubLObject)module0713.$ic62$, (SubLObject)module0713.$ic63$).first();
    }
    
    public static SubLObject f43770(final SubLObject var35) {
        return Sort.sort(Mapping.mapcar((SubLObject)module0713.$ic61$, module0035.f2109((SubLObject)module0713.$ic10$, var35, (SubLObject)module0713.$ic64$, (SubLObject)module0713.$ic59$)), (SubLObject)module0713.$ic62$, (SubLObject)module0713.$ic63$).first();
    }
    
    public static SubLObject f43751(final SubLObject var36, final SubLObject var37) {
        final SubLThread var38 = SubLProcess.currentSubLThread();
        SubLObject var39 = (SubLObject)module0713.NIL;
        if (module0713.NIL != module0035.f2346(var37, (SubLObject)module0713.$ic65$) && module0713.NIL == module0589.f35909(conses_high.getf(var37, (SubLObject)module0713.$ic65$, (SubLObject)module0713.UNPROVIDED))) {
            module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic66$, var36, conses_high.getf(var37, (SubLObject)module0713.$ic65$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            var39 = (SubLObject)module0713.T;
        }
        if (module0713.NIL != module0035.f2346(var37, (SubLObject)module0713.$ic67$) && module0713.NIL == module0075.f5218(conses_high.getf(var37, (SubLObject)module0713.$ic67$, (SubLObject)module0713.UNPROVIDED))) {
            module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic68$, var36, conses_high.getf(var37, (SubLObject)module0713.$ic67$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            var39 = (SubLObject)module0713.T;
        }
        final SubLObject var40 = conses_high.getf(var37, (SubLObject)module0713.$ic69$, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL == module0035.f2327(var40)) {
            module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic70$, var36, conses_high.getf(var37, (SubLObject)module0713.$ic69$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            var39 = (SubLObject)module0713.T;
        }
        final SubLObject var41 = conses_high.getf(var40, (SubLObject)module0713.$ic12$, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL != var41) {
            if (module0713.NIL == module0259.f16891(var41, module0713.$ic71$)) {
                module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic72$, var36, var40, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                var39 = (SubLObject)module0713.T;
            }
        }
        else if (module0713.NIL == module0259.f16891(module0574.f35152(), module0713.$ic71$) || module0713.$ic73$.eql(module0574.f35152())) {
            module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic74$, var36, var40, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            var39 = (SubLObject)module0713.T;
        }
        final SubLObject var42 = conses_high.set_difference(module0035.f2354(var40), module0713.$g5654$.getDynamicValue(var38), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL != var42) {
            module0006.f218((SubLObject)module0713.T, (SubLObject)module0713.$ic75$, var36, var42, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            var39 = (SubLObject)module0713.T;
        }
        if (module0713.NIL != var39) {
            f43749();
            Errors.error((SubLObject)module0713.$ic76$);
        }
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43752(final SubLObject var2) {
        SubLObject var3 = conses_high.getf(var2, (SubLObject)module0713.$ic12$, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL == module0173.f10955(var3)) {
            var3 = module0574.f35152();
        }
        return var3;
    }
    
    public static SubLObject f43771() {
        final SubLObject var41 = Sequences.position_if((SubLObject)module0713.$ic79$, module0713.$g5655$.getGlobalValue(), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var42 = module0038.f2666(module0038.f2623(module0713.$g5655$.getGlobalValue(), var41, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.TWO_INTEGER);
        module0038.f2743((SubLObject)module0713.ZERO_INTEGER, var42, (SubLObject)Characters.CHAR_2, (SubLObject)module0713.UNPROVIDED);
        return var42;
    }
    
    public static SubLObject f43772(final SubLObject var43, final SubLObject var44, SubLObject var5) {
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        final SubLObject var45 = module0699.f42601(var43, (SubLObject)module0713.UNPROVIDED);
        return f43773(var45, var44, var5, var43);
    }
    
    public static SubLObject f43773(final SubLObject var46, final SubLObject var44, SubLObject var5, SubLObject var47) {
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var47 == module0713.UNPROVIDED) {
            var47 = (SubLObject)module0713.NIL;
        }
        final SubLObject var48 = f43753(var46, var5, var47);
        f43769(var48);
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43774(final SubLObject var43, SubLObject var5) {
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        final SubLObject var44 = module0699.f42601(var43, (SubLObject)module0713.UNPROVIDED);
        return f43753(var44, var5, var43);
    }
    
    public static SubLObject f43753(final SubLObject var46, SubLObject var5, SubLObject var47) {
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var47 == module0713.UNPROVIDED) {
            var47 = (SubLObject)module0713.NIL;
        }
        final SubLObject var48 = f43775(var47, var46, var5, (SubLObject)module0713.UNPROVIDED);
        f43776(var48, var47);
        return var48;
    }
    
    public static SubLObject f43777(final SubLObject var48) {
        return module0067.f4885(f43778(), var48, (SubLObject)module0713.UNPROVIDED);
    }
    
    public static SubLObject f43779() {
        final SubLObject var41 = Sequences.position((SubLObject)Characters.CHAR_period, module0713.$g5655$.getGlobalValue(), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        return Sequences.cconcatenate((SubLObject)module0713.$ic80$, module0038.f2666(module0038.f2623(module0713.$g5655$.getGlobalValue(), var41, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.TWO_INTEGER));
    }
    
    public static SubLObject f43780(final SubLObject var7, final SubLObject var44, SubLObject var5) {
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        final SubLObject var45 = f43759(var7, var5, (SubLObject)module0713.UNPROVIDED);
        f43769(var45);
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43781(final SubLObject var5) {
        final SubLObject var6 = f43779();
        final SubLObject var7 = module0202.f12768(module0713.$ic81$, module0713.$ic82$, var6);
        return module0285.f18993(module0202.f12768(module0713.$ic83$, var7, var5), (SubLObject)module0713.UNPROVIDED);
    }
    
    public static SubLObject f43776(final SubLObject var6, SubLObject var47) {
        if (var47 == module0713.UNPROVIDED) {
            var47 = (SubLObject)module0713.NIL;
        }
        final SubLObject var48 = module0705.f42913(f43782(var6), var47);
        return f43783(var6, var48);
    }
    
    public static SubLObject f43783(final SubLObject var6, final SubLObject var7) {
        final SubLThread var8 = SubLProcess.currentSubLThread();
        f43784(var6, var7);
        final SubLObject var9 = module0701.f42689(var7);
        SubLObject var10 = (SubLObject)module0713.NIL;
        try {
            var10 = ReadWriteLocks.rw_lock_seize_read_lock(var9);
            final SubLObject var11 = module0701.f42690(var7);
            SubLObject var14;
            for (SubLObject var12 = (SubLObject)module0713.NIL; module0713.NIL == var12; var12 = (SubLObject)SubLObjectFactory.makeBoolean(module0713.NIL == var14)) {
                var8.resetMultipleValues();
                final SubLObject var13 = module0052.f3693(var11);
                var14 = var8.secondMultipleValue();
                var8.resetMultipleValues();
                if (module0713.NIL != var14) {
                    module0067.f4886(f43785(var6), var13, (SubLObject)module0713.NIL);
                }
            }
        }
        finally {
            if (module0713.NIL != var10) {
                ReadWriteLocks.rw_lock_release_read_lock(var9);
            }
        }
        f43768(var6, (SubLObject)module0713.$ic55$, module0701.f42752(var7));
        f43768(var6, (SubLObject)module0713.$ic56$, module0701.f42686(var7));
        f43768(var6, (SubLObject)module0713.$ic84$, (SubLObject)module0713.ZERO_INTEGER);
        f43768(var6, (SubLObject)module0713.$ic85$, (SubLObject)module0713.ZERO_INTEGER);
        f43768(var6, (SubLObject)module0713.$ic86$, (SubLObject)module0713.ZERO_INTEGER);
        f43768(var6, (SubLObject)module0713.$ic87$, (SubLObject)module0713.ZERO_INTEGER);
        final SubLObject var15 = module0701.f42657(var7, module0699.f42531((SubLObject)module0713.$ic88$), module0708.f43016((SubLObject)module0713.$ic89$));
        f43786(var6, var15);
        return var7;
    }
    
    public static SubLObject f43787(final SubLObject var57, final SubLObject var58) {
        f43788(var57, var58, (SubLObject)module0713.ZERO_INTEGER);
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43789(final SubLObject var57) {
        return (SubLObject)((var57.getClass() == $sX47920_native.class) ? module0713.T : module0713.NIL);
    }
    
    public static SubLObject f43790(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField2();
    }
    
    public static SubLObject f43791(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField3();
    }
    
    public static SubLObject f43792(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField4();
    }
    
    public static SubLObject f43793(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField5();
    }
    
    public static SubLObject f43794(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField6();
    }
    
    public static SubLObject f43795(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField7();
    }
    
    public static SubLObject f43796(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField8();
    }
    
    public static SubLObject f43797(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField9();
    }
    
    public static SubLObject f43798(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField10();
    }
    
    public static SubLObject f43799(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField11();
    }
    
    public static SubLObject f43800(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField12();
    }
    
    public static SubLObject f43801(final SubLObject var57) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.getField13();
    }
    
    public static SubLObject f43802(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField2(var60);
    }
    
    public static SubLObject f43803(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField3(var60);
    }
    
    public static SubLObject f43804(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField4(var60);
    }
    
    public static SubLObject f43805(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField5(var60);
    }
    
    public static SubLObject f43806(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField6(var60);
    }
    
    public static SubLObject f43807(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField7(var60);
    }
    
    public static SubLObject f43808(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField8(var60);
    }
    
    public static SubLObject f43809(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField9(var60);
    }
    
    public static SubLObject f43810(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField10(var60);
    }
    
    public static SubLObject f43811(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField11(var60);
    }
    
    public static SubLObject f43812(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField12(var60);
    }
    
    public static SubLObject f43813(final SubLObject var57, final SubLObject var60) {
        assert module0713.NIL != f43789(var57) : var57;
        return var57.setField13(var60);
    }
    
    public static SubLObject f43814(SubLObject var61) {
        if (var61 == module0713.UNPROVIDED) {
            var61 = (SubLObject)module0713.NIL;
        }
        final SubLObject var62 = (SubLObject)new $sX47920_native();
        SubLObject var63;
        SubLObject var64;
        SubLObject var65;
        SubLObject var66;
        for (var63 = (SubLObject)module0713.NIL, var63 = var61; module0713.NIL != var63; var63 = conses_high.cddr(var63)) {
            var64 = var63.first();
            var65 = conses_high.cadr(var63);
            var66 = var64;
            if (var66.eql((SubLObject)module0713.$ic123$)) {
                f43802(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic65$)) {
                f43803(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic124$)) {
                f43804(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic125$)) {
                f43805(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic12$)) {
                f43806(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic126$)) {
                f43807(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic127$)) {
                f43808(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic128$)) {
                f43809(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic129$)) {
                f43810(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic130$)) {
                f43811(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic131$)) {
                f43812(var62, var65);
            }
            else if (var66.eql((SubLObject)module0713.$ic132$)) {
                f43813(var62, var65);
            }
            else {
                Errors.error((SubLObject)module0713.$ic133$, var64);
            }
        }
        return var62;
    }
    
    public static SubLObject f43815(final SubLObject var67, final SubLObject var68) {
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic134$, (SubLObject)module0713.$ic135$, (SubLObject)module0713.TWELVE_INTEGER);
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic123$, f43790(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic65$, f43791(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic124$, f43792(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic125$, f43793(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic12$, f43794(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic126$, f43795(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic127$, f43796(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic128$, f43797(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic129$, f43798(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic130$, f43799(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic131$, f43800(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic136$, (SubLObject)module0713.$ic132$, f43801(var67));
        Functions.funcall(var68, var67, (SubLObject)module0713.$ic137$, (SubLObject)module0713.$ic135$, (SubLObject)module0713.TWELVE_INTEGER);
        return var67;
    }
    
    public static SubLObject f43816(final SubLObject var67, final SubLObject var68) {
        return f43815(var67, var68);
    }
    
    public static SubLObject f43788(final SubLObject var69, final SubLObject var58, final SubLObject var70) {
        PrintLow.format(var58, (SubLObject)module0713.$ic139$, f43790(var69), f43791(var69));
        return var69;
    }
    
    public static SubLObject f43775(final SubLObject var1, final SubLObject var46, SubLObject var5, SubLObject var39) {
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var39 == module0713.UNPROVIDED) {
            var39 = (SubLObject)module0713.NIL;
        }
        assert module0713.NIL != module0589.f35909(var1) : var1;
        assert module0713.NIL != module0075.f5218(var46) : var46;
        assert module0713.NIL != module0173.f10955(var5) : var5;
        assert module0713.NIL != module0035.f2327(var39) : var39;
        final SubLObject var47 = f43814((SubLObject)module0713.UNPROVIDED);
        f43802(var47, f43817());
        f43803(var47, var1);
        f43804(var47, var46);
        f43806(var47, var5);
        f43809(var47, module0067.f4880(Symbols.symbol_function((SubLObject)module0713.EQL), (SubLObject)module0713.UNPROVIDED));
        f43810(var47, module0077.f5313(Symbols.symbol_function((SubLObject)module0713.EQUAL), (SubLObject)module0713.UNPROVIDED));
        f43811(var47, module0067.f4880(Symbols.symbol_function((SubLObject)module0713.EQL), (SubLObject)module0713.UNPROVIDED));
        f43812(var47, var39);
        return var47;
    }
    
    public static SubLObject f43759(final SubLObject var7, SubLObject var5, SubLObject var39) {
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var39 == module0713.UNPROVIDED) {
            var39 = (SubLObject)module0713.NIL;
        }
        assert module0713.NIL != module0701.f42628(var7) : var7;
        assert module0713.NIL != module0173.f10955(var5) : var5;
        if (module0713.NIL == module0702.f42828(module0701.f42703(var7))) {
            Errors.error((SubLObject)module0713.$ic145$);
        }
        final SubLObject var40 = f43814((SubLObject)module0713.UNPROVIDED);
        f43802(var40, f43817());
        f43803(var40, module0702.f42830(module0701.f42703(var7)));
        f43806(var40, var5);
        f43809(var40, module0067.f4880(Symbols.symbol_function((SubLObject)module0713.EQL), (SubLObject)module0713.UNPROVIDED));
        f43810(var40, module0077.f5313(Symbols.symbol_function((SubLObject)module0713.EQUAL), (SubLObject)module0713.UNPROVIDED));
        f43811(var40, module0067.f4880(Symbols.symbol_function((SubLObject)module0713.EQL), (SubLObject)module0713.UNPROVIDED));
        f43812(var40, var39);
        f43783(var40, var7);
        return var40;
    }
    
    public static SubLObject f43818(final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        final SubLObject var7 = f43771();
        final SubLObject var8 = module0202.f12768(module0713.$ic146$, module0713.$ic82$, var7);
        final SubLObject var9 = module0202.f12768(module0713.$ic83$, var8, var5);
        if (module0713.NIL == module0226.f14809(module0172.f10921(var9))) {
            final SubLObject var10 = module0111.$g1405$.currentBinding(var6);
            try {
                module0111.$g1405$.bind((SubLObject)module0713.NIL, var6);
                module0574.f35153(var5);
                module0543.f33631((SubLObject)ConsesLow.list(module0713.$ic40$, var9), module0713.$ic42$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
            finally {
                module0111.$g1405$.rebind(var10, var6);
            }
        }
        return module0172.f10921(var9);
    }
    
    public static SubLObject f43817() {
        return module0057.f4175(module0713.$g5657$.getGlobalValue());
    }
    
    public static SubLObject f43778() {
        return module0713.$g5658$.getGlobalValue();
    }
    
    public static SubLObject f43819(final SubLObject var6, final SubLObject var48) {
        return module0067.f4886(module0713.$g5658$.getGlobalValue(), var48, var6);
    }
    
    public static SubLObject f43820(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43790(var6);
    }
    
    public static SubLObject f43821(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43791(var6);
    }
    
    public static SubLObject f43782(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43792(var6);
    }
    
    public static SubLObject f43766(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43793(var6);
    }
    
    public static SubLObject f43784(final SubLObject var6, final SubLObject var7) {
        assert module0713.NIL != f43789(var6) : var6;
        assert module0713.NIL != module0701.f42628(var7) : var7;
        f43805(var6, var7);
        return var7;
    }
    
    public static SubLObject f43822(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43794(var6);
    }
    
    public static SubLObject f43823(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43795(var6);
    }
    
    public static SubLObject f43824(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43796(var6);
    }
    
    public static SubLObject f43786(final SubLObject var6, final SubLObject var56) {
        assert module0713.NIL != f43789(var6) : var6;
        assert module0713.NIL != module0035.f2015(var56) : var56;
        SubLObject var57 = var56;
        SubLObject var58 = (SubLObject)module0713.NIL;
        var58 = var57.first();
        while (module0713.NIL != var57) {
            assert module0713.NIL != module0702.f42828(var58) : var58;
            var57 = var57.rest();
            var58 = var57.first();
        }
        f43808(var6, var56);
        return var56;
    }
    
    public static SubLObject f43785(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43797(var6);
    }
    
    public static SubLObject f43825(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43798(var6);
    }
    
    public static SubLObject f43826(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43799(var6);
    }
    
    public static SubLObject f43768(final SubLObject var6, final SubLObject var74, final SubLObject var75) {
        return module0067.f4886(f43826(var6), var74, var75);
    }
    
    public static SubLObject f43827(final SubLObject var6, final SubLObject var74) {
        return module0067.f4885(f43826(var6), var74, (SubLObject)module0713.UNPROVIDED);
    }
    
    public static SubLObject f43828(final SubLObject var6) {
        return f43827(var6, (SubLObject)module0713.$ic56$);
    }
    
    public static SubLObject f43829(final SubLObject var6) {
        return f43827(var6, (SubLObject)module0713.$ic85$);
    }
    
    public static SubLObject f43830(final SubLObject var6) {
        return f43827(var6, (SubLObject)module0713.$ic84$);
    }
    
    public static SubLObject f43831(final SubLObject var6) {
        return f43768(var6, (SubLObject)module0713.$ic85$, module0048.f_1X(f43829(var6)));
    }
    
    public static SubLObject f43832(final SubLObject var6) {
        return f43768(var6, (SubLObject)module0713.$ic84$, module0048.f_1X(f43830(var6)));
    }
    
    public static SubLObject f43754(final SubLObject var6, final SubLObject var39) {
        assert module0713.NIL != f43789(var6) : var6;
        if (module0713.NIL != var39 && !module0713.areAssertionsDisabledFor(me) && module0713.NIL == module0035.f2327(var39)) {
            throw new AssertionError(var39);
        }
        f43812(var6, var39);
        return var39;
    }
    
    public static SubLObject f43767(final SubLObject var6, final SubLObject var76, final SubLObject var75) {
        assert module0713.NIL != f43789(var6) : var6;
        SubLObject var77 = f43800(var6);
        var77 = conses_high.putf(var77, var76, var75);
        f43812(var6, var77);
        return var77;
    }
    
    public static SubLObject f43755(final SubLObject var6, final SubLObject var76, final SubLObject var75) {
        assert module0713.NIL != f43789(var6) : var6;
        SubLObject var77 = f43800(var6);
        if (module0713.NIL == module0035.f2346(var77, var76)) {
            var77 = conses_high.putf(var77, var76, var75);
            f43812(var6, var77);
        }
        return var77;
    }
    
    public static SubLObject f43763(final SubLObject var6, final SubLObject var76, SubLObject var77) {
        if (var77 == module0713.UNPROVIDED) {
            var77 = (SubLObject)module0713.NIL;
        }
        assert module0713.NIL != f43789(var6) : var6;
        return conses_high.getf(f43800(var6), var76, var77);
    }
    
    public static SubLObject f43764(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
        return f43800(var6);
    }
    
    public static SubLObject f43833(final SubLObject var6, final SubLObject var78) {
        assert module0713.NIL != f43789(var6) : var6;
        assert module0713.NIL != Types.processp(var78) : var78;
        f43813(var6, var78);
        return f43801(var6);
    }
    
    public static SubLObject f43834(final SubLObject var6) {
        assert module0713.NIL != f43789(var6) : var6;
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
            module0012.$g75$.bind((SubLObject)module0713.ZERO_INTEGER, var7);
            module0012.$g76$.bind((SubLObject)module0713.NIL, var7);
            module0012.$g77$.bind((SubLObject)module0713.T, var7);
            module0012.$g78$.bind(Time.get_universal_time(), var7);
            module0012.f478(Sequences.cconcatenate((SubLObject)module0713.$ic153$, new SubLObject[] { module0006.f207(f43828(var6)), module0713.$ic154$ }));
            if (module0713.NIL != f43763(var6, (SubLObject)module0713.$ic17$, (SubLObject)module0713.UNPROVIDED)) {
                SubLObject var13 = (SubLObject)module0713.ZERO_INTEGER;
                SubLObject var14 = (SubLObject)module0713.ZERO_INTEGER;
                SubLObject var15 = (SubLObject)module0713.ZERO_INTEGER;
                SubLObject var16 = (SubLObject)module0713.ZERO_INTEGER;
                final SubLObject var17 = module0701.f42689(var8);
                SubLObject var18 = (SubLObject)module0713.NIL;
                try {
                    var18 = ReadWriteLocks.rw_lock_seize_read_lock(var17);
                    final SubLObject var19 = module0701.f42690(var8);
                    SubLObject var22;
                    for (SubLObject var20 = (SubLObject)module0713.NIL; module0713.NIL == var20; var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0713.NIL == var22)) {
                        var7.resetMultipleValues();
                        final SubLObject var21 = module0052.f3693(var19);
                        var22 = var7.secondMultipleValue();
                        var7.resetMultipleValues();
                        if (module0713.NIL != var22) {
                            var13 = Numbers.add(var13, (SubLObject)module0713.ONE_INTEGER);
                            if (module0713.NIL != module0702.f42828(var21) || module0713.NIL != module0704.f42888(var21)) {
                                var14 = Numbers.add(var14, (SubLObject)module0713.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    if (module0713.NIL != var18) {
                        ReadWriteLocks.rw_lock_release_read_lock(var17);
                    }
                }
                final SubLObject var19 = module0701.f42700(var8);
                SubLObject var22;
                for (SubLObject var20 = (SubLObject)module0713.NIL; module0713.NIL == var20; var20 = (SubLObject)SubLObjectFactory.makeBoolean(module0713.NIL == var22)) {
                    var7.resetMultipleValues();
                    final SubLObject var23 = module0052.f3693(var19);
                    var22 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    if (module0713.NIL != var22) {
                        var15 = Numbers.add(var15, (SubLObject)module0713.ONE_INTEGER);
                        if (module0713.NIL != module0700.f42611(var23, (SubLObject)module0713.UNPROVIDED)) {
                            var16 = Numbers.add(var16, (SubLObject)module0713.ONE_INTEGER);
                        }
                    }
                }
                module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)module0713.$ic155$, var13, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)module0713.$ic156$, var14, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)module0713.$ic157$, var15, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
                module0006.f218(StreamsLow.$standard_output$.getDynamicValue(var7), (SubLObject)module0713.$ic158$, var16, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
            final SubLObject var24 = module0701.f42689(var8);
            SubLObject var25 = (SubLObject)module0713.NIL;
            try {
                var25 = ReadWriteLocks.rw_lock_seize_read_lock(var24);
                final SubLObject var26 = module0701.f42690(var8);
                SubLObject var29;
                for (SubLObject var27 = (SubLObject)module0713.NIL; module0713.NIL == var27; var27 = (SubLObject)SubLObjectFactory.makeBoolean(module0713.NIL == var29)) {
                    var7.resetMultipleValues();
                    final SubLObject var28 = module0052.f3693(var26);
                    var29 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    if (module0713.NIL != var29) {
                        f43837(var6, var28);
                        f43832(var6);
                    }
                }
            }
            finally {
                if (module0713.NIL != var25) {
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
        if (module0713.NIL == module0004.f104(var54, module0713.$g5659$.getDynamicValue(var55), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED)) {
            final SubLObject var56 = f43766(var6);
            final SubLObject var57 = module0713.$g5659$.currentBinding(var55);
            try {
                module0713.$g5659$.bind((SubLObject)ConsesLow.cons(var54, module0713.$g5659$.getDynamicValue(var55)), var55);
                if (module0713.NIL != module0701.f42629(var54) && module0713.NIL == module0699.f42594(var54, var56)) {
                    if (module0713.NIL != module0035.f2002(module0713.$g5659$.getDynamicValue(var55), (SubLObject)module0713.$ic159$, (SubLObject)module0713.UNPROVIDED)) {
                        Errors.sublisp_break((SubLObject)module0713.$ic160$, new SubLObject[] { Sequences.length(module0713.$g5659$.getDynamicValue(var55)) });
                    }
                    SubLObject var58 = module0701.f42651(var56, var54, (SubLObject)module0713.UNPROVIDED);
                    SubLObject var59 = (SubLObject)module0713.NIL;
                    var59 = var58.first();
                    while (module0713.NIL != var58) {
                        f43838(var6, var59);
                        var58 = var58.rest();
                        var59 = var58.first();
                    }
                }
            }
            finally {
                module0713.$g5659$.rebind(var57, var55);
            }
        }
        return var54;
    }
    
    public static SubLObject f43838(final SubLObject var6, final SubLObject var83) {
        final SubLObject var84 = f43839(var6, var83);
        final SubLObject var85 = module0205.f13333(var84);
        final SubLObject var86 = f43823(var6);
        final SubLObject var87 = f43822(var6);
        final SubLObject var88 = f43763(var6, (SubLObject)module0713.$ic39$, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL == module0226.f14807(var85)) {
            module0708.f43031((SubLObject)ConsesLow.listS(module0713.$ic161$, var85, (SubLObject)module0713.$ic162$), var88, var86, var87, (SubLObject)module0713.UNPROVIDED);
        }
        if (module0713.NIL != var84) {
            final SubLObject var89 = (SubLObject)SubLObjectFactory.makeBoolean(module0713.NIL != f43840(var6, var84) || module0713.NIL != module0708.f43031(var84, var88, var86, var87, (SubLObject)module0713.UNPROVIDED));
            if (module0713.NIL == var89) {
                Errors.warn((SubLObject)module0713.$ic163$, var84, var88);
                module0274.f18198(module0172.f10930(var84), var88, (SubLObject)module0713.UNPROVIDED);
                module0006.f218(f43763(var6, (SubLObject)module0713.$ic13$, (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.$ic164$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
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
        final SubLObject var84 = f43842(var6, module0700.f42613(var83), (SubLObject)module0713.UNPROVIDED);
        final SubLObject var85 = f43842(var6, module0700.f42612(var83), (SubLObject)module0713.T);
        final SubLObject var86 = f43842(var6, module0700.f42614(var83), module0701.f42654(module0700.f42613(var83)));
        if (module0713.NIL != var84 && module0713.NIL != var85 && module0713.NIL != var86) {
            return module0202.f12768(var84, var85, var86);
        }
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43843(final SubLObject var6, final SubLObject var90) {
        final SubLThread var91 = SubLProcess.currentSubLThread();
        final SubLObject var92 = f43766(var6);
        if (module0713.NIL == Errors.$ignore_mustsP$.getDynamicValue(var91) && module0713.NIL == module0699.f42594(var90, var92)) {
            Errors.error((SubLObject)module0713.$ic165$, var90);
        }
        if (module0713.NIL != module0702.f42828(var90) && module0713.NIL != module0702.f42832(var90, module0699.f42531((SubLObject)module0713.$ic166$))) {
            return module0713.$ic167$;
        }
        return module0285.f18875(module0202.f12683(module0713.$ic168$, f43844(var6, var90), (SubLObject)module0713.UNPROVIDED), (SubLObject)module0713.UNPROVIDED);
    }
    
    public static SubLObject f43844(final SubLObject var6, final SubLObject var54) {
        if (module0713.NIL != module0702.f42828(var54) && module0713.NIL != module0702.f42832(var54, module0699.f42531((SubLObject)module0713.$ic166$))) {
            return (SubLObject)module0713.NIL;
        }
        final SubLObject var55 = f43766(var6);
        final SubLObject var56 = module0701.f42651(var55, var54, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var57 = Sequences.find(module0701.f42634(var55, module0699.f42531((SubLObject)module0713.$ic169$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED), var56, (SubLObject)module0713.EQ, (SubLObject)module0713.$ic170$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var58 = f43842(var6, module0700.f42614(var57), (SubLObject)module0713.UNPROVIDED);
        final SubLObject var59 = Sequences.find(module0701.f42634(var55, module0699.f42531((SubLObject)module0713.$ic171$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED), var56, (SubLObject)module0713.EQ, (SubLObject)module0713.$ic170$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var60 = f43844(var6, module0700.f42614(var59));
        return (SubLObject)ConsesLow.cons(var58, var60);
    }
    
    public static SubLObject f43842(final SubLObject var6, final SubLObject var96, SubLObject var97) {
        if (var97 == module0713.UNPROVIDED) {
            var97 = (SubLObject)module0713.NIL;
        }
        SubLObject var98 = module0067.f4885(f43785(var6), var96, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL != var98) {
            return var98;
        }
        if (module0713.NIL != module0702.f42828(var96)) {
            var98 = f43845(var6, var96, var97);
        }
        else if (module0713.NIL != module0704.f42888(var96)) {
            var98 = module0699.f42593(var96);
        }
        else if (module0713.NIL != module0703.f42867(var96)) {
            var98 = f43846(var96, var6);
            f43847(var6, var98, (SubLObject)module0713.UNPROVIDED);
            var97 = (SubLObject)module0713.NIL;
        }
        else {
            Errors.error((SubLObject)module0713.$ic172$, var96);
        }
        if (module0713.NIL != var97) {
            f43847(var6, var98, (SubLObject)module0713.UNPROVIDED);
        }
        if (module0713.NIL == module0699.f42594(var96, f43766(var6))) {
            f43837(var6, var96);
        }
        module0067.f4886(f43785(var6), var96, var98);
        return var98;
    }
    
    public static SubLObject f43845(final SubLObject var6, final SubLObject var1, SubLObject var97) {
        if (var97 == module0713.UNPROVIDED) {
            var97 = (SubLObject)module0713.NIL;
        }
        final SubLThread var98 = SubLProcess.currentSubLThread();
        assert module0713.NIL != module0702.f42828(var1) : var1;
        final SubLObject var99 = f43763(var6, (SubLObject)module0713.$ic11$, (SubLObject)module0713.UNPROVIDED);
        SubLObject var100 = (SubLObject)module0713.NIL;
        if (module0713.NIL != f43763(var6, (SubLObject)module0713.$ic173$, (SubLObject)module0713.UNPROVIDED) && module0713.NIL != module0701.f42633(var1, module0701.f42807((SubLObject)module0713.$ic174$))) {
            return module0713.$ic175$;
        }
        if (module0713.NIL != module0708.f43032(var1)) {
            return module0699.f42592(var1);
        }
        if (module0713.NIL != module0712.f43666(var1)) {
            var100 = f43848(var1);
            if (module0713.NIL == module0173.f10955(var100)) {
                Errors.warn((SubLObject)module0713.$ic176$, f43760(var1));
            }
        }
        if (module0713.NIL == module0173.f10955(var100) && module0713.NIL != module0038.f2684(module0702.f42830(var1), var99)) {
            var100 = f43849(var6, var1, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        }
        if (module0713.NIL == module0173.f10955(var100) && module0713.NIL != f43763(var6, (SubLObject)module0713.$ic177$, (SubLObject)module0713.UNPROVIDED)) {
            var98.resetMultipleValues();
            final SubLObject var101 = module0708.f43034(module0701.f42758(f43766(var6)), var1);
            final SubLObject var102 = var98.secondMultipleValue();
            var98.resetMultipleValues();
            if (module0713.NIL != module0038.f2611(var101) && module0713.NIL != module0038.f2611(var102)) {
                var100 = f43849(var6, var1, var101, var102);
            }
        }
        if (module0713.NIL != var97 && module0713.NIL != module0173.f10955(var100)) {
            f43847(var6, var100, var1);
        }
        if (module0713.NIL == module0173.f10955(var100)) {
            var100 = module0699.f42592(var1);
        }
        return var100;
    }
    
    public static SubLObject f43847(final SubLObject var6, final SubLObject var98, SubLObject var1) {
        if (var1 == module0713.UNPROVIDED) {
            var1 = (SubLObject)module0713.NIL;
        }
        assert module0713.NIL != f43789(var6) : var6;
        if (module0713.NIL != var1 && !module0713.areAssertionsDisabledFor(me) && module0713.NIL == module0702.f42828(var1)) {
            throw new AssertionError(var1);
        }
        final SubLObject var99 = f43763(var6, (SubLObject)module0713.$ic38$, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var100 = f43763(var6, (SubLObject)module0713.$ic39$, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var101 = (SubLObject)((module0713.NIL != var1) ? f43850(var6, var1) : module0713.NIL);
        module0708.f43031((SubLObject)ConsesLow.list(module0713.$ic178$, var98, (SubLObject)ConsesLow.list(module0713.$ic179$, var99)), module0713.$ic180$, var98, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL != module0038.f2611(var101)) {
            module0708.f43031((SubLObject)ConsesLow.list(module0713.$ic181$, var98, var99, var101), var100, var98, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
        }
        return var98;
    }
    
    public static SubLObject f43849(final SubLObject var6, final SubLObject var1, SubLObject var31, SubLObject var103) {
        if (var31 == module0713.UNPROVIDED) {
            var31 = (SubLObject)module0713.NIL;
        }
        if (var103 == module0713.UNPROVIDED) {
            var103 = (SubLObject)module0713.NIL;
        }
        assert module0713.NIL != f43789(var6) : var6;
        assert module0713.NIL != module0702.f42828(var1) : var1;
        final SubLObject var104 = f43760(var1);
        final SubLObject var105 = f43763(var6, (SubLObject)module0713.$ic38$, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var106 = f43763(var6, (SubLObject)module0713.$ic39$, (SubLObject)module0713.UNPROVIDED);
        SubLObject var107 = module0220.f14556(var104, module0713.$ic182$, (SubLObject)module0713.TWO_INTEGER, (SubLObject)module0713.ONE_INTEGER, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL == module0173.f10955(var107)) {
            final SubLObject var108 = module0702.f42840(var1);
            if (module0713.NIL != module0038.f2608(var108)) {
                return var105;
            }
            SubLObject var109 = f43763(var6, (SubLObject)module0713.$ic31$, (SubLObject)module0713.UNPROVIDED);
            if (module0713.NIL == module0038.f2611(var31)) {
                var31 = f43763(var6, (SubLObject)module0713.$ic30$, (SubLObject)module0713.UNPROVIDED);
            }
            if (module0713.NIL != module0038.f2611(var31) && module0713.NIL == module0038.f2673(var31, (SubLObject)module0713.$ic32$, (SubLObject)module0713.UNPROVIDED)) {
                var31 = Sequences.cconcatenate(var31, (SubLObject)module0713.$ic32$);
            }
            if (!var31.isString()) {
                var31 = (SubLObject)module0713.$ic10$;
            }
            if (!var109.isString()) {
                var109 = (SubLObject)module0713.$ic10$;
            }
            if (module0713.NIL == module0038.f2611(var103)) {
                var103 = var108;
            }
            if (module0713.NIL != f43763(var6, (SubLObject)module0713.$ic183$, (SubLObject)module0713.UNPROVIDED)) {
                final SubLObject var110 = f43766(var6);
                final SubLObject var111 = module0701.f42651(var110, var1, module0701.f42807((SubLObject)module0713.$ic184$)).first();
                final SubLObject var112 = (SubLObject)((module0713.NIL != module0700.f42611(var111, (SubLObject)module0713.UNPROVIDED)) ? module0700.f42614(var111) : module0713.NIL);
                final SubLObject var113 = (SubLObject)((module0713.NIL != module0704.f42888(var112)) ? module0704.f42881(var112) : module0713.NIL);
                if (module0713.NIL != module0038.f2611(var113)) {
                    var103 = module0038.f2867(var113, module0701.f42643(var110, var1, module0701.f42807((SubLObject)module0713.$ic185$), module0701.f42807((SubLObject)module0713.$ic186$)));
                }
            }
            if (module0713.NIL != module0038.f2611(var109)) {
                var103 = Sequences.cconcatenate(var103, var109);
            }
            if (module0713.NIL != module0038.f2608(var31) && module0713.NIL != module0038.f2608(var109)) {
                var107 = module0699.f42592(var1);
            }
            else {
                var107 = module0708.f43025(var103, (SubLObject)module0713.NIL, var106, var31, (SubLObject)module0713.NIL, (SubLObject)module0713.UNPROVIDED);
            }
            if (module0713.NIL != module0173.f10955(var107)) {
                module0708.f43031((SubLObject)ConsesLow.list(module0713.$ic182$, var107, f43760(var1)), var106, var107, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
        }
        return (module0713.NIL != module0172.f10917(var107)) ? module0172.f10921(var107) : var107;
    }
    
    public static SubLObject f43850(final SubLObject var6, final SubLObject var1) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        assert module0713.NIL != f43789(var6) : var6;
        assert module0713.NIL != module0702.f42828(var1) : var1;
        final SubLObject var8 = f43763(var6, (SubLObject)module0713.$ic11$, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var9 = f43763(var6, (SubLObject)module0713.$ic9$, (SubLObject)module0713.UNPROVIDED);
        if (module0713.NIL != module0038.f2668(module0702.f42829(var1), var8, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED)) {
            if (module0713.NIL != module0038.f2608(var9)) {
                return module0702.f42840(var1);
            }
            if (module0713.NIL != module0038.f2611(var9)) {
                return Sequences.cconcatenate(var9, new SubLObject[] { module0713.$ic32$, module0702.f42840(var1) });
            }
            return module0702.f42830(var1);
        }
        else {
            if (module0713.NIL != module0712.f43666(var1)) {
                return module0702.f42830(var1);
            }
            if (module0713.T != f43763(var6, (SubLObject)module0713.$ic9$, (SubLObject)module0713.UNPROVIDED)) {
                var7.resetMultipleValues();
                final SubLObject var10 = module0708.f43034(module0701.f42758(f43766(var6)), var1);
                final SubLObject var11 = var7.secondMultipleValue();
                var7.resetMultipleValues();
                if (module0713.NIL != module0038.f2611(var10) && module0713.NIL != module0038.f2611(var11)) {
                    return Sequences.cconcatenate(var10, new SubLObject[] { module0713.$ic32$, var11 });
                }
            }
            return module0702.f42830(var1);
        }
    }
    
    public static SubLObject f43848(final SubLObject var1) {
        assert module0713.NIL != module0712.f43666(var1) : var1;
        final SubLObject var2 = (module0713.NIL != module0702.f42828(var1)) ? module0702.f42840(var1) : module0702.f42840(module0702.f42814(var1, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED));
        SubLObject var3 = (SubLObject)module0713.NIL;
        var3 = module0213.f13923(var2);
        if (module0713.NIL != module0173.f10955(var3)) {
            return var3;
        }
        var3 = constants_high_oc.f10737(var2);
        if (module0713.NIL != module0173.f10955(var3)) {
            return var3;
        }
        var3 = constants_high_oc.f10737(module0038.f2842((SubLObject)Characters.CHAR_underbar, (SubLObject)Characters.CHAR_hyphen, var2));
        if (module0713.NIL != module0173.f10955(var3)) {
            return var3;
        }
        var3 = constants_high_oc.f10737(module0038.f2842((SubLObject)Characters.CHAR_hyphen, (SubLObject)Characters.CHAR_underbar, var2));
        if (module0713.NIL != module0173.f10955(var3)) {
            return var3;
        }
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43760(final SubLObject var1) {
        return (SubLObject)(var1.isString() ? var1 : ((module0713.NIL != module0702.f42828(var1)) ? module0702.f42830(var1) : module0713.$ic10$));
    }
    
    public static SubLObject f43846(final SubLObject var54, final SubLObject var6) {
        final SubLObject var55 = f43766(var6);
        final SubLObject var56 = f43822(var6);
        SubLObject var57 = (SubLObject)module0713.NIL;
        if (module0713.NIL != module0699.f42594(var54, var55)) {
            final SubLObject var58 = f43843(var6, var54);
            SubLObject var59 = module0699.f42598(var54, var55);
            SubLObject var60 = (SubLObject)module0713.NIL;
            var60 = var59.first();
            while (module0713.NIL != var59) {
                f43837(var6, var60);
                var59 = var59.rest();
                var60 = var59.first();
            }
            var57 = var58;
        }
        else if (module0713.NIL != module0708.f43047(var54, var55)) {
            final SubLObject var61 = module0701.f42665(var55, var54, module0708.f43016((SubLObject)module0713.$ic188$));
            SubLObject var62 = (SubLObject)module0713.NIL;
            SubLObject var63 = var61;
            SubLObject var64 = (SubLObject)module0713.NIL;
            var64 = var63.first();
            while (module0713.NIL != var63) {
                SubLObject var27_115 = module0202.f12751(f43842(var6, var64, (SubLObject)module0713.UNPROVIDED));
                SubLObject var65 = (SubLObject)module0713.NIL;
                var65 = var27_115.first();
                while (module0713.NIL != var27_115) {
                    final SubLObject var66 = var65;
                    if (module0713.NIL == conses_high.member(var66, var62, Symbols.symbol_function((SubLObject)module0713.EQL), Symbols.symbol_function((SubLObject)module0713.IDENTITY))) {
                        var62 = (SubLObject)ConsesLow.cons(var66, var62);
                    }
                    var27_115 = var27_115.rest();
                    var65 = var27_115.first();
                }
                var63 = var63.rest();
                var64 = var63.first();
            }
            var62 = Sequences.nreverse(var62);
            var57 = (SubLObject)ConsesLow.list(module0713.$ic189$, reader.bq_cons(module0713.$ic190$, ConsesLow.append(var62, (SubLObject)module0713.NIL)));
        }
        else if (module0713.NIL != module0708.f43048(var54, var55)) {
            final SubLObject var67 = module0701.f42665(var55, var54, module0708.f43016((SubLObject)module0713.$ic191$));
            SubLObject var68 = (SubLObject)module0713.NIL;
            SubLObject var63 = var67;
            SubLObject var69 = (SubLObject)module0713.NIL;
            var69 = var63.first();
            while (module0713.NIL != var63) {
                SubLObject var27_116 = module0202.f12751(f43842(var6, var69, (SubLObject)module0713.UNPROVIDED));
                SubLObject var65 = (SubLObject)module0713.NIL;
                var65 = var27_116.first();
                while (module0713.NIL != var27_116) {
                    final SubLObject var66 = var65;
                    if (module0713.NIL == conses_high.member(var66, var68, Symbols.symbol_function((SubLObject)module0713.EQL), Symbols.symbol_function((SubLObject)module0713.IDENTITY))) {
                        var68 = (SubLObject)ConsesLow.cons(var66, var68);
                    }
                    var27_116 = var27_116.rest();
                    var65 = var27_116.first();
                }
                var63 = var63.rest();
                var69 = var63.first();
            }
            var68 = Sequences.nreverse(var68);
            var57 = (SubLObject)ConsesLow.list(module0713.$ic192$, reader.bq_cons(module0713.$ic190$, ConsesLow.append(var68, (SubLObject)module0713.NIL)));
        }
        else if (module0713.NIL != module0708.f43049(var54, var55)) {
            final SubLObject var70 = module0701.f42665(var55, var54, module0708.f43016((SubLObject)module0713.$ic193$)).first();
            final SubLObject var71 = f43842(var6, var70, (SubLObject)module0713.UNPROVIDED);
            var57 = (SubLObject)ConsesLow.list(module0713.$ic194$, module0713.$ic195$, var71);
        }
        else if (module0713.NIL != module0708.f43050(var54, var55)) {
            final SubLObject var72 = module0701.f42651(var55, var54, (SubLObject)module0713.UNPROVIDED);
            SubLObject var73 = (SubLObject)module0713.NIL;
            SubLObject var74 = (SubLObject)module0713.NIL;
            SubLObject var75 = (SubLObject)module0713.NIL;
            SubLObject var76 = (SubLObject)module0713.NIL;
            SubLObject var77 = (SubLObject)module0713.NIL;
            SubLObject var78 = (SubLObject)module0713.NIL;
            SubLObject var79 = var72;
            SubLObject var80 = (SubLObject)module0713.NIL;
            var80 = var79.first();
            while (module0713.NIL != var79) {
                if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)module0713.$ic196$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var73 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0699.f42531((SubLObject)module0713.$ic88$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var74 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)module0713.$ic197$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var75 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)module0713.$ic198$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var75 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)module0713.$ic199$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var75 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)module0713.$ic200$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var75 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0699.f42551((SubLObject)module0713.$ic201$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var77 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)module0713.$ic202$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var76 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)module0713.$ic203$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var76 = var80;
                }
                else if (module0713.NIL != module0701.f42633(module0700.f42613(var80), module0702.f42814(module0708.f43016((SubLObject)module0713.$ic204$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                    var76 = var80;
                }
                else {
                    var78 = (SubLObject)ConsesLow.cons(var80, var78);
                }
                var79 = var79.rest();
                var80 = var79.first();
            }
            final SubLObject var81 = f43763(var6, (SubLObject)module0713.$ic205$, (SubLObject)module0713.UNPROVIDED);
            final SubLObject var82 = (SubLObject)((module0713.NIL != var75) ? module0700.f42613(var75) : module0713.NIL);
            final SubLObject var83 = (SubLObject)((module0713.NIL != var76) ? module0700.f42613(var76) : module0713.NIL);
            final SubLObject var84 = (SubLObject)((module0713.NIL != var76) ? f43842(var6, module0700.f42614(var76), (SubLObject)module0713.UNPROVIDED) : module0713.NIL);
            final SubLObject var85 = f43842(var6, module0700.f42614(var73), (SubLObject)module0713.UNPROVIDED);
            final SubLObject var86 = (SubLObject)((module0713.NIL != var75) ? f43842(var6, module0700.f42614(var75), (SubLObject)module0713.UNPROVIDED) : module0713.NIL);
            final SubLObject var87 = (module0713.NIL != var77) ? f43842(var6, module0700.f42614(var77), (SubLObject)module0713.UNPROVIDED) : module0713.$ic195$;
            if (module0713.NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic197$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                if (module0713.NIL != var81) {
                    var57 = f43851(var6, var54, module0713.$ic206$, var85, var86, (SubLObject)module0713.UNPROVIDED);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list(module0713.$ic207$, var87, (SubLObject)ConsesLow.list(module0713.$ic208$, (SubLObject)module0713.$ic209$, (SubLObject)ConsesLow.list(module0713.$ic210$, var85, (SubLObject)module0713.$ic209$, var86)));
                }
            }
            else if (module0713.NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic199$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                if (module0713.NIL != var81) {
                    var57 = f43851(var6, var54, module0713.$ic211$, var85, var86, (SubLObject)module0713.UNPROVIDED);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list(module0713.$ic207$, var87, (SubLObject)ConsesLow.list(module0713.$ic208$, (SubLObject)module0713.$ic209$, (SubLObject)ConsesLow.list(module0713.$ic212$, var85, (SubLObject)module0713.$ic209$, var86)));
                }
            }
            else if (module0713.NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic198$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                if (module0713.NIL != var81) {
                    var57 = f43851(var6, var54, module0713.$ic213$, var85, var86, (SubLObject)module0713.UNPROVIDED);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list(module0713.$ic207$, var87, (SubLObject)ConsesLow.list(module0713.$ic208$, (SubLObject)module0713.$ic209$, (SubLObject)ConsesLow.list(var85, (SubLObject)module0713.$ic209$, var86)));
                }
            }
            else if (module0713.NIL != module0701.f42633(var83, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic204$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                final SubLObject var88 = (module0713.NIL != var82 && module0713.NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic200$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) ? var86 : module0713.$ic195$;
                if (module0713.NIL != var81) {
                    var57 = f43851(var6, var54, module0713.$ic214$, var85, var86, var84);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list(module0713.$ic207$, var87, (SubLObject)ConsesLow.list(module0713.$ic208$, (SubLObject)module0713.$ic209$, (SubLObject)ConsesLow.list(module0713.$ic215$, var85, (SubLObject)module0713.$ic209$, var88, var84)));
                }
            }
            else if (module0713.NIL != module0701.f42633(var83, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic203$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                final SubLObject var88 = (module0713.NIL != var82 && module0713.NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic200$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) ? var86 : module0713.$ic195$;
                if (module0713.NIL != var81) {
                    var57 = f43851(var6, var54, module0713.$ic216$, var85, var86, var84);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list(module0713.$ic207$, var87, (SubLObject)ConsesLow.list(module0713.$ic208$, (SubLObject)module0713.$ic209$, (SubLObject)ConsesLow.list(module0713.$ic217$, var85, (SubLObject)module0713.$ic209$, var88, var84)));
                }
            }
            else if (module0713.NIL != module0701.f42633(var83, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic202$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) {
                final SubLObject var88 = (module0713.NIL != var82 && module0713.NIL != module0701.f42633(var82, module0701.f42634(var55, module0708.f43016((SubLObject)module0713.$ic200$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED))) ? var86 : module0713.$ic195$;
                if (module0713.NIL != var81) {
                    var57 = f43851(var6, var54, module0713.$ic218$, var85, var86, var84);
                }
                else {
                    var57 = (SubLObject)ConsesLow.list(module0713.$ic207$, var87, (SubLObject)ConsesLow.list(module0713.$ic208$, (SubLObject)module0713.$ic209$, (SubLObject)ConsesLow.list(module0713.$ic219$, var85, (SubLObject)module0713.$ic209$, var88, var84)));
                }
            }
            else {
                Errors.sublisp_break((SubLObject)module0713.$ic220$, new SubLObject[] { var72, var73, var74, var75 });
            }
        }
        else if (module0713.NIL != module0708.f43051(var54, var55)) {
            final SubLObject var89 = module0701.f42651(var55, var54, module0708.f43016((SubLObject)module0713.$ic221$)).first();
            final SubLObject var90 = f43842(var6, module0700.f42614(var89), (SubLObject)module0713.UNPROVIDED);
            var57 = reader.bq_cons(module0713.$ic222$, ConsesLow.append(module0202.f12751(var90), (SubLObject)module0713.NIL));
        }
        else {
            final SubLObject var58 = module0708.f43025((SubLObject)module0713.$ic223$, (SubLObject)module0713.NIL, module0713.$ic224$, (SubLObject)module0713.$ic10$, (SubLObject)module0713.T, var56);
            module0708.f43031(module0202.f12768(module0713.$ic178$, var58, module0713.$ic225$), module0713.$ic224$, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            var57 = var58;
        }
        return var57;
    }
    
    public static SubLObject f43851(final SubLObject var6, final SubLObject var54, final SubLObject var140, final SubLObject var134, final SubLObject var135, SubLObject var133) {
        if (var133 == module0713.UNPROVIDED) {
            var133 = (SubLObject)module0713.NIL;
        }
        final SubLObject var141 = f43766(var6);
        final SubLObject var142 = f43763(var6, (SubLObject)module0713.$ic39$, (SubLObject)module0713.UNPROVIDED);
        final SubLObject var143 = Mapping.mapcar((SubLObject)module0713.$ic226$, module0701.f42662(var141, var54, module0701.f42634(var141, module0699.f42551((SubLObject)module0713.$ic201$), (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED)));
        if (module0713.NIL == var143) {
            Errors.warn((SubLObject)module0713.$ic227$, var54);
            return (SubLObject)module0713.NIL;
        }
        SubLObject var144 = var143;
        SubLObject var145 = (SubLObject)module0713.NIL;
        var145 = var144.first();
        while (module0713.NIL != var144) {
            final SubLObject var146 = f43842(var6, var145, (SubLObject)module0713.UNPROVIDED);
            if (module0713.NIL == var133) {
                f43852(var6, module0202.f12769(var140, var134, var146, var135), var142, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
            else {
                f43852(var6, module0202.f12770(var140, var134, var146, var135, var133), var142, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED);
            }
            var144 = var144.rest();
            var145 = var144.first();
        }
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43853(final SubLObject var6, final SubLObject var103, final SubLObject var144, final SubLObject var145, final SubLObject var31, final SubLObject var146, SubLObject var5) {
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        return module0708.f43025(var103, var144, var145, var31, var146, var5);
    }
    
    public static SubLObject f43854(final SubLObject var6, final SubLObject var147, final SubLObject var148) {
        return module0285.f18993(var147, var148);
    }
    
    public static SubLObject f43852(final SubLObject var6, final SubLObject var149, final SubLObject var150, SubLObject var86, SubLObject var5, SubLObject var151) {
        if (var86 == module0713.UNPROVIDED) {
            var86 = (SubLObject)module0713.NIL;
        }
        if (var5 == module0713.UNPROVIDED) {
            var5 = module0574.f35152();
        }
        if (var151 == module0713.UNPROVIDED) {
            var151 = (SubLObject)module0713.T;
        }
        return module0708.f43031(var149, var150, var86, var5, var151);
    }
    
    public static SubLObject f43855(final SubLObject var4, final SubLObject var152, final SubLObject var153, final SubLObject var154, SubLObject var2) {
        if (var2 == module0713.UNPROVIDED) {
            var2 = (SubLObject)module0713.NIL;
        }
        final SubLObject var155 = f43757(var4, var2);
        return var155;
    }
    
    public static SubLObject f43856(final SubLObject var7, final SubLObject var155, final SubLObject var156, final SubLObject var157, SubLObject var158) {
        if (var158 == module0713.UNPROVIDED) {
            var158 = (SubLObject)module0713.$ic228$;
        }
        final SubLThread var159 = SubLProcess.currentSubLThread();
        SubLObject var160 = (SubLObject)module0713.NIL;
        final SubLObject var161 = module0701.f42659(var7, var155);
        module0012.$g82$.setDynamicValue(var158, var159);
        module0012.$g73$.setDynamicValue(Time.get_universal_time(), var159);
        module0012.$g83$.setDynamicValue(Sequences.length(var161), var159);
        module0012.$g84$.setDynamicValue((SubLObject)module0713.ZERO_INTEGER, var159);
        final SubLObject var162 = module0012.$g75$.currentBinding(var159);
        final SubLObject var163 = module0012.$g76$.currentBinding(var159);
        final SubLObject var164 = module0012.$g77$.currentBinding(var159);
        final SubLObject var165 = module0012.$g78$.currentBinding(var159);
        try {
            module0012.$g75$.bind((SubLObject)module0713.ZERO_INTEGER, var159);
            module0012.$g76$.bind((SubLObject)module0713.NIL, var159);
            module0012.$g77$.bind((SubLObject)module0713.T, var159);
            module0012.$g78$.bind(Time.get_universal_time(), var159);
            module0012.f478(module0012.$g82$.getDynamicValue(var159));
            SubLObject var166 = var161;
            SubLObject var167 = (SubLObject)module0713.NIL;
            var167 = var166.first();
            while (module0713.NIL != var166) {
                module0012.note_percent_progress(module0012.$g84$.getDynamicValue(var159), module0012.$g83$.getDynamicValue(var159));
                module0012.$g84$.setDynamicValue(Numbers.add(module0012.$g84$.getDynamicValue(var159), (SubLObject)module0713.ONE_INTEGER), var159);
                final SubLObject var168 = module0700.f42612(var167);
                final SubLObject var169 = module0700.f42614(var167);
                final SubLObject var170 = module0701.f42651(var7, var169, var156).first();
                final SubLObject var171 = (SubLObject)((module0713.NIL != module0700.f42611(var170, (SubLObject)module0713.UNPROVIDED)) ? module0700.f42614(var170) : module0713.NIL);
                if (module0713.NIL != module0701.f42631(var171)) {
                    var160 = (SubLObject)module0713.T;
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
        if (module0713.NIL != var160) {
            final SubLObject var172 = module0701.f42651(var7, var155, module0701.f42807((SubLObject)module0713.$ic229$)).first();
            final SubLObject var173 = (module0713.NIL != module0700.f42611(var172, (SubLObject)module0713.UNPROVIDED)) ? module0700.f42614(var172) : module0701.f42807((SubLObject)module0713.$ic230$);
            final SubLObject var174 = module0701.f42651(var7, var155, module0701.f42807((SubLObject)module0713.$ic231$)).first();
            final SubLObject var175 = (module0713.NIL != module0700.f42611(var174, (SubLObject)module0713.UNPROVIDED)) ? module0700.f42614(var174) : module0701.f42807((SubLObject)module0713.$ic230$);
            final SubLObject var176 = Mapping.mapcar((SubLObject)module0713.$ic232$, module0701.f42651(var7, var156, module0701.f42807((SubLObject)module0713.$ic185$)));
            if (module0713.NIL != var176) {
                SubLObject var177 = var176;
                SubLObject var178 = (SubLObject)module0713.NIL;
                var178 = var177.first();
                while (module0713.NIL != var177) {
                    module0701.f42627(var7, var157, module0701.f42807((SubLObject)module0713.$ic185$), var178);
                    var177 = var177.rest();
                    var178 = var177.first();
                }
            }
            else {
                module0701.f42627(var7, var157, module0701.f42807((SubLObject)module0713.$ic185$), module0701.f42807((SubLObject)module0713.$ic233$));
            }
            module0701.f42627(var7, var157, module0701.f42807((SubLObject)module0713.$ic229$), var173);
            module0701.f42627(var7, var157, module0701.f42807((SubLObject)module0713.$ic231$), var175);
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
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43858() {
        module0713.$g5654$ = SubLFiles.defparameter("S#48025", (SubLObject)module0713.$ic0$);
        module0713.$g5655$ = SubLFiles.deflexical("S#48026", (SubLObject)((module0713.NIL != Symbols.boundp((SubLObject)module0713.$ic77$)) ? module0713.$g5655$.getGlobalValue() : module0713.NIL));
        module0713.$g5656$ = SubLFiles.defconstant("S#48027", (SubLObject)module0713.$ic90$);
        module0713.$g5657$ = SubLFiles.deflexical("S#48028", (module0713.NIL != Symbols.boundp((SubLObject)module0713.$ic147$)) ? module0713.$g5657$.getGlobalValue() : module0057.f4173((SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED, (SubLObject)module0713.UNPROVIDED));
        module0713.$g5658$ = SubLFiles.deflexical("S#48029", (module0713.NIL != Symbols.boundp((SubLObject)module0713.$ic148$)) ? module0713.$g5658$.getGlobalValue() : module0067.f4880(Symbols.symbol_function((SubLObject)module0713.EQL), (SubLObject)module0713.UNPROVIDED));
        module0713.$g5659$ = SubLFiles.defparameter("S#48030", (SubLObject)module0713.NIL);
        return (SubLObject)module0713.NIL;
    }
    
    public static SubLObject f43859() {
        module0002.f38((SubLObject)module0713.$ic5$);
        module0002.f38((SubLObject)module0713.$ic14$);
        module0002.f38((SubLObject)module0713.$ic18$);
        module0002.f38((SubLObject)module0713.$ic23$);
        module0003.f57((SubLObject)module0713.$ic77$);
        module0713.$g5655$.setGlobalValue((SubLObject)module0713.$ic78$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0713.$g5656$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0713.$ic97$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0713.$ic98$);
        Structures.def_csetf((SubLObject)module0713.$ic99$, (SubLObject)module0713.$ic100$);
        Structures.def_csetf((SubLObject)module0713.$ic101$, (SubLObject)module0713.$ic102$);
        Structures.def_csetf((SubLObject)module0713.$ic103$, (SubLObject)module0713.$ic104$);
        Structures.def_csetf((SubLObject)module0713.$ic105$, (SubLObject)module0713.$ic106$);
        Structures.def_csetf((SubLObject)module0713.$ic107$, (SubLObject)module0713.$ic108$);
        Structures.def_csetf((SubLObject)module0713.$ic109$, (SubLObject)module0713.$ic110$);
        Structures.def_csetf((SubLObject)module0713.$ic111$, (SubLObject)module0713.$ic112$);
        Structures.def_csetf((SubLObject)module0713.$ic113$, (SubLObject)module0713.$ic114$);
        Structures.def_csetf((SubLObject)module0713.$ic115$, (SubLObject)module0713.$ic116$);
        Structures.def_csetf((SubLObject)module0713.$ic117$, (SubLObject)module0713.$ic118$);
        Structures.def_csetf((SubLObject)module0713.$ic119$, (SubLObject)module0713.$ic120$);
        Structures.def_csetf((SubLObject)module0713.$ic121$, (SubLObject)module0713.$ic122$);
        Equality.identity((SubLObject)module0713.$ic90$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0713.$g5656$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0713.$ic138$));
        module0012.f419((SubLObject)module0713.$ic96$);
        module0003.f57((SubLObject)module0713.$ic147$);
        module0003.f57((SubLObject)module0713.$ic148$);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), module0713.$g5656$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0713.$ic152$));
        return (SubLObject)module0713.NIL;
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
        module0713.$g5654$ = null;
        module0713.$g5655$ = null;
        module0713.$g5656$ = null;
        module0713.$g5657$ = null;
        module0713.$g5658$ = null;
        module0713.$g5659$ = null;
        $ic0$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ONTOLOGY-URI"), SubLObjectFactory.makeKeyword("ONTOLOGY-TERM"), SubLObjectFactory.makeKeyword("ONTOLOGY-MT"), SubLObjectFactory.makeKeyword("URI-PREFIX"), SubLObjectFactory.makeKeyword("CONSTANT-PREFIX"), SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX"), SubLObjectFactory.makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES"), SubLObjectFactory.makeKeyword("SYNONYMOUS-CONCEPT-PREFIX"), SubLObjectFactory.makeKeyword("CYCLIST"), SubLObjectFactory.makeKeyword("TEST-MODE"), SubLObjectFactory.makeKeyword("VERBOSE?"), SubLObjectFactory.makeKeyword("PROGRESS-STREAM"), SubLObjectFactory.makeKeyword("GRAPH-TRANSLATION-FUNCTIONS"), SubLObjectFactory.makeKeyword("ONLY-ASSERT-RESTRICTIONS-AS-RMP-GAFS?"), SubLObjectFactory.makeKeyword("USE-RDFS-LABEL-FOR-CONSTANT-NAME?"), SubLObjectFactory.makeKeyword("USE-GENLS-FOR-RDFS-SUBCLASS?") });
        $ic1$ = SubLObjectFactory.makeString("OWL Importer usages:~%");
        $ic2$ = SubLObjectFactory.makeString(" owl-import-uri (uri &optional importer-options)~%");
        $ic3$ = SubLObjectFactory.makeString(" owl-import-file (filename &optional importer-options)~%");
        $ic4$ = SubLObjectFactory.makeString(" owl-import-uri-from-file (uri filename &optional importer-options)~%");
        $ic5$ = SubLObjectFactory.makeSymbol("OWL-IMPORT-URI");
        $ic6$ = SubLObjectFactory.makeString("owl-import-uri");
        $ic7$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("IMPORTER-OPTIONS"));
        $ic8$ = SubLObjectFactory.makeString("Download of URI ~S to temp file failed.");
        $ic9$ = SubLObjectFactory.makeKeyword("SYNONYMOUS-CONCEPT-PREFIX");
        $ic10$ = SubLObjectFactory.makeString("");
        $ic11$ = SubLObjectFactory.makeKeyword("ONTOLOGY-URI");
        $ic12$ = SubLObjectFactory.makeKeyword("CYCLIST");
        $ic13$ = SubLObjectFactory.makeKeyword("PROGRESS-STREAM");
        $ic14$ = SubLObjectFactory.makeSymbol("OWL-IMPORT-FILE");
        $ic15$ = SubLObjectFactory.makeString("owl-import-file");
        $ic16$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("IMPORTER-OPTIONS"));
        $ic17$ = SubLObjectFactory.makeKeyword("VERBOSE?");
        $ic18$ = SubLObjectFactory.makeSymbol("OWL-IMPORT-URI-FROM-FILE");
        $ic19$ = SubLObjectFactory.makeString("owl-import-uri-from-file");
        $ic20$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("URI"), (SubLObject)SubLObjectFactory.makeKeyword("FILENAME"), (SubLObject)SubLObjectFactory.makeKeyword("IMPORTER-OPTIONS"));
        $ic21$ = SubLObjectFactory.makeKeyword("TEST-MODE");
        $ic22$ = SubLObjectFactory.makeKeyword("GRAPH-ONLY");
        $ic23$ = SubLObjectFactory.makeSymbol("OWL-IMPORT-XML-GRAPH-FROM-FILE");
        $ic24$ = SubLObjectFactory.makeString("Importing XML...");
        $ic25$ = SubLObjectFactory.makeKeyword("URI-PREFIX");
        $ic26$ = SubLObjectFactory.makeString("~&Using local URI part for #$synonymousExternalConcept assertions~%");
        $ic27$ = SubLObjectFactory.makeString("~&Using URI prefix \"~A\" for #$synonymousExternalConcept assertions~%");
        $ic28$ = SubLObjectFactory.makeString("~&Using full URIs for #$synonymousExternalConcept assertions~%");
        $ic29$ = SubLObjectFactory.makeString("~&Note that synonymous-concept-prefix of ~S and uri-prefix of ~S do not match~%");
        $ic30$ = SubLObjectFactory.makeKeyword("CONSTANT-PREFIX");
        $ic31$ = SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX");
        $ic32$ = SubLObjectFactory.makeString(":");
        $ic33$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $ic34$ = SubLObjectFactory.makeString("Changing constant prefix from ~S to ~S to avoid invalid chars~%");
        $ic35$ = SubLObjectFactory.makeString("~&Using prefix \"~A\" for new constants~%");
        $ic36$ = SubLObjectFactory.makeString("~&Using suffix \"~A\" for new constants~%");
        $ic37$ = SubLObjectFactory.makeString("~&Using #$ResourceWithURIFn NARTs~%");
        $ic38$ = SubLObjectFactory.makeKeyword("ONTOLOGY-TERM");
        $ic39$ = SubLObjectFactory.makeKeyword("ONTOLOGY-MT");
        $ic40$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("retainTerm"));
        $ic41$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OWLOntologyFn"));
        $ic42$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic43$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ContextOfPCWFn"));
        $ic44$ = SubLObjectFactory.makeString("~&Using ontology-term ");
        $ic45$ = SubLObjectFactory.makeString("~&Using ontology-mt ");
        $ic46$ = SubLObjectFactory.makeString("~&Using ontology-term ~S~%");
        $ic47$ = SubLObjectFactory.makeString("~&Using ontology-mt ~S~%");
        $ic48$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#10299", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#48031", "CYC"));
        $ic49$ = SubLObjectFactory.makeString("xml:base");
        $ic50$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("baseNamespaceForSKS"));
        $ic51$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("URIFn"));
        $ic52$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameSpacePrefixForSKS"));
        $ic53$ = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $ic54$ = SubLObjectFactory.makeKeyword("GRAPH-TRANSLATION-FUNCTIONS");
        $ic55$ = SubLObjectFactory.makeKeyword("NODE-COUNT");
        $ic56$ = SubLObjectFactory.makeKeyword("TRIPLE-COUNT");
        $ic57$ = SubLObjectFactory.makeString("~A triples~%");
        $ic58$ = SubLObjectFactory.makeString("~A nodes~%");
        $ic59$ = SubLObjectFactory.makeSymbol("CAR");
        $ic60$ = SubLObjectFactory.makeSymbol("S#4084", "CYC");
        $ic61$ = SubLObjectFactory.makeSymbol("CDR");
        $ic62$ = SubLObjectFactory.makeSymbol(">");
        $ic63$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic64$ = SubLObjectFactory.makeSymbol("STRING=");
        $ic65$ = SubLObjectFactory.makeKeyword("URI");
        $ic66$ = SubLObjectFactory.makeString("~A: URI ~S is not valid~%");
        $ic67$ = SubLObjectFactory.makeKeyword("FILENAME");
        $ic68$ = SubLObjectFactory.makeString("~A: FILENAME ~S does not exist~%");
        $ic69$ = SubLObjectFactory.makeKeyword("IMPORTER-OPTIONS");
        $ic70$ = SubLObjectFactory.makeString("~A: IMPORTER-OPTIONS ~S is not a valid property list~%");
        $ic71$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Cyclist"));
        $ic72$ = SubLObjectFactory.makeString("~A: IMPORTER-OPTIONS :cyclist ~A is not a #$Cyclist~%");
        $ic73$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Guest"));
        $ic74$ = SubLObjectFactory.makeString("~A: Please log in with (set-the-cyclist [Cyc Account])~%");
        $ic75$ = SubLObjectFactory.makeString("~A: IMPORTER-OPTIONS has invalid keys: ~A~%");
        $ic76$ = SubLObjectFactory.makeString("Errors found, aborting import...");
        $ic77$ = SubLObjectFactory.makeSymbol("S#48026", "CYC");
        $ic78$ = SubLObjectFactory.makeString("$revision: 1.2 $");
        $ic79$ = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $ic80$ = SubLObjectFactory.makeString("2");
        $ic81$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SoftwareVersion"));
        $ic82$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OWLImporter-Cyc"));
        $ic83$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UserOfProgramFn"));
        $ic84$ = SubLObjectFactory.makeKeyword("NODES-DONE");
        $ic85$ = SubLObjectFactory.makeKeyword("TRIPLES-DONE");
        $ic86$ = SubLObjectFactory.makeKeyword("TERMS-CREATED");
        $ic87$ = SubLObjectFactory.makeKeyword("ASSERTIONS-CREATED");
        $ic88$ = SubLObjectFactory.makeString("type");
        $ic89$ = SubLObjectFactory.makeString("Ontology");
        $ic90$ = SubLObjectFactory.makeSymbol("S#47920", "CYC");
        $ic91$ = SubLObjectFactory.makeSymbol("S#47921", "CYC");
        $ic92$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#1519", "CYC"), SubLObjectFactory.makeSymbol("S#47557", "CYC"), SubLObjectFactory.makeSymbol("S#2813", "CYC"), SubLObjectFactory.makeSymbol("S#10129", "CYC"), SubLObjectFactory.makeSymbol("S#710", "CYC"), SubLObjectFactory.makeSymbol("IMPORT"), SubLObjectFactory.makeSymbol("S#45584", "CYC"), SubLObjectFactory.makeSymbol("S#13098", "CYC"), SubLObjectFactory.makeSymbol("S#45663", "CYC"), SubLObjectFactory.makeSymbol("S#48032", "CYC"), SubLObjectFactory.makeSymbol("S#6511", "CYC"), SubLObjectFactory.makeSymbol("S#5845", "CYC") });
        $ic93$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("URI"), SubLObjectFactory.makeKeyword("FILE"), SubLObjectFactory.makeKeyword("GRAPH"), SubLObjectFactory.makeKeyword("CYCLIST"), SubLObjectFactory.makeKeyword("IMPORT"), SubLObjectFactory.makeKeyword("ONTOLOGIES"), SubLObjectFactory.makeKeyword("TERMS"), SubLObjectFactory.makeKeyword("SENTENCES"), SubLObjectFactory.makeKeyword("STATS"), SubLObjectFactory.makeKeyword("OPTIONS"), SubLObjectFactory.makeKeyword("THREAD") });
        $ic94$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#47941", "CYC"), SubLObjectFactory.makeSymbol("S#47942", "CYC"), SubLObjectFactory.makeSymbol("S#47943", "CYC"), SubLObjectFactory.makeSymbol("S#47944", "CYC"), SubLObjectFactory.makeSymbol("S#47945", "CYC"), SubLObjectFactory.makeSymbol("S#47946", "CYC"), SubLObjectFactory.makeSymbol("S#47947", "CYC"), SubLObjectFactory.makeSymbol("S#47948", "CYC"), SubLObjectFactory.makeSymbol("S#47949", "CYC"), SubLObjectFactory.makeSymbol("S#47950", "CYC"), SubLObjectFactory.makeSymbol("S#47951", "CYC"), SubLObjectFactory.makeSymbol("S#47952", "CYC") });
        $ic95$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("S#47953", "CYC"), SubLObjectFactory.makeSymbol("S#47954", "CYC"), SubLObjectFactory.makeSymbol("S#47955", "CYC"), SubLObjectFactory.makeSymbol("S#47956", "CYC"), SubLObjectFactory.makeSymbol("S#47957", "CYC"), SubLObjectFactory.makeSymbol("S#47958", "CYC"), SubLObjectFactory.makeSymbol("S#47959", "CYC"), SubLObjectFactory.makeSymbol("S#47960", "CYC"), SubLObjectFactory.makeSymbol("S#47961", "CYC"), SubLObjectFactory.makeSymbol("S#47962", "CYC"), SubLObjectFactory.makeSymbol("S#47963", "CYC"), SubLObjectFactory.makeSymbol("S#47964", "CYC") });
        $ic96$ = SubLObjectFactory.makeSymbol("S#47968", "CYC");
        $ic97$ = SubLObjectFactory.makeSymbol("S#47940", "CYC");
        $ic98$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#47921", "CYC"));
        $ic99$ = SubLObjectFactory.makeSymbol("S#47941", "CYC");
        $ic100$ = SubLObjectFactory.makeSymbol("S#47953", "CYC");
        $ic101$ = SubLObjectFactory.makeSymbol("S#47942", "CYC");
        $ic102$ = SubLObjectFactory.makeSymbol("S#47954", "CYC");
        $ic103$ = SubLObjectFactory.makeSymbol("S#47943", "CYC");
        $ic104$ = SubLObjectFactory.makeSymbol("S#47955", "CYC");
        $ic105$ = SubLObjectFactory.makeSymbol("S#47944", "CYC");
        $ic106$ = SubLObjectFactory.makeSymbol("S#47956", "CYC");
        $ic107$ = SubLObjectFactory.makeSymbol("S#47945", "CYC");
        $ic108$ = SubLObjectFactory.makeSymbol("S#47957", "CYC");
        $ic109$ = SubLObjectFactory.makeSymbol("S#47946", "CYC");
        $ic110$ = SubLObjectFactory.makeSymbol("S#47958", "CYC");
        $ic111$ = SubLObjectFactory.makeSymbol("S#47947", "CYC");
        $ic112$ = SubLObjectFactory.makeSymbol("S#47959", "CYC");
        $ic113$ = SubLObjectFactory.makeSymbol("S#47948", "CYC");
        $ic114$ = SubLObjectFactory.makeSymbol("S#47960", "CYC");
        $ic115$ = SubLObjectFactory.makeSymbol("S#47949", "CYC");
        $ic116$ = SubLObjectFactory.makeSymbol("S#47961", "CYC");
        $ic117$ = SubLObjectFactory.makeSymbol("S#47950", "CYC");
        $ic118$ = SubLObjectFactory.makeSymbol("S#47962", "CYC");
        $ic119$ = SubLObjectFactory.makeSymbol("S#47951", "CYC");
        $ic120$ = SubLObjectFactory.makeSymbol("S#47963", "CYC");
        $ic121$ = SubLObjectFactory.makeSymbol("S#47952", "CYC");
        $ic122$ = SubLObjectFactory.makeSymbol("S#47964", "CYC");
        $ic123$ = SubLObjectFactory.makeKeyword("ID");
        $ic124$ = SubLObjectFactory.makeKeyword("FILE");
        $ic125$ = SubLObjectFactory.makeKeyword("GRAPH");
        $ic126$ = SubLObjectFactory.makeKeyword("IMPORT");
        $ic127$ = SubLObjectFactory.makeKeyword("ONTOLOGIES");
        $ic128$ = SubLObjectFactory.makeKeyword("TERMS");
        $ic129$ = SubLObjectFactory.makeKeyword("SENTENCES");
        $ic130$ = SubLObjectFactory.makeKeyword("STATS");
        $ic131$ = SubLObjectFactory.makeKeyword("OPTIONS");
        $ic132$ = SubLObjectFactory.makeKeyword("THREAD");
        $ic133$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic134$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic135$ = SubLObjectFactory.makeSymbol("S#47965", "CYC");
        $ic136$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic137$ = SubLObjectFactory.makeKeyword("END");
        $ic138$ = SubLObjectFactory.makeSymbol("S#47967", "CYC");
        $ic139$ = SubLObjectFactory.makeString("<OWL-IMPORTER ~D for ~A>");
        $ic140$ = SubLObjectFactory.makeSymbol("URL-P");
        $ic141$ = SubLObjectFactory.makeSymbol("S#6825", "CYC");
        $ic142$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic143$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic144$ = SubLObjectFactory.makeSymbol("S#46652", "CYC");
        $ic145$ = SubLObjectFactory.makeString("No import owl:Ontology URI found.  Aborting.");
        $ic146$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SoftwareVersionFn"));
        $ic147$ = SubLObjectFactory.makeSymbol("S#48028", "CYC");
        $ic148$ = SubLObjectFactory.makeSymbol("S#48029", "CYC");
        $ic149$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic150$ = SubLObjectFactory.makeSymbol("S#46508", "CYC");
        $ic151$ = SubLObjectFactory.makeSymbol("PROCESSP");
        $ic152$ = SubLObjectFactory.makeSymbol("S#48001", "CYC");
        $ic153$ = SubLObjectFactory.makeString("Importing ");
        $ic154$ = SubLObjectFactory.makeString(" triples...");
        $ic155$ = SubLObjectFactory.makeString("node-count: ~A~%");
        $ic156$ = SubLObjectFactory.makeString("real-node-count: ~A~%");
        $ic157$ = SubLObjectFactory.makeString("triple-count: ~A~%");
        $ic158$ = SubLObjectFactory.makeString("real-triple-count: ~A~%");
        $ic159$ = SubLObjectFactory.makeInteger(40);
        $ic160$ = SubLObjectFactory.makeString("Assert nesting depth: ~D");
        $ic161$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic162$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OWLProperty")));
        $ic163$ = SubLObjectFactory.makeString("Failed to assert ~S in ~S");
        $ic164$ = SubLObjectFactory.makeString("~%");
        $ic165$ = SubLObjectFactory.makeString("~S is not a list node.");
        $ic166$ = SubLObjectFactory.makeString("nil");
        $ic167$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheEmptyList"));
        $ic168$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList"));
        $ic169$ = SubLObjectFactory.makeString("first");
        $ic170$ = SubLObjectFactory.makeSymbol("S#46526", "CYC");
        $ic171$ = SubLObjectFactory.makeString("rest");
        $ic172$ = SubLObjectFactory.makeString("Can't find or create term for ~S");
        $ic173$ = SubLObjectFactory.makeKeyword("USE-GENLS-FOR-RDFS-SUBCLASS?");
        $ic174$ = SubLObjectFactory.makeString("rdfs:subClassOf");
        $ic175$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic176$ = SubLObjectFactory.makeString("Could not find Cyc term for URI ~A");
        $ic177$ = SubLObjectFactory.makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES");
        $ic178$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic179$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermFromOntologyFn"));
        $ic180$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $ic181$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $ic182$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("rdfURI"));
        $ic183$ = SubLObjectFactory.makeKeyword("USE-RDFS-LABEL-FOR-CONSTANT-NAME?");
        $ic184$ = SubLObjectFactory.makeString("rdfs:label");
        $ic185$ = SubLObjectFactory.makeString("rdf:type");
        $ic186$ = SubLObjectFactory.makeString("owl:Class");
        $ic187$ = SubLObjectFactory.makeSymbol("S#46534", "CYC");
        $ic188$ = SubLObjectFactory.makeString("intersectionOf");
        $ic189$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $ic190$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $ic191$ = SubLObjectFactory.makeString("unionOf");
        $ic192$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn"));
        $ic193$ = SubLObjectFactory.makeString("complementOf");
        $ic194$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn"));
        $ic195$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic196$ = SubLObjectFactory.makeString("onProperty");
        $ic197$ = SubLObjectFactory.makeString("allValuesFrom");
        $ic198$ = SubLObjectFactory.makeString("hasValue");
        $ic199$ = SubLObjectFactory.makeString("someValuesFrom");
        $ic200$ = SubLObjectFactory.makeString("valuesFrom");
        $ic201$ = SubLObjectFactory.makeString("subClassOf");
        $ic202$ = SubLObjectFactory.makeString("cardinality");
        $ic203$ = SubLObjectFactory.makeString("minCardinality");
        $ic204$ = SubLObjectFactory.makeString("maxCardinality");
        $ic205$ = SubLObjectFactory.makeKeyword("ONLY-ASSERT-RESTRICTIONS-AS-RMP-GAFS?");
        $ic206$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationAllOnly"));
        $ic207$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $ic208$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $ic209$ = SubLObjectFactory.makeSymbol("?X");
        $ic210$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceOnly"));
        $ic211$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $ic212$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceExists"));
        $ic213$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationAllInstance"));
        $ic214$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsMax"));
        $ic215$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMax"));
        $ic216$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsMin"));
        $ic217$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsMin"));
        $ic218$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount"));
        $ic219$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount"));
        $ic220$ = SubLObjectFactory.makeString("restriction not handled yet: ~A~% ~A~% ~A~% ~A~%");
        $ic221$ = SubLObjectFactory.makeString("oneOf");
        $ic222$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheCollection"));
        $ic223$ = SubLObjectFactory.makeString("AnonymousOWLTerm");
        $ic224$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $ic225$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm"));
        $ic226$ = SubLObjectFactory.makeSymbol("S#46525", "CYC");
        $ic227$ = SubLObjectFactory.makeString("~&~A was not the object of any rdfs:subClassOf triples!  No RMP assertion made.~%");
        $ic228$ = SubLObjectFactory.makeString("Eliminating blank nodes...");
        $ic229$ = SubLObjectFactory.makeString("rdfs:domain");
        $ic230$ = SubLObjectFactory.makeString("owl:Thing");
        $ic231$ = SubLObjectFactory.makeString("rdfs:range");
        $ic232$ = SubLObjectFactory.makeSymbol("S#46521", "CYC");
        $ic233$ = SubLObjectFactory.makeString("rdf:Property");
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
        private static final SubLStructDeclNative structDecl;
        
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
            return (SubLStructDecl)$sX47920_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$sX47920_native.class, module0713.$ic90$, module0713.$ic91$, module0713.$ic92$, module0713.$ic93$, new String[] { "$id", "$uri", "$file", "$graph", "$cyclist", "$import", "$ontologies", "$terms", "$sentences", "$stats", "$options", "$thread" }, module0713.$ic94$, module0713.$ic95$, module0713.$ic96$);
        }
    }
    
    public static final class $f43789$UnaryFunction extends UnaryFunction
    {
        public $f43789$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#47921"));
        }
        
        public SubLObject processItem(final SubLObject var59) {
            return module0713.f43789(var59);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0713.class
	Total time: 872 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/