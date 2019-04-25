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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
            module0111.$g1406$.bind((SubLObject)NIL, var2);
            return module0543.f33618(var1);
        }
        finally {
            module0111.$g1406$.rebind(var3, var2);
        }
    }
    
    public static SubLObject f41079(final SubLObject var4, final SubLObject var5) {
        final SubLThread var6 = SubLProcess.currentSubLThread();
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        final SubLObject var9 = module0111.$g1406$.currentBinding(var6);
        try {
            module0111.$g1406$.bind((SubLObject)NIL, var6);
            try {
                var6.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var3_8 = Errors.$error_handler$.currentBinding(var6);
                try {
                    Errors.$error_handler$.bind((SubLObject)$ic1$, var6);
                    try {
                        var7 = module0541.f33546(var4, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    catch (Throwable var10) {
                        Errors.handleThrowable(var10, (SubLObject)NIL);
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
        return (NIL != var8) ? var8 : var7;
    }
    
    public static SubLObject f41080(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        if (NIL != module0173.f10955(var11)) {
            final SubLObject var13 = f41081(var11);
            final SubLObject var14 = (SubLObject)makeBoolean(NIL == var13);
            if (NIL != module0655.$g5115$.getDynamicValue(var12)) {
                if (NIL != $g5303$.getDynamicValue(var12)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic2$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)$ic3$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                if (NIL != module0269.f17705(var11)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic4$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (NIL != module0269.f17705(var11)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic5$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (NIL != module0206.f13447(var11)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic6$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (NIL != module0269.f17731(var11)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic7$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (NIL == module0167.f10813(var11)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic8$, var11, (SubLObject)NIL, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                if (NIL != f41082(var11)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic9$, var11, (SubLObject)NIL, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                if (NIL != module0655.$g5117$.getDynamicValue(var12)) {
                    module0656.f39837((SubLObject)$ic10$, var11, (SubLObject)NIL, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0656.f39837((SubLObject)$ic11$, var11, (SubLObject)NIL, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (NIL != module0633.f38716(var11, (SubLObject)UNPROVIDED)) {
                module0642.f39032((SubLObject)UNPROVIDED);
                final SubLObject var15 = (SubLObject)NIL;
                module0642.f39020(module0015.$g459$.getGlobalValue());
                if (NIL != var15) {
                    module0656.f39837((SubLObject)$ic12$, var11, (SubLObject)$ic13$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0656.f39837((SubLObject)$ic14$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g460$.getGlobalValue());
                final SubLObject var16 = module0633.f38713(var11, (SubLObject)UNPROVIDED);
                if (NIL != module0173.f10955(var16)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic15$, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    if (NIL != module0684.f41933(var16)) {
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0656.f39837((SubLObject)$ic16$, var16, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                }
            }
            if (NIL != module0633.f38718(var11, (SubLObject)UNPROVIDED)) {
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)$ic17$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (NIL != module0633.f38716(var11, (SubLObject)UNPROVIDED)) {
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)$ic18$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (NIL != module0423.f29532(var11)) {
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)$ic15$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
                if (NIL != module0684.f41933(var11)) {
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic16$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)$ic19$, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41081(final SubLObject var16) {
        return (SubLObject)makeBoolean(NIL == module0259.f16976(var16, $ic20$) && NIL == module0259.f16976(var16, $ic21$) && NIL == module0127.f8414(var16));
    }
    
    public static SubLObject f41082(final SubLObject var16) {
        final SubLThread var17 = SubLProcess.currentSubLThread();
        return (SubLObject)makeBoolean(NIL != constant_handles_oc.f8449(var16) || (NIL != module0167.f10813(var16) && NIL != module0035.f2169(module0205.f13364(var16), $g5304$.getDynamicValue(var17))));
    }
    
    public static SubLObject f41083(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic25$);
        }
        else {
            final SubLObject var19 = (SubLObject)$ic26$;
            final SubLObject var20 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var21 = module0014.f672((SubLObject)$ic28$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var21) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var21);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var19) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var19);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_20 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_21 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_22 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_22, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var19) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var19);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        final SubLObject var22 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic38$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var22) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var22);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_23 = module0015.$g533$.currentBinding(var18);
                        final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                        final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0015.$g541$.bind((SubLObject)T, var18);
                            module0015.$g539$.bind(module0015.f797(), var18);
                            module0642.f39069((SubLObject)$ic39$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic23$, (SubLObject)NIL, (SubLObject)UNPROVIDED);
                            module0642.f39073((SubLObject)$ic40$);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39074((SubLObject)$ic26$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic41$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0666.f40467((SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39075((SubLObject)$ic42$, (SubLObject)$ic44$, (SubLObject)$ic45$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0656.f39812((SubLObject)$ic46$, (SubLObject)$ic47$, module0656.f39810(), (SubLObject)UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g539$.rebind(var24, var18);
                            module0015.$g541$.rebind(var23, var18);
                            module0015.$g533$.rebind(var3_23, var18);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_21, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_20, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var20, var18);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41084(final SubLObject var17) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic49$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0038.f2735(module0642.f39104((SubLObject)$ic42$, var17));
        if (!var18.isString() || var18.equal((SubLObject)$ic44$)) {
            module0656.f39789((SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL == module0126.f8389(var18)) {
            module0656.f39789((SubLObject)$ic51$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != constants_high_oc.f10737(var18)) {
            module0656.f39789((SubLObject)$ic52$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            final SubLObject var19 = f41078(var18);
            if (NIL != constant_handles_oc.f8449(var19)) {
                module0677.f41359(var19);
                module0674.f41154((SubLObject)$ic53$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            else {
                module0656.f39789((SubLObject)$ic54$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41085(SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic58$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic60$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            if (NIL != module0014.f695((SubLObject)$ic56$)) {
                final SubLObject var32 = module0014.f697((SubLObject)$ic56$);
                final SubLObject var33 = (SubLObject)$ic61$;
                final SubLObject var34 = module0014.f694((SubLObject)$ic56$);
                final SubLObject var35 = (SubLObject)ZERO_INTEGER;
                module0642.f39020(module0015.$g431$.getGlobalValue());
                module0642.f39020(module0015.$g440$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var32);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var34) {
                    module0642.f39020(module0015.$g437$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var34);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var33) {
                    module0642.f39020(module0015.$g438$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39049(var33));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                if (NIL != var35) {
                    module0642.f39020(module0015.$g439$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var35);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_34 = module0015.$g533$.currentBinding(var29);
                try {
                    module0015.$g533$.bind((SubLObject)T, var29);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41086(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic68$);
        }
        else {
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)$ic69$);
            var19 = var17.first();
            final SubLObject var20 = var17.rest();
            if (NIL == var20) {
                final SubLObject var21 = module0656.f39943(var19, (SubLObject)UNPROVIDED);
                if (NIL == module0173.f10955(var21)) {
                    module0656.f39789((SubLObject)$ic70$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                var19 = module0656.f39842(var21);
                final SubLObject var22 = (SubLObject)$ic71$;
                final SubLObject var23 = module0015.$g538$.currentBinding(var18);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
                    module0642.f39020((SubLObject)$ic27$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                    final SubLObject var24 = module0014.f672((SubLObject)$ic28$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var24) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var24);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var22) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var22);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0666.f40471();
                    module0666.f40487();
                    module0666.f40535();
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var3_38 = module0015.$g535$.currentBinding(var18);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_39 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic34$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_40 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic35$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic36$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic37$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_40, var18);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var22) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var22);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var25 = module0656.f39832((SubLObject)NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic38$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var25) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var25);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_41 = module0015.$g533$.currentBinding(var18);
                            final SubLObject var26 = module0015.$g541$.currentBinding(var18);
                            final SubLObject var27 = module0015.$g539$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0015.$g541$.bind((SubLObject)T, var18);
                                module0015.$g539$.bind(module0015.f797(), var18);
                                module0642.f39069((SubLObject)$ic72$, var19, (SubLObject)UNPROVIDED);
                                module0656.f39870((SubLObject)$ic65$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic73$);
                                module0656.f39804(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic74$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0642.f39079((SubLObject)$ic42$, (SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39073((SubLObject)$ic40$);
                                module0642.f39032((SubLObject)UNPROVIDED);
                                module0642.f39074((SubLObject)$ic75$, (SubLObject)$ic76$, (SubLObject)UNPROVIDED);
                                module0642.f39032((SubLObject)UNPROVIDED);
                                module0642.f39074((SubLObject)$ic77$, (SubLObject)$ic78$, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0656.f39812((SubLObject)$ic46$, (SubLObject)$ic47$, module0656.f39810(), (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g234$.getGlobalValue());
                                module0642.f39019((SubLObject)$ic79$);
                                module0656.f39804(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic80$);
                                module0642.f39020(module0015.$g235$.getGlobalValue());
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                final SubLObject var3_42 = module0655.$g5134$.currentBinding(var18);
                                final SubLObject var25_43 = module0655.$g5126$.currentBinding(var18);
                                final SubLObject var26_44 = module0655.$g5079$.currentBinding(var18);
                                final SubLObject var28 = module0655.$g5124$.currentBinding(var18);
                                try {
                                    module0655.$g5134$.bind((SubLObject)$ic81$, var18);
                                    module0655.$g5126$.bind((SubLObject)NIL, var18);
                                    module0655.$g5079$.bind((SubLObject)$ic82$, var18);
                                    module0655.$g5124$.bind((SubLObject)T, var18);
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
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_39, var18);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var3_38, var18);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var23, var18);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic69$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41087(final SubLObject var17) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic84$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0656.f39943(var17.first(), (SubLObject)UNPROVIDED);
        final SubLObject var19 = module0038.f2735(module0642.f39104((SubLObject)$ic42$, var17));
        SubLObject var20 = (SubLObject)NIL;
        final SubLObject var21 = module0642.f39104((SubLObject)$ic78$, var17);
        if (NIL == module0173.f10955(var18)) {
            return module0656.f39789((SubLObject)$ic85$, var17.first(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (!var19.isString() || var19.equal((SubLObject)$ic44$)) {
            return module0656.f39789((SubLObject)$ic86$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL == var21 && NIL == module0126.f8389(var19) && NIL == module0656.f39950(var19, (SubLObject)UNPROVIDED)) {
            return module0656.f39789((SubLObject)$ic87$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != module0656.f39950(var19, (SubLObject)UNPROVIDED)) {
            var20 = module0656.f39950(var19, (SubLObject)UNPROVIDED);
        }
        else if (NIL != var21) {
            final SubLObject var22 = module0656.f39943(var19, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var22)) {
                return module0656.f39789((SubLObject)$ic85$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var20 = var22;
        }
        else {
            final SubLObject var23 = constants_high_oc.f10737(var19);
            if (NIL != var23) {
                return module0656.f39789((SubLObject)$ic88$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var24 = module0126.f8393(var19, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL != var24) {
                return module0656.f39789((SubLObject)$ic89$, var24.first(), var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            var20 = f41078(var19);
        }
        if (NIL == module0205.f13296(var20)) {
            return module0656.f39789((SubLObject)$ic90$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0677.f41358(var20);
        final SubLObject var25 = module0173.f10958(var18);
        final SubLObject var26 = (NIL != module0202.f12590(var20)) ? var20 : module0173.f10958(var20);
        SubLObject var27 = conses_high.nthcdr((SubLObject)THREE_INTEGER, var17);
        SubLObject var28 = (SubLObject)NIL;
        var28 = var27.first();
        while (NIL != var27) {
            final SubLObject var29 = reader.read_from_string_ignoring_errors(var28.first(), (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (var29.isInteger()) {
                final SubLObject var30 = assertion_handles_oc.f11053(var29);
                if (NIL != assertion_handles_oc.f11035(var30)) {
                    SubLObject var31 = module0543.f33671(var30);
                    SubLObject var32 = module0178.f11287(var30);
                    final SubLObject var33 = module0178.f11293(var30);
                    final SubLObject var34 = module0178.f11291(var30);
                    if (NIL != module0035.f2428(var25, var31, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED) || NIL != module0035.f2428(var25, var32, Symbols.symbol_function((SubLObject)$ic91$), (SubLObject)UNPROVIDED)) {
                        var31 = conses_high.subst(var26, var25, var31, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                        var32 = conses_high.subst(var26, var25, var32, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)UNPROVIDED);
                        module0543.f33628(var31, var32, var33, var34);
                    }
                }
            }
            var27 = var27.rest();
            var28 = var27.first();
        }
        if (NIL != var21) {
            return module0674.f41154((SubLObject)$ic77$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return module0674.f41154((SubLObject)$ic75$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41088(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0587.$g4457$.currentBinding(var18);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var18), var18);
            if (NIL != module0543.f33698()) {
                try {
                    final SubLObject var3_61 = module0601.$g4652$.currentBinding(var18);
                    final SubLObject var20 = module0601.$g4654$.currentBinding(var18);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                        module0601.f36758((SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)$ic96$, module0667.f40585((SubLObject)$ic84$));
                    }
                    finally {
                        module0601.$g4654$.rebind(var20, var18);
                        module0601.$g4652$.rebind(var3_61, var18);
                    }
                }
                finally {
                    final SubLObject var3_62 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic95$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_62, var18);
                    }
                }
                return (SubLObject)NIL;
            }
            final SubLObject var21 = module0642.f39104((SubLObject)$ic97$, var17);
            SubLObject var22 = module0205.f13306(var21);
            SubLObject var23 = (SubLObject)NIL;
            SubLObject var24 = (SubLObject)NIL;
            if (NIL == var22) {
                if (NIL == f41089(var21) && NIL == module0126.f8389(var21)) {
                    try {
                        final SubLObject var3_63 = module0601.$g4652$.currentBinding(var18);
                        final SubLObject var25 = module0601.$g4654$.currentBinding(var18);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                            module0601.f36758((SubLObject)$ic98$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            try {
                                final SubLObject var3_64 = module0601.$g4652$.currentBinding(var18);
                                final SubLObject var25_69 = module0601.$g4654$.currentBinding(var18);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                    module0601.f36758((SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                    try {
                                        final SubLObject var3_65 = module0601.$g4652$.currentBinding(var18);
                                        final SubLObject var25_70 = module0601.$g4654$.currentBinding(var18);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                            module0601.f36758((SubLObject)$ic99$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)$ic100$, var21);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var25_70, var18);
                                            module0601.$g4652$.rebind(var3_65, var18);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_66 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                            module0601.f36760((SubLObject)$ic99$);
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
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                    module0601.f36760((SubLObject)$ic95$);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic98$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_68, var18);
                        }
                    }
                    return (SubLObject)NIL;
                }
                if (NIL != module0126.f8393(var21, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                    try {
                        final SubLObject var3_69 = module0601.$g4652$.currentBinding(var18);
                        final SubLObject var25 = module0601.$g4654$.currentBinding(var18);
                        try {
                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                            module0601.f36758((SubLObject)$ic98$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                            try {
                                final SubLObject var3_70 = module0601.$g4652$.currentBinding(var18);
                                final SubLObject var25_71 = module0601.$g4654$.currentBinding(var18);
                                try {
                                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                    module0601.f36758((SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                    try {
                                        final SubLObject var3_71 = module0601.$g4652$.currentBinding(var18);
                                        final SubLObject var25_72 = module0601.$g4654$.currentBinding(var18);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                            module0601.f36758((SubLObject)$ic99$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                            PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)$ic101$, module0126.f8393(var21, (SubLObject)NIL, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).first(), var21);
                                        }
                                        finally {
                                            module0601.$g4654$.rebind(var25_72, var18);
                                            module0601.$g4652$.rebind(var3_71, var18);
                                        }
                                    }
                                    finally {
                                        final SubLObject var3_72 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                            module0601.f36760((SubLObject)$ic99$);
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
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                    module0601.f36760((SubLObject)$ic95$);
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
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                            module0601.f36746();
                            module0601.f36760((SubLObject)$ic98$);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var3_74, var18);
                        }
                    }
                    return (SubLObject)NIL;
                }
                if (NIL != module0126.f8389(var21)) {
                    var22 = f41078(var21);
                }
                else {
                    var22 = reader.read_from_string_ignoring_errors(module0038.f2933(var21), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
            }
            if (NIL == module0205.f13296(var22)) {
                try {
                    final SubLObject var3_75 = module0601.$g4652$.currentBinding(var18);
                    final SubLObject var25 = module0601.$g4654$.currentBinding(var18);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                        module0601.f36758((SubLObject)$ic98$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        try {
                            final SubLObject var3_76 = module0601.$g4652$.currentBinding(var18);
                            final SubLObject var25_73 = module0601.$g4654$.currentBinding(var18);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                module0601.f36758((SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)$ic102$, var21);
                            }
                            finally {
                                module0601.$g4654$.rebind(var25_73, var18);
                                module0601.$g4652$.rebind(var3_76, var18);
                            }
                        }
                        finally {
                            final SubLObject var3_77 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                module0601.f36746();
                                module0601.f36760((SubLObject)$ic95$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var3_77, var18);
                            }
                        }
                        return (SubLObject)NIL;
                    }
                    finally {
                        module0601.$g4654$.rebind(var25, var18);
                        module0601.$g4652$.rebind(var3_75, var18);
                    }
                }
                finally {
                    final SubLObject var3_78 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                        module0601.f36760((SubLObject)$ic98$);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var3_78, var18);
                    }
                }
            }
            SubLObject var26 = var17;
            SubLObject var27 = (SubLObject)NIL;
            var27 = var26.first();
            while (NIL != var26) {
                if (NIL != module0035.f2014(var27)) {
                    final SubLObject var28 = var27.first();
                    if (NIL != module0038.f2684(var28, (SubLObject)$ic103$)) {
                        final SubLObject var29 = module0657.f40022(var17, (SubLObject)ConsesLow.list((SubLObject)$ic104$, var28));
                        final SubLObject var30 = Sequences.subseq(var28, (SubLObject)EIGHT_INTEGER, (SubLObject)UNPROVIDED);
                        if (NIL != module0274.f18065(var29, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                            var24 = (SubLObject)ConsesLow.cons(var29, var24);
                        }
                        else {
                            var23 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)$ic105$, var30, (SubLObject)$ic106$, module0642.f39104(var28, var17)), var23);
                        }
                    }
                }
                var26 = var26.rest();
                var27 = var26.first();
            }
            if (NIL == var23) {
                var26 = Sequences.nreverse(var24);
                SubLObject var31 = (SubLObject)NIL;
                var31 = var26.first();
                while (NIL != var26) {
                    module0543.f33628(var31, $ic107$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
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
                    module0601.f36758((SubLObject)$ic98$, (SubLObject)ConsesLow.list((SubLObject)$ic108$, module0213.f13918(var22)), (SubLObject)NIL, (SubLObject)NIL);
                    if (NIL != var23) {
                        try {
                            final SubLObject var3_80 = module0601.$g4652$.currentBinding(var18);
                            final SubLObject var25_74 = module0601.$g4654$.currentBinding(var18);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                module0601.f36758((SubLObject)$ic95$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var32 = var23;
                                SubLObject var33 = (SubLObject)NIL;
                                var33 = var32.first();
                                while (NIL != var32) {
                                    final SubLObject var34 = conses_high.getf(var33, (SubLObject)$ic106$, (SubLObject)UNPROVIDED);
                                    final SubLObject var35 = (SubLObject)ConsesLow.list((SubLObject)$ic109$, conses_high.getf(var33, (SubLObject)$ic105$, (SubLObject)UNPROVIDED));
                                    try {
                                        final SubLObject var3_81 = module0601.$g4652$.currentBinding(var18);
                                        final SubLObject var25_75 = module0601.$g4654$.currentBinding(var18);
                                        try {
                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                            module0601.f36758((SubLObject)$ic110$, var35, (SubLObject)NIL, (SubLObject)NIL);
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
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                            module0601.f36746();
                                            module0601.f36760((SubLObject)$ic110$);
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
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                module0601.f36746();
                                module0601.f36760((SubLObject)$ic95$);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var3_83, var18);
                            }
                        }
                    }
                    else {
                        final SubLObject var36 = (SubLObject)ConsesLow.list((SubLObject)$ic111$, module0038.f2624(Sequences.length(var24)));
                        try {
                            final SubLObject var3_84 = module0601.$g4652$.currentBinding(var18);
                            final SubLObject var25_76 = module0601.$g4654$.currentBinding(var18);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                module0601.f36758((SubLObject)$ic112$, var36, (SubLObject)NIL, (SubLObject)NIL);
                                PrintLow.format(module0587.$g4457$.getDynamicValue(var18), (SubLObject)$ic113$, Sequences.length(var24));
                            }
                            finally {
                                module0601.$g4654$.rebind(var25_76, var18);
                                module0601.$g4652$.rebind(var3_84, var18);
                            }
                        }
                        finally {
                            final SubLObject var3_85 = Threads.$is_thread_performing_cleanupP$.currentBinding(var18);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                module0601.f36760((SubLObject)$ic112$);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic98$);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var3_86, var18);
                }
            }
        }
        finally {
            module0587.$g4457$.rebind(var19, var18);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41090(final SubLObject var11, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic114$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic115$, module0656.f39842(var11));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
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
        if (NIL != module0652.$g5075$.getDynamicValue(var2)) {
            module0642.f39020(module0015.$g158$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(module0652.$g5075$.getDynamicValue(var2));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g147$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic117$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var3 = module0015.$g533$.currentBinding(var2);
        try {
            module0015.$g533$.bind((SubLObject)T, var2);
            if (module0574.f35152().equal($ic118$)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var2), (SubLObject)$ic119$);
                module0656.f39804(module0574.f35152(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic120$);
                module0667.f40571((SubLObject)$ic121$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)$ic122$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic123$);
                module0642.f39067();
            }
        }
        finally {
            module0015.$g533$.rebind(var3, var2);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41092(SubLObject var105) {
        if (var105 == UNPROVIDED) {
            var105 = (SubLObject)$ic44$;
        }
        final SubLObject var106 = Sequences.cconcatenate((SubLObject)$ic124$, var105);
        final SubLObject var107 = Sequences.cconcatenate((SubLObject)$ic125$, var105);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic127$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic128$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g159$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic129$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic130$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic131$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic132$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic133$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var106) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var106);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic134$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic135$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g295$.getGlobalValue());
        module0642.f39020(module0015.$g305$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic35$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g306$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic126$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var107) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var107);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g307$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic136$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g160$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic137$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g159$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic138$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39026((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41093(final SubLObject var37, SubLObject var108) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic141$;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        final SubLObject var110 = module0656.f39943(var37, (SubLObject)UNPROVIDED);
        final SubLObject var111 = f41094(var110, var108);
        final SubLObject var112 = Mapping.mapcar((SubLObject)$ic142$, var111);
        final SubLObject var113 = module0035.f2378(Sequences.remove((SubLObject)NIL, var112, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)$ic143$, (SubLObject)UNPROVIDED);
        final SubLObject var114 = (NIL != constant_handles_oc.f8449(var110)) ? var110 : constants_high_oc.f10739(Strings.string_upcase(module0038.f2699((SubLObject)$ic44$, (SubLObject)$ic144$, module0038.f2699((SubLObject)$ic44$, (SubLObject)$ic145$, module0038.f2699((SubLObject)$ic146$, (SubLObject)$ic147$, module0205.f13307(var110), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), (SubLObject)UNPROVIDED);
        final SubLObject var115 = constants_high_oc.f10743(var114);
        final SubLObject var116 = (SubLObject)ConsesLow.list((SubLObject)$ic148$, var115, (SubLObject)$ic149$, module0213.f13918(var110));
        final SubLObject var117 = module0147.$g2094$.currentBinding(var109);
        final SubLObject var118 = module0147.$g2095$.currentBinding(var109);
        try {
            module0147.$g2094$.bind((SubLObject)$ic150$, var109);
            module0147.$g2095$.bind($ic151$, var109);
            try {
                final SubLObject var3_115 = module0601.$g4652$.currentBinding(var109);
                final SubLObject var25_116 = module0601.$g4654$.currentBinding(var109);
                try {
                    module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var109), module0601.$g4652$.getDynamicValue(var109)), var109);
                    module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var109), var109);
                    module0601.f36758((SubLObject)$ic152$, var116, (SubLObject)NIL, (SubLObject)NIL);
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
                    for (var119 = var113, var120 = (SubLObject)NIL, var120 = (SubLObject)ONE_INTEGER; !var120.numGE(var119); var120 = module0048.f_1X(var120)) {
                        var121 = var111;
                        var122 = (SubLObject)NIL;
                        var122 = var121.first();
                        while (NIL != var121) {
                            var123 = (SubLObject)ZERO_INTEGER;
                            var124 = var122;
                            if (NIL != module0158.f10010(var110, var120, var124)) {
                                var125 = module0158.f10011(var110, var120, var124);
                                var126 = (SubLObject)NIL;
                                var127 = (SubLObject)NIL;
                                while (NIL == var126) {
                                    var128 = module0052.f3695(var125, var127);
                                    var129 = (SubLObject)makeBoolean(!var127.eql(var128));
                                    if (NIL != var129) {
                                        var130 = (SubLObject)NIL;
                                        try {
                                            var130 = module0158.f10316(var128, (SubLObject)$ic153$, (SubLObject)NIL, (SubLObject)NIL);
                                            var123_128 = (SubLObject)NIL;
                                            var124_129 = (SubLObject)NIL;
                                            while (NIL == var123_128) {
                                                var131 = module0052.f3695(var130, var124_129);
                                                var126_131 = (SubLObject)makeBoolean(!var124_129.eql(var131));
                                                if (NIL != var126_131 && !var123.numG((SubLObject)TWENTY_INTEGER)) {
                                                    var123 = Numbers.add(var123, (SubLObject)ONE_INTEGER);
                                                    try {
                                                        var3_116 = module0601.$g4652$.currentBinding(var109);
                                                        var25_117 = module0601.$g4654$.currentBinding(var109);
                                                        try {
                                                            module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var109), module0601.$g4652$.getDynamicValue(var109)), var109);
                                                            module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var109), var109);
                                                            module0601.f36758((SubLObject)$ic154$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var109);
                                                            module0601.f36746();
                                                            module0601.f36760((SubLObject)$ic154$);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(var3_117, var109);
                                                        }
                                                    }
                                                    module0797.f50960(conses_high.subst(var114, var110, module0178.f11303(var131), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
                                                }
                                                var123_128 = (SubLObject)makeBoolean(NIL == var126_131);
                                            }
                                        }
                                        finally {
                                            var3_118 = Threads.$is_thread_performing_cleanupP$.currentBinding(var109);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var109);
                                                if (NIL != var130) {
                                                    module0158.f10319(var130);
                                                }
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(var3_118, var109);
                                            }
                                        }
                                    }
                                    var126 = (SubLObject)makeBoolean(NIL == var129);
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
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var109);
                    module0601.f36746();
                    module0601.f36760((SubLObject)$ic152$);
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
        if (NIL == constant_handles_oc.f8449(var110)) {
            constant_handles_oc.f8460(var114);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41094(final SubLObject var11, SubLObject var108) {
        if (var108 == UNPROVIDED) {
            var108 = (SubLObject)$ic141$;
        }
        final SubLThread var109 = SubLProcess.currentSubLThread();
        SubLObject var110 = Sequences.nreverse(module0035.f2153(ConsesLow.nconc(module0259.f16847($ic155$), conses_high.copy_list(module0656.f39825(var11))), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED));
        if (module0217.f14221(var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED).numL((SubLObject)$ic156$)) {
            final SubLObject var111 = module0147.$g2094$.currentBinding(var109);
            final SubLObject var112 = module0147.$g2095$.currentBinding(var109);
            try {
                module0147.$g2094$.bind((SubLObject)$ic150$, var109);
                module0147.$g2095$.bind($ic151$, var109);
                final SubLObject var113 = (SubLObject)NIL;
                if (NIL != module0158.f10010(var11, (SubLObject)NIL, var113)) {
                    final SubLObject var114 = module0158.f10011(var11, (SubLObject)NIL, var113);
                    SubLObject var115 = (SubLObject)NIL;
                    final SubLObject var116 = (SubLObject)NIL;
                    while (NIL == var115) {
                        final SubLObject var117 = module0052.f3695(var114, var116);
                        final SubLObject var118 = (SubLObject)makeBoolean(!var116.eql(var117));
                        if (NIL != var118) {
                            SubLObject var119 = (SubLObject)NIL;
                            try {
                                var119 = module0158.f10316(var117, (SubLObject)$ic153$, (SubLObject)NIL, (SubLObject)NIL);
                                SubLObject var123_137 = (SubLObject)NIL;
                                final SubLObject var124_138 = (SubLObject)NIL;
                                while (NIL == var123_137) {
                                    final SubLObject var120 = module0052.f3695(var119, var124_138);
                                    final SubLObject var126_139 = (SubLObject)makeBoolean(!var124_138.eql(var120));
                                    if (NIL != var126_139) {
                                        final SubLObject var121 = module0205.f13132(var120);
                                        if (NIL == conses_high.member(var121, var110, Symbols.symbol_function((SubLObject)EQUAL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                                            var110 = (SubLObject)ConsesLow.cons(var121, var110);
                                        }
                                    }
                                    var123_137 = (SubLObject)makeBoolean(NIL == var126_139);
                                }
                            }
                            finally {
                                final SubLObject var3_141 = Threads.$is_thread_performing_cleanupP$.currentBinding(var109);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var109);
                                    if (NIL != var119) {
                                        module0158.f10319(var119);
                                    }
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(var3_141, var109);
                                }
                            }
                        }
                        var115 = (SubLObject)makeBoolean(NIL == var118);
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
        final SubLObject var144 = reader.read_from_string_ignoring_errors(var143, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)makeBoolean(NIL == module0205.f13145((SubLObject)$ic157$, var144, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && NIL != module0210.f13571(var144));
    }
    
    public static SubLObject f41095(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = var17.first();
        final SubLObject var20 = module0587.$g4457$.currentBinding(var18);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var18), var18);
            final SubLObject var21 = (SubLObject)$ic44$;
            final SubLObject var3_145 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var22 = module0014.f672((SubLObject)$ic28$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var22) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var22);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var21) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var21);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_146 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_147 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_148 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_148, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var21) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var21);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        f41091();
                        f41093(var19, (SubLObject)UNPROVIDED);
                        final SubLObject var23 = module0014.f657((SubLObject)$ic139$);
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g479$.getGlobalValue());
                        module0642.f39020(module0015.$g482$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var23);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g483$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic32$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_149 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39029((SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_149, var18);
                        }
                        module0642.f39020(module0015.$g480$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_147, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_146, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var3_145, var18);
            }
        }
        finally {
            module0587.$g4457$.rebind(var20, var18);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41096(final SubLObject var11, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic114$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic159$, module0656.f39842(var11));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41097(final SubLObject var11, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic161$;
        }
        final SubLObject var30 = module0016.f935();
        final SubLObject var31 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic162$, module0213.f13918(var11), var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g385$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41098(final SubLObject var11, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic164$;
        }
        final SubLObject var30 = module0016.f935();
        final SubLObject var31 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic165$, module0213.f13918(var11), var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g385$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41099(final SubLObject var11, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic167$;
        }
        final SubLObject var30 = module0016.f935();
        final SubLObject var31 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic168$, module0213.f13918(var11), var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g385$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41100(final SubLObject var11, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic170$;
        }
        final SubLObject var30 = module0016.f935();
        final SubLObject var31 = module0656.f39832((SubLObject)NIL);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic171$, module0213.f13918(var11), var30);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g385$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        if (NIL != var31) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var31);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var32 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var32, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41101(final SubLObject var57) {
        if (NIL != assertion_handles_oc.f11035(var57)) {
            final SubLObject var58 = assertion_handles_oc.f11025(var57);
            module0642.f39068(var58, (SubLObject)T, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41102(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic175$);
        }
        else {
            final SubLObject var19 = module0656.f39937(var17);
            if (NIL == constant_handles_oc.f8449(var19)) {
                module0656.f39789((SubLObject)$ic176$, conses_high.second(var17), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            final SubLObject var20 = (SubLObject)$ic177$;
            final SubLObject var21 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var22 = module0014.f672((SubLObject)$ic28$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var22) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var22);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var20) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var20);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_153 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_154 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_155 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_155, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var20) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var20);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        final SubLObject var23 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic38$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var23) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var23);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_156 = module0015.$g533$.currentBinding(var18);
                        final SubLObject var24 = module0015.$g541$.currentBinding(var18);
                        final SubLObject var25 = module0015.$g539$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0015.$g541$.bind((SubLObject)T, var18);
                            module0015.$g539$.bind(module0015.f797(), var18);
                            module0642.f39069((SubLObject)$ic178$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0642.f39069((SubLObject)$ic109$, module0656.f39842(var19), (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic173$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic179$);
                            module0642.f39019(var19);
                            module0642.f39019((SubLObject)$ic74$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0666.f40467((SubLObject)$ic42$, (SubLObject)$ic43$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39075((SubLObject)$ic42$, constants_high_oc.f10743(var19), (SubLObject)$ic45$);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39073((SubLObject)$ic180$);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0644.f39184((SubLObject)$ic42$, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39074((SubLObject)$ic181$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0656.f39812((SubLObject)$ic182$, (SubLObject)$ic47$, module0656.f39810(), (SubLObject)UNPROVIDED);
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0656.f39812((SubLObject)$ic183$, (SubLObject)$ic184$, module0656.f39809(), (SubLObject)UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g539$.rebind(var25, var18);
                            module0015.$g541$.rebind(var24, var18);
                            module0015.$g533$.rebind(var3_156, var18);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_154, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_153, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var21, var18);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41103(final SubLObject var17) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic183$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0642.f39104((SubLObject)$ic109$, var17);
        final SubLObject var19 = module0642.f39104((SubLObject)$ic42$, var17);
        final SubLObject var20 = module0656.f39937(var18);
        if (NIL == constant_handles_oc.f8449(var20)) {
            module0656.f39789((SubLObject)$ic186$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (!var19.isString()) {
            module0656.f39789((SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL == module0126.f8389(var19)) {
            module0656.f39789((SubLObject)$ic51$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var19.equal(constants_high_oc.f10743(var20))) {
            module0656.f39789((SubLObject)$ic187$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (NIL != constants_high_oc.f10737(var19)) {
            module0656.f39789((SubLObject)$ic52$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0543.f33635(var20, var19);
            module0674.f41154((SubLObject)$ic188$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41104(final SubLObject var152, SubLObject var28, SubLObject var157) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic190$;
        }
        if (NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var159 = module0656.f39832((SubLObject)$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var158), (SubLObject)$ic191$, module0656.f39842(var152));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var159) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var159);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var160 = module0015.$g533$.currentBinding(var158);
            try {
                module0015.$g533$.bind((SubLObject)T, var158);
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
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic195$);
        }
        else {
            final SubLObject var19 = module0656.f39943(var17, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var19)) {
                module0656.f39789((SubLObject)$ic70$, conses_high.second(var17), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            final SubLObject var20 = (SubLObject)$ic196$;
            final SubLObject var21 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var22 = module0014.f672((SubLObject)$ic28$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var22) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var22);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var20) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var20);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0666.f40471();
                module0666.f40487();
                module0666.f40535();
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_158 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_159 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_160 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_160, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var20) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var20);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        final SubLObject var23 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic38$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var23) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var23);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_161 = module0015.$g533$.currentBinding(var18);
                        final SubLObject var24 = module0015.$g541$.currentBinding(var18);
                        final SubLObject var25 = module0015.$g539$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0015.$g541$.bind((SubLObject)T, var18);
                            module0015.$g539$.bind(module0015.f797(), var18);
                            module0642.f39069((SubLObject)$ic197$, (SubLObject)T, (SubLObject)UNPROVIDED);
                            module0642.f39069((SubLObject)$ic198$, module0656.f39842(var19), (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic193$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic199$);
                            module0656.f39804(var19, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
                            module0642.f39019((SubLObject)$ic200$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0642.f39079((SubLObject)$ic201$, (SubLObject)$ic44$, (SubLObject)$ic45$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            module0644.f39184((SubLObject)$ic201$, (SubLObject)UNPROVIDED);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0642.f39074((SubLObject)$ic202$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g539$.rebind(var25, var18);
                            module0015.$g541$.rebind(var24, var18);
                            module0015.$g533$.rebind(var3_161, var18);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_159, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_158, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var21, var18);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41106(final SubLObject var17) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic204$);
            return (SubLObject)NIL;
        }
        final SubLObject var18 = module0642.f39104((SubLObject)$ic198$, var17);
        final SubLObject var19 = module0656.f39943(var18, (SubLObject)UNPROVIDED);
        final SubLObject var20 = module0642.f39104((SubLObject)$ic201$, var17);
        if (NIL == module0173.f10955(var19)) {
            module0656.f39789((SubLObject)$ic186$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (!var20.isString()) {
            module0656.f39789((SubLObject)$ic50$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var21 = module0656.f39943(var20, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var21)) {
            module0656.f39789((SubLObject)$ic186$, var20, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else if (var19.eql(var21)) {
            module0656.f39789((SubLObject)$ic205$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0677.f41352(var19);
            module0543.f33627(var19, var21);
            module0674.f41154((SubLObject)$ic196$, (SubLObject)T, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41107(final SubLObject var11, SubLObject var28, SubLObject var157) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic207$;
        }
        if (NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var159 = module0656.f39832((SubLObject)$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var158), (SubLObject)$ic208$, module0656.f39842(var11));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var159) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var159);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var160 = module0015.$g533$.currentBinding(var158);
            try {
                module0015.$g533$.bind((SubLObject)T, var158);
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
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic210$);
        }
        else {
            final SubLObject var18 = var17.first();
            final SubLObject var19 = module0642.f39104((SubLObject)$ic211$, var17);
            final SubLObject var20 = module0656.f39943(var18, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var20)) {
                module0656.f39789((SubLObject)$ic70$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            module0677.f41352(var20);
            module0543.f33632(var20);
            module0674.f41154((SubLObject)$ic212$, (SubLObject)T, (SubLObject)((NIL != var19) ? THREE_INTEGER : TWO_INTEGER), (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41109(final SubLObject var11, SubLObject var28, SubLObject var157, SubLObject var164) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)NIL;
        }
        if (var164 == UNPROVIDED) {
            var164 = (SubLObject)NIL;
        }
        final SubLThread var165 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic214$;
        }
        if (NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var166 = module0656.f39832((SubLObject)$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            if (NIL != var164) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var165), (SubLObject)$ic215$, module0656.f39842(var11));
            }
            else {
                PrintLow.format(module0015.$g131$.getDynamicValue(var165), (SubLObject)$ic216$, module0656.f39842(var11));
            }
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var166) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var166);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var167 = module0015.$g533$.currentBinding(var165);
            try {
                module0015.$g533$.bind((SubLObject)T, var165);
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
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic210$);
        }
        else {
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)$ic69$);
            var19 = var17.first();
            final SubLObject var20 = var17.rest();
            if (NIL == var20) {
                final SubLObject var21 = module0656.f39943(var19, (SubLObject)UNPROVIDED);
                if (NIL == module0173.f10955(var21)) {
                    module0656.f39789((SubLObject)$ic70$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                final SubLObject var22 = module0217.f14357(var21);
                final SubLObject var23 = (SubLObject)$ic220$;
                final SubLObject var24 = module0015.$g538$.currentBinding(var18);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
                    module0642.f39020((SubLObject)$ic27$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                    final SubLObject var25 = module0014.f672((SubLObject)$ic28$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var25) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var25);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var23) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var23);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var3_168 = module0015.$g535$.currentBinding(var18);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_169 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic34$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_170 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic35$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic36$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic37$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_170, var18);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var23) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var23);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var26 = module0656.f39832((SubLObject)NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic38$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var26) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var26);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_171 = module0015.$g533$.currentBinding(var18);
                            final SubLObject var27 = module0015.$g541$.currentBinding(var18);
                            final SubLObject var28 = module0015.$g539$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0015.$g541$.bind((SubLObject)T, var18);
                                module0015.$g539$.bind(module0015.f797(), var18);
                                module0642.f39069((SubLObject)$ic221$, var19, (SubLObject)UNPROVIDED);
                                module0642.f39069((SubLObject)$ic211$, (SubLObject)$ic222$, (SubLObject)UNPROVIDED);
                                module0656.f39870((SubLObject)$ic218$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (NIL == module0167.f10813(var21)) {
                                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39032((SubLObject)THREE_INTEGER);
                                    module0642.f39020(module0015.$g209$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic223$);
                                    module0642.f39020(module0015.$g210$.getGlobalValue());
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0642.f39019((SubLObject)$ic224$);
                                    module0656.f39837((SubLObject)$ic225$, var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                    module0642.f39019((SubLObject)$ic226$);
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                }
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic227$);
                                module0656.f39804(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                if (var22.numG((SubLObject)ZERO_INTEGER)) {
                                    PrintLow.format(module0015.$g131$.getDynamicValue(var18), (SubLObject)$ic228$, var22);
                                }
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0656.f39790((SubLObject)$ic229$, (SubLObject)$ic230$);
                                module0642.f39074((SubLObject)$ic231$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0656.f39812((SubLObject)$ic232$, (SubLObject)$ic184$, module0656.f39809(), (SubLObject)UNPROVIDED);
                                module0015.f799(module0015.$g539$.getDynamicValue(var18));
                            }
                            finally {
                                module0015.$g539$.rebind(var28, var18);
                                module0015.$g541$.rebind(var27, var18);
                                module0015.$g533$.rebind(var3_171, var18);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var3_169, var18);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var3_168, var18);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var24, var18);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic69$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41111(final SubLObject var11, SubLObject var28, SubLObject var157) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic214$;
        }
        if (NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var159 = module0656.f39832((SubLObject)$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var158), (SubLObject)$ic234$, module0656.f39842(var11));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var159) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var159);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var160 = module0015.$g533$.currentBinding(var158);
            try {
                module0015.$g533$.bind((SubLObject)T, var158);
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
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic238$);
            return (SubLObject)NIL;
        }
        SubLObject var19 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)$ic239$);
        var19 = var17.first();
        final SubLObject var20 = var17.rest();
        if (NIL == var20) {
            final SubLObject var21 = module0656.f39937(var19);
            if (NIL == constant_handles_oc.f8449(var21)) {
                module0656.f39789((SubLObject)$ic176$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                return (SubLObject)NIL;
            }
            final SubLObject var22 = (SubLObject)$ic240$;
            final SubLObject var23 = module0015.$g538$.currentBinding(var18);
            try {
                module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
                module0642.f39020((SubLObject)$ic27$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g155$.getGlobalValue());
                module0642.f39020(module0015.$g153$.getGlobalValue());
                module0015.f718();
                module0655.f39766();
                module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                final SubLObject var24 = module0014.f672((SubLObject)$ic28$);
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g175$.getGlobalValue());
                module0642.f39020(module0015.$g176$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic29$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var24) {
                    module0642.f39020(module0015.$g178$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var24);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g177$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic30$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                module0016.f941();
                if (NIL != var22) {
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g173$.getGlobalValue());
                    module0642.f39019(var22);
                    module0642.f39020(module0015.$g174$.getGlobalValue());
                }
                module0642.f39020(module0015.$g154$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                final SubLObject var3_175 = module0015.$g535$.currentBinding(var18);
                try {
                    module0015.$g535$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g133$.getGlobalValue());
                    if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                        module0642.f39020(module0015.$g135$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g137$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic33$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_176 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g144$.getGlobalValue());
                        module0642.f39020(module0015.$g157$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic34$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_177 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g295$.getGlobalValue());
                            module0642.f39020(module0015.$g305$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic35$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g302$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic36$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g307$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic37$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        finally {
                            module0015.$g533$.rebind(var3_177, var18);
                        }
                        module0642.f39020(module0015.$g145$.getGlobalValue());
                        if (NIL != var22) {
                            module0642.f39020(module0015.$g189$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            module0642.f39019(var22);
                            module0642.f39020(module0015.$g190$.getGlobalValue());
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        }
                        final SubLObject var25 = module0656.f39832((SubLObject)NIL);
                        module0642.f39020(module0015.$g282$.getGlobalValue());
                        module0642.f39020(module0015.$g284$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g285$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic38$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        if (NIL != var25) {
                            module0642.f39020(module0015.$g286$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(var25);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_178 = module0015.$g533$.currentBinding(var18);
                        final SubLObject var26 = module0015.$g541$.currentBinding(var18);
                        final SubLObject var27 = module0015.$g539$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0015.$g541$.bind((SubLObject)T, var18);
                            module0015.$g539$.bind(module0015.f797(), var18);
                            module0642.f39069((SubLObject)$ic241$, var19, (SubLObject)UNPROVIDED);
                            module0656.f39870((SubLObject)$ic236$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            final SubLObject var28 = module0217.f14357(var21);
                            module0642.f39019((SubLObject)$ic242$);
                            module0656.f39804(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            if (var28.numG((SubLObject)ZERO_INTEGER)) {
                                PrintLow.format(module0015.$g131$.getDynamicValue(var18), (SubLObject)$ic228$, var28);
                            }
                            module0642.f39026((SubLObject)TWO_INTEGER);
                            module0656.f39790((SubLObject)$ic229$, (SubLObject)$ic230$);
                            module0642.f39074((SubLObject)$ic243$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                            module0015.f799(module0015.$g539$.getDynamicValue(var18));
                        }
                        finally {
                            module0015.$g539$.rebind(var27, var18);
                            module0015.$g541$.rebind(var26, var18);
                            module0015.$g533$.rebind(var3_178, var18);
                        }
                        module0642.f39020(module0015.$g283$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39050();
                    }
                    finally {
                        module0015.$g533$.rebind(var3_176, var18);
                    }
                    module0642.f39020(module0015.$g134$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g535$.rebind(var3_175, var18);
                }
                module0642.f39020(module0015.$g156$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g538$.rebind(var23, var18);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic239$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41113(final SubLObject var17) {
        final SubLObject var18 = var17.first();
        final SubLObject var19 = module0656.f39937(var18);
        if (NIL == constant_handles_oc.f8449(var19)) {
            module0656.f39789((SubLObject)$ic176$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        module0543.f33633(var19);
        module0674.f41154((SubLObject)$ic245$, (SubLObject)T, (SubLObject)THREE_INTEGER, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41114(final SubLObject var152, SubLObject var28, SubLObject var157) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        if (var157 == UNPROVIDED) {
            var157 = (SubLObject)NIL;
        }
        final SubLThread var158 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic247$;
        }
        if (NIL != var157) {
            module0674.f41168(var28);
        }
        else {
            final SubLObject var159 = module0656.f39832((SubLObject)$ic59$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var158), (SubLObject)$ic248$, module0656.f39842(var152));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var159) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var159);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var160 = module0015.$g533$.currentBinding(var158);
            try {
                module0015.$g533$.bind((SubLObject)T, var158);
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
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic252$);
        }
        else {
            SubLObject var19 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var17, var17, (SubLObject)$ic69$);
            var19 = var17.first();
            final SubLObject var20 = var17.rest();
            if (NIL == var20) {
                final SubLObject var21 = module0656.f39943(var19, (SubLObject)UNPROVIDED);
                if (NIL == module0173.f10955(var21)) {
                    module0656.f39789((SubLObject)$ic176$, var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                final SubLObject var22 = module0217.f14357(var21);
                final SubLObject var23 = (SubLObject)$ic253$;
                final SubLObject var24 = module0015.$g538$.currentBinding(var18);
                try {
                    module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
                    module0642.f39020((SubLObject)$ic27$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g155$.getGlobalValue());
                    module0642.f39020(module0015.$g153$.getGlobalValue());
                    module0015.f718();
                    module0655.f39766();
                    module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
                    final SubLObject var25 = module0014.f672((SubLObject)$ic28$);
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g175$.getGlobalValue());
                    module0642.f39020(module0015.$g176$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic29$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var25) {
                        module0642.f39020(module0015.$g178$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var25);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g177$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic30$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0016.f941();
                    if (NIL != var23) {
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g173$.getGlobalValue());
                        module0642.f39019(var23);
                        module0642.f39020(module0015.$g174$.getGlobalValue());
                    }
                    module0642.f39020(module0015.$g154$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    final SubLObject var3_181 = module0015.$g535$.currentBinding(var18);
                    try {
                        module0015.$g535$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g133$.getGlobalValue());
                        if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                            module0642.f39020(module0015.$g135$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g137$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic33$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var3_182 = module0015.$g533$.currentBinding(var18);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var18);
                            module0642.f39020(module0015.$g144$.getGlobalValue());
                            module0642.f39020(module0015.$g157$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic34$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_183 = module0015.$g533$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0642.f39020(module0015.$g295$.getGlobalValue());
                                module0642.f39020(module0015.$g305$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic35$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g302$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic36$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g307$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic37$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var3_183, var18);
                            }
                            module0642.f39020(module0015.$g145$.getGlobalValue());
                            if (NIL != var23) {
                                module0642.f39020(module0015.$g189$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                module0642.f39019(var23);
                                module0642.f39020(module0015.$g190$.getGlobalValue());
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            }
                            final SubLObject var26 = module0656.f39832((SubLObject)NIL);
                            module0642.f39020(module0015.$g282$.getGlobalValue());
                            module0642.f39020(module0015.$g284$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g285$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic38$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            if (NIL != var26) {
                                module0642.f39020(module0015.$g286$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(var26);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            }
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var3_184 = module0015.$g533$.currentBinding(var18);
                            final SubLObject var27 = module0015.$g541$.currentBinding(var18);
                            final SubLObject var28 = module0015.$g539$.currentBinding(var18);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var18);
                                module0015.$g541$.bind((SubLObject)T, var18);
                                module0015.$g539$.bind(module0015.f797(), var18);
                                module0642.f39069((SubLObject)$ic254$, var19, (SubLObject)UNPROVIDED);
                                module0642.f39069((SubLObject)$ic211$, (SubLObject)$ic222$, (SubLObject)UNPROVIDED);
                                module0656.f39870((SubLObject)$ic250$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic255$);
                                module0642.f39019(var22);
                                module0642.f39019((SubLObject)$ic256$);
                                module0656.f39804(var21, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic257$);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                                module0656.f39790((SubLObject)$ic229$, (SubLObject)$ic230$);
                                module0642.f39032((SubLObject)TWO_INTEGER);
                                module0642.f39074((SubLObject)$ic258$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0015.f799(module0015.$g539$.getDynamicValue(var18));
                            }
                            finally {
                                module0015.$g539$.rebind(var28, var18);
                                module0015.$g541$.rebind(var27, var18);
                                module0015.$g533$.rebind(var3_184, var18);
                            }
                            module0642.f39020(module0015.$g283$.getGlobalValue());
                            module0642.f39029((SubLObject)UNPROVIDED);
                            module0642.f39050();
                        }
                        finally {
                            module0015.$g533$.rebind(var3_182, var18);
                        }
                        module0642.f39020(module0015.$g134$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g535$.rebind(var3_181, var18);
                    }
                    module0642.f39020(module0015.$g156$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                }
                finally {
                    module0015.$g538$.rebind(var24, var18);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var17, (SubLObject)$ic69$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41116(final SubLObject var17) {
        final SubLObject var18 = var17.first();
        final SubLObject var19 = module0642.f39104((SubLObject)$ic211$, var17);
        final SubLObject var20 = module0656.f39943(var18, (SubLObject)UNPROVIDED);
        if (NIL == module0173.f10955(var20)) {
            module0656.f39789((SubLObject)$ic176$, var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        module0543.f33685(var20, (SubLObject)UNPROVIDED);
        module0674.f41154((SubLObject)$ic260$, (SubLObject)T, (SubLObject)((NIL != var19) ? THREE_INTEGER : TWO_INTEGER), (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41117(final SubLObject var11, SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic262$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var29), (SubLObject)$ic263$, module0656.f39842(var11));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var11;
    }
    
    public static SubLObject f41118(SubLObject var17) {
        if (var17 == UNPROVIDED) {
            var17 = (SubLObject)NIL;
        }
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = (SubLObject)$ic270$;
        final SubLObject var20 = module0015.$g538$.currentBinding(var18);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var18))) ? module0015.$g538$.getDynamicValue(var18) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var18);
            module0642.f39020((SubLObject)$ic27$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var18), module0655.$g5142$.getDynamicValue(var18));
            final SubLObject var21 = module0014.f672((SubLObject)$ic28$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic29$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var21) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var21);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic30$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var19) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var19);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0644.f39213();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var3_185 = module0015.$g535$.currentBinding(var18);
            try {
                module0015.$g535$.bind((SubLObject)T, var18);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var18)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var18)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic33$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var3_186 = module0015.$g533$.currentBinding(var18);
                try {
                    module0015.$g533$.bind((SubLObject)T, var18);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic34$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_187 = module0015.$g533$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic35$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic36$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic37$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var3_187, var18);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var19) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var19);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var22 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var18));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic38$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var22) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var22);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var3_188 = module0015.$g533$.currentBinding(var18);
                    final SubLObject var23 = module0015.$g541$.currentBinding(var18);
                    final SubLObject var24 = module0015.$g539$.currentBinding(var18);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var18);
                        module0015.$g541$.bind((SubLObject)T, var18);
                        module0015.$g539$.bind(module0015.f797(), var18);
                        module0642.f39069((SubLObject)$ic271$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        if (NIL != var17) {
                            f41119(var17);
                        }
                        module0656.f39870((SubLObject)$ic268$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39073((SubLObject)$ic272$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic270$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        final SubLObject var25 = (SubLObject)((NIL != module0173.f10955($g5306$.getDynamicValue(var18))) ? $g5306$.getDynamicValue(var18) : NIL);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0657.f39992(var25, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0657.f40017((SubLObject)((NIL != $g5305$.getDynamicValue(var18)) ? $g5305$.getDynamicValue(var18) : NIL), (SubLObject)$ic273$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var18));
                    }
                    finally {
                        module0015.$g539$.rebind(var24, var18);
                        module0015.$g541$.rebind(var23, var18);
                        module0015.$g533$.rebind(var3_188, var18);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var3_186, var18);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var3_185, var18);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var20, var18);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41119(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        var18.resetMultipleValues();
        final SubLObject var19 = module0657.f40003(var17, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var20 = var18.secondMultipleValue();
        final SubLObject var21 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        if (NIL != var20) {
            return module0657.f40013(var20, var21);
        }
        var18.resetMultipleValues();
        final SubLObject var22 = module0657.f40022(var17, (SubLObject)$ic275$);
        final SubLObject var23 = var18.secondMultipleValue();
        final SubLObject var24 = var18.thirdMultipleValue();
        var18.resetMultipleValues();
        if (NIL != var23) {
            return module0657.f40031(var23, var24, (SubLObject)UNPROVIDED);
        }
        $g5305$.setDynamicValue(var22, var18);
        $g5306$.setDynamicValue(var19, var18);
        final SubLObject var25 = f41079($g5305$.getDynamicValue(var18), $g5306$.getDynamicValue(var18));
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019((SubLObject)$ic276$);
        module0642.f39020(module0015.$g235$.getGlobalValue());
        module0656.f39804($g5306$.getDynamicValue(var18), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39019((SubLObject)$ic74$);
        module0642.f39026((SubLObject)UNPROVIDED);
        module0656.f39804($g5305$.getDynamicValue(var18), (SubLObject)ZERO_INTEGER, (SubLObject)T);
        module0642.f39026((SubLObject)TWO_INTEGER);
        if (var25.equal((SubLObject)$ic277$)) {
            module0642.f39020(module0015.$g209$.getGlobalValue());
            module0642.f39019((SubLObject)$ic278$);
            module0642.f39020(module0015.$g210$.getGlobalValue());
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            final SubLObject var26 = module0015.$g537$.currentBinding(var18);
            try {
                module0015.$g537$.bind((SubLObject)T, var18);
                module0642.f39026((SubLObject)UNPROVIDED);
                module0669.f40716(module0538.f33327());
            }
            finally {
                module0015.$g537$.rebind(var26, var18);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
        }
        else {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic279$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0656.f39804(var25, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41120(SubLObject var28) {
        if (var28 == UNPROVIDED) {
            var28 = (SubLObject)NIL;
        }
        final SubLThread var29 = SubLProcess.currentSubLThread();
        if (NIL == var28) {
            var28 = (SubLObject)$ic270$;
        }
        final SubLObject var30 = module0656.f39832((SubLObject)$ic59$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        module0642.f39019((SubLObject)$ic271$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var30) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var30);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0015.$g533$.currentBinding(var29);
        try {
            module0015.$g533$.bind((SubLObject)T, var29);
            module0642.f39019(var28);
        }
        finally {
            module0015.$g533$.rebind(var31, var29);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41121(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0642.f39104((SubLObject)$ic285$, var17);
        final SubLObject var20 = module0587.$g4457$.currentBinding(var18);
        try {
            module0587.$g4457$.bind(module0015.$g131$.getDynamicValue(var18), var18);
            final SubLObject var21 = module0656.f39970(var19);
            final SubLObject var3_195 = module0147.$g2094$.currentBinding(var18);
            final SubLObject var22 = module0147.$g2095$.currentBinding(var18);
            try {
                module0147.$g2094$.bind((SubLObject)$ic150$, var18);
                module0147.$g2095$.bind($ic151$, var18);
                try {
                    final SubLObject var3_196 = module0601.$g4652$.currentBinding(var18);
                    final SubLObject var25_197 = module0601.$g4654$.currentBinding(var18);
                    try {
                        module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                        module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                        module0601.f36758((SubLObject)$ic152$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
                        module0601.f36746();
                        try {
                            final SubLObject var3_197 = module0601.$g4652$.currentBinding(var18);
                            final SubLObject var25_198 = module0601.$g4654$.currentBinding(var18);
                            try {
                                module0601.$g4652$.bind(Numbers.add(module0601.$g4653$.getDynamicValue(var18), module0601.$g4652$.getDynamicValue(var18)), var18);
                                module0601.$g4654$.bind(module0601.$g4652$.getDynamicValue(var18), var18);
                                module0601.f36758((SubLObject)$ic154$, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)NIL);
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
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                                module0601.f36746();
                                module0601.f36760((SubLObject)$ic154$);
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
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)T, var18);
                        module0601.f36746();
                        module0601.f36760((SubLObject)$ic152$);
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41122(final SubLObject var17) {
        final SubLObject var18 = module0657.f40022(var17, (SubLObject)$ic286$);
        final SubLObject var19 = module0288.f19338(var18, (SubLObject)UNPROVIDED);
        if (NIL != var19) {
            module0656.f39916(var19, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        else {
            module0656.f39804(var18, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
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
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41124() {
        $g5304$ = SubLFiles.defparameter("S#45174", (SubLObject)$ic22$);
        $g5303$ = SubLFiles.defparameter("S#45175", (SubLObject)NIL);
        $g5305$ = SubLFiles.defparameter("S#45176", (SubLObject)NIL);
        $g5306$ = SubLFiles.defparameter("S#45177", module0132.$g1569$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41125() {
        Hashtables.sethash((SubLObject)$ic23$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic24$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic48$);
        module0015.f873((SubLObject)$ic55$);
        Hashtables.sethash((SubLObject)$ic56$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic57$, (SubLObject)NIL));
        module0656.f39840((SubLObject)$ic56$, (SubLObject)$ic62$, (SubLObject)ONE_INTEGER);
        module0656.f39821((SubLObject)$ic56$, (SubLObject)$ic58$, (SubLObject)$ic63$, (SubLObject)$ic64$);
        Hashtables.sethash((SubLObject)$ic65$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic66$, (SubLObject)NIL));
        module0012.f441((SubLObject)$ic67$);
        module0015.f873((SubLObject)$ic83$);
        module0015.f873((SubLObject)$ic92$);
        module0015.f877((SubLObject)$ic93$, (SubLObject)$ic94$);
        module0015.f873((SubLObject)$ic93$);
        module0656.f39840((SubLObject)$ic3$, (SubLObject)$ic116$, (SubLObject)TWO_INTEGER);
        Hashtables.sethash((SubLObject)$ic139$, module0014.$g111$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic140$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic158$);
        module0656.f39840((SubLObject)$ic2$, (SubLObject)$ic160$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic4$, (SubLObject)$ic163$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic5$, (SubLObject)$ic166$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic7$, (SubLObject)$ic169$, (SubLObject)TWO_INTEGER);
        module0656.f39840((SubLObject)$ic6$, (SubLObject)$ic172$, (SubLObject)TWO_INTEGER);
        Hashtables.sethash((SubLObject)$ic173$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic174$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic185$);
        module0015.f873((SubLObject)$ic189$);
        module0656.f39840((SubLObject)$ic8$, (SubLObject)$ic192$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic193$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic194$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic203$);
        module0015.f873((SubLObject)$ic206$);
        module0656.f39840((SubLObject)$ic9$, (SubLObject)$ic209$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic213$);
        module0656.f39840((SubLObject)$ic11$, (SubLObject)$ic217$, (SubLObject)FOUR_INTEGER);
        Hashtables.sethash((SubLObject)$ic218$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic219$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic233$);
        module0656.f39840((SubLObject)$ic10$, (SubLObject)$ic235$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic236$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic237$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic244$);
        module0015.f873((SubLObject)$ic246$);
        module0656.f39840((SubLObject)$ic225$, (SubLObject)$ic249$, (SubLObject)THREE_INTEGER);
        Hashtables.sethash((SubLObject)$ic250$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic251$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic259$);
        module0015.f873((SubLObject)$ic261$);
        module0656.f39840((SubLObject)$ic264$, (SubLObject)$ic265$, (SubLObject)TWO_INTEGER);
        module0012.f441((SubLObject)$ic266$);
        module0012.f441((SubLObject)$ic267$);
        Hashtables.sethash((SubLObject)$ic268$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic269$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic274$);
        module0656.f39840((SubLObject)$ic280$, (SubLObject)$ic281$, (SubLObject)ONE_INTEGER);
        module0656.f39819((SubLObject)$ic280$, (SubLObject)$ic270$, (SubLObject)$ic282$, (SubLObject)$ic283$);
        module0015.f877((SubLObject)$ic284$, (SubLObject)$ic94$);
        module0015.f873((SubLObject)$ic284$);
        module0015.f873((SubLObject)$ic287$);
        return (SubLObject)NIL;
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
        $g5304$ = null;
        $g5303$ = null;
        $g5305$ = null;
        $g5306$ = null;
        $ic0$ = makeSymbol("S#5859", "CYC");
        $ic1$ = makeSymbol("S#38", "CYC");
        $ic2$ = makeKeyword("CREATE-SIMILAR-LEGACY");
        $ic3$ = makeKeyword("CREATE-SIMILAR");
        $ic4$ = makeKeyword("CREATE-INSTANCE");
        $ic5$ = makeKeyword("CREATE-SPEC");
        $ic6$ = makeKeyword("CREATE-SPEC-PRED");
        $ic7$ = makeKeyword("CREATE-SPEC-MT");
        $ic8$ = makeKeyword("RENAME");
        $ic9$ = makeKeyword("MERGE");
        $ic10$ = makeKeyword("CONFIRM-KILL");
        $ic11$ = makeKeyword("KILL");
        $ic12$ = makeKeyword("TTT-TEST");
        $ic13$ = makeString("[Take Test]");
        $ic14$ = makeKeyword("KCT-TEST");
        $ic15$ = makeKeyword("KBQ-ASK");
        $ic16$ = makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $ic17$ = makeKeyword("KCT-TEST-SET");
        $ic18$ = makeKeyword("KCT-EDIT");
        $ic19$ = makeKeyword("KBQ-EDIT");
        $ic20$ = constant_handles_oc.f8479((SubLObject)makeString("ResearchCycConstant"));
        $ic21$ = constant_handles_oc.f8479((SubLObject)makeString("ScaffoldingConstant"));
        $ic22$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("InstanceNamedFn-Ternary")), constant_handles_oc.f8479((SubLObject)makeString("ProperSubcollectionNamedFn-Ternary")), constant_handles_oc.f8479((SubLObject)makeString("CityNamedFn")), constant_handles_oc.f8479((SubLObject)makeString("PersonNamedFn")), constant_handles_oc.f8479((SubLObject)makeString("PlaceNamedFn")), constant_handles_oc.f8479((SubLObject)makeString("PredicateNamedFn")), constant_handles_oc.f8479((SubLObject)makeString("StreetNamedFn")), constant_handles_oc.f8479((SubLObject)makeString("OrganizationNamedFn")));
        $ic23$ = makeKeyword("CB-CREATE");
        $ic24$ = makeString("cb-create.html");
        $ic25$ = makeString("the Create Constant page");
        $ic26$ = makeString("Create Constant");
        $ic27$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic28$ = makeKeyword("CB-CYC");
        $ic29$ = makeString("stylesheet");
        $ic30$ = makeString("text/css");
        $ic31$ = makeKeyword("SHA1");
        $ic32$ = makeString("text/javascript");
        $ic33$ = makeString("yui-skin-sam");
        $ic34$ = makeString("reloadFrameButton");
        $ic35$ = makeString("button");
        $ic36$ = makeString("reload");
        $ic37$ = makeString("Refresh Frames");
        $ic38$ = makeString("post");
        $ic39$ = makeString("cb-handle-create");
        $ic40$ = makeString("Clear");
        $ic41$ = makeString("Enter name for new constant : ");
        $ic42$ = makeString("new-name");
        $ic43$ = makeString("Complete");
        $ic44$ = makeString("");
        $ic45$ = makeInteger(40);
        $ic46$ = makeString("creating");
        $ic47$ = makeString("Cyc Naming Conventions");
        $ic48$ = makeSymbol("CB-CREATE");
        $ic49$ = makeString("Creating");
        $ic50$ = makeString("No name was specified");
        $ic51$ = makeString("~S is not a valid constant name");
        $ic52$ = makeString("Already a constant named ~a");
        $ic53$ = makeString("Constant Create");
        $ic54$ = makeString("Unable to create a constant named ~S");
        $ic55$ = makeSymbol("CB-HANDLE-CREATE");
        $ic56$ = makeKeyword("CREATE");
        $ic57$ = makeString("create-tool.gif");
        $ic58$ = makeString("Create");
        $ic59$ = makeKeyword("MAIN");
        $ic60$ = makeString("cb-create");
        $ic61$ = makeKeyword("TOP");
        $ic62$ = makeSymbol("S#45153", "CYC");
        $ic63$ = makeString("Crt");
        $ic64$ = makeString("Create Bare Cyc Constant");
        $ic65$ = makeKeyword("CB-CREATE-SIMILAR");
        $ic66$ = makeString("cb-create-similar.html");
        $ic67$ = makeSymbol("S#45175", "CYC");
        $ic68$ = makeString("the Create Similar Term page");
        $ic69$ = ConsesLow.list((SubLObject)makeSymbol("S#44996", "CYC"));
        $ic70$ = makeString("~a does not specify a Cyc term");
        $ic71$ = makeString("Create Similar Term");
        $ic72$ = makeString("cb-handle-create-similar-legacy");
        $ic73$ = makeString("Enter name for new term similar to ");
        $ic74$ = makeString(" :");
        $ic75$ = makeString("Create Similar");
        $ic76$ = makeString("create");
        $ic77$ = makeString("Copy Assertions");
        $ic78$ = makeString("copy");
        $ic79$ = makeString("Check the assertions from ");
        $ic80$ = makeString(" which you wish to copy as well: ");
        $ic81$ = makeSymbol("S#45165", "CYC");
        $ic82$ = makeKeyword("MAXIMAL");
        $ic83$ = makeSymbol("CB-CREATE-SIMILAR-LEGACY");
        $ic84$ = makeString("create similar facilities");
        $ic85$ = makeString("Unable to determine a term from ~S");
        $ic86$ = makeString("No term was specified");
        $ic87$ = makeString("~S is not a valid term name");
        $ic88$ = makeString("Already a constant named ~S");
        $ic89$ = makeString("Constant ~S already exists which differs from ~S only by case");
        $ic90$ = makeString("Unable to create a similar term named ~S");
        $ic91$ = makeSymbol("HLMT-EQUAL");
        $ic92$ = makeSymbol("CB-HANDLE-CREATE-SIMILAR-LEGACY");
        $ic93$ = makeSymbol("CB-HANDLE-CREATE-SIMILAR");
        $ic94$ = makeString("text/xml");
        $ic95$ = makeString("error");
        $ic96$ = makeString("~S");
        $ic97$ = makeString("focalterm");
        $ic98$ = makeString("response");
        $ic99$ = makeString("invalidTerm");
        $ic100$ = makeString("~S is not a valid term name.");
        $ic101$ = makeString("Constant ~A already exists, which differs from ~S only by case.");
        $ic102$ = makeString("Unable to create a term named ~S.");
        $ic103$ = makeString("sentence");
        $ic104$ = makeKeyword("INPUT-NAME");
        $ic105$ = makeKeyword("SENTENCE-NUM");
        $ic106$ = makeKeyword("SENTENCE");
        $ic107$ = constant_handles_oc.f8479((SubLObject)makeString("BaseKB"));
        $ic108$ = makeString("newTermId");
        $ic109$ = makeString("id");
        $ic110$ = makeString("invalidSentence");
        $ic111$ = makeString("count");
        $ic112$ = makeString("assertionsQueued");
        $ic113$ = makeString("~A assertions added to the local queue.");
        $ic114$ = makeString("[Create Similar]");
        $ic115$ = makeString("cb-create-similar&~A");
        $ic116$ = makeSymbol("S#45154", "CYC");
        $ic117$ = makeString("color:red; font-size:120%; font-weight:700");
        $ic118$ = constant_handles_oc.f8479((SubLObject)makeString("Guest"));
        $ic119$ = makeString("Sorry, ");
        $ic120$ = makeString(" cannot make assertions using the tool.   Please ");
        $ic121$ = makeKeyword("CB-LOGIN");
        $ic122$ = makeString("login");
        $ic123$ = makeString(" using your real name now so that you can make assertions using this tool.");
        $ic124$ = makeString("lookupbutton");
        $ic125$ = makeString("assertbutton");
        $ic126$ = makeString("font-size:10pt");
        $ic127$ = makeString("All Mts");
        $ic128$ = makeString("togglecheckall();");
        $ic129$ = makeString("Check All / Uncheck All");
        $ic130$ = makeString("Undo");
        $ic131$ = makeString("uncommit()");
        $ic132$ = makeString("Redo");
        $ic133$ = makeString("recommit()");
        $ic134$ = makeString("Switch to Browse Mode");
        $ic135$ = makeString("togglelookupmode()");
        $ic136$ = makeString("SEND");
        $ic137$ = makeString("dosubmit()");
        $ic138$ = makeString("Assert selected sentences");
        $ic139$ = makeKeyword("CB-CREATE-SIMILAR-JS");
        $ic140$ = makeString("cb-create-similar.js");
        $ic141$ = makeKeyword("DEFAULT");
        $ic142$ = makeSymbol("S#17556", "CYC");
        $ic143$ = makeSymbol(">");
        $ic144$ = makeString(")");
        $ic145$ = makeString("(");
        $ic146$ = makeString("_");
        $ic147$ = makeString(" ");
        $ic148$ = makeString("focalTerm");
        $ic149$ = makeString("hlid");
        $ic150$ = makeSymbol("S#12274", "CYC");
        $ic151$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic152$ = makeString("assertions");
        $ic153$ = makeKeyword("GAF");
        $ic154$ = makeString("assertion");
        $ic155$ = constant_handles_oc.f8479((SubLObject)makeString("DocumentationPredicate"));
        $ic156$ = makeInteger(100);
        $ic157$ = makeSymbol("SYMBOLP");
        $ic158$ = makeSymbol("CB-CREATE-SIMILAR");
        $ic159$ = makeString("cb-create-similar-legacy&~A");
        $ic160$ = makeSymbol("S#45160", "CYC");
        $ic161$ = makeString("[Create Instance]");
        $ic162$ = makeString("javascript:startCreate('~A', '~A', 'instance');");
        $ic163$ = makeSymbol("S#45161", "CYC");
        $ic164$ = makeString("[Create Spec]");
        $ic165$ = makeString("javascript:startCreate('~A', '~A', 'spec');");
        $ic166$ = makeSymbol("S#45162", "CYC");
        $ic167$ = makeString("[Create Spec Mt]");
        $ic168$ = makeString("javascript:startCreate('~A', '~A', 'spec-mt');");
        $ic169$ = makeSymbol("S#45163", "CYC");
        $ic170$ = makeString("[Create Spec Pred]");
        $ic171$ = makeString("javascript:startCreate('~A', '~A', 'spec-pred');");
        $ic172$ = makeSymbol("S#45164", "CYC");
        $ic173$ = makeKeyword("CB-RENAME");
        $ic174$ = makeString("cb-rename.html");
        $ic175$ = makeString("the Rename Constant page");
        $ic176$ = makeString("~a does not specify a Cyc constant");
        $ic177$ = makeString("Rename Constant");
        $ic178$ = makeString("cb-handle-rename");
        $ic179$ = makeString("Enter new name for ");
        $ic180$ = makeString("Current Name");
        $ic181$ = makeString("Rename");
        $ic182$ = makeString("naming");
        $ic183$ = makeString("renaming");
        $ic184$ = makeString("Cyc Rename/Kill");
        $ic185$ = makeSymbol("CB-RENAME");
        $ic186$ = makeString("Could not determine a term from ~S");
        $ic187$ = makeString("Name specified is same as current name");
        $ic188$ = makeString("Constant Rename");
        $ic189$ = makeSymbol("CB-HANDLE-RENAME");
        $ic190$ = makeString("[Rename]");
        $ic191$ = makeString("cb-rename&~A");
        $ic192$ = makeSymbol("S#45166", "CYC");
        $ic193$ = makeKeyword("CB-MERGE");
        $ic194$ = makeString("cb-merge.html");
        $ic195$ = makeString("the Merge Term page");
        $ic196$ = makeString("Merge Term");
        $ic197$ = makeString("cb-handle-merge");
        $ic198$ = makeString("fort-spec");
        $ic199$ = makeString("Merge the term ");
        $ic200$ = makeString(" onto the existing constant named :");
        $ic201$ = makeString("target-name");
        $ic202$ = makeString("Merge");
        $ic203$ = makeSymbol("CB-MERGE");
        $ic204$ = makeString("merging");
        $ic205$ = makeString("Attempt to merge ~S with itself.");
        $ic206$ = makeSymbol("CB-HANDLE-MERGE");
        $ic207$ = makeString("[Merge]");
        $ic208$ = makeString("cb-merge&~A");
        $ic209$ = makeSymbol("S#45167", "CYC");
        $ic210$ = makeString("the Cyc term kill facility");
        $ic211$ = makeString("confirmed");
        $ic212$ = makeString("Term Kill");
        $ic213$ = makeSymbol("CB-KILL");
        $ic214$ = makeString("[Kill]");
        $ic215$ = makeString("cb-kill&~A");
        $ic216$ = makeString("cb-kill&~A|confirmed=T");
        $ic217$ = makeSymbol("S#45168", "CYC");
        $ic218$ = makeKeyword("CB-CONFIRM-KILL");
        $ic219$ = makeString("cb-confirm-kill.html");
        $ic220$ = makeString("Confirm Term Kill");
        $ic221$ = makeString("cb-kill");
        $ic222$ = makeString("T");
        $ic223$ = makeString("NOTE: ");
        $ic224$ = makeString("If you are killing this term to remove its assertions and start again from scratch, please go to the ");
        $ic225$ = makeKeyword("RECREATE");
        $ic226$ = makeString(" page instead.");
        $ic227$ = makeString("Please confirm kill of ");
        $ic228$ = makeString(" and the removal of all ~S assertions involving it.");
        $ic229$ = makeKeyword("SELF");
        $ic230$ = makeString("No");
        $ic231$ = makeString("Yes, Kill");
        $ic232$ = makeString("killing constants");
        $ic233$ = makeSymbol("CB-CONFIRM-KILL");
        $ic234$ = makeString("cb-confirm-kill&~A");
        $ic235$ = makeSymbol("S#45169", "CYC");
        $ic236$ = makeKeyword("CB-RECREATE");
        $ic237$ = makeString("cb-recreate.html");
        $ic238$ = makeString("the Cyc constant recreate facility");
        $ic239$ = ConsesLow.list((SubLObject)makeSymbol("S#45178", "CYC"));
        $ic240$ = makeString("Recreate Constant");
        $ic241$ = makeString("cb-recreate-handler");
        $ic242$ = makeString("Please confirm recreation of ");
        $ic243$ = makeString("Yes, Recreate");
        $ic244$ = makeSymbol("CB-RECREATE");
        $ic245$ = makeString("Constant Recreate");
        $ic246$ = makeSymbol("CB-RECREATE-HANDLER");
        $ic247$ = makeString("[Recreate]");
        $ic248$ = makeString("cb-recreate&~A");
        $ic249$ = makeSymbol("S#45170", "CYC");
        $ic250$ = makeKeyword("CB-ALL-ASSERTIONS-TMS-HANDLER");
        $ic251$ = makeString("cb-all-assertions-tms-handler.html");
        $ic252$ = makeString("the Reperform TMS facility");
        $ic253$ = makeString("Confirm Reperform TMS Page");
        $ic254$ = makeString("cb-all-assertions-tms-handler");
        $ic255$ = makeString("These operations may take some time.  Please confirm that you really want to force TMS for all ");
        $ic256$ = makeString(" of the assertions of the constant ");
        $ic257$ = makeString(".");
        $ic258$ = makeString("Do it!");
        $ic259$ = makeSymbol("CB-ALL-ASSERTIONS-TMS");
        $ic260$ = makeString("Reperform TMS on indexed Assertions");
        $ic261$ = makeSymbol("CB-ALL-ASSERTIONS-TMS-HANDLER");
        $ic262$ = makeString("[Force TMS]");
        $ic263$ = makeString("cb-all-assertions-tms&~A");
        $ic264$ = makeKeyword("ALL-ASSERTIONS-TMS");
        $ic265$ = makeSymbol("S#45171", "CYC");
        $ic266$ = makeSymbol("S#45176", "CYC");
        $ic267$ = makeSymbol("S#45177", "CYC");
        $ic268$ = makeKeyword("CB-HYPOTHESIZE-HANDLER");
        $ic269$ = makeString("cb-hypothesize-handler.html");
        $ic270$ = makeString("Hypothesize");
        $ic271$ = makeString("cb-hypothesize-handler");
        $ic272$ = makeString("Reset Values");
        $ic273$ = ConsesLow.list(new SubLObject[] { makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TEN_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });
        $ic274$ = makeSymbol("CB-HYPOTHESIZE-HANDLER");
        $ic275$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("sentence"));
        $ic276$ = makeString("Last hypothesis in ");
        $ic277$ = makeKeyword("ERROR");
        $ic278$ = makeString("Error description: ");
        $ic279$ = makeString("Hypothesis results : ");
        $ic280$ = makeKeyword("HYPOTHESIZE");
        $ic281$ = makeSymbol("S#45173", "CYC");
        $ic282$ = makeString("Hyp");
        $ic283$ = makeString("Hypothesize a formula");
        $ic284$ = makeSymbol("XML-ASSERTION-INFO");
        $ic285$ = makeString("assertionId");
        $ic286$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("cycl"));
        $ic287$ = makeSymbol("CB-FORM-SMART");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 2241 ms
	
	Decompiled with Procyon 0.5.32.
*/