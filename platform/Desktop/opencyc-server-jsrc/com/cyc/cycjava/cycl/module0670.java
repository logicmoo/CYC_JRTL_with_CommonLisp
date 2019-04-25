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
        SubLObject var2 = (SubLObject)module0670.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0670.$ic5$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (module0670.NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0670.$ic5$);
            return (SubLObject)module0670.NIL;
        }
        final SubLObject var4 = module0656.f39969(var2);
        if (module0670.NIL == var4) {
            return module0656.f39789((SubLObject)module0670.$ic6$, var2, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        }
        return f40910(var4);
    }
    
    public static SubLObject f40911(final SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var7 == module0670.UNPROVIDED) {
            var7 = (SubLObject)module0670.NIL;
        }
        if (var8 == module0670.UNPROVIDED) {
            var8 = (SubLObject)module0670.$ic8$;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0670.NIL == var7) {
            var7 = (SubLObject)module0670.$ic9$;
        }
        final SubLObject var10 = module0656.f39931(var6);
        final SubLObject var11 = module0656.f39832(var8);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)module0670.$ic10$, var10);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var9);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var12, var9);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f40912(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0670.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0670.$ic5$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (module0670.NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0670.$ic5$);
            return (SubLObject)module0670.NIL;
        }
        final SubLObject var4 = module0656.f39969(var2);
        if (module0670.NIL == var4) {
            return module0656.f39789((SubLObject)module0670.$ic6$, var2, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        }
        return module0669.f40606(var4);
    }
    
    public static SubLObject f40913(final SubLObject var6, SubLObject var7, SubLObject var8) {
        if (var7 == module0670.UNPROVIDED) {
            var7 = (SubLObject)module0670.NIL;
        }
        if (var8 == module0670.UNPROVIDED) {
            var8 = (SubLObject)module0670.$ic8$;
        }
        final SubLThread var9 = SubLProcess.currentSubLThread();
        if (module0670.NIL == var7) {
            var7 = (SubLObject)module0670.$ic14$;
        }
        final SubLObject var10 = module0656.f39931(var6);
        final SubLObject var11 = module0656.f39832(var8);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var9), (SubLObject)module0670.$ic15$, var10);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var11) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var11);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var12 = module0015.$g533$.currentBinding(var9);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var9);
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
        final SubLObject var8 = module0670.$g5298$.getDynamicValue(var7);
        final SubLObject var9 = module0670.$g5299$.getDynamicValue(var7);
        module0642.f39020((SubLObject)module0670.$ic18$);
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
        final SubLObject var10 = module0014.f672((SubLObject)module0670.$ic19$);
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var10) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        SubLObject var11 = module0016.$g568$.currentBinding(var7);
        try {
            module0016.$g568$.bind((SubLObject)module0670.ZERO_INTEGER, var7);
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
            module0015.$g535$.bind((SubLObject)module0670.T, var7);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_17 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                f40914(var6, var8);
                module0642.f39051((SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                f40915(var6);
                module0642.f39051((SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                f40916(var6, var9, var8);
                module0642.f39029((SubLObject)module0670.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var11_17, var7);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var11, var7);
        }
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40915(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0673.f41081(var6);
        final SubLObject var9 = (SubLObject)SubLObjectFactory.makeBoolean(module0670.NIL == var8);
        SubLObject var10 = (SubLObject)module0670.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0670.NIL != var10) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        SubLObject var11 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var7);
            module0016.f924((SubLObject)module0670.$ic22$, (SubLObject)module0670.$ic23$);
            module0642.f39032((SubLObject)module0670.TWO_INTEGER);
        }
        finally {
            module0015.$g533$.rebind(var11, var7);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        if (module0670.NIL != module0655.$g5115$.getDynamicValue(var7)) {
            var10 = (SubLObject)module0670.FOUR_INTEGER;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0670.NIL != var10) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var10);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            var11 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                module0016.f924((SubLObject)module0670.$ic24$, (SubLObject)module0670.$ic25$);
                module0642.f39032((SubLObject)module0670.TWO_INTEGER);
            }
            finally {
                module0015.$g533$.rebind(var11, var7);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        var10 = (SubLObject)module0670.FOUR_INTEGER;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0670.NIL != var10) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        var11 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var7);
            module0016.f924((SubLObject)module0670.$ic26$, (SubLObject)module0670.$ic27$);
            module0642.f39032((SubLObject)module0670.TWO_INTEGER);
        }
        finally {
            module0015.$g533$.rebind(var11, var7);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0016.f908((SubLObject)module0670.$ic22$, (SubLObject)module0670.$ic3$, (SubLObject)module0670.$ic28$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic22$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        SubLObject var12 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var7);
            module0656.f39837((SubLObject)module0670.$ic29$, var6, (SubLObject)module0670.$ic30$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            module0642.f39019((SubLObject)module0670.$ic31$);
            module0656.f39837((SubLObject)module0670.$ic32$, var6, (SubLObject)module0670.$ic33$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var12, var7);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != module0655.$g5115$.getDynamicValue(var7)) {
            module0016.f908((SubLObject)module0670.$ic24$, (SubLObject)module0670.$ic3$, (SubLObject)module0670.$ic28$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.$ic24$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            var12 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                module0642.f39019((SubLObject)module0670.$ic31$);
                module0656.f39837((SubLObject)module0670.$ic34$, var6, (SubLObject)module0670.$ic35$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                if (module0670.NIL != constant_handles_oc.f8449(var6)) {
                    module0642.f39019((SubLObject)module0670.$ic31$);
                    module0656.f39837((SubLObject)module0670.$ic36$, var6, (SubLObject)module0670.$ic37$, var9, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                }
                if (module0670.NIL != module0673.f41082(var6)) {
                    module0642.f39019((SubLObject)module0670.$ic31$);
                    module0656.f39837((SubLObject)module0670.$ic38$, var6, (SubLObject)module0670.$ic39$, var9, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39019((SubLObject)module0670.$ic31$);
                module0656.f39837((SubLObject)((module0670.NIL != module0655.$g5117$.getDynamicValue(var7)) ? module0670.$ic40$ : module0670.$ic41$), var6, (SubLObject)module0670.$ic42$, var9, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                if (module0670.NIL != module0269.f17705(var6)) {
                    module0642.f39019((SubLObject)module0670.$ic31$);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0670.$ic43$, var6, (SubLObject)module0670.$ic44$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39019((SubLObject)module0670.$ic31$);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0670.$ic45$, var6, (SubLObject)module0670.$ic46$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                }
            }
            finally {
                module0015.$g533$.rebind(var12, var7);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
        }
        module0016.f908((SubLObject)module0670.$ic26$, (SubLObject)module0670.$ic3$, (SubLObject)module0670.$ic28$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        module0642.f39020(module0015.$g157$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic26$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        var12 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var7);
            if (module0670.NIL != module0173.f10955(var6)) {
                module0656.f39837((SubLObject)module0670.$ic47$, var6, (SubLObject)module0670.$ic48$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                module0642.f39019((SubLObject)module0670.$ic31$);
            }
            if (module0670.NIL != module0167.f10813(var6)) {
                module0656.f39837((SubLObject)module0670.$ic49$, var6, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                module0642.f39019((SubLObject)module0670.$ic31$);
            }
            else if (module0670.NIL != constant_handles_oc.f8449(var6)) {
                module0656.f39837((SubLObject)module0670.$ic50$, var6, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                module0642.f39019((SubLObject)module0670.$ic31$);
            }
            if (module0670.NIL != module0633.f38716(var6, (SubLObject)module0670.UNPROVIDED)) {
                final SubLObject var13 = (SubLObject)module0670.NIL;
                module0642.f39019((SubLObject)module0670.$ic31$);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                if (module0670.NIL != var13) {
                    module0656.f39837((SubLObject)module0670.$ic51$, var6, (SubLObject)module0670.$ic52$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                }
                else {
                    module0656.f39837((SubLObject)module0670.$ic53$, var6, (SubLObject)module0670.$ic54$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            if (module0670.NIL != module0423.f29532(var6) || module0670.NIL != module0633.f38716(var6, (SubLObject)module0670.UNPROVIDED)) {
                final SubLObject var14 = (module0670.NIL != module0633.f38716(var6, (SubLObject)module0670.UNPROVIDED)) ? module0633.f38713(var6, (SubLObject)module0670.UNPROVIDED) : var6;
                if (module0670.NIL != module0173.f10955(var14)) {
                    module0642.f39019((SubLObject)module0670.$ic31$);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0656.f39837((SubLObject)module0670.$ic55$, var14, (SubLObject)module0670.$ic56$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    if (module0670.NIL != module0684.f41933(var14)) {
                        module0642.f39019((SubLObject)module0670.$ic31$);
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0656.f39837((SubLObject)module0670.$ic57$, var14, (SubLObject)module0670.$ic58$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                    }
                }
                module0642.f39019((SubLObject)module0670.$ic31$);
                module0642.f39020(module0015.$g459$.getGlobalValue());
                module0656.f39837((SubLObject)module0670.$ic59$, var14, (SubLObject)module0670.$ic60$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g460$.getGlobalValue());
            }
            module0642.f39019((SubLObject)module0670.$ic31$);
            module0669.f40612(var6, (SubLObject)module0670.$ic61$);
            if (module0670.NIL == module0677.f41295()) {
                module0016.f939((SubLObject)ConsesLow.list(new SubLObject[] { module0670.$ic62$, module0670.$ic63$, module0670.$ic64$, ConsesLow.list(reader.bq_cons((SubLObject)module0670.$ic65$, var6)), module0670.$ic66$, module0670.$ic67$, module0670.$ic68$, module0670.$ic69$, module0670.$ic70$, module0670.$ic71$ }));
            }
        }
        finally {
            module0015.$g533$.rebind(var12, var7);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40914(final SubLObject var6, final SubLObject var14) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g346$.getGlobalValue());
        module0642.f39020(module0015.$g352$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g353$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g354$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.ZERO_INTEGER);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g358$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic72$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var16 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var15);
            module0642.f39020(module0015.$g364$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_23 = module0015.$g533$.currentBinding(var15);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var15);
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_24 = module0015.$g533$.currentBinding(var15);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var15);
                    final SubLObject var17 = module0656.f39799(var6, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    final SubLObject var18 = var17;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0670.NIL != var18) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(var18);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_25 = module0015.$g533$.currentBinding(var15);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var15);
                        module0656.f39915(var6, (SubLObject)module0670.ZERO_INTEGER, (SubLObject)module0670.T);
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
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_26 = module0015.$g533$.currentBinding(var15);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var15);
                    module0642.f39032((SubLObject)module0670.TWO_INTEGER);
                }
                finally {
                    module0015.$g533$.rebind(var11_26, var15);
                }
                module0642.f39020(module0015.$g361$.getGlobalValue());
                module0642.f39020(module0015.$g360$.getGlobalValue());
                module0642.f39020(module0015.$g370$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0670.$ic75$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g373$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g375$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic76$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_27 = module0015.$g533$.currentBinding(var15);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var15);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0670.$ic77$);
                    module0642.f39032((SubLObject)module0670.UNPROVIDED);
                    if (var14 == module0670.$ic78$) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0670.$ic79$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    else {
                        module0656.f39837((SubLObject)module0670.$ic80$, var6, (SubLObject)module0670.$ic78$, (SubLObject)module0670.$ic79$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    }
                    module0642.f39032((SubLObject)module0670.UNPROVIDED);
                    if (var14 == module0670.$ic0$) {
                        module0642.f39020(module0015.$g234$.getGlobalValue());
                        module0642.f39019((SubLObject)module0670.$ic81$);
                        module0642.f39020(module0015.$g235$.getGlobalValue());
                    }
                    else {
                        module0656.f39837((SubLObject)module0670.$ic80$, var6, (SubLObject)module0670.$ic0$, (SubLObject)module0670.$ic81$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    }
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0670.$ic82$);
                    module0642.f39032((SubLObject)module0670.UNPROVIDED);
                    module0656.f39837((SubLObject)module0670.$ic83$, var6, (SubLObject)module0670.$ic79$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39032((SubLObject)module0670.UNPROVIDED);
                    module0656.f39837((SubLObject)module0670.$ic84$, var6, (SubLObject)module0670.$ic81$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g460$.getGlobalValue());
                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g459$.getGlobalValue());
                    module0642.f39019((SubLObject)module0670.$ic85$);
                    module0642.f39032((SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0656.f39837((SubLObject)module0670.$ic11$, var6, (SubLObject)module0670.$ic86$, (SubLObject)module0670.$ic8$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39032((SubLObject)module0670.UNPROVIDED);
                    module0656.f39837((SubLObject)module0670.$ic16$, var6, (SubLObject)module0670.$ic87$, (SubLObject)module0670.$ic8$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var16, var15);
        }
        module0642.f39020(module0015.$g347$.getGlobalValue());
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40916(final SubLObject var6, SubLObject var15, SubLObject var14) {
        if (var15 == module0670.UNPROVIDED) {
            var15 = (SubLObject)module0670.NIL;
        }
        if (var14 == module0670.UNPROVIDED) {
            var14 = (SubLObject)module0670.$ic78$;
        }
        final SubLObject var16 = module0224.f14703(var6, var15, var14);
        final SubLObject var17 = module0224.f14707(var6, var16, var14);
        final SubLObject var18 = var14;
        if (var18.eql((SubLObject)module0670.$ic0$)) {
            return f40917(var6, var17);
        }
        if (var18.eql((SubLObject)module0670.$ic78$)) {
            return f40918(var6, var17);
        }
        return module0656.f39789((SubLObject)module0670.$ic88$, var14, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40917(final SubLObject var6, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (module0670.NIL != var30) {
            f40919(var6, var30);
            module0642.f39026((SubLObject)module0670.UNPROVIDED);
        }
        SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)module0670.NIL;
        var33 = var32.first();
        while (module0670.NIL != var32) {
            final SubLObject var34 = var33.first();
            final SubLObject var35 = conses_high.second(var34);
            final SubLObject var36 = f40920(var35, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(module0015.$g459$.getGlobalValue());
            module0016.f923(var36, (SubLObject)module0670.$ic89$);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39019((SubLObject)module0670.$ic90$);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0656.f39837((SubLObject)module0670.$ic91$, var6, var35, var35, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var37 = module0224.f14728(var33);
            module0642.f39032((SubLObject)module0670.TWO_INTEGER);
            f40921(var37, (SubLObject)module0670.$ic92$);
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)module0670.UNPROVIDED);
            module0016.f908(var36, (SubLObject)(var35.eql(var6) ? module0670.$ic93$ : module0670.$g5300$.getDynamicValue(var31)), (SubLObject)module0670.$ic28$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            if (module0670.NIL != var36) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var36);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var38 = module0015.$g533$.currentBinding(var31);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var31);
                SubLObject var32_37 = var33;
                SubLObject var39 = (SubLObject)module0670.NIL;
                var39 = var32_37.first();
                while (module0670.NIL != var32_37) {
                    SubLObject var41;
                    final SubLObject var40 = var41 = var39;
                    SubLObject var42 = (SubLObject)module0670.NIL;
                    SubLObject var43 = (SubLObject)module0670.NIL;
                    SubLObject var44 = (SubLObject)module0670.NIL;
                    SubLObject var45 = (SubLObject)module0670.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0670.$ic94$);
                    var42 = var41.first();
                    var41 = var41.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0670.$ic94$);
                    var43 = var41.first();
                    var41 = var41.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0670.$ic94$);
                    var44 = var41.first();
                    var41 = var41.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var41, var40, (SubLObject)module0670.$ic94$);
                    var45 = var41.first();
                    var41 = var41.rest();
                    if (module0670.NIL == var41) {
                        module0642.f39020(module0015.$g459$.getGlobalValue());
                        module0642.f39032((SubLObject)module0670.FOUR_INTEGER);
                        module0656.f39837((SubLObject)module0670.$ic91$, var6, var45, var43, var44, var45);
                        if (!var44.numE((SubLObject)module0670.ONE_INTEGER)) {
                            PrintLow.format(module0015.$g131$.getDynamicValue(var31), (SubLObject)module0670.$ic95$, var44);
                        }
                        final SubLObject var46 = module0224.f14727(var39);
                        module0642.f39032((SubLObject)module0670.TWO_INTEGER);
                        f40921(var46, (SubLObject)module0670.$ic92$);
                        final SubLObject var47 = f40922(var6, var44, var45);
                        final SubLObject var48 = f40923(var6, var44, var45);
                        if (module0670.NIL != var47) {
                            module0642.f39032((SubLObject)module0670.UNPROVIDED);
                            module0656.f39837((SubLObject)module0670.$ic96$, var6, var44, var45, module0670.$ic97$, (SubLObject)module0670.UNPROVIDED);
                        }
                        if (module0670.NIL != var48) {
                            module0642.f39032((SubLObject)module0670.UNPROVIDED);
                            module0656.f39837((SubLObject)module0670.$ic98$, var6, var44, var45, module0670.$ic97$, (SubLObject)module0670.UNPROVIDED);
                        }
                        module0642.f39020(module0015.$g460$.getGlobalValue());
                        module0642.f39026((SubLObject)module0670.UNPROVIDED);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var40, (SubLObject)module0670.$ic94$);
                    }
                    var32_37 = var32_37.rest();
                    var39 = var32_37.first();
                }
            }
            finally {
                module0015.$g533$.rebind(var38, var31);
            }
            module0642.f39020(module0015.$g145$.getGlobalValue());
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
            var32 = var32.rest();
            var33 = var32.first();
        }
        module0669.f40620(var6);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40918(final SubLObject var6, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        if (module0670.NIL != var30) {
            f40919(var6, var30);
            module0642.f39026((SubLObject)module0670.UNPROVIDED);
        }
        SubLObject var32 = var30;
        SubLObject var33 = (SubLObject)module0670.NIL;
        var33 = var32.first();
        while (module0670.NIL != var32) {
            final SubLObject var34 = var33.first();
            final SubLObject var35 = conses_high.second(var34);
            final SubLObject var36 = conses_high.fourth(var34);
            final SubLObject var37 = conses_high.third(var34);
            final SubLObject var38 = f40920(var36, var37);
            final SubLObject var39 = (SubLObject)SubLObjectFactory.makeBoolean(module0670.NIL != module0035.f1997(var33) && var6.equal(var35));
            module0642.f39020(module0015.$g459$.getGlobalValue());
            if (module0670.NIL != var39) {
                module0016.f927();
            }
            else {
                module0016.f923(var38, (SubLObject)module0670.$ic89$);
            }
            final SubLObject var41;
            final SubLObject var40 = var41 = module0656.f39799(var36, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0670.NIL != var41) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var41);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var42 = module0015.$g533$.currentBinding(var31);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var31);
                module0656.f39837((SubLObject)module0670.$ic91$, var6, var36, (SubLObject)module0670.NIL, var37, var36);
            }
            finally {
                module0015.$g533$.rebind(var42, var31);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
            if (!var37.numE((SubLObject)module0670.ONE_INTEGER)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var31), (SubLObject)module0670.$ic95$, var37);
            }
            final SubLObject var43 = module0224.f14728(var33);
            module0642.f39032((SubLObject)module0670.TWO_INTEGER);
            f40921(var43, (SubLObject)module0670.$ic92$);
            final SubLObject var44 = (SubLObject)SubLObjectFactory.makeBoolean(module0670.NIL == var39 || module0670.NIL != f40922(var6, var37, var36));
            if (module0670.NIL != var44) {
                module0642.f39032((SubLObject)module0670.UNPROVIDED);
                module0656.f39837((SubLObject)module0670.$ic96$, var6, var37, var36, module0670.$ic97$, (SubLObject)module0670.UNPROVIDED);
            }
            final SubLObject var45 = f40923(var6, var37, var36);
            if (module0670.NIL != var45) {
                module0642.f39032((SubLObject)module0670.UNPROVIDED);
                module0656.f39837((SubLObject)module0670.$ic98$, var6, var37, var36, module0670.$ic97$, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39020(module0015.$g460$.getGlobalValue());
            module0642.f39026((SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL == module0035.f1997(var33) || !var6.equal(var35)) {
                module0016.f908(var38, module0670.$g5300$.getDynamicValue(var31), (SubLObject)module0670.$ic28$);
                module0642.f39020(module0015.$g144$.getGlobalValue());
                if (module0670.NIL != var38) {
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(var38);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var46 = module0015.$g533$.currentBinding(var31);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var31);
                    SubLObject var32_51 = var33;
                    SubLObject var47 = (SubLObject)module0670.NIL;
                    var47 = var32_51.first();
                    while (module0670.NIL != var32_51) {
                        SubLObject var49;
                        final SubLObject var48 = var49 = var47;
                        SubLObject var50 = (SubLObject)module0670.NIL;
                        SubLObject var51 = (SubLObject)module0670.NIL;
                        SubLObject var52 = (SubLObject)module0670.NIL;
                        SubLObject var53 = (SubLObject)module0670.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0670.$ic94$);
                        var50 = var49.first();
                        var49 = var49.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0670.$ic94$);
                        var51 = var49.first();
                        var49 = var49.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0670.$ic94$);
                        var52 = var49.first();
                        var49 = var49.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(var49, var48, (SubLObject)module0670.$ic94$);
                        var53 = var49.first();
                        var49 = var49.rest();
                        if (module0670.NIL == var49) {
                            module0642.f39020(module0015.$g459$.getGlobalValue());
                            module0642.f39020(module0015.$g230$.getGlobalValue());
                            module0642.f39032((SubLObject)module0670.FOUR_INTEGER);
                            module0642.f39019((SubLObject)module0670.$ic90$);
                            module0642.f39020(module0015.$g231$.getGlobalValue());
                            module0656.f39837((SubLObject)module0670.$ic91$, var6, var51, var51, var52, var53);
                            final SubLObject var54 = module0224.f14727(var47);
                            module0642.f39032((SubLObject)module0670.TWO_INTEGER);
                            f40921(var54, (SubLObject)module0670.$ic92$);
                            module0642.f39020(module0015.$g460$.getGlobalValue());
                            module0642.f39026((SubLObject)module0670.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(var48, (SubLObject)module0670.$ic94$);
                        }
                        var32_51 = var32_51.rest();
                        var47 = var32_51.first();
                    }
                }
                finally {
                    module0015.$g533$.rebind(var46, var31);
                }
                module0642.f39020(module0015.$g145$.getGlobalValue());
                module0642.f39029((SubLObject)module0670.UNPROVIDED);
            }
            var32 = var32.rest();
            var33 = var32.first();
        }
        module0669.f40620(var6);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40919(final SubLObject var6, final SubLObject var30) {
        module0642.f39020(module0015.$g459$.getGlobalValue());
        module0656.f39837((SubLObject)module0670.$ic91$, var6, (SubLObject)module0670.$ic99$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var31 = module0224.f14729(var30);
        module0642.f39032((SubLObject)module0670.TWO_INTEGER);
        f40921(var31, (SubLObject)module0670.$ic100$);
        module0642.f39032((SubLObject)module0670.FOUR_INTEGER);
        module0656.f39837((SubLObject)module0670.$ic101$, var6, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g460$.getGlobalValue());
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40921(final SubLObject var36, SubLObject var54) {
        if (var54 == module0670.UNPROVIDED) {
            var54 = (SubLObject)module0670.NIL;
        }
        final SubLThread var55 = SubLProcess.currentSubLThread();
        if (!module0670.ONE_INTEGER.numE(var36)) {
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0642.f39020(module0015.$g224$.getGlobalValue());
            PrintLow.format(module0015.$g131$.getDynamicValue(var55), (SubLObject)module0670.$ic102$, var36);
            module0642.f39020(module0015.$g225$.getGlobalValue());
            module0642.f39020(module0015.$g231$.getGlobalValue());
            if (module0670.NIL != var54 && var36.numG(var54)) {
                module0642.f39032((SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g149$.getGlobalValue());
                if (module0670.NIL != module0652.$g5075$.getDynamicValue(var55)) {
                    module0642.f39020(module0015.$g158$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0652.$g5075$.getDynamicValue(var55));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39020(module0015.$g152$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic103$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var56 = module0015.$g533$.currentBinding(var55);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var55);
                    module0642.f39019((SubLObject)module0670.$ic104$);
                }
                finally {
                    module0015.$g533$.rebind(var56, var55);
                }
                module0642.f39020(module0015.$g150$.getGlobalValue());
            }
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40920(final SubLObject var6, SubLObject var43) {
        if (var43 == module0670.UNPROVIDED) {
            var43 = (SubLObject)module0670.NIL;
        }
        final SubLObject var44 = module0656.f39932(var6);
        return Sequences.cconcatenate((SubLObject)module0670.$ic105$, new SubLObject[] { module0006.f203(var44), module0006.f203((SubLObject)((module0670.NIL != var43) ? var43 : module0670.$ic89$)) });
    }
    
    public static SubLObject f40924(final SubLObject var6, final SubLObject var43, final SubLObject var44, SubLObject var56) {
        if (var56 == module0670.UNPROVIDED) {
            var56 = (SubLObject)module0670.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0656.f39832((SubLObject)module0670.$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        if (module0670.NIL != var56) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)module0670.$ic107$, new SubLObject[] { module0656.f39842(var6), var43, module0656.f39842(var44), module0656.f39842(var56) });
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)module0670.$ic108$, new SubLObject[] { module0656.f39842(var6), var43, module0656.f39842(var44) });
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var57);
            final SubLObject var60 = module0014.f697((SubLObject)module0670.$ic109$);
            final SubLObject var61 = (SubLObject)module0670.$ic74$;
            final SubLObject var62 = module0014.f694((SubLObject)module0670.$ic109$);
            final SubLObject var63 = (SubLObject)module0670.ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var60);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var62) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var62);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            if (module0670.NIL != var61) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0642.f39049(var61));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            if (module0670.NIL != var63) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var63);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_61 = module0015.$g533$.currentBinding(var57);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var57);
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
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40922(final SubLObject var6, final SubLObject var43, final SubLObject var44) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0670.NIL != module0333.f22416(var44) || module0670.NIL != module0349.f23389(var44) || module0670.NIL != module0349.f23395(var44) || module0670.NIL != module0349.f23397(var44));
    }
    
    public static SubLObject f40925(final SubLObject var6, final SubLObject var43, final SubLObject var44, SubLObject var56) {
        if (var56 == module0670.UNPROVIDED) {
            var56 = (SubLObject)module0670.NIL;
        }
        final SubLThread var57 = SubLProcess.currentSubLThread();
        final SubLObject var58 = module0656.f39832((SubLObject)module0670.$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        if (module0670.NIL != var56) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)module0670.$ic111$, new SubLObject[] { module0656.f39842(var6), var43, module0656.f39842(var44), module0656.f39842(var56) });
        }
        else {
            PrintLow.format(module0015.$g131$.getDynamicValue(var57), (SubLObject)module0670.$ic112$, new SubLObject[] { module0656.f39842(var6), var43, module0656.f39842(var44) });
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var58) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var58);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var59 = module0015.$g533$.currentBinding(var57);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var57);
            final SubLObject var60 = module0014.f697((SubLObject)module0670.$ic113$);
            final SubLObject var61 = (SubLObject)module0670.$ic74$;
            final SubLObject var62 = module0014.f694((SubLObject)module0670.$ic113$);
            final SubLObject var63 = (SubLObject)module0670.ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var60);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var62) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var62);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            if (module0670.NIL != var61) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0642.f39049(var61));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            if (module0670.NIL != var63) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var63);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_62 = module0015.$g533$.currentBinding(var57);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var57);
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
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40923(final SubLObject var6, final SubLObject var43, final SubLObject var44) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0670.NIL != module0260.f17099(var44, (SubLObject)module0670.$ic115$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED) && var43.eql((SubLObject)module0670.ONE_INTEGER));
    }
    
    public static SubLObject f40926(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0670.NIL;
        SubLObject var3 = (SubLObject)module0670.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0670.$ic116$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0670.$ic116$);
        var3 = var4.first();
        var4 = var4.rest();
        if (module0670.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0670.$ic116$);
            return (SubLObject)module0670.NIL;
        }
        final SubLObject var5 = module0656.f39969(var2);
        if (module0670.NIL == var5) {
            return module0656.f39789((SubLObject)module0670.$ic6$, var2, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        }
        final SubLObject var6 = Symbols.make_keyword(var3);
        module0670.$g5298$.setDynamicValue(var6);
        return f40910(var5);
    }
    
    public static SubLObject f40927(final SubLObject var6, final SubLObject var14, final SubLObject var7) {
        final SubLThread var15 = SubLProcess.currentSubLThread();
        final SubLObject var16 = module0656.f39931(var6);
        final SubLObject var17 = module0656.f39832((SubLObject)module0670.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var15), (SubLObject)module0670.$ic118$, var16, var14);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var17) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var17);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var18 = module0015.$g533$.currentBinding(var15);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var15);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var18, var15);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f40928(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0670.NIL;
        SubLObject var3 = (SubLObject)module0670.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0670.$ic120$);
        var2 = var1.first();
        SubLObject var4 = var1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var4, var1, (SubLObject)module0670.$ic120$);
        var3 = var4.first();
        var4 = var4.rest();
        if (module0670.NIL != var4) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0670.$ic120$);
            return (SubLObject)module0670.NIL;
        }
        final SubLObject var5 = module0656.f39969(var2);
        final SubLObject var6 = reader.read_from_string_ignoring_errors(var3, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL == var5) {
            return module0656.f39789((SubLObject)module0670.$ic6$, var2, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        }
        module0670.$g5300$.setDynamicValue(var6);
        return f40910(var5);
    }
    
    public static SubLObject f40929(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = module0656.f39931(var6);
        final SubLObject var9 = (SubLObject)((module0670.$g5300$.getDynamicValue(var7) == module0670.$ic93$) ? module0670.$ic3$ : module0670.$ic93$);
        final SubLObject var10 = (SubLObject)((module0670.$g5300$.getDynamicValue(var7) == module0670.$ic93$) ? module0670.$ic122$ : module0670.$ic123$);
        final SubLObject var11 = (SubLObject)((module0670.$g5300$.getDynamicValue(var7) == module0670.$ic93$) ? module0670.$ic124$ : module0670.$ic125$);
        final SubLObject var12 = module0656.f39832((SubLObject)module0670.$ic8$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var7), (SubLObject)module0670.$ic126$, var8, var9);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var12) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var12);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var13 = module0015.$g533$.currentBinding(var7);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var7);
            module0642.f39020(module0015.$g230$.getGlobalValue());
            final SubLObject var14 = Sequences.cconcatenate(module0110.$g124$.getDynamicValue(var7), module0014.f683(var11));
            final SubLObject var15 = (SubLObject)module0670.$ic74$;
            final SubLObject var16 = module0014.f679(var11);
            final SubLObject var17 = (SubLObject)module0670.ZERO_INTEGER;
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var14);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var16) {
                module0642.f39020(module0015.$g437$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var16);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            if (module0670.NIL != var15) {
                module0642.f39020(module0015.$g438$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0642.f39049(var15));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            if (module0670.NIL != var17) {
                module0642.f39020(module0015.$g439$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var17);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_76 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var7);
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
        SubLObject var2 = (SubLObject)module0670.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0670.$ic129$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (module0670.NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0670.$ic129$);
            return (SubLObject)module0670.NIL;
        }
        final SubLObject var4 = module0656.f39957(var2, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL == module0212.f13762(var4)) {
            return module0656.f39789((SubLObject)module0670.$ic130$, var2, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        }
        return f40931(var4);
    }
    
    public static SubLObject f40932(SubLObject var6, SubLObject var7) {
        if (var6 == module0670.UNPROVIDED) {
            var6 = (SubLObject)module0670.NIL;
        }
        if (var7 == module0670.UNPROVIDED) {
            var7 = (SubLObject)module0670.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0670.NIL == var7) {
            var7 = (SubLObject)module0670.$ic132$;
        }
        final SubLObject var9 = module0656.f39932(var6);
        final SubLObject var10 = module0656.f39832((SubLObject)module0670.$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)module0670.$ic133$, var9);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var10) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var8);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var11, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40931(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)module0670.$ic135$;
        module0642.f39020((SubLObject)module0670.$ic18$);
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
        final SubLObject var9 = module0014.f672((SubLObject)module0670.$ic19$);
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var9) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var8);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        final SubLObject var10 = module0015.$g535$.currentBinding(var7);
        try {
            module0015.$g535$.bind((SubLObject)module0670.T, var7);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_81 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                final SubLObject var11 = module0656.f39832((SubLObject)module0670.NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var7));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                if (module0670.NIL != var11) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(var11);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_82 = module0015.$g533$.currentBinding(var7);
                final SubLObject var12 = module0015.$g541$.currentBinding(var7);
                final SubLObject var13 = module0015.$g539$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var7);
                    module0015.$g541$.bind((SubLObject)module0670.T, var7);
                    module0015.$g539$.bind(module0015.f797(), var7);
                    module0642.f39069((SubLObject)module0670.$ic137$, (SubLObject)module0670.T, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var14 = (SubLObject)module0670.FIVE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0670.NIL != var14) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(var14);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_83 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var7);
                        module0642.f39021(var8);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_83, var7);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39019((SubLObject)module0670.$ic138$);
                    module0642.f39032((SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0656.f39915(var6, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)module0670.TWO_INTEGER);
                    module0642.f39074((SubLObject)module0670.$ic139$, (SubLObject)module0670.$ic140$, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39032((SubLObject)module0670.TWO_INTEGER);
                    module0642.f39073((SubLObject)module0670.$ic141$);
                    module0642.f39032((SubLObject)module0670.FOUR_INTEGER);
                    module0642.f39074((SubLObject)module0670.$ic142$, (SubLObject)module0670.$ic143$, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39026((SubLObject)module0670.TWO_INTEGER);
                    final SubLObject var16;
                    final SubLObject var15 = var16 = module0670.$g5299$.getDynamicValue(var7);
                    final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0670.$ic144$, var16);
                    final SubLObject var18 = (SubLObject)((module0670.NIL != var17) ? conses_high.cadr(var17) : module0670.NIL);
                    final SubLObject var19 = cdestructuring_bind.property_list_member((SubLObject)module0670.$ic145$, var16);
                    final SubLObject var20 = (SubLObject)((module0670.NIL != var19) ? conses_high.cadr(var19) : module0670.NIL);
                    final SubLObject var21 = cdestructuring_bind.property_list_member((SubLObject)module0670.$ic146$, var16);
                    final SubLObject var22 = (SubLObject)((module0670.NIL != var21) ? conses_high.cadr(var21) : module0670.NIL);
                    final SubLObject var23 = cdestructuring_bind.property_list_member((SubLObject)module0670.$ic147$, var16);
                    final SubLObject var24 = (SubLObject)((module0670.NIL != var23) ? conses_high.cadr(var23) : module0670.NIL);
                    final SubLObject var25 = module0224.f14706(var6);
                    var7.resetMultipleValues();
                    SubLObject var26 = module0224.f14730(var25, module0670.$g5299$.getDynamicValue(var7));
                    SubLObject var27 = var7.secondMultipleValue();
                    var7.resetMultipleValues();
                    var26 = conses_high.union(var18, var26, Symbols.symbol_function((SubLObject)module0670.EQ), (SubLObject)module0670.UNPROVIDED);
                    var27 = conses_high.union(var22, var27, Symbols.symbol_function((SubLObject)module0670.EQ), (SubLObject)module0670.UNPROVIDED);
                    module0642.f39069((SubLObject)module0670.$ic65$, module0656.f39932(var6), (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_84 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var7);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_85 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var7);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_86 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                final SubLObject var28 = (SubLObject)module0670.FIVE_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0670.NIL != var28) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(var28);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_87 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                    module0642.f39019((SubLObject)module0670.$ic148$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_87, var7);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                if (module0670.NIL != var20) {
                                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0670.$ic149$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    SubLObject var29 = var20;
                                    SubLObject var30 = (SubLObject)module0670.NIL;
                                    var30 = var29.first();
                                    while (module0670.NIL != var29) {
                                        module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                        f40933(var30);
                                        module0642.f39032((SubLObject)module0670.UNPROVIDED);
                                        module0656.f39915(var30, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                        var29 = var29.rest();
                                        var30 = var29.first();
                                    }
                                }
                                module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                module0642.f39019((SubLObject)module0670.$ic150$);
                                module0642.f39075((SubLObject)module0670.$ic151$, (SubLObject)module0670.$ic89$, (SubLObject)module0670.$ic152$);
                                module0642.f39032((SubLObject)module0670.ONE_INTEGER);
                                module0666.f40467((SubLObject)module0670.$ic151$, (SubLObject)module0670.$ic153$, module0670.$ic154$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39026((SubLObject)module0670.TWO_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_86, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_88 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                module0642.f39032((SubLObject)module0670.FOUR_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_88, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_89 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                final SubLObject var28 = (SubLObject)module0670.FIVE_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0670.NIL != var28) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(var28);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_90 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                    module0642.f39019((SubLObject)module0670.$ic155$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_90, var7);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                if (module0670.NIL != var24) {
                                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0670.$ic149$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    SubLObject var29 = var24;
                                    SubLObject var30 = (SubLObject)module0670.NIL;
                                    var30 = var29.first();
                                    while (module0670.NIL != var29) {
                                        module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                        f40934(var30);
                                        module0642.f39032((SubLObject)module0670.UNPROVIDED);
                                        module0656.f39915(var30, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                        var29 = var29.rest();
                                        var30 = var29.first();
                                    }
                                }
                                module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                module0642.f39019((SubLObject)module0670.$ic150$);
                                module0642.f39075((SubLObject)module0670.$ic156$, (SubLObject)module0670.$ic89$, (SubLObject)module0670.$ic152$);
                                module0642.f39032((SubLObject)module0670.ONE_INTEGER);
                                module0666.f40467((SubLObject)module0670.$ic156$, (SubLObject)module0670.$ic153$, module0670.$ic154$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39026((SubLObject)module0670.TWO_INTEGER);
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_91 = module0015.$g533$.currentBinding(var7);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var7);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_92 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                final SubLObject var28 = (SubLObject)module0670.FIVE_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0670.NIL != var28) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(var28);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_93 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                    module0642.f39019((SubLObject)module0670.$ic157$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_93, var7);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                if (module0670.NIL == var26) {
                                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var31 = (SubLObject)module0670.$ic158$;
                                    module0642.f39020(module0015.$g219$.getGlobalValue());
                                    if (module0670.NIL != var31) {
                                        module0642.f39020(module0015.$g222$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39042(var31));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    }
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_94 = module0015.$g533$.currentBinding(var7);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                        module0642.f39019((SubLObject)module0670.$ic159$);
                                    }
                                    finally {
                                        module0015.$g533$.rebind(var11_94, var7);
                                    }
                                    module0642.f39020(module0015.$g220$.getGlobalValue());
                                }
                                if (module0670.NIL != var26) {
                                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0670.$ic160$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    SubLObject var29 = var26;
                                    SubLObject var32 = (SubLObject)module0670.NIL;
                                    var32 = var29.first();
                                    while (module0670.NIL != var29) {
                                        module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                        f40935(var32);
                                        module0642.f39032((SubLObject)module0670.UNPROVIDED);
                                        module0656.f39915(var32, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
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
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_95 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                module0642.f39032((SubLObject)module0670.FOUR_INTEGER);
                            }
                            finally {
                                module0015.$g533$.rebind(var11_95, var7);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_96 = module0015.$g533$.currentBinding(var7);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                final SubLObject var28 = (SubLObject)module0670.FIVE_INTEGER;
                                module0642.f39020(module0015.$g219$.getGlobalValue());
                                if (module0670.NIL != var28) {
                                    module0642.f39020(module0015.$g221$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(var28);
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                }
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_97 = module0015.$g533$.currentBinding(var7);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var7);
                                    module0642.f39019((SubLObject)module0670.$ic161$);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_97, var7);
                                }
                                module0642.f39020(module0015.$g220$.getGlobalValue());
                                if (module0670.NIL == var27) {
                                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                    module0642.f39019((SubLObject)module0670.$ic159$);
                                }
                                if (module0670.NIL != var27) {
                                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0015.$g230$.getGlobalValue());
                                    module0642.f39020(module0015.$g224$.getGlobalValue());
                                    module0642.f39019((SubLObject)module0670.$ic162$);
                                    module0642.f39020(module0015.$g225$.getGlobalValue());
                                    module0642.f39020(module0015.$g231$.getGlobalValue());
                                    SubLObject var29 = var27;
                                    SubLObject var32 = (SubLObject)module0670.NIL;
                                    var32 = var29.first();
                                    while (module0670.NIL != var29) {
                                        module0642.f39026((SubLObject)module0670.UNPROVIDED);
                                        f40936(var32);
                                        module0642.f39032((SubLObject)module0670.UNPROVIDED);
                                        module0656.f39915(var32, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
                module0642.f39029((SubLObject)module0670.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var11_81, var7);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var10, var7);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40933(final SubLObject var104) {
        return module0642.f39068(Sequences.cconcatenate((SubLObject)module0670.$ic163$, module0006.f203(module0656.f39932(var104))), (SubLObject)module0670.$ic164$, (SubLObject)module0670.NIL, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40934(final SubLObject var104) {
        return module0642.f39068(Sequences.cconcatenate((SubLObject)module0670.$ic165$, module0006.f203(module0656.f39932(var104))), (SubLObject)module0670.$ic164$, (SubLObject)module0670.NIL, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40935(final SubLObject var113) {
        return module0642.f39068(Sequences.cconcatenate((SubLObject)module0670.$ic166$, module0006.f203(module0656.f39932(var113))), (SubLObject)module0670.$ic164$, (SubLObject)module0670.NIL, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40936(final SubLObject var113) {
        return module0642.f39068(Sequences.cconcatenate((SubLObject)module0670.$ic167$, module0006.f203(module0656.f39932(var113))), (SubLObject)module0670.$ic164$, (SubLObject)module0670.NIL, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40937(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0642.f39104((SubLObject)module0670.$ic65$, var1);
        final SubLObject var4 = module0656.f39957(var3, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != module0642.f39104((SubLObject)module0670.$ic143$, var1)) {
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
        SubLObject var2 = (SubLObject)module0670.NIL;
        SubLObject var3 = (SubLObject)module0670.NIL;
        SubLObject var4 = (SubLObject)module0670.NIL;
        SubLObject var5 = (SubLObject)module0670.NIL;
        SubLObject var6 = (SubLObject)module0670.NIL;
        SubLObject var7 = (SubLObject)module0670.NIL;
        final SubLObject var8 = module0642.f39104((SubLObject)module0670.$ic151$, var1);
        if (module0670.NIL == module0038.f2608(var8)) {
            final SubLObject var9 = module0656.f39957(var8, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var9) {
                var2 = var9;
            }
        }
        final SubLObject var10 = module0642.f39104((SubLObject)module0670.$ic156$, var1);
        if (module0670.NIL == module0038.f2608(var10)) {
            final SubLObject var11 = module0656.f39957(var10, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var11) {
                var4 = var11;
            }
        }
        SubLObject var12 = var1;
        SubLObject var13 = (SubLObject)module0670.NIL;
        var13 = var12.first();
        while (module0670.NIL != var12) {
            if (var13.isCons()) {
                SubLObject var15;
                final SubLObject var14 = var15 = var13;
                SubLObject var16 = (SubLObject)module0670.NIL;
                SubLObject var17 = (SubLObject)module0670.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0670.$ic169$);
                var16 = var15.first();
                var15 = var15.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0670.$ic169$);
                var17 = var15.first();
                var15 = var15.rest();
                if (module0670.NIL == var15) {
                    if (module0670.NIL != module0038.f2684(var16, (SubLObject)module0670.$ic166$)) {
                        final SubLObject var18 = module0038.f2623(var16, (SubLObject)module0670.SEVEN_INTEGER, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var20;
                        final SubLObject var19 = var20 = module0656.f39957(var18, (SubLObject)module0670.UNPROVIDED);
                        if (module0670.NIL != var20) {
                            var7 = (SubLObject)ConsesLow.cons(var20, var7);
                        }
                    }
                    else if (module0670.NIL != module0038.f2684(var16, (SubLObject)module0670.$ic167$)) {
                        final SubLObject var18 = module0038.f2623(var16, (SubLObject)module0670.SIX_INTEGER, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var20;
                        final SubLObject var19 = var20 = module0656.f39957(var18, (SubLObject)module0670.UNPROVIDED);
                        if (module0670.NIL != var20) {
                            var6 = (SubLObject)ConsesLow.cons(var20, var6);
                        }
                    }
                    else if (module0670.NIL != module0038.f2684(var16, (SubLObject)module0670.$ic165$)) {
                        final SubLObject var18 = module0038.f2623(var16, (SubLObject)module0670.NINETEEN_INTEGER, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var20;
                        final SubLObject var19 = var20 = module0656.f39957(var18, (SubLObject)module0670.UNPROVIDED);
                        if (module0670.NIL != var20) {
                            var5 = (SubLObject)ConsesLow.cons(var20, var5);
                        }
                    }
                    else if (module0670.NIL != module0038.f2684(var16, (SubLObject)module0670.$ic163$)) {
                        final SubLObject var18 = module0038.f2623(var16, (SubLObject)module0670.EIGHTEEN_INTEGER, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var20;
                        final SubLObject var19 = var20 = module0656.f39957(var18, (SubLObject)module0670.UNPROVIDED);
                        if (module0670.NIL != var20) {
                            var3 = (SubLObject)ConsesLow.cons(var20, var3);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var14, (SubLObject)module0670.$ic169$);
                }
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return Values.values(var2, var3, var4, var5, var6, var7);
    }
    
    public static SubLObject f40938() {
        final SubLThread var9 = SubLProcess.currentSubLThread();
        module0670.$g5299$.setDynamicValue(Symbols.remprop((SubLObject)module0670.$ic145$, module0670.$g5299$.getDynamicValue(var9)), var9);
        module0670.$g5299$.setDynamicValue(Symbols.remprop((SubLObject)module0670.$ic147$, module0670.$g5299$.getDynamicValue(var9)), var9);
        module0670.$g5299$.setDynamicValue(Symbols.remprop((SubLObject)module0670.$ic144$, module0670.$g5299$.getDynamicValue(var9)), var9);
        module0670.$g5299$.setDynamicValue(Symbols.remprop((SubLObject)module0670.$ic146$, module0670.$g5299$.getDynamicValue(var9)), var9);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40940(final SubLObject var118, final SubLObject var119, final SubLObject var120, final SubLObject var121, final SubLObject var122, final SubLObject var123) {
        final SubLThread var124 = SubLProcess.currentSubLThread();
        if (module0670.NIL != var118 || module0670.NIL != var119) {
            SubLObject var125 = conses_high.getf(module0670.$g5299$.getDynamicValue(var124), (SubLObject)module0670.$ic145$, (SubLObject)module0670.NIL);
            if (module0670.NIL != var118 && module0670.NIL == conses_high.member(var118, var125, Symbols.symbol_function((SubLObject)module0670.EQL), Symbols.symbol_function((SubLObject)module0670.IDENTITY))) {
                var125 = (SubLObject)ConsesLow.cons(var118, var125);
            }
            SubLObject var126 = var119;
            SubLObject var127 = (SubLObject)module0670.NIL;
            var127 = var126.first();
            while (module0670.NIL != var126) {
                var125 = module0035.f2073(var127, var125, Symbols.symbol_function((SubLObject)module0670.EQ));
                var126 = var126.rest();
                var127 = var126.first();
            }
            module0670.$g5299$.setDynamicValue(conses_high.putf(module0670.$g5299$.getDynamicValue(var124), (SubLObject)module0670.$ic145$, var125), var124);
        }
        if (module0670.NIL != var120 || module0670.NIL != var121) {
            SubLObject var125 = conses_high.getf(module0670.$g5299$.getDynamicValue(var124), (SubLObject)module0670.$ic147$, (SubLObject)module0670.NIL);
            if (module0670.NIL != var120 && module0670.NIL == conses_high.member(var120, var125, Symbols.symbol_function((SubLObject)module0670.EQL), Symbols.symbol_function((SubLObject)module0670.IDENTITY))) {
                var125 = (SubLObject)ConsesLow.cons(var120, var125);
            }
            SubLObject var126 = var121;
            SubLObject var127 = (SubLObject)module0670.NIL;
            var127 = var126.first();
            while (module0670.NIL != var126) {
                var125 = module0035.f2073(var127, var125, Symbols.symbol_function((SubLObject)module0670.EQ));
                var126 = var126.rest();
                var127 = var126.first();
            }
            module0670.$g5299$.setDynamicValue(conses_high.putf(module0670.$g5299$.getDynamicValue(var124), (SubLObject)module0670.$ic147$, var125), var124);
        }
        if (module0670.NIL != var122 || module0670.NIL != var123) {
            SubLObject var128 = conses_high.getf(module0670.$g5299$.getDynamicValue(var124), (SubLObject)module0670.$ic144$, (SubLObject)module0670.NIL);
            SubLObject var129 = conses_high.getf(module0670.$g5299$.getDynamicValue(var124), (SubLObject)module0670.$ic146$, (SubLObject)module0670.NIL);
            SubLObject var126 = var122;
            SubLObject var130 = (SubLObject)module0670.NIL;
            var130 = var126.first();
            while (module0670.NIL != var126) {
                var129 = module0035.f2073(var130, var129, Symbols.symbol_function((SubLObject)module0670.EQ));
                final SubLObject var131 = var130;
                if (module0670.NIL == conses_high.member(var131, var128, Symbols.symbol_function((SubLObject)module0670.EQ), Symbols.symbol_function((SubLObject)module0670.IDENTITY))) {
                    var128 = (SubLObject)ConsesLow.cons(var131, var128);
                }
                var126 = var126.rest();
                var130 = var126.first();
            }
            var126 = var123;
            var130 = (SubLObject)module0670.NIL;
            var130 = var126.first();
            while (module0670.NIL != var126) {
                var128 = module0035.f2073(var130, var128, Symbols.symbol_function((SubLObject)module0670.EQ));
                final SubLObject var131 = var130;
                if (module0670.NIL == conses_high.member(var131, var129, Symbols.symbol_function((SubLObject)module0670.EQ), Symbols.symbol_function((SubLObject)module0670.IDENTITY))) {
                    var129 = (SubLObject)ConsesLow.cons(var131, var129);
                }
                var126 = var126.rest();
                var130 = var126.first();
            }
            module0670.$g5299$.setDynamicValue(conses_high.putf(module0670.$g5299$.getDynamicValue(var124), (SubLObject)module0670.$ic144$, var128), var124);
            module0670.$g5299$.setDynamicValue(conses_high.putf(module0670.$g5299$.getDynamicValue(var124), (SubLObject)module0670.$ic146$, var129), var124);
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40941(final SubLObject var1) {
        SubLObject var2 = (SubLObject)module0670.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0670.$ic129$);
        var2 = var1.first();
        final SubLObject var3 = var1.rest();
        if (module0670.NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0670.$ic129$);
            return (SubLObject)module0670.NIL;
        }
        final SubLObject var4 = module0656.f39957(var2, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL == module0212.f13762(var4)) {
            return module0656.f39789((SubLObject)module0670.$ic130$, var2, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        }
        return f40942(var4);
    }
    
    public static SubLObject f40943(SubLObject var6, SubLObject var7) {
        if (var6 == module0670.UNPROVIDED) {
            var6 = (SubLObject)module0670.NIL;
        }
        if (var7 == module0670.UNPROVIDED) {
            var7 = (SubLObject)module0670.NIL;
        }
        final SubLThread var8 = SubLProcess.currentSubLThread();
        if (module0670.NIL == var7) {
            var7 = (SubLObject)module0670.$ic171$;
        }
        final SubLObject var9 = module0656.f39932(var6);
        final SubLObject var10 = module0656.f39832((SubLObject)module0670.$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        PrintLow.format(module0015.$g131$.getDynamicValue(var8), (SubLObject)module0670.$ic172$, var9);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var10) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var10);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var11 = module0015.$g533$.currentBinding(var8);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var8);
            module0642.f39019(var7);
        }
        finally {
            module0015.$g533$.rebind(var11, var8);
        }
        module0642.f39020(module0015.$g382$.getGlobalValue());
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40942(final SubLObject var6) {
        final SubLThread var7 = SubLProcess.currentSubLThread();
        final SubLObject var8 = (SubLObject)module0670.$ic174$;
        module0642.f39020((SubLObject)module0670.$ic18$);
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g155$.getGlobalValue());
        module0642.f39020(module0015.$g153$.getGlobalValue());
        module0015.f718();
        module0655.f39766();
        module0642.f39064(module0655.$g5143$.getDynamicValue(var7), module0655.$g5142$.getDynamicValue(var7));
        final SubLObject var9 = module0014.f672((SubLObject)module0670.$ic19$);
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g175$.getGlobalValue());
        module0642.f39020(module0015.$g176$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic20$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var9) {
            module0642.f39020(module0015.$g178$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var9);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39020(module0015.$g177$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020((SubLObject)module0670.$ic21$);
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g173$.getGlobalValue());
        module0642.f39019(var8);
        module0642.f39020(module0015.$g174$.getGlobalValue());
        module0666.f40471();
        module0642.f39020(module0015.$g154$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        final SubLObject var10 = module0015.$g535$.currentBinding(var7);
        try {
            module0015.$g535$.bind((SubLObject)module0670.T, var7);
            module0642.f39020(module0015.$g133$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_139 = module0015.$g533$.currentBinding(var7);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var7);
                final SubLObject var11 = module0656.f39832((SubLObject)module0670.NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var7));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                if (module0670.NIL != var11) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(var11);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_140 = module0015.$g533$.currentBinding(var7);
                final SubLObject var12 = module0015.$g541$.currentBinding(var7);
                final SubLObject var13 = module0015.$g539$.currentBinding(var7);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var7);
                    module0015.$g541$.bind((SubLObject)module0670.T, var7);
                    module0015.$g539$.bind(module0015.f797(), var7);
                    module0642.f39069((SubLObject)module0670.$ic175$, (SubLObject)module0670.T, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var14 = (SubLObject)module0670.FIVE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0670.NIL != var14) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(var14);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_141 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var7);
                        module0642.f39021(var8);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_141, var7);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39019((SubLObject)module0670.$ic138$);
                    module0642.f39032((SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                    module0642.f39020(module0015.$g234$.getGlobalValue());
                    module0656.f39915(var6, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g235$.getGlobalValue());
                    module0642.f39026((SubLObject)module0670.TWO_INTEGER);
                    module0642.f39074((SubLObject)module0670.$ic139$, (SubLObject)module0670.$ic140$, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39032((SubLObject)module0670.TWO_INTEGER);
                    module0642.f39073((SubLObject)module0670.$ic141$);
                    module0642.f39026((SubLObject)module0670.TWO_INTEGER);
                    final SubLObject var16;
                    final SubLObject var15 = var16 = module0670.$g5299$.getDynamicValue(var7);
                    final SubLObject var17 = cdestructuring_bind.property_list_member((SubLObject)module0670.$ic176$, var16);
                    final SubLObject var18 = (SubLObject)((module0670.NIL != var17) ? conses_high.cadr(var17) : module0670.NIL);
                    final SubLObject var19 = module0224.f14708(var6);
                    module0642.f39069((SubLObject)module0670.$ic65$, module0656.f39932(var6), (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var20 = (SubLObject)module0670.FIVE_INTEGER;
                    module0642.f39020(module0015.$g219$.getGlobalValue());
                    if (module0670.NIL != var20) {
                        module0642.f39020(module0015.$g221$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(var20);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    }
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_142 = module0015.$g533$.currentBinding(var7);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var7);
                        module0642.f39019((SubLObject)module0670.$ic177$);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_142, var7);
                    }
                    module0642.f39020(module0015.$g220$.getGlobalValue());
                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39020(module0015.$g224$.getGlobalValue());
                    module0642.f39019((SubLObject)module0670.$ic178$);
                    module0642.f39020(module0015.$g225$.getGlobalValue());
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                    SubLObject var21 = (SubLObject)module0670.$ic179$;
                    SubLObject var22 = (SubLObject)module0670.NIL;
                    var22 = var21.first();
                    while (module0670.NIL != var21) {
                        module0642.f39026((SubLObject)module0670.UNPROVIDED);
                        f40944(var22, var18);
                        module0642.f39032((SubLObject)module0670.UNPROVIDED);
                        f40945(var22);
                        var21 = var21.rest();
                        var22 = var21.first();
                    }
                    module0642.f39026((SubLObject)module0670.TWO_INTEGER);
                    module0642.f39020(module0015.$g230$.getGlobalValue());
                    module0642.f39020(module0015.$g224$.getGlobalValue());
                    module0642.f39019((SubLObject)module0670.$ic180$);
                    module0642.f39020(module0015.$g225$.getGlobalValue());
                    module0642.f39020(module0015.$g231$.getGlobalValue());
                    var21 = var19;
                    var22 = (SubLObject)module0670.NIL;
                    var22 = var21.first();
                    while (module0670.NIL != var21) {
                        if (!var22.equal(var6)) {
                            module0642.f39026((SubLObject)module0670.UNPROVIDED);
                            f40944(var22, var18);
                            module0642.f39032((SubLObject)module0670.UNPROVIDED);
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
                module0642.f39029((SubLObject)module0670.UNPROVIDED);
                module0642.f39050();
            }
            finally {
                module0015.$g533$.rebind(var11_139, var7);
            }
            module0642.f39020(module0015.$g134$.getGlobalValue());
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
        }
        finally {
            module0015.$g535$.rebind(var10, var7);
        }
        module0642.f39020(module0015.$g156$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40944(final SubLObject var42, final SubLObject var145) {
        final SubLObject var146 = (SubLObject)SubLObjectFactory.makeBoolean((module0670.NIL == var145 && var42 == module0670.$ic181$) || var42.eql(var145));
        final SubLObject var147 = (module0670.NIL != module0173.f10955(var42)) ? module0656.f39842(var42) : print_high.prin1_to_string(var42);
        return module0642.f39072((SubLObject)module0670.$ic182$, var147, var146, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40946(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)module0670.$ic65$, var1);
        final SubLObject var3 = module0656.f39957(var2, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var4 = f40947(var1);
        f40948(var4);
        return f40942(var3);
    }
    
    public static SubLObject f40945(final SubLObject var42) {
        final SubLThread var43 = SubLProcess.currentSubLThread();
        if (var42.eql((SubLObject)module0670.$ic8$)) {
            module0642.f39019((SubLObject)module0670.$ic184$);
        }
        else if (var42.eql((SubLObject)module0670.$ic185$)) {
            module0642.f39019((SubLObject)module0670.$ic186$);
        }
        else if (var42.eql((SubLObject)module0670.$ic187$)) {
            module0642.f39019((SubLObject)module0670.$ic188$);
        }
        else if (var42.eql((SubLObject)module0670.$ic181$)) {
            module0642.f39019((SubLObject)module0670.$ic189$);
        }
        else {
            final SubLObject var45;
            final SubLObject var44 = var45 = module0656.f39799(var42, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0670.NIL != var45) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var45);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var46 = module0015.$g533$.currentBinding(var43);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var43);
                module0656.f39915(var42, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            }
            finally {
                module0015.$g533$.rebind(var46, var43);
            }
            module0642.f39020(module0015.$g220$.getGlobalValue());
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40947(final SubLObject var1) {
        final SubLObject var2 = module0642.f39104((SubLObject)module0670.$ic182$, var1);
        final SubLObject var3 = module0656.f39943(var2, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != module0173.f10955(var3)) {
            return var3;
        }
        return reader.read_from_string_ignoring_errors(var2, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40948(SubLObject var145) {
        final SubLThread var146 = SubLProcess.currentSubLThread();
        if (var145 == module0670.$ic181$) {
            var145 = (SubLObject)module0670.NIL;
        }
        module0670.$g5299$.setDynamicValue(conses_high.putf(module0670.$g5299$.getDynamicValue(var146), (SubLObject)module0670.$ic176$, var145), var146);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40949(final SubLObject var6, final SubLObject var151, SubLObject var42, SubLObject var43, SubLObject var44) {
        if (var42 == module0670.UNPROVIDED) {
            var42 = (SubLObject)module0670.NIL;
        }
        if (var43 == module0670.UNPROVIDED) {
            var43 = (SubLObject)module0670.NIL;
        }
        if (var44 == module0670.UNPROVIDED) {
            var44 = (SubLObject)module0670.NIL;
        }
        final SubLThread var152 = SubLProcess.currentSubLThread();
        final SubLObject var153 = var151.isString() ? var151 : module0656.f39865(var151);
        final SubLObject var154 = module0656.f39799(var151, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var155 = module0656.f39832((SubLObject)module0670.$ic106$);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0655.f39768();
        if (module0670.NIL != var42 && module0670.NIL != var43 && module0670.NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var152), (SubLObject)module0670.$ic190$, new SubLObject[] { module0656.f39931(var6), module0656.f39931(var42), var43, module0656.f39931(var44) });
        }
        else if (module0670.NIL == var42 && module0670.NIL != var43 && module0670.NIL != var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var152), (SubLObject)module0670.$ic190$, new SubLObject[] { module0656.f39931(var6), module0670.NIL, var43, module0656.f39931(var44) });
        }
        else if (module0670.NIL != var42 && module0670.NIL == var43 && module0670.NIL == var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var152), (SubLObject)module0670.$ic191$, module0656.f39931(var6), module0656.f39931(var42));
        }
        else if (module0670.NIL == var42 && module0670.NIL == var43 && module0670.NIL == var44) {
            PrintLow.format(module0015.$g131$.getDynamicValue(var152), (SubLObject)module0670.$ic192$, module0656.f39931(var6));
        }
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        if (module0670.NIL != var155) {
            module0642.f39020(module0015.$g387$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var155);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var156 = module0015.$g533$.currentBinding(var152);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var152);
            final SubLObject var157 = var154;
            module0642.f39020(module0015.$g219$.getGlobalValue());
            if (module0670.NIL != var157) {
                module0642.f39020(module0015.$g221$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var157);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_153 = module0015.$g533$.currentBinding(var152);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var152);
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
        SubLObject var2 = (SubLObject)module0670.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var1, var1, (SubLObject)module0670.$ic194$);
        var2 = var1.first();
        SubLObject var3 = var1.rest();
        final SubLObject var4 = (SubLObject)(var3.isCons() ? var3.first() : module0670.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var3, var1, (SubLObject)module0670.$ic194$);
        var3 = var3.rest();
        final SubLObject var5 = (SubLObject)(var3.isCons() ? var3.first() : module0670.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var3, var1, (SubLObject)module0670.$ic194$);
        var3 = var3.rest();
        final SubLObject var6 = (SubLObject)(var3.isCons() ? var3.first() : module0670.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(var3, var1, (SubLObject)module0670.$ic194$);
        var3 = var3.rest();
        if (module0670.NIL != var3) {
            cdestructuring_bind.cdestructuring_bind_error(var1, (SubLObject)module0670.$ic194$);
            return (SubLObject)module0670.NIL;
        }
        SubLObject var7 = (SubLObject)module0670.NIL;
        SubLObject var8 = (SubLObject)module0670.NIL;
        SubLObject var9 = (SubLObject)module0670.NIL;
        SubLObject var10 = (SubLObject)module0670.NIL;
        var7 = module0656.f39969(var2);
        if (module0670.NIL == module0212.f13762(var7)) {
            return module0656.f39789((SubLObject)module0670.$ic195$, var2, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
        }
        if (module0670.NIL != var4 && !module0670.$ic196$.equal(var4)) {
            var8 = module0656.f39969(var4);
            if (module0670.NIL == module0212.f13762(var8)) {
                return module0656.f39789((SubLObject)module0670.$ic195$, var4, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            }
        }
        if (module0670.NIL != var5) {
            var9 = reader.read_from_string_ignoring_errors(var5, (SubLObject)module0670.NIL, (SubLObject)module0670.NIL, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            if (!var9.isInteger()) {
                return module0656.f39789((SubLObject)module0670.$ic197$, var5, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            }
        }
        if (module0670.NIL != var6) {
            var10 = module0656.f39943(var6, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL == module0173.f10955(var10)) {
                return module0656.f39789((SubLObject)module0670.$ic195$, var6, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            }
        }
        return f40951(var7, var8, var9, var10);
    }
    
    public static SubLObject f40951(final SubLObject var6, final SubLObject var42, final SubLObject var43, final SubLObject var113) {
        final SubLThread var114 = SubLProcess.currentSubLThread();
        final SubLObject var115 = module0670.$g5299$.getDynamicValue(var114);
        final SubLObject var116 = module0670.$g5298$.getDynamicValue(var114);
        final SubLObject var117 = module0224.f14703(var6, var115, var116);
        final SubLObject var118 = f40952(var117, var42, var43, var113);
        final SubLObject var119 = module0224.f14707(var6, var118, var116);
        final SubLObject var121;
        final SubLObject var120 = var121 = PrintLow.format((SubLObject)module0670.NIL, (SubLObject)module0670.$ic199$, var6);
        final SubLObject var122 = module0015.$g538$.currentBinding(var114);
        try {
            module0015.$g538$.bind((module0670.NIL != module0057.f4158(module0015.$g538$.getDynamicValue(var114))) ? module0015.$g538$.getDynamicValue(var114) : module0057.f4173((SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED), var114);
            module0642.f39020((SubLObject)module0670.$ic18$);
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
            module0642.f39020(module0015.$g155$.getGlobalValue());
            module0642.f39020(module0015.$g153$.getGlobalValue());
            module0015.f718();
            module0655.f39766();
            module0642.f39064(module0655.$g5143$.getDynamicValue(var114), module0655.$g5142$.getDynamicValue(var114));
            final SubLObject var123 = module0014.f672((SubLObject)module0670.$ic19$);
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
            module0642.f39020(module0015.$g175$.getGlobalValue());
            module0642.f39020(module0015.$g176$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.$ic20$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var123) {
                module0642.f39020(module0015.$g178$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var123);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39020(module0015.$g177$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.$ic21$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var121) {
                module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_163 = module0015.$g535$.currentBinding(var114);
            try {
                module0015.$g535$.bind((SubLObject)module0670.T, var114);
                module0642.f39020(module0015.$g133$.getGlobalValue());
                if (module0670.NIL != module0015.$g132$.getDynamicValue(var114)) {
                    module0642.f39020(module0015.$g135$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0642.f39042(module0015.$g132$.getDynamicValue(var114)));
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39020(module0015.$g137$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic200$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_164 = module0015.$g533$.currentBinding(var114);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var114);
                    module0642.f39020(module0015.$g144$.getGlobalValue());
                    module0642.f39020(module0015.$g157$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020((SubLObject)module0670.$ic201$);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_165 = module0015.$g533$.currentBinding(var114);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var114);
                        module0642.f39020(module0015.$g295$.getGlobalValue());
                        module0642.f39020(module0015.$g305$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020((SubLObject)module0670.$ic202$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g302$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020((SubLObject)module0670.$ic203$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g307$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39019((SubLObject)module0670.$ic204$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g160$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020((SubLObject)module0670.$ic205$);
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    }
                    finally {
                        module0015.$g533$.rebind(var11_165, var114);
                    }
                    module0642.f39020(module0015.$g145$.getGlobalValue());
                    module0669.f40720(var6);
                    f40953(var6, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var124 = var116;
                    if (var124.eql((SubLObject)module0670.$ic0$)) {
                        f40954(var6, var119);
                    }
                    else if (var124.eql((SubLObject)module0670.$ic78$)) {
                        f40955(var6, var119);
                    }
                    else {
                        module0656.f39789((SubLObject)module0670.$ic88$, var116, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                    }
                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
                    module0642.f39050();
                }
                finally {
                    module0015.$g533$.rebind(var11_164, var114);
                }
                module0642.f39020(module0015.$g134$.getGlobalValue());
                module0642.f39029((SubLObject)module0670.UNPROVIDED);
            }
            finally {
                module0015.$g535$.rebind(var11_163, var114);
            }
            module0642.f39020(module0015.$g156$.getGlobalValue());
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
        }
        finally {
            module0015.$g538$.rebind(var122, var114);
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40954(final SubLObject var6, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0669.$g5286$.currentBinding(var31);
        final SubLObject var33 = module0669.$g5287$.currentBinding(var31);
        try {
            module0669.$g5286$.bind((SubLObject)module0670.NIL, var31);
            module0669.$g5287$.bind((SubLObject)module0670.NIL, var31);
            SubLObject var34 = (SubLObject)module0670.NIL;
            SubLObject var35 = (SubLObject)module0670.NIL;
            SubLObject var36 = (SubLObject)module0670.NIL;
            var34 = var30;
            var35 = var34.first();
            for (var36 = (SubLObject)module0670.ZERO_INTEGER; module0670.NIL != var34; var34 = var34.rest(), var35 = var34.first(), var36 = Numbers.add((SubLObject)module0670.ONE_INTEGER, var36)) {
                if (!var36.isZero()) {
                    module0642.f39026((SubLObject)module0670.UNPROVIDED);
                }
                final SubLObject var37 = var35.first();
                final SubLObject var38 = var37.first();
                final SubLObject var39 = conses_high.second(var37);
                f40956(var38, var6, var39);
                module0642.f39026((SubLObject)module0670.TWO_INTEGER);
                SubLObject var40 = var35;
                SubLObject var41 = (SubLObject)module0670.NIL;
                var41 = var40.first();
                while (module0670.NIL != var40) {
                    SubLObject var43;
                    final SubLObject var42 = var43 = var41;
                    SubLObject var41_170 = (SubLObject)module0670.NIL;
                    SubLObject var44 = (SubLObject)module0670.NIL;
                    SubLObject var45 = (SubLObject)module0670.NIL;
                    SubLObject var46 = (SubLObject)module0670.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0670.$ic94$);
                    var41_170 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0670.$ic94$);
                    var44 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0670.$ic94$);
                    var45 = var43.first();
                    var43 = var43.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var43, var42, (SubLObject)module0670.$ic94$);
                    var46 = var43.first();
                    var43 = var43.rest();
                    if (module0670.NIL == var43) {
                        f40957(var6, var41_170, var44, var45, var46);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var42, (SubLObject)module0670.$ic94$);
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
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40955(final SubLObject var6, final SubLObject var30) {
        final SubLThread var31 = SubLProcess.currentSubLThread();
        final SubLObject var32 = module0669.$g5286$.currentBinding(var31);
        final SubLObject var33 = module0669.$g5287$.currentBinding(var31);
        try {
            module0669.$g5286$.bind((SubLObject)module0670.NIL, var31);
            module0669.$g5287$.bind((SubLObject)module0670.NIL, var31);
            final SubLObject var34 = conses_high.getf(module0670.$g5299$.getDynamicValue(var31), (SubLObject)module0670.$ic176$, (SubLObject)module0670.UNPROVIDED);
            SubLObject var35 = (SubLObject)module0670.NIL;
            SubLObject var36 = (SubLObject)module0670.NIL;
            SubLObject var37 = (SubLObject)module0670.NIL;
            var35 = var30;
            var36 = var35.first();
            for (var37 = (SubLObject)module0670.ZERO_INTEGER; module0670.NIL != var35; var35 = var35.rest(), var36 = var35.first(), var37 = Numbers.add((SubLObject)module0670.ONE_INTEGER, var37)) {
                SubLObject var38 = (SubLObject)module0670.NIL;
                SubLObject var166_172 = (SubLObject)module0670.NIL;
                SubLObject var39 = (SubLObject)module0670.NIL;
                SubLObject var40 = (SubLObject)module0670.NIL;
                var166_172 = var36;
                var39 = var166_172.first();
                for (var40 = (SubLObject)module0670.ZERO_INTEGER; module0670.NIL != var166_172; var166_172 = var166_172.rest(), var39 = var166_172.first(), var40 = Numbers.add((SubLObject)module0670.ONE_INTEGER, var40)) {
                    SubLObject var42;
                    final SubLObject var41 = var42 = var39;
                    SubLObject var43 = (SubLObject)module0670.NIL;
                    SubLObject var44 = (SubLObject)module0670.NIL;
                    SubLObject var45 = (SubLObject)module0670.NIL;
                    SubLObject var46 = (SubLObject)module0670.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0670.$ic94$);
                    var43 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0670.$ic94$);
                    var44 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0670.$ic94$);
                    var45 = var42.first();
                    var42 = var42.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(var42, var41, (SubLObject)module0670.$ic94$);
                    var46 = var42.first();
                    var42 = var42.rest();
                    if (module0670.NIL == var42) {
                        if (!var44.equal(var38)) {
                            if (!var37.isZero() || !var40.isZero()) {
                                module0642.f39026((SubLObject)module0670.UNPROVIDED);
                            }
                            if (module0670.$ic8$ != var34) {
                                f40956(var43, var6, var44);
                                module0642.f39026((SubLObject)module0670.UNPROVIDED);
                            }
                        }
                        f40957(var6, var43, var44, var45, var46);
                        var38 = var44;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(var41, (SubLObject)module0670.$ic94$);
                    }
                }
            }
        }
        finally {
            module0669.$g5287$.rebind(var33, var31);
            module0669.$g5286$.rebind(var32, var31);
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40957(final SubLObject var6, final SubLObject var41, final SubLObject var42, final SubLObject var43, final SubLObject var44) {
        final SubLThread var45 = SubLProcess.currentSubLThread();
        if (var41.eql((SubLObject)module0670.$ic206$)) {
            module0656.f39915(var44, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            if (!var43.numE((SubLObject)module0670.ONE_INTEGER)) {
                PrintLow.format(module0015.$g131$.getDynamicValue(var45), (SubLObject)module0670.$ic95$, var43);
            }
            module0642.f39019((SubLObject)module0670.$ic207$);
            module0642.f39032((SubLObject)module0670.UNPROVIDED);
            module0656.f39837((SubLObject)module0670.$ic96$, var6, var43, var44, module0670.$ic97$, (SubLObject)module0670.UNPROVIDED);
            module0642.f39026((SubLObject)module0670.UNPROVIDED);
        }
        else {
            module0669.f40741(var42, var43, var44, (SubLObject)module0670.NIL);
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40958(final SubLObject var113) {
        return module0035.f2294(module0670.$g5301$.getGlobalValue(), var113, Symbols.symbol_function((SubLObject)module0670.EQUAL), (SubLObject)module0670.$ic209$);
    }
    
    public static SubLObject f40956(SubLObject var41, final SubLObject var6, final SubLObject var42) {
        final SubLObject var43 = (SubLObject)(var41.eql(module0670.$ic210$) ? module0670.$ic211$ : module0670.$ic90$);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        module0642.f39019(var43);
        module0642.f39032((SubLObject)module0670.UNPROVIDED);
        if (var41.eql(module0670.$ic210$)) {
            module0642.f39019((SubLObject)module0670.$ic212$);
        }
        else {
            module0656.f39915(var42, (SubLObject)module0670.ZERO_INTEGER, (SubLObject)module0670.NIL);
        }
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (!var41.eql(module0670.$ic210$)) {
            if (var41 == module0670.$ic206$) {
                var41 = module0670.$ic213$;
            }
            final SubLObject var44 = module0202.f12768(var41, var6, var42);
            final SubLObject var45 = f40958(var41);
            final SubLObject var46 = module0191.f11990(var45, var44, module0670.$ic97$, (SubLObject)module0670.UNPROVIDED);
            module0642.f39032((SubLObject)module0670.UNPROVIDED);
            module0642.f39020(module0015.$g238$.getGlobalValue());
            module0642.f39020(module0015.$g230$.getGlobalValue());
            module0656.f39837((SubLObject)module0670.$ic214$, var46, (SubLObject)module0670.$ic215$, (SubLObject)module0670.$ic216$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(module0015.$g231$.getGlobalValue());
            module0642.f39020(module0015.$g239$.getGlobalValue());
            return var46;
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40952(final SubLObject var29, SubLObject var180, SubLObject var181, SubLObject var182) {
        if (var180 == module0670.UNPROVIDED) {
            var180 = (SubLObject)module0670.NIL;
        }
        if (var181 == module0670.UNPROVIDED) {
            var181 = (SubLObject)module0670.NIL;
        }
        if (var182 == module0670.UNPROVIDED) {
            var182 = (SubLObject)module0670.NIL;
        }
        if (module0670.NIL == var180 && module0670.NIL == var181 && module0670.NIL == var182) {
            return var29;
        }
        SubLObject var183 = (SubLObject)module0670.NIL;
        SubLObject var184 = var29;
        SubLObject var185 = (SubLObject)module0670.NIL;
        var185 = var184.first();
        while (module0670.NIL != var184) {
            SubLObject var187;
            final SubLObject var186 = var187 = var185;
            SubLObject var188 = (SubLObject)module0670.NIL;
            SubLObject var189 = (SubLObject)module0670.NIL;
            SubLObject var190 = (SubLObject)module0670.NIL;
            SubLObject var191 = (SubLObject)module0670.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)module0670.$ic94$);
            var188 = var187.first();
            var187 = var187.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)module0670.$ic94$);
            var189 = var187.first();
            var187 = var187.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)module0670.$ic94$);
            var190 = var187.first();
            var187 = var187.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)module0670.$ic94$);
            var191 = var187.first();
            var187 = var187.rest();
            if (module0670.NIL == var187) {
                if ((module0670.NIL == var180 || var189.equal(var180)) && (module0670.NIL == var181 || var190.equal(var181)) && (module0670.NIL == var182 || var191.equal(var182))) {
                    var183 = (SubLObject)ConsesLow.cons(var185, var183);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var186, (SubLObject)module0670.$ic94$);
            }
            var184 = var184.rest();
            var185 = var184.first();
        }
        return Sequences.nreverse(var183);
    }
    
    public static SubLObject f40959(final SubLObject var150) {
        final SubLThread var151 = SubLProcess.currentSubLThread();
        final SubLObject var152 = module0670.$g5299$.currentBinding(var151);
        try {
            module0670.$g5299$.bind(f40960(module0670.$g5299$.getDynamicValue(var151), var150), var151);
            f40951(var150, var150, (SubLObject)module0670.NIL, (SubLObject)module0670.NIL);
        }
        finally {
            module0670.$g5299$.rebind(var152, var151);
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40960(SubLObject var15, final SubLObject var150) {
        var15 = conses_high.copy_list(var15);
        final SubLObject var151 = module0656.f39825(var150);
        var15 = conses_high.putf(var15, (SubLObject)module0670.$ic144$, var151);
        var15 = conses_high.putf(var15, (SubLObject)module0670.$ic145$, (SubLObject)module0670.NIL);
        var15 = conses_high.putf(var15, (SubLObject)module0670.$ic146$, (SubLObject)module0670.NIL);
        var15 = conses_high.putf(var15, (SubLObject)module0670.$ic147$, (SubLObject)module0670.$ic217$);
        return var15;
    }
    
    public static SubLObject f40953(final SubLObject var6, SubLObject var187) {
        if (var187 == module0670.UNPROVIDED) {
            var187 = (SubLObject)module0670.NIL;
        }
        f40961(var6, (SubLObject)module0670.FIVE_INTEGER);
        if (module0670.NIL != module0173.f10955(var6)) {
            module0642.f39032((SubLObject)module0670.UNPROVIDED);
            module0642.f39020(module0015.$g238$.getGlobalValue());
            module0642.f39020(module0015.$g240$.getGlobalValue());
            f40962((SubLObject)module0670.$ic222$, (SubLObject)module0670.$ic223$, (SubLObject)module0670.$ic224$);
            module0642.f39020(module0015.$g241$.getGlobalValue());
            module0642.f39020(module0015.$g239$.getGlobalValue());
            module0642.f39026((SubLObject)module0670.TWO_INTEGER);
            f40963(var6, var187);
        }
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40961(final SubLObject var6, SubLObject var188) {
        if (var188 == module0670.UNPROVIDED) {
            var188 = (SubLObject)module0670.FIVE_INTEGER;
        }
        final SubLThread var189 = SubLProcess.currentSubLThread();
        module0642.f39020(module0015.$g234$.getGlobalValue());
        final SubLObject var190 = var188;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0670.NIL != var190) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var190);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var191 = module0015.$g533$.currentBinding(var189);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var189);
            module0669.f40783(var6);
            module0642.f39019((SubLObject)module0670.$ic225$);
        }
        finally {
            module0015.$g533$.rebind(var191, var189);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        if (module0670.NIL != module0167.f10813(var6)) {
            module0642.f39026((SubLObject)module0670.UNPROVIDED);
        }
        final SubLObject var192 = module0656.f39799(var6, var188, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g234$.getGlobalValue());
        final SubLObject var193 = var192;
        module0642.f39020(module0015.$g219$.getGlobalValue());
        if (module0670.NIL != var193) {
            module0642.f39020(module0015.$g221$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var193);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var194 = module0015.$g533$.currentBinding(var189);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var189);
            module0656.f39915(var6, (SubLObject)module0670.ZERO_INTEGER, (SubLObject)module0670.T);
        }
        finally {
            module0015.$g533$.rebind(var194, var189);
        }
        module0642.f39020(module0015.$g220$.getGlobalValue());
        module0642.f39020(module0015.$g235$.getGlobalValue());
        return var6;
    }
    
    public static SubLObject f40962(SubLObject var129, SubLObject var189, SubLObject var190) {
        if (var129 == module0670.UNPROVIDED) {
            var129 = (SubLObject)module0670.$ic222$;
        }
        if (var189 == module0670.UNPROVIDED) {
            var189 = (SubLObject)module0670.$ic223$;
        }
        if (var190 == module0670.UNPROVIDED) {
            var190 = (SubLObject)module0670.$ic224$;
        }
        module0016.f920(var129, var189, var190);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40963(final SubLObject var150, SubLObject var191) {
        if (var191 == module0670.UNPROVIDED) {
            var191 = (SubLObject)module0670.NIL;
        }
        final SubLThread var192 = SubLProcess.currentSubLThread();
        final SubLObject var194;
        final SubLObject var193 = var194 = var191;
        SubLObject var195 = (SubLObject)module0670.NIL;
        SubLObject var196 = var194;
        SubLObject var197 = (SubLObject)module0670.NIL;
        SubLObject var197_198 = (SubLObject)module0670.NIL;
        while (module0670.NIL != var196) {
            cdestructuring_bind.destructuring_bind_must_consp(var196, var193, (SubLObject)module0670.$ic226$);
            var197_198 = var196.first();
            var196 = var196.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var196, var193, (SubLObject)module0670.$ic226$);
            if (module0670.NIL == conses_high.member(var197_198, (SubLObject)module0670.$ic227$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED)) {
                var197 = (SubLObject)module0670.T;
            }
            if (var197_198 == module0670.$ic228$) {
                var195 = var196.first();
            }
            var196 = var196.rest();
        }
        if (module0670.NIL != var197 && module0670.NIL == var195) {
            cdestructuring_bind.cdestructuring_bind_error(var193, (SubLObject)module0670.$ic226$);
        }
        final SubLObject var198 = cdestructuring_bind.property_list_member((SubLObject)module0670.$ic229$, var194);
        final SubLObject var199 = (SubLObject)((module0670.NIL != var198) ? conses_high.cadr(var198) : module0670.$ic222$);
        final SubLObject var200 = cdestructuring_bind.property_list_member((SubLObject)module0670.$ic230$, var194);
        final SubLObject var201 = (SubLObject)((module0670.NIL != var200) ? conses_high.cadr(var200) : module0670.NIL);
        final SubLObject var202 = cdestructuring_bind.property_list_member((SubLObject)module0670.$ic231$, var194);
        final SubLObject var203 = (SubLObject)((module0670.NIL != var202) ? conses_high.cadr(var202) : module0670.NIL);
        final SubLObject var204 = (SubLObject)module0670.$ic232$;
        module0016.f908(var199, (SubLObject)module0670.$ic3$, (SubLObject)module0670.$ic233$);
        module0642.f39020(module0015.$g144$.getGlobalValue());
        if (module0670.NIL != var199) {
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var199);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        }
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var205 = module0015.$g533$.currentBinding(var192);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var192);
            module0016.f908((SubLObject)module0670.$ic234$, (SubLObject)module0670.$ic3$, (SubLObject)module0670.$ic233$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.$ic234$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_203 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                final SubLObject var206 = module0656.f39832((SubLObject)module0670.NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                if (module0670.NIL != var206) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(var206);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_204 = module0015.$g533$.currentBinding(var192);
                final SubLObject var207 = module0015.$g541$.currentBinding(var192);
                final SubLObject var208 = module0015.$g539$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                    module0015.$g541$.bind((SubLObject)module0670.T, var192);
                    module0015.$g539$.bind(module0015.f797(), var192);
                    module0642.f39069((SubLObject)module0670.$ic235$, (SubLObject)module0670.T, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39069((SubLObject)module0670.$ic236$, module0656.f39842(var150), (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_205 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_206 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_207 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_208 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_209 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_210 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)module0670.$ic237$, (SubLObject)module0670.$ic238$, module0670.$ic239$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_210, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0670.$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_211 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_211, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_212 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)module0670.$ic240$, (SubLObject)module0670.$ic234$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                            final SubLObject var11_213 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                                module0642.f39019((SubLObject)module0670.$ic241$);
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
                                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
                                }
                                finally {
                                    module0015.$g533$.rebind(var11_208, var192);
                                }
                                module0642.f39020(module0015.$g347$.getGlobalValue());
                                module0642.f39020(module0015.$g360$.getGlobalValue());
                                module0642.f39020(module0015.$g372$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.TWO_INTEGER);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020(module0015.$g370$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0670.$ic75$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020(module0015.$g373$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020(module0642.f39049((SubLObject)module0670.$ic242$));
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_214 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39074((SubLObject)module0670.$ic243$, (SubLObject)module0670.$ic234$, (SubLObject)module0670.UNPROVIDED);
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_215 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_216 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { module0670.$ic244$, module0670.$ic237$, module0670.$ic245$, module0670.$ic239$, module0670.$ic246$, module0670.NIL, module0670.$ic247$, module0670.NIL, module0670.$ic248$, var204 }));
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
            module0016.f908((SubLObject)module0670.$ic240$, (SubLObject)module0670.$ic93$, (SubLObject)module0670.$ic233$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.$ic240$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_217 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                final SubLObject var206 = module0656.f39832((SubLObject)module0670.NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                if (module0670.NIL != var206) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(var206);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_218 = module0015.$g533$.currentBinding(var192);
                final SubLObject var207 = module0015.$g541$.currentBinding(var192);
                final SubLObject var208 = module0015.$g539$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                    module0015.$g541$.bind((SubLObject)module0670.T, var192);
                    module0015.$g539$.bind(module0015.f797(), var192);
                    module0642.f39069((SubLObject)module0670.$ic235$, (SubLObject)module0670.T, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39069((SubLObject)module0670.$ic236$, module0656.f39842(var150), (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_219 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_220 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_221 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_222 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_223 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_224 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)module0670.$ic249$, (SubLObject)module0670.$ic250$, module0670.$ic251$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_224, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_225 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)module0670.$ic252$, (SubLObject)module0670.$ic240$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                            final SubLObject var11_226 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                                module0642.f39019((SubLObject)module0670.$ic253$);
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
                                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_227 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_228 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_229 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_230 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0666.f40468((SubLObject)module0670.$ic254$, (SubLObject)module0670.$ic255$, module0670.$ic256$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_230, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0670.$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_231 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)module0670.$ic234$, (SubLObject)module0670.$ic240$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                            final SubLObject var11_232 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                                final SubLObject var209 = module0014.f697((SubLObject)module0670.$ic218$);
                                                final SubLObject var210 = (SubLObject)module0670.$ic74$;
                                                final SubLObject var211 = module0014.f694((SubLObject)module0670.$ic218$);
                                                final SubLObject var212 = (SubLObject)module0670.ZERO_INTEGER;
                                                module0642.f39020(module0015.$g431$.getGlobalValue());
                                                module0642.f39020(module0015.$g440$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                module0642.f39020(var209);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                if (module0670.NIL != var211) {
                                                    module0642.f39020(module0015.$g437$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(var211);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                if (module0670.NIL != var210) {
                                                    module0642.f39020(module0015.$g438$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049(var210));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                if (module0670.NIL != var212) {
                                                    module0642.f39020(module0015.$g439$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(var212);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                                final SubLObject var11_233 = module0015.$g533$.currentBinding(var192);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
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
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_234 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)module0670.$ic257$, (SubLObject)module0670.$ic240$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                            final SubLObject var11_235 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                                module0642.f39019((SubLObject)module0670.$ic258$);
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
                                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020((SubLObject)module0670.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic75$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic242$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_236 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39074((SubLObject)module0670.$ic243$, (SubLObject)module0670.$ic240$, (SubLObject)module0670.UNPROVIDED);
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_237 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_238 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { module0670.$ic244$, module0670.$ic249$, module0670.$ic245$, module0670.$ic251$, module0670.$ic246$, module0670.NIL, module0670.$ic247$, module0670.NIL, module0670.$ic248$, var204 }));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_238, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_239 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list((SubLObject)module0670.$ic244$, (SubLObject)module0670.$ic254$, (SubLObject)module0670.$ic246$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic247$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic248$, var204));
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
            module0016.f908((SubLObject)module0670.$ic252$, (SubLObject)module0670.$ic3$, (SubLObject)module0670.$ic233$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.$ic252$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_240 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                final SubLObject var206 = module0656.f39832((SubLObject)module0670.NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                if (module0670.NIL != var206) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(var206);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_241 = module0015.$g533$.currentBinding(var192);
                final SubLObject var207 = module0015.$g541$.currentBinding(var192);
                final SubLObject var208 = module0015.$g539$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                    module0015.$g541$.bind((SubLObject)module0670.T, var192);
                    module0015.$g539$.bind(module0015.f797(), var192);
                    module0642.f39069((SubLObject)module0670.$ic235$, (SubLObject)module0670.T, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_242 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_243 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_244 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_245 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_246 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_247 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)module0670.$ic259$, (SubLObject)module0670.$ic250$, module0670.$ic251$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_247, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0670.$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_248 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
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
                                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_249 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_250 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_251 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_252 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0666.f40468((SubLObject)module0670.$ic260$, (SubLObject)module0670.$ic261$, module0670.$ic256$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_252, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0670.$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_253 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)module0670.$ic240$, (SubLObject)module0670.$ic252$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                            final SubLObject var11_254 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                                final SubLObject var209 = module0014.f697((SubLObject)module0670.$ic218$);
                                                final SubLObject var210 = (SubLObject)module0670.$ic74$;
                                                final SubLObject var211 = module0014.f694((SubLObject)module0670.$ic218$);
                                                final SubLObject var212 = (SubLObject)module0670.ZERO_INTEGER;
                                                module0642.f39020(module0015.$g431$.getGlobalValue());
                                                module0642.f39020(module0015.$g440$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                module0642.f39020(var209);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                if (module0670.NIL != var211) {
                                                    module0642.f39020(module0015.$g437$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(var211);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                if (module0670.NIL != var210) {
                                                    module0642.f39020(module0015.$g438$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049(var210));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                if (module0670.NIL != var212) {
                                                    module0642.f39020(module0015.$g439$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(var212);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                                final SubLObject var11_255 = module0015.$g533$.currentBinding(var192);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
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
                                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_256 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_257 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_258 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_259 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)module0670.$ic262$, (SubLObject)module0670.$ic255$, module0670.$ic256$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_259, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_260 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)module0670.$ic257$, (SubLObject)module0670.$ic252$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                            final SubLObject var11_261 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                                module0642.f39019((SubLObject)module0670.$ic258$);
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
                                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020((SubLObject)module0670.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic242$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_262 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39074((SubLObject)module0670.$ic243$, (SubLObject)module0670.$ic252$, (SubLObject)module0670.UNPROVIDED);
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_263 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_264 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { module0670.$ic244$, module0670.$ic259$, module0670.$ic245$, module0670.$ic251$, module0670.$ic246$, module0670.NIL, module0670.$ic247$, module0670.NIL, module0670.$ic248$, var204 }));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_264, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_265 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list((SubLObject)module0670.$ic244$, (SubLObject)module0670.$ic260$, (SubLObject)module0670.$ic246$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic247$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_265, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_266 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list((SubLObject)module0670.$ic244$, (SubLObject)module0670.$ic262$, (SubLObject)module0670.$ic246$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic247$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic248$, var204));
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
            module0016.f908((SubLObject)module0670.$ic257$, (SubLObject)module0670.$ic3$, (SubLObject)module0670.$ic233$);
            module0642.f39020(module0015.$g144$.getGlobalValue());
            module0642.f39020(module0015.$g157$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.$ic257$);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_267 = module0015.$g533$.currentBinding(var192);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                final SubLObject var206 = module0656.f39832((SubLObject)module0670.NIL);
                module0642.f39020(module0015.$g282$.getGlobalValue());
                module0642.f39020(module0015.$g284$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0110.$g570$.getDynamicValue(var192));
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(module0015.$g285$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020((SubLObject)module0670.$ic136$);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                if (module0670.NIL != var206) {
                    module0642.f39020(module0015.$g286$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(var206);
                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                }
                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                final SubLObject var11_268 = module0015.$g533$.currentBinding(var192);
                final SubLObject var207 = module0015.$g541$.currentBinding(var192);
                final SubLObject var208 = module0015.$g539$.currentBinding(var192);
                try {
                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                    module0015.$g541$.bind((SubLObject)module0670.T, var192);
                    module0015.$g539$.bind(module0015.f797(), var192);
                    module0642.f39069((SubLObject)module0670.$ic235$, (SubLObject)module0670.T, (SubLObject)module0670.UNPROVIDED);
                    module0642.f39020(module0015.$g346$.getGlobalValue());
                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                    final SubLObject var11_269 = module0015.$g533$.currentBinding(var192);
                    try {
                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_270 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_271 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_272 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_273 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39046(module0015.$g369$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_274 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0666.f40468((SubLObject)module0670.$ic263$, (SubLObject)module0670.$ic264$, module0670.$ic265$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_274, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0670.$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_275 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
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
                                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_276 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g224$.getGlobalValue());
                                module0642.f39020(module0015.$g230$.getGlobalValue());
                                module0666.f40468((SubLObject)module0670.$ic266$, (SubLObject)module0670.$ic261$, module0670.$ic256$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020(module0015.$g231$.getGlobalValue());
                                module0642.f39020(module0015.$g225$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_276, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_277 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g224$.getGlobalValue());
                                module0642.f39020(module0015.$g230$.getGlobalValue());
                                module0666.f40468((SubLObject)module0670.$ic267$, (SubLObject)module0670.$ic255$, module0670.$ic256$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020(module0015.$g231$.getGlobalValue());
                                module0642.f39020(module0015.$g225$.getGlobalValue());
                            }
                            finally {
                                module0015.$g533$.rebind(var11_277, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_278 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39020(module0015.$g346$.getGlobalValue());
                                module0642.f39020(module0015.$g358$.getGlobalValue());
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39020((SubLObject)module0670.$ic72$);
                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                final SubLObject var11_279 = module0015.$g533$.currentBinding(var192);
                                try {
                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                    module0642.f39020(module0015.$g364$.getGlobalValue());
                                    module0642.f39020(module0015.$g373$.getGlobalValue());
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39020(module0642.f39049((SubLObject)module0670.$ic187$));
                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                    module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                    final SubLObject var11_280 = module0015.$g533$.currentBinding(var192);
                                    try {
                                        module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_281 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0666.f40468((SubLObject)module0670.$ic268$, (SubLObject)module0670.$ic269$, module0670.$ic256$, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g225$.getGlobalValue());
                                            module0642.f39020(module0015.$g231$.getGlobalValue());
                                        }
                                        finally {
                                            module0015.$g533$.rebind(var11_281, var192);
                                        }
                                        module0642.f39020(module0015.$g361$.getGlobalValue());
                                        module0642.f39020(module0015.$g360$.getGlobalValue());
                                        module0642.f39020(module0015.$g370$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0015.$g375$.getGlobalValue());
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020((SubLObject)module0670.$ic72$);
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_282 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g381$.getGlobalValue());
                                            module0642.f39020(module0015.$g383$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0666.f40469());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0015.$g160$.getGlobalValue());
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39020(module0016.f919((SubLObject)module0670.$ic252$, (SubLObject)module0670.$ic257$));
                                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                            final SubLObject var11_283 = module0015.$g533$.currentBinding(var192);
                                            try {
                                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                                final SubLObject var209 = module0014.f697((SubLObject)module0670.$ic218$);
                                                final SubLObject var210 = (SubLObject)module0670.$ic74$;
                                                final SubLObject var211 = module0014.f694((SubLObject)module0670.$ic218$);
                                                final SubLObject var212 = (SubLObject)module0670.ZERO_INTEGER;
                                                module0642.f39020(module0015.$g431$.getGlobalValue());
                                                module0642.f39020(module0015.$g440$.getGlobalValue());
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                module0642.f39020(var209);
                                                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                if (module0670.NIL != var211) {
                                                    module0642.f39020(module0015.$g437$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(var211);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                if (module0670.NIL != var210) {
                                                    module0642.f39020(module0015.$g438$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(module0642.f39049(var210));
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                if (module0670.NIL != var212) {
                                                    module0642.f39020(module0015.$g439$.getGlobalValue());
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                    module0642.f39020(var212);
                                                    module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                                }
                                                module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                                final SubLObject var11_284 = module0015.$g533$.currentBinding(var192);
                                                try {
                                                    module0015.$g533$.bind((SubLObject)module0670.T, var192);
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
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic75$));
                                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                                        final SubLObject var11_285 = module0015.$g533$.currentBinding(var192);
                                        try {
                                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                            module0642.f39020(module0015.$g224$.getGlobalValue());
                                            module0642.f39020(module0015.$g230$.getGlobalValue());
                                            module0642.f39019((SubLObject)module0670.$ic270$);
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
                                    module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020((SubLObject)module0670.TWO_INTEGER);
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0015.$g373$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic242$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_286 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0642.f39074((SubLObject)module0670.$ic243$, (SubLObject)module0670.$ic257$, (SubLObject)module0670.UNPROVIDED);
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0015.$g364$.getGlobalValue());
                        module0642.f39020(module0015.$g373$.getGlobalValue());
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39020(module0642.f39049((SubLObject)module0670.$ic74$));
                        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                        final SubLObject var11_287 = module0015.$g533$.currentBinding(var192);
                        try {
                            module0015.$g533$.bind((SubLObject)module0670.T, var192);
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_288 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { module0670.$ic244$, module0670.$ic263$, module0670.$ic245$, module0670.$ic265$, module0670.$ic246$, module0670.NIL, module0670.$ic247$, module0670.NIL, module0670.$ic248$, var204 }));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_288, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_289 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list((SubLObject)module0670.$ic244$, (SubLObject)module0670.$ic266$, (SubLObject)module0670.$ic246$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic247$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_289, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_290 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list((SubLObject)module0670.$ic244$, (SubLObject)module0670.$ic267$, (SubLObject)module0670.$ic246$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic247$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic248$, var204));
                            }
                            finally {
                                module0015.$g533$.rebind(var11_290, var192);
                            }
                            module0642.f39020(module0015.$g361$.getGlobalValue());
                            module0642.f39020(module0015.$g360$.getGlobalValue());
                            module0642.f39020(module0015.$g370$.getGlobalValue());
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39020(module0642.f39049((SubLObject)module0670.$ic73$));
                            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
                            final SubLObject var11_291 = module0015.$g533$.currentBinding(var192);
                            try {
                                module0015.$g533$.bind((SubLObject)module0670.T, var192);
                                module0657.f40033((SubLObject)module0670.NIL, (SubLObject)ConsesLow.list((SubLObject)module0670.$ic244$, (SubLObject)module0670.$ic268$, (SubLObject)module0670.$ic246$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic247$, (SubLObject)module0670.NIL, (SubLObject)module0670.$ic248$, var204));
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
                        module0642.f39029((SubLObject)module0670.UNPROVIDED);
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
            module0642.f39029((SubLObject)module0670.UNPROVIDED);
        }
        finally {
            module0015.$g533$.rebind(var205, var192);
        }
        module0642.f39020(module0015.$g145$.getGlobalValue());
        module0642.f39029((SubLObject)module0670.UNPROVIDED);
        return var150;
    }
    
    public static SubLObject f40964(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        var2.resetMultipleValues();
        final SubLObject var3 = f40965(var1);
        final SubLObject var4 = var2.secondMultipleValue();
        var2.resetMultipleValues();
        if (module0670.NIL != var4) {
            return f40966(var4);
        }
        return module0674.f41188((SubLObject)module0670.$ic271$, (SubLObject)module0670.NIL, var3, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40965(final SubLObject var1) {
        if (module0670.NIL != module0642.f39104((SubLObject)module0670.$ic234$, var1)) {
            final SubLObject var2 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic237$, var1), (SubLObject)module0670.UNPROVIDED);
            final SubLObject var3 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic236$, var1), (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL == var2) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic237$, var1)), (SubLObject)module0670.$ic273$));
            }
            if (module0670.NIL == var3) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic236$, var1)), (SubLObject)module0670.$ic273$));
            }
            final SubLObject var4 = module0202.f12643(var2, var3);
            return Values.values(var4, (SubLObject)module0670.NIL);
        }
        else if (module0670.NIL != module0642.f39104((SubLObject)module0670.$ic240$, var1)) {
            final SubLObject var2 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic249$, var1), (SubLObject)module0670.UNPROVIDED);
            final SubLObject var3 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic236$, var1), (SubLObject)module0670.UNPROVIDED);
            final SubLObject var5 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic254$, var1), (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL == var2) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic249$, var1)), (SubLObject)module0670.$ic273$));
            }
            if (module0670.NIL == var3) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic236$, var1)), (SubLObject)module0670.$ic273$));
            }
            if (module0670.NIL == var5) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic254$, var1)), (SubLObject)module0670.$ic273$));
            }
            final SubLObject var6 = module0202.f12768(var2, var3, var5);
            return Values.values(var6, (SubLObject)module0670.NIL);
        }
        else if (module0670.NIL != module0642.f39104((SubLObject)module0670.$ic252$, var1)) {
            final SubLObject var2 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic259$, var1), (SubLObject)module0670.UNPROVIDED);
            final SubLObject var3 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic260$, var1), (SubLObject)module0670.UNPROVIDED);
            final SubLObject var5 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic262$, var1), (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL == var2) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic259$, var1)), (SubLObject)module0670.$ic273$));
            }
            if (module0670.NIL == var3) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic260$, var1)), (SubLObject)module0670.$ic273$));
            }
            if (module0670.NIL == var5) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic262$, var1)), (SubLObject)module0670.$ic273$));
            }
            final SubLObject var6 = module0202.f12768(var2, var3, var5);
            return Values.values(var6, (SubLObject)module0670.NIL);
        }
        else {
            if (module0670.NIL == module0642.f39104((SubLObject)module0670.$ic257$, var1)) {
                return Values.values((SubLObject)module0670.NIL, (SubLObject)module0670.$ic274$);
            }
            final SubLObject var2 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic263$, var1), (SubLObject)module0670.UNPROVIDED);
            final SubLObject var3 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic266$, var1), (SubLObject)module0670.UNPROVIDED);
            final SubLObject var5 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic267$, var1), (SubLObject)module0670.UNPROVIDED);
            final SubLObject var7 = module0656.f39957(module0642.f39104((SubLObject)module0670.$ic268$, var1), (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL == var2) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic263$, var1)), (SubLObject)module0670.$ic273$));
            }
            if (module0670.NIL == var3) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic266$, var1)), (SubLObject)module0670.$ic273$));
            }
            if (module0670.NIL == var5) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic267$, var1)), (SubLObject)module0670.$ic273$));
            }
            if (module0670.NIL == var7) {
                return Values.values((SubLObject)module0670.NIL, Sequences.cconcatenate(module0006.f203(module0642.f39104((SubLObject)module0670.$ic268$, var1)), (SubLObject)module0670.$ic273$));
            }
            final SubLObject var8 = module0202.f12769(var2, var3, var5, var7);
            return Values.values(var8, (SubLObject)module0670.NIL);
        }
    }
    
    public static SubLObject f40966(final SubLObject var292) {
        return module0656.f39789((SubLObject)module0670.$ic275$, var292, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED, (SubLObject)module0670.UNPROVIDED);
    }
    
    public static SubLObject f40967(final SubLObject var296, final SubLObject var297) {
        final SubLThread var298 = SubLProcess.currentSubLThread();
        final SubLObject var299 = Sequences.cconcatenate((SubLObject)module0670.$ic276$, module0006.f203(random.random((SubLObject)module0670.$ic277$)));
        final SubLObject var300 = Sequences.cconcatenate((SubLObject)module0670.$ic276$, module0006.f203(random.random((SubLObject)module0670.$ic277$)));
        final SubLObject var301 = module0014.f697(var296);
        final SubLObject var302 = module0014.f697(var297);
        module0642.f39020(module0015.$g381$.getGlobalValue());
        module0642.f39020(module0015.$g383$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0666.f40469());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g389$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(Sequences.cconcatenate((SubLObject)module0670.$ic278$, new SubLObject[] { module0006.f203(var300), module0670.$ic279$, module0006.f203(var299), module0670.$ic280$ }));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(module0015.$g390$.getGlobalValue());
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39020(Sequences.cconcatenate((SubLObject)module0670.$ic278$, new SubLObject[] { module0006.f203(var299), module0670.$ic279$, module0006.f203(var300), module0670.$ic280$ }));
        module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
        module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
        final SubLObject var303 = module0015.$g533$.currentBinding(var298);
        try {
            module0015.$g533$.bind((SubLObject)module0670.T, var298);
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var301);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var299) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var299);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39020(module0015.$g439$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_302 = module0015.$g533$.currentBinding(var298);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var298);
            }
            finally {
                module0015.$g533$.rebind(var11_302, var298);
            }
            module0642.f39020(module0015.$g432$.getGlobalValue());
            module0642.f39020(module0015.$g431$.getGlobalValue());
            module0642.f39020(module0015.$g440$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020(var302);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            if (module0670.NIL != var300) {
                module0642.f39020(module0015.$g157$.getGlobalValue());
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
                module0642.f39020(var300);
                module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            }
            module0642.f39020(module0015.$g439$.getGlobalValue());
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39020((SubLObject)module0670.ZERO_INTEGER);
            module0642.f39012((SubLObject)Characters.CHAR_quotation, (SubLObject)module0670.UNPROVIDED);
            module0642.f39012((SubLObject)Characters.CHAR_greater, (SubLObject)module0670.UNPROVIDED);
            final SubLObject var11_303 = module0015.$g533$.currentBinding(var298);
            try {
                module0015.$g533$.bind((SubLObject)module0670.T, var298);
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
        return (SubLObject)module0670.NIL;
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
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40969() {
        module0670.$g5298$ = SubLFiles.defvar("S#45055", (SubLObject)module0670.$ic0$);
        module0670.$g5299$ = SubLFiles.defvar("S#45056", (SubLObject)module0670.NIL);
        module0670.$g5300$ = SubLFiles.defvar("S#45057", (SubLObject)module0670.$ic3$);
        module0670.$g5301$ = SubLFiles.deflexical("S#45058", (SubLObject)module0670.$ic208$);
        return (SubLObject)module0670.NIL;
    }
    
    public static SubLObject f40970() {
        module0012.f441((SubLObject)module0670.$ic1$);
        module0012.f444((SubLObject)module0670.$ic1$);
        module0012.f441((SubLObject)module0670.$ic2$);
        module0012.f444((SubLObject)module0670.$ic2$);
        module0012.f441((SubLObject)module0670.$ic4$);
        module0012.f444((SubLObject)module0670.$ic4$);
        module0015.f873((SubLObject)module0670.$ic7$);
        module0656.f39840((SubLObject)module0670.$ic11$, (SubLObject)module0670.$ic12$, (SubLObject)module0670.THREE_INTEGER);
        module0015.f873((SubLObject)module0670.$ic13$);
        module0656.f39840((SubLObject)module0670.$ic16$, (SubLObject)module0670.$ic17$, (SubLObject)module0670.THREE_INTEGER);
        module0656.f39840((SubLObject)module0670.$ic96$, (SubLObject)module0670.$ic110$, (SubLObject)module0670.FOUR_INTEGER);
        module0656.f39840((SubLObject)module0670.$ic98$, (SubLObject)module0670.$ic114$, (SubLObject)module0670.FOUR_INTEGER);
        module0015.f873((SubLObject)module0670.$ic117$);
        module0656.f39840((SubLObject)module0670.$ic80$, (SubLObject)module0670.$ic119$, (SubLObject)module0670.THREE_INTEGER);
        module0015.f873((SubLObject)module0670.$ic121$);
        module0656.f39840((SubLObject)module0670.$ic101$, (SubLObject)module0670.$ic128$, (SubLObject)module0670.ONE_INTEGER);
        module0015.f873((SubLObject)module0670.$ic131$);
        module0656.f39840((SubLObject)module0670.$ic83$, (SubLObject)module0670.$ic134$, (SubLObject)module0670.TWO_INTEGER);
        module0015.f873((SubLObject)module0670.$ic168$);
        module0015.f873((SubLObject)module0670.$ic170$);
        module0656.f39840((SubLObject)module0670.$ic84$, (SubLObject)module0670.$ic173$, (SubLObject)module0670.TWO_INTEGER);
        module0015.f873((SubLObject)module0670.$ic183$);
        module0656.f39840((SubLObject)module0670.$ic91$, (SubLObject)module0670.$ic193$, (SubLObject)module0670.FIVE_INTEGER);
        module0015.f873((SubLObject)module0670.$ic198$);
        Hashtables.sethash((SubLObject)module0670.$ic218$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0670.$ic219$, (SubLObject)module0670.NIL));
        Hashtables.sethash((SubLObject)module0670.$ic220$, module0014.$g128$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)module0670.$ic221$, (SubLObject)module0670.NIL));
        module0015.f873((SubLObject)module0670.$ic272$);
        return (SubLObject)module0670.NIL;
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
        module0670.$g5298$ = null;
        module0670.$g5299$ = null;
        module0670.$g5300$ = null;
        module0670.$g5301$ = null;
        $ic0$ = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $ic1$ = SubLObjectFactory.makeSymbol("S#45055", "CYC");
        $ic2$ = SubLObjectFactory.makeSymbol("S#45056", "CYC");
        $ic3$ = SubLObjectFactory.makeKeyword("INVISIBLE");
        $ic4$ = SubLObjectFactory.makeSymbol("S#45057", "CYC");
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45059", "CYC"));
        $ic6$ = SubLObjectFactory.makeString("Unable to determine a term from ~S");
        $ic7$ = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-FRAME");
        $ic8$ = SubLObjectFactory.makeKeyword("SELF");
        $ic9$ = SubLObjectFactory.makeString("[Inferred]");
        $ic10$ = SubLObjectFactory.makeString("cb-inferred-index-frame&~A");
        $ic11$ = SubLObjectFactory.makeKeyword("INFERRED-INDEX");
        $ic12$ = SubLObjectFactory.makeSymbol("S#45009", "CYC");
        $ic13$ = SubLObjectFactory.makeSymbol("CB-LEGACY-INDEX-FRAME");
        $ic14$ = SubLObjectFactory.makeString("[Legacy]");
        $ic15$ = SubLObjectFactory.makeString("cb-legacy-index-frame&~A");
        $ic16$ = SubLObjectFactory.makeKeyword("LEGACY-INDEX");
        $ic17$ = SubLObjectFactory.makeSymbol("S#45010", "CYC");
        $ic18$ = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $ic19$ = SubLObjectFactory.makeKeyword("CB-CYC");
        $ic20$ = SubLObjectFactory.makeString("stylesheet");
        $ic21$ = SubLObjectFactory.makeString("text/css");
        $ic22$ = SubLObjectFactory.makeString("browsing");
        $ic23$ = SubLObjectFactory.makeString("Browsing");
        $ic24$ = SubLObjectFactory.makeString("edit");
        $ic25$ = SubLObjectFactory.makeString("Editing");
        $ic26$ = SubLObjectFactory.makeString("advanced");
        $ic27$ = SubLObjectFactory.makeString("Advanced");
        $ic28$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic29$ = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $ic30$ = SubLObjectFactory.makeString("documentation");
        $ic31$ = SubLObjectFactory.makeString(" | ");
        $ic32$ = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $ic33$ = SubLObjectFactory.makeString("definitional");
        $ic34$ = SubLObjectFactory.makeKeyword("CREATE-SIMILAR");
        $ic35$ = SubLObjectFactory.makeString("copy");
        $ic36$ = SubLObjectFactory.makeKeyword("RENAME");
        $ic37$ = SubLObjectFactory.makeString("rename");
        $ic38$ = SubLObjectFactory.makeKeyword("MERGE");
        $ic39$ = SubLObjectFactory.makeString("merge");
        $ic40$ = SubLObjectFactory.makeKeyword("CONFIRM-KILL");
        $ic41$ = SubLObjectFactory.makeKeyword("KILL");
        $ic42$ = SubLObjectFactory.makeString("kill");
        $ic43$ = SubLObjectFactory.makeKeyword("CREATE-INSTANCE");
        $ic44$ = SubLObjectFactory.makeString("create instance");
        $ic45$ = SubLObjectFactory.makeKeyword("CREATE-SPEC");
        $ic46$ = SubLObjectFactory.makeString("create spec");
        $ic47$ = SubLObjectFactory.makeKeyword("CHRONOLOGICAL-ORDER");
        $ic48$ = SubLObjectFactory.makeString("history");
        $ic49$ = SubLObjectFactory.makeKeyword("DESCRIBE-NART");
        $ic50$ = SubLObjectFactory.makeKeyword("DESCRIBE-CONSTANT");
        $ic51$ = SubLObjectFactory.makeKeyword("TTT-TEST");
        $ic52$ = SubLObjectFactory.makeString("take test");
        $ic53$ = SubLObjectFactory.makeKeyword("KCT-TEST");
        $ic54$ = SubLObjectFactory.makeString("run test");
        $ic55$ = SubLObjectFactory.makeKeyword("KBQ-ASK");
        $ic56$ = SubLObjectFactory.makeString("ask query");
        $ic57$ = SubLObjectFactory.makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $ic58$ = SubLObjectFactory.makeString("proof-check query");
        $ic59$ = SubLObjectFactory.makeKeyword("KBQ-EDIT");
        $ic60$ = SubLObjectFactory.makeString("edit query");
        $ic61$ = SubLObjectFactory.makeString("more filters");
        $ic62$ = SubLObjectFactory.makeKeyword("HANDLER");
        $ic63$ = SubLObjectFactory.makeSymbol("CB-C-PERTINENT-QUERY-LINKS");
        $ic64$ = SubLObjectFactory.makeKeyword("ARGS");
        $ic65$ = SubLObjectFactory.makeString("term");
        $ic66$ = SubLObjectFactory.makeKeyword("MESSAGE");
        $ic67$ = SubLObjectFactory.makeString("Checking for Pertinent Queries...");
        $ic68$ = SubLObjectFactory.makeKeyword("TAG");
        $ic69$ = SubLObjectFactory.makeString("div");
        $ic70$ = SubLObjectFactory.makeKeyword("DELAY");
        $ic71$ = SubLObjectFactory.makeInteger(50);
        $ic72$ = SubLObjectFactory.makeString("100%");
        $ic73$ = SubLObjectFactory.makeKeyword("LEFT");
        $ic74$ = SubLObjectFactory.makeKeyword("TOP");
        $ic75$ = SubLObjectFactory.makeKeyword("RIGHT");
        $ic76$ = SubLObjectFactory.makeString("40%");
        $ic77$ = SubLObjectFactory.makeString("order by :");
        $ic78$ = SubLObjectFactory.makeKeyword("PREDICATE");
        $ic79$ = SubLObjectFactory.makeString("predicate");
        $ic80$ = SubLObjectFactory.makeKeyword("INFERRED-INDEX-ORDER-BY");
        $ic81$ = SubLObjectFactory.makeString("ontology");
        $ic82$ = SubLObjectFactory.makeString("filters :");
        $ic83$ = SubLObjectFactory.makeKeyword("INFERRED-INDEX-PREDICATE-FILTERS");
        $ic84$ = SubLObjectFactory.makeKeyword("INFERRED-INDEX-ONTOLOGY-FILTERS");
        $ic85$ = SubLObjectFactory.makeString("index view :");
        $ic86$ = SubLObjectFactory.makeString("inferred");
        $ic87$ = SubLObjectFactory.makeString("legacy");
        $ic88$ = SubLObjectFactory.makeString("Unexpected order-by : ~S");
        $ic89$ = SubLObjectFactory.makeString("");
        $ic90$ = SubLObjectFactory.makeString("via ");
        $ic91$ = SubLObjectFactory.makeKeyword("INFERRED-GAF-ARG-ASSERTIONS");
        $ic92$ = SubLObjectFactory.makeInteger(100);
        $ic93$ = SubLObjectFactory.makeKeyword("VISIBLE");
        $ic94$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#17513", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#17514", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"));
        $ic95$ = SubLObjectFactory.makeString(" arg~S");
        $ic96$ = SubLObjectFactory.makeKeyword("LITERAL-QUERY");
        $ic97$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic98$ = SubLObjectFactory.makeKeyword("HIER-BROW");
        $ic99$ = SubLObjectFactory.makeString("All Assertions");
        $ic100$ = SubLObjectFactory.makeInteger(1000);
        $ic101$ = SubLObjectFactory.makeKeyword("INFERRED-INDEX-TOGGLE-VISIBILITY");
        $ic102$ = SubLObjectFactory.makeString("(~A)");
        $ic103$ = SubLObjectFactory.makeString("color: red; background-color:yellow; font-family:monospace");
        $ic104$ = SubLObjectFactory.makeString("!");
        $ic105$ = SubLObjectFactory.makeString("igai_");
        $ic106$ = SubLObjectFactory.makeKeyword("CONTENT");
        $ic107$ = SubLObjectFactory.makeString("cb-lq&~A&~A&~A&~A");
        $ic108$ = SubLObjectFactory.makeString("cb-lq&~A&~A&~A");
        $ic109$ = SubLObjectFactory.makeKeyword("PLUS-GREEN");
        $ic110$ = SubLObjectFactory.makeSymbol("S#45019", "CYC");
        $ic111$ = SubLObjectFactory.makeString("cb-hier&~A&~A&~A&~A");
        $ic112$ = SubLObjectFactory.makeString("cb-hier&~A&~A&~A");
        $ic113$ = SubLObjectFactory.makeKeyword("RED-DIAMOND");
        $ic114$ = SubLObjectFactory.makeSymbol("S#45021", "CYC");
        $ic115$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlMt")));
        $ic116$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45059", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45060", "CYC"));
        $ic117$ = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-ORDER-BY");
        $ic118$ = SubLObjectFactory.makeString("cb-inferred-index-order-by&~A&~A");
        $ic119$ = SubLObjectFactory.makeSymbol("S#45023", "CYC");
        $ic120$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#45059", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#45061", "CYC"));
        $ic121$ = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-VISIBILITY");
        $ic122$ = SubLObjectFactory.makeString("close all");
        $ic123$ = SubLObjectFactory.makeString("open all");
        $ic124$ = SubLObjectFactory.makeKeyword("DOWN-TRIANGLE-V");
        $ic125$ = SubLObjectFactory.makeKeyword("RIGHT-TRIANGLE-V");
        $ic126$ = SubLObjectFactory.makeString("cb-inferred-index-visibility&~A&~S");
        $ic127$ = SubLObjectFactory.makeKeyword("CENTER");
        $ic128$ = SubLObjectFactory.makeSymbol("S#45024", "CYC");
        $ic129$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#38900", "CYC"));
        $ic130$ = SubLObjectFactory.makeString("~S did not specify a term");
        $ic131$ = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-PREDICATE-FILTERS");
        $ic132$ = SubLObjectFactory.makeString("[Predicate Filters]");
        $ic133$ = SubLObjectFactory.makeString("cb-inferred-index-predicate-filters&~A");
        $ic134$ = SubLObjectFactory.makeSymbol("S#45025", "CYC");
        $ic135$ = SubLObjectFactory.makeString("Inferred Index Predicate Filters");
        $ic136$ = SubLObjectFactory.makeString("post");
        $ic137$ = SubLObjectFactory.makeString("cb-handle-inferred-index-predicate-filters");
        $ic138$ = SubLObjectFactory.makeString("relevant to ");
        $ic139$ = SubLObjectFactory.makeString("Update Filters");
        $ic140$ = SubLObjectFactory.makeString("update");
        $ic141$ = SubLObjectFactory.makeString("Reset Values");
        $ic142$ = SubLObjectFactory.makeString("Remove All Filters");
        $ic143$ = SubLObjectFactory.makeString("clear");
        $ic144$ = SubLObjectFactory.makeKeyword("ALLOW-PREDICATES");
        $ic145$ = SubLObjectFactory.makeKeyword("ALLOW-PREDICATE-TYPES");
        $ic146$ = SubLObjectFactory.makeKeyword("FORBID-PREDICATES");
        $ic147$ = SubLObjectFactory.makeKeyword("FORBID-PREDICATE-TYPES");
        $ic148$ = SubLObjectFactory.makeString("Allowed Types");
        $ic149$ = SubLObjectFactory.makeString("check to remove");
        $ic150$ = SubLObjectFactory.makeString("add ");
        $ic151$ = SubLObjectFactory.makeString("type_allow");
        $ic152$ = SubLObjectFactory.makeInteger(30);
        $ic153$ = SubLObjectFactory.makeString("Complete");
        $ic154$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic155$ = SubLObjectFactory.makeString("Forbidden Types");
        $ic156$ = SubLObjectFactory.makeString("type_forbid");
        $ic157$ = SubLObjectFactory.makeString("Allowed Predicates");
        $ic158$ = SubLObjectFactory.makeKeyword("RED");
        $ic159$ = SubLObjectFactory.makeString("None!");
        $ic160$ = SubLObjectFactory.makeString("check to forbid");
        $ic161$ = SubLObjectFactory.makeString("Forbidden Predicates");
        $ic162$ = SubLObjectFactory.makeString("check to allow");
        $ic163$ = SubLObjectFactory.makeString("remove_type_allow_");
        $ic164$ = SubLObjectFactory.makeString("T");
        $ic165$ = SubLObjectFactory.makeString("remove_type_forbid_");
        $ic166$ = SubLObjectFactory.makeString("forbid_");
        $ic167$ = SubLObjectFactory.makeString("allow_");
        $ic168$ = SubLObjectFactory.makeSymbol("CB-HANDLE-INFERRED-INDEX-PREDICATE-FILTERS");
        $ic169$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#132", "CYC"));
        $ic170$ = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-ONTOLOGY-FILTERS");
        $ic171$ = SubLObjectFactory.makeString("[Ontology Filters]");
        $ic172$ = SubLObjectFactory.makeString("cb-inferred-index-ontology-filters&~A");
        $ic173$ = SubLObjectFactory.makeSymbol("S#45034", "CYC");
        $ic174$ = SubLObjectFactory.makeString("Inferred Index Ontology Filters");
        $ic175$ = SubLObjectFactory.makeString("cb-handle-inferred-index-ontology-filters");
        $ic176$ = SubLObjectFactory.makeKeyword("ONTOLOGY-HORIZON");
        $ic177$ = SubLObjectFactory.makeString("Generality Horizon");
        $ic178$ = SubLObjectFactory.makeString("select a qualitative boundary");
        $ic179$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("LOWER"), (SubLObject)SubLObjectFactory.makeKeyword("MIDDLE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $ic180$ = SubLObjectFactory.makeString("or a generalization");
        $ic181$ = SubLObjectFactory.makeKeyword("ALL");
        $ic182$ = SubLObjectFactory.makeString("ontology-horizon");
        $ic183$ = SubLObjectFactory.makeSymbol("CB-HANDLE-INFERRED-INDEX-ONTOLOGY-FILTERS");
        $ic184$ = SubLObjectFactory.makeString("Just on the term");
        $ic185$ = SubLObjectFactory.makeKeyword("LOWER");
        $ic186$ = SubLObjectFactory.makeString("Also from the lower ontology");
        $ic187$ = SubLObjectFactory.makeKeyword("MIDDLE");
        $ic188$ = SubLObjectFactory.makeString("Also up through the middle ontology");
        $ic189$ = SubLObjectFactory.makeString("Everything");
        $ic190$ = SubLObjectFactory.makeString("cb-inferred-gaf-arg-assertions&~A&~A&~A&~A");
        $ic191$ = SubLObjectFactory.makeString("cb-inferred-gaf-arg-assertions&~A&~A");
        $ic192$ = SubLObjectFactory.makeString("cb-inferred-gaf-arg-assertions&~A");
        $ic193$ = SubLObjectFactory.makeSymbol("S#45040", "CYC");
        $ic194$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#37820", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("S#45062", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13107", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13108", "CYC"));
        $ic195$ = SubLObjectFactory.makeString("Could not determine a term from ~a");
        $ic196$ = SubLObjectFactory.makeString("NIL");
        $ic197$ = SubLObjectFactory.makeString("Could not determine an argnum from ~a");
        $ic198$ = SubLObjectFactory.makeSymbol("CB-INFERRED-GAF-ARG-ASSERTIONS");
        $ic199$ = SubLObjectFactory.makeString("Inferred GAF arg index for ~S");
        $ic200$ = SubLObjectFactory.makeString("yui-skin-sam");
        $ic201$ = SubLObjectFactory.makeString("reloadFrameButton");
        $ic202$ = SubLObjectFactory.makeString("button");
        $ic203$ = SubLObjectFactory.makeString("reload");
        $ic204$ = SubLObjectFactory.makeString("Refresh");
        $ic205$ = SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');");
        $ic206$ = SubLObjectFactory.makeKeyword("QUERY-ISA");
        $ic207$ = SubLObjectFactory.makeString(" query");
        $ic208$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ISA")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("GENLS")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("EQUALITY")));
        $ic209$ = SubLObjectFactory.makeKeyword("QUERY");
        $ic210$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic211$ = SubLObjectFactory.makeString("on ");
        $ic212$ = SubLObjectFactory.makeString("the term");
        $ic213$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic214$ = SubLObjectFactory.makeKeyword("HL-SUPPORT");
        $ic215$ = SubLObjectFactory.makeKeyword("NONE");
        $ic216$ = SubLObjectFactory.makeString("[?]");
        $ic217$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing")));
        $ic218$ = SubLObjectFactory.makeKeyword("CLOSE-RED");
        $ic219$ = SubLObjectFactory.makeString("red-x-close-15.gif");
        $ic220$ = SubLObjectFactory.makeKeyword("CLOSE-RED-DIM");
        $ic221$ = SubLObjectFactory.makeString("dim-red-x-close-15.gif");
        $ic222$ = SubLObjectFactory.makeString("gaf_entry");
        $ic223$ = SubLObjectFactory.makeString("[+]");
        $ic224$ = SubLObjectFactory.makeString("[-]");
        $ic225$ = SubLObjectFactory.makeString(" : ");
        $ic226$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#29", "CYC"), (SubLObject)SubLObjectFactory.makeString("gaf_entry")), (SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"));
        $ic227$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("ARGNUM"));
        $ic228$ = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $ic229$ = SubLObjectFactory.makeKeyword("NAME");
        $ic230$ = SubLObjectFactory.makeKeyword("PRED");
        $ic231$ = SubLObjectFactory.makeKeyword("ARGNUM");
        $ic232$ = SubLObjectFactory.makeInteger(200);
        $ic233$ = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $ic234$ = SubLObjectFactory.makeString("unary_frame");
        $ic235$ = SubLObjectFactory.makeString("cb-handle-gaf-entry");
        $ic236$ = SubLObjectFactory.makeString("implicit_arg1");
        $ic237$ = SubLObjectFactory.makeString("unary_frame_pred");
        $ic238$ = SubLObjectFactory.makeString("unary predicate");
        $ic239$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnaryPredicate"));
        $ic240$ = SubLObjectFactory.makeString("binary_frame");
        $ic241$ = SubLObjectFactory.makeString("+arg2");
        $ic242$ = SubLObjectFactory.makeKeyword("BOTTOM");
        $ic243$ = SubLObjectFactory.makeString("Assert");
        $ic244$ = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $ic245$ = SubLObjectFactory.makeKeyword("COMPLETE-TYPE");
        $ic246$ = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $ic247$ = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $ic248$ = SubLObjectFactory.makeKeyword("WIDTH");
        $ic249$ = SubLObjectFactory.makeString("binary_frame_pred");
        $ic250$ = SubLObjectFactory.makeString("binary predicate");
        $ic251$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"));
        $ic252$ = SubLObjectFactory.makeString("binary");
        $ic253$ = SubLObjectFactory.makeString("+arg1");
        $ic254$ = SubLObjectFactory.makeString("binary_frame_arg2");
        $ic255$ = SubLObjectFactory.makeString("arg2");
        $ic256$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic257$ = SubLObjectFactory.makeString("ternary");
        $ic258$ = SubLObjectFactory.makeString("+arg3");
        $ic259$ = SubLObjectFactory.makeString("binary_pred");
        $ic260$ = SubLObjectFactory.makeString("binary_arg1");
        $ic261$ = SubLObjectFactory.makeString("arg1");
        $ic262$ = SubLObjectFactory.makeString("binary_arg2");
        $ic263$ = SubLObjectFactory.makeString("ternary_pred");
        $ic264$ = SubLObjectFactory.makeString("ternary predicate");
        $ic265$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TernaryPredicate"));
        $ic266$ = SubLObjectFactory.makeString("ternary_arg1");
        $ic267$ = SubLObjectFactory.makeString("ternary_arg2");
        $ic268$ = SubLObjectFactory.makeString("ternary_arg3");
        $ic269$ = SubLObjectFactory.makeString("arg3");
        $ic270$ = SubLObjectFactory.makeString("+arg4");
        $ic271$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic272$ = SubLObjectFactory.makeSymbol("CB-HANDLE-GAF-ENTRY");
        $ic273$ = SubLObjectFactory.makeString(" did not specify a term");
        $ic274$ = SubLObjectFactory.makeString("Unexpected sentence entry method");
        $ic275$ = SubLObjectFactory.makeString("~A");
        $ic276$ = SubLObjectFactory.makeString("dim_");
        $ic277$ = SubLObjectFactory.makeInteger(10000);
        $ic278$ = SubLObjectFactory.makeString("setVisibility('");
        $ic279$ = SubLObjectFactory.makeString("','inline');setVisibility('");
        $ic280$ = SubLObjectFactory.makeString("','none');");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0670.class
	Total time: 8916 ms
	
	Decompiled with Procyon 0.5.32.
*/