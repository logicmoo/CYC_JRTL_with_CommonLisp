package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0672 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0672";
    public static final String myFingerPrint = "425472ef2bdef7a50e84ce8cac824a710582d5de799d70dce8a2e8f9d860787c";
    private static final SubLList $ic0$;
    private static final SubLString $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLString $ic4$;
    private static final SubLString $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLString $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLString $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLString $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLSymbol $ic21$;
    private static final SubLSymbol $ic22$;
    private static final SubLSymbol $ic23$;
    private static final SubLSymbol $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLString $ic26$;
    private static final SubLSymbol $ic27$;
    private static final SubLString $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLString $ic31$;
    private static final SubLString $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLString $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLList $ic39$;
    private static final SubLString $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLSymbol $ic48$;
    private static final SubLString $ic49$;
    private static final SubLString $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLSymbol $ic52$;
    private static final SubLString $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLString $ic59$;
    private static final SubLString $ic60$;
    private static final SubLSymbol $ic61$;
    private static final SubLString $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLString $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLString $ic71$;
    private static final SubLSymbol $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLString $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLString $ic84$;
    private static final SubLList $ic85$;
    private static final SubLList $ic86$;
    private static final SubLSymbol $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLString $ic91$;
    private static final SubLString $ic92$;
    private static final SubLString $ic93$;
    private static final SubLString $ic94$;
    private static final SubLString $ic95$;
    private static final SubLString $ic96$;
    private static final SubLString $ic97$;
    private static final SubLString $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    
    public static SubLObject f41041(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic0$);
        var2 = var1.first();
        SubLObject var3 = var1.rest();
        final SubLObject var4 = (SubLObject)(var3.isCons() ? var3.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var3, var1, (SubLObject)$ic0$);
        var3 = var3.rest();
        if (NIL == var3) {
            final SubLObject var5 = module0655.f39758(var2);
            if (NIL == module0202.f12660(var5)) {
                return module0656.f39789((SubLObject)$ic1$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            final SubLObject var6 = module0288.f19338(var5, (SubLObject)UNPROVIDED);
            if (NIL != assertion_handles_oc.f11035(var6)) {
                module0677.f41371(var5);
                module0671.f40976(var6);
            }
            else {
                f41042(var5, (SubLObject)NIL, var4);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic0$);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41042(final SubLObject var6, SubLObject var8, SubLObject var5) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (NIL != module0202.f12883(var6, (SubLObject)UNPROVIDED)) {
            final SubLObject var9 = module0202.f12906(var6);
            final SubLObject var10 = module0202.f12887(var6);
            return f41042(var10, var9, var5);
        }
        return f41043(var6, var8, var5);
    }
    
    public static SubLObject f41043(final SubLObject var6, final SubLObject var8, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        module0677.f41369(module0202.f12683($ic3$, (SubLObject)ConsesLow.list(var8, var6), (SubLObject)UNPROVIDED));
        module0642.f39020((SubLObject)$ic4$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)$ic5$);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g535$.currentBinding(var9);
        try {
            module0015.$g535$.bind((SubLObject)T, var9);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var12_13 = module0015.$g533$.currentBinding(var9);
            try {
                module0015.$g533$.bind((SubLObject)T, var9);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var9));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var12_14 = module0015.$g533$.currentBinding(var9);
                final SubLObject var11 = module0015.$g541$.currentBinding(var9);
                final SubLObject var12 = module0015.$g539$.currentBinding(var9);
                try {
                    module0015.$g533$.bind((SubLObject)T, var9);
                    module0015.$g541$.bind((SubLObject)T, var9);
                    module0015.$g539$.bind(module0015.f797(), var9);
                    module0642.f39020(module0015.$g189$.getGlobalValue());
                    module0642.f39020((SubLObject)ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    module0642.f39019((SubLObject)$ic5$);
                    module0642.f39020(module0015.$g190$.getGlobalValue());
                    module0642.f39020((SubLObject)ONE_INTEGER);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    f41044(var6, var8, var5);
                    module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    f41045(var6, var8, var5);
                    f41046(var6, var8);
                    module0015.f799(module0015.$g539$.getDynamicValue(var9));
                }
                finally {
                    module0015.$g539$.rebind(var12, var9);
                    module0015.$g541$.rebind(var11, var9);
                    module0015.$g533$.rebind(var12_14, var9);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var12_13, var9);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var10, var9);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41045(final SubLObject var6, final SubLObject var8, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        if (NIL != var8) {
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic6$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0656.f39804(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        f41047(var6, var8, var5);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41046(final SubLObject var6, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5100$.getDynamicValue(var9)) {
            f41048(var6, var8);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41048(final SubLObject var6, final SubLObject var8) {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        SubLObject var10 = (SubLObject)NIL;
        if (NIL == module0274.f18060(var6, var8, (SubLObject)UNPROVIDED)) {
            var10 = (SubLObject)T;
            module0015.f741();
            module0642.f39020(module0015.$g203$.getGlobalValue());
            final SubLObject var11 = module0015.$g537$.currentBinding(var9);
            try {
                module0015.$g537$.bind((SubLObject)T, var9);
                final SubLObject var12 = (SubLObject)$ic7$;
                module0642.f39020(module0015.$g219$.getGlobalValue());
                if (NIL != var12) {
                    module0642.f39020(module0015.$g222$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(var12));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var12_19 = module0015.$g533$.currentBinding(var9);
                try {
                    module0015.$g533$.bind((SubLObject)T, var9);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0642.f39020(module0015.$g207$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic8$);
                    module0642.f39020(module0015.$g208$.getGlobalValue());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var12_19, var9);
                }
                module0642.f39020(module0015.$g220$.getGlobalValue());
                module0274.f18187(var6, var8, module0015.$g131$.getDynamicValue(var9));
            }
            finally {
                module0015.$g537$.rebind(var11, var9);
            }
            module0642.f39020(module0015.$g204$.getGlobalValue());
        }
        return var10;
    }
    
    public static SubLObject f41047(final SubLObject var6, final SubLObject var8, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0655.$g5096$.getDynamicValue(var9)) {
            final SubLObject var10 = module0205.f13144(var6);
            if (NIL == module0655.$g5097$.getDynamicValue(var9) || !module0538.f33483(module0172.f10930(var10)).equal(module0538.f33483(module0172.f10930(var6)))) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g234$.getGlobalValue());
                module0642.f39019((SubLObject)$ic9$);
                module0642.f39020(module0015.$g235$.getGlobalValue());
                module0642.f39026((SubLObject)UNPROVIDED);
                f41049(var10, var8, var5);
                module0642.f39026((SubLObject)UNPROVIDED);
            }
        }
        if (NIL != module0655.$g5097$.getDynamicValue(var9)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic10$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            f41049(var6, var8, var5);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        if (NIL != module0655.$g5101$.getDynamicValue(var9)) {
            module0642.f39026((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g234$.getGlobalValue());
            module0642.f39019((SubLObject)$ic11$);
            module0642.f39020(module0015.$g235$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            final SubLObject var11 = module0018.$g707$.currentBinding(var9);
            try {
                module0018.$g707$.bind((SubLObject)$ic12$, var9);
                f41050(var6, var8, module0655.$g5095$.getDynamicValue(var9), (SubLObject)T, var5);
            }
            finally {
                module0018.$g707$.rebind(var11, var9);
            }
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41049(final SubLObject var6, SubLObject var8, SubLObject var5) {
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)NIL;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLObject var9 = (SubLObject)ConsesLow.list($ic3$, var8, var6);
        module0656.f39837((SubLObject)$ic13$, var9, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0656.f39804(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41050(final SubLObject var6, final SubLObject var8, SubLObject var22, SubLObject var23, SubLObject var5) {
        if (var22 == UNPROVIDED) {
            var22 = module0655.$g5095$.getDynamicValue();
        }
        if (var23 == UNPROVIDED) {
            var23 = (SubLObject)T;
        }
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var24 = SubLProcess.currentSubLThread();
        final SubLObject var25 = (SubLObject)ConsesLow.list($ic3$, var8, var6);
        module0656.f39837((SubLObject)$ic13$, var25, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var26 = module0018.$g707$.getDynamicValue(var24);
        if (var26.eql((SubLObject)$ic12$)) {
            module0656.f39912(var6, var8);
            return var6;
        }
        if (var26.eql((SubLObject)$ic14$)) {
            Functions.funcall((SubLObject)makeSymbol("S#45121", "CYC"), var6);
            if (NIL != var23) {
                module0642.f39026((SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic15$);
                Functions.funcall((SubLObject)makeSymbol("S#45122", "CYC"), var8);
            }
            return var6;
        }
        if (NIL != var22) {
            module0656.f39804(var6, (SubLObject)ZERO_INTEGER, (SubLObject)T);
            if (NIL != var8 && NIL != var23) {
                module0642.f39019((SubLObject)$ic15$);
                module0656.f39804(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        else {
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0656.f39804(var6, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
            if (NIL != var8 && NIL != var23) {
                module0642.f39019((SubLObject)$ic15$);
                module0656.f39804(var8, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g460$.getGlobalValue());
        }
        return var6;
    }
    
    public static SubLObject f41051(final SubLObject var6, final SubLObject var8) {
        if (NIL != module0004.f104(module0205.f13136(var6), module0617.f37832(), (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
            return (SubLObject)NIL;
        }
        return (SubLObject)T;
    }
    
    public static SubLObject f41044(final SubLObject var6, final SubLObject var8, SubLObject var5) {
        if (var5 == UNPROVIDED) {
            var5 = (SubLObject)NIL;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL != module0202.f12660(var6)) {
            final SubLObject var10 = (SubLObject)ConsesLow.list($ic3$, var8, var6);
            final SubLObject var11 = (SubLObject)makeBoolean(NIL == f41051(var6, var8));
            module0656.f39870((SubLObject)$ic16$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (NIL == module0655.$g5101$.getDynamicValue(var9)) {
                module0656.f39837((SubLObject)$ic18$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            if (NIL == module0655.$g5096$.getDynamicValue(var9)) {
                module0656.f39837((SubLObject)$ic19$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL != module0655.$g5115$.getDynamicValue(var9)) {
                module0656.f39837((SubLObject)$ic20$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic21$, var10, (SubLObject)NIL, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic22$, var10, (SubLObject)NIL, var11, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
            module0656.f39837((SubLObject)$ic23$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic24$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            if (NIL != var5) {
                module0656.f39837((SubLObject)$ic25$, var10, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39032((SubLObject)UNPROVIDED);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41052(final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL == var26) {
            var26 = (SubLObject)$ic26$;
        }
        final SubLObject var28 = module0656.f39832((SubLObject)$ic27$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var27), (SubLObject)$ic28$, module0655.f39759(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var28) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var28);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)T, var27);
            module0642.f39019(var26);
        }
        finally {
            module0015.$g533$.rebind(var29, var27);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f41053(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0655.$g5101$.currentBinding(var2);
        try {
            module0655.$g5101$.bind((SubLObject)T, var2);
            f41041(var1);
        }
        finally {
            module0655.$g5101$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41054(final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL == var26) {
            var26 = (SubLObject)$ic31$;
        }
        final SubLObject var28 = module0656.f39832((SubLObject)$ic27$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var27), (SubLObject)$ic32$, module0655.f39759(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var28) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var28);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)T, var27);
            module0642.f39019(var26);
        }
        finally {
            module0015.$g533$.rebind(var29, var27);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f41055(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0655.$g5096$.currentBinding(var2);
        try {
            module0655.$g5096$.bind((SubLObject)T, var2);
            f41041(var1);
        }
        finally {
            module0655.$g5096$.rebind(var3, var2);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41056(final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL == var26) {
            var26 = (SubLObject)$ic35$;
        }
        final SubLObject var28 = module0656.f39832((SubLObject)$ic27$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var27), (SubLObject)$ic36$, module0655.f39759(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var28) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var28);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)T, var27);
            module0642.f39019(var26);
        }
        finally {
            module0015.$g533$.rebind(var29, var27);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f41057(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic39$);
        var3 = var1.first();
        final SubLObject var4 = var1.rest();
        if (NIL == var4) {
            final SubLObject var5 = module0655.f39758(var3);
            SubLObject var6 = module0132.$g1569$.getGlobalValue();
            if (NIL == module0202.f12660(var5)) {
                module0656.f39789((SubLObject)$ic40$, var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            if (NIL != module0655.$g5114$.getDynamicValue(var2)) {
                var6 = module0655.$g5114$.getDynamicValue(var2);
            }
            SubLObject var7 = var6;
            SubLObject var8 = var5;
            if (NIL != module0202.f12883(var5, (SubLObject)UNPROVIDED)) {
                var7 = module0202.f12906(var5);
                var8 = module0202.f12887(var5);
            }
            return module0674.f41198(var8, var7, (SubLObject)T, (SubLObject)T);
        }
        cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic39$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41058(final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (NIL == var26) {
            var26 = (SubLObject)$ic42$;
        }
        final SubLObject var28 = module0656.f39832((SubLObject)$ic43$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var27), (SubLObject)$ic44$, module0655.f39759(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var28) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var28);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)T, var27);
            module0642.f39019(var26);
        }
        finally {
            module0015.$g533$.rebind(var29, var27);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f41059(final SubLObject var1) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic46$);
        }
        else {
            SubLObject var2 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic39$);
            var2 = var1.first();
            final SubLObject var3 = var1.rest();
            if (NIL == var3) {
                final SubLObject var4 = module0655.f39758(var2);
                if (NIL == module0202.f12660(var4)) {
                    module0656.f39789((SubLObject)$ic40$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                module0674.f41188((SubLObject)$ic47$, (SubLObject)NIL, var4, (SubLObject)T);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic39$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41060(final SubLObject var6, SubLObject var26, SubLObject var34) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL == var26) {
            var26 = (SubLObject)$ic49$;
        }
        if (NIL != var34) {
            module0674.f41168(var26);
        }
        else {
            final SubLObject var36 = module0656.f39832((SubLObject)$ic43$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var35), (SubLObject)$ic50$, module0655.f39759(var6));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var36) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var36);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var37 = module0015.$g533$.currentBinding(var35);
            try {
                module0015.$g533$.bind((SubLObject)T, var35);
                module0642.f39019(var26);
            }
            finally {
                module0015.$g533$.rebind(var37, var35);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var6;
    }
    
    public static SubLObject f41061(final SubLObject var1) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic46$);
        }
        else {
            SubLObject var2 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic39$);
            var2 = var1.first();
            final SubLObject var3 = var1.rest();
            if (NIL == var3) {
                final SubLObject var4 = module0655.f39758(var2);
                if (NIL == module0202.f12660(var4)) {
                    module0656.f39789((SubLObject)$ic40$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                module0674.f41188((SubLObject)$ic21$, (SubLObject)NIL, var4, (SubLObject)T);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic39$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41062(final SubLObject var6, SubLObject var26, SubLObject var34) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        if (var34 == UNPROVIDED) {
            var34 = (SubLObject)NIL;
        }
        final SubLThread var35 = SubLProcess.currentSubLThread();
        if (NIL == var26) {
            var26 = (SubLObject)$ic53$;
        }
        if (NIL != var34) {
            module0674.f41168(var26);
        }
        else {
            final SubLObject var36 = module0656.f39832((SubLObject)$ic43$);
            module0642.f39020(module0015.$g381$.getGlobalValue());
            module0642.f39020(module0015.$g383$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0655.f39768();
            PrintLow.format(module0015.$g131$.getDynamicValue(var35), (SubLObject)$ic54$, module0655.f39759(var6));
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var36) {
                module0642.f39020(module0015.$g387$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var36);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var37 = module0015.$g533$.currentBinding(var35);
            try {
                module0015.$g533$.bind((SubLObject)T, var35);
                module0642.f39019(var26);
            }
            finally {
                module0015.$g533$.rebind(var37, var35);
            }
            module0642.f39020(module0015.$g382$.getGlobalValue());
        }
        return var6;
    }
    
    public static SubLObject f41063(final SubLObject var1) {
        if (NIL != module0543.f33698()) {
            module0667.f40583((SubLObject)$ic46$);
        }
        else {
            SubLObject var2 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic39$);
            var2 = var1.first();
            final SubLObject var3 = var1.rest();
            if (NIL == var3) {
                final SubLObject var4 = module0655.f39758(var2);
                if (NIL == module0202.f12660(var4)) {
                    module0656.f39789((SubLObject)$ic40$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    return (SubLObject)NIL;
                }
                if (NIL != module0202.f12883(var4, (SubLObject)UNPROVIDED)) {
                    module0677.f41371(var4);
                    module0543.f33657(module0205.f13204(var4, (SubLObject)UNPROVIDED), module0205.f13203(var4, (SubLObject)UNPROVIDED));
                    module0674.f41154((SubLObject)$ic56$, (SubLObject)T, (SubLObject)TWO_INTEGER, (SubLObject)UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic39$);
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41064(final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != module0202.f12660(var6) : var6;
        if (NIL == var26) {
            var26 = (SubLObject)$ic59$;
        }
        final SubLObject var28 = module0656.f39832((SubLObject)$ic43$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var27), (SubLObject)$ic60$, module0655.f39759(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var28) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var28);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)T, var27);
            module0642.f39019(var26);
        }
        finally {
            module0015.$g533$.rebind(var29, var27);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41065(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic39$);
        var3 = var1.first();
        final SubLObject var4 = var1.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic39$);
            return (SubLObject)NIL;
        }
        SubLObject var5 = module0655.f39758(var3);
        if (NIL == module0202.f12660(var5)) {
            return module0656.f39789((SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        SubLObject var6 = (NIL != module0655.$g5114$.getDynamicValue(var2)) ? module0655.$g5114$.getDynamicValue(var2) : module0132.$g1568$.getGlobalValue();
        var2.resetMultipleValues();
        final SubLObject var41_42 = module0279.f18576(var5, var6);
        final SubLObject var43_44 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        var5 = var41_42;
        var6 = var43_44;
        return module0683.f41803(var5, var6, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f41066(final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != module0202.f12660(var6) : var6;
        if (NIL == var26) {
            var26 = (SubLObject)$ic64$;
        }
        final SubLObject var28 = module0656.f39832((SubLObject)$ic43$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var27), (SubLObject)$ic65$, module0655.f39759(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var28) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var28);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)T, var27);
            module0642.f39019(var26);
        }
        finally {
            module0015.$g533$.rebind(var29, var27);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41067(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic39$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic39$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0655.f39758(var2);
        if (NIL == module0202.f12660(var4)) {
            return module0656.f39789((SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f41068(var4);
    }
    
    public static SubLObject f41068(final SubLObject var47) {
        final SubLThread var48 = SubLProcess.currentSubLThread();
        final SubLObject var49 = (SubLObject)$ic68$;
        final SubLObject var50 = module0015.$g538$.currentBinding(var48);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var48))) ? module0015.$g538$.getDynamicValue(var48) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var48);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var48), module0655.$g5142$.getDynamicValue(var48));
            final SubLObject var51 = module0014.f672((SubLObject)$ic69$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic70$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var51) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var51);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic71$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var49) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var49);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0644.f39213();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var12_50 = module0015.$g535$.currentBinding(var48);
            try {
                module0015.$g535$.bind((SubLObject)T, var48);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var48)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var48)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic74$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var12_51 = module0015.$g533$.currentBinding(var48);
                try {
                    module0015.$g533$.bind((SubLObject)T, var48);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic75$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var12_52 = module0015.$g533$.currentBinding(var48);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var48);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic76$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic77$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic78$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var12_52, var48);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var49) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var49);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    final SubLObject var52 = module0656.f39832((SubLObject)NIL);
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var48));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g285$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic79$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    if (NIL != var52) {
                        module0642.f39020(module0015.$g286$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var52);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var12_53 = module0015.$g533$.currentBinding(var48);
                    final SubLObject var53 = module0015.$g541$.currentBinding(var48);
                    final SubLObject var54 = module0015.$g539$.currentBinding(var48);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var48);
                        module0015.$g541$.bind((SubLObject)T, var48);
                        module0015.$g539$.bind(module0015.f797(), var48);
                        module0642.f39069((SubLObject)$ic80$, (SubLObject)T, (SubLObject)UNPROVIDED);
                        SubLObject var55 = var47;
                        SubLObject var56 = (NIL != module0655.$g5114$.getDynamicValue(var48)) ? module0655.$g5114$.getDynamicValue(var48) : module0132.$g1570$.getGlobalValue();
                        if (NIL != module0202.f12883(var47, (SubLObject)UNPROVIDED)) {
                            var55 = module0202.f12887(var47);
                            var56 = module0202.f12906(var47);
                        }
                        module0642.f39085((SubLObject)$ic81$);
                        module0642.f39073((SubLObject)$ic82$);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        module0642.f39074((SubLObject)$ic83$, (SubLObject)$ic84$, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0657.f39992(var56, (SubLObject)UNPROVIDED);
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0657.f40017(var55, (SubLObject)$ic85$);
                        module0015.f799(module0015.$g539$.getDynamicValue(var48));
                    }
                    finally {
                        module0015.$g539$.rebind(var54, var48);
                        module0015.$g541$.rebind(var53, var48);
                        module0015.$g533$.rebind(var12_53, var48);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var12_51, var48);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var12_50, var48);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var50, var48);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41069(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = module0657.f40003(var1, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var4 = var2.secondMultipleValue();
        final SubLObject var5 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        if (NIL != var4) {
            return module0657.f40013(var4, var5);
        }
        var2.resetMultipleValues();
        final SubLObject var6 = module0657.f40022(var1, (SubLObject)$ic86$);
        final SubLObject var7 = var2.secondMultipleValue();
        final SubLObject var8 = var2.thirdMultipleValue();
        var2.resetMultipleValues();
        if (NIL != var7) {
            return module0657.f40031(var7, var8, (SubLObject)UNPROVIDED);
        }
        SubLObject var9 = (SubLObject)NIL;
        final SubLObject var10 = module0206.$g2324$.currentBinding(var2);
        try {
            module0206.$g2324$.bind((SubLObject)NIL, var2);
            if (NIL == module0206.f13425(var6)) {
                f41070(var6);
                var9 = (SubLObject)T;
            }
        }
        finally {
            module0206.$g2324$.rebind(var10, var2);
        }
        if (NIL != var9) {
            return (SubLObject)NIL;
        }
        final SubLObject var11 = (SubLObject)((NIL != module0161.f10481(var3)) ? ConsesLow.list($ic3$, var3, var6) : var6);
        return f41041((SubLObject)ConsesLow.list(module0038.f2638(module0655.f39759(var11))));
    }
    
    public static SubLObject f41071(final SubLObject var61) {
        final SubLThread var62 = SubLProcess.currentSubLThread();
        assert NIL != Types.stringp(var61) : var61;
        final SubLObject var63 = reader.read_from_string_ignoring_errors(var61, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        SubLObject var64 = (SubLObject)NIL;
        if (NIL == var63) {
            module0656.f39789((SubLObject)$ic89$, var61, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            return (SubLObject)NIL;
        }
        final SubLObject var65 = module0206.$g2324$.currentBinding(var62);
        try {
            module0206.$g2324$.bind((SubLObject)NIL, var62);
            if (NIL == module0206.f13425(var63)) {
                f41070(var63);
                var64 = (SubLObject)T;
            }
        }
        finally {
            module0206.$g2324$.rebind(var65, var62);
        }
        if (NIL != var64) {
            return (SubLObject)NIL;
        }
        return var63;
    }
    
    public static SubLObject f41070(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)$ic90$;
        final SubLObject var9 = module0015.$g538$.currentBinding(var7);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var7))) ? module0015.$g538$.getDynamicValue(var7) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var7);
            module0642.f39020((SubLObject)$ic4$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
            final SubLObject var10 = module0014.f672((SubLObject)$ic69$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic70$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var10) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic71$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            module0016.f941();
            if (NIL != var8) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var8);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var12_62 = module0015.$g535$.currentBinding(var7);
            try {
                module0015.$g535$.bind((SubLObject)T, var7);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var7)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var7)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic74$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var12_63 = module0015.$g533$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic75$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var12_64 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic76$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic77$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic78$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var12_64, var7);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    if (NIL != var8) {
                        module0642.f39020(module0015.$g189$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        module0642.f39019(var8);
                        module0642.f39020(module0015.$g190$.getGlobalValue());
                        module0642.f39020((SubLObject)TWO_INTEGER);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g282$.getGlobalValue());
                    module0642.f39020(module0015.$g284$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0110.$g570$.getDynamicValue(var7));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var12_65 = module0015.$g533$.currentBinding(var7);
                    final SubLObject var11 = module0015.$g541$.currentBinding(var7);
                    final SubLObject var12 = module0015.$g539$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0015.$g541$.bind((SubLObject)T, var7);
                        module0015.$g539$.bind(module0015.f797(), var7);
                        module0656.f39790((SubLObject)$ic43$, (SubLObject)$ic91$);
                        module0642.f39026((SubLObject)TWO_INTEGER);
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic92$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                        module0656.f39804(var6, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                        module0015.f741();
                        module0642.f39020(module0015.$g203$.getGlobalValue());
                        final SubLObject var12_66 = module0015.$g537$.currentBinding(var7);
                        try {
                            module0015.$g537$.bind((SubLObject)T, var7);
                            module0642.f39020(module0015.$g234$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic93$);
                            module0642.f39020(module0015.$g235$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                            module0642.f39019((SubLObject)$ic94$);
                            module0642.f39020(module0015.$g381$.getGlobalValue());
                            module0642.f39020(module0015.$g383$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)$ic95$);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var12_67 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39019((SubLObject)$ic96$);
                            }
                            finally {
                                module0015.$g533$.rebind(var12_67, var7);
                            }
                            module0642.f39020(module0015.$g382$.getGlobalValue());
                            module0642.f39019((SubLObject)$ic97$);
                        }
                        finally {
                            module0015.$g537$.rebind(var12_66, var7);
                        }
                        module0642.f39020(module0015.$g204$.getGlobalValue());
                        module0015.f799(module0015.$g539$.getDynamicValue(var7));
                    }
                    finally {
                        module0015.$g539$.rebind(var12, var7);
                        module0015.$g541$.rebind(var11, var7);
                        module0015.$g533$.rebind(var12_65, var7);
                    }
                    module0642.f39020(module0015.$g283$.getGlobalValue());
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var12_63, var7);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var12_62, var7);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var9, var7);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41072(final SubLObject var6, SubLObject var26) {
        if (var26 == UNPROVIDED) {
            var26 = (SubLObject)NIL;
        }
        final SubLThread var27 = SubLProcess.currentSubLThread();
        assert NIL != module0202.f12660(var6) : var6;
        if (NIL == var26) {
            var26 = (SubLObject)$ic98$;
        }
        final SubLObject var28 = module0656.f39832((SubLObject)$ic43$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var27), (SubLObject)$ic99$, module0655.f39759(var6));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var28) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var28);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var29 = module0015.$g533$.currentBinding(var27);
        try {
            module0015.$g533$.bind((SubLObject)T, var27);
            module0642.f39019(var26);
        }
        finally {
            module0015.$g533$.rebind(var29, var27);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41073(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic39$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic39$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0655.f39758(var2);
        if (NIL == module0202.f12660(var4)) {
            return module0656.f39789((SubLObject)$ic62$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f41074(var4);
    }
    
    public static SubLObject f41074(final SubLObject var47) {
        if (NIL != module0202.f12883(var47, (SubLObject)UNPROVIDED)) {
            final SubLObject var48 = module0202.f12887(var47);
            final SubLObject var49 = module0202.f12906(var47);
            final SubLObject var50 = (SubLObject)NIL;
            return (SubLObject)NIL;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41075() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41041", "CB-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41042", "S#45126", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41043", "S#45127", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41045", "S#45128", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41046", "S#45129", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41048", "S#45130", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41047", "S#45131", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41049", "S#45132", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41050", "S#44721", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41051", "S#45133", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41044", "S#45134", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41052", "S#45135", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41053", "CB-SENTENCE-WITH-SHOW-ENGLISH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41054", "S#45136", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41055", "CB-SENTENCE-WITH-SHOW-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41056", "S#45137", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41057", "CB-WFF-CHECK-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41058", "S#45138", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41059", "CB-ASSERT-SIMILAR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41060", "S#45139", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41061", "CB-EDIT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41062", "S#45140", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41063", "CB-UNASSERT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41064", "S#45141", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41065", "CB-SENTENCE-QUERY-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41066", "S#45142", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41067", "CB-CLONE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41068", "S#45143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41069", "CB-HANDLE-CLONE-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41071", "S#45144", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41070", "S#45145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41072", "S#45146", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41073", "CB-JUSTIFY-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0672", "f41074", "S#45147", 1, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41076() {
        return (SubLObject)NIL;
    }
    
    public static SubLObject f41077() {
        module0015.f873((SubLObject)$ic2$);
        Hashtables.sethash((SubLObject)$ic16$, module0014.$g125$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic17$, (SubLObject)NIL));
        module0656.f39840((SubLObject)$ic18$, (SubLObject)$ic29$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic30$);
        module0656.f39840((SubLObject)$ic19$, (SubLObject)$ic33$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic34$);
        module0656.f39840((SubLObject)$ic37$, (SubLObject)$ic38$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic41$);
        module0656.f39840((SubLObject)$ic20$, (SubLObject)$ic45$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic48$);
        module0656.f39840((SubLObject)$ic21$, (SubLObject)$ic51$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic52$);
        module0656.f39840((SubLObject)$ic22$, (SubLObject)$ic55$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic57$);
        module0656.f39840((SubLObject)$ic23$, (SubLObject)$ic61$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic63$);
        module0656.f39840((SubLObject)$ic24$, (SubLObject)$ic66$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic67$);
        module0015.f873((SubLObject)$ic87$);
        module0656.f39840((SubLObject)$ic25$, (SubLObject)$ic100$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic101$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f41075();
    }
    
    public void initializeVariables() {
        f41076();
    }
    
    public void runTopLevelForms() {
        f41077();
    }
    
    static {
        me = (SubLFile)new module0672();
        $ic0$ = ConsesLow.list((SubLObject)makeSymbol("S#38900", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#10884", "CYC"));
        $ic1$ = makeString("Could not determine a sentence from ~a");
        $ic2$ = makeSymbol("CB-SENTENCE");
        $ic3$ = constant_handles_oc.f8479((SubLObject)makeString("ist"));
        $ic4$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic5$ = makeString("CycL Sentence");
        $ic6$ = makeString("Mt : ");
        $ic7$ = makeKeyword("RED");
        $ic8$ = makeString("Sentence Not Well-formed :");
        $ic9$ = makeString("EL Sentence : ");
        $ic10$ = makeString("HL Sentence : ");
        $ic11$ = makeString("English Translation : ");
        $ic12$ = makeKeyword("NL");
        $ic13$ = makeKeyword("SENTENCE");
        $ic14$ = makeKeyword("SILK");
        $ic15$ = makeString(" in ");
        $ic16$ = makeKeyword("CB-SENTENCE");
        $ic17$ = makeString("cb-sentence.html");
        $ic18$ = makeKeyword("SHOW-ENGLISH-FOR-CYCL-SENTENCE");
        $ic19$ = makeKeyword("SHOW-EL-VERSION-OF-SENTENCE");
        $ic20$ = makeKeyword("ASSERT-SIMILAR-SENTENCE");
        $ic21$ = makeKeyword("EDIT-SENTENCE");
        $ic22$ = makeKeyword("UNASSERT-SENTENCE");
        $ic23$ = makeKeyword("SENTENCE-QUERY-SIMILAR");
        $ic24$ = makeKeyword("CLONE-SENTENCE");
        $ic25$ = makeKeyword("JUSTIFY-SENTENCE");
        $ic26$ = makeString("[Show English]");
        $ic27$ = makeKeyword("MAIN");
        $ic28$ = makeString("cb-sentence-with-show-english&~a");
        $ic29$ = makeSymbol("S#45135", "CYC");
        $ic30$ = makeSymbol("CB-SENTENCE-WITH-SHOW-ENGLISH");
        $ic31$ = makeString("[EL Formula]");
        $ic32$ = makeString("cb-sentence-with-show-el-formula&~a");
        $ic33$ = makeSymbol("S#45136", "CYC");
        $ic34$ = makeSymbol("CB-SENTENCE-WITH-SHOW-EL-FORMULA");
        $ic35$ = makeString("[WFF-Check]");
        $ic36$ = makeString("cb-wff-check-sentence&~A");
        $ic37$ = makeKeyword("WFF-CHECK-SENTENCE");
        $ic38$ = makeSymbol("S#45137", "CYC");
        $ic39$ = ConsesLow.list((SubLObject)makeSymbol("S#38900", "CYC"));
        $ic40$ = makeString("~a does not specify a CycL sentence");
        $ic41$ = makeSymbol("CB-WFF-CHECK-SENTENCE");
        $ic42$ = makeString("[Assert Similar]");
        $ic43$ = makeKeyword("SELF");
        $ic44$ = makeString("cb-assert-similar-sentence&~a");
        $ic45$ = makeSymbol("S#45138", "CYC");
        $ic46$ = makeString("the Cyc KB editing facilities");
        $ic47$ = makeKeyword("SIMILAR");
        $ic48$ = makeSymbol("CB-ASSERT-SIMILAR-SENTENCE");
        $ic49$ = makeString("[Edit]");
        $ic50$ = makeString("cb-edit-sentence&~a");
        $ic51$ = makeSymbol("S#45139", "CYC");
        $ic52$ = makeSymbol("CB-EDIT-SENTENCE");
        $ic53$ = makeString("[Unassert]");
        $ic54$ = makeString("cb-unassert-sentence&~a");
        $ic55$ = makeSymbol("S#45140", "CYC");
        $ic56$ = makeString("Unassert");
        $ic57$ = makeSymbol("CB-UNASSERT-SENTENCE");
        $ic58$ = makeSymbol("S#13920", "CYC");
        $ic59$ = makeString("[Query Similar]");
        $ic60$ = makeString("cb-sentence-query-similar&~A");
        $ic61$ = makeSymbol("S#45141", "CYC");
        $ic62$ = makeString("That sentence is not available.");
        $ic63$ = makeSymbol("CB-SENTENCE-QUERY-SIMILAR");
        $ic64$ = makeString("[Clone]");
        $ic65$ = makeString("cb-clone-sentence&~a");
        $ic66$ = makeSymbol("S#45142", "CYC");
        $ic67$ = makeSymbol("CB-CLONE-SENTENCE");
        $ic68$ = makeString("Clone CycL Sentence");
        $ic69$ = makeKeyword("CB-CYC");
        $ic70$ = makeString("stylesheet");
        $ic71$ = makeString("text/css");
        $ic72$ = makeKeyword("SHA1");
        $ic73$ = makeString("text/javascript");
        $ic74$ = makeString("yui-skin-sam");
        $ic75$ = makeString("reloadFrameButton");
        $ic76$ = makeString("button");
        $ic77$ = makeString("reload");
        $ic78$ = makeString("Refresh Frames");
        $ic79$ = makeString("post");
        $ic80$ = makeString("cb-handle-clone-sentence");
        $ic81$ = makeString("clone-form");
        $ic82$ = makeString("Reset Values");
        $ic83$ = makeString("Clone");
        $ic84$ = makeString("clone");
        $ic85$ = ConsesLow.list(new SubLObject[] { makeKeyword("INPUT-NAME"), makeString("sentence"), makeKeyword("COMPLETE-LABEL"), makeString("Complete"), makeKeyword("CYCLIFY-LABEL"), makeString("Cyclify"), makeKeyword("CLEAR-LABEL"), makeString("Clear Sentence"), makeKeyword("HEIGHT"), TWENTY_INTEGER, makeKeyword("WIDTH"), makeInteger(80) });
        $ic86$ = ConsesLow.list((SubLObject)makeKeyword("INPUT-NAME"), (SubLObject)makeString("sentence"));
        $ic87$ = makeSymbol("CB-HANDLE-CLONE-SENTENCE");
        $ic88$ = makeSymbol("STRINGP");
        $ic89$ = makeString("Bad sentence, probably due to a misspelling.~%Check these inputs:~%~%~S");
        $ic90$ = makeString("CycL Sentence not Well-Formed");
        $ic91$ = makeString("Back");
        $ic92$ = makeString("Sentence : ");
        $ic93$ = makeString("Diagnosis : ");
        $ic94$ = makeString("This is not a syntactically well-formed CycL sentence.  Please refer to the ");
        $ic95$ = makeString("../../../cycdoc/ref/cycl-syntax.html#sentences");
        $ic96$ = makeString("Syntax of CycL");
        $ic97$ = makeString(" document.");
        $ic98$ = makeString("[Justify]");
        $ic99$ = makeString("cb-justify-sentence&~a");
        $ic100$ = makeSymbol("S#45146", "CYC");
        $ic101$ = makeSymbol("CB-JUSTIFY-SENTENCE");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 458 ms
	
	Decompiled with Procyon 0.5.32.
*/