package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0670 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0670";
    public static final String myFingerPrint = "e34221cd496d0a39feb076f67fe3085571faf376ace36e4ad3568d696158a8dc";
    public static SubLSymbol $g5298$;
    public static SubLSymbol $g5299$;
    public static SubLSymbol $g5300$;
    private static SubLSymbol $g5301$;
    private static final SubLSymbol $ic0$;
    private static final SubLSymbol $ic1$;
    private static final SubLSymbol $ic2$;
    private static final SubLSymbol $ic3$;
    private static final SubLSymbol $ic4$;
    private static final SubLList $ic5$;
    private static final SubLString $ic6$;
    private static final SubLSymbol $ic7$;
    private static final SubLSymbol $ic8$;
    private static final SubLString $ic9$;
    private static final SubLString $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLSymbol $ic12$;
    private static final SubLSymbol $ic13$;
    private static final SubLString $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLSymbol $ic17$;
    private static final SubLString $ic18$;
    private static final SubLSymbol $ic19$;
    private static final SubLString $ic20$;
    private static final SubLString $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLString $ic24$;
    private static final SubLString $ic25$;
    private static final SubLString $ic26$;
    private static final SubLString $ic27$;
    private static final SubLSymbol $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLString $ic30$;
    private static final SubLString $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLString $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLString $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLString $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLString $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLString $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLString $ic44$;
    private static final SubLSymbol $ic45$;
    private static final SubLString $ic46$;
    private static final SubLSymbol $ic47$;
    private static final SubLString $ic48$;
    private static final SubLSymbol $ic49$;
    private static final SubLSymbol $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLString $ic52$;
    private static final SubLSymbol $ic53$;
    private static final SubLString $ic54$;
    private static final SubLSymbol $ic55$;
    private static final SubLString $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLString $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLSymbol $ic62$;
    private static final SubLSymbol $ic63$;
    private static final SubLSymbol $ic64$;
    private static final SubLString $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLString $ic67$;
    private static final SubLSymbol $ic68$;
    private static final SubLString $ic69$;
    private static final SubLSymbol $ic70$;
    private static final SubLInteger $ic71$;
    private static final SubLString $ic72$;
    private static final SubLSymbol $ic73$;
    private static final SubLSymbol $ic74$;
    private static final SubLSymbol $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLSymbol $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLSymbol $ic83$;
    private static final SubLSymbol $ic84$;
    private static final SubLString $ic85$;
    private static final SubLString $ic86$;
    private static final SubLString $ic87$;
    private static final SubLString $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLInteger $ic92$;
    private static final SubLSymbol $ic93$;
    private static final SubLList $ic94$;
    private static final SubLString $ic95$;
    private static final SubLSymbol $ic96$;
    private static final SubLObject $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLInteger $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLString $ic103$;
    private static final SubLString $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLString $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLString $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLSymbol $ic114$;
    private static final SubLList $ic115$;
    private static final SubLList $ic116$;
    private static final SubLSymbol $ic117$;
    private static final SubLString $ic118$;
    private static final SubLSymbol $ic119$;
    private static final SubLList $ic120$;
    private static final SubLSymbol $ic121$;
    private static final SubLString $ic122$;
    private static final SubLString $ic123$;
    private static final SubLSymbol $ic124$;
    private static final SubLSymbol $ic125$;
    private static final SubLString $ic126$;
    private static final SubLSymbol $ic127$;
    private static final SubLSymbol $ic128$;
    private static final SubLList $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLString $ic133$;
    private static final SubLSymbol $ic134$;
    private static final SubLString $ic135$;
    private static final SubLString $ic136$;
    private static final SubLString $ic137$;
    private static final SubLString $ic138$;
    private static final SubLString $ic139$;
    private static final SubLString $ic140$;
    private static final SubLString $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLSymbol $ic145$;
    private static final SubLSymbol $ic146$;
    private static final SubLSymbol $ic147$;
    private static final SubLString $ic148$;
    private static final SubLString $ic149$;
    private static final SubLString $ic150$;
    private static final SubLString $ic151$;
    private static final SubLInteger $ic152$;
    private static final SubLString $ic153$;
    private static final SubLObject $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLSymbol $ic158$;
    private static final SubLString $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLString $ic166$;
    private static final SubLString $ic167$;
    private static final SubLSymbol $ic168$;
    private static final SubLList $ic169$;
    private static final SubLSymbol $ic170$;
    private static final SubLString $ic171$;
    private static final SubLString $ic172$;
    private static final SubLSymbol $ic173$;
    private static final SubLString $ic174$;
    private static final SubLString $ic175$;
    private static final SubLSymbol $ic176$;
    private static final SubLString $ic177$;
    private static final SubLString $ic178$;
    private static final SubLList $ic179$;
    private static final SubLString $ic180$;
    private static final SubLSymbol $ic181$;
    private static final SubLString $ic182$;
    private static final SubLSymbol $ic183$;
    private static final SubLString $ic184$;
    private static final SubLSymbol $ic185$;
    private static final SubLString $ic186$;
    private static final SubLSymbol $ic187$;
    private static final SubLString $ic188$;
    private static final SubLString $ic189$;
    private static final SubLString $ic190$;
    private static final SubLString $ic191$;
    private static final SubLString $ic192$;
    private static final SubLSymbol $ic193$;
    private static final SubLList $ic194$;
    private static final SubLString $ic195$;
    private static final SubLString $ic196$;
    private static final SubLString $ic197$;
    private static final SubLSymbol $ic198$;
    private static final SubLString $ic199$;
    private static final SubLString $ic200$;
    private static final SubLString $ic201$;
    private static final SubLString $ic202$;
    private static final SubLString $ic203$;
    private static final SubLString $ic204$;
    private static final SubLString $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLString $ic207$;
    private static final SubLList $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLObject $ic210$;
    private static final SubLString $ic211$;
    private static final SubLString $ic212$;
    private static final SubLObject $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLList $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLString $ic219$;
    private static final SubLSymbol $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLString $ic223$;
    private static final SubLString $ic224$;
    private static final SubLString $ic225$;
    private static final SubLList $ic226$;
    private static final SubLList $ic227$;
    private static final SubLSymbol $ic228$;
    private static final SubLSymbol $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLInteger $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLString $ic234$;
    private static final SubLString $ic235$;
    private static final SubLString $ic236$;
    private static final SubLString $ic237$;
    private static final SubLString $ic238$;
    private static final SubLObject $ic239$;
    private static final SubLString $ic240$;
    private static final SubLString $ic241$;
    private static final SubLSymbol $ic242$;
    private static final SubLString $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLSymbol $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLSymbol $ic247$;
    private static final SubLSymbol $ic248$;
    private static final SubLString $ic249$;
    private static final SubLString $ic250$;
    private static final SubLObject $ic251$;
    private static final SubLString $ic252$;
    private static final SubLString $ic253$;
    private static final SubLString $ic254$;
    private static final SubLString $ic255$;
    private static final SubLObject $ic256$;
    private static final SubLString $ic257$;
    private static final SubLString $ic258$;
    private static final SubLString $ic259$;
    private static final SubLString $ic260$;
    private static final SubLString $ic261$;
    private static final SubLString $ic262$;
    private static final SubLString $ic263$;
    private static final SubLString $ic264$;
    private static final SubLObject $ic265$;
    private static final SubLString $ic266$;
    private static final SubLString $ic267$;
    private static final SubLString $ic268$;
    private static final SubLString $ic269$;
    private static final SubLString $ic270$;
    private static final SubLSymbol $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLString $ic273$;
    private static final SubLString $ic274$;
    private static final SubLString $ic275$;
    private static final SubLString $ic276$;
    private static final SubLInteger $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLString $ic280$;
    
    public static SubLObject f40909(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic5$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic5$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0656.f39969(var2);
        if (NIL == var4) {
            return module0656.f39789((SubLObject)$ic6$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f40910(var4);
    }
    
    public static SubLObject f40911(final SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)$ic8$;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic9$;
        }
        final SubLObject var10 = module0656.f39931(var6);
        final SubLObject var11 = module0656.f39832(var8);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)$ic10$, var10);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)T, var9);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var12, var9);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f40912(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic5$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic5$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0656.f39969(var2);
        if (NIL == var4) {
            return module0656.f39789((SubLObject)$ic6$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return module0669.f40606(var4);
    }
    
    public static SubLObject f40913(final SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        if (var8 == UNPROVIDED) {
            var8 = (SubLObject)$ic8$;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic14$;
        }
        final SubLObject var10 = module0656.f39931(var6);
        final SubLObject var11 = module0656.f39832(var8);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)$ic15$, var10);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)T, var9);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var12, var9);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f40910(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = $g5298$.getDynamicValue(var7);
        final SubLObject var9 = $g5299$.getDynamicValue(var7);
        module0642.f39020((SubLObject)$ic18$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
        final SubLObject var10 = module0014.f672((SubLObject)$ic19$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var10) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var11 = module0016.$g568$.currentBinding(var7);
        try {
            module0016.$g568$.bind((SubLObject)ZERO_INTEGER, var7);
            module0016.f936();
            module0642.f39020(module0016.$g569$.getGlobalValue());
            module0016.f892();
            module0016.f895();
            module0016.f936();
            module0016.f893();
        }
        finally {
            module0016.$g568$.rebind(var11, var7);
        }
        var11 = module0015.$g535$.currentBinding(var7);
        try {
            module0015.$g535$.bind((SubLObject)T, var7);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_17 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                f40914(var6, var8);
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f40915(var6);
                module0642.f39051((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                f40916(var6, var9, var8);
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var11_17, var7);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var11, var7);
        }
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40915(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0673.f41081(var6);
        final SubLObject var9 = (SubLObject)makeBoolean(NIL == var8);
        SubLObject var10 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var10) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var11 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0016.f924((SubLObject)$ic22$, (SubLObject)$ic23$);
            module0642.f39032((SubLObject)TWO_INTEGER);
        }
        finally {
            module0015.$g533$.rebind(var11, var7);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        if (NIL != module0655.$g5115$.getDynamicValue(var7)) {
            var10 = (SubLObject)FOUR_INTEGER;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var10) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var11 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                module0016.f924((SubLObject)$ic24$, (SubLObject)$ic25$);
                module0642.f39032((SubLObject)TWO_INTEGER);
            }
            finally {
                module0015.$g533$.rebind(var11, var7);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        var10 = (SubLObject)FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var10) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var11 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0016.f924((SubLObject)$ic26$, (SubLObject)$ic27$);
            module0642.f39032((SubLObject)TWO_INTEGER);
        }
        finally {
            module0015.$g533$.rebind(var11, var7);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)$ic22$, (SubLObject)$ic3$, (SubLObject)$ic28$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic22$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        SubLObject var12 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0656.f39837((SubLObject)$ic29$, var6, (SubLObject)$ic30$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39019((SubLObject)$ic31$);
            module0656.f39837((SubLObject)$ic32$, var6, (SubLObject)$ic33$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var12, var7);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        if (NIL != module0655.$g5115$.getDynamicValue(var7)) {
            module0016.f908((SubLObject)$ic24$, (SubLObject)$ic3$, (SubLObject)$ic28$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic24$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            var12 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                module0642.f39019((SubLObject)$ic31$);
                module0656.f39837((SubLObject)$ic34$, var6, (SubLObject)$ic35$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != constant_handles_oc.f8449(var6)) {
                    module0642.f39019((SubLObject)$ic31$);
                    module0656.f39837((SubLObject)$ic36$, var6, (SubLObject)$ic37$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                if (NIL != module0673.f41082(var6)) {
                    module0642.f39019((SubLObject)$ic31$);
                    module0656.f39837((SubLObject)$ic38$, var6, (SubLObject)$ic39$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                module0642.f39019((SubLObject)$ic31$);
                module0656.f39837((SubLObject)((NIL != module0655.$g5117$.getDynamicValue(var7)) ? $ic40$ : $ic41$), var6, (SubLObject)$ic42$, var9, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                if (NIL != module0269.f17705(var6)) {
                    module0642.f39019((SubLObject)$ic31$);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic43$, var6, (SubLObject)$ic44$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic31$);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic45$, var6, (SubLObject)$ic46$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
            }
            finally {
                module0015.$g533$.rebind(var12, var7);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        module0016.f908((SubLObject)$ic26$, (SubLObject)$ic3$, (SubLObject)$ic28$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic26$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        var12 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            if (NIL != module0173.f10955(var6)) {
                module0656.f39837((SubLObject)$ic47$, var6, (SubLObject)$ic48$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic31$);
            }
            if (NIL != module0167.f10813(var6)) {
                module0656.f39837((SubLObject)$ic49$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic31$);
            }
            else if (NIL != constant_handles_oc.f8449(var6)) {
                module0656.f39837((SubLObject)$ic50$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39019((SubLObject)$ic31$);
            }
            if (NIL != module0633.f38716(var6, (SubLObject)UNPROVIDED)) {
                final SubLObject var13 = (SubLObject)NIL;
                module0642.f39019((SubLObject)$ic31$);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                if (NIL != var13) {
                    module0656.f39837((SubLObject)$ic51$, var6, (SubLObject)$ic52$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                else {
                    module0656.f39837((SubLObject)$ic53$, var6, (SubLObject)$ic54$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (NIL != module0423.f29532(var6) || NIL != module0633.f38716(var6, (SubLObject)UNPROVIDED)) {
                final SubLObject var14 = (NIL != module0633.f38716(var6, (SubLObject)UNPROVIDED)) ? module0633.f38713(var6, (SubLObject)UNPROVIDED) : var6;
                if (NIL != module0173.f10955(var14)) {
                    module0642.f39019((SubLObject)$ic31$);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic55$, var14, (SubLObject)$ic56$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    if (NIL != module0684.f41933(var14)) {
                        module0642.f39019((SubLObject)$ic31$);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0656.f39837((SubLObject)$ic57$, var14, (SubLObject)$ic58$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                }
                module0642.f39019((SubLObject)$ic31$);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)$ic59$, var14, (SubLObject)$ic60$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            module0642.f39019((SubLObject)$ic31$);
            module0669.f40612(var6, (SubLObject)$ic61$);
            if (NIL == module0677.f41295()) {
                module0016.f939((SubLObject)ConsesLow.list(new SubLObject[] { $ic62$, $ic63$, $ic64$, ConsesLow.list(reader.bq_cons((SubLObject)$ic65$, var6)), $ic66$, $ic67$, $ic68$, $ic69$, $ic70$, $ic71$ }));
            }
        }
        finally {
            module0015.$g533$.rebind(var12, var7);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40914(final SubLObject var6, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g358$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic72$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)T, var15);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_23 = module0015.$g533$.currentBinding(var15);
            try {
                module0015.$g533$.bind((SubLObject)T, var15);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_24 = module0015.$g533$.currentBinding(var15);
                try {
                    module0015.$g533$.bind((SubLObject)T, var15);
                    final SubLObject var17 = module0656.f39799(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    final SubLObject var18 = var17;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var18) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var18);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_25 = module0015.$g533$.currentBinding(var15);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var15);
                        module0656.f39915(var6, (SubLObject)ZERO_INTEGER, (SubLObject)T);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_25, var15);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var11_24, var15);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_26 = module0015.$g533$.currentBinding(var15);
                try {
                    module0015.$g533$.bind((SubLObject)T, var15);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var11_26, var15);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic76$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_27 = module0015.$g533$.currentBinding(var15);
                try {
                    module0015.$g533$.bind((SubLObject)T, var15);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic77$);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    if (var14 == $ic78$) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic79$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    else {
                        module0656.f39837((SubLObject)$ic80$, var6, (SubLObject)$ic78$, (SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)UNPROVIDED);
                    if (var14 == $ic0$) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)$ic81$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    else {
                        module0656.f39837((SubLObject)$ic80$, var6, (SubLObject)$ic0$, (SubLObject)$ic81$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic82$);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0656.f39837((SubLObject)$ic83$, var6, (SubLObject)$ic79$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0656.f39837((SubLObject)$ic84$, var6, (SubLObject)$ic81$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic85$);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0656.f39837((SubLObject)$ic11$, var6, (SubLObject)$ic86$, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0656.f39837((SubLObject)$ic16$, var6, (SubLObject)$ic87$, (SubLObject)$ic8$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                }
                finally {
                    module0015.$g533$.rebind(var11_27, var15);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var11_23, var15);
            }
            module0642.f39020(module0015.$g365$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var15);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40916(final SubLObject var6, SubLObject var15, SubLObject var14) {
        if (var15 == UNPROVIDED) {
            var15 = (SubLObject)NIL;
        }
        if (var14 == UNPROVIDED) {
            var14 = (SubLObject)$ic78$;
        }
        final SubLObject var16 = module0224.f14703(var6, var15, var14);
        final SubLObject var17 = module0224.f14707(var6, var16, var14);
        final SubLObject var18 = var14;
        if (var18.eql((SubLObject)$ic0$)) {
            return f40917(var6, var17);
        }
        if (var18.eql((SubLObject)$ic78$)) {
            return f40918(var6, var17);
        }
        return module0656.f39789((SubLObject)$ic88$, var14, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40917(final SubLObject var6, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != var30) {
            f40919(var6, var30);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)NIL;
        var33 = var32.first();
        while (NIL != var32) {
            final SubLObject var34 = var33.first();
            final SubLObject var35 = conses_high.second(var34);
            final SubLObject var36 = f40920(var35, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0016.f923(var36, (SubLObject)$ic89$);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39019((SubLObject)$ic90$);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0656.f39837((SubLObject)$ic91$, var6, var35, var35, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            final SubLObject var37 = module0224.f14728(var33);
            module0642.f39032((SubLObject)TWO_INTEGER);
            f40921(var37, (SubLObject)$ic92$);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            module0016.f908(var36, (SubLObject)(var35.eql(var6) ? $ic93$ : $g5300$.getDynamicValue(var31)), (SubLObject)$ic28$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (NIL != var36) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var36);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var38 = module0015.$g533$.currentBinding(var31);
            try {
                module0015.$g533$.bind((SubLObject)T, var31);
                SubLObject var32_37 = var33;
                SubLObject var39 = (SubLObject)NIL;
                var39 = var32_37.first();
                while (NIL != var32_37) {
                    SubLObject var41;
                    final SubLObject var40 = var41 = var39;
                    SubLObject var42 = (SubLObject)NIL;
                    SubLObject var43 = (SubLObject)NIL;
                    SubLObject var44 = (SubLObject)NIL;
                    SubLObject var45 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic94$);
                    var42 = var41.first();
                    var41 = var41.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic94$);
                    var43 = var41.first();
                    var41 = var41.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic94$);
                    var44 = var41.first();
                    var41 = var41.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)$ic94$);
                    var45 = var41.first();
                    var41 = var41.rest();
                    if (NIL == var41) {
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39032((SubLObject)FOUR_INTEGER);
                        module0656.f39837((SubLObject)$ic91$, var6, var45, var43, var44, var45);
                        if (!var44.numE((SubLObject)ONE_INTEGER)) {
                            PrintLow.format(module0015.$g131$.getDynamicValue(var31), (SubLObject)$ic95$, var44);
                        }
                        final SubLObject var46 = module0224.f14727(var39);
                        module0642.f39032((SubLObject)TWO_INTEGER);
                        f40921(var46, (SubLObject)$ic92$);
                        final SubLObject var47 = f40922(var6, var44, var45);
                        final SubLObject var48 = f40923(var6, var44, var45);
                        if (NIL != var47) {
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0656.f39837((SubLObject)$ic96$, var6, var44, var45, $ic97$, (SubLObject)UNPROVIDED);
                        }
                        if (NIL != var48) {
                            module0642.f39032((SubLObject)UNPROVIDED);
                            module0656.f39837((SubLObject)$ic98$, var6, var44, var45, $ic97$, (SubLObject)UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                        module0642.f39026((SubLObject)UNPROVIDED);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)$ic94$);
                    }
                    var32_37 = var32_37.rest();
                    var39 = var32_37.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var38, var31);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            var32 = var32.rest();
            var33 = var32.first();
        }
        module0669.f40620(var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40918(final SubLObject var6, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (NIL != var30) {
            f40919(var6, var30);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)NIL;
        var33 = var32.first();
        while (NIL != var32) {
            final SubLObject var34 = var33.first();
            final SubLObject var35 = conses_high.second(var34);
            final SubLObject var36 = conses_high.fourth(var34);
            final SubLObject var37 = conses_high.third(var34);
            final SubLObject var38 = f40920(var36, var37);
            final SubLObject var39 = (SubLObject)makeBoolean(NIL != module0035.f1997(var33) && var6.equal(var35));
            module0642.f39020(module0015.$g459$.getGlobalValue());
            if (NIL != var39) {
                module0016.f927();
            }
            else {
                module0016.f923(var38, (SubLObject)$ic89$);
            }
            final SubLObject var41;
            final SubLObject var40 = var41 = module0656.f39799(var36, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var41) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var41);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var42 = module0015.$g533$.currentBinding(var31);
            try {
                module0015.$g533$.bind((SubLObject)T, var31);
                module0656.f39837((SubLObject)$ic91$, var6, var36, (SubLObject)NIL, var37, var36);
            }
            finally {
                module0015.$g533$.rebind(var42, var31);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            if (!var37.numE((SubLObject)ONE_INTEGER)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var31), (SubLObject)$ic95$, var37);
            }
            final SubLObject var43 = module0224.f14728(var33);
            module0642.f39032((SubLObject)TWO_INTEGER);
            f40921(var43, (SubLObject)$ic92$);
            final SubLObject var44 = (SubLObject)makeBoolean(NIL == var39 || NIL != f40922(var6, var37, var36));
            if (NIL != var44) {
                module0642.f39032((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic96$, var6, var37, var36, $ic97$, (SubLObject)UNPROVIDED);
            }
            final SubLObject var45 = f40923(var6, var37, var36);
            if (NIL != var45) {
                module0642.f39032((SubLObject)UNPROVIDED);
                module0656.f39837((SubLObject)$ic98$, var6, var37, var36, $ic97$, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)UNPROVIDED);
            if (NIL == module0035.f1997(var33) || !var6.equal(var35)) {
                module0016.f908(var38, $g5300$.getDynamicValue(var31), (SubLObject)$ic28$);
                module0642.f39020(module0015.$g144$.getGlobalValue());
                if (NIL != var38) {
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var38);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var46 = module0015.$g533$.currentBinding(var31);
                try {
                    module0015.$g533$.bind((SubLObject)T, var31);
                    SubLObject var32_51 = var33;
                    SubLObject var47 = (SubLObject)NIL;
                    var47 = var32_51.first();
                    while (NIL != var32_51) {
                        SubLObject var49;
                        final SubLObject var48 = var49 = var47;
                        SubLObject var50 = (SubLObject)NIL;
                        SubLObject var51 = (SubLObject)NIL;
                        SubLObject var52 = (SubLObject)NIL;
                        SubLObject var53 = (SubLObject)NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic94$);
                        var50 = var49.first();
                        var49 = var49.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic94$);
                        var51 = var49.first();
                        var49 = var49.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic94$);
                        var52 = var49.first();
                        var49 = var49.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)$ic94$);
                        var53 = var49.first();
                        var49 = var49.rest();
                        if (NIL == var49) {
                            module0642.f39020(module0015.$g459$.getGlobalValue());
                            module0642.f39020(module0015.$g230$.getGlobalValue());
                            module0642.f39032((SubLObject)FOUR_INTEGER);
                            module0642.f39019((SubLObject)$ic90$);
                            module0642.f39020(module0015.$g231$.getGlobalValue());
                            module0656.f39837((SubLObject)$ic91$, var6, var51, var51, var52, var53);
                            final SubLObject var54 = module0224.f14727(var47);
                            module0642.f39032((SubLObject)TWO_INTEGER);
                            f40921(var54, (SubLObject)$ic92$);
                            module0642.f39020(module0015.$g460$.getGlobalValue());
                            module0642.f39026((SubLObject)UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)$ic94$);
                        }
                        var32_51 = var32_51.rest();
                        var47 = var32_51.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var46, var31);
                }
                module0642.f39020(module0015.$g145$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            var32 = var32.rest();
            var33 = var32.first();
        }
        module0669.f40620(var6);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40919(final SubLObject var6, final SubLObject var30) {
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0656.f39837((SubLObject)$ic91$, var6, (SubLObject)$ic99$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var31 = module0224.f14729(var30);
        module0642.f39032((SubLObject)TWO_INTEGER);
        f40921(var31, (SubLObject)$ic100$);
        module0642.f39032((SubLObject)FOUR_INTEGER);
        module0656.f39837((SubLObject)$ic101$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40921(final SubLObject var36, SubLObject var54) {
        if (var54 == UNPROVIDED) {
            var54 = (SubLObject)NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (!ONE_INTEGER.numE(var36)) {
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g224$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var55), (SubLObject)$ic102$, var36);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
            if (NIL != var54 && var36.numG(var54)) {
                module0642.f39032((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g149$.getGlobalValue());
                if (NIL != module0652.$g5075$.getDynamicValue(var55)) {
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0652.$g5075$.getDynamicValue(var55));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g152$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic103$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var56 = module0015.$g533$.currentBinding(var55);
                try {
                    module0015.$g533$.bind((SubLObject)T, var55);
                    module0642.f39019((SubLObject)$ic104$);
                }
                finally {
                    module0015.$g533$.rebind(var56, var55);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
            }
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40920(final SubLObject var6, SubLObject var43) {
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        final SubLObject var44 = module0656.f39932(var6);
        return Sequences.cconcatenate((SubLObject)$ic105$, new SubLObject[] { module0006.f203(var44), module0006.f203((SubLObject)((NIL != var43) ? var43 : $ic89$)) });
    }
    
    public static SubLObject f40924(final SubLObject var6, final SubLObject var43, final SubLObject var44, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0656.f39832((SubLObject)$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        if (NIL != var56) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic107$, new SubLObject[] { module0656.f39842(var6), var43, module0656.f39842(var44), module0656.f39842(var56) });
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic108$, new SubLObject[] { module0656.f39842(var6), var43, module0656.f39842(var44) });
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            final SubLObject var60 = module0014.f697((SubLObject)$ic109$);
            final SubLObject var61 = (SubLObject)$ic74$;
            final SubLObject var62 = module0014.f694((SubLObject)$ic109$);
            final SubLObject var63 = (SubLObject)ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var60);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var62) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var62);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var61) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049(var61));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var63) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var63);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_61 = module0015.$g533$.currentBinding(var57);
            try {
                module0015.$g533$.bind((SubLObject)T, var57);
            }
            finally {
                module0015.$g533$.rebind(var11_61, var57);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40922(final SubLObject var6, final SubLObject var43, final SubLObject var44) {
        return (SubLObject)makeBoolean(NIL != module0333.f22416(var44) || NIL != module0349.f23389(var44) || NIL != module0349.f23395(var44) || NIL != module0349.f23397(var44));
    }
    
    public static SubLObject f40925(final SubLObject var6, final SubLObject var43, final SubLObject var44, SubLObject var56) {
        if (var56 == UNPROVIDED) {
            var56 = (SubLObject)NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0656.f39832((SubLObject)$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        if (NIL != var56) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic111$, new SubLObject[] { module0656.f39842(var6), var43, module0656.f39842(var44), module0656.f39842(var56) });
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)$ic112$, new SubLObject[] { module0656.f39842(var6), var43, module0656.f39842(var44) });
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)T, var57);
            final SubLObject var60 = module0014.f697((SubLObject)$ic113$);
            final SubLObject var61 = (SubLObject)$ic74$;
            final SubLObject var62 = module0014.f694((SubLObject)$ic113$);
            final SubLObject var63 = (SubLObject)ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var60);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var62) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var62);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var61) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049(var61));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var63) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var63);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_62 = module0015.$g533$.currentBinding(var57);
            try {
                module0015.$g533$.bind((SubLObject)T, var57);
            }
            finally {
                module0015.$g533$.rebind(var11_62, var57);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var59, var57);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40923(final SubLObject var6, final SubLObject var43, final SubLObject var44) {
        return (SubLObject)makeBoolean(NIL != module0260.f17099(var44, (SubLObject)$ic115$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED) && var43.eql((SubLObject)ONE_INTEGER));
    }
    
    public static SubLObject f40926(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic116$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)$ic116$);
        var3 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic116$);
            return (SubLObject)NIL;
        }
        final SubLObject var5 = module0656.f39969(var2);
        if (NIL == var5) {
            return module0656.f39789((SubLObject)$ic6$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        final SubLObject var6 = Symbols.make_keyword(var3);
        $g5298$.setDynamicValue(var6);
        return f40910(var5);
    }
    
    public static SubLObject f40927(final SubLObject var6, final SubLObject var14, final SubLObject var7) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0656.f39931(var6);
        final SubLObject var17 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var15), (SubLObject)$ic118$, var16, var14);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var17) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var18 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)T, var15);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var18, var15);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f40928(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic120$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)$ic120$);
        var3 = var4.first();
        var4 = var4.rest();
        if (NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic120$);
            return (SubLObject)NIL;
        }
        final SubLObject var5 = module0656.f39969(var2);
        final SubLObject var6 = reader.read_from_string_ignoring_errors(var3, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        if (NIL == var5) {
            return module0656.f39789((SubLObject)$ic6$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        $g5300$.setDynamicValue(var6);
        return f40910(var5);
    }
    
    public static SubLObject f40929(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0656.f39931(var6);
        final SubLObject var9 = (SubLObject)(($g5300$.getDynamicValue(var7) == $ic93$) ? $ic3$ : $ic93$);
        final SubLObject var10 = (SubLObject)(($g5300$.getDynamicValue(var7) == $ic93$) ? $ic122$ : $ic123$);
        final SubLObject var11 = (SubLObject)(($g5300$.getDynamicValue(var7) == $ic93$) ? $ic124$ : $ic125$);
        final SubLObject var12 = module0656.f39832((SubLObject)$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var7), (SubLObject)$ic126$, var8, var9);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var12) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var13 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)T, var7);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            final SubLObject var14 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var7), module0014.f683(var11));
            final SubLObject var15 = (SubLObject)$ic74$;
            final SubLObject var16 = module0014.f679(var11);
            final SubLObject var17 = (SubLObject)ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var14);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var16) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var16);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var15) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0642.f39049(var15));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            if (NIL != var17) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var17);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_76 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
            }
            finally {
                module0015.$g533$.rebind(var11_76, var7);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
            module0642.f39019(var10);
            module0642.f39020(module0015.$g231$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var13, var7);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f40930(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic129$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic129$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0656.f39957(var2, (SubLObject)UNPROVIDED);
        if (NIL == module0212.f13762(var4)) {
            return module0656.f39789((SubLObject)$ic130$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f40931(var4);
    }
    
    public static SubLObject f40932(SubLObject var6, SubLObject var7) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic132$;
        }
        final SubLObject var9 = module0656.f39932(var6);
        final SubLObject var10 = module0656.f39832((SubLObject)$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)$ic133$, var9);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var10) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var11, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40931(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)$ic135$;
        module0642.f39020((SubLObject)$ic18$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
        final SubLObject var9 = module0014.f672((SubLObject)$ic19$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var8);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g535$.currentBinding(var7);
        try {
            module0015.$g535$.bind((SubLObject)T, var7);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_81 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                final SubLObject var11 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var7));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var11) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var11);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_82 = module0015.$g533$.currentBinding(var7);
                final SubLObject var12 = module0015.$g541$.currentBinding(var7);
                final SubLObject var13 = module0015.$g539$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    module0015.$g541$.bind((SubLObject)T, var7);
                    module0015.$g539$.bind(module0015.f797(), var7);
                    module0642.f39069((SubLObject)$ic137$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    final SubLObject var14 = (SubLObject)FIVE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var14) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var14);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_83 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39021(var8);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_83, var7);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic138$);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0656.f39915(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39074((SubLObject)$ic139$, (SubLObject)$ic140$, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0642.f39073((SubLObject)$ic141$);
                    module0642.f39032((SubLObject)FOUR_INTEGER);
                    module0642.f39074((SubLObject)$ic142$, (SubLObject)$ic143$, (SubLObject)UNPROVIDED);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    final SubLObject var16;
                    final SubLObject var15 = var16 = $g5299$.getDynamicValue(var7);
                    final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic144$, var16);
                    final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
                    final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)$ic145$, var16);
                    final SubLObject var20 = (SubLObject)((NIL != var19) ? conses_high.cadr(var19) : NIL);
                    final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)$ic146$, var16);
                    final SubLObject var22 = (SubLObject)((NIL != var21) ? conses_high.cadr(var21) : NIL);
                    final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)$ic147$, var16);
                    final SubLObject var24 = (SubLObject)((NIL != var23) ? conses_high.cadr(var23) : NIL);
                    final SubLObject var25 = module0224.f14706(var6);
                    var7.resetMultipleValues();
                    SubLObject var26 = module0224.f14730(var25, $g5299$.getDynamicValue(var7));
                    SubLObject var27 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    var26 = conses_high.union(var18, var26, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                    var27 = conses_high.union(var22, var27, Symbols.symbol_function((SubLObject)EQ), (SubLObject)UNPROVIDED);
                    module0642.f39069((SubLObject)$ic65$, module0656.f39932(var6), (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_84 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_85 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_86 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                final SubLObject var28 = (SubLObject)FIVE_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var28) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var28);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_87 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var7);
                                    module0642.f39019((SubLObject)$ic148$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_87, var7);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                if (NIL != var20) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic149$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    SubLObject var29 = var20;
                                    SubLObject var30 = (SubLObject)NIL;
                                    var30 = var29.first();
                                    while (NIL != var29) {
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        f40933(var30);
                                        module0642.f39032((SubLObject)UNPROVIDED);
                                        module0656.f39915(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        var29 = var29.rest();
                                        var30 = var29.first();
                                    }
                                }
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic150$);
                                module0642.f39075((SubLObject)$ic151$, (SubLObject)$ic89$, (SubLObject)$ic152$);
                                module0642.f39032((SubLObject)ONE_INTEGER);
                                module0666.f40467((SubLObject)$ic151$, (SubLObject)$ic153$, $ic154$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_86, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_88 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39032((SubLObject)FOUR_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_88, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_89 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                final SubLObject var28 = (SubLObject)FIVE_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var28) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var28);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_90 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var7);
                                    module0642.f39019((SubLObject)$ic155$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_90, var7);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                if (NIL != var24) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic149$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    SubLObject var29 = var24;
                                    SubLObject var30 = (SubLObject)NIL;
                                    var30 = var29.first();
                                    while (NIL != var29) {
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        f40934(var30);
                                        module0642.f39032((SubLObject)UNPROVIDED);
                                        module0656.f39915(var30, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        var29 = var29.rest();
                                        var30 = var29.first();
                                    }
                                }
                                module0642.f39026((SubLObject)UNPROVIDED);
                                module0642.f39019((SubLObject)$ic150$);
                                module0642.f39075((SubLObject)$ic156$, (SubLObject)$ic89$, (SubLObject)$ic152$);
                                module0642.f39032((SubLObject)ONE_INTEGER);
                                module0666.f40467((SubLObject)$ic156$, (SubLObject)$ic153$, $ic154$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39026((SubLObject)TWO_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_89, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_85, var7);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_91 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var7);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_92 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                final SubLObject var28 = (SubLObject)FIVE_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var28) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var28);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_93 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var7);
                                    module0642.f39019((SubLObject)$ic157$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_93, var7);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                if (NIL == var26) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    final SubLObject var31 = (SubLObject)$ic158$;
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    if (NIL != var31) {
                                        module0642.f39020(module0015.$g222$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39042(var31));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_94 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var7);
                                        module0642.f39019((SubLObject)$ic159$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_94, var7);
                                    }
                                    module0642.f39020(module0015.$g220$.getGlobalValue());
                                }
                                if (NIL != var26) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic160$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    SubLObject var29 = var26;
                                    SubLObject var32 = (SubLObject)NIL;
                                    var32 = var29.first();
                                    while (NIL != var29) {
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        f40935(var32);
                                        module0642.f39032((SubLObject)UNPROVIDED);
                                        module0656.f39915(var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        var29 = var29.rest();
                                        var32 = var29.first();
                                    }
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var11_92, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_95 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                module0642.f39032((SubLObject)FOUR_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_95, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_96 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var7);
                                final SubLObject var28 = (SubLObject)FIVE_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (NIL != var28) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(var28);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_97 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var7);
                                    module0642.f39019((SubLObject)$ic161$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_97, var7);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                if (NIL == var27) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0642.f39019((SubLObject)$ic159$);
                                }
                                if (NIL != var27) {
                                    module0642.f39026((SubLObject)UNPROVIDED);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)$ic162$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    SubLObject var29 = var27;
                                    SubLObject var32 = (SubLObject)NIL;
                                    var32 = var29.first();
                                    while (NIL != var29) {
                                        module0642.f39026((SubLObject)UNPROVIDED);
                                        f40936(var32);
                                        module0642.f39032((SubLObject)UNPROVIDED);
                                        module0656.f39915(var32, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                        var29 = var29.rest();
                                        var32 = var29.first();
                                    }
                                }
                            }
                            finally {
                                module0015.$g533$.rebind(var11_96, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_91, var7);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_84, var7);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var7));
                }
                finally {
                    module0015.$g539$.rebind(var13, var7);
                    module0015.$g541$.rebind(var12, var7);
                    module0015.$g533$.rebind(var11_82, var7);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var11_81, var7);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var10, var7);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40933(final SubLObject var104) {
        return module0642.f39068(Sequences.cconcatenate((SubLObject)$ic163$, module0006.f203(module0656.f39932(var104))), (SubLObject)$ic164$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40934(final SubLObject var104) {
        return module0642.f39068(Sequences.cconcatenate((SubLObject)$ic165$, module0006.f203(module0656.f39932(var104))), (SubLObject)$ic164$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40935(final SubLObject var113) {
        return module0642.f39068(Sequences.cconcatenate((SubLObject)$ic166$, module0006.f203(module0656.f39932(var113))), (SubLObject)$ic164$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40936(final SubLObject var113) {
        return module0642.f39068(Sequences.cconcatenate((SubLObject)$ic167$, module0006.f203(module0656.f39932(var113))), (SubLObject)$ic164$, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40937(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)$ic65$, var1);
        final SubLObject var4 = module0656.f39957(var3, (SubLObject)UNPROVIDED);
        if (NIL != module0642.f39104((SubLObject)$ic143$, var1)) {
            f40938();
        }
        else {
            var2.resetMultipleValues();
            final SubLObject var5 = f40939(var1);
            final SubLObject var6 = var2.secondMultipleValue();
            final SubLObject var7 = var2.thirdMultipleValue();
            final SubLObject var8 = var2.fourthMultipleValue();
            final SubLObject var9 = var2.fifthMultipleValue();
            final SubLObject var10 = var2.sixthMultipleValue();
            var2.resetMultipleValues();
            f40940(var5, var6, var7, var8, var9, var10);
        }
        return f40931(var4);
    }
    
    public static SubLObject f40939(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        SubLObject var3 = (SubLObject)NIL;
        SubLObject var4 = (SubLObject)NIL;
        SubLObject var5 = (SubLObject)NIL;
        SubLObject var6 = (SubLObject)NIL;
        SubLObject var7 = (SubLObject)NIL;
        final SubLObject var8 = module0642.f39104((SubLObject)$ic151$, var1);
        if (NIL == module0038.f2608(var8)) {
            final SubLObject var9 = module0656.f39957(var8, (SubLObject)UNPROVIDED);
            if (NIL != var9) {
                var2 = var9;
            }
        }
        final SubLObject var10 = module0642.f39104((SubLObject)$ic156$, var1);
        if (NIL == module0038.f2608(var10)) {
            final SubLObject var11 = module0656.f39957(var10, (SubLObject)UNPROVIDED);
            if (NIL != var11) {
                var4 = var11;
            }
        }
        SubLObject var12 = var1;
        SubLObject var13 = (SubLObject)NIL;
        var13 = var12.first();
        while (NIL != var12) {
            if (var13.isCons()) {
                SubLObject var15;
                final SubLObject var14 = var15 = var13;
                SubLObject var16 = (SubLObject)NIL;
                SubLObject var17 = (SubLObject)NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic169$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)$ic169$);
                var17 = var15.first();
                var15 = var15.rest();
                if (NIL == var15) {
                    if (NIL != module0038.f2684(var16, (SubLObject)$ic166$)) {
                        final SubLObject var18 = module0038.f2623(var16, (SubLObject)SEVEN_INTEGER, (SubLObject)UNPROVIDED);
                        final SubLObject var20;
                        final SubLObject var19 = var20 = module0656.f39957(var18, (SubLObject)UNPROVIDED);
                        if (NIL != var20) {
                            var7 = (SubLObject)ConsesLow.cons(var20, var7);
                        }
                    }
                    else if (NIL != module0038.f2684(var16, (SubLObject)$ic167$)) {
                        final SubLObject var18 = module0038.f2623(var16, (SubLObject)SIX_INTEGER, (SubLObject)UNPROVIDED);
                        final SubLObject var20;
                        final SubLObject var19 = var20 = module0656.f39957(var18, (SubLObject)UNPROVIDED);
                        if (NIL != var20) {
                            var6 = (SubLObject)ConsesLow.cons(var20, var6);
                        }
                    }
                    else if (NIL != module0038.f2684(var16, (SubLObject)$ic165$)) {
                        final SubLObject var18 = module0038.f2623(var16, (SubLObject)NINETEEN_INTEGER, (SubLObject)UNPROVIDED);
                        final SubLObject var20;
                        final SubLObject var19 = var20 = module0656.f39957(var18, (SubLObject)UNPROVIDED);
                        if (NIL != var20) {
                            var5 = (SubLObject)ConsesLow.cons(var20, var5);
                        }
                    }
                    else if (NIL != module0038.f2684(var16, (SubLObject)$ic163$)) {
                        final SubLObject var18 = module0038.f2623(var16, (SubLObject)EIGHTEEN_INTEGER, (SubLObject)UNPROVIDED);
                        final SubLObject var20;
                        final SubLObject var19 = var20 = module0656.f39957(var18, (SubLObject)UNPROVIDED);
                        if (NIL != var20) {
                            var3 = (SubLObject)ConsesLow.cons(var20, var3);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)$ic169$);
                }
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return Values.values(var2, var3, var4, var5, var6, var7);
    }
    
    public static SubLObject f40938() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        $g5299$.setDynamicValue(Symbols.remprop((SubLObject)$ic145$, $g5299$.getDynamicValue(var9)), var9);
        $g5299$.setDynamicValue(Symbols.remprop((SubLObject)$ic147$, $g5299$.getDynamicValue(var9)), var9);
        $g5299$.setDynamicValue(Symbols.remprop((SubLObject)$ic144$, $g5299$.getDynamicValue(var9)), var9);
        $g5299$.setDynamicValue(Symbols.remprop((SubLObject)$ic146$, $g5299$.getDynamicValue(var9)), var9);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40940(final SubLObject var118, final SubLObject var119, final SubLObject var120, final SubLObject var121, final SubLObject var122, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        if (NIL != var118 || NIL != var119) {
            SubLObject var125 = conses_high.getf($g5299$.getDynamicValue(var124), (SubLObject)$ic145$, (SubLObject)NIL);
            if (NIL != var118 && NIL == conses_high.member(var118, var125, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var125 = (SubLObject)ConsesLow.cons(var118, var125);
            }
            SubLObject var126 = var119;
            SubLObject var127 = (SubLObject)NIL;
            var127 = var126.first();
            while (NIL != var126) {
                var125 = module0035.f2073(var127, var125, Symbols.symbol_function((SubLObject)EQ));
                var126 = var126.rest();
                var127 = var126.first();
            }
            $g5299$.setDynamicValue(conses_high.putf($g5299$.getDynamicValue(var124), (SubLObject)$ic145$, var125), var124);
        }
        if (NIL != var120 || NIL != var121) {
            SubLObject var125 = conses_high.getf($g5299$.getDynamicValue(var124), (SubLObject)$ic147$, (SubLObject)NIL);
            if (NIL != var120 && NIL == conses_high.member(var120, var125, Symbols.symbol_function((SubLObject)EQL), Symbols.symbol_function((SubLObject)IDENTITY))) {
                var125 = (SubLObject)ConsesLow.cons(var120, var125);
            }
            SubLObject var126 = var121;
            SubLObject var127 = (SubLObject)NIL;
            var127 = var126.first();
            while (NIL != var126) {
                var125 = module0035.f2073(var127, var125, Symbols.symbol_function((SubLObject)EQ));
                var126 = var126.rest();
                var127 = var126.first();
            }
            $g5299$.setDynamicValue(conses_high.putf($g5299$.getDynamicValue(var124), (SubLObject)$ic147$, var125), var124);
        }
        if (NIL != var122 || NIL != var123) {
            SubLObject var128 = conses_high.getf($g5299$.getDynamicValue(var124), (SubLObject)$ic144$, (SubLObject)NIL);
            SubLObject var129 = conses_high.getf($g5299$.getDynamicValue(var124), (SubLObject)$ic146$, (SubLObject)NIL);
            SubLObject var126 = var122;
            SubLObject var130 = (SubLObject)NIL;
            var130 = var126.first();
            while (NIL != var126) {
                var129 = module0035.f2073(var130, var129, Symbols.symbol_function((SubLObject)EQ));
                final SubLObject var131 = var130;
                if (NIL == conses_high.member(var131, var128, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var128 = (SubLObject)ConsesLow.cons(var131, var128);
                }
                var126 = var126.rest();
                var130 = var126.first();
            }
            var126 = var123;
            var130 = (SubLObject)NIL;
            var130 = var126.first();
            while (NIL != var126) {
                var128 = module0035.f2073(var130, var128, Symbols.symbol_function((SubLObject)EQ));
                final SubLObject var131 = var130;
                if (NIL == conses_high.member(var131, var129, Symbols.symbol_function((SubLObject)EQ), Symbols.symbol_function((SubLObject)IDENTITY))) {
                    var129 = (SubLObject)ConsesLow.cons(var131, var129);
                }
                var126 = var126.rest();
                var130 = var126.first();
            }
            $g5299$.setDynamicValue(conses_high.putf($g5299$.getDynamicValue(var124), (SubLObject)$ic144$, var128), var124);
            $g5299$.setDynamicValue(conses_high.putf($g5299$.getDynamicValue(var124), (SubLObject)$ic146$, var129), var124);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40941(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic129$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic129$);
            return (SubLObject)NIL;
        }
        final SubLObject var4 = module0656.f39957(var2, (SubLObject)UNPROVIDED);
        if (NIL == module0212.f13762(var4)) {
            return module0656.f39789((SubLObject)$ic130$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        return f40942(var4);
    }
    
    public static SubLObject f40943(SubLObject var6, SubLObject var7) {
        if (var6 == UNPROVIDED) {
            var6 = (SubLObject)NIL;
        }
        if (var7 == UNPROVIDED) {
            var7 = (SubLObject)NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (NIL == var7) {
            var7 = (SubLObject)$ic171$;
        }
        final SubLObject var9 = module0656.f39932(var6);
        final SubLObject var10 = module0656.f39832((SubLObject)$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)$ic172$, var9);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var10) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)T, var8);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var11, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40942(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)$ic174$;
        module0642.f39020((SubLObject)$ic18$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
        final SubLObject var9 = module0014.f672((SubLObject)$ic19$);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var9) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020((SubLObject)$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        module0642.f39029((SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var8);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        final SubLObject var10 = module0015.$g535$.currentBinding(var7);
        try {
            module0015.$g535$.bind((SubLObject)T, var7);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_139 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)T, var7);
                final SubLObject var11 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var7));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var11) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var11);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_140 = module0015.$g533$.currentBinding(var7);
                final SubLObject var12 = module0015.$g541$.currentBinding(var7);
                final SubLObject var13 = module0015.$g539$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)T, var7);
                    module0015.$g541$.bind((SubLObject)T, var7);
                    module0015.$g539$.bind(module0015.f797(), var7);
                    module0642.f39069((SubLObject)$ic175$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    final SubLObject var14 = (SubLObject)FIVE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var14) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var14);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_141 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39021(var8);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_141, var7);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic138$);
                    module0642.f39032((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0656.f39915(var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39074((SubLObject)$ic139$, (SubLObject)$ic140$, (SubLObject)UNPROVIDED);
                    module0642.f39032((SubLObject)TWO_INTEGER);
                    module0642.f39073((SubLObject)$ic141$);
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    final SubLObject var16;
                    final SubLObject var15 = var16 = $g5299$.getDynamicValue(var7);
                    final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)$ic176$, var16);
                    final SubLObject var18 = (SubLObject)((NIL != var17) ? conses_high.cadr(var17) : NIL);
                    final SubLObject var19 = module0224.f14708(var6);
                    module0642.f39069((SubLObject)$ic65$, module0656.f39932(var6), (SubLObject)UNPROVIDED);
                    final SubLObject var20 = (SubLObject)FIVE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_142 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var7);
                        module0642.f39019((SubLObject)$ic177$);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_142, var7);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39026((SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39020(module0015.$g224$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic178$);
                    module0642.f39020(module0015.$g225$.getGlobalValue());
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                    SubLObject var21 = (SubLObject)$ic179$;
                    SubLObject var22 = (SubLObject)NIL;
                    var22 = var21.first();
                    while (NIL != var21) {
                        module0642.f39026((SubLObject)UNPROVIDED);
                        f40944(var22, var18);
                        module0642.f39032((SubLObject)UNPROVIDED);
                        f40945(var22);
                        var21 = var21.rest();
                        var22 = var21.first();
                    }
                    module0642.f39026((SubLObject)TWO_INTEGER);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39020(module0015.$g224$.getGlobalValue());
                    module0642.f39019((SubLObject)$ic180$);
                    module0642.f39020(module0015.$g225$.getGlobalValue());
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                    var21 = var19;
                    var22 = (SubLObject)NIL;
                    var22 = var21.first();
                    while (NIL != var21) {
                        if (!var22.equal(var6)) {
                            module0642.f39026((SubLObject)UNPROVIDED);
                            f40944(var22, var18);
                            module0642.f39032((SubLObject)UNPROVIDED);
                            f40945(var22);
                        }
                        var21 = var21.rest();
                        var22 = var21.first();
                    }
                    module0015.f799(module0015.$g539$.getDynamicValue(var7));
                }
                finally {
                    module0015.$g539$.rebind(var13, var7);
                    module0015.$g541$.rebind(var12, var7);
                    module0015.$g533$.rebind(var11_140, var7);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var11_139, var7);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var10, var7);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40944(final SubLObject var42, final SubLObject var145) {
        final SubLObject var146 = (SubLObject)makeBoolean((NIL == var145 && var42 == $ic181$) || var42.eql(var145));
        final SubLObject var147 = (NIL != module0173.f10955(var42)) ? module0656.f39842(var42) : print_high.prin1_to_string(var42);
        return module0642.f39072((SubLObject)$ic182$, var147, var146, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40946(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)$ic65$, var1);
        final SubLObject var3 = module0656.f39957(var2, (SubLObject)UNPROVIDED);
        final SubLObject var4 = f40947(var1);
        f40948(var4);
        return f40942(var3);
    }
    
    public static SubLObject f40945(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if (var42.eql((SubLObject)$ic8$)) {
            module0642.f39019((SubLObject)$ic184$);
        }
        else if (var42.eql((SubLObject)$ic185$)) {
            module0642.f39019((SubLObject)$ic186$);
        }
        else if (var42.eql((SubLObject)$ic187$)) {
            module0642.f39019((SubLObject)$ic188$);
        }
        else if (var42.eql((SubLObject)$ic181$)) {
            module0642.f39019((SubLObject)$ic189$);
        }
        else {
            final SubLObject var45;
            final SubLObject var44 = var45 = module0656.f39799(var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var45) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var45);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var46 = module0015.$g533$.currentBinding(var43);
            try {
                module0015.$g533$.bind((SubLObject)T, var43);
                module0656.f39915(var42, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var46, var43);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40947(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)$ic182$, var1);
        final SubLObject var3 = module0656.f39943(var2, (SubLObject)UNPROVIDED);
        if (NIL != module0173.f10955(var3)) {
            return var3;
        }
        return reader.read_from_string_ignoring_errors(var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40948(SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (var145 == $ic181$) {
            var145 = (SubLObject)NIL;
        }
        $g5299$.setDynamicValue(conses_high.putf($g5299$.getDynamicValue(var146), (SubLObject)$ic176$, var145), var146);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40949(final SubLObject var6, final SubLObject var151, SubLObject var42, SubLObject var43, SubLObject var44) {
        if (var42 == UNPROVIDED) {
            var42 = (SubLObject)NIL;
        }
        if (var43 == UNPROVIDED) {
            var43 = (SubLObject)NIL;
        }
        if (var44 == UNPROVIDED) {
            var44 = (SubLObject)NIL;
        }
        final SubLThread var152 = SubLProcess.currentSubLThread();
        final SubLObject var153 = var151.isString() ? var151 : module0656.f39865(var151);
        final SubLObject var154 = module0656.f39799(var151, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        final SubLObject var155 = module0656.f39832((SubLObject)$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0655.f39768();
        if (NIL != var42 && NIL != var43 && NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var152), (SubLObject)$ic190$, new SubLObject[] { module0656.f39931(var6), module0656.f39931(var42), var43, module0656.f39931(var44) });
        }
        else if (NIL == var42 && NIL != var43 && NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var152), (SubLObject)$ic190$, new SubLObject[] { module0656.f39931(var6), NIL, var43, module0656.f39931(var44) });
        }
        else if (NIL != var42 && NIL == var43 && NIL == var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var152), (SubLObject)$ic191$, module0656.f39931(var6), module0656.f39931(var42));
        }
        else if (NIL == var42 && NIL == var43 && NIL == var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var152), (SubLObject)$ic192$, module0656.f39931(var6));
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        if (NIL != var155) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var155);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var156 = module0015.$g533$.currentBinding(var152);
        try {
            module0015.$g533$.bind((SubLObject)T, var152);
            final SubLObject var157 = var154;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (NIL != var157) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var157);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_153 = module0015.$g533$.currentBinding(var152);
            try {
                module0015.$g533$.bind((SubLObject)T, var152);
                module0642.f39019(var153);
            }
            finally {
                module0015.$g533$.rebind(var11_153, var152);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var156, var152);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var151;
    }
    
    public static SubLObject f40950(final SubLObject var1) {
        SubLObject var2 = (SubLObject)NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)$ic194$);
        var2 = var1.first();
        SubLObject var3 = var1.rest();
        final SubLObject var4 = (SubLObject)(var3.isCons() ? var3.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var3, var1, (SubLObject)$ic194$);
        var3 = var3.rest();
        final SubLObject var5 = (SubLObject)(var3.isCons() ? var3.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var3, var1, (SubLObject)$ic194$);
        var3 = var3.rest();
        final SubLObject var6 = (SubLObject)(var3.isCons() ? var3.first() : NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var3, var1, (SubLObject)$ic194$);
        var3 = var3.rest();
        if (NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)$ic194$);
            return (SubLObject)NIL;
        }
        SubLObject var7 = (SubLObject)NIL;
        SubLObject var8 = (SubLObject)NIL;
        SubLObject var9 = (SubLObject)NIL;
        SubLObject var10 = (SubLObject)NIL;
        var7 = module0656.f39969(var2);
        if (NIL == module0212.f13762(var7)) {
            return module0656.f39789((SubLObject)$ic195$, var2, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
        }
        if (NIL != var4 && !$ic196$.equal(var4)) {
            var8 = module0656.f39969(var4);
            if (NIL == module0212.f13762(var8)) {
                return module0656.f39789((SubLObject)$ic195$, var4, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        if (NIL != var5) {
            var9 = reader.read_from_string_ignoring_errors(var5, (SubLObject)NIL, (SubLObject)NIL, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (!var9.isInteger()) {
                return module0656.f39789((SubLObject)$ic197$, var5, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        if (NIL != var6) {
            var10 = module0656.f39943(var6, (SubLObject)UNPROVIDED);
            if (NIL == module0173.f10955(var10)) {
                return module0656.f39789((SubLObject)$ic195$, var6, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            }
        }
        return f40951(var7, var8, var9, var10);
    }
    
    public static SubLObject f40951(final SubLObject var6, final SubLObject var42, final SubLObject var43, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        final SubLObject var115 = $g5299$.getDynamicValue(var114);
        final SubLObject var116 = $g5298$.getDynamicValue(var114);
        final SubLObject var117 = module0224.f14703(var6, var115, var116);
        final SubLObject var118 = f40952(var117, var42, var43, var113);
        final SubLObject var119 = module0224.f14707(var6, var118, var116);
        final SubLObject var121;
        final SubLObject var120 = var121 = PrintLow.format((SubLObject)NIL, (SubLObject)$ic199$, var6);
        final SubLObject var122 = module0015.$g538$.currentBinding(var114);
        try {
            module0015.$g538$.bind((NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var114))) ? module0015.$g538$.getDynamicValue(var114) : module0057.f4173((SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED), var114);
            module0642.f39020((SubLObject)$ic18$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var114), module0655.$g5142$.getDynamicValue(var114));
            final SubLObject var123 = module0014.f672((SubLObject)$ic19$);
            module0642.f39029((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic20$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var123) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var123);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            if (NIL != var121) {
                module0642.f39029((SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g173$.getGlobalValue());
                module0642.f39019(var121);
                module0642.f39020(module0015.$g174$.getGlobalValue());
            }
            module0016.f941();
            module0666.f40471();
            module0666.f40487();
            module0666.f40535();
            module0016.f892();
            module0016.f895();
            module0642.f39020(module0015.$g154$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            final SubLObject var11_163 = module0015.$g535$.currentBinding(var114);
            try {
                module0015.$g535$.bind((SubLObject)T, var114);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (NIL != module0015.$g132$.getDynamicValue(var114)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var114)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic200$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_164 = module0015.$g533$.currentBinding(var114);
                try {
                    module0015.$g533$.bind((SubLObject)T, var114);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020((SubLObject)$ic201$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_165 = module0015.$g533$.currentBinding(var114);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var114);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic202$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic203$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39019((SubLObject)$ic204$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020((SubLObject)$ic205$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_165, var114);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0669.f40720(var6);
                    f40953(var6, (SubLObject)UNPROVIDED);
                    final SubLObject var124 = var116;
                    if (var124.eql((SubLObject)$ic0$)) {
                        f40954(var6, var119);
                    }
                    else if (var124.eql((SubLObject)$ic78$)) {
                        f40955(var6, var119);
                    }
                    else {
                        module0656.f39789((SubLObject)$ic88$, var116, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                    }
                    module0642.f39029((SubLObject)UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var11_164, var114);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var11_163, var114);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var122, var114);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40954(final SubLObject var6, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0669.$g5286$.currentBinding(var31);
        final SubLObject var33 = module0669.$g5287$.currentBinding(var31);
        try {
            module0669.$g5286$.bind((SubLObject)NIL, var31);
            module0669.$g5287$.bind((SubLObject)NIL, var31);
            SubLObject var34 = (SubLObject)NIL;
            SubLObject var35 = (SubLObject)NIL;
            SubLObject var36 = (SubLObject)NIL;
            var34 = var30;
            var35 = var34.first();
            for (var36 = (SubLObject)ZERO_INTEGER; NIL != var34; var34 = var34.rest(), var35 = var34.first(), var36 = Numbers.add((SubLObject)ONE_INTEGER, var36)) {
                if (!var36.isZero()) {
                    module0642.f39026((SubLObject)UNPROVIDED);
                }
                final SubLObject var37 = var35.first();
                final SubLObject var38 = var37.first();
                final SubLObject var39 = conses_high.second(var37);
                f40956(var38, var6, var39);
                module0642.f39026((SubLObject)TWO_INTEGER);
                SubLObject var40 = var35;
                SubLObject var41 = (SubLObject)NIL;
                var41 = var40.first();
                while (NIL != var40) {
                    SubLObject var43;
                    final SubLObject var42 = var43 = var41;
                    SubLObject var41_170 = (SubLObject)NIL;
                    SubLObject var44 = (SubLObject)NIL;
                    SubLObject var45 = (SubLObject)NIL;
                    SubLObject var46 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic94$);
                    var41_170 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic94$);
                    var44 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic94$);
                    var45 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)$ic94$);
                    var46 = var43.first();
                    var43 = var43.rest();
                    if (NIL == var43) {
                        f40957(var6, var41_170, var44, var45, var46);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)$ic94$);
                    }
                    var40 = var40.rest();
                    var41 = var40.first();
                }
            }
        }
        finally {
            module0669.$g5287$.rebind(var33, var31);
            module0669.$g5286$.rebind(var32, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40955(final SubLObject var6, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0669.$g5286$.currentBinding(var31);
        final SubLObject var33 = module0669.$g5287$.currentBinding(var31);
        try {
            module0669.$g5286$.bind((SubLObject)NIL, var31);
            module0669.$g5287$.bind((SubLObject)NIL, var31);
            final SubLObject var34 = conses_high.getf($g5299$.getDynamicValue(var31), (SubLObject)$ic176$, (SubLObject)UNPROVIDED);
            SubLObject var35 = (SubLObject)NIL;
            SubLObject var36 = (SubLObject)NIL;
            SubLObject var37 = (SubLObject)NIL;
            var35 = var30;
            var36 = var35.first();
            for (var37 = (SubLObject)ZERO_INTEGER; NIL != var35; var35 = var35.rest(), var36 = var35.first(), var37 = Numbers.add((SubLObject)ONE_INTEGER, var37)) {
                SubLObject var38 = (SubLObject)NIL;
                SubLObject var166_172 = (SubLObject)NIL;
                SubLObject var39 = (SubLObject)NIL;
                SubLObject var40 = (SubLObject)NIL;
                var166_172 = var36;
                var39 = var166_172.first();
                for (var40 = (SubLObject)ZERO_INTEGER; NIL != var166_172; var166_172 = var166_172.rest(), var39 = var166_172.first(), var40 = Numbers.add((SubLObject)ONE_INTEGER, var40)) {
                    SubLObject var42;
                    final SubLObject var41 = var42 = var39;
                    SubLObject var43 = (SubLObject)NIL;
                    SubLObject var44 = (SubLObject)NIL;
                    SubLObject var45 = (SubLObject)NIL;
                    SubLObject var46 = (SubLObject)NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic94$);
                    var43 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic94$);
                    var44 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic94$);
                    var45 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)$ic94$);
                    var46 = var42.first();
                    var42 = var42.rest();
                    if (NIL == var42) {
                        if (!var44.equal(var38)) {
                            if (!var37.isZero() || !var40.isZero()) {
                                module0642.f39026((SubLObject)UNPROVIDED);
                            }
                            if ($ic8$ != var34) {
                                f40956(var43, var6, var44);
                                module0642.f39026((SubLObject)UNPROVIDED);
                            }
                        }
                        f40957(var6, var43, var44, var45, var46);
                        var38 = var44;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)$ic94$);
                    }
                }
            }
        }
        finally {
            module0669.$g5287$.rebind(var33, var31);
            module0669.$g5286$.rebind(var32, var31);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40957(final SubLObject var6, final SubLObject var41, final SubLObject var42, final SubLObject var43, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (var41.eql((SubLObject)$ic206$)) {
            module0656.f39915(var44, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            if (!var43.numE((SubLObject)ONE_INTEGER)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var45), (SubLObject)$ic95$, var43);
            }
            module0642.f39019((SubLObject)$ic207$);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0656.f39837((SubLObject)$ic96$, var6, var43, var44, $ic97$, (SubLObject)UNPROVIDED);
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        else {
            module0669.f40741(var42, var43, var44, (SubLObject)NIL);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40958(final SubLObject var113) {
        return module0035.f2294($g5301$.getGlobalValue(), var113, Symbols.symbol_function((SubLObject)EQUAL), (SubLObject)$ic209$);
    }
    
    public static SubLObject f40956(SubLObject var41, final SubLObject var6, final SubLObject var42) {
        final SubLObject var43 = (SubLObject)(var41.eql($ic210$) ? $ic211$ : $ic90$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(var43);
        module0642.f39032((SubLObject)UNPROVIDED);
        if (var41.eql($ic210$)) {
            module0642.f39019((SubLObject)$ic212$);
        }
        else {
            module0656.f39915(var42, (SubLObject)ZERO_INTEGER, (SubLObject)NIL);
        }
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (!var41.eql($ic210$)) {
            if (var41 == $ic206$) {
                var41 = $ic213$;
            }
            final SubLObject var44 = module0202.f12768(var41, var6, var42);
            final SubLObject var45 = f40958(var41);
            final SubLObject var46 = module0191.f11990(var45, var44, $ic97$, (SubLObject)UNPROVIDED);
            module0642.f39032((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g238$.getGlobalValue());
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)$ic214$, var46, (SubLObject)$ic215$, (SubLObject)$ic216$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g239$.getGlobalValue());
            return var46;
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40952(final SubLObject var29, SubLObject var180, SubLObject var181, SubLObject var182) {
        if (var180 == UNPROVIDED) {
            var180 = (SubLObject)NIL;
        }
        if (var181 == UNPROVIDED) {
            var181 = (SubLObject)NIL;
        }
        if (var182 == UNPROVIDED) {
            var182 = (SubLObject)NIL;
        }
        if (NIL == var180 && NIL == var181 && NIL == var182) {
            return var29;
        }
        SubLObject var183 = (SubLObject)NIL;
        SubLObject var184 = var29;
        SubLObject var185 = (SubLObject)NIL;
        var185 = var184.first();
        while (NIL != var184) {
            SubLObject var187;
            final SubLObject var186 = var187 = var185;
            SubLObject var188 = (SubLObject)NIL;
            SubLObject var189 = (SubLObject)NIL;
            SubLObject var190 = (SubLObject)NIL;
            SubLObject var191 = (SubLObject)NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)$ic94$);
            var188 = var187.first();
            var187 = var187.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)$ic94$);
            var189 = var187.first();
            var187 = var187.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)$ic94$);
            var190 = var187.first();
            var187 = var187.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)$ic94$);
            var191 = var187.first();
            var187 = var187.rest();
            if (NIL == var187) {
                if ((NIL == var180 || var189.equal(var180)) && (NIL == var181 || var190.equal(var181)) && (NIL == var182 || var191.equal(var182))) {
                    var183 = (SubLObject)ConsesLow.cons(var185, var183);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var186, (SubLObject)$ic94$);
            }
            var184 = var184.rest();
            var185 = var184.first();
        }
        return Sequences.nreverse(var183);
    }
    
    public static SubLObject f40959(final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        final SubLObject var152 = $g5299$.currentBinding(var151);
        try {
            $g5299$.bind(f40960($g5299$.getDynamicValue(var151), var150), var151);
            f40951(var150, var150, (SubLObject)NIL, (SubLObject)NIL);
        }
        finally {
            $g5299$.rebind(var152, var151);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40960(SubLObject var15, final SubLObject var150) {
        var15 = conses_high.copy_list(var15);
        final SubLObject var151 = module0656.f39825(var150);
        var15 = conses_high.putf(var15, (SubLObject)$ic144$, var151);
        var15 = conses_high.putf(var15, (SubLObject)$ic145$, (SubLObject)NIL);
        var15 = conses_high.putf(var15, (SubLObject)$ic146$, (SubLObject)NIL);
        var15 = conses_high.putf(var15, (SubLObject)$ic147$, (SubLObject)$ic217$);
        return var15;
    }
    
    public static SubLObject f40953(final SubLObject var6, SubLObject var187) {
        if (var187 == UNPROVIDED) {
            var187 = (SubLObject)NIL;
        }
        f40961(var6, (SubLObject)FIVE_INTEGER);
        if (NIL != module0173.f10955(var6)) {
            module0642.f39032((SubLObject)UNPROVIDED);
            module0642.f39020(module0015.$g238$.getGlobalValue());
            module0642.f39020(module0015.$g240$.getGlobalValue());
            f40962((SubLObject)$ic222$, (SubLObject)$ic223$, (SubLObject)$ic224$);
            module0642.f39020(module0015.$g241$.getGlobalValue());
            module0642.f39020(module0015.$g239$.getGlobalValue());
            module0642.f39026((SubLObject)TWO_INTEGER);
            f40963(var6, var187);
        }
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40961(final SubLObject var6, SubLObject var188) {
        if (var188 == UNPROVIDED) {
            var188 = (SubLObject)FIVE_INTEGER;
        }
        final SubLThread var189 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        final SubLObject var190 = var188;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var190) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var190);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var191 = module0015.$g533$.currentBinding(var189);
        try {
            module0015.$g533$.bind((SubLObject)T, var189);
            module0669.f40783(var6);
            module0642.f39019((SubLObject)$ic225$);
        }
        finally {
            module0015.$g533$.rebind(var191, var189);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (NIL != module0167.f10813(var6)) {
            module0642.f39026((SubLObject)UNPROVIDED);
        }
        final SubLObject var192 = module0656.f39799(var6, var188, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        final SubLObject var193 = var192;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (NIL != var193) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var193);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var194 = module0015.$g533$.currentBinding(var189);
        try {
            module0015.$g533$.bind((SubLObject)T, var189);
            module0656.f39915(var6, (SubLObject)ZERO_INTEGER, (SubLObject)T);
        }
        finally {
            module0015.$g533$.rebind(var194, var189);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f40962(SubLObject var129, SubLObject var189, SubLObject var190) {
        if (var129 == UNPROVIDED) {
            var129 = (SubLObject)$ic222$;
        }
        if (var189 == UNPROVIDED) {
            var189 = (SubLObject)$ic223$;
        }
        if (var190 == UNPROVIDED) {
            var190 = (SubLObject)$ic224$;
        }
        module0016.f920(var129, var189, var190);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40963(final SubLObject var150, SubLObject var191) {
        if (var191 == UNPROVIDED) {
            var191 = (SubLObject)NIL;
        }
        final SubLThread var192 = SubLProcess.currentSubLThread();
        final SubLObject var194;
        final SubLObject var193 = var194 = var191;
        SubLObject var195 = (SubLObject)NIL;
        SubLObject var196 = var194;
        SubLObject var197 = (SubLObject)NIL;
        SubLObject var197_198 = (SubLObject)NIL;
        while (NIL != var196) {
            cdestructuring_bind.destructuring_bind_must_consp(var196, var193, (SubLObject)$ic226$);
            var197_198 = var196.first();
            var196 = var196.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var196, var193, (SubLObject)$ic226$);
            if (NIL == conses_high.member(var197_198, (SubLObject)$ic227$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED)) {
                var197 = (SubLObject)T;
            }
            if (var197_198 == $ic228$) {
                var195 = var196.first();
            }
            var196 = var196.rest();
        }
        if (NIL != var197 && NIL == var195) {
            cdestructuring_bind.cdestructuring_bind_error(var193, (SubLObject)$ic226$);
        }
        final SubLObject var198 = cdestructuring_bind.property_list_member((SubLObject)$ic229$, var194);
        final SubLObject var199 = (SubLObject)((NIL != var198) ? conses_high.cadr(var198) : $ic222$);
        final SubLObject var200 = cdestructuring_bind.property_list_member((SubLObject)$ic230$, var194);
        final SubLObject var201 = (SubLObject)((NIL != var200) ? conses_high.cadr(var200) : NIL);
        final SubLObject var202 = cdestructuring_bind.property_list_member((SubLObject)$ic231$, var194);
        final SubLObject var203 = (SubLObject)((NIL != var202) ? conses_high.cadr(var202) : NIL);
        final SubLObject var204 = (SubLObject)$ic232$;
        module0016.f908(var199, (SubLObject)$ic3$, (SubLObject)$ic233$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (NIL != var199) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var199);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var205 = module0015.$g533$.currentBinding(var192);
        try {
            module0015.$g533$.bind((SubLObject)T, var192);
            module0016.f908((SubLObject)$ic234$, (SubLObject)$ic3$, (SubLObject)$ic233$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic234$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_203 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)T, var192);
                final SubLObject var206 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var206) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var206);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_204 = module0015.$g533$.currentBinding(var192);
                final SubLObject var207 = module0015.$g541$.currentBinding(var192);
                final SubLObject var208 = module0015.$g539$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)T, var192);
                    module0015.$g541$.bind((SubLObject)T, var192);
                    module0015.$g539$.bind(module0015.f797(), var192);
                    module0642.f39069((SubLObject)$ic235$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0642.f39069((SubLObject)$ic236$, module0656.f39842(var150), (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_205 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var192);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_206 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_207 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_208 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_209 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_210 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)$ic237$, (SubLObject)$ic238$, $ic239$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_210, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_211 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_211, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_212 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)$ic240$, (SubLObject)$ic234$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var11_213 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var192);
                                                module0642.f39019((SubLObject)$ic241$);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var11_213, var192);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_212, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_209, var192);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_208, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g372$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)$ic242$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_214 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39074((SubLObject)$ic243$, (SubLObject)$ic234$, (SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_214, var192);
                                }
                                module0642.f39020(module0015.$g361$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_207, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_206, var192);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_215 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_216 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list(new SubLObject[] { $ic244$, $ic237$, $ic245$, $ic239$, $ic246$, NIL, $ic247$, NIL, $ic248$, var204 }));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_216, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_215, var192);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_205, var192);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var192));
                }
                finally {
                    module0015.$g539$.rebind(var208, var192);
                    module0015.$g541$.rebind(var207, var192);
                    module0015.$g533$.rebind(var11_204, var192);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var11_203, var192);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0016.f908((SubLObject)$ic240$, (SubLObject)$ic93$, (SubLObject)$ic233$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic240$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_217 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)T, var192);
                final SubLObject var206 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var206) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var206);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_218 = module0015.$g533$.currentBinding(var192);
                final SubLObject var207 = module0015.$g541$.currentBinding(var192);
                final SubLObject var208 = module0015.$g539$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)T, var192);
                    module0015.$g541$.bind((SubLObject)T, var192);
                    module0015.$g539$.bind(module0015.f797(), var192);
                    module0642.f39069((SubLObject)$ic235$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0642.f39069((SubLObject)$ic236$, module0656.f39842(var150), (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_219 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var192);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_220 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_221 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_222 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_223 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_224 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)$ic249$, (SubLObject)$ic250$, $ic251$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_224, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_225 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)$ic252$, (SubLObject)$ic240$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var11_226 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var192);
                                                module0642.f39019((SubLObject)$ic253$);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var11_226, var192);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_225, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_223, var192);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_222, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_221, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_227 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_228 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_229 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_230 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0666.f40468((SubLObject)$ic254$, (SubLObject)$ic255$, $ic256$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_230, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_231 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)$ic234$, (SubLObject)$ic240$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var11_232 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var192);
                                                final SubLObject var209 = module0014.f697((SubLObject)$ic218$);
                                                final SubLObject var210 = (SubLObject)$ic74$;
                                                final SubLObject var211 = module0014.f694((SubLObject)$ic218$);
                                                final SubLObject var212 = (SubLObject)ZERO_INTEGER;
                                                module0642.f39020(module0015.$g431$.getGlobalValue());
                                                module0642.f39020(module0015.$g440$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39020(var209);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                if (NIL != var211) {
                                                    module0642.f39020(module0015.$g437$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(var211);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                if (NIL != var210) {
                                                    module0642.f39020(module0015.$g438$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(module0642.f39049(var210));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                if (NIL != var212) {
                                                    module0642.f39020(module0015.$g439$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(var212);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var11_233 = module0015.$g533$.currentBinding(var192);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var192);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var11_233, var192);
                                                }
                                                module0642.f39020(module0015.$g432$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var11_232, var192);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_231, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_234 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)$ic257$, (SubLObject)$ic240$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var11_235 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var192);
                                                module0642.f39019((SubLObject)$ic258$);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var11_235, var192);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_234, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_229, var192);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_228, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_227, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g372$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic242$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_236 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39074((SubLObject)$ic243$, (SubLObject)$ic240$, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_236, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_220, var192);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_237 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_238 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list(new SubLObject[] { $ic244$, $ic249$, $ic245$, $ic251$, $ic246$, NIL, $ic247$, NIL, $ic248$, var204 }));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_238, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_239 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)$ic254$, (SubLObject)$ic246$, (SubLObject)NIL, (SubLObject)$ic247$, (SubLObject)NIL, (SubLObject)$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_239, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_237, var192);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_219, var192);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var192));
                }
                finally {
                    module0015.$g539$.rebind(var208, var192);
                    module0015.$g541$.rebind(var207, var192);
                    module0015.$g533$.rebind(var11_218, var192);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var11_217, var192);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0016.f908((SubLObject)$ic252$, (SubLObject)$ic3$, (SubLObject)$ic233$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic252$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_240 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)T, var192);
                final SubLObject var206 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var206) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var206);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_241 = module0015.$g533$.currentBinding(var192);
                final SubLObject var207 = module0015.$g541$.currentBinding(var192);
                final SubLObject var208 = module0015.$g539$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)T, var192);
                    module0015.$g541$.bind((SubLObject)T, var192);
                    module0015.$g539$.bind(module0015.f797(), var192);
                    module0642.f39069((SubLObject)$ic235$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_242 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var192);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_243 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_244 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_245 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_246 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_247 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)$ic259$, (SubLObject)$ic250$, $ic251$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_247, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_248 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_248, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_246, var192);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_245, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_244, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_249 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_250 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_251 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_252 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0666.f40468((SubLObject)$ic260$, (SubLObject)$ic261$, $ic256$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_252, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_253 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)$ic240$, (SubLObject)$ic252$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var11_254 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var192);
                                                final SubLObject var209 = module0014.f697((SubLObject)$ic218$);
                                                final SubLObject var210 = (SubLObject)$ic74$;
                                                final SubLObject var211 = module0014.f694((SubLObject)$ic218$);
                                                final SubLObject var212 = (SubLObject)ZERO_INTEGER;
                                                module0642.f39020(module0015.$g431$.getGlobalValue());
                                                module0642.f39020(module0015.$g440$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39020(var209);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                if (NIL != var211) {
                                                    module0642.f39020(module0015.$g437$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(var211);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                if (NIL != var210) {
                                                    module0642.f39020(module0015.$g438$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(module0642.f39049(var210));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                if (NIL != var212) {
                                                    module0642.f39020(module0015.$g439$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(var212);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var11_255 = module0015.$g533$.currentBinding(var192);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var192);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var11_255, var192);
                                                }
                                                module0642.f39020(module0015.$g432$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var11_254, var192);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_253, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_251, var192);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_250, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_249, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_256 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_257 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_258 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_259 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)$ic262$, (SubLObject)$ic255$, $ic256$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_259, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_260 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)$ic257$, (SubLObject)$ic252$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var11_261 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var192);
                                                module0642.f39019((SubLObject)$ic258$);
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var11_261, var192);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_260, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_258, var192);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_257, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_256, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g372$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic242$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_262 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39074((SubLObject)$ic243$, (SubLObject)$ic252$, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_262, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_243, var192);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_263 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_264 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list(new SubLObject[] { $ic244$, $ic259$, $ic245$, $ic251$, $ic246$, NIL, $ic247$, NIL, $ic248$, var204 }));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_264, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_265 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)$ic260$, (SubLObject)$ic246$, (SubLObject)NIL, (SubLObject)$ic247$, (SubLObject)NIL, (SubLObject)$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_265, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_266 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)$ic262$, (SubLObject)$ic246$, (SubLObject)NIL, (SubLObject)$ic247$, (SubLObject)NIL, (SubLObject)$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_266, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_263, var192);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_242, var192);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var192));
                }
                finally {
                    module0015.$g539$.rebind(var208, var192);
                    module0015.$g541$.rebind(var207, var192);
                    module0015.$g533$.rebind(var11_241, var192);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var11_240, var192);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
            module0016.f908((SubLObject)$ic257$, (SubLObject)$ic3$, (SubLObject)$ic233$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)$ic257$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_267 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)T, var192);
                final SubLObject var206 = module0656.f39832((SubLObject)NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020((SubLObject)$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                if (NIL != var206) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                    module0642.f39020(var206);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                final SubLObject var11_268 = module0015.$g533$.currentBinding(var192);
                final SubLObject var207 = module0015.$g541$.currentBinding(var192);
                final SubLObject var208 = module0015.$g539$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)T, var192);
                    module0015.$g541$.bind((SubLObject)T, var192);
                    module0015.$g539$.bind(module0015.f797(), var192);
                    module0642.f39069((SubLObject)$ic235$, (SubLObject)T, (SubLObject)UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                    final SubLObject var11_269 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)T, var192);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_270 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_271 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_272 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_273 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_274 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)$ic263$, (SubLObject)$ic264$, $ic265$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_274, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_275 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_275, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_273, var192);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_272, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_271, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_276 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g224$.getGlobalValue());
                                module0642.f39020(module0015.$g230$.getGlobalValue());
                                module0666.f40468((SubLObject)$ic266$, (SubLObject)$ic261$, $ic256$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g231$.getGlobalValue());
                                module0642.f39020(module0015.$g225$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_276, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_277 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g224$.getGlobalValue());
                                module0642.f39020(module0015.$g230$.getGlobalValue());
                                module0666.f40468((SubLObject)$ic267$, (SubLObject)$ic255$, $ic256$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                module0642.f39020(module0015.$g231$.getGlobalValue());
                                module0642.f39020(module0015.$g225$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_277, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_278 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39020((SubLObject)$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                final SubLObject var11_279 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                    final SubLObject var11_280 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_281 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0666.f40468((SubLObject)$ic268$, (SubLObject)$ic269$, $ic256$, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_281, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020((SubLObject)$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_282 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)$ic252$, (SubLObject)$ic257$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                            final SubLObject var11_283 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)T, var192);
                                                final SubLObject var209 = module0014.f697((SubLObject)$ic218$);
                                                final SubLObject var210 = (SubLObject)$ic74$;
                                                final SubLObject var211 = module0014.f694((SubLObject)$ic218$);
                                                final SubLObject var212 = (SubLObject)ZERO_INTEGER;
                                                module0642.f39020(module0015.$g431$.getGlobalValue());
                                                module0642.f39020(module0015.$g440$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                module0642.f39020(var209);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                if (NIL != var211) {
                                                    module0642.f39020(module0015.$g437$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(var211);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                if (NIL != var210) {
                                                    module0642.f39020(module0015.$g438$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(module0642.f39049(var210));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                if (NIL != var212) {
                                                    module0642.f39020(module0015.$g439$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                    module0642.f39020(var212);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                                final SubLObject var11_284 = module0015.$g533$.currentBinding(var192);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)T, var192);
                                                }
                                                finally {
                                                    module0015.$g533$.rebind(var11_284, var192);
                                                }
                                                module0642.f39020(module0015.$g432$.getGlobalValue());
                                            }
                                            finally {
                                                module0015.$g533$.rebind(var11_283, var192);
                                            }
                                            module0642.f39020(module0015.$g382$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_282, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                                        final SubLObject var11_285 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39019((SubLObject)$ic270$);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_285, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_280, var192);
                                    }
                                    module0642.f39020(module0015.$g365$.getGlobalValue());
                                    module0642.f39029((SubLObject)UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_279, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_278, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g372$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020((SubLObject)TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic242$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_286 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0642.f39074((SubLObject)$ic243$, (SubLObject)$ic257$, (SubLObject)UNPROVIDED);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_286, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_270, var192);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)$ic74$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                        final SubLObject var11_287 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_288 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list(new SubLObject[] { $ic244$, $ic263$, $ic245$, $ic265$, $ic246$, NIL, $ic247$, NIL, $ic248$, var204 }));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_288, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_289 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)$ic266$, (SubLObject)$ic246$, (SubLObject)NIL, (SubLObject)$ic247$, (SubLObject)NIL, (SubLObject)$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_289, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_290 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)$ic267$, (SubLObject)$ic246$, (SubLObject)NIL, (SubLObject)$ic247$, (SubLObject)NIL, (SubLObject)$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_290, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
                            final SubLObject var11_291 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)T, var192);
                                module0657.f40033((SubLObject)NIL, (SubLObject)ConsesLow.list((SubLObject)$ic244$, (SubLObject)$ic268$, (SubLObject)$ic246$, (SubLObject)NIL, (SubLObject)$ic247$, (SubLObject)NIL, (SubLObject)$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_291, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                        }
                        finally {
                            module0015.$g533$.rebind(var11_287, var192);
                        }
                        module0642.f39020(module0015.$g365$.getGlobalValue());
                        module0642.f39029((SubLObject)UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_269, var192);
                    }
                    module0642.f39020(module0015.$g347$.getGlobalValue());
                    module0015.f799(module0015.$g539$.getDynamicValue(var192));
                }
                finally {
                    module0015.$g539$.rebind(var208, var192);
                    module0015.$g541$.rebind(var207, var192);
                    module0015.$g533$.rebind(var11_268, var192);
                }
                module0642.f39020(module0015.$g283$.getGlobalValue());
            }
            finally {
                module0015.$g533$.rebind(var11_267, var192);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var205, var192);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)UNPROVIDED);
        return var150;
    }
    
    public static SubLObject f40964(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f40965(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        if (NIL != var4) {
            return f40966(var4);
        }
        return module0674.f41188((SubLObject)$ic271$, (SubLObject)NIL, var3, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40965(final SubLObject var1) {
        if (NIL != module0642.f39104((SubLObject)$ic234$, var1)) {
            final SubLObject var2 = module0656.f39957(module0642.f39104((SubLObject)$ic237$, var1), (SubLObject)UNPROVIDED);
            final SubLObject var3 = module0656.f39957(module0642.f39104((SubLObject)$ic236$, var1), (SubLObject)UNPROVIDED);
            if (NIL == var2) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic237$, var1)), (SubLObject)$ic273$));
            }
            if (NIL == var3) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic236$, var1)), (SubLObject)$ic273$));
            }
            final SubLObject var4 = module0202.f12643(var2, var3);
            return Values.values(var4, (SubLObject)NIL);
        }
        else if (NIL != module0642.f39104((SubLObject)$ic240$, var1)) {
            final SubLObject var2 = module0656.f39957(module0642.f39104((SubLObject)$ic249$, var1), (SubLObject)UNPROVIDED);
            final SubLObject var3 = module0656.f39957(module0642.f39104((SubLObject)$ic236$, var1), (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0656.f39957(module0642.f39104((SubLObject)$ic254$, var1), (SubLObject)UNPROVIDED);
            if (NIL == var2) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic249$, var1)), (SubLObject)$ic273$));
            }
            if (NIL == var3) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic236$, var1)), (SubLObject)$ic273$));
            }
            if (NIL == var5) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic254$, var1)), (SubLObject)$ic273$));
            }
            final SubLObject var6 = module0202.f12768(var2, var3, var5);
            return Values.values(var6, (SubLObject)NIL);
        }
        else if (NIL != module0642.f39104((SubLObject)$ic252$, var1)) {
            final SubLObject var2 = module0656.f39957(module0642.f39104((SubLObject)$ic259$, var1), (SubLObject)UNPROVIDED);
            final SubLObject var3 = module0656.f39957(module0642.f39104((SubLObject)$ic260$, var1), (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0656.f39957(module0642.f39104((SubLObject)$ic262$, var1), (SubLObject)UNPROVIDED);
            if (NIL == var2) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic259$, var1)), (SubLObject)$ic273$));
            }
            if (NIL == var3) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic260$, var1)), (SubLObject)$ic273$));
            }
            if (NIL == var5) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic262$, var1)), (SubLObject)$ic273$));
            }
            final SubLObject var6 = module0202.f12768(var2, var3, var5);
            return Values.values(var6, (SubLObject)NIL);
        }
        else {
            if (NIL == module0642.f39104((SubLObject)$ic257$, var1)) {
                return Values.values((SubLObject)NIL, (SubLObject)$ic274$);
            }
            final SubLObject var2 = module0656.f39957(module0642.f39104((SubLObject)$ic263$, var1), (SubLObject)UNPROVIDED);
            final SubLObject var3 = module0656.f39957(module0642.f39104((SubLObject)$ic266$, var1), (SubLObject)UNPROVIDED);
            final SubLObject var5 = module0656.f39957(module0642.f39104((SubLObject)$ic267$, var1), (SubLObject)UNPROVIDED);
            final SubLObject var7 = module0656.f39957(module0642.f39104((SubLObject)$ic268$, var1), (SubLObject)UNPROVIDED);
            if (NIL == var2) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic263$, var1)), (SubLObject)$ic273$));
            }
            if (NIL == var3) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic266$, var1)), (SubLObject)$ic273$));
            }
            if (NIL == var5) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic267$, var1)), (SubLObject)$ic273$));
            }
            if (NIL == var7) {
                return Values.values((SubLObject)NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)$ic268$, var1)), (SubLObject)$ic273$));
            }
            final SubLObject var8 = module0202.f12769(var2, var3, var5, var7);
            return Values.values(var8, (SubLObject)NIL);
        }
    }
    
    public static SubLObject f40966(final SubLObject var292) {
        return module0656.f39789((SubLObject)$ic275$, var292, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED, (SubLObject)UNPROVIDED);
    }
    
    public static SubLObject f40967(final SubLObject var296, final SubLObject var297) {
        final SubLThread var298 = SubLProcess.currentSubLThread();
        final SubLObject var299 = Sequences.cconcatenate((SubLObject)$ic276$, module0006.f203(random.random((SubLObject)$ic277$)));
        final SubLObject var300 = Sequences.cconcatenate((SubLObject)$ic276$, module0006.f203(random.random((SubLObject)$ic277$)));
        final SubLObject var301 = module0014.f697(var296);
        final SubLObject var302 = module0014.f697(var297);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0666.f40469());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g389$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(Sequences.cconcatenate((SubLObject)$ic278$, new SubLObject[] { module0006.f203(var300), $ic279$, module0006.f203(var299), $ic280$ }));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(module0015.$g390$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39020(Sequences.cconcatenate((SubLObject)$ic278$, new SubLObject[] { module0006.f203(var299), $ic279$, module0006.f203(var300), $ic280$ }));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
        final SubLObject var303 = module0015.$g533$.currentBinding(var298);
        try {
            module0015.$g533$.bind((SubLObject)T, var298);
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var301);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var299) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var299);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g439$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_302 = module0015.$g533$.currentBinding(var298);
            try {
                module0015.$g533$.bind((SubLObject)T, var298);
            }
            finally {
                module0015.$g533$.rebind(var11_302, var298);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020(var302);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            if (NIL != var300) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
                module0642.f39020(var300);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            }
            module0642.f39020(module0015.$g439$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39020((SubLObject)ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)UNPROVIDED);
            final SubLObject var11_303 = module0015.$g533$.currentBinding(var298);
            try {
                module0015.$g533$.bind((SubLObject)T, var298);
            }
            finally {
                module0015.$g533$.rebind(var11_303, var298);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
        }
        finally {
            module0015.$g533$.rebind(var303, var298);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40968() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40909", "CB-INFERRED-INDEX-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40911", "S#45009", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40912", "CB-LEGACY-INDEX-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40913", "S#45010", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40910", "S#44191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40915", "S#45011", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40914", "S#45012", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40916", "S#45013", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40917", "S#45014", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40918", "S#45015", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40919", "S#45016", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40921", "S#45017", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40920", "S#45018", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40924", "S#45019", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40922", "S#45020", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40925", "S#45021", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40923", "S#45022", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40926", "CB-INFERRED-INDEX-ORDER-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40927", "S#45023", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40928", "CB-INFERRED-INDEX-VISIBILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40929", "S#45024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40930", "CB-INFERRED-INDEX-PREDICATE-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40932", "S#45025", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40931", "S#45026", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40933", "S#45027", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40934", "S#45028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40935", "S#45029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40936", "S#45030", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40937", "CB-HANDLE-INFERRED-INDEX-PREDICATE-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40939", "S#45031", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40938", "S#45032", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40940", "S#45033", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40941", "CB-INFERRED-INDEX-ONTOLOGY-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40943", "S#45034", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40942", "S#45035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40944", "S#45036", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40946", "CB-HANDLE-INFERRED-INDEX-ONTOLOGY-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40945", "S#45037", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40947", "S#45038", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40948", "S#45039", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40949", "S#45040", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40950", "CB-INFERRED-GAF-ARG-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40951", "S#44723", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40954", "S#45041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40955", "S#45042", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40957", "S#45043", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40958", "S#45044", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40956", "S#45045", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40952", "S#45046", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40959", "S#44722", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40960", "S#45047", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40953", "S#45048", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40961", "S#45049", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40962", "S#45050", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40963", "S#45051", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40964", "CB-HANDLE-GAF-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40965", "S#45052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40966", "S#45053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0670", "f40967", "S#45054", 2, 0, false);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40969() {
        $g5298$ = SubLFiles.defvar("S#45055", (SubLObject)$ic0$);
        $g5299$ = SubLFiles.defvar("S#45056", (SubLObject)NIL);
        $g5300$ = SubLFiles.defvar("S#45057", (SubLObject)$ic3$);
        $g5301$ = SubLFiles.deflexical("S#45058", (SubLObject)$ic208$);
        return (SubLObject)NIL;
    }
    
    public static SubLObject f40970() {
        module0012.f441((SubLObject)$ic1$);
        module0012.f444((SubLObject)$ic1$);
        module0012.f441((SubLObject)$ic2$);
        module0012.f444((SubLObject)$ic2$);
        module0012.f441((SubLObject)$ic4$);
        module0012.f444((SubLObject)$ic4$);
        module0015.f873((SubLObject)$ic7$);
        module0656.f39840((SubLObject)$ic11$, (SubLObject)$ic12$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic13$);
        module0656.f39840((SubLObject)$ic16$, (SubLObject)$ic17$, (SubLObject)THREE_INTEGER);
        module0656.f39840((SubLObject)$ic96$, (SubLObject)$ic110$, (SubLObject)FOUR_INTEGER);
        module0656.f39840((SubLObject)$ic98$, (SubLObject)$ic114$, (SubLObject)FOUR_INTEGER);
        module0015.f873((SubLObject)$ic117$);
        module0656.f39840((SubLObject)$ic80$, (SubLObject)$ic119$, (SubLObject)THREE_INTEGER);
        module0015.f873((SubLObject)$ic121$);
        module0656.f39840((SubLObject)$ic101$, (SubLObject)$ic128$, (SubLObject)ONE_INTEGER);
        module0015.f873((SubLObject)$ic131$);
        module0656.f39840((SubLObject)$ic83$, (SubLObject)$ic134$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic168$);
        module0015.f873((SubLObject)$ic170$);
        module0656.f39840((SubLObject)$ic84$, (SubLObject)$ic173$, (SubLObject)TWO_INTEGER);
        module0015.f873((SubLObject)$ic183$);
        module0656.f39840((SubLObject)$ic91$, (SubLObject)$ic193$, (SubLObject)FIVE_INTEGER);
        module0015.f873((SubLObject)$ic198$);
        Hashtables.sethash((SubLObject)$ic218$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic219$, (SubLObject)NIL));
        Hashtables.sethash((SubLObject)$ic220$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)$ic221$, (SubLObject)NIL));
        module0015.f873((SubLObject)$ic272$);
        return (SubLObject)NIL;
    }
    
    public void declareFunctions() {
        f40968();
    }
    
    public void initializeVariables() {
        f40969();
    }
    
    public void runTopLevelForms() {
        f40970();
    }
    
    static {
        me = (SubLFile)new module0670();
        $g5298$ = null;
        $g5299$ = null;
        $g5300$ = null;
        $g5301$ = null;
        $ic0$ = makeKeyword("ONTOLOGY");
        $ic1$ = makeSymbol("S#45055", "CYC");
        $ic2$ = makeSymbol("S#45056", "CYC");
        $ic3$ = makeKeyword("INVISIBLE");
        $ic4$ = makeSymbol("S#45057", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)makeSymbol("S#45059", "CYC"));
        $ic6$ = makeString("Unable to determine a term from ~S");
        $ic7$ = makeSymbol("CB-INFERRED-INDEX-FRAME");
        $ic8$ = makeKeyword("SELF");
        $ic9$ = makeString("[Inferred]");
        $ic10$ = makeString("cb-inferred-index-frame&~A");
        $ic11$ = makeKeyword("INFERRED-INDEX");
        $ic12$ = makeSymbol("S#45009", "CYC");
        $ic13$ = makeSymbol("CB-LEGACY-INDEX-FRAME");
        $ic14$ = makeString("[Legacy]");
        $ic15$ = makeString("cb-legacy-index-frame&~A");
        $ic16$ = makeKeyword("LEGACY-INDEX");
        $ic17$ = makeSymbol("S#45010", "CYC");
        $ic18$ = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic19$ = makeKeyword("CB-CYC");
        $ic20$ = makeString("stylesheet");
        $ic21$ = makeString("text/css");
        $ic22$ = makeString("browsing");
        $ic23$ = makeString("Browsing");
        $ic24$ = makeString("edit");
        $ic25$ = makeString("Editing");
        $ic26$ = makeString("advanced");
        $ic27$ = makeString("Advanced");
        $ic28$ = makeKeyword("TEXT");
        $ic29$ = makeKeyword("DOCUMENTATION");
        $ic30$ = makeString("documentation");
        $ic31$ = makeString(" | ");
        $ic32$ = makeKeyword("DEFINITIONAL");
        $ic33$ = makeString("definitional");
        $ic34$ = makeKeyword("CREATE-SIMILAR");
        $ic35$ = makeString("copy");
        $ic36$ = makeKeyword("RENAME");
        $ic37$ = makeString("rename");
        $ic38$ = makeKeyword("MERGE");
        $ic39$ = makeString("merge");
        $ic40$ = makeKeyword("CONFIRM-KILL");
        $ic41$ = makeKeyword("KILL");
        $ic42$ = makeString("kill");
        $ic43$ = makeKeyword("CREATE-INSTANCE");
        $ic44$ = makeString("create instance");
        $ic45$ = makeKeyword("CREATE-SPEC");
        $ic46$ = makeString("create spec");
        $ic47$ = makeKeyword("CHRONOLOGICAL-ORDER");
        $ic48$ = makeString("history");
        $ic49$ = makeKeyword("DESCRIBE-NART");
        $ic50$ = makeKeyword("DESCRIBE-CONSTANT");
        $ic51$ = makeKeyword("TTT-TEST");
        $ic52$ = makeString("take test");
        $ic53$ = makeKeyword("KCT-TEST");
        $ic54$ = makeString("run test");
        $ic55$ = makeKeyword("KBQ-ASK");
        $ic56$ = makeString("ask query");
        $ic57$ = makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $ic58$ = makeString("proof-check query");
        $ic59$ = makeKeyword("KBQ-EDIT");
        $ic60$ = makeString("edit query");
        $ic61$ = makeString("more filters");
        $ic62$ = makeKeyword("HANDLER");
        $ic63$ = makeSymbol("CB-C-PERTINENT-QUERY-LINKS");
        $ic64$ = makeKeyword("ARGS");
        $ic65$ = makeString("term");
        $ic66$ = makeKeyword("MESSAGE");
        $ic67$ = makeString("Checking for Pertinent Queries...");
        $ic68$ = makeKeyword("TAG");
        $ic69$ = makeString("div");
        $ic70$ = makeKeyword("DELAY");
        $ic71$ = makeInteger(50);
        $ic72$ = makeString("100%");
        $ic73$ = makeKeyword("LEFT");
        $ic74$ = makeKeyword("TOP");
        $ic75$ = makeKeyword("RIGHT");
        $ic76$ = makeString("40%");
        $ic77$ = makeString("order by :");
        $ic78$ = makeKeyword("PREDICATE");
        $ic79$ = makeString("predicate");
        $ic80$ = makeKeyword("INFERRED-INDEX-ORDER-BY");
        $ic81$ = makeString("ontology");
        $ic82$ = makeString("filters :");
        $ic83$ = makeKeyword("INFERRED-INDEX-PREDICATE-FILTERS");
        $ic84$ = makeKeyword("INFERRED-INDEX-ONTOLOGY-FILTERS");
        $ic85$ = makeString("index view :");
        $ic86$ = makeString("inferred");
        $ic87$ = makeString("legacy");
        $ic88$ = makeString("Unexpected order-by : ~S");
        $ic89$ = makeString("");
        $ic90$ = makeString("via ");
        $ic91$ = makeKeyword("INFERRED-GAF-ARG-ASSERTIONS");
        $ic92$ = makeInteger(100);
        $ic93$ = makeKeyword("VISIBLE");
        $ic94$ = ConsesLow.list((SubLObject)makeSymbol("S#17513", "CYC"), (SubLObject)makeSymbol("S#17514", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"), (SubLObject)makeSymbol("S#155", "CYC"));
        $ic95$ = makeString(" arg~S");
        $ic96$ = makeKeyword("LITERAL-QUERY");
        $ic97$ = constant_handles_oc.f8479((SubLObject)makeString("EverythingPSC"));
        $ic98$ = makeKeyword("HIER-BROW");
        $ic99$ = makeString("All Assertions");
        $ic100$ = makeInteger(1000);
        $ic101$ = makeKeyword("INFERRED-INDEX-TOGGLE-VISIBILITY");
        $ic102$ = makeString("(~A)");
        $ic103$ = makeString("color: red; background-color:yellow; font-family:monospace");
        $ic104$ = makeString("!");
        $ic105$ = makeString("igai_");
        $ic106$ = makeKeyword("CONTENT");
        $ic107$ = makeString("cb-lq&~A&~A&~A&~A");
        $ic108$ = makeString("cb-lq&~A&~A&~A");
        $ic109$ = makeKeyword("PLUS-GREEN");
        $ic110$ = makeSymbol("S#45019", "CYC");
        $ic111$ = makeString("cb-hier&~A&~A&~A&~A");
        $ic112$ = makeString("cb-hier&~A&~A&~A");
        $ic113$ = makeKeyword("RED-DIAMOND");
        $ic114$ = makeSymbol("S#45021", "CYC");
        $ic115$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("genls")), constant_handles_oc.f8479((SubLObject)makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)makeString("genlMt")));
        $ic116$ = ConsesLow.list((SubLObject)makeSymbol("S#45059", "CYC"), (SubLObject)makeSymbol("S#45060", "CYC"));
        $ic117$ = makeSymbol("CB-INFERRED-INDEX-ORDER-BY");
        $ic118$ = makeString("cb-inferred-index-order-by&~A&~A");
        $ic119$ = makeSymbol("S#45023", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)makeSymbol("S#45059", "CYC"), (SubLObject)makeSymbol("S#45061", "CYC"));
        $ic121$ = makeSymbol("CB-INFERRED-INDEX-VISIBILITY");
        $ic122$ = makeString("close all");
        $ic123$ = makeString("open all");
        $ic124$ = makeKeyword("DOWN-TRIANGLE-V");
        $ic125$ = makeKeyword("RIGHT-TRIANGLE-V");
        $ic126$ = makeString("cb-inferred-index-visibility&~A&~S");
        $ic127$ = makeKeyword("CENTER");
        $ic128$ = makeSymbol("S#45024", "CYC");
        $ic129$ = ConsesLow.list((SubLObject)makeSymbol("S#38900", "CYC"));
        $ic130$ = makeString("~S did not specify a term");
        $ic131$ = makeSymbol("CB-INFERRED-INDEX-PREDICATE-FILTERS");
        $ic132$ = makeString("[Predicate Filters]");
        $ic133$ = makeString("cb-inferred-index-predicate-filters&~A");
        $ic134$ = makeSymbol("S#45025", "CYC");
        $ic135$ = makeString("Inferred Index Predicate Filters");
        $ic136$ = makeString("post");
        $ic137$ = makeString("cb-handle-inferred-index-predicate-filters");
        $ic138$ = makeString("relevant to ");
        $ic139$ = makeString("Update Filters");
        $ic140$ = makeString("update");
        $ic141$ = makeString("Reset Values");
        $ic142$ = makeString("Remove All Filters");
        $ic143$ = makeString("clear");
        $ic144$ = makeKeyword("ALLOW-PREDICATES");
        $ic145$ = makeKeyword("ALLOW-PREDICATE-TYPES");
        $ic146$ = makeKeyword("FORBID-PREDICATES");
        $ic147$ = makeKeyword("FORBID-PREDICATE-TYPES");
        $ic148$ = makeString("Allowed Types");
        $ic149$ = makeString("check to remove");
        $ic150$ = makeString("add ");
        $ic151$ = makeString("type_allow");
        $ic152$ = makeInteger(30);
        $ic153$ = makeString("Complete");
        $ic154$ = constant_handles_oc.f8479((SubLObject)makeString("Collection"));
        $ic155$ = makeString("Forbidden Types");
        $ic156$ = makeString("type_forbid");
        $ic157$ = makeString("Allowed Predicates");
        $ic158$ = makeKeyword("RED");
        $ic159$ = makeString("None!");
        $ic160$ = makeString("check to forbid");
        $ic161$ = makeString("Forbidden Predicates");
        $ic162$ = makeString("check to allow");
        $ic163$ = makeString("remove_type_allow_");
        $ic164$ = makeString("T");
        $ic165$ = makeString("remove_type_forbid_");
        $ic166$ = makeString("forbid_");
        $ic167$ = makeString("allow_");
        $ic168$ = makeSymbol("CB-HANDLE-INFERRED-INDEX-PREDICATE-FILTERS");
        $ic169$ = ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeSymbol("S#132", "CYC"));
        $ic170$ = makeSymbol("CB-INFERRED-INDEX-ONTOLOGY-FILTERS");
        $ic171$ = makeString("[Ontology Filters]");
        $ic172$ = makeString("cb-inferred-index-ontology-filters&~A");
        $ic173$ = makeSymbol("S#45034", "CYC");
        $ic174$ = makeString("Inferred Index Ontology Filters");
        $ic175$ = makeString("cb-handle-inferred-index-ontology-filters");
        $ic176$ = makeKeyword("ONTOLOGY-HORIZON");
        $ic177$ = makeString("Generality Horizon");
        $ic178$ = makeString("select a qualitative boundary");
        $ic179$ = ConsesLow.list((SubLObject)makeKeyword("SELF"), (SubLObject)makeKeyword("LOWER"), (SubLObject)makeKeyword("MIDDLE"), (SubLObject)makeKeyword("ALL"));
        $ic180$ = makeString("or a generalization");
        $ic181$ = makeKeyword("ALL");
        $ic182$ = makeString("ontology-horizon");
        $ic183$ = makeSymbol("CB-HANDLE-INFERRED-INDEX-ONTOLOGY-FILTERS");
        $ic184$ = makeString("Just on the term");
        $ic185$ = makeKeyword("LOWER");
        $ic186$ = makeString("Also from the lower ontology");
        $ic187$ = makeKeyword("MIDDLE");
        $ic188$ = makeString("Also up through the middle ontology");
        $ic189$ = makeString("Everything");
        $ic190$ = makeString("cb-inferred-gaf-arg-assertions&~A&~A&~A&~A");
        $ic191$ = makeString("cb-inferred-gaf-arg-assertions&~A&~A");
        $ic192$ = makeString("cb-inferred-gaf-arg-assertions&~A");
        $ic193$ = makeSymbol("S#45040", "CYC");
        $ic194$ = ConsesLow.list((SubLObject)makeSymbol("S#37820", "CYC"), (SubLObject)makeSymbol("&OPTIONAL"), (SubLObject)makeSymbol("S#45062", "CYC"), (SubLObject)makeSymbol("S#13107", "CYC"), (SubLObject)makeSymbol("S#13108", "CYC"));
        $ic195$ = makeString("Could not determine a term from ~a");
        $ic196$ = makeString("NIL");
        $ic197$ = makeString("Could not determine an argnum from ~a");
        $ic198$ = makeSymbol("CB-INFERRED-GAF-ARG-ASSERTIONS");
        $ic199$ = makeString("Inferred GAF arg index for ~S");
        $ic200$ = makeString("yui-skin-sam");
        $ic201$ = makeString("reloadFrameButton");
        $ic202$ = makeString("button");
        $ic203$ = makeString("reload");
        $ic204$ = makeString("Refresh");
        $ic205$ = makeString("reloadCurrentFrame('reloadFrameButton');");
        $ic206$ = makeKeyword("QUERY-ISA");
        $ic207$ = makeString(" query");
        $ic208$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("isa")), (SubLObject)makeKeyword("ISA")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("genls")), (SubLObject)makeKeyword("GENLS")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)makeString("equals")), (SubLObject)makeKeyword("EQUALITY")));
        $ic209$ = makeKeyword("QUERY");
        $ic210$ = constant_handles_oc.f8479((SubLObject)makeString("equals"));
        $ic211$ = makeString("on ");
        $ic212$ = makeString("the term");
        $ic213$ = constant_handles_oc.f8479((SubLObject)makeString("isa"));
        $ic214$ = makeKeyword("HL-SUPPORT");
        $ic215$ = makeKeyword("NONE");
        $ic216$ = makeString("[?]");
        $ic217$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)makeString("Thing")));
        $ic218$ = makeKeyword("CLOSE-RED");
        $ic219$ = makeString("red-x-close-15.gif");
        $ic220$ = makeKeyword("CLOSE-RED-DIM");
        $ic221$ = makeString("dim-red-x-close-15.gif");
        $ic222$ = makeString("gaf_entry");
        $ic223$ = makeString("[+]");
        $ic224$ = makeString("[-]");
        $ic225$ = makeString(" : ");
        $ic226$ = ConsesLow.list((SubLObject)makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)makeSymbol("S#29", "CYC"), (SubLObject)makeString("gaf_entry")), (SubLObject)makeSymbol("S#155", "CYC"), (SubLObject)makeSymbol("S#15200", "CYC"));
        $ic227$ = ConsesLow.list((SubLObject)makeKeyword("NAME"), (SubLObject)makeKeyword("PRED"), (SubLObject)makeKeyword("ARGNUM"));
        $ic228$ = makeKeyword("ALLOW-OTHER-KEYS");
        $ic229$ = makeKeyword("NAME");
        $ic230$ = makeKeyword("PRED");
        $ic231$ = makeKeyword("ARGNUM");
        $ic232$ = makeInteger(200);
        $ic233$ = makeKeyword("PARAGRAPH");
        $ic234$ = makeString("unary_frame");
        $ic235$ = makeString("cb-handle-gaf-entry");
        $ic236$ = makeString("implicit_arg1");
        $ic237$ = makeString("unary_frame_pred");
        $ic238$ = makeString("unary predicate");
        $ic239$ = constant_handles_oc.f8479((SubLObject)makeString("UnaryPredicate"));
        $ic240$ = makeString("binary_frame");
        $ic241$ = makeString("+arg2");
        $ic242$ = makeKeyword("BOTTOM");
        $ic243$ = makeString("Assert");
        $ic244$ = makeKeyword("INPUT-NAME");
        $ic245$ = makeKeyword("COMPLETE-TYPE");
        $ic246$ = makeKeyword("CLEAR-LABEL");
        $ic247$ = makeKeyword("COMPLETE-LABEL");
        $ic248$ = makeKeyword("WIDTH");
        $ic249$ = makeString("binary_frame_pred");
        $ic250$ = makeString("binary predicate");
        $ic251$ = constant_handles_oc.f8479((SubLObject)makeString("BinaryPredicate"));
        $ic252$ = makeString("binary");
        $ic253$ = makeString("+arg1");
        $ic254$ = makeString("binary_frame_arg2");
        $ic255$ = makeString("arg2");
        $ic256$ = constant_handles_oc.f8479((SubLObject)makeString("Thing"));
        $ic257$ = makeString("ternary");
        $ic258$ = makeString("+arg3");
        $ic259$ = makeString("binary_pred");
        $ic260$ = makeString("binary_arg1");
        $ic261$ = makeString("arg1");
        $ic262$ = makeString("binary_arg2");
        $ic263$ = makeString("ternary_pred");
        $ic264$ = makeString("ternary predicate");
        $ic265$ = constant_handles_oc.f8479((SubLObject)makeString("TernaryPredicate"));
        $ic266$ = makeString("ternary_arg1");
        $ic267$ = makeString("ternary_arg2");
        $ic268$ = makeString("ternary_arg3");
        $ic269$ = makeString("arg3");
        $ic270$ = makeString("+arg4");
        $ic271$ = makeKeyword("DEFAULT");
        $ic272$ = makeSymbol("CB-HANDLE-GAF-ENTRY");
        $ic273$ = makeString(" did not specify a term");
        $ic274$ = makeString("Unexpected sentence entry method");
        $ic275$ = makeString("~A");
        $ic276$ = makeString("dim_");
        $ic277$ = makeInteger(10000);
        $ic278$ = makeString("setVisibility('");
        $ic279$ = makeString("','inline');setVisibility('");
        $ic280$ = makeString("','none');");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/class
	Total time: 8916 ms
	
	Decompiled with Procyon 0.5.32.
*/