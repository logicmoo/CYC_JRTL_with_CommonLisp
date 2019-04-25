package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0673 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0673";
    public static final String myFingerPrint = "901fa70a7ca4722c0d270626a549a9497b88537cb5448c2982c0b15bc01edbe0";
    private static SubLSymbol $g5304$;
    public static SubLSymbol $g5303$;
    public static SubLSymbol $g5305$;
    public static SubLSymbol $g5306$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLSymbol $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLSymbol $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLObject $ic20$;
    private static final SubLObject $ic21$;
    private static final SubLList $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLString $ic29$;
    private static final SubLString $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLString $ic32$;
    private static final SubLString $ic33$;
    private static final SubLString $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLString $ic37$;
    private static final SubLString $ic38$;
    private static final SubLString $ic39$;
    private static final SubLString $ic40$;
    private static final SubLString $ic41$;
    private static final SubLString $ic42$;
    private static final SubLString $ic43$;
    private static final SubLString $ic44$;
    private static final SubLInteger $ic45$;
    private static final SubLString $ic46$;
    private static final SubLString $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLString $ic51$;
    private static final SubLString $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLString $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLString $ic63$;
    private static final SubLString $ic64$;
    private static final SubLSymbol $ic65$;
    private static final SubLString $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLList $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLSymbol $ic81$;
    private static final SubLSymbol $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLString $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLString $ic100$;
    private static final SubLString $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLSymbol $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLObject $ic107$;
    private static final SubLString $ic108$;
    private static final SubLString $ic109$;
    private static final SubLString $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLString $ic113$;
    private static final SubLString $ic114$;
    private static final SubLString $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLObject $ic118$;
    private static final SubLString $ic119$;
    private static final SubLString $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLString $ic124$;
    private static final SubLString $ic125$;
    private static final SubLString $ic126$;
    private static final SubLString $ic127$;
    private static final SubLString $ic128$;
    private static final SubLString $ic129$;
    private static final SubLString $ic130$;
    private static final SubLString $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLString $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLSymbol $ic142$;
    private static final SubLSymbol $ic143$;
    private static final SubLString $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLSymbol $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLString $ic152$;
    private static final SubLSymbol $ic153$;
    private static final SubLString $ic154$;
    private static final SubLObject $ic155$;
    private static final SubLInteger $ic156$;
    private static final SubLSymbol $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLSymbol $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLSymbol $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLSymbol $ic166$;
    private static final SubLString $ic167$;
    private static final SubLString $ic168$;
    private static final SubLSymbol $ic169$;
    private static final SubLString $ic170$;
    private static final SubLString $ic171$;
    private static final SubLSymbol $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLString $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLString $ic179$;
    private static final SubLString $ic180$;
    private static final SubLString $ic181$;
    private static final SubLString $ic182$;
    private static final SubLString $ic183$;
    private static final SubLString $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLString $ic186$;
    private static final SubLString $ic187$;
    private static final SubLString $ic188$;
    private static final SubLSymbol $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLString $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLString $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLString $ic207$;
    private static final SubLString $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLString $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLString $ic214$;
    private static final SubLString $ic215$;
    private static final SubLString $ic216$;
    private static final SubLSymbol $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLString $ic219$;
    private static final SubLString $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLSymbol $ic225$;
    private static final SubLString $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLString $ic230$;
    private static final SubLString $ic231$;
    private static final SubLString $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLString $ic234$;
    private static final SubLSymbol $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLString $ic237$;
    private static final SubLString $ic238$;
    private static final SubLList $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLString $ic242$;
    private static final SubLString $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLString $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLString $ic247$;
    private static final SubLString $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLString $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLString $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLSymbol $ic259$;
    private static final SubLString $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLString $ic262$;
    private static final SubLString $ic263$;
    private static final SubLSymbol $ic264$;
    private static final SubLSymbol $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLString $ic269$;
    private static final SubLString $ic270$;
    private static final SubLString $ic271$;
    private static final SubLString $ic272$;
    private static final SubLList $ic273$;
    private static final SubLSymbol $ic274$;
    private static final SubLList $ic275$;
    private static final SubLString $ic276$;
    private static final SubLSymbol $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLSymbol $ic280$;
    private static final SubLSymbol $ic281$;
    private static final SubLString $ic282$;
    private static final SubLString $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLString $ic285$;
    private static final SubLList $ic286$;
    private static final SubLSymbol $ic287$;
    
    public static SubLObject f41078(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0111.$g1406$.currentBinding(var2);
        try {
            module0111.$g1406$.bind((SubLObject)module0673.NIL, var2);
            return module0543.f33618(var1);
        }
        finally {
            module0111.$g1406$.rebind(var3, var2);
        }
    }
    
    public static SubLObject f41079(final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)module0673.NIL;
        SubLObject var8 = (SubLObject)module0673.NIL;
        final SubLObject var9 = module0111.$g1406$.currentBinding(var6);
        try {
            module0111.$g1406$.bind((SubLObject)module0673.NIL, var6);
            try {
                var6.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var3_8 = Errors.$error_handler$.currentBinding(var6);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0673.$ic1$, var6);
                    try {
                        var7 = module0541.f33546(var4, var5, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    }
                    catch (Throwable var10) {
                        Errors.handleThrowable(var10, (SubLObject)module0673.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var3_8, var6);
                }
            }
            catch (Throwable var11) {
                var8 = Errors.handleThrowable(var11, module0003.$g3$.getGlobalValue());
            }
            finally {
                var6.throwStack.pop();
            }
        }
        finally {
            module0111.$g1406$.rebind(var9, var6);
        }
        return (module0673.NIL != var8) ? var8 : var7;
    }
    
    public static SubLObject f41080(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (module0673.NIL != module0173.f10955(var11)) {
            final SubLObject var13 = f41081(var11);
            final SubLObject var14 = (SubLObject)SubLObjectFactory.makeBoolean(module0673.NIL == var13);
            if (module0673.NIL != module0655.$g5115$.getDynamicValue(var12)) {
                if (module0673.NIL != module0673.$g5303$.getDynamicValue(var12)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic2$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)module0673.$ic3$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                if (module0673.NIL != module0269.f17705(var11)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic4$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (module0673.NIL != module0269.f17705(var11)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic5$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (module0673.NIL != module0206.f13447(var11)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic6$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (module0673.NIL != module0269.f17731(var11)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic7$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (module0673.NIL == module0167.f10813(var11)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic8$, var11, (SubLObject)module0673.NIL, var14, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (module0673.NIL != f41082(var11)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic9$, var11, (SubLObject)module0673.NIL, var14, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                if (module0673.NIL != module0655.$g5117$.getDynamicValue(var12)) {
                    module0656.f39837((SubLObject)module0673.$ic10$, var11, (SubLObject)module0673.NIL, var14, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                }
                else {
                    module0656.f39837((SubLObject)module0673.$ic11$, var11, (SubLObject)module0673.NIL, var14, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (module0673.NIL != module0633.f38716(var11, (SubLObject)module0673.UNPROVIDED)) {
                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                final SubLObject var15 = (SubLObject)module0673.NIL;
                module0642.f39020(module0015.$g459$.getGlobalValue());
                if (module0673.NIL != var15) {
                    module0656.f39837((SubLObject)module0673.$ic12$, var11, (SubLObject)module0673.$ic13$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                }
                else {
                    module0656.f39837((SubLObject)module0673.$ic14$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39020(module0015.$g460$.getGlobalValue());
                final SubLObject var16 = module0633.f38713(var11, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL != module0173.f10955(var16)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic15$, var16, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    if (module0673.NIL != module0684.f41933(var16)) {
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39032((SubLObject)module0673.UNPROVIDED);
                        module0656.f39837((SubLObject)module0673.$ic16$, var16, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                }
            }
            if (module0673.NIL != module0633.f38718(var11, (SubLObject)module0673.UNPROVIDED)) {
                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)module0673.$ic17$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (module0673.NIL != module0633.f38716(var11, (SubLObject)module0673.UNPROVIDED)) {
                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)module0673.$ic18$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (module0673.NIL != module0423.f29532(var11)) {
                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)module0673.$ic15$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                if (module0673.NIL != module0684.f41933(var11)) {
                    module0642.f39032((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0673.$ic16$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)module0673.$ic19$, var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41081(final SubLObject var16) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0673.NIL == module0259.f16976(var16, module0673.$ic20$) && module0673.NIL == module0259.f16976(var16, module0673.$ic21$) && module0673.NIL == module0127.f8414(var16));
    }
    
    public static SubLObject f41082(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0673.NIL != constant_handles_oc.f8449(var16) || (module0673.NIL != module0167.f10813(var16) && module0673.NIL != module0035.f2169(module0205.f13364(var16), module0673.$g5304$.getDynamicValue(var17))));
    }
    
    public static SubLObject f41083(SubLObject var17) {
        if (var17 == module0673.UNPROVIDED) {
            var17 = (SubLObject)module0673.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic25$);
        }
        else {
            final SubLObject var19 = (SubLObject)module0673.$ic26$;
            final SubLObject var20 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
                module0642.f39020((SubLObject)module0673.$ic27$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var21 = module0014.f672((SubLObject)module0673.$ic28$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL != var21) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(var21);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                module0016.f941();
                if (module0673.NIL != var19) {
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var19);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                final SubLObject var3_20 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)module0673.T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_21 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_22 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019((SubLObject)module0673.$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_22, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0673.NIL != var19) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019(var19);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        final SubLObject var22 = module0656.f39832((SubLObject)module0673.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic38$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        if (module0673.NIL != var22) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(var22);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_23 = module0015.$g533$.currentBinding(var18);
                        final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                        final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0015.$g541$.bind((SubLObject)module0673.T, var18);
                            module0015.$g539$.bind(module0015.f797(), var18);
                            module0642.f39069((SubLObject)module0673.$ic39$, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED);
                            module0656.f39870((SubLObject)module0673.$ic23$, (SubLObject)module0673.NIL, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39073((SubLObject)module0673.$ic40$);
                            module0642.f39032((SubLObject)module0673.UNPROVIDED);
                            module0642.f39074((SubLObject)module0673.$ic26$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0673.$ic41$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                            module0666.f40467((SubLObject)module0673.$ic42$, (SubLObject)module0673.$ic43$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39032((SubLObject)module0673.UNPROVIDED);
                            module0642.f39075((SubLObject)module0673.$ic42$, (SubLObject)module0673.$ic44$, (SubLObject)module0673.$ic45$);
                            module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                            module0656.f39812((SubLObject)module0673.$ic46$, (SubLObject)module0673.$ic47$, module0656.f39810(), (SubLObject)module0673.UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g539$.rebind(var24, var18);
                            module0015.$g541$.rebind(var23, var18);
                            module0015.$g533$.rebind(var3_23, var18);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_21, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_20, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var20, var18);
            }
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41084(final SubLObject var17) {
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic49$);
            return (SubLObject)module0673.NIL;
        }
        final SubLObject var18 = module0038.f2735(module0642.f39104((SubLObject)module0673.$ic42$, var17));
        if (!var18.isString() || var18.equal((SubLObject)module0673.$ic44$)) {
            module0656.f39789((SubLObject)module0673.$ic50$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else if (module0673.NIL == module0126.f8389(var18)) {
            module0656.f39789((SubLObject)module0673.$ic51$, var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else if (module0673.NIL != constants_high_oc.f10737(var18)) {
            module0656.f39789((SubLObject)module0673.$ic52$, var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else {
            final SubLObject var19 = f41078(var18);
            if (module0673.NIL != constant_handles_oc.f8449(var19)) {
                module0677.f41359(var19);
                module0674.f41154((SubLObject)module0673.$ic53$, (SubLObject)module0673.NIL, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            }
            else {
                module0656.f39789((SubLObject)module0673.$ic54$, var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            }
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41085(SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic58$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)module0673.$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0673.$ic60$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            if (module0673.NIL != module0014.f695((SubLObject)module0673.$ic56$)) {
                final SubLObject var32 = module0014.f697((SubLObject)module0673.$ic56$);
                final SubLObject var33 = (SubLObject)module0673.$ic61$;
                final SubLObject var34 = module0014.f694((SubLObject)module0673.$ic56$);
                final SubLObject var35 = (SubLObject)module0673.ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(var32);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL != var34) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(var34);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                if (module0673.NIL != var33) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0642.f39049(var33));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                if (module0673.NIL != var35) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(var35);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                final SubLObject var3_34 = module0015.$g533$.currentBinding(var29);
                try {
                    module0015.$g533$.bind((SubLObject)module0673.T, var29);
                }
                finally {
                    module0015.$g533$.rebind(var3_34, var29);
                }
                module0642.f39020(module0015.$g432$.getGlobalValue());
                module0642.f39067();
            }
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41086(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic68$);
        }
        else {
            SubLObject var19 = (SubLObject)module0673.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)module0673.$ic69$);
            var19 = var17.first();
            final SubLObject var20 = var17.rest();
            if (module0673.NIL == var20) {
                final SubLObject var21 = module0656.f39943(var19, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL == module0173.f10955(var21)) {
                    module0656.f39789((SubLObject)module0673.$ic70$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    return (SubLObject)module0673.NIL;
                }
                var19 = module0656.f39842(var21);
                final SubLObject var22 = (SubLObject)module0673.$ic71$;
                final SubLObject var23 = module0015.$g538$.currentBinding(var18);
                try {
                    module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
                    module0642.f39020((SubLObject)module0673.$ic27$);
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                    final SubLObject var24 = module0014.f672((SubLObject)module0673.$ic28$);
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    if (module0673.NIL != var24) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(var24);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    module0016.f941();
                    if (module0673.NIL != var22) {
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var22);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0666.f40471();
                    module0666.f40487();
                    module0666.f40535();
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_38 = module0015.$g535$.currentBinding(var18);
                    try {
                        module0015.$g535$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_39 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic34$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            final SubLObject var3_40 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0673.T, var18);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020((SubLObject)module0673.$ic35$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020((SubLObject)module0673.$ic36$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019((SubLObject)module0673.$ic37$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_40, var18);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (module0673.NIL != var22) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019(var22);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            }
                            final SubLObject var25 = module0656.f39832((SubLObject)module0673.NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic38$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            if (module0673.NIL != var25) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            final SubLObject var3_41 = module0015.$g533$.currentBinding(var18);
                            final SubLObject var26 = module0015.$g541$.currentBinding(var18);
                            final SubLObject var27 = module0015.$g539$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0673.T, var18);
                                module0015.$g541$.bind((SubLObject)module0673.T, var18);
                                module0015.$g539$.bind(module0015.f797(), var18);
                                module0642.f39069((SubLObject)module0673.$ic72$, var19, (SubLObject)module0673.UNPROVIDED);
                                module0656.f39870((SubLObject)module0673.$ic65$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)module0673.$ic73$);
                                module0656.f39804(var21, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019((SubLObject)module0673.$ic74$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                                module0642.f39079((SubLObject)module0673.$ic42$, (SubLObject)module0673.$ic44$, (SubLObject)module0673.$ic45$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39073((SubLObject)module0673.$ic40$);
                                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                                module0642.f39074((SubLObject)module0673.$ic75$, (SubLObject)module0673.$ic76$, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39032((SubLObject)module0673.UNPROVIDED);
                                module0642.f39074((SubLObject)module0673.$ic77$, (SubLObject)module0673.$ic78$, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                                module0656.f39812((SubLObject)module0673.$ic46$, (SubLObject)module0673.$ic47$, module0656.f39810(), (SubLObject)module0673.UNPROVIDED);
                                module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)module0673.$ic79$);
                                module0656.f39804(var21, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019((SubLObject)module0673.$ic80$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                                final SubLObject var3_42 = module0655.$g5134$.currentBinding(var18);
                                final SubLObject var25_43 = module0655.$g5126$.currentBinding(var18);
                                final SubLObject var26_44 = module0655.$g5079$.currentBinding(var18);
                                final SubLObject var28 = module0655.$g5124$.currentBinding(var18);
                                try {
                                    module0655.$g5134$.bind((SubLObject)module0673.$ic81$, var18);
                                    module0655.$g5126$.bind((SubLObject)module0673.NIL, var18);
                                    module0655.$g5079$.bind((SubLObject)module0673.$ic82$, var18);
                                    module0655.$g5124$.bind((SubLObject)module0673.T, var18);
                                    module0660.f40185(var21);
                                }
                                finally {
                                    module0655.$g5124$.rebind(var28, var18);
                                    module0655.$g5079$.rebind(var26_44, var18);
                                    module0655.$g5126$.rebind(var25_43, var18);
                                    module0655.$g5134$.rebind(var3_42, var18);
                                }
                                module0015.f799(module0015.$g539$.getDynamicValue(var18));
                            }
                            finally {
                                module0015.$g539$.rebind(var27, var18);
                                module0015.$g541$.rebind(var26, var18);
                                module0015.$g533$.rebind(var3_41, var18);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_39, var18);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var3_38, var18);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var23, var18);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0673.$ic69$);
            }
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41087(final SubLObject var17) {
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic84$);
            return (SubLObject)module0673.NIL;
        }
        final SubLObject var18 = module0656.f39943(var17.first(), (SubLObject)module0673.UNPROVIDED);
        final SubLObject var19 = module0038.f2735(module0642.f39104((SubLObject)module0673.$ic42$, var17));
        SubLObject var20 = (SubLObject)module0673.NIL;
        final SubLObject var21 = module0642.f39104((SubLObject)module0673.$ic78$, var17);
        if (module0673.NIL == module0173.f10955(var18)) {
            return module0656.f39789((SubLObject)module0673.$ic85$, var17.first(), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        if (!var19.isString() || var19.equal((SubLObject)module0673.$ic44$)) {
            return module0656.f39789((SubLObject)module0673.$ic86$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        if (module0673.NIL == var21 && module0673.NIL == module0126.f8389(var19) && module0673.NIL == module0656.f39950(var19, (SubLObject)module0673.UNPROVIDED)) {
            return module0656.f39789((SubLObject)module0673.$ic87$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        if (module0673.NIL != module0656.f39950(var19, (SubLObject)module0673.UNPROVIDED)) {
            var20 = module0656.f39950(var19, (SubLObject)module0673.UNPROVIDED);
        }
        else if (module0673.NIL != var21) {
            final SubLObject var22 = module0656.f39943(var19, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL == module0173.f10955(var22)) {
                return module0656.f39789((SubLObject)module0673.$ic85$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            }
            var20 = var22;
        }
        else {
            final SubLObject var23 = constants_high_oc.f10737(var19);
            if (module0673.NIL != var23) {
                return module0656.f39789((SubLObject)module0673.$ic88$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            }
            final SubLObject var24 = module0126.f8393(var19, (SubLObject)module0673.NIL, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL != var24) {
                return module0656.f39789((SubLObject)module0673.$ic89$, var24.first(), var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            }
            var20 = f41078(var19);
        }
        if (module0673.NIL == module0205.f13296(var20)) {
            return module0656.f39789((SubLObject)module0673.$ic90$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        module0677.f41358(var20);
        final SubLObject var25 = module0173.f10958(var18);
        final SubLObject var26 = (module0673.NIL != module0202.f12590(var20)) ? var20 : module0173.f10958(var20);
        SubLObject var27 = conses_high.nthcdr((SubLObject)module0673.THREE_INTEGER, var17);
        SubLObject var28 = (SubLObject)module0673.NIL;
        var28 = var27.first();
        while (module0673.NIL != var27) {
            final SubLObject var29 = reader.read_from_string_ignoring_errors(var28.first(), (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            if (var29.isInteger()) {
                final SubLObject var30 = assertion_handles_oc.f11053(var29);
                if (module0673.NIL != assertion_handles_oc.f11035(var30)) {
                    SubLObject var31 = module0543.f33671(var30);
                    SubLObject var32 = module0178.f11287(var30);
                    final SubLObject var33 = module0178.f11293(var30);
                    final SubLObject var34 = module0178.f11291(var30);
                    if (module0673.NIL != module0035.f2428(var25, var31, Symbols.symbol_function((SubLObject)module0673.EQUAL), (SubLObject)module0673.UNPROVIDED) || module0673.NIL != module0035.f2428(var25, var32, Symbols.symbol_function((SubLObject)module0673.$ic91$), (SubLObject)module0673.UNPROVIDED)) {
                        var31 = conses_high.subst(var26, var25, var31, Symbols.symbol_function((SubLObject)module0673.EQUAL), (SubLObject)module0673.UNPROVIDED);
                        var32 = conses_high.subst(var26, var25, var32, Symbols.symbol_function((SubLObject)module0673.EQUAL), (SubLObject)module0673.UNPROVIDED);
                        module0543.f33628(var31, var32, var33, var34);
                    }
                }
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        if (module0673.NIL != var21) {
            return module0674.f41154((SubLObject)module0673.$ic77$, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        return module0674.f41154((SubLObject)module0673.$ic75$, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
    }
    
    public static SubLObject f41088(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0587.$g4457$.currentBinding(var18);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var18), var18);
            if (module0673.NIL != module0543.f33698()) {
                try {
                    final SubLObject var3_61 = module0601.$g4652$.currentBinding(var18);
                    final SubLObject var20 = module0601.$g4654$.currentBinding(var18);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                        module0601.f36758((SubLObject)module0673.$ic95$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)module0673.$ic96$, module0667.f40585((SubLObject)module0673.$ic84$));
                    }
                    finally {
                        module0601.$g4654$.rebind(var20, var18);
                        module0601.$g4652$.rebind(var3_61, var18);
                    }
                }
                finally {
                    final SubLObject var3_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0673.$ic95$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_62, var18);
                    }
                }
                return (SubLObject)module0673.NIL;
            }
            final SubLObject var21 = module0642.f39104((SubLObject)module0673.$ic97$, var17);
            SubLObject var22 = module0205.f13306(var21);
            SubLObject var23 = (SubLObject)module0673.NIL;
            SubLObject var24 = (SubLObject)module0673.NIL;
            if (module0673.NIL == var22) {
                if (module0673.NIL == f41089(var21) && module0673.NIL == module0126.f8389(var21)) {
                    try {
                        final SubLObject var3_63 = module0601.$g4652$.currentBinding(var18);
                        final SubLObject var25 = module0601.$g4654$.currentBinding(var18);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                            module0601.f36758((SubLObject)module0673.$ic98$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                            try {
                                final SubLObject var3_64 = module0601.$g4652$.currentBinding(var18);
                                final SubLObject var25_69 = module0601.$g4654$.currentBinding(var18);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                    module0601.f36758((SubLObject)module0673.$ic95$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                    try {
                                        final SubLObject var3_65 = module0601.$g4652$.currentBinding(var18);
                                        final SubLObject var25_70 = module0601.$g4654$.currentBinding(var18);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                            module0601.f36758((SubLObject)module0673.$ic99$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                            PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)module0673.$ic100$, var21);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var25_70, var18);
                                            module0601.$g4652$.rebind(var3_65, var18);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_66 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                            module0601.f36760((SubLObject)module0673.$ic99$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_66, var18);
                                        }
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var25_69, var18);
                                    module0601.$g4652$.rebind(var3_64, var18);
                                }
                            }
                            finally {
                                final SubLObject var3_67 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                    module0601.f36760((SubLObject)module0673.$ic95$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_67, var18);
                                }
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var25, var18);
                            module0601.$g4652$.rebind(var3_63, var18);
                        }
                    }
                    finally {
                        final SubLObject var3_68 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0673.$ic98$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_68, var18);
                        }
                    }
                    return (SubLObject)module0673.NIL;
                }
                if (module0673.NIL != module0126.f8393(var21, (SubLObject)module0673.NIL, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED)) {
                    try {
                        final SubLObject var3_69 = module0601.$g4652$.currentBinding(var18);
                        final SubLObject var25 = module0601.$g4654$.currentBinding(var18);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                            module0601.f36758((SubLObject)module0673.$ic98$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                            try {
                                final SubLObject var3_70 = module0601.$g4652$.currentBinding(var18);
                                final SubLObject var25_71 = module0601.$g4654$.currentBinding(var18);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                    module0601.f36758((SubLObject)module0673.$ic95$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                    try {
                                        final SubLObject var3_71 = module0601.$g4652$.currentBinding(var18);
                                        final SubLObject var25_72 = module0601.$g4654$.currentBinding(var18);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                            module0601.f36758((SubLObject)module0673.$ic99$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                            PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)module0673.$ic101$, module0126.f8393(var21, (SubLObject)module0673.NIL, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED).first(), var21);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var25_72, var18);
                                            module0601.$g4652$.rebind(var3_71, var18);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_72 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                            module0601.f36760((SubLObject)module0673.$ic99$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_72, var18);
                                        }
                                    }
                                }
                                finally {
                                    module0601.$g4654$.rebind(var25_71, var18);
                                    module0601.$g4652$.rebind(var3_70, var18);
                                }
                            }
                            finally {
                                final SubLObject var3_73 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                    module0601.f36760((SubLObject)module0673.$ic95$);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_73, var18);
                                }
                            }
                        }
                        finally {
                            module0601.$g4654$.rebind(var25, var18);
                            module0601.$g4652$.rebind(var3_69, var18);
                        }
                    }
                    finally {
                        final SubLObject var3_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                            module0601.f36746();
                            module0601.f36760((SubLObject)module0673.$ic98$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_74, var18);
                        }
                    }
                    return (SubLObject)module0673.NIL;
                }
                if (module0673.NIL != module0126.f8389(var21)) {
                    var22 = f41078(var21);
                }
                else {
                    var22 = reader.read_from_string_ignoring_errors(module0038.f2933(var21), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                }
            }
            if (module0673.NIL == module0205.f13296(var22)) {
                try {
                    final SubLObject var3_75 = module0601.$g4652$.currentBinding(var18);
                    final SubLObject var25 = module0601.$g4654$.currentBinding(var18);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                        module0601.f36758((SubLObject)module0673.$ic98$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                        try {
                            final SubLObject var3_76 = module0601.$g4652$.currentBinding(var18);
                            final SubLObject var25_73 = module0601.$g4654$.currentBinding(var18);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                module0601.f36758((SubLObject)module0673.$ic95$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)module0673.$ic102$, var21);
                            }
                            finally {
                                module0601.$g4654$.rebind(var25_73, var18);
                                module0601.$g4652$.rebind(var3_76, var18);
                            }
                        }
                        finally {
                            final SubLObject var3_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0673.$ic95$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var3_77, var18);
                            }
                        }
                        return (SubLObject)module0673.NIL;
                    }
                    finally {
                        module0601.$g4654$.rebind(var25, var18);
                        module0601.$g4652$.rebind(var3_75, var18);
                    }
                }
                finally {
                    final SubLObject var3_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                        module0601.f36760((SubLObject)module0673.$ic98$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_78, var18);
                    }
                }
            }
            SubLObject var26 = var17;
            SubLObject var27 = (SubLObject)module0673.NIL;
            var27 = var26.first();
            while (module0673.NIL != var26) {
                if (module0673.NIL != module0035.f2014(var27)) {
                    final SubLObject var28 = var27.first();
                    if (module0673.NIL != module0038.f2684(var28, (SubLObject)module0673.$ic103$)) {
                        final SubLObject var29 = module0657.f40022(var17, (SubLObject)ConsesLow.list((SubLObject)module0673.$ic104$, var28));
                        final SubLObject var30 = Sequences.subseq(var28, (SubLObject)module0673.EIGHT_INTEGER, (SubLObject)module0673.UNPROVIDED);
                        if (module0673.NIL != module0274.f18065(var29, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED)) {
                            var24 = (SubLObject)ConsesLow.cons(var29, var24);
                        }
                        else {
                            var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)module0673.$ic105$, var30, (SubLObject)module0673.$ic106$, module0642.f39104(var28, var17)), var23);
                        }
                    }
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
            if (module0673.NIL == var23) {
                var26 = Sequences.nreverse(var24);
                SubLObject var31 = (SubLObject)module0673.NIL;
                var31 = var26.first();
                while (module0673.NIL != var26) {
                    module0543.f33628(var31, module0673.$ic107$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    var26 = var26.rest();
                    var31 = var26.first();
                }
            }
            try {
                final SubLObject var3_79 = module0601.$g4652$.currentBinding(var18);
                final SubLObject var25 = module0601.$g4654$.currentBinding(var18);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                    module0601.f36758((SubLObject)module0673.$ic98$, (SubLObject)ConsesLow.list((SubLObject)module0673.$ic108$, module0213.f13918(var22)), (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                    if (module0673.NIL != var23) {
                        try {
                            final SubLObject var3_80 = module0601.$g4652$.currentBinding(var18);
                            final SubLObject var25_74 = module0601.$g4654$.currentBinding(var18);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                module0601.f36758((SubLObject)module0673.$ic95$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                SubLObject var32 = var23;
                                SubLObject var33 = (SubLObject)module0673.NIL;
                                var33 = var32.first();
                                while (module0673.NIL != var32) {
                                    final SubLObject var34 = conses_high.getf(var33, (SubLObject)module0673.$ic106$, (SubLObject)module0673.UNPROVIDED);
                                    final SubLObject var35 = (SubLObject)ConsesLow.list((SubLObject)module0673.$ic109$, conses_high.getf(var33, (SubLObject)module0673.$ic105$, (SubLObject)module0673.UNPROVIDED));
                                    try {
                                        final SubLObject var3_81 = module0601.$g4652$.currentBinding(var18);
                                        final SubLObject var25_75 = module0601.$g4654$.currentBinding(var18);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                            module0601.f36758((SubLObject)module0673.$ic110$, var35, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                            module0601.f36754(module0006.f204(var34));
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var25_75, var18);
                                            module0601.$g4652$.rebind(var3_81, var18);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_82 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)module0673.$ic110$);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_82, var18);
                                        }
                                    }
                                    var32 = var32.rest();
                                    var33 = var32.first();
                                }
                            }
                            finally {
                                module0601.$g4654$.rebind(var25_74, var18);
                                module0601.$g4652$.rebind(var3_80, var18);
                            }
                        }
                        finally {
                            final SubLObject var3_83 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0673.$ic95$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var3_83, var18);
                            }
                        }
                    }
                    else {
                        final SubLObject var36 = (SubLObject)ConsesLow.list((SubLObject)module0673.$ic111$, module0038.f2624(Sequences.length(var24)));
                        try {
                            final SubLObject var3_84 = module0601.$g4652$.currentBinding(var18);
                            final SubLObject var25_76 = module0601.$g4654$.currentBinding(var18);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                module0601.f36758((SubLObject)module0673.$ic112$, var36, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)module0673.$ic113$, Sequences.length(var24));
                            }
                            finally {
                                module0601.$g4654$.rebind(var25_76, var18);
                                module0601.$g4652$.rebind(var3_84, var18);
                            }
                        }
                        finally {
                            final SubLObject var3_85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                module0601.f36760((SubLObject)module0673.$ic112$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var3_85, var18);
                            }
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var25, var18);
                    module0601.$g4652$.rebind(var3_79, var18);
                }
            }
            finally {
                final SubLObject var3_86 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0673.$ic98$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_86, var18);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var19, var18);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41090(final SubLObject var11, SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic114$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)module0673.$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)module0673.$ic115$, module0656.f39842(var11));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41091() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (module0673.NIL != module0652.$g5075$.getDynamicValue(var2)) {
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(module0652.$g5075$.getDynamicValue(var2));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39020(module0015.$g147$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic117$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var2);
            if (module0574.f35152().equal(module0673.$ic118$)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)module0673.$ic119$);
                module0656.f39804(module0574.f35152(), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                module0642.f39019((SubLObject)module0673.$ic120$);
                module0667.f40571((SubLObject)module0673.$ic121$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.$ic122$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                module0642.f39019((SubLObject)module0673.$ic123$);
                module0642.f39067();
            }
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41092(SubLObject var105) {
        if (var105 == module0673.UNPROVIDED) {
            var105 = (SubLObject)module0673.$ic44$;
        }
        final SubLObject var106 = Sequences.cconcatenate((SubLObject)module0673.$ic124$, var105);
        final SubLObject var107 = Sequences.cconcatenate((SubLObject)module0673.$ic125$, var105);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39019((SubLObject)module0673.$ic127$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic128$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g159$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic129$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39019((SubLObject)module0673.$ic130$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic131$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39019((SubLObject)module0673.$ic132$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic133$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var106) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var106);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39019((SubLObject)module0673.$ic134$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic135$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var107) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var107);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39019((SubLObject)module0673.$ic136$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic137$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020(module0015.$g159$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39020((SubLObject)module0673.$ic138$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        module0642.f39026((SubLObject)module0673.UNPROVIDED);
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41093(final SubLObject var37, SubLObject var108) {
        if (var108 == module0673.UNPROVIDED) {
            var108 = (SubLObject)module0673.$ic141$;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        final SubLObject var110 = module0656.f39943(var37, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var111 = f41094(var110, var108);
        final SubLObject var112 = Mapping.mapcar((SubLObject)module0673.$ic142$, var111);
        final SubLObject var113 = module0035.f2378(Sequences.remove((SubLObject)module0673.NIL, var112, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), (SubLObject)module0673.$ic143$, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var114 = (module0673.NIL != constant_handles_oc.f8449(var110)) ? var110 : constants_high_oc.f10739(Strings.string_upcase(module0038.f2699((SubLObject)module0673.$ic44$, (SubLObject)module0673.$ic144$, module0038.f2699((SubLObject)module0673.$ic44$, (SubLObject)module0673.$ic145$, module0038.f2699((SubLObject)module0673.$ic146$, (SubLObject)module0673.$ic147$, module0205.f13307(var110), (SubLObject)module0673.UNPROVIDED), (SubLObject)module0673.UNPROVIDED), (SubLObject)module0673.UNPROVIDED), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), (SubLObject)module0673.UNPROVIDED);
        final SubLObject var115 = constants_high_oc.f10743(var114);
        final SubLObject var116 = (SubLObject)ConsesLow.list((SubLObject)module0673.$ic148$, var115, (SubLObject)module0673.$ic149$, module0213.f13918(var110));
        final SubLObject var117 = module0147.$g2094$.currentBinding(var109);
        final SubLObject var118 = module0147.$g2095$.currentBinding(var109);
        try {
            module0147.$g2094$.bind((SubLObject)module0673.$ic150$, var109);
            module0147.$g2095$.bind(module0673.$ic151$, var109);
            try {
                final SubLObject var3_115 = module0601.$g4652$.currentBinding(var109);
                final SubLObject var25_116 = module0601.$g4654$.currentBinding(var109);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var109), module0601.$g4652$.getDynamicValue(var109)), var109);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var109), var109);
                    module0601.f36758((SubLObject)module0673.$ic152$, var116, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                    module0601.f36746();
                    SubLObject var119;
                    SubLObject var120;
                    SubLObject var121;
                    SubLObject var122;
                    SubLObject var123;
                    SubLObject var124;
                    SubLObject var125;
                    SubLObject var126;
                    SubLObject var127;
                    SubLObject var128;
                    SubLObject var129;
                    SubLObject var130;
                    SubLObject var123_128;
                    SubLObject var124_129;
                    SubLObject var131;
                    SubLObject var126_131;
                    SubLObject var3_116;
                    SubLObject var25_117;
                    SubLObject var3_117;
                    SubLObject var3_118;
                    for (var119 = var113, var120 = (SubLObject)module0673.NIL, var120 = (SubLObject)module0673.ONE_INTEGER; !var120.numGE(var119); var120 = module0048.f_1X(var120)) {
                        var121 = var111;
                        var122 = (SubLObject)module0673.NIL;
                        var122 = var121.first();
                        while (module0673.NIL != var121) {
                            var123 = (SubLObject)module0673.ZERO_INTEGER;
                            var124 = var122;
                            if (module0673.NIL != module0158.f10010(var110, var120, var124)) {
                                var125 = module0158.f10011(var110, var120, var124);
                                var126 = (SubLObject)module0673.NIL;
                                var127 = (SubLObject)module0673.NIL;
                                while (module0673.NIL == var126) {
                                    var128 = module0052.f3695(var125, var127);
                                    var129 = (SubLObject)SubLObjectFactory.makeBoolean(!var127.eql(var128));
                                    if (module0673.NIL != var129) {
                                        var130 = (SubLObject)module0673.NIL;
                                        try {
                                            var130 = module0158.f10316(var128, (SubLObject)module0673.$ic153$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                            var123_128 = (SubLObject)module0673.NIL;
                                            var124_129 = (SubLObject)module0673.NIL;
                                            while (module0673.NIL == var123_128) {
                                                var131 = module0052.f3695(var130, var124_129);
                                                var126_131 = (SubLObject)SubLObjectFactory.makeBoolean(!var124_129.eql(var131));
                                                if (module0673.NIL != var126_131 && !var123.numG((SubLObject)module0673.TWENTY_INTEGER)) {
                                                    var123 = Numbers.add(var123, (SubLObject)module0673.ONE_INTEGER);
                                                    try {
                                                        var3_116 = module0601.$g4652$.currentBinding(var109);
                                                        var25_117 = module0601.$g4654$.currentBinding(var109);
                                                        try {
                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var109), module0601.$g4652$.getDynamicValue(var109)), var109);
                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var109), var109);
                                                            module0601.f36758((SubLObject)module0673.$ic154$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                                            module0797.f50961(module0178.f11287(var131));
                                                        }
                                                        finally {
                                                            module0601.$g4654$.rebind(var25_117, var109);
                                                            module0601.$g4652$.rebind(var3_116, var109);
                                                        }
                                                    }
                                                    finally {
                                                        var3_117 = Threads.$is_thread_performing_cleanupP$.currentBinding(var109);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var109);
                                                            module0601.f36746();
                                                            module0601.f36760((SubLObject)module0673.$ic154$);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_117, var109);
                                                        }
                                                    }
                                                    module0797.f50960(conses_high.subst(var114, var110, module0178.f11303(var131), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED));
                                                }
                                                var123_128 = (SubLObject)SubLObjectFactory.makeBoolean(module0673.NIL == var126_131);
                                            }
                                        }
                                        finally {
                                            var3_118 = Threads.$is_thread_performing_cleanupP$.currentBinding(var109);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var109);
                                                if (module0673.NIL != var130) {
                                                    module0158.f10319(var130);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_118, var109);
                                            }
                                        }
                                    }
                                    var126 = (SubLObject)SubLObjectFactory.makeBoolean(module0673.NIL == var129);
                                }
                            }
                            var121 = var121.rest();
                            var122 = var121.first();
                        }
                    }
                }
                finally {
                    module0601.$g4654$.rebind(var25_116, var109);
                    module0601.$g4652$.rebind(var3_115, var109);
                }
            }
            finally {
                final SubLObject var3_119 = Threads.$is_thread_performing_cleanupP$.currentBinding(var109);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var109);
                    module0601.f36746();
                    module0601.f36760((SubLObject)module0673.$ic152$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_119, var109);
                }
            }
        }
        finally {
            module0147.$g2095$.rebind(var118, var109);
            module0147.$g2094$.rebind(var117, var109);
        }
        if (module0673.NIL == constant_handles_oc.f8449(var110)) {
            constant_handles_oc.f8460(var114);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41094(final SubLObject var11, SubLObject var108) {
        if (var108 == module0673.UNPROVIDED) {
            var108 = (SubLObject)module0673.$ic141$;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = Sequences.nreverse(module0035.f2153(ConsesLow.nconc(module0259.f16847(module0673.$ic155$), conses_high.copy_list(module0656.f39825(var11))), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED));
        if (module0217.f14221(var11, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED).numL((SubLObject)module0673.$ic156$)) {
            final SubLObject var111 = module0147.$g2094$.currentBinding(var109);
            final SubLObject var112 = module0147.$g2095$.currentBinding(var109);
            try {
                module0147.$g2094$.bind((SubLObject)module0673.$ic150$, var109);
                module0147.$g2095$.bind(module0673.$ic151$, var109);
                final SubLObject var113 = (SubLObject)module0673.NIL;
                if (module0673.NIL != module0158.f10010(var11, (SubLObject)module0673.NIL, var113)) {
                    final SubLObject var114 = module0158.f10011(var11, (SubLObject)module0673.NIL, var113);
                    SubLObject var115 = (SubLObject)module0673.NIL;
                    final SubLObject var116 = (SubLObject)module0673.NIL;
                    while (module0673.NIL == var115) {
                        final SubLObject var117 = module0052.f3695(var114, var116);
                        final SubLObject var118 = (SubLObject)SubLObjectFactory.makeBoolean(!var116.eql(var117));
                        if (module0673.NIL != var118) {
                            SubLObject var119 = (SubLObject)module0673.NIL;
                            try {
                                var119 = module0158.f10316(var117, (SubLObject)module0673.$ic153$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                SubLObject var123_137 = (SubLObject)module0673.NIL;
                                final SubLObject var124_138 = (SubLObject)module0673.NIL;
                                while (module0673.NIL == var123_137) {
                                    final SubLObject var120 = module0052.f3695(var119, var124_138);
                                    final SubLObject var126_139 = (SubLObject)SubLObjectFactory.makeBoolean(!var124_138.eql(var120));
                                    if (module0673.NIL != var126_139) {
                                        final SubLObject var121 = module0205.f13132(var120);
                                        if (module0673.NIL == conses_high.member(var121, var110, Symbols.symbol_function((SubLObject)module0673.EQUAL), Symbols.symbol_function((SubLObject)module0673.IDENTITY))) {
                                            var110 = (SubLObject)ConsesLow.cons(var121, var110);
                                        }
                                    }
                                    var123_137 = (SubLObject)SubLObjectFactory.makeBoolean(module0673.NIL == var126_139);
                                }
                            }
                            finally {
                                final SubLObject var3_141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var109);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var109);
                                    if (module0673.NIL != var119) {
                                        module0158.f10319(var119);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_141, var109);
                                }
                            }
                        }
                        var115 = (SubLObject)SubLObjectFactory.makeBoolean(module0673.NIL == var118);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var112, var109);
                module0147.$g2094$.rebind(var111, var109);
            }
        }
        return Sequences.nreverse(var110);
    }
    
    public static SubLObject f41089(final SubLObject var142) {
        final SubLObject var143 = module0038.f2933(var142);
        final SubLObject var144 = reader.read_from_string_ignoring_errors(var143, (SubLObject)module0673.NIL, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0673.NIL == module0205.f13145((SubLObject)module0673.$ic157$, var144, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED) && module0673.NIL != module0210.f13571(var144));
    }
    
    public static SubLObject f41095(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = var17.first();
        final SubLObject var20 = module0587.$g4457$.currentBinding(var18);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var18), var18);
            final SubLObject var21 = (SubLObject)module0673.$ic44$;
            final SubLObject var3_145 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
                module0642.f39020((SubLObject)module0673.$ic27$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var22 = module0014.f672((SubLObject)module0673.$ic28$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL != var22) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(var22);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                module0016.f941();
                if (module0673.NIL != var21) {
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var21);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                final SubLObject var3_146 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)module0673.T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_147 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_148 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019((SubLObject)module0673.$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_148, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0673.NIL != var21) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019(var21);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        f41091();
                        f41093(var19, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var23 = module0014.f657((SubLObject)module0673.$ic139$);
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g479$.getGlobalValue());
                        module0642.f39020(module0015.$g482$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(var23);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g483$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic32$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_149 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_149, var18);
                        }
                        module0642.f39020(module0015.$g480$.getGlobalValue());
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_147, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_146, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var3_145, var18);
            }
        }
        finally {
            module0587.$g4457$.rebind(var20, var18);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41096(final SubLObject var11, SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic114$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)module0673.$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)module0673.$ic159$, module0656.f39842(var11));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41097(final SubLObject var11, SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic161$;
        }
        final SubLObject var30 = module0016.f935();
        final SubLObject var31 = module0656.f39832((SubLObject)module0673.NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)module0673.$ic162$, module0213.f13918(var11), var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g385$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        if (module0673.NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41098(final SubLObject var11, SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic164$;
        }
        final SubLObject var30 = module0016.f935();
        final SubLObject var31 = module0656.f39832((SubLObject)module0673.NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)module0673.$ic165$, module0213.f13918(var11), var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g385$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        if (module0673.NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41099(final SubLObject var11, SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic167$;
        }
        final SubLObject var30 = module0016.f935();
        final SubLObject var31 = module0656.f39832((SubLObject)module0673.NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)module0673.$ic168$, module0213.f13918(var11), var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g385$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        if (module0673.NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41100(final SubLObject var11, SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic170$;
        }
        final SubLObject var30 = module0016.f935();
        final SubLObject var31 = module0656.f39832((SubLObject)module0673.NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)module0673.$ic171$, module0213.f13918(var11), var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g385$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        if (module0673.NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41101(final SubLObject var57) {
        if (module0673.NIL != assertion_handles_oc.f11035(var57)) {
            final SubLObject var58 = assertion_handles_oc.f11025(var57);
            module0642.f39068(var58, (SubLObject)module0673.T, (SubLObject)module0673.NIL, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41102(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic175$);
        }
        else {
            final SubLObject var19 = module0656.f39937(var17);
            if (module0673.NIL == constant_handles_oc.f8449(var19)) {
                module0656.f39789((SubLObject)module0673.$ic176$, conses_high.second(var17), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                return (SubLObject)module0673.NIL;
            }
            final SubLObject var20 = (SubLObject)module0673.$ic177$;
            final SubLObject var21 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
                module0642.f39020((SubLObject)module0673.$ic27$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var22 = module0014.f672((SubLObject)module0673.$ic28$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL != var22) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(var22);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                module0016.f941();
                if (module0673.NIL != var20) {
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var20);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                final SubLObject var3_153 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)module0673.T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_154 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_155 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019((SubLObject)module0673.$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_155, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0673.NIL != var20) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019(var20);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        final SubLObject var23 = module0656.f39832((SubLObject)module0673.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic38$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        if (module0673.NIL != var23) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(var23);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_156 = module0015.$g533$.currentBinding(var18);
                        final SubLObject var24 = module0015.$g541$.currentBinding(var18);
                        final SubLObject var25 = module0015.$g539$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0015.$g541$.bind((SubLObject)module0673.T, var18);
                            module0015.$g539$.bind(module0015.f797(), var18);
                            module0642.f39069((SubLObject)module0673.$ic178$, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39069((SubLObject)module0673.$ic109$, module0656.f39842(var19), (SubLObject)module0673.UNPROVIDED);
                            module0656.f39870((SubLObject)module0673.$ic173$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39032((SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0673.$ic179$);
                            module0642.f39019(var19);
                            module0642.f39019((SubLObject)module0673.$ic74$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                            module0666.f40467((SubLObject)module0673.$ic42$, (SubLObject)module0673.$ic43$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39032((SubLObject)module0673.UNPROVIDED);
                            module0642.f39075((SubLObject)module0673.$ic42$, constants_high_oc.f10743(var19), (SubLObject)module0673.$ic45$);
                            module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39073((SubLObject)module0673.$ic180$);
                            module0642.f39032((SubLObject)module0673.UNPROVIDED);
                            module0644.f39184((SubLObject)module0673.$ic42$, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39032((SubLObject)module0673.UNPROVIDED);
                            module0642.f39074((SubLObject)module0673.$ic181$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                            module0656.f39812((SubLObject)module0673.$ic182$, (SubLObject)module0673.$ic47$, module0656.f39810(), (SubLObject)module0673.UNPROVIDED);
                            module0642.f39026((SubLObject)module0673.UNPROVIDED);
                            module0656.f39812((SubLObject)module0673.$ic183$, (SubLObject)module0673.$ic184$, module0656.f39809(), (SubLObject)module0673.UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g539$.rebind(var25, var18);
                            module0015.$g541$.rebind(var24, var18);
                            module0015.$g533$.rebind(var3_156, var18);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_154, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_153, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var21, var18);
            }
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41103(final SubLObject var17) {
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic183$);
            return (SubLObject)module0673.NIL;
        }
        final SubLObject var18 = module0642.f39104((SubLObject)module0673.$ic109$, var17);
        final SubLObject var19 = module0642.f39104((SubLObject)module0673.$ic42$, var17);
        final SubLObject var20 = module0656.f39937(var18);
        if (module0673.NIL == constant_handles_oc.f8449(var20)) {
            module0656.f39789((SubLObject)module0673.$ic186$, var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else if (!var19.isString()) {
            module0656.f39789((SubLObject)module0673.$ic50$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else if (module0673.NIL == module0126.f8389(var19)) {
            module0656.f39789((SubLObject)module0673.$ic51$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else if (var19.equal(constants_high_oc.f10743(var20))) {
            module0656.f39789((SubLObject)module0673.$ic187$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else if (module0673.NIL != constants_high_oc.f10737(var19)) {
            module0656.f39789((SubLObject)module0673.$ic52$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else {
            module0543.f33635(var20, var19);
            module0674.f41154((SubLObject)module0673.$ic188$, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41104(final SubLObject var152, SubLObject var28, SubLObject var157) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        if (var157 == module0673.UNPROVIDED) {
            var157 = (SubLObject)module0673.NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic190$;
        }
        if (module0673.NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var159 = module0656.f39832((SubLObject)module0673.$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var158), (SubLObject)module0673.$ic191$, module0656.f39842(var152));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL != var159) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(var159);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
            final SubLObject var160 = module0015.$g533$.currentBinding(var158);
            try {
                module0015.$g533$.bind((SubLObject)module0673.T, var158);
                module0642.f39019(var28);
            }
            finally {
                module0015.$g533$.rebind(var160, var158);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var152;
    }
    
    public static SubLObject f41105(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic195$);
        }
        else {
            final SubLObject var19 = module0656.f39943(var17, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL == module0173.f10955(var19)) {
                module0656.f39789((SubLObject)module0673.$ic70$, conses_high.second(var17), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                return (SubLObject)module0673.NIL;
            }
            final SubLObject var20 = (SubLObject)module0673.$ic196$;
            final SubLObject var21 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
                module0642.f39020((SubLObject)module0673.$ic27$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var22 = module0014.f672((SubLObject)module0673.$ic28$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL != var22) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(var22);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                module0016.f941();
                if (module0673.NIL != var20) {
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var20);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                final SubLObject var3_158 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)module0673.T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_159 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_160 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019((SubLObject)module0673.$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_160, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0673.NIL != var20) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019(var20);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        final SubLObject var23 = module0656.f39832((SubLObject)module0673.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic38$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        if (module0673.NIL != var23) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(var23);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_161 = module0015.$g533$.currentBinding(var18);
                        final SubLObject var24 = module0015.$g541$.currentBinding(var18);
                        final SubLObject var25 = module0015.$g539$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0015.$g541$.bind((SubLObject)module0673.T, var18);
                            module0015.$g539$.bind(module0015.f797(), var18);
                            module0642.f39069((SubLObject)module0673.$ic197$, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39069((SubLObject)module0673.$ic198$, module0656.f39842(var19), (SubLObject)module0673.UNPROVIDED);
                            module0656.f39870((SubLObject)module0673.$ic193$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)module0673.$ic199$);
                            module0656.f39804(var19, (SubLObject)module0673.ZERO_INTEGER, (SubLObject)module0673.NIL);
                            module0642.f39019((SubLObject)module0673.$ic200$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39079((SubLObject)module0673.$ic201$, (SubLObject)module0673.$ic44$, (SubLObject)module0673.$ic45$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39032((SubLObject)module0673.TWO_INTEGER);
                            module0644.f39184((SubLObject)module0673.$ic201$, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39032((SubLObject)module0673.UNPROVIDED);
                            module0642.f39074((SubLObject)module0673.$ic202$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g539$.rebind(var25, var18);
                            module0015.$g541$.rebind(var24, var18);
                            module0015.$g533$.rebind(var3_161, var18);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_159, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_158, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var21, var18);
            }
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41106(final SubLObject var17) {
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic204$);
            return (SubLObject)module0673.NIL;
        }
        final SubLObject var18 = module0642.f39104((SubLObject)module0673.$ic198$, var17);
        final SubLObject var19 = module0656.f39943(var18, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var20 = module0642.f39104((SubLObject)module0673.$ic201$, var17);
        if (module0673.NIL == module0173.f10955(var19)) {
            module0656.f39789((SubLObject)module0673.$ic186$, var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else if (!var20.isString()) {
            module0656.f39789((SubLObject)module0673.$ic50$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        final SubLObject var21 = module0656.f39943(var20, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL == module0173.f10955(var21)) {
            module0656.f39789((SubLObject)module0673.$ic186$, var20, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else if (var19.eql(var21)) {
            module0656.f39789((SubLObject)module0673.$ic205$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else {
            module0677.f41352(var19);
            module0543.f33627(var19, var21);
            module0674.f41154((SubLObject)module0673.$ic196$, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41107(final SubLObject var11, SubLObject var28, SubLObject var157) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        if (var157 == module0673.UNPROVIDED) {
            var157 = (SubLObject)module0673.NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic207$;
        }
        if (module0673.NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var159 = module0656.f39832((SubLObject)module0673.$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var158), (SubLObject)module0673.$ic208$, module0656.f39842(var11));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL != var159) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(var159);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
            final SubLObject var160 = module0015.$g533$.currentBinding(var158);
            try {
                module0015.$g533$.bind((SubLObject)module0673.T, var158);
                module0642.f39019(var28);
            }
            finally {
                module0015.$g533$.rebind(var160, var158);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var11;
    }
    
    public static SubLObject f41108(final SubLObject var17) {
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic210$);
        }
        else {
            final SubLObject var18 = var17.first();
            final SubLObject var19 = module0642.f39104((SubLObject)module0673.$ic211$, var17);
            final SubLObject var20 = module0656.f39943(var18, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL == module0173.f10955(var20)) {
                module0656.f39789((SubLObject)module0673.$ic70$, var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                return (SubLObject)module0673.NIL;
            }
            module0677.f41352(var20);
            module0543.f33632(var20);
            module0674.f41154((SubLObject)module0673.$ic212$, (SubLObject)module0673.T, (SubLObject)((module0673.NIL != var19) ? module0673.THREE_INTEGER : module0673.TWO_INTEGER), (SubLObject)module0673.UNPROVIDED);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41109(final SubLObject var11, SubLObject var28, SubLObject var157, SubLObject var164) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        if (var157 == module0673.UNPROVIDED) {
            var157 = (SubLObject)module0673.NIL;
        }
        if (var164 == module0673.UNPROVIDED) {
            var164 = (SubLObject)module0673.NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic214$;
        }
        if (module0673.NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var166 = module0656.f39832((SubLObject)module0673.$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0655.f39768();
            if (module0673.NIL != var164) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var165), (SubLObject)module0673.$ic215$, module0656.f39842(var11));
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var165), (SubLObject)module0673.$ic216$, module0656.f39842(var11));
            }
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL != var166) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(var166);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
            final SubLObject var167 = module0015.$g533$.currentBinding(var165);
            try {
                module0015.$g533$.bind((SubLObject)module0673.T, var165);
                module0642.f39019(var28);
            }
            finally {
                module0015.$g533$.rebind(var167, var165);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var11;
    }
    
    public static SubLObject f41110(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic210$);
        }
        else {
            SubLObject var19 = (SubLObject)module0673.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)module0673.$ic69$);
            var19 = var17.first();
            final SubLObject var20 = var17.rest();
            if (module0673.NIL == var20) {
                final SubLObject var21 = module0656.f39943(var19, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL == module0173.f10955(var21)) {
                    module0656.f39789((SubLObject)module0673.$ic70$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    return (SubLObject)module0673.NIL;
                }
                final SubLObject var22 = module0217.f14357(var21);
                final SubLObject var23 = (SubLObject)module0673.$ic220$;
                final SubLObject var24 = module0015.$g538$.currentBinding(var18);
                try {
                    module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
                    module0642.f39020((SubLObject)module0673.$ic27$);
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                    final SubLObject var25 = module0014.f672((SubLObject)module0673.$ic28$);
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    if (module0673.NIL != var25) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(var25);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    module0016.f941();
                    if (module0673.NIL != var23) {
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var23);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_168 = module0015.$g535$.currentBinding(var18);
                    try {
                        module0015.$g535$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_169 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic34$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            final SubLObject var3_170 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0673.T, var18);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020((SubLObject)module0673.$ic35$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020((SubLObject)module0673.$ic36$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019((SubLObject)module0673.$ic37$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_170, var18);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (module0673.NIL != var23) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019(var23);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            }
                            final SubLObject var26 = module0656.f39832((SubLObject)module0673.NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic38$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            if (module0673.NIL != var26) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(var26);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            final SubLObject var3_171 = module0015.$g533$.currentBinding(var18);
                            final SubLObject var27 = module0015.$g541$.currentBinding(var18);
                            final SubLObject var28 = module0015.$g539$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0673.T, var18);
                                module0015.$g541$.bind((SubLObject)module0673.T, var18);
                                module0015.$g539$.bind(module0015.f797(), var18);
                                module0642.f39069((SubLObject)module0673.$ic221$, var19, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39069((SubLObject)module0673.$ic211$, (SubLObject)module0673.$ic222$, (SubLObject)module0673.UNPROVIDED);
                                module0656.f39870((SubLObject)module0673.$ic218$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                if (module0673.NIL == module0167.f10813(var21)) {
                                    module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                    module0642.f39032((SubLObject)module0673.THREE_INTEGER);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0673.$ic223$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                    module0642.f39026((SubLObject)module0673.UNPROVIDED);
                                    module0642.f39019((SubLObject)module0673.$ic224$);
                                    module0656.f39837((SubLObject)module0673.$ic225$, var21, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                    module0642.f39019((SubLObject)module0673.$ic226$);
                                    module0642.f39026((SubLObject)module0673.UNPROVIDED);
                                }
                                module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39026((SubLObject)module0673.UNPROVIDED);
                                module0642.f39019((SubLObject)module0673.$ic227$);
                                module0656.f39804(var21, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                if (var22.numG((SubLObject)module0673.ZERO_INTEGER)) {
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var18), (SubLObject)module0673.$ic228$, var22);
                                }
                                module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                                module0656.f39790((SubLObject)module0673.$ic229$, (SubLObject)module0673.$ic230$);
                                module0642.f39074((SubLObject)module0673.$ic231$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                                module0656.f39812((SubLObject)module0673.$ic232$, (SubLObject)module0673.$ic184$, module0656.f39809(), (SubLObject)module0673.UNPROVIDED);
                                module0015.f799(module0015.$g539$.getDynamicValue(var18));
                            }
                            finally {
                                module0015.$g539$.rebind(var28, var18);
                                module0015.$g541$.rebind(var27, var18);
                                module0015.$g533$.rebind(var3_171, var18);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)module0673.UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var3_169, var18);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var3_168, var18);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var24, var18);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0673.$ic69$);
            }
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41111(final SubLObject var11, SubLObject var28, SubLObject var157) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        if (var157 == module0673.UNPROVIDED) {
            var157 = (SubLObject)module0673.NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic214$;
        }
        if (module0673.NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var159 = module0656.f39832((SubLObject)module0673.$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var158), (SubLObject)module0673.$ic234$, module0656.f39842(var11));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL != var159) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(var159);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
            final SubLObject var160 = module0015.$g533$.currentBinding(var158);
            try {
                module0015.$g533$.bind((SubLObject)module0673.T, var158);
                module0642.f39019(var28);
            }
            finally {
                module0015.$g533$.rebind(var160, var158);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var11;
    }
    
    public static SubLObject f41112(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic238$);
            return (SubLObject)module0673.NIL;
        }
        SubLObject var19 = (SubLObject)module0673.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)module0673.$ic239$);
        var19 = var17.first();
        final SubLObject var20 = var17.rest();
        if (module0673.NIL == var20) {
            final SubLObject var21 = module0656.f39937(var19);
            if (module0673.NIL == constant_handles_oc.f8449(var21)) {
                module0656.f39789((SubLObject)module0673.$ic176$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                return (SubLObject)module0673.NIL;
            }
            final SubLObject var22 = (SubLObject)module0673.$ic240$;
            final SubLObject var23 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
                module0642.f39020((SubLObject)module0673.$ic27$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var24 = module0014.f672((SubLObject)module0673.$ic28$);
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL != var24) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(var24);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                module0016.f941();
                if (module0673.NIL != var22) {
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var22);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                final SubLObject var3_175 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)module0673.T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_176 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_177 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019((SubLObject)module0673.$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_177, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (module0673.NIL != var22) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39019(var22);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        }
                        final SubLObject var25 = module0656.f39832((SubLObject)module0673.NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic38$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        if (module0673.NIL != var25) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(var25);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_178 = module0015.$g533$.currentBinding(var18);
                        final SubLObject var26 = module0015.$g541$.currentBinding(var18);
                        final SubLObject var27 = module0015.$g539$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0015.$g541$.bind((SubLObject)module0673.T, var18);
                            module0015.$g539$.bind(module0015.f797(), var18);
                            module0642.f39069((SubLObject)module0673.$ic241$, var19, (SubLObject)module0673.UNPROVIDED);
                            module0656.f39870((SubLObject)module0673.$ic236$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            final SubLObject var28 = module0217.f14357(var21);
                            module0642.f39019((SubLObject)module0673.$ic242$);
                            module0656.f39804(var21, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            if (var28.numG((SubLObject)module0673.ZERO_INTEGER)) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var18), (SubLObject)module0673.$ic228$, var28);
                            }
                            module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                            module0656.f39790((SubLObject)module0673.$ic229$, (SubLObject)module0673.$ic230$);
                            module0642.f39074((SubLObject)module0673.$ic243$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g539$.rebind(var27, var18);
                            module0015.$g541$.rebind(var26, var18);
                            module0015.$g533$.rebind(var3_178, var18);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_176, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_175, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var23, var18);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0673.$ic239$);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41113(final SubLObject var17) {
        final SubLObject var18 = var17.first();
        final SubLObject var19 = module0656.f39937(var18);
        if (module0673.NIL == constant_handles_oc.f8449(var19)) {
            module0656.f39789((SubLObject)module0673.$ic176$, var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            return (SubLObject)module0673.NIL;
        }
        module0543.f33633(var19);
        module0674.f41154((SubLObject)module0673.$ic245$, (SubLObject)module0673.T, (SubLObject)module0673.THREE_INTEGER, (SubLObject)module0673.UNPROVIDED);
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41114(final SubLObject var152, SubLObject var28, SubLObject var157) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        if (var157 == module0673.UNPROVIDED) {
            var157 = (SubLObject)module0673.NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic247$;
        }
        if (module0673.NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var159 = module0656.f39832((SubLObject)module0673.$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var158), (SubLObject)module0673.$ic248$, module0656.f39842(var152));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL != var159) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(var159);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
            final SubLObject var160 = module0015.$g533$.currentBinding(var158);
            try {
                module0015.$g533$.bind((SubLObject)module0673.T, var158);
                module0642.f39019(var28);
            }
            finally {
                module0015.$g533$.rebind(var160, var158);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var152;
    }
    
    public static SubLObject f41115(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (module0673.NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)module0673.$ic252$);
        }
        else {
            SubLObject var19 = (SubLObject)module0673.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)module0673.$ic69$);
            var19 = var17.first();
            final SubLObject var20 = var17.rest();
            if (module0673.NIL == var20) {
                final SubLObject var21 = module0656.f39943(var19, (SubLObject)module0673.UNPROVIDED);
                if (module0673.NIL == module0173.f10955(var21)) {
                    module0656.f39789((SubLObject)module0673.$ic176$, var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                    return (SubLObject)module0673.NIL;
                }
                final SubLObject var22 = module0217.f14357(var21);
                final SubLObject var23 = (SubLObject)module0673.$ic253$;
                final SubLObject var24 = module0015.$g538$.currentBinding(var18);
                try {
                    module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
                    module0642.f39020((SubLObject)module0673.$ic27$);
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                    final SubLObject var25 = module0014.f672((SubLObject)module0673.$ic28$);
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    if (module0673.NIL != var25) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(var25);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    module0016.f941();
                    if (module0673.NIL != var23) {
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var23);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_181 = module0015.$g535$.currentBinding(var18);
                    try {
                        module0015.$g535$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var3_182 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)module0673.T, var18);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic34$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            final SubLObject var3_183 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0673.T, var18);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020((SubLObject)module0673.$ic35$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020((SubLObject)module0673.$ic36$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019((SubLObject)module0673.$ic37$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_183, var18);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (module0673.NIL != var23) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019(var23);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            }
                            final SubLObject var26 = module0656.f39832((SubLObject)module0673.NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            module0642.f39020((SubLObject)module0673.$ic38$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            if (module0673.NIL != var26) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39020(var26);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                            final SubLObject var3_184 = module0015.$g533$.currentBinding(var18);
                            final SubLObject var27 = module0015.$g541$.currentBinding(var18);
                            final SubLObject var28 = module0015.$g539$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)module0673.T, var18);
                                module0015.$g541$.bind((SubLObject)module0673.T, var18);
                                module0015.$g539$.bind(module0015.f797(), var18);
                                module0642.f39069((SubLObject)module0673.$ic254$, var19, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39069((SubLObject)module0673.$ic211$, (SubLObject)module0673.$ic222$, (SubLObject)module0673.UNPROVIDED);
                                module0656.f39870((SubLObject)module0673.$ic250$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019((SubLObject)module0673.$ic255$);
                                module0642.f39019(var22);
                                module0642.f39019((SubLObject)module0673.$ic256$);
                                module0656.f39804(var21, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0642.f39019((SubLObject)module0673.$ic257$);
                                module0642.f39026((SubLObject)module0673.TWO_INTEGER);
                                module0656.f39790((SubLObject)module0673.$ic229$, (SubLObject)module0673.$ic230$);
                                module0642.f39032((SubLObject)module0673.TWO_INTEGER);
                                module0642.f39074((SubLObject)module0673.$ic258$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                                module0015.f799(module0015.$g539$.getDynamicValue(var18));
                            }
                            finally {
                                module0015.$g539$.rebind(var28, var18);
                                module0015.$g541$.rebind(var27, var18);
                                module0015.$g533$.rebind(var3_184, var18);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)module0673.UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var3_182, var18);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var3_181, var18);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var24, var18);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)module0673.$ic69$);
            }
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41116(final SubLObject var17) {
        final SubLObject var18 = var17.first();
        final SubLObject var19 = module0642.f39104((SubLObject)module0673.$ic211$, var17);
        final SubLObject var20 = module0656.f39943(var18, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL == module0173.f10955(var20)) {
            module0656.f39789((SubLObject)module0673.$ic176$, var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
            return (SubLObject)module0673.NIL;
        }
        module0543.f33685(var20, (SubLObject)module0673.UNPROVIDED);
        module0674.f41154((SubLObject)module0673.$ic260$, (SubLObject)module0673.T, (SubLObject)((module0673.NIL != var19) ? module0673.THREE_INTEGER : module0673.TWO_INTEGER), (SubLObject)module0673.UNPROVIDED);
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41117(final SubLObject var11, SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic262$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)module0673.$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)module0673.$ic263$, module0656.f39842(var11));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41118(SubLObject var17) {
        if (var17 == module0673.UNPROVIDED) {
            var17 = (SubLObject)module0673.NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)module0673.$ic270$;
        final SubLObject var20 = module0015.$g538$.currentBinding(var18);
        try {
            module0015.$g538$.bind((module0673.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED), var18);
            module0642.f39020((SubLObject)module0673.$ic27$);
            module0642.f39029((SubLObject)module0673.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var21 = module0014.f672((SubLObject)module0673.$ic28$);
            module0642.f39029((SubLObject)module0673.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020((SubLObject)module0673.$ic29$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            if (module0673.NIL != var21) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020((SubLObject)module0673.$ic30$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
            module0016.f941();
            if (module0673.NIL != var19) {
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var19);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0644.f39213();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)module0673.UNPROVIDED);
            final SubLObject var3_185 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)module0673.T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0673.NIL != module0015.$g132$.getDynamicValue(var18)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39020((SubLObject)module0673.$ic33$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                final SubLObject var3_186 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)module0673.T, var18);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic34$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_187 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0673.T, var18);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic35$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020((SubLObject)module0673.$ic36$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39019((SubLObject)module0673.$ic37$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_187, var18);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (module0673.NIL != var19) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39019(var19);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)module0673.TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    }
                    final SubLObject var22 = module0656.f39832((SubLObject)module0673.NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    module0642.f39020((SubLObject)module0673.$ic38$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    if (module0673.NIL != var22) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39020(var22);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
                    final SubLObject var3_188 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)module0673.T, var18);
                        module0015.$g541$.bind((SubLObject)module0673.T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)module0673.$ic271$, (SubLObject)module0673.T, (SubLObject)module0673.UNPROVIDED);
                        if (module0673.NIL != var17) {
                            f41119(var17);
                        }
                        module0656.f39870((SubLObject)module0673.$ic268$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39073((SubLObject)module0673.$ic272$);
                        module0642.f39032((SubLObject)module0673.UNPROVIDED);
                        module0642.f39074((SubLObject)module0673.$ic270$, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
                        final SubLObject var25 = (SubLObject)((module0673.NIL != module0173.f10955(module0673.$g5306$.getDynamicValue(var18))) ? module0673.$g5306$.getDynamicValue(var18) : module0673.NIL);
                        module0642.f39026((SubLObject)module0673.UNPROVIDED);
                        module0657.f39992(var25, (SubLObject)module0673.UNPROVIDED);
                        module0642.f39026((SubLObject)module0673.UNPROVIDED);
                        module0657.f40017((SubLObject)((module0673.NIL != module0673.$g5305$.getDynamicValue(var18)) ? module0673.$g5305$.getDynamicValue(var18) : module0673.NIL), (SubLObject)module0673.$ic273$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var24, var18);
                        module0015.$g541$.rebind(var23, var18);
                        module0015.$g533$.rebind(var3_188, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)module0673.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_186, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0673.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_185, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0673.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var20, var18);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41119(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = module0657.f40003(var17, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        if (module0673.NIL != var20) {
            return module0657.f40013(var20, var21);
        }
        var18.resetMultipleValues();
        final SubLObject var22 = module0657.f40022(var17, (SubLObject)module0673.$ic275$);
        final SubLObject var23 = var18.secondMultipleValue();
        final SubLObject var24 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        if (module0673.NIL != var23) {
            return module0657.f40031(var23, var24, (SubLObject)module0673.UNPROVIDED);
        }
        module0673.$g5305$.setDynamicValue(var22, var18);
        module0673.$g5306$.setDynamicValue(var19, var18);
        final SubLObject var25 = f41079(module0673.$g5305$.getDynamicValue(var18), module0673.$g5306$.getDynamicValue(var18));
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)module0673.$ic276$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0656.f39804(module0673.$g5306$.getDynamicValue(var18), (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        module0642.f39019((SubLObject)module0673.$ic74$);
        module0642.f39026((SubLObject)module0673.UNPROVIDED);
        module0656.f39804(module0673.$g5305$.getDynamicValue(var18), (SubLObject)module0673.ZERO_INTEGER, (SubLObject)module0673.T);
        module0642.f39026((SubLObject)module0673.TWO_INTEGER);
        if (var25.equal((SubLObject)module0673.$ic277$)) {
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)module0673.$ic278$);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            final SubLObject var26 = module0015.$g537$.currentBinding(var18);
            try {
                module0015.$g537$.bind((SubLObject)module0673.T, var18);
                module0642.f39026((SubLObject)module0673.UNPROVIDED);
                module0669.f40716(module0538.f33327());
            }
            finally {
                module0015.$g537$.rebind(var26, var18);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)module0673.$ic279$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)module0673.UNPROVIDED);
            module0656.f39804(var25, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39051((SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41120(SubLObject var28) {
        if (var28 == module0673.UNPROVIDED) {
            var28 = (SubLObject)module0673.NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (module0673.NIL == var28) {
            var28 = (SubLObject)module0673.$ic270$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)module0673.$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)module0673.$ic271$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0673.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0673.UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)module0673.T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41121(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0642.f39104((SubLObject)module0673.$ic285$, var17);
        final SubLObject var20 = module0587.$g4457$.currentBinding(var18);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var18), var18);
            final SubLObject var21 = module0656.f39970(var19);
            final SubLObject var3_195 = module0147.$g2094$.currentBinding(var18);
            final SubLObject var22 = module0147.$g2095$.currentBinding(var18);
            try {
                module0147.$g2094$.bind((SubLObject)module0673.$ic150$, var18);
                module0147.$g2095$.bind(module0673.$ic151$, var18);
                try {
                    final SubLObject var3_196 = module0601.$g4652$.currentBinding(var18);
                    final SubLObject var25_197 = module0601.$g4654$.currentBinding(var18);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                        module0601.f36758((SubLObject)module0673.$ic152$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                        module0601.f36746();
                        try {
                            final SubLObject var3_197 = module0601.$g4652$.currentBinding(var18);
                            final SubLObject var25_198 = module0601.$g4654$.currentBinding(var18);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                module0601.f36758((SubLObject)module0673.$ic154$, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL, (SubLObject)module0673.NIL);
                                module0797.f50961(module0178.f11287(var21));
                            }
                            finally {
                                module0601.$g4654$.rebind(var25_198, var18);
                                module0601.$g4652$.rebind(var3_197, var18);
                            }
                        }
                        finally {
                            final SubLObject var3_198 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                                module0601.f36746();
                                module0601.f36760((SubLObject)module0673.$ic154$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var3_198, var18);
                            }
                        }
                        module0797.f50960(module0289.f19396(var21));
                    }
                    finally {
                        module0601.$g4654$.rebind(var25_197, var18);
                        module0601.$g4652$.rebind(var3_196, var18);
                    }
                }
                finally {
                    final SubLObject var3_199 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0673.T, var18);
                        module0601.f36746();
                        module0601.f36760((SubLObject)module0673.$ic152$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_199, var18);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var22, var18);
                module0147.$g2094$.rebind(var3_195, var18);
            }
        }
        finally {
            module0587.$g4457$.rebind(var20, var18);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41122(final SubLObject var17) {
        final SubLObject var18 = module0657.f40022(var17, (SubLObject)module0673.$ic286$);
        final SubLObject var19 = module0288.f19338(var18, (SubLObject)module0673.UNPROVIDED);
        if (module0673.NIL != var19) {
            module0656.f39916(var19, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        else {
            module0656.f39804(var18, (SubLObject)module0673.UNPROVIDED, (SubLObject)module0673.UNPROVIDED);
        }
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41123() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41078", "S#45151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41079", "S#45152", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41080", "S#44719", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41081", "S#45006", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41082", "S#45007", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41083", "CB-CREATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41084", "CB-HANDLE-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41085", "S#45153", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41086", "CB-CREATE-SIMILAR-LEGACY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41087", "CB-HANDLE-CREATE-SIMILAR-LEGACY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41088", "CB-HANDLE-CREATE-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41090", "S#45154", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41091", "S#45155", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41092", "S#45156", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41093", "S#45157", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41094", "S#45158", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41089", "S#45159", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41095", "CB-CREATE-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41096", "S#45160", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41097", "S#45161", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41098", "S#45162", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41099", "S#45163", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41100", "S#45164", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41101", "S#45165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41102", "CB-RENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41103", "CB-HANDLE-RENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41104", "S#45166", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41105", "CB-MERGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41106", "CB-HANDLE-MERGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41107", "S#45167", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41108", "CB-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41109", "S#45168", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41110", "CB-CONFIRM-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41111", "S#45169", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41112", "CB-RECREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41113", "CB-RECREATE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41114", "S#45170", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41115", "CB-ALL-ASSERTIONS-TMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41116", "CB-ALL-ASSERTIONS-TMS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41117", "S#45171", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41118", "CB-HYPOTHESIZE-HANDLER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41119", "S#45172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41120", "S#45173", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41121", "XML-ASSERTION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0673", "f41122", "CB-FORM-SMART", 1, 0, false);
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41124() {
        module0673.$g5304$ = SubLFiles.defparameter("S#45174", (SubLObject)module0673.$ic22$);
        module0673.$g5303$ = SubLFiles.defparameter("S#45175", (SubLObject)module0673.NIL);
        module0673.$g5305$ = SubLFiles.defparameter("S#45176", (SubLObject)module0673.NIL);
        module0673.$g5306$ = SubLFiles.defparameter("S#45177", module0132.$g1569$.getGlobalValue());
        return (SubLObject)module0673.NIL;
    }
    
    public static SubLObject f41125() {
        Hashtables.sethash((SubLObject)module0673.$ic23$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic24$, (SubLObject)module0673.NIL));
        module0015.f873((SubLObject)module0673.$ic48$);
        module0015.f873((SubLObject)module0673.$ic55$);
        Hashtables.sethash((SubLObject)module0673.$ic56$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic57$, (SubLObject)module0673.NIL));
        module0656.f39840((SubLObject)module0673.$ic56$, (SubLObject)module0673.$ic62$, (SubLObject)module0673.ONE_INTEGER);
        module0656.f39821((SubLObject)module0673.$ic56$, (SubLObject)module0673.$ic58$, (SubLObject)module0673.$ic63$, (SubLObject)module0673.$ic64$);
        Hashtables.sethash((SubLObject)module0673.$ic65$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic66$, (SubLObject)module0673.NIL));
        module0012.f441((SubLObject)module0673.$ic67$);
        module0015.f873((SubLObject)module0673.$ic83$);
        module0015.f873((SubLObject)module0673.$ic92$);
        module0015.f877((SubLObject)module0673.$ic93$, (SubLObject)module0673.$ic94$);
        module0015.f873((SubLObject)module0673.$ic93$);
        module0656.f39840((SubLObject)module0673.$ic3$, (SubLObject)module0673.$ic116$, (SubLObject)module0673.TWO_INTEGER);
        Hashtables.sethash((SubLObject)module0673.$ic139$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic140$, (SubLObject)module0673.NIL));
        module0015.f873((SubLObject)module0673.$ic158$);
        module0656.f39840((SubLObject)module0673.$ic2$, (SubLObject)module0673.$ic160$, (SubLObject)module0673.TWO_INTEGER);
        module0656.f39840((SubLObject)module0673.$ic4$, (SubLObject)module0673.$ic163$, (SubLObject)module0673.TWO_INTEGER);
        module0656.f39840((SubLObject)module0673.$ic5$, (SubLObject)module0673.$ic166$, (SubLObject)module0673.TWO_INTEGER);
        module0656.f39840((SubLObject)module0673.$ic7$, (SubLObject)module0673.$ic169$, (SubLObject)module0673.TWO_INTEGER);
        module0656.f39840((SubLObject)module0673.$ic6$, (SubLObject)module0673.$ic172$, (SubLObject)module0673.TWO_INTEGER);
        Hashtables.sethash((SubLObject)module0673.$ic173$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic174$, (SubLObject)module0673.NIL));
        module0015.f873((SubLObject)module0673.$ic185$);
        module0015.f873((SubLObject)module0673.$ic189$);
        module0656.f39840((SubLObject)module0673.$ic8$, (SubLObject)module0673.$ic192$, (SubLObject)module0673.THREE_INTEGER);
        Hashtables.sethash((SubLObject)module0673.$ic193$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic194$, (SubLObject)module0673.NIL));
        module0015.f873((SubLObject)module0673.$ic203$);
        module0015.f873((SubLObject)module0673.$ic206$);
        module0656.f39840((SubLObject)module0673.$ic9$, (SubLObject)module0673.$ic209$, (SubLObject)module0673.THREE_INTEGER);
        module0015.f873((SubLObject)module0673.$ic213$);
        module0656.f39840((SubLObject)module0673.$ic11$, (SubLObject)module0673.$ic217$, (SubLObject)module0673.FOUR_INTEGER);
        Hashtables.sethash((SubLObject)module0673.$ic218$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic219$, (SubLObject)module0673.NIL));
        module0015.f873((SubLObject)module0673.$ic233$);
        module0656.f39840((SubLObject)module0673.$ic10$, (SubLObject)module0673.$ic235$, (SubLObject)module0673.THREE_INTEGER);
        Hashtables.sethash((SubLObject)module0673.$ic236$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic237$, (SubLObject)module0673.NIL));
        module0015.f873((SubLObject)module0673.$ic244$);
        module0015.f873((SubLObject)module0673.$ic246$);
        module0656.f39840((SubLObject)module0673.$ic225$, (SubLObject)module0673.$ic249$, (SubLObject)module0673.THREE_INTEGER);
        Hashtables.sethash((SubLObject)module0673.$ic250$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic251$, (SubLObject)module0673.NIL));
        module0015.f873((SubLObject)module0673.$ic259$);
        module0015.f873((SubLObject)module0673.$ic261$);
        module0656.f39840((SubLObject)module0673.$ic264$, (SubLObject)module0673.$ic265$, (SubLObject)module0673.TWO_INTEGER);
        module0012.f441((SubLObject)module0673.$ic266$);
        module0012.f441((SubLObject)module0673.$ic267$);
        Hashtables.sethash((SubLObject)module0673.$ic268$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0673.$ic269$, (SubLObject)module0673.NIL));
        module0015.f873((SubLObject)module0673.$ic274$);
        module0656.f39840((SubLObject)module0673.$ic280$, (SubLObject)module0673.$ic281$, (SubLObject)module0673.ONE_INTEGER);
        module0656.f39819((SubLObject)module0673.$ic280$, (SubLObject)module0673.$ic270$, (SubLObject)module0673.$ic282$, (SubLObject)module0673.$ic283$);
        module0015.f877((SubLObject)module0673.$ic284$, (SubLObject)module0673.$ic94$);
        module0015.f873((SubLObject)module0673.$ic284$);
        module0015.f873((SubLObject)module0673.$ic287$);
        return (SubLObject)module0673.NIL;
    }
    
    public void declareFunctions() {
        f41123();
    }
    
    public void initializeVariables() {
        f41124();
    }
    
    public void runTopLevelForms() {
        f41125();
    }
    
    static {
        me = (SubLFile)new module0673();
        module0673.$g5304$ = null;
        module0673.$g5303$ = null;
        module0673.$g5305$ = null;
        module0673.$g5306$ = null;
        $ic0$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic1$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic2$ = SubLObjectFactory.makeKeyword("CREATE-SIMILAR-LEGACY");
        $ic3$ = SubLObjectFactory.makeKeyword("CREATE-SIMILAR");
        $ic4$ = SubLObjectFactory.makeKeyword("CREATE-INSTANCE");
        $ic5$ = SubLObjectFactory.makeKeyword("CREATE-SPEC");
        $ic6$ = SubLObjectFactory.makeKeyword("CREATE-SPEC-PRED");
        $ic7$ = SubLObjectFactory.makeKeyword("CREATE-SPEC-MT");
        $ic8$ = SubLObjectFactory.makeKeyword("RENAME");
        $ic9$ = SubLObjectFactory.makeKeyword("MERGE");
        $ic10$ = SubLObjectFactory.makeKeyword("CONFIRM-KILL");
        $ic11$ = SubLObjectFactory.makeKeyword("KILL");
        $ic12$ = SubLObjectFactory.makeKeyword("TTT-TEST");
        $ic13$ = SubLObjectFactory.makeString("[Take Test]");
        $ic14$ = SubLObjectFactory.makeKeyword("KCT-TEST");
        $ic15$ = SubLObjectFactory.makeKeyword("KBQ-ASK");
        $ic16$ = SubLObjectFactory.makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $ic17$ = SubLObjectFactory.makeKeyword("KCT-TEST-SET");
        $ic18$ = SubLObjectFactory.makeKeyword("KCT-EDIT");
        $ic19$ = SubLObjectFactory.makeKeyword("KBQ-EDIT");
        $ic20$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ResearchCycConstant"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ScaffoldingConstant"));
        $ic22$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ProperSubcollectionNamedFn-Ternary")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PersonNamedFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PlaceNamedFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PredicateNamedFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("StreetNamedFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OrganizationNamedFn")));
        $ic23$ = SubLObjectFactory.makeKeyword("CB-CREATE");
        $ic24$ = SubLObjectFactory.makeString("cb-create.html");
        $ic25$ = SubLObjectFactory.makeString("the Create Constant page");
        $ic26$ = SubLObjectFactory.makeString("Create Constant");
        $ic27$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic28$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic29$ = SubLObjectFactory.makeString("stylesheet");
        $ic30$ = SubLObjectFactory.makeString("text/css");
        $ic31$ = SubLObjectFactory.makeKeyword("SHA1");
        $ic32$ = SubLObjectFactory.makeString("text/javascript");
        $ic33$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic34$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic35$ = SubLObjectFactory.makeString("button");
        $ic36$ = SubLObjectFactory.makeString("reload");
        $ic37$ = SubLObjectFactory.makeString("Refresh Frames");
        $ic38$ = SubLObjectFactory.makeString("post");
        $ic39$ = SubLObjectFactory.makeString("cb-handle-create");
        $ic40$ = SubLObjectFactory.makeString("Clear");
        $ic41$ = SubLObjectFactory.makeString("Enter name for new constant : ");
        $ic42$ = SubLObjectFactory.makeString("new-name");
        $ic43$ = SubLObjectFactory.makeString("Complete");
        $ic44$ = SubLObjectFactory.makeString("");
        $ic45$ = SubLObjectFactory.makeInteger(40);
        $ic46$ = SubLObjectFactory.makeString("creating");
        $ic47$ = SubLObjectFactory.makeString("Cyc Naming Conventions");
        $ic48$ = SubLObjectFactory.makeSymbol("CB-CREATE");
        $ic49$ = SubLObjectFactory.makeString("Creating");
        $ic50$ = SubLObjectFactory.makeString("No name was specified");
        $ic51$ = SubLObjectFactory.makeString("~S is not a valid constant name");
        $ic52$ = SubLObjectFactory.makeString("Already a constant named ~a");
        $ic53$ = SubLObjectFactory.makeString("Constant Create");
        $ic54$ = SubLObjectFactory.makeString("Unable to create a constant named ~S");
        $ic55$ = SubLObjectFactory.makeSymbol("CB-HANDLE-CREATE");
        $ic56$ = SubLObjectFactory.makeKeyword("CREATE");
        $ic57$ = SubLObjectFactory.makeString("create-tool.gif");
        $ic58$ = SubLObjectFactory.makeString("Create");
        $ic59$ = SubLObjectFactory.makeKeyword("MAIN");
        $ic60$ = SubLObjectFactory.makeString("cb-create");
        $ic61$ = SubLObjectFactory.makeKeyword("TOP");
        $ic62$ = SubLObjectFactory.makeSymbol("S#45153", "CYC");
        $ic63$ = SubLObjectFactory.makeString("Crt");
        $ic64$ = SubLObjectFactory.makeString("Create Bare Cyc Constant");
        $ic65$ = SubLObjectFactory.makeKeyword("CB-CREATE-SIMILAR");
        $ic66$ = SubLObjectFactory.makeString("cb-create-similar.html");
        $ic67$ = SubLObjectFactory.makeSymbol("S#45175", "CYC");
        $ic68$ = SubLObjectFactory.makeString("the Create Similar Term page");
        $ic69$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#44996", "CYC"));
        $ic70$ = SubLObjectFactory.makeString("~a does not specify a Cyc term");
        $ic71$ = SubLObjectFactory.makeString("Create Similar Term");
        $ic72$ = SubLObjectFactory.makeString("cb-handle-create-similar-legacy");
        $ic73$ = SubLObjectFactory.makeString("Enter name for new term similar to ");
        $ic74$ = SubLObjectFactory.makeString(" :");
        $ic75$ = SubLObjectFactory.makeString("Create Similar");
        $ic76$ = SubLObjectFactory.makeString("create");
        $ic77$ = SubLObjectFactory.makeString("Copy Assertions");
        $ic78$ = SubLObjectFactory.makeString("copy");
        $ic79$ = SubLObjectFactory.makeString("Check the assertions from ");
        $ic80$ = SubLObjectFactory.makeString(" which you wish to copy as well: ");
        $ic81$ = SubLObjectFactory.makeSymbol("S#45165", "CYC");
        $ic82$ = SubLObjectFactory.makeKeyword("MAXIMAL");
        $ic83$ = SubLObjectFactory.makeSymbol("CB-CREATE-SIMILAR-LEGACY");
        $ic84$ = SubLObjectFactory.makeString("create similar facilities");
        $ic85$ = SubLObjectFactory.makeString("Unable to determine a term from ~S");
        $ic86$ = SubLObjectFactory.makeString("No term was specified");
        $ic87$ = SubLObjectFactory.makeString("~S is not a valid term name");
        $ic88$ = SubLObjectFactory.makeString("Already a constant named ~S");
        $ic89$ = SubLObjectFactory.makeString("Constant ~S already exists which differs from ~S only by case");
        $ic90$ = SubLObjectFactory.makeString("Unable to create a similar term named ~S");
        $ic91$ = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $ic92$ = SubLObjectFactory.makeSymbol("CB-HANDLE-CREATE-SIMILAR-LEGACY");
        $ic93$ = SubLObjectFactory.makeSymbol("CB-HANDLE-CREATE-SIMILAR");
        $ic94$ = SubLObjectFactory.makeString("text/xml");
        $ic95$ = SubLObjectFactory.makeString("error");
        $ic96$ = SubLObjectFactory.makeString("~S");
        $ic97$ = SubLObjectFactory.makeString("focalterm");
        $ic98$ = SubLObjectFactory.makeString("response");
        $ic99$ = SubLObjectFactory.makeString("invalidTerm");
        $ic100$ = SubLObjectFactory.makeString("~S is not a valid term name.");
        $ic101$ = SubLObjectFactory.makeString("Constant ~A already exists, which differs from ~S only by case.");
        $ic102$ = SubLObjectFactory.makeString("Unable to create a term named ~S.");
        $ic103$ = SubLObjectFactory.makeString("sentence");
        $ic104$ = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $ic105$ = SubLObjectFactory.makeKeyword("SENTENCE-NUM");
        $ic106$ = SubLObjectFactory.makeKeyword("SENTENCE");
        $ic107$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $ic108$ = SubLObjectFactory.makeString("newTermId");
        $ic109$ = SubLObjectFactory.makeString("id");
        $ic110$ = SubLObjectFactory.makeString("invalidSentence");
        $ic111$ = SubLObjectFactory.makeString("count");
        $ic112$ = SubLObjectFactory.makeString("assertionsQueued");
        $ic113$ = SubLObjectFactory.makeString("~A assertions added to the local queue.");
        $ic114$ = SubLObjectFactory.makeString("[Create Similar]");
        $ic115$ = SubLObjectFactory.makeString("cb-create-similar&~A");
        $ic116$ = SubLObjectFactory.makeSymbol("S#45154", "CYC");
        $ic117$ = SubLObjectFactory.makeString("color:red; font-size:120%; font-weight:700");
        $ic118$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Guest"));
        $ic119$ = SubLObjectFactory.makeString("Sorry, ");
        $ic120$ = SubLObjectFactory.makeString(" cannot make assertions using the tool.   Please ");
        $ic121$ = SubLObjectFactory.makeKeyword("CB-LOGIN");
        $ic122$ = SubLObjectFactory.makeString("login");
        $ic123$ = SubLObjectFactory.makeString(" using your real name now so that you can make assertions using this tool.");
        $ic124$ = SubLObjectFactory.makeString("lookupbutton");
        $ic125$ = SubLObjectFactory.makeString("assertbutton");
        $ic126$ = SubLObjectFactory.makeString("font-size:10pt");
        $ic127$ = SubLObjectFactory.makeString("All Mts");
        $ic128$ = SubLObjectFactory.makeString("togglecheckall();");
        $ic129$ = SubLObjectFactory.makeString("Check All / Uncheck All");
        $ic130$ = SubLObjectFactory.makeString("Undo");
        $ic131$ = SubLObjectFactory.makeString("uncommit()");
        $ic132$ = SubLObjectFactory.makeString("Redo");
        $ic133$ = SubLObjectFactory.makeString("recommit()");
        $ic134$ = SubLObjectFactory.makeString("Switch to Browse Mode");
        $ic135$ = SubLObjectFactory.makeString("togglelookupmode()");
        $ic136$ = SubLObjectFactory.makeString("SEND");
        $ic137$ = SubLObjectFactory.makeString("dosubmit()");
        $ic138$ = SubLObjectFactory.makeString("Assert selected sentences");
        $ic139$ = SubLObjectFactory.makeKeyword("CB-CREATE-SIMILAR-JS");
        $ic140$ = SubLObjectFactory.makeString("cb-create-similar.js");
        $ic141$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic142$ = SubLObjectFactory.makeSymbol("S#17556", "CYC");
        $ic143$ = SubLObjectFactory.makeSymbol(">");
        $ic144$ = SubLObjectFactory.makeString(")");
        $ic145$ = SubLObjectFactory.makeString("(");
        $ic146$ = SubLObjectFactory.makeString("_");
        $ic147$ = SubLObjectFactory.makeString(" ");
        $ic148$ = SubLObjectFactory.makeString("focalTerm");
        $ic149$ = SubLObjectFactory.makeString("hlid");
        $ic150$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic151$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic152$ = SubLObjectFactory.makeString("assertions");
        $ic153$ = SubLObjectFactory.makeKeyword("GAF");
        $ic154$ = SubLObjectFactory.makeString("assertion");
        $ic155$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DocumentationPredicate"));
        $ic156$ = SubLObjectFactory.makeInteger(100);
        $ic157$ = SubLObjectFactory.makeSymbol("SYMBOLP");
        $ic158$ = SubLObjectFactory.makeSymbol("CB-CREATE-SIMILAR");
        $ic159$ = SubLObjectFactory.makeString("cb-create-similar-legacy&~A");
        $ic160$ = SubLObjectFactory.makeSymbol("S#45160", "CYC");
        $ic161$ = SubLObjectFactory.makeString("[Create Instance]");
        $ic162$ = SubLObjectFactory.makeString("javascript:startCreate('~A', '~A', 'instance');");
        $ic163$ = SubLObjectFactory.makeSymbol("S#45161", "CYC");
        $ic164$ = SubLObjectFactory.makeString("[Create Spec]");
        $ic165$ = SubLObjectFactory.makeString("javascript:startCreate('~A', '~A', 'spec');");
        $ic166$ = SubLObjectFactory.makeSymbol("S#45162", "CYC");
        $ic167$ = SubLObjectFactory.makeString("[Create Spec Mt]");
        $ic168$ = SubLObjectFactory.makeString("javascript:startCreate('~A', '~A', 'spec-mt');");
        $ic169$ = SubLObjectFactory.makeSymbol("S#45163", "CYC");
        $ic170$ = SubLObjectFactory.makeString("[Create Spec Pred]");
        $ic171$ = SubLObjectFactory.makeString("javascript:startCreate('~A', '~A', 'spec-pred');");
        $ic172$ = SubLObjectFactory.makeSymbol("S#45164", "CYC");
        $ic173$ = SubLObjectFactory.makeKeyword("CB-RENAME");
        $ic174$ = SubLObjectFactory.makeString("cb-rename.html");
        $ic175$ = SubLObjectFactory.makeString("the Rename Constant page");
        $ic176$ = SubLObjectFactory.makeString("~a does not specify a Cyc constant");
        $ic177$ = SubLObjectFactory.makeString("Rename Constant");
        $ic178$ = SubLObjectFactory.makeString("cb-handle-rename");
        $ic179$ = SubLObjectFactory.makeString("Enter new name for ");
        $ic180$ = SubLObjectFactory.makeString("Current Name");
        $ic181$ = SubLObjectFactory.makeString("Rename");
        $ic182$ = SubLObjectFactory.makeString("naming");
        $ic183$ = SubLObjectFactory.makeString("renaming");
        $ic184$ = SubLObjectFactory.makeString("Cyc Rename/Kill");
        $ic185$ = SubLObjectFactory.makeSymbol("CB-RENAME");
        $ic186$ = SubLObjectFactory.makeString("Could not determine a term from ~S");
        $ic187$ = SubLObjectFactory.makeString("Name specified is same as current name");
        $ic188$ = SubLObjectFactory.makeString("Constant Rename");
        $ic189$ = SubLObjectFactory.makeSymbol("CB-HANDLE-RENAME");
        $ic190$ = SubLObjectFactory.makeString("[Rename]");
        $ic191$ = SubLObjectFactory.makeString("cb-rename&~A");
        $ic192$ = SubLObjectFactory.makeSymbol("S#45166", "CYC");
        $ic193$ = SubLObjectFactory.makeKeyword("CB-MERGE");
        $ic194$ = SubLObjectFactory.makeString("cb-merge.html");
        $ic195$ = SubLObjectFactory.makeString("the Merge Term page");
        $ic196$ = SubLObjectFactory.makeString("Merge Term");
        $ic197$ = SubLObjectFactory.makeString("cb-handle-merge");
        $ic198$ = SubLObjectFactory.makeString("fort-spec");
        $ic199$ = SubLObjectFactory.makeString("Merge the term ");
        $ic200$ = SubLObjectFactory.makeString(" onto the existing constant named :");
        $ic201$ = SubLObjectFactory.makeString("target-name");
        $ic202$ = SubLObjectFactory.makeString("Merge");
        $ic203$ = SubLObjectFactory.makeSymbol("CB-MERGE");
        $ic204$ = SubLObjectFactory.makeString("merging");
        $ic205$ = SubLObjectFactory.makeString("Attempt to merge ~S with itself.");
        $ic206$ = SubLObjectFactory.makeSymbol("CB-HANDLE-MERGE");
        $ic207$ = SubLObjectFactory.makeString("[Merge]");
        $ic208$ = SubLObjectFactory.makeString("cb-merge&~A");
        $ic209$ = SubLObjectFactory.makeSymbol("S#45167", "CYC");
        $ic210$ = SubLObjectFactory.makeString("the Cyc term kill facility");
        $ic211$ = SubLObjectFactory.makeString("confirmed");
        $ic212$ = SubLObjectFactory.makeString("Term Kill");
        $ic213$ = SubLObjectFactory.makeSymbol("CB-KILL");
        $ic214$ = SubLObjectFactory.makeString("[Kill]");
        $ic215$ = SubLObjectFactory.makeString("cb-kill&~A");
        $ic216$ = SubLObjectFactory.makeString("cb-kill&~A|confirmed=T");
        $ic217$ = SubLObjectFactory.makeSymbol("S#45168", "CYC");
        $ic218$ = SubLObjectFactory.makeKeyword("CB-CONFIRM-KILL");
        $ic219$ = SubLObjectFactory.makeString("cb-confirm-kill.html");
        $ic220$ = SubLObjectFactory.makeString("Confirm Term Kill");
        $ic221$ = SubLObjectFactory.makeString("cb-kill");
        $ic222$ = SubLObjectFactory.makeString("T");
        $ic223$ = SubLObjectFactory.makeString("NOTE: ");
        $ic224$ = SubLObjectFactory.makeString("If you are killing this term to remove its assertions and start again from scratch, please go to the ");
        $ic225$ = SubLObjectFactory.makeKeyword("RECREATE");
        $ic226$ = SubLObjectFactory.makeString(" page instead.");
        $ic227$ = SubLObjectFactory.makeString("Please confirm kill of ");
        $ic228$ = SubLObjectFactory.makeString(" and the removal of all ~S assertions involving it.");
        $ic229$ = SubLObjectFactory.makeKeyword("SELF");
        $ic230$ = SubLObjectFactory.makeString("No");
        $ic231$ = SubLObjectFactory.makeString("Yes, Kill");
        $ic232$ = SubLObjectFactory.makeString("killing constants");
        $ic233$ = SubLObjectFactory.makeSymbol("CB-CONFIRM-KILL");
        $ic234$ = SubLObjectFactory.makeString("cb-confirm-kill&~A");
        $ic235$ = SubLObjectFactory.makeSymbol("S#45169", "CYC");
        $ic236$ = SubLObjectFactory.makeKeyword("CB-RECREATE");
        $ic237$ = SubLObjectFactory.makeString("cb-recreate.html");
        $ic238$ = SubLObjectFactory.makeString("the Cyc constant recreate facility");
        $ic239$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45178", "CYC"));
        $ic240$ = SubLObjectFactory.makeString("Recreate Constant");
        $ic241$ = SubLObjectFactory.makeString("cb-recreate-handler");
        $ic242$ = SubLObjectFactory.makeString("Please confirm recreation of ");
        $ic243$ = SubLObjectFactory.makeString("Yes, Recreate");
        $ic244$ = SubLObjectFactory.makeSymbol("CB-RECREATE");
        $ic245$ = SubLObjectFactory.makeString("Constant Recreate");
        $ic246$ = SubLObjectFactory.makeSymbol("CB-RECREATE-HANDLER");
        $ic247$ = SubLObjectFactory.makeString("[Recreate]");
        $ic248$ = SubLObjectFactory.makeString("cb-recreate&~A");
        $ic249$ = SubLObjectFactory.makeSymbol("S#45170", "CYC");
        $ic250$ = SubLObjectFactory.makeKeyword("CB-ALL-ASSERTIONS-TMS-HANDLER");
        $ic251$ = SubLObjectFactory.makeString("cb-all-assertions-tms-handler.html");
        $ic252$ = SubLObjectFactory.makeString("the Reperform TMS facility");
        $ic253$ = SubLObjectFactory.makeString("Confirm Reperform TMS Page");
        $ic254$ = SubLObjectFactory.makeString("cb-all-assertions-tms-handler");
        $ic255$ = SubLObjectFactory.makeString("These operations may take some time.  Please confirm that you really want to force TMS for all ");
        $ic256$ = SubLObjectFactory.makeString(" of the assertions of the constant ");
        $ic257$ = SubLObjectFactory.makeString(".");
        $ic258$ = SubLObjectFactory.makeString("Do it!");
        $ic259$ = SubLObjectFactory.makeSymbol("CB-ALL-ASSERTIONS-TMS");
        $ic260$ = SubLObjectFactory.makeString("Reperform TMS on indexed Assertions");
        $ic261$ = SubLObjectFactory.makeSymbol("CB-ALL-ASSERTIONS-TMS-HANDLER");
        $ic262$ = SubLObjectFactory.makeString("[Force TMS]");
        $ic263$ = SubLObjectFactory.makeString("cb-all-assertions-tms&~A");
        $ic264$ = SubLObjectFactory.makeKeyword("ALL-ASSERTIONS-TMS");
        $ic265$ = SubLObjectFactory.makeSymbol("S#45171", "CYC");
        $ic266$ = SubLObjectFactory.makeSymbol("S#45176", "CYC");
        $ic267$ = SubLObjectFactory.makeSymbol("S#45177", "CYC");
        $ic268$ = SubLObjectFactory.makeKeyword("CB-HYPOTHESIZE-HANDLER");
        $ic269$ = SubLObjectFactory.makeString("cb-hypothesize-handler.html");
        $ic270$ = SubLObjectFactory.makeString("Hypothesize");
        $ic271$ = SubLObjectFactory.makeString("cb-hypothesize-handler");
        $ic272$ = SubLObjectFactory.makeString("Reset Values");
        $ic273$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeString("sentence"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), module0673.TEN_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $ic274$ = SubLObjectFactory.makeSymbol("CB-HYPOTHESIZE-HANDLER");
        $ic275$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $ic276$ = SubLObjectFactory.makeString("Last hypothesis in ");
        $ic277$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic278$ = SubLObjectFactory.makeString("Error description: ");
        $ic279$ = SubLObjectFactory.makeString("Hypothesis results : ");
        $ic280$ = SubLObjectFactory.makeKeyword("HYPOTHESIZE");
        $ic281$ = SubLObjectFactory.makeSymbol("S#45173", "CYC");
        $ic282$ = SubLObjectFactory.makeString("Hyp");
        $ic283$ = SubLObjectFactory.makeString("Hypothesize a formula");
        $ic284$ = SubLObjectFactory.makeSymbol("XML-ASSERTION-INFO");
        $ic285$ = SubLObjectFactory.makeString("assertionId");
        $ic286$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("cycl"));
        $ic287$ = SubLObjectFactory.makeSymbol("CB-FORM-SMART");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0673.class
	Total time: 2241 ms
	
	Decompiled with Procyon 0.5.32.
*/